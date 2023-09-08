package com.tencent.p014mm.plugin.appbrand.appusage;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C40434o0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81495g1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import ob0.C89132b;
import rp0.C90077a;
import rx3.C13598b0;
import te3.C49379f5;
import te3.C50385md2;
import te3.lm4;
import te3.ra4;
import te3.sa4;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.c */
public final class C81470c extends C86301e {

    /* renamed from: d */
    public final LinkedList<sa4> f239056d = new LinkedList<>();

    /* renamed from: e */
    public final MTimerHandler f239057e = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C81473c(this), false);

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.c$a */
    public interface C81471a {
        /* renamed from: a */
        void mo113777a(LocalUsageInfo localUsageInfo, LocalUsageInfo localUsageInfo2, LocalUsageInfo localUsageInfo3);

        /* renamed from: b */
        void mo113778b(LocalUsageInfo localUsageInfo);

        /* renamed from: c */
        void mo113779c(LocalUsageInfo localUsageInfo);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.c$b */
    public /* synthetic */ class C81472b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f239058a;

        static {
            int[] iArr = new int[C40434o0.C40435a.values().length];
            iArr[0] = 1;
            f239058a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.c$c */
    public static final class C81473c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C81470c f239059d;

        public C81473c(C81470c cVar) {
            this.f239059d = cVar;
        }

        public final boolean onTimerExpired() {
            this.f239059d.yx0(C40434o0.C40435a.Timeout);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.c$d */
    public static final class C81474d implements C81495g1.C81497b {
        /* renamed from: a */
        public void mo113780a(C89132b.C89134c<C50385md2> cVar) {
            C81500i0 i0Var;
            if (!C90077a.m112679b(cVar) && (i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class)) != null) {
                i0Var.doNotify(MStorageEventData.EventType.BATCH, 3, (Object) null);
            }
        }

        /* renamed from: b */
        public void mo113781b() {
            C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
            if (i0Var != null) {
                i0Var.doNotify(MStorageEventData.EventType.BATCH, 3, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.c$e */
    public static final class C81475e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C40434o0.C40435a f239060a;

        /* renamed from: b */
        public final /* synthetic */ C81470c f239061b;

        /* renamed from: c */
        public final /* synthetic */ LinkedList<sa4> f239062c;

        public C81475e(C40434o0.C40435a aVar, C81470c cVar, LinkedList<sa4> linkedList) {
            this.f239060a = aVar;
            this.f239061b = cVar;
            this.f239062c = linkedList;
        }

        public Object call(Object obj) {
            String str;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("updateWxaStarRecord, onResponse reason=[");
            sb.append(this.f239060a.f108665d);
            sb.append("], cgi=[");
            if (cVar == null) {
                str = "null";
            } else {
                str = String.format(Locale.US, "%d %d %s", new Object[]{Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c});
            }
            sb.append(str);
            sb.append(']');
            Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", sb.toString());
            if (!C90077a.m112679b(cVar)) {
                C81470c.wx0(this.f239061b, this.f239062c);
            } else if (((lm4) cVar.f256796d).f137520d == null) {
                Log.m105920e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "updateWxaStarRecord, onResponse reason=[" + this.f239060a.f108665d + "] NULL wxa_resp");
            } else {
                Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "updateWxaStarRecord, onResponse reason=[" + this.f239060a.f108665d + "], ErrCode=" + ((lm4) cVar.f256796d).f137520d.f140139d);
                if (((lm4) cVar.f256796d).f137520d.f140139d != 0) {
                    Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "jacob updateWxaStarRecord fail due to errcode = " + ((lm4) cVar.f256796d).f137520d.f140139d + ", errMsg = " + ((lm4) cVar.f256796d).f137520d.f140140e);
                    if (((lm4) cVar.f256796d).f137520d.f140139d == -2 && BuildInfo.IS_FLAVOR_RED) {
                        throw new Exception("updateWxaStarRecord with incorrect params");
                    }
                }
                int i = ((lm4) cVar.f256796d).f137520d.f140139d;
                if (i != 0) {
                    if (i != 10001) {
                        C81495g1.C81496a.m99972a(C81495g1.f239096a, 0, 0, (C81495g1.C81497b) null, 7, (Object) null);
                    } else {
                        C81470c.wx0(this.f239061b, this.f239062c);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public static final ra4 vx0(C81470c cVar, LocalUsageInfo localUsageInfo) {
        cVar.getClass();
        if (localUsageInfo == null) {
            return null;
        }
        ra4 ra4 = new ra4();
        ra4.f185147d = localUsageInfo.f239040d;
        ra4.f185148e = localUsageInfo.f239042f;
        return ra4;
    }

    public static final void wx0(C81470c cVar, List list) {
        cVar.getClass();
        if (!list.isEmpty()) {
            cVar.requireAccountInitialized();
            synchronized (cVar.f239056d) {
                cVar.requireAccountInitialized();
                cVar.f239056d.addAll(0, list);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "deserializeFromDisk, read kv failed, e = " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccountInitialized(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r4, r0)
            com.tencent.mm.plugin.appbrand.app.g2 r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.vx0()
            r4.getClass()
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            tr0.a r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238478q
            java.lang.String r0 = "AppBrandCollectionModifyQueue"
            byte[] r4 = r4.mo124712jo(r0)
            if (r4 == 0) goto L_0x0064
            int r0 = r4.length
            if (r0 != 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0064
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            tr0.a r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238478q
            java.lang.String r1 = "AppBrandCollectionModifyQueue"
            r0.mo124711V3(r1)
            te3.f5 r0 = new te3.f5     // Catch:{ Exception -> 0x004d }
            r0.<init>()     // Catch:{ Exception -> 0x004d }
            r0.parseFrom(r4)     // Catch:{ Exception -> 0x004d }
            r3.requireAccountInitialized()     // Catch:{ Exception -> 0x004d }
            java.util.LinkedList<te3.sa4> r4 = r3.f239056d     // Catch:{ Exception -> 0x004d }
            monitor-enter(r4)     // Catch:{ Exception -> 0x004d }
            r3.requireAccountInitialized()     // Catch:{ all -> 0x004a }
            java.util.LinkedList<te3.sa4> r1 = r3.f239056d     // Catch:{ all -> 0x004a }
            java.util.LinkedList<te3.sa4> r0 = r0.f133296d     // Catch:{ all -> 0x004a }
            r1.addAll(r0)     // Catch:{ all -> 0x004a }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x004a }
            monitor-exit(r4)     // Catch:{ Exception -> 0x004d }
            goto L_0x0064
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x004d }
            throw r0     // Catch:{ Exception -> 0x004d }
        L_0x004d:
            r4 = move-exception
            java.lang.String r0 = "MicroMsg.AppBrandCollectionModifyQueue[collection]"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "deserializeFromDisk, read kv failed, e = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appusage.C81470c.onAccountInitialized(android.content.Context):void");
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        C49379f5 f5Var = new C49379f5();
        requireAccountInitialized();
        synchronized (this.f239056d) {
            LinkedList<sa4> linkedList = f5Var.f133296d;
            requireAccountInitialized();
            linkedList.addAll(this.f239056d);
        }
        if (!f5Var.f133296d.isEmpty()) {
            try {
                C81161g2.requireAccountInitializedOnDemand();
                C81161g2.f238478q.mo124710Lo("AppBrandCollectionModifyQueue", f5Var.toByteArray());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "serializeToDisk, write kv failed, e = " + e);
            }
        }
    }

    public final void xx0(sa4 sa4, C40434o0.C40435a aVar) {
        C87412m.m108594g(sa4, "op");
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        requireAccountInitialized();
        synchronized (this.f239056d) {
            requireAccountInitialized();
            this.f239056d.addLast(sa4);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (C81472b.f239058a[aVar.ordinal()] == 1) {
            this.f239057e.startTimer(30000);
        } else {
            yx0(aVar);
        }
    }

    public final void yx0(C40434o0.C40435a aVar) {
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason = " + aVar.name());
        this.f239057e.stopTimer();
        LinkedList linkedList = new LinkedList();
        requireAccountInitialized();
        synchronized (this.f239056d) {
            requireAccountInitialized();
            linkedList.addAll(this.f239056d);
            requireAccountInitialized();
            this.f239056d.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (BuildInfo.IS_FLAVOR_RED) {
            Iterator it = linkedList.iterator();
            String str = "";
            while (it.hasNext()) {
                sa4 sa4 = (sa4) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(str + "self oper " + sa4.f185403h + "self sence" + sa4.f185402g);
                sb.append("self info ");
                ra4 ra4 = sa4.f185399d;
                Integer num = null;
                sb.append(ra4 != null ? ra4.f185147d : null);
                sb.append(' ');
                ra4 ra42 = sa4.f185399d;
                sb.append(ra42 != null ? Integer.valueOf(ra42.f185148e) : null);
                sb.append(' ');
                String sb4 = sb.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append("prev info ");
                ra4 ra43 = sa4.f185400e;
                sb5.append(ra43 != null ? ra43.f185147d : null);
                sb5.append(' ');
                ra4 ra44 = sa4.f185400e;
                sb5.append(ra44 != null ? Integer.valueOf(ra44.f185148e) : null);
                sb5.append(' ');
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                sb7.append("next info ");
                ra4 ra45 = sa4.f185401f;
                sb7.append(ra45 != null ? ra45.f185147d : null);
                sb7.append(' ');
                ra4 ra46 = sa4.f185401f;
                if (ra46 != null) {
                    num = Integer.valueOf(ra46.f185148e);
                }
                sb7.append(num);
                sb7.append(' ');
                str = sb7.toString();
            }
            Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "jacob queue " + str);
        }
        if (linkedList.isEmpty()) {
            Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "triggerRequest reason=[" + aVar.f108665d + "], queue empty");
            if (aVar == C40434o0.C40435a.ClosePullDown) {
                C81495g1.C81496a.m99972a(C81495g1.f239096a, 2, 0, new C81474d(), 2, (Object) null);
            } else if (aVar == C40434o0.C40435a.CloseCollectionList) {
                C81495g1.C81496a.m99972a(C81495g1.f239096a, 2, 0, (C81495g1.C81497b) null, 6, (Object) null);
            }
        } else {
            Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "run cgi reason=[" + aVar.f108665d + "], queue_size=" + linkedList.size());
            new C40434o0(linkedList, aVar.f108665d).mo9225i().mo123419C(new C81475e(aVar, this, linkedList));
        }
    }
}
