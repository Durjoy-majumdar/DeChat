package xt0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85030c;

/* renamed from: xt0.q */
public class C91344q extends C54256s {

    /* renamed from: n */
    public final /* synthetic */ C85030c f261986n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91344q(C85030c cVar, Context context) {
        super(context);
        this.f261986n = cVar;
    }

    /* renamed from: a */
    public PointF mo17380a(int i) {
        return ((LinearLayoutManager) this.f261986n.f247784e.getLayoutManager()).mo16988f(i);
    }

    /* renamed from: d */
    public void mo17383d() {
    }

    /* renamed from: e */
    public void mo17384e() {
        super.mo17384e();
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        return 80.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: m */
    public int mo10340m(int i) {
        return super.mo10340m(i);
    }

    /* renamed from: n */
    public int mo65616n() {
        return -1;
    }
}
