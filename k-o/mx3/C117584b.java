package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: mx3.b */
public final class C117584b extends JceStruct {

    /* renamed from: g */
    public static byte[] f351745g;

    /* renamed from: d */
    public byte[] f351746d = null;

    /* renamed from: e */
    public String f351747e = "";

    /* renamed from: f */
    public byte f351748f = 0;

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351748f = jceInputStream.read(this.f351748f, 0, true);
        this.f351747e = jceInputStream.readString(1, false);
        if (f351745g == null) {
            byte[] bArr = new byte[1];
            f351745g = bArr;
            bArr[0] = 0;
        }
        this.f351746d = jceInputStream.read(f351745g, 2, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351748f, 0);
        String str = this.f351747e;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        jceOutputStream.write(this.f351746d, 2);
    }
}
