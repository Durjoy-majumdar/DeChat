package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import dj3.C45405a;
import dp1.C45431e2;
import dp1.C58363h;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C49712hj1;
import ue1.C52528f;
import ue1.C52530g;
import ue1.C52538i;
import ue1.C52541j;
import ue1.C52542k;
import ue1.C52543l;
import ue1.C65326e;
import ye1.C53517h;
import z04.C112551y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lue1/f;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment */
public class FinderBaseConversationFragment extends BasePrivateMsgConvListFragment<C52528f> {

    /* renamed from: A */
    public static final /* synthetic */ int f111740A = 0;

    /* renamed from: v */
    public final C13601g f111741v = C36568h.m40985a(C41491a.f111746d);

    /* renamed from: w */
    public int f111742w = -1;

    /* renamed from: x */
    public int f111743x = -1;

    /* renamed from: y */
    public C45405a f111744y;

    /* renamed from: z */
    public final C13601g f111745z = C36568h.m40985a(new C41495e(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment$a */
    public static final class C41491a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C41491a f111746d = new C41491a();

        public C41491a() {
            super(0);
        }

        public Object invoke() {
            return C66785b.f191882e.mo90662O5();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment$b */
    public static final class C41492b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C41492b f111747d = new C41492b();

        public C41492b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment$c */
    public static final class C41493c extends C87413o implements C32226l<C45405a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderBaseConversationFragment f111748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41493c(FinderBaseConversationFragment finderBaseConversationFragment) {
            super(1);
            this.f111748d = finderBaseConversationFragment;
        }

        public Object invoke(Object obj) {
            C45405a aVar = (C45405a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            this.f111748d.f111744y = aVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment$d */
    public static final class C41494d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderBaseConversationFragment f111749d;

        public C41494d(FinderBaseConversationFragment finderBaseConversationFragment) {
            this.f111749d = finderBaseConversationFragment;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52528f fVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                FinderBaseConversationFragment finderBaseConversationFragment = this.f111749d;
                int i2 = FinderBaseConversationFragment.f111740A;
                RecyclerView.LayoutManager layoutManager = finderBaseConversationFragment.mo64585i0().f150477a.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int C = ((LinearLayoutManager) layoutManager).mo16957C();
                RecyclerView.LayoutManager layoutManager2 = finderBaseConversationFragment.mo64585i0().f150477a.getLayoutManager();
                C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int E = ((LinearLayoutManager) layoutManager2).mo16959E();
                Log.m105924i("Finder.FinderConversationParentUI", "reportChatExpose:" + C + "--" + E);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (C >= 0 && E >= C) {
                    if (C <= E) {
                        while (true) {
                            String str = null;
                            if (finderBaseConversationFragment.mo62821V() instanceof C52542k) {
                                BasePrivateMsgConvListFragment.C40273a V = finderBaseConversationFragment.mo62821V();
                                C87412m.m108592e(V, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
                                C52542k kVar = (C52542k) V;
                                fVar = (C < 0 || C >= kVar.mo73487Q5()) ? kVar.f146725f.get(C - kVar.mo73487Q5()) : kVar.mo73488R5(C);
                            } else {
                                List F4 = finderBaseConversationFragment.mo62821V().mo62831F4();
                                fVar = F4 != null ? (C52528f) F4.get(C) : null;
                            }
                            if (fVar != null) {
                                str = fVar.field_sessionId;
                            }
                            if (str == null) {
                                str = "";
                            }
                            if (!Util.isNullOrNil(str)) {
                                linkedHashSet.add(str);
                            }
                            if (C == E) {
                                break;
                            }
                            C++;
                        }
                    }
                    Log.m105924i("Finder.FinderConversationParentUI", "pageSet" + linkedHashSet + " size:" + linkedHashSet.size());
                    C45431e2 e2Var = C58363h.f167139c;
                    if (e2Var.f122957a) {
                        e2Var.mo70927e(linkedHashSet);
                    } else {
                        C58363h.f167138b.mo70927e(linkedHashSet);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment$e */
    public static final class C41495e extends C87413o implements C32224a<C53517h> {

        /* renamed from: d */
        public final /* synthetic */ FinderBaseConversationFragment f111750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41495e(FinderBaseConversationFragment finderBaseConversationFragment) {
            super(0);
            this.f111750d = finderBaseConversationFragment;
        }

        public Object invoke() {
            FinderBaseConversationFragment finderBaseConversationFragment = this.f111750d;
            int i = FinderBaseConversationFragment.f111740A;
            View view = finderBaseConversationFragment.f165437h;
            C87412m.m108591d(view);
            return C53517h.m60070a(view.findViewById(C0966R.C0970id.mc5));
        }
    }

    /* renamed from: T */
    public BasePrivateMsgConvListFragment.C40273a<C52528f> mo62819T() {
        Bundle arguments = getArguments();
        int i = -1;
        this.f111742w = arguments != null ? arguments.getInt("KEY_TALKER_TYPE", -1) : -1;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("KEY_TALKER_SCENE", -1);
        }
        this.f111743x = i;
        C52530g gVar = new C52530g();
        gVar.f146730n = new C52543l(C41492b.f111747d);
        gVar.f146729j = new C52538i(this, new C41493c(this));
        gVar.f146728i = this.f111743x;
        gVar.f146727h = this.f111742w;
        return gVar;
    }

    /* renamed from: U */
    public List<MStorage> mo62820U() {
        Class cls = FinderCommonFeatureService.class;
        return C64197v.m75537f(((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76850gW(), ((FinderCommonFeatureService) C86312j.m106911c(cls)).Kx0(), ((FinderCommonFeatureService) C86312j.m106911c(cls)).Jx0());
    }

    /* renamed from: Y */
    public BasePrivateMsgConvListFragment.C40274b<C52528f> mo62823Y() {
        Bundle arguments = getArguments();
        int i = -1;
        this.f111742w = arguments != null ? arguments.getInt("KEY_TALKER_TYPE", -1) : -1;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("KEY_TALKER_SCENE", -1);
        }
        this.f111743x = i;
        return new C52541j((String) ((C36570n) this.f111741v).getValue(), this.f111742w, this.f111743x);
    }

    /* renamed from: a0 */
    public View mo62825a0() {
        TextView textView = mo64585i0().f150478b;
        C87412m.m108593f(textView, "uiBinding.emptyTip");
        return textView;
    }

    /* renamed from: d0 */
    public int mo62826d0() {
        return 15;
    }

    /* renamed from: e0 */
    public View mo62827e0() {
        MMProcessBar mMProcessBar = mo64585i0().f150479c;
        C87412m.m108593f(mMProcessBar, "uiBinding.loadingIcon");
        return mMProcessBar;
    }

    /* renamed from: f0 */
    public RecyclerView mo62828f0() {
        RecyclerView recyclerView = mo64585i0().f150477a;
        C87412m.m108593f(recyclerView, "uiBinding.conversationRecyclerView");
        recyclerView.mo17043c(new C41494d(this));
        return recyclerView;
    }

    /* renamed from: g0 */
    public RefreshLoadMoreLayout mo62829g0() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = mo64585i0().f150480d;
        C87412m.m108593f(refreshLoadMoreLayout, "uiBinding.rlLayout");
        return refreshLoadMoreLayout;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_5;
    }

    /* renamed from: h0 */
    public void mo62830h0(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111742w);
        sb.append('-');
        sb.append(this.f111743x);
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "sql");
        new C65326e("enterFinderConversationPage", C112551y.m153815o(sb4, ',', ';', false, 4, (Object) null), j, "", 0).mo89421a();
    }

    /* renamed from: i0 */
    public final C53517h mo64585i0() {
        return (C53517h) ((C36570n) this.f111745z).getValue();
    }

    /* renamed from: j0 */
    public void mo64586j0() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onDestroy() {
        C13442s8 f;
        super.onDestroy();
        C58363h hVar = C58363h.f167137a;
        Context context = getContext();
        C49712hj1 hj12 = null;
        if (!(context == null || (f = C13442s8.f38060Q0.mo12873f(context)) == null)) {
            hj12 = f.mo12861q3();
        }
        C45431e2 e2Var = C58363h.f167139c;
        if (e2Var.f122957a) {
            e2Var.mo70926d(hj12);
        } else {
            C58363h.f167138b.mo70926d(hj12);
        }
    }

    public void onResume() {
        super.onResume();
        C45405a aVar = this.f111744y;
        if (aVar != null) {
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(aVar, 200);
            this.f111744y = null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        int i = this.f111743x;
        if (i == 1) {
            C115669n.INSTANCE.mo175913w(1473, 11, 1);
        } else if (i == 2) {
            int i2 = this.f111742w;
            if (i2 == 1) {
                C115669n.INSTANCE.mo175913w(1473, 12, 1);
            } else if (i2 == 2) {
                C115669n.INSTANCE.mo175913w(1473, 13, 1);
            }
        }
    }
}
