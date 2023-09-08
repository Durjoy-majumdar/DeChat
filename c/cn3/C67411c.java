package cn3;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bc2.C0262a;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import nm3.C76938c;
import om3.C77020b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C78069w;

/* renamed from: cn3.c */
public final class C67411c extends C0262a<C77020b> {

    /* renamed from: d */
    public final C13601g f193319d;

    /* renamed from: cn3.c$a */
    public static final class C67412a extends C87413o implements C32224a<C76938c> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f193320d;

        /* renamed from: e */
        public final /* synthetic */ C67411c f193321e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67412a(AppCompatActivity appCompatActivity, C67411c cVar) {
            super(0);
            this.f193320d = appCompatActivity;
            this.f193321e = cVar;
        }

        public Object invoke() {
            C78069w wVar;
            C76938c cVar = new C76938c(this.f193320d);
            UIStateCenter e3 = this.f193321e.mo14599e3();
            if (!(e3 == null || (wVar = (C78069w) e3.getState()) == null)) {
                HashSet<String> hashSet = wVar.f228827o;
                C87412m.m108594g(hashSet, "<set-?>");
                cVar.f224842g = hashSet;
            }
            return cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67411c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f193319d = C36568h.m40985a(new C67412a(appCompatActivity, this));
    }

    /* renamed from: g3 */
    public C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> mo302g3() {
        return (C76938c) ((C36570n) this.f193319d).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
