package vx2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vx2.j */
public final class C15027j<T> implements C1256g {

    /* renamed from: d */
    public static final C15027j<T> f41164d = new C15027j<>();

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("invoker callback result:");
        sb.append(bundle != null ? bundle.getBoolean("result") : false);
        Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", sb.toString());
    }
}
