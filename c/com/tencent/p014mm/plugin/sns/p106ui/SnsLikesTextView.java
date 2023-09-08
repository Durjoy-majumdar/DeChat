package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75360c0;
import di3.C86312j;
import f40.C86709a0;
import go3.C76003c;
import ip3.C98780b;
import java.util.HashMap;
import kg3.C76577a;
import op3.C117882j;
import p629ny.C76979h;
import p773yy.C79168k;
import qy2.C63347a;
import rq2.C63489a;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLikesTextView */
public class SnsLikesTextView extends RelativeLayout implements SnsTimeLineBaseAdapter.C95632i {

    /* renamed from: y */
    public static final /* synthetic */ int f278248y = 0;

    /* renamed from: d */
    public String f278249d;

    /* renamed from: e */
    public boolean f278250e;

    /* renamed from: f */
    public TextView f278251f;

    /* renamed from: g */
    public ImageView f278252g;

    /* renamed from: h */
    public LinearLayout f278253h;

    /* renamed from: i */
    public MaskTextView f278254i;

    /* renamed from: j */
    public SpannableStringBuilder f278255j;

    /* renamed from: n */
    public int f278256n;

    /* renamed from: o */
    public boolean f278257o;

    /* renamed from: p */
    public int f278258p;

    /* renamed from: q */
    public C96174r f278259q;

    /* renamed from: r */
    public PBool f278260r;

    /* renamed from: s */
    public HashMap<String, Integer> f278261s;

    /* renamed from: t */
    public BaseTimeLineItem.BaseViewHolder f278262t;

    /* renamed from: u */
    public C96275w6 f278263u;

    /* renamed from: v */
    public Drawable f278264v;

    /* renamed from: w */
    public String f278265w;

    /* renamed from: x */
    public Runnable f278266x;

