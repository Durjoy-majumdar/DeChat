package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import bl3.C0324s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import di3.C86312j;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8800r1;
import ht1.C8820z3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C13194da;
import rs1.C13354o6;
import rs1.C13539y3;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63575n3;
import rs1.C63648v;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import sx3.C90364q0;
import u24.C90599h;
import vo3.C90852c;
import ye1.C15976o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderNewStyleTimelineUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI */
public final class FinderNewStyleTimelineUI extends MMFinderUI {

    /* renamed from: o */
    public final C13601g f14625o = C36568h.m40985a(new C2993a(this));

    /* renamed from: p */
    public FinderLikeDrawer f14626p;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI$a */
    public static final class C2993a extends C87413o implements C32224a<C15976o> {

        /* renamed from: d */
        public final /* synthetic */ FinderNewStyleTimelineUI f14627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2993a(FinderNewStyleTimelineUI finderNewStyleTimelineUI) {
            super(0);
            this.f14627d = finderNewStyleTimelineUI;
        }

        public Object invoke() {
            return C15976o.m14888a(this.f14627d.findViewById(C0966R.C0970id.egf));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI$b */
    public static final class C2994b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderNewStyleTimelineUI f14628d;

        public C2994b(FinderNewStyleTimelineUI finderNewStyleTimelineUI) {
            this.f14628d = finderNewStyleTimelineUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderNewStyleTimelineUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14628d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderNewStyleTimelineUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI$c */
    public static final class C2995c implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderNewStyleTimelineUI f14629a;

        public C2995c(FinderNewStyleTimelineUI finderNewStyleTimelineUI) {
            this.f14629a = finderNewStyleTimelineUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14629a.getIntent();
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
            Intent intent2 = this.f14629a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 162;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 6;
    }

    public boolean enableActivityAnimation() {
        return false;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13354o6.class, C13539y3.class, C63545b1.class, C48085q4.class, C63513a1.class, C0324s.m265a(C24560g0.m30725a(C8820z3.class)), C0324s.m265a(C24560g0.m30725a(C8800r1.class)), C13194da.class, C56711j.class, C63575n3.class, C63648v.class);
    }

    public void onBackPressed() {
        FinderLikeDrawer finderLikeDrawer = this.f14626p;
        if (finderLikeDrawer != null) {
            if (finderLikeDrawer == null) {
                C87412m.m108603p("friendLikeDrawer");
                throw null;
            } else if (finderLikeDrawer.mo82541i()) {
                FinderLikeDrawer finderLikeDrawer2 = this.f14626p;
                if (finderLikeDrawer2 != null) {
                    finderLikeDrawer2.mo4615l();
                    return;
                } else {
                    C87412m.m108603p("friendLikeDrawer");
                    throw null;
                }
            }
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        this.mController.mo177105z0(getResources().getColor(C0966R.color.f3131gg));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        ((C15976o) ((C36570n) this.f14625o).getValue()).f42961e.setVisibility(0);
        ((C15976o) ((C36570n) this.f14625o).getValue()).f42961e.setBackground((Drawable) null);
        ((C15976o) ((C36570n) this.f14625o).getValue()).f42957a.setOnClickListener(new C2994b(this));
        this.f14626p = FinderLikeDrawer.f17829D.mo4621a(this, getWindow(), 1);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderNewStyleTimelineUI).mo86179qs(this, C76986a.Finder).mo86148No(this, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C2995c(this));
    }
}
