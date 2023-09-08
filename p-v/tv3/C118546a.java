package tv3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

/* renamed from: tv3.a */
public final class C118546a extends JceStruct {

    /* renamed from: d */
    public int f354758d = 0;

    /* renamed from: e */
    public int f354759e = 0;

    /* renamed from: f */
    public int f354760f = 0;

    public void readFrom(JceInputStream jceInputStream) {
        this.f354758d = jceInputStream.read(this.f354758d, 1, true);
        this.f354759e = jceInputStream.read(this.f354759e, 2, true);
        this.f354760f = jceInputStream.read(this.f354760f, 3, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f354758d, 1);
        jceOutputStream.write(this.f354759e, 2);
        jceOutputStream.write(this.f354760f, 3);
    }
}
