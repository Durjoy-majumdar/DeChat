package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C28266f0;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.q1 */
public class C72417q1 extends BaseAdapter {

    /* renamed from: d */
    public ArrayList<C28266f0> f210661d;

    /* renamed from: e */
    public Context f210662e;

    /* renamed from: f */
    public C28266f0 f210663f = null;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.q1$b */
    public class C72419b {

        /* renamed from: a */
        public TextView f210664a;

        /* renamed from: b */
        public ImageView f210665b;

        public C72419b(C72417q1 q1Var, C72418a aVar) {
        }
    }

    public C72417q1(Context context, ArrayList<C28266f0> arrayList) {
        this.f210662e = context;
        this.f210661d = arrayList;
    }

    /* renamed from: a */
    public C28266f0 getItem(int i) {
        if (this.f210661d == null || getCount() <= i) {
            return null;
        }
        return this.f210661d.get(i);
    }

    public int getCount() {
        ArrayList<C28266f0> arrayList = this.f210661d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C72419b bVar;
        if (view == null) {
            view = View.inflate(this.f210662e, C0966R.C0971layout.cgp, (ViewGroup) null);
            bVar = new C72419b(this, (C72418a) null);
            bVar.f210664a = (TextView) view.findViewById(C0966R.C0970id.knx);
            bVar.f210665b = (ImageView) view.findViewById(C0966R.C0970id.ja4);
            view.setTag(bVar);
        } else {
            bVar = (C72419b) view.getTag();
        }
        C28266f0 a = getItem(i);
        if (a != null) {
            bVar.f210664a.setText(a.field_wallet_name);
            if (a.field_wallet_selected == 1) {
                this.f210663f = a;
                bVar.f210665b.setImageResource(C0966R.raw.radio_on);
            } else {
                bVar.f210665b.setImageResource(C0966R.raw.radio_off);
            }
        }
        return view;
    }
}
