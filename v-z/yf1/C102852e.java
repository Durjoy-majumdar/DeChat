package yf1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import fe1.C58969q;
import ht1.C60200t1;
import kv1.C99261r;
import lv1.C99681n;
import p196ln.C76705f;
import p255vr.C78470h;
import pv1.C22019b;
import te3.C64284cg;

/* renamed from: yf1.e */
public class C102852e extends C22019b {

    /* renamed from: p */
    public C58969q f303598p;

    /* renamed from: q */
    public C102853a f303599q = new C102853a();

    /* renamed from: r */
    public C99681n f303600r;

    /* renamed from: s */
    public C72996z1 f303601s;

    /* renamed from: t */
    public String f303602t;

    /* renamed from: u */
    public CharSequence f303603u;

    /* renamed from: v */
    public CharSequence f303604v;

    /* renamed from: w */
    public String f303605w;

    /* renamed from: x */
    public C102854b f303606x = new C102854b(this);

    /* renamed from: yf1.e$a */
    public class C102853a extends C22019b.C22021b {
        public C102853a() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            Class cls = C78470h.class;
            C102854b bVar2 = (C102854b) aVar;
            C102852e eVar = (C102852e) bVar;
            ((C78470h) C86312j.m106911c(cls)).Zo0(bVar2.f303608a, C102852e.this.f62326d);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(bVar2.f303609b, eVar.f303602t);
            ((C78470h) C86312j.m106911c(cls)).mo108300VH(eVar.f303603u, bVar2.f303610c);
            ((C78470h) C86312j.m106911c(cls)).mo108300VH(eVar.f303604v, bVar2.f303611d);
            ((C78470h) C86312j.m106911c(cls)).mo108300VH(eVar.f303605w, bVar2.f303612e);
            ImageView imageView = bVar2.f303613f;
            if (imageView != null) {
                C58969q qVar = C102852e.this.f303598p;
                if (qVar == null || qVar.field_authInfo == null) {
                    imageView.setVisibility(8);
                    return;
                }
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76826X(bVar2.f303613f, C102852e.this.f303598p.field_authInfo, 1, (C64284cg) null);
                bVar2.f303613f.setVisibility(0);
                return;
            }
            Log.m105924i("MicroMsg.FTS.FTSFinderFollowerDataItem", "viewHolder.verifyIV = null.");
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.at4, viewGroup, false);
            C102854b bVar = C102852e.this.f303606x;
            bVar.f303609b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            bVar.f303610c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            bVar.f303611d = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            bVar.f303612e = (TextView) inflate.findViewById(C0966R.C0970id.fac);
            bVar.f303608a = inflate.findViewById(C0966R.C0970id.c7p);
            bVar.f303613f = (ImageView) inflate.findViewById(C0966R.C0970id.l3v);
            inflate.setTag(bVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            Class cls = C99261r.class;
            Class cls2 = C60200t1.class;
            C102852e eVar = (C102852e) bVar;
            String str = eVar.f303602t;
            if (!Util.isNullOrNil(str)) {
                mo35141a(C102852e.this.mo35139k(), eVar.f303600r);
                Intent intent = new Intent();
                boolean equals = str.equals(C75592q0.m90778h());
                intent.putExtra("finder_username", str);
                if (equals) {
                    ((C60200t1) C86312j.m106911c(cls2)).mo76836bn(context, intent, 30, 20);
                } else {
                    ((C60200t1) C86312j.m106911c(cls2)).mo76842e7(30, 20, 32, intent);
                    ((C60200t1) C86312j.m106911c(cls2)).mo76819V1(context, intent);
                }
            }
            C58969q qVar = eVar.f303598p;
            ((C99261r) C86312j.m106911c(cls)).rv0(eVar.f303602t, eVar.f303603u.toString(), qVar != null ? qVar.field_avatarUrl : "", 31);
            ((C99261r) C86312j.m106911c(cls)).mo23817hN(eVar);
            return true;
        }
    }

    /* renamed from: yf1.e$b */
    public class C102854b extends C22019b.C22020a {

        /* renamed from: a */
        public View f303608a;

        /* renamed from: b */
        public ImageView f303609b;

        /* renamed from: c */
        public TextView f303610c;

        /* renamed from: d */
        public TextView f303611d;

        /* renamed from: e */
        public TextView f303612e;

        /* renamed from: f */
        public ImageView f303613f;

        public C102854b(C102852e eVar) {
            super(eVar);
        }
    }

    public C102852e(int i) {
        super(17, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35129a(android.content.Context r9, pv1.C22019b.C22020a r10, java.lang.Object... r11) {
        /*
            r8 = this;
            java.lang.Class<ny.h> r10 = p629ny.C76979h.class
            lv1.n r11 = r8.f303600r
            java.lang.String r11 = r11.f292151e
            r8.f303602t = r11
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ht1.t1 r11 = (ht1.C60200t1) r11
            java.lang.String r0 = r8.f303602t
            fe1.q r11 = r11.mo76824W5(r0)
            r8.f303598p = r11
            if (r11 == 0) goto L_0x0024
            com.tencent.mm.storage.z1 r0 = new com.tencent.mm.storage.z1
            r0.<init>()
            r11.mo84194r2(r0)
            r8.f303601s = r0
        L_0x0024:
            java.lang.String r11 = r8.f303602t
            java.lang.String r11 = kv1.C99251g.m129283d(r11)
            lv1.n r0 = r8.f303600r
            int r0 = r0.f292149c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x003f
            r3 = 2
            if (r0 == r3) goto L_0x003c
            r3 = 3
            if (r0 == r3) goto L_0x003b
            r4 = 0
            r5 = 0
            goto L_0x0043
        L_0x003b:
            r1 = 1
        L_0x003c:
            r0 = r1
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r5 = r0
            r4 = r1
            r1 = 1
        L_0x0043:
            r0 = 2131165591(0x7f070197, float:1.7945403E38)
            if (r1 == 0) goto L_0x006d
            di3.d r10 = di3.C86312j.m106911c(r10)
            ny.h r10 = (p629ny.C76979h) r10
            int r0 = kg3.C76577a.m92157h(r9, r0)
            float r0 = (float) r0
            android.text.SpannableString r2 = r10.Te0(r9, r11, r0)
            r8.f303603u = r2
            lv1.i r3 = r8.f62327e
            int r9 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r6 = (float) r9
            android.text.TextPaint r7 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162739c
            lv1.f r9 = lv1.C99667f.m130092e(r2, r3, r4, r5, r6, r7)
            lv1.g r9 = kv1.C99254i.m129308e(r9)
            java.lang.CharSequence r9 = r9.f292107a
            r8.f303603u = r9
            goto L_0x007e
        L_0x006d:
            di3.d r10 = di3.C86312j.m106911c(r10)
            ny.h r10 = (p629ny.C76979h) r10
            int r0 = kg3.C76577a.m92157h(r9, r0)
            float r0 = (float) r0
            android.text.SpannableString r9 = r10.Te0(r9, r11, r0)
            r8.f303603u = r9
        L_0x007e:
            java.lang.String r9 = ""
            r8.f303605w = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf1.C102852e.mo35129a(android.content.Context, pv1.b$a, java.lang.Object[]):void");
    }

    /* renamed from: c */
    public String mo35131c() {
        return this.f303602t;
    }

    /* renamed from: d */
    public String mo35132d() {
        C72996z1 z1Var = this.f303601s;
        return z1Var != null ? z1Var.getNickname() : "";
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f303600r.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303599q;
    }
}
