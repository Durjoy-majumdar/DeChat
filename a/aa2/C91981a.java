package aa2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.plugin.appbrand.api.ParcelableMultiTaskData;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import di0.C86299o;
import di3.C86312j;
import java.io.IOException;
import kr0.C76630x0;
import p640ox.C77049b;
import p92.C117994a;
import p92.C117997g;
import te3.C110959d13;
import te3.C110964i13;
import te3.C51173ry;
import te3.C90416i5;

/* renamed from: aa2.a */
public class C91981a extends C117997g {
    public C91981a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        Class cls = C77049b.class;
        C90416i5 i5Var = new C90416i5();
        try {
            i5Var.parseFrom(multiTaskInfo.field_data);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandMultiTaskUIC", e, "onMultiTaskItemClick exception:%s", e.getMessage());
        }
        ParcelableMultiTaskData parcelableMultiTaskData = new ParcelableMultiTaskData();
        C51173ry ryVar = new C51173ry();
        parcelableMultiTaskData.f238428d = ryVar;
        ryVar.f141210d = d132;
        if (!(view == null || ((C77049b) C86312j.m106911c(cls)).mo72353Ru(view.getContext()) == null)) {
            C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(cls)).mo72346DT(view.getContext(), 5);
            if (i132 instanceof C110964i13) {
                parcelableMultiTaskData.f238428d.f141211e = i132.f332057d;
            }
        }
        C86299o oVar = new C86299o();
        String str = i5Var.f259567e;
        oVar.f250929a = str;
        String str2 = i5Var.f259566d;
        oVar.f250930b = str2;
        int i = i5Var.f259568f;
        oVar.f250931c = i;
        Log.m105925i("MicroMsg.AppBrandMultiTaskUIC", "onMultiTaskItemClick username:%s,appid:%s,versionType:%d", str, str2, Integer.valueOf(i));
        oVar.f250919H = parcelableMultiTaskData;
        oVar.f250939k = 1187;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.activity, oVar);
    }

    /* renamed from: c3 */
    public void mo125822c3(StorageObserverEvent<MultiTaskInfo> storageObserverEvent) {
    }

    /* renamed from: k3 */
    public boolean mo62147k3(int i) {
        return i == 1;
    }

    /* renamed from: z */
    public C117994a.C117996b mo36002z() {
        return C117994a.C117996b.MODE_SHOW_MULTI_SCENE;
    }

    public C91981a(Fragment fragment) {
        super(fragment);
    }
}
