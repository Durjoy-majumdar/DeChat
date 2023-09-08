package com.tencent.p014mm.plugin.music.model.notification;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gc0.C20828a;
import ic0.C108455d;
import ra2.C101365a;

/* renamed from: com.tencent.mm.plugin.music.model.notification.d */
public class C94216d implements C108455d {

    /* renamed from: a */
    public final /* synthetic */ C101365a f272176a;

    /* renamed from: b */
    public final /* synthetic */ String f272177b;

    /* renamed from: c */
    public final /* synthetic */ C94212a f272178c;

    public C94216d(C94212a aVar, C101365a aVar2, String str) {
        this.f272178c = aVar;
        this.f272176a = aVar2;
        this.f272177b = str;
    }

    /* renamed from: a */
    public void mo26263a(boolean z, Object... objArr) {
        Log.m105925i("MicroMsg.Music.MMMusicNotification", "music.field_songAlbumUrl:%s, success:%b", this.f272176a.field_songAlbumUrl, Boolean.valueOf(z));
        if (z) {
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f272177b, (BitmapFactory.Options) null);
            if (decodeFile == null) {
                Log.m105920e("MicroMsg.Music.MMMusicNotification", "bitmap is null, return");
                return;
            }
            C20828a.m22825b().mo32526o(this.f272176a.field_songAlbumUrl, decodeFile);
            this.f272178c.f272168c.mo129507c();
        }
    }
}
