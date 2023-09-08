package gv1;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.forcenotify.p058ui.view.StackLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C7335d;
import di3.C86312j;
import dv1.C58435m;
import ev1.C58838a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import p447aw.C103918d;
import p687sr.C64157h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import zt3.C119157j;

/* renamed from: gv1.c */
public final class C59712c extends C59706a implements C64157h {

    /* renamed from: I */
    public static final C59715c f170575I = new C59715c((C8480h) null);

    /* renamed from: J */
    public static final C13601g<C59712c> f170576J = C36568h.m40985a(C59714b.f170600d);

    /* renamed from: A */
    public final Runnable f170577A = new C59725m(this);

    /* renamed from: B */
    public final Runnable f170578B = new C59726n(this);

    /* renamed from: C */
    public final Runnable f170579C = new C59730r(this);

    /* renamed from: D */
    public final Runnable f170580D = new C59722j(this);

    /* renamed from: E */
    public boolean f170581E;

    /* renamed from: F */
    public Runnable f170582F = new C59713a(this);

    /* renamed from: G */
    public int f170583G = Integer.MAX_VALUE;

    /* renamed from: H */
    public final C59721i f170584H = new C59721i(this);

    /* renamed from: j */
    public StackLayoutManager f170585j;

    /* renamed from: n */
    public RecyclerView f170586n;

    /* renamed from: o */
    public View f170587o;

    /* renamed from: p */
    public View f170588p;

    /* renamed from: q */
    public final ArrayList<C58838a> f170589q = new ArrayList<>();

    /* renamed from: r */
    public final C13601g f170590r = C36568h.m40985a(C59727o.f170615d);

    /* renamed from: s */
    public final C13601g f170591s = C36568h.m40985a(C59728p.f170616d);

    /* renamed from: t */
    public final C13601g f170592t = C36568h.m40985a(new C59718f(this));

    /* renamed from: u */
    public final C13601g f170593u = C36568h.m40985a(new C59720h(this));

    /* renamed from: v */
    public final C13601g f170594v = C36568h.m40985a(new C59732t(this));

    /* renamed from: w */
    public final AudioManager.OnAudioFocusChangeListener f170595w = C59717e.f170603d;

    /* renamed from: x */
    public final C13601g f170596x = C36568h.m40985a(new C59731s(this));

    /* renamed from: y */
    public MediaPlayer f170597y;

    /* renamed from: z */
    public final Runnable f170598z = new C59719g(this);

    /* renamed from: gv1.c$a */
    public static final class C59713a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170599d;

        public C59713a(C59712c cVar) {
            this.f170599d = cVar;
        }

