package com.tencent.p014mm.plugin.appbrand.jsapi.bio.face;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C1761b;
import com.tencent.p014mm.plugin.facedetect.model.C2271r;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.e */
public class C1642e implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ boolean f11271a;

    /* renamed from: b */
    public final /* synthetic */ C1761b f11272b;

    /* renamed from: c */
    public final /* synthetic */ C82554k f11273c;

    /* renamed from: d */
    public final /* synthetic */ int f11274d;

    /* renamed from: e */
    public final /* synthetic */ C1643f f11275e;

    public C1642e(C1643f fVar, boolean z, C1761b bVar, C82554k kVar, int i) {
        this.f11275e = fVar;
        this.f11271a = z;
        this.f11272b = bVar;
        this.f11273c = kVar;
        this.f11274d = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        int i3 = i2;
        Intent intent2 = intent;
        Log.m105924i("MicroMsg.JsApiStartFaceAction", "onResult");
        if (this.f11271a) {
            this.f11272b.mo1751iF();
        }
        if (intent2 == null) {
            Log.m105921e("MicroMsg.JsApiStartFaceAction", "mmOnActivityResult NULL data, appId[%s], callbackId[%d]", this.f11273c.getAppId(), Integer.valueOf(this.f11274d));
            C1643f.m1686w(this.f11275e, this.f11273c, this.f11274d, (Bundle) null, "fail:internal error");
            return true;
        }
        int a = C2271r.m2060a(intent2.getIntExtra("err_code", 0));
        int intExtra = intent2.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int intExtra2 = intent2.getIntExtra("countFace", 0);
        long longExtra = intent2.getLongExtra("totalTime", 0);
        int intExtra3 = intent2.getIntExtra("err_type", 6);
        Log.m105925i("MicroMsg.JsApiStartFaceAction", "errCode:%s，scene:%s,countFace:%s,totalTime:%s,errorType:%s", Integer.valueOf(a), Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Long.valueOf(longExtra), Integer.valueOf(intExtra3));
        if (i != 63) {
            return false;
        }
        Log.m105925i("MicroMsg.JsApiStartFaceAction", "REQUEST_FACE_VERIFY_FOR_PAY resultCode: %d", Integer.valueOf(i2));
        if (i3 == -1) {
            C115669n.INSTANCE.mo160131h(15711, Integer.valueOf(intExtra), 0, Integer.valueOf(intExtra2), Long.valueOf(longExtra), 3, 0, Integer.valueOf(a));
            C1643f.m1686w(this.f11275e, this.f11273c, this.f11274d, intent.getExtras(), "ok");
        } else if (i3 == 1) {
            C115669n.INSTANCE.mo160131h(15711, Integer.valueOf(intExtra), 3, Integer.valueOf(intExtra2), Long.valueOf(longExtra), 3, Integer.valueOf(intExtra3), Integer.valueOf(a));
            C1643f.m1686w(this.f11275e, this.f11273c, this.f11274d, intent.getExtras(), "fail");
        } else if (i3 == 0) {
            C115669n.INSTANCE.mo160131h(15711, Integer.valueOf(intExtra), 2, Integer.valueOf(intExtra2), Long.valueOf(longExtra), 3, 1, Integer.valueOf(a));
            C1643f.m1686w(this.f11275e, this.f11273c, this.f11274d, intent.getExtras(), "cancel");
        }
        return true;
    }
}
