package p1108f3;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1108f3.C107461f;

/* renamed from: f3.d */
public class C107453d {

    /* renamed from: d */
    public static int f321472d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f321473a;

    /* renamed from: b */
    public int f321474b = -1;

    /* renamed from: c */
    public int f321475c = -1;

    /* renamed from: f3.d$a */
    public static class C107454a {

        /* renamed from: c */
        public static final C107454a f321476c = new C107454a(1, (CharSequence) null);

        /* renamed from: d */
        public static final C107454a f321477d = new C107454a(2, (CharSequence) null);

        /* renamed from: e */
        public static final C107454a f321478e = new C107454a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C107454a f321479f = new C107454a(64, (CharSequence) null);

        /* renamed from: g */
        public static final C107454a f321480g = new C107454a(128, (CharSequence) null);

        /* renamed from: h */
        public static final C107454a f321481h;

        /* renamed from: i */
        public static final C107454a f321482i;

        /* renamed from: j */
        public static final C107454a f321483j = new C107454a(4096, (CharSequence) null);

        /* renamed from: k */
        public static final C107454a f321484k = new C107454a(8192, (CharSequence) null);

        /* renamed from: l */
        public static final C107454a f321485l;

        /* renamed from: m */
        public static final C107454a f321486m;

        /* renamed from: n */
        public static final C107454a f321487n;

        /* renamed from: o */
        public static final C107454a f321488o;

        /* renamed from: a */
        public final Object f321489a;

        /* renamed from: b */
        public final Class<? extends C107461f.C107462a> f321490b;