        public final void run() {
            if (((KeyguardManager) ((C36570n) this.f170599d.f170593u).getValue()).inKeyguardRestrictedInputMode()) {
                this.f170599d.mo84702s();
                return;
            }
            C59712c cVar = this.f170599d;
            C64157h.C64158a.m75492a(cVar, cVar.f170582F, 100, (Object) null, 4, (Object) null);
        }
    }

    /* renamed from: gv1.c$b */
    public static final class C59714b extends C87413o implements C32224a<C59712c> {

        /* renamed from: d */
        public static final C59714b f170600d = new C59714b();

        public C59714b() {
            super(0);
        }

        public Object invoke() {
            return new C59712c();
        }
    }

    /* renamed from: gv1.c$c */
    public static final class C59715c {
        public C59715c(C8480h hVar) {
        }

        /* renamed from: a */
        public final C59712c mo84705a() {
            return (C59712c) ((C36570n) C59712c.f170576J).getValue();
        }
    }

    /* renamed from: gv1.c$d */
    public static final class C59716d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170601d;

        /* renamed from: e */
        public final /* synthetic */ C58838a f170602e;

        public C59716d(C59712c cVar, C58838a aVar) {
            this.f170601d = cVar;
            this.f170602e = aVar;
        }

        public final void run() {
            this.f170601d.mo84692j(this.f170602e, true);
        }
    }

    /* renamed from: gv1.c$e */
    public static final class C59717e implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: d */
        public static final C59717e f170603d = new C59717e();

        public final void onAudioFocusChange(int i) {
        }
    }

    /* renamed from: gv1.c$f */
    public static final class C59718f extends C87413o implements C32224a<AudioManager> {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59718f(C59712c cVar) {
            super(0);
            this.f170604d = cVar;
        }

        public Object invoke() {
            Object systemService = this.f170604d.mo84681g().getSystemService("audio");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    /* renamed from: gv1.c$g */
    public static final class C59719g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170605d;

        public C59719g(C59712c cVar) {
            this.f170605d = cVar;
        }

        public final void run() {
            C59712c.m69615i(this.f170605d);
        }
    }

    /* renamed from: gv1.c$h */
    public static final class C59720h extends C87413o implements C32224a<KeyguardManager> {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59720h(C59712c cVar) {
            super(0);
            this.f170606d = cVar;
        }

        public Object invoke() {
            Object systemService = this.f170606d.mo84681g().getSystemService("keyguard");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
            return (KeyguardManager) systemService;
        }
    }

    /* renamed from: gv1.c$i */
    public static final class C59721i implements StackLayoutManager.C18806b {

        /* renamed from: a */
        public final /* synthetic */ C59712c f170607a;

        public C59721i(C59712c cVar) {
            this.f170607a = cVar;
        }

        /* renamed from: a */
        public void mo9655a(View view) {
            Drawable background;
            if (view != null && (background = view.getBackground()) != null) {
                background.clearColorFilter();
            }
        }

        /* renamed from: b */
        public void mo9656b(View view, int i, int i2, float f, View view2, View view3) {
            View view4;
            View view5;
            int i3 = i - i2;
            int max = 255 - ((int) ((Math.max(0.0f, ((float) i3) - f) * (this.f170607a.f170567g ? 0.2f : 0.05f)) * ((float) 255)));
            int rgb = Color.rgb(max, max, max);
            Drawable background = view != null ? view.getBackground() : null;
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(rgb, PorterDuff.Mode.MULTIPLY));
            }
            if (i3 == 0 && i2 == this.f170607a.f170589q.size() - 2 && (view5 = this.f170607a.f170587o) != null) {
                float f2 = ((float) 1) - f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f2));
                View view6 = view5;
                C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (i3 == 0 && i2 == this.f170607a.f170589q.size() - 1 && (view4 = this.f170607a.f170587o) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view7 = view4;
                C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$layoutAnimator$1", "doAnimate", "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: gv1.c$j */
    public static final class C59722j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170608d;

        public C59722j(C59712c cVar) {
            this.f170608d = cVar;
        }

        public final void run() {
            C7335d c = C86312j.m106911c(C58435m.class);
            C87412m.m108593f(c, "getService(ForceNotifyService::class.java)");
            if (!C58435m.zx0((C58435m) c, (Context) null, 1, (Object) null)) {
                Log.m105924i("ForceNotify.MsgWindow", "PlaySound.playRoot");
                C59712c cVar = this.f170608d;
                cVar.f170597y = PlaySound.playRoot(cVar.mo84681g(), C0966R.string.f1t, PlaySound.SPEAKERON.NOTSET, 2, true, (PlaySound.OnPlayCompletionListener) null);
            }
        }
    }

    /* renamed from: gv1.c$k */
    public static final class C59723k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170609d;

        /* renamed from: e */
        public final /* synthetic */ String f170610e;

        public C59723k(C59712c cVar, String str) {
            this.f170609d = cVar;
            this.f170610e = str;
        }

        public final void run() {
            C59712c.m69614h(this.f170609d, this.f170610e);
        }
    }

    /* renamed from: gv1.c$l */
    public static final class C59724l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170611d;

        /* renamed from: e */
        public final /* synthetic */ int f170612e;

        public C59724l(C59712c cVar, int i) {
            this.f170611d = cVar;
            this.f170612e = i;
        }

        public final void run() {
            RecyclerView recyclerView = this.f170611d.f170586n;
            if (recyclerView != null) {
                int i = this.f170612e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$smoothScrollTo$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$smoothScrollTo$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
    }

    /* renamed from: gv1.c$m */
    public static final class C59725m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170613d;

        public C59725m(C59712c cVar) {
            this.f170613d = cVar;
        }

        public final void run() {
            this.f170613d.mo84701r();
        }
    }

    /* renamed from: gv1.c$n */
    public static final class C59726n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170614d;

        public C59726n(C59712c cVar) {
            this.f170614d = cVar;
        }

        public final void run() {
            this.f170614d.mo84703t();
        }
    }

    /* renamed from: gv1.c$o */
    public static final class C59727o extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C59727o f170615d = new C59727o();

        public C59727o() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: gv1.c$p */
    public static final class C59728p extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C59728p f170616d = new C59728p();

        public C59728p() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: gv1.c$q */
    public static final class C59729q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170617d;

        /* renamed from: e */
        public final /* synthetic */ C58838a f170618e;

        public C59729q(C59712c cVar, C58838a aVar) {
            this.f170617d = cVar;
            this.f170618e = aVar;
        }

        public final void run() {
            RecyclerView.C16613e adapter;
            C59712c cVar = this.f170617d;
            C58838a aVar = this.f170618e;
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(cVar.mo84681g())) {
                Log.m105924i("ForceNotify.MsgWindow", "updateMsgItem no permission, return");
                return;
            }
            Log.m105924i("ForceNotify.MsgWindow", "updateMsgItem called, id=" + aVar.f168434d);
            int i = 0;
            Iterator<C58838a> it = cVar.f170589q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C87412m.m108589b(it.next().f168434d, aVar.f168434d)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                if (i < cVar.f170589q.size()) {
                    cVar.f170589q.set(i, aVar);
                    RecyclerView recyclerView = cVar.f170586n;
                    if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                        adapter.notifyItemChanged(i);
                    }
                    aVar.mo84045r();
                }
                Log.m105924i("ForceNotify.MsgWindow", "updateMsgItem item id=" + aVar.f168434d + " exists, update it");
                return;
            }
            Log.m105924i("ForceNotify.MsgWindow", "updateMsgItem item id=" + aVar.f168434d + " doesn't exist, skip update");
        }
    }

    /* renamed from: gv1.c$r */
    public static final class C59730r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170619d;

        public C59730r(C59712c cVar) {
            this.f170619d = cVar;
        }

        public final void run() {
            C7335d c = C86312j.m106911c(C58435m.class);
            C87412m.m108593f(c, "getService(ForceNotifyService::class.java)");
            if (C58435m.Ax0((C58435m) c, (Context) null, 1, (Object) null)) {
                Log.m105924i("ForceNotify.MsgWindow", "vibrator.vibrate");
                if (AppForegroundDelegate.INSTANCE.f343454n) {
                    ((Vibrator) ((C36570n) this.f170619d.f170596x).getValue()).vibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000}, -1);
                } else {
                    ((Vibrator) ((C36570n) this.f170619d.f170596x).getValue()).vibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000}, -1);
                }
            }
        }
    }

    /* renamed from: gv1.c$s */
    public static final class C59731s extends C87413o implements C32224a<Vibrator> {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59731s(C59712c cVar) {
            super(0);
            this.f170620d = cVar;
        }

        public Object invoke() {
            Object systemService = this.f170620d.mo84681g().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    /* renamed from: gv1.c$t */
    public static final class C59732t extends C87413o implements C32224a<PowerManager.WakeLock> {

        /* renamed from: d */
        public final /* synthetic */ C59712c f170621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59732t(C59712c cVar) {
            super(0);
            this.f170621d = cVar;
        }

        public Object invoke() {
            return ((PowerManager) ((C36570n) this.f170621d.f170568h).getValue()).newWakeLock(26, "wx:MsgWindowLock");
        }
    }

    /* renamed from: h */
    public static final void m69614h(C59712c cVar, String str) {
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        int i;
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(cVar.mo84681g())) {
            Log.m105924i("ForceNotify.MsgWindow", "removeMsgItem no permission, return");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C58838a> it = cVar.f170589q.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C58838a next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (C87412m.m108589b(next.f168434d, str)) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        Log.m105924i("ForceNotify.MsgWindow", "removeMsgItem id=" + str + " delete size = " + arrayList.size());
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            int intValue = ((Number) it4.next()).intValue();
            if (intValue < cVar.f170589q.size()) {
                StackLayoutManager stackLayoutManager = cVar.f170585j;
                if ((stackLayoutManager != null && intValue == stackLayoutManager.mo23739t()) && (i = intValue + 1) < cVar.f170589q.size()) {
                    cVar.mo84699p(i);
                } else if (intValue >= 0 && intValue < cVar.f170589q.size()) {
                    C58838a remove = cVar.f170589q.remove(intValue);
                    C87412m.m108593f(remove, "msgList.removeAt(it)");
                    remove.mo84044q();
                    if (cVar.mo84695m()) {
                        Log.m105924i("ForceNotify.MsgWindow", "removeMsgItem id=" + str + " list empty, hide");
                        ((C119157j) C119157j.f356862d).mo183895z(new C59711b(cVar));
                    } else {
                        Log.m105924i("ForceNotify.MsgWindow", "removeMsgItem id=" + str + " remove from recyclerView");
                        RecyclerView recyclerView = cVar.f170586n;
                        if (!(recyclerView == null || (adapter2 = recyclerView.getAdapter()) == null)) {
                            adapter2.notifyItemRemoved(intValue);
                        }
                        RecyclerView recyclerView2 = cVar.f170586n;
                        if (!(recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null)) {
                            adapter.notifyItemRangeChanged(intValue, cVar.f170589q.size() - intValue);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public static final void m69615i(C59712c cVar) {
        ((MMHandler) ((C36570n) cVar.f170591s).getValue()).removeCallbacks(cVar.f170598z);
        cVar.mo84697o(true);
        cVar.f170581E = false;
        cVar.f170583G = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public boolean mo84685a() {
        return this.f170567g;
    }

    /* renamed from: b */
    public void mo84686b(String str) {
        C87412m.m108594g(str, "id");
        ((C119157j) C119157j.f356862d).mo183895z(new C59723k(this, str));
    }

    /* renamed from: c */
    public void mo84687c(C58838a aVar) {
        C87412m.m108594g(aVar, "item");
        ((C119157j) C119157j.f356862d).mo183895z(new C59729q(this, aVar));
    }

    /* renamed from: d */
    public void mo84688d(Object obj) {
        C87412m.m108594g(obj, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        mo84693k().removeCallbacksAndMessages(obj);
    }

    /* renamed from: e */
    public void mo84689e(C58838a aVar) {
        C87412m.m108594g(aVar, "item");
        ((C119157j) C119157j.f356862d).mo183895z(new C59716d(this, aVar));
    }

    /* renamed from: f */
    public void mo84690f(Runnable runnable, long j, Object obj) {
        if (runnable == null) {
            return;
        }
        if (obj == null) {
            mo84693k().postDelayed(runnable, j);
            return;
        }
        mo84693k().postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    public ArrayList<C58838a> getMsgList() {
        return this.f170589q;
    }

    /* renamed from: j */
    public final void mo84692j(C58838a aVar, boolean z) {
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        RecyclerView.C16613e adapter3;
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(mo84681g())) {
            Log.m105924i("ForceNotify.MsgWindow", "addMsgItem no permission, return");
            return;
        }
        Iterator<C58838a> it = this.f170589q.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C87412m.m108589b(it.next().f168434d, aVar.f168434d)) {
                break;
            } else {
                i++;
            }
        }
        Log.m105924i("ForceNotify.MsgWindow", "addMsgItem called, id=" + aVar.f168434d);
        if (i == -1) {
            this.f170589q.add(0, aVar);
            RecyclerView recyclerView = this.f170586n;
            if (!(recyclerView == null || (adapter3 = recyclerView.getAdapter()) == null)) {
                adapter3.notifyItemInserted(0);
            }
            mo84699p(0);
            if (aVar.mo84036i() || aVar.mo84037j()) {
                mo84700q(aVar.mo84036i(), aVar.mo84037j());
            }
            if (z) {
                aVar.mo84038k();
            }
            Log.m105924i("ForceNotify.MsgWindow", "addMsgItem add new item, id=" + aVar.f168434d);
        } else if (i >= 0 && i < this.f170589q.size()) {
            this.f170589q.remove(i);
            this.f170589q.add(0, aVar);
            RecyclerView recyclerView2 = this.f170586n;
            if (!(recyclerView2 == null || (adapter2 = recyclerView2.getAdapter()) == null)) {
                adapter2.notifyItemRemoved(i);
            }
            RecyclerView recyclerView3 = this.f170586n;
            if (!(recyclerView3 == null || (adapter = recyclerView3.getAdapter()) == null)) {
                adapter.notifyItemInserted(0);
            }
            mo84699p(0);
            if (aVar.mo84036i() || aVar.mo84037j()) {
                mo84700q(aVar.mo84036i(), aVar.mo84037j());
            }
            if (z) {
                aVar.mo84045r();
            }
            Log.m105924i("ForceNotify.MsgWindow", "addMsgItem update item, id=" + aVar.f168434d);
        }
    }

    /* renamed from: k */
    public final MMHandler mo84693k() {
        return (MMHandler) ((C36570n) this.f170590r).getValue();
    }

    /* renamed from: l */
    public final PowerManager.WakeLock mo84694l() {
        return (PowerManager.WakeLock) ((C36570n) this.f170594v).getValue();
    }

    /* renamed from: m */
    public boolean mo84695m() {
        if (this.f170589q.size() <= 1) {
            C58838a aVar = (C58838a) C110818d0.m150925W(this.f170589q);
            if ((aVar != null ? aVar.mo75c() : -1) == -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void mo84696n(Runnable runnable) {
        if (runnable != null) {
            mo84693k().removeCallbacks(runnable);
        }
    }

    /* renamed from: o */
    public final void mo84697o(boolean z) {
        View view = this.f170588p;
        if (view != null) {
            int i = z ? 8 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "setEnableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "setEnableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent == null || keyEvent.getAction() != 1) {
            z = false;
        }
        if (z) {
            mo84702s();
        }
        return false;
    }

    /* renamed from: p */
    public void mo84699p(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        MotionEvent obtain = MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, 0.0f, 0.0f, 0);
        RecyclerView recyclerView = this.f170586n;
        if (recyclerView != null) {
            recyclerView.onTouchEvent(obtain);
        }
        mo84697o(false);
        ((MMHandler) ((C36570n) this.f170591s).getValue()).postDelayed(this.f170598z, 1000);
        this.f170581E = true;
        this.f170583G = i;
        RecyclerView recyclerView2 = this.f170586n;
        if (recyclerView2 != null) {
            recyclerView2.post(new C59724l(this, i));
        }
    }

    /* renamed from: q */
    public final void mo84700q(boolean z, boolean z2) {
        mo84702s();
        boolean z3 = AppForegroundDelegate.INSTANCE.f343454n;
        ((AudioManager) ((C36570n) this.f170592t).getValue()).requestAudioFocus(this.f170595w, 3, 2);
        if (z) {
            C64157h.C64158a.m75492a(this, this.f170580D, 1000, (Object) null, 4, (Object) null);
            C64157h.C64158a.m75492a(this, this.f170577A, 7000, (Object) null, 4, (Object) null);
        }
        if (z2) {
            C64157h.C64158a.m75492a(this, this.f170579C, 1000, (Object) null, 4, (Object) null);
            C64157h.C64158a.m75492a(this, this.f170578B, 7000, (Object) null, 4, (Object) null);
        }
        if (z || z2) {
            C64157h.C64158a.m75492a(this, this.f170582F, 100, (Object) null, 4, (Object) null);
        }
        if (mo84694l().isHeld()) {
            PowerManager.WakeLock l = mo84694l();
            PowerManager.WakeLock wakeLock = l;
            C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            l.release();
            C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
        PowerManager.WakeLock l2 = mo84694l();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(120000L);
        PowerManager.WakeLock wakeLock2 = l2;
        C117292a.m165358d(wakeLock2, aVar.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
        C60958c.f173611a.set(aVar);
        long longValue = ((Long) aVar.mo10231a(0)).longValue();
        C60958c.m71441a();
        l2.acquire(longValue);
        C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "startSoundAndVibrate", "(ZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
    }

    /* renamed from: r */
    public final void mo84701r() {
        try {
            mo84696n(this.f170582F);
            MediaPlayer mediaPlayer = this.f170597y;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f170597y;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            if (mo84694l().isHeld()) {
                PowerManager.WakeLock l = mo84694l();
                C117292a.m165357c(l, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopSound", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                l.release();
                C117292a.m165359e(l, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopSound", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
            ((AudioManager) ((C36570n) this.f170592t).getValue()).abandonAudioFocus(this.f170595w);
        } catch (Exception e) {
            Log.printErrStackTrace("ForceNotify.MsgWindow", e, "", new Object[0]);
        }
    }

    /* renamed from: s */
    public final void mo84702s() {
        mo84696n(this.f170577A);
        mo84696n(this.f170580D);
        mo84696n(this.f170578B);
        mo84696n(this.f170579C);
        mo84701r();
        mo84703t();
    }

    /* renamed from: t */
    public final void mo84703t() {
        try {
            mo84696n(this.f170582F);
            ((Vibrator) ((C36570n) this.f170596x).getValue()).cancel();
            if (mo84694l().isHeld()) {
                PowerManager.WakeLock l = mo84694l();
                C117292a.m165357c(l, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopVibrate", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                l.release();
                C117292a.m165359e(l, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "stopVibrate", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("ForceNotify.MsgWindow", e, "", new Object[0]);
        }
    }
}
