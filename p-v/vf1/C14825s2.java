package vf1;

import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveEndUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import z04.C112551y;

/* renamed from: vf1.s2 */
public final class C14825s2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveEndUI f40821d;

    public C14825s2(FinderLiveEndUI finderLiveEndUI) {
        this.f40821d = finderLiveEndUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveEndUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveEndUI finderLiveEndUI = this.f40821d;
        if (C112551y.m153810j(finderLiveEndUI.f14516t, finderLiveEndUI.f14514r, false, 2, (Object) null)) {
            FinderLiveEndUI finderLiveEndUI2 = this.f40821d;
            finderLiveEndUI2.setMMTitle(finderLiveEndUI2.getResources().getString(C0966R.string.e2o));
            FinderLiveEndUI finderLiveEndUI3 = this.f40821d;
            String str = finderLiveEndUI3.f14515s;
            if (str == null) {
                str = "";
            }
            try {
                finderLiveEndUI3.f14516t = str;
                MMWebView mMWebView = finderLiveEndUI3.f14512p;
                if (mMWebView != null) {
                    mMWebView.loadUrl(str);
                }
                finderLiveEndUI3.mo3018N7();
            } catch (IOException e) {
                Log.m105920e(finderLiveEndUI3.f14511o, e.getMessage());
            }
            FinderLiveEndUI finderLiveEndUI4 = this.f40821d;
            Button button = finderLiveEndUI4.f14513q;
            if (button != null) {
                button.setText(finderLiveEndUI4.getResources().getString(C0966R.string.e2l, new Object[]{5}));
            }
        } else {
            FinderLiveEndUI finderLiveEndUI5 = this.f40821d;
            if (C112551y.m153810j(finderLiveEndUI5.f14516t, finderLiveEndUI5.f14515s, false, 2, (Object) null)) {
                this.f40821d.setResult(-1);
                this.f40821d.finish();
            } else {
                this.f40821d.finish();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveEndUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
