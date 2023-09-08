package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.FinderWordingLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.r5 */
public final class C4164r5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderWordingLayout f18397d;

    /* renamed from: com.tencent.mm.plugin.finder.view.r5$a */
    public /* synthetic */ class C4165a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18398a;

        static {
            int[] iArr = new int[FinderWordingLayout.C3984a.values().length];
            iArr[2] = 1;
            f18398a = iArr;
        }
    }

    public C4164r5(FinderWordingLayout finderWordingLayout) {
        this.f18397d = finderWordingLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWordingLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C4165a.f18398a[this.f18397d.getCurrMode().ordinal()] == 1) {
            FinderWordingLayout.m4234d(this.f18397d, false, 1, (Object) null);
        } else {
            this.f18397d.mo4760c();
        }
        this.f18397d.mo4761e();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWordingLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
