package ft3;

import com.p013qq.taf.RequestPacket;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceUtil;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

/* renamed from: ft3.j */
public class C116898j {

    /* renamed from: a */
    public String f350317a = "UTF-8";

    /* renamed from: b */
    public RequestPacket f350318b = new RequestPacket();

    /* renamed from: c */
    public HashMap<String, byte[]> f350319c = new HashMap<>();

    public C116898j(boolean z) {
        new HashMap();
        this.f350318b.iVersion = 3;
    }

    /* renamed from: a */
    public byte[] mo180861a() {
        RequestPacket requestPacket = this.f350318b;
        if (requestPacket.sServantName == null) {
            requestPacket.sServantName = "";
        }
        if (requestPacket.sFuncName == null) {
            requestPacket.sFuncName = "";
        }
        JceOutputStream jceOutputStream = new JceOutputStream(0);
        jceOutputStream.setServerEncoding(this.f350317a);
        jceOutputStream.write(this.f350319c, 0);
        this.f350318b.sBuffer = JceUtil.getJceBufArray(jceOutputStream.getByteBuffer());
        JceOutputStream jceOutputStream2 = new JceOutputStream(0);
        jceOutputStream2.setServerEncoding(this.f350317a);
        this.f350318b.writeTo(jceOutputStream2);
        byte[] jceBufArray = JceUtil.getJceBufArray(jceOutputStream2.getByteBuffer());
        int length = jceBufArray.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(jceBufArray).flip();
        return allocate.array();
    }

    /* renamed from: b */
    public <T> void mo180862b(String str, T t) {
        if (str == null || str.startsWith(".") || t == null || (t instanceof Set)) {
            throw new IllegalArgumentException("wup put err");
        }
        JceOutputStream jceOutputStream = new JceOutputStream();
        jceOutputStream.setServerEncoding(this.f350317a);
        jceOutputStream.write((Object) t, 0);
        this.f350319c.put(str, JceUtil.getJceBufArray(jceOutputStream.getByteBuffer()));
    }
}
