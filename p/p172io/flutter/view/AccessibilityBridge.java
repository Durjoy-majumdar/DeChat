package p172io.flutter.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.accessibility.core.provider.TypeModifier;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import p172io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import p172io.flutter.util.Predicate;
import p172io.flutter.util.ViewUtils;

/* renamed from: io.flutter.view.AccessibilityBridge */
public class AccessibilityBridge extends AccessibilityNodeProvider {
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static int FIRST_RESOURCE_ID = 267386881;
    /* access modifiers changed from: private */
    public static final int FOCUSABLE_FLAGS = (((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value);
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    /* access modifiers changed from: private */
    public static final int SCROLLABLE_ACTIONS = (((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value);
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final String TAG = "AccessibilityBridge";
    /* access modifiers changed from: private */
    public final AccessibilityChannel accessibilityChannel;
    private int accessibilityFeatureFlags;
    private SemanticsNode accessibilityFocusedSemanticsNode;
    /* access modifiers changed from: private */
    public final AccessibilityManager accessibilityManager;
    /* access modifiers changed from: private */
    public final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler;
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private final AccessibilityViewEmbedder accessibilityViewEmbedder;
    private final ContentObserver animationScaleObserver;
    /* access modifiers changed from: private */
    public final ContentResolver contentResolver;
    private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions;
    private Integer embeddedAccessibilityFocusedNodeId;
    private Integer embeddedInputFocusedNodeId;
    private final List<Integer> flutterNavigationStack;
    private final Map<Integer, SemanticsNode> flutterSemanticsTree;
    private SemanticsNode hoveredObject;
    private SemanticsNode inputFocusedSemanticsNode;
    /* access modifiers changed from: private */
    public boolean isReleased;
    private SemanticsNode lastInputFocusedSemanticsNode;
    private Integer lastLeftFrameInset;
    /* access modifiers changed from: private */
    public OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
    private int previousRouteId;
    /* access modifiers changed from: private */
    public final View rootAccessibilityView;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* renamed from: io.flutter.view.AccessibilityBridge$7 */
    public static /* synthetic */ class C246387 {

        /* renamed from: $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType */
        public static final /* synthetic */ int[] f70249x66a987df;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.AccessibilityBridge$StringAttributeType[] r0 = p172io.flutter.view.AccessibilityBridge.StringAttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f70249x66a987df = r0
                io.flutter.view.AccessibilityBridge$StringAttributeType r1 = p172io.flutter.view.AccessibilityBridge.StringAttributeType.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f70249x66a987df     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.AccessibilityBridge$StringAttributeType r1 = p172io.flutter.view.AccessibilityBridge.StringAttributeType.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.view.AccessibilityBridge.C246387.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$AccessibilityFeature */
    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4);
        
        public final int value;

        private AccessibilityFeature(int i) {
            this.value = i;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$Action */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        
        public final int value;

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$CustomAccessibilityAction */
    public static class CustomAccessibilityAction {
        /* access modifiers changed from: private */
        public String hint;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public int f70250id = -1;
        /* access modifiers changed from: private */
        public String label;
        /* access modifiers changed from: private */
        public int overrideId = -1;
        /* access modifiers changed from: private */
        public int resourceId = -1;
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$Flag */
    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        
        public final int value;

        private Flag(int i) {
            this.value = i;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$LocaleStringAttribute */
    public static class LocaleStringAttribute extends StringAttribute {
        public String locale;

        private LocaleStringAttribute() {
            super();
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$SemanticsNode */
    public static class SemanticsNode {
        public final AccessibilityBridge accessibilityBridge;
        private int actions;
        private float bottom;
        /* access modifiers changed from: private */
        public List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
        /* access modifiers changed from: private */
        public List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
        /* access modifiers changed from: private */
        public int currentValueLength;
        /* access modifiers changed from: private */
        public List<CustomAccessibilityAction> customAccessibilityActions;
        /* access modifiers changed from: private */
        public String decreasedValue;
        /* access modifiers changed from: private */
        public List<StringAttribute> decreasedValueAttributes;
        private int flags;
        /* access modifiers changed from: private */
        public boolean globalGeometryDirty = true;
        private Rect globalRect;
        private float[] globalTransform;
        /* access modifiers changed from: private */
        public boolean hadPreviousConfig = false;
        private String hint;
        private List<StringAttribute> hintAttributes;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public int f70251id = -1;
        /* access modifiers changed from: private */
        public String increasedValue;
        /* access modifiers changed from: private */
        public List<StringAttribute> increasedValueAttributes;
        private float[] inverseTransform;
        /* access modifiers changed from: private */
        public boolean inverseTransformDirty = true;
        /* access modifiers changed from: private */
        public String label;
        private List<StringAttribute> labelAttributes;
        private float left;
        /* access modifiers changed from: private */
        public int maxValueLength;
        /* access modifiers changed from: private */
        public CustomAccessibilityAction onLongPressOverride;
        /* access modifiers changed from: private */
        public CustomAccessibilityAction onTapOverride;
        /* access modifiers changed from: private */
        public SemanticsNode parent;
        /* access modifiers changed from: private */
        public int platformViewId;
        private int previousActions;
        private int previousFlags;
        private String previousLabel;
        /* access modifiers changed from: private */
        public int previousNodeId = -1;
        private float previousScrollExtentMax;
        private float previousScrollExtentMin;
        private float previousScrollPosition;
        /* access modifiers changed from: private */
        public int previousTextSelectionBase;
        /* access modifiers changed from: private */
        public int previousTextSelectionExtent;
        /* access modifiers changed from: private */
        public String previousValue;
        private float right;
        /* access modifiers changed from: private */
        public int scrollChildren;
        /* access modifiers changed from: private */
        public float scrollExtentMax;
        /* access modifiers changed from: private */
        public float scrollExtentMin;
        /* access modifiers changed from: private */
        public int scrollIndex;
        /* access modifiers changed from: private */
        public float scrollPosition;
        private TextDirection textDirection;
        /* access modifiers changed from: private */
        public int textSelectionBase;
        /* access modifiers changed from: private */
        public int textSelectionExtent;
        /* access modifiers changed from: private */
        public String tooltip;
        private float top;
        private float[] transform;
        /* access modifiers changed from: private */
        public String value;
        /* access modifiers changed from: private */
        public List<StringAttribute> valueAttributes;

        public SemanticsNode(AccessibilityBridge accessibilityBridge2) {
            this.accessibilityBridge = accessibilityBridge2;
        }

        public static /* synthetic */ int access$1912(SemanticsNode semanticsNode, int i) {
            int i2 = semanticsNode.textSelectionExtent + i;
            semanticsNode.textSelectionExtent = i2;
            return i2;
        }

        public static /* synthetic */ int access$1920(SemanticsNode semanticsNode, int i) {
            int i2 = semanticsNode.textSelectionExtent - i;
            semanticsNode.textSelectionExtent = i2;
            return i2;
        }

        /* access modifiers changed from: private */
        public void collectRoutes(List<SemanticsNode> list) {
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (SemanticsNode collectRoutes : this.childrenInTraversalOrder) {
                collectRoutes.collectRoutes(list);
            }
        }

        private SpannableString createSpannableString(String str, List<StringAttribute> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (StringAttribute next : list) {
                    int i = C246387.f70249x66a987df[next.type.ordinal()];
                    if (i == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), next.start, next.end, 0);
                    } else if (i == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((LocaleStringAttribute) next).locale)), next.start, next.end, 0);
                    }
                }
            }
            return spannableString;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            r2 = r3.previousLabel;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean didChangeLabel() {
            /*
                r3 = this;
                java.lang.String r0 = r3.label
                r1 = 0
                if (r0 != 0) goto L_0x000a
                java.lang.String r2 = r3.previousLabel
                if (r2 != 0) goto L_0x000a
                return r1
            L_0x000a:
                if (r0 == 0) goto L_0x0016
                java.lang.String r2 = r3.previousLabel
                if (r2 == 0) goto L_0x0016
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0017
            L_0x0016:
                r1 = 1
            L_0x0017:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.view.AccessibilityBridge.SemanticsNode.didChangeLabel():boolean");
        }

        /* access modifiers changed from: private */
        public boolean didScroll() {
            return !Float.isNaN(this.scrollPosition) && !Float.isNaN(this.previousScrollPosition) && this.previousScrollPosition != this.scrollPosition;
        }

        private void ensureInverseTransform() {
            if (this.inverseTransformDirty) {
                this.inverseTransformDirty = false;
                if (this.inverseTransform == null) {
                    this.inverseTransform = new float[16];
                }
                if (!Matrix.invertM(this.inverseTransform, 0, this.transform, 0)) {
                    Arrays.fill(this.inverseTransform, 0.0f);
                }
            }
        }

        private SemanticsNode getAncestor(Predicate<SemanticsNode> predicate) {
            for (SemanticsNode semanticsNode = this.parent; semanticsNode != null; semanticsNode = semanticsNode.parent) {
                if (predicate.test(semanticsNode)) {
                    return semanticsNode;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public Rect getGlobalRect() {
            return this.globalRect;
        }

        /* access modifiers changed from: private */
        public String getRouteName() {
            String str;
            if (hasFlag(Flag.NAMES_ROUTE) && (str = this.label) != null && !str.isEmpty()) {
                return this.label;
            }
            for (SemanticsNode routeName : this.childrenInTraversalOrder) {
                String routeName2 = routeName.getRouteName();
                if (routeName2 != null && !routeName2.isEmpty()) {
                    return routeName2;
                }
            }
            return null;
        }

        private List<StringAttribute> getStringAttributesFromBuffer(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i = byteBuffer.getInt();
            if (i == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                int i4 = byteBuffer.getInt();
                StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
                int i5 = C246387.f70249x66a987df[stringAttributeType.ordinal()];
                if (i5 == 1) {
                    byteBuffer.getInt();
                    SpellOutStringAttribute spellOutStringAttribute = new SpellOutStringAttribute();
                    spellOutStringAttribute.start = i3;
                    spellOutStringAttribute.end = i4;
                    spellOutStringAttribute.type = stringAttributeType;
                    arrayList.add(spellOutStringAttribute);
                } else if (i5 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    LocaleStringAttribute localeStringAttribute = new LocaleStringAttribute();
                    localeStringAttribute.start = i3;
                    localeStringAttribute.end = i4;
                    localeStringAttribute.type = stringAttributeType;
                    localeStringAttribute.locale = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(localeStringAttribute);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public CharSequence getValueLabelHint() {
            CharSequence charSequence = null;
            for (CharSequence charSequence2 : new CharSequence[]{createSpannableString(this.value, this.valueAttributes), createSpannableString(this.label, this.labelAttributes), createSpannableString(this.hint, this.hintAttributes)}) {
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        public boolean hadAction(Action action) {
            return (action.value & this.previousActions) != 0;
        }

        /* access modifiers changed from: private */
        public boolean hadFlag(Flag flag) {
            return (flag.value & this.previousFlags) != 0;
        }

        /* access modifiers changed from: private */
        public boolean hasAction(Action action) {
            return (action.value & this.actions) != 0;
        }

        /* access modifiers changed from: private */
        public boolean hasFlag(Flag flag) {
            return (flag.value & this.flags) != 0;
        }

        /* access modifiers changed from: private */
        public SemanticsNode hitTest(float[] fArr) {
            float f = fArr[3];
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.left || f2 >= this.right || f3 < this.top || f3 >= this.bottom) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (SemanticsNode next : this.childrenInHitTestOrder) {
                if (!next.hasFlag(Flag.IS_HIDDEN)) {
                    next.ensureInverseTransform();
                    Matrix.multiplyMV(fArr2, 0, next.inverseTransform, 0, fArr, 0);
                    SemanticsNode hitTest = next.hitTest(fArr2);
                    if (hitTest != null) {
                        return hitTest;
                    }
                }
            }
            if (isFocusable()) {
                return this;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            r0 = r4.label;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            r0 = r4.value;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r0 = r4.hint;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean isFocusable() {
            /*
                r4 = this;
                io.flutter.view.AccessibilityBridge$Flag r0 = p172io.flutter.view.AccessibilityBridge.Flag.SCOPES_ROUTE
                boolean r0 = r4.hasFlag(r0)
                r1 = 0
                if (r0 == 0) goto L_0x000a
                return r1
            L_0x000a:
                io.flutter.view.AccessibilityBridge$Flag r0 = p172io.flutter.view.AccessibilityBridge.Flag.IS_FOCUSABLE
                boolean r0 = r4.hasFlag(r0)
                r2 = 1
                if (r0 == 0) goto L_0x0014
                return r2
            L_0x0014:
                int r0 = r4.actions
                int r3 = p172io.flutter.view.AccessibilityBridge.SCROLLABLE_ACTIONS
                int r3 = ~r3
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                int r0 = r4.flags
                int r3 = p172io.flutter.view.AccessibilityBridge.FOCUSABLE_FLAGS
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                java.lang.String r0 = r4.label
                if (r0 == 0) goto L_0x0031
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x0031:
                java.lang.String r0 = r4.value
                if (r0 == 0) goto L_0x003b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x003b:
                java.lang.String r0 = r4.hint
                if (r0 == 0) goto L_0x0046
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0046
            L_0x0045:
                r1 = 1
            L_0x0046:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.view.AccessibilityBridge.SemanticsNode.isFocusable():boolean");
        }

        private void log(String str, boolean z) {
        }

        private float max(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        private float min(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        /* access modifiers changed from: private */
        public static boolean nullableHasAncestor(SemanticsNode semanticsNode, Predicate<SemanticsNode> predicate) {
            return (semanticsNode == null || semanticsNode.getAncestor(predicate) == null) ? false : true;
        }

        private void transformPoint(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        /* access modifiers changed from: private */
        public void updateRecursively(float[] fArr, Set<SemanticsNode> set, boolean z) {
            if (this.transform != null) {
                set.add(this);
                if (this.globalGeometryDirty) {
                    z = true;
                }
                if (z) {
                    if (this.globalTransform == null) {
                        this.globalTransform = new float[16];
                    }
                    Matrix.multiplyMM(this.globalTransform, 0, fArr, 0, this.transform, 0);
                    float[] fArr2 = new float[4];
                    fArr2[2] = 0.0f;
                    fArr2[3] = 1.0f;
                    float[] fArr3 = new float[4];
                    float[] fArr4 = new float[4];
                    float[] fArr5 = new float[4];
                    float[] fArr6 = new float[4];
                    fArr2[0] = this.left;
                    fArr2[1] = this.top;
                    transformPoint(fArr3, this.globalTransform, fArr2);
                    fArr2[0] = this.right;
                    fArr2[1] = this.top;
                    transformPoint(fArr4, this.globalTransform, fArr2);
                    fArr2[0] = this.right;
                    fArr2[1] = this.bottom;
                    transformPoint(fArr5, this.globalTransform, fArr2);
                    fArr2[0] = this.left;
                    fArr2[1] = this.bottom;
                    transformPoint(fArr6, this.globalTransform, fArr2);
                    if (this.globalRect == null) {
                        this.globalRect = new Rect();
                    }
                    this.globalRect.set(Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                    this.globalGeometryDirty = false;
                }
                int i = -1;
                for (SemanticsNode next : this.childrenInTraversalOrder) {
                    next.previousNodeId = i;
                    i = next.f70251id;
                    next.updateRecursively(this.globalTransform, set, z);
                }
            }
        }

        /* access modifiers changed from: private */
        public void updateWith(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.hadPreviousConfig = true;
            this.previousValue = this.value;
            this.previousLabel = this.label;
            this.previousFlags = this.flags;
            this.previousActions = this.actions;
            this.previousTextSelectionBase = this.textSelectionBase;
            this.previousTextSelectionExtent = this.textSelectionExtent;
            this.previousScrollPosition = this.scrollPosition;
            this.previousScrollExtentMax = this.scrollExtentMax;
            this.previousScrollExtentMin = this.scrollExtentMin;
            this.flags = byteBuffer.getInt();
            this.actions = byteBuffer.getInt();
            this.maxValueLength = byteBuffer.getInt();
            this.currentValueLength = byteBuffer.getInt();
            this.textSelectionBase = byteBuffer.getInt();
            this.textSelectionExtent = byteBuffer.getInt();
            this.platformViewId = byteBuffer.getInt();
            this.scrollChildren = byteBuffer.getInt();
            this.scrollIndex = byteBuffer.getInt();
            this.scrollPosition = byteBuffer.getFloat();
            this.scrollExtentMax = byteBuffer.getFloat();
            this.scrollExtentMin = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            this.label = i == -1 ? null : strArr[i];
            this.labelAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i2 = byteBuffer.getInt();
            this.value = i2 == -1 ? null : strArr[i2];
            this.valueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i3 = byteBuffer.getInt();
            this.increasedValue = i3 == -1 ? null : strArr[i3];
            this.increasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            this.decreasedValue = i4 == -1 ? null : strArr[i4];
            this.decreasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.hint = i5 == -1 ? null : strArr[i5];
            this.hintAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.tooltip = i6 == -1 ? null : strArr[i6];
            this.textDirection = TextDirection.fromInt(byteBuffer.getInt());
            this.left = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.right = byteBuffer.getFloat();
            this.bottom = byteBuffer.getFloat();
            if (this.transform == null) {
                this.transform = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                this.transform[i7] = byteBuffer.getFloat();
            }
            this.inverseTransformDirty = true;
            this.globalGeometryDirty = true;
            int i8 = byteBuffer.getInt();
            this.childrenInTraversalOrder.clear();
            this.childrenInHitTestOrder.clear();
            for (int i9 = 0; i9 < i8; i9++) {
                SemanticsNode access$6600 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                access$6600.parent = this;
                this.childrenInTraversalOrder.add(access$6600);
            }
            for (int i15 = 0; i15 < i8; i15++) {
                SemanticsNode access$66002 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                access$66002.parent = this;
                this.childrenInHitTestOrder.add(access$66002);
            }
            int i16 = byteBuffer.getInt();
            if (i16 == 0) {
                this.customAccessibilityActions = null;
                return;
            }
            List<CustomAccessibilityAction> list = this.customAccessibilityActions;
            if (list == null) {
                this.customAccessibilityActions = new ArrayList(i16);
            } else {
                list.clear();
            }
            for (int i17 = 0; i17 < i16; i17++) {
                CustomAccessibilityAction access$6700 = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                if (access$6700.overrideId == Action.TAP.value) {
                    this.onTapOverride = access$6700;
                } else if (access$6700.overrideId == Action.LONG_PRESS.value) {
                    this.onLongPressOverride = access$6700;
                } else {
                    this.customAccessibilityActions.add(access$6700);
                }
                this.customAccessibilityActions.add(access$6700);
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$SpellOutStringAttribute */
    public static class SpellOutStringAttribute extends StringAttribute {
        private SpellOutStringAttribute() {
            super();
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$StringAttribute */
    public static class StringAttribute {
        public int end;
        public int start;
        public StringAttributeType type;

        private StringAttribute() {
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$StringAttributeType */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$TextDirection */
    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i) {
            return i != 1 ? i != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$OnAccessibilityChangeListener */
    public interface OnAccessibilityChangeListener {
        void onAccessibilityChanged(boolean z, boolean z2);
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel2, AccessibilityManager accessibilityManager2, ContentResolver contentResolver2, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate2) {
        this(view, accessibilityChannel2, accessibilityManager2, contentResolver2, new AccessibilityViewEmbedder(view, 65536), platformViewsAccessibilityDelegate2);
    }

    public static /* synthetic */ int access$1172(AccessibilityBridge accessibilityBridge, int i) {
        int i2 = i & accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i2;
        return i2;
    }

    public static /* synthetic */ int access$1176(AccessibilityBridge accessibilityBridge, int i) {
        int i2 = i | accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i2;
        return i2;
    }

    private AccessibilityEvent createTextChangedEvent(int i, String str, String str2) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i, 16);
        obtainAccessibilityEvent.setBeforeText(str);
        obtainAccessibilityEvent.getText().add(str2);
        int i2 = 0;
        while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
            i2++;
        }
        if (i2 >= str.length() && i2 >= str2.length()) {
            return null;
        }
        obtainAccessibilityEvent.setFromIndex(i2);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        obtainAccessibilityEvent.setRemovedCount((length - i2) + 1);
        obtainAccessibilityEvent.setAddedCount((length2 - i2) + 1);
        return obtainAccessibilityEvent;
    }

    private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
        Activity activity = ViewUtils.getActivity(this.rootAccessibilityView.getContext());
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        int i = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i == 2 || i == 0;
    }

    private Rect getBoundsInScreen(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.rootAccessibilityView.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* access modifiers changed from: private */
    public CustomAccessibilityAction getOrCreateAccessibilityAction(int i) {
        CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i));
        if (customAccessibilityAction != null) {
            return customAccessibilityAction;
        }
        CustomAccessibilityAction customAccessibilityAction2 = new CustomAccessibilityAction();
        int unused = customAccessibilityAction2.f70250id = i;
        int unused2 = customAccessibilityAction2.resourceId = FIRST_RESOURCE_ID + i;
        this.customAccessibilityActions.put(Integer.valueOf(i), customAccessibilityAction2);
        return customAccessibilityAction2;
    }

    /* access modifiers changed from: private */
    public SemanticsNode getOrCreateSemanticsNode(int i) {
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i));
        if (semanticsNode != null) {
            return semanticsNode;
        }
        SemanticsNode semanticsNode2 = new SemanticsNode(this);
        int unused = semanticsNode2.f70251id = i;
        this.flutterSemanticsTree.put(Integer.valueOf(i), semanticsNode2);
        return semanticsNode2;
    }

    private SemanticsNode getRootSemanticsNode() {
        return this.flutterSemanticsTree.get(0);
    }

    private void handleTouchExploration(float f, float f2) {
        SemanticsNode access$4300;
        if (!this.flutterSemanticsTree.isEmpty() && (access$4300 = getRootSemanticsNode().hitTest(new float[]{f, f2, 0.0f, 1.0f})) != this.hoveredObject) {
            if (access$4300 != null) {
                sendAccessibilityEvent(access$4300.f70251id, 128);
            }
            SemanticsNode semanticsNode = this.hoveredObject;
            if (semanticsNode != null) {
                sendAccessibilityEvent(semanticsNode.f70251id, 256);
            }
            this.hoveredObject = access$4300;
        }
    }

    /* access modifiers changed from: private */
    public AccessibilityEvent obtainAccessibilityEvent(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        return obtain;
    }

    /* access modifiers changed from: private */
    public void onTouchExplorationExit() {
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f70251id, 256);
            this.hoveredObject = null;
        }
    }

    private void onWindowNameChange(SemanticsNode semanticsNode) {
        String access$6400 = semanticsNode.getRouteName();
        if (access$6400 == null) {
            access$6400 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            setAccessibilityPaneTitle(access$6400);
            return;
        }
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f70251id, 32);
        obtainAccessibilityEvent.getText().add(access$6400);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    private boolean performCursorMoveAction(SemanticsNode semanticsNode, int i, Bundle bundle, boolean z) {
        int i2 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int access$1800 = semanticsNode.textSelectionBase;
        int access$1900 = semanticsNode.textSelectionExtent;
        predictCursorMovement(semanticsNode, i2, z, z2);
        if (!(access$1800 == semanticsNode.textSelectionBase && access$1900 == semanticsNode.textSelectionExtent)) {
            String access$2200 = semanticsNode.value != null ? semanticsNode.value : "";
            AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f70251id, 8192);
            obtainAccessibilityEvent.getText().add(access$2200);
            obtainAccessibilityEvent.setFromIndex(semanticsNode.textSelectionBase);
            obtainAccessibilityEvent.setToIndex(semanticsNode.textSelectionExtent);
            obtainAccessibilityEvent.setItemCount(access$2200.length());
            sendAccessibilityEvent(obtainAccessibilityEvent);
        }
        if (i2 == 1) {
            if (z) {
                Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i, action, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!semanticsNode.hasAction(action2)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i, action2, Boolean.valueOf(z2));
            return true;
        } else if (i2 != 2) {
            return i2 == 4 || i2 == 8 || i2 == 16;
        } else {
            if (z) {
                Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
                if (semanticsNode.hasAction(action3)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i, action3, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!semanticsNode.hasAction(action4)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i, action4, Boolean.valueOf(z2));
            return true;
        }
    }

    private boolean performSetText(SemanticsNode semanticsNode, int i, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.accessibilityChannel.dispatchSemanticsAction(i, Action.SET_TEXT, string);
        String unused = semanticsNode.value = string;
        return true;
    }

    private void predictCursorMovement(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        if (semanticsNode.textSelectionExtent >= 0 && semanticsNode.textSelectionBase >= 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 8 || i == 16) {
                            if (z) {
                                int unused = semanticsNode.textSelectionExtent = semanticsNode.value.length();
                            } else {
                                int unused2 = semanticsNode.textSelectionExtent = 0;
                            }
                        }
                    } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                        if (matcher.find()) {
                            SemanticsNode.access$1912(semanticsNode, matcher.start(1));
                        } else {
                            int unused3 = semanticsNode.textSelectionExtent = semanticsNode.value.length();
                        }
                    } else if (!z && semanticsNode.textSelectionExtent > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                        if (matcher2.find()) {
                            int unused4 = semanticsNode.textSelectionExtent = matcher2.start(1);
                        } else {
                            int unused5 = semanticsNode.textSelectionExtent = 0;
                        }
                    }
                } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                    matcher3.find();
                    if (matcher3.find()) {
                        SemanticsNode.access$1912(semanticsNode, matcher3.start(1));
                    } else {
                        int unused6 = semanticsNode.textSelectionExtent = semanticsNode.value.length();
                    }
                } else if (!z && semanticsNode.textSelectionExtent > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                    if (matcher4.find()) {
                        int unused7 = semanticsNode.textSelectionExtent = matcher4.start(1);
                    }
                }
            } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                SemanticsNode.access$1912(semanticsNode, 1);
            } else if (!z && semanticsNode.textSelectionExtent > 0) {
                SemanticsNode.access$1920(semanticsNode, 1);
            }
            if (!z2) {
                int unused8 = semanticsNode.textSelectionBase = semanticsNode.textSelectionExtent;
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendAccessibilityEvent(int i, int i2) {
        if (this.accessibilityManager.isEnabled()) {
            sendAccessibilityEvent(obtainAccessibilityEvent(i, i2));
        }
    }

    /* access modifiers changed from: private */
    public void sendLatestAccessibilityFlagsToFlutter() {
        this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowContentChangeEvent(int i) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i, 2048);
        obtainAccessibilityEvent.setContentChangeTypes(1);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    private void setAccessibilityPaneTitle(String str) {
        this.rootAccessibilityView.setAccessibilityPaneTitle(str);
    }

    private boolean shouldSetCollectionInfo(final SemanticsNode semanticsNode) {
        return semanticsNode.scrollChildren > 0 && (SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new Predicate<SemanticsNode>() {
            public boolean test(SemanticsNode semanticsNode) {
                return semanticsNode == semanticsNode;
            }
        }) || !SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new Predicate<SemanticsNode>() {
            public boolean test(SemanticsNode semanticsNode) {
                return semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING);
            }
        }));
    }

    private void willRemoveSemanticsNode(SemanticsNode semanticsNode) {
        View platformViewById;
        Integer num;
        SemanticsNode unused = semanticsNode.parent = null;
        if (!(semanticsNode.platformViewId == -1 || (num = this.embeddedAccessibilityFocusedNodeId) == null || this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) != this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId))) {
            sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), 65536);
            this.embeddedAccessibilityFocusedNodeId = null;
        }
        if (!(semanticsNode.platformViewId == -1 || (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) == null)) {
            platformViewById.setImportantForAccessibility(4);
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 == semanticsNode) {
            sendAccessibilityEvent(semanticsNode2.f70251id, 65536);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == semanticsNode) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == semanticsNode) {
            this.hoveredObject = null;
        }
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        int i2;
        if (i >= 65536) {
            return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(i);
        }
        boolean z = false;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView);
            this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(obtain);
            if (this.flutterSemanticsTree.containsKey(0)) {
                obtain.addChild(this.rootAccessibilityView, 0);
            }
            return obtain;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i));
        if (semanticsNode == null) {
            return null;
        }
        AccessibilityNodeInfo obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(this.rootAccessibilityView, i);
        int i3 = Build.VERSION.SDK_INT;
        String str = "";
        obtainAccessibilityNodeInfo.setViewIdResourceName(str);
        obtainAccessibilityNodeInfo.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityNodeInfo.setClassName("android.view.View");
        obtainAccessibilityNodeInfo.setSource(this.rootAccessibilityView, i);
        obtainAccessibilityNodeInfo.setFocusable(semanticsNode.isFocusable());
        SemanticsNode semanticsNode2 = this.inputFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            obtainAccessibilityNodeInfo.setFocused(semanticsNode2.f70251id == i);
        }
        SemanticsNode semanticsNode3 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode3 != null) {
            obtainAccessibilityNodeInfo.setAccessibilityFocused(semanticsNode3.f70251id == i);
        }
        Flag flag = Flag.IS_TEXT_FIELD;
        if (semanticsNode.hasFlag(flag)) {
            obtainAccessibilityNodeInfo.setPassword(semanticsNode.hasFlag(Flag.IS_OBSCURED));
            Flag flag2 = Flag.IS_READ_ONLY;
            if (!semanticsNode.hasFlag(flag2)) {
                obtainAccessibilityNodeInfo.setClassName("android.widget.EditText");
            }
            obtainAccessibilityNodeInfo.setEditable(!semanticsNode.hasFlag(flag2));
            if (!(semanticsNode.textSelectionBase == -1 || semanticsNode.textSelectionExtent == -1)) {
                obtainAccessibilityNodeInfo.setTextSelection(semanticsNode.textSelectionBase, semanticsNode.textSelectionExtent);
            }
            SemanticsNode semanticsNode4 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode4 != null && semanticsNode4.f70251id == i) {
                obtainAccessibilityNodeInfo.setLiveRegion(1);
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtainAccessibilityNodeInfo.addAction(256);
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtainAccessibilityNodeInfo.addAction(512);
                i2 |= 1;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtainAccessibilityNodeInfo.addAction(256);
                i2 |= 2;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtainAccessibilityNodeInfo.addAction(512);
                i2 |= 2;
            }
            obtainAccessibilityNodeInfo.setMovementGranularities(i2);
            if (semanticsNode.maxValueLength >= 0) {
                int length = semanticsNode.value == null ? 0 : semanticsNode.value.length();
                int unused = semanticsNode.currentValueLength;
                int unused2 = semanticsNode.maxValueLength;
                obtainAccessibilityNodeInfo.setMaxTextLength((length - semanticsNode.currentValueLength) + semanticsNode.maxValueLength);
            }
        }
        if (semanticsNode.hasAction(Action.SET_SELECTION)) {
            obtainAccessibilityNodeInfo.addAction(131072);
        }
        if (semanticsNode.hasAction(Action.COPY)) {
            obtainAccessibilityNodeInfo.addAction(16384);
        }
        if (semanticsNode.hasAction(Action.CUT)) {
            obtainAccessibilityNodeInfo.addAction(65536);
        }
        if (semanticsNode.hasAction(Action.PASTE)) {
            obtainAccessibilityNodeInfo.addAction(32768);
        }
        if (semanticsNode.hasAction(Action.SET_TEXT)) {
            obtainAccessibilityNodeInfo.addAction(2097152);
        }
        if (semanticsNode.hasFlag(Flag.IS_BUTTON) || semanticsNode.hasFlag(Flag.IS_LINK)) {
            obtainAccessibilityNodeInfo.setClassName(TypeModifier.BUTTON_CLASS);
        }
        if (semanticsNode.hasFlag(Flag.IS_IMAGE)) {
            obtainAccessibilityNodeInfo.setClassName("android.widget.ImageView");
        }
        if (semanticsNode.hasAction(Action.DISMISS)) {
            obtainAccessibilityNodeInfo.setDismissable(true);
            obtainAccessibilityNodeInfo.addAction(1048576);
        }
        if (semanticsNode.parent != null) {
            obtainAccessibilityNodeInfo.setParent(this.rootAccessibilityView, semanticsNode.parent.f70251id);
        } else {
            obtainAccessibilityNodeInfo.setParent(this.rootAccessibilityView);
        }
        if (semanticsNode.previousNodeId != -1 && i3 >= 22) {
            obtainAccessibilityNodeInfo.setTraversalAfter(this.rootAccessibilityView, semanticsNode.previousNodeId);
        }
        Rect access$2600 = semanticsNode.getGlobalRect();
        if (semanticsNode.parent != null) {
            Rect access$26002 = semanticsNode.parent.getGlobalRect();
            Rect rect = new Rect(access$2600);
            rect.offset(-access$26002.left, -access$26002.top);
            obtainAccessibilityNodeInfo.setBoundsInParent(rect);
        } else {
            obtainAccessibilityNodeInfo.setBoundsInParent(access$2600);
        }
        obtainAccessibilityNodeInfo.setBoundsInScreen(getBoundsInScreen(access$2600));
        obtainAccessibilityNodeInfo.setVisibleToUser(true);
        obtainAccessibilityNodeInfo.setEnabled(!semanticsNode.hasFlag(Flag.HAS_ENABLED_STATE) || semanticsNode.hasFlag(Flag.IS_ENABLED));
        if (semanticsNode.hasAction(Action.TAP)) {
            if (semanticsNode.onTapOverride != null) {
                obtainAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, semanticsNode.onTapOverride.hint));
                obtainAccessibilityNodeInfo.setClickable(true);
            } else {
                obtainAccessibilityNodeInfo.addAction(16);
                obtainAccessibilityNodeInfo.setClickable(true);
            }
        }
        if (semanticsNode.hasAction(Action.LONG_PRESS)) {
            if (semanticsNode.onLongPressOverride != null) {
                obtainAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, semanticsNode.onLongPressOverride.hint));
                obtainAccessibilityNodeInfo.setLongClickable(true);
            } else {
                obtainAccessibilityNodeInfo.addAction(32);
                obtainAccessibilityNodeInfo.setLongClickable(true);
            }
        }
        Action action = Action.SCROLL_LEFT;
        if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP) || semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
            obtainAccessibilityNodeInfo.setScrollable(true);
            if (semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING)) {
                if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_RIGHT)) {
                    if (shouldSetCollectionInfo(semanticsNode)) {
                        obtainAccessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, semanticsNode.scrollChildren, false));
                    } else {
                        obtainAccessibilityNodeInfo.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (shouldSetCollectionInfo(semanticsNode)) {
                    obtainAccessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(semanticsNode.scrollChildren, 0, false));
                } else {
                    obtainAccessibilityNodeInfo.setClassName("android.widget.ScrollView");
                }
            }
            if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP)) {
                obtainAccessibilityNodeInfo.addAction(4096);
            }
            if (semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
                obtainAccessibilityNodeInfo.addAction(8192);
            }
        }
        Action action2 = Action.INCREASE;
        if (semanticsNode.hasAction(action2) || semanticsNode.hasAction(Action.DECREASE)) {
            obtainAccessibilityNodeInfo.setClassName("android.widget.SeekBar");
            if (semanticsNode.hasAction(action2)) {
                obtainAccessibilityNodeInfo.addAction(4096);
            }
            if (semanticsNode.hasAction(Action.DECREASE)) {
                obtainAccessibilityNodeInfo.addAction(8192);
            }
        }
        if (semanticsNode.hasFlag(Flag.IS_LIVE_REGION)) {
            obtainAccessibilityNodeInfo.setLiveRegion(1);
        }
        if (semanticsNode.hasFlag(flag)) {
            obtainAccessibilityNodeInfo.setText(semanticsNode.getValueLabelHint());
        } else if (!semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
            CharSequence access$3000 = semanticsNode.getValueLabelHint();
            String str2 = access$3000;
            if (i3 < 28) {
                str2 = access$3000;
                if (semanticsNode.tooltip != null) {
                    if (access$3000 != null) {
                        str = access$3000;
                    }
                    str2 = str + "\n" + semanticsNode.tooltip;
                }
            }
            if (str2 != null) {
                obtainAccessibilityNodeInfo.setContentDescription(str2);
            }
        }
        if (i3 >= 28 && semanticsNode.tooltip != null) {
            obtainAccessibilityNodeInfo.setTooltipText(semanticsNode.tooltip);
        }
        boolean access$1600 = semanticsNode.hasFlag(Flag.HAS_CHECKED_STATE);
        boolean access$16002 = semanticsNode.hasFlag(Flag.HAS_TOGGLED_STATE);
        if (access$1600 || access$16002) {
            z = true;
        }
        obtainAccessibilityNodeInfo.setCheckable(z);
        if (access$1600) {
            obtainAccessibilityNodeInfo.setChecked(semanticsNode.hasFlag(Flag.IS_CHECKED));
            if (semanticsNode.hasFlag(Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                obtainAccessibilityNodeInfo.setClassName("android.widget.RadioButton");
            } else {
                obtainAccessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else if (access$16002) {
            obtainAccessibilityNodeInfo.setChecked(semanticsNode.hasFlag(Flag.IS_TOGGLED));
            obtainAccessibilityNodeInfo.setClassName("android.widget.Switch");
        }
        obtainAccessibilityNodeInfo.setSelected(semanticsNode.hasFlag(Flag.IS_SELECTED));
        if (i3 >= 28) {
            obtainAccessibilityNodeInfo.setHeading(semanticsNode.hasFlag(Flag.IS_HEADER));
        }
        SemanticsNode semanticsNode5 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode5 == null || semanticsNode5.f70251id != i) {
            obtainAccessibilityNodeInfo.addAction(64);
        } else {
            obtainAccessibilityNodeInfo.addAction(128);
        }
        if (semanticsNode.customAccessibilityActions != null) {
            for (CustomAccessibilityAction customAccessibilityAction : semanticsNode.customAccessibilityActions) {
                obtainAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(customAccessibilityAction.resourceId, customAccessibilityAction.label));
            }
        }
        for (SemanticsNode semanticsNode6 : semanticsNode.childrenInTraversalOrder) {
            if (!semanticsNode6.hasFlag(Flag.IS_HIDDEN)) {
                if (semanticsNode6.platformViewId != -1) {
                    obtainAccessibilityNodeInfo.addChild(this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode6.platformViewId));
                } else {
                    obtainAccessibilityNodeInfo.addChild(this.rootAccessibilityView, semanticsNode6.f70251id);
                }
            }
        }
        return obtainAccessibilityNodeInfo;
    }

    public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.embeddedInputFocusedNodeId = recordFlutterId;
            this.inputFocusedSemanticsNode = null;
            return true;
        } else if (eventType == 128) {
            this.hoveredObject = null;
            return true;
        } else if (eventType == 32768) {
            this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
            this.accessibilityFocusedSemanticsNode = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.embeddedInputFocusedNodeId = null;
            this.embeddedAccessibilityFocusedNodeId = null;
            return true;
        }
    }

    public AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            SemanticsNode semanticsNode = this.inputFocusedSemanticsNode;
            if (semanticsNode != null) {
                return createAccessibilityNodeInfo(semanticsNode.f70251id);
            }
            Integer num = this.embeddedInputFocusedNodeId;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i != 2) {
            return null;
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            return createAccessibilityNodeInfo(semanticsNode2.f70251id);
        }
        Integer num2 = this.embeddedAccessibilityFocusedNodeId;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public int getHoveredObjectId() {
        return this.hoveredObject.f70251id;
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view, int i) {
        return AccessibilityNodeInfo.obtain(view, i);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
        if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        SemanticsNode access$4300 = getRootSemanticsNode().hitTest(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (access$4300 != null && access$4300.platformViewId != -1) {
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(access$4300.f70251id, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            handleTouchExploration(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 10) {
            onTouchExplorationExit();
        } else {
            Log.m165284d("flutter", "unexpected accessibility hover event: " + motionEvent);
            return false;
        }
        return true;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i >= 65536) {
            boolean performAction = this.accessibilityViewEmbedder.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return performAction;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i));
        boolean z = false;
        if (semanticsNode == null) {
            return false;
        }
        switch (i2) {
            case 16:
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.TAP);
                return true;
            case 32:
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.LONG_PRESS);
                return true;
            case 64:
                if (this.accessibilityFocusedSemanticsNode == null) {
                    this.rootAccessibilityView.invalidate();
                }
                this.accessibilityFocusedSemanticsNode = semanticsNode;
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i, 32768);
                if (semanticsNode.hasAction(Action.INCREASE) || semanticsNode.hasAction(Action.DECREASE)) {
                    sendAccessibilityEvent(i, 4);
                }
                return true;
            case 128:
                SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
                if (semanticsNode2 != null && semanticsNode2.f70251id == i) {
                    this.accessibilityFocusedSemanticsNode = null;
                }
                Integer num = this.embeddedAccessibilityFocusedNodeId;
                if (num != null && num.intValue() == i) {
                    this.embeddedAccessibilityFocusedNodeId = null;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i, 65536);
                return true;
            case 256:
                return performCursorMoveAction(semanticsNode, i, bundle, true);
            case 512:
                return performCursorMoveAction(semanticsNode, i, bundle, false);
            case 4096:
                Action action = Action.SCROLL_UP;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i, action);
                } else {
                    Action action2 = Action.SCROLL_LEFT;
                    if (semanticsNode.hasAction(action2)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i, action2);
                    } else {
                        Action action3 = Action.INCREASE;
                        if (!semanticsNode.hasAction(action3)) {
                            return false;
                        }
                        String unused = semanticsNode.value = semanticsNode.increasedValue;
                        List unused2 = semanticsNode.valueAttributes = semanticsNode.increasedValueAttributes;
                        sendAccessibilityEvent(i, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i, action3);
                    }
                }
                return true;
            case 8192:
                Action action4 = Action.SCROLL_DOWN;
                if (semanticsNode.hasAction(action4)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i, action4);
                } else {
                    Action action5 = Action.SCROLL_RIGHT;
                    if (semanticsNode.hasAction(action5)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i, action5);
                    } else {
                        Action action6 = Action.DECREASE;
                        if (!semanticsNode.hasAction(action6)) {
                            return false;
                        }
                        String unused3 = semanticsNode.value = semanticsNode.decreasedValue;
                        List unused4 = semanticsNode.valueAttributes = semanticsNode.decreasedValueAttributes;
                        sendAccessibilityEvent(i, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i, action6);
                    }
                }
                return true;
            case 16384:
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.COPY);
                return true;
            case 32768:
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.PASTE);
                return true;
            case 65536:
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.CUT);
                return true;
            case 131072:
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z = true;
                }
                if (z) {
                    hashMap.put(LiteAppCenter.FRAMEWORK_TYPE_BASE, Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap.put(LiteAppCenter.FRAMEWORK_TYPE_BASE, Integer.valueOf(semanticsNode.textSelectionExtent));
                    hashMap.put("extent", Integer.valueOf(semanticsNode.textSelectionExtent));
                }
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.SET_SELECTION, hashMap);
                SemanticsNode semanticsNode3 = this.flutterSemanticsTree.get(Integer.valueOf(i));
                int unused5 = semanticsNode3.textSelectionBase = ((Integer) hashMap.get(LiteAppCenter.FRAMEWORK_TYPE_BASE)).intValue();
                int unused6 = semanticsNode3.textSelectionExtent = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.DISMISS);
                return true;
            case 2097152:
                return performSetText(semanticsNode, i, bundle);
            case ACTION_SHOW_ON_SCREEN /*16908342*/:
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.SHOW_ON_SCREEN);
                return true;
            default:
                CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i2 - FIRST_RESOURCE_ID));
                if (customAccessibilityAction == null) {
                    return false;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i, Action.CUSTOM_ACTION, Integer.valueOf(customAccessibilityAction.f70250id));
                return true;
        }
    }

    public void release() {
        this.isReleased = true;
        this.platformViewsAccessibilityDelegate.detachAccessibilityBridge();
        setOnAccessibilityChangeListener((OnAccessibilityChangeListener) null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.accessibilityChannel.setAccessibilityMessageHandler((AccessibilityChannel.AccessibilityMessageHandler) null);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f70251id, 65536);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        sendWindowContentChangeEvent(0);
    }

    public void setOnAccessibilityChangeListener(OnAccessibilityChangeListener onAccessibilityChangeListener2) {
        this.onAccessibilityChangeListener = onAccessibilityChangeListener2;
    }

    public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            CustomAccessibilityAction orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
            int unused = orCreateAccessibilityAction.overrideId = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str = null;
            String unused2 = orCreateAccessibilityAction.label = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            if (i2 != -1) {
                str = strArr[i2];
            }
            String unused3 = orCreateAccessibilityAction.hint = str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.AccessibilityBridge$SemanticsNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateSemantics(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x004a
            int r1 = r9.getInt()
            io.flutter.view.AccessibilityBridge$SemanticsNode r1 = r8.getOrCreateSemanticsNode(r1)
            r1.updateWith(r9, r10, r11)
            io.flutter.view.AccessibilityBridge$Flag r3 = p172io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN
            boolean r3 = r1.hasFlag(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.AccessibilityBridge$Flag r3 = p172io.flutter.view.AccessibilityBridge.Flag.IS_FOCUSED
            boolean r3 = r1.hasFlag(r3)
            if (r3 == 0) goto L_0x002a
            r8.inputFocusedSemanticsNode = r1
        L_0x002a:
            boolean r3 = r1.hadPreviousConfig
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.platformViewId
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate r3 = r8.platformViewsAccessibilityDelegate
            int r1 = r1.platformViewId
            android.view.View r1 = r3.getPlatformViewById(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x004a:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.AccessibilityBridge$SemanticsNode r10 = r8.getRootSemanticsNode()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00ab
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00a5
            r5 = 28
            if (r4 < r5) goto L_0x0071
            boolean r4 = r8.doesLayoutInDisplayCutoutModeRequireLeftInset()
            goto L_0x0072
        L_0x0071:
            r4 = 1
        L_0x0072:
            if (r4 == 0) goto L_0x00a5
            android.view.View r4 = r8.rootAccessibilityView
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00a5
            java.lang.Integer r5 = r8.lastLeftFrameInset
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0092
            boolean unused = r10.globalGeometryDirty = r1
            boolean unused = r10.inverseTransformDirty = r1
        L_0x0092:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.lastLeftFrameInset = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00a5:
            r10.updateRecursively(r3, r9, r2)
            r10.collectRoutes(r11)
        L_0x00ab:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00b1:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r10.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r5 = (p172io.flutter.view.AccessibilityBridge.SemanticsNode) r5
            java.util.List<java.lang.Integer> r6 = r8.flutterNavigationStack
            int r7 = r5.f70251id
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00b1
            r4 = r5
            goto L_0x00b1
        L_0x00cf:
            if (r4 != 0) goto L_0x00e3
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00e3
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.AccessibilityBridge$SemanticsNode r4 = (p172io.flutter.view.AccessibilityBridge.SemanticsNode) r4
        L_0x00e3:
            if (r4 == 0) goto L_0x0102
            int r10 = r4.f70251id
            int r5 = r8.previousRouteId
            if (r10 != r5) goto L_0x00f9
            int r10 = r11.size()
            java.util.List<java.lang.Integer> r5 = r8.flutterNavigationStack
            int r5 = r5.size()
            if (r10 == r5) goto L_0x0102
        L_0x00f9:
            int r10 = r4.f70251id
            r8.previousRouteId = r10
            r8.onWindowNameChange(r4)
        L_0x0102:
            java.util.List<java.lang.Integer> r10 = r8.flutterNavigationStack
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x010b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0125
            java.lang.Object r11 = r10.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = (p172io.flutter.view.AccessibilityBridge.SemanticsNode) r11
            java.util.List<java.lang.Integer> r4 = r8.flutterNavigationStack
            int r11 = r11.f70251id
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x010b
        L_0x0125:
            java.util.Map<java.lang.Integer, io.flutter.view.AccessibilityBridge$SemanticsNode> r10 = r8.flutterSemanticsTree
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x012f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x014e
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = (p172io.flutter.view.AccessibilityBridge.SemanticsNode) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x012f
            r8.willRemoveSemanticsNode(r11)
            r10.remove()
            goto L_0x012f
        L_0x014e:
            r8.sendWindowContentChangeEvent(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0155:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0334
            java.lang.Object r10 = r9.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r10 = (p172io.flutter.view.AccessibilityBridge.SemanticsNode) r10
            boolean r11 = r10.didScroll()
            if (r11 == 0) goto L_0x0226
            int r11 = r10.f70251id
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r0)
            float r0 = r10.scrollPosition
            float r4 = r10.scrollExtentMax
            float r5 = r10.scrollExtentMax
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1200142336(0x4788b800, float:70000.0)
            r7 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x0193
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0190
            r0 = 1200142336(0x4788b800, float:70000.0)
        L_0x0190:
            r4 = 1203982336(0x47c35000, float:100000.0)
        L_0x0193:
            float r5 = r10.scrollExtentMin
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01aa
            float r4 = r4 + r7
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x01a8
            r0 = -947341312(0xffffffffc788b800, float:-70000.0)
        L_0x01a8:
            float r0 = r0 + r7
            goto L_0x01b4
        L_0x01aa:
            float r5 = r10.scrollExtentMin
            float r4 = r4 - r5
            float r5 = r10.scrollExtentMin
            float r0 = r0 - r5
        L_0x01b4:
            io.flutter.view.AccessibilityBridge$Action r5 = p172io.flutter.view.AccessibilityBridge.Action.SCROLL_UP
            boolean r5 = r10.hadAction(r5)
            if (r5 != 0) goto L_0x01de
            io.flutter.view.AccessibilityBridge$Action r5 = p172io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN
            boolean r5 = r10.hadAction(r5)
            if (r5 == 0) goto L_0x01c5
            goto L_0x01de
        L_0x01c5:
            io.flutter.view.AccessibilityBridge$Action r5 = p172io.flutter.view.AccessibilityBridge.Action.SCROLL_LEFT
            boolean r5 = r10.hadAction(r5)
            if (r5 != 0) goto L_0x01d5
            io.flutter.view.AccessibilityBridge$Action r5 = p172io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT
            boolean r5 = r10.hadAction(r5)
            if (r5 == 0) goto L_0x01e6
        L_0x01d5:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01e6
        L_0x01de:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01e6:
            int r0 = r10.scrollChildren
            if (r0 <= 0) goto L_0x0223
            int r0 = r10.scrollChildren
            r11.setItemCount(r0)
            int r0 = r10.scrollIndex
            r11.setFromIndex(r0)
            java.util.List r0 = r10.childrenInHitTestOrder
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x0203:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x021a
            java.lang.Object r5 = r0.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r5 = (p172io.flutter.view.AccessibilityBridge.SemanticsNode) r5
            io.flutter.view.AccessibilityBridge$Flag r6 = p172io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN
            boolean r5 = r5.hasFlag(r6)
            if (r5 != 0) goto L_0x0203
            int r4 = r4 + 1
            goto L_0x0203
        L_0x021a:
            int r0 = r10.scrollIndex
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x0223:
            r8.sendAccessibilityEvent(r11)
        L_0x0226:
            io.flutter.view.AccessibilityBridge$Flag r11 = p172io.flutter.view.AccessibilityBridge.Flag.IS_LIVE_REGION
            boolean r11 = r10.hasFlag(r11)
            if (r11 == 0) goto L_0x023b
            boolean r11 = r10.didChangeLabel()
            if (r11 == 0) goto L_0x023b
            int r11 = r10.f70251id
            r8.sendWindowContentChangeEvent(r11)
        L_0x023b:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.accessibilityFocusedSemanticsNode
            if (r11 == 0) goto L_0x026e
            int r11 = r11.f70251id
            int r0 = r10.f70251id
            if (r11 != r0) goto L_0x026e
            io.flutter.view.AccessibilityBridge$Flag r11 = p172io.flutter.view.AccessibilityBridge.Flag.IS_SELECTED
            boolean r0 = r10.hadFlag(r11)
            if (r0 != 0) goto L_0x026e
            boolean r11 = r10.hasFlag(r11)
            if (r11 == 0) goto L_0x026e
            int r11 = r10.f70251id
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.label
            r0.add(r4)
            r8.sendAccessibilityEvent(r11)
        L_0x026e:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            if (r11 == 0) goto L_0x029e
            int r11 = r11.f70251id
            int r0 = r10.f70251id
            if (r11 != r0) goto L_0x029e
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.lastInputFocusedSemanticsNode
            if (r11 == 0) goto L_0x028c
            int r11 = r11.f70251id
            io.flutter.view.AccessibilityBridge$SemanticsNode r0 = r8.inputFocusedSemanticsNode
            int r0 = r0.f70251id
            if (r11 == r0) goto L_0x029e
        L_0x028c:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            r8.lastInputFocusedSemanticsNode = r11
            int r11 = r10.f70251id
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r0)
            r8.sendAccessibilityEvent(r11)
            goto L_0x02a4
        L_0x029e:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            if (r11 != 0) goto L_0x02a4
            r8.lastInputFocusedSemanticsNode = r3
        L_0x02a4:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            if (r11 == 0) goto L_0x0155
            int r11 = r11.f70251id
            int r0 = r10.f70251id
            if (r11 != r0) goto L_0x0155
            io.flutter.view.AccessibilityBridge$Flag r11 = p172io.flutter.view.AccessibilityBridge.Flag.IS_TEXT_FIELD
            boolean r0 = r10.hadFlag(r11)
            if (r0 == 0) goto L_0x0155
            boolean r11 = r10.hasFlag(r11)
            if (r11 == 0) goto L_0x0155
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.accessibilityFocusedSemanticsNode
            if (r11 == 0) goto L_0x02d0
            int r11 = r11.f70251id
            io.flutter.view.AccessibilityBridge$SemanticsNode r0 = r8.inputFocusedSemanticsNode
            int r0 = r0.f70251id
            if (r11 != r0) goto L_0x0155
        L_0x02d0:
            java.lang.String r11 = r10.previousValue
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02dd
            java.lang.String r11 = r10.previousValue
            goto L_0x02de
        L_0x02dd:
            r11 = r0
        L_0x02de:
            java.lang.String r4 = r10.value
            if (r4 == 0) goto L_0x02e8
            java.lang.String r0 = r10.value
        L_0x02e8:
            int r4 = r10.f70251id
            android.view.accessibility.AccessibilityEvent r11 = r8.createTextChangedEvent(r4, r11, r0)
            if (r11 == 0) goto L_0x02f5
            r8.sendAccessibilityEvent(r11)
        L_0x02f5:
            int r11 = r10.previousTextSelectionBase
            int r4 = r10.textSelectionBase
            if (r11 != r4) goto L_0x0309
            int r11 = r10.previousTextSelectionExtent
            int r4 = r10.textSelectionExtent
            if (r11 == r4) goto L_0x0155
        L_0x0309:
            int r11 = r10.f70251id
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.textSelectionBase
            r11.setFromIndex(r4)
            int r10 = r10.textSelectionExtent
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.sendAccessibilityEvent(r11)
            goto L_0x0155
        L_0x0334:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.view.AccessibilityBridge.updateSemantics(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel2, final AccessibilityManager accessibilityManager2, ContentResolver contentResolver2, AccessibilityViewEmbedder accessibilityViewEmbedder2, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate2) {
        this.flutterSemanticsTree = new HashMap();
        this.customAccessibilityActions = new HashMap();
        this.accessibilityFeatureFlags = 0;
        this.flutterNavigationStack = new ArrayList();
        this.previousRouteId = 0;
        this.lastLeftFrameInset = 0;
        this.isReleased = false;
        this.accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler() {
            public void announce(String str) {
                AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
            }

            public void onLongPress(int i) {
                AccessibilityBridge.this.sendAccessibilityEvent(i, 2);
            }

            public void onTap(int i) {
                AccessibilityBridge.this.sendAccessibilityEvent(i, 1);
            }

            public void onTooltip(String str) {
                if (Build.VERSION.SDK_INT < 28) {
                    AccessibilityEvent access$300 = AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
                    access$300.getText().add(str);
                    AccessibilityBridge.this.sendAccessibilityEvent(access$300);
                }
            }

            public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
            }

            public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (ByteBuffer order : byteBufferArr) {
                    order.order(ByteOrder.LITTLE_ENDIAN);
                }
                AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
            }
        };
        C246392 r1 = new AccessibilityManager.AccessibilityStateChangeListener() {
            public void onAccessibilityStateChanged(boolean z) {
                if (!AccessibilityBridge.this.isReleased) {
                    if (z) {
                        AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(AccessibilityBridge.this.accessibilityMessageHandler);
                        AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
                    } else {
                        AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler((AccessibilityChannel.AccessibilityMessageHandler) null);
                        AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
                    }
                    if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                        AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                    }
                }
            }
        };
        this.accessibilityStateChangeListener = r1;
        C246343 r2 = new ContentObserver(new Handler()) {
            public void onChange(boolean z) {
                onChange(z, (Uri) null);
            }

            public void onChange(boolean z, Uri uri) {
                if (!AccessibilityBridge.this.isReleased) {
                    String string = Settings.Global.getString(AccessibilityBridge.this.contentResolver, "transition_animation_scale");
                    if (string != null && string.equals("0")) {
                        AccessibilityBridge.access$1176(AccessibilityBridge.this, AccessibilityFeature.DISABLE_ANIMATIONS.value);
                    } else {
                        AccessibilityBridge.access$1172(AccessibilityBridge.this, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                    }
                    AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
                }
            }
        };
        this.animationScaleObserver = r2;
        this.rootAccessibilityView = view;
        this.accessibilityChannel = accessibilityChannel2;
        this.accessibilityManager = accessibilityManager2;
        this.contentResolver = contentResolver2;
        this.accessibilityViewEmbedder = accessibilityViewEmbedder2;
        this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate2;
        r1.onAccessibilityStateChanged(accessibilityManager2.isEnabled());
        accessibilityManager2.addAccessibilityStateChangeListener(r1);
        C246354 r5 = new AccessibilityManager.TouchExplorationStateChangeListener() {
            public void onTouchExplorationStateChanged(boolean z) {
                if (!AccessibilityBridge.this.isReleased) {
                    if (z) {
                        AccessibilityBridge.access$1176(AccessibilityBridge.this, AccessibilityFeature.ACCESSIBLE_NAVIGATION.value);
                    } else {
                        AccessibilityBridge.this.onTouchExplorationExit();
                        AccessibilityBridge.access$1172(AccessibilityBridge.this, ~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value);
                    }
                    AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
                    if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                        AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(accessibilityManager2.isEnabled(), z);
                    }
                }
            }
        };
        this.touchExplorationStateChangeListener = r5;
        r5.onTouchExplorationStateChanged(accessibilityManager2.isTouchExplorationEnabled());
        accessibilityManager2.addTouchExplorationStateChangeListener(r5);
        r2.onChange(false);
        contentResolver2.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, r2);
        platformViewsAccessibilityDelegate2.attachAccessibilityBridge(this);
    }

    /* access modifiers changed from: private */
    public void sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (this.accessibilityManager.isEnabled()) {
            this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
        }
    }
}
