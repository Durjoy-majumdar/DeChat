package com.tencent.p014mm.storage;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.pluginsdk.model.C19467w0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di3.C86312j;
import e00.C20484c0;
import eb0.C20583z;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import ob0.C47350c;
import ob0.C89144l0;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import rb0.C47970h0;
import rb0.C48009v0;
import te3.C22499hb0;
import te3.C22503jo3;
import te3.C22521pi1;
import te3.C64444ie0;
import te3.C64846y23;
import te3.hg4;
import te3.ig4;
import te3.me4;
import te3.ne4;
import te3.oe4;
import te3.qe4;
import te3.re4;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.w0 */
public class C19636w0 {

    /* renamed from: a */
    public static String f55624a;

    /* renamed from: b */
    public static long f55625b;

    /* renamed from: c */
    public static int f55626c;

    /* renamed from: d */
    public static boolean f55627d;

    /* renamed from: e */
    public static boolean f55628e;

    /* renamed from: f */
    public static long f55629f;

    /* renamed from: g */
    public static long f55630g;

    /* renamed from: h */
    public static int f55631h;

    /* renamed from: i */
    public static Boolean f55632i;

    /* renamed from: j */
    public static Boolean f55633j;

    /* renamed from: com.tencent.mm.storage.w0$a */
    public class C19637a implements Runnable {
        public void run() {
            C72996z1 z1Var;
            C72996z1 z1Var2;
            boolean z = true;
            if (C86709a0.m107522a()) {
                String g = C19636w0.m21165g();
                Class cls = C75700k0.class;
                if (Util.isNullOrNil(g)) {
                    Log.m105918d("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertTlRecCard no need to insert");
                } else {
                    int indexOf = g.indexOf("<sysmsg");
                    if (indexOf != -1) {
                        Map<String, String> parseXml = XmlParser.parseXml(g.substring(indexOf), "sysmsg", (String) null);
                        if (parseXml == null) {
                            Log.m105921e("MicroMsg.BizTimeLineInfoStorageLogic", "XmlParser values is null, msgContent %s", g);
                        } else if (C19613h1.m21036i(parseXml)) {
                            C19623o0 mL = C48009v0.Jx0().mo25809mL();
                            if (mL == null) {
                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] postInsertCanvasCard lastTimeLineInfo is null");
                            } else {
                                re4 d = C19613h1.m21031d(parseXml);
                                if (d != null) {
                                    if (mL.field_status == 4) {
                                        Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] postInsertCanvasCard lastTimeLineInfo is exposed");
                                    } else {
                                        C19636w0.m21175q("");
                                        if (!C19613h1.m21043p(d, (C19623o0) null)) {
                                            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] postInsertCanvasCard illegal");
                                        } else if (!C19613h1.m21039l(d.f64525q.f64082t, true)) {
                                            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] postInsertCanvasCard pkg version invalid");
                                        } else if (!C19613h1.m21028a(d)) {
                                            C115669n.INSTANCE.idkeyStat(1149, 1, 1, false);
                                            C19623o0 o0Var = new C19623o0();
                                            o0Var.field_msgId = C48009v0.Jx0().mo25782CZ();
                                            o0Var.field_msgSvrId = 0;
                                            o0Var.field_type = 620757041;
                                            o0Var.field_talker = "";
                                            o0Var.field_talkerId = 0;
                                            o0Var.mo183585l2(1);
                                            o0Var.field_status = 3;
                                            C19613h1.m21050w(o0Var, d);
                                            C19619j0 j0Var = C19619j0.f55506a;
                                            C19467w0 w0Var = new C19467w0(0, false, (String) null, false, (String) null, 31, (C8480h) null);
                                            C22503jo3 jo32 = d.f64525q;
                                            if (!j0Var.mo25749a(parseXml, d, w0Var, o0Var, false, jo32.f64071f, jo32.f64070e)) {
                                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] postInsertCanvasCard fail");
                                            } else {
                                                boolean v102 = C48009v0.Jx0().v10(o0Var, true);
                                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] postInsertCanvasCard result = " + v102 + ", redDotFlag = " + d.f64528t + ", orderFlag = " + o0Var.field_orderFlag + " pos = " + d.f64525q.f64070e + " weight=" + d.f64525q.f64071f + ',' + o0Var.mo25776z2() + " msgId=" + o0Var.field_msgId);
                                                if (v102) {
                                                    C19627t tVar = C19627t.f55586a;
                                                    if (C19627t.f55606u) {
                                                        ((C20484c0) C86312j.m106911c(C20484c0.class)).zb0();
                                                    }
                                                    tVar.mo25850x(o0Var);
                                                    C117407d.INSTANCE.mo182089r(1454, 82, 1);
                                                    C30798z zVar = C30798z.f82801a;
                                                    int i = d.f64517f;
                                                    int i2 = d.f64524p;
                                                    int i3 = d.f64521j;
                                                    long j = d.f64519h;
                                                    C22503jo3 jo33 = d.f64525q;
                                                    String str = jo33 != null ? jo33.f64075j : null;
                                                    C22499hb0 hb02 = d.f64523o;
                                                    zVar.mo57722a(o0Var, 2, i, i2, 5, i3, j, str, hb02 != null ? hb02.f63909n : null, d.f64527s);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            re4 i4 = C19636w0.m21167i(parseXml);
                            C19613h1.m21030c(i4, parseXml);
                            C19623o0 mL2 = C48009v0.Jx0().mo25809mL();
                            if (mL2 == null) {
                                Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] doInsertTlRecCard lastTimeLineInfo is null");
                                C19613h1.m21048u(i4, i4.f64528t, 1);
                            } else if (mL2.field_status == 4) {
                                Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] doInsertTlRecCard lastTimeLineInfo is exposed");
                                C19613h1.m21048u(i4, i4.f64528t, 2);
                            } else {
                                C19636w0.m21175q("");
                                if (!C19613h1.m21043p(i4, (C19623o0) null)) {
                                    Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] doInsertTlRecCard wrapper illegal");
                                    C19613h1.m21048u(i4, i4.f64528t, 3);
                                } else {
                                    int i5 = i4.f64517f;
                                    int i6 = i4.f64518g;
                                    if (i5 >= 0 || i6 >= 0) {
                                        Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] doInsertTlRecCard pos %d, weight %d", Integer.valueOf(i5), Integer.valueOf(i6));
                                        if (C19613h1.m21028a(i4)) {
                                            C19613h1.m21048u(i4, i4.f64528t, 5);
                                        } else {
                                            if ((i4.f64521j == 101) && (z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(i4.f64515d.f64240e.f64334d)) != null && z1Var2.mo62927s3()) {
                                                Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] doInsertTlRecCard %s is contact", i4.f64515d.f64240e.f64334d);
                                                C19613h1.m21048u(i4, i4.f64528t, 6);
                                            } else if (!C19613h1.m21042o(i4) || (z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(i4.f64515d.f64240e.f64334d)) == null || z1Var.mo62927s3()) {
                                                C115669n.INSTANCE.idkeyStat(1149, 1, 1, false);
                                                C19623o0 o0Var2 = new C19623o0();
                                                o0Var2.field_msgId = C48009v0.Jx0().mo25782CZ();
                                                o0Var2.field_msgSvrId = 0;
                                                o0Var2.field_type = 620757041;
                                                o0Var2.field_talker = i4.f64515d.f64240e.f64334d;
                                                o0Var2.field_talkerId = 0;
                                                o0Var2.mo183585l2(1);
                                                o0Var2.field_status = 3;
                                                C19613h1.m21050w(o0Var2, i4);
                                                if (!C19619j0.f55506a.mo25749a(parseXml, i4, new C19467w0(), o0Var2, false, i6, i5)) {
                                                    Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately fail");
                                                } else {
                                                    boolean v103 = C48009v0.Jx0().v10(o0Var2, true);
                                                    Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] doInsertTlRecCard result: %b, username: %s, redDotFlag=%d, msgId %d", Boolean.valueOf(v103), i4.f64515d.f64240e.f64334d, Integer.valueOf(i4.f64528t), Long.valueOf(o0Var2.field_msgId));
                                                    C19613h1.m21048u(i4, i4.f64528t, v103 ? 0 : 7);
                                                }
                                            } else {
                                                Log.m105929w("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] doInsertTlRecCard %s is not follow!", i4.f64515d.f64240e.f64334d);
                                                C19613h1.m21048u(i4, i4.f64528t, 6);
                                            }
                                        }
                                    } else {
                                        Log.m105929w("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertTlRecCard data invalid pos %d, weight %d", Integer.valueOf(i5), Integer.valueOf(i6));
                                        C19613h1.m21048u(i4, i4.f64528t, 4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C19627t tVar2 = C19627t.f55586a;
            if (tVar2.mo25833g()) {
                tVar2.mo25845s(0, false);
                if (tVar2.mo25839m()) {
                    tVar2.mo25828b("bizBoxClick", (String) null);
                } else if (tVar2.mo25833g()) {
                    List<C19623o0> bO = C48009v0.Jx0().mo25799bO(637534257, 1);
                    ArrayList arrayList = new ArrayList();
                    for (T next : bO) {
                        if (Math.abs(((C19623o0) next).field_createTime - System.currentTimeMillis()) < 86400000) {
                            arrayList.add(next);
                        }
                    }
                    C19627t tVar3 = C19627t.f55586a;
                    if (tVar3.mo25833g() && !Util.isNullOrNil((List) arrayList) && tVar3.mo25842p() != 1) {
                        LinkedList linkedList = new LinkedList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            C47970h0 h0Var = C19627t.f55587b;
                            String n2 = ((C19623o0) next2).mo25764n2();
                            C87412m.m108593f(n2, "it.aId");
                            if (!h0Var.mo72742b(n2)) {
                                arrayList2.add(next2);
                            }
                        }
                        JSONArray jSONArray = new JSONArray();
                        Iterator it4 = arrayList2.iterator();
                        boolean z2 = false;
                        while (it4.hasNext()) {
                            C19623o0 o0Var3 = (C19623o0) it4.next();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                JSONObject p2 = o0Var3.mo25766p2();
                                String optString = p2.optString("aid");
                                jSONObject.put("aid", optString);
                                String optString2 = p2.optString("reranking_ext_info");
                                if (optString2 != null) {
                                    JSONObject jSONObject2 = new JSONObject(optString2);
                                    jSONObject.put("tid", String.valueOf(jSONObject2.optLong("tid", 0)));
                                    jSONObject.put("material_hash", jSONObject2.optString("material_hash"));
                                }
                                jSONObject.put("trace_id", p2.optString("traceid"));
                                HashMap<String, Long> hashMap = C19627t.f55588c;
                                C87412m.m108593f(optString, "aid");
                                hashMap.put(optString, Long.valueOf(o0Var3.field_msgId));
                                linkedList.add(optString);
                                jSONArray.put(jSONObject);
                                C19627t.f55587b.mo72741a(optString);
                                z2 = true;
                            } catch (Exception e) {
                                Log.m105920e("MicroMsg.BizCardLogic", "checkAd ex " + e.getMessage());
                            }
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(WeChatBrands.Business.GROUP_ADS, jSONArray);
                        String jSONObject4 = jSONObject3.toString();
                        if (jSONObject4 != null && !C112551y.m153811k(jSONObject4)) {
                            z = false;
                        }
                        if (!z && z2) {
                            C117407d.INSTANCE.mo182089r(1454, 16, 1);
                            C47350c.C47352b bVar = new C47350c.C47352b();
                            bVar.f127066a = new hg4();
                            bVar.f127067b = new ig4();
                            bVar.f127068c = "/cgi-bin/mmbiz-bin/recommend/timelinecard";
                            bVar.f127069d = 2781;
                            C47350c a = bVar.mo72403a();
                            C47465a aVar = a.f127055a.f127080a;
                            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineCardReq");
                            hg4 hg4 = (hg4) aVar;
                            hg4.f183479d = System.currentTimeMillis();
                            hg4.f183480e = 2;
                            hg4.f183482g = jSONObject4;
                            C89144l0.m111429e(a, new C85800v(linkedList), false);
                        }
                    }
                }
                ((C119157j) C119157j.f356862d).mo183884o(C85797u.f249879d);
            }
        }
    }

