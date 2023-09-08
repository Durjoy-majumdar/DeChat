package xk1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.view.C56061i;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import gy3.C87412m;
import np1.C61817a;
import op1.C62075a;
import op1.C62084h;

/* renamed from: xk1.r */
public final class C66344r extends UIComponent {

    /* renamed from: d */
    public C61817a f190977d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66344r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo90451c3(Intent intent) {
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 6) {
            C56061i d3 = ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C66331m.class)).mo90443d3();
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
            d3.statusChange(C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_SHOW, bundle);
            Intent intent2 = getContext().getIntent();
            if (intent2 != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C61817a aVar = this.f190977d;
        if (aVar != null) {
            aVar.mo86769y(i, i2, intent);
        }
    }

    public void onDestroy() {
        C62084h hVar;
        C62075a aVar;
        C62084h hVar2;
        C61817a aVar2 = this.f190977d;
        if (aVar2 != null) {
            aVar2.mo86746N();
        }
        C61817a aVar3 = this.f190977d;
        if (aVar3 != null) {
            aVar3.mo86745M();
        }
        C61817a aVar4 = this.f190977d;
        if (!(aVar4 == null || (hVar2 = aVar4.f175761C) == null)) {
            hVar2.f176542s = null;
        }
        if (!(aVar4 == null || (aVar = aVar4.f175762D) == null)) {
            aVar.f176495n = null;
        }
        if (!(aVar4 == null || (hVar = aVar4.f175763E) == null)) {
            hVar.f176542s = null;
        }
        if (aVar4 != null) {
            aVar4.mo86770z();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo90451c3(intent);
    }

    public void onResume() {
        super.onResume();
        mo90451c3(getContext().getIntent());
    }
}
