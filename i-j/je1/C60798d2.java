package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C51603uv2;
import te3.C64667qv2;
import te3.C64739tv2;

/* renamed from: je1.d2 */
public final class C60798d2 extends C60625c<C51603uv2> {

    /* renamed from: s */
    public final long f173169s;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60798d2(long j, String str, String str2, int i, C49712hj1 hj12, int i2, C8480h hVar) {
        this(j, str, str2, (i2 & 8) != 0 ? 0 : i, hj12);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51603uv2) eu32, "resp");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60798d2(long j, String str, String str2, int i, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "videoNonceId");
        this.f173169s = j;
        C64739tv2 tv22 = new C64739tv2();
        C64667qv2 qv22 = new C64667qv2();
        qv22.f185082d = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0);
        if (hj12 != null) {
            qv22.f185083e = hj12.f134675i;
        }
        tv22.f185679d = qv22;
        tv22.f185680e = j;
        tv22.f185681f = str;
        tv22.f185682g = str2;
        tv22.f185684i = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/megavideodetail";
        bVar.f127069d = 4195;
        bVar.f127066a = tv22;
        bVar.f127067b = new C51603uv2();
        mo123453j(bVar.mo72403a());
        Log.m105924i("CgiMegaVideoGetDetail", "videoId " + j + " username " + str);
    }
}
