package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44080p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import s90.C48300n;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.t */
public final class C44085t {

    /* renamed from: a */
    public C48300n f119434a;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.t$a */
    public static final class C44086a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C44085t f119435d;

        /* renamed from: e */
        public final /* synthetic */ Activity f119436e;

        public C44086a(C44085t tVar, Activity activity) {
            this.f119435d = tVar;
            this.f119436e = activity;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            if (((Bundle) obj).getBoolean("ret", true)) {
                MMHandlerThread.postToMainThread(new C44083r(this.f119436e, this.f119435d));
                return;
            }
            this.f119435d.getClass();
            Log.m105928w("MicroMsg.MPVideoTransmit", "share fail");
            MMHandlerThread.postToMainThread(new C44084s(this.f119436e, this.f119435d));
        }
    }

    /* renamed from: a */
    public final boolean mo68718a(Activity activity, int i, int i2, Intent intent) {
        C48590l lVar;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (203 != i) {
            return false;
        }
        if (this.f119434a == null) {
            Log.m105928w("MicroMsg.MPVideoTransmit", "onActivityResult mpMsgInfo is null");
            return true;
        }
        if (i2 == -1) {
            String str = null;
            String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            if (stringExtra != null) {
                C48300n nVar = this.f119434a;
                C87412m.m108591d(nVar);
                C44086a aVar = new C44086a(this, activity);
                MpVideoDataParcelable mpVideoDataParcelable = new MpVideoDataParcelable();
                mpVideoDataParcelable.f119396d = stringExtra;
                mpVideoDataParcelable.f119398f = str;
                mpVideoDataParcelable.f119400h = nVar;
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, mpVideoDataParcelable, C44080p.C44081a.class, aVar);
            }
        } else {
            Log.m105928w("MicroMsg.MPVideoTransmit", "share cancel");
            if ((activity instanceof WebViewUI) && (lVar = ((WebViewUI) activity).f118508Z) != null) {
                C48300n nVar2 = this.f119434a;
                C87412m.m108591d(nVar2);
                lVar.mo73208E(nVar2.f133368f, "canceled");
            }
        }
        return true;
    }
}
