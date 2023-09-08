package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.android.YogaLayout;
import com.tencent.kinda.framework.animate.KindaGlobalAnimator;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.Align;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.IUIPagePlatformDelegate;
import com.tencent.kinda.gen.KPoint;
import com.tencent.kinda.gen.KRect;
import com.tencent.kinda.gen.KSize;
import com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback;
import com.tencent.kinda.gen.KView;
import com.tencent.kinda.gen.KViewOnClickCallback;
import com.tencent.kinda.gen.KViewOnLongClickCallback;
import com.tencent.kinda.gen.KViewOnTouchCallback;
import com.tencent.kinda.gen.PositionType;
import com.tencent.kinda.gen.StatesType;
import com.tencent.kinda.gen.TouchAction;
import com.tencent.kinda.gen.TouchEvent;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.kinda.gen.Visible;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidKRectCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import xi3.C78844a;
import yq3.C79145c;

public class MMKView<T extends View> extends ViewBase implements KView, MMKViewBase<T> {
    public static final String TAG = "base_MMKView";
    private byte _hellAccFlag_;
    public DynamicColor backgroundColor = null;
    /* access modifiers changed from: private */
    public Drawable backgroundDrawable;
    public DynamicColor borderColor = new DynamicColor(0, 0);
    public DynamicColor borderPressedColor = new DynamicColor(0, 0);
    public float borderRadius;
    public float borderWidth;
    private float bottomLeftBorderRadius = 0.0f;
    private float bottomRightBorderRadius = 0.0f;
    /* access modifiers changed from: private */
    public boolean disableDarkModeHighlight;

    /* renamed from: id */
    private String f46023id;
    private MMKViewBackgroundBorderDrawable internalDrawable;
    /* access modifiers changed from: private */
    public boolean isHighlight;
    private boolean isSecure;
    private KViewAnimatorProxy mAnimatorProxy = new KViewAnimatorProxy(this);
    public Context mContext;
    /* access modifiers changed from: private */
    public KViewOnClickCallback onClickCallback;
    /* access modifiers changed from: private */
    public KViewOnLongClickCallback onLongClickCallback;
    /* access modifiers changed from: private */
    public KViewOnTouchCallback onTouchCallback;
    public DynamicColor shadowColor = new DynamicColor(0, 0);
    public float shadowOffset;
    public float shadowRadius;
    public boolean supportDynamicSize = true;
    /* access modifiers changed from: private */
    public DynamicColor tmpSaveBgColor;
    private float topLeftBorderRadius = 0.0f;
    private float topRightBorderRadius = 0.0f;
    private WeakReference<UIPagePlatformDelegateImpl> uiPageDelegate;
    public T view;
    /* access modifiers changed from: private */
    public WeakReference<MMKView> wClickAsView;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKView$8 */
    public static /* synthetic */ class C170538 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$Visible;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.kinda.gen.Visible[] r0 = com.tencent.kinda.gen.Visible.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$Visible = r0
                com.tencent.kinda.gen.Visible r1 = com.tencent.kinda.gen.Visible.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Visible     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.Visible r1 = com.tencent.kinda.gen.Visible.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Visible     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.Visible r1 = com.tencent.kinda.gen.Visible.GONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKView.C170538.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public MMKViewBackgroundBorderDrawable checkIfNeedCreateBorderDrawable() {
        if (this.internalDrawable == null) {
            this.internalDrawable = new MMKViewBackgroundBorderDrawable(getView());
        }
        return this.internalDrawable;
    }

    /* access modifiers changed from: private */
    public long getAlpha(long j) {
        return j >> 24;
    }

    private boolean isViewLayout() {
        View view2 = getView();
        if (view2 == null) {
            return false;
        }
        return (view2.getLeft() == 0 && view2.getTop() == 0 && view2.getRight() == 0 && view2.getBottom() == 0) ? false : true;
    }

    private void removeYogaNode() {
        if (node().getParent() != null) {
            node().getParent().removeChildAt(node().getParent().indexOf(node()));
        }
    }

    private void resumeYogaNode() {
        if (node().getParent() == null && getView().getParent() != null && (getView().getParent() instanceof YogaLayout)) {
            YogaLayout yogaLayout = (YogaLayout) getView().getParent();
            yogaLayout.getYogaNode().addChildAt(node(), yogaLayout.indexOfChild(getView()));
        }
    }

