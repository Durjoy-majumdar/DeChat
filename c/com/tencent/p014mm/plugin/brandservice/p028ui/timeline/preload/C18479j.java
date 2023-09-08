package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.pluginsdk.model.C19463t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dx0.C31332a;
import fy0.C20734b;
import gw0.C76073b;
import h81.C32735h;
import hc0.C20937c;
import ic0.C98661k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kw0.C46746a;
import p243tn.C14050a;
import p248ug.C102027b;
import s90.C77630j;
import wc3.C22881c;
import wd3.C118762j;
import wd3.C22898h;
import wd3.C22904o;
import wd3.C22906q;
import wd3.C22908r;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j */
public class C18479j {

    /* renamed from: i */
    public static HashSet<String> f51305i = new HashSet<>();

    /* renamed from: j */
    public static HashSet<String> f51306j = new HashSet<>();

    /* renamed from: k */
    public static Boolean f51307k = null;

    /* renamed from: l */
    public static Boolean f51308l = null;

    /* renamed from: a */
    public BizTimeLineUI f51309a;

    /* renamed from: b */
    public int f51310b = 0;

    /* renamed from: c */
    public List<C19623o0> f51311c = new LinkedList();

    /* renamed from: d */
    public List<C19623o0> f51312d;

    /* renamed from: e */
    public List<C19623o0> f51313e;

    /* renamed from: f */
    public boolean f51314f = false;

    /* renamed from: g */
    public boolean f51315g = false;

    /* renamed from: h */
    public boolean f51316h = false;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j$a */
    public class C18480a implements MessageQueue.IdleHandler {
        public C18480a() {
        }

