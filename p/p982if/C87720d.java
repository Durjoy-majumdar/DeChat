package p982if;

import android.os.Build;
import com.tencent.matrix.resource.MemoryUtil;
import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import java.io.File;
import java.io.FileNotFoundException;
import p425ze.C91671f;
import p723vf.C118672d;
import p937cf.C80018a;
import p955df.C86266e;
import p987jf.C87954a;

/* renamed from: if.d */
public class C87720d extends C87719c {
    public C87720d(C87954a aVar) {
        super(aVar);
    }

    /* renamed from: b */
    public boolean mo112104b(DestroyedActivityInfo destroyedActivityInfo) {
        mo122138c(0, C80018a.C80020b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        int i = Build.VERSION.SDK_INT;
        if (i > 31) {
            C118672d.m167352b("Matrix.LeakProcessor.ForkDump", "unsupported API version " + i, new Object[0]);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file = null;
        try {
            file = C86266e.f250872e.mo120674b("FDP", true);
        } catch (FileNotFoundException e) {
            C118672d.m167354d("Matrix.LeakProcessor.ForkDump", e, "", new Object[0]);
        }
        if (file == null) {
            C118672d.m167352b("Matrix.LeakProcessor.ForkDump", "cannot create hprof file, just ignore", new Object[0]);
            return true;
        } else if (!MemoryUtil.m98119e(file.getPath(), 600)) {
            C118672d.m167352b("Matrix.LeakProcessor.ForkDump", String.format("heap dump for further analyzing activity with key [%s] was failed, just ignore.", new Object[]{destroyedActivityInfo.mKey}), new Object[0]);
            return true;
        } else {
            C118672d.m167353c("Matrix.LeakProcessor.ForkDump", String.format("dump cost=%sms refString=%s path=%s", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), destroyedActivityInfo.mKey, file.getPath()}), new Object[0]);
            this.f253997a.mo125242b(destroyedActivityInfo.mActivityName, true);
            this.f253997a.mo122416c();
            if (this.f253999c == null) {
                this.f253999c = new C87718b(this);
            }
            ((C87718b) this.f253999c).mo122136a(new C91671f(file, destroyedActivityInfo.mKey, destroyedActivityInfo.mActivityName));
            return true;
        }
    }
}
