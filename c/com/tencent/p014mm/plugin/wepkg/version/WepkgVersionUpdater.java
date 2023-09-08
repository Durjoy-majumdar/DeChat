package com.tencent.p014mm.plugin.wepkg.version;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wepkg.event.ForceUpdateNotify;
import com.tencent.p014mm.plugin.wepkg.model.BaseWepkgProcessTask;
import com.tencent.p014mm.plugin.wepkg.model.C44488a;
import com.tencent.p014mm.plugin.wepkg.model.C44493e;
import com.tencent.p014mm.plugin.wepkg.model.C44509m;
import com.tencent.p014mm.plugin.wepkg.model.C44519n;
import com.tencent.p014mm.plugin.wepkg.model.C44523r;
import com.tencent.p014mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.plugin.wepkg.utils.WepkgRunCgi;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C47350c;
import ob3.C47358a;
import pe3.C47465a;
import te3.C50879pv;
import te3.C51015qv;
import te3.C51684vd3;
import te3.C51748vw;
import te3.k35;
import te3.l35;
import te3.m35;
import te3.o35;
import te3.p35;
import te3.r35;
import te3.s35;

/* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater */
public class WepkgVersionUpdater {
    /* renamed from: a */
    public static void m48921a(List<String> list, int i) {
        if (!Util.isNullOrNil((List) list)) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(list);
            m48922b(hashSet, i, -1, false);
        }
    }

    /* renamed from: b */
    public static void m48922b(Set<String> set, int i, int i2, boolean z) {
        if (set != null) {
            LinkedList linkedList = new LinkedList();
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            Iterator<String> it = set.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (!Util.isNullOrNil(next)) {
                    stringBuffer.append(next);
                    stringBuffer.append(";");
                    C51748vw vwVar = new C51748vw();
                    vwVar.f143738d = next;
                    vwVar.f143740f = i;
                    WepkgVersion d = C44509m.m48883d(next);
                    if (d == null) {
                        vwVar.f143739e = "";
                        linkedList.add(vwVar);
                    } else {
                        vwVar.f143739e = d.f120653f;
                        Object obj = C44536d.f120770a;
                        if (Math.abs((Util.nowSecond() - d.f120664t) + d.f120657j) < d.f120657j) {
                            z2 = false;
                        }
                        if (z2) {
                            linkedList.add(vwVar);
                            WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
                            wepkgCrossProcessTask.f120618h = 3003;
                            wepkgCrossProcessTask.f120619i.f120651d = next;
                            if (MMApplicationContext.isMMProcess()) {
                                C44536d.m48918d().postToWorker(new C44519n(wepkgCrossProcessTask));
                            } else {
                                wepkgCrossProcessTask.mo114395c();
                            }
                        } else {
                            stringBuffer2.append(next);
                            stringBuffer2.append(";");
                        }
                    }
                }
            }
            int i3 = i;
            Log.m105925i("MicroMsg.Wepkg.WepkgVersionUpdater", "All wepkg list[%s] to update, excluded wepkg list[%s], scene:%d, downloadTriggerType:%d, isReportSize:%b", stringBuffer.toString(), stringBuffer2.toString(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
            if (!Util.isNullOrNil((List) linkedList) && linkedList.size() != 0) {
                WepkgNetSceneProcessTask wepkgNetSceneProcessTask = new WepkgNetSceneProcessTask();
                wepkgNetSceneProcessTask.f120779i = i2;
                wepkgNetSceneProcessTask.f120780j = z;
                Iterator it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    C51748vw vwVar2 = (C51748vw) it4.next();
                    WepkgNetSceneProcessTask.WepkgCheckReq wepkgCheckReq = new WepkgNetSceneProcessTask.WepkgCheckReq();
                    wepkgCheckReq.f120781d = vwVar2.f143738d;
                    wepkgCheckReq.f120782e = vwVar2.f143739e;
                    wepkgCheckReq.f120783f = vwVar2.f143740f;
                    ((ArrayList) wepkgNetSceneProcessTask.f120778h).add(wepkgCheckReq);
                }
                if (MMApplicationContext.isMMProcess()) {
                    C44536d.m48918d().postToWorker(new C44543a(wepkgNetSceneProcessTask));
                } else {
                    wepkgNetSceneProcessTask.mo114395c();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask */
    public static final class WepkgNetSceneProcessTask extends BaseWepkgProcessTask {
        public static final Parcelable.Creator<WepkgNetSceneProcessTask> CREATOR = new C44542b();

        /* renamed from: h */
        public List<WepkgCheckReq> f120778h;

        /* renamed from: i */
        public int f120779i;

        /* renamed from: j */
        public boolean f120780j;

        /* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask$WepkgCheckReq */
        public static class WepkgCheckReq implements Parcelable {
            public static final Parcelable.Creator<WepkgCheckReq> CREATOR = new C44539a();

            /* renamed from: d */
            public String f120781d;

            /* renamed from: e */
            public String f120782e;

            /* renamed from: f */
            public int f120783f;

            /* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask$WepkgCheckReq$a */
            public class C44539a implements Parcelable.Creator<WepkgCheckReq> {
                public Object createFromParcel(Parcel parcel) {
                    return new WepkgCheckReq(parcel, (C44543a) null);
                }

                public Object[] newArray(int i) {
                    return new WepkgCheckReq[i];
                }
            }

            public WepkgCheckReq() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f120781d);
                parcel.writeString(this.f120782e);
                parcel.writeInt(this.f120783f);
            }

            public WepkgCheckReq(Parcel parcel, C44543a aVar) {
                this.f120781d = parcel.readString();
                this.f120782e = parcel.readString();
                this.f120783f = parcel.readInt();
            }
        }

        /* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask$a */
        public class C44540a implements WepkgRunCgi.C44531b {

            /* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask$a$a */
            public class C44541a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C51015qv f120785d;

                public C44541a(C51015qv qvVar) {
                    this.f120785d = qvVar;
                }

                public void run() {
                    m35 m35;
                    C51015qv qvVar = this.f120785d;
                    WepkgNetSceneProcessTask wepkgNetSceneProcessTask = WepkgNetSceneProcessTask.this;
                    int i = wepkgNetSceneProcessTask.f120779i;
                    boolean z = wepkgNetSceneProcessTask.f120780j;
                    if (qvVar != null) {
                        if (Util.isNullOrNil((List) qvVar.f140561d)) {
                            Log.m105920e("MicroMsg.Wepkg.WepkgManager", "response.PkgList.size() is empty");
                            return;
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        Iterator<C51684vd3> it = qvVar.f140561d.iterator();
                        while (it.hasNext()) {
                            C51684vd3 next = it.next();
                            if (next != null) {
                                String str = next.f143442d;
                                p35 p35 = next.f143443e;
                                l35 l35 = next.f143445g;
                                if (!Util.isNullOrNil(str)) {
                                    if (l35 != null) {
                                        if (l35.f137159e) {
                                            Log.m105924i("MicroMsg.Wepkg.WepkgManager", "wepkg reload now");
                                            C115669n.INSTANCE.idkeyStat(859, 17, 1, false);
                                            if (next.f143444f != null) {
                                                ((HashSet) ForceUpdateNotify.f120603e).add(next.f143442d);
                                            }
                                        }
                                        if (l35.f137158d) {
                                            C44493e.m48856c().mo69277e(str, 2, 3);
                                        }
                                    }
                                    if (!(p35 == null || (m35 = p35.f139562e) == null)) {
                                        ArrayList arrayList2 = null;
                                        if (Util.isNullOrNil(m35.f137822d)) {
                                            C44509m.m48885f(str, (C44488a) null);
                                            C115669n.INSTANCE.idkeyStat(859, 18, 1, false);
                                        } else {
                                            m35 m352 = p35.f139562e;
                                            long j = (long) m352.f137825g;
                                            C44509m.m48888i(str, m352.f137823e, (long) m352.f137824f, j);
                                            WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
                                            wepkgCrossProcessTask.f120618h = 3009;
                                            wepkgCrossProcessTask.f120619i.f120651d = str;
                                            if (MMApplicationContext.isMMProcess()) {
                                                wepkgCrossProcessTask.mo1553j();
                                            } else {
                                                wepkgCrossProcessTask.mo114396f();
                                            }
                                            WepkgCrossProcessTask wepkgCrossProcessTask2 = new WepkgCrossProcessTask();
                                            wepkgCrossProcessTask2.f120618h = WearableStatusCodes.DUPLICATE_CAPABILITY;
                                            wepkgCrossProcessTask2.f120622o.f120639e = str;
                                            if (MMApplicationContext.isMMProcess()) {
                                                wepkgCrossProcessTask2.mo1553j();
                                            } else {
                                                wepkgCrossProcessTask2.mo114396f();
                                            }
                                            if (z) {
                                                s35 s35 = next.f143444f;
                                                if (s35 != null) {
                                                    k35 k35 = s35.f141305f;
                                                    r35 r35 = s35.f141306g;
                                                    arrayList2 = new ArrayList();
                                                    if (!(k35 == null || k35.f136536d == null)) {
                                                        arrayList2.add(MD5Util.getMD5String(next.f143442d + k35.f136536d.f138397e));
                                                    }
                                                    if (r35 != null && !Util.isNullOrNil((List) r35.f140686d)) {
                                                        Iterator<o35> it4 = r35.f140686d.iterator();
                                                        while (it4.hasNext()) {
                                                            o35 next2 = it4.next();
                                                            if (!(next2 == null || next2.f138944f == null)) {
                                                                arrayList2.add(MD5Util.getMD5String(next.f143442d + next2.f138944f.f138397e));
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!Util.isNullOrNil((List) arrayList2)) {
                                                    hashSet.addAll(arrayList2);
                                                }
                                            }
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                        }
                        ForceUpdateNotify.m48830a();
                        C47358a aVar = C47358a.C47360b.f127093a;
                        aVar.getClass();
                        if (hashSet.isEmpty()) {
                            C115669n.INSTANCE.idkeyStat(859, 20, 1, false);
                        } else {
                            C115669n.INSTANCE.idkeyStat(859, 21, 1, false);
                            C47358a.C47361c cVar = new C47358a.C47361c(aVar);
                            cVar.f127094a = hashSet.size();
                            cVar.f127095b = 0;
                            Iterator it5 = hashSet.iterator();
                            while (it5.hasNext()) {
                                ((ConcurrentHashMap) aVar.f127092a).put((String) it5.next(), cVar);
                            }
                        }
                        if (!Util.isNullOrNil((List) arrayList)) {
                            Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                C44523r.m48890b().mo69302e((C51684vd3) it6.next(), i);
                            }
                        }
                    }
                }
            }

            public C44540a() {
            }

            /* renamed from: a */
            public void mo69306a(int i, int i2, String str, C47350c cVar) {
                C47465a aVar;
                if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
                    try {
                        C44536d.m48918d().postToWorker(new C44541a((C51015qv) aVar));
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.Wepkg.WepkgVersionUpdater", "get checkwepkgversion error");
                    }
                } else {
                    Log.m105921e("MicroMsg.Wepkg.WepkgVersionUpdater", "check wepkg version, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
                    C115669n.INSTANCE.idkeyStat(859, 16, 1, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask$b */
        public class C44542b implements Parcelable.Creator<WepkgNetSceneProcessTask> {
            public Object createFromParcel(Parcel parcel) {
                return new WepkgNetSceneProcessTask(parcel, (C44543a) null);
            }

            public Object[] newArray(int i) {
                return new WepkgNetSceneProcessTask[i];
            }
        }

        public WepkgNetSceneProcessTask() {
            this.f120778h = new ArrayList();
        }

        /* renamed from: i */
        public void mo1552i() {
        }

        /* renamed from: j */
        public void mo1553j() {
            if (!Util.isNullOrNil((List) this.f120778h)) {
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127069d = 1313;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                bVar.f127068c = "/cgi-bin/mmgame-bin/checkwepkgversion";
                C50879pv pvVar = new C50879pv();
                Iterator it = ((ArrayList) this.f120778h).iterator();
                while (it.hasNext()) {
                    WepkgCheckReq wepkgCheckReq = (WepkgCheckReq) it.next();
                    C51748vw vwVar = new C51748vw();
                    vwVar.f143738d = wepkgCheckReq.f120781d;
                    vwVar.f143739e = wepkgCheckReq.f120782e;
                    vwVar.f143740f = wepkgCheckReq.f120783f;
                    pvVar.f139995d.add(vwVar);
                }
                bVar.f127066a = pvVar;
                bVar.f127067b = new C51015qv();
                C115669n.INSTANCE.idkeyStat(859, 15, 1, false);
                WepkgRunCgi.m48903c(bVar.mo72403a(), new C44540a());
            }
        }

        /* renamed from: q */
        public void mo69252q(Parcel parcel) {
            if (this.f120778h == null) {
                this.f120778h = new ArrayList();
            }
            parcel.readList(this.f120778h, WepkgCheckReq.class.getClassLoader());
            this.f120779i = parcel.readInt();
            this.f120780j = parcel.readByte() != 0;
        }

        /* renamed from: t */
        public void mo69253t(Parcel parcel, int i) {
            parcel.writeList(this.f120778h);
            parcel.writeInt(this.f120779i);
            parcel.writeByte(this.f120780j ? (byte) 1 : 0);
        }

        public WepkgNetSceneProcessTask(Parcel parcel, C44543a aVar) {
            mo1551g(parcel);
        }
    }
}
