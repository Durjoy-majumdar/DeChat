package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bh3.C113177k;
import cc0.C92411b;
import com.eclipsesource.mmv8.Platform;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.map.geolocation.sapp.TencentLocationUtils;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinishSelectPOIStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMLoadMoreListView;
import com.tencent.p014mm.p136ui.widget.InputPanelFrameLayout;
import com.tencent.p014mm.plugin.location.p069ui.MyPoiPoint;
import com.tencent.p014mm.plugin.location.p069ui.PoiHeaderView;
import com.tencent.p014mm.plugin.location.p069ui.PoiPoint;
import com.tencent.p014mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.p014mm.pluginsdk.location.LocationIntent;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import di3.C86312j;
import f40.C86709a0;
import ht1.C98522w3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import p702ts.C78085c;
import qo3.C89779i0;
import t22.C118350n;
import t22.C48534m;
import te3.C118450o52;
import te3.C51018qv3;
import x22.C38446c;
import y22.C118911c;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.c0 */
public class C115538c0 extends C115560k implements C11385n, C113177k.C113180d {

    /* renamed from: A */
    public View f346495A;

    /* renamed from: B */
    public TextView f346496B;

    /* renamed from: C */
    public LinearLayout f346497C;

    /* renamed from: D */
    public MyPoiPoint f346498D;

    /* renamed from: E */
    public double f346499E = -85.0d;

    /* renamed from: F */
    public double f346500F = -1000.0d;

    /* renamed from: G */
    public double f346501G = -85.0d;

    /* renamed from: H */
    public double f346502H = -1000.0d;

    /* renamed from: I */
    public String f346503I = "";

    /* renamed from: J */
    public boolean f346504J = false;

    /* renamed from: K */
    public String f346505K = "";

    /* renamed from: L */
    public RelativeLayout f346506L;

    /* renamed from: M */
    public int f346507M;

    /* renamed from: N */
    public int f346508N;

    /* renamed from: P */
    public int f346509P;

    /* renamed from: Q */
    public boolean f346510Q = true;

    /* renamed from: Q0 */
    public int[] f346511Q0 = {24, 24};

    /* renamed from: R */
    public boolean f346512R = false;

    /* renamed from: R0 */
    public int[] f346513R0;

    /* renamed from: S */
    public boolean f346514S = false;

    /* renamed from: S0 */
    public View f346515S0;

    /* renamed from: T */
    public FrameLayout f346516T;

    /* renamed from: T0 */
    public int f346517T0;

    /* renamed from: U */
    public int f346518U = 0;

    /* renamed from: U0 */
    public View f346519U0;

    /* renamed from: V */
    public long f346520V = -1;

    /* renamed from: V0 */
    public View f346521V0;

    /* renamed from: W */
    public long f346522W = -1;

    /* renamed from: W0 */
    public EditText f346523W0;

    /* renamed from: X */
    public long f346524X = -1;

    /* renamed from: X0 */
    public ImageView f346525X0;

    /* renamed from: Y */
    public int f346526Y = -1;

    /* renamed from: Y0 */
    public View f346527Y0;

    /* renamed from: Z */
    public boolean f346528Z = false;

    /* renamed from: Z0 */
    public View.OnTouchListener f346529Z0;

    /* renamed from: a1 */
    public PoiPoint.C115521c f346530a1;

    /* renamed from: b1 */
    public PoiPoint f346531b1;

    /* renamed from: c1 */
    public Map<String, PoiPoint> f346532c1 = new HashMap();

    /* renamed from: d1 */
    public boolean f346533d1;

    /* renamed from: e1 */
    public C115568o f346534e1 = new C115568o();

    /* renamed from: f1 */
    public C89779i0 f346535f1 = null;

    /* renamed from: g1 */
    public boolean f346536g1 = false;

    /* renamed from: h1 */
    public C92411b.C92412a f346537h1 = new C115543e();

    /* renamed from: i */
    public PoiHeaderView f346538i;

    /* renamed from: i1 */
    public boolean f346539i1 = false;

    /* renamed from: j */
    public FrameLayout f346540j;

    /* renamed from: j1 */
    public boolean f346541j1 = false;

    /* renamed from: k1 */
    public boolean f346542k1 = false;

    /* renamed from: l1 */
    public boolean f346543l1 = false;

    /* renamed from: n */
    public PickPoi f346544n;

    /* renamed from: o */
    public MMLoadMoreListView f346545o;

    /* renamed from: p */
    public MMLoadMoreListView f346546p;

    /* renamed from: p0 */
    public int f346547p0 = 1;

    /* renamed from: q */
    public View f346548q;

    /* renamed from: r */
    public View f346549r;

    /* renamed from: s */
    public C115565n f346550s;

    /* renamed from: t */
    public C115565n f346551t;

    /* renamed from: u */
    public View f346552u;

    /* renamed from: v */
    public LocationCrossHairView f346553v;

    /* renamed from: w */
    public CustomIndoorPicker f346554w;

    /* renamed from: x */
    public C118350n f346555x = null;

    /* renamed from: x0 */
    public FinishSelectPOIStruct f346556x0 = new FinishSelectPOIStruct();

    /* renamed from: y */
    public View f346557y;

    /* renamed from: y0 */
    public boolean f346558y0;

    /* renamed from: z */
    public View f346559z;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$a */
    public class C115539a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C115548i f346560a;

        public C115539a(C115548i iVar) {
            this.f346560a = iVar;
        }

