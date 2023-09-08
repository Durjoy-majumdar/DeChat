package com.tencent.p014mm.plugin.sns.model;

import android.content.Context;
import android.util.Pair;
import as2.C28128e;
import b62.C92177a;
import com.tencent.p014mm.autogen.events.SnsPostFailEvent;
import com.tencent.p014mm.autogen.events.SnsRemuxTaskEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.model.C94971y0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import hd0.C98403m0;
import hs2.C60147a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;
import jr2.C88014u;
import ms2.C61578o;
import os2.C100406i0;
import os2.C100422y;
import os2.C100423z;
import p261wl.C15510f;
import p261wl.C38166b;
import p663qo.C101211h;
import p749xh.C66261f3;
import te3.C101783gu2;
import te3.C101804kv2;
import te3.C101808lv2;
import te3.C101821nv2;
import te3.C64241ar2;
import ur2.C102075b;
import vr2.C102236a0;
import xb0.C102609h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.model.p2 */
public class C94928p2 implements C88014u {

    /* renamed from: g */
    public static int f275123g;

    /* renamed from: h */
    public static final String f275124h;

    /* renamed from: a */
    public String f275125a = "";

    /* renamed from: b */
    public NetSceneSnsPost f275126b = null;

    /* renamed from: c */
    public LinkedList<Pair<String, String>> f275127c;

    /* renamed from: d */
    public final Set<C94933e> f275128d;

    /* renamed from: e */
    public C61578o f275129e;

    /* renamed from: f */
    public C94971y0.C94973b f275130f;

    /* renamed from: com.tencent.mm.plugin.sns.model.p2$a */
    public class C94929a implements C94933e {
        public C94929a(C94928p2 p2Var) {
        }

        public void onPostEnd(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.model.UploadManager$1");
            C38166b.m41755b(C94934f.class, new p2$a$$b(i, z));
            SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        }

