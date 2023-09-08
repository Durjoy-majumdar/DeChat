package sv3;

import com.p013qq.taf.RequestPacket;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceUtil;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

/* renamed from: sv3.a */
public class C118317a {

    /* renamed from: a */
    public String f353597a = "UTF-8";

    /* renamed from: b */
    public RequestPacket f353598b = new RequestPacket();

    /* renamed from: c */
    public HashMap<String, byte[]> f353599c = new HashMap<>();

    public C118317a(boolean z) {
        new HashMap();
        this.f353598b.iVersion = 3;
    }

    /* renamed from: a */
    public byte[] mo183100a() {
        RequestPacket requestPacket = this.f353598b;
        if (requestPacket.sServantName == null) {
            requestPacket.sServantName = "";
        }
        if (requestPacket.sFuncName == null) {
            requestPacket.sFuncName = "";
        }
        JceOutputStream jceOutputStream = new JceOutputStream(0);
        jceOutputStream.setServerEncoding(this.f353597a);
        jceOutputStream.write(this.f353599c, 0);
        this.f353598b.sBuffer = JceUtil.getJceBufArray(jceOutputStream.getByteBuffer());
        JceOutputStream jceOutputStream2 = new JceOutputStream(0);
        jceOutputStream2.setServerEncoding(this.f353597a);
        this.f353598b.writeTo(jceOutputStream2);
        byte[] jceBufArray = JceUtil.getJceBufArray(jceOutputStream2.getByteBuffer());
        int length = jceBufArray.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(jceBufArray).flip();
        return allocate.array();
    }

    /* renamed from: b */
    public <T> void mo183101b(String str, T t) {
        if (str.startsWith(".") || t == null || (t instanceof Set)) {
            throw new IllegalArgumentException("wup put err");
        }
        JceOutputStream jceOutputStream = new JceOutputStream();
        jceOutputStream.setServerEncoding(this.f353597a);
        jceOutputStream.write((Object) t, 0);
        this.f353599c.put(str, JceUtil.getJceBufArray(jceOutputStream.getByteBuffer()));
    }
}
