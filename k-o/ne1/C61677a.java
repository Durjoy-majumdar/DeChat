package ne1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import sx3.C36907w;
import te3.C49282eg1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50401mh0;
import te3.C64313dg1;

/* renamed from: ne1.a */
public final class C61677a extends C60625c<C49282eg1> {

    /* renamed from: s */
    public final List<C50401mh0> f175371s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61677a(String str, List list, boolean z, int i, String str2, int i2, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        boolean z2 = false;
        z = (i2 & 4) != 0 ? false : z;
        i = (i2 & 8) != 0 ? 0 : i;
        str2 = (i2 & 16) != 0 ? null : str2;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "cmdList");
        this.f175371s = list;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderoplog";
        bVar.f127069d = 3870;
        C64313dg1 dg12 = new C64313dg1();
        dg12.f182703d = str;
        dg12.f182704e.addAll(list);
        C49842ig0 a = C46523h2.f125330a.mo71859a(3870);
        dg12.f182705f = a;
        a.f135313e = z ? 1 : 0;
        if (i != 0) {
            dg12.f182707h = i;
        }
        if (!((str2 == null || str2.length() == 0) ? true : z2)) {
            dg12.f182708i = str2;
        }
        bVar.f127066a = dg12;
        bVar.f127067b = new C49282eg1();
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("[init] username:");
        sb.append(str);
        sb.append(", opScene:");
        sb.append(i);
        sb.append(", opUsername");
        sb.append(str2);
        sb.append(", isMegaVideo:");
        sb.append(z);
        sb.append(", cmdList:");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C50401mh0 mh02 = (C50401mh0) it.next();
            arrayList.add("cmdId:" + mh02.f138028d + "#finderUsername:" + mh02.f138030f);
        }
        sb.append(arrayList);
        Log.m105924i("CgiFinderOpLog", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49282eg1) eu32, "resp");
        Log.m105924i("CgiFinderOpLog", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + '}');
    }
}
