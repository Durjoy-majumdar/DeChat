package v91;

import aa1.C91980d;
import android.app.Activity;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p91.C100693b;
import sx3.C110818d0;
import t91.C64208c;
import u91.C22618a;

/* renamed from: v91.j */
public final class C22734j {

    /* renamed from: t */
    public static int f65405t;

    /* renamed from: a */
    public final HashMap<String, C22733i> f65406a = new HashMap<>();

    /* renamed from: b */
    public String f65407b;

    /* renamed from: c */
    public int f65408c;

    /* renamed from: d */
    public long f65409d;

    /* renamed from: e */
    public final long f65410e = System.currentTimeMillis();

    /* renamed from: f */
    public int f65411f;

    /* renamed from: g */
    public float f65412g;

    /* renamed from: h */
    public float f65413h;

    /* renamed from: i */
    public float f65414i;

    /* renamed from: j */
    public float f65415j;

    /* renamed from: k */
    public float f65416k;

    /* renamed from: l */
    public C100693b f65417l;

    /* renamed from: m */
    public WeakReference<Activity> f65418m;

    /* renamed from: n */
    public final C22728c f65419n;

    /* renamed from: o */
    public WeakReference<StaggeredGridLayoutManager> f65420o;

    /* renamed from: p */
    public WeakReference<RecyclerView> f65421p;

    /* renamed from: q */
    public HashMap<String, C22733i> f65422q;

    /* renamed from: r */
    public long f65423r;

