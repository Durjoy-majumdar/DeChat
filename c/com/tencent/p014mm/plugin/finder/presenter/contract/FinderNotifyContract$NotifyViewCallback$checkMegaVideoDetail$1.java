package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import je1.C46547x1;
import je1.C60798d2;
import kotlin.Metadata;
import ob0.C89132b;
import p749xh.C66276va;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C48693ac1;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50882pv2;
import te3.C51603uv2;
import te3.C52028xv2;
import up1.C65426w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"Lob0/b$c;", "Lte3/uv2;", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "call", "(Lob0/b$c;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1 */
final class FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160482a;

    /* renamed from: b */
    public final /* synthetic */ C66276va f160483b;

    public FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1(FinderNotifyContract.NotifyViewCallback notifyViewCallback, C66276va vaVar) {
        this.f160482a = notifyViewCallback;
        this.f160483b = vaVar;
    }

    public Object call(Object obj) {
        C52028xv2 xv22;
        C52028xv2 xv23;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            String str = this.f160482a.f160453e;
            Log.m105924i(str, "result == null id " + this.f160483b.field_id + " content " + Util.secPrint(this.f160483b.field_content));
        } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            String str2 = this.f160482a.f160453e;
            StringBuilder sb = new StringBuilder();
            sb.append("get mega video detail success, id = ");
            C60798d2 d2Var = this.f160482a.f160468w;
            C49712hj1 hj12 = null;
            sb.append(d2Var != null ? Long.valueOf(d2Var.f173169s) : null);
            Log.m105924i(str2, sb.toString());
            C48693ac1 ac12 = new C48693ac1();
            T t = cVar.f256796d;
            C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
            ac12.f130427d = ((C51603uv2) t).f143156d;
            T t2 = cVar.f256796d;
            C87412m.m108592e(t2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
            ac12.f130428e = ((C51603uv2) t2).f143157e;
            C58784w3 w3Var = C58784w3.f168295a;
            int i = this.f160482a.f160455g.f160440d;
            w3Var.getClass();
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            int i2 = z ? 7 : 5;
            C50882pv2 pv22 = ac12.f130427d;
            if (!(pv22 == null || (xv22 = pv22.f140025y) == null)) {
                long j = xv22.f144993d;
                FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f160482a;
                C66276va vaVar = this.f160483b;
                C50882pv2 pv23 = ac12.f130427d;
                String str3 = (pv23 == null || (xv23 = pv23.f140025y) == null) ? null : xv23.f144994e;
                int i3 = notifyViewCallback.f160455g.f160440d;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(notifyViewCallback.f160456h);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                C46547x1 x1Var = new C46547x1(j, str3, i2, i3, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, 0, (C49946j51) null, false, 122816, (C8480h) null);
                notifyViewCallback.f160463r = x1Var;
                x1Var.mo9225i().mo123062e(new C56192x87e8e247(notifyViewCallback, vaVar));
            }
        } else {
            FinderNotifyContract.NotifyViewCallback.m64264y(this.f160482a, cVar.f256794b);
        }
        return C13598b0.f38549a;
    }
}
