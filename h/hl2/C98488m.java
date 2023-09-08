package hl2;

import com.tencent.p014mm.plugin.scanner.model.C94480u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8479f0;
import gy3.C87412m;
import hl2.C98489n;
import java.util.ArrayList;
import o40.C61926c;
import sk2.C101645e;
import te3.C101804kv2;
import te3.C101856vd;

/* renamed from: hl2.m */
public final class C98488m implements C98489n {
    /* renamed from: a */
    public void mo137839a(C101645e eVar, C98489n.C98490a aVar) {
        C87412m.m108594g(eVar, "request");
        C8479f0 f0Var = new C8479f0();
        byte[] byteArray = eVar.f297545n.getByteArray("key_sns_media_data");
        if (byteArray != null) {
            T kv22 = new C101804kv2();
            try {
                kv22.parseFrom(byteArray);
            } catch (Exception unused) {
            }
            f0Var.f27484d = kv22;
        }
        if (f0Var.f27484d == null) {
            Log.m105920e("MicroMsg.AiScanSnsImageCDNStrategy", "alvinluo getCDNImageInfoList-sns parse mediaObj failed");
            if (aVar != null) {
                aVar.mo137849e(3, 999, "media object parse failed");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        C101804kv2 kv23 = (C101804kv2) f0Var.f27484d;
        if (kv23 != null) {
            C101856vd vdVar = new C101856vd();
            vdVar.f299670i = 1;
            vdVar.f299665d = 4;
            T t = f0Var.f27484d;
            C87412m.m108591d(t);
            vdVar.f299671j = ((C101804kv2) t).f298692g;
            T t2 = f0Var.f27484d;
            C87412m.m108591d(t2);
            vdVar.f299672n = ((C101804kv2) t2).f298674G;
            vdVar.f299673o = kv23.f298675H;
            vdVar.f299674p = C61926c.m72671P(kv23.f298676I);
            Log.m105925i("MicroMsg.AiScanSnsImageCDNStrategy", "alvinluo getCDNImageInfoList-sns url: %s", vdVar.f299671j);
            Object[] objArr = new Object[5];
            objArr[0] = vdVar.f299671j;
            objArr[1] = vdVar.f299672n;
            objArr[2] = Integer.valueOf(vdVar.f299673o);
            objArr[3] = Long.valueOf(vdVar.f299674p);
            C101804kv2 kv24 = (C101804kv2) f0Var.f27484d;
            objArr[4] = kv24 != null ? kv24.f298676I : null;
            Log.m105919d("MicroMsg.AiScanSnsImageCDNStrategy", "alvinluo getCDNImageInfoList-sns url: %s, token: %s, enc_idx: %s, enc_key: [%s, %s]", objArr);
            arrayList.add(vdVar);
        }
        Log.m105925i("MicroMsg.AiScanSnsImageCDNStrategy", "alvinluo getCDNImageInfoList-sns request.pHash: %s, needPHash: %s", eVar.f297540i, Boolean.valueOf(eVar.f297541j));
        if (eVar.f297540i == null && eVar.f297541j && C86013q1.m106450k(eVar.f297535d)) {
            C94480u0 u0Var = C94480u0.f273191a;
            String str = eVar.f297535d;
            C87412m.m108593f(str, "request.imagePath");
            eVar.f297540i = u0Var.mo129952a(str);
        }
        if (aVar != null) {
            aVar.mo137850f(arrayList);
        }
    }

    public String name() {
        return "MicroMsg.AiScanSnsImageCDNStrategy";
    }
}
