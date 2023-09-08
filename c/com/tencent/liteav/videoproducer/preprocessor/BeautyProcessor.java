package com.tencent.liteav.videoproducer.preprocessor;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C104506j;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.C17125a;
import com.tencent.liteav.beauty.p305b.C17129a;
import com.tencent.liteav.beauty.p305b.C17135b;
import com.tencent.liteav.beauty.p305b.C17158l;
import com.tencent.liteav.beauty.p305b.p306a.C17131a;
import com.tencent.liteav.beauty.p305b.p307b.C17136a;
import com.tencent.liteav.beauty.p305b.p308c.C17142a;
import com.tencent.liteav.videobase.base.C17200a;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p309a.C17195h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.xweb.file.XVFSFile;
import java.util.HashMap;
import java.util.Map;

@JNINamespace("liteav::video")
public class BeautyProcessor extends C17195h {
    private static final String TAG = "TXCBeautyManager";
    private final SparseArray<C17189b> mBeautyFilters;
    private float mBeautyLevel = 0.0f;
    private C17533a mBeautyManagerStatusListener;
    private final Map<String, String> mBeautyStats = new HashMap();
    private int mBeautyStyle = -1;
    private final boolean mIsEnterPriseProEnabled;
    private boolean mIsPerformanceMode = true;
    private final C17158l mMotionFilter;
    private final IVideoReporter mReporter;
    private float mRuddyLevel = 0.0f;
    private float mSharpnessLevel = 0.4f;
    private float mUserSetSharpnessLevel = 0.0f;
    private float mWhitenessLevel = 0.0f;

    /* renamed from: com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor$a */
    public interface C17533a {
        void onBeautyStatsChanged(String str);
    }

