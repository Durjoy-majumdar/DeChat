package fl1;

import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58107a;
import d50.C58110d;
import d50.C58113g;
import d50.C58114h;
import dh1.C58264a;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import nk1.C61791o;
import o40.C61926c;
import qj1.C62643b4;
import te3.C49098d51;
import te3.C51887ww2;
import te3.C64890zp2;
import vk1.C65760a;
import wx3.C15601d;
import wx3.C66212f;
import xk1.C15761n2;
import xk1.C66297d2;
import zc1.C66785b;

/* renamed from: fl1.y2 */
public final class C59244y2 extends C58264a {

    /* renamed from: i */
    public final String f169398i = "FinderLiveAnchorPrepareUIC";

    /* renamed from: j */
    public C62643b4 f169399j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59244y2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: m */
    public void mo83044m(C65760a aVar) {
        C65760a aVar2 = aVar;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(aVar2, "baseRouter");
        super.mo83044m(aVar);
        if (((C55001u) mo83051g(cls)).f154421r == null) {
            C58113g gVar = r4;
            C58113g gVar2 = new C58113g((String) null, 0, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131071, (C8480h) null);
            ((C55001u) mo83051g(cls)).mo76043n3(new C58114h(new TRTCCloudDef.TRTCParams(), gVar, new C58110d("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")));
        }
        if (!((C54991o) mo83051g(cls2)).mo75999e4()) {
            ((C54991o) mo83051g(cls2)).f154259T2 = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
            C54991o oVar = (C54991o) mo83051g(cls2);
            C58969q qVar = ((C54991o) mo83051g(cls2)).f154259T2;
            long j = 0;
            oVar.f154354q = (int) (qVar != null ? qVar.field_liveAnchorStatusFlag : 0);
            C61791o.f175673a.mo86722d("onBindData", ((C54991o) mo83051g(cls2)).f154354q);
            ((C54991o) mo83051g(cls2)).mo76020r4(C61926c.m72696u(((C54991o) mo83051g(cls2)).f154354q, 256) ? 1 : 0);
            C54963d0 d0Var = (C54963d0) mo83051g(C54963d0.class);
            C51887ww2 ww22 = new C51887ww2();
            C58969q qVar2 = ((C54991o) mo83051g(cls2)).f154259T2;
            ww22.f144323d = qVar2 != null ? qVar2.field_liveMicSetting : 0;
            C58969q qVar3 = ((C54991o) mo83051g(cls2)).f154259T2;
            if (qVar3 != null) {
                j = qVar3.field_liveMicSettingSwitch;
            }
            ww22.f144324e = j;
            d0Var.f154048B = ww22;
        }
        String O5 = C66785b.f191882e.mo90662O5();
        C87412m.m108594g(O5, "<set-?>");
        ((C54991o) mo83051g(cls2)).f154345o = O5;
        Long l = null;
        boolean z = false;
        C56032b.fillBlurBg$default(aVar2, ((C54991o) mo83051g(cls2)).f154345o, false, 2, (Object) null);
        C65760a aVar3 = this.f166837f;
        if (aVar3 != null) {
            View findViewById = aVar3.findViewById(C0966R.C0970id.dvx);
            C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_post_layout)");
            C62643b4 b4Var = new C62643b4((ViewGroup) findViewById, aVar3);
            this.f169399j = b4Var;
            b4Var.mo10792g(8);
            C62643b4 b4Var2 = this.f169399j;
            if (b4Var2 != null) {
                C45795b bVar = this.f166851d;
                C87412m.m108594g(bVar, "data");
                C66297d2 d2Var = b4Var2.f177900q;
                C49098d51 d512 = ((C54991o) bVar.mo71262a(cls2)).f154340m3;
                d2Var.getClass();
                C54991o oVar2 = (C54991o) FinderLiveService.f159376d.mo77630e(cls2);
                if (!(oVar2 != null && oVar2.mo75999e4()) && d512 != null) {
                    String str = d512.f132122h;
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (z || (d512.f132124j & 1) != 1) {
                        C45795b bVar2 = d2Var.f190866y;
                        C54991o oVar3 = bVar2 != null ? (C54991o) bVar2.mo71262a(cls2) : null;
                        if (oVar3 != null) {
                            oVar3.f154340m3 = null;
                        }
                    } else {
                        C53895h.m60466d(d2Var.getMainScope(), (C66212f) null, (C53934p0) null, new C15761n2(d2Var, d512, d512, (C15601d<? super C15761n2>) null), 3, (Object) null);
                    }
                }
            }
        }
        String str2 = this.f169398i;
        StringBuilder sb = new StringBuilder();
        sb.append("bindData liveData.business(LiveCommonSlice::class.java).isLiveStarted():");
        sb.append(((C54991o) mo83051g(cls2)).mo75999e4());
        sb.append(" liveMicSetting:");
        C58969q qVar4 = ((C54991o) mo83051g(cls2)).f154259T2;
        sb.append(qVar4 != null ? Long.valueOf(qVar4.field_liveMicSetting) : null);
        sb.append(" liveMicSettingSwitch:");
        C58969q qVar5 = ((C54991o) mo83051g(cls2)).f154259T2;
        if (qVar5 != null) {
            l = Long.valueOf(qVar5.field_liveMicSettingSwitch);
        }
        sb.append(l);
        Log.m105924i(str2, sb.toString());
    }
}