        public void updateBackView(C100422y yVar) {
            SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.model.UploadManager$1");
            C38166b.m41755b(C94934f.class, new p2$a$$a(yVar));
            SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.p2$b */
    public class C94930b implements Runnable {
        public C94930b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$2");
            C94928p2 p2Var = C94928p2.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.UploadManager");
            p2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
            if (C94866e1.my0() == null) {
                Log.m105920e("MicroMsg.UploadManager", "workingHandler null");
                SnsMethodCalculate.markEndTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
            } else {
                if (!C94866e1.qy0()) {
                    C86709a0.m107528h();
                    if (C86709a0.m107535s().mo121147n()) {
                        C94866e1.my0().post(new C94939q2(p2Var));
                        SnsMethodCalculate.markEndTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
                    }
                }
                Log.m105920e("MicroMsg.UploadManager", "core invalid or sdcard not Available");
                SnsMethodCalculate.markEndTimeMs("checkPost", "com.tencent.mm.plugin.sns.model.UploadManager");
            }
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.UploadManager");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.p2$c */
    public class C94931c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f275132d;

        /* renamed from: e */
        public final /* synthetic */ boolean f275133e;

        public C94931c(int i, boolean z) {
            this.f275132d = i;
            this.f275133e = z;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
            if (C94866e1.qy0()) {
                Log.m105920e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
                return;
            }
            C94928p2 p2Var = C94928p2.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.UploadManager");
            Set<C94933e> set = p2Var.f275128d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.UploadManager");
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                C94933e eVar = (C94933e) it.next();
                if (eVar != null) {
                    eVar.onPostEnd(this.f275132d, this.f275133e);
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.p2$d */
    public class C94932d implements C94971y0.C94973b {
        public C94932d() {
        }

        /* renamed from: a */
        public void mo131212a(boolean z, C94971y0 y0Var) {
            SnsMethodCalculate.markStartTimeMs("onSightUpLoadEnd", "com.tencent.mm.plugin.sns.model.UploadManager$6");
            if (!z) {
                C94928p2.this.mo131192c();
            }
            SnsMethodCalculate.markEndTimeMs("onSightUpLoadEnd", "com.tencent.mm.plugin.sns.model.UploadManager$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.p2$e */
    public interface C94933e {
        void onPostEnd(int i, boolean z);

        void updateBackView(C100422y yVar);
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.p2$f */
    public interface C94934f extends C15510f {
        void onPostEnd(int i, boolean z);

        void updateBackView(C100422y yVar);
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.p2$g */
    public enum C94935g {
        STATE_ERROR,
        STATE_OK,
        STATE_FALSE
    }

    static {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("rangeCache.data");
        f275124h = sb.toString();
    }

    public C94928p2() {
        HashSet hashSet = new HashSet();
        this.f275128d = hashSet;
        hashSet.add(new C94929a(this));
        this.f275129e = new C61578o();
        this.f275130f = new C94932d();
        SnsMethodCalculate.markStartTimeMs("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        byte[] O = C86013q1.m106433O(f275124h, 0, -1);
        if (O == null) {
            SnsMethodCalculate.markEndTimeMs("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
            return;
        }
        try {
            this.f275129e = (C61578o) new C61578o().parseFrom(O);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.UploadManager", e, "", new Object[0]);
            C86013q1.m106447h(f275124h);
        }
        SnsMethodCalculate.markEndTimeMs("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: a */
    public void mo131190a(C94933e eVar) {
        SnsMethodCalculate.markStartTimeMs("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        ((HashSet) this.f275128d).add(eVar);
        int i = f275123g + 1;
        f275123g = i;
        if (i > 1) {
            SnsMethodCalculate.markEndTimeMs("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        } else {
            SnsMethodCalculate.markEndTimeMs("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
    }

    /* renamed from: b */
    public void mo131191b(SnsInfo snsInfo) {
        LinkedList<C64241ar2> linkedList;
        int i;
        SnsMethodCalculate.markStartTimeMs("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
            return;
        }
        Log.m105924i("MicroMsg.UploadManager", "cancel snsinfo " + snsInfo.getLocalid());
        C101808lv2 lv22 = null;
        try {
            lv22 = (C101808lv2) new C101808lv2().parseFrom(snsInfo.getPostBuf());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + snsInfo.getLocalid());
            mo131201l(snsInfo, 2, "mediaPostInfo parser error " + e.getMessage());
        }
        if (!(lv22 == null || (linkedList = lv22.f298747h) == null)) {
            Iterator<C64241ar2> it = linkedList.iterator();
            while (it.hasNext()) {
                C64241ar2 next = it.next();
                C94843b1 Rx0 = C94866e1.Rx0();
                int i2 = next.f182140d;
                synchronized (Rx0) {
                    SnsMethodCalculate.markStartTimeMs("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    if (((HashMap) Rx0.f274780g).containsKey(Integer.valueOf(i2))) {
                        i = ((Integer) ((HashMap) Rx0.f274780g).get(Integer.valueOf(i2))).intValue();
                        SnsMethodCalculate.markEndTimeMs("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    } else {
                        i = -1;
                        SnsMethodCalculate.markEndTimeMs("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    }
                }
                C94843b1 Rx02 = C94866e1.Rx0();
                int i3 = next.f182140d;
                synchronized (Rx02) {
                    SnsMethodCalculate.markStartTimeMs("removeReleationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    ((HashMap) Rx02.f274780g).remove(Integer.valueOf(i3));
                    SnsMethodCalculate.markEndTimeMs("removeReleationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
                Log.m105925i("MicroMsg.UploadManager", "cancel upload %d", Integer.valueOf(i));
                if (snsInfo.field_type != 15 && i >= 0) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123457c(i);
                    C94866e1.Rx0().mo130965x(next.f182140d);
                }
            }
        }
        if (C94866e1.Rx0().mo130955n(snsInfo.localid) && this.f275126b != null) {
            Log.m105924i("MicroMsg.UploadManager", "cancel post");
            NetSceneSnsPost netSceneSnsPost = this.f275126b;
            netSceneSnsPost.getClass();
            SnsMethodCalculate.markStartTimeMs("setDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            netSceneSnsPost.f274724j = true;
            SnsMethodCalculate.markEndTimeMs("setDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f275126b);
            C94866e1.Rx0().mo130964w(snsInfo.localid);
        }
        SnsInfo LL = C94866e1.Yx0().mo139800LL(snsInfo.localid);
        if (!(LL == null || LL.field_snsId == 0)) {
            C94866e1.Rx0().mo130947b(LL.field_snsId);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C94877g0(LL.field_snsId, 1));
        }
        C94866e1.Yx0().mo139814bD(snsInfo.localid);
        if (snsInfo.getTypeFlag() == 21) {
            C28128e.m38100a().mo55808d();
        }
        Log.m105918d("MicroMsg.UploadManager", "cancelPost, publish SnsPostFailEvent, snsInfoLocalId " + snsInfo.getLocalid());
        SnsPostFailEvent snsPostFailEvent = new SnsPostFailEvent();
        snsPostFailEvent.f78997d.f78998a = (long) snsInfo.localid;
        snsPostFailEvent.publish();
        SnsMethodCalculate.markEndTimeMs("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: c */
    public void mo131192c() {
        SnsMethodCalculate.markStartTimeMs("checkPostInUI", "com.tencent.mm.plugin.sns.model.UploadManager");
        Log.m105924i("MicroMsg.UploadManager", "checkPostInUI: stack=" + Util.getStack());
        C94866e1.ly0().postDelayed(new C94930b(), 1000);
        SnsMethodCalculate.markEndTimeMs("checkPostInUI", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: d */
    public int mo131193d(int i) {
        SnsMethodCalculate.markStartTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i == 1) {
            SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 1;
        } else if (i == 2) {
            SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 2;
        } else if (i == 3) {
            SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 3;
        } else if (i == 4) {
            SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 4;
        } else if (i != 76) {
            SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return -1;
        } else {
            SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 5;
        }
    }

    /* renamed from: e */
    public final C94935g mo131194e(int i, boolean z) {
        String str;
        int i2;
        int i3 = i;
        C94935g gVar = C94935g.STATE_ERROR;
        SnsMethodCalculate.markStartTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i3 == -1) {
            Log.m105920e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media doUploadSight");
            SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return gVar;
        }
        C100406i0 LL = C94866e1.ay0().mo139867LL((long) i3);
        try {
            C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
            Log.m105924i("MicroMsg.UploadManager", "state " + nv22.f298920n + " doUploadSight, serverErr:" + nv22.f298925s);
            if (nv22.f298920n == 1) {
                SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return gVar;
            } else if (C86013q1.m106451l(nv22.f298926t) == 0) {
                Log.m105924i("MicroMsg.UploadManager", "path not fileexist  " + nv22.f298926t);
                SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return gVar;
            } else if (C86013q1.m106451l(nv22.f298927u) == 0) {
                Log.m105924i("MicroMsg.UploadManager", "thumbpath not fileexist  " + nv22.f298927u);
                SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return gVar;
            } else if (nv22.f298920n == 0) {
                C94935g gVar2 = C94935g.STATE_OK;
                SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return gVar2;
            } else {
                if (C94866e1.Rx0().mo130949d(i3)) {
                    C94866e1.ay0().r50(i3, LL);
                    C94971y0 y0Var = new C94971y0(i, LL, nv22.f298926t, nv22.f298927u, this.f275130f);
                    String str2 = nv22.f298930x;
                    SnsMethodCalculate.markStartTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                    String q = C86013q1.m106456q(y0Var.f275324a);
                    if (Util.isNullOrNil(y0Var.f275331h) || y0Var.f275331h.equals(q)) {
                        C101783gu2 gu22 = y0Var.f275332i.f298911B;
                        if (gu22 == null) {
                            gu22 = new C101783gu2();
                        }
                        if (!Util.isNullOrNil(str2) && gu22.f298315n) {
                            Log.m105925i("MicroMsg.SightCdnUpload", "from skip compress, set local capture to true, appId:%s", str2);
                            gu22.f298309e = true;
                            gu22.f298316o = str2;
                            if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It() && C98403m0.m127702b(y0Var.f275324a)) {
                                Log.m105928w("MicroMsg.SightCdnUpload", "checkUpload: from skip compress share h265 video, but user do not allow to export h265");
                                gu22.f298315n = false;
                            }
                        }
                        Log.m105925i("MicroMsg.SightCdnUpload", "check upload %s %d %s %s", y0Var.f275324a, Integer.valueOf(gu22.f298310f), Boolean.valueOf(gu22.f298309e), str2);
                        C94554a c = C94555d.m119567c(y0Var.f275324a, true);
                        if (c != null) {
                            Log.m105925i("MicroMsg.SightCdnUpload", "mediaInfo: %s", c);
                            if (!Util.isNullOrNil(str2)) {
                                i2 = MultiProcessMMKV.getSingleMMKV("OpenSdkVideoTime").decodeInt(str2, C102609h.Fx0().Gx0().f267170h);
                            } else if (gu22.f298317p) {
                                i2 = C102609h.Fx0().Hx0().f267170h;
                            } else {
                                i2 = (gu22.f298309e ? C102609h.Fx0().mo142239cw() : C102609h.Fx0().Gx0()).f267170h;
                            }
                            str = "doUploadSight";
                            long j = (long) i2;
                            if (j <= 0) {
                                j = 10;
                            }
                            long j2 = (j * 1000) + 3000;
                            Log.m105925i("MicroMsg.SightCdnUpload", "maxVideoLen: %s", Long.valueOf(j2));
                            int i4 = c.f273443a;
                            if (((long) i4) >= j2) {
                                Log.m105925i("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo videoDuration: %s ", Integer.valueOf(i4));
                                y0Var.mo131301h(-2);
                                ((C94932d) y0Var.f275328e).mo131212a(false, y0Var);
                                SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                                C94935g gVar3 = C94935g.STATE_FALSE;
                                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.UploadManager");
                                return gVar3;
                            }
                        } else {
                            str = "doUploadSight";
                        }
                        if (!gu22.f298309e) {
                            y0Var.mo131299f(gu22, str2);
                            SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                        } else if (gu22.f298310f >= 3) {
                            y0Var.mo131300g();
                            SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                        } else {
                            Log.m105925i("MicroMsg.SightCdnUpload", "try need remux %d %s", 1, y0Var.f275324a);
                            SnsRemuxTaskEvent snsRemuxTaskEvent = new SnsRemuxTaskEvent();
                            snsRemuxTaskEvent.callback = new C94961v0(y0Var, snsRemuxTaskEvent, gu22, str2);
                            SnsRemuxTaskEvent.C92588a aVar = snsRemuxTaskEvent.f265181d;
                            aVar.f265187e = new C94964w0(y0Var);
                            aVar.f265183a = y0Var.f275324a;
                            aVar.f265184b = 1;
                            aVar.f265185c = gu22;
                            aVar.f265186d = new C94968x0(y0Var, gu22);
                            snsRemuxTaskEvent.asyncPublish((Executor) C94866e1.ky0());
                            SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                        }
                        C94935g gVar32 = C94935g.STATE_FALSE;
                        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.UploadManager");
                        return gVar32;
                    }
                    Log.m105921e("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo old srcmd5 %s newmd5 %s ", y0Var.f275331h, q);
                    y0Var.mo131301h(-2);
                    ((C94932d) y0Var.f275328e).mo131212a(false, y0Var);
                    SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                }
                str = "doUploadSight";
                C94935g gVar322 = C94935g.STATE_FALSE;
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.UploadManager");
                return gVar322;
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.UploadManager", "parse uploadInfo error doUploadSight");
            SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return gVar;
        }
    }

    /* renamed from: f */
    public C61578o mo131195f() {
        SnsMethodCalculate.markStartTimeMs("getRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        C61578o oVar = this.f275129e;
        SnsMethodCalculate.markEndTimeMs("getRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        return oVar;
    }

    /* renamed from: g */
    public LinkedList<Pair<String, String>> mo131196g() {
        SnsMethodCalculate.markStartTimeMs("getRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (this.f275127c == null) {
            String string = MultiProcessMMKV.getMMKV("SnsMMKV").getString("SnsMMKVUploadUrl", "");
            if (Util.isNullOrNil(string)) {
                this.f275127c = new LinkedList<>();
            } else {
                LinkedList<Pair<String, String>> stringsToLinkedListPair = Util.stringsToLinkedListPair(string.split(" "));
                this.f275127c = stringsToLinkedListPair;
                if (stringsToLinkedListPair == null) {
                    this.f275127c = new LinkedList<>();
                }
            }
        }
        LinkedList<Pair<String, String>> linkedList = this.f275127c;
        SnsMethodCalculate.markEndTimeMs("getRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
        return linkedList;
    }

    /* renamed from: h */
    public final String mo131197h() {
        SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.UploadManager");
        String str = this.f275125a;
        if (str == null || str.equals("")) {
            C86709a0.m107528h();
            this.f275125a = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        }
        String str2 = this.f275125a;
        SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.UploadManager");
        return str2;
    }

    /* renamed from: i */
    public final void mo131198i() {
        SnsMethodCalculate.markStartTimeMs("notifyChangedBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        C100422y Yt = C94866e1.Ux0().mo139909Yt(mo131197h());
        Iterator it = ((HashSet) this.f275128d).iterator();
        while (it.hasNext()) {
            C94933e eVar = (C94933e) it.next();
            if (eVar != null) {
                eVar.updateBackView(Yt);
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyChangedBg", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: j */
    public void mo131199j(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("notifyEventUI", "com.tencent.mm.plugin.sns.model.UploadManager");
        C94866e1.ly0().post(new C94931c(i, z));
        SnsMethodCalculate.markEndTimeMs("notifyEventUI", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131200k(com.tencent.p014mm.plugin.sns.storage.SnsInfo r12, int r13, int r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "processError"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "localId "
            r2.append(r3)
            java.lang.String r3 = r12.getLocalid()
            r2.append(r3)
            java.lang.String r3 = "processError "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " errMsg: "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            java.lang.String r2 = "MicroMsg.UploadManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 22
            r6 = 129(0x81, double:6.37E-322)
            r8 = 1
            r10 = 1
            r3.idkeyStat(r4, r6, r8, r10)
            java.lang.String r15 = "parse uploadInfo error"
            r3 = 0
            r4 = 7
            if (r14 != r4) goto L_0x005b
            te3.lv2 r13 = r12.getPostInfo()     // Catch:{ Exception -> 0x0057 }
            if (r13 == 0) goto L_0x0095
            r13.f298755s = r4     // Catch:{ Exception -> 0x0057 }
            byte[] r13 = r13.toByteArray()     // Catch:{ Exception -> 0x0057 }
            r12.setPostBuf(r13)     // Catch:{ Exception -> 0x0057 }
            goto L_0x0095
        L_0x0057:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            goto L_0x0095
        L_0x005b:
            if (r13 == 0) goto L_0x008c
            os2.j0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            long r6 = (long) r13
            os2.i0 r13 = r5.mo139867LL(r6)
            te3.nv2 r5 = new te3.nv2     // Catch:{ Exception -> 0x0087 }
            r5.<init>()     // Catch:{ Exception -> 0x0087 }
            byte[] r13 = r13.mo139854h()     // Catch:{ Exception -> 0x0087 }
            pe3.a r13 = r5.parseFrom(r13)     // Catch:{ Exception -> 0x0087 }
            te3.nv2 r13 = (te3.C101821nv2) r13     // Catch:{ Exception -> 0x0087 }
            int r13 = r13.f298925s     // Catch:{ Exception -> 0x0087 }
            te3.lv2 r5 = r12.getPostInfo()     // Catch:{ Exception -> 0x0088 }
            if (r5 == 0) goto L_0x0096
            r5.f298755s = r13     // Catch:{ Exception -> 0x0088 }
            byte[] r5 = r5.toByteArray()     // Catch:{ Exception -> 0x0088 }
            r12.setPostBuf(r5)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0096
        L_0x0087:
            r13 = 0
        L_0x0088:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            goto L_0x0096
        L_0x008c:
            te3.lv2 r13 = r12.getPostInfo()
            if (r13 == 0) goto L_0x0095
            int r13 = r13.f298755s
            goto L_0x0096
        L_0x0095:
            r13 = 0
        L_0x0096:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "post error "
            r15.append(r5)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r13)
            r12.setItemDie()
            os2.e0 r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r15 = r12.localid
            r13.Rv0(r15, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "processError, publish SnsPostFailEvent, snsInfoLocalId:"
            r13.append(r15)
            int r15 = r12.localid
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r13)
            if (r14 == r4) goto L_0x00df
            com.tencent.mm.autogen.events.SnsPostFailEvent r13 = new com.tencent.mm.autogen.events.SnsPostFailEvent
            r13.<init>()
            com.tencent.mm.autogen.events.SnsPostFailEvent$a r15 = r13.f78997d
            int r4 = r12.localid
            long r4 = (long) r4
            r15.f78998a = r4
            r13.publish()
        L_0x00df:
            switch(r14) {
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00f6;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00e9;
                case 7: goto L_0x00e3;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            goto L_0x0110
        L_0x00e3:
            java.lang.String r13 = "ERR_BACKGROUND_VIDEO_REMUX_FAIED"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            goto L_0x0110
        L_0x00e9:
            java.lang.String r13 = "errtle  error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            goto L_0x0110
        L_0x00ef:
            java.lang.String r13 = "pullTimeLineXml  error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            goto L_0x0110
        L_0x00f6:
            java.lang.String r13 = "arg is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            goto L_0x0110
        L_0x00fc:
            java.lang.String r13 = "local id is not in db"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            goto L_0x0110
        L_0x0103:
            java.lang.String r13 = "parser protobuf error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            goto L_0x0110
        L_0x010a:
            java.lang.String r13 = "upload find timeLine is null delete this item"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
        L_0x0110:
            int r12 = r12.localid
            r11.mo131199j(r12, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94928p2.mo131200k(com.tencent.mm.plugin.sns.storage.SnsInfo, int, int, java.lang.String):void");
    }

    /* renamed from: l */
    public void mo131201l(SnsInfo snsInfo, int i, String str) {
        SnsMethodCalculate.markStartTimeMs("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
        mo131200k(snsInfo, 0, i, str);
        SnsMethodCalculate.markEndTimeMs("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: m */
    public void mo131202m(C94933e eVar) {
        SnsMethodCalculate.markStartTimeMs("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        ((HashSet) this.f275128d).remove(eVar);
        int i = f275123g - 1;
        f275123g = i;
        if (i > 0) {
            SnsMethodCalculate.markEndTimeMs("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        } else {
            SnsMethodCalculate.markEndTimeMs("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
    }

    /* renamed from: n */
    public final void mo131203n(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("replaceFile", "com.tencent.mm.plugin.sns.model.UploadManager");
        C86013q1.m106447h(str2);
        C86013q1.m106442c(str, str2);
        SnsMethodCalculate.markEndTimeMs("replaceFile", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: o */
    public boolean mo131204o(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("setSnsBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (mo131197h() != null && !mo131197h().equals("")) {
            String str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134717L(kv22);
            String e = C94938q1.m120518e(C94866e1.m120262YO(), mo131197h());
            if (C86013q1.m106450k(str)) {
                Log.m105918d("MicroMsg.UploadManager", "bg file is exist!'");
                C86013q1.m106461v(e);
                C86013q1.m106447h(e + mo131197h() + "bg_");
                C86013q1.m106447h(e + mo131197h() + "tbg_");
                C86013q1.m106442c(str, e + mo131197h() + "bg_");
            } else {
                C86013q1.m106447h(e + mo131197h() + "bg_");
                C86013q1.m106447h(e + mo131197h() + "tbg_");
                Log.m105920e("MicroMsg.UploadManager", "bg file is not exist! wait to down it");
            }
            C94866e1.Ux0().mo139908Ow(mo131197h(), e + mo131197h() + "bg_", "");
        }
        mo131198i();
        C94945s2 s2Var = new C94945s2(7, (Context) null);
        SnsMethodCalculate.markStartTimeMs("addMedia", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        boolean z = true;
        kv22.f298702t = 1;
        s2Var.f275199f.ContentObj.f298427h.add(kv22);
        SnsMethodCalculate.markEndTimeMs("addMedia", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        s2Var.mo131227A(2);
        int i = s2Var.mo131252i();
        SnsReportHelper.f275506m0.f275531Y = i;
        if (i <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("setSnsBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        return z;
    }

    /* renamed from: p */
    public void mo131205p(FinderObject finderObject) {
        LinkedList<FinderMedia> linkedList;
        FinderMedia first;
        FinderObject finderObject2 = finderObject;
        SnsMethodCalculate.markStartTimeMs("setSnsCoverByFinder", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (mo131197h() != null && !mo131197h().equals("")) {
            String e = C94938q1.m120518e(C94866e1.m120262YO(), mo131197h());
            C86013q1.m106461v(e);
            C86013q1.m106447h(e + mo131197h() + "bg_");
            C100423z Ux0 = C94866e1.Ux0();
            String h = mo131197h();
            Ux0.getClass();
            SnsMethodCalculate.markStartTimeMs("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            C87412m.m108594g(h, "userName");
            Log.m105924i("MicroMsg.SnsCoverStorage", "updateCoverFinderInfo :" + h);
            if ((finderObject2 != null ? finderObject2.objectDesc : null) == null) {
                SnsMethodCalculate.markEndTimeMs("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                C100422y Yt = Ux0.mo139909Yt(h);
                Ux0.mo139911jo(Yt);
                ((C119157j) C119157j.f356862d).mo183870a(new C100423z.C100425b(Yt.field_localVideo, Yt.field_localThumb, Yt.field_localImage));
                Yt.field_localVideo = "";
                Yt.field_localThumb = "";
                Yt.field_localImage = "";
                FinderObjectDesc finderObjectDesc = finderObject2.objectDesc;
                Integer valueOf = finderObjectDesc != null ? Integer.valueOf(finderObjectDesc.mediaType) : null;
                if (valueOf != null && valueOf.intValue() == 2) {
                    Yt.field_type = 4;
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    Yt.field_type = 3;
                } else {
                    Yt.field_type = 0;
                }
                try {
                    Yt.field_success = false;
                    Yt.field_finderCheckTime = System.currentTimeMillis();
                    Yt.field_finderObject = finderObject.toByteArray();
                    FinderObjectDesc finderObjectDesc2 = finderObject2.objectDesc;
                    if (!(finderObjectDesc2 == null || (linkedList = finderObjectDesc2.media) == null || (first = linkedList.getFirst()) == null)) {
                        Yt.field_thumbUrl = first.thumbUrl + first.thumb_url_token;
                    }
                } catch (IOException unused) {
                }
                Ux0.mo139910bD(Yt, false);
                SnsMethodCalculate.markEndTimeMs("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        }
        mo131198i();
        String h2 = mo131197h();
        SnsMethodCalculate.markStartTimeMs("uploadFinderVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        C87412m.m108594g(h2, "userName");
        C87412m.m108594g(finderObject2, C66261f3.COL_FINDEROBJECT);
        ((C119157j) C119157j.f356862d).mo183870a(new C60147a(finderObject2, h2));
        SnsMethodCalculate.markEndTimeMs("uploadFinderVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        SnsMethodCalculate.markEndTimeMs("setSnsCoverByFinder", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: q */
    public void mo131206q(ArrayList<MediaSingleInfo> arrayList) {
        SnsMethodCalculate.markStartTimeMs("setSnsCoverByPhoto", "com.tencent.mm.plugin.sns.model.UploadManager");
        Iterator<MediaSingleInfo> it = arrayList.iterator();
        String str = "";
        String str2 = str;
        while (it.hasNext()) {
            MediaSingleInfo next = it.next();
            C92177a aVar = next.f272123d;
            if (aVar == C92177a.IMAGE) {
                str = next.f272124e;
            }
            if (aVar == C92177a.THUMB) {
                str2 = next.f272124e;
            }
        }
        Log.m105925i("MicroMsg.UploadManager", "coverPath:%s thumbPath:%s", str, str2);
        if (mo131197h() != null && !mo131197h().equals("")) {
            String e = C94938q1.m120518e(C94866e1.m120262YO(), mo131197h());
            C86013q1.m106461v(e);
            C86013q1.m106447h(e + mo131197h() + "bg_");
            String h = mo131197h();
            SnsMethodCalculate.markStartTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            String e2 = C94938q1.m120518e(C94866e1.m120262YO(), h);
            C86013q1.m106461v(e2);
            String str3 = e2 + h + "thumb_bg_";
            SnsMethodCalculate.markEndTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            String d = C94938q1.m120517d(mo131197h());
            mo131203n(str, d);
            mo131203n(str2, str3);
            C94866e1.Ux0().mo139908Ow(mo131197h(), str3, d);
        }
        mo131198i();
        SnsMethodCalculate.markStartTimeMs("uploadSnsImageCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        C94945s2 s2Var = new C94945s2(7, (Context) null);
        if (C86013q1.m106450k(str2)) {
            s2Var.mo131244a(str2, "");
        }
        if (C86013q1.m106450k(str)) {
            s2Var.mo131244a(str, "");
        }
        s2Var.mo131227A(1);
        int i = s2Var.mo131252i();
        SnsReportHelper.f275506m0.f275531Y = i;
        SnsMethodCalculate.markStartTimeMs("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        C102075b.f300589c = i;
        C102075b.f300588b = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        Log.m105924i("MicroMsg.SnsCoverUploadHelper", "uploadSnsImageCover source:" + str + "  thumb:" + str2);
        SnsMethodCalculate.markEndTimeMs("uploadSnsImageCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        SnsMethodCalculate.markEndTimeMs("setSnsCoverByPhoto", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* renamed from: r */
    public C94945s2 mo131207r(WXMediaMessage wXMediaMessage, String str, String str2, String str3) {
        int i;
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        SnsMethodCalculate.markStartTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
        Log.m105918d("MicroMsg.UploadManager", "appmsg.description " + wXMediaMessage2.description);
        Log.m105918d("MicroMsg.UploadManager", "appmsg.title " + wXMediaMessage2.title);
        WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
        int type = iMediaObject.type();
        SnsMethodCalculate.markStartTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (type != 76) {
            switch (type) {
                case 1:
                    i = 2;
                    SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    break;
                case 2:
                    i = 1;
                    SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    break;
                case 3:
                    SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    i = 4;
                    break;
                case 4:
                    SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    i = 5;
                    break;
                case 5:
                case 6:
                    SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    break;
                case 7:
                    SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    break;
                default:
                    SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    i = -1;
                    break;
            }
            i = 3;
        } else {
            i = 42;
            SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
        C94945s2 s2Var = new C94945s2(i, (Context) null);
        s2Var.mo131231E(Util.nullAs(str2, ""));
        s2Var.mo131230D(Util.nullAs(str3, ""));
        s2Var.mo131234H(5);
        Log.m105918d("MicroMsg.UploadManager", "TimeLineType " + i);
        if (i == -1) {
            Log.m105918d("MicroMsg.UploadManager", "timeLineType is invalid");
            SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
            return null;
        }
        if (!Util.isNullOrNil(str)) {
            s2Var.mo131260q(str);
        }
        s2Var.mo131267x(Util.nullAs(wXMediaMessage2.title, ""));
        s2Var.mo131266w(Util.nullAs(wXMediaMessage2.description, ""));
        switch (iMediaObject.type()) {
            case 1:
                s2Var.mo131266w("");
                s2Var.mo131260q(((WXTextObject) iMediaObject).text);
                break;
            case 2:
                WXImageObject wXImageObject = (WXImageObject) iMediaObject;
                if (!Util.isNullOrNil(wXImageObject.imageData)) {
                    if (!s2Var.mo131247d(wXImageObject.imageData, "", "")) {
                        SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                } else if (Util.isNullOrNil(wXImageObject.imagePath)) {
                    Log.m105920e("MicroMsg.UploadManager", "share img but no res is exist!");
                    SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
                } else if (!s2Var.mo131244a(wXImageObject.imagePath, "")) {
                    SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
                }
                break;
            case 3:
                WXMusicObject wXMusicObject = (WXMusicObject) iMediaObject;
                String nullAs = Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicUrl) ? wXMusicObject.musicUrl : wXMusicObject.musicLowBandUrl, "");
                String nullAs2 = Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicDataUrl) ? wXMusicObject.musicDataUrl : wXMusicObject.musicUrl, "");
                s2Var.mo131267x("");
                s2Var.mo131266w("");
                int d = mo131193d(3);
                if (d == -1) {
                    Log.m105918d("MicroMsg.UploadManager", "mediaType is invalid");
                    SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
                }
                if (!s2Var.mo131249f(wXMediaMessage2.thumbData, nullAs, Util.nullAs(!Util.isNullOrNil(wXMusicObject.musicLowBandDataUrl) ? wXMusicObject.musicLowBandDataUrl : wXMusicObject.musicLowBandUrl, ""), nullAs2, d, Util.nullAs(wXMediaMessage2.title, ""), Util.nullAs(wXMediaMessage2.description, ""), wXMusicObject.songAlbumUrl, wXMusicObject.songLyric, "")) {
                    SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
                }
                break;
            case 4:
                WXVideoObject wXVideoObject = (WXVideoObject) iMediaObject;
                s2Var.mo131267x("");
                s2Var.mo131266w("");
                int d2 = mo131193d(4);
                if (d2 == -1) {
                    Log.m105918d("MicroMsg.UploadManager", "mediaType is invalid");
                    SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
                }
                if (!s2Var.mo131249f(wXMediaMessage2.thumbData, Util.nullAs(!Util.isNullOrNil(wXVideoObject.videoUrl) ? wXVideoObject.videoUrl : wXVideoObject.videoLowBandUrl, ""), wXVideoObject.videoLowBandUrl, wXVideoObject.videoUrl, d2, Util.nullAs(wXMediaMessage2.title, ""), Util.nullAs(wXMediaMessage2.description, ""), "", "", "")) {
                    SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
                }
                break;
            case 5:
                WXWebpageObject wXWebpageObject = (WXWebpageObject) iMediaObject;
                if (!Util.isNullOrNil(wXMediaMessage2.thumbData)) {
                    s2Var.mo131247d(wXMediaMessage2.thumbData, Util.nullAs(wXMediaMessage2.description, ""), Util.nullAs(wXMediaMessage2.title, ""));
                }
                s2Var.mo131266w(wXWebpageObject.webpageUrl);
                s2Var.mo131268y(wXWebpageObject.webpageUrl);
                String str4 = wXWebpageObject.webpageUrl;
                SnsMethodCalculate.markStartTimeMs("setContentUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                s2Var.f275199f.ContentObj.f298426g = str4;
                SnsMethodCalculate.markEndTimeMs("setContentUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                s2Var.mo131259p(wXWebpageObject.canvasPageXml);
                break;
            case 6:
                Log.m105920e("MicroMsg.UploadManager", "file is not support!");
                SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                return null;
            case 7:
                WXAppExtendObject wXAppExtendObject = (WXAppExtendObject) iMediaObject;
                if (!Util.isNullOrNil(wXAppExtendObject.filePath) && wXAppExtendObject.filePath.startsWith("http")) {
                    s2Var.mo131267x(wXAppExtendObject.filePath);
                    s2Var.mo131266w(wXAppExtendObject.filePath);
                    break;
                } else {
                    Log.m105920e("MicroMsg.UploadManager", "appdata is not support!");
                    SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
                }
            default:
                Log.m105920e("MicroMsg.UploadManager", "none type not support!");
                SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                return null;
        }
        SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
        return s2Var;
    }
}
