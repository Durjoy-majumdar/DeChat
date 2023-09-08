package com.tencent.p014mm.plugin.appbrand.game.preload;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.b */
public class C1531b {

    /* renamed from: a */
    public static String f10902a;

    /* renamed from: com.tencent.mm.plugin.appbrand.game.preload.b$a */
    public static final class C1532a implements C80916r<IPCVoid, IPCString> {
        private C1532a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            String str = C86709a0.m107535s().f251807e;
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            return new IPCString(str + "appbrand/loadingurl");
        }
    }
}
