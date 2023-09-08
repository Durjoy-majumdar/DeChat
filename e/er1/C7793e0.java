package er1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60905o;
import te3.C64237ap1;
import zp3.C23555k;

/* renamed from: er1.e0 */
public final class C7793e0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ String f26298a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f26299b;

    /* renamed from: c */
    public final /* synthetic */ BaseFinderFeed f26300c;

    /* renamed from: d */
    public final /* synthetic */ C64237ap1 f26301d;

    public C7793e0(String str, C60905o oVar, BaseFinderFeed baseFinderFeed, C64237ap1 ap12) {
        this.f26298a = str;
        this.f26299b = oVar;
        this.f26300c = baseFinderFeed;
        this.f26301d = ap12;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            Log.m105924i("Finder.FeedFullConvert", "create same, exposed tmplInfoId:" + this.f26298a);
            C7801g0 g0Var = C7801g0.f26318a;
            Context context = this.f26299b.f173499A;
            C87412m.m108593f(context, "holder.context");
            C7801g0.m7947a(g0Var, context, this.f26300c, this.f26301d, false);
        }
    }
}
