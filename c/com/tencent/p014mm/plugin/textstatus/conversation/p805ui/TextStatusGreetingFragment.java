package com.tencent.p014mm.plugin.textstatus.conversation.p805ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import fy3.C32224a;
import fz2.C45868d;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import kotlin.Metadata;
import p192l4.C10462b;
import ry2.C48189h;
import ry2.C48196n;
import ry2.C48197o;
import rz2.C48203e;
import sx3.C26236u;
import uy2.C52659d;
import uy2.C52660e;
import uy2.C52665g;
import xy2.C53482m;
import yy2.C53659b;
import zp3.C23555k;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Luy2/e;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingFragment */
public final class TextStatusGreetingFragment extends BasePrivateMsgConvListFragment<C52660e> {

    /* renamed from: v */
    public C45868d f116876v;

    /* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingFragment$a */
    public static final class C43189a extends C23555k.C23558c {
        /* renamed from: d */
        public boolean mo777d() {
            return false;
        }

        /* renamed from: e */
        public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
            C52660e eVar;
            C87412m.m108594g(view, "parent");
            C87412m.m108594g(list, "exposedHolders");
            for (RecyclerView.C16631z zVar : list) {
                C60905o oVar = zVar instanceof C60905o ? (C60905o) zVar : null;
                if (!(oVar == null || (eVar = (C52660e) oVar.f173503E) == null)) {
                    C52665g.C52666a aVar = C52665g.f147055f;
                    Context context = oVar.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C52665g.class);
                    C87412m.m108593f(a, "UICProvider.of(context).…tusReportUIC::class.java)");
                    String str = C52665g.f147056g + ((C52665g) a).f147058e;
                    if (!C87412m.m108589b(eVar.f147048N, str)) {
                        C87412m.m108594g(str, "<set-?>");
                        eVar.f147048N = str;
                        String str2 = eVar.field_session_id;
                        C87412m.m108593f(str2, "item.field_session_id");
                        aVar.mo73606c(str2, 101);
                    }
                }
            }
        }
    }

    /* renamed from: R */
    public void mo62817R() {
        Context context = getContext();
        if (context != null) {
            BasePrivateMsgConvListFragment.C40273a V = mo62821V();
            C48189h hVar = V instanceof C48189h ? (C48189h) V : null;
            if (hVar != null) {
                LinkedList linkedList = new LinkedList();
                int min = Math.min(3, hVar.f129153e.size());
                for (int i = 0; i < min; i++) {
                    linkedList.add(hVar.f129153e.get(i).field_encUsername);
                }
                C53482m.f150398a.mo74151c(context, linkedList, "greeting");
            }
        }
    }

    /* renamed from: T */
    public BasePrivateMsgConvListFragment.C40273a<C52660e> mo62819T() {
        C48189h hVar = new C48189h();
        hVar.f129155g = new C48197o((C32224a) null, 1, (C8480h) null);
        hVar.f129154f = new C48196n((C32224a) null, 1, (C8480h) null);
        return hVar;
    }

    /* renamed from: U */
    public List<MStorage> mo62820U() {
        return C26236u.m33719b(C39674e.f106452d.mo62239E0());
    }

    /* renamed from: Y */
    public BasePrivateMsgConvListFragment.C40274b<C52660e> mo62823Y() {
        return new C52659d(0, 0, 3, (C8480h) null);
    }

    /* renamed from: a0 */
    public View mo62825a0() {
        C45868d dVar = this.f116876v;
        if (dVar != null) {
            TextView textView = dVar.f123818b;
            C87412m.m108593f(textView, "uiBinding.emptyTip");
            return textView;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: d0 */
    public int mo62826d0() {
        return 15;
    }

    /* renamed from: e0 */
    public View mo62827e0() {
        C45868d dVar = this.f116876v;
        if (dVar != null) {
            MMProcessBar mMProcessBar = dVar.f123819c;
            C87412m.m108593f(mMProcessBar, "uiBinding.loadingIcon");
            return mMProcessBar;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: f0 */
    public RecyclerView mo62828f0() {
        C45868d dVar = this.f116876v;
        if (dVar != null) {
            RecyclerView recyclerView = dVar.f123817a;
            C87412m.m108593f(recyclerView, "uiBinding.conversationRecyclerView");
            return recyclerView;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: g0 */
    public RefreshLoadMoreLayout mo62829g0() {
        C45868d dVar = this.f116876v;
        if (dVar != null) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = dVar.f123820d;
            C87412m.m108593f(refreshLoadMoreLayout, "uiBinding.rlLayout");
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9a;
    }

    public void onDestroy() {
        super.onDestroy();
        C53659b O = C39674e.f106452d.mo62243O();
        ISQLiteDatabase iSQLiteDatabase = O.f150725d;
        String[] strArr = C48203e.f129183e;
        iSQLiteDatabase.execSQL("TextStatusLike", "update TextStatusGreetingItem set Read = 1 where Read != 1");
        O.doNotify(C53659b.f150724f, 6, (Object) null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.mhs);
        int i = C0966R.C0970id.btc;
        RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.btc);
        if (recyclerView != null) {
            i = C0966R.C0970id.cj7;
            TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.cj7);
            if (textView != null) {
                i = C0966R.C0970id.f358616g30;
                MMProcessBar mMProcessBar = (MMProcessBar) C10462b.m10395a(findViewById, C0966R.C0970id.f358616g30);
                if (mMProcessBar != null) {
                    i = C0966R.C0970id.ivb;
                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                    if (refreshLoadMoreLayout != null) {
                        TouchableLayout touchableLayout = (TouchableLayout) findViewById;
                        this.f116876v = new C45868d(touchableLayout, recyclerView, textView, mMProcessBar, refreshLoadMoreLayout, touchableLayout);
                        super.onViewCreated(view, bundle);
                        C39674e.f106452d.mo62238D().add(mo62821V());
                        C23564m.m28137g(mo62828f0(), new C43189a());
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
    }
}
