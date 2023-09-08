package e32;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bc2.C0262a;
import c32.C67337a;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import om3.C77020b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C78069w;

/* renamed from: e32.a */
public final class C75548a extends C0262a<C77020b> {

    /* renamed from: d */
    public final C13601g f221939d;

    /* renamed from: e32.a$a */
    public static final class C75549a extends C87413o implements C32224a<C67337a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f221940d;

        /* renamed from: e */
        public final /* synthetic */ C75548a f221941e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75549a(AppCompatActivity appCompatActivity, C75548a aVar) {
            super(0);
            this.f221940d = appCompatActivity;
            this.f221941e = aVar;
        }

        public Object invoke() {
            C78069w wVar;
            C67337a aVar = new C67337a(this.f221940d);
            UIStateCenter e3 = this.f221941e.mo14599e3();
            if (!(e3 == null || (wVar = (C78069w) e3.getState()) == null)) {
                HashSet<String> hashSet = wVar.f228827o;
                C87412m.m108594g(hashSet, "<set-?>");
                aVar.f193184g = hashSet;
            }
            return aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75548a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f221939d = C36568h.m40985a(new C75549a(appCompatActivity, this));
    }

    /* renamed from: g3 */
    public C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> mo302g3() {
        return (C67337a) ((C36570n) this.f221939d).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
