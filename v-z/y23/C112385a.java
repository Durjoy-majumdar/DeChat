package y23;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import gy3.C87412m;
import qh2.C101198e;

/* renamed from: y23.a */
public final class C112385a extends C112388h<MultiMediaEditInfoStruct> {

    /* renamed from: e */
    public BasePluginLayout f336495e;

    /* renamed from: f */
    public boolean f336496f;

    public C112385a(BasePluginLayout basePluginLayout) {
        C87412m.m108594g(basePluginLayout, "pluginLayout");
        this.f336495e = basePluginLayout;
    }

    /* renamed from: a */
    public void mo14581a(Intent intent) {
        C87412m.m108594g(intent, "intent");
        T multiMediaEditInfoStruct = new MultiMediaEditInfoStruct();
        this.f336503d = multiMediaEditInfoStruct;
        multiMediaEditInfoStruct.f310220j = multiMediaEditInfoStruct.mo86045b("isSlowMotion", "", true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct2 = (MultiMediaEditInfoStruct) this.f336503d;
        if (multiMediaEditInfoStruct2 != null) {
            multiMediaEditInfoStruct2.f310216f = multiMediaEditInfoStruct2.mo86045b("ExtraInfo", "", true);
        }
    }

    /* renamed from: d */
    public void mo142541d() {
        MultiMediaEditInfoStruct multiMediaEditInfoStruct = (MultiMediaEditInfoStruct) this.f336503d;
        if (multiMediaEditInfoStruct != null) {
            multiMediaEditInfoStruct.f310230t = 1;
        }
        mo164099j();
    }

    /* renamed from: g */
    public String mo14584g() {
        return "19904";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r2 = r2.f327035h;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164099j() {
        /*
            r24 = this;
            r0 = r24
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0009
            goto L_0x0023
        L_0x0009:
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r2 = r0.f336495e
            java.lang.Class<l23.t0> r3 = l23.C109232t0.class
            lh2.g0 r2 = r2.mo151221j(r3)
            l23.t0 r2 = (l23.C109232t0) r2
            if (r2 == 0) goto L_0x001f
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r2 = r2.f327035h
            if (r2 == 0) goto L_0x001f
            int r2 = r2.getScrollCount()
            long r2 = (long) r2
            goto L_0x0021
        L_0x001f:
            r2 = 0
        L_0x0021:
            r1.f310228r = r2
        L_0x0023:
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r1 = r0.f336495e
            java.lang.Class<v23.f> r2 = v23.C111348f.class
            lh2.g0 r1 = r1.mo151221j(r2)
            v23.f r1 = (v23.C111348f) r1
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0388
            sp3.k r1 = r1.f333357h
            if (r1 == 0) goto L_0x0388
            com.tencent.mm.plugin.vlog.model.p0 r1 = x23.C102552a.m135387a(r1)
            T r5 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r5
            if (r5 != 0) goto L_0x0040
            goto L_0x005e
        L_0x0040:
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r6 = r0.f336495e
            java.lang.Class<q23.a> r7 = q23.C110351a.class
            lh2.g0 r6 = r6.mo151221j(r7)
            q23.a r6 = (q23.C110351a) r6
            if (r6 == 0) goto L_0x0055
            java.util.List r7 = r1.mo134618o()
            java.lang.String r6 = r6.mo161854L(r7, r2)
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            java.lang.String r7 = "TextInfo"
            java.lang.String r6 = r5.mo86045b(r7, r6, r4)
            r5.f310233w = r6
        L_0x005e:
            T r5 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r5
            if (r5 != 0) goto L_0x0065
            goto L_0x0083
        L_0x0065:
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r6 = r0.f336495e
            java.lang.Class<q23.a> r7 = q23.C110351a.class
            lh2.g0 r6 = r6.mo151221j(r7)
            q23.a r6 = (q23.C110351a) r6
            if (r6 == 0) goto L_0x007a
            java.util.List r7 = r1.mo134618o()
            java.lang.String r6 = r6.mo161853K(r7, r2)
            goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            java.lang.String r7 = "EmojiInfo"
            java.lang.String r6 = r5.mo86045b(r7, r6, r4)
            r5.f310234x = r6
        L_0x0083:
            T r5 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r5
            if (r5 != 0) goto L_0x008a
            goto L_0x0096
        L_0x008a:
            java.lang.String r6 = r1.mo134621r()
            java.lang.String r7 = "TransitionInfo"
            java.lang.String r6 = r5.mo86045b(r7, r6, r4)
            r5.f310235y = r6
        L_0x0096:
            T r5 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r5
            if (r5 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            java.lang.String r6 = r1.mo134620q()
            java.lang.String r7 = "TrSpeedInfo"
            java.lang.String r6 = r5.mo86045b(r7, r6, r4)
            r5.f310236z = r6
        L_0x00a9:
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r1 = r1.f282570c
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = sx3.C36907w.m41090l(r1, r6)
            r5.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ba:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00cc
            java.lang.Object r7 = r1.next()
            com.tencent.mm.plugin.vlog.model.q0 r7 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r7
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r7 = r7.f316500k
            r5.add(r7)
            goto L_0x00ba
        L_0x00cc:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = sx3.C36907w.m41090l(r5, r6)
            r8.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L_0x00d9:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00ef
            java.lang.Object r7 = r1.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r7 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r7
            boolean r7 = r7.isBeauty
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.add(r7)
            goto L_0x00d9
        L_0x00ef:
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r9 = "#"
            java.lang.String r1 = sx3.C110818d0.m150921S(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = sx3.C36907w.m41090l(r5, r6)
            r7.<init>(r8)
            java.util.Iterator r8 = r5.iterator()
        L_0x010b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0125
            java.lang.Object r9 = r8.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r9 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r9
            long r9 = r9.targetDuration
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.add(r9)
            goto L_0x010b
        L_0x0125:
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 62
            r15 = 0
            java.lang.String r8 = "#"
            java.lang.String r7 = sx3.C110818d0.m150921S(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = sx3.C36907w.m41090l(r5, r6)
            r8.<init>(r9)
            java.util.Iterator r9 = r5.iterator()
        L_0x0140:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x015a
            java.lang.Object r10 = r9.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r10 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r10
            long r10 = r10.originDuration
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.add(r10)
            goto L_0x0140
        L_0x015a:
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r9 = "#"
            java.lang.String r8 = sx3.C110818d0.m150921S(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = sx3.C36907w.m41090l(r5, r6)
            r9.<init>(r10)
            java.util.Iterator r10 = r5.iterator()
        L_0x0176:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x018c
            java.lang.Object r11 = r10.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r11 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r11
            int r11 = r11.dragCount
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.add(r11)
            goto L_0x0176
        L_0x018c:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 62
            r17 = 0
            java.lang.String r10 = "#"
            java.lang.String r9 = sx3.C110818d0.m150921S(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = sx3.C36907w.m41090l(r5, r6)
            r10.<init>(r11)
            java.util.Iterator r11 = r5.iterator()
        L_0x01a8:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01be
            java.lang.Object r12 = r11.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r12 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r12
            int r12 = r12.scaleCount
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10.add(r12)
            goto L_0x01a8
        L_0x01be:
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            java.lang.String r11 = "#"
            java.lang.String r10 = sx3.C110818d0.m150921S(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = sx3.C36907w.m41090l(r5, r6)
            r11.<init>(r12)
            java.util.Iterator r12 = r5.iterator()
        L_0x01db:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01f1
            java.lang.Object r13 = r12.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r13 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r13
            int r13 = r13.clickEditCount
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11.add(r13)
            goto L_0x01db
        L_0x01f1:
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 62
            r19 = 0
            java.lang.String r12 = "#"
            java.lang.String r11 = sx3.C110818d0.m150921S(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = sx3.C36907w.m41090l(r5, r6)
            r12.<init>(r13)
            java.util.Iterator r13 = r5.iterator()
        L_0x020f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0225
            java.lang.Object r14 = r13.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r14 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r14
            int r14 = r14.durationCutCount
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.add(r14)
            goto L_0x020f
        L_0x0225:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 62
            r20 = 0
            java.lang.String r13 = "#"
            java.lang.String r12 = sx3.C110818d0.m150921S(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = sx3.C36907w.m41090l(r5, r6)
            r13.<init>(r14)
            java.util.Iterator r14 = r5.iterator()
        L_0x0244:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x025a
            java.lang.Object r15 = r14.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r15 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r15
            int r15 = r15.durationScrollCount
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r13.add(r15)
            goto L_0x0244
        L_0x025a:
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 62
            r21 = 0
            java.lang.String r14 = "#"
            java.lang.String r13 = sx3.C110818d0.m150921S(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = sx3.C36907w.m41090l(r5, r6)
            r14.<init>(r15)
            java.util.Iterator r15 = r5.iterator()
        L_0x027a:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x02a1
            java.lang.Object r16 = r15.next()
            r3 = r16
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r3 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r3
            r23 = r5
            long r4 = r3.targetDuration
            long r2 = r3.originDuration
            int r16 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r16 >= 0) goto L_0x0294
            r2 = 1
            goto L_0x0295
        L_0x0294:
            r2 = 0
        L_0x0295:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.add(r2)
            r5 = r23
            r2 = 0
            r4 = 1
            goto L_0x027a
        L_0x02a1:
            r23 = r5
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r22 = 0
            java.lang.String r15 = "#"
            java.lang.String r2 = sx3.C110818d0.m150921S(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.util.ArrayList r14 = new java.util.ArrayList
            r3 = r23
            int r4 = sx3.C36907w.m41090l(r3, r6)
            r14.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x02c6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02dc
            java.lang.Object r4 = r3.next()
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r4 = (com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) r4
            int r4 = r4.type
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14.add(r4)
            goto L_0x02c6
        L_0x02dc:
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r22 = 0
            java.lang.String r15 = "#"
            java.lang.String r3 = sx3.C110818d0.m150921S(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            T r4 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r4 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r4
            if (r4 != 0) goto L_0x02f8
            r6 = 1
            goto L_0x0301
        L_0x02f8:
            java.lang.String r5 = "isBeauty"
            r6 = 1
            java.lang.String r1 = r4.mo86045b(r5, r1, r6)
            r4.f310217g = r1
        L_0x0301:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0308
            goto L_0x0310
        L_0x0308:
            java.lang.String r4 = "targetDuration"
            java.lang.String r4 = r1.mo86045b(r4, r7, r6)
            r1.f310218h = r4
        L_0x0310:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0317
            goto L_0x031f
        L_0x0317:
            java.lang.String r4 = "originDuration"
            java.lang.String r4 = r1.mo86045b(r4, r8, r6)
            r1.f310219i = r4
        L_0x031f:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0326
            goto L_0x032e
        L_0x0326:
            java.lang.String r4 = "dragCount"
            java.lang.String r4 = r1.mo86045b(r4, r9, r6)
            r1.f310221k = r4
        L_0x032e:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0335
            goto L_0x033d
        L_0x0335:
            java.lang.String r4 = "scaleCount"
            java.lang.String r4 = r1.mo86045b(r4, r10, r6)
            r1.f310222l = r4
        L_0x033d:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0344
            goto L_0x034c
        L_0x0344:
            java.lang.String r4 = "clickEditCount"
            java.lang.String r4 = r1.mo86045b(r4, r11, r6)
            r1.f310223m = r4
        L_0x034c:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0353
            goto L_0x035b
        L_0x0353:
            java.lang.String r4 = "durationCutCount"
            java.lang.String r4 = r1.mo86045b(r4, r12, r6)
            r1.f310224n = r4
        L_0x035b:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0362
            goto L_0x036a
        L_0x0362:
            java.lang.String r4 = "durationScrollCount"
            java.lang.String r4 = r1.mo86045b(r4, r13, r6)
            r1.f310225o = r4
        L_0x036a:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0371
            goto L_0x0379
        L_0x0371:
            java.lang.String r4 = "isDurationCut"
            java.lang.String r2 = r1.mo86045b(r4, r2, r6)
            r1.f310226p = r2
        L_0x0379:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0380
            goto L_0x0388
        L_0x0380:
            java.lang.String r2 = "VideoType"
            java.lang.String r2 = r1.mo86045b(r2, r3, r6)
            r1.f310231u = r2
        L_0x0388:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x038f
            goto L_0x03aa
        L_0x038f:
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r2 = r0.f336495e
            java.lang.Class<m23.c> r3 = m23.C109475c.class
            lh2.g0 r2 = r2.mo151221j(r3)
            m23.c r2 = (m23.C109475c) r2
            if (r2 == 0) goto L_0x03a0
            java.lang.String r2 = r2.mo160712D()
            goto L_0x03a1
        L_0x03a0:
            r2 = 0
        L_0x03a1:
            java.lang.String r3 = "CaptionInfo"
            r4 = 1
            java.lang.String r2 = r1.mo86045b(r3, r2, r4)
            r1.f310232v = r2
        L_0x03aa:
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x03b1
            goto L_0x03b5
        L_0x03b1:
            r2 = 101(0x65, double:5.0E-322)
            r1.f310213D = r2
        L_0x03b5:
            boolean r1 = r0.f336496f
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Integer, java.lang.Long>> r2 = d23.C106976a.f320219l
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            int r4 = r2.size()
            java.lang.String r5 = "count"
            r3.put(r5, r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.util.Collection r2 = r2.values()
            java.lang.String r5 = "labelMap.values"
            gy3.C87412m.m108593f(r2, r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x03d9:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03fc
            java.lang.Object r5 = r2.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r5 = r5.first
            r6.append(r5)
            r5 = 35
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.append(r5)
            goto L_0x03d9
        L_0x03fc:
            java.lang.String r2 = "labelList"
            r3.put(r2, r4)
            java.lang.String r2 = "enable"
            r3.put(r2, r1)
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x040d
            goto L_0x0428
        L_0x040d:
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "json.toString()"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String r2 = z04.C112551y.m153814n(r2, r3, r4, r5)
            java.lang.String r3 = "FilterInfo"
            r4 = 1
            java.lang.String r2 = r1.mo86045b(r3, r2, r4)
            r1.f310210A = r2
        L_0x0428:
            java.lang.String r1 = r24.mo164104i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "filterInfo:"
            r2.append(r3)
            T r3 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r3 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r3
            if (r3 == 0) goto L_0x043f
            java.lang.String r3 = r3.f310210A
            goto L_0x0440
        L_0x043f:
            r3 = 0
        L_0x0440:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r24.mo164103h()
            r1 = 0
            r0.f336503d = r1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct
            r1.<init>()
            r0.f336503d = r1
            java.lang.String r2 = ""
            java.lang.String r3 = "isSlowMotion"
            r4 = 1
            java.lang.String r3 = r1.mo86045b(r3, r2, r4)
            r1.f310220j = r3
            T r1 = r0.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r1
            if (r1 != 0) goto L_0x0469
            goto L_0x0471
        L_0x0469:
            java.lang.String r3 = "ExtraInfo"
            java.lang.String r2 = r1.mo86045b(r3, r2, r4)
            r1.f310216f = r2
        L_0x0471:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y23.C112385a.mo164099j():void");
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 61) {
            MultiMediaEditInfoStruct multiMediaEditInfoStruct = (MultiMediaEditInfoStruct) this.f336503d;
            if (multiMediaEditInfoStruct != null) {
                multiMediaEditInfoStruct.f310230t = 2;
            }
            mo164099j();
        } else if (ordinal == 136) {
            boolean z = false;
            if (bundle != null) {
                z = bundle.getBoolean("PARAM_1_BOOLEAN", false);
            }
            this.f336496f = z;
        }
    }
}
