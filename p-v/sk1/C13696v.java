package sk1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kg3.C76577a;
import nj3.C76912y0;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51559uk1;
import tf1.C13914m;

/* renamed from: sk1.v */
public final class C13696v extends C63956k {

    /* renamed from: H */
    public static final SimpleDateFormat f38753H = new SimpleDateFormat(C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.mbg), Locale.ENGLISH);

    /* renamed from: A */
    public String f38754A;

    /* renamed from: B */
    public int f38755B;

    /* renamed from: C */
    public String f38756C;

    /* renamed from: D */
    public String f38757D;

    /* renamed from: E */
    public boolean f38758E;

    /* renamed from: F */
    public boolean f38759F;

    /* renamed from: G */
    public String f38760G;

    /* renamed from: s */
    public C51559uk1 f38761s;

    /* renamed from: t */
    public final String f38762t;

    /* renamed from: u */
    public final String f38763u;

    /* renamed from: v */
    public int f38764v;

    /* renamed from: w */
    public String f38765w;

    /* renamed from: x */
    public String f38766x;

    /* renamed from: y */
    public String f38767y;

    /* renamed from: z */
    public long f38768z;

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13696v(te3.C51559uk1 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "data"
            gy3.C87412m.m108594g(r1, r2)
            r18.<init>()
            r0.f38761s = r1
            java.lang.String r2 = r1.f142893d
            r0.f38762t = r2
            java.lang.String r2 = r1.f142894e
            r0.f38763u = r2
            int r2 = r1.f142895f
            r0.f38764v = r2
            int r1 = r1.f142905s
            r0.f38755B = r1
            java.lang.String r1 = ""
            r0.f38760G = r1
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            java.lang.String r3 = "0.##"
            r2.<init>(r3)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r4 = r0.f38764v
            r6 = 0
            r8 = 1
            r9 = 0
            java.lang.String r10 = "getString(context, R.str…rice_break_discount_desc)"
            java.lang.String r11 = "format(format, *args)"
            r12 = 2
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r4 == r8) goto L_0x014b
            r15 = 2131828790(0x7f112036, float:1.929053E38)
            r5 = 2131828789(0x7f112035, float:1.9290529E38)
            if (r4 == r12) goto L_0x00c1
            r10 = 3
            if (r4 == r10) goto L_0x009e
            r10 = 4
            if (r4 == r10) goto L_0x007f
            r2 = 5
            if (r4 == r2) goto L_0x004f
            goto L_0x0182
        L_0x004f:
            r2 = 2131828786(0x7f112032, float:1.9290523E38)
            java.lang.Object[] r4 = new java.lang.Object[r12]
            te3.uk1 r5 = r0.f38761s
            te3.fz r5 = r5.f142908v
            if (r5 == 0) goto L_0x005d
            int r5 = r5.f133749d
            goto L_0x005e
        L_0x005d:
            r5 = 0
        L_0x005e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r9] = r5
            te3.uk1 r5 = r0.f38761s
            long r10 = r5.f142899j
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r4[r8] = r5
            java.lang.String r2 = r3.getString(r2, r4)
            r0.f38765w = r2
            r2 = 2131828787(0x7f112033, float:1.9290525E38)
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r2)
            r0.f38766x = r2
            goto L_0x0182
        L_0x007f:
            te3.uk1 r4 = r0.f38761s
            long r10 = r4.f142899j
            double r10 = (double) r10
            double r10 = r10 / r13
            java.lang.String r2 = r2.format(r10)
            r0.f38765w = r2
            te3.uk1 r2 = r0.f38761s
            int r2 = r2.f142907u
            if (r2 <= 0) goto L_0x0096
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r15)
            goto L_0x009a
        L_0x0096:
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r5)
        L_0x009a:
            r0.f38766x = r2
            goto L_0x0182
        L_0x009e:
            te3.uk1 r4 = r0.f38761s
            long r4 = r4.f142899j
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00ae
            r2 = 2131828794(0x7f11203a, float:1.9290539E38)
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r2)
            goto L_0x00b4
        L_0x00ae:
            double r4 = (double) r4
            double r4 = r4 / r13
            java.lang.String r2 = r2.format(r4)
        L_0x00b4:
            r0.f38765w = r2
            r2 = 2131828803(0x7f112043, float:1.9290557E38)
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r2)
            r0.f38766x = r2
            goto L_0x0182
        L_0x00c1:
            te3.uk1 r4 = r0.f38761s
            long r6 = r4.f142899j
            double r6 = (double) r6
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = r6 / r16
            java.lang.String r4 = r2.format(r6)
            r0.f38765w = r4
            te3.uk1 r4 = r0.f38761s
            te3.fz r6 = r4.f142908v
            if (r6 == 0) goto L_0x00dc
            int r7 = r6.f133750e
            goto L_0x00dd
        L_0x00dc:
            r7 = 0
        L_0x00dd:
            if (r7 <= 0) goto L_0x0109
            r7 = 2131828796(0x7f11203c, float:1.9290543E38)
            java.lang.String r3 = kg3.C76577a.m92166q(r3, r7)
            gy3.C87412m.m108593f(r3, r10)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            te3.uk1 r5 = r0.f38761s
            te3.fz r5 = r5.f142908v
            if (r5 == 0) goto L_0x00f4
            int r5 = r5.f133750e
            goto L_0x00f5
        L_0x00f4:
            r5 = 0
        L_0x00f5:
            double r5 = (double) r5
            double r5 = r5 / r13
            java.lang.String r2 = r2.format(r5)
            r4[r9] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r8)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            gy3.C87412m.m108593f(r2, r11)
            goto L_0x0148
        L_0x0109:
            if (r6 == 0) goto L_0x010e
            int r2 = r6.f133749d
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            if (r2 <= 0) goto L_0x013b
            r2 = 2131828788(0x7f112034, float:1.9290527E38)
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r2)
            java.lang.String r3 = "getString(context, R.str…g_coupon_condition_count)"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            te3.uk1 r4 = r0.f38761s
            te3.fz r4 = r4.f142908v
            if (r4 == 0) goto L_0x0128
            int r4 = r4.f133749d
            goto L_0x0129
        L_0x0128:
            r4 = 0
        L_0x0129:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r9] = r4
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r8)
            java.lang.String r2 = java.lang.String.format(r2, r3)
            gy3.C87412m.m108593f(r2, r11)
            goto L_0x0148
        L_0x013b:
            int r2 = r4.f142907u
            if (r2 <= 0) goto L_0x0144
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r15)
            goto L_0x0148
        L_0x0144:
            java.lang.String r2 = kg3.C76577a.m92166q(r3, r5)
        L_0x0148:
            r0.f38766x = r2
            goto L_0x0182
        L_0x014b:
            te3.uk1 r4 = r0.f38761s
            long r4 = r4.f142899j
            double r4 = (double) r4
            double r4 = r4 / r13
            java.lang.String r4 = r2.format(r4)
            r0.f38765w = r4
            r4 = 2131828796(0x7f11203c, float:1.9290543E38)
            java.lang.String r3 = kg3.C76577a.m92166q(r3, r4)
            gy3.C87412m.m108593f(r3, r10)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            te3.uk1 r5 = r0.f38761s
            te3.fz r5 = r5.f142908v
            if (r5 == 0) goto L_0x016c
            int r5 = r5.f133750e
            goto L_0x016d
        L_0x016c:
            r5 = 0
        L_0x016d:
            double r5 = (double) r5
            double r5 = r5 / r13
            java.lang.String r2 = r2.format(r5)
            r4[r9] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r8)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            gy3.C87412m.m108593f(r2, r11)
            r0.f38766x = r2
        L_0x0182:
            te3.uk1 r2 = r0.f38761s
            long r3 = r2.f142903q
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0191
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x0191:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            java.lang.String r2 = r2.f142911y
            if (r2 == 0) goto L_0x01a6
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x01a1
            r2 = 1
            goto L_0x01a2
        L_0x01a1:
            r2 = 0
        L_0x01a2:
            if (r2 != r8) goto L_0x01a6
            r2 = 1
            goto L_0x01a7
        L_0x01a6:
            r2 = 0
        L_0x01a7:
            if (r2 == 0) goto L_0x01b0
            te3.uk1 r2 = r0.f38761s
            java.lang.String r2 = r2.f142911y
            r0.f38756C = r2
            goto L_0x01bd
        L_0x01b0:
            java.text.SimpleDateFormat r2 = f38753H
            java.util.Date r5 = new java.util.Date
            r5.<init>(r3)
            java.lang.String r2 = r2.format(r5)
            r0.f38756C = r2
        L_0x01bd:
            te3.uk1 r2 = r0.f38761s
            int r3 = r2.f142904r
            long r3 = (long) r3
            r0.f38768z = r3
            java.lang.String r3 = r2.f142901o
            r0.f38767y = r3
            java.lang.String r3 = r0.f38766x
            r0.f38757D = r3
            int r3 = r2.f142897h
            if (r3 != r12) goto L_0x01d1
            goto L_0x01d2
        L_0x01d1:
            r8 = 0
        L_0x01d2:
            r0.f38758E = r8
            java.lang.String r3 = r2.f142906t
            r0.f38754A = r3
            java.lang.String r3 = r2.f142898i
            if (r3 != 0) goto L_0x01dd
            goto L_0x01de
        L_0x01dd:
            r1 = r3
        L_0x01de:
            int r3 = r2.f142896g
            int r2 = r2.f142892B
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.mo13078l(r1, r3, r2)
            java.lang.String r1 = r18.toString()
            java.lang.String r2 = "MicroMsg.ShopWindowCouponItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk1.C13696v.<init>(te3.uk1):void");
    }

    /* renamed from: a */
    public C89349b mo13072a() {
        return this.f181292e;
    }

    /* renamed from: b */
    public C47465a mo13073b() {
        return this.f38761s;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2;
    }

    /* renamed from: d */
    public long mo13074d() {
        return this.f181291d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C13696v.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
        return C87412m.m108589b(this.f38763u, ((C13696v) obj).f38763u);
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C13696v) || !C87412m.m108589b(((C13696v) mVar).f38763u, this.f38763u)) ? -1 : 0;
    }

    public long getItemId() {
        String str = this.f38763u;
        return (long) (str != null ? str.hashCode() : 0);
    }

    public int hashCode() {
        String str = this.f38763u;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: k */
    public final void mo13077k(Context context) {
        C87412m.m108594g(context, "context");
        if (this.f38755B == 1) {
            C76912y0.m92773l(context, C76577a.m92166q(context, C0966R.string.e7n));
        } else {
            C76912y0.m92768g(context, C76577a.m92166q(context, C0966R.string.e7m));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13078l(java.lang.String r4, int r5, java.lang.Integer r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0011
            int r2 = r4.length()
            if (r2 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            if (r2 != r1) goto L_0x0011
            r2 = 1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x0016
            r3.f38760G = r4
        L_0x0016:
            if (r5 == 0) goto L_0x0021
            te3.uk1 r4 = r3.f38761s
            r4.f142896g = r5
            if (r5 != r1) goto L_0x001f
            r0 = 1
        L_0x001f:
            r3.f38759F = r0
        L_0x0021:
            if (r6 == 0) goto L_0x002e
            r6.intValue()
            te3.uk1 r4 = r3.f38761s
            int r5 = r6.intValue()
            r4.f142892B = r5
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk1.C13696v.mo13078l(java.lang.String, int, java.lang.Integer):void");
    }

    public String toString() {
        return "ShopWindowCouponItem " + this.f38763u + ' ' + this.f38764v + ' ' + this.f38767y + ' ' + this.f38766x + ' ' + this.f38765w + ' ' + this.f38761s.f142897h + ' ' + this.f38761s.f142896g + ' ' + this.f38760G + ' ' + this.f38755B + ' ' + this.f38768z;
    }
}
