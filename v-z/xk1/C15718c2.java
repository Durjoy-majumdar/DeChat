package xk1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPGeneralError;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import pe3.C89349b;
import qo3.C12925w;
import qo3.w$$d;
import rx3.C13598b0;
import te3.C49430fj0;
import te3.C49567gj0;
import te3.C49711hj0;
import tf0.C13883o1;
import zc1.C66785b;

/* renamed from: xk1.c2 */
public final class C15718c2 extends UIComponent {

    /* renamed from: d */
    public final String f42416d = "FinderLivePostSecurityUIC";

    /* renamed from: e */
    public C32226l<? super Boolean, C13598b0> f42417e;

    /* renamed from: f */
    public final int f42418f = TPGeneralError.NOT_INIT;

    /* renamed from: xk1.c2$a */
    public static final class C15719a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12925w f42419d;

        public C15719a(C12925w wVar) {
            this.f42419d = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f42419d.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xk1.c2$b */
    public static final class C15720b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15718c2 f42420d;

        /* renamed from: e */
        public final /* synthetic */ C12925w f42421e;

        public C15720b(C15718c2 c2Var, C12925w wVar) {
            this.f42420d = c2Var;
            this.f42421e = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c, C54067f0.C0064m.LIVE_SAFETY_HINT_GO, this.f42420d.mo14446f3("168"), (String) null, "168", (String) null, 20, (Object) null);
            this.f42421e.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xk1.c2$c */
    public static final class C15721c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15718c2 f42422d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f42423e;

        /* renamed from: f */
        public final /* synthetic */ C12925w f42424f;

        public C15721c(C15718c2 c2Var, C8477a0 a0Var, C12925w wVar) {
            this.f42422d = c2Var;
            this.f42423e = a0Var;
            this.f42424f = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c, C54067f0.C0064m.LIVE_SAFETY_HINT_START, this.f42422d.mo14446f3("168"), (String) null, "168", (String) null, 20, (Object) null);
            this.f42423e.f27482d = true;
            this.f42424f.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xk1.c2$d */
    public static final class C15722d implements w$$d {

        /* renamed from: a */
        public final /* synthetic */ C15718c2 f42425a;

        /* renamed from: b */
        public final /* synthetic */ long f42426b;

        /* renamed from: c */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f42427c;

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f42428d;

        public C15722d(C15718c2 c2Var, long j, C32226l<? super Boolean, C13598b0> lVar, C8477a0 a0Var) {
            this.f42425a = c2Var;
            this.f42426b = j;
            this.f42427c = lVar;
            this.f42428d = a0Var;
        }

        public final void onDismiss() {
            ((C54116w) C86312j.m106911c(C54116w.class)).Ey0("168", this.f42425a.mo14445e3(Boolean.TRUE, Long.valueOf(C31543z5.m39453c() - this.f42426b)));
            this.f42427c.invoke(Boolean.valueOf(this.f42428d.f27482d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15718c2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final boolean mo14443c3(C49430fj0 fj02, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(fj02, "resp");
        C87412m.m108594g(lVar, "afterShowErrPageListener");
        String str = this.f42416d;
        Log.m105924i(str, "[checkSecurityResp] type = " + fj02.f133530d);
        int i = fj02.f133530d;
        if (i == 0) {
            return true;
        }
        C13598b0 b0Var = null;
        if (i == 1) {
            C89349b bVar = fj02.f133531e;
            if (bVar != null) {
                try {
                    C49711hj0 hj02 = new C49711hj0();
                    hj02.parseFrom(bVar.mo123703f());
                    mo14444d3(hj02, lVar);
                } catch (Exception e) {
                    String str2 = this.f42416d;
                    Log.m105924i(str2, "parseFrom Exception = " + e.getMessage());
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i(this.f42416d, "page_wording_buff is empty");
            }
        } else if (i == 2 || i == 3 || i == 4) {
            C89349b bVar2 = fj02.f133531e;
            if (bVar2 != null) {
                try {
                    C49567gj0 gj02 = new C49567gj0();
                    gj02.parseFrom(bVar2.mo123703f());
                    this.f42417e = lVar;
                    ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13283k9(getActivity(), (Intent) null, this.f42418f, gj02, Integer.valueOf(fj02.f133530d));
                } catch (Exception e2) {
                    String str3 = this.f42416d;
                    Log.m105924i(str3, "parseFrom Exception = " + e2.getMessage());
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i(this.f42416d, "page_wording_buff is empty");
            }
        } else {
            Log.m105924i(this.f42416d, "unknown type");
            return true;
        }
        return false;
    }

    /* renamed from: d3 */
    public final void mo14444d3(C49711hj0 hj02, C32226l<? super Boolean, C13598b0> lVar) {
        Class cls = C8777j5.class;
        C12925w wVar = new C12925w(getContext());
        wVar.mo12469i(true);
        wVar.mo12472l(Boolean.TRUE);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.cyq, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
        TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.n_t);
        TextView textView2 = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.n_s);
        View findViewById = roundedCornerFrameLayout.findViewById(C0966R.C0970id.n_r);
        ((TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.n_u)).setText(hj02.f134667d);
        textView2.setText(hj02.f134669f);
        textView.setText(hj02.f134668e);
        C8477a0 a0Var = new C8477a0();
        long c = C31543z5.m39453c();
        findViewById.setOnClickListener(new C15719a(wVar));
        textView.setOnClickListener(new C15720b(this, wVar));
        textView2.setOnClickListener(new C15721c(this, a0Var, wVar));
        wVar.f36937s = new C15722d(this, c, lVar, a0Var);
        wVar.mo12471k(roundedCornerFrameLayout);
        wVar.mo5086o();
        ((C54116w) C86312j.m106911c(C54116w.class)).Dy0("168", mo14445e3(Boolean.FALSE, 0L));
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8609j((C8777j5) c2, C54067f0.C0066n.LIVE_SAFETY_HINT_GO, mo14446f3("168"), (String) null, "168", (String) null, 20, (Object) null);
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8609j((C8777j5) c3, C54067f0.C0066n.LIVE_SAFETY_HINT_START, mo14446f3("168"), (String) null, "168", (String) null, 20, (Object) null);
    }

    /* renamed from: e3 */
    public final String mo14445e3(Boolean bool, Long l) {
        Class cls = LiveAnchorSlice.class;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        int i = bVar != null ? ((LiveAnchorSlice) bVar.mo71262a(cls)).f160032h : 0;
        finderLiveService.getClass();
        C45795b bVar2 = FinderLiveService.f159348A;
        long j = bVar2 != null ? ((LiveAnchorSlice) bVar2.mo71262a(cls)).f160033i : 0;
        try {
            C104289g gVar = new C104289g();
            gVar.put("finder_username", C66785b.f191882e.mo90662O5());
            gVar.mo145953n("entrance_type", i);
            gVar.mo145954o("entrance_id", j);
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                gVar.put("staytime", l);
            }
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "{\n            val json =…json.toString()\n        }");
            return gVar2;
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* renamed from: f3 */
    public final HashMap<String, String> mo14446f3(String str) {
        Class cls = LiveAnchorSlice.class;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        int i = bVar != null ? ((LiveAnchorSlice) bVar.mo71262a(cls)).f160032h : 0;
        finderLiveService.getClass();
        C45795b bVar2 = FinderLiveService.f159348A;
        long j = bVar2 != null ? ((LiveAnchorSlice) bVar2.mo71262a(cls)).f160033i : 0;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("page_id", str);
        hashMap.put("fidner_username", C66785b.f191882e.mo90662O5());
        hashMap.put("entrance_type", String.valueOf(i));
        hashMap.put("entrance_id", String.valueOf(j));
        return hashMap;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = this.f42416d;
        Log.m105924i(str, "requestCode:" + i + ", resultCode:" + i2);
        if (i != this.f42418f) {
            return;
        }
        if (i2 == -1) {
            C32226l<? super Boolean, C13598b0> lVar = this.f42417e;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        C32226l<? super Boolean, C13598b0> lVar2 = this.f42417e;
        if (lVar2 != null) {
            lVar2.invoke(Boolean.FALSE);
        }
    }
}
