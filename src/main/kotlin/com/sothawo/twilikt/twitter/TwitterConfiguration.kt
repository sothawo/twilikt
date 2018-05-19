/*
 Copyright 2018 Peter-Josef Meisch (pj.meisch@sothawo.com)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.sothawo.twilikt.twitter

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */
@ConfigurationProperties("twitter")
class TwitterConfiguration {
    var oauthConsumerKey = "not set"
    var oauthConsumerSecret = "not set"
    var oauthAccessKey = "not set"
    var oauthAccessSecret = "not set"
    var user = "not set"

    override fun toString(): String {
        return "TwitterConfiguration(" +
                "oauthConsumerKey='$oauthConsumerKey'," +
                "oauthConsumerSecret='$oauthConsumerSecret'," +
                "oauthAccessKey='$oauthAccessKey'," +
                "oauthAccessSecret='$oauthAccessSecret'," +
                "user='$user'" +
                ")"
    }
}
