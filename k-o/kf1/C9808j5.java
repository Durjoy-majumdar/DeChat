package kf1;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import o40.C61926c;
import ok1.C11471u;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: kf1.j5 */
public final class C9808j5 extends UIComponent {

    /* renamed from: kf1.j5$a */
    public static final class C9809a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f30343d;

        /* renamed from: e */
        public final /* synthetic */ C9808j5 f30344e;

        /* renamed from: f */
        public final /* synthetic */ String f30345f;

        /* renamed from: g */
        public final /* synthetic */ C49765hx0 f30346g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9809a(boolean z, C9808j5 j5Var, String str, C49765hx0 hx02) {
            super(0);
            this.f30343d = z;
            this.f30344e = j5Var;
            this.f30345f = str;
            this.f30346g = hx02;
        }

        public Object invoke() {
            C11471u.C11473b bVar = !this.f30343d ? C11471u.C11473b.FORCE_LIGHT : C11471u.C11473b.AUTO;
            Activity context = this.f30344e.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = new FinderLiveMemebrProfileWidget((AppCompatActivity) context, (C62660c) null, bVar, 2, (C8480h) null);
            finderLiveMemebrProfileWidget.f15410o = new C9742g5(this.f30344e);
            finderLiveMemebrProfileWidget.f15412q = new C9777h5(this.f30344e);
            finderLiveMemebrProfileWidget.f15409n = new C9793i5(this.f30344e);
            String str = this.f30345f;
            if (!(str == null || str.length() == 0)) {
                finderLiveMemebrProfileWidget.f15405Y = str;
            }
            FinderLiveMemebrProfileWidget.m3151B(finderLiveMemebrProfileWidget, this.f30346g, 5, ((C60172g4) C39818r.f106831a.mo62443b(this.f30344e.getContext()).mo62447c(C60172g4.class)).mo12861q3(), false, (String) null, 16, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9808j5(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("liveContact")) {
            boolean booleanExtra = getIntent().getBooleanExtra("isDarkMode", false);
            String stringExtra = getIntent().getStringExtra("fromUsername");
            C49765hx0 hx02 = new C49765hx0();
            hx02.parseFrom(getIntent().getByteArrayExtra("liveContact"));
            C61926c.m72668M(new C9809a(booleanExtra, this, stringExtra, hx02));
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
