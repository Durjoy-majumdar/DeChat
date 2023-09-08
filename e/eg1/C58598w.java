package eg1;

import al1.C54127h;
import al1.C54129i;
import al1.C54131l;
import android.content.Context;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.live.FinderLiveRelatedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import rx3.C13605o;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C51938x81;
import te3.C64414h71;
import tf1.C64927s;

/* renamed from: eg1.w */
public final class C58598w {

    /* renamed from: h */
    public static final int f167764h = C32444a.f86083N0.mo60266n().intValue();

    /* renamed from: i */
    public static long f167765i = -1;

    /* renamed from: j */
    public static long f167766j = -1;

    /* renamed from: k */
    public static C64414h71 f167767k;

    /* renamed from: l */
    public static Long f167768l = 0L;

    /* renamed from: a */
    public final Context f167769a;

    /* renamed from: b */
    public C58596u f167770b;

    /* renamed from: c */
    public final C64927s<C54127h> f167771c = new C64927s<>(0, 1, (C8480h) null);

    /* renamed from: d */
    public volatile boolean f167772d;

    /* renamed from: e */
    public int f167773e = 2;

    /* renamed from: f */
    public int f167774f;

    /* renamed from: g */
    public FinderLiveRelatedLoader f167775g;

    /* renamed from: eg1.w$a */
    public static final class C58599a extends C87413o implements C32226l<IResponse<C54127h>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58598w f167776d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveRelatedLoader f167777e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58599a(C58598w wVar, FinderLiveRelatedLoader finderLiveRelatedLoader) {
            super(1);
            this.f167776d = wVar;
            this.f167777e = finderLiveRelatedLoader;
        }

