package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p739wi.C78597c;
import yj3.C79123a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/ReadyChattingCompatUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lwi/c$b;", "Lwi/c$d;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.ReadyChattingCompatUI */
public abstract class ReadyChattingCompatUI extends MMFinderUI implements C78597c.C78598b, C78597c.C78600d {

    /* renamed from: o */
    public C78597c f198146o;

    /* renamed from: J5 */
    public boolean mo72924J5() {
        Log.m105924i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    /* renamed from: S3 */
    public void mo94875S3() {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C78597c cVar = this.f198146o;
        boolean z = false;
        if (cVar != null && ((C79123a) cVar).mo109066c(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: h3 */
    public void mo72925h3() {
        Log.m105924i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIEnter] ...");
    }

    /* renamed from: l7 */
    public void mo94876l7() {
        C78597c cVar = this.f198146o;
        if (cVar != null) {
            ((C79123a) cVar).mo109065b();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C78597c cVar = this.f198146o;
        if (cVar != null) {
            ((C79123a) cVar).mo109069f(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        C78597c.C38152a.C38153a aVar = C78597c.C38152a.f100809a;
        C78597c Pt0 = aVar != null ? aVar.Pt0(this) : null;
        this.f198146o = Pt0;
        if (Pt0 != null) {
            ((C79123a) Pt0).f232365v.add(this);
        }
        C78597c cVar = this.f198146o;
        if (cVar != null) {
            ((C79123a) cVar).mo109071h();
        }
        super.onCreate(bundle);
        getWindow().setSoftInputMode(50);
        C78597c cVar2 = this.f198146o;
        if (cVar2 != null) {
            ((C79123a) cVar2).mo109070g();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C78597c cVar = this.f198146o;
        if (cVar != null) {
            ((C79123a) cVar).f232365v.remove(this);
        }
        C78597c cVar2 = this.f198146o;
        if (cVar2 != null) {
            ((C79123a) cVar2).mo109072i();
        }
    }

    public void onPause() {
        super.onPause();
        C78597c cVar = this.f198146o;
        if (cVar != null) {
            ((C79123a) cVar).f232363t = C79123a.C79129d.ACTIVITY_PAUSE;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ChattingUIFragment chattingUIFragment;
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C78597c cVar = this.f198146o;
        if (cVar != null && (chattingUIFragment = ((C79123a) cVar).f232352f) != null) {
            chattingUIFragment.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        C78597c cVar = this.f198146o;
        if (cVar != null) {
            ((C79123a) cVar).mo109073j();
        }
    }
}
