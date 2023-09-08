package com.tencent.p014mm.p136ui.chatting.search.multi.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rk3.C63462a;
import sk3.C13698c;
import sk3.C13703i;
import sk3.C63995m;
import sx3.C64187h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiImageResultFragment */
public final class FTSMultiImageResultFragment extends UIComponentFragment {

    /* renamed from: j */
    public View f165126j;

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C64187h0.f181908d;
    }

    /* renamed from: O */
    public void mo2202O() {
        Class cls = C63995m.class;
        C117292a.m165355a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.mo2202O();
        C39818r rVar = C39818r.f106831a;
        FragmentActivity activity = getActivity();
        C87412m.m108591d(activity);
        if (((C63995m) rVar.mo62443b(activity).mo75002a(cls)).f181433n) {
            FragmentActivity activity2 = getActivity();
            C87412m.m108591d(activity2);
            int f3 = ((C63995m) rVar.mo62443b(activity2).mo75002a(cls)).mo88764f3();
            C63462a aVar = C63462a.f180011a;
            FragmentActivity activity3 = getActivity();
            C87412m.m108591d(activity3);
            aVar.mo88331f(f3, f3, ((C63995m) rVar.mo62443b(activity3).mo75002a(cls)).mo88762d3());
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    /* renamed from: P */
    public void mo3550P() {
        C117292a.m165355a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.mo3550P();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cvt;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Class cls = C63995m.class;
        C87412m.m108594g(layoutInflater, "inflater");
        Log.m105924i("MicroMsg.UIComponentFragment", "onCreateView");
        C39818r rVar = C39818r.f106831a;
        FragmentActivity activity = getActivity();
        C87412m.m108591d(activity);
        if (((C63995m) rVar.mo62443b(activity).mo75002a(cls)).mo88766i3() || (view = this.f165126j) == null) {
            Log.m105924i("MicroMsg.UIComponentFragment", "onCreateView >> inflate view");
            this.f165126j = super.onCreateView(layoutInflater, viewGroup, bundle);
            FragmentActivity activity2 = getActivity();
            C87412m.m108591d(activity2);
            boolean i3 = ((C63995m) rVar.mo62443b(activity2).mo75002a(cls)).mo88766i3();
            Log.m105924i("MicroMsg.UIComponentFragment", "initFirstTime >> " + i3);
            if (i3) {
                FragmentActivity activity3 = getActivity();
                C87412m.m108591d(activity3);
                View view2 = this.f165126j;
                C87412m.m108591d(view2);
                ((C63995m) rVar.mo62443b(activity3).mo75002a(cls)).mo88768k3(view2);
            } else {
                FragmentActivity activity4 = getActivity();
                C87412m.m108591d(activity4);
                C13703i iVar = (C13703i) rVar.mo62443b(activity4).mo75002a(C13703i.class);
                View view3 = this.f165126j;
                C87412m.m108591d(view3);
                iVar.getClass();
                Log.m105924i("MicroMsg.FTSMultiImageQueryOpenUIC", "showOpenItemView");
                iVar.f38777e = view3.findViewById(C0966R.C0970id.n0z);
                View findViewById = view3.findViewById(C0966R.C0970id.n0q);
                iVar.f38776d = findViewById;
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "showOpenItemView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "showOpenItemView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                iVar.f38778f = view3;
                View view4 = iVar.f38777e;
                if (view4 != null) {
                    view4.setOnClickListener(new C13698c(iVar));
                }
            }
            View view5 = this.f165126j;
            C87412m.m108591d(view5);
            return view5;
        }
        C87412m.m108591d(view);
        return view;
    }
}
