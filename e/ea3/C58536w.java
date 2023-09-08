package ea3;

import android.content.Context;
import com.tencent.p014mm.p136ui.component.UIComponentActivity;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import gy3.C87412m;
import od3.C62001a;
import p640ox.C77049b;
import te3.C64291co3;

/* renamed from: ea3.w */
public final class C58536w {

    /* renamed from: a */
    public String f167569a = "";

    /* renamed from: b */
    public int f167570b = 1;

    /* renamed from: c */
    public boolean f167571c;

    /* renamed from: d */
    public long f167572d;

    /* renamed from: e */
    public long f167573e;

    /* renamed from: a */
    public final void mo83444a(Context context) {
        C87412m.m108594g(context, "context");
        if (this.f167573e <= this.f167572d) {
            Log.m105924i("MicroMsg.WebViewRecentForwardReporter", "bottomSheetDismissTiming <= zeroMenuAppearTiming");
            return;
        }
        if (!(context instanceof UIComponentActivity)) {
            Log.m105928w("MicroMsg.WebViewRecentForwardReporter", "getRecentForwardReportInfo, context: " + context);
        }
        C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(context, 14, C64291co3.class);
        if (co32 == null) {
            Log.m105928w("MicroMsg.WebViewRecentForwardReporter", "tryReport, recentForwardReportInfo is null");
            return;
        }
        co32.f182544i = this.f167571c ? 3 : 2;
        co32.f182545j = "49";
        co32.f182546n = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY;
        co32.f182549q = this.f167569a;
        co32.f182539d = this.f167570b;
        co32.f182547o = (int) (this.f167573e - this.f167572d);
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            StringBuilder sb = new StringBuilder();
            sb.append("tryReport, recentForwardReportInfo: ");
            sb.append("RecentForwardReportInfo{exitType: " + co32.f182539d + ", delCount: " + co32.f182540e + ", delList: " + co32.f182541f + ", fastListSeq: " + co32.f182542g + ", OneLineCount: " + co32.f182543h + ", scene: " + co32.f182544i + ", msgType: " + co32.f182545j + ", innerAppMsgType: " + co32.f182546n + ", costTime: " + co32.f182547o + ", logVersion: " + co32.f182548p + ", toUser: " + co32.f182549q + ", startTime: " + co32.f182550r + '}');
            Log.m105918d("MicroMsg.WebViewRecentForwardReporter", sb.toString());
        }
        C62001a.f176265a.mo86878a(context);
        this.f167569a = "";
        this.f167570b = 1;
        this.f167571c = false;
        this.f167572d = 0;
        this.f167573e = 0;
    }
}
