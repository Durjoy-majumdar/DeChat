package vx2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vx2.k */
public final class C15028k<T> implements C1256g {

    /* renamed from: d */
    public static final C15028k<T> f41165d = new C15028k<>();

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("invoker callback result:");
        sb.append(bundle != null ? bundle.getBoolean("result") : false);
        Log.m105924i("MicroMsg.TaskBar.PluginTaskBar", sb.toString());
    }
}
