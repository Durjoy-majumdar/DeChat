package xk1;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.pluginsdk.platformtools.C72714e;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8771h3;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nk1.C61791o;
import o40.C61937h;
import ok1.C62042e;
import qg1.C12217a0;
import qk1.C12835r2;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C64373fs0;
import tf0.C13883o1;
import tf0.C64916p1;
import uo3.C78253a;
import zc1.C66785b;

/* renamed from: xk1.r2 */
public final class C15771r2 extends UIComponent implements C8771h3 {

    /* renamed from: d */
    public final String f42507d = "FinderLiveVisitorRoleUIC";

    /* renamed from: e */
    public View f42508e;

    /* renamed from: f */
    public boolean f42509f = true;

    /* renamed from: g */
    public RecyclerView f42510g;

    /* renamed from: h */
    public TextView f42511h;

    /* renamed from: i */
    public ProgressBar f42512i;

    /* renamed from: j */
    public C78253a f42513j;

    /* renamed from: n */
    public C77407n f42514n;

    /* renamed from: o */
    public C12835r2 f42515o;

    /* renamed from: p */
    public int[] f42516p = new int[2];

    /* renamed from: q */
    public int f42517q;

    /* renamed from: r */
    public boolean f42518r;

    /* renamed from: s */
    public LinkedList<C64373fs0> f42519s = new LinkedList<>();

    /* renamed from: t */
    public int f42520t = 1;

    /* renamed from: u */
    public long f42521u = Long.MIN_VALUE;

    /* renamed from: v */
    public boolean f42522v = true;

    /* renamed from: w */
    public int f42523w = 1;

    /* renamed from: xk1.r2$a */
    public static final class C15772a extends C87413o implements C32226l<C64373fs0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15771r2 f42524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15772a(C15771r2 r2Var) {
            super(1);
            this.f42524d = r2Var;
        }

