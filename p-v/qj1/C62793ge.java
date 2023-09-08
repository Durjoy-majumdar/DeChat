package qj1;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.XFileSdk;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: qj1.ge */
public final class C62793ge implements XFileSdk.ActionCallback {

    /* renamed from: a */
    public final /* synthetic */ C62761ee f178240a;

    public C62793ge(C62761ee eeVar) {
        this.f178240a = eeVar;
    }

    public void onDoubleTap(MotionEvent motionEvent) {
    }

    public void onGeneralCallback(String str, HashMap<String, Object> hashMap) {
    }

    public void onPageChange(int i, int i2, int i3) {
        Log.m105924i("FinderLiveScreenShareWidget", "xfile onPageChange " + i + " and pageWidth " + i2 + " and pageHeight " + i3);
        C62761ee eeVar = this.f178240a;
        XFileSdk.getViewStatus(eeVar.f178165h, eeVar.f178166i);
        eeVar.getClass();
    }

    public void onPageCountUpdate(int i) {
        Log.m105924i("FinderLiveScreenShareWidget", "xfile onPageCountUpdate " + i);
    }

    public void onReachEnd() {
    }

    public void onSingleTap(MotionEvent motionEvent) {
    }

    public void onThumbnailLoad(int i, Bitmap bitmap) {
        C87412m.m108594g(bitmap, AssetExtension.SCENE_THUMBNAIL);
        Log.m105924i("FinderLiveScreenShareWidget", "xfile onThumbnailLoad " + i);
    }

    public void onUserCancel() {
        Log.m105924i("FinderLiveScreenShareWidget", "xfile on user cancel finish");
    }

    public void onUserOperated() {
    }

    public void onViewStatusChange(int i, float f, int i2, int i3, int i4, int i5) {
        Log.m105924i("FinderLiveScreenShareWidget", "xfile onViewStatusChange " + i + " and pageWidth " + i2 + " and pageHeight " + i3 + " and scale " + f + " and transX " + i4 + " and " + i5);
    }
}
