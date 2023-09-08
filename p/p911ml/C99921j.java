package p911ml;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: ml.j */
public class C99921j implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C99922k f292781d;

    public C99921j(C99922k kVar) {
        this.f292781d = kVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        this.f292781d.f292776f = dVar;
        Log.m105925i("MicroMsg.EmojiUploadCDN", "cdn callback: %s, %s", str, Integer.valueOf(i));
        if (i != 0) {
            C99922k kVar = this.f292781d;
            if (C86013q1.m106450k(kVar.f292783h)) {
                C86013q1.m106447h(kVar.f292783h);
            }
            this.f292781d.mo139265a(11, (String) null);
            return 0;
        }
        if (cVar != null) {
            Log.m105925i("MicroMsg.EmojiUploadCDN", "cdn callback progress: %s, %s, %s", Integer.valueOf(cVar.field_status), Long.valueOf(cVar.field_finishedLength), Long.valueOf(cVar.field_toltalLength));
        }
        if (dVar != null) {
            Log.m105925i("MicroMsg.EmojiUploadCDN", "cdn callback result: %s, %s", Integer.valueOf(dVar.field_retCode), dVar.f287615g);
            C99922k kVar2 = this.f292781d;
            if (C86013q1.m106450k(kVar2.f292783h)) {
                C86013q1.m106447h(kVar2.f292783h);
            }
            String str2 = dVar.f287615g;
            if (dVar.field_retCode != 0 || Util.isNullOrNil(str2)) {
                int i2 = dVar.field_retCode;
                if (i2 <= -20000 || i2 >= 0) {
                    this.f292781d.mo139265a(11, (String) null);
                } else if (i2 == -447) {
                    this.f292781d.mo139265a(2, (String) null);
                } else if (i2 == -448) {
                    this.f292781d.mo139265a(8, (String) null);
                } else {
                    this.f292781d.mo139266b();
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.f292781d.f292774d;
                Log.m105925i("MicroMsg.EmojiUploadCDN", "complete cost %d, size %d, rate %d", Long.valueOf(currentTimeMillis), Integer.valueOf(this.f292781d.f292771a.field_size), Long.valueOf(((long) this.f292781d.f292771a.field_size) / currentTimeMillis));
                this.f292781d.mo139265a(0, str2);
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
