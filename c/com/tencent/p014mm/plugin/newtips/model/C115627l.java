package com.tencent.p014mm.plugin.newtips.model;

import android.content.Context;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import f40.C86718e;
import gc2.C116945b;
import gc2.C75902d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jc2.C117343c;
import ob0.C11385n;
import ob0.C117747y;
import p626nv.C47299e;
import te3.vg4;
import te3.wg4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.newtips.model.l */
public class C115627l implements C11385n, C47299e {

    /* renamed from: f */
    public static HashMap<Integer, WeakReference<C115619a>> f346852f = new HashMap<>();

    /* renamed from: g */
    public static HashMap<String, WeakReference<C115619a>> f346853g = new HashMap<>();

    /* renamed from: d */
    public Map<String, List<C115626k>> f346854d = new HashMap();

    /* renamed from: e */
    public C69942c f346855e = null;

    /* renamed from: com.tencent.mm.plugin.newtips.model.l$d */
    public class C42590d implements C80883e<IPCString, IPCVoid> {
        public C42590d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C115627l.this.mo175769j(((IPCString) obj).f10315d, (C75902d.C75903a) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.newtips.model.l$c */
    public interface C69942c {
        /* renamed from: a */
        void mo96256a(C115620d dVar);
    }

    /* renamed from: com.tencent.mm.plugin.newtips.model.l$a */
    public class C115628a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117343c f346856d;

        /* renamed from: e */
        public final /* synthetic */ C115619a f346857e;

        public C115628a(C117343c cVar, C115619a aVar) {
            this.f346856d = cVar;
            this.f346857e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
            if (r5 != 2) goto L_0x00fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r9.f354435d, r5.f354435d) != false) goto L_0x00fb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r9.f354437f, r5.f354437f) != false) goto L_0x00fb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r9.f354437f, r5.f354437f) != false) goto L_0x00fb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r9.f354436e, r5.f354436e) != false) goto L_0x00fb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                com.tencent.mm.plugin.newtips.model.l r0 = com.tencent.p014mm.plugin.newtips.model.C115627l.this
                jc2.c r1 = r12.f346856d
                android.util.Pair r0 = r0.mo175764c(r1)
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                jc2.c r2 = r12.f346856d
                r3 = 0
                r1[r3] = r2
                java.lang.Object r2 = r0.first
                com.tencent.mm.plugin.newtips.model.n r2 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r2
                java.lang.String r2 = r2.f346867d
                r4 = 1
                r1[r4] = r2
                java.lang.Object r2 = r0.second
                te3.tg4 r2 = (te3.tg4) r2
                java.lang.String r5 = r2.f354436e
                r6 = 2
                r1[r6] = r5
                java.lang.String r5 = r2.f354437f
                r7 = 3
                r1[r7] = r5
                int r2 = r2.f354435d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5 = 4
                r1[r5] = r2
                java.lang.String r2 = "MicroMsg.NewTips.NewTipsManager"
                java.lang.String r5 = "showNewTip() path:%s show %s [%s,%s,%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
                jc2.c r1 = r12.f346856d
                java.lang.Object r5 = r0.first
                com.tencent.mm.plugin.newtips.model.n r5 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r5
                boolean r1 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162574j(r1, r5)
                if (r1 == 0) goto L_0x0183
                com.tencent.mm.plugin.newtips.model.a r1 = r12.f346857e
                com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162569e(r1)
                com.tencent.mm.plugin.newtips.model.a r5 = r12.f346857e
                java.lang.String r8 = "MicroMsg.NewTips.NewTipsHelper"
                if (r5 != 0) goto L_0x0057
                java.lang.String r5 = "isEqual() curNewTip == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r5)
                goto L_0x00fb
            L_0x0057:
                java.lang.Object r9 = r0.first
                if (r1 == r9) goto L_0x005d
                goto L_0x00fd
            L_0x005d:
                r9 = 0
                android.view.View r10 = r5.mo64133e()
                if (r10 != 0) goto L_0x0072
                java.lang.Object[] r10 = new java.lang.Object[r4]
                java.lang.String r5 = r5.getPath()
                r10[r3] = r5
                java.lang.String r5 = "getCurNewTipsShowTypeAboutInfo() path:%s root is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r10)
                goto L_0x00a2
            L_0x0072:
                android.view.View r10 = r5.mo64133e()     // Catch:{ Exception -> 0x0081 }
                r11 = 2131310194(0x7f093672, float:1.8238693E38)
                java.lang.Object r10 = r10.getTag(r11)     // Catch:{ Exception -> 0x0081 }
                te3.tg4 r10 = (te3.tg4) r10     // Catch:{ Exception -> 0x0081 }
                r9 = r10
                goto L_0x008f
            L_0x0081:
                r10 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r4]
                java.lang.String r10 = r10.toString()
                r11[r3] = r10
                java.lang.String r10 = "getCurNewTipsShowTypeAboutInfo() getTag(R.id.new_tips_tag_show_type_new) [%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r10, r11)
            L_0x008f:
                java.lang.Object[] r10 = new java.lang.Object[r6]
                java.lang.String r5 = r5.getPath()
                r10[r3] = r5
                java.lang.String r5 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162577m(r9)
                r10[r4] = r5
                java.lang.String r5 = "getCurNewTipsShowTypeAboutInfo() path:%s tipsInfo:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r10)
            L_0x00a2:
                java.lang.Object r5 = r0.second
                te3.tg4 r5 = (te3.tg4) r5
                if (r9 != 0) goto L_0x00ab
                if (r5 != 0) goto L_0x00ab
                goto L_0x00fb
            L_0x00ab:
                if (r9 == 0) goto L_0x00af
                if (r5 == 0) goto L_0x00b3
            L_0x00af:
                if (r9 != 0) goto L_0x00be
                if (r5 == 0) goto L_0x00be
            L_0x00b3:
                int r5 = r1.ordinal()
                if (r5 == 0) goto L_0x00fb
                if (r5 == r4) goto L_0x00fb
                if (r5 == r6) goto L_0x00fb
                goto L_0x00fd
            L_0x00be:
                int r8 = r1.ordinal()
                switch(r8) {
                    case 0: goto L_0x00fb;
                    case 1: goto L_0x00fb;
                    case 2: goto L_0x00fb;
                    case 3: goto L_0x00f1;
                    case 4: goto L_0x00e6;
                    case 5: goto L_0x00d1;
                    case 6: goto L_0x00c6;
                    default: goto L_0x00c5;
                }
            L_0x00c5:
                goto L_0x00fd
            L_0x00c6:
                int r8 = r9.f354435d
                int r5 = r5.f354435d
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r8, (int) r5)
                if (r5 == 0) goto L_0x00fd
                goto L_0x00fb
            L_0x00d1:
                java.lang.String r8 = r9.f354436e
                java.lang.String r10 = r5.f354436e
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r10)
                if (r8 == 0) goto L_0x00fd
                java.lang.String r8 = r9.f354437f
                java.lang.String r5 = r5.f354437f
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r5)
                if (r5 == 0) goto L_0x00fd
                goto L_0x00fb
            L_0x00e6:
                java.lang.String r8 = r9.f354437f
                java.lang.String r5 = r5.f354437f
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r5)
                if (r5 == 0) goto L_0x00fd
                goto L_0x00fb
            L_0x00f1:
                java.lang.String r8 = r9.f354436e
                java.lang.String r5 = r5.f354436e
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r5)
                if (r5 == 0) goto L_0x00fd
            L_0x00fb:
                r5 = 1
                goto L_0x00fe
            L_0x00fd:
                r5 = 0
            L_0x00fe:
                if (r5 == 0) goto L_0x010e
                java.lang.Object[] r0 = new java.lang.Object[r4]
                jc2.c r1 = r12.f346856d
                r0[r3] = r1
                java.lang.String r1 = "showNewTip() path:%s origin==new"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
                goto L_0x0199
            L_0x010e:
                com.tencent.mm.plugin.newtips.model.a r5 = r12.f346857e
                android.util.Pair r8 = new android.util.Pair
                te3.tg4 r9 = new te3.tg4
                r9.<init>()
                r8.<init>(r1, r9)
                if (r5 == 0) goto L_0x012a
                zt3.t r1 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.newtips.model.h r9 = new com.tencent.mm.plugin.newtips.model.h
                r9.<init>(r5, r8, r3)
                zt3.j r1 = (zt3.C119157j) r1
                r1.mo183895z(r9)
                r1 = 1
                goto L_0x012b
            L_0x012a:
                r1 = 0
            L_0x012b:
                if (r1 == 0) goto L_0x0169
                com.tencent.mm.plugin.newtips.model.a r5 = r12.f346857e
                if (r5 == 0) goto L_0x013f
                zt3.t r8 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.newtips.model.h r9 = new com.tencent.mm.plugin.newtips.model.h
                r9.<init>(r5, r0, r4)
                zt3.j r8 = (zt3.C119157j) r8
                r8.mo183895z(r9)
                r5 = 1
                goto L_0x0140
            L_0x013f:
                r5 = 0
            L_0x0140:
                java.lang.Object r8 = r0.first     // Catch:{ Exception -> 0x016a }
                r9 = r8
                com.tencent.mm.plugin.newtips.model.n r9 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r9     // Catch:{ Exception -> 0x016a }
                java.util.List<com.tencent.mm.plugin.newtips.model.k> r9 = r9.f346869f     // Catch:{ Exception -> 0x016a }
                if (r9 == 0) goto L_0x016a
                com.tencent.mm.plugin.newtips.model.n r8 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r8     // Catch:{ Exception -> 0x016a }
                java.util.List<com.tencent.mm.plugin.newtips.model.k> r8 = r8.f346869f     // Catch:{ Exception -> 0x016a }
                boolean r8 = r8.isEmpty()     // Catch:{ Exception -> 0x016a }
                if (r8 != 0) goto L_0x016a
                com.tencent.mm.plugin.newtips.model.l r8 = com.tencent.p014mm.plugin.newtips.model.C115627l.this     // Catch:{ Exception -> 0x016a }
                java.util.Map<java.lang.String, java.util.List<com.tencent.mm.plugin.newtips.model.k>> r8 = r8.f346854d     // Catch:{ Exception -> 0x016a }
                com.tencent.mm.plugin.newtips.model.a r9 = r12.f346857e     // Catch:{ Exception -> 0x016a }
                java.lang.String r9 = r9.getPath()     // Catch:{ Exception -> 0x016a }
                java.lang.Object r0 = r0.first     // Catch:{ Exception -> 0x016a }
                com.tencent.mm.plugin.newtips.model.n r0 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r0     // Catch:{ Exception -> 0x016a }
                java.util.List<com.tencent.mm.plugin.newtips.model.k> r0 = r0.f346869f     // Catch:{ Exception -> 0x016a }
                java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x016a }
                r8.put(r9, r0)     // Catch:{ Exception -> 0x016a }
                goto L_0x016a
            L_0x0169:
                r5 = 1
            L_0x016a:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                jc2.c r7 = r12.f346856d
                r0[r3] = r7
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0[r4] = r1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
                r0[r6] = r1
                java.lang.String r1 = "showNewTip() path:%s hideResult:%s showReuslt:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
                goto L_0x0199
            L_0x0183:
                java.lang.Object[] r1 = new java.lang.Object[r6]
                jc2.c r5 = r12.f346856d
                r1[r3] = r5
                java.lang.Object r0 = r0.first
                com.tencent.mm.plugin.newtips.model.n r0 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r0
                java.lang.String r0 = r0.toString()
                r1[r4] = r0
                java.lang.String r0 = "showNewTip() curNewTip(%s) not support %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
            L_0x0199:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.newtips.model.C115627l.C115628a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.newtips.model.l$b */
    public class C115629b implements Comparator<C115626k> {
        public C115629b(C115627l lVar) {
        }

        public int compare(Object obj, Object obj2) {
            C115626k kVar = (C115626k) obj;
            C115626k kVar2 = (C115626k) obj2;
            int i = kVar.field_priority;
            int i2 = kVar2.field_priority;
            return i != i2 ? i - i2 : Long.compare(kVar.field_beginShowTime, kVar2.field_beginShowTime);
        }
    }

    /* renamed from: f */
    public static void m162580f(List<C115626k> list) {
        for (C115626k next : list) {
            if (Util.isNullOrNil(next.field_dynamicPath)) {
                C116945b.yx0().mo175772n(next.field_path);
            } else {
                C116945b.yx0().mo175773o(next.field_dynamicPath);
            }
        }
    }

    /* renamed from: g */
    public static void m162581g(C117343c cVar) {
        if (cVar != null) {
            if (cVar.f351294c) {
                C116945b.yx0().mo175773o(cVar.f351292a);
                return;
            }
            C116945b.yx0().mo175772n(cVar.f351293b);
        }
    }

    /* renamed from: l */
    public static void m162582l(C115626k kVar) {
        C115626k kVar2 = kVar;
        if (kVar2 == null) {
            try {
                Log.m105920e("MicroMsg.NewTips.NewTipsManager", "reportDismissNewTips, newTipsInfo is null !!");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NewTips.NewTipsManager", e, (String) null, new Object[0]);
            }
        } else {
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(kVar2.field_tipId);
            objArr[1] = kVar2.field_uniqueId;
            objArr[2] = Util.isNullOrNil(kVar2.field_dynamicPath) ? C115624i.m162568d(kVar2.field_path) : kVar2.field_dynamicPath;
            String format = String.format("newtips_dismiss_%d-%s-%s", objArr);
            Context context = MMApplicationContext.getContext();
            if (!context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).getBoolean(format, false)) {
                int i = kVar2.field_tipId;
                int i2 = kVar2.field_tipType;
                Context context2 = MMApplicationContext.getContext();
                long j = context2.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).getLong("newtips_gettipstime", 0);
                long j2 = kVar2.field_beginShowTime;
                int i3 = i;
                long j3 = kVar2.field_overdueTime;
                long j4 = kVar2.field_disappearTime;
                Context context3 = MMApplicationContext.getContext();
                long j5 = j4;
                long j6 = context3.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).getLong("newtips_realshow_time", 0);
                Context context4 = MMApplicationContext.getContext();
                long j7 = j3;
                long j8 = context4.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).getLong("newtips_makeread_time", 0);
                long j9 = j8 - j6;
                int i4 = kVar2.field_showType;
                String str = kVar2.field_title;
                String str2 = kVar2.field_icon_url;
                String str3 = format;
                String d = Util.isNullOrNil(kVar2.field_dynamicPath) ? C115624i.m162568d(kVar2.field_path) : kVar2.field_dynamicPath;
                Log.m105925i("MicroMsg.NewTips.NewTipsManager", "newtipsreport:%d, id:%s_%s_%s", 2, Integer.valueOf(i3), kVar2.field_uniqueId, d);
                C115669n.INSTANCE.mo160131h(14995, Integer.valueOf(i3), 0, Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j7), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j8), Long.valueOf(j9), 4, Integer.valueOf(i4), str, str2, d, "", 2, 0L, kVar2.field_uniqueId);
                Context context5 = MMApplicationContext.getContext();
                context5.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).edit().putBoolean(str3, true).commit();
            }
        }
    }

    /* renamed from: a */
    public void mo175762a(int i) {
        mo175763b(new C117343c(i));
    }

    /* renamed from: b */
    public final void mo175763b(C117343c cVar) {
        LinkedList<String> linkedList;
        List<C115626k> b = C115621e.m162558b(C116945b.xx0().mo182009qq(cVar));
        ArrayList arrayList = (ArrayList) b;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C115626k kVar = (C115626k) it.next();
                kVar.field_state = 1;
                m162582l(kVar);
            }
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "clickNewTip(%s) clickNewTip tipsInfos state to NEW_TIPS_STATE_DISAPPEAR. ret: %s", cVar, Integer.valueOf(C116945b.xx0().mo182005Ow(b)));
            m162581g(cVar);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                wg4 wg4 = ((C115626k) it4.next()).field_parents;
                if (!(wg4 == null || (linkedList = wg4.f144043d) == null)) {
                    Iterator<String> it5 = linkedList.iterator();
                    while (it5.hasNext()) {
                        String next = it5.next();
                        int c = C115624i.m162567c(next);
                        C117343c cVar2 = c == 0 ? new C117343c(next) : new C117343c(c);
                        List<C115626k> qq = C116945b.xx0().mo182009qq(cVar2);
                        ArrayList arrayList2 = (ArrayList) qq;
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            C115626k kVar2 = (C115626k) it6.next();
                            kVar2.field_state = 1;
                            m162582l(kVar2);
                        }
                        Log.m105925i("MicroMsg.NewTips.NewTipsManager", "clickNewTip() clickNewTip parentTipsInfos(%s) state to NEW_TIPS_STATE_DISAPPEAR. ret: %s", next, Integer.valueOf(C116945b.xx0().mo182005Ow(qq)));
                        m162581g(cVar2);
                        Iterator it7 = arrayList2.iterator();
                        while (it7.hasNext()) {
                            C115626k kVar3 = (C115626k) it7.next();
                            mo175765d(C116945b.xx0().mo182004Lo(kVar3.field_uniqueId), kVar3, 1);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<com.tencent.p014mm.plugin.newtips.model.C115631n, te3.tg4> mo175764c(jc2.C117343c r19) {
        /*
            r18 = this;
            r0 = r19
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_NONE
            com.tencent.mm.plugin.newtips.model.n r2 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_COUNTER
            com.tencent.mm.plugin.newtips.model.n r3 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            boolean r6 = r0.f351294c
            if (r6 == 0) goto L_0x0012
            goto L_0x0019
        L_0x0012:
            int r6 = r0.f351293b
            switch(r6) {
                case 1: goto L_0x0019;
                case 2: goto L_0x0019;
                case 3: goto L_0x0019;
                case 4: goto L_0x0019;
                case 5: goto L_0x0019;
                case 6: goto L_0x0019;
                case 7: goto L_0x0019;
                case 8: goto L_0x0019;
                case 9: goto L_0x0019;
                case 10: goto L_0x0019;
                case 11: goto L_0x0019;
                case 12: goto L_0x0019;
                case 13: goto L_0x0019;
                case 14: goto L_0x0019;
                case 15: goto L_0x0019;
                case 16: goto L_0x0019;
                case 17: goto L_0x0019;
                case 18: goto L_0x0019;
                case 19: goto L_0x0019;
                case 20: goto L_0x0019;
                case 21: goto L_0x0019;
                case 22: goto L_0x0019;
                case 23: goto L_0x0017;
                case 24: goto L_0x0019;
                case 25: goto L_0x0019;
                case 26: goto L_0x0019;
                case 27: goto L_0x0019;
                case 28: goto L_0x0017;
                case 29: goto L_0x0017;
                case 30: goto L_0x0019;
                case 31: goto L_0x0019;
                case 32: goto L_0x0019;
                case 33: goto L_0x0019;
                case 34: goto L_0x0019;
                case 35: goto L_0x0019;
                case 36: goto L_0x0019;
                case 37: goto L_0x0019;
                case 38: goto L_0x0019;
                case 39: goto L_0x0019;
                case 40: goto L_0x0019;
                case 41: goto L_0x0019;
                case 42: goto L_0x0019;
                case 43: goto L_0x0019;
                case 44: goto L_0x0019;
                case 45: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            r6 = 0
            goto L_0x001a
        L_0x0019:
            r6 = 1
        L_0x001a:
            java.lang.String r7 = "MicroMsg.NewTips.NewTipsManager"
            if (r6 != 0) goto L_0x0032
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            java.lang.String r0 = "getShouldShowType() %s not support newTip"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r2)
            android.util.Pair r0 = new android.util.Pair
            te3.tg4 r2 = new te3.tg4
            r2.<init>()
            r0.<init>(r1, r2)
            return r0
        L_0x0032:
            jc2.b r6 = gc2.C116945b.xx0()
            java.util.List r6 = r6.mo182009qq(r0)
            java.util.List r6 = com.tencent.p014mm.plugin.newtips.model.C115621e.m162558b(r6)
            r8 = r6
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r9 = r8.size()
            if (r9 > 0) goto L_0x0052
            android.util.Pair r0 = new android.util.Pair
            te3.tg4 r2 = new te3.tg4
            r2.<init>()
            r0.<init>(r1, r2)
            return r0
        L_0x0052:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r9 = eb0.C31543z5.m39455e()
            long r9 = (long) r9
            java.util.Iterator r11 = r8.iterator()
        L_0x0060:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0083
            java.lang.Object r12 = r11.next()
            com.tencent.mm.plugin.newtips.model.k r12 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r12
            long r13 = r12.field_exposureTime
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0060
            r12.field_exposureTime = r9
            long r13 = r12.field_overdueTime
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x007f
            long r13 = r13 + r9
            r12.field_exposureDisappearTime = r13
        L_0x007f:
            r1.add(r12)
            goto L_0x0060
        L_0x0083:
            boolean r11 = r1.isEmpty()
            r12 = 2
            if (r11 != 0) goto L_0x00a5
            jc2.b r11 = gc2.C116945b.xx0()
            int r1 = r11.mo182005Ow(r1)
            java.lang.Object[] r11 = new java.lang.Object[r12]
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r11[r4] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r5] = r1
            java.lang.String r1 = "getShouldShowType() set exposureTime(%s). ret: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r11)
        L_0x00a5:
            int r1 = r8.size()
            if (r1 != r5) goto L_0x00ed
            java.lang.Object r1 = r8.get(r4)
            com.tencent.mm.plugin.newtips.model.k r1 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r1
            int r1 = r1.field_showType
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.m162599a(r1)
            boolean r0 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162574j(r0, r1)
            if (r0 == 0) goto L_0x00e0
            if (r1 != r2) goto L_0x00ce
            te3.tg4 r0 = new te3.tg4
            r0.<init>()
            r0.f354435d = r5
            android.util.Pair r1 = new android.util.Pair
            r2.f346869f = r6
            r1.<init>(r2, r0)
            return r1
        L_0x00ce:
            android.util.Pair r0 = new android.util.Pair
            r1.f346869f = r6
            java.lang.Object r2 = r8.get(r4)
            xh.o6 r2 = (p749xh.C118877o6) r2
            te3.tg4 r2 = com.tencent.p014mm.plugin.newtips.model.C115631n.m162600b(r1, r2)
            r0.<init>(r1, r2)
            return r0
        L_0x00e0:
            android.util.Pair r0 = new android.util.Pair
            r3.f346869f = r6
            te3.tg4 r1 = new te3.tg4
            r1.<init>()
            r0.<init>(r3, r1)
            return r0
        L_0x00ed:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r8.iterator()
            r10 = 0
        L_0x00f7:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0112
            java.lang.Object r11 = r9.next()
            com.tencent.mm.plugin.newtips.model.k r11 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r11
            int r13 = r11.field_showType
            com.tencent.mm.plugin.newtips.model.n r13 = com.tencent.p014mm.plugin.newtips.model.C115631n.m162599a(r13)
            if (r2 != r13) goto L_0x010e
            int r10 = r10 + 1
            goto L_0x00f7
        L_0x010e:
            r1.add(r11)
            goto L_0x00f7
        L_0x0112:
            if (r10 <= 0) goto L_0x0145
            boolean r9 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162574j(r0, r2)
            if (r9 == 0) goto L_0x0129
            te3.tg4 r0 = new te3.tg4
            r0.<init>()
            r0.f354435d = r10
            android.util.Pair r1 = new android.util.Pair
            r2.f346869f = r6
            r1.<init>(r2, r0)
            return r1
        L_0x0129:
            int r2 = r8.size()
            if (r10 != r2) goto L_0x0145
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            java.lang.String r0 = "getShouldShowType() path(%s): MMNEWTIPS_SHOWTYPE_COUNTER => MMNEWTIPS_SHOWTYPE_REDPOINT"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r0, r1)
            android.util.Pair r0 = new android.util.Pair
            r3.f346869f = r6
            te3.tg4 r1 = new te3.tg4
            r1.<init>()
            r0.<init>(r3, r1)
            return r0
        L_0x0145:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2[r5] = r4
            int r4 = r8.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r12] = r4
            java.lang.String r4 = "getShouldShowType() path(%s) (MMNEWTIPS_SHOWTYPE_COUNTER:%s, ALL:%s) postpone"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r4, r2)
            com.tencent.mm.plugin.newtips.model.l$b r2 = new com.tencent.mm.plugin.newtips.model.l$b
            r4 = r18
            r2.<init>(r4)
            java.util.Collections.sort(r1, r2)
            int r2 = r1.size()
            int r2 = r2 - r5
        L_0x016e:
            if (r2 < 0) goto L_0x0197
            java.lang.Object r5 = r1.get(r2)
            com.tencent.mm.plugin.newtips.model.k r5 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r5
            int r5 = r5.field_showType
            com.tencent.mm.plugin.newtips.model.n r5 = com.tencent.p014mm.plugin.newtips.model.C115631n.m162599a(r5)
            boolean r7 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162574j(r0, r5)
            if (r7 == 0) goto L_0x0194
            android.util.Pair r0 = new android.util.Pair
            r5.f346869f = r6
            java.lang.Object r1 = r1.get(r2)
            xh.o6 r1 = (p749xh.C118877o6) r1
            te3.tg4 r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.m162600b(r5, r1)
            r0.<init>(r5, r1)
            return r0
        L_0x0194:
            int r2 = r2 + -1
            goto L_0x016e
        L_0x0197:
            android.util.Pair r0 = new android.util.Pair
            r3.f346869f = r6
            te3.tg4 r1 = new te3.tg4
            r1.<init>()
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.newtips.model.C115627l.mo175764c(jc2.c):android.util.Pair");
    }

    /* renamed from: d */
    public final void mo175765d(List<C115626k> list, C115626k kVar, int i) {
        LinkedList<String> linkedList;
        if (i >= 10) {
            Log.m105920e("MicroMsg.NewTips.NewTipsManager", "logicDisappearParent() disappear fail!!!!!");
            return;
        }
        wg4 wg4 = kVar.field_parents;
        if (wg4 != null && (linkedList = wg4.f144043d) != null) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                ArrayList arrayList = new ArrayList();
                int c = C115624i.m162567c(next);
                C117343c cVar = c == 0 ? new C117343c(next) : new C117343c(c);
                for (C115626k next2 : list) {
                    if (cVar.f351294c) {
                        if (Util.isEqual(next2.field_dynamicPath, cVar.f351292a)) {
                            next2.field_state = 1;
                            arrayList.add(next2);
                            mo175765d(list, next2, i + 1);
                            m162582l(next2);
                        }
                    } else if (next2.field_path == cVar.f351293b) {
                        next2.field_state = 1;
                        arrayList.add(next2);
                        mo175765d(list, next2, i + 1);
                        m162582l(next2);
                    }
                }
                Log.m105919d("MicroMsg.NewTips.NewTipsManager", "clickNewTip() clickNewTip parentTipsInfos(%s) state to NEW_TIPS_STATE_DISAPPEAR. ret: %s layer: %s", next, Integer.valueOf(C116945b.xx0().mo182005Ow(arrayList)), Integer.valueOf(i));
                m162581g(cVar);
            }
        }
    }

    /* renamed from: e */
    public void mo175766e(int i, boolean z) {
        C115620d jo = C116945b.vx0().mo182002jo(i);
        if (jo == null) {
            Log.m105920e("MicroMsg.NewTips.NewTipsManager", "newTipsInfo is null , makeRead failed!!");
            return;
        }
        Log.m105925i("MicroMsg.NewTips.NewTipsManager", "dancy new tips tipsId:%s, make read: %s", Integer.valueOf(i), Boolean.valueOf(z));
        if (jo.field_tipType == 0) {
            jo.field_hadRead = z;
            C116945b.vx0().update(jo, new String[0]);
        }
        if (jo.field_tipType == 1) {
            jo.field_hadRead = z;
            C116945b.vx0().update(jo, new String[0]);
        }
        long nowMilliSecond = Util.nowMilliSecond();
        Context context = MMApplicationContext.getContext();
        context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", nowMilliSecond).commit();
    }

    /* renamed from: h */
    public final void mo175767h(int i, int i2, int i3, String str, String str2) {
        C115620d jo = C116945b.vx0().mo182002jo(i);
        if (jo == null) {
            C115620d dVar = new C115620d();
            dVar.field_tipId = i;
            dVar.field_tipVersion = i2;
            dVar.field_tipkey = str;
            dVar.field_tipType = i3;
            if (dVar.field_tipsShowInfo == null) {
                dVar.field_tipsShowInfo = new vg4();
            }
            dVar.field_tipsShowInfo.f354506g = str2;
            C116945b.vx0().insert(dVar);
            if (i3 != 0) {
                return;
            }
            if (!dVar.field_isExit || i2 != dVar.field_tipVersion) {
                C86709a0.m107524d().mo123460f(new C42588b(i, i2, str));
                Log.m105918d("MicroMsg.NewTips.NewTipsManager", "dancy doScene NetScenePushCompatNewTips！！");
                return;
            }
            return;
        }
        if (i3 == 0 && (!jo.field_isExit || i2 != jo.field_tipVersion)) {
            C86709a0.m107524d().mo123460f(new C42588b(i, i2, str));
            Log.m105918d("MicroMsg.NewTips.NewTipsManager", "dancy doScene NetScenePushCompatNewTips！！");
        }
        if ((i3 == 0 && i2 != jo.field_tipVersion) || (i3 == 1 && i2 > jo.field_tipVersion)) {
            jo.field_tipId = i;
            jo.field_tipVersion = i2;
            jo.field_tipkey = str;
            jo.field_tipType = i3;
            jo.field_isExit = false;
            if (jo.field_tipsShowInfo == null) {
                jo.field_tipsShowInfo = new vg4();
            }
            jo.field_tipsShowInfo.f354506g = str2;
            C116945b.vx0().update(jo, new String[0]);
        }
    }

    /* renamed from: i */
    public void mo175768i(String str) {
        if (MMApplicationContext.isMainProcess()) {
            mo175769j(str, (C75902d.C75903a) null);
        } else {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(str), C42590d.class, (C1256g) null);
        }
    }

    /* renamed from: j */
    public void mo175769j(String str, C75902d.C75903a aVar) {
        String nullAs = Util.nullAs(str, "null");
        boolean z = MultiProcessMMKV.getMMKV("new_tips_" + C86718e.m107549h()).getBoolean(nullAs, false);
        Log.m105925i("MicroMsg.NewTips.NewTipsManager", "registerLocalNewTips() uniqueId(%s) isReject(%s)", str, Boolean.valueOf(z));
        if (!z) {
            if (aVar != null) {
                C75902d.f222578a.put(str, aVar);
            }
            C86709a0.m107524d().mo123460f(new C42589c(str));
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "registerLocalNewTips() uniqueId:%s", str);
        }
    }

    /* renamed from: k */
    public void mo175770k(C115619a aVar) {
        if (aVar == null) {
            Log.m105924i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() iNewTipsView is null");
        } else if (Util.isNullOrNil(aVar.getPath())) {
            Log.m105924i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() iNewTipsView.getPath() is null");
        } else {
            if (aVar.mo64137l()) {
                String path = aVar.getPath();
                WeakReference weakReference = f346853g.get(path);
                if (weakReference == null || !aVar.equals((C115619a) weakReference.get())) {
                    f346853g.put(path, new WeakReference(aVar));
                    mo175773o(path);
                } else {
                    Log.m105925i("MicroMsg.NewTips.NewTipsManager", "registerNewTips(%s) iNewTipsView had registed!", path);
                    mo175773o(path);
                    return;
                }
            } else {
                int c = C115624i.m162567c(aVar.getPath());
                WeakReference weakReference2 = f346852f.get(Integer.valueOf(c));
                if (weakReference2 == null || !aVar.equals((C115619a) weakReference2.get())) {
                    f346852f.put(Integer.valueOf(c), new WeakReference(aVar));
                    mo175772n(c);
                } else {
                    Log.m105925i("MicroMsg.NewTips.NewTipsManager", "registerNewTips(%s) iNewTipsView had registed!", aVar.getPath());
                    mo175772n(c);
                    return;
                }
            }
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() register %s (%s) [%s] (%s)", aVar.getPath(), Boolean.valueOf(aVar.mo64137l()), aVar.toString(), aVar.getClass().getName() + "@" + Integer.toHexString(aVar.hashCode()));
        }
    }

    /* renamed from: m */
    public void mo175771m(int i, long j) {
        C115620d jo = C116945b.vx0().mo182002jo(i);
        if (jo == null) {
            Log.m105920e("MicroMsg.NewTips.NewTipsManager", "setPageStayTime fail! newTipsInfo is null!!");
            return;
        }
        jo.field_pagestaytime = j;
        C116945b.vx0().update(jo, new String[0]);
    }

    /* renamed from: n */
    public void mo175772n(int i) {
        if (i == 0) {
            Log.m105924i("MicroMsg.NewTips.NewTipsManager", "showNewTip() path == 0");
        } else {
            mo175774p(f346852f.get(Integer.valueOf(i)), new C117343c(i));
        }
    }

    /* renamed from: o */
    public void mo175773o(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.NewTips.NewTipsManager", "showNewTip() dynamicPath is null");
        } else {
            mo175774p(f346853g.get(str), new C117343c(str));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.NewTips.NewTipsManager", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar.getType() == 597 && i == 0 && i2 == 0) {
            C42588b bVar = (C42588b) yVar;
            boolean z = bVar.f115233f;
            C115620d jo = C116945b.vx0().mo182002jo(bVar.f115234g);
            if (jo != null) {
                jo.field_isReject = z;
                Log.m105925i("MicroMsg.NewTips.NewTipsManager", "Newtips push is reject: %s", Boolean.valueOf(z));
                C116945b.vx0().update(jo, new String[0]);
            }
        }
    }

    /* renamed from: p */
    public final void mo175774p(WeakReference<C115619a> weakReference, C117343c cVar) {
        if (weakReference == null) {
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "showNewTip() weakReference(%s) is null", cVar);
            return;
        }
        C115619a aVar = weakReference.get();
        if (aVar == null) {
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "showNewTip() curNewTip(%s) is null", cVar);
        } else if (C115624i.m162572h(aVar)) {
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "showNewTip() curNewTip(%s) is show old new tip", cVar);
        } else {
            ((C119157j) C119157j.f356862d).mo183875f(new C115628a(cVar, aVar));
        }
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* renamed from: q */
    public void mo175775q(String str) {
        Iterator it;
        String str2 = str;
        if (str2 != null && ((HashMap) this.f346854d).containsKey(str2)) {
            List list = (List) ((HashMap) this.f346854d).remove(str2);
            String str3 = "_newtips_report";
            ? r5 = 0;
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            C115626k kVar = (C115626k) it4.next();
                            Object[] objArr = new Object[3];
                            objArr[r5] = Integer.valueOf(kVar.field_tipId);
                            objArr[1] = kVar.field_uniqueId;
                            objArr[2] = Util.isNullOrNil(kVar.field_dynamicPath) ? C115624i.m162568d(kVar.field_path) : kVar.field_dynamicPath;
                            String format = String.format("newtips_show_%d-%s-%s", objArr);
                            Context context = MMApplicationContext.getContext();
                            if (!context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str3, r5).getBoolean(format, r5)) {
                                int i = kVar.field_tipId;
                                int i2 = kVar.field_tipType;
                                Context context2 = MMApplicationContext.getContext();
                                int i3 = i;
                                long j = context2.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str3, r5).getLong("newtips_gettipstime", 0);
                                long nowMilliSecond = Util.nowMilliSecond();
                                Context context3 = MMApplicationContext.getContext();
                                context3.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str3, 0).edit().putLong("newtips_realshow_time", nowMilliSecond).commit();
                                int i4 = kVar.field_showType;
                                Object obj = kVar.field_title;
                                Object obj2 = kVar.field_icon_url;
                                it = it4;
                                String d = Util.isNullOrNil(kVar.field_dynamicPath) ? C115624i.m162568d(kVar.field_path) : kVar.field_dynamicPath;
                                Log.m105925i("MicroMsg.NewTips.NewTipsManager", "newtipsreport:%d, id:%s_%s_%s", 1, Integer.valueOf(i3), kVar.field_uniqueId, d);
                                C115669n.INSTANCE.mo160131h(14995, Integer.valueOf(i3), 0, Integer.valueOf(i2), Long.valueOf(j), "", "", "", Long.valueOf(nowMilliSecond), "", "", "", Integer.valueOf(i4), obj, obj2, d, "", 1, 0, kVar.field_uniqueId);
                                Context context4 = MMApplicationContext.getContext();
                                StringBuilder sb = new StringBuilder();
                                sb.append(MMApplicationContext.getDefaultPreferencePath());
                                str3 = str3;
                                sb.append(str3);
                                context4.getSharedPreferences(sb.toString(), 0).edit().putBoolean(format, true).commit();
                            } else {
                                it = it4;
                            }
                            it4 = it;
                            r5 = 0;
                        }
                        return;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NewTips.NewTipsManager", e, (String) null, new Object[0]);
                    return;
                }
            }
            Log.m105920e("MicroMsg.NewTips.NewTipsManager", "reportShowNewTips, newTipsInfo is null !!");
        }
    }

    /* renamed from: r */
    public void mo175776r(C115619a aVar) {
        if (aVar == null) {
            Log.m105924i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips() iNewTipsView is null");
        } else if (Util.isNullOrNil(aVar.getPath())) {
            Log.m105924i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips() iNewTipsView.getPath() is null");
        } else {
            if (aVar.mo64137l()) {
                String path = aVar.getPath();
                if (f346853g.get(path) != null) {
                    f346853g.remove(path);
                }
            } else {
                int c = C115624i.m162567c(aVar.getPath());
                if (f346852f.get(Integer.valueOf(c)) != null) {
                    f346852f.remove(Integer.valueOf(c));
                }
            }
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips %s %s", aVar.getPath(), Boolean.valueOf(aVar.mo64137l()));
        }
    }
}
