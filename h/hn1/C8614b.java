package hn1;

import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.google.android.gms.common.util.GmsVersion;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import fm1.C8164o;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import it1.C9256k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jn1.C9479b;
import jn1.C9482d;
import ln1.C21445b;
import mm1.C10934a;
import mm1.C10935b;
import ob0.C117747y;
import os1.C11759w;
import p147ea.C7606d;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import pe1.C35464c;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51942x91;
import te3.C64858yi1;
import up1.C37521f;
import vc1.C37715b;
import z04.C112550d0;

/* renamed from: hn1.b */
public final class C8614b {

    /* renamed from: a */
    public static final C8614b f27717a = new C8614b();

    /* renamed from: b */
    public static C9482d f27718b;

    /* renamed from: c */
    public static HashMap<Integer, C9479b> f27719c = new HashMap<>();

    /* renamed from: d */
    public static LinkedList<C51942x91> f27720d = new LinkedList<>();

    /* renamed from: e */
    public static LinkedList<C51942x91> f27721e = new LinkedList<>();

    /* renamed from: f */
    public static SparseArray<Integer> f27722f = new SparseArray<>();

    /* renamed from: g */
    public static MMHandler f27723g = new MMHandler(Looper.getMainLooper());

    /* renamed from: h */
    public static Runnable f27724h;

