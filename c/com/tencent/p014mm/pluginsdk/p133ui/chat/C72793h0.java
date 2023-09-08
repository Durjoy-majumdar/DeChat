package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.h0 */
public class C72793h0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212184d;

    public C72793h0(ChatFooter chatFooter) {
        this.f212184d = chatFooter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x08dc, code lost:
        if (r4 == r1) goto L_0x094d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0948, code lost:
        if (1 != ((lc3.C10485b) f40.C86709a0.m107533q(r10)).vh0().mo107404b("AndroidTransVoice2TxtBlurSwitch", 1)) goto L_0x094b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        if (r0 != 3) goto L_0x0a2c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x08d8  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0950  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0959  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x095c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x096b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x09ac  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x09b1  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x09e3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0a17  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r26, android.view.MotionEvent r27) {
        /*
            r25 = this;
            r7 = r25
            r0 = r26
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r1 r8 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$r1.MODE_CANCEL
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r1 r9 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$r1.MODE_TRANS
            java.lang.Class<lc3.b> r10 = lc3.C10485b.class
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r11 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$q1.MODE_BLUR
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            r12 = r27
            r1.add(r12)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r25
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            android.widget.Button r1 = r1.f211915p
            r13 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            if (r0 == r1) goto L_0x0049
            r1 = 0
            java.lang.String r3 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r25
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r13
        L_0x0049:
            int r0 = r27.getAction()
            r3 = 128(0x80, float:1.794E-43)
            r4 = 3
            java.lang.String r5 = "MicroMsg.RcdBtnEvent"
            r14 = 1
            r15 = 2
            if (r0 == 0) goto L_0x07c1
            if (r0 == r14) goto L_0x074f
            if (r0 == r15) goto L_0x005e
            if (r0 == r4) goto L_0x074f
            goto L_0x0a2c
        L_0x005e:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            nj3.s0 r0 = r0.f211957x0
            if (r0 == 0) goto L_0x0735
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x006c
            goto L_0x0735
        L_0x006c:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            boolean r3 = r0.f211842Z0
            r10 = 8
            r1 = 0
            if (r3 == 0) goto L_0x059a
            android.view.View r3 = r0.f211890j2
            if (r3 == 0) goto L_0x007d
            android.view.View r6 = r0.f211923q2
            if (r6 != 0) goto L_0x008a
        L_0x007d:
            java.lang.Object[] r6 = new java.lang.Object[r15]
            r6[r13] = r3
            android.view.View r0 = r0.f211923q2
            r6[r14] = r0
            java.lang.String r0 = "[arthurdan.initRcdBtn] Notice!!! voice2txtRealHintArea is %s, voice2txtOpeLayout is %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r6)
        L_0x008a:
            float r0 = r27.getX()
            r13 = 200(0xc8, double:9.9E-322)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ed
            float r0 = r27.getY()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r7.f212184d
            int r6 = r6.f211742B3
            int r6 = -r6
            int r6 = r6 / r4
            float r6 = (float) r6
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ed
            float r0 = r27.getX()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r7.f212184d
            android.widget.Button r6 = r6.f211915p
            int r6 = r6.getWidth()
            float r6 = (float) r6
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ed
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s1 r0 = r0.f211754E2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s1 r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$s1.MODE_HINT_1
            if (r0 == r4) goto L_0x0a2c
            java.lang.String r0 = "active MODE_HINT_1."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            r0.f211754E2 = r4
            boolean r4 = r0.f211766H2
            if (r4 == 0) goto L_0x0a2c
            android.view.View r0 = r0.f211928r2
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211943u2
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r4 = r0.f211758F2
            if (r11 != r4) goto L_0x0132
            com.tencent.mm.ui.blur.BlurView r0 = r0.f211885i2
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.ui.blur.BlurView r0 = r0.f211885i2
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            r3 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            r0.start()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.ui.blur.BlurView r3 = r0.f211885i2
            android.content.res.Resources r0 = r0.getResources()
            r4 = 2131101716(0x7f060814, float:1.781585E38)
            int r0 = r0.getColor(r4)
            r3.mo101977b(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.app.Activity r0 = r0.f211821U1
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            tj3.d r4 = r3.f215140d
            r4.mo89125j(r0)
            tj3.e r0 = new tj3.e
            r4 = 1
            r0.<init>(r3, r4)
            r3.post(r0)
            goto L_0x013a
        L_0x0132:
            android.view.View r0 = r0.f211890j2
            r3 = 2131235426(0x7f081262, float:1.8087046E38)
            r0.setBackgroundResource(r3)
        L_0x013a:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            nj3.s0 r0 = r0.f211746C2
            android.view.View r0 = r0.getContentView()
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r13)
            r0.start()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211907n2
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r19 = "onTouch"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r18 = "onTouch"
            java.lang.String r19 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.widget.TextView r0 = r0.f211912o2
            r0.setVisibility(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211923q2
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r19 = "onTouch"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r18 = "onTouch"
            java.lang.String r19 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r1 r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$r1.MODE_INVALID
            r0.f211762G2 = r1
            r0.mo100435n0()
            goto L_0x0a2c
        L_0x01ed:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s1 r6 = r0.f211754E2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s1 r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$s1.MODE_HINT_2
            if (r6 == r1) goto L_0x0488
            java.lang.String r0 = "active MODE_HINT_2."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            r0.f211754E2 = r1
            boolean r1 = r0.f211766H2
            if (r1 != 0) goto L_0x0206
            r1 = 1
            r0.f211766H2 = r1
            goto L_0x0207
        L_0x0206:
            r1 = 1
        L_0x0207:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            float r4 = r27.getRawX()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r6 = 0
            r0[r6] = r4
            float r4 = r27.getX()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0[r1] = r4
            int r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211730E4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r15] = r1
            java.lang.String r1 = "init rx: %f, x: %f, shw: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            float r0 = r27.getRawX()
            int r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211730E4
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0240
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            r0.f211762G2 = r9
            java.lang.String r0 = "init MODE_TRANS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0249
        L_0x0240:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            r0.f211762G2 = r8
            java.lang.String r0 = "init MODE_CANCEL"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0249:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r1 = r0.f211758F2
            if (r11 != r1) goto L_0x0264
            com.tencent.mm.ui.blur.BlurView r0 = r0.f211885i2
            r1 = 0
            r0.mo101977b(r1)
            tj3.d r4 = r0.f215140d
            r5 = 0
            r4.mo89125j(r5)
            tj3.e r4 = new tj3.e
            r4.<init>(r0, r1)
            r0.post(r4)
            goto L_0x026a
        L_0x0264:
            r1 = 0
            android.view.View r0 = r0.f211890j2
            r0.setBackgroundColor(r1)
        L_0x026a:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            nj3.s0 r0 = r0.f211746C2
            android.view.View r0 = r0.getContentView()
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r13)
            r0.start()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211907n2
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r4)
            java.lang.Object[] r18 = r1.mo10232b()
            java.lang.String r19 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r20 = "onTouch"
            java.lang.String r21 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r19 = "onTouch"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.widget.TextView r0 = r0.f211912o2
            r1 = 0
            r0.setVisibility(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211923q2
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r2)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211928r2
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r2)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211943u2
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r2)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211928r2
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r1.mo10233c(r4)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setAlpha"
            java.lang.String r15 = "(F)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211943u2
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.mo10233c(r2)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setAlpha"
            java.lang.String r15 = "(F)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211928r2
            android.view.ViewPropertyAnimator r0 = r0.animate()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            r1.getClass()
            r1 = 0
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r7.f212184d
            int r2 = r2.f211892j4
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r0 = r0.translationY(r2)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r3)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r3)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            r4 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r7.f212184d
            java.lang.Runnable r2 = r2.f211896k4
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r2)
            r0.start()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211943u2
            android.view.ViewPropertyAnimator r0 = r0.animate()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r7.f212184d
            r2.getClass()
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            int r1 = r1.f211892j4
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r3)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r3)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r4)
            r0.start()
            goto L_0x0a2c
        L_0x0488:
            boolean r0 = r0.f211770I2
            if (r0 == 0) goto L_0x0a2c
            java.lang.Object[] r0 = new java.lang.Object[r4]
            float r1 = r27.getRawX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r27.getX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211730E4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r15] = r1
            java.lang.String r1 = "active rx: %f, x: %f, shw: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            float r0 = r27.getRawX()
            int r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211730E4
            float r1 = (float) r1
            r10 = 100
            r2 = 2131235427(0x7f081263, float:1.8087048E38)
            r4 = 2131101719(0x7f060817, float:1.7815856E38)
            r6 = 2131100173(0x7f06020d, float:1.781272E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x052b
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r1 r0 = r0.f211762G2
            if (r9 == r0) goto L_0x052b
            java.lang.String r0 = "active MODE_TRANS."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            r0.f211762G2 = r9
            android.widget.TextView r1 = r0.f211912o2
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131838447(0x7f1145ef, float:1.9310118E38)
            java.lang.CharSequence r0 = r0.getText(r5)
            r1.setText(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85259m(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f211933s2
            android.content.res.Resources r5 = r0.getResources()
            int r5 = r5.getColor(r6)
            r1.setIconColor(r5)
            android.widget.TextView r1 = r0.f211938t2
            android.content.res.Resources r5 = r0.getResources()
            int r4 = r5.getColor(r4)
            r1.setTextColor(r4)
            android.view.View r1 = r0.f211928r2
            android.content.res.Resources r4 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r2)
            r1.setBackgroundDrawable(r2)
            android.view.View r0 = r0.f211928r2
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r3)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r3)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r10)
            r0.start()
            goto L_0x0a2c
        L_0x052b:
            float r0 = r27.getRawX()
            int r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211730E4
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0a2c
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r1 r0 = r0.f211762G2
            if (r8 == r0) goto L_0x0a2c
            java.lang.String r0 = "active MODE_CANCEL."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            r0.f211762G2 = r8
            android.widget.TextView r1 = r0.f211912o2
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131838443(0x7f1145eb, float:1.931011E38)
            java.lang.CharSequence r0 = r0.getText(r5)
            r1.setText(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85260n(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f211948v2
            android.content.res.Resources r5 = r0.getResources()
            int r5 = r5.getColor(r6)
            r1.setIconColor(r5)
            android.widget.TextView r1 = r0.f211953w2
            android.content.res.Resources r5 = r0.getResources()
            int r4 = r5.getColor(r4)
            r1.setTextColor(r4)
            android.view.View r1 = r0.f211943u2
            android.content.res.Resources r4 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r2)
            r1.setBackgroundDrawable(r2)
            android.view.View r0 = r0.f211943u2
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r3)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r3)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r10)
            r0.start()
            goto L_0x0a2c
        L_0x059a:
            android.view.View r1 = r0.f211800Q0
            if (r1 == 0) goto L_0x05a2
            android.view.View r3 = r0.f211815T0
            if (r3 != 0) goto L_0x05b1
        L_0x05a2:
            java.lang.Object[] r3 = new java.lang.Object[r15]
            r4 = 0
            r3[r4] = r1
            android.view.View r0 = r0.f211815T0
            r1 = 1
            r3[r1] = r0
            java.lang.String r0 = "[arthurdan.initRcdBtn] Notice!!! rcdAnimArea is %s, rcdCancelArea is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r3)
        L_0x05b1:
            float r0 = r27.getX()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0678
            float r0 = r27.getY()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            int r1 = r1.f211742B3
            int r1 = -r1
            int r1 = r1 / r15
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0678
            float r0 = r27.getX()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            android.widget.Button r1 = r1.f211915p
            int r1 = r1.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0678
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211800Q0
            if (r0 == 0) goto L_0x0620
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r19 = "onTouch"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r18 = "onTouch"
            java.lang.String r19 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0620:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r1 = r0.f211815T0
            if (r1 == 0) goto L_0x0a2c
            android.widget.Button r0 = r0.f211915p
            r1 = 2131823374(0x7f110b0e, float:1.9279546E38)
            r0.setText(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211815T0
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r19 = "onTouch"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r18 = "onTouch"
            java.lang.String r19 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0a2c
        L_0x0678:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211800Q0
            if (r0 == 0) goto L_0x06c2
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r3)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r19 = "onTouch"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r18 = "onTouch"
            java.lang.String r19 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x06c2:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r1 = r0.f211815T0
            if (r1 == 0) goto L_0x0a2c
            android.widget.Button r1 = r0.f211915p
            android.content.Context r0 = r0.getContext()
            r3 = 2131165591(0x7f070197, float:1.7945403E38)
            int r0 = kg3.C76577a.m92155f(r0, r3)
            float r0 = (float) r0
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r7.f212184d
            android.content.Context r3 = r3.getContext()
            float r3 = kg3.C76577a.m92161l(r3)
            float r0 = r0 * r3
            r3 = 0
            r1.setTextSize(r3, r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.widget.Button r0 = r0.f211915p
            r1 = 2131823356(0x7f110afc, float:1.927951E38)
            r0.setText(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.view.View r0 = r0.f211815T0
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r1.mo10233c(r2)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0a2c
        L_0x0735:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            nj3.s0 r0 = r0.f211957x0
            if (r0 != 0) goto L_0x0740
            r0 = 1
            goto L_0x0741
        L_0x0740:
            r0 = 0
        L_0x0741:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "hint window status err, window is null: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r1)
            goto L_0x0a2c
        L_0x074f:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.CutShortSentence r1 = r0.f211736A2
            monitor-enter(r1)
            com.tencent.mm.sdk.event.IListener r0 = r1.f282471a     // Catch:{ all -> 0x07be }
            r0.dead()     // Catch:{ all -> 0x07be }
            r1.mo134553c()     // Catch:{ all -> 0x07be }
            monitor-exit(r1)     // Catch:{ all -> 0x07be }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0776
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r0.clearFlags(r3)
        L_0x0776:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            long r1 = java.lang.System.currentTimeMillis()
            r0.f207370e = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            float r1 = r27.getRawX()
            int r1 = (int) r1
            r0.f207371f = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            float r1 = r27.getRawY()
            int r1 = (int) r1
            r0.f207372g = r1
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211729D4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "enter on MotionEvent.ACTION_UP/ACTION_CANCEL:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            r1.mo100342B0()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211729D4
            int r4 = r4 + r0
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211729D4 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            goto L_0x0a2c
        L_0x07be:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x07be }
            throw r0
        L_0x07c1:
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r16 = r0
            aw.d r16 = (p447aw.C103918d) r16
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.app.Activity r0 = r0.f211821U1
            r19 = 80
            java.lang.String r18 = "android.permission.RECORD_AUDIO"
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            r17 = r0
            boolean r0 = r16.mo125788z1(r17, r18, r19, r20, r21)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r4 = 0
            r1[r4] = r2
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r4 = 1
            r1[r4] = r2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r7.f212184d
            android.app.Activity r2 = r2.f211821U1
            r1[r15] = r2
            java.lang.String r2 = "MicroMsg.ChatFooter"
            java.lang.String r4 = "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            if (r0 != 0) goto L_0x080e
            r1 = 0
            java.lang.String r3 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r25
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            r0 = 0
            return r0
        L_0x080e:
            r0 = 0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.f211729D4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r0] = r1
            java.lang.String r1 = "on MotionEvent.ACTION_DOWN:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r2)
            wi3.C78603a.f230232b = r0
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            long r1 = java.lang.System.currentTimeMillis()
            r0.f207367b = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            float r1 = r27.getRawX()
            int r1 = (int) r1
            r0.f207368c = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            float r1 = r27.getRawY()
            int r1 = (int) r1
            r0.f207369d = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            r0.getClass()
            int r1 = i13.C76259g.f223395Q0
            r2 = -1
            if (r2 == r1) goto L_0x0854
            r4 = 1
            if (r4 != r1) goto L_0x0850
            r1 = 1
            goto L_0x0851
        L_0x0850:
            r1 = 0
        L_0x0851:
            r0.f211842Z0 = r1
            goto L_0x085d
        L_0x0854:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r1 == 0) goto L_0x0860
            r1 = 0
            r0.f211842Z0 = r1
        L_0x085d:
            r4 = 1
            goto L_0x08d2
        L_0x0860:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r15) goto L_0x0872
            r1 = 1
            goto L_0x0873
        L_0x0872:
            r1 = 0
        L_0x0873:
            if (r1 == 0) goto L_0x0879
            r1 = 0
            r0.f211842Z0 = r1
            goto L_0x085d
        L_0x0879:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r1)
            java.lang.String r4 = "zh_CN"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x08a8
            java.lang.String r4 = "zh_HK"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x08a8
            java.lang.String r4 = "zh_TW"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x08a8
            java.lang.String r4 = "en"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x08a8
            r1 = 0
            r0.f211842Z0 = r1
            goto L_0x085d
        L_0x08a8:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 != 0) goto L_0x08cf
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r1 != 0) goto L_0x08cf
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x08b5
            goto L_0x08cf
        L_0x08b5:
            k40.a r1 = f40.C86709a0.m107533q(r10)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "NewVoiceInputOpenSwitch"
            r6 = 0
            int r1 = r1.mo107404b(r4, r6)
            r4 = 1
            if (r4 != r1) goto L_0x08cb
            r1 = 1
            goto L_0x08cc
        L_0x08cb:
            r1 = 0
        L_0x08cc:
            r0.f211842Z0 = r1
            goto L_0x08d2
        L_0x08cf:
            r4 = 1
            r0.f211842Z0 = r4
        L_0x08d2:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            boolean r1 = r0.f211747C3
            if (r1 != 0) goto L_0x0952
            int r1 = h13.C76096b.f223007b
            if (r2 == r1) goto L_0x08df
            if (r4 != r1) goto L_0x094b
            goto L_0x094d
        L_0x08df:
            java.lang.String r1 = p156gj.C87203t.m108275k()
            java.lang.String r2 = "getModel()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            r2[r4] = r1
            java.lang.String r4 = "MicroMsg.TransVoiceUtils"
            java.lang.String r6 = "pennqin, model: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r2)
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_blur_black_list
            java.lang.String r8 = ""
            java.lang.String r2 = r2.Y60(r6, r8)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 != 0) goto L_0x092e
            java.lang.String r6 = "disableDeviceInfo"
            gy3.C87412m.m108593f(r2, r6)
            r6 = 0
            boolean r8 = z04.C112550d0.m153801u(r2, r1, r6)
            if (r8 == 0) goto L_0x092e
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r6] = r1
            r1 = 1
            r8[r1] = r2
            java.lang.String r1 = "model %s is hit, expt: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r8)
            goto L_0x094b
        L_0x092e:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 != 0) goto L_0x094d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x0937
            goto L_0x094d
        L_0x0937:
            k40.a r1 = f40.C86709a0.m107533q(r10)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "AndroidTransVoice2TxtBlurSwitch"
            r4 = 1
            int r1 = r1.mo107404b(r2, r4)
            if (r4 != r1) goto L_0x094b
            goto L_0x094d
        L_0x094b:
            r1 = 0
            goto L_0x094e
        L_0x094d:
            r1 = 1
        L_0x094e:
            if (r1 == 0) goto L_0x0952
            r1 = 1
            goto L_0x0953
        L_0x0952:
            r1 = 0
        L_0x0953:
            if (r1 == 0) goto L_0x095c
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r2 = r0.f211758F2
            if (r11 == r2) goto L_0x095c
            r0.f211758F2 = r11
            goto L_0x0966
        L_0x095c:
            if (r1 != 0) goto L_0x0968
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$q1.MODE_NORMAL
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r2 = r0.f211758F2
            if (r1 == r2) goto L_0x0968
            r0.f211758F2 = r1
        L_0x0966:
            r0 = 1
            goto L_0x0969
        L_0x0968:
            r0 = 0
        L_0x0969:
            if (r0 == 0) goto L_0x098c
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            nj3.s0 r1 = r0.f211957x0
            if (r1 == 0) goto L_0x098c
            r1 = 0
            r0.f211957x0 = r1
            com.tencent.mm.ui.blur.BlurView r0 = r0.f211885i2
            if (r0 == 0) goto L_0x097f
            tj3.d r0 = r0.getBlurController()
            r0.destroy()
        L_0x097f:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.ui.blur.BlurView r0 = r0.f211965y2
            if (r0 == 0) goto L_0x098c
            tj3.d r0 = r0.getBlurController()
            r0.destroy()
        L_0x098c:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            boolean r1 = r1.f211842Z0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q1 r1 = r1.f211758F2
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "trans voice opener: %s, blur mode opener: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            boolean r1 = r0.f211842Z0
            if (r1 == 0) goto L_0x09b1
            com.tencent.mm.plugin.transvoice.model.c r1 = r0.f211750D2
            r1.f207383r = r2
            goto L_0x09b6
        L_0x09b1:
            com.tencent.mm.plugin.transvoice.model.c r1 = r0.f211750D2
            r2 = 0
            r1.f207383r = r2
        L_0x09b6:
            r1 = 0
            r0.f211741B2 = r1
            long r0 = java.lang.System.nanoTime()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212184d
            md0.f r2 = new md0.f
            r2.<init>(r0)
            r1.f211741B2 = r2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.plugin.transvoice.model.CutShortSentence r1 = r0.f211736A2
            md0.f r0 = r0.f211741B2
            r1.mo134552b(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x09f2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r0.addFlags(r3)
        L_0x09f2:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            boolean r1 = r0.f211846a1
            if (r1 != 0) goto L_0x0a2c
            boolean r1 = r0.f211850b1
            if (r1 != 0) goto L_0x0a2c
            r1 = 1
            r0.f211846a1 = r1
            android.widget.Button r0 = r0.f211915p
            r1 = 2131234592(0x7f080f20, float:1.8085354E38)
            r0.setBackgroundResource(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.widget.Button r0 = r0.f211915p
            r1 = 2131823374(0x7f110b0e, float:1.9279546E38)
            r0.setText(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            com.tencent.mm.pluginsdk.ui.chat.s0 r0 = r0.f211780L
            if (r0 == 0) goto L_0x0a1a
            r0.mo100661w()
        L_0x0a1a:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212184d
            android.widget.Button r1 = r0.f211915p
            android.content.Context r0 = r0.getContext()
            r2 = 2131823294(0x7f110abe, float:1.9279384E38)
            java.lang.String r0 = r0.getString(r2)
            r1.setContentDescription(r0)
        L_0x0a2c:
            r1 = 1
            java.lang.String r3 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$35"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r25
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72793h0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
