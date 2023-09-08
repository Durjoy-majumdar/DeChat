package p1207p9;

import com.p013qq.taf.RequestPacket;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;

/* renamed from: p9.b */
public class C117993b extends C117992a {

    /* renamed from: g */
    public RequestPacket f352686g;

    public C117993b() {
        RequestPacket requestPacket = new RequestPacket();
        this.f352686g = requestPacket;
        requestPacket.iVersion = 2;
    }

    public void display(StringBuilder sb, int i) {
        this.f352686g.display(sb, i);
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.f352686g.readFrom(jceInputStream);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        this.f352686g.writeTo(jceOutputStream);
    }
}
