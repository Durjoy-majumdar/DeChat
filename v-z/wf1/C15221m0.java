package wf1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32231t;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tf0.C64916p1;

/* renamed from: wf1.m0 */
public final class C15221m0 extends UIComponent {

    /* renamed from: d */
    public int f41433d;

    /* renamed from: e */
    public int f41434e = 3;

    /* renamed from: f */
    public boolean f41435f = true;

    /* renamed from: g */
    public C15222a f41436g;

    /* renamed from: h */
    public C32231t<? super Activity, ? super Intent, ? super Integer, ? super DialogInterface.OnClickListener, ? super DialogInterface.OnClickListener, ? super DialogInterface.OnDismissListener, C13598b0> f41437h = new C15224c(this);

    /* renamed from: i */
    public final C13601g f41438i;

    /* renamed from: j */
    public final C13601g f41439j;

    /* renamed from: wf1.m0$a */
    public static abstract class C15222a {
        /* renamed from: a */
        public void mo14140a() {
        }

        /* renamed from: b */
        public void mo14141b() {
        }

        /* renamed from: c */
        public void mo14142c() {
        }

        /* renamed from: d */
        public void mo14124d() {
        }

        /* renamed from: e */
        public void mo14125e(boolean z) {
        }

        /* renamed from: f */
        public void mo14143f() {
        }
    }

    /* renamed from: wf1.m0$b */
    public static final class C15223b extends C87413o implements C32224a<C15162a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15223b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41440d = appCompatActivity;
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f41440d).mo75002a(C15162a.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…oomCustomUIC::class.java)");
            return (C15162a) a;
        }
    }

    /* renamed from: wf1.m0$c */
    public static final class C15224c extends C87413o implements C32231t<Activity, Intent, Integer, DialogInterface.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15221m0 f41441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15224c(C15221m0 m0Var) {
            super(6);
            this.f41441d = m0Var;
        }

        /* renamed from: L */
        public Object mo14122L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            Activity activity = (Activity) obj;
            C87412m.m108594g(activity, "context");
            ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76709nI(activity, this.f41441d.f41434e, (Intent) obj2, ((Number) obj3).intValue(), (DialogInterface.OnClickListener) obj4, (DialogInterface.OnClickListener) obj5, (DialogInterface.OnDismissListener) obj6);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wf1.m0$d */
    public static final class C15225d extends C87413o implements C32224a<C15249x0> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15225d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41442d = appCompatActivity;
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f41442d).mo75002a(C15249x0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…neyCustomUIC::class.java)");
            return (C15249x0) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15221m0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41438i = C36568h.m40985a(new C15225d(appCompatActivity));
        this.f41439j = C36568h.m40985a(new C15223b(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("ENTER_SCENE", 0);
        this.f41433d = intExtra;
        if (intExtra == 1) {
            C15249x0 x0Var = (C15249x0) ((C36570n) this.f41438i).getValue();
            ((C15221m0) ((C36570n) x0Var.f41491d).getValue()).f41434e = 9;
            ((C15221m0) ((C36570n) x0Var.f41491d).getValue()).f41436g = new C15247w0();
        } else if (intExtra == 2) {
            C15162a aVar = (C15162a) ((C36570n) this.f41439j).getValue();
            String stringExtra = aVar.getIntent().getStringExtra("KEY_FROM_CHAT_ROOM_ID");
            if (stringExtra == null) {
                stringExtra = "";
            }
            aVar.f41298d = stringExtra;
            Log.m105924i(C54492n.TAG, "init fromChatRoomId:" + aVar.f41298d);
            aVar.mo14113c3().f41434e = 3;
            aVar.mo14113c3().f41435f = false;
            C15221m0 c3 = aVar.mo14113c3();
            C15183i iVar = new C15183i(aVar);
            c3.getClass();
            c3.f41437h = iVar;
            aVar.mo14113c3().f41436g = new C15189j();
        }
    }
}
