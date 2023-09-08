package com.tencent.matrix.backtrace;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.system.Os;
import android.system.StructStat;
import android.util.Pair;
import com.tencent.matrix.backtrace.C114410f;
import com.tencent.matrix.backtrace.C114413h;
import com.tencent.matrix.backtrace.C114419k;
import com.tencent.p014mm.plugin.performance.diagnostic.C115656c;
import com.tencent.xweb.util.FrequentLimiter;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.backtrace.b */
public class C114400b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f342941d;

    /* renamed from: e */
    public final /* synthetic */ C114405e f342942e;

    /* renamed from: com.tencent.matrix.backtrace.b$a */
    public class C114401a implements FileFilter {

        /* renamed from: a */
        public final /* synthetic */ HashMap f342943a;

        public C114401a(C114400b bVar, HashMap hashMap) {
            this.f342943a = hashMap;
        }

        public boolean accept(File file) {
            File file2 = file;
            try {
                String name = file.getName();
                String absolutePath = file.getAbsolutePath();
                if (!name.contains("_malformed_")) {
                    if (!name.contains("_temp_")) {
                        StructStat lstat = Os.lstat(absolutePath);
                        long max = Math.max(lstat.st_atime, lstat.st_mtime) * 1000;
                        C118672d.m167353c("Matrix.WarmUpDelegate", "File(%s) last access time %s", absolutePath, Long.valueOf(max));
                        if (System.currentTimeMillis() - max > 259200000) {
                            file.delete();
                            C118672d.m167353c("Matrix.WarmUpDelegate", "Delete long time no access file(%s)", absolutePath);
                        } else if (max < System.currentTimeMillis()) {
                            int lastIndexOf = name.lastIndexOf(46);
                            if (lastIndexOf == -1) {
                                return false;
                            }
                            String substring = name.substring(0, lastIndexOf);
                            if (name.endsWith(".hash")) {
                                return false;
                            }
                            Pair pair = (Pair) this.f342943a.get(substring);
                            if (pair == null) {
                                this.f342943a.put(substring, new Pair(file2, Long.valueOf(max)));
                            } else if (max > ((Long) pair.second).longValue()) {
                                if (System.currentTimeMillis() - ((Long) pair.second).longValue() >= 172800000) {
                                    ((File) pair.first).delete();
                                    C118672d.m167353c("Matrix.WarmUpDelegate", "Delete file(%s) cause %s is newer(%s vs %s).", ((File) pair.first).getName(), name, pair.second, Long.valueOf(max));
                                }
                                this.f342943a.put(substring, new Pair(file2, Long.valueOf(max)));
                            } else if (System.currentTimeMillis() - max >= 172800000) {
                                file.delete();
                                C118672d.m167353c("Matrix.WarmUpDelegate", "Delete file(%s) cause %s is newer(%s vs %s).", name, ((File) pair.first).getName(), Long.valueOf(max), pair.second);
                            }
                        } else if (max - System.currentTimeMillis() >= FrequentLimiter.WEEK_MILLS) {
                            file.delete();
                            C118672d.m167353c("Matrix.WarmUpDelegate", "Delete future file(%s)", absolutePath);
                        }
                        return false;
                    }
                }
                if (System.currentTimeMillis() - file.lastModified() >= 172800000) {
                    C118672d.m167353c("Matrix.WarmUpDelegate", "Delete malformed and temp file %s", absolutePath);
                    file.delete();
                }
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.WarmUpDelegate", th, "", new Object[0]);
            }
            return false;
        }
    }

    public C114400b(C114405e eVar, CancellationSignal cancellationSignal) {
        this.f342942e = eVar;
        this.f342941d = cancellationSignal;
    }

    public void run() {
        boolean z;
        C114413h.C114415b bVar = C114413h.C114415b.CleanUp;
        C114419k.C114420a aVar = this.f342942e.f342955f;
        aVar.getClass();
        File file = new File(C114417j.m160947b(aVar));
        C118672d.m167353c("Matrix.WarmUpDelegate", "Going to clean up saving path(%s)..", file.getAbsoluteFile());
        if (!file.isDirectory()) {
            this.f342942e.f342954e.mo173584a(bVar);
            return;
        }
        try {
            C114417j.m160950e(file, this.f342941d, new C114401a(this, new HashMap()));
        } catch (OperationCanceledException unused) {
            z = true;
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.WarmUpDelegate", th, "", new Object[0]);
        }
        z = false;
        if (!z) {
            File a = C114417j.m160946a(this.f342942e.f342955f.f343004a);
            try {
                a.createNewFile();
                a.setLastModified(System.currentTimeMillis());
            } catch (IOException e) {
                C118672d.m167354d("Matrix.Backtrace.WarmUp", e, "", new Object[0]);
            }
            this.f342942e.f342954e.mo173584a(bVar);
            C118672d.m167353c("Matrix.WarmUpDelegate", "Clean up saving path(%s) done.", file.getAbsoluteFile());
            C114410f fVar = C114405e.f342949h;
            if (fVar != null) {
                ((C115656c) fVar).mo175880a(C114410f.C114411a.CleanedUp, new Object[0]);
                return;
            }
            return;
        }
        C118672d.m167353c("Matrix.WarmUpDelegate", "Clean up saving path(%s) cancelled.", file.getAbsoluteFile());
    }
}
