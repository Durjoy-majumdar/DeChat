package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import kr0.C76629w0;
import ky2.C10432i;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.a */
public final class C83472a {

    /* renamed from: a */
    public static final C83472a f243917a = new C83472a();

    /* renamed from: b */
    public static HashMap<String, C83473a> f243918b = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.a$a */
    public static final class C83473a {

        /* renamed from: a */
        public String f243919a = "";
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.a$b */
    public static final class C83474b extends C87413o implements C32226l<WxaAttributes, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f243920d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83474b(String str) {
            super(1);
            this.f243920d = str;
        }

        public Object invoke(Object obj) {
            WxaAttributes wxaAttributes = (WxaAttributes) obj;
            C87412m.m108594g(wxaAttributes, "info");
            Log.m105919d("MicroMsg.AppBrandTeenModeReporter", "reportRemoveCollection username: %s, nickname: %s", this.f243920d, wxaAttributes.field_nickname);
            C115669n.INSTANCE.mo160131h(20911, 2, this.f243920d, wxaAttributes.field_nickname);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.a$c */
    public static final class C83475c extends C87413o implements C32226l<WxaAttributes, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f243921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83475c(String str) {
            super(1);
            this.f243921d = str;
        }

        public Object invoke(Object obj) {
            WxaAttributes wxaAttributes = (WxaAttributes) obj;
            C87412m.m108594g(wxaAttributes, "info");
            Log.m105919d("MicroMsg.AppBrandTeenModeReporter", "reportTeenModeToast username: %s, nickname: %s", this.f243921d, wxaAttributes.field_nickname);
            C115669n.INSTANCE.mo160131h(20912, 2, 10, this.f243921d, wxaAttributes.field_nickname);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public static final void m102434c(String str) {
        if (!(str == null || str.length() == 0) && ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106884tG(str, new C55536b(new C83474b(str)));
        }
    }

    /* renamed from: d */
    public static final void m102435d(String str) {
        if (!(str == null || str.length() == 0) && ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106884tG(str, new C55536b(new C83475c(str)));
        }
    }

    /* renamed from: a */
    public final void mo115771a(String str, int i) {
        if (!(str == null || str.length() == 0)) {
            HashMap<String, C83473a> hashMap = f243918b;
            String b = mo115772b(str, i);
            C83473a aVar = new C83473a();
            C87412m.m108594g(str, "<set-?>");
            aVar.f243919a = str;
            hashMap.put(b, aVar);
            Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "addCollection %s, %d, %d", str, Integer.valueOf(i), Integer.valueOf(f243918b.size()));
        }
    }

    /* renamed from: b */
    public final String mo115772b(String str, int i) {
        return str + ',' + i;
    }

    /* renamed from: e */
    public final void mo115773e(ArrayList<AppBrandRecentTaskInfo> arrayList) {
        f243918b.clear();
        if (arrayList != null) {
            for (AppBrandRecentTaskInfo appBrandRecentTaskInfo : arrayList) {
                if (appBrandRecentTaskInfo != null) {
                    String str = appBrandRecentTaskInfo.f239040d;
                    if (!(str == null || str.length() == 0)) {
                        Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "getAllCollectionList info: %s, %d", appBrandRecentTaskInfo.f239040d, Integer.valueOf(appBrandRecentTaskInfo.f239042f));
                        f243917a.mo115771a(appBrandRecentTaskInfo.f239040d, appBrandRecentTaskInfo.f239042f);
                    }
                }
            }
        }
    }
}
