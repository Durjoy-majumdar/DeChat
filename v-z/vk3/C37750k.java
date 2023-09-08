package vk3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C30757l4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import eb0.C97625j3;
import hk3.C76227e;
import java.util.List;
import u90.C37355b;

/* renamed from: vk3.k */
public class C37750k implements C78430l<C72963f4> {

    /* renamed from: a */
    public String f99988a;

    /* renamed from: b */
    public Cursor f99989b;

    /* renamed from: c */
    public int f99990c;

    /* renamed from: d */
    public int f99991d;

    /* renamed from: e */
    public long f99992e;

    /* renamed from: f */
    public long f99993f;

    /* renamed from: g */
    public boolean f99994g;

    public C37750k(String str, int i, int i2) {
        this.f99988a = str;
        this.f99990c = i;
        this.f99991d = i2;
    }

    public void close() {
        this.f99989b.close();
    }

    /* renamed from: p */
    public int mo61317p() {
        return this.f99991d;
    }

    /* renamed from: q */
    public void mo61318q(List<C72963f4> list) {
        try {
            this.f99989b.moveToFirst();
            while (!this.f99989b.isAfterLast()) {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(this.f99989b);
                list.add(f4Var);
                this.f99989b.moveToNext();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgDataSource", e, "", new Object[0]);
        }
    }

    /* renamed from: r */
    public void mo61319r(C76227e.C32942b bVar) {
        Cursor cursor;
        Cursor cursor2;
        int i;
        String str;
        Cursor cursor3;
        String str2 = "dz[getCursor] exception %s";
        String str3 = "MicroMsg.NotifyMessageRecordStorage";
        String str4 = "createTime";
        String str5 = "talker";
        if (!this.f99994g) {
            Log.m105919d("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgDataSource", "[ChattingSingleNotifyMsgDataSource] talker:%s count:%d mTotalCount:%d createTime:%d", this.f99988a, Integer.valueOf(this.f99990c), Integer.valueOf(this.f99991d), 0L);
            C37355b A = C97625j3.m125812b().mo105875A();
            String str6 = this.f99988a;
            int i2 = this.f99990c;
            C30757l4 l4Var = (C30757l4) A;
            l4Var.getClass();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM ( SELECT * FROM ");
                sb.append(StateEvent.Name.MESSAGE);
                sb.append(" AS ");
                sb.append("MESSAGE");
                sb.append(" INNER JOIN ");
                sb.append("NotifyMessageRecord");
                sb.append(" AS ");
                sb.append("NOTIFY_RECORD");
                sb.append(" ON ");
                sb.append("MESSAGE");
                sb.append(".");
                sb.append("msgId");
                sb.append(" = ");
                sb.append("NOTIFY_RECORD");
                sb.append(".");
                sb.append("msgId");
                sb.append(" WHERE ");
                sb.append("NOTIFY_RECORD");
                sb.append(".");
                sb.append(str5);
                sb.append(" = '");
                sb.append(Util.escapeSqlValue(str6));
                sb.append("'");
                sb.append("");
                sb.append(" ORDER BY ");
                sb.append("MESSAGE");
                sb.append(".");
                String str7 = str4;
                sb.append(str7);
                sb.append(" DESC LIMIT ");
                sb.append(i2);
                sb.append(") ORDER BY ");
                sb.append(str7);
                sb.append(" ASC");
                Cursor rawQuery = l4Var.f82707d.rawQuery(sb.toString(), (String[]) null);
                if (rawQuery != null) {
                    rawQuery.moveToFirst();
                    cursor3 = rawQuery;
                    this.f99989b = cursor3;
                }
            } catch (Exception e) {
                Log.m105929w(str3, str2, e.toString());
            }
            cursor3 = null;
            this.f99989b = cursor3;
        } else {
            String str8 = str2;
            String str9 = str3;
            String str10 = str5;
            String str11 = " WHERE ";
            String str12 = " = ";
            Log.m105919d("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgDataSource", "[ChattingSingleNotifyMsgDataSource for search] talker:%s mLastTopMsgCreateTime:%d mLastBottomMsgCreateTime:%d", this.f99988a, Long.valueOf(this.f99992e), Long.valueOf(this.f99993f));
            C37355b A2 = C97625j3.m125812b().mo105875A();
            String str13 = this.f99988a;
            long j = this.f99992e;
            long j2 = this.f99993f;
            C30757l4 l4Var2 = (C30757l4) A2;
            l4Var2.getClass();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("SELECT * FROM ( SELECT * FROM ");
            sb4.append(StateEvent.Name.MESSAGE);
            sb4.append(" AS ");
            sb4.append("MESSAGE");
            sb4.append(" INNER JOIN ");
            sb4.append("NotifyMessageRecord");
            sb4.append(" AS ");
            sb4.append("NOTIFY_RECORD");
            sb4.append(" ON ");
            sb4.append("MESSAGE");
            sb4.append(".");
            sb4.append("msgId");
            sb4.append(str12);
            sb4.append("NOTIFY_RECORD");
            sb4.append(".");
            sb4.append("msgId");
            sb4.append(str11);
            sb4.append("NOTIFY_RECORD");
            sb4.append(".");
            sb4.append(str5);
            sb4.append(" = '");
            sb4.append(Util.escapeSqlValue(str13));
            sb4.append("'");
            String str14 = "";
            if (j > 0) {
                try {
                    str = " AND MESSAGE.createTime >= " + j;
                } catch (Exception e2) {
                    e = e2;
                    i = 1;
                    cursor2 = null;
                    Object[] objArr = new Object[i];
                    objArr[0] = e.toString();
                    Log.m105929w(str9, str8, objArr);
                    cursor = cursor2;
                    this.f99989b = cursor;
                    bVar.next();
                }
            } else {
                str = str14;
            }
            try {
                sb4.append(str);
                if (j2 > 0) {
                    str14 = " AND MESSAGE.createTime <= " + j2;
                }
                sb4.append(str14);
                sb4.append(" ORDER BY ");
                sb4.append("MESSAGE");
                sb4.append(".");
                String str15 = str4;
                sb4.append(str15);
                sb4.append(" DESC ) ORDER BY ");
                sb4.append(str15);
                sb4.append(" ASC");
                ISQLiteDatabase iSQLiteDatabase = l4Var2.f82707d;
                cursor2 = null;
                try {
                    Cursor rawQuery2 = iSQLiteDatabase.rawQuery(sb4.toString(), (String[]) null);
                    if (rawQuery2 != null) {
                        rawQuery2.moveToFirst();
                        cursor = rawQuery2;
                        this.f99989b = cursor;
                    }
                } catch (Exception e3) {
                    e = e3;
                    i = 1;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = e.toString();
                    Log.m105929w(str9, str8, objArr2);
                    cursor = cursor2;
                    this.f99989b = cursor;
                    bVar.next();
                }
            } catch (Exception e4) {
                e = e4;
                cursor2 = null;
                i = 1;
                Object[] objArr22 = new Object[i];
                objArr22[0] = e.toString();
                Log.m105929w(str9, str8, objArr22);
                cursor = cursor2;
                this.f99989b = cursor;
                bVar.next();
            }
            cursor = cursor2;
            this.f99989b = cursor;
        }
        bVar.next();
    }

    /* renamed from: s */
    public long mo61320s() {
        return 0;
    }

    public C37750k(String str, long j, long j2, boolean z) {
        this.f99988a = str;
        this.f99992e = j;
        this.f99993f = j2;
        this.f99994g = z;
    }
}
