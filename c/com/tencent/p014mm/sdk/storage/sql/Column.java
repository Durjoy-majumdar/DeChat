package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;

@Metadata(mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u0014\u0010\u001f\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!J\u0014\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030!J\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010%\u001a\u00020\u001aJ\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u001cJ\u0006\u0010\u0011\u001a\u00020\u001cJ\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u0014\u0010+\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!J\u0014\u0010,\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030!J\u000e\u0010-\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u000e\u00101\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u00101\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u00101\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u00102\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u00102\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u00102\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u00103\u001a\u00020\u001cJ\b\u00104\u001a\u00020\u0003H\u0016J\b\u00105\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u00066"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Column;", "Lcom/tencent/mm/sdk/storage/sql/ISqlColumn;", "name", "", "dataType", "tableName", "referTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataType", "()Ljava/lang/String;", "getName", "getReferTo", "getTableName", "between", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "max", "", "min", "maxInclude", "", "minInclude", "bitAndEqual", "bitValue", "", "compareValue", "bitAndNotEqual", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "count", "Lcom/tencent/mm/sdk/storage/sql/FunctionColumn;", "equal", "value", "inNumber", "numberList", "", "inString", "strList", "isNotNullOrEmpty", "isNull", "isNullOrEmpty", "largerEqual", "largerThan", "like", "notEqual", "notInNumber", "notInString", "notLike", "orderDesc", "Lcom/tencent/mm/sdk/storage/sql/ISqlOrder;", "orderInc", "smallerEqual", "smallerThan", "sum", "tableColumnName", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.Column */
public class Column implements ISqlColumn {
    private final String dataType;
    private final String name;
    private final String referTo;
    private final String tableName;

    public Column(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "dataType");
        C87412m.m108594g(str3, "tableName");
        C87412m.m108594g(str4, "referTo");
        this.name = str;
        this.dataType = str2;
        this.tableName = str3;
        this.referTo = str4;
    }

    public static /* synthetic */ ISqlCondition between$default(Column column, Number number, Number number2, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return column.between(number, number2, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: between");
    }

    public final ISqlCondition between(Number number, Number number2, boolean z, boolean z2) {
        C87412m.m108594g(number, "max");
        C87412m.m108594g(number2, "min");
        return (z ? new Sql.SmallerEqual(tableColumnName(), number.toString()) : new Sql.SmallerThan(tableColumnName(), number.toString())).and(z2 ? new Sql.LargerEqual(tableColumnName(), number2.toString()) : new Sql.LargerThan(tableColumnName(), number2.toString()));
    }

    public final ISqlCondition bitAndEqual(int i, int i2) {
        return i2 != 0 ? new Sql.LargerEqual(tableColumnName(), String.valueOf(i2)).mo81855or(new Sql.SmallerEqual(tableColumnName(), String.valueOf(0 - i2))).and(new Sql.BitAndEqual(tableColumnName(), i, i2)) : new Sql.BitAndEqual(tableColumnName(), i, i2);
    }

    public final SingleCondition bitAndNotEqual(int i, int i2) {
        return new Sql.BitAndNotEqual(tableColumnName(), i, i2);
    }

    public final FunctionColumn count() {
        return new FunctionColumn(this.name, this.dataType, this.tableName, this.referTo, "count");
    }

    public final SingleCondition equal(Number number) {
        C87412m.m108594g(number, "value");
        return new Sql.Equal(tableColumnName(), number.toString());
    }

    public final String getDataType() {
        return this.dataType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReferTo() {
        return this.referTo;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public final SingleCondition inNumber(List<? extends Number> list) {
        C87412m.m108594g(list, "numberList");
        String tableColumnName = tableColumnName();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (Number obj : list) {
            arrayList.add(obj.toString());
        }
        return new Sql.C96916In(tableColumnName, arrayList);
    }

    public final SingleCondition inString(List<String> list) {
        C87412m.m108594g(list, "strList");
        return new Sql.C96916In(tableColumnName(), list);
    }

    public final SingleCondition isNotNullOrEmpty() {
        return new Sql.NotNullOrEmpty(tableColumnName());
    }

    public final SingleCondition isNull() {
        return new Sql.Null(tableColumnName());
    }

    public final SingleCondition isNullOrEmpty() {
        return new Sql.NullOrEmpty(tableColumnName());
    }

    public final SingleCondition largerEqual(Number number) {
        C87412m.m108594g(number, "value");
        return new Sql.LargerEqual(tableColumnName(), number.toString());
    }

    public final SingleCondition largerThan(Number number) {
        C87412m.m108594g(number, "value");
        return new Sql.LargerThan(tableColumnName(), number.toString());
    }

    public final SingleCondition like(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.Like(tableColumnName(), str);
    }

    public final FunctionColumn max() {
        return new FunctionColumn(this.name, this.dataType, this.tableName, this.referTo, "max");
    }

    public final FunctionColumn min() {
        return new FunctionColumn(this.name, this.dataType, this.tableName, this.referTo, "min");
    }

    public final SingleCondition notEqual(Number number) {
        C87412m.m108594g(number, "value");
        return new Sql.NotEqual(tableColumnName(), number.toString());
    }

    public final SingleCondition notInNumber(List<? extends Number> list) {
        C87412m.m108594g(list, "numberList");
        String tableColumnName = tableColumnName();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (Number obj : list) {
            arrayList.add(obj.toString());
        }
        return new Sql.NotIn(tableColumnName, arrayList);
    }

    public final SingleCondition notInString(List<String> list) {
        C87412m.m108594g(list, "numberList");
        return new Sql.NotIn(tableColumnName(), list);
    }

    public final SingleCondition notLike(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.NotLike(tableColumnName(), str);
    }

    public final ISqlOrder orderDesc() {
        return new ColumnOrder(tableColumnName(), false);
    }

    public final ISqlOrder orderInc() {
        return new ColumnOrder(tableColumnName(), true);
    }

    public String[] params() {
        return ISqlColumn.DefaultImpls.params(this);
    }

    public final SingleCondition smallerEqual(Number number) {
        C87412m.m108594g(number, "value");
        return new Sql.SmallerEqual(tableColumnName(), number.toString());
    }

    public final SingleCondition smallerThan(Number number) {
        C87412m.m108594g(number, "value");
        return new Sql.SmallerThan(tableColumnName(), number.toString());
    }

    public final FunctionColumn sum() {
        return new FunctionColumn(this.name, this.dataType, this.tableName, this.referTo, "sum");
    }

    public String tableColumnName() {
        return this.tableName + '.' + this.name;
    }

    public String toSql() {
        return tableColumnName();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Column(String str, String str2, String str3, String str4, int i, C8480h hVar) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }

    public final SingleCondition equal(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.Equal(tableColumnName(), str);
    }

    public final SingleCondition largerEqual(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.LargerEqual(tableColumnName(), str);
    }

    public final SingleCondition largerThan(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.LargerThan(tableColumnName(), str);
    }

    public final SingleCondition notEqual(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.NotEqual(tableColumnName(), str);
    }

    public final SingleCondition smallerEqual(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.SmallerEqual(tableColumnName(), str);
    }

    public final SingleCondition smallerThan(String str) {
        C87412m.m108594g(str, "value");
        return new Sql.SmallerThan(tableColumnName(), str);
    }

    public final SingleCondition equal(Column column) {
        C87412m.m108594g(column, "value");
        return new Sql.ColumnEqual(tableColumnName(), column.tableColumnName());
    }

    public final SingleCondition largerEqual(Column column) {
        C87412m.m108594g(column, "value");
        return new Sql.LargerEqual(tableColumnName(), column.tableColumnName());
    }

    public final SingleCondition largerThan(Column column) {
        C87412m.m108594g(column, "value");
        return new Sql.ColumnLargerThan(tableColumnName(), column.tableColumnName());
    }

    public final SingleCondition notEqual(Column column) {
        C87412m.m108594g(column, "value");
        return new Sql.ColumnNotEqual(tableColumnName(), column.tableColumnName());
    }

    public final SingleCondition smallerEqual(Column column) {
        C87412m.m108594g(column, "value");
        return new Sql.SmallerEqual(tableColumnName(), column.tableColumnName());
    }

    public final SingleCondition smallerThan(Column column) {
        C87412m.m108594g(column, "value");
        return new Sql.ColumnSmallerThan(tableColumnName(), column.tableColumnName());
    }
}
