package to1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCircularProgressBar;

/* renamed from: to1.g */
public final class C64970g implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187075d;

    public C64970g(C64963d dVar) {
        this.f187075d = dVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        MMSightCircularProgressBar mMSightCircularProgressBar = this.f187075d.f187058p.f327380f.f313791h;
        mMSightCircularProgressBar.f313750B = false;
        mMSightCircularProgressBar.postInvalidate();
    }
}
