package yz2;

import android.widget.PopupWindow;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusRecentStatusView;

/* renamed from: yz2.s2 */
public final class C53720s2 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusRecentStatusView f150829d;

    public C53720s2(TextStatusRecentStatusView textStatusRecentStatusView) {
        this.f150829d = textStatusRecentStatusView;
    }

    public final void onDismiss() {
        this.f150829d.f117011j = null;
    }
}
