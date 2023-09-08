package xt0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85030c;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xt0.r */
public class C91345r extends C54256s {

    /* renamed from: n */
    public final /* synthetic */ C85030c f261987n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91345r(C85030c cVar, Context context) {
        super(context);
        this.f261987n = cVar;
    }

    /* renamed from: a */
    public PointF mo17380a(int i) {
        return ((LinearLayoutManager) this.f261987n.f247784e.getLayoutManager()).mo16988f(i);
    }

    /* renamed from: d */
    public void mo17383d() {
        C85030c cVar = this.f261987n;
        if (cVar.f247794r) {
            cVar.getClass();
        }
    }

    /* renamed from: e */
    public void mo17384e() {
        super.mo17384e();
        Log.m105925i("ViewPagerHelper", "alvinluo SmoothScrollerForFling onStop %d", Integer.valueOf(this.f261987n.f247784e.getScrollState()));
        if (this.f261987n.f247784e.getScrollState() == 0) {
            this.f261987n.mo117995c();
        }
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        return 40.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: n */
    public int mo65616n() {
        return -1;
    }
}
