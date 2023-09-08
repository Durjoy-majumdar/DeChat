package com.tencent.p014mm.wallet_core.p137ui;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75576f4;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

/* renamed from: com.tencent.mm.wallet_core.ui.u */
public class C45128u implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ String f122398a;

    /* renamed from: b */
    public final /* synthetic */ C75228t.C45127n f122399b;

    public C45128u(String str, C75228t.C45127n nVar) {
        this.f122398a = str;
        this.f122399b = nVar;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        if (gVar != null && gVar.mo55443A3() != null) {
            if (Util.isNullOrNil(this.f122398a)) {
                Log.m105928w("MicroMsg.WalletBaseUtil ", "hy: key is null");
                return;
            }
            try {
                byte[] m3 = gVar.mo55443A3().mo55434m3(this.f122398a);
                C75228t.C45127n nVar = this.f122399b;
                if (nVar == null) {
                    return;
                }
                if (m3 != null) {
                    nVar.mo70512a(new ObjectInputStream(new ByteArrayInputStream(m3)).readObject());
                } else {
                    nVar.mo70512a((Object) null);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", e.toString());
                C75228t.C45127n nVar2 = this.f122399b;
                if (nVar2 != null) {
                    nVar2.mo70512a((Object) null);
                }
            }
        }
    }
}
