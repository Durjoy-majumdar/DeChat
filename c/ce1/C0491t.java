package ce1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ce1.C0479p;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ce1.t */
public final class C0491t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1215d;

    public C0491t(C0479p pVar) {
        this.f1215d = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0479p pVar = this.f1215d;
        C0479p.C0481b bVar = C0479p.f1167N;
        Object clone = pVar.getIntent().clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type android.content.Intent");
        Log.m105924i("FinderActivityPostUIC", "cancelActivity");
        AppCompatActivity activity = pVar.getActivity();
        activity.setResult(-1, (Intent) clone);
        if (!activity.isFinishing()) {
            activity.finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
