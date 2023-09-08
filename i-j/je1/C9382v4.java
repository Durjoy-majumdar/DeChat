package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51982xj1;

/* renamed from: je1.v4 */
public final class C9382v4 extends C60628i {

    /* renamed from: g */
    public final String f29305g;

    /* renamed from: h */
    public C47350c f29306h;

    /* renamed from: i */
    public C11385n f29307i;

    /* renamed from: j */
    public C51982xj1 f29308j;

    /* renamed from: n */
    public boolean f29309n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9382v4(int r4, pe3.C89349b r5, te3.C49712hj1 r6, pe3.C89349b r7, pe3.C89349b r8, int r9, int r10, gy3.C8480h r11) {
        /*
            r3 = this;
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L_0x0006
            r6 = r0
        L_0x0006:
            r11 = r10 & 8
            if (r11 == 0) goto L_0x000b
            r7 = r0
        L_0x000b:
            r11 = r10 & 16
            if (r11 == 0) goto L_0x0010
            r8 = r0
        L_0x0010:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x0015
            r9 = 0
        L_0x0015:
            r3.<init>(r6)
            java.lang.String r10 = "Finder.NetSceneGetHotWordList"
            r3.f29305g = r10
            ob0.c$b r11 = new ob0.c$b
            r11.<init>()
            r0 = 4069(0xfe5, float:5.702E-42)
            r11.f127069d = r0
            java.lang.String r1 = "/cgi-bin/micromsg-bin/findersearchgethotwordlist"
            r11.f127068c = r1
            te3.wj1 r1 = new te3.wj1
            r1.<init>()
            je1.h2 r2 = je1.C46523h2.f125330a
            te3.ig0 r6 = r2.mo71860b(r0, r6)
            r1.f144084d = r6
            r1.f144085e = r4
            r1.f144086f = r5
            r1.f144087g = r7
            r1.f144088h = r8
            r1.f144089i = r9
            r11.f127066a = r1
            te3.xj1 r4 = new te3.xj1
            r4.<init>()
            r11.f127067b = r4
            ob0.c r4 = r11.mo72403a()
            r3.f29306h = r4
            java.lang.String r4 = "NetSceneGetHotWordList init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9382v4.<init>(int, pe3.b, te3.hj1, pe3.b, pe3.b, int, int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29307i = nVar;
        return dispatch(gVar, this.f29306h, this);
    }

    public int getType() {
        return 4069;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f29305g, "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29306h.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchGetHotWordListResponse");
            this.f29308j = (C51982xj1) aVar;
        }
        C11385n nVar = this.f29307i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
