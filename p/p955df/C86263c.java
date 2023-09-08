package p955df;

import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import p723vf.C118672d;
import p976hf.C87484a;

/* renamed from: df.c */
public class C86263c {

    /* renamed from: a */
    public final Context f250865a;

    /* renamed from: b */
    public final Handler f250866b;

    /* renamed from: df.c$a */
    public interface C86264a {
    }

    public C86263c(Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f250865a = context;
        this.f250866b = handler;
    }

    /* renamed from: a */
    public File mo120671a(boolean z) {
        File file;
        try {
            file = C86266e.f250872e.mo120674b("", false);
        } catch (FileNotFoundException e) {
            C118672d.m167354d("Matrix.AndroidHeapDumper", e, "", new Object[0]);
            file = null;
        }
        if (file == null) {
            C118672d.m167356f("Matrix.AndroidHeapDumper", "hprof file is null.", new Object[0]);
            return null;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            C118672d.m167356f("Matrix.AndroidHeapDumper", "hprof file path: %s does not indicate a full path.", file.getAbsolutePath());
            return null;
        } else if (!parentFile.canWrite()) {
            C118672d.m167356f("Matrix.AndroidHeapDumper", "hprof file path: %s cannot be written.", file.getAbsolutePath());
            return null;
        } else if (((double) parentFile.getFreeSpace()) < 1.610612736E9d) {
            C118672d.m167356f("Matrix.AndroidHeapDumper", "hprof file path: %s free space not enough", parentFile.getAbsolutePath());
            return null;
        } else if (z) {
            C87484a aVar = new C87484a();
            this.f250866b.post(new C86260a(this, aVar));
            try {
                if (!aVar.f253473b.await(5, TimeUnit.SECONDS)) {
                    C118672d.m167356f("Matrix.AndroidHeapDumper", "give up dumping heap, waiting for toast too long.", new Object[0]);
                    return null;
                }
                try {
                    Debug.dumpHprofData(file.getAbsolutePath());
                    if (aVar.f253473b.getCount() <= 0) {
                        this.f250866b.post(new C86262b(this, (Toast) aVar.f253472a.get()));
                        return file;
                    }
                    throw new IllegalStateException("Call wait() and check its result");
                } catch (Exception e2) {
                    C118672d.m167354d("Matrix.AndroidHeapDumper", e2, "failed to dump heap into file: %s.", file.getAbsolutePath());
                    return null;
                }
            } catch (InterruptedException e3) {
                throw new RuntimeException("Did not expect thread to be interrupted", e3);
            }
        } else {
            try {
                Debug.dumpHprofData(file.getAbsolutePath());
                return file;
            } catch (Exception e4) {
                C118672d.m167354d("Matrix.AndroidHeapDumper", e4, "failed to dump heap into file: %s.", file.getAbsolutePath());
                return null;
            }
        }
    }
}
