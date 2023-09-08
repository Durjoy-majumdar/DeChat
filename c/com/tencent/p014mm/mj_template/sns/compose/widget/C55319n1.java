package com.tencent.p014mm.mj_template.sns.compose.widget;

import android.util.ArrayMap;
import gy3.C8480h;
import gy3.C87412m;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import te3.C51754vy;
import te3.pr4;
import te3.yq4;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n1 */
public abstract class C55319n1 {

    /* renamed from: d */
    public static int f157554d;

    /* renamed from: a */
    public final String f157555a;

    /* renamed from: b */
    public final C60690y0<Boolean> f157556b;

    /* renamed from: c */
    public final boolean f157557c;

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n1$a */
    public static final class C55320a extends C55319n1 {

        /* renamed from: e */
        public static final C55320a f157558e = new C55320a();

        public C55320a() {
            super("@@no_template@@", (C60690y0) null, false, 6, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n1$b */
    public static final class C55321b extends C55319n1 {

        /* renamed from: e */
        public static final C55321b f157559e = new C55321b();

        public C55321b() {
            super("@@miaojian@@", (C60690y0) null, false, 2, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n1$c */
    public static final class C55322c extends C55319n1 {

        /* renamed from: e */
        public static final C55322c f157560e = new C55322c();

        public C55322c() {
            super("@@more@@", (C60690y0) null, false, 2, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n1$d */
    public static final class C55323d extends C55319n1 {

        /* renamed from: i */
        public static final C55324a f157561i = new C55324a((C8480h) null);

        /* renamed from: j */
        public static final ArrayMap<String, C55323d> f157562j = new ArrayMap<>();

        /* renamed from: e */
        public final String f157563e;

        /* renamed from: f */
        public final String f157564f;

        /* renamed from: g */
        public final long f157565g;

        /* renamed from: h */
        public final long f157566h;

        /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n1$d$a */
        public static final class C55324a {
            public C55324a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C55323d mo76616a(pr4 pr4) {
                C87412m.m108594g(pr4, "template");
                String str = pr4.f139919d;
                C87412m.m108593f(str, "template.id");
                C51754vy vyVar = pr4.f139922g;
                String str2 = null;
                String str3 = vyVar != null ? vyVar.f143760d : null;
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                if (vyVar != null) {
                    str2 = vyVar.f143763g;
                }
                if (str2 != null) {
                    str4 = str2;
                }
                yq4 yq4 = pr4.f139929q;
                int i = 0;
                long j = (long) (yq4 != null ? yq4.f145471d : 0);
                if (yq4 != null) {
                    i = yq4.f145473f;
                }
                return mo76617b(str, str3, str4, j, (long) i);
            }

            /* renamed from: b */
            public final C55323d mo76617b(String str, String str2, String str3, long j, long j2) {
                String str4 = str;
                C87412m.m108594g(str, "dataId");
                String str5 = str2;
                C87412m.m108594g(str2, "name");
                String str6 = str3;
                C87412m.m108594g(str3, "thumbnailUrl");
                ArrayMap<String, C55323d> arrayMap = C55323d.f157562j;
                if (!arrayMap.containsKey(str)) {
                    arrayMap.put(str, new C55323d(str, str2, str3, j, j2, (C8480h) null));
                }
                C55323d dVar = arrayMap.get(str);
                C87412m.m108591d(dVar);
                return dVar;
            }
        }

        public C55323d(String str, String str2, String str3, long j, long j2, C8480h hVar) {
            super(str, (C60690y0) null, false, 6, (C8480h) null);
            this.f157563e = str2;
            this.f157564f = str3;
            this.f157565g = j;
            this.f157566h = j2;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n1$e */
    public static final class C55325e extends C55319n1 {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C55325e() {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "@@loading@@-"
                r0.append(r1)
                int r1 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.f157554d
                int r2 = r1 + 1
                com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.f157554d = r2
                r0.append(r1)
                java.lang.String r4 = r0.toString()
                r5 = 0
                r6 = 0
                r7 = 2
                r8 = 0
                r3 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55325e.<init>():void");
        }
    }

    public C55319n1(String str, C60690y0<Boolean> y0Var, boolean z, int i, C8480h hVar) {
        y0Var = (i & 2) != 0 ? C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null) : y0Var;
        z = (i & 4) != 0 ? true : z;
        this.f157555a = str;
        this.f157556b = y0Var;
        this.f157557c = z;
    }
}
