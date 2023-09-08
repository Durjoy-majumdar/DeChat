package com.tencent.p014mm.modelcdntran;

import a11.C39478b;
import android.os.Looper;
import android.os.SystemClock;
import bp3.C104160f;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.events.MediaInfoRptEvent;
import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.OnlineVideoReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsOnlineVideoReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDownloadReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C30731d4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.XWebFeature;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$h;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import h81.C32735h;
import hd0.C98398h0;
import hd0.C98403m0;
import hd0.C98408n0;
import hd0.C98429r0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import ob0.C11385n;
import ob0.C117747y;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p509eu.C97708g;
import p663qo.C101211h;
import p663qo.C101213l;
import p682rz.C63688n;
import p753xp.C102704b;
import p823sg.C90193h;
import p867wp.C102479b;
import u13.C101938c;
import xb0.C102609h;

/* renamed from: com.tencent.mm.modelcdntran.e0 */
public class C92755e0 implements C101211h.C101212a, C11385n, C63688n {

    /* renamed from: d */
    public Queue<String> f266976d = new LinkedList();

    /* renamed from: e */
    public Map<String, C98127h> f266977e = new HashMap();

    /* renamed from: f */
    public Map<String, C98127h> f266978f = new HashMap();

    /* renamed from: g */
    public Map<String, C98127h> f266979g = new HashMap();

    /* renamed from: h */
    public Map<String, C98121d> f266980h = new HashMap();

    /* renamed from: i */
    public final MMHandler f266981i = new MMHandler(Looper.getMainLooper());

    /* renamed from: j */
    public MMHandler f266982j = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.modelcdntran.e0$a */
    public class C92756a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f266983d;

        /* renamed from: e */
        public final /* synthetic */ int f266984e;

        /* renamed from: f */
        public final /* synthetic */ int f266985f;

        public C92756a(String str, int i, int i2) {
            this.f266983d = str;
            this.f266984e = i;
            this.f266985f = i2;
        }

