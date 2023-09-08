package x42;

import com.tencent.p014mm.plugin.magicbrush.base.MBJsEventBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import e42.C7596h;
import e42.C7597n;
import e42.C86430i;
import gy3.C87412m;
import java.util.HashMap;
import z04.C112550d0;

/* renamed from: x42.b */
public abstract class C91140b extends C86430i<C7597n> implements C91139a {
    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("url");
        if (Util.isNullOrNil(optString)) {
            mo120840p().invoke(mo120842g(300005, "url is null or nil"));
            return;
        }
        String taskId = getTaskId();
        if (Util.isNullOrNil(taskId)) {
            mo120840p().invoke(mo120842g(300004, "taskId is null or nil"));
            return;
        }
        String str = mo120841d().f26666a;
        C87412m.m108594g(str, "instanceName");
        String g0 = C112550d0.m153797g0(str, "-", str);
        if (hVar.optInt("timeout", CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) <= 0) {
            mo120840p().invoke(mo120842g(300005, "timeout is invalid"));
            return;
        }
        mo125209c(hVar, taskId, optString, g0);
        HashMap hashMap = new HashMap();
        hashMap.put(mo125208a(), taskId);
        mo120840p().invoke(mo120846k(hashMap));
    }

    /* renamed from: r */
    public final void mo125211r(MBJsEventBase mBJsEventBase) {
        C87412m.m108594g(mBJsEventBase, "event");
        C7597n nVar = (C7597n) this.f251227a;
        if (nVar != null) {
            nVar.mo8722f0(mBJsEventBase);
        }
    }
}
