package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p523fp.C32147e;
import p928ac.C79490b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.e0 */
public class C1612e0 implements C79490b.C79500i {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.e0$a */
    public static final class C1613a implements C80883e<IPCVoid, IPCVoid> {
        private C1613a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i("MicroMsg.Audio.WxAudioSupportDelegateImpl", "doCheck resType libwxaudio.aar");
            ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(88);
        }
    }
}
