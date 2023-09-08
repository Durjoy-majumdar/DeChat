package com.tencent.p014mm.sdk.storage.sql;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nJ\u0015\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ISqlObj;", "", "params", "", "", "()[Ljava/lang/String;", "toSql", "ConditionBitOperation", "ConditionConnectOperation", "ConditionOperation", "TableJoinOperation", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.ISqlObj */
public interface ISqlObj {

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionBitOperation;", "", "opName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getOpName", "()Ljava/lang/String;", "toString", "And", "Or", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.ISqlObj$ConditionBitOperation */
    public enum ConditionBitOperation {
        And("&"),
        Or("|");
        
        private final String opName;

        private ConditionBitOperation(String str) {
            this.opName = str;
        }

        public final String getOpName() {
            return this.opName;
        }

        public String toString() {
            return this.opName;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;", "", "opName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getOpName", "()Ljava/lang/String;", "toString", "Equal", "NotEqual", "LargerThan", "SmallerThan", "LargerEqual", "SmallerEqual", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.ISqlObj$ConditionOperation */
    public enum ConditionOperation {
        Equal("="),
        NotEqual("<>"),
        LargerThan(">"),
        SmallerThan("<"),
        LargerEqual(">="),
        SmallerEqual("<=");
        
        private final String opName;

        private ConditionOperation(String str) {
            this.opName = str;
        }

        public final String getOpName() {
            return this.opName;
        }

        public String toString() {
            return this.opName;
        }
    }

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.ISqlObj$DefaultImpls */
    public static final class DefaultImpls {
        public static String[] params(ISqlObj iSqlObj) {
            return null;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ISqlObj$TableJoinOperation;", "", "(Ljava/lang/String;I)V", "InnerJoin", "LeftJoin", "RightJoin", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.ISqlObj$TableJoinOperation */
    public enum TableJoinOperation {
        InnerJoin,
        LeftJoin,
        RightJoin
    }

    @Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionConnectOperation;", "", "(Ljava/lang/String;I)V", "AND", "OR", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.ISqlObj$ConditionConnectOperation */
    public enum ConditionConnectOperation {
        AND,
        OR
    }

    String[] params();

    String toSql();
}
