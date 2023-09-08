package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import fy0.C8219i;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C22493dh;
import te3.C22495eh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.k */
public abstract class C18303k {

    /* renamed from: a */
    public final Context f50627a;

    /* renamed from: b */
    public final C18508z2 f50628b;

    /* renamed from: c */
    public View f50629c;

    /* renamed from: d */
    public View f50630d;

    /* renamed from: e */
    public MMNeat7extView f50631e;

    /* renamed from: f */
    public ImageView f50632f;

    /* renamed from: g */
    public LinearLayout f50633g;

    /* renamed from: h */
    public LinearLayout f50634h;

    /* renamed from: i */
    public MMNeat7extView f50635i;

    /* renamed from: j */
    public MMNeat7extView f50636j;

    /* renamed from: k */
    public View f50637k;

    /* renamed from: l */
    public TextView f50638l;

    /* renamed from: m */
    public C32224a<C13598b0> f50639m;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.k$a */
    public static final class C18304a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18303k f50640d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f50641e;

        /* renamed from: f */
        public final /* synthetic */ C22493dh f50642f;

        public C18304a(C18303k kVar, C19623o0 o0Var, C22493dh dhVar) {
            this.f50640d = kVar;
            this.f50641e = o0Var;
            this.f50642f = dhVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0159  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r28) {
            /*
                r27 = this;
                r6 = r27
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r28
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView$refreshClickView$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r27
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.brandservice.ui.timeline.item.k r0 = r6.f50640d
                fy3.a<rx3.b0> r0 = r0.f50639m
                if (r0 == 0) goto L_0x0029
                r0.invoke()
            L_0x0029:
                com.tencent.mm.plugin.brandservice.ui.timeline.item.k r0 = r6.f50640d
                com.tencent.mm.storage.o0 r1 = r6.f50641e
                te3.dh r2 = r6.f50642f
                r0.getClass()
                java.lang.Class<ex0.d> r3 = ex0.C45696d.class
                java.lang.String r4 = "info"
                gy3.C87412m.m108594g(r1, r4)
                java.lang.String r4 = "MicroMsg.BizTimeLineItem"
                if (r2 == 0) goto L_0x01b4
                te3.me4 r5 = r1.mo25773w2()
                if (r5 == 0) goto L_0x01b4
                te3.me4 r5 = r1.mo25773w2()
                gy3.C87412m.m108591d(r5)
                te3.oe4 r5 = r5.f64240e
                if (r5 != 0) goto L_0x0050
                goto L_0x01b4
            L_0x0050:
                java.lang.String r5 = r2.f63749H
                r7 = 0
                r8 = 0
                java.lang.String r9 = ""
                if (r5 == 0) goto L_0x0082
                java.lang.String r10 = "<finder_feed>"
                boolean r5 = z04.C112551y.m153819s(r5, r10, r8)
                if (r5 == 0) goto L_0x0069
                java.lang.String r5 = r2.f63749H
                java.lang.String r10 = "finder_feed"
                java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r10, r7)
                goto L_0x0083
            L_0x0069:
                java.lang.String r5 = r2.f63749H
                java.lang.String r10 = "appMsg.finderXmlContent"
                gy3.C87412m.m108593f(r5, r10)
                java.lang.String r10 = "~SEMI_XML~"
                boolean r5 = z04.C112551y.m153819s(r5, r10, r8)
                if (r5 == 0) goto L_0x0082
                java.lang.String r5 = r2.f63749H
                java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.SemiXml.decode(r5)
                java.lang.String r9 = ".sysmsg.BizAccountRecommend.BizAccount.AppMsg"
                goto L_0x0083
            L_0x0082:
                r5 = r7
            L_0x0083:
                if (r5 == 0) goto L_0x00b3
                java.lang.Class<ht1.t1> r10 = ht1.C60200t1.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                ht1.t1 r10 = (ht1.C60200t1) r10
                r11 = 26
                r12 = 2
                r13 = 25
                java.lang.String r10 = r10.mo76842e7(r11, r12, r13, r7)
                java.lang.Class<ht1.p4> r11 = ht1.C60193p4.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                ht1.p4 r11 = (ht1.C60193p4) r11
                android.content.Context r12 = r0.f50627a
                boolean r5 = r11.mo78731f7(r12, r9, r5, r10)
                if (r5 == 0) goto L_0x00b3
                java.lang.String r2 = "open finder success!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r0.f50628b
                r0.mo23141f(r1, r8)
                goto L_0x01b9
            L_0x00b3:
                te3.me4 r5 = r1.mo25773w2()
                gy3.C87412m.m108591d(r5)
                te3.oe4 r5 = r5.f64240e
                com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r10 = 1149(0x47d, double:5.677E-321)
                r12 = 4
                r14 = 1
                r16 = 0
                r9.idkeyStat(r10, r12, r14, r16)
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r9]
                java.lang.String r11 = r2.f63755i
                r10[r8] = r11
                java.lang.String r11 = "onClick jump to url:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r10)
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                java.lang.String r11 = r2.f63755i
                r12 = 169(0xa9, float:2.37E-43)
                r13 = 10000(0x2710, float:1.4013E-41)
                long r14 = java.lang.System.currentTimeMillis()
                int r15 = (int) r14
                int r15 = r15 / 1000
                java.lang.String r11 = com.tencent.p014mm.message.C92721n.m116874b(r11, r12, r13, r15, r1)
                java.lang.String r12 = "rawUrl"
                r10.putExtra(r12, r11)
                r12 = 56
                java.lang.String r13 = "geta8key_scene"
                r10.putExtra(r13, r12)
                java.lang.String r12 = r5.f64334d
                java.lang.String r13 = "geta8key_username"
                r10.putExtra(r13, r12)
                java.lang.String r12 = r5.f64334d
                java.lang.String r13 = "srcUsername"
                r10.putExtra(r13, r12)
                java.lang.String r5 = r5.f64335e
                java.lang.String r12 = "srcDisplayname"
                r10.putExtra(r12, r5)
                java.lang.String r5 = "rec_card"
                java.lang.String r12 = "prePublishId"
                r10.putExtra(r12, r5)
                java.lang.String r12 = "KPublisherId"
                r10.putExtra(r12, r5)
                k40.a r5 = f40.C86709a0.m107533q(r3)
                ex0.d r5 = (ex0.C45696d) r5
                boolean r5 = r5.mo70957E5(r9)
                if (r5 == 0) goto L_0x0149
                k40.a r3 = f40.C86709a0.m107533q(r3)
                r12 = r3
                ex0.d r12 = (ex0.C45696d) r12
                android.content.Context r13 = r0.f50627a
                int r15 = r2.f63760q
                r16 = 0
                r17 = 169(0xa9, float:2.37E-43)
                r18 = 10000(0x2710, float:1.4013E-41)
                r14 = r11
                r19 = r10
                boolean r3 = r12.Ms0(r13, r14, r15, r16, r17, r18, r19)
                if (r3 == 0) goto L_0x0149
                java.lang.String r3 = "jump to TmplWebview"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                goto L_0x0153
            L_0x0149:
                android.content.Context r3 = r0.f50627a
                java.lang.String r4 = "webview"
                java.lang.String r5 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r3, r4, r5, r10, r7)
            L_0x0153:
                te3.re4 r3 = r1.mo25774x2()
                if (r3 == 0) goto L_0x01ae
                r4 = 0
                android.net.Uri r7 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x0176 }
                java.lang.String r9 = "idx"
                java.lang.String r9 = r7.getQueryParameter(r9)     // Catch:{ Exception -> 0x0176 }
                int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r8)     // Catch:{ Exception -> 0x0176 }
                java.lang.String r10 = "mid"
                java.lang.String r7 = r7.getQueryParameter(r10)     // Catch:{ Exception -> 0x0173 }
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r4)     // Catch:{ Exception -> 0x0173 }
            L_0x0173:
                r12 = r4
                r14 = r9
                goto L_0x0178
            L_0x0176:
                r12 = r4
                r14 = 0
            L_0x0178:
                com.tencent.mm.plugin.brandservice.ui.timeline.z2 r4 = r0.f50628b
                com.tencent.mm.plugin.brandservice.ui.timeline.m3 r4 = r4.f51443n
                r4.mo22976c(r1, r3)
                com.tencent.mm.plugin.brandservice.ui.timeline.z2 r4 = r0.f50628b
                com.tencent.mm.plugin.brandservice.ui.timeline.m3 r10 = r4.f51443n
                java.lang.String r11 = r1.field_talker
                r15 = 15
                r16 = 0
                long r4 = r3.f64519h
                r17 = r4
                te3.hb0 r4 = r3.f64523o
                java.lang.String r5 = r4.f63909n
                r21 = r5
                java.lang.String r5 = r3.f64522n
                r22 = r5
                java.lang.String r4 = r4.f63908j
                r23 = r4
                int r4 = r2.f63747F
                r24 = r4
                int r3 = r3.f64521j
                r25 = r3
                java.lang.String r2 = r2.f63748G
                r26 = r2
                r20 = 0
                java.lang.String r19 = ""
                r10.mo22986m(r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26)
            L_0x01ae:
                com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r0.f50628b
                r0.mo23141f(r1, r8)
                goto L_0x01b9
            L_0x01b4:
                java.lang.String r0 = "onAppMsgClick appMsg is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            L_0x01b9:
                java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView$refreshClickView$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18303k.C18304a.onClick(android.view.View):void");
        }
    }

    public C18303k(Context context, C18508z2 z2Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
        this.f50627a = context;
        this.f50628b = z2Var;
    }

    /* renamed from: a */
    public final void mo22885a() {
        View view = this.f50629c;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22886b() {
        /*
            r3 = this;
            android.view.View r0 = r3.f50629c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = 0
            if (r0 == 0) goto L_0x0010
            r2 = 2131314314(0x7f09468a, float:1.824705E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r3.f50637k = r0
            android.view.View r0 = r3.f50629c
            if (r0 == 0) goto L_0x0021
            r1 = 2131305228(0x7f09230c, float:1.822862E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0021:
            r3.f50638l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18303k.mo22886b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0 < 2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r8.f63800n.size() <= 1) goto L_0x006a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22887c(com.tencent.p014mm.storage.C19623o0 r7, te3.C22495eh r8) {
        /*
            r6 = this;
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r7, r0)
            te3.re4 r0 = r7.mo25774x2()
            int r0 = r0.f64521j
            r1 = 101(0x65, float:1.42E-43)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x004f
            r8 = 102(0x66, float:1.43E-43)
            if (r0 == r8) goto L_0x0016
            goto L_0x006b
        L_0x0016:
            te3.re4 r7 = r7.mo25774x2()
            te3.hb0 r7 = r7.f64523o
            java.util.LinkedList<te3.eh> r7 = r7.f63905g
            java.lang.String r8 = "tlRecCardWrapper.extraInfo.BizInfo"
            gy3.C87412m.m108593f(r7, r8)
            r8 = 2
            java.util.List r7 = sx3.C110818d0.m150947s0(r7, r8)
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = 0
        L_0x002f:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r7.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L_0x0047
            te3.eh r4 = (te3.C22495eh) r4
            int r1 = r4.f63793d
            if (r1 != 0) goto L_0x0045
            int r0 = r0 + 1
        L_0x0045:
            r1 = r5
            goto L_0x002f
        L_0x0047:
            sx3.C64197v.m75542k()
            r7 = 0
            throw r7
        L_0x004c:
            if (r0 >= r8) goto L_0x0069
            goto L_0x006a
        L_0x004f:
            if (r8 != 0) goto L_0x0060
            te3.re4 r7 = r7.mo25774x2()
            te3.hb0 r7 = r7.f64523o
            java.util.LinkedList<te3.eh> r7 = r7.f63905g
            java.lang.Object r7 = r7.get(r3)
            r8 = r7
            te3.eh r8 = (te3.C22495eh) r8
        L_0x0060:
            java.util.LinkedList<te3.dh> r7 = r8.f63800n
            int r7 = r7.size()
            if (r7 > r2) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            r3 = r2
        L_0x006b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18303k.mo22887c(com.tencent.mm.storage.o0, te3.eh):boolean");
    }

    /* renamed from: d */
    public final void mo22888d(C19623o0 o0Var, C22495eh ehVar, C22493dh dhVar) {
        ImageView imageView;
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(ehVar, "bizInfo");
        C87412m.m108594g(dhVar, "appMsg");
        boolean z = false;
        if (mo22887c(o0Var, ehVar)) {
            View view = this.f50630d;
            if (view != null) {
                view.setBackgroundResource(C0966R.C0969drawable.f4588h4);
            }
            View view2 = this.f50630d;
            if (view2 != null) {
                int paddingLeft = view2 != null ? view2.getPaddingLeft() : 0;
                View view3 = this.f50630d;
                view2.setPadding(paddingLeft, 0, view3 != null ? view3.getPaddingRight() : 0, C18508z2.f51419T);
            }
        } else {
            View view4 = this.f50630d;
            if (view4 != null) {
                view4.setBackgroundResource(C0966R.C0969drawable.f4595ha);
            }
            View view5 = this.f50630d;
            if (view5 != null) {
                int paddingLeft2 = view5 != null ? view5.getPaddingLeft() : 0;
                View view6 = this.f50630d;
                view5.setPadding(paddingLeft2, 0, view6 != null ? view6.getPaddingRight() : 0, 0);
            }
        }
        ImageView imageView2 = this.f50632f;
        if (imageView2 != null) {
            imageView2.setBackgroundResource(C0966R.C0969drawable.f4587h3);
        }
        View view7 = this.f50630d;
        if (view7 != null) {
            view7.setOnClickListener(new C18304a(this, o0Var, dhVar));
        }
        int size = ehVar.f63800n.size();
        if (size <= 1 && size == 1 && !Util.isNullOrNil(dhVar.f63752f)) {
            z = true;
        }
        if (z && (imageView = this.f50632f) != null) {
            imageView.setBackgroundResource(C0966R.C0969drawable.f4585h1);
        }
    }

    /* renamed from: e */
    public final void mo22889e(C19623o0 o0Var, C22493dh dhVar) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(dhVar, "appMsg");
        MMNeat7extView mMNeat7extView = this.f50636j;
        if (mMNeat7extView != null) {
            mMNeat7extView.setVisibility(8);
        }
        View view = this.f50637k;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView", "refreshFriendInfo", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView", "refreshFriendInfo", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (mo22887c(o0Var, (C22495eh) null)) {
            if (!Util.isNullOrNil(dhVar.f63744C)) {
                MMNeat7extView mMNeat7extView2 = this.f50636j;
                if (mMNeat7extView2 != null) {
                    mMNeat7extView2.setVisibility(0);
                }
                MMNeat7extView mMNeat7extView3 = this.f50636j;
                if (mMNeat7extView3 != null) {
                    mMNeat7extView3.mo104279b(dhVar.f63744C);
                }
            }
        } else if (!Util.isNullOrNil(dhVar.f63744C)) {
            View view3 = this.f50637k;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView", "refreshFriendInfo", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowTopView", "refreshFriendInfo", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            LinearLayout linearLayout = this.f50633g;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(C0966R.C0969drawable.f4608ho);
            }
            TextView textView = this.f50638l;
            if (textView != null) {
                textView.setText(dhVar.f63744C);
            }
        }
    }

    /* renamed from: f */
    public final void mo22890f(C19623o0 o0Var, C22495eh ehVar, C22493dh dhVar) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(ehVar, "bizInfo");
        C87412m.m108594g(dhVar, "appMsg");
        MMNeat7extView mMNeat7extView = this.f50631e;
        if (mMNeat7extView != null) {
            mMNeat7extView.setTextColor(this.f50627a.getResources().getColor(C0966R.color.a18));
        }
        LinearLayout linearLayout = this.f50633g;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.ags);
        }
        TextView textView = this.f50638l;
        if (textView != null) {
            textView.setTextColor(this.f50627a.getResources().getColor(C0966R.color.a18));
        }
        if (mo22887c(o0Var, ehVar)) {
            LinearLayout linearLayout2 = this.f50634h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            MMNeat7extView mMNeat7extView2 = this.f50631e;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.setVisibility(8);
            }
            MMNeat7extView mMNeat7extView3 = this.f50635i;
            if (mMNeat7extView3 != null) {
                mMNeat7extView3.setMaxLines(2);
                mMNeat7extView3.mo104279b(dhVar.f63751e);
                C8219i iVar = C8219i.f27144a;
                return;
            }
            return;
        }
        LinearLayout linearLayout3 = this.f50634h;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        MMNeat7extView mMNeat7extView4 = this.f50631e;
        if (mMNeat7extView4 != null) {
            mMNeat7extView4.setVisibility(0);
        }
        MMNeat7extView mMNeat7extView5 = this.f50631e;
        if (mMNeat7extView5 != null) {
            mMNeat7extView5.mo104279b(dhVar.f63751e);
        }
        C8219i.f27144a.mo9272c(this.f50631e);
    }
}
