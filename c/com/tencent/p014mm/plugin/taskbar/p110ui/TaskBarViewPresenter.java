package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.view.View;
import ay2.C67121f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C68587i1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import ky2.C10432i;
import ky2.C10439o;
import p235sm.C77731f0;
import rx3.C13604l;
import sx3.C77813z;
import sx3.C90364q0;
import vx2.C37860g;
import vx2.C65902r;
import vx2.C78493o;
import xx2.C26563a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter */
public final class TaskBarViewPresenter implements C71327g {

    /* renamed from: a */
    public C30482a f206522a;

    /* renamed from: b */
    public boolean f206523b;

    /* renamed from: c */
    public int f206524c;

    /* renamed from: d */
    public C68587i1 f206525d;

    /* renamed from: e */
    public C68585h1 f206526e;

    /* renamed from: f */
    public ArrayList<C68691e.C68692a> f206527f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C68691e.C68692a> f206528g = new ArrayList<>();

    /* renamed from: h */
    public final HashMap<Integer, C67121f> f206529h;

    /* renamed from: i */
    public final LinkedList<MultiTaskInfo> f206530i = new LinkedList<>();

    /* renamed from: j */
    public int f206531j;

    /* renamed from: k */
    public long f206532k;

    /* renamed from: l */
    public int f206533l = 60;

    /* renamed from: m */
    public C26563a f206534m = new C26563a();

    /* renamed from: n */
    public long f206535n;

    /* renamed from: o */
    public long f206536o;

    /* renamed from: p */
    public ArrayList<C71315b> f206537p = new ArrayList<>();

    /* renamed from: q */
    public int f206538q;

    /* renamed from: r */
    public final TaskBarViewPresenter$taskBarUpdateEventListener$1 f206539r;

    /* renamed from: s */
    public final MStorage.IOnStorageChange f206540s;

    /* renamed from: t */
    public final TaskBarViewPresenter$homeTabChangedListener$1 f206541t;

    /* renamed from: u */
    public final C10439o f206542u;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$a */
    public interface C30482a {
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$b */
    public static final class C71315b {

        /* renamed from: a */
        public int f206543a;

        /* renamed from: b */
        public int f206544b;

        /* renamed from: c */
        public String f206545c;

        /* renamed from: d */
        public MultiTaskInfo f206546d;
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$c */
    public static final class C71316c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TaskBarViewPresenter f206547d;

        /* renamed from: e */
        public final /* synthetic */ boolean f206548e;

        public C71316c(TaskBarViewPresenter taskBarViewPresenter, boolean z) {
            this.f206547d = taskBarViewPresenter;
            this.f206548e = z;
        }

