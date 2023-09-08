package fu2;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import f40.C86709a0;
import gu2.C98214b;
import gy3.C87412m;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98802d;
import p749xh.C102654l5;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: fu2.j */
public final class C98013j extends C97987a {

    /* renamed from: fu2.j$a */
    public static final class C98014a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C98214b f287426a;

        /* renamed from: b */
        public final /* synthetic */ C98013j f287427b;

        public C98014a(C98214b bVar, C98013j jVar) {
            this.f287426a = bVar;
            this.f287427b = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x009b, code lost:
            r1 = r1.ContentObj;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo353a(boolean r14, java.lang.String r15) {
            /*
                r13 = this;
                java.lang.Class<om.f> r14 = p214om.C11502f.class
                java.lang.String r15 = "onDialogClick"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r0)
                gu2.b r1 = r13.f287426a
                java.lang.String r1 = r1.mo137503A2()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onItemDelClick:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = ", snsId:"
                r2.append(r1)
                gu2.b r1 = r13.f287426a
                long r3 = r1.mo142401p2()
                r2.append(r3)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "MicroMsg.Improve.DeleteClick"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                gu2.b r1 = r13.f287426a
                boolean r1 = r1.isDieItem()
                r3 = 739(0x2e3, float:1.036E-42)
                if (r1 == 0) goto L_0x008b
                java.lang.String r14 = "dead item"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)
                ad0.C91998s.m115550d(r3)
                gu2.b r14 = r13.f287426a
                r14.mo137504B2()
                gu2.b r14 = r13.f287426a
                r14.getClass()
                gu2.b r14 = r13.f287426a
                boolean r14 = r14.isDieItem()
                if (r14 == 0) goto L_0x005a
                goto L_0x005f
            L_0x005a:
                gu2.b r14 = r13.f287426a
                r14.getClass()
            L_0x005f:
                gu2.b r14 = r13.f287426a
                int r14 = r14.getType()
                r1 = 21
                if (r14 != r1) goto L_0x0070
                as2.e r14 = as2.C28128e.m38100a()
                r14.mo55808d()
            L_0x0070:
                fu2.j r1 = r13.f287427b
                gu2.b r14 = r13.f287426a
                long r2 = r14.mo137526z2()
                gu2.b r14 = r13.f287426a
                long r4 = r14.mo142401p2()
                gu2.b r14 = r13.f287426a
                int r6 = r14.getCreateTime()
                r1.mo137328n(r2, r4, r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x008b:
                gu2.b r1 = r13.f287426a
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.mo137509G2()
                java.lang.String r4 = "checkSnsInfoIsFakeVideo"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                r6 = 0
                if (r1 == 0) goto L_0x00a2
                te3.j00 r1 = r1.ContentObj
                if (r1 == 0) goto L_0x00a2
                java.util.LinkedList<te3.kv2> r1 = r1.f298427h
                goto L_0x00a3
            L_0x00a2:
                r1 = r6
            L_0x00a3:
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x00b0
                boolean r9 = r1.isEmpty()
                if (r9 == 0) goto L_0x00ae
                goto L_0x00b0
            L_0x00ae:
                r9 = 0
                goto L_0x00b1
            L_0x00b0:
                r9 = 1
            L_0x00b1:
                if (r9 != 0) goto L_0x00c6
                java.lang.Object r1 = r1.get(r8)
                te3.kv2 r1 = (te3.C101804kv2) r1
                int r1 = r1.f298690e
                r9 = 8
                if (r1 != r9) goto L_0x00c1
                r1 = 1
                goto L_0x00c2
            L_0x00c1:
                r1 = 0
            L_0x00c2:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                goto L_0x00ca
            L_0x00c6:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                r1 = 0
            L_0x00ca:
                if (r1 == 0) goto L_0x0157
                java.lang.String r14 = "delete video is fake video"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)
                os2.e0 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
                gu2.b r1 = r13.f287426a
                long r1 = r1.mo137526z2()
                int r2 = (int) r1
                r14.mo139814bD(r2)
                gu2.b r14 = r13.f287426a
                int r14 = r14.getCreateTime()
                long r1 = (long) r14
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r1)
                int r14 = com.tencent.p014mm.plugin.sns.model.C94950t1.f275247k
                long r3 = (long) r14
                int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r14 >= 0) goto L_0x00fe
                com.tencent.mm.plugin.sns.model.t1 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
                gu2.b r1 = r13.f287426a
                com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo137505C2()
                r14.mo131280d(r1)
            L_0x00fe:
                gu2.b r14 = r13.f287426a
                long r1 = r14.mo137526z2()
                int r14 = (int) r1
                gu2.b r1 = r13.f287426a
                int r1 = r1.getCreateTime()
                java.lang.String r2 = "dealTimeLineFeedDelete"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
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
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
                fu2.j r6 = r13.f287427b
                gu2.b r14 = r13.f287426a
                long r7 = r14.mo137526z2()
                gu2.b r14 = r13.f287426a
                long r9 = r14.mo142401p2()
                gu2.b r14 = r13.f287426a
                int r11 = r14.getCreateTime()
                r6.mo137328n(r7, r9, r11)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x0157:
                gu2.b r1 = r13.f287426a
                r1.getClass()
                java.lang.String r4 = "isInValid"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                long r9 = r1.mo142401p2()
                r11 = 0
                int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r1 != 0) goto L_0x0170
                r1 = 1
                goto L_0x0171
            L_0x0170:
                r1 = 0
            L_0x0171:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                if (r1 == 0) goto L_0x021b
                k21.c$a r14 = k21.C60960c.f173618a
                r1 = 5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                i21.i r2 = i21.C60242i.DEFAULT
                java.lang.String r3 = "SnsPublishProcess"
                java.lang.String r4 = "opresult_"
                r14.mo85927k(r3, r4, r1, r2)
                com.tencent.mm.plugin.sns.statistics.l$a r14 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                gu2.b r2 = r13.f287426a
                long r2 = r2.mo137526z2()
                r1.append(r2)
                java.lang.String r2 = ""
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r14.mo80966c(r1)
                java.lang.Class<mm.h> r14 = p606mm.C99933h.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                mm.h r14 = (p606mm.C99933h) r14
                r1 = 16
                gu2.b r2 = r13.f287426a
                long r2 = r2.mo137526z2()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r14.D80(r1, r2, r6)
                com.tencent.mm.plugin.sns.model.p2 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
                gu2.b r1 = r13.f287426a
                com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo137505C2()
                r14.mo131191b(r1)
                gu2.b r14 = r13.f287426a
                com.tencent.mm.protocal.protobuf.TimeLineObject r14 = r14.mo137509G2()
                if (r14 == 0) goto L_0x01de
                te3.j00 r14 = r14.ContentObj
                if (r14 == 0) goto L_0x01de
                te3.rk1 r14 = r14.f298431o
                if (r14 == 0) goto L_0x01de
                long r1 = r14.f185192p
                int r14 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r14 == 0) goto L_0x01de
                goto L_0x01df
            L_0x01de:
                r7 = 0
            L_0x01df:
                gu2.b r14 = r13.f287426a
                int r14 = r14.getCreateTime()
                long r1 = (long) r14
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r1)
                int r14 = com.tencent.p014mm.plugin.sns.model.C94950t1.f275247k
                long r3 = (long) r14
                int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r14 >= 0) goto L_0x0200
                if (r7 != 0) goto L_0x0200
                com.tencent.mm.plugin.sns.model.t1 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
                gu2.b r1 = r13.f287426a
                com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo137505C2()
                r14.mo131280d(r1)
            L_0x0200:
                fu2.j r2 = r13.f287427b
                gu2.b r14 = r13.f287426a
                long r3 = r14.mo137526z2()
                gu2.b r14 = r13.f287426a
                long r5 = r14.mo142401p2()
                gu2.b r14 = r13.f287426a
                int r7 = r14.getCreateTime()
                r2.mo137328n(r3, r5, r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            L_0x021b:
                ju2.c r1 = ju2.C99043c.f290342a
                fu2.j r4 = r13.f287427b
                r4.getClass()
                java.lang.String r5 = "getHolder"
                java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)
                jq3.o r4 = r4.f287383d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
                if (r4 == 0) goto L_0x0233
                android.view.View r4 = r4.f44854d
                goto L_0x0234
            L_0x0233:
                r4 = r6
            L_0x0234:
                java.lang.String r5 = "relocateFeed$default"
                java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)
                r1.mo138385a(r4, r8)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
                java.lang.String r1 = "delete by server"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                com.tencent.mm.plugin.sns.model.b1 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
                gu2.b r2 = r13.f287426a
                long r4 = r2.mo142401p2()
                r1.mo130947b(r4)
                f40.g r1 = f40.C86709a0.m107529k()
                ob0.b0 r1 = r1.f251779b
                com.tencent.mm.plugin.sns.model.g0 r2 = new com.tencent.mm.plugin.sns.model.g0
                gu2.b r4 = r13.f287426a
                long r4 = r4.mo142401p2()
                r2.<init>((long) r4, (int) r7)
                r1.mo123460f(r2)
                gu2.b r1 = r13.f287426a
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.mo137509G2()
                if (r1 == 0) goto L_0x027f
                te3.j00 r2 = r1.ContentObj
                if (r2 == 0) goto L_0x027f
                te3.rk1 r2 = r2.f298431o
                if (r2 == 0) goto L_0x027f
                long r4 = r2.f185192p
                int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r2 == 0) goto L_0x027f
                goto L_0x0280
            L_0x027f:
                r7 = 0
            L_0x0280:
                gu2.b r2 = r13.f287426a
                int r2 = r2.getCreateTime()
                long r4 = (long) r2
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r4)
                int r2 = com.tencent.p014mm.plugin.sns.model.C94950t1.f275247k
                long r9 = (long) r2
                int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r2 >= 0) goto L_0x02a1
                if (r7 != 0) goto L_0x02a1
                com.tencent.mm.plugin.sns.model.t1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
                gu2.b r4 = r13.f287426a
                com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo137505C2()
                r2.mo131280d(r4)
            L_0x02a1:
                os2.x r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                gu2.b r4 = r13.f287426a
                long r4 = r4.mo142401p2()
                r2.mo139895jo(r4)
                gu2.b r2 = r13.f287426a
                long r4 = r2.mo142401p2()
                os2.C35299v.m40633a(r4)
                if (r1 == 0) goto L_0x02fa
                te3.r5 r2 = r1.AppInfo
                if (r2 != 0) goto L_0x02be
                goto L_0x02c0
            L_0x02be:
                java.lang.String r6 = r2.f299236d
            L_0x02c0:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r2 != 0) goto L_0x02fa
                di3.d r2 = di3.C86312j.m106911c(r14)
                om.f r2 = (p214om.C11502f) r2
                wc3.y r2 = r2.mo11461Sr()
                boolean r2 = r2.mo93152a3(r6)
                if (r2 == 0) goto L_0x02fa
                di3.d r14 = di3.C86312j.m106911c(r14)
                om.f r14 = (p214om.C11502f) r14
                wc3.y r14 = r14.mo11461Sr()
                java.lang.String r14 = r14.mo93137CP(r6, r8)
                com.tencent.mm.autogen.events.ReportDelGameMsgEvent r2 = new com.tencent.mm.autogen.events.ReportDelGameMsgEvent
                r2.<init>()
                com.tencent.mm.autogen.events.ReportDelGameMsgEvent$a r4 = r2.f265059d
                r4.f265060a = r6
                java.lang.String r5 = r1.UserName
                r4.f265062c = r5
                r4.f265061b = r14
                java.lang.String r14 = r1.statisticsData
                r4.f265063d = r14
                r2.publish()
            L_0x02fa:
                fu2.j r5 = r13.f287427b
                gu2.b r14 = r13.f287426a
                long r6 = r14.mo137526z2()
                gu2.b r14 = r13.f287426a
                long r8 = r14.mo142401p2()
                gu2.b r14 = r13.f287426a
                int r10 = r14.getCreateTime()
                r5.mo137328n(r6, r8, r10)
                ad0.C91998s.m115550d(r3)
                gu2.b r14 = r13.f287426a
                r14.mo137504B2()
                gu2.b r14 = r13.f287426a
                r14.getClass()
                gu2.b r14 = r13.f287426a
                boolean r14 = r14.isDieItem()
                if (r14 == 0) goto L_0x0327
                goto L_0x032c
            L_0x0327:
                gu2.b r14 = r13.f287426a
                r14.getClass()
            L_0x032c:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fu2.C98013j.C98014a.mo353a(boolean, java.lang.String):void");
        }
    }

    /* renamed from: fu2.j$b */
    public static final class C98015b implements C47883u {

        /* renamed from: a */
        public static final C98015b f287428a = new C98015b();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$2");
            SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$2");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98013j(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
            return;
        }
        C77426q qVar = new C77426q(mo137309b());
        qVar.mo107595g(mo137309b().getResources().getString(C0966R.string.jir));
        qVar.mo107602n(mo137309b().getResources().getString(C0966R.string.f7944x1));
        qVar.mo107599k(mo137309b().getResources().getColor(C0966R.color.a_3));
        qVar.mo107600l(new C98014a(c, this));
        qVar.mo107598j(mo137309b().getResources().getString(C0966R.string.f7926wf));
        qVar.mo107597i(C98015b.f287428a);
        qVar.mo107603o();
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
    }

    /* renamed from: n */
    public final void mo137328n(long j, long j2, int i) {
        C39622i0 a;
        SnsMethodCalculate.markStartTimeMs("notifyDBDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
        Class cls = C60631e.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C98802d dVar = (C98802d) ((C60631e) a).mo85233d3(C98802d.class);
        SnsMethodCalculate.markStartTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        boolean z = C102654l5.f302595y.delete().where(C102654l5.f302596z.equal((Number) Long.valueOf(j))).build().run(dVar.getDbProvider().getDB()) >= 0;
        Log.printInfoStack("MicroMsg.Improve.DataFlow", "deleteByLocalId localid:" + j + " result:" + z, new Object[0]);
        if (z) {
            C98214b bVar = new C98214b();
            bVar.systemRowid = j;
            bVar.setSnsId(j2);
            bVar.setCreateTime(i);
            StorageEventId delete = StorageEventId.Companion.getDELETE();
            String valueOf = String.valueOf(j);
            dVar.getLogTag();
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(delete, valueOf, "MicroMsg.Improve.DataFlow");
            storageObserverEvent.setObj(bVar);
            C102654l5.f302594Z.notify(storageObserverEvent);
        }
        SnsMethodCalculate.markEndTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        SnsMethodCalculate.markEndTimeMs("notifyDBDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
    }
}
