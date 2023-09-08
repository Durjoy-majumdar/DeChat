package yz2;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import az2.C39674e;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;

/* renamed from: yz2.m2 */
public final class C53697m2 extends UIComponent implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public C32224a<Integer> f150791d;

    /* renamed from: yz2.m2$a */
    public static final class C53698a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53697m2 f150792d;

        public C53698a(C53697m2 m2Var) {
            this.f150792d = m2Var;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            TextStatusLikeListActivity.C43209a aVar = TextStatusLikeListActivity.f116931f;
            AppCompatActivity activity = this.f150792d.getActivity();
            C32224a<Integer> aVar2 = this.f150792d.f150791d;
            int intValue = aVar2 != null ? aVar2.invoke().intValue() : 0;
            C87412m.m108594g(activity, "context");
            Intent intent = new Intent(activity, TextStatusLikeListActivity.class);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
            intent.putExtra("reportEnterScene", intValue);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            C117292a.m165358d(activity, aVar3.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfMsg", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfMsg", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53697m2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCreate() called with: savedInstanceState = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "MicroMsg.TextStatus.TextStatusNotifyItemUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r5)
            androidx.appcompat.app.AppCompatActivity r5 = r4.getActivity()
            boolean r0 = r5 instanceof com.tencent.p014mm.p136ui.MMActivity
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            goto L_0x0026
        L_0x0025:
            r5 = r1
        L_0x0026:
            r0 = 0
            if (r5 == 0) goto L_0x0038
            r2 = 2131837941(0x7f1143f5, float:1.9309091E38)
            java.lang.String r2 = r4.getString(r2)
            yz2.m2$a r3 = new yz2.m2$a
            r3.<init>(r4)
            r5.addTextOptionMenu(r0, r2, r3)
        L_0x0038:
            androidx.appcompat.app.AppCompatActivity r5 = r4.getActivity()
            boolean r2 = r5 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x0043
            r1 = r5
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.showOptionMenu(r0)
        L_0x0048:
            az2.e r5 = az2.C39674e.f106452d
            yy2.a r0 = r5.mo62238D()
            r0.add(r4)
            yy2.b r0 = r5.mo62243O()
            r0.add(r4)
            rz2.l r5 = r5.mo62239E0()
            r5.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C53697m2.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C39674e eVar = C39674e.f106452d;
        eVar.mo62238D().remove(this);
        eVar.mo62243O().remove(this);
        eVar.mo62239E0().remove(this);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "onNotifyChange");
    }

    public void onResume() {
        super.onResume();
    }
}
