package ck2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58100z0;
import gy3.C87412m;
import java.util.List;
import p145dx.C58448m;
import p145dx.C58451o;
import pj2.C62323d;
import pj2.C62328j;

/* renamed from: ck2.a */
public final class C54873a extends UIComponent implements C58448m {

    /* renamed from: d */
    public C62328j f153804d = new C62328j();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54873a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo75817c3() {
        C62328j jVar = this.f153804d;
        jVar.getClass();
        Log.m105924i("MicroMsg.RingtoneDataViewModel", "noMoreDataLoad");
        ((C58100z0) jVar.f177168d).mo82832d(new C58451o.C58452a((List<? extends C62323d>) null, 4));
    }

    /* renamed from: d3 */
    public final void mo75818d3(List<? extends C62323d> list) {
        C87412m.m108594g(list, "data");
        C62328j jVar = this.f153804d;
        jVar.getClass();
        Log.m105924i("MicroMsg.RingtoneDataViewModel", "bindDataSource " + list.size());
        ((C58100z0) jVar.f177168d).mo82832d(new C58451o.C58452a(list, 3));
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        C62328j jVar = this.f153804d;
        jVar.getClass();
        Log.m105924i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
        ((C58100z0) jVar.f177168d).mo82832d(new C58451o.C58452a((List<? extends C62323d>) null, 1));
    }

    /* renamed from: r1 */
    public C58451o mo75819r1() {
        return this.f153804d;
    }
}
