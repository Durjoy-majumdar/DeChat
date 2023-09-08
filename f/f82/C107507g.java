package f82;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import ds3.C107066f;
import f82.C107494c;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import nw3.C109779e;
import q82.C110374a;

/* renamed from: f82.g */
public final class C107507g implements C107494c {

    /* renamed from: a */
    public final C110374a f321635a;

    /* renamed from: b */
    public int[] f321636b = new int[1];

    /* renamed from: c */
    public int[] f321637c = new int[1];

    /* renamed from: d */
    public int f321638d = 1;

    /* renamed from: e */
    public int f321639e = 1;

    public C107507g(C110374a aVar) {
        C87412m.m108594g(aVar, "bufferManager");
        this.f321635a = aVar;
    }

    /* renamed from: a */
    public C107494c.C107495a mo157919a() {
        C110374a.C110375a b = this.f321635a.mo161885b(this.f321638d);
        byte[] a = b.mo161889a();
        if (a == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(a);
        C107066f f = ((C109779e) C105851w0.xx0().f314798d).mo161035f(this.f321636b);
        if (f.f320479g == -100) {
            b.mo161890b();
            this.f321635a.mo161884a(this.f321638d);
            int i = f.f320475c;
            int i2 = f.f320476d;
            this.f321636b = new int[(i * i2)];
            this.f321638d = ((i * i2) * 3) / 2;
            Log.m105924i("MicroMsg.MTR.OldMultiTalkMediaEngine", "curMaxBufSize adjust to " + this.f321638d);
            f = null;
        }
        if (f == null) {
            return null;
        }
        if (f.f320479g <= 0 || TextUtils.isEmpty(f.f320478f) || f.f320475c <= 0 || f.f320476d <= 0) {
            b.mo161890b();
            return null;
        }
        wrap.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(this.f321636b, 0, wrap.capacity() / 4);
        String str = f.f320478f;
        C87412m.m108593f(str, "decodeRet.usrName");
        return new C107494c.C107495a(str, b, f.f320475c, f.f320476d, false, 0, 32, (C8480h) null);
    }

    /* renamed from: b */
    public void mo157920b(byte[] bArr, int i, int i2, int i3) {
        C87412m.m108594g(bArr, "buffer");
        ((C109779e) C105851w0.xx0().f314798d).mo161037h(bArr, i * i2 * 4, i, i2, i3, C105851w0.zx0().f314465G ? TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION : 257);
    }

    /* renamed from: c */
    public C107494c.C107495a mo157921c(int i) {
        C110374a.C110375a b = this.f321635a.mo161885b(this.f321639e);
        byte[] a = b.mo161889a();
        if (a == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(a);
        C107066f e = ((C109779e) C105851w0.xx0().f314798d).mo161034e((byte[]) null, this.f321637c, i);
        if (e.f320479g == -100) {
            b.mo161890b();
            this.f321635a.mo161884a(this.f321639e);
            int i2 = e.f320475c;
            int i3 = e.f320476d;
            this.f321637c = new int[(i2 * i3)];
            this.f321639e = ((i2 * i3) * 3) / 2;
            Log.m105924i("MicroMsg.MTR.OldMultiTalkMediaEngine", "curMaxScreenBufSize adjust to " + this.f321639e);
            e = null;
        }
        if (e == null) {
            return null;
        }
        if (e.f320479g <= 0 || TextUtils.isEmpty(e.f320478f) || e.f320475c <= 0 || e.f320476d <= 0) {
            b.mo161890b();
            return null;
        }
        wrap.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(this.f321637c, 0, wrap.capacity() / 4);
        String str = e.f320478f;
        C87412m.m108593f(str, "decodeRet.usrName");
        return new C107494c.C107495a(str, b, e.f320475c, e.f320476d, true, e.f320480h);
    }
}
