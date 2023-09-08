package p739wi;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import p739wi.C78597c;
import yj3.C79123a;

/* renamed from: wi.d */
public final class C78601d extends UIComponent implements C78597c.C78598b, C78597c.C78600d {

    /* renamed from: d */
    public C78597c f230225d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78601d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: J5 */
    public boolean mo72924J5() {
        Log.m105924i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    /* renamed from: S3 */
    public void mo94875S3() {
    }

    /* renamed from: h3 */
    public void mo72925h3() {
        Log.m105924i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIEnter] ...");
    }

    /* renamed from: l7 */
    public void mo94876l7() {
        C78597c cVar = this.f230225d;
        if (cVar != null) {
            ((C79123a) cVar).mo109065b();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C78597c cVar = this.f230225d;
        if (cVar != null) {
            ((C79123a) cVar).mo109069f(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        AppCompatActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(50);
        }
        C78597c cVar = this.f230225d;
        if (cVar != null) {
            ((C79123a) cVar).mo109070g();
        }
    }

    public void onCreateBefore(Bundle bundle) {
        C78597c cVar;
        super.onCreateBefore(bundle);
        C78597c.C38152a.C38153a aVar = C78597c.C38152a.f100809a;
        if (aVar != null) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            cVar = aVar.Pt0((MMActivity) activity);
        } else {
            cVar = null;
        }
        this.f230225d = cVar;
        if (cVar != null) {
            ((C79123a) cVar).f232365v.add(this);
        }
        C78597c cVar2 = this.f230225d;
        if (cVar2 != null) {
            ((C79123a) cVar2).mo109071h();
        }
        C78597c cVar3 = this.f230225d;
        if (cVar3 != null) {
            ((C79123a) cVar3).f232368y = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C78597c cVar = this.f230225d;
        if (cVar != null) {
            ((C79123a) cVar).f232365v.remove(this);
        }
        C78597c cVar2 = this.f230225d;
        if (cVar2 != null) {
            ((C79123a) cVar2).mo109072i();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        C78597c cVar = this.f230225d;
        boolean z = false;
        if (cVar != null && ((C79123a) cVar).mo109066c(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        C78597c cVar = this.f230225d;
        boolean z = false;
        if (cVar != null && ((C79123a) cVar).mo109066c(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        C78597c cVar = this.f230225d;
        if (cVar != null) {
            ((C79123a) cVar).f232363t = C79123a.C79129d.ACTIVITY_PAUSE;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ChattingUIFragment chattingUIFragment;
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C78597c cVar = this.f230225d;
        if (cVar != null && (chattingUIFragment = ((C79123a) cVar).f232352f) != null) {
            chattingUIFragment.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        C78597c cVar = this.f230225d;
        if (cVar != null) {
            ((C79123a) cVar).mo109073j();
        }
    }
}
