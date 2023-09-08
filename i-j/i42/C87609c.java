package i42;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.magicbrush.C85270j0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.plugin.magicbrush.view.MBSurfaceStub;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.rtmp.TXLiveConstants;
import d42.C86180g;
import d42.C86181h;
import d42.C86183k;
import d42.C86192w;
import d42.C86195z;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import e42.C86431j;
import e42.C86432k;
import f42.C7982d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h42.C87430a;
import j52.C87879c;
import j52.C87880f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import p748xd.C91174f;
import q52.C47760r;
import q52.C89478s;
import r52.C89870a;
import r52.C89871b;
import r52.C89872c;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64190k;
import z04.C112550d0;
import z04.C91602g0;
import zt3.C119157j;

/* renamed from: i42.c */
public final class C87609c<T extends C7594e> implements C86195z<T>, C87430a, C86180g {

    /* renamed from: a */
    public final Context f253727a;

    /* renamed from: b */
    public final String f253728b;

    /* renamed from: c */
    public final HandlerThread f253729c;

    /* renamed from: d */
    public final C32224a<C13598b0> f253730d;

    /* renamed from: e */
    public final C32226l<String, C13598b0> f253731e;

    /* renamed from: f */
    public MBBuildConfig<T> f253732f;

    /* renamed from: g */
    public final HashSet<C86183k> f253733g = new HashSet<>();

    /* renamed from: h */
    public final Handler f253734h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public final Handler f253735i;

    /* renamed from: j */
    public final HashMap<Integer, MBSurfaceStub> f253736j;

    /* renamed from: k */
    public final HashMap<Integer, C89872c> f253737k;

    /* renamed from: l */
    public final HashMap<Integer, C32226l<String, C13598b0>> f253738l;

    /* renamed from: m */
    public int f253739m;

    /* renamed from: n */
    public int f253740n;

    /* renamed from: o */
    public final C64190k<C32224a<C13598b0>> f253741o;

    /* renamed from: p */
    public boolean f253742p;

    /* renamed from: q */
    public final String f253743q;

    /* renamed from: r */
    public final C87880f f253744r;

    /* renamed from: s */
    public final C7982d f253745s;

    /* renamed from: t */
    public final String f253746t;

    /* renamed from: u */
    public C85270j0 f253747u;

