package lh2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCircularProgressBar;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p447aw.C103918d;
import qh2.C101198e;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: lh2.o0 */
public final class C109360o0 extends C109337b {

    /* renamed from: d */
    public RelativeLayout f327378d;

    /* renamed from: e */
    public C101198e f327379e;

    /* renamed from: f */
    public MMSightRecordButton f327380f;

    /* renamed from: g */
    public final TextView f327381g;

    /* renamed from: h */
    public final View f327382h;

    /* renamed from: i */
    public final MMHandler f327383i = new MMHandler(Looper.getMainLooper());

    /* renamed from: j */
    public int f327384j = 10000;

    /* renamed from: n */
    public int f327385n = 10000;

    /* renamed from: o */
    public boolean f327386o;

    /* renamed from: p */
    public boolean f327387p;

    /* renamed from: q */
    public final int f327388q = 500;

    /* renamed from: r */
    public long f327389r = -1;

    /* renamed from: s */
    public int f327390s;

    /* renamed from: t */
    public boolean f327391t;

    /* renamed from: u */
    public int f327392u = C0966R.string.gt5;

    /* renamed from: v */
    public C32226l<? super ArrayList<Float>, C13598b0> f327393v;

    /* renamed from: w */
    public final Runnable f327394w = new C109363c(this);

    /* renamed from: x */
    public Future<?> f327395x;

    /* renamed from: y */
    public boolean f327396y = true;

    /* renamed from: z */
    public String f327397z = C76577a.m92166q(this.f327378d.getContext(), C0966R.string.f361168hu2);

    /* renamed from: lh2.o0$e */
    public static final class C61283e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109360o0 f174395d;

        public C61283e(C109360o0 o0Var) {
            this.f174395d = o0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$reset$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f174395d.f327380f.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7((Activity) context);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$reset$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lh2.o0$f */
    public static final class C99460f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109360o0 f291610d;

        public C99460f(C109360o0 o0Var) {
            this.f291610d = o0Var;
        }

        public final void run() {
            this.f291610d.f327381g.setVisibility(4);
            View view = this.f291610d.f327382h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$showPermissionAfterHint$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$showPermissionAfterHint$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: lh2.o0$a */
    public static final class C109361a implements MMSightRecordButton.C105504k {

        /* renamed from: a */
        public final /* synthetic */ C109360o0 f327398a;

        public C109361a(C109360o0 o0Var) {
            this.f327398a = o0Var;
        }

        /* renamed from: a */
        public final void mo128045a() {
            this.f327398a.mo160562s(true);
        }
    }

    /* renamed from: lh2.o0$b */
    public static final class C109362b implements MMSightRecordButton.C105504k {

        /* renamed from: a */
        public final /* synthetic */ C109360o0 f327399a;

        public C109362b(C109360o0 o0Var) {
            this.f327399a = o0Var;
        }

        /* renamed from: a */
        public final void mo128045a() {
            long j = this.f327399a.f327389r;
            if (j == -1 || Util.ticksToNow(j) > ((long) this.f327399a.f327388q)) {
                Log.m105925i("MicroMsg.MMRecordUI", "onSimpleTap %s", Util.getStack().toString());
                C101198e.C62622a.m73576a(this.f327399a.f327379e, C101198e.C101199b.RECORD_PICTURE, (Bundle) null, 2, (Object) null);
                this.f327399a.f327389r = Util.currentTicks();
                return;
            }
            Log.m105925i("MicroMsg.MMRecordUI", "onSimpleTap too often! %s", Util.getStack().toString());
        }
    }

    /* renamed from: lh2.o0$c */
    public static final class C109363c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109360o0 f327400d;

        /* renamed from: lh2.o0$c$a */
        public static final class C109364a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C109360o0 f327401d;

            public C109364a(C109360o0 o0Var) {
                this.f327401d = o0Var;
            }

            public final void run() {
                this.f327401d.f327381g.setVisibility(4);
            }
        }

        public C109363c(C109360o0 o0Var) {
            this.f327400d = o0Var;
        }

        public final void run() {
            this.f327400d.f327381g.animate().alpha(0.0f).withEndAction(new C109364a(this.f327400d)).start();
        }
    }

