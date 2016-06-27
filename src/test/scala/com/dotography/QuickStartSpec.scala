package com.example

/**
  * Created by Doto-Pong on 6/21/16.
  */


import org.specs2._
import org.specs2.mock._


class QuickStartSpec extends Specification {
  def is =
    s2"""

 This is a specification to check the 'Hello world' string

 The 'Hello world' string should
   contain 11 characters                                         $e1
   start with 'Hello'                                            $e2
   end with 'world'                                              $e3
                                                                 """


  def hello = Simple.hello()

  def e1 = hello must have size (11)

  def e2 = hello must startWith("Hello")

  def e3 = hello must endWith("world")
}
