package fileSearcher

/**
 * Created by SaberZA on 2016-03-02.
 */
class FilterChecker(filter: String) {
  def matches(content: String) = content contains filter

  def findMatchedFiles(IOObjects: List[IOObject]) =
    for (iOObject <- IOObjects
      if (iOObject.isInstanceOf[FileObject])
      if (matches(iOObject.name)))
    yield iOObject

}


object FilterChecker {
  def apply(filter: String) = new FilterChecker(filter)
}