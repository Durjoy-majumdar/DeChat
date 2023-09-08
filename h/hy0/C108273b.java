package hy0;

import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoTextureView;
import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;

/* renamed from: hy0.b */
public final class C108273b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MPExoVideoWrapper f324179d;

    public C108273b(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f324179d = mPExoVideoWrapper;
    }

    public final void run() {
        MPExoVideoWrapper mPExoVideoWrapper = this.f324179d;
        MPExoVideoTextureView mPExoVideoTextureView = mPExoVideoWrapper.f51521r;
        if (mPExoVideoTextureView != null) {
            int i = mPExoVideoWrapper.f51496J;
            int i2 = mPExoVideoWrapper.f51497K;
            mPExoVideoTextureView.f312088h = i;
            mPExoVideoTextureView.f312089i = i2;
        }
        if (mPExoVideoTextureView != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mPExoVideoTextureView.getLayoutParams();
            layoutParams.addRule(13);
            mPExoVideoTextureView.setLayoutParams(layoutParams);
        }
        MPExoVideoTextureView mPExoVideoTextureView2 = this.f324179d.f51521r;
        if (mPExoVideoTextureView2 != null) {
            mPExoVideoTextureView2.setScaleType(C96814a.C96817e.CONTAIN);
        }
    }
}
