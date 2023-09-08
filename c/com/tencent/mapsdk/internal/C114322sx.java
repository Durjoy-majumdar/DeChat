package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.ReturnCallback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.C113540bh;
import com.tencent.mapsdk.internal.C113565bo;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.sx */
public class C114322sx extends C114337tf implements TencentMap.OnCameraChangeListener {

    /* renamed from: A */
    public TencentMap.OnMapPoiClickListener f342518A;

    /* renamed from: B */
    public Handler f342519B;

    /* renamed from: C */
    public TencentMap.CancelableCallback f342520C;

    /* renamed from: D */
    public TencentMap.OnCompassClickedListener f342521D;

    /* renamed from: E */
    public C113540bh.C113549a f342522E;

    /* renamed from: F */
    public TencentMap.OnScaleViewChangedListener f342523F;

    /* renamed from: G */
    public TencentMap.OnCameraChangeListener f342524G;

    /* renamed from: H */
    public TencentMap.OnCameraChangeListener f342525H;

    /* renamed from: I */
    public Handler f342526I;

    /* renamed from: J */
    public long f342527J;

    /* renamed from: K */
    public Bitmap.Config f342528K;

    /* renamed from: L */
    public int f342529L;

    /* renamed from: M */
    public int f342530M;

    /* renamed from: N */
    public int f342531N;

    /* renamed from: O */
    public int f342532O;

    /* renamed from: P */
    public float f342533P;

    /* renamed from: Q */
    public float f342534Q;

    /* renamed from: R */
    public float f342535R;

    /* renamed from: S */
    public float f342536S;

    /* renamed from: T */
    public boolean f342537T;

    /* renamed from: U */
    public boolean f342538U;

    /* renamed from: V */
    public boolean f342539V;

    /* renamed from: W */
    public boolean f342540W;

    /* renamed from: X */
    public boolean f342541X;

    /* renamed from: Y */
    public boolean f342542Y;

    /* renamed from: Z */
    public boolean f342543Z;

    /* renamed from: aL */
    private final C113533bb f342544aL;

    /* renamed from: aM */
    private C114094px f342545aM;

    /* renamed from: aN */
    private final C113722fg f342546aN;

    /* renamed from: aO */
    private C113726fk f342547aO;

    /* renamed from: aP */
    private C114004nx f342548aP;

    /* renamed from: aQ */
    private GeoPoint f342549aQ;

    /* renamed from: aR */
    private boolean f342550aR;

    /* renamed from: aS */
    private volatile boolean f342551aS;

    /* renamed from: aT */
    private boolean f342552aT;

    /* renamed from: aU */
    private int f342553aU;

    /* renamed from: aV */
    private int f342554aV;

    /* renamed from: aW */
    private float f342555aW;

    /* renamed from: aX */
    private C113740fv f342556aX;

    /* renamed from: aY */
    private C114085pu f342557aY;

    /* renamed from: aa */
    public int f342558aa;

    /* renamed from: ab */
    public int f342559ab;

    /* renamed from: ac */
    public boolean f342560ac;

    /* renamed from: ad */
    public boolean f342561ad;

    /* renamed from: ae */
    public LatLng f342562ae;

    /* renamed from: af */
    public LatLng f342563af;

    /* renamed from: ag */
    public int f342564ag;

    /* renamed from: ah */
    public int f342565ah;

    /* renamed from: ai */
    public int f342566ai;

    /* renamed from: aj */
    public int f342567aj;

    /* renamed from: ak */
    public int f342568ak;

    /* renamed from: al */
    public int f342569al;

    /* renamed from: am */
    public int f342570am;

    /* renamed from: an */
    public final C113711ev f342571an;

    /* renamed from: ao */
    public boolean f342572ao;

    /* renamed from: ap */
    public C113520ao f342573ap;

    /* renamed from: aq */
    public boolean f342574aq;

    /* renamed from: ar */
    public C114046pe f342575ar;

    /* renamed from: as */
    public TencentMap.OnTrafficEventClickListener f342576as;

    /* renamed from: at */
    public List<C113520ao> f342577at;

    /* renamed from: au */
    public List<MapPoi> f342578au;

    /* renamed from: av */
    public List<C113535bd> f342579av;

    /* renamed from: g */
    public final byte[] f342580g;

    /* renamed from: h */
    public String f342581h;

    /* renamed from: i */
    public boolean f342582i;

    /* renamed from: j */
    public int f342583j;

    /* renamed from: k */
    public C114189rv f342584k;

    /* renamed from: l */
    public C114122qt f342585l;

    /* renamed from: m */
    public C114165rp f342586m;

    /* renamed from: n */
    public C114097qd f342587n;

    /* renamed from: o */
    public C113497ab f342588o;

    /* renamed from: p */
    public AnimationListener f342589p;

    /* renamed from: q */
    public List<C113717fb> f342590q;

    /* renamed from: r */
    public List<C113723fh> f342591r;

    /* renamed from: s */
    public TencentMap.OnMapClickListener f342592s;

    /* renamed from: t */
    public C113534bc f342593t;

    /* renamed from: u */
    public List<TencentMap.OnCameraChangeListener> f342594u;

    /* renamed from: v */
    public TencentMap.OnMapLongClickListener f342595v;

    /* renamed from: w */
    public TencentMap.OnDismissCallback f342596w;

    /* renamed from: x */
    public TencentMap.OnIndoorStateChangeListener f342597x;

    /* renamed from: y */
    public TencentMap.OnMarkerClickListener f342598y;

    /* renamed from: z */
    public TencentMap.OnInfoWindowClickListener f342599z;

    public C114322sx(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
        this.f342580g = new byte[0];
        this.f342581h = "";
        this.f342582i = false;
        this.f342583j = 22;
        this.f342584k = null;
        this.f342585l = null;
        this.f342588o = null;
        this.f342589p = null;
        this.f342590q = new CopyOnWriteArrayList();
        this.f342591r = null;
        this.f342592s = null;
        this.f342593t = null;
        this.f342594u = new CopyOnWriteArrayList();
        this.f342595v = null;
        this.f342596w = null;
        this.f342598y = null;
        this.f342599z = null;
        this.f342518A = null;
        this.f342545aM = new C114316sr(this);
        this.f342520C = null;
        this.f342521D = null;
        this.f342522E = null;
        this.f342523F = null;
        this.f342524G = null;
        this.f342525H = null;
        this.f342528K = Bitmap.Config.RGB_565;
        this.f342529L = Integer.MIN_VALUE;
        this.f342530M = Integer.MIN_VALUE;
        this.f342531N = Integer.MIN_VALUE;
        this.f342532O = Integer.MIN_VALUE;
        this.f342533P = 0.5f;
        this.f342534Q = 0.5f;
        this.f342535R = 0.5f;
        this.f342536S = 0.5f;
        this.f342549aQ = null;
        this.f342550aR = false;
        this.f342537T = true;
        this.f342551aS = false;
        this.f342552aT = false;
        this.f342553aU = 0;
        this.f342554aV = 0;
        this.f342538U = false;
        this.f342539V = true;
        this.f342540W = true;
        this.f342541X = true;
        this.f342542Y = true;
        this.f342543Z = true;
        this.f342558aa = 19;
        this.f342559ab = 3;
        this.f342555aW = 0.0f;
        this.f342560ac = true;
        this.f342561ad = true;
        this.f342562ae = null;
        this.f342563af = null;
        this.f342564ag = 0;
        this.f342565ah = 0;
        this.f342566ai = 0;
        this.f342567aj = 0;
        this.f342568ak = 0;
        this.f342569al = 0;
        this.f342570am = 0;
        this.f342572ao = false;
        this.f342573ap = null;
        this.f342574aq = false;
        this.f342577at = new ArrayList();
        this.f342578au = new ArrayList();
        this.f342579av = new ArrayList();
        this.f342546aN = new C114335tc(this);
        this.f342571an = new C114320sv(this);
        this.f342545aM = new C114316sr(this);
        this.f342547aO = new C114318st(this);
        this.f342544aL = new C114317ss(this);
        int[] d = C113801hf.m157144d(mo171543G());
        this.f342569al = d[0];
        this.f342570am = d[1];
    }

    /* renamed from: ab */
    private C114189rv m160177ab() {
        return this.f342584k;
    }

    /* renamed from: ac */
    private boolean m160178ac() {
        return this.f342584k.f341875b.f341859e;
    }

    /* renamed from: ad */
    private C114165rp m160179ad() {
        return this.f342586m;
    }

    /* renamed from: ae */
    private List<C113520ao> m160180ae() {
        this.f342577at.clear();
        C113741fw[] fwVarArr = {C114373y.m160626b(((VectorMap) this.f339878e_).getProjection().mo172025a(new C113732fo(0.0d, 0.0d))), C114373y.m160626b(((VectorMap) this.f339878e_).getProjection().mo172025a(new C113732fo((double) mo172993X(), (double) mo172994Y())))};
        for (C113709et next : this.f342647aD.f340880J.f339805b) {
            if (next instanceof C113528aw) {
                C113520ao aoVar = ((C113528aw) next).f339728a;
                if (m160175a(aoVar.getPosition(), fwVarArr)) {
                    this.f342577at.add(aoVar);
                }
            }
        }
        return this.f342577at;
    }

    /* renamed from: af */
    private List<MapPoi> m160181af() {
        this.f342578au.clear();
        C113961mq mqVar = ((VectorMap) this.f339878e_).f342909o;
        ArrayList<MapPoi> G = mqVar == null ? null : mqVar.mo172415G();
        this.f342578au = G;
        return G;
    }

    /* renamed from: ag */
    private C113741fw[] m160182ag() {
        return new C113741fw[]{C114373y.m160626b(((VectorMap) this.f339878e_).getProjection().mo172025a(new C113732fo(0.0d, 0.0d))), C114373y.m160626b(((VectorMap) this.f339878e_).getProjection().mo172025a(new C113732fo((double) mo172993X(), (double) mo172994Y())))};
    }

    /* renamed from: ah */
    private void m160183ah() {
        if (!mo172995Z()) {
            C114046pe peVar = this.f342575ar;
            if (peVar != null) {
                peVar.onTalkBackDeActivate(this.f342650aG.getView());
                this.f342575ar = null;
            }
        } else if (this.f342650aG instanceof View) {
            if (this.f342575ar == null) {
                this.f342575ar = new C114046pe((View) this.f342650aG, this);
            }
            this.f342575ar.onTalkBackActivate(this.f342650aG.getView());
        }
    }

    /* renamed from: ai */
    private boolean m160184ai() {
        Handler handler = this.f342519B;
        if (handler == null || !handler.getLooper().getThread().isAlive()) {
            return false;
        }
        this.f342519B.sendEmptyMessage(0);
        return true;
    }

    /* renamed from: A */
    public final boolean mo171537A() {
        C114122qt qtVar = this.f342585l;
        return (qtVar == null || qtVar.f341600b == null) ? false : true;
    }

    /* renamed from: B */
    public final boolean mo171538B() {
        return this.f342574aq;
    }

    /* renamed from: M */
    public final C114085pu mo171549M() {
        return this.f342557aY;
    }

