package f22;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.label.p067ui.searchContact.ContactDataItemList;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f22.C58909a;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: f22.d */
public final class C58912d extends C60896i<C58909a> {

    /* renamed from: e */
    public ContactDataItemList f168585e;

    public C58912d(ContactDataItemList contactDataItemList) {
        this.f168585e = contactDataItemList;
    }

    /* renamed from: b */
    public C60905o mo25318b(RecyclerView recyclerView, View view) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(view, "convertView");
        long c = C31543z5.m39453c();
        C58909a.C58910a aVar = new C58909a.C58910a(view);
        Log.m105924i("MicroMsg.Mvvm.AddressItemConvert", "createViewHolder " + (C31543z5.m39453c() - c));
        return aVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cm6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0281  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r20, jq3.C9493c r21, int r22, int r23, boolean r24, java.util.List r25) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            f22.a r1 = (f22.C58909a) r1
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "dataItem"
            gy3.C87412m.m108594g(r1, r2)
            long r2 = eb0.C31543z5.m39453c()
            f22.a$a r0 = (f22.C58909a.C58910a) r0
            android.view.View r4 = r0.f168573G
            r5 = 0
            if (r4 == 0) goto L_0x0020
            android.content.Context r4 = r4.getContext()
            goto L_0x0021
        L_0x0020:
            r4 = r5
        L_0x0021:
            if (r4 == 0) goto L_0x0411
            java.lang.Class<f62.k0> r6 = f62.C75700k0.class
            java.lang.Class<d62.i> r7 = d62.C75339i.class
            lv1.n r8 = r1.f168565f
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x0063
            com.tencent.mm.storage.z1 r8 = r1.f168570n
            if (r8 != 0) goto L_0x0061
            k40.a r8 = f40.C86709a0.m107533q(r6)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            lv1.n r11 = r1.f168565f
            gy3.C87412m.m108591d(r11)
            java.lang.String r11 = r11.f292151e
            com.tencent.mm.storage.z1 r8 = r8.mo69674W2(r11)
            r1.f168570n = r8
            if (r8 != 0) goto L_0x0061
            k40.a r6 = f40.C86709a0.m107533q(r6)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            lv1.n r8 = r1.f168565f
            gy3.C87412m.m108591d(r8)
            java.lang.String r8 = r8.f292151e
            com.tencent.mm.storage.z1 r6 = r6.mo69656H3(r8)
            r1.f168570n = r6
        L_0x0061:
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            com.tencent.mm.storage.z1 r8 = r1.f168570n
            if (r8 != 0) goto L_0x007e
            java.lang.String r6 = r1.f168564e
            java.lang.Object[] r7 = new java.lang.Object[r9]
            int r8 = r1.f168563d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r10] = r8
            java.lang.String r8 = "filling dataItem Occur Error Contact is null, position=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            r7 = r5
        L_0x007a:
            r5 = r19
            goto L_0x02f4
        L_0x007e:
            java.lang.String r8 = r8.getUsername()
            r1.f168566g = r8
            java.lang.Class<he0.j> r8 = he0.C76158j.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            he0.j r8 = (he0.C76158j) r8
            com.tencent.mm.storage.z1 r11 = r1.f168570n
            if (r11 == 0) goto L_0x0095
            java.lang.String r11 = r11.mo73980x2()
            goto L_0x0096
        L_0x0095:
            r11 = r5
        L_0x0096:
            com.tencent.mm.storage.z1 r12 = r1.f168570n
            if (r12 == 0) goto L_0x009f
            java.lang.String r12 = r12.mo73976t2()
            goto L_0x00a0
        L_0x009f:
            r12 = r5
        L_0x00a0:
            java.lang.String r8 = r8.mo106373wo(r11, r12)
            r1.f168569j = r8
            if (r6 == 0) goto L_0x02a8
            lv1.n r6 = r1.f168565f
            com.tencent.mm.storage.z1 r11 = r1.f168570n
            android.content.res.Resources r12 = r4.getResources()
            r13 = 2
            if (r11 == 0) goto L_0x0221
            di3.d r7 = di3.C86312j.m106911c(r7)
            d62.i r7 = (d62.C75339i) r7
            java.lang.String r14 = r11.getUsername()
            java.lang.String r7 = r7.pv0(r11, r14)
            gy3.C87412m.m108591d(r6)
            int r14 = r6.f292149c
            r15 = 11
            if (r14 == r15) goto L_0x0186
            r15 = 2131835407(0x7f113a0f, float:1.9303952E38)
            switch(r14) {
                case 1: goto L_0x0224;
                case 2: goto L_0x0103;
                case 3: goto L_0x00ff;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00ea;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00d5;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            switch(r14) {
                case 15: goto L_0x016f;
                case 16: goto L_0x0111;
                case 17: goto L_0x0106;
                case 18: goto L_0x0106;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x0222
        L_0x00d5:
            java.lang.String r6 = r11.getNickname()
            java.lang.String r11 = r12.getString(r15)
            r5 = 1
            goto L_0x021b
        L_0x00e0:
            java.lang.String r6 = r11.getNickname()
            java.lang.String r11 = r12.getString(r15)
            goto L_0x021a
        L_0x00ea:
            java.lang.String r6 = r11.getNickname()
            java.lang.String r11 = r12.getString(r15)
            goto L_0x0219
        L_0x00f4:
            java.lang.String r6 = r11.f149513S0
            r11 = 2131835402(0x7f113a0a, float:1.9303942E38)
            java.lang.String r11 = r12.getString(r11)
            goto L_0x0219
        L_0x00ff:
            r5 = 1
            r10 = 1
            goto L_0x0225
        L_0x0103:
            r10 = 1
            goto L_0x0224
        L_0x0106:
            java.lang.String r6 = r6.f292154h
            r11 = 2131835404(0x7f113a0c, float:1.9303946E38)
            java.lang.String r11 = r12.getString(r11)
            goto L_0x0219
        L_0x0111:
            java.lang.String r6 = r6.f292154h
            java.lang.String r11 = r1.f168571o
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r14 != 0) goto L_0x0166
            boolean r14 = android.text.TextUtils.isEmpty(r11)
            if (r14 != 0) goto L_0x0166
            java.lang.String r14 = "​"
            java.lang.String[] r14 = new java.lang.String[]{r14}
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            r20 = r6
            r21 = r14
            r22 = r15
            r23 = r16
            r24 = r17
            r25 = r18
            java.util.List r14 = z04.C112550d0.m153785U(r20, r21, r22, r23, r24, r25)
            java.lang.String[] r15 = new java.lang.String[r10]
            java.lang.Object[] r14 = r14.toArray(r15)
            java.lang.String r15 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r14, r15)
            java.lang.String[] r14 = (java.lang.String[]) r14
            int r15 = r14.length
            r9 = 0
        L_0x014e:
            if (r9 >= r15) goto L_0x0166
            r8 = r14[r9]
            boolean r16 = android.text.TextUtils.isEmpty(r8)
            if (r16 != 0) goto L_0x0163
            gy3.C87412m.m108591d(r11)
            boolean r16 = z04.C112551y.m153820t(r8, r11, r10, r13, r5)
            if (r16 == 0) goto L_0x0163
            r6 = r8
            goto L_0x0166
        L_0x0163:
            int r9 = r9 + 1
            goto L_0x014e
        L_0x0166:
            r8 = 2131835406(0x7f113a0e, float:1.930395E38)
            java.lang.String r11 = r12.getString(r8)
            goto L_0x0219
        L_0x016f:
            java.lang.String r6 = r11.mo62913l2()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 == 0) goto L_0x017d
            java.lang.String r6 = r11.getUsername()
        L_0x017d:
            r8 = 2131835413(0x7f113a15, float:1.9303964E38)
            java.lang.String r11 = r12.getString(r8)
            goto L_0x0219
        L_0x0186:
            java.lang.Class<kv1.q> r6 = kv1.C99260q.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            kv1.q r6 = (kv1.C99260q) r6
            kv1.m r6 = r6.mo128761xc()
            java.lang.String r8 = r11.mo73974r2()
            com.tencent.mm.plugin.fts.g r6 = (com.tencent.p014mm.plugin.fts.C68985g) r6
            java.util.List r6 = r6.mo94942c(r8)
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            lv1.i r9 = r1.f168572p
            gy3.C87412m.m108591d(r9)
            java.lang.String[] r9 = r9.f292122c
            java.lang.String r11 = "getFTSQuery()!!.phrases"
            gy3.C87412m.m108593f(r9, r11)
            int r11 = r9.length
            r14 = 0
        L_0x01af:
            if (r14 >= r11) goto L_0x01fa
            r15 = r9[r14]
            r16 = r6
            java.util.ArrayList r16 = (java.util.ArrayList) r16
            java.util.Iterator r16 = r16.iterator()
        L_0x01bb:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x01f4
            java.lang.Object r17 = r16.next()
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class<vr.e> r17 = p255vr.C65873e.class
            di3.d r17 = di3.C86312j.m106911c(r17)
            r13 = r17
            vr.e r13 = (p255vr.C65873e) r13
            java.lang.String r13 = r13.la0(r5)
            java.lang.String r10 = "preProcessTag"
            gy3.C87412m.m108593f(r13, r10)
            java.lang.String r10 = "keyword"
            gy3.C87412m.m108593f(r15, r10)
            r10 = 0
            boolean r13 = z04.C112550d0.m153801u(r13, r15, r10)
            if (r13 == 0) goto L_0x01f0
            r8.append(r5)
            java.lang.String r5 = ","
            r8.append(r5)
        L_0x01f0:
            r5 = 0
            r10 = 0
            r13 = 2
            goto L_0x01bb
        L_0x01f4:
            int r14 = r14 + 1
            r5 = 0
            r10 = 0
            r13 = 2
            goto L_0x01af
        L_0x01fa:
            r8.trimToSize()
            int r5 = r8.length()
            if (r5 != 0) goto L_0x0206
            java.lang.String r5 = ""
            goto L_0x0211
        L_0x0206:
            int r5 = r8.length()
            int r5 = r5 + -1
            r6 = 0
            java.lang.String r5 = r8.substring(r6, r5)
        L_0x0211:
            r6 = r5
            r5 = 2131835412(0x7f113a14, float:1.9303962E38)
            java.lang.String r11 = r12.getString(r5)
        L_0x0219:
            r9 = 0
        L_0x021a:
            r5 = 0
        L_0x021b:
            r8 = r7
            r10 = r9
            r9 = 0
            r7 = r5
            r5 = 1
            goto L_0x022a
        L_0x0221:
            r7 = 0
        L_0x0222:
            r9 = 0
            r10 = 0
        L_0x0224:
            r5 = 0
        L_0x0225:
            r8 = r7
            r6 = 0
            r11 = 0
            r7 = r5
            r5 = 0
        L_0x022a:
            if (r9 == 0) goto L_0x024f
            java.lang.String r9 = r1.f168564e
            java.lang.String r12 = "highlight first line"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r12)
            r9 = 2131165591(0x7f070197, float:1.7945403E38)
            int r9 = kg3.C76577a.m92157h(r4, r9)
            android.text.SpannableString r8 = r1.mo84105b(r4, r8, r9)
            r1.f168567h = r8
            lv1.i r9 = r1.f168572p
            lv1.f r8 = lv1.C99667f.m130091d(r8, r9, r10, r7)
            lv1.g r8 = kv1.C99254i.m129308e(r8)
            java.lang.CharSequence r8 = r8.f292107a
            r1.f168567h = r8
            goto L_0x025c
        L_0x024f:
            r9 = 2131165591(0x7f070197, float:1.7945403E38)
            int r9 = kg3.C76577a.m92157h(r4, r9)
            android.text.SpannableString r8 = r1.mo84105b(r4, r8, r9)
            r1.f168567h = r8
        L_0x025c:
            r8 = 2131165537(0x7f070161, float:1.7945294E38)
            if (r5 == 0) goto L_0x0281
            java.lang.String r5 = r1.f168564e
            java.lang.String r9 = "highlight second line"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r9)
            int r5 = kg3.C76577a.m92157h(r4, r8)
            android.text.SpannableString r5 = r1.mo84105b(r4, r6, r5)
            r1.f168568i = r5
            lv1.i r6 = r1.f168572p
            lv1.f r5 = lv1.C99667f.m130091d(r5, r6, r10, r7)
            lv1.g r5 = kv1.C99254i.m129308e(r5)
            java.lang.CharSequence r5 = r5.f292107a
            r1.f168568i = r5
            goto L_0x028b
        L_0x0281:
            int r5 = kg3.C76577a.m92157h(r4, r8)
            android.text.SpannableString r5 = r1.mo84105b(r4, r6, r5)
            r1.f168568i = r5
        L_0x028b:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r5 != 0) goto L_0x02a4
            java.lang.CharSequence r5 = r1.f168568i
            if (r5 == 0) goto L_0x02a4
            r6 = 2
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r6]
            r7 = 0
            r6[r7] = r11
            r7 = 1
            r6[r7] = r5
            java.lang.CharSequence r5 = android.text.TextUtils.concat(r6)
            r1.f168568i = r5
        L_0x02a4:
            r5 = r19
            r7 = 0
            goto L_0x02f4
        L_0x02a8:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x02c2
            di3.d r5 = di3.C86312j.m106911c(r7)
            d62.i r5 = (d62.C75339i) r5
            com.tencent.mm.storage.z1 r6 = r1.f168570n
            java.lang.String r5 = r5.mo62520pi(r6)
            java.lang.String r6 = "{\n                Servic…me(contact)\n            }"
            gy3.C87412m.m108593f(r5, r6)
            r7 = 0
            goto L_0x02dd
        L_0x02c2:
            di3.d r5 = di3.C86312j.m106911c(r7)
            d62.i r5 = (d62.C75339i) r5
            com.tencent.mm.storage.z1 r6 = r1.f168570n
            if (r6 == 0) goto L_0x02d1
            java.lang.String r6 = r6.getUsername()
            goto L_0x02d2
        L_0x02d1:
            r6 = 0
        L_0x02d2:
            r7 = 0
            java.lang.String r5 = r5.mo62519pb(r6, r7)
            java.lang.String r6 = "{\n                Servic…Chatroom())\n            }"
            gy3.C87412m.m108593f(r5, r6)
        L_0x02dd:
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            r8 = 2131165591(0x7f070197, float:1.7945403E38)
            int r8 = kg3.C76577a.m92157h(r4, r8)
            android.text.SpannableString r5 = r6.op0(r4, r5, r8)
            r1.f168567h = r5
            goto L_0x007a
        L_0x02f4:
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList r6 = r5.f168585e
            if (r6 == 0) goto L_0x030d
            java.util.List<java.lang.String> r6 = r6.f19778x
            if (r6 == 0) goto L_0x030d
            com.tencent.mm.storage.z1 r8 = r1.f168570n
            if (r8 == 0) goto L_0x0304
            java.lang.String r7 = r8.getUsername()
        L_0x0304:
            boolean r6 = sx3.C110818d0.m150903D(r6, r7)
            r7 = 1
            if (r6 != r7) goto L_0x030d
            r6 = 1
            goto L_0x030e
        L_0x030d:
            r6 = 0
        L_0x030e:
            java.lang.Class<vr.h> r7 = p255vr.C78470h.class
            java.lang.String r8 = r1.f168566g
            if (r8 == 0) goto L_0x0338
            int r8 = r8.length()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            gy3.C87412m.m108591d(r8)
            int r8 = r8.intValue()
            if (r8 <= 0) goto L_0x0338
            java.lang.Class<ln.f> r8 = p196ln.C76705f.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ln.f r8 = (p196ln.C76705f) r8
            android.widget.ImageView r9 = r0.f168574H
            java.lang.String r10 = r1.f168566g
            r11 = 1036831949(0x3dcccccd, float:0.1)
            r8.D20(r9, r10, r11)
            goto L_0x0343
        L_0x0338:
            android.widget.ImageView r8 = r0.f168574H
            gy3.C87412m.m108591d(r8)
            r9 = 2131231871(0x7f08047f, float:1.8079835E38)
            r8.setImageResource(r9)
        L_0x0343:
            di3.d r8 = di3.C86312j.m106911c(r7)
            vr.h r8 = (p255vr.C78470h) r8
            java.lang.CharSequence r9 = r1.f168567h
            android.widget.TextView r10 = r0.f168575I
            r8.mo108300VH(r9, r10)
            di3.d r7 = di3.C86312j.m106911c(r7)
            vr.h r7 = (p255vr.C78470h) r7
            java.lang.CharSequence r8 = r1.f168568i
            android.widget.TextView r9 = r0.f168576J
            r7.mo108300VH(r8, r9)
            android.widget.CheckBox r7 = r0.f168577K
            gy3.C87412m.m108591d(r7)
            r8 = 2131234031(0x7f080cef, float:1.8084216E38)
            r7.setBackgroundResource(r8)
            android.widget.CheckBox r7 = r0.f168577K
            gy3.C87412m.m108591d(r7)
            r7.setChecked(r6)
            android.widget.CheckBox r6 = r0.f168577K
            gy3.C87412m.m108591d(r6)
            r7 = 1
            r6.setEnabled(r7)
            android.widget.CheckBox r6 = r0.f168577K
            gy3.C87412m.m108591d(r6)
            r8 = 0
            r6.setVisibility(r8)
            android.view.View r6 = r0.f168573G
            gy3.C87412m.m108591d(r6)
            r8 = 2131230747(0x7f08001b, float:1.8077556E38)
            r6.setBackgroundResource(r8)
            com.tencent.mm.storage.z1 r6 = r1.f168570n
            if (r6 == 0) goto L_0x0399
            int r6 = r6.mo73975s2()
            if (r6 != r7) goto L_0x0399
            r9 = 1
            goto L_0x039a
        L_0x0399:
            r9 = 0
        L_0x039a:
            if (r9 == 0) goto L_0x03b4
            android.widget.TextView r6 = r0.f168576J
            gy3.C87412m.m108591d(r6)
            r7 = 0
            r6.setVisibility(r7)
            android.widget.TextView r6 = r0.f168576J
            gy3.C87412m.m108591d(r6)
            r7 = 2131835477(0x7f113a55, float:1.9304094E38)
            java.lang.String r7 = r4.getString(r7)
            r6.setText(r7)
        L_0x03b4:
            android.widget.TextView r6 = r0.f168580N
            if (r6 == 0) goto L_0x03da
            r7 = 8
            r6.setVisibility(r7)
            java.lang.String r6 = r1.f168566g
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85843n5(r6)
            if (r6 == 0) goto L_0x03da
            java.lang.String r6 = r1.f168569j
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x03da
            android.widget.TextView r6 = r0.f168575I
            gy3.C87412m.m108591d(r6)
            f22.b r7 = new f22.b
            r7.<init>(r0, r1, r4, r1)
            r6.post(r7)
        L_0x03da:
            android.view.View r4 = r0.f168579M
            gy3.C87412m.m108591d(r4)
            f22.c r6 = new f22.c
            r6.<init>(r1)
            r4.setOnClickListener(r6)
            android.widget.ImageView r1 = r0.f168574H
            gy3.C87412m.m108591d(r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r4)
            android.widget.TextView r1 = r0.f168575I
            gy3.C87412m.m108591d(r1)
            r1.setAlpha(r4)
            android.widget.TextView r1 = r0.f168576J
            gy3.C87412m.m108591d(r1)
            r1.setAlpha(r4)
            android.widget.CheckBox r1 = r0.f168577K
            gy3.C87412m.m108591d(r1)
            r1.setAlpha(r4)
            android.widget.TextView r1 = r0.f168580N
            if (r1 == 0) goto L_0x0413
            r1.setAlpha(r4)
            goto L_0x0413
        L_0x0411:
            r5 = r19
        L_0x0413:
            android.view.View r1 = r0.f168573G
            if (r1 == 0) goto L_0x041a
            r1.setTag(r0)
        L_0x041a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onBindViewHolder "
            r0.append(r1)
            long r6 = eb0.C31543z5.m39453c()
            long r6 = r6 - r2
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Mvvm.AddressItemConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f22.C58912d.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
