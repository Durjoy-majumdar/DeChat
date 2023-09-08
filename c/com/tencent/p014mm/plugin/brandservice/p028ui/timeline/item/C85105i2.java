package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.MutableContextWrapper;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18466p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C19638y;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import js0.C88020k;
import kg3.C76577a;
import kj2.C117407d;
import q73.C89538a;
import q73.C89567w;
import r73.C89894f;
import s73.C90150b;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i2 */
public final class C85105i2 extends C89567w {

    /* renamed from: P */
    public static final /* synthetic */ int f247985P = 0;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i2$a */
    public static final class C85106a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C85106a f247986d = new C85106a();

        public C85106a() {
            super(0);
        }

        public Object invoke() {
            int i = C85105i2.f247985P;
            return Float.valueOf(C76577a.m92161l(C89894f.f258347d.mo124202b()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i2$b */
    public static final class C85107b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C85107b f247987d = new C85107b();

        public C85107b() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf(((float) C18466p.m19102a(C89894f.f258347d.mo124202b())) / C88020k.m109556g());
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i2$c */
    public static final class C85108c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f247988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85108c(String str) {
            super(0);
            this.f247988d = str;
        }

        public Object invoke() {
            C19627t tVar = C19627t.f55586a;
            String str = this.f247988d;
            C87412m.m108594g(str, "canvasId");
            Log.m105918d("MicroMsg.BizCardLogic", "replaceTimelineAd lastTraceId=" + C19627t.f55593h);
            String str2 = C19627t.f55593h;
            boolean z = true;
            if (!(str2 == null || C112551y.m153811k(str2))) {
                String substring = str.substring(10);
                C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                if (C19636w0.f55627d) {
                    if (!Util.isEqual(C19627t.f55593h, substring)) {
                        Log.m105918d("MicroMsg.BizCardLogic", "replaceTimelineAd is not replace traceId " + substring);
                    } else {
                        ((C119157j) C119157j.f356862d).mo183876g(C19638y.f55634d, "BizInsertTlRecCardThread");
                        return Boolean.valueOf(z);
                    }
                } else if (Util.isEqual(C19627t.f55593h, substring)) {
                    Log.m105924i("MicroMsg.BizCardLogic", "replaceTimelineAd but not in timeline lastTranceId=" + C19627t.f55593h + ", canvasId=" + str);
                    C117407d.INSTANCE.mo182089r(1454, 160, 1);
                    tVar.mo25828b("adReplace", "err_code:2,err_msg:'not in timeline', traceid:'" + C19627t.f55593h + '\'');
                    C19627t.f55593h = null;
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85105i2(BizTLRecCardJsEngine bizTLRecCardJsEngine, C40427l0 l0Var, C40427l0 l0Var2, C90150b bVar) {
        super(bizTLRecCardJsEngine, l0Var, l0Var2, bVar);
        C87412m.m108594g(bizTLRecCardJsEngine, "tlJsEngine");
        C87412m.m108594g(l0Var, "bizPkg");
        C87412m.m108594g(l0Var2, "wxaPkg");
        C87412m.m108594g(bVar, "performanceReporter");
    }

    /* renamed from: D1 */
    public String mo72993D1() {
        return "BizRenderJsEngine";
    }

    /* renamed from: N1 */
    public C89538a mo118108N1(String str, MutableContextWrapper mutableContextWrapper, boolean z, boolean z2) {
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(mutableContextWrapper, "contextWrapper");
        C89538a N1 = super.mo118108N1(str, mutableContextWrapper, z, z2);
        if (C87412m.m108589b(str, "__biz_video_channel_canvas_id__")) {
            N1.f257665i = C85106a.f247986d;
            N1.f257666j = C85107b.f247987d;
        }
        if (C19627t.f55586a.mo25839m() && C112551y.m153819s(str, "__ad_card_", false)) {
            N1.f257667n = new C85108c(str);
        }
        return N1;
    }
}
