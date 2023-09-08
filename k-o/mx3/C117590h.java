package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mx3.h */
public final class C117590h extends JceStruct {

    /* renamed from: j */
    public static Map<String, String> f351803j;

    /* renamed from: d */
    public float f351804d = 0.0f;

    /* renamed from: e */
    public float f351805e = 0.0f;

    /* renamed from: f */
    public long f351806f = 0;

    /* renamed from: g */
    public long f351807g = 0;

    /* renamed from: h */
    public long f351808h = 0;

    /* renamed from: i */
    public Map<String, String> f351809i = null;

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f351804d = jceInputStream.read(this.f351804d, 0, true);
        this.f351805e = jceInputStream.read(this.f351805e, 1, true);
        this.f351806f = jceInputStream.read(this.f351806f, 2, true);
        this.f351808h = jceInputStream.read(this.f351808h, 3, true);
        this.f351807g = jceInputStream.read(this.f351807g, 4, true);
        if (f351803j == null) {
            HashMap hashMap = new HashMap();
            f351803j = hashMap;
            hashMap.put("", "");
        }
        this.f351809i = (Map) jceInputStream.read(f351803j, 5, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351804d, 0);
        jceOutputStream.write(this.f351805e, 1);
        jceOutputStream.write(this.f351806f, 2);
        jceOutputStream.write(this.f351808h, 3);
        jceOutputStream.write(this.f351807g, 4);
        Map<String, String> map = this.f351809i;
        if (map != null) {
            jceOutputStream.write(map, 5);
        }
    }
}
