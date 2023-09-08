package xi1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import yi1.C66654a;

/* renamed from: xi1.b */
public final class C66285b extends SimplePAGViewUpdateListener implements View.OnClickListener {

    /* renamed from: d */
    public final View f190823d;

    /* renamed from: e */
    public final C66654a f190824e;

    /* renamed from: f */
    public final ViewGroup f190825f;

    /* renamed from: g */
    public final TextView f190826g;

    /* renamed from: h */
    public final View f190827h;

    /* renamed from: i */
    public final PAGView f190828i;

    public C66285b(View view, C66654a aVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(aVar, "adapter");
        this.f190823d = view;
        this.f190824e = aVar;
        View findViewById = view.findViewById(C0966R.C0970id.f358126od2);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…mmon_lottery_bubble_root)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f190825f = viewGroup;
        View findViewById2 = view.findViewById(C0966R.C0970id.f357800bu0);
        C87412m.m108593f(findViewById2, "root.findViewById<TextView>(R.id.countdown)");
        this.f190826g = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.bdp);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.click_area)");
        this.f190827h = findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.oh8);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.pag_animate)");
        PAGView pAGView = (PAGView) findViewById4;
        this.f190828i = pAGView;
        findViewById3.setOnClickListener(this);
        pAGView.setComposition(PAGFile.Load(view.getContext().getAssets(), "small_mile_stone_lottery_amin.pag"));
        pAGView.addListener(this);
        viewGroup.setTranslationY(-((float) C76577a.m92151b(view.getContext(), 16)));
        viewGroup.setTranslationX(-((float) C76577a.m92151b(view.getContext(), 12)));
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
        this.f190826g.setVisibility(0);
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBubbleWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.bdp) {
            this.f190824e.mo74703b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBubbleWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
