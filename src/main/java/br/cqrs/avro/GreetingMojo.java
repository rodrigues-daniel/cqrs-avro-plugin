package br.cqrs.avro;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "print",defaultPhase = LifecyclePhase.COMPILE)
public class GreetingMojo extends AbstractMojo {

    @Parameter(defaultValue = "Hello, World!")
    private String message;

    @Override
    public void execute() throws MojoExecutionException {
       getLog().info(message);
    }

}