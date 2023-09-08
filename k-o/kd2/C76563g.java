package kd2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75576f4;

/* renamed from: kd2.g */
public class C76563g implements C75576f4.C75578b {
    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        if (gVar == null || gVar.mo55443A3() == null) {
            Log.m105920e("MicroMsg.WalletOfflineUtil", "doLocalProxyScene dispatcher == null || dispatcher.getAccInfo() == null");
            return;
        }
        byte[] m3 = gVar.mo55443A3().mo55434m3("offline_token");
        if (m3 != null) {
            C76559f.f224083a = new String(m3);
        }
        byte[] m35 = gVar.mo55443A3().mo55434m3("offline_token_V2");
        if (m35 != null) {
            C76559f.f224084b = new String(m35);
        }
        byte[] m36 = gVar.mo55443A3().mo55434m3("offline_key_list");
        if (m36 != null) {
            C76559f.f224086d = new String(m36);
        }
    }
}
