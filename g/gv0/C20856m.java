package gv0;

import android.os.Looper;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import ev0.C20612a;
import ev0.C20615b;
import ev0.C20625e;
import ev0.C20633g;

/* renamed from: gv0.m */
public class C20856m {

    /* renamed from: f */
    public static int f58932f;

    /* renamed from: a */
    public int[] f58933a = {1000, 1000, 1000, 2000, 5000, 9000, 1000};

    /* renamed from: b */
    public int f58934b = 0;

    /* renamed from: c */
    public boolean f58935c = false;

    /* renamed from: d */
    public C20858b f58936d;

    /* renamed from: e */
    public MTimerHandler f58937e = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C20857a(), false);

    /* renamed from: gv0.m$a */
    public class C20857a implements MTimerHandler.CallBack {
        public C20857a() {
        }

        public boolean onTimerExpired() {
            if (C20856m.this.f58935c) {
                Log.m105921e("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler stopped is true, index[%d]", Integer.valueOf(C20856m.f58932f));
                C20856m.this.f58934b = 0;
                return false;
            }
            Log.m105925i("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler start reconnect, index[%d]", Integer.valueOf(C20856m.f58932f));
            int i = C20856m.f58932f;
            C20856m mVar = C20856m.this;
            if (i < mVar.f58933a.length) {
                C20615b.C20621f fVar = (C20615b.C20621f) mVar.f58936d;
                fVar.getClass();
                Log.m105924i("MicroMsg.BackupPcProcessMgr", "reconnectCallback callback to reconnect");
                if (C20612a.m22480i().mo142622e().mo142623a() != 5) {
                    C20612a.m22480i().mo142622e().mo142628f(5);
                    int i2 = C20612a.m22480i().mo32274j().f58024a;
                    if (1 == i2 || 3 == i2) {
                        C20612a.m22480i().mo32276l().mo32309g(5);
                    } else if (2 == i2 || 4 == i2) {
                        C20612a.m22480i().mo32275k().mo17667K(5);
                    }
                }
                C20615b.this.mo32281e(9);
                C20856m mVar2 = C20856m.this;
                mVar2.f58937e.startTimer((long) mVar2.f58933a[C20856m.f58932f]);
                C20856m.f58932f++;
            } else {
                mVar.f58935c = true;
                mVar.f58934b = 0;
                int i3 = C20615b.this.f58024a;
                Log.m105925i("MicroMsg.BackupPcProcessMgr", "reconnectCallback reconnectFail, commandMode[%d]", Integer.valueOf(i3));
                if (1 == i3 || 3 == i3) {
                    C20612a.m22480i().mo32276l();
                    C20633g.f58088n = true;
                    C20612a.m22480i().mo32276l().mo32307e(true);
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo142622e().mo142628f(-4);
                    C20612a.m22480i().mo32276l().mo32309g(-4);
                    C115669n.INSTANCE.idkeyStat(400, 9, 1, false);
                    C20612a.m22480i().mo32276l().mo32306d(13737, 3);
                } else if (2 == i3 || 4 == i3) {
                    C20612a.m22480i().mo32275k();
                    C20625e.f58056w = true;
                    C20612a.m22480i().mo32275k().mo32292b(true, false, -4);
                    C20612a.m22480i().mo32273h().mo37036e();
                    C115669n.INSTANCE.idkeyStat(400, 17, 1, false);
                    C20612a.m22480i().mo32275k().mo32291a(13737, 3);
                }
            }
            return false;
        }
    }

    /* renamed from: gv0.m$b */
    public interface C20858b {
    }

    public C20856m(C20858b bVar) {
        this.f58936d = bVar;
    }
}
