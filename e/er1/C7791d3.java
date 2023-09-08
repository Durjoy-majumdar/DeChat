package er1;

import android.content.Intent;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C7888v2;
import gy3.C87412m;
import ht1.C60172g4;
import rs1.C13442s8;
import rs1.C13562z2;
import rx3.C36570n;
import te3.C49712hj1;

/* renamed from: er1.d3 */
public final class C7791d3 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ MMFragmentActivity f26292a;

    /* renamed from: b */
    public final /* synthetic */ BaseFinderFeed f26293b;

    /* renamed from: c */
    public final /* synthetic */ int f26294c;

    /* renamed from: d */
    public final /* synthetic */ C49712hj1 f26295d;

    public C7791d3(MMFragmentActivity mMFragmentActivity, BaseFinderFeed baseFinderFeed, int i, C49712hj1 hj12) {
        this.f26292a = mMFragmentActivity;
        this.f26293b = baseFinderFeed;
        this.f26294c = i;
        this.f26295d = hj12;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        FinderObject feedObject;
        int i3 = i2;
        Intent intent2 = intent;
        Class cls = C13442s8.class;
        if (i3 == -1) {
            String stringExtra = intent2 != null ? intent2.getStringExtra("sns_upload_desc") : null;
            C7888v2.C7889a.f26514a.getClass();
            String str = C7888v2.C7889a.f26515b;
            Log.m105924i(str, "share feed to sns desc = " + stringExtra);
            MMFragmentActivity mMFragmentActivity = this.f26292a;
            BaseFinderFeed baseFinderFeed = this.f26293b;
            C87412m.m108594g(mMFragmentActivity, "context");
            C39818r rVar = C39818r.f106831a;
            C13562z2 z2Var = (C13562z2) rVar.mo62443b(mMFragmentActivity).mo62449e(C13562z2.class);
            if (z2Var != null) {
                C87412m.m108594g(baseFinderFeed, "feed");
                C58784w3.f168295a.getClass();
                FinderItem o = baseFinderFeed.mo3513o();
                boolean z = (((o == null || (feedObject = o.getFeedObject()) == null) ? 0 : feedObject.permissionFlag) & 67108864) == 0;
                int e = C45078p0.m49926e(stringExtra, C45078p0.C45079a.MODE_CHINESE_AS_2);
                StringBuilder sb = new StringBuilder();
                sb.append("enable=");
                sb.append(z2Var.f38481j);
                sb.append(" hasPermission:");
                sb.append(z);
                sb.append(" maxLen=");
                sb.append(((Number) ((C36570n) z2Var.f38482n).getValue()).intValue());
                sb.append(" desc=");
                sb.append(stringExtra);
                sb.append(" len:");
                sb.append(stringExtra != null ? Integer.valueOf(stringExtra.length()) : null);
                sb.append(" count:");
                sb.append(e);
                Log.m105924i("FinderFeedShareDescToCommentUIC", sb.toString());
                if (z2Var.f38481j) {
                    if (!(stringExtra == null || stringExtra.length() == 0) && e <= ((Number) ((C36570n) z2Var.f38482n).getValue()).intValue() && z) {
                        z2Var.f38476f = baseFinderFeed;
                        z2Var.f38477g = stringExtra;
                        z2Var.f38474d = true;
                        if (z2Var.f38475e) {
                            z2Var.f38474d = true;
                        } else {
                            z2Var.getRootView().removeCallbacks((Runnable) ((C36570n) z2Var.f38479h4).getValue());
                            z2Var.getRootView().postDelayed((Runnable) ((C36570n) z2Var.f38479h4).getValue(), 500);
                        }
                    }
                }
            }
            C39622i0 a = rVar.mo62444c(this.f26292a).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
            C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
            if (b != null) {
                b.mo8766a(new C7322a.C7323a(2, this.f26293b.getItemId()));
            }
        } else {
            C39622i0 a2 = C39818r.f106831a.mo62444c(this.f26292a).mo75002a(cls);
            C87412m.m108593f(a2, "UICProvider.of(context).…rReporterUIC::class.java)");
            C7322a b2 = C60172g4.C60173a.m70190b((C60172g4) a2, 0, 1, (Object) null);
            if (b2 != null) {
                b2.mo8766a(new C7322a.C7323a(4, this.f26293b.getItemId()));
            }
        }
        long j = i3 == -1 ? 1 : 2;
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.ky0((C58417y0) c, this.f26293b.mo3513o().getId(), this.f26294c, j, "", this.f26295d, 0, this.f26293b.mo3513o(), 32, (Object) null);
    }
}
