package com.tencent.matrix.lifecycle.supervisor;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C28657g0;
import com.tencent.matrix.lifecycle.C28660i;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import com.tencent.matrix.lifecycle.MultiSourceStatefulOwner;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.lifecycle.supervisor.C80481h;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import kotlin.Metadata;
import p723vf.C118672d;
import p723vf.C90779e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112550d0;

public final class ProcessSupervisor implements C80477c {

    /* renamed from: b */
    public static final C13601g f235412b = C36568h.m40985a(C80458b.f235424d);

    /* renamed from: c */
    public static volatile Application f235413c;

    /* renamed from: d */
    public static C80496l f235414d;

    /* renamed from: e */
    public static final C13601g f235415e = C36568h.m40985a(C80457a.f235423d);

    /* renamed from: f */
    public static volatile C80478e f235416f;

    /* renamed from: g */
    public static final IForegroundStatefulOwner f235417g;

    /* renamed from: h */
    public static final IBackgroundStatefulOwner f235418h;

    /* renamed from: i */
    public static final IBackgroundStatefulOwner f235419i;

    /* renamed from: j */
    public static final IBackgroundStatefulOwner f235420j = new AppStagedBackgroundOwner((MultiSourceStatefulOwner) null, 1, (C8480h) null);

    /* renamed from: k */
    public static final ProcessSupervisor f235421k;

