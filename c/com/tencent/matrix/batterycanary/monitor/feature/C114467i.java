package com.tencent.matrix.batterycanary.monitor.feature;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114444c;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.C80364g;
import com.tencent.matrix.batterycanary.monitor.feature.C80368h0;
import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.feature.performance.q$$c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p1177ce.C113287a;
import p1177ce.C113314g;
import p1195ge.C116947b;
import p329d3.C58104c;
import p723vf.C118672d;
import p961ee.C86507b;
import p965fe.C86853a;
import p981ie.C117159b;
import p981ie.C117164j;
import p981ie.C117173p;
import p981ie.C117178r;
import p981ie.C117183s;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i */
public class C114467i {

    /* renamed from: a */
    public final List<Class<? extends C114490k0.C114491a<?>>> f343152a = new ArrayList();

    /* renamed from: b */
    public final Map<Class<? extends C114490k0.C114491a<?>>, C114490k0.C114491a<?>> f343153b = new HashMap();

    /* renamed from: c */
    public final Map<Class<? extends C114490k0.C114491a<?>>, C114490k0.C114491a.C114492a<?>> f343154c = new HashMap();

    /* renamed from: d */
    public final Map<Class<? extends C114490k0.C114491a<?>>, Long> f343155d = new HashMap();

    /* renamed from: e */
    public final Map<Class<? extends C114490k0.C114491a<?>>, C114490k0.C114491a.C114503c> f343156e = new HashMap();

    /* renamed from: f */
    public final Map<Class<? extends C114490k0.C114491a<?>>, C114490k0.C114491a.C114503c.C114505b> f343157f = new HashMap();

    /* renamed from: g */
    public final Map<Class<? extends C114436a>, List<C114490k0.C114491a.C114492a<C114436a.C114440d>>> f343158g = new HashMap();

    /* renamed from: h */
    public final Map<String, List<C58104c<Class<? extends C114436a>, C114490k0.C114491a.C114492a<C114436a.C114440d>>>> f343159h = new HashMap();

    /* renamed from: i */
    public final Bundle f343160i = new Bundle();

    /* renamed from: j */
    public final Map<String, String> f343161j = new HashMap();

    /* renamed from: k */
    public C113314g f343162k;

    /* renamed from: l */
    public C113287a f343163l;

    /* renamed from: m */
    public C114481n f343164m;

    /* renamed from: n */
    public C114480m f343165n;

    /* renamed from: o */
    public long f343166o = SystemClock.uptimeMillis();

    /* renamed from: p */
    public String f343167p;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$a */
    public class C114468a implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public final /* synthetic */ C114513o0 f343168a;

        public C114468a(C114513o0 o0Var) {
            this.f343168a = o0Var;
        }

