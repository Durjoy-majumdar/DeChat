package ry1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p763ym.C79138l;
import uy1.C52642c;

/* renamed from: ry1.w0 */
public class C48167w0 implements View.OnClickListener {

    /* renamed from: d */
    public Context f129099d;

    /* renamed from: e */
    public String f129100e;

    /* renamed from: f */
    public C42039b f129101f;

    /* renamed from: g */
    public int f129102g;

    public C48167w0(Context context, String str) {
        this.f129099d = context;
        this.f129100e = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof C42039b)) {
            Log.m105920e("MicroMsg.GamePreemptiveCliclListener", "No GameAppInfo");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f129101f = (C42039b) view.getTag();
        Log.m105924i("MicroMsg.GamePreemptiveCliclListener", "Clicked appid = " + this.f129101f.field_appId);
        if (((C79138l) C86312j.m106911c(C79138l.class)).Tb0(this.f129099d, this.f129101f.field_appId)) {
            Log.m105918d("MicroMsg.GamePreemptiveCliclListener", "launchFromWX, appId = " + this.f129101f.field_appId + ", pkg = " + this.f129101f.field_packageName + ", openId = " + this.f129101f.field_openId);
            C42046d.m45751j(this.f129099d, this.f129101f.field_appId);
            Context context = this.f129099d;
            C42039b bVar = this.f129101f;
            C40314g.m43488g(context, bVar.f113254G1, bVar.f113255H1, bVar.f113256I1, 3, bVar.field_appId, this.f129102g, bVar.f113252E1, bVar.f113263P1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Log.m105925i("MicroMsg.GamePreemptiveCliclListener", "get preemptive url:[%s]", this.f129100e);
        if (!Util.isNullOrNil(this.f129100e)) {
            C52642c.m59001s(this.f129099d, this.f129100e);
            Context context2 = this.f129099d;
            C42039b bVar2 = this.f129101f;
            C40314g.m43488g(context2, bVar2.f113254G1, bVar2.f113255H1, bVar2.f113256I1, 11, bVar2.field_appId, this.f129102g, bVar2.f113252E1, bVar2.f113263P1);
        } else {
            Log.m105920e("MicroMsg.GamePreemptiveCliclListener", "null or nill preemptive url");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
