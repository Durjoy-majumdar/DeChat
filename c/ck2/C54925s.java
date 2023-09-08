package ck2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import nj2.C61768p;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ck2.s */
public final class C54925s extends UIComponent {

    /* renamed from: d */
    public C54219z<C66132f> f153942d = new C54219z<>(C61768p.m72478f());

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneGlobalDataUIC$onCreateAfter$1", mo125469f = "RingtoneGlobalDataUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ck2.s$a */
    public static final class C54926a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C54925s f153943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54926a(C54925s sVar, C15601d<? super C54926a> dVar) {
            super(2, dVar);
            this.f153943d = sVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54926a(this.f153943d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54926a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C54925s sVar = this.f153943d;
            C53895h.m60466d(sVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54928u(sVar, (C15601d<? super C54928u>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54925s(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54926a(this, (C15601d<? super C54926a>) null), 3, (Object) null);
    }

    public void onResume() {
        super.onResume();
        this.f153942d.setValue(C61768p.m72478f());
    }
}
