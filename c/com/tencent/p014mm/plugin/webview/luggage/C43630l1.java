package com.tencent.p014mm.plugin.webview.luggage;

import a93.C39517b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import c02.C92331c;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.handoff.model.HandOffURL;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5965o2;
import com.tencent.p014mm.plugin.webview.modeltools.C43741b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import java.util.LinkedList;
import p225rc.C89916g;
import p225rc.g$$f;
import p828wa.C53096b;
import p828wa.C53100e;
import p828wa.C53106j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.l1 */
public class C43630l1 extends C53106j {

    /* renamed from: k */
    public C43741b f117885k;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.l1$a */
    public class C43631a implements g$$f {

        /* renamed from: a */
        public final /* synthetic */ Activity f117886a;

        public C43631a(Activity activity) {
            this.f117886a = activity;
        }

        /* renamed from: b */
        public boolean mo1596b(int i, int i2, Intent intent) {
            return C43630l1.this.f117885k.mo68049a(this.f117886a, i, i2, intent);
        }
    }

    public C43630l1(Activity activity) {
        super(activity);
        LinkedList<Class<? extends C53096b>> linkedList;
        this.f148201a = C39517b.class;
        C53100e eVar = this.f148205e;
        synchronized (C5965o2.class) {
            C5965o2.f22202a = new LinkedList<>();
            C5965o2.m5776b();
            linkedList = C5965o2.f22202a;
        }
        eVar.getClass();
        for (Class<? extends C53096b> add : linkedList) {
            eVar.f148191a.add(add);
        }
        this.f117885k = new C43741b();
        C89916g gVar = C53106j.this.f148206f;
        gVar.f258381c.add(new C43631a(activity));
    }

    /* renamed from: d */
    public void mo67915d() {
        C43658n nVar = (C43658n) mo73788b();
        nVar.getClass();
        Log.m105924i("MicroMsg.LuggageMMWebPage", "onAddInContainer");
        String string = nVar.f148261n.getString("float_ball_key");
        if (!Util.isNullOrNil(string)) {
            nVar.f117916F.mo35648A(5, string);
            nVar.f117917G.mo35809D(5, string);
        } else {
            nVar.f117916F.mo35648A(5, MD5Util.getMD5String(String.format("%s#%s", new Object[]{Long.valueOf(System.currentTimeMillis()), nVar.mo67941t()})));
            nVar.f117917G.mo35809D(5, C56887p.m65610d(((C45696d) C86709a0.m107533q(C45696d.class)).mo70950A9(nVar.mo67941t())));
        }
        nVar.f117916F.mo149079t0("rawUrl", nVar.mo67941t());
        nVar.f117916F.mo67997C0(nVar.mo67941t());
        if (Util.isNullOrNil(nVar.mo67942u())) {
            nVar.f117916F.mo67998q0(nVar.mo67941t());
        }
        nVar.f117955x0 = true;
        if (nVar.f117946p0) {
            nVar.f117916F.mo64003o();
            nVar.f117917G.mo74188E();
        }
        nVar.f117918H = new HandOffURL(Util.nullAsNil(nVar.mo67941t()), Util.nullAsNil(nVar.mo67941t()), "");
        ((C92331c) C86312j.m106911c(C92331c.class)).mo58361Xv(nVar.f117918H);
        nVar.mo67936m();
        mo67916k();
    }

    /* renamed from: k */
    public final void mo67916k() {
        SwipeBackLayout swipeBackLayout;
        Context context = this.f148202b;
        if ((context instanceof MMActivity) && (swipeBackLayout = ((MMActivity) context).getSwipeBackLayout()) != null) {
            if (C53106j.this.f148204d.size() <= 1) {
                swipeBackLayout.setEnableGesture(true);
            } else {
                swipeBackLayout.setEnableGesture(false);
            }
        }
    }
}