        public void run() {
            C98127h hVar = (C98127h) ((HashMap) C92755e0.this.f266978f).get(this.f266983d);
            if (hVar != null) {
                OnlineVideoEvent onlineVideoEvent = new OnlineVideoEvent();
                OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
                aVar.f264966a = 3;
                aVar.f264967b = 0;
                aVar.f264968c = this.f266983d;
                aVar.f264969d = this.f266984e;
                aVar.f264970e = this.f266985f;
                onlineVideoEvent.publish();
                if (this.f266984e == 0 && this.f266985f >= hVar.f287687U) {
                    C92755e0.this.mo126988l(C98429r0.m127819j(hVar.f287683S, hVar.f287703e1, hVar.f287699a1), hVar.f287687U, hVar.f287685T, hVar);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$b */
    public class C92757b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f266987d;

        /* renamed from: e */
        public final /* synthetic */ C98120c f266988e;

        /* renamed from: f */
        public final /* synthetic */ C98121d f266989f;

        public C92757b(String str, C98120c cVar, C98121d dVar) {
            this.f266987d = str;
            this.f266988e = cVar;
            this.f266989f = dVar;
        }

        public void run() {
            C98127h hVar = (C98127h) ((HashMap) C92755e0.this.f266978f).get(this.f266987d);
            if (hVar == null) {
                if (this.f266987d.contains("AdLandingGeneralVideo_")) {
                    C115669n.INSTANCE.mo175911u(1579, 11);
                    Log.m105921e("MicroMsg.OnlineVideoService", "download adLandingGeneralVideo task callback but task is null, %s, %s", this.f266987d, Integer.valueOf(C92755e0.this.hashCode()));
                }
            } else if (hVar.f287704f1 != null) {
                Log.m105925i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback", this.f266987d);
                C98120c cVar = this.f266988e;
                if (cVar != null) {
                    hVar.f287704f1.mo17917e(this.f266987d, cVar.field_finishedLength, cVar.field_toltalLength);
                    return;
                }
                C98121d dVar = this.f266989f;
                if (dVar != null) {
                    Log.m105925i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback, sceneResult.retCode:%s", this.f266987d, Integer.valueOf(dVar.field_retCode));
                    C98127h.C98128a aVar = hVar.f287704f1;
                    String str = this.f266987d;
                    C98121d dVar2 = this.f266989f;
                    aVar.mo17918g(str, dVar2.field_retCode, dVar2);
                    ((HashMap) C92755e0.this.f266978f).remove(this.f266987d);
                    if (this.f266989f.field_retCode == 0) {
                        ((HashMap) C92755e0.this.f266979g).put(hVar.field_mediaId, hVar);
                        ((HashMap) C92755e0.this.f266980h).put(hVar.field_mediaId, this.f266989f);
                    }
                }
            } else {
                C98408n0 j = C98429r0.m127819j(hVar.f287683S, hVar.f287703e1, hVar.f287699a1);
                if (j == null) {
                    Log.m105929w("MicroMsg.OnlineVideoService", "stream download video callback, but video info is null.[%s]", hVar.f287683S);
                    return;
                }
                C98124g.C98125a aVar2 = hVar.f287662f;
                if (aVar2 != null) {
                    aVar2.mo1773g0(this.f266987d, 0, this.f266988e, this.f266989f, hVar.field_onlycheckexist);
                    if (this.f266989f != null) {
                        ((HashMap) C92755e0.this.f266978f).remove(this.f266987d);
                        return;
                    }
                    return;
                }
                C98120c cVar2 = this.f266988e;
                if (cVar2 != null) {
                    long j2 = cVar2.field_finishedLength;
                    if (j2 == ((long) j.f288559f)) {
                        Log.m105924i("MicroMsg.OnlineVideoService", "stream download finish.");
                        return;
                    }
                    if (j.f288562i != 130) {
                        int i = j.f288558e;
                        if (((long) i) > j2) {
                            Log.m105929w("MicroMsg.OnlineVideoService", "set video error. db now size %d, cdn callback %d.", Integer.valueOf(i), Long.valueOf(this.f266988e.field_finishedLength));
                            return;
                        }
                    }
                    Log.m105924i("MicroMsg.OnlineVideoService", "callback progress info " + this.f266988e.field_finishedLength);
                    j.f288564k = Util.nowSecond();
                    j.f288558e = (int) this.f266988e.field_finishedLength;
                    j.f288548P = XWebFeature.INTERFACE_SHOW_HIDE;
                    C98429r0.m127808N(j);
                    OnlineVideoEvent onlineVideoEvent = new OnlineVideoEvent();
                    OnlineVideoEvent.C92538a aVar3 = onlineVideoEvent.f264965d;
                    aVar3.f264966a = 5;
                    aVar3.f264968c = this.f266987d;
                    C98120c cVar3 = this.f266988e;
                    aVar3.f264969d = (int) cVar3.field_finishedLength;
                    aVar3.f264970e = (int) cVar3.field_toltalLength;
                    onlineVideoEvent.publish();
                } else if (this.f266989f != null) {
                    Log.m105924i("MicroMsg.OnlineVideoService", "callback result info " + this.f266989f.field_retCode + ", filesize:" + this.f266989f.field_fileLength + ",recved:" + this.f266989f.field_recvedBytes);
                    C98121d dVar3 = this.f266989f;
                    int i2 = dVar3.field_retCode;
                    if (i2 != 0) {
                        if (i2 != -10012) {
                            C98429r0.m127799E(j.mo137700d());
                        }
                        C92755e0 e0Var = C92755e0.this;
                        boolean a = hVar.mo137413a();
                        int i3 = this.f266989f.field_retCode;
                        int i4 = hVar.f287689V;
                        e0Var.getClass();
                        if (a) {
                            if (i4 == 1) {
                                if (i3 == -5103059) {
                                    C115669n.INSTANCE.idkeyStat(354, 111, 1, false);
                                } else if (i3 == -5103087) {
                                    C115669n.INSTANCE.idkeyStat(354, 112, 1, false);
                                } else if (i3 == -10012) {
                                    C115669n.INSTANCE.idkeyStat(354, 113, 1, false);
                                } else {
                                    C115669n.INSTANCE.idkeyStat(354, 114, 1, false);
                                }
                            } else if (i3 == -5103059) {
                                C115669n.INSTANCE.idkeyStat(354, 116, 1, false);
                            } else if (i3 == -5103087) {
                                C115669n.INSTANCE.idkeyStat(354, 117, 1, false);
                            } else if (i3 == -10012) {
                                C115669n.INSTANCE.idkeyStat(354, 118, 1, false);
                            } else {
                                C115669n.INSTANCE.idkeyStat(354, 119, 1, false);
                            }
                            C115669n.INSTANCE.mo160131h(13836, 101, Long.valueOf(Util.nowSecond()), Integer.valueOf(i3));
                        } else {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.idkeyStat(354, 213, 1, false);
                            if (i4 == 1) {
                                nVar.idkeyStat(354, 214, 1, false);
                            } else {
                                nVar.idkeyStat(354, 215, 1, false);
                            }
                            nVar.mo160131h(13836, 201, Long.valueOf(Util.nowSecond()), Integer.valueOf(i3));
                        }
                    } else {
                        C92755e0.this.mo126988l(j, (int) dVar3.field_fileLength, hVar.f287685T, hVar);
                        ((HashMap) C92755e0.this.f266979g).put(hVar.field_mediaId, hVar);
                        ((HashMap) C92755e0.this.f266980h).put(hVar.field_mediaId, this.f266989f);
                    }
                    OnlineVideoEvent onlineVideoEvent2 = new OnlineVideoEvent();
                    OnlineVideoEvent.C92538a aVar4 = onlineVideoEvent2.f264965d;
                    aVar4.f264966a = 4;
                    aVar4.f264968c = this.f266987d;
                    aVar4.f264969d = 0;
                    C98121d dVar4 = this.f266989f;
                    aVar4.f264967b = dVar4.field_retCode;
                    aVar4.f264970e = (int) dVar4.field_fileLength;
                    onlineVideoEvent2.publish();
                    ((HashMap) C92755e0.this.f266978f).remove(this.f266987d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$c */
    public class C92758c implements Runnable {
        public C92758c() {
        }

        public void run() {
            C92755e0.this.mo126993q(true);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$d */
    public class C92759d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98127h f266992d;

        public C92759d(C98127h hVar) {
            this.f266992d = hVar;
        }

        public void run() {
            ((LinkedList) C92755e0.this.f266976d).add(this.f266992d.field_mediaId);
            Map<String, C98127h> map = C92755e0.this.f266977e;
            C98127h hVar = this.f266992d;
            ((HashMap) map).put(hVar.field_mediaId, hVar);
            C92755e0.this.mo126993q(false);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$e */
    public class C92760e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98127h f266994d;

        public C92760e(C98127h hVar) {
            this.f266994d = hVar;
        }

        public void run() {
            ((LinkedList) C92755e0.this.f266976d).add(this.f266994d.field_mediaId);
            Map<String, C98127h> map = C92755e0.this.f266977e;
            C98127h hVar = this.f266994d;
            ((HashMap) map).put(hVar.field_mediaId, hVar);
            C92755e0.this.mo126993q(false);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$f */
    public class C92761f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98127h f266996d;

        public C92761f(C98127h hVar) {
            this.f266996d = hVar;
        }

        public void run() {
            C92755e0.this.f266982j.removeCallbacksAndMessages(this.f266996d.field_mediaId);
            ((LinkedList) C92755e0.this.f266976d).add(this.f266996d.field_mediaId);
            Map<String, C98127h> map = C92755e0.this.f266977e;
            C98127h hVar = this.f266996d;
            ((HashMap) map).put(hVar.field_mediaId, hVar);
            C92755e0.this.mo126993q(false);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$g */
    public class C92762g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f266998d;

        /* renamed from: e */
        public final /* synthetic */ Object[] f266999e;

        public C92762g(String str, Object[] objArr) {
            this.f266998d = str;
            this.f266999e = objArr;
        }

        public void run() {
            C98127h hVar = (C98127h) ((HashMap) C92755e0.this.f266978f).remove(this.f266998d);
            if (hVar != null) {
                C98121d dVar = new C98121d();
                int yY = ((C101211h) C86312j.m106911c(C101211h.class)).mo140296yY(hVar.field_mediaId, dVar);
                if (yY == 0) {
                    C92755e0.this.mo126992p(this.f266999e, dVar, hVar, false);
                } else {
                    Log.m105929w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", Integer.valueOf(yY), hVar.field_mediaId);
                }
            } else {
                C98127h hVar2 = (C98127h) ((HashMap) C92755e0.this.f266979g).remove(this.f266998d);
                C98121d dVar2 = (C98121d) ((HashMap) C92755e0.this.f266980h).remove(this.f266998d);
                if (!(hVar2 == null || dVar2 == null)) {
                    C92755e0.this.mo126992p(this.f266999e, dVar2, hVar2, true);
                }
            }
            ((HashMap) C92755e0.this.f266977e).remove(this.f266998d);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$h */
    public class C92763h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267001d;

        /* renamed from: e */
        public final /* synthetic */ Object[] f267002e;

        public C92763h(String str, Object[] objArr) {
            this.f267001d = str;
            this.f267002e = objArr;
        }

        public void run() {
            C98127h hVar = (C98127h) ((HashMap) C92755e0.this.f266978f).remove(this.f267001d);
            if (hVar != null) {
                C98121d dVar = new C98121d();
                int yY = ((C101211h) C86312j.m106911c(C101211h.class)).mo140296yY(hVar.field_mediaId, dVar);
                if (yY == 0) {
                    C92755e0.this.mo126992p(this.f267002e, dVar, hVar, false);
                } else {
                    Log.m105929w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", Integer.valueOf(yY), hVar.field_mediaId);
                }
            } else {
                C98127h hVar2 = (C98127h) ((HashMap) C92755e0.this.f266979g).remove(this.f267001d);
                C98121d dVar2 = (C98121d) ((HashMap) C92755e0.this.f266980h).remove(this.f267001d);
                if (!(hVar2 == null || dVar2 == null)) {
                    C92755e0.this.mo126992p(this.f267002e, dVar2, hVar2, true);
                }
            }
            ((HashMap) C92755e0.this.f266977e).remove(this.f267001d);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$i */
    public class C92764i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267004d;

        /* renamed from: e */
        public final /* synthetic */ Object[] f267005e;

        /* renamed from: f */
        public final /* synthetic */ C63688n.C63689a f267006f;

        public C92764i(String str, Object[] objArr, C63688n.C63689a aVar) {
            this.f267004d = str;
            this.f267005e = objArr;
            this.f267006f = aVar;
        }

        public void run() {
            C98121d dVar;
            C98127h hVar = (C98127h) ((HashMap) C92755e0.this.f266978f).remove(this.f267004d);
            boolean z = true;
            int i = 0;
            if (hVar != null) {
                dVar = new C98121d();
                int yY = ((C101211h) C86312j.m106911c(C101211h.class)).mo140296yY(hVar.field_mediaId, dVar);
                if (yY == 0) {
                    C92755e0.this.mo126992p(this.f267005e, dVar, hVar, false);
                } else {
                    Log.m105929w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", Integer.valueOf(yY), hVar.field_mediaId);
                }
                i = yY;
                z = false;
            } else {
                hVar = (C98127h) ((HashMap) C92755e0.this.f266979g).remove(this.f267004d);
                dVar = (C98121d) ((HashMap) C92755e0.this.f266980h).remove(this.f267004d);
                if (!(hVar == null || dVar == null)) {
                    C92755e0.this.mo126992p(this.f267005e, dVar, hVar, true);
                }
            }
            ((HashMap) C92755e0.this.f266977e).remove(this.f267004d);
            C63688n.C63689a aVar = this.f267006f;
            if (aVar != null) {
                aVar.mo87418a(i, hVar, dVar, z);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$j */
    public class C92765j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267008d;

        /* renamed from: e */
        public final /* synthetic */ CdnLogic.VideoInfo f267009e;

        /* renamed from: f */
        public final /* synthetic */ int f267010f;

        /* renamed from: g */
        public final /* synthetic */ int f267011g;

        /* renamed from: com.tencent.mm.modelcdntran.e0$j$a */
        public class C92766a implements Runnable {
            public C92766a() {
            }

            public void run() {
                C92765j jVar = C92765j.this;
                C98127h hVar = (C98127h) ((HashMap) C92755e0.this.f266978f).get(jVar.f267008d);
                StringBuilder sb = new StringBuilder();
                sb.append("info=");
                sb.append(hVar);
                sb.append(" mediaId=");
                sb.append(C92765j.this.f267008d);
                sb.append(" info.videoCallback=");
                boolean z = true;
                sb.append(hVar != null && hVar.f287704f1 == null);
                Log.m105928w("MicroMsg.OnlineVideoService", sb.toString());
                if (hVar != null) {
                    C92765j jVar2 = C92765j.this;
                    int i = jVar2.f267010f;
                    hVar.f287694X0 = (long) i;
                    C98127h.C98128a aVar = hVar.f287704f1;
                    if (aVar != null) {
                        aVar.onMoovReady(jVar2.f267008d, (long) i, (long) jVar2.f267011g, jVar2.f267009e);
                    } else if (C98403m0.m127703c(hVar.field_fullpath)) {
                        Log.m105928w("MicroMsg.OnlineVideoService", "it is qt video, need finish all file. isPlayMode" + hVar.f287689V);
                        if (hVar.f287689V == 1) {
                            C92755e0.this.mo126990n(hVar.field_mediaId, 0, hVar.field_totalLen, 0);
                            C92755e0.this.getClass();
                            C115669n.INSTANCE.idkeyStat(354, 19, 1, false);
                        }
                    } else {
                        OnlineVideoEvent onlineVideoEvent = new OnlineVideoEvent();
                        OnlineVideoEvent.C92538a aVar2 = onlineVideoEvent.f264965d;
                        aVar2.f264966a = 1;
                        aVar2.f264967b = 0;
                        C92765j jVar3 = C92765j.this;
                        aVar2.f264968c = jVar3.f267008d;
                        aVar2.f264969d = jVar3.f267010f;
                        aVar2.f264970e = jVar3.f267011g;
                        aVar2.f264971f = hVar.f287681R;
                        if (hVar.f287669p <= 0) {
                            z = false;
                        }
                        aVar2.f264972g = z;
                        CdnLogic.VideoInfo videoInfo = jVar3.f267009e;
                        aVar2.f264973h = videoInfo.svrFlag;
                        aVar2.f264975j = videoInfo.oriVideoFormat;
                        aVar2.f264974i = videoInfo.videoFormat;
                        aVar2.f264976k = videoInfo.requestFlag;
                        aVar2.f264977l = videoInfo.videoPath;
                        onlineVideoEvent.publish();
                        C98408n0 j = C98429r0.m127819j(hVar.f287683S, hVar.f287703e1, hVar.f287699a1);
                        if (j != null) {
                            Log.m105924i("MicroMsg.OnlineVideoService", "on moov ready info: " + j.mo137700d() + " status : " + j.f288562i + " reqFlag:" + C92765j.this.f267009e.requestFlag + " svrFlag:" + C92765j.this.f267009e.svrFlag + " path:" + C92765j.this.f267009e.videoPath + ", mediaId=" + j.f288544L);
                            CdnLogic.VideoInfo videoInfo2 = C92765j.this.f267009e;
                            j.f288533A = videoInfo2.svrFlag;
                            j.f288534B = videoInfo2.videoPath;
                            C98429r0.m127808N(j);
                            int i2 = j.f288562i;
                            if (i2 != 130 && i2 != 122) {
                                C98408n0 i3 = C98429r0.m127818i(hVar.f287683S);
                                if (i3 != null) {
                                    i3.f288562i = 121;
                                    i3.f288548P = 256;
                                    C98398h0.Bx0().mo137733w(i3);
                                }
                                if (hVar.f287689V == 0) {
                                    Log.m105924i("MicroMsg.OnlineVideoService", "stop download video");
                                    C98398h0.Dx0().mo137786c();
                                    C98398h0.Dx0().mo137787d();
                                }
                            }
                        }
                    }
                } else if (C92765j.this.f267008d.contains("AdLandingGeneralVideo_")) {
                    C115669n.INSTANCE.mo175911u(1579, 12);
                    C92765j jVar4 = C92765j.this;
                    Log.m105921e("MicroMsg.OnlineVideoService", "download adLandingGeneralVideo task onMoovReady but task is null, %s, %s", jVar4.f267008d, Integer.valueOf(C92755e0.this.hashCode()));
                }
            }
        }

        public C92765j(String str, CdnLogic.VideoInfo videoInfo, int i, int i2) {
            this.f267008d = str;
            this.f267009e = videoInfo;
            this.f267010f = i;
            this.f267011g = i2;
        }

        public void run() {
            Log.m105925i("MicroMsg.OnlineVideoService", "onMoovReady mediaId[%s] info:%s", this.f267008d, this.f267009e);
            if (!Util.isNullOrNil(this.f267008d)) {
                C86709a0.m107525e().postToWorker(new C92766a());
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.e0$k */
    public class C92767k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267014d;

        /* renamed from: e */
        public final /* synthetic */ int f267015e;

        /* renamed from: f */
        public final /* synthetic */ int f267016f;

        public C92767k(String str, int i, int i2) {
            this.f267014d = str;
            this.f267015e = i;
            this.f267016f = i2;
        }

        public void run() {
            C98127h hVar = (C98127h) ((HashMap) C92755e0.this.f266978f).get(this.f267014d);
            if (hVar != null) {
                C98127h.C98128a aVar = hVar.f287704f1;
                if (aVar != null) {
                    aVar.onDataAvailable(this.f267014d, (long) this.f267015e, (long) this.f267016f);
                }
                OnlineVideoEvent onlineVideoEvent = new OnlineVideoEvent();
                OnlineVideoEvent.C92538a aVar2 = onlineVideoEvent.f264965d;
                aVar2.f264966a = 2;
                aVar2.f264967b = 0;
                aVar2.f264968c = this.f267014d;
                aVar2.f264969d = this.f267015e;
                aVar2.f264970e = this.f267016f;
                onlineVideoEvent.publish();
            }
        }
    }

    public C92755e0() {
        C86709a0.m107524d().mo123455a(379, this);
    }

    /* renamed from: a */
    public int mo17774a(String str, C98120c cVar, C98121d dVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.OnlineVideoService", "cdn callback mediaid is null.");
            return -1;
        } else if (cVar == null && dVar == null) {
            Log.m105920e("MicroMsg.OnlineVideoService", "cdn callback info all null.");
            return -2;
        } else {
            C86709a0.m107525e().postToWorker(new C92757b(str, cVar, dVar));
            return ((HashMap) this.f266978f).get(str) != null ? 1 : 0;
        }
    }

    /* renamed from: b */
    public int mo17775b(String str, int i, int i2) {
        Log.m105925i("MicroMsg.OnlineVideoService", "onDownloadToEnd. offset %d, length %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        C86709a0.m107525e().postToWorker(new C92756a(str, i, i2));
        return ((HashMap) this.f266978f).containsKey(str) ? 1 : 0;
    }

    /* renamed from: c */
    public int mo17776c(String str, int i, int i2) {
        Log.m105925i("MicroMsg.OnlineVideoService", "onDataAvailable. offset %d, length %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        C86709a0.m107525e().postToWorker(new C92767k(str, i, i2));
        return ((HashMap) this.f266978f).containsKey(str) ? 1 : 0;
    }

    /* renamed from: d */
    public int mo17777d(String str, int i, int i2, CdnLogic.VideoInfo videoInfo) {
        this.f266981i.post(new C92765j(str, videoInfo, i, i2));
        return ((HashMap) this.f266978f).containsKey(str) ? 1 : 0;
    }

    /* renamed from: e */
    public boolean mo126981e(C98127h hVar, boolean z) {
        if (hVar == null) {
            Log.m105920e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
            return false;
        } else if (Util.isNullOrNil(hVar.field_mediaId)) {
            Log.m105920e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
            return false;
        } else {
            Log.m105924i("MicroMsg.OnlineVideoService", "add download task : " + hVar.field_mediaId + " delay : " + z);
            if (hVar.field_fileId == null) {
                hVar.field_fileId = "";
            }
            if (hVar.field_aesKey == null) {
                hVar.field_aesKey = "";
            }
            hVar.f287661e = false;
            if (mo126983g(hVar.field_mediaId, (Object[]) null) || z) {
                C86709a0.m107525e().postToWorker(new C92759d(hVar));
                return true;
            }
            C86709a0.m107525e().postToWorker(new C92760e(hVar));
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo126982f(C98127h hVar) {
        if (hVar == null) {
            Log.m105920e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
            return false;
        } else if (Util.isNullOrNil(hVar.field_mediaId)) {
            Log.m105920e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
            return false;
        } else {
            Log.m105924i("MicroMsg.OnlineVideoService", "add download task : " + hVar.field_mediaId);
            if (hVar.field_fileId == null) {
                hVar.field_fileId = "";
            }
            if (hVar.field_aesKey == null) {
                hVar.field_aesKey = "";
            }
            hVar.f287661e = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                MMHandlerThread.postToMainThread(new C92761f(hVar));
                return true;
            }
            this.f266982j.removeCallbacksAndMessages(hVar.field_mediaId);
            ((LinkedList) this.f266976d).add(hVar.field_mediaId);
            ((HashMap) this.f266977e).put(hVar.field_mediaId, hVar);
            mo126993q(false);
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo126983g(String str, Object[] objArr) {
        boolean z = false;
        if (!Util.isNullOrNil(str)) {
            if (((HashMap) this.f266978f).containsKey(str)) {
                z = true;
            } else {
                ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(str);
            }
            C86709a0.m107525e().postToWorker(new C92763h(str, objArr));
        }
        Log.m105924i("MicroMsg.OnlineVideoService", "cancelDownloadTask mediaId : " + str + " remove : " + z);
        return z;
    }

    /* renamed from: h */
    public boolean mo126984h(String str, Object[] objArr) {
        boolean z;
        boolean z2 = false;
        if (!Util.isNullOrNil(str)) {
            if (((HashMap) this.f266978f).containsKey(str)) {
                z = true;
            } else {
                ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(str);
                z = false;
            }
            if (!z || Looper.myLooper() == Looper.getMainLooper()) {
                this.f266982j.removeCallbacksAndMessages(str);
                C98127h hVar = (C98127h) ((HashMap) this.f266978f).remove(str);
                if (hVar != null) {
                    C98121d dVar = new C98121d();
                    int yY = ((C101211h) C86312j.m106911c(C101211h.class)).mo140296yY(hVar.field_mediaId, dVar);
                    if (yY == 0) {
                        mo126992p(objArr, dVar, hVar, false);
                    } else {
                        Log.m105929w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", Integer.valueOf(yY), hVar.field_mediaId);
                    }
                } else {
                    C98127h hVar2 = (C98127h) ((HashMap) this.f266979g).remove(str);
                    C98121d dVar2 = (C98121d) ((HashMap) this.f266980h).remove(str);
                    if (!(hVar2 == null || dVar2 == null)) {
                        mo126992p(objArr, dVar2, hVar2, true);
                    }
                }
                ((HashMap) this.f266977e).remove(str);
            } else {
                this.f266982j.postAtTime(new C92762g(str, objArr), str, SystemClock.uptimeMillis());
            }
            z2 = z;
        }
        Log.m105924i("MicroMsg.OnlineVideoService", "cancelDownloadTaskInMainThread mediaId : " + str + " remove : " + z2);
        return z2;
    }

    /* renamed from: i */
    public boolean mo126985i(String str, Object[] objArr, C63688n.C63689a aVar) {
        boolean z = false;
        if (!Util.isNullOrNil(str)) {
            if (((HashMap) this.f266978f).containsKey(str)) {
                z = true;
            } else {
                ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(str);
            }
            C86709a0.m107525e().postToWorker(new C92764i(str, objArr, aVar));
        }
        Log.m105924i("MicroMsg.OnlineVideoService", "cancelDownloadTaskWithCallback mediaId : " + str + " remove : " + z);
        return z;
    }

    /* renamed from: j */
    public C98127h mo126986j(String str, boolean z) {
        C98408n0 i;
        String str2 = str;
        boolean z2 = z;
        if (Util.isNullOrNil(str) || (i = C98429r0.m127818i(str)) == null) {
            return null;
        }
        Map<String, String> parseXml = XmlParser.parseXml(i.mo137705i(), "msg", (String) null);
        if (parseXml == null) {
            Log.m105928w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
            return null;
        }
        String str3 = parseXml.get(".msg.videomsg.$cdnvideourl");
        if (Util.isNullOrNil(str3)) {
            Log.m105928w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
            return null;
        }
        int i2 = Util.getInt(parseXml.get(".msg.videomsg.$length"), 0);
        String str4 = parseXml.get(".msg.videomsg.$md5");
        String str5 = parseXml.get(".msg.videomsg.$aeskey");
        String str6 = parseXml.get(".msg.videomsg.$fileparam");
        String b = C1297x.m1387b("downvideo", i.f288563j, i.mo137707k(), i.mo137700d());
        if (Util.isNullOrNil(b)) {
            Log.m105929w("MicroMsg.OnlineVideoService", "cdntra genClientId failed not use cdn file:%s", i.mo137700d());
            return null;
        }
        String q = C98398h0.Bx0().mo137728q(str2);
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_OnlineVideoService_1";
        hVar.f287683S = str2;
        hVar.f287685T = str4;
        hVar.f287687U = i2;
        hVar.f287689V = z2 ? 1 : 0;
        hVar.f287693X = i.mo137701e();
        hVar.f287691W = i.mo137707k();
        hVar.f287695Y = C72996z1.m85820U5(i.mo137707k()) ? ((C39478b) C86312j.m106911c(C39478b.class)).mo62080p1(i.mo137707k()) : 0;
        hVar.field_mediaId = b;
        hVar.field_fullpath = q;
        hVar.field_fileType = 4;
        hVar.field_totalLen = i2;
        hVar.field_aesKey = str5;
        hVar.field_fileId = str3;
        hVar.field_priority = 2;
        hVar.field_wxmsgparam = str6;
        hVar.field_chattype = C72996z1.m85820U5(i.mo137707k()) ? 1 : 0;
        hVar.f287697Z = i.f288537E;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(i.mo137707k(), i.f288556c);
        z3$$h w = C75604z3.m90851w(h302.f230724G);
        hVar.f287669p = 0;
        hVar.f287670q = 0;
        hVar.f287707y0 = h302.getCreateTime();
        hVar.f287680Q0 = h302.mo108774y2();
        hVar.f287692W0 = w != null ? w.f222114u : 0;
        if (hVar.f287669p > 0) {
            C115669n.INSTANCE.idkeyStat(354, 36, 1, false);
        }
        hVar.field_autostart = false;
        hVar.field_requestVideoFormat = C102609h.wx0(z2, i);
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x036b, code lost:
        if (r4 != 2) goto L_0x0387;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0326 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0296 A[SYNTHETIC, Splitter:B:98:0x0296] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1081gi.C98127h mo126987k(com.tencent.p014mm.storage.C96983o3 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26, java.lang.String r27, int r28, long r29, java.lang.String r31) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            java.lang.Class<lc3.b> r6 = lc3.C10485b.class
            r7 = 0
            java.lang.String r8 = "MicroMsg.OnlineVideoService"
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "check can sns online video, scene is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            return r7
        L_0x0019:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r9 == 0) goto L_0x0025
            java.lang.String r0 = "check can sns online video, url is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            return r7
        L_0x0025:
            hd0.n0 r9 = hd0.C98429r0.m127819j(r3, r5, r7)
            r10 = 1
            r11 = 0
            if (r9 != 0) goto L_0x0037
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r3
            java.lang.String r1 = "check can sns online video, video info is null. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r1, r0)
            return r7
        L_0x0037:
            int r12 = r0.f284145b
            long r12 = (long) r12
            java.lang.String r14 = "snsvideo"
            java.lang.String r15 = "sns"
            java.lang.String r12 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r14, r12, r15, r5)
            r13 = 2
            java.lang.String[] r14 = new java.lang.String[r13]
            r14[r11] = r5
            r14[r10] = r12
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r14)
            java.lang.String r15 = "_"
            if (r14 != 0) goto L_0x006d
            java.lang.String r14 = "SlideFullCardAd_"
            boolean r14 = r5.contains(r14)
            if (r14 == 0) goto L_0x006d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r14.append(r15)
            r14.append(r5)
            java.lang.String r12 = r14.toString()
        L_0x006d:
            boolean r5 = android.text.TextUtils.isEmpty(r31)
            if (r5 != 0) goto L_0x0087
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            r5.append(r15)
            r12 = r31
            r5.append(r12)
            java.lang.String r12 = r5.toString()
        L_0x0087:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r5 == 0) goto L_0x0097
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r1
            java.lang.String r1 = "check can http online video, can not create media id. url %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r1, r0)
            return r7
        L_0x0097:
            gi.h r5 = new gi.h
            r5.<init>()
            java.lang.String r7 = "task_OnlineVideoService_2"
            r5.f287660d = r7
            r5.f287683S = r3
            r5.field_fullpath = r2
            r5.field_mediaId = r12
            r5.f287655L = r13
            r5.f287689V = r4
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r28)
            r3[r11] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r29)
            r3[r10] = r7
            java.lang.String r7 = "checkCanSnsOnlineVideo, enc:%s, encKey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r3)
            java.lang.String r3 = ""
            r7 = r28
            if (r7 != r10) goto L_0x00d7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r14 = r29
            r7.append(r14)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            r5.f287700b1 = r7
        L_0x00d7:
            int r7 = r9.f288537E
            r5.f287697Z = r7
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284132d
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x00e6
            java.lang.String r7 = "album_friend"
            goto L_0x0144
        L_0x00e6:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284133e
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x00f1
            java.lang.String r7 = "album_self"
            goto L_0x0144
        L_0x00f1:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284134f
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x00fc
            java.lang.String r7 = "album_stranger"
            goto L_0x0144
        L_0x00fc:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284135g
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0108
            java.lang.String r7 = "profile_friend"
            goto L_0x0144
        L_0x0108:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284136h
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0114
            java.lang.String r7 = "profile_stranger"
            goto L_0x0144
        L_0x0114:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284137i
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x011f
            java.lang.String r7 = "comment"
            goto L_0x0144
        L_0x011f:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284131c
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x012b
            java.lang.String r7 = "timeline"
            goto L_0x0144
        L_0x012b:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284140l
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0137
            java.lang.String r7 = "snssight"
            goto L_0x0144
        L_0x0137:
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284142n
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0143
            java.lang.String r7 = "storysight"
            goto L_0x0144
        L_0x0143:
            r7 = r3
        L_0x0144:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "https://"
            r9.append(r12)
            r12 = 2131831344(0x7f112a30, float:1.929571E38)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r12)
            r9.append(r12)
            java.lang.String r12 = "/?version=%d&uin=%s&nettype=%d&signal=%d%s"
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            r12 = 5
            java.lang.Object[] r14 = new java.lang.Object[r12]
            int r15 = qe3.C89625d.f257841g
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r11] = r15
            f40.C86709a0.m107528h()
            f40.e r15 = f40.C86709a0.m107523b()
            int r15 = r15.mo121110g()
            java.lang.String r15 = p823sg.C77710q.m93738a(r15)
            r14[r10] = r15
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r15 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r13] = r15
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r15 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            int r16 = r15.getCompatMixStrength()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r12 = 3
            r14[r12] = r16
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r16 != 0) goto L_0x01b0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r10 = "&scene="
            r13.append(r10)
            r13.append(r7)
            java.lang.String r10 = r13.toString()
            goto L_0x01b1
        L_0x01b0:
            r10 = r3
        L_0x01b1:
            r13 = 4
            r14[r13] = r10
            java.lang.String r9 = java.lang.String.format(r9, r14)
            r5.f287706x0 = r9
            r5.f287705p0 = r1
            k40.a r9 = f40.C86709a0.m107533q(r6)
            lc3.b r9 = (lc3.C10485b) r9
            pj.f r9 = r9.vh0()
            java.lang.String r10 = "SnsSightDomainList"
            java.lang.String r9 = r9.mo107405c(r10)
            k40.a r6 = f40.C86709a0.m107533q(r6)
            lc3.b r6 = (lc3.C10485b) r6
            pj.f r6 = r6.vh0()
            java.lang.String r10 = "SnsSightMainStandbyIpSwitchTime"
            int r6 = r6.mo107404b(r10, r11)
            long r13 = (long) r6
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r11] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r10 = 1
            r6[r10] = r9
            int r9 = r0.f284145b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 2
            r6[r10] = r9
            java.lang.String r9 = "hostvalue %s dcipTime %s scene.time[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r6)
            r8 = 0
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x01ff
            r13 = 259200(0x3f480, double:1.28062E-318)
        L_0x01ff:
            int r0 = r0.f284145b
            long r8 = (long) r0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r8)
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x020c
            r0 = 1
            goto L_0x020d
        L_0x020c:
            r0 = 0
        L_0x020d:
            r5.f287684S0 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r6 = r15.getCompatMixStrength()
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.f287686T0 = r0
            r5.f287688U0 = r7
            r6 = 5
            r5.f287696Y0 = r6
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r6 = h81.C32735h.C32737c.mmsns_video_hevc_download_and
            r7 = 1
            boolean r0 = r0.mo58784wf(r6, r7)
            if (r0 == 0) goto L_0x0398
            java.lang.String r6 = "MicroMsg.SubCoreVideoControl"
            if (r26 == 0) goto L_0x0363
            int r0 = xb0.C102609h.f302140w
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            if (r1 == 0) goto L_0x0251
            java.lang.String r0 = "svpuseh265flag=1"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0251
            r8 = 1
            goto L_0x0252
        L_0x0251:
            r8 = 0
        L_0x0252:
            if (r4 == 0) goto L_0x02de
            r9 = 1
            if (r4 == r9) goto L_0x025c
            r9 = 2
            if (r4 == r9) goto L_0x025c
            goto L_0x02de
        L_0x025c:
            r0 = 6
            boolean r9 = xb0.C102609h.m135510UY(r0)     // Catch:{ all -> 0x0277 }
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r23)     // Catch:{ all -> 0x0275 }
            if (r10 == 0) goto L_0x026e
            boolean r0 = hd0.C98403m0.m127702b(r23)     // Catch:{ all -> 0x026c }
            goto L_0x026f
        L_0x026c:
            r0 = move-exception
            goto L_0x027a
        L_0x026e:
            r0 = 0
        L_0x026f:
            r19 = r9
            r9 = r0
            r0 = r19
            goto L_0x0294
        L_0x0275:
            r0 = move-exception
            goto L_0x0279
        L_0x0277:
            r0 = move-exception
            r9 = 0
        L_0x0279:
            r10 = 0
        L_0x027a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "AdH265Helper, checkSnsAdVideoFormat, exp="
            r13.append(r14)
            java.lang.String r0 = r0.toString()
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r0 = r9
            r9 = 0
        L_0x0294:
            if (r0 != 0) goto L_0x02d4
            java.lang.String r0 = p156gj.C87203t.m108275k()     // Catch:{ all -> 0x02ba }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x02ba }
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x02ba }
            r14 = 19789(0x4d4d, float:2.773E-41)
            r15 = 5
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x02ba }
            java.lang.String r18 = "dev_disable_hevc"
            r15[r11] = r18     // Catch:{ all -> 0x02ba }
            r17 = 1
            r15[r17] = r0     // Catch:{ all -> 0x02ba }
            r16 = 2
            r15[r16] = r7     // Catch:{ all -> 0x02ba }
            r15[r12] = r7     // Catch:{ all -> 0x02ba }
            r7 = 4
            r15[r7] = r3     // Catch:{ all -> 0x02ba }
            r13.mo160131h(r14, r15)     // Catch:{ all -> 0x02ba }
            goto L_0x02d9
        L_0x02ba:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "AdH265Helper, checkSnsAdVideoFormat, report exp="
            r3.append(r7)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x02d9
        L_0x02d4:
            if (r10 != 0) goto L_0x02d7
            goto L_0x02db
        L_0x02d7:
            if (r9 != 0) goto L_0x02db
        L_0x02d9:
            r0 = 1
            goto L_0x02dc
        L_0x02db:
            r0 = 2
        L_0x02dc:
            r3 = 2
            goto L_0x02e2
        L_0x02de:
            r0 = 1
            r3 = 2
            r9 = 0
            r10 = 0
        L_0x02e2:
            if (r0 != r3) goto L_0x02e5
            r11 = 1
        L_0x02e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "AdH265Helper, checkSnsAdVideoFormat, mode="
            r3.append(r7)
            r3.append(r4)
            java.lang.String r4 = ", format="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r7 = ", isFileExists="
            r3.append(r7)
            r3.append(r10)
            java.lang.String r7 = ", isH265File="
            r3.append(r7)
            r3.append(r9)
            java.lang.String r7 = ", url="
            r3.append(r7)
            r3.append(r1)
            java.lang.String r1 = ", path="
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            if (r8 != 0) goto L_0x0324
            r0 = 1
        L_0x0324:
            if (r8 == 0) goto L_0x032a
            if (r11 == 0) goto L_0x032a
            r10 = 1
            goto L_0x032f
        L_0x032a:
            if (r8 != 0) goto L_0x032e
            r10 = 2
            goto L_0x032f
        L_0x032e:
            r10 = 3
        L_0x032f:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1579(0x62b, float:2.213E-42)
            r1.mo175911u(r2, r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AdH265Helper, report, isOnline=true, urlHasFlag="
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", cdnHasFlag="
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ", key="
            r1.append(r2)
            r1.append(r10)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r5.field_requestVideoFormat = r0
            goto L_0x0398
        L_0x0363:
            int r0 = xb0.C102609h.f302140w
            if (r4 == 0) goto L_0x0387
            r1 = 1
            if (r4 == r1) goto L_0x036e
            r1 = 2
            if (r4 == r1) goto L_0x036f
            goto L_0x0387
        L_0x036e:
            r1 = 2
        L_0x036f:
            boolean r0 = xb0.C102609h.m135510UY(r1)
            if (r0 != 0) goto L_0x0376
            goto L_0x0387
        L_0x0376:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r23)
            if (r0 != 0) goto L_0x037d
            goto L_0x0384
        L_0x037d:
            boolean r0 = hd0.C98403m0.m127702b(r23)
            if (r0 != 0) goto L_0x0384
            goto L_0x0387
        L_0x0384:
            r1 = 1
            r13 = 2
            goto L_0x0389
        L_0x0387:
            r1 = 1
            r13 = 1
        L_0x0389:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r11] = r1
            java.lang.String r1 = "check sns video format[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            r5.field_requestVideoFormat = r13
        L_0x0398:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92755e0.mo126987k(com.tencent.mm.storage.o3, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, long, java.lang.String):gi.h");
    }

    /* renamed from: l */
    public final void mo126988l(C98408n0 n0Var, int i, String str, C98127h hVar) {
        Class cls = C102704b.class;
        boolean z = true;
        Log.m105925i("MicroMsg.OnlineVideoService", "download finish. totalLen %d ", Integer.valueOf(i));
        if (n0Var != null) {
            C98429r0.m127806L(n0Var.mo137700d(), i);
            String d = n0Var.mo137700d();
            if (!Util.isNullOrNil(str)) {
                String q = C98398h0.Bx0().mo137728q(d);
                if (Util.isNullOrNil(str) || i <= 0 || Util.isNullOrNil(q)) {
                    Log.m105929w("MicroMsg.OnlineVideoService", "insert media duplication but args is error.[%d, %s, %s]", Integer.valueOf(i), str, q);
                } else {
                    ((C30731d4) ((C97708g) C86312j.m106911c(C97708g.class)).mo58053A1()).mo57629d(str, i, q);
                }
            }
        }
        if (hVar != null) {
            if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) != 1) {
                z = false;
            }
            if (z && hVar.mo137413a() && n0Var != null) {
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(n0Var.mo137707k(), n0Var.f288556c);
                String q2 = C98398h0.Bx0().mo137728q(n0Var.mo137700d());
                String r = C98398h0.Bx0().mo137729r(n0Var.mo137700d());
                if (C86013q1.m106450k(q2)) {
                    C102479b as = ((C102704b) C86312j.m106911c(cls)).mo138751as(q2, h302.getType(), hVar.field_filemd5, (byte[]) null);
                    Log.m105924i("MicroMsg.OnlineVideoService", "check c2c video recv dup, ret = " + as.f301760a);
                }
                if (C86013q1.m106450k(r)) {
                    C102479b as4 = ((C102704b) C86312j.m106911c(cls)).mo138751as(r, h302.getType(), C86013q1.m106456q(r), (byte[]) null);
                    Log.m105924i("MicroMsg.OnlineVideoService", "check c2c video thumb recv dup, ret = " + as4.f301760a);
                }
            }
        }
    }

    /* renamed from: m */
    public boolean mo126989m(String str, int i, int i2) {
        if (((C98127h) ((HashMap) this.f266978f).get(str)) == null) {
            Log.m105925i("MicroMsg.OnlineVideoService", "this media[%s] don't download now.", str);
            return false;
        }
        boolean ZJ = ((C101211h) C86312j.m106911c(C101211h.class)).mo140284ZJ(str, (long) i, (long) i2);
        Log.m105925i("MicroMsg.OnlineVideoService", "is video[%s] data[%d, %d] available[%b]", str, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(ZJ));
        return ZJ;
    }

    /* renamed from: n */
    public int mo126990n(String str, int i, int i2, int i3) {
        int bm = ((C101211h) C86312j.m106911c(C101211h.class)).mo140286bm(str, (long) i, (long) i2, i3);
        Log.m105925i("MicroMsg.OnlineVideoService", "request video video[%s], offset[%d], length[%d] duration[%d] ret[%d]", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bm));
        return bm;
    }

    /* renamed from: o */
    public void mo126991o(ABAPrams aBAPrams) {
        if (aBAPrams != null) {
            C115669n.INSTANCE.mo160131h(17891, Integer.valueOf(aBAPrams.sceneCase), Integer.valueOf(aBAPrams.inputWidth), Integer.valueOf(aBAPrams.inputHeight), Integer.valueOf(aBAPrams.inputKbps), Integer.valueOf(aBAPrams.inputFps), Integer.valueOf(aBAPrams.averageQP), Integer.valueOf(aBAPrams.averageMV), Integer.valueOf(aBAPrams.skipMode), Integer.valueOf(aBAPrams.intraMode), Integer.valueOf(aBAPrams.interMode), Integer.valueOf(aBAPrams.outputKbps), Integer.valueOf(aBAPrams.outputWidth), Integer.valueOf(aBAPrams.outputHeight), Integer.valueOf(aBAPrams.bitrateAdaptiveUP), Integer.valueOf(aBAPrams.bitrateAdaptiveDown), Integer.valueOf(aBAPrams.resolutionAdjust), Integer.valueOf(aBAPrams.SkipReadQP), Integer.valueOf(aBAPrams.consumingtime), Integer.valueOf(aBAPrams.codecID), Integer.valueOf(aBAPrams.transcosingKbps), Integer.valueOf(aBAPrams.isEnableHEVC), Integer.valueOf(aBAPrams.enableABA), Integer.valueOf(aBAPrams.use1080pC2CSNS), Integer.valueOf(aBAPrams.startTime), Integer.valueOf(aBAPrams.duration), Integer.valueOf(aBAPrams.ratiosBitrateQP), Integer.valueOf(aBAPrams.textureComplexity), Integer.valueOf(aBAPrams.qualityLevel), Integer.valueOf(aBAPrams.platform), Integer.valueOf(aBAPrams.oriAudioBitrate), Integer.valueOf(aBAPrams.oriAudioChannel), Integer.valueOf(aBAPrams.compAudioBitrate), Integer.valueOf(aBAPrams.compAudioChannel), Integer.valueOf(aBAPrams.addStickers), Integer.valueOf(aBAPrams.enableSWHEVCTrans), Integer.valueOf(aBAPrams.skipVideoCompress));
        }
    }

    public int onM3U8Ready(String str, String str2) {
        return 0;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 379) {
            Log.m105925i("MicroMsg.OnlineVideoService", "it get cdn dns success[%d, %d], try to start.", Integer.valueOf(i), Integer.valueOf(i2));
            if (C86709a0.m107523b().mo121114l()) {
                C86709a0.m107525e().postToWorker(new C92758c());
            }
        }
    }

    /* renamed from: p */
    public void mo126992p(Object[] objArr, C98121d dVar, C98127h hVar, boolean z) {
        int i;
        int i2;
        boolean z2;
        String str;
        String str2;
        Class cls;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z3;
        PInt pInt;
        PInt pInt2;
        int i35;
        String str3;
        String str4;
        String str5;
        PInt pInt3;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        long j;
        String str6;
        String str7;
        C98408n0 i46;
        Object[] objArr2 = objArr;
        C98121d dVar2 = dVar;
        C98127h hVar2 = hVar;
        Class cls2 = C75700k0.class;
        if (hVar2 == null || dVar2 == null) {
            Log.m105928w("MicroMsg.OnlineVideoService", "video task info is null or download result is null.");
            return;
        }
        if (!hVar.mo137414b() && !hVar.mo137413a()) {
            if (!(hVar2.f287655L == 6)) {
                return;
            }
        }
        String str8 = dVar2.field_clientIP;
        boolean z4 = dVar2.field_isCrossNet;
        Log.m105925i("MicroMsg.OnlineVideoService", "rpt online video format[%d] clientIp[%s] isCrossNet[%d]", Integer.valueOf(dVar2.field_videoFormat), str8, Integer.valueOf(z4 ? 1 : 0));
        if (dVar2.field_videoFormat == 2 && (i46 = C98429r0.m127818i(str7)) != null) {
            i46.f288540H = 2;
            i46.f288548P = 2;
            Log.m105925i("MicroMsg.VideoLogic", "set VideoFormat ret[%b] filename[%s] format[%d]", Boolean.valueOf(C98398h0.Bx0().mo137733w(i46)), (str7 = hVar2.f287683S), 2);
        }
        if (Util.isNullOrNil(str8)) {
            C115669n.INSTANCE.idkeyStat(354, 45, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(354, 46, 1, false);
        }
        if (dVar2.field_isCrossNet) {
            C115669n.INSTANCE.idkeyStat(354, 47, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(354, 48, 1, false);
        }
        boolean a = hVar.mo137413a();
        boolean z5 = hVar2.f287655L == 6;
        PInt pInt4 = new PInt();
        PInt pInt5 = new PInt();
        pInt5.value = 0;
        pInt4.value = 0;
        if (C98429r0.m127821l(hVar2.field_fullpath, pInt4, pInt5)) {
            int i47 = pInt4.value * 1000;
            int i48 = pInt5.value;
            if (objArr2 == null || objArr2.length <= 6) {
                cls = cls2;
                z2 = z5;
                str2 = "";
                str = str2;
                i9 = 0;
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                i4 = ((Integer) objArr2[0]).intValue() * 1000;
                int intValue = ((Integer) objArr2[1]).intValue();
                int intValue2 = ((Integer) objArr2[2]).intValue();
                int intValue3 = ((Integer) objArr2[3]).intValue();
                int intValue4 = ((Integer) objArr2[4]).intValue();
                int intValue5 = ((Integer) objArr2[5]).intValue();
                i7 = ((Integer) objArr2[6]).intValue();
                if (z5 || a || objArr2.length <= 10) {
                    i6 = intValue;
                    i5 = intValue3;
                    i9 = intValue5;
                    i2 = 0;
                    i = 0;
                    cls = cls2;
                    str = "";
                    i8 = intValue2;
                    str2 = str;
                } else {
                    i2 = ((Integer) objArr2[7]).intValue();
                    i6 = intValue;
                    i9 = intValue5;
                    i = ((Long) objArr2[9]).intValue();
                    cls = cls2;
                    i8 = intValue2;
                    str2 = (String) objArr2[8];
                    i5 = intValue3;
                    str = "";
                }
                i3 = intValue4;
                z2 = z5;
            }
            int i49 = hVar2.f287697Z;
            if (i49 <= 0) {
                i49 = a ? 10 : 31;
            }
            boolean z6 = z4;
            int iOSNetType = NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
            String str9 = str8;
            String a2 = dVar.mo137408a();
            PInt pInt6 = new PInt();
            int i54 = i48;
            PInt pInt7 = new PInt();
            int i55 = i7;
            String str10 = hVar2.f287683S;
            int i56 = i9;
            int i57 = hVar2.f287692W0;
            int i58 = i49;
            int i59 = iOSNetType;
            C98408n0 j2 = C98429r0.m127819j(str10, hVar2.f287703e1, hVar2.f287699a1);
            if (j2 != null) {
                i15 = j2.f288539G;
                i16 = j2.f288559f;
            } else {
                i16 = 0;
                i15 = 0;
            }
            if (i57 <= 0) {
                i17 = i3;
                i19 = 1;
                i18 = 2;
            } else {
                i17 = i3;
                int i64 = (int) ((((float) i57) / 100.0f) * ((float) i16));
                int i65 = i15 < i64 ? 2 : 3;
                i18 = 2;
                Log.m105919d("MicroMsg.OnlineVideoService", "getPreloadVideoInfo %d * %d = configSize[%d] preloadSize[%d]", Integer.valueOf(i57), Integer.valueOf(i16), Integer.valueOf(i64), Integer.valueOf(i15));
                i19 = i65;
            }
            pInt6.value = i15;
            pInt7.value = i19;
            Object[] objArr3 = new Object[i18];
            objArr3[0] = Integer.valueOf(pInt6.value);
            objArr3[1] = Integer.valueOf(pInt7.value);
            Log.m105919d("MicroMsg.OnlineVideoService", "getPreloadVideoInfo pHadPreloadSize[%d] pHadPreloadCompletion[%d]", objArr3);
            StringBuffer stringBuffer = new StringBuffer();
            if (a) {
                stringBuffer.append(hVar2.field_fileId);
                stringBuffer.append(",");
                stringBuffer.append(hVar2.field_aesKey);
                stringBuffer.append(",");
            } else {
                stringBuffer.append(hVar2.f287705p0);
                stringBuffer.append(",");
                stringBuffer.append(0);
                stringBuffer.append(",");
            }
            PInt pInt8 = pInt7;
            stringBuffer.append(dVar2.field_fileLength);
            stringBuffer.append(",");
            stringBuffer.append(i47);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_recvedBytes);
            stringBuffer.append(",");
            stringBuffer.append(i4 + ",");
            stringBuffer.append(i6 + ",");
            stringBuffer.append(i8 + ",");
            stringBuffer.append(i5 + ",");
            stringBuffer.append(i17 + ",");
            int i66 = i59;
            stringBuffer.append(i66);
            stringBuffer.append(",");
            stringBuffer.append(i58);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_startTime);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_endTime);
            stringBuffer.append(",");
            if (a) {
                String str11 = hVar2.f287691W;
                stringBuffer.append(str11 != null ? C90193h.m112878f(str11.getBytes()) : 0);
                stringBuffer.append(",");
                stringBuffer.append(C72996z1.m85820U5(hVar2.f287691W) ? 1 : 0);
                stringBuffer.append(",");
            } else {
                stringBuffer.append(0);
                stringBuffer.append(",");
                stringBuffer.append(dVar2.field_httpStatusCode);
                stringBuffer.append(",");
            }
            stringBuffer.append(dVar2.field_retCode);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_enQueueTime);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_firstRequestCost);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_firstRequestSize);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_firstRequestDownloadSize);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_firstRequestCompleted ? 1 : 0);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_averageSpeed);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_averageConnectCost);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_firstConnectCost);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_netConnectTimes);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_moovRequestTimes);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_moovCost);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_moovSize);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_moovCompleted ? 1 : 0);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.field_moovFailReason);
            stringBuffer.append(",");
            int i67 = i56;
            stringBuffer.append(i67);
            stringBuffer.append(",");
            int i68 = i55;
            stringBuffer.append(i68);
            stringBuffer.append(",");
            if (a) {
                i26 = i67;
                i27 = i54;
                stringBuffer.append(i27);
                stringBuffer.append(",");
                i25 = i66;
            } else {
                i26 = i67;
                i27 = i54;
                stringBuffer.append(i27);
                stringBuffer.append(",");
                i25 = i66;
                String str12 = hVar2.f287691W;
                stringBuffer.append(str12 != null ? C90193h.m112878f(str12.getBytes()) : 0);
                stringBuffer.append(",");
            }
            String str13 = a2;
            stringBuffer.append(str13);
            stringBuffer.append(",");
            if (a) {
                i29 = i27;
                i28 = i68;
                stringBuffer.append(hVar2.f287707y0);
                stringBuffer.append(",");
                stringBuffer.append(hVar2.f287680Q0);
                stringBuffer.append(",");
                stringBuffer.append(hVar2.f287669p);
                stringBuffer.append(",");
                stringBuffer.append(dVar2.field_videoFormat);
                stringBuffer.append(",");
            } else {
                i29 = i27;
                i28 = i68;
                stringBuffer.append(C101938c.m134167a(hVar2.f287682R0));
                stringBuffer.append(",");
            }
            stringBuffer.append(str9);
            stringBuffer.append(",");
            stringBuffer.append(z6 ? 1 : 0);
            stringBuffer.append(",");
            stringBuffer.append(hVar2.f287694X0);
            stringBuffer.append(",");
            stringBuffer.append(pInt6.value);
            stringBuffer.append(",");
            stringBuffer.append(pInt8.value);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.f287618j);
            stringBuffer.append(",");
            stringBuffer.append(dVar2.f287619k);
            int i69 = 13570;
            int i74 = a ? 13570 : 13790;
            if (!z2) {
                i69 = i74;
            }
            String stringBuffer2 = stringBuffer.toString();
            Log.m105925i("MicroMsg.OnlineVideoService", "report online video %d:%s", Integer.valueOf(i69), stringBuffer2);
            if (a) {
                new OnlineVideoReportStruct(stringBuffer2).mo86054n();
                pInt = pInt6;
                pInt2 = pInt8;
                z3 = a;
                i35 = i25;
            } else {
                z3 = a;
                String str14 = str13;
                if (z2) {
                    Object[] objArr4 = objArr;
                    int i75 = i26;
                    if (objArr4 == null || objArr4.length < 11) {
                        str5 = "MicroMsg.OnlineVideoService";
                        pInt = pInt6;
                        str4 = "VideoCdnMsg";
                        pInt3 = pInt8;
                        str3 = "SnsVideoFlag";
                        str6 = str;
                        j = 0;
                        i45 = 0;
                        i44 = 0;
                        i39 = 0;
                        i38 = 0;
                        i37 = 0;
                        i36 = 0;
                    } else {
                        int i76 = Util.getInt(objArr4[7].toString(), 0);
                        Util.getInt(objArr4[8].toString(), 0);
                        int i77 = Util.getInt(objArr4[9].toString(), 0);
                        objArr4[10].toString();
                        String obj = objArr4[11].toString();
                        int i78 = i76;
                        int i79 = Util.getInt(objArr4[12].toString(), 0);
                        str5 = "MicroMsg.OnlineVideoService";
                        pInt = pInt6;
                        long j3 = Util.getLong(objArr4[13].toString(), 0);
                        int i84 = Util.getInt(objArr4[14].toString(), 0);
                        i38 = Util.getInt(objArr4[15].toString(), 0);
                        str4 = "VideoCdnMsg";
                        i45 = i77;
                        str3 = "SnsVideoFlag";
                        i37 = i78;
                        i39 = i79;
                        pInt3 = pInt8;
                        str6 = obj;
                        i44 = i84;
                        i36 = Util.getInt(objArr4[16].toString(), 0);
                        j = j3;
                    }
                    WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct = new WCStoryVideoPlayReportStruct();
                    int i85 = i37;
                    long j4 = j;
                    wCStoryVideoPlayReportStruct.f156932d = wCStoryVideoPlayReportStruct.mo86045b("StoryId", str6, true);
                    wCStoryVideoPlayReportStruct.f156933e = (long) i39;
                    wCStoryVideoPlayReportStruct.f156934f = (long) i38;
                    wCStoryVideoPlayReportStruct.f156935g = (long) i44;
                    wCStoryVideoPlayReportStruct.f156936h = (long) i47;
                    wCStoryVideoPlayReportStruct.f156937i = (long) (i4 / 1000);
                    wCStoryVideoPlayReportStruct.f156938j = (long) i6;
                    wCStoryVideoPlayReportStruct.f156939k = (long) i8;
                    wCStoryVideoPlayReportStruct.f156940l = (long) i5;
                    wCStoryVideoPlayReportStruct.f156941m = (long) i17;
                    wCStoryVideoPlayReportStruct.f156942n = 0;
                    wCStoryVideoPlayReportStruct.f156943o = (long) i75;
                    wCStoryVideoPlayReportStruct.f156944p = (long) i28;
                    String str15 = str;
                    wCStoryVideoPlayReportStruct.f156945q = wCStoryVideoPlayReportStruct.mo86045b("ErrorDescription", str15, true);
                    wCStoryVideoPlayReportStruct.f156946r = (long) (i29 * 1000);
                    wCStoryVideoPlayReportStruct.f156947s = wCStoryVideoPlayReportStruct.mo86045b("VideoFormat", hVar2.field_requestVideoFormat + str15, true);
                    wCStoryVideoPlayReportStruct.f156948t = dVar2.field_fileLength;
                    wCStoryVideoPlayReportStruct.f156949u = dVar2.field_recvedBytes;
                    wCStoryVideoPlayReportStruct.f156950v = dVar2.field_startTime;
                    wCStoryVideoPlayReportStruct.f156951w = dVar2.field_endTime;
                    wCStoryVideoPlayReportStruct.f156952x = (long) dVar2.field_retCode;
                    wCStoryVideoPlayReportStruct.f156953y = dVar2.field_enQueueTime;
                    wCStoryVideoPlayReportStruct.f156954z = (long) dVar2.field_moovRequestTimes;
                    wCStoryVideoPlayReportStruct.f156903A = (long) dVar2.field_moovCost;
                    wCStoryVideoPlayReportStruct.f156904B = (long) dVar2.field_moovSize;
                    wCStoryVideoPlayReportStruct.f156905C = dVar2.field_moovCompleted ? 1 : 0;
                    wCStoryVideoPlayReportStruct.f156906D = (long) dVar2.field_moovFailReason;
                    wCStoryVideoPlayReportStruct.f156907E = (long) dVar2.field_firstConnectCost;
                    wCStoryVideoPlayReportStruct.f156908F = (long) dVar2.field_firstRequestCost;
                    wCStoryVideoPlayReportStruct.f156909G = (long) dVar2.field_firstRequestSize;
                    wCStoryVideoPlayReportStruct.f156910H = (long) dVar2.field_firstRequestDownloadSize;
                    wCStoryVideoPlayReportStruct.f156911I = dVar2.field_firstRequestCompleted ? 1 : 0;
                    wCStoryVideoPlayReportStruct.f156912J = (long) dVar2.field_averageSpeed;
                    wCStoryVideoPlayReportStruct.f156913K = (long) dVar2.field_averageConnectCost;
                    wCStoryVideoPlayReportStruct.f156914L = (long) dVar2.field_netConnectTimes;
                    wCStoryVideoPlayReportStruct.f156915M = wCStoryVideoPlayReportStruct.mo86045b("Iplist", dVar.mo137408a(), true);
                    wCStoryVideoPlayReportStruct.f156916N = wCStoryVideoPlayReportStruct.mo86045b("XClientIp", dVar2.field_clientIP, true);
                    wCStoryVideoPlayReportStruct.f156917O = dVar2.field_isCrossNet ? 1 : 0;
                    wCStoryVideoPlayReportStruct.f156918P = hVar2.f287694X0;
                    wCStoryVideoPlayReportStruct.f156919Q = (long) i45;
                    i35 = i25;
                    wCStoryVideoPlayReportStruct.f156920R = (long) i35;
                    wCStoryVideoPlayReportStruct.f156921S = j4;
                    long j5 = (long) i85;
                    wCStoryVideoPlayReportStruct.f156922T = j5;
                    wCStoryVideoPlayReportStruct.f156923U = (long) i36;
                    wCStoryVideoPlayReportStruct.f156924V = dVar2.f287618j;
                    wCStoryVideoPlayReportStruct.f156925W = dVar2.f287619k;
                    wCStoryVideoPlayReportStruct.f156927Y = dVar2.f287620l;
                    wCStoryVideoPlayReportStruct.f156928Z = wCStoryVideoPlayReportStruct.mo86045b("VideoFlag", str15, true);
                    wCStoryVideoPlayReportStruct.f156929a0 = wCStoryVideoPlayReportStruct.mo86045b(str3, dVar2.field_videoFlag, true);
                    wCStoryVideoPlayReportStruct.f156930b0 = wCStoryVideoPlayReportStruct.mo86045b(str4, dVar2.field_videoCdnMsg, true);
                    wCStoryVideoPlayReportStruct.f156931c0 = dVar2.f287611c > 0 ? 1 : 0;
                    Log.m105919d(str5, "time distance %d", Long.valueOf(System.currentTimeMillis() - wCStoryVideoPlayReportStruct.f156921S));
                    if (System.currentTimeMillis() - wCStoryVideoPlayReportStruct.f156921S > 500) {
                        wCStoryVideoPlayReportStruct.mo86054n();
                    }
                    if (z2) {
                        StoryDownloadReportStruct storyDownloadReportStruct = new StoryDownloadReportStruct();
                        C94554a c = C94555d.m119567c(hVar2.field_fullpath, true);
                        if (c != null) {
                            storyDownloadReportStruct.f266252j = (long) c.f273443a;
                            storyDownloadReportStruct.f266253k = (long) c.f273444b;
                            storyDownloadReportStruct.f266254l = (long) c.f273449g;
                            storyDownloadReportStruct.f266255m = (long) c.f273447e;
                            storyDownloadReportStruct.f266256n = (long) c.f273445c;
                            storyDownloadReportStruct.f266257o = (long) c.f273446d;
                            storyDownloadReportStruct.f266259q = (long) c.f273448f;
                        }
                        storyDownloadReportStruct.f266251i = dVar2.field_fileLength;
                        storyDownloadReportStruct.f266247e = storyDownloadReportStruct.mo86045b("VideoUrl", hVar2.f287705p0, true);
                        storyDownloadReportStruct.f266248f = storyDownloadReportStruct.mo86045b("NewMd5", ((C101211h) C86312j.m106911c(C101211h.class)).mo140292k7(hVar2.field_fullpath), true);
                        storyDownloadReportStruct.f266249g = dVar2.field_startTime;
                        storyDownloadReportStruct.f266250h = dVar2.field_endTime;
                        storyDownloadReportStruct.f266258p = storyDownloadReportStruct.mo86045b("CDNIp", str14, true);
                        storyDownloadReportStruct.f266260r = j5;
                        pInt2 = pInt3;
                        storyDownloadReportStruct.f266261s = (long) pInt2.value;
                        storyDownloadReportStruct.mo86054n();
                    } else {
                        pInt2 = pInt3;
                    }
                } else {
                    Object[] objArr5 = objArr;
                    pInt = pInt6;
                    pInt2 = pInt8;
                    String str16 = str;
                    i35 = i25;
                    SnsOnlineVideoReportStruct snsOnlineVideoReportStruct = new SnsOnlineVideoReportStruct(stringBuffer2);
                    snsOnlineVideoReportStruct.f266114X = i;
                    snsOnlineVideoReportStruct.f266113W = snsOnlineVideoReportStruct.mo86045b("AutoPlaySessionID", str2, true);
                    snsOnlineVideoReportStruct.f266112V = i2;
                    snsOnlineVideoReportStruct.f266116Z = dVar2.f287620l;
                    snsOnlineVideoReportStruct.f266117a0 = snsOnlineVideoReportStruct.mo86045b("SnsVideoFlag", dVar2.field_videoFlag, true);
                    snsOnlineVideoReportStruct.f266118b0 = snsOnlineVideoReportStruct.mo86045b("VideoCdnMsg", dVar2.field_videoCdnMsg, true);
                    snsOnlineVideoReportStruct.f266119c0 = dVar2.f287611c > 0 ? 1 : 0;
                    if (dVar2.f287622n != null) {
                        snsOnlineVideoReportStruct.f266145p0 = snsOnlineVideoReportStruct.mo86045b("VideoColdRuleExptGroupId", dVar2.f287622n.experimentalGroupID + str16, true);
                    }
                    Log.m105918d("13790", "report " + 13790 + " value: " + snsOnlineVideoReportStruct.mo1005p());
                    Log.m105918d("13790", "trace id  " + (dVar2.f287620l & -1) + " videoflag " + snsOnlineVideoReportStruct.f266117a0 + " " + snsOnlineVideoReportStruct.f266118b0 + " " + snsOnlineVideoReportStruct.f266119c0);
                    if (objArr5 != null && objArr5.length >= 20) {
                        long j6 = Util.getLong(objArr5[14].toString(), 0);
                        long j7 = Util.getLong(objArr5[15].toString(), 0);
                        snsOnlineVideoReportStruct.f266121d0 = j6;
                        snsOnlineVideoReportStruct.f266123e0 = j7;
                        snsOnlineVideoReportStruct.f266125f0 = Util.getLong(objArr5[16].toString(), 0);
                        snsOnlineVideoReportStruct.f266127g0 = Util.getLong(objArr5[17].toString(), 0);
                        snsOnlineVideoReportStruct.f266133j0 = Util.getInt(objArr5[18].toString(), 0);
                        snsOnlineVideoReportStruct.f266135k0 = Util.getLong(objArr5[19].toString(), 0);
                        snsOnlineVideoReportStruct.f266141n0 = snsOnlineVideoReportStruct.mo86045b("widthxheight", j6 + "x" + j7, true);
                    }
                    snsOnlineVideoReportStruct.f266147q0 = dVar2.f287611c;
                    snsOnlineVideoReportStruct.mo86054n();
                }
            }
            if (z) {
                String str17 = hVar2.f287693X;
                String str18 = hVar2.f287691W;
                int i86 = hVar2.f287695Y;
                String str19 = dVar2.field_fileId;
                long j8 = dVar2.field_startTime;
                long j9 = dVar2.field_endTime;
                String str20 = hVar2.field_fullpath;
                String[] strArr = dVar2.field_usedSvrIps;
                String str21 = hVar2.f287705p0;
                int i87 = pInt.value;
                int i88 = pInt2.value;
                String str22 = hVar2.f287682R0;
                MediaInfoRptEvent mediaInfoRptEvent = new MediaInfoRptEvent();
                String str23 = str22;
                MediaInfoRptEvent.C92530a aVar = mediaInfoRptEvent.f264906d;
                aVar.f264907a = str17;
                aVar.f264908b = str18;
                aVar.f264909c = i86;
                aVar.f264910d = str19;
                aVar.f264911e = i35;
                aVar.f264912f = j8;
                aVar.f264913g = j9;
                aVar.f264914h = str20;
                aVar.f264915i = strArr;
                aVar.f264916j = str21;
                aVar.f264917k = i87;
                aVar.f264918l = i88;
                aVar.f264919m = str23;
                mediaInfoRptEvent.publish();
            }
            if (z3) {
                if (dVar.field_videoFormat == 2) {
                    C115669n.INSTANCE.idkeyStat(354, 132, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(354, 133, 1, false);
                }
                C98408n0 i89 = C98429r0.m127818i(hVar.f287683S);
                if (i89 != null) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(i89.f288567n);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101123jo(new C75875l.C45886e(b002.mo108768t(), "update", b002, 0));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0195  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126993q(boolean r27) {
        /*
            r26 = this;
            r0 = r26
            java.lang.Class<qo.h> r1 = p663qo.C101211h.class
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r2 = "MicroMsg.OnlineVideoService"
            if (r27 != 0) goto L_0x002a
            di3.d r3 = di3.C86312j.m106911c(r1)
            qo.h r3 = (p663qo.C101211h) r3
            boolean r3 = r3.mo140275Gl()
            if (r3 == 0) goto L_0x002a
            f40.e r3 = f40.C86709a0.m107523b()
            boolean r3 = r3.mo121115m()
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = "cdn engine not init cdn dnsinfo , will retry after set info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
        L_0x002a:
            java.lang.Class<qo.l> r3 = p663qo.C101213l.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            qo.l r3 = (p663qo.C101213l) r3
            r3.Xk0()
        L_0x0035:
            java.util.Queue<java.lang.String> r3 = r0.f266976d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0394
            java.util.Queue<java.lang.String> r3 = r0.f266976d
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            java.lang.Object r3 = r3.poll()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, gi.h> r4 = r0.f266977e
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.remove(r3)
            gi.h r4 = (p1081gi.C98127h) r4
            if (r4 != 0) goto L_0x0054
            goto L_0x0035
        L_0x0054:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.field_startTime = r5
            boolean r5 = r4.f287661e
            if (r5 != 0) goto L_0x0035
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ONLINE_VIDEO_INT
            r8 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r6 = r6.mo119685f(r7, r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = 4
            r9 = 2
            r10 = 0
            r11 = 1
            if (r6 != r9) goto L_0x0086
            java.lang.String r5 = "command set do not check media duplication."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            goto L_0x0181
        L_0x0086:
            int r6 = r4.f287655L
            if (r6 != r7) goto L_0x008c
            r6 = 1
            goto L_0x008d
        L_0x008c:
            r6 = 0
        L_0x008d:
            if (r6 == 0) goto L_0x0091
            goto L_0x0181
        L_0x0091:
            java.lang.String r6 = r4.f287685T
            int r14 = r4.f287687U
            oa1.d r12 = oa1.C117731d.m166007c()
            tf3.s r13 = new tf3.s
            r13.<init>()
            int r12 = r12.mo182440a(r13)
            java.lang.String r15 = "update"
            if (r12 != r11) goto L_0x0105
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r12 != 0) goto L_0x0181
            if (r14 > 0) goto L_0x00b1
            goto L_0x0181
        L_0x00b1:
            java.lang.Class<xp.b> r12 = p753xp.C102704b.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            xp.b r12 = (p753xp.C102704b) r12
            long r7 = (long) r14
            java.lang.String r13 = r4.field_fullpath
            r17 = 4
            r16 = r13
            r13 = r6
            r9 = r14
            r11 = r15
            r14 = r7
            boolean r7 = r12.Fp0(r13, r14, r16, r17)
            if (r7 == 0) goto L_0x0181
            java.lang.String r7 = r4.f287683S
            java.lang.String r8 = r4.f287703e1
            java.lang.String r12 = r4.f287699a1
            hd0.n0 r7 = hd0.C98429r0.m127819j(r7, r8, r12)
            r0.mo126988l(r7, r9, r6, r4)
            if (r7 == 0) goto L_0x0181
            k40.a r6 = f40.C86709a0.m107533q(r5)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r7 = r7.f288567n
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r7)
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            g62.l$e r7 = new g62.l$e
            java.lang.String r8 = r6.mo108768t()
            r7.<init>(r8, r11, r6, r10)
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            r5.mo101123jo(r7)
            goto L_0x017f
        L_0x0105:
            r9 = r14
            r11 = r15
            java.lang.Class<eu.g> r7 = p509eu.C97708g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            eu.g r7 = (p509eu.C97708g) r7
            eu.d r7 = r7.mo58053A1()
            com.tencent.mm.storage.d4 r7 = (com.tencent.p014mm.storage.C30731d4) r7
            java.lang.String r7 = r7.mo57627a(r6, r9)
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r7)
            int r8 = (int) r12
            int r14 = r9 - r8
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x0181
            if (r14 < 0) goto L_0x0181
            r8 = 16
            if (r14 > r8) goto L_0x0181
            r8 = 3
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r12[r10] = r8
            r8 = 1
            r12[r8] = r6
            r8 = 2
            r12[r8] = r7
            java.lang.String r8 = "it had download this video[%d, %s, %s]."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r12)
            java.lang.String r8 = r4.field_fullpath
            com.tencent.p014mm.vfs.C86013q1.m106442c(r7, r8)
            java.lang.String r7 = r4.f287683S
            java.lang.String r8 = r4.f287703e1
            java.lang.String r12 = r4.f287699a1
            hd0.n0 r7 = hd0.C98429r0.m127819j(r7, r8, r12)
            r0.mo126988l(r7, r9, r6, r4)
            if (r7 == 0) goto L_0x0181
            k40.a r6 = f40.C86709a0.m107533q(r5)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r7 = r7.f288567n
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r7)
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            g62.l$e r7 = new g62.l$e
            java.lang.String r8 = r6.mo108768t()
            r7.<init>(r8, r11, r6, r10)
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            r5.mo101123jo(r7)
        L_0x017f:
            r5 = 1
            goto L_0x0182
        L_0x0181:
            r5 = 0
        L_0x0182:
            r6 = 6
            if (r5 == 0) goto L_0x0195
            com.tencent.mm.autogen.events.OnlineVideoEvent r4 = new com.tencent.mm.autogen.events.OnlineVideoEvent
            r4.<init>()
            com.tencent.mm.autogen.events.OnlineVideoEvent$a r5 = r4.f264965d
            r5.f264966a = r6
            r5.f264968c = r3
            r4.publish()
            goto L_0x0035
        L_0x0195:
            boolean r5 = r4.mo137413a()
            if (r5 == 0) goto L_0x01a9
            di3.d r5 = di3.C86312j.m106911c(r1)
            qo.h r5 = (p663qo.C101211h) r5
            int r6 = r4.f287689V
            int r5 = r5.mo140282Yg(r4, r6)
            goto L_0x0223
        L_0x01a9:
            boolean r5 = r4.mo137414b()
            if (r5 == 0) goto L_0x01be
            r5 = 2
            r4.f287657N = r5
            di3.d r5 = di3.C86312j.m106911c(r1)
            qo.h r5 = (p663qo.C101211h) r5
            int r5 = r5.mo140281YZ(r4)
            goto L_0x0223
        L_0x01be:
            int r5 = r4.f287655L
            if (r5 != r6) goto L_0x01c4
            r6 = 1
            goto L_0x01c5
        L_0x01c4:
            r6 = 0
        L_0x01c5:
            if (r6 == 0) goto L_0x01d5
            r6 = 4
            r4.f287657N = r6
            di3.d r5 = di3.C86312j.m106911c(r1)
            qo.h r5 = (p663qo.C101211h) r5
            int r5 = r5.cd0(r4)
            goto L_0x0223
        L_0x01d5:
            r6 = 8
            if (r5 != r6) goto L_0x01db
            r6 = 1
            goto L_0x01dc
        L_0x01db:
            r6 = 0
        L_0x01dc:
            if (r6 == 0) goto L_0x01e9
            di3.d r5 = di3.C86312j.m106911c(r1)
            qo.h r5 = (p663qo.C101211h) r5
            int r5 = r5.Xi0(r4)
            goto L_0x0223
        L_0x01e9:
            r6 = 3
            if (r5 != r6) goto L_0x01ee
            r6 = 1
            goto L_0x01ef
        L_0x01ee:
            r6 = 0
        L_0x01ef:
            if (r6 == 0) goto L_0x01fc
            di3.d r5 = di3.C86312j.m106911c(r1)
            qo.h r5 = (p663qo.C101211h) r5
            int r5 = r5.Yr0(r4)
            goto L_0x0223
        L_0x01fc:
            r6 = 5
            if (r5 != r6) goto L_0x0201
            r5 = 1
            goto L_0x0202
        L_0x0201:
            r5 = 0
        L_0x0202:
            if (r5 == 0) goto L_0x0219
            int r5 = r4.f287659Q
            r6 = 1
            if (r5 != r6) goto L_0x020b
            r5 = 1
            goto L_0x020c
        L_0x020b:
            r5 = 0
        L_0x020c:
            if (r5 == 0) goto L_0x0219
            di3.d r5 = di3.C86312j.m106911c(r1)
            qo.h r5 = (p663qo.C101211h) r5
            int r5 = r5.mo140294xR(r4)
            goto L_0x0223
        L_0x0219:
            di3.d r5 = di3.C86312j.m106911c(r1)
            qo.h r5 = (p663qo.C101211h) r5
            int r5 = r5.mo140290dp(r4)
        L_0x0223:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r10] = r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8 = 1
            r7[r8] = r6
            java.lang.String r6 = "start task %s streaming download. ret %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r7)
            if (r5 == 0) goto L_0x033c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "start stream video error. ret : "
            r3.append(r6)
            r3.append(r5)
            java.lang.String r6 = " media id: "
            r3.append(r6)
            java.lang.String r6 = r4.field_mediaId
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            boolean r3 = r4.mo137413a()
            int r4 = r4.f287689V
            java.lang.String r6 = ""
            r7 = 13836(0x360c, float:1.9388E-41)
            if (r3 == 0) goto L_0x02f1
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 354(0x162, double:1.75E-321)
            r21 = 3
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            r8 = -20003(0xffffffffffffb1dd, float:NaN)
            r9 = -21006(0xffffffffffffadf2, float:NaN)
            r11 = 1
            if (r4 != r11) goto L_0x02a6
            if (r5 != r9) goto L_0x0288
            r19 = 354(0x162, double:1.75E-321)
            r21 = 100
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x02d3
        L_0x0288:
            if (r5 != r8) goto L_0x0298
            r19 = 354(0x162, double:1.75E-321)
            r21 = 101(0x65, double:5.0E-322)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x02d3
        L_0x0298:
            r19 = 354(0x162, double:1.75E-321)
            r21 = 102(0x66, double:5.04E-322)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x02d3
        L_0x02a6:
            if (r5 != r9) goto L_0x02b6
            r19 = 354(0x162, double:1.75E-321)
            r21 = 106(0x6a, double:5.24E-322)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x02d3
        L_0x02b6:
            if (r5 != r8) goto L_0x02c6
            r19 = 354(0x162, double:1.75E-321)
            r21 = 107(0x6b, double:5.3E-322)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x02d3
        L_0x02c6:
            r19 = 354(0x162, double:1.75E-321)
            r21 = 108(0x6c, double:5.34E-322)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
        L_0x02d3:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 100
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r10] = r5
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r8 = 1
            r4[r8] = r5
            r5 = 2
            r4[r5] = r6
            r3.mo160131h(r7, r4)
            goto L_0x0035
        L_0x02f1:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 354(0x162, double:1.75E-321)
            r21 = 210(0xd2, double:1.04E-321)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            r5 = 1
            if (r4 != r5) goto L_0x0311
            r19 = 354(0x162, double:1.75E-321)
            r21 = 211(0xd3, double:1.042E-321)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x031e
        L_0x0311:
            r19 = 354(0x162, double:1.75E-321)
            r21 = 212(0xd4, double:1.047E-321)
            r23 = 1
            r25 = 0
            r18 = r3
            r18.idkeyStat(r19, r21, r23, r25)
        L_0x031e:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r10] = r5
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r8 = 1
            r4[r8] = r5
            r5 = 2
            r4[r5] = r6
            r3.mo160131h(r7, r4)
            goto L_0x0035
        L_0x033c:
            r5 = 2
            r8 = 1
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.f287681R = r6
            boolean r6 = r4.mo137413a()
            if (r6 == 0) goto L_0x0376
            int r6 = r4.f287664h
            if (r6 == r8) goto L_0x0350
            if (r6 != r5) goto L_0x0351
        L_0x0350:
            r10 = 1
        L_0x0351:
            if (r10 != 0) goto L_0x0376
            java.lang.String r5 = r4.f287683S
            hd0.n0 r5 = hd0.C98429r0.m127818i(r5)
            if (r5 == 0) goto L_0x0376
            int r6 = r5.f288562i
            r7 = 120(0x78, float:1.68E-43)
            if (r6 == r7) goto L_0x0376
            r8 = 122(0x7a, float:1.71E-43)
            if (r6 == r8) goto L_0x0376
            r8 = 121(0x79, float:1.7E-43)
            if (r6 == r8) goto L_0x0376
            r5.f288562i = r7
            r6 = 256(0x100, float:3.59E-43)
            r5.f288548P = r6
            hd0.o0 r6 = hd0.C98398h0.Bx0()
            r6.mo137733w(r5)
        L_0x0376:
            java.util.Map<java.lang.String, gi.h> r5 = r0.f266978f
            java.lang.String r6 = r4.field_mediaId
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r6, r4)
            com.tencent.mm.autogen.events.OnlineVideoEvent r5 = new com.tencent.mm.autogen.events.OnlineVideoEvent
            r5.<init>()
            com.tencent.mm.autogen.events.OnlineVideoEvent$a r6 = r5.f264965d
            r7 = 7
            r6.f264966a = r7
            r6.f264968c = r3
            long r3 = r4.f287681R
            r6.f264971f = r3
            r5.publish()
            goto L_0x0035
        L_0x0394:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92755e0.mo126993q(boolean):void");
    }
}
