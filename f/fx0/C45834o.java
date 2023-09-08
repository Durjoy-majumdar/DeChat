package fx0;

import android.os.Looper;
import com.tencent.p014mm.autogen.events.AppMsgRelatedInfoUpdateEvent;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ea3.C45590f;
import fy0.C20734b;
import fy0.C20739g;
import gy3.C87412m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C47350c;
import pe3.C47465a;
import rb0.C47970h0;
import rb0.C47975i0;
import s90.C48297c;
import s90.C48298d;
import sx3.C110818d0;
import te3.C49804i6;
import te3.C50528ne;
import te3.C50637o6;
import te3.C50666oe;
import zt3.C119157j;

/* renamed from: fx0.o */
public final class C45834o {

    /* renamed from: a */
    public static final C45834o f123751a = new C45834o();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, Integer> f123752b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final C47970h0 f123753c = new C47970h0(300000);

    /* renamed from: d */
    public static long f123754d;

    /* renamed from: e */
    public static Queue<List<Object>> f123755e = new LinkedList();

    /* renamed from: fx0.o$a */
    public static final class C45835a {

        /* renamed from: a */
        public static final C45835a f123756a = new C45835a();

        /* renamed from: a */
        public final C48298d mo71304a(String str) {
            if (str == null) {
                return null;
            }
            String b = C45834o.f123751a.mo71301b(str);
            MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C47975i0.f128681a.findSlot(b);
            if (multiProcessMMKV != null) {
                C49804i6 i6Var = new C49804i6();
                byte[] decodeBytes = multiProcessMMKV.decodeBytes(b);
                if (Util.isNullOrNil(decodeBytes)) {
                    return null;
                }
                try {
                    i6Var.parseFrom(decodeBytes);
                    C48298d dVar = i6Var.f135123d;
                    if (dVar != null) {
                        dVar.f129331e = str;
                    }
                    if (Log.getLogLevel() == 0) {
                        Log.m105926v("MicroMsg.MPDataLogic", "found:" + b + " last modify:" + Long.valueOf(i6Var.f135124e));
                    }
                    return i6Var.f135123d;
                } catch (IOException e) {
                    C45834o oVar = C45834o.f123751a;
                    Log.printErrStackTrace("MicroMsg.MPDataLogic", e, "get:" + b, new Object[0]);
                }
            }
            return null;
        }
    }

    /* renamed from: fx0.o$b */
    public static final class C45836b implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C50528ne f123757a;

        /* renamed from: b */
        public final /* synthetic */ int f123758b;

        /* renamed from: fx0.o$b$a */
        public static final class C45837a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C50666oe f123759d;

            /* renamed from: e */
            public final /* synthetic */ C50528ne f123760e;

            /* renamed from: f */
            public final /* synthetic */ int f123761f;

            public C45837a(C50666oe oeVar, C50528ne neVar, int i) {
                this.f123759d = oeVar;
                this.f123760e = neVar;
                this.f123761f = i;
            }

