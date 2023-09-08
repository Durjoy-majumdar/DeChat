package com.tencent.p014mm.plugin.multitask;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import kotlin.Metadata;
import te3.C64459j13;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/x;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.x */
public final class C56889x implements C80883e<Bundle, Bundle> {
    public C56889x() {
        Log.m105924i("MicroMsg.MultiTask.UpdateTaskInfoByTitleTask", "create update task info by title");
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("id");
            int i = bundle.getInt("type");
            byte[] byteArray = bundle.getByteArray("showData");
            if (string != null && byteArray != null) {
                C64459j13 j132 = new C64459j13();
                try {
                    j132.parseFrom(byteArray);
                } catch (Exception unused) {
                }
                String string2 = bundle.getString("path");
                if (string2 == null) {
                    string2 = "";
                }
                if (!Util.isNullOrNil(string2)) {
                    String b = C56888q.f162957a.mo80311b(string);
                    if (C86013q1.m106450k(b)) {
                        C86013q1.m106447h(b);
                    }
                    C86013q1.m106463x(string2, b);
                }
                ((C105923s) C86312j.m106911c(C105923s.class)).Ax0(string, i, j132, bundle.getByteArray("data"));
            }
        }
    }
}
