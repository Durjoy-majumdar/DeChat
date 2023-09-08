package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import i61.C98602h;
import java.util.HashMap;
import kg3.C76577a;
import rb0.C48009v0;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.conversation.s */
public class C45003s extends C6975i1<C72976h2> {

    /* renamed from: D */
    public static long f122065D = 2000;

    /* renamed from: A */
    public final int f122066A;

    /* renamed from: B */
    public boolean f122067B = false;

    /* renamed from: C */
    public MTimerHandler f122068C = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C45004a(), false);

    /* renamed from: o */
    public String f122069o;

    /* renamed from: p */
    public String f122070p;

    /* renamed from: q */
    public ColorStateList[] f122071q = new ColorStateList[5];

    /* renamed from: r */
    public HashMap<String, C45005b> f122072r;

    /* renamed from: s */
    public MMSlideDelView.C73186f f122073s = MMSlideDelView.getItemStatusCallBack();

    /* renamed from: t */
    public float f122074t = -1.0f;

    /* renamed from: u */
    public float f122075u = -1.0f;

    /* renamed from: v */
    public float f122076v = -1.0f;

    /* renamed from: w */
    public boolean f122077w = false;

    /* renamed from: x */
    public boolean f122078x = false;

    /* renamed from: y */
    public String f122079y = "";

    /* renamed from: z */
    public final int f122080z;

    /* renamed from: com.tencent.mm.ui.conversation.s$a */
    public class C45004a implements MTimerHandler.CallBack {
        public C45004a() {
        }

        public boolean onTimerExpired() {
            C45003s sVar = C45003s.this;
            if (!sVar.f122067B) {
                return false;
            }
            MMHandlerThread.postToMainThread(new C45008t(sVar));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.s$b */
    public class C45005b {

        /* renamed from: a */
        public CharSequence f122082a;

        /* renamed from: b */
        public CharSequence f122083b;

        /* renamed from: c */
        public CharSequence f122084c;

        /* renamed from: d */
        public int f122085d;

        /* renamed from: e */
        public int f122086e;

        /* renamed from: f */
        public int f122087f;

        /* renamed from: g */
        public boolean f122088g;

        /* renamed from: h */
        public boolean f122089h;

        /* renamed from: i */
        public boolean f122090i;

        /* renamed from: j */
        public boolean f122091j;

        public C45005b(C45003s sVar, C45004a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.s$c */
    public static class C45006c {

        /* renamed from: a */
        public ImageView f122092a;

        /* renamed from: b */
        public NoMeasuredTextView f122093b;

        /* renamed from: c */
        public NoMeasuredTextView f122094c;

        /* renamed from: d */
        public NoMeasuredTextView f122095d;

        /* renamed from: e */
        public TextView f122096e;

        /* renamed from: f */
        public ImageView f122097f;

        /* renamed from: g */
        public View f122098g;
    }

    public C45003s(Context context, String str, C6975i1.C6977b bVar) {
        super(context, new C72976h2());
        this.f24699h = bVar;
        this.f122069o = str;
        try {
            this.f122070p = C48009v0.Fx0().mo72758TE(str);
        } catch (Throwable unused) {
        }
        this.f122072r = new HashMap<>();
        this.f122071q[0] = C76577a.m92154e(context, C0966R.color.f3563xt);
        this.f122071q[1] = C76577a.m92154e(context, C0966R.color.a4w);
        this.f122071q[3] = C76577a.m92154e(context, C0966R.color.a7f);
        this.f122071q[2] = C76577a.m92154e(context, C0966R.color.a4t);
        this.f122071q[2] = C76577a.m92154e(context, C0966R.color.a4t);
        this.f122071q[4] = C76577a.m92154e(context, C0966R.color.a1_);
        if (C76577a.m92148D(context)) {
            this.f122066A = context.getResources().getDimensionPixelSize(C0966R.dimen.f3673b3);
            this.f122080z = context.getResources().getDimensionPixelSize(C0966R.dimen.f3674b4);
        } else if (C76577a.m92147C(context)) {
            this.f122066A = context.getResources().getDimensionPixelSize(C0966R.dimen.f3672b2);
            this.f122080z = context.getResources().getDimensionPixelSize(C0966R.dimen.f3674b4);
        } else {
            this.f122066A = context.getResources().getDimensionPixelSize(C0966R.dimen.f3671b1);
            this.f122080z = context.getResources().getDimensionPixelSize(C0966R.dimen.f3675b5);
        }
        this.f122074t = (float) C76577a.m92157h(context, C0966R.dimen.f3927j7);
        this.f122075u = (float) C76577a.m92157h(context, C0966R.dimen.f3881hq);
        this.f122076v = (float) C76577a.m92157h(context, C0966R.dimen.f3964lm);
        C97625j3.m125812b().mo105908w().add(this);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72976h2 h2Var = (C72976h2) obj;
        if (h2Var == null) {
            h2Var = new C72976h2();
        }
        h2Var.mo108794O2("");
        h2Var.mo108795P2("");
        h2Var.convertFrom(cursor);
        return h2Var;
    }

    /* renamed from: g */
    public Cursor mo7992g() {
        return super.mo7992g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: android.text.SpannableStringBuilder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            r26 = this;
            r0 = r26
            java.lang.Class<d62.i> r1 = d62.C75339i.class
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            java.lang.Object r3 = r26.getItem(r27)
            com.tencent.mm.storage.h2 r3 = (com.tencent.p014mm.storage.C72976h2) r3
            java.lang.String r4 = r3.getUsername()
            r5 = 0
            if (r28 == 0) goto L_0x001a
            java.lang.Object r6 = r28.getTag()
            com.tencent.mm.ui.conversation.s$c r6 = (com.tencent.p014mm.p136ui.conversation.C45003s.C45006c) r6
            goto L_0x001b
        L_0x001a:
            r6 = r5
        L_0x001b:
            r7 = 8
            r8 = 5
            r9 = 4
            r10 = 1
            r11 = 0
            if (r28 == 0) goto L_0x002a
            if (r6 != 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            r12 = r28
            goto L_0x0184
        L_0x002a:
            com.tencent.mm.ui.conversation.s$c r6 = new com.tencent.mm.ui.conversation.s$c
            r6.<init>()
            android.content.Context r12 = r0.f24696e
            boolean r12 = kg3.C76577a.m92147C(r12)
            if (r12 == 0) goto L_0x0041
            android.content.Context r12 = r0.f24696e
            r13 = 2131493997(0x7f0c046d, float:1.861149E38)
            android.view.View r12 = android.view.View.inflate(r12, r13, r5)
            goto L_0x004a
        L_0x0041:
            android.content.Context r12 = r0.f24696e
            r13 = 2131493996(0x7f0c046c, float:1.8611488E38)
            android.view.View r12 = android.view.View.inflate(r12, r13, r5)
        L_0x004a:
            r13 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r6.f122092a = r13
            r13 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r13 = r12.findViewById(r13)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r13
            r6.f122093b = r13
            float r14 = r0.f122074t
            r13.mo153549i(r11, r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = r6.f122093b
            android.content.res.ColorStateList[] r14 = r0.f122071q
            r15 = 3
            r14 = r14[r15]
            r13.setTextColor((android.content.res.ColorStateList) r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = r6.f122093b
            r13.setShouldEllipsize(r10)
            r13 = 2131315971(0x7f094d03, float:1.825041E38)
            android.view.View r13 = r12.findViewById(r13)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r13
            r6.f122094c = r13
            float r14 = r0.f122076v
            r13.mo153549i(r11, r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = r6.f122094c
            android.content.res.ColorStateList[] r14 = r0.f122071q
            r14 = r14[r9]
            r13.setTextColor((android.content.res.ColorStateList) r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = r6.f122094c
            r13.setShouldEllipsize(r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = r6.f122094c
            r13.setGravity(r8)
            r13 = 2131306982(0x7f0929e6, float:1.8232178E38)
            android.view.View r13 = r12.findViewById(r13)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r13
            r6.f122095d = r13
            float r14 = r0.f122075u
            r13.mo153549i(r11, r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = r6.f122095d
            android.content.res.ColorStateList[] r14 = r0.f122071q
            r14 = r14[r11]
            r13.setTextColor((android.content.res.ColorStateList) r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r13 = r6.f122095d
            r13.setShouldEllipsize(r10)
            r13 = 2131315309(0x7f094a6d, float:1.8249068E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r6.f122096e = r13
            android.content.Context r14 = r0.f24696e
            int r14 = com.tencent.p014mm.p136ui.tools.C45081s1.m49932a(r14)
            r13.setBackgroundResource(r14)
            r13 = 2131306321(0x7f092751, float:1.8230838E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r6.f122097f = r13
            r13 = 2131297488(0x7f0904d0, float:1.8212922E38)
            android.view.View r13 = r12.findViewById(r13)
            r6.f122098g = r13
            r13 = 2131314937(0x7f0948f9, float:1.8248313E38)
            android.view.View r13 = r12.findViewById(r13)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r14)
            java.lang.Object[] r16 = r15.mo10232b()
            java.lang.String r17 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r18 = "getView"
            java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r14 = r13
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r8 = r8.mo10231a(r11)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r13.setVisibility(r8)
            java.lang.String r15 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r16 = "getView"
            java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            r8 = 2131308093(0x7f092e3d, float:1.8234432E38)
            android.view.View r8 = r12.findViewById(r8)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r13)
            java.lang.Object[] r14 = r15.mo10232b()
            java.lang.String r16 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r17 = "getView"
            java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r13 = r8
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8.setVisibility(r7)
            java.lang.String r14 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r15 = "getView"
            java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            r12.setTag(r6)
        L_0x0184:
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.s$b> r7 = r0.f122072r
            java.lang.Object r7 = r7.get(r4)
            com.tencent.mm.ui.conversation.s$b r7 = (com.tencent.p014mm.p136ui.conversation.C45003s.C45005b) r7
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            com.tencent.mm.storage.z1 r8 = r8.get(r4)
            java.lang.String r13 = ""
            r14 = -1
            if (r7 != 0) goto L_0x04ed
            com.tencent.mm.ui.conversation.s$b r7 = new com.tencent.mm.ui.conversation.s$b
            r7.<init>(r0, r5)
            if (r8 == 0) goto L_0x01aa
            long r9 = r8.f108320R1
            int r10 = (int) r9
            r7.f122086e = r10
            goto L_0x01ac
        L_0x01aa:
            r7.f122086e = r14
        L_0x01ac:
            if (r8 == 0) goto L_0x01b0
            r9 = 1
            goto L_0x01b1
        L_0x01b0:
            r9 = 0
        L_0x01b1:
            r7.f122091j = r9
            boolean r9 = eb0.C45628s0.m50746K(r8)
            r7.f122089h = r9
            int r9 = r3.mo108786G2()
            if (r9 <= 0) goto L_0x01c1
            r9 = 1
            goto L_0x01c2
        L_0x01c1:
            r9 = 0
        L_0x01c2:
            r7.f122090i = r9
            r7.f122087f = r11
            int r9 = r0.mo70312u(r3)
            r10 = 34
            java.lang.String r5 = ":"
            if (r9 != r10) goto L_0x0239
            int r9 = r3.mo108832y2()
            if (r9 != 0) goto L_0x0239
            java.lang.String r9 = r3.getContent()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0239
            java.lang.String r9 = r3.getContent()
            r17 = r12
            r11 = 0
            java.lang.String r10 = "\n"
            boolean r10 = r9.endsWith(r10)     // Catch:{ Exception -> 0x022b }
            if (r10 == 0) goto L_0x01fa
            int r10 = r9.length()     // Catch:{ Exception -> 0x022b }
            int r10 = r10 + r14
            r14 = 0
            java.lang.String r9 = r9.substring(r14, r10)     // Catch:{ Exception -> 0x022b }
        L_0x01fa:
            java.lang.String[] r9 = r9.split(r5)     // Catch:{ Exception -> 0x022b }
            int r14 = r9.length     // Catch:{ Exception -> 0x022b }
            r10 = 4
            if (r14 != r10) goto L_0x020d
            r10 = 0
            r18 = r9[r10]     // Catch:{ Exception -> 0x022b }
            boolean r18 = com.tencent.p014mm.storage.C72996z1.m85811N4(r18)     // Catch:{ Exception -> 0x022b }
            if (r18 == 0) goto L_0x020d
            r10 = 1
            goto L_0x020e
        L_0x020d:
            r10 = 0
        L_0x020e:
            int r14 = r9.length     // Catch:{ Exception -> 0x022b }
            if (r14 <= r10) goto L_0x0213
            r14 = r9[r10]     // Catch:{ Exception -> 0x022b }
        L_0x0213:
            int r14 = r9.length     // Catch:{ Exception -> 0x022b }
            int r15 = r10 + 1
            if (r14 <= r15) goto L_0x021d
            r14 = r9[r15]     // Catch:{ Exception -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Util.getLong(r14, r11)     // Catch:{ Exception -> 0x022b }
        L_0x021d:
            int r11 = r9.length     // Catch:{ Exception -> 0x022b }
            r12 = 2
            int r10 = r10 + r12
            if (r11 <= r10) goto L_0x0232
            r9 = r9[r10]     // Catch:{ Exception -> 0x022b }
            java.lang.String r10 = "1"
            boolean r10 = r9.equals(r10)     // Catch:{ Exception -> 0x022b }
            goto L_0x0233
        L_0x022b:
            java.lang.String r9 = "MicroMsg.VoiceContent"
            java.lang.String r10 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r10)
        L_0x0232:
            r10 = 0
        L_0x0233:
            if (r10 != 0) goto L_0x023b
            r9 = 1
            r7.f122087f = r9
            goto L_0x023b
        L_0x0239:
            r17 = r12
        L_0x023b:
            di3.d r10 = di3.C86312j.m106911c(r2)
            r11 = r10
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r12 = r0.f24696e
            di3.d r10 = di3.C86312j.m106911c(r1)
            d62.i r10 = (d62.C75339i) r10
            r14 = 0
            java.lang.String r8 = r10.As0(r8, r4, r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = r6.f122093b
            float r14 = r14.getTextSize()
            android.text.SpannableString r8 = r11.yp0(r12, r8, r14)
            r7.f122082a = r8
            java.lang.CharSequence r8 = r0.mo70311t(r3)
            r7.f122083b = r8
            com.tencent.mm.ui.base.NoMeasuredTextView r8 = r6.f122095d
            float r8 = r8.getTextSize()
            int r8 = (int) r8
            boolean r11 = r7.f122089h
            if (r11 == 0) goto L_0x0272
            boolean r11 = r7.f122090i
            if (r11 == 0) goto L_0x0272
            r15 = 1
            goto L_0x0273
        L_0x0272:
            r15 = 0
        L_0x0273:
            java.lang.String r11 = r3.mo108824r2()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r12 = " "
            r14 = -5569532(0xffffffffffab0404, float:NaN)
            r9 = 33
            if (r11 != 0) goto L_0x02c3
            int r11 = r3.mo108818l2()
            if (r11 <= 0) goto L_0x0290
            int r11 = r3.mo108786G2()
            if (r11 > 0) goto L_0x02c3
        L_0x0290:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            android.content.Context r5 = r0.f24696e
            r11 = 2131832641(0x7f112f41, float:1.9298342E38)
            java.lang.String r5 = r5.getString(r11)
            r1.<init>(r5)
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            r5.<init>(r14)
            int r11 = r1.length()
            r10 = 0
            r1.setSpan(r5, r10, r11, r9)
            android.text.SpannableStringBuilder r5 = r1.append(r12)
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r9 = r0.f24696e
            java.lang.String r11 = r3.mo108824r2()
            android.text.SpannableString r2 = r2.op0(r9, r11, r8)
            r5.append(r2)
            goto L_0x031d
        L_0x02c3:
            java.lang.String r11 = r3.mo108822p2()
            if (r11 == 0) goto L_0x02e5
            java.lang.String r10 = "<img src=\"original_label.png\"/>  "
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x02e5
            android.text.SpannableString r1 = new android.text.SpannableString
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r5 = r0.f24696e
            float r8 = (float) r8
            r9 = 0
            android.text.SpannableString r2 = r2.mo107070jH(r5, r11, r8, r9)
            r1.<init>(r2)
            goto L_0x031d
        L_0x02e5:
            int r11 = r0.mo70312u(r3)
            r10 = 47
            if (r11 == r10) goto L_0x02fd
            int r10 = r0.mo70312u(r3)
            r11 = 1048625(0x100031, float:1.469437E-39)
            if (r10 != r11) goto L_0x02f7
            goto L_0x02fd
        L_0x02f7:
            r24 = r4
            r23 = r6
            goto L_0x03be
        L_0x02fd:
            java.lang.String r10 = r3.mo108822p2()
            java.lang.String r10 = r0.mo70310s(r10)
            java.lang.String r11 = "]"
            java.lang.String r9 = "["
            if (r10 == 0) goto L_0x0323
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r10)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
        L_0x031d:
            r24 = r4
            r23 = r6
            goto L_0x04bb
        L_0x0323:
            java.lang.String r10 = r3.mo108822p2()
            java.lang.String r14 = ": "
            if (r10 == 0) goto L_0x0394
            java.lang.String r10 = r3.mo108822p2()
            boolean r10 = r10.contains(r5)
            if (r10 == 0) goto L_0x0394
            java.lang.String r10 = r3.mo108822p2()
            r23 = r6
            java.lang.String r6 = r3.mo108822p2()
            int r6 = r6.indexOf(r5)
            r24 = r4
            r4 = 0
            java.lang.String r6 = r10.substring(r4, r6)
            java.lang.String r4 = r3.mo108822p2()
            java.lang.String r10 = r3.mo108822p2()
            int r5 = r10.indexOf(r5)
            r10 = 1
            int r5 = r5 + r10
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r4 = r4.replace(r12, r13)
            java.lang.String r4 = r0.mo70310s(r4)
            if (r4 == 0) goto L_0x0399
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r4)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 == 0) goto L_0x0380
            goto L_0x04bb
        L_0x0380:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r14)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x04bb
        L_0x0394:
            r24 = r4
            r23 = r6
            r6 = r13
        L_0x0399:
            android.content.Context r4 = r0.f24696e
            r5 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r4 = r4.getString(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r5 == 0) goto L_0x03a9
            goto L_0x03bb
        L_0x03a9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            r5.append(r14)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L_0x03bb:
            r3.mo108794O2(r4)
        L_0x03be:
            java.lang.String r4 = r3.mo108822p2()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x042e
            java.lang.String r4 = r3.mo108823q2()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0429
            int r4 = r3.mo108832y2()
            if (r4 != 0) goto L_0x03f5
            java.lang.String r4 = r3.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
            if (r4 == 0) goto L_0x03f5
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            java.lang.String r4 = r3.mo108823q2()
            java.lang.String r5 = r3.getUsername()
            java.lang.String r1 = r1.mo62519pb(r4, r5)
            goto L_0x0403
        L_0x03f5:
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            java.lang.String r4 = r3.mo108823q2()
            java.lang.String r1 = r1.getDisplayName(r4)
        L_0x0403:
            java.lang.String r4 = r3.mo108822p2()     // Catch:{ Exception -> 0x0412 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0412 }
            r9 = 0
            r6[r9] = r1     // Catch:{ Exception -> 0x0412 }
            java.lang.String r1 = java.lang.String.format(r4, r6)     // Catch:{ Exception -> 0x0412 }
            goto L_0x0444
        L_0x0412:
            int r1 = r3.mo108832y2()
            java.lang.String r4 = r3.getUsername()
            java.lang.String r6 = r3.getContent()
            int r9 = r0.mo70312u(r3)
            android.content.Context r11 = r0.f24696e
            java.lang.String r1 = p875ci.C67379u.m79745j(r1, r4, r6, r9, r11)
            goto L_0x0444
        L_0x0429:
            java.lang.String r1 = r3.mo108822p2()
            goto L_0x0444
        L_0x042e:
            int r1 = r3.mo108832y2()
            java.lang.String r4 = r3.getUsername()
            java.lang.String r6 = r3.getContent()
            int r9 = r0.mo70312u(r3)
            android.content.Context r11 = r0.f24696e
            java.lang.String r1 = p875ci.C67379u.m79745j(r1, r4, r6, r9, r11)
        L_0x0444:
            r4 = 10
            r6 = 32
            java.lang.String r1 = r1.replace(r4, r6)
            int r4 = r3.mo108818l2()
            if (r4 <= 0) goto L_0x048d
            int r4 = r3.mo108786G2()
            if (r4 <= 0) goto L_0x048d
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            android.content.Context r6 = r0.f24696e
            r9 = 2131832632(0x7f112f38, float:1.9298323E38)
            java.lang.String r6 = r6.getString(r9)
            r4.<init>(r6)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r9 = -5569532(0xffffffffffab0404, float:NaN)
            r6.<init>(r9)
            int r9 = r4.length()
            r10 = 33
            r11 = 0
            r4.setSpan(r6, r11, r9, r10)
            android.text.SpannableStringBuilder r6 = r4.append(r12)
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r9 = r0.f24696e
            android.text.SpannableString r1 = r2.op0(r9, r1, r8)
            r6.append(r1)
            r1 = r4
            goto L_0x04bb
        L_0x048d:
            if (r15 == 0) goto L_0x04af
            int r4 = r3.mo108786G2()
            r5 = 1
            if (r4 <= r5) goto L_0x04af
            android.content.Context r4 = r0.f24696e
            r6 = 2131832635(0x7f112f3b, float:1.929833E38)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r11 = r3.mo108786G2()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10 = 0
            r9[r10] = r11
            r9[r5] = r1
            java.lang.String r1 = r4.getString(r6, r9)
        L_0x04af:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r4 = r0.f24696e
            android.text.SpannableString r1 = r2.op0(r4, r1, r8)
        L_0x04bb:
            r7.f122084c = r1
            int r1 = r3.getStatus()
            r2 = 1
            if (r1 == r2) goto L_0x04cd
            r2 = 5
            if (r1 == r2) goto L_0x04c9
            r1 = -1
            goto L_0x04d0
        L_0x04c9:
            r1 = 2131756708(0x7f1006a4, float:1.9144331E38)
            goto L_0x04d0
        L_0x04cd:
            r1 = 2131756709(0x7f1006a5, float:1.9144333E38)
        L_0x04d0:
            r7.f122085d = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            boolean r1 = r1.mo69754Z(r3)
            r7.f122088g = r1
            com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.s$b> r1 = r0.f122072r
            r2 = r24
            r1.put(r2, r7)
            goto L_0x04f2
        L_0x04ed:
            r2 = r4
            r23 = r6
            r17 = r12
        L_0x04f2:
            java.lang.CharSequence r1 = r7.f122083b
            if (r1 != 0) goto L_0x04fc
            java.lang.CharSequence r1 = r0.mo70311t(r3)
            r7.f122083b = r1
        L_0x04fc:
            boolean r1 = r7.f122089h
            if (r1 == 0) goto L_0x0511
            boolean r1 = r7.f122090i
            if (r1 == 0) goto L_0x0511
            r6 = r23
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            android.content.res.ColorStateList[] r4 = r0.f122071q
            r5 = 0
            r4 = r4[r5]
            r1.setTextColor((android.content.res.ColorStateList) r4)
            goto L_0x051e
        L_0x0511:
            r6 = r23
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            android.content.res.ColorStateList[] r4 = r0.f122071q
            int r5 = r7.f122087f
            r4 = r4[r5]
            r1.setTextColor((android.content.res.ColorStateList) r4)
        L_0x051e:
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            int r1 = r1.getWidth()
            p875ci.C67379u.f193255e = r1
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            float r1 = r1.getTextSize()
            int r1 = (int) r1
            p875ci.C67379u.f193256f = r1
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            android.text.TextPaint r1 = r1.getPaint()
            p875ci.C67379u.m79748m(r1)
            int r1 = r7.f122085d
            r4 = -1
            if (r1 == r4) goto L_0x054a
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r6.f122095d
            r4.setCompoundLeftDrawablesWithIntrinsicBounds((int) r1)
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            r4 = 1
            r1.setDrawLeftDrawable(r4)
            r4 = 0
            goto L_0x0550
        L_0x054a:
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            r4 = 0
            r1.setDrawLeftDrawable(r4)
        L_0x0550:
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122095d
            java.lang.CharSequence r5 = r7.f122084c
            r1.setText((java.lang.CharSequence) r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122093b
            r1.setDrawRightDrawable(r4)
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122093b
            java.lang.CharSequence r4 = r7.f122082a
            r1.setText((java.lang.CharSequence) r4)
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122094c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.CharSequence r4 = r7.f122083b
            int r4 = r4.length()
            r5 = 9
            if (r4 < r5) goto L_0x0581
            int r4 = r1.width
            int r5 = r0.f122066A
            if (r4 == r5) goto L_0x058e
            r1.width = r5
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r6.f122094c
            r4.setLayoutParams(r1)
            goto L_0x058e
        L_0x0581:
            int r4 = r1.width
            int r5 = r0.f122080z
            if (r4 == r5) goto L_0x058e
            r1.width = r5
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r6.f122094c
            r4.setLayoutParams(r1)
        L_0x058e:
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r6.f122094c
            java.lang.CharSequence r4 = r7.f122083b
            r1.setText((java.lang.CharSequence) r4)
            boolean r1 = r7.f122089h
            if (r1 == 0) goto L_0x05a0
            android.widget.ImageView r1 = r6.f122097f
            r4 = 0
            r1.setVisibility(r4)
            goto L_0x05a7
        L_0x05a0:
            android.widget.ImageView r1 = r6.f122097f
            r4 = 8
            r1.setVisibility(r4)
        L_0x05a7:
            java.lang.Class<ln.f> r1 = p196ln.C76705f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.f r1 = (p196ln.C76705f) r1
            android.widget.ImageView r4 = r6.f122092a
            r1.mo106849z(r4, r2)
            android.widget.TextView r1 = r6.f122096e
            r2 = 4
            r1.setVisibility(r2)
            android.view.View r1 = r6.f122098g
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r5)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            boolean r1 = r7.f122091j
            if (r1 == 0) goto L_0x0691
            int r1 = r7.f122086e
            if (r1 == 0) goto L_0x0691
            int r1 = r3.mo108786G2()
            boolean r4 = r7.f122089h
            if (r4 == 0) goto L_0x0652
            android.view.View r4 = r6.f122098g
            if (r1 <= 0) goto L_0x0612
            r9 = 0
            goto L_0x0613
        L_0x0612:
            r9 = 4
        L_0x0613:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r2)
            java.lang.Object[] r19 = r1.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r4
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.setVisibility(r1)
            java.lang.String r19 = "com/tencent/mm/ui/conversation/EnterpriseConversationAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0691
        L_0x0652:
            r2 = 99
            if (r1 <= r2) goto L_0x066a
            android.widget.TextView r1 = r6.f122096e
            r1.setText(r13)
            android.widget.TextView r1 = r6.f122096e
            r2 = 2131755223(0x7f1000d7, float:1.914132E38)
            r1.setBackgroundResource(r2)
            android.widget.TextView r1 = r6.f122096e
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x0691
        L_0x066a:
            if (r1 <= 0) goto L_0x0691
            android.widget.TextView r2 = r6.f122096e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r13)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r2.setText(r4)
            android.widget.TextView r2 = r6.f122096e
            android.content.Context r4 = r0.f24696e
            int r1 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r4, r1)
            r2.setBackgroundResource(r1)
            android.widget.TextView r1 = r6.f122096e
            r2 = 0
            r1.setVisibility(r2)
        L_0x0691:
            boolean r1 = r7.f122088g
            r2 = 2131300457(0x7f091069, float:1.8218944E38)
            if (r1 == 0) goto L_0x06af
            long r4 = r3.mo108821o2()
            r8 = -1
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x06af
            r12 = r17
            android.view.View r1 = r12.findViewById(r2)
            r2 = 2131231817(0x7f080449, float:1.8079726E38)
            r1.setBackgroundResource(r2)
            goto L_0x06bb
        L_0x06af:
            r12 = r17
            android.view.View r1 = r12.findViewById(r2)
            r2 = 2131231818(0x7f08044a, float:1.8079728E38)
            r1.setBackgroundResource(r2)
        L_0x06bb:
            xi3.a r20 = xi3.C78844a.C15689b.f42385a
            java.lang.CharSequence r1 = r7.f122082a
            java.lang.String r22 = java.lang.String.valueOf(r1)
            int r23 = r3.mo108786G2()
            java.lang.CharSequence r1 = r7.f122083b
            java.lang.String r24 = java.lang.String.valueOf(r1)
            java.lang.CharSequence r1 = r7.f122084c
            java.lang.String r25 = java.lang.String.valueOf(r1)
            r21 = r12
            r20.mo108837b(r21, r22, r23, r24, r25)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C45003s.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|3|4|5|6|7) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1333o() {
        /*
            r5 = this;
            r5.mo5580b()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = r5.f122069o     // Catch:{ all -> 0x0029 }
            rb0.i r2 = rb0.C48009v0.Ex0()     // Catch:{ all -> 0x001f }
            rb0.h r1 = r2.mo72749jo(r1)     // Catch:{ all -> 0x001f }
            te3.lf r2 = new te3.lf     // Catch:{ all -> 0x001f }
            r2.<init>()     // Catch:{ all -> 0x001f }
            byte[] r1 = r1.field_raw_attrs     // Catch:{ all -> 0x001f }
            r2.parseFrom(r1)     // Catch:{ all -> 0x001f }
            java.util.LinkedList<java.lang.String> r1 = r2.f137369e     // Catch:{ all -> 0x001f }
            goto L_0x0025
        L_0x001f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x0029 }
        L_0x0025:
            r0.addAll(r1)     // Catch:{ all -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            java.lang.String r1 = r5.f122070p
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L_0x0048
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            java.lang.String r4 = r5.f122069o
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            android.database.Cursor r0 = r1.mo69738I(r3, r0, r4, r2)
            r5.mo7998r(r0)
            goto L_0x0060
        L_0x0048:
            java.lang.String r1 = r5.f122070p
            r0.add(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            java.lang.String r4 = r5.f122069o
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            android.database.Cursor r0 = r1.mo69738I(r3, r0, r4, r2)
            r5.mo7998r(r0)
        L_0x0060:
            com.tencent.mm.ui.i1$b r0 = r5.f24699h
            if (r0 == 0) goto L_0x0068
            r1 = 0
            r0.mo1327a(r1)
        L_0x0068:
            r5.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C45003s.mo1333o():void");
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105921e("MicroMsg.EnterpriseConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        onNotifyChange((String) obj, (MStorageEventData) null);
    }

    /* renamed from: s */
    public final String mo70310s(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str);
    }

    /* renamed from: t */
    public CharSequence mo70311t(C72976h2 h2Var) {
        return h2Var.getStatus() == 1 ? this.f24696e.getString(C0966R.string.gmo) : h2Var.mo108821o2() == MAlarmHandler.NEXT_FIRE_INTERVAL ? "" : C72715f.m85112e(this.f24696e, h2Var.mo108821o2(), true);
    }

    /* renamed from: u */
    public int mo70312u(C72976h2 h2Var) {
        String B2 = h2Var.mo108781B2();
        if (B2 == null || B2.length() <= 0) {
            return 1;
        }
        try {
            return Integer.valueOf(B2).intValue();
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        HashMap<String, C45005b> hashMap;
        Log.m105925i("MicroMsg.EnterpriseConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", Boolean.valueOf(this.f122077w), Boolean.valueOf(this.f122078x), str);
        if (!Util.isNullOrNil(str) && (hashMap = this.f122072r) != null) {
            hashMap.remove(str);
        }
        if (this.f122077w) {
            Log.m105919d("MicroMsg.EnterpriseConversationAdapter", "dkpno postTryNotify needNotify:%b timerStopped:%b", Boolean.valueOf(this.f122067B), Boolean.valueOf(this.f122068C.stopped()));
            this.f122067B = true;
            if (this.f122068C.stopped()) {
                MMHandlerThread.postToMainThread(new C45008t(this));
                return;
            }
            return;
        }
        this.f122078x = true;
    }
}
