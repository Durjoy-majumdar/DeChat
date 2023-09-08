package xk1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C0690t1;
import cl1.C54991o;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C51020qw0;
import te3.C51946xa1;
import tf0.C13883o1;
import wf1.C15162a;

/* renamed from: xk1.z1 */
public final class C15798z1 extends UIComponent {

    /* renamed from: d */
    public View f42565d;

    /* renamed from: e */
    public C45795b f42566e;

    /* renamed from: f */
    public NeatTextView f42567f;

    /* renamed from: g */
    public View f42568g;

    /* renamed from: h */
    public View f42569h;

    /* renamed from: i */
    public int f42570i;

    /* renamed from: j */
    public boolean f42571j = true;

    /* renamed from: xk1.z1$a */
    public static final class C15799a implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C15799a f42572a = new C15799a();

        /* renamed from: a */
        public final void mo596a(View view) {
            WeImageView weImageView;
            if (view != null) {
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.kpy);
            }
            if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
                weImageView.setImageResource(C0966R.raw.icons_filled_done);
            }
        }
    }

    /* renamed from: xk1.z1$b */
    public static final class C15800b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15798z1 f42573d;

        public C15800b(C15798z1 z1Var) {
            this.f42573d = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostGroupVisibilityUIC$refreshGroupVisibility$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f42573d.mo14498d3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostGroupVisibilityUIC$refreshGroupVisibility$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xk1.z1$c */
    public static final class C15801c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15798z1 f42574d;

        public C15801c(C15798z1 z1Var) {
            this.f42574d = z1Var;
        }

        public final void run() {
            C58739j4 j4Var = C58739j4.f168176a;
            C15798z1 z1Var = this.f42574d;
            NeatTextView neatTextView = z1Var.f42567f;
            C45795b bVar = z1Var.f42566e;
            C0690t1 t1Var = bVar != null ? (C0690t1) bVar.mo71262a(C0690t1.class) : null;
            C15798z1 z1Var2 = this.f42574d;
            if (neatTextView != null && t1Var != null) {
                neatTextView.setTextGravity(8388613);
                int i = z1Var2.f42570i;
                if (i == 1) {
                    View view = z1Var2.f42568g;
                    if (view != null) {
                        view.getWidth();
                    }
                    z1Var2.getResources().getDimension(C0966R.dimen.f3711c4);
                    int i2 = z1Var2.getResources().getDisplayMetrics().widthPixels;
                    C15162a.f41297g.mo14114a(t1Var, neatTextView);
                } else if (i != 2) {
                } else {
                    if (t1Var.mo653f3()) {
                        neatTextView.mo104279b(MMApplicationContext.getContext().getResources().getString(C0966R.string.e_2));
                    } else if (z1Var2.f42569h != null) {
                        C15162a.f41297g.mo14114a(t1Var, neatTextView);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15798z1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo14497c3(int i, View view, C58124b bVar, C45795b bVar2) {
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(bVar2, "liveData");
        this.f42570i = i;
        this.f42565d = view.findViewById(C0966R.C0970id.f358240e12);
        this.f42567f = (NeatTextView) view.findViewById(C0966R.C0970id.f358241e13);
        this.f42568g = view.findViewById(C0966R.C0970id.n9p);
        this.f42569h = view.findViewById(C0966R.C0970id.n9o);
        this.f42566e = bVar2;
        mo14499e3();
        Intent intent = getContext().getIntent();
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 4) {
            mo14498d3();
            Intent intent2 = getContext().getIntent();
            if (intent2 != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
        }
    }

    /* renamed from: d3 */
    public final void mo14498d3() {
        Class cls = C54991o.class;
        Class cls2 = C0690t1.class;
        Log.m105924i("Finder.FinderLivePostUIC", "visibilityGroup click, firstShow:" + this.f42571j + '!');
        C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
        Activity context = getContext();
        Intent intent = new Intent();
        intent.putExtra("KEY_PARAMS_FIRST_ENTER_WHITE_LIST", this.f42571j);
        boolean z = this.f42571j;
        if (z) {
            this.f42571j = !z;
        }
        C45795b bVar = this.f42566e;
        if (bVar != null) {
            ((C0690t1) bVar.mo71262a(cls2)).mo652e3(intent);
        }
        C45795b bVar2 = this.f42566e;
        Integer num = null;
        intent.putExtra("KEY_PARAMS_MAX_ROOM_COUNT", bVar2 != null ? Integer.valueOf(((C54991o) bVar2.mo71262a(cls)).f154180A2) : null);
        C45795b bVar3 = this.f42566e;
        if (bVar3 != null) {
            num = Integer.valueOf(((C54991o) bVar3.mo71262a(cls)).f154184B2);
        }
        intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", num);
        C45795b bVar4 = this.f42566e;
        intent.putExtra("KEY_PARAMS_IS_NOTICE_PAY_LIVE", bVar4 != null ? ((C0690t1) bVar4.mo71262a(cls2)).f1636s : false);
        if (this.f42570i == 2) {
            intent.putExtra("KEY_PARAMS_LIVE_CHARGE_HIDE", true);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        o1Var.zf0(context, intent, 1001);
    }

    /* renamed from: e3 */
    public final void mo14499e3() {
        C32444a aVar = C32444a.f86121a;
        boolean z = C32444a.f86198t0.mo60266n().intValue() == 0;
        Log.m105924i("Finder.FinderLivePostUIC", "prepareMenuItems,showVisibilityEntrance:" + z);
        if (!z || C62042e.f176370a.mo87054X0(this.f42570i)) {
            View view = this.f42565d;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostGroupVisibilityUIC", "refreshGroupVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostGroupVisibilityUIC", "refreshGroupVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view3 = this.f42565d;
            if (view3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostGroupVisibilityUIC", "refreshGroupVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostGroupVisibilityUIC", "refreshGroupVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = this.f42565d;
            if (view5 != null) {
                view5.setOnClickListener(new C15800b(this));
            }
        }
        NeatTextView neatTextView = this.f42567f;
        if (neatTextView != null) {
            neatTextView.post(new C15801c(this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        C51020qw0 qw02;
        C51946xa1 xa12;
        List<byte[]> list;
        Class cls = C0690t1.class;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            C45795b bVar = this.f42566e;
            if (bVar != null) {
                ((C0690t1) bVar.mo71262a(cls)).mo654g3(intent);
            }
            C45795b bVar2 = this.f42566e;
            boolean z = true;
            int i3 = 0;
            boolean z2 = bVar2 != null && ((C0690t1) bVar2.mo71262a(cls)).f1630j == 1;
            C45795b bVar3 = this.f42566e;
            if (bVar3 == null || !((C0690t1) bVar3.mo71262a(cls)).mo653f3()) {
                z = false;
            }
            C62042e eVar = C62042e.f176370a;
            C45795b bVar4 = this.f42566e;
            if (bVar4 != null) {
                i3 = ((C0690t1) bVar4.mo71262a(cls)).f1629i;
            }
            eVar.getClass();
            if (z) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e28);
                C87412m.m108593f(str, "{\n                MMAppl…toast_tips)\n            }");
            } else if (z2) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.n9p);
                C87412m.m108593f(str, "{\n                MMAppl…toast_tips)\n            }");
            } else if (i3 == 0) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.n9o);
                C87412m.m108593f(str, "{\n                if (sh…          }\n            }");
            } else if (C61926c.m72696u(i3, 7)) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.n9q);
                C87412m.m108593f(str, "{\n                if (sh…          }\n            }");
            } else {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.n9o);
                C87412m.m108593f(str, "{\n                if (sh…          }\n            }");
            }
            C76912y0.m92766e(getContext(), str, C15799a.f42572a);
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityResult visibilityChooseByteArray size:");
            C45795b bVar5 = this.f42566e;
            JSONObject jSONObject = null;
            sb.append((bVar5 == null || (list = ((C0690t1) bVar5.mo71262a(cls)).f1628h) == null) ? null : Integer.valueOf(list.size()));
            sb.append(",chooseRoomList:");
            C45795b bVar6 = this.f42566e;
            sb.append(bVar6 != null ? ((C0690t1) bVar6.mo71262a(cls)).f1631n : null);
            sb.append(",chooseUserList:");
            C45795b bVar7 = this.f42566e;
            sb.append(bVar7 != null ? ((C0690t1) bVar7.mo71262a(cls)).f1632o : null);
            sb.append(",partWhiteList:");
            C45795b bVar8 = this.f42566e;
            sb.append((bVar8 == null || (xa12 = ((C0690t1) bVar8.mo71262a(cls)).f1635r) == null) ? null : C61937h.m72703b(xa12));
            sb.append(",liveChargePost:");
            C45795b bVar9 = this.f42566e;
            if (!(bVar9 == null || (qw02 = ((C0690t1) bVar9.mo71262a(cls)).f1634q) == null)) {
                jSONObject = C61937h.m72703b(qw02);
            }
            sb.append(jSONObject);
            Log.m105924i("Finder.FinderLivePostUIC", sb.toString());
            mo14499e3();
        }
    }
}
