(defproject aviary/aviary-watch "0.1.0-SNAPSHOT"
  :description "Aviary watch module (built with hawk)."
  :url "https://github.com/wkf/aviary"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure _]
                 [org.clojure/tools.namespace "0.2.9"]
                 [aviary/aviary-core _]
                 [hawk "0.1.1"]]
  :plugins [[lein-modules "0.3.10"]]
  :profiles {:dev
             {:dependencies [[commons-io "2.4"]]}})