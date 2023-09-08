package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ModNewContactEvent;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import fy0.C8219i;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardItem */
public abstract class BizTLRecCardItem extends C18366u2 {

    /* renamed from: d */
    public final Context f50309d;

    /* renamed from: e */
    public final C18508z2 f50310e;

    /* renamed from: f */
    public ImageView f50311f;

    /* renamed from: g */
    public TextView f50312g;

    /* renamed from: h */
    public TextView f50313h;

    /* renamed from: i */
    public View f50314i;

    /* renamed from: j */
    public View f50315j;

    /* renamed from: k */
    public View f50316k;

    /* renamed from: l */
    public TextView f50317l;

    /* renamed from: m */
    public Button f50318m;

    /* renamed from: n */
    public TextView f50319n;

    /* renamed from: o */
    public final WeakReference<Context> f50320o;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem$IListenerImpl;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ModNewContactEvent;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem;", "ref", "<init>", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem;)V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardItem$IListenerImpl */
    public static final class IListenerImpl extends IListener<ModNewContactEvent> {

        /* renamed from: d */
        public final WeakReference<BizTLRecCardItem> f50321d;

        /* renamed from: e */
        public String f50322e = "";

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IListenerImpl(BizTLRecCardItem bizTLRecCardItem) {
            super(C40008f.f107254d);
            C87412m.m108594g(bizTLRecCardItem, "ref");
            this.f50321d = new WeakReference<>(bizTLRecCardItem);
        }

        public boolean callback(IEvent iEvent) {
            BizTLRecCardItem bizTLRecCardItem;
            ModNewContactEvent modNewContactEvent = (ModNewContactEvent) iEvent;
            C87412m.m108594g(modNewContactEvent, "event");
            WeakReference<BizTLRecCardItem> weakReference = this.f50321d;
            if (weakReference == null || weakReference.get() == null || !C87412m.m108589b(this.f50322e, modNewContactEvent.f193738d.f193739a) || (bizTLRecCardItem = this.f50321d.get()) == null) {
                return true;
            }
            TextView textView = bizTLRecCardItem.f50319n;
            if (textView != null) {
                textView.setVisibility(0);
                return true;
            }
            C87412m.m108603p("followAlready");
            throw null;
        }
    }