        public final void run() {
            C30482a aVar;
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "do reload data");
            this.f206547d.mo98235e(false, false);
            this.f206547d.mo98235e(false, true);
            C67121f fVar = this.f206547d.f206529h.get(4);
            if (fVar != null) {
                this.f206547d.mo98234d(fVar);
            }
            if (this.f206548e && (aVar = this.f206547d.f206522a) != null) {
                TaskBarView taskBarView = (TaskBarView) aVar;
                Log.m105924i("MicroMsg.TaskBarView", "onDataUpdated");
                taskBarView.f206485S1 = true;
                taskBarView.mo98196E1();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$d */
    public static final class C71317d<T> implements Comparator {

        /* renamed from: d */
        public static final C71317d<T> f206549d = new C71317d<>();

        public int compare(Object obj, Object obj2) {
            int i = ((((MultiTaskInfo) obj2).field_updateTime - ((MultiTaskInfo) obj).field_updateTime) > 0 ? 1 : ((((MultiTaskInfo) obj2).field_updateTime - ((MultiTaskInfo) obj).field_updateTime) == 0 ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i > 0 ? 1 : -1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$e */
    public static final class C71318e implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ TaskBarViewPresenter f206550d;

        public C71318e(TaskBarViewPresenter taskBarViewPresenter) {
            this.f206550d = taskBarViewPresenter;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "received taskBarOnStorageChangeListener");
            this.f206550d.mo98233c(true);
            int i = mStorageEventData.eventId;
            if (i == 5) {
                Object obj = mStorageEventData.obj;
                if (obj != null) {
                    C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.TaskBarStorage.TaskBarDeleteNotify");
                    C65902r.C65903a aVar = (C65902r.C65903a) obj;
                    int i2 = aVar.f189468b;
                    if (i2 == 2 || i2 == 3) {
                        TaskBarViewPresenter taskBarViewPresenter = this.f206550d;
                        MultiTaskInfo multiTaskInfo = aVar.f189467a;
                        if (multiTaskInfo != null) {
                            taskBarViewPresenter.mo98237g(multiTaskInfo, 0, 2, i2);
                        } else {
                            C87412m.m108603p("multiTaskInfo");
                            throw null;
                        }
                    }
                }
            } else if (i == 2) {
                TaskBarViewPresenter taskBarViewPresenter2 = this.f206550d;
                Object obj2 = mStorageEventData.obj;
                C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.model.MultiTaskInfo");
                taskBarViewPresenter2.mo98237g((MultiTaskInfo) obj2, 0, 1, 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$f */
    public static final class C71319f implements C10439o {

        /* renamed from: d */
        public final /* synthetic */ TaskBarViewPresenter f206551d;

        public C71319f(TaskBarViewPresenter taskBarViewPresenter) {
            this.f206551d = taskBarViewPresenter;
        }

        public final void onDataChanged() {
            C30482a aVar = this.f206551d.f206522a;
            if (aVar != null) {
                ((TaskBarView) aVar).mo98195D1();
            }
        }
    }

    public TaskBarViewPresenter() {
        C40008f fVar = C40008f.f107254d;
        this.f206539r = new TaskBarViewPresenter$taskBarUpdateEventListener$1(this, fVar);
        this.f206540s = new C71318e(this);
        this.f206541t = new TaskBarViewPresenter$homeTabChangedListener$1(this, fVar);
        this.f206542u = new C71319f(this);
        this.f206529h = C90364q0.m113146e(new C13604l(4, new C67121f(4, new int[]{2, 21, 22, 6, 4, 3})));
    }

    /* renamed from: a */
    public final C67121f mo98231a(int i) {
        return this.f206529h.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo98232b(List<? extends C68691e.C68692a> list) {
        C87412m.m108594g(list, "localUsageInfoList");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            String str = "";
            for (C68691e.C68692a aVar : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                LocalUsageInfo localUsageInfo = aVar.f197340a;
                sb.append(localUsageInfo != null ? localUsageInfo.f239044h : null);
                sb.append(' ');
                str = sb.toString();
            }
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "update WeApp Data " + str);
        }
    }

    /* renamed from: c */
    public final void mo98233c(boolean z) {
        C119179t tVar = C119157j.f356862d;
        C71316c cVar = new C71316c(this, z);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183886q(cVar, 300, (String) null);
    }

    /* renamed from: d */
    public final synchronized void mo98234d(C67121f fVar) {
        C30482a aVar;
        C87412m.m108594g(fVar, "viewModel");
        int size = fVar.f192728c.size();
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> c = C67121f.f192724e.mo55827c();
        this.f206530i.clear();
        for (int i : fVar.f192727b) {
            if (!C67121f.f192724e.mo55825a(i)) {
                if (!c.contains(Integer.valueOf(i))) {
                    List<MultiTaskInfo> p5 = ((C37860g) C86312j.m106911c(C37860g.class)).mo61366p5(i);
                    int size2 = p5.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (i2 < 1) {
                            arrayList.add(p5.get(i2));
                        } else {
                            this.f206530i.add(p5.get(i2));
                        }
                    }
                }
            }
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "type blocked " + i);
        }
        C77813z.m93909o(arrayList, C71317d.f206549d);
        fVar.f192728c = arrayList;
        if (size > 0 && arrayList.isEmpty() && (aVar = this.f206522a) != null) {
            TaskBarView taskBarView = (TaskBarView) aVar;
            taskBarView.post(new C71350z(taskBarView, fVar.f192726a));
        }
        Log.m105924i("MicroMsg.TaskBarViewPresenter", "reloadOtherData " + fVar.f192726a + ' ' + size + ' ' + fVar.f192728c.size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015d, code lost:
        if (r3 != false) goto L_0x015f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98235e(boolean r14, boolean r15) {
        /*
            r13 = this;
            java.lang.Class<sm.f0> r0 = p235sm.C77731f0.class
            if (r15 == 0) goto L_0x0007
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r1 = r13.f206528g
            goto L_0x0009
        L_0x0007:
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r1 = r13.f206527f
        L_0x0009:
            int r2 = r1.size()
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x002b
            java.lang.Object r5 = r1.get(r3)
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r5 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r5
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r5 = r5.f197340a
            java.lang.String r5 = r5.f239044h
            if (r5 == 0) goto L_0x0026
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r5 = 0
            goto L_0x0027
        L_0x0026:
            r5 = 1
        L_0x0027:
            if (r5 == 0) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "update WeApp Data "
            r6.append(r7)
            r6.append(r2)
            r7 = 32
            r6.append(r7)
            r6.append(r14)
            r6.append(r7)
            r6.append(r15)
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "MicroMsg.TaskBarViewPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            r13.mo98232b(r1)
            r1 = 0
            if (r15 == 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.appusage.h1 r6 = r13.f206526e
            if (r6 != 0) goto L_0x006d
            di3.d r0 = di3.C86312j.m106911c(r0)
            sm.f0 r0 = (p235sm.C77731f0) r0
            com.tencent.mm.plugin.appbrand.appusage.h1 r0 = r0.mo107697SJ()
            r13.f206526e = r0
        L_0x006d:
            com.tencent.mm.plugin.appbrand.appusage.h1 r0 = r13.f206526e
            if (r0 == 0) goto L_0x007c
            xt0.l r6 = xt0.C78983j.f231933a
            int r9 = r6.f231936b
            com.tencent.mm.plugin.appbrand.appusage.h1$a r6 = r6.f231937c
            java.util.List r0 = r0.mo94245pM(r9, r6)
            goto L_0x00a0
        L_0x007c:
            r0 = r1
            goto L_0x00a0
        L_0x007e:
            com.tencent.mm.plugin.appbrand.appusage.i1 r6 = r13.f206525d
            if (r6 != 0) goto L_0x008e
            di3.d r0 = di3.C86312j.m106911c(r0)
            sm.f0 r0 = (p235sm.C77731f0) r0
            com.tencent.mm.plugin.appbrand.appusage.i1 r0 = r0.mo107699hx()
            r13.f206525d = r0
        L_0x008e:
            com.tencent.mm.plugin.appbrand.appusage.i1 r0 = r13.f206525d
            if (r0 == 0) goto L_0x009b
            xt0.p r6 = xt0.C78983j.f231934b
            int r6 = r6.f231940b
            java.util.List r0 = r0.Oe0(r6)
            goto L_0x009c
        L_0x009b:
            r0 = r1
        L_0x009c:
            java.util.List r0 = gy3.C24564k0.m30738b(r0)
        L_0x00a0:
            if (r0 != 0) goto L_0x00a9
            java.lang.String r14 = "usageStorage is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r14)
            return
        L_0x00a9:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x00b2:
            boolean r10 = r9.hasNext()
            r11 = 2
            if (r10 == 0) goto L_0x00cc
            java.lang.Object r10 = r9.next()
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r10 = (com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo) r10
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r12 = new com.tencent.mm.plugin.appbrand.widget.desktop.e$a
            if (r15 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r11 = 1
        L_0x00c5:
            r12.<init>(r10, r11)
            r6.add(r12)
            goto L_0x00b2
        L_0x00cc:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r9 != 0) goto L_0x00d5
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r9 != 0) goto L_0x00d5
            goto L_0x0115
        L_0x00d5:
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r9 = ""
        L_0x00db:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0100
            java.lang.Object r10 = r0.next()
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r10 = (com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            if (r10 == 0) goto L_0x00f4
            java.lang.String r9 = r10.f239044h
            goto L_0x00f5
        L_0x00f4:
            r9 = r1
        L_0x00f5:
            r12.append(r9)
            r12.append(r7)
            java.lang.String r9 = r12.toString()
            goto L_0x00db
        L_0x0100:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update WeApp Data locaList "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x0115:
            r13.mo98232b(r6)
            if (r15 == 0) goto L_0x011d
            r13.f206528g = r6
            goto L_0x011f
        L_0x011d:
            r13.f206527f = r6
        L_0x011f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update WeApp Data Done "
            r0.append(r1)
            int r1 = r6.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ r4
            java.lang.String r1 = "MicroMsg.TaskBarView"
            if (r0 == 0) goto L_0x0174
            if (r2 == 0) goto L_0x015f
            if (r5 == 0) goto L_0x0174
            java.lang.Object r0 = r6.get(r3)
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r0 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r0
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r0 = r0.f197340a
            java.lang.String r0 = r0.f239044h
            if (r0 == 0) goto L_0x015d
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0159
            r0 = 1
            goto L_0x015a
        L_0x0159:
            r0 = 0
        L_0x015a:
            if (r0 != r4) goto L_0x015d
            r3 = 1
        L_0x015d:
            if (r3 == 0) goto L_0x0174
        L_0x015f:
            com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$a r0 = r13.f206522a
            if (r0 == 0) goto L_0x0174
            com.tencent.mm.plugin.taskbar.ui.TaskBarView r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView) r0
            java.lang.String r3 = "forceReloadData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.lang.Runnable r3 = r0.f206507o2
            r0.removeCallbacks(r3)
            java.lang.Runnable r3 = r0.f206507o2
            r0.post(r3)
        L_0x0174:
            if (r14 == 0) goto L_0x0186
            com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$a r14 = r13.f206522a
            if (r14 == 0) goto L_0x0186
            com.tencent.mm.plugin.taskbar.ui.TaskBarView r14 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView) r14
            java.lang.String r0 = "onDataUpdated"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r14.f206485S1 = r4
            r14.mo98196E1()
        L_0x0186:
            boolean r14 = r6.isEmpty()
            if (r14 == 0) goto L_0x019f
            if (r2 <= 0) goto L_0x019f
            com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$a r14 = r13.f206522a
            if (r14 == 0) goto L_0x019f
            if (r15 == 0) goto L_0x0195
            r4 = 2
        L_0x0195:
            com.tencent.mm.plugin.taskbar.ui.TaskBarView r14 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView) r14
            com.tencent.mm.plugin.taskbar.ui.z r15 = new com.tencent.mm.plugin.taskbar.ui.z
            r15.<init>(r14, r4)
            r14.post(r15)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter.mo98235e(boolean, boolean):void");
    }

    /* renamed from: f */
    public final void mo98236f(int i, boolean z) {
        Class cls = C77731f0.class;
        if (z) {
            if (this.f206526e == null) {
                this.f206526e = ((C77731f0) C86312j.m106911c(cls)).mo107697SJ();
            }
            C68585h1 h1Var = this.f206526e;
            if (h1Var != null) {
                h1Var.mo94244mJ(this.f206528g.get(i).f197340a.f239040d, this.f206528g.get(i).f197340a.f239042f);
                return;
            }
            return;
        }
        if (this.f206525d == null) {
            this.f206525d = ((C77731f0) C86312j.m106911c(cls)).mo107699hx();
        }
        C68587i1 i1Var = this.f206525d;
        if (i1Var != null) {
            i1Var.mo94252nw(this.f206527f.get(i).f197340a.f239040d, this.f206527f.get(i).f197340a.f239042f);
        }
    }

    /* renamed from: g */
    public final void mo98237g(MultiTaskInfo multiTaskInfo, int i, int i2, int i3) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemAddDeleted type:%d,pos:%d", Integer.valueOf(multiTaskInfo.field_type), Integer.valueOf(i));
        long c = i2 == 2 ? C31543z5.m39453c() - multiTaskInfo.field_updateTime : 0;
        C26563a aVar = this.f206534m;
        aVar.mo53505c(i2, i3, aVar.mo53503a(multiTaskInfo.field_type), multiTaskInfo.field_id, ((int) c) / 1000, 1, 0, 0);
    }

    /* renamed from: h */
    public final void mo98238h(View view, boolean z) {
        View findViewById = view != null ? view.findViewById(C0966R.C0970id.gyw) : null;
        boolean z2 = false;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            z2 = true;
        }
        if (z2) {
            this.f206534m.mo53506d(1, z ? 11 : 2, (String) null, 1, (String) null);
        }
    }

    /* renamed from: i */
    public final void mo98239i(LocalUsageInfo localUsageInfo, boolean z) {
        C87412m.m108594g(localUsageInfo, "appItem");
        String b = C56887p.m65608b(localUsageInfo.f239041e, localUsageInfo.f239042f);
        int i = z ? 3 : 1;
        C71315b bVar = new C71315b();
        bVar.f206543a = 1;
        bVar.f206544b = i;
        bVar.f206545c = b;
        this.f206537p.add(bVar);
    }

    /* renamed from: j */
    public final void mo98240j(LocalUsageInfo localUsageInfo, int i, int i2, boolean z) {
        LocalUsageInfo localUsageInfo2 = localUsageInfo;
        C87412m.m108594g(localUsageInfo, "appItem");
        Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemReorderWeApp appId:%s,start:%d end:%d", localUsageInfo2.f239041e, Integer.valueOf(i), Integer.valueOf(i2));
        this.f206534m.mo53505c(3, 0, 3, C56887p.m65608b(localUsageInfo2.f239041e, localUsageInfo2.f239042f), 0, z ? 1 : 3, i, i2);
    }

    /* renamed from: k */
    public final void mo98241k(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List<MultiTaskInfo> list;
        C67121f fVar = this.f206529h.get(4);
        int i7 = 0;
        if (fVar == null || (list = fVar.f192728c) == null) {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            int i8 = 0;
            int i9 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            for (MultiTaskInfo multiTaskInfo : list) {
                int i18 = multiTaskInfo.field_type;
                if (i18 == 2) {
                    i7++;
                } else if (i18 == 3) {
                    i8++;
                } else if (i18 == 4) {
                    i9++;
                } else if (i18 == 6) {
                    i15++;
                } else if (i18 == 21) {
                    i16++;
                } else if (i18 == 22) {
                    i17++;
                }
            }
            i6 = i7;
            i4 = i8;
            i5 = i9;
            i = i15;
            i2 = i16;
            i3 = i17;
        }
        this.f206534m.mo53504b(z ? 4 : 1, C78493o.m94791b() ? 1 : 0, this.f206527f.size() >= 8 ? 8 : this.f206527f.size(), i6, i5, i4, i3, i2, this.f206528g.size() >= 8 ? 8 : this.f206528g.size(), i, 1);
    }

    /* renamed from: l */
    public final void mo98242l() {
        Class cls = C10432i.class;
        this.f206523b = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        this.f206524c = ((C10432i) C86312j.m106911c(cls)).Oh0();
        Log.m105925i("MicroMsg.TaskBarView", "alvinluo updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", Boolean.valueOf(this.f206523b), Integer.valueOf(this.f206524c));
    }
}
