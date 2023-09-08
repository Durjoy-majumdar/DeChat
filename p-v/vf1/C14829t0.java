package vf1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotSearchUI;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;

/* renamed from: vf1.t0 */
public final class C14829t0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderHotSearchUI f40826d;

    public C14829t0(FinderHotSearchUI finderHotSearchUI) {
        this.f40826d = finderHotSearchUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderHotSearchUI$initSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderHotSearchUI finderHotSearchUI = this.f40826d;
        int i = FinderHotSearchUI.f14427q;
        finderHotSearchUI.getClass();
        Intent intent = new Intent();
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, finderHotSearchUI, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        AppCompatActivity context = finderHotSearchUI.getContext();
        C87412m.m108593f(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).Rx0(context, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderHotSearchUI$initSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
