package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.scanner.ui.SelectScanModeGrid */
public class SelectScanModeGrid extends GridView {

    /* renamed from: com.tencent.mm.plugin.scanner.ui.SelectScanModeGrid$a */
    public static class C106090a extends BaseAdapter {

        /* renamed from: d */
        public Context f315852d;

        /* renamed from: e */
        public List<C106092b> f315853e;

        /* renamed from: f */
        public int f315854f = -1;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.SelectScanModeGrid$a$a */
        public static class C106091a {

            /* renamed from: a */
            public TextView f315855a;

            /* renamed from: b */
            public TextView f315856b;

            /* renamed from: c */
            public ImageView f315857c;
        }

        public C106090a(Context context, List<C106092b> list) {
            this.f315852d = context;
            this.f315853e = list;
            if (list == null) {
                this.f315853e = new ArrayList();
            }
            Log.m105918d("MicroMsg.scanner.SelectScanModeGroupAdapter", "<init> list size = " + this.f315853e.size());
        }

        public int getCount() {
            return this.f315853e.size();
        }

        public Object getItem(int i) {
            if (i >= 0 && i < this.f315853e.size()) {
                return this.f315853e.get(i);
            }
            Log.m105920e("MicroMsg.scanner.SelectScanModeGroupAdapter", "getItem fail, invalid position = " + i);
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C106091a aVar;
            if (view == null) {
                view = View.inflate(this.f315852d, C0966R.C0971layout.bwb, (ViewGroup) null);
                aVar = new C106091a();
                aVar.f315855a = (TextView) view.findViewById(C0966R.C0970id.j_s);
                aVar.f315856b = (TextView) view.findViewById(C0966R.C0970id.j_x);
                aVar.f315857c = (ImageView) view.findViewById(C0966R.C0970id.j_w);
                view.setTag(aVar);
            } else {
                aVar = (C106091a) view.getTag();
            }
            if (i == viewGroup.getChildCount()) {
                C106092b bVar = (C106092b) getItem(i);
                if (bVar == null) {
                    Log.m105920e("MicroMsg.scanner.SelectScanModeGroupAdapter", "getView fail, item is null");
                    return view;
                }
                aVar.f315856b.setText(bVar.f315858a);
                if (i == this.f315854f) {
                    aVar.f315855a.setBackgroundResource(bVar.f315860c);
                } else {
                    aVar.f315855a.setBackgroundResource(bVar.f315859b);
                }
                bVar.f315862e = aVar.f315855a;
                if (bVar.f315863f) {
                    aVar.f315857c.setVisibility(0);
                } else {
                    aVar.f315857c.setVisibility(4);
                }
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.SelectScanModeGrid$b */
    public static class C106092b {

        /* renamed from: a */
        public String f315858a;

        /* renamed from: b */
        public int f315859b;

        /* renamed from: c */
        public int f315860c;

        /* renamed from: d */
        public int f315861d;

        /* renamed from: e */
        public TextView f315862e;

        /* renamed from: f */
        public boolean f315863f;

        public C106092b(String str, int i, int i2, int i3, boolean z) {
            this.f315858a = str;
            this.f315859b = i;
            this.f315860c = i2;
            this.f315861d = i3;
            this.f315863f = z;
        }
    }

    public SelectScanModeGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectScanModeGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
