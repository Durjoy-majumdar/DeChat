package com.tencent.p014mm.plugin.profile.p088ui.tab.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController;
import com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46107h1;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49001ch;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "Landroidx/fragment/app/Fragment;", "Lht1/h1;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment */
public abstract class BaseBizProfileFragment extends HellAndroidXFragment implements C46107h1 {

    /* renamed from: d */
    public BizProfileDataFetcher f115690d;

    /* renamed from: e */
    public C49001ch f115691e;

    /* renamed from: f */
    public BizProfileRecyclerView f115692f;

    /* renamed from: g */
    public ContactWidgetTabBizHeaderController f115693g;

    /* renamed from: h */
    public final C13601g f115694h = C36568h.m40985a(new C42724c(this));

    /* renamed from: i */
    public final C13601g f115695i = C36568h.m40985a(new C42723b(this));

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment$a */
    public static final class C42722a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ BaseBizProfileFragment f115696d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42722a(BaseBizProfileFragment baseBizProfileFragment) {
            super(0);
            this.f115696d = baseBizProfileFragment;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f115696d.getContext()).inflate(C0966R.C0971layout.f7059wm, (ViewGroup) null, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment$b */
    public static final class C42723b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ BaseBizProfileFragment f115697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42723b(BaseBizProfileFragment baseBizProfileFragment) {
            super(0);
            this.f115697d = baseBizProfileFragment;
        }

        public Object invoke() {
            return (TextView) this.f115697d.mo66874K().findViewById(C0966R.C0970id.aaw);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment$c */
    public static final class C42724c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ BaseBizProfileFragment f115698d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42724c(BaseBizProfileFragment baseBizProfileFragment) {
            super(0);
            this.f115698d = baseBizProfileFragment;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f115698d.getContext()).inflate(C0966R.C0971layout.f7074xe, (ViewGroup) null, false);
        }
    }

    public BaseBizProfileFragment() {
        C36568h.m40985a(new C42722a(this));
    }

    /* renamed from: B */
    public boolean mo66872B() {
        return this instanceof BizProfileTabVideoFragment;
    }

    /* renamed from: C */
    public void mo66873C() {
    }

    /* renamed from: K */
    public View mo66874K() {
        Object value = ((C36570n) this.f115694h).getValue();
        C87412m.m108593f(value, "<get-footerView>(...)");
        return (View) value;
    }

    /* renamed from: L */
    public final C49001ch mo66875L() {
        C49001ch chVar = this.f115691e;
        if (chVar != null) {
            return chVar;
        }
        C87412m.m108603p("mBizProfileResp");
        throw null;
    }

    /* renamed from: M */
    public final BizProfileDataFetcher mo66876M() {
        BizProfileDataFetcher bizProfileDataFetcher = this.f115690d;
        if (bizProfileDataFetcher != null) {
            return bizProfileDataFetcher;
        }
        C87412m.m108603p("mDataFetcher");
        throw null;
    }

    /* renamed from: N */
    public final BizProfileRecyclerView mo66877N() {
        BizProfileRecyclerView bizProfileRecyclerView = this.f115692f;
        if (bizProfileRecyclerView != null) {
            return bizProfileRecyclerView;
        }
        C87412m.m108603p("mRecyclerView");
        throw null;
    }
}
