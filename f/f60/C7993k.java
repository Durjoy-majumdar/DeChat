package f60;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.LiveUIB;
import com.tencent.p014mm.live.p016ui.LiveUID;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: f60.k */
public final class C7993k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUID f26677d;

    public C7993k(LiveUID liveUID) {
        this.f26677d = liveUID;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/LiveUID$replayGenerated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f26677d.getContext(), LiveUIB.class);
        intent.putExtra("FROM_SENCE", this.f26677d.f10337C);
        AppCompatActivity context = this.f26677d.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/live/ui/LiveUID$replayGenerated$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/live/ui/LiveUID$replayGenerated$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (C87412m.m108589b(RoomLiveService.f157199j, C75592q0.m90789s())) {
            Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorClickToPlay");
            C115669n.INSTANCE.mo175913w(1385, 2, 1);
        } else {
            Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markVisitorClickToPlay");
            C115669n.INSTANCE.mo175913w(1385, 11, 1);
        }
        this.f26677d.f10338D = true;
        C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUID$replayGenerated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
