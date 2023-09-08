package bt3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: bt3.f */
public final class C113211f extends JceStruct {

    /* renamed from: d */
    public long f338748d = 0;

    /* renamed from: e */
    public float f338749e = 0.0f;

    /* renamed from: f */
    public float f338750f = 0.0f;

    /* renamed from: g */
    public float f338751g = 0.0f;

    public void readFrom(JceInputStream jceInputStream) {
        this.f338748d = jceInputStream.read(this.f338748d, 0, true);
        this.f338749e = jceInputStream.read(this.f338749e, 1, true);
        this.f338750f = jceInputStream.read(this.f338750f, 2, true);
        this.f338751g = jceInputStream.read(this.f338751g, 3, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f338748d, 0);
        jceOutputStream.write(this.f338749e, 1);
        jceOutputStream.write(this.f338750f, 2);
        jceOutputStream.write(this.f338751g, 3);
    }
}
