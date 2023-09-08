package to1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCircularProgressBar;

/* renamed from: to1.e */
public final class C64968e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187073d;

    public C64968e(C64963d dVar) {
        this.f187073d = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        MMSightCircularProgressBar mMSightCircularProgressBar = this.f187073d.f187058p.f327380f.f313791h;
        mMSightCircularProgressBar.f313750B = false;
        mMSightCircularProgressBar.postInvalidate();
    }
}
