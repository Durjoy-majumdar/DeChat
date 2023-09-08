package p595ll;

import android.os.Bundle;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lll/u;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: ll.u */
public final class C99512u implements C80883e<Bundle, Bundle> {

    /* renamed from: d */
    public final String f291745d = "MicroMsg.EmojiSyncLoaderIPC_data";

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Log.m105924i(this.f291745d, "invoke: get data");
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            int i = bundle.getInt("custom_type");
            bundle2.putParcelable("data", C92668a.f266699q.mo126719c(i));
            String str = this.f291745d;
            Log.m105924i(str, "invoke get data: " + i);
            if (gVar != null) {
                gVar.mo894a(bundle2);
            }
        } else if (gVar != null) {
            gVar.mo894a(bundle2);
        }
    }
}
