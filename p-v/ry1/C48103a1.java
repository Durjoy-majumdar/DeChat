package ry1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import uy1.C52642c;

/* renamed from: ry1.a1 */
public class C48103a1 implements View.OnClickListener {

    /* renamed from: d */
    public Context f128956d;

    /* renamed from: e */
    public int f128957e;

    /* renamed from: f */
    public int f128958f;

    /* renamed from: g */
    public int f128959g;

    /* renamed from: h */
    public int f128960h;

    public C48103a1(Context context, int i) {
        this.f128956d = context;
        this.f128957e = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof C42119w) {
            C42119w wVar = (C42119w) view.getTag();
            if (!Util.isNullOrNil((List) wVar.f113489o1)) {
                wVar.f113489o1.get(0).getClass();
                if (!Util.isNullOrNil((String) null)) {
                    int t = C52642c.m59002t(this.f128956d, (String) null, (String) null);
                    String a = C40314g.m43482a((String) null, (String) null, wVar.f113474g2, (Map) null);
                    C40314g.m43485d(this.f128956d, this.f128957e, this.f128959g, this.f128960h, t, 0, wVar.field_appId, this.f128958f, wVar.field_msgType, wVar.field_gameMsgId, wVar.f113472f2, a);
                } else {
                    Log.m105920e("MicroMsg.GameURLClickListener", "message's jumpurl is null");
                }
            }
        } else if (view.getTag() instanceof String) {
            String str = (String) view.getTag();
            if (Util.isNullOrNil(str)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                C40314g.m43484c(this.f128956d, this.f128957e, this.f128959g, this.f128960h, C52642c.m59002t(this.f128956d, str, (String) null), this.f128958f, (String) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameURLClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
