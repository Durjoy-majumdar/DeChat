package aa2;

import aj3.C103374a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import ba2.C39748b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.multitask.C56888q;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import e92.C107268a;
import e92.C97610b;
import e92.C97611c;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h92.C98325d;
import hn3.C108252a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import l92.C109296d;
import o40.C61926c;
import p92.C117994a;
import p92.C117997g;
import rx3.C13598b0;
import te3.C110959d13;
import te3.C64459j13;
import z04.C66723k;
import zt3.C119157j;

/* renamed from: aa2.n */
public final class C103343n extends C117997g {

    /* renamed from: d */
    public C107268a f304738d;

    /* renamed from: e */
    public MultiTaskInfo f304739e;

    /* renamed from: f */
    public final int f304740f = 10000;

    /* renamed from: g */
    public final int f304741g = 1000;

    /* renamed from: h */
    public final C103344a f304742h = new C103344a(this, Looper.getMainLooper());

    /* renamed from: aa2.n$b */
    public static final class C39529b implements View.OnClickListener {

        /* renamed from: d */
        public static final C39529b f106129d = new C39529b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC$onMultiTaskInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.SnapShotMultiTaskUIC", "snapshotview onClick!");
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC$onMultiTaskInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: aa2.n$a */
    public static final class C103344a extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C103343n f304743a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103344a(C103343n nVar, Looper looper) {
            super(looper);
            this.f304743a = nVar;
        }

