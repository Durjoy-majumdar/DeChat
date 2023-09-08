package com.tencent.p014mm.plugin.game.p061ui;

import android.os.Bundle;
import com.tencent.p014mm.game.report.C40304b;
import com.tencent.p014mm.game.report.C40311f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.p061ui.tab.GameRouteUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import u10.C52415a;
import u10.C52416b;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBaseActivity */
public abstract class GameBaseActivity extends MMActivity {

    /* renamed from: d */
    public int f113638d = 1;

    /* renamed from: e */
    public long f113639e = 0;

    /* renamed from: f */
    public long f113640f = 0;

    /* renamed from: g */
    public long f113641g = 0;

    /* renamed from: H7 */
    public abstract String mo66117H7();

    /* renamed from: I7 */
    public abstract String mo66118I7();

    /* renamed from: J7 */
    public abstract int mo66119J7();

    /* renamed from: K7 */
    public abstract int mo66120K7();

    /* renamed from: L7 */
    public abstract int mo66121L7();

    /* renamed from: M7 */
    public boolean mo66122M7() {
        return !(this instanceof GameRouteUI);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C41864d.m45384a(this);
    }

    public void onDestroy() {
        if (this.f113640f != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f113640f;
            Log.m105925i("MicroMsg.GameBaseActivity", "visit page(%s), stayTime:%sms, foregroundTime:%sms", getClass().getSimpleName(), Long.valueOf(currentTimeMillis), Long.valueOf(this.f113639e));
            if (mo66122M7()) {
                int i = this.f113638d;
                int J7 = mo66119J7();
                int L7 = mo66121L7();
                C52416b a = C52416b.m58673a(14683, Integer.valueOf(i), Integer.valueOf(J7), Integer.valueOf(L7), Long.valueOf((long) mo66120K7()), "", mo66118I7(), "", Long.valueOf(currentTimeMillis / 1000), Long.valueOf(this.f113639e / 1000), mo66117H7());
                ((C40304b) C52415a.m58668a()).getClass();
                C40311f.m43479a(a);
            }
        }
        super.onDestroy();
        C41864d.m45388e(this);
    }

    public void onPause() {
        super.onPause();
        this.f113639e += System.currentTimeMillis() - this.f113641g;
    }

    public void onResume() {
        if (this.f113640f == 0) {
            this.f113640f = System.currentTimeMillis();
        }
        this.f113641g = System.currentTimeMillis();
        super.onResume();
    }
}
