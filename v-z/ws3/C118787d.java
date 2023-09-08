package ws3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: ws3.d */
public final class C118787d extends JceStruct {

    /* renamed from: d */
    public String f355413d = "";

    /* renamed from: e */
    public String f355414e = "";

    /* renamed from: f */
    public String f355415f = "";

    /* renamed from: g */
    public String f355416g = "";

    /* renamed from: h */
    public int f355417h = 0;

    /* renamed from: i */
    public String f355418i = "";

    /* renamed from: j */
    public String f355419j = "";

    /* renamed from: n */
    public int f355420n = 0;

    public JceStruct newInit() {
        return new C118787d();
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f355413d = jceInputStream.readString(0, false);
        this.f355414e = jceInputStream.readString(1, false);
        this.f355415f = jceInputStream.readString(2, false);
        this.f355416g = jceInputStream.readString(3, false);
        this.f355417h = jceInputStream.read(this.f355417h, 4, false);
        this.f355418i = jceInputStream.readString(5, false);
        this.f355419j = jceInputStream.readString(6, false);
        this.f355420n = jceInputStream.read(this.f355420n, 7, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.f355413d;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        String str2 = this.f355414e;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        String str3 = this.f355415f;
        if (str3 != null) {
            jceOutputStream.write(str3, 2);
        }
        String str4 = this.f355416g;
        if (str4 != null) {
            jceOutputStream.write(str4, 3);
        }
        int i = this.f355417h;
        if (i != 0) {
            jceOutputStream.write(i, 4);
        }
        String str5 = this.f355418i;
        if (str5 != null) {
            jceOutputStream.write(str5, 5);
        }
        String str6 = this.f355419j;
        if (str6 != null) {
            jceOutputStream.write(str6, 6);
        }
        int i2 = this.f355420n;
        if (i2 != 0) {
            jceOutputStream.write(i2, 7);
        }
    }
}
