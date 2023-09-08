package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import kv1.C99260q;
import lv1.C99681n;
import p196ln.C76705f;
import pv1.C22019b;

/* renamed from: xv1.m */
public class C102758m extends C22019b {

    /* renamed from: p */
    public C99681n f303426p;

    /* renamed from: q */
    public int f303427q;

    /* renamed from: r */
    public String f303428r;

    /* renamed from: s */
    public CharSequence f303429s;

    /* renamed from: t */
    public CharSequence f303430t;

    /* renamed from: u */
    public CharSequence f303431u;

    /* renamed from: v */
    public C102760b f303432v = new C102760b();

    /* renamed from: w */
    public C102759a f303433w = new C102759a(this);

    /* renamed from: xv1.m$a */
    public class C102759a extends C22019b.C22020a {

        /* renamed from: a */
        public View f303434a;

        /* renamed from: b */
        public ImageView f303435b;

        /* renamed from: c */
        public TextView f303436c;

        /* renamed from: d */
        public TextView f303437d;

        /* renamed from: e */
        public TextView f303438e;

        public C102759a(C102758m mVar) {
            super(mVar);
        }
    }

    /* renamed from: xv1.m$b */
    public class C102760b extends C22019b.C22021b {
        public C102760b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            Class cls = C76158j.class;
            C102758m mVar = (C102758m) bVar;
            C102759a aVar2 = (C102759a) aVar;
            C93938f0.m118699g(aVar2.f303434a, C102758m.this.f62326d);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar2.f303435b, mVar.f303428r);
            C93938f0.m118693a(mVar.f303430t, aVar2.f303437d);
            C93938f0.m118693a(mVar.f303431u, aVar2.f303438e);
            if (C45628s0.m50748M(mVar.f303428r)) {
                C93938f0.m118693a(((C76158j) C86312j.m106911c(cls)).bm0(context, mVar.f303429s), aVar2.f303436c);
            } else if (C72996z1.m85843n5(mVar.f303428r)) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(mVar.f303428r);
                ((C76158j) C86312j.m106911c(cls)).mo106359LW(aVar2.f303436c.getContext(), aVar2.f303436c, mVar.f303429s, z1Var.mo73980x2(), z1Var.mo73976t2(), (int) aVar2.f303436c.getTextSize());
            } else {
                C93938f0.m118693a(mVar.f303429s, aVar2.f303436c);
            }
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqy, viewGroup, false);
            C102759a aVar = C102758m.this.f303433w;
            aVar.f303435b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f303436c = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            aVar.f303437d = (TextView) inflate.findViewById(C0966R.C0970id.h2q);
            aVar.f303438e = (TextView) inflate.findViewById(C0966R.C0970id.kky);
            aVar.f303434a = inflate.findViewById(C0966R.C0970id.c7p);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return ((C99260q) C86312j.m106911c(C99260q.class)).au0(C102758m.this.f62323a).mo91604d(context, view, bVar, objArr);
        }
    }

    public C102758m(int i) {
        super(5, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0202, code lost:
        r11 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0206, code lost:
        r8.f303430t = ((p629ny.C76979h) di3.C86312j.m106911c(r0)).Te0(r9, com.tencent.p014mm.sdk.platformtools.Util.nullAs(r10, "").replace(10, ' '), (float) com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162740d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0225, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r11) != false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0227, code lost:
        r0 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e;
        r10 = kv1.C99254i.m129308e(lv1.C99667f.m130090c(r8.f303430t, r8.f62327e, ((float) com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a) - r0.measureText(r11.toString()), r0)).f292107a;
        r8.f303430t = r10;
        r8.f303430t = android.text.TextUtils.concat(new java.lang.CharSequence[]{r11, r10});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0252, code lost:
        r8.f303430t = kv1.C99254i.m129308e(lv1.C99667f.m130090c(r8.f303430t, r8.f62327e, (float) com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a, com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e)).f292107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0267, code lost:
        r8.f303431u = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r9, r8.f303426p.f292152f, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35129a(android.content.Context r9, pv1.C22019b.C22020a r10, java.lang.Object... r11) {
        /*
            r8 = this;
            java.lang.Class<f62.k0> r11 = f62.C75700k0.class
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            xv1.m$a r10 = (xv1.C102758m.C102759a) r10
            lv1.n r1 = r8.f303426p
            java.lang.String r1 = r1.f292151e
            r8.f303428r = r1
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            java.lang.String r2 = r8.f303428r
            java.lang.String r2 = kv1.C99251g.m129283d(r2)
            android.widget.TextView r10 = r10.f303436c
            float r10 = r10.getTextSize()
            android.text.SpannableString r10 = r1.Te0(r9, r2, r10)
            r8.f303429s = r10
            lv1.n r10 = r8.f303426p
            java.lang.Object r10 = r10.f292161o
            boolean r1 = r10 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0034
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.f303427q = r10
        L_0x0034:
            int r10 = r8.f303427q
            r1 = 0
            r2 = 1
            if (r10 <= r2) goto L_0x0053
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131835434(0x7f113a2a, float:1.9304006E38)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            int r0 = r8.f303427q
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r1] = r0
            java.lang.String r9 = r9.getString(r10, r11)
            r8.f303430t = r9
            goto L_0x0271
        L_0x0053:
            if (r10 != r2) goto L_0x0271
            k40.a r10 = f40.C86709a0.m107533q(r11)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.l r10 = r10.mo96095LE()
            lv1.n r3 = r8.f303426p
            long r3 = r3.f292150d
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            com.tencent.mm.storage.f4 r10 = r10.b00(r3)
            lv1.n r3 = r8.f303426p
            int r3 = r3.f292149c
            r4 = 2
            java.lang.String r5 = ": "
            r6 = 0
            java.lang.String r7 = ""
            switch(r3) {
                case 41: goto L_0x01f2;
                case 42: goto L_0x01dc;
                case 43: goto L_0x01c6;
                case 44: goto L_0x01a8;
                case 45: goto L_0x017f;
                case 46: goto L_0x012f;
                case 47: goto L_0x012f;
                case 48: goto L_0x0118;
                case 49: goto L_0x0101;
                case 50: goto L_0x00ca;
                case 51: goto L_0x0076;
                case 52: goto L_0x00b6;
                case 53: goto L_0x0078;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x0204
        L_0x0078:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x0204
            java.lang.Class<ht1.f> r11 = ht1.C60166f.class
            com.tencent.mm.message.g r10 = r10.mo93555w(r11)
            ht1.f r10 = (ht1.C60166f) r10
            java.lang.String r11 = r10.mo85179g()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x00b3
            r11 = 2131830492(0x7f1126dc, float:1.9293983E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r5 = r10.mo85179g()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r7)
            r3[r1] = r5
            te3.rk1 r10 = r10.f171710b
            java.lang.String r10 = r10.f185187h
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
            r3[r2] = r10
            java.lang.String r10 = r9.getString(r11, r3)
            goto L_0x0202
        L_0x00b3:
            r10 = r7
            goto L_0x0202
        L_0x00b6:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x0204
            java.lang.String r10 = r10.mo93550m()
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
            goto L_0x0202
        L_0x00ca:
            java.lang.String r10 = r10.getContent()
            java.lang.String r3 = r8.f303428r
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 == 0) goto L_0x00da
            java.lang.String r10 = eb0.C75604z3.m90849u(r10)
        L_0x00da:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r3 != 0) goto L_0x00f8
            k40.a r11 = f40.C86709a0.m107533q(r11)
            f62.k0 r11 = (f62.C75700k0) r11
            g62.l r11 = r11.mo96095LE()
            com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11
            com.tencent.mm.storage.f4$e r11 = r11.Tx0(r10)
            boolean r3 = r11.mo101029a()
            if (r3 == 0) goto L_0x00f8
            java.lang.String r10 = r11.f212708f
        L_0x00f8:
            r11 = 2131830503(0x7f1126e7, float:1.9294005E38)
            java.lang.String r11 = r9.getString(r11)
            goto L_0x0206
        L_0x0101:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x010e
            java.lang.String r10 = r10.f195574g
            goto L_0x010f
        L_0x010e:
            r10 = r7
        L_0x010f:
            r11 = 2131830504(0x7f1126e8, float:1.9294007E38)
            java.lang.String r11 = r9.getString(r11)
            goto L_0x0206
        L_0x0118:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x0125
            java.lang.String r10 = r10.f195570f
            goto L_0x0126
        L_0x0125:
            r10 = r7
        L_0x0126:
            r11 = 2131830499(0x7f1126e3, float:1.9293997E38)
            java.lang.String r11 = r9.getString(r11)
            goto L_0x0206
        L_0x012f:
            java.lang.String r11 = r10.getContent()
            com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r11, r6)
            if (r11 == 0) goto L_0x0204
            int r10 = r10.mo108769t2()
            if (r10 != r2) goto L_0x015f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = r11.f195596l1
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r7)
            r10.append(r3)
            r10.append(r5)
            java.lang.String r11 = r11.f195584i1
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r7)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            goto L_0x0202
        L_0x015f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = r11.f195596l1
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r7)
            r10.append(r3)
            r10.append(r5)
            java.lang.String r11 = r11.f195580h1
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r7)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            goto L_0x0202
        L_0x017f:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x0204
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = r10.f195570f
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r7)
            r11.append(r3)
            r11.append(r5)
            java.lang.String r10 = r10.f195574g
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            goto L_0x0202
        L_0x01a8:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x0204
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = r10.f195570f
            r11.append(r3)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.String r10 = r10.f195574g
            goto L_0x0206
        L_0x01c6:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x01d3
            java.lang.String r10 = r10.f195570f
            goto L_0x01d4
        L_0x01d3:
            r10 = r7
        L_0x01d4:
            r11 = 2131830502(0x7f1126e6, float:1.9294003E38)
            java.lang.String r11 = r9.getString(r11)
            goto L_0x0206
        L_0x01dc:
            java.lang.String r10 = r10.getContent()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r6)
            if (r10 == 0) goto L_0x01e9
            java.lang.String r10 = r10.f195570f
            goto L_0x01ea
        L_0x01e9:
            r10 = r7
        L_0x01ea:
            r11 = 2131830500(0x7f1126e4, float:1.9294E38)
            java.lang.String r11 = r9.getString(r11)
            goto L_0x0206
        L_0x01f2:
            java.lang.String r10 = r10.getContent()
            java.lang.String r11 = r8.f303428r
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85820U5(r11)
            if (r11 == 0) goto L_0x0202
            java.lang.String r10 = eb0.C75604z3.m90849u(r10)
        L_0x0202:
            r11 = r7
            goto L_0x0206
        L_0x0204:
            r10 = r7
            r11 = r10
        L_0x0206:
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
            r3 = 10
            r5 = 32
            java.lang.String r10 = r10.replace(r3, r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            int r3 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162740d
            float r3 = (float) r3
            android.text.SpannableString r10 = r0.Te0(r9, r10, r3)
            r8.f303430t = r10
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r11)
            if (r10 != 0) goto L_0x0252
            int r10 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r10 = (float) r10
            android.text.TextPaint r0 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            java.lang.String r3 = r11.toString()
            float r3 = r0.measureText(r3)
            float r10 = r10 - r3
            java.lang.CharSequence r3 = r8.f303430t
            lv1.i r5 = r8.f62327e
            lv1.f r10 = lv1.C99667f.m130090c(r3, r5, r10, r0)
            lv1.g r10 = kv1.C99254i.m129308e(r10)
            java.lang.CharSequence r10 = r10.f292107a
            r8.f303430t = r10
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r4]
            r0[r1] = r11
            r0[r2] = r10
            java.lang.CharSequence r10 = android.text.TextUtils.concat(r0)
            r8.f303430t = r10
            goto L_0x0267
        L_0x0252:
            java.lang.CharSequence r10 = r8.f303430t
            lv1.i r11 = r8.f62327e
            int r0 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r0 = (float) r0
            android.text.TextPaint r1 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            lv1.f r10 = lv1.C99667f.m130090c(r10, r11, r0, r1)
            lv1.g r10 = kv1.C99254i.m129308e(r10)
            java.lang.CharSequence r10 = r10.f292107a
            r8.f303430t = r10
        L_0x0267:
            lv1.n r10 = r8.f303426p
            long r10 = r10.f292152f
            java.lang.CharSequence r9 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r9, r10, r2)
            r8.f303431u = r9
        L_0x0271:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.C102758m.mo35129a(android.content.Context, pv1.b$a, java.lang.Object[]):void");
    }

    /* renamed from: f */
    public int mo35134f() {
        return this.f303427q < 2 ? 0 : 1;
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f303426p.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303432v;
    }
}
