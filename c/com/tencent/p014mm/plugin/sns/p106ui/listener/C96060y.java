package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.y */
public class C96060y extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280477d;

    public C96060y(TimelineClickListener timelineClickListener) {
        this.f280477d = timelineClickListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a1, code lost:
        if (r1 != false) goto L_0x00ab;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133570a(android.view.ContextMenu r9, android.view.View r10, android.view.ContextMenu.ContextMenuInfo r11) {
        /*
            r8 = this;
            java.lang.String r11 = "onMMCreateContextMenu"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r0)
            java.lang.Object r1 = r10.getTag()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96066m2
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r10 = r10.getTag()
            com.tencent.mm.plugin.sns.ui.m2 r10 = (com.tencent.p014mm.plugin.sns.p106ui.C96066m2) r10
            boolean r1 = r10.f280511n
            r2 = 0
            if (r1 != 0) goto L_0x002d
            r1 = 19
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r8.f280477d
            android.app.Activity r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r3)
            r4 = 2131823553(0x7f110bc1, float:1.9279909E38)
            java.lang.String r3 = r3.getString(r4)
            r9.add(r2, r1, r2, r3)
        L_0x002d:
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r3 = "SIGHTCannotTransmitForFav"
            java.lang.String r1 = r1.mo107405c(r3)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            if (r1 != 0) goto L_0x00aa
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r10.f280498a
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            int r1 = r1.size()
            java.lang.String r3 = "MicroMsg.TimelineOnCreateContextMenuListener"
            if (r1 <= 0) goto L_0x00a4
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r10.f280498a
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            java.lang.Object r1 = r1.get(r2)
            te3.kv2 r1 = (te3.C101804kv2) r1
            java.lang.String r4 = r1.f298689d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r6, r4)
            r5.append(r4)
            java.lang.String r4 = vr2.C102236a0.m134729X(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = r10.f280499b
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120287f(r5, r1)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r2] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "config can forward sight, thumb existed %B, video existed %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            if (r4 == 0) goto L_0x00aa
            if (r1 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00a4:
            java.lang.String r1 = "sight item had not attch."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            java.lang.String r1 = "favorite"
            ke3.C88144b.m109788f(r1)
            r1 = 10
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r8.f280477d
            android.app.Activity r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r3)
            r4 = 2131834033(0x7f1134b1, float:1.9301165E38)
            java.lang.String r3 = r3.getString(r4)
            r9.add(r2, r1, r2, r3)
            if (r7 == 0) goto L_0x00ea
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r1 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r3 = r1.f236178d
            java.lang.String r10 = r10.f280499b
            r3.f236181b = r10
            r1.publish()
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r10 = r1.f236179e
            boolean r10 = r10.f236182a
            if (r10 == 0) goto L_0x00ea
            r10 = 18
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r8.f280477d
            android.app.Activity r1 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r1)
            r3 = 2131821618(0x7f110432, float:1.9275984E38)
            java.lang.String r1 = r1.getString(r3)
            r9.add(r2, r10, r2, r1)
        L_0x00ea:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.listener.C96060y.mo133570a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31");
        if (view.getTag() instanceof C96066m2) {
            String str = ((C96066m2) view.getTag()).f280499b;
            this.f280477d.f280381k.mo133554b(view, str, C94866e1.Yx0().mo139798DN(str).getTimeLine());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31");
        return false;
    }
}
