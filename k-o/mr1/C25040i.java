package mr1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import e03.C58469b;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import mr1.C25026b;
import rx3.C13598b0;

/* renamed from: mr1.i */
public final class C25040i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58469b f71461d;

    /* renamed from: e */
    public final /* synthetic */ C25026b f71462e;

    /* renamed from: f */
    public final /* synthetic */ String f71463f;

    /* renamed from: g */
    public final /* synthetic */ long f71464g;

    /* renamed from: h */
    public final /* synthetic */ C25026b.C25032b f71465h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25040i(C58469b bVar, C25026b bVar2, String str, long j, C25026b.C25032b bVar3) {
        super(0);
        this.f71461d = bVar;
        this.f71462e = bVar2;
        this.f71463f = str;
        this.f71464g = j;
        this.f71465h = bVar3;
    }

    public Object invoke() {
        String str;
        C13598b0 b0Var;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f71461d.f167450f);
        sb.append('.');
        sb.append(this.f71462e.mo52127d((long) this.f71461d.f167445a));
        sb.append('.');
        String str2 = this.f71463f;
        C87412m.m108594g(str2, "mediaId");
        boolean z = false;
        if (TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = str2.substring(0, Math.min(4, str2.length()));
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb.append(str);
        String sb4 = sb.toString();
        C25026b.C25029d dVar = this.f71462e.f71362c.get(this.f71463f);
        if (dVar != null) {
            Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerPrepare " + sb4 + " invalid item " + dVar);
        }
        C25026b.C25027a a = C25026b.C25027a.f71367U.mo52136a(this.f71464g, this.f71463f, this.f71461d);
        C25026b.C25029d dVar2 = new C25026b.C25029d(false, false, false, false, false, new ArrayList());
        dVar2.f71414a = true;
        C25026b.C25032b bVar = this.f71465h;
        if (bVar != null) {
            bVar.mo52144a(new C25039h(sb4, a));
        }
        if (this.f71462e.f71361b.get(this.f71463f) != null) {
            C25026b bVar2 = this.f71462e;
            String str3 = this.f71463f;
            Log.m105924i("FinderNetworkFlowReport", "PLAY_onPlayerPrepare#hitPreRender " + sb4 + ' ' + a);
            dVar2.f71418e = true;
            bVar2.f71362c.put(str3, dVar2);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C25026b bVar3 = this.f71462e;
            C58469b bVar4 = this.f71461d;
            String str4 = this.f71463f;
            a.f71413z = true;
            a.f71405r = C31543z5.m39451a();
            C87412m.m108594g(sb4, "<set-?>");
            a.f71384Q = sb4;
            if (bVar4.f167445a == 2) {
                z = true;
            }
            dVar2.f71417d = z;
            dVar2.f71419f.add(a);
            bVar3.f71362c.put(str4, dVar2);
            Log.m105924i("FinderNetworkFlowReport", "PLAY_onPlayerPrepare#itembegin " + sb4 + ' ' + a);
        }
        return C13598b0.f38549a;
    }
}
