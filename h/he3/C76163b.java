package he3;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import yb2.C15946a;

/* renamed from: he3.b */
public final class C76163b extends C15946a {

    /* renamed from: d */
    public final C13601g f223096d;

    /* renamed from: he3.b$a */
    public static final class C76164a extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f223097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76164a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f223097d = appCompatActivity;
        }

        public Object invoke() {
            return new LifecycleScope("LoadHdHeadUIC_1", this.f223097d, 0, 4, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76163b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f223096d = C36568h.m40985a(new C76164a(appCompatActivity));
    }
}
