package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.content.Context;
import aw0.C79636p;
import com.tencent.p014mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84496e;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import di3.C86312j;
import eb0.C86493v0;
import f12.C7970a;
import java.util.Set;
import p646pn.C89389h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC */
public class JsApiSetBackgroundAudioStateWC extends JsApiSetBackgroundAudioState {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC */
    public static class SetBackgroundAudioListenerTaskWC extends JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask {

        /* renamed from: t */
        public C86493v0.C86495c f240650t;

        /* renamed from: u */
        public C84498l f240651u;

        /* renamed from: v */
        public Context f240652v;

        public SetBackgroundAudioListenerTaskWC(C82268c cVar, C82381f fVar, int i) {
            super(cVar, fVar, i);
            this.f240652v = fVar.getContext();
        }

        /* renamed from: q */
        public void mo114506q(int i) {
            if (i == 0 || i == 1) {
                this.f240650t.mo120962i("setBackgroundAudioState#isPlaying", Boolean.TRUE);
                Set<C84498l> set = C84496e.f246615a;
                if (!((C89389h) C86312j.m106911c(C89389h.class)).mo123724ad()) {
                    AppBrandFloatBallPermissionHelper.m100447a(this.f240652v, 6, (C79636p) null);
                }
            } else if (i == 2 || i == 3 || i == 4 || i == 7) {
                this.f240650t.mo120962i("setBackgroundAudioState#isPlaying", Boolean.FALSE);
                Set<C84498l> set2 = C84496e.f246615a;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioStateTaskWC */
    public static class SetBackgroundAudioStateTaskWC extends JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask {
        public SetBackgroundAudioStateTaskWC(C82268c cVar, C82381f fVar, int i) {
            super(cVar, fVar, i);
        }

        /* renamed from: q */
        public String mo114509q(String str) {
            return C7970a.m8127a() + str.hashCode();
        }
    }
}
