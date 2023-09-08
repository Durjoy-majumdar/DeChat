package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hi3.C87515a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88990b;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C63566lb;
import rs1.C63575n3;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import u24.C90599h;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderHomeUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI */
public final class FinderHomeAffinityUI extends FinderHomeUI {

    /* renamed from: t */
    public static final /* synthetic */ int f16881t = 0;

    /* renamed from: r */
    public final C13601g f16882r = C36568h.m40985a(C3665b.f16885d);

    /* renamed from: s */
    public final C13601g f16883s = C36568h.m40985a(C3664a.f16884d);

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI$a */
    public static final class C3664a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C3664a f16884d = new C3664a();

        public C3664a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99314W.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI$b */
    public static final class C3665b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C3665b f16885d = new C3665b();

        public C3665b() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(Build.VERSION.SDK_INT >= 31);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI$c */
    public static final class C3666c implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderHomeAffinityUI f16886a;

        public C3666c(FinderHomeAffinityUI finderHomeAffinityUI) {
            this.f16886a = finderHomeAffinityUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f16886a.getIntent();
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
            Intent intent2 = this.f16886a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI$d */
    public static final class C3667d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeAffinityUI f16887d;

        /* renamed from: e */
        public final /* synthetic */ int f16888e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3667d(FinderHomeAffinityUI finderHomeAffinityUI, int i) {
            super(0);
            this.f16887d = finderHomeAffinityUI;
            this.f16888e = i;
        }

        public Object invoke() {
            Bitmap bitmap = FinderHomeAnimUI.f16889e;
            FinderHomeAffinityUI finderHomeAffinityUI = this.f16887d;
            int i = FinderHomeAffinityUI.f16881t;
            View contentView = finderHomeAffinityUI.getContentView();
            C87412m.m108593f(contentView, "contentView");
            FinderHomeAnimUI.f16889e = BitmapUtil.getBitmapFromView(contentView);
            FinderHomeAffinityUI finderHomeAffinityUI2 = this.f16887d;
            Intent intent = new Intent(this.f16887d, FinderHomeAnimUI.class);
            int i2 = this.f16888e;
            intent.addFlags(268435456);
            intent.putExtra("KEY_ROUTER_LAUNCHER", i2);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(finderHomeAffinityUI2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI$routeToSnapshotUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finderHomeAffinityUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(finderHomeAffinityUI2, "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI$routeToSnapshotUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f16887d.overridePendingTransition(0, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: L7 */
    public void mo4039L7(int i) {
        if (i == 1) {
            C88990b.m111194c(this, (C88990b.C61771c) null);
            getSwipeBackLayout().mo26381c(true);
        }
    }

    /* renamed from: O7 */
    public void mo4040O7() {
        if (!mo4044W7() || !((Boolean) ((C36570n) this.f16883s).getValue()).booleanValue() || mo4045X7()) {
            super.mo4040O7();
        } else {
            mo4046Y7(1);
        }
    }

    /* renamed from: P7 */
    public void mo4041P7() {
        if (!mo4044W7() || !((Boolean) ((C36570n) this.f16883s).getValue()).booleanValue() || mo4045X7()) {
            super.mo4041P7();
        } else {
            mo4046Y7(2);
        }
    }

    /* renamed from: U7 */
    public void mo4042U7(boolean z) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        boolean z2;
        String className;
        if (mo4044W7() && ((Boolean) ((C36570n) this.f16883s).getValue()).booleanValue() && !mo4045X7()) {
            if (z) {
                boolean z3 = false;
                try {
                    Object systemService = getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    T t = null;
                    ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                    if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(10)) == null)) {
                        Iterator<T> it = runningTasks.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            ComponentName componentName = ((ActivityManager.RunningTaskInfo) next).baseActivity;
                            if (componentName == null || (className = componentName.getClassName()) == null || !className.equals("com.tencent.mm.ui.LauncherUI")) {
                                z2 = false;
                                continue;
                            } else {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                t = next;
                                break;
                            }
                        }
                        ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) t;
                        if (runningTaskInfo != null) {
                            z3 = C87412m.m108589b(runningTaskInfo.topActivity, runningTaskInfo.baseActivity);
                        }
                    }
                } catch (Throwable th) {
                    Log.m105921e("Finder.HomeUI", "mainTaskTopIsLauncherUI: ams is dead", th);
                }
                if (!z3) {
                    mo4046Y7(-1);
                    return;
                }
            }
            moveTaskToBack(true);
        }
    }

    /* renamed from: V7 */
    public final void mo4043V7(ViewGroup viewGroup) {
        int i;
        int i2;
        int childCount = viewGroup.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null) {
                ViewGroup viewGroup2 = null;
                if (childAt instanceof C59670o2) {
                    ((C59670o2) childAt).mo78638n();
                    if (childAt instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) childAt;
                    }
                    if (viewGroup2 != null) {
                        int childCount2 = viewGroup2.getChildCount();
                        int i4 = 0;
                        while (i4 < childCount2) {
                            View childAt2 = viewGroup2.getChildAt(i4);
                            if ((childAt2 instanceof TextureView) || (childAt2 instanceof SurfaceView)) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(4);
                                View view = childAt2;
                                i2 = childCount;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI", "captureAllRenderView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                childAt2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI", "captureAllRenderView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                i2 = childCount;
                            }
                            i4++;
                            childCount = i2;
                        }
                    }
                } else {
                    i = childCount;
                    if (childAt instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) childAt;
                    }
                    if (viewGroup2 != null) {
                        mo4043V7(viewGroup2);
                    }
                    i3++;
                    childCount = i;
                }
            }
            i = childCount;
            i3++;
            childCount = i;
        }
    }

    /* renamed from: W7 */
    public final boolean mo4044W7() {
        return ((Boolean) ((C36570n) this.f16882r).getValue()).booleanValue();
    }

    /* renamed from: X7 */
    public final boolean mo4045X7() {
        return C85875k4.m106197n0() && (C85875k4.m106156M(this) || (C85875k4.m106155L(getContentResolver()) && Build.VERSION.SDK_INT >= 24 && !isInMultiWindowMode()));
    }

    /* renamed from: Y7 */
    public final void mo4046Y7(int i) {
        C39818r rVar = C39818r.f106831a;
        C63575n3 n3Var = (C63575n3) rVar.mo62444c(this).mo75002a(C63575n3.class);
        n3Var.getClass();
        Log.m105924i(C54492n.TAG, "checkPauseFocusVideo: enterFeedId = " + C61926c.m72691p(n3Var.f180281g));
        if (n3Var.f180281g == 0) {
            ((C63566lb) rVar.mo62446e(C60200t1.class).mo62447c(C63566lb.class)).mo80068N(n3Var.getActivity());
        }
        View contentView = getContentView();
        C87412m.m108592e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        mo4043V7((ViewGroup) contentView);
        C61926c.m72666K(0, new C3667d(this, i));
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        if (!C86709a0.m107522a()) {
            Log.m105920e("Finder.HomeUI", "onCreate: acc has not ready");
            finishAndRemoveTask();
            return;
        }
        super.onCreate(bundle);
        setTaskDescription(new ActivityManager.TaskDescription(getContext().getString(C0966R.string.cvt), C87515a.m108831a(getContext().getResources(), C0966R.raw.icons_filled_finder, 3.0f), 0));
        mo79123H7();
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderHomeAffinityUI);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderHomeAffinityUI");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3666c(this));
    }

    public void onCreateBeforeSetContentView() {
        if (mo4044W7()) {
            setTheme(C0966R.style.a5f);
        }
    }
}
