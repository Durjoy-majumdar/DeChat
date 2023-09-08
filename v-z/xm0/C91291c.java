package xm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.xweb.IXWebBroadcastListener;

/* renamed from: xm0.c */
public enum C91291c {
    UPDATING(IXWebBroadcastListener.STAGE_PROGRESSED),
    NO_UPDATE("noUpdate"),
    UPDATE_READY("updateReady"),
    UPDATE_FAILED("updateFailed");
    

    /* renamed from: d */
    public final String f261893d;

    /* renamed from: xm0.c$b */
    public static final class C91293b extends C82926s {
        private static final int CTRL_INDEX = -2;
        private static final String NAME = "onUpdateStatusChange";

        public C91293b(C91292a aVar) {
        }
    }

    /* access modifiers changed from: public */
    C91291c(String str) {
        this.f261893d = str;
    }

    public String toString() {
        return this.f261893d;
    }
}
