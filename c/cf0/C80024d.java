package cf0;

import com.tencent.stubs.logger.Log;
import gf0.C87180c;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cf0.d */
public class C80024d implements Closeable {

    /* renamed from: d */
    public File f234447d;

    /* renamed from: e */
    public List<C87180c> f234448e;

    /* renamed from: f */
    public boolean f234449f = true;

    public C80024d() {
        new ArrayList();
        File createTempFile = File.createTempFile("mm_patch", "tmp");
        this.f234447d = createTempFile;
        createTempFile.deleteOnExit();
    }

    /* renamed from: a */
    public void mo110265a() {
        try {
            File file = this.f234447d;
            if (file != null) {
                file.delete();
            }
        } catch (Exception e) {
            Log.m106505i("HdiffApk-tempFile", "e = " + e);
        }
    }

    public void close() {
        if (this.f234449f) {
            this.f234447d.delete();
        }
    }
}
