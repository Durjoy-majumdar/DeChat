package com.tencent.p014mm.plugin.game.commlib;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.io.IOException;
import nx1.C47305b;
import pe3.C47465a;
import px1.C35725c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.game.commlib.f */
public class C30076f extends C86301e implements C47305b {

    /* renamed from: d */
    public volatile C35725c f81351d;

    /* renamed from: Rz */
    public byte[] mo57103Rz(String str) {
        if (vx0() == null) {
            return null;
        }
        return vx0().mo60366Rz(str);
    }

    /* renamed from: im */
    public void mo57104im(String str, byte[] bArr) {
        vx0().mo60367jo(str, bArr);
    }

    /* renamed from: l6 */
    public void mo57105l6(String str, C47465a aVar) {
        C35725c vx02 = vx0();
        vx02.getClass();
        if (!Util.isNullOrNil(str) && aVar != null) {
            try {
                vx02.mo60367jo(str, aVar.toByteArray());
            } catch (IOException e) {
                Log.m105921e("MicroMsg.PBCacheStorage", "Saving Failed: %s", e.getMessage());
            }
        }
    }

    public void q60(String str) {
        vx0().q60(str);
    }

    public final C35725c vx0() {
        if (this.f81351d == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f81351d == null) {
                    this.f81351d = new C35725c(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f81351d;
    }
}
