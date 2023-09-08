package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C103445c;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C103527f;
import androidx.appcompat.widget.C103551m0;
import androidx.appcompat.widget.C103552n;
import androidx.appcompat.widget.C103553n0;
import androidx.appcompat.widget.ContentFrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import p1115h.C107922a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107175c0;
import p849e3.C107207u;
import p918s2.C90115d;
import p990k.C108781a;
import p990k.C108785e;
import p990k.C108791h;
import p990k.C88046c;

public class AppCompatDelegateImpl extends C103415g implements C103448e.C103449a, LayoutInflater.Factory2 {

    /* renamed from: X */
    public static final int[] f304988X = {16842836};

    /* renamed from: A */
    public boolean f304989A;

    /* renamed from: B */
    public boolean f304990B;

    /* renamed from: C */
    public boolean f304991C;

    /* renamed from: D */
    public boolean f304992D;

    /* renamed from: E */
    public boolean f304993E;

    /* renamed from: F */
    public boolean f304994F;

    /* renamed from: G */
    public boolean f304995G;

    /* renamed from: H */
    public boolean f304996H;

    /* renamed from: I */
    public PanelFeatureState[] f304997I;

    /* renamed from: J */
    public PanelFeatureState f304998J;

    /* renamed from: K */
    public boolean f304999K;

    /* renamed from: L */
    public boolean f305000L;

    /* renamed from: M */
    public int f305001M = -100;

    /* renamed from: N */
    public boolean f305002N;

    /* renamed from: P */
    public C103405f f305003P;

    /* renamed from: Q */
    public boolean f305004Q;

    /* renamed from: R */
    public int f305005R;

    /* renamed from: S */
    public final Runnable f305006S = new C103399a();

    /* renamed from: T */
    public boolean f305007T;

    /* renamed from: U */
    public Rect f305008U;

    /* renamed from: V */
    public Rect f305009V;

    /* renamed from: W */
    public AppCompatViewInflater f305010W;

    /* renamed from: d */
    public final Context f305011d;

    /* renamed from: e */
    public final Window f305012e;

    /* renamed from: f */
    public final Window.Callback f305013f;

    /* renamed from: g */
    public final Window.Callback f305014g;

    /* renamed from: h */
    public final C103414f f305015h;

    /* renamed from: i */
    public ActionBar f305016i;

    /* renamed from: j */
    public MenuInflater f305017j;

    /* renamed from: n */
    public CharSequence f305018n;

    /* renamed from: o */
    public C103552n f305019o;

    /* renamed from: p */
    public C103401c f305020p;

    /* renamed from: q */
    public C103407h f305021q;

    /* renamed from: r */
    public C108781a f305022r;

    /* renamed from: s */
    public ActionBarContextView f305023s;

    /* renamed from: t */
    public PopupWindow f305024t;

    /* renamed from: u */
    public Runnable f305025u;

    /* renamed from: v */
    public C107168a0 f305026v = null;

    /* renamed from: w */
    public boolean f305027w;

    /* renamed from: x */
    public ViewGroup f305028x;

    /* renamed from: y */
    public TextView f305029y;

    /* renamed from: z */
    public View f305030z;

    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f305031a;

        /* renamed from: b */
        public int f305032b;

        /* renamed from: c */
        public int f305033c;

        /* renamed from: d */
        public int f305034d;

        /* renamed from: e */
        public ViewGroup f305035e;

        /* renamed from: f */
        public View f305036f;

        /* renamed from: g */
        public View f305037g;

        /* renamed from: h */
        public C103448e f305038h;

        /* renamed from: i */
        public C103445c f305039i;

        /* renamed from: j */
        public Context f305040j;

        /* renamed from: k */
        public boolean f305041k;

        /* renamed from: l */
        public boolean f305042l;

        /* renamed from: m */
        public boolean f305043m;

        /* renamed from: n */
        public boolean f305044n = false;

        /* renamed from: o */
        public boolean f305045o;

        /* renamed from: p */
        public Bundle f305046p;

        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C103398a();

            /* renamed from: d */
            public int f305047d;

            /* renamed from: e */
            public boolean f305048e;

            /* renamed from: f */
            public Bundle f305049f;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            public static class C103398a implements Parcelable.ClassLoaderCreator<SavedState> {
                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m137150a(parcel, classLoader);
                }

