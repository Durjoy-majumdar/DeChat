package cr0;

import android.app.Activity;
import android.os.Looper;
import br0.C79778e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import cr0.C86105f;
import cr0.C86113i;
import p224ra.C89909e;

/* renamed from: cr0.g */
public class C86110g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86113i.C86114a f250621d;

    /* renamed from: e */
    public final /* synthetic */ C86113i f250622e;

    /* renamed from: cr0.g$a */
    public class C86111a implements MTimerHandler.CallBack {
        public C86111a() {
        }

        public boolean onTimerExpired() {
            Log.m105928w("MicroMsg.AppBrandDeviceOrientationRetrier", "hy: still not cancelled, trigger retry");
            C86113i iVar = C86110g.this.f250622e;
            int i = iVar.f250625a + 1;
            iVar.f250625a = i;
            if (i > 3) {
                C86113i.C86114a aVar = iVar.f250626b;
                if (aVar != null) {
                    C86105f.C86107b bVar = (C86105f.C86107b) aVar;
                    Log.m105921e("MicroMsg.AppBrandDeviceOrientationHandler", "hy: activity not turn to correct orientation for long time, request[%s]", bVar.f250612a);
                    C86105f.C86109d dVar = bVar.f250612a;
                    C79778e.C79779a aVar2 = dVar.f250620b;
                    if (aVar2 != null) {
                        aVar2.mo109919g(dVar.f250619a, false);
                    }
                    C86105f fVar = C86105f.this;
                    if (fVar.f250602a == null) {
                        fVar.f250602a = (C86119n) C89909e.m112436a(C86119n.class);
                        C86105f fVar2 = C86105f.this;
                        C86119n nVar = fVar2.f250602a;
                        if (nVar != null) {
                            nVar.jf0(fVar2.mo109917a(), bVar.f250612a.f250619a);
                        }
                    }
                }
                return false;
            }
            C86113i.C86114a aVar3 = iVar.f250626b;
            if (aVar3 != null) {
                C86105f.C86107b bVar2 = (C86105f.C86107b) aVar3;
                Log.m105919d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: trigger retry, request[%s]", bVar2.f250612a);
                if (!bVar2.f250613b.isDestroyed()) {
                    C86105f fVar3 = C86105f.this;
                    Activity activity = bVar2.f250613b;
                    C79778e.C79780b bVar3 = bVar2.f250612a.f250619a;
                    fVar3.getClass();
                    activity.setRequestedOrientation(bVar3.f233805d);
                }
            }
            return true;
        }
    }

    public C86110g(C86113i iVar, C86113i.C86114a aVar) {
        this.f250622e = iVar;
        this.f250621d = aVar;
    }

    public void run() {
        C86113i iVar = this.f250622e;
        MTimerHandler mTimerHandler = iVar.f250627c;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        iVar.f250625a = 0;
        iVar.f250626b = null;
        C86113i iVar2 = this.f250622e;
        iVar2.f250626b = this.f250621d;
        iVar2.f250627c = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C86111a(), true);
        this.f250622e.f250627c.startTimer(500, 500);
    }
}
