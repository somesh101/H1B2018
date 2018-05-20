// ORM class for table 'AppData'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Mar 24 16:17:42 IST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class AppData extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.ID = (Integer)value;
      }
    });
    setters.put("State", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.State = (String)value;
      }
    });
    setters.put("City", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.City = (String)value;
      }
    });
    setters.put("Location", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.Location = (String)value;
      }
    });
    setters.put("PinCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.PinCode = (String)value;
      }
    });
    setters.put("Bank", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.Bank = (String)value;
      }
    });
    setters.put("Restaurant", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.Restaurant = (String)value;
      }
    });
    setters.put("Hospital", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.Hospital = (String)value;
      }
    });
    setters.put("ShoppingMall", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.ShoppingMall = (String)value;
      }
    });
    setters.put("School", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AppData.this.School = (String)value;
      }
    });
  }
  public AppData() {
    init0();
  }
  private Integer ID;
  public Integer get_ID() {
    return ID;
  }
  public void set_ID(Integer ID) {
    this.ID = ID;
  }
  public AppData with_ID(Integer ID) {
    this.ID = ID;
    return this;
  }
  private String State;
  public String get_State() {
    return State;
  }
  public void set_State(String State) {
    this.State = State;
  }
  public AppData with_State(String State) {
    this.State = State;
    return this;
  }
  private String City;
  public String get_City() {
    return City;
  }
  public void set_City(String City) {
    this.City = City;
  }
  public AppData with_City(String City) {
    this.City = City;
    return this;
  }
  private String Location;
  public String get_Location() {
    return Location;
  }
  public void set_Location(String Location) {
    this.Location = Location;
  }
  public AppData with_Location(String Location) {
    this.Location = Location;
    return this;
  }
  private String PinCode;
  public String get_PinCode() {
    return PinCode;
  }
  public void set_PinCode(String PinCode) {
    this.PinCode = PinCode;
  }
  public AppData with_PinCode(String PinCode) {
    this.PinCode = PinCode;
    return this;
  }
  private String Bank;
  public String get_Bank() {
    return Bank;
  }
  public void set_Bank(String Bank) {
    this.Bank = Bank;
  }
  public AppData with_Bank(String Bank) {
    this.Bank = Bank;
    return this;
  }
  private String Restaurant;
  public String get_Restaurant() {
    return Restaurant;
  }
  public void set_Restaurant(String Restaurant) {
    this.Restaurant = Restaurant;
  }
  public AppData with_Restaurant(String Restaurant) {
    this.Restaurant = Restaurant;
    return this;
  }
  private String Hospital;
  public String get_Hospital() {
    return Hospital;
  }
  public void set_Hospital(String Hospital) {
    this.Hospital = Hospital;
  }
  public AppData with_Hospital(String Hospital) {
    this.Hospital = Hospital;
    return this;
  }
  private String ShoppingMall;
  public String get_ShoppingMall() {
    return ShoppingMall;
  }
  public void set_ShoppingMall(String ShoppingMall) {
    this.ShoppingMall = ShoppingMall;
  }
  public AppData with_ShoppingMall(String ShoppingMall) {
    this.ShoppingMall = ShoppingMall;
    return this;
  }
  private String School;
  public String get_School() {
    return School;
  }
  public void set_School(String School) {
    this.School = School;
  }
  public AppData with_School(String School) {
    this.School = School;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AppData)) {
      return false;
    }
    AppData that = (AppData) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.State == null ? that.State == null : this.State.equals(that.State));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.Location == null ? that.Location == null : this.Location.equals(that.Location));
    equal = equal && (this.PinCode == null ? that.PinCode == null : this.PinCode.equals(that.PinCode));
    equal = equal && (this.Bank == null ? that.Bank == null : this.Bank.equals(that.Bank));
    equal = equal && (this.Restaurant == null ? that.Restaurant == null : this.Restaurant.equals(that.Restaurant));
    equal = equal && (this.Hospital == null ? that.Hospital == null : this.Hospital.equals(that.Hospital));
    equal = equal && (this.ShoppingMall == null ? that.ShoppingMall == null : this.ShoppingMall.equals(that.ShoppingMall));
    equal = equal && (this.School == null ? that.School == null : this.School.equals(that.School));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AppData)) {
      return false;
    }
    AppData that = (AppData) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.State == null ? that.State == null : this.State.equals(that.State));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.Location == null ? that.Location == null : this.Location.equals(that.Location));
    equal = equal && (this.PinCode == null ? that.PinCode == null : this.PinCode.equals(that.PinCode));
    equal = equal && (this.Bank == null ? that.Bank == null : this.Bank.equals(that.Bank));
    equal = equal && (this.Restaurant == null ? that.Restaurant == null : this.Restaurant.equals(that.Restaurant));
    equal = equal && (this.Hospital == null ? that.Hospital == null : this.Hospital.equals(that.Hospital));
    equal = equal && (this.ShoppingMall == null ? that.ShoppingMall == null : this.ShoppingMall.equals(that.ShoppingMall));
    equal = equal && (this.School == null ? that.School == null : this.School.equals(that.School));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.State = JdbcWritableBridge.readString(2, __dbResults);
    this.City = JdbcWritableBridge.readString(3, __dbResults);
    this.Location = JdbcWritableBridge.readString(4, __dbResults);
    this.PinCode = JdbcWritableBridge.readString(5, __dbResults);
    this.Bank = JdbcWritableBridge.readString(6, __dbResults);
    this.Restaurant = JdbcWritableBridge.readString(7, __dbResults);
    this.Hospital = JdbcWritableBridge.readString(8, __dbResults);
    this.ShoppingMall = JdbcWritableBridge.readString(9, __dbResults);
    this.School = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.State = JdbcWritableBridge.readString(2, __dbResults);
    this.City = JdbcWritableBridge.readString(3, __dbResults);
    this.Location = JdbcWritableBridge.readString(4, __dbResults);
    this.PinCode = JdbcWritableBridge.readString(5, __dbResults);
    this.Bank = JdbcWritableBridge.readString(6, __dbResults);
    this.Restaurant = JdbcWritableBridge.readString(7, __dbResults);
    this.Hospital = JdbcWritableBridge.readString(8, __dbResults);
    this.ShoppingMall = JdbcWritableBridge.readString(9, __dbResults);
    this.School = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(State, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(City, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Location, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PinCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Bank, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Restaurant, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Hospital, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShoppingMall, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(School, 10 + __off, 12, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(State, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(City, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Location, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PinCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Bank, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Restaurant, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Hospital, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ShoppingMall, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(School, 10 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.State = null;
    } else {
    this.State = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.City = null;
    } else {
    this.City = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Location = null;
    } else {
    this.Location = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PinCode = null;
    } else {
    this.PinCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Bank = null;
    } else {
    this.Bank = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Restaurant = null;
    } else {
    this.Restaurant = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Hospital = null;
    } else {
    this.Hospital = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ShoppingMall = null;
    } else {
    this.ShoppingMall = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.School = null;
    } else {
    this.School = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ID);
    }
    if (null == this.State) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, State);
    }
    if (null == this.City) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City);
    }
    if (null == this.Location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Location);
    }
    if (null == this.PinCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PinCode);
    }
    if (null == this.Bank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Bank);
    }
    if (null == this.Restaurant) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Restaurant);
    }
    if (null == this.Hospital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Hospital);
    }
    if (null == this.ShoppingMall) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShoppingMall);
    }
    if (null == this.School) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, School);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ID);
    }
    if (null == this.State) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, State);
    }
    if (null == this.City) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City);
    }
    if (null == this.Location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Location);
    }
    if (null == this.PinCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PinCode);
    }
    if (null == this.Bank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Bank);
    }
    if (null == this.Restaurant) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Restaurant);
    }
    if (null == this.Hospital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Hospital);
    }
    if (null == this.ShoppingMall) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ShoppingMall);
    }
    if (null == this.School) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, School);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(State==null?"null":State, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City==null?"null":City, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Location==null?"null":Location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PinCode==null?"null":PinCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Bank==null?"null":Bank, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Restaurant==null?"null":Restaurant, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Hospital==null?"null":Hospital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShoppingMall==null?"null":ShoppingMall, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(School==null?"null":School, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(State==null?"null":State, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City==null?"null":City, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Location==null?"null":Location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PinCode==null?"null":PinCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Bank==null?"null":Bank, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Restaurant==null?"null":Restaurant, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Hospital==null?"null":Hospital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShoppingMall==null?"null":ShoppingMall, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(School==null?"null":School, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.State = null; } else {
      this.State = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.City = null; } else {
      this.City = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Location = null; } else {
      this.Location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PinCode = null; } else {
      this.PinCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Bank = null; } else {
      this.Bank = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Restaurant = null; } else {
      this.Restaurant = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Hospital = null; } else {
      this.Hospital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShoppingMall = null; } else {
      this.ShoppingMall = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.School = null; } else {
      this.School = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.State = null; } else {
      this.State = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.City = null; } else {
      this.City = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Location = null; } else {
      this.Location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PinCode = null; } else {
      this.PinCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Bank = null; } else {
      this.Bank = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Restaurant = null; } else {
      this.Restaurant = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Hospital = null; } else {
      this.Hospital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ShoppingMall = null; } else {
      this.ShoppingMall = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.School = null; } else {
      this.School = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    AppData o = (AppData) super.clone();
    return o;
  }

  public void clone0(AppData o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("State", this.State);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("Location", this.Location);
    __sqoop$field_map.put("PinCode", this.PinCode);
    __sqoop$field_map.put("Bank", this.Bank);
    __sqoop$field_map.put("Restaurant", this.Restaurant);
    __sqoop$field_map.put("Hospital", this.Hospital);
    __sqoop$field_map.put("ShoppingMall", this.ShoppingMall);
    __sqoop$field_map.put("School", this.School);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("State", this.State);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("Location", this.Location);
    __sqoop$field_map.put("PinCode", this.PinCode);
    __sqoop$field_map.put("Bank", this.Bank);
    __sqoop$field_map.put("Restaurant", this.Restaurant);
    __sqoop$field_map.put("Hospital", this.Hospital);
    __sqoop$field_map.put("ShoppingMall", this.ShoppingMall);
    __sqoop$field_map.put("School", this.School);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
