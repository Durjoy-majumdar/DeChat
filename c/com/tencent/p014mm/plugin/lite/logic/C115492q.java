package com.tencent.p014mm.plugin.lite.logic;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.lite.C115472a;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C115476a;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.storage.C115508j;
import com.tencent.p014mm.plugin.lite.storage.C30151d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oa1.C117731d;
import org.json.JSONException;
import org.json.JSONObject;
import p1020pa.C89327d;
import p749xh.C66261f3;
import p977hj.C87526a;
import tw0.C90584e;
import tw0.C90586i;
import tw0.C90587j;
import tw0.C90588k;

/* renamed from: com.tencent.mm.plugin.lite.logic.q */
public class C115492q {

    /* renamed from: d */
    public static final String[] f346245d = {"wxalite7b438b4916cd2a37426d5538ac2d3807", "wxalitecd3434f9a28b4db218f4730961d39d55", "wxalite1af500fa066e5b60505c414cd42cacbc", "wxalitebff7a643e2eefdb070cb79979b6ddd7f", "wxalite4868fef42257e6693a564693bd119376", "wxalitedaf40c7482486d1fba380f99afa9f098", "wxalited4df4810a40b1d9ddc0cbea44d263fd9"};

    /* renamed from: e */
    public static C115492q f346246e;

    /* renamed from: a */
    public C115477b f346247a;

    /* renamed from: b */
    public Map<String, C115496d> f346248b = new ConcurrentHashMap();

    /* renamed from: c */
    public HashMap<String, C80916r> f346249c = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.lite.logic.q$a */
    public class C115493a implements C90586i {

        /* renamed from: a */
        public final /* synthetic */ C115496d f346250a;

        /* renamed from: b */
        public final /* synthetic */ String f346251b;

        /* renamed from: c */
        public final /* synthetic */ WxaLiteAppInfo f346252c;

        public C115493a(C115496d dVar, String str, WxaLiteAppInfo wxaLiteAppInfo) {
            this.f346250a = dVar;
            this.f346251b = str;
            this.f346252c = wxaLiteAppInfo;
        }

        /* renamed from: a */
        public /* synthetic */ void mo122087a(List list) {
        }

