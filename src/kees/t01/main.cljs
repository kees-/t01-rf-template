(ns kees.t01.main
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [kees.t01.rf :as rf :refer [<sub >evt >evt-now]]
   [kees.t01.views :as views]
   [kees.t01.config :as config]))

(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root)
    (rdom/render [views/main] root)))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn init []
  (>evt-now [::rf/boot])
  (dev-setup)
  (mount-root))
