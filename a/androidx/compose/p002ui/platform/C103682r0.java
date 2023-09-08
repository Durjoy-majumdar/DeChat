package androidx.compose.p002ui.platform;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p1094c4.a$$c;
import p683s0.C110688i;

/* renamed from: androidx.compose.ui.platform.r0 */
public final class C103682r0 implements a$$c {

    /* renamed from: a */
    public final /* synthetic */ C110688i f306253a;

    public C103682r0(C110688i iVar) {
        this.f306253a = iVar;
    }

    /* renamed from: a */
    public final Bundle mo144852a() {
        Map<String, List<Object>> c = this.f306253a.mo60746c();
        Bundle bundle = new Bundle();
        for (Map.Entry next : c.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        return bundle;
    }
}
