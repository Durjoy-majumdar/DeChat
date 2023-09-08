package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: gw3.b */
public final class C116998b extends JceStruct {

    /* renamed from: d */
    public String f350613d = "";

    /* renamed from: e */
    public String f350614e = "";

    public void readFrom(JceInputStream jceInputStream) {
        this.f350613d = jceInputStream.readString(0, true);
        this.f350614e = jceInputStream.readString(1, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350613d, 0);
        String str = this.f350614e;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
    }
}
