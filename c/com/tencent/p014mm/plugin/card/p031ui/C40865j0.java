package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C45498d;
import hz0.C46153l0;
import hz0.C46154m;
import java.util.ArrayList;
import vz0.C53043e0;

/* renamed from: com.tencent.mm.plugin.card.ui.j0 */
public class C40865j0 extends C40859c {

    /* renamed from: r */
    public C45498d f109876r;

    /* renamed from: s */
    public C46154m f109877s;

    /* renamed from: t */
    public int f109878t = 0;

    /* renamed from: u */
    public ArrayList<CardInfo> f109879u;

    /* renamed from: v */
    public ArrayList<CardInfo> f109880v;

    /* renamed from: w */
    public ArrayList<CardInfo> f109881w;

    public C40865j0(Context context, C46154m mVar) {
        super(context, mVar);
        this.f109877s = mVar;
        this.f109876r = new C53043e0(context, this);
        this.f109879u = new ArrayList<>();
        this.f109880v = new ArrayList<>();
        this.f109881w = new ArrayList<>();
    }

    public int getCount() {
        return this.f109879u.isEmpty() ? super.getCount() : this.f109879u.size();
    }

    public Object getItem(int i) {
        return this.f109879u.get(i);
    }

    public int getItemViewType(int i) {
        CardInfo cardInfo = this.f109879u.get(i);
        if (cardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE") || cardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE")) {
            return 0;
        }
        return cardInfo.mo23285h2() ? 2 : 1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return ((C53043e0) this.f109876r).mo63834a(i, view, viewGroup, this.f109879u.get(i));
    }

    public int getViewTypeCount() {
        return 3;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5580b();
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        Log.m105926v("MicroMsg.CardTicketAdapter", "resetCursor");
        mo5580b();
        Cursor jo = C46153l0.Gx0().mo71596jo(this.f109877s);
        if (jo != null) {
            this.f109878t = jo.getCount();
            Log.m105926v("MicroMsg.CardTicketAdapter", "card count:" + this.f109878t);
        }
        mo7998r(jo);
        this.f109879u.clear();
        this.f109880v.clear();
        this.f109881w.clear();
        for (int i = 0; i < this.f109878t; i++) {
            CardInfo cardInfo = (CardInfo) super.getItem(i);
            if (cardInfo != null) {
                if (cardInfo.mo23285h2()) {
                    this.f109881w.add(cardInfo);
                } else {
                    this.f109880v.add(cardInfo);
                }
            }
        }
        if (!this.f109880v.isEmpty()) {
            CardInfo cardInfo2 = new CardInfo();
            cardInfo2.field_card_id = "PRIVATE_TICKET_TITLE";
            this.f109879u.add(cardInfo2);
            this.f109879u.addAll(this.f109880v);
        }
        if (!this.f109881w.isEmpty()) {
            CardInfo cardInfo3 = new CardInfo();
            cardInfo3.field_card_id = "PRIVATE_INVOICE_TITLE";
            this.f109879u.add(cardInfo3);
            this.f109879u.addAll(this.f109881w);
        }
        this.f109878t = this.f109879u.size();
        notifyDataSetChanged();
    }

    /* renamed from: s */
    public void mo63824s() {
        mo5580b();
        this.f109876r.release();
        this.f109876r = null;
    }
}
