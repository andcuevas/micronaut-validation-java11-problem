## Result compiling the project with Maven:

``
Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.7.0:compile (default-compile) on project micronaut-annotation-java11: Fatal error compiling: java.lang.IllegalArgumentException: No enum constant io.micronaut.annotation.processing.visitor.JavaPrimitiveElement.@JAVAX.VALIDATION.CONSTRAINTS.MIN(1L),@JAVAX.VALIDATION.CONSTRAINTS.MAX(20L) INT -> [Help 1]
``

## What is causing the problem?

In the ExampleController class the line 

``
@Get("/{?b}")
``

If the ``?`` sign is deleted the project compiles without problems.