    public BeautyProcessor(Context context, boolean z, IVideoReporter iVideoReporter) {
        this.mReporter = iVideoReporter;
        this.mIsEnterPriseProEnabled = z;
        this.mBeautyFilters = new SparseArray<>();
        this.mMotionFilter = new C17158l() {
            public final boolean canBeSkipped(
/*
Method generation error in method: com.tencent.liteav.a.a.1.canBeSkipped():boolean, dex: classes10.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.liteav.a.a.1.canBeSkipped():boolean, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
        };
    }

    private float getSharpnessLevel() {
        float f = this.mUserSetSharpnessLevel;
        if (f != 0.0f) {
            return f;
        }
        if (!this.mIsPerformanceMode) {
            C104507p pVar = this.mOutputSize;
            if (Math.min(pVar.f309736a, pVar.f309737b) >= 540) {
                return 0.4f;
            }
        }
        return 0.0f;
    }

    public static /* synthetic */ void lambda$setBeautyLevel$1(BeautyProcessor beautyProcessor, float f) {
        beautyProcessor.updateBeautyInternal(beautyProcessor.mBeautyStyle, f, beautyProcessor.mWhitenessLevel, beautyProcessor.mRuddyLevel, beautyProcessor.mSharpnessLevel);
        if (f > 0.0f) {
            C17125a.m16950b(beautyProcessor.mReporter);
        }
        beautyProcessor.updateStatsInternal("beautyLevel", f);
    }

    public static /* synthetic */ void lambda$setPerformanceMode$6(BeautyProcessor beautyProcessor, boolean z) {
        beautyProcessor.mIsPerformanceMode = z;
        beautyProcessor.updateSharpenLevelInternal();
    }

    public static /* synthetic */ void lambda$setRuddyLevel$4(BeautyProcessor beautyProcessor, float f) {
        beautyProcessor.updateBeautyInternal(beautyProcessor.mBeautyStyle, beautyProcessor.mBeautyLevel, beautyProcessor.mWhitenessLevel, f, beautyProcessor.mSharpnessLevel);
        if (f > 0.0f) {
            C17125a.m16953e(beautyProcessor.mReporter);
        }
        beautyProcessor.updateStatsInternal("ruddyLevel", f);
    }

    public static /* synthetic */ void lambda$setSharpenLevel$3(BeautyProcessor beautyProcessor, float f) {
        beautyProcessor.mUserSetSharpnessLevel = C104506j.m139786a(f, 0.0f, 0.9f);
        LiteavLog.m16896d(TAG, "mUserSetSharpnessLevel: " + beautyProcessor.mUserSetSharpnessLevel);
        beautyProcessor.updateSharpenLevelInternal();
    }

    public static /* synthetic */ void lambda$setWhitenessLevel$2(BeautyProcessor beautyProcessor, float f) {
        beautyProcessor.updateBeautyInternal(beautyProcessor.mBeautyStyle, beautyProcessor.mBeautyLevel, f, beautyProcessor.mRuddyLevel, beautyProcessor.mSharpnessLevel);
        if (f > 0.0f) {
            C17125a.m16951c(beautyProcessor.mReporter);
        }
        beautyProcessor.updateStatsInternal("whiteLevel", f);
    }

    private void setScalableCosmeticTypeLevel(C17158l.C17159a aVar, int i) {
        LiteavLog.m16897d(TAG, "setScalableCosmeticTypeLevel %s %d", aVar, Integer.valueOf(i));
        if (!this.mIsEnterPriseProEnabled) {
            LiteavLog.m16901i(TAG, "need support EnterPrise above!!!");
        } else if (i > 0) {
            C17125a.m16949a(this.mReporter, aVar);
        }
    }

    /* access modifiers changed from: private */
    public void updateBeautyInternal(int i, float f, float f2, float f3, float f4) {
        C104507p pVar = this.mOutputSize;
        if (pVar.f309736a != -1 && pVar.f309737b != -1) {
            if (this.mBeautyStyle != i) {
                updateStatsOnDraw(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE, i);
            }
            C17189b bVar = this.mBeautyFilters.get(i);
            boolean z = true;
            if (bVar == null) {
                bVar = i != 0 ? i != 1 ? i != 2 ? new C17129a() : new C17131a() : new C17142a() : new C17136a();
                bVar.initialize(this.mTexturePool);
                C104507p pVar2 = this.mOutputSize;
                bVar.onOutputSizeChanged(pVar2.f309736a, pVar2.f309737b);
                this.mBeautyFilters.put(i, bVar);
            }
            C17135b bVar2 = (C17135b) bVar;
            bVar2.mo19408a(f);
            bVar2.mo19410c(f3);
            bVar2.mo19409b(f2);
            bVar2.mo19411d(f4);
            if (this.mBeautyStyle == i && this.mBeautyLevel == f && this.mWhitenessLevel == f2 && this.mRuddyLevel == f3 && this.mSharpnessLevel == f4) {
                z = false;
            }
            if (z) {
                this.mBeautyStyle = i;
                this.mBeautyLevel = f;
                this.mWhitenessLevel = f2;
                this.mRuddyLevel = f3;
                this.mSharpnessLevel = f4;
                removeAllFilterAndInterceptor();
                if (this.mBeautyLevel > 0.0f || this.mRuddyLevel > 0.0f || this.mWhitenessLevel > 0.0f || this.mSharpnessLevel > 0.0f) {
                    addFilter(bVar);
                }
                addFilter(this.mMotionFilter);
            }
        }
    }

    private void updateSharpenLevelInternal() {
        float sharpnessLevel = getSharpnessLevel();
        LiteavLog.m16896d(TAG, "sharpnessLevel: ".concat(String.valueOf(sharpnessLevel)));
        updateBeautyInternal(this.mBeautyStyle, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, sharpnessLevel);
        if (sharpnessLevel > 0.0f) {
            C17125a.m16952d(this.mReporter);
        }
    }

    /* access modifiers changed from: private */
    public void updateStatsInternal(String str, float f) {
        this.mBeautyStats.put(str, String.valueOf(f));
        if (this.mBeautyManagerStatusListener != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : this.mBeautyStats.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append((String) next.getValue());
                sb.append(" ");
            }
            this.mBeautyManagerStatusListener.onBeautyStatsChanged("{" + sb + "}");
        }
    }

    public void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.mMotionFilter.initialize(eVar);
        int i = this.mBeautyStyle;
        updateBeautyInternal(i == -1 ? 0 : i, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, this.mSharpnessLevel);
    }

    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        this.mMotionFilter.onOutputSizeChanged(i, i2);
        float sharpnessLevel = getSharpnessLevel();
        for (int i3 = 0; i3 < this.mBeautyFilters.size(); i3++) {
            C17189b valueAt = this.mBeautyFilters.valueAt(i3);
            valueAt.onOutputSizeChanged(i, i2);
            if (valueAt instanceof C17135b) {
                ((C17135b) valueAt).mo19411d(sharpnessLevel);
            }
        }
        int i4 = this.mBeautyStyle;
        updateBeautyInternal(i4 == -1 ? 0 : i4, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, sharpnessLevel);
    }

    public void onUninit() {
        super.onUninit();
        this.mMotionFilter.uninitialize();
        for (int i = 0; i < this.mBeautyFilters.size(); i++) {
            this.mBeautyFilters.valueAt(i).uninitialize();
        }
    }

    public void setAIDetectListener(C17200a aVar) {
    }

    public void setBeautyLevel(float f) {
        float a = C104506j.m139786a(f, 0.0f, 0.9f);
        LiteavLog.m16896d(TAG, "setBeautyLevel beautyLevel:".concat(String.valueOf(f)));
        runOnDraw(C17542b.m17728a(this, a));
    }

