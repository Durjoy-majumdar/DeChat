package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ao1.C0145d1;
import as1.C0201a;
import bg1.C0278a;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC;
import di3.C86312j;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8761d3;
import ht1.C8807v3;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import mo1.C10943a;
import mo1.C11013k1;
import mo1.C11025q;
import mo1.C11057v;
import nj3.C88989a;
import o31.C11345b;
import o31.C76986a;
import p140cw.C7135d;
import p140cw.C7136e;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p185kq.C10383h;
import p217oq.C11716d;
import p599lr.C61381b;
import q31.C118148a;
import rs1.C13222f;
import rs1.C13317l7;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import sx3.C90364q0;
import ts1.C14078c;
import u24.C90599h;
import vo3.C90852c;
import wc1.C15102p;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lbg1/a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI */
public final class FinderProfileUI extends MMFinderUI implements C0278a {

    /* renamed from: o */
    public final C13601g f14744o = C36568h.m40985a(new C3036a(this));

    /* renamed from: p */
    public C32224a<C13598b0> f14745p;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI$a */
    public static final class C3036a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileUI f14746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3036a(FinderProfileUI finderProfileUI) {
            super(0);
            this.f14746d = finderProfileUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f14746d.isFragmentMode());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI$b */
    public static final class C3037b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileUI f14747a;

        public C3037b(FinderProfileUI finderProfileUI) {
            this.f14747a = finderProfileUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14747a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            int i = (this.f14747a.mo2194I7() == 137 || this.f14747a.mo2194I7() == 137) ? 1 : 0;
            C13604l[] lVarArr = new C13604l[6];
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
            Intent intent2 = this.f14747a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            lVarArr[5] = new C13604l(PatchedFlutterActivity.EXTRA_PAGE_TYPE, Integer.valueOf(i));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        String stringExtra = getIntent().getStringExtra("finder_username");
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        if (C87412m.m108589b(stringExtra, C66785b.f191882e.mo90662O5()) && booleanExtra) {
            z = true;
        }
        if (z && !mo3097N7()) {
            return 33;
        }
        if (!z || !mo3097N7()) {
            return ((z || mo3097N7()) && !z && mo3097N7()) ? 136 : 32;
        }
        return 137;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    /* renamed from: N7 */
    public final boolean mo3097N7() {
        return ((Boolean) ((C36570n) this.f14744o).getValue()).booleanValue();
    }

    public void finish() {
        FinderProfileDrawerUIC finderProfileDrawerUIC;
        C0201a aVar;
        if (!isFragmentMode()) {
            super.finish();
        } else {
            Activity parentActivity = getParentActivity();
            if (!(parentActivity == null || (finderProfileDrawerUIC = (FinderProfileDrawerUIC) C39818r.f106831a.mo62443b(parentActivity).mo62449e(FinderProfileDrawerUIC.class)) == null || (aVar = finderProfileDrawerUIC.f18766f) == null)) {
                FinderDraggableLayout.m4279a(aVar, false, 1, (Object) null);
            }
        }
        C32224a<C13598b0> aVar2 = this.f14745p;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(FinderProfileTabUIC.class, C11013k1.class, C10943a.class, FinderProfileHeaderUIC.class, C11025q.class, C0324s.m265a(C24560g0.m30725a(C8761d3.class)), C11057v.class, C13222f.class, C0145d1.class, C14078c.class, C15102p.class, FinderProfileUiStyleUIC.class);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        ((C8807v3) C39818r.f106831a.mo62444c(this).mo62447c(C8807v3.class)).mo9633R2(true);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderProfileUI);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderProfileUI");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3037b(this));
    }

    public void onDestroy() {
        super.onDestroy();
        ((C7135d) C86312j.m106911c(C7135d.class)).mo8304uS(String.valueOf(hashCode()));
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        super.onResume();
        if (((C61381b) C86312j.m106911c(C61381b.class)).E80().enableRecordTemplate()) {
            ((C7135d) C86312j.m106911c(C7135d.class)).mo8303ds(String.valueOf(hashCode())).mo8307c(((C7136e) C86312j.m106911c(C7136e.class)).mo8305L9(), false);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        if (mo3097N7()) {
            hashSet.remove(C13317l7.class);
        }
    }
}
