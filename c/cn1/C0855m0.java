package cn1;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import je1.C46553z0;
import nr3.C89059e;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C50756oz0;

/* renamed from: cn1.m0 */
public final class C0855m0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ String f2023a;

    /* renamed from: b */
    public final /* synthetic */ String f2024b;

    /* renamed from: c */
    public final /* synthetic */ Context f2025c;

    /* renamed from: d */
    public final /* synthetic */ C0868r0 f2026d;

    /* renamed from: e */
    public final /* synthetic */ String f2027e;

    public C0855m0(String str, String str2, Context context, C0868r0 r0Var, String str3) {
        this.f2023a = str;
        this.f2024b = str2;
        this.f2025c = context;
        this.f2026d = r0Var;
        this.f2027e = str3;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C49352ez ezVar = ((C50756oz0) cVar.f256796d).f139459d;
            boolean z = ezVar != null ? ezVar.f133188j : false;
            if (!z) {
                Log.m105924i("NoticeOfSpecialColumnConvert", "ticket hasReceived: " + z);
                C89059e i = new C46553z0(this.f2023a, (String) null, (byte[]) null, 0, 0, this.f2024b, 1, false, 158, (C8480h) null).mo9225i();
                i.mo123420E(new C0853l0(this.f2025c, this.f2026d, this.f2027e));
                Context context = this.f2025c;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i.mo11397F((MMActivity) context);
            }
        } else {
            Log.m105924i("NoticeOfSpecialColumnConvert", "Cgi getConcertTicket failed errType: " + cVar.f256793a + ", errMsg: " + cVar.f256795c + ", errCode: " + cVar.f256794b);
        }
        return C13598b0.f38549a;
    }
}
