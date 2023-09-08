package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.ViewGroup;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.C113540bh;
import com.tencent.mapsdk.internal.C114342tg;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;

/* renamed from: com.tencent.mapsdk.internal.ba */
public interface C113532ba extends MapDelegate<C113961mq, VectorMap, C113572bv>, C113710eu, C114015ol, C114342tg.C114354m, TencentMap.OnIndoorStateChangeListener {

    /* renamed from: a */
    public static final int f339740a = 0;

    /* renamed from: b */
    public static final int f339741b = 1;

    /* renamed from: A */
    boolean mo171537A();

    /* renamed from: B */
    boolean mo171538B();

    /* renamed from: C */
    C114004nx mo171539C();

    /* renamed from: D */
    void mo171540D();

    /* renamed from: E */
    void mo171541E();

    /* renamed from: F */
    void mo171542F();

    /* renamed from: G */
    Context mo171543G();

    /* renamed from: H */
    void mo171544H();

    @Deprecated
    /* renamed from: I */
    boolean mo171545I();

    /* renamed from: J */
    boolean mo171546J();

    /* renamed from: K */
    TencentMapOptions mo171547K();

    /* renamed from: L */
    ViewGroup mo171548L();

    /* renamed from: M */
    C114085pu mo171549M();

    /* renamed from: N */
    boolean mo171550N();

    /* renamed from: a */
    CameraPosition mo171551a();

    /* renamed from: a */
    void mo171552a(float f);

    /* renamed from: a */
    void mo171553a(float f, float f2, float f3);

    /* renamed from: a */
    void mo171554a(int i);

    /* renamed from: a */
    void mo171555a(int i, int i2);

    /* renamed from: a */
    void mo171556a(Handler handler, Bitmap.Config config, int i);

    /* renamed from: a */
    void mo171557a(C113534bc bcVar);

    /* renamed from: a */
    void mo171558a(C113540bh.C113549a aVar);

    /* renamed from: a */
    void mo171559a(C113711ev evVar);

    /* renamed from: a */
    void mo171560a(C113717fb fbVar);

    /* renamed from: a */
    void mo171561a(C113723fh fhVar);

    /* renamed from: a */
    void mo171562a(C114004nx nxVar, C113932lh lhVar);

    /* renamed from: a */
    void mo171563a(C114009oc ocVar);

    /* renamed from: a */
    void mo171564a(C114097qd qdVar);

    /* renamed from: a */
    void mo171565a(C114165rp rpVar);

    /* renamed from: a */
    void mo171566a(TencentMap.OnCameraChangeListener onCameraChangeListener);

    /* renamed from: a */
    void mo171567a(TencentMap.OnDismissCallback onDismissCallback);

    /* renamed from: a */
    void mo171568a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    /* renamed from: a */
    void mo171569a(TencentMap.OnMapPoiClickListener onMapPoiClickListener);

    /* renamed from: a */
    void mo171570a(TencentMapOptions tencentMapOptions);

    /* renamed from: a */
    void mo171571a(OverSeaTileProvider overSeaTileProvider);

    /* renamed from: a */
    void mo171572a(TencentMapGestureListener tencentMapGestureListener);

    /* renamed from: a */
    void mo171573a(String str);

    /* renamed from: a */
    void mo171574a(boolean z);

    /* renamed from: a */
    boolean mo171575a(float f, float f2);

    /* renamed from: b */
    C113961mq mo171576b();

    /* renamed from: b */
    void mo171577b(float f);

    /* renamed from: b */
    void mo171578b(int i, int i2);

    /* renamed from: b */
    void mo171579b(C113711ev evVar);

    /* renamed from: b */
    void mo171580b(C113717fb fbVar);

    /* renamed from: b */
    void mo171581b(TencentMapGestureListener tencentMapGestureListener);

    /* renamed from: b */
    void mo171582b(String str);

    /* renamed from: b */
    void mo171583b(boolean z);

    /* renamed from: b */
    boolean mo171584b(float f, float f2);

    /* renamed from: c */
    C113960mp mo171585c();

    /* renamed from: c */
    C114027oy mo171586c(String str);

    /* renamed from: c */
    void mo171587c(int i, int i2);

    /* renamed from: c */
    void mo171588c(boolean z);

    /* renamed from: c */
    boolean mo171589c(float f, float f2);

    /* renamed from: d */
    C114185ru mo171590d();

    /* renamed from: d */
    String mo171591d(float f, float f2);

    /* renamed from: d */
    void mo171592d(int i, int i2);

    /* renamed from: d */
    void mo171593d(boolean z);

    /* renamed from: d */
    boolean mo171594d(String str);

    /* renamed from: e */
    String mo171595e();

    /* renamed from: e */
    void mo171596e(boolean z);

    /* renamed from: e */
    boolean mo171597e(float f, float f2);

    /* renamed from: f */
    void mo171598f(boolean z);

    /* renamed from: f */
    boolean mo171599f();

    /* renamed from: f */
    boolean mo171600f(float f, float f2);

    /* renamed from: g */
    void mo171601g(boolean z);

    /* renamed from: g */
    boolean mo171602g();

    int getEGLContextHash();

    /* renamed from: h */
    void mo171604h(boolean z);

    /* renamed from: h */
    boolean mo171605h();

    /* renamed from: i */
    void mo171606i(boolean z);

    /* renamed from: i */
    boolean mo171607i();

    /* renamed from: j */
    void mo171608j(boolean z);

    /* renamed from: j */
    boolean mo171609j();

    /* renamed from: k */
    void mo171610k();

    /* renamed from: k */
    void mo171611k(boolean z);

    /* renamed from: l */
    void mo171612l();

    /* renamed from: l */
    void mo171613l(boolean z);

    /* renamed from: m */
    void mo171614m();

    /* renamed from: n */
    void mo171615n();

    /* renamed from: o */
    boolean mo171616o();

    /* renamed from: p */
    boolean mo171617p();

    /* renamed from: q */
    C114097qd mo171618q();

    /* renamed from: r */
    C113497ab mo171619r();

    /* renamed from: s */
    GeoPoint mo171620s();

    /* renamed from: t */
    int mo171621t();

    /* renamed from: u */
    int mo171622u();

    /* renamed from: v */
    int mo171623v();

    /* renamed from: w */
    int mo171624w();

    /* renamed from: x */
    boolean mo171625x();

    /* renamed from: y */
    void mo171626y();

    /* renamed from: z */
    void mo171627z();
}
