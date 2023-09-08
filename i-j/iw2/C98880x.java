package iw2;

import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cw2.C97393p;
import di3.C86312j;
import dw2.C45454a;
import dw2.C45456e;
import dw2.C45466i;
import dw2.C45467j;
import dw2.C45468k;
import dw2.C7521g;
import ew2.C97758b;
import f40.C86709a0;
import fy3.C32229r;
import gw2.C98266k;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
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
import sx3.C110818d0;
import sx3.C64197v;
import vl0.C90830d;
import zv2.C103109c;

/* renamed from: iw2.x */
public final class C98880x extends C98862q implements C11385n {

    /* renamed from: e */
    public final String f289855e;

    /* renamed from: f */
    public final C98858n f289856f;

    /* renamed from: g */
    public final boolean f289857g;

    /* renamed from: h */
    public final boolean f289858h;

    /* renamed from: i */
    public final ArrayList<C98266k> f289859i;

    /* renamed from: j */
    public int f289860j;

    /* renamed from: n */
    public int f289861n;

    /* renamed from: o */
    public int f289862o;

    /* renamed from: p */
    public int f289863p;

    /* renamed from: q */
    public boolean f289864q;

    /* renamed from: r */
    public boolean f289865r;

    /* renamed from: s */
    public final C32229r<Long, Boolean, String, String, C13598b0> f289866s;

    /* renamed from: iw2.x$a */
    public static final class C98881a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98266k f289867d;

        public C98881a(C98266k kVar) {
            this.f289867d = kVar;
        }

