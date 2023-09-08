package ja3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.WeChatCls;
import com.tencent.p014mm.xeffect.WeFaceCluster;
import com.tencent.p014mm.xeffect.WeOcr;
import di3.C86312j;
import gy3.C87412m;
import java.nio.Buffer;
import q00.C12025f;
import q00.C62571i;

/* renamed from: ja3.a */
public final class C60786a {

    /* renamed from: a */
    public long f173133a;

    /* renamed from: b */
    public long f173134b;

    /* renamed from: c */
    public long f173135c;

    /* renamed from: d */
    public long f173136d;

    /* renamed from: a */
    public final String mo85718a(Buffer buffer, int i, int i2) {
        C87412m.m108594g(buffer, "dataBuffer");
        long j = this.f173136d;
        if (j == 0) {
            Log.m105920e("MicroMsg.WeChatClsManager", "applyOcrReq >> weOcrHandle no init");
            return "";
        }
        String nProcess = WeOcr.nProcess(j, buffer, i2, i);
        Log.m105924i("MicroMsg.WeChatClsManager", "applyOcrReq >> result: return");
        return nProcess;
    }

    /* renamed from: b */
    public final boolean mo85719b() {
        C12025f IR = ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR();
        String a = IR.mo11889a("MODEL_OCR_DET");
        String a2 = IR.mo11889a("MODEL_OCR_REC_MODEL");
        String a3 = IR.mo11889a("MODEL_OCR_REC_MAP");
        if (!(a == null || a.length() == 0)) {
            if (!(a2 == null || a2.length() == 0)) {
                if (!(a3 == null || a3.length() == 0)) {
                    long nInit = WeOcr.nInit(a, a2, a3);
                    this.f173136d = nInit;
                    if (nInit == 0) {
                        Log.m105920e("MicroMsg.WeChatClsManager", "init weOcr error");
                        return false;
                    }
                    Log.m105924i("MicroMsg.WeChatClsManager", "init weChatCls success " + this.f173136d);
                    return true;
                }
            }
        }
        Log.m105920e("MicroMsg.WeChatClsManager", "ocr model is null");
        return false;
    }

    /* renamed from: c */
    public final void mo85720c() {
        Log.m105924i("MicroMsg.WeChatClsManager", "release");
        long j = this.f173136d;
        if (j != 0) {
            WeOcr.nRelease(j);
        }
        long j2 = this.f173133a;
        if (j2 != 0) {
            WeChatCls.nRelease(j2);
        }
        long j3 = this.f173135c;
        if (j3 != 0) {
            WeFaceCluster.nRelease(j3, this.f173134b);
        }
        this.f173136d = 0;
        this.f173135c = 0;
        this.f173133a = 0;
        this.f173134b = 0;
    }
}
