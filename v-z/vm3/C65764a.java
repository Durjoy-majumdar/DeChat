package vm3;

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
import lm3.C61307a;
import lm3.C61309b;
import om3.C77020b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C78069w;

/* renamed from: vm3.a */
public final class C65764a extends C0262a<C77020b> {

    /* renamed from: d */
    public final C13601g f189173d;

    /* renamed from: e */
    public final C13601g f189174e;

    /* renamed from: f */
    public final C13601g f189175f = C36568h.m40985a(new C65765a(this));

    /* renamed from: vm3.a$a */
    public static final class C65765a extends C87413o implements C32224a<C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>>> {

        /* renamed from: d */
        public final /* synthetic */ C65764a f189176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65765a(C65764a aVar) {
            super(0);
            this.f189176d = aVar;
        }

        public Object invoke() {
            return ((C61309b) ((C36570n) this.f189176d.f189173d).getValue()).mo74666a((C61307a) ((C36570n) this.f189176d.f189174e).getValue());
        }
    }

    /* renamed from: vm3.a$b */
    public static final class C65766b extends C87413o implements C32224a<C61309b> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f189177d;

        /* renamed from: e */
        public final /* synthetic */ C65764a f189178e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65766b(AppCompatActivity appCompatActivity, C65764a aVar) {
            super(0);
            this.f189177d = appCompatActivity;
            this.f189178e = aVar;
        }

        public Object invoke() {
            C78069w wVar;
            C61309b bVar = new C61309b(this.f189177d);
            UIStateCenter e3 = this.f189178e.mo14599e3();
            if (!(e3 == null || (wVar = (C78069w) e3.getState()) == null)) {
                HashSet<String> hashSet = wVar.f228827o;
                C87412m.m108594g(hashSet, "<set-?>");
                bVar.f174430g = hashSet;
            }
            return bVar;
        }
    }

    /* renamed from: vm3.a$c */
    public static final class C65767c extends C87413o implements C32224a<C61307a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f189179d;

        /* renamed from: e */
        public final /* synthetic */ C65764a f189180e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65767c(AppCompatActivity appCompatActivity, C65764a aVar) {
            super(0);
            this.f189179d = appCompatActivity;
            this.f189180e = aVar;
        }

        public Object invoke() {
            C78069w wVar;
            C61307a aVar = new C61307a(this.f189179d);
            UIStateCenter e3 = this.f189180e.mo14599e3();
            if (!(e3 == null || (wVar = (C78069w) e3.getState()) == null)) {
                HashSet<String> hashSet = wVar.f228827o;
                C87412m.m108594g(hashSet, "<set-?>");
                aVar.f174425g = hashSet;
            }
            return aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65764a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f189173d = C36568h.m40985a(new C65766b(appCompatActivity, this));
        this.f189174e = C36568h.m40985a(new C65767c(appCompatActivity, this));
    }

    /* renamed from: g3 */
    public C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> mo302g3() {
        return (C54000f) ((C36570n) this.f189175f).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
