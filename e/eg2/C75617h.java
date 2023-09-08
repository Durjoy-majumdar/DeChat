package eg2;

import android.content.Context;
import android.os.Message;
import cc0.C92411b;
import com.tencent.p014mm.plugin.radar.model.RadarAddContact;
import com.tencent.p014mm.pluginsdk.model.lbs.Location;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p586km.C46733b;
import p680ru.C101464l;
import p702ts.C78085c;
import pe3.C47465a;
import te3.C49870im3;
import te3.C50423mm3;
import te3.C64496km3;
import z04.C112551y;

/* renamed from: eg2.h */
public final class C75617h implements C11385n {

    /* renamed from: d */
    public final C75619c f222142d;

    /* renamed from: e */
    public final Context f222143e;

    /* renamed from: f */
    public C92411b f222144f;

    /* renamed from: g */
    public boolean f222145g;

    /* renamed from: h */
    public Location f222146h;

    /* renamed from: i */
    public C58600b f222147i;

    /* renamed from: j */
    public C75621e f222148j = C75621e.Stopped;

    /* renamed from: n */
    public final LinkedList<C64496km3> f222149n = new LinkedList<>();

    /* renamed from: o */
    public Map<String, String> f222150o = new LinkedHashMap();

    /* renamed from: p */
    public Map<String, RadarAddContact.C70378d> f222151p = new LinkedHashMap();

    /* renamed from: q */
    public Map<String, RadarAddContact.C70378d> f222152q = new LinkedHashMap();

    /* renamed from: r */
    public Map<Long, C75618b> f222153r = new LinkedHashMap();

    /* renamed from: s */
    public Map<String, C45657a> f222154s = new LinkedHashMap();

    /* renamed from: t */
    public final MTimerHandler f222155t = new MTimerHandler(new C75623g(this), false);

    /* renamed from: u */
    public final C75622f f222156u = new C75622f();

    /* renamed from: v */
    public final C92411b.C92412a f222157v = new C75624h(this);

    /* renamed from: eg2.h$a */
    public enum C45657a {
        Selected,
        UnSelected
    }

    /* renamed from: eg2.h$b */
    public static final class C75618b {

        /* renamed from: a */
        public final C64496km3 f222158a;

        /* renamed from: b */
        public final RadarAddContact.C70378d f222159b;

