package p226rg;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.p136ui.component.UIComponent;
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
import qh0.C62619a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import th0.C101888l;

/* renamed from: rg.i */
public final class C63417i extends UIComponent {

    /* renamed from: d */
    public final C13601g f179904d = C36568h.m40985a(new C63420c(this));

    /* renamed from: e */
    public final C13601g f179905e;

    /* renamed from: rg.i$a */
    public /* synthetic */ class C63418a extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63418a(Object obj) {
            super(1, obj, C63417i.class, "processState", "processState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C63426k) obj, "p0");
            ((C63417i) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.i$b */
    public /* synthetic */ class C63419b extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63419b(Object obj) {
            super(1, obj, C63417i.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C63426k kVar = (C63426k) obj;
            C87412m.m108594g(kVar, "p0");
            C63417i iVar = (C63417i) this.receiver;
            iVar.getClass();
            IStateAction action = kVar.getAction();
            if (action != null && (action instanceof C63434t)) {
                C63434t tVar = (C63434t) action;
                C77407n nVar = new C77407n((Context) iVar.getActivity(), 0, false);
                nVar.f225771i = new C12995g(iVar);
                nVar.f225782p = new C63416h(iVar, tVar);
                nVar.mo107573q();
                C101888l lVar = C101888l.f300029a;
                int size = lVar.mo141354c(tVar.f179919c).size();
                int size2 = lVar.mo141355d(tVar.f179919c).size();
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(tVar.f179917a, (C72963f4) null, size, size2, (C98672d) null, 0));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.i$c */
    public static final class C63420c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C63417i f179906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63420c(C63417i iVar) {
            super(0);
            this.f179906d = iVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f179906d.getIntent().getIntExtra("album_enter_from_scene", 1));
        }
    }

    /* renamed from: rg.i$d */
    public static final class C63421d extends C87413o implements C32224a<UIStateCenter<C63426k>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f179907d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63421d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f179907d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C63426k(), this.f179907d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63417i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f179905e = C36568h.m40985a(new C63421d(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        ((UIStateCenter) ((C36570n) this.f179905e).getValue()).process((C0125s) getActivity(), new C63418a(this));
        ((UIStateCenter) ((C36570n) this.f179905e).getValue()).observe((C0125s) getActivity(), new C63419b(this));
    }

    public void onCreateAfter(Bundle bundle) {
    }
}
