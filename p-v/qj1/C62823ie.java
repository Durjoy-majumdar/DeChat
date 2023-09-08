package qj1;

import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d20.C58103c;
import gy3.C87412m;

/* renamed from: qj1.ie */
public final class C62823ie extends C58103c {

    /* renamed from: a */
    public final /* synthetic */ WxImageView f178309a;

    public C62823ie(WxImageView wxImageView) {
        this.f178309a = wxImageView;
    }

    public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
        C87412m.m108594g(imageDecodeResult, "result");
        Log.m105928w("FinderLiveScreenShareWidget", "onImageLoadError, result:" + imageDecodeResult);
    }

    public void onImageLoaded(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        Log.m105918d("FinderLiveScreenShareWidget", "wxImageView, onImageLoaded.");
        WxImageView wxImageView = this.f178309a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        wxImageView.f48889h = width;
        wxImageView.f48890i = height;
        this.f178309a.mo26059d();
    }

    public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
        C87412m.m108594g(imageDecodeResult, "result");
        Log.m105918d("FinderLiveScreenShareWidget", "wxImageView, onPreviewLoadError. result:" + imageDecodeResult);
    }

    public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
        C87412m.m108594g(imageDecodeResult, "result");
        Log.m105928w("FinderLiveScreenShareWidget", "onTileLoadError, result:" + imageDecodeResult);
    }
}
