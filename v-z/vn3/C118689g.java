package vn3;

import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vn3.g */
public final class C118689g implements SwipeBackLayout.C19847c {

    /* renamed from: d */
    public final /* synthetic */ VASCommonFragment f355158d;

    public C118689g(VASCommonFragment vASCommonFragment) {
        this.f355158d = vASCommonFragment;
    }

    public void onCancel() {
        Log.m105918d(this.f355158d.f348641n, "onCancelDrag: ");
    }

    public void onDrag() {
        Log.m105918d(this.f355158d.f348641n, "onDragBegin: ");
    }

    public void onSwipeBack() {
        VASCommonFragment vASCommonFragment = this.f355158d;
        Log.m105918d(vASCommonFragment.f348641n, "onSwipeBack: ");
        VASActivity vASActivity = vASCommonFragment.f348642o;
        if (vASActivity != null) {
            vASActivity.finishWithNoAnim();
        }
    }
}
