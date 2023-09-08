package com.tencent.p014mm.xwebutil;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XFileSdk;
import java.util.HashMap;

/* renamed from: com.tencent.mm.xwebutil.b */
public class C106871b implements XFileSdk.ActionCallback {

    /* renamed from: a */
    public final /* synthetic */ ValueCallback f319991a;

    public C106871b(ValueCallback valueCallback) {
        this.f319991a = valueCallback;
    }

    public void onDoubleTap(MotionEvent motionEvent) {
    }

    public void onGeneralCallback(String str, HashMap<String, Object> hashMap) {
        ValueCallback valueCallback;
        if (hashMap == null) {
            Log.m105920e("XFilesReaderLogic", "onGeneralCallback error, param is null");
        } else if (XFileSdk.GENERAL_CALLBACK_NAME_ON_CUSTOM_MENU_CLICK.equals(str)) {
            Object obj = hashMap.get(XFileSdk.GENERAL_CALLBACK_PARAM_KEY_CUSTOM_MENU_ID);
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                Log.m105924i("XFilesReaderLogic", "onGeneralCallback onCustomMenuClick, id = " + intValue);
                if (intValue == 0 && (valueCallback = this.f319991a) != null) {
                    valueCallback.onReceiveValue("xwebFileReaderMenuEditClick");
                }
            }
        }
    }

    public void onPageChange(int i, int i2, int i3) {
    }

    public void onPageCountUpdate(int i) {
    }

    public void onReachEnd() {
        ValueCallback valueCallback = this.f319991a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue("xwebFileReaderReachEnd");
        }
    }

    public void onSingleTap(MotionEvent motionEvent) {
    }

    public void onThumbnailLoad(int i, Bitmap bitmap) {
    }

    public void onUserCancel() {
    }

    public void onUserOperated() {
        ValueCallback valueCallback = this.f319991a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue("xwebFileReaderUserOperated");
        }
    }

    public void onViewStatusChange(int i, float f, int i2, int i3, int i4, int i5) {
    }
}
