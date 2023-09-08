package m32;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.LinkedList;
import java.util.List;
import te3.C64678re2;

/* renamed from: m32.c */
public class C76742c extends BaseAdapter {

    /* renamed from: d */
    public List<C64678re2> f224496d = new LinkedList();

    /* renamed from: e */
    public Context f224497e;

    /* renamed from: f */
    public LayoutInflater f224498f;

    /* renamed from: g */
    public int f224499g = 1;

    /* renamed from: m32.c$a */
    public class C76743a {

        /* renamed from: a */
        public View f224500a;

        /* renamed from: b */
        public ImageView f224501b;

        /* renamed from: c */
        public TextView f224502c;

        /* renamed from: d */
        public TextView f224503d;

        /* renamed from: e */
        public TextView f224504e;

        /* renamed from: f */
        public TextView f224505f;

        /* renamed from: g */
        public TextView f224506g;

        /* renamed from: h */
        public ImageView f224507h;

        /* renamed from: i */
        public TextView f224508i;

        public C76743a(C76742c cVar) {
        }
    }

    public C76742c(Context context) {
        this.f224497e = context;
        this.f224498f = LayoutInflater.from(context);
    }

    public int getCount() {
        return this.f224496d.size();
    }

    public Object getItem(int i) {
        return this.f224496d.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C76743a aVar;
        if (view == null) {
            view = this.f224498f.inflate(C0966R.C0971layout.b_c, viewGroup, false);
            aVar = new C76743a(this);
            aVar.f224500a = view.findViewById(C0966R.C0970id.iwc);
            aVar.f224501b = (ImageView) view.findViewById(C0966R.C0970id.giv);
            aVar.f224502c = (TextView) view.findViewById(C0966R.C0970id.giz);
            aVar.f224503d = (TextView) view.findViewById(C0966R.C0970id.f358696gj0);
            aVar.f224504e = (TextView) view.findViewById(C0966R.C0970id.git);
            aVar.f224505f = (TextView) view.findViewById(C0966R.C0970id.giu);
            aVar.f224506g = (TextView) view.findViewById(C0966R.C0970id.f358697gj1);
            aVar.f224507h = (ImageView) view.findViewById(C0966R.C0970id.giw);
            aVar.f224508i = (TextView) view.findViewById(C0966R.C0970id.gix);
            view.setTag(aVar);
        } else {
            aVar = (C76743a) view.getTag();
        }
        C64678re2 re22 = this.f224496d.get(i);
        C69242l1.m81595a(aVar.f224501b, re22.f185158g, re22.f185160i);
        aVar.f224505f.setVisibility(8);
        C69242l1.m81616v(this.f224497e, aVar.f224502c, re22.f185157f);
        aVar.f224504e.setText(this.f224497e.getString(C0966R.string.gin, new Object[]{C75228t.m90260n(((double) re22.f185155d) / 100.0d)}));
        aVar.f224503d.setText(C69242l1.m81597c(this.f224497e, re22.f185156e * 1000));
        aVar.f224503d.setVisibility(0);
        aVar.f224506g.setVisibility(8);
        if (Util.isNullOrNil(re22.f185161j)) {
            aVar.f224507h.setVisibility(8);
            aVar.f224508i.setVisibility(8);
        } else {
            aVar.f224508i.setText(re22.f185161j);
            if (this.f224499g == 2) {
                aVar.f224507h.setImageResource(C0966R.C0969drawable.c6v);
            } else {
                aVar.f224507h.setImageResource(C0966R.C0969drawable.c5s);
            }
            aVar.f224507h.setVisibility(0);
            aVar.f224508i.setVisibility(0);
        }
        return view;
    }
}
