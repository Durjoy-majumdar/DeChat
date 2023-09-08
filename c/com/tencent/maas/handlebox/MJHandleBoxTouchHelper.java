package com.tencent.maas.handlebox;

import android.content.Context;
import android.view.MotionEvent;
import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.detector.MJHandleBoxGestureDetector;
import com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle;
import com.tencent.maas.handlebox.model.MJHandleBoxItem;
import com.tencent.maas.handlebox.model.MJHandleBoxSettings;
import com.tencent.maas.handlebox.protocol.MJHandlerBoxListener;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.model.MJColor;
import com.tencent.maas.model.MJEdgeInsets;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007*\u0001U\u0018\u0000 Z2\u00020\u0001:\u0001ZB3\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\bX\u0010YJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ*\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0014J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0014J\u000e\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u00120;j\b\u0012\u0004\u0012\u00020\u0012`<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010,R\u0016\u0010B\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\"\u0010I\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010GR\u001b\u0010T\u001a\u00020O8BX\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, mo182094d2 = {"Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelper;", "", "Lcom/tencent/maas/handlebox/model/MJHandleBoxItem$MJRectCorner;", "corner", "Lrx3/b0;", "onCornerClick", "", "actionName", "commitAction", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "Lcom/tencent/maas/base/Vec2;", "viewSize", "updateViewSize", "segmentID", "", "Lcom/tencent/maas/handlebox/model/MJHandleBoxItem;", "handleBoxItems", "Lcom/tencent/maas/model/MJEdgeInsets;", "handleBoxEdgeInsets", "showHandleBoxForSegment", "clearHandleBox", "removeSegment", "Lcom/tencent/maas/base/Rect2;", "rect", "edgeInsets", "calculateEdgeInsets", "invertEdgeInsets", "", "dpValue", "", "dip2px", "Lcom/tencent/maas/instamovie/MJMovieSession;", "movieSession", "Lcom/tencent/maas/instamovie/MJMovieSession;", "getMovieSession", "()Lcom/tencent/maas/instamovie/MJMovieSession;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/tencent/maas/base/Vec2;", "getViewSize", "()Lcom/tencent/maas/base/Vec2;", "Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;", "handleBoxListener", "Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;", "Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelperListener;", "handleBoxTouchHelperListener", "Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelperListener;", "curSegmentID", "Ljava/lang/String;", "getCurSegmentID", "()Ljava/lang/String;", "setCurSegmentID", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "curHandleBoxItems", "Ljava/util/ArrayList;", "curRect", "Lcom/tencent/maas/base/Rect2;", "curScale", "curRotation", "F", "curEdgeInsets", "Lcom/tencent/maas/model/MJEdgeInsets;", "isGestureDetecting", "Z", "isTextEditable", "enable", "getEnable", "()Z", "setEnable", "(Z)V", "isMoving", "Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector;", "handleTouchDetector$delegate", "Lrx3/g;", "getHandleTouchDetector", "()Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector;", "handleTouchDetector", "com/tencent/maas/handlebox/MJHandleBoxTouchHelper$handleTouchDetectorListener$1", "handleTouchDetectorListener", "Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelper$handleTouchDetectorListener$1;", "<init>", "(Lcom/tencent/maas/instamovie/MJMovieSession;Landroid/content/Context;Lcom/tencent/maas/base/Vec2;Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelperListener;)V", "Companion", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class MJHandleBoxTouchHelper {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MJHandleBoxTouchHelper";
    private final Context context;
    /* access modifiers changed from: private */
    public MJEdgeInsets curEdgeInsets;
    private ArrayList<MJHandleBoxItem> curHandleBoxItems;
    /* access modifiers changed from: private */
    public Rect2 curRect;
    private float curRotation;
    private Vec2 curScale;
    private String curSegmentID;
    private boolean enable;
    /* access modifiers changed from: private */
    public final MJHandlerBoxListener handleBoxListener;
    /* access modifiers changed from: private */
    public MJHandleBoxTouchHelperListener handleBoxTouchHelperListener;
    private final C13601g handleTouchDetector$delegate;
    /* access modifiers changed from: private */
    public final MJHandleBoxTouchHelper$handleTouchDetectorListener$1 handleTouchDetectorListener;
    /* access modifiers changed from: private */
    public boolean isGestureDetecting;
    /* access modifiers changed from: private */
    public volatile boolean isMoving;
    private boolean isTextEditable;
    private final MJMovieSession movieSession;
    private final Vec2 viewSize;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelper$Companion;", "", "()V", "TAG", "", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    @Metadata(mo182095k = 3, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MJHandleBoxItem.MJRectCorner.values().length];
            iArr[MJHandleBoxItem.MJRectCorner.MJRectCornerTopLeft.ordinal()] = 1;
            iArr[MJHandleBoxItem.MJRectCorner.MJRectCornerTopRight.ordinal()] = 2;
            iArr[MJHandleBoxItem.MJRectCorner.MJRectCornerBottomLeft.ordinal()] = 3;
            iArr[MJHandleBoxItem.MJRectCorner.MJRectCornerBottomRight.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MJHandleBoxItem.MJHandleBoxActionType.values().length];
            iArr2[MJHandleBoxItem.MJHandleBoxActionType.MJHandleBoxActionTypeDelete.ordinal()] = 1;
            iArr2[MJHandleBoxItem.MJHandleBoxActionType.MJHandleBoxActionTypeFlip.ordinal()] = 2;
            iArr2[MJHandleBoxItem.MJHandleBoxActionType.MJHandleBoxActionTypeTransform.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MJHandleBoxTouchHelper(MJMovieSession mJMovieSession, Context context2, Vec2 vec2, MJHandlerBoxListener mJHandlerBoxListener, MJHandleBoxTouchHelperListener mJHandleBoxTouchHelperListener) {
        C87412m.m108594g(mJMovieSession, "movieSession");
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(vec2, "viewSize");
        C87412m.m108594g(mJHandlerBoxListener, "handleBoxListener");
        this.movieSession = mJMovieSession;
        this.context = context2;
        this.viewSize = vec2;
        this.handleBoxListener = mJHandlerBoxListener;
        this.handleBoxTouchHelperListener = mJHandleBoxTouchHelperListener;
        this.curHandleBoxItems = new ArrayList<>();
        mJMovieSession.setOnDidTapSegmentCallback(new MJHandleBoxTouchHelper$$a(this));
        mJMovieSession.setOnWillShowHandleBoxCallback(new MJHandleBoxTouchHelper$$b(this));
        mJMovieSession.setOnHandleBoxSettingsChangeCallback(new MJHandleBoxTouchHelper$$c(this), vec2);
        mJMovieSession.setOnDidRemoveSegmentCallback(new MJHandleBoxTouchHelper$$d(this));
        this.handleTouchDetector$delegate = C36568h.m40985a(new MJHandleBoxTouchHelper$handleTouchDetector$2(this));
        this.handleTouchDetectorListener = new MJHandleBoxTouchHelper$handleTouchDetectorListener$1(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-2  reason: not valid java name */
    public static final void m168477_init_$lambda2(MJHandleBoxTouchHelper mJHandleBoxTouchHelper, String str, long j) {
        C13598b0 b0Var;
        C87412m.m108594g(mJHandleBoxTouchHelper, "this$0");
        MJHandleBoxUtilsKt.log(TAG, "OnDidTapSegment segmentID: " + str + ", editOptions: " + j);
        if (str == null) {
            b0Var = null;
        } else {
            mJHandleBoxTouchHelper.setCurSegmentID(str);
            boolean z = (j & 8) != 0;
            mJHandleBoxTouchHelper.isTextEditable = z;
            mJHandleBoxTouchHelper.handleBoxListener.onTapSegment(str, z);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            mJHandleBoxTouchHelper.getMovieSession().removeHandleBox();
            mJHandleBoxTouchHelper.setCurSegmentID((String) null);
            mJHandleBoxTouchHelper.handleBoxListener.onTapBackground();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-4  reason: not valid java name */
    public static final void m168478_init_$lambda4(MJHandleBoxTouchHelper mJHandleBoxTouchHelper, String str, Vec2 vec2, Vec2 vec22, float f) {
        C87412m.m108594g(mJHandleBoxTouchHelper, "this$0");
        MJHandleBoxUtilsKt.log(TAG, "OnWillShowHandleBox segmentID: " + str + ", position: " + vec2 + ", scale: " + vec22 + ", rotation: " + f);
        Rect2 rect2 = mJHandleBoxTouchHelper.curRect;
        if (rect2 != null) {
            mJHandleBoxTouchHelper.curScale = vec22;
            MJHandleBoxGestureDetector handleTouchDetector = mJHandleBoxTouchHelper.getHandleTouchDetector();
            MJEdgeInsets mJEdgeInsets = mJHandleBoxTouchHelper.curEdgeInsets;
            C87412m.m108593f(vec22, "scale");
            handleTouchDetector.setup(rect2, mJEdgeInsets, vec22, f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-8  reason: not valid java name */
    public static final void m168479_init_$lambda8(MJHandleBoxTouchHelper mJHandleBoxTouchHelper, MJHandleBoxSettings mJHandleBoxSettings) {
        MJHandleBoxTouchHelperListener mJHandleBoxTouchHelperListener;
        Rect2 calculateEdgeInsets;
        C87412m.m108594g(mJHandleBoxTouchHelper, "this$0");
        MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("handleBoxSettingsChanged handleBoxSettings: ", mJHandleBoxSettings));
        if (mJHandleBoxSettings != null) {
            Vec2 vec2 = new Vec2(mJHandleBoxSettings.getPosition().f309908x, mJHandleBoxTouchHelper.getViewSize().f309909y - mJHandleBoxSettings.getPosition().f309909y);
            float f = (float) 2;
            Rect2 rect2 = new Rect2(new Vec2(vec2.f309908x - (mJHandleBoxSettings.getContentSize().f309908x / f), vec2.f309909y - (mJHandleBoxSettings.getContentSize().f309909y / f)), mJHandleBoxSettings.getContentSize());
            MJHandleBoxUtilsKt.log(TAG, "origin:" + vec2 + ", viewSize: " + mJHandleBoxTouchHelper.getViewSize() + ", contentSize: " + mJHandleBoxSettings.getContentSize() + ", segmentRect.origin:" + rect2.getOrigin() + ", segmentRect.size: " + rect2.getSize() + ", handleBoxSettings: " + mJHandleBoxSettings);
            MJEdgeInsets mJEdgeInsets = mJHandleBoxTouchHelper.curEdgeInsets;
            if (!(mJEdgeInsets == null || (calculateEdgeInsets = mJHandleBoxTouchHelper.calculateEdgeInsets(rect2, mJEdgeInsets)) == null)) {
                rect2 = calculateEdgeInsets;
            }
            mJHandleBoxTouchHelper.curRect = rect2;
            mJHandleBoxTouchHelper.curScale = mJHandleBoxSettings.getScale();
            mJHandleBoxTouchHelper.curRotation = mJHandleBoxSettings.getRotation();
            if (!mJHandleBoxTouchHelper.isGestureDetecting) {
                Rect2 rect22 = mJHandleBoxTouchHelper.curRect;
                String curSegmentID2 = mJHandleBoxTouchHelper.getCurSegmentID();
                if (rect22 != null && curSegmentID2 != null && (mJHandleBoxTouchHelperListener = mJHandleBoxTouchHelper.handleBoxTouchHelperListener) != null) {
                    Vec2 scale = mJHandleBoxSettings.getScale();
                    C87412m.m108593f(scale, "scale");
                    mJHandleBoxTouchHelperListener.onCurRectChanged(rect22, scale, mJHandleBoxSettings.getRotation());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-9  reason: not valid java name */
    public static final void m168480_init_$lambda9(MJHandleBoxTouchHelper mJHandleBoxTouchHelper, String str) {
        C87412m.m108594g(mJHandleBoxTouchHelper, "this$0");
        MJHandlerBoxListener mJHandlerBoxListener = mJHandleBoxTouchHelper.handleBoxListener;
        C87412m.m108593f(str, LocaleUtil.ITALIAN);
        mJHandlerBoxListener.onRemoveSegment(str);
    }

    /* access modifiers changed from: private */
    public final void commitAction(String str) {
        MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("commitAction: ", str));
    }

    private final MJHandleBoxGestureDetector getHandleTouchDetector() {
        return (MJHandleBoxGestureDetector) this.handleTouchDetector$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void onCornerClick(MJHandleBoxItem.MJRectCorner mJRectCorner) {
        T t;
        boolean z;
        MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("corner: ", mJRectCorner));
        String str = this.curSegmentID;
        if (str != null) {
            Iterator<T> it = this.curHandleBoxItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((MJHandleBoxItem) t).getRectCorner() == mJRectCorner.getValue()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            MJHandleBoxItem mJHandleBoxItem = (MJHandleBoxItem) t;
            if (mJHandleBoxItem != null) {
                MJHandleBoxItem.MJHandleBoxActionType fromInt = MJHandleBoxItem.MJHandleBoxActionType.fromInt(mJHandleBoxItem.getActionType());
                int i = fromInt == null ? -1 : WhenMappings.$EnumSwitchMapping$1[fromInt.ordinal()];
                if (i == 1) {
                    getMovieSession().removeSegmentByHandleBox();
                    commitAction("removeSegment");
                    this.handleBoxListener.didDeleteSegment(str);
                } else if (i == 2) {
                    getMovieSession().onUpdateSegmentFlip();
                    commitAction("setContentFlipForSegment");
                    this.handleBoxListener.didFlipSegmentHorizontally(str);
                }
            }
        }
    }

    public static /* synthetic */ void showHandleBoxForSegment$default(MJHandleBoxTouchHelper mJHandleBoxTouchHelper, String str, List list, MJEdgeInsets mJEdgeInsets, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            mJEdgeInsets = new MJEdgeInsets(0, 0, 0, 0);
        }
        mJHandleBoxTouchHelper.showHandleBoxForSegment(str, list, mJEdgeInsets);
    }

    public final Rect2 calculateEdgeInsets(Rect2 rect2, MJEdgeInsets mJEdgeInsets) {
        C87412m.m108594g(rect2, "rect");
        C87412m.m108594g(mJEdgeInsets, "edgeInsets");
        MJEdgeInsets mJEdgeInsets2 = new MJEdgeInsets(dip2px((float) mJEdgeInsets.getLeft()), dip2px((float) mJEdgeInsets.getTop()), dip2px((float) mJEdgeInsets.getRight()), dip2px((float) mJEdgeInsets.getBottom()));
        return new Rect2(new Vec2(rect2.getOrigin().f309908x - ((float) mJEdgeInsets2.getLeft()), rect2.getOrigin().f309909y - ((float) mJEdgeInsets2.getTop())), new Vec2(rect2.getSize().f309908x + ((float) mJEdgeInsets2.getLeft()) + ((float) mJEdgeInsets2.getRight()), rect2.getSize().f309909y + ((float) mJEdgeInsets2.getTop()) + ((float) mJEdgeInsets2.getBottom())));
    }

    public final void clearHandleBox() {
        this.curHandleBoxItems.clear();
        this.movieSession.removeHandleBox();
    }

    public final int dip2px(float f) {
        return (int) ((f * this.context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return getHandleTouchDetector().dispatchTouchEvent(motionEvent);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCurSegmentID() {
        return this.curSegmentID;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final MJMovieSession getMovieSession() {
        return this.movieSession;
    }

    public final Vec2 getViewSize() {
        return this.viewSize;
    }

    public final Rect2 invertEdgeInsets(Rect2 rect2, MJEdgeInsets mJEdgeInsets) {
        C87412m.m108594g(rect2, "rect");
        C87412m.m108594g(mJEdgeInsets, "edgeInsets");
        MJEdgeInsets mJEdgeInsets2 = new MJEdgeInsets(dip2px((float) mJEdgeInsets.getLeft()), dip2px((float) mJEdgeInsets.getTop()), dip2px((float) mJEdgeInsets.getRight()), dip2px((float) mJEdgeInsets.getBottom()));
        return new Rect2(new Vec2(rect2.getOrigin().f309908x + ((float) mJEdgeInsets2.getLeft()), rect2.getOrigin().f309909y + ((float) mJEdgeInsets2.getTop())), new Vec2((rect2.getSize().f309908x - ((float) mJEdgeInsets2.getLeft())) - ((float) mJEdgeInsets2.getRight()), (rect2.getSize().f309909y - ((float) mJEdgeInsets2.getTop())) - ((float) mJEdgeInsets2.getBottom())));
    }

    public final void removeSegment() {
        if (this.curSegmentID != null) {
            getMovieSession().removeSegmentByHandleBox();
        }
        this.curSegmentID = null;
    }

    public final void setCurSegmentID(String str) {
        this.curSegmentID = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void showHandleBoxForSegment(String str, List<? extends MJHandleBoxItem> list, MJEdgeInsets mJEdgeInsets) {
        C87412m.m108594g(str, "segmentID");
        C87412m.m108594g(mJEdgeInsets, "handleBoxEdgeInsets");
        if (C87412m.m108589b(str, this.curSegmentID)) {
            this.curHandleBoxItems.clear();
            if (list != null) {
                for (MJHandleBoxItem mJHandleBoxItem : list) {
                    this.curHandleBoxItems.add(mJHandleBoxItem);
                    MJHandleBoxItem.MJRectCorner fromInt = MJHandleBoxItem.MJRectCorner.fromInt(mJHandleBoxItem.getRectCorner());
                    int i = -1;
                    int i2 = fromInt == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromInt.ordinal()];
                    if (i2 == 1) {
                        MJHandleBoxItem.MJHandleBoxActionType fromInt2 = MJHandleBoxItem.MJHandleBoxActionType.fromInt(mJHandleBoxItem.getActionType());
                        if (fromInt2 != null) {
                            i = WhenMappings.$EnumSwitchMapping$1[fromInt2.ordinal()];
                        }
                        if (i == 1 || i == 2) {
                            getHandleTouchDetector().setEnableLTClick(true);
                        } else if (i == 3) {
                            getHandleTouchDetector().setEnableLTGesture(true);
                        }
                    } else if (i2 == 2) {
                        MJHandleBoxItem.MJHandleBoxActionType fromInt3 = MJHandleBoxItem.MJHandleBoxActionType.fromInt(mJHandleBoxItem.getActionType());
                        if (fromInt3 != null) {
                            i = WhenMappings.$EnumSwitchMapping$1[fromInt3.ordinal()];
                        }
                        if (i == 1 || i == 2) {
                            getHandleTouchDetector().setEnableRTClick(true);
                        } else if (i == 3) {
                            getHandleTouchDetector().setEnableRTGesture(true);
                        }
                    } else if (i2 == 3) {
                        MJHandleBoxItem.MJHandleBoxActionType fromInt4 = MJHandleBoxItem.MJHandleBoxActionType.fromInt(mJHandleBoxItem.getActionType());
                        if (fromInt4 != null) {
                            i = WhenMappings.$EnumSwitchMapping$1[fromInt4.ordinal()];
                        }
                        if (i == 1 || i == 2) {
                            getHandleTouchDetector().setEnableLBClick(true);
                        } else if (i == 3) {
                            getHandleTouchDetector().setEnableLBGesture(true);
                        }
                    } else if (i2 == 4) {
                        MJHandleBoxItem.MJHandleBoxActionType fromInt5 = MJHandleBoxItem.MJHandleBoxActionType.fromInt(mJHandleBoxItem.getActionType());
                        if (fromInt5 != null) {
                            i = WhenMappings.$EnumSwitchMapping$1[fromInt5.ordinal()];
                        }
                        if (i == 1 || i == 2) {
                            getHandleTouchDetector().setEnableRBClick(true);
                        } else if (i == 3) {
                            getHandleTouchDetector().setEnableRBGesture(true);
                        }
                    }
                }
            }
            this.curEdgeInsets = mJEdgeInsets;
            MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("curEdgeInsets:", mJEdgeInsets));
            MJHandleBoxBorderStyle mJHandleBoxBorderStyle = new MJHandleBoxBorderStyle(new MJColor(1.0f, 1.0f, 1.0f, 1.0f), 1.0f, new MJColor(1.0f, 1.0f, 1.0f, 1.0f), 1.0f);
            this.movieSession.removeHandleBox();
            this.movieSession.showHandleBox(str, new Rect2(new Vec2(0.0f, 0.0f), this.viewSize), this.curEdgeInsets, mJHandleBoxBorderStyle, this.curHandleBoxItems);
        }
    }

    public final void updateViewSize(Vec2 vec2) {
        C87412m.m108594g(vec2, "viewSize");
        getHandleTouchDetector().setViewSize(vec2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MJHandleBoxTouchHelper(MJMovieSession mJMovieSession, Context context2, Vec2 vec2, MJHandlerBoxListener mJHandlerBoxListener, MJHandleBoxTouchHelperListener mJHandleBoxTouchHelperListener, int i, C8480h hVar) {
        this(mJMovieSession, context2, vec2, mJHandlerBoxListener, (i & 16) != 0 ? null : mJHandleBoxTouchHelperListener);
    }
}
