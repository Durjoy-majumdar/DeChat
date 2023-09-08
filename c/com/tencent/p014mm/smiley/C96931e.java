package com.tencent.p014mm.smiley;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96940i;
import com.tencent.p014mm.smiley.C96961p;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.smiley.EmojiDrawableBitmapRepo;
import p008bq.C92288n0;
import p248ug.C52571f;
import vl3.C102224a;
import vl3.C78435b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.smiley.e */
public class C96931e extends C52571f implements C92288n0 {

    /* renamed from: b */
    public static C96931e f283957b;

    /* renamed from: a */
    public Context f283958a = MMApplicationContext.getContext();

    public C96931e() {
        ((C119157j) C119157j.f356862d).mo183870a(new e$$a());
    }

    /* renamed from: a */
    public static C96931e m124499a() {
        if (f283957b == null) {
            synchronized (C96931e.class) {
                f283957b = new C96931e();
            }
        }
        return f283957b;
    }

    /* renamed from: B */
    public C96973t0 mo126275B(int i) {
        boolean z = C96965r.f284067d;
        return C96965r.C44649c.f121057a.mo135553e(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.Spannable mo126276C(android.content.Context r18, android.text.Spannable r19, com.tencent.p014mm.pointers.PInt r20, android.text.Spannable.Factory r21) {
        /*
            r17 = this;
            r7 = r19
            r8 = 0
            if (r7 != 0) goto L_0x0007
            r9 = 0
            goto L_0x0010
        L_0x0007:
            java.lang.String r0 = r19.toString()
            int r0 = r0.length()
            r9 = r0
        L_0x0010:
            boolean r0 = com.tencent.p014mm.smiley.C96965r.f284067d
            com.tencent.mm.smiley.r r10 = com.tencent.p014mm.smiley.C96965r.C44649c.f121057a
            r10.getClass()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_PROCESS_NEW_REPORT_TIME_LONG
            java.lang.String r0 = "maxNum"
            r2 = r20
            gy3.C87412m.m108594g(r2, r0)
            if (r7 == 0) goto L_0x00ff
            int r0 = r19.length()
            if (r0 != 0) goto L_0x002b
            goto L_0x00ff
        L_0x002b:
            boolean r0 = com.tencent.p014mm.smiley.C96965r.f284067d
            if (r0 != 0) goto L_0x0031
            goto L_0x00ff
        L_0x0031:
            long r12 = java.lang.System.currentTimeMillis()
            gy3.d0 r14 = new gy3.d0
            r14.<init>()
            gy3.d0 r15 = new gy3.d0
            r15.<init>()
            gy3.d0 r6 = new gy3.d0
            r6.<init>()
            com.tencent.mm.smiley.i r5 = com.tencent.p014mm.smiley.C96940i.C96942b.f283995a
            com.tencent.mm.smiley.s r4 = new com.tencent.mm.smiley.s
            r0 = r4
            r1 = r6
            r2 = r20
            r3 = r14
            r18 = r14
            r14 = r4
            r4 = r15
            r21 = r15
            r15 = r5
            r5 = r10
            r16 = r6
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.mo135530a(r7, r8, r9, r14)
            r0 = r16
            int r1 = r0.f27483d
            if (r1 <= 0) goto L_0x00ff
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r12
            r3 = 10
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ff
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            r4 = 1
            if (r3 == 0) goto L_0x009a
            boolean r3 = f40.C86709a0.m107522a()
            if (r3 == 0) goto L_0x009a
            r3 = 86400000(0x5265c00, float:7.82218E-36)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            r12 = 0
            long r5 = r5.mo119673G(r11, r12)
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = (long) r3
            long r5 = r5 + r14
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x009a
            r3 = 1
            goto L_0x009b
        L_0x009a:
            r3 = 0
        L_0x009b:
            if (r3 == 0) goto L_0x00ff
            r3 = r18
            int r3 = r3.f27483d
            int r0 = r0.f27483d
            r5 = r21
            int r5 = r5.f27483d
            if (r3 == 0) goto L_0x00b6
            if (r0 != 0) goto L_0x00ac
            goto L_0x00b6
        L_0x00ac:
            r6 = 100
            float r6 = (float) r6
            float r9 = (float) r3
            float r12 = (float) r0
            float r9 = r9 / r12
            float r6 = r6 * r9
            int r6 = (int) r6
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            long r9 = r10.mo135554f()
            int r12 = com.tencent.p014mm.smiley.EmojiDrawableBitmapRepo.f283926b
            com.tencent.mm.smiley.EmojiDrawableBitmapRepo r12 = com.tencent.p014mm.smiley.EmojiDrawableBitmapRepo.C96922a.f283929a
            r12.getClass()
            dl.n r12 = p490dl.C97487n.C97488a.f286127a
            int r8 = r12.mo136757b(r8)
            com.tencent.mm.autogen.mmdata.rpt.EmojiProcessProfileStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.EmojiProcessProfileStruct
            r12.<init>()
            r12.f265424d = r3
            r12.f265425e = r0
            r12.f265427g = r5
            r12.f265428h = r6
            r12.f265429i = r9
            r12.f265426f = r1
            r12.f265430j = r8
            r12.f265431k = r4
            r12.mo86054n()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x00ff
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 == 0) goto L_0x00ff
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.mo119677K(r11, r1)
        L_0x00ff:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96931e.mo126276C(android.content.Context, android.text.Spannable, com.tencent.mm.pointers.PInt, android.text.Spannable$Factory):android.text.Spannable");
    }

    /* renamed from: D */
    public C96973t0 mo126277D(int i, int i2) {
        boolean z = C96965r.f284067d;
        C96965r.C44649c.f121057a.getClass();
        C96976z zVar = C96940i.C96942b.f283995a.f283994e.get(i);
        C96940i.C96941a aVar = zVar instanceof C96940i.C96941a ? (C96940i.C96941a) zVar : null;
        if (aVar == null) {
            return null;
        }
        if (aVar.f283932b.size() == 0) {
            C96974x xVar = aVar.f283931a;
            if (xVar instanceof C96973t0) {
                return (C96973t0) xVar;
            }
            return null;
        }
        C96976z zVar2 = aVar.f283932b.get(i2, (Object) null);
        Object data = zVar2 != null ? zVar2.getData() : null;
        if (data instanceof C96973t0) {
            return (C96973t0) data;
        }
        return null;
    }

    /* renamed from: E */
    public int mo126278E(C96973t0 t0Var) {
        boolean z = C96965r.f284067d;
        C96965r rVar = C96965r.C44649c.f121057a;
        int i = t0Var.f284095a.f283953d;
        rVar.getClass();
        C96971s0 s0Var = C96940i.C96942b.f283995a.f283991b.get(i, (Object) null);
        if (s0Var != null) {
            return s0Var.f284088d;
        }
        return 0;
    }

    /* renamed from: F */
    public Drawable mo126279F(C96973t0 t0Var) {
        boolean z = C96965r.f284067d;
        C96965r.C44649c.f121057a.getClass();
        int i = EmojiDrawableBitmapRepo.f283926b;
        return EmojiDrawableBitmapRepo.C96922a.f283929a.mo135511a(t0Var, true);
    }

    /* renamed from: b */
    public C78435b mo135522b(C102224a aVar) {
        Spannable spannable;
        CharSequence charSequence = aVar.f301006a;
        int i = aVar.f301007b;
        int i2 = aVar.f301008c;
        int i3 = aVar.f301009d;
        int i4 = aVar.f301010e;
        boolean z = aVar.f301011f;
        boolean z2 = aVar.f301012g;
        PInt pInt = new PInt(0);
        if (z) {
            spannable = charSequence instanceof SpannableString ? (SpannableString) charSequence : charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableString(charSequence);
        } else {
            spannable = null;
        }
        if (charSequence.length() == 0) {
            return new C78435b((Spannable) null, pInt.value);
        }
        if (z2 && spannable != null) {
            for (C72953u removeSpan : (C72953u[]) spannable.getSpans(0, charSequence.length(), C72953u.class)) {
                spannable.removeSpan(removeSpan);
            }
        }
        e$$b e__b = new e$$b(this, new PInt(0), i4, pInt, spannable, i3);
        C96961p pVar = C96961p.C96962a.f284061a;
        pVar.getClass();
        new C96951l(pVar.f284060a).mo135537a(spannable, i, i2, e__b);
        return new C78435b(spannable, pInt.value);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7 A[LOOP:0: B:27:0x00b1->B:31:0x00b7, LOOP_END] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo135523c(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = com.tencent.p014mm.smiley.C96965r.f284067d
            com.tencent.mm.smiley.r r0 = com.tencent.p014mm.smiley.C96965r.C44649c.f121057a
            r0.getClass()
            if (r9 == 0) goto L_0x00ec
            int r1 = r9.length()
            r2 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            if (r1 == 0) goto L_0x0017
            goto L_0x00ec
        L_0x0017:
            com.tencent.mm.smiley.i r1 = com.tencent.p014mm.smiley.C96940i.C96942b.f283995a
            android.util.SparseArray<java.lang.String> r1 = r1.f283993d
            int r1 = r1.size()
            if (r1 != 0) goto L_0x00c9
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r3 = r1.getSharedPreferences(r3, r2)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.loadApplicationLanguage(r3, r1)
            if (r3 == 0) goto L_0x0088
            int r4 = r3.hashCode()
            r5 = 115861276(0x6e7e71c, float:8.7232127E-35)
            if (r4 == r5) goto L_0x006d
            r5 = 115861428(0x6e7e7b4, float:8.7233E-35)
            if (r4 == r5) goto L_0x0051
            r5 = 115861812(0x6e7e934, float:8.7235204E-35)
            if (r4 == r5) goto L_0x0047
            goto L_0x0088
        L_0x0047:
            java.lang.String r4 = "zh_TW"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x005b
            goto L_0x0088
        L_0x0051:
            java.lang.String r4 = "zh_HK"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x005b
            goto L_0x0088
        L_0x005b:
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2130903061(0x7f030015, float:1.741293E38)
            java.lang.String[] r3 = r3.getStringArray(r4)
            java.lang.String r4 = "{\n            context.re….emoji_name_tw)\n        }"
            gy3.C87412m.m108593f(r3, r4)
            goto L_0x0099
        L_0x006d:
            java.lang.String r4 = "zh_CN"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0088
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2130903059(0x7f030013, float:1.7412925E38)
            java.lang.String[] r3 = r3.getStringArray(r4)
            java.lang.String r4 = "{\n            context.re….emoji_name_ch)\n        }"
            gy3.C87412m.m108593f(r3, r4)
            goto L_0x0099
        L_0x0088:
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2130903060(0x7f030014, float:1.7412927E38)
            java.lang.String[] r3 = r3.getStringArray(r4)
            java.lang.String r4 = "{\n            context.re….emoji_name_en)\n        }"
            gy3.C87412m.m108593f(r3, r4)
        L_0x0099:
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2130903058(0x7f030012, float:1.7412923E38)
            java.lang.String[] r1 = r1.getStringArray(r4)
            java.lang.String r4 = "context.resources.getStr…Array(R.array.emoji_code)"
            gy3.C87412m.m108593f(r1, r4)
            com.tencent.mm.smiley.i r4 = com.tencent.p014mm.smiley.C96940i.C96942b.f283995a
            android.util.SparseArray<java.lang.String> r4 = r4.f283993d
            r4.clear()
            r4 = 0
        L_0x00b1:
            int r5 = r1.length
            if (r4 >= r5) goto L_0x00c9
            int r5 = r3.length
            if (r4 >= r5) goto L_0x00c9
            com.tencent.mm.smiley.i r5 = com.tencent.p014mm.smiley.C96940i.C96942b.f283995a
            android.util.SparseArray<java.lang.String> r5 = r5.f283993d
            r6 = r1[r4]
            char r6 = r6.charAt(r2)
            r7 = r3[r4]
            r5.put(r6, r7)
            int r4 = r4 + 1
            goto L_0x00b1
        L_0x00c9:
            int r1 = r9.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            gy3.d0 r4 = new gy3.d0
            r4.<init>()
            com.tencent.mm.smiley.i r5 = com.tencent.p014mm.smiley.C96940i.C96942b.f283995a
            com.tencent.mm.smiley.t r6 = new com.tencent.mm.smiley.t
            r6.<init>(r3, r9, r4, r0)
            r5.mo135530a(r9, r2, r1, r6)
            int r0 = r4.f27483d
            if (r0 >= r1) goto L_0x00e8
            r3.append(r9, r0, r1)
        L_0x00e8:
            java.lang.String r9 = r3.toString()
        L_0x00ec:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96931e.mo135523c(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public void mo135524d(Spannable spannable, Drawable drawable, int i, int i2, boolean z) {
        if (spannable != null && drawable != null) {
            spannable.setSpan(new C72953u(drawable, z, i, i2), i, i2, 33);
        }
    }
}
