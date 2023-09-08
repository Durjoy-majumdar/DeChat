package x03;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kj2.C117407d;
import o03.C21724i;
import o03.C47322f;
import p03.C21912d;
import p03.C47419f;
import p206nj.C117627q;
import r03.C22193b;
import r03.C22194c;
import te3.C51593us3;
import te3.uh4;
import te3.xh4;
import u73.C52459d0;

/* renamed from: x03.r */
public class C22982r {

    /* renamed from: a */
    public Map<String, C22194c> f66020a = new HashMap();

    /* renamed from: b */
    public C22947b f66021b;

    /* renamed from: c */
    public int f66022c;

    /* renamed from: d */
    public int f66023d = 2;

    /* renamed from: e */
    public xh4 f66024e;

    /* renamed from: f */
    public C22193b f66025f;

    /* renamed from: g */
    public List<String> f66026g = new ArrayList();

    /* renamed from: a */
    public void mo36203a() {
        if (this.f66025f != null && this.f66024e != null) {
            List<String> list = this.f66026g;
            ((ArrayList) list).add(this.f66024e.f64729h + "#" + (this.f66025f.f62807d / 1000));
        }
    }

    /* renamed from: b */
    public void mo36204b() {
        int i = this.f66022c - 1;
        this.f66022c = i;
        Log.m105925i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "onUIDestroy %d", Integer.valueOf(i));
        if (this.f66022c <= 0) {
            mo36205c();
            this.f66021b = null;
        }
    }

    /* renamed from: c */
    public void mo36205c() {
        HashSet hashSet = new HashSet();
        for (C22194c cVar : ((HashMap) this.f66020a).values()) {
            if (!cVar.f62830d) {
                hashSet.add(cVar);
                cVar.f62830d = true;
            }
        }
        if (this.f66021b != null) {
            C47419f av02 = ((C21912d) C86312j.m106911c(C21912d.class)).av0();
            uh4 r4 = this.f66021b.mo24989r4();
            C21724i iVar = (C21724i) av02;
            iVar.getClass();
            if (hashSet.size() != 0) {
                C21724i.C21726b bVar = (C21724i.C21726b) ((ConcurrentHashMap) iVar.f61503b).get(Long.valueOf(r4.f64641h));
                if (bVar == null || !iVar.f61502a.hasMessages(0)) {
                    if (bVar != null) {
                        Log.m105925i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo not report task: %s size: %d", bVar, Integer.valueOf(bVar.f61504d.size()));
                    }
                    C21724i.C21726b bVar2 = new C21724i.C21726b((C21724i.C21725a) null);
                    Log.m105925i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo new task %d %s", Integer.valueOf(hashSet.size()), bVar2);
                    System.currentTimeMillis();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        bVar2.f61504d.add((C22194c) it.next());
                    }
                    bVar2.f61505e = r4;
                    if (bVar2.f61504d.size() > 0) {
                        iVar.f61502a.removeMessages(0);
                        MMHandler mMHandler = iVar.f61502a;
                        mMHandler.sendMessageDelayed(mMHandler.obtainMessage(0, bVar2), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        ((ConcurrentHashMap) iVar.f61503b).put(Long.valueOf(r4.f64641h), bVar2);
                        return;
                    }
                    return;
                }
                Log.m105925i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo hit cached task %d add %d", Integer.valueOf(bVar.f61504d.size()), Integer.valueOf(hashSet.size()));
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    bVar.f61504d.add((C22194c) it4.next());
                }
            }
        }
    }

    /* renamed from: d */
    public void mo36206d(xh4 xh4) {
        mo36207e(xh4);
        ((C22194c) ((HashMap) this.f66020a).get(xh4.f64729h)).f62828b = true;
    }

    /* renamed from: e */
    public void mo36207e(xh4 xh4) {
        if (xh4 == null) {
            Log.m105924i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose null");
        }
        C22194c cVar = new C22194c(xh4);
        if (!((HashMap) this.f66020a).containsKey(cVar.f62827a.f64729h)) {
            ((HashMap) this.f66020a).put(cVar.f62827a.f64729h, cVar);
            Log.m105925i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose %s", xh4);
            return;
        }
        ((C22194c) ((HashMap) this.f66020a).get(cVar.f62827a.f64729h)).f62827a = xh4;
    }

    /* renamed from: f */
    public void mo36208f(xh4 xh4, int i, String str) {
        this.f66024e = xh4;
        C22193b bVar = new C22193b();
        this.f66025f = bVar;
        bVar.f62804a = System.currentTimeMillis();
        C22193b bVar2 = this.f66025f;
        bVar2.f62812i = 2;
        bVar2.f62811h = (long) this.f66023d;
        bVar2.f62824u = (long) (i + 1);
        uh4 r4 = this.f66021b.mo24989r4();
        C22193b bVar3 = this.f66025f;
        bVar3.f62823t = r4.f64642i + "_" + r4.f64643j + "_" + r4.f64641h;
        if (this.f66021b.mo24979d1()) {
            this.f66025f.f62810g = 1;
        }
        this.f66023d = 2;
        Log.m105925i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "startVideoPlay %s %s %s reportInfo: %d %d", str, xh4.f64729h, xh4.f64725d, Long.valueOf(this.f66025f.f62811h), Long.valueOf(this.f66025f.f62812i));
    }

    /* renamed from: g */
    public void mo36209g(uh4 uh4) {
        uh4 uh42 = uh4;
        mo36203a();
        C21724i vx02 = ((C47322f) C86312j.m106911c(C47322f.class)).vx0();
        xh4 xh4 = this.f66024e;
        C22193b bVar = this.f66025f;
        vx02.getClass();
        Log.m105925i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay: %s %s", xh4, bVar);
        if (!(xh4 == null || bVar == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            bVar.f62805b = currentTimeMillis;
            bVar.f62806c = currentTimeMillis - bVar.f62804a;
            StringBuilder sb = new StringBuilder("");
            sb.append("ismediaplay=1");
            sb.append("&searchid=");
            sb.append(uh42.f64643j);
            sb.append("&scene=");
            sb.append(uh42.f64642i);
            sb.append("&businesstype=3");
            sb.append("&mediatype=2");
            sb.append("&rec_category=");
            sb.append(uh42.f64641h);
            sb.append("&docid=");
            sb.append(xh4.f64706G);
            sb.append("&cdnsourcetype=");
            sb.append(xh4.f64715Q);
            try {
                sb.append("&expand1=");
                sb.append(C117627q.m165909b(xh4.f64743x, "utf-8"));
            } catch (Exception unused) {
            }
            sb.append("&query=");
            try {
                sb.append(C117627q.m165909b(uh42.f64644n, "utf-8"));
            } catch (Exception unused2) {
            }
            sb.append("&title=");
            try {
                sb.append(C117627q.m165909b(xh4.f64725d, "utf-8"));
            } catch (Exception unused3) {
            }
            sb.append("&duration=");
            sb.append(xh4.f64728g * 1000);
            sb.append("&mediaid=");
            sb.append(xh4.f64729h);
            sb.append("&startplaytime=");
            sb.append(bVar.f62804a);
            sb.append("&endplaytime=");
            sb.append(bVar.f62805b);
            sb.append("&playtime=");
            sb.append(bVar.f62806c);
            sb.append("&lastplayms=");
            sb.append(bVar.f62807d);
            sb.append("&autoplay=");
            sb.append(bVar.f62811h);
            sb.append("&hasplayended=");
            sb.append(bVar.f62808e);
            sb.append("&hasquickplay=");
            sb.append(bVar.f62809f);
            sb.append("&hasfullscreen=");
            sb.append(bVar.f62810g);
            sb.append("&hitpreload=");
            sb.append(bVar.f62812i);
            sb.append("&firstloadtime=");
            sb.append(bVar.f62815l);
            sb.append("&downloadfinishtime=");
            sb.append(bVar.f62816m);
            sb.append("&firstmoovreadytime=");
            sb.append(bVar.f62817n);
            sb.append("&firstdataavailabletime=");
            sb.append(bVar.f62820q);
            sb.append("&filesize=");
            sb.append(bVar.f62826w);
            if (bVar.f62825v != null) {
                sb.append("&bitrate=");
                sb.append(bVar.f62825v.f273444b);
                sb.append("&audiobitrate=");
                sb.append(bVar.f62825v.f273449g);
            }
            String sb4 = sb.toString();
            if (!Util.isNullOrNil(sb4)) {
                C51593us3 us32 = new C51593us3();
                us32.f143104t = sb4;
                Log.m105925i("MicroMsg.TopStory.TopStoryReporterImpl", "build14436VideoPlayReportString %s", sb4);
                C86709a0.m107524d().mo123460f(new C52459d0(us32));
            }
            C94554a aVar = bVar.f62825v;
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(uh42.f64642i), xh4.f64729h, Long.valueOf(xh4.f64709J), "mp4", Integer.valueOf(xh4.f64728g), Integer.valueOf(aVar != null ? aVar.f273444b : 0), Long.valueOf(bVar.f62804a), Long.valueOf(bVar.f62805b), Long.valueOf(bVar.f62807d), Long.valueOf(bVar.f62806c), Long.valueOf(bVar.f62809f), Long.valueOf(bVar.f62810g), Long.valueOf(bVar.f62811h), Long.valueOf(bVar.f62812i), Long.valueOf(bVar.f62815l), Long.valueOf(bVar.f62816m), Long.valueOf(bVar.f62808e), Long.valueOf(bVar.f62817n), Long.valueOf(bVar.f62818o), Long.valueOf(bVar.f62820q), Long.valueOf(bVar.f62821r), bVar.f62823t, Long.valueOf(bVar.f62824u), C43471q.m46979c(), Long.valueOf(bVar.f62819p), Long.valueOf(bVar.f62822s), Long.valueOf(bVar.f62813j), Long.valueOf(bVar.f62814k), uh42.f64648r});
            Log.m105925i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay 15414 %s", format);
            C117407d dVar = C117407d.INSTANCE;
            dVar.kvStat(15414, format);
            if (bVar.f62815l > 0) {
                ArrayList arrayList = new ArrayList();
                IDKey iDKey = new IDKey();
                iDKey.SetID(845);
                iDKey.SetKey(0);
                iDKey.SetValue(bVar.f62815l);
                arrayList.add(iDKey);
                IDKey iDKey2 = new IDKey();
                iDKey2.SetID(845);
                iDKey2.SetKey(1);
                iDKey2.SetValue(1);
                arrayList.add(iDKey2);
                dVar.mo160124a(arrayList, false);
            }
            if (bVar.f62806c > 0) {
                ArrayList arrayList2 = new ArrayList();
                IDKey iDKey3 = new IDKey();
                iDKey3.SetID(845);
                iDKey3.SetKey(2);
                iDKey3.SetValue(bVar.f62806c);
                arrayList2.add(iDKey3);
                IDKey iDKey4 = new IDKey();
                iDKey4.SetID(845);
                iDKey4.SetKey(3);
                iDKey4.SetValue(1);
                arrayList2.add(iDKey4);
                dVar.mo160124a(arrayList2, false);
            }
            if (bVar.f62816m > 0) {
                ArrayList arrayList3 = new ArrayList();
                IDKey iDKey5 = new IDKey();
                iDKey5.SetID(845);
                iDKey5.SetKey(4);
                iDKey5.SetValue(bVar.f62816m);
                arrayList3.add(iDKey5);
                IDKey iDKey6 = new IDKey();
                iDKey6.SetID(845);
                iDKey6.SetKey(5);
                iDKey6.SetValue(1);
                arrayList3.add(iDKey6);
                dVar.mo160124a(arrayList3, false);
            }
        }
        this.f66024e = null;
        this.f66025f = null;
    }
}
