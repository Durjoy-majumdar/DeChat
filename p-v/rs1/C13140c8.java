package rs1;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bi1.C0283d;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C58259c;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8758a4;
import java.util.LinkedHashSet;
import java.util.Set;
import je1.C9377s4;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.ResultKt;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C50124kf1;
import te3.C51695vh1;
import te3.C64284cg;
import up1.C37521f;
import vp1.C14940p;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: rs1.c8 */
public final class C13140c8 extends UIComponent implements C8758a4 {

    /* renamed from: d */
    public final C13601g f37383d = C36568h.m40985a(new C13143c(this));

    /* renamed from: e */
    public final Set<String> f37384e = new LinkedHashSet();

    /* renamed from: f */
    public final C13601g f37385f = C36568h.m40985a(new C13141a(this));

    /* renamed from: g */
    public final C13142b f37386g = new C13142b(this);

    /* renamed from: rs1.c8$a */
    public static final class C13141a extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ C13140c8 f37387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13141a(C13140c8 c8Var) {
            super(0);
            this.f37387d = c8Var;
        }

        public Object invoke() {
            return ((C13442s8) C39818r.f106831a.mo62444c(this.f37387d.getActivity()).mo75002a(C13442s8.class)).mo12861q3();
        }
    }

    /* renamed from: rs1.c8$b */
    public static final class C13142b extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C13140c8 f37388g;

        public C13142b(C13140c8 c8Var) {
            this.f37388g = c8Var;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C60905o oVar;
            boolean containsKey;
            C51695vh1 vh12;
            C51695vh1 vh13;
            C87412m.m108594g(bVar, "ev");
            RecyclerView recyclerView = (RecyclerView) ((C36570n) this.f37388g.f37383d).getValue();
            WxRecyclerAdapter wxRecyclerAdapter = null;
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter instanceof WxRecyclerAdapter) {
                wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
            }
            WxRecyclerAdapter wxRecyclerAdapter2 = wxRecyclerAdapter;
            if (wxRecyclerAdapter2 != null && (bVar instanceof C58259c.C58260a)) {
                C58259c.C58260a aVar = (C58259c.C58260a) bVar;
                int i = aVar.f166811b;
                if (i == 2) {
                    C60905o oVar2 = (C60905o) C60898l.m71330b6(wxRecyclerAdapter2, aVar.f166817h, false, 2, (Object) null);
                    if (oVar2 != null) {
                        C13140c8 c8Var = this.f37388g;
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar2.f173503E;
                        if (baseFinderFeed != null) {
                            c8Var.mo12638c3(baseFinderFeed);
                        }
                    }
                } else if (i == 3 && (oVar = (C60905o) C60898l.m71330b6(wxRecyclerAdapter2, aVar.f166817h, false, 2, (Object) null)) != null) {
                    C13140c8 c8Var2 = this.f37388g;
                    BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) oVar.f173503E;
                    if (baseFinderFeed2 != null) {
                        c8Var2.getClass();
                        C50124kf1 kf12 = baseFinderFeed2.mo3513o().getFeedObject().object_extend;
                        boolean z = (kf12 == null || (vh13 = kf12.f136748g) == null) ? false : vh13.f143484d;
                        C50124kf1 kf13 = baseFinderFeed2.mo3513o().getFeedObject().object_extend;
                        int i2 = (kf13 == null || (vh12 = kf13.f136748g) == null) ? -1 : vh12.f143485e;
                        Log.m105924i("Finder.FinderProfilePreloadUIC", "[handlePreloadOnProgress] userPageIsPreload:" + z + ", userPageWaitTime:" + i2 + ", offset:" + aVar.f166815f);
                        if (z) {
                            String userName = baseFinderFeed2.mo3513o().getUserName();
                            C64284cg bizInfo = baseFinderFeed2.mo3513o().getBizInfo();
                            if (i2 > 0 && aVar.f166815f >= i2 && !baseFinderFeed2.mo3472F() && !c8Var2.f37384e.contains(userName) && bizInfo == null) {
                                C14940p pVar = C14940p.f40978a;
                                C87412m.m108594g(userName, "userName");
                                synchronized (pVar) {
                                    containsKey = C14940p.f40979b.containsKey(userName);
                                }
                                if (!containsKey) {
                                    c8Var2.f37384e.add(userName);
                                    c8Var2.mo12639d3(userName, "handlePreloadOnProgress");
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* renamed from: z1 */
        public boolean mo2333z1(C58553c cVar, C7637b bVar) {
            C87412m.m108594g(cVar, "dispatcher");
            C87412m.m108594g(bVar, "event");
            return bVar instanceof C58259c.C58260a;
        }
    }

    /* renamed from: rs1.c8$c */
    public static final class C13143c extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C13140c8 f37389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13143c(C13140c8 c8Var) {
            super(0);
            this.f37389d = c8Var;
        }

        public Object invoke() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) this.f37389d.getRootView().findViewById(C0966R.C0970id.ivb);
            if (refreshLoadMoreLayout != null) {
                return refreshLoadMoreLayout.getRecyclerView();
            }
            return null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderProfilePreloadUIC$requestUserPage$1", mo125469f = "FinderProfilePreloadUIC.kt", mo125470l = {109}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.c8$d */
    public static final class C13144d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f37390d;

        /* renamed from: e */
        public final /* synthetic */ C9377s4 f37391e;

        /* renamed from: f */
        public final /* synthetic */ String f37392f;

        /* renamed from: rs1.c8$d$a */
        public static final class C13145a extends C87413o implements C32229r<Integer, Integer, String, C117747y, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f37393d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13145a(String str) {
                super(4);
                this.f37393d = str;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
                */
            /* renamed from: I */
            public java.lang.Object mo162I(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
                /*
                    r2 = this;
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r3 = r3.intValue()
                    java.lang.Number r4 = (java.lang.Number) r4
                    int r4 = r4.intValue()
                    java.lang.String r5 = (java.lang.String) r5
                    ob0.y r6 = (ob0.C117747y) r6
                    if (r3 != 0) goto L_0x004b
                    if (r4 != 0) goto L_0x004b
                    boolean r3 = r6 instanceof je1.C9377s4
                    if (r3 == 0) goto L_0x001b
                    je1.s4 r6 = (je1.C9377s4) r6
                    goto L_0x001c
                L_0x001b:
                    r6 = 0
                L_0x001c:
                    if (r6 != 0) goto L_0x001f
                    goto L_0x004b
                L_0x001f:
                    vp1.p r3 = vp1.C14940p.f40978a
                    java.lang.String r4 = r2.f37393d
                    vp1.p$a r5 = new vp1.p$a
                    long r0 = eb0.C31543z5.m39453c()
                    r5.<init>(r0, r6)
                    java.lang.String r6 = "userName"
                    gy3.C87412m.m108594g(r4, r6)
                    monitor-enter(r3)
                    monitor-enter(r3)     // Catch:{ all -> 0x0048 }
                    java.util.Map<java.lang.String, vp1.p$a> r6 = vp1.C14940p.f40979b     // Catch:{ all -> 0x0045 }
                    java.lang.Object r0 = r6.remove(r4)     // Catch:{ all -> 0x0045 }
                    vp1.p$a r0 = (vp1.C14940p.C14941a) r0     // Catch:{ all -> 0x0045 }
                    monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                    java.lang.Object r4 = r6.put(r4, r5)     // Catch:{ all -> 0x0048 }
                    vp1.p$a r4 = (vp1.C14940p.C14941a) r4     // Catch:{ all -> 0x0048 }
                    monitor-exit(r3)
                    goto L_0x004b
                L_0x0045:
                    r4 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                    throw r4     // Catch:{ all -> 0x0048 }
                L_0x0048:
                    r4 = move-exception
                    monitor-exit(r3)
                    throw r4
                L_0x004b:
                    rx3.b0 r3 = rx3.C13598b0.f38549a
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: rs1.C13140c8.C13144d.C13145a.mo162I(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13144d(C9377s4 s4Var, String str, C15601d<? super C13144d> dVar) {
            super(2, dVar);
            this.f37391e = s4Var;
            this.f37392f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13144d(this.f37391e, this.f37392f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13144d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37390d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9377s4 s4Var = this.f37391e;
                C13145a aVar2 = new C13145a(this.f37392f);
                this.f37390d = 1;
                if (C0283d.m244b(s4Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13140c8(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.f136748g;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12638c3(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r4) {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r4.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.kf1 r0 = r0.object_extend
            if (r0 == 0) goto L_0x0013
            te3.vh1 r0 = r0.f136748g
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.f143484d
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[handlePreloadOnPlayEnd] userPageIsPreload:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderProfilePreloadUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r0 == 0) goto L_0x0066
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r4.mo3513o()
            java.lang.String r0 = r0.getUserName()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            te3.cg r4 = r4.getBizInfo()
            java.util.Set<java.lang.String> r1 = r3.f37384e
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0066
            if (r4 != 0) goto L_0x0066
            vp1.p r4 = vp1.C14940p.f40978a
            java.lang.String r1 = "userName"
            gy3.C87412m.m108594g(r0, r1)
            monitor-enter(r4)
            java.util.Map<java.lang.String, vp1.p$a> r1 = vp1.C14940p.f40979b     // Catch:{ all -> 0x0063 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)
            if (r1 != 0) goto L_0x0066
            java.util.Set<java.lang.String> r4 = r3.f37384e
            r4.add(r0)
            java.lang.String r4 = "handlePreloadOnPlayEnd"
            r3.mo12639d3(r0, r4)
            goto L_0x0066
        L_0x0063:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13140c8.mo12638c3(com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* renamed from: d3 */
    public final void mo12639d3(String str, String str2) {
        String str3 = str;
        Log.m105924i("Finder.FinderProfilePreloadUIC", "requestUserPage:" + str3 + ", source:" + str2);
        C37521f.f99374d.getClass();
        boolean z = true;
        if (C37521f.f99399f7.mo60266n().intValue() != 1) {
            z = false;
        }
        boolean b = C87412m.m108589b(str3, C66785b.f191882e.mo90662O5());
        int i = 32;
        if (b && !z) {
            i = 33;
        } else if (b && z) {
            i = 137;
        } else if ((b || z) && !b && z) {
            i = 136;
        }
        C49712hj1 hj12 = new C49712hj1();
        hj12.f134677n = getContextObj().f134675i | i;
        hj12.f134675i = i;
        Log.m105924i("Finder.FinderProfilePreloadUIC", "lastCommentScene: " + getContextObj().f134675i + ", fromCommentScene: " + hj12.f134677n + ", commentScene: " + hj12.f134675i);
        hj12.f134670d = getContextObj().f134670d;
        hj12.f134671e = getContextObj().f134671e;
        hj12.f134672f = getContextObj().f134672f;
        hj12.f134676j = getContextObj().f134676j;
        hj12.f134673g = getContextObj().f134673g;
        hj12.f134674h = getContextObj().f134674h;
        hj12.f134680q = getContextObj().f134680q;
        hj12.f134678o = getContextObj().f134678o;
        hj12.f134679p = getContextObj().f134679p;
        String str4 = getContextObj().f134687x;
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        hj12.f134687x = str4;
        String str6 = getContextObj().f134681r;
        if (str6 == null) {
            str6 = str5;
        }
        hj12.f134681r = str6;
        String str7 = getContextObj().f134682s;
        if (str7 != null) {
            str5 = str7;
        }
        hj12.f134682s = str5;
        hj12.f134684u = getContextObj().f134684u;
        hj12.f134685v = getContextObj().f134685v;
        hj12.f134686w = getContextObj().f134686w;
        hj12.f134683t = getContextObj().f134683t;
        C9377s4 s4Var = r0;
        C9377s4 s4Var2 = new C9377s4(str, 0, (C89349b) null, 0, hj12, 0, 0, false, (String) null, 0, (Integer) null, (Long) null, (String) null, false, true, (Long) null, 49134, (C8480h) null);
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C13144d(s4Var, str, (C15601d<? super C13144d>) null), 3, (Object) null);
    }

    public final C49712hj1 getContextObj() {
        return (C49712hj1) this.f37385f.getValue();
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        Fragment fragment = getFragment();
        FinderHomeTabFragment finderHomeTabFragment = fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null;
        C58553c y3 = ((C13442s8) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12867y3(finderHomeTabFragment != null ? finderHomeTabFragment.f17334o : -1);
        if (y3 != null) {
            y3.mo83450a(this.f37386g);
        }
    }

    public void onPostDestroyed() {
        super.onPostDestroyed();
        this.f37384e.clear();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13140c8(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
