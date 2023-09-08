package lh2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.p077ui.ImproveMMSightRecordButton;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p447aw.C103918d;
import qh2.C101198e;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: lh2.h0 */
public final class C109345h0 extends C109337b {

    /* renamed from: d */
    public RelativeLayout f327342d;

    /* renamed from: e */
    public C101198e f327343e;

    /* renamed from: f */
    public ImproveMMSightRecordButton f327344f;

    /* renamed from: g */
    public final TextView f327345g;

    /* renamed from: h */
    public final View f327346h;

    /* renamed from: i */
    public final MMHandler f327347i = new MMHandler(Looper.getMainLooper());

    /* renamed from: j */
    public int f327348j = 10000;

    /* renamed from: n */
    public boolean f327349n;

    /* renamed from: o */
    public boolean f327350o;

    /* renamed from: p */
    public final Runnable f327351p = new C109346a(this);

    /* renamed from: q */
    public Future<?> f327352q;

    /* renamed from: r */
    public boolean f327353r = true;

    /* renamed from: s */
    public final int f327354s;

    /* renamed from: t */
    public long f327355t;

    /* renamed from: lh2.h0$b */
    public static final class C61281b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109345h0 f174393d;

        public C61281b(C109345h0 h0Var) {
            this.f174393d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin$reset$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f174393d.f327344f.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7((Activity) context);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin$reset$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lh2.h0$c */
    public static final class C61282c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109345h0 f174394d;

        public C61282c(C109345h0 h0Var) {
            this.f174394d = h0Var;
        }

        public final void run() {
            this.f174394d.f327345g.setVisibility(4);
            View view = this.f174394d.f327346h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin$showPermissionAfterHint$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin$showPermissionAfterHint$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: lh2.h0$a */
    public static final class C109346a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109345h0 f327356d;

        /* renamed from: lh2.h0$a$a */
        public static final class C109347a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C109345h0 f327357d;

            public C109347a(C109345h0 h0Var) {
                this.f327357d = h0Var;
            }

            public final void run() {
                this.f327357d.f327345g.setVisibility(4);
            }
        }

        public C109346a(C109345h0 h0Var) {
            this.f327356d = h0Var;
        }

        public final void run() {
            this.f327356d.f327345g.animate().alpha(0.0f).withEndAction(new C109347a(this.f327356d)).start();
        }
    }

