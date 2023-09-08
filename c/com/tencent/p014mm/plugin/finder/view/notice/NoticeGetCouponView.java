package com.tencent.p014mm.plugin.finder.view.notice;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/NoticeGetCouponView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeGetCouponView */
public final class NoticeGetCouponView extends RelativeLayout {

    /* renamed from: d */
    public final TextView f18305d;

    /* renamed from: e */
    public final TextView f18306e;

    /* renamed from: f */
    public final TextView f18307f;

    /* renamed from: g */
    public final LinearLayout f18308g;

    /* renamed from: h */
    public final WeImageView f18309h;

    /* renamed from: i */
    public final TextView f18310i;

    static {
        new SimpleDateFormat(C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.mbg), Locale.ENGLISH);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeGetCouponView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(context, C0966R.C0971layout.cvb, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.n2b);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.money_text)");
        TextView textView = (TextView) findViewById;
        this.f18305d = textView;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.myd);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.coupon_title)");
        this.f18306e = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.my_);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.coupon_date)");
        this.f18307f = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.myb);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…coupon_get_ticket_layout)");
        this.f18308g = (LinearLayout) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.mya);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.id.coupon_get_ticket_icon)");
        this.f18309h = (WeImageView) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.myc);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.id.coupon_get_ticket_text)");
        this.f18310i = (TextView) findViewById6;
        C58739j4.f168176a.mo83703c0(textView, true);
    }

    /* renamed from: b */
    public static final void m4340b(NoticeGetCouponView noticeGetCouponView, TextView textView, int i, int i2) {
        CharSequence text = textView.getText();
        Paint paint = new Paint();
        paint.setTypeface(textView.getTypeface());
        paint.setTextSize((float) i2);
        while (paint.measureText(text.toString()) > ((float) i)) {
            paint.setTextSize(paint.getTextSize() - ((float) C76577a.m92150a(noticeGetCouponView.getContext(), 0.5f)));
        }
        textView.setTextSize(0, paint.getTextSize());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5015a(te3.C51559uk1 r9, fy3.C32224a<rx3.C13598b0> r10) {
        /*
            r8 = this;
            r0 = 8
            java.lang.String r1 = "NoticeGetCouponView"
            if (r9 != 0) goto L_0x000f
            java.lang.String r9 = "#render couponInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            r8.setVisibility(r0)
            return
        L_0x000f:
            int r2 = r9.f142896g
            r3 = 1
            if (r2 == r3) goto L_0x001d
            java.lang.String r9 = "#render couponInfo.coupon_status != 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            r8.setVisibility(r0)
            return
        L_0x001d:
            r0 = 0
            r8.setVisibility(r0)
            sk1.v r2 = new sk1.v
            r2.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r4 = "#renderInner couponId="
            r9.append(r4)
            java.lang.String r4 = r2.f38762t
            r9.append(r4)
            java.lang.String r4 = " stockId="
            r9.append(r4)
            java.lang.String r4 = r2.f38763u
            r9.append(r4)
            java.lang.String r4 = " current_count="
            r9.append(r4)
            te3.uk1 r4 = r2.f38761s
            te3.f1 r4 = r4.f142912z
            r5 = 0
            if (r4 == 0) goto L_0x0052
            int r4 = r4.f133223d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0053
        L_0x0052:
            r4 = r5
        L_0x0053:
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            te3.uk1 r9 = r2.f38761s
            te3.f1 r9 = r9.f142912z
            if (r9 == 0) goto L_0x006b
            boolean r9 = er1.C7776a.m7931a(r9)
            if (r9 != r3) goto L_0x006b
            r9 = 1
            goto L_0x006c
        L_0x006b:
            r9 = 0
        L_0x006c:
            if (r9 == 0) goto L_0x00a1
            android.widget.LinearLayout r9 = r8.f18308g
            r9.setBackground(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = r8.f18309h
            r9.setVisibility(r0)
            android.widget.TextView r9 = r8.f18310i
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r1 = 2131826420(0x7f1116f4, float:1.9285724E38)
            java.lang.String r10 = r10.getString(r1)
            r9.setText(r10)
            android.widget.TextView r9 = r8.f18310i
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            int r10 = r10.getColor(r1)
            r9.setTextColor(r10)
            goto L_0x00ab
        L_0x00a1:
            android.widget.LinearLayout r9 = r8.f18308g
            hs1.g r1 = new hs1.g
            r1.<init>(r10, r8)
            r9.setOnClickListener(r1)
        L_0x00ab:
            te3.uk1 r9 = r2.f38761s
            long r4 = r9.f142903q
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00ba
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x00ba:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            java.lang.String r9 = r9.f142911y
            if (r9 == 0) goto L_0x00cf
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x00ca
            r9 = 1
            goto L_0x00cb
        L_0x00ca:
            r9 = 0
        L_0x00cb:
            if (r9 != r3) goto L_0x00cf
            r9 = 1
            goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            if (r9 == 0) goto L_0x00dc
            android.widget.TextView r9 = r8.f18307f
            te3.uk1 r10 = r2.f38761s
            java.lang.String r10 = r10.f142911y
            r9.setText(r10)
            goto L_0x00ec
        L_0x00dc:
            android.widget.TextView r9 = r8.f18307f
            java.text.SimpleDateFormat r10 = sk1.C13696v.f38753H
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            java.lang.String r10 = r10.format(r1)
            r9.setText(r10)
        L_0x00ec:
            int r9 = r2.f38764v
            java.lang.String r10 = "format(format, *args)"
            java.lang.String r1 = "getString(\n             …                        )"
            if (r9 == r3) goto L_0x0159
            r4 = 2
            if (r9 == r4) goto L_0x010e
            r4 = 3
            if (r9 == r4) goto L_0x0159
            r4 = 4
            if (r9 == r4) goto L_0x0159
            r10 = 5
            if (r9 == r10) goto L_0x0102
            goto L_0x0182
        L_0x0102:
            android.widget.TextView r9 = r8.f18305d
            java.lang.String r10 = r2.f38765w
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r9.setText(r10)
            goto L_0x0182
        L_0x010e:
            android.content.Context r9 = r8.getContext()
            r4 = 2131828791(0x7f112037, float:1.9290533E38)
            java.lang.String r9 = kg3.C76577a.m92166q(r9, r4)
            gy3.C87412m.m108593f(r9, r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = r2.f38765w
            r1[r0] = r4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r9 = java.lang.String.format(r9, r1)
            gy3.C87412m.m108593f(r9, r10)
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r9)
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            android.content.Context r3 = r8.getContext()
            r4 = 2131165645(0x7f0701cd, float:1.7945513E38)
            int r3 = kg3.C76577a.m92155f(r3, r4)
            r1.<init>(r3)
            java.lang.String r3 = r2.f38765w
            if (r3 == 0) goto L_0x014a
            int r0 = r3.length()
        L_0x014a:
            int r9 = r9.length()
            r3 = 18
            r10.setSpan(r1, r0, r9, r3)
            android.widget.TextView r9 = r8.f18305d
            r9.setText(r10)
            goto L_0x0182
        L_0x0159:
            android.content.Context r9 = r8.getContext()
            r4 = 2131828795(0x7f11203b, float:1.929054E38)
            java.lang.String r9 = kg3.C76577a.m92166q(r9, r4)
            gy3.C87412m.m108593f(r9, r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = r2.f38765w
            r1[r0] = r4
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r9 = java.lang.String.format(r9, r0)
            gy3.C87412m.m108593f(r9, r10)
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r9)
            android.widget.TextView r9 = r8.f18305d
            r9.setText(r10)
        L_0x0182:
            android.widget.TextView r9 = r8.f18306e
            java.lang.String r10 = r2.f38766x
            r9.setText(r10)
            android.widget.TextView r9 = r8.f18305d
            android.content.Context r10 = r8.getContext()
            r0 = 2131166499(0x7f070523, float:1.7947245E38)
            int r10 = kg3.C76577a.m92155f(r10, r0)
            android.content.Context r1 = r8.getContext()
            r2 = 1104150528(0x41d00000, float:26.0)
            int r1 = kg3.C76577a.m92150a(r1, r2)
            m4340b(r8, r9, r10, r1)
            android.widget.TextView r9 = r8.f18306e
            android.content.Context r10 = r8.getContext()
            int r10 = kg3.C76577a.m92155f(r10, r0)
            android.content.Context r0 = r8.getContext()
            r1 = 12
            int r0 = kg3.C76577a.m92151b(r0, r1)
            m4340b(r8, r9, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView.mo5015a(te3.uk1, fy3.a):void");
    }
}
