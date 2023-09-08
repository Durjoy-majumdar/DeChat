package fk3;

import android.database.Cursor;
import android.util.Pair;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import com.tencent.p014mm.storage.C30744h4;
import com.tencent.p014mm.storage.C57593a4;
import com.tencent.p014mm.storage.C57596i4;
import com.tencent.p014mm.storage.C57598k2;
import com.tencent.p014mm.storage.C57602s1;
import com.tencent.p014mm.storage.C57603t1;
import com.tencent.p014mm.storage.C57604w3;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import gy3.C87412m;
import i40.C60247c;
import ig3.C60283e;
import java.util.ArrayList;
import java.util.List;
import p157gk.C59491j;
import p158gt.C98201k;
import p248ug.C65347o0;
import p749xh.C66267j1;
import sx3.C26236u;
import z04.C112551y;

/* renamed from: fk3.a */
public final class C59136a {

    /* renamed from: a */
    public static final C59136a f169139a = new C59136a();

    /* renamed from: a */
    public final void mo84346a() {
        String str = C59491j.f169997b;
        Class cls = C57604w3.class;
        Log.m105924i("MicroMsg.ImageQueryStorage", "deleteDirtyImageByRoomId >> " + str);
        C60247c.C60248a aVar = C60247c.f171775g;
        ((C57603t1) ((C57604w3) aVar.mo85234a(cls)).mo85233d3(C57603t1.class)).mo81951c3(str);
        ((C57598k2) ((C57604w3) aVar.mo85234a(cls)).mo85233d3(C57598k2.class)).mo81950c3(str);
        ((C57596i4) ((C57604w3) aVar.mo85234a(cls)).mo85233d3(C57596i4.class)).mo81949c3(str);
    }