    public BizTLRecCardItem(Context context, C18508z2 z2Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
        this.f50309d = context;
        this.f50310e = z2Var;
        this.f50320o = new WeakReference<>(context);
        new IListenerImpl(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0290  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22815a(com.tencent.p014mm.storage.C19623o0 r23, int r24, android.view.View r25, android.view.View r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r10 = r25
            r2 = r26
            java.lang.String r3 = "info"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "convertView"
            gy3.C87412m.m108594g(r10, r3)
            java.lang.String r3 = "parent"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1149(0x47d, double:5.677E-321)
            r14 = 2
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            r0.mo22816h(r2)
            te3.me4 r2 = r23.mo25773w2()
            r11 = 0
            if (r2 == 0) goto L_0x0032
            te3.oe4 r2 = r2.f64240e
            goto L_0x0033
        L_0x0032:
            r2 = r11
        L_0x0033:
            r12 = 8
            r13 = 0
            if (r2 != 0) goto L_0x007c
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9.mo10233c(r1)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r4 = "filling"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r25
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r3 = "filling"
            java.lang.String r4 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r25
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x007c:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r2)
            java.lang.Object[] r3 = r14.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r5 = "filling"
            java.lang.String r6 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r25
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r4 = "filling"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r25
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            te3.me4 r2 = r23.mo25773w2()
            android.widget.TextView r3 = r0.f50313h
            if (r3 == 0) goto L_0x02b8
            java.lang.String r4 = r2.f64239d
            r3.setText(r4)
            android.widget.TextView r3 = r0.f50312g
            java.lang.String r4 = "nickNameTV"
            if (r3 == 0) goto L_0x02b4
            android.text.TextPaint r3 = r3.getPaint()
            r5 = 1
            r3.setFakeBoldText(r5)
            android.widget.ImageView r3 = r0.f50311f
            if (r3 == 0) goto L_0x02ae
            te3.oe4 r6 = r2.f64240e
            java.lang.String r6 = r6.f64339i
            java.lang.String r7 = "recCard.BizInfo.BrandIconUrl"
            gy3.C87412m.m108593f(r6, r7)
            hc0.c$b r7 = new hc0.c$b
            r7.<init>()
            r8 = 2131231376(0x7f080290, float:1.8078831E38)
            r7.f59361q = r8
            r7.f59347c = r5
            r7.f59364t = r5
            gc0.a r8 = gc0.C20828a.m22825b()
            hc0.c r7 = r7.mo32666a()
            r8.mo32519h(r6, r3, r7)
            android.widget.TextView r3 = r0.f50312g
            if (r3 == 0) goto L_0x02aa
            te3.oe4 r4 = r2.f64240e
            java.lang.String r4 = r4.f64335e
            r3.setText(r4)
            android.widget.TextView r3 = r0.f50317l
            if (r3 == 0) goto L_0x02a3
            te3.oe4 r4 = r2.f64240e
            java.lang.String r4 = r4.f64337g
            r3.setText(r4)
            te3.oe4 r3 = r2.f64240e
            java.lang.String r3 = r3.f64334d
            android.view.View r4 = r0.f50316k
            if (r4 == 0) goto L_0x029c
            com.tencent.mm.plugin.brandservice.ui.timeline.item.z0 r6 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.z0
            r6.<init>(r0, r3, r1)
            r4.setOnClickListener(r6)
            te3.re4 r4 = r23.mo25774x2()
            if (r4 != 0) goto L_0x012f
            goto L_0x0289
        L_0x012f:
            te3.qe4 r6 = r2.f64245j
            java.lang.String r7 = "MicroMsg.BizTLRecCardItem"
            if (r6 != 0) goto L_0x013b
            java.lang.String r5 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            goto L_0x015c
        L_0x013b:
            te3.ie0 r6 = r6.f185009e
            if (r6 != 0) goto L_0x0145
            java.lang.String r5 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo.FeedbackInfo = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            goto L_0x015c
        L_0x0145:
            int r8 = r6.f183683e
            if (r8 == r5) goto L_0x014f
            java.lang.String r5 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo.FeedbackInfo.ShowNegativeFeedbackReason != 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            goto L_0x015c
        L_0x014f:
            java.util.LinkedList<java.lang.String> r6 = r6.f183682d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r6 == 0) goto L_0x015d
            java.lang.String r5 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo.FeedbackInfo.NegativeFeedbackReason null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
        L_0x015c:
            r5 = 0
        L_0x015d:
            java.lang.String r6 = "closeLayout"
            if (r5 != 0) goto L_0x01ca
            java.util.LinkedList<java.lang.String> r4 = r4.f64520i
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 == 0) goto L_0x01ca
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[TRACE_BIZRECCARD] hideNegativeFeedback，BizNickName = "
            r4.append(r5)
            te3.oe4 r2 = r2.f64240e
            java.lang.String r2 = r2.f64335e
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            android.view.View r2 = r0.f50314i
            if (r2 == 0) goto L_0x01c6
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r4.mo10233c(r5)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r17 = "refreshHeader"
            java.lang.String r18 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r16 = "refreshHeader"
            java.lang.String r17 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0234
        L_0x01c6:
            gy3.C87412m.m108603p(r6)
            throw r11
        L_0x01ca:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[TRACE_BIZRECCARD] showNegativeFeedback，BizNickName = "
            r4.append(r5)
            te3.oe4 r2 = r2.f64240e
            java.lang.String r2 = r2.f64335e
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            android.view.View r2 = r0.f50314i
            if (r2 == 0) goto L_0x0298
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r4.mo10233c(r5)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r17 = "refreshHeader"
            java.lang.String r18 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem"
            java.lang.String r16 = "refreshHeader"
            java.lang.String r17 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r2 = r0.f50314i
            if (r2 == 0) goto L_0x0294
            com.tencent.mm.plugin.brandservice.ui.timeline.item.a1 r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.a1
            r5 = r24
            r4.<init>(r0, r1, r5)
            r2.setOnClickListener(r4)
        L_0x0234:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.c1 r2 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.c1
            r2.<init>(r1, r0, r3)
            android.widget.TextView r1 = r0.f50319n
            java.lang.String r4 = "followAlready"
            if (r1 == 0) goto L_0x0290
            r1.setVisibility(r12)
            android.widget.Button r1 = r0.f50318m
            if (r1 == 0) goto L_0x028a
            r1.setVisibility(r12)
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.z1 r1 = r1.get(r3)
            if (r1 == 0) goto L_0x027d
            long r5 = r1.f108320R1
            int r6 = (int) r5
            if (r6 > 0) goto L_0x0261
            goto L_0x027d
        L_0x0261:
            boolean r3 = r1.mo62927s3()
            if (r3 != 0) goto L_0x026b
            r2.invoke()
            goto L_0x0289
        L_0x026b:
            boolean r1 = r1.mo62927s3()
            if (r1 == 0) goto L_0x0289
            android.widget.TextView r1 = r0.f50319n
            if (r1 == 0) goto L_0x0279
            r1.setVisibility(r13)
            goto L_0x0289
        L_0x0279:
            gy3.C87412m.m108603p(r4)
            throw r11
        L_0x027d:
            eb0.w2 r1 = eb0.C31519v2.m39436a()
            java.lang.String r4 = ""
            r1.mo55988e(r3, r4, r11)
            r2.invoke()
        L_0x0289:
            return
        L_0x028a:
            java.lang.String r1 = "followType3"
            gy3.C87412m.m108603p(r1)
            throw r11
        L_0x0290:
            gy3.C87412m.m108603p(r4)
            throw r11
        L_0x0294:
            gy3.C87412m.m108603p(r6)
            throw r11
        L_0x0298:
            gy3.C87412m.m108603p(r6)
            throw r11
        L_0x029c:
            java.lang.String r1 = "profileLayout"
            gy3.C87412m.m108603p(r1)
            throw r11
        L_0x02a3:
            java.lang.String r1 = "profileReasonTv"
            gy3.C87412m.m108603p(r1)
            throw r11
        L_0x02aa:
            gy3.C87412m.m108603p(r4)
            throw r11
        L_0x02ae:
            java.lang.String r1 = "avatarIV"
            gy3.C87412m.m108603p(r1)
            throw r11
        L_0x02b4:
            gy3.C87412m.m108603p(r4)
            throw r11
        L_0x02b8:
            java.lang.String r1 = "recCardTitle"
            gy3.C87412m.m108603p(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardItem.mo22815a(com.tencent.mm.storage.o0, int, android.view.View, android.view.View):void");
    }

