package com.tencent.p014mm.plugin.product.p087ui;

import af2.C67033e;
import android.content.Context;
import android.text.TextPaint;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bf2.C39765h;
import bf2.C39768m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import ze2.C79322b;

/* renamed from: com.tencent.mm.plugin.product.ui.n */
public class C70116n extends BaseAdapter {

    /* renamed from: d */
    public Context f202398d;

    /* renamed from: e */
    public LinkedList<C39768m> f202399e;

    /* renamed from: f */
    public AdapterView.OnItemClickListener f202400f;

    /* renamed from: g */
    public C67033e f202401g = C79322b.vx0().wx0();

    /* renamed from: com.tencent.mm.plugin.product.ui.n$a */
    public class C70117a {

        /* renamed from: a */
        public TextView f202402a = null;

        /* renamed from: b */
        public MaxGridView f202403b = null;

        /* renamed from: c */
        public C42598o f202404c = null;

        public C70117a(C70116n nVar) {
        }
    }

    public C70116n(Context context) {
        this.f202398d = context;
    }

    public int getCount() {
        LinkedList<C39768m> linkedList = this.f202399e;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return this.f202399e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C70117a aVar;
        Pair pair;
        C39768m mVar = this.f202399e.get(i);
        if (view == null || view.getTag() == null) {
            aVar = new C70117a(this);
            view = View.inflate(this.f202398d, C0966R.C0971layout.bo_, (ViewGroup) null);
            aVar.f202402a = (TextView) view.findViewById(C0966R.C0970id.f358713gn3);
            aVar.f202403b = (MaxGridView) view.findViewById(C0966R.C0970id.f358711gn1);
            aVar.f202404c = new C42598o(this.f202398d);
            view.setTag(aVar);
        } else {
            aVar = (C70117a) view.getTag();
        }
        aVar.f202402a.setText(mVar.f106724e);
        aVar.f202403b.setOnItemClickListener(this.f202400f);
        C42598o oVar = aVar.f202404c;
        C67033e eVar = this.f202401g;
        String str = mVar.f106723d;
        String str2 = ((HashMap) eVar.f192546o).containsKey(str) ? (String) ((HashMap) eVar.f192546o).get(str) : null;
        oVar.f115272e = mVar;
        oVar.f115273f = str2;
        Context context = this.f202398d;
        LinkedList<C39765h> linkedList = mVar.f106725f;
        int b = context.getResources().getDisplayMetrics().widthPixels - (C76577a.m92151b(context, 16) * 2);
        TextPaint paint = ((TextView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bo9, (ViewGroup) null)).getPaint();
        Iterator<C39765h> it = linkedList.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float measureText = paint.measureText(it.next().f106716e);
            if (f < measureText) {
                f = measureText;
            }
        }
        int b2 = ((int) f) + (C76577a.m92151b(context, 10) * 2);
        int i2 = 4;
        int[] iArr = new int[4];
        int b3 = C76577a.m92151b(context, 12);
        int i3 = 0;
        while (i3 < 4) {
            int i4 = i3 + 1;
            iArr[i3] = (b - (b3 * i3)) / i4;
            i3 = i4;
        }
        while (true) {
            if (i2 < 1) {
                pair = new Pair(1, Integer.valueOf(b));
                break;
            }
            int i5 = i2 - 1;
            if (b2 < iArr[i5]) {
                pair = new Pair(Integer.valueOf(i2), Integer.valueOf(iArr[i5]));
                break;
            }
            i2 = i5;
        }
        Log.m105918d("MicroMsg.MallProductImageAdapter", mVar.f106724e + " numColumns = " + pair);
        aVar.f202403b.setColumnWidth(((Integer) pair.second).intValue());
        aVar.f202404c.notifyDataSetChanged();
        aVar.f202403b.setAdapter(aVar.f202404c);
        return view;
    }
}
