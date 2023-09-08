package p490dl;

import com.tencent.tavkit.component.TAVExporter;
import ob0.C47350c;
import ob0.C89132b;
import sf0.C48374j0;
import te3.C48963c62;
import te3.C49103d62;
import te3.C51018qv3;

/* renamed from: dl.f */
public final class C45410f extends C89132b<C49103d62> {
    public C45410f(int i, byte[] bArr) {
        C48963c62 c622 = new C48963c62();
        C49103d62 d622 = new C49103d62();
        c622.f131545d = i;
        if (bArr == null) {
            c622.f131546e = new C51018qv3();
        } else {
            c622.f131546e = C48374j0.m53712a(bArr);
        }
        c622.f131547f = 0;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = c622;
        bVar.f127067b = d622;
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmgetpersonaldesigner";
        bVar.f127069d = TAVExporter.VIDEO_EXPORT_WIDTH;
        mo123453j(bVar.mo72403a());
    }
}
