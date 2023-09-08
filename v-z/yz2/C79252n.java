package yz2;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListActivity;
import j20.C117292a;
import java.util.ArrayList;
import nz2.C47313a;
import vz2.C78501d;
import yz2.C79239k;

/* renamed from: yz2.n */
public final class C79252n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79239k f232676d;

    /* renamed from: e */
    public final /* synthetic */ C47313a f232677e;

    public C79252n(C79239k kVar, C47313a aVar) {
        this.f232676d = kVar;
        this.f232677e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$handleNotifyV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79239k kVar = this.f232676d;
        TextStatusLikeListActivity.f116931f.mo67454a(kVar.f232644i, kVar.f232625L == C79239k.C79242c.ADD ? 2 : 1);
        C78501d dVar = C78501d.f229945a;
        C78501d.m94805g(dVar, 10, String.valueOf(this.f232677e.f126986b), this.f232676d.f232626M, 0, (String) null, 0, 56, (Object) null);
        C78501d.m94806h(dVar, this.f232676d.f232644i, 41, String.valueOf(this.f232677e.f126986b), this.f232676d.f232655w, 0, 0, 0, 0, (Integer) null, C83031z.CTRL_INDEX, (Object) null);
        C79239k kVar2 = this.f232676d;
        C78501d.m94805g(dVar, 43, kVar2.f232630R, kVar2.f232631S, kVar2.f232632T, (String) null, 0, 48, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$handleNotifyV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
