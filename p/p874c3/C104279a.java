package p874c3;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
import p874c3.C104282d;

/* renamed from: c3.a */
public final class C104279a {

    /* renamed from: d */
    public static final C104281c f308622d;

    /* renamed from: e */
    public static final String f308623e = Character.toString(8206);

    /* renamed from: f */
    public static final String f308624f = Character.toString(8207);

    /* renamed from: g */
    public static final C104279a f308625g;

    /* renamed from: h */
    public static final C104279a f308626h;

    /* renamed from: a */
    public final boolean f308627a;

    /* renamed from: b */
    public final int f308628b;

    /* renamed from: c */
    public final C104281c f308629c;

    /* renamed from: c3.a$a */
    public static class C104280a {

        /* renamed from: e */
        public static final byte[] f308630e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f308631a;

        /* renamed from: b */
        public final int f308632b;

        /* renamed from: c */
        public int f308633c;

        /* renamed from: d */
        public char f308634d;

        static {
            for (int i = 0; i < 1792; i++) {
                f308630e[i] = Character.getDirectionality(i);
            }
        }

        public C104280a(CharSequence charSequence, boolean z) {
            this.f308631a = charSequence;
            this.f308632b = charSequence.length();
        }

        /* renamed from: a */
        public byte mo145943a() {
            char charAt = this.f308631a.charAt(this.f308633c - 1);
            this.f308634d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f308631a, this.f308633c);
                this.f308633c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f308633c--;
            char c = this.f308634d;
            return c < 1792 ? f308630e[c] : Character.getDirectionality(c);
        }
    }

    static {
        C104281c cVar = C104282d.f308637c;
        f308622d = cVar;
        f308625g = new C104279a(false, 2, cVar);
        f308626h = new C104279a(true, 2, cVar);
    }

    public C104279a(boolean z, int i, C104281c cVar) {
        this.f308627a = z;
        this.f308628b = i;
        this.f308629c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m139186a(java.lang.CharSequence r9) {
        /*
            c3.a$a r0 = new c3.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f308633c = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            int r6 = r0.f308633c
            int r7 = r0.f308632b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f308631a
            char r6 = r7.charAt(r6)
            r0.f308634d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f308631a
            int r7 = r0.f308633c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f308633c
            int r8 = java.lang.Character.charCount(r6)
            int r7 = r7 + r8
            r0.f308633c = r7
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f308633c
            int r6 = r6 + r2
            r0.f308633c = r6
            char r6 = r0.f308634d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = p874c3.C104279a.C104280a.f308630e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = 0
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = -1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r1 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f308633c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.mo145943a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r1 = 1
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r1 = -1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p874c3.C104279a.m139186a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r7 = r7 - 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m139187b(java.lang.CharSequence r7) {
        /*
            c3.a$a r0 = new c3.a$a
            r1 = 0
            r0.<init>(r7, r1)
            int r7 = r0.f308632b
            r0.f308633c = r7
            r7 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f308633c
            r4 = 1
            r5 = -1
            if (r3 <= 0) goto L_0x0042
            byte r3 = r0.mo145943a()
            if (r3 == 0) goto L_0x003a
            if (r3 == r4) goto L_0x0033
            r6 = 2
            if (r3 == r6) goto L_0x0033
            r6 = 9
            if (r3 == r6) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002d;
                case 15: goto L_0x002d;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x0027;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x0027:
            int r7 = r7 + 1
            goto L_0x000c
        L_0x002a:
            if (r2 != r7) goto L_0x0030
            goto L_0x0035
        L_0x002d:
            if (r2 != r7) goto L_0x0030
            goto L_0x003c
        L_0x0030:
            int r7 = r7 + -1
            goto L_0x000c
        L_0x0033:
            if (r7 != 0) goto L_0x0037
        L_0x0035:
            r1 = 1
            goto L_0x0042
        L_0x0037:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x003a:
            if (r7 != 0) goto L_0x003e
        L_0x003c:
            r1 = -1
            goto L_0x0042
        L_0x003e:
            if (r2 != 0) goto L_0x000c
        L_0x0040:
            r2 = r7
            goto L_0x000c
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p874c3.C104279a.m139187b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public static C104279a m139188c() {
        Locale locale = Locale.getDefault();
        int i = C79921e.f234146a;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        C104281c cVar = f308622d;
        return cVar == f308622d ? z ? f308626h : f308625g : new C104279a(z, 2, cVar);
    }

    /* renamed from: d */
    public CharSequence mo145942d(CharSequence charSequence) {
        C104281c cVar = this.f308629c;
        if (charSequence == null) {
            return null;
        }
        boolean b = ((C104282d.C104285c) cVar).mo145946b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if ((this.f308628b & 2) != 0) {
            boolean b2 = ((C104282d.C104285c) (b ? C104282d.f308636b : C104282d.f308635a)).mo145946b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((this.f308627a || (!b2 && m139186a(charSequence) != 1)) ? (!this.f308627a || (b2 && m139186a(charSequence) != -1)) ? str : f308624f : f308623e);
        }
        if (b != this.f308627a) {
            spannableStringBuilder.append(b ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b3 = ((C104282d.C104285c) (b ? C104282d.f308636b : C104282d.f308635a)).mo145946b(charSequence, 0, charSequence.length());
        if (!this.f308627a && (b3 || m139187b(charSequence) == 1)) {
            str = f308623e;
        } else if (this.f308627a && (!b3 || m139187b(charSequence) == -1)) {
            str = f308624f;
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }
}
