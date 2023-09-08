package mx3;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

/* renamed from: mx3.e */
public final class C117587e extends JceStruct implements Cloneable {

    /* renamed from: e */
    public static ArrayList<C117586d> f351785e;

    /* renamed from: d */
    public ArrayList<C117586d> f351786d = null;

    public void display(StringBuilder sb, int i) {
    }

    public void readFrom(JceInputStream jceInputStream) {
        if (f351785e == null) {
            ArrayList<C117586d> arrayList = new ArrayList<>();
            f351785e = arrayList;
            arrayList.add(new C117586d());
        }
        this.f351786d = (ArrayList) jceInputStream.read(f351785e, 0, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f351786d, 0);
    }
}
