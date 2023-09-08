package mc1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import pb1.C100755z;
import pc1.C100774c;
import rx3.C13598b0;

/* renamed from: mc1.k */
public final class C99841k extends UIComponent {

    /* renamed from: d */
    public boolean f292545d;

    /* renamed from: e */
    public C100774c f292546e;

    /* renamed from: f */
    public C32226l<? super Integer, C13598b0> f292547f = C99842a.f292549d;

    /* renamed from: g */
    public int f292548g = -1;

    /* renamed from: mc1.k$a */
    public static final class C99842a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C99842a f292549d = new C99842a();

        public C99842a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99841k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo139191c3() {
        C100774c cVar = this.f292546e;
        if (cVar != null) {
            cVar.mo140209b();
            this.f292545d = false;
            this.f292547f.invoke(16);
            return;
        }
        C87412m.m108603p("mMoreFooter");
        throw null;
    }

    /* renamed from: d3 */
    public final C99830c mo139192d3() {
        C39622i0 a = C39818r.f106831a.mo62443b(getContext()).mo75002a(C99830c.class);
        C87412m.m108593f(a, "UICProvider.of(context).…inderDataUIC::class.java)");
        return (C99830c) a;
    }

    /* renamed from: e3 */
    public final void mo139193e3(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mo139192d3().mo139186f3());
        C93745z1.m118449f(getContext(), "", arrayList, false);
        if (i == 4106) {
            this.f292547f.invoke(5);
        } else {
            this.f292547f.invoke(7);
        }
    }

    /* renamed from: f3 */
    public final void mo139194f3(Intent intent, int i) {
        String str = null;
        String stringExtra = intent != null ? intent.getStringExtra("custom_send_text") : null;
        if (intent != null) {
            str = intent.getStringExtra("Select_Conv_User");
        }
        Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleResultTransmitSuccess] customText = " + stringExtra + ", toUsers = " + str);
        if (i == 4106) {
            ArrayList arrayList = new ArrayList();
            if (this.f292548g == -1) {
                this.f292547f.invoke(5);
                return;
            }
            C100755z c3 = mo139192d3().mo139183c3(this.f292548g);
            if (c3 != null) {
                arrayList.add(c3);
                C93745z1.m118445b(getContext(), arrayList, stringExtra, str, "MicroMsg.FavFinderFilterUI");
                this.f292547f.invoke(6);
                return;
            }
            this.f292547f.invoke(5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(mo139192d3().mo139186f3());
        C93745z1.m118445b(getContext(), arrayList2, stringExtra, str, "MicroMsg.FavFinderFilterUI");
        this.f292547f.invoke(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.FavFinderFilterUI", "onActivityResult requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != -1) {
            if (i == 4105) {
                mo139193e3(i);
            } else if (i == 4106) {
                mo139193e3(i);
            }
        } else if (i == 4105) {
            mo139194f3(intent, i);
        } else if (i == 4106) {
            mo139194f3(intent, i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C100774c cVar = new C100774c();
        this.f292546e = cVar;
        View findViewById = findViewById(C0966R.C0970id.f357984cv1);
        cVar.f295233a = false;
        cVar.f295234b = findViewById;
        C100774c cVar2 = this.f292546e;
        if (cVar2 != null) {
            cVar2.f295241i = new C99840j(this);
        } else {
            C87412m.m108603p("mMoreFooter");
            throw null;
        }
    }
}
