package sg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import fy3.C32229r;
import gy3.C8480h;
import hg1.C8527b;
import ik1.C8923b;
import ok1.C62042e;
import p165hr.C60106t;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64321dp2;
import te3.C64390ga1;

/* renamed from: sg1.h */
public final class C63888h implements C63881c {

    /* renamed from: a */
    public final int f181087a;

    /* renamed from: b */
    public final long f181088b;

    /* renamed from: c */
    public final int f181089c;

    /* renamed from: d */
    public final int f181090d;

    /* renamed from: e */
    public final String f181091e;

    /* renamed from: f */
    public C63880b f181092f;

    /* renamed from: g */
    public MTimerHandler f181093g;

    /* renamed from: h */
    public C64390ga1 f181094h;

    /* renamed from: i */
    public C64321dp2 f181095i;

    /* renamed from: j */
    public int f181096j;

    /* renamed from: k */
    public boolean f181097k;

    /* renamed from: l */
    public final C13601g f181098l;

    /* renamed from: m */
    public final C13601g f181099m;

    public C63888h(int i, long j, int i2, int i3, int i4, C8480h hVar) {
        i2 = (i4 & 4) != 0 ? 5 : i2;
        i3 = (i4 & 8) != 0 ? 30 : i3;
        this.f181087a = i;
        this.f181088b = j;
        this.f181089c = i2;
        this.f181090d = i3;
        this.f181091e = "LiveFreeTimeManager";
        this.f181098l = C36568h.m40985a(new C63887g(this));
        this.f181099m = C36568h.m40985a(new C63885e(this));
    }

    /* renamed from: a */
    public void mo88650a(long j, boolean z, boolean z2) {
        MTimerHandler mTimerHandler = this.f181093g;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f181097k = false;
        String str = this.f181091e;
        Log.m105924i(str, "stopTask remote liveId:" + j + ",local liveId:" + this.f181088b + ", updateInfo:" + z + ", taskOver:" + z2);
        if (z && j == this.f181088b) {
            mo88653d(z2);
        }
    }

    /* renamed from: b */
    public final void mo88651b(C64390ga1 ga12) {
        String str;
        String str2 = this.f181091e;
        if (ga12 == null) {
            str = "FinderLiveUrlOption:NULL!";
        } else {
            str = "FinderLiveUrlOption:[" + ga12.f183296e + ',' + ga12.f183298g + ']';
        }
        Log.m105924i(str2, String.valueOf(str));
        this.f181094h = ga12;
    }

    /* renamed from: c */
    public void mo88652c(C64390ga1 ga12) {
        C63880b bVar;
        this.f181095i = (C64321dp2) ((C32229r) ((C36570n) this.f181098l).getValue()).mo162I("startTask", Integer.valueOf(this.f181087a), Long.valueOf(this.f181088b), ga12);
        mo88651b(ga12);
        C64321dp2 dp22 = this.f181095i;
        this.f181096j = (dp22 != null ? dp22.f182793f : 0) - (dp22 != null ? dp22.f182792e : 0);
        if (!(dp22 == null || (bVar = this.f181092f) == null)) {
            bVar.mo79436a(dp22);
        }
        MTimerHandler mTimerHandler = this.f181093g;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = new MTimerHandler(this.f181091e + hashCode(), (MTimerHandler.CallBack) ((C36570n) this.f181099m).getValue(), true);
        this.f181093g = mTimerHandler2;
        mTimerHandler2.setLogging(false);
        MTimerHandler mTimerHandler3 = this.f181093g;
        if (mTimerHandler3 != null) {
            mTimerHandler3.startTimer(1000);
        }
        this.f181097k = true;
    }

    /* renamed from: d */
    public final void mo88653d(boolean z) {
        Class cls = C60106t.class;
        if (!z) {
            int i = this.f181087a;
            if (i == 1) {
                C8527b yx02 = ((C60106t) C86312j.m106911c(cls)).yx0();
                long j = this.f181088b;
                int i2 = this.f181096j;
                C8923b bVar = (C8923b) yx02;
                if (!bVar.f28224f) {
                    bVar.mo9437Lo();
                }
                C8923b.C8924a aVar = bVar.f28225g.get(Long.valueOf(j));
                if (aVar != null) {
                    aVar.f28227b = i2;
                } else {
                    LruCache<Long, C8923b.C8924a> lruCache = bVar.f28225g;
                    Long valueOf = Long.valueOf(j);
                    C8923b.C8924a aVar2 = r5;
                    C8923b.C8924a aVar3 = new C8923b.C8924a(j, i2, 0, 0, 0, 24, (C8480h) null);
                    C8923b.C8924a put = lruCache.put(valueOf, aVar2);
                }
                C62042e eVar = C62042e.f176370a;
                eVar.mo86998D1("FinderLiveChargeInfoStorage", "updateLiveChargeInfo " + bVar.f28225g.get(Long.valueOf(j)));
            } else if (i == 2) {
                C8527b yx03 = ((C60106t) C86312j.m106911c(cls)).yx0();
                long j2 = this.f181088b;
                int i3 = this.f181096j;
                C8923b bVar2 = (C8923b) yx03;
                if (!bVar2.f28224f) {
                    bVar2.mo9437Lo();
                }
                C8923b.C8924a aVar4 = bVar2.f28225g.get(Long.valueOf(j2));
                if (aVar4 != null) {
                    aVar4.f28228c = i3;
                } else {
                    C8923b.C8924a aVar5 = r5;
                    C8923b.C8924a aVar6 = new C8923b.C8924a(j2, 0, i3, 0, 0, 24, (C8480h) null);
                    C8923b.C8924a put2 = bVar2.f28225g.put(Long.valueOf(j2), aVar5);
                }
                C62042e eVar2 = C62042e.f176370a;
                eVar2.mo86998D1("FinderLiveChargeInfoStorage", "updateReplayChargeInfo liveId:" + j2 + ",time:" + i3 + ",cache size:" + bVar2.f28225g.size());
            }
        }
    }
}
