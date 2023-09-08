package com.tencent.p014mm.timelineedit;

import android.content.res.AssetManager;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import kotlin.Metadata;
import li3.C109385a;
import li3.C109386b;
import li3.C109388f;
import mi3.C24989c;
import rr3.C110625c0;
import rr3.C110647w;
import rr3.C110650z;
import rx3.C13598b0;
import sp3.C110807k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001RJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH J#\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH J#\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H J\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H J\u0019\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH J!\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H J!\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH J\u0019\u0010'\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH J!\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H J!\u0010)\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH J\u0019\u0010*\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH J!\u0010+\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H J!\u0010,\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH J\u0019\u0010-\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH J!\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H J!\u0010/\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH J\u0019\u00100\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH J!\u00101\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H J!\u00102\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH J\u0019\u00103\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH J!\u00104\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H J!\u00105\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH J!\u00108\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u000bH J!\u00109\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H J\u0019\u0010:\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H J;\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0002H J\u001b\u0010@\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0006H J\u0013\u0010A\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H J\u0011\u0010B\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H J\u001b\u0010C\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H J\u001b\u0010D\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H J\u0019\u0010F\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0002H JS\u0010P\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00112\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u00020H2\u0006\u0010N\u001a\u00020H2\u0006\u0010O\u001a\u00020\u0002H J\u0011\u0010Q\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H ¨\u0006S"}, mo182094d2 = {"Lcom/tencent/mm/timelineedit/TimelineEditor;", "", "", "nPtr", "Lrx3/b0;", "nSetNativeLog", "", "canvasRectBytes", "validRectBytes", "editorConfig", "nCreate", "", "nSave", "replace", "nRestore", "", "path", "", "type", "nCreateTrack", "trackBytes", "nAddTrack", "nUpdateTrack", "nRemoveTrack", "nAddWrapDurationAudioTrack", "startMs", "endMs", "nUpdateCompositionDuration", "nGetNoTransitionComposition", "trackId", "nGetSingleFullRangeComposition", "nCreateTransitionEffectPath", "bytes", "length", "nCreateTransitionEffectBytes", "Landroid/content/res/AssetManager;", "asset", "assetPath", "nCreateTransitionEffectAsset", "nCreatePAGStickerEffectPath", "nCreatePAGStickerEffectBytes", "nCreatePAGStickerEffectAsset", "nCreateTextEffectPath", "nCreateTextEffectBytes", "nCreateTextEffectAsset", "nCreateVideoTemplateEffectPath", "nCreateVideoTemplateEffectBytes", "nCreateVideoTemplateEffectAsset", "nCreateGlobalAnimationEffectPath", "nCreateGlobalAnimationEffectBytes", "nCreateGlobalAnimationEffectAsset", "nCreateDecodeStickerEffectPath", "nCreateDecodeStickerEffectBytes", "nCreateDecodeStickerEffectAsset", "effectPtr", "bindTrack", "nAddEffectToTimeline", "nAddEffectToTimelineBindToTrack", "nRemoveEffect", "beforeTrack", "afterTrack", "transitionEffect", "durationMs", "nSetTransition", "nRemoveTransition", "nClearTransition", "nGetEffectManager", "nUpdateValidRect", "nUpdateConfig", "displayTime", "nUpdateDisplayTime", "actionA", "", "pointAX", "pointAY", "keyA", "actionB", "pointBX", "pointBY", "keyB", "nTouchMotionEvent", "nDestroy", "Companion", "timelinelib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.timelineedit.TimelineEditor */
public final class TimelineEditor {

    /* renamed from: e */
    public static volatile boolean f318618e;

    /* renamed from: f */
    public static final Companion f318619f = new Companion((C8480h) null);

    /* renamed from: a */
    public long f318620a = -1;

    /* renamed from: b */
    public long f318621b = -1;

    /* renamed from: c */
    public EffectManager f318622c;