    public void accessibilityClickFrom(KView kView) {
        if ((kView instanceof MMKView) && C78844a.C15689b.f42385a.mo108842h(true)) {
            final MMKView mMKView = (MMKView) kView;
            mMKView.getView().post(new Runnable() {
                public void run() {
                    MMKView mMKView = this;
                    boolean z = true;
                    if (!(mMKView instanceof MMKRichLabelView) ? !(mMKView instanceof KindaSwitchViewImpl) ? mMKView.onClickCallback == null : ((KindaSwitchViewImpl) mMKView).onChangeSwitchCallback == null : ((MMKRichLabelView) mMKView).linkCallback == null && mMKView.onClickCallback == null) {
                        z = false;
                    }
                    if (z) {
                        WeakReference unused = mMKView.wClickAsView = new WeakReference(this);
                        MMKView mMKView2 = mMKView;
                        mMKView2.setOnClickCallback(mMKView2.onClickCallback);
                    }
                }
            });
        }
    }

    public void accessibilityStatesType(StatesType statesType) {
        C79145c cVar = getView().getAccessibilityDelegate() instanceof C79145c ? (C79145c) getView().getAccessibilityDelegate() : new C79145c();
        cVar.setStatesType(statesType);
        getView().setAccessibilityDelegate(cVar);
    }

    public void accessibilityTraitsType(TraitsType traitsType) {
        C79145c cVar = getView().getAccessibilityDelegate() instanceof C79145c ? (C79145c) getView().getAccessibilityDelegate() : new C79145c();
        cVar.setViewType(traitsType);
        getView().setAccessibilityDelegate(cVar);
    }

    public void addBlurEffect(int i) {
    }

    public void autoHeight() {
        this.flexAttr.autoHeight();
    }

    public void autoWidth() {
        this.flexAttr.autoWidth();
    }

    public KPoint convertPointToScreen(KPoint kPoint) {
        return convertPointToView(kPoint, (KView) null);
    }

