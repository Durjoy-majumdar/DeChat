package zu3;

import java.io.ByteArrayInputStream;
import ru3.C26116a;

/* renamed from: zu3.a */
public class C26714a implements C26116a {

    /* renamed from: a */
    public final /* synthetic */ ByteArrayInputStream f74266a;

    public C26714a(C26718e eVar, ByteArrayInputStream byteArrayInputStream) {
        this.f74266a = byteArrayInputStream;
    }

    public byte readByte() {
        return (byte) (this.f74266a.read() & 255);
    }
}
