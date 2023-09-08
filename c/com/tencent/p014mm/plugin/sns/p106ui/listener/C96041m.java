package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.m */
public class C96041m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280452d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.m$a */
    public class C96042a implements C47883u {
        public C96042a(C96041m mVar) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$1");
            SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.m$b */
    public class C96043b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ View f280453a;

        public C96043b(View view) {
            this.f280453a = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
            r8 = r8.ContentObj;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo353a(boolean r14, java.lang.String r15) {
            /*
                r13 = this;
                java.lang.Class<om.f> r14 = p214om.C11502f.class
                java.lang.String r15 = "onDialogClick"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r0)
                android.view.View r1 = r13.f280453a
                java.lang.Object r1 = r1.getTag()
                boolean r1 = r1 instanceof java.lang.String
                if (r1 != 0) goto L_0x0018
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x0018:
                android.view.View r1 = r13.f280453a
                java.lang.Object r1 = r1.getTag()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onItemDelClick:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.TimelineClickListener"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
                os2.e0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
                com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.mo139798DN(r1)
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L_0x0050
                java.lang.Object[] r14 = new java.lang.Object[r4]
                r14[r5] = r1
                java.lang.String r1 = "can not get snsinfo by localid %s then return it"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r1, r14)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x0050:
                boolean r1 = r2.isDieItem()
                r6 = 739(0x2e3, float:1.036E-42)
                if (r1 == 0) goto L_0x00bd
                java.lang.String r14 = "dead item"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
                os2.e0 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
                int r1 = r2.localid
                r14.mo139814bD(r1)
                com.tencent.mm.plugin.sns.ui.listener.m r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.this
                com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r14.f280452d
                com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$j r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122985g(r14)
                if (r14 == 0) goto L_0x0093
                com.tencent.mm.plugin.sns.ui.listener.m r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.this
                com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r14.f280452d
                com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$j r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122985g(r14)
                com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$f0 r14 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$f0) r14
                r14.getClass()
                java.lang.String r1 = "onPostError"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$50"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
                com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r14 = r14.f278743a
                ep3.a r14 = r14.mo93528H7()
                java.lang.Class<jv2.d> r4 = jv2.C99064d.class
                r14.mo136934f(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            L_0x0093:
                com.tencent.mm.plugin.sns.ui.listener.m r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.this
                com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r14.f280452d
                int r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r14)
                if (r14 != 0) goto L_0x00a1
                ad0.C91998s.m115550d(r6)
                goto L_0x00a4
            L_0x00a1:
                ad0.C91998s.m115549c(r6)
            L_0x00a4:
                vr2.C102236a0.m134728W(r2)
                r2.isDieItem()
                int r14 = r2.getTypeFlag()
                r1 = 21
                if (r14 != r1) goto L_0x00b9
                as2.e r14 = as2.C28128e.m38100a()
                r14.mo55808d()
            L_0x00b9:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x00bd:
                java.lang.String r1 = "checkSnsInfoIsFakeVideo"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r7)
                com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r2.getTimeLine()
                r9 = 0
                if (r8 == 0) goto L_0x00d2
                te3.j00 r8 = r8.ContentObj
                if (r8 == 0) goto L_0x00d2
                java.util.LinkedList<te3.kv2> r8 = r8.f298427h
                goto L_0x00d3
            L_0x00d2:
                r8 = r9
            L_0x00d3:
                if (r8 == 0) goto L_0x00de
                boolean r10 = r8.isEmpty()
                if (r10 == 0) goto L_0x00dc
                goto L_0x00de
            L_0x00dc:
                r10 = 0
                goto L_0x00df
            L_0x00de:
                r10 = 1
            L_0x00df:
                if (r10 != 0) goto L_0x00f4
                java.lang.Object r8 = r8.get(r5)
                te3.kv2 r8 = (te3.C101804kv2) r8
                int r8 = r8.f298690e
                r10 = 8
                if (r8 != r10) goto L_0x00ef
                r8 = 1
                goto L_0x00f0
            L_0x00ef:
                r8 = 0
            L_0x00f0:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r7)
                goto L_0x00f8
            L_0x00f4:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r7)
                r8 = 0
            L_0x00f8:
                if (r8 == 0) goto L_0x0161
                java.lang.String r14 = "delete video is fake video"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
                os2.e0 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
                int r1 = r2.localid
                r14.mo139814bD(r1)
                int r14 = r2.getCreateTime()
                long r3 = (long) r14
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r3)
                int r14 = com.tencent.p014mm.plugin.sns.model.C94950t1.f275247k
                long r5 = (long) r14
                int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r14 >= 0) goto L_0x011f
                com.tencent.mm.plugin.sns.model.t1 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
                r14.mo131280d(r2)
            L_0x011f:
                com.tencent.mm.plugin.sns.ui.listener.m r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.this
                com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r14.f280452d
                r14.mo132098s()
                int r14 = r2.localid
                int r1 = r2.getCreateTime()
                java.lang.String r2 = "dealTimeLineFeedDelete"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "dealTimeLineDelete >> snsLocalIdd: "
                r3.append(r4)
                r3.append(r14)
                java.lang.String r4 = ", createTime: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.SnsTimeLineFakeViewHandler"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                java.lang.Class<hf3.c> r3 = hf3.C98449c.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                hf3.c r3 = (hf3.C98449c) r3
                r3.mo136678hj(r14, r1)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x0161:
                boolean r1 = r2.isInValid()
                r7 = 0
                if (r1 == 0) goto L_0x0209
                k21.c$a r14 = k21.C60960c.f173618a
                r1 = 5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                i21.i r6 = i21.C60242i.DEFAULT
                java.lang.String r10 = "SnsPublishProcess"
                java.lang.String r11 = "opresult_"
                r14.mo85927k(r10, r11, r1, r6)
                com.tencent.mm.plugin.sns.statistics.l$a r14 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r6 = r2.localid
                r1.append(r6)
                java.lang.String r6 = ""
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r14.mo80966c(r1)
                java.lang.Class<mm.h> r14 = p606mm.C99933h.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                mm.h r14 = (p606mm.C99933h) r14
                r1 = 16
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                int r11 = r2.localid
                r10.append(r11)
                r10.append(r6)
                java.lang.String r6 = r10.toString()
                r14.D80(r1, r6, r9)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = "cancel item "
                r14.append(r1)
                java.lang.String r1 = r2.getLocalid()
                r14.append(r1)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
                com.tencent.mm.plugin.sns.model.p2 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
                r14.mo131191b(r2)
                com.tencent.mm.protocal.protobuf.TimeLineObject r14 = r2.getTimeLine()
                if (r14 == 0) goto L_0x01e4
                te3.j00 r14 = r14.ContentObj
                if (r14 == 0) goto L_0x01e4
                te3.rk1 r14 = r14.f298431o
                if (r14 == 0) goto L_0x01e4
                long r9 = r14.f185192p
                int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r14 == 0) goto L_0x01e4
                goto L_0x01e5
            L_0x01e4:
                r4 = 0
            L_0x01e5:
                int r14 = r2.getCreateTime()
                long r5 = (long) r14
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)
                int r14 = com.tencent.p014mm.plugin.sns.model.C94950t1.f275247k
                long r7 = (long) r14
                int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r14 >= 0) goto L_0x01fe
                if (r4 != 0) goto L_0x01fe
                com.tencent.mm.plugin.sns.model.t1 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
                r14.mo131280d(r2)
            L_0x01fe:
                com.tencent.mm.plugin.sns.ui.listener.m r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.this
                com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r14.f280452d
                r14.mo132098s()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x0209:
                java.lang.String r1 = "delete by server"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                java.lang.String r1 = r2.getSnsId()
                com.tencent.mm.plugin.sns.model.b1 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
                long r10 = os2.C100417r0.m131425n(r1)
                r3.mo130947b(r10)
                f40.C86709a0.m107528h()
                f40.g r3 = f40.C86709a0.m107529k()
                ob0.b0 r3 = r3.f251779b
                com.tencent.mm.plugin.sns.model.g0 r10 = new com.tencent.mm.plugin.sns.model.g0
                long r11 = os2.C100417r0.m131425n(r1)
                r10.<init>((long) r11, (int) r4)
                r3.mo123460f(r10)
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r2.getTimeLine()
                if (r3 == 0) goto L_0x0247
                te3.j00 r10 = r3.ContentObj
                if (r10 == 0) goto L_0x0247
                te3.rk1 r10 = r10.f298431o
                if (r10 == 0) goto L_0x0247
                long r10 = r10.f185192p
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 == 0) goto L_0x0247
                goto L_0x0248
            L_0x0247:
                r4 = 0
            L_0x0248:
                int r7 = r2.getCreateTime()
                long r7 = (long) r7
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r7)
                int r10 = com.tencent.p014mm.plugin.sns.model.C94950t1.f275247k
                long r10 = (long) r10
                int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                if (r12 >= 0) goto L_0x0261
                if (r4 != 0) goto L_0x0261
                com.tencent.mm.plugin.sns.model.t1 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
                r4.mo131280d(r2)
            L_0x0261:
                os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
                long r7 = os2.C100417r0.m131425n(r1)
                r4.delete(r7)
                os2.x r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                long r7 = os2.C100417r0.m131425n(r1)
                r4.mo139895jo(r7)
                long r7 = os2.C100417r0.m131425n(r1)
                os2.C35299v.m40633a(r7)
                com.tencent.mm.plugin.sns.ui.listener.m r1 = com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.this
                com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r1.f280452d
                r1.mo132098s()
                if (r3 == 0) goto L_0x02c8
                te3.r5 r1 = r3.AppInfo
                if (r1 != 0) goto L_0x028c
                goto L_0x028e
            L_0x028c:
                java.lang.String r9 = r1.f299236d
            L_0x028e:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r1 != 0) goto L_0x02c8
                di3.d r1 = di3.C86312j.m106911c(r14)
                om.f r1 = (p214om.C11502f) r1
                wc3.y r1 = r1.mo11461Sr()
                boolean r1 = r1.mo93152a3(r9)
                if (r1 == 0) goto L_0x02c8
                di3.d r14 = di3.C86312j.m106911c(r14)
                om.f r14 = (p214om.C11502f) r14
                wc3.y r14 = r14.mo11461Sr()
                java.lang.String r14 = r14.mo93137CP(r9, r5)
                com.tencent.mm.autogen.events.ReportDelGameMsgEvent r1 = new com.tencent.mm.autogen.events.ReportDelGameMsgEvent
                r1.<init>()
                com.tencent.mm.autogen.events.ReportDelGameMsgEvent$a r4 = r1.f265059d
                r4.f265060a = r9
                java.lang.String r5 = r3.UserName
                r4.f265062c = r5
                r4.f265061b = r14
                java.lang.String r14 = r3.statisticsData
                r4.f265063d = r14
                r1.publish()
            L_0x02c8:
                com.tencent.mm.plugin.sns.ui.listener.m r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.this
                com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r14.f280452d
                int r14 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r14)
                if (r14 != 0) goto L_0x02d6
                ad0.C91998s.m115550d(r6)
                goto L_0x02d9
            L_0x02d6:
                ad0.C91998s.m115549c(r6)
            L_0x02d9:
                vr2.C102236a0.m134728W(r2)
                r2.isDieItem()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.listener.C96041m.C96043b.mo353a(boolean, java.lang.String):void");
        }
    }

    public C96041m(TimelineClickListener timelineClickListener) {
        this.f280452d = timelineClickListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20");
        C77426q qVar = new C77426q(TimelineClickListener.m122988j(this.f280452d));
        qVar.mo107595g(TimelineClickListener.m122988j(this.f280452d).getResources().getString(C0966R.string.jir));
        qVar.mo107602n(TimelineClickListener.m122988j(this.f280452d).getResources().getString(C0966R.string.f7944x1));
        qVar.mo107599k(TimelineClickListener.m122988j(this.f280452d).getResources().getColor(C0966R.color.a_3));
        qVar.mo107600l(new C96043b(view));
        qVar.mo107598j(TimelineClickListener.m122988j(this.f280452d).getResources().getString(C0966R.string.f7926wf));
        qVar.mo107597i(new C96042a(this));
        qVar.mo107603o();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