    public C109345h0(RelativeLayout relativeLayout, C101198e eVar) {
        C87412m.m108594g(relativeLayout, "layout");
        C87412m.m108594g(eVar, "status");
        this.f327342d = relativeLayout;
        this.f327343e = eVar;
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.ih_);
        C87412m.m108593f(findViewById, "layout.findViewById(R.id.record_button)");
        this.f327344f = (ImproveMMSightRecordButton) findViewById;
        View findViewById2 = this.f327342d.findViewById(C0966R.C0970id.ar7);
        C87412m.m108593f(findViewById2, "layout.findViewById(R.id.capture_hint)");
        this.f327345g = (TextView) findViewById2;
        View findViewById3 = this.f327342d.findViewById(C0966R.C0970id.ar8);
        C87412m.m108593f(findViewById3, "layout.findViewById(R.id.capture_permission_jump)");
        this.f327346h = findViewById3;
        C76577a.m92166q(this.f327342d.getContext(), C0966R.string.f361168hu2);
        this.f327354s = 1000;
        this.f327355t = -1;
    }

    /* renamed from: a */
    public void mo160526a() {
        Future<?> future = this.f327352q;
        if (future != null) {
            future.cancel(true);
        }
        View view = this.f327346h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public void mo160527b(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "config");
        this.f327348j = recordConfigProvider.f272935w + 500;
        Boolean bool = recordConfigProvider.f272931s;
        C87412m.m108593f(bool, "config.enablePicture");
        this.f327349n = bool.booleanValue();
        Boolean bool2 = recordConfigProvider.f272932t;
        C87412m.m108593f(bool2, "config.enableVideo");
        boolean booleanValue = bool2.booleanValue();
        this.f327350o = booleanValue;
        ImproveMMSightRecordButton improveMMSightRecordButton = this.f327344f;
        int i = this.f327348j;
        C109351i0 i0Var = new C109351i0(this);
        improveMMSightRecordButton.getClass();
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "setInitData >> " + 100 + ", " + i);
        improveMMSightRecordButton.f313712A = 100;
        improveMMSightRecordButton.f313713B = i;
        improveMMSightRecordButton.f313714C = i0Var;
        improveMMSightRecordButton.f313717F = booleanValue;
        Boolean bool3 = recordConfigProvider.f272931s;
        C87412m.m108593f(bool3, "config.enablePicture");
        if (bool3.booleanValue()) {
            this.f327345g.setText(C0966R.string.gt6);
            this.f327344f.setSimpleTapCallback(new C109355j0(this));
        }
        Boolean bool4 = recordConfigProvider.f272932t;
        C87412m.m108593f(bool4, "config.enableVideo");
        if (bool4.booleanValue()) {
            this.f327345g.setText(C0966R.string.gt7);
            this.f327344f.setLongPressCallback(new C109356k0(this));
            this.f327344f.setLongPressScrollCallback(new C109358l0(this));
        }
        Boolean bool5 = recordConfigProvider.f272931s;
        C87412m.m108593f(bool5, "config.enablePicture");
        if (bool5.booleanValue()) {
            Boolean bool6 = recordConfigProvider.f272932t;
            C87412m.m108593f(bool6, "config.enableVideo");
            if (bool6.booleanValue()) {
                this.f327345g.setText(C0966R.string.gt5);
            }
        }
    }

    /* renamed from: c */
    public boolean mo160528c() {
        return this.f327344f.f313730r;
    }

    /* renamed from: d */
    public void mo160529d() {
        if (this.f327349n) {
            C101198e.C62622a.m73576a(this.f327343e, C101198e.C101199b.RECORD_PICTURE, (Bundle) null, 2, (Object) null);
            return;
        }
        String string = this.f327342d.getContext().getString(C0966R.string.hu4);
        C87412m.m108593f(string, "layout.context.getString(strRes)");
        if (this.f327346h.getVisibility() != 0) {
            this.f327342d.removeCallbacks(this.f327351p);
            this.f327345g.setText(string);
            this.f327345g.setVisibility(0);
            this.f327345g.animate().alpha(1.0f).start();
            this.f327342d.postDelayed(this.f327351p, 3000);
        }
    }

    /* renamed from: f */
    public void mo160530f(boolean z) {
        this.f327344f.setEnableCallback(z);
    }

    /* renamed from: g */
    public void mo160531g(boolean z) {
        this.f327353r = z;
    }

    /* renamed from: h */
    public void mo160532h(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "clickListener");
        if (this.f327345g.getVisibility() == 0) {
            Future<?> future = this.f327352q;
            if (future != null) {
                future.cancel(true);
            }
            C119179t tVar = C119157j.f356862d;
            C61282c cVar = new C61282c(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            this.f327352q = jVar.mo183892w(cVar, 2000, false);
        } else {
            View view = this.f327346h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f327346h.setOnClickListener(onClickListener);
    }

    /* renamed from: i */
    public void mo160533i() {
    }

    /* renamed from: j */
    public final void mo160542j(boolean z) {
        this.f327344f.setTouchEnable(false);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z);
        this.f327343e.mo14585p(C101198e.C101199b.RECORD_FINISH, bundle);
        ImproveMMSightRecordButton improveMMSightRecordButton = this.f327344f;
        improveMMSightRecordButton.announceForAccessibility(C76577a.m92166q(improveMMSightRecordButton.getContext(), C0966R.string.f7537j1));
    }

    public void onAttach() {
        this.f327342d.setVisibility(0);
    }

    public void onDetach() {
        this.f327342d.setVisibility(4);
    }

    public void reset() {
        ImproveMMSightRecordButton improveMMSightRecordButton = this.f327344f;
        improveMMSightRecordButton.getClass();
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "hideLoadingProgressBar");
        View view = improveMMSightRecordButton.f313721f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "hideLoadingProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "hideLoadingProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f327344f.setTouchEnable(true);
        this.f327347i.removeCallbacksAndMessages((Object) null);
        if (this.f327350o && !((C103918d) C86312j.m106911c(C103918d.class)).Gd0(this.f327344f.getContext(), "android.permission.RECORD_AUDIO")) {
            mo160532h(new C61281b(this));
        }
    }

    public void setVisibility(int i) {
        this.f327344f.setVisibility(i);
        if (this.f327353r) {
            this.f327342d.bringToFront();
        }
    }
}
