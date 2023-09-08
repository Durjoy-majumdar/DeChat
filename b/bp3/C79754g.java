package bp3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import p918s2.C90116e;
import zc2.C91661e;

/* renamed from: bp3.g */
public final class C79754g {
    /* renamed from: a */
    public static final void m96890a(Context context, Intent intent, RemoteViews remoteViews, String str, String str2, String str3, boolean z, boolean z2) {
        C90116e.C90121c cVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str3, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        intent.setFlags(268435456);
        if (str2 != null) {
            intent.setClassName(MMApplicationContext.getContext().getPackageName(), str2);
        }
        PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, intent, 134217728);
        if (remoteViews != null) {
            cVar = new C90116e.C90121c(context, str3);
            cVar.f258798j = 1;
            cVar.f258806r = "call";
            long currentTimeMillis = System.currentTimeMillis();
            Notification notification = cVar.f258814z;
            notification.when = currentTimeMillis;
            cVar.f258795g = activity;
            notification.icon = C0966R.C0969drawable.c9k;
            cVar.f258809u = remoteViews;
            cVar.mo124383h(MMApplicationContext.getContext().getString(C0966R.string.a25));
            cVar.f258810v = remoteViews;
            cVar.mo124382g(str);
            cVar.mo124384i(2, true);
            cVar.mo124384i(16, true);
        } else {
            cVar = new C90116e.C90121c(context, str3);
            cVar.f258798j = 1;
            cVar.f258806r = "reminder";
            long currentTimeMillis2 = System.currentTimeMillis();
            Notification notification2 = cVar.f258814z;
            notification2.when = currentTimeMillis2;
            cVar.f258795g = activity;
            notification2.icon = C0966R.C0969drawable.c9k;
            cVar.mo124383h(MMApplicationContext.getContext().getString(C0966R.string.a25));
            cVar.mo124382g(str);
            cVar.mo124384i(2, true);
            cVar.mo124384i(16, true);
        }
        if (z2) {
            cVar.f258796h = activity;
            cVar.mo124384i(128, true);
        }
        Notification b = cVar.mo124378b();
        C87412m.m108593f(b, "builder.build()");
        if (z) {
            b.flags |= 4;
        }
        ((MMNotification) C91661e.f262638a).mo93215l(41, b, true);
    }
}
