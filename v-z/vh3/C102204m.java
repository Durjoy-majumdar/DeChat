package vh3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import gy3.C87412m;
import jp3.C9486a;
import jp3.C9487b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lvh3/m;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sticker_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: vh3.m */
public final class C102204m implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, "data");
        String string = bundle.getString("data");
        if (string != null) {
            new C102193e((C9487b<C9486a>) null, string, new C102203l(gVar));
        } else if (gVar != null) {
            gVar.mo894a(null);
        }
    }
}
