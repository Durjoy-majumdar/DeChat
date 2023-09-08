package ip0;

import com.tencent.p014mm.plugin.appbrand.media.record.C83631l;
import com.tencent.p014mm.sdk.platformtools.Log;
import ip0.C87783c;

/* renamed from: ip0.b */
public class C87782b implements C87783c {

    /* renamed from: a */
    public C87783c.C87784a f254145a = null;

    /* renamed from: b */
    public int f254146b = 0;

    /* renamed from: c */
    public int f254147c = 0;

    /* renamed from: d */
    public byte[] f254148d;

    /* renamed from: e */
    public int f254149e = 0;

    /* renamed from: b */
    public void mo122233b(byte[] bArr, int i, boolean z) {
        if (this.f254145a == null) {
            Log.m105920e("MicroMsg.Record.AudioEncoder", "mEncodeListener is null, return");
            return;
        }
        int i2 = this.f254147c;
        if (((double) i2) == 0.0d) {
            Log.m105920e("MicroMsg.Record.AudioEncoder", "no frameSize, return");
            return;
        }
        if (i > i2) {
            Log.m105929w("MicroMsg.Record.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", Integer.valueOf(i), Integer.valueOf(this.f254147c));
        }
        Log.m105919d("MicroMsg.Record.AudioEncoder", "bufferedSize:%d, buffSize:%d", Integer.valueOf(this.f254149e), Integer.valueOf(i));
        int i3 = this.f254149e;
        int i4 = i3 + i;
        if (i4 >= this.f254147c && bArr != null) {
            Log.m105919d("MicroMsg.Record.AudioEncoder", "flush all, currentBufferedSize:%d", Integer.valueOf(i4));
            if (i4 > this.f254148d.length) {
                Log.m105925i("MicroMsg.Record.AudioEncoder", "expand the end codeBuffer:%d", Integer.valueOf(i4));
                byte[] bArr2 = this.f254148d;
                byte[] bArr3 = new byte[i4];
                this.f254148d = bArr3;
                System.arraycopy(bArr2, 0, bArr3, 0, this.f254149e);
            }
            System.arraycopy(bArr, 0, this.f254148d, this.f254149e, i);
            ((C83631l.C83637f) this.f254145a).mo115956a(this.f254148d, i4, false);
            this.f254149e = 0;
        } else if (bArr != null) {
            System.arraycopy(bArr, 0, this.f254148d, i3, i);
            this.f254149e = i4;
            Log.m105919d("MicroMsg.Record.AudioEncoder", "append buff, currentBufferedSize:%d", Integer.valueOf(i4));
        }
        if (z) {
            Log.m105925i("MicroMsg.Record.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", Integer.valueOf(this.f254149e));
            ((C83631l.C83637f) this.f254145a).mo115956a(this.f254148d, this.f254149e, z);
            this.f254149e = 0;
        }
    }
}
