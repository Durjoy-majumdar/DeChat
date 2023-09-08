package vx2;

import android.os.Bundle;
import ay2.C67121f;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import kotlin.Metadata;
import te3.C64459j13;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lvx2/a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-taskbar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: vx2.a */
public final class C65899a implements C80883e<Bundle, Bundle> {

    /* renamed from: d */
    public final String f189461d = "MicroMsg.TaskBar.AddTaskInfoTask";

    public C65899a() {
        Log.m105924i("MicroMsg.TaskBar.AddTaskInfoTask", "create add task info");
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Class cls = C65900i.class;
        if (C86709a0.m107522a() && bundle != null) {
            String string = bundle.getString("id");
            int i = bundle.getInt("type");
            byte[] byteArray = bundle.getByteArray("showData");
            int i2 = bundle.getInt("addType");
            boolean z = bundle.getBoolean("updateBitmapOnly");
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
                    C65901p pVar = C65901p.f189464a;
                    String b = pVar.mo89952b(string);
                    if (C86013q1.m106450k(b)) {
                        C86013q1.m106447h(b);
                    }
                    C86013q1.m106463x(string2, b);
                    String str = this.f189461d;
                    Log.m105924i(str, "move tempPath:" + string2 + " to path:" + b);
                    if (C67121f.f192724e.mo55826b(i)) {
                        C20937c cVar = C78493o.f229929b;
                        C87412m.m108593f(cVar, "SNAPSHOT_LOADER_OPTION");
                        C20828a.m22825b().mo32527p(pVar.mo89951a(b, cVar));
                    }
                }
                if (i2 == 1) {
                    ((C65900i) C86312j.m106911c(cls)).vx0(string, i, j132, bundle.getByteArray("data"));
                } else if (i2 == 2) {
                    ((C65900i) C86312j.m106911c(cls)).Ax0(string, i, j132, bundle.getByteArray("data"), z);
                }
            }
        }
    }
}
