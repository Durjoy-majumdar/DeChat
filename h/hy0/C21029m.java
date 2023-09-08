package hy0;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hy0.m */
public final class C21029m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MPExoVideoWrapper f59499d;

    public C21029m(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59499d = mPExoVideoWrapper;
    }

    public final void run() {
        ImageView imageView = this.f59499d.f51516n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        MPExoVideoWrapper mPExoVideoWrapper = this.f59499d;
        mPExoVideoWrapper.getClass();
        Log.m105928w("MicroMsg.MPExoVideoWrapper", "resolutionStr is null");
        TextView textView = mPExoVideoWrapper.f51517o;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
