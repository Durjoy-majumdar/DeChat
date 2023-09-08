package rs1;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C0317e;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import q62.C101048b;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C113200q(initialMode = 2)
/* renamed from: rs1.gb */
public final class C63555gb extends UIComponent {

    /* renamed from: d */
    public TextView f180240d;

    /* renamed from: e */
    public final Runnable f180241e = new C36473a(this);

    /* renamed from: f */
    public List<? extends Fragment> f180242f;

    /* renamed from: g */
    public final C101048b.C35768a f180243g = new C36474b(this);

    /* renamed from: rs1.gb$a */
    public static final class C36473a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63555gb f97048d;

        public C36473a(C63555gb gbVar) {
            this.f97048d = gbVar;
        }

        public final void run() {
            C63555gb gbVar = this.f97048d;
            TextView textView = gbVar.f180240d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            gbVar.mo88407c3(false);
            Log.m105924i("FinderWifiHintUIC", "[hideHint]");
        }
    }

    /* renamed from: rs1.gb$b */
    public static final class C36474b implements C101048b.C35768a {

        /* renamed from: a */
        public final /* synthetic */ C63555gb f97049a;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderWifiHintUIC$onSimChange$1$1", mo125469f = "FinderWifiHintUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.gb$b$a */
        public static final class C36475a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ int f97050d;

            /* renamed from: e */
            public final /* synthetic */ int f97051e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C36475a(int i, int i2, C15601d<? super C36475a> dVar) {
                super(2, dVar);
                this.f97050d = i;
                this.f97051e = i2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C36475a(this.f97050d, this.f97051e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C36475a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                int Pe = ((C101048b) C86312j.m106911c(C101048b.class)).mo60591Pe();
                if (this.f97050d == 3) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_NOT_WIFI_HINT_WK_TYPE_INT_SYNC, new Integer(Pe));
                }
                Log.m105918d("FinderWifiHintUIC", "[onSIMCardChange] simType:" + this.f97051e + " reason:" + this.f97050d + " wkType:" + Pe + ' ' + Thread.currentThread().getName());
                return C13598b0.f38549a;
            }
        }

        public C36474b(C63555gb gbVar) {
            this.f97049a = gbVar;
        }

        /* renamed from: a */
        public final void mo60388a(int i, int i2) {
            C0317e.launch$default(this.f97049a, (C66212f) null, (C53934p0) null, new C36475a(i2, i, (C15601d<? super C36475a>) null), 3, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63555gb(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo88407c3(boolean z) {
        RefreshLoadMoreLayout refreshLoadMoreLayout;
        RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout;
        float f = 0.0f;
        float dimension = z ? getActivity().getResources().getDimension(C0966R.dimen.f3736cp) : 0.0f;
        float dimension2 = getActivity().getResources().getDimension(C0966R.dimen.f3738cr);
        TextView textView = this.f180240d;
        float measuredHeight = textView != null ? (float) textView.getMeasuredHeight() : 0.0f;
        if (z) {
            if (measuredHeight <= 0.0f || measuredHeight <= dimension2) {
                f = dimension2;
            } else {
                dimension += measuredHeight - dimension2;
                f = measuredHeight;
            }
        }
        Log.m105924i("FinderWifiHintUIC", "[setLoadingOffsetExtra] isShow:" + z + " hintHeight:" + f + " minHintHeight:" + dimension2 + " measuredHeight:" + measuredHeight);
        List<? extends Fragment> list = this.f180242f;
        if (list != null) {
            for (Fragment view : list) {
                View view2 = view.getView();
                if (!(view2 == null || (refreshLoadMoreLayout = (RefreshLoadMoreLayout) view2.findViewById(C0966R.C0970id.ivb)) == null || (stickTopLoadingLayout = refreshLoadMoreLayout.getStickTopLoadingLayout()) == null)) {
                    stickTopLoadingLayout.f24942i = dimension;
                    stickTopLoadingLayout.f24943j = f;
                    if (stickTopLoadingLayout.f24937d.getVisibility() == 0) {
                        stickTopLoadingLayout.setTranslationY(stickTopLoadingLayout.getTranslationY() + dimension);
                    } else {
                        stickTopLoadingLayout.f24941h.invoke(Float.valueOf(dimension + f));
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C101048b) C86312j.m106911c(C101048b.class)).mo60593th(8, this.f180243g);
        this.f180240d = (TextView) getActivity().findViewById(C0966R.C0970id.lq6);
        Log.m105918d("FinderWifiHintUIC", "[onCreate] addListener");
    }

    public void onDestroy() {
        super.onDestroy();
        ((C101048b) C86312j.m106911c(C101048b.class)).mo60589AS(8, this.f180243g);
        Log.m105918d("FinderWifiHintUIC", "[onDestroy] removeListener");
    }
}
