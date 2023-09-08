package zs1;

import com.tencent.p014mm.plugin.finder.webview.p800ad.CenterScrollFrameLayout;

/* renamed from: zs1.a */
public final class C53803a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CenterScrollFrameLayout f150972d;

    public C53803a(CenterScrollFrameLayout centerScrollFrameLayout) {
        this.f150972d = centerScrollFrameLayout;
    }

    public final void run() {
        C53812i dialog = this.f150972d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
