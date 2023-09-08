package mf1;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import c30.C104289g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderCnyEggCardEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.component.CNYFeedBariableButtonJumperObserver$createListener$1;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jq3.C60905o;
import l31.C61212e;
import o40.C61926c;
import p166hy.C8827c0;
import pf1.C11906j;
import pf1.C11918p;
import pf1.C11920q;
import q31.C118148a;
import rf1.C12982a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C52086y9;
import te3.C52233z9;
import te3.C52275zk;
import te3.uc4;

/* renamed from: mf1.i */
public final class C10824i extends C12982a {

    /* renamed from: o */
    public IListener<FinderCnyEggCardEvent> f32332o;

    /* renamed from: mf1.i$a */
    public static final class C10825a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ long f32333a;

        /* renamed from: b */
        public final /* synthetic */ boolean f32334b;

        /* renamed from: c */
        public final /* synthetic */ Object f32335c;

        public C10825a(long j, boolean z, Object obj) {
            this.f32333a = j;
            this.f32334b = z;
            this.f32335c = obj;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[3];
            lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(this.f32333a));
            lVarArr[1] = new C13604l("get_red_button_type", Integer.valueOf(this.f32334b ? 2 : 1));
            lVarArr[2] = new C13604l("report_extra_data", this.f32335c);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        C104289g gVar;
        FinderJumpInfo finderJumpInfo;
        Class cls = C61212e.class;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Object obj = null;
        if (this.f32332o == null) {
            Context context = view.getContext();
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            CNYFeedBariableButtonJumperObserver$createListener$1 cNYFeedBariableButtonJumperObserver$createListener$1 = mMActivity != null ? new CNYFeedBariableButtonJumperObserver$createListener$1(mMActivity, this) : null;
            this.f32332o = cNYFeedBariableButtonJumperObserver$createListener$1;
            if (cNYFeedBariableButtonJumperObserver$createListener$1 != null) {
                cNYFeedBariableButtonJumperObserver$createListener$1.alive();
            }
        }
        mo11049x(qVar, view);
        C11920q qVar2 = this.f37015d;
        boolean z = false;
        if (!(qVar2 == null || (finderJumpInfo = qVar2.f34827a) == null || finderJumpInfo.red_packet_type != 1)) {
            z = true;
        }
        if (z) {
            boolean z2 = !Util.isNullOrNil(((C8827c0) C86312j.m106911c(C8827c0.class)).mo9660qh(qVar.f34827a.group_key));
            C11920q qVar3 = this.f37015d;
            C11918p pVar = qVar3 != null ? qVar3.f34832f : null;
            C11906j jVar = pVar instanceof C11906j ? (C11906j) pVar : null;
            if (!(jVar == null || (gVar = jVar.f34783f) == null)) {
                obj = gVar.opt("report_extra_data");
            }
            if (obj == null) {
                obj = "";
            }
            BaseFinderFeed baseFinderFeed2 = qVar.f34830d;
            long itemId = baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0;
            ((C61212e) C86312j.m106911c(cls)).o30(view, "get_red_button");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, 40, 25496);
            ((C61212e) C86312j.m106911c(cls)).E60(view, new C10825a(itemId, z2, obj));
        }
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        return true;
    }

    /* renamed from: j */
    public void mo11048j(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        mo12510f(250, view, z, aVar);
        mo12508d(false, z);
    }

    /* renamed from: u */
    public void mo11045u(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        C11920q qVar = this.f37015d;
        if (qVar != null) {
            mo11049x(qVar, view);
        }
        mo12509e(500, view, z, aVar);
        mo12508d(true, z);
    }

    /* renamed from: x */
    public final void mo11049x(C11920q qVar, View view) {
        T t;
        C52275zk zkVar;
        boolean z;
        T t2;
        boolean z2;
        uc4 uc4 = this.f37017f;
        TextPaint textPaint = null;
        if (uc4 == null) {
            LinkedList<uc4> linkedList = qVar.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((uc4) t2).f142762h == 13) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            uc4 = (uc4) t2;
        }
        C52233z9 z9Var = uc4 != null ? uc4.f142754K : null;
        if (z9Var != null) {
            int i = Util.isNullOrNil(((C8827c0) C86312j.m106911c(C8827c0.class)).mo9660qh(qVar.f34827a.group_key)) ^ true ? 2 : 1;
            LinkedList<C52086y9> linkedList2 = z9Var.f145768e;
            C87412m.m108593f(linkedList2, "bariableButtonStyle.braiable_button_list");
            Iterator<T> it4 = linkedList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    t = null;
                    break;
                }
                t = it4.next();
                if (((C52086y9) t).f145185d == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C52086y9 y9Var = (C52086y9) t;
            if (y9Var != null && (zkVar = y9Var.f145186e) != null) {
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.gr4);
                View findViewById = view.findViewById(C0966R.C0970id.f358076gr3);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(Color.parseColor(zkVar.f146048f));
                }
                if (textView != null) {
                    textView.setText(zkVar.f146046d);
                }
                if (textView != null) {
                    textView.setTextColor(Color.parseColor(zkVar.f146047e));
                }
                if (textView != null) {
                    textPaint = textView.getPaint();
                }
                C85875k4.m106189j0(textPaint, 0.8f);
            }
        }
    }
}
