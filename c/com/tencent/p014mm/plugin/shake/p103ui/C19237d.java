package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMImageView;
import nn2.C34935h;
import nn2.C34936i;
import nn2.C76942m;

/* renamed from: com.tencent.mm.plugin.shake.ui.d */
public class C19237d extends C6975i1<C34935h> {

    /* renamed from: o */
    public Context f54201o;

    /* renamed from: p */
    public LayoutInflater f54202p;

    /* renamed from: q */
    public int f54203q = 20;

    /* renamed from: com.tencent.mm.plugin.shake.ui.d$a */
    public class C19238a {

        /* renamed from: a */
        public MMImageView f54204a;

        /* renamed from: b */
        public TextView f54205b;

        /* renamed from: c */
        public TextView f54206c;

        /* renamed from: d */
        public TextView f54207d;

        public C19238a(C19237d dVar) {
        }
    }

    public C19237d(Context context) {
        super(context, new C34935h());
        this.f54201o = context;
        this.f54202p = LayoutInflater.from(context);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C34935h hVar = (C34935h) obj;
        if (hVar == null) {
            hVar = new C34935h();
        }
        hVar.convertFrom(cursor);
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.tencent.mm.plugin.shake.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            r2 = 0
            if (r22 != 0) goto L_0x0047
            android.view.LayoutInflater r3 = r0.f54202p
            r4 = 2131497475(0x7f0c1203, float:1.8618544E38)
            r5 = r23
            android.view.View r3 = r3.inflate(r4, r5, r2)
            com.tencent.mm.plugin.shake.ui.d$a r4 = new com.tencent.mm.plugin.shake.ui.d$a
            r4.<init>(r0)
            r5 = 2131313372(0x7f0942dc, float:1.8245139E38)
            android.view.View r5 = r3.findViewById(r5)
            com.tencent.mm.ui.MMImageView r5 = (com.tencent.p014mm.p136ui.MMImageView) r5
            r4.f54204a = r5
            r5 = 2131313374(0x7f0942de, float:1.8245143E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f54205b = r5
            r5 = 2131313371(0x7f0942db, float:1.8245137E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f54206c = r5
            r5 = 2131313373(0x7f0942dd, float:1.824514E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f54207d = r5
            r3.setTag(r4)
            goto L_0x0050
        L_0x0047:
            java.lang.Object r3 = r22.getTag()
            r4 = r3
            com.tencent.mm.plugin.shake.ui.d$a r4 = (com.tencent.p014mm.plugin.shake.p103ui.C19237d.C19238a) r4
            r3 = r22
        L_0x0050:
            java.lang.Object r5 = r20.getItem(r21)
            nn2.h r5 = (nn2.C34935h) r5
            com.tencent.mm.ui.MMImageView r6 = r4.f54204a
            java.lang.String r7 = r5.field_thumburl
            r8 = 2131755119(0x7f10006f, float:1.9141108E38)
            com.tencent.p014mm.plugin.shake.p103ui.C19239e.m20384b(r6, r7, r8, r2)
            java.lang.String r6 = r5.field_title
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r7 = 8
            if (r6 == 0) goto L_0x0070
            android.widget.TextView r6 = r4.f54205b
            r6.setVisibility(r7)
            goto L_0x008e
        L_0x0070:
            android.widget.TextView r6 = r4.f54205b
            di3.d r8 = di3.C86312j.m106911c(r1)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r9 = r0.f54201o
            java.lang.String r10 = r5.field_title
            android.widget.TextView r11 = r4.f54205b
            float r11 = r11.getTextSize()
            android.text.SpannableString r8 = r8.yp0(r9, r10, r11)
            r6.setText(r8)
            android.widget.TextView r6 = r4.f54205b
            r6.setVisibility(r2)
        L_0x008e:
            java.lang.String r6 = r5.field_desc
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x009c
            android.widget.TextView r1 = r4.f54206c
            r1.setVisibility(r7)
            goto L_0x00ba
        L_0x009c:
            android.widget.TextView r6 = r4.f54206c
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r7 = r0.f54201o
            java.lang.String r8 = r5.field_desc
            android.widget.TextView r9 = r4.f54206c
            float r9 = r9.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r7, r8, r9)
            r6.setText(r1)
            android.widget.TextView r1 = r4.f54206c
            r1.setVisibility(r2)
        L_0x00ba:
            android.widget.TextView r1 = r4.f54207d
            android.content.Context r4 = r0.f54201o
            long r5 = r5.field_createtime
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar
            r7.<init>()
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d4
            java.lang.String r2 = ""
            goto L_0x0173
        L_0x00d4:
            long r10 = r7.getTimeInMillis()
            long r10 = r10 - r5
            long r8 = r10 / r8
            r12 = 0
            r14 = 1
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 != 0) goto L_0x00ff
            r5 = 60000(0xea60, double:2.9644E-319)
            long r10 = r10 / r5
            int r5 = (int) r10
            if (r5 >= r14) goto L_0x00ea
            r5 = 1
        L_0x00ea:
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131689482(0x7f0f000a, float:1.900798E38)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r7[r2] = r8
            java.lang.String r2 = r4.getQuantityString(r6, r5, r7)
            goto L_0x0173
        L_0x00ff:
            java.util.GregorianCalendar r15 = new java.util.GregorianCalendar
            int r2 = r7.get(r14)
            r14 = 2
            int r14 = r7.get(r14)
            r12 = 5
            int r7 = r7.get(r12)
            r15.<init>(r2, r14, r7)
            long r12 = r15.getTimeInMillis()
            long r12 = r5 - r12
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            r18 = 0
            int r2 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x013f
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x013f
            int r2 = (int) r8
            r5 = 1
            if (r2 >= r5) goto L_0x012a
            r2 = 1
        L_0x012a:
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131689481(0x7f0f0009, float:1.9007979E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r5[r8] = r7
            java.lang.String r2 = r4.getQuantityString(r6, r2, r5)
            goto L_0x0173
        L_0x013f:
            long r7 = r15.getTimeInMillis()
            long r5 = r5 - r7
            long r5 = r5 + r16
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0158
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x0158
            r2 = 2131830369(0x7f112661, float:1.9293733E38)
            java.lang.String r2 = r4.getString(r2)
            goto L_0x0173
        L_0x0158:
            long r10 = r10 / r16
            int r5 = (int) r10
            r2 = 1
            if (r5 >= r2) goto L_0x015f
            r5 = 1
        L_0x015f:
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131689483(0x7f0f000b, float:1.9007983E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r8 = 0
            r2[r8] = r7
            java.lang.String r2 = r4.getQuantityString(r6, r5, r2)
        L_0x0173:
            r1.setText(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.C19237d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        C34936i Ax0 = C76942m.Ax0();
        int i = this.f54203q;
        Ax0.getClass();
        mo7998r(Ax0.f93791d.rawQuery("SELECT * FROM " + Ax0.getTableName() + " ORDER BY " + "rowid" + " DESC LIMIT " + i, (String[]) null));
        notifyDataSetChanged();
    }
}
