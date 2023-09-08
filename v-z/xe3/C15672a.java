package xe3;

import android.os.Bundle;
import android.os.Process;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lxe3/a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-account_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: xe3.a */
public final class C15672a implements C80883e<IPCVoid, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Bundle bundle = C15673b.f42360a;
        Process.myPid();
        Objects.toString(bundle);
        Objects.toString(bundle != null ? bundle.get("appId") : null);
        if (gVar != null) {
            gVar.mo894a(bundle);
        }
    }
}
