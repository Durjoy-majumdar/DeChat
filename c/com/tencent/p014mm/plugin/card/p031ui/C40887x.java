package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import dz0.C45498d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.card.ui.x */
public class C40887x extends BaseAdapter implements C40868m0 {

    /* renamed from: d */
    public C45498d f109957d;

    /* renamed from: e */
    public List<CardInfo> f109958e = new ArrayList();

    /* renamed from: f */
    public List<Boolean> f109959f = new ArrayList();

    /* renamed from: g */
    public Context f109960g;

    public C40887x(Context context) {
        this.f109957d = new C40866k0(context, this);
        this.f109960g = context;
    }

    public int getCount() {
        return ((ArrayList) this.f109958e).size();
    }

    public Object getItem(int i) {
        return (CardInfo) ((ArrayList) this.f109958e).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        CardInfo cardInfo = (CardInfo) ((ArrayList) this.f109958e).get(i);
        cardInfo.getClass();
        View a = ((C40866k0) this.f109957d).mo63834a(i, view, viewGroup, cardInfo);
        ((C40866k0) this.f109957d).mo63835b(a, 8);
        return a;
    }
}