        public Object apply(Object obj) {
            C114513o0.C114514a aVar;
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            C114513o0 o0Var = this.f343168a;
            Context a = C114467i.this.f343162k.mo165879a();
            o0Var.getClass();
            C117183s.C117184a b = C117183s.m165269b(a);
            if (b == null) {
                aVar = null;
            } else {
                C114513o0.C114514a aVar2 = new C114513o0.C114514a();
                aVar2.f343242d = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(b.f351056a));
                aVar2.f343243e = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(b.f351057b));
                aVar2.f343244f = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(b.f351058c));
                aVar2.f343245g = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(b.f351059d));
                aVar = aVar2;
            }
            if (aVar != null) {
                C114480m mVar = C114467i.this.f343165n;
                mVar.f343188a++;
                mVar.f343189b += ((Long) aVar.f343242d.f343211a).longValue();
                mVar.f343190c += ((Long) aVar.f343243e.f343211a).longValue();
                mVar.f343191d += ((Long) aVar.f343244f.f343211a).longValue();
                mVar.f343192e += ((Long) aVar.f343245g.f343211a).longValue();
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$b */
    public class C114469b implements C117164j<C114490k0.C114491a.C114503c, Number> {
        public C114469b() {
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            if (C117159b.m165218s(C114467i.this.f343162k.mo165879a())) {
                return C114490k0.C114491a.C114503c.f343213o;
            }
            long e = C117159b.m165204e(C114467i.this.f343162k.mo165879a());
            C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + e, new Object[0]);
            return e == -1 ? C114490k0.C114491a.C114503c.f343213o : Long.valueOf(e);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$c */
    public class C114470c implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public final /* synthetic */ C116947b f343171a;

        public C114470c(C116947b bVar) {
            this.f343171a = bVar;
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            C114490k0.C114491a aVar = (C114490k0.C114491a) ((HashMap) C114467i.this.f343153b).get(C116947b.C116948a.class);
            if (aVar instanceof C116947b.C116948a) {
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onAcc " + cVar.f343220g + " " + cVar.f343214a, new Object[0]);
                ((C116947b.C116948a) aVar).mo180932b(this.f343171a.mo180931i());
            }
            return C114490k0.C114491a.C114503c.f343213o;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$d */
    public class C114471d implements C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> {
        public C114471d() {
        }

        public void accept(Object obj) {
            C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
            long max = Math.max(1, aVar.f343208d / 60000);
            if (max >= 5) {
                for (ITEM item : ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343063h.f343212a) {
                    if (((Long) item.f343211a).longValue() / max >= 3000) {
                        String a = C114467i.this.f343162k.f339057d.f339026A.mo122129a(item.f343066b);
                        if (!TextUtils.isEmpty(a)) {
                            ((HashMap) C114467i.this.f343161j).put(String.valueOf(item.f343066b), a);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$e */
    public class C114472e implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public final /* synthetic */ CpuStatFeature f343174a;

        /* renamed from: b */
        public final /* synthetic */ C114536x f343175b;

        public C114472e(CpuStatFeature cpuStatFeature, C114536x xVar) {
            this.f343174a = cpuStatFeature;
            this.f343175b = xVar;
        }

        public Object apply(Object obj) {
            C114481n nVar;
            boolean z;
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            int[] l = C117159b.m165211l();
            CpuStatFeature cpuStatFeature = this.f343174a;
            if (cpuStatFeature != null && cpuStatFeature.mo173600x() && (nVar = C114467i.this.f343164m) != null && nVar.mo173683a(this.f343174a.f343048k)) {
                C114481n nVar2 = C114467i.this.f343164m;
                nVar2.getClass();
                for (int i = 0; i < l.length; i++) {
                    int i2 = l[i];
                    int[] iArr = nVar2.f343193a.get(i);
                    if (i2 < iArr[0]) {
                        int[] iArr2 = (int[]) ((ArrayList) nVar2.f343194b).get(i);
                        iArr2[0] = iArr2[0] + 1;
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= iArr.length) {
                                z = false;
                                break;
                            } else if (i2 <= iArr[i3]) {
                                int[] iArr3 = (int[]) ((ArrayList) nVar2.f343194b).get(i);
                                iArr3[i3] = iArr3[i3] + 1;
                                z = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (!z && i2 > iArr[iArr.length - 1]) {
                            int[] iArr4 = (int[]) ((ArrayList) nVar2.f343194b).get(i);
                            int length = iArr.length - 1;
                            iArr4[length] = iArr4[length] + 1;
                        }
                    }
                }
            }
            List<ITEM> list = this.f343175b.mo173710j(l).f343312d.f343212a;
            C118672d.m167353c("Matrix.battery.CompositeMonitors", C114467i.this.hashCode() + " #onSampling: " + C114467i.this.f343167p, new Object[0]);
            C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + list, new Object[0]);
            if (list.isEmpty()) {
                return C114490k0.C114491a.C114503c.f343213o;
            }
            long j = 0;
            for (ITEM item : list) {
                j += (long) ((Integer) item.f343211a).intValue();
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$f */
    public class C114473f implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public final /* synthetic */ C114536x f343177a;

        public C114473f(C114536x xVar) {
            this.f343177a = xVar;
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            Integer num = (Integer) this.f343177a.mo173709i(C114467i.this.f343162k.mo165879a()).f343310d.f343211a;
            C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + num, new Object[0]);
            return num.intValue() == -1 ? C114490k0.C114491a.C114503c.f343213o : num;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$g */
    public class C114474g implements C117164j<C114490k0.C114491a.C114503c, Number> {
        public C114474g() {
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            int q = C117159b.m165216q(C114467i.this.f343162k.mo165879a());
            C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + q, new Object[0]);
            return q == -1 ? C114490k0.C114491a.C114503c.f343213o : Integer.valueOf(q);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$h */
    public class C114475h implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public final /* synthetic */ Long f343180a;

        public C114475h(Long l) {
            this.f343180a = l;
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            float p = C117159b.m165215p(C114467i.this.f343162k.mo165879a(), (int) (this.f343180a.longValue() / 1000));
            C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + p, new Object[0]);
            return p == -1.0f ? C114490k0.C114491a.C114503c.f343213o : Float.valueOf(p);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$i */
    public class C114476i implements C117164j<C114490k0.C114491a.C114503c, Number> {
        public C114476i() {
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            int j = C117159b.m165209j(C114467i.this.f343162k.mo165879a());
            C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + ", val = " + j, new Object[0]);
            return j == -1 ? C114490k0.C114491a.C114503c.f343213o : Integer.valueOf(j);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$j */
    public class C114477j implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public final /* synthetic */ CpuStatFeature f343183a;

        public C114477j(C114467i iVar, CpuStatFeature cpuStatFeature) {
            this.f343183a = cpuStatFeature;
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            CpuStatFeature.C114427b v = this.f343183a.mo173598v();
            for (int i = 0; i < v.f343053d.size(); i++) {
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " cpuCore" + i + ", val = " + v.f343053d.get(i).f343212a, new Object[0]);
            }
            for (int i2 = 0; i2 < v.f343054e.size(); i2++) {
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " procCpuCluster" + i2 + ", val = " + v.f343054e.get(i2).f343212a, new Object[0]);
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$k */
    public class C114478k implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public JiffiesMonitorFeature.UidJiffiesSnapshot f343184a;

        /* renamed from: b */
        public final /* synthetic */ JiffiesMonitorFeature f343185b;

        public C114478k(C114467i iVar, JiffiesMonitorFeature jiffiesMonitorFeature) {
            this.f343185b = jiffiesMonitorFeature;
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            JiffiesMonitorFeature.UidJiffiesSnapshot i = this.f343185b.mo173610i();
            JiffiesMonitorFeature.UidJiffiesSnapshot uidJiffiesSnapshot = this.f343184a;
            if (uidJiffiesSnapshot != null) {
                JiffiesMonitorFeature.UidJiffiesSnapshot.C1144311 r5 = new C114490k0.C114491a.C114492a<JiffiesMonitorFeature.UidJiffiesSnapshot>(i, uidJiffiesSnapshot, i) {
                    /* renamed from: a */
                    public com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a mo173612a(
/*
Method generation error in method: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.UidJiffiesSnapshot.1.a():com.tencent.matrix.batterycanary.monitor.feature.k0$a, dex: classes9.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.UidJiffiesSnapshot.1.a():com.tencent.matrix.batterycanary.monitor.feature.k0$a, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                long max = Math.max(1, r5.f343208d / 60000);
                long d = C114467i.m161059d(((Long) ((JiffiesMonitorFeature.UidJiffiesSnapshot) r5.f343207c).f343084d.f343211a).longValue(), r5.f343208d);
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " avgUidJiffies, val = " + d + ", minute = " + max, new Object[0]);
                Iterator<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> it = ((JiffiesMonitorFeature.UidJiffiesSnapshot) r5.f343207c).f343086f.iterator();
                while (it.hasNext()) {
                    C114490k0.C114491a.C114492a next = it.next();
                    long j = d;
                    JiffiesMonitorFeature.UidJiffiesSnapshot uidJiffiesSnapshot2 = i;
                    long d2 = C114467i.m161059d(((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) next.f343207c).f343062g.f343211a).longValue(), r5.f343208d);
                    C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " avgPidJiffies, val = " + d2 + ", minute = " + max + ", name = " + ((JiffiesMonitorFeature.JiffiesSnapshot) next.f343207c).f343061f, new Object[0]);
                    i = uidJiffiesSnapshot2;
                    it = it;
                    d = j;
                }
                this.f343184a = i;
                return Long.valueOf(d);
            }
            this.f343184a = i;
            return 0;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$l */
    public class C114479l implements C117164j<C114490k0.C114491a.C114503c, Number> {

        /* renamed from: a */
        public final /* synthetic */ C114513o0 f343186a;

        public C114479l(C114513o0 o0Var) {
            this.f343186a = o0Var;
        }

        public Object apply(Object obj) {
            C114490k0.C114491a.C114503c cVar = (C114490k0.C114491a.C114503c) obj;
            C114513o0.C114515b i = this.f343186a.mo173699i(C114467i.this.f343162k.mo165879a());
            if (i != null) {
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " wifiRx, val = " + i.f343246d, new Object[0]);
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " wifiTx, val = " + i.f343247e, new Object[0]);
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " mobileRx, val = " + i.f343250h, new Object[0]);
                C118672d.m167353c("Matrix.battery.CompositeMonitors", "onSampling " + cVar.f343220g + " " + cVar.f343214a + " mobileTx, val = " + i.f343251i, new Object[0]);
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$m */
    public static class C114480m {

        /* renamed from: a */
        public int f343188a;

        /* renamed from: b */
        public long f343189b;

        /* renamed from: c */
        public long f343190c;

        /* renamed from: d */
        public long f343191d;

        /* renamed from: e */
        public long f343192e;

        /* renamed from: a */
        public double mo173682a(long j) {
            int i = this.f343188a;
            if (i != 0) {
                return (double) ((((float) j) * 1.0f) / ((float) i));
            }
            return 0.0d;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$n */
    public static class C114481n {

        /* renamed from: a */
        public final List<int[]> f343193a;

        /* renamed from: b */
        public final List<int[]> f343194b;

        public C114481n(List<int[]> list) {
            this.f343193a = list;
            this.f343194b = new ArrayList(list.size());
            for (int[] length : list) {
                this.f343194b.add(new int[length.length]);
            }
        }

        /* renamed from: a */
        public boolean mo173683a(C117173p pVar) {
            if (this.f343193a.size() != pVar.mo181090g()) {
                return false;
            }
            for (int i = 0; i < this.f343193a.size(); i++) {
                if (this.f343193a.get(i).length != pVar.mo181092i(pVar.mo181089f(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$o */
    public static class C114482o {

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.i$o$a */
        public interface C114483a {
            /* renamed from: a */
            long mo173684a(String str);
        }
    }

    public C114467i(C113314g gVar, String str) {
        this.f343162k = gVar;
        this.f343167p = str;
    }

    /* renamed from: d */
    public static long m161059d(long j, long j2) {
        if (j2 > 0) {
            return (long) (((float) j) / (((float) j2) / 60000.0f));
        }
        throw new IllegalArgumentException("Illegal millis: " + j2);
    }

    /* renamed from: a */
    public void mo173658a() {
        C118672d.m167353c("Matrix.battery.CompositeMonitors", hashCode() + " #clear: " + this.f343167p, new Object[0]);
        ((HashMap) this.f343153b).clear();
        ((HashMap) this.f343154c).clear();
        ((HashMap) this.f343156e).clear();
        ((HashMap) this.f343157f).clear();
        ((HashMap) this.f343158g).clear();
        ((HashMap) this.f343159h).clear();
        this.f343160i.clear();
        ((HashMap) this.f343161j).clear();
        this.f343164m = null;
    }

    /* renamed from: b */
    public void mo173659b() {
        C113287a aVar;
        if (this.f343162k != null && "canary".equals(this.f343167p) && (aVar = this.f343163l) != null && !aVar.mo165844h()) {
            mo173668l(JiffiesMonitorFeature.JiffiesSnapshot.class, new C114471d());
        }
    }

    /* renamed from: c */
    public long mo173660c(long j) {
        C113287a aVar = this.f343163l;
        if (aVar != null) {
            return m161059d(j, aVar.f338976n);
        }
        C118672d.m167356f("Matrix.battery.CompositeMonitors", "AppStats should not be null to computeAvgJiffies", new Object[0]);
        return -1;
    }

    /* renamed from: e */
    public void mo173661e(Class<? extends C114436a> cls) {
        C114436a aVar;
        if (this.f343163l != null && (aVar = (C114436a) mo173670n(cls)) != null) {
            ((HashMap) this.f343158g).put(cls, aVar.mo173634k(this.f343163l.f338976n));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        r2 = (java.lang.Class) r2.getKey();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo173662f() {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r14.hashCode()
            r0.append(r1)
            java.lang.String r1 = " #finish: "
            r0.append(r1)
            java.lang.String r1 = r14.f343167p
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Matrix.battery.CompositeMonitors"
            p723vf.C118672d.m167353c(r3, r0, r2)
            java.util.Map<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.k0$a<?>>, com.tencent.matrix.batterycanary.monitor.feature.k0$a<?>> r0 = r14.f343153b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            com.tencent.matrix.batterycanary.monitor.feature.k0$a r4 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a) r4
            if (r4 == 0) goto L_0x002e
            java.lang.Object r2 = r2.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            com.tencent.matrix.batterycanary.monitor.feature.k0$a r5 = r14.mo173680w(r2)
            if (r5 == 0) goto L_0x002e
            java.lang.Class r6 = r5.getClass()
            java.lang.Class r7 = r4.getClass()
            if (r6 != r7) goto L_0x002e
            boolean r6 = r4 instanceof p1195ge.C116947b.C116948a
            if (r6 == 0) goto L_0x0072
            r6 = r4
            ge.b$a r6 = (p1195ge.C116947b.C116948a) r6
            ge.b$a$b r7 = r6.f350465d
            if (r7 == 0) goto L_0x0072
            ge.b$a r5 = (p1195ge.C116947b.C116948a) r5
            r6.mo180932b(r5)
            ge.b$a$b r4 = r6.f350465d
            ge.b$a r4 = r4.f350513c
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a$a r7 = new com.tencent.matrix.batterycanary.monitor.feature.k0$a$a$a
            r7.<init>(r6, r5, r4)
            goto L_0x0076
        L_0x0072:
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r7 = r5.mo111825a(r4)
        L_0x0076:
            java.util.Map<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.k0$a<?>>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<?>> r4 = r14.f343154c
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r2, r7)
            goto L_0x002e
        L_0x007e:
            r14.mo173659b()
            java.util.Map<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.k0$a<?>>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$c> r0 = r14.f343156e
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x008d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0171
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r14.hashCode()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            java.lang.Object r5 = r2.getValue()
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c r5 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114503c) r5
            java.lang.String r5 = r5.f343214a
            r4.append(r5)
            java.lang.String r5 = " #pause: "
            r4.append(r5)
            java.lang.String r5 = r14.f343167p
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            p723vf.C118672d.m167353c(r3, r4, r5)
            java.lang.Object r4 = r2.getValue()
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c r4 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114503c) r4
            r5 = 1
            r4.f343218e = r5
            long r5 = android.os.SystemClock.uptimeMillis()
            r4.f343222i = r5
            android.os.Handler r5 = r4.f343215b
            java.lang.Runnable r4 = r4.f343217d
            r5.removeCallbacks(r4)
            java.lang.Object r4 = r2.getValue()
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c r4 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114503c) r4
            int r5 = r4.f343220g
            r6 = 0
            java.lang.String r7 = "Matrix.battery.Sampler"
            if (r5 > 0) goto L_0x0104
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Sampling count is invalid: "
            r5.append(r8)
            int r4 = r4.f343220g
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            p723vf.C118672d.m167356f(r7, r4, r5)
            goto L_0x0162
        L_0x0104:
            long r8 = r4.f343221h
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0140
            long r12 = r4.f343222i
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0140
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0117
            goto L_0x0140
        L_0x0117:
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r6 = new com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b
            r6.<init>()
            long r7 = r4.f343219f
            r6.f343229a = r7
            int r5 = r4.f343220g
            r6.f343230b = r5
            long r7 = r4.f343222i
            long r9 = r4.f343221h
            long r7 = r7 - r9
            r6.f343231c = r7
            double r7 = r4.f343223j
            r6.f343232d = r7
            double r7 = r4.f343224k
            r6.f343233e = r7
            double r7 = r4.f343225l
            r6.f343234f = r7
            double r7 = r4.f343226m
            r6.f343235g = r7
            double r4 = r4.f343227n
            r6.f343236h = r4
            goto L_0x0162
        L_0x0140:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Sampling bgn/end millis is invalid: "
            r5.append(r8)
            long r8 = r4.f343221h
            r5.append(r8)
            java.lang.String r8 = " - "
            r5.append(r8)
            long r8 = r4.f343222i
            r5.append(r8)
            java.lang.String r4 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            p723vf.C118672d.m167356f(r7, r4, r5)
        L_0x0162:
            if (r6 == 0) goto L_0x008d
            java.util.Map<java.lang.Class<? extends com.tencent.matrix.batterycanary.monitor.feature.k0$a<?>>, com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b> r4 = r14.f343157f
            java.lang.Object r2 = r2.getKey()
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r2, r6)
            goto L_0x008d
        L_0x0171:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r14.f343166o
            long r0 = r0 - r2
            ce.a r0 = p1177ce.C113287a.m155094b(r0)
            r14.f343163l = r0
            java.lang.Class<ge.b$a> r0 = p1195ge.C116947b.C116948a.class
            com.tencent.matrix.batterycanary.monitor.feature.k r1 = new com.tencent.matrix.batterycanary.monitor.feature.k
            r1.<init>(r14)
            r14.mo173668l(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C114467i.mo173662f():void");
    }

    /* renamed from: g */
    public List<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> mo173663g() {
        C114490k0.C114491a.C114492a<JiffiesMonitorFeature.UidJiffiesSnapshot> k = mo173667k(JiffiesMonitorFeature.UidJiffiesSnapshot.class);
        if (k != null) {
            return ((JiffiesMonitorFeature.UidJiffiesSnapshot) k.f343207c).f343086f;
        }
        C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> k2 = mo173667k(JiffiesMonitorFeature.JiffiesSnapshot.class);
        return k2 != null ? Collections.singletonList(k2) : Collections.emptyList();
    }

    /* renamed from: h */
    public void mo173664h(C87705i<C113287a> iVar) {
        C113287a aVar = this.f343163l;
        if (aVar != null) {
            iVar.accept(aVar);
        }
    }

    /* renamed from: i */
    public void mo173665i(C87705i<Map<String, List<C58104c<Class<? extends C114436a>, C114490k0.C114491a.C114492a<C114436a.C114440d>>>>> iVar) {
        iVar.accept(((HashMap) this.f343159h).size() <= 1 ? this.f343159h : C117159b.m165221v(this.f343159h, new C114485j(this)));
    }

    /* renamed from: j */
    public int mo173666j() {
        long j;
        Class<JiffiesMonitorFeature.JiffiesSnapshot> cls = JiffiesMonitorFeature.JiffiesSnapshot.class;
        if (this.f343163l == null) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "AppStats should not be null to get CpuLoad", new Object[0]);
            return -1;
        }
        C114490k0.C114491a.C114492a<JiffiesMonitorFeature.UidJiffiesSnapshot> k = mo173667k(JiffiesMonitorFeature.UidJiffiesSnapshot.class);
        if (k != null) {
            j = ((Long) ((JiffiesMonitorFeature.UidJiffiesSnapshot) k.f343207c).f343084d.f343211a).longValue();
        } else {
            C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> k2 = mo173667k(cls);
            if (k2 == null) {
                C118672d.m167356f("Matrix.battery.CompositeMonitors", cls + " should be metrics to get CpuLoad", new Object[0]);
                return -1;
            }
            j = ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) k2.f343207c).f343062g.f343211a).longValue();
        }
        long j2 = this.f343163l.f338976n;
        return (int) ((j2 > 0 ? ((float) (j * 10)) / ((float) j2) : 0.0f) * 100.0f);
    }

    /* renamed from: k */
    public <T extends C114490k0.C114491a<T>> C114490k0.C114491a.C114492a<T> mo173667k(Class<T> cls) {
        return (C114490k0.C114491a.C114492a) ((HashMap) this.f343154c).get(cls);
    }

    /* renamed from: l */
    public <T extends C114490k0.C114491a<T>> void mo173668l(Class<T> cls, C87705i<C114490k0.C114491a.C114492a<T>> iVar) {
        C114490k0.C114491a.C114492a<T> k = mo173667k(cls);
        if (k != null) {
            iVar.accept(k);
        }
    }

    /* renamed from: m */
    public int mo173669m() {
        if (this.f343163l == null) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "AppStats should not be null to get CpuLoad", new Object[0]);
            return -1;
        }
        C114490k0.C114491a.C114492a<CpuStatFeature.C114427b> k = mo173667k(CpuStatFeature.C114427b.class);
        if (k == null) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "Configure CpuLoad by uptime", new Object[0]);
            return -1;
        }
        long d = ((CpuStatFeature.C114427b) k.f343207c).mo173609d();
        long j = this.f343163l.f338976n;
        return (int) ((j > 0 ? ((float) (d * 10)) / ((float) j) : 0.0f) * 100.0f);
    }

    /* renamed from: n */
    public <T extends C114490k0> T mo173670n(Class<T> cls) {
        C113314g gVar = this.f343162k;
        if (gVar == null) {
            return null;
        }
        Iterator it = ((ArrayList) gVar.f339057d.f339053x).iterator();
        while (it.hasNext()) {
            T t = (C114490k0) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: o */
    public <T extends C114490k0> void mo173671o(Class<T> cls, C87705i<T> iVar) {
        T n = mo173670n(cls);
        if (n != null) {
            iVar.accept(n);
        }
    }

    /* renamed from: p */
    public int mo173672p() {
        int j = mo173666j();
        if (j == -1) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "cpu is invalid", new Object[0]);
            return -1;
        }
        C114490k0.C114491a.C114503c.C114505b q = mo173673q(C114536x.C114543g.class);
        if (q == null) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "cpufreq is null", new Object[0]);
            return -1;
        }
        ArrayList arrayList = (ArrayList) C117159b.m165212m();
        if (arrayList.size() != C117159b.m165210k()) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "cpuCore is invalid: " + arrayList.size() + " vs " + C117159b.m165210k(), new Object[0]);
        }
        Iterator it = arrayList.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            int i = 0;
            for (int i2 : (int[]) it.next()) {
                if (i2 > i) {
                    i = i2;
                }
            }
            j2 += (long) i;
        }
        if (j2 <= 0) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "cpufreq sum is invalid: " + j2, new Object[0]);
            return -1;
        }
        double d = (double) j2;
        if (q.f343236h >= d) {
            C118672d.m167356f("Matrix.battery.CompositeMonitors", "NorCpuLoad err: sampling = " + q, new Object[0]);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C118672d.m167356f("Matrix.battery.CompositeMonitors", "NorCpuLoad err: freqs = " + Arrays.toString((int[]) it4.next()), new Object[0]);
            }
        }
        return (int) ((((double) j) * q.f343236h) / d);
    }

    /* renamed from: q */
    public C114490k0.C114491a.C114503c.C114505b mo173673q(Class<? extends C114490k0.C114491a<?>> cls) {
        return (C114490k0.C114491a.C114503c.C114505b) ((HashMap) this.f343157f).get(cls);
    }

    /* renamed from: r */
    public List<C114490k0.C114491a.C114492a<C114436a.C114440d>> mo173674r(Class<? extends C114436a> cls) {
        List<C114490k0.C114491a.C114492a<C114436a.C114440d>> list = (List) ((HashMap) this.f343158g).get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: s */
    public C114467i mo173675s(Class<? extends C114490k0.C114491a<?>> cls) {
        if (!((ArrayList) this.f343152a).contains(cls)) {
            ((ArrayList) this.f343152a).add(cls);
        }
        return this;
    }

    /* renamed from: t */
    public C114467i mo173676t() {
        mo173675s(JiffiesMonitorFeature.JiffiesSnapshot.class);
        mo173675s(C114444c.C114446c.class);
        mo173675s(C114519q0.C114523c.class);
        mo173675s(CpuStatFeature.C114427b.class);
        mo173675s(C114451e.C114458h.class);
        mo173675s(C114536x.C114543g.class);
        mo173675s(C114536x.C114541e.class);
        mo173675s(C114513o0.C114515b.class);
        mo173675s(C80364g.C80367b.class);
        mo173675s(C80373t0.C80376b.class);
        mo173675s(C80368h0.C80371b.class);
        return this;
    }

    public String toString() {
        return "CompositeMonitors{\nMetrics=" + this.f343152a + "\n, BgnSnapshots=" + this.f343153b + "\n, Deltas=" + this.f343154c + "\n, SampleRegs=" + this.f343155d + "\n, Samplers=" + this.f343156e + "\n, SampleResults=" + this.f343157f + "\n, TaskDeltas=" + this.f343158g + "\n, AppStats=" + this.f343163l + "\n, Stacks=" + this.f343161j + "\n, Extras =" + this.f343160i + "\n" + '}';
    }

    /* renamed from: u */
    public C114467i mo173678u(Class<? extends C114490k0.C114491a<?>> cls, long j) {
        ((HashMap) this.f343155d).put(cls, Long.valueOf(j));
        return this;
    }

    /* renamed from: v */
    public void mo173679v() {
        C118672d.m167353c("Matrix.battery.CompositeMonitors", hashCode() + " #start: " + this.f343167p, new Object[0]);
        this.f343163l = null;
        this.f343166o = SystemClock.uptimeMillis();
        Iterator it = ((ArrayList) this.f343152a).iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            C114490k0.C114491a<?> w = mo173680w(cls);
            if (w != null) {
                ((HashMap) this.f343153b).put(cls, w);
                if (w instanceof C116947b.C116948a) {
                    if (((HashMap) this.f343155d).containsKey(C116947b.C116948a.class)) {
                        C116947b.C116948a aVar = (C116947b.C116948a) w;
                        aVar.f350465d = new C116947b.C116948a.C116950b(aVar);
                    }
                }
            }
        }
        for (Map.Entry entry : ((HashMap) this.f343155d).entrySet()) {
            C114490k0.C114491a.C114503c x = mo173681x((Class) entry.getKey());
            if (x != null) {
                long longValue = ((Long) entry.getValue()).longValue();
                if (longValue > 0) {
                    x.f343219f = longValue;
                }
                x.f343218e = false;
                x.f343221h = SystemClock.uptimeMillis();
                x.f343215b.postDelayed(x.f343217d, x.f343219f);
            }
        }
    }

    /* renamed from: w */
    public C114490k0.C114491a<?> mo173680w(Class<? extends C114490k0.C114491a<?>> cls) {
        C116947b bVar;
        CpuStatFeature.C114427b bVar2;
        C117164j<C58104c<Integer, String>, CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat> jVar;
        CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat remoteStat;
        C113314g gVar;
        JiffiesMonitorFeature jiffiesMonitorFeature;
        C113314g gVar2;
        C114536x.C114543g gVar3;
        Class cls2 = CpuStatFeature.class;
        Class cls3 = JiffiesMonitorFeature.class;
        Class cls4 = C114536x.class;
        C114444c.C114446c cVar = null;
        if (cls == C114444c.C114446c.class) {
            C114444c cVar2 = (C114444c) mo173670n(C114444c.class);
            if (cVar2 != null) {
                C114444c.C114447d dVar = cVar2.f343119c;
                dVar.getClass();
                cVar = new C114444c.C114446c();
                synchronized (dVar.f343127a) {
                    cVar.f343122d = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(dVar.f343128b));
                    cVar.f343123e = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(dVar.f343129c));
                    cVar.f343124f = C114490k0.C114491a.C114494b.C114497b.m161112b(0);
                    cVar.f343125g = C114490k0.C114491a.C114494b.C114497b.m161112b(0);
                    cVar.f343126h = C114490k0.C114491a.C114494b.C114502c.m161119b();
                }
            }
            return cVar;
        } else if (cls == C80364g.C80367b.class) {
            C80364g gVar4 = (C80364g) mo173670n(C80364g.class);
            if (gVar4 == null) {
                return null;
            }
            C80364g.C80366c cVar3 = gVar4.f235235b;
            cVar3.getClass();
            C80364g.C80367b bVar3 = new C80364g.C80367b();
            bVar3.f235242d = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(cVar3.f235238a));
            bVar3.f235243e = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(cVar3.f235239b));
            bVar3.f235244f = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(cVar3.f235240c));
            bVar3.f235245g = cVar3.f235241d;
            return bVar3;
        } else if (cls == C114536x.C114543g.class) {
            C114536x xVar = (C114536x) mo173670n(cls4);
            if (xVar == null) {
                return null;
            }
            try {
                gVar3 = xVar.mo173710j(C117159b.m165211l());
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.battery.DeviceStatusMonitorFeature", th, "#currentCpuFreq error", new Object[0]);
                gVar3 = xVar.mo173710j(new int[0]);
            }
            return gVar3;
        } else if (cls == C114536x.C114541e.class) {
            C114536x xVar2 = (C114536x) mo173670n(cls4);
            if (xVar2 == null || (gVar2 = this.f343162k) == null) {
                return null;
            }
            return xVar2.mo173709i(gVar2.mo165879a());
        } else if (cls == JiffiesMonitorFeature.JiffiesSnapshot.class) {
            JiffiesMonitorFeature jiffiesMonitorFeature2 = (JiffiesMonitorFeature) mo173670n(cls3);
            if (jiffiesMonitorFeature2 != null) {
                return JiffiesMonitorFeature.JiffiesSnapshot.m160986b(JiffiesMonitorFeature.ProcessInfo.m160991a(), jiffiesMonitorFeature2.f349668a.f339057d.f339045p);
            }
            return null;
        } else if (cls == JiffiesMonitorFeature.UidJiffiesSnapshot.class && (jiffiesMonitorFeature = (JiffiesMonitorFeature) mo173670n(cls3)) != null) {
            return jiffiesMonitorFeature.mo173610i();
        } else {
            if (cls == C80368h0.C80371b.class) {
                C80368h0 h0Var = (C80368h0) mo173670n(C80368h0.class);
                if (h0Var == null) {
                    return null;
                }
                C80368h0.C80370c cVar4 = h0Var.f235246b;
                cVar4.getClass();
                C80368h0.C80371b bVar4 = new C80368h0.C80371b();
                bVar4.f235251d = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(cVar4.f235249a));
                bVar4.f235252e = cVar4.f235250b;
                return bVar4;
            } else if (cls == C114513o0.C114515b.class) {
                C114513o0 o0Var = (C114513o0) mo173670n(C114513o0.class);
                if (o0Var == null || (gVar = this.f343162k) == null) {
                    return null;
                }
                return o0Var.mo173699i(gVar.mo165879a());
            } else if (cls == C114519q0.C114523c.class) {
                C114519q0 q0Var = (C114519q0) mo173670n(C114519q0.class);
                if (q0Var == null) {
                    return null;
                }
                C114519q0.C80372e eVar = q0Var.f343264d;
                eVar.getClass();
                C114519q0.C114523c cVar5 = new C114519q0.C114523c();
                cVar5.f343269d = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(eVar.f235255c));
                cVar5.f343270e = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(eVar.f235254b));
                cVar5.f343271f = C114490k0.C114491a.C114494b.C114502c.m161119b();
                cVar5.f343272g = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(eVar.f235256d));
                cVar5.f343273h = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(eVar.f235257e));
                return cVar5;
            } else if (cls == C80373t0.C80376b.class) {
                C80373t0 t0Var = (C80373t0) mo173670n(C80373t0.class);
                if (t0Var == null) {
                    return null;
                }
                C80373t0.C80375c cVar6 = t0Var.f235258b;
                cVar6.getClass();
                C80373t0.C80376b bVar5 = new C80373t0.C80376b();
                bVar5.f235264d = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(cVar6.f235261a));
                bVar5.f235265e = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(cVar6.f235262b));
                bVar5.f235266f = cVar6.f235263c;
                return bVar5;
            } else if (cls == CpuStatFeature.C114427b.class) {
                CpuStatFeature cpuStatFeature = (CpuStatFeature) mo173670n(cls2);
                if (cpuStatFeature == null || !cpuStatFeature.mo173600x()) {
                    return null;
                }
                return cpuStatFeature.mo173598v();
            } else if (cls == CpuStatFeature.UidCpuStateSnapshot.class) {
                CpuStatFeature cpuStatFeature2 = (CpuStatFeature) mo173670n(cls2);
                if (cpuStatFeature2 == null || !cpuStatFeature2.mo173600x()) {
                    return null;
                }
                CpuStatFeature.UidCpuStateSnapshot uidCpuStateSnapshot = new CpuStatFeature.UidCpuStateSnapshot();
                try {
                    ArrayList arrayList = (ArrayList) C86507b.m107281l(cpuStatFeature2.f349668a.mo165879a());
                    uidCpuStateSnapshot.f343049d = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C58104c cVar7 = (C58104c) it.next();
                        int intValue = ((Integer) cVar7.f166179a).intValue();
                        String valueOf = String.valueOf(cVar7.f166180b);
                        if (intValue == Process.myPid()) {
                            bVar2 = cpuStatFeature2.mo173598v();
                        } else {
                            CpuStatFeature.C114427b w = C117178r.m165258a(intValue) ? cpuStatFeature2.mo173599w(intValue) : null;
                            bVar2 = (w == null || w.f343204c || (jVar = cpuStatFeature2.f349668a.f339057d.f339028C) == null || (remoteStat = (CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat) ((q$$c) jVar).apply(cVar7)) == null) ? w : CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.m160974a(remoteStat);
                        }
                        if (bVar2 != null) {
                            bVar2.f343055f = intValue;
                            bVar2.f343056g = C86853a.m107857d(valueOf);
                            uidCpuStateSnapshot.f343049d.add(bVar2);
                        }
                    }
                } catch (Exception e) {
                    C118672d.m167356f("Matrix.battery.CpuStatFeature", "get curr UidCpuStatSnapshot failed: " + e.getMessage(), new Object[0]);
                    uidCpuStateSnapshot.f343204c = false;
                }
                return uidCpuStateSnapshot;
            } else if (cls == C114451e.C114458h.class) {
                C114451e eVar2 = (C114451e) mo173670n(C114451e.class);
                if (eVar2 != null) {
                    return eVar2.mo173652i(0);
                }
                return null;
            } else if (cls != C116947b.C116948a.class || (bVar = (C116947b) mo173670n(C116947b.class)) == null) {
                return null;
            } else {
                return bVar.mo180931i();
            }
        }
    }

    /* renamed from: x */
    public C114490k0.C114491a.C114503c mo173681x(Class<? extends C114490k0.C114491a<?>> cls) {
        C116947b bVar;
        Long l;
        Class cls2 = C114513o0.class;
        Class cls3 = CpuStatFeature.class;
        Class cls4 = C114536x.class;
        if (cls == C114536x.C114543g.class) {
            C114536x xVar = (C114536x) mo173670n(cls4);
            if (xVar == null || this.f343162k == null) {
                return null;
            }
            CpuStatFeature cpuStatFeature = (CpuStatFeature) mo173670n(cls3);
            if (cpuStatFeature != null && cpuStatFeature.mo173600x()) {
                this.f343164m = new C114481n(C117159b.m165212m());
            }
            C114490k0.C114491a.C114503c cVar = new C114490k0.C114491a.C114503c("cpufreq", this.f343162k.f339059f, new C114472e(cpuStatFeature, xVar));
            ((HashMap) this.f343156e).put(cls, cVar);
            return cVar;
        } else if (cls == C114536x.C114541e.class) {
            C114536x xVar2 = (C114536x) mo173670n(cls4);
            if (xVar2 == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar2 = new C114490k0.C114491a.C114503c("batt-temp", this.f343162k.f339059f, new C114473f(xVar2));
            ((HashMap) this.f343156e).put(cls, cVar2);
            return cVar2;
        } else if (cls == C114536x.C114548k.class) {
            C114536x xVar3 = (C114536x) mo173670n(cls4);
            if (Build.VERSION.SDK_INT < 29 || xVar3 == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar3 = new C114490k0.C114491a.C114503c("thermal-stat", this.f343162k.f339059f, new C114474g());
            ((HashMap) this.f343156e).put(cls, cVar3);
            return cVar3;
        } else if (cls == C114536x.C114547j.class) {
            C114536x xVar4 = (C114536x) mo173670n(cls4);
            if (Build.VERSION.SDK_INT < 30 || xVar4 == null || this.f343162k == null || (l = (Long) ((HashMap) this.f343155d).get(cls)) == null || l.longValue() < 1000) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar4 = new C114490k0.C114491a.C114503c("thermal-headroom", this.f343162k.f339059f, new C114475h(l));
            ((HashMap) this.f343156e).put(cls, cVar4);
            return cVar4;
        } else if (cls == C114536x.C114542f.class) {
            if (((C114536x) mo173670n(cls4)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar5 = new C114490k0.C114491a.C114503c("batt-watt", this.f343162k.f339059f, new C114476i());
            ((HashMap) this.f343156e).put(cls, cVar5);
            return cVar5;
        } else if (cls == CpuStatFeature.C114427b.class) {
            CpuStatFeature cpuStatFeature2 = (CpuStatFeature) mo173670n(cls3);
            if (cpuStatFeature2 == null || !cpuStatFeature2.mo173600x() || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar6 = new C114490k0.C114491a.C114503c("cpu-stat", this.f343162k.f339059f, new C114477j(this, cpuStatFeature2));
            ((HashMap) this.f343156e).put(cls, cVar6);
            return cVar6;
        } else if (cls == JiffiesMonitorFeature.UidJiffiesSnapshot.class) {
            JiffiesMonitorFeature jiffiesMonitorFeature = (JiffiesMonitorFeature) mo173670n(JiffiesMonitorFeature.class);
            if (jiffiesMonitorFeature == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar7 = new C114490k0.C114491a.C114503c("uid-jiffies", this.f343162k.f339059f, new C114478k(this, jiffiesMonitorFeature));
            ((HashMap) this.f343156e).put(cls, cVar7);
            return cVar7;
        } else if (cls == C114513o0.C114515b.class) {
            C114513o0 o0Var = (C114513o0) mo173670n(cls2);
            if (o0Var == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar8 = new C114490k0.C114491a.C114503c("traffic", this.f343162k.f339059f, new C114479l(o0Var));
            ((HashMap) this.f343156e).put(cls, cVar8);
            return cVar8;
        } else if (cls == C114513o0.C114514a.class) {
            C114513o0 o0Var2 = (C114513o0) mo173670n(cls2);
            if (o0Var2 == null || this.f343162k == null) {
                return null;
            }
            this.f343165n = new C114480m();
            C114490k0.C114491a.C114503c cVar9 = new C114490k0.C114491a.C114503c("trafficBps", this.f343162k.f339059f, new C114468a(o0Var2));
            ((HashMap) this.f343156e).put(cls, cVar9);
            return cVar9;
        } else if (cls == C114536x.C114540d.class) {
            if (((C114536x) mo173670n(cls4)) == null || this.f343162k == null) {
                return null;
            }
            C114490k0.C114491a.C114503c cVar10 = new C114490k0.C114491a.C114503c("batt-curr", this.f343162k.f339059f, new C114469b());
            ((HashMap) this.f343156e).put(cls, cVar10);
            return cVar10;
        } else if (cls != C116947b.C116948a.class || (bVar = (C116947b) mo173670n(C116947b.class)) == null || this.f343162k == null) {
            return null;
        } else {
            C114490k0.C114491a.C114503c cVar11 = new C114490k0.C114491a.C114503c("health-stats", this.f343162k.f339059f, new C114470c(bVar));
            ((HashMap) this.f343156e).put(cls, cVar11);
            return cVar11;
        }
    }
}
