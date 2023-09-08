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
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import fy3.C32224a;
import fz2.C45866b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import p192l4.C10462b;
import ry2.C48177a;
import ry2.C48186f;
import ry2.C48187g;
import sx3.C26236u;
import uy2.C52657a;
import uy2.C52658b;
import uy2.C52665g;
import zp3.C23555k;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusConversationFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Luy2/a;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment */
public final class TextStatusConversationFragment extends BasePrivateMsgConvListFragment<C52657a> {

    /* renamed from: v */
    public C45866b f116872v;

    /* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusConversationFragment$a */
    public static final class C43187a extends C23555k.C23558c {
        /* renamed from: c */
        public long mo10183c(RecyclerView.C16631z zVar) {
            long j;
            View view;
            Context context;
            if (zVar == null || (view = zVar.f44854d) == null || (context = view.getContext()) == null) {
                j = -1;
            } else {
                C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C52665g.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tusReportUIC::class.java)");
                j = (long) ((C52665g) a).f147058e;
            }
            return super.mo10183c(zVar) + j;
        }

        /* renamed from: d */
        public boolean mo777d() {
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: uy2.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo778e(android.view.View r5, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.C16631z> r6) {
            /*
                r4 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.String r5 = "exposedHolders"
                gy3.C87412m.m108594g(r6, r5)
                java.util.Iterator r5 = r6.iterator()
            L_0x000e:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x007d
                java.lang.Object r6 = r5.next()
                androidx.recyclerview.widget.RecyclerView$z r6 = (androidx.recyclerview.widget.RecyclerView.C16631z) r6
                boolean r0 = r6 instanceof jq3.C60905o
                r1 = 0
                if (r0 == 0) goto L_0x0022
                jq3.o r6 = (jq3.C60905o) r6
                goto L_0x0023
            L_0x0022:
                r6 = r1
            L_0x0023:
                if (r6 == 0) goto L_0x000e
                java.lang.Object r0 = r6.f173503E
                boolean r2 = r0 instanceof uy2.C52657a
                if (r2 == 0) goto L_0x002e
                r1 = r0
                uy2.a r1 = (uy2.C52657a) r1
            L_0x002e:
                if (r1 == 0) goto L_0x000e
                uy2.g$a r0 = uy2.C52665g.f147055f
                android.content.Context r6 = r6.f173499A
                java.lang.String r2 = "holder.context"
                gy3.C87412m.m108593f(r6, r2)
                bl3.r r2 = bl3.C39818r.f106831a
                bl3.r$a r6 = r2.mo62443b(r6)
                java.lang.Class<uy2.g> r2 = uy2.C52665g.class
                androidx.lifecycle.i0 r6 = r6.mo75002a(r2)
                java.lang.String r2 = "UICProvider.of(context).…tusReportUIC::class.java)"
                gy3.C87412m.m108593f(r6, r2)
                uy2.g r6 = (uy2.C52665g) r6
                boolean r2 = vy2.C53042b.m59369a(r1)
                if (r2 == 0) goto L_0x0053
                goto L_0x000e
            L_0x0053:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = uy2.C52665g.f147056g
                r2.append(r3)
                int r6 = r6.f147058e
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                java.lang.String r2 = r1.f147042S0
                boolean r2 = gy3.C87412m.m108589b(r2, r6)
                if (r2 != 0) goto L_0x000e
                r1.f147042S0 = r6
                java.lang.String r6 = r1.field_sessionId
                java.lang.String r1 = "conv.field_sessionId"
                gy3.C87412m.m108593f(r6, r1)
                r1 = 52
                r0.mo73606c(r6, r1)
                goto L_0x000e
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.conversation.p805ui.TextStatusConversationFragment.C43187a.mo778e(android.view.View, java.util.List):void");
        }
    }

    /* renamed from: R */
    public void mo62817R() {
    }

    /* renamed from: T */
    public BasePrivateMsgConvListFragment.C40273a<C52657a> mo62819T() {
        C48177a aVar = new C48177a();
        aVar.f129128g = new C48186f(this);
        aVar.f129129h = new C48187g(this, (C32224a) null, 2, (C8480h) null);
        return aVar;
    }

    /* renamed from: U */
    public List<MStorage> mo62820U() {
        return C26236u.m33719b(C39674e.f106452d.mo62239E0());
    }

    /* renamed from: Y */
    public BasePrivateMsgConvListFragment.C40274b<C52657a> mo62823Y() {
        return new C52658b(0, 0, 3, (C8480h) null);
    }

    /* renamed from: a0 */
    public View mo62825a0() {
        C45866b bVar = this.f116872v;
        if (bVar != null) {
            TextView textView = bVar.f123808b;
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
        C45866b bVar = this.f116872v;
        if (bVar != null) {
            MMProcessBar mMProcessBar = bVar.f123809c;
            C87412m.m108593f(mMProcessBar, "uiBinding.loadingIcon");
            return mMProcessBar;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: f0 */
    public RecyclerView mo62828f0() {
        C45866b bVar = this.f116872v;
        if (bVar != null) {
            RecyclerView recyclerView = bVar.f123807a;
            C87412m.m108593f(recyclerView, "uiBinding.conversationRecyclerView");
            return recyclerView;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: g0 */
    public RefreshLoadMoreLayout mo62829g0() {
        C45866b bVar = this.f116872v;
        if (bVar != null) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = bVar.f123810d;
            C87412m.m108593f(refreshLoadMoreLayout, "uiBinding.rlLayout");
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8z;
    }

    public void onDestroy() {
        super.onDestroy();
        C39674e eVar = C39674e.f106452d;
        eVar.mo62243O().remove(mo62821V());
        eVar.mo62239E0().remove(mo62821V());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.mhr);
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
                        this.f116872v = new C45866b(touchableLayout, recyclerView, textView, mMProcessBar, refreshLoadMoreLayout, touchableLayout);
                        super.onViewCreated(view, bundle);
                        C39674e eVar = C39674e.f106452d;
                        eVar.mo62243O().add(mo62821V());
                        eVar.mo62239E0().add(mo62821V());
                        C23564m.m28137g(mo62828f0(), new C43187a());
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        Log.m105918d("MicroMsg.TextStatus.TextStatusConversationFragment", "setUserVisibleHint() called with: isVisibleToUser = " + z);
    }
}
