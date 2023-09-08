package com.tencent.p014mm.plugin.gamelife.p062ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import p739wi.C78597c;
import yj3.C79123a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/GameLifeChattingCompatUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lwi/c$b;", "Lwi/c$d;", "Lwi/c$c;", "<init>", "()V", "plugin-gamelife_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI */
public abstract class GameLifeChattingCompatUI extends MMActivity implements C78597c.C78598b, C78597c.C78600d, C78597c.C78599c {

    /* renamed from: d */
    public C78597c f198376d;

    /* renamed from: J5 */
    public boolean mo72924J5() {
        Log.m105924i("GameLife.ChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    /* renamed from: S3 */
    public void mo94875S3() {
        Log.m105924i("GameLife.ChattingCompatUI", "[onChattingFinishBegin] ...");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C78597c cVar = this.f198376d;
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
        Log.m105924i("GameLife.ChattingCompatUI", "[onChattingUIEnter] ...");
    }

    /* renamed from: l7 */
    public void mo94876l7() {
        Log.m105924i("GameLife.ChattingCompatUI", "[onChattingFinishEnd] ...");
        C78597c cVar = this.f198376d;
        if (cVar != null) {
            ((C79123a) cVar).mo109065b();
        }
    }

    public void onCreate(Bundle bundle) {
        C78597c.C38152a.C38153a aVar = C78597c.C38152a.f100809a;
        C78597c Pt0 = aVar != null ? aVar.Pt0(this) : null;
        this.f198376d = Pt0;
        if (Pt0 != null) {
            ((C79123a) Pt0).f232365v.add(this);
        }
        C78597c cVar = this.f198376d;
        if (cVar != null) {
            ((C79123a) cVar).f232366w = this;
        }
        if (cVar != null) {
            ((C79123a) cVar).mo109071h();
        }
        super.onCreate(bundle);
        C78597c cVar2 = this.f198376d;
        if (cVar2 != null) {
            ((C79123a) cVar2).mo109070g();
        }
        getWindow().setSoftInputMode(50);
        C41864d.m45384a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C41864d.m45388e(this);
        C78597c cVar = this.f198376d;
        if (cVar != null) {
            ((C79123a) cVar).f232365v.remove(this);
        }
        C78597c cVar2 = this.f198376d;
        if (cVar2 != null) {
            ((C79123a) cVar2).mo109072i();
        }
    }

    public void onPause() {
        super.onPause();
        C78597c cVar = this.f198376d;
        if (cVar != null) {
            ((C79123a) cVar).f232363t = C79123a.C79129d.ACTIVITY_PAUSE;
        }
    }

    public void onResume() {
        super.onResume();
        C78597c cVar = this.f198376d;
        if (cVar != null) {
            ((C79123a) cVar).mo109073j();
        }
    }
}
