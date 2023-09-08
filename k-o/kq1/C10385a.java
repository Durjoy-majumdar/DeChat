package kq1;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kq1.a */
public final class C10385a extends UIComponent {

    /* renamed from: d */
    public View f31592d;

    /* renamed from: kq1.a$a */
    public static final class C10386a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10385a f31593d;

        public C10386a(C10385a aVar) {
            this.f31593d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C61132b) C39818r.f106831a.mo62444c(this.f31593d.getActivity()).mo75002a(C61132b.class)).getActiveFragment().mo4178T();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10385a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.l2c);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C10386a(this));
        } else {
            findViewById = null;
        }
        this.f31592d = findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10385a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
