package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.c */
public class C81579c implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandAudioOfVideoBackgroundPlayNotificationLogic f239250a;

    public C81579c(AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic) {
        this.f239250a = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadAlbum, localPath: " + str);
        Bitmap o = this.f239250a.mo113828o(BitmapUtil.getBitmapNative(str, AppBrandAudioOfVideoBackgroundPlayNotificationLogic.f239191q, AppBrandAudioOfVideoBackgroundPlayNotificationLogic.f239192r));
        if (o == null) {
            Log.m105928w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadAlbum, albumBitmap is null");
            return;
        }
        this.f239250a.f239201o = o;
        AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f239250a;
        if (appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239198i) {
            Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "refreshNotification, isCanceled");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C81578b(appBrandAudioOfVideoBackgroundPlayNotificationLogic, o));
    }
}
