package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import fc2.C116858d;
import java.util.HashMap;
import kv1.C99254i;
import te3.C64885zm2;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.c */
public class C115616c extends C115614a {

    /* renamed from: A */
    public boolean f346828A = false;

    /* renamed from: u */
    public C116858d f346829u;

    /* renamed from: v */
    public C116858d f346830v;

    /* renamed from: w */
    public String f346831w;

    /* renamed from: x */
    public HashMap<String, Integer> f346832x = new HashMap<>();

    /* renamed from: y */
    public boolean f346833y = true;

    /* renamed from: z */
    public String f346834z;

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.c$a */
    public class C115617a {

        /* renamed from: a */
        public int f346835a;

        /* renamed from: b */
        public C116858d f346836b;

        /* renamed from: c */
        public LinearLayout f346837c;

        /* renamed from: d */
        public TextView f346838d;

        /* renamed from: e */
        public TextView f346839e;

        /* renamed from: f */
        public TextView f346840f;

        /* renamed from: g */
        public WeImageView f346841g;

        /* renamed from: h */
        public String f346842h;

        public C115617a(C115616c cVar) {
        }
    }

    public C115616c(Context context, View.OnClickListener onClickListener, String str, boolean z, boolean z2, String str2, boolean z3) {
        super(context, onClickListener, str, z2);
        C116858d dVar = new C116858d("", new C64885zm2());
        this.f346830v = dVar;
        dVar.f350244b = "NotCheckIn";
        dVar.f350245c = context.getString(C0966R.string.h5_);
        this.f346833y = z;
        this.f346834z = str2;
        this.f346832x.put(this.f346830v.f350244b, 2);
        if (!z2 && z) {
            mo175740a(this.f346830v, 0);
            notifyDataSetChanged();
        }
        this.f346828A = z3;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C115617a aVar;
        if (view == null) {
            aVar = new C115617a(this);
            view2 = View.inflate(this.f346815f, C0966R.C0971layout.bju, (ViewGroup) null);
            aVar.f346838d = (TextView) view2.findViewById(C0966R.C0970id.fnh);
            aVar.f346840f = (TextView) view2.findViewById(C0966R.C0970id.fng);
            aVar.f346839e = (TextView) view2.findViewById(C0966R.C0970id.fnf);
            aVar.f346837c = (LinearLayout) view2.findViewById(C0966R.C0970id.iwg);
            WeImageView weImageView = (WeImageView) view2.findViewById(C0966R.C0970id.j_8);
            aVar.f346841g = weImageView;
            String str = this.f346834z;
            if (str != null) {
                weImageView.setIconColor(Color.parseColor(str));
            }
            aVar.f346837c.setOnClickListener(this.f346826t);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C115617a) view.getTag();
        }
        C116858d i2 = getItem(i);
        int intValue = this.f346832x.containsKey(i2.f350244b) ? this.f346832x.get(i2.f350244b).intValue() : 0;
        aVar.f346841g.setVisibility(8);
        aVar.f346835a = intValue;
        aVar.f346836b = i2;
        if (!Util.isNullOrNil(this.f346831w) && this.f346831w.equals(i2.f350244b)) {
            aVar.f346841g.setVisibility(0);
        }
        if (intValue == 0) {
            aVar.f346838d.setTextColor(this.f346815f.getResources().getColor(C0966R.color.a7f));
            aVar.f346839e.setVisibility(0);
        } else if (intValue == 1) {
            aVar.f346838d.setTextColor(this.f346815f.getResources().getColor(C0966R.color.a7f));
            aVar.f346839e.setVisibility(8);
        } else if (intValue == 2) {
            aVar.f346839e.setVisibility(8);
            aVar.f346838d.setTextColor(this.f346815f.getResources().getColor(C0966R.color.ad8));
            if (Util.isNullOrNil(this.f346831w)) {
                aVar.f346841g.setVisibility(0);
            }
        }
        aVar.f346842h = i2.f350244b;
        if (this.f346813d) {
            aVar.f346838d.setText(C99254i.m129306c(this.f346815f, i2.f350245c, this.f346824r));
            aVar.f346839e.setText(C99254i.m129306c(this.f346815f, C115614a.m162538f(i2.f350246d), this.f346824r));
        } else {
            aVar.f346838d.setText(i2.f350245c);
            aVar.f346839e.setText(C115614a.m162538f(i2.f350246d));
        }
        aVar.f346840f.setVisibility(8);
        if (this.f346828A) {
            aVar.f346837c.setBackground(this.f346815f.getDrawable(C0966R.C0969drawable.agl));
            aVar.f346838d.setTextColor(Color.parseColor("#CCFFFFFF"));
            aVar.f346839e.setTextColor(Color.parseColor("#80FFFFFF"));
            aVar.f346840f.setTextColor(Color.parseColor("#CCFFFFFF"));
        }
        return view2;
    }

    /* renamed from: k */
    public C116858d mo175751k(String str, String str2) {
        if (this.f346829u == null) {
            C116858d dVar = new C116858d("", new C64885zm2());
            this.f346829u = dVar;
            dVar.f350244b = "City";
            this.f346832x.put("City", 1);
            mo175740a(this.f346829u, this.f346833y ? 1 : 0);
        }
        C116858d dVar2 = this.f346829u;
        dVar2.f350245c = str;
        dVar2.f350250h = str2;
        notifyDataSetChanged();
        return this.f346829u;
    }
}
