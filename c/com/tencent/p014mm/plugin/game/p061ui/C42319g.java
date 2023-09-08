package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.game.ui.g */
public class C42319g extends BaseAdapter {

    /* renamed from: d */
    public Context f114460d;

    /* renamed from: e */
    public String f114461e = "";

    /* renamed from: f */
    public LinkedList<C42320a> f114462f = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.game.ui.g$a */
    public static class C42320a {

        /* renamed from: a */
        public int f114463a;

        /* renamed from: b */
        public String f114464b;

        /* renamed from: c */
        public String f114465c;

        /* renamed from: d */
        public String f114466d;

        /* renamed from: e */
        public int f114467e;

        /* renamed from: f */
        public String f114468f;
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.g$b */
    public static class C42321b {

        /* renamed from: a */
        public TextView f114469a;

        /* renamed from: b */
        public ViewGroup f114470b;

        /* renamed from: c */
        public TextView f114471c;

        /* renamed from: d */
        public TextView f114472d;

        /* renamed from: e */
        public ViewGroup f114473e;

        /* renamed from: f */
        public TextView f114474f;

        /* renamed from: g */
        public ViewGroup f114475g;
    }

    public C42319g(Context context) {
        this.f114460d = context;
    }

    public int getCount() {
        return this.f114462f.size();
    }

    public Object getItem(int i) {
        return this.f114462f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C42321b bVar;
        C42320a aVar = this.f114462f.get(i);
        if (view == null) {
            view = View.inflate(this.f114460d, C0966R.C0971layout.axs, (ViewGroup) null);
            bVar = new C42321b();
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.enh);
            bVar.f114469a = textView;
            bVar.f114470b = (ViewGroup) textView.getParent();
            bVar.f114471c = (TextView) view.findViewById(C0966R.C0970id.eng);
            bVar.f114472d = (TextView) view.findViewById(C0966R.C0970id.ene);
            bVar.f114473e = (ViewGroup) bVar.f114471c.getParent();
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.enf);
            bVar.f114474f = textView2;
            bVar.f114475g = (ViewGroup) textView2.getParent().getParent();
            view.setTag(bVar);
        } else {
            bVar = (C42321b) view.getTag();
        }
        int i2 = aVar.f114463a;
        if (i2 == 1) {
            bVar.f114470b.setVisibility(0);
            bVar.f114473e.setVisibility(8);
            bVar.f114475g.setVisibility(8);
            bVar.f114470b.setOnClickListener((View.OnClickListener) null);
            bVar.f114469a.setText(aVar.f114464b);
        } else if (i2 == 2) {
            bVar.f114470b.setVisibility(8);
            bVar.f114473e.setVisibility(0);
            bVar.f114475g.setVisibility(8);
            bVar.f114471c.setText(aVar.f114464b);
            bVar.f114472d.setText(aVar.f114466d);
        } else if (i2 == 3) {
            bVar.f114470b.setVisibility(8);
            bVar.f114473e.setVisibility(8);
            bVar.f114475g.setVisibility(0);
            bVar.f114474f.setTextColor(this.f114460d.getResources().getColor(C0966R.color.a7f));
            int color = this.f114460d.getResources().getColor(C0966R.color.f3532wo);
            int indexOf = aVar.f114464b.indexOf(this.f114461e);
            if (indexOf >= 0) {
                SpannableString spannableString = new SpannableString(aVar.f114464b);
                spannableString.setSpan(new ForegroundColorSpan(color), indexOf, this.f114461e.length() + indexOf, 33);
                bVar.f114474f.setText(spannableString);
            } else {
                bVar.f114474f.setText(aVar.f114464b);
            }
        }
        return view;
    }
}
