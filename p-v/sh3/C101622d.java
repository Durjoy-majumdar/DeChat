package sh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sticker.loader.StickerLoadInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import ob0.C11385n;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import rh3.C101383g;
import uh3.C52576a;

/* renamed from: sh3.d */
public final class C101622d extends C101630j implements C11385n {

    /* renamed from: h */
    public final String f297475h = "MicroMsg.StickerTask";

    /* renamed from: i */
    public final C98124g f297476i;

    /* renamed from: j */
    public String f297477j;

    /* renamed from: n */
    public String f297478n;

    /* renamed from: o */
    public int f297479o;

    /* renamed from: p */
    public C52576a f297480p;

    /* renamed from: q */
    public final String f297481q;

    /* renamed from: r */
    public String f297482r;

    /* renamed from: sh3.d$a */
    public static final class C101623a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C101622d f297483d;

        public C101623a(C101622d dVar) {
            this.f297483d = dVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            boolean z2;
            String str2 = this.f297483d.f297475h;
            StringBuilder sb = new StringBuilder();
            sb.append("callback: ");
            sb.append(str);
            sb.append(", ");
            sb.append(i);
            sb.append("; progress ");
            Integer num = null;
            sb.append(cVar != null ? Long.valueOf(cVar.field_toltalLength) : null);
            sb.append(", ");
            sb.append(cVar != null ? Long.valueOf(cVar.field_finishedLength) : null);
            sb.append("; result ");
            if (dVar != null) {
                num = Integer.valueOf(dVar.field_retCode);
            }
            sb.append(num);
            Log.m105924i(str2, sb.toString());
            if (i != 0) {
                this.f297483d.mo141083e(false);
            } else if (dVar != null) {
                if (dVar.field_retCode == 0) {
                    C101622d dVar2 = this.f297483d;
                    C86013q1.m106461v(dVar2.f297481q);
                    if (C86013q1.m106436R(dVar2.f297482r, dVar2.f297481q) == 0) {
                        C86013q1.m106447h(dVar2.f297482r);
                        C101383g gVar = new C101383g();
                        String str3 = dVar2.f297481q;
                        C87412m.m108594g(str3, "<set-?>");
                        gVar.f296978c = str3;
                        String str4 = dVar2.f297495f.f284101e;
                        C87412m.m108594g(str4, "<set-?>");
                        gVar.f296976a = str4;
                        gVar.mo140866c(dVar2.f297481q);
                        z2 = true;
                    } else {
                        C86013q1.m106447h(dVar2.f297482r);
                        C86013q1.m106445f(dVar2.f297481q);
                        z2 = false;
                    }
                    if (z2) {
                        this.f297483d.mo141083e(true);
                    }
                }
                this.f297483d.mo141083e(false);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101622d(StickerLoadInfo stickerLoadInfo) {
        super(stickerLoadInfo);
        C87412m.m108594g(stickerLoadInfo, "info");
        this.f297477j = stickerLoadInfo.f284102f;
        this.f297478n = stickerLoadInfo.f284103g;
        this.f297479o = stickerLoadInfo.f284104h;
        this.f297481q = C101624e.f297484a.mo141085b(stickerLoadInfo.f284101e);
        this.f297482r = C101624e.f297487d + stickerLoadInfo.f284101e;
        C98124g gVar = new C98124g();
        this.f297476i = gVar;
        gVar.f287660d = "task_StickerFileIdTask";
        gVar.f287662f = new C101623a(this);
    }

    /* renamed from: a */
    public void mo11852a() {
        boolean z = true;
        if (this.f297495f.f284101e.length() == 0) {
            String str = this.f297475h;
            Log.m105928w(str, "call: lensId is " + this.f297495f.f284101e);
            mo141083e(false);
        } else if (C101383g.f296975l.mo140867a(this.f297481q)) {
            String str2 = this.f297475h;
            Log.m105924i(str2, "call: file exists " + this.f297481q);
            mo141083e(true);
        } else {
            if (!(this.f297477j.length() == 0)) {
                if (this.f297478n.length() != 0) {
                    z = false;
                }
                if (!z) {
                    mo141084f();
                    return;
                }
            }
            this.f297480p = new C52576a();
            C86709a0.m107529k().f251779b.mo123455a(3903, this);
            C86709a0.m107529k().f251779b.mo123460f(this.f297480p);
        }
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f297495f.f284101e;
    }

    /* renamed from: e */
    public void mo141083e(boolean z) {
        String str = this.f297475h;
        Log.m105924i(str, "onResult: " + z);
        super.mo141083e(z);
    }

    /* renamed from: f */
    public final void mo141084f() {
        if (!(this.f297477j.length() == 0)) {
            if (!(this.f297478n.length() == 0)) {
                C98124g gVar = this.f297476i;
                gVar.field_fileType = 5;
                gVar.field_needStorage = true;
                gVar.field_mediaId = "lensInfo_" + this.f297495f.f284101e;
                C98124g gVar2 = this.f297476i;
                gVar2.field_fileId = this.f297477j;
                gVar2.field_aesKey = this.f297478n;
                gVar2.field_totalLen = this.f297479o;
                gVar2.field_fullpath = this.f297482r;
                ((C101213l) C86312j.m106911c(C101213l.class)).xf0(this.f297476i);
                return;
            }
        }
        mo141083e(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r3 = r2.f298866h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r2, int r3, java.lang.String r4, ob0.C117747y r5) {
        /*
            r1 = this;
            uh3.a r4 = r1.f297480p
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 == 0) goto L_0x0061
            f40.g r4 = f40.C86709a0.m107529k()
            ob0.b0 r4 = r4.f251779b
            r5 = 3903(0xf3f, float:5.469E-42)
            r4.mo123470p(r5, r1)
            uh3.a r4 = r1.f297480p
            r5 = 0
            if (r4 == 0) goto L_0x0027
            ob0.c r4 = r4.f146856e
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLensInfoResponse"
            gy3.C87412m.m108592e(r4, r0)
            te3.q22 r4 = (te3.C50906q22) r4
            goto L_0x0028
        L_0x0027:
            r4 = r5
        L_0x0028:
            r0 = 0
            if (r2 != 0) goto L_0x005e
            if (r3 != 0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            te3.mn2 r2 = r4.f140103d
            if (r2 == 0) goto L_0x003a
            te3.on2 r3 = r2.f298866h
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = r3.f184679d
            goto L_0x003b
        L_0x003a:
            r3 = r5
        L_0x003b:
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0040
            r3 = r4
        L_0x0040:
            r1.f297477j = r3
            if (r2 == 0) goto L_0x004a
            te3.on2 r3 = r2.f298866h
            if (r3 == 0) goto L_0x004a
            java.lang.String r5 = r3.f184680e
        L_0x004a:
            if (r5 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = r5
        L_0x004e:
            r1.f297478n = r4
            if (r2 == 0) goto L_0x0058
            te3.on2 r2 = r2.f298866h
            if (r2 == 0) goto L_0x0058
            int r0 = r2.f184681f
        L_0x0058:
            r1.f297479o = r0
            r1.mo141084f()
            goto L_0x0061
        L_0x005e:
            r1.mo141083e(r0)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh3.C101622d.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
