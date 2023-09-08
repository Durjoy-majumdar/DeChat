package p765yp;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: yp.a$$b */
public class a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112477a f232415d;

    public a$$b(C112477a aVar) {
        this.f232415d = aVar;
    }

    public void run() {
        boolean z;
        OutputStream H;
        if (1 == ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_delete_egg_spring_media, 0)) {
            Log.m105924i("MicroMsg.EggSpringFeatureService", "clear useless media.");
            C86013q1.m106445f(C112477a.f336781e);
            C86013q1.m106445f(C112477a.f336782f);
            return;
        }
        this.f232415d.getClass();
        String str = C112477a.f336783g;
        try {
            InputStream open = MMApplicationContext.getContext().getAssets().open("innerLuckyBag.wxam");
            try {
                C86009m1 m1Var = new C86009m1(str);
                if (!m1Var.mo119967g()) {
                    m1Var.mo119974l().mo119987x();
                    try {
                        H = C86013q1.m106426H(m1Var);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = open.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                H.write(bArr, 0, read);
                            }
                            z = true;
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.EggSpringFeatureService", e, "copy err!!!", new Object[0]);
                            z = false;
                        }
                        if (H != null) {
                            H.close();
                        }
                    } catch (IOException e2) {
                        Log.printErrStackTrace("MicroMsg.EggSpringFeatureService", e2, "open dst err!!!", new Object[0]);
                        z = false;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    if (!z) {
                        C86013q1.m106447h(str);
                    }
                    Log.m105925i("MicroMsg.EggSpringFeatureService", "copy result!!![%s].", Boolean.valueOf(z));
                    if (open == null) {
                        return;
                    }
                } else if (open == null) {
                    return;
                }
                open.close();
                return;
            } catch (Throwable th4) {
                if (open != null) {
                    open.close();
                }
                throw th4;
            }
        } catch (IOException e3) {
            Log.printErrStackTrace("MicroMsg.EggSpringFeatureService", e3, "open loading_lucky_bag file err!!!", new Object[0]);
            return;
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
        throw th;
    }
}
