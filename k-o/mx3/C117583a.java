package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: mx3.a */
public final class C117583a extends JceStruct {

    /* renamed from: d */
    public String f351741d = "";

    /* renamed from: e */
    public String f351742e = "";

    /* renamed from: f */
    public String f351743f = "";

    /* renamed from: g */
    public String f351744g = "";

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351743f = jceInputStream.readString(0, false);
        this.f351741d = jceInputStream.readString(1, false);
        this.f351744g = jceInputStream.readString(2, false);
        this.f351742e = jceInputStream.readString(3, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.f351743f;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        String str2 = this.f351741d;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        String str3 = this.f351744g;
        if (str3 != null) {
            jceOutputStream.write(str3, 2);
        }
        String str4 = this.f351742e;
        if (str4 != null) {
            jceOutputStream.write(str4, 3);
        }
    }
}
