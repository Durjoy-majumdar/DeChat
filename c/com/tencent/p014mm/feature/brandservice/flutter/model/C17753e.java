package com.tencent.p014mm.feature.brandservice.flutter.model;

import com.tencent.p014mm.autogen.events.FinderLiveSwitchEvent;
import com.tencent.pigeon.BizPigeon;

/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.e */
public final class C17753e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterBizPlugin f48879d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveSwitchEvent f48880e;

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.e$a */
    public static final class C17754a<T> implements BizPigeon.BizCallbackApi.Reply {

        /* renamed from: a */
        public static final C17754a<T> f48881a = new C17754a<>();

        public /* bridge */ /* synthetic */ void reply(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    public C17753e(FlutterBizPlugin flutterBizPlugin, FinderLiveSwitchEvent finderLiveSwitchEvent) {
        this.f48879d = flutterBizPlugin;
        this.f48880e = finderLiveSwitchEvent;
    }

    public final void run() {
        BizPigeon.BizCallbackApi bizCallbackApi = this.f48879d.f48843d;
        if (bizCallbackApi != null) {
            bizCallbackApi.onFinderLiveStatusChange(this.f48880e.f154791d.f154793b, C17754a.f48881a);
        }
    }
}
