package com.tencent.p014mm.plugin.sns.p106ui.video;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import bv2.C92318f;
import bv2.C92319g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p823sg.C77710q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.video.a */
public class C96254a {

    /* renamed from: f */
    public static C96254a f281265f;

    /* renamed from: a */
    public List<WeakReference<SnsTimelineVideoView>> f281266a = new LinkedList();

    /* renamed from: b */
    public List<SnsTimelineVideoView> f281267b = new ArrayList();

    /* renamed from: c */
    public int f281268c = 0;

    /* renamed from: d */
    public String f281269d;

    /* renamed from: e */
    public SnsTimelineVideoView f281270e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.video.a$a */
    public static class C96255a {
    }

    /* renamed from: d */
    public static synchronized C96254a m123394d() {
        C96254a aVar;
        synchronized (C96254a.class) {
            SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            if (f281265f == null) {
                f281265f = new C96254a();
            }
            aVar = f281265f;
            SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        }
        return aVar;
    }

    /* renamed from: a */
    public boolean mo133929a() {
        SnsMethodCalculate.markStartTimeMs("enableNewSmallViewType", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_timeline_enable_new_small_video_type, true);
        Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "enableNewSmallViewType %b", Boolean.valueOf(wf));
        SnsMethodCalculate.markEndTimeMs("enableNewSmallViewType", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return wf;
    }

    /* renamed from: b */
    public SnsTimelineVideoView mo133930b(String str) {
        SnsMethodCalculate.markStartTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return null;
        }
        SnsTimelineVideoView snsTimelineVideoView = this.f281270e;
        if (snsTimelineVideoView == null || !str.equals(snsTimelineVideoView.f281251K1)) {
            Iterator it = ((ArrayList) this.f281267b).iterator();
            while (it.hasNext()) {
                SnsTimelineVideoView snsTimelineVideoView2 = (SnsTimelineVideoView) it.next();
                if (str.equals(snsTimelineVideoView2.f281251K1)) {
                    SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                    return snsTimelineVideoView2;
                }
            }
            SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return null;
        }
        SnsTimelineVideoView snsTimelineVideoView3 = this.f281270e;
        SnsMethodCalculate.markEndTimeMs("findVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return snsTimelineVideoView3;
    }

