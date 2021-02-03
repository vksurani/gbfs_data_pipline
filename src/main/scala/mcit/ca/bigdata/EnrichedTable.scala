package mcit.ca.bigdata

class EnrichedTable {
  val enrichedStationInfo =
    """CREATE TABLE winter2020_vasu.enriched_station_information (
      |system_id                      STRING,
      |timezone                       STRING,
      |station_id                     STRING,
      |name                           STRING,
      |short_name                     STRING,
      |lat                            STRING,
      |lon                            STRING,
      |capacity                       INT
      |)
      |ROW FORMAT DELIMITED
      |FIELDS TERMINATED BY ','
      |STORED AS TEXTFILE
      |LOCATION '/user/winter2020/vasu/final_project/enriched_station_information'
      |TBLPROPERTIES (
      |"skip.header.line.count" = "1",
      |"serialization.null.format" = "") """.stripMargin

  println("enriched_station_information TABLE was CREATED")

}
