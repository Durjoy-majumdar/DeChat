package com.tencent.p014mm.plugin.finder.view;

import android.content.Intent;
import bl3.C39818r;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60172g4;
import l31.C61212e;
import ls3.C10649f;
import o40.C61926c;
import ob0.C89132b;
import p749xh.C66261f3;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C48924by0;
import te3.C49712hj1;
import te3.C50008jm0;
import te3.C50851pn0;
import te3.C64273c21;
import tf0.C64916p1;

/* renamed from: com.tencent.mm.plugin.finder.view.s7 */
public final class C4174s7 implements C10649f.C10650a {

    /* renamed from: a */
    public final /* synthetic */ int f18423a;

    /* renamed from: b */
    public final /* synthetic */ C4167r7 f18424b;

    /* renamed from: c */
    public final /* synthetic */ FinderObject f18425c;

    /* renamed from: d */
    public final /* synthetic */ long f18426d;

    /* renamed from: e */
    public final /* synthetic */ Intent f18427e;

    public C4174s7(int i, C4167r7 r7Var, FinderObject finderObject, long j, Intent intent) {
        this.f18423a = i;
        this.f18424b = r7Var;
        this.f18425c = finderObject;
        this.f18426d = j;
        this.f18427e = intent;
    }

    /* renamed from: a */
    public void mo5052a() {
    }

    /* renamed from: b */
    public void mo5053b(FinderObject finderObject) {
        C48924by0 by02;
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        ((C64916p1) C86312j.m106911c(C64916p1.class)).j80(finderObject, this.f18423a);
        C4167r7 r7Var = this.f18424b;
        String name = r7Var.f18403a.getClass().getName();
        FinderObject finderObject2 = this.f18425c;
        FinderObject finderObject3 = finderObject2 == null ? finderObject : finderObject2;
        C4167r7 r7Var2 = this.f18424b;
        r7Var.mo5051b(name, finderObject3, r7Var2.f18405c, r7Var2.f18406d, this.f18426d);
        FinderContact finderContact = finderObject.contact;
        int i = 0;
        if (finderContact != null && finderContact.liveStatus == 1) {
            C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62443b(this.f18424b.f18403a).mo62447c(C60172g4.class)).mo12861q3();
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[9];
            lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(finderObject.f164794id));
            C64273c21 c212 = finderObject.liveInfo;
            lVarArr[1] = new C13604l("live_id", c212 != null ? C61926c.m72691p(c212.f182392d) : null);
            lVarArr[2] = new C13604l("comment_scene", Integer.valueOf(this.f18423a));
            FinderContact finderContact2 = finderObject.contact;
            lVarArr[3] = new C13604l("finder_username", finderContact2 != null ? finderContact2.username : null);
            lVarArr[4] = new C13604l("session_buffer", finderObject.sessionBuffer);
            lVarArr[5] = new C13604l("behaviour_session_id", q3.f134671e);
            lVarArr[6] = new C13604l("finder_tab_context_id", q3.f134672f);
            lVarArr[7] = new C13604l("live_enter_status", 1L);
            lVarArr[8] = new C13604l("share_username", "");
            eVar.mo86153W7("finder_feed_living_label_click", (Object) null, C90364q0.m113147f(lVarArr), 26236);
        }
        Intent intent = this.f18427e;
        C64273c21 c213 = finderObject.liveInfo;
        if (c213 != null) {
            i = c213.f182384X;
        }
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", i);
        C64273c21 c214 = finderObject.liveInfo;
        if (c214 != null && (by02 = c214.f182402p0) != null) {
            this.f18427e.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", by02.toByteArray());
        }
    }

    /* renamed from: c */
    public void mo5054c(Object obj) {
        C87412m.m108594g(obj, "bundle");
    }

    /* renamed from: d */
    public void mo5055d(C89132b.C89134c<C50008jm0> cVar) {
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
    }

    /* renamed from: e */
    public void mo5056e(C89132b.C89134c<C50851pn0> cVar) {
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
    }

    public void onFailed(int i) {
    }
}
