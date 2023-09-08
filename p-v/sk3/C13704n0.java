package sk3;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nk3.C11213f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: sk3.n0 */
public final class C13704n0 extends UIComponent {

    /* renamed from: d */
    public final C13601g f38779d = C36568h.m40985a(new C13706b(this));

    /* renamed from: e */
    public final C13601g f38780e = C36568h.m40985a(new C13705a(this));

    /* renamed from: f */
    public String f38781f = "";

    /* renamed from: g */
    public boolean f38782g;

    /* renamed from: h */
    public ArrayList<String> f38783h = new ArrayList<>();

    /* renamed from: sk3.n0$a */
    public static final class C13705a extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C13704n0 f38784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13705a(C13704n0 n0Var) {
            super(0);
            this.f38784d = n0Var;
        }

        public Object invoke() {
            return (RecyclerView) this.f38784d.findViewById(C0966R.C0970id.f358330n11);
        }
    }

    /* renamed from: sk3.n0$b */
    public static final class C13706b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13704n0 f38785d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13706b(C13704n0 n0Var) {
            super(0);
            this.f38785d = n0Var;
        }

        public Object invoke() {
            return this.f38785d.findViewById(C0966R.C0970id.n0v);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13704n0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo13085c3(int i) {
        Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "setEduLayoutVisible >> " + i);
        Object value = ((C36570n) this.f38779d).getValue();
        C87412m.m108593f(value, "<get-searchEduParent>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "setEduLayoutVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "setEduLayoutVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f38781f = stringExtra;
        this.f38782g = getIntent().getBooleanExtra("detail_user_dismiss", false);
        Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "initData: " + this.f38781f);
        if (C72996z1.m85820U5(this.f38781f)) {
            this.f38783h.add(getActivity().getResources().getString(C0966R.string.ige));
        }
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.igb));
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.igd));
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.igc));
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.igh));
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.igf));
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.igg));
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.iga));
        this.f38783h.add(getActivity().getResources().getString(C0966R.string.f8183t5));
        Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "initView");
        Object value = ((C36570n) this.f38780e).getValue();
        C87412m.m108593f(value, "<get-eduGirdList>(...)");
        ((RecyclerView) value).setLayoutManager(new GridLayoutManager(getActivity(), 3));
        Object value2 = ((C36570n) this.f38780e).getValue();
        C87412m.m108593f(value2, "<get-eduGirdList>(...)");
        ((RecyclerView) value2).mo17085h0(new C13707o0(this));
        Object value3 = ((C36570n) this.f38780e).getValue();
        C87412m.m108593f(value3, "<get-eduGirdList>(...)");
        ((RecyclerView) value3).setAdapter(new C11213f(this.f38783h, new C13708p0(this)));
    }
}
