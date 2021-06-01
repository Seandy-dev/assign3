/*Table.java
Entity for the table
Author: Emihle Menzo 218337035
Date:  1 June 2021
 */
package za.ac.cput.entity.coffeeshop;

public class Table {
    private String tableType;
    private int tableCapacity;
    private String tableLocation;
    private String tableStatus;

    private Table(Table.Builder builder) {
        this.tableType = builder.tableType;
        this.tableCapacity = builder.tableCapacity;
        this.tableLocation = builder.tableLocation;
        this.tableStatus = builder.tableStatus;


    }

    @Override
    public String toString() {
        return "Table{" +
                "tableType='" + tableType + '\'' +
                ", tableCapacity='" + tableCapacity + '\'' +
                ", tableLocation='" + tableLocation + '\'' +
                ", tableStatus='" + tableStatus + '\'' +
                '}';
    }

    public static class Builder {
        private String tableType;
        private int tableCapacity;
        private String tableLocation;
        private String tableStatus;

        public Builder seTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        public Builder setTableCapacity(int tableCapacity) {
            this.tableCapacity = tableCapacity;
            return this;
        }

        public Builder setTableLocation(String tableLocation) {
            this.tableLocation = tableLocation;
            return this;
        }

        public Builder settableStatus(String tableStatus) {
            this.tableStatus = tableStatus;
            return this;
        }

        public Builder copy(Table Table) {
            this.tableType = Table.tableType;
            this.tableCapacity = Table.tableCapacity;
            this.tableLocation = Table.tableLocation;
            return this;
        }

        public Table build() {

            return new Table(this);
        }
    }
}