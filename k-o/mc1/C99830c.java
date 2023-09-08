package mc1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.fav.p047ui.C93666k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import xb1.C102615e;

/* renamed from: mc1.c */
public final class C99830c extends UIComponent {

    /* renamed from: d */
    public final ArrayList<C100755z> f292530d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<Integer> f292531e = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99830c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final C100755z mo139183c3(int i) {
        return C93666k0.f270444c.mo128591a().mo128589b(i);
    }

    /* renamed from: d3 */
    public final int mo139184d3() {
        C93666k0 a = C93666k0.f270444c.mo128591a();
        a.getClass();
        Log.m105924i("MicroMsg.FavFinderStorage", "[getTotalSize] favIdList size = " + a.f270447b.size());
        return a.f270447b.size();
    }

    /* renamed from: e3 */
    public final List<Integer> mo139185e3() {
        ArrayList arrayList = new ArrayList(this.f292531e.size());
        arrayList.addAll(this.f292531e);
        return arrayList;
    }

    /* renamed from: f3 */
    public final List<C100755z> mo139186f3() {
        ArrayList arrayList = new ArrayList(this.f292530d.size());
        arrayList.addAll(this.f292530d);
        return arrayList;
    }

    /* renamed from: g3 */
    public final void mo139187g3(int i) {
        C100755z b = C93666k0.f270444c.mo128591a().mo128589b(i);
        Log.m105924i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] position = " + i);
        if (b == null) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] favItemInfo = null");
        } else if (!this.f292530d.contains(b)) {
            this.f292530d.add(b);
            this.f292531e.add(Integer.valueOf(i));
        } else {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] error, select second time of same favItemInfo = " + b.field_localId);
        }
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        C93666k0 a = C93666k0.f270444c.mo128591a();
        a.f270447b.clear();
        ArrayList<Long> arrayList = a.f270447b;
        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
        ArrayList arrayList2 = new ArrayList(1);
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(20);
        arrayList.addAll(((C102615e) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128208Y3()).mo142274Lo(arrayList2, arrayList3, arrayList4));
        Log.m105924i("MicroMsg.FavFinderStorage", "[loadFavIdList] favIdList size = " + a.f270447b.size());
    }

    public void onDestroy() {
        super.onDestroy();
        C93666k0 a = C93666k0.f270444c.mo128591a();
        a.f270446a.clear();
        a.f270447b.clear();
    }
}
