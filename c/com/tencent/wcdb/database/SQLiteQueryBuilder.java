package com.tencent.wcdb.database;

import android.text.TextUtils;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class SQLiteQueryBuilder {
    private static final String TAG = "WCDB.SQLiteQueryBuilder";
    private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private boolean mDistinct = false;
    private SQLiteDatabase.CursorFactory mFactory = null;
    private Map<String, String> mProjectionMap = null;
    private boolean mStrict;
    private String mTables = "";
    private StringBuilder mWhereClause = null;

    private static void appendClause(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }

    public static void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str != null) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append(' ');
    }

    public static String buildQueryString(boolean z, String str, String[] strArr, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        } else if (TextUtils.isEmpty(str6) || sLimitPattern.matcher(str6).matches()) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("SELECT ");
            if (z) {
                sb.append("DISTINCT ");
            }
            if (strArr == null || strArr.length == 0) {
                sb.append("* ");
            } else {
                appendColumns(sb, strArr);
            }
            sb.append("FROM ");
            sb.append(str);
            appendClause(sb, " WHERE ", str2);
            appendClause(sb, " GROUP BY ", str3);
            appendClause(sb, " HAVING ", str4);
            appendClause(sb, " ORDER BY ", str5);
            appendClause(sb, " LIMIT ", str6);
            return sb.toString();
        } else {
            throw new IllegalArgumentException("invalid LIMIT clauses:" + str6);
        }
    }

    private String[] computeProjection(String[] strArr) {
        int i = 0;
        if (strArr == null || strArr.length <= 0) {
            Map<String, String> map = this.mProjectionMap;
            if (map == null) {
                return null;
            }
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            String[] strArr2 = new String[entrySet.size()];
            for (Map.Entry next : entrySet) {
                if (!((String) next.getKey()).equals(XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_COUNT)) {
                    strArr2[i] = (String) next.getValue();
                    i++;
                }
            }
            return strArr2;
        } else if (this.mProjectionMap == null) {
            return strArr;
        } else {
            String[] strArr3 = new String[strArr.length];
            int length = strArr.length;
            while (i < length) {
                String str = strArr[i];
                String str2 = this.mProjectionMap.get(str);
                if (str2 != null) {
                    strArr3[i] = str2;
                } else if (this.mStrict || (!str.contains(" AS ") && !str.contains(" as "))) {
                    throw new IllegalArgumentException("Invalid column " + strArr[i]);
                } else {
                    strArr3[i] = str;
                }
                i++;
            }
            return strArr3;
        }
    }

    private void validateQuerySql(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        sQLiteDatabase.getThreadSession().prepare(str, sQLiteDatabase.getThreadDefaultConnectionFlags(true), cancellationSignal, (SQLiteStatementInfo) null);
    }

    public void appendWhere(CharSequence charSequence) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new StringBuilder(charSequence.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        this.mWhereClause.append(charSequence);
    }

    public void appendWhereEscapeString(String str) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new StringBuilder(str.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        DatabaseUtils.appendEscapedSQLString(this.mWhereClause, str);
    }

    public String buildQuery(String[] strArr, String str, String str2, String str3, String str4, String str5) {
        String[] computeProjection = computeProjection(strArr);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = this.mWhereClause;
        boolean z = sb4 != null && sb4.length() > 0;
        if (z) {
            sb.append(this.mWhereClause.toString());
            sb.append(')');
        }
        if (str != null && str.length() > 0) {
            if (z) {
                sb.append(" AND ");
            }
            sb.append('(');
            sb.append(str);
            sb.append(')');
        }
        return buildQueryString(this.mDistinct, this.mTables, computeProjection, sb.toString(), str2, str3, str4, str5);
    }

    public String buildUnionQuery(String[] strArr, String str, String str2) {
        StringBuilder sb = new StringBuilder(128);
        int length = strArr.length;
        String str3 = this.mDistinct ? " UNION " : " UNION ALL ";
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(str3);
            }
            sb.append(strArr[i]);
        }
        appendClause(sb, " ORDER BY ", str);
        appendClause(sb, " LIMIT ", str2);
        return sb.toString();
    }

    public String buildUnionSubQuery(String str, String[] strArr, Set<String> set, int i, String str2, String str3, String str4, String str5) {
        String str6 = str;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        String[] strArr3 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str7 = strArr2[i2];
            if (str7.equals(str)) {
                strArr3[i2] = "'" + str2 + "' AS " + str;
                Set<String> set2 = set;
                int i3 = i;
            } else {
                String str8 = str2;
                Set<String> set3 = set;
                if (i2 <= i || set.contains(str7)) {
                    strArr3[i2] = str7;
                } else {
                    strArr3[i2] = "NULL AS " + str7;
                }
            }
        }
        return buildQuery(strArr3, str3, str4, str5, (String) null, (String) null);
    }

    public String getTables() {
        return this.mTables;
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, (String) null, (CancellationSignal) null);
    }

    public void setCursorFactory(SQLiteDatabase.CursorFactory cursorFactory) {
        this.mFactory = cursorFactory;
    }

    public void setDistinct(boolean z) {
        this.mDistinct = z;
    }

    public void setProjectionMap(Map<String, String> map) {
        this.mProjectionMap = map;
    }

    public void setStrict(boolean z) {
        this.mStrict = z;
    }

    public void setTables(String str) {
        this.mTables = str;
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, str5, (CancellationSignal) null);
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, CancellationSignal cancellationSignal) {
        String str6 = str;
        if (this.mTables == null) {
            return null;
        }
        if (!this.mStrict || str6 == null || str.length() <= 0) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            CancellationSignal cancellationSignal2 = cancellationSignal;
        } else {
            SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            validateQuerySql(sQLiteDatabase, buildQuery(strArr, "(" + str + ")", str2, str3, str4, str5), cancellationSignal);
        }
        String buildQuery = buildQuery(strArr, str, str2, str3, str4, str5);
        Log.m164291d(TAG, "Performing query: " + buildQuery);
        return sQLiteDatabase.rawQueryWithFactory(this.mFactory, buildQuery, strArr2, SQLiteDatabase.findEditTable(this.mTables), cancellationSignal);
    }

    @Deprecated
    public String buildUnionSubQuery(String str, String[] strArr, Set<String> set, int i, String str2, String str3, String[] strArr2, String str4, String str5) {
        return buildUnionSubQuery(str, strArr, set, i, str2, str3, str4, str5);
    }

    @Deprecated
    public String buildQuery(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        return buildQuery(strArr, str, str2, str3, str4, str5);
    }
}