    /* renamed from: O */
    public final void mo171820O() {
        super.mo171820O();
        TencentMapOptions tencentMapOptions = this.f339879f;
        if (tencentMapOptions != null) {
            this.f342550aR = tencentMapOptions.isHandDrawMapEnable();
            this.f342572ao = this.f339879f.isMultipleInfoWindowEnable();
        }
    }

    /* renamed from: P */
    public final void mo171821P() {
        super.mo171821P();
        C114189rv rvVar = new C114189rv(this);
        this.f342584k = rvVar;
        Context context = this.f339877e;
        OverSeaSource overSeaSource = OverSeaSource.DEFAULT;
        C114185ru ruVar = new C114185ru();
        rvVar.f341875b = ruVar;
        if (context != null) {
            ruVar.f341863i = overSeaSource;
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>(context, overSeaSource) {
                /* renamed from: a */
                public java.lang.Boolean call(
/*
Method generation error in method: com.tencent.mapsdk.internal.ru.2.a():java.lang.Boolean, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ru.2.a():java.lang.Boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }).mo172280a(Boolean.FALSE, (C113865kb.C113868a) null);
        }
        this.f342558aa = ((VectorMap) this.f339878e_).mo173488p();
        this.f342559ab = ((VectorMap) this.f339878e_).mo173487o();
    }

    /* renamed from: Q */
    public final void mo171822Q() {
        super.mo171822Q();
        if (this.f342550aR) {
            mo171626y();
        }
    }

    /* renamed from: R */
    public final void mo172034R() {
        C113503ad adVar = ((VectorMap) this.f339878e_).f342909o.f340901i;
        adVar.mo171252o();
        adVar.mo171247j();
        TencentMap.OnCompassClickedListener onCompassClickedListener = this.f342521D;
        if (onCompassClickedListener != null) {
            onCompassClickedListener.onCompassClicked();
        }
    }

    /* renamed from: S */
    public final C113565bo.C113567b mo172974S() {
        return ((C113961mq) this.f339876d_).mo171810w();
    }

    /* renamed from: T */
    public final void mo172975T() {
        super.mo172975T();
        C113896kq.m157671d(C0950kp.f2278X);
    }

    /* renamed from: U */
    public final C113740fv mo172976U() {
        C113741fw[] W = mo172978W();
        C113741fw b = C114373y.m160626b(((VectorMap) this.f339878e_).mo173489q());
        float r = (float) ((VectorMap) this.f339878e_).mo173490r();
        C113740fv fvVar = this.f342556aX;
        if (fvVar == null) {
            this.f342556aX = new C113740fv(b, W, r);
        } else {
            fvVar.mo172109a(b, W, r);
        }
        return this.f342556aX;
    }

    /* renamed from: V */
    public final void mo172977V() {
        C c = this.f339876d_;
        if (c != null) {
            C114181rs.m159508a();
            c.f339862e = !m160176a(C114181rs.m159515c(C114181rs.f341835a));
            C114189rv rvVar = this.f342584k;
            if (rvVar != null) {
                rvVar.mo172838b();
            }
            boolean l = c.mo171803l();
            if (this.f342586m != null) {
                C113740fv U = mo172976U();
                if (c.f339862e && !c.f339863f) {
                    C114181rs.m159508a();
                    U = new C113740fv(C114373y.m160626b(new GeoPoint(new LatLng(39.908823d, 116.39747d))), C114181rs.m159515c(C114181rs.f341835a), 18.0f);
                }
                this.f342586m.mo172793a(U, l);
                this.f342586m.mo172795a(l);
            }
        }
    }

    /* renamed from: W */
    public final C113741fw[] mo172978W() {
        GeoPoint[] k = this.f342647aD.f340899g.mo172949k();
        C113741fw[] fwVarArr = new C113741fw[4];
        for (int i = 0; i < 4; i++) {
            fwVarArr[i] = C114373y.m160626b(k[i]);
        }
        return fwVarArr;
    }

    /* renamed from: f */
    public final void mo171598f(boolean z) {
        this.f342543Z = z;
    }

    /* renamed from: g */
    public final void mo171601g(boolean z) {
        this.f342657ay = z;
    }

    /* renamed from: h */
    public final void mo171604h(boolean z) {
        if (this.f342537T != z) {
            C113739fu fuVar = new C113739fu();
            fuVar.f340295f = 2;
            for (C113717fb a : this.f342590q) {
                a.mo171693a(fuVar);
            }
        }
        this.f342537T = z;
        C113503ad adVar = ((VectorMap) this.f339878e_).f342909o.f340901i;
        adVar.f339669G = z;
        adVar.f339696z.mo171638f().mo172932b(adVar.f339669G);
        ((VectorMap) this.f339878e_).mo173486n();
    }

    /* renamed from: i */
    public final boolean mo171607i() {
        return this.f342542Y;
    }

    /* renamed from: j */
    public final boolean mo171609j() {
        return this.f342543Z;
    }

    /* renamed from: k */
    public final void mo171610k() {
        Handler handler = this.f342519B;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.f342526I;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
        List<C113723fh> list = this.f342591r;
        if (list != null) {
            list.clear();
            this.f342591r = null;
        }
        mo171612l();
        this.f342592s = null;
        this.f342599z = null;
        this.f342595v = null;
        this.f342521D = null;
        this.f342589p = null;
    }

    /* renamed from: l */
    public final void mo171612l() {
        synchronized (this.f342580g) {
            this.f342647aD.f340880J.mo171674a();
        }
    }

    /* renamed from: m */
    public final void mo171831m(boolean z) {
        super.mo171831m(z);
        mo172977V();
    }

    /* renamed from: n */
    public final void mo171615n() {
        if (!this.f342590q.isEmpty()) {
            C113739fu fuVar = new C113739fu();
            fuVar.f340295f = 0;
            fuVar.f340296g = this.f342560ac;
            fuVar.f340297h = this.f342561ad;
            for (C113717fb a : this.f342590q) {
                a.mo171693a(fuVar);
            }
        }
    }

    /* renamed from: o */
    public final boolean mo171616o() {
        return this.f342560ac;
    }

    public void onCameraChange(final CameraPosition cameraPosition) {
        this.f342644aA = false;
        this.f342645aB = true;
        C113865kb.m157399a((Runnable) new Runnable() {
            public final void run() {
                List<TencentMap.OnCameraChangeListener> list = C114322sx.this.f342594u;
                if (list != null) {
                    for (TencentMap.OnCameraChangeListener next : list) {
                        if (next != null) {
                            next.onCameraChange(cameraPosition);
                        }
                    }
                }
                if (C114322sx.this.f342524G != null) {
                    C114322sx.this.f342524G.onCameraChange(cameraPosition);
                }
                if (C114322sx.this.f342525H != null) {
                    C114322sx.this.f342525H.onCameraChange(cameraPosition);
                }
            }
        });
    }

    public void onCameraChangeFinished(final CameraPosition cameraPosition) {
        if (this.f342646aC == 0 && this.f342644aA) {
            this.f342645aB = false;
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    List<TencentMap.OnCameraChangeListener> list = C114322sx.this.f342594u;
                    if (list != null) {
                        for (TencentMap.OnCameraChangeListener next : list) {
                            if (next != null) {
                                next.onCameraChangeFinished(cameraPosition);
                            }
                        }
                    }
                    if (C114322sx.this.f342524G != null) {
                        C114322sx.this.f342524G.onCameraChangeFinished(cameraPosition);
                    }
                    if (C114322sx.this.f342525H != null) {
                        C114322sx.this.f342525H.onCameraChangeFinished(cameraPosition);
                    }
                }
            });
        }
    }

    public void onCreated() {
        super.onCreated();
        this.f342519B = new C114215sp(this, C113865kb.m157395a("gesture"));
        this.f342557aY = new C114085pu((C113536be) this.f339876d_);
        ((VectorMap) this.f339878e_).mo173444a(this.f342545aM);
        mo171559a(this.f342571an);
        ((VectorMap) this.f339878e_).mo173438a(this.f342544aL);
        ((VectorMap) this.f339878e_).mo173441a(this.f342547aO);
        ((VectorMap) this.f339878e_).mo173444a(this.f342545aM);
        ((VectorMap) this.f339878e_).mo173440a(this.f342546aN);
        ((VectorMap) this.f339878e_).mo173439a((C113710eu) this);
        this.f342588o = new C113497ab(this, mo172974S().f339870c);
    }

    public void onDestroy() {
        super.onDestroy();
        ((VectorMap) this.f339878e_).mo173439a((C113710eu) null);
        List<TencentMap.OnCameraChangeListener> list = this.f342594u;
        if (list != null) {
            list.clear();
        }
        C114046pe peVar = this.f342575ar;
        if (peVar != null) {
            ((VectorMap) peVar.f341236c.f339878e_).mo173457b((C113726fk) peVar);
            peVar.accessibleTouchItems.clear();
            peVar.f341234a.clear();
            peVar.f341235b.clear();
        }
        this.f342518A = null;
        this.f342576as = null;
        this.f342523F = null;
        this.f342552aT = true;
    }

    public boolean onIndoorBuildingDeactivated() {
        return ((C113961mq) this.f339876d_).f340880J.mo171676a((IndoorBuilding) null);
    }

    public boolean onIndoorBuildingFocused() {
        return false;
    }

    public boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        return ((C113961mq) this.f339876d_).f340880J.mo171676a(indoorBuilding);
    }

