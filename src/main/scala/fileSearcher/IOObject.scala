package fileSearcher

import java.io.File

/**
 * Created by SaberZA on 2016-03-02.
 */
trait IOObject {
  val file: File
  val name = file.getName()
}

case class DirectoryObject(file: File) extends IOObject {
  def children() =
    try
      file.listFiles().toList map (file => FileConverter convertToIOObject file)
    catch {
      case _: NullPointerException => List ()
    }
}

case class FileObject(file: File) extends IOObject

