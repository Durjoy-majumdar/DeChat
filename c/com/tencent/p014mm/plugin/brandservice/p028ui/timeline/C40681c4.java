package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import java.util.Map;
import q73.C47776i;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.c4 */
public class C40681c4 implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f109294d;

    public C40681c4(BizTimeLineUI bizTimeLineUI) {
        this.f109294d = bizTimeLineUI;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        C18508z2 z2Var = this.f109294d.f50246s;
        C19623o0 p = z2Var != null ? z2Var.mo23159p() : null;
        if (p != null) {
            C48009v0.Jx0().c40(p.field_orderFlag);
        } else {
            C48009v0.Jx0().h30();
        }
        C19627t tVar = C19627t.f55586a;
        if (!C19627t.f55610y) {
            return false;
        }
        BizTLRecCardJsEngine.Companion companion = BizTLRecCardJsEngine.f247961Y;
        BizTLRecCardJsEngine bizTLRecCardJsEngine = BizTLRecCardJsEngine.f247960R0;
        if (bizTLRecCardJsEngine == null) {
            return false;
        }
        synchronized (bizTLRecCardJsEngine) {
            for (Map.Entry<String, Integer> key : bizTLRecCardJsEngine.f257697D.entrySet()) {
                String str = (String) key.getKey();
                bizTLRecCardJsEngine.mo60865I0("enterUI", "{target:'" + str + "'}", new C47776i(bizTLRecCardJsEngine, str));
            }
        }
        return false;
    }
}