    /* renamed from: hn1.b$a */
    public static final class C8615a extends C87413o implements C32226l<C9256k<C117747y>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f27725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8615a(C32226l<? super String, C13598b0> lVar) {
            super(1);
            this.f27725d = lVar;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            if (((C9256k) obj) != null) {
                Log.m105924i("NearbyPreloadManager", "startPreloadSquareTabs hit requestCacheAsync");
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f27725d.invoke("requestCacheAsync");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hn1.b$b */
    public static final class C8616b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Intent f27726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8616b(Intent intent) {
            super(1);
            this.f27726d = intent;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "invokeSource");
            Log.m105924i("NearbyPreloadManager", "startPreloadSquareTabs invoke:" + str);
            C9482d dVar = C8614b.f27718b;
            if (dVar != null) {
                dVar.mo10168i();
            }
            C9482d dVar2 = new C9482d();
            C8614b.f27718b = dVar2;
            Intent intent = this.f27726d;
            C87412m.m108594g(intent, "intent");
            dVar2.f29580o = new C49712hj1();
            if (C37715b.f99914a.mo61298a()) {
                C49712hj1 hj12 = dVar2.f29580o;
                if (hj12 != null) {
                    hj12.f134672f = "8001-" + C31543z5.m39453c();
                    C49712hj1 hj13 = dVar2.f29580o;
                    if (hj13 != null) {
                        hj13.f134675i = ((C7606d) C86312j.m106911c(C7606d.class)).K80(94);
                    } else {
                        C87412m.m108603p("contextObj");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("contextObj");
                    throw null;
                }
            } else {
                C49712hj1 hj14 = dVar2.f29580o;
                if (hj14 != null) {
                    C8164o oVar = C8164o.f27042a;
                    hj14.f134672f = oVar.mo9220d() + '-' + C31543z5.m39453c();
                    C49712hj1 hj15 = dVar2.f29580o;
                    if (hj15 != null) {
                        hj15.f134675i = oVar.mo9217a();
                    } else {
                        C87412m.m108603p("contextObj");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("contextObj");
                    throw null;
                }
            }
            C49712hj1 hj16 = dVar2.f29580o;
            if (hj16 != null) {
                String stringExtra = intent.getStringExtra("key_context_id");
                if (stringExtra == null) {
                    stringExtra = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83357yP();
                }
                hj16.f134671e = stringExtra;
                C49712hj1 hj17 = dVar2.f29580o;
                if (hj17 != null) {
                    if (!TextUtils.isEmpty(hj17.f134671e)) {
                        C10934a aVar = C10934a.f32583a;
                        C49712hj1 hj18 = dVar2.f29580o;
                        if (hj18 != null) {
                            String str2 = hj18.f134671e;
                            dVar2.f29583r = (String) C112550d0.m153785U(str2 == null ? "" : str2, new String[]{"-"}, false, 0, 6, (Object) null).get(0);
                        } else {
                            C87412m.m108603p("contextObj");
                            throw null;
                        }
                    }
                    C49712hj1 hj19 = dVar2.f29580o;
                    if (hj19 != null) {
                        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                        if (Wb == null) {
                            Wb = "";
                        }
                        hj19.f134670d = Wb;
                        C49712hj1 hj110 = dVar2.f29580o;
                        if (hj110 != null) {
                            hj110.f134679p = "";
                            hj110.f134681r = "";
                            hj110.f134682s = "";
                            dVar2.f29581p = intent.getIntExtra("key_request_scene", 0);
                            C9482d dVar3 = C8614b.f27718b;
                            if (dVar3 != null) {
                                dVar3.mo10167h();
                            }
                            return C13598b0.f38549a;
                        }
                        C87412m.m108603p("contextObj");
                        throw null;
                    }
                    C87412m.m108603p("contextObj");
                    throw null;
                }
                C87412m.m108603p("contextObj");
                throw null;
            }
            C87412m.m108603p("contextObj");
            throw null;
        }
    }

    /* renamed from: a */
    public final int mo9476a(int i) {
        Integer num = f27722f.get(i);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final boolean mo9477b() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86082N.mo60266n().intValue() == 1;
    }

    /* renamed from: c */
    public final C9479b mo9478c(C51942x91 x912) {
        C87412m.m108594g(x912, "tabInfo");
        return f27719c.get(Integer.valueOf(x912.f144531d));
    }

    /* renamed from: d */
    public final C9479b mo9479d(int i, int i2, int i3) {
        C51942x91 x912 = new C51942x91();
        x912.f144531d = i2;
        C9479b c = mo9478c(x912);
        if (c != null && c.f29572o == i && c.f29574q == i3) {
            Log.m105924i("NearbyPreloadManager", "getTargetNearbyLiveSquareTabPagePreload return map cache tabId: " + i2);
            return c;
        }
        C51942x91 x913 = new C51942x91();
        x913.f144531d = i2;
        return new C9479b(i, x913, i3);
    }

    /* renamed from: e */
    public final boolean mo9480e() {
        C37521f.f99374d.getClass();
        return C37521f.f99569y6.mo60266n().intValue() == 1;
    }

    /* renamed from: f */
    public final void mo9481f(C49712hj1 hj12, C51942x91 x912) {
        C87412m.m108594g(hj12, "contextObj");
        StringBuilder sb = new StringBuilder();
        sb.append("onFirstPageRender tab:[");
        sb.append(x912 != null ? Integer.valueOf(x912.f144531d) : null);
        sb.append(", ");
        sb.append(x912 != null ? x912.f144532e : null);
        sb.append(']');
        Log.m105924i("NearbyPreloadManager", sb.toString());
        if (!mo9477b()) {
            Log.m105928w("NearbyPreloadManager", "onFirstPageRender return for enableNearbyLivePagesPreload:" + mo9477b());
        } else if (x912 != null) {
            if (f27721e.size() == 0) {
                C8614b bVar = f27717a;
                LinkedList<C51942x91> linkedList = f27720d;
                bVar.getClass();
                Runnable runnable = f27724h;
                if (runnable != null) {
                    f27723g.removeCallbacks(runnable);
                    f27724h = null;
                }
                C8613a aVar = new C8613a(hj12, linkedList);
                f27724h = aVar;
                f27723g.postDelayed(aVar, 700);
            }
            Iterator<C51942x91> it = f27721e.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().f144531d == x912.f144531d) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                Log.m105928w("NearbyPreloadManager", "onFirstPageRender return for tab page rendered tab:[" + x912.f144531d + ", " + x912.f144532e + ']');
                return;
            }
            f27721e.add(x912);
        }
    }

