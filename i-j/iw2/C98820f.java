package iw2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cw2.C97393p;
import di3.C86312j;
import dw2.C45454a;
import dw2.C45456e;
import dw2.C45466i;
import dw2.C45467j;
import dw2.C45468k;
import ew2.C97758b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32229r;
import gw2.C98266k;
import gw2.C98267l;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jw2.C99069d;
import kw2.C99268i;
import kw2.C99269j;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p232rw.C101476o;
import p749xh.C66261f3;
import rx3.C13598b0;
import sx3.C64197v;
import te3.pc4;
import te3.sb4;
import zv2.C103109c;

/* renamed from: iw2.f */
public final class C98820f extends C98862q implements C11385n {

    /* renamed from: e */
    public final String f289687e;

    /* renamed from: f */
    public final List<String> f289688f;

    /* renamed from: g */
    public final C98858n f289689g;

    /* renamed from: h */
    public final String f289690h = "MicroMsg.FavStoryPresenter";

    /* renamed from: i */
    public final ArrayList<ArrayList<C98266k>> f289691i = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<C98860o> f289692j = new ArrayList<>();

    /* renamed from: n */
    public final LinkedList<Integer> f289693n = new LinkedList<>();

    /* renamed from: o */
    public int f289694o = -1;

    /* renamed from: p */
    public int f289695p = -1;

    /* renamed from: q */
    public int f289696q = -1;

    /* renamed from: r */
    public int f289697r = -1;

    /* renamed from: s */
    public int f289698s;

    /* renamed from: t */
    public boolean f289699t;

    /* renamed from: u */
    public boolean f289700u;

    /* renamed from: v */
    public final C32229r<Long, Boolean, String, String, C13598b0> f289701v = new C98855m(this);

    /* renamed from: iw2.f$a */
    public static final class C98821a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98820f f289702d;

        /* renamed from: e */
        public final /* synthetic */ int f289703e;

        /* renamed from: f */
        public final /* synthetic */ int f289704f;

        /* renamed from: iw2.f$a$a */
        public static final class C98822a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C98820f f289705d;

            /* renamed from: e */
            public final /* synthetic */ C98266k f289706e;

            public C98822a(C98820f fVar, C98266k kVar) {
                this.f289705d = fVar;
                this.f289706e = kVar;
            }

