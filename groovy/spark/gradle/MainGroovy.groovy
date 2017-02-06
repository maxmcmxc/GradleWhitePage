package spark.gradle

import static spark.Spark.*

import grails.rest.*


//GRAILS with Sparkjava ?
//@Resource(uri='/books')
//class MainGroovy {
//
//}

get '/hello', { req, res -> "Hello Groovy"}