    public KPoint convertPointToView(KPoint kPoint, KView kView) {
        if (kPoint == null || getView() == null || getView().getContext() == null) {
            Log.m105921e(TAG, "%s call convertPointToView params illegal! point: %s, getView(): %s.", this, kPoint, getView());
            return new KPoint(0.0f, 0.0f);
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getView().getLocationOnScreen(iArr);
        if (kView == null) {
            iArr2[1] = C85875k4.m106198o(getView().getContext());
        } else {
            ((MMKView) kView).getView().getLocationOnScreen(iArr2);
        }
        return new KPoint(MMKViewUtil.pxToDp(getView().getContext(), ((float) (iArr[0] - iArr2[0])) + kPoint.f193408mX), MMKViewUtil.pxToDp(getView().getContext(), ((float) (iArr[1] - iArr2[1])) + kPoint.f193409mY));
    }

    public T createView(Context context) {
        return new View(context);
    }

    public void expandHitSize(float f, float f2) {
        MMKViewUtil.setExpandSize(this.view, f, f2);
    }

    public String getAccessibilityString() {
        return getView().getContentDescription() == null ? "" : (String) getView().getContentDescription();
    }

    public boolean getAccessible() {
        return getView().isImportantForAccessibility();
    }

    public Align getAlignSelf() {
        return this.flexAttr.getAlignSelf();
    }

    public float getAlpha() {
        return getView().getAlpha();
    }

    public float getAspectRatio() {
        return this.flexAttr.getAspectRatio();
    }

    public DynamicColor getBackgroundColor() {
        DynamicColor dynamicColor = this.backgroundColor;
        return dynamicColor == null ? new DynamicColor(0, 0) : dynamicColor;
    }

    public DynamicColor getBorderColor() {
        return this.borderColor;
    }

    public DynamicColor getBorderPressedColor() {
        return this.borderPressedColor;
    }

    public float getBorderWidth() {
        return this.borderWidth;
    }

    public float getBottom() {
        return isViewLayout() ? MMKViewUtil.pxToDp(getView().getContext(), (float) getView().getBottom()) : this.flexAttr.getBottom();
    }

    public float getBottomLeftCornerRadius() {
        return this.bottomLeftBorderRadius;
    }

    public float getBottomPercent() {
        return 0.0f;
    }

    public float getBottomRightCornerRadius() {
        return this.bottomRightBorderRadius;
    }

    public boolean getClickable() {
        return getView().isClickable();
    }

    public float getCornerRadius() {
        return this.borderRadius;
    }

    public boolean getDisableHighlightDarkMode() {
        return this.disableDarkModeHighlight;
    }

    public boolean getEnableHighLight() {
        return this.isHighlight;
    }

    public float getFlexBasis() {
        return this.flexAttr.getFlexBasis();
    }

    public float getFlexGrow() {
        return this.flexAttr.getFlexGrow();
    }

    public float getFlexShrink() {
        return this.flexAttr.getFlexShrink();
    }

    public float getFrameOriginX() {
        if (getView() == null || getView().getContext() == null) {
            Log.m105921e(TAG, "%s call convertPointToView params illegal!, getView(): %s.", this, getView());
            return 0.0f;
        }
        Log.m105925i(TAG, " get getFrameOriginX getView().getLeft(): %s.", Integer.valueOf(getView().getLeft()));
        return (float) C76577a.m92152c(getView().getContext(), getView().getLeft());
    }

    public float getFrameOriginY() {
        if (getView() == null || getView().getContext() == null) {
            Log.m105921e(TAG, "%s call convertPointToView params illegal!, getView(): %s.", this, getView());
            return 0.0f;
        }
        Log.m105925i(TAG, " get getFrameOriginY getView().getTop(): %s.", Integer.valueOf(getView().getTop()));
        return (float) C76577a.m92152c(getView().getContext(), getView().getTop());
    }

    public float getHeight() {
        return this.flexAttr.getHeight();
    }

    public float getHeightPercent() {
        return this.flexAttr.getHeightPercent();
    }

    public boolean getIsRefreshing() {
        return false;
    }

    public float getLeft() {
        return isViewLayout() ? MMKViewUtil.pxToDp(getView().getContext(), (float) getView().getLeft()) : this.flexAttr.getLeft();
    }

    public float getLeftPercent() {
        return this.flexAttr.getLeftPercent();
    }

    public float getMarginBottom() {
        return this.flexAttr.getMarginBottom();
    }

    public float getMarginBottomPercent() {
        return this.flexAttr.getMarginBottomPercent();
    }

    public float getMarginLeft() {
        return this.flexAttr.getMarginLeft();
    }

    public float getMarginLeftPercent() {
        return this.flexAttr.getMarginLeftPercent();
    }

    public float getMarginRight() {
        return this.flexAttr.getMarginRight();
    }

    public float getMarginRightPercent() {
        return this.flexAttr.getMarginRightPercent();
    }

    public float getMarginTop() {
        return this.flexAttr.getMarginTop();
    }

    public float getMarginTopPercent() {
        return this.flexAttr.getMarginTopPercent();
    }

    public float getMaxHeight() {
        return this.flexAttr.getMaxHeight();
    }

    public float getMaxWidth() {
        return this.flexAttr.getMaxWidth();
    }

    public float getMinHeight() {
        return this.flexAttr.getMinHeight();
    }

    public float getMinWidth() {
        return this.flexAttr.getMinWidth();
    }

    public KViewOnClickCallback getOnClickCallback() {
        return this.onClickCallback;
    }

    public float getPaddingBottom() {
        return this.flexAttr.getPaddingBottom();
    }

    public float getPaddingBottomPercent() {
        return this.flexAttr.getPaddingBottomPercent();
    }

    public float getPaddingLeft() {
        return this.flexAttr.getPaddingLeft();
    }

    public float getPaddingLeftPercent() {
        return this.flexAttr.getPaddingLeftPercent();
    }

    public float getPaddingRight() {
        return this.flexAttr.getPaddingRight();
    }

    public float getPaddingRightPercent() {
        return this.flexAttr.getPaddingRightPercent();
    }

    public float getPaddingTop() {
        return this.flexAttr.getPaddingTop();
    }

    public float getPaddingTopPercent() {
        return this.flexAttr.getPaddingTopPercent();
    }

    public PositionType getPositionType() {
        return this.flexAttr.getPositionType();
    }

    public String getReportId() {
        return (String) this.view.getTag(C0966R.C0970id.f359572m92);
    }

    public float getRight() {
        return isViewLayout() ? MMKViewUtil.pxToDp(getView().getContext(), (float) getView().getRight()) : this.flexAttr.getRight();
    }

    public float getRightPercent() {
        return this.flexAttr.getRightPercent();
    }

    public float getRotation() {
        return getView().getRotation();
    }

    public float getScaleX() {
        return getView().getScaleX();
    }

    public float getScaleY() {
        return getView().getScaleY();
    }

    public boolean getSecure() {
        return this.isSecure;
    }

    public DynamicColor getShadowColor() {
        return this.shadowColor;
    }

    public float getShadowOffset() {
        return 0.0f;
    }

    public float getShadowRadius() {
        return 0.0f;
    }

    public boolean getSupportDynamicSize() {
        return this.supportDynamicSize;
    }

    public float getTop() {
        return isViewLayout() ? MMKViewUtil.pxToDp(getView().getContext(), (float) getView().getTop()) : this.flexAttr.getTop();
    }

    public float getTopLeftCornerRadius() {
        return this.topLeftBorderRadius;
    }

    public float getTopPercent() {
        return this.flexAttr.getTopPercent();
    }

    public float getTopRightCornerRadius() {
        return this.topRightBorderRadius;
    }

    public float getTranslateX() {
        return getView().getTranslationX();
    }

    public float getTranslateY() {
        return getView().getTranslationY();
    }

    public final T getView() {
        return this.view;
    }

    public String getViewId() {
        return Util.isNullOrNil(this.f46023id) ? "" : this.f46023id;
    }

    public Visible getVisible() {
        int visibility = getView().getVisibility();
        return visibility != 0 ? visibility != 4 ? visibility != 8 ? Visible.VISIBLE : Visible.GONE : Visible.INVISIBLE : Visible.VISIBLE;
    }

    public float getWidth() {
        return this.flexAttr.getWidth();
    }

    public float getWidthPercent() {
        return this.flexAttr.getWidthPercent();
    }

    public final void initWithPlatformDelegate(IUIPagePlatformDelegate iUIPagePlatformDelegate) {
        if (iUIPagePlatformDelegate instanceof UIPagePlatformDelegateImpl) {
            UIPagePlatformDelegateImpl uIPagePlatformDelegateImpl = (UIPagePlatformDelegateImpl) iUIPagePlatformDelegate;
            this.uiPageDelegate = new WeakReference<>(uIPagePlatformDelegateImpl);
            Context context = uIPagePlatformDelegateImpl.getContext();
            if (context != null) {
                setView(createView(context));
            }
            this.mContext = MMApplicationContext.getContext();
        }
    }

    public void notifyChanged() {
        if (node().isMeasureDefined() && !node().isDirty()) {
            node().dirty();
        }
        getView().requestLayout();
    }

    public void onFlexAttribute() {
        notifyChanged();
    }

    public void removeBlurEffect() {
    }

    public void requestFrameImpl(final VoidKRectCallback voidKRectCallback) {
        this.view.post(new Runnable() {
            public void run() {
                KRect kRect = new KRect();
                kRect.mOrigin = new KPoint();
                kRect.mSize = new KSize();
                kRect.mOrigin.f193408mX = (float) MMKView.this.view.getLeft();
                kRect.mOrigin.f193409mY = (float) MMKView.this.view.getTop();
                kRect.mSize.mWidth = (float) MMKView.this.view.getWidth();
                kRect.mSize.mHeight = (float) MMKView.this.view.getHeight();
                voidKRectCallback.call(kRect);
            }
        });
    }

    public void requestLayout() {
    }

    public void setAccessibilityString(String str) {
        getView().setContentDescription(str);
    }

    public void setAccessible(boolean z) {
        if (z) {
            getView().setImportantForAccessibility(1);
        } else {
            getView().setImportantForAccessibility(2);
        }
    }

    public void setAlignSelf(Align align) {
        this.flexAttr.setAlignSelf(align);
    }

    public void setAlpha(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setAlpha(f);
            return;
        }
        View view2 = getView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/MMKView", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/kinda/framework/widget/base/MMKView", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void setAspectRatio(float f) {
        this.flexAttr.setAspectRatio(f);
    }

    public void setBackgroundColor(DynamicColor dynamicColor) {
        if (KindaGlobalAnimator.hasAnimate()) {
            Log.m105918d(TAG, "进入动画setBackgroundColor，KView：" + this + "，value：" + Long.toHexString(ColorUtil.absColor(ColorUtil.getColorByMode(dynamicColor))));
            this.mAnimatorProxy.setBackgroundColor(dynamicColor);
            return;
        }
        Log.m105918d(TAG, "进入View设置属性的setBackgroundColor，KView：" + this + "，value：" + Long.toHexString(ColorUtil.absColor(ColorUtil.getColorByMode(dynamicColor))));
        this.backgroundColor = dynamicColor;
        if (ColorUtil.getColorByMode(dynamicColor) >= 0) {
            checkIfNeedCreateBorderDrawable().setBackgroundColor(MMKViewUtil.argbColor(ColorUtil.getColorByMode(this.backgroundColor)));
            setViewBackground(this.backgroundDrawable);
        }
    }

    public void setBorderColor(DynamicColor dynamicColor) {
        this.borderColor = dynamicColor;
        if (ColorUtil.getColorByMode(dynamicColor) >= 0) {
            checkIfNeedCreateBorderDrawable().setBorderColor(MMKViewUtil.argbColor(ColorUtil.getColorByMode(this.borderColor)));
            setViewBackground(this.backgroundDrawable);
        }
    }

    public void setBorderPressedColor(DynamicColor dynamicColor) {
        this.borderPressedColor = dynamicColor;
        if (ColorUtil.getColorByMode(dynamicColor) >= 0) {
            checkIfNeedCreateBorderDrawable().setBorderPressedColor(MMKViewUtil.argbColor(ColorUtil.getColorByMode(this.borderPressedColor)));
            setViewBackground(this.backgroundDrawable);
        }
    }

    public void setBorderWidth(float f) {
        this.borderWidth = f;
        if (f > 0.0f) {
            checkIfNeedCreateBorderDrawable().setBorderWidth((float) C76577a.m92151b(MMApplicationContext.getContext(), (int) f));
            setViewBackground(this.backgroundDrawable);
        }
    }

    public void setBottom(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setBottom(f);
        } else {
            this.flexAttr.setBottom(f);
        }
    }

