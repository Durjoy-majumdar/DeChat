package rl1;

import a14.C53851a;
import a14.C53872d1;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C0082q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import bl3.C39818r;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import java.util.LinkedList;
import nk1.C11207i;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C48659a31;
import te3.C50334m01;
import tf0.C13883o1;
import wx3.C15601d;
import zj1.C16217b;

/* renamed from: rl1.d */
public final class C13021d {

    /* renamed from: a */
    public final ViewGroup f37084a;

    /* renamed from: b */
    public final C58124b f37085b;

    /* renamed from: c */
    public final C62660c f37086c;

    /* renamed from: d */
    public final String f37087d = "Finder.FinderLiveAnchorLotteryEntranceWidget";

    /* renamed from: e */
    public boolean f37088e = true;

    /* renamed from: f */
    public C13053n f37089f;

    /* renamed from: g */
    public final String f37090g = "anchorlive.bottom.lottery";

    /* renamed from: h */
    public final String f37091h = "anchorlive.bottom.lottery.lottery";

    /* renamed from: i */
    public final String f37092i = "anchorlive.bottom.lottery.redpacket";

    public C13021d(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f37084a = viewGroup;
        this.f37085b = bVar;
        this.f37086c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dqs);
        (findViewById == null ? viewGroup : findViewById).setOnClickListener(new C13015a(this));
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.omj);
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.omh);
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.lottery", findViewById2, (View) null, textView, 8, (Object) null);
    }

    /* renamed from: a */
    public final boolean mo12528a() {
        Class cls = C13022d0.class;
        String str = this.f37087d;
        Log.m105924i(str, "checkVisible:" + ((C13022d0) this.f37086c.mo87696x0(cls)).f37102r);
        return ((C13022d0) this.f37086c.mo87696x0(cls)).f37102r;
    }

    /* renamed from: b */
    public final void mo12529b() {
        Class cls = C55001u.class;
        String str = ((C55001u) this.f37086c.mo87696x0(cls)).f154423t;
        long j = ((C55001u) this.f37086c.mo87696x0(cls)).f154420q.f182392d;
        long j2 = ((C55001u) this.f37086c.mo87696x0(cls)).f154416j;
        String str2 = this.f37087d;
        Log.m105924i(str2, "jumpToCreateLotteryImpl root.context is activity:" + (this.f37084a.getContext() instanceof Activity) + ",liveId:" + j + ",objectId:" + j2 + ",nonceId:" + str);
        if ((this.f37084a.getContext() instanceof Activity) && j != 0 && j2 != 0) {
            if (str.length() > 0) {
                if (((C54991o) this.f37086c.mo87696x0(C54991o.class)).f154190D) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).Gx0(1);
                }
                Context context = this.f37084a.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
                Intent intent = new Intent();
                intent.putExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
                intent.putExtra("KEY_PARAMS_LIVE_ID", j);
                intent.putExtra("KEY_PARAMS_OBJECT_ID", j2);
                intent.putExtra("KEY_PARAMS_NONCE_ID", str);
                C13598b0 b0Var = C13598b0.f38549a;
                o1Var.mo13250CN((Activity) context, intent, 1002);
            }
        }
    }

    /* renamed from: c */
    public final void mo12530c() {
        Class cls = C54108o.class;
        Class cls2 = C13022d0.class;
        boolean z = true;
        if (this.f37085b.getLiveRole() == 1) {
            ((C54108o) C86312j.m106911c(cls)).Mx0(C54067f0.C0051c.CLICK_LOTTERY_ICON, "");
        }
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.LOTTERY, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
        if (!((C13020c0) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C13020c0.class)).f37083e.isEmpty()) {
            C53973z1 z1Var = ((C13022d0) this.f37086c.mo87696x0(cls2)).f37096i;
            if (!(z1Var != null && ((C53851a) z1Var).mo74466a())) {
                ((C13022d0) this.f37086c.mo87696x0(cls2)).mo12538d3(true);
                return;
            }
        }
        C50334m01 value = ((C13022d0) this.f37086c.mo87696x0(cls2)).f37095h.getValue();
        LinkedList<C48659a31> linkedList = value != null ? value.f137739d : null;
        boolean z2 = linkedList == null || linkedList.isEmpty();
        boolean j3 = ((C13022d0) this.f37086c.mo87696x0(cls2)).mo12543j3();
        C0082q qVar = ((C13022d0) this.f37086c.mo87696x0(cls2)).f37098n;
        if (qVar == null || qVar.f506a != 2) {
            z = false;
        }
        String str = this.f37087d;
        Log.m105924i(str, "lotteryEntranceLogic lotteryPanelEmpty:" + z2 + ",running:" + j3 + ",computing:" + z);
        if (!z2 || j3 || z) {
            if (this.f37089f == null) {
                Context context = this.f37084a.getContext();
                C87412m.m108593f(context, "root.context");
                C13053n nVar = new C13053n(context, this.f37086c.mo87684A0(), 0);
                nVar.mo9935a(this.f37086c);
                this.f37089f = nVar;
            }
            C13053n nVar2 = this.f37089f;
            if (nVar2 != null) {
                nVar2.mo12559e(((C13022d0) this.f37086c.mo87696x0(cls2)).f37095h.getValue());
            }
        } else if (this.f37086c.mo82893g0()) {
            C62660c.m73643W0(this.f37086c, "PORTRAIT_ACTION_GOTO_CREATE_LOTTERY", (Object) null, 2, (Object) null);
        } else {
            mo12529b();
        }
    }

    /* renamed from: d */
    public final void mo12531d(int i) {
        Class cls = C54108o.class;
        if ((this.f37084a.getVisibility() != 0 || this.f37088e) && i == 0) {
            this.f37088e = false;
            if (((C54991o) this.f37086c.mo87696x0(C54991o.class)).f154190D) {
                Log.m105924i(this.f37087d, "prepare lottery panel for assistant!");
                C11207i.m11065a(this.f37086c, C53872d1.f151119c, (C53934p0) null, new C13019c(this, (C15601d<? super C13019c>) null), 2, (Object) null);
            }
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.LOTTERY, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
            C16217b.f43438a.mo14751g(this.f37090g);
        }
        this.f37084a.setVisibility(i);
    }
}
