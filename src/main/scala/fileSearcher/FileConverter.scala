package fileSearcher

import java.io.File

/**
 * Created by SaberZA on 2016-03-02.
 */
object FileConverter {
  def convertToIOObject(file: File) =
    if (file.isDirectory()) DirectoryObject(file)
    else FileObject(file)
}
