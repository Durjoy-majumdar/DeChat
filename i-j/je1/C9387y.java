package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import it1.C60625c;
import java.util.LinkedList;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import p185kq.C10383h;
import sx3.C110818d0;
import te3.C49160dl;
import te3.C49303em0;
import te3.C49335eu3;
import te3.C49442fm0;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.y */
public final class C9387y extends C60625c<C49442fm0> {

    /* renamed from: je1.y$a */
    public static final class C9388a extends C87413o implements C32226l<Long, CharSequence> {

        /* renamed from: d */
        public static final C9388a f29322d = new C9388a();

        public C9388a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(((Number) obj).longValue());
            C87412m.m108593f(XQ, "getService(IHellHoundUti…).long2UnsignedString(it)");
            return XQ;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9387y(LinkedList<Long> linkedList) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(linkedList, "idList");
        C49303em0 em02 = new C49303em0();
        em02.f133004d = C46523h2.f125330a.mo71860b(7327, this.f172731j);
        em02.f133005e = linkedList;
        C49442fm0 fm02 = new C49442fm0();
        fm02.setBaseResponse(new C49966ja());
        fm02.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = em02;
        bVar.f127067b = fm02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetbuzzword";
        bVar.f127069d = 7327;
        mo123453j(bVar.mo72403a());
        Log.m105918d("Finder.CgiFinderGetBuzzword", "init objectIdList = " + C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9388a.f29322d, 31, (Object) null) + ' ');
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49442fm0 fm02 = (C49442fm0) eu32;
        C87412m.m108594g(fm02, "resp");
        Log.m105924i("Finder.CgiFinderGetBuzzword", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        StringBuilder sb = new StringBuilder();
        sb.append("onCgiBack respIdList = [");
        LinkedList<C49160dl> linkedList = fm02.f133585d;
        C87412m.m108593f(linkedList, "resp.buzzword_info_list");
        sb.append(C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9389z.f29323d, 31, (Object) null));
        sb.append(']');
        Log.m105918d("Finder.CgiFinderGetBuzzword", sb.toString());
    }
}
