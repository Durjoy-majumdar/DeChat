package com.tencent.p014mm.plugin.webview.p128ui.tools.floatball;

import android.content.Intent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.internal.ConstValue;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.f */
public final class C43868f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43861d.C43862a f118796d;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/content/Intent;", "kotlin.jvm.PlatformType", "intent", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/content/Intent;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.f$a */
    public static final class C43869a<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C43869a<InputType, ResultType> f118797d = new C43869a<>();

        public void invoke(Object obj, C1256g gVar) {
            Intent intent = (Intent) obj;
            C43861d dVar = C43861d.f118783a;
            C87412m.m108593f(intent, "intent");
            C43861d.m48033a(dVar, intent);
        }
    }

    public C43868f(C43861d.C43862a aVar) {
        this.f118796d = aVar;
    }

    public final void run() {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f118796d.f118788a);
        if (!Util.isNullOrNil(this.f118796d.f118790c)) {
            intent.putExtra("float_ball_key", this.f118796d.f118790c);
            if (this.f118796d.f118789b != null) {
                String str = C44594n1.m49046b() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS;
                C87412m.m108593f(str, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
                C28947a.m38500a(str, intent, C43869a.f118797d, (C32226l) null);
            }
        }
    }
}
