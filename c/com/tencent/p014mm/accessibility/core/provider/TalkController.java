package com.tencent.p014mm.accessibility.core.provider;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u0013¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/TalkController;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Lrx3/b0;", "recordLongTimeGo", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dealNodeInfo", "talk", "", "id", "", "talkString", "getAuthority", "longTimeGo", "Z", "", "TAG", "Ljava/lang/String;", "", "viewLastValueMap", "Ljava/util/Map;", "", "LONG_TIME_GO", "J", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "longTimeGoTask", "Ljava/lang/Runnable;", "lastTalkString", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.TalkController */
public final class TalkController extends Provider {
    public static final int $stable = 8;
    public static final TalkController INSTANCE;
    private static final long LONG_TIME_GO = 1000;
    public static final String TAG = "MicroMsg.Acc.TalkController";
    private static final Handler handler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static String lastTalkString = "";
    /* access modifiers changed from: private */
    public static boolean longTimeGo = true;
    private static final Runnable longTimeGoTask = TalkController$longTimeGoTask$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final Map<Integer, Boolean> viewLastValueMap = new LinkedHashMap();

    static {
        TalkController talkController = new TalkController();
        INSTANCE = talkController;
        talkController.addRootIdMapper$plugin_autoaccessibility_release(C1045861.INSTANCE);
    }

    private TalkController() {
    }

    /* access modifiers changed from: private */
    public final void recordLongTimeGo() {
        longTimeGo = false;
        Handler handler2 = handler;
        Runnable runnable = longTimeGoTask;
        handler2.removeCallbacks(runnable);
        handler2.postDelayed(runnable, 1000);
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        getConfig(view, new TalkController$dealNodeInfo$1(view, accessibilityNodeInfo));
    }

    public int getAuthority() {
        return 1;
    }

    public final void talk(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            contentDescription = accessibilityNodeInfo.getText();
        }
        if (contentDescription == null) {
            contentDescription = "";
        }
        lastTalkString = contentDescription.toString();
        logMsg(TAG, view, "talk self " + contentDescription);
        view.announceForAccessibility(contentDescription);
    }

    public final boolean talkString(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        try {
            String string = MMApplicationContext.getContext().getString(i);
            C87412m.m108593f(string, "getContext().getString(id)");
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if (contentDescription == null) {
                contentDescription = accessibilityNodeInfo.getText();
            }
            if (contentDescription == null) {
                contentDescription = "";
            }
            if (string.length() == 0) {
                return false;
            }
            view.announceForAccessibility(string);
            logMsg(TAG, view, "talk string " + string);
            lastTalkString = contentDescription.toString();
            return true;
        } catch (Throwable th) {
            Log.m105920e(TAG, "talkString throw " + th.getClass().getClass().getName() + ' ' + th.getMessage() + " viewid:" + view.getId() + " stringid:" + i + ' ');
            return false;
        }
    }
}
