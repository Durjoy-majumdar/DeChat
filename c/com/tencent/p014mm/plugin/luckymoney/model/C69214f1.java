package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.f1 */
public class C69214f1 implements C98124g.C98125a {

    /* renamed from: d */
    public String f199171d = null;

    /* renamed from: e */
    public C69215a f199172e;

    /* renamed from: f */
    public String f199173f;

    /* renamed from: g */
    public boolean f199174g = true;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.f1$a */
    public interface C69215a {
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        Log.m105919d("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
        if (dVar != null && this.f199171d.equals(str) && !Util.isNullOrNil(dVar.field_fileId)) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer success, sceneResult.field_retCode:" + dVar.field_retCode);
            if (i == 0 && dVar.field_retCode == 0) {
                if (this.f199174g) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, upload callback success");
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, download callback success");
                }
                Log.m105925i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:transfer done, mediaid=%s, completeInfo=%s", str, dVar.toString());
                C69215a aVar = this.f199172e;
                if (aVar != null) {
                    ((C69262s) aVar).mo95408a(str, dVar, this.f199173f, true);
                }
            } else {
                Log.m105920e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail");
                C69215a aVar2 = this.f199172e;
                if (aVar2 != null) {
                    ((C69262s) aVar2).mo95408a(str, dVar, this.f199173f, false);
                }
            }
        } else if (dVar != null && this.f199171d.equals(str) && dVar.field_retCode != 0) {
            Log.m105920e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail, sceneResult.field_retCode:" + dVar.field_retCode);
            C69215a aVar3 = this.f199172e;
            if (aVar3 != null) {
                ((C69262s) aVar3).mo95408a(str, dVar, this.f199173f, false);
            }
        } else if (cVar != null) {
            Log.m105918d("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: upload progressing....");
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }
}
