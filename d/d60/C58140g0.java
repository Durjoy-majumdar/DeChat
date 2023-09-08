package d60;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.live.model.RoomLiveService;
import d50.C58112f;
import d50.C58114h;
import d60.C58124b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d60.g0 */
public final class C58140g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58130e0 f166550d;

    public C58140g0(C58130e0 e0Var) {
        this.f166550d = e0Var;
    }

    public final void onClick(View view) {
        C58112f fVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/plugin/LiveHostRightPanelPlugin$setupForHost$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f166550d.f166523f.statusChange(C58124b.C58125b.SWITCH_CAMERA, new Bundle());
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        C58114h hVar = RoomLiveService.f157201l;
        C58112f fVar2 = hVar != null ? hVar.f166253d : null;
        if (fVar2 != null) {
            fVar2.f166227b = !((hVar == null || (fVar = hVar.f166253d) == null) ? true : fVar.f166227b);
        }
        C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveHostRightPanelPlugin$setupForHost$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
