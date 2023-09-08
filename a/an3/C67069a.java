package an3;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bc2.C0262a;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nm3.C76934a;
import om3.C77020b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: an3.a */
public final class C67069a extends C0262a<C77020b> {

    /* renamed from: d */
    public final C13601g f192641d;

    /* renamed from: an3.a$a */
    public static final class C67070a extends C87413o implements C32224a<C76934a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f192642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67070a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f192642d = appCompatActivity;
        }

        public Object invoke() {
            return new C76934a(this.f192642d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67069a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f192641d = C36568h.m40985a(new C67070a(appCompatActivity));
    }

    /* renamed from: g3 */
    public C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> mo302g3() {
        return (C76934a) ((C36570n) this.f192641d).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
