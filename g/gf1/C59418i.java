package gf1;

import android.app.Activity;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fe1.C32026j;
import fe1.C45770k;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C60804m4;
import kj2.C117407d;
import ob0.C11385n;
import rx3.C13604l;
import rx3.C13605o;
import sj0.C90210f;
import te3.C49712hj1;
import te3.C50401mh0;
import te3.C51978xi1;
import up1.C37521f;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: gf1.i */
public final class C59418i implements C32026j, C11385n {

    /* renamed from: p */
    public static final SparseArray<HashSet<C45770k>> f169831p = new SparseArray<>();

    /* renamed from: q */
    public static final CopyOnWriteArraySet<C45770k> f169832q;

    /* renamed from: r */
    public static HashSet<Integer> f169833r = new HashSet<>();

    /* renamed from: d */
    public final ConcurrentLinkedQueue<C13605o<Integer, Integer, C59419a>> f169834d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    public C59417a f169835e;

    /* renamed from: f */
    public int f169836f;

    /* renamed from: g */
    public int f169837g;

    /* renamed from: h */
    public final int f169838h = 3;

    /* renamed from: i */
    public final int f169839i = C90210f.CTRL_INDEX;

    /* renamed from: j */
    public final MMHandler f169840j = new MMHandler("finder_sync_thread", (MMHandler.Callback) new C59424e(this));

    /* renamed from: n */
    public final Runnable f169841n = new C59422c(this);

    /* renamed from: o */
    public final Runnable f169842o = new C59425f(this);

    /* renamed from: gf1.i$a */
    public static final class C59419a {

        /* renamed from: a */
        public String f169843a;

        /* renamed from: b */
        public final LinkedList<C51978xi1> f169844b;

        /* renamed from: c */
        public String f169845c;

        /* renamed from: d */
        public final LinkedList<C51978xi1> f169846d;

        /* renamed from: e */
        public C49712hj1 f169847e;

        /* renamed from: f */
        public boolean f169848f;

        public C59419a() {
            this((String) null, (LinkedList) null, (String) null, (LinkedList) null, 15, (C8480h) null);
        }

