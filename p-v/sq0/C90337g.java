package sq0;

import android.text.TextUtils;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sq0.g */
public final class C90337g {

    /* renamed from: a */
    public final String f259318a;

    /* renamed from: b */
    public final List<C90338h> f259319b;

    public C90337g() {
        this((String) null, (List) null, 3, (C8480h) null);
    }

    public C90337g(String str, List<C90338h> list) {
        C87412m.m108594g(str, "dialogContent");
        C87412m.m108594g(list, "sceneInfo");
        this.f259318a = str;
        this.f259319b = list;
    }

    /* renamed from: a */
    public final boolean mo124564a(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        for (C90338h next : this.f259319b) {
            if (TextUtils.equals(next.f259321b, str) && next.f259320a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C90337g(String str, List list, int i, C8480h hVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
