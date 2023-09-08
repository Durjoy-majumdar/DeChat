package ck2;

import a14.C53851a;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import ve3.C52839l;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ck2.o */
public final class C54917o extends UIComponent {

    /* renamed from: d */
    public ArrayList<C52839l> f153924d = new ArrayList<>();

    /* renamed from: e */
    public boolean f153925e = true;

    /* renamed from: f */
    public int f153926f = -1;

    /* renamed from: g */
    public String f153927g = "";

    /* renamed from: h */
    public C53973z1 f153928h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54917o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        String stringExtra = getIntent().getStringExtra("ringtone_finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f153927g = stringExtra;
        if (!this.f153925e) {
            ((C54873a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54873a.class)).mo75817c3();
            return;
        }
        C53973z1 z1Var = this.f153928h;
        boolean z = true;
        if (z1Var == null || !((C53851a) z1Var).mo74466a()) {
            z = false;
        }
        if (!z) {
            this.f153928h = C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54916n(this, (C15601d<? super C54916n>) null), 3, (Object) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C53973z1 z1Var = this.f153928h;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f153924d.clear();
    }
}
