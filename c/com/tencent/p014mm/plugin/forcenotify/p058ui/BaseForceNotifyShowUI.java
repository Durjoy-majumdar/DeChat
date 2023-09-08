package com.tencent.p014mm.plugin.forcenotify.p058ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dv1.C58435m;
import ev1.C58838a;
import ev1.C58843i;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-force-notify_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI */
public abstract class BaseForceNotifyShowUI extends MMActivity {

    /* renamed from: d */
    public final String f162686d = "MicroMsg.ForceNotifyShowUI";

    /* renamed from: e */
    public C58838a f162687e;

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI$a */
    public static final class C56761a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseForceNotifyShowUI f162688d;

        public C56761a(BaseForceNotifyShowUI baseForceNotifyShowUI) {
            this.f162688d = baseForceNotifyShowUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f162688d.onBackPressed();
            return true;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, C0966R.C0968anim.f2469dt);
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2461dn);
        getWindow().addFlags(6815744);
        super.onCreate(bundle);
        fullScreenNoTitleBar(true);
        setBackBtn(new C56761a(this));
        C58843i.C58845b bVar = C58843i.f168452c;
        if (true ^ bVar.mo84050a().f168454a.isEmpty()) {
            this.f162687e = bVar.mo84050a().f168454a.poll();
            return;
        }
        Log.m105920e(this.f162686d, "forceNotify dataList is empty");
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        C58838a aVar = this.f162687e;
        if (aVar != null) {
            C58843i a = C58843i.f168452c.mo84050a();
            String str = aVar.f168434d;
            a.getClass();
            C87412m.m108594g(str, "forcePushId");
            a.f168455b.remove(str);
        }
        if (!C58843i.f168452c.mo84050a().f168454a.isEmpty()) {
            Log.m105924i(this.f162686d, "continue to showNotifyActivity");
            ((C58435m) C86312j.m106911c(C58435m.class)).Ex0(true);
        }
        Log.m105924i(this.f162686d, "[onDestroy]");
    }
}
