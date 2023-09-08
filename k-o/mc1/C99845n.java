package mc1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dm2.C45418c;
import gy3.C87412m;
import oc1.C100324a;
import p640ox.C77049b;
import te3.C101825od0;

/* renamed from: mc1.n */
public final class C99845n extends UIComponent {

    /* renamed from: d */
    public long f292552d;

    /* renamed from: e */
    public int f292553e = -1;

    /* renamed from: f */
    public final C100324a f292554f = new C100324a();

    /* renamed from: g */
    public boolean f292555g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99845n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo139196c3(int i, boolean z) {
        C39622i0 a = C39818r.f106831a.mo62443b(getContext()).mo75002a(C99830c.class);
        C87412m.m108593f(a, "UICProvider.of(context).…inderDataUIC::class.java)");
        int d3 = ((C99830c) a).mo139184d3();
        int i2 = this.f292553e;
        int i3 = 0;
        if (i2 == 1) {
            i3 = 2;
        } else {
            if (i2 == 0) {
                i3 = 1;
            }
        }
        C100324a aVar = this.f292554f;
        String str = aVar.f293911g;
        int i4 = aVar.f293912h;
        if (!z) {
            i4 = (int) (aVar.f293916l - aVar.f293915k);
        }
        C87412m.m108593f(str, "searchId");
        C100324a aVar2 = this.f292554f;
        aVar2.f293905a = i;
        aVar2.f293907c = i3;
        aVar2.f293906b = 2;
        aVar2.f293910f = 10;
        aVar2.f293908d = ((int) (System.currentTimeMillis() - this.f292552d)) / 1000;
        C100324a aVar3 = this.f292554f;
        aVar3.f293911g = str;
        aVar3.f293912h = i4;
        aVar3.f293914j = d3;
        aVar3.mo139616b();
        this.f292555g = true;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C101825od0.class;
        Class cls2 = C77049b.class;
        super.onCreate(bundle);
        this.f292552d = System.currentTimeMillis();
        this.f292554f.f293911g = C100324a.m131159a();
        this.f292554f.f293915k = this.f292552d;
        ((C77049b) C86312j.m106911c(cls2)).mo72352Rp(getContext(), new C45418c(cls, 17, true));
        this.f292554f.mo139618e((C101825od0) ((C77049b) C86312j.m106911c(cls2)).Wi0(getContext(), 17, cls));
        this.f292555g = false;
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f292555g) {
            mo139196c3(1, false);
        }
    }
}
