package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.Map;
import p749xh.C38651r6;
import p875ci.C67379u;
import u90.C37355b;
import u90.C37356d;

/* renamed from: com.tencent.mm.storage.l4 */
public class C30757l4 extends MAutoStorage<C37356d> implements C37355b {

    /* renamed from: e */
    public static final String[] f82705e = {MAutoStorage.getCreateSQLs(C37356d.f98772t, "NotifyMessageRecord")};

    /* renamed from: f */
    public static volatile boolean f82706f = false;

    /* renamed from: d */
    public ISQLiteDatabase f82707d;

    public C30757l4(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f82707d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public int mo57659Lo(String str, long j, long j2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM ");
        sb.append("NotifyMessageRecord");
        sb.append(" WHERE ");
        sb.append("talker");
        sb.append(" = '");
        sb.append(Util.escapeSqlValue(str));
        sb.append("'");
        String str3 = "";
        if (j > 0) {
            str2 = " AND createTime >= " + j;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (j2 > 0) {
            str3 = " AND createTime <= " + j2;
        }
        sb.append(str3);
        Cursor rawQuery = this.f82707d.rawQuery(sb.toString(), (String[]) null);
        int i = 0;
        if (rawQuery.moveToLast()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: Ow */
    public boolean mo57660Ow(C72963f4 f4Var, String str) {
        C37356d dVar = new C37356d();
        dVar.field_msgId = f4Var.getMsgId();
        dVar.field_talker = f4Var.mo108768t();
        dVar.field_createTime = f4Var.getCreateTime();
        dVar.field_digest = str;
        return super.insert(dVar);
    }

    /* renamed from: Yt */
    public String mo57661Yt(C72963f4 f4Var) {
        Map<String, String> parseXml = XmlParser.parseXml(f4Var.getContent(), "msg", (String) null);
        if (parseXml != null) {
            return Util.nullAsNil(parseXml.get(".msg.fromusername"));
        }
        Log.m105924i("MicroMsg.NotifyMessageRecordStorage", "not template message, can't find username field from content");
        return null;
    }

    /* renamed from: bD */
    public C38651r6 mo57662bD(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105924i("MicroMsg.NotifyMessageRecordStorage", "translate origin msgInfo to target record, origin msgInfo is null");
            return null;
        } else if (Util.isNullOrNil(f4Var.mo108768t())) {
            Log.m105924i("MicroMsg.NotifyMessageRecordStorage", "talker is null");
            return null;
        } else {
            String Yt = mo57661Yt(f4Var);
            if (Util.isNullOrNil(Yt)) {
                Log.m105924i("MicroMsg.NotifyMessageRecordStorage", "username is null or nil");
            }
            C37356d dVar = new C37356d();
            dVar.field_msgId = f4Var.getMsgId();
            dVar.field_createTime = f4Var.getCreateTime();
            dVar.field_talker = Yt;
            dVar.field_digest = C67379u.m79740d(f4Var, new PString(), new PString(), new PInt(), false);
            return dVar;
        }
    }

    /* renamed from: jo */
    public boolean mo57663jo(C72963f4 f4Var) {
        C37356d dVar = new C37356d();
        dVar.field_msgId = f4Var.getMsgId();
        return super.delete(dVar, new String[0]);
    }

    /* renamed from: kD */
    public boolean mo57664kD(C72963f4 f4Var, String str) {
        C37356d dVar = new C37356d();
        dVar.field_msgId = f4Var.getMsgId();
        dVar.field_talker = f4Var.mo108768t();
        dVar.field_createTime = f4Var.getCreateTime();
        dVar.field_digest = str;
        return super.update(dVar, new String[0]);
    }

    /* renamed from: qq */
    public Cursor mo57665qq(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT ");
            sb.append("WX_CONTACT");
            sb.append(".");
            sb.append("nickname");
            sb.append(", ");
            sb.append("NOTIFY_RECORD");
            sb.append(".");
            sb.append("talker");
            sb.append(", ");
            sb.append("COUNT(");
            sb.append("NOTIFY_RECORD");
            sb.append(".");
            sb.append("msgId");
            sb.append(")");
            sb.append(" FROM ");
            sb.append("NotifyMessageRecord");
            sb.append(" AS ");
            sb.append("NOTIFY_RECORD");
            sb.append(" LEFT JOIN ");
            sb.append("rcontact");
            sb.append(" AS ");
            sb.append("WX_CONTACT");
            sb.append(" ON ");
            sb.append("NOTIFY_RECORD");
            sb.append(".");
            sb.append("talker");
            sb.append(" = ");
            sb.append("WX_CONTACT");
            sb.append(".");
            sb.append("username");
            sb.append(" WHERE ");
            sb.append("NOTIFY_RECORD");
            sb.append(".");
            sb.append("talker");
            sb.append(" != '");
            sb.append("notifymessage");
            sb.append("'");
            if (!Util.isNullOrNil(str)) {
                sb.append(" AND ");
                sb.append("WX_CONTACT");
                sb.append(".");
                sb.append("nickname");
                sb.append(" LIKE '%");
                sb.append(str);
                sb.append("%'");
            }
            sb.append(" GROUP BY ");
            sb.append("NOTIFY_RECORD");
            sb.append(".");
            sb.append("talker");
            Cursor rawQuery = this.f82707d.rawQuery(sb.toString(), (String[]) null);
            if (rawQuery != null) {
                rawQuery.moveToFirst();
                return rawQuery;
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.NotifyMessageRecordStorage", "dz[getCursor] exception %s", e.toString());
        }
        return null;
    }
}
