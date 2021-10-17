val dataSeq = Seq(("Java", 2000), ("Python", 100000), ("Scala", 2000))
val rdd = spark.sparkContext.parallelize(dataSeq)