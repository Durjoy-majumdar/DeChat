package d60;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import rx3.C13598b0;
import y50.C53496k;
import y50.C66519j0;
import y50.C66524m;
import z50.C53745q;

/* renamed from: d60.z */
public final class C58234z extends C58121a implements View.OnClickListener, C11385n {

    /* renamed from: f */
    public final C58124b f166759f;

    /* renamed from: g */
    public final C58169j1 f166760g;

    /* renamed from: h */
    public final RelativeLayout f166761h;

    /* renamed from: i */
    public final TextView f166762i;

    /* renamed from: j */
    public final LinearLayout f166763j;

    /* renamed from: n */
    public int f166764n;

    /* renamed from: o */
    public boolean f166765o = true;

    /* renamed from: p */
    public final Object f166766p;

    /* renamed from: q */
    public final C32224a<C13598b0> f166767q;

    /* renamed from: r */
    public final MTimerHandler f166768r;

    /* renamed from: d60.z$a */
    public static final class C58235a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C58234z f166769d;

        public C58235a(C58234z zVar) {
            this.f166769d = zVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveGuestRightPanelPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f166769d.f166761h.animate().setDuration(200).scaleX(1.7f).scaleY(1.7f).start();
                this.f166769d.f166762i.setVisibility(4);
                this.f166769d.f166768r.startTimer(0, 200);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f166769d.f166768r.stopTimer();
                this.f166769d.f166761h.animate().setDuration(200).scaleX(1.0f).scaleY(1.0f).start();
                this.f166769d.f166762i.setVisibility(0);
                C58234z zVar = this.f166769d;
                if (zVar.f166765o) {
                    int i = zVar.f166764n;
                    C89137b0 b0Var = C86709a0.m107529k().f251779b;
                    RoomLiveService roomLiveService = RoomLiveService.f157190a;
                    b0Var.mo123460f(new C53745q(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, i));
                    C58234z zVar2 = this.f166769d;
                    zVar2.f166765o = false;
                    zVar2.f166764n = 0;
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/live/plugin/LiveGuestRightPanelPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: d60.z$b */
    public static final class C58236b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f166770d;

        /* renamed from: e */
        public final /* synthetic */ C58234z f166771e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58236b(ViewGroup viewGroup, C58234z zVar) {
            super(0);
            this.f166770d = viewGroup;
            this.f166771e = zVar;
        }

        public Object invoke() {
            C61926c.m72668M(new C58122a0(this.f166770d, this.f166771e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.z$c */
    public static final class C58237c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58234z f166772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58237c(C58234z zVar) {
            super(0);
            this.f166772d = zVar;
        }

        public Object invoke() {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157197h.f133057n++;
            this.f166772d.f166762i.setText(roomLiveService.mo76445c());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.z$d */
    public static final class C58238d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C58234z f166773d;

        public C58238d(C58234z zVar) {
            this.f166773d = zVar;
        }

        public final boolean onTimerExpired() {
            C58234z zVar = this.f166773d;
            if (zVar.f166764n >= 9) {
                return false;
            }
            Object obj = zVar.f166766p;
            if (obj instanceof Vibrator) {
                ((Vibrator) obj).vibrate(10);
            }
            zVar.f166764n++;
            C61926c.m72668M(new C58126b0(zVar));
            return true;
        }
    }

    /* renamed from: d60.z$e */
    public static final class C58239e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58234z f166774d;

        public C58239e(C58234z zVar) {
            this.f166774d = zVar;
        }

        public final void run() {
            C58234z zVar = this.f166774d;
            LinearLayout linearLayout = zVar.f166760g.f166613p;
            ArrayList arrayList = new ArrayList();
            arrayList.add(linearLayout);
            arrayList.add(zVar.f166763j);
            int width = zVar.f166763j.getWidth();
            int width2 = linearLayout.getWidth();
            if (width < width2) {
                width = width2;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight() + ((width - view.getWidth()) / 2), view.getPaddingBottom());
            }
            zVar.f166287d.requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58234z(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166759f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.g0u);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_visitor_mic_parent)");
        this.f166760g = new C58169j1((ViewGroup) findViewById, bVar);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fy8);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_right_panel_like)");
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.fy9);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.l…ht_panel_like_click_area)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById3;
        this.f166761h = relativeLayout;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.fy_);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…ight_panel_like_count_tv)");
        this.f166762i = (TextView) findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.fuz);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.live_like_layout)");
        this.f166763j = (LinearLayout) findViewById5;
        this.f166766p = viewGroup.getContext().getSystemService("vibrator");
        C58236b bVar2 = new C58236b(viewGroup, this);
        this.f166767q = bVar2;
        this.f166768r = new MTimerHandler("RoomLiveLike::Timer", (MTimerHandler.CallBack) new C58238d(this), true);
        Drawable drawable = viewGroup.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call_good);
        C74933u4.m89769f(drawable, -1);
        ((ImageView) findViewById2).setImageDrawable(drawable);
        relativeLayout.setOnTouchListener(new C58235a(this));
        C53496k.f150436a.mo74171d(mo82894j0(), bVar2);
        if (viewGroup.findViewById(C0966R.C0970id.bsc) != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = C75044y4.m89991c(viewGroup.getContext());
            ((LinearLayout) viewGroup.findViewById(C0966R.C0970id.bsc)).setLayoutParams(layoutParams);
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        this.f166287d.setVisibility(i);
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C86709a0.m107529k().f251779b.mo123455a(3957, this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/plugin/LiveGuestRightPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fy9) {
            Bundle bundle = new Bundle();
            int[] iArr = {0, 0};
            this.f166761h.getLocationOnScreen(iArr);
            int i = C66524m.C66525a.f191366a;
            int i2 = C66524m.C66525a.f191366a;
            bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_X", (iArr[0] + (this.f166761h.getWidth() / 2)) - (i2 / 2));
            bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_Y", (iArr[1] - C74942w4.m89784a(this.f166287d.getContext(), 16)) - i2);
            this.f166759f.statusChange(C58124b.C58125b.POST_LIKE, bundle);
            int i3 = this.f166764n + 1;
            this.f166764n = i3;
            if (this.f166765o) {
                C66519j0.f191358d.mo90601e(i3);
                this.f166765o = false;
                this.f166764n = 0;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveGuestRightPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C53745q) {
            if (i == 0 && i2 == 0) {
                C61926c.m72668M(new C58237c(this));
            }
            Log.m105924i("MicroMsg.LiveGuestRightPanelPlugin", "onSceneEnd errType:" + i + " errCode:" + i2 + " likeCount:" + this.f166764n);
            int i3 = this.f166764n;
            if (i3 > 0) {
                C66519j0.f191358d.mo90601e(i3);
                this.f166765o = false;
                this.f166764n = 0;
                return;
            }
            this.f166765o = true;
            this.f166764n = 0;
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            mo10792g(0);
            this.f166287d.post(new C58239e(this));
        } else if (ordinal == 39) {
            boolean z = true;
            if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                z = false;
            }
            if (z) {
                mo10792g(8);
            } else {
                mo10792g(0);
            }
        } else if (ordinal == 27 || ordinal == 28) {
            mo10792g(8);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C86709a0.m107529k().f251779b.mo123470p(3957, this);
    }
}