    /* renamed from: g */
    public final void mo9482g() {
        Log.m105924i("NearbyPreloadManager", "release");
        f27723g.removeCallbacks(f27724h);
        f27724h = null;
        C9482d dVar = f27718b;
        if (dVar != null) {
            dVar.mo10168i();
        }
        for (Map.Entry<Integer, C9479b> value : f27719c.entrySet()) {
            ((C9479b) value.getValue()).mo10168i();
        }
        f27719c.clear();
        f27721e.clear();
        f27720d.clear();
    }

    /* renamed from: h */
    public final void mo9483h(Intent intent, int i, int i2) {
        C87412m.m108594g(intent, "intent");
        int i3 = GmsVersion.VERSION_V5 + i;
        C9479b d = mo9479d(i3, i, i2);
        d.mo10170k();
        C49712hj1 hj12 = new C49712hj1();
        d.f29575r = hj12;
        StringBuilder sb = new StringBuilder();
        C8164o oVar = C8164o.f27042a;
        sb.append(oVar.mo9220d());
        sb.append('-');
        sb.append(C31543z5.m39453c());
        hj12.f134672f = sb.toString();
        C49712hj1 hj13 = d.f29575r;
        if (hj13 != null) {
            hj13.f134675i = oVar.mo9217a();
            C49712hj1 hj14 = d.f29575r;
            if (hj14 != null) {
                String stringExtra = intent.getStringExtra("key_context_id");
                if (stringExtra == null) {
                    stringExtra = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83357yP();
                }
                hj14.f134671e = stringExtra;
                C49712hj1 hj15 = d.f29575r;
                if (hj15 != null) {
                    String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                    if (Wb == null) {
                        Wb = "";
                    }
                    hj15.f134670d = Wb;
                    C49712hj1 hj16 = d.f29575r;
                    if (hj16 != null) {
                        hj16.f134679p = "";
                        hj16.f134681r = "";
                        hj16.f134682s = "";
                        d.mo10167h();
                        f27719c.put(Integer.valueOf(i), d);
                        Log.m105924i("NearbyPreloadManager", "startRedDot preload PagePreloadMap commentScene: " + i3 + " TabId: " + i + " memoryType: " + (i + 1005000 + mo9476a(i)));
                        return;
                    }
                    C87412m.m108603p("contextObj");
                    throw null;
                }
                C87412m.m108603p("contextObj");
                throw null;
            }
            C87412m.m108603p("contextObj");
            throw null;
        }
        C87412m.m108603p("contextObj");
        throw null;
    }

    /* renamed from: i */
    public final void mo9484i(C49712hj1 hj12, C51942x91 x912, int i, String str) {
        C13598b0 b0Var;
        if (x912 != null) {
            C8614b bVar = f27717a;
            int a = bVar.mo9476a(x912.f144531d);
            C9479b d = bVar.mo9479d(a, x912.f144531d, i);
            C87412m.m108594g(hj12, "contextObj");
            d.mo10170k();
            d.f29575r = hj12;
            d.mo10167h();
            StringBuilder sb = new StringBuilder();
            sb.append("startLiveSquareTabPagePreload PagePreloadMap commentScene ");
            sb.append(a);
            sb.append(" TabId: ");
            sb.append(x912.f144531d);
            sb.append(" Tabname: ");
            sb.append(x912.f144532e);
            sb.append(" memoryType: ");
            int i2 = x912.f144531d;
            sb.append(i2 + 1005000 + bVar.mo9476a(i2));
            Log.m105924i("NearbyPreloadManager", sb.toString());
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w("NearbyPreloadManager", "startLiveSquareTabPagePreload " + str + " return for null");
        }
    }

