package fh1;

import android.content.Intent;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import gh1.C59440c;
import gh1.C8313a;
import gy3.C87412m;
import te3.C52005xq0;

/* renamed from: fh1.l0 */
public final class C8063l0 extends C8313a implements C59440c {

    /* renamed from: j */
    public final String f26809j = "Finder.LifeCycleLogController";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8063l0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: e */
    public boolean mo9121e() {
        mo9311i3(this.f26809j, "onBackPress");
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = this.f26809j;
        mo9311i3(str, "onActivityResult requestCode:" + i + ", resultCode:" + i2);
    }

    public void onFloatMode() {
        mo9311i3(this.f26809j, "onFloatMode");
    }

    public void onLiveActivate() {
        mo9311i3(this.f26809j, "onLiveActivate");
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        mo9311i3(this.f26809j, "onLiveDeactivate");
    }

    public void onLiveEnd() {
        mo9311i3(this.f26809j, "onLiveEnd");
    }

    public void onLivePause() {
        mo9311i3(this.f26809j, "onLivePause");
    }

    public void onLiveResume() {
        mo9311i3(this.f26809j, "onLiveResume");
    }

    public void onLiveStart(C52005xq0 xq02) {
        mo9311i3(this.f26809j, "onLiveStart");
    }

    public void onNewIntent(Intent intent) {
        mo9311i3(this.f26809j, "onNewIntent");
    }

    public void onNormalMode() {
        mo9311i3(this.f26809j, "onNormalMode");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        String str = this.f26809j;
        mo9311i3(str, "onRequestPermissionsResult requestCode:" + i);
    }

    public boolean onSwipeBack() {
        mo9311i3(this.f26809j, "onSwipeBack");
        return false;
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        String str = this.f26809j;
        mo9311i3(str, "onViewMount pluginLayout:" + viewGroup.hashCode());
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        String str = this.f26809j;
        mo9311i3(str, "onViewUnmount pluginLayout:" + viewGroup.hashCode());
    }

    public void resume() {
        mo9311i3(this.f26809j, "resume");
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
        String str = this.f26809j;
        mo9311i3(str, "keyboardChange show:" + z + ", height:" + i);
    }
}