                public Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public Object createFromParcel(Parcel parcel) {
                    return SavedState.m137150a(parcel, (ClassLoader) null);
                }
            }

            /* renamed from: a */
            public static SavedState m137150a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f305047d = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f305048e = z;
                if (z) {
                    savedState.f305049f = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f305047d);
                parcel.writeInt(this.f305048e ? 1 : 0);
                if (this.f305048e) {
                    parcel.writeBundle(this.f305049f);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f305031a = i;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class C103399a implements Runnable {
        public C103399a() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f305005R & 1) != 0) {
                appCompatDelegateImpl.mo143396n(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f305005R & 4096) != 0) {
                appCompatDelegateImpl2.mo143396n(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f305004Q = false;
            appCompatDelegateImpl3.f305005R = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C103400b implements C103408a {
        public C103400b(AppCompatDelegateImpl appCompatDelegateImpl) {
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public final class C103401c implements C103456i.C103457a {
        public C103401c() {
        }

        /* renamed from: a */
        public void mo143414a(C103448e eVar, boolean z) {
            AppCompatDelegateImpl.this.mo143393k(eVar);
        }

        /* renamed from: d */
        public boolean mo143415d(C103448e eVar) {
            Window.Callback r = AppCompatDelegateImpl.this.mo143402r();
            if (r == null) {
                return true;
            }
            r.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public class C103402d implements C108781a.C108782a {

        /* renamed from: a */
        public C108781a.C108782a f305052a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        public class C103403a extends C107175c0 {
            public C103403a() {
            }

            /* renamed from: a */
            public void mo143420a(View view) {
                AppCompatDelegateImpl.this.f305023s.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f305024t;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f305023s.getParent() instanceof View) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107212f.m145215c((View) AppCompatDelegateImpl.this.f305023s.getParent());
                }
                AppCompatDelegateImpl.this.f305023s.removeAllViews();
                AppCompatDelegateImpl.this.f305026v.mo157608d((C107173b0) null);
                AppCompatDelegateImpl.this.f305026v = null;
            }
        }

        public C103402d(C108781a.C108782a aVar) {
            this.f305052a = aVar;
        }

        /* renamed from: a */
        public boolean mo143416a(C108781a aVar, MenuItem menuItem) {
            return this.f305052a.mo143416a(aVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo143417b(C108781a aVar, Menu menu) {
            return this.f305052a.mo143417b(aVar, menu);
        }

        /* renamed from: c */
        public boolean mo143418c(C108781a aVar, Menu menu) {
            return this.f305052a.mo143418c(aVar, menu);
        }

        /* renamed from: d */
        public void mo143419d(C108781a aVar) {
            this.f305052a.mo143419d(aVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f305024t != null) {
                appCompatDelegateImpl.f305012e.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f305025u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f305023s != null) {
                C107168a0 a0Var = appCompatDelegateImpl2.f305026v;
                if (a0Var != null) {
                    a0Var.mo157606b();
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                C107168a0 a = C107207u.m145160a(appCompatDelegateImpl3.f305023s);
                a.mo157605a(0.0f);
                appCompatDelegateImpl3.f305026v = a;
                AppCompatDelegateImpl.this.f305026v.mo157608d(new C103403a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C103414f fVar = appCompatDelegateImpl4.f305015h;
            if (fVar != null) {
                fVar.onSupportActionModeFinished(appCompatDelegateImpl4.f305022r);
            }
            AppCompatDelegateImpl.this.f305022r = null;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public final class C103405f {

        /* renamed from: a */
        public C112852q f305056a;

        /* renamed from: b */
        public boolean f305057b;

        /* renamed from: c */
        public BroadcastReceiver f305058c;

        /* renamed from: d */
        public IntentFilter f305059d;

        public C103405f(C112852q qVar) {
            this.f305056a = qVar;
            this.f305057b = qVar.mo164690a();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public class C103406g extends ContentFrameLayout {
        public C103406g(Context context) {
            super(context, (AttributeSet) null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo143395m(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.mo143394l(appCompatDelegateImpl.mo143401q(0, true), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C107922a.m146228b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public final class C103407h implements C103456i.C103457a {
        public C103407h() {
        }

        /* renamed from: a */
        public void mo143414a(C103448e eVar, boolean z) {
            PanelFeatureState panelFeatureState;
            C103448e k = eVar.mo143606k();
            int i = 0;
            boolean z2 = k != eVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                eVar = k;
            }
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.f304997I;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.f305038h == eVar) {
                        break;
                    }
                    i++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo143392j(panelFeatureState.f305031a, panelFeatureState, k);
                AppCompatDelegateImpl.this.mo143394l(panelFeatureState, true);
                return;
            }
            AppCompatDelegateImpl.this.mo143394l(panelFeatureState, z);
        }

        /* renamed from: d */
        public boolean mo143415d(C103448e eVar) {
            Window.Callback r;
            if (eVar != null) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f304991C || (r = appCompatDelegateImpl.mo143402r()) == null || AppCompatDelegateImpl.this.f305000L) {
                return true;
            }
            r.onMenuOpened(108, eVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, C103414f fVar) {
        int resourceId;
        Drawable drawable = null;
        this.f305011d = context;
        this.f305012e = window;
        this.f305015h = fVar;
        Window.Callback callback = window.getCallback();
        this.f305013f = callback;
        if (!(callback instanceof C103404e)) {
            C103404e eVar = new C103404e(callback);
            this.f305014g = eVar;
            window.setCallback(eVar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f304988X);
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable = C103527f.m137545g().mo144329i(context, resourceId, true);
            }
            if (drawable != null) {
                window.setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if ((r4.getActivityInfo(new android.content.ComponentName(r10, r10.getClass()), 0).configChanges & 512) == 0) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0116  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143383a() {
        /*
            r12 = this;
            int r0 = r12.f305001M
            r1 = -1
            r2 = -100
            if (r0 == r2) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r0 = -1
        L_0x0009:
            r3 = 23
            r4 = 2
            r5 = 1
            if (r0 == r2) goto L_0x003b
            if (r0 == 0) goto L_0x0013
            r2 = r0
            goto L_0x003c
        L_0x0013:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x0028
            android.content.Context r2 = r12.f305011d
            java.lang.Class<android.app.UiModeManager> r6 = android.app.UiModeManager.class
            java.lang.Object r2 = r2.getSystemService(r6)
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2
            int r2 = r2.getNightMode()
            if (r2 != 0) goto L_0x0028
            goto L_0x003b
        L_0x0028:
            r12.mo143397o()
            androidx.appcompat.app.AppCompatDelegateImpl$f r2 = r12.f305003P
            androidx.appcompat.app.q r6 = r2.f305056a
            boolean r6 = r6.mo164690a()
            r2.f305057b = r6
            if (r6 == 0) goto L_0x0039
            r2 = 2
            goto L_0x003c
        L_0x0039:
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = -1
        L_0x003c:
            r6 = 0
            r7 = 0
            if (r2 == r1) goto L_0x013e
            android.content.Context r1 = r12.f305011d
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r8 = r1.getConfiguration()
            int r9 = r8.uiMode
            r9 = r9 & 48
            if (r2 != r4) goto L_0x0053
            r2 = 32
            goto L_0x0055
        L_0x0053:
            r2 = 16
        L_0x0055:
            if (r9 == r2) goto L_0x013e
            boolean r4 = r12.f305002N
            if (r4 == 0) goto L_0x007d
            android.content.Context r4 = r12.f305011d
            boolean r9 = r4 instanceof android.app.Activity
            if (r9 == 0) goto L_0x007d
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x007b }
            android.content.Context r10 = r12.f305011d     // Catch:{ NameNotFoundException -> 0x007b }
            java.lang.Class r11 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x007b }
            r9.<init>(r10, r11)     // Catch:{ NameNotFoundException -> 0x007b }
            android.content.pm.ActivityInfo r4 = r4.getActivityInfo(r9, r6)     // Catch:{ NameNotFoundException -> 0x007b }
            int r4 = r4.configChanges     // Catch:{ NameNotFoundException -> 0x007b }
            r4 = r4 & 512(0x200, float:7.175E-43)
            if (r4 != 0) goto L_0x007d
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            r6 = 1
        L_0x007d:
            if (r6 == 0) goto L_0x0088
            android.content.Context r1 = r12.f305011d
            android.app.Activity r1 = (android.app.Activity) r1
            r1.recreate()
            goto L_0x013d
        L_0x0088:
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>(r8)
            android.util.DisplayMetrics r6 = r1.getDisplayMetrics()
            int r8 = r4.uiMode
            r8 = r8 & -49
            r2 = r2 | r8
            r4.uiMode = r2
            r1.updateConfiguration(r4, r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 >= r4) goto L_0x013d
            r4 = 28
            if (r2 < r4) goto L_0x00a7
            goto L_0x013d
        L_0x00a7:
            r4 = 24
            java.lang.String r6 = "mDrawableCache"
            if (r2 < r4) goto L_0x00f5
            boolean r2 = androidx.appcompat.app.C103424n.f305089h
            if (r2 != 0) goto L_0x00c0
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mResourcesImpl"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x00be }
            androidx.appcompat.app.C103424n.f305088g = r2     // Catch:{ NoSuchFieldException -> 0x00be }
            r2.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x00be }
        L_0x00be:
            androidx.appcompat.app.C103424n.f305089h = r5
        L_0x00c0:
            java.lang.reflect.Field r2 = androidx.appcompat.app.C103424n.f305088g
            if (r2 != 0) goto L_0x00c6
            goto L_0x013d
        L_0x00c6:
            java.lang.Object r1 = r2.get(r1)     // Catch:{ IllegalAccessException -> 0x00cb }
            goto L_0x00cd
        L_0x00cb:
            r1 = r7
        L_0x00cd:
            if (r1 != 0) goto L_0x00d1
            goto L_0x013d
        L_0x00d1:
            boolean r2 = androidx.appcompat.app.C103424n.f305083b
            if (r2 != 0) goto L_0x00e4
            java.lang.Class r2 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x00e2 }
            java.lang.reflect.Field r2 = r2.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x00e2 }
            androidx.appcompat.app.C103424n.f305082a = r2     // Catch:{ NoSuchFieldException -> 0x00e2 }
            r2.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x00e2 }
        L_0x00e2:
            androidx.appcompat.app.C103424n.f305083b = r5
        L_0x00e4:
            java.lang.reflect.Field r2 = androidx.appcompat.app.C103424n.f305082a
            if (r2 == 0) goto L_0x00ee
            java.lang.Object r1 = r2.get(r1)     // Catch:{ IllegalAccessException -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
        L_0x00ee:
            r1 = r7
        L_0x00ef:
            if (r1 == 0) goto L_0x013d
            androidx.appcompat.app.C103424n.m137177a(r1)
            goto L_0x013d
        L_0x00f5:
            if (r2 < r3) goto L_0x011a
            boolean r2 = androidx.appcompat.app.C103424n.f305083b
            if (r2 != 0) goto L_0x0108
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0106 }
            androidx.appcompat.app.C103424n.f305082a = r2     // Catch:{ NoSuchFieldException -> 0x0106 }
            r2.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x0106 }
        L_0x0106:
            androidx.appcompat.app.C103424n.f305083b = r5
        L_0x0108:
            java.lang.reflect.Field r2 = androidx.appcompat.app.C103424n.f305082a
            if (r2 == 0) goto L_0x0112
            java.lang.Object r1 = r2.get(r1)     // Catch:{ IllegalAccessException -> 0x0111 }
            goto L_0x0113
        L_0x0111:
        L_0x0112:
            r1 = r7
        L_0x0113:
            if (r1 != 0) goto L_0x0116
            goto L_0x013d
        L_0x0116:
            androidx.appcompat.app.C103424n.m137177a(r1)
            goto L_0x013d
        L_0x011a:
            boolean r2 = androidx.appcompat.app.C103424n.f305083b
            if (r2 != 0) goto L_0x012b
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0129 }
            androidx.appcompat.app.C103424n.f305082a = r2     // Catch:{ NoSuchFieldException -> 0x0129 }
            r2.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x0129 }
        L_0x0129:
            androidx.appcompat.app.C103424n.f305083b = r5
        L_0x012b:
            java.lang.reflect.Field r2 = androidx.appcompat.app.C103424n.f305082a
            if (r2 == 0) goto L_0x013d
            java.lang.Object r1 = r2.get(r1)     // Catch:{ IllegalAccessException -> 0x0136 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ IllegalAccessException -> 0x0136 }
            goto L_0x0138
        L_0x0136:
            r1 = r7
        L_0x0138:
            if (r1 == 0) goto L_0x013d
            r1.clear()
        L_0x013d:
            r6 = 1
        L_0x013e:
            if (r0 != 0) goto L_0x0186
            r12.mo143397o()
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = r12.f305003P
            android.content.BroadcastReceiver r1 = r0.f305058c
            if (r1 == 0) goto L_0x0152
            androidx.appcompat.app.AppCompatDelegateImpl r2 = androidx.appcompat.app.AppCompatDelegateImpl.this
            android.content.Context r2 = r2.f305011d
            r2.unregisterReceiver(r1)
            r0.f305058c = r7
        L_0x0152:
            android.content.BroadcastReceiver r1 = r0.f305058c
            if (r1 != 0) goto L_0x015d
            androidx.appcompat.app.l r1 = new androidx.appcompat.app.l
            r1.<init>(r0)
            r0.f305058c = r1
        L_0x015d:
            android.content.IntentFilter r1 = r0.f305059d
            if (r1 != 0) goto L_0x017b
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            r0.f305059d = r1
            java.lang.String r2 = "android.intent.action.TIME_SET"
            r1.addAction(r2)
            android.content.IntentFilter r1 = r0.f305059d
            java.lang.String r2 = "android.intent.action.TIMEZONE_CHANGED"
            r1.addAction(r2)
            android.content.IntentFilter r1 = r0.f305059d
            java.lang.String r2 = "android.intent.action.TIME_TICK"
            r1.addAction(r2)
        L_0x017b:
            androidx.appcompat.app.AppCompatDelegateImpl r1 = androidx.appcompat.app.AppCompatDelegateImpl.this
            android.content.Context r1 = r1.f305011d
            android.content.BroadcastReceiver r2 = r0.f305058c
            android.content.IntentFilter r0 = r0.f305059d
            r1.registerReceiver(r2, r0)
        L_0x0186:
            r12.f305002N = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo143383a():boolean");
    }

    /* renamed from: b */
    public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback r = mo143402r();
        if (r != null && !this.f305000L) {
            C103448e k = eVar.mo143606k();
            PanelFeatureState[] panelFeatureStateArr = this.f304997I;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.f305038h == k) {
                        break;
                    }
                    i++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return r.onMenuItemSelected(panelFeatureState.f305031a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo143385c(C103448e eVar) {
        C103552n nVar = this.f305019o;
        if (nVar == null || !nVar.mo143757d() || (ViewConfiguration.get(this.f305011d).hasPermanentMenuKey() && !this.f305019o.mo143755c())) {
            PanelFeatureState q = mo143401q(0, true);
            q.f305044n = true;
            mo143394l(q, false);
            mo143404t(q, (KeyEvent) null);
            return;
        }
        Window.Callback r = mo143402r();
        if (this.f305019o.mo143760f()) {
            this.f305019o.mo143753a();
            if (!this.f305000L) {
                r.onPanelClosed(108, mo143401q(0, true).f305038h);
            }
        } else if (r != null && !this.f305000L) {
            if (this.f305004Q && (this.f305005R & 1) != 0) {
                this.f305012e.getDecorView().removeCallbacks(this.f305006S);
                ((C103399a) this.f305006S).run();
            }
            PanelFeatureState q2 = mo143401q(0, true);
            C103448e eVar2 = q2.f305038h;
            if (eVar2 != null && !q2.f305045o && r.onPreparePanel(0, q2.f305037g, eVar2)) {
                r.onMenuOpened(108, q2.f305038h);
                this.f305019o.mo143759e();
            }
        }
    }

    /* renamed from: d */
    public void mo143386d() {
        mo143403s();
        ActionBar actionBar = this.f305016i;
        if (actionBar == null || !actionBar.mo91105p()) {
            this.f305005R |= 1;
            if (!this.f305004Q) {
                View decorView = this.f305012e.getDecorView();
                Runnable runnable = this.f305006S;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(decorView, runnable);
                this.f305004Q = true;
            }
        }
    }

    /* renamed from: e */
    public void mo143387e(Bundle bundle) {
        Window.Callback callback = this.f305013f;
        if (callback instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) callback;
                str = C90115d.m112745c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f305016i;
                if (actionBar == null) {
                    this.f305007T = true;
                } else {
                    actionBar.mo91083A(true);
                }
            }
        }
        if (bundle != null && this.f305001M == -100) {
            this.f305001M = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: f */
    public boolean mo143388f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f304995G && i == 108) {
            return false;
        }
        if (this.f304991C && i == 1) {
            this.f304991C = false;
        }
        if (i == 1) {
            mo143407w();
            this.f304995G = true;
            return true;
        } else if (i == 2) {
            mo143407w();
            this.f304989A = true;
            return true;
        } else if (i == 5) {
            mo143407w();
            this.f304990B = true;
            return true;
        } else if (i == 10) {
            mo143407w();
            this.f304993E = true;
            return true;
        } else if (i == 108) {
            mo143407w();
            this.f304991C = true;
            return true;
        } else if (i != 109) {
            return this.f305012e.requestFeature(i);
        } else {
            mo143407w();
            this.f304992D = true;
            return true;
        }
    }

    /* renamed from: g */
    public void mo143389g(int i) {
        mo143400p();
        ViewGroup viewGroup = (ViewGroup) this.f305028x.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f305011d).inflate(i, viewGroup);
        this.f305013f.onContentChanged();
    }

    /* renamed from: h */
    public final void mo143390h(CharSequence charSequence) {
        this.f305018n = charSequence;
        C103552n nVar = this.f305019o;
        if (nVar != null) {
            nVar.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f305016i;
        if (actionBar != null) {
            actionBar.mo91093K(charSequence);
            return;
        }
        TextView textView = this.f305029y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        if (p849e3.C107207u.C107211e.m145208c(r8) != false) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p990k.C108781a mo143391i(p990k.C108781a.C108782a r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x01be
            k.a r0 = r7.f305022r
            if (r0 == 0) goto L_0x0009
            r0.mo143484a()
        L_0x0009:
            androidx.appcompat.app.AppCompatDelegateImpl$d r0 = new androidx.appcompat.app.AppCompatDelegateImpl$d
            r0.<init>(r8)
            r7.mo143403s()
            androidx.appcompat.app.ActionBar r8 = r7.f305016i
            if (r8 == 0) goto L_0x0024
            k.a r8 = r8.mo91095M(r0)
            r7.f305022r = r8
            if (r8 == 0) goto L_0x0024
            androidx.appcompat.app.f r1 = r7.f305015h
            if (r1 == 0) goto L_0x0024
            r1.onSupportActionModeStarted(r8)
        L_0x0024:
            k.a r8 = r7.f305022r
            if (r8 != 0) goto L_0x01bb
            e3.a0 r8 = r7.f305026v
            if (r8 == 0) goto L_0x002f
            r8.mo157606b()
        L_0x002f:
            k.a r8 = r7.f305022r
            if (r8 == 0) goto L_0x0036
            r8.mo143484a()
        L_0x0036:
            androidx.appcompat.app.f r8 = r7.f305015h
            r1 = 0
            if (r8 == 0) goto L_0x0045
            boolean r2 = r7.f305000L
            if (r2 != 0) goto L_0x0045
            k.a r8 = r8.onWindowStartingSupportActionMode(r0)     // Catch:{ AbstractMethodError -> 0x0044 }
            goto L_0x0046
        L_0x0044:
        L_0x0045:
            r8 = r1
        L_0x0046:
            if (r8 == 0) goto L_0x004c
            r7.f305022r = r8
            goto L_0x01ac
        L_0x004c:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305023s
            r2 = 1
            r3 = 0
            if (r8 != 0) goto L_0x0108
            boolean r8 = r7.f304994F
            if (r8 == 0) goto L_0x00db
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.Context r4 = r7.f305011d
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130968611(0x7f040023, float:1.754588E38)
            r4.resolveAttribute(r5, r8, r2)
            int r5 = r8.resourceId
            if (r5 == 0) goto L_0x008c
            android.content.Context r5 = r7.f305011d
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r8.resourceId
            r5.applyStyle(r4, r2)
            k.c r4 = new k.c
            android.content.Context r6 = r7.f305011d
            r4.<init>(r6, r3)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x008e
        L_0x008c:
            android.content.Context r4 = r7.f305011d
        L_0x008e:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4, r1)
            r7.f305023s = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 2130968625(0x7f040031, float:1.7545909E38)
            r5.<init>(r4, r1, r6)
            r7.f305024t = r5
            r6 = 2
            androidx.core.widget.C103729f.m138094b(r5, r6)
            android.widget.PopupWindow r5 = r7.f305024t
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f305023s
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f305024t
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            r6 = 2130968605(0x7f04001d, float:1.7545868E38)
            r5.resolveAttribute(r6, r8, r2)
            int r8 = r8.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r8 = android.util.TypedValue.complexToDimensionPixelSize(r8, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f305023s
            r4.setContentHeight(r8)
            android.widget.PopupWindow r8 = r7.f305024t
            r4 = -2
            r8.setHeight(r4)
            androidx.appcompat.app.j r8 = new androidx.appcompat.app.j
            r8.<init>(r7)
            r7.f305025u = r8
            goto L_0x0108
        L_0x00db:
            android.view.ViewGroup r8 = r7.f305028x
            r4 = 2131296474(0x7f0900da, float:1.8210866E38)
            android.view.View r8 = r8.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r8 = (androidx.appcompat.widget.ViewStubCompat) r8
            if (r8 == 0) goto L_0x0108
            r7.mo143403s()
            androidx.appcompat.app.ActionBar r4 = r7.f305016i
            if (r4 == 0) goto L_0x00f4
            android.content.Context r4 = r4.mo91102m()
            goto L_0x00f5
        L_0x00f4:
            r4 = r1
        L_0x00f5:
            if (r4 != 0) goto L_0x00f9
            android.content.Context r4 = r7.f305011d
        L_0x00f9:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8.setLayoutInflater(r4)
            android.view.View r8 = r8.mo91142a()
            androidx.appcompat.widget.ActionBarContextView r8 = (androidx.appcompat.widget.ActionBarContextView) r8
            r7.f305023s = r8
        L_0x0108:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305023s
            if (r8 == 0) goto L_0x01ac
            e3.a0 r8 = r7.f305026v
            if (r8 == 0) goto L_0x0113
            r8.mo157606b()
        L_0x0113:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305023s
            r8.removeAllViews()
            r8.f305338r = r1
            r8.f305686f = r1
            k.d r8 = new k.d
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f305023s
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f305023s
            android.widget.PopupWindow r6 = r7.f305024t
            if (r6 != 0) goto L_0x012c
            r6 = 1
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            r8.<init>(r4, r5, r0, r6)
            androidx.appcompat.view.menu.e r4 = r8.f325726n
            boolean r0 = r0.mo143417b(r8, r4)
            if (r0 == 0) goto L_0x01aa
            r8.mo143490i()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f305023s
            r0.mo143733f(r8)
            r7.f305022r = r8
            boolean r8 = r7.f305027w
            if (r8 == 0) goto L_0x0153
            android.view.ViewGroup r8 = r7.f305028x
            if (r8 == 0) goto L_0x0153
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            boolean r8 = p849e3.C107207u.C107211e.m145208c(r8)
            if (r8 == 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r2 = 0
        L_0x0154:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0172
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f305023s
            r1 = 0
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f305023s
            e3.a0 r0 = p849e3.C107207u.m145160a(r0)
            r0.mo157605a(r8)
            r7.f305026v = r0
            androidx.appcompat.app.k r8 = new androidx.appcompat.app.k
            r8.<init>(r7)
            r0.mo157608d(r8)
            goto L_0x019a
        L_0x0172:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f305023s
            r0.setAlpha(r8)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305023s
            r8.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305023s
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305023s
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x019a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f305023s
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107212f.m145215c(r8)
        L_0x019a:
            android.widget.PopupWindow r8 = r7.f305024t
            if (r8 == 0) goto L_0x01ac
            android.view.Window r8 = r7.f305012e
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f305025u
            r8.post(r0)
            goto L_0x01ac
        L_0x01aa:
            r7.f305022r = r1
        L_0x01ac:
            k.a r8 = r7.f305022r
            if (r8 == 0) goto L_0x01b7
            androidx.appcompat.app.f r0 = r7.f305015h
            if (r0 == 0) goto L_0x01b7
            r0.onSupportActionModeStarted(r8)
        L_0x01b7:
            k.a r8 = r7.f305022r
            r7.f305022r = r8
        L_0x01bb:
            k.a r8 = r7.f305022r
            return r8
        L_0x01be:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ActionMode callback can not be null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo143391i(k.a$a):k.a");
    }

    /* renamed from: j */
    public void mo143392j(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f304997I;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f305038h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f305043m) && !this.f305000L) {
            this.f305013f.onPanelClosed(i, menu);
        }
    }

    /* renamed from: k */
    public void mo143393k(C103448e eVar) {
        if (!this.f304996H) {
            this.f304996H = true;
            this.f305019o.mo143770l();
            Window.Callback r = mo143402r();
            if (r != null && !this.f305000L) {
                r.onPanelClosed(108, eVar);
            }
            this.f304996H = false;
        }
    }

    /* renamed from: l */
    public void mo143394l(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        C103552n nVar;
        if (!z || panelFeatureState.f305031a != 0 || (nVar = this.f305019o) == null || !nVar.mo143760f()) {
            WindowManager windowManager = (WindowManager) this.f305011d.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f305043m || (viewGroup = panelFeatureState.f305035e) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo143392j(panelFeatureState.f305031a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f305041k = false;
            panelFeatureState.f305042l = false;
            panelFeatureState.f305043m = false;
            panelFeatureState.f305036f = null;
            panelFeatureState.f305044n = true;
            if (this.f304998J == panelFeatureState) {
                this.f304998J = null;
                return;
            }
            return;
        }
        mo143393k(panelFeatureState.f305038h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143395m(android.view.KeyEvent r14) {
        /*
            r13 = this;
            android.view.Window$Callback r0 = r13.f305013f
            boolean r1 = r0 instanceof p849e3.C107177e.C107178a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof androidx.appcompat.app.C103422m
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r13.f305012e
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p849e3.C107177e.m145059a(r0, r14)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r14.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002b
            android.view.Window$Callback r0 = r13.f305013f
            boolean r0 = r0.dispatchKeyEvent(r14)
            if (r0 == 0) goto L_0x002b
            return r2
        L_0x002b:
            int r0 = r14.getKeyCode()
            int r3 = r14.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            r5 = 4
            if (r3 == 0) goto L_0x0063
            if (r0 == r5) goto L_0x0054
            if (r0 == r1) goto L_0x0041
            goto L_0x0060
        L_0x0041:
            int r0 = r14.getRepeatCount()
            if (r0 != 0) goto L_0x0147
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r13.mo143401q(r4, r2)
            boolean r1 = r0.f305043m
            if (r1 != 0) goto L_0x0147
            r13.mo143406v(r0, r14)
            goto L_0x0147
        L_0x0054:
            int r14 = r14.getFlags()
            r14 = r14 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            r13.f304999K = r2
        L_0x0060:
            r2 = 0
            goto L_0x0147
        L_0x0063:
            if (r0 == r5) goto L_0x011b
            if (r0 == r1) goto L_0x0068
            goto L_0x0060
        L_0x0068:
            k.a r0 = r13.f305022r
            if (r0 == 0) goto L_0x006e
            goto L_0x0147
        L_0x006e:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r13.mo143401q(r4, r2)
            androidx.appcompat.widget.n r1 = r13.f305019o
            if (r1 == 0) goto L_0x00a8
            boolean r1 = r1.mo143757d()
            if (r1 == 0) goto L_0x00a8
            android.content.Context r1 = r13.f305011d
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00a8
            androidx.appcompat.widget.n r1 = r13.f305019o
            boolean r1 = r1.mo143760f()
            if (r1 != 0) goto L_0x00a1
            boolean r1 = r13.f305000L
            if (r1 != 0) goto L_0x00c8
            boolean r14 = r13.mo143406v(r0, r14)
            if (r14 == 0) goto L_0x00c8
            androidx.appcompat.widget.n r14 = r13.f305019o
            boolean r14 = r14.mo143759e()
            goto L_0x00ce
        L_0x00a1:
            androidx.appcompat.widget.n r14 = r13.f305019o
            boolean r14 = r14.mo143753a()
            goto L_0x00ce
        L_0x00a8:
            boolean r1 = r0.f305043m
            if (r1 != 0) goto L_0x00ca
            boolean r3 = r0.f305042l
            if (r3 == 0) goto L_0x00b1
            goto L_0x00ca
        L_0x00b1:
            boolean r1 = r0.f305041k
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r0.f305045o
            if (r1 == 0) goto L_0x00c0
            r0.f305041k = r4
            boolean r1 = r13.mo143406v(r0, r14)
            goto L_0x00c1
        L_0x00c0:
            r1 = 1
        L_0x00c1:
            if (r1 == 0) goto L_0x00c8
            r13.mo143404t(r0, r14)
            r14 = 1
            goto L_0x00ce
        L_0x00c8:
            r14 = 0
            goto L_0x00ce
        L_0x00ca:
            r13.mo143394l(r0, r2)
            r14 = r1
        L_0x00ce:
            if (r14 == 0) goto L_0x0147
            android.content.Context r14 = r13.f305011d
            java.lang.String r0 = "audio"
            java.lang.Object r14 = r14.getSystemService(r0)
            android.media.AudioManager r14 = (android.media.AudioManager) r14
            if (r14 == 0) goto L_0x0147
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.mo10233c(r1)
            java.lang.Object[] r6 = r0.mo10232b()
            java.lang.String r7 = "androidx/appcompat/app/AppCompatDelegateImpl"
            java.lang.String r8 = "onKeyUpPanel"
            java.lang.String r9 = "(ILandroid/view/KeyEvent;)Z"
            java.lang.String r10 = "android/media/AudioManager_EXEC_"
            java.lang.String r11 = "playSoundEffect"
            java.lang.String r12 = "(I)V"
            r5 = r14
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r0.mo10231a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r14.playSoundEffect(r0)
            java.lang.String r6 = "androidx/appcompat/app/AppCompatDelegateImpl"
            java.lang.String r7 = "onKeyUpPanel"
            java.lang.String r8 = "(ILandroid/view/KeyEvent;)Z"
            java.lang.String r9 = "android/media/AudioManager_EXEC_"
            java.lang.String r10 = "playSoundEffect"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0147
        L_0x011b:
            boolean r14 = r13.f304999K
            r13.f304999K = r4
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r13.mo143401q(r4, r4)
            boolean r1 = r0.f305043m
            if (r1 == 0) goto L_0x012d
            if (r14 != 0) goto L_0x0147
            r13.mo143394l(r0, r2)
            goto L_0x0147
        L_0x012d:
            k.a r14 = r13.f305022r
            if (r14 == 0) goto L_0x0135
            r14.mo143484a()
            goto L_0x0142
        L_0x0135:
            r13.mo143403s()
            androidx.appcompat.app.ActionBar r14 = r13.f305016i
            if (r14 == 0) goto L_0x0144
            boolean r14 = r14.mo91097h()
            if (r14 == 0) goto L_0x0144
        L_0x0142:
            r14 = 1
            goto L_0x0145
        L_0x0144:
            r14 = 0
        L_0x0145:
            if (r14 == 0) goto L_0x0060
        L_0x0147:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo143395m(android.view.KeyEvent):boolean");
    }

    /* renamed from: n */
    public void mo143396n(int i) {
        PanelFeatureState q = mo143401q(i, true);
        if (q.f305038h != null) {
            Bundle bundle = new Bundle();
            q.f305038h.mo143626u(bundle);
            if (bundle.size() > 0) {
                q.f305046p = bundle;
            }
            q.f305038h.mo143631z();
            q.f305038h.clear();
        }
        q.f305045o = true;
        q.f305044n = true;
        if ((i == 108 || i == 0) && this.f305019o != null) {
            PanelFeatureState q2 = mo143401q(0, false);
            q2.f305041k = false;
            mo143406v(q2, (KeyEvent) null);
        }
    }

    /* renamed from: o */
    public final void mo143397o() {
        if (this.f305003P == null) {
            Context context = this.f305011d;
            if (C112852q.f337873d == null) {
                Context applicationContext = context.getApplicationContext();
                C112852q.f337873d = new C112852q(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.C113379b.LOCATION));
            }
            this.f305003P = new C103405f(C112852q.f337873d);
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f305010W == null) {
            String string = this.f305011d.obtainStyledAttributes(C107593a.f321914n).getString(110);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f305010W = new AppCompatViewInflater();
            } else {
                try {
                    this.f305010W = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.f305010W = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f305010W;
        int i = C103551m0.f305819a;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    /* renamed from: p */
    public final void mo143400p() {
        ViewGroup viewGroup;
        if (!this.f305027w) {
            TypedArray obtainStyledAttributes = this.f305011d.obtainStyledAttributes(C107593a.f321914n);
            if (obtainStyledAttributes.hasValue(111)) {
                if (obtainStyledAttributes.getBoolean(120, false)) {
                    mo143388f(1);
                } else if (obtainStyledAttributes.getBoolean(111, false)) {
                    mo143388f(108);
                }
                if (obtainStyledAttributes.getBoolean(112, false)) {
                    mo143388f(109);
                }
                if (obtainStyledAttributes.getBoolean(113, false)) {
                    mo143388f(10);
                }
                this.f304994F = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                this.f305012e.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f305011d);
                if (this.f304995G) {
                    viewGroup = this.f304993E ? (ViewGroup) from.inflate(C0966R.C0971layout.f6291at, (ViewGroup) null) : (ViewGroup) from.inflate(C0966R.C0971layout.f6290as, (ViewGroup) null);
                    C103416h hVar = new C103416h(this);
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107213g.m145236u(viewGroup, hVar);
                } else if (this.f304994F) {
                    viewGroup = (ViewGroup) from.inflate(C0966R.C0971layout.f6281aj, (ViewGroup) null);
                    this.f304992D = false;
                    this.f304991C = false;
                } else if (this.f304991C) {
                    TypedValue typedValue = new TypedValue();
                    this.f305011d.getTheme().resolveAttribute(C0966R.attr.f2631a6, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C88046c(this.f305011d, typedValue.resourceId) : this.f305011d).inflate(C0966R.C0971layout.f6292au, (ViewGroup) null);
                    C103552n nVar = (C103552n) viewGroup.findViewById(C0966R.C0970id.bzq);
                    this.f305019o = nVar;
                    nVar.setWindowCallback(mo143402r());
                    if (this.f304992D) {
                        this.f305019o.mo143769k(109);
                    }
                    if (this.f304989A) {
                        this.f305019o.mo143769k(2);
                    }
                    if (this.f304990B) {
                        this.f305019o.mo143769k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (this.f305019o == null) {
                        this.f305029y = (TextView) viewGroup.findViewById(C0966R.C0970id.knx);
                    }
                    Method method = C103553n0.f305820a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0966R.C0970id.f5381dm);
                    ViewGroup viewGroup2 = (ViewGroup) this.f305012e.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f305012e.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C103417i(this));
                    this.f305028x = viewGroup;
                    Window.Callback callback = this.f305013f;
                    CharSequence title = callback instanceof Activity ? ((Activity) callback).getTitle() : this.f305018n;
                    if (!TextUtils.isEmpty(title)) {
                        C103552n nVar2 = this.f305019o;
                        if (nVar2 != null) {
                            nVar2.setWindowTitle(title);
                        } else {
                            ActionBar actionBar = this.f305016i;
                            if (actionBar != null) {
                                actionBar.mo91093K(title);
                            } else {
                                TextView textView = this.f305029y;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f305028x.findViewById(16908290);
                    View decorView = this.f305012e.getDecorView();
                    contentFrameLayout2.f305488j.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    if (C107207u.C107211e.m145208c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f305011d.obtainStyledAttributes(C107593a.f321914n);
                    obtainStyledAttributes2.getValue(118, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(119, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(116)) {
                        obtainStyledAttributes2.getValue(116, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(117)) {
                        obtainStyledAttributes2.getValue(117, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(114)) {
                        obtainStyledAttributes2.getValue(114, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(115)) {
                        obtainStyledAttributes2.getValue(115, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f305027w = true;
                    PanelFeatureState q = mo143401q(0, false);
                    if (!this.f305000L && q.f305038h == null) {
                        this.f305005R |= 4096;
                        if (!this.f305004Q) {
                            C107207u.C107208b.m145185m(this.f305012e.getDecorView(), this.f305006S);
                            this.f305004Q = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f304991C + ", windowActionBarOverlay: " + this.f304992D + ", android:windowIsFloating: " + this.f304994F + ", windowActionModeOverlay: " + this.f304993E + ", windowNoTitle: " + this.f304995G + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: q */
    public PanelFeatureState mo143401q(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f304997I;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f304997I = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: r */
    public final Window.Callback mo143402r() {
        return this.f305012e.getCallback();
    }

    /* renamed from: s */
    public final void mo143403s() {
        mo143400p();
        if (this.f304991C && this.f305016i == null) {
            Window.Callback callback = this.f305013f;
            if (callback instanceof Activity) {
                this.f305016i = new C103431r((Activity) this.f305013f, this.f304992D);
            } else if (callback instanceof Dialog) {
                this.f305016i = new C103431r((Dialog) this.f305013f);
            }
            ActionBar actionBar = this.f305016i;
            if (actionBar != null) {
                actionBar.mo91083A(this.f305007T);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0157, code lost:
        if (r14 != null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017b, code lost:
        if (r14.f305221i.getCount() > 0) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0183  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo143404t(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f305043m
            if (r0 != 0) goto L_0x01de
            boolean r0 = r12.f305000L
            if (r0 == 0) goto L_0x000a
            goto L_0x01de
        L_0x000a:
            int r0 = r13.f305031a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f305011d
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.mo143402r()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.f305031a
            androidx.appcompat.view.menu.e r4 = r13.f305038h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.mo143394l(r13, r1)
            return
        L_0x003b:
            android.content.Context r0 = r12.f305011d
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.mo143406v(r13, r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f305035e
            r3 = -2
            r4 = -1
            if (r14 == 0) goto L_0x006b
            boolean r5 = r13.f305044n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r14 = r13.f305037g
            if (r14 == 0) goto L_0x01be
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x01be
            int r14 = r14.width
            if (r14 != r4) goto L_0x01be
            r5 = -1
            goto L_0x01bf
        L_0x006b:
            if (r14 != 0) goto L_0x00e6
            r12.mo143403s()
            androidx.appcompat.app.ActionBar r14 = r12.f305016i
            if (r14 == 0) goto L_0x0079
            android.content.Context r14 = r14.mo91102m()
            goto L_0x007a
        L_0x0079:
            r14 = 0
        L_0x007a:
            if (r14 != 0) goto L_0x007e
            android.content.Context r14 = r12.f305011d
        L_0x007e:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r14.getTheme()
            r5.setTo(r6)
            r6 = 2130968604(0x7f04001c, float:1.7545866E38)
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x009f
            r5.applyStyle(r6, r1)
        L_0x009f:
            r6 = 2130969537(0x7f0403c1, float:1.7547759E38)
            r5.resolveAttribute(r6, r4, r1)
            int r4 = r4.resourceId
            if (r4 == 0) goto L_0x00ad
            r5.applyStyle(r4, r1)
            goto L_0x00b3
        L_0x00ad:
            r4 = 2131887013(0x7f1203a5, float:1.9408621E38)
            r5.applyStyle(r4, r1)
        L_0x00b3:
            k.c r4 = new k.c
            r4.<init>(r14, r2)
            android.content.res.Resources$Theme r14 = r4.getTheme()
            r14.setTo(r5)
            r13.f305040j = r4
            int[] r14 = p433g.C107593a.f321914n
            android.content.res.TypedArray r14 = r4.obtainStyledAttributes(r14)
            r4 = 80
            int r4 = r14.getResourceId(r4, r2)
            r13.f305032b = r4
            int r4 = r14.getResourceId(r1, r2)
            r13.f305034d = r4
            r14.recycle()
            androidx.appcompat.app.AppCompatDelegateImpl$g r14 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            android.content.Context r4 = r13.f305040j
            r14.<init>(r4)
            r13.f305035e = r14
            r14 = 81
            r13.f305033c = r14
            goto L_0x00f5
        L_0x00e6:
            boolean r4 = r13.f305044n
            if (r4 == 0) goto L_0x00f5
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00f5
            android.view.ViewGroup r14 = r13.f305035e
            r14.removeAllViews()
        L_0x00f5:
            android.view.View r14 = r13.f305037g
            if (r14 == 0) goto L_0x00fc
            r13.f305036f = r14
            goto L_0x0159
        L_0x00fc:
            androidx.appcompat.view.menu.e r14 = r13.f305038h
            if (r14 != 0) goto L_0x0101
            goto L_0x015b
        L_0x0101:
            androidx.appcompat.app.AppCompatDelegateImpl$h r14 = r12.f305021q
            if (r14 != 0) goto L_0x010c
            androidx.appcompat.app.AppCompatDelegateImpl$h r14 = new androidx.appcompat.app.AppCompatDelegateImpl$h
            r14.<init>()
            r12.f305021q = r14
        L_0x010c:
            androidx.appcompat.app.AppCompatDelegateImpl$h r14 = r12.f305021q
            androidx.appcompat.view.menu.c r4 = r13.f305039i
            if (r4 != 0) goto L_0x0127
            androidx.appcompat.view.menu.c r4 = new androidx.appcompat.view.menu.c
            android.content.Context r5 = r13.f305040j
            r6 = 2131492922(0x7f0c003a, float:1.860931E38)
            r4.<init>(r5, r6)
            r13.f305039i = r4
            r4.f305220h = r14
            androidx.appcompat.view.menu.e r14 = r13.f305038h
            android.content.Context r5 = r14.f305235d
            r14.mo143590b(r4, r5)
        L_0x0127:
            androidx.appcompat.view.menu.c r14 = r13.f305039i
            android.view.ViewGroup r4 = r13.f305035e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r14.f305219g
            if (r5 != 0) goto L_0x0153
            android.view.LayoutInflater r5 = r14.f305217e
            r6 = 2131492919(0x7f0c0037, float:1.8609303E38)
            android.view.View r4 = r5.inflate(r6, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r14.f305219g = r4
            androidx.appcompat.view.menu.c$a r4 = r14.f305221i
            if (r4 != 0) goto L_0x0147
            androidx.appcompat.view.menu.c$a r4 = new androidx.appcompat.view.menu.c$a
            r4.<init>()
            r14.f305221i = r4
        L_0x0147:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f305219g
            androidx.appcompat.view.menu.c$a r5 = r14.f305221i
            r4.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f305219g
            r4.setOnItemClickListener(r14)
        L_0x0153:
            androidx.appcompat.view.menu.ExpandedMenuView r14 = r14.f305219g
            r13.f305036f = r14
            if (r14 == 0) goto L_0x015b
        L_0x0159:
            r14 = 1
            goto L_0x015c
        L_0x015b:
            r14 = 0
        L_0x015c:
            if (r14 == 0) goto L_0x01de
            android.view.View r14 = r13.f305036f
            if (r14 != 0) goto L_0x0163
            goto L_0x017f
        L_0x0163:
            android.view.View r14 = r13.f305037g
            if (r14 == 0) goto L_0x0168
            goto L_0x017d
        L_0x0168:
            androidx.appcompat.view.menu.c r14 = r13.f305039i
            androidx.appcompat.view.menu.c$a r4 = r14.f305221i
            if (r4 != 0) goto L_0x0175
            androidx.appcompat.view.menu.c$a r4 = new androidx.appcompat.view.menu.c$a
            r4.<init>()
            r14.f305221i = r4
        L_0x0175:
            androidx.appcompat.view.menu.c$a r14 = r14.f305221i
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x017f
        L_0x017d:
            r14 = 1
            goto L_0x0180
        L_0x017f:
            r14 = 0
        L_0x0180:
            if (r14 != 0) goto L_0x0183
            goto L_0x01de
        L_0x0183:
            android.view.View r14 = r13.f305036f
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x0190
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x0190:
            int r4 = r13.f305032b
            android.view.ViewGroup r5 = r13.f305035e
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f305036f
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L_0x01aa
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01aa
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f305036f
            r4.removeView(r5)
        L_0x01aa:
            android.view.ViewGroup r4 = r13.f305035e
            android.view.View r5 = r13.f305036f
            r4.addView(r5, r14)
            android.view.View r14 = r13.f305036f
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x01be
            android.view.View r14 = r13.f305036f
            r14.requestFocus()
        L_0x01be:
            r5 = -2
        L_0x01bf:
            r13.f305042l = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            r7 = 0
            r8 = 0
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.f305033c
            r14.gravity = r2
            int r2 = r13.f305034d
            r14.windowAnimations = r2
            android.view.ViewGroup r2 = r13.f305035e
            r0.addView(r2, r14)
            r13.f305043m = r1
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo143404t(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* renamed from: u */
    public final boolean mo143405u(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C103448e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f305041k || mo143406v(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.f305038h) != null) {
            z = eVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f305019o == null) {
            mo143394l(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: v */
    public final boolean mo143406v(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        C103552n nVar;
        C103552n nVar2;
        C103552n nVar3;
        Resources.Theme theme;
        C103552n nVar4;
        if (this.f305000L) {
            return false;
        }
        if (panelFeatureState.f305041k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f304998J;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo143394l(panelFeatureState2, false);
        }
        Window.Callback r = mo143402r();
        if (r != null) {
            panelFeatureState.f305037g = r.onCreatePanelView(panelFeatureState.f305031a);
        }
        int i = panelFeatureState.f305031a;
        boolean z = i == 0 || i == 108;
        if (z && (nVar4 = this.f305019o) != null) {
            nVar4.mo143768h();
        }
        if (panelFeatureState.f305037g == null && (!z || !(this.f305016i instanceof C103425o))) {
            C103448e eVar = panelFeatureState.f305038h;
            if (eVar == null || panelFeatureState.f305045o) {
                if (eVar == null) {
                    Context context = this.f305011d;
                    int i2 = panelFeatureState.f305031a;
                    if ((i2 == 0 || i2 == 108) && this.f305019o != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(C0966R.attr.f2631a6, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(C0966R.attr.f2632a7, typedValue, true);
                        } else {
                            theme2.resolveAttribute(C0966R.attr.f2632a7, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C88046c cVar = new C88046c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    C103448e eVar2 = new C103448e(context);
                    eVar2.f305239h = this;
                    C103448e eVar3 = panelFeatureState.f305038h;
                    if (eVar2 != eVar3) {
                        if (eVar3 != null) {
                            eVar3.mo143615r(panelFeatureState.f305039i);
                        }
                        panelFeatureState.f305038h = eVar2;
                        C103445c cVar2 = panelFeatureState.f305039i;
                        if (cVar2 != null) {
                            eVar2.mo143590b(cVar2, eVar2.f305235d);
                        }
                    }
                    if (panelFeatureState.f305038h == null) {
                        return false;
                    }
                }
                if (z && (nVar3 = this.f305019o) != null) {
                    if (this.f305020p == null) {
                        this.f305020p = new C103401c();
                    }
                    nVar3.mo143754b(panelFeatureState.f305038h, this.f305020p);
                }
                panelFeatureState.f305038h.mo143631z();
                if (!r.onCreatePanelMenu(panelFeatureState.f305031a, panelFeatureState.f305038h)) {
                    C103448e eVar4 = panelFeatureState.f305038h;
                    if (eVar4 != null) {
                        if (eVar4 != null) {
                            eVar4.mo143615r(panelFeatureState.f305039i);
                        }
                        panelFeatureState.f305038h = null;
                    }
                    if (z && (nVar2 = this.f305019o) != null) {
                        nVar2.mo143754b((Menu) null, this.f305020p);
                    }
                    return false;
                }
                panelFeatureState.f305045o = false;
            }
            panelFeatureState.f305038h.mo143631z();
            Bundle bundle = panelFeatureState.f305046p;
            if (bundle != null) {
                panelFeatureState.f305038h.mo143618s(bundle);
                panelFeatureState.f305046p = null;
            }
            if (!r.onPreparePanel(0, panelFeatureState.f305037g, panelFeatureState.f305038h)) {
                if (z && (nVar = this.f305019o) != null) {
                    nVar.mo143754b((Menu) null, this.f305020p);
                }
                panelFeatureState.f305038h.mo143630y();
                return false;
            }
            panelFeatureState.f305038h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            panelFeatureState.f305038h.mo143630y();
        }
        panelFeatureState.f305041k = true;
        panelFeatureState.f305042l = false;
        this.f304998J = panelFeatureState;
        return true;
    }

    /* renamed from: w */
    public final void mo143407w() {
        if (this.f305027w) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C103404e extends C108791h {
        public C103404e(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo143395m(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            if (r6 != false) goto L_0x001b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004d
                androidx.appcompat.app.AppCompatDelegateImpl r0 = androidx.appcompat.app.AppCompatDelegateImpl.this
                int r3 = r6.getKeyCode()
                r0.mo143403s()
                androidx.appcompat.app.ActionBar r4 = r0.f305016i
                if (r4 == 0) goto L_0x001d
                boolean r3 = r4.mo91109t(r3, r6)
                if (r3 == 0) goto L_0x001d
            L_0x001b:
                r6 = 1
                goto L_0x004b
            L_0x001d:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f304998J
                if (r3 == 0) goto L_0x0032
                int r4 = r6.getKeyCode()
                boolean r3 = r0.mo143405u(r3, r4, r6, r2)
                if (r3 == 0) goto L_0x0032
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r0.f304998J
                if (r6 == 0) goto L_0x001b
                r6.f305042l = r2
                goto L_0x001b
            L_0x0032:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.f304998J
                if (r3 != 0) goto L_0x004a
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.mo143401q(r1, r2)
                r0.mo143406v(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.mo143405u(r3, r4, r6, r2)
                r3.f305041k = r1
                if (r6 == 0) goto L_0x004a
                goto L_0x001b
            L_0x004a:
                r6 = 0
            L_0x004b:
                if (r6 == 0) goto L_0x004e
            L_0x004d:
                r1 = 1
            L_0x004e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.C103404e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C103448e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.mo143403s();
                ActionBar actionBar = appCompatDelegateImpl.f305016i;
                if (actionBar != null) {
                    actionBar.mo91098i(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.mo143403s();
                ActionBar actionBar = appCompatDelegateImpl.f305016i;
                if (actionBar != null) {
                    actionBar.mo91098i(false);
                }
            } else if (i == 0) {
                PanelFeatureState q = appCompatDelegateImpl.mo143401q(i, true);
                if (q.f305043m) {
                    appCompatDelegateImpl.mo143394l(q, false);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C103448e eVar = menu instanceof C103448e ? (C103448e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f305234D = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (eVar != null) {
                eVar.f305234D = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C103448e eVar = AppCompatDelegateImpl.this.mo143401q(0, true).f305038h;
            if (eVar != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            AppCompatDelegateImpl.this.getClass();
            C108785e.C108786a aVar = new C108785e.C108786a(AppCompatDelegateImpl.this.f305011d, callback);
            C108781a i = AppCompatDelegateImpl.this.mo143391i(aVar);
            if (i != null) {
                return aVar.mo159832e(i);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            AppCompatDelegateImpl.this.getClass();
            if (i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            C108785e.C108786a aVar = new C108785e.C108786a(AppCompatDelegateImpl.this.f305011d, callback);
            C108781a i2 = AppCompatDelegateImpl.this.mo143391i(aVar);
            if (i2 != null) {
                return aVar.mo159832e(i2);
            }
            return null;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
