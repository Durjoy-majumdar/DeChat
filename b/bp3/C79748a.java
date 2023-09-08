package bp3;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;

/* renamed from: bp3.a */
public final class C79748a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f233726d;

    /* renamed from: e */
    public final /* synthetic */ RemoteViews f233727e;

    /* renamed from: f */
    public final /* synthetic */ Intent f233728f;

    /* renamed from: g */
    public final /* synthetic */ Context f233729g;

    /* renamed from: h */
    public final /* synthetic */ String f233730h;

    /* renamed from: i */
    public final /* synthetic */ String f233731i;

    /* renamed from: j */
    public final /* synthetic */ String f233732j;

    /* renamed from: n */
    public final /* synthetic */ boolean f233733n;

    /* renamed from: o */
    public final /* synthetic */ boolean f233734o;

    public C79748a(boolean z, RemoteViews remoteViews, Intent intent, Context context, String str, String str2, String str3, boolean z2, boolean z3) {
        this.f233726d = z;
        this.f233727e = remoteViews;
        this.f233728f = intent;
        this.f233729g = context;
        this.f233730h = str;
        this.f233731i = str2;
        this.f233732j = str3;
        this.f233733n = z2;
        this.f233734o = z3;
    }

    public final void run() {
        if (!this.f233726d || AppForegroundDelegate.INSTANCE.f343454n || this.f233727e == null) {
            Log.m105924i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            this.f233728f.putExtra("Voip_Call_From", 1);
            Context context = this.f233729g;
            Intent intent = this.f233728f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Log.m105924i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
        this.f233728f.putExtra("Voip_Call_From", 0);
        Context context3 = this.f233729g;
        Intent intent2 = this.f233728f;
        RemoteViews remoteViews = this.f233727e;
        String str = this.f233730h;
        String str2 = this.f233731i;
        String str3 = this.f233732j;
        boolean z = this.f233733n;
        boolean z2 = this.f233734o;
        C87412m.m108594g(context3, "context");
        C87412m.m108594g(intent2, "intent");
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str3, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        C79754g.m96890a(context3, intent2, remoteViews, str, str2, str3, z, z2);
    }
}
