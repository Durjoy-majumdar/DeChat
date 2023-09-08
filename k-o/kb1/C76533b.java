package kb1;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kb1.b */
public class C76533b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f223983d;

    /* renamed from: e */
    public final /* synthetic */ int f223984e;

    /* renamed from: f */
    public final /* synthetic */ int f223985f;

    /* renamed from: g */
    public final /* synthetic */ FaceDetectCameraView f223986g;

    public C76533b(FaceDetectCameraView faceDetectCameraView, int i, int i2, int i3) {
        this.f223986g = faceDetectCameraView;
        this.f223983d = i;
        this.f223984e = i2;
        this.f223985f = i3;
    }

    public void run() {
        int i = this.f223983d - this.f223984e;
        Log.m105925i("MicroMsg.FaceDetectCameraView", "alvinluo restHeight: %d", Integer.valueOf(i));
        if (i > 0) {
            int i2 = i / 2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f223985f, this.f223984e);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f223986g.getLayoutParams());
            layoutParams.setMargins(marginLayoutParams.leftMargin, i2, marginLayoutParams.rightMargin, marginLayoutParams.height + i2);
            Log.m105927v("MicroMsg.FaceDetectCameraView", "alvinluo margin left: %d, right: %d, top: %d, bottom: %d", Integer.valueOf(marginLayoutParams.leftMargin), Integer.valueOf(marginLayoutParams.rightMargin), Integer.valueOf(i2), Integer.valueOf(i2 + marginLayoutParams.height));
            this.f223986g.setLayoutParams(layoutParams);
            this.f223986g.invalidate();
        }
    }
}
