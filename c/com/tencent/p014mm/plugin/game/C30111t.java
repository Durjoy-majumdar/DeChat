package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import sw1.C48484q;
import sw1.C48485r;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.game.t */
public final class C30111t extends C86301e implements C48485r {
    public byte[] os0(String str) {
        if (str == null) {
            return null;
        }
        return ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz(str);
    }

    public void vn0(String str, byte[] bArr) {
        if (str != null) {
            ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57117Yt(str, bArr);
        }
    }
}
