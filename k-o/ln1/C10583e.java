package ln1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ns3.C11267f;
import te3.C49173do1;
import te3.C51449tu2;

/* renamed from: ln1.e */
public final class C10583e implements C11267f {

    /* renamed from: a */
    public static final C10583e f31911a = new C10583e();

    /* renamed from: b */
    public static final LinkedList<C0740i2> f31912b = new LinkedList<>();

    /* renamed from: c */
    public static final LinkedList<C51449tu2> f31913c = new LinkedList<>();

    /* renamed from: d */
    public static final LinkedList<C51449tu2> f31914d = new LinkedList<>();

    /* renamed from: e */
    public static final LinkedList<C0740i2> f31915e = new LinkedList<>();

    /* renamed from: f */
    public static final LinkedList<C51449tu2> f31916f = new LinkedList<>();

    /* renamed from: g */
    public static final LinkedList<C51449tu2> f31917g = new LinkedList<>();

    /* renamed from: h */
    public static final LinkedList<C0740i2> f31918h = new LinkedList<>();

    /* renamed from: i */
    public static final LinkedList<C51449tu2> f31919i = new LinkedList<>();

    /* renamed from: j */
    public static final LinkedList<C51449tu2> f31920j = new LinkedList<>();

    /* renamed from: k */
    public static final LinkedList<C49173do1> f31921k = new LinkedList<>();

