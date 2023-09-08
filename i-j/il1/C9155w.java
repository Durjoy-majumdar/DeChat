package il1;

import android.os.Bundle;
import androidx.lifecycle.C0120a0;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import te3.C51613uy0;
import zj1.C16217b;

/* renamed from: il1.w */
public final class C9155w<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C9139v f28834d;

    public C9155w(C9139v vVar) {
        this.f28834d = vVar;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        C51613uy0 uy02 = ((C54991o) this.f28834d.f28786c.mo87684A0().mo71262a(C54991o.class)).f154363s1;
        String str = this.f28834d.f28787d;
        StringBuilder sb = new StringBuilder();
        sb.append("gameInfo is not null: ");
        sb.append(uy02 != null);
        sb.append(", setting: ");
        sb.append(uy02 != null ? Integer.valueOf(uy02.f143181e) : null);
        sb.append(", canshow: ");
        sb.append(bool);
        Log.m105924i(str, sb.toString());
        if (!C87412m.m108589b(bool, Boolean.TRUE)) {
            this.f28834d.f28784a.setVisibility(8);
            C58124b.C7172a.m7372a(this.f28834d.f28785b, C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
        } else if (this.f28834d.f28784a.getVisibility() == 8) {
            C9139v vVar = this.f28834d;
            if (vVar.f28788e) {
                C16217b.f43438a.mo14751g(vVar.f28790g);
                this.f28834d.f28788e = false;
            }
            this.f28834d.f28784a.setVisibility(0);
        }
    }
}
