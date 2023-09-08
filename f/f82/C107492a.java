package f82;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2conference;
import em0.C86537c;
import f82.C107494c;
import gy3.C8480h;
import gy3.C87412m;
import q82.C110374a;

/* renamed from: f82.a */
public final class C107492a implements C107494c {

    /* renamed from: a */
    public final C110374a f321605a;

    /* renamed from: b */
    public int f321606b = 1;

    /* renamed from: c */
    public int f321607c = 1;

    public C107492a(C110374a aVar) {
        C87412m.m108594g(aVar, "bufferManager");
        this.f321605a = aVar;
    }

    /* renamed from: a */
    public C107494c.C107495a mo157919a() {
        C110374a.C110375a b = this.f321605a.mo161885b(this.f321606b);
        byte[] a = b.mo161889a();
        if (a == null) {
            Log.m105928w("MicroMsg.MTR.ILinkMediaEngineImpl", "frame timeout");
            return null;
        }
        C105724z zVar = C105724z.INSTANCE;
        zVar.getClass();
        int GetDecodeVideoData = C105714w.f314302c.GetDecodeVideoData(a, 0);
        v2conference v2conference = C105714w.f314302c;
        int i = v2conference.field_remoteImgLength;
        int i2 = v2conference.field_remoteImgHeight;
        int i3 = v2conference.field_remoteImgWidth;
        int i4 = v2conference.field_remoteImgMember;
        if (GetDecodeVideoData == -100) {
            b.mo161890b();
            this.f321605a.mo161884a(this.f321606b);
            this.f321606b = ((i3 * i2) * 3) / 2;
            Log.m105924i("MicroMsg.MTR.ILinkMediaEngineImpl", "curMaxBufSize adjust to " + this.f321606b);
            return null;
        } else if (GetDecodeVideoData <= 0 || i <= 0 || i2 <= 0 || i3 <= 0 || i4 < 0) {
            b.mo161890b();
            return null;
        } else {
            String c = zVar.f314388f.mo150551c(i4);
            if (c == null) {
                c = "";
            }
            return new C107494c.C107495a(c, b, i3, i2, false, 0, 32, (C8480h) null);
        }
    }

    /* renamed from: b */
    public void mo157920b(byte[] bArr, int i, int i2, int i3) {
        C87412m.m108594g(bArr, "buffer");
        C105724z.INSTANCE.mo150609s(bArr, i, i2, C86537c.CTRL_INDEX);
    }

    /* renamed from: c */
    public C107494c.C107495a mo157921c(int i) {
        C110374a.C110375a b = this.f321605a.mo161885b(this.f321607c);
        byte[] a = b.mo161889a();
        if (a == null) {
            Log.m105928w("MicroMsg.MTR.ILinkMediaEngineImpl", "frame timeout");
            return null;
        }
        C105724z zVar = C105724z.INSTANCE;
        zVar.getClass();
        int GetDecodeVideoData = C105714w.f314302c.GetDecodeVideoData(a, 128);
        v2conference v2conference = C105714w.f314302c;
        int i2 = v2conference.field_remoteScreenImgLength;
        int i3 = v2conference.field_remoteScreenImgHeight;
        int i4 = v2conference.field_remoteScreenImgWidth;
        int i5 = v2conference.field_remoteScreenImgMember;
        if (GetDecodeVideoData == -100) {
            b.mo161890b();
            this.f321605a.mo161884a(this.f321607c);
            this.f321607c = ((i4 * i3) * 3) / 2;
            Log.m105924i("MicroMsg.MTR.ILinkMediaEngineImpl", "curMaxScreenBufSize adjust to " + this.f321607c);
            return null;
        } else if (GetDecodeVideoData <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 < 0) {
            b.mo161890b();
            return null;
        } else {
            String c = zVar.f314388f.mo150551c(i5);
            if (c == null) {
                c = "";
            }
            return new C107494c.C107495a(c, b, i4, i3, true, 0, 32, (C8480h) null);
        }
    }
}
