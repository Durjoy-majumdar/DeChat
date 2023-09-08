package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import di3.C86312j;
import h81.C59774i;
import java.util.Map;
import java.util.Set;
import kf1.C9720fa;
import kf1.C9957r9;
import kotlin.Metadata;
import l31.C61212e;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C13492va;
import rx3.C13604l;
import sx3.C22415w0;
import sx3.C90364q0;
import u24.C90599h;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTimelineLbsUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI */
public final class FinderTimelineLbsUI extends MMFinderUI {

    /* renamed from: o */
    public static final /* synthetic */ int f14860o = 0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI$a */
    public static final class C3069a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineLbsUI f14861d;

        public C3069a(FinderTimelineLbsUI finderTimelineLbsUI) {
            this.f14861d = finderTimelineLbsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14861d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI$b */
    public static final class C3070b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineLbsUI f14862d;

        public C3070b(FinderTimelineLbsUI finderTimelineLbsUI) {
            this.f14862d = finderTimelineLbsUI;
        }

        public final void run() {
            FinderTimelineLbsUI finderTimelineLbsUI = this.f14862d;
            int i = FinderTimelineLbsUI.f14860o;
            C13492va vaVar = (C13492va) finderTimelineLbsUI.component(C13492va.class);
            C9720fa faVar = vaVar.f38222d;
            if (faVar != null) {
                faVar.mo10326t(false);
            }
            C9957r9 r9Var = vaVar.f38223e;
            if (r9Var != null) {
                r9Var.mo10461x(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI$c */
    public static final class C3071c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineLbsUI f14863d;

        public C3071c(FinderTimelineLbsUI finderTimelineLbsUI) {
            this.f14863d = finderTimelineLbsUI;
        }

        public final void run() {
            FinderTimelineLbsUI finderTimelineLbsUI = this.f14863d;
            int i = FinderTimelineLbsUI.f14860o;
            C13492va vaVar = (C13492va) finderTimelineLbsUI.component(C13492va.class);
            C9720fa faVar = vaVar.f38222d;
            if (faVar != null) {
                faVar.mo10326t(true);
            }
            C9957r9 r9Var = vaVar.f38223e;
            if (r9Var != null) {
                r9Var.mo10461x(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI$d */
    public static final class C3072d implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderTimelineLbsUI f14864a;

        public C3072d(FinderTimelineLbsUI finderTimelineLbsUI) {
            this.f14864a = finderTimelineLbsUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14864a.getIntent();
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
            Intent intent2 = this.f14864a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        C37521f.f99374d.getClass();
        return C37521f.f99306V0.mo60266n().intValue() == 1 ? 15 : 34;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        C37521f.f99374d.getClass();
        return C37521f.f99306V0.mo60266n().intValue() == 1 ? 3 : 5;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C13492va.class);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.eqo);
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77239M5("finder_tl_nearby_tab");
        setBackBtn(new C3069a(this));
        setTitleBarClickListener(new C3070b(this), new C3071c(this));
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderTimelineLbsUI");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3072d(this));
    }
}
