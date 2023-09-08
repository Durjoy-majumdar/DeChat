package bp3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import p206nj.C11171e;
import rx3.C13598b0;

/* renamed from: bp3.c */
public final class C79750c {

    /* renamed from: bp3.c$a */
    public static final class C79751a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f233744d;

        /* renamed from: e */
        public final /* synthetic */ Context f233745e;

        /* renamed from: f */
        public final /* synthetic */ Intent f233746f;

        /* renamed from: g */
        public final /* synthetic */ String f233747g;

        /* renamed from: h */
        public final /* synthetic */ String f233748h;

        /* renamed from: i */
        public final /* synthetic */ String f233749i;

        /* renamed from: j */
        public final /* synthetic */ boolean f233750j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79751a(boolean z, Context context, Intent intent, String str, String str2, String str3, boolean z2) {
            super(0);
            this.f233744d = z;
            this.f233745e = context;
            this.f233746f = intent;
            this.f233747g = str;
            this.f233748h = str2;
            this.f233749i = str3;
            this.f233750j = z2;
        }

        public Object invoke() {
            if (!this.f233744d || AppForegroundDelegate.INSTANCE.f343454n) {
                Log.m105924i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
                Context context = this.f233745e;
                Intent intent = this.f233746f;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$startActivity$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$startActivity$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                Log.m105924i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
                Context context3 = this.f233745e;
                Intent intent2 = this.f233746f;
                String str = this.f233747g;
                String str2 = this.f233748h;
                String str3 = this.f233749i;
                boolean z = this.f233750j;
                C87412m.m108594g(context3, "context");
                C87412m.m108594g(intent2, "intent");
                C87412m.m108594g(str, "description");
                C87412m.m108594g(str3, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
                C79754g.m96890a(context3, intent2, (RemoteViews) null, str, str2, str3, z, true);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bp3.c$b */
    public static final class C79752b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f233751d;

        public C79752b(C32224a aVar) {
            this.f233751d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f233751d.invoke();
        }
    }

    /* renamed from: a */
    public static final void m96888a(Context context, Intent intent, String str, String str2, boolean z, String str3, boolean z2) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        Intent intent2 = intent;
        C87412m.m108594g(intent, "intent");
        String str4 = str;
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str3, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        long j = z ? 0 : 800;
        C79751a aVar = new C79751a(C11171e.m11045b(28) || C87412m.m108589b(Build.VERSION.CODENAME, "Q"), context, intent, str, str2, str3, z2);
        if (j <= 0) {
            aVar.invoke();
        } else {
            MMHandlerThread.postToMainThreadDelayed(new C79752b(aVar), j);
        }
    }
}
