package ap1;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54979h1;
import cl1.C54991o;
import cm1.C0740i2;
import cm1.C55035v0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import d60.C58124b;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import p629ny.C76979h;
import qj1.C62850ke;
import rx3.C13598b0;
import sk1.C13696v;
import sk1.C63956k;
import sk1.C63965x;
import vo1.C65795g0;

/* renamed from: ap1.c */
public final class C54282c extends C65795g0 {

    /* renamed from: g */
    public final String f152363g = "FinderLiveShoppingReplayDecorateUIC";

    /* renamed from: h */
    public C62850ke f152364h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54282c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: i */
    public void mo75082i(boolean z, boolean z2) {
        Class cls = C54979h1.class;
        Class cls2 = C54991o.class;
        ((C54991o) mo83051g(cls2)).f154295b1 = 2;
        C58961d.C58963b bVar = C58961d.f168673a;
        FinderObject finderObject = ((C54991o) mo83051g(cls2)).f154341n;
        C58969q b = bVar.mo84155b(finderObject != null ? finderObject.username : null);
        C56032b bVar2 = this.f189238f;
        TextView textView = bVar2 != null ? (TextView) bVar2.findViewById(C0966R.C0970id.hfq) : null;
        if (!(b == null || textView == null)) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f189237e, b.mo84196w1(), textView.getTextSize()));
        }
        C0740i2 i2Var = ((C54979h1) mo83051g(cls)).f154147v;
        if (i2Var instanceof C63965x ? true : i2Var instanceof C13696v) {
            C62850ke keVar = this.f152364h;
            if (keVar != null) {
                keVar.mo10792g(0);
            }
            C0740i2 i2Var2 = ((C54979h1) mo83051g(cls)).f154147v;
            if (i2Var2 != null) {
                C62850ke keVar2 = this.f152364h;
                if (keVar2 != null) {
                    C55035v0 v0Var = new C55035v0();
                    v0Var.f154512b = false;
                    v0Var.f154511a = false;
                    keVar2.mo87808c1().setShoppingUIConfig(v0Var);
                }
                C62850ke keVar3 = this.f152364h;
                if (keVar3 != null) {
                    keVar3.mo12175C(i2Var2);
                }
            }
        } else if (i2Var instanceof C13696v) {
            C56032b bVar3 = this.f189238f;
            if (bVar3 != null) {
                C58124b.C7172a.m7372a(bVar3, C58124b.C58125b.FINDER_LIVE_SHOPPING_UPDATE_PROMOTING_COUPON, (Bundle) null, 2, (Object) null);
            }
            C62850ke keVar4 = this.f152364h;
            if (keVar4 != null) {
                keVar4.mo10792g(0);
            }
        } else {
            C62850ke keVar5 = this.f152364h;
            if (keVar5 != null) {
                keVar5.mo10792g(8);
            }
        }
        C56032b bVar4 = this.f189238f;
        if (bVar4 != null) {
            bVar4.fillBlurBg(((C54991o) mo83051g(cls2)).f154345o, true);
        }
    }

    /* renamed from: j */
    public void mo75083j(C56032b bVar) {
        C87412m.m108594g(bVar, "baseRouter");
        C45795b buContext = bVar.getBuContext();
        C87412m.m108594g(buContext, "<set-?>");
        this.f166851d = buContext;
        this.f189238f = bVar;
        ViewGroup viewGroup = (ViewGroup) bVar.findViewById(C0966R.C0970id.kof);
        if (viewGroup != null) {
            viewGroup.post(new C0197a(viewGroup));
            viewGroup.setOnClickListener(new C54281b(this, bVar));
        }
        ViewGroup viewGroup2 = (ViewGroup) bVar.findViewById(C0966R.C0970id.aml);
        if (viewGroup2 != null) {
            this.f152364h = new C62850ke(new FrameLayout(this.f189237e), viewGroup2, bVar, (C32226l<? super C63956k, C13598b0>) null, (C63956k) null);
        }
    }
}
