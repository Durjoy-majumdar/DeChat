package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.view.View;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.e0 */
public class C72781e0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ Context f212142d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f212143e;

    public C72781e0(ChatFooter chatFooter, Context context) {
        this.f212143e = chatFooter;
        this.f212142d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009b, code lost:
        if (r1 != 3) goto L_0x02d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r8 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$l1.MODE_CANCEL
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            r9 = r20
            r1.add(r9)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$33"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r18
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            android.widget.Button r2 = r1.f211915p
            r10 = 0
            if (r0 == r2) goto L_0x003f
            r1 = 0
            java.lang.String r3 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$33"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r10
        L_0x003f:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r2 = r1.f211914o4
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$l1.MODE_VOICE
            r4 = 2131167370(0x7f07088a, float:1.7949012E38)
            if (r2 != r3) goto L_0x0067
            android.content.Context r2 = r1.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            android.content.Context r5 = r7.f212142d
            android.content.res.Resources r5 = r5.getResources()
            int r4 = r5.getDimensionPixelSize(r4)
            int r2 = r2 - r4
            android.content.Context r4 = r7.f212142d
            int r4 = com.tencent.p014mm.p136ui.C75054z4.m90004b(r4)
            int r2 = r2 - r4
            r1.f211934s3 = r2
            goto L_0x008a
        L_0x0067:
            android.content.Context r2 = r1.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            android.content.Context r5 = r7.f212142d
            android.content.res.Resources r5 = r5.getResources()
            int r4 = r5.getDimensionPixelSize(r4)
            int r2 = r2 - r4
            android.content.Context r4 = r7.f212142d
            int r4 = com.tencent.p014mm.p136ui.C75054z4.m90004b(r4)
            int r2 = r2 - r4
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r7.f212143e
            int r4 = r4.f211904m4
            int r2 = r2 + r4
            r1.f211934s3 = r2
        L_0x008a:
            int r1 = r20.getAction()
            r2 = 128(0x80, float:1.794E-43)
            r4 = 3
            r5 = 2
            java.lang.String r6 = "MicroMsg.NewVoice2txt"
            r11 = 1
            if (r1 == 0) goto L_0x0202
            if (r1 == r11) goto L_0x012d
            if (r1 == r5) goto L_0x009f
            if (r1 == r4) goto L_0x012d
            goto L_0x02d8
        L_0x009f:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            nj3.s0 r1 = r1.f211782L2
            if (r1 == 0) goto L_0x0125
            boolean r1 = r1.isShowing()
            if (r1 != 0) goto L_0x00ad
            goto L_0x0125
        L_0x00ad:
            float r1 = r20.getX()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e1
            float r1 = r20.getX()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r7.f212143e
            android.widget.Button r2 = r2.f211915p
            int r2 = r2.getWidth()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e1
            float r1 = r20.getRawY()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r7.f212143e
            int r4 = r2.f211934s3
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r0 = r2.f211914o4
            if (r0 == r3) goto L_0x02d8
            r2.f211920p4 = r0
            r2.f211914o4 = r3
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85257k(r2)
            goto L_0x02d8
        L_0x00e1:
            float r1 = r20.getX()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r7.f212143e
            int r3 = r2.f211939t3
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0118
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$l1.MODE_TRANS
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r2 = r2.f211914o4
            if (r1 == r2) goto L_0x02d8
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionSpeech2TextSnd
            android.content.Context r0 = r19.getContext()
            boolean r0 = r2.checkAvailable(r0)
            if (r0 != 0) goto L_0x010b
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            r0.f211914o4 = r8
            r0.f211920p4 = r8
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85257k(r0)
            goto L_0x02d8
        L_0x010b:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r2 = r0.f211914o4
            r0.f211920p4 = r2
            r0.f211914o4 = r1
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85257k(r0)
            goto L_0x02d8
        L_0x0118:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l1 r0 = r2.f211914o4
            if (r8 == r0) goto L_0x02d8
            r2.f211920p4 = r0
            r2.f211914o4 = r8
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85257k(r2)
            goto L_0x02d8
        L_0x0125:
            java.lang.String r0 = "window status err!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x02d8
        L_0x012d:
            java.lang.String r1 = "begin finishCutShortSentence."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.CutShortSentence r1 = r1.f211736A2
            monitor-enter(r1)
            com.tencent.mm.sdk.event.IListener r3 = r1.f282471a     // Catch:{ all -> 0x01ff }
            r3.dead()     // Catch:{ all -> 0x01ff }
            r1.mo134553c()     // Catch:{ all -> 0x01ff }
            monitor-exit(r1)     // Catch:{ all -> 0x01ff }
            java.lang.String r1 = "end finishCutShortSentence."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.c r1 = r1.f211750D2
            long r3 = java.lang.System.currentTimeMillis()
            r1.f207370e = r3
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.c r1 = r1.f211750D2
            float r3 = r20.getRawX()
            int r3 = (int) r3
            r1.f207371f = r3
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.c r1 = r1.f211750D2
            float r3 = r20.getRawY()
            int r3 = (int) r3
            r1.f207372g = r3
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.b r3 = r1.f211935s4
            if (r3 == 0) goto L_0x01df
            boolean r1 = r1.f211930r4
            if (r1 == 0) goto L_0x01df
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionSpeech2TextSnd
            android.content.Context r0 = r19.getContext()
            boolean r0 = r1.checkAvailable(r0)
            if (r0 != 0) goto L_0x01a0
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.widget.Button r0 = r0.f211915p
            r1 = 2131233433(0x7f080a99, float:1.8083003E38)
            r0.setBackgroundResource(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.widget.Button r0 = r0.f211915p
            r0.setEnabled(r11)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            boolean r1 = r0.f211774J2
            if (r1 == 0) goto L_0x0195
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85258l(r0)
        L_0x0195:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            nj3.s0 r0 = r0.f211957x0
            if (r0 == 0) goto L_0x02d8
            r0.dismiss()
            goto L_0x02d8
        L_0x01a0:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.b r0 = r0.f211935s4
            r0.f207363h = r10
            java.lang.Object[] r1 = new java.lang.Object[r11]
            boolean r3 = r0.f207364i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r10] = r3
            java.lang.String r3 = "MicroMsg.SceneVoiceInputAddr2"
            java.lang.String r4 = "reTrigger!!! canReTrigger: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            boolean r1 = r0.f207364i
            if (r1 == 0) goto L_0x01df
            md0.a r1 = r0.f207361f
            md0.b r1 = (md0.C99846b) r1
            boolean r1 = r1.mo139200q1()
            if (r1 == 0) goto L_0x01d2
            ob0.b0 r1 = f40.C86709a0.m107524d()
            md0.a r3 = r0.f207361f
            boolean r1 = r1.mo123461g(r3, r10)
            if (r1 != 0) goto L_0x01df
        L_0x01d2:
            r1 = 13
            r3 = 131(0x83, float:1.84E-43)
            r4 = -1
            com.tencent.mm.plugin.transvoice.model.a r5 = new com.tencent.mm.plugin.transvoice.model.a
            r5.<init>(r0, r1, r3, r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r5)
        L_0x01df:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x01f8
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r0.clearFlags(r2)
        L_0x01f8:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            r0.mo100342B0()
            goto L_0x02d8
        L_0x01ff:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ff }
            throw r0
        L_0x0202:
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r12 = r0
            aw.d r12 = (p447aw.C103918d) r12
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.app.Activity r13 = r0.f211821U1
            r15 = 80
            java.lang.String r14 = "android.permission.RECORD_AUDIO"
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            boolean r0 = r12.mo125788z1(r13, r14, r15, r16, r17)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r1[r10] = r3
            com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r1[r11] = r3
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r7.f212143e
            android.app.Activity r3 = r3.f211821U1
            r1[r5] = r3
            java.lang.String r3 = "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            if (r0 != 0) goto L_0x0247
            r1 = 0
            java.lang.String r3 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$33"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r10
        L_0x0247:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            r0.f207383r = r11
            wi3.C78603a.f230232b = r10
            long r3 = java.lang.System.currentTimeMillis()
            r0.f207367b = r3
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            float r1 = r20.getRawX()
            int r1 = (int) r1
            r0.f207368c = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.c r0 = r0.f211750D2
            float r1 = r20.getRawY()
            int r1 = (int) r1
            r0.f207369d = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            r1 = 0
            r0.f211741B2 = r1
            long r0 = java.lang.System.nanoTime()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f212143e
            md0.f r3 = new md0.f
            r3.<init>(r0)
            r1.f211741B2 = r3
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            com.tencent.mm.plugin.transvoice.model.CutShortSentence r1 = r0.f211736A2
            md0.f r0 = r0.f211741B2
            r1.mo134552b(r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x02a9
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r0.addFlags(r2)
        L_0x02a9:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.widget.Button r0 = r0.f211915p
            r1 = 2131234592(0x7f080f20, float:1.8085354E38)
            r0.setBackgroundResource(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.widget.Button r0 = r0.f211915p
            r1 = 2131823374(0x7f110b0e, float:1.9279546E38)
            r0.setText(r1)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            com.tencent.mm.pluginsdk.ui.chat.s0 r0 = r0.f211780L
            if (r0 == 0) goto L_0x02c6
            r0.mo100661w()
        L_0x02c6:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r7.f212143e
            android.widget.Button r1 = r0.f211915p
            android.content.Context r0 = r0.getContext()
            r2 = 2131823294(0x7f110abe, float:1.9279384E38)
            java.lang.String r0 = r0.getString(r2)
            r1.setContentDescription(r0)
        L_0x02d8:
            r1 = 1
            java.lang.String r3 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$33"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72781e0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
