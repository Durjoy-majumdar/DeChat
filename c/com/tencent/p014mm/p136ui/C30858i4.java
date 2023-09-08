package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.autogen.events.TraceOperationEvent;
import com.tencent.p014mm.sdk.event.EventCenter;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.i4 */
public class C30858i4 {

    /* renamed from: com.tencent.mm.ui.i4$a */
    public class C30859a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f82886d;

        /* renamed from: e */
        public final /* synthetic */ int f82887e;

        public C30859a(String str, int i) {
            this.f82886d = str;
            this.f82887e = i;
        }

        public void run() {
            TraceOperationEvent traceOperationEvent = new TraceOperationEvent();
            TraceOperationEvent.C28842a aVar = traceOperationEvent.f79033d;
            aVar.f79034a = this.f82886d;
            aVar.f79035b = this.f82887e;
            traceOperationEvent.publish();
        }
    }

    /* renamed from: a */
    public static void m39248a(int i, String str) {
        if (EventCenter.instance != null) {
            ((C119157j) C119157j.f356862d).mo183876g(new C30859a(str, i), "TraceEventPusher_pushTraceEvent");
        }
    }
}
