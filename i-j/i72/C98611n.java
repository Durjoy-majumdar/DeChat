package i72;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f72.C86778a;
import hd0.C32815d0;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import java.util.concurrent.ConcurrentSkipListSet;
import te3.C101783gu2;
import xb0.C102609h;

/* renamed from: i72.n */
public class C98611n implements C32815d0 {

    /* renamed from: i72.n$a */
    public class C98612a implements C98608f {

        /* renamed from: a */
        public final /* synthetic */ String f289119a;

        /* renamed from: b */
        public final /* synthetic */ C98408n0 f289120b;

        public C98612a(C98611n nVar, String str, C98408n0 n0Var) {
            this.f289119a = str;
            this.f289120b = n0Var;
        }

        /* renamed from: a */
        public boolean mo96066a() {
            Log.m105925i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile1 %s", this.f289119a);
            int m = C98410o0.m127731m(this.f289119a);
            C98408n0 n0Var = this.f289120b;
            n0Var.f288559f = m;
            n0Var.f288548P = 32;
            C98398h0.Bx0().mo137733w(this.f289120b);
            return true;
        }
    }

    /* renamed from: i72.n$b */
    public class C98613b implements C98608f {

        /* renamed from: a */
        public final /* synthetic */ C98408n0 f289121a;

        /* renamed from: b */
        public final /* synthetic */ String f289122b;

        public C98613b(C98611n nVar, C98408n0 n0Var, String str) {
            this.f289121a = n0Var;
            this.f289122b = str;
        }

        /* renamed from: a */
        public boolean mo96066a() {
            long j = this.f289121a.f288567n;
            ConcurrentSkipListSet<Long> concurrentSkipListSet = C86778a.f251888a;
            synchronized (C86778a.class) {
                try {
                    Log.m105925i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish: %s", Long.valueOf(j));
                    C86778a.f251888a.remove(Long.valueOf(j));
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish error: %s", e.getMessage());
                }
            }
            Log.m105925i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile2 %s", this.f289122b);
            int m = C98410o0.m127731m(this.f289122b);
            C98408n0 n0Var = this.f289121a;
            n0Var.f288559f = m;
            n0Var.f288548P = 32;
            C98398h0.Bx0().mo137733w(this.f289121a);
            return true;
        }
    }

    /* renamed from: N4 */
    public void mo58819N4(String str) {
        C98408n0 f = C98398h0.Bx0().mo137720f(str);
        if (f != null) {
            String q = C98398h0.Bx0().mo137728q(str);
            C101783gu2 gu22 = f.f288538F;
            VideoTransPara Xa = C102609h.Fx0().mo142236Xa();
            if (gu22 != null) {
                Log.m105925i("MicroMsg.MMSightVideoMsgSendCallback", "beforeVideoSend count %d filename %s filePath %s", Integer.valueOf(gu22.f298310f), str, q);
                if (gu22.f298310f > 1) {
                    C98429r0.m127799E(str);
                    return;
                }
            }
            boolean a = C98610m.m128210a(q, Xa, gu22, new C98612a(this, q, f));
            if (gu22 != null) {
                Log.m105925i("MicroMsg.MMSightVideoMsgSendCallback", "filename: %s need ret: %s", str, Boolean.valueOf(a));
                gu22.f298313i = !a;
                f.f288538F = gu22;
                f.f288548P = 536870912;
                C98398h0.Bx0().mo137733w(f);
            }
            if (a) {
                if (gu22 != null) {
                    gu22.f298310f++;
                    f.f288538F = gu22;
                }
                f.f288548P = 536870912;
                C98398h0.Bx0().mo137733w(f);
                long j = f.f288567n;
                ConcurrentSkipListSet<Long> concurrentSkipListSet = C86778a.f251888a;
                synchronized (C86778a.class) {
                    try {
                        Log.m105925i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing: %s", Long.valueOf(j));
                        C86778a.f251888a.add(Long.valueOf(j));
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing error: %s", e.getMessage());
                    }
                }
                if (C98610m.m128211b(q, Xa, gu22, new C98613b(this, f, q)) < 0) {
                    Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "mark720CapturePostCompressFailed");
                    C115669n.INSTANCE.idkeyStat(440, 45, 1, false);
                    C98429r0.m127799E(str);
                    return;
                } else if (gu22 != null) {
                    gu22.f298313i = true;
                    f.f288538F = gu22;
                    f.f288548P = 536870912;
                    C98398h0.Bx0().mo137733w(f);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
    }
}
