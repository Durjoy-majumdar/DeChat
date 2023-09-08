package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.camera.core.FocusMeteringAction;
import ck3.C67391b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.PanelDynamicEnterActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.PanelEnterActionStruct;
import com.tencent.p014mm.p136ui.base.MMDotView;
import com.tencent.p014mm.p136ui.base.MMFlipper;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import ht1.C60165e4;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import lc3.C10485b;
import ls3.C34356e;
import p529fv.C75798k;
import qo3.C47883u;
import qo3.C77426q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel */
public class AppPanel extends LinearLayout {

    /* renamed from: S */
    public static int f211685S = 215;

    /* renamed from: T */
    public static boolean f211686T;

    /* renamed from: A */
    public C72791h f211687A;

    /* renamed from: B */
    public int f211688B = 0;

    /* renamed from: C */
    public boolean f211689C = false;

    /* renamed from: D */
    public boolean f211690D = false;

    /* renamed from: E */
    public boolean f211691E = false;

    /* renamed from: F */
    public boolean f211692F = false;

    /* renamed from: G */
    public boolean f211693G = false;

    /* renamed from: H */
    public boolean f211694H = false;

    /* renamed from: I */
    public boolean f211695I = false;

    /* renamed from: J */
    public boolean f211696J = false;

    /* renamed from: K */
    public Map<String, C44561j> f211697K = null;

    /* renamed from: L */
    public boolean f211698L = true;

    /* renamed from: M */
    public List<C44561j> f211699M = new LinkedList();

    /* renamed from: N */
    public int f211700N = -1;

    /* renamed from: P */
    public AppGrid.C44604d f211701P = new C72749d();

    /* renamed from: Q */
    public boolean f211702Q = true;

    /* renamed from: R */
    public int f211703R = -1;

    /* renamed from: d */
    public SharedPreferences f211704d;

    /* renamed from: e */
    public int f211705e = 4;

    /* renamed from: f */
    public long f211706f = System.currentTimeMillis();

    /* renamed from: g */
    public final boolean[] f211707g = new boolean[22];

    /* renamed from: h */
    public C72752g f211708h;

    /* renamed from: i */
    public C72753h f211709i;

    /* renamed from: j */
    public ChatFooter$$i1 f211710j;

    /* renamed from: n */
    public Context f211711n;

    /* renamed from: o */
    public List<AppGrid> f211712o;

    /* renamed from: p */
    public MMFlipper f211713p;

    /* renamed from: q */
    public MMDotView f211714q;

    /* renamed from: r */
    public int f211715r;

    /* renamed from: s */
    public int f211716s;

    /* renamed from: t */
    public boolean f211717t = false;

    /* renamed from: u */
    public int f211718u = 22;

    /* renamed from: v */
    public int f211719v = 22;

    /* renamed from: w */
    public int f211720w;

    /* renamed from: x */
    public int f211721x;

    /* renamed from: y */
    public int f211722y = 0;

    /* renamed from: z */
    public int f211723z = -1;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$a */
    public class C72746a implements MMFlipper.C73164b {
        public C72746a() {
        }

