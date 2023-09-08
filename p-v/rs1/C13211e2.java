package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@C113200q(initialMode = 2)
/* renamed from: rs1.e2 */
public final class C13211e2 extends UIComponent {

    /* renamed from: d */
    public final C13601g f37547d;

    /* renamed from: e */
    public final C13601g f37548e;

    /* renamed from: rs1.e2$a */
    public static final class C13212a extends C87413o implements C32224a<FinderLikeDrawer> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f37549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13212a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f37549d = appCompatActivity;
        }

        public Object invoke() {
            return (FinderLikeDrawer) this.f37549d.findViewById(C0966R.C0970id.f358072d93);
        }
    }

    /* renamed from: rs1.e2$b */
    public static final class C13213b extends C87413o implements C32224a<FinderLikeDrawer> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f37550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13213b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f37550d = appCompatActivity;
        }

        public Object invoke() {
            return (FinderLikeDrawer) this.f37550d.findViewById(C0966R.C0970id.d96);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13211e2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f37547d = C36568h.m40985a(new C13213b(appCompatActivity));
        this.f37548e = C36568h.m40985a(new C13212a(appCompatActivity));
    }

    public boolean onBackPressed() {
        if (((FinderLikeDrawer) ((C36570n) this.f37547d).getValue()) == null) {
            return false;
        }
        FinderLikeDrawer finderLikeDrawer = (FinderLikeDrawer) ((C36570n) this.f37547d).getValue();
        C87412m.m108591d(finderLikeDrawer);
        if (!finderLikeDrawer.mo82541i()) {
            return false;
        }
        FinderLikeDrawer finderLikeDrawer2 = (FinderLikeDrawer) ((C36570n) this.f37547d).getValue();
        C87412m.m108591d(finderLikeDrawer2);
        finderLikeDrawer2.mo4615l();
        return true;
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
