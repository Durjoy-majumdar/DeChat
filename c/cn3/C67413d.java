package cn3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bi3.C54461b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fy3.C32226l;
import g62.C45881a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p278yh.C79113j;
import p749xh.C78821o1;
import rx3.C13598b0;
import sx3.C26236u;
import tm3.C78047a;
import tm3.C78055d;
import tm3.C78065p;
import tm3.C78068v;
import tm3.C78069w;
import yb2.C15946a;
import z04.C112550d0;

/* renamed from: cn3.d */
public final class C67413d extends C15946a {

    /* renamed from: d */
    public int f193322d;

    /* renamed from: e */
    public C79113j f193323e;

    /* renamed from: f */
    public String f193324f = getContext().getString(C0966R.string.iih);

    /* renamed from: g */
    public Integer f193325g;

    /* renamed from: h */
    public String f193326h;

    /* renamed from: i */
    public LinkedList<String> f193327i = new LinkedList<>();

    /* renamed from: cn3.d$a */
    public static final class C67414a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67413d f193328d;

        /* renamed from: e */
        public final /* synthetic */ boolean f193329e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67414a(C67413d dVar, boolean z) {
            super(1);
            this.f193328d = dVar;
            this.f193329e = z;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C67413d dVar = this.f193328d;
            LinkedList<String> linkedList = wVar.f228826n;
            dVar.getClass();
            C87412m.m108594g(linkedList, "<set-?>");
            dVar.f193327i = linkedList;
            C67413d dVar2 = this.f193328d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78055d)) {
                C78055d dVar3 = (C78055d) action;
                dVar2.mo91614i3(true);
            }
            boolean z = this.f193329e;
            C67413d dVar4 = this.f193328d;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78047a)) {
                C78047a aVar = (C78047a) action2;
                if (!z) {
                    dVar4.mo91614i3(false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67413d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final View mo91613g3() {
        this.f193323e = new C79113j(LayoutInflater.from(getActivity()).inflate(C0966R.C0971layout.d6p, (ViewGroup) null));
        mo91614i3(false);
        C79113j jVar = this.f193323e;
        if (jVar == null) {
            return null;
        }
        if (jVar.f232293f == null) {
            jVar.f232293f = (RelativeLayout) jVar.f232288a.findViewById(C0966R.C0970id.iwc);
        }
        return jVar.f232293f;
    }

    /* renamed from: i3 */
    public final void mo91614i3(boolean z) {
        String str;
        boolean z2 = false;
        if (getActivity().getIntent().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK", false)) {
            this.f193322d = 1;
        } else {
            this.f193322d = 0;
        }
        C13598b0 b0Var = null;
        if (this.f193322d != 0) {
            this.f193325g = null;
            if (z) {
                Activity context = getContext();
                if (context != null) {
                    str = context.getString(C0966R.string.iim);
                    this.f193326h = str;
                }
            } else {
                Activity context2 = getContext();
                if (context2 != null) {
                    str = context2.getString(C0966R.string.n4h);
                    this.f193326h = str;
                }
            }
            str = null;
            this.f193326h = str;
        } else if (z) {
            Activity context3 = getContext();
            this.f193326h = context3 != null ? context3.getString(C0966R.string.iim) : null;
            this.f193325g = Integer.valueOf(C0966R.raw.icons_filled_contacts);
        } else {
            Activity context4 = getContext();
            this.f193326h = context4 != null ? context4.getString(C0966R.string.iig) : null;
            this.f193325g = Integer.valueOf(C0966R.raw.icons_filled_add);
        }
        C79113j jVar = this.f193323e;
        if (jVar != null) {
            if (jVar.f232291d == null) {
                jVar.f232291d = (TextView) jVar.f232288a.findViewById(C0966R.C0970id.eve);
            }
            jVar.f232291d.setText(this.f193324f);
            if (jVar.f232291d == null) {
                jVar.f232291d = (TextView) jVar.f232288a.findViewById(C0966R.C0970id.eve);
            }
            C85875k4.m106191k0(jVar.f232291d.getPaint());
            if (jVar.f232294g == null) {
                jVar.f232294g = (LinearLayout) jVar.f232288a.findViewById(C0966R.C0970id.bs4);
            }
            jVar.f232294g.setVisibility(0);
            if (jVar.f232296i == null) {
                jVar.f232296i = (TextView) jVar.f232288a.findViewById(C0966R.C0970id.bsk);
            }
            jVar.f232296i.setText(this.f193326h);
            Integer num = this.f193325g;
            if (num != null) {
                int intValue = num.intValue();
                jVar.mo109041a().setVisibility(0);
                jVar.mo109041a().setImageResource(intValue);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                jVar.mo109041a().setVisibility(8);
            }
            if (jVar.f232296i == null) {
                jVar.f232296i = (TextView) jVar.f232288a.findViewById(C0966R.C0970id.bsk);
            }
            jVar.f232296i.setOnClickListener(new C67415e(z, this));
            if (!(this.f193322d != 0) || z) {
                jVar.mo109042b().setVisibility(8);
                if (jVar.f232292e == null) {
                    jVar.f232292e = jVar.f232288a.findViewById(C0966R.C0970id.c7p);
                }
                View view = jVar.f232292e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                jVar.mo109042b().setVisibility(0);
                if (jVar.f232292e == null) {
                    jVar.f232292e = jVar.f232288a.findViewById(C0966R.C0970id.c7p);
                }
                View view3 = jVar.f232292e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int i = this.f193322d;
                if (i == 1) {
                    jVar.mo109042b().setText(getContext().getString(C0966R.string.n4j));
                } else if (i == 2) {
                    jVar.mo109042b().setText(getContext().getString(C0966R.string.n4k));
                } else if (i == 3) {
                    jVar.mo109042b().setText(getContext().getString(C0966R.string.n4i));
                }
                jVar.mo109042b().setOnClickListener(new C67416f(this));
            }
            if (C45881a.m51164a(C78821o1.f231207K.select((List<? extends ISqlColumn>) C26236u.m33719b(C78821o1.f231210N)).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(new C54461b())).limit(1, 0).build().singleLong(C86709a0.m107535s().f251811i), 4, 0) != 0) {
                z2 = true;
            }
            if (z2) {
                Activity context5 = getContext();
                C79113j jVar2 = this.f193323e;
                if (jVar2 != null) {
                    if (jVar2.f232295h == null) {
                        jVar2.f232295h = (RelativeLayout) jVar2.f232288a.findViewById(C0966R.C0970id.evk);
                    }
                    jVar2.f232295h.setBackground(context5.getResources().getDrawable(C0966R.C0969drawable.f357218a91));
                    if (jVar2.f232294g == null) {
                        jVar2.f232294g = (LinearLayout) jVar2.f232288a.findViewById(C0966R.C0970id.bs4);
                    }
                    jVar2.f232294g.setBackground(context5.getResources().getDrawable(C0966R.C0969drawable.f357218a91));
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        UIStateCenter e3;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            switch (i) {
                case 74517:
                    UIStateCenter e35 = mo14599e3();
                    if (e35 != null && (stringExtra = intent.getStringExtra("Select_Conv_User")) != null) {
                        e35.dispatch(new C78065p(C26236u.m33719b(stringExtra), -1));
                        return;
                    }
                    return;
                case 74518:
                    String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                    List list = null;
                    List U = stringExtra2 != null ? C112550d0.m153785U(stringExtra2, new String[]{","}, false, 0, 6, (Object) null) : null;
                    boolean z = false;
                    if (U != null && (!U.isEmpty())) {
                        z = true;
                    }
                    if (z) {
                        list = U;
                    }
                    if (list != null && (e3 = mo14599e3()) != null) {
                        e3.dispatch(new C78068v(list, -1));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", false);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C67414a(this, booleanExtra));
        }
    }
}
