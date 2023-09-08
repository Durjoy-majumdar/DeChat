package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import j61.C46439j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.a */
public class C93159a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f268676d;

    /* renamed from: e */
    public final /* synthetic */ String f268677e;

    /* renamed from: f */
    public final /* synthetic */ String f268678f;

    /* renamed from: g */
    public final /* synthetic */ String f268679g;

    /* renamed from: h */
    public final /* synthetic */ BaseEmojiStoreUI f268680h;

    public C93159a(BaseEmojiStoreUI baseEmojiStoreUI, String str, String str2, String str3, String str4) {
        this.f268680h = baseEmojiStoreUI;
        this.f268676d = str;
        this.f268677e = str2;
        this.f268678f = str3;
        this.f268679g = str4;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        BaseEmojiStoreUI baseEmojiStoreUI = this.f268680h;
        String str = this.f268676d;
        String str2 = this.f268677e;
        String str3 = this.f268678f;
        String str4 = this.f268679g;
        baseEmojiStoreUI.getClass();
        baseEmojiStoreUI.f268280D = new C46439j(str, str2, str3, (String) null, str4);
        BaseEmojiStoreUI baseEmojiStoreUI2 = this.f268680h;
        baseEmojiStoreUI2.getClass();
        C86709a0.m107529k().f251779b.mo123460f(baseEmojiStoreUI2.f268280D);
        Log.m105925i("MicroMsg.emoji.BaseEmojiStoreUI", "Retry doScene ExchangeEmotionPackNetScene productId:%s", this.f268676d);
        this.f268680h.mo127664g8(this.f268676d, 0);
    }
}
