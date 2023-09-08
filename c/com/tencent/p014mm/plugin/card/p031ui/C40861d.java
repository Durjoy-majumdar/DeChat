package com.tencent.p014mm.plugin.card.p031ui;

import com.tencent.p014mm.plugin.card.model.CardInfo;
import dz0.C20483c;
import dz0.C45497b;
import hz0.C46153l0;

/* renamed from: com.tencent.mm.plugin.card.ui.d */
public class C40861d implements C45497b {

    /* renamed from: a */
    public C40859c f109869a;

    public C40861d(C40859c cVar) {
        this.f109869a = cVar;
    }

    public C20483c getItem(int i) {
        C40859c cVar = this.f109869a;
        if (cVar != null) {
            return (CardInfo) cVar.getItem(i);
        }
        return null;
    }

    public void onCreate() {
        if (this.f109869a != null) {
            C46153l0.Gx0().add(this.f109869a);
        }
    }

    public void onDestroy() {
        if (this.f109869a != null) {
            C46153l0.Gx0().remove(this.f109869a);
            this.f109869a.mo63824s();
            this.f109869a = null;
        }
    }

    public void onNotify() {
        C40859c cVar = this.f109869a;
        if (cVar != null) {
            cVar.mo7991f();
        }
    }
}