    /* renamed from: h */
    public abstract void mo22816h(View view);

    /* renamed from: i */
    public final void mo22817i(View view) {
        C87412m.m108594g(view, "header");
        View findViewById = view.findViewById(C0966R.C0970id.a27);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f50311f = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.hfq);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f50312g = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.abs);
        C87412m.m108593f(findViewById3, "header.findViewById(R.id.biz_rec_card_title)");
        TextView textView = (TextView) findViewById3;
        this.f50313h = textView;
        C8219i.f27144a.mo9271b(textView);
        View findViewById4 = view.findViewById(C0966R.C0970id.bes);
        C87412m.m108593f(findViewById4, "header.findViewById(R.id.close_layout)");
        this.f50314i = findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.ber);
        C87412m.m108593f(findViewById5, "header.findViewById(R.id.close_iv)");
        this.f50315j = findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.abq);
        C87412m.m108593f(findViewById6, "header.findViewById(R.id…_rec_card_profile_layout)");
        this.f50316k = findViewById6;
        View findViewById7 = view.findViewById(C0966R.C0970id.abr);
        C87412m.m108593f(findViewById7, "header.findViewById(R.id.biz_rec_card_reason_tv)");
        this.f50317l = (TextView) findViewById7;
        View findViewById8 = view.findViewById(C0966R.C0970id.abe);
        C87412m.m108593f(findViewById8, "header.findViewById(R.id.biz_rec_card_desc_tv)");
        MMNeat7extView mMNeat7extView = (MMNeat7extView) findViewById8;
        View findViewById9 = view.findViewById(C0966R.C0970id.h_e);
        ((WeImageView) findViewById9).setVisibility(0);
        C87412m.m108593f(findViewById9, "header.findViewById<WeIm…sibility = View.VISIBLE }");
        WeImageView weImageView = (WeImageView) findViewById9;
        View findViewById10 = view.findViewById(C0966R.C0970id.abn);
        C87412m.m108593f(findViewById10, "header.findViewById(R.id…_rec_card_follow_already)");
        this.f50319n = (TextView) findViewById10;
        View findViewById11 = view.findViewById(C0966R.C0970id.abo);
        C87412m.m108593f(findViewById11, "header.findViewById(R.id…iz_rec_card_follow_type3)");
        this.f50318m = (Button) findViewById11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ca  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22818j(com.tencent.p014mm.storage.C19623o0 r22, te3.ne4 r23, android.view.View r24, int r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.Class<ex0.d> r3 = ex0.C45696d.class
            java.lang.String r4 = "info"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "MicroMsg.BizTimeLineItem"
            if (r2 == 0) goto L_0x010f
            te3.me4 r5 = r22.mo25773w2()
            if (r5 == 0) goto L_0x010f
            te3.me4 r5 = r22.mo25773w2()
            gy3.C87412m.m108591d(r5)
            te3.oe4 r5 = r5.f64240e
            if (r5 != 0) goto L_0x0024
            goto L_0x010f
        L_0x0024:
            te3.me4 r5 = r22.mo25773w2()
            gy3.C87412m.m108591d(r5)
            te3.oe4 r5 = r5.f64240e
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 1149(0x47d, double:5.677E-321)
            r9 = 4
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = r2.f64284g
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = "onClick jump to url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = r2.f64284g
            r10 = 138(0x8a, float:1.93E-43)
            r11 = 10000(0x2710, float:1.4013E-41)
            long r12 = java.lang.System.currentTimeMillis()
            int r13 = (int) r12
            int r13 = r13 / 1000
            java.lang.String r8 = com.tencent.p014mm.message.C92721n.m116873a(r8, r10, r11, r13)
            java.lang.String r10 = "rawUrl"
            r7.putExtra(r10, r8)
            r10 = 56
            java.lang.String r11 = "geta8key_scene"
            r7.putExtra(r11, r10)
            java.lang.String r10 = r5.f64334d
            java.lang.String r11 = "geta8key_username"
            r7.putExtra(r11, r10)
            java.lang.String r10 = r5.f64334d
            java.lang.String r11 = "srcUsername"
            r7.putExtra(r11, r10)
            java.lang.String r5 = r5.f64335e
            java.lang.String r10 = "srcDisplayname"
            r7.putExtra(r10, r5)
            java.lang.String r5 = "prePublishId"
            java.lang.String r10 = "rec_card"
            r7.putExtra(r5, r10)
            java.lang.String r5 = "KPublisherId"
            r7.putExtra(r5, r10)
            k40.a r5 = f40.C86709a0.m107533q(r3)
            ex0.d r5 = (ex0.C45696d) r5
            boolean r5 = r5.mo70957E5(r6)
            if (r5 == 0) goto L_0x00b9
            k40.a r3 = f40.C86709a0.m107533q(r3)
            r10 = r3
            ex0.d r10 = (ex0.C45696d) r10
            android.content.Context r11 = r0.f50309d
            int r13 = r2.f64288n
            r14 = 0
            r15 = 138(0x8a, float:1.93E-43)
            r16 = 10000(0x2710, float:1.4013E-41)
            r12 = r8
            r17 = r7
            boolean r2 = r10.Ms0(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00b9
            java.lang.String r2 = "jump to TmplWebview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            goto L_0x00c4
        L_0x00b9:
            android.content.Context r2 = r0.f50309d
            r3 = 0
            java.lang.String r4 = "webview"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r2, r4, r5, r7, r3)
        L_0x00c4:
            te3.re4 r2 = r22.mo25774x2()
            if (r2 == 0) goto L_0x0107
            r3 = 0
            android.net.Uri r5 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r6 = "idx"
            java.lang.String r6 = r5.getQueryParameter(r6)     // Catch:{ Exception -> 0x00e4 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r9)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r6 = "mid"
            java.lang.String r5 = r5.getQueryParameter(r6)     // Catch:{ Exception -> 0x00e4 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r3)     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            r12 = r3
            r14 = r9
            qx0.a$a r3 = qx0.C22136a.C22137a.CLICK_REC
            qx0.C22136a.f62624g = r1
            int r4 = qx0.C22136a.f62622e
            qx0.C22136a.f62623f = r4
            qx0.C22136a.f62625h = r8
            qx0.C22136a.f62626i = r3
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r3 = r0.f50310e
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r10 = r3.f51443n
            java.lang.String r11 = r1.field_talker
            r15 = 15
            r16 = 0
            long r2 = r2.f64519h
            r19 = 1
            r17 = r2
            r20 = r25
            r10.mo22985l(r11, r12, r14, r15, r16, r17, r19, r20)
        L_0x0107:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r0.f50310e
            r3 = r25
            r2.mo23141f(r1, r3)
            return
        L_0x010f:
            java.lang.String r1 = "onAppMsgClick appMsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardItem.mo22818j(com.tencent.mm.storage.o0, te3.ne4, android.view.View, int):void");
    }
}
