package ia1;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gu2.C98214b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import o91.C100313f;
import op3.C117877b;
import op3.C117882j;

/* renamed from: ia1.g */
public final class C98624g {

    /* renamed from: a */
    public static final C98624g f289158a = new C98624g();

    /* renamed from: b */
    public static final ArrayList<C98619b> f289159b = new ArrayList<>();

    /* renamed from: c */
    public static final HashMap<String, C100313f> f289160c = new HashMap<>();

    /* renamed from: d */
    public static int f289161d = -1;

    /* renamed from: e */
    public static int f289162e = -1;

    /* renamed from: f */
    public static int f289163f;

    /* renamed from: g */
    public static int f289164g;

    /* renamed from: h */
    public static int f289165h;

    /* renamed from: i */
    public static int f289166i;

    /* renamed from: j */
    public static int f289167j;

    /* renamed from: k */
    public static Field f289168k;

    /* renamed from: l */
    public static Method f289169l;

    /* renamed from: m */
    public static Method f289170m;

    /* renamed from: n */
    public static Field f289171n;

    /* renamed from: o */
    public static Field f289172o;

    /* renamed from: p */
    public static Field f289173p;

    /* renamed from: q */
    public static Method f289174q;

    /* renamed from: r */
    public static Field f289175r;

    /* renamed from: s */
    public static Field f289176s;

    /* renamed from: t */
    public static Field f289177t;

    /* renamed from: u */
    public static Field f289178u;

    static {
        try {
            Field declaredField = Class.forName("iu2.a").getDeclaredField("info");
            f289168k = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            int i = C98214b.f287959o1;
            Method declaredMethod = C98214b.class.getDeclaredMethod("getSnsInfo", new Class[0]);
            f289169l = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            Class<SnsInfo> cls = SnsInfo.class;
            String str = SnsInfo.TABLEINDEXUSERNAME;
            Method declaredMethod2 = cls.getDeclaredMethod("getTimeLine", new Class[0]);
            f289170m = declaredMethod2;
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
            }
            Class<TimeLineObject> cls2 = TimeLineObject.class;
            int i2 = TimeLineObject.f283892d;
            Field declaredField2 = cls2.getDeclaredField("Id");
            f289171n = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Field declaredField3 = cls2.getDeclaredField("UserName");
            f289172o = declaredField3;
            if (declaredField3 != null) {
                declaredField3.setAccessible(true);
            }
            Field declaredField4 = cls.getDeclaredField("adsnsinfo");
            f289173p = declaredField4;
            if (declaredField4 != null) {
                declaredField4.setAccessible(true);
            }
            String str2 = AdSnsInfo.TAG;
            Method declaredMethod3 = AdSnsInfo.class.getDeclaredMethod("getAdXml", new Class[0]);
            f289174q = declaredMethod3;
            if (declaredMethod3 != null) {
                declaredMethod3.setAccessible(true);
            }
            Field declaredField5 = ADXml.class.getDeclaredField("adCardActionBtnInfo");
            f289175r = declaredField5;
            if (declaredField5 != null) {
                declaredField5.setAccessible(true);
            }
            Class<ADXml.AdCardActionBtnInfo> cls3 = ADXml.AdCardActionBtnInfo.class;
            Field declaredField6 = cls3.getDeclaredField("finderUsername");
            f289176s = declaredField6;
            if (declaredField6 != null) {
                declaredField6.setAccessible(true);
            }
            Field declaredField7 = cls3.getDeclaredField("finderLiveId");
            f289177t = declaredField7;
            if (declaredField7 != null) {
                declaredField7.setAccessible(true);
            }
            Field declaredField8 = cls3.getDeclaredField("finderLiveFeedExportId");
            f289178u = declaredField8;
            if (declaredField8 != null) {
                declaredField8.setAccessible(true);
            }
        } catch (Exception e) {
            Log.m105920e("HABBYGE-MALI.SnsFeedMonitor", "SnsFeedMonitor, init-1, crash: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final C117877b<Integer, Integer> mo138054a(View view) {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = -1;
        }
        view.getLocationOnScreen(iArr);
        return C117882j.m166284c(Integer.valueOf(Math.min(iArr[1], (int) view.getY())), Integer.valueOf(view.getHeight()));
    }

    /* renamed from: b */
    public final void mo138055b(AppCompatActivity appCompatActivity) {
        if (appCompatActivity != null) {
            Resources resources = appCompatActivity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", Platform.ANDROID));
            f289165h = dimensionPixelSize;
            if (dimensionPixelSize <= 0) {
                f289165h = resources.getDimensionPixelSize(C0966R.dimen.a54);
            }
        }
        Display display = null;
        int i = 0;
        if (appCompatActivity != null) {
            try {
                ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
                View j = supportActionBar != null ? supportActionBar.mo91099j() : null;
                f289166i = j != null ? j.getHeight() : -1;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.SnsFeedMonitor", e, "initBarHeight", new Object[0]);
            }
        }
        if (appCompatActivity != null) {
            try {
                Object systemService = MMApplicationContext.getContext().getSystemService("window");
                WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                if (windowManager != null) {
                    display = windowManager.getDefaultDisplay();
                }
            } catch (Exception unused) {
                WindowManager windowManager2 = appCompatActivity.getWindowManager();
                if (windowManager2 != null) {
                    display = windowManager2.getDefaultDisplay();
                }
            }
            if (display != null) {
                Point point = new Point();
                display.getSize(point);
                Point point2 = new Point();
                display.getRealSize(point2);
                int i2 = point.y;
                f289164g = i2;
                int i3 = point2.y;
                f289163f = i3;
                int i4 = i3 - i2;
                if (i4 > 0) {
                    i = i4;
                }
                f289167j = i;
            }
        }
        Log.m105924i("HABBYGE-MALI.SnsFeedMonitor", "init: mScreenRealHeight=" + f289163f + ", mScreenHeight=" + f289164g + ", mStatusBarHeight=" + f289165h + ", mActionBarHeight=" + f289166i + ", virtualKeyHeight=" + f289167j);
    }
}
