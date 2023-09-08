package p914oj;

import android.media.MediaRecorder;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;

/* renamed from: oj.d */
public class C100362d extends MediaRecorder {

    /* renamed from: a */
    public C86009m1 f293958a;

    /* renamed from: b */
    public FileDescriptor f293959b;

    public void prepare() {
        FileDescriptor fileDescriptor = this.f293959b;
        if (fileDescriptor != null) {
            super.setOutputFile(fileDescriptor);
            super.prepare();
            return;
        }
        C86009m1 m1Var = this.f293958a;
        if (m1Var != null) {
            ParcelFileDescriptor y = C86013q1.m106464y(m1Var.f250486d, m1Var.mo119989z(), "rw");
            try {
                super.setOutputFile(y.getFileDescriptor());
                super.prepare();
                y.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("No valid output file");
        }
        throw th;
    }

    public void setOutputFile(String str) {
        this.f293958a = str == null ? null : new C86009m1(str);
        this.f293959b = null;
    }

    @Deprecated
    public void setOutputFile(File file) {
        setOutputFile(file.getPath());
    }

    public void setOutputFile(FileDescriptor fileDescriptor) {
        this.f293958a = null;
        this.f293959b = fileDescriptor;
    }
}