    /* renamed from: s */
    public int f65424s;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22734j(android.app.Activity r10, androidx.fragment.app.Fragment r11) {
        /*
            r9 = this;
            r9.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f65406a = r0
            long r0 = java.lang.System.currentTimeMillis()
            r9.f65410e = r0
            if (r10 == 0) goto L_0x0019
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            r9.f65418m = r0
        L_0x0019:
            aa1.d r10 = aa1.C91980d.vx0()
            java.lang.String r10 = r10.mo84751Wb()
            r9.f65407b = r10
            java.lang.ref.WeakReference<android.app.Activity> r10 = r9.f65418m
            if (r10 == 0) goto L_0x002e
            java.lang.Object r10 = r10.get()
            android.app.Activity r10 = (android.app.Activity) r10
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            if (r10 != 0) goto L_0x0033
            goto L_0x023d
        L_0x0033:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x004a }
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x004a }
            java.lang.String r1 = "null cannot be cast to non-null type android.view.WindowManager"
            gy3.C87412m.m108592e(r0, r1)     // Catch:{ Exception -> 0x004a }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ Exception -> 0x004a }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ Exception -> 0x004a }
            goto L_0x0052
        L_0x004a:
            android.view.WindowManager r0 = r10.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
        L_0x0052:
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            if (r0 == 0) goto L_0x005c
            r0.getSize(r1)
        L_0x005c:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            if (r0 == 0) goto L_0x0066
            r0.getRealSize(r2)
        L_0x0066:
            int r0 = r1.x
            float r0 = (float) r0
            r9.f65412g = r0
            r3 = 2
            float r4 = (float) r3
            float r0 = r0 / r4
            r9.f65413h = r0
            int r0 = r1.y
            float r0 = (float) r0
            int r1 = r2.y
            r2 = 0
            android.content.res.Resources r4 = r10.getResources()
            java.lang.String r5 = "status_bar_height"
            java.lang.String r6 = "dimen"
            java.lang.String r7 = "android"
            int r5 = r4.getIdentifier(r5, r6, r7)
            int r5 = r4.getDimensionPixelSize(r5)
            float r5 = (float) r5
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0096
            r2 = 2131166394(0x7f0704ba, float:1.7947032E38)
            int r2 = r4.getDimensionPixelSize(r2)
            float r5 = (float) r2
        L_0x0096:
            r2 = 0
            boolean r4 = r10 instanceof androidx.appcompat.app.AppCompatActivity     // Catch:{ Exception -> 0x00ad }
            if (r4 == 0) goto L_0x00b7
            r4 = r10
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4     // Catch:{ Exception -> 0x00ad }
            androidx.appcompat.app.ActionBar r4 = r4.getSupportActionBar()     // Catch:{ Exception -> 0x00ad }
            if (r4 == 0) goto L_0x00b7
            android.view.View r4 = r4.mo91099j()     // Catch:{ Exception -> 0x00ad }
            int r4 = r4.getHeight()     // Catch:{ Exception -> 0x00ad }
            goto L_0x00b8
        L_0x00ad:
            r4 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = "HABBYGE-MALI.HellhoundUtil"
            java.lang.String r8 = "initBarHeight"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r4, r8, r6)
        L_0x00b7:
            r4 = 0
        L_0x00b8:
            android.content.res.Resources r6 = r10.getResources()
            r7 = 2131165256(0x7f070048, float:1.7944724E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r4 = java.lang.Math.max(r4, r6)
            float r6 = (float) r4
            float r6 = r6 + r5
            r9.f65414i = r6
            r9.f65415j = r0
            float r7 = r9.f65412g
            float r6 = r0 - r6
            float r7 = r7 * r6
            r9.f65416k = r7
            t91.C64208c.f181974x = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "initScreen:\nmScreenMid="
            r6.append(r7)
            float r7 = r9.f65413h
            r6.append(r7)
            java.lang.String r7 = "\nmScreenWidth="
            r6.append(r7)
            float r7 = r9.f65412g
            r6.append(r7)
            java.lang.String r7 = "\nscreenRealHeight="
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = "\nscreenHeight="
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = "\nstatusBarHeight="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = "\nactionBarHeight="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = "\nmScreenTop="
            r6.append(r0)
            float r0 = r9.f65414i
            r6.append(r0)
            java.lang.String r0 = "\nmScreenBottom="
            r6.append(r0)
            float r0 = r9.f65415j
            r6.append(r0)
            java.lang.String r0 = "\nmScreenArea="
            r6.append(r0)
            float r0 = r9.f65416k
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "HABBYGE-MALI.WaterfallsFlowStatistics"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r11 != 0) goto L_0x0215
            java.lang.Class r11 = r10.getClass()
            java.lang.String r11 = r11.getName()
            int r4 = r11.hashCode()
            r5 = 1
            switch(r4) {
                case -1796598533: goto L_0x01e3;
                case -1577760806: goto L_0x01ce;
                case -1570624296: goto L_0x01b6;
                case 395150120: goto L_0x019e;
                case 782364972: goto L_0x017e;
                case 786042180: goto L_0x0167;
                case 1251839313: goto L_0x014d;
                default: goto L_0x014b;
            }
        L_0x014b:
            goto L_0x01f8
        L_0x014d:
            java.lang.String r0 = "com.tencent.mm.plugin.finder.search.FinderMixSearchUI"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0157
            goto L_0x01f8
        L_0x0157:
            v91.e r11 = new v91.e
            r11.<init>(r10)
            r9.f65417l = r11
            r10 = 5
            f65405t = r10
            r10 = 1004(0x3ec, float:1.407E-42)
            r9.f65408c = r10
            goto L_0x023d
        L_0x0167:
            java.lang.String r3 = "com.tencent.mm.plugin.finder.feed.ui.FinderNewUIC"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x0171
            goto L_0x01f8
        L_0x0171:
            t91.g r10 = new t91.g
            r10.<init>()
            r9.f65417l = r10
            f65405t = r2
            r9.f65408c = r0
            goto L_0x023d
        L_0x017e:
            java.lang.String r0 = "com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0188
            goto L_0x01f8
        L_0x0188:
            v91.h r10 = new v91.h
            r10.<init>()
            r9.f65417l = r10
            f65405t = r5
            int r10 = t91.C64208c.f181944K
            if (r10 != r3) goto L_0x0198
            r10 = 1002(0x3ea, float:1.404E-42)
            goto L_0x019a
        L_0x0198:
            r10 = 1001(0x3e9, float:1.403E-42)
        L_0x019a:
            r9.f65408c = r10
            goto L_0x023d
        L_0x019e:
            java.lang.String r0 = "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x01a7
            goto L_0x01f8
        L_0x01a7:
            v91.g r11 = new v91.g
            r11.<init>(r10)
            r9.f65417l = r11
            f65405t = r5
            r10 = 1006(0x3ee, float:1.41E-42)
            r9.f65408c = r10
            goto L_0x023d
        L_0x01b6:
            java.lang.String r0 = "com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x01bf
            goto L_0x01f8
        L_0x01bf:
            v91.b r10 = new v91.b
            r10.<init>()
            r9.f65417l = r10
            f65405t = r2
            r10 = 1008(0x3f0, float:1.413E-42)
            r9.f65408c = r10
            goto L_0x023d
        L_0x01ce:
            java.lang.String r3 = "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x01d7
            goto L_0x01f8
        L_0x01d7:
            t91.g r10 = new t91.g
            r10.<init>()
            r9.f65417l = r10
            f65405t = r2
            r9.f65408c = r0
            goto L_0x023d
        L_0x01e3:
            java.lang.String r3 = "com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x01ec
            goto L_0x01f8
        L_0x01ec:
            t91.g r10 = new t91.g
            r10.<init>()
            r9.f65417l = r10
            f65405t = r2
            r9.f65408c = r0
            goto L_0x023d
        L_0x01f8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "initFeedParamsCatcher, miss page: "
            r11.append(r0)
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            goto L_0x023d
        L_0x0215:
            java.lang.Class r10 = r11.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment"
            boolean r10 = gy3.C87412m.m108589b(r10, r11)
            if (r10 == 0) goto L_0x0231
            t91.g r10 = new t91.g
            r10.<init>()
            r9.f65417l = r10
            f65405t = r2
            r9.f65408c = r0
            goto L_0x023d
        L_0x0231:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "initFragmentFeedParamsCatcher miss !!"
            r10.<init>(r11)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r11, r0)
        L_0x023d:
            v91.c r10 = new v91.c
            r10.<init>(r9)
            r9.f65419n = r10
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r9.f65422q = r10
            r10 = -1
            r9.f65423r = r10
            r10 = -1
            r9.f65424s = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v91.C22734j.<init>(android.app.Activity, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: a */
    public final void mo35830a(C22733i iVar) {
        float f = (float) iVar.f65392m;
        float f2 = iVar.f65393n;
        float f3 = f + f2;
        float f4 = this.f65414i;
        float f5 = 0.0f;
        if (f < f4) {
            float f6 = this.f65415j;
            if (f3 > f6) {
                f5 = f6 - f4;
            } else if (f3 > f4) {
                f5 = f3 - f4;
            }
        } else {
            float f7 = this.f65415j;
            if (f3 <= f7) {
                f5 = f2;
            } else if (f < f7) {
                f5 = f7 - f;
            }
        }
        iVar.f65384e = (f5 * 100.0f) / f2;
        iVar.f65385f = ((f5 * iVar.f65394o) * 100.0f) / this.f65416k;
    }

    /* renamed from: b */
    public final void mo35831b(C22733i iVar) {
        int i;
        if (((float) iVar.f65391l) <= this.f65413h) {
            C64208c.C64209a aVar = C64208c.f181951a;
            List<String> list = C64208c.f181976z;
            if (!C110818d0.m150903D(list, iVar.f65399t)) {
                String str = iVar.f65399t;
                C87412m.m108591d(str);
                ((ArrayList) list).add(str);
            }
            iVar.f65398s = C110818d0.m150918P(list, iVar.f65399t);
            i = 0;
        } else {
            C64208c.C64209a aVar2 = C64208c.f181951a;
            List<String> list2 = C64208c.f181934A;
            if (!C110818d0.m150903D(list2, iVar.f65399t)) {
                String str2 = iVar.f65399t;
                C87412m.m108591d(str2);
                ((ArrayList) list2).add(str2);
            }
            iVar.f65398s = C110818d0.m150918P(list2, iVar.f65399t);
            i = 1;
        }
        iVar.f65397r = i;
    }

    /* renamed from: c */
    public final void mo35832c(C22733i iVar) {
        boolean z;
        C64208c.C64209a aVar = C64208c.f181951a;
        List<String> list = C64208c.f181975y;
        if (!C110818d0.m150903D(list, iVar.f65399t)) {
            z = false;
        } else if (iVar.f65396q < 0) {
            z = true;
        } else {
            return;
        }
        if (!z) {
            String str = iVar.f65399t;
            C87412m.m108591d(str);
            ((ArrayList) list).add(str);
        }
        iVar.f65396q = C110818d0.m150918P(list, iVar.f65399t);
    }

    /* renamed from: d */
    public final C22733i mo35833d(View view, int i, RecyclerView recyclerView) {
        View view2 = view;
        int i2 = i;
        C100693b bVar = this.f65417l;
        if (bVar != null) {
            bVar.setRecyclerView(recyclerView);
        }
        C100693b bVar2 = this.f65417l;
        String str = null;
        String e = bVar2 != null ? bVar2.mo87292e(view2, i2) : null;
        if (e == null) {
            return null;
        }
        C22733i iVar = this.f65406a.get(e);
        if (iVar == null) {
            iVar = new C22733i((String) null, 0, 0, 0, 0.0f, 0.0f, (String) null, 0, 0, 0, false, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, (String) null, (String) null, (String) null, 0, 0, (String) null, 33554431, (C8480h) null);
            iVar.f65399t = e;
            C100693b bVar3 = this.f65417l;
            iVar.f65400u = bVar3 != null ? bVar3.mo87288a(view2, i2) : null;
            C100693b bVar4 = this.f65417l;
            iVar.f65401v = bVar4 != null ? bVar4.mo87293f(view2, i2) : null;
            C100693b bVar5 = this.f65417l;
            String d = bVar5 != null ? bVar5.mo87291d(i2) : null;
            if (d != null) {
                str = d.replace(",", ".");
            }
            iVar.f65404y = str;
            String str2 = this.f65407b;
            if (str2 == null) {
                str2 = C91980d.vx0().mo84751Wb();
            }
            iVar.f65380a = str2;
            iVar.f65387h = this.f65408c;
            iVar.f65386g = C116711b.m164579d();
            Pair<Float, Float> j = C116711b.m164585j(view);
            Object obj = j.first;
            C87412m.m108593f(obj, "widthHeightPair.first");
            iVar.f65394o = ((Number) obj).floatValue();
            Object obj2 = j.second;
            C87412m.m108593f(obj2, "widthHeightPair.second");
            iVar.f65393n = ((Number) obj2).floatValue();
            this.f65406a.put(e, iVar);
        } else if (iVar.f65404y == null || iVar.f65393n <= 0.0f || iVar.f65392m <= 0) {
            iVar.f65399t = e;
            C100693b bVar6 = this.f65417l;
            iVar.f65400u = bVar6 != null ? bVar6.mo87288a(view2, i2) : null;
            C100693b bVar7 = this.f65417l;
            iVar.f65401v = bVar7 != null ? bVar7.mo87293f(view2, i2) : null;
            C100693b bVar8 = this.f65417l;
            String d2 = bVar8 != null ? bVar8.mo87291d(i2) : null;
            if (d2 != null) {
                str = d2.replace(",", ".");
            }
            iVar.f65404y = str;
            String str3 = this.f65407b;
            if (str3 == null) {
                str3 = C91980d.vx0().mo84751Wb();
            }
            iVar.f65380a = str3;
            iVar.f65387h = this.f65408c;
            iVar.f65386g = C116711b.m164579d();
            Pair<Float, Float> j2 = C116711b.m164585j(view);
            Object obj3 = j2.first;
            C87412m.m108593f(obj3, "widthHeightPair.first");
            iVar.f65394o = ((Number) obj3).floatValue();
            Object obj4 = j2.second;
            C87412m.m108593f(obj4, "widthHeightPair.second");
            iVar.f65393n = ((Number) obj4).floatValue();
        }
        return iVar;
    }

    /* renamed from: e */
    public final void mo35834e(Map<String, C22733i> map) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        WeakReference<StaggeredGridLayoutManager> weakReference = this.f65420o;
        if (weakReference != null && (staggeredGridLayoutManager = weakReference.get()) != null) {
            for (Map.Entry next : map.entrySet()) {
                View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(f65405t + ((C22733i) next.getValue()).f65395p);
                if (findViewByPosition != null) {
                    Pair<Integer, Integer> a = C116711b.m164576a(findViewByPosition);
                    Object obj = a.first;
                    C87412m.m108593f(obj, "xy.first");
                    ((C22733i) next.getValue()).f65391l = ((Number) obj).intValue();
                    Object obj2 = a.second;
                    C87412m.m108593f(obj2, "xy.second");
                    ((C22733i) next.getValue()).f65392m = ((Number) obj2).intValue();
                    Pair<Float, Float> j = C116711b.m164585j(findViewByPosition);
                    Object obj3 = j.first;
                    C87412m.m108593f(obj3, "widthHeightPair.first");
                    ((C22733i) next.getValue()).f65394o = ((Number) obj3).floatValue();
                    Object obj4 = j.second;
                    C87412m.m108593f(obj4, "widthHeightPair.second");
                    ((C22733i) next.getValue()).f65393n = ((Number) obj4).floatValue();
                    mo35830a((C22733i) next.getValue());
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo35835f(Map<String, C22733i> map, long j) {
        for (Map.Entry<String, C22733i> value : map.entrySet()) {
            C22733i iVar = (C22733i) value.getValue();
            iVar.f65382c = j;
            iVar.f65389j = j - iVar.f65381b;
            iVar.f65383d = this.f65411f;
            if (iVar.f65388i <= 0) {
                long j2 = this.f65409d;
                if (j2 <= 0) {
                    j2 = this.f65410e;
                }
                iVar.f65388i = j2;
            }
            C22618a.f65058a.mo35742c(iVar);
        }
        map.clear();
    }

    /* renamed from: g */
    public final void mo35836g(Object obj, long j) {
        Map map;
        C64208c.C64209a aVar = C64208c.f181951a;
        if (obj == null) {
            map = null;
        } else {
            int hashCode = obj.hashCode();
            map = (Map) ((LinkedHashMap) C64208c.f181954d).get(Integer.valueOf(hashCode));
            if (map == null) {
                map = (Map) ((LinkedHashMap) C64208c.f181955e).get(obj.getClass().getName());
            }
        }
        if (map != null) {
            Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "startStatisticsByHand, lastFeedMap: " + map.size());
            if (!map.isEmpty()) {
                this.f65406a.clear();
                this.f65406a.putAll(map);
                if (obj != null) {
                    C64208c.f181954d.remove(Integer.valueOf(obj.hashCode()));
                    C64208c.f181955e.remove(obj.getClass().getName());
                }
                for (Map.Entry<String, C22733i> value : this.f65406a.entrySet()) {
                    C22733i iVar = (C22733i) value.getValue();
                    iVar.f65381b = j;
                    iVar.f65382c = 0;
                    iVar.f65389j = 0;
                    iVar.f65383d = 0;
                    if (iVar.f65388i <= 0) {
                        long j2 = this.f65409d;
                        if (j2 <= 0) {
                            j2 = this.f65410e;
                        }
                        iVar.f65388i = j2;
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo35837h(Object obj, long j) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View findViewByPosition;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f65406a);
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C22733i iVar = (C22733i) entry.getValue();
            WeakReference<StaggeredGridLayoutManager> weakReference = this.f65420o;
            if (!(weakReference == null || (staggeredGridLayoutManager = weakReference.get()) == null || (findViewByPosition = staggeredGridLayoutManager.findViewByPosition(f65405t + iVar.f65395p)) == null)) {
                Pair<Integer, Integer> a = C116711b.m164576a(findViewByPosition);
                Object obj2 = a.first;
                C87412m.m108593f(obj2, "xy.first");
                iVar.f65391l = ((Number) obj2).intValue();
                Object obj3 = a.second;
                C87412m.m108593f(obj3, "xy.second");
                iVar.f65392m = ((Number) obj3).intValue();
                Pair<Float, Float> j2 = C116711b.m164585j(findViewByPosition);
                Object obj4 = j2.first;
                C87412m.m108593f(obj4, "widthHeightPair.first");
                iVar.f65394o = ((Number) obj4).floatValue();
                Object obj5 = j2.second;
                C87412m.m108593f(obj5, "widthHeightPair.second");
                iVar.f65393n = ((Number) obj5).floatValue();
                mo35830a(iVar);
            }
            if (((C22733i) entry.getValue()).f65384e <= 0.0f) {
                it.remove();
            }
        }
        C64208c.C64209a aVar = C64208c.f181951a;
        if (obj != null) {
            C64208c.f181954d.put(Integer.valueOf(obj.hashCode()), hashMap);
            C64208c.f181955e.put(obj.getClass().getName(), hashMap);
        }
        Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "stopStatisticsByHand, realFeedMap=" + hashMap.size() + ", mFeedMap=" + this.f65406a.size());
        mo35835f(this.f65406a, j);
    }
}
