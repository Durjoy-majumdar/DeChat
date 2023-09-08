package qk1;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: qk1.a1 */
public final class C12788a1 extends C103853a {

    /* renamed from: d */
    public final String f36610d = "FinderLiveFansPagerAdapter";

    /* renamed from: e */
    public ArrayList<View> f36611e = new ArrayList<>();

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(obj, "object");
        String str = this.f36610d;
        Log.m105924i(str, "destroyItem pos:" + i);
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f36611e.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "container");
        String str = this.f36610d;
        Log.m105924i(str, "instantiateItem pos:" + i);
        View view = this.f36611e.get(i);
        C87412m.m108593f(view, "viewList[position]");
        View view2 = view;
        viewGroup.addView(view2);
        return view2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        C87412m.m108594g(view, "p0");
        C87412m.m108594g(obj, "p1");
        return C87412m.m108589b(view, obj);
    }
}
