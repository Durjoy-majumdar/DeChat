package nk1;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.widget.TextView;
import bl3.C39818r;
import cj1.C0581o5;
import cj1.C0584p5;
import cl1.C0702z0;
import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C60172g4;
import je1.C46522h1;
import kg3.C76577a;
import ks3.C46739p;
import ob0.C89132b;
import ok1.C62042e;
import p629ny.C76979h;
import p740wo.C53193b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C49897iu0;
import te3.C50317lw0;
import te3.C50447mt0;
import te3.C52013xs0;

/* renamed from: nk1.h */
public final class C47272h {

    /* renamed from: a */
    public static final C47272h f126894a = new C47272h();

    /* renamed from: nk1.h$a */
    public static final class C47273a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ boolean f126895a;

        /* renamed from: b */
        public final /* synthetic */ C0581o5 f126896b;

        /* renamed from: c */
        public final /* synthetic */ C45795b f126897c;

        public C47273a(boolean z, C0581o5 o5Var, C45795b bVar) {
            this.f126895a = z;
            this.f126896b = o5Var;
            this.f126897c = bVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (!(cVar.f256793a == 0 && cVar.f256794b == 0)) {
                Log.m105924i("Finder.FinderLiveBoxUtil", "localLikeLog cgi failed, revert like op");
                C47272h.f126894a.mo72305j(!this.f126895a, (C0584p5) this.f126896b);
                ((C0702z0) this.f126897c.mo71262a(C0702z0.class)).mo675j3(this.f126896b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final C52013xs0 mo72296a(C52013xs0 xs02, int i, int i2) {
        C87412m.m108594g(xs02, "likeMsg");
        C50317lw0 lw02 = xs02.f144910o;
        if (lw02 == null) {
            return null;
        }
        String str = lw02.f137677e;
        if (str == null || str.length() == 0) {
            return null;
        }
        return mo72297b(xs02.f144913r, i, i2, lw02);
    }

    /* renamed from: b */
    public final C52013xs0 mo72297b(long j, int i, int i2, C50317lw0 lw02) {
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144903e = 20062;
        C49897iu0 iu02 = new C49897iu0();
        iu02.f135665d = j;
        iu02.f135666e = lw02;
        iu02.f135667f = i2;
        iu02.f135668g = i;
        int i3 = C46739p.f125819a;
        if (i2 == 1) {
            iu02.f135668g = i + 1;
        } else if (i2 == 2) {
            iu02.f135668g = i - 1;
        }
        iu02.f135668g = Math.max(0, iu02.f135668g);
        xs02.f144906h = C89349b.m111674a(iu02.toByteArray());
        xs02.f144914s = f126894a.mo72301f(lw02 != null ? lw02.f137677e : null);
        xs02.f144910o = lw02;
        xs02.f144904f = C75592q0.m90789s() + System.currentTimeMillis();
        xs02.f144905g = j;
        return xs02;
    }

    /* renamed from: c */
    public final C52013xs0 mo72298c(C50317lw0 lw02, String str) {
        C87412m.m108594g(lw02, "boxId");
        C87412m.m108594g(str, "content");
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144903e = 20057;
        C50447mt0 mt02 = new C50447mt0();
        mt02.f138195d = str;
        xs02.f144906h = C89349b.m111674a(mt02.toByteArray());
        xs02.f144914s = f126894a.mo72301f(lw02.f137677e);
        xs02.f144910o = lw02;
        xs02.f144904f = C75592q0.m90789s() + System.currentTimeMillis();
        return xs02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012c, code lost:
        if (r15 == null) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[Catch:{ Exception -> 0x01fc, all -> 0x01f9 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo72299d(java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22) {
        /*
            r18 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.Class<sv.n> r0 = p239sv.C48466n.class
            java.lang.Class<d62.i> r4 = d62.C75339i.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.String r6 = ",resutl:"
            java.lang.String r7 = "stop getChatDisplayName :boxId:"
            java.lang.String r8 = "boxId"
            gy3.C87412m.m108594g(r1, r8)
            java.lang.String r8 = "username"
            gy3.C87412m.m108594g(r2, r8)
            java.lang.String r8 = "nickname"
            gy3.C87412m.m108594g(r3, r8)
            java.lang.String r8 = ",nickname:"
            java.lang.String r9 = ", "
            java.lang.String r10 = "Finder.FinderLiveBoxUtil"
            if (r22 == 0) goto L_0x004a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "start getChatDisplayName :boxId:"
            r11.append(r12)
            r11.append(r1)
            r11.append(r9)
            r11.append(r2)
            r11.append(r8)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
        L_0x004a:
            ok1.e r11 = ok1.C62042e.f176370a     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            boolean r11 = r11.mo87084h1(r2)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            r13 = 0
            r14 = 1
            if (r11 != 0) goto L_0x005e
            java.lang.String r11 = eb0.C75592q0.m90782l()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            boolean r11 = gy3.C87412m.m108589b(r2, r11)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r11 == 0) goto L_0x00b6
        L_0x005e:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            androidx.lifecycle.i0 r15 = r11.mo77630e(r5)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            cl1.o r15 = (cl1.C54991o) r15     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r15 == 0) goto L_0x007b
            java.lang.String r15 = r15.mo75977P3()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r15 == 0) goto L_0x007b
            int r15 = r15.length()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r15 <= 0) goto L_0x0076
            r15 = 1
            goto L_0x0077
        L_0x0076:
            r15 = 0
        L_0x0077:
            if (r15 != r14) goto L_0x007b
            r15 = 1
            goto L_0x007c
        L_0x007b:
            r15 = 0
        L_0x007c:
            if (r15 == 0) goto L_0x00b6
            androidx.lifecycle.i0 r0 = r11.mo77630e(r5)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            cl1.o r0 = (cl1.C54991o) r0     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r0 == 0) goto L_0x008b
            java.lang.String r12 = r0.mo75977P3()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            goto L_0x008c
        L_0x008b:
            r12 = 0
        L_0x008c:
            gy3.C87412m.m108591d(r12)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r22 == 0) goto L_0x00b5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r9)
            r0.append(r2)
            r0.append(r8)
            r0.append(r3)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x00b5:
            return r3
        L_0x00b6:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            androidx.lifecycle.i0 r5 = r11.mo77630e(r5)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            cl1.o r5 = (cl1.C54991o) r5     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r5 == 0) goto L_0x00c6
            boolean r5 = r5.f154356q2     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r5 != r14) goto L_0x00c6
            r5 = 1
            goto L_0x00c7
        L_0x00c6:
            r5 = 0
        L_0x00c7:
            if (r5 == 0) goto L_0x0100
            int r5 = r21.length()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r5 <= 0) goto L_0x00d1
            r5 = 1
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            if (r5 != r14) goto L_0x00d6
            r5 = 1
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            if (r5 == 0) goto L_0x0100
            if (r22 == 0) goto L_0x00ff
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r9)
            r0.append(r2)
            r0.append(r8)
            r0.append(r3)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x00ff:
            return r3
        L_0x0100:
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            com.tencent.mm.storage.z1 r5 = r5.get(r2)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            di3.d r11 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            d62.i r11 = (d62.C75339i) r11     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            java.lang.String r11 = r11.mo62515Si(r2)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            di3.d r15 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            sv.n r15 = (p239sv.C48466n) r15     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            java.lang.CharSequence r15 = r15.mo73118nZ(r5, r11)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            java.lang.String r16 = ""
            if (r15 == 0) goto L_0x012e
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r15 != 0) goto L_0x0130
        L_0x012e:
            r15 = r16
        L_0x0130:
            int r17 = r15.length()     // Catch:{ Exception -> 0x01f7 }
            if (r17 != 0) goto L_0x0139
            r17 = 1
            goto L_0x013b
        L_0x0139:
            r17 = 0
        L_0x013b:
            if (r17 == 0) goto L_0x019e
            java.lang.Class<a11.c> r17 = a11.C39479c.class
            k40.a r17 = f40.C86709a0.m107533q(r17)     // Catch:{ Exception -> 0x01f7 }
            a11.c r17 = (a11.C39479c) r17     // Catch:{ Exception -> 0x01f7 }
            eb0.m2 r17 = r17.mo62084mr()     // Catch:{ Exception -> 0x01f7 }
            r12 = r17
            com.tencent.mm.storage.n1 r12 = (com.tencent.p014mm.storage.C44662n1) r12     // Catch:{ Exception -> 0x01f7 }
            com.tencent.mm.storage.m1 r12 = r12.mo69799Lo(r1)     // Catch:{ Exception -> 0x01f7 }
            if (r12 == 0) goto L_0x0158
            java.lang.String r12 = r12.mo69789q2(r2)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0159
        L_0x0158:
            r12 = 0
        L_0x0159:
            if (r12 != 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            r16 = r12
        L_0x015e:
            int r12 = r16.length()     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            if (r12 != 0) goto L_0x0166
            r12 = 1
            goto L_0x0167
        L_0x0166:
            r12 = 0
        L_0x0167:
            if (r12 == 0) goto L_0x0188
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            sv.n r0 = (p239sv.C48466n) r0     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            d62.i r4 = (d62.C75339i) r4     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            java.lang.String r4 = r4.getDisplayName(r2)     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            java.lang.CharSequence r0 = r0.mo73118nZ(r5, r4)     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            if (r0 != 0) goto L_0x0186
        L_0x0185:
            r0 = r3
        L_0x0186:
            r15 = r0
            goto L_0x018a
        L_0x0188:
            r15 = r16
        L_0x018a:
            int r0 = r15.length()     // Catch:{ Exception -> 0x01f7 }
            if (r0 != 0) goto L_0x0191
            r13 = 1
        L_0x0191:
            if (r13 == 0) goto L_0x019e
            r15 = r3
            goto L_0x019e
        L_0x0195:
            r15 = r16
            goto L_0x022d
        L_0x019a:
            r0 = move-exception
            r15 = r16
            goto L_0x01fe
        L_0x019e:
            if (r22 == 0) goto L_0x01d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
            r0.<init>()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r4 = "getChatDisplayName :boxId:"
            r0.append(r4)     // Catch:{ Exception -> 0x01f7 }
            r0.append(r1)     // Catch:{ Exception -> 0x01f7 }
            r0.append(r9)     // Catch:{ Exception -> 0x01f7 }
            r0.append(r2)     // Catch:{ Exception -> 0x01f7 }
            r0.append(r8)     // Catch:{ Exception -> 0x01f7 }
            r0.append(r3)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r4 = ",ct:"
            r0.append(r4)     // Catch:{ Exception -> 0x01f7 }
            r0.append(r5)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r4 = ",remark:"
            r0.append(r4)     // Catch:{ Exception -> 0x01f7 }
            r0.append(r11)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x01f7 }
        L_0x01d0:
            if (r22 == 0) goto L_0x01f6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r9)
            r0.append(r2)
            r0.append(r8)
            r0.append(r3)
            r0.append(r6)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x01f6:
            return r15
        L_0x01f7:
            r0 = move-exception
            goto L_0x01fe
        L_0x01f9:
            r15 = r3
            goto L_0x022d
        L_0x01fc:
            r0 = move-exception
            r15 = r3
        L_0x01fe:
            er1.j4 r4 = er1.C58739j4.f168176a     // Catch:{ all -> 0x022c }
            java.lang.String r5 = "getChatDisplayName"
            r4.mo83712h0(r0, r5)     // Catch:{ all -> 0x022c }
            if (r22 == 0) goto L_0x022b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r9)
            r0.append(r2)
            r0.append(r8)
            r0.append(r3)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x022b:
            return r3
        L_0x022c:
        L_0x022d:
            if (r22 == 0) goto L_0x0253
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r9)
            r0.append(r2)
            r0.append(r8)
            r0.append(r3)
            r0.append(r6)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x0253:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.C47272h.mo72299d(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: e */
    public final CharSequence mo72300e(TextView textView, CharSequence charSequence, int i) {
        C87412m.m108594g(textView, "tv");
        CharSequence charSequence2 = charSequence;
        C87412m.m108594g(charSequence2, "spanText");
        Context context = textView.getContext();
        C87412m.m108593f(context, "tv.context");
        int b = C76577a.m92151b(context, (i * 15) + 1);
        Context context2 = textView.getContext();
        C87412m.m108593f(context2, "tv.context");
        int b2 = C76577a.m92151b(context2, ((i + 1) * 15) + 1);
        CharSequence charSequence3 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence3, 0, charSequence.length(), textView.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new StaticLayout(charSequence3, 0, charSequence.length(), textView.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return charSequence2;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        Context context3 = textView.getContext();
        StringBuilder sb = new StringBuilder();
        String substring = charSequence.toString().substring(0, lineEnd);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context3, sb.toString());
        C87412m.m108593f(T1, "{\n            val ellips…Start) + \"...\")\n        }");
        return T1;
    }

    /* renamed from: f */
    public final C49765hx0 mo72301f(String str) {
        String str2;
        C49765hx0 hx02 = new C49765hx0();
        FinderContact finderContact = new FinderContact();
        finderContact.username = C75592q0.m90789s();
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (bVar == null || (str2 = ((C54991o) bVar.mo71262a(C54991o.class)).mo75977P3()) == null) {
            str2 = C75592q0.m90783m();
        }
        finderContact.nickname = str2;
        finderContact.headUrl = "";
        hx02.f134919d = finderContact;
        return hx02;
    }

    /* renamed from: g */
    public final boolean mo72302g(String str) {
        boolean Go0 = ((C53193b) C86312j.m106911c(C53193b.class)).Go0(str);
        Log.m105924i("Finder.FinderLiveBoxUtil", "isChatRoomDismiss " + str + ", " + Go0);
        return Go0;
    }

    /* renamed from: h */
    public final boolean mo72303h(String str) {
        boolean eL = ((C53193b) C86312j.m106911c(C53193b.class)).mo73725eL(str);
        Log.m105924i("Finder.FinderLiveBoxUtil", "isNotInChatRoom " + str + ", " + eL);
        return eL;
    }

    /* renamed from: i */
    public final void mo72304i(C0581o5 o5Var, boolean z, C45795b bVar, Context context) {
        C52013xs0 xs02;
        C87412m.m108594g(o5Var, "msg");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(context, "context");
        if (o5Var instanceof C0584p5) {
            if (z) {
                long seq = o5Var.getSeq();
                int i = C46739p.f125819a;
                xs02 = mo72297b(seq, 0, 1, (C50317lw0) null);
            } else {
                long seq2 = o5Var.getSeq();
                int i2 = C46739p.f125819a;
                xs02 = mo72297b(seq2, 0, 2, (C50317lw0) null);
            }
            mo72305j(z, (C0584p5) o5Var);
            ((C0702z0) bVar.mo71262a(C0702z0.class)).mo675j3(o5Var);
            C46522h1 h1Var = new C46522h1(xs02, bVar, ((C60172g4) C39818r.f106831a.mo62443b(context).mo62447c(C60172g4.class)).mo12861q3());
            if (C62042e.f176370a.mo87027N0()) {
                h1Var.f125329t.f136125j = 1;
            } else if (((C54991o) bVar.mo71262a(C54991o.class)).f154190D) {
                h1Var.f125329t.f136125j = 3;
            }
            h1Var.mo9225i().mo123420E(new C47273a(z, o5Var, bVar));
        }
    }

    /* renamed from: j */
    public final void mo72305j(boolean z, C0584p5 p5Var) {
        if (z) {
            p5Var.mo568b(Math.max(1, p5Var.getLikeCount() + 1));
        } else {
            p5Var.mo568b(Math.max(0, p5Var.getLikeCount() - 1));
        }
        p5Var.mo582l(z);
        p5Var.mo586p(true);
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i("Finder.FinderLiveBoxUtil", "updateLikeMsg msg:" + p5Var.hashCode() + ",likeCount:" + p5Var.getLikeCount() + ",selfLike:" + p5Var.mo583m() + '!');
        }
    }
}
