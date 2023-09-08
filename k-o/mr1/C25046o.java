package mr1;

import cm1.C55015f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import e03.C58469b;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C25026b;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: mr1.o */
public final class C25046o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f71489d;

    /* renamed from: e */
    public final /* synthetic */ String f71490e;

    /* renamed from: f */
    public final /* synthetic */ C58469b f71491f;

    /* renamed from: g */
    public final /* synthetic */ String f71492g;

    /* renamed from: h */
    public final /* synthetic */ C55015f1 f71493h;

    /* renamed from: i */
    public final /* synthetic */ C25026b f71494i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25046o(long j, String str, C58469b bVar, String str2, C55015f1 f1Var, C25026b bVar2) {
        super(0);
        this.f71489d = j;
        this.f71490e = str;
        this.f71491f = bVar;
        this.f71492g = str2;
        this.f71493h = f1Var;
        this.f71494i = bVar2;
    }

    public Object invoke() {
        String str;
        C25026b.C25027a aVar;
        String str2;
        C13598b0 b0Var;
        C25026b.C25027a.C25028a aVar2 = C25026b.C25027a.f71367U;
        C25026b.C25027a a = aVar2.mo52136a(this.f71489d, this.f71490e, this.f71491f);
        a.f71371D = true;
        String str3 = this.f71492g;
        C87412m.m108594g(str3, "<set-?>");
        a.f71384Q = str3;
        if (this.f71491f.f167445a == 4) {
            a.f71379L = true;
        }
        aVar2.mo52138c(a, this.f71493h);
        C25026b.C25027a aVar3 = this.f71494i.f71361b.get(this.f71490e);
        if (aVar3 != null) {
            C25026b bVar = this.f71494i;
            C58469b bVar2 = this.f71491f;
            String str4 = this.f71492g;
            String str5 = this.f71490e;
            long j = this.f71489d;
            long a2 = C31543z5.m39451a() - aVar3.f71410w;
            aVar = a;
            StringBuilder sb = new StringBuilder();
            sb.append("PRERENDER_startPreRender ");
            str = "PRERENDER_startPreRender ";
            long j2 = (long) bVar2.f167445a;
            C25026b bVar3 = bVar;
            sb.append(bVar3.mo52127d(j2));
            sb.append(' ');
            sb.append(str4);
            sb.append(" duplicated recentRecordDiffMs:");
            sb.append(a2);
            sb.append(" mediaId:");
            sb.append(str5);
            sb.append(" feedId:");
            sb.append(C61926c.m72691p(j));
            sb.append(" startRecordMs:");
            sb.append(aVar3.f71410w);
            sb.append(" size:");
            sb.append(bVar3.f71361b.size());
            sb.append(" list:");
            String sb4 = sb.toString();
            str2 = "FinderNetworkFlowReport";
            Log.m105928w(str2, sb4);
            b0Var = C13598b0.f38549a;
        } else {
            aVar = a;
            str = "PRERENDER_startPreRender ";
            str2 = "FinderNetworkFlowReport";
            b0Var = null;
        }
        if (b0Var == null) {
            C25026b bVar4 = this.f71494i;
            C58469b bVar5 = this.f71491f;
            String str6 = this.f71492g;
            String str7 = this.f71490e;
            long j3 = this.f71489d;
            Log.m105924i(str2, str + bVar4.mo52127d((long) bVar5.f167445a) + ' ' + str6 + " mediaId:" + str7 + " feedId:" + C61926c.m72691p(j3) + " size:" + bVar4.f71361b.size() + " list:");
        }
        this.f71494i.f71361b.put(this.f71490e, aVar);
        return C13598b0.f38549a;
    }
}
