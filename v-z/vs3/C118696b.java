package vs3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: vs3.b */
public final class C118696b extends JceStruct {

    /* renamed from: d */
    public int f355170d = 0;

    /* renamed from: e */
    public int f355171e = 0;

    /* renamed from: f */
    public int f355172f = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f355170d = jceInputStream.read(this.f355170d, 1, true);
        this.f355171e = jceInputStream.read(this.f355171e, 2, true);
        this.f355172f = jceInputStream.read(this.f355172f, 3, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f355170d, 1);
        jceOutputStream.write(this.f355171e, 2);
        jceOutputStream.write(this.f355172f, 3);
    }
}
