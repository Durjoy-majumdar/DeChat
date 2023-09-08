package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51884ww;
import te3.C52030xw;

/* renamed from: dj1.j1 */
public final class C45371j1 extends C58286q<C52030xw> {

    /* renamed from: t */
    public final String f122875t = "Finder.CgiTestClientSpeed";

    /* renamed from: u */
    public C51884ww f122876u;

    public C45371j1(int i, int i2, int i3, int i4, int i5) {
        super((C49712hj1) null, 1, (C8480h) null);
        C51884ww wwVar = new C51884ww();
        this.f122876u = wwVar;
        wwVar.f144316d = i;
        wwVar.f144317e = i2;
        wwVar.f144318f = i3;
        wwVar.f144319g = i4;
        wwVar.f144320h = i5;
        Log.m105924i("Finder.CgiTestClientSpeed", "sceneCode:" + i + " opCode:" + i2 + " uploadSize:" + i3 + " downloadSize:" + i4 + " concurrentNum:" + i5);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122876u;
        C52030xw xwVar = new C52030xw();
        xwVar.setBaseResponse(new C49966ja());
        xwVar.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = xwVar;
        bVar.f127068c = " /cgi-bin/micromsg-bin/clientspeedtest";
        bVar.f127069d = 4138;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52030xw) eu32, "resp");
        String str2 = this.f122875t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
