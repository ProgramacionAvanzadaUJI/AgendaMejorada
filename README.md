#AgendaMejorada

Agenda mejor programada

1. Se ha aplicado herencia
1. Se ha desacoplado la entrada de la salida.
1. Se ha aplicado el patrón de diseño __Strategy__ para eliminar el switch de filtrado de la opción a ejecutar.

En el fichero de construcción del proyecto (pom.xml), tienes un ejemplo de uso del plug-in **maven-assembly-plugin** para empaquetar tu proyecto junto con sus dependencias:

```xml
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
```


Para un nuevo proyecto, lo que debes modificar es el contenido del elemento 
```xml
<mainClass></mainClass>
```
que debe ser el nombre de la clase que contiene el método **main(...)** precedido del paquete donde se encuentre la clase.

Para empaquetar:
**mvn package**
El fichero con extensión .jar se creará en el directorio target.
Para ejecutar:
**java -jar NombreFicheroJar.jar**
