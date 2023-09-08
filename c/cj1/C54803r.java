package cj1;

import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64481k21;

/* renamed from: cj1.r */
public final class C54803r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64481k21 f153629d;

    /* renamed from: e */
    public final /* synthetic */ C54769i f153630e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54803r(C64481k21 k212, C54769i iVar) {
        super(0);
        this.f153629d = k212;
        this.f153630e = iVar;
    }

    public Object invoke() {
        Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "updateLayerShowView: verify_mode:" + this.f153629d.f183860d + ", verification_id:" + this.f153629d.f183862f + ", remaining_seconds:" + this.f153629d.f183863g);
        C64481k21 k212 = this.f153629d;
        int i = k212.f183860d;
        if (i == 1 || i == 2) {
            C54769i iVar = this.f153630e;
            C56032b bVar = iVar.f153504b;
            if (bVar != null) {
                String str = k212.f183866j;
                C56032b.showVerificationLayerInfo$default(bVar, str == null ? "" : str, k212.f183861e, k212.f183865i, true, false, iVar.f153514l, 16, (Object) null);
            }
            C54769i.m61631a(this.f153630e, this.f153629d.f183863g);
            this.f153630e.f153512j = this.f153629d.f183870q;
        } else if (i == 3) {
            C54769i iVar2 = this.f153630e;
            C56032b bVar2 = iVar2.f153504b;
            if (bVar2 != null) {
                String str2 = k212.f183866j;
                C56032b.showVerificationLayerInfo$default(bVar2, str2 == null ? "" : str2, k212.f183861e, k212.f183865i, true, false, iVar2.f153514l, 16, (Object) null);
            }
            C54769i.m61631a(this.f153630e, this.f153629d.f183863g);
            this.f153630e.f153512j = this.f153629d.f183870q;
        } else if (i == 4) {
            C54769i iVar3 = this.f153630e;
            C56032b bVar3 = iVar3.f153504b;
            if (bVar3 != null) {
                String str3 = k212.f183866j;
                bVar3.showVerificationLayerInfo(str3 == null ? "" : str3, k212.f183861e, k212.f183865i, true, false, iVar3.f153514l);
            }
        } else if (i == 5) {
            C54769i iVar4 = this.f153630e;
            C56032b bVar4 = iVar4.f153504b;
            if (bVar4 != null) {
                String str4 = k212.f183866j;
                C56032b.showVerificationLayerInfo$default(bVar4, str4 == null ? "" : str4, k212.f183861e, (String) null, true, false, iVar4.f153514l, 20, (Object) null);
            }
            C54769i iVar5 = this.f153630e;
            C64481k21 k213 = this.f153629d;
            iVar5.f153509g = k213.f183868o;
            iVar5.f153510h = k213.f183872s;
            iVar5.f153511i = k213.f183865i;
            iVar5.f153512j = k213.f183870q;
            iVar5.f153513k = k213.f183869p;
            C54769i.m61631a(iVar5, k213.f183871r);
        }
        return C13598b0.f38549a;
    }
}
