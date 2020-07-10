(defproject github-amazon-bot "0.1.0-SNAPSHOT"
  :description "Bot to check iPad availability"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 [org.clojure/clojure "1.10.1"]
                 [morse "0.4.3"]
                 [clj-http "3.10.1"]
                 [environ "1.2.0"]
                 [cheshire "5.10.0"]]
  :main ^:skip-aot github-amazon-bot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
