package xe3;

import android.os.Bundle;
import android.os.Process;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lxe3/c;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-account_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: xe3.c */
public final class C15674c implements C80883e<Bundle, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Process.myPid();
        Objects.toString(bundle);
        Objects.toString(bundle != null ? bundle.get("appId") : null);
        C15673b.f42360a = bundle;
        if (gVar != null) {
            gVar.mo894a(null);
        }
    }
}
