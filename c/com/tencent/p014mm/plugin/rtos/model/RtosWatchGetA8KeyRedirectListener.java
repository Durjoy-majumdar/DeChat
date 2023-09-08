package com.tencent.p014mm.plugin.rtos.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import eb0.C7624i3;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.rtos.model.RtosWatchGetA8KeyRedirectListener */
public final class RtosWatchGetA8KeyRedirectListener extends IListener<GetA8KeyRedirectEvent> {

    /* renamed from: d */
    public final String f116111d = "MicroMsg.Rtos.RtosWatchGetA8KeyRedirectListener";

    public RtosWatchGetA8KeyRedirectListener() {
        super(C40008f.f107254d);
    }

    public boolean callback(IEvent iEvent) {
        GetA8KeyRedirectEvent getA8KeyRedirectEvent = (GetA8KeyRedirectEvent) iEvent;
        C87412m.m108594g(getA8KeyRedirectEvent, "event");
        Log.m105924i(this.f116111d, "callback");
        GetA8KeyRedirectEvent.C40113a aVar = getA8KeyRedirectEvent.f107573d;
        int i = aVar.f107575a;
        String str = aVar.f107576b;
        if (i != 54) {
            Log.m105929w(this.f116111d, "action code is no RtosWatch code. %d", Integer.valueOf(i));
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w(this.f116111d, "url is empty.");
        } else {
            String queryParameter = Uri.parse(str).getQueryParameter(TPDownloadProxyEnum.USER_MAC);
            String a = C7624i3.f25910c.mo19a("last_avatar_path", "");
            Log.m105925i(this.f116111d, "device mac : %s", queryParameter);
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setClass(MMApplicationContext.getContext(), RtosWatchLoginUI.class);
            intent.putExtra(TPDownloadProxyEnum.USER_MAC, queryParameter);
            intent.putExtra("avatar", a);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener", "callback", "(Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener", "callback", "(Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
