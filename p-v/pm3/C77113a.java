package pm3;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C75339i;
import di3.C86312j;
import gy3.C87412m;
import kg3.C76577a;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99671h;
import lv1.C99672i;
import p629ny.C76979h;
import rx3.C13598b0;

/* renamed from: pm3.a */
public final class C77113a {

    /* renamed from: a */
    public static final C77114a f225222a = new C77114a();

    /* renamed from: pm3.a$a */
    public static final class C77114a {
        /* renamed from: a */
        public final C77118d mo107428a(AppCompatActivity appCompatActivity, C72996z1 z1Var, C99671h hVar, C99672i iVar, C44661m1 m1Var) {
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3;
            CharSequence charSequence4;
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(z1Var, "contact");
            C87412m.m108594g(m1Var, "chatroomMember");
            String pb = ((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(z1Var.getUsername(), m1Var.field_chatroomname);
            C13598b0 b0Var = null;
            String str = hVar != null ? hVar.f292113e : null;
            if (hVar == null || str == null) {
                charSequence2 = null;
                charSequence = null;
            } else {
                if (C87412m.m108589b(pb, hVar.f292114f)) {
                    SpannableString d = C77113a.f225222a.mo107431d(appCompatActivity, pb, C76577a.m92157h(appCompatActivity, C0966R.dimen.f3927j7));
                    C99667f fVar = new C99667f();
                    fVar.f292088a = d;
                    fVar.f292089b = iVar;
                    fVar.f292090c = hVar.f292117i;
                    fVar.f292091d = hVar.f292118j;
                    charSequence3 = C99254i.m129308e(fVar).f292107a;
                    charSequence4 = null;
                } else {
                    C77114a aVar = C77113a.f225222a;
                    CharSequence d2 = aVar.mo107431d(appCompatActivity, pb, C76577a.m92157h(appCompatActivity, C0966R.dimen.f3927j7));
                    SpannableString d3 = aVar.mo107431d(appCompatActivity, hVar.f292114f, C76577a.m92157h(appCompatActivity, C0966R.dimen.f3881hq));
                    C99667f fVar2 = new C99667f();
                    fVar2.f292088a = d3;
                    fVar2.f292089b = iVar;
                    fVar2.f292090c = hVar.f292117i;
                    fVar2.f292091d = hVar.f292118j;
                    charSequence4 = TextUtils.concat(new CharSequence[]{hVar.f292115g, C99254i.m129308e(fVar2).f292107a});
                    charSequence3 = d2;
                }
                charSequence = charSequence4;
                charSequence2 = charSequence3;
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                charSequence2 = mo107431d(appCompatActivity, pb, C76577a.m92157h(appCompatActivity, C0966R.dimen.f3927j7));
            }
            C77118d dVar = new C77118d();
            dVar.f225226a = charSequence2;
            dVar.f225227b = charSequence;
            return dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
            r5 = null;
            r7 = null;
            r9 = false;
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ec, code lost:
            r16 = null;
            r14 = r13;
            r9 = true;
            r13 = false;
            r6 = r3;
            r3 = false;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final pm3.C77118d mo107429b(androidx.appcompat.app.AppCompatActivity r25, lv1.C99672i r26, com.tencent.p014mm.storage.C72996z1 r27, lv1.C99681n r28, com.tencent.p014mm.storage.C44661m1 r29) {
            /*
                r24 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r3 = r28
                java.lang.Class<d62.i> r4 = d62.C75339i.class
                java.lang.String r5 = "activity"
                gy3.C87412m.m108594g(r0, r5)
                java.lang.String r5 = "contact"
                gy3.C87412m.m108594g(r2, r5)
                r6 = 0
                if (r3 == 0) goto L_0x0299
                if (r1 == 0) goto L_0x0299
                android.content.res.Resources r7 = r25.getResources()
                di3.d r8 = di3.C86312j.m106911c(r4)
                d62.i r8 = (d62.C75339i) r8
                java.lang.String r9 = r27.getUsername()
                java.lang.String r8 = r8.pv0(r2, r9)
                int r9 = r3.f292149c
                r10 = 11
                java.lang.String r11 = ""
                r12 = 2
                r14 = 0
                if (r9 == r10) goto L_0x018e
                r10 = 38
                java.lang.String r15 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                if (r9 == r10) goto L_0x00f5
                r10 = 2131835407(0x7f113a0f, float:1.9303952E38)
                switch(r9) {
                    case 1: goto L_0x0086;
                    case 2: goto L_0x007f;
                    case 3: goto L_0x007d;
                    case 4: goto L_0x0072;
                    case 5: goto L_0x0068;
                    case 6: goto L_0x005d;
                    case 7: goto L_0x004c;
                    default: goto L_0x0041;
                }
            L_0x0041:
                switch(r9) {
                    case 15: goto L_0x00d6;
                    case 16: goto L_0x0097;
                    case 17: goto L_0x008d;
                    case 18: goto L_0x008d;
                    default: goto L_0x0044;
                }
            L_0x0044:
                r7 = r6
                r16 = r7
                r3 = 0
                r9 = 0
                r13 = 0
                goto L_0x0226
            L_0x004c:
                java.lang.String r3 = r27.getNickname()
                java.lang.String r7 = r7.getString(r10)
                r16 = r6
                r9 = 1
                r13 = 0
                r14 = 1
                r6 = r3
                r3 = 1
                goto L_0x0226
            L_0x005d:
                java.lang.String r3 = r27.getNickname()
                java.lang.String r7 = r7.getString(r10)
                r13 = 1
                goto L_0x00ec
            L_0x0068:
                java.lang.String r3 = r27.getNickname()
                java.lang.String r7 = r7.getString(r10)
                goto L_0x00eb
            L_0x0072:
                java.lang.String r3 = r2.f149513S0
                r9 = 2131835402(0x7f113a0a, float:1.9303942E38)
                java.lang.String r7 = r7.getString(r9)
                goto L_0x00eb
            L_0x007d:
                r3 = 1
                goto L_0x0080
            L_0x007f:
                r3 = 0
            L_0x0080:
                r5 = r6
                r7 = r5
                r9 = 0
                r13 = 1
                goto L_0x0188
            L_0x0086:
                r5 = r6
                r7 = r5
                r3 = 0
                r9 = 0
            L_0x008a:
                r13 = 0
                goto L_0x0188
            L_0x008d:
                java.lang.String r3 = r3.f292154h
                r9 = 2131835404(0x7f113a0c, float:1.9303946E38)
                java.lang.String r7 = r7.getString(r9)
                goto L_0x00eb
            L_0x0097:
                java.lang.String r3 = r3.f292154h
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r9 != 0) goto L_0x00ce
                z04.k r9 = new z04.k
                java.lang.String r10 = "​"
                r9.<init>((java.lang.String) r10)
                java.util.List r9 = r9.mo90760e(r3, r14)
                java.lang.String[] r10 = new java.lang.String[r14]
                java.lang.Object[] r9 = r9.toArray(r10)
                gy3.C87412m.m108592e(r9, r15)
                java.lang.String[] r9 = (java.lang.String[]) r9
                int r10 = r9.length
                r11 = 0
            L_0x00b8:
                if (r11 >= r10) goto L_0x00ce
                r15 = r9[r11]
                java.lang.String r5 = r1.f292120a
                java.lang.String r13 = "ftsQuery.originQuery"
                gy3.C87412m.m108593f(r5, r13)
                boolean r5 = z04.C112551y.m153820t(r15, r5, r14, r12, r6)
                if (r5 == 0) goto L_0x00cb
                r3 = r15
                goto L_0x00ce
            L_0x00cb:
                int r11 = r11 + 1
                goto L_0x00b8
            L_0x00ce:
                r5 = 2131835406(0x7f113a0e, float:1.930395E38)
                java.lang.String r7 = r7.getString(r5)
                goto L_0x00eb
            L_0x00d6:
                java.lang.String r3 = r27.mo62913l2()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r5 == 0) goto L_0x00e4
                java.lang.String r3 = r27.getUsername()
            L_0x00e4:
                r5 = 2131835413(0x7f113a15, float:1.9303964E38)
                java.lang.String r7 = r7.getString(r5)
            L_0x00eb:
                r13 = 0
            L_0x00ec:
                r16 = r6
                r14 = r13
                r9 = 1
                r13 = 0
                r6 = r3
                r3 = 0
                goto L_0x0226
            L_0x00f5:
                com.tencent.mm.sdk.storage.sql.SingleTable r5 = p749xh.C53335e1.f149283M
                java.util.LinkedList r5 = new java.util.LinkedList
                r5.<init>()
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
                java.util.LinkedList r10 = new java.util.LinkedList
                r10.<init>()
                com.tencent.mm.sdk.storage.sql.Column r13 = p749xh.C53335e1.f149286Q
                r5.add(r13)
                com.tencent.mm.sdk.storage.sql.Column r13 = p749xh.C53335e1.f149285P
                java.lang.String r6 = r27.getUsername()
                java.lang.String r12 = "contact.username"
                gy3.C87412m.m108593f(r6, r12)
                com.tencent.mm.sdk.storage.sql.SingleCondition r6 = r13.equal((java.lang.String) r6)
                com.tencent.mm.sdk.storage.sql.SelectSql$Limit r12 = new com.tencent.mm.sdk.storage.sql.SelectSql$Limit
                r13 = 1
                r12.<init>(r13, r14)
                com.tencent.mm.sdk.storage.sql.SingleTable r13 = p749xh.C53335e1.f149283M
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r5 = r13.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r5)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r5 = r5.where(r6)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r5 = r5.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r9)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r5 = r5.groupBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.Column>) r10)
                int r6 = r12.getLimit()
                int r9 = r12.getOffset()
                r5.limit(r6, r9)
                com.tencent.mm.sdk.storage.sql.SelectSql r5 = r5.build()
                java.lang.String r6 = "select().selectMemberlis…ame)).limit(1, 0).build()"
                gy3.C87412m.m108593f(r5, r6)
                f40.o r6 = f40.C86709a0.m107535s()
                zh3.f r6 = r6.f251811i
                java.lang.String r17 = r5.singleString(r6)
                if (r17 == 0) goto L_0x0179
                java.lang.String r5 = ";"
                java.lang.String[] r18 = new java.lang.String[]{r5}
                r19 = 0
                r20 = 0
                r21 = 6
                r22 = 0
                java.util.List r5 = z04.C112550d0.m153785U(r17, r18, r19, r20, r21, r22)
                java.lang.String[] r6 = new java.lang.String[r14]
                java.lang.Object[] r5 = r5.toArray(r6)
                gy3.C87412m.m108592e(r5, r15)
                java.lang.String[] r5 = (java.lang.String[]) r5
                java.util.List<lv1.h> r3 = r3.f292160n
                android.text.TextPaint r6 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
                java.lang.CharSequence r3 = com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118695c(r0, r3, r5, r1, r6)
                r6 = r3
                goto L_0x017a
            L_0x0179:
                r6 = 0
            L_0x017a:
                r3 = 2131835405(0x7f113a0d, float:1.9303948E38)
                java.lang.String r3 = r7.getString(r3)
                r7 = r3
                r5 = r6
                r6 = r11
                r3 = 0
                r9 = 1
                goto L_0x008a
            L_0x0188:
                r16 = r5
                r14 = r13
                r13 = 1
                goto L_0x0226
            L_0x018e:
                java.lang.Class<kv1.q> r3 = kv1.C99260q.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                kv1.q r3 = (kv1.C99260q) r3
                kv1.m r3 = r3.mo128761xc()
                java.lang.String r5 = r27.mo73974r2()
                com.tencent.mm.plugin.fts.g r3 = (com.tencent.p014mm.plugin.fts.C68985g) r3
                java.util.List r3 = r3.mo94942c(r5)
                pm3.a$a r5 = pm3.C77113a.f225222a
                r5.getClass()
                java.lang.StringBuffer r5 = new java.lang.StringBuffer
                r5.<init>()
                java.lang.String[] r6 = r1.f292122c
                java.lang.String r9 = "ftsQuery.phrases"
                gy3.C87412m.m108593f(r6, r9)
                int r9 = r6.length
                r10 = 0
            L_0x01b7:
                if (r10 >= r9) goto L_0x01fd
                r12 = r6[r10]
                r13 = r3
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                java.util.Iterator r13 = r13.iterator()
            L_0x01c2:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x01f7
                java.lang.Object r15 = r13.next()
                java.lang.String r15 = (java.lang.String) r15
                java.util.HashMap<java.lang.String, java.lang.String> r17 = kv1.C99251g.f291026a
                java.lang.String r17 = r15.toLowerCase()
                java.lang.String r14 = kv1.C99255j.m129319c(r17)
                r28 = r3
                java.lang.String r3 = "preProcessTag"
                gy3.C87412m.m108593f(r14, r3)
                java.lang.String r3 = "keyword"
                gy3.C87412m.m108593f(r12, r3)
                r3 = 0
                boolean r14 = z04.C112550d0.m153801u(r14, r12, r3)
                if (r14 == 0) goto L_0x01f3
                r5.append(r15)
                java.lang.String r3 = ","
                r5.append(r3)
            L_0x01f3:
                r3 = r28
                r14 = 0
                goto L_0x01c2
            L_0x01f7:
                r28 = r3
                int r10 = r10 + 1
                r14 = 0
                goto L_0x01b7
            L_0x01fd:
                r5.trimToSize()
                int r3 = r5.length()
                if (r3 != 0) goto L_0x0208
                r3 = 1
                goto L_0x0209
            L_0x0208:
                r3 = 0
            L_0x0209:
                if (r3 == 0) goto L_0x020c
                goto L_0x0217
            L_0x020c:
                int r3 = r5.length()
                r6 = 1
                int r3 = r3 - r6
                r6 = 0
                java.lang.String r11 = r5.substring(r6, r3)
            L_0x0217:
                r3 = 2131835412(0x7f113a14, float:1.9303962E38)
                java.lang.String r3 = r7.getString(r3)
                r7 = r3
                r6 = r11
                r3 = 0
                r9 = 1
                r13 = 0
                r14 = 0
                r16 = 0
            L_0x0226:
                if (r13 == 0) goto L_0x0240
                pm3.a$a r5 = pm3.C77113a.f225222a
                r10 = 2131165591(0x7f070197, float:1.7945403E38)
                int r11 = kg3.C76577a.m92157h(r0, r10)
                android.text.SpannableString r5 = r5.mo107431d(r0, r8, r11)
                lv1.f r5 = lv1.C99667f.m130091d(r5, r1, r14, r3)
                lv1.g r5 = kv1.C99254i.m129308e(r5)
                java.lang.CharSequence r5 = r5.f292107a
                goto L_0x024d
            L_0x0240:
                r10 = 2131165591(0x7f070197, float:1.7945403E38)
                pm3.a$a r5 = pm3.C77113a.f225222a
                int r11 = kg3.C76577a.m92157h(r0, r10)
                android.text.SpannableString r5 = r5.mo107431d(r0, r8, r11)
            L_0x024d:
                r8 = 2131165537(0x7f070161, float:1.7945294E38)
                if (r9 == 0) goto L_0x026c
                if (r16 == 0) goto L_0x0255
                goto L_0x0276
            L_0x0255:
                pm3.a$a r9 = pm3.C77113a.f225222a
                int r8 = kg3.C76577a.m92157h(r0, r8)
                android.text.SpannableString r6 = r9.mo107431d(r0, r6, r8)
                lv1.f r1 = lv1.C99667f.m130091d(r6, r1, r14, r3)
                lv1.g r1 = kv1.C99254i.m129308e(r1)
                java.lang.CharSequence r1 = r1.f292107a
                r16 = r1
                goto L_0x0276
            L_0x026c:
                pm3.a$a r1 = pm3.C77113a.f225222a
                int r3 = kg3.C76577a.m92157h(r0, r8)
                android.text.SpannableString r16 = r1.mo107431d(r0, r6, r3)
            L_0x0276:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r1 != 0) goto L_0x028d
                if (r16 == 0) goto L_0x028d
                r1 = 2
                java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
                r3 = 0
                r1[r3] = r7
                r3 = 1
                r1[r3] = r16
                java.lang.CharSequence r1 = android.text.TextUtils.concat(r1)
                r6 = r1
                goto L_0x028f
            L_0x028d:
                r6 = r16
            L_0x028f:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                r16 = r5
                r23 = r6
                r6 = r1
                r1 = r23
                goto L_0x029d
            L_0x0299:
                r1 = 0
                r6 = 0
                r16 = 0
            L_0x029d:
                if (r6 != 0) goto L_0x02b7
                di3.d r3 = di3.C86312j.m106911c(r4)
                d62.i r3 = (d62.C75339i) r3
                java.lang.String r2 = r3.mo62520pi(r2)
                r3 = 2131165591(0x7f070197, float:1.7945403E38)
                int r3 = kg3.C76577a.m92157h(r0, r3)
                r4 = r24
                android.text.SpannableString r16 = r4.mo107431d(r0, r2, r3)
                goto L_0x02b9
            L_0x02b7:
                r4 = r24
            L_0x02b9:
                r0 = r16
                pm3.d r2 = new pm3.d
                r2.<init>()
                r2.f225226a = r0
                r2.f225227b = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: pm3.C77113a.C77114a.mo107429b(androidx.appcompat.app.AppCompatActivity, lv1.i, com.tencent.mm.storage.z1, lv1.n, com.tencent.mm.storage.m1):pm3.d");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0114, code lost:
            if (r15 == null) goto L_0x0116;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final pm3.C77117c mo107430c(int r13, com.tencent.p014mm.storage.C72996z1 r14, com.tencent.p014mm.storage.C44661m1 r15) {
            /*
                r12 = this;
                java.lang.String r0 = "contact"
                gy3.C87412m.m108594g(r14, r0)
                pm3.c r0 = new pm3.c
                r0.<init>()
                java.lang.String r1 = r14.mo73969n2()
                if (r15 == 0) goto L_0x001e
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 == 0) goto L_0x001e
                java.lang.String r1 = r14.getUsername()
                java.lang.String r1 = r15.mo69789q2(r1)
            L_0x001e:
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r15 == 0) goto L_0x0028
                java.lang.String r1 = r14.getNickname()
            L_0x0028:
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r15 == 0) goto L_0x0032
                java.lang.String r1 = r14.mo62913l2()
            L_0x0032:
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                r2 = 91
                r3 = 123(0x7b, float:1.72E-43)
                r4 = 97
                java.lang.String r5 = "this as java.lang.String).toCharArray()"
                r6 = 65
                r7 = 32
                java.lang.String r8 = "<set-?>"
                r9 = 1
                r10 = 0
                if (r15 != 0) goto L_0x00be
                java.lang.String r15 = kv1.C99251g.m129289j(r1)
                java.lang.String r11 = "compareDisplayNamePY"
                if (r13 != 0) goto L_0x0082
                gy3.C87412m.m108593f(r15, r11)
                char[] r13 = r15.toCharArray()
                gy3.C87412m.m108593f(r13, r5)
                java.lang.Character r13 = sx3.C110823p.m150980F(r13, r10)
                if (r13 == 0) goto L_0x0066
                char r13 = r13.charValue()
                goto L_0x0068
            L_0x0066:
                r13 = 32
            L_0x0068:
                if (r4 > r13) goto L_0x006e
                if (r13 >= r3) goto L_0x006e
                r4 = 1
                goto L_0x006f
            L_0x006e:
                r4 = 0
            L_0x006f:
                if (r4 == 0) goto L_0x0075
                int r13 = r13 + -32
                char r13 = (char) r13
                goto L_0x007f
            L_0x0075:
                if (r6 > r13) goto L_0x007b
                if (r13 >= r2) goto L_0x007b
                r2 = 1
                goto L_0x007c
            L_0x007b:
                r2 = 0
            L_0x007c:
                if (r2 != 0) goto L_0x007f
                char r13 = (char) r3
            L_0x007f:
                r0.f225223a = r13
                goto L_0x0084
            L_0x0082:
                r0.f225223a = r13
            L_0x0084:
                gy3.C87412m.m108593f(r15, r11)
                boolean r13 = z04.C112551y.m153811k(r15)
                r13 = r13 ^ r9
                if (r13 == 0) goto L_0x00a6
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r15)
                r13.append(r10)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                gy3.C87412m.m108594g(r13, r8)
                r0.f225224b = r13
                goto L_0x00f8
            L_0x00a6:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r15 = "\u0000"
                r13.append(r15)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                gy3.C87412m.m108594g(r13, r8)
                r0.f225224b = r13
                goto L_0x00f8
            L_0x00be:
                if (r13 != 0) goto L_0x00f1
                java.lang.String r13 = ""
                char[] r13 = r13.toCharArray()
                gy3.C87412m.m108593f(r13, r5)
                java.lang.Character r13 = sx3.C110823p.m150980F(r13, r10)
                if (r13 == 0) goto L_0x00d5
                char r13 = r13.charValue()
                goto L_0x00d7
            L_0x00d5:
                r13 = 32
            L_0x00d7:
                if (r4 > r13) goto L_0x00dd
                if (r13 >= r3) goto L_0x00dd
                r15 = 1
                goto L_0x00de
            L_0x00dd:
                r15 = 0
            L_0x00de:
                if (r15 == 0) goto L_0x00e4
                int r13 = r13 + -32
                char r13 = (char) r13
                goto L_0x00ee
            L_0x00e4:
                if (r6 > r13) goto L_0x00ea
                if (r13 >= r2) goto L_0x00ea
                r15 = 1
                goto L_0x00eb
            L_0x00ea:
                r15 = 0
            L_0x00eb:
                if (r15 != 0) goto L_0x00ee
                char r13 = (char) r3
            L_0x00ee:
                r0.f225223a = r13
                goto L_0x00f3
            L_0x00f1:
                r0.f225223a = r13
            L_0x00f3:
                java.lang.String r13 = "\u0000"
                r0.f225224b = r13
            L_0x00f8:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r15 = r0.f225224b
                r13.append(r15)
                r13.append(r10)
                java.lang.String r15 = r14.mo62913l2()
                if (r15 == 0) goto L_0x0116
                boolean r1 = z04.C112551y.m153811k(r15)
                r1 = r1 ^ r9
                if (r1 == 0) goto L_0x0113
                goto L_0x0114
            L_0x0113:
                r15 = 0
            L_0x0114:
                if (r15 != 0) goto L_0x011a
            L_0x0116:
                java.lang.String r15 = r14.getUsername()
            L_0x011a:
                r13.append(r15)
                java.lang.String r13 = r13.toString()
                gy3.C87412m.m108594g(r13, r8)
                r0.f225224b = r13
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r15 = r0.f225224b
                r13.append(r15)
                r13.append(r10)
                java.lang.String r14 = r14.getUsername()
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                gy3.C87412m.m108594g(r13, r8)
                r0.f225224b = r13
                int r13 = r0.f225223a
                android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                if (r13 != r7) goto L_0x0159
                r13 = 2131835505(0x7f113a71, float:1.930415E38)
                java.lang.String r13 = r14.getString(r13)
                java.lang.String r14 = "{\n                contex…talog_name)\n            }"
                gy3.C87412m.m108593f(r13, r14)
                goto L_0x0167
            L_0x0159:
                if (r13 < r6) goto L_0x0165
                r14 = 90
                if (r13 > r14) goto L_0x0165
                char r13 = (char) r13
                java.lang.String r13 = java.lang.String.valueOf(r13)
                goto L_0x0167
            L_0x0165:
                java.lang.String r13 = "#"
            L_0x0167:
                gy3.C87412m.m108594g(r13, r8)
                r0.f225225c = r13
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pm3.C77113a.C77114a.mo107430c(int, com.tencent.mm.storage.z1, com.tencent.mm.storage.m1):pm3.c");
        }

        /* renamed from: d */
        public final SpannableString mo107431d(Context context, String str, int i) {
            return ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, str, i);
        }
    }
}
