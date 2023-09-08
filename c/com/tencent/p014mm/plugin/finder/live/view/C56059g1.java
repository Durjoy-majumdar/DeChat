package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.ArrayList;
import java.util.LinkedList;
import ls3.C10649f;
import p282z2.C16095a;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64686ro2;
import te3.C64766v41;
import wx2.C66204d;

/* renamed from: com.tencent.mm.plugin.finder.live.view.g1 */
public final class C56059g1 implements C66204d.C38350a {
    /* renamed from: D1 */
    public void mo61631D1(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        C86709a0.m107522a();
    }

    /* renamed from: Q0 */
    public void mo61632Q0(MultiTaskInfo multiTaskInfo) {
        String str;
        String str2;
        C64273c21 c212;
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        C87412m.m108594g(multiTaskInfo2, "multiTaskInfo");
        if (C86709a0.m107522a()) {
            C64766v41 v412 = new C64766v41();
            try {
                v412.parseFrom(multiTaskInfo2.field_data);
            } catch (Throwable th) {
                Log.m105921e("FinderLiveMultiTaskHelper", "MegaVideoFloatBallInfo parse fail", th);
            }
            v412.f185828d = multiTaskInfo2.field_id;
            ArrayList arrayList = new ArrayList();
            LinkedList<FinderObject> linkedList = v412.f185837p;
            C87412m.m108593f(linkedList, "data.allHistoryFinderObjectList");
            if (!linkedList.isEmpty()) {
                arrayList.addAll(v412.f185837p);
            } else {
                FinderObject finderObject = v412.f185835n;
                if (finderObject == null) {
                    finderObject = new FinderObject();
                    Log.m105920e("FinderLiveMultiTaskHelper", "data.finderObject null");
                    finderObject.objectNonceId = v412.f185830f;
                    finderObject.f164794id = v412.f185831g;
                }
                arrayList.add(finderObject);
            }
            int b = v412.f185837p.size() > 0 ? C16095a.m14980b(v412.f185836o, 0, v412.f185837p.size() - 1) : 0;
            FinderObject finderObject2 = v412.f185835n;
            int i = (finderObject2 == null || (c212 = finderObject2.liveInfo) == null) ? 0 : c212.f182393e;
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            FinderObject finderObject3 = v412.f185835n;
            long j = finderObject3 != null ? finderObject3.f164794id : v412.f185831g;
            long j2 = v412.f185829e;
            if (finderObject3 == null || (str = finderObject3.username) == null) {
                str = v412.f185832h;
            }
            C8777j5.C8778a.m8603d(j5Var, j, j2, str, (long) v412.f185836o, (long) i, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "temp_15", (String) null, 0, 384, (Object) null);
            Intent intent = new Intent();
            intent.putExtra("KEY_MULTI_TASK_INFO", v412.toByteArray());
            C64279c90 c902 = new C64279c90();
            String str3 = "";
            c902.f182444d = str3;
            c902.f182445e = str3;
            c902.f182446f = false;
            c902.f182447g = 1010;
            c902.f182448h = -1;
            c902.f182449i = 1;
            C64686ro2 ro22 = new C64686ro2();
            FinderObject finderObject4 = v412.f185835n;
            if (!(finderObject4 == null || (str2 = finderObject4.nickname) == null)) {
                str3 = str2;
            }
            ro22.f185215f = str3;
            c902.f182450j = ro22;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            ((C10649f) C86312j.m106911c(C10649f.class)).mo10913cP(context, intent, arrayList, b, c902, (C10649f.C10650a) null);
        }
    }

    /* renamed from: m1 */
    public void mo61633m1(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        C86709a0.m107522a();
    }
}
