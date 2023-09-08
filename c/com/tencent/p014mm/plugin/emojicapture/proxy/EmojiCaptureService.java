package com.tencent.p014mm.plugin.emojicapture.proxy;

import android.app.Notification;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.service.MMService;
import gy3.C87412m;
import kotlin.Metadata;
import p206nj.C11171e;
import p918s2.C90116e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureService;", "Lcom/tencent/mm/service/MMService;", "<init>", "()V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureService */
public final class EmojiCaptureService extends MMService {

    /* renamed from: i */
    public final String f269155i = "MicroMsg.EmojiCaptureService";

    /* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureService$a */
    public static final class C93280a implements Runnable {

        /* renamed from: d */
        public static final C93280a f269156d = new C93280a();

        public final void run() {
        }
    }

    /* renamed from: d */
    public void mo112546d() {
        super.mo112546d();
        Log.m105924i(this.f269155i, "onCreate: ");
        if (C11171e.m11046c(26)) {
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.f258814z.icon = C0966R.C0969drawable.c9k;
            cVar.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.f360364c53));
            Notification b = cVar.mo124378b();
            C87412m.m108593f(b, "getNotificationBuilder(\n…                 .build()");
            this.f249814f.startForeground(-2564, b);
        }
        EmojiCaptureProxy.f269148h.mo127970a();
        C96905d serverProxy = EmojiCaptureProxy.f269149i.getServerProxy();
        if (serverProxy != null) {
            serverProxy.mo135257a(C93280a.f269156d);
        }
    }

    /* renamed from: e */
    public void mo112547e() {
        super.mo112547e();
        Log.m105924i(this.f269155i, "onDestroy: ");
        this.f249814f.stopForeground(true);
        EmojiCaptureProxy.f269148h.mo127971b();
    }
}
