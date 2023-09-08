package bt3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: bt3.d */
public final class C113209d extends JceStruct {

    /* renamed from: f */
    public static C113207b f338738f;

    /* renamed from: d */
    public int f338739d = 0;

    /* renamed from: e */
    public C113207b f338740e = null;

    public void readFrom(JceInputStream jceInputStream) {
        this.f338739d = jceInputStream.read(this.f338739d, 0, true);
        if (f338738f == null) {
            f338738f = new C113207b();
        }
        this.f338740e = (C113207b) jceInputStream.read((JceStruct) f338738f, 1, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f338739d, 0);
        C113207b bVar = this.f338740e;
        if (bVar != null) {
            jceOutputStream.write((JceStruct) bVar, 1);
        }
    }
}
