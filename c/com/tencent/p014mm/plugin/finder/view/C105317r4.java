package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.r4 */
public final class C105317r4 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProgressBar f312945d;

    public C105317r4(FinderProgressBar finderProgressBar) {
        this.f312945d = finderProgressBar;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderProgressBar$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Log.m105924i("Finder.ProgressBar", "onLongClick...");
        FinderProgressBar finderProgressBar = this.f312945d;
        int i = FinderProgressBar.f312887h;
        finderProgressBar.mo149749b(true, 0);
        view.performHapticFeedback(0, 2);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/view/FinderProgressBar$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
