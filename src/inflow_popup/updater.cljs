
(ns inflow-popup.updater (:require [respo.cursor :refer [update-states]]))

(defn updater [store op op-data op-id op-time]
  (case op :states (update-states store op-data) store))