    /* renamed from: a */
    public static void m21159a(C72963f4 f4Var, boolean z) {
        if (Util.isEqual(f4Var.mo108768t(), f55624a)) {
            Log.m105927v("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg is currentTalker %s, just return.", f55624a);
            return;
        }
        C19623o0 bD = C48009v0.Kx0().mo25737bD(f4Var.mo108774y2(), "msgSvrId");
        C19623o0 o0Var = bD == null ? new C19623o0() : bD;
        if (z) {
            o0Var.field_msgId = C48009v0.Kx0().mo25738bF();
        } else {
            o0Var.field_msgId = f4Var.getMsgId();
        }
        o0Var.field_msgSvrId = f4Var.mo108774y2();
        o0Var.field_content = f4Var.getContent();
        o0Var.field_type = f4Var.getType();
        o0Var.field_talker = f4Var.mo108768t();
        o0Var.field_talkerId = f4Var.mo108723B2();
        o0Var.field_createTime = f4Var.getCreateTime();
        o0Var.field_imgPath = f4Var.mo108765s2();
        o0Var.mo183585l2(f4Var.f230723F);
        o0Var.f356046F = f4Var.f230724G;
        o0Var.f356057o = true;
        o0Var.field_status = f4Var.getStatus();
        if (bD == null) {
            C48009v0.Kx0().insert(o0Var);
        } else {
            C48009v0.Kx0().mo25742mL(o0Var);
        }
    }

