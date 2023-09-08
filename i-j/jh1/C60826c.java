package jh1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fh1.C58999c1;
import gy3.C87412m;
import te3.C64622p31;
import wc1.C15064b;

/* renamed from: jh1.c */
public final class C60826c implements View.OnClickListener {

    /* renamed from: d */
    public final View f173255d;

    /* renamed from: e */
    public final C58999c1 f173256e;

    /* renamed from: f */
    public final String f173257f;

    /* renamed from: g */
    public ViewGroup f173258g;

    /* renamed from: h */
    public View f173259h;

    /* renamed from: i */
    public ImageView f173260i;

    /* renamed from: j */
    public TextView f173261j;

    /* renamed from: n */
    public TextView f173262n;

    /* renamed from: o */
    public TextView f173263o;

    /* renamed from: p */
    public TextView f173264p;

    /* renamed from: q */
    public WeImageView f173265q;

    /* renamed from: r */
    public TextView f173266r;

    /* renamed from: s */
    public WeImageView f173267s;

    /* renamed from: t */
    public TextView f173268t;

    /* renamed from: u */
    public C60827a f173269u = C60827a.NONE;

    /* renamed from: jh1.c$a */
    public enum C60827a {
        NONE,
        REDPACKET_NOT_RECEIVE,
        REDPACKET_RECEIVE,
        COUPON_NOT_USE,
        COUPON_USE
    }

