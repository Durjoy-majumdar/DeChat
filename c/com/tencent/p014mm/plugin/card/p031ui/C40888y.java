package com.tencent.p014mm.plugin.card.p031ui;

import com.tencent.p014mm.plugin.card.model.CardInfo;
import dz0.C20483c;
import dz0.C45497b;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.card.ui.y */
public class C40888y implements C45497b {

    /* renamed from: a */
    public C40887x f109961a;

    public C40888y(C40887x xVar) {
        this.f109961a = xVar;
    }

    public C20483c getItem(int i) {
        C40887x xVar = this.f109961a;
        if (xVar != null) {
            return (CardInfo) ((ArrayList) xVar.f109958e).get(i);
        }
        return null;
    }

    public void onCreate() {
        this.f109961a.notifyDataSetChanged();
    }

    public void onDestroy() {
        C40887x xVar = this.f109961a;
        if (xVar != null) {
            ((C40866k0) xVar.f109957d).release();
            xVar.f109957d = null;
            ((ArrayList) xVar.f109958e).clear();
            this.f109961a = null;
        }
    }

    public void onNotify() {
        C40887x xVar = this.f109961a;
        if (xVar != null) {
            xVar.notifyDataSetChanged();
        }
    }
}
