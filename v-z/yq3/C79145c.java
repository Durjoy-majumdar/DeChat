package yq3;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.kinda.gen.StatesType;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.p014mm.sdk.platformtools.Log;
import oa1.C117731d;
import p206nj.C11171e;
import xi3.C78844a;

/* renamed from: yq3.c */
public class C79145c extends View.AccessibilityDelegate {
    private static final String TAG = "MicroMsg.KindaAccessibilityDelegate";
    private View.AccessibilityDelegate origin;
    private boolean shouldSpeakPassWord;
    private StatesType statesType;
    private TraitsType viewType;

    /* renamed from: yq3.c$a */
    public static /* synthetic */ class C79146a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f232419a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f232420b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.tencent.kinda.gen.StatesType[] r0 = com.tencent.kinda.gen.StatesType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f232420b = r0
                r1 = 1
                com.tencent.kinda.gen.StatesType r2 = com.tencent.kinda.gen.StatesType.CHECKED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f232420b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.StatesType r3 = com.tencent.kinda.gen.StatesType.UNCHECKED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.tencent.kinda.gen.TraitsType[] r2 = com.tencent.kinda.gen.TraitsType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f232419a = r2
                com.tencent.kinda.gen.TraitsType r3 = com.tencent.kinda.gen.TraitsType.BUTTON     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f232419a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.tencent.kinda.gen.TraitsType r2 = com.tencent.kinda.gen.TraitsType.CHECKBOX     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yq3.C79145c.C79146a.<clinit>():void");
        }
    }

    public C79145c() {
        this.viewType = null;
        this.statesType = null;
        this.shouldSpeakPassWord = true;
        this.origin = null;
        init();
    }

    private void init() {
    }

    public void addExtraDataToAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        try {
            View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate == null) {
                super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            } else if (Build.VERSION.SDK_INT >= 26) {
                accessibilityDelegate.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            }
        } catch (Exception e) {
            Log.m105920e(TAG, e.getMessage());
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.getAccessibilityNodeProvider(view) : accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        StatesType statesType2;
        TraitsType traitsType;
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
        if (!(accessibilityNodeInfo == null || (traitsType = this.viewType) == null)) {
            int i = C79146a.f232419a[traitsType.ordinal()];
            if (i == 1) {
                accessibilityNodeInfo.setClassName(Button.class.getName());
            } else if (i == 2) {
                accessibilityNodeInfo.setClassName(CheckBox.class.getName());
            }
        }
        if (accessibilityNodeInfo != null && (statesType2 = this.statesType) != null) {
            int i2 = C79146a.f232420b[statesType2.ordinal()];
            if (i2 == 1) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            } else if (i2 == 2) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(false);
            }
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.performAccessibilityAction(view, i, bundle) : accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        if (this.shouldSpeakPassWord) {
            View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate == null) {
                super.sendAccessibilityEvent(view, i);
            } else {
                accessibilityDelegate.sendAccessibilityEvent(view, i);
            }
        } else {
            if ((C117731d.m166007c().mo182443e("clicfg_accessibility_strategy_android_r", 1, true, true) == 1) && C11171e.m11046c(30) && C78844a.C15689b.f42385a.mo108842h(true) && i == 32768) {
                super.sendAccessibilityEvent(view, i);
            } else if (view == null) {
            } else {
                if (i == 128 || i == 1) {
                    C78844a.C15689b.f42385a.mo108841f(view);
                }
            }
        }
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            accessibilityDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void setStatesType(StatesType statesType2) {
        this.statesType = statesType2;
    }

    public void setViewType(TraitsType traitsType) {
        this.viewType = traitsType;
    }

    public C79145c(TraitsType traitsType) {
        this.viewType = null;
        this.statesType = null;
        this.shouldSpeakPassWord = true;
        this.origin = null;
        init();
        setViewType(traitsType);
    }

    public C79145c(View.AccessibilityDelegate accessibilityDelegate) {
        this.viewType = null;
        this.statesType = null;
        this.shouldSpeakPassWord = true;
        this.origin = accessibilityDelegate;
        init();
    }
}
