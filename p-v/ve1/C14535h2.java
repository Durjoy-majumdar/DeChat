package ve1;

import android.view.MotionEvent;
import android.view.View;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.plugin.finder.view.FinderFeedLiveRecommendView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.h2 */
public final class C14535h2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40282d;

    /* renamed from: e */
    public final /* synthetic */ C0797z f40283e;

    /* renamed from: f */
    public final /* synthetic */ int f40284f;

    /* renamed from: g */
    public final /* synthetic */ FinderFeedFullLiveConvert f40285g;

    /* renamed from: ve1.h2$a */
    public static final class C14536a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullLiveConvert f40286d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40287e;

        /* renamed from: f */
        public final /* synthetic */ C0797z f40288f;

        public C14536a(FinderFeedFullLiveConvert finderFeedFullLiveConvert, C60905o oVar, C0797z zVar) {
            this.f40286d = finderFeedFullLiveConvert;
            this.f40287e = oVar;
            this.f40288f = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f40286d;
            C60905o oVar = this.f40287e;
            View view2 = oVar.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            finderFeedFullLiveConvert.mo2280Q(oVar, view2, this.f40288f.mo3513o().getFinderObject());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.h2$b */
    public static final class C14537b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullLiveConvert f40289d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40290e;

        public C14537b(FinderFeedFullLiveConvert finderFeedFullLiveConvert, C60905o oVar) {
            this.f40289d = finderFeedFullLiveConvert;
            this.f40290e = oVar;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f40289d;
            C60905o oVar = this.f40290e;
            View view2 = oVar.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            Object obj = this.f40290e.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            finderFeedFullLiveConvert.mo2282S(oVar, view2, (C0797z) obj, (MotionEvent) null);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public C14535h2(C60905o oVar, C0797z zVar, int i, FinderFeedFullLiveConvert finderFeedFullLiveConvert) {
        this.f40282d = oVar;
        this.f40283e = zVar;
        this.f40284f = i;
        this.f40285g = finderFeedFullLiveConvert;
    }

    public final void run() {
        ((FinderFeedLiveRecommendView) this.f40282d.mo85812D(C0966R.C0970id.d9p)).mo4539i(this.f40283e.mo3513o().getLiveInfo(), this.f40284f);
        ((FinderFeedLiveRecommendView) this.f40282d.mo85812D(C0966R.C0970id.d9p)).setOnClickListener(new C14536a(this.f40285g, this.f40282d, this.f40283e));
        ((FinderFeedLiveRecommendView) this.f40282d.mo85812D(C0966R.C0970id.d9p)).setOnLongClickListener(new C14537b(this.f40285g, this.f40282d));
    }
}