        public final void run() {
            Class cls = C101476o.class;
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: deleteItem fake " + this.f289867d);
            C97393p.f285894a.mo136657a(this.f289867d.f288082e.f288088a);
            String str = this.f289867d.f288082e.f288094g;
            C87412m.m108594g(str, "taskId");
            Log.m105924i("MicroMsg.StoryMixManager", "run cleanNullData data");
            ((C101476o) C86312j.m106911c(cls)).mo140779XR(str);
            String str2 = this.f289867d.f288082e.f288094g;
            C87412m.m108594g(str2, "taskId");
            Log.m105924i("MicroMsg.StoryMixManager", "run cleanUnAvailableData data");
            ((C101476o) C86312j.m106911c(cls)).uh0(str2);
        }
    }

    /* renamed from: iw2.x$b */
    public static final class C98882b implements C54258u {

        /* renamed from: a */
        public final /* synthetic */ C98880x f289868a;

        /* renamed from: b */
        public final /* synthetic */ List<C98266k> f289869b;

        public C98882b(C98880x xVar, List<C98266k> list) {
            this.f289868a = xVar;
            this.f289869b = list;
        }

        /* renamed from: a */
        public void mo2860a(int i, int i2) {
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "onRemoved: " + i + ' ' + i2);
            this.f289868a.f289859i.clear();
            this.f289868a.f289859i.addAll(this.f289869b);
            C98880x xVar = this.f289868a;
            xVar.f289856f.mo134399g(0, xVar.f289859i);
            this.f289868a.f289856f.mo134397e();
            this.f289868a.f289856f.mo134402j(0, i, i2);
        }

        /* renamed from: b */
        public void mo2861b(int i, int i2) {
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "onInserted: " + i + ' ' + i2);
            this.f289868a.f289859i.clear();
            this.f289868a.f289859i.addAll(this.f289869b);
            C98880x xVar = this.f289868a;
            xVar.f289856f.mo134399g(0, xVar.f289859i);
            this.f289868a.f289856f.mo134397e();
            this.f289868a.f289856f.mo134398f(0, i, i2);
        }

        /* renamed from: c */
        public void mo2862c(int i, int i2, Object obj) {
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "onChanged: " + i + ' ' + i2);
            this.f289868a.f289859i.clear();
            this.f289868a.f289859i.addAll(this.f289869b);
            C98880x xVar = this.f289868a;
            xVar.f289856f.mo134399g(0, xVar.f289859i);
            this.f289868a.f289856f.mo134397e();
            this.f289868a.f289856f.mo134396d(0, i, i2);
        }

        /* renamed from: d */
        public void mo2863d(int i, int i2) {
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "onMoved: " + i + ' ' + i2);
        }
    }

    public C98880x(String str, C98858n nVar, boolean z, boolean z2, int i, C8480h hVar) {
        z2 = (i & 8) != 0 ? false : z2;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(nVar, "galleryCallback");
        this.f289855e = str;
        this.f289856f = nVar;
        this.f289857g = z;
        this.f289858h = z2;
        this.f289859i = new ArrayList<>();
        this.f289861n = -1;
        this.f289862o = -1;
        this.f289863p = -1;
        this.f289864q = true;
        C98828f0 f0Var = new C98828f0(this);
        this.f289866s = f0Var;
        C86709a0.m107529k().f251779b.mo123455a(C90830d.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123455a(764, this);
        C97758b.f286820d.mo137087a(f0Var);
        nVar.mo134393a(1);
        this.f289865r = C103109c.f304232b.mo108963a();
    }

    /* renamed from: a */
    public void mo138190a(int i, int i2) {
        this.f289861n = -1;
        C86709a0.m107529k().f251779b.mo123457c(764);
    }

    /* renamed from: c */
    public void mo138191c(int i, int i2) {
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: deleteItem " + i2);
        if (i2 >= 0 && i2 < this.f289859i.size()) {
            this.f289861n = i2;
            C98266k kVar = this.f289859i.get(i2);
            C87412m.m108593f(kVar, "galleryItems[column]");
            C98266k kVar2 = kVar;
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: deleteItem1 storyinfo " + kVar2 + " deleteItemIndex " + this.f289861n + " localid " + kVar2.f288082e.f288088a);
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99268i Yt = hVar.mo134191i().mo138667Yt(kVar2.f288082e.f288088a);
            C99269j i3 = hVar.mo134191i();
            StringBuilder sb = new StringBuilder();
            sb.append(kVar2.f288082e.f288088a);
            sb.append('_');
            sb.append(kVar2.f288082e.f288090c);
            String sb4 = sb.toString();
            C87412m.m108594g(sb4, C66261f3.COL_LOCALID);
            i3.f291094i.add(sb4);
            if (Yt != null) {
                Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: deleteItem2 storyinfo " + kVar2 + " deleteItemIndex " + this.f289861n + " localid " + kVar2.f288082e.f288088a + ' ' + Yt.field_storyID);
                long j = Yt.field_storyID;
                if (j == 0) {
                    C97393p.f285894a.mo136657a(kVar2.f288082e.f288088a);
                    C61926c.m72668M(new C98883y(true, this));
                } else if (this.f289861n != -1) {
                    C97393p.f285894a.mo136658b(j, kVar2.f288082e.f288088a);
                }
            }
            if (kVar2.f288082e.mo137567a()) {
                hVar.mo134194l().post(new C98881a(kVar2));
            }
        }
    }

    /* renamed from: d */
    public void mo138192d() {
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: destroy");
        C86709a0.m107529k().f251779b.mo123470p(C90830d.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(764, this);
        C97758b.f286820d.mo137095j(this.f289866s);
    }

    /* renamed from: e */
    public void mo138205e(int i) {
    }

    /* renamed from: f */
    public void mo138193f() {
        ArrayList<C98266k> arrayList;
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: initLoad");
        C98266k kVar = (C98266k) C110818d0.m150917O(this.f289859i, 0);
        if (this.f289858h) {
            ArrayList<C98266k> a = C98862q.f289801d.mo138220a(this.f289855e, this.f289857g);
            arrayList = new ArrayList<>();
            int i = 0;
            for (T next : a) {
                int i2 = i + 1;
                if (i >= 0) {
                    C98266k kVar2 = (C98266k) next;
                    if (i == 0) {
                        arrayList.add(next);
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        } else {
            arrayList = C98862q.f289801d.mo138220a(this.f289855e, this.f289857g);
        }
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: preload Db count " + arrayList.size());
        C98266k kVar3 = (C98266k) C110818d0.m150917O(arrayList, 0);
        if (kVar == null || kVar3 == null || kVar.f288081d == kVar3.f288081d) {
            ArrayList<C98266k> arrayList2 = this.f289859i;
            C87412m.m108594g(arrayList2, "oldItems");
            C54248l.C54251c a2 = C54248l.m60949a(new C98861p(arrayList2, arrayList), false);
            this.f289856f.mo134399g(0, this.f289859i);
            this.f289856f.mo134397e();
            a2.mo75045a(new C98882b(this, arrayList));
        } else {
            this.f289859i.clear();
            this.f289859i.addAll(arrayList);
            this.f289856f.mo134399g(0, this.f289859i);
            this.f289856f.mo134403k(0);
            this.f289856f.mo134397e();
        }
        if (!C103109c.f304232b.mo108963a()) {
            mo138234n();
        } else if (this.f289864q) {
            this.f289864q = false;
            mo138234n();
        }
    }

    /* renamed from: g */
    public void mo138194g(int i) {
        this.f289860j = i;
        if (i != 0) {
            boolean a = C103109c.f304232b.mo108963a();
            StoryCore.f281736t.mo134194l().post(new C98812c0(this));
            if (a) {
                C97758b.f286820d.mo137099n(false, false);
            }
            if (this.f289865r != a) {
                this.f289865r = a;
                this.f289856f.mo134399g(0, this.f289859i);
                this.f289856f.mo134403k(0);
            }
        }
    }

    /* renamed from: h */
    public void mo138195h(int i, int i2, boolean z) {
        if (i != 3) {
            return;
        }
        if (!z) {
            StoryCore.f281736t.mo134194l().post(new C98809b0(this));
        } else if (i2 == 0) {
            StoryCore.f281736t.mo134194l().post(new C98816d0(this));
        } else if (i2 == 1) {
            StoryCore.f281736t.mo134194l().post(new C98809b0(this));
        }
    }

    /* renamed from: i */
    public void mo138196i(int i, int i2) {
        this.f289863p = i2;
        if (this.f289860j == 1) {
            StoryCore.f281736t.mo134194l().post(new C98812c0(this));
        }
    }

    /* renamed from: j */
    public void mo138206j() {
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: pause");
    }

    /* renamed from: k */
    public void mo138207k() {
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: resume");
        mo138193f();
    }

    /* renamed from: l */
    public void mo138197l(int i, int i2, boolean z, C99268i iVar) {
        int i3 = i2;
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: setFavorite " + i3);
        if (i3 >= 0 && i3 < this.f289859i.size()) {
            boolean z2 = !z;
            C98266k kVar = this.f289859i.get(i3);
            C87412m.m108593f(kVar, "galleryItems[column]");
            C98266k kVar2 = kVar;
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: setFavorite storyinfo " + kVar2 + " localid " + kVar2.f288082e.f288088a + " targetFavorite:" + z2);
            C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt((int) kVar2.f288078a.systemRowid);
            if (Yt != null) {
                if (z2) {
                    C115669n.INSTANCE.mo175913w(1045, 0, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1045, 1, 1);
                }
                C99069d.m129023f(C99069d.f290418a, z2 ? 1 : 2, String.valueOf(Yt.field_storyID), 1, 0, 0, 24, (Object) null);
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
        int i3 = i2;
        Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: setPrivacy " + i3);
        if (i3 >= 0 && i3 < this.f289859i.size()) {
            this.f289862o = i3;
            boolean z2 = !z;
            C98266k kVar = this.f289859i.get(i3);
            C87412m.m108593f(kVar, "galleryItems[column]");
            C98266k kVar2 = kVar;
            Log.m105924i("MicroMsg.SelfGalleryPresenter", "LogStory: setPrivacy storyinfo " + kVar2 + " setPrivacyItemIndex " + this.f289862o + " localid " + kVar2.f288082e.f288088a + " targetPrivacy:" + z2);
            C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt((int) kVar2.f288078a.systemRowid);
            if (Yt != null) {
                if (z2) {
                    C115669n.INSTANCE.mo175913w(1045, 2, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1045, 3, 1);
                }
                C99069d.m129023f(C99069d.f290418a, z2 ? 3 : 4, String.valueOf(Yt.field_storyID), 1, 0, 0, 24, (Object) null);
                C97393p.f285894a.mo136663g(Yt.field_storyID, (int) Yt.systemRowid, z2, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138234n() {
        /*
            r5 = this;
            java.util.ArrayList<gw2.k> r0 = r5.f289859i
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0010
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0010
        L_0x000e:
            r2 = 0
            goto L_0x003d
        L_0x0010:
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r0.next()
            gw2.k r1 = (gw2.C98266k) r1
            zv2.c r4 = zv2.C103109c.f304232b
            boolean r4 = r4.mo108963a()
            if (r4 == 0) goto L_0x0037
            gw2.f r1 = r1.f288083f
            boolean r4 = r1.f288072e
            if (r4 != 0) goto L_0x0035
            boolean r1 = r1.f288073f
            if (r1 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r1 = 0
            goto L_0x003b
        L_0x0035:
            r1 = 1
            goto L_0x003b
        L_0x0037:
            gw2.f r1 = r1.f288083f
            boolean r1 = r1.f288071d
        L_0x003b:
            if (r1 == 0) goto L_0x0014
        L_0x003d:
            java.util.ArrayList<gw2.k> r0 = r5.f289859i
            boolean r0 = r0.isEmpty()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "LogStory: updateCommentRead "
            r1.append(r3)
            r1.append(r2)
            r3 = 32
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.SelfGalleryPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r2 == 0) goto L_0x006d
            int r1 = r5.f289860j
            if (r1 != 0) goto L_0x0072
            ew2.b r1 = ew2.C97758b.f286820d
            r1.mo137099n(r2, r0)
            goto L_0x0072
        L_0x006d:
            ew2.b r1 = ew2.C97758b.f286820d
            r1.mo137099n(r2, r0)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iw2.C98880x.mo138234n():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C45456e eVar;
        C45454a j1;
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        StringBuilder sb = new StringBuilder();
        sb.append("LogStory: ");
        sb.append(i);
        sb.append(' ');
        sb.append(i2);
        sb.append(' ');
        String str2 = str;
        sb.append(str);
        Log.m105924i("MicroMsg.SelfGalleryPresenter", sb.toString());
        if (yVar2 instanceof C7521g) {
            ((C7521g) yVar2).getClass();
            if (Util.isEqual((String) null, this.f289855e)) {
                if (i3 == 0 || i3 == 4) {
                    mo138193f();
                    return;
                }
                return;
            }
        }
        if ((yVar2 instanceof C45456e) && (j1 = eVar.mo70944j1()) != null) {
            boolean z = false;
            if (j1 instanceof C45467j) {
                if (i4 == 0) {
                    for (Number intValue : eVar.f123035e) {
                        C97393p.f285894a.mo136657a(intValue.intValue());
                    }
                }
                if (i4 == 0) {
                    z = true;
                }
                C61926c.m72668M(new C98883y(z, this));
            } else if (j1 instanceof C45468k) {
                Log.m105924i("MicroMsg.SelfGalleryPresenter", "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + i + ", errcode:" + i2);
                if (i4 == 0) {
                    for (Number intValue2 : eVar.f123035e) {
                        int intValue3 = intValue2.intValue();
                        int i5 = ((C45468k) j1).f123064c;
                        Log.m105918d("MicroMsg.StoryInfoStorageLogic", "setPrivacyLocal story item: " + intValue3 + " to " + i5);
                        C99269j i6 = StoryCore.f281736t.mo134191i();
                        C99268i Yt = i6.mo138667Yt(intValue3);
                        if (Yt != null) {
                            if (i5 == 1) {
                                Yt.mo138653l2(4);
                            } else {
                                Yt.mo138659r2(4);
                            }
                            i6.replace(Yt);
                        }
                    }
                    C45468k kVar = (C45468k) j1;
                    C61926c.m72668M(new C98807a0(this));
                }
            } else if (!(j1 instanceof C45466i)) {
            } else {
                if (i4 == 0) {
                    for (Number intValue4 : (eVar = (C45456e) yVar2).f123035e) {
                        int intValue5 = intValue4.intValue();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onSceneEnd update story favorite: errType ");
                        sb4.append(i);
                        sb4.append(", errcode ");
                        sb4.append(i2);
                        sb4.append(", localId ");
                        sb4.append(intValue5);
                        sb4.append(", favorite:");
                        C45466i iVar = (C45466i) j1;
                        sb4.append(iVar.f123063c);
                        Log.m105924i("MicroMsg.SelfGalleryPresenter", sb4.toString());
                        C97393p.f285894a.mo136661e(intValue5, iVar.f123063c);
                    }
                    C61926c.m72668M(new C98884z(this, j1.f123026a, ((C45466i) j1).f123063c == 1, true));
                } else if (i4 == 324) {
                    C61926c.m72668M(new C98884z(this, j1.f123026a, ((C45466i) j1).f123063c == 1, false));
                }
            }
        }
    }
}
