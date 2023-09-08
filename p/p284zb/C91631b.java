package p284zb;

import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.C83716o4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81301p0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81386x1;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83172l;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import js0.C9514m;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1044ub.C90636f;
import p284zb.C91635f;
import p963fc.C86812g;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: zb.b */
public abstract class C91631b<SERVICE extends C91635f> implements C90636f {

    /* renamed from: d */
    public final SERVICE f262488d;

    /* renamed from: e */
    public final C83185u f262489e;

    /* renamed from: f */
    public final C91646m f262490f;

    /* renamed from: g */
    public final SparseIntArray f262491g = new SparseIntArray();

    /* renamed from: h */
    public final SparseIntArray f262492h = new SparseIntArray();

    public C91631b(SERVICE service, C83185u uVar) {
        this.f262488d = service;
        this.f262489e = uVar;
        C13601g gVar = C91648o.f262623a;
        C87412m.m108594g(service, "env");
        C87412m.m108594g(uVar, "contextManager");
        this.f262490f = ((Boolean) ((C36570n) C91648o.f262623a).getValue()).booleanValue() ? new C91650p(service, uVar) : new C91647n(uVar);
    }

    /* renamed from: A */
    public void mo122585A(C90636f.C90637a aVar, boolean z, long j, long j2, Object obj) {
    }

    /* renamed from: B */
    public void mo122586B(String str) {
    }

    /* renamed from: a */
    public C40480g mo120933a() {
        C40480g X = this.f262489e.mo115378X();
        mo122592j(X);
        mo125501m(X);
        return X;
    }

