package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C114067pm;
import com.tencent.mapsdk.internal.C114072pn;
import com.tencent.mapsdk.internal.C114078pq;
import com.tencent.mapsdk.internal.C114081ps;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.tencent.mapsdk.internal.pl */
public final class C114065pl implements C114067pm.C26874c, C114072pn.C114073a {

    /* renamed from: c */
    public static final String f341304c = "AUTH_MARKER";

    /* renamed from: a */
    public final C113558bl f341305a;

    /* renamed from: b */
    public List<AsyncTask> f341306b = new ArrayList();

    /* renamed from: d */
    private final C114189rv f341307d;

    /* renamed from: e */
    private final C114129qx f341308e;

    /* renamed from: f */
    private final C114081ps f341309f;

    /* renamed from: g */
    private final C113961mq f341310g;

    /* renamed from: h */
    private final C114078pq f341311h;

    /* renamed from: i */
    private boolean f341312i;

    /* renamed from: j */
    private final C114322sx f341313j;

    /* renamed from: com.tencent.mapsdk.internal.pl$a */
    public interface C114066a {
        /* renamed from: a */
        void mo171682a(Bitmap bitmap, int i, int i2);
    }

    public C114065pl(C113540bh bhVar) {
        String str;
        String str2;
        TencentMap.OnAuthResultCallback onAuthResultCallback;
        Context context = bhVar.f339764c;
        this.f341313j = bhVar.f339763b;
        this.f341307d = bhVar.f339763b.f342584k;
        C113558bl blVar = bhVar.f339765d;
        this.f341305a = blVar;
        this.f341308e = bhVar.f339766e;
        this.f341309f = bhVar.f339767f;
        this.f341310g = bhVar.f339763b.f342647aD;
        if (bhVar.f339763b == null || bhVar.f339763b.mo171547K() == null) {
            onAuthResultCallback = null;
            str2 = "";
            str = str2;
        } else {
            String subKey = bhVar.f339763b.mo171547K().getSubKey();
            String subId = bhVar.f339763b.mo171547K().getSubId();
            onAuthResultCallback = bhVar.f339763b.mo171547K().getOnAuthCallback();
            str = subId;
            str2 = subKey;
        }
        this.f341311h = new C114078pq(context, bhVar, str2);
        this.f341306b.add(new C114067pm(blVar.f339843j, str2, str, this, onAuthResultCallback));
        this.f341306b.add(new C114072pn(bhVar, this));
    }

    /* renamed from: a */
    private void m158819a(C114066a aVar, TencentMapOptions tencentMapOptions) {
        this.f341305a.mo171694a(aVar, tencentMapOptions);
    }

    /* renamed from: b */
    private static void m158821b() {
    }

    /* renamed from: c */
    private void m158822c() {
        C113896kq.m157663b(C0950kp.f2275U);
        for (AsyncTask execute : this.f341306b) {
            execute.execute(new Object[0]);
        }
    }

