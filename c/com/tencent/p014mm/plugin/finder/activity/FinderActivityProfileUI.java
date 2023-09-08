package com.tencent.p014mm.plugin.finder.activity;

import android.os.Bundle;
import ce1.C0452a;
import ce1.C0454b;
import ce1.C0456c;
import ce1.C0464f0;
import ce1.C0465g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.base.p048ui.BaseProfileUI;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityTabUIC;
import di3.C86312j;
import gy3.C8480h;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import od1.C11396b;
import sx3.C110826x0;
import te3.C51270sn1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/FinderActivityProfileUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lte3/sn1;", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.FinderActivityProfileUI */
public class FinderActivityProfileUI extends BaseProfileUI<C51270sn1> {

    /* renamed from: q */
    public static final C2299a f12447q = new C2299a((C8480h) null);

    /* renamed from: p */
    public final C0454b f12448p = new C0454b();

    /* renamed from: com.tencent.mm.plugin.finder.activity.FinderActivityProfileUI$a */
    public static final class C2299a {
        public C2299a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo2198a(long j, String str, int i) {
            if (j == 0) {
                return i + '_' + str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('_');
            sb.append(j);
            return sb.toString();
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 59;
    }

    /* renamed from: V3 */
    public C11396b<C51270sn1> mo2195V3() {
        return this.f12448p;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(FinderActivityTabUIC.class, C0465g.class, FinderActivityParticipateUIC.class, C0452a.class, C0456c.class, C0464f0.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderActivityProfileUI).mo86179qs(this, C76986a.Finder);
    }

    /* renamed from: z5 */
    public int mo2197z5() {
        return C0966R.C0971layout.a8o;
    }
}