    /* renamed from: b */
    public static void m21160b() {
        ((C119157j) C119157j.f356862d).mo183876g(new C19637a(), "BizInsertTlRecCardThread");
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21161c() {
        /*
            java.lang.Class<rn.c0> r0 = p227rn.C22240c0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rn.c0 r0 = (p227rn.C22240c0) r0
            boolean r0 = r0.mo35407eG()
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            java.lang.String r1 = "officialaccounts"
            com.tencent.mm.storage.h2 r2 = r0.mo69771j(r1)
            if (r2 != 0) goto L_0x002c
            com.tencent.mm.storage.h2 r2 = new com.tencent.mm.storage.h2
            r2.<init>(r1)
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            com.tencent.mm.storage.d1 r6 = rb0.C48009v0.Kx0()
            zh3.f r6 = r6.f55477d
            java.lang.String r7 = "SELECT * FROM BizTimeLineSingleMsgInfo order by createTime DESC limit 1"
            r8 = 0
            android.database.Cursor r6 = r6.rawQuery(r7, r8)
            boolean r7 = r6.moveToFirst()
            if (r7 == 0) goto L_0x0049
            com.tencent.mm.storage.o0 r7 = new com.tencent.mm.storage.o0
            r7.<init>()
            r7.convertFrom(r6)
            goto L_0x004a
        L_0x0049:
            r7 = r8
        L_0x004a:
            r6.close()
            com.tencent.mm.storage.p0 r6 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r6 = r6.mo25809mL()
            com.tencent.mm.storage.p0 r9 = rb0.C48009v0.Jx0()
            zh3.f r9 = r9.f55550d
            java.lang.String r10 = "SELECT * FROM BizTimeLineInfo where type !=637534257 order by createTime DESC limit 1"
            r11 = 2
            android.database.Cursor r9 = r9.rawQuery(r10, r8, r11)
            boolean r10 = r9.moveToFirst()
            if (r10 == 0) goto L_0x0071
            com.tencent.mm.storage.o0 r10 = new com.tencent.mm.storage.o0
            r10.<init>()
            r10.convertFrom(r9)
            goto L_0x0072
        L_0x0071:
            r10 = r8
        L_0x0072:
            r9.close()
            if (r10 == 0) goto L_0x007a
            long r14 = r10.field_createTime
            goto L_0x007c
        L_0x007a:
            r14 = 0
        L_0x007c:
            if (r7 == 0) goto L_0x0081
            long r8 = r7.field_createTime
            goto L_0x0083
        L_0x0081:
            r8 = 0
        L_0x0083:
            long r16 = java.lang.Math.max(r14, r8)
            com.tencent.mm.pluginsdk.model.d$a r3 = com.tencent.p014mm.pluginsdk.model.C19428d.m20722S(r16)
            r11 = 256(0x100, float:3.59E-43)
            r2.mo108373l3(r11)
            r11 = 128(0x80, float:1.794E-43)
            r2.mo108373l3(r11)
            boolean r11 = r3.f54898a
            if (r11 == 0) goto L_0x00a0
            boolean r3 = m21162d(r2, r5, r0, r3)
            if (r3 == 0) goto L_0x00a0
            return
        L_0x00a0:
            com.tencent.mm.pluginsdk.model.d r3 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            r3.mo25157J()
            if (r6 == 0) goto L_0x00b4
            com.tencent.mm.storage.p0 r3 = rb0.C48009v0.Jx0()
            r17 = r5
            long r4 = r6.field_orderFlag
            int r3 = r3.mo25803gY(r4)
            goto L_0x00b7
        L_0x00b4:
            r17 = r5
            r3 = 0
        L_0x00b7:
            com.tencent.mm.storage.d1 r4 = rb0.C48009v0.Kx0()
            int r4 = r4.mo25734SE()
            r5 = 16
            if (r4 <= 0) goto L_0x00e3
            int r18 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r18 > 0) goto L_0x00db
            if (r7 == 0) goto L_0x00d4
            com.tencent.mm.storage.c0 r11 = com.tencent.p014mm.storage.C19601c0.f55446a
            long r12 = r7.field_msgId
            boolean r11 = r11.mo25720i(r12, r3)
            if (r11 == 0) goto L_0x00d4
            goto L_0x00db
        L_0x00d4:
            r2.mo108371j3(r5)
            r2.mo108812g3(r3)
            goto L_0x00e9
        L_0x00db:
            r2.mo108373l3(r5)
            r2.mo108812g3(r4)
            r3 = r7
            goto L_0x00ea
        L_0x00e3:
            r2.mo108371j3(r5)
            r2.mo108812g3(r3)
        L_0x00e9:
            r3 = r6
        L_0x00ea:
            java.lang.String r4 = "MicroMsg.BizTimeLineInfoStorageLogic"
            if (r3 == 0) goto L_0x0373
            long r11 = r3.field_msgId
            r19 = 0
            int r5 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r5 != 0) goto L_0x00f8
            goto L_0x0373
        L_0x00f8:
            r5 = 32
            if (r3 != r6) goto L_0x0105
            int r6 = r3.field_placeTop
            r11 = 1
            if (r6 != r11) goto L_0x0105
            r2.mo108371j3(r5)
            goto L_0x0108
        L_0x0105:
            r2.mo108373l3(r5)
        L_0x0108:
            if (r3 != r7) goto L_0x011d
            long r5 = r3.field_msgId
            long r12 = m21164f()
            r7 = 64
            int r18 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r18 != 0) goto L_0x011a
            r2.mo108373l3(r7)
            goto L_0x011d
        L_0x011a:
            r2.mo108371j3(r7)
        L_0x011d:
            com.tencent.mm.storage.f4 r5 = new com.tencent.mm.storage.f4
            r5.<init>()
            java.lang.String r6 = r3.field_content
            r5.mo108732L2(r6)
            java.lang.String r6 = r3.field_talker
            r5.mo108749c3(r6)
            int r6 = r3.field_status
            r5.mo100991d(r6)
            boolean r6 = r3.mo25753A2()
            if (r6 == 0) goto L_0x013d
            long r6 = r3.f356048H
            r5.mo108733M2(r6)
            goto L_0x0142
        L_0x013d:
            long r6 = r3.field_createTime
            r5.mo108733M2(r6)
        L_0x0142:
            long r6 = r3.field_msgId
            r5.setMsgId(r6)
            int r6 = r3.field_type
            r5.setType(r6)
            java.lang.String r6 = r3.f356046F
            r5.mo101012p4(r6)
            java.lang.String r6 = r3.field_imgPath
            r5.mo108739S2(r6)
            long r6 = eb0.C31543z5.m39453c()
            long r12 = r2.mo108821o2()
            long r6 = java.lang.Math.min(r6, r12)
            long r8 = java.lang.Math.max(r8, r14)
            r2.mo101164o3(r5)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r5.mo108768t()
            r12.append(r13)
            java.lang.String r13 = ":"
            r12.append(r13)
            java.lang.String r13 = r5.getContent()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r2.mo108792M2(r12)
            int r12 = r5.getType()
            java.lang.String r12 = java.lang.Integer.toString(r12)
            r2.mo108806b3(r12)
            com.tencent.mm.storage.v3$b r12 = r0.mo69741L()
            if (r12 == 0) goto L_0x02f7
            com.tencent.mm.pointers.PString r12 = new com.tencent.mm.pointers.PString
            r12.<init>()
            com.tencent.mm.pointers.PString r13 = new com.tencent.mm.pointers.PString
            r13.<init>()
            com.tencent.mm.pointers.PInt r14 = new com.tencent.mm.pointers.PInt
            r14.<init>()
            r5.mo108749c3(r1)
            java.lang.String r1 = r2.getContent()
            r5.mo108732L2(r1)
            r1 = 1
            p875ci.C67379u.m79740d(r5, r12, r13, r14, r1)
            boolean r1 = r3.mo25758F2()
            if (r1 == 0) goto L_0x029c
            te3.re4 r1 = r3.mo25774x2()
            if (r1 == 0) goto L_0x01dc
            int r5 = r1.f64521j
            r15 = 1001(0x3e9, float:1.403E-42)
            if (r5 != r15) goto L_0x01dc
            te3.jo3 r5 = r1.f64525q
            if (r5 == 0) goto L_0x01dc
            java.lang.String r5 = r5.f64077o
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x01dc
            te3.jo3 r5 = r1.f64525q
            java.lang.String r5 = r5.f64077o
            r12.value = r5
            r5 = 1
            goto L_0x01dd
        L_0x01dc:
            r5 = 0
        L_0x01dd:
            if (r5 != 0) goto L_0x028a
            if (r1 == 0) goto L_0x028a
            te3.me4 r15 = r1.f64515d
            if (r15 == 0) goto L_0x028a
            java.lang.String r15 = r15.f64239d
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x028a
            te3.me4 r5 = r1.f64515d
            java.lang.String r5 = r5.f64239d
            r12.value = r5
            int r5 = r1.f64521j
            boolean r5 = com.tencent.p014mm.storage.C19613h1.m21038k(r5)
            if (r5 == 0) goto L_0x0299
            te3.hb0 r5 = r1.f64523o
            if (r5 == 0) goto L_0x0299
            java.lang.String r5 = r5.f63907i
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0299
            int r5 = r1.f64521j
            r15 = 104(0x68, float:1.46E-43)
            if (r5 != r15) goto L_0x0283
            te3.re4 r1 = r3.mo25774x2()
            if (r1 == 0) goto L_0x027e
            te3.hb0 r5 = r1.f64523o
            if (r5 != 0) goto L_0x0218
            goto L_0x027e
        L_0x0218:
            java.lang.String r5 = r5.f63907i
            int r11 = r1.f64521j
            if (r11 != r15) goto L_0x0280
            te3.y23 r1 = r1.f64529u
            int r11 = r1.f186438d
            r15 = 2
            if (r11 != r15) goto L_0x0280
            java.util.LinkedList<te3.pi1> r11 = r1.f186439e
            int r11 = r11.size()
            r15 = 1
            if (r11 <= r15) goto L_0x0280
            java.util.LinkedList<te3.pi1> r15 = r1.f186439e
            r11 = 0
            java.lang.Object r15 = r15.get(r11)
            te3.pi1 r15 = (te3.C22521pi1) r15
            boolean r15 = r15.f64422R
            if (r15 != 0) goto L_0x0256
            java.util.LinkedList<te3.pi1> r15 = r1.f186439e
            java.lang.Object r15 = r15.get(r11)
            te3.pi1 r15 = (te3.C22521pi1) r15
            java.lang.String r15 = r15.f64420P
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x0256
            java.util.LinkedList<te3.pi1> r1 = r1.f186439e
            java.lang.Object r1 = r1.get(r11)
            te3.pi1 r1 = (te3.C22521pi1) r1
            java.lang.String r5 = r1.f64420P
            goto L_0x0280
        L_0x0256:
            java.util.LinkedList<te3.pi1> r11 = r1.f186439e
            r15 = 1
            java.lang.Object r11 = r11.get(r15)
            te3.pi1 r11 = (te3.C22521pi1) r11
            boolean r11 = r11.f64422R
            if (r11 != 0) goto L_0x0280
            java.util.LinkedList<te3.pi1> r11 = r1.f186439e
            java.lang.Object r11 = r11.get(r15)
            te3.pi1 r11 = (te3.C22521pi1) r11
            java.lang.String r11 = r11.f64420P
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0280
            java.util.LinkedList<te3.pi1> r1 = r1.f186439e
            java.lang.Object r1 = r1.get(r15)
            te3.pi1 r1 = (te3.C22521pi1) r1
            java.lang.String r5 = r1.f64420P
            goto L_0x0280
        L_0x027e:
            java.lang.String r5 = ""
        L_0x0280:
            r12.value = r5
            goto L_0x0299
        L_0x0283:
            te3.hb0 r1 = r1.f64523o
            java.lang.String r1 = r1.f63907i
            r12.value = r1
            goto L_0x0299
        L_0x028a:
            if (r5 != 0) goto L_0x0299
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r5 = 2131822628(0x7f110824, float:1.9278033E38)
            java.lang.String r1 = r1.getString(r5)
            r12.value = r1
        L_0x0299:
            r1 = 0
            r13.value = r1
        L_0x029c:
            boolean r1 = r3.mo25753A2()
            if (r1 == 0) goto L_0x02af
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r5 = 2131822626(0x7f110822, float:1.9278029E38)
            java.lang.String r1 = r1.getString(r5)
            r12.value = r1
        L_0x02af:
            boolean r1 = r3.mo25757E2()
            if (r1 == 0) goto L_0x02ca
            com.tencent.mm.storage.i0 r1 = r3.f55532q1
            if (r1 == 0) goto L_0x02bc
            java.lang.String r1 = r1.f55493c
            goto L_0x02c8
        L_0x02bc:
            jw0.c r1 = jw0.C21290c.f60147a
            java.lang.String r5 = r3.field_content
            com.tencent.mm.storage.i0 r1 = r1.mo33268a(r5)
            r3.f55532q1 = r1
            java.lang.String r1 = r1.f55493c
        L_0x02c8:
            r12.value = r1
        L_0x02ca:
            boolean r1 = r3.mo25760H2()
            if (r1 != 0) goto L_0x02dc
            boolean r1 = r3.mo25756D2()
            if (r1 != 0) goto L_0x02dc
            boolean r1 = r3.mo25755C2()
            if (r1 == 0) goto L_0x02e8
        L_0x02dc:
            java.lang.String r1 = com.tencent.p014mm.storage.C19615i1.m21057d(r3)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r5 != 0) goto L_0x02e8
            r12.value = r1
        L_0x02e8:
            java.lang.String r1 = r12.value
            r2.mo108794O2(r1)
            java.lang.String r1 = r13.value
            r2.mo108795P2(r1)
            int r1 = r14.value
            r2.mo108801W2(r1)
        L_0x02f7:
            long r5 = java.lang.Math.max(r6, r8)
            r2.mo108793N2(r5)
            if (r17 == 0) goto L_0x0305
            long r0 = r0.mo69751W(r2)
            goto L_0x030f
        L_0x0305:
            java.lang.String r1 = r2.getUsername()
            r5 = 1
            int r0 = r0.mo69775m0(r2, r1, r5, r5)
            long r0 = (long) r0
        L_0x030f:
            java.lang.String r5 = "brandService"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r5)
            if (r5 == 0) goto L_0x0338
            long r6 = r3.field_msgId
            java.lang.String r8 = "BizLastMsgId"
            r5.encode((java.lang.String) r8, (long) r6)
            long r6 = r3.field_createTime
            java.lang.String r8 = "BizLastMsgTime"
            r5.encode((java.lang.String) r8, (long) r6)
            java.lang.String r6 = "BizLastRecCardId"
            if (r10 == 0) goto L_0x0335
            boolean r7 = r10.mo25758F2()
            if (r7 == 0) goto L_0x0335
            java.lang.String r7 = r10.field_recommendCardId
            r5.encode((java.lang.String) r6, (java.lang.String) r7)
            goto L_0x0338
        L_0x0335:
            r5.removeValueForKey(r6)
        L_0x0338:
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            r5[r1] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r1 = 1
            r5[r1] = r0
            long r0 = r2.mo108821o2()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 2
            r5[r1] = r0
            r0 = 3
            int r1 = r2.mo108786G2()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r0] = r1
            r0 = 4
            long r1 = r3.field_msgId
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5[r0] = r1
            r0 = 5
            java.lang.String r1 = r3.field_talker
            r5[r0] = r1
            java.lang.String r0 = "doUpdateBizMainCell ret %d, shouldOfInsert %b, time %d, unread %d, msgId %d, talker:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r5)
            return
        L_0x0373:
            java.lang.String r1 = "doUpdateBizMainCell BizTimeLineInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            r2.mo101162m3()
            if (r17 != 0) goto L_0x0384
            java.lang.String r1 = r2.getUsername()
            r0.mo69773k0(r2, r1)
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19636w0.m21161c():void");
    }

    /* renamed from: d */
    public static boolean m21162d(C72976h2 h2Var, boolean z, C30783v3 v3Var, C19428d.C19438a aVar) {
        long decodeLong = C19428d.f54856a.mo25176k().decodeLong("KeyMainRedDotTime", 0);
        String i = C19428d.m20723i();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(i);
        boolean z2 = false;
        if (z1Var == null || !z1Var.mo62916m3()) {
            Log.m105928w("MicroMsg.BizTimeLineInfoStorageLogic", "ct not BizContact");
            return false;
        }
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(i);
        String string = MMApplicationContext.getContext().getString(C0966R.string.ang, new Object[]{displayName});
        h2Var.mo108793N2(decodeLong);
        h2Var.mo108794O2(string);
        h2Var.mo108795P2(i);
        h2Var.mo108371j3(128);
        if (aVar.f54899b) {
            h2Var.mo108371j3(256);
        }
        if (z1Var.mo62940x3()) {
            z2 = true;
        }
        if (z2) {
            h2Var.mo108371j3(32);
        } else {
            h2Var.mo108373l3(32);
        }
        if (z) {
            ((C44660i2) v3Var).mo69751W(h2Var);
        } else {
            ((C44660i2) v3Var).mo69773k0(h2Var, h2Var.getUsername());
        }
        return true;
    }

    /* renamed from: e */
    public static int m21163e() {
        int i = f55631h;
        if (i != 0) {
            return i;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_stay_time, 180);
        f55631h = Qe;
        return Qe;
    }

    /* renamed from: f */
    public static long m21164f() {
        if (f55625b == 0) {
            f55625b = MMApplicationContext.getDefaultPreference().getLong("biz_time_line_last_notify_msg_id", -1);
        }
        return f55625b;
    }

    /* renamed from: g */
    public static String m21165g() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        return singleMMKV.decodeString("BizLatestRecommendCardInfo" + C86709a0.m107523b().mo121111i());
    }

    /* renamed from: h */
    public static long m21166h(long j, long j2) {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BIZ_TIME_LINE_GROUP_START_TIME_STRING_SYNC;
        String str = (String) i.mo119685f(aVar, "");
        long j3 = -1;
        if (!Util.isNullOrNil(str)) {
            String[] split = str.split(XVFSFile.PATH_SEPARATOR);
            if (split.length == 2 && Util.getLong(split[0], -1) == j) {
                j3 = j2 - Util.getLong(split[1], -1);
            }
        }
        if (j3 < 0) {
            String str2 = j + XVFSFile.PATH_SEPARATOR + (j2 - 604800);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, str2);
            Log.m105919d("MicroMsg.BizTimeLineInfoStorageLogic", "getSerialNumber set groupStartTime %s,createTime %d", str2, Long.valueOf(j2));
            return 604800;
        }
        Log.m105919d("MicroMsg.BizTimeLineInfoStorageLogic", "getSerialNumber groupStartTime %s,createTime %d", str, Long.valueOf(j2));
        return j3;
    }

