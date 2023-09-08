package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C49144dh0;
import te3.C49284eh0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51446tu;

/* renamed from: je1.e */
public final class C9302e extends C60625c<C49284eh0> {

    /* renamed from: s */
    public final int f29080s;

    /* renamed from: t */
    public final List<Long> f29081t;

    /* renamed from: u */
    public C49144dh0 f29082u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9302e(int i, int i2, List<Long> list, C89349b bVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(list, "feedIdList");
        this.f29080s = i2;
        this.f29081t = list;
        C49144dh0 dh02 = new C49144dh0();
        this.f29082u = dh02;
        dh02.f132316d = bVar;
        LinkedList<Long> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        dh02.f132317e = linkedList;
        this.f29082u.f132323n = i;
        Log.m105924i("CgiCheckPrefetch", "initCommReqResp: checkType=" + i + ", tabType=" + i2 + ", feedIds=" + C110818d0.m150921S(list, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9295b.f29068d, 30, (Object) null) + ", lastBuffer=" + bVar);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f29082u;
        C49284eh0 eh02 = new C49284eh0();
        eh02.setBaseResponse(new C49966ja());
        eh02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = eh02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findercheckprefetch";
        bVar2.f127069d = 6658;
        mo123453j(bVar2.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49284eh0 eh02 = (C49284eh0) eu32;
        C87412m.m108594g(eh02, "resp");
        Log.m105924i("CgiCheckPrefetch", "onCgiEnd: errType " + i + ", errCode " + i2 + ", errMsg " + str + ", tabType = " + this.f29080s + ", requestFeedIds:" + C110818d0.m150921S(this.f29081t, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        LinkedList<C51446tu> linkedList = eh02.f132922d;
        C87412m.m108593f(linkedList, "resp.check_result");
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (((C51446tu) next).f142409e != 0) {
                arrayList.add(next);
            }
        }
        Log.m105924i("CgiCheckPrefetch", "onCgiEnd: spamFeedSize = " + arrayList.size() + ", spamFeedIds = [" + C110818d0.m150921S(arrayList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9298c.f29072d, 30, (Object) null) + ']');
        C61926c.m72666K(100, new C9299d(arrayList, this));
    }
}
