package g73;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: g73.i */
public class C107763i {

    /* renamed from: a */
    public long f322499a = -1;

    /* renamed from: b */
    public long f322500b = 0;

    /* renamed from: a */
    public C107763i mo158190a(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            this.f322499a = dataInputStream.readLong();
            this.f322500b = dataInputStream.readLong();
            dataInputStream.close();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.TimeInfo", e, "", new Object[0]);
        }
        return this;
    }
}
