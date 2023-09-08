package w60;

import android.system.ErrnoException;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.OutputStream;
import w60.C102355h;
import y60.C102802a;

/* renamed from: w60.d */
public class C102352d extends C102355h<byte[]> {

    /* renamed from: b */
    public C102355h.C102356a f301452b;

    public C102352d(byte[] bArr, String str, C102355h.C102356a<byte[]> aVar) {
        super(bArr);
        this.f301452b = aVar;
    }

    /* renamed from: a */
    public C102802a mo141918a() {
        return this.f301452b.mo141917a(this.f301455a);
    }

    /* renamed from: b */
    public void mo141919b(OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f301455a;
        C87412m.m108594g(bArr, "data");
        C87412m.m108594g(outputStream, "stream");
        try {
            outputStream.write(bArr);
        } catch (ErrnoException e) {
            Log.printErrStackTrace("MicroMsg.Loader.DiskFunction", e, "", new Object[0]);
        }
    }
}
