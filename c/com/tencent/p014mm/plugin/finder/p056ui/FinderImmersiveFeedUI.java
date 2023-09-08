package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import bl3.C0324s;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import gy3.C24560g0;
import h81.C59774i;
import ht1.C8800r1;
import ht1.C8820z3;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kq1.C10399s;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C13188d6;
import rs1.C63513a1;
import rs1.C63539a6;
import rs1.C63648v;
import rs1.C63663w5;
import rx3.C13604l;
import sx3.C110826x0;
import sx3.C90364q0;
import u24.C90599h;
import vo3.C90852c;
import vp1.C65834e;
import zn1.C16336r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderImmersiveFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderImmersiveFeedUI */
public final class FinderImmersiveFeedUI extends MMFinderUI {

    /* renamed from: o */
    public int f16901o = -1;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderImmersiveFeedUI$a */
    public static final class C3674a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderImmersiveFeedUI f16902a;

        /* renamed from: b */
        public final /* synthetic */ long f16903b;

        public C3674a(FinderImmersiveFeedUI finderImmersiveFeedUI, long j) {
            this.f16902a = finderImmersiveFeedUI;
            this.f16903b = j;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f16902a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[7];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str3 = "";
            if (Wb == null) {
                Wb = str3;
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str3;
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 != null) {
                str3 = S0;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str3);
            lVarArr[3] = new C13604l("extra_info", valueOf);
            Intent intent2 = this.f16902a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            lVarArr[5] = new C13604l("feed_id", C61926c.m72691p(this.f16903b));
            lVarArr[6] = new C13604l("media_type", Integer.valueOf(this.f16902a.f16901o));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        mo4060N7();
        if (this.f16901o == 2) {
            return 192;
        }
        return WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: N7 */
    public final void mo4060N7() {
        if (this.f16901o == -1) {
            FinderItem e = C65834e.f189316a.mo89871e(getIntent().getLongExtra("intent_feed_id", 0));
            this.f16901o = e != null ? e.getMediaType() : 4;
        }
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13188d6.class, FinderImmersiveImageUIC.class, FinderImmersiveVideoUIC.class, C63539a6.class, C63663w5.class, C16336r.class, C63648v.class, C0324s.m265a(C24560g0.m30725a(C8820z3.class)), C10399s.class, C0324s.m265a(C24560g0.m30725a(C8800r1.class)), C63513a1.class);
    }

    public boolean isHideStatusBar() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        mo4060N7();
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("intent_feed_id", 0);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderImmersiveFeedUI);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderImmersiveFeedUI");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3674a(this, longExtra));
    }
}