    /* renamed from: lh2.o0$d */
    public static final class C109365d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109360o0 f327402d;

        public C109365d(C109360o0 o0Var) {
            this.f327402d = o0Var;
        }

        public final void run() {
            this.f327402d.f327380f.mo150320h();
        }
    }

    /* renamed from: lh2.o0$g */
    public static final class C109366g implements MMSightCircularProgressBar.C105492a {

        /* renamed from: a */
        public final /* synthetic */ C109360o0 f327403a;

        public C109366g(C109360o0 o0Var) {
            this.f327403a = o0Var;
        }

        /* renamed from: a */
        public void mo128042a(boolean z) {
            Log.m105924i("MicroMsg.RecordButtonPlugin", "onProgressFinish");
            this.f327403a.mo160557n(z);
        }

        /* renamed from: b */
        public void mo128043b(ArrayList<Float> arrayList) {
            C87412m.m108594g(arrayList, "subProgress");
            C32226l<? super ArrayList<Float>, C13598b0> lVar = this.f327403a.f327393v;
            if (lVar != null) {
                lVar.invoke(arrayList);
            }
        }
    }

    public C109360o0(RelativeLayout relativeLayout, C101198e eVar) {
        C87412m.m108594g(relativeLayout, "layout");
        C87412m.m108594g(eVar, "status");
        this.f327378d = relativeLayout;
        this.f327379e = eVar;
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.ih_);
        C87412m.m108593f(findViewById, "layout.findViewById(R.id.record_button)");
        this.f327380f = (MMSightRecordButton) findViewById;
        View findViewById2 = this.f327378d.findViewById(C0966R.C0970id.ar7);
        C87412m.m108593f(findViewById2, "layout.findViewById(R.id.capture_hint)");
        this.f327381g = (TextView) findViewById2;
        View findViewById3 = this.f327378d.findViewById(C0966R.C0970id.ar8);
        C87412m.m108593f(findViewById3, "layout.findViewById(R.id.capture_permission_jump)");
        this.f327382h = findViewById3;
        this.f327380f.setSimpleTapCallback(new C109361a(this));
    }

    /* renamed from: a */
    public void mo160526a() {
        Future<?> future = this.f327395x;
        if (future != null) {
            future.cancel(true);
        }
        View view = this.f327382h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public void mo160527b(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "config");
        int i = recordConfigProvider.f272935w;
        this.f327385n = i;
        this.f327384j = i + 250;
        UICustomParam uICustomParam = recordConfigProvider.f272927o;
        this.f327390s = uICustomParam != null ? uICustomParam.f266583s : 0;
        Boolean bool = recordConfigProvider.f272931s;
        C87412m.m108593f(bool, "config.enablePicture");
        this.f327386o = bool.booleanValue();
        Boolean bool2 = recordConfigProvider.f272932t;
        C87412m.m108593f(bool2, "config.enableVideo");
        this.f327387p = bool2.booleanValue();
        Boolean bool3 = recordConfigProvider.f272931s;
        C87412m.m108593f(bool3, "config.enablePicture");
        if (bool3.booleanValue()) {
            this.f327381g.setText(C0966R.string.gt6);
            this.f327380f.setSimpleTapCallback(new C109367p0(this));
        }
        Boolean bool4 = recordConfigProvider.f272932t;
        C87412m.m108593f(bool4, "config.enableVideo");
        if (bool4.booleanValue()) {
            this.f327381g.setText(C0966R.string.gt7);
            this.f327380f.setLongPressCallback(new C109368q0(this));
            this.f327380f.setLongPressScrollCallback(new C109371r0(this));
        }
        Boolean bool5 = recordConfigProvider.f272931s;
        C87412m.m108593f(bool5, "config.enablePicture");
        if (bool5.booleanValue()) {
            Boolean bool6 = recordConfigProvider.f272932t;
            C87412m.m108593f(bool6, "config.enableVideo");
            if (bool6.booleanValue()) {
                this.f327392u = C0966R.string.gt5;
                this.f327381g.setText(C0966R.string.gt5);
            }
        }
    }

    /* renamed from: c */
    public boolean mo160528c() {
        return this.f327380f.f313792i;
    }

    /* renamed from: d */
    public void mo160529d() {
        if (this.f327386o) {
            C101198e.C62622a.m73576a(this.f327379e, C101198e.C101199b.RECORD_PICTURE, (Bundle) null, 2, (Object) null);
        } else {
            mo160561r();
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        MMSightRecordButton mMSightRecordButton = this.f327380f;
        if (!mMSightRecordButton.f313792i) {
            return false;
        }
        mMSightRecordButton.mo150323k();
        return true;
    }

    /* renamed from: f */
    public void mo160530f(boolean z) {
    }

    /* renamed from: g */
    public void mo160531g(boolean z) {
        this.f327396y = z;
    }

    /* renamed from: h */
    public void mo160532h(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "clickListener");
        if (this.f327381g.getVisibility() == 0) {
            Future<?> future = this.f327395x;
            if (future != null) {
                future.cancel(true);
            }
            C119179t tVar = C119157j.f356862d;
            C99460f fVar = new C99460f(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            this.f327395x = jVar.mo183892w(fVar, 2000, false);
        } else {
            View view = this.f327382h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f327382h.setOnClickListener(onClickListener);
    }

    /* renamed from: i */
    public void mo160533i() {
        this.f327380f.mo150323k();
    }

    /* renamed from: j */
    public final void mo160553j() {
        mo160564u(C0966R.string.gt8);
        String str = this.f327397z;
        C87412m.m108593f(str, "recordHintContent");
        mo160560q(str, true);
        MMSightRecordButton mMSightRecordButton = this.f327380f;
        mMSightRecordButton.f313783J = true;
        mMSightRecordButton.setSimpleTapCallback((MMSightRecordButton.C105504k) null);
    }

    /* renamed from: k */
    public final void mo160554k() {
        mo160556m(true);
        mo160564u(C0966R.string.gt5);
        String str = this.f327397z;
        C87412m.m108593f(str, "recordHintContent");
        mo160560q(str, true);
        this.f327380f.f313783J = false;
        mo160559p(false, true);
    }

    /* renamed from: l */
    public final void mo160555l() {
        mo160556m(false);
        mo160564u(C0966R.string.huz);
        String str = this.f327397z;
        C87412m.m108593f(str, "recordHintContent");
        mo160560q(str, true);
        this.f327380f.f313783J = true;
        mo160559p(true, true);
    }

    /* renamed from: m */
    public final void mo160556m(boolean z) {
        this.f327386o = z;
        if (z) {
            this.f327381g.setText(C0966R.string.gt6);
            this.f327380f.setSimpleTapCallback(new C109362b(this));
            return;
        }
        this.f327381g.setText(C0966R.string.gt7);
        this.f327380f.setSimpleTapCallback((MMSightRecordButton.C105504k) null);
    }

    /* renamed from: n */
    public final void mo160557n(boolean z) {
        this.f327380f.setTouchEnable(false);
        this.f327383i.postDelayed(new C109365d(this), 1500);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z);
        this.f327379e.mo14585p(C101198e.C101199b.RECORD_FINISH, bundle);
        MMSightRecordButton mMSightRecordButton = this.f327380f;
        mMSightRecordButton.announceForAccessibility(C76577a.m92166q(mMSightRecordButton.getContext(), C0966R.string.f7537j1));
    }

    /* renamed from: o */
    public final void mo160558o(int i) {
        MMSightRecordButton mMSightRecordButton = this.f327380f;
        int size = mMSightRecordButton.f313791h.getSubProgress().size();
        if (size > 0 && i != size) {
            MMSightCircularProgressBar mMSightCircularProgressBar = mMSightRecordButton.f313791h;
            if (mMSightCircularProgressBar.f313770y.size() > 0) {
                ArrayList<Float> arrayList = mMSightCircularProgressBar.f313770y;
                arrayList.remove(arrayList.size() - 1);
                if (mMSightCircularProgressBar.f313770y.size() > 0) {
                    ArrayList<Float> arrayList2 = mMSightCircularProgressBar.f313770y;
                    mMSightCircularProgressBar.f313762q = arrayList2.get(arrayList2.size() - 1).floatValue();
                } else {
                    mMSightCircularProgressBar.f313762q = 0.0f;
                }
                mMSightCircularProgressBar.invalidate();
            }
        }
    }

    public void onAttach() {
        this.f327378d.setVisibility(0);
    }

    public void onDetach() {
        this.f327378d.setVisibility(4);
    }

    public void onPause() {
        this.f327380f.mo150323k();
    }

    /* renamed from: p */
    public final void mo160559p(boolean z, boolean z2) {
        MMSightRecordButton mMSightRecordButton = this.f327380f;
        mMSightRecordButton.f313782I = z;
        mMSightRecordButton.f313791h.setEnableSubProgress(z);
        mMSightRecordButton.f313791h.setCircularColor(Color.parseColor("#00000000"));
        if (z) {
            mMSightRecordButton.f313791h.setVisibility(4);
        } else {
            mMSightRecordButton.f313791h.mo150303a();
            mMSightRecordButton.f313791h.setVisibility(0);
        }
        if (z) {
            this.f327381g.setText(C0966R.string.huz);
        } else {
            this.f327381g.setText(this.f327392u);
        }
        if (z && z2) {
            this.f327380f.f313791h.setVisibility(0);
        }
    }

    /* renamed from: q */
    public final void mo160560q(String str, boolean z) {
        C87412m.m108594g(str, "strWording");
        if (this.f327382h.getVisibility() != 0) {
            this.f327378d.removeCallbacks(this.f327394w);
            this.f327381g.setText(str);
            this.f327381g.setVisibility(0);
            this.f327381g.animate().alpha(1.0f).start();
            if (z) {
                this.f327378d.postDelayed(this.f327394w, 3000);
            }
        }
    }

    /* renamed from: r */
    public final void mo160561r() {
        String string = this.f327378d.getContext().getString(C0966R.string.hu4);
        C87412m.m108593f(string, "layout.context.getString(strRes)");
        mo160560q(string, true);
    }

    public void reset() {
        this.f327380f.mo150315d();
        this.f327380f.setTouchEnable(true);
        this.f327383i.removeCallbacksAndMessages((Object) null);
        if (this.f327387p && !((C103918d) C86312j.m106911c(C103918d.class)).Gd0(this.f327380f.getContext(), "android.permission.RECORD_AUDIO")) {
            mo160532h(new C61283e(this));
        }
    }

    /* renamed from: s */
    public final void mo160562s(boolean z) {
        String str = this.f327397z;
        C87412m.m108593f(str, "recordHintContent");
        mo160560q(str, z);
    }

    public void setVisibility(int i) {
        this.f327380f.setVisibility(i);
        if (this.f327396y) {
            this.f327378d.bringToFront();
        }
    }

    /* renamed from: t */
    public final void mo160563t() {
        if (this.f327391t) {
            this.f327391t = false;
            C101198e.C62622a.m73576a(this.f327379e, C101198e.C101199b.RECORD_START, (Bundle) null, 2, (Object) null);
            int i = this.f327390s;
            if (i == 0) {
                i = this.f327378d.getContext().getResources().getColor(C0966R.color.akw);
            }
            this.f327380f.mo150321i(0, 100, this.f327384j, i, new C109366g(this));
        }
    }

    /* renamed from: u */
    public final void mo160564u(int i) {
        this.f327397z = C76577a.m92166q(this.f327378d.getContext(), i);
    }
}