        public void onAnimationEnd(Animation animation) {
            C115538c0 c0Var = C115538c0.this;
            c0Var.f346510Q = true;
            if (C115548i.OPENED == this.f346560a) {
                c0Var.f346514S = true;
                if (c0Var.f346504J) {
                    if (c0Var.f346542k1) {
                        c0Var.f346542k1 = false;
                    } else {
                        c0Var.mo175571C();
                    }
                }
            } else {
                c0Var.f346514S = false;
                C115538c0.m162437p(c0Var);
                C115538c0 c0Var2 = C115538c0.this;
                if (c0Var2.f346504J) {
                    C115538c0.m162436o(c0Var2, c0Var2.f346551t.f346592f);
                }
            }
            C115538c0.this.mo175570B(this.f346560a);
            C115538c0.this.f346506L.clearAnimation();
            C115538c0.this.f346553v.clearAnimation();
            C115538c0.this.f346516T.clearAnimation();
            C115538c0 c0Var3 = C115538c0.this;
            if (c0Var3.f346543l1) {
                c0Var3.f346543l1 = false;
                if (c0Var3.f346551t.f346596j.equals(c0Var3.f346505K)) {
                    C115538c0 c0Var4 = C115538c0.this;
                    if (c0Var4.f346551t.f346598o) {
                        c0Var4.mo175584z();
                        return;
                    }
                }
                C115538c0 c0Var5 = C115538c0.this;
                c0Var5.f346533d1 = true;
                c0Var5.mo175581w(false);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            Log.m105919d("MicroMsg.MMPoiMapUI", "newpoi start animation %s.", Long.valueOf(System.currentTimeMillis()));
            C115538c0 c0Var = C115538c0.this;
            c0Var.f346510Q = false;
            c0Var.f346512R = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$b */
    public class C115540b implements ValueAnimator.AnimatorUpdateListener {
        public C115540b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = C115538c0.this.f346515S0.getLayoutParams();
            layoutParams.height = intValue;
            C115538c0.this.f346515S0.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$c */
    public class C115541c implements ViewTreeObserver.OnGlobalLayoutListener {
        public C115541c() {
        }

        public void onGlobalLayout() {
            C115538c0.this.f346544n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            PickPoi pickPoi = C115538c0.this.f346544n;
            pickPoi.f346441f.clearAnimation();
            pickPoi.f346441f.startAnimation(pickPoi.f346440e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$d */
    public class C115542d implements C113177k.C113181e {
        public C115542d() {
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                C115538c0.this.onBusinessPermissionGranted(FirebaseAnalytics.C113379b.LOCATION);
            } else {
                C115538c0.this.onBusinessPermissionDenied(FirebaseAnalytics.C113379b.LOCATION);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$e */
    public class C115543e implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$e$a */
        public class C115544a implements DialogInterface.OnClickListener {
            public C115544a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(C115538c0.this.f346582d);
            }
        }

        public C115543e() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            float f3 = f;
            float f4 = f2;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LAST_LOCATION_STRING;
            if (!z) {
                if (!C115538c0.this.f346558y0 && !LocationUtil.isGpsEnable()) {
                    C115538c0 c0Var = C115538c0.this;
                    c0Var.f346558y0 = true;
                    Activity activity = c0Var.f346582d;
                    C76879j.m92709C(activity, activity.getString(C0966R.string.fez), C115538c0.this.f346582d.getString(C0966R.string.a3h), C115538c0.this.f346582d.getString(C0966R.string.fyd), C115538c0.this.f346582d.getString(C0966R.string.f7926wf), false, new C115544a(), (DialogInterface.OnClickListener) null);
                }
                return false;
            }
            C115538c0 c0Var2 = C115538c0.this;
            if (!c0Var2.f346539i1) {
                return true;
            }
            double d4 = c0Var2.f346501G;
            if (d4 != -85.0d) {
                double d5 = c0Var2.f346502H;
                if (d5 != -1000.0d) {
                    double d6 = (double) f4;
                    if (d4 == d6 && d5 == ((double) f3)) {
                        return true;
                    }
                    Log.m105918d("MicroMsg.MMPoiMapUI", "update lat/lng.");
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, ((int) (f4 * 1000000.0f)) + "," + ((int) (f3 * 1000000.0f)));
                    C115538c0 c0Var3 = C115538c0.this;
                    c0Var3.f346501G = d6;
                    c0Var3.f346502H = (double) f3;
                    return true;
                }
            }
            Log.m105918d("MicroMsg.MMPoiMapUI", "init my location.");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, ((int) (f4 * 1000000.0f)) + "," + ((int) (f3 * 1000000.0f)));
            C115538c0 c0Var4 = C115538c0.this;
            double d7 = (double) f4;
            c0Var4.f346501G = d7;
            double d8 = (double) f3;
            c0Var4.f346502H = d8;
            C115565n nVar = c0Var4.f346550s;
            nVar.f346599p = d7;
            nVar.f346600q = d8;
            C115565n nVar2 = c0Var4.f346551t;
            nVar2.f346599p = d7;
            nVar2.f346600q = d8;
            if (c0Var4.mo175582x()) {
                C115538c0 c0Var5 = C115538c0.this;
                if (!c0Var5.mo175582x()) {
                    return true;
                }
                double doubleExtra = c0Var5.mo175604k().getDoubleExtra("KPickPoiLat", -85.0d);
                double doubleExtra2 = c0Var5.mo175604k().getDoubleExtra("KPickPoiLong", -85.0d);
                if (doubleExtra == -85.0d || doubleExtra2 == -1000.0d) {
                    return true;
                }
                c0Var5.f346499E = doubleExtra;
                c0Var5.f346500F = doubleExtra2;
                PickPoi pickPoi = c0Var5.f346544n;
                boolean booleanExtra = c0Var5.mo175604k().getBooleanExtra("key_geo_coder_four_level", false);
                CustomIndoorPicker customIndoorPicker = c0Var5.f346554w;
                double d9 = doubleExtra;
                double d15 = doubleExtra2;
                pickPoi.mo175541b(d9, d15, booleanExtra, customIndoorPicker.f346427H1, customIndoorPicker.f346428I1, customIndoorPicker.f346429J1);
                c0Var5.f346583e.getIController().animateTo(d9, d15, C38446c.m41877a(false));
                c0Var5.mo175581w(false);
                return true;
            }
            C115538c0 c0Var6 = C115538c0.this;
            double d16 = c0Var6.f346501G;
            c0Var6.f346499E = d16;
            double d17 = c0Var6.f346502H;
            c0Var6.f346500F = d17;
            PickPoi pickPoi2 = c0Var6.f346544n;
            boolean booleanExtra2 = c0Var6.mo175604k().getBooleanExtra("key_geo_coder_four_level", false);
            CustomIndoorPicker customIndoorPicker2 = C115538c0.this.f346554w;
            pickPoi2.mo175541b(d16, d17, booleanExtra2, customIndoorPicker2.f346427H1, customIndoorPicker2.f346428I1, customIndoorPicker2.f346429J1);
            C118911c iController = C115538c0.this.f346583e.getIController();
            C115538c0 c0Var7 = C115538c0.this;
            iController.animateTo(c0Var7.f346501G, c0Var7.f346502H, C38446c.m41877a(false));
            C115538c0 c0Var8 = C115538c0.this;
            if (c0Var8.f346504J) {
                return true;
            }
            c0Var8.mo175581w(false);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$f */
    public class C115545f implements Runnable {
        public C115545f() {
        }

        public void run() {
            View currentFocus;
            C115538c0 c0Var = C115538c0.this;
            c0Var.f346541j1 = true;
            c0Var.f346523W0.requestFocus();
            C115538c0 c0Var2 = C115538c0.this;
            InputMethodManager inputMethodManager = (InputMethodManager) c0Var2.f346582d.getSystemService("input_method");
            if (!(inputMethodManager == null || (currentFocus = c0Var2.f346582d.getCurrentFocus()) == null || currentFocus.getWindowToken() == null)) {
                inputMethodManager.toggleSoftInput(0, 2);
            }
            Log.m105924i("MicroMsg.MMPoiMapUI", "showSoftInputMethod");
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$g */
    public class C115546g extends TranslateAnimation {

        /* renamed from: d */
        public List<View> f346568d = new ArrayList();

        public C115546g(C115538c0 c0Var, float f, float f2, float f3, float f4) {
            super(f, f2, f3, f4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$h */
    public interface C115547h {
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.c0$i */
    public enum C115548i {
        COLLAPSED,
        OPENED
    }

    public C115538c0(Activity activity) {
        super(activity);
    }

    /* renamed from: n */
    public static void m162435n(C115538c0 c0Var) {
        byte[] bArr;
        c0Var.getClass();
        Log.m105924i("MicroMsg.MMPoiMapUI", "loadingMore");
        if (c0Var.f346555x != null) {
            Log.m105924i("MicroMsg.MMPoiMapUI", "scene is doing");
            return;
        }
        boolean z = c0Var.f346504J;
        if (z) {
            bArr = c0Var.f346551t.f346593g;
            if (bArr == null) {
                Log.m105924i("MicroMsg.MMPoiMapUI", "buffer is null");
                return;
            }
        } else {
            bArr = c0Var.f346550s.f346593g;
            if (bArr == null) {
                Log.m105924i("MicroMsg.MMPoiMapUI", "buffer is null");
                return;
            }
        }
        if (!z) {
            c0Var.f346503I = c0Var.f346550s.f346595i;
        }
        C118450o52 o522 = new C118450o52();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        o522.f354175g = qv32;
        o522.f354177i = c0Var.f346499E;
        o522.f354176h = c0Var.f346500F;
        o522.f354172d = 0;
        o522.f354173e = c0Var.f346504J ^ true ? 1 : 0;
        o522.f354178j = c0Var.f346502H;
        o522.f354179n = c0Var.f346501G;
        o522.f354174f = c0Var.f346505K;
        o522.f354180o = 0;
        o522.f354181p = (double) c0Var.f346583e.getZoomLevel();
        CustomIndoorPicker customIndoorPicker = c0Var.f346554w;
        o522.f354183r = customIndoorPicker.f346427H1;
        o522.f354184s = customIndoorPicker.f346428I1;
        o522.f354185t = customIndoorPicker.f346429J1;
        c0Var.f346555x = new C118350n(o522, c0Var.f346503I);
        C86709a0.m107524d().mo123460f(c0Var.f346555x);
        c0Var.f346518U++;
    }

    /* renamed from: o */
    public static void m162436o(C115538c0 c0Var, int i) {
        int i2;
        View childAt = c0Var.f346546p.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= c0Var.f346546p.getChildCount()) {
                    i2 = 0;
                    break;
                }
                i4 = c0Var.f346546p.getChildAt(i3).getTop();
                if (i4 <= 0 && i4 > (-height)) {
                    i2 = c0Var.f346546p.getFirstVisiblePosition() + i3;
                    break;
                }
                i3++;
            }
            Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin top: %s, poiOri: %s, poiDes: %s.", Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i));
            int i5 = i - i2;
            Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin offset: %s.", Integer.valueOf(i5));
            int i6 = (height * i5) + i4;
            Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin distance: %s.", Integer.valueOf(i6));
            if (i6 != 0) {
                c0Var.f346546p.smoothScrollBy(i6, Math.abs(i5) > 10 ? Math.abs(i5) * 100 : 300);
            }
        }
    }

    /* renamed from: p */
    public static void m162437p(C115538c0 c0Var) {
        View currentFocus;
        IBinder windowToken;
        if (c0Var.f346541j1) {
            c0Var.f346541j1 = false;
            c0Var.f346523W0.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) c0Var.f346582d.getSystemService("input_method");
            if (inputMethodManager != null && (currentFocus = c0Var.f346582d.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    /* renamed from: A */
    public final void mo175569A(C115568o oVar, C42503p pVar, boolean z) {
        Intent intent = new Intent();
        LocationIntent locationIntent = new LocationIntent();
        locationIntent.f211456d = oVar.f346611d;
        locationIntent.f211457e = oVar.f346610c;
        locationIntent.f211464o = oVar.f346617j;
        locationIntent.f211460h = oVar.f346608a;
        locationIntent.f211459g = oVar.f346609b;
        locationIntent.f211462j = oVar.f346612e;
        locationIntent.f211463n = oVar.f346620m;
        locationIntent.f211458f = this.f346583e.getZoomLevel();
        locationIntent.f211465p = oVar.f346612e;
        if (!z && oVar.f346621n != null) {
            locationIntent.f211471v = "nearby_" + oVar.f346621n;
        }
        if (pVar != null) {
            locationIntent.f211466q = z;
            locationIntent.f211467r = pVar.f115042a;
            locationIntent.f211468s = pVar.f115043b;
            locationIntent.f211469t = pVar.f115044c;
            locationIntent.f211470u = pVar.f115045d;
        }
        CustomIndoorPicker customIndoorPicker = this.f346554w;
        locationIntent.f211472w = customIndoorPicker.f346428I1;
        locationIntent.f211473x = customIndoorPicker.f346429J1;
        if (this.f346584f == 0) {
            int i = 11;
            int i2 = this.f346550s.f346592f;
            boolean z2 = this.f346528Z;
            if (z2) {
                i = 13;
            }
            mo175576r(i, i2, z2);
        }
        intent.putExtra("KLocationIntent", locationIntent);
        this.f346582d.setResult(-1, intent);
        this.f346582d.finish();
        FinishSelectPOIStruct finishSelectPOIStruct = this.f346556x0;
        int i3 = 1;
        finishSelectPOIStruct.f343725d = (long) 1;
        finishSelectPOIStruct.f343729h = (long) this.f346554w.getShowTimes();
        finishSelectPOIStruct.f343730i = (long) this.f346554w.getClickTimes();
        finishSelectPOIStruct.f343731j = this.f346554w.f346427H1 == 1 ? 1 : 2;
        int distanceBetween = (int) TencentLocationUtils.distanceBetween(locationIntent.f211456d, locationIntent.f211457e, this.f346501G, this.f346502H);
        if (distanceBetween > 30) {
            i3 = distanceBetween <= 100 ? 2 : distanceBetween <= 1000 ? 3 : distanceBetween > 1000 ? 4 : 0;
        }
        finishSelectPOIStruct.f343732k = (long) i3;
        long j = this.f346556x0.f343727f;
        if (j == 0) {
            j = 5;
        }
        finishSelectPOIStruct.f343727f = j;
        finishSelectPOIStruct.mo86054n();
    }

    /* renamed from: B */
    public final void mo175570B(C115548i iVar) {
        if (C115548i.COLLAPSED == iVar) {
            ((FrameLayout.LayoutParams) this.f346506L.getLayoutParams()).topMargin = this.f346507M;
            ((RelativeLayout.LayoutParams) this.f346516T.getLayoutParams()).topMargin = 0;
            ((RelativeLayout.LayoutParams) ((View) this.f346553v.getParent()).getLayoutParams()).bottomMargin = C76577a.m92151b(this.f346582d, 36);
            CustomIndoorPicker customIndoorPicker = this.f346554w;
            if (customIndoorPicker.f346427H1 == 1) {
                customIndoorPicker.setVisibility(0);
            }
            this.f346583e.setLogoMargin(this.f346511Q0);
        } else if (C115548i.OPENED == iVar) {
            ((FrameLayout.LayoutParams) this.f346506L.getLayoutParams()).topMargin = this.f346508N;
            ((RelativeLayout.LayoutParams) this.f346516T.getLayoutParams()).topMargin = -this.f346509P;
            ((RelativeLayout.LayoutParams) ((View) this.f346553v.getParent()).getLayoutParams()).bottomMargin = ((this.f346507M - this.f346508N) - this.f346509P) + C76577a.m92151b(this.f346582d, 36);
            this.f346554w.setVisibility(8);
            this.f346583e.setLogoMargin(this.f346513R0);
        }
        this.f346506L.requestLayout();
        this.f346553v.requestLayout();
        this.f346516T.requestLayout();
    }

    /* renamed from: C */
    public final void mo175571C() {
        if (!this.f346541j1) {
            this.f346523W0.requestFocus();
            this.f346523W0.post(new C115545f());
        }
    }

    /* renamed from: D */
    public final void mo175572D() {
        if (this.f346504J) {
            View view = this.f346519U0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f346521V0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f346527Y0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view7 = this.f346519U0;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(0);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view9 = this.f346521V0;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view10 = this.f346527Y0;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view11 = view10;
        C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view11, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: a */
    public boolean mo129355a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        Log.m105918d("MicroMsg.MMPoiMapUI", "dispatchKeyEvent, back.");
        FinishSelectPOIStruct finishSelectPOIStruct = this.f346556x0;
        finishSelectPOIStruct.f343725d = (long) 2;
        finishSelectPOIStruct.f343729h = (long) this.f346554w.getShowTimes();
        finishSelectPOIStruct.f343730i = (long) this.f346554w.getClickTimes();
        finishSelectPOIStruct.mo86054n();
        if (this.f346504J) {
            mo175578t();
            mo175576r(14, this.f346551t.f346592f, true);
            return false;
        }
        mo175576r(12, this.f346550s.f346592f, false);
        this.f346582d.finish();
        return true;
    }

    /* renamed from: e */
    public void mo129378e(Bundle bundle) {
        this.f346582d.setContentView(C0966R.C0971layout.bn9);
        int intExtra = mo175604k().getIntExtra("map_view_type", 0);
        this.f346584f = intExtra;
        Log.m105925i("MicroMsg.MMBaseMapUI", "init oncreate type %d", Integer.valueOf(intExtra));
        this.f346583e = C115562l.vx0(this.f346582d);
        if (((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, (C113177k.C113178a) null)) {
            ((FrameLayout) mo175603j(C0966R.C0970id.goe)).addView((SoSoMapView) this.f346583e);
        }
        this.f346583e.setMapViewOnTouchListener(new C115554h(this));
        this.f346583e.setMapAnchor(0.5f, 0.5f);
        ((SoSoMapView) this.f346583e).getMap().setOnMapClickListener(new C115556i(this));
        ((SoSoMapView) this.f346583e).getMap().setOnMapPoiClickListener(new C115558j(this));
        Window window = this.f346582d.getWindow();
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
        C86709a0.m107524d().mo123455a(457, this);
        C86709a0.m107524d().mo123455a(11363, this);
        this.f346526Y = (int) (System.currentTimeMillis() / 1000);
        Class cls = C98522w3.class;
        this.f346583e.setCanRotate(false);
        this.f346554w = (CustomIndoorPicker) mo175603j(C0966R.C0970id.f357821o63);
        TencentMap tencentMap = this.f346583e.getViewManager().getTencentMap();
        if (tencentMap != null) {
            this.f346583e.enableIndoorLevelPick(false);
            tencentMap.setIndoorEnabled(false);
            if (mo175604k().getIntExtra("map_indoor_support", 0) == 1) {
                tencentMap.setIndoorEnabled(true);
                this.f346554w.mo175534x1(tencentMap, new C115559j0(this));
            }
        }
        if (C85875k4.m106211z()) {
            ((SoSoMapView) this.f346583e).enableDarkMode();
        } else {
            ((SoSoMapView) this.f346583e).disableDarkMode();
        }
        this.f346497C = (LinearLayout) mo175603j(C0966R.C0970id.eug);
        ((TextView) mo175603j(C0966R.C0970id.ala)).setText(C0966R.string.f7926wf);
        View j = mo175603j(C0966R.C0970id.ko9);
        this.f346557y = j;
        j.setOnClickListener(new C115561k0(this));
        View view = this.f346557y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346559z = mo175603j(C0966R.C0970id.ko_);
        this.f346495A = mo175603j(C0966R.C0970id.amb);
        int i = this.f346584f;
        if (i == 0) {
            ((TextView) mo175603j(C0966R.C0970id.amb)).setText(C0966R.string.gbh);
        } else if (i == 3) {
            ((TextView) mo175603j(C0966R.C0970id.amb)).setText(C0966R.string.f360089a13);
        } else if (i == 8) {
            if (mo175604k().getIntExtra("type_pick_location_btn", 1) == 2) {
                ((TextView) mo175603j(C0966R.C0970id.amb)).setText(C0966R.string.f7566ju);
            } else {
                ((TextView) mo175603j(C0966R.C0970id.amb)).setText(C0966R.string.f8014z_);
            }
        }
        this.f346559z.setOnClickListener(new C115563l0(this));
        View view3 = this.f346559z;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo175577s(false);
        this.f346506L = (RelativeLayout) mo175603j(C0966R.C0970id.g4d);
        this.f346545o = (MMLoadMoreListView) this.f346582d.findViewById(C0966R.C0970id.hyl);
        this.f346546p = (MMLoadMoreListView) this.f346582d.findViewById(C0966R.C0970id.j68);
        this.f346552u = mo175603j(C0966R.C0970id.g2z);
        this.f346496B = (TextView) mo175603j(C0966R.C0970id.j5j);
        this.f346538i = (PoiHeaderView) mo175603j(C0966R.C0970id.hye);
        this.f346548q = View.inflate(this.f346582d, C0966R.C0971layout.d_s, (ViewGroup) null);
        this.f346549r = View.inflate(this.f346582d, C0966R.C0971layout.d_s, (ViewGroup) null);
        ((C98522w3) C86312j.m106911c(cls)).mo3990Ai(this.f346548q, false, true, "add_poi_using_qqmap_in_poi_page", (Map<String, Object>) null);
        ((C98522w3) C86312j.m106911c(cls)).mo3990Ai(this.f346549r, false, true, "add_poi_using_qqmap_in_poi_page", (Map<String, Object>) null);
        int c = C75044y4.m89991c(this.f346582d);
        ViewGroup.LayoutParams layoutParams = this.f346546p.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c;
            this.f346546p.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f346545o.getLayoutParams();
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = c;
            this.f346545o.setLayoutParams(layoutParams2);
        }
        this.f346516T = (FrameLayout) mo175603j(C0966R.C0970id.gof);
        LocationCrossHairView locationCrossHairView = (LocationCrossHairView) mo175603j(C0966R.C0970id.g44);
        this.f346553v = locationCrossHairView;
        locationCrossHairView.setSelected(true);
        this.f346553v.setContentDescription(this.f346582d.getString(C0966R.string.gau));
        this.f346553v.setOnClickListener(new C115564m0(this));
        this.f346583e.setBuiltInZoomControls(false);
        this.f346540j = (FrameLayout) mo175603j(C0966R.C0970id.bsx);
        this.f346498D = new MyPoiPoint((Context) this.f346582d, this.f346583e);
        PickPoi pickPoi = new PickPoi(this.f346582d);
        this.f346544n = pickPoi;
        pickPoi.setOnCurPoiGet(new C115567n0(this));
        this.f346540j.addView(this.f346544n);
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LAST_LOCATION_STRING, "");
        if (!Util.isNullOrNil(str) && (this.f346501G == -85.0d || this.f346502H == -1000.0d)) {
            String[] split = str.split(",");
            Log.m105924i("MicroMsg.MMPoiMapUI", "last locationInfo " + str);
            if (split.length == 2) {
                this.f346583e.getIController().animateTo((double) ((float) ((((double) Util.safeParseInt(split[0])) * 1.0d) / 1000000.0d)), (double) ((float) ((((double) Util.safeParseInt(split[1])) * 1.0d) / 1000000.0d)));
            }
        }
        C115569o0 o0Var = new C115569o0(this);
        this.f346529Z0 = o0Var;
        this.f346545o.setOnTouchListener(o0Var);
        this.f346545o.setOnLoadMoreListener(new C115570p0(this));
        this.f346545o.setOnItemClickListener(new C115572q0(this));
        C115565n nVar = new C115565n(this.f346582d);
        this.f346550s = nVar;
        this.f346545o.setAdapter(nVar);
        this.f346544n.setAdapter(this.f346550s);
        this.f346530a1 = new C115581w(this);
        C115565n nVar2 = new C115565n(this.f346582d);
        this.f346551t = nVar2;
        nVar2.f346597n = true;
        nVar2.f346592f = -1;
        this.f346546p.setAdapter(nVar2);
        this.f346546p.setOnLoadMoreListener(new C115582x(this));
        this.f346546p.setOnItemClickListener(new C115583y(this));
        this.f346546p.setOnTouchListener(this.f346529Z0);
        this.f346519U0 = mo175603j(C0966R.C0970id.jbe);
        this.f346521V0 = mo175603j(C0966R.C0970id.jbg);
        this.f346523W0 = (EditText) mo175603j(C0966R.C0970id.jbd);
        this.f346525X0 = (ImageView) mo175603j(C0966R.C0970id.jbi);
        this.f346527Y0 = mo175603j(C0966R.C0970id.jbc);
        this.f346519U0.setOnClickListener(new C115549d0(this));
        this.f346527Y0.setOnClickListener(new C115551e0(this));
        this.f346523W0.setOnTouchListener(new C115552f0(this));
        this.f346506L.setClickable(true);
        this.f346523W0.setOnEditorActionListener(new C115553g0(this));
        this.f346523W0.addTextChangedListener(new C115555h0(this));
        this.f346525X0.setOnClickListener(new C115557i0(this));
        mo175572D();
        View j2 = mo175603j(C0966R.C0970id.jbb);
        this.f346515S0 = j2;
        j2.post(new C42505z(this));
        mo175603j(C0966R.C0970id.jba).setOnClickListener(new C115535a0(this));
        ((InputPanelFrameLayout) mo175603j(C0966R.C0970id.hym)).setExternalListener(new C115537b0(this));
        Point h = C85875k4.m106184h(this.f346582d);
        int max = Math.max(h.x, h.y);
        int fromDPToPix = max - BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f346582d, 320.0f);
        this.f346507M = fromDPToPix;
        int i2 = (int) (((double) (((float) max) * 0.25f)) + 0.5d);
        this.f346508N = i2;
        this.f346509P = (int) ((((double) (fromDPToPix - i2)) / 3.0d) + 0.5d);
        Log.m105925i("MicroMsg.MMPoiMapUI", "collapsedTopMargin: %d, openedTopMargin: %d, mapViewTopMargin: %d.", Integer.valueOf(fromDPToPix), Integer.valueOf(this.f346508N), Integer.valueOf(this.f346509P));
        this.f346513R0 = new int[]{((this.f346507M - this.f346508N) - this.f346509P) + 24, 24};
        int identifier = this.f346582d.getResources().getIdentifier("status_bar_height", "dimen", Platform.ANDROID);
        int dimensionPixelSize = identifier > 0 ? this.f346582d.getResources().getDimensionPixelSize(identifier) : 0;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f346497C.getLayoutParams();
        layoutParams3.height += dimensionPixelSize * 2;
        this.f346497C.setLayoutParams(layoutParams3);
        this.f346497C.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        int i3 = max - this.f346508N;
        ViewGroup.LayoutParams layoutParams4 = this.f346506L.getLayoutParams();
        layoutParams4.height = i3;
        this.f346506L.setLayoutParams(layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f346516T.getLayoutParams();
        layoutParams5.height = this.f346507M;
        this.f346516T.setLayoutParams(layoutParams5);
        mo175570B(C115548i.COLLAPSED);
        int i4 = this.f346584f;
        if (i4 == 0 || i4 == 8) {
            this.f346556x0.f343726e = (long) C94166g.m119051a(mo175604k().getIntExtra("type_tag", 0));
        } else {
            this.f346556x0.f343726e = (long) C94166g.m119051a(i4);
        }
        this.f346544n.getViewTreeObserver().addOnGlobalLayoutListener(new C115541c());
    }

    /* renamed from: f */
    public void mo129379f() {
        this.f346583e.destroy();
        C86709a0.m107524d().mo123470p(457, this);
        C86709a0.m107524d().mo123470p(11363, this);
    }

    /* renamed from: h */
    public void mo129381h() {
        this.f346539i1 = false;
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this.f346537h1);
        MyPoiPoint myPoiPoint = this.f346498D;
        myPoiPoint.getClass();
        Log.m105918d("MicroMsg.MyPoiPoint", "disableLocation");
        myPoiPoint.f346354e.mo126408b(myPoiPoint.f346357h);
    }

    /* renamed from: i */
    public void mo129382i() {
        this.f346539i1 = true;
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.LOCAION, new C115542d())) {
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126412f(this.f346537h1, true);
        }
        MyPoiPoint myPoiPoint = this.f346498D;
        myPoiPoint.getClass();
        Log.m105918d("MicroMsg.MyPoiPoint", "enableLocation");
        myPoiPoint.f346354e.mo126412f(myPoiPoint.f346357h, true);
    }

    /* renamed from: l */
    public void mo175573l(LatLng latLng) {
        PickPoi pickPoi = this.f346544n;
        pickPoi.f346441f.clearAnimation();
        pickPoi.f346441f.startAnimation(pickPoi.f346440e);
        this.f346499E = latLng.getLatitude();
        double longitude = latLng.getLongitude();
        this.f346500F = longitude;
        PickPoi pickPoi2 = this.f346544n;
        double d = this.f346499E;
        boolean booleanExtra = mo175604k().getBooleanExtra("key_geo_coder_four_level", false);
        CustomIndoorPicker customIndoorPicker = this.f346554w;
        pickPoi2.mo175541b(d, longitude, booleanExtra, customIndoorPicker.f346427H1, customIndoorPicker.f346428I1, customIndoorPicker.f346429J1);
        this.f346553v.setSelected(false);
        if (this.f346514S) {
            mo175583y(C115548i.COLLAPSED);
        }
        if (this.f346504J) {
            this.f346536g1 = false;
            mo175578t();
        } else {
            ((SoSoMapView) this.f346583e).getIController().animateTo(this.f346499E, this.f346500F);
        }
        mo175581w(false);
        this.f346528Z = false;
        FinishSelectPOIStruct finishSelectPOIStruct = this.f346556x0;
        finishSelectPOIStruct.f343728g = 0;
        finishSelectPOIStruct.f343727f = (long) 3;
        ((SoSoMapView) this.f346583e).announceForAccessibility(this.f346582d.getString(C0966R.string.gbg));
    }

    /* renamed from: m */
    public void mo175574m() {
        if (this.f346553v.isSelected()) {
            this.f346553v.setSelected(false);
        }
        if (!this.f346504J) {
            PickPoi pickPoi = this.f346544n;
            pickPoi.f346441f.clearAnimation();
            pickPoi.f346441f.startAnimation(pickPoi.f346440e);
            this.f346499E = ((double) this.f346583e.getMapCenterX()) / 1000000.0d;
            double mapCenterY = ((double) this.f346583e.getMapCenterY()) / 1000000.0d;
            this.f346500F = mapCenterY;
            PickPoi pickPoi2 = this.f346544n;
            double d = this.f346499E;
            boolean booleanExtra = mo175604k().getBooleanExtra("key_geo_coder_four_level", false);
            CustomIndoorPicker customIndoorPicker = this.f346554w;
            pickPoi2.mo175541b(d, mapCenterY, booleanExtra, customIndoorPicker.f346427H1, customIndoorPicker.f346428I1, customIndoorPicker.f346429J1);
            this.f346553v.setSelected(false);
            if (this.f346514S) {
                mo175583y(C115548i.COLLAPSED);
            }
            mo175581w(false);
            this.f346528Z = false;
            FinishSelectPOIStruct finishSelectPOIStruct = this.f346556x0;
            finishSelectPOIStruct.f343728g = 0;
            finishSelectPOIStruct.f343727f = (long) 3;
        }
    }

    public void onBusinessPermissionDenied(String str) {
        this.f346582d.finish();
    }

    public void onBusinessPermissionGranted(String str) {
        this.f346582d.recreate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0209, code lost:
        r9 = r5.f346398g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r21.getType()
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 457(0x1c9, float:6.4E-43)
            if (r1 != r5) goto L_0x0273
            if (r18 != 0) goto L_0x0272
            if (r19 == 0) goto L_0x0013
            goto L_0x0272
        L_0x0013:
            r0.f346555x = r3
            r1 = r21
            t22.n r1 = (t22.C118350n) r1
            java.lang.String r5 = r1.f353713n
            java.lang.String r6 = r0.f346503I
            boolean r5 = r5.equals(r6)
            java.lang.String r6 = "MicroMsg.MMPoiMapUI"
            if (r5 != 0) goto L_0x0046
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "pass this resp!"
            r2.append(r3)
            java.lang.String r3 = r0.f346503I
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r1 = r1.f353713n
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return
        L_0x0046:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "isEnd: "
            r5.append(r7)
            boolean r7 = r1.f353712j
            r5.append(r7)
            java.lang.String r7 = " searchId: "
            r5.append(r7)
            java.lang.String r7 = r1.f353709g
            r5.append(r7)
            java.lang.String r7 = " isInSearch: "
            r5.append(r7)
            boolean r7 = r0.f346504J
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            long r7 = r0.f346520V
            r9 = -1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0081
            long r7 = java.lang.System.currentTimeMillis()
            r0.f346522W = r7
            r0.f346520V = r7
            goto L_0x0087
        L_0x0081:
            long r7 = java.lang.System.currentTimeMillis()
            r0.f346522W = r7
        L_0x0087:
            int r5 = r1.f353714o
            r0.f346547p0 = r5
            android.view.View r5 = r0.f346552u
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r14 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r15.mo10233c(r7)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI"
            java.lang.String r10 = "onSceneEnd"
            java.lang.String r11 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r7 = r5
            r14 = r16
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI"
            java.lang.String r9 = "onSceneEnd"
            java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r5
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            boolean r5 = r0.f346504J
            if (r5 == 0) goto L_0x0155
            java.lang.String r5 = r0.f346505K
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x00dd
            return
        L_0x00dd:
            java.util.List<com.tencent.mm.plugin.location.ui.impl.o> r5 = r1.f353710h
            if (r5 == 0) goto L_0x00f3
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r5 != 0) goto L_0x00f3
            android.widget.TextView r5 = r0.f346496B
            r5.setVisibility(r4)
            com.tencent.mm.ui.base.MMLoadMoreListView r5 = r0.f346546p
            r5.mo101727b()
        L_0x00f3:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            boolean r7 = r1.f353708f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5[r4] = r7
            java.lang.String r7 = "search is first: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r5)
            boolean r5 = r1.f353708f
            if (r5 == 0) goto L_0x0111
            com.tencent.mm.plugin.location.ui.impl.n r5 = r0.f346551t
            r5.f346598o = r2
            java.util.List<com.tencent.mm.plugin.location.ui.impl.o> r2 = r5.f346590d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
        L_0x0111:
            com.tencent.mm.plugin.location.ui.impl.n r2 = r0.f346551t
            java.util.List<com.tencent.mm.plugin.location.ui.impl.o> r5 = r1.f353710h
            byte[] r6 = r1.f353711i
            boolean r7 = r1.f353712j
            java.lang.String r1 = r1.f353713n
            r2.mo175609a(r5, r6, r7, r1)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r0.f346551t
            boolean r1 = r1.f346594h
            if (r1 != 0) goto L_0x012f
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346546p
            r1.mo101731g()
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346546p
            r1.mo101728c()
            goto L_0x014a
        L_0x012f:
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346546p
            r1.mo101727b()
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346546p
            android.view.View r2 = r1.f214846d
            r1.removeFooterView(r2)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r0.f346551t
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x014a
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346546p
            android.view.View r2 = r0.f346548q
            r1.addFooterView(r2, r3, r4)
        L_0x014a:
            boolean r1 = r0.f346533d1
            if (r1 == 0) goto L_0x0299
            r0.f346533d1 = r4
            r17.mo175584z()
            goto L_0x0299
        L_0x0155:
            com.tencent.mm.plugin.location.ui.PoiHeaderView r5 = r0.f346538i
            if (r5 == 0) goto L_0x0236
            ob0.c r6 = r1.f353707e
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            te3.p52 r6 = (te3.C118456p52) r6
            java.lang.String r7 = r6.f354225n
            java.lang.String r8 = r6.f354224j
            java.lang.String r6 = r6.f354223i
            java.lang.String r9 = f12.C7970a.m8127a()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r4] = r8
            r10[r2] = r6
            java.lang.String r11 = "MicroMsg.PoiHeaderView"
            java.lang.String r12 = "setContent, url:%s, logUrl:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r10)
            r5.f19878f = r6
            java.lang.String r6 = ""
            r5.f19879g = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r6 != 0) goto L_0x0227
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r6 == 0) goto L_0x018d
            goto L_0x0227
        L_0x018d:
            r5.setVisibility(r4)
            android.widget.TextView r6 = r5.f19877e
            r6.setVisibility(r4)
            com.tencent.mm.plugin.location.ui.SimpleImageView r6 = r5.f19880h
            r6.setVisibility(r4)
            android.widget.TextView r6 = r5.f19877e
            r6.setText(r7)
            com.tencent.mm.plugin.location.ui.SimpleImageView r5 = r5.f19880h
            r5.f346395d = r9
            r5.f346396e = r8
            r5.f346397f = r4
            r5.f346398g = r4
            if (r8 == 0) goto L_0x0221
            int r6 = r8.length()
            if (r6 != 0) goto L_0x01b3
            goto L_0x0221
        L_0x01b3:
            java.lang.String r6 = "http"
            boolean r6 = r8.startsWith(r6)
            if (r6 == 0) goto L_0x01f7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.f346395d
            r6.append(r7)
            byte[] r7 = r8.getBytes()
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.graphics.Bitmap r6 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r6)
            if (r6 == 0) goto L_0x01ea
            int r7 = r5.f346397f
            if (r7 <= 0) goto L_0x01e6
            int r8 = r5.f346398g
            if (r8 <= 0) goto L_0x01e6
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r6, r7, r8, r2, r4)
        L_0x01e6:
            r5.setImageBitmap(r6)
            goto L_0x0236
        L_0x01ea:
            com.tencent.mm.plugin.location.ui.SimpleImageView$b r6 = new com.tencent.mm.plugin.location.ui.SimpleImageView$b
            com.tencent.mm.sdk.platformtools.MMHandler r5 = r5.f346399h
            r6.<init>(r8, r5)
            java.lang.String r5 = "SimpleImageView_download"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r6, r5)
            goto L_0x0236
        L_0x01f7:
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r6 != 0) goto L_0x0203
            r6 = 8
            r5.setVisibility(r6)
            goto L_0x0236
        L_0x0203:
            r6 = 8
            int r7 = r5.f346397f
            if (r7 <= 0) goto L_0x0213
            int r9 = r5.f346398g
            if (r9 > 0) goto L_0x020e
            goto L_0x0213
        L_0x020e:
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r8, r7, r9, r2)
            goto L_0x0217
        L_0x0213:
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r8)
        L_0x0217:
            if (r7 != 0) goto L_0x021d
            r5.setVisibility(r6)
            goto L_0x0236
        L_0x021d:
            r5.setImageBitmap(r7)
            goto L_0x0236
        L_0x0221:
            r6 = 8
            r5.setVisibility(r6)
            goto L_0x0236
        L_0x0227:
            r6 = 8
            r5.setVisibility(r6)
            android.widget.TextView r7 = r5.f19877e
            r7.setVisibility(r6)
            com.tencent.mm.plugin.location.ui.SimpleImageView r5 = r5.f19880h
            r5.setVisibility(r6)
        L_0x0236:
            r0.mo175577s(r2)
            com.tencent.mm.plugin.location.ui.impl.n r2 = r0.f346550s
            java.util.List<com.tencent.mm.plugin.location.ui.impl.o> r5 = r1.f353710h
            byte[] r6 = r1.f353711i
            boolean r7 = r1.f353712j
            java.lang.String r1 = r1.f353713n
            r2.mo175609a(r5, r6, r7, r1)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r0.f346550s
            r1.f346592f = r4
            r1.notifyDataSetChanged()
            com.tencent.mm.plugin.location.ui.impl.n r1 = r0.f346550s
            boolean r1 = r1.f346594h
            if (r1 != 0) goto L_0x025e
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346545o
            r1.mo101731g()
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346545o
            r1.mo101728c()
            goto L_0x0299
        L_0x025e:
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346545o
            r1.mo101727b()
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346545o
            android.view.View r2 = r1.f214846d
            r1.removeFooterView(r2)
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346545o
            android.view.View r2 = r0.f346549r
            r1.addFooterView(r2, r3, r4)
            goto L_0x0299
        L_0x0272:
            return
        L_0x0273:
            int r1 = r21.getType()
            r5 = 11363(0x2c63, float:1.5923E-41)
            if (r1 != r5) goto L_0x0299
            qo3.i0 r1 = r0.f346535f1
            if (r1 == 0) goto L_0x0284
            r1.dismiss()
            r0.f346535f1 = r3
        L_0x0284:
            r1 = r21
            t22.m r1 = (t22.C48534m) r1
            if (r18 != 0) goto L_0x0294
            if (r19 != 0) goto L_0x0294
            com.tencent.mm.plugin.location.ui.impl.o r3 = r1.f129803e
            com.tencent.mm.plugin.location.ui.impl.p r1 = r1.f129804f
            r0.mo175569A(r3, r1, r2)
            goto L_0x0299
        L_0x0294:
            com.tencent.mm.plugin.location.ui.impl.o r1 = r1.f129803e
            r0.mo175569A(r1, r3, r4)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: q */
    public final void mo175575q() {
        for (PoiPoint poiPoint : ((HashMap) this.f346532c1).values()) {
            if (poiPoint.f346383t) {
                poiPoint.f346371e.removeView(poiPoint);
            }
            poiPoint.f346383t = false;
        }
        ((HashMap) this.f346532c1).clear();
        this.f346531b1 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9 A[ADDED_TO_REGION] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175576r(int r21, int r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            double r2 = r0.f346501G
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = -4587690276662804480(0xc055400000000000, double:-85.0)
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0039
            double r8 = r0.f346502H
            r10 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0022
            goto L_0x0039
        L_0x0022:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r8[r6] = r2
            double r2 = r0.f346502H
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = "%f/%f"
            java.lang.String r2 = java.lang.String.format(r2, r8)
            goto L_0x003b
        L_0x0039:
            java.lang.String r2 = "null/null"
        L_0x003b:
            java.lang.String r3 = ""
            if (r23 != 0) goto L_0x005a
            if (r1 < 0) goto L_0x0075
            com.tencent.mm.plugin.location.ui.impl.n r8 = r0.f346550s
            int r8 = r8.getCount()
            if (r1 >= r8) goto L_0x0075
            com.tencent.mm.plugin.location.ui.impl.n r8 = r0.f346550s
            com.tencent.mm.plugin.location.ui.impl.o r8 = r8.getItem(r1)
            java.lang.String r8 = r8.f346618k
            com.tencent.mm.plugin.location.ui.impl.n r9 = r0.f346550s
            com.tencent.mm.plugin.location.ui.impl.o r9 = r9.getItem(r1)
            java.lang.String r9 = r9.f346612e
            goto L_0x0077
        L_0x005a:
            if (r1 < 0) goto L_0x0075
            com.tencent.mm.plugin.location.ui.impl.n r8 = r0.f346551t
            int r8 = r8.getCount()
            if (r1 >= r8) goto L_0x0075
            com.tencent.mm.plugin.location.ui.impl.n r8 = r0.f346551t
            com.tencent.mm.plugin.location.ui.impl.o r8 = r8.getItem(r1)
            java.lang.String r8 = r8.f346618k
            com.tencent.mm.plugin.location.ui.impl.n r9 = r0.f346551t
            com.tencent.mm.plugin.location.ui.impl.o r9 = r9.getItem(r1)
            java.lang.String r9 = r9.f346612e
            goto L_0x0077
        L_0x0075:
            r8 = r3
            r9 = r8
        L_0x0077:
            java.lang.String r10 = "MicroMsg.MMPoiMapUI"
            if (r1 != 0) goto L_0x0096
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r11 == 0) goto L_0x0096
            com.tencent.mm.plugin.location.ui.impl.n r11 = r0.f346550s
            int r11 = r11.getCount()
            if (r11 <= r5) goto L_0x0096
            java.lang.String r8 = "set searchid in first poi"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r8)
            com.tencent.mm.plugin.location.ui.impl.n r8 = r0.f346550s
            com.tencent.mm.plugin.location.ui.impl.o r8 = r8.getItem(r5)
            java.lang.String r8 = r8.f346618k
        L_0x0096:
            com.tencent.mm.plugin.location.ui.impl.n r11 = r0.f346550s
            int r11 = r11.getCount()
            if (r11 <= 0) goto L_0x00b6
            if (r23 != 0) goto L_0x00b6
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r22)
            r11[r6] = r12
            java.lang.String r12 = "set request id at index: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r12, r11)
            com.tencent.mm.plugin.location.ui.impl.n r11 = r0.f346550s
            com.tencent.mm.plugin.location.ui.impl.o r11 = r11.getItem(r6)
            java.lang.String r11 = r11.f346619l
            goto L_0x00b7
        L_0x00b6:
            r11 = r3
        L_0x00b7:
            if (r1 != 0) goto L_0x00db
            if (r23 != 0) goto L_0x00db
            com.tencent.mm.plugin.location.ui.impl.n r12 = r0.f346550s
            int r12 = r12.getCount()
            if (r12 <= 0) goto L_0x00db
            com.tencent.mm.plugin.location.ui.impl.n r12 = r0.f346550s
            com.tencent.mm.plugin.location.ui.impl.o r12 = r12.getItem(r6)
            int r12 = r12.f346624q
            if (r12 < 0) goto L_0x00db
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r1[r6] = r13
            java.lang.String r13 = "change to search index: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r13, r1)
            goto L_0x00dc
        L_0x00db:
            r12 = r1
        L_0x00dc:
            r1 = 10
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r21)
            r13[r6] = r14
            int r12 = r12 + r5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r13[r5] = r14
            long r14 = r0.f346524X
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r4] = r14
            long r14 = r0.f346522W
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = 3
            r13[r15] = r14
            long r4 = r0.f346520V
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 4
            r13[r5] = r4
            int r4 = r0.f346518U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r16 = 5
            r13[r16] = r4
            r4 = 6
            r13[r4] = r2
            int r14 = r0.f346526Y
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r17 = 7
            r13[r17] = r14
            r14 = 8
            r13[r14] = r8
            r18 = 9
            r13[r18] = r11
            java.lang.String r1 = "tofutest type:%d, index: %d, startTime: %s, lastTime: %s, firsSuccTime: %s, poiCount: %s, latlng: %s, entryTime: %s, searchId: %s, requestId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r1, r13)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 18
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r19 = java.lang.Integer.valueOf(r21)
            r13[r6] = r19
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r12 = 1
            r13[r12] = r6
            r6 = r11
            long r10 = r0.f346524X
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 2
            r13[r11] = r10
            long r10 = r0.f346522W
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r13[r15] = r10
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r13[r5] = r10
            long r10 = r0.f346520V
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r13[r16] = r5
            int r5 = r0.f346518U
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13[r4] = r5
            r13[r17] = r2
            r13[r14] = r9
            int r2 = r0.f346526Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13[r18] = r2
            r2 = 10
            r13[r2] = r8
            r2 = 11
            r4 = 1
            java.lang.String r4 = p156gj.C87203t.m108270f(r4)
            r13[r2] = r4
            r2 = 12
            r13[r2] = r7
            r2 = 13
            r13[r2] = r7
            r2 = 14
            r13[r2] = r7
            r2 = 15
            r13[r2] = r3
            r2 = 16
            r13[r2] = r7
            r2 = 17
            r13[r2] = r6
            r2 = 11135(0x2b7f, float:1.5603E-41)
            r1.mo160131h(r2, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0.mo175576r(int, int, boolean):void");
    }

    /* renamed from: s */
    public final void mo175577s(boolean z) {
        Log.m105919d("MicroMsg.MMPoiMapUI", "enable send.. %b", Boolean.valueOf(z));
        this.f346559z.setEnabled(z);
        this.f346495A.setEnabled(z);
    }

    /* renamed from: t */
    public final void mo175578t() {
        this.f346504J = false;
        this.f346540j.setVisibility(0);
        mo175583y(C115548i.COLLAPSED);
        mo175572D();
        this.f346505K = "";
        this.f346546p.setVisibility(8);
        this.f346550s.notifyDataSetChanged();
        this.f346545o.setVisibility(0);
        View view = this.f346552u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "exitSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "exitSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346496B.setVisibility(8);
        mo175575q();
        mo175577s(true);
        this.f346553v.setSelected(this.f346536g1);
        this.f346583e.getIController().animateTo(this.f346499E, this.f346500F);
    }

    /* renamed from: u */
    public final int mo175579u() {
        return ((ViewGroup.MarginLayoutParams) this.f346506L.getLayoutParams()).topMargin;
    }

    /* renamed from: v */
    public final void mo175580v(C115568o oVar) {
        Activity activity = this.f346582d;
        this.f346535f1 = C89779i0.m112248e(activity, activity.getString(C0966R.string.gat), false, 0, (DialogInterface.OnCancelListener) null);
        C86709a0.m107524d().mo123460f(new C48534m(oVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01c5  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175581w(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.MMPoiMapUI"
            java.lang.String r4 = "stack: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
            double r4 = r13.f346499E
            double r6 = r13.f346500F
            com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r13.f346554w
            java.lang.String r1 = r1.f346429J1
            java.lang.String r8 = r13.f346505K
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 * r10
            int r4 = (int) r4
            r9.append(r4)
            java.lang.String r4 = "_"
            r9.append(r4)
            double r6 = r6 * r10
            int r5 = (int) r6
            r9.append(r5)
            r9.append(r4)
            r9.append(r1)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r1 = r9.toString()
            r13.f346503I = r1
            com.tencent.mm.plugin.location.ui.impl.n r4 = r13.f346550s
            java.lang.String r4 = r4.f346595i
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005e
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String r0 = r13.f346503I
            r14[r3] = r0
            java.lang.String r0 = "same key passed it "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r14)
            return
        L_0x005e:
            android.view.View r1 = r13.f346552u
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI"
            java.lang.String r7 = "initData"
            java.lang.String r8 = "(Z)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI"
            java.lang.String r6 = "initData"
            java.lang.String r7 = "(Z)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r1
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r13.f346504J
            r4 = 0
            java.lang.String r5 = "initData key %s."
            java.lang.String r6 = "MicroMsg.PoiAdapter"
            if (r1 == 0) goto L_0x010b
            int r1 = r13.f346547p0
            if (r1 <= 0) goto L_0x00d7
            if (r14 == 0) goto L_0x00d7
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r13.f346546p
            r1.mo101727b()
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r13.f346546p
            android.view.View r7 = r13.f346548q
            r1.removeFooterView(r7)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346551t
            r1.f346593g = r4
            r1.f346594h = r3
            java.lang.String r4 = r13.f346503I
            r1.f346595i = r4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r1)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346551t
            java.lang.String r4 = r13.f346505K
            r1.f346596j = r4
            r1.f346598o = r3
            byte[] r1 = r1.f346593g
            goto L_0x0155
        L_0x00d7:
            if (r14 != 0) goto L_0x0105
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r13.f346546p
            r1.mo101727b()
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r13.f346546p
            android.view.View r4 = r13.f346548q
            r1.removeFooterView(r4)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346551t
            r1.mo175610b()
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346551t
            java.lang.String r4 = r13.f346503I
            r1.f346595i = r4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r1)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346551t
            java.lang.String r4 = r13.f346505K
            r1.f346596j = r4
            r1.f346598o = r3
            byte[] r4 = r1.f346593g
            r1.notifyDataSetChanged()
            goto L_0x0156
        L_0x0105:
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346551t
            r1.f346598o = r3
            r1 = 0
            goto L_0x0157
        L_0x010b:
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r13.f346545o
            r1.mo101727b()
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r13.f346545o
            android.view.View r4 = r13.f346549r
            r1.removeFooterView(r4)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346550s
            r1.mo175610b()
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346550s
            java.lang.String r4 = r13.f346503I
            r1.f346595i = r4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r1)
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346550s
            r1.notifyDataSetChanged()
            com.tencent.mm.plugin.location.ui.impl.n r1 = r13.f346550s
            byte[] r1 = r1.f346593g
            r13.mo175577s(r3)
            com.tencent.mm.plugin.location.ui.impl.PickPoi r4 = r13.f346544n
            boolean r5 = r4.f346444i
            if (r5 == 0) goto L_0x0155
            com.tencent.mm.plugin.location.ui.impl.o r4 = r4.getPoi()
            com.tencent.mm.plugin.location.ui.impl.n r5 = r13.f346550s
            java.util.List<com.tencent.mm.plugin.location.ui.impl.o> r6 = r5.f346590d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            if (r6 < 0) goto L_0x0155
            java.util.List<com.tencent.mm.plugin.location.ui.impl.o> r6 = r5.f346590d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r3, r4)
            r5.notifyDataSetChanged()
        L_0x0155:
            r4 = r1
        L_0x0156:
            r1 = 1
        L_0x0157:
            if (r1 == 0) goto L_0x01c5
            te3.o52 r1 = new te3.o52
            r1.<init>()
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            if (r4 != 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r2.mo73350k(r4)
        L_0x0169:
            r1.f354175g = r2
            double r4 = r13.f346499E
            r1.f354177i = r4
            double r4 = r13.f346500F
            r1.f354176h = r4
            r1.f354172d = r3
            boolean r2 = r13.f346504J
            r2 = r2 ^ r0
            r1.f354173e = r2
            double r2 = r13.f346502H
            r1.f354178j = r2
            double r2 = r13.f346501G
            r1.f354179n = r2
            java.lang.String r2 = r13.f346505K
            r1.f354174f = r2
            r1.f354180o = r14
            y22.e r14 = r13.f346583e
            int r14 = r14.getZoomLevel()
            double r2 = (double) r14
            r1.f354181p = r2
            com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r14 = r13.f346554w
            int r2 = r14.f346427H1
            r1.f354183r = r2
            java.lang.String r2 = r14.f346428I1
            r1.f354184s = r2
            java.lang.String r14 = r14.f346429J1
            r1.f354185t = r14
            t22.n r14 = new t22.n
            java.lang.String r2 = r13.f346503I
            r14.<init>(r1, r2)
            r13.f346555x = r14
            ob0.b0 r14 = f40.C86709a0.m107524d()
            t22.n r1 = r13.f346555x
            r14.mo123460f(r1)
            int r14 = r13.f346518U
            int r14 = r14 + r0
            r13.f346518U = r14
            long r0 = r13.f346524X
            r2 = -1
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x01d4
            long r0 = java.lang.System.currentTimeMillis()
            r13.f346524X = r0
            goto L_0x01d4
        L_0x01c5:
            java.lang.Object[] r14 = new java.lang.Object[r0]
            int r0 = r13.f346547p0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r3] = r0
            java.lang.String r0 = "pass this query because query interval: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r14)
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0.mo175581w(boolean):void");
    }

    /* renamed from: x */
    public final boolean mo175582x() {
        return (mo175604k().getDoubleExtra("KPickPoiLat", -85.0d) == -85.0d || mo175604k().getDoubleExtra("KPickPoiLong", -85.0d) == -1000.0d) ? false : true;
    }

    /* renamed from: y */
    public final void mo175583y(C115548i iVar) {
        C115546g gVar;
        C115546g gVar2;
        ValueAnimator valueAnimator;
        C115548i iVar2 = iVar;
        C115548i iVar3 = C115548i.OPENED;
        if (iVar3 == iVar2 && this.f346514S) {
            return;
        }
        if (C115548i.COLLAPSED != iVar2 || this.f346514S) {
            if (this.f346515S0.getVisibility() != 0) {
                View view = this.f346515S0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "playDrawerAnimation", "(Lcom/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$TopMarginState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "playDrawerAnimation", "(Lcom/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$TopMarginState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f346510Q = false;
            if (iVar3 == iVar2) {
                Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin play open animation, getListTopMargin(): %d, openedTopMargin: %d.", Integer.valueOf(mo175579u()), Integer.valueOf(this.f346508N));
                int u = mo175579u() - this.f346508N;
                Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin play open animation (getListTopMargin() - openedTopMargin): %d.", Integer.valueOf(u));
                gVar2 = new C115546g(this, 0.0f, 0.0f, 0.0f, (float) (-u));
                gVar = new C115546g(this, 0.0f, 0.0f, 0.0f, (float) (-this.f346509P));
                valueAnimator = ValueAnimator.ofInt(new int[]{0, this.f346517T0});
            } else {
                Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin play collapse animation, getListTopMargin(): %d, collapsedTopMargin: %d.", Integer.valueOf(mo175579u()), Integer.valueOf(this.f346507M));
                int u2 = this.f346507M - mo175579u();
                Log.m105919d("MicroMsg.MMPoiMapUI", "pennqin play collapse animation (collapsedTopMargin - getListTopMargin()): %d.", Integer.valueOf(u2));
                gVar2 = new C115546g(this, 0.0f, 0.0f, 0.0f, (float) u2);
                gVar = new C115546g(this, 0.0f, 0.0f, 0.0f, (float) this.f346509P);
                valueAnimator = ValueAnimator.ofInt(new int[]{this.f346517T0, 0});
            }
            C115539a aVar2 = new C115539a(iVar2);
            valueAnimator.addUpdateListener(new C115540b());
            gVar2.setDuration(200);
            gVar2.setFillEnabled(true);
            gVar2.setFillAfter(true);
            gVar2.setAnimationListener(aVar2);
            ((ArrayList) gVar2.f346568d).add(this.f346506L);
            for (int i = 0; i < ((ArrayList) gVar2.f346568d).size(); i++) {
                ((View) ((ArrayList) gVar2.f346568d).get(i)).startAnimation(gVar2);
            }
            gVar.setDuration(200);
            gVar.setFillEnabled(true);
            gVar.setFillAfter(true);
            ((ArrayList) gVar.f346568d).add(this.f346516T);
            for (int i2 = 0; i2 < ((ArrayList) gVar.f346568d).size(); i2++) {
                ((View) ((ArrayList) gVar.f346568d).get(i2)).startAnimation(gVar);
            }
            valueAnimator.setDuration(200).start();
        }
    }

    /* renamed from: z */
    public final void mo175584z() {
        ArrayList arrayList = new ArrayList(5);
        int i = 0;
        while (i < 5 && i < this.f346551t.getCount()) {
            arrayList.add(this.f346551t.getItem(i));
            i++;
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 == 0) {
                arrayList2.add((C115568o) arrayList.get(0));
            } else {
                C115568o oVar = (C115568o) arrayList.get(i2);
                C115568o oVar2 = (C115568o) arrayList2.get(arrayList2.size() - 1);
                if (TencentLocationUtils.distanceBetween(oVar.f346611d, oVar.f346610c, oVar2.f346611d, oVar2.f346610c) > 5000.0d) {
                    break;
                }
                arrayList2.add(oVar);
            }
        }
        mo175575q();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C115568o d = this.f346551t.getItem(i3);
            PoiPoint poiPoint = new PoiPoint((Context) this.f346582d, this.f346583e);
            poiPoint.setPosition(i3);
            poiPoint.setOnPointClick(this.f346530a1);
            Map<String, PoiPoint> map = this.f346532c1;
            ((HashMap) map).put(d.f346611d + "" + d.f346610c, poiPoint);
            poiPoint.mo175513b(d.f346611d, d.f346610c, false);
        }
        if (arrayList2.size() > 0) {
            if (1 == arrayList2.size()) {
                this.f346554w.mo175535y1(((C115568o) arrayList2.get(0)).f346622o, ((C115568o) arrayList2.get(0)).f346623p);
                this.f346583e.getIController().animateTo(((C115568o) arrayList2.get(0)).f346611d, ((C115568o) arrayList2.get(0)).f346610c, Util.isNullOrNil(((C115568o) arrayList2.get(0)).f346622o) ? 15 : 18);
                return;
            }
            ArrayList arrayList3 = new ArrayList(5);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                C115568o oVar3 = (C115568o) arrayList2.get(i4);
                arrayList3.add(new LatLng(oVar3.f346611d, oVar3.f346610c));
            }
            LatLngBounds build = LatLngBounds.builder().include((Iterable<LatLng>) arrayList3).build();
            if (!Double.isInfinite(build.getNortheast().getLatitude()) && !Double.isNaN(build.getNortheast().getLongitude()) && !Double.isInfinite(build.getSouthwest().getLatitude()) && !Double.isNaN(build.getSouthwest().getLongitude())) {
                this.f346583e.animateCamera(CameraUpdateFactory.newLatLngBounds(build, 250));
            }
        }
    }
}