        public C75618b(C64496km3 km32, RadarAddContact.C70378d dVar) {
            C87412m.m108594g(km32, "member");
            C87412m.m108594g(dVar, "state");
            this.f222158a = km32;
            this.f222159b = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75618b)) {
                return false;
            }
            C75618b bVar = (C75618b) obj;
            return C87412m.m108589b(this.f222158a, bVar.f222158a) && this.f222159b == bVar.f222159b;
        }

        public int hashCode() {
            return (this.f222158a.hashCode() * 31) + this.f222159b.hashCode();
        }

        public String toString() {
            return "LatestChangeStat(member=" + this.f222158a + ", state=" + this.f222159b + ')';
        }
    }

    /* renamed from: eg2.h$c */
    public interface C75619c {
        /* renamed from: a */
        void mo96956a(int i, int i2, LinkedList<C64496km3> linkedList, int i3);

        /* renamed from: d */
        void mo96957d(boolean z, Location location);

        /* renamed from: e */
        void mo96958e(int i, int i2, LinkedList<C49870im3> linkedList, int i3);
    }

    /* renamed from: eg2.h$d */
    public enum C75620d {
        SEARCHING,
        SEARCH_RETRUN,
        RALATIONCHAIN_RETRUN
    }

    /* renamed from: eg2.h$e */
    public enum C75621e {
        Stopped,
        Locating,
        RadarSearching,
        Waiting
    }

    /* renamed from: eg2.h$f */
    public static final class C75622f extends MMHandler {
        public void handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            if (message.what == 1) {
                C86709a0.m107524d().mo123460f(new C58600b(2, 0.0f, 0.0f, 0, 0, "", ""));
            }
        }
    }

    /* renamed from: eg2.h$g */
    public static final class C75623g implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C75617h f222169d;

        public C75623g(C75617h hVar) {
            this.f222169d = hVar;
        }

        public final boolean onTimerExpired() {
            C75617h hVar = this.f222169d;
            if (!hVar.f222145g) {
                C75621e eVar = C75621e.RadarSearching;
                hVar.f222148j = eVar;
                boolean z = true;
                Log.m105919d("MicroMsg.Radar.RadarManager", "status: %s", eVar);
                C75617h hVar2 = this.f222169d;
                Location location = hVar2.f222146h;
                if (location != null) {
                    if (location.f211578d == -85.0f || location.f211579e == -1000.0f) {
                        Log.m105918d("MicroMsg.Radar.Location", "mac and cellId is null");
                    } else {
                        z = false;
                    }
                    if (z) {
                        Log.m105920e("MicroMsg.Radar.RadarManager", "error! location is null!");
                        return false;
                    }
                    Log.m105918d("MicroMsg.Radar.RadarManager", "do once search");
                    float f = location.f211578d;
                    float f2 = location.f211579e;
                    int i = location.f211580f;
                    int i2 = location.f211581g;
                    String str = location.f211582h;
                    C87412m.m108593f(str, "it.mac");
                    String str2 = location.f211583i;
                    C87412m.m108593f(str2, "it.cellId");
                    hVar2.f222147i = new C58600b(1, f, f2, i, i2, str, str2);
                    C86709a0.m107524d().mo123460f(hVar2.f222147i);
                } else {
                    Log.m105920e("MicroMsg.Radar.RadarManager", "error! location is null!");
                    return false;
                }
            } else {
                Log.m105918d("MicroMsg.Radar.RadarManager", "cancel radar searching");
            }
            return false;
        }
    }

    /* renamed from: eg2.h$h */
    public static final class C75624h implements C92411b.C92412a {

        /* renamed from: d */
        public final /* synthetic */ C75617h f222170d;

        public C75624h(C75617h hVar) {
            this.f222170d = hVar;
        }

        public final boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            C75617h hVar = this.f222170d;
            if (hVar.f222145g) {
                Log.m105918d("MicroMsg.Radar.RadarManager", "cancel location");
                return false;
            }
            Location location = hVar.f222146h;
            if (location != null) {
                return false;
            }
            if (z) {
                hVar.f222142d.mo96957d(true, location);
                int i2 = (int) d2;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2006, f, f2, i2);
                Log.m105919d("MicroMsg.Radar.RadarManager", "lat:%f lng:%f accuracy:%f", Float.valueOf(f2), Float.valueOf(f), Double.valueOf(d2));
                C75617h hVar2 = this.f222170d;
                hVar2.f222146h = new Location(f2, f, i2, i, "", "");
                hVar2.f222155t.startTimer(0);
            } else {
                hVar.f222142d.mo96957d(false, location);
                this.f222170d.mo105969g();
            }
            return false;
        }
    }

    public C75617h(C75619c cVar, Context context) {
        C87412m.m108594g(cVar, "delegate");
        C87412m.m108594g(context, "context");
        this.f222142d = cVar;
        this.f222143e = context;
    }

    /* renamed from: a */
    public final RadarAddContact.C70378d mo105963a(C64496km3 km32, boolean z) {
        C87412m.m108594g(km32, "member");
        String str = km32.f183957d;
        C87412m.m108593f(str, "member.UserName");
        RadarAddContact.C70378d b = mo105964b(str, z);
        if (b != null) {
            return b;
        }
        String str2 = km32.f183961h;
        C87412m.m108593f(str2, "member.EncodeUserName");
        return mo105964b(str2, z);
    }

    /* renamed from: b */
    public final RadarAddContact.C70378d mo105964b(String str, boolean z) {
        return z ? (RadarAddContact.C70378d) ((LinkedHashMap) this.f222152q).get(str) : (RadarAddContact.C70378d) ((LinkedHashMap) this.f222151p).get(str);
    }

    /* renamed from: c */
    public final void mo105965c(String str, RadarAddContact.C70378d dVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(dVar, "state");
        if (!C112551y.m153811k(str)) {
            mo105966d(str, dVar);
            this.f222151p.put(str, dVar);
        }
    }

    /* renamed from: d */
    public final void mo105966d(String str, RadarAddContact.C70378d dVar) {
        RadarAddContact.C70378d dVar2 = (RadarAddContact.C70378d) ((LinkedHashMap) this.f222151p).get(str);
        if (dVar2 != null && dVar2 != dVar) {
            this.f222152q.put(str, dVar2);
        }
    }

    /* renamed from: e */
    public final void mo105967e(C64496km3 km32) {
        if (km32 != null) {
            String str = km32.f183957d;
            if (str == null && (str = km32.f183961h) == null) {
                str = "";
            }
            if (this.f222154s.containsKey(str)) {
                this.f222154s.remove(str);
            } else {
                this.f222154s.put(str, C45657a.Selected);
            }
        }
    }

    /* renamed from: f */
    public final void mo105968f() {
        mo105970h();
        this.f222145g = false;
        this.f222146h = null;
        this.f222148j = C75621e.Stopped;
        this.f222155t.stopTimer();
        Log.m105918d("MicroMsg.Radar.RadarManager", "start radar");
        if (this.f222144f == null) {
            this.f222144f = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        }
        this.f222148j = C75621e.Locating;
        C92411b bVar = this.f222144f;
        if (bVar != null) {
            bVar.mo126407a(this.f222157v, true);
        }
        Log.m105919d("MicroMsg.Radar.RadarManager", "status: %s", this.f222148j);
    }

    /* renamed from: g */
    public final void mo105969g() {
        this.f222145g = true;
        this.f222148j = C75621e.Stopped;
        this.f222155t.stopTimer();
    }

    /* renamed from: h */
    public final void mo105970h() {
        int ordinal = this.f222148j.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                mo105969g();
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    mo105969g();
                    this.f222156u.sendEmptyMessageDelayed(1, (long) 5000);
                }
            } else if (this.f222147i != null) {
                mo105969g();
                C86709a0.m107524d().mo123458d(this.f222147i);
                this.f222156u.sendEmptyMessageDelayed(1, (long) 5000);
            }
            Log.m105918d("MicroMsg.Radar.RadarManager", "stop radar");
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int type = yVar.getType();
        C47465a aVar = null;
        if (type != 425) {
            if (type == 602) {
                Log.m105918d("MicroMsg.Radar.RadarManager", " MMFunc_MMRadarRelationChain ");
                if (i == 0 && i2 == 0) {
                    C7651a aVar2 = (C7651a) yVar;
                    throw null;
                } else {
                    this.f222142d.mo96958e(i, i2, (LinkedList<C49870im3>) null, 0);
                }
            }
        } else if (this.f222147i == yVar) {
            C58600b bVar = (C58600b) yVar;
            if (bVar.f167778d == 1) {
                this.f222148j = C75621e.Waiting;
                if (i == 0 && i2 == 0) {
                    Object[] objArr = new Object[2];
                    C47350c cVar = bVar.f167786o;
                    C50423mm3 mm32 = (C50423mm3) (cVar != null ? cVar.f127056b.f127083a : null);
                    objArr[0] = Integer.valueOf(mm32 != null ? mm32.f138109f : 0);
                    objArr[1] = null;
                    Log.m105919d("MicroMsg.Radar.RadarManager", "rader members count: %s ticket: %s", objArr);
                    this.f222155t.startTimer((long) 3000);
                    C47350c cVar2 = bVar.f167786o;
                    C50423mm3 mm33 = (C50423mm3) (cVar2 != null ? cVar2.f127056b.f127083a : null);
                    LinkedList<C64496km3> linkedList = mm33 != null ? mm33.f138110g : null;
                    if (linkedList != null) {
                        Iterator<C64496km3> it = linkedList.iterator();
                        while (it.hasNext()) {
                            C64496km3 next = it.next();
                            ((C46733b) C86312j.m106911c(C46733b.class)).zi0(next.f183957d, 48, next.f183962i);
                        }
                    }
                    if (linkedList != null) {
                        this.f222149n.clear();
                        this.f222149n.addAll(linkedList);
                    }
                    LinkedList<C64496km3> linkedList2 = this.f222149n;
                    C47350c cVar3 = bVar.f167786o;
                    if (cVar3 != null) {
                        aVar = cVar3.f127056b.f127083a;
                    }
                    C50423mm3 mm34 = (C50423mm3) aVar;
                    this.f222142d.mo96956a(i, i2, linkedList2, mm34 != null ? mm34.f138109f : 0);
                    Log.m105919d("MicroMsg.Radar.RadarManager", "status: %s", this.f222148j);
                    return;
                }
                mo105969g();
                this.f222142d.mo96956a(i, i2, (LinkedList<C64496km3>) null, 0);
                return;
            }
            this.f222142d.mo96956a(i, i2, (LinkedList<C64496km3>) null, 0);
        }
    }
}
