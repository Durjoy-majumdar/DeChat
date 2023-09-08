package com.tencent.p014mm.plugin.game.model;

import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.game.model.b0 */
public class C42040b0 extends MAutoStorage<C42119w> {

    /* renamed from: d */
    public static final String[] f113272d = {"CREATE INDEX IF NOT EXISTS  ${TABLE}_MsgReappearIndex ON GameRawMessage ( reappearable,entranceExposure,isReadisHidden )"};

    /* renamed from: e */
    public static final String[] f113273e = {MAutoStorage.getCreateSQLs(C42119w.f113439o2, "GameRawMessage")};

    public C42040b0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C42119w.f113439o2, "GameRawMessage", f113272d);
    }

    /* renamed from: DN */
    public void mo65997DN() {
        String Yt = mo66003Yt(2, 5, 6, 10, 11, 100);
        execSQL("GameRawMessage", "update GameRawMessage set isRead=1 where isRead=0 and " + Yt + " and " + "isHidden" + " = " + 0);
    }

    /* renamed from: LL */
    public boolean mo65998LL(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgId in (");
        for (int i = 0; i < jArr.length; i++) {
            sb.append(jArr[i]);
            if (i != jArr.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return execSQL("GameRawMessage", String.format("update GameRawMessage set isRead=1 where %s", new Object[]{sb.toString()}));
    }

    /* renamed from: Lo */
    public boolean mo65999Lo(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgId in (");
        for (int i = 0; i < jArr.length; i++) {
            sb.append(jArr[i]);
            if (i != jArr.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return execSQL("GameRawMessage", String.format("delete from GameRawMessage where %s", new Object[]{sb.toString()}));
    }

    /* renamed from: Ow */
    public C42119w mo66000Ow(long j) {
        C42119w wVar = new C42119w();
        wVar.field_msgId = j;
        if (get(wVar, new String[0])) {
            return wVar;
        }
        return null;
    }

    /* renamed from: SE */
    public int mo66001SE(int i) {
        Cursor TE = mo66002TE(i);
        int i2 = 0;
        if (TE == null) {
            return 0;
        }
        if (TE.moveToFirst()) {
            i2 = TE.getInt(0);
        }
        TE.close();
        return i2;
    }

    /* renamed from: TE */
    public Cursor mo66002TE(int i) {
        return rawQuery("select * from GameRawMessage where showType = " + i + " and " + "showInMsgList" + " = " + 1 + " and " + "isHidden" + " = " + 0 + " order by isRead, createTime desc", new String[0]);
    }

    /* renamed from: Yt */
    public final String mo66003Yt(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return "1=1";
        }
        String str = "(";
        for (int i = 0; i < iArr.length - 1; i++) {
            str = str + "msgType=" + iArr[i] + " or ";
        }
        return (str + "msgType=" + iArr[iArr.length - 1]) + ")";
    }

    /* renamed from: bD */
    public C42119w mo66004bD(String str) {
        Cursor rawQuery = rawQuery("select * from GameRawMessage where gameMsgId = \"" + str + FastJsonResponse.QUOTE, new String[0]);
        if (rawQuery == null) {
            return null;
        }
        C42119w wVar = new C42119w();
        if (rawQuery.moveToFirst()) {
            wVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return wVar;
    }

    /* renamed from: bF */
    public Cursor mo66005bF(int i, int i2, int i3) {
        return rawQuery("select * from GameRawMessage where showType = " + i + " and " + "showInMsgList" + " = " + 1 + " and " + "isHidden" + " = " + 0 + " order by isRead, createTime desc limit " + i2 + ", " + i3, new String[0]);
    }

    /* renamed from: bO */
    public void mo66006bO(int i) {
        execSQL("GameRawMessage", "update GameRawMessage set isRead=1 where showType=" + i);
    }

    /* renamed from: jo */
    public void mo66007jo() {
        Log.m105925i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", Boolean.valueOf(execSQL("GameRawMessage", "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)")), "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)");
    }

    /* renamed from: kD */
    public int mo66008kD() {
        String Yt = mo66003Yt(2, 5, 6, 10, 11, 100);
        StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from GameRawMessage where ");
        sb.append(Yt);
        sb.append(" and ");
        sb.append("isRead");
        sb.append("=0 and ");
        sb.append("showInMsgList");
        sb.append(" = ");
        sb.append(1);
        sb.append(" and ");
        sb.append("isHidden");
        sb.append(" = ");
        int i = 0;
        sb.append(0);
        Cursor rawQuery = rawQuery(sb.toString(), new String[0]);
        if (rawQuery == null) {
            return 0;
        }
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: mI */
    public LinkedList<C42119w> mo66009mI(int i, long j, int i2, int i3) {
        String str;
        String str2;
        String str3;
        if (j == 0) {
            str = "9223372036854775807";
        } else {
            str = "" + j;
        }
        if (i2 == 0) {
            str2 = "(isRead=1 or isRead=0) ";
        } else if (i2 == 1) {
            str2 = "isRead=0 ";
        } else if (i2 != 2) {
            return null;
        } else {
            str2 = "isRead=1 ";
        }
        if (i != 65536) {
            str3 = "msgType=" + i + " and ";
        } else {
            str3 = "";
        }
        String format = String.format("select * from GameRawMessage where " + str3 + "msgId" + "<%s and " + str2 + "order by " + "createTime" + " desc limit %s", new Object[]{str, "" + i3});
        LinkedList<C42119w> linkedList = new LinkedList<>();
        Cursor rawQuery = rawQuery(format, new String[0]);
        if (rawQuery == null) {
            return linkedList;
        }
        if (rawQuery.moveToFirst()) {
            do {
                C42119w wVar = new C42119w();
                wVar.convertFrom(rawQuery);
                linkedList.add(wVar);
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        return linkedList;
    }

    /* renamed from: mL */
    public int mo66010mL(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from GameRawMessage where showType = ");
        sb.append(i);
        sb.append(" and ");
        sb.append("isRead");
        sb.append("=0 and ");
        sb.append("showInMsgList");
        sb.append(" = ");
        sb.append(1);
        sb.append(" and ");
        sb.append("isHidden");
        sb.append(" = ");
        int i2 = 0;
        sb.append(0);
        Cursor rawQuery = rawQuery(sb.toString(), new String[0]);
        if (rawQuery == null) {
            return 0;
        }
        if (rawQuery.moveToFirst()) {
            i2 = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i2;
    }

    /* renamed from: qq */
    public boolean mo66011qq(int i) {
        return execSQL("GameRawMessage", "delete from GameRawMessage where showType = " + i);
    }
}
