package com.tencent.p014mm.plugin.magicbrush.demo.bizlogic;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C86433l;
import e42.C86434m;
import e42.C86436p;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import js0.C88016e;
import kotlin.Metadata;
import l42.C88380a;
import rx3.C13598b0;
import sx3.C26236u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/bizlogic/MagicBrushDemoBizPkgManagement;", "Le42/l;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "mb-samples_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoBizPkgManagement */
public class MagicBrushDemoBizPkgManagement extends C86433l {

    /* renamed from: b */
    public final String f248397b = "MagicBrushDemoPkgManagement";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicBrushDemoBizPkgManagement(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: a */
    public C81415h0 mo109577a() {
        return new C88380a();
    }

    /* renamed from: b */
    public String mo109578b() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRUSH_DEMO;
    }

    /* renamed from: c */
    public String mo109579c() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRUSH_DEMO;
    }

    /* renamed from: d */
    public void mo109580d(C32226l<? super List<? extends C86434m>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "cb");
        Log.m105924i(this.f248397b, "provideMainScript");
        String e = C88016e.m109548e("magicbrush-demo.js");
        C87412m.m108593f(e, "getAssetAsString(\"magicbrush-demo.js\")");
        lVar.invoke(C26236u.m33719b(new C86436p(e)));
    }

    public void release() {
        ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57194rr(this.f251229a);
    }
}
