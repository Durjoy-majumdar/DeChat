package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.autogen.events.FinderTagClickEvent;
import com.tencent.p014mm.plugin.finder.view.FinderTagView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C8478d0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C51270sn1;

/* renamed from: com.tencent.mm.plugin.finder.view.f5 */
public final class C4054f5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderTagView f18168d;

    /* renamed from: com.tencent.mm.plugin.finder.view.f5$a */
    public static final class C4055a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTagView f18169d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f18170e;

        public C4055a(FinderTagView finderTagView, C8478d0 d0Var) {
            this.f18169d = finderTagView;
            this.f18170e = d0Var;
        }

        public final void run() {
            FinderTagView finderTagView = this.f18169d;
            C51270sn1 sn12 = finderTagView.getTagData().f139904d.get(this.f18170e.f27483d);
            C87412m.m108593f(sn12, "tagData.topic_list[indexClick]");
            C51270sn1 sn13 = sn12;
            finderTagView.f17951i.put(Long.valueOf(sn13.f141618e), 1);
            FinderTagClickEvent finderTagClickEvent = new FinderTagClickEvent();
            finderTagClickEvent.f9253d.f9254a = sn13;
            finderTagClickEvent.publish();
        }
    }

    public C4054f5(FinderTagView finderTagView) {
        this.f18168d = finderTagView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderTagView$genItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderTagView.C3978a aVar = FinderTagView.f17945w;
        Object tag = view.getTag(-1);
        C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) tag).booleanValue();
        C8478d0 d0Var = new C8478d0();
        Object tag2 = view.getTag(-2);
        C87412m.m108592e(tag2, "null cannot be cast to non-null type kotlin.Int");
        d0Var.f27483d = ((Integer) tag2).intValue();
        int size = this.f18168d.getAllAddViews().size();
        for (int i = 0; i < size; i++) {
            if (i == d0Var.f27483d) {
                FinderTagView finderTagView = this.f18168d;
                View view2 = finderTagView.getAllAddViews().get(i);
                C87412m.m108593f(view2, "allAddViews[i]");
                finderTagView.mo4716c(true, view2, -1);
            } else {
                FinderTagView finderTagView2 = this.f18168d;
                View view3 = finderTagView2.getAllAddViews().get(i);
                C87412m.m108593f(view3, "allAddViews[i]");
                finderTagView2.mo4716c(false, view3, -1);
            }
        }
        if (!booleanValue) {
            new MMHandler().postUI(new C4055a(this.f18168d, d0Var));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderTagView$genItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
