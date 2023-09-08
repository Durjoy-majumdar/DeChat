package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.RequestStartFaceDetectEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f40.C86709a0;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI */
public class FaceTransparentStubUI extends MMActivity {
    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.FaceTransparentStubUI", "hy: on activity result in FaceTransparentStubUI");
        setResult(i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("KEY_REQUEST_CODE", 1000);
        Bundle bundleExtra = getIntent().getBundleExtra("KEY_EXTRAS");
        if (!bundleExtra.containsKey("k_user_name") && C86709a0.m107523b().mo121115m()) {
            bundleExtra.putString("k_user_name", C75592q0.m90772b());
        }
        RequestStartFaceDetectEvent requestStartFaceDetectEvent = new RequestStartFaceDetectEvent();
        RequestStartFaceDetectEvent.C1121a aVar = requestStartFaceDetectEvent.f9451d;
        aVar.f9453a = this;
        aVar.f9455c = intExtra;
        aVar.f9454b = bundleExtra;
        requestStartFaceDetectEvent.publish();
        Log.m105925i("MicroMsg.FaceTransparentStubUI", "hy: start face detect event result: %b", Boolean.valueOf(requestStartFaceDetectEvent.f9452e.f9456a));
        RequestStartFaceDetectEvent.C1122b bVar = requestStartFaceDetectEvent.f9452e;
        if (!bVar.f9456a) {
            if (bVar.f9457b != null) {
                Intent intent = new Intent();
                intent.putExtras(requestStartFaceDetectEvent.f9452e.f9457b);
                setResult(1, intent);
            } else {
                setResult(1);
            }
            finish();
        }
    }
}
