package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.autogen.events.UINotifyEvent;
import com.tencent.p014mm.p136ui.LayoutListenerView;
import com.tencent.p014mm.p136ui.tools.C106741c;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.p136ui.widget.AlbumChooserView;
import com.tencent.p014mm.p136ui.widget.WXActionMenuView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import go3.C76003c;
import in3.C46279a;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import nj3.C34861g1;
import p156gj.C87203t;
import p206nj.C88956h;
import p331dj.C107046f;
import p573jk.C87974c;
import qo3.C47883u;
import qo3.C77426q;
import vl3.C102226d;
import vo3.C78461f;
import xi3.C78844a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.MMActivityController */
public abstract class MMActivityController {

    /* renamed from: p0 */
    public static boolean f348057p0;

    /* renamed from: q0 */
    public static PowerManager.WakeLock f348058q0;

    /* renamed from: r0 */
    public static byte[] f348059r0 = {0};

    /* renamed from: A */
    public C106742j1 f348060A;

    /* renamed from: B */
    public C116044q f348061B = new C116044q();

    /* renamed from: C */
    public LinkedList<C116044q> f348062C = new LinkedList<>();

    /* renamed from: D */
    public C106741c f348063D;

    /* renamed from: E */
    public ArrayList<Dialog> f348064E;

    /* renamed from: F */
    public ActionBar f348065F;

    /* renamed from: G */
    public TextView f348066G;

    /* renamed from: H */
    public View f348067H;

    /* renamed from: I */
    public View f348068I;

    /* renamed from: J */
    public WeImageView f348069J;

    /* renamed from: K */
    public TextView f348070K;

    /* renamed from: L */
    public ProgressBar f348071L;

    /* renamed from: M */
    public TextView f348072M;

    /* renamed from: N */
    public int f348073N = 0;

    /* renamed from: O */
    public boolean f348074O = false;

    /* renamed from: P */
    public int f348075P = 0;

    /* renamed from: Q */
    public boolean f348076Q = false;

    /* renamed from: R */
    public WeImageView f348077R;

    /* renamed from: S */
    public TextView f348078S;

    /* renamed from: T */
    public Button f348079T;

    /* renamed from: U */
    public ViewGroup.LayoutParams f348080U;

    /* renamed from: V */
    public int f348081V;

    /* renamed from: W */
    public int f348082W;

    /* renamed from: X */
    public View f348083X;

    /* renamed from: Y */
    public AlbumChooserView f348084Y;

    /* renamed from: Z */
    public View f348085Z;

    /* renamed from: a */
    public View f348086a;

    /* renamed from: a0 */
    public boolean f348087a0 = true;
    private View actionbarView;

    /* renamed from: b */
    public View f348088b;

    /* renamed from: b0 */
    public int f348089b0 = 0;

    /* renamed from: c */
    public LayoutInflater f348090c;

    /* renamed from: c0 */
    public boolean f348091c0 = false;

    /* renamed from: d */
    public View f348092d;

    /* renamed from: d0 */
    public IListener f348093d0 = new IListener<UINotifyEvent>(C40008f.f107254d) {
        {
            this.__eventId = 2021095821;
        }

        public boolean callback(IEvent iEvent) {
            UINotifyEvent.C114698a aVar = ((UINotifyEvent) iEvent).f343630d;
            if (aVar.f343635e == 2) {
                String str = aVar.f343638h;
                int i = aVar.f343639i;
                Log.m105925i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE callback position[%d] noticeId[%s]", Integer.valueOf(i), str);
                if (i <= 0 || i == MMActivityController.this.f348089b0) {
                    MMActivityController.this.mo177053K(aVar.f343637g, aVar.f343631a, aVar.f343632b, aVar.f343633c, str, i, false);
                } else {
                    Log.m105925i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE callback position not match[%d, %d] ignore display", Integer.valueOf(i), Integer.valueOf(MMActivityController.this.f348089b0));
                }
            }
            return false;
        }
    };

    /* renamed from: e */
    public View f348094e;

    /* renamed from: e0 */
    public int f348095e0 = C0966R.C0971layout.f6311bc;

    /* renamed from: f */
    public TextView f348096f;

    /* renamed from: f0 */
    public int f348097f0 = -1;

    /* renamed from: g */
    public FrameLayout f348098g;

    /* renamed from: g0 */
    public int f348099g0 = 0;

    /* renamed from: h */
    public AudioManager f348100h;

    /* renamed from: h0 */
    public C116044q f348101h0;

    /* renamed from: i */
    public boolean f348102i = true;

    /* renamed from: i0 */
    public MenuItem f348103i0;

    /* renamed from: j */
    public String f348104j = " ";

    /* renamed from: j0 */
    public Runnable f348105j0 = new C116041e();

    /* renamed from: k */
    public int f348106k = 0;

    /* renamed from: k0 */
    public Runnable f348107k0 = new C116042f();

    /* renamed from: l */
    public int f348108l = 0;

    /* renamed from: l0 */
    public long f348109l0 = SystemClock.elapsedRealtime();

    /* renamed from: m */
    public C76003c f348110m = null;

    /* renamed from: m0 */
    public int f348111m0 = 0;

    /* renamed from: n */
    public C76003c f348112n = null;

    /* renamed from: n0 */
    public int f348113n0 = this.f348081V;

    /* renamed from: o */
    public C76003c f348114o = null;

    /* renamed from: o0 */
    public int f348115o0 = -1;

    /* renamed from: p */
    public C76003c f348116p = null;

    /* renamed from: q */
    public boolean f348117q = false;

    /* renamed from: r */
    public boolean f348118r = false;

    /* renamed from: s */
    public AppCompatActivity f348119s;

    /* renamed from: t */
    public Context f348120t;

    /* renamed from: u */
    public C78461f f348121u;

    /* renamed from: v */
    public boolean f348122v = true;

    /* renamed from: w */
    public boolean f348123w = false;

    /* renamed from: x */
    public MMHandler f348124x = new MMHandler(Looper.getMainLooper());

    /* renamed from: y */
    public boolean f348125y = false;

    /* renamed from: z */
    public boolean f348126z;

    /* renamed from: com.tencent.mm.ui.MMActivityController$d */
    public class C6740d implements Runnable {
        public C6740d() {
        }

