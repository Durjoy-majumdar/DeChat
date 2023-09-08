package hy0;

import android.widget.ImageView;
import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;

/* renamed from: hy0.l */
public final class C21028l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MPExoVideoWrapper f59498d;

    public C21028l(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59498d = mPExoVideoWrapper;
    }

    public final void run() {
        MPExoVideoWrapper mPExoVideoWrapper = this.f59498d;
        boolean z = false;
        mPExoVideoWrapper.f51505T = false;
        ImageView imageView = mPExoVideoWrapper.f51516n;
        if (imageView != null && imageView.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            mPExoVideoWrapper.f51512g.post(new C21029m(mPExoVideoWrapper));
        }
    }
}
