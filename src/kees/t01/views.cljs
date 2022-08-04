(ns kees.t01.views
  (:require [kees.t01.rf :as rf :refer [<sub >evt]]))

(defn main []
  [:<>
   [:header
    [:h1 "A ready-to-use re-frame template"]
    [:hr]]
   [:main]
   [:footer]])
