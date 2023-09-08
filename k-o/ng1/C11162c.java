package ng1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import kg1.C10075a;

/* renamed from: ng1.c */
public final class C11162c extends C103853a {

    /* renamed from: d */
    public final ArrayList<C10075a> f32947d;

    /* renamed from: e */
    public int f32948e;

    public C11162c(ArrayList<C10075a> arrayList, int i) {
        C87412m.m108594g(arrayList, "plugins");
        this.f32947d = arrayList;
        this.f32948e = i;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(obj, "object");
        Log.m105924i("LiveViewPagerPluginAdap", "destroyItem pos:" + i);
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f32947d.size();
    }

    public int getItemPosition(Object obj) {
        C87412m.m108594g(obj, "object");
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "container");
        Log.m105924i("LiveViewPagerPluginAdap", "instantiateItem pos:" + i + " maxHeight: " + this.f32948e);
        View R = this.f32947d.get(i).mo10508R();
        if (R.getParent() != null) {
            Log.m105924i("LiveViewPagerPluginAdap", "instantiateItem removeView " + R.getClass().getCanonicalName());
            ViewParent parent = R.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(R);
            }
        }
        this.f32947d.get(i).mo10507I(this.f32948e);
        if (!(R instanceof FinderLiveBoxConstraintLayout)) {
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "container.context");
            FinderLiveBoxConstraintLayout finderLiveBoxConstraintLayout = new FinderLiveBoxConstraintLayout(context);
            finderLiveBoxConstraintLayout.setTag("LiveViewPagerPluginAdap");
            ViewParent parent2 = R.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(R);
            }
            finderLiveBoxConstraintLayout.addView(R, new ConstraintLayout.LayoutParams(-1, -1));
            if (R.getId() == -1) {
                R.setId(View.generateViewId());
            }
            C16569a aVar = new C16569a();
            aVar.mo16716c(finderLiveBoxConstraintLayout);
            aVar.mo16717d(R.getId(), 1, 0, 1);
            aVar.mo16717d(R.getId(), 2, 0, 2);
            aVar.mo16717d(R.getId(), 4, 0, 4);
            aVar.mo16714a(finderLiveBoxConstraintLayout);
            finderLiveBoxConstraintLayout.setConstraintSet((C16569a) null);
            viewGroup.addView(finderLiveBoxConstraintLayout);
            ViewParent parent3 = R.getParent();
            C87412m.m108592e(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) parent3;
        }
        viewGroup.addView(R);
        return R;
    }

    public boolean isViewFromObject(View view, Object obj) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(obj, "object");
        return C87412m.m108589b(view, obj);
    }
}
