package vs3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: vs3.a */
public final class C118695a extends JceStruct {

    /* renamed from: d */
    public int f355168d = 0;

    /* renamed from: e */
    public int f355169e = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f355168d = jceInputStream.read(this.f355168d, 0, true);
        this.f355169e = jceInputStream.read(this.f355169e, 1, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f355168d, 0);
        jceOutputStream.write(this.f355169e, 1);
    }
}
