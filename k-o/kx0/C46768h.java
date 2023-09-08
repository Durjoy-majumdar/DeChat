package kx0;

import ac2.C39534d;
import ac2.C39535k;
import ac2.C53998c;
import ac2.C54000f;
import ac2.C91988j;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import mx0.C47111e;
import mx0.C47112f;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: kx0.h */
public final class C46768h extends UIComponent {

    /* renamed from: d */
    public C89779i0 f125875d;

    /* renamed from: e */
    public C54219z<C46769a> f125876e = new C54219z<>();

    /* renamed from: f */
    public final C13601g f125877f;

    /* renamed from: g */
    public final C13601g f125878g;

    /* renamed from: kx0.h$a */
    public static abstract class C46769a {

        /* renamed from: kx0.h$a$a */
        public static final class C46770a extends C46769a {

            /* renamed from: a */
            public static final C46770a f125879a = new C46770a();
        }

        /* renamed from: kx0.h$a$c */
        public static final class C46772c extends C46769a {

            /* renamed from: a */
            public static final C46772c f125881a = new C46772c();
        }

        /* renamed from: kx0.h$a$d */
        public static final class C46773d extends C46769a {

            /* renamed from: a */
            public static final C46773d f125882a = new C46773d();
        }

        /* renamed from: kx0.h$a$b */
        public static final class C46771b extends C46769a {

            /* renamed from: a */
            public final C46774b f125880a;

            public C46771b(C46774b bVar) {
                C87412m.m108594g(bVar, "footerState");
                this.f125880a = bVar;
            }

            public C46771b() {
                this(C46774b.None);
            }
        }
    }

    /* renamed from: kx0.h$b */
    public enum C46774b {
        None,
        Loading,
        End
    }

    /* renamed from: kx0.h$c */
    public static final class C46775c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f125887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46775c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f125887d = appCompatActivity;
        }

        public Object invoke() {
            AppCompatActivity appCompatActivity = this.f125887d;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
            return (TextView) ((BizPCRecentReadUI) appCompatActivity).findViewById(C0966R.C0970id.ny9);
        }
    }

    /* renamed from: kx0.h$d */
    public static final class C46776d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f125888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46776d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f125888d = appCompatActivity;
        }

        public Object invoke() {
            AppCompatActivity appCompatActivity = this.f125888d;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
            return ((BizPCRecentReadUI) appCompatActivity).findViewById(C0966R.C0970id.nyb);
        }
    }

    /* renamed from: kx0.h$e */
    public static final class C46777e<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C46768h f125889d;

        /* renamed from: e */
        public final /* synthetic */ C46754a f125890e;

        public C46777e(C46768h hVar, C46754a aVar) {
            this.f125889d = hVar;
            this.f125890e = aVar;
        }

        public void onChanged(Object obj) {
            this.f125889d.mo72008c3(((C91988j) obj).f263327a, this.f125890e.mo72005d3());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46768h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f125877f = C36568h.m40985a(new C46775c(appCompatActivity));
        this.f125878g = C36568h.m40985a(new C46776d(appCompatActivity));
    }

    /* renamed from: c3 */
    public final void mo72008c3(C39535k kVar, MvvmList<C47111e> mvvmList) {
        Object obj;
        C39535k kVar2 = C39535k.AfterLoadPage;
        C87412m.m108594g(mvvmList, "mvvmList");
        ArrayList<T> arrayList = mvvmList.f272353o;
        C54000f<T, C53998c<T>, C39534d<T>> fVar = mvvmList.f272345d;
        C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.data.BizPCRecentReadDataSource");
        if (((C47112f) fVar).f126592f) {
            obj = C46769a.C46770a.f125879a;
        } else {
            C39535k kVar3 = C39535k.UIRefresh;
            if (kVar != kVar3 || !arrayList.isEmpty()) {
                C39535k kVar4 = C39535k.BeforeLoadPage;
                obj = ((kVar == kVar4 || kVar == kVar2) && arrayList.isEmpty()) ? C46769a.C46772c.f125881a : ((kVar == kVar4 || kVar == kVar2) && mvvmList.f272350i) ? new C46769a.C46771b(C46774b.Loading) : (kVar != kVar3 || mvvmList.f272350i) ? new C46769a.C46771b(C46774b.None) : new C46769a.C46771b(C46774b.End);
            } else {
                obj = C46769a.C46773d.f125882a;
            }
        }
        this.f125876e.postValue(obj);
    }

    public void onCreateAfter(Bundle bundle) {
        Class cls = C46754a.class;
        super.onCreateAfter(bundle);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62443b(getContext()).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(context).…entReadRvUIC::class.java)");
        C46754a aVar = (C46754a) a;
        aVar.mo72005d3().f272358t.observe((BizPCRecentReadUI) activity, new C46777e(this, aVar));
        TextView textView = (TextView) ((View) ((C36570n) this.f125878g).getValue()).findViewById(C0966R.C0970id.ny_);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        C39622i0 a2 = rVar.mo62443b(getContext()).mo75002a(cls);
        C87412m.m108593f(a2, "UICProvider.of(context).…entReadRvUIC::class.java)");
        C39622i0 a3 = rVar.mo62443b(getContext()).mo75002a(C46768h.class);
        C87412m.m108593f(a3, "UICProvider.of(context).…ReadStateUIC::class.java)");
        textView.setOnClickListener(new C46778i((BizPCRecentReadUI) activity2, (C46754a) a2, (C46768h) a3));
        C7007c1.m7256a(textView);
        AppCompatActivity activity3 = getActivity();
        C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        BizPCRecentReadUI bizPCRecentReadUI = (BizPCRecentReadUI) activity3;
        C39622i0 a4 = rVar.mo62443b(getContext()).mo75002a(cls);
        C87412m.m108593f(a4, "UICProvider.of(context).…entReadRvUIC::class.java)");
        this.f125876e.observe(bizPCRecentReadUI, new C46780j((C46754a) a4, this, bizPCRecentReadUI));
    }
}
