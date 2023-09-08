package eg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p165hr.C60106t;
import p565ir.C60606n;
import te3.C51713vn0;
import te3.C64273c21;
import z04.C112550d0;

/* renamed from: eg1.y */
public final class C31597y implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ long f84438a;

    /* renamed from: b */
    public final /* synthetic */ String f84439b;

    /* renamed from: c */
    public final /* synthetic */ HashMap<Long, C72963f4> f84440c;

    public C31597y(long j, String str, HashMap<Long, C72963f4> hashMap) {
        this.f84438a = j;
        this.f84439b = str;
        this.f84440c = hashMap;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        long j2 = j;
        Object obj2 = obj;
        if (this.f84438a != j2) {
            C31595x xVar = C31595x.f84430a;
            Log.m105920e("FinderLiveNotifyRefreshManager", "refreshLiveInfo error,respLiveId:" + j2 + ",liveId:" + this.f84438a + ",tipsId:" + this.f84439b + '!');
        } else if (!(obj2 instanceof C51713vn0)) {
            C31595x xVar2 = C31595x.f84430a;
            Log.m105920e("FinderLiveNotifyRefreshManager", "refreshLiveInfo error,liveInfoResp:" + obj2 + ",liveId:" + this.f84438a + ",tipsId:" + this.f84439b + '!');
        } else {
            C72963f4 f4Var = this.f84440c.get(Long.valueOf(j));
            C51713vn0 vn02 = (C51713vn0) obj2;
            C64273c21 c212 = vn02.f143572d;
            boolean z = false;
            if (!(f4Var == null || c212 == null)) {
                C72963f4 f4Var2 = f4Var;
                String content = f4Var2.getContent();
                if (content != null) {
                    String str = content;
                    int E = C112550d0.m153769E(content, "<status>", 0, false, 6, (Object) null) + 8;
                    int E2 = C112550d0.m153769E(str, "</status>", 0, false, 6, (Object) null);
                    if (E > 0 && E2 >= 0 && E <= E2) {
                        String content2 = f4Var2.getContent();
                        f4Var2.mo108732L2(content2 != null ? C112550d0.m153781Q(content2, E, E2, String.valueOf(c212.f182394f)).toString() : null);
                        z = true;
                    }
                }
                if (z) {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(f4Var2.getMsgId(), f4Var2);
                    ((C60106t) C86312j.m106911c(C60106t.class)).Bx0().mo59080Yt(f4Var2.getMsgId(), c212.f182394f);
                }
            }
            C31595x xVar3 = C31595x.f84430a;
            Log.m105924i("FinderLiveNotifyRefreshManager", "refreshLiveInfo liveId:" + this.f84438a + ",tipsId:" + this.f84439b + ",replaceLiveStatusSuc:" + z + ",isPageFocus:" + C31595x.f84434e + '!');
            if (C31595x.f84434e) {
                int i2 = vn02.f143574f;
                int i3 = C31595x.f84435f;
                if (i2 < i3) {
                    i2 = i3;
                }
                C31595x xVar4 = C31595x.f84430a;
                Map<String, Long> map = C31595x.f84431b;
                C87412m.m108593f(map, "nextTaskTimeStampMap");
                map.put(this.f84439b, Long.valueOf((long) (C31543z5.m39455e() + i2)));
                LinkedList<C72963f4> linkedList = C31595x.f84433d;
                if (linkedList != null) {
                    MMHandler mMHandler = C31595x.f84436g;
                    int i4 = C31595x.f84432c;
                    mMHandler.removeMessages(i4);
                    MMHandler mMHandler2 = C31595x.f84436g;
                    mMHandler2.sendMessageDelayed(mMHandler2.obtainMessage(i4, linkedList), ((long) i2) * ((long) 1000));
                }
            }
        }
    }
}
