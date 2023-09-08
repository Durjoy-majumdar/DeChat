package q53;

import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import m53.C10753a;
import m53.C10756c;
import m53.C10757d;
import m53.C10760f;
import m53.C10761g;
import p217oq.C11717f;
import p53.C11836e;
import p53.C11840h;
import qo3.C12925w;
import te3.C51526uc2;

/* renamed from: q53.j */
public final class C12081j implements C12098n0 {

    /* renamed from: a */
    public final /* synthetic */ C12041a f35165a;

    public C12081j(C12041a aVar) {
        this.f35165a = aVar;
    }

    /* renamed from: a */
    public void mo11921a(long j) {
        C12041a aVar = this.f35165a;
        aVar.f35072l = true;
        C10757d.C10758a aVar2 = aVar.f35073m;
        if (aVar2 != null) {
            aVar2.mo9998a(aVar, Boolean.FALSE);
        }
        C10753a aVar3 = this.f35165a.f35074n;
        if (aVar3 != null) {
            aVar3.mo10987a();
        }
        C12925w wVar = this.f35165a.f35063c;
        if (wVar != null) {
            wVar.mo5085n();
            ((C11717f) C86312j.m106911c(C11717f.class)).mo11557h5();
            C12041a aVar4 = this.f35165a;
            C11840h hVar = aVar4.f35065e;
            FragmentActivity fragmentActivity = aVar4.f35061a;
            hVar.getClass();
            C87412m.m108594g(fragmentActivity, "context");
            Log.m105924i("MicroMsg.RechargeProductsDialogViewModel", "directRecharge, amount: " + j);
            hVar.f34616i.postValue(Boolean.TRUE);
            C11836e eVar = new C11836e(hVar);
            C10761g gVar = new C10761g();
            C51526uc2 value = hVar.f34617j.getValue();
            if (value != null) {
                gVar.f32227f = value.f142743h.f131486e.f132669d;
                gVar.f32226e = value.f142742g;
            }
            gVar.f32229h = j;
            gVar.f32222a = hVar.f34611d.f32222a;
            String str = hVar.f34622r;
            if (str != null) {
                gVar.f32224c = str;
                gVar.f32225d = eVar;
                gVar.f32228g = C10760f.DIRECT_CHARGE;
                ((C10756c) C86709a0.m107533q(C10756c.class)).q10((MMActivity) fragmentActivity, gVar);
                return;
            }
            C87412m.m108603p("mSceneSessionID");
            throw null;
        }
        C87412m.m108603p("mBottomSheet");
        throw null;
    }
}