    /* renamed from: i */
    public static re4 m21167i(Map<String, String> map) {
        re4 re4 = new re4();
        me4 me4 = new me4();
        re4.f64515d = me4;
        me4.f64239d = map.get(".sysmsg.BizAccountRecommend.Title");
        re4.f64530v = Util.getInt(map.get(".sysmsg.BizAccountRecommend.FailureBehavior"), 0);
        re4.f64515d.f64241f = map.get(".sysmsg.BizAccountRecommend.BizAccount.AppMsgRecReason");
        re4.f64515d.f64240e = new oe4();
        re4.f64515d.f64240e.f64339i = map.get(".sysmsg.BizAccountRecommend.BizAccount.BrandIconUrl");
        re4.f64515d.f64240e.f64334d = map.get(".sysmsg.BizAccountRecommend.BizAccount.UserName");
        re4.f64515d.f64240e.f64335e = map.get(".sysmsg.BizAccountRecommend.BizAccount.NickName");
        re4.f64515d.f64240e.f64337g = map.get(".sysmsg.BizAccountRecommend.BizAccount.RecommendReason");
        re4.f64515d.f64240e.f64338h = map.get(".sysmsg.BizAccountRecommend.BizAccount.Signature");
        qe4 qe4 = new qe4();
        C64444ie0 ie02 = new C64444ie0();
        int i = 0;
        while (i < 20) {
            StringBuilder sb = new StringBuilder();
            sb.append(".sysmsg.BizAccountRecommend.BizAccount.NegativeFeedbackReason");
            sb.append(i == 0 ? "" : Integer.valueOf(i));
            String str = map.get(sb.toString());
            if (Util.isNullOrNil(str)) {
                break;
            }
            ie02.f183682d.add(str);
            i++;
        }
        ie02.f183683e = Util.getInt(map.get(".sysmsg.BizAccountRecommend.BizAccount.ShowNegativeFeedbackReason"), 1);
        qe4.f185009e = ie02;
        re4.f64515d.f64245j = qe4;
        int i2 = 0;
        while (i2 < 2) {
            ne4 ne4 = new ne4();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(".sysmsg.BizAccountRecommend.BizAccount");
            sb4.append(i2 == 0 ? "" : Integer.valueOf(i2));
            String str2 = map.get(new StringBuilder(sb4.toString()) + ".AppMsg.Title");
            ne4.f64282e = str2;
            if (Util.isNullOrNil(str2)) {
                break;
            }
            int i3 = 0;
            while (i3 < 20) {
                ne4 ne42 = new ne4();
                String str3 = ".sysmsg.BizAccountRecommend.BizAccount" + (".AppMsg" + (i3 == 0 ? "" : String.format("%s", new Object[]{Integer.valueOf(i3)})));
                String str4 = map.get(str3 + ".ContentUrl");
                ne42.f64284g = str4;
                if (Util.isNullOrNil(str4)) {
                    break;
                }
                ne42.f64282e = map.get(str3 + ".Title");
                ne42.f64283f = map.get(str3 + ".Digest");
                ne42.f64285h = map.get(str3 + ".CoverImgUrl");
                ne42.f64286i = map.get(str3 + ".CoverImgUrl_1_1");
                ne42.f64287j = map.get(str3 + ".CoverImgUrl_235_1");
                ne42.f64288n = Util.getInt(map.get(str3 + ".ItemShowType"), -1);
                ne42.f64289o = map.get(str3 + ".VideoId");
                ne42.f64290p = Util.getInt(map.get(str3 + ".VideoWidth"), -1);
                ne42.f64291q = Util.getInt(map.get(str3 + ".VideoHeight"), -1);
                ne42.f64292r = Util.getInt(map.get(str3 + ".VideoDuration"), -1);
                ne42.f64293s = Util.getInt(map.get(str3 + ".CreateTime"), -1);
                ne42.f64295u = map.get(str3 + ".VoicePlayUrl");
                ne42.f64296v = Util.getInt(map.get(str3 + ".VoiceDuration"), -1);
                ne42.f64297w = Util.getInt(map.get(str3 + ".StyleFlag"), 0);
                re4.f64515d.f64242g.add(ne42);
                i3++;
            }
            i2++;
        }
        re4.f64517f = Util.getInt(map.get(".sysmsg.BizAccountRecommend.Pos"), -1);
        re4.f64518g = Util.getInt(map.get(".sysmsg.BizAccountRecommend.Weight"), -1);
        re4.f64519h = Util.getLong(map.get(".sysmsg.BizAccountRecommend.RecID"), -1);
        re4.f64526r = map.get(".sysmsg.BizAccountRecommend.CardId");
        re4.f64521j = Util.getInt(map.get(".sysmsg.BizAccountRecommend.Style"), -1);
        re4.f64527s = map.get(".sysmsg.BizAccountRecommend.ExtraData");
        re4.f64528t = Util.getInt(map.get(".sysmsg.BizAccountRecommend.RedDotFlag"), -1);
        return re4;
    }