        public void run() {
            View view = MMActivityController.this.f348085Z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/MMActivityController$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$g */
    public class C6741g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f24159d;

        public C6741g(MMActivityController mMActivityController, Runnable runnable) {
            this.f24159d = runnable;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Runnable runnable = this.f24159d;
            if (runnable != null) {
                runnable.run();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/MMActivityController$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$j */
    public class C6742j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f24160d;

        public C6742j(String str) {
            this.f24160d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f24160d != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f24160d));
                Context context = MMActivityController.this.f348120t;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/MMActivityController$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/MMActivityController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$k */
    public class C6743k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f24162d;

        /* renamed from: e */
        public final /* synthetic */ String f24163e;

        /* renamed from: f */
        public final /* synthetic */ String f24164f;

        public C6743k(boolean z, String str, String str2) {
            this.f24162d = z;
            this.f24163e = str;
            this.f24164f = str2;
        }

        public void run() {
            View view = MMActivityController.this.f348094e;
            int i = this.f24162d ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/MMActivityController$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String string = MMActivityController.this.f348120t.getString(C0966R.string.f360887fn2);
            String string2 = Util.isNullOrNil(this.f24163e) ? MMActivityController.this.f348120t.getString(C0966R.string.bzy) : this.f24163e;
            if (this.f24164f != null) {
                SpannableString spannableString = new SpannableString(string2 + string);
                spannableString.setSpan(new ForegroundColorSpan(-10119449), string2.length(), string2.length() + string.length(), 33);
                MMActivityController.this.f348096f.setText(spannableString);
            } else {
                Log.m105924i("MicroMsg.MMActivityController", "summerdiz url is null 2");
                MMActivityController.this.f348096f.setText(string2);
            }
            MMActivityController.this.f348094e.invalidate();
            MMActivityController.this.f348098g.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$n */
    public class C6744n implements View.OnTouchListener {
        public C6744n(MMActivityController mMActivityController) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                System.currentTimeMillis();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/MMActivityController$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$o */
    public class C6745o implements C47883u {
        public C6745o(MMActivityController mMActivityController) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                C117407d.INSTANCE.mo160131h(15181, 3);
                Intent intent = new Intent();
                intent.setClassName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
                intent.addFlags(268435456);
                Context context = MMApplicationContext.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController$8", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/MMActivityController$8", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            C117407d.INSTANCE.mo160131h(15181, 2);
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$r */
    public enum C73075r {
        NORMAL(0),
        GREEN(1),
        RED(2),
        BLACK(3),
        TRANSPARENT(4),
        TRANSPARENT_RED_TEXT(5),
        TRANSPARENT_GREEN_TEXT(6),
        GOLDEN(7),
        TRANSPARENT_GOLD_TEXT(8),
        TRANSPARENT_BG_BLACK_TEXT(10),
        YELLOW(11),
        ORANGE(12),
        DARK_GREEN_MODE(13),
        SMART_GALLERY_SEARCH_ENTRY(14),
        FEED_FOLLOW(15),
        FEED_UNFOLLOW(16),
        FINDER_LIVE(17),
        ALTER_BTN_BACKGROUND(18),
        TIGER2022(19);
        

        /* renamed from: d */
        public final int f214414d;

        /* access modifiers changed from: public */
        C73075r(int i) {
            this.f214414d = i;
        }

        /* renamed from: a */
        public static C73075r m85980a(int i) {
            for (C73075r rVar : values()) {
                if (rVar.f214414d == i) {
                    return rVar;
                }
            }
            return NORMAL;
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$i */
    public class C85810i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f249917d;

        /* renamed from: e */
        public final /* synthetic */ int f249918e;

        public C85810i(String str, int i) {
            this.f249917d = str;
            this.f249918e = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BroadcastEvent broadcastEvent = new BroadcastEvent();
            BroadcastEvent.C80706a aVar = broadcastEvent.f343529d;
            aVar.f236156a = 1;
            aVar.f236157b = this.f249917d;
            aVar.f236158c = this.f249918e;
            broadcastEvent.publish();
            View view2 = MMActivityController.this.f348094e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/MMActivityController$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/MMActivityController$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/MMActivityController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$h */
    public class C106632h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MenuItem.OnMenuItemClickListener f318639d;

        /* renamed from: com.tencent.mm.ui.MMActivityController$h$a */
        public class C106633a implements Runnable {
            public C106633a() {
            }

            public void run() {
                C106632h.this.f318639d.onMenuItemClick((MenuItem) null);
            }
        }

        public C106632h(MMActivityController mMActivityController, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f318639d = onMenuItemClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            view.setSelected(false);
            view.setPressed(false);
            view.clearFocus();
            view.invalidate();
            view.post(new C106633a());
            C117292a.m165361g(this, "com/tencent/mm/ui/MMActivityController$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$l */
    public class C106634l implements View.OnAttachStateChangeListener {
        public C106634l() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            MMActivityController.this.f348098g.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$m */
    public class C106635m implements LayoutListenerView.C73074c {

        /* renamed from: a */
        public final int f318642a;

        public C106635m() {
            this.f318642a = C76577a.m92151b(MMActivityController.this.f348120t, 100);
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$a */
    public class C116038a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MenuItem f348128d;

        /* renamed from: e */
        public final /* synthetic */ C116044q f348129e;

        public C116038a(MenuItem menuItem, C116044q qVar) {
            this.f348128d = menuItem;
            this.f348129e = qVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMActivityController.this.mo177080j(this.f348128d, this.f348129e);
            C117292a.m165361g(this, "com/tencent/mm/ui/MMActivityController$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$b */
    public class C116039b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C116044q f348131d;

        public C116039b(C116044q qVar) {
            this.f348131d = qVar;
        }

        public boolean onLongClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            MMActivityController mMActivityController = MMActivityController.this;
            C116044q qVar = this.f348131d;
            if (!mMActivityController.f348102i) {
                Log.m105928w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
                z = true;
            } else {
                View.OnLongClickListener onLongClickListener = qVar.f348153n;
                z = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/ui/MMActivityController$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$c */
    public class C116040c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C116044q f348133d;

        public C116040c(C116044q qVar) {
            this.f348133d = qVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivityController$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMActivityController mMActivityController = MMActivityController.this;
            C116044q qVar = this.f348133d;
            if (!mMActivityController.f348102i) {
                Log.m105928w("MicroMsg.MMActivityController", "callTouchCallback screen not enable.");
                z = true;
            } else {
                View.OnTouchListener onTouchListener = qVar.f348154o;
                z = onTouchListener != null ? onTouchListener.onTouch(view, motionEvent) : false;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/ui/MMActivityController$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$e */
    public class C116041e implements Runnable {
        public C116041e() {
        }

        public void run() {
            MMActivityController.this.f348119s.getWindow().setFlags(1024, 1024);
            ActionBar actionBar = MMActivityController.this.f348065F;
            if (actionBar != null) {
                actionBar.mo91104o();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$f */
    public class C116042f implements Runnable {
        public C116042f() {
        }

        public void run() {
            ActionBar actionBar = MMActivityController.this.f348065F;
            if (actionBar != null) {
                actionBar.mo91094L();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$p */
    public class C116043p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f348137d;

        /* renamed from: e */
        public final /* synthetic */ String f348138e;

        public C116043p(boolean z, String str) {
            this.f348137d = z;
            this.f348138e = str;
        }

        public void run() {
            boolean z;
            if (MMActivityController.f348057p0 || !(z = this.f348137d)) {
                boolean z2 = this.f348137d;
                Intent intent = new Intent();
                C34861g1.m40517a(z2, intent.putExtra("classname", MMActivityController.this.mo177030r() + this.f348138e));
                return;
            }
            C34861g1.m40517a(z, new Intent().putExtra("classname", MMActivityController.this.mo177030r()).putExtra("main_process", false));
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivityController$q */
    public static final class C116044q {

        /* renamed from: a */
        public int f348140a = -1;

        /* renamed from: b */
        public int f348141b;

        /* renamed from: c */
        public int f348142c = 0;

        /* renamed from: d */
        public Drawable f348143d;

        /* renamed from: e */
        public boolean f348144e = true;

        /* renamed from: f */
        public boolean f348145f = true;

        /* renamed from: g */
        public String f348146g;

        /* renamed from: h */
        public int f348147h;

        /* renamed from: i */
        public View f348148i;

        /* renamed from: j */
        public View f348149j;

        /* renamed from: k */
        public C73075r f348150k = C73075r.NORMAL;

        /* renamed from: l */
        public boolean f348151l = false;

        /* renamed from: m */
        public MenuItem.OnMenuItemClickListener f348152m;

        /* renamed from: n */
        public View.OnLongClickListener f348153n;

        /* renamed from: o */
        public View.OnTouchListener f348154o;

        /* renamed from: p */
        public int f348155p = 0;

        /* renamed from: q */
        public int f348156q = 0;

        /* renamed from: r */
        public int f348157r = 0;

        /* renamed from: s */
        public int f348158s = 0;

        /* renamed from: t */
        public boolean f348159t = false;
    }

    /* renamed from: F0 */
    public static void m163187F0(Activity activity) {
        View currentFocus;
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = activity.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    /* renamed from: J */
    public static Locale m163188J(Context context) {
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        if (loadApplicationLanguage.equals("language_default")) {
            LocaleUtil.updateApplicationResourceLocale(context, Locale.ENGLISH);
            return Locale.getDefault();
        }
        Locale transLanguageToLocale = LocaleUtil.transLanguageToLocale(loadApplicationLanguage);
        LocaleUtil.updateApplicationResourceLocale(context, transLanguageToLocale);
        return transLanguageToLocale;
    }

    /* renamed from: U */
    public static boolean m163189U(String str) {
        String k = C87203t.m108275k();
        String str2 = Build.DEVICE;
        if (k == null && str2 == null) {
            return false;
        }
        if ((k == null || str == null) ? false : Util.isEqual(k.toLowerCase(), str.toLowerCase())) {
            return true;
        }
        return (str2 == null || str == null) ? false : Util.isEqual(str2.toLowerCase(), str.toLowerCase());
    }

    /* renamed from: m */
    public static boolean m163190m() {
        return m163189U("y83a") || m163189U("y83") || m163189U("v1732a") || m163189U("v1732t");
    }

    /* renamed from: A */
    public C116044q mo177035A(int i) {
        Iterator<C116044q> it = this.f348062C.iterator();
        while (it.hasNext()) {
            C116044q next = it.next();
            if (next.f348140a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: A0 */
    public void mo177036A0(int i, int i2) {
        if (this.f348065F != null) {
            if (i == 0) {
                this.f348106k = 0;
                this.f348110m = null;
            } else if (this.f348106k != i) {
                this.f348106k = i;
                this.f348110m = mo177099v(this.f348120t.getResources().getDimensionPixelSize(C0966R.dimen.f3628l), this.f348106k);
            }
            if (i2 == 0) {
                this.f348108l = 0;
                this.f348112n = null;
            } else if (this.f348108l != i2) {
                this.f348108l = i2;
                this.f348112n = mo177099v(this.f348120t.getResources().getDimensionPixelSize(C0966R.dimen.f3628l), this.f348108l);
            }
            mo177061P0();
        }
    }

    /* renamed from: B */
    public ActionBar mo177037B() {
        return this.f348119s.getSupportActionBar();
    }

    /* renamed from: B0 */
    public void mo177038B0(int i) {
        ActionBar actionBar = this.f348065F;
        if (actionBar != null) {
            if (i == 0) {
                actionBar.mo91094L();
                mo177059O0(this.f348119s, this.f348073N);
            } else {
                actionBar.mo91104o();
                mo177059O0(this.f348119s, mo177096t().getResources().getColor(C0966R.color.f3131gg));
            }
            Log.m105919d("MicroMsg.MMActivityController", "setTitleVisibility visible: %s.", Integer.valueOf(i));
        }
    }

    /* renamed from: C */
    public void mo177039C() {
        View view = this.f348083X;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f348067H;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: C0 */
    public void mo177040C0(boolean z) {
        ActionBar actionBar = this.f348065F;
        if (actionBar != null) {
            actionBar.mo91084B(z);
            View view = this.f348068I;
            if (view != null) {
                int i = z ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController", "showHomeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/MMActivityController", "showHomeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: D */
    public void mo177041D() {
        ArrayList<Dialog> arrayList = this.f348064E;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Dialog dialog = this.f348064E.get(i);
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
            this.f348064E.clear();
            this.f348064E = null;
        }
    }

    /* renamed from: D0 */
    public final void mo177042D0(boolean z, int i, boolean z2) {
        boolean z3;
        if (z) {
            Iterator<C116044q> it = this.f348062C.iterator();
            z3 = false;
            while (it.hasNext()) {
                C116044q next = it.next();
                if (next.f348145f != z2) {
                    next.f348145f = z2;
                    z3 = true;
                }
            }
        } else {
            Iterator<C116044q> it4 = this.f348062C.iterator();
            z3 = false;
            while (it4.hasNext()) {
                C116044q next2 = it4.next();
                if (next2.f348140a == i && next2.f348145f != z2) {
                    next2.f348145f = z2;
                    z3 = true;
                }
            }
        }
        C106742j1 j1Var = this.f348060A;
        boolean z4 = j1Var == null ? false : j1Var.f319115c;
        if (z3 && !z4) {
            mo177047G0();
        }
        Log.m105925i("MicroMsg.MMActivityController", "show option menu, target id %d, changed %B, searching %B", Integer.valueOf(i), Boolean.valueOf(z3), Boolean.valueOf(z4));
    }

    /* renamed from: E */
    public void mo177043E() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f348065F == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.MMActivityController", "hideTitleView hasTitle:%b", objArr);
        ActionBar actionBar = this.f348065F;
        if (actionBar != null) {
            actionBar.mo91104o();
        }
    }

    /* renamed from: E0 */
    public void mo177044E0() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f348065F == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.MMActivityController", "showTitleView hasTitle:%b", objArr);
        ActionBar actionBar = this.f348065F;
        if (actionBar != null) {
            actionBar.mo91094L();
        }
    }

    /* renamed from: F */
    public boolean mo177045F() {
        View currentFocus = this.f348119s.getCurrentFocus();
        return currentFocus == null ? mo177046G(this.f348092d) : mo177046G(currentFocus);
    }

    /* renamed from: G */
    public boolean mo177046G(View view) {
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        if (view == null || (inputMethodManager = (InputMethodManager) this.f348120t.getSystemService("input_method")) == null || (windowToken = view.getWindowToken()) == null) {
            return false;
        }
        try {
            boolean hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            Log.m105925i("MicroMsg.MMActivityController", "hideVKB status:%s", Boolean.valueOf(hideSoftInputFromWindow));
            return hideSoftInputFromWindow;
        } catch (IllegalArgumentException e) {
            Log.m105921e("MicroMsg.MMActivityController", "hide VKB(View) exception %s", e);
            return false;
        }
    }

    /* renamed from: G0 */
    public void mo177047G0() {
        this.f348119s.supportInvalidateOptionsMenu();
    }

    /* renamed from: H */
    public final void mo177048H(Activity activity) {
        if (this.f348065F != null && !mo177024X()) {
            Log.m105918d("MicroMsg.MMActivityController", "onCreate, after");
            if (!this.f348074O) {
                this.f348073N = mo177091q();
            }
            this.f348076Q = C74933u4.m89770g(this.f348073N);
            mo177081j0(this.f348073N);
            this.f348065F.mo91091I(new ColorDrawable(mo177096t().getResources().getColor(17170445)));
            this.f348065F.mo91088F(false);
            this.f348065F.mo91084B(false);
            this.f348065F.mo91087E(false);
            this.f348065F.mo91086D(true);
            this.f348065F.mo91090H(C0966R.C0969drawable.ayq);
            if (this.f348097f0 == -1) {
                this.f348065F.mo91114y(C85868k2.m106137b(mo177096t()).inflate(this.f348095e0, new LinearLayout(mo177096t()), false));
            } else {
                this.f348065F.mo91114y(C85868k2.m106137b(mo177096t()).inflate(this.f348097f0, new LinearLayout(mo177096t()), false));
            }
            this.f348066G = (TextView) mo177086n(16908308);
            this.f348072M = (TextView) mo177086n(16908309);
            C44706b.m49451b(this.f348066G, C0966R.dimen.f3619c);
            this.f348067H = mo177086n(C0966R.C0970id.f359398kp3);
            this.f348071L = (ProgressBar) mo177086n(C0966R.C0970id.i7m);
            this.f348068I = mo177086n(C0966R.C0970id.f5470g0);
            this.f348069J = (WeImageView) mo177086n(C0966R.C0970id.f5471g1);
            this.f348068I.setOnTouchListener(new C6744n(this));
            WeImageView weImageView = this.f348069J;
            if (weImageView != null) {
                weImageView.setContentDescription(mo177096t().getString(C0966R.string.f7574k3));
            }
            TextView textView = (TextView) mo177086n(C0966R.C0970id.no5);
            this.f348070K = textView;
            C44706b.m49451b(textView, C0966R.dimen.f3619c);
            TextView textView2 = this.f348066G;
            if (textView2 != null) {
                textView2.setText(C0966R.string.a0u);
            }
            this.f348083X = mo177086n(C0966R.C0970id.f5457fn);
            this.f348084Y = (AlbumChooserView) mo177086n(C0966R.C0970id.f5439f6);
            if (activity.getClass().getName() == "WebViewUI") {
                WeImageView weImageView2 = this.f348069J;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
                View view = this.f348068I;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (activity instanceof MMActivity) {
                WeImageView weImageView3 = this.f348069J;
                if (weImageView3 != null) {
                    weImageView3.setVisibility(0);
                }
                View view3 = this.f348068I;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView3 = this.f348066G;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    C85875k4.m106189j0(this.f348066G.getPaint(), 0.8f);
                }
            } else {
                WeImageView weImageView4 = this.f348069J;
                if (weImageView4 != null) {
                    weImageView4.setVisibility(8);
                }
                View view5 = this.f348068I;
                if (view5 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            mo177051I0();
        }
    }

    /* renamed from: H0 */
    public void mo177049H0(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = this.f348119s.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Log.m105919d("MicroMsg.MMActivityController", "dancy test actionbar isDark:%s", Boolean.valueOf(z));
            decorView.setSystemUiVisibility(z ? systemUiVisibility & -8193 : systemUiVisibility | 8192);
        }
    }

    /* renamed from: I */
    public final void mo177050I() {
        if (this.f348063D == null) {
            Log.m105925i("MicroMsg.MMActivityController", "initCustomMenuHelper, init, mAppCompatActivity:%s", this.f348119s);
            new WXActionMenuView.C74963a.C74964a();
            new WXActionMenuView.C74963a.C74964a();
            WXActionMenuView.C74963a.C74964a.f220474a.f220471a = mo177018M();
            WXActionMenuView.C74963a.C74964a.f220474a.f220472b = mo177019N();
            int max = Math.max(this.f348081V, C74942w4.m89786c(this.f348120t, C0966R.dimen.f3679b9));
            WXActionMenuView.C74963a aVar = WXActionMenuView.C74963a.C74964a.f220474a;
            aVar.f220473c = max;
            this.f348063D = new C106741c(this.f348119s, aVar);
        }
        if (this.f348063D != null) {
            Log.m105924i("MicroMsg.MMActivityController", "initCustomMenuHelper has init.");
        }
    }

    /* renamed from: I0 */
    public void mo177051I0() {
        if (this.f348076Q) {
            WeImageView weImageView = this.f348069J;
            if (weImageView != null) {
                mo177090p0(weImageView, -1, PorterDuff.Mode.SRC_ATOP);
            }
            TextView textView = this.f348066G;
            if (textView != null) {
                textView.setTextColor(this.f348120t.getResources().getColor(C0966R.color.f3022ch));
            }
            TextView textView2 = this.f348072M;
            if (textView2 != null) {
                textView2.setTextColor(this.f348120t.getResources().getColor(C0966R.color.f3022ch));
            }
            WeImageView weImageView2 = this.f348077R;
            if (weImageView2 == null || weImageView2.getVisibility() != 0) {
                TextView textView3 = this.f348078S;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    this.f348078S.setTextColor(C76577a.m92154e(this.f348120t, C0966R.color.f3023ci));
                }
            } else if (this.f348077R.getDrawable() != null) {
                Drawable drawable = this.f348077R.getDrawable();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                if (this.f348087a0) {
                    drawable.setColorFilter(-1, mode);
                } else {
                    drawable.clearColorFilter();
                }
            } else {
                mo177090p0(this.f348077R, -1, PorterDuff.Mode.SRC_ATOP);
            }
        } else {
            WeImageView weImageView3 = this.f348069J;
            if (weImageView3 != null) {
                weImageView3.setIconColor(this.f348120t.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            }
            TextView textView4 = this.f348066G;
            if (textView4 != null) {
                textView4.setTextColor(this.f348120t.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            }
            TextView textView5 = this.f348072M;
            if (textView5 != null) {
                textView5.setTextColor(this.f348120t.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            }
            WeImageView weImageView4 = this.f348077R;
            if (weImageView4 == null || weImageView4.getVisibility() != 0) {
                TextView textView6 = this.f348078S;
                if (textView6 != null && textView6.getVisibility() == 0) {
                    this.f348078S.setTextColor(C76577a.m92154e(this.f348120t, C0966R.color.anc));
                    return;
                }
                return;
            }
            this.f348077R.setIconColor(this.f348120t.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        }
    }

    /* renamed from: J0 */
    public void mo177052J0(Drawable drawable) {
        WeImageView weImageView;
        if (this.f348065F != null && (weImageView = this.f348069J) != null && drawable != null) {
            weImageView.setImageDrawable(drawable);
            drawable.invalidateSelf();
        }
    }

    /* renamed from: K */
    public final void mo177053K(int i, boolean z, String str, String str2, String str3, int i2, boolean z2) {
        boolean z3 = z;
        String str4 = str;
        String str5 = str3;
        Log.m105925i("MicroMsg.MMActivityController", "initNotifyView viewid[%d], visible[%b], uithread[%b], noticeid[%s], position[%d], notifyView[%s]", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), str5, Integer.valueOf(i2), this.f348094e);
        if (mo177023W()) {
            if (z3 || this.f348094e != null) {
                ActionBar actionBar = this.f348065F;
                if (actionBar == null || actionBar.mo91106q()) {
                    if (this.f348098g == null) {
                        this.f348098g = (FrameLayout) this.f348092d.findViewById(C0966R.C0970id.f358753gv2);
                    }
                    View view = this.f348094e;
                    if (view != null) {
                        this.f348098g.removeView(view);
                    }
                    int i3 = C0966R.C0971layout.bfv;
                    if (i > 0) {
                        i3 = i;
                    }
                    View inflate = this.f348090c.inflate(i3, (ViewGroup) null);
                    this.f348094e = inflate;
                    this.f348096f = (TextView) inflate.findViewById(C0966R.C0970id.hka);
                    this.f348094e.findViewById(C0966R.C0970id.f358876hk3).setOnClickListener(new C85810i(str5, i2));
                    this.f348094e.setOnClickListener(new C6742j(str4));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    if (this.f348091c0) {
                        layoutParams.setMargins(0, BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f348119s, 48.0f), 0, 0);
                        Log.m105925i("MicroMsg.MMActivityController", "summerdiz initNotifyView [%d, %d]", Integer.valueOf(layoutParams.height), Integer.valueOf(layoutParams.topMargin));
                    }
                    FrameLayout frameLayout = this.f348098g;
                    frameLayout.addView(this.f348094e, frameLayout.getChildCount(), layoutParams);
                    View view2 = this.f348094e;
                    if (view2 == null) {
                        return;
                    }
                    if (z2) {
                        int i4 = z3 ? 0 : 8;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i4));
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController", "initNotifyView", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/MMActivityController", "initNotifyView", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        String string = this.f348120t.getString(C0966R.string.f360887fn2);
                        String string2 = Util.isNullOrNil(str2) ? this.f348120t.getString(C0966R.string.bzy) : str2;
                        if (str4 != null) {
                            SpannableString spannableString = new SpannableString(string2 + string);
                            spannableString.setSpan(new ForegroundColorSpan(-10119449), string2.length(), string2.length() + string.length(), 33);
                            this.f348096f.setText(spannableString);
                        } else {
                            Log.m105924i("MicroMsg.MMActivityController", "summerdiz url is null 1");
                            this.f348096f.setText(string2);
                        }
                        this.f348094e.invalidate();
                        this.f348098g.invalidate();
                        return;
                    }
                    view2.post(new C6743k(z3, str2, str4));
                    return;
                }
                Log.m105924i("MicroMsg.MMActivityController", "initNotifyView mActionBar not showing");
            }
        }
    }

    /* renamed from: K0 */
    public void mo177054K0(String str) {
        C78844a.C15689b.f42385a.mo108838c(this.f348119s, str);
    }

    /* renamed from: L */
    public boolean mo177055L() {
        return this instanceof C116182x1;
    }

    /* renamed from: L0 */
    public void mo177056L0(int i, int i2) {
        C116044q A = mo177035A(i);
        if (A != null && A.f348141b != i2) {
            A.f348141b = i2;
            mo177047G0();
        }
    }

    /* renamed from: M */
    public boolean mo177018M() {
        return true;
    }

    /* renamed from: M0 */
    public void mo177057M0(int i, boolean z) {
        C116044q A = mo177035A(i);
        if (A != null && A.f348151l != z) {
            A.f348151l = z;
            mo177047G0();
        }
    }

    /* renamed from: N */
    public boolean mo177019N() {
        return false;
    }

    /* renamed from: N0 */
    public void mo177058N0(int i, String str) {
        C116044q A = mo177035A(i);
        if (A != null && !Util.nullAs(str, "").equals(A.f348146g)) {
            A.f348146g = str;
            mo177047G0();
        }
    }

    /* renamed from: O */
    public abstract boolean mo177020O();

    /* renamed from: O0 */
    public void mo177059O0(Activity activity, int i) {
        int b = (Build.VERSION.SDK_INT < 23 || C88956h.m111064e()) ? C74933u4.m89765b(activity.getResources().getColor(C0966R.color.aec), i) : i;
        if (activity instanceof MMActivity) {
            MMActivity mMActivity = (MMActivity) activity;
            if (mMActivity.fixStatusbar && mMActivity.isSupportNavigationSwipeBack()) {
                C46279a.m51577a(mo177094s(), b, C87773e.m109213g(activity.getWindow()));
                this.f348115o0 = i;
            }
        }
        activity.getWindow().setStatusBarColor(b);
        this.f348115o0 = i;
    }

    /* renamed from: P */
    public final boolean mo177060P(Activity activity) {
        if (activity == null) {
            return false;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(C0966R.attr.a4n, typedValue, true);
        CharSequence charSequence = typedValue.string;
        return charSequence != null && charSequence.equals(activity.getString(C0966R.string.f4g));
    }

    /* renamed from: P0 */
    public final void mo177061P0() {
        int i;
        int i2;
        int i3;
        int dimensionPixelSize = this.f348120t.getResources().getDimensionPixelSize(C0966R.dimen.f3619c);
        String str = this.f348106k != 0 ? "# %s" : "%s";
        if (this.f348108l != 0) {
            str = str + " #";
            i = 1;
        } else {
            i = 0;
        }
        if (this.f348117q) {
            str = str + " #";
            i += 2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f348118r) {
            str = str + " #";
            i2 += 2;
            i += 2;
            i3 = 1;
        } else {
            i3 = 0;
        }
        String format = String.format(str, new Object[]{this.f348104j});
        Log.m105927v("MicroMsg.MMActivityController", "span title format %s", str);
        CharSequence a = C102226d.m134696a(this.f348120t, format);
        if (a instanceof SpannableString) {
            SpannableString spannableString = (SpannableString) a;
            if (this.f348106k != 0) {
                spannableString.setSpan(this.f348110m, 0, 1, 33);
            }
            if (this.f348108l != 0) {
                int length = spannableString.length() - i;
                spannableString.setSpan(this.f348112n, length, length + 1, 33);
            }
            if (this.f348117q) {
                if (this.f348114o == null) {
                    Drawable e = C74933u4.m89768e(mo177096t(), C0966R.raw.icons_outlined_bellring_off, mo177096t().getResources().getColor(C0966R.color.f3107fh));
                    if (this.f348076Q) {
                        C74933u4.m89769f(e, -1);
                    }
                    e.setBounds(0, 0, C74942w4.m89786c(mo177096t(), C0966R.dimen.f3736cp), C74942w4.m89786c(mo177096t(), C0966R.dimen.f3736cp));
                    C76003c cVar = new C76003c(e, 1);
                    int intrinsicHeight = (e.getIntrinsicHeight() - dimensionPixelSize) / 2;
                    this.f348114o = cVar;
                }
                int length2 = spannableString.length() - i2;
                spannableString.setSpan(this.f348114o, length2, length2 + 1, 33);
            }
            if (this.f348118r) {
                if (this.f348116p == null) {
                    this.f348116p = mo177099v(dimensionPixelSize, C0966R.raw.chat_phone_notify_title_icon);
                }
                int length3 = spannableString.length() - i3;
                spannableString.setSpan(this.f348116p, length3, length3 + 1, 33);
            }
        }
        this.f348066G.setText(a);
    }

    /* renamed from: Q */
    public final boolean mo177062Q(Activity activity) {
        if (activity == null) {
            return false;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(C0966R.attr.a4n, typedValue, true);
        CharSequence charSequence = typedValue.string;
        return charSequence != null && charSequence.equals(activity.getString(C0966R.string.hdu));
    }

    /* renamed from: R */
    public boolean mo177021R() {
        return false;
    }

    /* renamed from: S */
    public boolean mo177063S() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f348065F == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.MMActivityController", "isTitleShowing hasTitle:%b", objArr);
        ActionBar actionBar = this.f348065F;
        if (actionBar == null) {
            return false;
        }
        return actionBar.mo91106q();
    }

    /* renamed from: T */
    public final boolean mo177064T(Activity activity) {
        if (activity == null) {
            return false;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(C0966R.attr.a4n, typedValue, true);
        CharSequence charSequence = typedValue.string;
        return charSequence != null && charSequence.equals(activity.getString(C0966R.string.k5z));
    }

    /* renamed from: V */
    public boolean mo177022V() {
        return !(this instanceof VASCommonFragment.C116171b);
    }

    /* renamed from: W */
    public boolean mo177023W() {
        return true;
    }

    /* renamed from: X */
    public boolean mo177024X() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x024c  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo177065Y(android.content.Context r17, androidx.appcompat.app.AppCompatActivity r18) {
        /*
            r16 = this;
            r9 = r16
            r10 = r18
            r9.f348120t = r10
            r9.f348119s = r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 28
            if (r0 < r2) goto L_0x0022
            android.view.Window r0 = r18.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r0.layoutInDisplayCutoutMode = r1
            androidx.appcompat.app.AppCompatActivity r2 = r9.f348119s
            android.view.Window r2 = r2.getWindow()
            r2.setAttributes(r0)
        L_0x0022:
            boolean r0 = r16.mo177024X()
            r2 = 0
            if (r0 != 0) goto L_0x00bb
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r3.append(r4)
            java.lang.String r4 = "_redesign"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r5)
            java.lang.String r3 = "dark_actionbar_init_new"
            boolean r0 = r0.getBoolean(r3, r2)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r5)
            java.lang.String r7 = "dark_actionbar"
            r6.getBoolean(r7, r2)
            if (r0 != 0) goto L_0x00bb
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r6.append(r8)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r6, r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r7, r2)
            r0.commit()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            r0.commit()
        L_0x00bb:
            android.content.res.Resources r0 = r18.getResources()
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106145B(r0)
            if (r0 == 0) goto L_0x0102
            boolean r0 = r10 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x00dd
            boolean r3 = r9.mo177064T(r10)
            if (r3 != 0) goto L_0x00d6
            r3 = r10
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            boolean r3 = r3.transparentTheme
            if (r3 == 0) goto L_0x00dd
        L_0x00d6:
            r0 = 2131886114(0x7f120022, float:1.9406798E38)
            r10.setTheme(r0)
            goto L_0x013e
        L_0x00dd:
            if (r0 == 0) goto L_0x00ec
            boolean r3 = r9.mo177062Q(r10)
            if (r3 == 0) goto L_0x00ec
            r0 = 2131886113(0x7f120021, float:1.9406796E38)
            r10.setTheme(r0)
            goto L_0x013e
        L_0x00ec:
            if (r0 == 0) goto L_0x00fb
            boolean r0 = r9.mo177060P(r10)
            if (r0 == 0) goto L_0x00fb
            r0 = 2131886112(0x7f120020, float:1.9406794E38)
            r10.setTheme(r0)
            goto L_0x013e
        L_0x00fb:
            r0 = 2131886111(0x7f12001f, float:1.9406792E38)
            r10.setTheme(r0)
            goto L_0x013e
        L_0x0102:
            boolean r0 = r10 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x011a
            r3 = r10
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            boolean r3 = r3.transparentTheme
            if (r3 != 0) goto L_0x0113
            boolean r3 = r9.mo177064T(r10)
            if (r3 == 0) goto L_0x011a
        L_0x0113:
            r0 = 2131886119(0x7f120027, float:1.9406808E38)
            r10.setTheme(r0)
            goto L_0x013e
        L_0x011a:
            if (r0 == 0) goto L_0x0129
            boolean r3 = r9.mo177062Q(r10)
            if (r3 == 0) goto L_0x0129
            r0 = 2131886118(0x7f120026, float:1.9406806E38)
            r10.setTheme(r0)
            goto L_0x013e
        L_0x0129:
            if (r0 == 0) goto L_0x0138
            boolean r0 = r9.mo177060P(r10)
            if (r0 == 0) goto L_0x0138
            r0 = 2131886117(0x7f120025, float:1.9406804E38)
            r10.setTheme(r0)
            goto L_0x013e
        L_0x0138:
            r0 = 2131886116(0x7f120024, float:1.9406802E38)
            r10.setTheme(r0)
        L_0x013e:
            r16.mo177025Z()
            java.lang.Class r0 = r16.getClass()
            java.lang.String r0 = r0.getName()
            r3 = 3
            com.tencent.p014mm.p136ui.C30858i4.m39248a(r3, r0)
            m163188J(r17)
            android.content.Context r0 = r9.f348120t
            java.lang.String r4 = "audio"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r9.f348100h = r0
            int r0 = r16.mo177033y()
            android.content.Context r4 = r9.f348120t
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r9.f348090c = r4
            android.view.View r4 = r16.mo177027g0()
            r9.f348092d = r4
            r5 = 0
            if (r4 != 0) goto L_0x017e
            r4 = 2131496503(0x7f0c0e37, float:1.8616573E38)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r18)
            android.view.View r4 = r6.inflate(r4, r5)
            r9.f348092d = r4
        L_0x017e:
            android.view.View r4 = r9.f348092d
            r6 = 2131309336(0x7f093318, float:1.8236953E38)
            android.view.View r4 = r4.findViewById(r6)
            r9.f348086a = r4
            android.view.View r4 = r9.f348092d
            r6 = 2131309315(0x7f093303, float:1.823691E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r9.f348098g = r4
            r4 = -1
            java.lang.String r6 = "MicroMsg.MMActivityController"
            r7 = 2
            if (r0 == r4) goto L_0x0331
            android.view.View r0 = r16.mo177034z()
            r9.f348088b = r0
            if (r0 != 0) goto L_0x01b1
            android.view.LayoutInflater r0 = r9.f348090c
            int r8 = r16.mo177033y()
            android.view.View r0 = r0.inflate(r8, r5)
            r9.f348088b = r0
            goto L_0x01c4
        L_0x01b1:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01c4
            android.view.View r0 = r9.f348088b
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r8 = r9.f348088b
            r0.removeView(r8)
        L_0x01c4:
            android.view.View r8 = r9.f348088b
            vo3.d r11 = vo3.C90853d.f260825a
            java.lang.String r12 = r16.mo177030r()
            if (r12 == 0) goto L_0x01d7
            boolean r0 = z04.C112551y.m153811k(r12)
            if (r0 == 0) goto L_0x01d5
            goto L_0x01d7
        L_0x01d5:
            r0 = 0
            goto L_0x01d8
        L_0x01d7:
            r0 = 1
        L_0x01d8:
            if (r0 == 0) goto L_0x01db
            goto L_0x0201
        L_0x01db:
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.Class r0 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x01e5 }
            goto L_0x01fa
        L_0x01e5:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r14 = "PullDownUtil"
            java.lang.String r15 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r13, r15, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r12
            java.lang.String r12 = "Class %s not found in dex"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r12, r0)
            r0 = r5
        L_0x01fa:
            if (r0 == 0) goto L_0x0201
            int r0 = r11.mo124950a(r0)
            goto L_0x0202
        L_0x0201:
            r0 = 1
        L_0x0202:
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0207
            r0 = 1
            goto L_0x0208
        L_0x0207:
            r0 = 0
        L_0x0208:
            oa1.d r11 = oa1.C117731d.m166007c()
            bp3.p r12 = bp3.C79758p.f233760a
            bp3.f r13 = bp3.C104160f.RepairerConfig_Global_BounceSwitch_Int
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            java.lang.Object r12 = r12.mo109878a(r13, r14)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.String r13 = "clicfg_weui_overscroll_switch"
            int r11 = r11.mo182443e(r13, r12, r1, r1)
            if (r11 != r1) goto L_0x0228
            r11 = 1
            goto L_0x0229
        L_0x0228:
            r11 = 0
        L_0x0229:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r12[r2] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r11)
            r12[r1] = r13
            boolean r13 = r9.f348122v
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12[r7] = r13
            java.lang.String r13 = "bounceCreate: %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r12)
            boolean r12 = r9.f348122v
            r0 = r0 & r12
            r0 = r0 & r11
            r9.f348122v = r0
            if (r0 == 0) goto L_0x032a
            com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView r0 = new com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView
            androidx.appcompat.app.AppCompatActivity r8 = r16.mo177096t()
            java.lang.String r11 = "context"
            gy3.C87412m.m108594g(r8, r11)
            r0.<init>(r8, r5)
            r9.f348121u = r0
            int r0 = r16.mo177031u()
            if (r0 == r4) goto L_0x0268
            android.view.View r4 = r9.f348088b
            android.view.View r5 = r4.findViewById(r0)
        L_0x0268:
            if (r5 == 0) goto L_0x0295
            android.view.View r0 = r9.f348088b
            if (r5 != r0) goto L_0x026f
            goto L_0x0295
        L_0x026f:
            android.view.ViewParent r0 = r5.getParent()
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0292
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r0.indexOfChild(r5)
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            r0.removeViewAt(r4)
            vo3.f r11 = r9.f348121u
            r11.setView(r5)
            vo3.f r5 = r9.f348121u
            android.view.View r5 = r5.getView()
            r0.addView(r5, r4, r8)
        L_0x0292:
            android.view.View r0 = r9.f348088b
            goto L_0x02b0
        L_0x0295:
            vo3.f r0 = r9.f348121u
            android.view.View r4 = r9.f348088b
            r0.setView(r4)
            int r0 = r16.mo177091q()
            vo3.f r4 = r9.f348121u
            r4.setStart2EndBgColorByActionBar(r0)
            vo3.f r4 = r9.f348121u
            r4.setEnd2StartBgColorByNavigationBar(r0)
            vo3.f r0 = r9.f348121u
            android.view.View r0 = r0.getView()
        L_0x02b0:
            r8 = r0
            vo3.f r0 = r9.f348121u
            com.tencent.mm.ui.widget.pulldown.WeUIBounceViewV2 r0 = (com.tencent.p014mm.p136ui.widget.pulldown.WeUIBounceViewV2) r0
            android.view.View r4 = r0.f319717H
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x032a
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r5.add(r4)
        L_0x02c3:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x032a
            java.lang.Object r4 = r5.pollFirst()
            java.lang.String r11 = "queue.pollFirst()"
            gy3.C87412m.m108593f(r4, r11)
            android.view.View r4 = (android.view.View) r4
            boolean r11 = r4 instanceof android.widget.AbsListView
            if (r11 == 0) goto L_0x02e1
            android.widget.AbsListView r4 = (android.widget.AbsListView) r4
            r4.setNestedScrollingEnabled(r1)
            r4.setOverScrollMode(r7)
            goto L_0x02c3
        L_0x02e1:
            boolean r11 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r11 == 0) goto L_0x02ee
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r4.setNestedScrollingEnabled(r1)
            r4.setOverScrollMode(r7)
            goto L_0x02c3
        L_0x02ee:
            boolean r11 = r4 instanceof android.widget.ScrollView
            if (r11 == 0) goto L_0x0304
            android.widget.ScrollView r4 = (android.widget.ScrollView) r4
            r4.setNestedScrollingEnabled(r1)
            r4.setOverScrollMode(r7)
            android.widget.ScrollView r11 = r0.getMCompatScrollViewChild()
            if (r11 != 0) goto L_0x02c3
            r0.setMCompatScrollViewChild(r4)
            goto L_0x02c3
        L_0x0304:
            boolean r11 = r4 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x02c3
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r11 = r4.getChildCount()
            r12 = 0
        L_0x030f:
            if (r12 >= r11) goto L_0x02c3
            android.view.View r13 = r4.getChildAt(r12)
            boolean r13 = r13 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x0327
            android.view.View r13 = r4.getChildAt(r12)
            java.lang.String r14 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r13, r14)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r5.addLast(r13)
        L_0x0327:
            int r12 = r12 + 1
            goto L_0x030f
        L_0x032a:
            android.widget.FrameLayout r0 = r9.f348098g
            r0.addView(r8, r2)
            r9.f348088b = r8
        L_0x0331:
            boolean r0 = r16.mo177021R()
            if (r0 == 0) goto L_0x033a
            wc3.C78538u.m94870f(r18)
        L_0x033a:
            android.view.View r0 = r9.f348092d
            r9.mo177028k(r0)
            boolean r0 = r16.mo177029o()
            r4 = 2131165256(0x7f070048, float:1.7944724E38)
            if (r0 == 0) goto L_0x03c4
            androidx.appcompat.app.AppCompatActivity r0 = r9.f348119s
            android.view.Window r0 = r0.getWindow()
            android.view.View r5 = r9.f348088b
            android.view.ViewGroup r0 = com.tencent.p014mm.p136ui.C85875k4.m106172b(r0, r5)
            android.view.View r5 = r9.f348088b
            com.tencent.p014mm.p136ui.C85875k4.m106179e0(r0, r5)
            android.view.View r0 = r9.f348088b
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r5 = r9.f348088b
            r0.removeView(r5)
            androidx.appcompat.app.AppCompatActivity r0 = r9.f348119s
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r5 = r9.f348088b
            r0.addView(r5, r2)
            android.content.Context r0 = r9.f348120t
            r5 = 25
            int r0 = kg3.C76577a.m92151b(r0, r5)
            android.content.Context r5 = r9.f348120t
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r8 = r5.widthPixels
            int r5 = r5.heightPixels
            if (r8 <= r5) goto L_0x039d
            android.content.Context r5 = r9.f348120t
            android.content.res.Resources r5 = r5.getResources()
            r8 = 2131165255(0x7f070047, float:1.7944722E38)
            int r5 = r5.getDimensionPixelSize(r8)
            goto L_0x03a7
        L_0x039d:
            android.content.Context r5 = r9.f348120t
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
        L_0x03a7:
            android.view.View r8 = r9.f348088b
            int r11 = r8.getPaddingLeft()
            android.view.View r12 = r9.f348088b
            int r12 = r12.getPaddingTop()
            int r12 = r12 + r0
            int r12 = r12 + r5
            android.view.View r0 = r9.f348088b
            int r0 = r0.getPaddingRight()
            android.view.View r5 = r9.f348088b
            int r5 = r5.getPaddingBottom()
            r8.setPadding(r11, r12, r0, r5)
        L_0x03c4:
            androidx.appcompat.app.ActionBar r0 = r16.mo177037B()
            androidx.appcompat.app.ActionBar r0 = go3.C76004e.m91288N(r0)
            r9.f348065F = r0
            java.lang.String r0 = "onCreate, before."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            r9.mo177048H(r10)
            boolean r0 = r16.mo177024X()
            if (r0 != 0) goto L_0x03ef
            android.content.Context r0 = r9.f348120t
            int r0 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r4)
            r9.f348081V = r0
            android.content.Context r0 = r9.f348120t
            r4 = 2131165635(0x7f0701c3, float:1.7945493E38)
            int r0 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r4)
            r9.f348082W = r0
        L_0x03ef:
            r16.mo177050I()
            android.widget.FrameLayout r0 = r9.f348098g
            if (r0 == 0) goto L_0x03fe
            com.tencent.mm.ui.MMActivityController$l r4 = new com.tencent.mm.ui.MMActivityController$l
            r4.<init>()
            r0.addOnAttachStateChangeListener(r4)
        L_0x03fe:
            android.widget.FrameLayout r0 = r9.f348098g
            if (r0 == 0) goto L_0x0411
            boolean r4 = r0 instanceof com.tencent.p014mm.p136ui.LayoutListenerView
            if (r4 == 0) goto L_0x0411
            com.tencent.mm.ui.LayoutListenerView r0 = (com.tencent.p014mm.p136ui.LayoutListenerView) r0
            com.tencent.mm.ui.MMActivityController$m r4 = new com.tencent.mm.ui.MMActivityController$m
            r4.<init>()
            r0.setOnResizedListener(r4)
            goto L_0x0416
        L_0x0411:
            java.lang.String r0 = "layoutListenerView is not right"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
        L_0x0416:
            com.tencent.mm.autogen.events.BroadcastEvent r0 = new com.tencent.mm.autogen.events.BroadcastEvent
            r0.<init>()
            com.tencent.mm.autogen.events.BroadcastEvent$a r4 = r0.f343529d
            r4.f236156a = r7
            int r5 = r9.f348089b0
            r4.f236158c = r5
            r0.publish()
            com.tencent.mm.autogen.events.BroadcastEvent$b r4 = r0.f343530e
            int r4 = r4.f343535e
            if (r4 != r7) goto L_0x0495
            long r11 = java.lang.System.currentTimeMillis()
            com.tencent.mm.autogen.events.BroadcastEvent$b r4 = r0.f343530e
            java.lang.String r8 = r4.f343538h
            int r13 = r4.f343539i
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3[r2] = r4
            r3[r1] = r8
            com.tencent.mm.sdk.platformtools.MMStack r4 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r3[r7] = r4
            java.lang.String r4 = "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position[%d], noticeId[%s] stack[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
            if (r13 <= 0) goto L_0x0467
            int r3 = r9.f348089b0
            if (r13 == r3) goto L_0x0467
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r0[r2] = r3
            int r2 = r9.f348089b0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position not match[%d, %d] ignore display"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            goto L_0x047a
        L_0x0467:
            com.tencent.mm.autogen.events.BroadcastEvent$b r0 = r0.f343530e
            int r2 = r0.f343537g
            boolean r3 = r0.f343531a
            java.lang.String r4 = r0.f343532b
            java.lang.String r5 = r0.f343533c
            r0 = 1
            r1 = r16
            r6 = r8
            r7 = r13
            r8 = r0
            r1.mo177053K(r2, r3, r4, r5, r6, r7, r8)
        L_0x047a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KEVIN MMActivity onCreate initNotifyView:"
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r11
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.INIT"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r0)
        L_0x0495:
            boolean r0 = r16.mo177022V()
            if (r0 == 0) goto L_0x04bd
            boolean r0 = r9.f348074O
            if (r0 != 0) goto L_0x04a5
            int r0 = r16.mo177091q()
            r9.f348073N = r0
        L_0x04a5:
            android.view.Window r0 = r18.getWindow()
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            r0.clearFlags(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            int r0 = r9.f348073N
            r9.mo177059O0(r10, r0)
            boolean r0 = r9.f348076Q
            r9.mo177049H0(r0)
        L_0x04bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMActivityController.mo177065Y(android.content.Context, androidx.appcompat.app.AppCompatActivity):void");
    }

    /* renamed from: Z */
    public abstract void mo177025Z();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v76 */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0034, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v2, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo177066a0(android.view.Menu r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.util.LinkedList<com.tencent.mm.ui.MMActivityController$q> r4 = r0.f348062C
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "MicroMsg.MMActivityController"
            java.lang.String r6 = "on create option menu, menuCache size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            androidx.appcompat.app.ActionBar r3 = r0.f348065F
            if (r3 == 0) goto L_0x0a42
            java.util.LinkedList<com.tencent.mm.ui.MMActivityController$q> r3 = r0.f348062C
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0029
            goto L_0x0a42
        L_0x0029:
            r3 = 0
            r0.f348101h0 = r3
            r0.f348103i0 = r3
            java.util.LinkedList<com.tencent.mm.ui.MMActivityController$q> r6 = r0.f348062C
            java.util.Iterator r6 = r6.iterator()
        L_0x0034:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0a3d
            java.lang.Object r7 = r6.next()
            com.tencent.mm.ui.MMActivityController$q r7 = (com.tencent.p014mm.p136ui.MMActivityController.C116044q) r7
            int r8 = r7.f348140a
            r9 = 16908332(0x102002c, float:2.3877352E-38)
            if (r8 != r9) goto L_0x004d
            java.lang.String r7 = "match back option menu, continue"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r7)
            goto L_0x0034
        L_0x004d:
            r9 = 2131309154(0x7f093262, float:1.8236584E38)
            r10 = 2
            if (r8 != r9) goto L_0x007d
            java.lang.Object[] r7 = new java.lang.Object[r10]
            boolean r8 = r0.f348126z
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r5] = r8
            com.tencent.mm.ui.tools.j1 r8 = r0.f348060A
            if (r8 != 0) goto L_0x0063
            r8 = 1
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r2] = r8
            java.lang.String r8 = "match search menu, enable search view[%B], search view helper is null[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r8, r7)
            boolean r7 = r0.f348126z
            if (r7 == 0) goto L_0x0034
            com.tencent.mm.ui.tools.j1 r7 = r0.f348060A
            if (r7 == 0) goto L_0x0034
            androidx.appcompat.app.AppCompatActivity r8 = r0.f348119s
            r7.mo23882j(r8, r1)
            goto L_0x0034
        L_0x007d:
            java.lang.String r9 = r7.f348146g
            android.view.MenuItem r8 = r1.add(r5, r8, r5, r9)
            java.lang.Class r9 = r32.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r11 = "MicroMsg.MenuItemUtil"
            r12 = 3
            if (r8 != 0) goto L_0x0096
            java.lang.String r9 = "fixTitleCondensed fail, item is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r9)
            goto L_0x00dc
        L_0x0096:
            java.lang.CharSequence r13 = r8.getTitleCondensed()
            if (r13 != 0) goto L_0x00ab
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r5] = r9
            java.lang.String r9 = "%s title condensed is null, fix it"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r9, r13)
            java.lang.String r9 = ""
            r8.setTitleCondensed(r9)
            goto L_0x00dc
        L_0x00ab:
            java.lang.CharSequence r13 = r8.getTitleCondensed()
            boolean r13 = r13 instanceof java.lang.String
            if (r13 == 0) goto L_0x00b4
            goto L_0x00dc
        L_0x00b4:
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r5] = r9
            java.lang.CharSequence r9 = r8.getTitleCondensed()
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r13[r2] = r9
            java.lang.CharSequence r9 = r8.getTitleCondensed()
            r13[r10] = r9
            java.lang.String r9 = "%s title condensed is not String type, cur type[%s], cur value[%s], fix it"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r9, r13)
            java.lang.CharSequence r9 = r8.getTitleCondensed()
            java.lang.String r9 = r9.toString()
            r8.setTitleCondensed(r9)
        L_0x00dc:
            com.tencent.mm.ui.MMActivityController$a r9 = new com.tencent.mm.ui.MMActivityController$a
            r9.<init>(r8, r7)
            com.tencent.mm.ui.MMActivityController$b r11 = new com.tencent.mm.ui.MMActivityController$b
            r11.<init>(r7)
            com.tencent.mm.ui.MMActivityController$c r13 = new com.tencent.mm.ui.MMActivityController$c
            r13.<init>(r7)
            int r14 = r7.f348141b
            r15 = 2131492936(0x7f0c0048, float:1.8609338E38)
            r10 = 8
            if (r14 != 0) goto L_0x0597
            android.graphics.drawable.Drawable r14 = r7.f348143d
            if (r14 == 0) goto L_0x00fa
            goto L_0x0597
        L_0x00fa:
            android.view.View r14 = r7.f348148i
            if (r14 != 0) goto L_0x0106
            android.content.Context r14 = r0.f348120t
            android.view.View r14 = android.view.View.inflate(r14, r15, r3)
            r7.f348148i = r14
        L_0x0106:
            android.view.View r14 = r7.f348148i
            r15 = 2131296480(0x7f0900e0, float:1.8210878E38)
            android.view.View r14 = r14.findViewById(r15)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0.f348078S = r14
            r14.setVisibility(r5)
            android.view.View r14 = r7.f348148i
            r15 = 2131296476(0x7f0900dc, float:1.821087E38)
            android.view.View r14 = r14.findViewById(r15)
            android.widget.Button r14 = (android.widget.Button) r14
            r0.f348079T = r14
            r14.setVisibility(r10)
            android.widget.Button r14 = r0.f348079T
            r15 = 2131165639(0x7f0701c7, float:1.79455E38)
            com.tencent.p014mm.p136ui.C44706b.m49451b(r14, r15)
            android.widget.TextView r14 = r0.f348078S
            r15 = 2131165186(0x7f070002, float:1.7944582E38)
            com.tencent.p014mm.p136ui.C44706b.m49451b(r14, r15)
            android.view.View r14 = r7.f348148i
            r15 = 2131296866(0x7f090262, float:1.821166E38)
            android.view.View r14 = r14.findViewById(r15)
            r0.f348085Z = r14
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r15.mo10233c(r3)
            java.lang.Object[] r17 = r15.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r19 = "onCreateOptionsMenu"
            java.lang.String r20 = "(Landroid/view/Menu;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r14
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r15.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r14.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r18 = "onCreateOptionsMenu"
            java.lang.String r19 = "(Landroid/view/Menu;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.ui.MMActivityController$r r3 = r7.f348150k
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.RED
            if (r3 == r14) goto L_0x0485
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.TRANSPARENT_RED_TEXT
            if (r3 != r14) goto L_0x018c
            goto L_0x0485
        L_0x018c:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.TRANSPARENT_GREEN_TEXT
            if (r3 != r14) goto L_0x01b4
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r14 = 2131231405(0x7f0802ad, float:1.807889E38)
            r3.setBackgroundResource(r14)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r14 = r32.mo177096t()
            r15 = 2131101834(0x7f06088a, float:1.7816089E38)
            android.content.res.ColorStateList r14 = kg3.C76577a.m92154e(r14, r15)
            r3.setTextColor(r14)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x01b4:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
            r15 = 2131100345(0x7f0602b9, float:1.7813069E38)
            r17 = 2131231396(0x7f0802a4, float:1.8078872E38)
            if (r3 != r14) goto L_0x01ec
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            boolean r14 = p573jk.C76417a.m91844a()
            if (r14 == 0) goto L_0x01cf
            r14 = 2131231396(0x7f0802a4, float:1.8078872E38)
            goto L_0x01d5
        L_0x01cf:
            r17 = 2131231395(0x7f0802a3, float:1.807887E38)
            r14 = 2131231395(0x7f0802a3, float:1.807887E38)
        L_0x01d5:
            r3.setBackgroundResource(r14)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r14 = r32.mo177096t()
            android.content.res.ColorStateList r14 = kg3.C76577a.m92154e(r14, r15)
            r3.setTextColor(r14)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x01ec:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.BLACK
            r12 = 2131101255(0x7f060647, float:1.7814915E38)
            if (r3 != r14) goto L_0x0202
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r10 = r32.mo177096t()
            android.content.res.ColorStateList r10 = kg3.C76577a.m92154e(r10, r12)
            r3.setTextColor(r10)
            goto L_0x04a7
        L_0x0202:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.TRANSPARENT_GOLD_TEXT
            if (r3 != r14) goto L_0x021c
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r10 = r32.mo177096t()
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131101083(0x7f06059b, float:1.7814566E38)
            int r10 = r10.getColor(r12)
            r3.setTextColor(r10)
            goto L_0x04a7
        L_0x021c:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GOLDEN
            if (r3 != r14) goto L_0x0236
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r10 = r32.mo177096t()
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r10 = r10.getColor(r12)
            r3.setTextColor(r10)
            goto L_0x04a7
        L_0x0236:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.YELLOW
            if (r3 != r14) goto L_0x025b
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r12 = 2131231408(0x7f0802b0, float:1.8078896E38)
            r3.setBackgroundResource(r12)
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            android.content.res.ColorStateList r12 = kg3.C76577a.m92154e(r12, r15)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x025b:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.DARK_GREEN_MODE
            if (r14 != r3) goto L_0x0295
            java.lang.String r3 = "dark green mode."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            boolean r12 = p573jk.C76417a.m91844a()
            if (r12 == 0) goto L_0x0275
            r12 = 2131231396(0x7f0802a4, float:1.8078872E38)
            goto L_0x027b
        L_0x0275:
            r17 = 2131231388(0x7f08029c, float:1.8078856E38)
            r12 = 2131231388(0x7f08029c, float:1.8078856E38)
        L_0x027b:
            r3.setBackgroundResource(r12)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            r14 = 2131100806(0x7f060486, float:1.7814004E38)
            android.content.res.ColorStateList r12 = kg3.C76577a.m92154e(r12, r14)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x0295:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.ORANGE
            r12 = 2131231402(0x7f0802aa, float:1.8078884E38)
            if (r3 != r14) goto L_0x02ba
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r3.setBackgroundResource(r12)
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            android.content.res.ColorStateList r12 = kg3.C76577a.m92154e(r12, r15)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x02ba:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.SMART_GALLERY_SEARCH_ENTRY
            if (r14 != r3) goto L_0x038e
            java.lang.Object[] r3 = new java.lang.Object[r2]
            boolean r12 = r0.f348125y
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r3[r5] = r12
            java.lang.String r12 = "smart gallery entry %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r3)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            boolean r3 = r0.f348125y
            if (r3 == 0) goto L_0x031c
            android.view.View r3 = r0.f348085Z
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r10.mo10233c(r12)
            java.lang.Object[] r25 = r10.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r3
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r10 = r10.mo10231a(r5)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r3.setVisibility(r10)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r3 = r0.f348085Z
            r3.setOnClickListener(r9)
            goto L_0x04a7
        L_0x031c:
            android.view.View r3 = r0.f348085Z
            int r3 = r3.getVisibility()
            if (r10 != r3) goto L_0x0365
            android.view.View r3 = r0.f348085Z
            k20.a r10 = new k20.a
            r10.<init>()
            r12 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r10.mo10233c(r14)
            java.lang.Object[] r25 = r10.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r3
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r10 = r10.mo10231a(r5)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r3.setVisibility(r10)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0386
        L_0x0365:
            android.view.View r3 = r0.f348085Z
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0386
            android.view.View r3 = r0.f348085Z
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r10 = 0
            android.view.ViewPropertyAnimator r3 = r3.alpha(r10)
            r14 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r14)
            com.tencent.mm.ui.MMActivityController$d r10 = new com.tencent.mm.ui.MMActivityController$d
            r10.<init>()
            r3.withEndAction(r10)
        L_0x0386:
            android.view.View r3 = r0.f348085Z
            r10 = 0
            r3.setOnClickListener(r10)
            goto L_0x04a7
        L_0x038e:
            com.tencent.mm.ui.MMActivityController$r r14 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.FEED_FOLLOW
            if (r14 != r3) goto L_0x03b3
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r3.setBackgroundResource(r12)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            r14 = 2131100231(0x7f060247, float:1.7812838E38)
            int r12 = kg3.C76577a.m92153d(r12, r14)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x03b3:
            com.tencent.mm.ui.MMActivityController$r r12 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.FEED_UNFOLLOW
            if (r12 != r3) goto L_0x03db
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r12 = 2131231390(0x7f08029e, float:1.807886E38)
            r3.setBackgroundResource(r12)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            r14 = 2131099682(0x7f060022, float:1.7811724E38)
            int r12 = kg3.C76577a.m92153d(r12, r14)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x03db:
            com.tencent.mm.ui.MMActivityController$r r12 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.FINDER_LIVE
            if (r12 != r3) goto L_0x0403
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r12 = 2131231399(0x7f0802a7, float:1.8078878E38)
            r3.setBackgroundResource(r12)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            r14 = 2131099704(0x7f060038, float:1.7811769E38)
            int r12 = kg3.C76577a.m92153d(r12, r14)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x0403:
            com.tencent.mm.ui.MMActivityController$r r3 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.ALTER_BTN_BACKGROUND
            com.tencent.mm.ui.MMActivityController$r r12 = r7.f348150k
            if (r3 != r12) goto L_0x042d
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r12 = 2131230931(0x7f0800d3, float:1.8077929E38)
            r3.setBackgroundResource(r12)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            r14 = 2131100241(0x7f060251, float:1.7812858E38)
            int r12 = kg3.C76577a.m92153d(r12, r14)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x042d:
            com.tencent.mm.ui.MMActivityController$r r3 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.TIGER2022
            com.tencent.mm.ui.MMActivityController$r r12 = r7.f348150k
            if (r3 != r12) goto L_0x0453
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r12 = 2131231404(0x7f0802ac, float:1.8078888E38)
            r3.setBackgroundResource(r12)
            android.widget.Button r3 = r0.f348079T
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            android.content.res.ColorStateList r12 = kg3.C76577a.m92154e(r12, r15)
            r3.setTextColor(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
            goto L_0x04a7
        L_0x0453:
            int r3 = r0.f348075P
            if (r3 == 0) goto L_0x045f
            android.widget.TextView r3 = r0.f348078S
            int r10 = r0.f348075P
            r3.setTextColor(r10)
            goto L_0x04a7
        L_0x045f:
            boolean r3 = r0.f348076Q
            if (r3 == 0) goto L_0x0474
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r10 = r32.mo177096t()
            r12 = 2131100006(0x7f060166, float:1.7812381E38)
            android.content.res.ColorStateList r10 = kg3.C76577a.m92154e(r10, r12)
            r3.setTextColor(r10)
            goto L_0x04a7
        L_0x0474:
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r10 = r32.mo177096t()
            r12 = 2131101255(0x7f060647, float:1.7814915E38)
            android.content.res.ColorStateList r10 = kg3.C76577a.m92154e(r10, r12)
            r3.setTextColor(r10)
            goto L_0x04a7
        L_0x0485:
            android.widget.TextView r3 = r0.f348078S
            androidx.appcompat.app.AppCompatActivity r12 = r32.mo177096t()
            r14 = 2131101362(0x7f0606b2, float:1.7815132E38)
            android.content.res.ColorStateList r12 = kg3.C76577a.m92154e(r12, r14)
            r3.setTextColor(r12)
            android.widget.Button r3 = r0.f348079T
            r3.setVisibility(r5)
            android.widget.Button r3 = r0.f348079T
            r12 = 2131231399(0x7f0802a7, float:1.8078878E38)
            r3.setBackgroundResource(r12)
            android.widget.TextView r3 = r0.f348078S
            r3.setVisibility(r10)
        L_0x04a7:
            android.widget.TextView r3 = r0.f348078S
            java.lang.String r10 = r7.f348146g
            r3.setText(r10)
            int r3 = r7.f348147h
            if (r3 == 0) goto L_0x04b7
            android.widget.TextView r10 = r0.f348078S
            r10.setTextColor(r3)
        L_0x04b7:
            boolean r3 = r7.f348159t
            r10 = 6
            if (r3 == 0) goto L_0x04f0
            android.widget.TextView r3 = r0.f348078S
            int r12 = r7.f348155p
            r3.setTextColor(r12)
            android.widget.Button r3 = r0.f348079T
            int r12 = r7.f348157r
            r3.setBackgroundColor(r12)
            android.widget.Button r3 = r0.f348079T
            int r12 = r7.f348155p
            r3.setTextColor(r12)
            android.widget.Button r3 = r0.f348079T
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r10 = kg3.C76577a.m92151b(r12, r10)
            float r10 = (float) r10
            if (r3 != 0) goto L_0x04df
            goto L_0x04e7
        L_0x04df:
            zo3.a r12 = new zo3.a
            r12.<init>(r2, r2, r10)
            r3.setOutlineProvider(r12)
        L_0x04e7:
            if (r3 != 0) goto L_0x04eb
            goto L_0x055d
        L_0x04eb:
            r3.setClipToOutline(r2)
            goto L_0x055d
        L_0x04f0:
            int r3 = r7.f348157r
            if (r3 == 0) goto L_0x055d
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r3 == 0) goto L_0x052c
            android.widget.TextView r3 = r0.f348078S
            int r12 = r7.f348156q
            r3.setTextColor(r12)
            android.widget.Button r3 = r0.f348079T
            int r12 = r7.f348158s
            r3.setBackgroundColor(r12)
            android.widget.Button r3 = r0.f348079T
            int r12 = r7.f348156q
            r3.setTextColor(r12)
            android.widget.Button r3 = r0.f348079T
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r10 = kg3.C76577a.m92151b(r12, r10)
            float r10 = (float) r10
            if (r3 != 0) goto L_0x051d
            goto L_0x0525
        L_0x051d:
            zo3.a r12 = new zo3.a
            r12.<init>(r2, r2, r10)
            r3.setOutlineProvider(r12)
        L_0x0525:
            if (r3 != 0) goto L_0x0528
            goto L_0x055d
        L_0x0528:
            r3.setClipToOutline(r2)
            goto L_0x055d
        L_0x052c:
            android.widget.TextView r3 = r0.f348078S
            int r12 = r7.f348155p
            r3.setTextColor(r12)
            android.widget.Button r3 = r0.f348079T
            int r12 = r7.f348157r
            r3.setBackgroundColor(r12)
            android.widget.Button r3 = r0.f348079T
            int r12 = r7.f348155p
            r3.setTextColor(r12)
            android.widget.Button r3 = r0.f348079T
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r10 = kg3.C76577a.m92151b(r12, r10)
            float r10 = (float) r10
            if (r3 != 0) goto L_0x054f
            goto L_0x0557
        L_0x054f:
            zo3.a r12 = new zo3.a
            r12.<init>(r2, r2, r10)
            r3.setOutlineProvider(r12)
        L_0x0557:
            if (r3 != 0) goto L_0x055a
            goto L_0x055d
        L_0x055a:
            r3.setClipToOutline(r2)
        L_0x055d:
            android.widget.TextView r3 = r0.f348078S
            r3.setOnClickListener(r9)
            android.widget.TextView r3 = r0.f348078S
            r3.setOnLongClickListener(r11)
            android.widget.TextView r3 = r0.f348078S
            boolean r10 = r7.f348144e
            r3.setEnabled(r10)
            android.widget.TextView r3 = r0.f348078S
            r3.setOnTouchListener(r13)
            android.widget.Button r3 = r0.f348079T
            java.lang.String r10 = r7.f348146g
            r3.setText(r10)
            android.widget.Button r3 = r0.f348079T
            r3.setOnClickListener(r9)
            android.widget.Button r3 = r0.f348079T
            r3.setOnLongClickListener(r11)
            android.widget.Button r3 = r0.f348079T
            r3.setOnTouchListener(r13)
            android.widget.Button r3 = r0.f348079T
            boolean r9 = r7.f348144e
            r3.setEnabled(r9)
            android.view.View r3 = r7.f348148i
            r8.setActionView(r3)
            goto L_0x09f7
        L_0x0597:
            android.view.View r3 = r7.f348149j
            if (r3 != 0) goto L_0x05a5
            android.content.Context r3 = r0.f348120t
            r12 = 0
            android.view.View r3 = android.view.View.inflate(r3, r15, r12)
            r7.f348149j = r3
            goto L_0x05a6
        L_0x05a5:
            r12 = 0
        L_0x05a6:
            android.view.View r3 = r7.f348149j
            r13 = 2131301075(0x7f0912d3, float:1.8220198E38)
            android.view.View r3 = r3.findViewById(r13)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x05b6
            r3.setVisibility(r10)
        L_0x05b6:
            java.util.LinkedList<com.tencent.mm.ui.MMActivityController$q> r3 = r0.f348062C
            int r3 = r3.size()
            r13 = 2131301139(0x7f091313, float:1.8220327E38)
            r14 = 2131296479(0x7f0900df, float:1.8210876E38)
            r15 = 2131296478(0x7f0900de, float:1.8210874E38)
            r12 = -1
            r5 = 2131296477(0x7f0900dd, float:1.8210872E38)
            if (r3 <= r2) goto L_0x084d
            java.util.LinkedList<com.tencent.mm.ui.MMActivityController$q> r3 = r0.f348062C
            int r20 = r3.size()
            int r2 = r20 + -1
            java.lang.Object r2 = r3.get(r2)
            com.tencent.mm.ui.MMActivityController$q r2 = (com.tencent.p014mm.p136ui.MMActivityController.C116044q) r2
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0716
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r0.f348077R = r2
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r13)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            boolean r3 = r7.f348151l
            if (r3 == 0) goto L_0x05f7
            r3 = 0
            goto L_0x05f9
        L_0x05f7:
            r3 = 8
        L_0x05f9:
            r2.setVisibility(r3)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r15)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r13)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r13 = 0
            java.lang.Object r3 = r3.mo10231a(r13)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r5)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            r3 = 2131301138(0x7f091312, float:1.8220325E38)
            android.view.View r2 = r2.findViewById(r3)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            r3 = 2131301137(0x7f091311, float:1.8220323E38)
            android.view.View r2 = r2.findViewById(r3)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0982
        L_0x0716:
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r15)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r0.f348077R = r2
            android.view.View r2 = r7.f348149j
            r3 = 2131301138(0x7f091312, float:1.8220325E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            boolean r3 = r7.f348151l
            if (r3 == 0) goto L_0x0731
            r3 = 0
            goto L_0x0733
        L_0x0731:
            r3 = 8
        L_0x0733:
            r2.setVisibility(r3)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r14)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r14)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r14 = 0
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r5)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r13)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            r3 = 2131301137(0x7f091311, float:1.8220323E38)
            android.view.View r2 = r2.findViewById(r3)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0982
        L_0x084d:
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r0.f348077R = r2
            android.view.View r2 = r7.f348149j
            r3 = 2131301137(0x7f091311, float:1.8220323E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            boolean r3 = r7.f348151l
            if (r3 == 0) goto L_0x0868
            r3 = 0
            goto L_0x086a
        L_0x0868:
            r3 = 8
        L_0x086a:
            r2.setVisibility(r3)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r15)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r14)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            r3 = 2131301138(0x7f091312, float:1.8220325E38)
            android.view.View r2 = r2.findViewById(r3)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r2 = r7.f348149j
            android.view.View r2 = r2.findViewById(r13)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r27 = "onCreateOptionsMenu"
            java.lang.String r28 = "(Landroid/view/Menu;)Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/ui/MMActivityController"
            java.lang.String r26 = "onCreateOptionsMenu"
            java.lang.String r27 = "(Landroid/view/Menu;)Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x0982:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            r3 = 0
            r2.setVisibility(r3)
            android.graphics.drawable.Drawable r2 = r7.f348143d
            if (r2 == 0) goto L_0x0992
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f348077R
            r3.setImageDrawable(r2)
            goto L_0x0999
        L_0x0992:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            int r3 = r7.f348141b
            r2.setImageResource(r3)
        L_0x0999:
            int r2 = r0.f348075P
            if (r2 == 0) goto L_0x09a5
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f348077R
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.mo177090p0(r3, r2, r5)
            goto L_0x09c8
        L_0x09a5:
            int r2 = r7.f348142c
            if (r2 == 0) goto L_0x09aa
            goto L_0x09c8
        L_0x09aa:
            boolean r2 = r0.f348076Q
            if (r2 == 0) goto L_0x09b6
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.mo177090p0(r2, r12, r3)
            goto L_0x09c8
        L_0x09b6:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            android.content.Context r3 = r0.f348120t
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131099927(0x7f060117, float:1.7812221E38)
            int r3 = r3.getColor(r5)
            r2.setIconColor(r3)
        L_0x09c8:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            r2.setOnClickListener(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            boolean r3 = r7.f348144e
            r2.setEnabled(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            java.lang.String r3 = r7.f348146g
            r2.setContentDescription(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            r3 = 2131314872(0x7f0948b8, float:1.8248181E38)
            int r5 = r7.f348141b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.setTag(r3, r5)
            android.view.View$OnLongClickListener r2 = r7.f348153n
            if (r2 == 0) goto L_0x09f2
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f348077R
            r2.setOnLongClickListener(r11)
        L_0x09f2:
            android.view.View r2 = r7.f348149j
            r8.setActionView(r2)
        L_0x09f7:
            boolean r2 = r7.f348144e
            r8.setEnabled(r2)
            boolean r2 = r7.f348145f
            r8.setVisible(r2)
            r2 = 2
            r8.setShowAsAction(r2)
            int r2 = r7.f348141b
            r3 = 2131234066(0x7f080d12, float:1.8084287E38)
            if (r2 != r3) goto L_0x0a10
            r0.f348101h0 = r7
            r0.f348103i0 = r8
        L_0x0a10:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r7.f348140a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r3
            java.lang.String r3 = r7.f348146g
            r5 = 1
            r2[r5] = r3
            boolean r3 = r7.f348144e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8 = 2
            r2[r8] = r3
            boolean r3 = r7.f348145f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7 = 3
            r2[r7] = r3
            java.lang.String r3 = "set %d %s option menu enable %B, visible %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r3, r2)
            r2 = 1
            r3 = 0
            r5 = 0
            goto L_0x0034
        L_0x0a3d:
            r5 = 1
            r32.mo177068c(r33)
            return r5
        L_0x0a42:
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.util.LinkedList<com.tencent.mm.ui.MMActivityController$q> r3 = r0.f348062C
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r3
            java.lang.String r3 = "error, mActionBar is null or cache size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r3, r2)
            r32.mo177068c(r33)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMActivityController.mo177066a0(android.view.Menu):boolean");
    }

    /* renamed from: b0 */
    public boolean mo177067b0(int i, KeyEvent keyEvent) {
        C106742j1 j1Var;
        int i2 = C107046f.f320450a;
        if (!this.f348126z || (j1Var = this.f348060A) == null || !j1Var.mo153857l(i, keyEvent)) {
            return false;
        }
        Log.m105918d("MicroMsg.MMActivityController", "match search view on key down");
        if (this.f348076Q) {
            mo177081j0(mo177096t().getResources().getColor(C0966R.color.f3275lu));
            return true;
        }
        mo177081j0(mo177096t().getResources().getColor(C0966R.color.a7_));
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r0v1, types: [boolean, int] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo177068c(android.view.Menu r32) {
        /*
            r31 = this;
            r7 = r31
            r4 = r32
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r31.mo177019N()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.MMActivityController"
            java.lang.String r5 = "actionBarTitleCenter isActionbarMenuUseOriginalSys: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            boolean r1 = r31.mo177019N()
            r2 = 2131296506(0x7f0900fa, float:1.821093E38)
            r5 = 4
            r6 = 3
            r8 = 2
            r9 = 2131300655(0x7f09112f, float:1.8219346E38)
            java.lang.String r10 = "MicroMsg.ActionBarMenuViewHelper"
            if (r1 == 0) goto L_0x00bc
            com.tencent.mm.ui.tools.c r1 = r7.f348063D
            if (r1 == 0) goto L_0x006b
            androidx.appcompat.app.ActionBar r11 = r31.mo177037B()
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r3] = r11
            java.lang.String r13 = "resetStatus, actionBar is %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r12)
            r1.f319109c = r3
            nj3.e0 r1 = r1.f319110d
            java.util.List<android.view.MenuItem> r1 = r1.f224704d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            if (r11 != 0) goto L_0x004e
            java.lang.String r1 = "resetStatus, actionBar is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x006b
        L_0x004e:
            android.view.View r1 = r11.mo91099j()
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "resetStatus, customView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x006b
        L_0x005a:
            android.view.View r1 = r1.findViewById(r9)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L_0x0068
            java.lang.String r1 = "resetStatus, WXMenus is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x006b
        L_0x0068:
            r1.removeAllViews()
        L_0x006b:
            androidx.appcompat.app.ActionBar r9 = r31.mo177037B()
            boolean r10 = r31.mo177018M()
            android.view.View r11 = r9.mo91099j()
            if (r11 != 0) goto L_0x007b
            goto L_0x04fe
        L_0x007b:
            android.view.View r12 = r11.findViewById(r2)
            java.lang.String r1 = "MicroMsg.ActionBarCenterHelper"
            if (r12 != 0) goto L_0x008a
            java.lang.String r0 = "setActionTitleCenter, centerLayout is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            goto L_0x04fe
        L_0x008a:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            int r5 = r11.getMeasuredWidth()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r3] = r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            r2[r0] = r3
            r2[r8] = r11
            android.content.Context r0 = r11.getContext()
            r2[r6] = r0
            java.lang.String r0 = "setActionTitleCenter, customView measuredWidth outside is %s, isActionbarCenterLayoutMode is %s, customView: %s， context: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
            com.tencent.mm.ui.a r8 = new com.tencent.mm.ui.a
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r31
            r4 = r32
            r5 = r12
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.post(r8)
            goto L_0x04fe
        L_0x00bc:
            r31.mo177050I()
            com.tencent.mm.ui.tools.c r1 = r7.f348063D
            androidx.appcompat.app.AppCompatActivity r15 = r7.f348119s
            r1.f319109c = r3
            java.lang.String r11 = "on create options menu"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            if (r15 != 0) goto L_0x00d3
            java.lang.String r0 = "on create options menu, activity is null | mActionBar is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x00d3:
            if (r4 != 0) goto L_0x00dc
            java.lang.String r0 = "on create options menu, menu = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x00dc:
            com.tencent.mm.ui.widget.WXActionMenuView$a r11 = r1.f319108b
            boolean r11 = r11.f220472b
            if (r11 == 0) goto L_0x00e9
            java.lang.String r0 = "on create options menu, useOrginalSysMode."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x00e9:
            r11 = 0
            r14 = 0
        L_0x00eb:
            int r12 = r32.size()
            if (r11 >= r12) goto L_0x0103
            android.view.MenuItem r12 = r4.getItem(r11)
            if (r12 == 0) goto L_0x0100
            boolean r12 = r12.isVisible()
            if (r12 != 0) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            int r14 = r14 + 1
        L_0x0100:
            int r11 = r11 + 1
            goto L_0x00eb
        L_0x0103:
            com.tencent.mm.ui.widget.WXActionMenuView$a r11 = r1.f319108b
            r11.getClass()
            if (r14 < r5) goto L_0x011f
            com.tencent.mm.ui.widget.WXActionMenuView$a r11 = r1.f319108b
            boolean r11 = r11.f220471a
            if (r11 == 0) goto L_0x011f
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r3] = r1
            java.lang.String r1 = "on create options menu, menu is null visibleItemCount: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            goto L_0x04fe
        L_0x011f:
            androidx.appcompat.app.ActionBar r17 = r31.mo177037B()
            if (r17 != 0) goto L_0x012c
            java.lang.String r0 = "on create options menu, actionBar is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x012c:
            android.view.View r13 = r17.mo91099j()
            if (r13 != 0) goto L_0x0139
            java.lang.String r0 = "on create options menu, customView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x0139:
            android.view.View r9 = r13.findViewById(r9)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            if (r9 != 0) goto L_0x0148
            java.lang.String r0 = "on create options menu, WXMenus is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x0148:
            boolean r11 = r31.mo177020O()
            if (r11 != 0) goto L_0x015f
            nj3.e0 r11 = r1.f319110d
            java.util.List<android.view.MenuItem> r11 = r11.f224704d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.clear()
            r9.removeAllViews()
            java.lang.String r11 = "on create options menu, is no FromFragment."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
        L_0x015f:
            int r11 = r32.size()
            if (r11 > 0) goto L_0x016c
            java.lang.String r0 = "on create options menu, menu size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x016c:
            nj3.e0 r11 = r1.f319110d
            java.util.List<android.view.MenuItem> r11 = r11.f224704d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.clear()
            r9.removeAllViews()
            r1.f319109c = r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "on create options menu, menu = "
            r11.append(r12)
            int r12 = r32.size()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            r12 = 0
        L_0x0193:
            int r11 = r32.size()
            if (r12 >= r11) goto L_0x036f
            android.view.MenuItem r11 = r4.getItem(r12)
            if (r11 == 0) goto L_0x0357
            nj3.e0 r2 = r1.f319110d
            r2.mo107174t(r11)
            boolean r2 = r11.isVisible()
            if (r2 != 0) goto L_0x01b1
            java.lang.String r2 = "on create options menuItem is unenble."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            goto L_0x0357
        L_0x01b1:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r3] = r11
            com.tencent.mm.ui.tools.j1 r6 = r7.f348060A
            r2[r0] = r6
            java.lang.String r6 = "on create options menu, menuItem is %s, searchViewHelper: %s.,"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r2)
            int r2 = r11.getItemId()
            java.lang.String r6 = "MicroMsg.WXActionMenuView"
            r8 = 2131309154(0x7f093262, float:1.8236584E38)
            if (r2 != r8) goto L_0x02f6
            com.tencent.mm.ui.tools.j1 r2 = r7.f348060A
            if (r2 == 0) goto L_0x02f6
            com.tencent.mm.ui.widget.WXActionMenuView$a r2 = r1.f319108b
            com.tencent.mm.ui.tools.a r8 = new com.tencent.mm.ui.tools.a
            r8.<init>(r1)
            int r18 = com.tencent.p014mm.p136ui.widget.WXActionMenuView.f220458s
            java.lang.Class r5 = r11.getClass()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r3 = "mShowAsAction"
            java.lang.reflect.Field r3 = r5.getDeclaredField(r3)     // Catch:{ Exception -> 0x01ff }
            r3.setAccessible(r0)     // Catch:{ Exception -> 0x01ff }
            java.lang.Object r3 = r3.get(r11)     // Catch:{ Exception -> 0x01ff }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01ff }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r5 = "makeMMActionSearchMenuView : showAsAction: %s."
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x01fd }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x01fd }
            r19 = 0
            r4[r19] = r20     // Catch:{ Exception -> 0x01fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0201
        L_0x01fd:
            goto L_0x0201
        L_0x01ff:
            r3 = 2
        L_0x0201:
            com.tencent.mm.ui.tools.j1 r4 = r7.f348060A
            com.tencent.mm.ui.tools.j1$m r5 = r4.f319129q
            boolean r0 = r4.f319114b
            boolean r7 = r4.f319115c
            r21 = r12
            r22 = r13
            r12 = 4
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r12 = 0
            r13[r12] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r12 = 1
            r13[r12] = r4
            boolean r4 = r11.isActionViewExpanded()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r12 = 2
            r13[r12] = r4
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto L_0x022c
            r3 = 1
            goto L_0x022d
        L_0x022c:
            r3 = 0
        L_0x022d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r12 = 3
            r13[r12] = r3
            java.lang.String r3 = "adapterMenuShowAsAction, searchViewHelper: %s, isActionViewExpanded: %s, menuItem.isActionViewExpanded %s, showAsAction: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r13)
            if (r7 != 0) goto L_0x02b4
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r15)
            r6 = 0
            r7 = 2131492940(0x7f0c004c, float:1.8609346E38)
            android.view.View r3 = r3.inflate(r7, r6)
            r6 = 2131296472(0x7f0900d8, float:1.8210862E38)
            android.view.View r6 = r3.findViewById(r6)
            com.tencent.mm.ui.widget.WXActionMenuView r6 = (com.tencent.p014mm.p136ui.widget.WXActionMenuView) r6
            r6.mo104350a(r15, r11, r2, r8)
            com.tencent.mm.ui.widget.d r2 = new com.tencent.mm.ui.widget.d
            r7 = r11
            r11 = r2
            r12 = r0
            r0 = r22
            r13 = r5
            r5 = r14
            r14 = r8
            r8 = r15
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r6.setOnClickListener(r2)
            r2 = 2131309154(0x7f093262, float:1.8236584E38)
            r3.setTag(r2, r7)
            android.graphics.drawable.Drawable r2 = r7.getIcon()
            if (r2 != 0) goto L_0x0353
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r4)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/ui/widget/WXActionMenuView"
            java.lang.String r26 = "makeMMActionSearchMenuView"
            java.lang.String r27 = "(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/tencent/mm/ui/widget/WXActionMenuView$MenuCustomParam;Lcom/tencent/mm/ui/widget/WXActionMenuView$OnMenuItemClickListener;Lcom/tencent/mm/ui/MMActivityController;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r3
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r24 = "com/tencent/mm/ui/widget/WXActionMenuView"
            java.lang.String r25 = "makeMMActionSearchMenuView"
            java.lang.String r26 = "(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/tencent/mm/ui/widget/WXActionMenuView$MenuCustomParam;Lcom/tencent/mm/ui/widget/WXActionMenuView$OnMenuItemClickListener;Lcom/tencent/mm/ui/MMActivityController;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0353
        L_0x02b4:
            r7 = r11
            r5 = r14
            r8 = r15
            r0 = r22
            android.view.View r2 = r7.getActionView()
            if (r2 == 0) goto L_0x02f0
            java.lang.String r2 = "makeMMActionSearchMenuView, getActionView."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            android.view.View r2 = r7.getActionView()
            android.view.ViewParent r2 = r2.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x02e1
            android.view.View r2 = r7.getActionView()
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = r7.getActionView()
            r2.removeView(r3)
        L_0x02e1:
            android.view.View r2 = r7.getActionView()
            r3 = 2131309154(0x7f093262, float:1.8236584E38)
            r2.setTag(r3, r7)
            android.view.View r3 = r7.getActionView()
            goto L_0x0353
        L_0x02f0:
            android.view.View r3 = new android.view.View
            r3.<init>(r8)
            goto L_0x0353
        L_0x02f6:
            r7 = r11
            r21 = r12
            r0 = r13
            r5 = r14
            r8 = r15
            com.tencent.mm.ui.widget.WXActionMenuView$a r2 = r1.f319108b
            com.tencent.mm.ui.tools.b r3 = new com.tencent.mm.ui.tools.b
            r3.<init>(r1)
            int r4 = com.tencent.p014mm.p136ui.widget.WXActionMenuView.f220458s
            android.view.View r4 = r7.getActionView()
            if (r4 == 0) goto L_0x0332
            java.lang.String r2 = "makeMMActionMenuView : getActionView."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            android.view.View r2 = r7.getActionView()
            android.view.ViewParent r2 = r2.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x032d
            android.view.View r2 = r7.getActionView()
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = r7.getActionView()
            r2.removeView(r3)
        L_0x032d:
            android.view.View r3 = r7.getActionView()
            goto L_0x0353
        L_0x0332:
            java.lang.String r4 = "makeMMActionMenuView : icon."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r8)
            r6 = 0
            r11 = 2131492940(0x7f0c004c, float:1.8609346E38)
            android.view.View r4 = r4.inflate(r11, r6)
            r6 = 2131296472(0x7f0900d8, float:1.8210862E38)
            android.view.View r6 = r4.findViewById(r6)
            com.tencent.mm.ui.widget.WXActionMenuView r6 = (com.tencent.p014mm.p136ui.widget.WXActionMenuView) r6
            r6.mo104350a(r8, r7, r2, r3)
            r4.setTag(r7)
            r3 = r4
        L_0x0353:
            r9.addView(r3)
            goto L_0x035c
        L_0x0357:
            r21 = r12
            r0 = r13
            r5 = r14
            r8 = r15
        L_0x035c:
            int r12 = r21 + 1
            r7 = r31
            r4 = r32
            r13 = r0
            r14 = r5
            r15 = r8
            r0 = 1
            r2 = 2131296506(0x7f0900fa, float:1.821093E38)
            r3 = 0
            r5 = 4
            r6 = 3
            r8 = 2
            goto L_0x0193
        L_0x036f:
            r0 = r13
            r5 = r14
            r8 = r15
            int r2 = r9.getMeasuredWidth()
            r3 = 2131296530(0x7f090112, float:1.821098E38)
            android.view.View r3 = r0.findViewById(r3)
            android.content.res.Resources r0 = r0.getResources()
            r4 = 2131165983(0x7f07031f, float:1.7946199E38)
            float r0 = r0.getDimension(r4)
            int r0 = (int) r0
            if (r3 == 0) goto L_0x038f
            int r0 = r3.getMeasuredWidth()
        L_0x038f:
            int r3 = r1.f319112f
            if (r0 <= r3) goto L_0x0394
            goto L_0x0395
        L_0x0394:
            r0 = r3
        L_0x0395:
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r3[r6] = r4
            int r4 = r1.f319111e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            int r4 = r1.f319112f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 2
            r3[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r6 = 3
            r3[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6 = 4
            r3[r6] = r4
            java.lang.String r4 = "getAvailableWidth, padding is %s, maxPadding: %s, minPadding: %s, backWidth:%s, visibleItemCount:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r3)
            int r3 = r1.f319111e
            if (r3 != 0) goto L_0x03f1
            android.content.res.Resources r3 = r8.getResources()
            android.content.res.Resources r4 = r8.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            r6 = 2
            if (r4 != r6) goto L_0x03db
            r4 = 1
            goto L_0x03dc
        L_0x03db:
            r4 = 0
        L_0x03dc:
            if (r4 == 0) goto L_0x03e2
            r4 = 2131165255(0x7f070047, float:1.7944722E38)
            goto L_0x03e5
        L_0x03e2:
            r4 = 2131165256(0x7f070048, float:1.7944724E38)
        L_0x03e5:
            float r3 = r3.getDimension(r4)
            int r3 = (int) r3
            r1.f319107a = r3
            r4 = 3
            int r3 = r3 * 3
            r1.f319111e = r3
        L_0x03f1:
            int r3 = r1.f319111e
            if (r2 <= r3) goto L_0x03f9
            int r2 = r1.f319107a
            int r2 = r2 * r5
        L_0x03f9:
            int r3 = r1.f319112f
            if (r2 >= r3) goto L_0x03fe
            r2 = r3
        L_0x03fe:
            if (r0 <= r2) goto L_0x0401
            goto L_0x0402
        L_0x0401:
            r0 = r2
        L_0x0402:
            boolean r2 = r31.mo177020O()
            if (r2 == 0) goto L_0x0412
            java.lang.String r2 = "clearMenu, isFromFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r32.clear()
            goto L_0x04a1
        L_0x0412:
            androidx.fragment.app.FragmentManager r2 = r8.getSupportFragmentManager()
            java.util.List r2 = r2.getFragments()
            if (r2 == 0) goto L_0x0499
            int r3 = r2.size()
            if (r3 > 0) goto L_0x0424
            goto L_0x0499
        L_0x0424:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "clearMenu, fragments.size(): %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r4)
            r3 = 0
            r4 = 0
        L_0x0439:
            int r5 = r2.size()
            if (r3 >= r5) goto L_0x0484
            java.lang.Object r5 = r2.get(r3)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.p136ui.MMFragment
            if (r6 == 0) goto L_0x0481
            com.tencent.mm.ui.MMFragment r5 = (com.tencent.p014mm.p136ui.MMFragment) r5
            java.lang.Class r4 = r5.getClass()     // Catch:{ Exception -> 0x046d }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x046d }
            java.lang.Class r5 = r5.getClass()     // Catch:{ Exception -> 0x046d }
            java.lang.String r6 = "hasOptionsMenu"
            r7 = 0
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x046d }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ Exception -> 0x046d }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x046d }
            java.lang.Object r4 = r5.invoke(r4, r6)     // Catch:{ Exception -> 0x046d }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x046d }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x046d }
            goto L_0x046f
        L_0x046d:
            r4 = 0
        L_0x046f:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r7 = 0
            r6[r7] = r5
            java.lang.String r5 = "clearMenu, getHasOptionMenu: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r6)
            if (r4 == 0) goto L_0x0481
            goto L_0x0484
        L_0x0481:
            int r3 = r3 + 1
            goto L_0x0439
        L_0x0484:
            if (r4 != 0) goto L_0x0489
            r32.clear()
        L_0x0489:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "clearMenu, iFragment has size, noNeedClear: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r3)
            goto L_0x04a1
        L_0x0499:
            java.lang.String r2 = "clearMenu, iFragment no has size"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r32.clear()
        L_0x04a1:
            com.tencent.mm.ui.widget.WXActionMenuView$a r2 = r1.f319108b
            boolean r2 = r2.f220471a
            if (r2 != 0) goto L_0x04ad
            java.lang.String r0 = "checkTitleSize, no need TitleCenterMode."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x04ad:
            android.view.View r2 = r17.mo91099j()
            r3 = 2131296506(0x7f0900fa, float:1.821093E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.View r3 = r17.mo91099j()
            r4 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r2 != 0) goto L_0x04cd
            java.lang.String r0 = "checkTitleSize, centerLayout is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x04fe
        L_0x04cd:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "checkTitleSize, padding = %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r5)
            int r1 = r1.f319111e
            int r0 = java.lang.Math.min(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r1[r7] = r4
            java.lang.String r4 = "checkTitleSize, min padding = %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r1)
            r2.setPadding(r0, r7, r0, r7)
            if (r3 == 0) goto L_0x04fe
            int r0 = r3.getVisibility()
            r1 = 4
            if (r0 != r1) goto L_0x04fe
            r3.setVisibility(r7)
        L_0x04fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMActivityController.mo177068c(android.view.Menu):void");
    }

    /* renamed from: c0 */
    public abstract void mo177026c0();

    /* renamed from: d */
    public void mo177069d(boolean z) {
        String x = mo177032x();
        ((C119157j) C119157j.f356862d).mo183876g(new C116043p(z, x), "ActivateBroadcast-Thread");
    }

    /* renamed from: d0 */
    public boolean mo177070d0(MenuItem menuItem) {
        Log.m105926v("MicroMsg.MMActivityController", "on options item selected");
        if (!this.f348102i) {
            Log.m105928w("MicroMsg.MMActivityController", "onOptionsItemSelected screen not enable.");
            return true;
        }
        int itemId = menuItem.getItemId();
        C116044q qVar = this.f348061B;
        if (itemId != qVar.f348140a || !qVar.f348144e) {
            Iterator<C116044q> it = this.f348062C.iterator();
            while (it.hasNext()) {
                C116044q next = it.next();
                if (menuItem.getItemId() == next.f348140a) {
                    Log.m105919d("MicroMsg.MMActivityController", "on option menu %d click", Integer.valueOf(menuItem.getItemId()));
                    mo177080j(menuItem, next);
                    return true;
                }
            }
            return false;
        }
        mo177080j(menuItem, qVar);
        return true;
    }

    /* renamed from: e */
    public void mo177071e(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        mo177076h(i, i3, this.f348120t.getString(i2), false, onMenuItemClickListener, (View.OnLongClickListener) null, C73075r.NORMAL);
    }

    /* renamed from: e0 */
    public boolean mo177072e0(Menu menu) {
        C106742j1 j1Var;
        Log.m105918d("MicroMsg.MMActivityController", "on prepare option menu");
        if (!this.f348126z || (j1Var = this.f348060A) == null) {
            return true;
        }
        j1Var.mo153858m(this.f348119s, menu);
        return true;
    }

    /* renamed from: f */
    public void mo177073f(int i, String str, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        mo177076h(i, i2, str, false, onMenuItemClickListener, (View.OnLongClickListener) null, C73075r.NORMAL);
    }

    /* renamed from: f0 */
    public void mo177074f0() {
        mo177069d(true);
        this.f348093d0.alive();
        BroadcastEvent broadcastEvent = new BroadcastEvent();
        BroadcastEvent.C80706a aVar = broadcastEvent.f343529d;
        aVar.f236156a = 2;
        aVar.f236158c = this.f348089b0;
        broadcastEvent.publish();
        if (broadcastEvent.f343530e.f343535e == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            BroadcastEvent.C114669b bVar = broadcastEvent.f343530e;
            String str = bVar.f343538h;
            int i = bVar.f343539i;
            Log.m105925i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position[%d], noticeId[%s]", Integer.valueOf(i), str);
            if (i <= 0 || i == this.f348089b0) {
                BroadcastEvent.C114669b bVar2 = broadcastEvent.f343530e;
                mo177053K(bVar2.f343537g, bVar2.f343531a, bVar2.f343532b, bVar2.f343533c, str, i, true);
            } else {
                Log.m105925i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position not match[%d, %d] ignore display", Integer.valueOf(i), Integer.valueOf(this.f348089b0));
            }
            Log.m105926v("MicroMsg.INIT", "KEVIN MMActivity onResume initNotifyView:" + (System.currentTimeMillis() - currentTimeMillis));
        }
        if (C87974c.f254567a) {
            Context context = MMApplicationContext.getContext();
            if (context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_fontScaleTip", 0).getBoolean("font_scale_tip", true)) {
                return;
            }
            if (1.0f != C76577a.m92165p(MMApplicationContext.getContext())) {
                Context context2 = MMApplicationContext.getContext();
                context2.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip", true).apply();
            } else if (1.0f != MMApplicationContext.getContext().getResources().getConfiguration().fontScale) {
                C117407d.INSTANCE.mo160131h(15181, 1);
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107606r(mo177096t().getResources().getString(C0966R.string.f360819f11));
                qVar.mo107595g(mo177096t().getResources().getString(C0966R.string.f0y));
                qVar.mo107602n(mo177096t().getResources().getString(C0966R.string.f360818f10));
                qVar.mo107598j(mo177096t().getResources().getString(C0966R.string.f0z));
                qVar.mo107590b(new C6745o(this));
                qVar.mo107603o();
                Context context3 = MMApplicationContext.getContext();
                context3.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip", true).apply();
            }
        }
    }

    /* renamed from: g */
    public void mo177075g(int i, String str, Drawable drawable, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C73075r rVar = C73075r.NORMAL;
        C116044q qVar = new C116044q();
        qVar.f348140a = i;
        qVar.f348143d = drawable;
        qVar.f348146g = str;
        qVar.f348152m = onMenuItemClickListener;
        qVar.f348153n = null;
        qVar.f348150k = rVar;
        mo177079i0(i);
        this.f348062C.add(qVar);
        new MMHandler().postDelayed(new C116087l1(this), 200);
    }

    /* renamed from: g0 */
    public View mo177027g0() {
        return null;
    }

    /* renamed from: h */
    public final void mo177076h(int i, int i2, String str, boolean z, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener, C73075r rVar) {
        C116044q qVar = new C116044q();
        qVar.f348140a = i;
        qVar.f348141b = i2;
        qVar.f348146g = str;
        qVar.f348152m = onMenuItemClickListener;
        qVar.f348153n = onLongClickListener;
        qVar.f348150k = rVar;
        qVar.f348151l = z;
        if (i2 == C0966R.C0969drawable.agr || i2 == C0966R.raw.icons_outlined_more || i2 == C0966R.raw.actionbar_icon_dark_more || (i2 == C0966R.raw.icons_outlined_help && Util.isNullOrNil(str))) {
            qVar.f348146g = this.f348120t.getString(C0966R.string.a0h);
        }
        mo177079i0(qVar.f348140a);
        this.f348062C.add(qVar);
        mo177047G0();
    }

    /* renamed from: h0 */
    public boolean mo177077h0(int i) {
        for (int i2 = 0; i2 < this.f348062C.size(); i2++) {
            if (this.f348062C.get(i2).f348140a == i) {
                Log.m105919d("MicroMsg.MMActivityController", "match menu, id %d, remove it", Integer.valueOf(i));
                this.f348062C.remove(i2);
                mo177047G0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo177078i(boolean z, C106742j1 j1Var) {
        Log.m105926v("MicroMsg.MMActivityController", "add search menu");
        C116044q qVar = new C116044q();
        qVar.f348140a = C0966R.C0970id.gsl;
        qVar.f348146g = this.f348120t.getString(C0966R.string.a2p);
        qVar.f348141b = C0966R.raw.actionbar_icon_dark_search;
        qVar.f348152m = null;
        qVar.f348153n = null;
        mo177077h0(qVar.f348140a);
        this.f348062C.add(0, qVar);
        this.f348126z = z;
        this.f348060A = j1Var;
        j1Var.f319128p = this;
        mo177047G0();
    }

    /* renamed from: i0 */
    public final boolean mo177079i0(int i) {
        for (int i2 = 0; i2 < this.f348062C.size(); i2++) {
            if (this.f348062C.get(i2).f348140a == i) {
                Log.m105919d("MicroMsg.MMActivityController", "match menu, id %d, remove it", Integer.valueOf(i));
                this.f348062C.remove(i2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo177080j(MenuItem menuItem, C116044q qVar) {
        if (!this.f348102i) {
            Log.m105928w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
            return;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = qVar.f348152m;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: j0 */
    public void mo177081j0(int i) {
        if (this.f348065F != null) {
            this.f348073N = i;
            this.f348074O = true;
            this.f348076Q = C74933u4.m89770g(i);
            this.f348065F.mo91112w(new ColorDrawable(this.f348073N));
            mo177059O0(this.f348119s, this.f348073N);
            mo177049H0(this.f348076Q);
            mo177051I0();
            if (this.f348073N == this.f348120t.getResources().getColor(C0966R.color.al6)) {
                int i2 = this.f348073N;
                this.f348111m0 = i2;
                mo177103x0(i2);
            } else if (this.f348111m0 == 0) {
                mo177103x0(this.f348120t.getResources().getColor(C0966R.color.f2927a));
            }
        }
    }

    /* renamed from: k */
    public abstract void mo177028k(View view);

    /* renamed from: k0 */
    public void mo177082k0(int i) {
        this.f348075P = i;
        this.f348087a0 = true;
        WeImageView weImageView = this.f348069J;
        if (weImageView != null) {
            weImageView.setIconColor(i);
        }
        TextView textView = this.f348066G;
        if (textView != null && textView.getVisibility() == 0) {
            this.f348066G.setTextColor(i);
        }
        TextView textView2 = this.f348072M;
        if (textView2 != null && textView2.getVisibility() == 0) {
            this.f348072M.setTextColor(i);
        }
        WeImageView weImageView2 = this.f348077R;
        if (weImageView2 == null || weImageView2.getVisibility() != 0) {
            TextView textView3 = this.f348078S;
            if (textView3 != null && textView3.getVisibility() == 0) {
                this.f348078S.setTextColor(i);
                return;
            }
            return;
        }
        this.f348077R.setIconColor(i);
    }

    /* renamed from: l */
    public final void mo177083l(boolean z, int i, boolean z2) {
        boolean z3;
        if (z) {
            Iterator<C116044q> it = this.f348062C.iterator();
            z3 = false;
            while (it.hasNext()) {
                C116044q next = it.next();
                if (next.f348144e != z2) {
                    next.f348144e = z2;
                    z3 = true;
                }
            }
        } else {
            Iterator<C116044q> it4 = this.f348062C.iterator();
            z3 = false;
            while (it4.hasNext()) {
                C116044q next2 = it4.next();
                if (next2.f348140a == i && next2.f348144e != z2) {
                    next2.f348144e = z2;
                    z3 = true;
                }
            }
        }
        C106742j1 j1Var = this.f348060A;
        boolean z4 = j1Var == null ? false : j1Var.f319115c;
        if (!z4) {
            mo177047G0();
        }
        Log.m105927v("MicroMsg.MMActivityController", "enable option menu, target id %d, changed %B, searching %B", Integer.valueOf(i), Boolean.valueOf(z3), Boolean.valueOf(z4));
    }

    /* renamed from: l0 */
    public void mo177084l0(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (!mo177024X()) {
            if (!z) {
                int i2 = this.f348081V;
                if (i > i2) {
                    i = i2;
                }
                int i3 = this.f348082W;
                if (i < i3) {
                    i = i3;
                }
            }
            this.f348113n0 = i;
            View findViewById = this.f348119s.getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do);
            this.actionbarView = findViewById;
            if (findViewById != null) {
                this.f348080U = findViewById.getLayoutParams();
            }
            View view = this.actionbarView;
            if (view != null && (layoutParams = this.f348080U) != null) {
                layoutParams.height = view.getPaddingTop() + i + this.actionbarView.getPaddingBottom();
                this.actionbarView.setLayoutParams(this.f348080U);
                View findViewById2 = this.actionbarView.findViewById(C0966R.C0970id.f5380dl);
                if (findViewById2 != null && (findViewById2 instanceof Toolbar)) {
                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i;
                    }
                    findViewById2.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    /* renamed from: m0 */
    public void mo177085m0(MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i) {
        ActionBar actionBar = this.f348065F;
        if (actionBar != null) {
            if (onMenuItemClickListener == null) {
                actionBar.mo91084B(false);
            } else {
                actionBar.mo91084B(false);
                View view = this.f348068I;
                if (view != null) {
                    view.setOnClickListener(new C106632h(this, onMenuItemClickListener));
                }
            }
            if (i == 0 && this.f348069J.getDrawable() == null) {
                i = C0966R.raw.actionbar_icon_dark_back;
            }
            if (!(this.f348069J == null || i == 0)) {
                this.f348068I.setTag(C0966R.C0970id.ke7, Integer.valueOf(i));
                this.f348069J.setImageResource(i);
            }
            C116044q qVar = this.f348061B;
            qVar.f348140a = 16908332;
            qVar.f348152m = onMenuItemClickListener;
        }
    }

    /* renamed from: n */
    public View mo177086n(int i) {
        View findViewById = this.f348092d.findViewById(i);
        return findViewById != null ? findViewById : this.f348119s.findViewById(i);
    }

    /* renamed from: n0 */
    public void mo177087n0(int i) {
        View view = this.f348092d;
        if (view != null) {
            if (this.f348098g == null) {
                this.f348098g = (FrameLayout) view.findViewById(C0966R.C0970id.f358753gv2);
            }
            this.f348098g.setBackgroundResource(i);
            this.f348088b.setBackgroundResource(i);
        }
    }

    /* renamed from: o */
    public abstract boolean mo177029o();

    /* renamed from: o0 */
    public void mo177088o0(int i) {
        if (this.f348098g == null) {
            this.f348098g = (FrameLayout) this.f348092d.findViewById(C0966R.C0970id.f358753gv2);
        }
        View view = this.f348094e;
        if (view != null) {
            this.f348098g.removeView(view);
        }
        this.f348098g.removeView(this.f348088b);
        View inflate = ((LayoutInflater) this.f348120t.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
        this.f348088b = inflate;
        this.f348098g.addView(inflate, 0, new FrameLayout.LayoutParams(-1, -1));
        if (this.f348094e != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f348120t, 47.0f));
            FrameLayout frameLayout = this.f348098g;
            frameLayout.addView(this.f348094e, frameLayout.getChildCount(), layoutParams);
        }
        this.f348098g.invalidate();
    }

    /* renamed from: p */
    public void mo177089p(boolean z) {
        if (z) {
            ActionBar actionBar = this.f348065F;
            if (actionBar != null) {
                actionBar.mo91104o();
            }
            this.f348124x.removeCallbacks(this.f348107k0);
            this.f348124x.removeCallbacks(this.f348105j0);
            this.f348124x.postDelayed(this.f348105j0, 256);
            return;
        }
        this.f348119s.getWindow().clearFlags(1024);
        this.f348124x.removeCallbacks(this.f348105j0);
        this.f348124x.removeCallbacks(this.f348107k0);
        this.f348124x.postDelayed(this.f348107k0, 256);
    }

    /* renamed from: p0 */
    public final void mo177090p0(WeImageView weImageView, int i, PorterDuff.Mode mode) {
        if (this.f348087a0) {
            weImageView.setIconColor(i);
            return;
        }
        weImageView.setClearColorFilter(true);
        weImageView.clearColorFilter();
    }

    /* renamed from: q */
    public int mo177091q() {
        if (!this.f348074O) {
            int color = this.f348120t.getResources().getColor(C0966R.color.a7_);
            this.f348073N = color;
            this.f348076Q = C74933u4.m89770g(color);
        }
        return this.f348073N;
    }

    /* renamed from: q0 */
    public void mo177092q0(String str, Runnable runnable) {
        TextView textView;
        if (this.f348065F != null && (textView = this.f348070K) != null) {
            textView.setVisibility(0);
            this.f348070K.setText(str);
            this.f348070K.setOnClickListener(new C6741g(this, runnable));
        }
    }

    /* renamed from: r */
    public abstract String mo177030r();

    /* renamed from: r0 */
    public void mo177093r0(String str, Animation animation) {
        ActionBar actionBar = this.f348065F;
        if (actionBar != null) {
            actionBar.mo91113x(C0966R.C0971layout.f6314bf);
            TextView textView = (TextView) this.f348065F.mo91099j().findViewById(C0966R.C0970id.f5387ds);
            if (textView != null) {
                textView.clearAnimation();
                if (animation != null) {
                    textView.startAnimation(animation);
                }
                if (!Util.isNullOrNil(str)) {
                    textView.setText(str);
                }
            }
        }
    }

    /* renamed from: s */
    public View mo177094s() {
        return this.f348092d;
    }

    /* renamed from: s0 */
    public void mo177095s0(int i) {
        if (this.f348065F != null) {
            this.f348072M.setText(this.f348120t.getString(i));
            if (C76577a.m92147C(mo177096t())) {
                this.f348072M.setTextSize(1, 14.0f);
                this.f348066G.setTextSize(1, 18.0f);
            }
            this.f348072M.setVisibility(0);
            mo177054K0(this.f348120t.getString(i));
        }
    }

    /* renamed from: t */
    public AppCompatActivity mo177096t() {
        return this.f348119s;
    }

    /* renamed from: t0 */
    public void mo177097t0(String str) {
        if (this.f348065F != null) {
            if (str == null) {
                this.f348072M.setVisibility(8);
                return;
            }
            this.f348072M.setText(str);
            if (C76577a.m92147C(mo177096t())) {
                this.f348072M.setTextSize(1, 14.0f);
                this.f348066G.setTextSize(1, 18.0f);
            }
            this.f348072M.setVisibility(0);
            mo177054K0(str);
        }
    }

    /* renamed from: u */
    public abstract int mo177031u();

    /* renamed from: u0 */
    public void mo177098u0(CharSequence charSequence) {
        if (this.f348065F != null) {
            this.f348104j = charSequence.toString();
            this.f348066G.setText(charSequence);
            if (C44706b.m49450a()) {
                C44706b.m49451b(this.f348066G, C0966R.dimen.f3619c);
            } else if (C76577a.m92147C(mo177096t())) {
                this.f348066G.setTextSize(0, ((float) C76577a.m92155f(mo177096t(), C0966R.dimen.f3619c)) * C76577a.m92161l(mo177096t()));
            }
            mo177054K0(charSequence.toString());
        }
    }

    /* renamed from: v */
    public final C76003c mo177099v(int i, int i2) {
        Drawable drawable = this.f348120t.getResources().getDrawable(i2);
        if (this.f348076Q) {
            drawable = C74933u4.m89768e(mo177096t(), i2, -1);
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        C76003c cVar = new C76003c(drawable, 1);
        int intrinsicHeight = (drawable.getIntrinsicHeight() - i) / 2;
        return cVar;
    }

    /* renamed from: v0 */
    public void mo177100v0(String str) {
        if (this.f348065F != null) {
            this.f348104j = str;
            if (C44706b.m49450a()) {
                C44706b.m49451b(this.f348066G, C0966R.dimen.f3619c);
            } else if (C76577a.m92147C(mo177096t())) {
                this.f348066G.setTextSize(0, ((float) C76577a.m92155f(mo177096t(), C0966R.dimen.f3619c)) * C76577a.m92161l(mo177096t()));
            }
            mo177061P0();
            mo177054K0(str);
        }
    }

    /* renamed from: w */
    public int mo177101w() {
        return -1;
    }

    /* renamed from: w0 */
    public void mo177102w0(int i) {
        this.f348066G.setVisibility(i);
    }

    /* renamed from: x */
    public abstract String mo177032x();

    /* renamed from: x0 */
    public void mo177103x0(int i) {
        if (Build.VERSION.SDK_INT >= 26 && !m163190m()) {
            this.f348119s.getWindow().setNavigationBarColor(i);
            boolean g = C74933u4.m89770g(i);
            View decorView = this.f348119s.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(g ? systemUiVisibility & -17 : systemUiVisibility | 16);
            this.f348111m0 = i;
            if (mo177031u() == -1 && this.f348121u != null && !mo177020O()) {
                this.f348121u.setEnd2StartBgColorByNavigationBar(i);
            }
        }
    }

    /* renamed from: y */
    public abstract int mo177033y();

    /* renamed from: y0 */
    public void mo177104y0(boolean z) {
        View view;
        this.f348102i = z;
        if (this.f348086a == null && (view = this.f348092d) != null) {
            this.f348086a = view.findViewById(C0966R.C0970id.gvm);
        }
        View view2 = this.f348086a;
        if (view2 == null) {
            Log.m105920e("MicroMsg.MMActivityController", "jacks error npe translayer !");
            return;
        }
        view2.setFocusable(!z);
        this.f348086a.setFocusableInTouchMode(!z);
        if (!z) {
            AppCompatActivity t = mo177096t();
            synchronized (f348059r0) {
                if (f348058q0 == null) {
                    f348058q0 = ((PowerManager) t.getSystemService("power")).newWakeLock(32, "screen Lock");
                }
                if (!f348058q0.isHeld()) {
                    PowerManager.WakeLock wakeLock = f348058q0;
                    C117292a.m165357c(wakeLock, "com/tencent/mm/ui/MMActivityController", "acquireWakeLock", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    wakeLock.acquire();
                    C117292a.m165359e(wakeLock, "com/tencent/mm/ui/MMActivityController", "acquireWakeLock", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    Log.m105925i("MicroMsg.MMActivityController", "after acquire screen off wakelock from object: %s, isHeld: %s", toString(), Boolean.valueOf(f348058q0.isHeld()));
                } else {
                    Log.m105929w("MicroMsg.MMActivityController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", toString());
                }
            }
            return;
        }
        synchronized (f348059r0) {
            PowerManager.WakeLock wakeLock2 = f348058q0;
            if (wakeLock2 == null || !wakeLock2.isHeld()) {
                Log.m105929w("MicroMsg.MMActivityController", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
            } else {
                PowerManager.WakeLock wakeLock3 = f348058q0;
                C117292a.m165357c(wakeLock3, "com/tencent/mm/ui/MMActivityController", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock3.release();
                C117292a.m165359e(wakeLock3, "com/tencent/mm/ui/MMActivityController", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                Log.m105925i("MicroMsg.MMActivityController", "after release screen off wakelock from object: %s, isHeld: %s", toString(), Boolean.valueOf(f348058q0.isHeld()));
                f348058q0 = null;
            }
        }
    }

    /* renamed from: z */
    public abstract View mo177034z();

    /* renamed from: z0 */
    public void mo177105z0(int i) {
        mo177059O0(this.f348119s, i);
        mo177049H0(C74933u4.m89770g(i));
    }
}
