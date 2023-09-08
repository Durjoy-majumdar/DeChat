package vt2;

import a14.C53916l;
import a14.C53921m;
import a14.C53973z1;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import bl3.C39818r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95790g2;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.repository.SnsInfoImproveOnlineRepository;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gu2.C98214b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98799a;
import iu2.C98801c;
import iu2.C98802d;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Result;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100400e0;
import os2.C100411k0;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import ut2.C102084a;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import zb2.C53769h;
import zt3.C119157j;

/* renamed from: vt2.c */
public final class C102279c extends C102084a implements C11385n {

    /* renamed from: j */
    public static final C102281b f301242j = new C102281b((C8480h) null);

    /* renamed from: n */
    public static final ArrayList<C98799a> f301243n = new ArrayList<>();

    /* renamed from: o */
    public static boolean f301244o;

    /* renamed from: d */
    public final C13601g f301245d;

    /* renamed from: e */
    public final C102277a f301246e = new C102277a();

    /* renamed from: f */
    public final SnsInfoImproveOnlineRepository f301247f;

    /* renamed from: g */
    public boolean f301248g;

    /* renamed from: h */
    public final C13601g f301249h;

    /* renamed from: i */
    public C53973z1 f301250i;

    /* renamed from: vt2.c$e */
    public static final class C37828e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C37828e f100173d = new C37828e();

