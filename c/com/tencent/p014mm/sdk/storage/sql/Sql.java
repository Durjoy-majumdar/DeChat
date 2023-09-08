package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b6\u0018\u00002\u00020\u0001:\u0018\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql;", "", "()V", "BitAndEqual", "BitAndNotEqual", "BitOrEqual", "BitOrNotEqual", "ColumnEqual", "ColumnLargerThan", "ColumnNotEqual", "ColumnSmallerThan", "Equal", "In", "LargerEqual", "LargerThan", "Like", "MultiEqual", "MultiNotEqual", "NotEqual", "NotIn", "NotLike", "NotNull", "NotNullOrEmpty", "Null", "NullOrEmpty", "SmallerEqual", "SmallerThan", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.Sql */
public abstract class Sql {

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$BitAndEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnBitValueCondition;", "column", "", "bitValue", "", "compareValue", "(Ljava/lang/String;II)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$BitAndEqual */
    public static final class BitAndEqual extends ColumnBitValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BitAndEqual(String str, int i, int i2) {
            super(str, i, ISqlObj.ConditionBitOperation.And, i2, ISqlObj.ConditionOperation.Equal);
            C87412m.m108594g(str, "column");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$BitAndNotEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnBitValueCondition;", "column", "", "bitValue", "", "compareValue", "(Ljava/lang/String;II)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$BitAndNotEqual */
    public static final class BitAndNotEqual extends ColumnBitValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BitAndNotEqual(String str, int i, int i2) {
            super(str, i, ISqlObj.ConditionBitOperation.And, i2, ISqlObj.ConditionOperation.NotEqual);
            C87412m.m108594g(str, "column");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$BitOrEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnBitValueCondition;", "column", "", "bitValue", "", "compareValue", "(Ljava/lang/String;II)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$BitOrEqual */
    public static final class BitOrEqual extends ColumnBitValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BitOrEqual(String str, int i, int i2) {
            super(str, i, ISqlObj.ConditionBitOperation.Or, i2, ISqlObj.ConditionOperation.Equal);
            C87412m.m108594g(str, "column");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$BitOrNotEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnBitValueCondition;", "column", "", "bitValue", "", "compareValue", "(Ljava/lang/String;II)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$BitOrNotEqual */
    public static final class BitOrNotEqual extends ColumnBitValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BitOrNotEqual(String str, int i, int i2) {
            super(str, i, ISqlObj.ConditionBitOperation.Or, i2, ISqlObj.ConditionOperation.NotEqual);
            C87412m.m108594g(str, "column");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$ColumnEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnCompareCondition;", "column1", "", "column2", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$ColumnEqual */
    public static final class ColumnEqual extends ColumnCompareCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ColumnEqual(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.Equal);
            C87412m.m108594g(str, "column1");
            C87412m.m108594g(str2, "column2");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$ColumnLargerThan;", "Lcom/tencent/mm/sdk/storage/sql/ColumnCompareCondition;", "column1", "", "column2", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$ColumnLargerThan */
    public static final class ColumnLargerThan extends ColumnCompareCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ColumnLargerThan(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.LargerThan);
            C87412m.m108594g(str, "column1");
            C87412m.m108594g(str2, "column2");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$ColumnNotEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnCompareCondition;", "column1", "", "column2", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$ColumnNotEqual */
    public static final class ColumnNotEqual extends ColumnCompareCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ColumnNotEqual(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.NotEqual);
            C87412m.m108594g(str, "column1");
            C87412m.m108594g(str2, "column2");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$ColumnSmallerThan;", "Lcom/tencent/mm/sdk/storage/sql/ColumnCompareCondition;", "column1", "", "column2", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$ColumnSmallerThan */
    public static final class ColumnSmallerThan extends ColumnCompareCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ColumnSmallerThan(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.SmallerThan);
            C87412m.m108594g(str, "column1");
            C87412m.m108594g(str2, "column2");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$Equal;", "Lcom/tencent/mm/sdk/storage/sql/ColumnValueCondition;", "column", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$Equal */
    public static final class Equal extends ColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Equal(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.Equal);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "value");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$LargerEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnValueCondition;", "column", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$LargerEqual */
    public static final class LargerEqual extends ColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LargerEqual(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.LargerEqual);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "value");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$LargerThan;", "Lcom/tencent/mm/sdk/storage/sql/ColumnValueCondition;", "column", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$LargerThan */
    public static final class LargerThan extends ColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LargerThan(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.LargerThan);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "value");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005\"\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$MultiEqual;", "Lcom/tencent/mm/sdk/storage/sql/MultiColumnValueCondition;", "column", "", "values", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$MultiEqual */
    public static final class MultiEqual extends MultiColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiEqual(String str, String... strArr) {
            super(str, ISqlObj.ConditionOperation.Equal, (String[]) Arrays.copyOf(strArr, strArr.length));
            C87412m.m108594g(str, "column");
            C87412m.m108594g(strArr, "values");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005\"\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$MultiNotEqual;", "Lcom/tencent/mm/sdk/storage/sql/MultiColumnValueCondition;", "column", "", "values", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$MultiNotEqual */
    public static final class MultiNotEqual extends MultiColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiNotEqual(String str, String... strArr) {
            super(str, ISqlObj.ConditionOperation.NotEqual, (String[]) Arrays.copyOf(strArr, strArr.length));
            C87412m.m108594g(str, "column");
            C87412m.m108594g(strArr, "values");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$NotEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnValueCondition;", "column", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$NotEqual */
    public static final class NotEqual extends ColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotEqual(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.NotEqual);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "value");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$SmallerEqual;", "Lcom/tencent/mm/sdk/storage/sql/ColumnValueCondition;", "column", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$SmallerEqual */
    public static final class SmallerEqual extends ColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SmallerEqual(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.SmallerEqual);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "value");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$SmallerThan;", "Lcom/tencent/mm/sdk/storage/sql/ColumnValueCondition;", "column", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$SmallerThan */
    public static final class SmallerThan extends ColumnValueCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SmallerThan(String str, String str2) {
            super(str, str2, ISqlObj.ConditionOperation.SmallerThan);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "value");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$In;", "Lcom/tencent/mm/sdk/storage/sql/InCondition;", "column", "", "values", "", "(Ljava/lang/String;Ljava/util/List;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$In */
    public static final class C96916In extends InCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96916In(String str, List<String> list) {
            super(str, false, list);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(list, "values");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$Like;", "Lcom/tencent/mm/sdk/storage/sql/LikeCondition;", "column", "", "likeValue", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$Like */
    public static final class Like extends LikeCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Like(String str, String str2) {
            super(str, false, str2);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "likeValue");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$NotIn;", "Lcom/tencent/mm/sdk/storage/sql/InCondition;", "column", "", "values", "", "(Ljava/lang/String;Ljava/util/List;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$NotIn */
    public static final class NotIn extends InCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotIn(String str, List<String> list) {
            super(str, true, list);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(list, "values");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$NotLike;", "Lcom/tencent/mm/sdk/storage/sql/LikeCondition;", "column", "", "likeValue", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$NotLike */
    public static final class NotLike extends LikeCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotLike(String str, String str2) {
            super(str, true, str2);
            C87412m.m108594g(str, "column");
            C87412m.m108594g(str2, "likeValue");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$NotNull;", "Lcom/tencent/mm/sdk/storage/sql/NotNullCondition;", "column", "", "(Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$NotNull */
    public static final class NotNull extends NotNullCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotNull(String str) {
            super(str);
            C87412m.m108594g(str, "column");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$NotNullOrEmpty;", "Lcom/tencent/mm/sdk/storage/sql/NotNullOrEmptyCondition;", "column", "", "(Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$NotNullOrEmpty */
    public static final class NotNullOrEmpty extends NotNullOrEmptyCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotNullOrEmpty(String str) {
            super(str);
            C87412m.m108594g(str, "column");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$Null;", "Lcom/tencent/mm/sdk/storage/sql/NullCondition;", "column", "", "(Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$Null */
    public static final class Null extends NullCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Null(String str) {
            super(str);
            C87412m.m108594g(str, "column");
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Sql$NullOrEmpty;", "Lcom/tencent/mm/sdk/storage/sql/NullOrEmptyCondition;", "column", "", "(Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.Sql$NullOrEmpty */
    public static final class NullOrEmpty extends NullOrEmptyCondition {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NullOrEmpty(String str) {
            super(str);
            C87412m.m108594g(str, "column");
        }
    }

    private Sql() {
    }

    public /* synthetic */ Sql(C8480h hVar) {
        this();
    }
}
