package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: gw3.i */
public final class C117005i extends JceStruct {

    /* renamed from: d */
    public int f350643d = 0;

    /* renamed from: e */
    public float f350644e = 0.0f;

    /* renamed from: f */
    public float f350645f = 0.0f;

    /* renamed from: g */
    public long f350646g = 0;

    /* renamed from: h */
    public float f350647h = 0.0f;

    /* renamed from: i */
    public float f350648i = 0.0f;

    /* renamed from: j */
    public int f350649j = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f350643d = jceInputStream.read(this.f350643d, 0, true);
        this.f350644e = jceInputStream.read(this.f350644e, 1, true);
        this.f350645f = jceInputStream.read(this.f350645f, 2, true);
        this.f350646g = jceInputStream.read(this.f350646g, 3, true);
        this.f350647h = jceInputStream.read(this.f350647h, 4, false);
        this.f350648i = jceInputStream.read(this.f350648i, 5, false);
        this.f350649j = jceInputStream.read(this.f350649j, 6, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350643d, 0);
        jceOutputStream.write(this.f350644e, 1);
        jceOutputStream.write(this.f350645f, 2);
        jceOutputStream.write(this.f350646g, 3);
        jceOutputStream.write(this.f350647h, 4);
        jceOutputStream.write(this.f350648i, 5);
        jceOutputStream.write(this.f350649j, 6);
    }
}
