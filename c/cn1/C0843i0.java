package cn1;

import a14.C0000n0;
import a14.C53930o0;
import an1.C0098k;
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.CancellationException;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import xm1.C15828e;

/* renamed from: cn1.i0 */
public class C0843i0 extends C60896i<C0098k> {

    /* renamed from: cn1.i0$a */
    public final class C0844a {

        /* renamed from: a */
        public final C0000n0 f1990a = C53930o0.m60555b();

        /* renamed from: b */
        public Application.ActivityLifecycleCallbacks f1991b;

        public C0844a(C0843i0 i0Var) {
        }
    }

    public C0843i0(C15828e eVar) {
        C87412m.m108594g(eVar, "outsideOperator");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cnf;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0098k kVar = (C0098k) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(kVar, "item");
        mo765j(oVar);
        C0844a aVar = new C0844a(this);
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.m_6);
        if (textView != null) {
            textView.setText(kVar.f538d);
        }
        C0847j0 j0Var = new C0847j0(oVar, this);
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(j0Var);
        }
        aVar.f1991b = j0Var;
        oVar.f173502D = aVar;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("LivingTitleConvert", "#onViewRecycled holder=" + oVar);
        mo765j(oVar);
    }

    /* renamed from: j */
    public final void mo765j(C60905o oVar) {
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0844a)) {
            C0844a aVar = (C0844a) obj;
            C53930o0.m60558e(aVar.f1990a, (CancellationException) null, 1, (Object) null);
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = aVar.f1991b;
            if (activityLifecycleCallbacks != null) {
                Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        oVar.f173502D = null;
    }
}
