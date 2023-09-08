package com.tencent.p014mm.plugin.facedetect.model;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.RequestInternalFaceVerifyEvent;
import com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.facedetect.model.p */
public class C2270p extends IStaticListener<RequestInternalFaceVerifyEvent> {
    public boolean callback(IEvent iEvent) {
        RequestInternalFaceVerifyEvent requestInternalFaceVerifyEvent = (RequestInternalFaceVerifyEvent) iEvent;
        boolean z = false;
        if (requestInternalFaceVerifyEvent == null) {
            return false;
        }
        RequestInternalFaceVerifyEvent.C1120b bVar = requestInternalFaceVerifyEvent.f9445e;
        C105227i iVar = C105227i.INSTANCE;
        RequestInternalFaceVerifyEvent.C1119a aVar = requestInternalFaceVerifyEvent.f9444d;
        Context context = aVar.f9446a;
        Bundle bundle = aVar.f9447b;
        int i = aVar.f9448c;
        Log.m105924i("MicroMsg.FaceDetectManager", "start wx internal face verify");
        if (!(context == null || bundle == null)) {
            int i2 = FaceFlashPermissionUI.f19047i;
            bundle.putBoolean("face_permission_check", true);
            FaceFlashPermissionUI.m4573I7(context, bundle, i);
            z = true;
        }
        bVar.f9449a = z;
        RequestInternalFaceVerifyEvent.C1120b bVar2 = requestInternalFaceVerifyEvent.f9445e;
        if (bVar2.f9449a) {
            return true;
        }
        bVar2.f9450b = new Bundle();
        requestInternalFaceVerifyEvent.f9445e.f9450b.putInt("err_code", 90001);
        requestInternalFaceVerifyEvent.f9445e.f9450b.putString("err_msg", "face detect not support");
        return true;
    }
}
