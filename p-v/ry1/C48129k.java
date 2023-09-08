package ry1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import py1.C47659r;
import qy1.C12934a;
import uy1.C52642c;

/* renamed from: ry1.k */
public class C48129k extends LinearLayout implements View.OnClickListener {

    /* renamed from: d */
    public Context f129018d;

    /* renamed from: e */
    public LayoutInflater f129019e;

    /* renamed from: f */
    public int f129020f;

    /* renamed from: g */
    public String f129021g;

    public C48129k(Context context) {
        super(context);
        this.f129018d = context;
        this.f129019e = (LayoutInflater) context.getSystemService("layout_inflater");
        setOrientation(0);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C47659r)) {
            Log.m105928w("MicroMsg.GameBlockEntranceView", "getTag is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C47659r rVar = (C47659r) view.getTag();
        if (Util.isNullOrNil(rVar.f127958g)) {
            Log.m105928w("MicroMsg.GameBlockEntranceView", "jumpUrl is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C40314g.m43487f(this.f129018d, 10, 1002, rVar.f127959h, C52642c.m59002t(this.f129018d, rVar.f127958g, "game_center_mygame_comm"), this.f129021g, this.f129020f, C12934a.m12382d(rVar.f127960i));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
