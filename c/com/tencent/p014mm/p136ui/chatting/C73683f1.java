package com.tencent.p014mm.p136ui.chatting;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Locale;
import lb0.C88394b;
import s90.C77630j;

/* renamed from: com.tencent.mm.ui.chatting.f1 */
public class C73683f1 implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C77630j f216337d;

    public C73683f1(C77630j jVar) {
        this.f216337d = jVar;
    }

    /* renamed from: b */
    public void mo1907b() {
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return String.format(Locale.ENGLISH, "CHATTING_ITEM_APPMSG_APPBRAND_COVER[%d %d]", new Object[]{112, 90});
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        Log.m105919d("MicroMsg.ChattingEditModeSendToAppBrand", "onBitmapLoaded %s", this.f216337d.f226341w);
    }
}
