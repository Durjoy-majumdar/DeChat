package ol1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ml1.C10930c;
import rx3.C13598b0;
import te3.C48648a11;
import te3.C50767p11;
import te3.C51280sp2;

/* renamed from: ol1.i */
public final class C11489i extends C87413o implements C32226l<C51280sp2, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11486h f33764d;

    /* renamed from: e */
    public final /* synthetic */ C48648a11 f33765e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11489i(C11486h hVar, C48648a11 a112) {
        super(1);
        this.f33764d = hVar;
        this.f33765e = a112;
    }

    public Object invoke(Object obj) {
        String str;
        C51280sp2 sp22 = (C51280sp2) obj;
        C87412m.m108594g(sp22, LocaleUtil.ITALIAN);
        StringBuilder sb = new StringBuilder();
        sb.append("send gift: ");
        C50767p11 p112 = sp22.f141663d;
        String str2 = null;
        sb.append(p112 != null ? p112.f139507d : null);
        sb.append(" name: ");
        C50767p11 p113 = sp22.f141663d;
        if (p113 != null) {
            str2 = p113.f139515o;
        }
        sb.append(str2);
        Log.m105924i("WishAudiencePanelWidget", sb.toString());
        C10930c cVar = this.f33764d.f33757j;
        C50767p11 p114 = sp22.f141663d;
        String str3 = "";
        if (p114 == null || (str = p114.f139507d) == null) {
            str = str3;
        }
        String str4 = this.f33765e.f130208i;
        if (str4 != null) {
            str3 = str4;
        }
        cVar.mo11129a(str, str3);
        this.f33764d.mo9763a();
        return C13598b0.f38549a;
    }
}
