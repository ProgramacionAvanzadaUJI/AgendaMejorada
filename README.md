#AgendaMejorable

Código fuente de una agenda muy sencilla, y muy mal programada.

Intenta mejorar el código utilizando todos los recursos que hemos visto en teoría:

1. Sobrecarga.
1. Polimorfismo (interfaces, herencia).
1. Principios SOLID.

En el fichero de construcción del proyecto (pom.xml), tienes un ejemplo de uso del plug-in **maven-assembly-plugin** para empaquetar tu proyecto junto con sus dependencias:

 <!--Empaqueta código y bibliotecas en un único jar-->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-assembly-plugin</artifactId>
                <version>2.3</version>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>single</goal>
                        </goals>
                        <configuration>
                            <archive>
                                <manifest>
                                    <mainClass>main.Main</mainClass>
                                </manifest>
                            </archive>
                            <descriptorRefs>
                                <descriptorRef>jar-with-dependencies</descriptorRef>
                            </descriptorRefs>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            
 Para un nuevo proyecto, lo que debes modificar es el contenido del elemento <mainClass></mainClass>, que debe ser el nombre de la clase que contiene el método **main(...)** precedido del paquete donde se encuentre la clase.
