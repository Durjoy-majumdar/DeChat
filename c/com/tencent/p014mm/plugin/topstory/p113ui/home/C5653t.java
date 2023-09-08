package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ic0.C21070h;
import jc0.C21210b;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.t */
public class C5653t implements C21070h {
    public C5653t(TopStoryUploadUI topStoryUploadUI) {
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        Bitmap bitmap;
        Log.m105928w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap url = " + str);
        if (bVar == null || (bitmap = bVar.f59988d) == null || bitmap.isRecycled()) {
            Log.m105928w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap bitmap is null");
            return null;
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap url is null");
            return null;
        } else if (!(view instanceof ImageView)) {
            Log.m105928w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap view not ImageView");
            return null;
        } else {
            if (bVar.f59988d.getWidth() < bVar.f59988d.getHeight()) {
                ((ImageView) view).setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            return null;
        }
    }
}
