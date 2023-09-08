package gw3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: gw3.d */
public final class C117000d extends JceStruct {

    /* renamed from: d */
    public String f350620d = "";

    /* renamed from: e */
    public String f350621e = "";

    public void readFrom(JceInputStream jceInputStream) {
        this.f350620d = jceInputStream.readString(0, true);
        this.f350621e = jceInputStream.readString(1, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f350620d, 0);
        jceOutputStream.write(this.f350621e, 1);
    }
}
