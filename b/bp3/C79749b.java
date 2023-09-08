package bp3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import ke3.C88144b;
import z04.C112551y;

/* renamed from: bp3.b */
public final class C79749b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f233735d;

    /* renamed from: e */
    public final /* synthetic */ RemoteViews f233736e;

    /* renamed from: f */
    public final /* synthetic */ Intent f233737f;

    /* renamed from: g */
    public final /* synthetic */ String f233738g;

    /* renamed from: h */
    public final /* synthetic */ String f233739h;

    /* renamed from: i */
    public final /* synthetic */ Context f233740i;

    /* renamed from: j */
    public final /* synthetic */ String f233741j;

    /* renamed from: n */
    public final /* synthetic */ String f233742n;

    /* renamed from: o */
    public final /* synthetic */ boolean f233743o;

    public C79749b(boolean z, RemoteViews remoteViews, Intent intent, String str, String str2, Context context, String str3, String str4, boolean z2) {
        this.f233735d = z;
        this.f233736e = remoteViews;
        this.f233737f = intent;
        this.f233738g = str;
        this.f233739h = str2;
        this.f233740i = context;
        this.f233741j = str3;
        this.f233742n = str4;
        this.f233743o = z2;
    }

    public final void run() {
        String str;
        if (!this.f233735d || AppForegroundDelegate.INSTANCE.f343454n || this.f233736e == null) {
            this.f233737f.putExtra("startMethod", 1);
            Log.m105924i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            C88144b.m109791i(this.f233740i, this.f233738g, this.f233739h, this.f233737f, (Bundle) null);
            return;
        }
        Log.m105924i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
        this.f233737f.putExtra("startMethod", 0);
        String str2 = MMApplicationContext.getSourcePackageName() + ".plugin." + this.f233738g;
        if (C112551y.m153820t(this.f233739h, ".", false, 2, (Object) null)) {
            str = str2 + this.f233739h;
        } else {
            str = this.f233739h;
        }
        String str3 = str;
        Class.forName(str3, false, this.f233740i.getClassLoader());
        Context context = this.f233740i;
        Intent intent = this.f233737f;
        RemoteViews remoteViews = this.f233736e;
        String str4 = this.f233741j;
        String str5 = this.f233742n;
        boolean z = this.f233743o;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str4, "description");
        C87412m.m108594g(str5, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        C79754g.m96890a(context, intent, remoteViews, str4, str3, str5, z, true);
    }
}
