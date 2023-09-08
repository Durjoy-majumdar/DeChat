package qo3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qo3.o */
public class C63300o extends C54256s {

    /* renamed from: n */
    public final /* synthetic */ RecyclerView f179624n;

    /* renamed from: o */
    public final /* synthetic */ C77407n f179625o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63300o(C77407n nVar, Context context, RecyclerView recyclerView) {
        super(context);
        this.f179625o = nVar;
        this.f179624n = recyclerView;
    }

    /* renamed from: a */
    public PointF mo17380a(int i) {
        RecyclerView recyclerView = this.f179624n;
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !(this.f179624n.getLayoutManager() instanceof LinearLayoutManager)) ? super.mo17380a(i) : ((LinearLayoutManager) this.f179625o.f225751W0.getLayoutManager()).mo16988f(i);
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        return 1.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: n */
    public int mo65616n() {
        return -1;
    }
}
