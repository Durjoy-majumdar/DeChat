package gv0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: gv0.o */
public class C20859o {

    /* renamed from: a */
    public long f58939a = 0;

    /* renamed from: b */
    public long f58940b;

    /* renamed from: c */
    public long f58941c;

    /* renamed from: d */
    public long f58942d;

    /* renamed from: e */
    public long f58943e;

    /* renamed from: f */
    public long f58944f;

    /* renamed from: g */
    public long f58945g;

    /* renamed from: h */
    public int f58946h = 0;

    /* renamed from: i */
    public long f58947i = 0;

    /* renamed from: j */
    public long f58948j = 0;

    /* renamed from: k */
    public Queue<Long> f58949k = new LinkedList();

    /* renamed from: l */
    public C20861b f58950l;

    /* renamed from: m */
    public MTimerHandler f58951m = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C20860a(), true);

    /* renamed from: gv0.o$a */
    public class C20860a implements MTimerHandler.CallBack {
        public C20860a() {
        }

        public boolean onTimerExpired() {
            long j;
            long milliSecondsToNow = Util.milliSecondsToNow(C20859o.this.f58944f);
            if (milliSecondsToNow != 0) {
                C20859o oVar = C20859o.this;
                long j2 = (oVar.f58941c / milliSecondsToNow) * 1000;
                oVar.f58940b = j2;
                ((LinkedList) oVar.f58949k).offer(Long.valueOf(j2));
                try {
                    j = ((Long) ((LinkedList) C20859o.this.f58949k).poll()).longValue();
                } catch (Exception unused) {
                    j = 0;
                }
                C20859o oVar2 = C20859o.this;
                long j3 = (((oVar2.f58939a * 10) - j) + oVar2.f58940b) / 10;
                oVar2.f58940b = j3;
                if (j3 <= 0) {
                    j3 = 0;
                }
                oVar2.f58940b = j3;
                oVar2.f58939a = j3;
                oVar2.f58941c = 0;
                oVar2.f58944f = Util.nowMilliSecond();
                C20859o.this.f58950l.mo17682a();
                C20859o oVar3 = C20859o.this;
                long j4 = oVar3.f58940b;
                if (j4 >= 102400) {
                    if (oVar3.f58946h != 0) {
                        oVar3.f58946h = 0;
                        oVar3.f58945g = 0;
                        oVar3.f58950l.mo17684c(0);
                        Log.m105924i("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is not low speed now.");
                    }
                } else if (j4 < 2) {
                    int i = oVar3.f58946h;
                    if (i == 0) {
                        oVar3.f58946h = 1;
                        oVar3.f58950l.mo17684c(1);
                        C20859o.this.f58945g = Util.nowMilliSecond();
                        Log.m105921e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", Long.valueOf(C20859o.this.f58945g));
                    } else if (i == 1) {
                        long j5 = oVar3.f58945g;
                        if (j5 <= 0) {
                            oVar3.f58945g = Util.nowMilliSecond();
                            Log.m105921e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", Long.valueOf(C20859o.this.f58945g));
                        } else if (Util.milliSecondsToNow(j5) > ((long) 600000)) {
                            Log.m105921e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler low speed overtime, overtime[%d]", Long.valueOf(Util.milliSecondsToNow(C20859o.this.f58945g)));
                            C20859o oVar4 = C20859o.this;
                            oVar4.f58946h = 2;
                            oVar4.f58950l.mo17683b();
                            C20859o.this.f58945g = 0;
                            return false;
                        }
                    }
                } else if (oVar3.f58946h != 1) {
                    oVar3.f58946h = 1;
                    oVar3.f58950l.mo17684c(1);
                    Log.m105920e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is weak now.");
                }
            }
            return true;
        }
    }

    /* renamed from: gv0.o$b */
    public interface C20861b {
        /* renamed from: a */
        void mo17682a();

        /* renamed from: b */
        void mo17683b();

        /* renamed from: c */
        void mo17684c(int i);
    }

    public C20859o(C20861b bVar) {
        this.f58950l = bVar;
    }

    /* renamed from: a */
    public int mo32560a() {
        long j = this.f58947i;
        if (j == 0) {
            Log.m105924i("MicroMsg.BackupSpeedCalculator", "totalSize");
            return 0;
        }
        int i = (int) ((this.f58942d * 100) / j);
        if (i > 100) {
            i = 100;
        }
        Log.m105925i("MicroMsg.BackupSpeedCalculator", "progress:%d, totalSize:%d, receiveDataSize:%d", Integer.valueOf(i), Long.valueOf(this.f58947i), Long.valueOf(this.f58942d));
        return i;
    }

    /* renamed from: b */
    public void mo32561b(long j) {
        this.f58947i = j;
        Log.m105919d("MicroMsg.BackupSpeedCalculator", "totalSize:%d", Long.valueOf(j));
    }

    /* renamed from: c */
    public void mo32562c() {
        this.f58948j -= System.currentTimeMillis();
        Log.m105924i("MicroMsg.BackupSpeedCalculator", "startTickTime");
    }
}
