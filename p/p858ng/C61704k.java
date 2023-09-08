package p858ng;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.fav.p047ui.PhotoTransControl;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1083jg.C98939a;
import p434ig.C98672d;
import p606mm.C99933h;
import p855lg.C61278a;
import ph0.C100792a;
import qh0.C62619a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import th0.C101888l;
import xl2.C102690c;

/* renamed from: ng.k */
public final class C61704k extends UIComponent implements PhotoTransControl.C93478b, C94533d.C94534a<String, C102690c> {

    /* renamed from: d */
    public final C13601g f175403d = C36568h.m40985a(new C61708d(this));

    /* renamed from: e */
    public final C13601g f175404e;

    /* renamed from: f */
    public final C13601g f175405f;

    /* renamed from: ng.k$a */
    public /* synthetic */ class C61705a extends C24565l implements C32226l<C61710l, C13598b0> {
        public C61705a(Object obj) {
            super(1, obj, C61704k.class, "processState", "processState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C61710l) obj, "p0");
            ((C61704k) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ng.k$b */
    public /* synthetic */ class C61706b extends C24565l implements C32226l<C61710l, C13598b0> {
        public C61706b(Object obj) {
            super(1, obj, C61704k.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C61710l lVar = (C61710l) obj;
            C87412m.m108594g(lVar, "p0");
            C61704k kVar = (C61704k) this.receiver;
            kVar.getClass();
            IStateAction action = lVar.getAction();
            if (action != null && (action instanceof C61730x)) {
                C61730x xVar = (C61730x) action;
                AppCompatActivity activity = kVar.getActivity();
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
                C61278a aVar = ((C61691c) a).mo86622c3().getState().f175412f;
                C77407n nVar = new C77407n((Context) kVar.getActivity(), 0, false);
                nVar.f225771i = new C61699g(aVar, kVar);
                nVar.f225773j = new C61700h(aVar, kVar);
                nVar.f225782p = new C61701i(kVar, aVar);
                nVar.f225787r = new C61703j(aVar, kVar);
                nVar.mo107573q();
                C98672d dVar = null;
                C72963f4 f4Var = aVar != null ? aVar.f174390i : null;
                C101888l lVar2 = C101888l.f300029a;
                int size = lVar2.mo141354c(aVar != null ? aVar.f174388g : null).size();
                int size2 = lVar2.mo141355d(aVar != null ? aVar.f174388g : null).size();
                long j = xVar.f175442a;
                int i = aVar != null ? aVar.f174386e : 0;
                if (aVar != null) {
                    dVar = aVar.f174389h;
                }
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(j, f4Var, size, size2, dVar, i));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ng.k$c */
    public static final class C61707c extends C87413o implements C32224a<PhotoTransControl> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f175406d;

        /* renamed from: e */
        public final /* synthetic */ C61704k f175407e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61707c(AppCompatActivity appCompatActivity, C61704k kVar) {
            super(0);
            this.f175406d = appCompatActivity;
            this.f175407e = kVar;
        }

        public Object invoke() {
            AppCompatActivity appCompatActivity = this.f175406d;
            MMActivity mMActivity = appCompatActivity instanceof MMActivity ? (MMActivity) appCompatActivity : null;
            C61704k kVar = this.f175407e;
            return new PhotoTransControl(mMActivity, kVar, kVar);
        }
    }

    /* renamed from: ng.k$d */
    public static final class C61708d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C61704k f175408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61708d(C61704k kVar) {
            super(0);
            this.f175408d = kVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f175408d.getIntent().getIntExtra("album_enter_from_scene", 1));
        }
    }

    /* renamed from: ng.k$e */
    public static final class C61709e extends C87413o implements C32224a<UIStateCenter<C61710l>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f175409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61709e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f175409d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C61710l(), this.f175409d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61704k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f175404e = C36568h.m40985a(new C61707c(appCompatActivity, this));
        this.f175405f = C36568h.m40985a(new C61709e(appCompatActivity));
    }

    /* renamed from: A4 */
    public void mo86623A4() {
    }

    /* renamed from: c3 */
    public final UIStateCenter<C61710l> mo86624c3() {
        return (UIStateCenter) ((C36570n) this.f175405f).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        r0 = (r0 = r0.f174389h).mo55248C();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getAesKey() {
        /*
            r2 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r2.getActivity()
            java.lang.String r1 = "activity"
            gy3.C87412m.m108594g(r0, r1)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r0 = r1.mo62444c(r0)
            java.lang.Class<ng.c> r1 = p858ng.C61691c.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(activity)…lleryDataUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ng.c r0 = (p858ng.C61691c) r0
            com.tencent.mm.sdk.statecenter.UIStateCenter r0 = r0.mo86622c3()
            com.tencent.mm.sdk.statecenter.BaseState r0 = r0.getState()
            ng.l r0 = (p858ng.C61710l) r0
            lg.a r0 = r0.f175412f
            if (r0 == 0) goto L_0x0034
            ig.d r0 = r0.f174389h
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.mo55248C()
            if (r0 != 0) goto L_0x0036
        L_0x0034:
            java.lang.String r0 = ""
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p858ng.C61704k.getAesKey():java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        mo86624c3().process((C0125s) getActivity(), new C61705a(this));
        mo86624c3().observe((C0125s) getActivity(), new C61706b(this));
    }

    public void onCreateAfter(Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        r0 = (r0 = r0.f174389h).mo55250D();
     */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo86626s2() {
        /*
            r2 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r2.getActivity()
            java.lang.String r1 = "activity"
            gy3.C87412m.m108594g(r0, r1)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r0 = r1.mo62444c(r0)
            java.lang.Class<ng.c> r1 = p858ng.C61691c.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(activity)…lleryDataUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ng.c r0 = (p858ng.C61691c) r0
            com.tencent.mm.sdk.statecenter.UIStateCenter r0 = r0.mo86622c3()
            com.tencent.mm.sdk.statecenter.BaseState r0 = r0.getState()
            ng.l r0 = (p858ng.C61710l) r0
            lg.a r0 = r0.f175412f
            if (r0 == 0) goto L_0x0034
            ig.d r0 = r0.f174389h
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.mo55250D()
            if (r0 != 0) goto L_0x0036
        L_0x0034:
            java.lang.String r0 = ""
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p858ng.C61704k.mo86626s2():java.lang.String");
    }

    /* renamed from: u5 */
    public String mo86627u5() {
        AppCompatActivity activity = getActivity();
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
        C61278a aVar = ((C61691c) a).mo86622c3().getState().f175412f;
        C100792a aVar2 = C100792a.f295260a;
        C72963f4 f4Var = null;
        C98672d dVar = aVar != null ? aVar.f174389h : null;
        if (aVar != null) {
            f4Var = aVar.f174390i;
        }
        return aVar2.mo140238j(dVar, f4Var);
    }

    /* renamed from: w3 */
    public /* bridge */ /* synthetic */ void mo86628w3(Object obj, Object obj2) {
        String str = (String) obj;
        C102690c cVar = (C102690c) obj2;
    }

    /* renamed from: x3 */
    public void mo86629x3() {
    }
}
