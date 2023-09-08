package kx1;

import ax1.C39643f;
import com.tencent.p014mm.autogen.events.UploadImgResultEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import p1081gi.C98121d;
import yw1.C53591c;

/* renamed from: kx1.f */
public class C46794f implements C39643f {
    /* renamed from: a */
    public void mo72015a(boolean z, int i, String str, C98121d dVar) {
        Log.m105925i("MicroMsg.SendImgUtil", "onFinish, success = %b, errCode = %d, mediaId = %s", Boolean.valueOf(z), Integer.valueOf(i), str);
        UploadImgResultEvent uploadImgResultEvent = new UploadImgResultEvent();
        UploadImgResultEvent.C40179a aVar = uploadImgResultEvent.f107796d;
        aVar.f107797a = str;
        aVar.f107798b = z;
        C53591c.C53596e eVar = (C53591c.C53596e) ((HashMap) C46793e.f125915a).get(str);
        if (eVar != null) {
            ((HashMap) C46793e.f125915a).put(str, eVar);
        }
        if (dVar != null && eVar != null) {
            UploadImgResultEvent.C40179a aVar2 = uploadImgResultEvent.f107796d;
            aVar2.f107799c = dVar.field_aesKey;
            aVar2.f107800d = dVar.field_fileId;
            aVar2.f107801e = eVar.f150622b;
            aVar2.f107802f = eVar.f150623c;
            uploadImgResultEvent.publish();
        }
    }
}
