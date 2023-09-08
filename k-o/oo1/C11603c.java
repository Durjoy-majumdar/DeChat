package oo1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51810wb1;
import up1.C37521f;
import ye1.C15972e0;
import z04.C112550d0;

/* renamed from: oo1.c */
public final class C11603c {

    /* renamed from: a */
    public final AppCompatActivity f34010a;

    /* renamed from: b */
    public final C13601g f34011b;

    /* renamed from: c */
    public final C13601g f34012c = C36568h.m40985a(new C11604a(this));

    /* renamed from: d */
    public final C13601g f34013d = C36568h.m40985a(new C11605b(this));

    /* renamed from: oo1.c$a */
    public static final class C11604a extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11603c f34014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11604a(C11603c cVar) {
            super(0);
            this.f34014d = cVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34014d.f34011b).getValue()).f42941s;
        }
    }

    /* renamed from: oo1.c$b */
    public static final class C11605b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11603c f34015d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11605b(C11603c cVar) {
            super(0);
            this.f34015d = cVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34015d.f34011b).getValue()).f42942t;
        }
    }

    /* renamed from: oo1.c$c */
    public static final class C11606c extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ View f34016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11606c(View view) {
            super(0);
            this.f34016d = view;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f34016d);
        }
    }

    public C11603c(View view, AppCompatActivity appCompatActivity) {
        C87412m.m108594g(view, "header");
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f34010a = appCompatActivity;
        this.f34011b = C36568h.m40985a(new C11606c(view));
    }

    /* renamed from: a */
    public final void mo11521a(String str) {
        String str2;
        C51810wb1 wb12;
        C87412m.m108594g(str, "username");
        FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(str);
        String str3 = "";
        if (bVar == null || (wb12 = bVar.f16276o) == null || (str2 = wb12.f143958d) == null) {
            str2 = str3;
        }
        Log.m105924i("Finder.FinderProfileHeaderUIC", "[handleIPAndMcn] agencyName:" + str2);
        C37521f.f99374d.getClass();
        boolean z = true;
        if (C37521f.f99488p8.mo60266n().intValue() == 1 && !Util.isNullOrNil(str2)) {
            str3 = str3 + this.f34010a.getResources().getString(C0966R.string.mow, new Object[]{str2});
        }
        if (str3.length() <= 0) {
            z = false;
        }
        if (z) {
            ((LinearLayout) ((C36570n) this.f34012c).getValue()).setVisibility(0);
            ((TextView) ((C36570n) this.f34013d).getValue()).setText(C112550d0.m153799i0(str3).toString());
            return;
        }
        ((LinearLayout) ((C36570n) this.f34012c).getValue()).setVisibility(8);
    }
}
