package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gy3.C87412m;
import h81.C59774i;
import java.util.Map;
import kotlin.Metadata;
import l31.C61212e;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import u24.C90599h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderConversationParentUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationUI */
public final class FinderConversationUI extends FinderConversationParentUI {

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationUI$a */
    public static final class C3647a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderConversationUI f16794a;

        public C3647a(FinderConversationUI finderConversationUI) {
            this.f16794a = finderConversationUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f16794a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[5];
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
            Intent intent2 = this.f16794a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: N7 */
    public Fragment mo4019N7() {
        return new FinderConversationFragment();
    }

    /* renamed from: O7 */
    public String mo2965O7() {
        String string = getString(C0966R.string.d4j);
        C87412m.m108593f(string, "this.getString(R.string.…ion_finder_message_title)");
        return string;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder).mo86148No(this, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3647a(this));
    }
}
