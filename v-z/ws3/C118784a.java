package ws3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: ws3.a */
public final class C118784a extends JceStruct {

    /* renamed from: g */
    public static C118786c f355370g = new C118786c();

    /* renamed from: h */
    public static ArrayList<C118785b> f355371h = new ArrayList<>();

    /* renamed from: i */
    public static C118787d f355372i = new C118787d();

    /* renamed from: d */
    public C118786c f355373d = null;

    /* renamed from: e */
    public ArrayList<C118785b> f355374e = null;

    /* renamed from: f */
    public C118787d f355375f = null;

    static {
        f355371h.add(new C118785b());
    }

    public JceStruct newInit() {
        return new C118784a();
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f355373d = (C118786c) jceInputStream.read((JceStruct) f355370g, 0, false);
        this.f355374e = (ArrayList) jceInputStream.read(f355371h, 1, false);
        this.f355375f = (C118787d) jceInputStream.read((JceStruct) f355372i, 2, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        C118786c cVar = this.f355373d;
        if (cVar != null) {
            jceOutputStream.write((JceStruct) cVar, 0);
        }
        ArrayList<C118785b> arrayList = this.f355374e;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 1);
        }
        C118787d dVar = this.f355375f;
        if (dVar != null) {
            jceOutputStream.write((JceStruct) dVar, 2);
        }
    }
}