    public void onResume() {
        IndoorBuilding indoorBuilding;
        super.onResume();
        this.f342646aC = 0;
        this.f342645aB = false;
        if (!mo172995Z()) {
            C114046pe peVar = this.f342575ar;
            if (peVar != null) {
                peVar.onTalkBackDeActivate(this.f342650aG.getView());
                this.f342575ar = null;
            }
        } else if (this.f342650aG instanceof View) {
            if (this.f342575ar == null) {
                this.f342575ar = new C114046pe((View) this.f342650aG, this);
            }
            this.f342575ar.onTalkBackActivate(this.f342650aG.getView());
        }
        C113497ab abVar = this.f342588o;
        if (abVar != null && (indoorBuilding = abVar.f339626g) != null) {
            String buidlingId = indoorBuilding.getBuidlingId();
            int activeLevelIndex = abVar.f339626g.getActiveLevelIndex();
            List<IndoorLevel> levels = abVar.f339626g.getLevels();
            if (levels != null && activeLevelIndex < levels.size()) {
                String name = levels.get(activeLevelIndex).getName();
                if (!C40002he.m42805a(buidlingId) && !C40002he.m42805a(name)) {
                    abVar.f339624e.mo172438a(buidlingId, name);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C113534bc bcVar = this.f342593t;
        if (bcVar != null) {
            bcVar.mo171630a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final boolean mo171617p() {
        return this.f342561ad;
    }

    /* renamed from: q */
    public final C114097qd mo171618q() {
        return this.f342587n;
    }

    /* renamed from: r */
    public final C113497ab mo171619r() {
        return this.f342588o;
    }

    /* renamed from: s */
    public final GeoPoint mo171620s() {
        if (this.f342549aQ == null) {
            if (this.f342529L == Integer.MIN_VALUE) {
                this.f342529L = this.f342569al / 2;
            }
            if (this.f342530M == Integer.MIN_VALUE) {
                this.f342530M = this.f342570am / 2;
            }
            this.f342549aQ = ((VectorMap) this.f339878e_).getProjection().mo172025a(new C113732fo((double) this.f342529L, (double) this.f342530M));
        }
        return this.f342549aQ;
    }

    /* renamed from: t */
    public final int mo171621t() {
        return this.f342531N;
    }

    /* renamed from: u */
    public final int mo171622u() {
        return this.f342532O;
    }

    /* renamed from: v */
    public final int mo171623v() {
        return this.f342529L;
    }

    /* renamed from: w */
    public final int mo171624w() {
        return this.f342530M;
    }

    /* renamed from: x */
    public final boolean mo171625x() {
        return this.f342551aS;
    }

    /* renamed from: y */
    public final void mo171626y() {
        if (this.f342585l == null) {
            this.f342585l = new C114122qt(this);
        }
        this.f342585l.mo172741a();
    }

    /* renamed from: z */
    public final void mo171627z() {
        C114122qt qtVar = this.f342585l;
        if (qtVar != null) {
            qtVar.mo172742b();
        }
    }

    /* renamed from: a */
    public final void mo171556a(Handler handler, Bitmap.Config config, int i) {
        this.f342526I = handler;
        this.f342528K = config;
        if (i > 0) {
            this.f342527J = SystemClock.elapsedRealtime() + ((long) i);
        } else {
            this.f342527J = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        mo171544H();
        mo171542F();
    }

    /* renamed from: b */
    public final void mo171582b(String str) {
        synchronized (this.f342580g) {
            this.f342581h = str;
        }
    }

    /* renamed from: c */
    public final void mo171588c(boolean z) {
        this.f342539V = z;
    }

    /* renamed from: d */
    public final C114185ru mo171590d() {
        return this.f342584k.f341875b;
    }

    /* renamed from: e */
    public final void mo172984e(int i, int i2) {
        List<C113723fh> list = this.f342591r;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C113723fh fhVar = this.f342591r.get(i3);
                if (fhVar != null) {
                    fhVar.mo171655b(i, i2);
                }
            }
        }
        C c = this.f339876d_;
        if (c != null) {
            Iterator<C113709et> it = ((C113961mq) c).f340880J.f339804a.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo171599f() {
        return this.f342537T;
    }

    /* renamed from: g */
    public final boolean mo171602g() {
        return this.f342540W;
    }

    /* renamed from: i */
    public final void mo171606i(boolean z) {
        if (!z || this.f342584k.f341875b.f341859e) {
            ((VectorMap) this.f339878e_).mo173438a(this.f342544aL);
        } else {
            ((VectorMap) this.f339878e_).mo173438a((C113533bb) null);
        }
    }

    /* renamed from: j */
    public final void mo171608j(boolean z) {
        this.f342538U = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: com.tencent.mapsdk.internal.et} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m160195g(float r11, float r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.internal.mq r0 = r10.f342647aD
            com.tencent.mapsdk.internal.bi r0 = r0.f340880J
            java.util.List<com.tencent.mapsdk.internal.et> r1 = r0.f339805b
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 0
            r7 = r4
            r6 = 0
        L_0x0010:
            if (r2 < 0) goto L_0x0022
            java.lang.Object r6 = r1.get(r2)
            r7 = r6
            com.tencent.mapsdk.internal.et r7 = (com.tencent.mapsdk.internal.C113709et) r7
            boolean r6 = m160174a((com.tencent.mapsdk.internal.C113709et) r7, (float) r11, (float) r12)
            if (r6 != 0) goto L_0x0022
            int r2 = r2 + -1
            goto L_0x0010
        L_0x0022:
            if (r6 != 0) goto L_0x003d
            java.util.List<com.tencent.mapsdk.internal.et> r1 = r0.f339806c
            int r2 = r1.size()
            int r2 = r2 - r3
        L_0x002b:
            if (r2 < 0) goto L_0x003d
            java.lang.Object r6 = r1.get(r2)
            r7 = r6
            com.tencent.mapsdk.internal.et r7 = (com.tencent.mapsdk.internal.C113709et) r7
            boolean r6 = m160174a((com.tencent.mapsdk.internal.C113709et) r7, (float) r11, (float) r12)
            if (r6 != 0) goto L_0x003d
            int r2 = r2 + -1
            goto L_0x002b
        L_0x003d:
            if (r6 != 0) goto L_0x0080
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.et> r2 = r0.f339804a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x004e:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0064
            java.lang.Object r8 = r2.next()
            com.tencent.mapsdk.internal.et r8 = (com.tencent.mapsdk.internal.C113709et) r8
            boolean r9 = r8 instanceof com.tencent.mapsdk.internal.C113529ax
            if (r9 == 0) goto L_0x004e
            com.tencent.mapsdk.internal.ax r8 = (com.tencent.mapsdk.internal.C113529ax) r8
            r1.add(r8)
            goto L_0x004e
        L_0x0064:
            java.util.Comparator<com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable> r0 = r0.f339811h
            java.util.Collections.sort(r1, r0)
            int r0 = r1.size()
            int r0 = r0 - r3
        L_0x006e:
            if (r0 < 0) goto L_0x0080
            java.lang.Object r2 = r1.get(r0)
            r7 = r2
            com.tencent.mapsdk.internal.et r7 = (com.tencent.mapsdk.internal.C113709et) r7
            boolean r6 = m160174a((com.tencent.mapsdk.internal.C113709et) r7, (float) r11, (float) r12)
            if (r6 != 0) goto L_0x0080
            int r0 = r0 + -1
            goto L_0x006e
        L_0x0080:
            if (r6 == 0) goto L_0x0152
            boolean r0 = r7 instanceof com.tencent.mapsdk.internal.C113528aw
            if (r0 == 0) goto L_0x0108
            com.tencent.mapsdk.internal.aw r7 = (com.tencent.mapsdk.internal.C113528aw) r7
            M r11 = r10.f339878e_
            com.tencent.mapsdk.vector.VectorMap r11 = (com.tencent.mapsdk.vector.VectorMap) r11
            if (r11 != 0) goto L_0x0091
        L_0x008e:
            r3 = 0
            goto L_0x0106
        L_0x0091:
            if (r7 != 0) goto L_0x009a
            java.lang.String r11 = ""
            r10.mo171582b((java.lang.String) r11)
            goto L_0x0106
        L_0x009a:
            com.tencent.mapsdk.internal.ao r11 = r7.f339728a
            java.lang.String r12 = r11.getId()
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMarkerClickListener r0 = r10.f342598y
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.onMarkerClick(r7)
            if (r0 == 0) goto L_0x00ab
            goto L_0x0106
        L_0x00ab:
            boolean r0 = r7.isInfoWindowEnable()
            if (r0 != 0) goto L_0x00b2
            goto L_0x008e
        L_0x00b2:
            boolean r0 = r10.f342572ao
            if (r0 != 0) goto L_0x00ea
            com.tencent.mapsdk.internal.ao r12 = r10.f342573ap
            if (r12 != 0) goto L_0x00c0
            r11.showInfoWindow()
            r10.f342573ap = r11
            goto L_0x0106
        L_0x00c0:
            if (r12 != r11) goto L_0x00e1
            com.tencent.mapsdk.internal.eq r12 = r11.mo171381h()
            if (r12 == 0) goto L_0x00d3
            com.tencent.mapsdk.internal.eq r12 = r11.mo171381h()
            boolean r12 = r12.mo172011c()
            if (r12 == 0) goto L_0x00d3
            r5 = 1
        L_0x00d3:
            if (r5 == 0) goto L_0x00db
            r11.hideInfoWindow()
            r10.f342573ap = r4
            goto L_0x0106
        L_0x00db:
            r11.showInfoWindow()
            r10.f342573ap = r11
            goto L_0x0106
        L_0x00e1:
            r12.hideInfoWindow()
            r11.showInfoWindow()
            r10.f342573ap = r11
            goto L_0x0106
        L_0x00ea:
            com.tencent.mapsdk.internal.eq r0 = r11.mo171381h()
            if (r0 != 0) goto L_0x00f4
            r11.showInfoWindow()
            goto L_0x0103
        L_0x00f4:
            boolean r0 = r11.isInfoWindowShown()
            if (r0 == 0) goto L_0x00fe
            r11.hideInfoWindow()
            goto L_0x0103
        L_0x00fe:
            r11.showInfoWindow()
            r10.f342573ap = r11
        L_0x0103:
            r10.mo171582b((java.lang.String) r12)
        L_0x0106:
            r5 = r3
            goto L_0x0153
        L_0x0108:
            boolean r0 = r7 instanceof com.tencent.mapsdk.internal.C113530ay
            if (r0 == 0) goto L_0x012d
            com.tencent.mapsdk.internal.ay r7 = (com.tencent.mapsdk.internal.C113530ay) r7
            boolean r0 = r7.isClickable()
            if (r0 == 0) goto L_0x008e
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnPolylineClickListener r0 = r10.f342652aI
            if (r0 == 0) goto L_0x008e
            C r1 = r10.f339876d_
            com.tencent.mapsdk.internal.mq r1 = (com.tencent.mapsdk.internal.C113961mq) r1
            com.tencent.mapsdk.internal.es r1 = r1.f340906n
            android.graphics.Point r2 = new android.graphics.Point
            int r11 = (int) r11
            int r12 = (int) r12
            r2.<init>(r11, r12)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r11 = r1.fromScreenLocation(r2)
            r0.onPolylineClick(r7, r11)
            goto L_0x0106
        L_0x012d:
            boolean r0 = r7 instanceof com.tencent.mapsdk.internal.C113529ax
            if (r0 == 0) goto L_0x0153
            com.tencent.mapsdk.internal.ax r7 = (com.tencent.mapsdk.internal.C113529ax) r7
            boolean r0 = r7.isClickable()
            if (r0 == 0) goto L_0x008e
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnPolygonClickListener r0 = r10.f342653aJ
            if (r0 == 0) goto L_0x008e
            C r1 = r10.f339876d_
            com.tencent.mapsdk.internal.mq r1 = (com.tencent.mapsdk.internal.C113961mq) r1
            com.tencent.mapsdk.internal.es r1 = r1.f340906n
            android.graphics.Point r2 = new android.graphics.Point
            int r11 = (int) r11
            int r12 = (int) r12
            r2.<init>(r11, r12)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r11 = r1.fromScreenLocation(r2)
            r0.onPolygonClick(r7, r11)
            goto L_0x0106
        L_0x0152:
            r5 = r6
        L_0x0153:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114322sx.m160195g(float, float):boolean");
    }

    /* renamed from: c */
    public final void mo171587c(int i, int i2) {
        this.f342529L = i;
        this.f342530M = i2;
    }

    /* renamed from: f */
    public final boolean mo171600f(float f, float f2) {
        IndoorMapPoi indoorMapPoi;
        C114141rg rgVar;
        TappedElement a = ((VectorMap) this.f339878e_).mo173434a(f, f2);
        if (a == null) {
            return false;
        }
        int i = a.type;
        if (i != 1) {
            if (i == 4) {
                C113961mq mqVar = this.f342647aD;
                if (mqVar == null || (rgVar = mqVar.f340871A) == null) {
                    return false;
                }
                TrafficEvent a2 = rgVar.mo172773a((int) a.itemId);
                TencentMap.OnTrafficEventClickListener onTrafficEventClickListener = this.f342576as;
                if (onTrafficEventClickListener == null || a2 == null) {
                    return false;
                }
                onTrafficEventClickListener.onTrafficEventClicked(a2);
                return true;
            } else if (i != 8) {
                return false;
            }
        } else if (this.f342518A != null) {
            if (a.itemType == 1) {
                IndoorMapPoi indoorMapPoi2 = new IndoorMapPoi();
                indoorMapPoi2.buildingName = a.buildingName;
                indoorMapPoi2.buildingId = a.buildingId;
                indoorMapPoi2.floorName = a.floorName;
                indoorMapPoi = indoorMapPoi2;
            } else {
                indoorMapPoi = new MapPoi();
            }
            indoorMapPoi.name = a.name;
            indoorMapPoi.position = C113883ke.m157465a(a.pixelX, a.pixelY).toLatLng();
            indoorMapPoi.poiId = a.poiId;
            this.f342518A.onClicked(indoorMapPoi);
        }
        return true;
    }

    /* renamed from: m */
    public final void mo171614m() {
        int r = ((VectorMap) this.f339878e_).mo173490r();
        this.f342560ac = true;
        this.f342561ad = true;
        if (r <= this.f342559ab) {
            this.f342561ad = false;
        } else if (r >= this.f342558aa) {
            this.f342560ac = false;
        }
        if (!this.f342590q.isEmpty()) {
            C113739fu fuVar = new C113739fu();
            fuVar.f340295f = 0;
            fuVar.f340296g = this.f342560ac;
            fuVar.f340297h = this.f342561ad;
            for (C113717fb a : this.f342590q) {
                a.mo171693a(fuVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo171593d(boolean z) {
        this.f342541X = z;
    }

    /* renamed from: c */
    private void m160192c(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        this.f342525H = onCameraChangeListener;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.tencent.mapsdk.internal.et} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi} */
    /* JADX WARNING: type inference failed for: r3v25, types: [com.tencent.tencentmap.mapsdk.maps.model.Marker] */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0201, code lost:
        if (r12.f342582i == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0203, code lost:
        r0 = r12.f342580g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0205, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        com.tencent.map.tools.Util.foreach(r12.f339876d_.f340880J.f339805b, new com.tencent.mapsdk.internal.C114322sx.C1143253(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0216, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x021b, code lost:
        r0 = r12.f339878e_.mo173434a(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0223, code lost:
        if (r0 == null) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0225, code lost:
        r1 = r0.type;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0227, code lost:
        if (r1 == 0) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0229, code lost:
        if (r1 == 1) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x022c, code lost:
        if (r1 == 4) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0230, code lost:
        if (r1 == 8) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0233, code lost:
        r1 = r12.f342647aD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0235, code lost:
        if (r1 == null) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0237, code lost:
        r1 = r1.f340871A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0239, code lost:
        if (r1 != null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023c, code lost:
        r0 = r1.mo172773a((int) r0.itemId);
        r1 = r12.f342576as;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0245, code lost:
        if (r1 == null) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0247, code lost:
        if (r0 == null) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0249, code lost:
        r1.onTrafficEventClicked(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x024f, code lost:
        if (r12.f342518A == null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0253, code lost:
        if (r0.itemType != 1) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0255, code lost:
        r1 = new com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi();
        r1.buildingName = r0.buildingName;
        r1.buildingId = r0.buildingId;
        r1.floorName = r0.floorName;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0267, code lost:
        r1 = new com.tencent.tencentmap.mapsdk.maps.model.MapPoi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x026c, code lost:
        r1.name = r0.name;
        r1.position = com.tencent.mapsdk.internal.C113883ke.m157465a(r0.pixelX, r0.pixelY).toLatLng();
        r1.poiId = r0.poiId;
        r12.f342518A.onClicked(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0287, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0289, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x028a, code lost:
        if (r0 == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x028c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x028f, code lost:
        if (r12.f342592s == null) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0293, code lost:
        if (r12.f342657ay == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0295, code lost:
        r12.f342592s.onMapClick(com.tencent.mapsdk.internal.C113883ke.m157466a(r12.f339878e_.mo173496v().mo172025a(new com.tencent.mapsdk.internal.C113732fo((double) r13, (double) r14))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02b1, code lost:
        mo171542F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02b4, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171584b(final float r13, final float r14) {
        /*
            r12 = this;
            byte[] r0 = r12.f342580g
            monitor-enter(r0)
            java.lang.String r1 = r12.f342581h     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.oy r1 = r12.mo171586c((java.lang.String) r1)     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.pa r1 = (com.tencent.mapsdk.internal.C114030pa) r1     // Catch:{ all -> 0x02b5 }
            r2 = 0
            if (r1 == 0) goto L_0x0011
            com.tencent.mapsdk.internal.eq r3 = r1.f341103G     // Catch:{ all -> 0x02b5 }
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            java.lang.String r4 = r12.f342581h     // Catch:{ all -> 0x02b5 }
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x02b5 }
            r5 = 0
            if (r4 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0031
            if (r3 == 0) goto L_0x0031
            boolean r4 = r3.mo172011c()     // Catch:{ all -> 0x02b5 }
            if (r4 == 0) goto L_0x0031
            boolean r4 = r3.onTap(r13, r14)     // Catch:{ all -> 0x02b5 }
            if (r4 == 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r1 = r2
            r3 = r1
            goto L_0x0034
        L_0x0031:
            r1 = r2
            r3 = r1
            r4 = 0
        L_0x0034:
            r6 = 1
            if (r4 != 0) goto L_0x0068
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x02b5 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x02b5 }
            r7[r5] = r4     // Catch:{ all -> 0x02b5 }
            r7[r6] = r1     // Catch:{ all -> 0x02b5 }
            r1 = 2
            r7[r1] = r3     // Catch:{ all -> 0x02b5 }
            C r3 = r12.f339876d_     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.mq r3 = (com.tencent.mapsdk.internal.C113961mq) r3     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.bi r3 = r3.f340880J     // Catch:{ all -> 0x02b5 }
            java.util.List<com.tencent.mapsdk.internal.et> r3 = r3.f339805b     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.sx$2 r4 = new com.tencent.mapsdk.internal.sx$2     // Catch:{ all -> 0x02b5 }
            r4.<init>(r13, r14, r7)     // Catch:{ all -> 0x02b5 }
            com.tencent.map.tools.Util.where(r3, r4)     // Catch:{ all -> 0x02b5 }
            r3 = r7[r5]     // Catch:{ all -> 0x02b5 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x02b5 }
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x02b5 }
            r3 = r7[r6]     // Catch:{ all -> 0x02b5 }
            com.tencent.tencentmap.mapsdk.maps.model.Marker r3 = (com.tencent.tencentmap.mapsdk.maps.model.Marker) r3     // Catch:{ all -> 0x02b5 }
            r1 = r7[r1]     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.eq r1 = (com.tencent.mapsdk.internal.C113705eq) r1     // Catch:{ all -> 0x02b5 }
            r11 = r3
            r3 = r1
            r1 = r11
        L_0x0068:
            if (r4 == 0) goto L_0x00a6
            M r2 = r12.f339878e_     // Catch:{ all -> 0x02b5 }
            if (r2 == 0) goto L_0x00a4
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnInfoWindowClickListener r2 = r12.f342599z     // Catch:{ all -> 0x02b5 }
            if (r2 == 0) goto L_0x00a4
            if (r1 == 0) goto L_0x00a4
            if (r3 == 0) goto L_0x00a4
            boolean r2 = r1.isInfoWindowShown()     // Catch:{ all -> 0x02b5 }
            if (r2 == 0) goto L_0x00a4
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnInfoWindowClickListener r2 = r12.f342599z     // Catch:{ all -> 0x02b5 }
            r2.onInfoWindowClick(r1)     // Catch:{ all -> 0x02b5 }
            M r1 = r12.f339878e_     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.vector.VectorMap r1 = (com.tencent.mapsdk.vector.VectorMap) r1     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.es r1 = r1.getProjection()     // Catch:{ all -> 0x02b5 }
            android.graphics.Rect r1 = r3.getScreenBound(r1)     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x00a4
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnInfoWindowClickListener r2 = r12.f342599z     // Catch:{ all -> 0x02b5 }
            int r3 = r1.width()     // Catch:{ all -> 0x02b5 }
            int r4 = r1.height()     // Catch:{ all -> 0x02b5 }
            int r13 = (int) r13     // Catch:{ all -> 0x02b5 }
            int r5 = r1.left     // Catch:{ all -> 0x02b5 }
            int r13 = r13 - r5
            int r14 = (int) r14     // Catch:{ all -> 0x02b5 }
            int r1 = r1.top     // Catch:{ all -> 0x02b5 }
            int r14 = r14 - r1
            r2.onInfoWindowClickLocation(r3, r4, r13, r14)     // Catch:{ all -> 0x02b5 }
        L_0x00a4:
            monitor-exit(r0)     // Catch:{ all -> 0x02b5 }
            return r6
        L_0x00a6:
            com.tencent.mapsdk.internal.mq r1 = r12.f342647aD     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.bi r1 = r1.f340880J     // Catch:{ all -> 0x02b5 }
            java.util.List<com.tencent.mapsdk.internal.et> r3 = r1.f339805b     // Catch:{ all -> 0x02b5 }
            int r4 = r3.size()     // Catch:{ all -> 0x02b5 }
            int r4 = r4 - r6
            r8 = r2
            r7 = 0
        L_0x00b3:
            if (r4 < 0) goto L_0x00c5
            java.lang.Object r7 = r3.get(r4)     // Catch:{ all -> 0x02b5 }
            r8 = r7
            com.tencent.mapsdk.internal.et r8 = (com.tencent.mapsdk.internal.C113709et) r8     // Catch:{ all -> 0x02b5 }
            boolean r7 = m160174a((com.tencent.mapsdk.internal.C113709et) r8, (float) r13, (float) r14)     // Catch:{ all -> 0x02b5 }
            if (r7 != 0) goto L_0x00c5
            int r4 = r4 + -1
            goto L_0x00b3
        L_0x00c5:
            if (r7 != 0) goto L_0x00e0
            java.util.List<com.tencent.mapsdk.internal.et> r3 = r1.f339806c     // Catch:{ all -> 0x02b5 }
            int r4 = r3.size()     // Catch:{ all -> 0x02b5 }
            int r4 = r4 - r6
        L_0x00ce:
            if (r4 < 0) goto L_0x00e0
            java.lang.Object r7 = r3.get(r4)     // Catch:{ all -> 0x02b5 }
            r8 = r7
            com.tencent.mapsdk.internal.et r8 = (com.tencent.mapsdk.internal.C113709et) r8     // Catch:{ all -> 0x02b5 }
            boolean r7 = m160174a((com.tencent.mapsdk.internal.C113709et) r8, (float) r13, (float) r14)     // Catch:{ all -> 0x02b5 }
            if (r7 != 0) goto L_0x00e0
            int r4 = r4 + -1
            goto L_0x00ce
        L_0x00e0:
            if (r7 != 0) goto L_0x0123
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x02b5 }
            r3.<init>()     // Catch:{ all -> 0x02b5 }
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.et> r4 = r1.f339804a     // Catch:{ all -> 0x02b5 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x02b5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x02b5 }
        L_0x00f1:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x02b5 }
            if (r9 == 0) goto L_0x0107
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.et r9 = (com.tencent.mapsdk.internal.C113709et) r9     // Catch:{ all -> 0x02b5 }
            boolean r10 = r9 instanceof com.tencent.mapsdk.internal.C113529ax     // Catch:{ all -> 0x02b5 }
            if (r10 == 0) goto L_0x00f1
            com.tencent.mapsdk.internal.ax r9 = (com.tencent.mapsdk.internal.C113529ax) r9     // Catch:{ all -> 0x02b5 }
            r3.add(r9)     // Catch:{ all -> 0x02b5 }
            goto L_0x00f1
        L_0x0107:
            java.util.Comparator<com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable> r1 = r1.f339811h     // Catch:{ all -> 0x02b5 }
            java.util.Collections.sort(r3, r1)     // Catch:{ all -> 0x02b5 }
            int r1 = r3.size()     // Catch:{ all -> 0x02b5 }
            int r1 = r1 - r6
        L_0x0111:
            if (r1 < 0) goto L_0x0123
            java.lang.Object r4 = r3.get(r1)     // Catch:{ all -> 0x02b5 }
            r8 = r4
            com.tencent.mapsdk.internal.et r8 = (com.tencent.mapsdk.internal.C113709et) r8     // Catch:{ all -> 0x02b5 }
            boolean r7 = m160174a((com.tencent.mapsdk.internal.C113709et) r8, (float) r13, (float) r14)     // Catch:{ all -> 0x02b5 }
            if (r7 != 0) goto L_0x0123
            int r1 = r1 + -1
            goto L_0x0111
        L_0x0123:
            if (r7 == 0) goto L_0x01fa
            boolean r1 = r8 instanceof com.tencent.mapsdk.internal.C113528aw     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x01ad
            com.tencent.mapsdk.internal.aw r8 = (com.tencent.mapsdk.internal.C113528aw) r8     // Catch:{ all -> 0x02b5 }
            M r1 = r12.f339878e_     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.vector.VectorMap r1 = (com.tencent.mapsdk.vector.VectorMap) r1     // Catch:{ all -> 0x02b5 }
            if (r1 != 0) goto L_0x0133
            goto L_0x01f9
        L_0x0133:
            if (r8 != 0) goto L_0x013d
            java.lang.String r1 = ""
            r12.mo171582b((java.lang.String) r1)     // Catch:{ all -> 0x02b5 }
        L_0x013a:
            r7 = 1
            goto L_0x01fa
        L_0x013d:
            com.tencent.mapsdk.internal.ao r1 = r8.f339728a     // Catch:{ all -> 0x02b5 }
            java.lang.String r3 = r1.getId()     // Catch:{ all -> 0x02b5 }
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMarkerClickListener r4 = r12.f342598y     // Catch:{ all -> 0x02b5 }
            if (r4 == 0) goto L_0x014e
            boolean r4 = r4.onMarkerClick(r8)     // Catch:{ all -> 0x02b5 }
            if (r4 == 0) goto L_0x014e
            goto L_0x013a
        L_0x014e:
            boolean r4 = r8.isInfoWindowEnable()     // Catch:{ all -> 0x02b5 }
            if (r4 != 0) goto L_0x0156
            goto L_0x01f9
        L_0x0156:
            boolean r4 = r12.f342572ao     // Catch:{ all -> 0x02b5 }
            if (r4 != 0) goto L_0x0190
            com.tencent.mapsdk.internal.ao r3 = r12.f342573ap     // Catch:{ all -> 0x02b5 }
            if (r3 != 0) goto L_0x0164
            r1.showInfoWindow()     // Catch:{ all -> 0x02b5 }
            r12.f342573ap = r1     // Catch:{ all -> 0x02b5 }
            goto L_0x013a
        L_0x0164:
            if (r3 != r1) goto L_0x0187
            com.tencent.mapsdk.internal.eq r3 = r1.mo171381h()     // Catch:{ all -> 0x02b5 }
            if (r3 == 0) goto L_0x0178
            com.tencent.mapsdk.internal.eq r3 = r1.mo171381h()     // Catch:{ all -> 0x02b5 }
            boolean r3 = r3.mo172011c()     // Catch:{ all -> 0x02b5 }
            if (r3 == 0) goto L_0x0178
            r3 = 1
            goto L_0x0179
        L_0x0178:
            r3 = 0
        L_0x0179:
            if (r3 == 0) goto L_0x0181
            r1.hideInfoWindow()     // Catch:{ all -> 0x02b5 }
            r12.f342573ap = r2     // Catch:{ all -> 0x02b5 }
            goto L_0x013a
        L_0x0181:
            r1.showInfoWindow()     // Catch:{ all -> 0x02b5 }
            r12.f342573ap = r1     // Catch:{ all -> 0x02b5 }
            goto L_0x013a
        L_0x0187:
            r3.hideInfoWindow()     // Catch:{ all -> 0x02b5 }
            r1.showInfoWindow()     // Catch:{ all -> 0x02b5 }
            r12.f342573ap = r1     // Catch:{ all -> 0x02b5 }
            goto L_0x013a
        L_0x0190:
            com.tencent.mapsdk.internal.eq r2 = r1.mo171381h()     // Catch:{ all -> 0x02b5 }
            if (r2 != 0) goto L_0x019a
            r1.showInfoWindow()     // Catch:{ all -> 0x02b5 }
            goto L_0x01a9
        L_0x019a:
            boolean r2 = r1.isInfoWindowShown()     // Catch:{ all -> 0x02b5 }
            if (r2 == 0) goto L_0x01a4
            r1.hideInfoWindow()     // Catch:{ all -> 0x02b5 }
            goto L_0x01a9
        L_0x01a4:
            r1.showInfoWindow()     // Catch:{ all -> 0x02b5 }
            r12.f342573ap = r1     // Catch:{ all -> 0x02b5 }
        L_0x01a9:
            r12.mo171582b((java.lang.String) r3)     // Catch:{ all -> 0x02b5 }
            goto L_0x013a
        L_0x01ad:
            boolean r1 = r8 instanceof com.tencent.mapsdk.internal.C113530ay     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x01d3
            com.tencent.mapsdk.internal.ay r8 = (com.tencent.mapsdk.internal.C113530ay) r8     // Catch:{ all -> 0x02b5 }
            boolean r1 = r8.isClickable()     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x01f9
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnPolylineClickListener r1 = r12.f342652aI     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x01f9
            C r2 = r12.f339876d_     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.mq r2 = (com.tencent.mapsdk.internal.C113961mq) r2     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.es r2 = r2.f340906n     // Catch:{ all -> 0x02b5 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ all -> 0x02b5 }
            int r4 = (int) r13     // Catch:{ all -> 0x02b5 }
            int r7 = (int) r14     // Catch:{ all -> 0x02b5 }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x02b5 }
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r2 = r2.fromScreenLocation(r3)     // Catch:{ all -> 0x02b5 }
            r1.onPolylineClick(r8, r2)     // Catch:{ all -> 0x02b5 }
            goto L_0x013a
        L_0x01d3:
            boolean r1 = r8 instanceof com.tencent.mapsdk.internal.C113529ax     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x01f9
            com.tencent.mapsdk.internal.ax r8 = (com.tencent.mapsdk.internal.C113529ax) r8     // Catch:{ all -> 0x02b5 }
            boolean r1 = r8.isClickable()     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x01f9
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnPolygonClickListener r1 = r12.f342653aJ     // Catch:{ all -> 0x02b5 }
            if (r1 == 0) goto L_0x01f9
            C r2 = r12.f339876d_     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.mq r2 = (com.tencent.mapsdk.internal.C113961mq) r2     // Catch:{ all -> 0x02b5 }
            com.tencent.mapsdk.internal.es r2 = r2.f340906n     // Catch:{ all -> 0x02b5 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ all -> 0x02b5 }
            int r4 = (int) r13     // Catch:{ all -> 0x02b5 }
            int r7 = (int) r14     // Catch:{ all -> 0x02b5 }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x02b5 }
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r2 = r2.fromScreenLocation(r3)     // Catch:{ all -> 0x02b5 }
            r1.onPolygonClick(r8, r2)     // Catch:{ all -> 0x02b5 }
            goto L_0x013a
        L_0x01f9:
            r7 = 0
        L_0x01fa:
            if (r7 == 0) goto L_0x01fe
            monitor-exit(r0)     // Catch:{ all -> 0x02b5 }
            return r7
        L_0x01fe:
            monitor-exit(r0)     // Catch:{ all -> 0x02b5 }
            boolean r0 = r12.f342582i
            if (r0 == 0) goto L_0x021b
            byte[] r0 = r12.f342580g
            monitor-enter(r0)
            C r1 = r12.f339876d_     // Catch:{ all -> 0x0218 }
            com.tencent.mapsdk.internal.mq r1 = (com.tencent.mapsdk.internal.C113961mq) r1     // Catch:{ all -> 0x0218 }
            com.tencent.mapsdk.internal.bi r1 = r1.f340880J     // Catch:{ all -> 0x0218 }
            java.util.List<com.tencent.mapsdk.internal.et> r1 = r1.f339805b     // Catch:{ all -> 0x0218 }
            com.tencent.mapsdk.internal.sx$3 r2 = new com.tencent.mapsdk.internal.sx$3     // Catch:{ all -> 0x0218 }
            r2.<init>()     // Catch:{ all -> 0x0218 }
            com.tencent.map.tools.Util.foreach(r1, r2)     // Catch:{ all -> 0x0218 }
            monitor-exit(r0)     // Catch:{ all -> 0x0218 }
            goto L_0x021b
        L_0x0218:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0218 }
            throw r13
        L_0x021b:
            M r0 = r12.f339878e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            com.tencent.mapsdk.engine.jni.models.TappedElement r0 = r0.mo173434a((float) r13, (float) r14)
            if (r0 == 0) goto L_0x0289
            int r1 = r0.type
            if (r1 == 0) goto L_0x0289
            if (r1 == r6) goto L_0x024d
            r2 = 4
            if (r1 == r2) goto L_0x0233
            r0 = 8
            if (r1 == r0) goto L_0x0287
            goto L_0x0289
        L_0x0233:
            com.tencent.mapsdk.internal.mq r1 = r12.f342647aD
            if (r1 == 0) goto L_0x0289
            com.tencent.mapsdk.internal.rg r1 = r1.f340871A
            if (r1 != 0) goto L_0x023c
            goto L_0x0289
        L_0x023c:
            long r2 = r0.itemId
            int r0 = (int) r2
            com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent r0 = r1.mo172773a((int) r0)
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnTrafficEventClickListener r1 = r12.f342576as
            if (r1 == 0) goto L_0x0289
            if (r0 == 0) goto L_0x0289
            r1.onTrafficEventClicked(r0)
            goto L_0x0287
        L_0x024d:
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r1 = r12.f342518A
            if (r1 == 0) goto L_0x0287
            int r1 = r0.itemType
            if (r1 != r6) goto L_0x0267
            com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi r1 = new com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi
            r1.<init>()
            java.lang.String r2 = r0.buildingName
            r1.buildingName = r2
            java.lang.String r2 = r0.buildingId
            r1.buildingId = r2
            java.lang.String r2 = r0.floorName
            r1.floorName = r2
            goto L_0x026c
        L_0x0267:
            com.tencent.tencentmap.mapsdk.maps.model.MapPoi r1 = new com.tencent.tencentmap.mapsdk.maps.model.MapPoi
            r1.<init>()
        L_0x026c:
            java.lang.String r2 = r0.name
            r1.name = r2
            int r2 = r0.pixelX
            int r3 = r0.pixelY
            com.tencent.map.lib.models.GeoPoint r2 = com.tencent.mapsdk.internal.C113883ke.m157465a((int) r2, (int) r3)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r2 = r2.toLatLng()
            r1.position = r2
            java.lang.String r0 = r0.poiId
            r1.poiId = r0
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r12.f342518A
            r0.onClicked(r1)
        L_0x0287:
            r0 = 1
            goto L_0x028a
        L_0x0289:
            r0 = 0
        L_0x028a:
            if (r0 == 0) goto L_0x028d
            return r6
        L_0x028d:
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapClickListener r0 = r12.f342592s
            if (r0 == 0) goto L_0x02b1
            boolean r0 = r12.f342657ay
            if (r0 == 0) goto L_0x02b1
            com.tencent.mapsdk.internal.fo r0 = new com.tencent.mapsdk.internal.fo
            double r1 = (double) r13
            double r13 = (double) r14
            r0.<init>(r1, r13)
            M r13 = r12.f339878e_
            com.tencent.mapsdk.vector.VectorMap r13 = (com.tencent.mapsdk.vector.VectorMap) r13
            com.tencent.mapsdk.internal.es r13 = r13.getProjection()
            com.tencent.map.lib.models.GeoPoint r13 = r13.mo172025a((com.tencent.mapsdk.internal.C113732fo) r0)
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r13 = com.tencent.mapsdk.internal.C113883ke.m157466a((com.tencent.map.lib.models.GeoPoint) r13)
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapClickListener r14 = r12.f342592s
            r14.onMapClick(r13)
        L_0x02b1:
            r12.mo171542F()
            return r5
        L_0x02b5:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02b5 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114322sx.mo171584b(float, float):boolean");
    }

    /* renamed from: d */
    public final String mo171591d(final float f, final float f2) {
        final String[] strArr = {null};
        synchronized (this.f342580g) {
            Util.where(((C113961mq) this.f339876d_).f340880J.mo171677b(), new ReturnCallback<Boolean, C113709et>() {
                /* renamed from: a */
                private Boolean m160287a(C113709et etVar) {
                    if (etVar == null || !etVar.isVisible()) {
                        return Boolean.FALSE;
                    }
                    if (!(etVar instanceof C113528aw)) {
                        return Boolean.FALSE;
                    }
                    if (!etVar.onTap(f, f2)) {
                        return Boolean.FALSE;
                    }
                    strArr[0] = etVar.getId();
                    return Boolean.TRUE;
                }

                public final /* synthetic */ Object callback(Object obj) {
                    C113709et etVar = (C113709et) obj;
                    if (etVar == null || !etVar.isVisible()) {
                        return Boolean.FALSE;
                    }
                    if (!(etVar instanceof C113528aw)) {
                        return Boolean.FALSE;
                    }
                    if (!etVar.onTap(f, f2)) {
                        return Boolean.FALSE;
                    }
                    strArr[0] = etVar.getId();
                    return Boolean.TRUE;
                }
            });
        }
        return strArr[0];
    }

    /* renamed from: c */
    public final boolean mo171589c(float f, float f2) {
        C114216sq sqVar;
        C113961mq mqVar = this.f342647aD;
        C113711ev evVar = this.f342571an;
        if (mqVar.f340882L == null) {
            C113971mt mtVar = mqVar.f340903k.f339824i.get(C113983nd.class);
            if ((mtVar != null ? mtVar.mo172498i() : false) && (sqVar = mqVar.f340899g) != null) {
                sqVar.f342023d.scheduleClickOnNextRender(sqVar.f342024e, f, f2);
                mqVar.f340882L = evVar;
                return true;
            }
        }
        mqVar.f340882L = null;
        return false;
    }

    /* renamed from: a */
    public final void mo171573a(String str) {
        mo171582b(str);
    }

    /* renamed from: n */
    public final boolean mo172985n(boolean z) {
        Handler handler = this.f342519B;
        if (handler == null || !handler.getLooper().getThread().isAlive()) {
            return false;
        }
        C113889km.m157545b(C0949kl.f2236f, "send onStable Event");
        this.f342519B.sendEmptyMessage(z ? 2 : 1);
        return true;
    }

    /* renamed from: a */
    public final boolean mo171575a(float f, float f2) {
        String d;
        if (this.f342593t != null && (d = mo171591d(f, f2)) != null && d.trim().length() != 0) {
            this.f342593t.mo171631a(d);
            return true;
        } else if (this.f342595v == null || !this.f342657ay) {
            return false;
        } else {
            this.f342595v.onMapLongClick(C113883ke.m157466a(((VectorMap) this.f339878e_).getProjection().mo172025a(new C113732fo((double) f, (double) f2))));
            return false;
        }
    }

    /* renamed from: e */
    public final String mo171595e() {
        return this.f342581h;
    }

    /* renamed from: e */
    public final void mo171596e(boolean z) {
        this.f342542Y = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.tencent.mapsdk.internal.pi$d} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.tencent.tencentmap.mapsdk.maps.model.MapPoi] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f1 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171597e(float r12, float r13) {
        /*
            r11 = this;
            boolean r0 = r11.f342657ay
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            M r0 = r11.f339878e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            com.tencent.mapsdk.internal.mq r2 = r0.f342909o
            com.tencent.mapsdk.internal.bj r2 = r2.f340903k
            com.tencent.mapsdk.internal.be r3 = r2.f339816a
            com.tencent.mapsdk.internal.sq r3 = r3.mo171638f()
            com.tencent.mapsdk.engine.jni.models.TappedElement r3 = r3.mo172899a((float) r12, (float) r13)
            r4 = 1
            if (r3 == 0) goto L_0x0029
            int r3 = r3.type
            r5 = 3
            if (r3 != r5) goto L_0x0029
            com.tencent.mapsdk.internal.eu r2 = r2.f339823h
            if (r2 == 0) goto L_0x0027
            r2.mo172034R()
        L_0x0027:
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r2 != 0) goto L_0x00f2
            com.tencent.mapsdk.internal.bg r2 = r0.f342912r
            if (r2 == 0) goto L_0x0077
            com.tencent.mapsdk.internal.mq r3 = r2.f339749d
            com.tencent.mapsdk.internal.bj r3 = r3.f340903k
            com.tencent.mapsdk.internal.be r3 = r3.f339816a
            com.tencent.mapsdk.internal.sq r3 = r3.mo171638f()
            com.tencent.mapsdk.engine.jni.models.TappedElement r3 = r3.mo172899a((float) r12, (float) r13)
            if (r3 == 0) goto L_0x0047
            int r3 = r3.type
            r5 = 6
            if (r3 != r5) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r3 == 0) goto L_0x0078
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationClickListener r5 = r2.f339750e
            if (r5 == 0) goto L_0x0078
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r3 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            r3.<init>()
            android.location.Location r5 = r2.f339748c
            if (r5 == 0) goto L_0x0070
            double r5 = r5.getAltitude()
            r3.setAltitude(r5)
            android.location.Location r5 = r2.f339748c
            double r5 = r5.getLongitude()
            r3.setLongitude(r5)
            android.location.Location r5 = r2.f339748c
            double r5 = r5.getLatitude()
            r3.setLatitude(r5)
        L_0x0070:
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationClickListener r2 = r2.f339750e
            boolean r3 = r2.onMyLocationClicked(r3)
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            if (r3 != 0) goto L_0x00f2
            com.tencent.mapsdk.engine.jni.models.TappedElement r12 = r0.mo173434a((float) r12, (float) r13)
            if (r12 == 0) goto L_0x00ed
            com.tencent.mapsdk.internal.pj r13 = r0.f342913s
            if (r13 == 0) goto L_0x00ed
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r13.f341297c
            if (r0 == 0) goto L_0x00ed
            int r0 = r12.type
            r2 = 4
            if (r0 != r2) goto L_0x00ed
            long r2 = r12.itemId
            java.util.List<com.tencent.mapsdk.internal.ph> r12 = r13.f341295a
            java.util.Iterator r12 = r12.iterator()
        L_0x0095:
            boolean r0 = r12.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r12.next()
            com.tencent.mapsdk.internal.ph r0 = (com.tencent.mapsdk.internal.C114050ph) r0
            com.tencent.mapsdk.internal.pi r6 = r0.f341245b
            if (r6 == 0) goto L_0x00da
            com.tencent.mapsdk.internal.pi$d r6 = r6.f341264a
            if (r6 == 0) goto L_0x00da
            java.util.List<com.tencent.mapsdk.internal.pi$d> r6 = r6.f341282j
            if (r6 == 0) goto L_0x00da
            java.util.Iterator r6 = r6.iterator()
        L_0x00b2:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r6.next()
            com.tencent.mapsdk.internal.pi$d r7 = (com.tencent.mapsdk.internal.C114056pi.C114060d) r7
            com.tencent.mapsdk.internal.pj r8 = r0.f341244a
            com.tencent.mapsdk.internal.mq r8 = r8.f341296b
            com.tencent.mapsdk.internal.bj r8 = r8.f340903k
            java.lang.Class<com.tencent.mapsdk.internal.no> r9 = com.tencent.mapsdk.internal.C113995no.class
            int r10 = r7.f341273a
            com.tencent.mapsdk.internal.ms r8 = r8.mo171681a(r9, (int) r10)
            com.tencent.mapsdk.internal.no r8 = (com.tencent.mapsdk.internal.C113995no) r8
            if (r8 == 0) goto L_0x00b2
            int r8 = r8.mo172502a()
            long r8 = (long) r8
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x00b2
            r5 = r7
        L_0x00da:
            if (r5 == 0) goto L_0x0095
            java.lang.String r12 = r0.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r5 = com.tencent.mapsdk.internal.C114050ph.m158773a((java.lang.String) r12, (com.tencent.mapsdk.internal.C114056pi.C114060d) r5)
        L_0x00e4:
            if (r5 == 0) goto L_0x00ed
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r12 = r13.f341297c
            r12.onClicked(r5)
            r12 = 1
            goto L_0x00ee
        L_0x00ed:
            r12 = 0
        L_0x00ee:
            if (r12 == 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            return r1
        L_0x00f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114322sx.mo171597e(float, float):boolean");
    }

    /* renamed from: d */
    public final boolean mo171594d(String str) {
        C113521ap f_;
        boolean z = false;
        if (str == null) {
            return false;
        }
        synchronized (this.f342580g) {
            C113551bi biVar = this.f342647aD.f340880J;
            C113709et remove = biVar.f339804a.remove(str);
            if (remove != null) {
                biVar.f339805b.remove(remove);
                biVar.f339806c.remove(remove);
                biVar.f339807d.remove(remove);
                if ((remove instanceof C113527av) && (f_ = ((C113527av) remove).mo171394f_()) != null) {
                    biVar.f339808e.remove(f_);
                }
            }
            if (remove != null) {
                z = true;
            }
            if (z) {
                ((VectorMap) this.f339878e_).mo173486n();
            }
        }
        return z;
    }

    /* renamed from: k */
    public final void mo171611k(boolean z) {
        this.f342574aq = z;
    }

    /* renamed from: c */
    public final C114027oy mo171586c(String str) {
        C c = this.f339876d_;
        if (c == null) {
            return null;
        }
        C113709et a = ((C113961mq) c).f340880J.mo171669a(str);
        if (!(a instanceof C113527av)) {
            return null;
        }
        C113521ap f_ = ((C113527av) a).mo171394f_();
        if (f_ instanceof C114027oy) {
            return (C114027oy) f_;
        }
        return null;
    }

    /* renamed from: h */
    public final boolean mo171605h() {
        return this.f342541X;
    }

    /* renamed from: a */
    public final void mo171561a(C113723fh fhVar) {
        if (this.f342591r == null) {
            this.f342591r = new ArrayList();
        }
        if (!this.f342591r.contains(fhVar)) {
            this.f342591r.add(fhVar);
        }
    }

    /* renamed from: a */
    public final void mo171574a(boolean z) {
        this.f342582i = z;
    }

    /* renamed from: a */
    public final void mo171557a(C113534bc bcVar) {
        this.f342593t = bcVar;
    }

    /* renamed from: a */
    public final void mo171572a(TencentMapGestureListener tencentMapGestureListener) {
        if (this.f342656ax == null) {
            this.f342656ax = new TencentMapGestureListenerList();
        }
        this.f342656ax.addListener(tencentMapGestureListener);
    }

    /* renamed from: a */
    public final void mo171554a(int i) {
        this.f342554aV = i;
        mo171555a(this.f342553aU, i);
        mo171542F();
    }

    /* renamed from: d */
    public final void mo171592d(int i, int i2) {
        this.f342531N = i;
        this.f342532O = i2;
    }

    /* renamed from: a */
    public final void mo171555a(int i, int i2) {
        this.f342553aU = i;
        this.f342554aV = i2;
        ((VectorMap) this.f339878e_).mo173460c(i, i2);
        mo171542F();
    }

    /* renamed from: a */
    public final void mo171558a(C113540bh.C113549a aVar) {
        this.f342522E = aVar;
    }

    /* renamed from: a */
    public final void mo171552a(float f) {
        if (this.f342555aW != f) {
            this.f342555aW = f;
            if (!this.f342590q.isEmpty()) {
                C113739fu fuVar = new C113739fu();
                fuVar.f340295f = 1;
                fuVar.f340298i = ((VectorMap) this.f339878e_).mo173490r();
                fuVar.f340299j = ((VectorMap) this.f339878e_).getProjection().mo172022a(new Point(0, this.f342570am / 2), new Point(this.f342569al, this.f342570am / 2));
                for (C113717fb a : this.f342590q) {
                    a.mo171693a(fuVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo171560a(C113717fb fbVar) {
        this.f342590q.remove(fbVar);
        this.f342590q.add(fbVar);
    }

    /* renamed from: a */
    public final void mo171567a(TencentMap.OnDismissCallback onDismissCallback) {
        this.f342596w = onDismissCallback;
    }

    /* renamed from: a */
    public final void mo171568a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f342597x = onIndoorStateChangeListener;
    }

    /* renamed from: a */
    public final void mo171569a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.f342518A = onMapPoiClickListener;
    }

    /* renamed from: a */
    public final void mo171565a(C114165rp rpVar) {
        this.f342586m = rpVar;
    }

    /* renamed from: a */
    public final void mo171564a(C114097qd qdVar) {
        this.f342587n = qdVar;
    }

    /* renamed from: a */
    private void m160168a(TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        this.f342523F = onScaleViewChangedListener;
    }

    /* renamed from: a */
    public final void mo171566a(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        List<TencentMap.OnCameraChangeListener> list = this.f342594u;
        if (!(list == null || onCameraChangeListener == null)) {
            list.add(onCameraChangeListener);
        }
        if (!(onCameraChangeListener == null) || this.f342584k.f341875b.f341859e) {
            ((VectorMap) this.f339878e_).mo173438a(this.f342544aL);
        } else {
            ((VectorMap) this.f339878e_).mo173438a((C113533bb) null);
        }
    }

    /* renamed from: a */
    public final void mo171571a(OverSeaTileProvider overSeaTileProvider) {
        C114189rv rvVar = this.f342584k;
        if (rvVar != null && rvVar.f341876c != overSeaTileProvider) {
            C113889km.m157550c(C0949kl.f2238h, "设置自定义海外图源，old[" + rvVar.f341876c + "] to new[" + overSeaTileProvider + "]");
            rvVar.f341876c = overSeaTileProvider;
            rvVar.f341878e = true;
            C114185ru ruVar = rvVar.f341875b;
            ruVar.f341865k = overSeaTileProvider;
            List<C114193ry> c = ruVar.mo172834c();
            C114322sx sxVar = rvVar.f341874a;
            if (sxVar != null) {
                sxVar.mo172981a(false, c);
            }
            rvVar.mo172837a();
        }
    }

    /* renamed from: a */
    public final void mo172980a(GL10 gl10, EGLConfig eGLConfig) {
        C113896kq.m157663b(C0950kp.f2278X);
        super.mo172980a(gl10, eGLConfig);
    }

    /* renamed from: a */
    public final void mo172979a(GL10 gl10, int i, int i2) {
        super.mo172979a(gl10, i, i2);
        this.f342569al = i;
        this.f342570am = i2;
        mo171587c((int) (((float) i) * this.f342533P), (int) (((float) i2) * this.f342534Q));
        mo171592d((int) (((float) this.f342569al) * this.f342535R), (int) (((float) this.f342570am) * this.f342536S));
        C113540bh.C113549a aVar = this.f342522E;
        if (aVar != null) {
            aVar.mo171668a();
        }
    }

    /* renamed from: a */
    private void m160165a(Handler handler, GL10 gl10) {
        C114165rp rpVar = this.f342586m;
        if (rpVar != null) {
            rpVar.mo172805l();
        }
        m160185b(handler, gl10);
        C114165rp rpVar2 = this.f342586m;
        if (rpVar2 != null) {
            rpVar2.mo172806m();
        }
    }

    /* renamed from: a */
    private Bitmap m160163a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), (Paint) null);
        canvas.drawBitmap(bitmap2, (float) this.f342586m.mo171996a().left, (float) this.f342586m.mo171996a().top, (Paint) null);
        return createBitmap;
    }

    /* renamed from: a */
    private boolean m160176a(C113741fw[] fwVarArr) {
        C113741fw[] W = mo172978W();
        if (fwVarArr == null) {
            return true;
        }
        return C114181rs.m159512a(W, fwVarArr);
    }

    /* renamed from: a */
    public static boolean m160175a(LatLng latLng, C113741fw[] fwVarArr) {
        if (latLng == null) {
            return false;
        }
        C113741fw b = C114373y.m160626b(GeoPoint.from(latLng));
        double d = b.f340307c;
        C113741fw fwVar = fwVarArr[0];
        if (d >= fwVar.f340307c) {
            C113741fw fwVar2 = fwVarArr[1];
            if (d <= fwVar2.f340307c) {
                double d2 = b.f340306b;
                if (d2 > fwVar.f340306b || d2 < fwVar2.f340306b) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m160167a(C114030pa paVar) {
        C114046pe peVar = this.f342575ar;
        if (peVar != null) {
            peVar.mo172633a(paVar);
        }
    }

    /* renamed from: a */
    public final boolean mo172982a(MotionEvent motionEvent) {
        C114046pe peVar = this.f342575ar;
        if (peVar != null) {
            return peVar.dispatchHoverEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    private void m160169a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        this.f342576as = onTrafficEventClickListener;
    }

    /* renamed from: a */
    private void m160166a(C113535bd bdVar) {
        this.f342579av.remove(bdVar);
        this.f342579av.add(bdVar);
    }

    /* renamed from: a */
    public final void mo172981a(final boolean z, final List<C114193ry> list) {
        C113865kb.m157402b(new Runnable() {
            public final void run() {
                for (C113535bd a : C114322sx.this.f342579av) {
                    a.mo171632a(z, list);
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m160173a(C113530ay ayVar, float f, float f2) {
        TencentMap.OnPolylineClickListener onPolylineClickListener;
        if (!ayVar.isClickable() || (onPolylineClickListener = this.f342652aI) == null) {
            return false;
        }
        onPolylineClickListener.onPolylineClick(ayVar, ((C113961mq) this.f339876d_).f340906n.fromScreenLocation(new Point((int) f, (int) f2)));
        return true;
    }

    /* renamed from: a */
    private boolean m160172a(C113529ax axVar, float f, float f2) {
        TencentMap.OnPolygonClickListener onPolygonClickListener;
        if (!axVar.isClickable() || (onPolygonClickListener = this.f342653aJ) == null) {
            return false;
        }
        onPolygonClickListener.onPolygonClick(axVar, ((C113961mq) this.f339876d_).f340906n.fromScreenLocation(new Point((int) f, (int) f2)));
        return true;
    }

    /* renamed from: a */
    private static boolean m160174a(C113709et etVar, float f, float f2) {
        if (etVar == null || !etVar.isVisible() || !etVar.handleOnTap()) {
            return false;
        }
        return etVar.onTap(f, f2);
    }

    /* renamed from: a */
    public final CameraPosition mo171551a() {
        VectorMap vectorMap = (VectorMap) this.f339878e_;
        GeoPoint q = vectorMap.mo173489q();
        if (q == null) {
            return null;
        }
        List<TencentMap.OnCameraChangeListener> list = this.f342594u;
        if ((list == null || list.size() <= 0) && this.f342571an == null) {
            return null;
        }
        LatLng a = C113883ke.m157466a(q);
        float t = vectorMap.mo173493t();
        if (t < 0.0f) {
            t = (t % 360.0f) + 360.0f;
        }
        return CameraPosition.builder().zoom(vectorMap.f342909o.f340912t.mo173058a()).target(a).bearing(t).tilt(vectorMap.mo173494u()).build();
    }

    /* renamed from: b */
    public final void mo171583b(boolean z) {
        this.f342540W = z;
    }

    /* renamed from: b */
    public final void mo171581b(TencentMapGestureListener tencentMapGestureListener) {
        TencentMapGestureListenerList tencentMapGestureListenerList = this.f342656ax;
        if (tencentMapGestureListenerList != null) {
            tencentMapGestureListenerList.removeListener(tencentMapGestureListener);
        }
    }

    /* renamed from: b */
    public final void mo171577b(float f) {
        TencentMap.OnScaleViewChangedListener onScaleViewChangedListener = this.f342523F;
        if (onScaleViewChangedListener != null) {
            onScaleViewChangedListener.onScaleViewChanged(f);
        }
    }

    /* renamed from: b */
    public final void mo171578b(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (this.f342549aQ == null) {
                GeoPoint q = ((VectorMap) this.f339878e_).mo173489q();
                this.f342549aQ = new GeoPoint(q.getLatitudeE6(), q.getLongitudeE6());
            }
            this.f342549aQ.setLatitudeE6(i);
            this.f342549aQ.setLongitudeE6(i2);
        }
    }

    /* renamed from: a */
    public final void mo171570a(TencentMapOptions tencentMapOptions) {
        String str;
        Context applicationContext = mo171543G().getApplicationContext();
        String str2 = mo172974S().f339870c;
        C114333ta taVar = new C114333ta(this, str2);
        this.f342548aP = taVar;
        taVar.mo172556b();
        C114075pp.m158852a(applicationContext, str2);
        mo171562a(this.f342548aP, (C113932lh) C114130qy.m159265c());
        C113627dj djVar = (C113627dj) C113601cl.m156511a(C113627dj.class);
        VectorMap vectorMap = (VectorMap) this.f339878e_;
        StringBuilder sb = new StringBuilder();
        String i = djVar.mo171959i();
        String str3 = null;
        if (!TextUtils.isEmpty(i)) {
            String j = djVar.mo171960j();
            if (!TextUtils.isEmpty(j)) {
                sb.append(j);
                sb.append("://");
            }
            sb.append(i);
            str = sb.toString();
        } else {
            str = null;
        }
        vectorMap.f342909o.mo172437a(str);
        C113633dp dpVar = (C113633dp) C113601cl.m156511a(C113633dp.class);
        if (tencentMapOptions != null) {
            str3 = tencentMapOptions.getSatelliteVersion();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "0";
        }
        String satelliteUrl = ((C113616db) dpVar.mo171932h()).satelliteUrl("%d", "%d", "%d", str3);
        if (dpVar.f340004c && !TextUtils.isEmpty(satelliteUrl)) {
            C113889km.m157550c(C0949kl.f2236f, "satelliteUrl = ".concat(String.valueOf(satelliteUrl)));
            ((VectorMap) this.f339878e_).f342909o.mo172449b(satelliteUrl);
        }
        M m = this.f339878e_;
        if (!((VectorMap) m).f342909o.f340909q) {
            ((VectorMap) m).setMapStyle(0);
        } else {
            ((VectorMap) m).setMapStyle(5);
        }
    }

    /* renamed from: b */
    public final void mo171580b(C113717fb fbVar) {
        this.f342590q.remove(fbVar);
    }

    /* renamed from: b */
    private void m160187b(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        this.f342524G = onCameraChangeListener;
    }

    /* renamed from: b */
    private void m160188b(TencentMapOptions tencentMapOptions) {
        String str;
        Context applicationContext = mo171543G().getApplicationContext();
        String str2 = mo172974S().f339870c;
        C114333ta taVar = new C114333ta(this, str2);
        this.f342548aP = taVar;
        taVar.mo172556b();
        C114075pp.m158852a(applicationContext, str2);
        mo171562a(this.f342548aP, (C113932lh) C114130qy.m159265c());
        C113627dj djVar = (C113627dj) C113601cl.m156511a(C113627dj.class);
        VectorMap vectorMap = (VectorMap) this.f339878e_;
        StringBuilder sb = new StringBuilder();
        String i = djVar.mo171959i();
        String str3 = null;
        if (!TextUtils.isEmpty(i)) {
            String j = djVar.mo171960j();
            if (!TextUtils.isEmpty(j)) {
                sb.append(j);
                sb.append("://");
            }
            sb.append(i);
            str = sb.toString();
        } else {
            str = null;
        }
        vectorMap.f342909o.mo172437a(str);
        C113633dp dpVar = (C113633dp) C113601cl.m156511a(C113633dp.class);
        if (tencentMapOptions != null) {
            str3 = tencentMapOptions.getSatelliteVersion();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "0";
        }
        String satelliteUrl = ((C113616db) dpVar.mo171932h()).satelliteUrl("%d", "%d", "%d", str3);
        if (dpVar.f340004c && !TextUtils.isEmpty(satelliteUrl)) {
            C113889km.m157550c(C0949kl.f2236f, "satelliteUrl = ".concat(String.valueOf(satelliteUrl)));
            ((VectorMap) this.f339878e_).f342909o.mo172449b(satelliteUrl);
        }
    }

    /* renamed from: b */
    private void m160185b(Handler handler, GL10 gl10) {
        if (gl10 != null && handler != null) {
            int i = this.f342569al;
            int i2 = this.f342570am;
            int i3 = i * i2;
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            IntBuffer wrap = IntBuffer.wrap(iArr);
            wrap.position(0);
            gl10.glReadPixels(0, 0, i, i2, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = iArr[(i4 * i) + i5];
                    iArr2[(((i2 - i4) - 1) * i) + i5] = (i6 & -16711936) | ((i6 << 16) & 16711680) | ((i6 >> 16) & 255);
                }
            }
            Bitmap bitmap = null;
            try {
                bitmap = Bitmap.createBitmap(iArr2, i, i2, this.f342528K);
            } catch (OutOfMemoryError unused) {
            }
            C113572bv bvVar = this.f342650aG;
            if (bvVar != null && !(bvVar instanceof C114356th) && this.f342586m.mo172804k()) {
                bitmap = m160163a(bitmap, this.f342586m.mo172803j());
            }
            handler.sendMessage(handler.obtainMessage(0, bitmap));
        }
    }

    /* renamed from: a */
    private boolean m160170a(TappedElement tappedElement) {
        C114141rg rgVar;
        C113961mq mqVar = this.f342647aD;
        if (mqVar == null || (rgVar = mqVar.f340871A) == null) {
            return false;
        }
        TrafficEvent a = rgVar.mo172773a((int) tappedElement.itemId);
        TencentMap.OnTrafficEventClickListener onTrafficEventClickListener = this.f342576as;
        if (onTrafficEventClickListener == null || a == null) {
            return false;
        }
        onTrafficEventClickListener.onTrafficEventClicked(a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo172983a(final GL10 gl10) {
        M m;
        C114189rv rvVar;
        C113551bi biVar;
        C c = this.f339876d_;
        boolean z = false;
        if (!(c == null || (biVar = ((C113961mq) c).f340880J) == null)) {
            synchronized (this.f342580g) {
                final C113709et[] etVarArr = {null};
                Util.foreach(biVar.mo171677b(), new Callback<C113709et>() {
                    /* renamed from: a */
                    private void m160284a(C113709et etVar) {
                        if (!(etVar instanceof C113527av)) {
                            return;
                        }
                        if (!TextUtils.equals(etVar.getId(), C114322sx.this.f342581h)) {
                            etVar.mo171427a(gl10);
                        } else if (etVar.isVisible() || C114322sx.this.f342538U) {
                            etVarArr[0] = etVar;
                        } else {
                            etVar.releaseData();
                        }
                    }

                    public final /* synthetic */ void callback(Object obj) {
                        C113709et etVar = (C113709et) obj;
                        if (!(etVar instanceof C113527av)) {
                            return;
                        }
                        if (!TextUtils.equals(etVar.getId(), C114322sx.this.f342581h)) {
                            etVar.mo171427a(gl10);
                        } else if (etVar.isVisible() || C114322sx.this.f342538U) {
                            etVarArr[0] = etVar;
                        } else {
                            etVar.releaseData();
                        }
                    }
                });
                C113709et etVar = etVarArr[0];
                if (etVar != null) {
                    etVar.mo171427a(gl10);
                }
            }
        }
        boolean a = super.mo172983a(gl10);
        if (this.f342526I != null && SystemClock.elapsedRealtime() > this.f342527J) {
            C113889km.m157545b(C0949kl.f2236f, "snapShot : 1");
            m160165a(this.f342526I, gl10);
            this.f342526I = null;
        }
        if ((this.f342526I != null || !this.f342658az) && (m = this.f339878e_) != null && ((VectorMap) m).f342908n && (rvVar = this.f342584k) != null && rvVar.f341877d) {
            C113961mq mqVar = this.f342647aD;
            if (mqVar != null) {
                C114216sq sqVar = mqVar.f340899g;
                if (sqVar != null ? sqVar.mo172947j() : false) {
                    z = true;
                }
            }
            if (z) {
                if (!this.f342658az) {
                    mo172985n(true);
                }
                C113889km.m157545b(C0949kl.f2236f, "snapShot : 2");
                m160165a(this.f342526I, gl10);
                this.f342526I = null;
            }
        }
        return a;
    }

    /* renamed from: b */
    private void m160186b(C113535bd bdVar) {
        this.f342579av.remove(bdVar);
    }

    /* renamed from: b */
    private void m160189b(final GL10 gl10) {
        C113551bi biVar;
        C c = this.f339876d_;
        if (c != null && (biVar = ((C113961mq) c).f340880J) != null) {
            synchronized (this.f342580g) {
                final C113709et[] etVarArr = {null};
                Util.foreach(biVar.mo171677b(), new Callback<C113709et>() {
                    /* renamed from: a */
                    private void m160284a(C113709et etVar) {
                        if (!(etVar instanceof C113527av)) {
                            return;
                        }
                        if (!TextUtils.equals(etVar.getId(), C114322sx.this.f342581h)) {
                            etVar.mo171427a(gl10);
                        } else if (etVar.isVisible() || C114322sx.this.f342538U) {
                            etVarArr[0] = etVar;
                        } else {
                            etVar.releaseData();
                        }
                    }

                    public final /* synthetic */ void callback(Object obj) {
                        C113709et etVar = (C113709et) obj;
                        if (!(etVar instanceof C113527av)) {
                            return;
                        }
                        if (!TextUtils.equals(etVar.getId(), C114322sx.this.f342581h)) {
                            etVar.mo171427a(gl10);
                        } else if (etVar.isVisible() || C114322sx.this.f342538U) {
                            etVarArr[0] = etVar;
                        } else {
                            etVar.releaseData();
                        }
                    }
                });
                C113709et etVar = etVarArr[0];
                if (etVar != null) {
                    etVar.mo171427a(gl10);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m160171a(C113528aw awVar) {
        boolean z = false;
        if (((VectorMap) this.f339878e_) == null) {
            return false;
        }
        if (awVar == null) {
            mo171582b("");
            return true;
        }
        C113520ao aoVar = awVar.f339728a;
        String id = aoVar.getId();
        TencentMap.OnMarkerClickListener onMarkerClickListener = this.f342598y;
        if (onMarkerClickListener != null && onMarkerClickListener.onMarkerClick(awVar)) {
            return true;
        }
        if (!awVar.isInfoWindowEnable()) {
            return false;
        }
        if (!this.f342572ao) {
            C113520ao aoVar2 = this.f342573ap;
            if (aoVar2 == null) {
                aoVar.showInfoWindow();
                this.f342573ap = aoVar;
                return true;
            } else if (aoVar2 == aoVar) {
                if (aoVar.mo171381h() != null && aoVar.mo171381h().mo172011c()) {
                    z = true;
                }
                if (z) {
                    aoVar.hideInfoWindow();
                    this.f342573ap = null;
                } else {
                    aoVar.showInfoWindow();
                    this.f342573ap = aoVar;
                }
                return true;
            } else {
                aoVar2.hideInfoWindow();
                aoVar.showInfoWindow();
                this.f342573ap = aoVar;
                return true;
            }
        } else {
            if (aoVar.mo171381h() == null) {
                aoVar.showInfoWindow();
            } else if (aoVar.isInfoWindowShown()) {
                aoVar.hideInfoWindow();
            } else {
                aoVar.showInfoWindow();
                this.f342573ap = aoVar;
            }
            mo171582b(id);
            return true;
        }
    }
}
