package com.tencent.liteav.sdkcommon;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdkcommon.C17178g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@JNINamespace("liteav::dashboard")
public class DashboardManager {
    private static final int LOG_MAX_SIZE = 15000;
    private static final String TAG = "DashboardManager";
    private final Context mAppContext;
    /* access modifiers changed from: private */
    public final Map<String, StringBuilder> mDashboardLogs = new HashMap();
    /* access modifiers changed from: private */
    public final C17178g mDashboardManagerView;
    /* access modifiers changed from: private */
    public final Map<String, String> mDashboardStatus = new HashMap();
    /* access modifiers changed from: private */
    public final ArrayList<String> mDashboards = new ArrayList<>();
    private boolean mIsInit;
    private final C17178g.C17179a mSelectedDashboardChangeListener;
    /* access modifiers changed from: private */
    public String mSelectedDashboardId;
    private final Handler mUIHandler;

    public DashboardManager() {
        C171711 r0 = new C17178g.C17179a() {
            /* renamed from: a */
            public final void mo19713a(int i) {
                if (DashboardManager.this.mDashboards.size() > i) {
                    DashboardManager dashboardManager = DashboardManager.this;
                    String unused = dashboardManager.mSelectedDashboardId = (String) dashboardManager.mDashboards.get(i);
                    if (DashboardManager.this.mDashboards.contains(DashboardManager.this.mSelectedDashboardId)) {
                        DashboardManager.this.mDashboardManagerView.mo19723b((String) DashboardManager.this.mDashboardStatus.get(DashboardManager.this.mSelectedDashboardId));
                        StringBuilder sb = (StringBuilder) DashboardManager.this.mDashboardLogs.get(DashboardManager.this.mSelectedDashboardId);
                        if (sb != null) {
                            DashboardManager.this.mDashboardManagerView.mo19722a(sb.toString());
                        } else {
                            DashboardManager.this.mDashboardManagerView.mo19722a("");
                        }
                    }
                }
            }
        };
        this.mSelectedDashboardChangeListener = r0;
        LiteavLog.m16901i(TAG, "java DashBoardManager Construct");
        this.mIsInit = false;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mDashboardManagerView = new C17178g(applicationContext, r0);
        this.mUIHandler = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: private */
    public void addDashboardInternal(String str) {
        if (!this.mDashboards.contains(str)) {
            this.mDashboards.add(str);
            C17178g gVar = this.mDashboardManagerView;
            gVar.f46399k.add(str);
            if (gVar.f46402n == null) {
                gVar.f46402n = gVar.f46399k.getItem(0);
                gVar.f46404p.mo19713a(0);
            }
            gVar.mo19721a();
        }
    }

    /* access modifiers changed from: private */
    public void appendLogInternal(String str, String str2) {
        if (this.mDashboards.contains(str)) {
            StringBuilder sb = this.mDashboardLogs.get(str);
            if (sb == null) {
                sb = new StringBuilder();
                this.mDashboardLogs.put(str, sb);
            }
            sb.append(str2);
            sb.append("\n");
            if (sb.length() > 15000) {
                sb.delete(0, sb.length() / 2);
            }
            if (str.equals(this.mSelectedDashboardId)) {
                C17178g gVar = this.mDashboardManagerView;
                TextView textView = gVar.f46397i;
                if (textView != null) {
                    textView.append(str2 + "\n");
                }
                ScrollView scrollView = gVar.f46400l;
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                }
            }
        }
    }