            public final void run() {
                Class cls = C101476o.class;
                String str = this.f289705d.f289690h;
                Log.m105924i(str, "LogStory: deleteItem fake " + this.f289706e);
                C97393p.f285894a.mo136657a(this.f289706e.f288082e.f288088a);
                String str2 = this.f289706e.f288082e.f288094g;
                C87412m.m108594g(str2, "taskId");
                Log.m105924i("MicroMsg.StoryMixManager", "run cleanNullData data");
                ((C101476o) C86312j.m106911c(cls)).mo140779XR(str2);
                String str3 = this.f289706e.f288082e.f288094g;
                C87412m.m108594g(str3, "taskId");
                Log.m105924i("MicroMsg.StoryMixManager", "run cleanUnAvailableData data");
                ((C101476o) C86312j.m106911c(cls)).uh0(str3);
            }
        }

        public C98821a(C98820f fVar, int i, int i2) {
            this.f289702d = fVar;
            this.f289703e = i;
            this.f289704f = i2;
        }

        public final void run() {
            C98820f fVar = this.f289702d;
            int i = this.f289703e;
            fVar.f289694o = i;
            fVar.f289695p = this.f289704f;
            Object obj = fVar.f289691i.get(i).get(this.f289704f);
            C87412m.m108593f(obj, "dateGalleryMap[row][column]");
            C98266k kVar = (C98266k) obj;
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99268i Yt = hVar.mo134191i().mo138667Yt(kVar.f288082e.f288088a);
            C99269j i2 = hVar.mo134191i();
            StringBuilder sb = new StringBuilder();
            sb.append(kVar.f288082e.f288088a);
            sb.append('_');
            sb.append(kVar.f288082e.f288090c);
            String sb4 = sb.toString();
            C87412m.m108594g(sb4, C66261f3.COL_LOCALID);
            i2.f291094i.add(sb4);
            if (Yt != null) {
                C98820f fVar2 = this.f289702d;
                String str = fVar2.f289690h;
                Log.m105924i(str, "LogStory: deleteItem2 storyinfo " + kVar + " deleteItemRow " + fVar2.f289694o + " deleteItemCol " + fVar2.f289695p + " localid " + kVar.f288082e.f288088a + ' ' + Yt.field_storyID);
                long j = Yt.field_storyID;
                if (j == 0) {
                    C97393p.f285894a.mo136657a(kVar.f288082e.f288088a);
                    C61926c.m72668M(new C98829g(true, fVar2));
                } else if (!(fVar2.f289694o == -1 || fVar2.f289695p == -1)) {
                    C97393p.f285894a.mo136658b(j, kVar.f288082e.f288088a);
                }
            }
            if (kVar.f288082e.mo137567a()) {
                hVar.mo134194l().post(new C98822a(this.f289702d, kVar));
            }
        }
    }

    /* renamed from: iw2.f$b */
    public static final class C98823b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98820f f289707d;

        /* renamed from: e */
        public final /* synthetic */ int f289708e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98823b(C98820f fVar, int i) {
            super(0);
            this.f289707d = fVar;
            this.f289708e = i;
        }

        public Object invoke() {
            this.f289707d.f289689g.mo134400h(this.f289708e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.f$c */
    public static final class C98824c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98820f f289709d;

        /* renamed from: e */
        public final /* synthetic */ int f289710e;

        /* renamed from: f */
        public final /* synthetic */ List<C98266k> f289711f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98824c(C98820f fVar, int i, List<C98266k> list) {
            super(0);
            this.f289709d = fVar;
            this.f289710e = i;
            this.f289711f = list;
        }

        public Object invoke() {
            this.f289709d.f289689g.mo134399g(this.f289710e, this.f289711f);
            this.f289709d.f289689g.mo134403k(this.f289710e);
            this.f289709d.f289689g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.f$d */
    public static final class C98825d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98820f f289712d;

        /* renamed from: e */
        public final /* synthetic */ int f289713e;

        public C98825d(C98820f fVar, int i) {
            this.f289712d = fVar;
            this.f289713e = i;
        }

        public final void run() {
            if (this.f289712d.f289692j.get(this.f289713e).f289798a != 2) {
                this.f289712d.f289693n.add(Integer.valueOf(this.f289713e));
            }
        }
    }

    /* renamed from: iw2.f$e */
    public static final class C98826e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98820f f289714d;

        /* renamed from: e */
        public final /* synthetic */ int f289715e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98826e(C98820f fVar, int i) {
            super(0);
            this.f289714d = fVar;
            this.f289715e = i;
        }

        public Object invoke() {
            this.f289714d.f289689g.mo134400h(this.f289715e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.f$f */
    public static final class C98827f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98820f f289716d;

        /* renamed from: e */
        public final /* synthetic */ boolean f289717e;

        /* renamed from: f */
        public final /* synthetic */ boolean f289718f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98827f(C98820f fVar, boolean z, boolean z2) {
            super(0);
            this.f289716d = fVar;
            this.f289717e = z;
            this.f289718f = z2;
        }

        public Object invoke() {
            this.f289716d.f289689g.mo134394b(this.f289717e, this.f289718f);
            return C13598b0.f38549a;
        }
    }

    public C98820f(String str, List list, C98858n nVar, int i, int i2, C8480h hVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "dateList");
        C87412m.m108594g(nVar, "galleryUserCallback");
        this.f289687e = str;
        this.f289688f = list;
        this.f289689g = nVar;
        this.f289699t = Util.isEqual(StoryCore.f281736t.mo134187e(), str);
        nVar.mo134393a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String str3 = this.f289690h;
            Log.m105924i(str3, "LogStory: " + str2);
            this.f289691i.add(new ArrayList());
            this.f289692j.add(new C98860o(str2));
        }
        if (this.f289699t) {
            C86709a0.m107529k().f251779b.mo123455a(764, this);
        }
        C97758b.f286820d.mo137087a(this.f289701v);
        this.f289700u = C103109c.f304232b.mo108963a();
    }

    /* renamed from: a */
    public void mo138190a(int i, int i2) {
        this.f289694o = -1;
        this.f289695p = -1;
        C86709a0.m107529k().f251779b.mo123457c(764);
    }

    /* renamed from: c */
    public void mo138191c(int i, int i2) {
        String str = this.f289690h;
        Log.m105924i(str, "LogStory: deleteItem " + i);
        if (i >= 0 && i < this.f289691i.size() && i2 >= 0 && i2 < this.f289691i.get(i).size()) {
            StoryCore.f281736t.mo134194l().post(new C98821a(this, i, i2));
        }
    }

    /* renamed from: d */
    public void mo138192d() {
        if (this.f289699t) {
            C86709a0.m107529k().f251779b.mo123470p(764, this);
        }
        C97758b.f286820d.mo137095j(this.f289701v);
    }

    /* renamed from: f */
    public void mo138193f() {
        int i = 0;
        int i2 = 0;
        for (T next : this.f289688f) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str = (String) next;
                this.f289692j.get(i2).f289798a = 1;
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String str2 = this.f289687e;
        C87412m.m108594g(str2, "username");
        ArrayList arrayList = new ArrayList();
        StoryCore.C96337h hVar = StoryCore.f281736t;
        Iterator<C99268i> it = hVar.mo134191i().mo138671kD(str2, Util.isEqual(str2, hVar.mo134187e())).iterator();
        while (it.hasNext()) {
            C99268i next2 = it.next();
            pc4 p2 = next2.mo138657p2();
            sb4 sb4 = p2.f299136h;
            if (!(sb4 == null || sb4.f299398e.size() == 0)) {
                arrayList.add(new C98266k(next2, next2.mo138657p2(), C98267l.NORMAL));
                Log.m105924i("MicroMsg.Gallery.GalleryController", "getFavGalleryItemsFromDb story username " + str2 + ' ' + arrayList.size() + " content " + p2.f299136h.f299398e.get(0).f297963h + " and " + p2.f299136h.f299398e.get(0).f297961f + " id:" + next2.field_storyID + " storyUsername: " + next2.field_userName);
            }
        }
        if (arrayList.size() > 0) {
            Iterator it4 = arrayList.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                Object next3 = it4.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C98266k kVar = (C98266k) next3;
                    if (i4 < this.f289691i.size()) {
                        this.f289691i.get(i4).add(kVar);
                    }
                    i4 = i5;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String str3 = this.f289690h;
            Log.m105924i(str3, "LogStory: preload Db data " + arrayList.size());
        } else {
            Log.m105924i(this.f289690h, "LogStory: initLoad no data");
        }
        for (T next4 : this.f289688f) {
            int i6 = i + 1;
            if (i >= 0) {
                String str4 = (String) next4;
                if (this.f289691i.size() > i) {
                    ArrayList<C98266k> arrayList2 = this.f289691i.get(i);
                    C87412m.m108593f(arrayList2, "dateGalleryMap[index]");
                    mo138199n(i, arrayList2);
                }
                i = i6;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: g */
    public void mo138194g(int i) {
        this.f289698s = i;
        if (i == 1 && !this.f289700u) {
            StoryCore.f281736t.mo134194l().post(new C98843j(this));
        }
    }

    /* renamed from: h */
    public void mo138195h(int i, int i2, boolean z) {
        if (i != 3) {
            return;
        }
        if (!z) {
            StoryCore.f281736t.mo134194l().post(new C98840i(this));
        } else if (i2 == 0) {
            StoryCore.f281736t.mo134194l().post(new C98847k(this));
        } else if (i2 == 1) {
            StoryCore.f281736t.mo134194l().post(new C98840i(this));
        }
    }

    /* renamed from: i */
    public void mo138196i(int i, int i2) {
        String str = this.f289690h;
        Log.m105918d(str, "onSelected row=" + i + " column=" + i2);
        this.f289696q = i;
        this.f289697r = i2;
        if (this.f289698s == 1) {
            StoryCore.f281736t.mo134194l().post(new C98843j(this));
        }
        StoryCore.f281736t.mo134194l().post(new C98825d(this, i));
    }

    /* renamed from: l */
    public void mo138197l(int i, int i2, boolean z, C99268i iVar) {
        int i3 = i;
        int i4 = i2;
        Log.m105924i(this.f289690h, "LogStory: setFavorite " + i4);
        if (i3 >= 0 && i3 < this.f289688f.size() && i4 >= 0 && i4 < this.f289691i.get(i3).size()) {
            boolean z2 = !z;
            Object obj = this.f289691i.get(i3).get(i4);
            C87412m.m108593f(obj, "dateGalleryMap[row][column]");
            C98266k kVar = (C98266k) obj;
            Log.m105924i(this.f289690h, "LogStory: setFavorite storyinfo " + kVar + " localid " + kVar.f288082e.f288088a + " targetFavorite:" + z2);
            C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt((int) kVar.f288078a.systemRowid);
            if (Yt != null) {
                if (z2) {
                    C115669n.INSTANCE.mo175913w(1045, 0, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1045, 1, 1);
                }
                C99069d.m129023f(C99069d.f290418a, z2 ? 1 : 2, String.valueOf(Yt.field_storyID), 0, 0, 0, 28, (Object) null);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(Long.valueOf(Yt.field_storyID));
                arrayList2.add(Integer.valueOf((int) Yt.systemRowid));
                C97393p.f285894a.mo136662f(arrayList, arrayList2, z2);
            }
        }
    }

    /* renamed from: m */
    public void mo138198m(int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        Log.m105924i(this.f289690h, "LogStory: setPrivacy row:" + i3 + " column:" + i4);
        if (i3 >= 0 && i3 < this.f289688f.size() && i4 >= 0 && i4 < this.f289691i.get(i3).size()) {
            boolean z2 = !z;
            Object obj = this.f289691i.get(i3).get(i4);
            C87412m.m108593f(obj, "dateGalleryMap[row][column]");
            C98266k kVar = (C98266k) obj;
            Log.m105924i(this.f289690h, "LogStory: setPrivacy storyinfo " + kVar + " targetPrivacy:" + z2);
            C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt((int) kVar.f288078a.systemRowid);
            if (Yt != null) {
                if (z2) {
                    C115669n.INSTANCE.mo175913w(1045, 2, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1045, 3, 1);
                }
                C99069d.m129023f(C99069d.f290418a, z2 ? 3 : 4, String.valueOf(Yt.field_storyID), 0, 0, 0, 28, (Object) null);
                C97393p.f285894a.mo136663g(Yt.field_storyID, (int) Yt.systemRowid, z2, Yt.mo138658q2());
            }
        }
    }

    /* renamed from: n */
    public final void mo138199n(int i, List<C98266k> list) {
        if (list.isEmpty()) {
            C24564k0.m30737a(this.f289691i).remove(list);
            C61926c.m72668M(new C98823b(this, i));
            return;
        }
        C61926c.m72668M(new C98824c(this, i, list));
    }

    /* renamed from: o */
    public final void mo138200o(boolean z, ArrayList<C98266k> arrayList, boolean z2) {
        if (!z && arrayList != null) {
            int indexOf = this.f289691i.indexOf(arrayList);
            this.f289691i.remove(arrayList);
            C61926c.m72668M(new C98826e(this, indexOf));
        }
        C61926c.m72668M(new C98827f(this, z, z2));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C45456e eVar;
        C45454a j1;
        ArrayList<C98266k> arrayList;
        Object obj;
        boolean z;
        boolean z2;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        Log.m105924i(this.f289690h, "LogStory: " + i + ' ' + i2 + ' ' + str);
        if ((yVar instanceof C45456e) && (j1 = eVar.mo70944j1()) != null) {
            boolean z3 = false;
            boolean z4 = true;
            if (j1 instanceof C45467j) {
                if (i2 == 0) {
                    for (Number intValue : eVar.f123035e) {
                        C97393p.f285894a.mo136657a(intValue.intValue());
                    }
                }
                if (i2 == 0) {
                    z3 = true;
                }
                C61926c.m72668M(new C98829g(z3, this));
            } else if (j1 instanceof C45468k) {
                Log.m105924i(this.f289690h, "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + i + ", errcode:" + i2);
                if (i2 == 0) {
                    for (Number intValue2 : eVar.f123035e) {
                        int intValue3 = intValue2.intValue();
                        int i3 = ((C45468k) j1).f123064c;
                        Log.m105918d("MicroMsg.StoryInfoStorageLogic", "setPrivacyLocal story item: " + intValue3 + " to " + i3);
                        C99269j i4 = StoryCore.f281736t.mo134191i();
                        C99268i Yt = i4.mo138667Yt(intValue3);
                        if (Yt != null) {
                            if (i3 == 1) {
                                Yt.mo138653l2(4);
                            } else {
                                Yt.mo138659r2(4);
                            }
                            i4.replace(Yt);
                        }
                    }
                    C45468k kVar = (C45468k) j1;
                    if (kVar.f123064c == 1 && !kVar.f123065d) {
                        z3 = true;
                    }
                    C61926c.m72668M(new C98838h(this, z3));
                }
            } else if (!(j1 instanceof C45466i)) {
            } else {
                if (i2 == 0) {
                    for (Number intValue4 : (eVar = (C45456e) yVar).f123035e) {
                        int intValue5 = intValue4.intValue();
                        String str2 = this.f289690h;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onSceneEnd update story favorite: errType ");
                        sb.append(i);
                        sb.append(", errcode ");
                        sb.append(i2);
                        sb.append(", localId ");
                        sb.append(intValue5);
                        sb.append(", favorite:");
                        C45466i iVar = (C45466i) j1;
                        sb.append(iVar.f123063c);
                        Log.m105924i(str2, sb.toString());
                        C97393p.f285894a.mo136661e(intValue5, iVar.f123063c);
                        Iterator<ArrayList<C98266k>> it = this.f289691i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                arrayList = null;
                                break;
                            }
                            arrayList = it.next();
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it4.next();
                                if (((int) ((C98266k) obj).f288078a.systemRowid) == intValue5) {
                                    z2 = true;
                                    continue;
                                } else {
                                    z2 = false;
                                    continue;
                                }
                                if (z2) {
                                    break;
                                }
                            }
                            if (obj != null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        mo138200o(iVar.f123063c == 1, arrayList, true);
                    }
                } else if (i2 == 324) {
                    if (((C45466i) j1).f123063c != 1) {
                        z4 = false;
                    }
                    mo138200o(z4, (ArrayList<C98266k>) null, false);
                }
            }
        }
    }
}
