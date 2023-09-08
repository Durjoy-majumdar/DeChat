package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: mx3.c */
public final class C117585c extends JceStruct {

    /* renamed from: d */
    public String f351749d = "";

    /* renamed from: e */
    public String f351750e = "";

    /* renamed from: f */
    public String f351751f = "";

    /* renamed from: g */
    public String f351752g = "";

    /* renamed from: h */
    public String f351753h = "";

    /* renamed from: i */
    public String f351754i = "";

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351749d = jceInputStream.readString(0, true);
        this.f351754i = jceInputStream.readString(1, true);
        this.f351753h = jceInputStream.readString(2, true);
        this.f351751f = jceInputStream.readString(3, true);
        this.f351750e = jceInputStream.readString(4, true);
        this.f351752g = jceInputStream.readString(5, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351749d, 0);
        jceOutputStream.write(this.f351754i, 1);
        jceOutputStream.write(this.f351753h, 2);
        jceOutputStream.write(this.f351751f, 3);
        jceOutputStream.write(this.f351750e, 4);
        String str = this.f351752g;
        if (str != null) {
            jceOutputStream.write(str, 5);
        }
    }
}
