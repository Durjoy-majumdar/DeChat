package com.tencent.matrix.backtrace;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import com.tencent.matrix.backtrace.C114410f;
import com.tencent.matrix.backtrace.C114413h;
import com.tencent.p014mm.plugin.performance.diagnostic.C115656c;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.CancellationException;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.backtrace.d */
public class C114403d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f342946d;

    /* renamed from: e */
    public final /* synthetic */ C114405e f342947e;

    /* renamed from: com.tencent.matrix.backtrace.d$a */
    public class C114404a implements FileFilter {

        /* renamed from: a */
        public final /* synthetic */ long[] f342948a;

        public C114404a(C114403d dVar, long[] jArr) {
            this.f342948a = jArr;
        }

        public boolean accept(File file) {
            try {
                StructStat lstat = Os.lstat(file.getAbsolutePath());
                long[] jArr = this.f342948a;
                jArr[0] = jArr[0] + 1;
                long j = jArr[1];
                long j2 = lstat.st_blocks;
                long j3 = lstat.st_blksize;
                Long.signum(j2);
                jArr[1] = j + (j2 * j3);
            } catch (ErrnoException e) {
                C118672d.m167354d("Matrix.WarmUpDelegate", e, "", new Object[0]);
            }
            return false;
        }
    }

    public C114403d(C114405e eVar, CancellationSignal cancellationSignal) {
        this.f342947e = eVar;
        this.f342946d = cancellationSignal;
    }

    public void run() {
        C114413h.C114415b bVar = C114413h.C114415b.DiskUsage;
        File file = new File(this.f342947e.f342951b);
        if (!file.isDirectory()) {
            this.f342947e.f342954e.mo173584a(bVar);
            return;
        }
        long[] jArr = new long[2];
        try {
            C114417j.m160950e(file, this.f342946d, new C114404a(this, jArr));
            this.f342947e.f342954e.mo173584a(bVar);
            C114417j.m160951f(this.f342947e.f342955f.f343004a);
            C118672d.m167353c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
            C114410f fVar = C114405e.f342949h;
            if (fVar != null) {
                ((C115656c) fVar).mo175880a(C114410f.C114411a.DiskUsage, Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
            }
        } catch (OperationCanceledException | CancellationException unused) {
            this.f342947e.f342954e.mo173584a(bVar);
            C114417j.m160951f(this.f342947e.f342955f.f343004a);
            C118672d.m167353c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
        } catch (Throwable th) {
            this.f342947e.f342954e.mo173584a(bVar);
            C114417j.m160951f(this.f342947e.f342955f.f343004a);
            C118672d.m167353c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
            throw th;
        }
    }
}