        public Object invoke(Object obj) {
            C64373fs0 fs02 = (C64373fs0) obj;
            C87412m.m108594g(fs02, LocaleUtil.ITALIAN);
            C15771r2 r2Var = this.f42524d;
            r2Var.getClass();
            int i = fs02.f183215f;
            String str = r2Var.f42507d;
            Log.m105924i(str, "updateVisitorRole chooseType:" + i);
            if (i == 10001) {
                AppCompatActivity activity = r2Var.getActivity();
                Intent intent = new Intent();
                intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", fs02.f183213d);
                intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", fs02.f183214e);
                intent.putExtra("KEY_SOURCE", r2Var.getIntent().getIntExtra("KEY_SOURCE", 0));
                C13598b0 b0Var = C13598b0.f38549a;
                ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13285ny(activity, intent, 1);
            } else {
                ProgressBar progressBar = r2Var.f42512i;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                new C12217a0(C66785b.f191882e.mo90662O5(), i, new C15795y2(r2Var, i)).mo9225i();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xk1.r2$b */
    public static final class C15773b extends C87413o implements C32227p<C64373fs0, View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15771r2 f42525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15773b(C15771r2 r2Var) {
            super(2);
            this.f42525d = r2Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C64373fs0 fs02 = (C64373fs0) obj;
            View view = (View) obj2;
            C87412m.m108594g(fs02, "aliasInfo");
            C87412m.m108594g(view, "itemView");
            if (fs02.f183215f == 2) {
                C15771r2 r2Var = this.f42525d;
                if (r2Var.f42522v) {
                    int[] iArr = r2Var.f42516p;
                    if (iArr[0] == 0 || iArr[1] == 0) {
                        String str = r2Var.f42507d;
                        Log.m105924i(str, "onItemLongClickCallback before change x:" + this.f42525d.f42516p[0] + ", original y:" + this.f42525d.f42516p[1]);
                        view.getLocationOnScreen(this.f42525d.f42516p);
                        String str2 = this.f42525d.f42507d;
                        Log.m105924i(str2, "onItemLongClickCallback after change x:" + this.f42525d.f42516p[0] + ", original y:" + this.f42525d.f42516p[1]);
                    }
                    C15771r2 r2Var2 = this.f42525d;
                    int[] iArr2 = r2Var2.f42516p;
                    int i = iArr2[0];
                    int i2 = iArr2[1];
                    if (r2Var2.f42513j == null) {
                        r2Var2.f42513j = new C78253a(r2Var2.getContext());
                    }
                    C78253a aVar = r2Var2.f42513j;
                    if (aVar != null) {
                        aVar.mo108266a();
                    }
                    C78253a aVar2 = r2Var2.f42513j;
                    if (aVar2 != null) {
                        aVar2.mo108273h(view, new C15787v2(r2Var2), new C15790w2(r2Var2, fs02), i, i2);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xk1.r2$c */
    public static final class C15774c implements RecyclerView.C16622o {

        /* renamed from: d */
        public final /* synthetic */ C15771r2 f42526d;

        public C15774c(C15771r2 r2Var) {
            this.f42526d = r2Var;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC$onCreate$2$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(motionEvent, "p1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC$onCreate$2$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(motionEvent, "motionEvent");
            this.f42526d.f42516p[0] = (int) motionEvent.getRawX();
            this.f42526d.f42516p[1] = (int) motionEvent.getRawY();
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15771r2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final String mo14486c3() {
        Time time = new Time();
        time.set(this.f42521u * ((long) 1000));
        CharSequence a = C72714e.m85106a(getContext().getString(C0966R.string.f360810ez1), time);
        String string = getContext().getResources().getString(C0966R.string.e_e, new Object[]{a});
        C87412m.m108593f(string, "context.resources.getStr…_dialog_content, timeStr)");
        return string;
    }

    /* renamed from: d3 */
    public final void mo14487d3() {
        boolean z = true;
        boolean z2 = this.f42521u - ((long) C31543z5.m39455e()) <= 0;
        if (!C58739j4.f168176a.mo83692U()) {
            z = z2;
        }
        boolean y = C62042e.f176370a.mo87129y(this.f42519s);
        C12835r2 r2Var = this.f42515o;
        if (r2Var != null) {
            r2Var.mo12365F4(this.f42520t, this.f42519s, z);
        }
        C12835r2 r2Var2 = this.f42515o;
        if (r2Var2 != null) {
            r2Var2.notifyDataSetChanged();
        }
        if (!z) {
            TextView textView = this.f42511h;
            if (textView != null) {
                textView.setText(mo14486c3());
            }
        } else if (!y) {
            TextView textView2 = this.f42511h;
            if (textView2 != null) {
                textView2.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.e_r));
            }
        } else {
            TextView textView3 = this.f42511h;
            if (textView3 != null) {
                textView3.setText("");
            }
        }
    }

    /* renamed from: e3 */
    public final void mo14488e3() {
        String str = this.f42507d;
        Log.m105924i(str, "before removeAliasInfo size:" + this.f42519s.size());
        Iterator<C64373fs0> it = this.f42519s.iterator();
        C87412m.m108593f(it, "aliasInfoList.iterator()");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C64373fs0 next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            C64373fs0 fs02 = next;
            if (fs02.f183215f == 2) {
                it.remove();
                String str2 = this.f42507d;
                Log.m105924i(str2, "removeAliasInfo:" + C61937h.m72709h(fs02));
                break;
            }
        }
        String str3 = this.f42507d;
        Log.m105924i(str3, "after removeAliasInfo size:" + this.f42519s.size());
        C62042e.f176370a.mo87016J1(this.f42519s);
    }

    /* renamed from: f3 */
    public final void mo14489f3() {
        String str = this.f42507d;
        StringBuilder sb = new StringBuilder();
        sb.append("setActivityResult fromSetting:");
        sb.append(this.f42518r);
        sb.append(", ");
        C62042e eVar = C62042e.f176370a;
        sb.append(eVar.mo87004F1(this.f42507d, this.f42519s, this.f42520t, this.f42521u));
        Log.m105924i(str, sb.toString());
        eVar.mo87019K1(this.f42519s, this.f42520t, this.f42521u);
        AppCompatActivity activity = getActivity();
        Intent intent = new Intent();
        int i = this.f42517q;
        boolean z = true;
        if (i == 1) {
            intent.putExtra("KEY_IS_FROM_SETTING", this.f42518r);
        } else if (i == 2) {
            if (this.f42523w == this.f42520t) {
                z = false;
            }
            intent.putExtra("KEY_HAS_CHANGE_ROLE", z);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        activity.setResult(-1, intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        String stringExtra;
        if (i == 1) {
            String str3 = this.f42507d;
            Log.m105924i(str3, "requestCode:" + i + ",resultCode:" + i2 + ",data:" + intent);
            if (i2 == -1) {
                String str4 = "";
                if (intent == null || (str = intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME")) == null) {
                    str = str4;
                }
                if (intent == null || (str2 = intent.getStringExtra("KEY_ALIAS_VISITOR_AVATAR")) == null) {
                    str2 = str4;
                }
                if (!(intent == null || (stringExtra = intent.getStringExtra("KEY_ALIAS_VISITOR_USERNAME")) == null)) {
                    str4 = stringExtra;
                }
                C64373fs0 fs02 = new C64373fs0();
                fs02.f183213d = str;
                fs02.f183214e = str2;
                fs02.f183216g = str4;
                fs02.f183215f = 2;
                mo14488e3();
                if (this.f42519s.size() > 0) {
                    this.f42519s.add(1, fs02);
                } else {
                    this.f42519s.add(fs02);
                }
                C12835r2 r2Var = this.f42515o;
                if (r2Var != null) {
                    r2Var.mo12365F4(this.f42520t, this.f42519s, true);
                }
                C12835r2 r2Var2 = this.f42515o;
                if (r2Var2 != null) {
                    r2Var2.notifyDataSetChanged();
                }
                C62042e.f176370a.mo87016J1(this.f42519s);
            }
        }
    }

    public boolean onBackPressed() {
        int i;
        if (this.f42509f && ((i = this.f42517q) == 1 || i == 2)) {
            mo14489f3();
        }
        getActivity().finish();
        if (this.f42517q != 0) {
            getActivity().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        this.f42508e = findViewById(C0966R.C0970id.fye);
        this.f42512i = (ProgressBar) findViewById(C0966R.C0970id.g3j);
        C62042e eVar = C62042e.f176370a;
        boolean m = eVar.mo87095m();
        this.f42509f = m;
        if (m) {
            View view2 = this.f42508e;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view4 = this.f42508e;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ProgressBar progressBar = this.f42512i;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
        if (getIntent().getBooleanExtra("intent_status_from_privacy_to_video_setting", false) && (view = this.f42508e) != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f42510g = (RecyclerView) findViewById(C0966R.C0970id.l_6);
        this.f42511h = (TextView) findViewById(C0966R.C0970id.l_7);
        C12835r2 r2Var = new C12835r2();
        this.f42515o = r2Var;
        r2Var.f36733d = new C15772a(this);
        r2Var.f36734e = new C15773b(this);
        RecyclerView recyclerView = this.f42510g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.f42515o);
            recyclerView.mo17092j0(new C15774c(this));
        }
        this.f42517q = getIntent().getIntExtra("KEY_SOURCE", 0);
        this.f42518r = getIntent().getBooleanExtra("KEY_IS_FROM_SETTING", true);
        this.f42522v = getIntent().getBooleanExtra("KEY_CAN_MODEI_ALIAS", true);
        if (this.f42518r || this.f42517q == 2) {
            this.f42519s = C61791o.f175673a.mo86719a();
            C66785b bVar = C66785b.f191882e;
            this.f42520t = bVar.mo90673n0().f131584h;
            this.f42521u = bVar.mo90673n0().f131585i;
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("KEY_VISITOR_ROLE_LIST");
            List<byte[]> list = serializableExtra instanceof List ? (List) serializableExtra : null;
            if (list != null) {
                LinkedList<C64373fs0> linkedList = this.f42519s;
                eVar.getClass();
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                } else {
                    linkedList.clear();
                }
                for (byte[] parseFrom : list) {
                    C64373fs0 fs02 = new C64373fs0();
                    fs02.parseFrom(parseFrom);
                    linkedList.add(fs02);
                }
            }
            this.f42520t = getIntent().getIntExtra("KEY_VISITOR_ROLE", 1);
            this.f42521u = getIntent().getLongExtra("KEY_MODIFY_TIME", Long.MIN_VALUE);
        }
        if (this.f42519s.size() > 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ALIAS_GUIDE_SHOW_BOOLEAN_SYNC, Boolean.TRUE);
        }
        this.f42523w = this.f42520t;
        String str = this.f42507d;
        Log.m105924i(str, "parseInten fromSetting:" + this.f42518r + ',' + C62042e.f176370a.mo87004F1(this.f42507d, this.f42519s, this.f42520t, this.f42521u));
        mo14487d3();
        String str2 = this.f42507d;
        Log.m105924i(str2, "onCreate enableVisitorRoleEntrance:" + this.f42509f);
    }

    public void onResume() {
        super.onResume();
        ((C64916p1) C86312j.m106911c(C64916p1.class)).mo9108z2().mo58458b(65536, 9);
    }
}
