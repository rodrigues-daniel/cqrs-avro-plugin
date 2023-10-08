package br.cqrs.avro;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "compile-class",defaultPhase = LifecyclePhase.COMPILE)
public class AvroCQRS extends AbstractMojo {

    @Parameter(defaultValue = "No Path Default")
    private String pathDefault;

    @Override
    public void execute() throws MojoExecutionException {
        getLog().info(pathDefault);
    }
}