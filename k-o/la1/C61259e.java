package la1;

import com.tencent.xweb.file.XVFSFile;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: la1.e */
public class C61259e {

    /* renamed from: a */
    public String f174354a;

    /* renamed from: b */
    public long f174355b;

    /* renamed from: c */
    public String f174356c;

    /* renamed from: d */
    public boolean f174357d;

    public C61259e() {
    }

    public String toString() {
        return this.f174356c + XVFSFile.PATH_SEPARATOR + this.f174354a;
    }

    public C61259e(long j, String str, long j2, boolean z) {
        this.f174354a = str;
        this.f174355b = j2;
        this.f174357d = z;
        this.f174356c = new SimpleDateFormat("[yy-MM-dd HH:mm:ss:SSS]").format(new Date(j2));
    }
}
