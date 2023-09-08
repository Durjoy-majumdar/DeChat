package mf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import jq3.C60905o;
import o40.C61926c;
import pf1.C11920q;
import rf1.C12982a;
import rf1.C12992d;

/* renamed from: mf1.t0 */
public final class C10868t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C11920q f32447d;

    /* renamed from: e */
    public final /* synthetic */ C12982a f32448e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f32449f;

    /* renamed from: g */
    public final /* synthetic */ View f32450g;

    public C10868t0(C11920q qVar, C12982a aVar, C60905o oVar, View view) {
        this.f32447d = qVar;
        this.f32448e = aVar;
        this.f32449f = oVar;
        this.f32450g = view;
    }

    public final void run() {
        C11920q qVar = this.f32447d;
        boolean z = false;
        qVar.f34846t = false;
        C12982a aVar = this.f32448e;
        if (aVar != null) {
            C12992d.C12993a.m12459b(aVar, this.f32449f, this.f32450g, qVar, true, (C32224a) null, 16, (Object) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onJumpViewFocus feedId=");
        BaseFinderFeed baseFinderFeed = this.f32447d.f34830d;
        sb.append(C61926c.m72691p(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0));
        sb.append(" onRealShow view.isVisible=");
        if (this.f32450g.getVisibility() == 0) {
            z = true;
        }
        sb.append(z);
        Log.m105924i("Finder.BaseAdFeedJumperUIC", sb.toString());
    }
}