    @JavascriptInterface
    public final int alloc() {
        int allocEmpty = allocEmpty();
        if (allocEmpty <= 0) {
            return allocEmpty;
        }
        C40480g F0 = this.f262489e.mo115375F0(allocEmpty);
        ICommLibReader k = this.f262488d.mo114272k();
        if (k == null) {
            Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc get NULL LibReader, id[%d], appId[%s]", Integer.valueOf(allocEmpty), this.f262488d.getAppId());
            return 0;
        }
        mo120937y(allocEmpty, mo120935h());
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        try {
            Pair<Boolean, C80669j.C80676g> k2 = mo125498k(F0, mo120935h(), k);
            linkedList.add((Boolean) k2.first);
            linkedList2.add((C80669j.C80676g) k2.second);
            mo122602x(allocEmpty, mo120935h(), linkedList, linkedList2);
            return F0.getContextId();
        } catch (C81386x1 unused) {
            mo122586B(mo120935h());
            mo122602x(allocEmpty, mo120935h(), linkedList, linkedList2);
            return 0;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e, "alloc::injectSdkScript::" + mo120935h(), new Object[0]);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            mo122602x(allocEmpty, mo120935h(), linkedList, linkedList2);
            throw th;
        }
    }

    @JavascriptInterface
    public final int allocEmpty() {
        Throwable th;
        boolean z = true;
        try {
            mo122596q();
            C40480g a = mo120933a();
            if (a == null) {
                Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), allocJsContext failed", this.f262488d.getAppId());
                mo122595p(false);
                return -2;
            }
            Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: created context id is %d", Integer.valueOf(a.getContextId()));
            a.setJsExceptionHandler(new b$$c(this, a));
            this.f262490f.mo125538a(a);
            JSONObject Y = this.f262488d.mo114333Y();
            a.evaluateJavascript(String.format(Locale.US, "var __wxConfig = %s;", new Object[]{Y.toString()}), (ValueCallback<String>) null);
            try {
                int contextId = a.getContextId();
                mo122595p(true);
                return contextId;
            } catch (Throwable th4) {
                th = th4;
                mo122595p(z);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            z = false;
            mo122595p(z);
            throw th;
        }
    }

    @JavascriptInterface
    public int allocFromSnapshot(String str, int i) {
        boolean z = false;
        try {
            mo122598s(str, i);
            Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "allocFromSnapshot, contextName: %s, snapshotContextIndex: %d", str, Integer.valueOf(i));
            C40480g b = mo122587b(i);
            if (b == null) {
                Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), allocJsContext failed", this.f262488d.getAppId());
                mo122597r(str, i, false);
                return -2;
            }
            Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: created context id is %d", Integer.valueOf(b.getContextId()));
            b.setJsExceptionHandler(new b$$a(this, b, str));
            this.f262490f.mo125538a(b);
            mo122600u(str, i);
            JSONObject Y = this.f262488d.mo114333Y();
            b.evaluateJavascript(String.format(Locale.US, ";globalThis.__wxConfig=%s;WeixinSnapshot.snapshotContextReady();", new Object[]{Y}), (ValueCallback<String>) null);
            mo122599t(str, i);
            try {
                int contextId = b.getContextId();
                mo122597r(str, i, true);
                return contextId;
            } catch (Throwable th) {
                th = th;
                z = true;
                mo122597r(str, i, z);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            mo122597r(str, i, z);
            throw th;
        }
    }

    /* renamed from: b */
    public C40480g mo122587b(int i) {
        Object n = mo122593n(i);
        C40480g L = this.f262489e.mo115377L(i);
        if (L == null) {
            return null;
        }
        mo122592j(L);
        mo122594o(i, n);
        mo125501m(L);
        return L;
    }

    /* renamed from: c */
    public void mo122588c(String str, boolean z, C90636f.C90637a[] aVarArr, boolean[] zArr, Object[] objArr, long j, long j2) {
    }

    @JavascriptInterface
    public final int create(String str) {
        Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s)", this.f262488d.getAppId(), str);
        if (Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), nil appScriptPath", this.f262488d.getAppId());
            return -1;
        }
        int alloc = alloc();
        if (alloc <= 0) {
            return alloc;
        }
        C40480g F0 = this.f262489e.mo115375F0(alloc);
        int evaluateScriptFile = evaluateScriptFile(alloc, str);
        if (evaluateScriptFile != 1) {
            Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), appScriptPath(%s), eval ret = %d", this.f262488d.getAppId(), str, Integer.valueOf(evaluateScriptFile));
            return -1;
        }
        Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s), success with contextId(%d)", this.f262488d.getAppId(), str, Integer.valueOf(F0.getContextId()));
        return F0.getContextId();
    }

    /* renamed from: d */
    public void mo122589d(SERVICE service, C40480g gVar) {
        Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "beforeEvaluateScriptFile appId:%s, contextId:%d", service.getAppId(), Integer.valueOf(gVar.getContextId()));
    }

    @JavascriptInterface
    public final void destroy(int i) {
        this.f262489e.mo115376I(i);
    }

    /* renamed from: e */
    public final void mo125495e(C40480g gVar) {
        if (this.f262491g.get(gVar.getContextId(), 0) <= 0) {
            String jSONObject = this.f262488d.mo114340k0().toString();
            String format = String.format(Locale.US, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);", new Object[]{jSONObject});
            long currentTicks = Util.currentTicks();
            gVar.evaluateJavascript(format, (ValueCallback<String>) null);
            Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "ensureFullWxConfigInjected inject wxConfig, appId:%s, cost:%sms", this.f262488d.getAppId(), Long.valueOf(Util.currentTicks() - currentTicks));
            this.f262491g.put(gVar.getContextId(), 1);
        }
    }

    @JavascriptInterface
    public final int evaluateScriptFile(int i, String str) {
        Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d) appScriptPath(%s)", this.f262488d.getAppId(), Integer.valueOf(i), str);
        Assert.assertTrue(i > 1);
        C40480g F0 = this.f262489e.mo115375F0(i);
        if (F0 == null) {
            Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d), appScriptPath(%s), get null context", this.f262488d.getAppId(), Integer.valueOf(i), str);
            return -1;
        } else if (F0.mo63262w()) {
            Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) scriptPath(%s), but want to inject main-context", this.f262488d.getAppId(), str);
            return -1;
        } else {
            if (this.f262492h.get(i, 0) <= 0) {
                mo122589d(this.f262488d, F0);
                this.f262492h.put(i, 1);
            }
            if (this.f262488d.getJsRuntime().mo63321n0(C83187w.class) == null) {
                Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile without v8, appID(%s) contextId(%s) scriptPath(%s)", this.f262488d.getAppId(), Integer.valueOf(i), str);
                try {
                    try {
                        mo125497i(F0, str, mo122591g(this.f262488d, str));
                        return 1;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e, "evaluateScriptFile::injectAppScript::" + str, new Object[0]);
                        throw e;
                    }
                } catch (C81386x1 e2) {
                    Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile without v8, with appID(%s) contextId(%d), appScriptPath(%s), %s", this.f262488d.getAppId(), Integer.valueOf(i), str, e2.getMessage());
                    return 0;
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e3, "getSubContextAppScript", new Object[0]);
                    throw e3;
                }
            } else {
                try {
                    return mo123176l(F0, str) > 0 ? 1 : 0;
                } catch (Exception e4) {
                    Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e4, "evaluateScriptFile::injectWxaScript::" + str, new Object[0]);
                    throw e4;
                }
            }
        }
    }

    /* renamed from: f */
    public int mo122590f() {
        return 1;
    }

    /* renamed from: g */
    public String mo122591g(SERVICE service, String str) {
        String l = C81247g3.m99556l(service.getRuntime(), str);
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        throw new C81386x1(str);
    }

    /* renamed from: h */
    public abstract String mo120935h();

    /* renamed from: i */
    public final void mo125497i(C40480g gVar, String str, String str2) {
        String str3 = str;
        mo125495e(gVar);
        long currentTimeMillis = System.currentTimeMillis();
        PBool pBool = new PBool();
        C9514m mVar = new C9514m();
        C86812g H0 = this.f262488d.getRuntime();
        String str4 = str3.replace(XVFSFile.SEPARATOR_CHAR, '_') + "_" + this.f262488d.getAppId();
        String str5 = this.f262488d.getRuntime().mo113051d0().f261072r.md5;
        C84768n1.C84773e eVar = C84768n1.C84773e.USR;
        b$$f b__f = new b$$f(this, mVar, pBool);
        if (H0 == null || H0.mo113047b0() == null) {
            Log.m105924i("MicroMsg.JsValidationInjectorWC", "hy: runtime or service is null!");
        } else {
            String a = C83716o4.m102756a(H0, str3, C84768n1.m104430f(H0.mo113047b0(), eVar));
            if (!Util.isNullOrNil(a)) {
                C84754j1.m104418b(gVar, (URL) null, a, (C84754j1.C84756b) null);
            } else {
                C40480g gVar2 = gVar;
            }
            C84768n1.m104431g(H0.mo113047b0(), gVar, str, str4, str5, 0, str2, eVar, b__f);
        }
        Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectAppScript with appID(%s), contextId(%d), appScriptPath(%s), succeed(%b)", this.f262488d.getAppId(), Integer.valueOf(gVar.getContextId()), str3, Boolean.valueOf(pBool.value));
        long currentTimeMillis2 = System.currentTimeMillis();
        C90636f.C90637a aVar = new C90636f.C90637a();
        aVar.f260398i = str3;
        aVar.f260399j = str2;
        aVar.f260400k = (long) Util.nullAsNil(str2).length();
        mo122585A(aVar, pBool.value, currentTimeMillis, currentTimeMillis2, mVar.f29691a);
    }

    /* renamed from: j */
    public void mo122592j(C40480g gVar) {
        if (!(C80669j.f236039k != null)) {
            C83172l lVar = (C83172l) gVar.mo63321n0(C83172l.class);
            if (lVar == null || lVar.mo115406b1()) {
                C83187w wVar = (C83187w) gVar.mo63321n0(C83187w.class);
                SERVICE service = this.f262488d;
                C91627a h0 = service instanceof C91635f ? service.f262593H.mo125522h0() : null;
                if (wVar != null && h0 != null) {
                    h0.f262484a.notifyBindConsoleTo(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
                }
            }
        }
    }

    /* renamed from: k */
    public final Pair<Boolean, C80669j.C80676g> mo125498k(C40480g gVar, String str, ICommLibReader iCommLibReader) {
        PBool pBool;
        C9514m mVar;
        String str2;
        PLong pLong;
        String str3 = str;
        long currentTimeMillis = System.currentTimeMillis();
        PBool pBool2 = new PBool();
        C9514m mVar2 = new C9514m();
        PLong pLong2 = new PLong();
        b$$b b__b = new b$$b(this, iCommLibReader, str, pLong2, gVar, mVar2, pBool2);
        AssetFileDescriptor g = mo122603z() ? iCommLibReader.mo113382g(str3) : null;
        if (g == null) {
            b__b.call();
            pLong = pLong2;
            mVar = mVar2;
            pBool = pBool2;
            str2 = str3;
        } else {
            PString pString = new PString();
            pLong2.value = g.getLength();
            Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectSdkScript-injectWithFd, contextId:%d, path:%s", Integer.valueOf(gVar.getContextId()), str3);
            SERVICE service = this.f262488d;
            PString pString2 = pString;
            pLong = pLong2;
            mVar = mVar2;
            pBool = pBool2;
            str2 = str3;
            C84768n1.m104433i(service, gVar, str, str, "v" + this.f262488d.mo114272k().mo113379c().pkgVersion(), mo122590f(), g, C84768n1.C84773e.LIB, new b$$h(this, mVar2, pBool2, gVar, str, pString));
            if (!pBool.value && "Abort for empty source".equals(pString2.value)) {
                b__b.call();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C90636f.C90637a aVar = new C90636f.C90637a();
        aVar.f260398i = str2;
        aVar.f260399j = null;
        aVar.f260400k = pLong.value;
        C9514m mVar3 = mVar;
        mo122585A(aVar, pBool.value, currentTimeMillis, currentTimeMillis2, mVar.f29691a);
        return new Pair<>(Boolean.valueOf(pBool.value), (C80669j.C80676g) mVar3.f29691a);
    }

    /* renamed from: l */
    public int mo123176l(C40480g gVar, String str) {
        String str2 = str;
        mo125495e(gVar);
        long currentTimeMillis = System.currentTimeMillis();
        PBool pBool = new PBool();
        PInt pInt = new PInt();
        C81301p0 k = C81247g3.m99555k(this.f262488d.getRuntime(), false);
        if (k == null) {
            Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript pkgListReader is null, err, appId(%s) scriptPath(%s)", this.f262488d.getAppId(), str2);
            return 0;
        }
        C81298o0.C81299a openReadPartialInfo = k.openReadPartialInfo(str2);
        if (openReadPartialInfo == null) {
            Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript, scriptFileInfo is null, appId(%s) scriptPath(%s)", this.f262488d.getAppId(), str2);
            return 0;
        }
        C9514m mVar = new C9514m();
        C40480g gVar2 = gVar;
        C84768n1.m104426b(this.f262488d, gVar2, str2, new String[]{str2}, new b$$g(this, pBool, mVar, pInt));
        Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript with appID(%s), contextId(%d), appScriptPath(%s), succeed(%b), entry(%s)", this.f262488d.getAppId(), Integer.valueOf(gVar.getContextId()), str2, Boolean.valueOf(pBool.value), String.format(Locale.ENGLISH, "FileEntry{providerId:%s, appVersion:%d, appVersionStr:%s, fileName:%s, fileOffset:%d, fileLength:%d}", new Object[]{openReadPartialInfo.f238716a, Integer.valueOf(openReadPartialInfo.f238717b), openReadPartialInfo.f238718c, openReadPartialInfo.f238721f, Integer.valueOf(openReadPartialInfo.f238722g), Integer.valueOf(openReadPartialInfo.f238723h)}));
        long currentTimeMillis2 = System.currentTimeMillis();
        C90636f.C90637a aVar = new C90636f.C90637a();
        aVar.f260398i = str2;
        aVar.f260399j = null;
        aVar.f260400k = (long) pInt.value;
        aVar.f238716a = openReadPartialInfo.f238716a;
        aVar.f238717b = openReadPartialInfo.f238717b;
        mo122585A(aVar, pBool.value, currentTimeMillis, currentTimeMillis2, mVar.f29691a);
        return pInt.value;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f2  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadJsFilesWithOptions(int r31, java.lang.String r32, java.lang.String r33) {
        /*
            r30 = this;
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            java.lang.String r13 = "loadJsFiles, by batch eval appId[%s] contextId[%d], paths.size[%d], cost[%d]"
            java.lang.String r14 = "loadJsFiles, appId[%s] contextId[%d], paths.size[%d], cost[%d]"
            r15 = 4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            SERVICE r1 = r9.f262488d
            java.lang.String r1 = r1.getAppId()
            r7 = 0
            r0[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r8 = 1
            r0[r8] = r1
            r5 = 2
            r0[r5] = r11
            r6 = 3
            r0[r6] = r12
            java.lang.String r4 = "MicroMsg.AppBrandJSContextInterface[multicontext]"
            java.lang.String r1 = "loadJsFiles appId[%s] contextId[%d] paths[%s] options[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            if (r10 <= r8) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            junit.framework.Assert.assertTrue(r0)
            com.tencent.mm.plugin.appbrand.jsruntime.u r0 = r9.f262489e
            com.tencent.mm.plugin.appbrand.jsruntime.g r3 = r0.mo115375F0(r10)
            if (r3 != 0) goto L_0x0052
            java.lang.Object[] r0 = new java.lang.Object[r5]
            SERVICE r1 = r9.f262488d
            java.lang.String r1 = r1.getAppId()
            r0[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r8] = r1
            java.lang.String r1 = "loadJsFiles appId[%s] contextId[%d] get NULL context"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
            return
        L_0x0052:
            r9.mo125495e(r3)
            android.util.SparseIntArray r0 = r9.f262492h
            int r0 = r0.get(r10, r7)
            if (r0 > 0) goto L_0x0067
            SERVICE r0 = r9.f262488d
            r9.mo122589d(r0, r3)
            android.util.SparseIntArray r0 = r9.f262492h
            r0.put(r10, r8)
        L_0x0067:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02d1 }
            r2.<init>(r11)     // Catch:{ JSONException -> 0x02d1 }
            int r0 = r2.length()
            if (r0 > 0) goto L_0x0088
            java.lang.Object[] r0 = new java.lang.Object[r5]
            SERVICE r1 = r9.f262488d
            java.lang.String r1 = r1.getAppId()
            r0[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r8] = r1
            java.lang.String r1 = "loadJsFiles get EMPTY paths appId[%s] context[%d] e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
            return
        L_0x0088:
            boolean r0 = android.text.TextUtils.isEmpty(r33)     // Catch:{ JSONException -> 0x0094 }
            if (r0 != 0) goto L_0x00ae
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0094 }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x0094 }
            goto L_0x00af
        L_0x0094:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r15]
            SERVICE r15 = r9.f262488d
            java.lang.String r15 = r15.getAppId()
            r1[r7] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r31)
            r1[r8] = r15
            r1[r5] = r12
            r1[r6] = r0
            java.lang.String r0 = "loadJsFiles parse options appId[%s] contextId[%d] options[%s] e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 != 0) goto L_0x00b3
            r1 = 0
            goto L_0x00b9
        L_0x00b3:
            java.lang.String r1 = "key"
            java.lang.String r1 = r0.optString(r1)
        L_0x00b9:
            boolean r15 = android.text.TextUtils.isEmpty(r1)
            if (r15 == 0) goto L_0x00ce
            int r1 = r2.length()
            if (r1 != r8) goto L_0x00ca
            java.lang.String r1 = r2.optString(r7)
            goto L_0x00ce
        L_0x00ca:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r32)
        L_0x00ce:
            r15 = r1
            if (r0 == 0) goto L_0x00dc
            java.lang.String r1 = "initialScript"
            boolean r1 = r0.optBoolean(r1, r7)
            if (r1 == 0) goto L_0x00dc
            r16 = 1
            goto L_0x00de
        L_0x00dc:
            r16 = 0
        L_0x00de:
            r7 = -1
            if (r16 == 0) goto L_0x00e9
            java.lang.String r1 = "initialScriptStartTime"
            long r0 = r0.optLong(r1, r7)
            r7 = r0
        L_0x00e9:
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.w> r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r0 = r3.mo63321n0(r0)
            if (r0 == 0) goto L_0x01f2
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
        L_0x00f7:
            int r11 = r2.length()
            if (r1 >= r11) goto L_0x010d
            java.lang.String r11 = r2.optString(r1)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x010a
            r0.add(r11)
        L_0x010a:
            int r1 = r1 + 1
            goto L_0x00f7
        L_0x010d:
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "start invoke batchInjectUsrJsFiles for appId[%s] contextId[%d] paths.size[%d]"
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0198 }
            SERVICE r6 = r9.f262488d     // Catch:{ all -> 0x0198 }
            java.lang.String r6 = r6.getAppId()     // Catch:{ all -> 0x0198 }
            r17 = 0
            r14[r17] = r6     // Catch:{ all -> 0x0198 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x0198 }
            r18 = 1
            r14[r18] = r6     // Catch:{ all -> 0x0198 }
            int r6 = r0.size()     // Catch:{ all -> 0x0198 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0198 }
            r14[r5] = r6     // Catch:{ all -> 0x0198 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r14)     // Catch:{ all -> 0x0198 }
            SERVICE r14 = r9.f262488d     // Catch:{ all -> 0x0198 }
            r6 = 0
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0198 }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x0198 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0198 }
            zb.b$$d r1 = new zb.b$$d     // Catch:{ all -> 0x0198 }
            r32 = r1
            r1 = r32
            r22 = r2
            r2 = r30
            r10 = r3
            r3 = r15
            r23 = r4
            r4 = r16
            r17 = r13
            r13 = 3
            r16 = 0
            r24 = 2
            r5 = r7
            r25 = 1
            r26 = 0
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ all -> 0x0192 }
            com.tencent.p014mm.plugin.appbrand.utils.C84768n1.m104426b(r14, r10, r15, r0, r1)     // Catch:{ all -> 0x0192 }
            r1 = 4
            java.lang.Object[] r0 = new java.lang.Object[r1]
            SERVICE r1 = r9.f262488d
            java.lang.String r1 = r1.getAppId()
            r0[r26] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r25] = r1
            int r1 = r22.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r24] = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r11
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r13] = r1
            r1 = r17
            r6 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            goto L_0x02a4
        L_0x0192:
            r0 = move-exception
            r1 = r17
            r6 = r23
            goto L_0x01a4
        L_0x0198:
            r0 = move-exception
            r22 = r2
            r6 = r4
            r1 = r13
            r13 = 3
            r24 = 2
            r25 = 1
            r26 = 0
        L_0x01a4:
            java.lang.String r2 = "loadJsFiles, by batch eval appId[%s] contextId[%d], paths.size[%d], exception[%s]"
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01c7 }
            SERVICE r3 = r9.f262488d     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = r3.getAppId()     // Catch:{ all -> 0x01c7 }
            r4[r26] = r3     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x01c7 }
            r4[r25] = r3     // Catch:{ all -> 0x01c7 }
            int r3 = r22.length()     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c7 }
            r4[r24] = r3     // Catch:{ all -> 0x01c7 }
            r4[r13] = r0     // Catch:{ all -> 0x01c7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r4)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r0 = move-exception
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            SERVICE r3 = r9.f262488d
            java.lang.String r3 = r3.getAppId()
            r2[r26] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r31)
            r2[r25] = r3
            int r3 = r22.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r24] = r3
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r11
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r2)
            throw r0
        L_0x01f2:
            r22 = r2
            r10 = r3
            r6 = r4
            r13 = 3
            r24 = 2
            r25 = 1
            r26 = 0
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            SERVICE r0 = r9.f262488d     // Catch:{ all -> 0x025c }
            fc.g r0 = r0.getRuntime()     // Catch:{ all -> 0x025c }
            SERVICE r1 = r9.f262488d     // Catch:{ all -> 0x025c }
            com.tencent.mm.plugin.appbrand.appcache.o0 r19 = r1.mo114270e0()     // Catch:{ all -> 0x025c }
            zb.b$$e r21 = new zb.b$$e     // Catch:{ all -> 0x025c }
            r1 = r21
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r29 = r6
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0258 }
            r16 = r0
            r17 = r22
            r18 = r10
            r20 = r15
            com.tencent.p014mm.plugin.appbrand.jsapi.file.C82492w.m101253w(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0258 }
            r1 = 4
            java.lang.Object[] r0 = new java.lang.Object[r1]
            SERVICE r1 = r9.f262488d
            java.lang.String r1 = r1.getAppId()
            r0[r26] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r25] = r1
            int r1 = r22.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r24] = r1
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r1 = r1 - r27
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r13] = r1
            r1 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r14, r0)
            goto L_0x02a4
        L_0x0258:
            r0 = move-exception
            r1 = r29
            goto L_0x025e
        L_0x025c:
            r0 = move-exception
            r1 = r6
        L_0x025e:
            java.lang.String r2 = "loadJsFileWithOptions appId[%s] contextId[%d] paths[%s] options[%s], get exception %s"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a5 }
            SERVICE r4 = r9.f262488d     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = r4.getAppId()     // Catch:{ all -> 0x02a5 }
            r3[r26] = r4     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x02a5 }
            r3[r25] = r4     // Catch:{ all -> 0x02a5 }
            r3[r24] = r11     // Catch:{ all -> 0x02a5 }
            r3[r13] = r12     // Catch:{ all -> 0x02a5 }
            r4 = 4
            r3[r4] = r0     // Catch:{ all -> 0x02a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)     // Catch:{ all -> 0x02a5 }
            java.lang.Object[] r0 = new java.lang.Object[r4]
            SERVICE r2 = r9.f262488d
            java.lang.String r2 = r2.getAppId()
            r0[r26] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r31)
            r0[r25] = r2
            int r2 = r22.length()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r24] = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r2 = r2 - r27
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r13] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r14, r0)
        L_0x02a4:
            return
        L_0x02a5:
            r0 = move-exception
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            SERVICE r3 = r9.f262488d
            java.lang.String r3 = r3.getAppId()
            r2[r26] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r31)
            r2[r25] = r3
            int r3 = r22.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r24] = r3
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r3 = r3 - r27
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r14, r2)
            throw r0
        L_0x02d1:
            r0 = move-exception
            r1 = r4
            r13 = 3
            r24 = 2
            r25 = 1
            r26 = 0
            java.lang.Object[] r2 = new java.lang.Object[r13]
            SERVICE r3 = r9.f262488d
            java.lang.String r3 = r3.getAppId()
            r2[r26] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r31)
            r2[r25] = r3
            r2[r24] = r0
            java.lang.String r0 = "loadJsFiles parse json appId[%s] context[%d] e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p284zb.C91631b.loadJsFilesWithOptions(int, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public void loadLibFiles(int i, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String optString;
        int i2 = i;
        String str2 = str;
        Object obj = null;
        try {
            mo120937y(i, str);
            int i3 = 3;
            Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles appId:%s, contextId:%d, paths:%s", this.f262488d.getAppId(), Integer.valueOf(i), str2);
            Assert.assertTrue(i2 >= 1);
            C40480g F0 = this.f262489e.mo115375F0(i2);
            if (F0 == null) {
                Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get NULL context by id[%d], appId[%s]", Integer.valueOf(i), this.f262488d.getAppId());
                mo122602x(i2, str2, (List<Boolean>) null, (List<C80669j.C80676g>) null);
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(str2);
                try {
                    ICommLibReader k = this.f262488d.mo114272k();
                    if (k == null) {
                        Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get NULL LibReader, id[%d], appId[%s]", Integer.valueOf(i), this.f262488d.getAppId());
                        mo122602x(i2, str2, (List<Boolean>) null, (List<C80669j.C80676g>) null);
                        return;
                    }
                    int length = jSONArray.length();
                    arrayList4 = new ArrayList(length);
                    try {
                        arrayList = new ArrayList(length);
                        int i4 = 0;
                        while (i4 < length) {
                            try {
                                arrayList4.add(obj);
                                arrayList.add(obj);
                                optString = jSONArray.optString(i4);
                                if (TextUtils.isEmpty(optString)) {
                                    Object[] objArr = new Object[i3];
                                    objArr[0] = Integer.valueOf(i4);
                                    objArr[1] = Integer.valueOf(i);
                                    objArr[2] = this.f262488d.getAppId();
                                    Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get EMPTY name by index[%d] id[%d] appId[%s]", objArr);
                                } else {
                                    Objects.requireNonNull(optString);
                                    Pair<Boolean, C80669j.C80676g> k2 = mo125498k(F0, optString, k);
                                    arrayList4.set(i4, (Boolean) k2.first);
                                    arrayList.set(i4, (C80669j.C80676g) k2.second);
                                }
                            } catch (C81386x1 unused) {
                                Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get EMPTY script by name[%s] index[%d] id[%d] appId[%s]", optString, Integer.valueOf(i4), Integer.valueOf(i), this.f262488d.getAppId());
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.AppBrandJSContextInterface[multicontext]", e, "loadLibFiles::injectSdkScript::" + optString, new Object[0]);
                                throw new RuntimeException(e);
                            } catch (Throwable th) {
                                th = th;
                                arrayList2 = arrayList4;
                                mo122602x(i2, str2, arrayList2, arrayList);
                                throw th;
                            }
                            i4++;
                            obj = null;
                            i3 = 3;
                        }
                        mo122602x(i2, str2, arrayList4, arrayList);
                    } catch (Throwable th4) {
                        th = th4;
                        arrayList2 = arrayList4;
                        arrayList = null;
                        mo122602x(i2, str2, arrayList2, arrayList);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    arrayList4 = null;
                    arrayList2 = arrayList4;
                    arrayList = null;
                    mo122602x(i2, str2, arrayList2, arrayList);
                    throw th;
                }
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles parse paths failed, id[%d] appId[%s] e=%s", Integer.valueOf(i), this.f262488d.getAppId(), e2);
                mo122602x(i2, str2, (List<Boolean>) null, (List<C80669j.C80676g>) null);
            } catch (Throwable th6) {
                th = th6;
                arrayList3 = null;
                arrayList2 = arrayList3;
                arrayList = arrayList2;
                mo122602x(i2, str2, arrayList2, arrayList);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            arrayList3 = null;
            arrayList2 = arrayList3;
            arrayList = arrayList2;
            mo122602x(i2, str2, arrayList2, arrayList);
            throw th;
        }
    }

    /* renamed from: m */
    public final void mo125501m(C40480g gVar) {
        if (gVar != null) {
            C91640i<? extends C91635f> iVar = this.f262488d.f262593H;
            if (iVar.mo122628o0()) {
                C83187w wVar = (C83187w) gVar.mo63321n0(C83187w.class);
                if (wVar == null) {
                    Log.m105920e("MicroMsg.AppBrandJSContextInterface[multicontext]", "notifySubContextCreated, contextV8 is null");
                    return;
                }
                C91627a h0 = iVar.mo125522h0();
                if (h0 != null) {
                    AppBrandCommonBindingJni appBrandCommonBindingJni = h0.f262484a;
                    String str = "SubContext-" + gVar.getContextId();
                    Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "notifySubContextCreated, contextName: %s", str);
                    appBrandCommonBindingJni.notifyContextCreated(wVar.mo115417m(), wVar.mo115393J0(), str);
                }
            }
        }
    }

    /* renamed from: n */
    public Object mo122593n(int i) {
        return null;
    }

    /* renamed from: o */
    public void mo122594o(int i, Object obj) {
    }

    /* renamed from: p */
    public void mo122595p(boolean z) {
    }

    /* renamed from: q */
    public void mo122596q() {
    }

    /* renamed from: r */
    public void mo122597r(String str, int i, boolean z) {
    }

    /* renamed from: s */
    public void mo122598s(String str, int i) {
    }

    /* renamed from: t */
    public void mo122599t(String str, int i) {
    }

    /* renamed from: u */
    public void mo122600u(String str, int i) {
    }

    /* renamed from: v */
    public void mo120936v() {
        this.f262490f.mo125539b();
    }

    /* renamed from: w */
    public void mo122601w(String str, String str2, String str3) {
    }

    /* renamed from: x */
    public void mo122602x(int i, String str, List<Boolean> list, List<C80669j.C80676g> list2) {
    }

    /* renamed from: y */
    public void mo120937y(int i, String str) {
    }

    /* renamed from: z */
    public boolean mo122603z() {
        return true;
    }
}
