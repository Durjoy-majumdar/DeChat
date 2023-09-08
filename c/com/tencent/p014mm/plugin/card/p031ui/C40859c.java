package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C45498d;
import hz0.C46153l0;
import hz0.C46154m;

/* renamed from: com.tencent.mm.plugin.card.ui.c */
public class C40859c extends C6975i1<CardInfo> implements C40868m0 {

    /* renamed from: o */
    public C46154m f109864o;

    /* renamed from: p */
    public int f109865p = 0;

    /* renamed from: q */
    public C45498d f109866q;

    public C40859c(Context context, C46154m mVar) {
        super(context, new CardInfo());
        this.f109864o = mVar;
        mo7997q(true);
        this.f109866q = new C40866k0(context, this);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        CardInfo cardInfo = (CardInfo) obj;
        if (cardInfo == null) {
            cardInfo = new CardInfo();
        }
        if (cursor.isClosed()) {
            Log.m105920e("MicroMsg.CardAdapter", "cursor is closed!");
        } else {
            cardInfo.convertFrom(cursor);
        }
        return cardInfo;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f109866q.mo63834a(i, view, viewGroup, (CardInfo) getItem(i));
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5580b();
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        Log.m105926v("MicroMsg.CardAdapter", "resetCursor");
        mo5580b();
        Cursor jo = C46153l0.Gx0().mo71596jo(this.f109864o);
        if (jo != null) {
            this.f109865p = jo.getCount();
            Log.m105926v("MicroMsg.CardAdapter", "card count:" + this.f109865p);
        }
        mo7998r(jo);
        notifyDataSetChanged();
    }

    /* renamed from: s */
    public void mo63824s() {
        mo5580b();
        this.f109866q.release();
        this.f109866q = null;
    }
}
