package vf1;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveCreateVisitorModeUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.z1 */
public final class C14854z1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCreateVisitorModeUI f40868d;

    public C14854z1(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f40868d = finderLiveCreateVisitorModeUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMEditText mMEditText = this.f40868d.f14501t;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        ImageView imageView = this.f40868d.f14502u;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
