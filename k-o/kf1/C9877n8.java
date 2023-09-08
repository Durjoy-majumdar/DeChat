package kf1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C7888v2;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60172g4;
import java.util.ArrayList;
import java.util.List;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: kf1.n8 */
public final class C9877n8 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ FinderItem f30468a;

    /* renamed from: b */
    public final /* synthetic */ AppCompatActivity f30469b;

    /* renamed from: c */
    public final /* synthetic */ int f30470c;

    /* renamed from: d */
    public final /* synthetic */ C49712hj1 f30471d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<List<String>, C13598b0> f30472e;

    public C9877n8(FinderItem finderItem, AppCompatActivity appCompatActivity, int i, C49712hj1 hj12, C32226l<? super List<String>, C13598b0> lVar) {
        this.f30468a = finderItem;
        this.f30469b = appCompatActivity;
        this.f30470c = i;
        this.f30471d = hj12;
        this.f30472e = lVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        int i3 = i2;
        Intent intent2 = intent;
        Class cls = C13442s8.class;
        ArrayList<String> arrayList = new ArrayList<>();
        if (i3 == -1) {
            ArrayList<String> stringArrayListExtra = intent2 != null ? intent2.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>(0);
            }
            arrayList = stringArrayListExtra;
            C7888v2.C7889a aVar = C7888v2.f26513a;
            aVar.getClass();
            String str = C7888v2.C7889a.f26515b;
            Log.m105924i(str, "share finderObject " + this.f30468a.getId() + " to " + arrayList);
            aVar.mo9003E(arrayList);
            if (!arrayList.isEmpty()) {
                C39622i0 a = C39818r.f106831a.mo62444c(this.f30469b).mo75002a(cls);
                C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
                C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
                if (b != null) {
                    b.mo8766a(new C7322a.C7323a(1, this.f30468a.getId()));
                }
            }
        } else {
            C39622i0 a2 = C39818r.f106831a.mo62444c(this.f30469b).mo75002a(cls);
            C87412m.m108593f(a2, "UICProvider.of(context).…rReporterUIC::class.java)");
            C7322a b2 = C60172g4.C60173a.m70190b((C60172g4) a2, 0, 1, (Object) null);
            if (b2 != null) {
                b2.mo8766a(new C7322a.C7323a(3, this.f30468a.getId()));
            }
        }
        long j = i3 == -1 ? 1 : 2;
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        long id = this.f30468a.getId();
        int i4 = this.f30470c;
        String listToString = Util.listToString(arrayList, ";");
        C87412m.m108593f(listToString, "listToString(toUsers, \";\")");
        C58417y0.ky0((C58417y0) c, id, i4, j, listToString, this.f30471d, (long) arrayList.size(), (FinderItem) null, 64, (Object) null);
        C32226l<List<String>, C13598b0> lVar = this.f30472e;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
    }
}
