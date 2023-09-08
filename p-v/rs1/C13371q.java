package rs1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderActivityToggleAnimUIC$onCreateAfter$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de1.C7267b;
import de1.C7287o;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@C113200q(initialMode = 2)
/* renamed from: rs1.q */
public final class C13371q extends UIComponent {

    /* renamed from: d */
    public final C13601g f37884d;

    /* renamed from: e */
    public boolean f37885e = mo12784c3();

    /* renamed from: f */
    public boolean f37886f;

    /* renamed from: g */
    public boolean f37887g;

    /* renamed from: rs1.q$a */
    public static final class C13372a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f37888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13372a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f37888d = appCompatActivity;
        }

        public Object invoke() {
            C7267b bVar = C7267b.f25328d;
            Intent intent = this.f37888d.getIntent();
            C87412m.m108593f(intent, "activity.intent");
            bVar.getClass();
            return Boolean.valueOf(intent.hasExtra("key_anim_intent_id"));
        }
    }

    /* renamed from: rs1.q$b */
    public static final class C13373b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13371q f37889d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13373b(C13371q qVar) {
            super(0);
            this.f37889d = qVar;
        }

        public Object invoke() {
            C13371q qVar = this.f37889d;
            qVar.f37885e = false;
            qVar.getActivity().finish();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13371q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f37884d = C36568h.m40985a(new C13372a(appCompatActivity));
    }

    /* renamed from: c3 */
    public final boolean mo12784c3() {
        return ((Boolean) this.f37884d.getValue()).booleanValue();
    }

    public void onCreateAfter(Bundle bundle) {
        new FinderActivityToggleAnimUIC$onCreateAfter$1(this, getActivity()).alive();
    }

    public boolean onInterceptFinish() {
        Object obj;
        if (!this.f37887g && !this.f37886f && this.f37885e) {
            try {
                Result.Companion companion = Result.Companion;
                C7287o.m7448d(getActivity(), 0, new C13373b(this), 1, (Object) null);
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
            if (r0 != null) {
                Log.printInfoStack("Finder.ActivityToggleAnimUIC", "", r0);
                this.f37885e = false;
                getActivity().finish();
            }
        }
        return !this.f37887g && !this.f37886f && this.f37885e;
    }
}
