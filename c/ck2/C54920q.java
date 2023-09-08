package ck2;

import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;
import p145dx.C58449n;
import pj2.C62323d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ck2.q */
public final class C54920q extends UIComponent {

    /* renamed from: d */
    public final C13601g f153932d = C36568h.m40985a(new C54921a(this));

    /* renamed from: e */
    public WxRecyclerAdapter<C62323d> f153933e;

    /* renamed from: f */
    public LinearLayoutManager f153934f;

    /* renamed from: g */
    public C60898l.C60899a f153935g;

    /* renamed from: ck2.q$a */
    public static final class C54921a extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C54920q f153936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54921a(C54920q qVar) {
            super(0);
            this.f153936d = qVar;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f153936d.findViewById(C0966R.C0970id.iuo);
        }
    }

    /* renamed from: ck2.q$b */
    public static final class C54922b extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C54920q f153937d;

        public C54922b(C54920q qVar) {
            this.f153937d = qVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && i2 > 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager.mo16959E() >= linearLayoutManager.getItemCount() - 10) {
                    C39622i0 a = C39818r.f106831a.mo62444c(this.f153937d.getActivity()).mo75002a(C54891f0.class);
                    C87412m.m108593f(a, "UICProvider.of(activity)…electDataUIC::class.java)");
                    ((C54891f0) a).mo75831d3(false, (C66132f) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: ck2.q$c */
    public static final class C54923c extends RecyclerView.C16623q {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54920q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final WxRecyclerView mo75847c3() {
        Object value = ((C36570n) this.f153932d).getValue();
        C87412m.m108593f(value, "<get-mRingtoneList>(...)");
        return (WxRecyclerView) value;
    }

    /* renamed from: d3 */
    public final void mo75848d3() {
        View view;
        View view2;
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(RingtoneDataUIC.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…gtoneDataUIC::class.java)");
        View view3 = null;
        this.f153933e = C58449n.C58450a.m67851a((C58449n) a, false, 1, (Object) null);
        mo75847c3().setAdapter(this.f153933e);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.bth, mo75847c3(), false);
        if (inflate != null) {
            inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            inflate.getLayoutParams().height = C74942w4.m89784a(inflate.getContext(), 84);
        }
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.f357935ck0);
        if (C85875k4.m106211z()) {
            weImageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icon_filled_endline_night, getContext().getResources().getColor(C0966R.color.FG_4)));
        } else {
            weImageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icon_filled_endline, getContext().getResources().getColor(C0966R.color.FG_4)));
        }
        weImageView.setVisibility(8);
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f153933e;
        C60898l.C60899a R5 = wxRecyclerAdapter != null ? wxRecyclerAdapter.mo85792R5(inflate, 0, false) : null;
        this.f153935g = R5;
        WeImageView weImageView2 = (R5 == null || (view2 = ((C60898l.C60901e) R5).f173492d) == null) ? null : (WeImageView) view2.findViewById(C0966R.C0970id.f357935ck0);
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        C60898l.C60899a aVar = this.f153935g;
        if (!(aVar == null || (view = ((C60898l.C60901e) aVar).f173492d) == null)) {
            view3 = view.findViewById(C0966R.C0970id.g3f);
        }
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC", "showLoadingMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC", "showLoadingMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 6) {
            getActivity().setResult(6, getIntent());
            getActivity().finish();
        }
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        mo75847c3().setItemAnimator((RecyclerView.C16616j) null);
        mo75847c3().mo17043c(new C54922b(this));
        this.f153934f = new LinearLayoutManager(getActivity());
        mo75847c3().setLayoutManager(this.f153934f);
        WxRecyclerView c3 = mo75847c3();
        C54923c cVar = new C54923c();
        cVar.mo17336e(1, 10);
        c3.setRecycledViewPool(cVar);
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C54918p(this, (C15601d<? super C54918p>) null), 3, (Object) null);
        mo75848d3();
        ((C54913i0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54913i0.class)).f153915f = 1;
    }

    public void onPause() {
        List<C62323d> data;
        super.onPause();
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f153933e;
        if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
            for (C62323d h : data) {
                h.mo87404h(false);
            }
        }
    }

    public void onResume() {
        super.onResume();
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f153933e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }
}
