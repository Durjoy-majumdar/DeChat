package com.tencent.p014mm.plugin.finder.view;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C55015f1;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.view.TestPreloadPreview;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import df1.C58259c;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7636a;
import ef1.C7637b;
import ef1.C7642k;
import fy3.C32224a;
import gr1.C59673q2;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import o40.C61926c;
import qt1.C12931a;
import rx3.C13598b0;
import wp1.C66167g;

/* renamed from: com.tencent.mm.plugin.finder.view.j8 */
public final class C56626j8 extends C58555d {

    /* renamed from: g */
    public final /* synthetic */ TestPreloadPreview f162337g;

    /* renamed from: com.tencent.mm.plugin.finder.view.j8$a */
    public static final class C56627a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TestPreloadPreview f162338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56627a(TestPreloadPreview testPreloadPreview) {
            super(0);
            this.f162338d = testPreloadPreview;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter = this.f162338d.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.j8$b */
    public static final class C56628b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TestPreloadPreview f162339d;

        /* renamed from: e */
        public final /* synthetic */ C7637b f162340e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56628b(TestPreloadPreview testPreloadPreview, C7637b bVar) {
            super(0);
            this.f162339d = testPreloadPreview;
            this.f162340e = bVar;
        }

        public Object invoke() {
            TestPreloadPreview testPreloadPreview = this.f162339d;
            testPreloadPreview.f162164j = ((C7642k) this.f162340e).f25958i;
            TestPreloadPreview.m65251f(testPreloadPreview);
            this.f162339d.getRecyclerView().post(new C56633k8(this.f162339d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.j8$c */
    public static final class C56629c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7637b f162341d;

        /* renamed from: e */
        public final /* synthetic */ TestPreloadPreview f162342e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56629c(C7637b bVar, TestPreloadPreview testPreloadPreview) {
            super(0);
            this.f162341d = bVar;
            this.f162342e = testPreloadPreview;
        }

        public Object invoke() {
            E e;
            boolean z;
            E e2;
            boolean z2;
            E e3;
            boolean z3;
            E e4;
            boolean z4;
            E e5;
            boolean z5;
            E e6;
            boolean z6;
            E e7;
            boolean z7;
            TestPreloadPreview.C56581c cVar = TestPreloadPreview.C56581c.DOWNLOADER_LOCAL_CACHE;
            TestPreloadPreview.C56581c cVar2 = TestPreloadPreview.C56581c.DOWNLOADER_IDLE;
            C58259c.C58260a aVar = (C58259c.C58260a) this.f162341d;
            int i = aVar.f166811b;
            String str = "";
            E e8 = null;
            if (i == 1) {
                DataBuffer<C0740i2> dataBuffer = this.f162342e.f162162h;
                if (dataBuffer != null) {
                    Iterator<E> it = dataBuffer.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            e = null;
                            break;
                        }
                        E next = it.next();
                        if (((C0740i2) next).getItemId() == aVar.f166817h) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            e = next;
                            break;
                        }
                    }
                    C0740i2 i2Var = (C0740i2) e;
                    if (i2Var != null) {
                        TestPreloadPreview testPreloadPreview = this.f162342e;
                        String str2 = TestPreloadPreview.m65248c(testPreloadPreview, i2Var).f185275p;
                        if (str2 != null) {
                            str = str2;
                        }
                        TestPreloadPreview.m65246a(testPreloadPreview, str).f162191j = TestPreloadPreview.C56581c.PLAYER_RUNNING;
                        TestPreloadPreview.m65251f(testPreloadPreview);
                    }
                    TestPreloadPreview.m65251f(this.f162342e);
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            } else if (i == 6) {
                DataBuffer<C0740i2> dataBuffer2 = this.f162342e.f162162h;
                if (dataBuffer2 != null) {
                    Iterator<E> it4 = dataBuffer2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            e2 = null;
                            break;
                        }
                        E next2 = it4.next();
                        if (((C0740i2) next2).getItemId() == aVar.f166817h) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            e2 = next2;
                            break;
                        }
                    }
                    C0740i2 i2Var2 = (C0740i2) e2;
                    if (i2Var2 != null) {
                        TestPreloadPreview testPreloadPreview2 = this.f162342e;
                        String str3 = TestPreloadPreview.m65248c(testPreloadPreview2, i2Var2).f185275p;
                        if (str3 != null) {
                            str = str3;
                        }
                        TestPreloadPreview.m65246a(testPreloadPreview2, str).f162191j = TestPreloadPreview.C56581c.PLAYER_STOP;
                        TestPreloadPreview.m65251f(testPreloadPreview2);
                    }
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            } else if (i == 11) {
                DataBuffer<C0740i2> dataBuffer3 = this.f162342e.f162162h;
                if (dataBuffer3 != null) {
                    Iterator<E> it5 = dataBuffer3.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            e3 = null;
                            break;
                        }
                        E next3 = it5.next();
                        if (((C0740i2) next3).getItemId() == aVar.f166817h) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            e3 = next3;
                            break;
                        }
                    }
                    C0740i2 i2Var3 = (C0740i2) e3;
                    if (i2Var3 != null) {
                        TestPreloadPreview testPreloadPreview3 = this.f162342e;
                        String str4 = TestPreloadPreview.m65248c(testPreloadPreview3, i2Var3).f185275p;
                        if (str4 != null) {
                            str = str4;
                        }
                        TestPreloadPreview.m65246a(testPreloadPreview3, str).f162191j = TestPreloadPreview.C56581c.PLAYER_PAUSE;
                        TestPreloadPreview.m65251f(testPreloadPreview3);
                    }
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            } else if (i == 19) {
                DataBuffer<C0740i2> dataBuffer4 = this.f162342e.f162162h;
                if (dataBuffer4 != null) {
                    Iterator<E> it6 = dataBuffer4.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            e4 = null;
                            break;
                        }
                        E next4 = it6.next();
                        if (((C0740i2) next4).getItemId() == aVar.f166817h) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            e4 = next4;
                            break;
                        }
                    }
                    C0740i2 i2Var4 = (C0740i2) e4;
                    if (i2Var4 != null) {
                        TestPreloadPreview testPreloadPreview4 = this.f162342e;
                        C7637b bVar = this.f162341d;
                        String str5 = TestPreloadPreview.m65248c(testPreloadPreview4, i2Var4).f185275p;
                        if (str5 != null) {
                            str = str5;
                        }
                        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview4, str);
                        C12931a aVar2 = ((C58259c.C58260a) bVar).f166830u;
                        a.f162189h = aVar2 != null ? aVar2.f36957d : 0;
                        TestPreloadPreview.m65251f(testPreloadPreview4);
                    }
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            } else if (i == 3) {
                DataBuffer<C0740i2> dataBuffer5 = this.f162342e.f162162h;
                if (dataBuffer5 != null) {
                    Iterator<E> it7 = dataBuffer5.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            e5 = null;
                            break;
                        }
                        E next5 = it7.next();
                        if (((C0740i2) next5).getItemId() == aVar.f166817h) {
                            z5 = true;
                            continue;
                        } else {
                            z5 = false;
                            continue;
                        }
                        if (z5) {
                            e5 = next5;
                            break;
                        }
                    }
                    C0740i2 i2Var5 = (C0740i2) e5;
                    if (i2Var5 != null) {
                        TestPreloadPreview testPreloadPreview5 = this.f162342e;
                        C7637b bVar2 = this.f162341d;
                        String str6 = TestPreloadPreview.m65248c(testPreloadPreview5, i2Var5).f185275p;
                        if (str6 == null) {
                            str6 = str;
                        }
                        C58259c.C58260a aVar3 = (C58259c.C58260a) bVar2;
                        TestPreloadPreview.m65246a(testPreloadPreview5, str6).f162192k = aVar3.f166815f;
                        String str7 = TestPreloadPreview.m65248c(testPreloadPreview5, i2Var5).f185275p;
                        if (str7 != null) {
                            str = str7;
                        }
                        TestPreloadPreview.m65246a(testPreloadPreview5, str).f162193l = (long) aVar3.f166816g;
                        TestPreloadPreview.m65251f(testPreloadPreview5);
                    }
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            } else if (i == 4) {
                DataBuffer<C0740i2> dataBuffer6 = this.f162342e.f162162h;
                if (dataBuffer6 != null) {
                    Iterator<E> it8 = dataBuffer6.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            e6 = null;
                            break;
                        }
                        e6 = it8.next();
                        if (((C0740i2) e6).getItemId() == aVar.f166817h) {
                            z6 = true;
                            continue;
                        } else {
                            z6 = false;
                            continue;
                        }
                        if (z6) {
                            break;
                        }
                    }
                    C0740i2 i2Var6 = (C0740i2) e6;
                    if (i2Var6 != null) {
                        TestPreloadPreview testPreloadPreview6 = this.f162342e;
                        C7637b bVar3 = this.f162341d;
                        String str8 = TestPreloadPreview.m65248c(testPreloadPreview6, i2Var6).f185275p;
                        if (str8 != null) {
                            str = str8;
                        }
                        TestPreloadPreview.C56580b a2 = TestPreloadPreview.m65246a(testPreloadPreview6, str);
                        a2.f162191j = TestPreloadPreview.C56581c.PLAYER_START;
                        C59673q2 q2Var = ((C58259c.C58260a) bVar3).f166812c;
                        if (q2Var != null) {
                            C55015f1 d = C66167g.m78055d(C66167g.f190173a, q2Var.f170493c, false, 2, (Object) null);
                            boolean n2 = d.mo76073n2();
                            boolean k = C86013q1.m106450k(q2Var.f170492b);
                            if (n2 && k && a2.f162190i == cVar2) {
                                a2.f162190i = cVar;
                            }
                            String str9 = d.field_mediaId;
                            C87412m.m108593f(str9, "mediaCache.field_mediaId");
                            a2.f162196o = str9;
                        }
                        TestPreloadPreview.m65251f(testPreloadPreview6);
                    }
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            } else if (i == 22) {
                DataBuffer<C0740i2> dataBuffer7 = this.f162342e.f162162h;
                if (dataBuffer7 != null) {
                    Iterator<E> it9 = dataBuffer7.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            e7 = null;
                            break;
                        }
                        e7 = it9.next();
                        if (((C0740i2) e7).getItemId() == aVar.f166817h) {
                            break;
                        }
                    }
                    C0740i2 i2Var7 = (C0740i2) e7;
                    if (i2Var7 != null) {
                        TestPreloadPreview testPreloadPreview7 = this.f162342e;
                        C7637b bVar4 = this.f162341d;
                        String str10 = TestPreloadPreview.m65248c(testPreloadPreview7, i2Var7).f185275p;
                        if (str10 != null) {
                            str = str10;
                        }
                        TestPreloadPreview.C56580b a3 = TestPreloadPreview.m65246a(testPreloadPreview7, str);
                        a3.f162191j = TestPreloadPreview.C56581c.PLAYER_PRE_RENDER;
                        C59673q2 q2Var2 = ((C58259c.C58260a) bVar4).f166812c;
                        if (q2Var2 != null) {
                            C55015f1 d2 = C66167g.m78055d(C66167g.f190173a, q2Var2.f170493c, false, 2, (Object) null);
                            boolean n25 = d2.mo76073n2();
                            boolean k2 = C86013q1.m106450k(q2Var2.f170492b);
                            if (n25 && k2 && a3.f162190i == cVar2) {
                                a3.f162190i = cVar;
                            }
                            String str11 = d2.field_mediaId;
                            C87412m.m108593f(str11, "mediaCache.field_mediaId");
                            a3.f162196o = str11;
                        }
                        TestPreloadPreview.m65251f(testPreloadPreview7);
                    }
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            } else if (i == 23) {
                DataBuffer<C0740i2> dataBuffer8 = this.f162342e.f162162h;
                if (dataBuffer8 != null) {
                    Iterator<E> it10 = dataBuffer8.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            break;
                        }
                        E next6 = it10.next();
                        if (((C0740i2) next6).getItemId() == aVar.f166817h) {
                            z7 = true;
                            continue;
                        } else {
                            z7 = false;
                            continue;
                        }
                        if (z7) {
                            e8 = next6;
                            break;
                        }
                    }
                    C0740i2 i2Var8 = (C0740i2) e8;
                    if (i2Var8 != null) {
                        TestPreloadPreview testPreloadPreview8 = this.f162342e;
                        String str12 = TestPreloadPreview.m65248c(testPreloadPreview8, i2Var8).f185275p;
                        if (str12 != null) {
                            str = str12;
                        }
                        TestPreloadPreview.m65246a(testPreloadPreview8, str).f162191j = TestPreloadPreview.C56581c.PLAYER_PRE_RENDER_COMPLETE;
                        TestPreloadPreview.m65251f(testPreloadPreview8);
                    }
                } else {
                    C87412m.m108603p("data");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C56626j8(TestPreloadPreview testPreloadPreview) {
        this.f162337g = testPreloadPreview;
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C87412m.m108594g(bVar, "ev");
        if (bVar instanceof C7636a) {
            C7636a aVar = (C7636a) bVar;
            Log.m105924i("TestPreloadView", "onEventHappen: DataChangeEvent type = 0");
            C61926c.m72668M(new C56627a(this.f162337g));
        } else if (bVar instanceof C7642k) {
            C61926c.m72668M(new C56628b(this.f162337g, bVar));
        } else if (bVar instanceof C58259c.C58260a) {
            C61926c.m72668M(new C56629c(bVar, this.f162337g));
        }
    }

    /* renamed from: y1 */
    public boolean mo2424y1() {
        return true;
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        if (bVar instanceof C7642k) {
            int i = ((C7642k) bVar).f25951b;
            return i == 0 || i == 7 || i == 6;
        } else if (bVar instanceof C7636a) {
            return true;
        } else {
            if (!(bVar instanceof C58259c.C58260a)) {
                return false;
            }
            int i2 = ((C58259c.C58260a) bVar).f166811b;
            return i2 == 1 || i2 == 19 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 11 || i2 == 22 || i2 == 23;
        }
    }
}
