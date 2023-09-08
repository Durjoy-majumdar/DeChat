package zs1;

import com.tencent.p014mm.plugin.finder.webview.p800ad.ExpandableScrollFrameLayout;

/* renamed from: zs1.c */
public final class C53805c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExpandableScrollFrameLayout f150974d;

    public C53805c(ExpandableScrollFrameLayout expandableScrollFrameLayout) {
        this.f150974d = expandableScrollFrameLayout;
    }

    public final void run() {
        C53812i dialog = this.f150974d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
