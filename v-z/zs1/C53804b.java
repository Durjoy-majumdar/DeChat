package zs1;

import com.tencent.p014mm.plugin.finder.webview.p800ad.ExpandableScrollFrameLayout;

/* renamed from: zs1.b */
public final class C53804b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExpandableScrollFrameLayout f150973d;

    public C53804b(ExpandableScrollFrameLayout expandableScrollFrameLayout) {
        this.f150973d = expandableScrollFrameLayout;
    }

    public final void run() {
        C53812i dialog = this.f150973d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
