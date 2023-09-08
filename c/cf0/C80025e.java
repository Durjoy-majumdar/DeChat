package cf0;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* renamed from: cf0.e */
public class C80025e implements Closeable {

    /* renamed from: d */
    public final C80022b f234450d;

    /* renamed from: e */
    public C80021a f234451e;

    /* renamed from: f */
    public byte[] f234452f;

    /* renamed from: cf0.e$a */
    public enum C80026a {
        COPY,
        UNCOMPRESS_NOWRAP,
        UNCOPY
    }

    public C80025e(OutputStream outputStream, int i) {
        new ArrayList();
        this.f234451e = new C80021a(outputStream);
        C80022b bVar = new C80022b();
        this.f234450d = bVar;
        bVar.f234446c = true;
        this.f234452f = new byte[i];
    }

    /* renamed from: a */
    public long mo110267a(InputStream inputStream, C80026a aVar) {
        Inflater inflater;
        long j = this.f234451e.f234443d;
        if (aVar == C80026a.COPY) {
            while (true) {
                int read = inputStream.read(this.f234452f);
                if (read < 0) {
                    break;
                }
                this.f234451e.write(this.f234452f, 0, read);
            }
        } else if (aVar != C80026a.UNCOPY) {
            C80022b bVar = this.f234450d;
            boolean z = aVar == C80026a.UNCOMPRESS_NOWRAP;
            if (z != bVar.f234444a) {
                Inflater inflater2 = bVar.f234445b;
                if (inflater2 != null) {
                    inflater2.end();
                    bVar.f234445b = null;
                }
                bVar.f234444a = z;
            }
            C80022b bVar2 = this.f234450d;
            C80021a aVar2 = this.f234451e;
            bVar2.getClass();
            Inflater inflater3 = bVar2.f234445b;
            if (inflater3 == null) {
                inflater3 = new Inflater(bVar2.f234444a);
                if (bVar2.f234446c) {
                    bVar2.f234445b = inflater3;
                }
            } else {
                inflater3.reset();
            }
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream, inflater3, 32768);
            byte[] bArr = new byte[32768];
            while (true) {
                int read2 = inflaterInputStream.read(bArr);
                if (read2 < 0) {
                    break;
                }
                aVar2.write(bArr, 0, read2);
            }
            if (!bVar2.f234446c && (inflater = bVar2.f234445b) != null) {
                inflater.end();
                bVar2.f234445b = null;
            }
        }
        this.f234451e.flush();
        return this.f234451e.f234443d - j;
    }

    public void close() {
        C80022b bVar = this.f234450d;
        Inflater inflater = bVar.f234445b;
        if (inflater != null) {
            inflater.end();
            bVar.f234445b = null;
        }
        this.f234451e.close();
        this.f234452f = null;
        this.f234451e = null;
    }
}
