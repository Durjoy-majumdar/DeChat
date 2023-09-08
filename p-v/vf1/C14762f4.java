package vf1;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderOriginalRequestUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.f4 */
public final class C14762f4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderOriginalRequestUI f40736d;

    public C14762f4(FinderOriginalRequestUI finderOriginalRequestUI) {
        this.f40736d = finderOriginalRequestUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f40736d.f14635t;
        if (checkBox != null) {
            checkBox.toggle();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderOriginalRequestUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("readCheckBox");
        throw null;
    }
}
