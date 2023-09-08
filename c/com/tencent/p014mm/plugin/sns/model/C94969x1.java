package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ms2.C99968n;
import ob0.C11385n;
import ob0.C117747y;
import te3.u84;

/* renamed from: com.tencent.mm.plugin.sns.model.x1 */
public class C94969x1 implements C11385n {

    /* renamed from: d */
    public List<Long> f275313d = new ArrayList();

    /* renamed from: e */
    public C99968n f275314e = null;

    /* renamed from: f */
    public int f275315f = 50;

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsObject peekLast;
        C117747y yVar2 = yVar;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadPreloader");
        C94974y1 fy02 = C94866e1.fy0();
        fy02.getClass();
        SnsMethodCalculate.markStartTimeMs("isJumpEnable", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        boolean z = fy02.f275347b;
        SnsMethodCalculate.markEndTimeMs("isJumpEnable", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (z && (yVar2 instanceof C94916o0)) {
            C94916o0 o0Var = (C94916o0) yVar2;
            u84 k1 = o0Var.mo131170k1();
            SnsMethodCalculate.markStartTimeMs("isForUnreadPreload", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            boolean z2 = o0Var.f275070u == 2;
            SnsMethodCalculate.markEndTimeMs("isForUnreadPreload", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            Log.m105925i("MicroMsg.SnsUnreadPreloader", "errType:%s, errCode:%s, isForUnreadPreload:%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2));
            if (z2 && k1 != null && !Util.isNullOrNil((List) k1.f299592f) && !Util.isNullOrNil((List) this.f275313d) && (peekLast = k1.f299592f.peekLast()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<SnsObject> it = k1.f299592f.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(it.next().f283891Id));
                }
                ((ArrayList) this.f275313d).removeAll(arrayList);
                if (!((ArrayList) this.f275313d).isEmpty()) {
                    long j = peekLast.f283891Id;
                    ArrayList arrayList2 = (ArrayList) this.f275313d;
                    if (j >= ((Long) arrayList2.get(arrayList2.size() - 1)).longValue()) {
                        C99968n nVar = this.f275314e;
                        int i3 = nVar.f292922j;
                        if (i3 > this.f275315f) {
                            Log.m105924i("MicroMsg.SnsUnreadPreloader", "drop preload unread fault, too many times!!");
                            this.f275314e.f292918f = 3;
                            ((ArrayList) this.f275313d).clear();
                        } else {
                            nVar.f292922j = i3 + 1;
                            Log.m105925i("MicroMsg.SnsUnreadPreloader", "continue preload unread fault, maxId:%s, preloadCount:%s, unreadItem:%s", ((ArrayList) this.f275313d).get(0), Integer.valueOf(this.f275314e.f292922j), this.f275314e);
                            C86709a0.m107529k().f251779b.mo123460f(new C94916o0(((Long) ((ArrayList) this.f275313d).get(0)).longValue() + 1, 0, 2));
                        }
                    }
                }
                Log.m105924i("MicroMsg.SnsUnreadPreloader", "finish preload unread fault");
                this.f275314e.f292918f = 1;
                ((ArrayList) this.f275313d).clear();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadPreloader");
    }
}
