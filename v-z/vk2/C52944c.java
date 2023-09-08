package vk2;

import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vk2.c */
public final class C52944c implements MMWebView.C45106e {

    /* renamed from: d */
    public final /* synthetic */ BaseBoxDialogView f147788d;

    public C52944c(BaseBoxDialogView baseBoxDialogView) {
        this.f147788d = baseBoxDialogView;
    }

    /* renamed from: y2 */
    public final void mo24942y2(int i, int i2, int i3, int i4) {
        boolean z = false;
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onWebViewScrollChanged l: %d, t: %d, oldl: %d, oldt: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        BaseBoxDialogView baseBoxDialogView = this.f147788d;
        if (i2 == 0) {
            z = true;
        }
        baseBoxDialogView.f315752W = z;
    }
}