        public void handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            int i = message.what;
            C103343n nVar = this.f304743a;
            if (i == nVar.f304741g) {
                ((ProgressBar) nVar.getRootView().findViewById(C0966R.C0970id.h3b)).setVisibility(0);
                return;
            }
            nVar.getClass();
            if (i == 0) {
                this.f304743a.mo143210n3();
                this.f304743a.mo143209m3();
                C39818r rVar = C39818r.f106831a;
                Context context = this.f304743a.getRootView().getContext();
                C87412m.m108593f(context, "rootView.context");
                ((MultiTaskUIC) rVar.mo62443b(context).mo75002a(MultiTaskUIC.class)).mo90993a(true);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MULTITASK_LAST_SHOW_ID_AND_TIME_STRING_SYNC, "");
            }
        }
    }

    /* renamed from: aa2.n$c */
    public static final class C103345c implements C109296d {

        /* renamed from: a */
        public final /* synthetic */ Object f304744a;

        /* renamed from: b */
        public final /* synthetic */ C103343n f304745b;

        public C103345c(Object obj, C103343n nVar) {
            this.f304744a = obj;
            this.f304745b = nVar;
        }

        /* renamed from: a */
        public void mo90716a(Bitmap bitmap, boolean z, int i) {
            Object obj = this.f304744a;
            if (obj instanceof C109296d) {
                C109296d.C109297a.m148407c((C109296d) obj, bitmap, false, 0, 6, (Object) null);
            }
            this.f304745b.mo143210n3();
            this.f304745b.getRootView().setTranslationX(0.0f);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f304745b.getRootView().getContext();
            C87412m.m108593f(context, "rootView.context");
            ((MultiTaskUIC) rVar.mo62443b(context).mo75002a(MultiTaskUIC.class)).mo90993a(false);
        }

        /* renamed from: b */
        public void mo90717b(int i) {
            Object obj = this.f304744a;
            if (obj instanceof C109296d) {
                C109296d.C109297a.m148405a((C109296d) obj, 0, 1, (Object) null);
            }
            this.f304745b.mo143210n3();
            C39818r rVar = C39818r.f106831a;
            Context context = this.f304745b.getRootView().getContext();
            C87412m.m108593f(context, "rootView.context");
            ((MultiTaskUIC) rVar.mo62443b(context).mo75002a(MultiTaskUIC.class)).mo90993a(true);
        }

        /* renamed from: c */
        public void mo90718c(Bitmap bitmap, int i) {
            this.f304745b.mo143206G3();
            Object obj = this.f304744a;
            if (obj instanceof C109296d) {
                C109296d.C109297a.m148406b((C109296d) obj, bitmap, 0, 2, (Object) null);
            }
        }
    }

    /* renamed from: aa2.n$d */
    public static final class C103346d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskInfo f304746d;

        /* renamed from: e */
        public final /* synthetic */ C103343n f304747e;

        /* renamed from: aa2.n$d$a */
        public static final class C103347a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C103343n f304748d;

            /* renamed from: e */
            public final /* synthetic */ int f304749e;

            /* renamed from: f */
            public final /* synthetic */ MultiTaskInfo f304750f;

            /* renamed from: g */
            public final /* synthetic */ int f304751g;

            /* renamed from: h */
            public final /* synthetic */ Bitmap f304752h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C103347a(C103343n nVar, int i, MultiTaskInfo multiTaskInfo, int i2, Bitmap bitmap) {
                super(0);
                this.f304748d = nVar;
                this.f304749e = i;
                this.f304750f = multiTaskInfo;
                this.f304751g = i2;
                this.f304752h = bitmap;
            }

            public Object invoke() {
                C64459j13 m2;
                ViewParent parent = this.f304748d.getRootView().getParent();
                Integer num = null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    int i = this.f304749e;
                    MultiTaskInfo multiTaskInfo = this.f304750f;
                    int i2 = this.f304751g;
                    C103343n nVar = this.f304748d;
                    Bitmap bitmap = this.f304752h;
                    float width = ((float) viewGroup.getWidth()) / ((float) i);
                    if (!(multiTaskInfo == null || (m2 = multiTaskInfo.mo80305m2()) == null)) {
                        num = Integer.valueOf(m2.f183760p);
                    }
                    if (num != null && num.intValue() == 90) {
                        width = ((float) viewGroup.getHeight()) / ((float) i2);
                    }
                    Matrix matrix = new Matrix();
                    matrix.setScale(width, width);
                    ((ImageView) nVar.getRootView().findViewById(C0966R.C0970id.h3a)).setImageMatrix(matrix);
                    ((ImageView) nVar.getRootView().findViewById(C0966R.C0970id.h3a)).setImageBitmap(bitmap);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: aa2.n$d$b */
        public static final class C103348b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C103343n f304753d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C103348b(C103343n nVar) {
                super(0);
                this.f304753d = nVar;
            }

            public Object invoke() {
                this.f304753d.mo143209m3();
                return C13598b0.f38549a;
            }
        }

        public C103346d(MultiTaskInfo multiTaskInfo, C103343n nVar) {
            this.f304746d = multiTaskInfo;
            this.f304747e = nVar;
        }

        public final void run() {
            C13598b0 b0Var;
            C64459j13 m2;
            String str = null;
            Bitmap a = C39748b.f106642a.mo62384a(C56888q.f162957a.mo80310a(this.f304746d), (ImageView) null);
            Integer valueOf = a != null ? Integer.valueOf(a.getWidth()) : null;
            Integer valueOf2 = a != null ? Integer.valueOf(a.getHeight()) : null;
            C103343n nVar = this.f304747e;
            MultiTaskInfo multiTaskInfo = this.f304746d;
            if (valueOf == null || valueOf2 == null) {
                b0Var = null;
            } else {
                C61926c.m72668M(new C103347a(nVar, valueOf.intValue(), multiTaskInfo, valueOf2.intValue(), a));
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                C103343n nVar2 = this.f304747e;
                MultiTaskInfo multiTaskInfo2 = this.f304746d;
                StringBuilder sb = new StringBuilder();
                sb.append("showSnapshotUIC, error! id:");
                sb.append(multiTaskInfo2 != null ? multiTaskInfo2.field_id : null);
                sb.append(", title:");
                if (!(multiTaskInfo2 == null || (m2 = multiTaskInfo2.mo80305m2()) == null)) {
                    str = m2.f183752e;
                }
                sb.append(str);
                Log.m105924i("MicroMsg.SnapShotMultiTaskUIC", sb.toString());
                C61926c.m72668M(new C103348b(nVar2));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103343n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: F3 */
    public void mo143205F3(MultiTaskInfo multiTaskInfo) {
        boolean z = getRootView().getVisibility() == 0;
        Log.m105925i("MicroMsg.SnapShotMultiTaskUIC", "showSnapshotUIC, isVisible:%b", Boolean.valueOf(z));
        if (!z) {
            mo143210n3();
            View rootView = getRootView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = rootView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "showSnapshotUIC", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rootView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "showSnapshotUIC", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View rootView2 = getRootView();
            MultiTaskUIC.C115597a aVar2 = MultiTaskUIC.f346667E;
            int i = MultiTaskUIC.f346689Y;
            C39748b bVar = C39748b.f106642a;
            rootView2.setTranslationX(0.0f - ((float) ((i + C39748b.f106643b) + MultiTaskUIC.f346692x0)));
            ((C119157j) C119157j.f356862d).mo183870a(new C103346d(multiTaskInfo, this));
        }
    }

    /* renamed from: G3 */
    public void mo143206G3() {
        this.f304742h.removeMessages(this.f304741g);
        C103344a aVar = this.f304742h;
        int i = this.f304741g;
        aVar.sendEmptyMessageDelayed(i, (long) i);
        this.f304742h.removeMessages(0);
        this.f304742h.sendEmptyMessageDelayed(0, (long) this.f304740f);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        View view2;
        View view3;
        String[] strArr;
        T t;
        View view4 = view;
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        C110959d13 d133 = d132;
        C87412m.m108594g(multiTaskInfo2, "info");
        C87412m.m108594g(d133, "animateData");
        this.f304739e = multiTaskInfo2;
        C103345c cVar = new C103345c(obj, this);
        if (view4 != null) {
            C8479f0 f0Var = new C8479f0();
            AppCompatActivity activity = getActivity();
            MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
            if (mMActivity == null || (view2 = mMActivity.getBodyView()) == null) {
                view2 = getActivity().getWindow().getDecorView();
            }
            int width = view2.getWidth();
            AppCompatActivity activity2 = getActivity();
            MMActivity mMActivity2 = activity2 instanceof MMActivity ? (MMActivity) activity2 : null;
            if (mMActivity2 == null || (view3 = mMActivity2.getBodyView()) == null) {
                view3 = getActivity().getWindow().getDecorView();
            }
            int height = view3.getHeight();
            if (multiTaskInfo.mo80305m2().f183758n) {
                View findViewById = view4.findViewById(C0966R.C0970id.h3s);
                if (findViewById != null && multiTaskInfo2.field_type == 22 && findViewById.getVisibility() == 0) {
                    multiTaskInfo.mo80305m2().f183758n = false;
                    t = mo143208l3(findViewById, width, height);
                } else {
                    View findViewById2 = view4.findViewById(C0966R.C0970id.h3h);
                    if (findViewById2 != null) {
                        try {
                            T createBitmap = Bitmap.createBitmap(findViewById2.getWidth(), findViewById2.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            Drawable background = findViewById2.getBackground();
                            if (background != null) {
                                background.draw(canvas);
                            }
                            t = createBitmap;
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.SnapShotMultiTaskUIC", "%s", Util.stackTraceToString(e));
                        }
                    }
                    t = null;
                }
                f0Var.f27484d = t;
            } else {
                View findViewById3 = view4.findViewById(C0966R.C0970id.h3s);
                f0Var.f27484d = (findViewById3 != null && multiTaskInfo2.field_type == 22 && findViewById3.getVisibility() == 0) ? mo143208l3(findViewById3, width, height) : C39748b.f106642a.mo62384a(C56888q.f162957a.mo80310a(multiTaskInfo2), (ImageView) null);
            }
            T t2 = f0Var.f27484d;
            if (t2 == null || ((Bitmap) t2).isRecycled() || ((Bitmap) f0Var.f27484d).getWidth() == 0 || ((Bitmap) f0Var.f27484d).getHeight() == 0) {
                Log.m105928w("MicroMsg.SnapShotMultiTaskUIC", "startEnterAnim, page get bitmap is null");
                C109296d.C109297a.m148405a(cVar, 0, 1, (Object) null);
                return;
            }
            ((ImageView) getRootView().findViewById(C0966R.C0970id.h3a)).setImageBitmap((Bitmap) null);
            C107268a aVar = this.f304738d;
            if (aVar != null && C87412m.m108589b(aVar.getParent(), getRootView())) {
                View rootView = getRootView();
                C87412m.m108592e(rootView, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) rootView).removeView(this.f304738d);
            }
            if (multiTaskInfo.mo80305m2().f183758n) {
                Bitmap c = C108252a.m146585c(view4.findViewById(C0966R.C0970id.h3l));
                this.f304738d = new C97610b(view.getContext(), (Bitmap) f0Var.f27484d, c);
                if (c != null) {
                    int width2 = (width - c.getWidth()) / 2;
                    int height2 = (height - c.getHeight()) / 2;
                    C107268a aVar2 = this.f304738d;
                    if (aVar2 != null) {
                        aVar2.setDefaultDstRect(new Rect(width2, height2, width2 + c.getWidth(), c.getHeight() + height2));
                    }
                }
            } else {
                this.f304738d = new C97611c(view.getContext(), (Bitmap) f0Var.f27484d);
            }
            C107268a aVar3 = this.f304738d;
            if (aVar3 != null) {
                aVar3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            View rootView2 = getRootView();
            C87412m.m108592e(rootView2, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) rootView2).addView(this.f304738d, 0);
            try {
                String str = d133.f331946e;
                if (!Util.isNullOrNil(str)) {
                    if (str != null) {
                        Object[] array = new C66723k(",").mo90760e(str, 0).toArray(new String[0]);
                        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        strArr = (String[]) array;
                    } else {
                        strArr = null;
                    }
                    if (strArr == null || strArr.length != 4) {
                        C109296d.C109297a.m148405a(cVar, 0, 1, (Object) null);
                        return;
                    }
                    View rootView3 = getRootView();
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view5 = rootView3;
                    C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "startEnterAnim", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Lcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    rootView3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "startEnterAnim", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Lcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Rect rect = new Rect(0, 0, width, height);
                    Integer valueOf = Integer.valueOf(strArr[0]);
                    C87412m.m108593f(valueOf, "valueOf(posVec.get(0))");
                    int intValue = valueOf.intValue();
                    Integer valueOf2 = Integer.valueOf(strArr[1]);
                    C87412m.m108593f(valueOf2, "valueOf(posVec.get(1))");
                    int intValue2 = valueOf2.intValue();
                    Integer valueOf3 = Integer.valueOf(strArr[2]);
                    C87412m.m108593f(valueOf3, "valueOf(posVec.get(2))");
                    int intValue3 = valueOf3.intValue();
                    Integer valueOf4 = Integer.valueOf(strArr[3]);
                    C87412m.m108593f(valueOf4, "valueOf(posVec.get(3))");
                    Rect rect2 = new Rect(intValue, intValue2, intValue3, valueOf4.intValue());
                    int width3 = rect2.left + (rect2.width() / 2);
                    int height3 = rect2.top + (rect2.height() / 2);
                    float width4 = (float) ((rect.left + (rect.width() / 2)) - width3);
                    float height4 = (float) ((rect.top + (rect.height() / 2)) - height3);
                    float f = (float) width;
                    float width5 = ((float) rect2.width()) / f;
                    C107268a aVar5 = this.f304738d;
                    if (aVar5 != null) {
                        aVar5.setTranslationX(-width4);
                    }
                    C107268a aVar6 = this.f304738d;
                    if (aVar6 != null) {
                        aVar6.setTranslationY(-height4);
                    }
                    C107268a aVar7 = this.f304738d;
                    if (aVar7 != null) {
                        aVar7.setScaleX(width5);
                    }
                    C107268a aVar8 = this.f304738d;
                    if (aVar8 != null) {
                        aVar8.setScaleY(width5);
                    }
                    if (!C85875k4.m106160Q()) {
                        C107268a aVar9 = this.f304738d;
                        if (aVar9 != null) {
                            aVar9.setDstRect(new Rect(0, 0, width, height));
                        }
                        C107268a aVar10 = this.f304738d;
                        if (aVar10 != null) {
                            aVar10.mo136871c(width, height);
                        }
                    }
                    float f2 = (float) height;
                    float height5 = (((f2 * width5) - ((float) rect2.height())) / ((float) 2)) * (((float) 1) / width5);
                    C107268a aVar11 = this.f304738d;
                    if (aVar11 != null) {
                        aVar11.mo136869a(0.0f, height5, f, f2 - height5);
                    }
                    C107268a aVar12 = this.f304738d;
                    if (aVar12 != null) {
                        float f3 = ((float) C98325d.f288196u) / width5;
                        aVar12.mo136870b(0.0f, 0.0f, 0.0f, 0.0f, f3, f3, f3, f3);
                    }
                    C103374a.m137034a(this.f304738d).mo143287j(0.0f).mo143288k(0.0f).mo143280c(1.0f).mo143281d(1.0f).mo143285h(new C103349o(width, height, width5, rect2, this)).mo143283f(new DecelerateInterpolator()).mo143290m(new C103350p(cVar, f0Var)).mo143289l(new C103351q(cVar)).mo143282e(250).mo143286i();
                    return;
                }
                C109296d.C109297a.m148405a(cVar, 0, 1, (Object) null);
                Log.m105924i("MicroMsg.SnapShotMultiTaskUIC", "startEnterAnim, snapPos is null or empty");
            } catch (Exception e2) {
                C109296d.C109297a.m148405a(cVar, 0, 1, (Object) null);
                Log.m105921e("MicroMsg.SnapShotMultiTaskUIC", "get pos value failed, %s", e2.getMessage());
            }
        } else {
            C109296d.C109297a.m148405a(cVar, 0, 1, (Object) null);
        }
    }

    /* renamed from: d3 */
    public void mo62143d3(Object obj) {
        getRootView().setOnClickListener(C39529b.f106129d);
    }

    /* renamed from: f3 */
    public void mo143207f3() {
    }

    /* renamed from: g3 */
    public void mo62145g3() {
        mo143209m3();
        mo143210n3();
        C39818r rVar = C39818r.f106831a;
        Context context = getRootView().getContext();
        C87412m.m108593f(context, "rootView.context");
        ((MultiTaskUIC) rVar.mo62443b(context).mo75002a(MultiTaskUIC.class)).mo90993a(true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bbl;
    }

    /* renamed from: i3 */
    public void mo62146i3() {
    }

    /* renamed from: k3 */
    public boolean mo62147k3(int i) {
        return i == 1048576;
    }

    /* renamed from: l3 */
    public final Bitmap mo143208l3(View view, int i, int i2) {
        C87412m.m108594g(view, "imgView");
        float f = (float) i;
        float f2 = (float) i2;
        int i3 = ((f / f2) > (((float) view.getWidth()) / ((float) view.getHeight())) ? 1 : ((f / f2) == (((float) view.getWidth()) / ((float) view.getHeight())) ? 0 : -1));
        float height = i3 > 0 ? (((float) view.getHeight()) / f2) * f : (float) view.getWidth();
        float height2 = i3 > 0 ? (float) view.getHeight() : (((float) view.getWidth()) / f) * f2;
        Bitmap createBitmap = Bitmap.createBitmap((int) height, (int) height2, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        float f3 = 0.0f;
        float width = i3 > 0 ? (height - ((float) view.getWidth())) / 2.0f : 0.0f;
        if (i3 <= 0) {
            f3 = (height2 - ((float) view.getHeight())) / 2.0f;
        }
        canvas.translate(width, f3);
        view.draw(canvas);
        C87412m.m108593f(createBitmap, "returnedBitmap");
        return createBitmap;
    }

    /* renamed from: m3 */
    public void mo143209m3() {
        boolean z = getRootView().getVisibility() == 8;
        Log.m105925i("MicroMsg.SnapShotMultiTaskUIC", "hideSnapshotUIC, isInVisible:%b", Boolean.valueOf(z));
        if (!z) {
            View rootView = getRootView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = rootView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "hideSnapshotUIC", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rootView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "hideSnapshotUIC", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View rootView2 = getRootView();
            C39748b bVar = C39748b.f106642a;
            rootView2.setTranslationX(0.0f - ((float) C39748b.f106643b));
            ((ImageView) getRootView().findViewById(C0966R.C0970id.h3a)).setImageBitmap((Bitmap) null);
            C107268a aVar2 = this.f304738d;
            if (aVar2 != null) {
                if (C87412m.m108589b(aVar2 != null ? aVar2.getParent() : null, getRootView())) {
                    C107268a aVar3 = this.f304738d;
                    ViewParent parent = aVar3 != null ? aVar3.getParent() : null;
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this.f304738d);
                    this.f304738d = null;
                }
            }
        }
    }

    /* renamed from: n3 */
    public void mo143210n3() {
        ((ProgressBar) getRootView().findViewById(C0966R.C0970id.h3b)).setVisibility(8);
        this.f304742h.removeMessages(this.f304741g);
        this.f304742h.removeMessages(0);
    }

    /* renamed from: o3 */
    public boolean mo143211o3() {
        return getRootView().getVisibility() == 0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onBeforeFinish(Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
    }

    public void onCreate(Bundle bundle) {
    }

    public void onCreateAfter(Bundle bundle) {
    }

    public void onCreateBefore(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
    }

    public void onStop() {
    }

    public void onUserVisibleFocused() {
    }

    public void onUserVisibleUnFocused() {
    }

    /* renamed from: z */
    public C117994a.C117996b mo36002z() {
        return C117994a.C117996b.MODE_SHOW_SNAPSHOT_SCENE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103343n(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