    /* renamed from: c */
    public SnsTimelineVideoView mo133931c(Context context) {
        SnsMethodCalculate.markStartTimeMs("getAvailableVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        Iterator it = ((ArrayList) this.f281267b).iterator();
        SnsTimelineVideoView snsTimelineVideoView = null;
        while (it.hasNext()) {
            SnsTimelineVideoView snsTimelineVideoView2 = (SnsTimelineVideoView) it.next();
            if (snsTimelineVideoView2.f281249I1 == SnsTimelineVideoView.C96252c.AVAILABLE) {
                snsTimelineVideoView = snsTimelineVideoView2;
            }
        }
        if (snsTimelineVideoView == null) {
            if (((ArrayList) this.f281267b).size() < 3) {
                snsTimelineVideoView = new SnsTimelineVideoView(context);
                ((ArrayList) this.f281267b).add(snsTimelineVideoView);
                ((LinkedList) this.f281266a).add(new WeakReference(snsTimelineVideoView));
            } else {
                int i = -1;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < ((ArrayList) this.f281267b).size(); i2++) {
                    SnsTimelineVideoView snsTimelineVideoView3 = (SnsTimelineVideoView) ((ArrayList) this.f281267b).get(i2);
                    if (snsTimelineVideoView3.f281249I1 != SnsTimelineVideoView.C96252c.PLAYING && snsTimelineVideoView3.f281252L1 < MAlarmHandler.NEXT_FIRE_INTERVAL && !snsTimelineVideoView3.f281254N1) {
                        i = i2;
                    }
                    if (snsTimelineVideoView3.f281254N1) {
                        arrayList.add(snsTimelineVideoView3);
                    }
                }
                if (i >= 0 || arrayList.size() <= 0) {
                    List<SnsTimelineVideoView> list = this.f281267b;
                    int i3 = i < 0 ? 0 : i;
                    Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "use minIndex: %s", Integer.valueOf(i));
                    snsTimelineVideoView = (SnsTimelineVideoView) ((ArrayList) list).get(i3);
                } else {
                    SnsTimelineVideoView snsTimelineVideoView4 = (SnsTimelineVideoView) arrayList.get(0);
                    ((ArrayList) this.f281267b).remove(snsTimelineVideoView4);
                    if (snsTimelineVideoView4 != null && snsTimelineVideoView4.getParent() != null) {
                        snsTimelineVideoView4.f281255O1 = false;
                        ((ViewGroup) snsTimelineVideoView4.getParent()).removeView(snsTimelineVideoView4);
                    } else if (snsTimelineVideoView4 != null) {
                        snsTimelineVideoView4.mo133920i0();
                    }
                    snsTimelineVideoView = new SnsTimelineVideoView(context);
                    ((ArrayList) this.f281267b).add(snsTimelineVideoView);
                    ((LinkedList) this.f281266a).add(new WeakReference(snsTimelineVideoView));
                    Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "use new one, removes size:%s, first:%s", Integer.valueOf(arrayList.size()), Integer.valueOf(((SnsTimelineVideoView) arrayList.get(0)).hashCode()));
                }
            }
        }
        snsTimelineVideoView.f281249I1 = SnsTimelineVideoView.C96252c.ATTACHING;
        snsTimelineVideoView.mo132372y(false);
        Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "%s getAvailableVideoView, setState ATTACHING", Integer.valueOf(snsTimelineVideoView.hashCode()));
        SnsMethodCalculate.markEndTimeMs("getAvailableVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return snsTimelineVideoView;
    }

    /* renamed from: e */
    public boolean mo133932e(String str) {
        SnsMethodCalculate.markStartTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return false;
        }
        Iterator it = ((ArrayList) this.f281267b).iterator();
        while (it.hasNext()) {
            SnsTimelineVideoView snsTimelineVideoView = (SnsTimelineVideoView) it.next();
            if (str.equals(snsTimelineVideoView.f281251K1) && snsTimelineVideoView.f281249I1 != SnsTimelineVideoView.C96252c.AVAILABLE) {
                SnsMethodCalculate.markEndTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isAttaching", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return false;
    }

    /* renamed from: f */
    public boolean mo133933f(String str) {
        SnsMethodCalculate.markStartTimeMs("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (Util.isNullOrNil(this.f281269d) || Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return false;
        }
        boolean equals = this.f281269d.equals(str);
        SnsMethodCalculate.markEndTimeMs("isCurrentPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return equals;
    }

    /* renamed from: g */
    public final boolean mo133934g(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("needRpt", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        boolean z = false;
        if (onlineVideoView != null) {
            try {
                if (onlineVideoView.mo132371x()) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("needRpt", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        return z;
    }

    /* renamed from: h */
    public void mo133935h() {
        SnsMethodCalculate.markStartTimeMs("onUICreate", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        this.f281268c++;
        SnsMethodCalculate.markEndTimeMs("onUICreate", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    /* renamed from: i */
    public void mo133936i(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        int i = this.f281268c - 1;
        this.f281268c = i;
        Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "onUIDestroy %d", Integer.valueOf(i));
        int i2 = this.f281268c;
        if (i2 <= 0 || (activity instanceof SnsTimeLineUI) || (activity instanceof ImproveSnsTimelineUI)) {
            if (i2 > 0) {
                C115669n.INSTANCE.mo175913w(31, 4, 1);
            }
            SnsMethodCalculate.markStartTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            Log.m105924i("MicroMsg.Sns.SnsVideoViewMgr", "stopAll");
            SnsTimelineVideoView snsTimelineVideoView = this.f281270e;
            if (snsTimelineVideoView != null) {
                ((ArrayList) this.f281267b).add(snsTimelineVideoView);
            }
            if (!((ArrayList) this.f281267b).isEmpty()) {
                Iterator it = ((ArrayList) this.f281267b).iterator();
                while (it.hasNext()) {
                    SnsTimelineVideoView snsTimelineVideoView2 = (SnsTimelineVideoView) it.next();
                    if (snsTimelineVideoView2 != null && snsTimelineVideoView2.getParent() != null) {
                        snsTimelineVideoView2.f281255O1 = false;
                        ((ViewGroup) snsTimelineVideoView2.getParent()).removeView(snsTimelineVideoView2);
                    } else if (snsTimelineVideoView2 != null) {
                        snsTimelineVideoView2.mo133920i0();
                    }
                }
                ((ArrayList) this.f281267b).clear();
            }
            this.f281270e = null;
            this.f281269d = "";
            SnsMethodCalculate.markStartTimeMs("fallbackRelease", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            int i3 = 0;
            for (WeakReference<SnsTimelineVideoView> weakReference : this.f281266a) {
                SnsTimelineVideoView snsTimelineVideoView3 = (SnsTimelineVideoView) weakReference.get();
                if (snsTimelineVideoView3 != null) {
                    if (!snsTimelineVideoView3.f281256P1) {
                        i3++;
                    }
                    snsTimelineVideoView3.mo132356s();
                    ((C119157j) C119157j.f356862d).mo183875f(new C92319g(this, snsTimelineVideoView3));
                }
            }
            Log.m105929w("MicroMsg.Sns.SnsVideoViewMgr", "[fallbackRelease] releaseCount=%s allCount=%s", Integer.valueOf(i3), Integer.valueOf(((LinkedList) this.f281266a).size()));
            ((LinkedList) this.f281266a).clear();
            SnsMethodCalculate.markEndTimeMs("fallbackRelease", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        }
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    /* renamed from: j */
    public void mo133937j() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        Log.m105924i("MicroMsg.Sns.SnsVideoViewMgr", "pausePlay onUIPause");
        SnsTimelineVideoView snsTimelineVideoView = this.f281270e;
        if (snsTimelineVideoView != null) {
            boolean g = mo133934g(snsTimelineVideoView);
            this.f281270e.mo133923l0();
            if (g) {
                this.f281270e.mo133924m0();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    /* renamed from: k */
    public void mo133938k() {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        Log.m105924i("MicroMsg.Sns.SnsVideoViewMgr", "pausePlay");
        SnsTimelineVideoView snsTimelineVideoView = this.f281270e;
        if (snsTimelineVideoView != null) {
            boolean g = mo133934g(snsTimelineVideoView);
            this.f281270e.mo133922k0(true);
            if (g) {
                this.f281270e.mo133924m0();
            }
        }
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }

    /* renamed from: l */
    public void mo133939l(OnlineVideoView onlineVideoView, C92318f fVar, String str, int i, boolean z, String str2) {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        if (fVar == null) {
            Log.m105920e("MicroMsg.Sns.SnsVideoViewMgr", "startPlay without videoInfo");
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            return;
        }
        SnsTimelineVideoView snsTimelineVideoView = (SnsTimelineVideoView) onlineVideoView;
        this.f281270e = snsTimelineVideoView;
        if (snsTimelineVideoView != null) {
            snsTimelineVideoView.setVisibility(0);
        }
        Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "lxl startPlay, pos:%s, vid:%s, tlObjId:%s videoViewsSize: %s info %s", Integer.valueOf(i), fVar.f264168a.f298689d, str2, Integer.valueOf(((ArrayList) this.f281267b).size()), onlineVideoView.mo132325Q());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f281267b).iterator();
        while (it.hasNext()) {
            SnsTimelineVideoView snsTimelineVideoView2 = (SnsTimelineVideoView) it.next();
            if (snsTimelineVideoView2 != onlineVideoView) {
                if (snsTimelineVideoView2.mo132371x() || snsTimelineVideoView2.mo133919h0()) {
                    boolean g = mo133934g(snsTimelineVideoView2);
                    snsTimelineVideoView2.mo133922k0(true);
                    if (g) {
                        snsTimelineVideoView2.mo133924m0();
                    }
                    Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "%s pause ", Integer.valueOf(snsTimelineVideoView2.hashCode()));
                } else {
                    Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "%s remove isPlaying:%s, isPause:%s", Integer.valueOf(snsTimelineVideoView2.hashCode()), Boolean.valueOf(snsTimelineVideoView2.mo132371x()), Boolean.valueOf(snsTimelineVideoView2.mo133919h0()));
                    arrayList.add(snsTimelineVideoView2);
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            SnsTimelineVideoView snsTimelineVideoView3 = (SnsTimelineVideoView) it4.next();
            if (snsTimelineVideoView3.getParent() != null) {
                ((ViewGroup) snsTimelineVideoView3.getParent()).removeView(snsTimelineVideoView3);
            }
            ((ArrayList) this.f281267b).remove(snsTimelineVideoView3);
            snsTimelineVideoView3.mo133920i0();
        }
        SnsTimelineVideoView snsTimelineVideoView4 = this.f281270e;
        if (snsTimelineVideoView4.f281250J1 != null) {
            if (!Util.isEqual(str2, snsTimelineVideoView4.f281251K1) || !this.f281270e.f281250J1.f264168a.f298689d.equals(fVar.f264168a.f298689d)) {
                Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "%s played another video, destroy it", Integer.valueOf(this.f281270e.hashCode()));
                this.f281270e.mo133921j0();
            } else {
                Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "%s has been played or playing, just resume", Integer.valueOf(this.f281270e.hashCode()));
                if (!this.f281270e.mo132371x()) {
                    this.f281270e.setScene(1);
                    SnsTimelineVideoView snsTimelineVideoView5 = this.f281270e;
                    snsTimelineVideoView5.setSessionId(new C77710q(C86709a0.m107523b().mo121110g()).toString() + "_" + Util.nowMilliSecond());
                    this.f281270e.setSessionTimestamp(Util.nowMilliSecond());
                    SnsTimelineVideoView snsTimelineVideoView6 = this.f281270e;
                    snsTimelineVideoView6.setSnsId(snsTimelineVideoView6.f281250J1.f264171d);
                    SnsTimelineVideoView snsTimelineVideoView7 = this.f281270e;
                    snsTimelineVideoView7.setFilePath(C94867e2.m120295n(snsTimelineVideoView7.f281250J1.f264168a));
                }
                this.f281270e.mo130404K();
                this.f281270e.setMute(true);
                this.f281270e.mo132334a();
                SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
                return;
            }
        }
        SnsTimelineVideoView snsTimelineVideoView8 = this.f281270e;
        snsTimelineVideoView8.f281250J1 = fVar;
        snsTimelineVideoView8.f281251K1 = str2;
        snsTimelineVideoView8.f281249I1 = SnsTimelineVideoView.C96252c.PLAYING;
        snsTimelineVideoView8.f281252L1 = System.currentTimeMillis();
        Log.m105925i("MicroMsg.Sns.SnsVideoViewMgr", "%s startPlay, setState PLAYING %s", Integer.valueOf(this.f281270e.hashCode()), onlineVideoView.mo132325Q());
        this.f281269d = str2;
        this.f281270e.setMute(true);
        this.f281270e.mo132324P(fVar.f264168a, fVar.f264169b, fVar.f264170c);
        this.f281270e.mo132334a();
        this.f281270e.mo130403E();
        this.f281270e.setScene(1);
        SnsTimelineVideoView snsTimelineVideoView9 = this.f281270e;
        snsTimelineVideoView9.setSessionId(new C77710q(C86709a0.m107523b().mo121110g()).toString() + "_" + Util.nowMilliSecond());
        this.f281270e.setSessionTimestamp(Util.nowMilliSecond());
        SnsTimelineVideoView snsTimelineVideoView10 = this.f281270e;
        snsTimelineVideoView10.setSnsId(snsTimelineVideoView10.f281250J1.f264171d);
        SnsTimelineVideoView snsTimelineVideoView11 = this.f281270e;
        snsTimelineVideoView11.setFilePath(C94867e2.m120295n(snsTimelineVideoView11.f281250J1.f264168a));
        Log.m105924i("MicroMsg.Sns.SnsVideoViewMgr", "lxl normal start");
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
    }
}
