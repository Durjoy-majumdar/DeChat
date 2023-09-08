package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mx3.f */
public final class C117588f extends JceStruct {

    /* renamed from: s */
    public static Map<String, String> f351787s;

    /* renamed from: d */
    public String f351788d = "";

    /* renamed from: e */
    public String f351789e = "";

    /* renamed from: f */
    public String f351790f = "";

    /* renamed from: g */
    public String f351791g = "";

    /* renamed from: h */
    public long f351792h = 0;

    /* renamed from: i */
    public String f351793i = "";

    /* renamed from: j */
    public long f351794j = 0;

    /* renamed from: n */
    public String f351795n = "";

    /* renamed from: o */
    public String f351796o = "";

    /* renamed from: p */
    public String f351797p = "";

    /* renamed from: q */
    public String f351798q = "";

    /* renamed from: r */
    public Map<String, String> f351799r = null;

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351798q = jceInputStream.readString(0, true);
        this.f351797p = jceInputStream.readString(1, false);
        this.f351793i = jceInputStream.readString(2, false);
        this.f351791g = jceInputStream.readString(3, false);
        this.f351788d = jceInputStream.readString(4, false);
        this.f351795n = jceInputStream.readString(5, false);
        this.f351796o = jceInputStream.readString(6, false);
        this.f351792h = jceInputStream.read(this.f351792h, 7, false);
        this.f351794j = jceInputStream.read(this.f351794j, 8, false);
        this.f351790f = jceInputStream.readString(9, false);
        this.f351789e = jceInputStream.readString(10, false);
        if (f351787s == null) {
            HashMap hashMap = new HashMap();
            f351787s = hashMap;
            hashMap.put("", "");
        }
        this.f351799r = (Map) jceInputStream.read(f351787s, 11, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351798q, 0);
        String str = this.f351797p;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        String str2 = this.f351793i;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        String str3 = this.f351791g;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        String str4 = this.f351788d;
        if (str4 != null) {
            jceOutputStream.write(str4, 4);
        }
        String str5 = this.f351795n;
        if (str5 != null) {
            jceOutputStream.write(str5, 5);
        }
        String str6 = this.f351796o;
        if (str6 != null) {
            jceOutputStream.write(str6, 6);
        }
        jceOutputStream.write(this.f351792h, 7);
        jceOutputStream.write(this.f351794j, 8);
        String str7 = this.f351790f;
        if (str7 != null) {
            jceOutputStream.write(str7, 9);
        }
        String str8 = this.f351789e;
        if (str8 != null) {
            jceOutputStream.write(str8, 10);
        }
        Map<String, String> map = this.f351799r;
        if (map != null) {
            jceOutputStream.write(map, 11);
        }
    }
}
