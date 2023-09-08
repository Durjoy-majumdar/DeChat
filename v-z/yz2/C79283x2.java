package yz2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusTransparentActivity;

/* renamed from: yz2.x2 */
public final class C79283x2 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusTransparentActivity f232733d;

    public C79283x2(TextStatusTransparentActivity textStatusTransparentActivity) {
        this.f232733d = textStatusTransparentActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f232733d.finish();
    }
}
