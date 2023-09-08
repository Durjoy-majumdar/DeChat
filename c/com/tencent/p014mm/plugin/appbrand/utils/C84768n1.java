package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.V8ScriptEvaluateRequest;
import com.eclipsesource.mmv8.V8ScriptWxaFileDescriptor;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83716o4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83172l;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.n1 */
public class C84768n1 {

    /* renamed from: a */
    public static String f247185a;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.n1$a */
    public class C84769a implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ String f247186a;

        /* renamed from: b */
        public final /* synthetic */ C84754j1.C84756b f247187b;

        /* renamed from: c */
        public final /* synthetic */ long f247188c;

        public C84769a(String str, C84754j1.C84756b bVar, long j) {
            this.f247186a = str;
            this.f247187b = bVar;
            this.f247188c = j;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            C84754j1.m104417a(this.f247186a, this.f247187b, str, this.f247188c);
            C84754j1.C84756b bVar = this.f247187b;
            if (bVar instanceof C84754j1.C84757c) {
                ((C84754j1.C84757c) bVar).mo117481a(gVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.n1$b */
    public class C84770b implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ String f247189a;

        /* renamed from: b */
        public final /* synthetic */ C84754j1.C84756b f247190b;

        /* renamed from: c */
        public final /* synthetic */ long f247191c;

        public C84770b(String str, C84754j1.C84756b bVar, long j) {
            this.f247189a = str;
            this.f247190b = bVar;
            this.f247191c = j;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            C84754j1.m104417a(this.f247189a, this.f247190b, str, this.f247191c);
            C84754j1.C84756b bVar = this.f247190b;
            if (bVar instanceof C84754j1.C84757c) {
                ((C84754j1.C84757c) bVar).mo117481a(gVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.n1$c */
    public class C84771c implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ String f247192a;

        /* renamed from: b */
        public final /* synthetic */ C84754j1.C84756b f247193b;

        /* renamed from: c */
        public final /* synthetic */ long f247194c;

        public C84771c(String str, C84754j1.C84756b bVar, long j) {
            this.f247192a = str;
            this.f247193b = bVar;
            this.f247194c = j;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            C84754j1.m104417a(this.f247192a, this.f247193b, str, this.f247194c);
            C84754j1.C84756b bVar = this.f247193b;
            if (bVar instanceof C84754j1.C84757c) {
                ((C84754j1.C84757c) bVar).mo117481a(gVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.n1$d */
    public class C84772d implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C84754j1.C84756b f247195a;

        public C84772d(C84754j1.C84756b bVar) {
            this.f247195a = bVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            if (str == null || !str.contains("11111")) {
                C84754j1.C84756b bVar = this.f247195a;
                if (bVar != null) {
                    bVar.mo114825b(str);
                    return;
                }
                return;
            }
            C84754j1.C84756b bVar2 = this.f247195a;
            if (bVar2 != null) {
                bVar2.onSuccess(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.n1$e */
    public enum C84773e {
        LIB,
        USR
    }

    /* renamed from: a */
    public static String m104425a() {
        if (Util.isNullOrNil(f247185a)) {
            Context context = MMApplicationContext.getContext();
            Class cls = C1523c3.class;
            if (C86312j.m106916h(cls)) {
                ((C1523c3) C86312j.m106911c(cls)).waitFor();
            }
            f247185a = context.getFilesDir().getAbsolutePath() + "/" + "wasae.dat";
        }
        return f247185a;
    }

    /* renamed from: b */
    public static void m104426b(C81925i2 i2Var, C83165i iVar, String str, String[] strArr, C84754j1.C84756b bVar) {
        String str2;
        int i;
        C81298o0 o0Var;
        C81925i2 i2Var2 = i2Var;
        C83165i iVar2 = iVar;
        String str3 = str;
        String[] strArr2 = strArr;
        if (i2Var2 != null && iVar2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String appId = i2Var.getAppId();
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            C83187w wVar = (C83187w) iVar2.mo63321n0(C83187w.class);
            Objects.requireNonNull(wVar);
            C81298o0 e0 = i2Var.mo114270e0();
            Objects.requireNonNull(e0);
            int i2 = 0;
            Log.m105925i("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles start assemble requests, appId:%s, key:%s, paths.size:%d", appId, str3, Integer.valueOf(strArr2.length));
            String f = m104430f(i2Var2, C84773e.USR);
            boolean b = C81289m.C81290a.m99664b(i2Var.getRuntime().f238149o.f239365g);
            int length = strArr2.length;
            while (i2 < length) {
                String str4 = strArr2[i2];
                if (TextUtils.isEmpty(str4)) {
                    o0Var = e0;
                } else {
                    C81298o0.C81299a openReadPartialInfo = e0.openReadPartialInfo(str4);
                    if (openReadPartialInfo == null) {
                        o0Var = e0;
                        Log.m105921e("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles for appId(%s) path(%s) not found", appId, str4);
                    } else {
                        o0Var = e0;
                        StringBuilder sb = new StringBuilder();
                        sb.append(f);
                        i = length;
                        sb.append(C81412d0.m99875i(str4));
                        String sb4 = sb.toString();
                        if (!b) {
                            String a = C83716o4.m102756a(i2Var.getRuntime(), str4, f);
                            if (!TextUtils.isEmpty(a)) {
                                str2 = f;
                                V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
                                v8ScriptEvaluateRequest.scriptText = a;
                                v8ScriptEvaluateRequest.scriptType = 3;
                                linkedList.addLast(v8ScriptEvaluateRequest);
                                linkedList2.addLast(m104428d(str4, openReadPartialInfo, sb4));
                                i2++;
                                C81925i2 i2Var3 = i2Var;
                                e0 = o0Var;
                                length = i;
                                f = str2;
                            }
                        }
                        str2 = f;
                        linkedList2.addLast(m104428d(str4, openReadPartialInfo, sb4));
                        i2++;
                        C81925i2 i2Var32 = i2Var;
                        e0 = o0Var;
                        length = i;
                        f = str2;
                    }
                }
                str2 = f;
                i = length;
                i2++;
                C81925i2 i2Var322 = i2Var;
                e0 = o0Var;
                length = i;
                f = str2;
            }
            ArrayList arrayList = new ArrayList(linkedList.size() + linkedList2.size() + 1);
            arrayList.addAll(linkedList);
            arrayList.addAll(linkedList2);
            arrayList.add(m104427c());
            Log.m105925i("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles start invoke batchEvaluateJavascript, appId:%s, key:%s, paths.size:%d", appId, str3, Integer.valueOf(strArr2.length));
            wVar.mo115395O(arrayList, m104425a(), new C84769a(str3, bVar, currentTimeMillis));
        }
    }

    /* renamed from: c */
    public static V8ScriptEvaluateRequest m104427c() {
        V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
        v8ScriptEvaluateRequest.scriptType = 3;
        v8ScriptEvaluateRequest.scriptText = String.format(Locale.ENGLISH, "\n;(function(){return %d;})();", new Object[]{11111});
        return v8ScriptEvaluateRequest;
    }

    /* renamed from: d */
    public static V8ScriptEvaluateRequest m104428d(String str, C81298o0.C81299a aVar, String str2) {
        String str3 = aVar.f238718c;
        V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
        v8ScriptEvaluateRequest.scriptType = 2;
        V8ScriptWxaFileDescriptor v8ScriptWxaFileDescriptor = new V8ScriptWxaFileDescriptor();
        v8ScriptEvaluateRequest.scriptWxaFd = v8ScriptWxaFileDescriptor;
        v8ScriptWxaFileDescriptor.wxaPkgPath = aVar.f238720e;
        v8ScriptWxaFileDescriptor.wxaFileName = aVar.f238721f;
        v8ScriptEvaluateRequest.scriptName = str2;
        v8ScriptEvaluateRequest.lineNumber = 0;
        v8ScriptEvaluateRequest.cacheCategory = C81412d0.m99875i(aVar.f238721f).replace(XVFSFile.SEPARATOR_CHAR, '_') + "_" + aVar.f238716a;
        v8ScriptEvaluateRequest.cacheKey = str3;
        v8ScriptEvaluateRequest.cacheType = 0;
        return v8ScriptEvaluateRequest;
    }

    /* renamed from: e */
    public static void m104429e(C83165i iVar, String str) {
        try {
            iVar.mo63304R0(new URL(str + "break.js"), "breakprogram();", (ValueCallback<String>) null);
        } catch (MalformedURLException unused) {
        }
    }

    /* renamed from: f */
    public static String m104430f(C81925i2 i2Var, C84773e eVar) {
        return eVar == C84773e.LIB ? i2Var.mo114343n0() : eVar == C84773e.USR ? i2Var.mo114346q0() : "";
    }

    /* renamed from: g */
    public static void m104431g(C81925i2 i2Var, C83165i iVar, String str, String str2, String str3, int i, String str4, C84773e eVar, C84754j1.C84756b bVar) {
        C81925i2 i2Var2 = i2Var;
        C83165i iVar2 = iVar;
        String str5 = str;
        C84754j1.C84756b bVar2 = bVar;
        if (i2Var2 == null) {
            Log.m105928w("MicroMsg.JsValidationInjectorWC", "hy: service is null! abort");
            return;
        }
        String f = m104430f(i2Var2, eVar);
        String p0 = i2Var2.mo114345p0(str5);
        String str6 = f + str5;
        LinkedList<String> linkedList = C84754j1.f247167a;
        Log.m105925i("MicroMsg.JsValidationInjector", "hy: injecting file %s", str6);
        long currentTimeMillis = System.currentTimeMillis();
        if (Util.isNullOrNil(str4)) {
            Log.m105920e("MicroMsg.JsValidationInjector", "hy: empty script!");
            if (bVar2 != null) {
                bVar2.mo114825b("isNullOrNil script");
                return;
            }
            return;
        }
        String str7 = (str4 + String.format("\n;(function(){return %d;})();", new Object[]{11111})) + Util.nullAsNil(p0);
        URL url = null;
        if (str6 != null) {
            try {
                if (str6.length() > 0) {
                    url = new URL(str6);
                }
            } catch (MalformedURLException unused) {
                Log.m105920e("MicroMsg.JsValidationInjector", "hy: MalformedURLException");
                bVar2.mo114825b("MalformedURLException");
                return;
            }
        }
        URL url2 = url;
        long length = (long) str7.length();
        C83187w wVar = (C83187w) iVar2.mo63321n0(C83187w.class);
        if (wVar != null) {
            wVar.mo115397R(url2, str2, str3, i, str7, new C84762k1(length, str6, bVar, currentTimeMillis));
        } else if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
            iVar2.mo63304R0(url2, str7, new C84764l1(str6, bVar2, currentTimeMillis));
        } else {
            iVar.mo63303P0(url2, str2, str3, i, str7, new C84766m1(str6, bVar2, currentTimeMillis));
        }
    }

    /* renamed from: h */
    public static void m104432h(C81925i2 i2Var, C83165i iVar, String str, String str2, C84773e eVar, C84754j1.C84756b bVar) {
        if (!Util.isNullOrNil(str2)) {
            C83172l lVar = (C83172l) iVar.mo63321n0(C83172l.class);
            if (lVar != null) {
                try {
                    lVar.mo115392G(str2 + String.format(Locale.ENGLISH, "\n;(function(){return %d;})();", new Object[]{11111}), new URL(m104430f(i2Var, eVar) + str).toString(), new C84772d(bVar));
                } catch (MalformedURLException unused) {
                }
            }
        } else if (bVar != null) {
            bVar.mo114825b("isNullOrNil script");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m104433i(com.tencent.p014mm.plugin.appbrand.C81925i2 r15, com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, android.content.res.AssetFileDescriptor r21, com.tencent.p014mm.plugin.appbrand.utils.C84768n1.C84773e r22, com.tencent.p014mm.plugin.appbrand.utils.C84754j1.C84756b r23) {
        /*
            r0 = r15
            r2 = r16
            r3 = r17
            r9 = r23
            java.lang.String r1 = "MicroMsg.JsValidationInjectorWC"
            if (r0 == 0) goto L_0x00ff
            if (r2 != 0) goto L_0x000f
            goto L_0x00ff
        L_0x000f:
            r8 = r22
            java.lang.String r4 = m104430f(r15, r8)
            java.lang.String r5 = r15.mo114345p0(r3)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.w> r6 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r6 = r2.mo63321n0(r6)
            com.tencent.mm.plugin.appbrand.jsruntime.w r6 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w) r6
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00e3
            if (r6 == 0) goto L_0x00e3
            long r7 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 2
            r2.<init>(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r5 = 0
            if (r0 != 0) goto L_0x0055
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0055 }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x0055 }
            r0.append(r4)     // Catch:{ MalformedURLException -> 0x0055 }
            r0.append(r3)     // Catch:{ MalformedURLException -> 0x0055 }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x0055 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0055 }
            r4.<init>(r0)     // Catch:{ MalformedURLException -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r4 = r5
        L_0x0056:
            com.eclipsesource.mmv8.V8ScriptEvaluateRequest r0 = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest
            r0.<init>()
            r10 = 1
            r0.scriptType = r10
            android.os.ParcelFileDescriptor r11 = r21.getParcelFileDescriptor()     // Catch:{ IOException -> 0x0092 }
            com.eclipsesource.mmv8.V8ScriptFileDescriptor r12 = new com.eclipsesource.mmv8.V8ScriptFileDescriptor     // Catch:{ all -> 0x0084 }
            r12.<init>()     // Catch:{ all -> 0x0084 }
            r0.scriptFd = r12     // Catch:{ all -> 0x0084 }
            int r13 = r11.detachFd()     // Catch:{ all -> 0x0084 }
            r12.f234640fd = r13     // Catch:{ all -> 0x0084 }
            com.eclipsesource.mmv8.V8ScriptFileDescriptor r12 = r0.scriptFd     // Catch:{ all -> 0x0084 }
            long r13 = r21.getStartOffset()     // Catch:{ all -> 0x0084 }
            r12.startOffset = r13     // Catch:{ all -> 0x0084 }
            com.eclipsesource.mmv8.V8ScriptFileDescriptor r12 = r0.scriptFd     // Catch:{ all -> 0x0084 }
            long r13 = r21.getLength()     // Catch:{ all -> 0x0084 }
            r12.length = r13     // Catch:{ all -> 0x0084 }
            r11.close()     // Catch:{ IOException -> 0x0092 }
            r5 = r0
            goto L_0x009d
        L_0x0084:
            r0 = move-exception
            r12 = r0
            if (r11 == 0) goto L_0x0091
            r11.close()     // Catch:{ all -> 0x008c }
            goto L_0x0091
        L_0x008c:
            r0 = move-exception
            r11 = r0
            r12.addSuppressed(r11)     // Catch:{ IOException -> 0x0092 }
        L_0x0091:
            throw r12     // Catch:{ IOException -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r0
            java.lang.String r0 = "createEvalRequestForAssetFd, convert scriptFd to v8Fd, get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r11)
        L_0x009d:
            if (r5 != 0) goto L_0x00aa
            java.lang.String r0 = "injectWithFd, convert scriptFd to v8Fd, get null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            java.lang.String r0 = ""
            r9.mo114825b(r0)
            return
        L_0x00aa:
            r5.scriptType = r10
            if (r4 == 0) goto L_0x00b7
            java.lang.String r0 = r4.toString()
            r5.scriptName = r0
            r4 = r18
            goto L_0x00ba
        L_0x00b7:
            r4 = r18
            r0 = r3
        L_0x00ba:
            r5.cacheCategory = r4
            r10 = r19
            r5.cacheKey = r10
            r11 = r20
            r5.cacheType = r11
            int r1 = r2.size()
            r2.add(r1, r5)
            int r1 = r2.size()
            com.eclipsesource.mmv8.V8ScriptEvaluateRequest r3 = m104427c()
            r2.add(r1, r3)
            java.lang.String r1 = m104425a()
            com.tencent.mm.plugin.appbrand.utils.n1$b r3 = new com.tencent.mm.plugin.appbrand.utils.n1$b
            r3.<init>(r0, r9, r7)
            r6.mo115395O(r2, r1, r3)
            goto L_0x00ff
        L_0x00e3:
            r4 = r18
            r10 = r19
            r11 = r20
            java.lang.String r7 = js0.C88016e.m109549f(r21)
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r8 = r22
            r9 = r23
            m104431g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84768n1.m104433i(com.tencent.mm.plugin.appbrand.i2, com.tencent.mm.plugin.appbrand.jsruntime.i, java.lang.String, java.lang.String, java.lang.String, int, android.content.res.AssetFileDescriptor, com.tencent.mm.plugin.appbrand.utils.n1$e, com.tencent.mm.plugin.appbrand.utils.j1$b):void");
    }

    /* renamed from: j */
    public static void m104434j(AppBrandRuntime appBrandRuntime, C83165i iVar, String str, String str2, String str3, String str4, C84773e eVar, C84754j1.C84756b bVar) {
        if (appBrandRuntime == null || appBrandRuntime.mo113047b0() == null) {
            Log.m105924i("MicroMsg.JsValidationInjectorWC", "hy: runtime or service is null!");
            return;
        }
        String b = C81412d0.m99868b(str2, true);
        if (b.startsWith("/__APP__")) {
            b = C81412d0.m99868b(b.substring(8), true);
        }
        String f = m104430f(appBrandRuntime.mo113047b0(), eVar);
        ArrayList arrayList = new ArrayList();
        String a = C83716o4.m102756a(appBrandRuntime, str2, f);
        if (!TextUtils.isEmpty(a)) {
            Log.m105925i("MicroMsg.JsValidationInjectorWC", "inject sourceMap appId[%s] filePath[%s]", appBrandRuntime.f238147j, str2);
            V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
            v8ScriptEvaluateRequest.scriptText = a;
            v8ScriptEvaluateRequest.scriptType = 3;
            arrayList.add(v8ScriptEvaluateRequest);
        }
        V8ScriptEvaluateRequest v8ScriptEvaluateRequest2 = new V8ScriptEvaluateRequest();
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(f.endsWith("/") ? C81412d0.m99875i(b) : b);
        v8ScriptEvaluateRequest2.scriptName = sb.toString();
        v8ScriptEvaluateRequest2.scriptType = 2;
        V8ScriptWxaFileDescriptor v8ScriptWxaFileDescriptor = new V8ScriptWxaFileDescriptor();
        v8ScriptEvaluateRequest2.scriptWxaFd = v8ScriptWxaFileDescriptor;
        v8ScriptWxaFileDescriptor.wxaPkgPath = str;
        v8ScriptWxaFileDescriptor.wxaFileName = b;
        v8ScriptEvaluateRequest2.cacheCategory = str3;
        v8ScriptEvaluateRequest2.cacheKey = str4;
        long currentTimeMillis = System.currentTimeMillis();
        C83187w wVar = (C83187w) iVar.mo63321n0(C83187w.class);
        Objects.requireNonNull(wVar);
        wVar.mo115395O(arrayList, m104425a(), new C84771c(str2, bVar, currentTimeMillis));
    }
}
