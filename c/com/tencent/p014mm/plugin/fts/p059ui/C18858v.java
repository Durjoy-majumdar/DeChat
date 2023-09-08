package com.tencent.p014mm.plugin.fts.p059ui;

import a11.C39479c;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import nv1.C61907e;
import pv1.C22019b;
import xv1.C102744d;

/* renamed from: com.tencent.mm.plugin.fts.ui.v */
public class C18858v extends C18852m implements C61173o {

    /* renamed from: n */
    public String f52864n;

    /* renamed from: o */
    public C44661m1 f52865o;

    /* renamed from: p */
    public MMHandler f52866p = new MMHandler();

    /* renamed from: q */
    public C99664b f52867q;

    /* renamed from: r */
    public C10656l f52868r;

    public C18858v(C18854q qVar, String str) {
        super(qVar);
        this.f52864n = str;
        if (C72996z1.m85820U5(str)) {
            this.f52865o = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        }
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        int i = lVar.f32074c;
        if (i == -3 || i == -2 || i == -1) {
            mo23833n(0);
            notifyDataSetChanged();
            mo23831k(this.f52857g, true);
        } else if (i == 0) {
            this.f52868r = lVar;
            mo23833n(lVar.f32076e.size());
            notifyDataSetChanged();
            mo23831k(this.f52857g, true);
        }
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        C102744d dVar = new C102744d(i);
        dVar.f303426p = this.f52868r.f32076e.get(i);
        dVar.f62327e = this.f52868r.f32075d;
        dVar.f62329g = -14;
        dVar.f303378x = this.f52865o;
        dVar.f62331i = i;
        dVar.f62328f = 6;
        if (i == this.f52857g - 1) {
            dVar.f62326d = true;
        }
        return dVar;
    }

    /* renamed from: f */
    public void mo23813f() {
        Class cls = C99260q.class;
        mo23822b();
        if (this.f52867q != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(this.f52867q);
        }
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52858h;
        kVar.f224469d = this.f52864n;
        kVar.f224477l = C61907e.f176012d;
        kVar.f224475j.add("create_talker_message​");
        kVar.f224478m = this;
        kVar.f224479n = this.f52866p;
        kVar.f224467b = 3;
        this.f52867q = ((C99260q) C86312j.m106911c(cls)).Xn0(3, kVar);
        Log.m105925i("MicroMSsg.FTS.FTSChattingConvAdapter", "do search %s", this.f52858h);
    }

    /* renamed from: g */
    public void mo23815g() {
        super.mo23815g();
        if (this.f52867q != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f52867q);
        }
    }

    /* renamed from: j */
    public boolean mo23814j(View view, C22019b bVar, boolean z) {
        return false;
    }
}
