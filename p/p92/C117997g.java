package p92;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import te3.C110959d13;

/* renamed from: p92.g */
public abstract class C117997g extends UIComponent implements C117994a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117997g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        C87412m.m108594g(multiTaskInfo, "info");
        C87412m.m108594g(d132, "animateData");
    }

    /* renamed from: c3 */
    public void mo125822c3(StorageObserverEvent<MultiTaskInfo> storageObserverEvent) {
        C87412m.m108594g(storageObserverEvent, "event");
    }

    /* renamed from: d3 */
    public void mo62143d3(Object obj) {
    }

    /* renamed from: e3 */
    public void mo62144e3(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "obj");
    }

    /* renamed from: f3 */
    public void mo143207f3() {
    }

    /* renamed from: g3 */
    public void mo62145g3() {
    }

    /* renamed from: i3 */
    public void mo62146i3() {
    }

    /* renamed from: j3 */
    public void mo62155j3(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "info");
    }

    /* renamed from: k3 */
    public boolean mo62147k3(int i) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117997g(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