    /* renamed from: i42.c$a */
    public static final class C87610a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87610a(C87609c<T> cVar) {
            super(0);
            this.f253748d = cVar;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253748d;
            boolean z = false;
            if ((cVar.f253740n & 1) != 0) {
                Log.m105924i(cVar.f253746t, "destroy when service is not initialized");
            } else {
                C87880f fVar = cVar.f253744r;
                fVar.getClass();
                fVar.f254389i = System.currentTimeMillis();
                C87609c<T> cVar2 = this.f253748d;
                cVar2.f253742p = true;
                String str = cVar2.f253746t;
                StringBuilder sb = new StringBuilder();
                sb.append("destroy, has service?");
                if (this.f253748d.f253747u != null) {
                    z = true;
                }
                sb.append(z);
                Log.m105924i(str, sb.toString());
                C87609c<T> cVar3 = this.f253748d;
                C85270j0 j0Var = cVar3.f253747u;
                if (j0Var != null) {
                    j0Var.mo118440fH(cVar3.f253728b, 1);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$a0 */
    public static final class C87611a0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253749d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f253750e;

        public C87611a0(C87609c<T> cVar, C32224a<C13598b0> aVar) {
            this.f253749d = cVar;
            this.f253750e = aVar;
        }

        public final void run() {
            this.f253749d.f253742p = false;
            this.f253750e.invoke();
            while (true) {
                C87609c<T> cVar = this.f253749d;
                if (!cVar.f253742p && (!cVar.f253741o.isEmpty())) {
                    this.f253749d.f253741o.removeFirst().invoke();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i42.c$b */
    public static final class C87612b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253751d;

        /* renamed from: e */
        public final /* synthetic */ String f253752e;

        /* renamed from: f */
        public final /* synthetic */ String f253753f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87612b(C87609c<T> cVar, String str, String str2) {
            super(0);
            this.f253751d = cVar;
            this.f253752e = str;
            this.f253753f = str2;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253751d;
            boolean z = true;
            if ((cVar.f253740n & 1) == 0) {
                z = false;
            }
            if (z) {
                String str = cVar.f253746t;
                Log.m105928w(str, "dispatch in wrong status " + this.f253751d.f253740n + " , discard event");
            } else {
                C85270j0 j0Var = cVar.f253747u;
                if (j0Var != null) {
                    j0Var.mo118444rn(cVar.f253728b, this.f253752e, this.f253753f);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$b0 */
    public static final class C87613b0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f253754d;

        public C87613b0(C32224a aVar) {
            this.f253754d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f253754d.invoke();
        }
    }

    /* renamed from: i42.c$c */
    public static final class C87614c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253755d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f253756e;

        /* renamed from: f */
        public final /* synthetic */ String f253757f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87614c(C87609c<T> cVar, C32226l<? super String, C13598b0> lVar, String str) {
            super(0);
            this.f253755d = cVar;
            this.f253756e = lVar;
            this.f253757f = str;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253755d;
            if ((cVar.f253740n & 1) != 0) {
                String str = cVar.f253746t;
                Log.m105928w(str, "evaluate in wrong status " + this.f253755d.f253740n + " , discard event");
            } else if (this.f253756e != null) {
                HashMap<Integer, C32226l<String, C13598b0>> hashMap = cVar.f253738l;
                int i = cVar.f253739m + 1;
                cVar.f253739m = i;
                hashMap.put(Integer.valueOf(i), this.f253756e);
                C87609c<T> cVar2 = this.f253755d;
                C85270j0 j0Var = cVar2.f253747u;
                if (j0Var != null) {
                    j0Var.Y30(cVar2.f253728b, this.f253757f, cVar2.f253739m);
                }
            } else {
                C85270j0 j0Var2 = cVar.f253747u;
                if (j0Var2 != null) {
                    j0Var2.Y30(cVar.f253728b, this.f253757f, 0);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$c0 */
    public static final class C87615c0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253758d;

        /* renamed from: e */
        public final /* synthetic */ boolean f253759e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87615c0(C87609c<T> cVar, boolean z) {
            super(0);
            this.f253758d = cVar;
            this.f253759e = z;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253758d;
            C85270j0 j0Var = cVar.f253747u;
            if (j0Var != null) {
                j0Var.V20(cVar.f253728b, this.f253759e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$d */
    public static final class C87616d extends C87413o implements C32226l<C7596h, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253760d;

        /* renamed from: e */
        public final /* synthetic */ int f253761e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87616d(C87609c<T> cVar, int i) {
            super(1);
            this.f253760d = cVar;
            this.f253761e = i;
        }

        public Object invoke(Object obj) {
            C7596h hVar = (C7596h) obj;
            C87412m.m108594g(hVar, "result");
            C87609c<T> cVar = this.f253760d;
            int i = this.f253761e;
            String a = hVar.mo8721a();
            cVar.getClass();
            cVar.mo122062w(new C87645h(cVar, a, i));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$d0 */
    public static final class C87617d0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253762d;

        /* renamed from: e */
        public final /* synthetic */ MBBuildConfig<T> f253763e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87617d0(C87609c<T> cVar, MBBuildConfig<T> mBBuildConfig) {
            super(0);
            this.f253762d = cVar;
            this.f253763e = mBBuildConfig;
        }

        public Object invoke() {
            boolean z = true;
            if (C89478s.m111868a(this.f253762d.f253740n, 1)) {
                String str = this.f253762d.f253746t;
                Log.m105928w(str, "setup in wrong status " + this.f253762d.f253740n + " , discard event");
            } else {
                C87880f fVar = this.f253762d.f253744r;
                fVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                fVar.f254384d = currentTimeMillis;
                IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, fVar.f254382b, fVar.f254381a, IMagicBrushMonitor.TimeCostScene.BIND_SERVICE, currentTimeMillis - fVar.f254383c, (String) null, 16, (Object) null);
                C87880f fVar2 = this.f253762d.f253744r;
                fVar2.getClass();
                fVar2.f254385e = System.currentTimeMillis();
                C87609c<T> cVar = this.f253762d;
                cVar.f253732f = this.f253763e;
                cVar.f253742p = true;
                String str2 = cVar.f253746t;
                StringBuilder sb = new StringBuilder();
                sb.append("setup, has service?");
                if (this.f253762d.f253747u == null) {
                    z = false;
                }
                sb.append(z);
                Log.m105924i(str2, sb.toString());
                C87609c<T> cVar2 = this.f253762d;
                C85270j0 j0Var = cVar2.f253747u;
                if (j0Var != null) {
                    j0Var.mo118433Ed(cVar2.f253728b, this.f253763e);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$e */
    public static final class C87618e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86430i<T> f253764d;

        /* renamed from: e */
        public final /* synthetic */ C7596h f253765e;

        public C87618e(C86430i<T> iVar, C7596h hVar) {
            this.f253764d = iVar;
            this.f253765e = hVar;
        }

        public final void run() {
            this.f253764d.mo18q(this.f253765e);
        }
    }

    /* renamed from: i42.c$e0 */
    public static final class C87619e0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87619e0(C87609c<T> cVar) {
            super(0);
            this.f253766d = cVar;
        }

        public Object invoke() {
            if (C89478s.m111868a(this.f253766d.f253740n, 2)) {
                String str = this.f253766d.f253746t;
                Log.m105928w(str, "start in wrong status " + this.f253766d.f253740n + " , discard event");
            } else {
                C87609c<T> cVar = this.f253766d;
                boolean z = true;
                cVar.f253742p = true;
                C87880f fVar = cVar.f253744r;
                fVar.getClass();
                fVar.f254387g = System.currentTimeMillis();
                String str2 = this.f253766d.f253746t;
                StringBuilder sb = new StringBuilder();
                sb.append("start, has service?");
                if (this.f253766d.f253747u == null) {
                    z = false;
                }
                sb.append(z);
                Log.m105924i(str2, sb.toString());
                C87609c<T> cVar2 = this.f253766d;
                C85270j0 j0Var = cVar2.f253747u;
                if (j0Var != null) {
                    j0Var.mo118439eV(cVar2.f253728b);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$f */
    public static final class C87620f<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ C86432k<T> f253767d;

        /* renamed from: e */
        public final /* synthetic */ C7596h f253768e;

        public C87620f(C86432k<T> kVar, C7596h hVar) {
            this.f253767d = kVar;
            this.f253768e = hVar;
        }

        public Object call() {
            return this.f253767d.mo62167o(this.f253768e);
        }
    }

    /* renamed from: i42.c$g */
    public static final class C87621g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253769d;

        /* renamed from: e */
        public final /* synthetic */ int f253770e;

        /* renamed from: f */
        public final /* synthetic */ int f253771f;

        /* renamed from: g */
        public final /* synthetic */ int f253772g;

        /* renamed from: h */
        public final /* synthetic */ int f253773h;

        /* renamed from: i */
        public final /* synthetic */ int f253774i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87621g(C87609c<T> cVar, int i, int i2, int i3, int i4, int i5) {
            super(0);
            this.f253769d = cVar;
            this.f253770e = i;
            this.f253771f = i2;
            this.f253772g = i3;
            this.f253773h = i4;
            this.f253774i = i5;
        }

        public Object invoke() {
            String str = this.f253769d.f253746t;
            Log.m105924i(str, "canvas view create " + this.f253770e + ' ' + this.f253771f + ' ' + this.f253772g + ' ' + this.f253773h + ' ' + this.f253774i);
            MBBuildConfig<T> mBBuildConfig = this.f253769d.f253732f;
            C86181h hVar = mBBuildConfig != null ? mBBuildConfig.f248376o : null;
            if (hVar != null) {
                C89872c cVar = new C89872c(hVar);
                this.f253769d.f253737k.put(Integer.valueOf(this.f253770e), cVar);
                C87609c<T> cVar2 = this.f253769d;
                int i = this.f253770e;
                C87412m.m108594g(cVar2, "eventConsumer");
                cVar.f258318p = cVar2;
                cVar.f258317o = i;
                cVar.f258319q.post(new C89871b(cVar, i));
            } else {
                MBSurfaceStub mBSurfaceStub = new MBSurfaceStub(this.f253769d.f253727a, (AttributeSet) null);
                this.f253769d.f253736j.put(Integer.valueOf(this.f253770e), mBSurfaceStub);
                C87609c<T> cVar3 = this.f253769d;
                int i2 = this.f253770e;
                C87412m.m108594g(cVar3, "eventConsumer");
                mBSurfaceStub.f248449i = cVar3;
                mBSurfaceStub.f248447g = i2;
                C87609c<T> cVar4 = this.f253769d;
                cVar4.mo122063x(new C87641d(cVar4, this.f253770e, mBSurfaceStub));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$h */
    public static final class C87622h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253775d;

        /* renamed from: e */
        public final /* synthetic */ int f253776e;

        /* renamed from: f */
        public final /* synthetic */ boolean f253777f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87622h(C87609c<T> cVar, int i, boolean z) {
            super(0);
            this.f253775d = cVar;
            this.f253776e = i;
            this.f253777f = z;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253775d;
            cVar.mo122063x(new C87642e(cVar, this.f253776e, this.f253777f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$i */
    public static final class C87623i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253778d;

        /* renamed from: e */
        public final /* synthetic */ int f253779e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87623i(C87609c<T> cVar, int i) {
            super(0);
            this.f253778d = cVar;
            this.f253779e = i;
        }

        public Object invoke() {
            String str = this.f253778d.f253746t;
            Log.m105924i(str, "canvas view remove " + this.f253779e);
            C87609c<T> cVar = this.f253778d;
            MBBuildConfig<T> mBBuildConfig = cVar.f253732f;
            if ((mBBuildConfig != null ? mBBuildConfig.f248376o : null) != null) {
                C89872c remove = cVar.f253737k.remove(Integer.valueOf(this.f253779e));
                if (remove != null) {
                    remove.f258319q.post(new C89870a(remove));
                }
            } else {
                MBSurfaceStub remove2 = cVar.f253736j.remove(Integer.valueOf(this.f253779e));
                if (remove2 != null) {
                    C87609c<T> cVar2 = this.f253778d;
                    cVar2.mo122063x(new C87643f(cVar2, this.f253779e, remove2));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$j */
    public static final class C87624j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253780d;

        /* renamed from: e */
        public final /* synthetic */ int f253781e;

        /* renamed from: f */
        public final /* synthetic */ float[] f253782f;

        /* renamed from: g */
        public final /* synthetic */ float[] f253783g;

        /* renamed from: h */
        public final /* synthetic */ float[] f253784h;

        /* renamed from: i */
        public final /* synthetic */ float[] f253785i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87624j(C87609c<T> cVar, int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            super(0);
            this.f253780d = cVar;
            this.f253781e = i;
            this.f253782f = fArr;
            this.f253783g = fArr2;
            this.f253784h = fArr3;
            this.f253785i = fArr4;
        }

        public Object invoke() {
            String str;
            Log.m105924i(this.f253780d.f253746t, "canvas view " + this.f253781e + " touch rect changed...");
            C89872c cVar = this.f253780d.f253737k.get(Integer.valueOf(this.f253781e));
            if (cVar != null) {
                float[] fArr = this.f253782f;
                int length = fArr.length;
                float[] fArr2 = this.f253783g;
                float[] fArr3 = this.f253784h;
                float[] fArr4 = this.f253785i;
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    float f = fArr[i];
                    float f2 = fArr2[i];
                    arrayList.add(new RectF(f, f2, fArr3[i] + f, fArr4[i] + f2));
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((RectF) it.next()).toString());
                    }
                    Iterator it4 = arrayList2.iterator();
                    if (it4.hasNext()) {
                        Object next = it4.next();
                        while (it4.hasNext()) {
                            next = ((String) next) + ';' + ((String) it4.next());
                        }
                        str = (String) next;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                } else {
                    str = "";
                }
                C87412m.m108593f(str, "if (rectList.isNotEmpty(… s -> \"$acc;$s\" } else \"\"");
                Log.m105918d("MBExternalViewStub", "setTouchableRect " + str);
                cVar.f258316n = arrayList;
            }
            MBSurfaceStub mBSurfaceStub = this.f253780d.f253736j.get(Integer.valueOf(this.f253781e));
            if (mBSurfaceStub != null) {
                float[] fArr5 = this.f253782f;
                int length2 = fArr5.length;
                float[] fArr6 = this.f253783g;
                float[] fArr7 = this.f253784h;
                float[] fArr8 = this.f253785i;
                ArrayList arrayList3 = new ArrayList(length2);
                for (int i2 = 0; i2 < length2; i2++) {
                    float f3 = fArr5[i2];
                    float f4 = fArr6[i2];
                    arrayList3.add(new RectF(f3, f4, fArr7[i2] + f3, fArr8[i2] + f4));
                }
                mBSurfaceStub.setTouchableRectList(arrayList3);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$k */
    public static final class C87625k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253786d;

        /* renamed from: e */
        public final /* synthetic */ int f253787e;

        /* renamed from: f */
        public final /* synthetic */ int f253788f;

        /* renamed from: g */
        public final /* synthetic */ int f253789g;

        /* renamed from: h */
        public final /* synthetic */ int f253790h;

        /* renamed from: i */
        public final /* synthetic */ int f253791i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87625k(C87609c<T> cVar, int i, int i2, int i3, int i4, int i5) {
            super(0);
            this.f253786d = cVar;
            this.f253787e = i;
            this.f253788f = i2;
            this.f253789g = i3;
            this.f253790h = i4;
            this.f253791i = i5;
        }

        public Object invoke() {
            String str = this.f253786d.f253746t;
            Log.m105924i(str, "canvas view update " + this.f253787e + ' ' + this.f253788f + ' ' + this.f253789g + ' ' + this.f253790h + ' ' + this.f253791i);
            C87609c<T> cVar = this.f253786d;
            MBBuildConfig<T> mBBuildConfig = cVar.f253732f;
            if ((mBBuildConfig != null ? mBBuildConfig.f248376o : null) != null) {
                C89872c cVar2 = cVar.f253737k.get(Integer.valueOf(this.f253787e));
                if (cVar2 != null) {
                    int i = this.f253788f;
                    int i2 = this.f253789g;
                    cVar2.f258321s = new Rect(i, i2, this.f253790h + i, this.f253791i + i2);
                }
            } else {
                MBSurfaceStub mBSurfaceStub = cVar.f253736j.get(Integer.valueOf(this.f253787e));
                if (mBSurfaceStub != null) {
                    C87609c<T> cVar3 = this.f253786d;
                    cVar3.mo122063x(new C87644g(cVar3, this.f253787e, mBSurfaceStub, this.f253788f, this.f253789g, this.f253790h, this.f253791i));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$l */
    public static final class C87626l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87626l(C87609c<T> cVar) {
            super(0);
            this.f253792d = cVar;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253792d;
            cVar.f253740n = 2;
            Log.m105924i(cVar.f253746t, "onCreated");
            C87880f fVar = this.f253792d.f253744r;
            fVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            fVar.f254386f = currentTimeMillis;
            IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, fVar.f254382b, fVar.f254381a, IMagicBrushMonitor.TimeCostScene.SETUP, currentTimeMillis - fVar.f254385e, (String) null, 16, (Object) null);
            Iterator<C86183k> it = this.f253792d.f253733g.iterator();
            while (it.hasNext()) {
                it.next().onCreated();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$m */
    public static final class C87627m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87627m(C87609c<T> cVar) {
            super(0);
            this.f253793d = cVar;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253793d;
            cVar.f253740n = 16;
            Log.m105924i(cVar.f253746t, "onDestroy");
            C87880f fVar = this.f253793d.f253744r;
            fVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            fVar.f254390j = currentTimeMillis;
            IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, fVar.f254382b, fVar.f254381a, IMagicBrushMonitor.TimeCostScene.DESTROY, currentTimeMillis - fVar.f254389i, (String) null, 16, (Object) null);
            Iterator<C86183k> it = this.f253793d.f253733g.iterator();
            while (it.hasNext()) {
                it.next().mo109589d0(1);
            }
            C87609c.m108957v(this.f253793d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$n */
    public static final class C87628n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253794d;

        /* renamed from: e */
        public final /* synthetic */ boolean f253795e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87628n(C87609c<T> cVar, boolean z) {
            super(0);
            this.f253794d = cVar;
            this.f253795e = z;
        }

        public Object invoke() {
            C86192w wVar;
            MBBuildConfig<T> mBBuildConfig = this.f253794d.f253732f;
            if (!(mBBuildConfig == null || (wVar = mBBuildConfig.f248377p) == null)) {
                wVar.mo120598b(this.f253795e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$o */
    public static final class C87629o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253796d;

        /* renamed from: e */
        public final /* synthetic */ int f253797e;

        /* renamed from: f */
        public final /* synthetic */ String f253798f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87629o(C87609c<T> cVar, int i, String str) {
            super(0);
            this.f253796d = cVar;
            this.f253797e = i;
            this.f253798f = str;
        }

        public Object invoke() {
            C32226l remove = this.f253796d.f253738l.remove(Integer.valueOf(this.f253797e));
            if (remove != null) {
                remove.invoke(this.f253798f);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$p */
    public static final class C87630p extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253799d;

        /* renamed from: e */
        public final /* synthetic */ String f253800e;

        /* renamed from: f */
        public final /* synthetic */ String f253801f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87630p(C87609c<T> cVar, String str, String str2) {
            super(0);
            this.f253799d = cVar;
            this.f253800e = str;
            this.f253801f = str2;
        }

        public Object invoke() {
            Activity e0;
            MBBuildConfig<T> mBBuildConfig = this.f253799d.f253732f;
            if (!(mBBuildConfig == null || (e0 = mBBuildConfig.mo118368b().mo8720e0()) == null)) {
                C87609c<T> cVar = this.f253799d;
                String str = this.f253800e;
                String str2 = cVar.f253728b;
                C87412m.m108594g(str2, "instanceName");
                C87412m.m108594g(str, "msg");
                if (WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C47760r(e0, str2, str));
                }
            }
            HashSet<C86183k> hashSet = this.f253799d.f253733g;
            String str3 = this.f253801f;
            String str4 = this.f253800e;
            Iterator<C86183k> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().mo109584T(str3, str4);
            }
            C87609c<T> cVar2 = this.f253799d;
            if (cVar2.f253740n < 4) {
                Log.m105920e(cVar2.f253746t, "onStartupJsException");
                IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, this.f253799d.f253743q, "js-exception-startup", this.f253800e, (String) null, 8, (Object) null);
                C87609c<T> cVar3 = this.f253799d;
                cVar3.f253742p = false;
                cVar3.destroy();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$q */
    public static final class C87631q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253802d;

        /* renamed from: e */
        public final /* synthetic */ String f253803e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87631q(C87609c<T> cVar, String str) {
            super(0);
            this.f253802d = cVar;
            this.f253803e = str;
        }

        public Object invoke() {
            C86192w wVar;
            MBBuildConfig<T> mBBuildConfig = this.f253802d.f253732f;
            if (!(mBBuildConfig == null || (wVar = mBBuildConfig.f248377p) == null)) {
                wVar.mo120597a(this.f253803e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$r */
    public static final class C87632r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87632r(C87609c<T> cVar) {
            super(0);
            this.f253804d = cVar;
        }

        public Object invoke() {
            C87609c<T> cVar = this.f253804d;
            cVar.f253740n = 4;
            Log.m105924i(cVar.f253746t, "onMainScriptInjected");
            C87880f fVar = this.f253804d.f253744r;
            fVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            fVar.f254388h = currentTimeMillis;
            IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, fVar.f254382b, fVar.f254381a, IMagicBrushMonitor.TimeCostScene.START, currentTimeMillis - fVar.f254387g, (String) null, 16, (Object) null);
            Iterator<C86183k> it = this.f253804d.f253733g.iterator();
            while (it.hasNext()) {
                it.next().mo109587b();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$s */
    public static final class C87633s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87633s(C87609c<T> cVar) {
            super(0);
            this.f253805d = cVar;
        }

        public Object invoke() {
            if (!C89478s.m111868a(this.f253805d.f253740n, 4)) {
                String str = this.f253805d.f253746t;
                StringBuilder sb = new StringBuilder();
                sb.append("pause, has service?");
                sb.append(this.f253805d.f253747u != null);
                Log.m105924i(str, sb.toString());
                C87609c<T> cVar = this.f253805d;
                cVar.f253740n = 8;
                Iterator<C86183k> it = cVar.f253733g.iterator();
                while (it.hasNext()) {
                    it.next().onPause();
                }
                C87609c<T> cVar2 = this.f253805d;
                C85270j0 j0Var = cVar2.f253747u;
                if (j0Var != null) {
                    j0Var.mo118438dF(cVar2.f253728b);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$t */
    public static final class C87634t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253806d;

        /* renamed from: e */
        public final /* synthetic */ int f253807e;

        /* renamed from: f */
        public final /* synthetic */ int f253808f;

        /* renamed from: g */
        public final /* synthetic */ int f253809g;

        /* renamed from: h */
        public final /* synthetic */ Surface f253810h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87634t(C87609c<T> cVar, int i, int i2, int i3, Surface surface) {
            super(0);
            this.f253806d = cVar;
            this.f253807e = i;
            this.f253808f = i2;
            this.f253809g = i3;
            this.f253810h = surface;
        }

        public Object invoke() {
            String str = this.f253806d.f253746t;
            StringBuilder sb = new StringBuilder();
            sb.append("surface ");
            sb.append(this.f253807e);
            sb.append(" post create, size = (");
            sb.append(this.f253808f);
            sb.append(", ");
            sb.append(this.f253809g);
            sb.append("), has service?");
            sb.append(this.f253806d.f253747u != null);
            Log.m105924i(str, sb.toString());
            C87609c<T> cVar = this.f253806d;
            C85270j0 j0Var = cVar.f253747u;
            if (j0Var != null) {
                j0Var.mo118442hU(cVar.f253728b, this.f253807e, this.f253810h, this.f253808f, this.f253809g);
            }
            C87609c<T> cVar2 = this.f253806d;
            cVar2.mo122063x(new C87646i(cVar2, this.f253807e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$u */
    public static final class C87635u extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253811d;

        /* renamed from: e */
        public final /* synthetic */ int f253812e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87635u(C87609c<T> cVar, int i) {
            super(0);
            this.f253811d = cVar;
            this.f253812e = i;
        }

        public Object invoke() {
            String str = this.f253811d.f253746t;
            StringBuilder sb = new StringBuilder();
            sb.append("surface ");
            sb.append(this.f253812e);
            sb.append(" post destroy, has service?");
            sb.append(this.f253811d.f253747u != null);
            Log.m105924i(str, sb.toString());
            C87609c<T> cVar = this.f253811d;
            C85270j0 j0Var = cVar.f253747u;
            if (j0Var != null) {
                j0Var.mo118432DN(cVar.f253728b, this.f253812e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$v */
    public static final class C87636v extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253813d;

        /* renamed from: e */
        public final /* synthetic */ int f253814e;

        /* renamed from: f */
        public final /* synthetic */ int f253815f;

        /* renamed from: g */
        public final /* synthetic */ int f253816g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87636v(C87609c<T> cVar, int i, int i2, int i3) {
            super(0);
            this.f253813d = cVar;
            this.f253814e = i;
            this.f253815f = i2;
            this.f253816g = i3;
        }

        public Object invoke() {
            String str = this.f253813d.f253746t;
            StringBuilder sb = new StringBuilder();
            sb.append("surface ");
            sb.append(this.f253814e);
            sb.append(" post update, size = (");
            sb.append(this.f253815f);
            sb.append(", ");
            sb.append(this.f253816g);
            sb.append("), has service?");
            sb.append(this.f253813d.f253747u != null);
            Log.m105924i(str, sb.toString());
            C87609c<T> cVar = this.f253813d;
            C85270j0 j0Var = cVar.f253747u;
            if (j0Var != null) {
                j0Var.g50(cVar.f253728b, this.f253814e, this.f253815f, this.f253816g);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$w */
    public static final class C87637w extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253817d;

        /* renamed from: e */
        public final /* synthetic */ int f253818e;

        /* renamed from: f */
        public final /* synthetic */ int f253819f;

        /* renamed from: g */
        public final /* synthetic */ int f253820g;

        /* renamed from: h */
        public final /* synthetic */ long f253821h;

        /* renamed from: i */
        public final /* synthetic */ int[] f253822i;

        /* renamed from: j */
        public final /* synthetic */ float[] f253823j;

        /* renamed from: n */
        public final /* synthetic */ float[] f253824n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87637w(C87609c<T> cVar, int i, int i2, int i3, long j, int[] iArr, float[] fArr, float[] fArr2) {
            super(0);
            this.f253817d = cVar;
            this.f253818e = i;
            this.f253819f = i2;
            this.f253820g = i3;
            this.f253821h = j;
            this.f253822i = iArr;
            this.f253823j = fArr;
            this.f253824n = fArr2;
        }

        public Object invoke() {
            String str = this.f253817d.f253746t;
            StringBuilder sb = new StringBuilder();
            sb.append("surface ");
            sb.append(this.f253818e);
            sb.append(" post touch event, action = ");
            sb.append(this.f253819f);
            sb.append(", has service?");
            sb.append(this.f253817d.f253747u != null);
            Log.m105926v(str, sb.toString());
            C87609c<T> cVar = this.f253817d;
            C85270j0 j0Var = cVar.f253747u;
            if (j0Var != null) {
                j0Var.mo118435TE(cVar.f253728b, this.f253818e, this.f253819f, this.f253820g, this.f253821h, this.f253822i, this.f253823j, this.f253824n);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$x */
    public static final class C87638x extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253825d;

        /* renamed from: e */
        public final /* synthetic */ C86183k f253826e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87638x(C87609c<T> cVar, C86183k kVar) {
            super(0);
            this.f253825d = cVar;
            this.f253826e = kVar;
        }

        public Object invoke() {
            this.f253825d.f253733g.add(this.f253826e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$y */
    public static final class C87639y extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87639y(C87609c<T> cVar) {
            super(0);
            this.f253827d = cVar;
        }

        public Object invoke() {
            if (!C89478s.m111868a(this.f253827d.f253740n, 8)) {
                String str = this.f253827d.f253746t;
                StringBuilder sb = new StringBuilder();
                sb.append("resume, has service?");
                sb.append(this.f253827d.f253747u != null);
                Log.m105924i(str, sb.toString());
                C87609c<T> cVar = this.f253827d;
                cVar.f253740n = 4;
                Iterator<C86183k> it = cVar.f253733g.iterator();
                while (it.hasNext()) {
                    it.next().onResume();
                }
                C87609c<T> cVar2 = this.f253827d;
                C85270j0 j0Var = cVar2.f253747u;
                if (j0Var != null) {
                    j0Var.Il0(cVar2.f253728b);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i42.c$z */
    public static final class C87640z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87609c<T> f253828d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f253829e;

        public C87640z(C87609c<T> cVar, C32224a<C13598b0> aVar) {
            this.f253828d = cVar;
            this.f253829e = aVar;
        }

        public final void run() {
            C87609c<T> cVar = this.f253828d;
            if (cVar.f253742p || cVar.f253747u == null) {
                cVar.f253741o.addLast(this.f253829e);
            } else {
                this.f253829e.invoke();
            }
        }
    }

    public C87609c(Context context, String str, HandlerThread handlerThread, C32224a<C13598b0> aVar, C32226l<? super String, C13598b0> lVar) {
        Context context2 = context;
        String str2 = str;
        HandlerThread handlerThread2 = handlerThread;
        C32224a<C13598b0> aVar2 = aVar;
        C32226l<? super String, C13598b0> lVar2 = lVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str2, "instanceName");
        C87412m.m108594g(handlerThread2, "stateThread");
        C87412m.m108594g(aVar2, "tryBindServiceCb");
        C87412m.m108594g(lVar2, "destroyCb");
        this.f253727a = context2;
        this.f253728b = str2;
        this.f253729c = handlerThread2;
        this.f253730d = aVar2;
        this.f253731e = lVar2;
        this.f253735i = new Handler(handlerThread.getLooper());
        this.f253736j = new HashMap<>();
        this.f253737k = new HashMap<>();
        this.f253738l = new HashMap<>();
        this.f253740n = 1;
        this.f253741o = new C64190k<>(16);
        String g0 = C112550d0.m153797g0(str2, "-", str2);
        this.f253743q = g0;
        C87880f fVar = r3;
        C87880f fVar2 = new C87880f(g0, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, (C8480h) null);
        this.f253744r = fVar;
        this.f253745s = new C7982d(str2);
        StringBuilder sb = new StringBuilder();
        sb.append("MBBizClient_");
        String d0 = C112550d0.m153794d0(str2, "-", "");
        sb.append(C112550d0.m153797g0(str2, "-", str2) + C91602g0.m114948p0(d0, 5));
        this.f253746t = sb.toString();
    }

    /* renamed from: v */
    public static final void m108957v(C87609c cVar) {
        Log.m105924i(cVar.f253746t, "cleanup");
        cVar.f253742p = false;
        cVar.f253732f = null;
        String str = cVar.f253746t;
        Log.m105924i(str, "pendingTaskRemove " + cVar.f253741o.size());
        cVar.f253741o.clear();
        cVar.f253738l.clear();
        cVar.mo122063x(new C87607a(cVar));
        cVar.f253733g.clear();
        cVar.f253729c.quit();
        cVar.f253731e.invoke(cVar.f253728b);
    }

    /* renamed from: a */
    public void mo121846a(String str) {
        C87412m.m108594g(str, "logStr");
        mo122064y(new C87631q(this, str));
    }

    /* renamed from: b */
    public void mo121847b() {
        mo122065z(new C87632r(this));
    }

    /* renamed from: c */
    public void mo121848c(int i, boolean z) {
        mo122062w(new C87622h(this, i, z));
    }

    public int currentStatus() {
        return this.f253740n;
    }

    /* renamed from: d */
    public void mo120601d(String str, String str2) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        mo122062w(new C87612b(this, str, str2));
    }

    public void destroy() {
        mo122062w(new C87610a(this));
    }

    /* renamed from: e */
    public void mo121849e(int i, String str) {
        C87412m.m108594g(str, "msg");
        mo122064y(new C87629o(this, i, str));
    }

    /* renamed from: f */
    public void mo120580f(int i) {
        mo122062w(new C87635u(this, i));
    }

    /* renamed from: g */
    public void mo120581g(int i, int i2, int i3) {
        mo122062w(new C87636v(this, i, i2, i3));
    }

    /* renamed from: h */
    public String mo120603h() {
        return this.f253728b;
    }

    /* renamed from: i */
    public void mo121850i(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        mo122064y(new C87630p(this, str2, str));
    }

    /* renamed from: j */
    public void mo120582j(int i, Surface surface, int i2, int i3) {
        C87412m.m108594g(surface, "surface");
        mo122062w(new C87634t(this, i, i2, i3, surface));
    }

    /* renamed from: k */
    public void mo121851k(boolean z) {
        mo122064y(new C87628n(this, z));
    }

    /* renamed from: l */
    public void mo120583l(int i, int i2, int i3, long j, int[] iArr, float[] fArr, float[] fArr2) {
        int[] iArr2 = iArr;
        C87412m.m108594g(iArr2, "pointerIds");
        float[] fArr3 = fArr;
        C87412m.m108594g(fArr3, "x");
        float[] fArr4 = fArr2;
        C87412m.m108594g(fArr4, "y");
        mo122062w(new C87637w(this, i, i2, i3, j, iArr2, fArr3, fArr4));
    }

    /* renamed from: m */
    public void mo120604m(MBBuildConfig<T> mBBuildConfig) {
        C87412m.m108594g(mBBuildConfig, "config");
        String str = this.f253744r.f254382b;
        C87412m.m108594g(str, "<set-?>");
        mBBuildConfig.f248370f = str;
        String processName = MMApplicationContext.getProcessName();
        C87412m.m108593f(processName, "getProcessName()");
        mBBuildConfig.f248371g = processName;
        if (this.f253740n == 1) {
            C87880f fVar = this.f253744r;
            if (fVar.f254383c == 0) {
                fVar.f254383c = System.currentTimeMillis();
            }
            this.f253730d.invoke();
        }
        mo122062w(new C87617d0(this, mBBuildConfig));
    }

    /* renamed from: n */
    public void mo121852n(int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(fArr, "left");
        C87412m.m108594g(fArr2, "top");
        C87412m.m108594g(fArr3, "width");
        C87412m.m108594g(fArr4, "height");
        mo122062w(new C87624j(this, i, fArr, fArr2, fArr3, fArr4));
    }

    /* renamed from: o */
    public void mo120605o(String str, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(str, "script");
        mo122062w(new C87614c(this, lVar, str));
    }

    public void onCreated() {
        mo122065z(new C87626l(this));
    }

    public void onDestroy() {
        mo122065z(new C87627m(this));
    }

    /* renamed from: p */
    public void mo121855p(String str, String str2, int i) {
        C86431j jVar;
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        MBBuildConfig<T> mBBuildConfig = this.f253732f;
        if (mBBuildConfig != null && (jVar = mBBuildConfig.f248374j.get(str)) != null) {
            C86430i o = ((C86430i) jVar).mo71237o();
            o.f251227a = mBBuildConfig.mo118368b();
            o.mo120847m(this.f253745s);
            o.f251226c = new C87616d(this, i);
            C7596h hVar = new C7596h(str2);
            if (o.mo17l()) {
                this.f253734h.post(new C87618e(o, hVar));
            } else {
                o.mo18q(hVar);
            }
        }
    }

    public void pause() {
        mo122062w(new C87633s(this));
    }

    /* renamed from: q */
    public void mo121856q(int i) {
        mo122062w(new C87623i(this, i));
    }

    /* renamed from: r */
    public void mo120607r(C86183k kVar) {
        C87412m.m108594g(kVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        mo122064y(new C87638x(this, kVar));
    }

    public void resume() {
        mo122062w(new C87639y(this));
    }

    /* renamed from: s */
    public void mo121857s(int i, int i2, int i3, int i4, int i5, int i6) {
        mo122062w(new C87625k(this, i, i2, i3, i4, i5));
    }

    public void setMute(boolean z) {
        mo122062w(new C87615c0(this, z));
    }

    public void start() {
        mo122062w(new C87619e0(this));
    }

    /* renamed from: t */
    public void mo121858t(int i, int i2, int i3, int i4, int i5, int i6) {
        mo122062w(new C87621g(this, i, i2, i3, i4, i5));
    }

    /* renamed from: u */
    public String mo121859u(String str, String str2) {
        C86431j jVar;
        String str3;
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        MBBuildConfig<T> mBBuildConfig = this.f253732f;
        if (mBBuildConfig == null || (jVar = mBBuildConfig.f248374j.get(str)) == null) {
            return "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
        }
        C86432k kVar = (C86432k) jVar;
        kVar.f251227a = mBBuildConfig.mo118368b();
        kVar.mo120847m(this.f253745s);
        C7596h hVar = new C7596h(str2);
        if (kVar.mo17l()) {
            C91174f fVar = new C91174f(new C87620f(kVar, hVar));
            this.f253734h.post(fVar);
            str3 = ((C7596h) fVar.mo125236b()).mo8721a();
        } else {
            str3 = kVar.mo62167o(hVar).mo8721a();
        }
        kVar.f251227a = null;
        return str3;
    }

    /* renamed from: w */
    public final void mo122062w(C32224a<C13598b0> aVar) {
        if (this.f253740n != 16) {
            this.f253735i.post(new C87640z(this, aVar));
        }
    }

    /* renamed from: x */
    public final void mo122063x(C32224a<C13598b0> aVar) {
        this.f253734h.post(new C87613b0(aVar));
    }

    /* renamed from: y */
    public final void mo122064y(C32224a<C13598b0> aVar) {
        if (this.f253740n != 16) {
            this.f253735i.post(new C87613b0(aVar));
        }
    }

    /* renamed from: z */
    public final void mo122065z(C32224a<C13598b0> aVar) {
        if (this.f253740n != 16) {
            this.f253735i.post(new C87611a0(this, aVar));
        }
    }
}
