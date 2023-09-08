package com.tencent.p014mm.plugin.scanner;

import android.graphics.Bitmap;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import vl2.C118684u;

/* renamed from: com.tencent.mm.plugin.scanner.p$$a */
public final /* synthetic */ class p$$a implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ long f347037a;

    /* renamed from: b */
    public final /* synthetic */ String f347038b;

    /* renamed from: c */
    public final /* synthetic */ C118684u.C118686b f347039c;

    /* renamed from: d */
    public final /* synthetic */ int f347040d;

    public /* synthetic */ p$$a(long j, String str, C118684u.C118686b bVar, int i) {
        this.f347037a = j;
        this.f347038b = str;
        this.f347039c = bVar;
        this.f347040d = i;
    }

    /* renamed from: a */
    public final void mo11363a(C92798v vVar) {
        long j = this.f347037a;
        String str = this.f347038b;
        C118684u.C118686b bVar = this.f347039c;
        int i = this.f347040d;
        int ordinal = vVar.f267130a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                Log.m105925i("MicroMsg.PluginScanTranslation", "startTranslationSpr: event:%s  download cost: %s", vVar.f267130a.name(), String.valueOf(System.currentTimeMillis() - j));
                bVar.mo175938W6(i, BitmapUtil.getBitmapNative(str));
                return;
            } else if (ordinal != 11) {
                return;
            }
        }
        Log.m105925i("MicroMsg.PluginScanTranslation", "startTranslationSpr: event:%s", vVar.f267130a.name());
        Log.m105925i("MicroMsg.PluginScanTranslation", "startTranslationSpr post to ui: event:%s", vVar.f267130a.name());
        bVar.mo175938W6(i, (Bitmap) null);
    }
}
