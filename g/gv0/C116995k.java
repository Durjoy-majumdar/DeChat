package gv0;

import a70.C112760b;
import android.os.Looper;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: gv0.k */
public class C116995k {

    /* renamed from: c */
    public static long f350572c;

    /* renamed from: d */
    public static long f350573d;

    /* renamed from: e */
    public static long f350574e;

    /* renamed from: f */
    public static long f350575f;

    /* renamed from: a */
    public SimpleDateFormat f350576a = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: b */
    public MTimerHandler f350577b;

    /* renamed from: gv0.k$a */
    public class C116996a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ Long f350578d;

        /* renamed from: e */
        public final /* synthetic */ int f350579e;

        /* renamed from: f */
        public final /* synthetic */ Long f350580f;

        public C116996a(Long l, int i, Long l2) {
            this.f350578d = l;
            this.f350579e = i;
            this.f350580f = l2;
        }

        public boolean onTimerExpired() {
            Long valueOf = Long.valueOf(Util.nowMilliSecond());
            C116995k kVar = C116995k.this;
            long longValue = valueOf.longValue();
            long j = 0;
            for (long longValue2 = this.f350578d.longValue(); longValue2 <= longValue + 86400000; longValue2 += 86400000) {
                j += kVar.mo180960a(longValue2);
            }
            kVar.getClass();
            Long valueOf2 = Long.valueOf(j);
            Log.m105925i("MicroMsg.BackupLogManager", "backupAfterLogTimeHandler, backupMode[%d], endAfterLogTime[%d], startAfterLogTime[%d], endAfterLogSize[%d], startAfterLogSize[%d]", Integer.valueOf(this.f350579e), valueOf, this.f350578d, valueOf2, this.f350580f);
            if (valueOf2.longValue() != 0 && valueOf2.longValue() > this.f350580f.longValue()) {
                C116995k.this.mo180961b(this.f350579e, valueOf.longValue() - this.f350578d.longValue(), valueOf2.longValue() - this.f350580f.longValue(), true);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final long mo180960a(long j) {
        String format = this.f350576a.format(new Date(j));
        String str = C72994y1.f212833b + "/MM_" + format + ".xlog";
        if (C86013q1.m106450k(str)) {
            return C86013q1.m106451l(str);
        }
        String str2 = C112760b.m154234h0() + "/MM_" + format + ".xlog";
        if (C86013q1.m106450k(str2)) {
            return C86013q1.m106451l(str2);
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo180961b(int i, long j, long j2, boolean z) {
        int i2 = i;
        if (j2 == 0) {
            Log.m105920e("MicroMsg.BackupLogManager", "reportKv logSize is 0, skip report");
            return;
        }
        long j3 = j2 / (j / 1000);
        Log.m105925i("MicroMsg.BackupLogManager", "reportKv, backupMode[%d], time[%d ms], logSize[%d KB], aveLogSize[%d B/s]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        if (i2 != 11) {
            if (i2 != 12) {
                if (i2 != 21) {
                    if (i2 == 22) {
                        if (!z) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.idkeyStat(485, 96, j2 / 1024, false);
                            if (j != 0) {
                                nVar.idkeyStat(485, 97, j3, false);
                            }
                            mo180962c(i);
                            return;
                        }
                        C115669n.INSTANCE.idkeyStat(485, 98, j2 / 1024, false);
                    }
                } else if (!z) {
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.idkeyStat(485, 91, j2 / 1024, false);
                    if (j != 0) {
                        nVar2.idkeyStat(485, 92, j3, false);
                    }
                    mo180962c(i);
                } else {
                    C115669n.INSTANCE.idkeyStat(485, 93, j2 / 1024, false);
                }
            } else if (!z) {
                C115669n nVar3 = C115669n.INSTANCE;
                nVar3.idkeyStat(400, 86, j2 / 1024, false);
                if (j != 0) {
                    nVar3.idkeyStat(400, 87, j3, false);
                }
                mo180962c(i);
            } else {
                C115669n.INSTANCE.idkeyStat(400, 88, j2 / 1024, false);
            }
        } else if (!z) {
            C115669n nVar4 = C115669n.INSTANCE;
            nVar4.idkeyStat(400, 81, j2 / 1024, false);
            if (j != 0) {
                nVar4.idkeyStat(400, 82, j3, false);
            }
            mo180962c(i);
        } else {
            C115669n.INSTANCE.idkeyStat(400, 83, j2 / 1024, false);
        }
    }

    /* renamed from: c */
    public final void mo180962c(int i) {
        Long valueOf = Long.valueOf(Util.nowMilliSecond());
        Long valueOf2 = Long.valueOf(mo180960a(Util.nowMilliSecond()));
        if (valueOf.longValue() == 0 || valueOf2.longValue() == 0) {
            Log.m105921e("MicroMsg.BackupLogManager", "startLogAfterTimeHandler is zero, startAfterLogTime[%d], startAfterLogSize[%d], skip", valueOf, valueOf2);
            return;
        }
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C116996a(valueOf, i, valueOf2), false);
        this.f350577b = mTimerHandler;
        mTimerHandler.startTimer(300000);
    }
}
