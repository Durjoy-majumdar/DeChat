package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C9500j;
import p407zo.C23547h;
import qo3.C12925w;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.g */
public class C19559g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppChooserUI f55369d;

    public C19559g(AppChooserUI appChooserUI) {
        this.f55369d = appChooserUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppChooserUI appChooserUI = this.f55369d;
        appChooserUI.f55159r = true;
        C12925w wVar = new C12925w(appChooserUI);
        appChooserUI.f55153j = wVar;
        wVar.mo12470j(C0966R.C0971layout.czk);
        View view2 = appChooserUI.f55153j.f36927f;
        C85875k4.m106191k0(((TextView) view2.findViewById(C0966R.C0970id.ndx)).getPaint());
        ((Button) view2.findViewById(C0966R.C0970id.ndu)).setOnClickListener(new C19561h(appChooserUI));
        ((Button) view2.findViewById(C0966R.C0970id.ndv)).setOnClickListener(appChooserUI.f55139S);
        appChooserUI.f55154n = (WxRecyclerView) view2.findViewById(C0966R.C0970id.ndw);
        WxRecyclerAdapter<AppChooserUI.C19509p> wxRecyclerAdapter = new WxRecyclerAdapter<>(new C9500j() {
            public jq3.C60896i<?> getItemConvert(
/*
Method generation error in method: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.17.getItemConvert(int):jq3.i<?>, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.17.getItemConvert(int):jq3.i<?>, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
        }, appChooserUI.f55125D, true);
        appChooserUI.f55155o = wxRecyclerAdapter;
        wxRecyclerAdapter.mo85793T5(new C19563i(appChooserUI), false);
        appChooserUI.f55154n.setLayoutManager(new LinearLayoutManager(appChooserUI));
        appChooserUI.f55154n.setAdapter(appChooserUI.f55155o);
        appChooserUI.f55155o.notifyDataSetChanged();
        C12925w wVar2 = appChooserUI.f55153j;
        wVar2.f36937s = appChooserUI.f55144X;
        wVar2.mo5086o();
        AppChooserUI appChooserUI2 = this.f55369d;
        ((C23547h) C86312j.m106911c(C23547h.class)).mo36794Mf(3, appChooserUI2.f55167z, "", appChooserUI2.f55128G);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
