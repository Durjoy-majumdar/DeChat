package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import dj3.C45405a;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;
import ue1.C52528f;
import ue1.C52538i;
import ue1.C52542k;
import ue1.C52543l;
import up1.C52593j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSayHiConvFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSayHiConvFragment */
public final class FinderSayHiConvFragment extends FinderBaseConversationFragment {

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSayHiConvFragment$a */
    public static final class C41520a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C41520a f111813d = new C41520a();

        public C41520a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSayHiConvFragment$b */
    public static final class C41521b extends C87413o implements C32226l<C45405a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSayHiConvFragment f111814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41521b(FinderSayHiConvFragment finderSayHiConvFragment) {
            super(1);
            this.f111814d = finderSayHiConvFragment;
        }

        public Object invoke(Object obj) {
            C45405a aVar = (C45405a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            this.f111814d.f111744y = aVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: T */
    public BasePrivateMsgConvListFragment.C40273a<C52528f> mo62819T() {
        C52542k kVar = new C52542k();
        kVar.f146730n = new C52543l(C41520a.f111813d);
        kVar.f146729j = new C52538i(this, new C41521b(this));
        Bundle arguments = getArguments();
        int i = -1;
        kVar.f146728i = arguments != null ? arguments.getInt("KEY_TALKER_SCENE", -1) : -1;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("KEY_TALKER_TYPE", -1);
        }
        kVar.f146727h = i;
        return kVar;
    }

    /* renamed from: j0 */
    public void mo64586j0() {
        if (mo62821V().mo62831F4().size() == 1 && ((C52528f) mo62821V().mo62831F4().get(0)).field_type != 1) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(1);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                activity3.overridePendingTransition(0, 0);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        if ((mo62821V() instanceof C52542k) && !C58784w3.f168295a.mo83889N0()) {
            BasePrivateMsgConvListFragment.C40273a V = mo62821V();
            C87412m.m108592e(V, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            ArrayList<C52528f> arrayList = ((C52542k) V).f146752o;
            C52528f a = C52593j.f146894e.mo73554a();
            a.field_type = 10000;
            a.f146723b1 = view.getContext().getResources().getString(C0966R.string.f360482md1);
            arrayList.add(a);
        }
    }
}
