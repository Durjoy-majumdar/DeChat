package gr1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13539y3;

/* renamed from: gr1.s */
public final class C8425s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27421d;

    public C8425s(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f27421d = finderFullSeekBarLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$initHorizontalBtn$horizontalClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39818r rVar = C39818r.f106831a;
        Context context = this.f27421d.getContext();
        C87412m.m108593f(context, "context");
        C13539y3 y3Var = (C13539y3) rVar.mo62443b(context).mo75002a(C13539y3.class);
        y3Var.f38408x = true;
        y3Var.getContext().setRequestedOrientation(11);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$initHorizontalBtn$horizontalClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
