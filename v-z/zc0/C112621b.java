package zc0;

import com.tencent.p014mm.plugin.imgenc.MMIMAGEENCJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FilterOutputStream;

/* renamed from: zc0.b */
public class C112621b extends FilterOutputStream {

    /* renamed from: d */
    public C112620a f337277d;

    public C112621b(C86009m1 m1Var, long j) {
        super(C86013q1.m106427I(m1Var, false));
        this.f337277d = new C112620a(j);
    }

    public void close() {
        super.close();
        C112620a aVar = this.f337277d;
        if (aVar != null) {
            aVar.getClass();
            Log.m105924i("MicroMsg.EncEngine", "free mNativePtr: " + aVar.f337276c + " hashcode " + aVar.hashCode());
            MMIMAGEENCJNI.free(aVar.f337276c);
            aVar.f337276c = 0;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        C112620a aVar = this.f337277d;
        if (aVar.f337276c == 0) {
            Log.m105924i("MicroMsg.EncEngine", "transFor " + Util.getStack().toString());
        }
        long j = (long) i2;
        MMIMAGEENCJNI.transFor(aVar.f337276c, bArr, aVar.f337274a, j);
        aVar.f337274a += j;
        super.write(bArr, i, i2);
    }
}
