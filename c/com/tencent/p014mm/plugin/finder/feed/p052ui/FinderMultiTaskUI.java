package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import h81.C59774i;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C48086u6;
import rs1.C63575n3;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import u24.C90599h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderMultiTaskUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI */
public final class FinderMultiTaskUI extends FinderFloatBallDetailUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI$a */
    public static final class C2992a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderMultiTaskUI f14624a;

        public C2992a(FinderMultiTaskUI finderMultiTaskUI) {
            this.f14624a = finderMultiTaskUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14624a.getIntent();
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
            Intent intent2 = this.f14624a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 4;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> C0 = C110818d0.m150902C0(super.importUIComponents());
        C0.add(C48086u6.class);
        return C0;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this).mo75002a(C63575n3.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.remove("key_multi_task_common_info");
        } else {
            extras = null;
        }
        n3Var.mo88425i3(extras);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderMultiTaskUI).mo86179qs(this, C76986a.Finder).mo86148No(this, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C2992a(this));
    }
}
