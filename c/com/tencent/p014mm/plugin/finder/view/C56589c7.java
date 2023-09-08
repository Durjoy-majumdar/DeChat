package com.tencent.p014mm.plugin.finder.view;

import ak1.C0073g0;
import ak1.C54108o;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import cj1.C0581o5;
import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.ArrayList;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76891l0;
import ok1.C62042e;
import org.json.JSONObject;
import p206nj.C117627q;
import qj1.C12322e5;
import rx3.C13598b0;
import te3.C50533nf0;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.view.c7 */
public final class C56589c7 implements C76891l0 {

    /* renamed from: a */
    public final /* synthetic */ C45795b f162225a;

    /* renamed from: b */
    public final /* synthetic */ C0581o5 f162226b;

    /* renamed from: c */
    public final /* synthetic */ boolean f162227c;

    /* renamed from: d */
    public final /* synthetic */ boolean f162228d;

    /* renamed from: e */
    public final /* synthetic */ String f162229e;

    public C56589c7(C45795b bVar, C0581o5 o5Var, boolean z, boolean z2, String str) {
        this.f162225a = bVar;
        this.f162226b = o5Var;
        this.f162227c = z;
        this.f162228d = z2;
        this.f162229e = str;
    }

    /* renamed from: a */
    public final void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Class cls = C54991o.class;
        C56608f7 f7Var = C56608f7.f162301a;
        C45795b bVar = this.f162225a;
        C87412m.m108593f(e0Var, "menu");
        C56608f7.m65279a(f7Var, bVar, e0Var);
        f7Var.mo79955d(e0Var, this.f162226b);
        if (this.f162227c) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C0073g0 g0Var = C0073g0.LIVE_DESC;
            JSONObject jSONObject = new JSONObject();
            C0581o5 o5Var = this.f162226b;
            jSONObject.put("type", 4);
            jSONObject.put(FileReaderHelper.DOC_EXT, C117627q.m165909b(Util.nullAsNil(o5Var.getContent()), "utf-8"));
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        if (e0Var.findItem(154) == null && (C62042e.f176370a.mo87073d1(this.f162225a) || ((C54991o) this.f162225a.mo71262a(cls)).f154190D)) {
            f7Var.mo79956e(e0Var);
        }
        String e = this.f162226b.mo571e();
        C66785b bVar2 = C66785b.f191882e;
        if (!C87412m.m108589b(e, bVar2.mo90662O5()) && e0Var.findItem(157) == null) {
            C32444a aVar = C32444a.f86121a;
            if (C32444a.f86103U.mo60266n().intValue() == 1) {
                e0Var.mo107144g(157, MMApplicationContext.getContext().getString(C0966R.string.e9e), C0966R.raw.icons_filled_tickle);
            }
        }
        if (!C87412m.m108589b(this.f162226b.mo571e(), bVar2.mo90662O5()) && this.f162228d) {
            e0Var.mo107144g(164, MMApplicationContext.getContext().getString(C0966R.string.ebs), C0966R.raw.icons_filled_me);
        }
        String e2 = this.f162226b.mo571e();
        String s = C75592q0.m90789s();
        Log.m105924i("LiveCommentPopupWindowCreater", "sender username = " + e2 + ", my username = " + s);
        if (!C87412m.m108589b(e2, s)) {
            C50533nf0 nf02 = ((C54979h1) this.f162225a.mo71262a(C54979h1.class)).f154130W;
            boolean z = false;
            if (nf02 != null && nf02.f138581f == 1) {
                z = true;
            }
            if (z) {
                e0Var.mo107144g(169, MMApplicationContext.getContext().getString(C0966R.string.f8146oe), C0966R.raw.flash_sale);
            }
        }
        if (!C87412m.m108589b(this.f162226b.mo571e(), bVar2.mo90662O5()) && !C87412m.m108589b(this.f162226b.mo571e(), C75592q0.m90789s()) && e0Var.findItem(158) == null && e0Var.findItem(168) == null && (C62042e.f176370a.mo87027N0() || (((C54991o) this.f162225a.mo71262a(cls)).f154190D && !f7Var.mo79959h(this.f162226b)))) {
            String str = "";
            if (!C87412m.m108589b(((C54991o) this.f162225a.mo71262a(cls)).f154262U0.get(this.f162229e), Boolean.TRUE)) {
                C45795b bVar3 = this.f162225a;
                String str2 = this.f162229e;
                if (str2 == null) {
                    str2 = str;
                }
                f7Var.mo79958g(bVar3, e0Var, str2);
            }
            C45795b bVar4 = this.f162225a;
            String str3 = this.f162229e;
            if (str3 != null) {
                str = str3;
            }
            f7Var.mo79953b(bVar4, e0Var, str);
        }
        if (!C87412m.m108589b(this.f162226b.mo571e(), bVar2.mo90662O5()) && !C87412m.m108589b(this.f162226b.mo571e(), C75592q0.m90789s()) && e0Var.findItem(161) == null && (C62042e.f176370a.mo87027N0() || (((C54991o) this.f162225a.mo71262a(cls)).f154190D && !f7Var.mo79959h(this.f162226b)))) {
            e0Var.mo107144g(161, MMApplicationContext.getContext().getString(C0966R.string.djt), C0966R.raw.icons_filled_black);
        }
        ArrayList<MenuItem> arrayList = (ArrayList) e0Var.f224704d;
        if (arrayList.size() > 4) {
            for (MenuItem menuItem : arrayList) {
                C12322e5.C12334g gVar = C12322e5.f35497W;
                if (C12322e5.f35502x0.contains(Integer.valueOf(menuItem.getItemId()))) {
                    C76875f0 f0Var = menuItem instanceof C76875f0 ? (C76875f0) menuItem : null;
                    if (f0Var != null) {
                        f0Var.f224708B = true;
                    }
                }
            }
        }
    }
}
