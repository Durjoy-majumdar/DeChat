package com.tencent.p014mm.plugin.facedetectaction.p046ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.RequestFaceVerifyForPayEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceTransStubUI */
public class FaceTransStubUI extends MMActivity {

    /* renamed from: d */
    public Context f12435d = this;

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.FaceTransStubUI", "carson : on activity result in FaceTransStubUI");
        setResult(i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.FaceTransStubUI", "carson: start FaceTransStubUI ");
        RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new RequestFaceVerifyForPayEvent();
        requestFaceVerifyForPayEvent.f9431d.f9433a = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        requestFaceVerifyForPayEvent.f9431d.f9434b = getIntent().getStringExtra("package");
        requestFaceVerifyForPayEvent.f9431d.f9435c = getIntent().getStringExtra("packageSign");
        requestFaceVerifyForPayEvent.f9431d.f9436d = getIntent().getStringExtra("otherVerifyTitle");
        requestFaceVerifyForPayEvent.f9431d.f9437e = getIntent().getStringExtra("otherVerifyTitleFront");
        requestFaceVerifyForPayEvent.f9431d.f9438f = getIntent().getStringExtra("needFrontPage");
        requestFaceVerifyForPayEvent.f9431d.f9439g = getIntent().getStringExtra("faceVerifyTitle");
        RequestFaceVerifyForPayEvent.C1117a aVar = requestFaceVerifyForPayEvent.f9431d;
        aVar.f9440h = 63;
        Context context = this.f12435d;
        if (context instanceof Activity) {
            aVar.f9441i = (Activity) context;
        }
        requestFaceVerifyForPayEvent.publish();
        Log.m105925i("MicroMsg.FaceTransStubUI", "carson: start face detect event result: %b", Boolean.valueOf(requestFaceVerifyForPayEvent.f9432e.f9442a));
        RequestFaceVerifyForPayEvent.C1118b bVar = requestFaceVerifyForPayEvent.f9432e;
        if (!bVar.f9442a) {
            if (bVar.f9443b != null) {
                Intent intent = new Intent();
                intent.putExtras(requestFaceVerifyForPayEvent.f9432e.f9443b);
                setResult(1, intent);
            } else {
                setResult(1);
            }
            finish();
        }
    }
}
