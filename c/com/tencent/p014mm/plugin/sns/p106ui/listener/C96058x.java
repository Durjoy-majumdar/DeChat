package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.storage.C96983o3;
import kg3.C76577a;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.x */
public class C96058x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280470d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.x$a */
    public class C96059a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f280471d;

        /* renamed from: e */
        public final /* synthetic */ C96066m2 f280472e;

        /* renamed from: f */
        public final /* synthetic */ SnsInfo f280473f;

        /* renamed from: g */
        public final /* synthetic */ TimeLineObject f280474g;

        /* renamed from: h */
        public final /* synthetic */ boolean f280475h;

        public C96059a(C101804kv2 kv22, C96066m2 m2Var, SnsInfo snsInfo, TimeLineObject timeLineObject, boolean z) {
            this.f280471d = kv22;
            this.f280472e = m2Var;
            this.f280473f = snsInfo;
            this.f280474g = timeLineObject;
            this.f280475h = z;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$30$1");
            if (C94866e1.Fx0().mo131143z(this.f280471d)) {
                this.f280472e.f280502e.mo130071b((String) null, false, 0);
                C94901o Fx0 = C94866e1.Fx0();
                SnsInfo snsInfo = this.f280473f;
                C101804kv2 kv22 = this.f280471d;
                VideoSightView videoSightView = this.f280472e.f280502e;
                int hashCode = TimelineClickListener.m122988j(C96058x.this.f280470d).hashCode();
                int i = this.f280472e.f280500c;
                C96983o3 b = C96983o3.m124650b();
                b.f284145b = this.f280474g.CreateTime;
                Fx0.mo131110c0(snsInfo, kv22, videoSightView, -1, hashCode, i, b, this.f280475h);
                this.f280472e.f280502e.start();
                this.f280472e.f280506i.setVisibility(0);
                this.f280472e.f280507j.setVisibility(8);
                this.f280472e.f280506i.setImageDrawable(C76577a.m92158i(TimelineClickListener.m122988j(C96058x.this.f280470d), C0966R.raw.shortvideo_play_btn));
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$30$1");
        }
    }

    public C96058x(TimelineClickListener timelineClickListener) {
        this.f280470d = timelineClickListener;
    }

    /* JADX WARNING: Removed duplicated region for block: B:186:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x08bb  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x092d A[Catch:{ Exception -> 0x0939 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0936  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x09a5  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x09a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r57) {
        /*
            r56 = this;
            r8 = r56
            r0 = r57
            jp2.w$b r7 = jp2.C98977w.C98979b.Sight
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r56
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$30"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.lang.String r11 = "MicroMsg.TimelineClickListener"
            java.lang.String r1 = "onsight click"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            java.lang.Object r1 = r57.getTag()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96066m2
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r57.getTag()
            com.tencent.mm.plugin.sns.ui.m2 r1 = (com.tencent.p014mm.plugin.sns.p106ui.C96066m2) r1
        L_0x0041:
            r4 = r1
            goto L_0x0067
        L_0x0043:
            java.lang.Object r1 = r57.getTag()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r57.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r1 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r1
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f279953e0
            goto L_0x0041
        L_0x0054:
            java.lang.Object r1 = r57.getTag()
            boolean r1 = r1 instanceof nt2.C100165c
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r57.getTag()
            nt2.c r1 = (nt2.C100165c) r1
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293415h
            goto L_0x0041
        L_0x0065:
            r1 = 0
            goto L_0x0041
        L_0x0067:
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r2 = r4.f280499b
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.mo139798DN(r2)
            java.lang.String r5 = "(Landroid/view/View;)V"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            r1 = 1
            r15 = 0
            if (r6 != 0) goto L_0x008e
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r4.f280499b
            r0[r15] = r1
            java.lang.String r1 = "onsight click but info is null localid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            j20.C117292a.m165361g(r8, r2, r3, r9, r5)
            return
        L_0x008e:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r8.f280470d
            com.tencent.mm.plugin.sns.model.d1 r12 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122983e(r12)
            boolean r12 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r12)
            if (r12 == 0) goto L_0x00a7
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r8.f280470d
            com.tencent.mm.plugin.sns.model.d1 r12 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122983e(r12)
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r12 = r12.mo130970a()
            r12.mo131335v(r6)
        L_0x00a7:
            com.tencent.mm.plugin.sns.model.k2 r12 = com.tencent.p014mm.plugin.sns.model.C94891k2.f274975a
            r12.mo131068a(r6, r1)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r8.f280470d
            java.lang.String r13 = r6.getUserName()
            java.lang.String r14 = r6.getSnsId()
            int r1 = r6.getTypeFlag()
            java.lang.String r15 = "access$1800"
            r20 = r11
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r11)
            r12.getClass()
            java.lang.String r12 = "publicClickEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
            e30.C75539a.m90584d(r13, r14, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r11)
            boolean r1 = r6.isAd()
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r6.getAdXml()
            if (r1 == 0) goto L_0x00fb
            if (r12 == 0) goto L_0x00fb
            boolean r13 = r12.isCardAd()
            if (r13 != 0) goto L_0x00ed
            boolean r13 = r12.isFullCardAd()
            if (r13 == 0) goto L_0x00fb
        L_0x00ed:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            android.view.View$OnClickListener r1 = r1.f280365U
            r1.onClick(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            j20.C117292a.m165361g(r8, r2, r3, r9, r5)
            return
        L_0x00fb:
            if (r1 == 0) goto L_0x010c
            if (r12 == 0) goto L_0x010c
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r8.f280470d
            android.app.Activity r13 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r13)
            java.lang.String r14 = r12.appGiftPackCode
            java.lang.String r12 = r12.appGiftPackCodeTips
            lo2.C34318c.m40322a(r13, r14, r12)
        L_0x010c:
            com.tencent.mm.protocal.protobuf.TimeLineObject r15 = r4.f280498a
            te3.j00 r12 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r12 = r12.f298427h
            if (r12 == 0) goto L_0x0a6b
            int r12 = r12.size()
            if (r12 != 0) goto L_0x011c
            goto L_0x0a6b
        L_0x011c:
            te3.j00 r12 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r12 = r12.f298427h
            r13 = 0
            java.lang.Object r12 = r12.get(r13)
            r14 = r12
            te3.kv2 r14 = (te3.C101804kv2) r14
            r13 = 3
            if (r1 == 0) goto L_0x013f
            com.tencent.mm.plugin.sns.model.o r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r12 = r12.mo131141x(r14)
            if (r12 != 0) goto L_0x013f
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = r11
            r11 = 1910(0x776, float:2.676E-42)
            r12.mo175911u(r11, r13)
            goto L_0x0141
        L_0x013f:
            r21 = r11
        L_0x0141:
            boolean r11 = r6.isAd()
            if (r11 == 0) goto L_0x015f
            com.tencent.mm.plugin.sns.storage.ADXml r11 = r6.getAdXml()
            boolean r11 = r11.isLandingPagesAd()
            if (r11 == 0) goto L_0x015f
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r11 = r6.getAdSnsInfo()
            java.lang.String r11 = r11.field_adxml
            boolean r11 = ps2.C100894u.m132239s(r11)
            if (r11 == 0) goto L_0x015f
            r11 = 1
            goto L_0x0160
        L_0x015f:
            r11 = 0
        L_0x0160:
            r12 = 8
            if (r11 != 0) goto L_0x019a
            if (r1 == 0) goto L_0x019a
            com.tencent.mm.plugin.sns.model.o r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r11 = r11.mo131143z(r14)
            if (r11 == 0) goto L_0x019a
            com.tencent.mm.plugin.sns.model.o r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r11.mo131122i0(r14)
            android.widget.ImageView r11 = r4.f280506i
            if (r11 == 0) goto L_0x017e
            r11.setVisibility(r12)
        L_0x017e:
            com.tencent.mm.ui.widget.MMPinProgressBtn r11 = r4.f280507j
            if (r11 == 0) goto L_0x0185
            r11.setVisibility(r12)
        L_0x0185:
            if (r1 == 0) goto L_0x0192
            jp2.w$a r11 = jp2.C98977w.C98978a.PlayIcon
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r8.f280470d
            int r12 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r12)
            jp2.C98977w.m128885a(r7, r11, r6, r12)
        L_0x0192:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 6
            r13 = 1910(0x776, float:2.676E-42)
            r11.mo175911u(r13, r12)
        L_0x019a:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r8.f280470d
            int r11 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r11)
            r12 = 717(0x2cd, float:1.005E-42)
            if (r11 != 0) goto L_0x01a8
            ad0.C91998s.m115550d(r12)
            goto L_0x01ab
        L_0x01a8:
            ad0.C91998s.m115549c(r12)
        L_0x01ab:
            vr2.C102236a0.m134728W(r6)
            r6.isAd()
            r6.getUxinfo()
            java.lang.String r11 = r14.f298689d
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r8.f280470d
            int r11 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r11)
            r12 = 745(0x2e9, float:1.044E-42)
            if (r11 != 0) goto L_0x01c5
            ad0.s r11 = ad0.C91998s.m115550d(r12)
            goto L_0x01c9
        L_0x01c5:
            ad0.s r11 = ad0.C91998s.m115549c(r12)
        L_0x01c9:
            vr2.C102236a0.m134728W(r6)
            r6.isAd()
            if (r1 == 0) goto L_0x01f2
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r6.getAdXml()
            boolean r12 = r12.isLandingPagesAd()
            if (r12 == 0) goto L_0x01e7
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r12 = r6.getAdSnsInfo()
            java.lang.String r12 = r12.field_adxml
            boolean r12 = ps2.C100894u.m132239s(r12)
            if (r12 != 0) goto L_0x01f2
        L_0x01e7:
            jp2.w$a r12 = jp2.C98977w.C98978a.EnterFullScreen
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r8.f280470d
            int r13 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r13)
            jp2.C98977w.m128885a(r7, r12, r6, r13)
        L_0x01f2:
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r12 = r14.f298689d
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r7, r12)
            java.lang.String r12 = vr2.C102236a0.m134725T(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            r23 = r11
            java.lang.String r11 = ""
            if (r13 == 0) goto L_0x023e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r17 = r12
            java.lang.String r12 = vr2.C102236a0.m134729X(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            goto L_0x0241
        L_0x023e:
            r12 = r11
            r17 = r12
        L_0x0241:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r24 = r12
            java.lang.String r12 = vr2.C102236a0.m134735b0(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r12 == 0) goto L_0x0286
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            java.lang.String r13 = vr2.C102236a0.m134735b0(r14)
            r12.append(r13)
            java.lang.String r17 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            java.lang.String r7 = vr2.C102236a0.m134739d0(r14)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            r7 = r12
            r13 = r17
            goto L_0x028a
        L_0x0286:
            r13 = r17
            r7 = r24
        L_0x028a:
            r12 = 2
            r24 = r11
            int[] r11 = new int[r12]
            boolean r17 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r17 == 0) goto L_0x0299
            r0.getLocationOnScreen(r11)
            goto L_0x029c
        L_0x0299:
            r0.getLocationInWindow(r11)
        L_0x029c:
            int r0 = r57.getWidth()
            int r12 = r57.getHeight()
            r25 = r15
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = r2
            r26 = r13
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r13 = 3
            java.lang.Integer r22 = java.lang.Integer.valueOf(r13)
            r16 = 0
            r2[r16] = r22
            r13 = 11444(0x2cb4, float:1.6036E-41)
            r15.mo160131h(r13, r2)
            if (r1 != 0) goto L_0x035d
            int r2 = r14.f298690e
            r13 = 8
            if (r2 != r13) goto L_0x035d
            java.lang.String r1 = "click to play fake sns video"
            r2 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r8.f280470d
            android.app.Activity r2 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r2)
            java.lang.Class<com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity> r13 = com.tencent.p014mm.plugin.sns.p106ui.fake.SnsFakeVideoActivity.class
            r1.setClass(r2, r13)
            java.lang.String r2 = "intent_video_is_preview"
            r13 = 0
            r1.putExtra(r2, r13)
            java.lang.String r2 = r4.f280499b
            int r2 = os2.C100417r0.m131424m(r2)
            java.lang.String r4 = "intent_video_sns_local_id"
            r1.putExtra(r4, r2)
            int r2 = r6.getCreateTime()
            java.lang.String r4 = "intent_video_sns_create_time"
            r1.putExtra(r4, r2)
            r2 = r11[r13]
            java.lang.String r4 = "intent_left"
            r1.putExtra(r4, r2)
            r2 = 1
            r2 = r11[r2]
            java.lang.String r4 = "intent_top"
            r1.putExtra(r4, r2)
            java.lang.String r2 = "intent_width"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "intent_height"
            r1.putExtra(r0, r12)
            java.lang.String r0 = "intent_video_thumb_path"
            r1.putExtra(r0, r7)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r1)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r20 = "onClick"
            java.lang.String r21 = "(Landroid/view/View;)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = 0
            java.lang.Object r1 = r2.mo10231a(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r19 = "onClick"
            java.lang.String r20 = "(Landroid/view/View;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            r15 = r27
            j20.C117292a.m165361g(r8, r15, r3, r9, r5)
            return
        L_0x035d:
            r2 = r20
            r15 = r27
            java.lang.String r13 = "intent_thumbpath"
            r18 = r14
            java.lang.String r14 = "intent_videopath"
            r20 = r3
            java.lang.String r3 = "img_gallery_height"
            r27 = r5
            java.lang.String r5 = "img_gallery_width"
            r28 = r15
            java.lang.String r15 = "img_gallery_top"
            r29 = r9
            java.lang.String r9 = "img_gallery_left"
            r30 = r10
            java.lang.String r10 = "intent_from_scene"
            r31 = r3
            java.lang.String r3 = "intent_isad"
            r32 = r12
            java.lang.String r12 = "intent_localid"
            if (r1 != 0) goto L_0x04f9
            r33 = r0
            java.lang.String r0 = "it not ad video, use online video activity to play."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r8.f280470d
            android.app.Activity r2 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r2)
            r34 = r5
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity> r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.class
            r0.setClass(r2, r5)
            r5 = r26
            r0.putExtra(r14, r5)
            r0.putExtra(r13, r7)
            java.lang.String r2 = r4.f280499b
            r0.putExtra(r12, r2)
            r0.putExtra(r3, r1)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            int r1 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r1)
            r0.putExtra(r10, r1)
            int r1 = r4.f280512o
            java.lang.String r2 = "sns_video_scene"
            r0.putExtra(r2, r1)
            pt2.i r1 = pt2.C62497i.f177536a
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r4.f280498a
            te3.k1 r2 = r2.actionInfo
            te3.g1 r2 = r2.f298580j
            java.lang.String r3 = r2.f298271d
            java.lang.String r2 = r2.f298273f
            java.lang.String r1 = r1.mo87530b(r3, r2)
            java.lang.String r2 = "intent_third_sdk_msg"
            r0.putExtra(r2, r1)
            long r1 = r6.field_snsId
            java.lang.String r1 = vr2.C102236a0.m134763p0(r1)
            java.lang.String r2 = "intent_publish_id"
            r0.putExtra(r2, r1)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            android.app.Activity r1 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r1)
            int r1 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r1)
            java.lang.String r2 = "intent_bottom_height"
            r0.putExtra(r2, r1)
            com.tencent.mm.plugin.sns.ui.video.a r1 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r2 = r25
            java.lang.String r3 = r2.f283893Id
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r1 = r1.mo133930b(r3)
            if (r1 == 0) goto L_0x0472
            boolean r3 = r1.mo132371x()
            if (r3 == 0) goto L_0x0472
            java.lang.String r3 = "intent_fromplayingvideo"
            r5 = 1
            r0.putExtra(r3, r5)
            java.lang.String r2 = r2.f283893Id
            java.lang.String r3 = "intent_fromplayingvideo_tlobjid"
            r0.putExtra(r3, r2)
            java.lang.String r2 = r1.getSessionId()
            java.lang.String r3 = "intent_session_id"
            r0.putExtra(r3, r2)
            long r1 = r1.getSessionTimestamp()
            java.lang.String r3 = "intent_session_timestamp"
            r0.putExtra(r3, r1)
            android.view.View r1 = r4.f280501d
            if (r1 == 0) goto L_0x0472
            r2 = 2131315202(0x7f094a02, float:1.824885E38)
            android.view.View r1 = r1.findViewById(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r36 = r2.mo10232b()
            java.lang.String r37 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r38 = "onClick"
            java.lang.String r39 = "(Landroid/view/View;)V"
            java.lang.String r40 = "android/view/View_EXEC_"
            java.lang.String r41 = "setVisibility"
            java.lang.String r42 = "(I)V"
            r35 = r1
            j20.C117292a.m165358d(r35, r36, r37, r38, r39, r40, r41, r42)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r36 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r37 = "onClick"
            java.lang.String r38 = "(Landroid/view/View;)V"
            java.lang.String r39 = "android/view/View_EXEC_"
            java.lang.String r40 = "setVisibility"
            java.lang.String r41 = "(I)V"
            j20.C117292a.m165359e(r35, r36, r37, r38, r39, r40, r41)
        L_0x0472:
            r1 = 0
            r2 = r11[r1]
            r0.putExtra(r9, r2)
            r1 = 1
            r1 = r11[r1]
            r0.putExtra(r15, r1)
            r1 = r33
            r2 = r34
            r0.putExtra(r2, r1)
            r2 = r31
            r1 = r32
            r0.putExtra(r2, r1)
            r1 = r23
            r1.mo125842g(r0)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            android.app.Activity r9 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r1)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r0)
            java.lang.Object[] r32 = r1.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r34 = "onClick"
            java.lang.String r35 = "(Landroid/view/View;)V"
            java.lang.String r36 = "Undefined"
            java.lang.String r37 = "startActivity"
            java.lang.String r38 = "(Landroid/content/Intent;)V"
            r31 = r9
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r2 = 0
            java.lang.Object r0 = r1.mo10231a(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r11 = "onClick"
            java.lang.String r12 = "(Landroid/view/View;)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r15 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            r1 = 0
            r0.overridePendingTransition(r1, r1)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r6.getTimeLine()
            com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122978D(r0, r1)
            r1 = r29
            r2 = r30
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r3 = r20
            r2 = r27
            r4 = r28
            j20.C117292a.m165361g(r8, r4, r3, r1, r2)
            return
        L_0x04f9:
            r16 = r28
            r28 = r10
            r10 = r20
            r20 = r25
            r25 = r23
            r23 = r2
            r2 = r0
            r0 = r31
            r31 = r7
            r7 = r29
            r29 = r1
            r1 = r5
            r5 = r27
            r27 = r32
            r32 = r4
            r4 = r30
            r30 = 0
            boolean r33 = br2.C54550e.m61296a(r6)
            if (r33 == 0) goto L_0x0536
            r33 = r12
            com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent r12 = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent
            r12.<init>()
            r34 = r13
            com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent$a r13 = r12.f154872d
            r35 = r14
            java.lang.String r14 = vr2.C102236a0.m134728W(r6)
            r13.f154873a = r14
            r12.publish()
            goto L_0x053c
        L_0x0536:
            r33 = r12
            r34 = r13
            r35 = r14
        L_0x053c:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r8.f280470d
            com.tencent.mm.plugin.sns.storage.ADInfo r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r12, r6)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r8.f280470d
            android.app.Activity r12 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r12)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r8.f280470d
            int r36 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r13)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r8.f280470d
            jp2.o r13 = r13.f280378h
            r37 = 21
            r38 = 0
            r39 = r3
            r3 = r27
            r43 = r33
            r17 = r13
            r44 = r26
            r45 = r34
            r13 = r6
            r26 = r14
            r22 = r18
            r46 = r35
            r34 = r0
            r33 = r3
            r0 = r15
            r3 = r16
            r15 = r36
            r16 = r17
            r17 = r37
            r18 = r38
            boolean r12 = vr2.C102260r.m134836E(r12, r13, r14, r15, r16, r17, r18)
            if (r12 == 0) goto L_0x0585
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            j20.C117292a.m165361g(r8, r3, r10, r7, r5)
            return
        L_0x0585:
            boolean r12 = r6.isAd()
            r13 = 21
            if (r12 == 0) goto L_0x0703
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r6.getAdXml()
            boolean r12 = r12.isLandingPagesAd()
            if (r12 == 0) goto L_0x0703
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r12 = r6.getAdSnsInfo()
            java.lang.String r12 = r12.field_adxml
            boolean r12 = ps2.C100894u.m132239s(r12)
            if (r12 == 0) goto L_0x0703
            java.lang.String r12 = ps2.C100894u.m132221a(r6)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r14 != 0) goto L_0x05b3
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r14 = r6.getAdSnsInfo()
            r14.field_adxml = r12
        L_0x05b3:
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            r14 = 0
            r15 = r11[r14]
            r12.putExtra(r9, r15)
            r9 = 1
            r11 = r11[r9]
            r12.putExtra(r0, r11)
            r12.putExtra(r1, r2)
            r14 = r33
            r15 = r34
            r12.putExtra(r15, r14)
            java.lang.String r0 = r6.getSnsId()
            java.lang.String r1 = "sns_landing_pages_share_sns_id"
            r12.putExtra(r1, r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            java.lang.String r0 = r0.f283893Id
            java.lang.String r1 = "sns_landing_pages_rawSnsId"
            r12.putExtra(r1, r0)
            java.lang.String r0 = r6.getUxinfo()
            java.lang.String r1 = "sns_landing_pages_ux_info"
            r12.putExtra(r1, r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            if (r0 == 0) goto L_0x060d
            te3.j00 r0 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x060d
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            te3.kv2 r0 = (te3.C101804kv2) r0
            java.lang.String r0 = r0.f298694i
            java.lang.String r1 = "sns_landing_pages_share_thumb_url"
            r12.putExtra(r1, r0)
        L_0x060d:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122981c(r0, r12, r6)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI> r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.class
            r12.setClass(r0, r1)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r0)
            r1 = 2
            if (r0 != r1) goto L_0x0629
            r0 = 16
            goto L_0x0635
        L_0x0629:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r0)
            r2 = 1
            if (r0 != r2) goto L_0x0634
            r0 = 2
            goto L_0x0635
        L_0x0634:
            r0 = 1
        L_0x0635:
            java.lang.String r2 = "sns_landig_pages_from_source"
            r12.putExtra(r2, r0)
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r6.getAdSnsInfo()
            java.lang.String r0 = r0.field_adxml
            java.lang.String r2 = "sns_landing_pages_xml"
            r12.putExtra(r2, r0)
            int r0 = r6.getAdRecSrc()
            java.lang.String r2 = "sns_landing_pages_rec_src"
            r12.putExtra(r2, r0)
            java.lang.String r0 = "sns_landing_pages_xml_prefix"
            java.lang.String r2 = "adxml"
            r12.putExtra(r0, r2)
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "sns_landing_page_start_time"
            r12.putExtra(r0, r14)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.forbiddenCustomAnimation
            if (r0 != 0) goto L_0x0679
            java.lang.String r0 = "sns_landing_pages_need_enter_and_exit_animation"
            r2 = 1
            r12.putExtra(r0, r2)
            java.lang.String r0 = "sns_landing_pages_is_normal_ad_animation"
            r12.putExtra(r0, r2)
            goto L_0x067a
        L_0x0679:
            r2 = 1
        L_0x067a:
            java.lang.String r0 = "sns_landing_is_native_sight_ad"
            r12.putExtra(r0, r2)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r12)
            java.lang.Object[] r21 = r2.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r23 = "onClick"
            java.lang.String r24 = "(Landroid/view/View;)V"
            java.lang.String r25 = "Undefined"
            java.lang.String r26 = "startActivity"
            java.lang.String r27 = "(Landroid/content/Intent;)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = 0
            java.lang.Object r2 = r2.mo10231a(r9)
            android.content.Intent r2 = (android.content.Intent) r2
            r0.startActivity(r2)
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r22 = "onClick"
            java.lang.String r23 = "(Landroid/view/View;)V"
            java.lang.String r24 = "Undefined"
            java.lang.String r25 = "startActivity"
            java.lang.String r26 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.forbiddenCustomAnimation
            if (r0 != 0) goto L_0x06d2
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            r2 = 0
            r0.overridePendingTransition(r2, r2)
        L_0x06d2:
            com.tencent.mm.modelsns.SnsAdClick r0 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r8.f280470d
            int r21 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r2)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r8.f280470d
            int r2 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r2)
            if (r2 != 0) goto L_0x06e5
            r22 = 1
            goto L_0x06e7
        L_0x06e5:
            r22 = 2
        L_0x06e7:
            long r1 = r6.field_snsId
            r25 = 21
            r26 = 21
            r20 = r0
            r23 = r1
            r20.<init>(r21, r22, r23, r25, r26)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            jp2.o r1 = r1.f280378h
            vr2.C102260r.m134864d(r0, r1, r6, r13)
            vr2.C102236a0.m134773u0(r0)
            r13 = r3
            r2 = r4
            r12 = r5
            goto L_0x077b
        L_0x0703:
            r14 = r33
            r15 = r34
            r12 = r26
            if (r12 == 0) goto L_0x0729
            r13 = 0
            boolean r17 = r12.checkCurIndexCanJump(r13)
            if (r17 == 0) goto L_0x0729
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            r0 = 0
            r9 = 8
            r13 = r3
            r2 = r57
            r3 = r6
            r11 = r4
            r4 = r12
            r12 = r5
            r5 = r0
            r6 = r9
            com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122984f(r1, r2, r3, r4, r5, r6)
            r1 = r7
            r20 = r10
            r2 = r11
            goto L_0x0a60
        L_0x0729:
            r13 = r3
            r12 = r5
            r5 = r4
            boolean r3 = r6.isAd()
            if (r3 == 0) goto L_0x0780
            com.tencent.mm.plugin.sns.storage.ADInfo r3 = r6.getAdInfo()
            if (r3 == 0) goto L_0x0780
            com.tencent.mm.plugin.sns.storage.ADInfo r3 = r6.getAdInfo()
            boolean r3 = r3.isWeapp()
            if (r3 == 0) goto L_0x0780
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r6.getAdInfo()
            r2 = 0
            com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122982d(r0, r1, r6, r2)
            com.tencent.mm.modelsns.SnsAdClick r0 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            int r21 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r1)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            int r1 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r1)
            if (r1 != 0) goto L_0x075f
            r22 = 1
            goto L_0x0761
        L_0x075f:
            r22 = 2
        L_0x0761:
            long r1 = r6.field_snsId
            r25 = 21
            r26 = 31
            r20 = r0
            r23 = r1
            r20.<init>(r21, r22, r23, r25, r26)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280470d
            jp2.o r1 = r1.f280378h
            r2 = 21
            vr2.C102260r.m134864d(r0, r1, r6, r2)
            vr2.C102236a0.m134773u0(r0)
            r2 = r5
        L_0x077b:
            r1 = r7
            r20 = r10
            goto L_0x0a60
        L_0x0780:
            boolean r3 = r6.isAd()
            if (r3 == 0) goto L_0x07b7
            com.tencent.mm.modelsns.SnsAdClick r3 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r8.f280470d
            int r48 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r4)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r8.f280470d
            int r4 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r4)
            r57 = r5
            if (r4 != 0) goto L_0x079b
            r49 = 1
            goto L_0x079d
        L_0x079b:
            r49 = 2
        L_0x079d:
            long r4 = r6.field_snsId
            r52 = 17
            r53 = 0
            r47 = r3
            r50 = r4
            r47.<init>(r48, r49, r50, r52, r53)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r8.f280470d
            jp2.o r4 = r4.f280378h
            r5 = 17
            vr2.C102260r.m134864d(r3, r4, r6, r5)
            vr2.C102236a0.m134773u0(r3)
            goto L_0x07b9
        L_0x07b7:
            r57 = r5
        L_0x07b9:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r8.f280470d
            android.app.Activity r4 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r4)
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI> r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.class
            r3.setClass(r4, r5)
            r4 = r44
            r5 = r46
            r3.putExtra(r5, r4)
            r5 = r31
            r4 = r45
            r3.putExtra(r4, r5)
            r4 = r32
            java.lang.String r5 = r4.f280499b
            r16 = r7
            r7 = r43
            r3.putExtra(r7, r5)
            r5 = r29
            r7 = r39
            r3.putExtra(r7, r5)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r7 = r8.f280470d
            int r7 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r7)
            r5 = r28
            r3.putExtra(r5, r7)
            r5 = 0
            r7 = r11[r5]
            r3.putExtra(r9, r7)
            r5 = 1
            r7 = r11[r5]
            r3.putExtra(r0, r7)
            r3.putExtra(r1, r2)
            r3.putExtra(r15, r14)
            r11 = r25
            r11.mo125842g(r3)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r3)
            java.lang.Object[] r32 = r1.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r34 = "onClick"
            java.lang.String r35 = "(Landroid/view/View;)V"
            java.lang.String r36 = "Undefined"
            java.lang.String r37 = "startActivity"
            java.lang.String r38 = "(Landroid/content/Intent;)V"
            r31 = r0
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r32 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$30"
            java.lang.String r33 = "onClick"
            java.lang.String r34 = "(Landroid/view/View;)V"
            java.lang.String r35 = "Undefined"
            java.lang.String r36 = "startActivity"
            java.lang.String r37 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r8.f280470d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            r3 = 0
            r0.overridePendingTransition(r3, r3)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            r0.<init>()
            com.tencent.mm.plugin.sns.ui.listener.x$a r9 = new com.tencent.mm.plugin.sns.ui.listener.x$a
            r14 = r29
            r11 = 1
            r1 = r9
            r15 = r23
            r2 = r56
            r5 = 0
            r7 = 2
            r3 = r22
            r54 = r57
            r11 = 0
            r5 = r6
            r11 = r6
            r6 = r20
            r20 = r10
            r55 = r16
            r10 = 2
            r7 = r14
            r1.<init>(r3, r4, r5, r6, r7)
            r1 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r9, r1)
            r1 = 3
            int[] r0 = new int[r1]
            r2 = 5
            if (r14 != 0) goto L_0x0897
            com.tencent.mm.plugin.sns.model.o r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r3 = r3.mo131136s(r11, r0)
            if (r3 <= r2) goto L_0x0897
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r3 = r22
            r2.mo131098R(r3)
            goto L_0x08ac
        L_0x0897:
            r3 = r22
            if (r14 == 0) goto L_0x08ae
            com.tencent.mm.plugin.sns.model.o r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r4 = r4.mo131134q(r11, r0)
            if (r4 <= r2) goto L_0x08ae
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2.mo131098R(r3)
        L_0x08ac:
            r2 = 1
            goto L_0x08af
        L_0x08ae:
            r2 = 2
        L_0x08af:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r8.f280470d
            r4 = 0
            r5 = r0[r4]
            r4 = 1
            r6 = r0[r4]
            if (r2 != r10) goto L_0x08bb
            r4 = 1
            goto L_0x08bc
        L_0x08bb:
            r4 = 0
        L_0x08bc:
            r7 = r0[r10]
            java.lang.String r9 = "access$2000"
            r14 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r14)
            r3.getClass()
            java.lang.String r3 = "reprotSnsSightPreloadExp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r14)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r11.getTimeLine()
            ad0.t r1 = new ad0.t
            r1.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = r0.f283893Id
            r10.append(r0)
            java.lang.String r8 = ","
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            java.lang.String r10 = "20FeedId"
            r1.mo32a(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = r11.getUxinfo()
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = "21AdUxInfo"
            r1.mo32a(r10, r0)
            com.tencent.mm.protocal.protobuf.SnsObject r0 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x0939 }
            r0.<init>()     // Catch:{ Exception -> 0x0939 }
            byte[] r10 = r11.field_attrBuf     // Catch:{ Exception -> 0x0939 }
            pe3.a r0 = r0.parseFrom(r10)     // Catch:{ Exception -> 0x0939 }
            com.tencent.mm.protocal.protobuf.SnsObject r0 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r0     // Catch:{ Exception -> 0x0939 }
            te3.qv3 r10 = r0.ObjectOperations     // Catch:{ Exception -> 0x0939 }
            if (r10 == 0) goto L_0x0936
            te3.y74 r10 = new te3.y74     // Catch:{ Exception -> 0x0939 }
            r10.<init>()     // Catch:{ Exception -> 0x0939 }
            te3.qv3 r0 = r0.ObjectOperations     // Catch:{ Exception -> 0x0939 }
            pe3.b r0 = r0.f140574f     // Catch:{ Exception -> 0x0939 }
            byte[] r0 = r0.f257327a     // Catch:{ Exception -> 0x0939 }
            pe3.a r0 = r10.parseFrom(r0)     // Catch:{ Exception -> 0x0939 }
            te3.y74 r0 = (te3.y74) r0     // Catch:{ Exception -> 0x0939 }
            te3.xg3 r0 = r0.f145163h     // Catch:{ Exception -> 0x0939 }
            if (r0 == 0) goto L_0x0936
            int r10 = r0.f144641d     // Catch:{ Exception -> 0x0939 }
            int r0 = r0.f144642e     // Catch:{ Exception -> 0x0932 }
            goto L_0x0947
        L_0x0932:
            r0 = move-exception
            r57 = r10
            goto L_0x093c
        L_0x0936:
            r0 = 0
            r10 = 0
            goto L_0x0947
        L_0x0939:
            r0 = move-exception
            r57 = 0
        L_0x093c:
            r11 = 0
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r11 = r24
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r11, r10)
            r10 = r57
            r0 = 0
        L_0x0947:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r8)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "22LayerId"
            r1.mo32a(r11, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            java.lang.String r10 = "23ExpId"
            r1.mo32a(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "24ClickState"
            r1.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "25ClickTime"
            r1.mo32a(r2, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            if (r0 == 0) goto L_0x09a7
            r0 = 1
            goto L_0x09cc
        L_0x09a7:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
            if (r0 == 0) goto L_0x09b3
            r0 = 2
            goto L_0x09cc
        L_0x09b3:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r0)
            if (r0 == 0) goto L_0x09bf
            r0 = 3
            goto L_0x09cc
        L_0x09bf:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r0)
            if (r0 == 0) goto L_0x09cb
            r0 = 4
            goto L_0x09cc
        L_0x09cb:
            r0 = 0
        L_0x09cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "26NetworkType"
            r1.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "27IsFlowControl"
            r1.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "28AutoDownloadSetting"
            r1.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "29IsAutoPlay"
            r1.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "30IsFlowControlDatePeriod"
            r1.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "report SnsSightPreloadExp(sight_autodownload) logbuffer(13323): "
            r0.append(r2)
            java.lang.String r2 = r1.mo34c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 13323(0x340b, float:1.867E-41)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r0.mo160131h(r2, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r14)
            r2 = r54
            r1 = r55
        L_0x0a60:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r3 = r56
            r4 = r20
            j20.C117292a.m165361g(r3, r13, r4, r1, r12)
            return
        L_0x0a6b:
            r13 = r2
            r4 = r3
            r12 = r5
            r3 = r8
            r1 = r9
            r2 = r10
            r15 = r20
            java.lang.String r0 = "the obj.ContentObj.MediaObjList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r3, r13, r4, r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.listener.C96058x.onClick(android.view.View):void");
    }
}
