package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: gw3.g */
public final class C117003g extends JceStruct {

    /* renamed from: d */
    public int f350635d = 0;

    /* renamed from: e */
    public float f350636e = 0.0f;

    /* renamed from: f */
    public float f350637f = 0.0f;

    /* renamed from: g */
    public float f350638g = 0.0f;

    /* renamed from: h */
    public long f350639h = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f350635d = jceInputStream.read(this.f350635d, 0, true);
        this.f350636e = jceInputStream.read(this.f350636e, 1, false);
        this.f350637f = jceInputStream.read(this.f350637f, 2, false);
        this.f350638g = jceInputStream.read(this.f350638g, 3, false);
        this.f350639h = jceInputStream.read(this.f350639h, 4, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350635d, 0);
        jceOutputStream.write(this.f350636e, 1);
        jceOutputStream.write(this.f350637f, 2);
        jceOutputStream.write(this.f350638g, 3);
        jceOutputStream.write(this.f350639h, 4);
    }
}
