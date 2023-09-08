package er1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import da0.C58247e;
import dp1.C58408t0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64237ap1;

/* renamed from: er1.f0 */
public final class C7797f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f26306d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f26307e;

    /* renamed from: f */
    public final /* synthetic */ C64237ap1 f26308f;

    /* renamed from: g */
    public final /* synthetic */ C58247e f26309g;

    /* renamed from: h */
    public final /* synthetic */ MMActivity f26310h;

    public C7797f0(C60905o oVar, BaseFinderFeed baseFinderFeed, C64237ap1 ap12, C58247e eVar, MMActivity mMActivity) {
        this.f26306d = oVar;
        this.f26307e = baseFinderFeed;
        this.f26308f = ap12;
        this.f26309g = eVar;
        this.f26310h = mMActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/utils/FinderCreateSameUtils$refreshCreateSameStatus$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7801g0 g0Var = C7801g0.f26318a;
        Context context = this.f26306d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C7801g0.m7947a(g0Var, context, this.f26307e, this.f26308f, true);
        Context context2 = this.f26306d.f173499A;
        C87412m.m108593f(context2, "holder.context");
        BaseFinderFeed baseFinderFeed = this.f26307e;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context2);
        Activity activity = null;
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        long itemId = baseFinderFeed.getItemId();
        if (context2 instanceof Activity) {
            activity = (Activity) context2;
        }
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                intent.putExtra("key_ref_feed_id", itemId);
            }
            Intent intent2 = activity.getIntent();
            if (intent2 != null) {
                intent2.putExtra("key_ref_comment_scene", q3 != null ? q3.f134675i : 0);
            }
        }
        C58408t0 t0Var = C58408t0.f167336a;
        t0Var.mo83263i(context2, 62);
        int i = this.f26308f.f182116e;
        int i2 = i != 1 ? i != 2 ? -1 : 15 : 12;
        t0Var.mo83266l(20, false);
        C58247e eVar = this.f26309g;
        MMActivity mMActivity = this.f26310h;
        C64237ap1 ap12 = this.f26308f;
        Intent intent3 = mMActivity.getIntent();
        intent3.putExtra("key_maas_entrance", 4);
        C13598b0 b0Var = C13598b0.f38549a;
        eVar.qi0(mMActivity, ap12, intent3, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/utils/FinderCreateSameUtils$refreshCreateSameStatus$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
