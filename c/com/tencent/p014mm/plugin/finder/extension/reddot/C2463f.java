package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import te3.C64586nn1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.f */
public final class C2463f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f12922d;

    /* renamed from: e */
    public final /* synthetic */ C2469j f12923e;

    public C2463f(String str, C2469j jVar) {
        this.f12922d = str;
        this.f12923e = jVar;
    }

    public final void run() {
        Class cls = FinderCommonFeatureService.class;
        long currentTimeMillis = System.currentTimeMillis();
        int qq = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().mo73553qq(2, 2, this.f12922d);
        int i = 1;
        int qq4 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().mo73553qq(2, 1, this.f12922d);
        C55718s0 i2 = this.f12923e.f12929a.mo77269i("finder_private_msg_entrance", this.f12922d);
        if (!(i2 != null && i2.field_ctrInfo.f144670e == 1007)) {
            if (i2 != null && i2.field_ctrInfo.f144670e == 1006) {
                C64586nn1 o2 = i2.mo77308o2("finder_private_msg_entrance");
                int i3 = o2 != null ? o2.f184503e : 0;
                if (i3 != qq) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(20492, 1L, 1L, Long.valueOf(currentTimeMillis));
                    nVar.mo175913w(1473, 1, 1);
                }
                i = i3;
            } else {
                i = 0;
            }
        } else if (qq4 <= 0) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160131h(20492, 2L, 1L, Long.valueOf(currentTimeMillis));
            nVar2.mo175913w(1473, 2, 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[checkMsgRedDot] token=");
        sb.append(currentTimeMillis);
        sb.append(" cost=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append("ms, [normalUnReadCount:redDotCount]=[");
        sb.append(qq);
        sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        sb.append(i);
        sb.append("] greetUnReadCount=");
        sb.append(qq4);
        sb.append(" ctrlType=[");
        sb.append(i2 != null ? Integer.valueOf(i2.field_ctrInfo.f144670e) : null);
        sb.append(']');
        Log.m105924i("Finder.MsgRedDotHandler", sb.toString());
    }
}
