package p642oz;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import bp3.C79748a;
import bp3.C79749b;
import bp3.C79750c;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p206nj.C11171e;
import p657pz.C89445b;
import zc2.C91661e;

@C86522b
/* renamed from: oz.a */
public final class C89303a extends C86301e implements C89445b {
    /* renamed from: Ca */
    public void mo123645Ca() {
        ((MMNotification) C91661e.f262638a).mo93207e(41);
    }

    /* renamed from: Kt */
    public void mo123646Kt(Context context, String str, String str2, Intent intent, RemoteViews remoteViews, String str3, boolean z, String str4, boolean z2) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        String str5 = str;
        C87412m.m108594g(str, "plugin");
        C87412m.m108594g(str2, "entry");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str3, "description");
        C87412m.m108594g(str4, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        MMHandlerThread.postToMainThreadDelayed(new C79749b(C11171e.m11045b(28) || C87412m.m108589b(Build.VERSION.CODENAME, "Q"), remoteViews, intent, str, str2, context, str3, str4, z2), z ? 0 : 800);
    }

    public void Mo0(Context context, Intent intent, String str, String str2, boolean z, String str3, boolean z2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str3, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        C79750c.m96888a(context, intent, str, str2, z, str3, z2);
    }

    /* renamed from: UT */
    public void mo123648UT(Context context, Intent intent, RemoteViews remoteViews, String str, String str2, boolean z, String str3, boolean z2, boolean z3) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        Intent intent2 = intent;
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str3, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        MMHandlerThread.postToMainThreadDelayed(new C79748a(C11171e.m11045b(28) || C87412m.m108589b(Build.VERSION.CODENAME, "Q"), remoteViews, intent, context, str, str2, str3, z2, z3), z ? 0 : 800);
    }
}
