package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.pluginsdk.model.v */
public class C6661v {
    /* renamed from: a */
    public static boolean m6941a(int i, int i2) {
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_c2c_video_compress_type, 0);
        String lowerCase = C87203t.m108275k().toLowerCase();
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(Qe);
        objArr[1] = lowerCase;
        objArr[2] = Qe == 1 ? "mediaCodec" : "x264";
        Log.m105925i("MicroMsg.C2CTransferConfig", "transferType:%s model:%s select %s mode", objArr);
        if (Qe == 1) {
            return true;
        }
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mediacodec_side_limit, 3000);
        Log.m105925i("MicroMsg.C2CTransferConfig", "rawWidth %d rawHeight:%d limit:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(Qe2));
        return Math.max(i2, i) >= Qe2;
    }
}
