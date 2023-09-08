package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.ui.a */
public class C18593a extends BaseAdapter {

    /* renamed from: d */
    public List<CardInfo> f51906d = new ArrayList();

    /* renamed from: e */
    public HashMap<String, Integer> f51907e = new HashMap<>();

    /* renamed from: f */
    public Context f51908f;

    /* renamed from: com.tencent.mm.plugin.card.ui.a$a */
    public class C18594a {

        /* renamed from: a */
        public RelativeLayout f51909a;

        /* renamed from: b */
        public ImageView f51910b;

        /* renamed from: c */
        public TextView f51911c;

        /* renamed from: d */
        public TextView f51912d;

        /* renamed from: e */
        public ImageView f51913e;

        /* renamed from: f */
        public TextView f51914f;

        /* renamed from: g */
        public TextView f51915g;

        /* renamed from: h */
        public TextView f51916h;

        /* renamed from: i */
        public TextView f51917i;

        public C18594a(C18593a aVar) {
        }
    }

    public C18593a(Context context) {
        this.f51908f = context;
    }

    public int getCount() {
        return ((ArrayList) this.f51906d).size();
    }

    public Object getItem(int i) {
        return (CardInfo) ((ArrayList) this.f51906d).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C18594a aVar;
        CardInfo cardInfo = (CardInfo) ((ArrayList) this.f51906d).get(i);
        if (view == null) {
            view = View.inflate(this.f51908f, C0966R.C0971layout.f6684lp, (ViewGroup) null);
            aVar = new C18594a(this);
            aVar.f51909a = (RelativeLayout) view.findViewById(C0966R.C0970id.atl);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.axm);
            aVar.f51910b = (ImageView) view.findViewById(C0966R.C0970id.av8);
            aVar.f51911c = (TextView) view.findViewById(C0966R.C0970id.asp);
            aVar.f51912d = (TextView) view.findViewById(C0966R.C0970id.aw6);
            aVar.f51916h = (TextView) view.findViewById(C0966R.C0970id.k_c);
            aVar.f51917i = (TextView) view.findViewById(C0966R.C0970id.aw7);
            aVar.f51913e = (ImageView) view.findViewById(C0966R.C0970id.avz);
            aVar.f51914f = (TextView) view.findViewById(C0966R.C0970id.atn);
            aVar.f51915g = (TextView) view.findViewById(C0966R.C0970id.ax8);
            view.setTag(aVar);
        } else {
            aVar = (C18594a) view.getTag();
        }
        if (cardInfo.mo23266N0()) {
            aVar.f51910b.setVisibility(0);
            aVar.f51912d.setVisibility(0);
            aVar.f51916h.setVisibility(0);
            aVar.f51917i.setVisibility(8);
            aVar.f51911c.setVisibility(0);
            aVar.f51911c.setText(cardInfo.mo23264L0().f64142j);
            if (!cardInfo.mo23271R1()) {
                aVar.f51912d.setText(cardInfo.mo23264L0().f64143n);
            } else if (cardInfo.mo23264L0().f64149s != null && cardInfo.mo23264L0().f64149s.size() == 1) {
                aVar.f51912d.setText(cardInfo.mo23264L0().f64149s.get(0).f63884d);
            } else if (cardInfo.mo23264L0().f64149s != null && cardInfo.mo23264L0().f64149s.size() == 2) {
                aVar.f51912d.setText(cardInfo.mo23264L0().f64149s.get(0).f63884d + "-" + cardInfo.mo23264L0().f64149s.get(1).f63884d);
            }
            if (cardInfo.mo23264L0().f64126U == 1) {
                aVar.f51913e.setVisibility(0);
            } else {
                aVar.f51913e.setVisibility(8);
            }
            long j = cardInfo.field_begin_time;
            long j2 = cardInfo.field_end_time;
            if (j2 > 0 && j > 0) {
                TextView textView = aVar.f51916h;
                Context context = this.f51908f;
                textView.setText(context.getString(C0966R.string.b2_, new Object[]{C22945n.m27006f(j) + "  -  " + C22945n.m27006f(cardInfo.field_end_time)}));
                aVar.f51916h.setVisibility(0);
            } else if (j2 > 0) {
                aVar.f51916h.setText(this.f51908f.getString(C0966R.string.b29, new Object[]{C22945n.m27006f(j2)}));
                aVar.f51916h.setVisibility(0);
            } else {
                aVar.f51916h.setText("");
                aVar.f51916h.setVisibility(8);
            }
            C53263p.m59701b(aVar.f51910b, cardInfo.mo23264L0().f64137e, this.f51908f.getResources().getDimensionPixelSize(C0966R.dimen.f4227wv), C0966R.C0969drawable.f357296c91, true);
            if (cardInfo.mo23264L0().f64122S == 1) {
                aVar.f51910b.setAlpha(255);
                aVar.f51915g.setVisibility(8);
                aVar.f51912d.setTextColor(this.f51908f.getResources().getColor(C0966R.color.f3200iq));
                aVar.f51911c.setTextColor(this.f51908f.getResources().getColor(C0966R.color.f3200iq));
                aVar.f51916h.setTextColor(this.f51908f.getResources().getColor(C0966R.color.f3541x6));
            } else {
                aVar.f51915g.setText(cardInfo.mo23264L0().f64124T);
                aVar.f51910b.setAlpha(90);
                aVar.f51915g.setVisibility(0);
                aVar.f51912d.setTextColor(this.f51908f.getResources().getColor(C0966R.color.f3541x6));
                aVar.f51911c.setTextColor(this.f51908f.getResources().getColor(C0966R.color.f3541x6));
                aVar.f51916h.setTextColor(this.f51908f.getResources().getColor(C0966R.color.f3541x6));
            }
            int intValue = this.f51907e.get(cardInfo.field_card_tp_id).intValue();
            if (intValue == 1) {
                aVar.f51914f.setText("");
                aVar.f51914f.setVisibility(8);
            } else {
                TextView textView2 = aVar.f51914f;
                textView2.setText("x" + intValue);
                aVar.f51914f.setVisibility(0);
            }
        } else {
            aVar.f51910b.setVisibility(8);
            aVar.f51912d.setVisibility(8);
            aVar.f51911c.setVisibility(8);
            aVar.f51916h.setVisibility(8);
            aVar.f51915g.setVisibility(8);
            aVar.f51914f.setVisibility(8);
            aVar.f51917i.setVisibility(0);
            aVar.f51909a.setBackgroundColor(this.f51908f.getResources().getColor(C0966R.color.f3211ja));
            aVar.f51917i.setText(this.f51908f.getResources().getString(C0966R.string.b06));
        }
        return view;
    }
}