    /* renamed from: d */
    public HashMap<Long, C110625c0> f318623d = new HashMap<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/timelineedit/TimelineEditor$Companion;", "", "Lrx3/b0;", "checkInitJNI", "", "TAG", "Ljava/lang/String;", "", "jniInit", "Z", "timelinelib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
    /* renamed from: com.tencent.mm.timelineedit.TimelineEditor$Companion */
    public static final class Companion {
        public Companion(C8480h hVar) {
        }

        /* access modifiers changed from: private */
        public final void checkInitJNI() {
            if (!TimelineEditor.f318618e) {
                new EffectManager();
                TimelineEditor.f318618e = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.timelineedit.TimelineEditor$a */
    public static final class C106624a extends C87413o implements C32224a<byte[]> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditor f318624d;

        /* renamed from: e */
        public final /* synthetic */ C109388f f318625e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106624a(TimelineEditor timelineEditor, C109388f fVar) {
            super(0);
            this.f318624d = timelineEditor;
            this.f318625e = fVar;
        }

        public Object invoke() {
            TimelineEditor timelineEditor = this.f318624d;
            return timelineEditor.nAddTrack(timelineEditor.f318620a, this.f318625e.mo160584b());
        }
    }

    /* renamed from: com.tencent.mm.timelineedit.TimelineEditor$b */
    public static final class C106625b extends C87413o implements C32226l<byte[], C110807k> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditor f318626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106625b(TimelineEditor timelineEditor) {
            super(1);
            this.f318626d = timelineEditor;
        }

        public Object invoke(Object obj) {
            byte[] bArr = (byte[]) obj;
            C87412m.m108595h(bArr, LocaleUtil.ITALIAN);
            C24989c e = C24989c.m31616e(bArr);
            C87412m.m108590c(e, "compositionInfo");
            return C109385a.m148549d(e, this.f318626d);
        }
    }

    /* renamed from: com.tencent.mm.timelineedit.TimelineEditor$c */
    public static final class C106626c extends C87413o implements C32224a<byte[]> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditor f318627d;

        /* renamed from: e */
        public final /* synthetic */ String f318628e;

        /* renamed from: f */
        public final /* synthetic */ int f318629f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106626c(TimelineEditor timelineEditor, String str, int i) {
            super(0);
            this.f318627d = timelineEditor;
            this.f318628e = str;
            this.f318629f = i;
        }

        public Object invoke() {
            TimelineEditor timelineEditor = this.f318627d;
            return timelineEditor.nCreateTrack(timelineEditor.f318620a, this.f318628e, this.f318629f);
        }
    }

    /* renamed from: com.tencent.mm.timelineedit.TimelineEditor$d */
    public static final class C106627d extends C87413o implements C32226l<byte[], C109388f> {

        /* renamed from: d */
        public static final C106627d f318630d = new C106627d();

        public C106627d() {
            super(1);
        }

        public Object invoke(Object obj) {
            byte[] bArr = (byte[]) obj;
            C87412m.m108595h(bArr, LocaleUtil.ITALIAN);
            C109388f fVar = new C109388f();
            fVar.mo160586d(bArr);
            return fVar;
        }
    }

    /* renamed from: com.tencent.mm.timelineedit.TimelineEditor$e */
    public static final class C106628e extends C87413o implements C32224a<byte[]> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditor f318631d;

        /* renamed from: e */
        public final /* synthetic */ C109388f f318632e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106628e(TimelineEditor timelineEditor, C109388f fVar) {
            super(0);
            this.f318631d = timelineEditor;
            this.f318632e = fVar;
        }

