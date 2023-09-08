package mo1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60200t1;
import kj2.C117407d;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import zc1.C66785b;

/* renamed from: mo1.x */
public class C11062x extends C11059w {

    /* renamed from: e */
    public final C13601g f32822e = C36568h.m40985a(new C11066d(this));

    /* renamed from: f */
    public final C13601g f32823f = C36568h.m40985a(new C11065c(this));

    /* renamed from: g */
    public final C13601g f32824g = C36568h.m40985a(new C11064b(this));

    /* renamed from: h */
    public final C13601g f32825h = C36568h.m40985a(new C11063a(this));

    /* renamed from: i */
    public final boolean f32826i = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();

    /* renamed from: j */
    public final C13442s8 f32827j;

    /* renamed from: n */
    public final C49712hj1 f32828n;

    /* renamed from: mo1.x$a */
    public static final class C11063a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C11062x f32829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11063a(C11062x xVar) {
            super(0);
            this.f32829d = xVar;
        }

        public Object invoke() {
            return this.f32829d.getIntent().getStringExtra("from_user");
        }
    }

    /* renamed from: mo1.x$b */
    public static final class C11064b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C11062x f32830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11064b(C11062x xVar) {
            super(0);
            this.f32830d = xVar;
        }

        public Object invoke() {
            return Boolean.valueOf(C87412m.m108589b(this.f32830d.getUsername(), C66785b.f191882e.mo90662O5()));
        }
    }

    /* renamed from: mo1.x$c */
    public static final class C11065c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C11062x f32831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11065c(C11062x xVar) {
            super(0);
            this.f32831d = xVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f32831d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: mo1.x$d */
    public static final class C11066d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C11062x f32832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11066d(C11062x xVar) {
            super(0);
            this.f32832d = xVar;
        }

        public Object invoke() {
            return this.f32832d.getIntent().getStringExtra("finder_username");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11062x(Fragment fragment) {
        super(fragment);
        Class cls = C13442s8.class;
        C87412m.m108594g(fragment, "fragment");
        Fragment parentFragment = fragment.getParentFragment();
        C13442s8 s8Var = parentFragment != null ? (C13442s8) C39818r.f106831a.mo62445d(parentFragment).mo75002a(cls) : null;
        if (s8Var == null) {
            C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(activity)…rReporterUIC::class.java)");
            s8Var = (C13442s8) a;
        }
        this.f32827j = s8Var;
        this.f32828n = s8Var.mo12861q3();
    }

    public C49712hj1 getContextObj() {
        return this.f32828n;
    }

    public String getFromUser() {
        return (String) ((C36570n) this.f32825h).getValue();
    }

    public boolean getHasFinderEntry() {
        return this.f32826i;
    }

    public C58969q getProfileContact() {
        return C58961d.f168673a.mo84155b(getUsername());
    }

    public String getUsername() {
        return (String) ((C36570n) this.f32822e).getValue();
    }

    public boolean isSelf() {
        return ((Boolean) ((C36570n) this.f32824g).getValue()).booleanValue();
    }

    public boolean isSelfFlag() {
        return ((Boolean) ((C36570n) this.f32823f).getValue()).booleanValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = this.f32827j.f38105t;
        if (i == 1 || i == 2 || i == 14 || i == 15) {
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(1278, 15, 1, false);
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String fromUser = getFromUser();
            if (fromUser == null) {
                fromUser = "";
            }
            String username = getUsername();
            C87412m.m108591d(username);
            y0Var.getClass();
            String str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + i + ",2," + fromUser + ",0," + username;
            Log.m105924i(y0Var.f167350d, "18944 " + str);
            dVar.kvStat(18944, str);
        }
    }
}