        public C37828e() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$selfName$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$selfName$2");
            String s = C75592q0.m90789s();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$selfName$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$selfName$2");
            return s;
        }
    }

    /* renamed from: vt2.c$f */
    public static final class C37829f extends C87413o implements C32226l<List<? extends C98799a>, C13598b0> {

        /* renamed from: B */
        public final /* synthetic */ C32226l<List<C98799a>, T> f100174B;

        /* renamed from: d */
        public final /* synthetic */ C53916l<T> f100175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37829f(C32226l<? super List<C98799a>, ? extends T> lVar, C53916l<? super T> lVar2) {
            super(1);
            this.f100174B = lVar;
            this.f100175d = lVar2;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$syncGetSnapshotList$2$1");
            List list = (List) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$syncGetSnapshotList$2$1");
            C87412m.m108594g(list, LocaleUtil.ITALIAN);
            this.f100175d.resumeWith(Result.m168114constructorimpl(this.f100174B.invoke(list)));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$syncGetSnapshotList$2$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$syncGetSnapshotList$2$1");
            return b0Var;
        }
    }

    /* renamed from: vt2.c$a */
    public static final class C102280a<T extends IAutoDBItem> implements IStorageObserver {

        /* renamed from: d */
        public static final C102280a<T> f301251d = new C102280a<>();

        public void onChanged(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion$1");
            StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
            SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion$1");
            C87412m.m108594g(storageObserverEvent, LocaleUtil.ITALIAN);
            C102281b bVar = C102279c.f301242j;
            SnsMethodCalculate.markStartTimeMs("access$getEnableUpdateResumeDate$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            boolean z = C102279c.f301244o;
            SnsMethodCalculate.markEndTimeMs("access$getEnableUpdateResumeDate$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            if (z) {
                C102281b bVar2 = C102279c.f301242j;
                SnsMethodCalculate.markStartTimeMs("access$updateResumeData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
                bVar2.mo141844a(storageObserverEvent);
                SnsMethodCalculate.markEndTimeMs("access$updateResumeData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
            }
            SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion$1");
            SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion$1");
        }
    }

    /* renamed from: vt2.c$b */
    public static final class C102281b {
        public C102281b(C8480h hVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: iu2.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: iu2.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo141844a(com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent<gu2.C98214b> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "updateResumeData"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r8.getEventId()
                com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r3 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
                com.tencent.mm.sdk.storage.observer.StorageEventId r4 = r3.getINSERT()
                boolean r4 = gy3.C87412m.m108589b(r2, r4)
                r5 = 0
                if (r4 == 0) goto L_0x0062
                com.tencent.mm.sdk.storage.IAutoDBItem r8 = r8.getObj()
                gu2.b r8 = (gu2.C98214b) r8
                if (r8 == 0) goto L_0x0133
                java.util.ArrayList r2 = vt2.C102279c.m134913c3()
                java.util.Iterator r2 = r2.iterator()
            L_0x0029:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x004a
                java.lang.Object r3 = r2.next()
                r4 = r3
                iu2.a r4 = (iu2.C98799a) r4
                int r6 = r8.getCreateTime()
                gu2.b r4 = r4.mo138170b()
                int r4 = r4.getCreateTime()
                if (r6 <= r4) goto L_0x0046
                r4 = 1
                goto L_0x0047
            L_0x0046:
                r4 = 0
            L_0x0047:
                if (r4 == 0) goto L_0x0029
                r5 = r3
            L_0x004a:
                iu2.a r5 = (iu2.C98799a) r5
                java.util.ArrayList r2 = vt2.C102279c.m134913c3()
                int r2 = sx3.C110818d0.m150918P(r2, r5)
                java.util.ArrayList r3 = vt2.C102279c.m134913c3()
                iu2.a r4 = new iu2.a
                r4.<init>(r8)
                r3.add(r2, r4)
                goto L_0x0133
            L_0x0062:
                com.tencent.mm.sdk.storage.observer.StorageEventId r4 = r3.getUPDATE()
                boolean r4 = gy3.C87412m.m108589b(r2, r4)
                if (r4 == 0) goto L_0x00bb
                com.tencent.mm.sdk.storage.IAutoDBItem r8 = r8.getObj()
                gu2.b r8 = (gu2.C98214b) r8
                if (r8 == 0) goto L_0x0133
                java.util.ArrayList r2 = vt2.C102279c.m134913c3()
                java.util.Iterator r2 = r2.iterator()
            L_0x007c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x009c
                java.lang.Object r3 = r2.next()
                r4 = r3
                iu2.a r4 = (iu2.C98799a) r4
                java.lang.String r6 = r8.mo137504B2()
                gu2.b r4 = r4.mo138170b()
                java.lang.String r4 = r4.mo137504B2()
                boolean r4 = gy3.C87412m.m108589b(r6, r4)
                if (r4 == 0) goto L_0x007c
                r5 = r3
            L_0x009c:
                iu2.a r5 = (iu2.C98799a) r5
                java.util.ArrayList r2 = vt2.C102279c.m134913c3()
                int r2 = sx3.C110818d0.m150918P(r2, r5)
                java.util.ArrayList r3 = vt2.C102279c.m134913c3()
                r3.remove(r2)
                java.util.ArrayList r3 = vt2.C102279c.m134913c3()
                iu2.a r4 = new iu2.a
                r4.<init>(r8)
                r3.add(r2, r4)
                goto L_0x0133
            L_0x00bb:
                com.tencent.mm.sdk.storage.observer.StorageEventId r4 = r3.getDELETE()
                boolean r4 = gy3.C87412m.m108589b(r2, r4)
                if (r4 == 0) goto L_0x0103
                com.tencent.mm.sdk.storage.IAutoDBItem r8 = r8.getObj()
                gu2.b r8 = (gu2.C98214b) r8
                if (r8 == 0) goto L_0x0133
                java.util.ArrayList r2 = vt2.C102279c.m134913c3()
                java.util.Iterator r2 = r2.iterator()
            L_0x00d5:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00f5
                java.lang.Object r3 = r2.next()
                r4 = r3
                iu2.a r4 = (iu2.C98799a) r4
                java.lang.String r6 = r8.mo137504B2()
                gu2.b r4 = r4.mo138170b()
                java.lang.String r4 = r4.mo137504B2()
                boolean r4 = gy3.C87412m.m108589b(r6, r4)
                if (r4 == 0) goto L_0x00d5
                r5 = r3
            L_0x00f5:
                iu2.a r5 = (iu2.C98799a) r5
                java.util.ArrayList r8 = vt2.C102279c.m134913c3()
                java.util.Collection r8 = gy3.C24564k0.m30737a(r8)
                r8.remove(r5)
                goto L_0x0133
            L_0x0103:
                com.tencent.mm.sdk.storage.observer.StorageEventId r3 = r3.getBATCH_EVENT()
                boolean r2 = gy3.C87412m.m108589b(r2, r3)
                if (r2 == 0) goto L_0x0133
                java.util.HashMap r8 = r8.getObjEventMap()
                if (r8 == 0) goto L_0x0133
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x011b:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x0133
                java.lang.Object r2 = r8.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                vt2.c$b r3 = vt2.C102279c.f301242j
                java.lang.Object r2 = r2.getValue()
                com.tencent.mm.sdk.storage.observer.StorageObserverEvent r2 = (com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent) r2
                r3.mo141844a(r2)
                goto L_0x011b
            L_0x0133:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt2.C102279c.C102281b.mo141844a(com.tencent.mm.sdk.storage.observer.StorageObserverEvent):void");
        }
    }

    /* renamed from: vt2.c$c */
    public static final class C102282c extends C87413o implements C32224a<MvvmList<C98799a>> {

        /* renamed from: d */
        public final /* synthetic */ C102279c f301252d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f301253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102282c(C102279c cVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f301252d = cVar;
            this.f301253e = appCompatActivity;
        }

        public Object invoke() {
            List list;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
            C53769h hVar = new C53769h();
            hVar.f150920a = false;
            hVar.f150921b = 10;
            hVar.f150922c = -1;
            long currentTimeMillis = System.currentTimeMillis();
            C95790g2 Kx0 = C94866e1.Kx0();
            Kx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            String str = Kx0.f279534f;
            SnsMethodCalculate.markEndTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            C102279c cVar = this.f301252d;
            SnsMethodCalculate.markStartTimeMs("access$resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            boolean resumePage = cVar.resumePage();
            SnsMethodCalculate.markEndTimeMs("access$resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            if (!resumePage || TextUtils.isEmpty(str)) {
                C102279c.m134913c3().clear();
                list = C64186f0.f181907d;
            } else {
                list = C102279c.m134913c3();
            }
            List list2 = list;
            Log.m105924i("MicroMsg.Improve.DataUIC", "liveList init cost:" + (System.currentTimeMillis() - currentTimeMillis) + " size:" + list2.size());
            MvvmList mvvmList = new MvvmList(new C98801c(), hVar, this.f301253e, (LifecycleScope) null, list2, 8, (C8480h) null);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
            return mvvmList;
        }
    }

    /* renamed from: vt2.c$d */
    public static final class C102283d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C102279c f301254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102283d(C102279c cVar) {
            super(0);
            this.f301254d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
            if (r5 != false) goto L_0x004d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r12 = this;
                java.lang.String r0 = "invoke"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$onCreate$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                vt2.c r8 = r12.f301254d
                r8.getClass()
                java.lang.String r9 = "refresh"
                java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "refresh: job Completed="
                r2.append(r3)
                a14.z1 r3 = r8.f301250i
                r4 = 0
                if (r3 == 0) goto L_0x0031
                boolean r3 = r3.mo74530c()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                goto L_0x0032
            L_0x0031:
                r3 = r4
            L_0x0032:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.Improve.DataUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                a14.z1 r2 = r8.f301250i
                if (r2 == 0) goto L_0x004d
                r5 = 1
                boolean r2 = r2.mo74530c()
                if (r2 != r5) goto L_0x004a
                goto L_0x004b
            L_0x004a:
                r5 = 0
            L_0x004b:
                if (r5 == 0) goto L_0x006a
            L_0x004d:
                java.lang.String r2 = "refresh start"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                a14.h0 r2 = a14.C53872d1.f151117a
                a14.k2 r3 = f14.C58901s.f168555a
                r5 = 0
                vt2.g r6 = new vt2.g
                r6.<init>(r8, r4)
                r7 = 2
                r11 = 0
                r2 = r8
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r11
                a14.z1 r2 = bl3.C0317e.launch$default(r2, r3, r4, r5, r6, r7)
                r8.f301250i = r2
            L_0x006a:
                java.lang.Class<tq.b> r2 = p700tq.C64995b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                tq.b r2 = (p700tq.C64995b) r2
                r2.mo89154w6()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: vt2.C102279c.C102283d.invoke():java.lang.Object");
        }
    }

    static {
        Class cls = C60631e.class;
        String str = C86709a0.m107535s().f251807e + "SnsMicroMsg.db";
        Log.m105924i("MicroMsg.Improve.DataUIC", "origin path:" + str + " size:" + C86013q1.m106451l(str));
        C100400e0 Yx0 = C94866e1.Yx0();
        Yx0.getClass();
        SnsMethodCalculate.markStartTimeMs("getDb", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        C100411k0 k0Var = Yx0.f294108d;
        SnsMethodCalculate.markEndTimeMs("getDb", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        C60247c.C60248a aVar = C60247c.f171775g;
        ((C60631e) aVar.mo85234a(cls)).f171779f = k0Var;
        Log.m105924i("MicroMsg.Improve.DataUIC", "init db finish result:" + C13598b0.f38549a);
        ((C98802d) ((C60631e) aVar.mo85234a(cls)).mo85233d3(C98802d.class)).observe((C0125s) C40008f.f107254d, C102280a.f301251d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102279c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f301245d = C36568h.m40985a(new C102282c(this, appCompatActivity));
        this.f301247f = new SnsInfoImproveOnlineRepository(appCompatActivity);
        this.f301248g = true;
        this.f301249h = C36568h.m40985a(C37828e.f100173d);
    }

    /* renamed from: c3 */
    public static final /* synthetic */ ArrayList m134913c3() {
        SnsMethodCalculate.markStartTimeMs("access$getResumeData$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        ArrayList<C98799a> arrayList = f301243n;
        SnsMethodCalculate.markEndTimeMs("access$getResumeData$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return arrayList;
    }

    /* renamed from: a */
    public final <T> Object mo141840a(C32226l<? super List<C98799a>, ? extends T> lVar, C15601d<? super T> dVar) {
        SnsMethodCalculate.markStartTimeMs("syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        mo141841d3().mo129602c(new C37829f(lVar, mVar));
        Object o = mVar.mo74608o();
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        SnsMethodCalculate.markEndTimeMs("syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return o;
    }

    /* renamed from: d3 */
    public final MvvmList<C98799a> mo141841d3() {
        SnsMethodCalculate.markStartTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        MvvmList<C98799a> mvvmList = (MvvmList) ((C36570n) this.f301245d).getValue();
        SnsMethodCalculate.markEndTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return mvvmList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0246 A[EDGE_INSN: B:106:0x0246->B:80:0x0246 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f4  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141842e3(com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent<gu2.C98214b> r27) {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r2 = "handleDBEvent"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "trigger db event id:"
            r0.append(r4)
            com.tencent.mm.sdk.storage.observer.StorageEventId r4 = r27.getEventId()
            r0.append(r4)
            java.lang.String r4 = " info:"
            r0.append(r4)
            com.tencent.mm.sdk.storage.IAutoDBItem r4 = r27.getObj()
            r0.append(r4)
            java.lang.String r4 = " mapSize:"
            r0.append(r4)
            java.util.HashMap r4 = r27.getObjEventMap()
            r5 = 0
            if (r4 == 0) goto L_0x003c
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x003d
        L_0x003c:
            r4 = r5
        L_0x003d:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.Improve.DataFlow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r27.getEventId()
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r4 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
            com.tencent.mm.sdk.storage.observer.StorageEventId r6 = r4.getINSERT()
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            r7 = 2
            r8 = 0
            if (r6 == 0) goto L_0x0087
            com.tencent.mm.sdk.storage.IAutoDBItem r0 = r27.getObj()
            gu2.b r0 = (gu2.C98214b) r0
            if (r0 == 0) goto L_0x02e8
            boolean r4 = r1.mo141843f3(r0)
            if (r4 == 0) goto L_0x006d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x006d:
            gu2.b r4 = new gu2.b
            r4.<init>()
            android.content.ContentValues r0 = r0.mo142397l2()
            r4.convertFrom(r0, r8)
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = r26.mo141841d3()
            iu2.a r6 = new iu2.a
            r6.<init>(r4)
            com.tencent.p014mm.plugin.mvvmlist.MvvmList.m119209l(r0, r6, r8, r7, r5)
            goto L_0x02e8
        L_0x0087:
            com.tencent.mm.sdk.storage.observer.StorageEventId r6 = r4.getUPDATE()
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            java.lang.String r9 = "MicroMsg.Improve.DataUIC"
            if (r6 == 0) goto L_0x00cb
            com.tencent.mm.sdk.storage.IAutoDBItem r0 = r27.getObj()
            gu2.b r0 = (gu2.C98214b) r0
            if (r0 == 0) goto L_0x02e8
            gu2.b r4 = new gu2.b
            r4.<init>()
            android.content.ContentValues r6 = r0.mo142397l2()
            r4.convertFrom(r6, r8)
            iu2.a r6 = new iu2.a
            r6.<init>(r4)
            boolean r0 = r1.mo141843f3(r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "handleDBEvent: delete by set privacy "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = r26.mo141841d3()
            r0.mo129612p(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x00c2:
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = r26.mo141841d3()
            com.tencent.p014mm.plugin.mvvmlist.MvvmList.m119210t(r0, r6, r8, r7, r5)
            goto L_0x02e8
        L_0x00cb:
            com.tencent.mm.sdk.storage.observer.StorageEventId r6 = r4.getDELETE()
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            if (r6 == 0) goto L_0x02ba
            vt2.a r4 = r1.f301246e
            com.tencent.mm.plugin.mvvmlist.MvvmList r6 = r26.mo141841d3()
            r4.getClass()
            java.lang.String r10 = "handle"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataDelete"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r0 = "liveList"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "handleDBEvent: DELETE info snsId:"
            r0.append(r12)
            com.tencent.mm.sdk.storage.IAutoDBItem r12 = r27.getObj()
            gu2.b r12 = (gu2.C98214b) r12
            if (r12 == 0) goto L_0x0106
            long r12 = r12.mo142401p2()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            goto L_0x0107
        L_0x0106:
            r12 = r5
        L_0x0107:
            r0.append(r12)
            java.lang.String r12 = ", localId:"
            r0.append(r12)
            com.tencent.mm.sdk.storage.IAutoDBItem r12 = r27.getObj()
            gu2.b r12 = (gu2.C98214b) r12
            if (r12 == 0) goto L_0x0120
            long r12 = r12.mo137526z2()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            goto L_0x0121
        L_0x0120:
            r12 = r5
        L_0x0121:
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            com.tencent.mm.sdk.storage.IAutoDBItem r0 = r27.getObj()
            r12 = r0
            gu2.b r12 = (gu2.C98214b) r12
            if (r12 != 0) goto L_0x0139
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x02e8
        L_0x0139:
            java.lang.String r13 = "handleConsecutiveAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r11)
            boolean r0 = r12.isAd()
            if (r0 == 0) goto L_0x0149
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r11)
            goto L_0x0251
        L_0x0149:
            java.util.ArrayList<T> r0 = r6.f272353o
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = sx3.C36907w.m41090l(r0, r15)
            r14.<init>(r15)
            java.util.Iterator r0 = r0.iterator()
        L_0x015a:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x016e
            java.lang.Object r15 = r0.next()
            iu2.a r15 = (iu2.C98799a) r15
            gu2.b r15 = r15.mo138170b()
            r14.add(r15)
            goto L_0x015a
        L_0x016e:
            java.util.Iterator r0 = r14.iterator()
        L_0x0172:
            boolean r15 = r0.hasNext()
            r16 = 1
            if (r15 == 0) goto L_0x01a1
            java.lang.Object r15 = r0.next()
            r17 = r15
            gu2.b r17 = (gu2.C98214b) r17
            long r18 = r17.mo137526z2()
            long r20 = r12.mo137526z2()
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 != 0) goto L_0x019a
            boolean r5 = r17.isAd()
            boolean r7 = r12.isAd()
            if (r5 != r7) goto L_0x019a
            r5 = 1
            goto L_0x019b
        L_0x019a:
            r5 = 0
        L_0x019b:
            if (r5 == 0) goto L_0x019e
            goto L_0x01a2
        L_0x019e:
            r5 = 0
            r7 = 2
            goto L_0x0172
        L_0x01a1:
            r15 = 0
        L_0x01a2:
            gu2.b r15 = (gu2.C98214b) r15
            java.util.Collection r0 = gy3.C24564k0.m30737a(r14)
            r0.remove(r15)
            java.lang.String r5 = "removeConsecutiveAdWithReturn"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            java.lang.String r0 = "isConsecutiveFilter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r7)     // Catch:{ all -> 0x01ca }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r7)     // Catch:{ all -> 0x01ca }
            boolean r0 = lo2.C99534f0.m129898g()     // Catch:{ all -> 0x01ca }
            if (r0 == 0) goto L_0x01ee
            java.util.List r0 = lo2.C99534f0.m129893b(r14)     // Catch:{ all -> 0x01ca }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            goto L_0x01f2
        L_0x01ca:
            r0 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r8 = "there is something wrong in removeConsecutiveAd: "
            r15.append(r8)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            java.lang.String r8 = "ConsecutiveAdDataImproveHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            java.lang.String r0 = "filter_ad_exp"
            java.lang.String r8 = ""
            r15 = 0
            vr2.C37817q.m41545a(r0, r8, r15, r15, r8)
        L_0x01ee:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            r0 = 0
        L_0x01f2:
            if (r0 == 0) goto L_0x024e
            java.util.Iterator r0 = r0.iterator()
        L_0x01f8:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x024e
            java.lang.Object r5 = r0.next()
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "removeConsecutiveAd snsid:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            java.util.Iterator r7 = r14.iterator()
        L_0x021d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0245
            java.lang.Object r8 = r7.next()
            r15 = r8
            gu2.b r15 = (gu2.C98214b) r15
            boolean r20 = r15.isAd()
            if (r20 == 0) goto L_0x0241
            long r20 = r15.mo142401p2()
            if (r5 != 0) goto L_0x0237
            goto L_0x0241
        L_0x0237:
            long r22 = r5.longValue()
            int r15 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r15 != 0) goto L_0x0241
            r15 = 1
            goto L_0x0242
        L_0x0241:
            r15 = 0
        L_0x0242:
            if (r15 == 0) goto L_0x021d
            goto L_0x0246
        L_0x0245:
            r8 = 0
        L_0x0246:
            gu2.b r8 = (gu2.C98214b) r8
            if (r8 == 0) goto L_0x01f8
            r4.mo141839a(r6, r8)
            goto L_0x01f8
        L_0x024e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r11)
        L_0x0251:
            r4.mo141839a(r6, r12)
            java.lang.String r0 = "handleReedit"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r11)
            com.tencent.mm.plugin.sns.model.t1 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
            long r7 = r12.mo142401p2()
            int r5 = r12.getCreateTime()
            int r5 = r5 + -1
            long r13 = r12.mo137526z2()
            int r14 = (int) r13
            boolean r4 = r4.mo131277a(r7, r5, r14)
            if (r4 == 0) goto L_0x02b3
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = r12.getCreateTime()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "need show repost entrance, localId:"
            r8.append(r12)
            r8.append(r4)
            java.lang.String r4 = ", createTime:"
            r8.append(r4)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            gu2.a r4 = new gu2.a
            r21 = -1
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r20 = r4
            r25 = r7
            r20.<init>(r21, r23, r25)
            iu2.a r5 = new iu2.a
            r5.<init>(r4)
            r4 = 2
            r7 = 0
            r8 = 0
            com.tencent.p014mm.plugin.mvvmlist.MvvmList.m119209l(r6, r5, r7, r4, r8)
        L_0x02b3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x02e8
        L_0x02ba:
            com.tencent.mm.sdk.storage.observer.StorageEventId r4 = r4.getBATCH_EVENT()
            boolean r0 = gy3.C87412m.m108589b(r0, r4)
            if (r0 == 0) goto L_0x02e8
            java.util.HashMap r0 = r27.getObjEventMap()
            if (r0 == 0) goto L_0x02e8
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02d2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02e8
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.tencent.mm.sdk.storage.observer.StorageObserverEvent r4 = (com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent) r4
            r1.mo141842e3(r4)
            goto L_0x02d2
        L_0x02e8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt2.C102279c.mo141842e3(com.tencent.mm.sdk.storage.observer.StorageObserverEvent):void");
    }

    /* renamed from: f3 */
    public final boolean mo141843f3(C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        String userName = bVar.getUserName();
        SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        Object value = ((C36570n) this.f301249h).getValue();
        C87412m.m108593f(value, "<get-selfName>(...)");
        SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        if (!C87412m.m108589b(userName, (String) value) || bVar.getPravited() != 1) {
            SnsMethodCalculate.markEndTimeMs("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return true;
    }

    public void onCreate(Bundle bundle) {
        C39622i0 a;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.Improve.DataUIC", "onCreate");
        SnsMethodCalculate.markStartTimeMs("setupLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        mo141841d3().f272358t.observe(getActivity(), new C102290h(this));
        ((C119157j) C119157j.f356862d).mo183894y("cache_delete_tag");
        SnsMethodCalculate.markEndTimeMs("setupLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        SnsMethodCalculate.markStartTimeMs("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        Class cls = C60631e.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).observe((C0125s) getActivity(), new C102286f(this));
        SnsMethodCalculate.markEndTimeMs("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        SnsMethodCalculate.markStartTimeMs("registerNetSceneCallback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        SnsMethodCalculate.markEndTimeMs("registerNetSceneCallback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        f301244o = false;
        getOverScrollView().setRefreshCallback(new C102283d(this));
        if (!resumePage()) {
            getOverScrollView().mo133377a();
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
    }

    public void onDestroy() {
        String str;
        T t;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(218, this);
        ArrayList<T> arrayList = mo141841d3().f272353o;
        ListIterator<T> listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            str = null;
            if (!listIterator.hasPrevious()) {
                t = null;
                break;
            }
            t = listIterator.previous();
            if (!((C98799a) t).mo138170b().isAd()) {
                break;
            }
        }
        C98799a aVar = (C98799a) t;
        C98214b b = aVar != null ? aVar.mo138170b() : null;
        ArrayList<C98799a> arrayList2 = f301243n;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        f301244o = true;
        C95790g2 Kx0 = C94866e1.Kx0();
        if (b != null) {
            str = b.getStringSeq();
        }
        Kx0.getClass();
        SnsMethodCalculate.markStartTimeMs("saveUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        Kx0.f279534f = str;
        SnsMethodCalculate.markEndTimeMs("saveUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        C95790g2 Kx02 = C94866e1.Kx0();
        Kx02.getClass();
        SnsMethodCalculate.markStartTimeMs("pauseServerInfo", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        C5431p1.C5432a dy02 = C94866e1.dy0();
        dy02.getClass();
        SnsMethodCalculate.markStartTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        long j = dy02.f21142j;
        SnsMethodCalculate.markEndTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        Kx02.f279539k = j;
        C5431p1.C5432a dy03 = C94866e1.dy0();
        dy03.getClass();
        SnsMethodCalculate.markStartTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        long j2 = dy03.f21141i;
        SnsMethodCalculate.markEndTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        Kx02.f279538j = j2;
        SnsMethodCalculate.markEndTimeMs("pauseServerInfo", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        StringBuilder sb = new StringBuilder();
        sb.append("onSceneEnd: errType=");
        sb.append(i);
        sb.append(", errCode=");
        sb.append(i2);
        sb.append(", scene type:");
        sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
        Log.m105924i("MicroMsg.Improve.DataUIC", sb.toString());
        C87412m.m108591d(yVar);
        if (yVar.getType() == 218) {
            ImproveMainUIC improveMainUIC = (ImproveMainUIC) C39818r.f106831a.mo62443b(getContext()).mo75002a(ImproveMainUIC.class);
            improveMainUIC.getClass();
            SnsMethodCalculate.markStartTimeMs("hideOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("hideOpDialog: dialog null=");
            sb4.append(improveMainUIC.f279684r == null);
            Log.m105924i("MicroMsg.Improve.MainUIC", sb4.toString());
            C89779i0 i0Var = improveMainUIC.f279684r;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            improveMainUIC.f279684r = null;
            SnsMethodCalculate.markEndTimeMs("hideOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
    }
}