        public boolean queueIdle() {
            C18479j jVar = C18479j.this;
            jVar.getClass();
            if (C18479j.f51307k == null) {
                C18479j.m19131h();
            }
            if (!C18479j.f51307k.booleanValue()) {
                return false;
            }
            C31332a.m39373a("BizTimeLineImgLoaderThread", new C18485k(jVar), 0);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j$b */
    public class C18481b implements Runnable {
        public C18481b() {
        }

        public void run() {
            int i;
            C19623o0 o0Var;
            boolean z;
            int i2;
            LinkedList<C77630j> linkedList;
            int size;
            C77630j jVar;
            C18479j jVar2 = C18479j.this;
            jVar2.f51314f = false;
            BizTimeLineUI bizTimeLineUI = jVar2.f51309a;
            if (bizTimeLineUI != null && !bizTimeLineUI.isFinishing()) {
                if (C18479j.f51308l == null) {
                    C18479j.m19131h();
                }
                if (C18479j.f51308l.booleanValue() && !NetStatusUtil.isWifi((Context) C18479j.this.f51309a)) {
                    return;
                }
                if (!C18479j.m19130a(C18479j.this)) {
                    Log.m105926v("MicroMsg.BizTimeLineImgLoader", "not all visibleItem loaded");
                    return;
                }
                C18479j jVar3 = C18479j.this;
                jVar3.getClass();
                int i3 = 0;
                while (true) {
                    i = 2;
                    try {
                        if (i3 >= jVar3.f51312d.size() + ((LinkedList) jVar3.f51311c).size()) {
                            break;
                        }
                        o0Var = jVar3.mo23106g(i3);
                        if (o0Var != null && o0Var.mo25754B2() && o0Var.field_isRead != 1 && !C18479j.f51305i.contains(o0Var.mo25768r2())) {
                            Log.m105927v("MicroMsg.BizTimeLineImgLoader", "getNextPreloadInfo pos=%d,msg id=%d", Integer.valueOf(i3), Long.valueOf(o0Var.field_msgId));
                            break;
                        } else {
                            i3++;
                            jVar3.mo23101b(o0Var.mo25768r2());
                        }
                    } catch (Exception e) {
                        Log.m105929w("MicroMsg.BizTimeLineImgLoader", "getNextPreloadInfo %s", e.getMessage());
                    }
                }
                o0Var = null;
                if (o0Var == null) {
                    Log.m105926v("MicroMsg.BizTimeLineImgLoader", "not loading");
                    C18479j jVar4 = C18479j.this;
                    jVar4.f51316h = true;
                    jVar4.mo23105f();
                    return;
                }
                C18479j jVar5 = C18479j.this;
                Class cls = C76073b.class;
                jVar5.getClass();
                if (!o0Var.mo25754B2()) {
                    jVar5.mo23111m();
                    return;
                }
                Log.m105925i("MicroMsg.BizTimeLineImgLoader", "preLoadNext img %s,%d", o0Var.field_talker, Long.valueOf(o0Var.field_msgId));
                jVar5.mo23101b(o0Var.mo25768r2());
                LinkedList<C77630j> linkedList2 = ((C76073b) C86312j.m106911c(cls)).mo94597JZ(o0Var.field_msgId, o0Var.field_content).f226295i;
                if (Util.isNullOrNil((List) linkedList2)) {
                    jVar5.mo23111m();
                    return;
                }
                int firstVisiblePosition = jVar5.f51309a.f50235f.getFirstVisiblePosition();
                int lastVisiblePosition = jVar5.f51309a.f50235f.getLastVisiblePosition();
                int i4 = firstVisiblePosition > 0 ? firstVisiblePosition - 1 : 0;
                int i5 = lastVisiblePosition > 0 ? lastVisiblePosition - 1 : 0;
                while (true) {
                    if (i4 > i5) {
                        z = false;
                        break;
                    }
                    C19623o0 g = jVar5.mo23106g(i4);
                    if (g != null && g.field_msgId == o0Var.field_msgId) {
                        Log.m105927v("MicroMsg.BizTimeLineImgLoader", "isVisibleItem pos=%d,msg id=%d", Integer.valueOf(i4), Long.valueOf(o0Var.field_msgId));
                        z = true;
                        break;
                    }
                    i4++;
                }
                int size2 = linkedList2.size();
                C22881c cVar = C22881c.f65777a;
                if (cVar.mo36060e()) {
                    boolean z2 = cVar.mo36059d().getBoolean("biz_time_line_need_preload_fold", true);
                    Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy needFoldCoverPreload %b", Boolean.valueOf(z2));
                    if (!z2) {
                        size2 = Math.min(size2, 2);
                    }
                }
                int i6 = size2;
                if (!z) {
                    i = 0;
                }
                boolean z3 = false;
                while (i < i6) {
                    C77630j jVar6 = linkedList2.get(i);
                    if (Util.isNullOrNil(jVar6.f226330i)) {
                        i2 = i6;
                    } else {
                        if (i == 0) {
                            if ((o0Var.mo25754B2() && (size = (linkedList = ((C76073b) C86312j.m106911c(cls)).mo94597JZ(o0Var.field_msgId, o0Var.field_content).f226295i).size()) > 0 && (jVar = linkedList.get(0)) != null) ? C20734b.m22688a(o0Var, jVar, size) : false) {
                                i2 = i6;
                                if (!jVar5.mo23103d(jVar6, jVar6.f226330i, o0Var.field_msgId, i, true)) {
                                }
                            } else {
                                i2 = i6;
                                String str = jVar6.f226330i;
                                if (!Util.isNullOrNil(jVar6.f226312D)) {
                                    str = C92721n.m116882j(jVar6);
                                }
                                if (!jVar5.mo23103d(jVar6, str, o0Var.field_msgId, i, false)) {
                                }
                            }
                        } else {
                            i2 = i6;
                            if (!jVar5.mo23103d(jVar6, jVar6.f226330i, o0Var.field_msgId, i, false)) {
                            }
                        }
                        z3 = true;
                    }
                    i++;
                    i6 = i2;
                }
                if (!z3) {
                    jVar5.mo23111m();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j$c */
    public class C18482c implements C22906q.C22907a {

        /* renamed from: a */
        public final /* synthetic */ long f51319a;

        /* renamed from: b */
        public final /* synthetic */ int f51320b;

        public C18482c(long j, int i) {
            this.f51319a = j;
            this.f51320b = i;
        }

        public void onFinish() {
            C18479j jVar = C18479j.this;
            int i = jVar.f51310b - 1;
            jVar.f51310b = i;
            Log.m105919d("MicroMsg.BizTimeLineImgLoader", "doLoadImage onFinish loadingCount=%d", Integer.valueOf(i));
            C18479j.this.mo23110l(this.f51319a, this.f51320b);
        }

        public void onStart() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j$d */
    public class C18483d implements C22906q.C22907a {

        /* renamed from: a */
        public final /* synthetic */ long f51322a;

        /* renamed from: b */
        public final /* synthetic */ int f51323b;

        public C18483d(long j, int i) {
            this.f51322a = j;
            this.f51323b = i;
        }

        public void onFinish() {
            C18479j jVar = C18479j.this;
            int i = jVar.f51310b - 1;
            jVar.f51310b = i;
            Log.m105919d("MicroMsg.BizTimeLineImgLoader", "doLoadImage onFinish loadingCount=%d", Integer.valueOf(i));
            C18479j.this.mo23110l(this.f51322a, this.f51323b);
        }

        public void onStart() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j$e */
    public class C18484e implements Runnable {
        public C18484e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0081 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0090 A[Catch:{ Exception -> 0x009a }, LOOP:0: B:17:0x0043->B:35:0x0090, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.this
                r2 = 0
                r0.f51314f = r2
                com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r0.f51309a
                if (r0 == 0) goto L_0x01e0
                boolean r0 = r0.isFinishing()
                if (r0 == 0) goto L_0x0013
                goto L_0x01e0
            L_0x0013:
                java.lang.Boolean r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.f51308l
                if (r0 != 0) goto L_0x001a
                com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.m19131h()
            L_0x001a:
                java.lang.Boolean r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.f51308l
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x002d
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.this
                com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r0.f51309a
                boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
                if (r0 != 0) goto L_0x002d
                return
            L_0x002d:
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.this
                boolean r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.m19130a(r0)
                java.lang.String r3 = "MicroMsg.BizTimeLineImgLoader"
                if (r0 != 0) goto L_0x003d
                java.lang.String r0 = "not all visibleItem loaded"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r0)
                return
            L_0x003d:
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.this
                r4.getClass()
                r5 = 0
            L_0x0043:
                r6 = 0
                r7 = 1
                java.util.List<com.tencent.mm.storage.o0> r0 = r4.f51313e     // Catch:{ Exception -> 0x009a }
                int r0 = r0.size()     // Catch:{ Exception -> 0x009a }
                if (r5 >= r0) goto L_0x00a8
                java.util.List<com.tencent.mm.storage.o0> r0 = r4.f51313e     // Catch:{ all -> 0x005e }
                int r0 = r0.size()     // Catch:{ all -> 0x005e }
                if (r5 >= r0) goto L_0x006c
                java.util.List<com.tencent.mm.storage.o0> r0 = r4.f51313e     // Catch:{ all -> 0x005e }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x005e }
                com.tencent.mm.storage.o0 r0 = (com.tencent.p014mm.storage.C19623o0) r0     // Catch:{ all -> 0x005e }
                goto L_0x006d
            L_0x005e:
                r0 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x009a }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x009a }
                r8[r2] = r0     // Catch:{ Exception -> 0x009a }
                java.lang.String r0 = "getRecItem error %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r8)     // Catch:{ Exception -> 0x009a }
            L_0x006c:
                r0 = r6
            L_0x006d:
                if (r0 == 0) goto L_0x0090
                boolean r8 = r0.mo25759G2()     // Catch:{ Exception -> 0x009a }
                if (r8 == 0) goto L_0x0090
                java.util.HashSet<java.lang.String> r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.f51305i     // Catch:{ Exception -> 0x009a }
                java.lang.String r9 = r0.mo25768r2()     // Catch:{ Exception -> 0x009a }
                boolean r8 = r8.contains(r9)     // Catch:{ Exception -> 0x009a }
                if (r8 != 0) goto L_0x0090
                java.lang.String r4 = "getNextPreloadRecFeed pos=%d"
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x009a }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x009a }
                r8[r2] = r5     // Catch:{ Exception -> 0x009a }
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r4, r8)     // Catch:{ Exception -> 0x009a }
                r6 = r0
                goto L_0x00a8
            L_0x0090:
                int r5 = r5 + 1
                java.lang.String r0 = r0.mo25768r2()     // Catch:{ Exception -> 0x009a }
                r4.mo23101b(r0)     // Catch:{ Exception -> 0x009a }
                goto L_0x0043
            L_0x009a:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r7]
                java.lang.String r0 = r0.getMessage()
                r4[r2] = r0
                java.lang.String r0 = "getNextPreloadRecFeed %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r4)
            L_0x00a8:
                if (r6 != 0) goto L_0x00b0
                java.lang.String r0 = "not loading recFeed"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r0)
                return
            L_0x00b0:
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.this
                r0.getClass()
                java.lang.Object[] r4 = new java.lang.Object[r7]
                java.lang.String r5 = r6.mo25768r2()
                r4[r2] = r5
                java.lang.String r5 = "preLoadNext recFeed %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
                java.lang.String r3 = r6.mo25768r2()
                r0.mo23101b(r3)
                te3.lo3 r3 = r6.f55539x1
                if (r3 == 0) goto L_0x01dd
                java.util.LinkedList<te3.wo3> r3 = r3.f64172e
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                if (r3 != 0) goto L_0x01dd
                te3.lo3 r3 = r6.f55539x1
                int r3 = r3.f64173f
                r4 = 2001(0x7d1, float:2.804E-42)
                if (r3 == r4) goto L_0x00e4
                r4 = 2002(0x7d2, float:2.805E-42)
                if (r3 == r4) goto L_0x00e4
                goto L_0x01dd
            L_0x00e4:
                r3 = 0
                r4 = 0
            L_0x00e6:
                te3.lo3 r5 = r6.f55539x1
                java.util.LinkedList<te3.wo3> r5 = r5.f64172e
                int r5 = r5.size()
                if (r3 >= r5) goto L_0x01d7
                te3.lo3 r5 = r6.f55539x1
                java.util.LinkedList<te3.wo3> r5 = r5.f64172e
                java.lang.Object r5 = r5.get(r3)
                te3.wo3 r5 = (te3.C22533wo3) r5
                te3.lo3 r8 = r6.f55539x1
                java.util.LinkedList<te3.wo3> r8 = r8.f64172e
                java.lang.Object r8 = r8.get(r3)
                te3.wo3 r8 = (te3.C22533wo3) r8
                te3.bj2 r8 = r8.f64690e
                if (r8 == 0) goto L_0x01d3
                java.lang.String r9 = r8.f63730g
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x0122
                java.lang.String r9 = r8.f63731h
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x0122
                java.lang.String r9 = r8.f63732i
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x0122
                goto L_0x01d3
            L_0x0122:
                s90.j r15 = new s90.j
                r15.<init>()
                java.lang.String r9 = r8.f63729f
                r15.f226326e = r9
                int r9 = r8.f63733j
                r15.f226333o = r9
                if (r3 != 0) goto L_0x017a
                te3.lo3 r9 = r6.f55539x1
                if (r9 != 0) goto L_0x0137
                r9 = 0
                goto L_0x013b
            L_0x0137:
                boolean r9 = com.tencent.p014mm.storage.C19613h1.m21040m(r9)
            L_0x013b:
                if (r9 == 0) goto L_0x017a
                int r5 = r15.f226333o
                if (r5 != 0) goto L_0x014e
                java.lang.String r5 = r8.f63732i
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x014e
                java.lang.String r5 = r8.f63732i
                r15.f226330i = r5
                goto L_0x0152
            L_0x014e:
                java.lang.String r5 = r8.f63730g
                r15.f226330i = r5
            L_0x0152:
                int r5 = r15.f226333o
                if (r5 != 0) goto L_0x0159
                int r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51413M
                goto L_0x015b
            L_0x0159:
                int r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51415P
            L_0x015b:
                r16 = r5
                java.lang.String r10 = r15.f226330i
                long r11 = r6.field_orderFlag
                r14 = 1
                kw0.a r5 = kw0.C46746a.f125826a
                com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r8 = r0.f51309a
                int r5 = r5.mo71973f(r8)
                int r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51418S
                int r8 = r8 * 2
                int r5 = r5 - r8
                r8 = r0
                r9 = r15
                r13 = r3
                r15 = r5
                boolean r5 = r8.mo23104e(r9, r10, r11, r13, r14, r15, r16)
                if (r5 == 0) goto L_0x01d3
                goto L_0x01d2
            L_0x017a:
                java.lang.String r9 = "itemMsg"
                gy3.C87412m.m108594g(r5, r9)
                boolean r5 = com.tencent.p014mm.storage.C19613h1.m21041n(r5)
                if (r5 == 0) goto L_0x01b6
                te3.td3 r5 = r8.f63737q
                if (r5 == 0) goto L_0x01d3
                java.util.LinkedList<java.lang.String> r5 = r5.f142138e
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
                if (r5 != 0) goto L_0x01d3
                te3.td3 r5 = r8.f63737q
                java.util.LinkedList<java.lang.String> r5 = r5.f142138e
                java.util.Iterator r5 = r5.iterator()
            L_0x0199:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x01d3
                java.lang.Object r8 = r5.next()
                r10 = r8
                java.lang.String r10 = (java.lang.String) r10
                r15.f226330i = r10
                long r11 = r6.field_orderFlag
                r14 = 0
                r8 = r0
                r9 = r15
                r13 = r3
                boolean r8 = r8.mo23103d(r9, r10, r11, r13, r14)
                if (r8 == 0) goto L_0x0199
                r4 = 1
                goto L_0x0199
            L_0x01b6:
                java.lang.String r5 = r8.f63731h
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x01c1
                java.lang.String r5 = r8.f63730g
                goto L_0x01c3
            L_0x01c1:
                java.lang.String r5 = r8.f63731h
            L_0x01c3:
                r10 = r5
                r15.f226330i = r10
                long r11 = r6.field_orderFlag
                r14 = 0
                r8 = r0
                r9 = r15
                r13 = r3
                boolean r5 = r8.mo23103d(r9, r10, r11, r13, r14)
                if (r5 == 0) goto L_0x01d3
            L_0x01d2:
                r4 = 1
            L_0x01d3:
                int r3 = r3 + 1
                goto L_0x00e6
            L_0x01d7:
                if (r4 != 0) goto L_0x01e0
                r0.mo23112n()
                goto L_0x01e0
            L_0x01dd:
                r0.mo23112n()
            L_0x01e0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j.C18484e.run():void");
        }
    }