            public final void run() {
                T t;
                C45834o oVar = C45834o.f123751a;
                LinkedList<C48298d> linkedList = this.f123759d.f139100d;
                C87412m.m108593f(linkedList, "response.RelatedInfo");
                LinkedList<C50637o6> linkedList2 = this.f123760e.f138545d;
                C87412m.m108593f(linkedList2, "req.UrlInfo");
                int i = this.f123761f;
                Log.m105924i("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo RelatedInfo size=" + linkedList.size());
                boolean z = false;
                for (C48298d dVar : linkedList) {
                    if (!Util.isNullOrNil(dVar.f129331e)) {
                        Iterator<T> it = linkedList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (Util.isEqual(dVar.f129330d, ((C50637o6) t).f138970d)) {
                                break;
                            }
                        }
                        C50637o6 o6Var = (C50637o6) t;
                        if (o6Var != null) {
                            C45834o oVar2 = C45834o.f123751a;
                            String str = o6Var.f138971e;
                            C87412m.m108593f(str, "urlInfo.Url");
                            if (oVar2.mo71303d(str)) {
                                String str2 = o6Var.f138971e;
                                C87412m.m108593f(str2, "urlInfo.Url");
                                String str3 = dVar.f129331e;
                                C87412m.m108593f(str3, "relatedInfo.Url");
                                C40714i.m43970s(str2, str3);
                            }
                            String str4 = o6Var.f138971e;
                            C87412m.m108593f(str4, "urlInfo.Url");
                            String b = oVar2.mo71301b(str4);
                            dVar.f129330d = b;
                            C47970h0 h0Var = C45834o.f123753c;
                            C87412m.m108593f(b, "relatedInfo.ClientId");
                            h0Var.mo72741a(b);
                            if (!C20739g.m22694f(C45835a.f123756a.mo71304a(o6Var.f138971e), dVar)) {
                                try {
                                    C49804i6 i6Var = new C49804i6();
                                    i6Var.f135123d = dVar;
                                    i6Var.f135124e = System.currentTimeMillis();
                                    ((MultiProcessMMKV) C47975i0.f128681a.getSlotForWrite()).encode(i6Var.f135123d.f129330d, i6Var.toByteArray());
                                } catch (Exception e) {
                                    Log.m105920e("MicroMsg.MPDataLogic", "save ex " + e.getMessage());
                                }
                                C48297c cVar = dVar.f129333g;
                                if (cVar != null) {
                                    if (cVar.f129328e == 1) {
                                        C45821d dVar2 = C45821d.f123719a;
                                        String str5 = o6Var.f138971e;
                                        C87412m.m108593f(str5, "urlInfo.Url");
                                        dVar2.mo71283a(str5, o6Var.f138973g);
                                    } else {
                                        C45821d dVar3 = C45821d.f123719a;
                                        if (dVar3.mo71284b(o6Var.f138971e)) {
                                            Log.m105918d("MicroMsg.MPDataLogic", "url pay status: not pay url=" + o6Var.f138971e);
                                            String str6 = o6Var.f138971e;
                                            C87412m.m108593f(str6, "urlInfo.Url");
                                            dVar3.mo71287e(str6, false);
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    AppMsgRelatedInfoUpdateEvent appMsgRelatedInfoUpdateEvent = new AppMsgRelatedInfoUpdateEvent();
                    appMsgRelatedInfoUpdateEvent.f107364d.f107365a = i;
                    appMsgRelatedInfoUpdateEvent.asyncPublish(Looper.getMainLooper());
                }
            }
        }

        public C45836b(C50528ne neVar, int i) {
            this.f123757a = neVar;
            this.f123758b = i;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C45834o oVar = C45834o.f123751a;
            Log.m105924i("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo errType " + i + ", errCode " + i2 + ", errMsg " + str);
            LinkedList<C50637o6> linkedList = this.f123757a.f138545d;
            C87412m.m108593f(linkedList, "req.UrlInfo");
            for (C50637o6 o6Var : linkedList) {
                C45834o.f123752b.remove(o6Var.f138970d);
            }
            if (i == 0 && i2 == 0) {
                C47465a aVar = cVar.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAppMsgRelatedInfoResp");
                C50666oe oeVar = (C50666oe) aVar;
                C45834o oVar2 = C45834o.f123751a;
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MicroMsg.MPDataLogic");
                mmkv.encode("BizAppMsgRelatedInfoRefreshIntervalSec", oeVar.f139101e);
                C20734b.f58616a = oeVar.f139101e;
                mmkv.encode("BizAppMsgRelatedInfoMaxUrlCount", oeVar.f139102f);
                if (Util.isNullOrNil((List) oeVar.f139100d)) {
                    Log.m105928w("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo RelatedInfo is empty");
                    return;
                }
                ((C119157j) C119157j.f356862d).mo183876g(new C45837a(oeVar, this.f123757a, this.f123758b), "getAppMsgRelatedInfo");
            }
        }
    }

    /* renamed from: a */
    public final void mo71300a(LinkedList<C50637o6> linkedList, int i) {
        C87412m.m108594g(linkedList, "items");
        if (!Util.isNullOrNil((List) linkedList)) {
            C50528ne neVar = new C50528ne();
            f123753c.f128673a = mo71302c() * 1000;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                if (!f123752b.contains(((C50637o6) next).f138970d)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                String str = ((C50637o6) next2).f138970d;
                C47970h0 h0Var = f123753c;
                C87412m.m108593f(str, "id");
                if (true ^ h0Var.mo72742b(str)) {
                    arrayList2.add(next2);
                }
            }
            int decodeInt = MultiProcessMMKV.getMMKV("MicroMsg.MPDataLogic").decodeInt("BizAppMsgRelatedInfoMaxUrlCount", 10);
            Log.m105926v("MicroMsg.MPDataLogic", "maxUrlCount = " + decodeInt);
            neVar.f138545d.addAll(C110818d0.m150947s0(arrayList2, Math.max(decodeInt, 2)));
            if (!Util.isNullOrNil((List) neVar.f138545d)) {
                Log.m105924i("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo size=" + neVar.f138545d.size());
                neVar.f138546e = i;
                LinkedList<C50637o6> linkedList2 = neVar.f138545d;
                C87412m.m108593f(linkedList2, "req.UrlInfo");
                for (C50637o6 o6Var : linkedList2) {
                    f123752b.put(o6Var.f138970d, 1);
                    C47970h0 h0Var2 = f123753c;
                    String str2 = o6Var.f138970d;
                    C87412m.m108593f(str2, "info.ClientId");
                    h0Var2.mo72741a(str2);
                    if (Log.getLogLevel() == 0) {
                        Log.m105926v("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo url=" + o6Var.f138971e + ", clientId=" + o6Var.f138970d);
                    }
                }
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = neVar;
                bVar.f127067b = new C50666oe();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizappmsgrelatedinfo";
                bVar.f127069d = 2864;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C45836b(neVar, i));
            }
        }
    }

    /* renamed from: b */
    public final String mo71301b(String str) {
        C87412m.m108594g(str, "url");
        StringBuilder sb = new StringBuilder();
        sb.append("_mpdata_");
        ConcurrentHashMap<String, String> concurrentHashMap = C40714i.f109359a;
        sb.append(C40714i.m43968q(str, false, 2, (Object) null));
        return sb.toString();
    }

    /* renamed from: c */
    public final int mo71302c() {
        int decodeInt = MultiProcessMMKV.getMMKV("MicroMsg.MPDataLogic").decodeInt("BizAppMsgRelatedInfoRefreshIntervalSec", 300);
        Log.m105926v("MicroMsg.MPDataLogic", "refreshIntervalSec = " + decodeInt);
        int min = Math.min(decodeInt, 86400);
        if (min <= 0) {
            return 300;
        }
        return min;
    }

    /* renamed from: d */
    public final boolean mo71303d(String str) {
        C87412m.m108594g(str, "url");
        String[] strArr = {"__biz", "mid", "idx"};
        for (int i = 0; i < 3; i++) {
            if (C45590f.m50646f(str, strArr[i]) == null) {
                return true;
            }
        }
        return false;
    }
}
