This small project demonstrates a sub-optimal side-effect of the way the play currently does reverse routing -- any changes to a controller triggers recompilation of:

  * The controller class itself
  * The reverse router (if the controller was referenced in conf/routes)
  * Every class in the app that uses the reverse router

This has grown to be a problem in our organization because of the sheer number of files involved in the third bullet point, and associated compile time.

To see the classes that are compiled due to an edit, issue the following commands after making the edits:

`> sbt compile | grep '\[wrote'`