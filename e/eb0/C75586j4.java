package eb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import zh3.C91753f;

/* renamed from: eb0.j4 */
public class C75586j4 extends MStorage {

    /* renamed from: e */
    public static final String[] f222061e = {"CREATE TABLE IF NOT EXISTS readerappnews1 ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE TABLE IF NOT EXISTS readerappweibo ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappnews1 ( time )", "CREATE INDEX IF NOT EXISTS  readerappfunctionId ON readerappnews1 ( reserved3 )", "CREATE INDEX IF NOT EXISTS readerappweiboreaderapptime ON readerappweibo ( time )"};

    /* renamed from: f */
    public static boolean f222062f = false;

    /* renamed from: d */
    public C91753f f222063d;

    public C75586j4(C91753f fVar) {
        this.f222063d = fVar;
    }

    /* renamed from: bD */
    public static String m90726bD(String str) {
        return "select tweetid,time,type,name,title,url,shorturl,longurl,pubtime,sourcename,sourceicon,istop,cover,digest,reserved1,reserved2,reserved3,reserved4 from " + str + "  ";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo105928Lo(java.lang.String r12, int r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            zh3.f r0 = r11.f222063d
            java.lang.String r1 = r11.mo105933kD(r13)
            java.lang.String r2 = "*"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]
            r10 = 0
            r4[r10] = r12
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 2
            java.lang.String r3 = "reserved3=?"
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = "MicroMsg.ReaderAppInfoStorage"
            r2 = 0
            if (r0 == 0) goto L_0x0056
            boolean r3 = r0.moveToFirst()     // Catch:{ Exception -> 0x0043 }
            if (r3 == 0) goto L_0x0056
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0043 }
            r3.<init>()     // Catch:{ Exception -> 0x0043 }
        L_0x002c:
            eb0.h4 r4 = new eb0.h4     // Catch:{ Exception -> 0x0043 }
            r4.<init>()     // Catch:{ Exception -> 0x0043 }
            r4.mo105920a(r0)     // Catch:{ Exception -> 0x0043 }
            r3.add(r4)     // Catch:{ Exception -> 0x0043 }
            boolean r4 = r0.moveToNext()     // Catch:{ Exception -> 0x0043 }
            if (r4 != 0) goto L_0x002c
            r0.close()
            goto L_0x005c
        L_0x0041:
            r12 = move-exception
            goto L_0x0052
        L_0x0043:
            r3 = move-exception
            java.lang.String r4 = "getByFunctionMsgId, error: %s"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0041 }
            r5[r10] = r3     // Catch:{ all -> 0x0041 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r5)     // Catch:{ all -> 0x0041 }
            goto L_0x0058
        L_0x0052:
            r0.close()
            throw r12
        L_0x0056:
            if (r0 == 0) goto L_0x005b
        L_0x0058:
            r0.close()
        L_0x005b:
            r3 = r2
        L_0x005c:
            if (r3 == 0) goto L_0x019c
            int r0 = r3.size()
            if (r0 != 0) goto L_0x0066
            goto L_0x019c
        L_0x0066:
            java.lang.Object r0 = r3.get(r10)
            eb0.h4 r0 = (eb0.C75584h4) r0
            java.util.Iterator r3 = r3.iterator()
        L_0x0070:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0082
            java.lang.Object r4 = r3.next()
            eb0.h4 r4 = (eb0.C75584h4) r4
            int r5 = r4.f222047l
            if (r5 != r9) goto L_0x0070
            r0 = r4
            goto L_0x0070
        L_0x0082:
            zh3.f r3 = r11.f222063d
            java.lang.String r4 = r11.mo105933kD(r13)
            java.lang.String[] r5 = new java.lang.String[r9]
            r5[r10] = r12
            java.lang.String r12 = "reserved3=?"
            int r12 = r3.delete(r4, r12, r5)
            if (r12 < 0) goto L_0x0099
            if (r14 == 0) goto L_0x0099
            r11.doNotify()
        L_0x0099:
            if (r15 == 0) goto L_0x019c
            java.lang.Class<f62.k0> r12 = f62.C75700k0.class
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r11.mo105933kD(r13)
            java.lang.String r15 = m90726bD(r15)
            r14.append(r15)
            java.lang.String r15 = " where "
            r14.append(r15)
            java.lang.String r15 = "istop"
            r14.append(r15)
            java.lang.String r15 = " = 1  group by "
            r14.append(r15)
            java.lang.String r15 = "time"
            r14.append(r15)
            java.lang.String r3 = " ORDER BY "
            r14.append(r3)
            r14.append(r15)
            java.lang.String r15 = " DESC  limit 2"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r15[r10] = r14
            java.lang.String r3 = "processConversationAfterDeleteInfo, sql is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r15)
            zh3.f r15 = r11.f222063d
            r3 = 2
            android.database.Cursor r14 = r15.rawQuery(r14, r2, r3)
            boolean r15 = r14.moveToFirst()
            if (r15 != 0) goto L_0x011d
            r14.close()
            com.tencent.mm.storage.h2 r14 = new com.tencent.mm.storage.h2
            r14.<init>()
            java.lang.String r15 = eb0.C75584h4.m90717e(r13)
            r14.setUsername(r15)
            java.lang.String r15 = ""
            r14.mo108792M2(r15)
            r0 = 0
            r14.mo108793N2(r0)
            r14.mo108803Y2(r10)
            r14.mo108812g3(r10)
            k40.a r12 = f40.C86709a0.m107533q(r12)
            f62.k0 r12 = (f62.C75700k0) r12
            com.tencent.mm.storage.v3 r12 = r12.mo96094Ku()
            java.lang.String r13 = eb0.C75584h4.m90717e(r13)
            com.tencent.mm.storage.i2 r12 = (com.tencent.p014mm.storage.C44660i2) r12
            r12.mo69773k0(r14, r13)
            goto L_0x019c
        L_0x011d:
            k40.a r15 = f40.C86709a0.m107533q(r12)
            f62.k0 r15 = (f62.C75700k0) r15
            com.tencent.mm.storage.v3 r15 = r15.mo96094Ku()
            java.lang.String r2 = eb0.C75584h4.m90717e(r13)
            com.tencent.mm.storage.i2 r15 = (com.tencent.p014mm.storage.C44660i2) r15
            com.tencent.mm.storage.h2 r15 = r15.mo69771j(r2)
            if (r15 != 0) goto L_0x0141
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.String r13 = eb0.C75584h4.m90717e(r13)
            r12[r10] = r13
            java.lang.String r13 = "[processConversationAfterDeleteInfo] originConv[%s] is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r13, r12)
            goto L_0x019c
        L_0x0141:
            eb0.h4 r1 = new eb0.h4
            r1.<init>()
            r1.mo105920a(r14)
            r14.close()
            com.tencent.mm.storage.h2 r14 = new com.tencent.mm.storage.h2
            r14.<init>()
            java.lang.String r2 = eb0.C75584h4.m90717e(r13)
            r14.setUsername(r2)
            java.lang.String r2 = r1.mo105924f()
            r14.mo108792M2(r2)
            long r1 = r1.f222037b
            r14.mo108793N2(r1)
            r14.mo108803Y2(r10)
            int r1 = r15.mo108786G2()
            if (r1 <= 0) goto L_0x0186
            if (r0 == 0) goto L_0x0186
            java.lang.String r1 = r15.getContent()
            java.lang.String r0 = r0.mo105924f()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0186
            int r15 = r15.mo108786G2()
            int r15 = r15 - r9
            r14.mo108812g3(r15)
            goto L_0x0189
        L_0x0186:
            r14.mo108812g3(r10)
        L_0x0189:
            k40.a r12 = f40.C86709a0.m107533q(r12)
            f62.k0 r12 = (f62.C75700k0) r12
            com.tencent.mm.storage.v3 r12 = r12.mo96094Ku()
            java.lang.String r13 = eb0.C75584h4.m90717e(r13)
            com.tencent.mm.storage.i2 r12 = (com.tencent.p014mm.storage.C44660i2) r12
            r12.mo69773k0(r14, r13)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75586j4.mo105928Lo(java.lang.String, int, boolean, boolean):void");
    }

    /* renamed from: Ow */
    public List<C75584h4> mo105929Ow(long j, int i) {
        ArrayList arrayList = new ArrayList();
        String str = m90726bD(mo105933kD(i)) + " where " + "reserved2" + " = " + j;
        Log.m105918d("MicroMsg.ReaderAppInfoStorage", "getInfoListByMsgSvrID :" + str);
        Cursor rawQuery = this.f222063d.rawQuery(str, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C75584h4 h4Var = new C75584h4();
            h4Var.mo105920a(rawQuery);
            arrayList.add(h4Var);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: SE */
    public final void mo105930SE(int i) {
        Class cls = C75700k0.class;
        String str = m90726bD(mo105933kD(i)) + " where " + "istop" + " = 1  group by " + "reserved3" + " ORDER BY " + "time" + " DESC  limit 2";
        Log.m105925i("MicroMsg.ReaderAppInfoStorage", "reset conversation, sql is %s", str);
        Cursor rawQuery = this.f222063d.rawQuery(str, (String[]) null, 2);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            C72976h2 h2Var = new C72976h2();
            h2Var.setUsername(C75584h4.m90717e(i));
            h2Var.mo108792M2("");
            h2Var.mo108793N2(0);
            h2Var.mo108803Y2(0);
            h2Var.mo108812g3(0);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(h2Var, C75584h4.m90717e(i));
            return;
        }
        C75584h4 h4Var = new C75584h4();
        h4Var.mo105920a(rawQuery);
        rawQuery.close();
        C72976h2 h2Var2 = new C72976h2();
        h2Var2.setUsername(C75584h4.m90717e(i));
        h2Var2.mo108792M2(h4Var.mo105924f());
        h2Var2.mo108793N2(h4Var.f222037b);
        h2Var2.mo108803Y2(0);
        h2Var2.mo108812g3(0);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(h2Var2, C75584h4.m90717e(i));
    }

    /* renamed from: Yt */
    public List<C75584h4> mo105931Yt(String str, int i) {
        ArrayList arrayList = new ArrayList();
        String str2 = m90726bD(mo105933kD(i)) + "where " + "reserved3" + " = " + C91753f.m115264e(str) + " order by " + "istop" + " desc , " + "tweetid" + " asc ";
        Log.m105918d("MicroMsg.ReaderAppInfoStorage", "getInfobyGroup :" + str2);
        Cursor rawQuery = this.f222063d.rawQuery(str2, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C75584h4 h4Var = new C75584h4();
            h4Var.mo105920a(rawQuery);
            arrayList.add(h4Var);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: jo */
    public void mo105932jo(int i) {
        Class cls = C75700k0.class;
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(C75584h4.m90717e(i));
        if (j != null && j.getUsername().equals(C75584h4.m90717e(i))) {
            j.setUsername(C75584h4.m90717e(i));
            j.mo108792M2("");
            j.mo108803Y2(0);
            j.mo108812g3(0);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, C75584h4.m90717e(i));
            if (this.f222063d.execSQL(mo105933kD(i), "delete from " + mo105933kD(i))) {
                doNotify();
            }
        }
    }

    /* renamed from: kD */
    public final String mo105933kD(int i) {
        if (i == 20) {
            return "readerappnews1";
        }
        if (i == 11) {
            return "readerappweibo";
        }
        Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
        return null;
    }

    /* renamed from: qq */
    public int mo105934qq(int i) {
        Cursor rawQuery = this.f222063d.rawQuery("select count(*) from (SELECT count(*) FROM " + mo105933kD(i) + " group by " + "reserved3" + ")", (String[]) null, 2);
        int i2 = 0;
        if (rawQuery.moveToFirst()) {
            i2 = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i2;
    }
}
