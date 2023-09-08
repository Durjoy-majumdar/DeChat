package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: mx3.g */
public final class C117589g extends JceStruct {

    /* renamed from: d */
    public String f351800d = "";

    /* renamed from: e */
    public String f351801e = "";

    /* renamed from: f */
    public String f351802f = "";

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351800d = jceInputStream.readString(0, true);
        this.f351802f = jceInputStream.readString(1, true);
        this.f351801e = jceInputStream.readString(2, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351800d, 0);
        jceOutputStream.write(this.f351802f, 1);
        String str = this.f351801e;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
    }
}