    public void setBottomLeftCornerRadius(float f) {
        this.bottomLeftBorderRadius = f;
        if (f >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setBottomLeftBorderRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), (int) this.bottomLeftBorderRadius));
        }
    }

    public void setBottomPercent(float f) {
        this.flexAttr.setBottomPercent(f);
    }

    public void setBottomRightCornerRadius(float f) {
        this.bottomRightBorderRadius = f;
        if (f >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setBottomRightBorderRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), (int) this.bottomRightBorderRadius));
        }
    }

    public void setClickable(boolean z) {
        getView().setClickable(z);
    }

    public void setCornerRadius(float f) {
        this.borderRadius = f;
        if (f >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setBorderRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), (int) this.borderRadius));
            setViewBackground(this.backgroundDrawable);
        }
    }

    public void setDisableHighlightDarkMode(boolean z) {
        this.disableDarkModeHighlight = z;
    }

    public void setEnableHighLight(boolean z) {
        this.isHighlight = z;
        if (getView() != null && this.isHighlight) {
            getView().setOnTouchListener(new View.OnTouchListener() {
                private byte _hellAccFlag_;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    if (MMKView.this.isHighlight) {
                        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                            MMKView mMKView = MMKView.this;
                            DynamicColor dynamicColor = mMKView.backgroundColor;
                            if (dynamicColor == null) {
                                DynamicColor unused = mMKView.tmpSaveBgColor = new DynamicColor(0, 0);
                                if (MMKView.this.disableDarkModeHighlight) {
                                    MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(MMKView.this.mContext.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
                                } else {
                                    MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(MMKView.this.mContext.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
                                }
                            } else {
                                if (mMKView.getAlpha(dynamicColor.mNormalColor) == 0) {
                                    MMKView mMKView2 = MMKView.this;
                                    if (mMKView2.getAlpha(mMKView2.backgroundColor.mDarkmodeColor) == 0) {
                                        DynamicColor unused2 = MMKView.this.tmpSaveBgColor = new DynamicColor(0, 0);
                                        if (MMKView.this.disableDarkModeHighlight) {
                                            MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(MMKView.this.mContext.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
                                        } else {
                                            MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(MMKView.this.mContext.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
                                        }
                                    }
                                }
                                MMKView mMKView3 = MMKView.this;
                                DynamicColor unused3 = mMKView3.tmpSaveBgColor = mMKView3.backgroundColor;
                                if (MMKView.this.disableDarkModeHighlight) {
                                    MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor((int) ColorUtil.MergeColors(ColorUtil.getColorByModeNoCompat(MMKView.this.backgroundColor), (long) MMKView.this.mContext.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1)));
                                } else {
                                    MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor((int) ColorUtil.MergeColors(ColorUtil.getColorByModeNoCompat(MMKView.this.backgroundColor), (long) MMKView.this.mContext.getResources().getColor(C0966R.color.FG_3)));
                                }
                            }
                            MMKView mMKView4 = MMKView.this;
                            mMKView4.setViewBackground(mMKView4.backgroundDrawable);
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor((int) ColorUtil.getColorByMode(MMKView.this.tmpSaveBgColor));
                            MMKView mMKView5 = MMKView.this;
                            mMKView5.setViewBackground(mMKView5.backgroundDrawable);
                        }
                    }
                    if (MMKView.this.onTouchCallback != null) {
                        TouchAction touchAction = TouchAction.DOWN;
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action == 1) {
                                touchAction = TouchAction.UP;
                            } else if (action == 2) {
                                touchAction = TouchAction.MOVE;
                            }
                        }
                        MMKView.this.onTouchCallback.onTouch(new TouchEvent(motionEvent.getX(), motionEvent.getY(), touchAction));
                    }
                    C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
        }
    }

    public void setFlexBasis(float f) {
        this.flexAttr.setFlexBasis(f);
    }

    public void setFlexGrow(float f) {
        this.flexAttr.setFlexGrow(f);
    }

    public void setFlexShrink(float f) {
        this.flexAttr.setFlexShrink(f);
    }

    public void setFrameImpl(KRect kRect, final VoidCallback voidCallback) {
        setTranslateX(kRect.mOrigin.f193408mX);
        setTranslateY(kRect.mOrigin.f193409mY);
        setWidth(kRect.mSize.mWidth);
        setHeight(kRect.mSize.mHeight);
        this.view.post(new Runnable() {
            public void run() {
                voidCallback.call();
            }
        });
    }

    public void setHeight(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setHeight(f);
        } else {
            this.flexAttr.setHeight(f);
        }
    }

    public void setHeightPercent(float f) {
        this.flexAttr.setHeightPercent(f);
    }

    public void setIsRefreshing(boolean z) {
    }

    public void setLeft(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setLeft(f);
        } else {
            this.flexAttr.setLeft(f);
        }
    }

    public void setLeftPercent(float f) {
        this.flexAttr.setLeftPercent(f);
    }

    public void setMarginBottom(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginBottom(f);
            return;
        }
        this.flexAttr.setMarginBottom(f);
        if (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).bottomMargin = (int) MMKViewUtil.dpToPx(this.mContext, getMarginBottom());
        }
    }

    public void setMarginBottomPercent(float f) {
        this.flexAttr.setMarginBottomPercent(f);
    }

    public void setMarginLeft(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginLeft(f);
            return;
        }
        this.flexAttr.setMarginLeft(f);
        if (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).leftMargin = (int) MMKViewUtil.dpToPx(this.mContext, getMarginLeft());
        }
    }

    public void setMarginLeftPercent(float f) {
        this.flexAttr.setMarginLeftPercent(f);
    }

    public void setMarginRight(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginRight(f);
            return;
        }
        this.flexAttr.setMarginRight(f);
        if (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).rightMargin = (int) MMKViewUtil.dpToPx(this.mContext, getMarginRight());
        }
    }

    public void setMarginRightPercent(float f) {
        this.flexAttr.setMarginRightPercent(f);
    }

    public void setMarginTop(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginTop(f);
            return;
        }
        this.flexAttr.setMarginTop(f);
        if (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).topMargin = (int) MMKViewUtil.dpToPx(this.mContext, getMarginTop());
        }
    }

    public void setMarginTopPercent(float f) {
        this.flexAttr.setMarginTopPercent(f);
    }

    public void setMaxHeight(float f) {
        this.flexAttr.setMaxHeight(f);
    }

    public void setMaxWidth(float f) {
        this.flexAttr.setMaxWidth(f);
    }

    public void setMinHeight(float f) {
        this.flexAttr.setMinHeight(f);
    }

    public void setMinWidth(float f) {
        this.flexAttr.setMinWidth(f);
    }

    public void setOnClickCallback(KViewOnClickCallback kViewOnClickCallback) {
        this.onClickCallback = kViewOnClickCallback;
        getView().setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (MMKView.this.onClickCallback != null) {
                    MMKView.this.onClickCallback.onClick(MMKView.this);
                } else {
                    MMKView mMKView = (MMKView) MMKView.this.wClickAsView.get();
                    if (mMKView == null || !C78844a.C15689b.f42385a.mo108842h(true)) {
                        C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/MMKView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (mMKView instanceof MMKRichLabelView) {
                        VoidCallback voidCallback = ((MMKRichLabelView) mMKView).linkCallback;
                        if (voidCallback != null) {
                            voidCallback.call();
                        } else if (mMKView.onClickCallback != null) {
                            mMKView.onClickCallback.onClick(mMKView);
                        }
                    } else if (mMKView instanceof KindaSwitchViewImpl) {
                        KSwitchViewOnChangeSwitchCallback kSwitchViewOnChangeSwitchCallback = ((KindaSwitchViewImpl) mMKView).onChangeSwitchCallback;
                        if (kSwitchViewOnChangeSwitchCallback != null) {
                            kSwitchViewOnChangeSwitchCallback.onChangeSwitch();
                        }
                    } else if (mMKView.onClickCallback != null) {
                        mMKView.onClickCallback.onClick(mMKView);
                    }
                }
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/MMKView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public void setOnLongClickCallback(KViewOnLongClickCallback kViewOnLongClickCallback) {
        this.onLongClickCallback = kViewOnLongClickCallback;
        getView().setOnLongClickListener(new View.OnLongClickListener() {
            private byte _hellAccFlag_;

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                if (MMKView.this.onLongClickCallback != null) {
                    MMKView.this.onLongClickCallback.onLongClick(MMKView.this);
                }
                C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        });
    }

    public void setOnTouchCallback(KViewOnTouchCallback kViewOnTouchCallback) {
        this.onTouchCallback = kViewOnTouchCallback;
        if (getView() != null) {
            getView().setOnTouchListener(new View.OnTouchListener() {
                private byte _hellAccFlag_;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKView$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    if (MMKView.this.onTouchCallback != null) {
                        TouchAction touchAction = TouchAction.DOWN;
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action == 1) {
                                touchAction = TouchAction.UP;
                            } else if (action == 2) {
                                touchAction = TouchAction.MOVE;
                            }
                        }
                        MMKView.this.onTouchCallback.onTouch(new TouchEvent(motionEvent.getX(), motionEvent.getY(), touchAction));
                    }
                    C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKView$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
        }
    }

    public void setPaddingBottom(float f) {
        this.flexAttr.setPaddingBottom(f);
    }

    public void setPaddingBottomPercent(float f) {
        this.flexAttr.setPaddingBottomPercent(f);
    }

    public void setPaddingLeft(float f) {
        this.flexAttr.setPaddingLeft(f);
    }

    public void setPaddingLeftPercent(float f) {
        this.flexAttr.setPaddingLeftPercent(f);
    }

    public void setPaddingRight(float f) {
        this.flexAttr.setPaddingRight(f);
    }

    public void setPaddingRightPercent(float f) {
        this.flexAttr.setPaddingRightPercent(f);
    }

    public void setPaddingTop(float f) {
        this.flexAttr.setPaddingTop(f);
    }

    public void setPaddingTopPercent(float f) {
        this.flexAttr.setPaddingTopPercent(f);
    }

    public void setPositionType(PositionType positionType) {
        this.flexAttr.setPositionType(positionType);
    }

    public void setReportId(String str) {
        if (!Util.isNullOrNil(str)) {
            this.view.setTag(C0966R.C0970id.f359572m92, str);
        }
    }

    public void setRight(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setRight(f);
        } else {
            this.flexAttr.setRight(f);
        }
    }

    public void setRightPercent(float f) {
        this.flexAttr.setRightPercent(f);
    }

    public void setRotation(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setRotation(f);
        } else {
            getView().setRotation(f);
        }
    }

    public void setScaleX(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setScaleX(f);
        } else {
            getView().setScaleX(f);
        }
    }

    public void setScaleY(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setScaleY(f);
        } else {
            getView().setScaleY(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r6 = r5.uiPageDelegate.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSecure(boolean r6) {
        /*
            r5 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_kinda_secure_page_flag
            r2 = 1
            int r0 = r0.mo58779Qe(r1, r2)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            r4 = 0
            r1[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1[r2] = r3
            java.lang.String r3 = "base_MMKView"
            java.lang.String r4 = "setSecure %s, enableValue: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            if (r0 == r2) goto L_0x002a
            return
        L_0x002a:
            r5.isSecure = r6
            java.lang.ref.WeakReference<com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl> r6 = r5.uiPageDelegate
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r6.get()
            if (r6 == 0) goto L_0x0089
            java.lang.ref.WeakReference<com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl> r6 = r5.uiPageDelegate
            java.lang.Object r6 = r6.get()
            com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl r6 = (com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl) r6
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x0089
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0089
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L_0x0089
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L_0x0057
            goto L_0x0089
        L_0x0057:
            boolean r1 = r5.isSecure
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006c
            int r1 = r5.hashCode()
            r6.addSecureView(r1)
            android.view.Window r6 = r0.getWindow()
            r6.addFlags(r2)
            goto L_0x0089
        L_0x006c:
            int r1 = r5.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.removeSecureView(r1)
            java.util.ArrayList r6 = r6.getSecureViews()
            int r6 = r6.size()
            if (r6 > 0) goto L_0x0089
            android.view.Window r6 = r0.getWindow()
            r6.clearFlags(r2)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKView.setSecure(boolean):void");
    }

    public void setShadowColor(DynamicColor dynamicColor) {
        this.shadowColor = dynamicColor;
    }

    public void setShadowOffset(float f) {
    }

    public void setShadowRadius(float f) {
    }

    public void setSupportDynamicSize(boolean z) {
        this.supportDynamicSize = z;
    }

    public void setTop(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setTop(f);
        } else {
            this.flexAttr.setTop(f);
        }
    }

    public void setTopLeftCornerRadius(float f) {
        this.topLeftBorderRadius = f;
        if (f >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setTopLeftBorderRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), (int) this.topLeftBorderRadius));
        }
    }

    public void setTopPercent(float f) {
        this.flexAttr.setTopPercent(f);
    }

    public void setTopRightCornerRadius(float f) {
        this.topRightBorderRadius = f;
        if (f >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setTopRightBorderRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), (int) this.topRightBorderRadius));
        }
    }

    public void setTranslateX(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setTranslateX(f);
        } else {
            getView().setTranslationX(f);
        }
    }

    public void setTranslateY(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setTranslateY(f);
        } else {
            getView().setTranslationY(f);
        }
    }

    public final void setView(T t) {
        this.view = t;
    }

    public void setViewBackground(Drawable drawable) {
        this.backgroundDrawable = drawable;
        if (drawable != null || this.internalDrawable == null) {
            MMKViewBackgroundBorderDrawable mMKViewBackgroundBorderDrawable = this.internalDrawable;
            if (mMKViewBackgroundBorderDrawable == null && drawable != null) {
                getView().setBackground(this.backgroundDrawable);
            } else if (mMKViewBackgroundBorderDrawable != null) {
                mMKViewBackgroundBorderDrawable.setInsetDrawable(drawable);
                getView().setBackground(this.internalDrawable);
            }
        } else {
            getView().setBackground(this.internalDrawable);
        }
    }

    public void setViewId(String str) {
        this.f46023id = str;
        this.flexAttr.setTestId(str);
        MMKViewUtil.setId4KindaImplView(this.mContext, str, getView());
    }

    public void setVisible(Visible visible) {
        int i = C170538.$SwitchMap$com$tencent$kinda$gen$Visible[visible.ordinal()];
        if (i == 1) {
            View view2 = getView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.flexAttr.setVisibility(0);
            resumeYogaNode();
        } else if (i == 2) {
            View view4 = getView();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.flexAttr.setVisibility(4);
        } else if (i == 3) {
            View view5 = getView();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.flexAttr.setVisibility(8);
            removeYogaNode();
        }
        notifyChanged();
    }

    public void setWidth(float f) {
        if (KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setWidth(f);
        } else {
            this.flexAttr.setWidth(f);
        }
    }

    public void setWidthPercent(float f) {
        this.flexAttr.setWidthPercent(f);
    }
}