    public void setBeautyManagerStatusListener(C17533a aVar) {
        this.mBeautyManagerStatusListener = aVar;
    }

    public void setBeautyStyle(int i) {
        LiteavLog.m16896d(TAG, "setBeautyStyle beautyStyle:".concat(String.valueOf(i)));
        runOnDraw(C17534a.m17720a(this, i));
    }

    public void setChinLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.CHIN_SCALE, i);
        updateStatsOnDraw("chinLevel", i);
    }

    public void setEyeAngleLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.EYE_ANGLE, i);
        updateStatsOnDraw("eyeAngleLevel", i);
    }

    public void setEyeDistanceLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.EYE_DISTANCE, i);
        updateStatsOnDraw("eyeDistanceLevel", i);
    }

    public void setEyeLightenLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.EYE_LIGHTEN, i);
        updateStatsOnDraw("eyeLightenLevel", i);
    }

    public void setEyeScaleLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.EYE_SCALE, i);
        updateStatsOnDraw("eyeBigScale", i);
    }

    public void setFaceBeautyLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.BASIC3, i);
        updateStatsOnDraw("faceBeautyLevel", i);
    }

    public void setFaceNarrowLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.FACE_NARROW, i);
        updateStatsOnDraw("faceNarrowLevel", i);
    }

    public void setFaceShortLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.FACE_SHORT, i);
        updateStatsOnDraw("faceShortLevel", i);
    }

    public void setFaceSlimLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.FACE_SLIM, i);
        updateStatsOnDraw("faceSlimLevel", i);
    }

    public void setFaceVLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.FACE_V_SHAPE, i);
        updateStatsOnDraw("faceVLevel", i);
    }

    public void setForeheadLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.FOREHEAD, i);
        updateStatsOnDraw("foreheadLevel", i);
    }

    public void setHomeOrientation(int i) {
    }

    public void setLipsThicknessLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.LIPS_THICKNESS, i);
        updateStatsOnDraw("lipsThicknessLevel", i);
    }

    public void setMotionMute(boolean z) {
        LiteavLog.m16896d(TAG, "setMotionMute motionMute:".concat(String.valueOf(z)));
    }

    public void setMotionTmpl(String str) {
        LiteavLog.m16896d(TAG, "setMotionTmpl tmplPath:".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            C17125a.m16955g(this.mReporter);
        }
    }

    public void setMouthShapeLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.MOUTH_SHAPE, i);
        updateStatsOnDraw("mouthShapeLevel", i);
    }

    public void setNosePositionLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.NOSE_POSITION, i);
        updateStatsOnDraw("nosePositionLevel", i);
    }

    public void setNoseSlimLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.NOSE_SLIM, i);
        updateStatsOnDraw("noseSlimLevel", i);
    }

    public void setNoseWingLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.NOSE_WING, i);
        updateStatsOnDraw("noseWingLevel", i);
    }

    public void setPerformanceMode(boolean z) {
        LiteavLog.m16896d(TAG, "setPerformanceMode: ".concat(String.valueOf(z)));
        runOnDraw(C17547g.m17733a(this, z));
    }

    public void setPounchRemoveLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.REMOVE_POUNCH, i);
        updateStatsOnDraw("pounchRemoveLevel", i);
    }

    public void setRuddyLevel(float f) {
        float a = C104506j.m139786a(f, 0.0f, 0.9f);
        LiteavLog.m16896d(TAG, "setRuddyLevel ruddyLevel:".concat(String.valueOf(f)));
        runOnDraw(C17545e.m17731a(this, a));
    }

    public void setSharpenLevel(float f) {
        runOnDraw(C17544d.m17730a(this, f));
    }

    public void setSmileLinesRemoveLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.REMOVE_SMILE_LINES, i);
        updateStatsOnDraw("smileLinesRemoveLevel", i);
    }

    public void setToothWhitenLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.TOOTH_WHITEN, i);
        updateStatsOnDraw("toothWhitenLevel", i);
    }

    public void setWhitenessLevel(float f) {
        float a = C104506j.m139786a(f, 0.0f, 0.9f);
        LiteavLog.m16896d(TAG, "setWhitenessLevel whitenessLevel:".concat(String.valueOf(f)));
        runOnDraw(C17543c.m17729a(this, a));
    }

    public void setWrinkleRemoveLevel(int i) {
        setScalableCosmeticTypeLevel(C17158l.C17159a.REMOVE_WRINKLES, i);
        updateStatsOnDraw("wrinkleRemoveLevel", i);
    }

    public void updateStatsOnDraw(String str, int i) {
        runOnDraw(C17546f.m17732a(this, str, i));
    }
}