    /* renamed from: j */
    public static C19623o0 m21168j(String str, Map<String, String> map) {
        return m21169k(str, map, new C19467w0(255, false, (String) null, true, (String) null));
    }

    /* renamed from: k */
    public static C19623o0 m21169k(String str, Map<String, String> map, C19467w0 w0Var) {
        Map<String, String> map2;
        LinkedList<C22521pi1> linkedList;
        String str2;
        C72996z1 z1Var;
        C72996z1 z1Var2;
        int i;
        String str3 = str;
        C19467w0 w0Var2 = w0Var;
        Class cls = C75700k0.class;
        if (!C86709a0.m107522a()) {
            return null;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105918d("MicroMsg.BizTimeLineInfoStorageLogic", "insertTlRecCardImmediately no need to insert");
            return null;
        }
        int i2 = 0;
        if (map == null) {
            int indexOf = str3.indexOf("<sysmsg");
            if (indexOf != -1) {
                map2 = XmlParser.parseXml(str3.substring(indexOf), "sysmsg", (String) null);
                if (map2 == null) {
                    Log.m105921e("MicroMsg.BizTimeLineInfoStorageLogic", "XmlParser values is null, msgContent %s", str3);
                }
            }
            return null;
        }
        map2 = map;
        re4 i3 = m21167i(map2);
        C19613h1.m21030c(i3, map2);
        if (!C19613h1.m21043p(i3, (C19623o0) null)) {
            Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately wrapper illegal");
            C19613h1.m21048u(i3, i3.f64528t, 3);
            C19641z0.f55645a.mo25867j(124);
            return null;
        } else if (w0Var2.f55004d || (i = i3.f64530v) != 0) {
            int i4 = i3.f64517f;
            int i5 = i3.f64518g;
            Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately pos %d, weight %d, failureBehavior %d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3.f64530v));
            if (!C19613h1.m21028a(i3) || BuildInfo.DEBUG) {
                if ((i3.f64521j == 101) && (z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(i3.f64515d.f64240e.f64334d)) != null && z1Var2.mo62927s3()) {
                    Log.m105929w("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately %s is contact", i3.f64515d.f64240e.f64334d);
                    C19613h1.m21048u(i3, i3.f64528t, 6);
                    return null;
                } else if (!C19613h1.m21042o(i3) || (z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(i3.f64515d.f64240e.f64334d)) == null || z1Var.mo62927s3()) {
                    C115669n.INSTANCE.idkeyStat(1149, 1, 1, false);
                    C19623o0 o0Var = new C19623o0();
                    o0Var.field_msgId = C48009v0.Jx0().mo25782CZ();
                    o0Var.field_msgSvrId = 0;
                    o0Var.field_type = 620757041;
                    o0Var.field_rankSessionId = w0Var2.f55003c;
                    C64846y23 y232 = i3.f64529u;
                    String str4 = "";
                    if (y232 == null || (linkedList = y232.f186439e) == null || linkedList.size() <= 0) {
                        o0Var.field_talker = i3.f64515d.f64240e.f64334d;
                    } else {
                        re4 x2 = o0Var.mo25774x2();
                        if (x2 != null && !Util.isNullOrNil((List) x2.f64529u.f186439e)) {
                            StringBuilder sb = new StringBuilder();
                            Iterator<C22521pi1> it = x2.f64529u.f186439e.iterator();
                            while (it.hasNext()) {
                                C22521pi1 next = it.next();
                                sb.append(next.f64426f);
                                sb.append("&");
                                sb.append(MD5Util.getMD5String(next.f64432o));
                                sb.append("&");
                            }
                            str2 = sb.toString();
                        } else {
                            str2 = str4;
                        }
                        o0Var.field_talker = str2;
                    }
                    o0Var.field_talkerId = 0;
                    o0Var.mo183585l2(1);
                    o0Var.field_status = 3;
                    C19613h1.m21050w(o0Var, i3);
                    o0Var.field_recommendReason = w0Var2.f55005e;
                    C19623o0 o0Var2 = o0Var;
                    if (!C19619j0.f55506a.mo25749a(map2, i3, w0Var, o0Var2, true, i5, i4)) {
                        Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately fail");
                        return null;
                    }
                    C19623o0 o0Var3 = o0Var2;
                    boolean v102 = C48009v0.Jx0().v10(o0Var3, true);
                    Object[] objArr = new Object[9];
                    objArr[0] = Boolean.valueOf(v102);
                    me4 me4 = i3.f64515d;
                    objArr[1] = me4.f64239d;
                    objArr[2] = me4.f64240e.f64334d;
                    objArr[3] = Long.valueOf(o0Var3.field_msgId);
                    objArr[4] = Long.valueOf(o0Var3.mo25767q2());
                    objArr[5] = Long.valueOf(o0Var3.mo25776z2());
                    objArr[6] = Boolean.valueOf(w0Var2.f55002b);
                    C22499hb0 hb02 = i3.f64523o;
                    if (hb02 != null) {
                        str4 = hb02.f63908j;
                    }
                    objArr[7] = str4;
                    objArr[8] = w0Var2.f55005e;
                    Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately result: %b, title:%s, username: %s, msgId %d, groupId %d, weight %d, isInTimeLine=%b, cardId:%s, reason %s", objArr);
                    int i6 = i3.f64528t;
                    if (!v102) {
                        i2 = 7;
                    }
                    C19613h1.m21048u(i3, i6, i2);
                    return o0Var3;
                } else {
                    Log.m105929w("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately %s is not follow!", i3.f64515d.f64240e.f64334d);
                    C19613h1.m21048u(i3, i3.f64528t, 6);
                    return null;
                }
            } else {
                C19613h1.m21048u(i3, i3.f64528t, 5);
                return null;
            }
        } else {
            Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] insertTlRecCardImmediately on ResortFail failureBehavior %d", Integer.valueOf(i));
            C19641z0.f55645a.mo25867j(123);
            return null;
        }
    }

    /* renamed from: l */
    public static boolean m21170l() {
        long currentTimeMillis = System.currentTimeMillis();
        int e = m21163e() * 1000;
        long j = f55629f;
        return (j == 0 || f55630g == 0 || currentTimeMillis - j >= ((long) e)) ? false : true;
    }

    /* renamed from: m */
    public static boolean m21171m() {
        Boolean bool = f55632i;
        if (bool != null) {
            return bool.booleanValue();
        }
        m21177s();
        return f55632i.booleanValue();
    }

    /* renamed from: n */
    public static boolean m21172n() {
        Boolean bool = f55633j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_show_time_v2, 0) == 1) {
            Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime localOpen");
            Boolean bool2 = Boolean.TRUE;
            f55633j = bool2;
            return bool2.booleanValue();
        } else if (C19641z0.f55645a.mo25861d().decodeInt("ReSortBizMsgRecommendReasonMode", 0) == 0) {
            Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime svrShowTime");
            Boolean bool3 = Boolean.TRUE;
            f55633j = bool3;
            return bool3.booleanValue();
        } else {
            Boolean bool4 = Boolean.FALSE;
            f55633j = bool4;
            Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime %b", bool4);
            return f55633j.booleanValue();
        }
    }

    /* renamed from: o */
    public static void m21173o(C19623o0 o0Var) {
        while (C48009v0.Jx0().mo25789SE(o0Var.field_orderFlag, "orderFlag") != null) {
            o0Var.field_orderFlag++;
        }
    }

    /* renamed from: p */
    public static boolean m21174p(long j) {
        if (C48009v0.Jx0().mo25792TY(-4294967296L & j) <= 0) {
            return false;
        }
        if (C48009v0.Jx0().mo25790TE() <= C48009v0.Jx0().mo25791TO()) {
            C19625p0 Jx0 = C48009v0.Jx0();
            synchronized (Jx0) {
                Jx0.f55554h.incrementAndGet();
            }
        }
        C48009v0.Jx0().r50(j);
        return true;
    }

    /* renamed from: q */
    public static void m21175q(String str) {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        singleMMKV.encode("BizLatestRecommendCardInfo" + C86709a0.m107523b().mo121111i(), str);
    }

    /* renamed from: r */
    public static void m21176r(boolean z) {
        f55627d = z;
        C19641z0 z0Var = C19641z0.f55645a;
        ((C119157j) C119157j.f356862d).mo183876g(C19606c1.f55474d, "BizReSortThread");
    }

    /* renamed from: s */
    public static void m21177s() {
        int decodeInt = MultiProcessMMKV.getSingleMMKV("brandService").decodeInt("BizTimeLineOpenStatus", BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() ? 1 : -1);
        if (decodeInt == 1) {
            f55632i = Boolean.TRUE;
        } else if (decodeInt == 0) {
            f55632i = Boolean.FALSE;
        } else {
            boolean decodeBool = C20583z.f57949a.mo32230c().decodeBool("BizTLRecommendFeedsSvrOpen", false);
            Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsSvrOpen = " + decodeBool);
            f55632i = Boolean.valueOf(decodeBool);
            Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "isRecFeedsOpen svrOpen %b", Boolean.valueOf(decodeBool));
        }
    }
}
