package com.tencent.p014mm.plugin.finder.preload;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import cm1.C0740i2;
import cm1.C55015f1;
import cm1.C55018j0;
import co1.C55048e;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import e03.C58469b;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import eo1.C58637a;
import eo1.C58638b;
import eo1.C58658f;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kf1.C9833k9;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C64689rq2;
import up1.C37521f;
import wp1.C66167g;

@C113200q(initialMode = 2)
/* renamed from: com.tencent.mm.plugin.finder.preload.MediaPreloadCore */
public final class MediaPreloadCore extends UIComponent {

    /* renamed from: p */
    public static boolean f160304p = ((Boolean) C37521f.f99350a1.mo60266n()).booleanValue();

    /* renamed from: d */
    public final MediaPreloadCore$videoDownloadProgressChangeListener$1 f160305d = new MediaPreloadCore$videoDownloadProgressChangeListener$1(this, C40008f.f107254d);

    /* renamed from: e */
    public final C13601g f160306e = C36568h.m40985a(C56184c.f160316d);

    /* renamed from: f */
    public final C58638b f160307f;

    /* renamed from: g */
    public final C58637a f160308g;

    /* renamed from: h */
    public boolean f160309h;

    /* renamed from: i */
    public int f160310i;

    /* renamed from: j */
    public String f160311j;

    /* renamed from: n */
    public FeedData f160312n;

    /* renamed from: o */
    public final MMHandler f160313o;

    /* renamed from: com.tencent.mm.plugin.finder.preload.MediaPreloadCore$b */
    public static final class C3377b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<FinderObject> f15876d;

        /* renamed from: e */
        public final /* synthetic */ MediaPreloadCore f15877e;

        /* renamed from: f */
        public final /* synthetic */ int f15878f;

        /* renamed from: g */
        public final /* synthetic */ int f15879g;

        public C3377b(List<? extends FinderObject> list, MediaPreloadCore mediaPreloadCore, int i, int i2) {
            this.f15876d = list;
            this.f15877e = mediaPreloadCore;
            this.f15878f = i;
            this.f15879g = i2;
        }