        /* renamed from: a */
        public void mo100336a(int i, int i2) {
            Log.m105925i("MicroMsg.AppPanel", "onMeasure width: %d, heigth:%d, isMeasured:%b, gridWidth:%d, gridHeight:%d", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(AppPanel.this.f211717t), Integer.valueOf(AppPanel.this.f211715r), Integer.valueOf(AppPanel.this.f211716s));
            AppPanel appPanel = AppPanel.this;
            if ((!appPanel.f211717t || Math.abs(appPanel.f211716s - i2) >= 10) && i2 != 0 && i != 0) {
                if (AppPanel.this.getScreenOrientation() == 2) {
                    Log.m105918d("MicroMsg.AppPanel", "landspace");
                } else {
                    Log.m105918d("MicroMsg.AppPanel", "portrait");
                }
                AppPanel appPanel2 = AppPanel.this;
                appPanel2.f211717t = true;
                appPanel2.f211716s = i2;
                appPanel2.f211715r = i;
                AppPanel.m85214n(appPanel2);
            } else if (i2 == 0 || i == 0) {
                Log.m105918d("MicroMsg.AppPanel", "onMeasure, width or height is 0");
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$b */
    public class C72747b implements MMFlipper.C73163a {
        public C72747b() {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$c */
    public class C72748c implements MMFlipper.C73165c {
        public C72748c() {
        }

        /* renamed from: a */
        public void mo65479a(int i, int i2, boolean z) {
            Class cls = C60165e4.class;
            AppPanel.this.f211714q.setSelectedDot(i2);
            if (AppPanel.this.getVisibility() == 0 && i != -1 && i != i2 && z) {
                AppPanel appPanel = AppPanel.this;
                int size = appPanel.f211687A.f212166j.f212183a ? appPanel.f211718u + appPanel.f211699M.size() : appPanel.f211718u;
                PanelDynamicEnterActionStruct panelDynamicEnterActionStruct = new PanelDynamicEnterActionStruct();
                panelDynamicEnterActionStruct.f194312d = 1;
                panelDynamicEnterActionStruct.f194313e = 0;
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < AppPanel.this.getAppPanelUnCertainEnterArrayList().size(); i3++) {
                    AppPanel appPanel2 = AppPanel.this;
                    int i4 = appPanel2.f211723z + size + 1;
                    int i5 = appPanel2.f211721x;
                    int i6 = i4 / i5;
                    if (i4 % i5 <= 0) {
                        i6--;
                    }
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    if (i == i6) {
                        sb.append(appPanel2.getAppPanelUnCertainEnterArrayList().get(i3).f120961y1);
                        sb.append("|");
                    }
                }
                panelDynamicEnterActionStruct.f194314f = panelDynamicEnterActionStruct.mo86045b("AppList", sb.toString(), true);
                panelDynamicEnterActionStruct.mo86054n();
                int p = AppPanel.this.mo100318p(13);
                if (p != -1 && p == AppPanel.this.getCurScreen()) {
                    ChatFooter$$i1 chatFooter$$i1 = AppPanel.this.f211710j;
                    String b = chatFooter$$i1 == null ? "" : chatFooter$$i1.mo100532b();
                    PanelEnterActionStruct panelEnterActionStruct = new PanelEnterActionStruct();
                    panelEnterActionStruct.f194315d = panelEnterActionStruct.mo86045b("RoomName", b, true);
                    panelEnterActionStruct.f194316e = 0;
                    panelEnterActionStruct.f194317f = panelEnterActionStruct.mo86045b("AppList", "19", true);
                    panelEnterActionStruct.f194318g = p + 1;
                    panelEnterActionStruct.mo86054n();
                }
                Log.m105925i("MicroMsg.AppPanel", "scroll to show page %s", Integer.valueOf(i2));
                int p2 = AppPanel.this.mo100318p(14);
                if (i2 == p2 && AppPanel.this.f211687A.f212152A.f212183a) {
                    ((C60165e4) C86312j.m106911c(cls)).T10(p2 + 1);
                    AppPanel appPanel3 = AppPanel.this;
                    ((C60165e4) C86312j.m106911c(cls)).mo85147I3(1, appPanel3.f211705e, appPanel3.f211706f, (Map<String, ? extends Object>) null);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$d */
    public class C72749d implements AppGrid.C44604d {
        public C72749d() {
        }

        /* renamed from: a */
        public int mo100337a(int i) {
            AppPanel appPanel = AppPanel.this;
            int i2 = appPanel.f211718u;
            if (i >= i2) {
                return (i < i2 || i >= appPanel.f211719v) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            int length = appPanel.f211707g.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (AppPanel.this.f211707g[i4]) {
                    if (i3 == i) {
                        return i4;
                    }
                    i3++;
                }
            }
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$e */
    public class C72750e implements DialogInterface.OnDismissListener {
        public C72750e(AppPanel appPanel) {
        }

        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$f */
    public class C72751f implements C47883u {
        public C72751f(AppPanel appPanel) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$g */
    public interface C72752g {
        /* renamed from: I */
        void mo96040I();

        /* renamed from: a */
        void mo96041a();

        /* renamed from: b */
        void mo96042b();

        /* renamed from: c */
        void mo96043c(int i);

        /* renamed from: d */
        void mo96044d();

        /* renamed from: e */
        void mo96045e(int i);

        /* renamed from: f */
        void mo96046f();

        /* renamed from: g */
        void mo96047g();

        /* renamed from: h */
        void mo96048h();

        /* renamed from: i */
        void mo96049i();

        /* renamed from: j */
        void mo96050j(C44561j jVar);

        /* renamed from: k */
        void mo96051k();

        /* renamed from: l */
        void mo96052l();

        /* renamed from: m */
        void mo96053m(int i, long j);

        /* renamed from: n */
        void mo96054n();

        /* renamed from: o */
        void mo96055o();

        /* renamed from: p */
        void mo96056p();

        /* renamed from: q */
        void mo96057q();

        /* renamed from: r */
        void mo96058r();

        /* renamed from: s */
        void mo96059s();

        /* renamed from: t */
        void mo96060t();
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppPanel$h */
    public interface C72753h {
    }

    public AppPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211711n = context;
    }

    /* renamed from: e */
    public static boolean m85205e(AppPanel appPanel) {
        return C72996z1.m85825X4(appPanel.f211710j.mo100532b()) && ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76776L4().get(appPanel.f211710j.mo100532b()).field_actionPermission == 0;
    }

    /* renamed from: f */
    public static void m85206f(AppPanel appPanel) {
        appPanel.mo100335x(appPanel.f211711n.getString(C0966R.string.ejj));
    }

    /* renamed from: g */
    public static void m85207g(AppPanel appPanel, boolean z) {
        if (!f211686T) {
            appPanel.getClass();
            f211686T = true;
            ((C119157j) C119157j.f356862d).mo183875f(new C72787g(appPanel));
        }
        if (z) {
            appPanel.f211708h.mo96043c(0);
        } else {
            appPanel.f211708h.mo96043c(1);
        }
    }

    private int getPortHeightPX() {
        int i = this.f211703R;
        return i > 0 ? i : BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f211711n, (float) f211685S);
    }

    /* access modifiers changed from: private */
    public int getScreenOrientation() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }

    /* renamed from: n */
    public static void m85214n(AppPanel appPanel) {
        boolean z;
        String str;
        Integer num;
        AppGrid appGrid;
        AppPanel appPanel2 = appPanel;
        int i = appPanel2.f211715r;
        char c = 0;
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        if (i == 0 || appPanel2.f211716s == 0) {
            Log.m105929w("MicroMsg.AppPanel", "init app grid: %s, %s", Integer.valueOf(i), Integer.valueOf(appPanel2.f211716s));
            return;
        }
        if (appPanel2.f211723z == -1) {
            appPanel2.f211713p.setToScreen(appPanel2.f211722y);
        }
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(appPanel2.f211711n, 82.0f);
        int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(appPanel2.f211711n, 90.0f);
        appPanel.mo100316o();
        int i5 = !appPanel2.f211698L ? appPanel2.f211715r / fromDPToPix : 4;
        int i6 = appPanel2.f211716s;
        int i7 = i6 / fromDPToPix2;
        if (i7 > 2) {
            i7 = 2;
        }
        int i8 = (i6 - (fromDPToPix2 * i7)) / (i7 + 1);
        Log.m105925i("MicroMsg.AppPanel", "in initAppGrid, gridWidth = %d, gridHeight = %d, spacing:%d", Integer.valueOf(appPanel2.f211715r), Integer.valueOf(appPanel2.f211716s), Integer.valueOf(i8));
        if (i5 == 0) {
            i5 = 1;
        }
        if (i7 == 0) {
            i7 = 1;
        }
        appPanel2.f211720w = i7;
        appPanel2.f211721x = i7 * i5;
        if (appPanel2.f211687A.f212166j.f212183a) {
            appPanel2.f211719v = appPanel2.f211718u + appPanel2.f211699M.size();
        } else {
            appPanel2.f211719v = appPanel2.f211718u;
        }
        int i9 = appPanel2.f211719v;
        ArrayList<C72791h.C44607a> arrayList = appPanel2.f211687A.f212156E;
        int size = i9 + (arrayList != null ? arrayList.size() : 0);
        appPanel2.f211719v = size;
        int ceil = (int) Math.ceil(((double) size) / ((double) appPanel2.f211721x));
        Log.m105925i("MicroMsg.AppPanel", "in initAppGrid, totalItemCount = %d, itemsPerPage = %d, pageCount = %d visibleLocalAppCount = %d infoList = %d", Integer.valueOf(appPanel2.f211719v), Integer.valueOf(appPanel2.f211721x), Integer.valueOf(ceil), Integer.valueOf(appPanel2.f211718u), Integer.valueOf(appPanel2.f211699M.size()));
        int i15 = appPanel2.f211700N;
        if (i15 == ceil) {
            Log.m105925i("MicroMsg.AppPanel", "mLastPageCount == pageCount! [%s:%s]", Integer.valueOf(i15), Integer.valueOf(ceil));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            appPanel2.f211712o = new ArrayList();
            appPanel2.f211713p.removeAllViews();
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i16 = 16776;
        if (ceil > 10) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(16776, 0, 1);
            nVar.mo175913w(999, 1, 1);
        }
        C72767b bVar = new C72767b(appPanel2);
        String str2 = "MicroMsg.AppPanel";
        ((C119157j) C119157j.f356862d).mo183878i(bVar, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        long j = 0;
        int i17 = 0;
        while (true) {
            if (i17 >= ceil) {
                str = str2;
                break;
            } else if (i17 >= ceil) {
                Object[] objArr = new Object[i3];
                objArr[c] = Integer.valueOf(ceil);
                String str3 = str2;
                Log.m105921e(str3, "my god! you see a ghost! %s", objArr);
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo175913w(999, 0, 1);
                Object[] objArr2 = new Object[2];
                objArr2[c] = i4;
                objArr2[i3] = i2;
                nVar2.mo160131h(i16, objArr2);
                str = str3;
                break;
            } else {
                String str4 = str2;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (z) {
                    num = i2;
                    appGrid = (AppGrid) View.inflate(appPanel2.f211711n, C0966R.C0971layout.f6495gd, (ViewGroup) null);
                } else {
                    num = i2;
                    appGrid = (((ArrayList) appPanel2.f211712o).size() <= i17 || ((ArrayList) appPanel2.f211712o).get(i17) == null) ? (AppGrid) View.inflate(appPanel2.f211711n, C0966R.C0971layout.f6495gd, (ViewGroup) null) : (AppGrid) ((ArrayList) appPanel2.f211712o).get(i17);
                }
                Log.m105925i(str4, "[initAppGrid] i:%s cost:%sms", Integer.valueOf(i17), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                long currentTimeMillis3 = j + (System.currentTimeMillis() - currentTimeMillis2);
                List<C44561j> list = appPanel2.f211699M;
                Map<String, C44561j> map = appPanel2.f211697K;
                Integer num2 = i4;
                ArrayList<C72791h.C44607a> arrayList2 = appPanel2.f211687A.f212156E;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                appGrid.getClass();
                long j2 = currentTimeMillis3;
                appGrid.f120923n = new AppGrid.C44602c(appGrid.f120917e, list, map, arrayList2);
                appGrid.setBackgroundResource(0);
                appGrid.setAdapter(appGrid.f120923n);
                appGrid.setOnItemClickListener(appGrid.f120925p);
                appGrid.setOnItemLongClickListener(appGrid.f120926q);
                appGrid.setPadding(BackwardSupportUtil.BitmapFactory.fromDPToPix(appGrid.f120917e, 16.0f), BackwardSupportUtil.BitmapFactory.fromDPToPix(appGrid.f120917e, 6.0f), BackwardSupportUtil.BitmapFactory.fromDPToPix(appGrid.f120917e, 16.0f), 0);
                int i18 = appPanel2.f211719v;
                int i19 = appPanel2.f211721x;
                int i25 = appPanel2.f211718u;
                appGrid.f120921i = i17;
                appGrid.f120918f = i18;
                appGrid.f120919g = i19;
                appGrid.f120920h = ceil;
                appGrid.f120922j = i25;
                appGrid.setNumColumns(i5);
                if (i8 > 0) {
                    appGrid.setPadding(BackwardSupportUtil.BitmapFactory.fromDPToPix(appGrid.f120917e, 16.0f), i8, BackwardSupportUtil.BitmapFactory.fromDPToPix(appGrid.f120917e, 16.0f), 0);
                    appGrid.setVerticalSpacing(i8 / 2);
                }
                if (z) {
                    appPanel2.f211713p.addView(appGrid, new LinearLayout.LayoutParams(-1, -2));
                    ((ArrayList) appPanel2.f211712o).add(appGrid);
                }
                i17++;
                str2 = str4;
                i4 = num2;
                i2 = num;
                j = j2;
                c = 0;
                i3 = 1;
                i16 = 16776;
            }
        }
        bVar.mo97819a();
        Log.m105925i(str, "[initAppGrid] cost:%sms inflateCost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j));
        Iterator it = ((ArrayList) appPanel2.f211712o).iterator();
        while (it.hasNext()) {
            ((AppGrid) it.next()).setOnAppSelectedListener(appPanel2.f211701P);
        }
        if (((ArrayList) appPanel2.f211712o).size() <= 1) {
            appPanel2.f211714q.setVisibility(4);
        } else {
            appPanel2.f211714q.setVisibility(0);
            appPanel2.f211714q.setDotCount(((ArrayList) appPanel2.f211712o).size());
            int curScreen = appPanel2.f211713p.getCurScreen();
            appPanel2.f211713p.setToScreen(curScreen);
            appPanel2.f211714q.setSelectedDot(curScreen);
        }
        appPanel2.f211700N = ceil;
        appPanel.requestLayout();
        if (appPanel2.f211723z != -1) {
            int size2 = appPanel2.f211687A.f212166j.f212183a ? appPanel2.f211718u + appPanel2.f211699M.size() : appPanel2.f211718u;
            int i26 = appPanel2.f211723z + size2 + 1;
            int i27 = appPanel2.f211721x;
            int i28 = i26 / i27;
            if (i26 % i27 <= 0) {
                i28--;
            }
            if (i28 < 0) {
                i28 = 0;
            }
            appPanel2.f211722y = i28;
            appPanel2.f211713p.setToScreen(i28);
            appPanel2.f211723z = -1;
            PanelDynamicEnterActionStruct panelDynamicEnterActionStruct = new PanelDynamicEnterActionStruct();
            panelDynamicEnterActionStruct.f194312d = 1;
            panelDynamicEnterActionStruct.f194313e = 1;
            StringBuilder sb = new StringBuilder();
            for (int i29 = 0; i29 < appPanel.getAppPanelUnCertainEnterArrayList().size(); i29++) {
                int i35 = appPanel2.f211722y;
                int i36 = appPanel2.f211723z + size2 + 1;
                int i37 = appPanel2.f211721x;
                int i38 = i36 / i37;
                if (i36 % i37 <= 0) {
                    i38--;
                }
                if (i38 < 0) {
                    i38 = 0;
                }
                if (i35 == i38) {
                    sb.append(appPanel.getAppPanelUnCertainEnterArrayList().get(i29).f120961y1);
                    sb.append("|");
                }
            }
            panelDynamicEnterActionStruct.f194314f = panelDynamicEnterActionStruct.mo86045b("AppList", sb.toString(), true);
            panelDynamicEnterActionStruct.mo86054n();
        }
    }

    public ArrayList<C72791h.C44607a> getAppPanelUnCertainEnterArrayList() {
        ArrayList<C72791h.C44607a> arrayList = this.f211687A.f212156E;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public int getCurScreen() {
        MMFlipper mMFlipper = this.f211713p;
        if (mMFlipper != null) {
            return mMFlipper.getCurScreen();
        }
        return -1;
    }

    public int getPageMaxRowCount() {
        int i = this.f211720w;
        if (i != 0) {
            return i;
        }
        int i2 = (this.f211719v + 3) / 4;
        if (i2 > 2) {
            return 2;
        }
        return i2;
    }

    /* renamed from: o */
    public final void mo100316o() {
        int i;
        int length = this.f211707g.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f211707g[i2] = true;
        }
        C72791h hVar = this.f211687A;
        if (!hVar.f212159c.f212183a) {
            this.f211707g[0] = false;
            i = 1;
        } else {
            i = 0;
        }
        if (!hVar.f212158b.f212183a) {
            this.f211707g[1] = false;
            i++;
        }
        if (!hVar.f212180x.f212183a) {
            this.f211707g[19] = false;
            i++;
        }
        if (!hVar.f212181y.f212183a) {
            this.f211707g[12] = false;
            i++;
        }
        if (!hVar.f212182z.f212183a) {
            this.f211707g[13] = false;
            i++;
        }
        boolean z = hVar.f212152A.f212183a;
        boolean QX = ((C34356e) C86312j.m106911c(C34356e.class)).mo58235QX();
        Log.m105925i("MicroMsg.AppPanel", "roomEnable:%s, hideRoomLive:%s", Boolean.valueOf(z), Boolean.valueOf(QX));
        if (!z || QX) {
            this.f211707g[14] = false;
            i++;
        }
        C72791h hVar2 = this.f211687A;
        if (!hVar2.f212172p.f212183a || !hVar2.f212173q.f212183a) {
            this.f211707g[6] = false;
            i++;
        }
        if (!hVar2.f212164h.f212183a) {
            this.f211707g[17] = false;
            i++;
        }
        if (!hVar2.f212165i.f212183a) {
            Log.m105924i("MicroMsg.AppPanel", "disable remittance");
            this.f211707g[8] = false;
            i++;
        }
        C72791h hVar3 = this.f211687A;
        if (!hVar3.f212160d.f212183a) {
            this.f211707g[15] = false;
            i++;
        }
        if (!hVar3.f212174r.f212183a) {
            this.f211707g[16] = false;
            i++;
        }
        if (!hVar3.f212177u.f212183a) {
            this.f211707g[3] = false;
            i++;
        }
        if (!hVar3.f212161e.f212183a) {
            this.f211707g[11] = false;
            i++;
        }
        if (!hVar3.f212167k.f212183a) {
            this.f211707g[5] = false;
            i++;
        }
        if (!hVar3.f212169m.f212183a || !hVar3.f212168l.f212183a) {
            this.f211707g[4] = false;
            i++;
        }
        if (!hVar3.f212163g.f212183a || !hVar3.f212162f.f212183a) {
            this.f211707g[2] = false;
            i++;
        }
        if (!hVar3.f212171o.f212183a || !hVar3.f212170n.f212183a) {
            this.f211707g[10] = false;
            i++;
        }
        if (!hVar3.f212176t.f212183a) {
            Log.m105924i("MicroMsg.AppPanel", "disable lucky money");
            this.f211707g[7] = false;
            i++;
        }
        C72791h hVar4 = this.f211687A;
        if (!hVar4.f212178v.f212183a) {
            this.f211707g[18] = false;
            i++;
        }
        if (!hVar4.f212153B.f212183a) {
            this.f211707g[20] = false;
            i++;
        }
        hVar4.getClass();
        boolean[] zArr = this.f211707g;
        zArr[9] = false;
        int i3 = i + 1;
        C72791h hVar5 = this.f211687A;
        if (!hVar5.f212155D.f212183a || !hVar5.f212154C.f212183a) {
            zArr[21] = false;
            i3++;
        }
        this.f211718u = 22 - i3;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i == 1 || i == 2) {
            Log.m105918d("MicroMsg.AppPanel", "onConfigChanged:" + configuration.orientation);
            if (configuration.orientation == 1) {
                this.f211698L = true;
            } else {
                this.f211698L = false;
            }
            setNeedRefreshHeight(true);
            Log.m105924i("MicroMsg.AppPanel", "[dealOrientationChange]");
            this.f211717t = false;
            this.f211713p.setToScreen(0);
            mo100320r();
            requestLayout();
        }
    }

    /* renamed from: p */
    public int mo100318p(int i) {
        int length = this.f211707g.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i3 = -1;
                break;
            }
            if (this.f211707g[i2]) {
                if (i2 == i) {
                    break;
                }
                i3++;
            }
            i2++;
        }
        if (i3 == -1) {
            return -1;
        }
        int i4 = i3 + 1;
        int i5 = this.f211721x;
        int i6 = i4 / i5;
        if (i4 % i5 <= 0) {
            i6--;
        }
        if (i6 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: q */
    public void mo100319q(int i) {
        Log.m105925i("MicroMsg.AppPanel", "init: %s", Integer.valueOf(i));
        this.f211687A = new C72791h();
        this.f211688B = i;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getWidth() < defaultDisplay.getHeight()) {
            defaultDisplay.getWidth();
            defaultDisplay.getHeight();
        } else {
            defaultDisplay.getHeight();
            defaultDisplay.getWidth();
        }
        View.inflate(this.f211711n, C0966R.C0971layout.f6498gg, this);
        this.f211714q = (MMDotView) findViewById(C0966R.C0970id.f6060w7);
        this.f211713p = (MMFlipper) findViewById(C0966R.C0970id.f6061w8);
        mo100320r();
        mo100334w();
        ((C119157j) C119157j.f356862d).mo183894y("AppPanel-loadinfo");
        ((C119157j) C119157j.f356862d).mo183876g(new C72761a(this), "AppPanel-loadinfo");
    }

    /* renamed from: r */
    public final void mo100320r() {
        Log.m105918d("MicroMsg.AppPanel", "AppPanel initFlipper");
        this.f211700N = -1;
        this.f211713p.removeAllViews();
        this.f211713p.setOnMeasureListener(new C72746a());
        this.f211713p.setOnFlipperViewShowedListener(new C72747b());
        this.f211713p.setOnScreenChangedListener(new C72748c());
        mo100332t();
    }

    /* renamed from: s */
    public void mo100321s() {
        Log.m105925i("MicroMsg.AppPanel", "app panel refleshed: %s", Integer.valueOf(this.f211688B));
        ((C119157j) C119157j.f356862d).mo183894y("AppPanel-loadinfo");
        ((C119157j) C119157j.f356862d).mo183876g(new C72761a(this), "AppPanel-loadinfo");
    }

    public void setAppPanelListener(C72752g gVar) {
        this.f211708h = gVar;
    }

    public void setAppPanelUnCertainEnterArrayList(ArrayList<C72791h.C44607a> arrayList) {
        this.f211687A.f212156E = arrayList;
    }

    public void setChattingContext(C67391b bVar) {
    }

    public void setChattingContext(ChatFooter$$i1 chatFooter$$i1) {
        this.f211710j = chatFooter$$i1;
    }

    public void setNeedRefreshHeight(boolean z) {
        this.f211702Q = z;
    }

    public void setOnSwitchPanelListener(C72753h hVar) {
        this.f211709i = hVar;
    }

    public void setPortHeighDP(int i) {
        if (f211685S != i) {
            f211685S = i;
            this.f211702Q = true;
        }
    }

    public void setPortHeighPx(int i) {
        if (this.f211703R != i) {
            this.f211703R = i;
            this.f211702Q = true;
        }
    }

    public void setServiceShowFlag(int i) {
        Log.m105925i("MicroMsg.AppPanel", "setServiceShowFlag: %s", Integer.valueOf(i));
        this.f211688B = i;
    }

    public void setUncertainEnterLocation(int i) {
        this.f211723z = i;
    }

    /* renamed from: t */
    public void mo100332t() {
        if (this.f211702Q) {
            if (getScreenOrientation() == 2) {
                Log.m105918d("MicroMsg.AppPanel", "initFlipper, landscape");
                View findViewById = findViewById(C0966R.C0970id.f6059w6);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                layoutParams.height = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f211711n, (float) 158);
                findViewById.setLayoutParams(layoutParams);
            } else {
                Log.m105919d("MicroMsg.AppPanel", "initFlipper, portrait: %d", Integer.valueOf(f211685S));
                View findViewById2 = findViewById(C0966R.C0970id.f6059w6);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
                layoutParams2.height = getPortHeightPX();
                findViewById2.setLayoutParams(layoutParams2);
            }
            this.f211702Q = false;
        }
    }

    /* renamed from: v */
    public void mo100333v() {
        boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72515h() == 2;
        C72791h hVar = this.f211687A;
        hVar.f212163g.f212183a = true;
        hVar.f212169m.f212183a = z;
        C88144b.m109788f(FirebaseAnalytics.C113379b.LOCATION);
        C72791h hVar2 = this.f211687A;
        hVar2.f212173q.f212183a = true;
        hVar2.f212171o.f212183a = true;
        this.f211687A.f212155D.f212183a = ((C75798k) C86312j.m106911c(C75798k.class)).mo106093Il();
    }

    /* renamed from: w */
    public void mo100334w() {
        C72791h hVar = this.f211687A;
        hVar.f212157a.f212183a = true;
        hVar.f212158b.f212183a = true;
        hVar.f212159c.f212183a = true;
        hVar.f212160d.f212183a = true;
        hVar.f212161e.f212183a = true;
        hVar.f212162f.f212183a = true;
        hVar.f212163g.f212183a = true;
        hVar.f212172p.f212183a = true;
        hVar.f212170n.f212183a = true;
        hVar.f212164h.f212183a = true;
        hVar.f212165i.f212183a = true;
        hVar.f212166j.f212183a = true;
        hVar.f212167k.f212183a = true;
        hVar.f212168l.f212183a = true;
        hVar.f212169m.f212183a = true;
        hVar.f212171o.f212183a = true;
        hVar.f212173q.f212183a = true;
        hVar.f212174r.f212183a = false;
        hVar.f212175s.f212183a = true;
        hVar.f212176t.f212183a = true;
        C72791h.C72792c cVar = hVar.f212178v;
        cVar.f212183a = true;
        hVar.f212179w.f212183a = true;
        cVar.f212183a = false;
        hVar.f212153B.f212183a = false;
        hVar.f212180x.f212183a = true;
        hVar.f212181y.f212183a = true;
        hVar.f212182z.f212183a = true;
        hVar.f212154C.f212183a = true;
        hVar.f212155D.f212183a = true;
        this.f211693G = false;
        this.f211694H = false;
        this.f211695I = false;
        this.f211696J = false;
        mo100333v();
        C72791h hVar2 = this.f211687A;
        hVar2.f212164h.f212183a = this.f211689C;
        hVar2.f212165i.f212183a = this.f211690D;
        hVar2.f212176t.f212183a = this.f211691E;
        hVar2.f212179w.f212183a = this.f211692F;
        mo100316o();
    }

    /* renamed from: x */
    public final void mo100335x(String str) {
        Log.m105925i("MicroMsg.AppPanel", "showForbiddenDialog: %s", str);
        C77426q qVar = new C77426q(this.f211711n);
        qVar.mo107595g(str);
        qVar.mo107589a(true);
        qVar.mo107601m(C0966R.string.lkg);
        qVar.mo107600l(new C72751f(this));
        qVar.mo107593e(new C72750e(this));
        qVar.mo107603o();
    }
}
