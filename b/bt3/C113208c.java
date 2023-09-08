package bt3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: bt3.c */
public final class C113208c extends JceStruct {

    /* renamed from: d */
    public int f338737d = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f338737d = jceInputStream.read(this.f338737d, 0, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        int i = this.f338737d;
        if (i != 0) {
            jceOutputStream.write(i, 0);
        }
    }
}
