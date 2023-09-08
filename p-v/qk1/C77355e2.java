package qk1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gl3.C75921a;
import gl3.C75922b;
import gy3.C87412m;
import java.util.regex.Pattern;
import lv1.C99681n;

/* renamed from: qk1.e2 */
public final class C77355e2 extends C75921a {

    /* renamed from: G */
    public static final Pattern f225546G = Pattern.compile(";");

    /* renamed from: B */
    public CharSequence f225547B;

    /* renamed from: C */
    public CharSequence f225548C;

    /* renamed from: D */
    public C99681n f225549D;

    /* renamed from: E */
    public final C77357b f225550E = new C77357b();

    /* renamed from: F */
    public final C77356a f225551F = new C77356a(this);

    /* renamed from: qk1.e2$a */
    public final class C77356a implements C75922b.C75923a {

        /* renamed from: a */
        public ImageView f225552a;

        /* renamed from: b */
        public TextView f225553b;

        /* renamed from: c */
        public TextView f225554c;

        /* renamed from: d */
        public TextView f225555d;

        /* renamed from: e */
        public CheckBox f225556e;

        public C77356a(C77355e2 e2Var) {
        }
    }

    /* renamed from: qk1.e2$b */
    public final class C77357b implements C75922b.C75924b {
        public C77357b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0057  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67029a(android.content.Context r6, gl3.C75922b.C75923a r7, gl3.C75922b r8, boolean r9, boolean r10) {
            /*
                r5 = this;
                java.lang.Class<vr.h> r0 = p255vr.C78470h.class
                java.lang.String r1 = "context"
                gy3.C87412m.m108594g(r6, r1)
                java.lang.String r1 = "holder"
                gy3.C87412m.m108594g(r7, r1)
                java.lang.String r1 = "data"
                gy3.C87412m.m108594g(r8, r1)
                qk1.e2$a r7 = (qk1.C77355e2.C77356a) r7
                qk1.e2 r8 = (qk1.C77355e2) r8
                java.lang.String r1 = r8.f222602y
                if (r1 == 0) goto L_0x0035
                gy3.C87412m.m108591d(r1)
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0035
                java.lang.Class<ln.f> r1 = p196ln.C76705f.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ln.f r1 = (p196ln.C76705f) r1
                android.widget.ImageView r2 = r7.f225552a
                java.lang.String r3 = r8.f222602y
                r4 = 1036831949(0x3dcccccd, float:0.1)
                r1.D20(r2, r3, r4)
                goto L_0x0040
            L_0x0035:
                android.widget.ImageView r1 = r7.f225552a
                gy3.C87412m.m108591d(r1)
                r2 = 2131231871(0x7f08047f, float:1.8079835E38)
                r1.setImageResource(r2)
            L_0x0040:
                di3.d r1 = di3.C86312j.m106911c(r0)
                vr.h r1 = (p255vr.C78470h) r1
                java.lang.CharSequence r2 = r8.f222601x
                android.widget.TextView r3 = r7.f225553b
                r1.mo108300VH(r2, r3)
                java.lang.String r1 = r8.f222602y
                boolean r1 = eb0.C45628s0.m50748M(r1)
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0075
                android.content.res.Resources r6 = r6.getResources()
                r1 = 2131756796(0x7f1006fc, float:1.914451E38)
                android.graphics.drawable.Drawable r6 = r6.getDrawable(r1)
                int r1 = r6.getIntrinsicWidth()
                int r4 = r6.getIntrinsicHeight()
                r6.setBounds(r2, r2, r1, r4)
                android.widget.TextView r1 = r7.f225553b
                if (r1 == 0) goto L_0x007c
                r1.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r6, r3)
                goto L_0x007c
            L_0x0075:
                android.widget.TextView r6 = r7.f225553b
                if (r6 == 0) goto L_0x007c
                r6.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            L_0x007c:
                di3.d r6 = di3.C86312j.m106911c(r0)
                vr.h r6 = (p255vr.C78470h) r6
                java.lang.CharSequence r1 = r8.f225548C
                android.widget.TextView r3 = r7.f225554c
                r6.mo108300VH(r1, r3)
                di3.d r6 = di3.C86312j.m106911c(r0)
                vr.h r6 = (p255vr.C78470h) r6
                java.lang.CharSequence r8 = r8.f225547B
                android.widget.TextView r0 = r7.f225555d
                r6.mo108300VH(r8, r0)
                qk1.e2 r6 = qk1.C77355e2.this
                boolean r6 = r6.f222608e
                if (r6 == 0) goto L_0x00c9
                r6 = 1
                if (r9 == 0) goto L_0x00b0
                android.widget.CheckBox r8 = r7.f225556e
                if (r8 != 0) goto L_0x00a4
                goto L_0x00a7
            L_0x00a4:
                r8.setChecked(r6)
            L_0x00a7:
                android.widget.CheckBox r6 = r7.f225556e
                if (r6 != 0) goto L_0x00ac
                goto L_0x00c0
            L_0x00ac:
                r6.setEnabled(r2)
                goto L_0x00c0
            L_0x00b0:
                android.widget.CheckBox r8 = r7.f225556e
                if (r8 != 0) goto L_0x00b5
                goto L_0x00b8
            L_0x00b5:
                r8.setChecked(r10)
            L_0x00b8:
                android.widget.CheckBox r8 = r7.f225556e
                if (r8 != 0) goto L_0x00bd
                goto L_0x00c0
            L_0x00bd:
                r8.setEnabled(r6)
            L_0x00c0:
                android.widget.CheckBox r6 = r7.f225556e
                if (r6 != 0) goto L_0x00c5
                goto L_0x00d3
            L_0x00c5:
                r6.setVisibility(r2)
                goto L_0x00d3
            L_0x00c9:
                android.widget.CheckBox r6 = r7.f225556e
                if (r6 != 0) goto L_0x00ce
                goto L_0x00d3
            L_0x00ce:
                r7 = 8
                r6.setVisibility(r7)
            L_0x00d3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qk1.C77355e2.C77357b.mo67029a(android.content.Context, gl3.b$a, gl3.b, boolean, boolean):void");
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.aig, viewGroup, false);
            C77356a aVar = C77355e2.this.f225551F;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveMultiChatRoomDataItem.FinderLiveMultiChatRoomViewHolder");
            View findViewById = inflate.findViewById(C0966R.C0970id.dtg);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.f225552a = (ImageView) findViewById;
            View findViewById2 = inflate.findViewById(C0966R.C0970id.dtk);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f225553b = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(C0966R.C0970id.dth);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById3;
            aVar.f225554c = textView;
            textView.setVisibility(8);
            View findViewById4 = inflate.findViewById(C0966R.C0970id.dtj);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f225555d = (TextView) findViewById4;
            View findViewById5 = inflate.findViewById(C0966R.C0970id.dti);
            C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.widget.CheckBox");
            aVar.f225556e = (CheckBox) findViewById5;
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "data");
            return false;
        }
    }

    public C77355e2(int i) {
        super(4, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67027a(android.content.Context r16, gl3.C75922b.C75923a r17) {
        /*
            r15 = this;
            r0 = r15
            r7 = r16
            java.lang.Class<d62.i> r1 = d62.C75339i.class
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r7, r3)
            lv1.n r3 = r0.f225549D
            r8 = 0
            r9 = 1
            if (r3 == 0) goto L_0x004c
            com.tencent.mm.storage.z1 r3 = r0.f222600A
            if (r3 != 0) goto L_0x004a
            k40.a r3 = f40.C86709a0.m107533q(r2)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            lv1.n r4 = r0.f225549D
            gy3.C87412m.m108591d(r4)
            java.lang.String r4 = r4.f292151e
            com.tencent.mm.storage.z1 r3 = r3.mo69674W2(r4)
            r15.mo106181j(r3)
            com.tencent.mm.storage.z1 r3 = r0.f222600A
            if (r3 != 0) goto L_0x004a
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            lv1.n r3 = r0.f225549D
            gy3.C87412m.m108591d(r3)
            java.lang.String r3 = r3.f292151e
            com.tencent.mm.storage.z1 r2 = r2.mo69656H3(r3)
            r15.mo106181j(r2)
        L_0x004a:
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            com.tencent.mm.storage.z1 r3 = r0.f222600A
            if (r3 != 0) goto L_0x0056
            java.lang.String r1 = ""
            r0.f222601x = r1
            return
        L_0x0056:
            java.lang.String r3 = r3.getUsername()
            r0.f222602y = r3
            r3 = 41
            r4 = 40
            if (r2 == 0) goto L_0x0156
            r2 = r17
            qk1.e2$a r2 = (qk1.C77355e2.C77356a) r2
            lv1.n r2 = r0.f225549D
            com.tencent.mm.storage.z1 r5 = r0.f222600A
            java.lang.String r6 = "contact"
            gy3.C87412m.m108593f(r5, r6)
            android.content.res.Resources r10 = r16.getResources()
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            java.lang.String r6 = r5.getUsername()
            java.lang.String r11 = r1.pv0(r5, r6)
            gy3.C87412m.m108591d(r2)
            int r1 = r2.f292149c
            r6 = 2131835407(0x7f113a0f, float:1.9303952E38)
            r12 = 0
            if (r1 == r9) goto L_0x0127
            r13 = 2
            if (r1 == r13) goto L_0x0121
            r14 = 3
            if (r1 == r14) goto L_0x011c
            r14 = 5
            if (r1 == r14) goto L_0x0127
            r14 = 6
            if (r1 == r14) goto L_0x0121
            r14 = 7
            if (r1 == r14) goto L_0x011c
            r6 = 38
            if (r1 == r6) goto L_0x00a1
            goto L_0x011a
        L_0x00a1:
            f40.o r1 = f40.C86709a0.m107535s()
            zh3.f r1 = r1.f251811i
            java.lang.String[] r6 = new java.lang.String[r9]
            java.lang.String r5 = r5.getUsername()
            r6[r8] = r5
            java.lang.String r5 = "SELECT memberlist FROM chatroom WHERE chatroomname=?;"
            android.database.Cursor r1 = r1.rawQuery(r5, r6, r13)
            boolean r5 = r1.moveToFirst()
            if (r5 == 0) goto L_0x00ce
            java.lang.String r5 = r1.getString(r8)
            r1.close()
            if (r5 != 0) goto L_0x00c6
            r1 = r12
            goto L_0x00cc
        L_0x00c6:
            java.util.regex.Pattern r1 = f225546G
            java.lang.String[] r1 = r1.split(r5)
        L_0x00cc:
            r5 = r1
            goto L_0x00d2
        L_0x00ce:
            r1.close()
            r5 = r12
        L_0x00d2:
            if (r5 == 0) goto L_0x00ec
            int r1 = r5.length
            if (r1 <= 0) goto L_0x00ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            int r4 = r5.length
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.f225547B = r1
        L_0x00ec:
            if (r5 == 0) goto L_0x011a
            java.util.List<lv1.h> r1 = r2.f292160n
            if (r1 == 0) goto L_0x011a
            java.lang.Class<vr.h> r1 = p255vr.C78470h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.h r1 = (p255vr.C78470h) r1
            java.util.List<lv1.h> r3 = r2.f292160n
            lv1.i r6 = r0.f222603z
            android.text.TextPaint r12 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            r2 = r16
            r4 = r5
            r5 = r6
            r6 = r12
            java.lang.CharSequence r1 = r1.yk0(r2, r3, r4, r5, r6)
            r2 = 2131835405(0x7f113a0d, float:1.9303948E38)
            java.lang.String r2 = r10.getString(r2)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r13]
            r3[r8] = r2
            r3[r9] = r1
            java.lang.CharSequence r12 = android.text.TextUtils.concat(r3)
        L_0x011a:
            r9 = 0
            goto L_0x012a
        L_0x011c:
            r10.getString(r6)
            r8 = 1
            goto L_0x0124
        L_0x0121:
            r10.getString(r6)
        L_0x0124:
            r1 = r8
            r8 = 1
            goto L_0x012b
        L_0x0127:
            r10.getString(r6)
        L_0x012a:
            r1 = 0
        L_0x012b:
            r2 = 2131165537(0x7f070161, float:1.7945294E38)
            if (r9 == 0) goto L_0x0149
            int r2 = kg3.C76577a.m92157h(r7, r2)
            android.text.SpannableString r2 = r15.mo106188i(r7, r11, r2)
            r0.f222601x = r2
            lv1.i r3 = r0.f222603z
            lv1.f r1 = lv1.C99667f.m130091d(r2, r3, r8, r1)
            lv1.g r1 = kv1.C99254i.m129308e(r1)
            java.lang.CharSequence r1 = r1.f292107a
            r0.f222601x = r1
            goto L_0x0153
        L_0x0149:
            int r1 = kg3.C76577a.m92157h(r7, r2)
            android.text.SpannableString r1 = r15.mo106188i(r7, r11, r1)
            r0.f222601x = r1
        L_0x0153:
            r0.f225548C = r12
            goto L_0x0187
        L_0x0156:
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            com.tencent.mm.storage.z1 r2 = r0.f222600A
            java.lang.String r5 = r2.getUsername()
            java.lang.String r1 = r1.pv0(r2, r5)
            r0.f222601x = r1
            lv1.n r1 = r0.f225549D
            if (r1 == 0) goto L_0x0187
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            lv1.n r2 = r0.f225549D
            gy3.C87412m.m108591d(r2)
            long r4 = r2.f292150d
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.f225547B = r1
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C77355e2.mo67027a(android.content.Context, gl3.b$a):void");
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f225550E;
    }
}
