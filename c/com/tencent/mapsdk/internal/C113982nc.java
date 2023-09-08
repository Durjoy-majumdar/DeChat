package com.tencent.mapsdk.internal;

import android.util.Pair;
import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.lib.models.GLModelInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C113971mt;
import com.tencent.mapsdk.internal.C114216sq;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.nc */
public final class C113982nc extends C113971mt<C113983nd> {

    /* renamed from: i */
    private HashMap<Long, LatLngBounds> f340974i = new HashMap<>();

    public C113982nc(C114216sq sqVar) {
        super(sqVar);
    }

    /* renamed from: j */
    private void m158319j() {
        ArrayList arrayList = new ArrayList();
        for (Long l : this.f340974i.keySet()) {
            arrayList.add(this.f340974i.get(l));
        }
        this.f340957a.mo172918a((List<LatLngBounds>) arrayList);
    }

    /* renamed from: k */
    private C113982nc m158320k() {
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ C113970ms mo172486a(C113973mu muVar) {
        return new C113984ne(this, (C113983nd) muVar);
    }

    /* renamed from: c */
    public final void mo172491c() {
    }

    /* renamed from: c */
    public final void mo172492c(C113970ms msVar) {
        ((C113984ne) msVar).mo172532c();
    }

    /* renamed from: d */
    public final int mo172530d(long j) {
        C114216sq sqVar = this.f340957a;
        return Math.max(((Integer) sqVar.mo172924b(new CallbackRunnable<Integer>(j) {
            /* renamed from: a */
            private Integer m160111a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetCurrentMaterialVariant(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetCurrentMaterialVariant(C114216sq.this.f342024e, r2));
            }
        }, 0)).intValue(), 0);
    }

    /* renamed from: e */
    public final void mo172494e() {
        if (this.f340957a.mo172964z()) {
            this.f340957a.f342029j.f340914v = true;
        }
    }