        static {
            Class<C107461f.C107464c> cls = C107461f.C107464c.class;
            Class<C107461f.C107463b> cls2 = C107461f.C107463b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C107454a(4, (CharSequence) null);
            new C107454a(8, (CharSequence) null);
            new C107454a(32, (CharSequence) null);
            f321481h = new C107454a(256, (CharSequence) null, cls2);
            f321482i = new C107454a(512, (CharSequence) null, cls2);
            new C107454a(1024, (CharSequence) null, cls);
            new C107454a(2048, (CharSequence) null, cls);
            new C107454a(16384, (CharSequence) null);
            new C107454a(32768, (CharSequence) null);
            new C107454a(65536, (CharSequence) null);
            new C107454a(131072, (CharSequence) null, C107461f.C107468g.class);
            new C107454a(262144, (CharSequence) null);
            new C107454a(524288, (CharSequence) null);
            new C107454a(1048576, (CharSequence) null);
            new C107454a(2097152, (CharSequence) null, C107461f.C107469h.class);
            int i = Build.VERSION.SDK_INT;
            new C107454a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C107461f) null, C107461f.C107466e.class);
            f321485l = new C107454a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            f321486m = new C107454a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            f321487n = new C107454a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            f321488o = new C107454a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C107461f) null, C107461f.C107467f.class);
            new C107454a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C107461f) null, C107461f.C107465d.class);
            new C107454a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            new C107454a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new C107454a(accessibilityAction, 16908372, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
        }

        public C107454a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C107461f) null, (Class<? extends C107461f.C107462a>) null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C107454a)) {
                return false;
            }
            C107454a aVar = (C107454a) obj;
            Object obj2 = this.f321489a;
            return obj2 == null ? aVar.f321489a == null : obj2.equals(aVar.f321489a);
        }

        public int hashCode() {
            Object obj = this.f321489a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C107454a(int i, CharSequence charSequence, Class<? extends C107461f.C107462a> cls) {
            this((Object) null, i, charSequence, (C107461f) null, cls);
        }

        public C107454a(Object obj, int i, CharSequence charSequence, C107461f fVar, Class<? extends C107461f.C107462a> cls) {
            if (obj == null) {
                this.f321489a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f321489a = obj;
            }
            this.f321490b = cls;
        }
    }

    /* renamed from: f3.d$b */
    public static class C107455b {

        /* renamed from: a */
        public final Object f321491a;

        public C107455b(Object obj) {
            this.f321491a = obj;
        }

        /* renamed from: a */
        public static C107455b m145563a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C107455b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* renamed from: f3.d$c */
    public static class C107456c {

        /* renamed from: a */
        public final Object f321492a;

        public C107456c(Object obj) {
            this.f321492a = obj;
        }

        /* renamed from: a */
        public static C107456c m145564a(int i, float f, float f2, float f3) {
            return new C107456c(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public C107453d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f321473a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public void mo157839a(int i) {
        this.f321473a.addAction(i);
    }

    /* renamed from: b */
    public void mo157840b(C107454a aVar) {
        this.f321473a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f321489a);
    }

    /* renamed from: c */
    public final List<Integer> mo157841c(String str) {
        ArrayList<Integer> integerArrayList = this.f321473a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f321473a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    /* renamed from: d */
    public void mo157842d(Rect rect) {
        this.f321473a.getBoundsInParent(rect);
    }

    /* renamed from: e */
    public CharSequence mo157843e() {
        return Build.VERSION.SDK_INT >= 30 ? this.f321473a.getStateDescription() : this.f321473a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C107453d)) {
            return false;
        }
        C107453d dVar = (C107453d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f321473a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f321473a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f321473a)) {
            return false;
        }
        return this.f321475c == dVar.f321475c && this.f321474b == dVar.f321474b;
    }

    /* renamed from: f */
    public CharSequence mo157845f() {
        if (!(!mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f321473a.getText();
        }
        List<Integer> c = mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> c2 = mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> c3 = mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> c4 = mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f321473a.getText(), 0, this.f321473a.getText().length()));
        for (int i = 0; i < c.size(); i++) {
            spannableString.setSpan(new C107450a(c4.get(i).intValue(), this, this.f321473a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), c.get(i).intValue(), c2.get(i).intValue(), c3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: g */
    public void mo157846g(boolean z) {
        this.f321473a.setAccessibilityFocused(z);
    }

    /* renamed from: h */
    public final void mo157847h(int i, boolean z) {
        Bundle extras = this.f321473a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f321473a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public void mo157849i(Rect rect) {
        this.f321473a.setBoundsInParent(rect);
    }

    /* renamed from: j */
    public void mo157850j(Rect rect) {
        this.f321473a.setBoundsInScreen(rect);
    }

    /* renamed from: k */
    public void mo157851k(boolean z) {
        this.f321473a.setCheckable(z);
    }

    /* renamed from: l */
    public void mo157852l(CharSequence charSequence) {
        this.f321473a.setClassName(charSequence);
    }

    /* renamed from: m */
    public void mo157853m(Object obj) {
        this.f321473a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C107455b) obj).f321491a);
    }

    /* renamed from: n */
    public void mo157854n(CharSequence charSequence) {
        this.f321473a.setContentDescription(charSequence);
    }

    /* renamed from: o */
    public void mo157855o(boolean z) {
        this.f321473a.setEnabled(z);
    }

    /* renamed from: p */
    public void mo157856p(boolean z) {
        this.f321473a.setFocusable(z);
    }

    /* renamed from: q */
    public void mo157857q(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f321473a.setHeading(z);
        } else {
            mo157847h(2, z);
        }
    }

    /* renamed from: r */
    public void mo157858r(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f321473a.setHintText(charSequence);
        } else {
            this.f321473a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: s */
    public void mo157859s(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f321473a.setPaneTitle(charSequence);
        } else {
            this.f321473a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public void mo157860t(C107456c cVar) {
        this.f321473a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) cVar.f321492a);
    }

    public String toString() {
        ArrayList arrayList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo157842d(rect);
        sb.append("; boundsInParent: " + rect);
        this.f321473a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f321473a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f321473a.getClassName());
        sb.append("; text: ");
        sb.append(mo157845f());
        sb.append("; contentDescription: ");
        sb.append(this.f321473a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f321473a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f321473a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f321473a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f321473a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f321473a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f321473a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f321473a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f321473a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f321473a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f321473a.isPassword());
        sb.append("; scrollable: " + this.f321473a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f321473a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(new C107454a(actionList.get(i), 0, (CharSequence) null, (C107461f) null, (Class<? extends C107461f.C107462a>) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C107454a aVar = (C107454a) arrayList.get(i2);
            int id = ((AccessibilityNodeInfo.AccessibilityAction) aVar.f321489a).getId();
            if (id == 1) {
                str = "ACTION_FOCUS";
            } else if (id != 2) {
                switch (id) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    case 16908372:
                        str = "ACTION_IME_ENTER";
                        break;
                    default:
                        switch (id) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (id) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) aVar.f321489a).getLabel() != null) {
                str = ((AccessibilityNodeInfo.AccessibilityAction) aVar.f321489a).getLabel().toString();
            }
            sb.append(str);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo157862u(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f321473a.setScreenReaderFocusable(z);
        } else {
            mo157847h(1, z);
        }
    }

    /* renamed from: v */
    public void mo157863v(boolean z) {
        this.f321473a.setScrollable(z);
    }

    /* renamed from: w */
    public void mo157864w(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f321473a.setShowingHintText(z);
        } else {
            mo157847h(4, z);
        }
    }

    /* renamed from: x */
    public void mo157865x(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f321473a.setStateDescription(charSequence);
        } else {
            this.f321473a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: y */
    public void mo157866y(CharSequence charSequence) {
        this.f321473a.setText(charSequence);
    }
}
