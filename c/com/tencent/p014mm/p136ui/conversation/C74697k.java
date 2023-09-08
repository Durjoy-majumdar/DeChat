package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.Time;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.pluginsdk.platformtools.C72714e;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import i61.C98602h;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import p629ny.C76979h;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.conversation.k */
public class C74697k extends C6975i1<C72976h2> {

    /* renamed from: G */
    public static long f219600G = 2000;

    /* renamed from: A */
    public final C74702e f219601A = new C74702e(this);

    /* renamed from: B */
    public final int f219602B;

    /* renamed from: C */
    public final int f219603C;

    /* renamed from: D */
    public C74700c f219604D;

    /* renamed from: E */
    public boolean f219605E = false;

    /* renamed from: F */
    public MTimerHandler f219606F = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C74699b(), false);

    /* renamed from: o */
    public ColorStateList[] f219607o = new ColorStateList[5];

    /* renamed from: p */
    public HashMap<String, C74701d> f219608p;

    /* renamed from: q */
    public boolean f219609q = true;

    /* renamed from: r */
    public MMSlideDelView.C73186f f219610r = MMSlideDelView.getItemStatusCallBack();

    /* renamed from: s */
    public float f219611s = -1.0f;

    /* renamed from: t */
    public float f219612t = -1.0f;

    /* renamed from: u */
    public float f219613u = -1.0f;

    /* renamed from: v */
    public boolean f219614v = false;

    /* renamed from: w */
    public boolean f219615w = false;

    /* renamed from: x */
    public boolean f219616x = false;

    /* renamed from: y */
    public NoMeasuredTextView.C73213c f219617y = new C74698a();

    /* renamed from: z */
    public String f219618z = "";

    /* renamed from: com.tencent.mm.ui.conversation.k$a */
    public class C74698a implements NoMeasuredTextView.C73213c {
        public C74698a() {
        }

        /* renamed from: a */
        public CharSequence mo101876a(NoMeasuredTextView noMeasuredTextView, CharSequence charSequence, String str, int i, int i2) {
            CharSequence charSequence2;
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence;
            String str2 = str;
            float textSize = noMeasuredTextView.getPaint().getTextSize();
            int b = C76577a.m92151b(C74697k.this.f24696e, i2);
            float f = (float) b;
            noMeasuredTextView.getPaint().setTextSize(f);
            TextPaint paint = noMeasuredTextView.getPaint();
            float measureText = paint.measureText(" " + str2);
            noMeasuredTextView.getPaint().setTextSize(textSize);
            int measuredWidth = (noMeasuredTextView.getMeasuredWidth() - noMeasuredTextView.getCompoundPaddingRight()) - noMeasuredTextView.getCompoundPaddingLeft();
            double d = (double) measuredWidth;
            if (((double) measureText) >= 0.6d * d) {
                charSequence3 = TextUtils.ellipsize(charSequence4, noMeasuredTextView.getPaint(), (float) (d * 0.4d), TextUtils.TruncateAt.END);
                float measureText2 = noMeasuredTextView.getPaint().measureText(charSequence3.toString());
                noMeasuredTextView.getPaint().setTextSize(f);
                CharSequence ellipsize = TextUtils.ellipsize(str2, noMeasuredTextView.getPaint(), (((float) measuredWidth) - measureText2) - 20.0f, TextUtils.TruncateAt.END);
                noMeasuredTextView.getPaint().setTextSize(textSize);
                charSequence2 = ellipsize;
            } else {
                charSequence3 = TextUtils.ellipsize(charSequence4, noMeasuredTextView.getPaint(), ((float) measuredWidth) - measureText, TextUtils.TruncateAt.END);
                charSequence2 = str2;
            }
            Context context = C74697k.this.f24696e;
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, charSequence3 + " " + charSequence2);
            ColorStateList e = C76577a.m92154e(C74697k.this.f24696e, i);
            T1.setSpan(new TextAppearanceSpan((String) null, 0, b, e, e), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
            return T1;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.k$b */
    public class C74699b implements MTimerHandler.CallBack {
        public C74699b() {
        }

        public boolean onTimerExpired() {
            C74697k kVar = C74697k.this;
            if (!kVar.f219605E) {
                return false;
            }
            MMHandlerThread.postToMainThread(new C74706l(kVar));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.k$c */
    public class C74700c {

        /* renamed from: a */
        public String f219621a;

        /* renamed from: b */
        public int f219622b;

        /* renamed from: c */
        public String f219623c;

        /* renamed from: d */
        public String f219624d;

        public C74700c(C74697k kVar, C74698a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.k$d */
    public class C74701d {

        /* renamed from: a */
        public CharSequence f219625a;

        /* renamed from: b */
        public CharSequence f219626b;

        /* renamed from: c */
        public CharSequence f219627c;

        /* renamed from: d */
        public int f219628d;

        /* renamed from: e */
        public int f219629e;

        /* renamed from: f */
        public int f219630f;

        /* renamed from: g */
        public int f219631g;

        /* renamed from: h */
        public boolean f219632h;

        /* renamed from: i */
        public boolean f219633i;

        /* renamed from: j */
        public boolean f219634j;

        /* renamed from: k */
        public boolean f219635k;

        /* renamed from: l */
        public boolean f219636l;

        /* renamed from: m */
        public boolean f219637m;

        /* renamed from: n */
        public boolean f219638n;

        /* renamed from: o */
        public boolean f219639o;

        public C74701d(C74697k kVar, C74698a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.k$e */
    public class C74702e {

        /* renamed from: a */
        public C72996z1 f219640a = null;

        /* renamed from: b */
        public String f219641b = null;

        /* renamed from: c */
        public boolean f219642c = false;

        public C74702e(C74697k kVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.k$f */
    public static class C74703f {

        /* renamed from: a */
        public LinearLayout f219643a;

        /* renamed from: b */
        public ImageView f219644b;

        /* renamed from: c */
        public NoMeasuredTextView f219645c;

        /* renamed from: d */
        public NoMeasuredTextView f219646d;

        /* renamed from: e */
        public NoMeasuredTextView f219647e;

        /* renamed from: f */
        public NoMeasuredTextView f219648f;

        /* renamed from: g */
        public TextView f219649g;

        /* renamed from: h */
        public ImageView f219650h;

        /* renamed from: i */
        public ImageView f219651i;

        /* renamed from: j */
        public ImageView f219652j;

        /* renamed from: k */
        public ImageView f219653k;

        /* renamed from: l */
        public View f219654l;
    }

    public C74697k(Context context, C6975i1.C6977b bVar) {
        super(context, new C72976h2());
        this.f24699h = bVar;
        this.f219607o[0] = C76577a.m92154e(context, C0966R.color.f3563xt);
        this.f219607o[1] = C76577a.m92154e(context, C0966R.color.a_3);
        this.f219607o[3] = C76577a.m92154e(context, C0966R.color.a7f);
        this.f219607o[2] = C76577a.m92154e(context, C0966R.color.a4t);
        this.f219607o[2] = C76577a.m92154e(context, C0966R.color.a4t);
        this.f219607o[4] = C76577a.m92154e(context, C0966R.color.a1_);
        this.f219608p = new HashMap<>();
        if (C76577a.m92148D(context)) {
            this.f219603C = context.getResources().getDimensionPixelSize(C0966R.dimen.f3673b3);
            this.f219602B = context.getResources().getDimensionPixelSize(C0966R.dimen.f3674b4);
        } else if (C76577a.m92147C(context)) {
            this.f219603C = context.getResources().getDimensionPixelSize(C0966R.dimen.f3672b2);
            this.f219602B = context.getResources().getDimensionPixelSize(C0966R.dimen.f3674b4);
        } else {
            this.f219603C = context.getResources().getDimensionPixelSize(C0966R.dimen.f3671b1);
            this.f219602B = context.getResources().getDimensionPixelSize(C0966R.dimen.f3675b5);
        }
        this.f219611s = (float) C76577a.m92157h(context, C0966R.dimen.f3927j7);
        this.f219612t = (float) C76577a.m92157h(context, C0966R.dimen.f3881hq);
        this.f219613u = (float) C76577a.m92157h(context, C0966R.dimen.f3964lm);
    }

    /* renamed from: A */
    public final String mo103856A(C72976h2 h2Var) {
        Class cls = C75339i.class;
        return (h2Var.mo108832y2() != 0 || !C72996z1.m85820U5(h2Var.getUsername())) ? ((C75339i) C86312j.m106911c(cls)).getDisplayName(h2Var.mo108823q2()) : ((C75339i) C86312j.m106911c(cls)).mo62519pb(h2Var.mo108823q2(), h2Var.getUsername());
    }

    /* renamed from: B */
    public int mo103857B(String str) {
        if (str == null || str.length() <= 0) {
            return 1;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0344  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo103858C(com.tencent.p014mm.storage.C72976h2 r19, int r20, com.tencent.p014mm.p136ui.conversation.C74697k.C74702e r21, boolean r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r7 = r20
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            int r0 = r19.mo108783D2()
            r5 = 2131834477(0x7f11366d, float:1.9302065E38)
            java.lang.String r6 = "MicroMsg.ConversationAdapter"
            r8 = 2
            r9 = 33
            r10 = 2131101361(0x7f0606b1, float:1.781513E38)
            r11 = 0
            r12 = 1
            if (r0 != r12) goto L_0x005c
            android.content.Context r0 = r1.f24696e
            java.lang.String r0 = r0.getString(r5)
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            android.content.Context r14 = r1.f24696e
            android.content.res.Resources r14 = r14.getResources()
            int r14 = r14.getColor(r10)
            r0.<init>(r14)
            int r14 = r13.length()
            r13.setSpan(r0, r11, r14, r9)
            r4.append(r13)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r13 = r19.getUsername()
            r0[r11] = r13
            int r13 = r19.mo108819m2()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r12] = r13
            java.lang.String r13 = "mark remittance flag conversation: %s, flag: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r0)
            goto L_0x0096
        L_0x005c:
            int r0 = r19.mo108831x2()
            if (r0 != r12) goto L_0x0096
            android.content.Context r0 = r1.f24696e
            r13 = 2131821992(0x7f1105a8, float:1.9276743E38)
            java.lang.String r0 = r0.getString(r13)
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            android.content.Context r14 = r1.f24696e
            android.content.res.Resources r14 = r14.getResources()
            int r14 = r14.getColor(r10)
            r0.<init>(r14)
            int r14 = r13.length()
            r13.setSpan(r0, r11, r14, r9)
            r4.append(r13)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r13 = r19.getUsername()
            r0[r11] = r13
            java.lang.String r13 = "mark hb flag conversation: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r0)
        L_0x0096:
            java.lang.String r0 = r19.mo108824r2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r13 = " "
            if (r0 == 0) goto L_0x00ac
            long r14 = r19.mo108825s2()
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
        L_0x00ac:
            int r0 = r19.mo108818l2()
            if (r0 <= 0) goto L_0x00be
            int r0 = r19.mo108786G2()
            if (r0 > 0) goto L_0x010e
            int r0 = r19.mo108788I2()
            if (r0 > 0) goto L_0x010e
        L_0x00be:
            int r0 = r19.mo108829v2()
            if (r0 != 0) goto L_0x010e
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            android.content.Context r5 = r1.f24696e
            r6 = 2131832641(0x7f112f41, float:1.9298342E38)
            java.lang.String r5 = r5.getString(r6)
            r0.<init>(r5)
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            android.content.Context r6 = r1.f24696e
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r10)
            r5.<init>(r6)
            int r6 = r0.length()
            r0.setSpan(r5, r11, r6, r9)
            java.lang.String r5 = r19.mo108824r2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0109
            android.text.SpannableStringBuilder r5 = r0.append(r13)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r6 = r1.f24696e
            java.lang.String r2 = r19.mo108824r2()
            android.text.SpannableString r2 = r3.op0(r6, r2, r7)
            r5.append(r2)
        L_0x0109:
            android.text.SpannableStringBuilder r0 = r4.append(r0)
            return r0
        L_0x010e:
            java.lang.String r0 = r19.mo108781B2()
            int r0 = r1.mo103857B(r0)
            r14 = 10000(0x2710, float:1.4013E-41)
            if (r0 != r14) goto L_0x01ab
            boolean r0 = eb0.C45628s0.m50753R(r19)
            if (r0 != 0) goto L_0x01ab
            int r0 = r19.mo108830w2()
            if (r0 == r12) goto L_0x01ab
            int r0 = r19.mo108829v2()
            if (r0 != 0) goto L_0x01ab
            java.lang.String r0 = r19.getContent()
            java.lang.String r5 = "weixin://wxpay/transfer/remindrcvmsg"
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "is transfer remind msg "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.text.SpannableStringBuilder r0 = r4.append(r13)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r4 = r1.f24696e
            java.lang.String r2 = r19.getContent()
            android.text.SpannableString r2 = r3.mo107080qH(r4, r2, r7)
            android.text.SpannableStringBuilder r0 = r0.append(r2)
            return r0
        L_0x0157:
            int r0 = r19.mo108831x2()
            if (r0 != r12) goto L_0x0176
            android.text.SpannableStringBuilder r0 = r4.append(r13)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r4 = r1.f24696e
            java.lang.String r2 = r19.getContent()
            android.text.SpannableString r2 = r3.mo107080qH(r4, r2, r7)
            android.text.SpannableStringBuilder r0 = r0.append(r2)
            return r0
        L_0x0176:
            int r0 = r19.mo108783D2()
            if (r0 != r12) goto L_0x0195
            android.text.SpannableStringBuilder r0 = r4.append(r13)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r4 = r1.f24696e
            java.lang.String r2 = r19.getContent()
            android.text.SpannableString r2 = r3.mo107080qH(r4, r2, r7)
            android.text.SpannableStringBuilder r0 = r0.append(r2)
            return r0
        L_0x0195:
            android.text.SpannableString r0 = new android.text.SpannableString
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r4 = r1.f24696e
            java.lang.String r2 = r19.getContent()
            android.text.SpannableString r2 = r3.mo107080qH(r4, r2, r7)
            r0.<init>(r2)
            return r0
        L_0x01ab:
            java.lang.String r0 = r19.mo108781B2()
            int r0 = r1.mo103857B(r0)
            r14 = 49
            java.lang.String r15 = ": "
            r8 = 0
            java.lang.String r5 = ""
            if (r0 != r14) goto L_0x02a7
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            java.lang.String r9 = r19.mo108823q2()
            java.lang.String r0 = r0.getDisplayName(r9)
            java.lang.String r9 = r19.getContent()
            com.tencent.mm.message.l$b r9 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r9, r8)
            if (r9 == 0) goto L_0x02a7
            int r10 = r9.f195582i
            r8 = 5
            if (r10 == r8) goto L_0x025f
            r8 = 19
            r9 = 2131821659(0x7f11045b, float:1.9276067E38)
            if (r10 == r8) goto L_0x022a
            r14 = 40
            if (r10 == r14) goto L_0x01e8
            goto L_0x02a7
        L_0x01e8:
            java.lang.String r10 = r19.getContent()
            com.tencent.mm.message.o r10 = com.tencent.p014mm.message.C68075o.m80440a(r10)
            int r10 = r10.f195664b
            if (r10 != r8) goto L_0x02a7
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r8 == 0) goto L_0x0201
            android.content.Context r0 = r1.f24696e
            java.lang.String r0 = r0.getString(r9)
            goto L_0x0219
        L_0x0201:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r15)
            android.content.Context r0 = r1.f24696e
            java.lang.String r0 = r0.getString(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
        L_0x0219:
            r2.mo108794O2(r0)
            di3.d r8 = di3.C86312j.m106911c(r3)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r9 = r1.f24696e
            android.text.SpannableString r0 = r8.op0(r9, r0, r7)
            goto L_0x02a8
        L_0x022a:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r8 == 0) goto L_0x0237
            android.content.Context r0 = r1.f24696e
            java.lang.String r0 = r0.getString(r9)
            goto L_0x024f
        L_0x0237:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r15)
            android.content.Context r0 = r1.f24696e
            java.lang.String r0 = r0.getString(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
        L_0x024f:
            r2.mo108794O2(r0)
            di3.d r8 = di3.C86312j.m106911c(r3)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r9 = r1.f24696e
            android.text.SpannableString r0 = r8.op0(r9, r0, r7)
            goto L_0x02a8
        L_0x025f:
            java.lang.String r0 = r19.mo108822p2()     // Catch:{ Exception -> 0x0270 }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0270 }
            java.lang.String r10 = r18.mo103856A(r19)     // Catch:{ Exception -> 0x0270 }
            r8[r11] = r10     // Catch:{ Exception -> 0x0270 }
            java.lang.String r0 = java.lang.String.format(r0, r8)     // Catch:{ Exception -> 0x0270 }
            goto L_0x0277
        L_0x0270:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r5, r8)
            r0 = 0
        L_0x0277:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r10 == 0) goto L_0x028b
            android.content.Context r0 = r1.f24696e
            r10 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r0 = r0.getString(r10)
        L_0x028b:
            r8.append(r0)
            r8.append(r13)
            java.lang.String r0 = r9.f195570f
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            di3.d r8 = di3.C86312j.m106911c(r3)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r9 = r1.f24696e
            android.text.SpannableString r0 = r8.mo107080qH(r9, r0, r7)
            goto L_0x02a8
        L_0x02a7:
            r0 = 0
        L_0x02a8:
            java.lang.String r8 = r19.mo108781B2()
            int r8 = r1.mo103857B(r8)
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r9
            r9 = 49
            if (r8 != r9) goto L_0x0315
            java.lang.String r8 = r19.getContent()
            r9 = 0
            com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r9)
            if (r8 == 0) goto L_0x0315
            int r9 = r8.f195582i
            r10 = 6
            if (r9 == r10) goto L_0x02cd
            r10 = 74
            if (r9 == r10) goto L_0x02cd
            goto L_0x0315
        L_0x02cd:
            java.lang.String r0 = r19.mo108822p2()     // Catch:{ Exception -> 0x02de }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x02de }
            java.lang.String r10 = r18.mo103856A(r19)     // Catch:{ Exception -> 0x02de }
            r9[r11] = r10     // Catch:{ Exception -> 0x02de }
            java.lang.String r0 = java.lang.String.format(r0, r9)     // Catch:{ Exception -> 0x02de }
            goto L_0x02e5
        L_0x02de:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r5, r9)
            r0 = 0
        L_0x02e5:
            android.content.Context r6 = r1.f24696e
            r9 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r6 = r6.getString(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r10 == 0) goto L_0x02fa
            r0 = r6
        L_0x02fa:
            r9.append(r0)
            r9.append(r13)
            java.lang.String r0 = r8.f195570f
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r8 = r1.f24696e
            android.text.SpannableString r0 = r6.mo107080qH(r8, r0, r7)
        L_0x0315:
            java.lang.String r6 = r19.mo108822p2()
            if (r6 == 0) goto L_0x0335
            java.lang.String r8 = "<img src=\"original_label.png\"/>  "
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x0335
            android.text.SpannableString r0 = new android.text.SpannableString
            di3.d r8 = di3.C86312j.m106911c(r3)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r9 = r1.f24696e
            float r10 = (float) r7
            android.text.SpannableString r6 = r8.mo107070jH(r9, r6, r10, r11)
            r0.<init>(r6)
        L_0x0335:
            java.lang.String r6 = r19.getUsername()
            java.lang.String r8 = "qqmail"
            boolean r8 = r6.equals(r8)
            r9 = 2131836254(0x7f113d5e, float:1.930567E38)
            if (r8 == 0) goto L_0x0366
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r8 = r8.mo105906u()
            r10 = 17
            r14 = 0
            java.lang.Object r8 = r8.mo119684e(r10, r14)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r8)
            if (r8 != r12) goto L_0x035d
            r8 = 1
            goto L_0x035e
        L_0x035d:
            r8 = 0
        L_0x035e:
            if (r8 != 0) goto L_0x0366
            android.content.Context r0 = r1.f24696e
            java.lang.String r0 = r0.getString(r9)
        L_0x0366:
            java.lang.String r8 = "tmessage"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0392
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.p r6 = r6.mo105877C()
            com.tencent.mm.storage.s4 r6 = (com.tencent.p014mm.storage.C44667s4) r6
            java.lang.String r8 = "@t.qq.com"
            com.tencent.mm.storage.r4 r6 = r6.mo69821jo(r8)
            if (r6 == 0) goto L_0x0389
            boolean r6 = r6.mo69814c()
            if (r6 == 0) goto L_0x0389
            r6 = 1
            goto L_0x038a
        L_0x0389:
            r6 = 0
        L_0x038a:
            if (r6 != 0) goto L_0x0392
            android.content.Context r0 = r1.f24696e
            java.lang.String r0 = r0.getString(r9)
        L_0x0392:
            java.lang.String r6 = r19.mo108781B2()
            if (r6 == 0) goto L_0x03ac
            java.lang.String r6 = r19.mo108781B2()
            r8 = 64
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x03ac
            java.lang.String r0 = r19.getContent()
        L_0x03ac:
            java.lang.String r6 = r19.mo108781B2()
            java.lang.String r8 = "]"
            java.lang.String r9 = "["
            if (r6 == 0) goto L_0x04a8
            java.lang.String r6 = r19.mo108781B2()
            r10 = 47
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x03d7
            java.lang.String r6 = r19.mo108781B2()
            r10 = 1048625(0x100031, float:1.469437E-39)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x04a8
        L_0x03d7:
            java.lang.String r6 = r19.mo108822p2()
            java.lang.String r6 = r1.mo103861t(r6)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r10 != 0) goto L_0x03f9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            goto L_0x047b
        L_0x03f9:
            java.lang.String r6 = r19.mo108822p2()
            if (r6 == 0) goto L_0x047b
            java.lang.String r6 = r19.mo108822p2()
            java.lang.String r10 = ":"
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x047b
            java.lang.String r6 = r19.mo108822p2()
            java.lang.String r14 = r19.mo108822p2()
            int r14 = r14.indexOf(r10)
            java.lang.String r6 = r6.substring(r11, r14)
            java.lang.String r14 = r19.mo108822p2()
            java.lang.String r11 = r19.mo108822p2()
            int r10 = r11.indexOf(r10)
            int r10 = r10 + r12
            java.lang.String r10 = r14.substring(r10)
            java.lang.String r10 = r10.replace(r13, r5)
            java.lang.String r10 = r1.mo103861t(r10)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x047c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r10 == 0) goto L_0x045f
            di3.d r0 = di3.C86312j.m106911c(r3)
            ny.h r0 = (p629ny.C76979h) r0
            android.content.Context r10 = r1.f24696e
            android.text.SpannableString r0 = r0.op0(r10, r6, r7)
            goto L_0x047c
        L_0x045f:
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            di3.d r11 = di3.C86312j.m106911c(r3)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r14 = r1.f24696e
            android.text.SpannableString r11 = r11.op0(r14, r6, r7)
            r10.append(r11)
            r10.append(r15)
            r10.append(r0)
            r0 = r10
            goto L_0x047c
        L_0x047b:
            r6 = r5
        L_0x047c:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            if (r10 == 0) goto L_0x04b4
            android.content.Context r10 = r1.f24696e
            r11 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r11 == 0) goto L_0x0492
            goto L_0x04a4
        L_0x0492:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r15)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
        L_0x04a4:
            r2.mo108794O2(r10)
            goto L_0x04b4
        L_0x04a8:
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r10 = r1.f24696e
            android.text.SpannableString r0 = r6.op0(r10, r0, r7)
        L_0x04b4:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            r10 = 32
            if (r6 == 0) goto L_0x0532
            java.lang.String r0 = r19.mo108822p2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0502
            java.lang.String r0 = r19.mo108823q2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x04fd
            java.lang.String r0 = r18.mo103856A(r19)
            java.lang.String r6 = r19.mo108822p2()     // Catch:{ Exception -> 0x04e2 }
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x04e2 }
            r14 = 0
            r11[r14] = r0     // Catch:{ Exception -> 0x04e2 }
            java.lang.String r0 = java.lang.String.format(r6, r11)     // Catch:{ Exception -> 0x04e2 }
            goto L_0x051c
        L_0x04e2:
            int r0 = r19.mo108832y2()
            java.lang.String r6 = r19.getUsername()
            java.lang.String r11 = r19.getContent()
            java.lang.String r14 = r19.mo108781B2()
            int r14 = r1.mo103857B(r14)
            android.content.Context r15 = r1.f24696e
            java.lang.String r0 = p875ci.C67379u.m79745j(r0, r6, r11, r14, r15)
            goto L_0x051c
        L_0x04fd:
            java.lang.String r0 = r19.mo108822p2()
            goto L_0x051c
        L_0x0502:
            int r0 = r19.mo108832y2()
            java.lang.String r6 = r19.getUsername()
            java.lang.String r11 = r19.getContent()
            java.lang.String r14 = r19.mo108781B2()
            int r14 = r1.mo103857B(r14)
            android.content.Context r15 = r1.f24696e
            java.lang.String r0 = p875ci.C67379u.m79745j(r0, r6, r11, r14, r15)
        L_0x051c:
            java.lang.String r0 = r0.toString()
            r6 = 10
            java.lang.String r0 = r0.replace(r6, r10)
            di3.d r6 = di3.C86312j.m106911c(r3)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r11 = r1.f24696e
            android.text.SpannableString r0 = r6.op0(r11, r0, r7)
        L_0x0532:
            r6 = 33554432(0x2000000, float:9.403955E-38)
            boolean r6 = r2.mo108372k3(r6)
            if (r6 == 0) goto L_0x057c
            int r6 = r19.mo108786G2()
            if (r6 > 0) goto L_0x0546
            int r6 = r19.mo108788I2()
            if (r6 <= 0) goto L_0x057c
        L_0x0546:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            android.content.Context r3 = r1.f24696e
            r5 = 2131837583(0x7f11428f, float:1.9308365E38)
            java.lang.String r3 = r3.getString(r5)
            r2.<init>(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            android.content.Context r5 = r1.f24696e
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r5 = r5.getColor(r6)
            r3.<init>(r5)
            int r5 = r2.length()
            r6 = 33
            r7 = 0
            r2.setSpan(r3, r7, r5, r6)
            android.text.SpannableStringBuilder r3 = r2.append(r13)
            r3.append(r0)
            android.text.SpannableStringBuilder r0 = r4.append(r2)
            return r0
        L_0x057c:
            int r6 = r19.mo108787H2()
            r11 = 4096(0x1000, float:5.74E-42)
            if (r6 <= 0) goto L_0x05d3
            int r3 = r19.mo108787H2()
            if (r3 >= r11) goto L_0x05a1
            android.content.Context r3 = r1.f24696e
            r4 = 2131832633(0x7f112f39, float:1.9298325E38)
            java.lang.Object[] r5 = new java.lang.Object[r12]
            int r2 = r19.mo108787H2()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r5[r6] = r2
            java.lang.String r2 = r3.getString(r4, r5)
            goto L_0x05aa
        L_0x05a1:
            android.content.Context r2 = r1.f24696e
            r3 = 2131832630(0x7f112f36, float:1.929832E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x05aa:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r4 = r1.f24696e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r4 = r4.getColor(r5)
            r2.<init>(r4)
            int r4 = r3.length()
            r5 = 33
            r6 = 0
            r3.setSpan(r2, r6, r4, r5)
            android.text.SpannableStringBuilder r2 = r3.append(r13)
            r2.append(r0)
            return r3
        L_0x05d3:
            int r6 = r19.mo108818l2()
            if (r6 <= 0) goto L_0x0637
            int r6 = r19.mo108786G2()
            if (r6 > 0) goto L_0x05e5
            int r6 = r19.mo108788I2()
            if (r6 <= 0) goto L_0x0637
        L_0x05e5:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            android.content.Context r4 = r1.f24696e
            int r5 = r19.mo108818l2()
            if (r5 >= r11) goto L_0x05f3
            r2 = 2131832632(0x7f112f38, float:1.9298323E38)
            goto L_0x060c
        L_0x05f3:
            java.lang.Class<rn.v> r5 = p227rn.C48053v.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            rn.v r5 = (p227rn.C48053v) r5
            java.lang.String r2 = r19.getUsername()
            boolean r2 = r5.mo72614OE(r2)
            if (r2 == 0) goto L_0x0609
            r2 = 2131832631(0x7f112f37, float:1.9298321E38)
            goto L_0x060c
        L_0x0609:
            r2 = 2131832634(0x7f112f3a, float:1.9298327E38)
        L_0x060c:
            java.lang.String r2 = r4.getString(r2)
            r3.<init>(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r4 = r1.f24696e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r4 = r4.getColor(r5)
            r2.<init>(r4)
            int r4 = r3.length()
            r5 = 33
            r6 = 0
            r3.setSpan(r2, r6, r4, r5)
            android.text.SpannableStringBuilder r2 = r3.append(r13)
            r2.append(r0)
            return r3
        L_0x0637:
            int r6 = r19.mo108829v2()
            if (r6 <= 0) goto L_0x067b
            int r6 = r19.mo108786G2()
            if (r6 > 0) goto L_0x0649
            int r6 = r19.mo108788I2()
            if (r6 <= 0) goto L_0x067b
        L_0x0649:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            android.content.Context r3 = r1.f24696e
            r4 = 2131837358(0x7f1141ae, float:1.9307909E38)
            java.lang.String r3 = r3.getString(r4)
            r2.<init>(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            android.content.Context r4 = r1.f24696e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r4 = r4.getColor(r5)
            r3.<init>(r4)
            int r4 = r2.length()
            r5 = 33
            r6 = 0
            r2.setSpan(r3, r6, r4, r5)
            android.text.SpannableStringBuilder r3 = r2.append(r13)
            r3.append(r0)
            return r2
        L_0x067b:
            int r6 = r19.mo108830w2()
            if (r6 != r12) goto L_0x06b3
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            android.content.Context r3 = r1.f24696e
            r4 = 2131838045(0x7f11445d, float:1.9309302E38)
            java.lang.String r3 = r3.getString(r4)
            r2.<init>(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            android.content.Context r4 = r1.f24696e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r4 = r4.getColor(r5)
            r3.<init>(r4)
            int r4 = r2.length()
            r5 = 33
            r6 = 0
            r2.setSpan(r3, r6, r4, r5)
            android.text.SpannableStringBuilder r3 = r2.append(r13)
            r3.append(r0)
            return r2
        L_0x06b3:
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r6 = r2.mo108372k3(r6)
            if (r6 == 0) goto L_0x070d
            int r6 = r19.mo108786G2()
            if (r6 > 0) goto L_0x06c7
            int r6 = r19.mo108788I2()
            if (r6 <= 0) goto L_0x070d
        L_0x06c7:
            android.content.Context r2 = r1.f24696e
            r6 = 2131820580(0x7f110024, float:1.9273879E38)
            java.lang.String r2 = r2.getString(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.replace(r2, r5)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r6 = r1.f24696e
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r6 = r6.getColor(r8)
            r2.<init>(r6)
            int r6 = r5.length()
            r8 = 33
            r9 = 0
            r5.setSpan(r2, r9, r6, r8)
            di3.d r2 = di3.C86312j.m106911c(r3)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r1.f24696e
            android.text.SpannableString r0 = r2.op0(r3, r0, r7)
            r5.append(r0)
            android.text.SpannableStringBuilder r0 = r4.append(r5)
            return r0
        L_0x070d:
            int r6 = r19.mo108783D2()
            if (r6 != r12) goto L_0x0728
            android.content.Context r2 = r1.f24696e
            r3 = 2131834477(0x7f11366d, float:1.9302065E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.replace(r2, r5)
            r4.append(r0)
            return r4
        L_0x0728:
            int r6 = r19.mo108831x2()
            if (r6 != r12) goto L_0x0770
            java.lang.String r6 = r19.mo108781B2()
            int r6 = r1.mo103857B(r6)
            r10 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r6 != r10) goto L_0x08ae
            java.lang.String r2 = r19.getContent()
            r6 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r6)
            if (r2 == 0) goto L_0x08ae
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            java.lang.String r2 = r2.f195596l1
            r6.append(r2)
            r6.append(r8)
            java.lang.String r2 = r6.toString()
            java.lang.String r0 = r0.replace(r2, r5)
            di3.d r2 = di3.C86312j.m106911c(r3)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r1.f24696e
            android.text.SpannableString r0 = r2.op0(r3, r0, r7)
            goto L_0x08ae
        L_0x0770:
            r3 = 2131832635(0x7f112f3b, float:1.929833E38)
            if (r22 == 0) goto L_0x079e
            int r6 = r19.mo108786G2()
            if (r6 > r12) goto L_0x0781
            int r6 = r19.mo108788I2()
            if (r6 <= 0) goto L_0x079e
        L_0x0781:
            android.content.Context r6 = r1.f24696e
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r2 = r19.mo108786G2()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r7[r8] = r2
            r7[r12] = r5
            java.lang.String r2 = r6.getString(r3, r7)
            r4.append(r2)
            r4.append(r0)
            return r4
        L_0x079e:
            java.lang.String r6 = r19.getUsername()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85841l5(r6)
            if (r6 == 0) goto L_0x0860
            jw0.a r6 = jw0.C21287a.f60143a
            android.content.Context r8 = r1.f24696e
            java.lang.CharSequence r8 = r6.mo33262c(r7, r8, r2)
            if (r8 == 0) goto L_0x07b9
            int r9 = r8.length()
            if (r9 <= 0) goto L_0x07b9
            return r8
        L_0x07b9:
            r8 = 16
            boolean r8 = r2.mo108372k3(r8)
            int r9 = r19.mo108786G2()
            if (r9 > r12) goto L_0x07e7
            if (r8 != 0) goto L_0x07ce
            int r9 = r19.mo108786G2()
            if (r9 <= 0) goto L_0x07ce
            goto L_0x07e7
        L_0x07ce:
            boolean r2 = r2.mo108372k3(r10)
            if (r2 == 0) goto L_0x08ae
            android.content.Context r2 = r1.f24696e
            android.text.SpannableString r2 = r6.mo33263d(r7, r2)
            r3 = 2
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
            r4 = 0
            r3[r4] = r2
            r3[r12] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r3)
            return r0
        L_0x07e7:
            if (r8 == 0) goto L_0x083a
            boolean r8 = r2.mo108372k3(r10)
            if (r8 == 0) goto L_0x081d
            android.content.Context r3 = r1.f24696e
            r4 = 2131832628(0x7f112f34, float:1.9298315E38)
            java.lang.Object[] r5 = new java.lang.Object[r12]
            int r2 = r19.mo108786G2()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r5[r8] = r2
            java.lang.String r2 = r3.getString(r4, r5)
            android.content.Context r3 = r1.f24696e
            android.text.SpannableString r3 = r6.mo33263d(r7, r3)
            r4 = 4
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r4]
            r4[r8] = r2
            r4[r12] = r13
            r6 = 2
            r4[r6] = r3
            r2 = 3
            r4[r2] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r4)
            return r0
        L_0x081d:
            r6 = 2
            r8 = 0
            android.content.Context r7 = r1.f24696e
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r2 = r19.mo108786G2()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r8] = r2
            r6[r12] = r5
            java.lang.String r2 = r7.getString(r3, r6)
            r4.append(r2)
            r4.append(r0)
            return r4
        L_0x083a:
            boolean r3 = com.tencent.p014mm.storage.C19615i1.m21055b()
            if (r3 == 0) goto L_0x08ae
            android.content.Context r3 = r1.f24696e
            r6 = 2131832629(0x7f112f35, float:1.9298317E38)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r2 = r19.mo108786G2()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r7[r8] = r2
            r7[r12] = r5
            java.lang.String r2 = r3.getString(r6, r7)
            r4.append(r2)
            r4.append(r0)
            return r4
        L_0x0860:
            java.lang.String r6 = r19.getUsername()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85806K4(r6)
            if (r6 == 0) goto L_0x0893
            int r6 = r19.mo108786G2()
            if (r6 > r12) goto L_0x0876
            int r6 = r19.mo108788I2()
            if (r6 <= 0) goto L_0x0893
        L_0x0876:
            android.content.Context r6 = r1.f24696e
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r2 = r19.mo108786G2()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r7[r8] = r2
            r7[r12] = r5
            java.lang.String r2 = r6.getString(r3, r7)
            r4.append(r2)
            r4.append(r0)
            return r4
        L_0x0893:
            java.lang.String r3 = r19.mo108781B2()
            int r3 = r1.mo103857B(r3)
            r5 = 889192497(0x35000031, float:4.7683994E-7)
            if (r3 == r5) goto L_0x08b3
            java.lang.String r3 = r19.mo108781B2()
            int r3 = r1.mo103857B(r3)
            r5 = 922746929(0x37000031, float:7.629439E-6)
            if (r3 != r5) goto L_0x08ae
            goto L_0x08b3
        L_0x08ae:
            android.text.SpannableStringBuilder r0 = r4.append(r0)
            return r0
        L_0x08b3:
            java.lang.Class<vd2.d> r0 = vd2.C78384d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            vd2.d r0 = (vd2.C78384d) r0
            android.content.Context r3 = r1.f24696e
            java.lang.String r4 = r19.mo108781B2()
            int r4 = r1.mo103857B(r4)
            java.lang.String r5 = r19.getContent()
            java.lang.String r6 = r19.getUsername()
            r2 = r0
            r7 = r20
            java.lang.CharSequence r0 = r2.mo108132v9(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74697k.mo103858C(com.tencent.mm.storage.h2, int, com.tencent.mm.ui.conversation.k$e, boolean):java.lang.CharSequence");
    }

    /* renamed from: D */
    public void mo70227D() {
        this.f219606F.stopTimer();
        HashMap<String, C74701d> hashMap = this.f219608p;
        if (hashMap != null) {
            hashMap.clear();
            this.f219608p = null;
        }
        mo5580b();
        this.f24699h = null;
        mo70184w();
    }

    /* renamed from: E */
    public void mo103859E() {
        MMSlideDelView.C73186f fVar = this.f219610r;
        if (fVar != null) {
            fVar.mo97957b();
        }
        this.f219614v = false;
    }

    /* renamed from: F */
    public void mo103860F() {
        HashMap<String, C74701d> hashMap;
        Log.m105925i("MicroMsg.ConversationAdapter", "dkpno onResume mIsFront:%b  mNeedReCreate:%b mChangedBackground:%b mContactBackground:%b", Boolean.valueOf(this.f219614v), Boolean.valueOf(this.f219616x), Boolean.valueOf(this.f219615w), Boolean.FALSE);
        this.f219614v = true;
        Time time = new Time();
        time.setToNow();
        String charSequence = C72714e.m85106a("MM/dd", time).toString();
        boolean z = !this.f219618z.equals(charSequence);
        this.f219618z = charSequence;
        if (z && (hashMap = this.f219608p) != null) {
            for (Map.Entry<String, C74701d> value : hashMap.entrySet()) {
                ((C74701d) value.getValue()).f219626b = null;
            }
        }
        if (this.f219615w) {
            mo7991f();
            this.f219615w = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0918  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0927  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0262 A[Catch:{ Exception -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x027d A[Catch:{ Exception -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x027f A[Catch:{ Exception -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0283 A[Catch:{ Exception -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028a A[Catch:{ Exception -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0296 A[Catch:{ Exception -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r28, android.view.View r29, android.view.ViewGroup r30) {
        /*
            r27 = this;
            r1 = r27
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            java.lang.Object r3 = r27.getItem(r28)
            com.tencent.mm.storage.h2 r3 = (com.tencent.p014mm.storage.C72976h2) r3
            java.lang.String r4 = r3.getUsername()
            com.tencent.mm.ui.conversation.k$e r5 = r1.f219601A
            r5.f219641b = r4
            r6 = 0
            r5.f219640a = r6
            r7 = 0
            r5.f219642c = r7
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r9 = 1
            if (r8 != 0) goto L_0x0023
            r5.f219642c = r9
        L_0x0023:
            com.tencent.mm.ui.conversation.k$c r5 = new com.tencent.mm.ui.conversation.k$c
            r5.<init>(r1, r6)
            r1.f219604D = r5
            r5 = 5
            r8 = 3
            r10 = 2131300457(0x7f091069, float:1.8218944E38)
            r11 = 4
            if (r29 != 0) goto L_0x017b
            com.tencent.mm.ui.conversation.k$f r12 = new com.tencent.mm.ui.conversation.k$f
            r12.<init>()
            android.content.Context r13 = r1.f24696e
            boolean r13 = kg3.C76577a.m92147C(r13)
            if (r13 == 0) goto L_0x0049
            android.content.Context r13 = r1.f24696e
            r14 = 2131493997(0x7f0c046d, float:1.861149E38)
            android.view.View r13 = android.view.View.inflate(r13, r14, r6)
            goto L_0x0052
        L_0x0049:
            android.content.Context r13 = r1.f24696e
            r14 = 2131493996(0x7f0c046c, float:1.8611488E38)
            android.view.View r13 = android.view.View.inflate(r13, r14, r6)
        L_0x0052:
            android.view.View r14 = r13.findViewById(r10)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r12.f219643a = r14
            r14 = 2131297477(0x7f0904c5, float:1.82129E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            r14 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r12.f219644b = r14
            android.content.Context r14 = r1.f24696e
            boolean r15 = r14 instanceof com.tencent.p014mm.p136ui.conversation.NewBizConversationUI
            if (r15 != 0) goto L_0x0085
            boolean r14 = r14 instanceof com.tencent.p014mm.p136ui.conversation.ServiceNotifyConversationUI
            if (r14 == 0) goto L_0x0079
            goto L_0x0085
        L_0x0079:
            di3.d r14 = di3.C86312j.m106911c(r2)
            ln.f r14 = (p196ln.C76705f) r14
            android.widget.ImageView r15 = r12.f219644b
            r14.mo106849z(r15, r4)
            goto L_0x0090
        L_0x0085:
            di3.d r14 = di3.C86312j.m106911c(r2)
            ln.f r14 = (p196ln.C76705f) r14
            android.widget.ImageView r15 = r12.f219644b
            r14.mo106822J5(r15, r4)
        L_0x0090:
            android.widget.ImageView r14 = r12.f219644b
            android.graphics.drawable.Drawable r14 = r14.getDrawable()
            boolean r14 = r14 instanceof vd3.C78399i.C78400a
            if (r14 == 0) goto L_0x00a2
            android.widget.ImageView r14 = r12.f219644b
            android.graphics.drawable.Drawable r14 = r14.getDrawable()
            vd3.i$a r14 = (vd3.C78399i.C78400a) r14
        L_0x00a2:
            r14 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r14 = r13.findViewById(r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r14
            r12.f219645c = r14
            com.tencent.mm.ui.base.NoMeasuredTextView$c r15 = r1.f219617y
            r14.setLayoutCallback(r15)
            r14 = 2131314218(0x7f09462a, float:1.8246855E38)
            android.view.View r14 = r13.findViewById(r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r14
            r12.f219646d = r14
            r14 = 2131315971(0x7f094d03, float:1.825041E38)
            android.view.View r14 = r13.findViewById(r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r14
            r12.f219647e = r14
            r14 = 2131306982(0x7f0929e6, float:1.8232178E38)
            android.view.View r14 = r13.findViewById(r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r14
            r12.f219648f = r14
            r14 = 2131315309(0x7f094a6d, float:1.8249068E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r12.f219649g = r14
            android.content.Context r15 = r1.f24696e
            int r15 = com.tencent.p014mm.p136ui.tools.C45081s1.m49932a(r15)
            r14.setBackgroundResource(r15)
            r14 = 2131306321(0x7f092751, float:1.8230838E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r12.f219650h = r14
            r14 = 2131297488(0x7f0904d0, float:1.8212922E38)
            android.view.View r14 = r13.findViewById(r14)
            r12.f219654l = r14
            r14 = 2131314937(0x7f0948f9, float:1.8248313E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r12.f219652j = r14
            r14 = 2131308093(0x7f092e3d, float:1.8234432E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r12.f219653k = r14
            r14 = 2131309701(0x7f093485, float:1.8237693E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r12.f219651i = r14
            r13.setTag(r12)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219648f
            float r15 = r1.f219612t
            r14.mo153549i(r7, r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219647e
            float r15 = r1.f219613u
            r14.mo153549i(r7, r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219645c
            float r15 = r1.f219611s
            r14.mo153549i(r7, r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219646d
            float r15 = r1.f219612t
            r14.mo153549i(r7, r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219648f
            android.content.res.ColorStateList[] r15 = r1.f219607o
            r15 = r15[r7]
            r14.setTextColor((android.content.res.ColorStateList) r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219647e
            android.content.res.ColorStateList[] r15 = r1.f219607o
            r15 = r15[r11]
            r14.setTextColor((android.content.res.ColorStateList) r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219645c
            android.content.res.ColorStateList[] r15 = r1.f219607o
            r15 = r15[r8]
            r14.setTextColor((android.content.res.ColorStateList) r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219646d
            android.content.res.ColorStateList[] r15 = r1.f219607o
            r15 = r15[r7]
            r14.setTextColor((android.content.res.ColorStateList) r15)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219648f
            r14.setShouldEllipsize(r9)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219647e
            r14.setShouldEllipsize(r7)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219645c
            r14.setShouldEllipsize(r9)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219646d
            r14.setShouldEllipsize(r9)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r12.f219647e
            r14.setGravity(r5)
            r15 = r12
            r12 = r13
            goto L_0x0184
        L_0x017b:
            java.lang.Object r12 = r29.getTag()
            com.tencent.mm.ui.conversation.k$f r12 = (com.tencent.p014mm.p136ui.conversation.C74697k.C74703f) r12
            r15 = r12
            r12 = r29
        L_0x0184:
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.k$d> r13 = r1.f219608p
            java.lang.Object r13 = r13.get(r4)
            com.tencent.mm.ui.conversation.k$d r13 = (com.tencent.p014mm.p136ui.conversation.C74697k.C74701d) r13
            r16 = 2
            r14 = -1
            if (r13 != 0) goto L_0x035b
            com.tencent.mm.ui.conversation.k$d r13 = new com.tencent.mm.ui.conversation.k$d
            r13.<init>(r1, r6)
            com.tencent.mm.ui.conversation.k$e r6 = r1.f219601A
            boolean r5 = r6.f219642c
            if (r5 == 0) goto L_0x01b0
            com.tencent.mm.storage.z1 r5 = r6.f219640a
            if (r5 != 0) goto L_0x01b0
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r5 = r5.mo105907v()
            java.lang.String r10 = r6.f219641b
            com.tencent.mm.storage.z1 r5 = r5.get(r10)
            r6.f219640a = r5
        L_0x01b0:
            com.tencent.mm.storage.z1 r5 = r6.f219640a
            if (r5 == 0) goto L_0x01be
            int r6 = r5.f149511R0
            r13.f219630f = r6
            long r10 = r5.f108320R1
            int r6 = (int) r10
            r13.f219629e = r6
            goto L_0x01c2
        L_0x01be:
            r13.f219630f = r14
            r13.f219629e = r14
        L_0x01c2:
            if (r5 == 0) goto L_0x01c6
            r6 = 1
            goto L_0x01c7
        L_0x01c6:
            r6 = 0
        L_0x01c7:
            r13.f219637m = r6
            if (r5 == 0) goto L_0x01da
            int r6 = r5.getType()
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L_0x01d5
            r6 = 1
            goto L_0x01d6
        L_0x01d5:
            r6 = 0
        L_0x01d6:
            if (r6 == 0) goto L_0x01da
            r6 = 1
            goto L_0x01db
        L_0x01da:
            r6 = 0
        L_0x01db:
            r13.f219639o = r6
            if (r5 == 0) goto L_0x01e5
            int r6 = r5.f149512S
            if (r6 != 0) goto L_0x01e5
            r6 = 1
            goto L_0x01e6
        L_0x01e5:
            r6 = 0
        L_0x01e6:
            r13.f219638n = r6
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
            r13.f219634j = r6
            if (r6 == 0) goto L_0x01fc
            boolean r6 = r13.f219638n
            if (r6 == 0) goto L_0x01fc
            int r6 = r3.mo108786G2()
            if (r6 <= 0) goto L_0x01fc
            r6 = 1
            goto L_0x01fd
        L_0x01fc:
            r6 = 0
        L_0x01fd:
            r13.f219636l = r6
            r13.f219631g = r7
            java.lang.String r6 = r3.mo108781B2()
            int r6 = r1.mo103857B(r6)
            r10 = 34
            if (r6 != r10) goto L_0x02ac
            int r10 = r3.mo108832y2()
            if (r10 != 0) goto L_0x02ac
            java.lang.String r10 = r3.getContent()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x02ac
            java.lang.String r10 = r3.getContent()
            java.lang.String r11 = "qmessage"
            boolean r11 = r4.equals(r11)
            java.lang.String r14 = ":"
            if (r11 != 0) goto L_0x0233
            java.lang.String r11 = "floatbottle"
            boolean r11 = r4.equals(r11)
            if (r11 == 0) goto L_0x025a
        L_0x0233:
            java.lang.String[] r11 = r10.split(r14)
            if (r11 == 0) goto L_0x025a
            int r7 = r11.length
            if (r7 <= r8) goto L_0x025a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r10 = r11[r9]
            r7.append(r10)
            r7.append(r14)
            r10 = r11[r16]
            r7.append(r10)
            r7.append(r14)
            r10 = r11[r8]
            r7.append(r10)
            java.lang.String r10 = r7.toString()
        L_0x025a:
            java.lang.String r7 = "\n"
            boolean r7 = r10.endsWith(r7)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x026c
            int r7 = r10.length()     // Catch:{ Exception -> 0x029f }
            int r7 = r7 - r9
            r11 = 0
            java.lang.String r10 = r10.substring(r11, r7)     // Catch:{ Exception -> 0x029f }
        L_0x026c:
            java.lang.String[] r7 = r10.split(r14)     // Catch:{ Exception -> 0x029f }
            int r10 = r7.length     // Catch:{ Exception -> 0x029f }
            r11 = 4
            if (r10 != r11) goto L_0x027f
            r11 = 0
            r14 = r7[r11]     // Catch:{ Exception -> 0x029f }
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85811N4(r14)     // Catch:{ Exception -> 0x029f }
            if (r11 == 0) goto L_0x027f
            r11 = 1
            goto L_0x0280
        L_0x027f:
            r11 = 0
        L_0x0280:
            int r14 = r7.length     // Catch:{ Exception -> 0x029f }
            if (r14 <= r11) goto L_0x0285
            r14 = r7[r11]     // Catch:{ Exception -> 0x029f }
        L_0x0285:
            int r14 = r7.length     // Catch:{ Exception -> 0x029f }
            int r10 = r11 + 1
            if (r14 <= r10) goto L_0x0291
            r10 = r7[r10]     // Catch:{ Exception -> 0x029f }
            r8 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getLong(r10, r8)     // Catch:{ Exception -> 0x029f }
        L_0x0291:
            int r8 = r7.length     // Catch:{ Exception -> 0x029f }
            int r11 = r11 + 2
            if (r8 <= r11) goto L_0x02a6
            r7 = r7[r11]     // Catch:{ Exception -> 0x029f }
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x029f }
            goto L_0x02a7
        L_0x029f:
            java.lang.String r7 = "MicroMsg.VoiceContent"
            java.lang.String r8 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
        L_0x02a6:
            r7 = 0
        L_0x02a7:
            if (r7 != 0) goto L_0x02ac
            r7 = 1
            r13.f219631g = r7
        L_0x02ac:
            r7 = 285212721(0x11000031, float:1.0097479E-28)
            if (r6 != r7) goto L_0x02c4
            java.lang.String r6 = r3.getContent()
            zt3.t r7 = zt3.C119157j.f356862d
            com.tencent.mm.ui.conversation.m r8 = new com.tencent.mm.ui.conversation.m
            r8.<init>(r1, r6)
            zt3.j r7 = (zt3.C119157j) r7
            java.lang.String r6 = "tmplPreload"
            r7.mo183876g(r8, r6)
        L_0x02c4:
            di3.d r6 = di3.C86312j.m106911c(r0)
            d62.i r6 = (d62.C75339i) r6
            boolean r7 = r13.f219634j
            java.lang.String r6 = r6.As0(r5, r4, r7)
            boolean r7 = r13.f219634j
            if (r7 == 0) goto L_0x02e2
            if (r6 != 0) goto L_0x02e2
            android.content.Context r0 = r1.f24696e
            r6 = 2131823645(0x7f110c1d, float:1.9280096E38)
            java.lang.String r0 = r0.getString(r6)
            r13.f219625a = r0
            goto L_0x0304
        L_0x02e2:
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = r1.f24696e
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            boolean r8 = r13.f219634j
            java.lang.String r0 = r0.As0(r5, r4, r8)
            com.tencent.mm.ui.base.NoMeasuredTextView r8 = r15.f219645c
            float r8 = r8.getTextSize()
            android.text.SpannableString r0 = r6.yp0(r7, r0, r8)
            r13.f219625a = r0
        L_0x0304:
            java.lang.CharSequence r0 = r1.mo103862z(r3)
            r13.f219626b = r0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            float r0 = r0.getTextSize()
            int r0 = (int) r0
            com.tencent.mm.ui.conversation.k$e r6 = r1.f219601A
            boolean r7 = r13.f219636l
            java.lang.CharSequence r0 = r1.mo103858C(r3, r0, r6, r7)
            r13.f219627c = r0
            int r0 = r3.getStatus()
            r6 = 1
            if (r0 == r6) goto L_0x032b
            r6 = 5
            if (r0 == r6) goto L_0x0327
            r0 = -1
            goto L_0x032e
        L_0x0327:
            r0 = 2131756708(0x7f1006a4, float:1.9144331E38)
            goto L_0x032e
        L_0x032b:
            r0 = 2131756709(0x7f1006a5, float:1.9144333E38)
        L_0x032e:
            r13.f219628d = r0
            boolean r0 = eb0.C45628s0.m50772f(r3)
            r13.f219632h = r0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            boolean r0 = r0.mo69754Z(r3)
            r13.f219633i = r0
            if (r5 == 0) goto L_0x0350
            boolean r0 = eb0.C45628s0.m50746K(r5)
            if (r0 == 0) goto L_0x0350
            r0 = 1
            goto L_0x0351
        L_0x0350:
            r0 = 0
        L_0x0351:
            r13.f219635k = r0
            com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.k$d> r0 = r1.f219608p
            r0.put(r4, r13)
        L_0x035b:
            r5 = r13
            java.lang.String r0 = r3.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85846q5(r0)
            java.lang.String r6 = "@"
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x03eb
            com.tencent.mm.ui.conversation.k$e r0 = r1.f219601A
            java.lang.String r8 = r3.getUsername()
            r0.f219641b = r8
            r9 = 0
            r0.f219640a = r9
            r9 = 0
            r0.f219642c = r9
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0381
            r8 = 1
            r0.f219642c = r8
        L_0x0381:
            com.tencent.mm.ui.conversation.k$e r0 = r1.f219601A
            boolean r8 = r0.f219642c
            if (r8 == 0) goto L_0x039b
            com.tencent.mm.storage.z1 r8 = r0.f219640a
            if (r8 != 0) goto L_0x039b
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            java.lang.String r9 = r0.f219641b
            com.tencent.mm.storage.z1 r8 = r8.get(r9)
            r0.f219640a = r8
        L_0x039b:
            com.tencent.mm.storage.z1 r0 = r0.f219640a
            if (r0 == 0) goto L_0x03b4
            java.lang.Class<he0.j> r8 = he0.C76158j.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            he0.j r8 = (he0.C76158j) r8
            java.lang.String r9 = r0.mo73980x2()
            java.lang.String r10 = r0.mo73976t2()
            java.lang.String r8 = r8.mo106373wo(r9, r10)
            goto L_0x03b5
        L_0x03b4:
            r8 = r7
        L_0x03b5:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x03e3
            if (r0 == 0) goto L_0x03d8
            java.lang.String r0 = r0.mo73980x2()
            java.lang.String r9 = "3552365301"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03d8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L_0x03d8:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r9 = 2131100996(0x7f060544, float:1.781439E38)
            r10 = 14
            r0.mo153515g(r8, r9, r10)
            goto L_0x03f2
        L_0x03e3:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r8 = 0
            r9 = 0
            r0.mo153515g(r8, r9, r9)
            goto L_0x03f2
        L_0x03eb:
            r8 = 0
            r9 = 0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r0.mo153515g(r8, r9, r9)
        L_0x03f2:
            java.lang.CharSequence r0 = r5.f219626b
            if (r0 != 0) goto L_0x03fc
            java.lang.CharSequence r0 = r1.mo103862z(r3)
            r5.f219626b = r0
        L_0x03fc:
            boolean r0 = r5.f219636l
            java.lang.String r8 = "MicroMsg.ConversationAdapter"
            if (r0 != 0) goto L_0x0467
            java.lang.String r0 = r3.mo108782C2()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85841l5(r0)
            if (r0 == 0) goto L_0x040d
            goto L_0x0467
        L_0x040d:
            int r0 = r5.f219631g
            r10 = 1
            if (r0 != r10) goto L_0x045c
            int r0 = r3.mo108832y2()
            if (r0 != 0) goto L_0x045c
            android.content.Context r0 = r1.f24696e
            r10 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r0 = r0.getString(r10)
            java.lang.CharSequence r10 = r5.f219627c
            java.lang.String r10 = r10.toString()
            int r10 = r10.lastIndexOf(r0)
            if (r10 < 0) goto L_0x045c
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0453 }
            java.lang.CharSequence r13 = r5.f219627c     // Catch:{ Exception -> 0x0453 }
            r11.<init>(r13)     // Catch:{ Exception -> 0x0453 }
            android.text.style.ForegroundColorSpan r13 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0453 }
            android.content.Context r14 = r1.f24696e     // Catch:{ Exception -> 0x0453 }
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ Exception -> 0x0453 }
            r9 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r9 = r14.getColor(r9)     // Catch:{ Exception -> 0x0453 }
            r13.<init>(r9)     // Catch:{ Exception -> 0x0453 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0453 }
            int r0 = r0 + r10
            r9 = 33
            r11.setSpan(r13, r10, r0, r9)     // Catch:{ Exception -> 0x0453 }
            r5.f219627c = r11     // Catch:{ Exception -> 0x0453 }
            goto L_0x045c
        L_0x0453:
            r0 = move-exception
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r11, r10)
            goto L_0x045d
        L_0x045c:
            r9 = 0
        L_0x045d:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            android.content.res.ColorStateList[] r10 = r1.f219607o
            r10 = r10[r9]
            r0.setTextColor((android.content.res.ColorStateList) r10)
            goto L_0x0471
        L_0x0467:
            r9 = 0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            android.content.res.ColorStateList[] r10 = r1.f219607o
            r10 = r10[r9]
            r0.setTextColor((android.content.res.ColorStateList) r10)
        L_0x0471:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            int r0 = r0.getWidth()
            p875ci.C67379u.f193255e = r0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            float r0 = r0.getTextSize()
            int r0 = (int) r0
            p875ci.C67379u.f193256f = r0
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            android.text.TextPaint r0 = r0.getPaint()
            p875ci.C67379u.m79748m(r0)
            java.lang.String r0 = r4.toLowerCase()
            java.lang.String r9 = "@t.qq.com"
            boolean r0 = r0.endsWith(r9)
            if (r0 == 0) goto L_0x04a6
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r9 = 2131233376(0x7f080a60, float:1.8082888E38)
            r0.setCompoundRightDrawablesWithIntrinsicBounds((int) r9)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r9 = 1
            r0.setDrawRightDrawable(r9)
            goto L_0x04c9
        L_0x04a6:
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r4)
            if (r0 != 0) goto L_0x04bb
            boolean r0 = eb0.C45628s0.m50735A(r4)
            if (r0 == 0) goto L_0x04b3
            goto L_0x04bb
        L_0x04b3:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r9 = 0
            r0.setDrawRightDrawable(r9)
            r9 = 1
            goto L_0x04c9
        L_0x04bb:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r9 = 2131756796(0x7f1006fc, float:1.914451E38)
            r0.setCompoundRightDrawablesWithIntrinsicBounds((int) r9)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            r9 = 1
            r0.setDrawRightDrawable(r9)
        L_0x04c9:
            int r0 = r5.f219628d
            r10 = -1
            if (r0 == r10) goto L_0x04d9
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r15.f219648f
            r10.setCompoundLeftDrawablesWithIntrinsicBounds((int) r0)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            r0.setDrawLeftDrawable(r9)
            goto L_0x04df
        L_0x04d9:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            r9 = 0
            r0.setDrawLeftDrawable(r9)
        L_0x04df:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219646d
            r9 = 8
            r0.setVisibility(r9)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219647e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.CharSequence r10 = r5.f219626b
            int r10 = r10.length()
            r11 = 9
            if (r10 < r11) goto L_0x0504
            int r10 = r0.width
            int r11 = r1.f219603C
            if (r10 == r11) goto L_0x0511
            r0.width = r11
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r15.f219647e
            r10.setLayoutParams(r0)
            goto L_0x0511
        L_0x0504:
            int r10 = r0.width
            int r11 = r1.f219602B
            if (r10 == r11) goto L_0x0511
            r0.width = r11
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r15.f219647e
            r10.setLayoutParams(r0)
        L_0x0511:
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            int r0 = r0.width
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10 = 0
            r11[r10] = r0
            java.lang.String r0 = "layout update time width %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r0, r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219647e
            java.lang.CharSequence r10 = r5.f219626b
            r0.setText((java.lang.CharSequence) r10)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219648f
            java.lang.CharSequence r10 = r5.f219627c
            r0.setText((java.lang.CharSequence) r10)
            boolean r0 = r5.f219634j
            if (r0 == 0) goto L_0x053f
            boolean r0 = r5.f219638n
            if (r0 == 0) goto L_0x053f
            android.widget.ImageView r0 = r15.f219650h
            r10 = 0
            r0.setVisibility(r10)
            goto L_0x054f
        L_0x053f:
            r10 = 0
            boolean r0 = r5.f219635k
            if (r0 == 0) goto L_0x054a
            android.widget.ImageView r0 = r15.f219650h
            r0.setVisibility(r10)
            goto L_0x054f
        L_0x054a:
            android.widget.ImageView r0 = r15.f219650h
            r0.setVisibility(r9)
        L_0x054f:
            android.content.Context r0 = r1.f24696e
            boolean r10 = r0 instanceof com.tencent.p014mm.p136ui.conversation.NewBizConversationUI
            if (r10 != 0) goto L_0x0566
            boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.conversation.ServiceNotifyConversationUI
            if (r0 == 0) goto L_0x055a
            goto L_0x0566
        L_0x055a:
            di3.d r0 = di3.C86312j.m106911c(r2)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r2 = r15.f219644b
            r0.mo106849z(r2, r4)
            goto L_0x0571
        L_0x0566:
            di3.d r0 = di3.C86312j.m106911c(r2)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r2 = r15.f219644b
            r0.mo106822J5(r2, r4)
        L_0x0571:
            boolean r0 = r1.f219609q
            if (r0 == 0) goto L_0x0795
            android.widget.TextView r0 = r15.f219649g
            r2 = 4
            r0.setVisibility(r2)
            android.view.View r0 = r15.f219654l
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r10.mo10233c(r11)
            java.lang.Object[] r20 = r10.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r22 = "handleShowTipCnt"
            java.lang.String r23 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r11 = 0
            java.lang.Object r10 = r10.mo10231a(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0.setVisibility(r10)
            java.lang.String r20 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r21 = "handleShowTipCnt"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r0 = r3.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85841l5(r0)
            if (r0 == 0) goto L_0x061c
            android.view.View r0 = r15.f219654l
            int r7 = r3.mo108786G2()
            if (r7 <= 0) goto L_0x05d1
            r11 = 0
            goto L_0x05d2
        L_0x05d1:
            r11 = 4
        L_0x05d2:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r2.mo10233c(r7)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r22 = "handleShowTipCnt"
            java.lang.String r23 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = 0
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r20 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r21 = "handleShowTipCnt"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            android.content.res.ColorStateList[] r2 = r1.f219607o
            r7 = 3
            r2 = r2[r7]
            r0.setTextColor((android.content.res.ColorStateList) r2)
            goto L_0x0795
        L_0x061c:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            boolean r10 = r5.f219637m
            if (r10 == 0) goto L_0x062c
            int r10 = r5.f219630f
            r11 = 1
            if (r10 != r11) goto L_0x062c
            android.content.res.ColorStateList[] r10 = r1.f219607o
            r10 = r10[r16]
            goto L_0x0631
        L_0x062c:
            android.content.res.ColorStateList[] r10 = r1.f219607o
            r11 = 3
            r10 = r10[r11]
        L_0x0631:
            r0.setTextColor((android.content.res.ColorStateList) r10)
            boolean r0 = r5.f219637m
            if (r0 == 0) goto L_0x0790
            int r0 = r5.f219629e
            if (r0 != 0) goto L_0x063e
            goto L_0x0790
        L_0x063e:
            java.lang.String r0 = r3.mo108782C2()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85841l5(r0)
            if (r0 == 0) goto L_0x069f
            android.content.Context r0 = r1.f24696e
            boolean r7 = r0 instanceof com.tencent.p014mm.p136ui.conversation.NewBizConversationUI
            if (r7 != 0) goto L_0x0795
            boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.conversation.ServiceNotifyConversationUI
            if (r0 == 0) goto L_0x0654
            goto L_0x0795
        L_0x0654:
            android.view.View r0 = r15.f219654l
            int r7 = r3.mo108786G2()
            if (r7 <= 0) goto L_0x065e
            r11 = 0
            goto L_0x065f
        L_0x065e:
            r11 = 4
        L_0x065f:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r2.mo10233c(r7)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r22 = "handleShowTipCnt"
            java.lang.String r23 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = 0
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r20 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r21 = "handleShowTipCnt"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0795
        L_0x069f:
            boolean r0 = r5.f219635k
            if (r0 == 0) goto L_0x06f2
            boolean r0 = r5.f219639o
            if (r0 == 0) goto L_0x06f2
            android.view.View r0 = r15.f219654l
            int r7 = r3.mo108786G2()
            if (r7 <= 0) goto L_0x06b1
            r11 = 0
            goto L_0x06b2
        L_0x06b1:
            r11 = 4
        L_0x06b2:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r2.mo10233c(r7)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r22 = "handleShowTipCnt"
            java.lang.String r23 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = 0
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r20 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r21 = "handleShowTipCnt"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0795
        L_0x06f2:
            boolean r0 = r5.f219634j
            if (r0 == 0) goto L_0x0744
            boolean r0 = r5.f219638n
            if (r0 == 0) goto L_0x0744
            android.view.View r0 = r15.f219654l
            int r7 = r3.mo108786G2()
            if (r7 <= 0) goto L_0x0704
            r11 = 0
            goto L_0x0705
        L_0x0704:
            r11 = 4
        L_0x0705:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r2.mo10233c(r7)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r22 = "handleShowTipCnt"
            java.lang.String r23 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = 0
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r20 = "com/tencent/mm/ui/conversation/ConversationAdapter"
            java.lang.String r21 = "handleShowTipCnt"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/Conversation;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ViewHolder;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ExtraBundle;Lcom/tencent/mm/ui/conversation/ConversationAdapter$ConversationItem;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0795
        L_0x0744:
            int r0 = r3.mo108786G2()
            r2 = 99
            if (r0 <= r2) goto L_0x0760
            android.widget.TextView r2 = r15.f219649g
            r2.setText(r7)
            android.widget.TextView r2 = r15.f219649g
            r7 = 2131755223(0x7f1000d7, float:1.914132E38)
            r2.setBackgroundResource(r7)
            android.widget.TextView r2 = r15.f219649g
            r7 = 0
            r2.setVisibility(r7)
            goto L_0x078b
        L_0x0760:
            if (r0 <= 0) goto L_0x078b
            android.widget.TextView r2 = r15.f219649g
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            int r7 = r3.mo108786G2()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r2.setText(r7)
            android.widget.TextView r2 = r15.f219649g
            android.content.Context r7 = r1.f24696e
            int r7 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r7, r0)
            r2.setBackgroundResource(r7)
            android.widget.TextView r2 = r15.f219649g
            r7 = 0
            r2.setVisibility(r7)
        L_0x078b:
            com.tencent.mm.ui.conversation.k$c r2 = r1.f219604D
            r2.f219622b = r0
            goto L_0x0795
        L_0x0790:
            java.lang.String r0 = "handle show tip count, but talker is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
        L_0x0795:
            boolean r0 = r5.f219632h
            if (r0 != 0) goto L_0x07b0
            boolean r0 = r5.f219633i
            if (r0 == 0) goto L_0x07b0
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x07b0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69770i0(r3)
        L_0x07b0:
            android.content.Context r0 = r1.f24696e
            boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.conversation.NewBizConversationUI
            r7 = -1
            r2 = 2131231818(0x7f08044a, float:1.8079728E38)
            if (r0 == 0) goto L_0x083b
            boolean r0 = r5.f219633i
            if (r0 == 0) goto L_0x083b
            long r10 = r3.mo108821o2()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x083b
            android.content.Context r0 = r1.f24696e
            android.content.res.Resources r0 = r0.getResources()
            r7 = 2131231344(0x7f080270, float:1.8078766E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r7)
            com.tencent.mm.ui.base.NoMeasuredTextView r7 = r15.f219645c
            float r7 = r7.getTextSize()
            int r7 = (int) r7
            r8 = 0
            r0.setBounds(r8, r8, r7, r7)
            go3.c r7 = new go3.c
            r10 = 1
            r7.<init>(r0, r10)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r6)
            r6 = 33
            r0.setSpan(r7, r8, r10, r6)
            com.tencent.mm.ui.base.NoMeasuredTextView r6 = r15.f219645c
            r7 = 3
            java.lang.CharSequence[] r7 = new java.lang.CharSequence[r7]
            java.lang.CharSequence r11 = r5.f219625a
            r7[r8] = r11
            java.lang.String r8 = " "
            r7[r10] = r8
            r7[r16] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r7)
            r6.setText((java.lang.CharSequence) r0)
            r6 = 2131300457(0x7f091069, float:1.8218944E38)
            android.view.View r0 = r12.findViewById(r6)
            r0.setBackgroundResource(r2)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.CharSequence r6 = r5.f219625a
            java.lang.String r6 = r6.toString()
            r2.append(r6)
            android.content.Context r6 = r1.f24696e
            r7 = 2131822777(0x7f1108b9, float:1.9278335E38)
            java.lang.String r6 = r6.getString(r7)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.setContentDescription(r2)
            r0 = 2131298045(0x7f0906fd, float:1.8214052E38)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r12.setTag(r0, r2)
            goto L_0x0871
        L_0x083b:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            java.lang.CharSequence r6 = r5.f219625a
            r0.setText((java.lang.CharSequence) r6)
            boolean r0 = r5.f219633i
            if (r0 == 0) goto L_0x085c
            long r10 = r3.mo108821o2()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x085c
            r6 = 2131300457(0x7f091069, float:1.8218944E38)
            android.view.View r0 = r12.findViewById(r6)
            r2 = 2131231817(0x7f080449, float:1.8079726E38)
            r0.setBackgroundResource(r2)
            goto L_0x0866
        L_0x085c:
            r6 = 2131300457(0x7f091069, float:1.8218944E38)
            android.view.View r0 = r12.findViewById(r6)
            r0.setBackgroundResource(r2)
        L_0x0866:
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            java.lang.CharSequence r2 = r5.f219625a
            java.lang.String r2 = r2.toString()
            r0.setContentDescription(r2)
        L_0x0871:
            com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r0.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r2 = r0.f154883d
            r6 = 1
            r2.f154885a = r6
            r0.publish()
            r2 = 7
            r6 = 0
            long r10 = g62.C45881a.m51165b(r3, r2, r6)
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x08b4
            java.lang.String r2 = r3.getUsername()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r6 = r0.f154884e
            java.lang.String r6 = r6.f154887a
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x08b4
            r2 = 6
            long r6 = r3.mo108821o2()
            long r6 = g62.C45881a.m51165b(r3, r2, r6)
            r3.mo101161T2(r6)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r2 = r2.mo105908w()
            java.lang.String r6 = r3.getUsername()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            r2.mo69773k0(r3, r6)
        L_0x08b4:
            dd0.b r2 = dd0.C75350g.m90357a()
            if (r2 == 0) goto L_0x08f1
            dd0.b r2 = dd0.C75350g.m90357a()
            java.lang.String r6 = r3.getUsername()
            sx2.j r2 = (sx2.C48497j) r2
            boolean r2 = r2.mo73129c(r6)
            if (r2 != 0) goto L_0x08cb
            goto L_0x08f1
        L_0x08cb:
            android.widget.ImageView r2 = r15.f219652j
            r6 = 0
            r2.setVisibility(r6)
            java.lang.String r2 = r3.getUsername()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
            java.lang.String r0 = r0.f154887a
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08e8
            android.widget.ImageView r0 = r15.f219652j
            r2 = 2131757030(0x7f1007e6, float:1.9144984E38)
            r0.setImageResource(r2)
            goto L_0x08f6
        L_0x08e8:
            android.widget.ImageView r0 = r15.f219652j
            r2 = 2131757029(0x7f1007e5, float:1.9144982E38)
            r0.setImageResource(r2)
            goto L_0x08f6
        L_0x08f1:
            android.widget.ImageView r0 = r15.f219652j
            r0.setVisibility(r9)
        L_0x08f6:
            android.widget.ImageView r0 = r15.f219653k
            com.tencent.p014mm.p136ui.conversation.C74720p.m89463B(r0, r3)
            android.widget.ImageView r0 = r15.f219651i
            com.tencent.p014mm.p136ui.conversation.C74720p.m89464C(r0, r3)
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            java.lang.CharSequence r0 = r0.getContentDescription()
            if (r0 == 0) goto L_0x0927
            com.tencent.mm.ui.base.NoMeasuredTextView r0 = r15.f219645c
            java.lang.CharSequence r0 = r0.getContentDescription()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0927
            com.tencent.mm.ui.conversation.k$c r0 = r1.f219604D
            com.tencent.mm.ui.base.NoMeasuredTextView r2 = r15.f219645c
            java.lang.CharSequence r2 = r2.getContentDescription()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.f219621a = r2
            goto L_0x0931
        L_0x0927:
            com.tencent.mm.ui.conversation.k$c r0 = r1.f219604D
            java.lang.CharSequence r2 = r5.f219625a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.f219621a = r2
        L_0x0931:
            com.tencent.mm.ui.conversation.k$c r0 = r1.f219604D
            java.lang.CharSequence r2 = r5.f219627c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.f219624d = r2
            com.tencent.mm.ui.conversation.k$c r0 = r1.f219604D
            java.lang.CharSequence r2 = r5.f219626b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.f219623c = r2
            com.tencent.mm.ui.conversation.k$c r0 = r1.f219604D
            r0.getClass()
            xi3.a r13 = xi3.C78844a.C15689b.f42385a
            java.lang.String r2 = r0.f219621a
            int r6 = r0.f219622b
            java.lang.String r7 = r0.f219623c
            java.lang.String r0 = r0.f219624d
            r14 = r12
            r8 = r15
            r15 = r2
            r16 = r6
            r17 = r7
            r18 = r0
            r13.mo108837b(r14, r15, r16, r17, r18)
            r1.mo70183u(r4, r8)
            boolean r0 = r5.f219633i
            r2 = r28
            r4 = 0
            r1.mo70218x(r3, r0, r2, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74697k.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        throw null;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105921e("MicroMsg.ConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        onNotifyChange((String) obj, (MStorageEventData) null);
    }

    /* renamed from: s */
    public C72976h2 mo1330d(C72976h2 h2Var, Cursor cursor) {
        if (h2Var == null) {
            h2Var = new C72976h2();
        }
        h2Var.mo108794O2("");
        h2Var.mo108795P2("");
        h2Var.convertFrom(cursor);
        return h2Var;
    }

    /* renamed from: t */
    public final String mo103861t(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str);
    }

    /* renamed from: u */
    public void mo70183u(String str, C74703f fVar) {
    }

    /* renamed from: w */
    public void mo70184w() {
    }

    /* renamed from: x */
    public void mo70218x(C72976h2 h2Var, boolean z, int i, boolean z2) {
    }

    /* renamed from: z */
    public CharSequence mo103862z(C72976h2 h2Var) {
        return h2Var.getStatus() == 1 ? this.f24696e.getString(C0966R.string.gmo) : h2Var.mo108821o2() == MAlarmHandler.NEXT_FIRE_INTERVAL ? "" : C72715f.m85112e(this.f24696e, h2Var.mo108821o2(), true);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        HashMap<String, C74701d> hashMap;
        Log.m105925i("MicroMsg.ConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", Boolean.valueOf(this.f219614v), Boolean.valueOf(this.f219615w), str);
        if (!Util.isNullOrNil(str) && (hashMap = this.f219608p) != null) {
            hashMap.remove(str);
        }
        if (this.f219614v) {
            Log.m105919d("MicroMsg.ConversationAdapter", "dkpno postTryNotify needNotify:%b timerStopped:%b", Boolean.valueOf(this.f219605E), Boolean.valueOf(this.f219606F.stopped()));
            this.f219605E = true;
            if (this.f219606F.stopped()) {
                MMHandlerThread.postToMainThread(new C74706l(this));
                return;
            }
            return;
        }
        this.f219615w = true;
    }
}