        public Object invoke() {
            TimelineEditor timelineEditor = this.f318631d;
            return timelineEditor.nUpdateTrack(timelineEditor.f318620a, this.f318632e.mo160584b());
        }
    }

    /* renamed from: com.tencent.mm.timelineedit.TimelineEditor$f */
    public static final class C106629f extends C87413o implements C32226l<byte[], C110807k> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditor f318633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106629f(TimelineEditor timelineEditor) {
            super(1);
            this.f318633d = timelineEditor;
        }

        public Object invoke(Object obj) {
            byte[] bArr = (byte[]) obj;
            C87412m.m108595h(bArr, LocaleUtil.ITALIAN);
            C24989c e = C24989c.m31616e(bArr);
            C87412m.m108590c(e, "compositionInfo");
            return C109385a.m148549d(e, this.f318633d);
        }
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("WeEffect");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c("xlabeffect");
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar2.mo10231a(0));
        C117292a.m165359e(obj2, "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c("timeline-editor");
        Object obj3 = new Object();
        C117292a.m165358d(obj3, aVar3.mo10232b(), "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar3.mo10231a(0));
        C117292a.m165359e(obj3, "com/tencent/mm/timelineedit/TimelineEditor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private final native long nAddEffectToTimeline(long j, long j2, boolean z);

    private final native long nAddEffectToTimelineBindToTrack(long j, long j2, long j3);

    /* access modifiers changed from: private */
    public final native byte[] nAddTrack(long j, byte[] bArr);

    /* access modifiers changed from: private */
    public final native byte[] nAddWrapDurationAudioTrack(long j, String str);

    private final native byte[] nClearTransition(long j);

    private final native long nCreate(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private final native long nCreateDecodeStickerEffectAsset(long j, AssetManager assetManager, String str);

    private final native long nCreateDecodeStickerEffectBytes(long j, byte[] bArr, long j2);

    private final native long nCreateDecodeStickerEffectPath(long j, String str);

    private final native long nCreateGlobalAnimationEffectAsset(long j, AssetManager assetManager, String str);

    private final native long nCreateGlobalAnimationEffectBytes(long j, byte[] bArr, long j2);

    private final native long nCreateGlobalAnimationEffectPath(long j, String str);

    private final native long nCreatePAGStickerEffectAsset(long j, AssetManager assetManager, String str);

    private final native long nCreatePAGStickerEffectBytes(long j, byte[] bArr, long j2);

    private final native long nCreatePAGStickerEffectPath(long j, String str);

    private final native long nCreateTextEffectAsset(long j, AssetManager assetManager, String str);

    private final native long nCreateTextEffectBytes(long j, byte[] bArr, long j2);

    private final native long nCreateTextEffectPath(long j, String str);

    /* access modifiers changed from: private */
    public final native byte[] nCreateTrack(long j, String str, int i);

    private final native long nCreateTransitionEffectAsset(long j, AssetManager assetManager, String str);

    private final native long nCreateTransitionEffectBytes(long j, byte[] bArr, long j2);

    private final native long nCreateTransitionEffectPath(long j, String str);

    private final native long nCreateVideoTemplateEffectAsset(long j, AssetManager assetManager, String str);

    private final native long nCreateVideoTemplateEffectBytes(long j, byte[] bArr, long j2);

    private final native long nCreateVideoTemplateEffectPath(long j, String str);

    private final native boolean nDestroy(long j);

    private final native long nGetEffectManager(long j);

    /* access modifiers changed from: private */
    public final native byte[] nGetNoTransitionComposition(long j);

    /* access modifiers changed from: private */
    public final native byte[] nGetSingleFullRangeComposition(long j, long j2);

    private final native boolean nRemoveEffect(long j, long j2);

    /* access modifiers changed from: private */
    public final native byte[] nRemoveTrack(long j, byte[] bArr);

    /* access modifiers changed from: private */
    public final native byte[] nRemoveTransition(long j, byte[] bArr);

    /* access modifiers changed from: private */
    public final native byte[] nRestore(long j, boolean z);

    private final native boolean nSave(long j);

    private final native void nSetNativeLog(long j);

    /* access modifiers changed from: private */
    public final native byte[] nSetTransition(long j, String str, byte[] bArr, byte[] bArr2, long j2, long j3);

    private final native byte[] nTouchMotionEvent(long j, int i, float f, float f2, long j2, int i2, float f3, float f4, long j3);

    private final native byte[] nUpdateCompositionDuration(long j, long j2, long j3);

    /* access modifiers changed from: private */
    public final native byte[] nUpdateConfig(long j, byte[] bArr);

    private final native void nUpdateDisplayTime(long j, long j2);

    /* access modifiers changed from: private */
    public final native byte[] nUpdateTrack(long j, byte[] bArr);

    private final native byte[] nUpdateValidRect(long j, byte[] bArr);

    /* renamed from: l */
    public final void mo153341l(C110625c0 c0Var, boolean z) {
        C87412m.m108595h(c0Var, "effect");
        long nAddEffectToTimeline = nAddEffectToTimeline(this.f318620a, c0Var.f330969c, z);
        if (nAddEffectToTimeline > 0) {
            synchronized (this.f318623d) {
                this.f318623d.put(Long.valueOf(nAddEffectToTimeline), c0Var);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: m */
    public final void mo153342m(C110625c0 c0Var, long j) {
        C87412m.m108595h(c0Var, "effect");
        long nAddEffectToTimelineBindToTrack = nAddEffectToTimelineBindToTrack(this.f318620a, c0Var.f330969c, j);
        if (nAddEffectToTimelineBindToTrack > 0) {
            synchronized (this.f318623d) {
                this.f318623d.put(Long.valueOf(nAddEffectToTimelineBindToTrack), c0Var);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: n */
    public final C110807k mo153343n(C109388f fVar) {
        C87412m.m108595h(fVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        return (C110807k) mo153351v(new C106624a(this, fVar), new C106625b(this));
    }

    /* renamed from: o */
    public final boolean mo153344o(Rect rect, Rect rect2, C109386b bVar) {
        C87412m.m108595h(rect, "canvasRect");
        C87412m.m108595h(rect2, "validRect");
        C87412m.m108595h(bVar, "config");
        f318619f.checkInitJNI();
        byte[] byteArray = C109385a.m148546a(rect).toByteArray();
        C87412m.m108590c(byteArray, "canvasRect.toProto().toByteArray()");
        byte[] byteArray2 = C109385a.m148546a(rect2).toByteArray();
        C87412m.m108590c(byteArray2, "validRect.toProto().toByteArray()");
        long nCreate = nCreate(byteArray, byteArray2, bVar.mo160584b());
        this.f318620a = nCreate;
        return nCreate >= 0;
    }

    /* renamed from: p */
    public final C110650z mo153345p(String str) {
        C87412m.m108595h(str, "path");
        Long valueOf = Long.valueOf(nCreateDecodeStickerEffectPath(this.f318620a, str));
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return new C110650z(valueOf.longValue());
        }
        return null;
    }

    /* renamed from: q */
    public final C109388f mo153346q(String str, int i) {
        C87412m.m108595h(str, "path");
        return (C109388f) mo153351v(new C106626c(this, str, i), C106627d.f318630d);
    }

    /* renamed from: r */
    public final C110647w mo153347r(String str) {
        C87412m.m108595h(str, "path");
        Long valueOf = Long.valueOf(nCreateTransitionEffectPath(this.f318620a, str));
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return new C110647w(valueOf.longValue());
        }
        return null;
    }

    /* renamed from: s */
    public final boolean mo153348s() {
        return nDestroy(this.f318620a);
    }

    /* renamed from: t */
    public final EffectManager mo153349t() {
        if (this.f318621b == -1) {
            long nGetEffectManager = nGetEffectManager(this.f318620a);
            this.f318621b = nGetEffectManager;
            EffectManager.f319988d.getClass();
            this.f318622c = new EffectManager(nGetEffectManager, (C8480h) null);
        }
        return this.f318622c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r5 != 6) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r1 = r13.f318623d.get(java.lang.Long.valueOf(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<rr3.C110638n, li3.C109388f> mo153350u(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r13 = r18
            r0 = r19
            java.lang.String r1 = "touchEvent"
            gy3.C87412m.m108595h(r0, r1)
            int r1 = r19.getPointerCount()
            r14 = 0
            if (r1 > 0) goto L_0x0011
            return r14
        L_0x0011:
            r2 = 0
            int r3 = r0.getPointerId(r2)
            r4 = -1
            int r5 = r19.getActionMasked()
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 1
            r11 = 2
            if (r5 == 0) goto L_0x0035
            if (r5 == r10) goto L_0x0033
            if (r5 == r11) goto L_0x0031
            if (r5 == r9) goto L_0x002f
            if (r5 == r7) goto L_0x0035
            if (r5 == r6) goto L_0x0033
            r12 = 0
            goto L_0x0036
        L_0x002f:
            r12 = 4
            goto L_0x0036
        L_0x0031:
            r12 = 2
            goto L_0x0036
        L_0x0033:
            r12 = 3
            goto L_0x0036
        L_0x0035:
            r12 = 1
        L_0x0036:
            float r15 = r0.getX(r2)
            float r16 = r0.getY(r2)
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 < r11) goto L_0x0067
            if (r5 == 0) goto L_0x0055
            if (r5 == r10) goto L_0x0053
            if (r5 == r11) goto L_0x0051
            if (r5 == r9) goto L_0x004f
            if (r5 == r7) goto L_0x0055
            if (r5 == r6) goto L_0x0053
            goto L_0x0056
        L_0x004f:
            r2 = 4
            goto L_0x0056
        L_0x0051:
            r2 = 2
            goto L_0x0056
        L_0x0053:
            r2 = 3
            goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            float r1 = r0.getX(r10)
            float r4 = r0.getY(r10)
            int r0 = r0.getPointerId(r10)
            r9 = r1
            r8 = r2
            r10 = r4
            r4 = r0
            goto L_0x006c
        L_0x0067:
            r8 = 0
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x006c:
            long r1 = r13.f318620a
            long r6 = (long) r3
            long r4 = (long) r4
            r0 = r18
            r3 = r12
            r11 = r4
            r4 = r15
            r5 = r16
            byte[] r0 = r0.nTouchMotionEvent(r1, r3, r4, r5, r6, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x00c7
            com.google.protobuf.w1<mi3.n> r1 = mi3.C25010n.f71259h
            java.lang.Object r0 = r1.parseFrom((byte[]) r0)
            mi3.n r0 = (mi3.C25010n) r0
            java.lang.String r1 = "touchResult"
            gy3.C87412m.m108590c(r0, r1)
            long r1 = r0.f71260d
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a7
            java.util.HashMap<java.lang.Long, rr3.c0> r3 = r13.f318623d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            rr3.c0 r1 = (rr3.C110625c0) r1
            if (r1 == 0) goto L_0x00a7
            boolean r2 = r1 instanceof rr3.C110638n
            if (r2 == 0) goto L_0x00a7
            rr3.n r1 = (rr3.C110638n) r1
            goto L_0x00a8
        L_0x00a7:
            r1 = r14
        L_0x00a8:
            boolean r2 = r0.mo52089b()
            if (r2 == 0) goto L_0x00c4
            li3.f r2 = new li3.f
            r2.<init>()
            mi3.p r0 = r0.mo52088a()
            byte[] r0 = r0.toByteArray()
            java.lang.String r3 = "touchResult.touchTrack.toByteArray()"
            gy3.C87412m.m108590c(r0, r3)
            r2.mo160586d(r0)
            r14 = r2
        L_0x00c4:
            r0 = r14
            r14 = r1
            goto L_0x00c8
        L_0x00c7:
            r0 = r14
        L_0x00c8:
            rx3.l r1 = new rx3.l
            r1.<init>(r14, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.timelineedit.TimelineEditor.mo153350u(android.view.MotionEvent):rx3.l");
    }

    /* renamed from: v */
    public final <T, R> R mo153351v(C32224a<? extends T> aVar, C32226l<? super T, ? extends R> lVar) {
        Object invoke = aVar.invoke();
        if (invoke == null) {
            return null;
        }
        try {
            return lVar.invoke(invoke);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: w */
    public final boolean mo153352w() {
        return nSave(this.f318620a);
    }

    /* renamed from: x */
    public final C110807k mo153353x(C109388f fVar) {
        C87412m.m108595h(fVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        return (C110807k) mo153351v(new C106628e(this, fVar), new C106629f(this));
    }
}