        public C59419a(String str, LinkedList<C51978xi1> linkedList, String str2, LinkedList<C51978xi1> linkedList2, int i, C8480h hVar) {
            str = (i & 1) != 0 ? "" : str;
            linkedList = (i & 2) != 0 ? new LinkedList<>() : linkedList;
            str2 = (i & 4) != 0 ? "" : str2;
            linkedList2 = (i & 8) != 0 ? new LinkedList<>() : linkedList2;
            C87412m.m108594g(str, "finderEntranceTipsId");
            C87412m.m108594g(linkedList, "finderCtrlInfoList");
            C87412m.m108594g(str2, "nearbyEntranceTipsId");
            C87412m.m108594g(linkedList2, "nearbyCtrlInfoList");
            this.f169843a = str;
            this.f169844b = linkedList;
            this.f169845c = str2;
            this.f169846d = linkedList2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59419a)) {
                return false;
            }
            C59419a aVar = (C59419a) obj;
            return C87412m.m108589b(this.f169843a, aVar.f169843a) && C87412m.m108589b(this.f169844b, aVar.f169844b) && C87412m.m108589b(this.f169845c, aVar.f169845c) && C87412m.m108589b(this.f169846d, aVar.f169846d);
        }

        public int hashCode() {
            return (((((this.f169843a.hashCode() * 31) + this.f169844b.hashCode()) * 31) + this.f169845c.hashCode()) * 31) + this.f169846d.hashCode();
        }

        public String toString() {
            return "SyncArgs(finderEntranceTipsId=" + this.f169843a + ", finderCtrlInfoList=" + this.f169844b + ", nearbyEntranceTipsId=" + this.f169845c + ", nearbyCtrlInfoList=" + this.f169846d + ')';
        }
    }

    /* renamed from: gf1.i$b */
    public static final class C59420b implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ C59418i f169849d;

        /* renamed from: gf1.i$b$a */
        public static final class C59421a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C59418i f169850d;

            public C59421a(C59418i iVar) {
                this.f169850d = iVar;
            }

            public final void run() {
                this.f169850d.mo84538g(506365, 14, (C49712hj1) null);
            }
        }

        public C59420b(C59418i iVar) {
            this.f169849d = iVar;
        }

        public void onAppBackground(String str) {
        }

        public void onAppForeground(String str) {
            ((C119157j) C119157j.f356862d).mo183895z(new C59421a(this.f169849d));
        }
    }

    /* renamed from: gf1.i$c */
    public static final class C59422c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59418i f169851d;

        public C59422c(C59418i iVar) {
            this.f169851d = iVar;
        }

        public final void run() {
            this.f169851d.mo84538g(506365, 20, (C49712hj1) null);
        }
    }

    /* renamed from: gf1.i$d */
    public static final class C59423d extends C87413o implements C32226l<C13605o<? extends Integer, ? extends Integer, ? extends C59419a>, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C59418i f169852d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59423d(C59418i iVar) {
            super(1);
            this.f169852d = iVar;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(this.f169852d.mo84539h(((Number) ((C13605o) obj).f38558e).intValue()));
        }
    }

    /* renamed from: gf1.i$e */
    public static final class C59424e implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C59418i f169853d;

        public C59424e(C59418i iVar) {
            this.f169853d = iVar;
        }

        public final boolean handleMessage(Message message) {
            C13605o peek;
            Message message2 = message;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC;
            C87412m.m108594g(message2, LocaleUtil.ITALIAN);
            if (!C86709a0.m107522a()) {
                SparseArray<HashSet<C45770k>> sparseArray = C59418i.f169831p;
                Log.m105920e("Finder.SyncExtension", "Account no ready!");
            } else {
                int i = message2.what;
                C59418i iVar = this.f169853d;
                if (i == iVar.f169839i && iVar.f169836f == 0 && (!iVar.f169834d.isEmpty()) && (peek = this.f169853d.f169834d.peek()) != null) {
                    this.f169853d.f169836f = ((Number) peek.f38557d).intValue();
                    C85801v1 i2 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_CLEAN_FINDER_SYNC_VERSION_INT_SYNC;
                    int j = i2.mo119689j(aVar2, 0);
                    C37521f.f99374d.getClass();
                    int intValue = C37521f.f99153D6.mo60266n().intValue();
                    if (intValue > j) {
                        SparseArray<HashSet<C45770k>> sparseArray2 = C59418i.f169831p;
                        Log.m105928w("Finder.SyncExtension", "clean keybuf. svrCleanVersion=" + intValue + " cleanVersion=" + j);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(intValue));
                        C117407d.INSTANCE.idkeyStat(1292, 30, 1, true);
                    }
                    Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
                    C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                    byte[] decodeHexString = Util.decodeHexString((String) f);
                    C66785b bVar = C66785b.f191882e;
                    C86709a0.m107524d().mo123460f(new C60804m4(bVar.mo90658I1(), bVar.mo90675o1(true), decodeHexString, this.f169853d.f169836f, ((Number) peek.f38558e).intValue(), (C59419a) peek.f38559f));
                }
            }
            return false;
        }
    }

    /* renamed from: gf1.i$f */
    public static final class C59425f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59418i f169854d;

        public C59425f(C59418i iVar) {
            this.f169854d = iVar;
        }

        public final void run() {
            this.f169854d.mo84538g(506365, 2, (C49712hj1) null);
            this.f169854d.mo84536e();
        }
    }

    static {
        CopyOnWriteArraySet<C45770k> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(new C45907m());
        f169832q = copyOnWriteArraySet;
    }

    public C59418i() {
        AppForegroundDelegate.INSTANCE.mo174208a(new C59420b(this));
    }

    /* renamed from: a */
    public void mo58457a(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!f169833r.contains(Integer.valueOf(activity.hashCode()))) {
            f169833r.add(Integer.valueOf(activity.hashCode()));
            StringBuilder sb = new StringBuilder();
            sb.append("Start msg Looper ");
            C37521f.f99374d.getClass();
            sb.append(C37521f.f99129B);
            sb.append(" size: ");
            sb.append(f169833r.size());
            sb.append(' ');
            sb.append(this.f169837g);
            Log.m105924i("Finder.SyncExtension", sb.toString());
            this.f169837g = 0;
            mo84536e();
        }
    }

    /* renamed from: b */
    public void mo58458b(int i, int i2) {
        mo84538g(i, i2, (C49712hj1) null);
    }

    /* renamed from: c */
    public void mo58459c(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        f169833r.remove(Integer.valueOf(activity.hashCode()));
        StringBuilder sb = new StringBuilder();
        sb.append("unregister Looper ");
        C37521f.f99374d.getClass();
        sb.append(C37521f.f99129B);
        sb.append(" size: ");
        sb.append(f169833r.size());
        sb.append(' ');
        sb.append(this.f169837g);
        Log.m105924i("Finder.SyncExtension", sb.toString());
    }

    /* renamed from: d */
    public void mo84535d(int i, C45770k kVar) {
        C87412m.m108594g(kVar, "handler");
        SparseArray<HashSet<C45770k>> sparseArray = f169831p;
        if (sparseArray.get(i) == null) {
            sparseArray.append(i, new HashSet());
        }
        sparseArray.get(i).add(kVar);
    }

    /* renamed from: e */
    public final void mo84536e() {
        if (this.f169837g >= this.f169838h) {
            Log.m105924i("Finder.SyncExtension", "checkLoop finderAliveUI " + f169833r.size() + " sync_fail_count " + this.f169837g + " so ignore checkloop");
        }
        if (f169833r.size() > 0) {
            this.f169840j.removeCallbacks(this.f169842o);
            MMHandler mMHandler = this.f169840j;
            Runnable runnable = this.f169842o;
            C37521f.f99374d.getClass();
            mMHandler.postDelayed(runnable, (long) C37521f.f99129B);
        }
    }

    /* renamed from: f */
    public void mo84537f(List<? extends C50401mh0> list, int i, int i2) {
        C87412m.m108594g(list, "cmdItemList");
        for (C50401mh0 mh02 : list) {
            for (C45770k i4 : f169832q) {
                i4.mo3121i4(mh02, i, i2);
            }
            HashSet<C45770k> hashSet = f169831p.get(mh02.f138028d);
            if (hashSet != null) {
                synchronized (hashSet) {
                    for (C45770k i44 : hashSet) {
                        i44.mo3121i4(mh02, i, i2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:252:0x03be, code lost:
        r4 = r4.f184051d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0104  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo84538g(int r28, int r29, te3.C49712hj1 r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = 1
            java.lang.String r5 = " entranceReportSwitch="
            java.lang.String r6 = " pass! scene="
            java.lang.String r7 = " pass! entranceReportSwitch="
            java.lang.String r8 = " limit interval="
            r9 = 1000(0x3e8, double:4.94E-321)
            r11 = 300(0x12c, float:4.2E-43)
            java.lang.String r12 = "[doSync] scene="
            java.lang.String r13 = "Finder.SyncExtension"
            switch(r1) {
                case 13: goto L_0x03b6;
                case 14: goto L_0x0333;
                case 15: goto L_0x02b2;
                case 16: goto L_0x0231;
                case 17: goto L_0x01b0;
                case 18: goto L_0x012f;
                case 19: goto L_0x00a2;
                case 20: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            r4 = 0
            goto L_0x0437
        L_0x001b:
            gf1.a r7 = r0.f169835e
            if (r7 == 0) goto L_0x0075
            te3.l90 r14 = r7.f169822a
            if (r14 == 0) goto L_0x002d
            te3.k90 r14 = r14.f184058n
            if (r14 == 0) goto L_0x002d
            int r14 = r14.f183898d
            if (r14 != r2) goto L_0x002d
            r14 = 1
            goto L_0x002e
        L_0x002d:
            r14 = 0
        L_0x002e:
            if (r14 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r7 = 0
        L_0x0032:
            if (r7 == 0) goto L_0x0075
            te3.l90 r14 = r7.f169822a
            if (r14 == 0) goto L_0x003e
            te3.k90 r14 = r14.f184058n
            if (r14 == 0) goto L_0x003e
            int r11 = r14.f183899e
        L_0x003e:
            long r14 = android.os.SystemClock.uptimeMillis()
            long r3 = r7.f169830i
            long r14 = r14 - r3
            long r14 = r14 / r9
            long r3 = (long) r11
            int r9 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0064
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x0064:
            long r3 = android.os.SystemClock.uptimeMillis()
            r7.f169830i = r3
            te3.l90 r3 = r7.f169822a
            if (r3 == 0) goto L_0x0071
            boolean r4 = r3.f184053f
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0077
        L_0x0075:
            r3 = 0
            r4 = 0
        L_0x0077:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r6)
            r2.append(r1)
            r2.append(r5)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x0096
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x0097
        L_0x0096:
            r3 = 0
        L_0x0097:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x00a2:
            gf1.a r3 = r0.f169835e
            if (r3 == 0) goto L_0x00fe
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x00b4
            te3.k90 r4 = r4.f184058n
            if (r4 == 0) goto L_0x00b4
            int r4 = r4.f183898d
            if (r4 != r2) goto L_0x00b4
            r4 = 1
            goto L_0x00b5
        L_0x00b4:
            r4 = 0
        L_0x00b5:
            if (r4 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r3 = 0
        L_0x00b9:
            if (r3 == 0) goto L_0x00fe
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x00c5
            te3.k90 r4 = r4.f184058n
            if (r4 == 0) goto L_0x00c5
            int r11 = r4.f183899e
        L_0x00c5:
            long r14 = android.os.SystemClock.uptimeMillis()
            r18 = r5
            long r4 = r3.f169829h
            long r14 = r14 - r4
            long r14 = r14 / r9
            long r4 = (long) r11
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x00ed:
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f169829h = r4
            te3.l90 r3 = r3.f169822a
            if (r3 == 0) goto L_0x00fa
            boolean r4 = r3.f184053f
            goto L_0x00fb
        L_0x00fa:
            r4 = 0
        L_0x00fb:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0102
        L_0x00fe:
            r18 = r5
            r3 = 0
            r4 = 0
        L_0x0102:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r6)
            r2.append(r1)
            r1 = r18
            r2.append(r1)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x0123
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x0124
        L_0x0123:
            r3 = 0
        L_0x0124:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x012f:
            gf1.a r3 = r0.f169835e
            if (r3 == 0) goto L_0x0189
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x0141
            te3.k90 r4 = r4.f184057j
            if (r4 == 0) goto L_0x0141
            int r4 = r4.f183898d
            if (r4 != r2) goto L_0x0141
            r4 = 1
            goto L_0x0142
        L_0x0141:
            r4 = 0
        L_0x0142:
            if (r4 == 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r3 = 0
        L_0x0146:
            if (r3 == 0) goto L_0x0189
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x0152
            te3.k90 r4 = r4.f184057j
            if (r4 == 0) goto L_0x0152
            int r11 = r4.f183899e
        L_0x0152:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r14 = r3.f169828g
            long r4 = r4 - r14
            long r4 = r4 / r9
            long r9 = (long) r11
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0178
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x0178:
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f169828g = r4
            te3.l90 r3 = r3.f169822a
            if (r3 == 0) goto L_0x0185
            boolean r4 = r3.f184053f
            goto L_0x0186
        L_0x0185:
            r4 = 0
        L_0x0186:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x018b
        L_0x0189:
            r3 = 0
            r4 = 0
        L_0x018b:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r7)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x01a4
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x01a5
        L_0x01a4:
            r3 = 0
        L_0x01a5:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x01b0:
            gf1.a r3 = r0.f169835e
            if (r3 == 0) goto L_0x020a
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x01c2
            te3.k90 r4 = r4.f184056i
            if (r4 == 0) goto L_0x01c2
            int r4 = r4.f183898d
            if (r4 != r2) goto L_0x01c2
            r4 = 1
            goto L_0x01c3
        L_0x01c2:
            r4 = 0
        L_0x01c3:
            if (r4 == 0) goto L_0x01c6
            goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            if (r3 == 0) goto L_0x020a
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x01d3
            te3.k90 r4 = r4.f184056i
            if (r4 == 0) goto L_0x01d3
            int r11 = r4.f183899e
        L_0x01d3:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r14 = r3.f169827f
            long r4 = r4 - r14
            long r4 = r4 / r9
            long r9 = (long) r11
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x01f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x01f9:
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f169827f = r4
            te3.l90 r3 = r3.f169822a
            if (r3 == 0) goto L_0x0206
            boolean r4 = r3.f184053f
            goto L_0x0207
        L_0x0206:
            r4 = 0
        L_0x0207:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x020c
        L_0x020a:
            r3 = 0
            r4 = 0
        L_0x020c:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r7)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x0225
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x0226
        L_0x0225:
            r3 = 0
        L_0x0226:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x0231:
            gf1.a r3 = r0.f169835e
            if (r3 == 0) goto L_0x028b
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x0243
            te3.k90 r4 = r4.f184055h
            if (r4 == 0) goto L_0x0243
            int r4 = r4.f183898d
            if (r4 != r2) goto L_0x0243
            r4 = 1
            goto L_0x0244
        L_0x0243:
            r4 = 0
        L_0x0244:
            if (r4 == 0) goto L_0x0247
            goto L_0x0248
        L_0x0247:
            r3 = 0
        L_0x0248:
            if (r3 == 0) goto L_0x028b
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x0254
            te3.k90 r4 = r4.f184055h
            if (r4 == 0) goto L_0x0254
            int r11 = r4.f183899e
        L_0x0254:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r14 = r3.f169826e
            long r4 = r4 - r14
            long r4 = r4 / r9
            long r9 = (long) r11
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x027a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x027a:
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f169826e = r4
            te3.l90 r3 = r3.f169822a
            if (r3 == 0) goto L_0x0287
            boolean r4 = r3.f184053f
            goto L_0x0288
        L_0x0287:
            r4 = 0
        L_0x0288:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x028d
        L_0x028b:
            r3 = 0
            r4 = 0
        L_0x028d:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r7)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x02a6
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x02a7
        L_0x02a6:
            r3 = 0
        L_0x02a7:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x02b2:
            gf1.a r3 = r0.f169835e
            if (r3 == 0) goto L_0x030c
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x02c4
            te3.k90 r4 = r4.f184054g
            if (r4 == 0) goto L_0x02c4
            int r4 = r4.f183898d
            if (r4 != r2) goto L_0x02c4
            r4 = 1
            goto L_0x02c5
        L_0x02c4:
            r4 = 0
        L_0x02c5:
            if (r4 == 0) goto L_0x02c8
            goto L_0x02c9
        L_0x02c8:
            r3 = 0
        L_0x02c9:
            if (r3 == 0) goto L_0x030c
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x02d5
            te3.k90 r4 = r4.f184054g
            if (r4 == 0) goto L_0x02d5
            int r11 = r4.f183899e
        L_0x02d5:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r14 = r3.f169825d
            long r4 = r4 - r14
            long r4 = r4 / r9
            long r9 = (long) r11
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x02fb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x02fb:
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f169825d = r4
            te3.l90 r3 = r3.f169822a
            if (r3 == 0) goto L_0x0308
            boolean r4 = r3.f184053f
            goto L_0x0309
        L_0x0308:
            r4 = 0
        L_0x0309:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x030e
        L_0x030c:
            r3 = 0
            r4 = 0
        L_0x030e:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r7)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x0327
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x0328
        L_0x0327:
            r3 = 0
        L_0x0328:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x0333:
            gf1.a r3 = r0.f169835e
            if (r3 == 0) goto L_0x038d
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x0345
            te3.k90 r4 = r4.f184052e
            if (r4 == 0) goto L_0x0345
            int r4 = r4.f183898d
            if (r4 != r2) goto L_0x0345
            r4 = 1
            goto L_0x0346
        L_0x0345:
            r4 = 0
        L_0x0346:
            if (r4 == 0) goto L_0x0349
            goto L_0x034a
        L_0x0349:
            r3 = 0
        L_0x034a:
            if (r3 == 0) goto L_0x038d
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x0356
            te3.k90 r4 = r4.f184052e
            if (r4 == 0) goto L_0x0356
            int r11 = r4.f183899e
        L_0x0356:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r6 = r3.f169823b
            long r4 = r4 - r6
            long r4 = r4 / r9
            long r6 = (long) r11
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x037c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x037c:
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f169823b = r4
            te3.l90 r3 = r3.f169822a
            if (r3 == 0) goto L_0x0389
            boolean r4 = r3.f184053f
            goto L_0x038a
        L_0x0389:
            r4 = 0
        L_0x038a:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x038f
        L_0x038d:
            r3 = 0
            r4 = 0
        L_0x038f:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            java.lang.String r1 = "  pass! entranceReportSwitch="
            r2.append(r1)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x03aa
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x03ab
        L_0x03aa:
            r3 = 0
        L_0x03ab:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x03b6:
            gf1.a r3 = r0.f169835e
            if (r3 == 0) goto L_0x0410
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x03c8
            te3.k90 r4 = r4.f184051d
            if (r4 == 0) goto L_0x03c8
            int r4 = r4.f183898d
            if (r4 != r2) goto L_0x03c8
            r4 = 1
            goto L_0x03c9
        L_0x03c8:
            r4 = 0
        L_0x03c9:
            if (r4 == 0) goto L_0x03cc
            goto L_0x03cd
        L_0x03cc:
            r3 = 0
        L_0x03cd:
            if (r3 == 0) goto L_0x0410
            te3.l90 r4 = r3.f169822a
            if (r4 == 0) goto L_0x03d9
            te3.k90 r4 = r4.f184051d
            if (r4 == 0) goto L_0x03d9
            int r11 = r4.f183899e
        L_0x03d9:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r14 = r3.f169824c
            long r4 = r4 - r14
            long r4 = r4 / r9
            long r9 = (long) r11
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x03ff
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x03ff:
            long r4 = android.os.SystemClock.uptimeMillis()
            r3.f169824c = r4
            te3.l90 r3 = r3.f169822a
            if (r3 == 0) goto L_0x040c
            boolean r4 = r3.f184053f
            goto L_0x040d
        L_0x040c:
            r4 = 0
        L_0x040d:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0412
        L_0x0410:
            r3 = 0
            r4 = 0
        L_0x0412:
            if (r3 != 0) goto L_0x0437
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r7)
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x042b
            java.lang.String r3 = gf1.C59426j.m69334a(r1)
            goto L_0x042c
        L_0x042b:
            r3 = 0
        L_0x042c:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            return
        L_0x0437:
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            kj2.d r14 = kj2.C117407d.INSTANCE
            r15 = 1292(0x50c, double:6.383E-321)
            r8 = 1
            r17 = 1
            r19 = 0
            r6 = 1292(0x50c, double:6.383E-321)
            r10 = 1
            r12 = 0
            r5 = r14
            r5.idkeyStat(r6, r8, r10, r12)
            int r5 = r1 + 10
            long r8 = (long) r5
            r5 = r14
            r6 = r15
            r10 = r17
            r12 = r19
            r5.idkeyStat(r6, r8, r10, r12)
            gf1.i$a r5 = new gf1.i$a
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 15
            r26 = 0
            r20 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r6 = r30
            r5.f169847e = r6
            r6 = 3
            if (r1 == r6) goto L_0x047a
            r6 = 11
            if (r1 != r6) goto L_0x04a2
        L_0x047a:
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            boolean r6 = r6.mo76873sF()
            if (r6 != 0) goto L_0x04a2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ignore this notify to sync["
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "]."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            return
        L_0x04a2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "scene="
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " sync selector["
            r6.append(r7)
            r7 = r28
            r6.append(r7)
            r8 = 61
            r6.append(r8)
            java.lang.String r8 = r27.mo84541j(r28)
            r6.append(r8)
            java.lang.String r8 = "] myFinderUser["
            r6.append(r8)
            r6.append(r3)
            java.lang.String r3 = "] waitLinkedQueue="
            r6.append(r3)
            java.util.concurrent.ConcurrentLinkedQueue<rx3.o<java.lang.Integer, java.lang.Integer, gf1.i$a>> r3 = r0.f169834d
            int r3 = r3.size()
            r6.append(r3)
            java.lang.String r3 = " clearWaitingQueue="
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            if (r4 == 0) goto L_0x04f4
            boolean r3 = r0.mo84539h(r1)
            if (r3 == 0) goto L_0x04f4
            r5.f169848f = r2
        L_0x04f4:
            java.util.concurrent.ConcurrentLinkedQueue<rx3.o<java.lang.Integer, java.lang.Integer, gf1.i$a>> r2 = r0.f169834d
            rx3.o r3 = new rx3.o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r28)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r3.<init>(r4, r1, r5)
            r2.add(r3)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f169840j
            int r2 = r0.f169839i
            r1.sendEmptyMessage(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf1.C59418i.mo84538g(int, int, te3.hj1):void");
    }

    /* renamed from: h */
    public final boolean mo84539h(int i) {
        return i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 18 || i == 19 || i == 20;
    }

    /* renamed from: i */
    public void mo84540i(int i, C45770k kVar) {
        C87412m.m108594g(kVar, "handler");
        HashSet hashSet = f169831p.get(i);
        if (hashSet != null) {
            hashSet.remove(kVar);
        }
    }

    /* renamed from: j */
    public final String mo84541j(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        C13604l<Integer, String>[] lVarArr = C32026j.C32027a.f85255a;
        for (int i2 = 0; i2 < 13; i2++) {
            C13604l<Integer, String> lVar = lVarArr[i2];
            if ((((Number) lVar.f38555d).intValue() & i) != 0) {
                stringBuffer.append(((String) lVar.f38556e) + " ,");
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "buf.toString()");
        return stringBuffer2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0098, code lost:
        r1 = (gf1.C59418i.C59419a) r8.f38559f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r22, int r23, java.lang.String r24, ob0.C117747y r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            long r4 = android.os.SystemClock.uptimeMillis()
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderSync"
            gy3.C87412m.m108592e(r3, r6)
            je1.m4 r3 = (je1.C60804m4) r3
            ob0.c r6 = r3.f173183g
            ob0.c$c r6 = r6.f127055a
            pe3.a r6 = r6.f127080a
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest"
            gy3.C87412m.m108592e(r6, r7)
            te3.zm1 r6 = (te3.C64884zm1) r6
            int r6 = r6.f186709d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "errType "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r9 = ", errCode "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = ", errMsg "
            r8.append(r9)
            r9 = r24
            r8.append(r9)
            java.lang.String r9 = ", cmdList="
            r8.append(r9)
            ob0.c r9 = r3.f173183g
            ob0.c$d r9 = r9.f127056b
            pe3.a r9 = r9.f127083a
            java.lang.String r10 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse"
            gy3.C87412m.m108592e(r9, r10)
            te3.an1 r9 = (te3.C64233an1) r9
            java.util.LinkedList<te3.mh0> r9 = r9.f182088i
            java.lang.String r11 = "rr.responseProtoBuf as FinderSyncResponse).cmdList"
            gy3.C87412m.m108593f(r9, r11)
            int r9 = r9.size()
            r8.append(r9)
            java.lang.String r9 = ", (curSelector,selector) ("
            r8.append(r9)
            int r9 = r0.f169836f
            r8.append(r9)
            r9 = 44
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = "), continueFlag "
            r8.append(r9)
            int r9 = r3.mo85726l1()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "Finder.SyncExtension"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            java.util.concurrent.ConcurrentLinkedQueue<rx3.o<java.lang.Integer, java.lang.Integer, gf1.i$a>> r8 = r0.f169834d
            java.lang.Object r8 = r8.poll()
            rx3.o r8 = (rx3.C13605o) r8
            r12 = 1
            r13 = 0
            if (r1 != 0) goto L_0x037b
            if (r2 != 0) goto L_0x037b
            if (r8 == 0) goto L_0x00a4
            C r1 = r8.f38559f
            gf1.i$a r1 = (gf1.C59418i.C59419a) r1
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r1.f169848f
            if (r1 != r12) goto L_0x00a4
            r1 = 1
            goto L_0x00a5
        L_0x00a4:
            r1 = 0
        L_0x00a5:
            if (r1 == 0) goto L_0x010c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "clear waitingQueue="
            r1.append(r2)
            java.util.concurrent.ConcurrentLinkedQueue<rx3.o<java.lang.Integer, java.lang.Integer, gf1.i$a>> r2 = r0.f169834d
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = sx3.C36907w.m41090l(r2, r15)
            r14.<init>(r15)
            java.util.Iterator r2 = r2.iterator()
        L_0x00c2:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L_0x00f8
            java.lang.Object r15 = r2.next()
            rx3.o r15 = (rx3.C13605o) r15
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            B r15 = r15.f38558e
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r12.append(r15)
            java.lang.String r15 = "=["
            r12.append(r15)
            java.lang.String r15 = r0.mo84541j(r6)
            r12.append(r15)
            r15 = 93
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            r14.add(r12)
            r12 = 1
            goto L_0x00c2
        L_0x00f8:
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            java.util.concurrent.ConcurrentLinkedQueue<rx3.o<java.lang.Integer, java.lang.Integer, gf1.i$a>> r1 = r0.f169834d
            gf1.i$d r2 = new gf1.i$d
            r2.<init>(r0)
            sx3.C64175a0.m75511s(r1, r2)
        L_0x010c:
            r0.f169837g = r13
            gf1.a r1 = new gf1.a
            ob0.c r2 = r3.f173183g
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            gy3.C87412m.m108592e(r2, r10)
            te3.an1 r2 = (te3.C64233an1) r2
            te3.l90 r2 = r2.f182091o
            r1.<init>(r2)
            gf1.a r2 = r0.f169835e
            if (r2 == 0) goto L_0x0127
            long r14 = r2.f169824c
            goto L_0x0129
        L_0x0127:
            r14 = 0
        L_0x0129:
            r1.f169824c = r14
            if (r2 == 0) goto L_0x0130
            long r14 = r2.f169823b
            goto L_0x0132
        L_0x0130:
            r14 = 0
        L_0x0132:
            r1.f169823b = r14
            if (r2 == 0) goto L_0x0139
            long r14 = r2.f169825d
            goto L_0x013b
        L_0x0139:
            r14 = 0
        L_0x013b:
            r1.f169825d = r14
            if (r2 == 0) goto L_0x0142
            long r14 = r2.f169826e
            goto L_0x0144
        L_0x0142:
            r14 = 0
        L_0x0144:
            r1.f169826e = r14
            if (r2 == 0) goto L_0x014b
            long r14 = r2.f169827f
            goto L_0x014d
        L_0x014b:
            r14 = 0
        L_0x014d:
            r1.f169827f = r14
            if (r2 == 0) goto L_0x0154
            long r14 = r2.f169828g
            goto L_0x0156
        L_0x0154:
            r14 = 0
        L_0x0156:
            r1.f169828g = r14
            if (r2 == 0) goto L_0x015d
            long r14 = r2.f169829h
            goto L_0x015f
        L_0x015d:
            r14 = 0
        L_0x015f:
            r1.f169829h = r14
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SYNC_EXPOSE_SNS_N_INT
            ob0.c r12 = r3.f173183g
            ob0.c$d r12 = r12.f127056b
            pe3.a r12 = r12.f127083a
            gy3.C87412m.m108592e(r12, r10)
            te3.an1 r12 = (te3.C64233an1) r12
            te3.l90 r12 = r12.f182091o
            r14 = 0
            if (r12 == 0) goto L_0x0186
            te3.k90 r12 = r12.f184057j
            if (r12 == 0) goto L_0x0186
            int r12 = r12.f183900f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0187
        L_0x0186:
            r12 = r14
        L_0x0187:
            r2.mo119677K(r6, r12)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SYNC_RED_DOT_SESSION_REPORT_SWITCH_INT
            ob0.c r12 = r3.f173183g
            ob0.c$d r12 = r12.f127056b
            pe3.a r12 = r12.f127083a
            gy3.C87412m.m108592e(r12, r10)
            te3.an1 r12 = (te3.C64233an1) r12
            te3.l90 r12 = r12.f182091o
            if (r12 == 0) goto L_0x01aa
            te3.k90 r12 = r12.f184058n
            if (r12 == 0) goto L_0x01aa
            int r12 = r12.f183898d
            goto L_0x01ab
        L_0x01aa:
            r12 = 0
        L_0x01ab:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2.mo119677K(r6, r12)
            r0.f169835e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onSceneEnd] scene="
            r1.append(r2)
            if (r8 == 0) goto L_0x01c5
            B r2 = r8.f38558e
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x01c6
        L_0x01c5:
            r2 = r14
        L_0x01c6:
            r1.append(r2)
            java.lang.String r2 = " entranceReportSwitch="
            r1.append(r2)
            gf1.a r2 = r0.f169835e
            if (r2 == 0) goto L_0x01d6
            java.lang.String r14 = gf1.C59426j.m69334a(r2)
        L_0x01d6:
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            ob0.c r1 = r3.f173183g
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            gy3.C87412m.m108592e(r1, r10)
            te3.an1 r1 = (te3.C64233an1) r1
            int r1 = r1.f182089j
            ob0.c r2 = r3.f173183g
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            gy3.C87412m.m108592e(r2, r10)
            te3.an1 r2 = (te3.C64233an1) r2
            java.util.LinkedList<te3.mh0> r2 = r2.f182088i
            gy3.C87412m.m108593f(r2, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "onSceneEnd "
            r6.append(r11)
            r6.append(r1)
            java.lang.String r11 = " continueFlag "
            r6.append(r11)
            int r11 = r3.mo85726l1()
            r6.append(r11)
            java.lang.String r11 = " cmdList "
            r6.append(r11)
            int r11 = r2.size()
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            if (r1 <= 0) goto L_0x0241
            up1.f r1 = up1.C37521f.f99374d
            ob0.c r6 = r3.f173183g
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            gy3.C87412m.m108592e(r6, r10)
            te3.an1 r6 = (te3.C64233an1) r6
            int r6 = r6.f182089j
            int r6 = r6 * 1000
            r1.getClass()
            up1.C37521f.f99129B = r6
        L_0x0241:
            ob0.c r1 = r3.f173183g
            ob0.c$c r1 = r1.f127055a
            pe3.a r1 = r1.f127080a
            gy3.C87412m.m108592e(r1, r7)
            te3.zm1 r1 = (te3.C64884zm1) r1
            te3.qv3 r1 = r1.f186710e
            byte[] r1 = sf0.C48374j0.m53715d(r1)
            ob0.c r6 = r3.f173183g
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            gy3.C87412m.m108592e(r6, r10)
            te3.an1 r6 = (te3.C64233an1) r6
            te3.qv3 r6 = r6.f182085f
            byte[] r6 = sf0.C48374j0.m53715d(r6)
            if (r6 == 0) goto L_0x02e5
            java.lang.String r7 = "reqKey"
            gy3.C87412m.m108593f(r1, r7)
            int r7 = r6.length
            if (r7 != 0) goto L_0x026f
            r7 = 1
            goto L_0x0270
        L_0x026f:
            r7 = 0
        L_0x0270:
            r10 = 1
            r7 = r7 ^ r10
            if (r7 == 0) goto L_0x02da
            byte[] r7 = qe3.C101126c1.m132546c(r1, r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "processFinderSyncKey, req "
            r10.append(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r1)
            r10.append(r11)
            java.lang.String r11 = " resp "
            r10.append(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r6)
            r10.append(r11)
            java.lang.String r11 = " merge "
            r10.append(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r7)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            if (r7 == 0) goto L_0x02b4
            int r10 = r7.length
            if (r10 != 0) goto L_0x02af
            r10 = 1
            goto L_0x02b0
        L_0x02af:
            r10 = 0
        L_0x02b0:
            if (r10 == 0) goto L_0x02b3
            goto L_0x02b4
        L_0x02b3:
            r6 = r7
        L_0x02b4:
            te3.qv3 r6 = sf0.C48374j0.m53712a(r6)
            byte[] r6 = sf0.C48374j0.m53715d(r6)
            boolean r1 = java.util.Arrays.equals(r1, r6)
            if (r1 != 0) goto L_0x02d5
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r6)
            r1.mo119677K(r7, r6)
            r10 = 1
            goto L_0x02db
        L_0x02d5:
            java.lang.String r1 = "processFinderSyncKey, Sync Key Not change, not save"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
        L_0x02da:
            r10 = 0
        L_0x02db:
            if (r10 == 0) goto L_0x02e5
            int r1 = r3.mo85726l1()
            if (r1 == 0) goto L_0x02e5
            r12 = 1
            goto L_0x02e6
        L_0x02e5:
            r12 = 0
        L_0x02e6:
            if (r8 == 0) goto L_0x02f1
            A r1 = r8.f38557d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x02f2
        L_0x02f1:
            r1 = 0
        L_0x02f2:
            if (r8 == 0) goto L_0x02fd
            B r6 = r8.f38558e
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x02fe
        L_0x02fd:
            r6 = 0
        L_0x02fe:
            r0.mo84537f(r2, r1, r6)
            if (r12 == 0) goto L_0x032b
            java.util.concurrent.ConcurrentLinkedQueue<rx3.o<java.lang.Integer, java.lang.Integer, gf1.i$a>> r1 = r0.f169834d
            rx3.o r2 = new rx3.o
            int r6 = r3.mo85726l1()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            gf1.i$a r8 = new gf1.i$a
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 15
            r20 = 0
            r14 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r2.<init>(r6, r7, r8)
            r1.add(r2)
        L_0x032b:
            int r1 = r3.f173185i
            r2 = 19
            if (r1 != r2) goto L_0x0381
            gf1.a r1 = r0.f169835e
            if (r1 == 0) goto L_0x0340
            te3.l90 r2 = r1.f169822a
            if (r2 == 0) goto L_0x0340
            te3.k90 r2 = r2.f184058n
            if (r2 == 0) goto L_0x0340
            int r2 = r2.f183898d
            goto L_0x0341
        L_0x0340:
            r2 = 0
        L_0x0341:
            if (r2 <= 0) goto L_0x0381
            if (r1 == 0) goto L_0x0350
            te3.l90 r1 = r1.f169822a
            if (r1 == 0) goto L_0x0350
            te3.k90 r1 = r1.f184058n
            if (r1 == 0) goto L_0x0350
            int r1 = r1.f183901g
            goto L_0x0351
        L_0x0350:
            r1 = -1
        L_0x0351:
            if (r1 <= 0) goto L_0x0381
            long r1 = (long) r1
            r6 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "[delayDoSync] delayedMs="
            r3.append(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r0.f169840j
            java.lang.Runnable r6 = r0.f169841n
            r3.removeCallbacks(r6)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r0.f169840j
            java.lang.Runnable r6 = r0.f169841n
            r3.postDelayed(r6, r1)
            goto L_0x0381
        L_0x037b:
            int r1 = r0.f169837g
            r2 = 1
            int r1 = r1 + r2
            r0.f169837g = r1
        L_0x0381:
            r0.f169836f = r13
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f169840j
            int r2 = r0.f169839i
            r1.sendEmptyMessage(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onSceneEnd] cost="
            r1.append(r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r4
            r1.append(r2)
            java.lang.String r2 = "ms"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf1.C59418i.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
