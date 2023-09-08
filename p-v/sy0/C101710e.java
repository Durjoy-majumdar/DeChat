package sy0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98432t;
import ob0.C11385n;
import ob0.C47350c;
import p1081gi.C98121d;
import p682rz.C101483l;
import p682rz.C101491u;
import pe3.C47465a;
import te3.C101812ml;
import te3.C50143kl;
import te3.C50844pl;
import te3.wn4;
import te3.xn4;

/* renamed from: sy0.e */
public final class C101710e extends C48502a {

    /* renamed from: h */
    public final C101483l f297771h;

    static {
        boolean z = BuildInfo.DEBUG;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C101710e(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, p682rz.C101483l r10) {
        /*
            r5 = this;
            java.lang.String r0 = "session_id"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "from_username"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "to_username"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "fakeScene"
            gy3.C87412m.m108594g(r10, r0)
            te3.kl r0 = new te3.kl
            r0.<init>()
            te3.ml r1 = new te3.ml
            r1.<init>()
            r0.f136871p = r1
            r0.f136868j = r7
            r0.f136863e = r8
            r0.f136864f = r9
            r8 = 43
            r0.f136862d = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = eb0.C75592q0.m90789s()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r9)
            r8.append(r9)
            r8.append(r7)
            r7 = r10
            hd0.t r7 = (hd0.C98432t) r7
            java.lang.String r7 = r7.f288668f
            r8.append(r7)
            r7 = 95
            r8.append(r7)
            long r1 = eb0.C31543z5.m39453c()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r7
            long r1 = r1 / r3
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r0.f136865g = r7
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r5.<init>(r6, r0)
            r5.f297771h = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sy0.C101710e.<init>(int, java.lang.String, java.lang.String, java.lang.String, rz.l):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(((C98432t) this.f297771h).f288668f);
        if (Zd == null) {
            Log.m105921e("Byp.CgiBypSendVideo", "null == info %s", ((C98432t) this.f297771h).f288668f);
            ((C98432t) this.f297771h).f288674o.mo127120a(3, -1);
            return -1;
        }
        wn4 j1 = ((C98432t) this.f297771h).mo137759j1(Zd, nVar);
        C50143kl klVar = this.f129712d;
        klVar.f136866h = j1.f299784t;
        C101812ml mlVar = klVar.f136871p;
        mlVar.f298820d = j1.f299786v;
        mlVar.f298821e = j1.f299785u;
        mlVar.f298822f = 43;
        mlVar.f298823g = j1.f299776j;
        mlVar.f298824h = j1.f299779p;
        mlVar.f298825i = j1.f299743B;
        mlVar.f298826j = j1.f299788x;
        mlVar.f298827n = j1.f299790y;
        mlVar.f298828o = j1.f299742A;
        mlVar.f298829p = j1.f299792z;
        mlVar.f298830q = j1.f299746E;
        mlVar.f298832s = j1.f299757Q;
        C98121d dVar = ((C98432t) this.f297771h).f288672j;
        mlVar.f298831r = String.valueOf(dVar != null ? Integer.valueOf(dVar.field_videoFormat) : null);
        Log.m105924i("Byp.CgiBypSendVideo", "[doScene] " + mlVar.f298828o + XVFSFile.PATH_SEPARATOR_CHAR + mlVar.f298829p + ", " + ((C98432t) this.f297771h).f288668f);
        return dispatch(gVar, this.f129713e, this);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        xn4 xn4 = new xn4();
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
        C50844pl plVar = (C50844pl) aVar;
        xn4.f144765h = plVar.f139817d;
        Log.m105924i("Byp.CgiBypSendVideo", "[onCgiBack] errType=" + i2 + " errCode=" + i3 + " errMsg=" + str + " newmsgid=" + plVar.f139817d);
        ((C98432t) this.f297771h).mo137761l1(i, i2, i3, str, xn4, this);
    }
}
