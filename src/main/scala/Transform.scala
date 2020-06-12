import com.databricks.dbutils_v1.DBUtilsHolder.dbutils
import com.databricks.dbutils_v1.{DbfsUtils, MetaUtils, NotebookUtils, Preview, SecretUtils, WidgetsUtils}
import org.apache.spark.sql.SparkSession

object Transform {
  def main(args:Array[String]): Unit = {
    println("hello big data")
    val spark : SparkSession = SparkSession.builder
      .appName("SpartTransform")
      .master("local[2]")
      .getOrCreate()
    val containerName = "level1"
    val storageAccountName = "bahuystorageaccount"
    val fileName = "userdata1.parquet"
    val accessKey = "<access key>"
    spark.sparkContext.hadoopConfiguration.set("fs.azure", "org.apache.hadoop.fs.azure.NativeAzureFileSystem")
    spark.sparkContext.hadoopConfiguration.set("fs.azure.account.key." + storageAccountName + ".blob.core.windows.net", accessKey)

    val inputFilePath = "wasbs://" + containerName + "@" + storageAccountName + ".blob.core.windows.net/" + fileName


    //Read parquet file
    val parquetFileDF = spark.read.parquet(inputFilePath)
    //parquetFileDF.show()

    //Validate



  }
}
