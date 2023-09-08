package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import p663qo.C101213l;

/* renamed from: hd0.c0 */
public class C98393c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f288467d;

    /* renamed from: e */
    public final /* synthetic */ C98385a0 f288468e;

    public C98393c0(C98385a0 a0Var, long j) {
        this.f288468e = a0Var;
        this.f288467d = j;
    }

    public void run() {
        synchronized (this.f288468e.f288436d) {
            String str = (String) ((HashMap) this.f288468e.f288435c).get(Long.valueOf(this.f288467d));
            Log.m105925i("MicroMsg.SightMassSendService", "cancel item, massSendId %d, cdnClientId %s", Long.valueOf(this.f288467d), str);
            if ("done_upload_cdn_client_id".equals(str)) {
                Log.m105928w("MicroMsg.SightMassSendService", "doing mass send cgi, ignore cancel!");
                return;
            }
            if (!Util.isNullOrNil(str)) {
                ((HashMap) this.f288468e.f288435c).put(Long.valueOf(this.f288467d), "");
                ((C101213l) C86312j.m106911c(C101213l.class)).gn0(str);
                this.f288468e.mo137672c(this.f288467d, 0, 0);
            }
            C98398h0.Bx0().mo137717c(this.f288467d);
        }
    }
}