    /* renamed from: a */
    public List<C49173do1> mo10833a(int i, int i2) {
        f31921k.clear();
        for (C0740i2 i2Var : mo10837e(i)) {
            if (i2Var instanceof BaseFinderFeed) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                Iterator<C51449tu2> it = f31911a.mo10838f(i).iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (it.next().f142417d == i2Var.getItemId()) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    C49173do1 do12 = new C49173do1();
                    do12.f132446d = baseFinderFeed.mo3513o().getFeedObject().f164794id;
                    do12.f132447e = baseFinderFeed.mo3513o().getFeedObject().objectNonceId;
                    do12.f132448f = i2;
                    do12.f132449g = baseFinderFeed.mo3513o().getFeedObject().sessionBuffer;
                    do12.f132446d = baseFinderFeed.mo3513o().getId();
                    do12.f132447e = baseFinderFeed.mo3513o().getObjectNonceId();
                    f31921k.add(do12);
                }
            }
        }
        List<C0740i2> e = mo10837e(i);
        StringBuilder sb = new StringBuilder();
        sb.append("printLastRspList size:");
        LinkedList<C0740i2> linkedList = (LinkedList) e;
        sb.append(linkedList.size());
        Log.m105918d("NearbyReadFeedRecorder", sb.toString());
        if (BuildInfo.DEBUG) {
            for (C0740i2 i2Var2 : linkedList) {
                Log.m105918d("NearbyReadFeedRecorder", "printLastRspList: " + i2Var2.getItemId() + ' ' + i2Var2.mo75c());
            }
        }
        List<C51449tu2> f = mo10838f(i);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("printReadList size:");
        LinkedList<C51449tu2> linkedList2 = (LinkedList) f;
        sb4.append(linkedList2.size());
        Log.m105918d("NearbyReadFeedRecorder", sb4.toString());
        if (BuildInfo.DEBUG) {
            for (C51449tu2 tu22 : linkedList2) {
                Log.m105918d("NearbyReadFeedRecorder", "printReadList: " + tu22.f142420g + ' ' + tu22.f142417d + ' ' + tu22.f142422i + ' ');
            }
        }
        LinkedList<C49173do1> linkedList3 = f31921k;
        Log.m105918d("NearbyReadFeedRecorder", "printUnreadList size:" + linkedList3.size());
        if (BuildInfo.DEBUG) {
            for (C49173do1 do13 : linkedList3) {
                Log.m105918d("NearbyReadFeedRecorder", "printUnreadList: " + do13.f132446d + ' ' + do13.f132448f);
            }
        }
        return f31921k;
    }

    /* renamed from: b */
    public List<C51449tu2> mo10834b(int i) {
        List<C51449tu2> f = mo10838f(i);
        for (C51449tu2 tu22 : mo10836d(i)) {
            for (C0740i2 i2Var : f31911a.mo10837e(i)) {
                if (tu22.f142417d == i2Var.getItemId()) {
                    Iterator<C51449tu2> it = f.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (it.next().f142417d == tu22.f142417d) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 < 0) {
                        int i3 = tu22.f142422i;
                        long c = C31543z5.m39453c();
                        tu22.f142422i = (int) (c - ((long) i3));
                        if (i2Var instanceof BaseFinderFeed) {
                            tu22.f142421h = ((BaseFinderFeed) i2Var).mo3526z();
                        }
                        Log.m105918d("NearbyReadFeedRecorder", "expose id:" + tu22.f142417d + " expose[" + i3 + ", " + c + "] exposeTime:" + tu22.f142422i + " seesion:" + tu22.f142421h + ' ');
                        ((LinkedList) f).add(tu22);
                    }
                }
            }
        }
        return f;
    }

    /* renamed from: c */
    public boolean mo10835c(int i) {
        return i == 15 || i == 76 || i == 80 || i == 94;
    }

    /* renamed from: d */
    public final List<C51449tu2> mo10836d(int i) {
        if (i == 15) {
            return f31916f;
        }
        if (i != 76) {
            if (i == 80) {
                return f31919i;
            }
            if (i != 94) {
                return new LinkedList();
            }
        }
        return f31913c;
    }

    /* renamed from: e */
    public final List<C0740i2> mo10837e(int i) {
        if (i == 15) {
            return f31915e;
        }
        if (i != 76) {
            if (i == 80) {
                return f31918h;
            }
            if (i != 94) {
                return new LinkedList();
            }
        }
        return f31912b;
    }

    /* renamed from: f */
    public final List<C51449tu2> mo10838f(int i) {
        if (i == 15) {
            return f31917g;
        }
        if (i != 76) {
            if (i == 80) {
                return f31920j;
            }
            if (i != 94) {
                return new LinkedList();
            }
        }
        return f31914d;
    }

    /* renamed from: g */
    public final void mo10839g(int i, List<? extends C51449tu2> list) {
        C87412m.m108594g(list, "list");
        for (C0740i2 i2Var : mo10837e(i)) {
            for (C51449tu2 tu22 : list) {
                if (i2Var.getItemId() == tu22.f142417d) {
                    Iterator<C51449tu2> it = f31911a.mo10838f(i).iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (it.next().f142417d == i2Var.getItemId()) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 < 0) {
                        if (i2Var instanceof BaseFinderFeed) {
                            tu22.f142421h = ((BaseFinderFeed) i2Var).mo3526z();
                        }
                        ((LinkedList) f31911a.mo10838f(i)).add(tu22);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo10840h(int i, List<? extends C0740i2> list) {
        C87412m.m108594g(list, "list");
        Log.m105918d("NearbyReadFeedRecorder", "recordLastRsp commentScene:" + i + " size:" + list.size());
        if (i != 15) {
            if (i != 76) {
                if (i == 80) {
                    f31920j.clear();
                    f31919i.clear();
                    LinkedList<C0740i2> linkedList = f31918h;
                    linkedList.clear();
                    linkedList.addAll(list);
                    return;
                } else if (i != 94) {
                    return;
                }
            }
            f31914d.clear();
            f31913c.clear();
            LinkedList<C0740i2> linkedList2 = f31912b;
            linkedList2.clear();
            linkedList2.addAll(list);
            return;
        }
        f31917g.clear();
        f31916f.clear();
        LinkedList<C0740i2> linkedList3 = f31915e;
        linkedList3.clear();
        linkedList3.addAll(list);
    }
}