    /* renamed from: a */
    public final /* synthetic */ C80477c f235422a = C80481h.f235479e;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003H\u0001J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/ProcessSupervisor$AppStagedBackgroundOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "active", "Lcom/tencent/matrix/lifecycle/h;", "observer", "Lrx3/b0;", "observeForever", "Landroidx/lifecycle/s;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "delegate", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "<init>", "(Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;)V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class AppStagedBackgroundOwner implements IBackgroundStatefulOwner, IStatefulOwner {
        private final MultiSourceStatefulOwner delegate;

        public AppStagedBackgroundOwner() {
            this((MultiSourceStatefulOwner) null, 1, (C8480h) null);
        }

        public AppStagedBackgroundOwner(MultiSourceStatefulOwner multiSourceStatefulOwner) {
            C87412m.m108594g(multiSourceStatefulOwner, "delegate");
            this.delegate = multiSourceStatefulOwner;
        }

        public boolean active() {
            return this.delegate.active();
        }

        public void addLifecycleCallback(C0125s sVar, C80401d dVar) {
            C87412m.m108594g(sVar, "lifecycleOwner");
            C87412m.m108594g(dVar, "callback");
            IBackgroundStatefulOwner.C80384a.m97972a(this, sVar, dVar);
        }

        public void addLifecycleCallback(C0125s sVar, C80404f fVar) {
            C87412m.m108594g(sVar, "lifecycleOwner");
            C87412m.m108594g(fVar, "callback");
            throw null;
        }

        public void addLifecycleCallback(C80404f fVar) {
            C87412m.m108594g(fVar, "callback");
            throw null;
        }

        public boolean isBackground() {
            return active();
        }

        public void observeForever(C80407h hVar) {
            C87412m.m108594g(hVar, "observer");
            this.delegate.observeForever(hVar);
        }

        public void observeWithLifecycle(C0125s sVar, C80407h hVar) {
            C87412m.m108594g(sVar, "lifecycleOwner");
            C87412m.m108594g(hVar, "observer");
            this.delegate.observeWithLifecycle(sVar, hVar);
        }

        public void removeLifecycleCallback(C80401d dVar) {
            C87412m.m108594g(dVar, "callback");
            IBackgroundStatefulOwner.C80384a.m97974c(this, dVar);
        }

        public void removeLifecycleCallback(C80404f fVar) {
            C87412m.m108594g(fVar, "callback");
            throw null;
        }

        public void removeObserver(C80407h hVar) {
            C87412m.m108594g(hVar, "observer");
            this.delegate.removeObserver(hVar);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AppStagedBackgroundOwner(com.tencent.matrix.lifecycle.MultiSourceStatefulOwner r6, int r7, gy3.C8480h r8) {
            /*
                r5 = this;
                r8 = 1
                r7 = r7 & r8
                if (r7 == 0) goto L_0x0035
                com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1 r6 = new com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner$1
                com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor r7 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235421k
                fy3.l<java.util.Collection<? extends com.tencent.matrix.lifecycle.i>, java.lang.Boolean> r0 = com.tencent.matrix.lifecycle.C28657g0.f78631b
                r1 = 2
                com.tencent.matrix.lifecycle.IStatefulOwner[] r1 = new com.tencent.matrix.lifecycle.IStatefulOwner[r1]
                r2 = 0
                r7.getClass()
                com.tencent.matrix.lifecycle.IBackgroundStatefulOwner r3 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235418h
                java.lang.String r4 = "$this$shadow"
                gy3.C87412m.m108594g(r3, r4)
                com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1 r4 = new com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1
                r4.<init>(r3, r8, r8)
                r1[r2] = r4
                com.tencent.matrix.lifecycle.IBackgroundStatefulOwner r2 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235419i
                java.lang.String r3 = "$this$reverse"
                gy3.C87412m.m108594g(r2, r3)
                com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1 r3 = new com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1
                r3.<init>(r2)
                com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1 r2 = new com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1
                r2.<init>(r3, r8, r8)
                r1[r8] = r2
                r6.<init>(r7, r0, r1)
            L_0x0035:
                r5.<init>(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.AppStagedBackgroundOwner.<init>(com.tencent.matrix.lifecycle.MultiSourceStatefulOwner, int, gy3.h):void");
        }

        public void addLifecycleCallback(C80401d dVar) {
            C87412m.m108594g(dVar, "callback");
            IBackgroundStatefulOwner.C80384a.m97973b(this, dVar);
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$a */
    public static final class C80457a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C80457a f235423d = new C80457a();

        public C80457a() {
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
            if (com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235440i != false) goto L_0x0067;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r8 = this;
                rx3.g r0 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235412b
                android.app.Application r0 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235413c
                if (r0 == 0) goto L_0x006d
                r0 = 0
                r1 = 0
                android.app.Application r2 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235413c     // Catch:{ all -> 0x003e }
                gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x003e }
                android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x003e }
                android.app.Application r3 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235413c     // Catch:{ all -> 0x003e }
                gy3.C87412m.m108591d(r3)     // Catch:{ all -> 0x003e }
                java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x003e }
                r4 = 4
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch:{ all -> 0x003e }
                android.content.pm.ServiceInfo[] r2 = r2.services     // Catch:{ all -> 0x003e }
                java.lang.String r3 = "application!!.packageMan…ES\n            ).services"
                gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x003e }
                int r3 = r2.length     // Catch:{ all -> 0x003e }
                r4 = 0
            L_0x0028:
                if (r4 >= r3) goto L_0x0048
                r5 = r2[r4]     // Catch:{ all -> 0x003e }
                java.lang.String r6 = r5.name     // Catch:{ all -> 0x003e }
                java.lang.Class<com.tencent.matrix.lifecycle.supervisor.SupervisorService> r7 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.class
                java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x003e }
                boolean r6 = gy3.C87412m.m108589b(r6, r7)     // Catch:{ all -> 0x003e }
                if (r6 == 0) goto L_0x003b
                goto L_0x0049
            L_0x003b:
                int r4 = r4 + 1
                goto L_0x0028
            L_0x003e:
                r2 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r1]
                java.lang.String r4 = "Matrix.ProcessSupervisor"
                java.lang.String r5 = ""
                p723vf.C118672d.m167354d(r4, r2, r5, r3)
            L_0x0048:
                r5 = r0
            L_0x0049:
                rx3.g r2 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235412b
                android.app.Application r2 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235413c
                gy3.C87412m.m108591d(r2)
                java.lang.String r2 = p723vf.C90779e.m113846a(r2)
                if (r5 == 0) goto L_0x0058
                java.lang.String r0 = r5.processName
            L_0x0058:
                boolean r0 = gy3.C87412m.m108589b(r2, r0)
                if (r0 != 0) goto L_0x0067
                com.tencent.matrix.lifecycle.supervisor.SupervisorService$a r0 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235443o
                r0.getClass()
                boolean r0 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f235440i
                if (r0 == 0) goto L_0x0068
            L_0x0067:
                r1 = 1
            L_0x0068:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            L_0x006d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Supervisor NOT initialized yet or Supervisor is disabled!!!"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.C80457a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$b */
    public static final class C80458b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C80458b f235424d = new C80458b();

        public C80458b() {
            super(0);
        }

        public Object invoke() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Matrix.ProcessSupervisor_");
            ProcessSupervisor.f235421k.getClass();
            if (C90779e.m113847b(ProcessSupervisor.f235413c)) {
                str = "Main";
            } else {
                String a = C90779e.m113846a(ProcessSupervisor.f235413c);
                C87412m.m108593f(a, "MatrixUtil.getProcessName(application)");
                Object[] array = C112550d0.m153785U(a, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    str = strArr.length > 1 ? strArr[1] : "unknown";
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            sb.append(str);
            return sb.toString();
        }
    }

    static {
        ProcessSupervisor processSupervisor = new ProcessSupervisor();
        f235421k = processSupervisor;
        C32226l<Collection<? extends C28660i>, Boolean> lVar = C28657g0.f78630a;
        C32226l<Collection<? extends C28660i>, Boolean> lVar2 = C28657g0.f78630a;
        ProcessUILifecycleOwner.f235399x.getClass();
        f235417g = new ProcessSupervisor$appUIForegroundOwner$1(processSupervisor, lVar2, ProcessUILifecycleOwner.f235390o, "StartedStateOwner");
        C32226l<Collection<? extends C28660i>, Boolean> lVar3 = C28657g0.f78631b;
        f235418h = new ProcessSupervisor$appExplicitBackgroundOwner$1(processSupervisor, lVar3, ProcessExplicitBackgroundOwner.INSTANCE, "ExplicitBackgroundOwner");
        f235419i = new ProcessSupervisor$appDeepBackgroundOwner$1(processSupervisor, lVar3, ProcessDeepBackgroundOwner.INSTANCE, "DeepBackgroundOwner");
    }

    public ProcessSupervisor() {
        C13601g gVar = C80481h.f235475a;
    }

    /* renamed from: a */
    public String mo111974a() {
        String BT;
        ((C80481h.C80488e) this.f235422a).getClass();
        String str = "";
        SupervisorService.f235443o.getClass();
        String str2 = SupervisorService.f235441j;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String b = f235421k.mo111975b();
        try {
            C80478e eVar = f235416f;
            if (!(eVar == null || (BT = eVar.mo112002BT()) == null)) {
                str = BT;
            }
        } catch (Throwable th) {
            C118672d.m167354d(b, th, str, new Object[0]);
        }
        return str;
    }

    /* renamed from: b */
    public final String mo111975b() {
        return (String) ((C36570n) f235412b).getValue();
    }

    /* renamed from: c */
    public final boolean mo111976c(Application application, C80496l lVar) {
        C87412m.m108594g(application, "app");
        f235414d = lVar;
        if (lVar != null) {
            int i = 1;
            if (true == lVar.f235498a) {
                f235413c = application;
                if (mo111977d()) {
                    SupervisorService.f235443o.mo111999a(application);
                    C118672d.m167353c(mo111975b(), "initSupervisor", new Object[0]);
                }
                boolean z = lVar.f235499b;
                Intent intent = new Intent(application, SupervisorService.class);
                mo111975b();
                SupervisorPacemaker.f235439d.mo111988a(application);
                C80489j jVar = new C80489j(application, intent);
                if (!z) {
                    i = 32;
                }
                application.bindService(intent, jVar, i);
                C118672d.m167353c(mo111975b(), "inCharge", new Object[0]);
                return mo111977d();
            }
        }
        C118672d.m167353c("Matrix.ProcessSupervisor", "Supervisor is disabled", new Object[0]);
        return false;
    }

    /* renamed from: d */
    public final boolean mo111977d() {
        return ((Boolean) ((C36570n) f235415e).getValue()).booleanValue();
    }
}