    public SnsLikesTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo132826a(boolean z) {
        HashMap<String, Integer> hashMap;
        SnsMethodCalculate.markStartTimeMs("onLiked", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        if (this.f278256n > 0 && (hashMap = this.f278261s) != null) {
            Integer num = hashMap.get(this.f278249d);
            if (num == null) {
                this.f278261s.put(this.f278249d, 0);
            } else if (z) {
                if (num.intValue() == 1) {
                    this.f278261s.put(this.f278249d, 3);
                    mo132827b();
                }
            } else if (num.intValue() == 3) {
                this.f278261s.put(this.f278249d, 1);
                mo132827b();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLiked", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* renamed from: b */
    public void mo132827b() {
        BaseTimeLineItem.BaseViewHolder baseViewHolder;
        SnsMethodCalculate.markStartTimeMs("checkShrinkMode", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        Integer num = this.f278261s.get(this.f278249d);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                int lineCount = this.f278254i.getLayout().getLineCount();
                this.f278253h.setVisibility(8);
                if (lineCount > this.f278256n && (baseViewHolder = this.f278262t) != null) {
                    SnsReportHelper.f275506m0.mo131362W(baseViewHolder.f279960i, this.f278263u, this.f278255j.toString(), this.f278255j.toString(), lineCount, lineCount, false, this.f278262t.f279948c, this.f278256n);
                }
            } else if (intValue == 1) {
                int lineCount2 = this.f278254i.getLayout().getLineCount();
                int max = Math.max(Math.min(this.f278256n, lineCount2), 0);
                CharSequence subSequence = this.f278255j.subSequence(0, this.f278254i.getLayout().getLineVisibleEnd(max - 1));
                int lastIndexOf = subSequence.toString().lastIndexOf(",");
                SpannableStringBuilder spannableStringBuilder = (lastIndexOf <= 0 || lastIndexOf >= subSequence.length()) ? new SpannableStringBuilder(subSequence) : new SpannableStringBuilder(subSequence.subSequence(0, lastIndexOf));
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                spannableStringBuilder.append(",...");
                this.f278254i.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                this.f278253h.setVisibility(0);
                this.f278251f.setText(getContext().getString(C0966R.string.je_));
                this.f278252g.setRotation(90.0f);
                this.f278252g.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_arrow, getContext().getResources().getColor(C0966R.color.a1d)));
                BaseTimeLineItem.BaseViewHolder baseViewHolder2 = this.f278262t;
                if (baseViewHolder2 != null) {
                    SnsReportHelper.f275506m0.mo131362W(baseViewHolder2.f279960i, this.f278263u, spannableStringBuilder2, this.f278255j.toString(), max, lineCount2, true, this.f278262t.f279948c, this.f278256n);
                }
            } else if (intValue == 2) {
                int lineCount3 = this.f278254i.getLayout().getLineCount();
                this.f278254i.setText(this.f278255j, TextView.BufferType.SPANNABLE);
                this.f278253h.setVisibility(0);
                this.f278252g.setRotation(-90.0f);
                this.f278252g.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_arrow, getContext().getResources().getColor(C0966R.color.a1d)));
                this.f278251f.setText(getContext().getString(C0966R.string.je9));
                BaseTimeLineItem.BaseViewHolder baseViewHolder3 = this.f278262t;
                if (baseViewHolder3 != null) {
                    SnsReportHelper.f275506m0.mo131362W(baseViewHolder3.f279960i, this.f278263u, this.f278255j.toString(), this.f278255j.toString(), lineCount3, lineCount3, false, this.f278262t.f279948c, this.f278256n);
                }
            } else if (intValue == 3) {
                int lineCount4 = this.f278254i.getLayout().getLineCount();
                String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
                SpannableString yp02 = ((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null), this.f278254i.getTextSize());
                int max2 = Math.max(Math.min(this.f278256n, lineCount4), 0);
                CharSequence subSequence2 = this.f278255j.subSequence(0, this.f278254i.getLayout().getLineVisibleEnd(max2 - 1));
                int lastIndexOf2 = subSequence2.toString().lastIndexOf(",");
                SpannableStringBuilder spannableStringBuilder3 = (lastIndexOf2 <= 0 || lastIndexOf2 >= subSequence2.length()) ? new SpannableStringBuilder(subSequence2) : new SpannableStringBuilder(subSequence2.subSequence(0, lastIndexOf2));
                yp02.setSpan(new C75360c0(getContext(), str, new SnsLikesTextView$$b(this, str), this.f278258p == 10 ? 3 : 2), 0, yp02.length(), 33);
                StringBuilder sb = new StringBuilder(spannableStringBuilder3.toString());
                spannableStringBuilder3.append(",...").append(",").append(yp02);
                this.f278254i.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                this.f278253h.setVisibility(0);
                this.f278251f.setText(getContext().getString(C0966R.string.je_));
                this.f278252g.setRotation(90.0f);
                this.f278252g.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_arrow, getContext().getResources().getColor(C0966R.color.a1d)));
                BaseTimeLineItem.BaseViewHolder baseViewHolder4 = this.f278262t;
                if (baseViewHolder4 != null) {
                    SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                    View view = baseViewHolder4.f279960i;
                    C96275w6 w6Var = this.f278263u;
                    sb.append(",");
                    sb.append(yp02);
                    snsReportHelper.mo131362W(view, w6Var, sb.toString(), this.f278255j.toString(), max2, lineCount4, true, this.f278262t.f279948c, this.f278256n);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkShrinkMode", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: vr2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: vr2.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132828c(ip3.C98780b<op3.C117882j> r26, int r27, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r28, java.lang.String r29, int r30, boolean r31, com.tencent.p014mm.pointers.PBool r32, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r33, com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r34) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            r3 = r28
            r4 = r30
            r5 = r33
            java.lang.String r6 = "  "
            java.lang.String r7 = ", "
            java.lang.String r8 = "setLikedList"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.SnsLikesTextView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            r1.f278256n = r4
            r10 = r29
            r1.f278249d = r10
            r1.f278258p = r2
            com.tencent.mm.plugin.sns.ui.r r10 = r3.f278588v
            r1.f278259q = r10
            r10 = r32
            r1.f278260r = r10
            r10 = r31
            r1.f278257o = r10
            r10 = r34
            r1.f278262t = r10
            r1.f278263u = r5
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r3.f278585s
            r1.f278261s = r3
            android.text.SpannableStringBuilder r3 = r1.f278255j
            r3.clear()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            int r10 = r26.mo138165b()
            int[] r11 = new int[r10]
            int r12 = r26.mo138165b()
            int[] r12 = new int[r12]
            r13 = 1
            r15 = 0
            r16 = 1
        L_0x0050:
            int r14 = r26.mo138165b()     // Catch:{ Exception -> 0x026f }
            if (r15 >= r14) goto L_0x0114
            java.lang.Object r14 = r0.mo138164a(r15)     // Catch:{ Exception -> 0x026f }
            op3.j r14 = (op3.C117882j) r14     // Catch:{ Exception -> 0x026f }
            java.lang.Object r14 = r14.mo182596a(r13)     // Catch:{ Exception -> 0x026f }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x026f }
            java.lang.Class<ny.h> r17 = p629ny.C76979h.class
            di3.d r17 = di3.C86312j.m106911c(r17)     // Catch:{ Exception -> 0x026f }
            r13 = r17
            ny.h r13 = (p629ny.C76979h) r13     // Catch:{ Exception -> 0x026f }
            r17 = r8
            android.content.Context r8 = r25.getContext()     // Catch:{ Exception -> 0x010e }
            r18 = r9
            com.tencent.mm.plugin.sns.ui.MaskTextView r9 = r1.f278254i     // Catch:{ Exception -> 0x0269 }
            float r9 = r9.getTextSize()     // Catch:{ Exception -> 0x0269 }
            android.text.SpannableString r8 = r13.yp0(r8, r14, r9)     // Catch:{ Exception -> 0x0269 }
            java.lang.String r9 = " "
            if (r16 == 0) goto L_0x00a2
            if (r5 == 0) goto L_0x0097
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r5.f281367a     // Catch:{ Exception -> 0x0269 }
            if (r13 == 0) goto L_0x0097
            boolean r13 = r13.isSocialAttitudeAd()     // Catch:{ Exception -> 0x0269 }
            if (r13 == 0) goto L_0x0097
            android.text.SpannableStringBuilder r13 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            r13.append(r6)     // Catch:{ Exception -> 0x0269 }
            r3.append(r6)     // Catch:{ Exception -> 0x0269 }
            goto L_0x009f
        L_0x0097:
            android.text.SpannableStringBuilder r13 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            r13.append(r9)     // Catch:{ Exception -> 0x0269 }
            r3.append(r9)     // Catch:{ Exception -> 0x0269 }
        L_0x009f:
            r16 = 0
            goto L_0x00aa
        L_0x00a2:
            android.text.SpannableStringBuilder r13 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            r13.append(r7)     // Catch:{ Exception -> 0x0269 }
            r3.append(r7)     // Catch:{ Exception -> 0x0269 }
        L_0x00aa:
            android.text.SpannableStringBuilder r13 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            int r13 = r13.length()     // Catch:{ Exception -> 0x0269 }
            r11[r15] = r13     // Catch:{ Exception -> 0x0269 }
            int r19 = r14.length()     // Catch:{ Exception -> 0x0269 }
            int r13 = r13 + r19
            r12[r15] = r13     // Catch:{ Exception -> 0x0269 }
            r3.append(r14)     // Catch:{ Exception -> 0x0269 }
            android.text.SpannableStringBuilder r13 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            r13.append(r8)     // Catch:{ Exception -> 0x0269 }
            java.lang.Object r8 = r0.mo138164a(r15)     // Catch:{ Exception -> 0x0269 }
            op3.j r8 = (op3.C117882j) r8     // Catch:{ Exception -> 0x0269 }
            r13 = 0
            java.lang.Object r8 = r8.mo182596a(r13)     // Catch:{ Exception -> 0x0269 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0269 }
            java.lang.Class<yy.k> r13 = p773yy.C79168k.class
            di3.d r13 = di3.C86312j.m106911c(r13)     // Catch:{ Exception -> 0x0269 }
            yy.k r13 = (p773yy.C79168k) r13     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.ui.MaskTextView r14 = r1.f278254i     // Catch:{ Exception -> 0x0269 }
            r19 = r6
            qy2.a$c r6 = qy2.C63347a.C47892c.SNS_COMMENT     // Catch:{ Exception -> 0x0269 }
            r20 = r7
            float r7 = r14.getTextSize()     // Catch:{ Exception -> 0x0269 }
            android.text.style.ImageSpan r6 = r13.Ig0(r14, r8, r6, r7)     // Catch:{ Exception -> 0x0269 }
            if (r6 == 0) goto L_0x0101
            android.text.SpannableStringBuilder r7 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            r7.append(r9)     // Catch:{ Exception -> 0x0269 }
            android.text.SpannableStringBuilder r7 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            int r8 = r7.length()     // Catch:{ Exception -> 0x0269 }
            r9 = 1
            int r8 = r8 - r9
            android.text.SpannableStringBuilder r9 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0269 }
            r13 = 17
            r7.setSpan(r6, r8, r9, r13)     // Catch:{ Exception -> 0x0269 }
        L_0x0101:
            int r15 = r15 + 1
            r8 = r17
            r9 = r18
            r6 = r19
            r7 = r20
            r13 = 1
            goto L_0x0050
        L_0x010e:
            r0 = move-exception
            r2 = r9
            r3 = r17
            goto L_0x0272
        L_0x0114:
            r17 = r8
            r18 = r9
            android.content.Context r6 = r25.getContext()     // Catch:{ Exception -> 0x0269 }
            r7 = 10
            if (r2 != r7) goto L_0x0124
            r8 = 2131233262(0x7f0809ee, float:1.8082657E38)
            goto L_0x0127
        L_0x0124:
            r8 = 2131234284(0x7f080dec, float:1.808473E38)
        L_0x0127:
            android.content.Context r9 = r25.getContext()     // Catch:{ Exception -> 0x0269 }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ Exception -> 0x0269 }
            r13 = 2131099850(0x7f0600ca, float:1.7812065E38)
            int r9 = r9.getColor(r13)     // Catch:{ Exception -> 0x0269 }
            android.graphics.drawable.Drawable r6 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r6, r8, r9)     // Catch:{ Exception -> 0x0269 }
            int r8 = r6.getIntrinsicWidth()     // Catch:{ Exception -> 0x0269 }
            int r9 = r6.getIntrinsicHeight()     // Catch:{ Exception -> 0x0269 }
            r13 = 0
            r6.setBounds(r13, r13, r8, r9)     // Catch:{ Exception -> 0x0269 }
            r8 = 33
            r9 = 2
            r13 = 2131313888(0x7f0944e0, float:1.8246185E38)
            if (r5 == 0) goto L_0x0174
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r5.f281367a     // Catch:{ Exception -> 0x0269 }
            if (r14 == 0) goto L_0x0174
            boolean r14 = r14.isSocialAttitudeAd()     // Catch:{ Exception -> 0x0269 }
            if (r14 == 0) goto L_0x0174
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r5.f281367a     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.storage.ADXml r14 = r14.getAdXml()     // Catch:{ Exception -> 0x0269 }
            os2.k r14 = r14.adSocialInfo     // Catch:{ Exception -> 0x0269 }
            java.lang.String r14 = r14.f294141a     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.ui.MaskTextView r15 = r1.f278254i     // Catch:{ Exception -> 0x0269 }
            r15.setTag(r13, r14)     // Catch:{ Exception -> 0x0269 }
            r1.f278264v = r6     // Catch:{ Exception -> 0x0269 }
            r1.f278265w = r14     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$e r6 = new com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$e     // Catch:{ Exception -> 0x0269 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0269 }
            rq2.C63489a.m74831f(r14, r6)     // Catch:{ Exception -> 0x0269 }
            goto L_0x0197
        L_0x0174:
            com.tencent.mm.plugin.sns.ui.MaskTextView r14 = r1.f278254i     // Catch:{ Exception -> 0x0269 }
            java.lang.String r15 = ""
            r14.setTag(r13, r15)     // Catch:{ Exception -> 0x0269 }
            go3.c r13 = new go3.c     // Catch:{ Exception -> 0x0269 }
            r14 = 1
            r13.<init>(r6, r14)     // Catch:{ Exception -> 0x0269 }
            r6.getIntrinsicHeight()     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.ui.MaskTextView r6 = r1.f278254i     // Catch:{ Exception -> 0x0269 }
            r6.getTextSize()     // Catch:{ Exception -> 0x0269 }
            android.content.Context r6 = r25.getContext()     // Catch:{ Exception -> 0x0269 }
            kg3.C76577a.m92151b(r6, r9)     // Catch:{ Exception -> 0x0269 }
            android.text.SpannableStringBuilder r6 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            r14 = 1
            r15 = 0
            r6.setSpan(r13, r15, r14, r8)     // Catch:{ Exception -> 0x0269 }
        L_0x0197:
            if (r2 != r7) goto L_0x019a
            r9 = 3
        L_0x019a:
            r2 = 0
            if (r5 == 0) goto L_0x01b4
            com.tencent.mm.protocal.protobuf.SnsObject r6 = r5.f281371c     // Catch:{ Exception -> 0x0269 }
            if (r6 == 0) goto L_0x01b4
            java.util.LinkedList<te3.w64> r6 = r6.LikeUserList     // Catch:{ Exception -> 0x0269 }
            boolean r6 = rq2.C101425k.m133097a(r6)     // Catch:{ Exception -> 0x0269 }
            if (r6 != 0) goto L_0x01b4
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r5.f281371c     // Catch:{ Exception -> 0x0269 }
            java.util.LinkedList<te3.w64> r2 = r2.LikeUserList     // Catch:{ Exception -> 0x0269 }
            r6 = 0
            java.lang.Object r2 = r2.get(r6)     // Catch:{ Exception -> 0x0269 }
            te3.w64 r2 = (te3.w64) r2     // Catch:{ Exception -> 0x0269 }
        L_0x01b4:
            r6 = 0
        L_0x01b5:
            if (r6 >= r10) goto L_0x0208
            java.lang.Object r7 = r0.mo138164a(r6)     // Catch:{ Exception -> 0x0269 }
            op3.j r7 = (op3.C117882j) r7     // Catch:{ Exception -> 0x0269 }
            r13 = 0
            java.lang.Object r7 = r7.mo182596a(r13)     // Catch:{ Exception -> 0x0269 }
            r21 = r7
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ Exception -> 0x0269 }
            if (r6 != 0) goto L_0x01e8
            if (r2 == 0) goto L_0x01e8
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r5.f281367a     // Catch:{ Exception -> 0x0269 }
            boolean r7 = vr2.C102260r.m134838G(r7, r2)     // Catch:{ Exception -> 0x0269 }
            if (r7 == 0) goto L_0x01e8
            vr2.e r7 = new vr2.e     // Catch:{ Exception -> 0x0269 }
            boolean r13 = r5.f281391r     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r5.f281367a     // Catch:{ Exception -> 0x0269 }
            java.lang.String r22 = r14.getLocalid()     // Catch:{ Exception -> 0x0269 }
            r23 = 0
            r24 = 43
            r19 = r7
            r20 = r13
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0269 }
            goto L_0x01ea
        L_0x01e8:
            r7 = r21
        L_0x01ea:
            android.text.SpannableStringBuilder r13 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            de3.c0 r14 = new de3.c0     // Catch:{ Exception -> 0x0269 }
            android.content.Context r15 = r25.getContext()     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$c r8 = new com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$c     // Catch:{ Exception -> 0x0269 }
            r8.<init>(r1, r6, r2, r5)     // Catch:{ Exception -> 0x0269 }
            r14.<init>(r15, r7, r8, r9)     // Catch:{ Exception -> 0x0269 }
            r7 = r11[r6]     // Catch:{ Exception -> 0x0269 }
            r8 = r12[r6]     // Catch:{ Exception -> 0x0269 }
            r15 = 33
            r13.setSpan(r14, r7, r8, r15)     // Catch:{ Exception -> 0x0269 }
            int r6 = r6 + 1
            r8 = 33
            goto L_0x01b5
        L_0x0208:
            com.tencent.mm.plugin.sns.ui.MaskTextView r0 = r1.f278254i     // Catch:{ Exception -> 0x0269 }
            android.text.SpannableStringBuilder r2 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            android.widget.TextView$BufferType r5 = android.widget.TextView.BufferType.SPANNABLE     // Catch:{ Exception -> 0x0269 }
            r0.setText(r2, r5)     // Catch:{ Exception -> 0x0269 }
            com.tencent.mm.plugin.sns.ui.MaskTextView r0 = r1.f278254i     // Catch:{ Exception -> 0x0269 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0269 }
            r0.setOriginText(r2)     // Catch:{ Exception -> 0x0269 }
            if (r4 <= 0) goto L_0x0263
            java.lang.Object r0 = r25.getTag()     // Catch:{ Exception -> 0x0269 }
            if (r0 == 0) goto L_0x0244
            java.lang.Object r0 = r25.getTag()     // Catch:{ Exception -> 0x0269 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x0269 }
            if (r0 == 0) goto L_0x0244
            java.lang.Object r0 = r25.getTag()     // Catch:{ Exception -> 0x0269 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0269 }
            android.text.SpannableStringBuilder r2 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0269 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0269 }
            if (r0 != 0) goto L_0x023d
            goto L_0x0244
        L_0x023d:
            r2 = 1
            r1.f278250e = r2     // Catch:{ Exception -> 0x0269 }
            r25.mo132827b()     // Catch:{ Exception -> 0x0269 }
            goto L_0x0263
        L_0x0244:
            android.text.SpannableStringBuilder r0 = r1.f278255j     // Catch:{ Exception -> 0x0269 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0269 }
            r1.setTag(r0)     // Catch:{ Exception -> 0x0269 }
            android.widget.LinearLayout r0 = r1.f278253h     // Catch:{ Exception -> 0x0269 }
            r2 = 8
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x0269 }
            r2 = 0
            r1.f278250e = r2     // Catch:{ Exception -> 0x0269 }
            r25.requestLayout()     // Catch:{ Exception -> 0x0269 }
            r3 = r17
            r2 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r2 = 1
            return r2
        L_0x0263:
            r3 = r17
            r2 = r18
            r4 = 1
            goto L_0x0284
        L_0x0269:
            r0 = move-exception
            r3 = r17
            r2 = r18
            goto L_0x0272
        L_0x026f:
            r0 = move-exception
            r3 = r8
            r2 = r9
        L_0x0272:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = "MicroMsg.SnsLikesTextView"
            java.lang.String r6 = "setLikedList  e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r5)
        L_0x0284:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsLikesTextView.mo132828c(ip3.b, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter, java.lang.String, int, boolean, com.tencent.mm.pointers.PBool, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder):boolean");
    }

    /* renamed from: d */
    public boolean mo132829d(C98780b<C117882j> bVar, int i, String str, int i2, boolean z, C96275w6 w6Var) {
        boolean z2;
        String str2;
        String str3;
        SnsInfo snsInfo;
        C98780b<C117882j> bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        C96275w6 w6Var2 = w6Var;
        String str4 = "  ";
        String str5 = ", ";
        String str6 = "setLikedListLayout";
        String str7 = "com.tencent.mm.plugin.sns.ui.SnsLikesTextView";
        SnsMethodCalculate.markStartTimeMs(str6, str7);
        this.f278256n = i4;
        this.f278249d = str;
        this.f278258p = i3;
        this.f278257o = z;
        this.f278263u = w6Var2;
        this.f278255j.clear();
        StringBuffer stringBuffer = new StringBuffer();
        int b = bVar.mo138165b();
        int[] iArr = new int[b];
        int[] iArr2 = new int[bVar.mo138165b()];
        int i5 = 1;
        int i6 = 0;
        boolean z3 = true;
        while (i6 < bVar.mo138165b()) {
            try {
                String str8 = (String) bVar2.mo138164a(i6).mo182596a(i5);
                String str9 = str6;
                try {
                    String str10 = str7;
                    try {
                        SpannableString yp02 = ((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), str8, this.f278254i.getTextSize());
                        if (z3) {
                            if (w6Var2 != null) {
                                SnsInfo snsInfo2 = w6Var2.f281367a;
                                if (snsInfo2 != null && snsInfo2.isSocialAttitudeAd()) {
                                    this.f278255j.append(str4);
                                    stringBuffer.append(str4);
                                    z3 = false;
                                }
                            }
                            this.f278255j.append(" ");
                            stringBuffer.append(" ");
                            z3 = false;
                        } else {
                            this.f278255j.append(str5);
                            stringBuffer.append(str5);
                        }
                        int length = this.f278255j.length();
                        iArr[i6] = length;
                        iArr2[i6] = length + str8.length();
                        stringBuffer.append(str8);
                        this.f278255j.append(yp02);
                        C79168k kVar = (C79168k) C86312j.m106911c(C79168k.class);
                        MaskTextView maskTextView = this.f278254i;
                        String str11 = str4;
                        String str12 = str5;
                        ImageSpan Ig0 = kVar.Ig0(maskTextView, (String) bVar2.mo138164a(i6).mo182596a(0), C63347a.C47892c.SNS_COMMENT, maskTextView.getTextSize());
                        if (Ig0 != null) {
                            this.f278255j.append(" ");
                            SpannableStringBuilder spannableStringBuilder = this.f278255j;
                            spannableStringBuilder.setSpan(Ig0, spannableStringBuilder.length() - 1, this.f278255j.length(), 17);
                        }
                        i6++;
                        str6 = str9;
                        str7 = str10;
                        str4 = str11;
                        str5 = str12;
                        i5 = 1;
                    } catch (Exception e) {
                        e = e;
                        str2 = str9;
                        str3 = str10;
                        z2 = true;
                        Log.m105921e("MicroMsg.SnsLikesTextView", "setLikedList  e:%s", Util.stackTraceToString(e));
                        SnsMethodCalculate.markEndTimeMs(str2, str3);
                        return z2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str7;
                    str2 = str9;
                    z2 = true;
                    Log.m105921e("MicroMsg.SnsLikesTextView", "setLikedList  e:%s", Util.stackTraceToString(e));
                    SnsMethodCalculate.markEndTimeMs(str2, str3);
                    return z2;
                }
            } catch (Exception e3) {
                e = e3;
                str2 = str6;
                str3 = str7;
                z2 = true;
                Log.m105921e("MicroMsg.SnsLikesTextView", "setLikedList  e:%s", Util.stackTraceToString(e));
                SnsMethodCalculate.markEndTimeMs(str2, str3);
                return z2;
            }
        }
        String str13 = str6;
        String str14 = str7;
        Drawable e4 = C74933u4.m89768e(getContext(), i3 == 10 ? C0966R.C0969drawable.a8d : C0966R.C0969drawable.ako, getContext().getResources().getColor(C0966R.color.f2958ae));
        e4.setBounds(0, 0, e4.getIntrinsicWidth(), e4.getIntrinsicHeight());
        int i7 = 2;
        if (w6Var2 == null || (snsInfo = w6Var2.f281367a) == null || !snsInfo.isSocialAttitudeAd()) {
            this.f278254i.setTag(C0966R.C0970id.lww, "");
            C76003c cVar = new C76003c(e4, 1);
            e4.getIntrinsicHeight();
            this.f278254i.getTextSize();
            C76577a.m92151b(getContext(), 2);
            this.f278255j.setSpan(cVar, 0, 1, 33);
        } else {
            String str15 = w6Var2.f281367a.getAdXml().adSocialInfo.f294141a;
            this.f278254i.setTag(C0966R.C0970id.lww, str15);
            this.f278264v = e4;
            this.f278265w = str15;
            C63489a.m74831f(str15, new SnsLikesTextView$$e(this));
        }
        if (i3 == 10) {
            i7 = 3;
        }
        for (int i8 = 0; i8 < b; i8++) {
            this.f278255j.setSpan(new C75360c0(getContext(), (String) bVar2.mo138164a(i8).mo182596a(0), new SnsLikesTextView$$a(this), i7), iArr[i8], iArr2[i8], 33);
        }
        this.f278254i.setText(this.f278255j, TextView.BufferType.SPANNABLE);
        this.f278254i.setOriginText(stringBuffer.toString());
        if (i4 > 0) {
            if (getTag() != null && (getTag() instanceof String)) {
                if (Util.isEqual((String) getTag(), this.f278255j.toString())) {
                    this.f278250e = true;
                    mo132827b();
                }
            }
            setTag(this.f278255j.toString());
            this.f278253h.setVisibility(8);
            this.f278250e = false;
            requestLayout();
            SnsMethodCalculate.markEndTimeMs(str13, str14);
            return true;
        }
        str2 = str13;
        str3 = str14;
        z2 = true;
        SnsMethodCalculate.markEndTimeMs(str2, str3);
        return z2;
    }

    public String getKey() {
        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        String str = this.f278249d;
        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        return str;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        HashMap<String, Integer> hashMap;
        PBool pBool;
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        super.onLayout(z, i, i2, i3, i4);
        int lineCount = this.f278254i.getLineCount();
        int i5 = this.f278256n;
        if (i5 > 0 && lineCount > i5 && (pBool = this.f278260r) != null) {
            pBool.value = true;
        }
        if (i5 > 0 && (hashMap = this.f278261s) != null) {
            if (this.f278250e) {
                SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                return;
            }
            this.f278250e = true;
            if (hashMap.get(this.f278249d) == null) {
                if (!this.f278257o) {
                    this.f278261s.put(this.f278249d, 0);
                } else if (lineCount <= this.f278256n) {
                    this.f278261s.put(this.f278249d, 0);
                } else {
                    this.f278261s.put(this.f278249d, 1);
                }
            }
            post(this.f278266x);
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setClickableCallBack(C96174r rVar) {
        SnsMethodCalculate.markStartTimeMs("setClickableCallBack", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        this.f278259q = rVar;
        SnsMethodCalculate.markEndTimeMs("setClickableCallBack", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setCollapseibleLikeMap(HashMap<String, Integer> hashMap) {
        SnsMethodCalculate.markStartTimeMs("setCollapseibleLikeMap", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        this.f278261s = hashMap;
        SnsMethodCalculate.markEndTimeMs("setCollapseibleLikeMap", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setLikeTvTag(Object obj) {
        SnsMethodCalculate.markStartTimeMs("setLikeTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        MaskTextView maskTextView = this.f278254i;
        if (maskTextView != null) {
            maskTextView.setTag(obj);
        }
        SnsMethodCalculate.markEndTimeMs("setLikeTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setLikedTextTouchListener(View.OnTouchListener onTouchListener) {
        SnsMethodCalculate.markStartTimeMs("setLikedTextTouchListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        MaskTextView maskTextView = this.f278254i;
        if (maskTextView != null) {
            maskTextView.setOnTouchListener(onTouchListener);
        }
        SnsMethodCalculate.markEndTimeMs("setLikedTextTouchListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setOpClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        LinearLayout linearLayout = this.f278253h;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
        SnsMethodCalculate.markEndTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setOpTvTag(Object obj) {
        SnsMethodCalculate.markStartTimeMs("setOpTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        LinearLayout linearLayout = this.f278253h;
        if (linearLayout != null) {
            linearLayout.setTag(obj);
        }
        SnsMethodCalculate.markEndTimeMs("setOpTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public SnsLikesTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f278249d = null;
        this.f278250e = true;
        this.f278251f = null;
        this.f278252g = null;
        this.f278253h = null;
        this.f278254i = null;
        this.f278255j = new SpannableStringBuilder(" ");
        this.f278256n = 0;
        this.f278257o = false;
        this.f278258p = 0;
        this.f278259q = null;
        this.f278260r = null;
        this.f278261s = null;
        this.f278262t = null;
        this.f278263u = null;
        this.f278266x = new SnsLikesTextView$$d(this);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        View.inflate(getContext(), C0966R.C0971layout.c3f, this);
        this.f278251f = (TextView) findViewById(C0966R.C0970id.ju6);
        this.f278252g = (ImageView) findViewById(C0966R.C0970id.ju4);
        this.f278253h = (LinearLayout) findViewById(C0966R.C0970id.ju5);
        this.f278254i = (MaskTextView) findViewById(C0966R.C0970id.ju7);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }
}
