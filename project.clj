(defproject my-stuff "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.apache.lucene/lucene-core "3.0.2"]
                 [clj-http "0.4.1"]]
  :profiles {:dev {:dependencies [[ring/ring-devel "1.2.0"]]}}
  :test-selectors {:default (complement :integration)
                  :integration :integration
                  :all (fn [_] true)}
  :main my.stuff
  :aot [my.stuff])