    /* renamed from: b */
    public final void mo84347b(C72963f4 f4Var, int i) {
        C87412m.m108594g(f4Var, "msgInfo");
        Log.m105924i("MicroMsg.HistoryQueryImageUtils", "deleteMsgToNotifyPlugin >> msgId: " + f4Var.getMsgId() + ", fromSource: " + i);
        if (f4Var.mo100979R3() || f4Var.mo100961A3()) {
            Log.m105924i("MicroMsg.HistoryQueryImageUtils", "deleteMsgToNotifyPlugin delete image");
            String t = f4Var.mo108768t();
            C87412m.m108593f(t, "msgInfo.talker");
            ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89071HR(t, f4Var.getMsgId());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        cy3.C58003b.m67160a(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077 A[ADDED_TO_REGION, Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x000e A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.tencent.p014mm.api.QueryImageData> mo84348c(android.database.Cursor r13, boolean r14) {
        /*
            r12 = this;
            java.lang.String r0 = "cursor"
            gy3.C87412m.m108594g(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
        L_0x000e:
            boolean r3 = r13.moveToNext()     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x0095
            com.tencent.mm.storage.f4 r3 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x009c }
            r3.<init>()     // Catch:{ all -> 0x009c }
            r3.convertFrom(r13)     // Catch:{ all -> 0x009c }
            java.lang.String r4 = "MicroMsg.HistoryQueryImageUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r5.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "getImageFromCursor >> "
            r5.append(r6)     // Catch:{ all -> 0x009c }
            long r6 = r3.getCreateTime()     // Catch:{ all -> 0x009c }
            r5.append(r6)     // Catch:{ all -> 0x009c }
            java.lang.String r6 = ", "
            r5.append(r6)     // Catch:{ all -> 0x009c }
            r5.append(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x009c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x009c }
            if (r14 == 0) goto L_0x004f
            long r4 = r3.getCreateTime()     // Catch:{ all -> 0x009c }
            long r4 = r4 - r1
            r6 = 63115200000(0xeb1f58600, double:3.11830520504E-313)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x004f
            goto L_0x0095
        L_0x004f:
            boolean r4 = r3.mo100979R3()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x005b
            boolean r4 = r3.mo100961A3()     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x000e
        L_0x005b:
            fk3.a r4 = f169139a     // Catch:{ all -> 0x009c }
            java.lang.String r11 = r4.mo84351f(r3)     // Catch:{ all -> 0x009c }
            tk3.a r4 = tk3.C78036a.f228782a     // Catch:{ all -> 0x009c }
            java.lang.String r10 = r4.mo108023a(r3)     // Catch:{ all -> 0x009c }
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L_0x0074
            int r6 = r11.length()     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r6 = 0
            goto L_0x0075
        L_0x0074:
            r6 = 1
        L_0x0075:
            if (r6 != 0) goto L_0x000e
            if (r10 == 0) goto L_0x007f
            int r6 = r10.length()     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x0080
        L_0x007f:
            r4 = 1
        L_0x0080:
            if (r4 != 0) goto L_0x000e
            com.tencent.mm.api.QueryImageData r4 = new com.tencent.mm.api.QueryImageData     // Catch:{ all -> 0x009c }
            long r6 = r3.getCreateTime()     // Catch:{ all -> 0x009c }
            long r8 = r3.getMsgId()     // Catch:{ all -> 0x009c }
            r5 = r4
            r5.<init>(r6, r8, r10, r11)     // Catch:{ all -> 0x009c }
            r0.add(r4)     // Catch:{ all -> 0x009c }
            goto L_0x000e
        L_0x0095:
            rx3.b0 r14 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009c }
            r14 = 0
            cy3.C58003b.m67160a(r13, r14)
            return r0
        L_0x009c:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            cy3.C58003b.m67160a(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fk3.C59136a.mo84348c(android.database.Cursor, boolean):java.util.ArrayList");
    }

    /* renamed from: d */
    public final long mo84349d(String str) {
        C39622i0 a;
        String str2;
        String str3 = str;
        C87412m.m108594g(str3, "talker");
        Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getLastIdentifyTimeStamp >> " + str3);
        String str4 = C59491j.f169997b;
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        List<C57602s1> multiQuery = C66267j1.f190595p.selectAll().log("MicroMsg.ClsLabelInfoStorage").where(new Sql.Equal("chat_room_id", str4)).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(C66267j1.f190596q.orderDesc())).limit(1, 0).build().multiQuery(((C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class)).getDbProvider().getDB(), C57602s1.class);
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "getLatestImage: " + multiQuery.size());
        Log.m105924i("MicroMsg.ImageQueryStorage", "selectClsLatestImage >> " + str4 + ' ' + multiQuery.size());
        ArrayList arrayList = new ArrayList();
        for (C57602s1 s1Var : multiQuery) {
            arrayList.add(new QueryImageData(s1Var.field_timestamp, s1Var.field_msg_id, s1Var.field_hd_image_path, s1Var.field_origin_image_path, s1Var.field_label_id, s1Var.field_crop_label_id, s1Var.field_ocr_result));
        }
        if (arrayList.isEmpty()) {
            Log.m105924i("MicroMsg.HistoryQueryImageUtils", "late image is null, so image is all need to rec");
            C60283e.f171882e = (long) 0;
        } else {
            C30744h4 h = C57593a4.f164912a.mo81943h(C59491j.f169997b);
            if (h == null || (str2 = h.field_last_image_path) == null) {
                Log.m105924i("MicroMsg.HistoryQueryImageUtils", "history image is null, so use late image in cls");
                C60283e.f171882e = (long) 1;
                f169139a.mo84346a();
            } else {
                C60283e.f171881d = str2;
                String str5 = ((QueryImageData) arrayList.get(0)).f154726g;
                C87412m.m108593f(str5, "it[0].scanImagePath");
                C60283e.f171895r = str5;
                if (C87412m.m108589b(str2, ((QueryImageData) arrayList.get(0)).f154726g)) {
                    Log.m105924i("MicroMsg.HistoryQueryImageUtils", "two late image is similar");
                    long j = ((QueryImageData) arrayList.get(0)).f154724e;
                    C60283e.f171882e = (long) 3;
                    return j;
                }
                Log.m105924i("MicroMsg.HistoryQueryImageUtils", "two late image is not similar");
                f169139a.mo84346a();
                C60283e.f171882e = (long) 2;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public final long mo84350e(String str) {
        C39622i0 a;
        C87412m.m108594g(str, "talker");
        Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getOldestIdentifiedTimeStamp >> " + str);
        Log.m105924i("MicroMsg.ImageQueryStorage", "selectClsOldestImage >> roomId: " + str);
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57602s1 s1Var = (C57602s1) C66267j1.f190595p.selectAll().log("MicroMsg.ClsLabelInfoStorage").where(new Sql.Equal("chat_room_id", str)).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(C66267j1.f190596q.orderInc())).build().singleQuery(((C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class)).getDbProvider().getDB(), C57602s1.class);
        StringBuilder sb = new StringBuilder();
        sb.append("result >> ");
        sb.append(s1Var != null);
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", sb.toString());
        if (s1Var != null) {
            return s1Var.field_timestamp;
        }
        return -1;
    }

    /* renamed from: f */
    public final String mo84351f(C72963f4 f4Var) {
        Class cls = C98201k.class;
        if (f4Var == null) {
            return null;
        }
        if (!f4Var.mo100979R3() && !f4Var.mo100961A3()) {
            return null;
        }
        boolean z = true;
        if (f4Var.mo108769t2() == 1) {
            C92836k vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
            if (vP.f267374a == 0) {
                long y2 = f4Var.mo108774y2();
                Log.m105925i("MicroMsg.HistoryQueryImageUtils", "getImagePath img invalid and try get by msgSvrId: %s", Long.valueOf(y2));
                vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), y2);
            }
            String str = vP.f267378e;
            String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str, "", "", true);
            Log.m105925i("MicroMsg.HistoryQueryImageUtils", "getImagePath bigImagePath %s, %s", str, TY);
            if ((TY == null || TY.length() == 0) || !C86013q1.m106450k(TY) || C112551y.m153808h(TY, ".temp", false, 2, (Object) null)) {
                String r502 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(f4Var.mo108768t(), vP);
                String TY2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r502, "", "", true);
                Log.m105925i("MicroMsg.HistoryQueryImageUtils", "getImagePath hdImagePath %s, %s", r502, TY2);
                if (!(TY2 == null || TY2.length() == 0)) {
                    z = false;
                }
                if (!z && C86013q1.m106450k(TY2) && !C112551y.m153808h(TY2, ".temp", false, 2, (Object) null)) {
                    Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> sender is find in next>> " + TY2);
                    return TY2;
                }
            } else {
                Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> sender is find >> " + TY);
                return TY;
            }
        } else {
            C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
            String str2 = NQ.f267378e;
            String TY3 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str2, "", "", true);
            Log.m105925i("MicroMsg.HistoryQueryImageUtils", "getImagePath receiver bigImagePath %s, %s", str2, TY3);
            if (!(TY3 == null || TY3.length() == 0) && C86013q1.m106450k(TY3) && !C112551y.m153808h(TY3, ".temp", false, 2, (Object) null)) {
                Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> receiver is find >> " + TY3);
                return TY3;
            } else if (NQ.mo127145p()) {
                String r503 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(f4Var.mo108768t(), NQ);
                String TY4 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r503, "", "", true);
                Log.m105925i("MicroMsg.HistoryQueryImageUtils", "getImagePath receiver hdImagePath %s, %s", r503, TY4);
                if (!(TY4 == null || TY4.length() == 0)) {
                    z = false;
                }
                if (!z && C86013q1.m106450k(TY4) && !C112551y.m153808h(TY4, ".temp", false, 2, (Object) null)) {
                    Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getScanImage >> receiver is find in next>> " + TY4);
                    return TY4;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public final Pair<ArrayList<QueryImageData>, ArrayList<QueryImageData>> mo84352g(String str, boolean z) {
        C87412m.m108594g(str, "talker");
        Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> talker: " + str + ", isFromOpenFeature: " + z + ", " + Thread.currentThread());
        long d = mo84349d(str);
        if (d != -1) {
            Cursor cx02 = ((C72972g4) C97625j3.m125812b().mo105911z()).cx0(str, d);
            C87412m.m108593f(cx02, "getAccStg().messageStg.g…Time(talker, latestStamp)");
            ArrayList<QueryImageData> c = mo84348c(cx02, false);
            Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> latestListData: " + c.size());
            long e = mo84350e(str);
            Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> " + e);
            if (!(e == -1 || e == d)) {
                Cursor vx02 = ((C72972g4) C97625j3.m125812b().mo105911z()).vx0(str, e, 50);
                C87412m.m108593f(vx02, "getAccStg().messageStg.g…(talker, oldestStamp, 50)");
                ArrayList<QueryImageData> c2 = mo84348c(vx02, false);
                Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyImageData >> oldestDataSize: " + c2.size());
                c.addAll(c2);
            }
            ArrayList<QueryImageData> d2 = C57593a4.f164912a.mo81939d(str, "0");
            int size = d2.size();
            Log.m105924i("MicroMsg.HistoryQueryImageUtils", "getToIdentifyData >> oldDataInIdentifyDBSize: " + size);
            return new Pair<>(c, d2);
        }
        Cursor Sx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Sx0(str, 500);
        C87412m.m108593f(Sx0, "getAccStg().messageStg.getLimitImage(talker, 500)");
        return new Pair<>(mo84348c(Sx0, true), new ArrayList());
    }
}
