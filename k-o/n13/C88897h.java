package n13;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p617mz.C88861c;
import pe3.C47465a;
import te3.C90430p93;
import te3.C90432q93;
import te3.C90435r93;
import te3.C90441u93;
import tw0.C90585h;
import x02.C91117e;

/* renamed from: n13.h */
public final class C88897h extends C117747y implements C1311n, C88861c {

    /* renamed from: d */
    public final int f256392d;

    /* renamed from: e */
    public final String f256393e;

    /* renamed from: f */
    public final C47350c f256394f;

    /* renamed from: g */
    public C11385n f256395g;

    /* renamed from: h */
    public C90585h f256396h;

    public C88897h(String str, String str2, LinkedList<C90430p93> linkedList, int i) {
        C87412m.m108594g(str, "baseId");
        C87412m.m108594g(str2, "patchId");
        C87412m.m108594g(linkedList, "targets");
        this.f256392d = i;
        this.f256393e = "MicroMsg.Updater.NetSceneManualCheckWxUpdate";
        C90432q93 q932 = new C90432q93();
        q932.f259754d = str;
        q932.f259755e = str2;
        q932.f259756f = linkedList;
        q932.f259761n = 1;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = q932;
        bVar.f127067b = new C90435r93();
        bVar.f127068c = "/cgi-bin/micromsg-bin/prconfig";
        bVar.f127069d = 3899;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f256394f = bVar.mo72403a();
        Log.m105924i("MicroMsg.Updater.NetSceneManualCheckWxUpdate", "Create NetSceneManualCheckWxUpdate baseId:" + str + " patchId:" + str2);
    }

    /* renamed from: F0 */
    public C90585h mo123254F0() {
        return this.f256396h;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f256395g = nVar;
        return dispatch(gVar, this.f256394f, this);
    }

    public int getType() {
        return 3899;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f256393e;
        Log.m105924i(str2, "errType:" + i2 + ", errCode:" + i3 + ", errMsg:" + str);
        if (i2 == 0 && i3 == 0) {
            C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PRConfigResponse");
            C90441u93 u932 = ((C90435r93) aVar).f259789d;
            if (u932 != null) {
                this.f256396h = new TinkerSyncResponse(u932);
            }
        }
        C90585h hVar = this.f256396h;
        if (hVar != null) {
            C87412m.m108592e(hVar, "null cannot be cast to non-null type com.tencent.mm.plugin.hp.util.TinkerSyncResponse");
            C91117e.m114298c((TinkerSyncResponse) hVar);
        }
        C11385n nVar = this.f256395g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88897h() {
        /*
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = a70.C79471a.f233023k
            if (r1 != 0) goto L_0x0007
            r1 = r0
        L_0x0007:
            java.lang.String r2 = a70.C79471a.m96436a()
            if (r2 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            java.util.LinkedList r2 = y02.C91363f.m114614b()
            r3 = 0
            r4.<init>(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n13.C88897h.<init>():void");
    }
}
