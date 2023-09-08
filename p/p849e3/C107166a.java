package p849e3;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p1108f3.C107453d;
import p1108f3.C107457e;
import p849e3.C107207u;

/* renamed from: e3.a */
public class C107166a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: e3.a$a */
    public static final class C107167a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C107166a f320754a;

        public C107167a(C107166a aVar) {
            this.f320754a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f320754a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C107457e accessibilityNodeProvider = this.f320754a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f321493a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f320754a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            int i;
            View view2 = view;
            Class<Boolean> cls = Boolean.class;
            C107453d dVar = new C107453d(accessibilityNodeInfo);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            ClickableSpan[] clickableSpanArr = null;
            if (i2 >= 28) {
                obj = Boolean.valueOf(C107207u.C107218k.m145270d(view));
            } else {
                obj = view2.getTag(C0966R.C0970id.kek);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            dVar.mo157862u(bool != null && bool.booleanValue());
            if (i2 >= 28) {
                obj2 = Boolean.valueOf(C107207u.C107218k.m145269c(view));
            } else {
                Object tag = view2.getTag(C0966R.C0970id.kdx);
                obj2 = cls.isInstance(tag) ? tag : null;
            }
            Boolean bool2 = (Boolean) obj2;
            dVar.mo157857q(bool2 != null && bool2.booleanValue());
            Class<CharSequence> cls2 = CharSequence.class;
            if (i2 >= 28) {
                obj3 = C107207u.C107218k.m145268b(view);
            } else {
                Object tag2 = view2.getTag(C0966R.C0970id.kdy);
                obj3 = cls2.isInstance(tag2) ? tag2 : null;
            }
            dVar.mo157859s((CharSequence) obj3);
            Class<CharSequence> cls3 = CharSequence.class;
            if (i2 < 30) {
                z = false;
            }
            if (z) {
                obj4 = C107207u.C97600m.m125777a(view);
            } else {
                Object tag3 = view2.getTag(C0966R.C0970id.kel);
                obj4 = cls3.isInstance(tag3) ? tag3 : null;
            }
            dVar.mo157865x((CharSequence) obj4);
            this.f320754a.onInitializeAccessibilityNodeInfo(view2, dVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i2 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(C0966R.C0970id.kdw);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    dVar.f321473a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0966R.C0970id.f5310bm);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(C0966R.C0970id.kdw);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(C0966R.C0970id.kdw, sparseArray2);
                    }
                    for (int i5 = 0; i5 < clickableSpanArr.length; i5++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= sparseArray2.size()) {
                                i = C107453d.f321472d;
                                C107453d.f321472d = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                                i = sparseArray2.keyAt(i6);
                                break;
                            } else {
                                i6++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(clickableSpanArr[i5]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i5];
                        Spanned spanned = (Spanned) text;
                        dVar.mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        dVar.mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        dVar.mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        dVar.mo157841c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List<C107453d.C107454a> actionList = C107166a.getActionList(view);
            for (int i7 = 0; i7 < actionList.size(); i7++) {
                dVar.mo157840b(actionList.get(i7));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f320754a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f320754a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f320754a.performAccessibilityAction(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f320754a.sendAccessibilityEvent(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f320754a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public C107166a() {
        this(DEFAULT_DELEGATE);
    }

    public static List<C107453d.C107454a> getActionList(View view) {
        List<C107453d.C107454a> list = (List) view.getTag(C0966R.C0970id.kdv);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i = 0;
            while (clickableSpanArr != null && i < clickableSpanArr.length) {
                if (clickableSpan.equals(clickableSpanArr[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C0966R.C0970id.kdw);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C107457e getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C107457e(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, dVar.f321473a);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<C107453d.C107454a> actionList = getActionList(view);
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C107453d.C107454a aVar = actionList.get(i2);
            if (((AccessibilityNodeInfo.AccessibilityAction) aVar.f321489a).getId() == i) {
                aVar.getClass();
                break;
            }
            i2++;
        }
        boolean performAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        return (performAccessibilityAction || i != C0966R.C0970id.f5310bm) ? performAccessibilityAction : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C107166a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C107167a(this);
    }
}