    /* renamed from: j */
    public final void mo9485j(Intent intent) {
        int i;
        int i2;
        Class cls = FinderCommonFeatureService.class;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99319W4;
        boolean z = true;
        int i3 = 0;
        if (!(cVar.mo60266n().intValue() == 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("startPreloadForFindPageRedDot return for enableRedHotStartPreload:");
            fVar.getClass();
            if (cVar.mo60266n().intValue() != 1) {
                z = false;
            }
            sb.append(z);
            Log.m105928w("NearbyPreloadManager", sb.toString());
            return;
        }
        mo9482g();
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
        String str = C37715b.f99914a.mo61298a() ? "FinderLiveEntrance" : "NearbyEntrance";
        C55718s0 G5 = Nx0.mo77227G5(str);
        long j = 0;
        if (G5 == null || G5.mo77308o2(str) == null || G5.field_ctrInfo.f144670e != 16) {
            i2 = 0;
            i = 0;
        } else {
            Nx0.mo77242O(G5);
            C64858yi1 yi12 = G5.f158585F;
            int i4 = yi12.f186558s;
            i2 = yi12.f186563x;
            i = yi12.f186559t;
            long j2 = yi12.f186549g;
            f27717a.getClass();
            Class cls2 = C11759w.class;
            int i5 = i4 == 0 ? 88890 : i4;
            C8164o.f27045d.remove(94);
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62446e(cls).mo75002a(cls2);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…eloadCacheVM::class.java)");
            C11759w wVar = (C11759w) a;
            int Ej = ((C7606d) C86312j.m106911c(C7606d.class)).mo8738Ej(94, i5);
            int i6 = 1005000 + i5 + Ej;
            C11759w.C11760a d3 = ((C11759w) rVar.mo62446e(cls).mo75002a(cls2)).mo11635d3(i6);
            d3.f34434f = C11759w.C11762c.HardRefresh;
            d3.f34433e = 0;
            d3.f34437i = 0;
            Log.m105924i("PreloadCacheManager", "resetFirstPage memoryCacheFlag:" + i6);
            Log.m105924i("NearbyPreloadManager", "resetTargetTabCache tabId:" + i5 + " commentScene: " + Ej + " memoryCacheFlag: " + i6);
            i3 = i4;
            j = j2;
        }
        if (i3 != 0 && i2 != 0) {
            mo9486k(intent);
            mo9483h(intent, i3, 11);
            Log.m105924i("NearbyPreloadManager", "startPreloadForFindPageRedDot preLoad:" + i2 + " targetTabId:" + i3);
        }
        if (i == 1) {
            C10935b.f32585a.mo11135a((MMActivity) null, j, "", false, 94, (C32226l<? super FinderObject, C13598b0>) null);
        }
        Log.m105924i("NearbyPreloadManager", "startPreloadForFindPageRedDot checkEnterTargetLiveRoom enterLiveAction:" + i + " targetObjectId:" + j);
    }

    /* renamed from: k */
    public final void mo9486k(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99328X4;
        boolean z = false;
        if (!(cVar.mo60266n().intValue() == 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("startPreloadSquareTabs return for enableNearbySquareTabsPreload:");
            fVar.getClass();
            if (cVar.mo60266n().intValue() == 1) {
                z = true;
            }
            sb.append(z);
            Log.m105928w("NearbyPreloadManager", sb.toString());
            return;
        }
        C8616b bVar = new C8616b(intent);
        C9482d dVar = f27718b;
        if (dVar != null) {
            int ordinal = dVar.f29562n.ordinal();
            if (ordinal == 1) {
                dVar.mo10165f(new C8615a(bVar));
                return;
            } else if (ordinal == 5 && dVar.mo10164e() != null) {
                Log.m105924i("NearbyPreloadManager", "startPreloadSquareTabs hit requestCache");
                return;
            }
        }
        bVar.invoke(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
    }

    /* renamed from: l */
    public final void mo9487l(Intent intent, int i, int i2, String str) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "tabName");
        Log.m105924i("NearbyPreloadManager", "startSquareTabPagePreloadFromClick isEnableClickPreload: " + mo9480e());
        if (mo9480e()) {
            C21445b.f60694a.mo33622k(i2, i + 1001, str);
            mo9483h(intent, i, i2);
        }
    }
}
