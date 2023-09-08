package com.tencent.p014mm.plugin.multitask;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kotlin.Metadata;
import n92.C117617a;
import rx3.C13598b0;
import te3.C110964i13;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/w;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.w */
public final class C105926w implements C80883e<Bundle, Bundle> {
    public C105926w() {
        Log.m105924i("MicroMsg.MultiTask.ReportTaskInfoTask", "create report task info");
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            int i = bundle.getInt("reporttype");
            byte[] byteArray = bundle.getByteArray("reportdata");
            C110964i13 i132 = new C110964i13();
            if (byteArray != null) {
                try {
                    i132.parseFrom(byteArray);
                } catch (Exception unused) {
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            ((C105923s) C86312j.m106911c(C105923s.class)).getClass();
            if (i == 2) {
                C117617a aVar = C117617a.f351848a;
                aVar.mo182344f(i132);
                aVar.mo182345g(i132.f332060g, i132.f332065o);
            } else if (i == 3) {
                C117617a.f351848a.mo182343e(i132);
            }
        }
    }
}
