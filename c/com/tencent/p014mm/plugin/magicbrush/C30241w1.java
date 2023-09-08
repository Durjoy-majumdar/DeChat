package com.tencent.p014mm.plugin.magicbrush;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.plugin.magicbrush.pkg.MagicPkgCheckerListener;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.file.XVFSFile;
import d42.C31066c0;
import d42.C31068j;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import e42.C31415g;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i52.C33208c;
import i52.C33209f;
import i52.C87661e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import q52.C35766o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112550d0;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.w1 */
public final class C30241w1 extends C86301e implements C30211n0 {

    /* renamed from: d */
    public final C13601g f81703d = C36568h.m40985a(C30242a.f81706d);

    /* renamed from: e */
    public final HashMap<String, WeakReference<C86186n>> f81704e = new HashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap<String, C32226l<String, C86186n>> f81705f = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.magicbrush.w1$a */
    public static final class C30242a extends C87413o implements C32224a<MagicPkgCheckerListener> {

        /* renamed from: d */
        public static final C30242a f81706d = new C30242a();

        public C30242a() {
            super(0);
        }

        public Object invoke() {
            return new MagicPkgCheckerListener();
        }
    }

    /* renamed from: My */
    public void mo57229My(String str, C32226l<? super String, ? extends C86186n> lVar) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(lVar, "impl");
        Log.m105918d("MagicPkgFeatureService", "hy: mb pkg impl registering " + str);
        this.f81705f.put(str, lVar);
    }

    /* renamed from: SE */
    public boolean mo57240SE(String str, String str2, boolean z, C31066c0 c0Var) {
        C87412m.m108594g(str, "pkgId");
        C87412m.m108594g(str2, "baseId");
        if (MMApplicationContext.isMainProcess()) {
            return C87661e.m109006d().mo122080b(str, str2, z, c0Var);
        }
        Bundle bundle = new Bundle();
        bundle.putString("pkgId", str);
        bundle.putString("baseId", str2);
        bundle.putBoolean("isAutoCheck", z);
        return ((IPCBoolean) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, bundle, C30230t1.class)).f10312d;
    }

    public void X90(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "pkgId");
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(str3, "signature");
        C87412m.m108594g(str4, "op");
        if (MMApplicationContext.isMainProcess()) {
            C87661e.m109006d().mo122084g(str, str2, str3, str4);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("pkgId", str);
        bundle.putString("url", str2);
        bundle.putString("signature", str3);
        bundle.putString("op", str4);
        C80907o.m98783f(WeChatProcess.PROCESS_MAIN, bundle, C30238v1.class);
    }

    /* renamed from: Zl */
    public synchronized C86186n mo57230Zl(String str) {
        C87412m.m108594g(str, "instanceName");
        WeakReference weakReference = this.f81704e.get(str);
        C86186n nVar = weakReference != null ? (C86186n) weakReference.get() : null;
        if (nVar != null) {
            return nVar;
        }
        String g0 = C112550d0.m153797g0(str, "-", str);
        C32226l lVar = this.f81705f.get(g0);
        if (lVar != null) {
            Object invoke = lVar.invoke(str);
            this.f81704e.put(str, new WeakReference((C86186n) invoke));
            C86186n nVar2 = (C86186n) invoke;
            if (nVar2 != null) {
                return nVar2;
            }
        }
        throw new RuntimeException("Not providing new instance impl for bizname " + g0);
    }

    /* renamed from: d */
    public void mo57242d(String str) {
        C87412m.m108594g(str, "pkgId");
        C33208c.f90103a.mo59020b();
    }

    /* renamed from: g */
    public String mo57243g(String str) {
        C87412m.m108594g(str, "pkgId");
        String c = C33209f.m39987c(str, TPMediaCompositionHelper.XML_TAG_ASSERT);
        C87412m.m108593f(c, "getMagicAssetsPkgPath(pkgId)");
        return c;
    }

    /* renamed from: gY */
    public void mo57244gY(String str) {
        C87412m.m108594g(str, "pkgId");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ((MagicPkgCheckerListener) ((C36570n) this.f81703d).getValue()).getClass();
        Log.m105925i("MicroMsg.MagicPkgCheckerListener", "registerMagicPkg pkgId:%s", lowerCase);
        MultiProcessMMKV multiDefault = MultiProcessMMKV.getMultiDefault();
        if (multiDefault == null) {
            Log.m105928w("MicroMsg.MagicPkgCheckerListener", "getMultiDefault failed, sp is null.");
            return;
        }
        Set<String> stringSet = multiDefault.getStringSet("MagicPkgPreLoadPkgId", new HashSet());
        if (!stringSet.contains(lowerCase)) {
            stringSet.add(lowerCase);
            multiDefault.edit().putStringSet("MagicPkgPreLoadPkgId", stringSet).commit();
        }
        if (!((CopyOnWriteArraySet) MagicPkgCheckerListener.f81661e).contains(lowerCase)) {
            ((CopyOnWriteArraySet) MagicPkgCheckerListener.f81661e).add(lowerCase);
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("MagicPkgFeatureService", "onAccountInitialized call alive");
            ((MagicPkgCheckerListener) ((C36570n) this.f81703d).getValue()).alive();
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("MagicPkgFeatureService", "onAccountReleased call dead");
            ((MagicPkgCheckerListener) ((C36570n) this.f81703d).getValue()).dead();
        }
    }

    /* renamed from: pl */
    public void mo57245pl(String str) {
        C87412m.m108594g(str, "pkgId");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ((MagicPkgCheckerListener) ((C36570n) this.f81703d).getValue()).getClass();
        Log.m105925i("MicroMsg.MagicPkgCheckerListener", "unregisterMagicPkg pkgId:%s", lowerCase);
        MultiProcessMMKV multiDefault = MultiProcessMMKV.getMultiDefault();
        if (multiDefault == null) {
            Log.m105928w("MicroMsg.MagicPkgCheckerListener", "getMultiDefault failed, sp is null.");
            return;
        }
        Set<String> stringSet = multiDefault.getStringSet("MagicPkgPreLoadPkgId", new HashSet());
        if (stringSet.contains(lowerCase)) {
            stringSet.remove(lowerCase);
            multiDefault.edit().putStringSet("MagicPkgPreLoadPkgId", stringSet).commit();
        }
        if (((CopyOnWriteArraySet) MagicPkgCheckerListener.f81661e).contains(lowerCase)) {
            ((CopyOnWriteArraySet) MagicPkgCheckerListener.f81661e).remove(lowerCase);
        }
    }

    public WxaMagicPkgInfo zs0(String str) {
        WxaMagicPkgInfo wxaMagicPkgInfo;
        String str2 = str;
        Class cls = C30204k0.class;
        C87412m.m108594g(str2, "pkgId");
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (MMApplicationContext.isMainProcess()) {
            wxaMagicPkgInfo = C87661e.m109006d().mo122082e(lowerCase);
        } else {
            C87661e d = C87661e.m109006d();
            WxaMagicPkgInfo c = d.mo122081c(lowerCase);
            if (c != null) {
                Log.m105925i("MicroMsg.MagicPkgLogic", "return pkgId:%s, debug pkg info", lowerCase);
            } else {
                C31068j wt02 = ((C30204k0) C86312j.m106911c(cls)).wt0("MagicPkgSyncSTORAGE", (String) null);
                if (wt02 != null) {
                    Object[] w = wt02.mo57966w("MagicPkgSyncSTORAGE", lowerCase);
                    C31415g gVar = (C31415g) w[0];
                    String str3 = gVar == C31415g.C7595b.f25862a ? (String) w[1] : null;
                    if (str3 != null) {
                        String[] split = str3.split(",");
                        HashMap hashMap = new HashMap();
                        for (String split2 : split) {
                            String[] split3 = split2.split(XVFSFile.PATH_SEPARATOR);
                            hashMap.put(split3[0], split3[1]);
                        }
                        c = new WxaMagicPkgInfo();
                        c.f81564d = (String) hashMap.get("pkgId");
                        c.f81565e = (String) hashMap.get("url");
                        c.f81566f = (String) hashMap.get("md5");
                        c.f81567g = (String) hashMap.get("pkgpath");
                        c.f81568h = (String) hashMap.get("unzippath");
                        c.f81569i = (String) hashMap.get("originalName");
                        c.f81570j = Integer.parseInt((String) hashMap.get("pkgtype"));
                        c.f81571n = (String) hashMap.get("patchId");
                        c.f81572o = (String) hashMap.get(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                        c.f81573p = (String) hashMap.get("wxapath");
                        if (!C33209f.m39991g(c)) {
                            d.mo122085h(c);
                            Log.m105925i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,file not exist", c.f81564d, c.f81571n);
                            C115669n.INSTANCE.mo175913w(1909, 32, 1);
                        } else if (Util.isNullOrNil(c.f81573p)) {
                            if (Util.isNullOrNil(c.f81569i)) {
                                c.f81573p = C35766o.f95534a.mo60387a(c.f81568h);
                            } else {
                                c.f81573p = c.f81567g;
                            }
                        }
                    } else {
                        Log.m105925i("MicroMsg.MagicPkgLogic", "pkg:%s,file not in storage,errNo:%d,errMsg:%s", lowerCase, Integer.valueOf(gVar.f84089a), gVar.f84090b);
                    }
                } else {
                    Log.m105921e("MicroMsg.MagicPkgLogic", "pkg:%s,get storage fail,storage is nil", lowerCase);
                }
                wxaMagicPkgInfo = null;
            }
            wxaMagicPkgInfo = c;
        }
        if (wxaMagicPkgInfo != null) {
            synchronized (C33208c.f90103a) {
                long currentTimeMillis = System.currentTimeMillis();
                C31068j wt03 = ((C30204k0) C86312j.m106911c(cls)).wt0("MagicPkgSyncSTORAGE", (String) null);
                if (wt03 != null) {
                    C31415g b = wt03.mo57964b("MagicPkgSyncSTORAGE", "MagicPkgClean" + lowerCase, String.valueOf(currentTimeMillis), "String");
                    Log.m105925i("MicroMsg.MagicPkgCleaner", "registBiz:%s,currentTime:%d,errNo:%d,errMsg:%s", lowerCase, Long.valueOf(currentTimeMillis), Integer.valueOf(b.f84089a), b.f84090b);
                } else {
                    Log.m105921e("MicroMsg.MagicPkgCleaner", "registBiz:%s,fail mmkv is nil", lowerCase);
                }
            }
        } else if (C87412m.m108589b(lowerCase, "magicemo")) {
            return MMApplicationContext.isMainProcess() ? C87661e.m109006d().mo122082e(lowerCase) : (WxaMagicPkgInfo) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(lowerCase), C30235u1.class);
        }
        return wxaMagicPkgInfo;
    }
}
