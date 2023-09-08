package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.ReportAdH5LoadEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.webview.model.w1 */
public final class C43731w1 {

    /* renamed from: a */
    public SnsAdClick f118192a;

    /* renamed from: b */
    public int f118193b;

    /* renamed from: c */
    public final ArrayList<String> f118194c = new ArrayList<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.model.w1$a */
    public static final class C43732a<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C43732a<InputType, ResultType> f118195d = new C43732a<>();

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("reportAdH5Load");
            if (stringArrayList != null && (!stringArrayList.isEmpty())) {
                ReportAdH5LoadEvent reportAdH5LoadEvent = new ReportAdH5LoadEvent();
                reportAdH5LoadEvent.f107740d.f107741a = (SnsAdClick) bundle.getParcelable("snsAdClick");
                ReportAdH5LoadEvent.C40160a aVar = reportAdH5LoadEvent.f107740d;
                QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
                aVar.f107742b = WebViewUtilities.doUrlEncode(stringArrayList.get(0));
                reportAdH5LoadEvent.f107740d.f107744d = Util.safeParseInt(stringArrayList.get(1));
                reportAdH5LoadEvent.f107740d.f107745e = Util.safeParseLong(stringArrayList.get(2));
                reportAdH5LoadEvent.f107740d.f107746f = stringArrayList.get(3);
                reportAdH5LoadEvent.f107740d.f107743c = bundle.getInt("errCode", 0);
                reportAdH5LoadEvent.publish();
            }
        }
    }

    /* renamed from: a */
    public void mo68028a() {
        try {
            if (!this.f118194c.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("reportAdH5Load", new ArrayList(this.f118194c));
                bundle.putInt("errCode", this.f118193b);
                bundle.putParcelable("snsAdClick", this.f118192a);
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C43732a.f118195d.getClass(), (C1256g) null);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebviewReporter", e, "", new Object[0]);
        }
        this.f118192a = null;
        this.f118194c.clear();
    }

    /* renamed from: b */
    public final void mo68029b(String... strArr) {
        C87412m.m108594g(strArr, "loadReports");
        for (String add : strArr) {
            this.f118194c.add(add);
        }
    }

    /* renamed from: c */
    public final void mo68030c(SnsAdClick snsAdClick) {
        this.f118192a = snsAdClick;
    }
}
