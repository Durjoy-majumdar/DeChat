package g13;

import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import te3.ni4;
import te3.oi4;

/* renamed from: g13.a */
public final class C45874a extends C89132b<oi4> {
    public C45874a(ni4 ni4) {
        C87412m.m108594g(ni4, "req");
        oi4 oi4 = new oi4();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ni4;
        bVar.f127067b = oi4;
        bVar.f127068c = "/cgi-bin/micromsg-bin/transtexttospeech";
        bVar.f127069d = TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127074i = 5000;
        mo123453j(bVar.mo72403a());
    }
}
