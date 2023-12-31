package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzgj<V> extends FutureTask<V> implements Comparable<zzgj> {
    private final String zzaly;
    private final /* synthetic */ zzgg zzalz;
    private final long zzama;
    public final boolean zzamb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgj(zzgg zzgg, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.zzalz = zzgg;
        Preconditions.checkNotNull(str);
        long andIncrement = zzgg.zzalx.getAndIncrement();
        this.zzama = andIncrement;
        this.zzaly = str;
        this.zzamb = false;
        if (andIncrement == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            zzgg.zzge().zzim().log("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgj(zzgg zzgg, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.zzalz = zzgg;
        Preconditions.checkNotNull(str);
        long andIncrement = zzgg.zzalx.getAndIncrement();
        this.zzama = andIncrement;
        this.zzaly = str;
        this.zzamb = z;
        if (andIncrement == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            zzgg.zzge().zzim().log("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzgj zzgj = (zzgj) obj;
        boolean z = this.zzamb;
        if (z != zzgj.zzamb) {
            return z ? -1 : 1;
        }
        long j = this.zzama;
        long j2 = zzgj.zzama;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzalz.zzge().zzin().zzg("Two tasks share the same index. index", Long.valueOf(this.zzama));
        return 0;
    }

    public final void setException(Throwable th) {
        this.zzalz.zzge().zzim().zzg(this.zzaly, th);
        if (th instanceof zzgh) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