        public final void run() {
            List<FinderObject> list = this.f15876d;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (FinderObject a : list) {
                C55018j0 j0Var = new C55018j0(FinderItem.Companion.mo79056a(a, 0));
                arrayList.add(new C13604l(j0Var, j0Var.mo3513o().getMediaList()));
            }
            C13604l lVar = (C13604l) C110818d0.m150916N(arrayList);
            if (lVar != null) {
                MediaPreloadCore mediaPreloadCore = this.f15877e;
                int i = this.f15878f;
                int i2 = this.f15879g;
                C58638b bVar = mediaPreloadCore.f160307f;
                if (bVar != null) {
                    C58469b bVar2 = r5;
                    C58469b bVar3 = new C58469b(1, -1, i, 4, 0, (String) null, i2, 48, (C8480h) null);
                    bVar.mo83526h(bVar2, FeedData.Companion.mo78883a((BaseFinderFeed) lVar.f38555d), C110818d0.m150900B0(arrayList), 0);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.preload.MediaPreloadCore$a */
    public final class C56183a extends C58555d {

        /* renamed from: g */
        public final DataBuffer<C0740i2> f160314g;

        /* renamed from: h */
        public final /* synthetic */ MediaPreloadCore f160315h;

        public C56183a(MediaPreloadCore mediaPreloadCore, DataBuffer<C0740i2> dataBuffer) {
            C87412m.m108594g(dataBuffer, "dataList");
            this.f160315h = mediaPreloadCore;
            this.f160314g = dataBuffer;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            LinkedList linkedList;
            FinderItem o;
            LinkedList<C64689rq2> mediaList;
            C87412m.m108594g(bVar, "ev");
            if (bVar instanceof C7642k) {
                C7642k kVar = (C7642k) bVar;
                FeedData feedData = kVar.f25960k;
                int i = kVar.f25951b;
                if (feedData != null) {
                    FeedData feedData2 = this.f160315h.f160312n;
                    FeedData feedData3 = (feedData2 != null && (feedData.getId() > feedData2.getId() ? 1 : (feedData.getId() == feedData2.getId() ? 0 : -1)) == 0) ^ true ? feedData : null;
                    if (feedData3 != null) {
                        MediaPreloadCore mediaPreloadCore = this.f160315h;
                        int totalSize = this.f160314g.getTotalSize();
                        ArrayList arrayList = new ArrayList(totalSize);
                        for (int i2 = 0; i2 < totalSize; i2++) {
                            C0740i2 i2Var = this.f160314g.get(i2);
                            if (i2Var instanceof BaseFinderFeed) {
                                LinkedList linkedList2 = new LinkedList();
                                C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(FeedData.Companion.mo78883a((BaseFinderFeed) i2Var).getMediaList());
                                if (rq22 != null) {
                                    linkedList2.add(rq22);
                                    linkedList = linkedList2;
                                } else {
                                    linkedList = linkedList2;
                                }
                            } else if (i2Var instanceof C9833k9) {
                                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) C110818d0.m150916N(((C9833k9) i2Var).f30389f);
                                linkedList = (baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || (mediaList = o.getMediaList()) == null) ? new LinkedList() : C110818d0.m150900B0(mediaList);
                            } else {
                                linkedList = new LinkedList();
                            }
                            arrayList.add(new C13604l(i2Var, C110818d0.m150900B0(linkedList)));
                        }
                        mediaPreloadCore.f160313o.post(new C56185a(mediaPreloadCore, feedData, arrayList, i, this));
                        mediaPreloadCore.f160312n = feedData3;
                    }
                }
            }
        }

        /* renamed from: C1 */
        public void mo2332C1() {
            MediaPreloadCore mediaPreloadCore = this.f160315h;
            C58637a aVar = mediaPreloadCore.f160308g;
            C58638b bVar = mediaPreloadCore.f160307f;
            if (bVar != null) {
                bVar.f167875d = true;
                bVar.mo83523e();
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
            if (!(bVar instanceof C7642k)) {
                return false;
            }
            int i = ((C7642k) bVar).f25951b;
            return i == 6 || i == 7 || i == 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.preload.MediaPreloadCore$c */
    public static final class C56184c extends C87413o implements C32224a<C55048e> {

        /* renamed from: d */
        public static final C56184c f160316d = new C56184c();

        public C56184c() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0();
        }
    }

    static {
        C37521f.f99374d.getClass();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaPreloadCore(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f fVar = C37521f.f99374d;
        C58637a aVar = null;
        this.f160307f = fVar.mo61173a0() ? new C58638b(mo78442c3(), "core") : null;
        this.f160308g = fVar.mo61172Z() ? new C58637a() : aVar;
        this.f160311j = "";
        this.f160313o = new MMHandler("FinderMediaPreloadCore");
    }

    /* renamed from: c3 */
    public final C55048e mo78442c3() {
        return (C55048e) this.f160306e.getValue();
    }

    /* renamed from: d3 */
    public final void mo78443d3(String str, boolean z) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("Finder.MediaPreloadCore", "[onMediaFocusDownload] mediaId=" + str + " isFocused=" + z);
        boolean z2 = true;
        if (mo78442c3().f154555j >= 0 && mo78442c3().f154554i >= 0) {
            if (z) {
                mo78447i3("onMediaFocusDownload#" + str);
            } else {
                mo78446g3("onMediaFocusDownload#" + str);
                z2 = false;
            }
            this.f160309h = z2;
        }
        C58638b bVar = this.f160307f;
        if (bVar != null) {
            bVar.mo83524f(str, z);
        }
    }

    /* renamed from: e3 */
    public final void mo78444e3(String str, boolean z) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("Finder.MediaPreloadCore", "[onMediaFocusForTP] mediaId=" + str + " isFocused=" + z);
        if (z) {
            this.f160311j = str;
        }
        C58637a aVar = this.f160308g;
        C58638b bVar = this.f160307f;
        if (bVar != null) {
            bVar.mo83524f(str, z);
        }
    }

    /* renamed from: f3 */
    public final void mo78445f3(String str, int i, int i2) {
        C87412m.m108594g(str, "mediaId");
        if (mo78442c3().f154555j >= 0 && mo78442c3().f154554i >= 0) {
            C55015f1 c = C66167g.f190173a.mo90234c(str, false);
            if ((mo78442c3().f154555j <= i || mo78442c3().f154554i <= c.mo76072m2()) && this.f160309h) {
                mo78446g3("startPreloadSecs=" + mo78442c3().f154555j + ", startPreloadPercent=" + mo78442c3().f154554i + " cachePercent=" + c.mo76072m2() + " cacheTime=" + i + ", timeDuration=" + i2 + ", [onOnlineCachePlaying#" + str + ']');
                this.f160309h = false;
            }
        }
    }

    /* renamed from: g3 */
    public final void mo78446g3(String str) {
        Log.m105924i("Finder.MediaPreloadCore", "[onPreloadStart] source=" + str);
        C58638b bVar = this.f160307f;
        if (bVar != null && bVar.f167882k.compareAndSet(true, false)) {
            bVar.mo83525g();
        }
    }

    /* renamed from: i3 */
    public final void mo78447i3(String str) {
        Log.m105924i("Finder.MediaPreloadCore", "[onPreloadStop] source=" + str);
        C58638b bVar = this.f160307f;
        if (bVar != null && bVar.f167882k.compareAndSet(false, true)) {
            bVar.mo83527i("resetRunningTask", new C58658f(bVar));
        }
    }

    /* renamed from: j3 */
    public final void mo78448j3(String str, int i, List<? extends FinderObject> list, int i2) {
        C87412m.m108594g(str, "invokeSource");
        C87412m.m108594g(list, "feeds");
        Log.m105924i("Finder.MediaPreloadCore", "preloadFeed" + str + ' ');
        this.f160313o.post(new C3377b(list, this, i, i2));
    }

    public void onStart() {
        super.onStart();
        if (!this.f160309h) {
            mo78446g3("Activity#onStart");
        }
        this.f160305d.alive();
    }

    public void onStop() {
        super.onStop();
        if (!this.f160309h) {
            mo78447i3("Activity#onStrop");
        }
        this.f160305d.dead();
    }
}
