package ck2;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import qj2.C63183a;
import qj2.C63189c;
import qj2.C63190d;
import sj2.C63922c;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ck2.h */
public final class C54897h extends UIComponent {

    /* renamed from: d */
    public long f153872d = -1;

    /* renamed from: e */
    public boolean f153873e = true;

    /* renamed from: f */
    public ArrayList<String> f153874f = new ArrayList<>();

    /* renamed from: g */
    public C63183a f153875g;

    /* renamed from: h */
    public C63922c f153876h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54897h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        C63922c cVar = new C63922c();
        this.f153876h = cVar;
        this.f153875g = new C63183a(cVar);
    }

    public void onDestroy() {
        super.onDestroy();
        C63922c cVar = this.f153876h;
        if (cVar != null) {
            C53930o0.m60558e(cVar.f181194a, (CancellationException) null, 1, (Object) null);
        }
        C63183a aVar = this.f153875g;
        if (aVar != null) {
            C53973z1 z1Var = aVar.f179277i;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C53895h.m60466d(aVar.f179273e, (C66212f) null, (C53934p0) null, new C63189c(aVar, (C15601d<? super C63189c>) null), 3, (Object) null);
            C53930o0.m60558e(aVar.f179273e, (CancellationException) null, 1, (Object) null);
        }
    }

    public void onResume() {
        super.onResume();
        C63183a aVar = this.f153875g;
        if (aVar != null) {
            aVar.f179277i = C53895h.m60466d(aVar.f179273e, (C66212f) null, (C53934p0) null, new C63190d(aVar, (C15601d<? super C63190d>) null), 3, (Object) null);
        }
        this.f153873e = true;
        this.f153872d = -1;
        this.f153874f.clear();
        C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54894g(this, (C15601d<? super C54894g>) null), 3, (Object) null);
    }
}