    /* renamed from: f */
    public final void mo172495f() {
        int size = this.f340959c.size();
        for (int i = 0; i < size; i++) {
            C113984ne neVar = (C113984ne) this.f340959c.get(this.f340959c.keyAt(i));
            C114216sq sqVar = this.f340957a;
            neVar.mo172477a(((Long) sqVar.mo172900a(new CallbackRunnable<Long>((GLModelInfo) neVar.f340956d) {
                /* renamed from: a */
                private Long m160101a() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddGLModel(C114216sq.this.f342024e, r4));
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return 0L;
                    }
                    return Long.valueOf(C114216sq.this.f342023d.nativeAddGLModel(C114216sq.this.f342024e, r4));
                }
            }, 0L)).longValue());
            if (((C113983nd) neVar.f340956d).f340975a.isBuildingHidden() && ((C113983nd) neVar.f340956d).f340975a.getLatLngBounds() != null) {
                this.f340974i.put(Long.valueOf(neVar.mo172480e_()), ((C113983nd) neVar.f340956d).f340975a.getLatLngBounds());
            }
        }
        m158319j();
    }

    /* renamed from: g */
    public final void mo172496g() {
        int size = this.f340961e.size();
        for (int i = 0; i < size; i++) {
            C113984ne neVar = (C113984ne) this.f340961e.get(this.f340961e.keyAt(i));
            C114216sq sqVar = this.f340957a;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(neVar.mo172480e_(), (GLModelInfo) neVar.f340956d) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0 && r2 != 0) {
                        C114216sq.this.f342023d.nativeUpdateGLModel(C114216sq.this.f342024e, r2, r4);
                    }
                }
            });
            if (((C113983nd) neVar.f340956d).f340975a.isBuildingHidden() && ((C113983nd) neVar.f340956d).f340975a.getLatLngBounds() != null) {
                this.f340974i.put(Long.valueOf(neVar.mo172480e_()), ((C113983nd) neVar.f340956d).f340975a.getLatLngBounds());
            }
        }
        m158319j();
    }

    /* renamed from: h */
    public final void mo172497h() {
        int size = this.f340963g.size();
        for (int i = 0; i < size; i++) {
            C113970ms msVar = this.f340963g.get(this.f340963g.keyAt(i));
            this.f340957a.mo172935c(msVar.mo172480e_());
            this.f340974i.remove(Long.valueOf(msVar.mo172480e_()));
        }
        m158319j();
    }

    /* renamed from: i */
    public final boolean mo172498i() {
        for (int i = 0; i < this.f340958b.size(); i++) {
            if (((C113984ne) this.f340958b.valueAt(i)).isClickEnabled()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized C113984ne mo172488b(C113983nd ndVar) {
        return (C113984ne) super.mo172488b(ndVar);
    }

    /* renamed from: a */
    private C113970ms<C113983nd> m158317a(C113983nd ndVar) {
        return new C113984ne(this, ndVar);
    }

    /* renamed from: b */
    public final List<CommonParamsModelClass.AnimationInfo> mo172528b(long j) {
        C114216sq sqVar = this.f340957a;
        int intValue = ((Integer) sqVar.mo172924b(new CallbackRunnable<Integer>(j) {
            /* renamed from: a */
            private Integer m160105a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationCount(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationCount(C114216sq.this.f342024e, r2));
            }
        }, 0)).intValue();
        if (intValue <= 0) {
            return null;
        }
        C114216sq sqVar2 = this.f340957a;
        float[] fArr = (float[]) sqVar2.mo172924b(new CallbackRunnable<float[]>(j) {
            /* renamed from: a */
            private float[] m160106a() {
                return C114216sq.this.f342024e == 0 ? new float[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationDuration(C114216sq.this.f342024e, r2);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? new float[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationDuration(C114216sq.this.f342024e, r2);
            }
        }, new float[0]);
        C114216sq sqVar3 = this.f340957a;
        String[] strArr = (String[]) sqVar3.mo172924b(new CallbackRunnable<String[]>(j) {
            /* renamed from: a */
            private String[] m160107a() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationName(C114216sq.this.f342024e, r2);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationName(C114216sq.this.f342024e, r2);
            }
        }, new String[0]);
        if (fArr == null || strArr == null || fArr.length != strArr.length || fArr.length != intValue) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < intValue; i++) {
            arrayList.add(new CommonParamsModelClass.AnimationInfo(i, strArr[i], fArr[i]));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List<CommonParamsModelClass.MaterialVariantInfo> mo172529c(long j) {
        C114216sq sqVar = this.f340957a;
        C114216sq.C11430489 r1 = new CallbackRunnable<String[]>(j) {
            /* renamed from: a */
            private String[] m160108a() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetVariantNames(C114216sq.this.f342024e, r2);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetVariantNames(C114216sq.this.f342024e, r2);
            }
        };
        String[] strArr = (String[]) sqVar.mo172924b(r1, new String[0]);
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                CommonParamsModelClass.MaterialVariantInfo materialVariantInfo = new CommonParamsModelClass.MaterialVariantInfo();
                materialVariantInfo.variantName = str;
                arrayList.add(materialVariantInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Pair<VectorOverlay, TencentMap.IClickedObject> mo172484a(LatLng latLng, long j, String str, String str2) {
        Pair<VectorOverlay, TencentMap.IClickedObject> pair = new Pair<>((Object) null, (Object) null);
        if (j > 0) {
            for (int i = 0; i < this.f340958b.size(); i++) {
                C113984ne neVar = (C113984ne) this.f340958b.valueAt(i);
                if (neVar.mo172480e_() == j) {
                    C113971mt.C113972a aVar = new C113971mt.C113972a(latLng, str, str2);
                    C113865kb.m157399a((Runnable) new Runnable(aVar) {
                        public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.ne.1.run():void, dex: classes9.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ne.1.run():void, class status: UNLOADED
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
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                    return new Pair<>(neVar, aVar);
                }
            }
        }
        return pair;
    }

    /* renamed from: e */
    public final void mo172531e(long j) {
        for (int i = 0; i < this.f340958b.size(); i++) {
            if (((C113984ne) this.f340958b.valueAt(i)).mo172480e_() == j) {
                C114216sq sqVar = this.f340957a;
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(j) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0 && r2 != 0) {
                            C114216sq.this.f342023d.nativeResetMonoColor(C114216sq.this.f342024e, r2);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo172527a(long j, int i, float f, boolean z) {
        for (int i2 = 0; i2 < this.f340958b.size(); i2++) {
            if (((C113984ne) this.f340958b.valueAt(i2)).mo172480e_() == j) {
                C114216sq sqVar = this.f340957a;
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(j, i, f, z) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0 && r2 != 0) {
                            C114216sq.this.f342023d.nativeStartGLModelSkeletonAnimation(C114216sq.this.f342024e, r2, r4, r5, r6);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo172524a(long j) {
        for (int i = 0; i < this.f340958b.size(); i++) {
            if (((C113984ne) this.f340958b.valueAt(i)).mo172480e_() == j) {
                C114216sq sqVar = this.f340957a;
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(j) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0 && r2 != 0) {
                            C114216sq.this.f342023d.nativeStopGLModelSkeletonAnimation(C114216sq.this.f342024e, r2);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo172526a(long j, int i) {
        for (int i2 = 0; i2 < this.f340958b.size(); i2++) {
            if (((C113984ne) this.f340958b.valueAt(i2)).mo172480e_() == j) {
                C114216sq sqVar = this.f340957a;
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(j, i) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0 && r2 != 0) {
                            C114216sq.this.f342023d.nativeSetMaterialVariant(C114216sq.this.f342024e, r2, r4);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo172525a(long j, float f, float f2, float f3) {
        for (int i = 0; i < this.f340958b.size(); i++) {
            if (((C113984ne) this.f340958b.valueAt(i)).mo172480e_() == j) {
                C114216sq sqVar = this.f340957a;
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(j, f, f2, f3) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0 && r2 != 0) {
                            C114216sq.this.f342023d.nativeSetMonoColor(C114216sq.this.f342024e, r2, r4, r5, r6);
                        }
                    }
                });
            }
        }
    }
}
