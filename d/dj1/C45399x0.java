package dj1;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import ok1.C62042e;
import pe3.C89349b;
import te3.C49246e81;
import te3.C49335eu3;
import te3.C49392f81;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51922x41;

/* renamed from: dj1.x0 */
public final class C45399x0 extends C58286q<C49392f81> {

    /* renamed from: t */
    public final String f122918t = "Finder.CgiFinderLiveSearchMusicList";

    /* renamed from: u */
    public C45400a f122919u;

    /* renamed from: v */
    public C49246e81 f122920v;

    /* renamed from: dj1.x0$a */
    public interface C45400a {
        /* renamed from: a */
        void mo70902a(int i, int i2, String str, C49392f81 f812);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45399x0(long j, byte[] bArr, String str, long j2, String str2, C89349b bVar, C45400a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(aVar, "callback");
        boolean z = true;
        this.f122919u = aVar;
        C49246e81 e812 = new C49246e81();
        this.f122920v = e812;
        e812.f132778d = C46523h2.f125330a.mo71859a(6291);
        C49246e81 e813 = this.f122920v;
        e813.f132781g = j;
        e813.f132780f = C89349b.m111674a(bArr);
        C49246e81 e814 = this.f122920v;
        e814.f132779e = str;
        e814.f132782h = j2;
        e814.f132783i = str2;
        e814.f132784j = bVar;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = e814;
        C49392f81 f812 = new C49392f81();
        f812.setBaseResponse(new C49966ja());
        f812.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = f812;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivesearchmusiclist";
        bVar2.f127069d = 6291;
        mo123453j(bVar2.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("CgiFinderLiveSearchMusicList init ");
        sb.append(this.f122920v.f132781g);
        sb.append(',');
        sb.append(this.f122920v.f132779e);
        sb.append(",query:");
        sb.append(this.f122920v.f132783i);
        sb.append(",liveCookies is null:");
        sb.append(this.f122920v.f132780f != null ? false : z);
        Log.m105924i("Finder.CgiFinderLiveSearchMusicList", sb.toString());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49392f81 f812 = (C49392f81) eu32;
        C87412m.m108594g(f812, "resp");
        String str2 = this.f122918t;
        StringBuilder sb = new StringBuilder();
        sb.append("[onCgiBack] errType=");
        sb.append(i);
        sb.append(" errCode=");
        sb.append(i2);
        sb.append(" errMsg=");
        sb.append(str);
        sb.append(" resp size:");
        LinkedList<C51922x41> linkedList = f812.f133349d;
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        sb.append(" continueFlag:");
        sb.append(f812.f133351f);
        sb.append(" thread=");
        sb.append(Thread.currentThread());
        Log.m105924i(str2, sb.toString());
        if (C58739j4.f168176a.mo83692U()) {
            LinkedList<C51922x41> linkedList2 = f812.f133349d;
            StringBuilder sb4 = new StringBuilder("搜索内容:" + this.f122920v.f132783i + 10);
            C87412m.m108593f(linkedList2, "list");
            for (C51922x41 x412 : linkedList2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(x412.f144443e);
                sb5.append('(');
                sb5.append(x412.f144444f);
                sb5.append("),url is empty:");
                String str3 = x412.f144449n;
                sb5.append(str3 == null || str3.length() == 0);
                sb5.append(", playable:");
                sb5.append(x412.f144448j);
                sb5.append(10);
                sb4.append(sb5.toString());
            }
            C62042e eVar = C62042e.f176370a;
            String str4 = this.f122918t;
            String sb6 = sb4.toString();
            C87412m.m108593f(sb6, "sb.toString()");
            eVar.mo86998D1(str4, sb6);
        }
        this.f122919u.mo70902a(i, i2, str, f812);
    }
}
