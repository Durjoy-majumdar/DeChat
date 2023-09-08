package bt3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: bt3.b */
public final class C113207b extends JceStruct {

    /* renamed from: d */
    public String f338733d = "";

    /* renamed from: e */
    public int f338734e = 0;

    /* renamed from: f */
    public float f338735f = 0.0f;

    /* renamed from: g */
    public String f338736g = "";

    public void readFrom(JceInputStream jceInputStream) {
        this.f338733d = jceInputStream.readString(0, true);
        this.f338734e = jceInputStream.read(this.f338734e, 1, true);
        this.f338735f = jceInputStream.read(this.f338735f, 2, true);
        this.f338736g = jceInputStream.readString(3, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f338733d, 0);
        jceOutputStream.write(this.f338734e, 1);
        jceOutputStream.write(this.f338735f, 2);
        String str = this.f338736g;
        if (str != null) {
            jceOutputStream.write(str, 3);
        }
    }
}
