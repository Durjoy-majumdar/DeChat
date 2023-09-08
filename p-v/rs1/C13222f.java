package rs1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import mo1.C11059w;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ye1.C15967a;

/* renamed from: rs1.f */
public final class C13222f extends C11059w {

    /* renamed from: e */
    public final String f37559e = "FinderAccountLogOutUIC";

    /* renamed from: f */
    public final C13601g f37560f = C36568h.m40985a(new C13225c(this));

    /* renamed from: g */
    public final C13601g f37561g = C36568h.m40985a(new C13223a(this));

    /* renamed from: rs1.f$a */
    public static final class C13223a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C13222f f37562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13223a(C13222f fVar) {
            super(0);
            this.f37562d = fVar;
        }

        public Object invoke() {
            return ((C15967a) ((C36570n) this.f37562d.f37560f).getValue()).f42864b;
        }
    }

    /* renamed from: rs1.f$b */
    public static final class C13224b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13222f f37563d;

        public C13224b(C13222f fVar) {
            this.f37563d = fVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountLogOutUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f37563d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountLogOutUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.f$c */
    public static final class C13225c extends C87413o implements C32224a<C15967a> {

        /* renamed from: d */
        public final /* synthetic */ C13222f f37564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13225c(C13222f fVar) {
            super(0);
            this.f37564d = fVar;
        }

        public Object invoke() {
            return C15967a.m14885a(this.f37564d.findViewById(C0966R.C0970id.i5h));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13222f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i(this.f37559e, "FinderAccountLogOutUIC [onCreate]");
        ((TextView) this.f37561g.getValue()).setOnClickListener(new C13224b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13222f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
