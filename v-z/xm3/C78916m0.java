package xm3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import gy3.C87412m;
import tm3.C78069w;
import yb2.C66605h;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: xm3.m0 */
public final class C78916m0 extends C66605h<C78069w> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78916m0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public BaseState mo85303g3() {
        C78069w wVar = new C78069w();
        getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        String stringExtra = getIntent().getStringExtra("titile");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        wVar.f228820e = stringExtra;
        Intent intent = getIntent();
        C74560s1.m89276e();
        wVar.f228821f = intent.getIntExtra("list_attr", C74560s1.f219160a);
        wVar.f228822g = getIntent().getIntExtra("list_type", -1);
        wVar.f228824i = getIntent().getIntExtra("min_limit_num", 0);
        wVar.f228823h = getIntent().getIntExtra("max_limit_num", -1);
        String stringExtra2 = getIntent().getStringExtra("label_source");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        wVar.f228819d = str;
        String stringExtra3 = getIntent().getStringExtra("already_select_contact");
        if (stringExtra3 != null) {
            if (!(!C112551y.m153811k(stringExtra3))) {
                stringExtra3 = null;
            }
            String str2 = stringExtra3;
            if (str2 != null) {
                for (String str3 : C112550d0.m153785U(str2, new String[]{","}, false, 0, 6, (Object) null)) {
                    wVar.f228826n.add(str3);
                    wVar.f228832t.put(str3, Long.valueOf(C31543z5.m39453c()));
                }
            }
        }
        String stringExtra4 = getIntent().getStringExtra("block_contact");
        if (stringExtra4 != null) {
            wVar.f228827o.addAll(C112550d0.m153785U(stringExtra4, new String[]{","}, false, 0, 6, (Object) null));
        }
        String stringExtra5 = getIntent().getStringExtra("always_select_contact");
        if (stringExtra5 != null) {
            wVar.f228825j.addAll(C112550d0.m153785U(stringExtra5, new String[]{","}, false, 0, 6, (Object) null));
        }
        return wVar;
    }
}
