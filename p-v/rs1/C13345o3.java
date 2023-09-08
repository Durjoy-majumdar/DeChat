package rs1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rs1.o3 */
public final class C13345o3 extends UIComponent {

    /* renamed from: d */
    public static final C13601g<Integer> f37843d = C36568h.m40985a(C13347b.f37845d);

    /* renamed from: rs1.o3$a */
    public static final class C13346a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13346a f37844d = new C13346a();

        public C13346a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3727cg));
        }
    }

    /* renamed from: rs1.o3$b */
    public static final class C13347b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13347b f37845d = new C13347b();

        public C13347b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv));
        }
    }

    /* renamed from: rs1.o3$c */
    public static final class C13348c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13348c f37846d = new C13348c();

        public C13348c() {
            super(0);
        }

        public Object invoke() {
            C13601g<Integer> gVar = C13345o3.f37843d;
            return Integer.valueOf(((Number) ((C36570n) C13345o3.f37843d).getValue()).intValue());
        }
    }

    /* renamed from: rs1.o3$d */
    public static final class C13349d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13349d f37847d = new C13349d();

        public C13349d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df));
        }
    }

    /* renamed from: rs1.o3$e */
    public static final class C13350e {
        public C13350e(C8480h hVar) {
        }
    }

    static {
        new C13350e((C8480h) null);
        C36568h.m40985a(C13349d.f37847d);
        C36568h.m40985a(C13346a.f37844d);
        C36568h.m40985a(C13348c.f37846d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13345o3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
