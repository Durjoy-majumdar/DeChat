package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import java.util.List;
import lj3.C46863b;
import p196ln.C76708i;
import vd3.C78399i;

/* renamed from: com.tencent.mm.ui.contact.w */
public class C74576w extends C6975i1<C72996z1> {

    /* renamed from: o */
    public String f219223o = null;

    /* renamed from: p */
    public MMActivity f219224p;

    /* renamed from: q */
    public C46863b f219225q;

    /* renamed from: r */
    public C46863b.C46867d f219226r;

    /* renamed from: s */
    public C78399i f219227s;

    /* renamed from: com.tencent.mm.ui.contact.w$a */
    public class C74577a implements C46863b.C46866c {
        public C74577a(C74576w wVar) {
        }

        /* renamed from: a */
        public Bitmap mo63515a(String str) {
            return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.w$b */
    public class C74578b implements C46863b.C46867d {
        public C74578b() {
        }

        /* renamed from: a */
        public int mo63517a() {
            return C74576w.this.getCount();
        }

        /* renamed from: b */
        public String mo63518b(int i) {
            if (i < 0 || i >= C74576w.this.getCount()) {
                Log.m105920e("MicroMsg.ChatroomContactAdapter", "pos is invalid");
                return null;
            }
            C72996z1 z1Var = (C72996z1) C74576w.this.getItem(i);
            if (z1Var == null) {
                return null;
            }
            return z1Var.getUsername();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.w$c */
    public static class C74579c {

        /* renamed from: a */
        public MaskLayout f219229a;

        /* renamed from: b */
        public TextView f219230b;

        /* renamed from: c */
        public TextView f219231c;

        /* renamed from: d */
        public ViewGroup f219232d;
    }

    public C74576w(Context context, String str) {
        super(context, new C72996z1());
        MMSlideDelView.getItemStatusCallBack();
        this.f219225q = null;
        this.f219226r = null;
        this.f219224p = (MMActivity) context;
        this.f219223o = str;
        this.f219225q = new C46863b(15, new C74577a(this));
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72996z1 z1Var = (C72996z1) obj;
        C44668u3 v = C97625j3.m125812b().mo105907v();
        int i = C72996z1.f214113Y1;
        C72996z1 W2 = v.mo69674W2(cursor.getString(cursor.getColumnIndex("username")));
        if (W2 != null) {
            return W2;
        }
        C72996z1 z1Var2 = new C72996z1();
        z1Var2.convertFrom(cursor);
        C97625j3.m125812b().mo105907v().mo69690c4(z1Var2);
        return z1Var2;
    }

    public int getCount() {
        return mo7992g().getCount();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.mm.ui.contact.w$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Class<d62.i> r2 = d62.C75339i.class
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            lj3.b$d r4 = r0.f219226r
            if (r4 != 0) goto L_0x0013
            com.tencent.mm.ui.contact.w$b r4 = new com.tencent.mm.ui.contact.w$b
            r4.<init>()
            r0.f219226r = r4
        L_0x0013:
            lj3.b r4 = r0.f219225q
            if (r4 == 0) goto L_0x001c
            lj3.b$d r5 = r0.f219226r
            r4.mo72072b(r1, r5)
        L_0x001c:
            r4 = 0
            if (r18 != 0) goto L_0x007b
            com.tencent.mm.ui.MMActivity r5 = r0.f219224p
            r6 = 2131493580(0x7f0c02cc, float:1.8610644E38)
            android.view.View r5 = android.view.View.inflate(r5, r6, r4)
            com.tencent.mm.ui.contact.w$c r6 = new com.tencent.mm.ui.contact.w$c
            r6.<init>()
            r7 = 2131300347(0x7f090ffb, float:1.8218721E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f219230b = r7
            r7 = 2131300344(0x7f090ff8, float:1.8218715E38)
            android.view.View r7 = r5.findViewById(r7)
            com.tencent.mm.ui.base.MaskLayout r7 = (com.tencent.p014mm.p136ui.base.MaskLayout) r7
            r6.f219229a = r7
            r7 = 2131300351(0x7f090fff, float:1.821873E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f219231c = r7
            r7 = 2131300350(0x7f090ffe, float:1.8218727E38)
            android.view.View r7 = r5.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r6.f219232d = r7
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            com.tencent.mm.ui.MMActivity r8 = r0.f219224p
            r9 = 2131165246(0x7f07003e, float:1.7944704E38)
            int r8 = kg3.C76577a.m92155f(r8, r9)
            float r8 = (float) r8
            com.tencent.mm.ui.MMActivity r9 = r0.f219224p
            float r9 = kg3.C76577a.m92175z(r9)
            float r8 = r8 * r9
            int r8 = (int) r8
            r7.height = r8
            android.view.ViewGroup r8 = r6.f219232d
            r8.setLayoutParams(r7)
            r5.setTag(r6)
            goto L_0x0084
        L_0x007b:
            java.lang.Object r5 = r18.getTag()
            r6 = r5
            com.tencent.mm.ui.contact.w$c r6 = (com.tencent.p014mm.p136ui.contact.C74576w.C74579c) r6
            r5 = r18
        L_0x0084:
            int r7 = r1 + -1
            java.lang.Object r7 = r0.getItem(r7)
            com.tencent.mm.storage.z1 r7 = (com.tencent.p014mm.storage.C72996z1) r7
            if (r7 != 0) goto L_0x0090
            r7 = -1
            goto L_0x0094
        L_0x0090:
            int r7 = r7.mo62845A2()
        L_0x0094:
            java.lang.Object r8 = r16.getItem(r17)
            com.tencent.mm.storage.z1 r8 = (com.tencent.p014mm.storage.C72996z1) r8
            java.lang.String r9 = "get display show head return null, user[%s] pos[%d]"
            java.lang.String r10 = "MicroMsg.ChatroomContactAdapter"
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 8
            if (r1 != 0) goto L_0x00e2
            java.lang.String r7 = r0.mo103631s(r8, r1)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r15 == 0) goto L_0x00c6
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r11 = r8.getUsername()
            r7[r13] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            r7[r12] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r9, r7)
            android.widget.TextView r7 = r6.f219230b
            r7.setVisibility(r14)
            goto L_0x00d5
        L_0x00c6:
            android.widget.TextView r9 = r6.f219230b
            r9.setVisibility(r13)
            android.widget.TextView r9 = r6.f219230b
            r9.setText(r7)
            android.widget.TextView r7 = r6.f219230b
            r7.setCompoundDrawablesWithIntrinsicBounds(r13, r13, r13, r13)
        L_0x00d5:
            int r1 = r1 + r12
            java.lang.Object r1 = r0.getItem(r1)
            if (r1 != 0) goto L_0x0148
            android.view.ViewGroup r1 = r6.f219232d
            r1.setBackgroundResource(r13)
            goto L_0x0148
        L_0x00e2:
            if (r1 <= 0) goto L_0x013e
            int r15 = r8.mo62845A2()
            if (r15 == r7) goto L_0x013e
            java.lang.String r15 = r0.mo103631s(r8, r1)
            android.view.ViewGroup r4 = r6.f219232d
            r14 = 2131231818(0x7f08044a, float:1.8079728E38)
            r4.setBackgroundResource(r14)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r4 == 0) goto L_0x0115
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.String r11 = r8.getUsername()
            r4[r13] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            r4[r12] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r9, r4)
            android.widget.TextView r4 = r6.f219230b
            r9 = 8
            r4.setVisibility(r9)
            goto L_0x013a
        L_0x0115:
            android.widget.TextView r4 = r6.f219230b
            r4.setVisibility(r13)
            android.widget.TextView r4 = r6.f219230b
            r4.setText(r15)
            int r4 = r8.mo62845A2()
            r9 = 32
            if (r4 != r9) goto L_0x0135
            android.widget.TextView r4 = r6.f219230b
            r9 = 2131234048(0x7f080d00, float:1.808425E38)
            r4.setCompoundDrawablesWithIntrinsicBounds(r9, r13, r13, r13)
            android.widget.TextView r4 = r6.f219230b
            r4.setCompoundDrawablePadding(r11)
            goto L_0x013a
        L_0x0135:
            android.widget.TextView r4 = r6.f219230b
            r4.setCompoundDrawablesWithIntrinsicBounds(r13, r13, r13, r13)
        L_0x013a:
            r0.mo103632t(r6, r1, r7)
            goto L_0x0148
        L_0x013e:
            android.widget.TextView r4 = r6.f219230b
            r9 = 8
            r4.setVisibility(r9)
            r0.mo103632t(r6, r1, r7)
        L_0x0148:
            android.widget.TextView r1 = r6.f219231c
            com.tencent.mm.ui.MMActivity r4 = r0.f219224p
            java.lang.String r7 = r8.getUsername()
            boolean r7 = eb0.C45628s0.m50812z(r7)
            if (r7 != 0) goto L_0x015a
            r7 = 2131101147(0x7f0605db, float:1.7814695E38)
            goto L_0x015d
        L_0x015a:
            r7 = 2131101148(0x7f0605dc, float:1.7814698E38)
        L_0x015d:
            android.content.res.ColorStateList r4 = kg3.C76577a.m92154e(r4, r7)
            r1.setTextColor(r4)
            com.tencent.mm.ui.base.MaskLayout r1 = r6.f219229a
            android.view.View r1 = r1.getContentView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Class<ln.f> r4 = p196ln.C76705f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            java.lang.String r7 = r8.getUsername()
            r4.mo106849z(r1, r7)
            android.graphics.drawable.Drawable r4 = r1.getDrawable()
            boolean r4 = r4 instanceof vd3.C78399i.C78400a
            if (r4 == 0) goto L_0x0197
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            vd3.i$a r1 = (vd3.C78399i.C78400a) r1
            vd3.i r4 = r0.f219227s
            if (r4 == 0) goto L_0x0197
            java.util.ArrayList<java.lang.ref.WeakReference<vd3.i$a>> r4 = r4.f229724e
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r1)
            r4.add(r7)
        L_0x0197:
            com.tencent.mm.ui.base.MaskLayout r1 = r6.f219229a
            r4 = 0
            r1.setMaskDrawable(r4)
            java.lang.String r1 = r8.getUsername()     // Catch:{ Exception -> 0x01ff }
            boolean r1 = eb0.C45628s0.m50748M(r1)     // Catch:{ Exception -> 0x01ff }
            if (r1 == 0) goto L_0x01d8
            di3.d r1 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x01ff }
            ny.h r1 = (p629ny.C76979h) r1     // Catch:{ Exception -> 0x01ff }
            com.tencent.mm.ui.MMActivity r3 = r0.f219224p     // Catch:{ Exception -> 0x01ff }
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x01ff }
            d62.i r2 = (d62.C75339i) r2     // Catch:{ Exception -> 0x01ff }
            java.lang.String r4 = r8.getUsername()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r2 = r2.getDisplayName(r4)     // Catch:{ Exception -> 0x01ff }
            android.widget.TextView r4 = r6.f219231c     // Catch:{ Exception -> 0x01ff }
            float r4 = r4.getTextSize()     // Catch:{ Exception -> 0x01ff }
            int r4 = (int) r4     // Catch:{ Exception -> 0x01ff }
            android.text.SpannableString r1 = r1.op0(r3, r2, r4)     // Catch:{ Exception -> 0x01ff }
            java.lang.Class<he0.j> r2 = he0.C76158j.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x01ff }
            he0.j r2 = (he0.C76158j) r2     // Catch:{ Exception -> 0x01ff }
            com.tencent.mm.ui.MMActivity r3 = r0.f219224p     // Catch:{ Exception -> 0x01ff }
            android.widget.TextView r4 = r6.f219231c     // Catch:{ Exception -> 0x01ff }
            r2.mo106368lU(r3, r4, r1)     // Catch:{ Exception -> 0x01ff }
            goto L_0x0206
        L_0x01d8:
            di3.d r1 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x01ff }
            ny.h r1 = (p629ny.C76979h) r1     // Catch:{ Exception -> 0x01ff }
            com.tencent.mm.ui.MMActivity r3 = r0.f219224p     // Catch:{ Exception -> 0x01ff }
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x01ff }
            d62.i r2 = (d62.C75339i) r2     // Catch:{ Exception -> 0x01ff }
            java.lang.String r4 = r8.getUsername()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r2 = r2.getDisplayName(r4)     // Catch:{ Exception -> 0x01ff }
            android.widget.TextView r4 = r6.f219231c     // Catch:{ Exception -> 0x01ff }
            float r4 = r4.getTextSize()     // Catch:{ Exception -> 0x01ff }
            int r4 = (int) r4     // Catch:{ Exception -> 0x01ff }
            android.text.SpannableString r1 = r1.op0(r3, r2, r4)     // Catch:{ Exception -> 0x01ff }
            android.widget.TextView r2 = r6.f219231c     // Catch:{ Exception -> 0x01ff }
            r2.setText(r1)     // Catch:{ Exception -> 0x01ff }
            goto L_0x0206
        L_0x01ff:
            android.widget.TextView r1 = r6.f219231c
            java.lang.String r2 = ""
            r1.setText(r2)
        L_0x0206:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74576w.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public synchronized void mo1333o() {
        Cursor t3 = C97625j3.m125812b().mo105907v().mo69725t3(this.f219223o, "", (List<String>) null, false, false);
        mo5580b();
        mo7998r(t3);
        notifyDataSetChanged();
    }

    /* renamed from: s */
    public String mo103631s(C72996z1 z1Var, int i) {
        return z1Var.mo62845A2() == 31 ? "" : z1Var.mo62845A2() == 43 ? this.f219224p.getString(C0966R.string.i6z) : String.valueOf((char) z1Var.mo62845A2());
    }

    /* renamed from: t */
    public final void mo103632t(C74579c cVar, int i, int i2) {
        int i3 = i + 1;
        C72996z1 z1Var = (C72996z1) getItem(i3);
        if (z1Var == null || (z1Var.mo62845A2() != i2 && !Util.isNullOrNil(mo103631s(z1Var, i3)))) {
            cVar.f219232d.setBackgroundResource(0);
        }
    }
}