    private boolean checkPermission() {
        if (LiteavSystemInfo.getSystemOSVersionInt() <= 23 || Settings.canDrawOverlays(this.mAppContext)) {
            return true;
        }
        Toast.makeText(this.mAppContext, "当前无浮窗权限，请授权", 0).show();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean init() {
        /*
            r11 = this;
            boolean r0 = r11.mIsInit
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.tencent.liteav.sdkcommon.g r0 = r11.mDashboardManagerView
            android.content.Context r2 = r0.f46390b
            java.lang.String r3 = "DashboardManagerView"
            r4 = 0
            if (r2 != 0) goto L_0x0018
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "dashBoardManagerView context is null"
            com.tencent.liteav.base.Log.m97546e(r3, r2, r0)
        L_0x0016:
            r0 = 0
            goto L_0x004f
        L_0x0018:
            java.lang.String r5 = "window"
            java.lang.Object r2 = r2.getSystemService(r5)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r0.f46391c = r2
            if (r2 != 0) goto L_0x002d
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "get windowManager is fail"
            com.tencent.liteav.base.Log.m97546e(r3, r2, r0)
            goto L_0x0016
        L_0x002d:
            android.view.Display r2 = r2.getDefaultDisplay()
            android.util.DisplayMetrics r3 = r0.f46389a
            r2.getMetrics(r3)
            android.graphics.Rect r2 = r0.f46403o
            int r3 = r2.right
            if (r3 > 0) goto L_0x0042
            android.util.DisplayMetrics r3 = r0.f46389a
            int r3 = r3.widthPixels
            r2.right = r3
        L_0x0042:
            int r3 = r2.bottom
            if (r3 > 0) goto L_0x004e
            android.util.DisplayMetrics r0 = r0.f46389a
            int r0 = r0.heightPixels
            int r0 = r0 + -100
            r2.bottom = r0
        L_0x004e:
            r0 = 1
        L_0x004f:
            if (r0 != 0) goto L_0x0052
            return r4
        L_0x0052:
            com.tencent.liteav.sdkcommon.g r0 = r11.mDashboardManagerView
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams
            r2.<init>()
            r0.f46392d = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 2038(0x7f6, float:2.856E-42)
            r6 = 2002(0x7d2, float:2.805E-42)
            r7 = 26
            if (r3 < r7) goto L_0x0068
            r2.type = r5
            goto L_0x006a
        L_0x0068:
            r2.type = r6
        L_0x006a:
            r2.format = r1
            r8 = 8388659(0x800033, float:1.1755015E-38)
            r2.gravity = r8
            r9 = 40
            r2.flags = r9
            android.graphics.Rect r9 = r0.f46403o
            int r10 = r9.right
            r2.width = r10
            int r10 = r9.bottom
            r2.height = r10
            int r10 = r9.left
            r2.x = r10
            int r9 = r9.top
            r2.y = r9
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams
            r2.<init>()
            r0.f46393e = r2
            if (r3 < r7) goto L_0x0093
            r2.type = r5
            goto L_0x0095
        L_0x0093:
            r2.type = r6
        L_0x0095:
            r2.format = r1
            r2.gravity = r8
            r3 = 56
            r2.flags = r3
            android.graphics.Rect r3 = r0.f46403o
            int r5 = r3.right
            r2.width = r5
            int r5 = r3.bottom
            r2.height = r5
            int r3 = r3.left
            r2.x = r3
            android.view.WindowManager$LayoutParams r3 = r0.f46392d
            int r5 = r3.y
            int r3 = r3.height
            int r5 = r5 + r3
            r2.y = r5
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r3 = r0.f46390b
            r2.<init>(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r5 = -1
            r3.<init>(r5, r5)
            r2.setLayoutParams(r3)
            r2.setOrientation(r1)
            r3 = -7829368(0xffffffffff888888, float:NaN)
            r2.setBackgroundColor(r3)
            r3 = 1056964608(0x3f000000, float:0.5)
            r2.setAlpha(r3)
            android.widget.Spinner r3 = new android.widget.Spinner
            android.content.Context r6 = r0.f46390b
            r3.<init>(r6)
            r0.f46398j = r3
            android.widget.ArrayAdapter<java.lang.String> r6 = r0.f46399k
            r3.setAdapter(r6)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r3.<init>(r6, r6)
            r7 = 10
            int r8 = r0.mo19720a((int) r7)
            r3.leftMargin = r8
            r8 = 6
            int r8 = r0.mo19720a((int) r8)
            r3.topMargin = r8
            android.widget.Spinner r8 = r0.f46398j
            r8.setLayoutParams(r3)
            android.widget.Spinner r3 = r0.f46398j
            com.tencent.liteav.sdkcommon.g$c r8 = new com.tencent.liteav.sdkcommon.g$c
            r8.<init>(r0, r4)
            r3.setOnItemSelectedListener(r8)
            android.widget.Spinner r3 = r0.f46398j
            r2.addView(r3)
            r0.f46394f = r2
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r3 = r0.f46390b
            r2.<init>(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r5, r5)
            r2.setLayoutParams(r3)
            r2.setOrientation(r1)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r8 = r0.f46390b
            r3.<init>(r8)
            r0.f46396h = r3
            android.graphics.Rect r3 = r0.f46403o
            int r3 = r3.bottom
            int r3 = r3 / 5
            r8 = 200(0xc8, float:2.8E-43)
            if (r3 >= r8) goto L_0x0132
            r3 = 200(0xc8, float:2.8E-43)
        L_0x0132:
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r5, r3)
            int r9 = r0.mo19720a((int) r7)
            r8.leftMargin = r9
            r9 = 30
            int r9 = r0.mo19720a((int) r9)
            r8.topMargin = r9
            int r9 = r0.mo19720a((int) r7)
            r8.rightMargin = r9
            android.widget.TextView r9 = r0.f46396h
            r9.setLayoutParams(r8)
            android.widget.TextView r8 = r0.f46396h
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r8.setTextColor(r9)
            android.widget.TextView r8 = r0.f46396h
            r2.addView(r8)
            android.widget.ScrollView r8 = new android.widget.ScrollView
            android.content.Context r10 = r0.f46390b
            r8.<init>(r10)
            r0.f46400l = r8
            android.graphics.Rect r8 = r0.f46403o
            int r8 = r8.bottom
            int r8 = r8 - r3
            r3 = 20
            int r10 = r0.mo19720a((int) r3)
            int r8 = r8 - r10
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r5, r8)
            int r8 = r0.mo19720a((int) r7)
            r10.leftMargin = r8
            int r8 = r0.mo19720a((int) r7)
            r10.topMargin = r8
            int r7 = r0.mo19720a((int) r7)
            r10.rightMargin = r7
            int r3 = r0.mo19720a((int) r3)
            r10.bottomMargin = r3
            android.widget.ScrollView r3 = r0.f46400l
            r3.setLayoutParams(r10)
            android.widget.ScrollView r3 = r0.f46400l
            r7 = 130(0x82, float:1.82E-43)
            r3.fullScroll(r7)
            android.widget.ScrollView r3 = r0.f46400l
            r3.setVerticalScrollBarEnabled(r4)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r7 = r0.f46390b
            r3.<init>(r7)
            r0.f46397i = r3
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r5, r6)
            android.widget.TextView r5 = r0.f46397i
            r5.setLayoutParams(r3)
            android.widget.TextView r3 = r0.f46397i
            r3.setTextColor(r9)
            android.widget.ScrollView r3 = r0.f46400l
            android.widget.TextView r5 = r0.f46397i
            r3.addView(r5)
            android.widget.ScrollView r3 = r0.f46400l
            r2.addView(r3)
            r0.f46395g = r2
            android.view.View r2 = r0.f46394f
            com.tencent.liteav.sdkcommon.g$b r3 = new com.tencent.liteav.sdkcommon.g$b
            r3.<init>(r0, r4)
            r2.setOnTouchListener(r3)
            com.tencent.liteav.sdkcommon.g$a r0 = r0.f46404p
            r0.mo19713a(r4)
            r11.mIsInit = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.sdkcommon.DashboardManager.init():boolean");
    }

    /* access modifiers changed from: private */
    public void removeAllDashboardInternal() {
        this.mDashboards.clear();
        this.mDashboardStatus.clear();
        this.mDashboardLogs.clear();
        C17178g gVar = this.mDashboardManagerView;
        gVar.f46399k.clear();
        TextView textView = gVar.f46396h;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = gVar.f46397i;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* access modifiers changed from: private */
    public void removeDashboardInternal(String str) {
        if (this.mDashboards.contains(str)) {
            this.mDashboards.remove(str);
            this.mDashboardStatus.remove(str);
            this.mDashboardLogs.remove(str);
            C17178g gVar = this.mDashboardManagerView;
            if (str.equals(gVar.f46402n)) {
                int position = gVar.f46399k.getPosition(gVar.f46402n);
                if (position != gVar.f46399k.getCount() - 1) {
                    int i = position + 1;
                    gVar.f46402n = gVar.f46399k.getItem(i);
                    gVar.f46404p.mo19713a(i - 1);
                }
                if (gVar.f46399k.getCount() == 1) {
                    gVar.f46402n = null;
                }
            }
            gVar.f46399k.remove(str);
            gVar.mo19721a();
        }
    }

    /* access modifiers changed from: private */
    public void setStatusInternal(String str, String str2) {
        if (this.mDashboards.contains(str)) {
            this.mDashboardStatus.put(str, str2);
            if (str.equals(this.mSelectedDashboardId)) {
                this.mDashboardManagerView.mo19723b(str2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showDashboardInternal(boolean z) {
        View view;
        if (!z || (checkPermission() && init())) {
            C17178g gVar = this.mDashboardManagerView;
            if (z != gVar.f46401m) {
                if (z) {
                    WindowManager windowManager = gVar.f46391c;
                    if (!(windowManager == null || (view = gVar.f46394f) == null)) {
                        windowManager.addView(view, gVar.f46392d);
                        gVar.f46391c.addView(gVar.f46395g, gVar.f46393e);
                    }
                } else {
                    gVar.f46391c.removeView(gVar.f46394f);
                    gVar.f46391c.removeView(gVar.f46395g);
                }
                gVar.f46401m = z;
                return;
            }
            return;
        }
        LiteavLog.m16901i(TAG, "init or check permission is fail");
    }

    public int addDashboard(String str) {
        LiteavLog.m16901i(TAG, "addDashboard dashboardId = ".concat(String.valueOf(str)));
        this.mUIHandler.post(C17173b.m16998a(this, str));
        return 0;
    }

    public int appendLog(String str, String str2) {
        this.mUIHandler.post(C17177f.m17002a(this, str, str2));
        return 0;
    }

    public int removeAllDashboard() {
        LiteavLog.m16901i(TAG, "removeAllDashboard ");
        this.mUIHandler.post(C17175d.m17000a(this));
        return 0;
    }

    public int removeDashboard(String str) {
        LiteavLog.m16901i(TAG, "removeDashboard dashboardId = ".concat(String.valueOf(str)));
        this.mUIHandler.post(C17174c.m16999a(this, str));
        return 0;
    }

    public int setStatus(String str, String str2) {
        this.mUIHandler.post(C17176e.m17001a(this, str, str2));
        return 0;
    }

    public int showDashboard(boolean z) {
        LiteavLog.m16901i(TAG, "showDashBoard isShow = ".concat(String.valueOf(z)));
        this.mUIHandler.post(C17172a.m16997a(this, z));
        return 0;
    }
}