    /* renamed from: a */
    private void m158820a(JSONArray jSONArray, C113735fr frVar) {
        List<C114128qw> a;
        C114129qx qxVar = this.f341308e;
        if (qxVar != null) {
            String a2 = qxVar.f341619e.mo172391a(C0939el.f2167A);
            if (!(jSONArray == null || (a = C114129qx.m159256a(jSONArray)) == null)) {
                synchronized (qxVar.f341618d) {
                    qxVar.f341617c.clear();
                    qxVar.f341617c.addAll(a);
                }
                if (!jSONArray.toString().equals(a2)) {
                    qxVar.f341619e.mo172392a();
                    qxVar.f341619e.mo172395a(C0939el.f2167A, jSONArray.toString());
                }
            }
            C113497ab abVar = this.f341313j.f342588o;
            if (abVar != null) {
                if (frVar != null) {
                    abVar.f339621b = frVar;
                    C113889km.m157545b(C0949kl.f2236f, "IndoorAuth:".concat(String.valueOf(frVar)));
                    abVar.f339620a.mo172393a(C0939el.f2168B, frVar.f340240c);
                    abVar.f339620a.mo172393a(C0939el.f2169C, frVar.f340241d);
                    JSONArray jSONArray2 = frVar.f340242e;
                    if (jSONArray2 != null) {
                        abVar.f339620a.mo172395a(C0939el.f2170D, jSONArray2.toString());
                    }
                    VectorMap vectorMap = abVar.f339623d;
                    if (vectorMap != null) {
                        vectorMap.mo171700a(abVar.mo171187a());
                        if (abVar.mo171187a() == 1) {
                            abVar.f339623d.mo173445a(abVar.mo171192b());
                        }
                    }
                } else {
                    abVar.f339620a.mo172396a(new String[]{C0939el.f2168B, C0939el.f2169C, C0939el.f2170D});
                }
                if (abVar.f339621b == null) {
                    abVar.f339621b = new C113735fr();
                }
                C113865kb.m157399a((Runnable) new Runnable() {
                    public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.ab.1.run():void, dex: classes9.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ab.1.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
            C114078pq pqVar = this.f341311h;
            String a3 = this.f341308e.mo172747a();
            String a4 = pqVar.mo172662a();
            if (C114078pq.f341347e.containsKey(a4)) {
                pqVar.mo172663a(a4, pqVar.f341352f);
                return;
            }
            pqVar.mo172663a(a4, pqVar.f341352f);
            C113896kq.m157663b(C0950kp.f2276V);
            C113865kb.m157402b(new C114078pq.C114079a(pqVar, a3, frVar));
        }
    }

    /* renamed from: a */
    public final void mo172653a() {
        if (this.f341306b != null) {
            for (int i = 0; i < this.f341306b.size(); i++) {
                this.f341306b.get(i).cancel(true);
            }
            this.f341306b.clear();
        }
        this.f341306b = null;
        this.f341312i = true;
    }

    /* renamed from: a */
    public final void mo172654a(boolean z, C114185ru ruVar) {
        C114322sx sxVar = this.f341313j;
        if (sxVar != null && ruVar != null) {
            sxVar.mo172981a(z, ruVar.mo172834c());
            if (z) {
                this.f341307d.mo172837a();
            }
            this.f341307d.f341877d = true;
        }
    }

    /* renamed from: a */
    public final void mo54066a(C114067pm.C114071b bVar) {
        C113735fr frVar;
        List<C114128qw> a;
        boolean z;
        boolean z2;
        if (!this.f341312i) {
            JSONArray jSONArray = null;
            if (bVar != null) {
                jSONArray = bVar.f341330b;
                frVar = bVar.f341329a;
                C114080pr prVar = bVar.f341332d;
                if (prVar != null) {
                    C114081ps psVar = this.f341309f;
                    if (prVar != null && prVar.f341361a) {
                        psVar.f341367b.clear();
                        psVar.f341367b.addAll(prVar.f341362b);
                        if (!psVar.f341369d.isEmpty() || psVar.f341367b.isEmpty()) {
                            z = false;
                            for (C114084pt next : psVar.f341367b) {
                                Iterator<C114081ps.C114083a> it = psVar.f341369d.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = false;
                                        break;
                                    }
                                    C114081ps.C114083a next2 = it.next();
                                    if (next2.f341376d.equals(next.f341378a)) {
                                        if (!next2.f341377e.equalsIgnoreCase(next.f341379b)) {
                                            next.f341382e = true;
                                            String unused = next2.f341377e = next.f341379b;
                                        }
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    C114081ps.C114083a aVar = new C114081ps.C114083a(psVar, (byte) 0);
                                    String unused2 = aVar.f341376d = next.f341378a;
                                    String unused3 = aVar.f341377e = next.f341379b;
                                    psVar.f341369d.add(aVar);
                                    z = true;
                                }
                            }
                        } else {
                            z = false;
                            for (C114084pt next3 : psVar.f341367b) {
                                C114081ps.C114083a aVar2 = new C114081ps.C114083a(psVar, (byte) 0);
                                String unused4 = aVar2.f341376d = next3.f341378a;
                                String unused5 = aVar2.f341377e = next3.f341379b;
                                psVar.f341369d.add(aVar2);
                                z = true;
                            }
                        }
                        if (z) {
                            C113887kh.m157526a(psVar.f341368c).mo172293a("layer-infos", JsonUtils.collectionToJson(psVar.f341369d));
                        }
                    }
                }
            } else {
                frVar = null;
            }
            C114129qx qxVar = this.f341308e;
            if (qxVar != null) {
                String a2 = qxVar.f341619e.mo172391a(C0939el.f2167A);
                if (!(jSONArray == null || (a = C114129qx.m159256a(jSONArray)) == null)) {
                    synchronized (qxVar.f341618d) {
                        qxVar.f341617c.clear();
                        qxVar.f341617c.addAll(a);
                    }
                    if (!jSONArray.toString().equals(a2)) {
                        qxVar.f341619e.mo172392a();
                        qxVar.f341619e.mo172395a(C0939el.f2167A, jSONArray.toString());
                    }
                }
                C113497ab abVar = this.f341313j.f342588o;
                if (abVar != null) {
                    if (frVar != null) {
                        abVar.f339621b = frVar;
                        C113889km.m157545b(C0949kl.f2236f, "IndoorAuth:".concat(String.valueOf(frVar)));
                        abVar.f339620a.mo172393a(C0939el.f2168B, frVar.f340240c);
                        abVar.f339620a.mo172393a(C0939el.f2169C, frVar.f340241d);
                        JSONArray jSONArray2 = frVar.f340242e;
                        if (jSONArray2 != null) {
                            abVar.f339620a.mo172395a(C0939el.f2170D, jSONArray2.toString());
                        }
                        VectorMap vectorMap = abVar.f339623d;
                        if (vectorMap != null) {
                            vectorMap.mo171700a(abVar.mo171187a());
                            if (abVar.mo171187a() == 1) {
                                abVar.f339623d.mo173445a(abVar.mo171192b());
                            }
                        }
                    } else {
                        abVar.f339620a.mo172396a(new String[]{C0939el.f2168B, C0939el.f2169C, C0939el.f2170D});
                    }
                    if (abVar.f339621b == null) {
                        abVar.f339621b = new C113735fr();
                    }
                    C113865kb.m157399a((Runnable) new Runnable() {
                        /*  JADX ERROR: Method generation error
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ab.1.run():void, class status: UNLOADED
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
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            */
                        /*  JADX ERROR: Method generation error: Method args not loaded: com.tencent.mapsdk.internal.ab.1.run():void, class status: UNLOADED
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ab.1.run():void, class status: UNLOADED
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
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            */
                        public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.ab.1.run():void, dex: classes9.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ab.1.run():void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
                C114078pq pqVar = this.f341311h;
                String a3 = this.f341308e.mo172747a();
                String a4 = pqVar.mo172662a();
                if (C114078pq.f341347e.containsKey(a4)) {
                    pqVar.mo172663a(a4, pqVar.f341352f);
                } else {
                    pqVar.mo172663a(a4, pqVar.f341352f);
                    C113896kq.m157663b(C0950kp.f2276V);
                    C113865kb.m157402b(new C114078pq.C114079a(pqVar, a3, frVar));
                }
            }
            C113961mq mqVar = this.f341310g;
            if (!(mqVar == null || bVar == null)) {
                int i = bVar.f341333e;
                if (i == C114141rg.f341664d || i == C114141rg.f341665e) {
                    mqVar.mo172459i(true);
                } else {
                    mqVar.mo172459i(false);
                }
                C113645dy dyVar = (C113645dy) this.f341310g.getMapComponent(C113645dy.class);
                if (dyVar != null) {
                    dyVar.mo171972a(bVar.f341331c);
                }
            }
            C113896kq.m157671d(C0950kp.f2275U);
        }
    }
}
