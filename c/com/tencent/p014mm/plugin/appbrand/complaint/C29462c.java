package com.tencent.p014mm.plugin.appbrand.complaint;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.complaint.C29465d;
import com.tencent.p014mm.plugin.webview.model.C6032f2;
import com.tencent.p014mm.plugin.webview.model.C6048m1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import e00.C45518r0;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import z04.C112551y;

@C86522b(creator = C29465d.C29466a.class, dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.complaint.c */
public final class C29462c extends C86301e implements C81607h {

    /* renamed from: d */
    public static final C29462c f80306d = new C29462c();

    /* renamed from: e */
    public static final Set<String> f80307e = new LinkedHashSet();

    /* renamed from: f */
    public static String f80308f;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/g;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.complaint.c$a */
    public static final class C29463a<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C29463a<InputType, ResultType> f80309d = new C29463a<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C29462c.f80306d.getClass();
            Log.m105924i("MicroMsg.AppBrandComplaintService", "cleanCacheDir, cacheDir:" + C29462c.f80308f);
            C86013q1.m106445f(C29462c.f80308f);
            for (String str : C29462c.f80307e) {
                C6048m1 m1Var = (C6048m1) ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70759jq();
                m1Var.getClass();
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.WebViewJSSDKFileItemManager", "removeJSSDKFileItem, local id is null");
                } else {
                    Log.m105925i("MicroMsg.WebViewJSSDKFileItemManager", "removeJSSDKFileItem, localId:%s", str);
                    m1Var.f22343a.remove(str);
                }
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.complaint.c$b */
    public static final class C29464b<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C29464b<InputType, ResultType> f80310d = new C29464b<>();

        public void invoke(Object obj, C1256g gVar) {
            C29462c cVar = C29462c.f80306d;
            String str = ((IPCString) obj).f10315d;
            C87412m.m108593f(str, "data.value");
            cVar.getClass();
            WebViewJSSDKImageItem webViewJSSDKImageItem = new WebViewJSSDKImageItem();
            webViewJSSDKImageItem.f22268w = false;
            webViewJSSDKImageItem.f283024g = str;
            webViewJSSDKImageItem.f283023f = str;
            webViewJSSDKImageItem.f283022e = C6032f2.m5914a(str);
            ((C6048m1) ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70759jq()).mo7009a(webViewJSSDKImageItem);
            Log.m105924i("MicroMsg.AppBrandComplaintService", "registerFileItem, filePath:" + str + ", localId:" + webViewJSSDKImageItem.f283022e);
            Set<String> set = C29462c.f80307e;
            String str2 = webViewJSSDKImageItem.f283022e;
            C87412m.m108593f(str2, "fileItem.localId");
            set.add(str2);
        }
    }

    static {
        C86009m1 m1Var;
        try {
            m1Var = C86009m1.m106378c(MMApplicationContext.getContext().getExternalCacheDir());
        } catch (Exception unused) {
            m1Var = null;
        }
        if (m1Var == null) {
            m1Var = new C86009m1(MMApplicationContext.getContext().getCacheDir());
        }
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "cacheDir.absolutePath");
        if (!C112551y.m153808h(i, "/", false, 2, (Object) null)) {
            i = i + XVFSFile.SEPARATOR_CHAR;
        }
        String str = i + "wxacomplaint";
        if (C86013q1.m106461v(str)) {
            f80308f = str;
        }
    }

    public void Y80(String str) {
        C87412m.m108594g(str, "path");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(str), C29464b.f80310d.getClass(), (C1256g) null);
    }

    /* renamed from: bl */
    public void mo56718bl() {
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C29463a.f80309d.getClass(), (C1256g) null);
    }

    /* renamed from: vn */
    public String mo56719vn() {
        return f80308f;
    }
}