    public C60826c(View view, C58999c1 c1Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(c1Var, "controller");
        this.f173255d = view;
        this.f173256e = c1Var;
        this.f173257f = c1Var.f168796j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r11 = r10.f185091n;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m71224a(jh1.C60826c r18, te3.C64622p31 r19, wx3.C15601d r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r18.getClass()
            java.lang.Class<cl1.x0> r3 = cl1.C55006x0.class
            boolean r4 = r2 instanceof jh1.C60830f
            if (r4 == 0) goto L_0x001e
            r4 = r2
            jh1.f r4 = (jh1.C60830f) r4
            int r5 = r4.f173287h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f173287h = r5
            goto L_0x0023
        L_0x001e:
            jh1.f r4 = new jh1.f
            r4.<init>(r0, r2)
        L_0x0023:
            java.lang.Object r2 = r4.f173285f
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f173287h
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0048
            if (r6 != r7) goto L_0x0040
            java.lang.Object r0 = r4.f173284e
            te3.p31 r0 = (te3.C64622p31) r0
            java.lang.Object r1 = r4.f173283d
            jh1.c r1 = (jh1.C60826c) r1
            kotlin.ResultKt.throwOnFailure(r2)
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x009b
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r2)
            fh1.c1 r2 = r0.f173256e
            androidx.lifecycle.i0 r2 = r2.business(r3)
            cl1.x0 r2 = (cl1.C55006x0) r2
            te3.d82 r6 = new te3.d82
            r6.<init>()
            r9 = 3
            r6.f182655d = r9
            te3.r31 r9 = new te3.r31
            r9.<init>()
            r9.f185102d = r7
            java.lang.String r10 = r1.f184746d
            r9.f185103e = r10
            te3.qx2 r10 = r1.f184751i
            if (r10 == 0) goto L_0x0071
            te3.dx2 r11 = r10.f185091n
            if (r11 == 0) goto L_0x0071
            java.lang.String r11 = r11.f182900d
            goto L_0x0072
        L_0x0071:
            r11 = r8
        L_0x0072:
            r9.f185104f = r11
            if (r10 == 0) goto L_0x007d
            te3.dx2 r10 = r10.f185091n
            if (r10 == 0) goto L_0x007d
            java.lang.String r10 = r10.f182901e
            goto L_0x007e
        L_0x007d:
            r10 = r8
        L_0x007e:
            r9.f185105g = r10
            byte[] r9 = r9.toByteArray()
            pe3.b r10 = new pe3.b
            r10.<init>(r9)
            r6.f182656e = r10
            java.lang.Class<te3.s31> r9 = te3.C64695s31.class
            r4.f173283d = r0
            r4.f173284e = r1
            r4.f173287h = r7
            java.lang.Object r2 = r2.mo76057j3(r6, r9, r4)
            if (r2 != r5) goto L_0x009b
            goto L_0x017e
        L_0x009b:
            te3.s31 r2 = (te3.C64695s31) r2
            if (r2 == 0) goto L_0x00a2
            te3.wr2 r4 = r2.f185324e
            goto L_0x00a3
        L_0x00a2:
            r4 = r8
        L_0x00a3:
            if (r4 == 0) goto L_0x017c
            android.widget.TextView r4 = r0.f173262n
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x00ac
            goto L_0x00b9
        L_0x00ac:
            te3.wr2 r6 = r2.f185324e
            if (r6 == 0) goto L_0x00b5
            java.lang.String r6 = r6.f186194h
            if (r6 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r6 = r5
        L_0x00b6:
            r4.setText(r6)
        L_0x00b9:
            fh1.c1 r4 = r0.f173256e
            androidx.lifecycle.i0 r4 = r4.business(r3)
            cl1.x0 r4 = (cl1.C55006x0) r4
            java.lang.String r6 = r1.f184746d
            if (r6 != 0) goto L_0x00c6
            r6 = r5
        L_0x00c6:
            java.lang.Object r4 = r4.mo76052d3(r6)
            boolean r6 = r4 instanceof te3.C64695s31
            if (r6 == 0) goto L_0x00d1
            te3.s31 r4 = (te3.C64695s31) r4
            goto L_0x00d2
        L_0x00d1:
            r4 = r8
        L_0x00d2:
            if (r4 == 0) goto L_0x00db
            int r4 = r4.f185323d
            int r6 = r2.f185323d
            if (r4 != r6) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r7 = 0
        L_0x00dc:
            if (r7 != 0) goto L_0x00f6
            jh1.j r9 = jh1.C9406j.f29357a
            java.lang.String r4 = r1.f184746d
            if (r4 != 0) goto L_0x00e6
            r10 = r5
            goto L_0x00e7
        L_0x00e6:
            r10 = r4
        L_0x00e7:
            r11 = 20
            r12 = 0
            r13 = 0
            java.lang.Integer r14 = r9.mo10126a(r1, r2, r8)
            r15 = 12
            r16 = 0
            jh1.C9406j.m9112f(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00f6:
            int r4 = r2.f185323d
            r6 = 2
            if (r4 != r6) goto L_0x011f
            jh1.c$a r10 = jh1.C60826c.C60827a.COUPON_USE
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131828075(0x7f111d6b, float:1.928908E38)
            java.lang.String r11 = r4.getString(r6)
            java.lang.String r4 = "getContext().resources.g…ottery_winner_cash_tip_2)"
            gy3.C87412m.m108593f(r11, r4)
            r12 = 2131100642(0x7f0603e2, float:1.7813671E38)
            r13 = 1099431936(0x41880000, float:17.0)
            r14 = 0
            r15 = 1
            r16 = 1
            r9 = r0
            r9.mo85744d(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x013c
        L_0x011f:
            jh1.c$a r10 = jh1.C60826c.C60827a.COUPON_NOT_USE
            te3.wr2 r4 = r2.f185324e
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = r4.f186192f
            if (r4 != 0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r11 = r4
            goto L_0x012d
        L_0x012c:
            r11 = r5
        L_0x012d:
            r12 = 2131100664(0x7f0603f8, float:1.7813716E38)
            r13 = 1099431936(0x41880000, float:17.0)
            r14 = 2131232687(0x7f0807af, float:1.808149E38)
            r15 = 0
            r16 = 1
            r9 = r0
            r9.mo85744d(r10, r11, r12, r13, r14, r15, r16)
        L_0x013c:
            java.lang.String r4 = r0.f173257f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "lottery coupon_info:"
            r6.append(r7)
            te3.qx2 r7 = r1.f184751i
            if (r7 == 0) goto L_0x014e
            te3.dx2 r8 = r7.f185091n
        L_0x014e:
            if (r8 != 0) goto L_0x0151
            r8 = r5
        L_0x0151:
            org.json.JSONObject r7 = o40.C61937h.m72709h(r8)
            r6.append(r7)
            java.lang.String r7 = "; lotteryStatus coupon_info:"
            r6.append(r7)
            org.json.JSONObject r7 = o40.C61937h.m72709h(r2)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            fh1.c1 r0 = r0.f173256e
            androidx.lifecycle.i0 r0 = r0.business(r3)
            cl1.x0 r0 = (cl1.C55006x0) r0
            java.lang.String r1 = r1.f184746d
            if (r1 != 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r5 = r1
        L_0x0179:
            r0.mo76058k3(r5, r2)
        L_0x017c:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x017e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60826c.m71224a(jh1.c, te3.p31, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        r9 = r9.f185092o;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m71225b(jh1.C60826c r18, te3.C64622p31 r19, wx3.C15601d r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r18.getClass()
            java.lang.Class<cl1.x0> r3 = cl1.C55006x0.class
            boolean r4 = r2 instanceof jh1.C60831g
            if (r4 == 0) goto L_0x001e
            r4 = r2
            jh1.g r4 = (jh1.C60831g) r4
            int r5 = r4.f173292h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f173292h = r5
            goto L_0x0023
        L_0x001e:
            jh1.g r4 = new jh1.g
            r4.<init>(r0, r2)
        L_0x0023:
            java.lang.Object r2 = r4.f173290f
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f173292h
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0048
            if (r6 != r8) goto L_0x0040
            java.lang.Object r0 = r4.f173289e
            te3.p31 r0 = (te3.C64622p31) r0
            java.lang.Object r1 = r4.f173288d
            jh1.c r1 = (jh1.C60826c) r1
            kotlin.ResultKt.throwOnFailure(r2)
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x0078
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r2)
            fh1.c1 r2 = r0.f173256e
            androidx.lifecycle.i0 r2 = r2.business(r3)
            cl1.x0 r2 = (cl1.C55006x0) r2
            te3.d82 r6 = new te3.d82
            r6.<init>()
            r6.f182655d = r8
            te3.qx2 r9 = r1.f184751i
            if (r9 == 0) goto L_0x0065
            te3.ox2 r9 = r9.f185092o
            if (r9 == 0) goto L_0x0065
            pe3.b r9 = r9.f139434d
            goto L_0x0066
        L_0x0065:
            r9 = r7
        L_0x0066:
            r6.f182656e = r9
            java.lang.Class<te3.a61> r9 = te3.C64224a61.class
            r4.f173288d = r0
            r4.f173289e = r1
            r4.f173292h = r8
            java.lang.Object r2 = r2.mo76057j3(r6, r9, r4)
            if (r2 != r5) goto L_0x0078
            goto L_0x012c
        L_0x0078:
            te3.a61 r2 = (te3.C64224a61) r2
            if (r2 == 0) goto L_0x012a
            fh1.c1 r4 = r0.f173256e
            androidx.lifecycle.i0 r4 = r4.business(r3)
            cl1.x0 r4 = (cl1.C55006x0) r4
            java.lang.String r5 = r1.f184746d
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x008b
            r5 = r6
        L_0x008b:
            java.lang.Object r4 = r4.mo76052d3(r5)
            boolean r5 = r4 instanceof te3.C64224a61
            if (r5 == 0) goto L_0x0096
            te3.a61 r4 = (te3.C64224a61) r4
            goto L_0x0097
        L_0x0096:
            r4 = r7
        L_0x0097:
            if (r4 == 0) goto L_0x00a0
            boolean r4 = r4.f182035d
            boolean r5 = r2.f182035d
            if (r4 != r5) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 != 0) goto L_0x00bb
            jh1.j r9 = jh1.C9406j.f29357a
            java.lang.String r4 = r1.f184746d
            if (r4 != 0) goto L_0x00ab
            r10 = r6
            goto L_0x00ac
        L_0x00ab:
            r10 = r4
        L_0x00ac:
            r11 = 20
            r12 = 0
            r13 = 0
            java.lang.Integer r14 = r9.mo10126a(r1, r7, r2)
            r15 = 12
            r16 = 0
            jh1.C9406j.m9112f(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00bb:
            boolean r4 = r2.f182035d
            if (r4 == 0) goto L_0x00f4
            jh1.c$a r10 = jh1.C60826c.C60827a.REDPACKET_RECEIVE
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131828074(0x7f111d6a, float:1.9289079E38)
            java.lang.String r11 = r4.getString(r5)
            java.lang.String r4 = "getContext().resources.g…ottery_winner_cash_tip_1)"
            gy3.C87412m.m108593f(r11, r4)
            r12 = 2131100642(0x7f0603e2, float:1.7813671E38)
            r13 = 1099431936(0x41880000, float:17.0)
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r0
            r9.mo85744d(r10, r11, r12, r13, r14, r15, r16)
            fh1.c1 r0 = r0.f173256e
            androidx.lifecycle.i0 r0 = r0.business(r3)
            cl1.x0 r0 = (cl1.C55006x0) r0
            java.lang.String r1 = r1.f184746d
            if (r1 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r6 = r1
        L_0x00f0:
            r0.mo76058k3(r6, r2)
            goto L_0x012a
        L_0x00f4:
            jh1.c$a r10 = jh1.C60826c.C60827a.REDPACKET_NOT_RECEIVE
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131828073(0x7f111d69, float:1.9289077E38)
            java.lang.String r11 = r4.getString(r5)
            java.lang.String r4 = "getContext().resources.g…_lottery_winner_cash_tip)"
            gy3.C87412m.m108593f(r11, r4)
            r12 = 2131100664(0x7f0603f8, float:1.7813716E38)
            r13 = 1099431936(0x41880000, float:17.0)
            r14 = 2131232687(0x7f0807af, float:1.808149E38)
            r15 = 0
            r16 = 1
            r9 = r0
            r9.mo85744d(r10, r11, r12, r13, r14, r15, r16)
            fh1.c1 r0 = r0.f173256e
            androidx.lifecycle.i0 r0 = r0.business(r3)
            cl1.x0 r0 = (cl1.C55006x0) r0
            java.lang.String r1 = r1.f184746d
            if (r1 != 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r6 = r1
        L_0x0127:
            r0.mo76058k3(r6, r2)
        L_0x012a:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x012c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60826c.m71225b(jh1.c, te3.p31, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public static void m71226f(C60826c cVar, boolean z, boolean z2, Integer num, int i, Object obj) {
        String str;
        if ((i & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if (z) {
            TextView textView = cVar.f173266r;
            if (textView != null) {
                textView.setVisibility(0);
            }
            WeImageView weImageView = cVar.f173267s;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            C9406j jVar = C9406j.f29357a;
            C64622p31 p312 = cVar.f173256e.f168804u;
            if (p312 == null || (str = p312.f184746d) == null) {
                str = "";
            }
            C9406j.m9112f(jVar, str, 20, (String) null, (String) null, num2, 12, (Object) null);
            return;
        }
        TextView textView2 = cVar.f173266r;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        WeImageView weImageView2 = cVar.f173267s;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo85743c() {
        ViewGroup viewGroup = this.f173258g;
        TextView textView = null;
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.f173255d.findViewById(C0966R.C0970id.ogl);
            if (viewGroup != null) {
                viewGroup.setOnClickListener(this);
            } else {
                viewGroup = null;
            }
        }
        this.f173258g = viewGroup;
        View view = this.f173259h;
        if (view == null) {
            if (viewGroup == null || (view = viewGroup.findViewById(C0966R.C0970id.ojv)) == null) {
                view = null;
            } else {
                view.setOnClickListener(this);
            }
        }
        this.f173259h = view;
        ImageView imageView = this.f173260i;
        if (imageView == null) {
            ViewGroup viewGroup2 = this.f173258g;
            imageView = viewGroup2 != null ? (ImageView) viewGroup2.findViewById(C0966R.C0970id.lqa) : null;
        }
        this.f173260i = imageView;
        TextView textView2 = this.f173261j;
        if (textView2 == null) {
            ViewGroup viewGroup3 = this.f173258g;
            if (viewGroup3 == null || (textView2 = (TextView) viewGroup3.findViewById(C0966R.C0970id.lqf)) == null) {
                textView2 = null;
            } else {
                C15064b bVar = C15064b.f41199a;
                Context context = textView2.getContext();
                C87412m.m108593f(context, "context");
                C15064b.m14230a(bVar, context, textView2, 17.0f, 0.0f, 8, (Object) null);
            }
        }
        this.f173261j = textView2;
        TextView textView3 = this.f173262n;
        if (textView3 == null) {
            ViewGroup viewGroup4 = this.f173258g;
            textView3 = viewGroup4 != null ? (TextView) viewGroup4.findViewById(C0966R.C0970id.och) : null;
        }
        this.f173262n = textView3;
        TextView textView4 = this.f173263o;
        if (textView4 == null) {
            ViewGroup viewGroup5 = this.f173258g;
            if (viewGroup5 == null || (textView4 = (TextView) viewGroup5.findViewById(C0966R.C0970id.nbx)) == null) {
                textView4 = null;
            } else {
                C15064b bVar2 = C15064b.f41199a;
                Context context2 = textView4.getContext();
                C87412m.m108593f(context2, "context");
                C15064b.m14230a(bVar2, context2, textView4, 22.0f, 0.0f, 8, (Object) null);
            }
        }
        this.f173263o = textView4;
        TextView textView5 = this.f173264p;
        if (textView5 == null) {
            ViewGroup viewGroup6 = this.f173258g;
            if (viewGroup6 == null || (textView5 = (TextView) viewGroup6.findViewById(C0966R.C0970id.n6v)) == null) {
                textView5 = null;
            } else {
                textView5.setOnClickListener(this);
                C15064b bVar3 = C15064b.f41199a;
                Context context3 = textView5.getContext();
                C87412m.m108593f(context3, "context");
                C15064b.m14230a(bVar3, context3, textView5, 17.0f, 0.0f, 8, (Object) null);
                C85875k4.m106189j0(textView5.getPaint(), 0.8f);
            }
        }
        this.f173264p = textView5;
        WeImageView weImageView = this.f173265q;
        if (weImageView == null) {
            ViewGroup viewGroup7 = this.f173258g;
            if (viewGroup7 == null || (weImageView = (WeImageView) viewGroup7.findViewById(C0966R.C0970id.f357712o10)) == null) {
                weImageView = null;
            } else {
                weImageView.setOnClickListener(this);
            }
        }
        this.f173265q = weImageView;
        TextView textView6 = this.f173266r;
        if (textView6 == null) {
            ViewGroup viewGroup8 = this.f173258g;
            if (viewGroup8 == null || (textView6 = (TextView) viewGroup8.findViewById(C0966R.C0970id.ojq)) == null) {
                textView6 = null;
            } else {
                textView6.setOnClickListener(this);
                C15064b bVar4 = C15064b.f41199a;
                Context context4 = textView6.getContext();
                C87412m.m108593f(context4, "context");
                C15064b.m14230a(bVar4, context4, textView6, 14.0f, 0.0f, 8, (Object) null);
            }
        }
        this.f173266r = textView6;
        WeImageView weImageView2 = this.f173267s;
        if (weImageView2 == null) {
            ViewGroup viewGroup9 = this.f173258g;
            if (viewGroup9 == null || (weImageView2 = (WeImageView) viewGroup9.findViewById(C0966R.C0970id.ojr)) == null) {
                weImageView2 = null;
            } else {
                weImageView2.setOnClickListener(this);
            }
        }
        this.f173267s = weImageView2;
        TextView textView7 = this.f173268t;
        if (textView7 == null) {
            ViewGroup viewGroup10 = this.f173258g;
            if (!(viewGroup10 == null || (textView7 = (TextView) viewGroup10.findViewById(C0966R.C0970id.oir)) == null)) {
                C15064b bVar5 = C15064b.f41199a;
                Context context5 = textView7.getContext();
                C87412m.m108593f(context5, "context");
                C15064b.m14230a(bVar5, context5, textView7, 14.0f, 0.0f, 8, (Object) null);
            }
            this.f173268t = textView;
        }
        textView = textView7;
        this.f173268t = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r8 = r4.f184746d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85744d(jh1.C60826c.C60827a r26, java.lang.String r27, int r28, float r29, int r30, boolean r31, boolean r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r30
            jh1.c$a r4 = r0.f173269u
            r5 = 1
            r6 = 0
            if (r1 == r4) goto L_0x0093
            int r4 = r26.ordinal()
            java.lang.String r7 = ""
            if (r4 == r5) goto L_0x007a
            r8 = 3
            if (r4 == r8) goto L_0x0049
            r8 = 4
            if (r4 == r8) goto L_0x001e
            goto L_0x0093
        L_0x001e:
            jh1.j r9 = jh1.C9406j.f29357a
            fh1.c1 r4 = r0.f173256e
            te3.p31 r4 = r4.f168804u
            if (r4 == 0) goto L_0x002d
            java.lang.String r8 = r4.f184746d
            if (r8 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r10 = r8
            goto L_0x002e
        L_0x002d:
            r10 = r7
        L_0x002e:
            r11 = 17
            if (r4 == 0) goto L_0x003e
            te3.qx2 r4 = r4.f184751i
            if (r4 == 0) goto L_0x003e
            te3.dx2 r4 = r4.f185091n
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = r4.f182900d
            r12 = r4
            goto L_0x003f
        L_0x003e:
            r12 = r6
        L_0x003f:
            r13 = 0
            r14 = 0
            r15 = 24
            r16 = 0
            jh1.C9406j.m9112f(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0093
        L_0x0049:
            jh1.j r17 = jh1.C9406j.f29357a
            fh1.c1 r4 = r0.f173256e
            te3.p31 r4 = r4.f168804u
            if (r4 == 0) goto L_0x0059
            java.lang.String r8 = r4.f184746d
            if (r8 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r18 = r8
            goto L_0x005b
        L_0x0059:
            r18 = r7
        L_0x005b:
            r19 = 15
            if (r4 == 0) goto L_0x006c
            te3.qx2 r4 = r4.f184751i
            if (r4 == 0) goto L_0x006c
            te3.dx2 r4 = r4.f185091n
            if (r4 == 0) goto L_0x006c
            java.lang.String r4 = r4.f182900d
            r20 = r4
            goto L_0x006e
        L_0x006c:
            r20 = r6
        L_0x006e:
            r21 = 0
            r22 = 0
            r23 = 24
            r24 = 0
            jh1.C9406j.m9112f(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0093
        L_0x007a:
            jh1.j r4 = jh1.C9406j.f29357a
            fh1.c1 r8 = r0.f173256e
            te3.p31 r8 = r8.f168804u
            if (r8 == 0) goto L_0x0086
            java.lang.String r8 = r8.f184746d
            if (r8 != 0) goto L_0x0087
        L_0x0086:
            r8 = r7
        L_0x0087:
            r9 = 11
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 28
            r14 = 0
            r7 = r4
            jh1.C9406j.m9112f(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0093:
            r0.f173269u = r1
            android.widget.TextView r4 = r0.f173264p
            if (r4 == 0) goto L_0x009c
            r4.setBackgroundResource(r3)
        L_0x009c:
            android.widget.TextView r4 = r0.f173264p
            if (r4 != 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r4.setText(r2)
        L_0x00a4:
            android.widget.TextView r4 = r0.f173264p
            if (r4 == 0) goto L_0x00b9
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = r28
            int r7 = r7.getColor(r8)
            r4.setTextColor(r7)
        L_0x00b9:
            android.widget.TextView r4 = r0.f173264p
            if (r4 == 0) goto L_0x00c2
            r7 = r29
            r4.setTextSize(r5, r7)
        L_0x00c2:
            android.widget.TextView r4 = r0.f173264p
            if (r4 == 0) goto L_0x00cb
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            goto L_0x00cc
        L_0x00cb:
            r4 = r6
        L_0x00cc:
            boolean r5 = r4 instanceof android.view.ViewGroup.LayoutParams
            if (r5 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r4 = r6
        L_0x00d2:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131165315(0x7f070083, float:1.7944844E38)
            int r5 = r5.getDimensionPixelOffset(r7)
            java.lang.String r7 = r0.f173257f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "status:"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = ", setClaimBtn "
            r8.append(r1)
            r8.append(r2)
            java.lang.String r1 = ",bgResId:"
            r8.append(r1)
            r8.append(r3)
            java.lang.String r1 = ",layoutParams width:"
            r8.append(r1)
            if (r4 == 0) goto L_0x010f
            int r1 = r4.width
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0110
        L_0x010f:
            r1 = r6
        L_0x0110:
            r8.append(r1)
            java.lang.String r1 = ",height:"
            r8.append(r1)
            if (r4 == 0) goto L_0x0121
            int r1 = r4.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0122
        L_0x0121:
            r1 = r6
        L_0x0122:
            r8.append(r1)
            java.lang.String r1 = ", measuredWidth:"
            r8.append(r1)
            android.widget.TextView r1 = r0.f173264p
            if (r1 == 0) goto L_0x0136
            int r1 = r1.getMeasuredWidth()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x0136:
            r8.append(r6)
            java.lang.String r1 = ",minWidth:"
            r8.append(r1)
            r8.append(r5)
            r1 = 33
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            r1 = 0
            r2 = -2
            if (r3 != 0) goto L_0x015c
            if (r4 != 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            r4.width = r2
        L_0x0156:
            if (r4 != 0) goto L_0x0159
            goto L_0x0187
        L_0x0159:
            r4.height = r2
            goto L_0x0187
        L_0x015c:
            android.widget.TextView r3 = r0.f173264p
            if (r3 == 0) goto L_0x0165
            int r3 = r3.getMeasuredWidth()
            goto L_0x0166
        L_0x0165:
            r3 = 0
        L_0x0166:
            if (r3 > r5) goto L_0x016e
            if (r4 != 0) goto L_0x016b
            goto L_0x0173
        L_0x016b:
            r4.width = r5
            goto L_0x0173
        L_0x016e:
            if (r4 != 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r4.width = r2
        L_0x0173:
            if (r4 != 0) goto L_0x0176
            goto L_0x0187
        L_0x0176:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            r4.height = r2
        L_0x0187:
            if (r31 == 0) goto L_0x0192
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f173265q
            if (r2 != 0) goto L_0x018e
            goto L_0x019c
        L_0x018e:
            r2.setVisibility(r1)
            goto L_0x019c
        L_0x0192:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f173265q
            if (r1 != 0) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r2 = 8
            r1.setVisibility(r2)
        L_0x019c:
            android.widget.TextView r1 = r0.f173264p
            if (r1 != 0) goto L_0x01a1
            goto L_0x01a6
        L_0x01a1:
            r2 = r32
            r1.setEnabled(r2)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60826c.mo85744d(jh1.c$a, java.lang.String, int, float, int, boolean, boolean):void");
    }

    /* renamed from: e */
    public final void mo85745e(int i) {
        Integer num = null;
        if (C58739j4.f168176a.mo83692U()) {
            String str = this.f173257f;
            StringBuilder sb = new StringBuilder();
            sb.append("setVisible:");
            sb.append(i);
            sb.append(",winnerContainner visibility:");
            ViewGroup viewGroup = this.f173258g;
            if (viewGroup != null) {
                num = Integer.valueOf(viewGroup.getVisibility());
            }
            sb.append(num);
            Log.printInfoStack(str, sb.toString(), new Object[0]);
        } else {
            String str2 = this.f173257f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("setVisible:");
            sb4.append(i);
            sb4.append(",winnerContainner visibility:");
            ViewGroup viewGroup2 = this.f173258g;
            if (viewGroup2 != null) {
                num = Integer.valueOf(viewGroup2.getVisibility());
            }
            sb4.append(num);
            Log.m105924i(str2, sb4.toString());
        }
        if (this.f173258g == null) {
            mo85743c();
        }
        ViewGroup viewGroup3 = this.f173258g;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: te3.a61} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.tencent.mm.plugin.finder.live.view.b, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r20) {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            java.lang.Class<cl1.x0> r8 = cl1.C55006x0.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r19
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x002e
            int r2 = r20.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            r3 = 2131316630(0x7f094f96, float:1.8251747E38)
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            int r6 = r2.intValue()
            if (r6 != r3) goto L_0x003f
        L_0x003d:
            r3 = 1
            goto L_0x004d
        L_0x003f:
            r3 = 2131316631(0x7f094f97, float:1.8251749E38)
            if (r2 != 0) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            int r6 = r2.intValue()
            if (r6 != r3) goto L_0x004c
            goto L_0x003d
        L_0x004c:
            r3 = 0
        L_0x004d:
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x00a8
            fh1.c1 r0 = r7.f173256e
            te3.p31 r2 = r0.f168804u
            if (r2 == 0) goto L_0x009f
            jh1.j r9 = jh1.C9406j.f29357a
            java.lang.String r3 = r2.f184746d
            if (r3 != 0) goto L_0x005f
            r10 = r6
            goto L_0x0060
        L_0x005f:
            r10 = r3
        L_0x0060:
            r11 = 21
            r12 = 0
            r13 = 0
            androidx.lifecycle.i0 r0 = r0.business(r8)
            cl1.x0 r0 = (cl1.C55006x0) r0
            java.lang.String r3 = r2.f184746d
            if (r3 != 0) goto L_0x006f
            r3 = r6
        L_0x006f:
            java.lang.Object r0 = r0.mo76052d3(r3)
            boolean r3 = r0 instanceof te3.C64695s31
            if (r3 == 0) goto L_0x007a
            te3.s31 r0 = (te3.C64695s31) r0
            goto L_0x007b
        L_0x007a:
            r0 = r1
        L_0x007b:
            fh1.c1 r3 = r7.f173256e
            androidx.lifecycle.i0 r3 = r3.business(r8)
            cl1.x0 r3 = (cl1.C55006x0) r3
            java.lang.String r4 = r2.f184746d
            if (r4 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r6 = r4
        L_0x0089:
            java.lang.Object r3 = r3.mo76052d3(r6)
            boolean r4 = r3 instanceof te3.C64224a61
            if (r4 == 0) goto L_0x0094
            r1 = r3
            te3.a61 r1 = (te3.C64224a61) r1
        L_0x0094:
            java.lang.Integer r14 = r9.mo10126a(r2, r0, r1)
            r15 = 12
            r16 = 0
            jh1.C9406j.m9112f(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x009f:
            fh1.c1 r0 = r7.f173256e
            android.view.ViewGroup r1 = r7.f173258g
            r0.mo84229G3(r1)
            goto L_0x02cb
        L_0x00a8:
            r3 = 2131317112(0x7f095178, float:1.8252725E38)
            if (r2 != 0) goto L_0x00ae
            goto L_0x00c6
        L_0x00ae:
            int r9 = r2.intValue()
            if (r9 != r3) goto L_0x00c6
            fh1.c1 r0 = r7.f173256e
            fy3.l<? super java.lang.Boolean, rx3.b0> r0 = r0.f168806w
            if (r0 == 0) goto L_0x00bf
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        L_0x00bf:
            fh1.c1 r0 = r7.f173256e
            r0.mo84230m3()
            goto L_0x02cb
        L_0x00c6:
            r3 = 2131299648(0x7f090d40, float:1.8217303E38)
            if (r2 != 0) goto L_0x00cc
            goto L_0x00d4
        L_0x00cc:
            int r9 = r2.intValue()
            if (r9 != r3) goto L_0x00d4
        L_0x00d2:
            r2 = 1
            goto L_0x00e2
        L_0x00d4:
            r3 = 2131299647(0x7f090d3f, float:1.8217301E38)
            if (r2 != 0) goto L_0x00da
            goto L_0x00e1
        L_0x00da:
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x00e1
            goto L_0x00d2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            if (r2 == 0) goto L_0x02cb
            fh1.c1 r2 = r7.f173256e
            te3.p31 r3 = r2.f168804u
            if (r3 == 0) goto L_0x00f4
            te3.nx2 r9 = r3.f184748f
            if (r9 == 0) goto L_0x00f4
            int r9 = r9.f184578g
            if (r9 != r5) goto L_0x00f4
            r9 = 1
            goto L_0x00f5
        L_0x00f4:
            r9 = 0
        L_0x00f5:
            r10 = 2
            if (r9 == 0) goto L_0x025d
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r2.business(r8)
            cl1.x0 r2 = (cl1.C55006x0) r2
            fh1.c1 r3 = r7.f173256e
            te3.p31 r3 = r3.f168804u
            if (r3 == 0) goto L_0x010a
            java.lang.String r3 = r3.f184746d
            if (r3 != 0) goto L_0x010b
        L_0x010a:
            r3 = r6
        L_0x010b:
            java.lang.Object r2 = r2.mo76052d3(r3)
            boolean r3 = r2 instanceof te3.C64695s31
            if (r3 == 0) goto L_0x0116
            te3.s31 r2 = (te3.C64695s31) r2
            goto L_0x0117
        L_0x0116:
            r2 = r1
        L_0x0117:
            if (r2 != 0) goto L_0x0122
            java.lang.String r0 = r7.f173257f
            java.lang.String r1 = "claim prize,but coupon info is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x02cb
        L_0x0122:
            te3.wr2 r3 = r2.f185324e
            if (r3 == 0) goto L_0x0129
            pe3.b r8 = r3.f186193g
            goto L_0x012a
        L_0x0129:
            r8 = r1
        L_0x012a:
            if (r8 != 0) goto L_0x0135
            java.lang.String r0 = r7.f173257f
            java.lang.String r1 = "claim prize,but jump_info is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x02cb
        L_0x0135:
            int r2 = r2.f185323d
            java.lang.String r9 = "safeParser"
            if (r2 != r10) goto L_0x0188
            jh1.j r11 = jh1.C9406j.f29357a
            fh1.c1 r0 = r7.f173256e
            te3.p31 r0 = r0.f168804u
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = r0.f184746d
            if (r0 != 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r12 = r0
            goto L_0x014b
        L_0x014a:
            r12 = r6
        L_0x014b:
            r13 = 18
            if (r3 == 0) goto L_0x0151
            java.lang.String r1 = r3.f186190d
        L_0x0151:
            r14 = r1
            r15 = 0
            r16 = 0
            r17 = 24
            r18 = 0
            jh1.C9406j.m9112f(r11, r12, r13, r14, r15, r16, r17, r18)
            rn1.a r1 = rn1.C13091a.f37264a
            android.view.View r0 = r7.f173255d
            android.content.Context r2 = r0.getContext()
            java.lang.String r0 = "root.context"
            gy3.C87412m.m108593f(r2, r0)
            te3.l60 r3 = new te3.l60
            r3.<init>()
            byte[] r0 = r8.mo123703f()
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x0176 }
            goto L_0x017f
        L_0x0176:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r6, r0)
        L_0x017f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r0 = 1177(0x499, float:1.65E-42)
            r1.mo12595c(r2, r3, r0)
            goto L_0x02cb
        L_0x0188:
            jh1.j r10 = jh1.C9406j.f29357a
            fh1.c1 r2 = r7.f173256e
            te3.p31 r2 = r2.f168804u
            if (r2 == 0) goto L_0x0197
            java.lang.String r2 = r2.f184746d
            if (r2 != 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r11 = r2
            goto L_0x0198
        L_0x0197:
            r11 = r6
        L_0x0198:
            r12 = 16
            if (r3 == 0) goto L_0x01a0
            java.lang.String r2 = r3.f186190d
            r13 = r2
            goto L_0x01a1
        L_0x01a0:
            r13 = r1
        L_0x01a1:
            r14 = 0
            r15 = 0
            r16 = 24
            r17 = 0
            jh1.C9406j.m9112f(r10, r11, r12, r13, r14, r15, r16, r17)
            fh1.c1 r2 = r7.f173256e
            com.tencent.mm.plugin.finder.live.view.b2 r2 = r2.f27261e
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r3 == 0) goto L_0x01b5
            r1 = r2
            com.tencent.mm.plugin.finder.live.view.b r1 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r1
        L_0x01b5:
            if (r1 == 0) goto L_0x02cb
            byte[] r14 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "live_milestone_lottery:"
            r2.append(r3)
            fh1.c1 r3 = r7.f173256e
            java.lang.Class<cl1.u> r10 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r3.business(r10)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r10 = r3.f182392d
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            fh1.c1 r10 = r7.f173256e
            androidx.lifecycle.i0 r10 = r10.business(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154345o
            r2.append(r10)
            java.lang.String r10 = "::"
            r2.append(r10)
            fh1.c1 r10 = r7.f173256e
            androidx.lifecycle.i0 r10 = r10.business(r0)
            cl1.o r10 = (cl1.C54991o) r10
            long r10 = r10.f154325i1
            r2.append(r10)
            r2.append(r3)
            r2.append(r14)
            r2.append(r3)
            fh1.c1 r10 = r7.f173256e
            androidx.lifecycle.i0 r0 = r10.business(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154318g2
            r2.append(r0)
            r2.append(r3)
            java.lang.String r15 = r2.toString()
            cj1.r0 r2 = cj1.C54804r0.f153631a
            android.content.Context r3 = r1.getContext()
            java.lang.String r0 = "it.context"
            gy3.C87412m.m108593f(r3, r0)
            fj1.b r13 = r1.getBuContext()
            np1.v r10 = np1.C61881v.f175961a
            android.content.Context r11 = r1.getContext()
            gy3.C87412m.m108593f(r11, r0)
            te3.l40 r12 = new te3.l40
            r12.<init>()
            byte[] r0 = r8.mo123703f()
            r12.parseFrom(r0)     // Catch:{ Exception -> 0x023c }
            goto L_0x0245
        L_0x023c:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r6, r0)
        L_0x0245:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r0 = 1177(0x499, float:1.65E-42)
            java.lang.String r4 = "locClickId"
            gy3.C87412m.m108593f(r14, r4)
            fj1.b r16 = r1.getBuContext()
            r4 = r13
            r13 = r0
            di0.o r0 = r10.mo86811c(r11, r12, r13, r14, r15, r16)
            r2.mo75767i(r3, r4, r0, r1)
            goto L_0x02cb
        L_0x025d:
            if (r3 == 0) goto L_0x0265
            te3.qx2 r2 = r3.f184751i
            if (r2 == 0) goto L_0x0265
            java.lang.String r1 = r2.f185084d
        L_0x0265:
            jh1.j r11 = jh1.C9406j.f29357a
            if (r3 == 0) goto L_0x0270
            java.lang.String r2 = r3.f184746d
            if (r2 != 0) goto L_0x026e
            goto L_0x0270
        L_0x026e:
            r12 = r2
            goto L_0x0271
        L_0x0270:
            r12 = r6
        L_0x0271:
            r13 = 12
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 28
            r18 = 0
            jh1.C9406j.m9112f(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0286
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0287
        L_0x0286:
            r4 = 1
        L_0x0287:
            if (r4 == 0) goto L_0x0291
            java.lang.String r0 = r7.f173257f
            java.lang.String r1 = "claim prize,but red packet uri is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x02cb
        L_0x0291:
            java.lang.Class<tf0.p1> r2 = tf0.C64916p1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r11 = r2
            tf0.p1 r11 = (tf0.C64916p1) r11
            android.content.Context r12 = r20.getContext()
            java.lang.String r0 = "v.context"
            gy3.C87412m.m108593f(r12, r0)
            te3.xq2 r13 = new te3.xq2
            r13.<init>()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r0.<init>()
            com.tencent.mm.protocal.protobuf.Html5Info r2 = new com.tencent.mm.protocal.protobuf.Html5Info
            r2.<init>()
            r2.url = r1
            r0.html5_info = r2
            r0.jumpinfo_type = r10
            r13.f186379e = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r14 = 0
            r15 = 0
            r16 = 8
            r17 = 0
            tf0.C64916p1.C64917a.m76439f(r11, r12, r13, r14, r15, r16, r17)
        L_0x02cb:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r7, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60826c.onClick(android.view.View):void");
    }
}