        /* renamed from: b */
        public void mo122088b(C90587j jVar) {
            C115496d dVar = this.f346250a;
            if (dVar != null) {
                dVar.f346265e = System.currentTimeMillis();
                C115496d dVar2 = this.f346250a;
                dVar2.f346266f = dVar2.f346265e;
            }
            if (!Util.isNullOrNil(jVar.f260272d)) {
                Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", this.f346251b, Integer.valueOf(jVar.f260276h), jVar.f260272d);
                C115485l.INSTANCE.mo175462a(jVar, "release", this.f346250a, C115492q.this.f346247a);
                return;
            }
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp, url is null, appId:%s errorCode:%d responseState:%d", this.f346251b, Integer.valueOf(jVar.f260277i), jVar.f260270b);
            C115477b bVar = C115492q.this.f346247a;
            if (bVar != null) {
                WxaLiteAppInfo wxaLiteAppInfo = this.f346252c;
                if (wxaLiteAppInfo != null) {
                    ((C115490o) bVar).mo5701b(wxaLiteAppInfo, 1);
                    return;
                }
                ((C115490o) bVar).mo5700a(this.f346251b, 2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.logic.q$b */
    public class C115494b implements C1256g<IPCBoolean> {

        /* renamed from: d */
        public final /* synthetic */ String f346254d;

        /* renamed from: e */
        public final /* synthetic */ C115477b f346255e;

        public C115494b(String str, C115477b bVar) {
            this.f346254d = str;
            this.f346255e = bVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            if (((IPCBoolean) obj).f10312d) {
                WxaLiteAppInfo j = C115492q.this.mo175472j(this.f346254d);
                C115477b bVar = this.f346255e;
                if (bVar != null) {
                    bVar.mo5701b(j, 0);
                    return;
                }
                return;
            }
            C115477b bVar2 = this.f346255e;
            if (bVar2 != null) {
                bVar2.mo5700a(this.f346254d, -1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.logic.q$c */
    public class C115495c implements C90586i {

        /* renamed from: a */
        public final /* synthetic */ boolean f346257a;

        /* renamed from: b */
        public final /* synthetic */ C115476a f346258b;

        /* renamed from: c */
        public final /* synthetic */ Map f346259c;

        public C115495c(boolean z, C115476a aVar, Map map) {
            this.f346257a = z;
            this.f346258b = aVar;
            this.f346259c = map;
        }

        /* renamed from: a */
        public void mo122087a(List<C90587j> list) {
            for (C90587j next : list) {
                if (!Util.isNullOrNil(next.f260272d)) {
                    Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", next.f260269a, Integer.valueOf(next.f260276h), next.f260272d);
                    if (!this.f346257a || !next.f260269a.equals(LiteAppCenter.LITE_APP_BASE_LIB)) {
                        C115496d dVar = (C115496d) this.f346259c.get(next.f260269a);
                        if (dVar != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            dVar.f346266f = currentTimeMillis;
                            dVar.f346265e = currentTimeMillis;
                        }
                        C115485l.INSTANCE.mo175462a(next, "release", dVar, C115492q.this.f346247a);
                    } else {
                        C115485l.INSTANCE.mo175463b(next, "release", this.f346258b);
                    }
                } else {
                    Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp, url is null, appId:%s errorCode:%d responseState:%d", next.f260269a, Integer.valueOf(next.f260277i), next.f260270b);
                    if (!this.f346257a || !next.f260269a.equals(LiteAppCenter.LITE_APP_BASE_LIB)) {
                        C115492q qVar = C115492q.this;
                        if (qVar.f346247a != null) {
                            WxaLiteAppInfo j = qVar.mo175472j(next.f260269a);
                            if (j != null) {
                                ((C115490o) C115492q.this.f346247a).mo5701b(j, 1);
                            } else {
                                ((C115490o) C115492q.this.f346247a).mo5700a(next.f260269a, 2);
                            }
                        }
                    } else if (this.f346258b != null) {
                        WxaLiteAppBaselibInfo f = C115492q.this.mo175469f();
                        if (f != null) {
                            this.f346258b.mo175451b(f, 1);
                        } else {
                            this.f346258b.mo175450a(2);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo122088b(C90587j jVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.logic.q$d */
    public class C115496d {

        /* renamed from: a */
        public long f346261a;

        /* renamed from: b */
        public long f346262b;

        /* renamed from: c */
        public C115477b f346263c;

        /* renamed from: d */
        public int f346264d;

        /* renamed from: e */
        public long f346265e;

        /* renamed from: f */
        public long f346266f;

        /* renamed from: g */
        public boolean f346267g;

        /* renamed from: h */
        public long f346268h;

        public C115496d(C115492q qVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.logic.q$e */
    public static final class C115497e implements C80883e<Bundle, IPCBoolean> {
        private C115497e() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("appId");
            long j = bundle.getLong("timeout");
            int i = bundle.getInt("from");
            Boolean valueOf = Boolean.valueOf(bundle.getBoolean("syncCheckUpdate"));
            C115492q g = C115492q.m162360g();
            if (g.f346247a == null) {
                g.f346247a = new C115490o(g);
            }
            long j2 = j < 6000 ? 6000 : j;
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp appId:%s", string);
            WxaLiteAppInfo j3 = C115492q.m162360g().mo175472j(string);
            if (C115492q.m162360g().mo175476n(j3)) {
                String e = C115492q.m162360g().mo175468e(string, j3, valueOf.booleanValue(), i, j2, new C115498r(this, gVar));
                if (e != null) {
                    C115496d dVar = (C115496d) ((ConcurrentHashMap) C115492q.m162360g().f346248b).get(string);
                    C90588k kVar = new C90588k();
                    kVar.f260282a = string;
                    kVar.f260283b = string;
                    kVar.f260284c = e;
                    if (j3 == null || valueOf.booleanValue()) {
                        kVar.f260285d = 1;
                    }
                    ((C90584e) C86312j.m106911c(C90584e.class)).mo60854E9(kVar, new C115499s(this, dVar, string, j3));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "no need download, local pkg is debug");
            gVar.mo894a(new IPCBoolean(true));
        }
    }

    /* renamed from: a */
    public static void m162359a(C115492q qVar, String str, WxaLiteAppInfo wxaLiteAppInfo, int i) {
        C115492q qVar2 = qVar;
        String str2 = str;
        int i2 = i;
        C115496d dVar = (C115496d) ((ConcurrentHashMap) qVar2.f346248b).get(str2);
        if (dVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - dVar.f346262b;
            if (j > 10000 || j < 0) {
                Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception fail errCode=%d start=%d now=%d", Integer.valueOf(i), Long.valueOf(dVar.f346262b), Long.valueOf(currentTimeMillis));
            }
            long j2 = dVar.f346262b;
            long j3 = currentTimeMillis - j2;
            long j4 = dVar.f346265e;
            long j5 = j4 - j2;
            long j6 = dVar.f346266f;
            qVar.mo175479q(i, str, j3, j5, j6 - j4, currentTimeMillis - j6, dVar.f346264d);
            if (dVar.f346263c != null && currentTimeMillis - dVar.f346261a <= dVar.f346268h) {
                WxaLiteAppInfo j7 = (dVar.f346267g && i2 == 8 && wxaLiteAppInfo == null) ? qVar.mo175472j(str) : wxaLiteAppInfo;
                if (j7 == null) {
                    dVar.f346263c.mo5700a(str2, i2);
                } else {
                    dVar.f346263c.mo5701b(j7, i2);
                }
                dVar.f346263c = null;
            }
            ((ConcurrentHashMap) qVar2.f346248b).remove(str2);
        }
    }

    /* renamed from: g */
    public static C115492q m162360g() {
        if (f346246e == null) {
            synchronized (C115492q.class) {
                f346246e = new C115492q();
            }
        }
        return f346246e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        r2 = r1.f339287j;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo175465b() {
        /*
            r6 = this;
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r0 = r6.mo175469f()
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.lite.logic.m r3 = new com.tencent.mm.plugin.lite.logic.m
            r3.<init>(r6, r1, r0)
            java.lang.String r0 = "MicroMsg.LiteApp.LiteAppLogic"
            java.lang.String r1 = "checkLiteAppBaselib"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r1 = r6.mo175469f()
            boolean r2 = r6.mo175475m(r1)
            r4 = 1
            if (r2 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = r1.f339287j
            if (r2 == 0) goto L_0x002e
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = r1.f339287j
            goto L_0x0030
        L_0x002e:
            java.lang.String r2 = ""
        L_0x0030:
            java.lang.String r5 = "begin to wxalitebaselibrary"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            tw0.k r0 = new tw0.k
            r0.<init>()
            java.lang.String r5 = "wxalitebaselibrary"
            r0.f260282a = r5
            r0.f260283b = r5
            r0.f260284c = r2
            if (r1 != 0) goto L_0x0047
            r0.f260285d = r4
        L_0x0047:
            java.lang.Class<tw0.e> r2 = tw0.C90584e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tw0.e r2 = (tw0.C90584e) r2
            com.tencent.mm.plugin.lite.logic.n r4 = new com.tencent.mm.plugin.lite.logic.n
            r4.<init>(r6, r3, r1)
            r2.mo60854E9(r0, r4)
            goto L_0x0060
        L_0x0058:
            java.lang.String r2 = "no need download, local pkg is debug"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r3.mo175451b(r1, r4)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.logic.C115492q.mo175465b():void");
    }

    /* renamed from: c */
    public void mo175466c(String str, boolean z, int i, long j, C115477b bVar) {
        String str2 = str;
        boolean z2 = z;
        long j2 = j;
        C115477b bVar2 = bVar;
        if (MMApplicationContext.isMainProcess()) {
            if (this.f346247a == null) {
                this.f346247a = new C115490o(this);
            }
            long j3 = j2 < 6000 ? 6000 : j2;
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp appId:%s", str2);
            WxaLiteAppInfo j4 = mo175472j(str);
            if (mo175476n(j4)) {
                String e = mo175468e(str, j4, z, i, j3, bVar);
                if (e != null) {
                    C115496d dVar = (C115496d) ((ConcurrentHashMap) this.f346248b).get(str);
                    C90588k kVar = new C90588k();
                    kVar.f260282a = str2;
                    kVar.f260283b = str2;
                    kVar.f260284c = e;
                    if (j4 == null || z2) {
                        kVar.f260285d = 1;
                    }
                    ((C90584e) C86312j.m106911c(C90584e.class)).mo60854E9(kVar, new C115493a(dVar, str, j4));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "no need download, local pkg is debug");
            if (bVar2 != null) {
                bVar2.mo5701b(j4, 1);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putLong("timeout", j2);
        bundle.putInt("from", i);
        bundle.putBoolean("syncCheckUpdate", z);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, bundle, C115497e.class, new C115494b(str, bVar2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r2 = r1.f339287j;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo175467d(java.util.List<java.lang.String> r15, boolean r16, long r17, com.tencent.p014mm.plugin.lite.api.C115477b r19) {
        /*
            r14 = this;
            r8 = r14
            r9 = r16
            com.tencent.mm.plugin.lite.api.b r0 = r8.f346247a
            if (r0 != 0) goto L_0x000e
            com.tencent.mm.plugin.lite.logic.o r0 = new com.tencent.mm.plugin.lite.logic.o
            r0.<init>(r14)
            r8.f346247a = r0
        L_0x000e:
            if (r9 == 0) goto L_0x001e
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r0 = r14.mo175469f()
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.lite.logic.m r3 = new com.tencent.mm.plugin.lite.logic.m
            r3.<init>(r14, r1, r0)
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            r10 = r3
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r15.iterator()
        L_0x0029:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r12.next()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            com.tencent.liteapp.storage.WxaLiteAppInfo r2 = r14.mo175472j(r13)
            boolean r0 = r14.mo175476n(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x0029
        L_0x0041:
            r3 = 0
            r4 = 3
            r0 = r14
            r1 = r13
            r5 = r17
            r7 = r19
            java.lang.String r0 = r0.mo175468e(r1, r2, r3, r4, r5, r7)
            if (r0 != 0) goto L_0x0050
            goto L_0x0029
        L_0x0050:
            tw0.k r1 = new tw0.k
            r1.<init>()
            r1.f260282a = r13
            r1.f260283b = r13
            r1.f260284c = r0
            r11.add(r1)
            goto L_0x0029
        L_0x005f:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.logic.q$d> r1 = r8.f346248b
            r0.<init>(r1)
            if (r9 == 0) goto L_0x0094
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r1 = r14.mo175469f()
            boolean r2 = r14.mo175475m(r1)
            if (r2 == 0) goto L_0x0094
            if (r1 == 0) goto L_0x0081
            java.lang.String r2 = r1.f339287j
            if (r2 == 0) goto L_0x0081
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0081
            java.lang.String r1 = r1.f339287j
            goto L_0x0083
        L_0x0081:
            java.lang.String r1 = ""
        L_0x0083:
            tw0.k r2 = new tw0.k
            r2.<init>()
            java.lang.String r3 = "wxalitebaselibrary"
            r2.f260282a = r3
            r2.f260283b = r3
            r2.f260284c = r1
            r11.add(r2)
        L_0x0094:
            int r1 = r11.size()
            if (r1 <= 0) goto L_0x00aa
            java.lang.Class<tw0.e> r1 = tw0.C90584e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tw0.e r1 = (tw0.C90584e) r1
            com.tencent.mm.plugin.lite.logic.q$c r2 = new com.tencent.mm.plugin.lite.logic.q$c
            r2.<init>(r9, r10, r0)
            r1.mo60857RZ(r11, r2)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.logic.C115492q.mo175467d(java.util.List, boolean, long, com.tencent.mm.plugin.lite.api.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r0.f339297n;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo175468e(java.lang.String r16, com.tencent.liteapp.storage.WxaLiteAppInfo r17, boolean r18, int r19, long r20, com.tencent.p014mm.plugin.lite.api.C115477b r22) {
        /*
            r15 = this;
            r6 = r15
            r5 = r16
            r0 = r17
            r4 = r18
            r7 = r20
            r3 = r22
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.f339297n
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = r0.f339297n
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = ""
        L_0x001c:
            r9 = r1
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            r1[r2] = r9
            java.lang.String r2 = "MicroMsg.LiteApp.LiteAppLogic"
            java.lang.String r10 = "begin to checkLiteApp:%s patchId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r1)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.logic.q$d> r1 = r6.f346248b
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L_0x0092
            r9 = 0
            if (r3 != 0) goto L_0x003b
            return r9
        L_0x003b:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.logic.q$d> r1 = r6.f346248b
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r5)
            r2 = r1
            com.tencent.mm.plugin.lite.logic.q$d r2 = (com.tencent.p014mm.plugin.lite.logic.C115492q.C115496d) r2
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r2.f346261a
            long r12 = r10 - r12
            r1 = 9
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0069
            com.tencent.mm.plugin.lite.api.b r4 = r2.f346263c
            if (r4 == 0) goto L_0x005b
            r4.mo5700a(r5, r1)
        L_0x005b:
            r2.f346263c = r9
            r1 = 8
            if (r0 != 0) goto L_0x0065
            r3.mo5700a(r5, r1)
            goto L_0x0091
        L_0x0065:
            r3.mo5701b(r0, r1)
            goto L_0x0091
        L_0x0069:
            com.tencent.mm.plugin.lite.api.b r0 = r2.f346263c
            if (r0 == 0) goto L_0x0070
            r0.mo5700a(r5, r1)
        L_0x0070:
            r2.f346263c = r3
            r2.f346261a = r10
            r2.f346267g = r4
            r2.f346268h = r7
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r10.<init>(r0)
            com.tencent.mm.plugin.lite.logic.p r11 = new com.tencent.mm.plugin.lite.logic.p
            r0 = r11
            r1 = r15
            r3 = r22
            r4 = r18
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r10.postDelayed(r11, r7)
        L_0x0091:
            return r9
        L_0x0092:
            com.tencent.mm.plugin.lite.logic.q$d r2 = new com.tencent.mm.plugin.lite.logic.q$d
            r2.<init>(r15)
            long r0 = java.lang.System.currentTimeMillis()
            r2.f346261a = r0
            r2.f346262b = r0
            r2.f346265e = r0
            r2.f346266f = r0
            r2.f346263c = r3
            r0 = r19
            r2.f346264d = r0
            r2.f346267g = r4
            r2.f346268h = r7
            java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.logic.q$d> r0 = r6.f346248b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r5, r2)
            if (r3 != 0) goto L_0x00b7
            goto L_0x00d0
        L_0x00b7:
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r10.<init>(r0)
            com.tencent.mm.plugin.lite.logic.p r11 = new com.tencent.mm.plugin.lite.logic.p
            r0 = r11
            r1 = r15
            r3 = r22
            r4 = r18
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r10.postDelayed(r11, r7)
        L_0x00d0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.logic.C115492q.mo175468e(java.lang.String, com.tencent.liteapp.storage.WxaLiteAppInfo, boolean, int, long, com.tencent.mm.plugin.lite.api.b):java.lang.String");
    }

    /* renamed from: f */
    public WxaLiteAppBaselibInfo mo175469f() {
        return m162360g().mo175470h();
    }

    /* renamed from: h */
    public WxaLiteAppBaselibInfo mo175470h() {
        Bundle bundle;
        try {
            bundle = C115508j.m162396a("getLatestLiteAppBaselibInfo", (String) null, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle");
            return null;
        }
        bundle.setClassLoader(WxaLiteAppBaselibInfo.class.getClassLoader());
        return (WxaLiteAppBaselibInfo) bundle.getParcelable("LiteAppBaselib");
    }

    /* renamed from: i */
    public C30151d mo175471i(String str) {
        Bundle bundle;
        try {
            bundle = C115508j.m162396a("getLiteAppAuthInfo", str, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        C30151d dVar = new C30151d();
        dVar.field_host = bundle.getString("host");
        dVar.field_param = bundle.getString("param");
        dVar.field_paramMap = bundle.getString("paramMap");
        dVar.field_headerMap = bundle.getString("headerMap");
        dVar.field_updateTime = bundle.getLong(C66261f3.COL_UPDATETIME);
        return dVar;
    }

    /* renamed from: j */
    public WxaLiteAppInfo mo175472j(String str) {
        Bundle bundle;
        boolean z = false;
        try {
            bundle = C115508j.m162396a("getLiteAppInfo", str, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle, appId:" + str);
            return null;
        }
        bundle.setClassLoader(WxaLiteAppInfo.class.getClassLoader());
        WxaLiteAppInfo wxaLiteAppInfo = (WxaLiteAppInfo) bundle.getParcelable("LiteApp");
        Uri n = C116299g2.m163858n(wxaLiteAppInfo.f339295i + "/pkg/app.json");
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppInfo appId: " + str + ", but appConfigFile not exists.");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", wxaLiteAppInfo.f339290d);
                jSONObject.put("pkgPath", wxaLiteAppInfo.f339295i);
                String replaceAll = jSONObject.toString().replaceAll(",", ";");
                C115669n.INSTANCE.kvStat(23449, "openLiteAppFileNotExists" + "," + replaceAll);
            } catch (JSONException e2) {
                Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e2, "", new Object[0]);
            }
            mo175477o(wxaLiteAppInfo);
            return null;
        }
        WxaLiteAppBaselibInfo f = mo175469f();
        if (f == null) {
            C115472a.f346202a.mo175449e();
        } else {
            Uri n2 = C116299g2.m163858n(f.f339285h + "/meta.json");
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
            if (!(!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b))) {
                C115472a.f346202a.mo175449e();
            } else {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return wxaLiteAppInfo;
    }

    /* renamed from: k */
    public List<WxaLiteAppInfo> mo175473k() {
        Bundle bundle;
        try {
            bundle = C115508j.m162396a("getLiteAppList", (String) null, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppList bundle is null.");
            return null;
        }
        bundle.setClassLoader(WxaLiteAppInfo.class.getClassLoader());
        if (bundle.containsKey("LiteAppList")) {
            return bundle.getParcelableArrayList("LiteAppList");
        }
        return null;
    }

    /* renamed from: l */
    public boolean mo175474l(String str, boolean z) {
        String str2 = str;
        boolean z2 = false;
        String format = String.format("clicfg_liteapp_%s_enable", new Object[]{str2});
        if (MMApplicationContext.isMainProcess()) {
            boolean equalsIgnoreCase = C117731d.m166007c().mo182444f(format, C87526a.m108857b(f346245d, str2) ? "0" : "1", false, true).equalsIgnoreCase("1");
            if (!equalsIgnoreCase || !z) {
                Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "isLiteAppOpen appId%s enable:%b checkCrash=%b", str2, Boolean.valueOf(equalsIgnoreCase), Boolean.valueOf(z));
            } else {
                int i = Util.getInt(C117731d.m166007c().mo182444f(String.format("clicfg_liteapp_%s_max_crash", new Object[]{str2}), String.valueOf(10), false, true), 10);
                WxaLiteAppInfo j = mo175472j(str);
                String str3 = j == null ? "" : j.f339297n;
                int i2 = MultiProcessMMKV.getMultiDefault().getInt(String.format("liteapp_%s_%s", new Object[]{str2, str3}), 0);
                boolean z3 = i2 >= i;
                Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "isLiteAppOpen appId%s version%s enable:%b, crashCount:%d", str2, str3, Boolean.valueOf(equalsIgnoreCase), Integer.valueOf(i2));
                z2 = z3;
            }
            if (z) {
                if (!equalsIgnoreCase) {
                    C115669n.INSTANCE.mo175913w(1293, 102, 1);
                } else if (!z2) {
                    C115669n.INSTANCE.mo175913w(1293, 100, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1293, 101, 1);
                }
            }
            return equalsIgnoreCase;
        }
        Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "can no get 'isLiteAppOpen' value when is no mm process.");
        return false;
    }

    /* renamed from: m */
    public final boolean mo175475m(WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        return wxaLiteAppBaselibInfo == null || !"debug".equalsIgnoreCase(wxaLiteAppBaselibInfo.f339286i) || (System.currentTimeMillis() / 1000) - wxaLiteAppBaselibInfo.f339288n >= 259200;
    }

    /* renamed from: n */
    public final boolean mo175476n(WxaLiteAppInfo wxaLiteAppInfo) {
        return wxaLiteAppInfo == null || !"debug".equalsIgnoreCase(wxaLiteAppInfo.f339296j) || (System.currentTimeMillis() / 1000) - wxaLiteAppInfo.f339301r >= 86400;
    }

    /* renamed from: o */
    public void mo175477o(WxaLiteAppInfo wxaLiteAppInfo) {
        String b = C115501v.m162390b(wxaLiteAppInfo.f339290d, wxaLiteAppInfo.f339297n, wxaLiteAppInfo.f339293g);
        Uri n = C116299g2.m163858n(b);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
            C89327d.m111648a(C86013q1.m106448i(b, false));
        } else {
            Log.m105928w("MicroMsg.LiteApp.LiteAppLogic", "app file don't exist.");
        }
        try {
            C115508j.m162396a("removeLiteAppInfo", wxaLiteAppInfo.f339290d, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
        }
    }

    /* renamed from: p */
    public void mo175478p(String str, boolean z, boolean z2, int i, long j) {
        Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "reportOpenLiteApp %s switchClose=%b withPkg=%b type=%d", str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("pkg", z2);
            jSONObject.put("switchClose", z);
            jSONObject.put("type", i);
            jSONObject.put("time", j);
            String replaceAll = jSONObject.toString().replaceAll(",", ";");
            C115669n nVar = C115669n.INSTANCE;
            nVar.kvStat(23449, "liteAppOpenStatus" + "," + replaceAll);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
        }
    }

    /* renamed from: q */
    public void mo175479q(int i, String str, long j, long j2, long j3, long j4, int i2) {
        int i3 = i;
        Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "reportUpdateTime %s errCode=%d costTime=%d %d,%d,%d from=%d", str, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i2));
        if (i3 != 1 && i3 != 8) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", str);
                jSONObject.put("errCode", i);
                long j5 = j;
                jSONObject.put("time", j);
                long j6 = j2;
                jSONObject.put("tinkerTime", j2);
                jSONObject.put("downloadTime", j3);
                jSONObject.put("checkTime", j4);
                jSONObject.put("from", i2);
                String str2 = str.equals(LiteAppCenter.LITE_APP_BASE_LIB) ? "downloadBaseLib" : "downloadLiteApp";
                String replaceAll = jSONObject.toString().replaceAll(",", ";");
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(23449, str2 + "," + replaceAll);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: r */
    public void mo175480r(C30151d dVar) {
        if (dVar != null) {
            Bundle bundle = new Bundle();
            bundle.putString("host", dVar.field_host);
            bundle.putString("param", dVar.field_param);
            bundle.putString("paramMap", dVar.field_paramMap);
            bundle.putString("headerMap", dVar.field_headerMap);
            bundle.putLong(C66261f3.COL_UPDATETIME, dVar.field_updateTime);
            try {
                C115508j.m162396a("insertLiteAppAuthInfo", dVar.field_host, bundle);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: s */
    public void mo175481s(WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        if (wxaLiteAppBaselibInfo == null) {
            Log.m105920e("MicroMsg.LiteApp.LiteAppLogic", "baselib is empty.");
        } else if (Util.isNullOrNil(wxaLiteAppBaselibInfo.f339285h)) {
            Log.m105920e("MicroMsg.LiteApp.LiteAppLogic", "baselib path is empty.");
        } else {
            Uri n = C116299g2.m163858n(wxaLiteAppBaselibInfo.f339285h);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                Log.m105920e("MicroMsg.LiteApp.LiteAppLogic", "baselib file isn't exist.");
                return;
            }
            String a = C115501v.m162389a(wxaLiteAppBaselibInfo.f339281d, wxaLiteAppBaselibInfo.f339287j, wxaLiteAppBaselibInfo.f339283f);
            if (!a.equalsIgnoreCase(wxaLiteAppBaselibInfo.f339285h)) {
                Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "rename app folder from %s to %s", wxaLiteAppBaselibInfo.f339285h, a);
                C86013q1.m106462w(wxaLiteAppBaselibInfo.f339285h, a);
                wxaLiteAppBaselibInfo.f339285h = a;
            }
            Bundle bundle = new Bundle();
            bundle.setClassLoader(WxaLiteAppBaselibInfo.class.getClassLoader());
            bundle.putParcelable("LiteAppBaselib", wxaLiteAppBaselibInfo);
            try {
                C115508j.m162396a("insertLiteAppBaselibInfo", wxaLiteAppBaselibInfo.f339281d, bundle);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: t */
    public void mo175482t(WxaLiteAppInfo wxaLiteAppInfo) {
        if (wxaLiteAppInfo == null) {
            Log.m105920e("MicroMsg.LiteApp.LiteAppLogic", "app is empty.");
        } else if (Util.isNullOrNil(wxaLiteAppInfo.f339295i)) {
            Log.m105920e("MicroMsg.LiteApp.LiteAppLogic", "app path is empty.");
        } else {
            Uri n = C116299g2.m163858n(wxaLiteAppInfo.f339295i);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                Log.m105920e("MicroMsg.LiteApp.LiteAppLogic", "app file isn't exist.");
                return;
            }
            String b = C115501v.m162390b(wxaLiteAppInfo.f339290d, wxaLiteAppInfo.f339297n, wxaLiteAppInfo.f339293g);
            if (!b.equalsIgnoreCase(wxaLiteAppInfo.f339295i)) {
                Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "rename app folder from %s to %s", wxaLiteAppInfo.f339295i, b);
                Uri n2 = C116299g2.m163858n(b);
                String path2 = n2.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!n2.getPath().equals(k2)) {
                        n2 = n2.buildUpon().path(k2).build();
                    }
                }
                C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                if (!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b)) {
                    C86013q1.m106445f(b);
                }
                C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, l2);
                if (l3.mo177810a()) {
                    l3.f348991a.mo119937g(l3.f348992b);
                }
                C86013q1.m106462w(wxaLiteAppInfo.f339295i, b);
                wxaLiteAppInfo.f339295i = b;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("LiteApp", wxaLiteAppInfo);
            try {
                C115508j.m162396a("insertLiteAppInfo", wxaLiteAppInfo.f339290d, bundle);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            }
        }
    }
}
