package xz2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.textstatus.third.TextStatusActionTask;

/* renamed from: xz2.v */
public final class C79023v implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusActionTask f232029d;

    public C79023v(TextStatusActionTask textStatusActionTask) {
        this.f232029d = textStatusActionTask;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        TextStatusActionTask textStatusActionTask = this.f232029d;
        textStatusActionTask.f206682j = null;
        textStatusActionTask.cancel();
    }
}