        public Object invoke(Object obj) {
            IResponse iResponse;
            String str;
            C54129i iVar;
            Object obj2;
            Object obj3;
            int i;
            C51938x81 x812;
            String str2;
            C13605o oVar;
            int i2;
            IResponse iResponse2;
            String str3;
            int i3;
            Iterator it;
            int i4;
            int i5;
            C54129i G0;
            List incrementList;
            IResponse iResponse3 = (IResponse) obj;
            this.f167776d.f167772d = false;
            C58596u uVar = this.f167776d.f167770b;
            C54129i G02 = uVar != null ? uVar.mo77493G0() : null;
            C58598w wVar = this.f167776d;
            FinderLiveRelatedLoader finderLiveRelatedLoader = this.f167777e;
            String str4 = "FinderLiveDataLoader";
            if (G02 == null || iResponse3 == null) {
                iResponse = iResponse3;
                str = str4;
                iVar = null;
                obj2 = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("load data finish,presenter:");
                C58596u uVar2 = wVar.f167770b;
                sb.append(uVar2 != null ? uVar2.hashCode() : 0);
                sb.append(", cur data size:");
                sb.append(G02.f151990e.size());
                sb.append(",load data size:");
                List incrementList2 = iResponse3.getIncrementList();
                sb.append(incrementList2 != null ? Integer.valueOf(incrementList2.size()) : null);
                sb.append(",_response.pullType:");
                sb.append(iResponse3.getPullType());
                sb.append('!');
                Log.m105924i(str4, sb.toString());
                boolean z = iResponse3 instanceof FinderLiveRelatedLoader.C55876b;
                if (!z || ((FinderLiveRelatedLoader.C55876b) iResponse3).f159195a == finderLiveRelatedLoader.f159189f) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("load data finish,presenter:");
                    C58596u uVar3 = wVar.f167770b;
                    sb4.append(uVar3 != null ? uVar3.hashCode() : 0);
                    sb4.append(", cur data size:");
                    sb4.append(G02.f151990e.size());
                    sb4.append(",load data size:");
                    List incrementList3 = iResponse3.getIncrementList();
                    sb4.append(incrementList3 != null ? Integer.valueOf(incrementList3.size()) : null);
                    sb4.append(",_response.pullType:");
                    sb4.append(iResponse3.getPullType());
                    sb4.append(",loadType:");
                    sb4.append(wVar.f167773e);
                    sb4.append(",thread:");
                    sb4.append(Thread.currentThread().getName());
                    sb4.append('!');
                    Log.m105924i(str4, sb4.toString());
                    C54131l lVar = G02.f151988c;
                    if (lVar != null) {
                        lVar.f152021a = iResponse3.getLastBuffer();
                    }
                    if (!z || !((FinderLiveRelatedLoader.C55876b) iResponse3).f159196b) {
                        iResponse = iResponse3;
                        str = str4;
                        iVar = null;
                        int i6 = wVar.f167773e;
                        if (i6 == 3 || i6 == 4) {
                            C58596u uVar4 = wVar.f167770b;
                            int c0 = uVar4 != null ? uVar4.mo77497c0() : G02.mo74925c();
                            boolean z2 = true;
                            if (wVar.f167774f == 1) {
                                i = G02.mo74923a(iResponse.getIncrementList());
                            } else {
                                C54131l lVar2 = G02.f151988c;
                                LinkedList<Long> linkedList = (lVar2 == null || (x812 = lVar2.f152038r) == null) ? null : x812.f144517d;
                                if (!(linkedList == null || linkedList.isEmpty())) {
                                    i = G02.mo74923a(iResponse.getIncrementList());
                                } else {
                                    List incrementList4 = iResponse.getIncrementList();
                                    if (incrementList4 != null && !incrementList4.isEmpty()) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        Log.m105924i(G02.f151986a, "avoid dropTailLiveData,curPos:" + G02.mo74925c() + ",size:" + G02.f151990e.size() + ",remote is empty!");
                                    } else if (c0 > 0 && c0 < G02.f151990e.size()) {
                                        Log.m105924i(G02.f151986a, "before dropTailLiveData lastVisibleItemPos:" + c0 + ",curPos:" + G02.mo74925c() + ",size:" + G02.f151990e.size() + ',' + G02.mo74930h(G02.f151990e));
                                        G02.mo74929g(new ArrayList(G02.f151990e.subList(0, c0 + 1)));
                                        Log.m105924i(G02.f151986a, "after dropTailLiveData lastVisibleItemPos:" + c0 + ",curPos:" + G02.mo74925c() + ",size:" + G02.f151990e.size() + ',' + G02.mo74930h(G02.f151990e));
                                    }
                                    i = G02.mo74923a(incrementList4);
                                    Log.m105924i(G02.f151986a, "replaceTailLiveData lastVisibleItemPos:" + c0 + ",curPos:" + G02.mo74925c() + ",incrementSize:" + i + ",size:" + G02.f151990e.size() + ',' + G02.mo74930h(G02.f151990e));
                                }
                            }
                            C58596u uVar5 = wVar.f167770b;
                            if (uVar5 != null) {
                                List incrementList5 = iResponse.getIncrementList();
                                if (incrementList5 == null) {
                                    incrementList5 = C64186f0.f181907d;
                                }
                                uVar5.mo77498c1(G02, c0, i, incrementList5);
                            }
                            obj3 = Boolean.valueOf(wVar.f167771c.mo89085d());
                        } else {
                            C58596u uVar6 = wVar.f167770b;
                            if (uVar6 != null) {
                                int size = G02.f151990e.size();
                                int a = G02.mo74923a(iResponse.getIncrementList());
                                List incrementList6 = iResponse.getIncrementList();
                                if (incrementList6 == null) {
                                    incrementList6 = C64186f0.f181907d;
                                }
                                uVar6.mo77494I(G02, size, a, incrementList6);
                                obj3 = C13598b0.f38549a;
                            } else {
                                obj3 = null;
                            }
                        }
                    } else {
                        C58596u uVar7 = wVar.f167770b;
                        if (!(uVar7 == null || (G0 = uVar7.mo77493G0()) == null || (incrementList = iResponse3.getIncrementList()) == null)) {
                            int size2 = incrementList.size();
                            int size3 = G0.f151994i.size();
                            if (size2 > size3) {
                                size2 = size3;
                            }
                            for (int i7 = 0; i7 < size2; i7++) {
                                HashMap<Long, String> hashMap = G0.f151993h;
                                Long valueOf = Long.valueOf(((C54127h) incrementList.get(i7)).f151977d.f157064e);
                                String str5 = G0.f151994i.get(i7);
                                C87412m.m108593f(str5, "exportIdList[i]");
                                hashMap.put(valueOf, str5);
                            }
                            Log.m105924i(G0.f151986a, "fillupExportIdMap " + G0.f151993h + " exportIdList.size:" + G0.f151994i.size() + " newList.size:" + incrementList.size());
                        }
                        List incrementList7 = iResponse3.getIncrementList();
                        C54127h hVar = (C54127h) C110818d0.m150925W(G02.f151990e);
                        if (hVar == null) {
                            List<C54127h> d = G02.mo74926d(G02.f151990e, incrementList7 == null ? new ArrayList() : incrementList7);
                            G02.f151990e.addAll(d);
                            String str6 = G02.f151986a;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("#appendBizLiveData remoteSize=");
                            sb5.append(incrementList7 != null ? Integer.valueOf(incrementList7.size()) : null);
                            sb5.append(", after filter size ");
                            LinkedList linkedList2 = (LinkedList) d;
                            sb5.append(linkedList2.size());
                            sb5.append(", now liveDataList.size=");
                            sb5.append(G02.f151990e.size());
                            Log.m105924i(str6, sb5.toString());
                            oVar = new C13605o(0, 0, Integer.valueOf(linkedList2.size()));
                            iResponse = iResponse3;
                            str2 = str4;
                            iVar = null;
                        } else {
                            int size4 = G02.f151990e.size() - 1;
                            if (size4 < 0) {
                                size4 = 0;
                            }
                            List arrayList = incrementList7 == null ? new ArrayList() : incrementList7;
                            LinkedList linkedList3 = new LinkedList();
                            LinkedList linkedList4 = new LinkedList();
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                C54127h hVar2 = (C54127h) it4.next();
                                Iterator it5 = linkedList4.iterator();
                                int i8 = 0;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        it = it4;
                                        i4 = -1;
                                        i5 = -1;
                                        break;
                                    }
                                    it = it4;
                                    if (((C54127h) it5.next()).mo76f(hVar2) == 0) {
                                        i5 = i8;
                                        i4 = -1;
                                        break;
                                    }
                                    i8++;
                                    it4 = it;
                                }
                                if (i5 == i4) {
                                    linkedList4.add(hVar2);
                                }
                                it4 = it;
                            }
                            Iterator it6 = linkedList4.iterator();
                            int i9 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                if (((C54127h) it6.next()).mo76f(hVar) == 0) {
                                    i2 = i9;
                                    break;
                                }
                                i9++;
                            }
                            if (i2 >= 0 && i2 < linkedList4.size()) {
                                int i15 = 0;
                                for (Object next : linkedList4) {
                                    int i16 = i15 + 1;
                                    if (i15 >= 0) {
                                        C54127h hVar3 = (C54127h) next;
                                        if (i15 < i2) {
                                            linkedList3.add(hVar3);
                                        }
                                        i15 = i16;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
                            }
                            Log.m105924i(G02.f151986a, "mergeUpFilter initIndex:" + i2 + ", resultList.size:" + linkedList3.size());
                            List arrayList2 = incrementList7 == null ? new ArrayList() : incrementList7;
                            LinkedList linkedList5 = new LinkedList();
                            LinkedList linkedList6 = new LinkedList();
                            Iterator it7 = arrayList2.iterator();
                            while (it7.hasNext()) {
                                Iterator it8 = it7;
                                C54127h hVar4 = (C54127h) it7.next();
                                Iterator it9 = linkedList6.iterator();
                                int i17 = 0;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        iResponse2 = iResponse3;
                                        str3 = str4;
                                        i3 = -1;
                                        break;
                                    }
                                    iResponse2 = iResponse3;
                                    if (((C54127h) it9.next()).mo76f(hVar4) == 0) {
                                        str3 = str4;
                                        i3 = i17;
                                        break;
                                    }
                                    i17++;
                                    iResponse3 = iResponse2;
                                }
                                if (i3 == -1) {
                                    linkedList6.add(hVar4);
                                }
                                str4 = str3;
                                it7 = it8;
                                iResponse3 = iResponse2;
                            }
                            iResponse = iResponse3;
                            str2 = str4;
                            Iterator it10 = linkedList6.iterator();
                            int i18 = 0;
                            while (true) {
                                if (!it10.hasNext()) {
                                    i18 = -1;
                                    break;
                                }
                                if (((C54127h) it10.next()).mo76f(hVar) == 0) {
                                    break;
                                }
                                i18++;
                            }
                            if (i18 >= 0 && i18 < linkedList6.size()) {
                                int i19 = 0;
                                for (Object next2 : linkedList6) {
                                    int i25 = i19 + 1;
                                    if (i19 >= 0) {
                                        C54127h hVar5 = (C54127h) next2;
                                        if (i19 > i18) {
                                            linkedList5.add(hVar5);
                                        }
                                        i19 = i25;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
                            }
                            iVar = null;
                            Log.m105924i(G02.f151986a, "mergeDownFilter initIndex:" + i18 + ", resultList.size:" + linkedList5.size());
                            if (!linkedList3.isEmpty() || !linkedList5.isEmpty()) {
                                List<C54127h> d2 = G02.mo74926d(G02.f151990e, linkedList3);
                                List<C54127h> d3 = G02.mo74926d(G02.f151990e, linkedList5);
                                G02.f151990e.addAll(size4, d2);
                                ArrayList<C54127h> arrayList3 = G02.f151990e;
                                arrayList3.addAll(arrayList3.size(), d3);
                                String str7 = G02.f151986a;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("#appendBizLiveData remoteSize=");
                                sb6.append(incrementList7 != null ? Integer.valueOf(incrementList7.size()) : null);
                                sb6.append(", upList size ");
                                sb6.append(linkedList3.size());
                                sb6.append(", realUpList size ");
                                LinkedList linkedList7 = (LinkedList) d2;
                                sb6.append(linkedList7.size());
                                sb6.append(", downList size ");
                                sb6.append(linkedList5.size());
                                sb6.append(", realDownList size ");
                                LinkedList linkedList8 = (LinkedList) d3;
                                sb6.append(linkedList8.size());
                                sb6.append(" now liveDataList.size=");
                                sb6.append(G02.f151990e.size());
                                Log.m105924i(str7, sb6.toString());
                                oVar = new C13605o(Integer.valueOf(size4), Integer.valueOf(linkedList7.size()), Integer.valueOf(linkedList8.size()));
                            } else {
                                List<C54127h> d4 = G02.mo74926d(G02.f151990e, incrementList7 == null ? new ArrayList() : incrementList7);
                                G02.f151990e.addAll(d4);
                                String str8 = G02.f151986a;
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("#appendBizLiveData remoteSize=");
                                sb7.append(incrementList7 != null ? Integer.valueOf(incrementList7.size()) : null);
                                sb7.append(", after filter size ");
                                LinkedList linkedList9 = (LinkedList) d4;
                                sb7.append(linkedList9.size());
                                sb7.append(", now liveDataList.size=");
                                sb7.append(G02.f151990e.size());
                                Log.m105924i(str8, sb7.toString());
                                oVar = new C13605o(0, 0, Integer.valueOf(linkedList9.size()));
                            }
                        }
                        C58596u uVar8 = wVar.f167770b;
                        if (uVar8 != null) {
                            uVar8.mo77502i(G02, ((Number) oVar.f38557d).intValue(), ((Number) oVar.f38558e).intValue(), ((Number) oVar.f38559f).intValue());
                        }
                        wVar.f167771c.mo89085d();
                        str = str2;
                        Log.m105924i(str, "appendOrderLiveData result:[" + ((Number) oVar.f38557d).intValue() + ", " + ((Number) oVar.f38558e).intValue() + ", " + ((Number) oVar.f38559f).intValue() + ']');
                        obj3 = C13598b0.f38549a;
                    }
                } else {
                    Log.m105924i(str4, "loadmore but state changed.");
                    C58596u uVar9 = wVar.f167770b;
                    if (uVar9 != null) {
                        uVar9.mo77495K0();
                        obj3 = C13598b0.f38549a;
                        iResponse = iResponse3;
                        str = str4;
                        iVar = null;
                    } else {
                        iResponse = iResponse3;
                        str = str4;
                        iVar = null;
                        obj3 = null;
                    }
                }
                obj2 = obj3;
            }
            if (obj2 == null) {
                C58598w wVar2 = this.f167776d;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("load data finish,cur data:");
                C58596u uVar10 = wVar2.f167770b;
                if (uVar10 != null) {
                    iVar = uVar10.mo77493G0();
                }
                sb8.append(iVar);
                sb8.append(",response:");
                sb8.append(iResponse);
                sb8.append('!');
                Log.m105924i(str, sb8.toString());
                C13598b0 b0Var = C13598b0.f38549a;
            }
            return C13598b0.f38549a;
        }
    }

    public C58598w(Context context) {
        C87412m.m108594g(context, "context");
        this.f167769a = context;
        FinderLiveRelatedLoader finderLiveRelatedLoader = new FinderLiveRelatedLoader();
        finderLiveRelatedLoader.f159192i = context;
        finderLiveRelatedLoader.f159188e = new C58599a(this, finderLiveRelatedLoader);
        this.f167775g = finderLiveRelatedLoader;
    }
}