    public C18479j(BizTimeLineUI bizTimeLineUI, List<C19623o0> list, List<C19623o0> list2) {
        this.f51309a = bizTimeLineUI;
        this.f51312d = list;
        this.f51313e = list2;
        if (list.size() <= 10) {
            Looper.myQueue().addIdleHandler(new C18480a());
        }
    }

    /* renamed from: a */
    public static boolean m19130a(C18479j jVar) {
        int firstVisiblePosition = jVar.f51309a.f50235f.getFirstVisiblePosition();
        int lastVisiblePosition = jVar.f51309a.f50235f.getLastVisiblePosition();
        int i = lastVisiblePosition > 0 ? lastVisiblePosition - 1 : 0;
        for (int i2 = firstVisiblePosition > 0 ? firstVisiblePosition - 1 : 0; i2 <= i; i2++) {
            C19623o0 g = jVar.mo23106g(i2);
            if (g != null && g.mo25754B2() && !f51305i.contains(g.mo25768r2())) {
                LinkedList<C77630j> linkedList = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(g.field_msgId, g.field_content).f226295i;
                if (Util.isNullOrNil((List) linkedList)) {
                    continue;
                } else {
                    int size = linkedList.size();
                    if (!g.field_isExpand && size > 2) {
                        size = 2;
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        C77630j jVar2 = linkedList.get(i3);
                        if (!Util.isNullOrNil(jVar2.f226330i)) {
                            if (i3 == 0) {
                                if (!jVar.mo23102c(jVar2.f226330i, g.field_msgId, i3) && !jVar.mo23102c(C92721n.m116882j(jVar2), g.field_msgId, i3)) {
                                }
                            } else if (!jVar.mo23102c(jVar2.f226330i, g.field_msgId, i3)) {
                            }
                            return false;
                        }
                    }
                    if (g.field_isExpand || linkedList.size() <= 2) {
                        jVar.mo23101b(g.mo25768r2());
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public static void m19131h() {
        Class cls = C32735h.class;
        f51307k = Boolean.valueOf(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_preload_img, 1) == 1);
        Boolean valueOf = Boolean.valueOf(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_preload_img_in_wifi, 0) == 1);
        f51308l = valueOf;
        Log.m105925i("MicroMsg.BizTimeLineImgLoader", "BizTimeLineImg initABTest %b/%b", f51307k, valueOf);
    }

    /* renamed from: b */
    public void mo23101b(String str) {
        f51305i.add(str);
    }

    /* renamed from: c */
    public final boolean mo23102c(String str, long j, int i) {
        HashSet<String> hashSet = f51306j;
        if (hashSet.contains(j + "_" + i)) {
            return true;
        }
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(C14050a.m13405b(C102027b.m134386a(str, 1, true)))) {
            return false;
        }
        HashSet<String> hashSet2 = f51306j;
        hashSet2.add(j + "_" + i);
        return true;
    }

    /* renamed from: d */
    public final boolean mo23103d(C77630j jVar, String str, long j, int i, boolean z) {
        C77630j jVar2 = jVar;
        if (jVar2 == null) {
            return false;
        }
        return mo23104e(jVar, str, j, i, z, C46746a.f125826a.mo71973f(this.f51309a) - C18508z2.f51418S, jVar2.f226333o == 0 ? C18508z2.f51412L : C18508z2.f51414N);
    }

    /* renamed from: e */
    public final boolean mo23104e(C77630j jVar, String str, long j, int i, boolean z, int i2, int i3) {
        long j2 = j;
        int i4 = i;
        if (Util.isNullOrNil(str) || mo23102c(str, j2, i4)) {
            return false;
        }
        ImageView imageView = new ImageView(this.f51309a);
        int i5 = this.f51310b + 1;
        this.f51310b = i5;
        Log.m105919d("MicroMsg.BizTimeLineImgLoader", "doLoadImage loadingCount=%d, msgId=%d, pos=%d, showBigImg=%b", Integer.valueOf(i5), Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
        if (i4 != 0 || !z) {
            int i6 = C18508z2.f51416Q;
            mo23107i(j, i, jVar, str, imageView, i6, i6, true, new C18483d(j2, i4), -1, 0.0f);
        } else {
            mo23109k(j, i, jVar, str, imageView, i2, i3, true, new C18482c(j2, i4), false, -1);
        }
        return true;
    }

    /* renamed from: f */
    public void mo23105f() {
        if (!Util.isNullOrNil((List) this.f51313e) && this.f51316h) {
            mo23112n();
        }
    }

    /* renamed from: g */
    public C19623o0 mo23106g(int i) {
        try {
            if (i < this.f51312d.size()) {
                return this.f51312d.get(i);
            }
            if (i >= this.f51312d.size() + ((LinkedList) this.f51311c).size()) {
                return null;
            }
            return (C19623o0) ((LinkedList) this.f51311c).get(i - this.f51312d.size());
        } catch (Throwable th) {
            Log.m105929w("MicroMsg.BizTimeLineImgLoader", "getItem error %s", th.getMessage());
            return null;
        }
    }

    /* renamed from: i */
    public void mo23107i(long j, int i, C77630j jVar, String str, ImageView imageView, int i2, int i3, boolean z, C22906q.C22907a aVar, int i4, float f) {
        String a = C102027b.m134386a(str, 1, true);
        if (C118762j.f355306a.mo183489b(1)) {
            C19449k kVar = C19449k.f54939a;
            String str2 = jVar.f226326e;
            if (str2 == null) {
                long j2 = j;
                int i5 = i;
            } else {
                HashMap<String, String> hashMap = C19449k.f54941c;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(',');
                sb.append(i);
                hashMap.put(sb.toString(), str2);
            }
        } else {
            long j3 = j;
            int i6 = i;
            C77630j jVar2 = jVar;
        }
        C19463t tVar = C19463t.f54993a;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.color.f3237k_;
        bVar.f59346b = true;
        bVar.f59354j = i2;
        int i7 = i3;
        bVar.f59355k = i7;
        bVar.f59344B = "2131231297";
        bVar.f59369y = new C22908r(1);
        bVar.f59370z = new C22898h(1);
        bVar.f59343A = new C22904o(1);
        bVar.f59350f = C14050a.m13405b(a);
        tVar.mo25227a(j, i, jVar, 1, a, imageView, i4, z, bVar.mo32666a(), (C98661k) null, new C22906q(1, i2, i7, true, true, f, aVar));
    }

    /* renamed from: j */
    public void mo23108j(String str, ImageView imageView, int i, int i2, int i3) {
        C19463t tVar = C19463t.f54993a;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59345a = true;
        bVar.f59359o = C0966R.color.f3237k_;
        bVar.f59354j = i;
        bVar.f59355k = i2;
        bVar.f59353i = 4;
        tVar.mo25227a(-1, -1, (C77630j) null, 1, str, imageView, i3, false, bVar.mo32666a(), (C98661k) null, new C22906q());
    }

    /* renamed from: k */
    public void mo23109k(long j, int i, C77630j jVar, String str, ImageView imageView, int i2, int i3, boolean z, C22906q.C22907a aVar, boolean z2, int i4) {
        String a = C102027b.m134386a(str, 1, true);
        if (C118762j.f355306a.mo183489b(1)) {
            C19449k kVar = C19449k.f54939a;
            String str2 = jVar.f226326e;
            if (str2 == null) {
                long j2 = j;
                int i5 = i;
            } else {
                HashMap<String, String> hashMap = C19449k.f54941c;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(',');
                sb.append(i);
                hashMap.put(sb.toString(), str2);
            }
        } else {
            long j3 = j;
            int i6 = i;
            C77630j jVar2 = jVar;
        }
        int i7 = z2 ? C0966R.C0969drawable.bw7 : 0;
        int i8 = z2 ? C0966R.C0969drawable.f4583gz : C0966R.C0969drawable.f4586h2;
        float b = (float) C76577a.m92151b(this.f51309a, 8);
        C19463t tVar = C19463t.f54993a;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = i8;
        bVar.f59346b = true;
        int i9 = i2;
        bVar.f59354j = i9;
        bVar.f59355k = i3;
        bVar.f59344B = i7 + "";
        bVar.f59369y = new C22908r(1);
        bVar.f59370z = new C22898h(1);
        bVar.f59343A = new C22904o(1);
        bVar.f59350f = C14050a.m13405b(a);
        tVar.mo25227a(j, i, jVar, 1, a, imageView, i4, z, bVar.mo32666a(), (C98661k) null, new C22906q(1, i9, i3, false, z2, b, aVar));
    }

    /* renamed from: l */
    public void mo23110l(long j, int i) {
        HashSet<String> hashSet = f51306j;
        hashSet.add(j + "_" + i);
        if (this.f51310b <= 0) {
            mo23111m();
        }
    }

    /* renamed from: m */
    public void mo23111m() {
        if (f51307k == null) {
            m19131h();
        }
        if (f51307k.booleanValue()) {
            boolean z = this.f51314f;
            if (z || this.f51315g) {
                Log.m105927v("MicroMsg.BizTimeLineImgLoader", "preLoadNext loading %b, onPause %b", Boolean.valueOf(z), Boolean.valueOf(this.f51315g));
                return;
            }
            this.f51314f = true;
            Log.m105926v("MicroMsg.BizTimeLineImgLoader", "preLoadNext");
            C31332a.m39373a("BizTimeLineImgLoaderThread", new C18481b(), 500);
        }
    }

    /* renamed from: n */
    public void mo23112n() {
        if (f51307k == null) {
            m19131h();
        }
        if (f51307k.booleanValue()) {
            boolean z = this.f51314f;
            if (z || this.f51315g) {
                Log.m105927v("MicroMsg.BizTimeLineImgLoader", "preLoadNext loading %b, onPause %b", Boolean.valueOf(z), Boolean.valueOf(this.f51315g));
                return;
            }
            this.f51314f = true;
            Log.m105926v("MicroMsg.BizTimeLineImgLoader", "preLoadNext");
            C31332a.m39373a("BizTimeLineImgLoaderThread", new C18484e(), 500);
        }
    }
}
