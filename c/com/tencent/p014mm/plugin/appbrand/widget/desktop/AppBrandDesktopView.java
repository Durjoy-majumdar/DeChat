package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C0406o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68688d;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dt0.C75449i;
import dt0.g$$a;
import f40.C86709a0;
import ft0.C75793a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ky2.C10432i;
import nj3.C76879j;
import p282z2.C16095a;
import p910lj.C76701a;
import qo3.C77398g;
import u73.C101982p;
import u73.C14134p0;
import xt0.C78978c;
import xt0.C78980e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView */
public class AppBrandDesktopView extends DragRecyclerView implements C68691e {

    /* renamed from: o0 */
    public static final int f197244o0 = C76577a.m92151b(MMApplicationContext.getContext(), 100);

    /* renamed from: B1 */
    public int f197245B1 = 4;

    /* renamed from: C1 */
    public C68691e.C68693b f197246C1;

    /* renamed from: D1 */
    public C75449i f197247D1;

    /* renamed from: E1 */
    public ArrayList<C68691e.C68692a> f197248E1 = new ArrayList<>();

    /* renamed from: F1 */
    public Context f197249F1;

    /* renamed from: G1 */
    public C68680h f197250G1 = null;

    /* renamed from: H1 */
    public boolean f197251H1 = true;

    /* renamed from: I1 */
    public boolean f197252I1 = false;

    /* renamed from: J1 */
    public ThreeDotsLoadingView f197253J1;

    /* renamed from: K1 */
    public Toast f197254K1;

    /* renamed from: L1 */
    public boolean f197255L1;

    /* renamed from: M1 */
    public int f197256M1;

    /* renamed from: N1 */
    public RecyclerView.C16613e f197257N1;

    /* renamed from: O1 */
    public AppBrandDesktopDragView f197258O1;

    /* renamed from: P1 */
    public int f197259P1 = 0;

    /* renamed from: Q1 */
    public int f197260Q1 = -1;

    /* renamed from: R1 */
    public int f197261R1 = -1;

    /* renamed from: S1 */
    public int f197262S1;

    /* renamed from: T1 */
    public int f197263T1 = C76577a.m92155f(getContext(), C0966R.dimen.f3705bx);

    /* renamed from: U1 */
    public View f197264U1;

    /* renamed from: V1 */
    public String f197265V1 = "";

    /* renamed from: W1 */
    public C68688d.C68689a f197266W1 = new C68671a();

    /* renamed from: X1 */
    public int f197267X1 = ViewConfiguration.get(MMApplicationContext.getContext()).getScaledTouchSlop();

    /* renamed from: Y1 */
    public float f197268Y1 = 0.0f;

    /* renamed from: Z1 */
    public float f197269Z1 = 0.0f;

    /* renamed from: a2 */
    public boolean f197270a2 = false;

    /* renamed from: b2 */
    public boolean f197271b2 = false;

    /* renamed from: c2 */
    public Interpolator f197272c2 = new DecelerateInterpolator();

    /* renamed from: d2 */
    public RecyclerView.C0130p f197273d2 = new C68672b();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$a */
    public class C68671a implements C68688d.C68689a {
        public C68671a() {
        }

        /* renamed from: a */
        public void mo94423a(float f, float f2) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo94424b(int r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView r0 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.this
                int r1 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.f197244o0
                r0.getClass()
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r2[r3] = r4
                java.lang.String r4 = "MicroMsg.AppBrandDesktopView"
                java.lang.String r5 = "alvinluo reorderCollection %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
                dt0.i r2 = r0.f197247D1
                int r2 = r2.mo105791e()
                r5 = 2
                if (r2 == r5) goto L_0x0022
                goto L_0x004a
            L_0x0022:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r6 = 0
            L_0x0028:
                java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r7 = r0.f197248E1
                int r7 = r7.size()
                if (r6 >= r7) goto L_0x0042
                java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r7 = r0.f197248E1
                java.lang.Object r7 = r7.get(r6)
                com.tencent.mm.plugin.appbrand.widget.desktop.e$a r7 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r7
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r7 = r7.f197340a
                if (r7 == 0) goto L_0x003f
                r2.add(r7)
            L_0x003f:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0042:
                xt0.e r0 = xt0.C78980e.f231921a
                xt0.c r0 = r0.mo108957a()
                if (r0 != 0) goto L_0x004c
            L_0x004a:
                r0 = 0
                goto L_0x0057
            L_0x004c:
                boolean r0 = r0.Fq0(r2, r3)
                if (r0 != 0) goto L_0x0057
                java.lang.String r2 = "alvinluo reorederCollection failed, needProcessResult: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
            L_0x0057:
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r2[r3] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                r2[r1] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
                r2[r5] = r0
                java.lang.String r0 = "alvinluo collection reorderCollection result: %b, startPos: %d, endPos: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
                com.tencent.mm.plugin.appbrand.widget.desktop.e$a r11 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r11
                if (r9 == r10) goto L_0x0080
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView r0 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.this
                com.tencent.mm.plugin.appbrand.widget.desktop.e$b r0 = r0.f197246C1
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r11 = r11.f197340a
                int r9 = r9 - r1
                int r10 = r10 - r1
                r0.mo94384b(r11, r9, r10)
            L_0x0080:
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView r9 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.this
                r9.mo94407B1()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.C68671a.mo94424b(int, int, java.lang.Object):void");
        }

        /* renamed from: c */
        public void mo94425c(int i, boolean z, boolean z2) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r8 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r8;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo94426d(java.lang.Object r8, int r9) {
            /*
                r7 = this;
                if (r8 != 0) goto L_0x0003
                return
            L_0x0003:
                com.tencent.mm.plugin.appbrand.widget.desktop.e$a r8 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r8
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r0 = r8.f197340a
                if (r0 == 0) goto L_0x0047
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = r0.f239040d
                r3 = 0
                r1[r3] = r2
                r2 = 1
                int r0 = r0.f239042f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1[r2] = r0
                java.lang.String r0 = "MicroMsg.AppBrandDesktopView"
                java.lang.String r2 = "alvinluo AppBrandDesktopView removeUsage username: %s, versionType: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
                xt0.e r0 = xt0.C78980e.f231921a
                xt0.k r0 = r0.mo108958b()
                if (r0 == 0) goto L_0x0047
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r1 = r8.f197340a
                java.lang.String r2 = r1.f239040d
                int r1 = r1.f239042f
                boolean r0 = r0.mo94252nw(r2, r1)
                if (r0 == 0) goto L_0x0047
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView r0 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.this
                com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.m80912x1(r0, r3)
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView r0 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.this
                com.tencent.mm.plugin.appbrand.widget.desktop.e$b r1 = r0.f197246C1
                r2 = 0
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r3 = r8.f197340a
                r5 = 0
                r6 = 2
                r4 = r9
                r1.mo94385k(r2, r3, r4, r5, r6)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.C68671a.mo94426d(java.lang.Object, int):void");
        }

        /* renamed from: e */
        public void mo94427e(Object obj, int i) {
            LocalUsageInfo localUsageInfo;
            if (obj != null && (obj instanceof C68691e.C68692a)) {
                C68691e.C68692a aVar = (C68691e.C68692a) obj;
                if (aVar.f197341b == 2 && (localUsageInfo = aVar.f197340a) != null) {
                    Log.m105925i("MicroMsg.AppBrandDesktopView", "desktop removeCollection %s", localUsageInfo.f239044h);
                    C78978c a = C78980e.f231921a.mo108957a();
                    if (a != null) {
                        LocalUsageInfo localUsageInfo2 = aVar.f197340a;
                        if (a.mo94244mJ(localUsageInfo2.f239040d, localUsageInfo2.f239042f)) {
                            AppBrandDesktopView.m80912x1(AppBrandDesktopView.this, false);
                            AppBrandDesktopView.this.f197246C1.mo94385k(false, aVar.f197340a, i, true, 3);
                            AppBrandDesktopView.this.mo94407B1();
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo94428f(Object obj) {
            if (obj instanceof C68691e.C68692a) {
                C78978c a = C78980e.f231921a.mo108957a();
                LocalUsageInfo localUsageInfo = ((C68691e.C68692a) obj).f197340a;
                if (a != null && localUsageInfo != null) {
                    Log.m105925i("MicroMsg.AppBrandDesktopView", "desktop addCollection %s", localUsageInfo.f239044h);
                    int rg02 = a.rg0(localUsageInfo.f239040d, localUsageInfo.f239042f);
                    if (rg02 == 0) {
                        AppBrandDesktopView.m80912x1(AppBrandDesktopView.this, true);
                        AppBrandDesktopView.this.f197246C1.mo94385k(true, localUsageInfo, 0, true, 2);
                    } else if (rg02 == -2) {
                        int Tk = ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94241Tk();
                        C77398g y = C76879j.m92754y(AppBrandDesktopView.this.getContext(), AppBrandDesktopView.this.getContext().getResources().getString(C0966R.string.f7659my, new Object[]{Integer.valueOf(Tk)}), "", AppBrandDesktopView.this.getContext().getResources().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                        if (y != null) {
                            y.mo107530l(true);
                            y.setCanceledOnTouchOutside(false);
                            y.show();
                        }
                    } else if (rg02 == -3) {
                        C77398g y2 = C76879j.m92754y(AppBrandDesktopView.this.getContext(), AppBrandDesktopView.this.getContext().getResources().getString(C0966R.string.f7600kw), "", AppBrandDesktopView.this.getContext().getResources().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                        if (y2 != null) {
                            y2.mo107530l(true);
                            y2.setCanceledOnTouchOutside(false);
                            y2.show();
                        }
                    } else {
                        C76701a.makeText(AppBrandDesktopView.this.getContext(), (CharSequence) AppBrandDesktopView.this.getContext().getString(C0966R.string.f7639ma), 0).show();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$b */
    public class C68672b extends RecyclerView.C0130p {
        public C68672b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            if (i == 0) {
                AppBrandDesktopView appBrandDesktopView = AppBrandDesktopView.this;
                int i2 = AppBrandDesktopView.f197244o0;
                appBrandDesktopView.mo94422z1();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$c */
    public class C68673c extends C54256s {
        public C68673c(Context context) {
            super(context);
        }

        /* renamed from: m */
        public int mo10340m(int i) {
            return super.mo10340m(C16095a.m14980b(i, Math.round(((float) AppBrandDesktopView.this.getContext().getResources().getDisplayMetrics().heightPixels) * 0.75f), 3000));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$d */
    public class C68674d extends GridLayoutManager.C0127b {
        public C68674d() {
        }

        /* renamed from: c */
        public int mo118c(int i) {
            int itemViewType = AppBrandDesktopView.this.getAdapter().getItemViewType(i);
            if (itemViewType == 3 || itemViewType == 4 || itemViewType == 6) {
                return AppBrandDesktopView.this.f197245B1;
            }
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$e */
    public class C68675e extends RecyclerView.C16631z {
        public C68675e(AppBrandDesktopView appBrandDesktopView, View view) {
            super(view);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$g */
    public class C68678g extends RecyclerView.C16631z {

        /* renamed from: A */
        public View.OnClickListener f197283A = new C68679a();

        /* renamed from: z */
        public TextView f197285z;

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$g$a */
        public class C68679a implements View.OnClickListener {
            public C68679a() {
            }

            public void onClick(View view) {
                Class cls = C101982p.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.AppBrandDesktopView", "alvinluo AppbrandDesktop search jump to AppBrandSearchUI");
                System.currentTimeMillis();
                if (((C101982p) C86312j.m106911c(cls)) != null) {
                    AppBrandDesktopView appBrandDesktopView = AppBrandDesktopView.this;
                    appBrandDesktopView.f197246C1.mo94380R(12, true, appBrandDesktopView.f197247D1.mo105791e() == 2, (String) null);
                    C14134p0 p0Var = new C14134p0();
                    p0Var.f39545b = 42;
                    p0Var.f39546c = 262208;
                    String str = AppBrandDesktopView.this.f197265V1;
                    p0Var.f39565v = !((C0406o) C86312j.m106911c(C0406o.class)).yv0(42, 262208);
                    ((C101982p) C86312j.m106911c(cls)).mo6883yJ(AppBrandDesktopView.this.f197249F1, p0Var);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C68678g(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.f5880r8);
            this.f197285z = textView;
            if (textView != null) {
                textView.setFocusable(false);
                this.f197285z.setOnClickListener(this.f197283A);
                this.f197285z.setImportantForAccessibility(2);
                view.setImportantForAccessibility(1);
                view.setContentDescription(AppBrandDesktopView.this.getContext().getString(C0966R.string.f7267az));
            }
            view.setOnClickListener(this.f197283A);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$h */
    public static class C68680h extends GridLayoutManager {
        public C68680h(Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }
    }

    public AppBrandDesktopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80911A1(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011e  */
    /* renamed from: A1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80911A1(android.content.Context r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r1.f197249F1 = r2
            r18.mo94410E1()
            r18.mo94409D1()
            android.content.Context r3 = r1.f197249F1
            float r0 = dt0.C75442a.f221749a
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "MicroMsg.AppBrandDesktopConfig"
            java.lang.String r7 = "alvinluo DesktopConfig init mCurrentType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r0)
            r7 = 1082130432(0x40800000, float:4.0)
            dt0.C75442a.f221749a = r7
            r8 = 4
            dt0.C75442a.f221750b = r8
            r0 = 1077936128(0x40400000, float:3.0)
            dt0.C75442a.f221751c = r0
            r9 = 3
            dt0.C75442a.f221752d = r9
            dt0.C75442a.f221753e = r7
            dt0.C75442a.f221754f = r8
            java.lang.String r10 = "MicroMsg.AppBrandDesktopSizeHelper"
            r11 = 2
            if (r3 != 0) goto L_0x003b
            r14 = 0
            goto L_0x0147
        L_0x003b:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x0088 }
            r0.<init>()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r12 = "window"
            java.lang.Object r12 = r3.getSystemService(r12)     // Catch:{ Exception -> 0x0088 }
            android.view.WindowManager r12 = (android.view.WindowManager) r12     // Catch:{ Exception -> 0x0088 }
            android.view.Display r12 = r12.getDefaultDisplay()     // Catch:{ Exception -> 0x0088 }
            r12.getMetrics(r0)     // Catch:{ Exception -> 0x0088 }
            android.content.res.Resources r12 = r3.getResources()     // Catch:{ Exception -> 0x0088 }
            android.content.res.Configuration r12 = r12.getConfiguration()     // Catch:{ Exception -> 0x0088 }
            int r12 = r12.orientation     // Catch:{ Exception -> 0x0088 }
            if (r12 != r11) goto L_0x0077
            boolean r12 = com.tencent.p014mm.p136ui.C85875k4.m106205t(r3, r6)     // Catch:{ Exception -> 0x0088 }
            if (r12 == 0) goto L_0x0069
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r3)     // Catch:{ Exception -> 0x0088 }
            int r0 = r0.x     // Catch:{ Exception -> 0x0088 }
            goto L_0x0091
        L_0x0069:
            android.content.res.Resources r12 = r3.getResources()     // Catch:{ Exception -> 0x0088 }
            android.content.res.Configuration r12 = r12.getConfiguration()     // Catch:{ Exception -> 0x0088 }
            int r12 = r12.screenHeightDp     // Catch:{ Exception -> 0x0088 }
            float r12 = (float) r12     // Catch:{ Exception -> 0x0088 }
            float r0 = r0.density     // Catch:{ Exception -> 0x0088 }
            goto L_0x0084
        L_0x0077:
            android.content.res.Resources r12 = r3.getResources()     // Catch:{ Exception -> 0x0088 }
            android.content.res.Configuration r12 = r12.getConfiguration()     // Catch:{ Exception -> 0x0088 }
            int r12 = r12.screenWidthDp     // Catch:{ Exception -> 0x0088 }
            float r12 = (float) r12     // Catch:{ Exception -> 0x0088 }
            float r0 = r0.density     // Catch:{ Exception -> 0x0088 }
        L_0x0084:
            float r12 = r12 * r0
            int r0 = (int) r12
            goto L_0x0091
        L_0x0088:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r13 = "alvinluo getScreenWidth exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r13, r12)
            r0 = 0
        L_0x0091:
            r12 = 2131165847(0x7f070297, float:1.7945923E38)
            int r12 = kg3.C76577a.m92155f(r3, r12)
            float r12 = (float) r12
            float r13 = dt0.C75447f.m90469a(r3)
            float r12 = r12 * r13
            int r12 = (int) r12
            dt0.C75446e.f221762a = r6
            android.content.res.Resources r13 = r3.getResources()
            r14 = 2131165848(0x7f070298, float:1.7945925E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            float r14 = dt0.C75447f.m90469a(r3)
            kg3.C76577a.m92172w(r3)
            r15 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x00f3
            float r15 = kg3.C76577a.m92173x(r3)
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 != 0) goto L_0x00c3
            goto L_0x00f3
        L_0x00c3:
            float r13 = kg3.C76577a.m92171v(r3)
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x00e8
            float r13 = kg3.C76577a.m92174y(r3)
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x00e8
            float r13 = kg3.C76577a.m92167r(r3)
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00dc
            goto L_0x00e8
        L_0x00dc:
            android.content.res.Resources r13 = r3.getResources()
            r14 = 2131165590(0x7f070196, float:1.7945401E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            goto L_0x00f3
        L_0x00e8:
            android.content.res.Resources r13 = r3.getResources()
            r14 = 2131165553(0x7f070171, float:1.7945326E38)
            int r13 = r13.getDimensionPixelOffset(r14)
        L_0x00f3:
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            r14[r6] = r15
            java.lang.String r15 = "alvinluo getLeftRightPadding: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r15, r14)
            int r14 = r13 * 2
            int r14 = r0 - r14
            int r15 = (int) r7
            int r16 = r12 * r15
            int r14 = r14 - r16
            int r17 = r15 + -1
            int r17 = r17 * 2
            int r14 = r14 / r17
            if (r14 <= r13) goto L_0x011a
            int r13 = r0 - r16
            int r15 = r15 * 2
            int r14 = r13 / r15
            dt0.C75446e.f221762a = r4
            goto L_0x011c
        L_0x011a:
            dt0.C75446e.f221762a = r6
        L_0x011c:
            if (r14 >= 0) goto L_0x011f
            r14 = 0
        L_0x011f:
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13[r6] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r13[r4] = r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r11] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            r13[r9] = r0
            boolean r0 = dt0.C75446e.f221762a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13[r8] = r0
            java.lang.String r0 = "alvinluo itemWidth: %d, itemPadding: %d, viewWidth: %d, countPerPage: %f, leftRightPaddingZero: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r0, r13)
        L_0x0147:
            float r0 = (float) r14
            android.content.res.Resources r7 = r3.getResources()
            r10 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r7 = r7.getDimensionPixelSize(r10)
            int r7 = r7 * 2
            float r7 = (float) r7
            float r10 = dt0.C75447f.m90469a(r3)
            float r7 = r7 * r10
            float r0 = r0 + r7
            int r0 = (int) r0
            r7 = 10
            int r3 = kg3.C76577a.m92151b(r3, r7)
            if (r0 > r3) goto L_0x016f
            float r0 = dt0.C75442a.f221751c
            dt0.C75442a.f221753e = r0
            int r0 = dt0.C75442a.f221752d
            dt0.C75442a.f221754f = r0
            goto L_0x0177
        L_0x016f:
            float r0 = dt0.C75442a.f221749a
            dt0.C75442a.f221753e = r0
            int r0 = dt0.C75442a.f221750b
            dt0.C75442a.f221754f = r0
        L_0x0177:
            dt0.C75442a.f221755g = r9
            int r0 = java.lang.Math.max(r9, r4)
            dt0.C75442a.f221755g = r0
            int r0 = java.lang.Math.min(r0, r8)
            dt0.C75442a.f221755g = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            float r3 = dt0.C75442a.f221753e
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r6] = r3
            int r3 = dt0.C75442a.f221754f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r4] = r3
            int r3 = dt0.C75442a.f221755g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r11] = r3
            java.lang.String r3 = "alvinluo DesktopConfig init showCountPerPage: %f, completelyShowCountPerPage: %d, mRecentAppBrandMaxShowLines: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r0)
            r1.setVerticalFadingEdgeEnabled(r6)
            r1.setNestedScrollingEnabled(r4)
            android.content.Context r0 = r18.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r0 = r0.getColor(r3)
            r1.setBackgroundColor(r0)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$h r0 = new com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$h
            int r3 = r1.f197245B1
            r0.<init>(r2, r3, r4, r6)
            r1.f197250G1 = r0
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$d r2 = new com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$d
            r2.<init>()
            r0.f44666B = r2
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$h r0 = r1.f197250G1
            r1.setLayoutManager(r0)
            r1.setOverScrollMode(r11)
            androidx.recyclerview.widget.RecyclerView$p r0 = r1.f197273d2
            r1.mo17043c(r0)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$f r0 = new com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$f
            r2 = 0
            r0.<init>(r2)
            r1.f197257N1 = r0
            r1.setAdapter(r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r2 = r18.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r6] = r2
            java.lang.String r2 = "MicroMsg.AppBrandDesktopView"
            java.lang.String r3 = "alvinluo DesktopView init %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            android.content.Context r0 = r18.getContext()
            int r0 = kg3.C76577a.m92145A(r0)
            r1.mo94408C1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.m80911A1(android.content.Context):void");
    }

    private int getCollectionDataSize() {
        return (this.f197248E1.size() - (this.f197251H1 ? 1 : 0)) - 1;
    }

    /* renamed from: x1 */
    public static void m80912x1(AppBrandDesktopView appBrandDesktopView, boolean z) {
        Toast toast = appBrandDesktopView.f197254K1;
        if (toast != null) {
            toast.cancel();
        }
        appBrandDesktopView.f197254K1 = C76701a.makeText(appBrandDesktopView.getContext(), (CharSequence) "", 0);
        View inflate = View.inflate(appBrandDesktopView.getContext(), C0966R.C0971layout.f6796os, (ViewGroup) null);
        appBrandDesktopView.f197254K1.setGravity(17, 0, 0);
        appBrandDesktopView.f197254K1.setView(inflate);
        ((TextView) appBrandDesktopView.f197254K1.getView().findViewById(C0966R.C0970id.kpy)).setText(z ? C0966R.string.f7909vy : C0966R.string.f7664n6);
        appBrandDesktopView.f197254K1.show();
    }

    /* renamed from: B1 */
    public final void mo94407B1() {
        Log.m105924i("MicroMsg.AppBrandDesktopView", "notifyDataChanged");
        RecyclerView.C16613e eVar = this.f197257N1;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    /* renamed from: C1 */
    public final void mo94408C1(int i) {
        float b = (float) C76577a.m92151b(getContext(), 37);
        int f = C76577a.m92155f(getContext(), C0966R.dimen.f3745cw);
        boolean z = this.f197251H1;
        C75793a.f222400a.mo106091a(this, b, i, f, z ? 1 : 0, C76577a.m92155f(getContext(), C0966R.dimen.f3749d0));
    }

    /* renamed from: D1 */
    public final void mo94409D1() {
        C68691e.C68692a aVar;
        boolean z = !this.f197255L1;
        this.f197251H1 = z;
        Log.m105925i("MicroMsg.AppBrandDesktopView", "alvinluo updateShowSearchStatus showSearch: %b", Boolean.valueOf(z));
        if (this.f197251H1) {
            if (this.f197248E1.size() == 0) {
                Log.m105924i("MicroMsg.AppBrandDesktopView", "showSearch, dataListSize = 0");
                this.f197248E1.add(0, new C68691e.C68692a(4));
                mo94407B1();
                return;
            }
            C68691e.C68692a aVar2 = this.f197248E1.get(0);
            if (aVar2 == null || aVar2.f197341b != 4) {
                Log.m105924i("MicroMsg.AppBrandDesktopView", "showSearch, insert search");
                this.f197248E1.add(0, new C68691e.C68692a(4));
                mo94407B1();
            }
        } else if (this.f197248E1.size() > 0 && (aVar = this.f197248E1.get(0)) != null && aVar.f197341b == 4) {
            Log.m105924i("MicroMsg.AppBrandDesktopView", "remove search");
            this.f197248E1.remove(0);
            mo94407B1();
        }
    }

    /* renamed from: E1 */
    public final void mo94410E1() {
        Class cls = C10432i.class;
        this.f197255L1 = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        this.f197256M1 = ((C10432i) C86312j.m106911c(cls)).Oh0();
        Log.m105925i("MicroMsg.AppBrandDesktopView", "alvinluo updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", Boolean.valueOf(this.f197255L1), Integer.valueOf(this.f197256M1));
    }

    /* renamed from: X */
    public void mo94411X(boolean z) {
        Log.m105924i("MicroMsg.AppBrandDesktopView", "reset");
        AppBrandDesktopDragView appBrandDesktopDragView = this.f197258O1;
        if (appBrandDesktopDragView != null) {
            appBrandDesktopDragView.mo94431a();
        }
        this.f197260Q1 = -1;
        this.f197261R1 = -1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "reset", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "reset", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        setTranslationY(0.0f);
        C68691e.C68693b bVar = this.f197246C1;
        if (bVar != null) {
            bVar.mo94386q(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94412a(dt0.C75449i r9) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r9.mo105791e()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.AppBrandDesktopView"
            java.lang.String r4 = "desktop show:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            r8.f197247D1 = r9
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            if (r1 != 0) goto L_0x002d
            android.view.View r1 = r8.getRootView()
            if (r1 != 0) goto L_0x0022
            goto L_0x005a
        L_0x0022:
            r4 = 2131301203(0x7f091353, float:1.8220457E38)
            android.view.View r1 = r1.findViewById(r4)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView) r1
            r8.f197258O1 = r1
        L_0x002d:
            java.lang.String r1 = "configDragFeatureView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            r1.setRecyclerView(r8)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r4 = r8.f197248E1
            r1.setList(r4)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            com.tencent.mm.plugin.appbrand.widget.desktop.d$a r4 = r8.f197266W1
            r1.setAppBrandDragCallback(r4)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            int r4 = r8.f197259P1
            r1.setViewWidth(r4)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            r1.setCanMyWeAppMove(r0)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            r1.setShouldDoDeleteAnimation(r0)
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            r8.f197327z1 = r1
        L_0x005a:
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = r8.f197258O1
            int r9 = r9.mo105791e()
            if (r9 != r0) goto L_0x0064
            r9 = 1
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            r1.mo94432b(r9)
            dt0.i r9 = r8.f197247D1
            if (r9 != 0) goto L_0x006e
            goto L_0x0100
        L_0x006e:
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r9 = r8.f197248E1
            r9.clear()
            boolean r9 = r8.f197251H1
            if (r9 == 0) goto L_0x0082
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r9 = r8.f197248E1
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r1 = new com.tencent.mm.plugin.appbrand.widget.desktop.e$a
            r4 = 4
            r1.<init>((int) r4)
            r9.add(r1)
        L_0x0082:
            dt0.i r9 = r8.f197247D1
            java.util.List r9 = r9.mo105787a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "jacob get dataList "
            r1.append(r4)
            java.util.Iterator r4 = r9.iterator()
            java.lang.String r5 = ""
        L_0x0098:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00bd
            java.lang.Object r6 = r4.next()
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r6 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r5 = r6.f197340a
            java.lang.String r5 = r5.f239044h
            r7.append(r5)
            java.lang.String r5 = " "
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            goto L_0x0098
        L_0x00bd:
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r1 = r8.f197248E1
            r1.addAll(r9)
            r8.mo94421y1()
            r8.mo94407B1()
            com.tencent.mm.plugin.appbrand.widget.desktop.e$b r1 = r8.f197246C1
            dt0.i r4 = r8.f197247D1
            int r4 = r4.mo105791e()
            r5 = 2
            if (r4 != r5) goto L_0x00df
            r4 = 1
            goto L_0x00e0
        L_0x00df:
            r4 = 0
        L_0x00e0:
            int r6 = r9.size()
            r1.mo94387t(r4, r6)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            boolean r4 = r8.f197251H1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1[r3] = r4
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r0] = r9
            java.lang.String r9 = "make data, search:%b count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r1)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.mo94412a(dt0.i):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0 != 3) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f197325A1
            if (r0 == 0) goto L_0x0009
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        L_0x0009:
            int r0 = r6.getAction()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x00ce
            r3 = 1
            if (r0 == r3) goto L_0x008c
            r4 = 2
            if (r0 == r4) goto L_0x001c
            r3 = 3
            if (r0 == r3) goto L_0x008c
            goto L_0x00da
        L_0x001c:
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$h r0 = r5.f197250G1
            if (r0 == 0) goto L_0x0032
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r4 = r5.f197248E1
            if (r4 == 0) goto L_0x0032
            int r0 = r0.mo16958D()
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.widget.desktop.e$a> r4 = r5.f197248E1
            int r4 = r4.size()
            int r4 = r4 - r3
            if (r0 != r4) goto L_0x0032
            r1 = 1
        L_0x0032:
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            if (r1 == 0) goto L_0x0069
            boolean r1 = r5.f197270a2
            if (r1 != 0) goto L_0x0069
            dt0.i r1 = r5.f197247D1
            boolean r1 = r1.mo105789c()
            if (r1 != 0) goto L_0x00da
            boolean r1 = r5.f197271b2
            if (r1 != 0) goto L_0x0053
            float r0 = r6.getRawY()
            r5.f197268Y1 = r0
            r5.f197269Z1 = r2
            r5.f197271b2 = r3
            goto L_0x00da
        L_0x0053:
            float r1 = r6.getRawY()
            float r2 = r5.f197268Y1
            float r1 = r1 - r2
            float r1 = r1 * r0
            r5.f197269Z1 = r1
            int r0 = r5.f197267X1
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00da
            r5.f197270a2 = r3
            goto L_0x00da
        L_0x0069:
            boolean r1 = r5.f197270a2
            if (r1 == 0) goto L_0x00da
            float r1 = r6.getRawY()
            float r4 = r5.f197268Y1
            float r1 = r1 - r4
            float r1 = r1 * r0
            r5.f197269Z1 = r1
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0081
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        L_0x0081:
            float r6 = java.lang.Math.abs(r1)
            int r6 = (int) r6
            int r6 = -r6
            float r6 = (float) r6
            r5.setTranslationY(r6)
            return r3
        L_0x008c:
            r5.mo94422z1()
            boolean r0 = r5.f197270a2
            if (r0 != 0) goto L_0x0094
            goto L_0x00c7
        L_0x0094:
            float r0 = r5.f197269Z1
            float r0 = java.lang.Math.abs(r0)
            int r3 = f197244o0
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00b0
            java.lang.String r0 = "MicroMsg.AppBrandDesktopView"
            java.lang.String r3 = "alvinluo checkAndClose closeHeader because of pull up bottom"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.plugin.appbrand.widget.desktop.e$b r0 = r5.f197246C1
            r3 = 15
            r0.mo94383a0(r3)
            goto L_0x00c7
        L_0x00b0:
            android.view.ViewPropertyAnimator r0 = r5.animate()
            android.view.ViewPropertyAnimator r0 = r0.translationY(r2)
            r3 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            android.view.animation.Interpolator r3 = r5.f197272c2
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r3)
            r0.start()
        L_0x00c7:
            r5.f197269Z1 = r2
            r5.f197270a2 = r1
            r5.f197271b2 = r1
            goto L_0x00da
        L_0x00ce:
            float r0 = r6.getRawY()
            r5.f197268Y1 = r0
            r5.f197269Z1 = r2
            r5.f197270a2 = r1
            r5.f197271b2 = r1
        L_0x00da:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public RecyclerView getRecyclerView() {
        return this;
    }

    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public C75449i getViewModel() {
        return this.f197247D1;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        if (size != this.f197259P1) {
            this.f197259P1 = size;
            mo94408C1(size);
        }
        AppBrandDesktopDragView appBrandDesktopDragView = this.f197258O1;
        if (appBrandDesktopDragView != null) {
            appBrandDesktopDragView.setViewWidth(this.f197259P1);
        }
    }

    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            if (mo17031P0(view).mo17363j() >= this.f197250G1.mo16959E() - 4) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(this.f197250G1.mo16959E() + 1));
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                mo94422z1();
            } else if (mo17031P0(view).mo17363j() == this.f197250G1.mo16957C()) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(this.f197250G1.mo16957C() - 1));
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: r */
    public void mo94418r() {
        int itemCount;
        RecyclerView.C16613e eVar = this.f197257N1;
        if (eVar != null && (itemCount = eVar.getItemCount()) >= 1) {
            C68673c cVar = new C68673c(getContext());
            cVar.f44872a = itemCount - 1;
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(cVar);
            }
        }
    }

    public void setCallback(C68691e.C68693b bVar) {
        this.f197246C1 = bVar;
    }

    /* renamed from: y */
    public void mo94420y() {
        if (!((C119157j) C119157j.f356862d).f356864a.get()) {
            ((C119157j) C119157j.f356862d).mo183895z(new g$$a(this));
        }
    }

    /* renamed from: y1 */
    public final void mo94421y1() {
        if (this.f197247D1.mo105789c()) {
            Log.m105924i("MicroMsg.AppBrandDesktopView", "add more footer");
            this.f197248E1.add(new C68691e.C68692a(6));
            return;
        }
        Log.m105924i("MicroMsg.AppBrandDesktopView", "add normal footer");
        this.f197248E1.add(new C68691e.C68692a(3));
    }

    /* renamed from: z1 */
    public final void mo94422z1() {
        Log.m105924i("MicroMsg.AppBrandDesktopView", "checkTriggerLoadMore");
        if (this.f197247D1.mo105789c() && this.f197250G1.mo16959E() == this.f197248E1.size() - 1) {
            Log.m105925i("MicroMsg.AppBrandDesktopView", "start load more hasMore:%b isLoading:%b", Boolean.valueOf(this.f197247D1.mo105789c()), Boolean.valueOf(this.f197252I1));
            if (this.f197247D1.mo105789c() && !this.f197252I1) {
                this.f197252I1 = true;
                this.f197247D1.mo105788b(new C68686b(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$f */
    public class C68676f extends RecyclerView.C16613e {

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView$f$a */
        public class C68677a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C68687c f197279d;

            /* renamed from: e */
            public final /* synthetic */ C68691e.C68692a f197280e;

            /* renamed from: f */
            public final /* synthetic */ int f197281f;

            public C68677a(C68687c cVar, C68691e.C68692a aVar, int i) {
                this.f197279d = cVar;
                this.f197280e = aVar;
                this.f197281f = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                AppBrandDesktopView appBrandDesktopView = AppBrandDesktopView.this;
                if (appBrandDesktopView.f197325A1) {
                    Log.m105924i("MicroMsg.AppBrandDesktopView", "inLongPress, return");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                appBrandDesktopView.f197246C1.mo94379Q(this.f197279d.mo17363j() - (AppBrandDesktopView.this.f197251H1 ? 1 : 0), this.f197280e, this.f197281f == 2, true);
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C68676f(C68671a aVar) {
        }

        public int getItemCount() {
            return AppBrandDesktopView.this.f197248E1.size();
        }

        public int getItemViewType(int i) {
            C68691e.C68692a aVar = (i >= AppBrandDesktopView.this.f197248E1.size() || i < 0) ? null : AppBrandDesktopView.this.f197248E1.get(i);
            if (aVar != null) {
                return aVar.f197341b;
            }
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            if (list.size() == 0) {
                onBindViewHolder(zVar, i);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 2 || i == 1) {
                return new C68687c(C85868k2.m106137b(AppBrandDesktopView.this.getContext()).inflate(C0966R.C0971layout.f6515gy, viewGroup, false));
            }
            if (i == 3) {
                View view = new View(AppBrandDesktopView.this.getContext());
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AppBrandDesktopView.this.f197263T1));
                return new C68675e(AppBrandDesktopView.this, view);
            } else if (i == 4) {
                AppBrandDesktopView appBrandDesktopView = AppBrandDesktopView.this;
                appBrandDesktopView.f197264U1 = C85868k2.m106137b(appBrandDesktopView.getContext()).inflate(C0966R.C0971layout.f6397dq, viewGroup, false);
                AppBrandDesktopView appBrandDesktopView2 = AppBrandDesktopView.this;
                return new C68678g(appBrandDesktopView2.f197264U1);
            } else if (i == 6) {
                View inflate = C85868k2.m106137b(AppBrandDesktopView.this.getContext()).inflate(C0966R.C0971layout.f6396dp, viewGroup, false);
                AppBrandDesktopView.this.f197253J1 = (ThreeDotsLoadingView) inflate.findViewById(C0966R.C0970id.g3t);
                return new C68675e(AppBrandDesktopView.this, inflate);
            } else {
                return new C68675e(AppBrandDesktopView.this, C85868k2.m106137b(AppBrandDesktopView.this.getContext()).inflate(C0966R.C0971layout.bjo, viewGroup, false));
            }
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            AppBrandDesktopView appBrandDesktopView;
            ThreeDotsLoadingView threeDotsLoadingView;
            int i2 = zVar.f44859i;
            if (i2 == 3) {
                View view = zVar.f44854d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) zVar.f44854d.getLayoutParams();
                layoutParams.height = AppBrandDesktopView.this.f197263T1;
                zVar.f44854d.setLayoutParams(layoutParams);
                return;
            }
            if (i2 == 6 && (threeDotsLoadingView = AppBrandDesktopView.this.f197253J1) != null) {
                threeDotsLoadingView.mo119903e();
            }
            if (i2 == 4) {
                AppBrandDesktopView appBrandDesktopView2 = AppBrandDesktopView.this;
                if (zVar.f44854d != null) {
                    String str = appBrandDesktopView2.f197265V1;
                    Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WXA_SEARCH_FROM_DESKTOP_INPUT_HINT_CONTENT_STRING_SYNC, (Object) null);
                    if (f instanceof String) {
                        appBrandDesktopView2.f197265V1 = Util.nullAs((String) f, appBrandDesktopView2.f197265V1);
                    }
                    Log.m105925i("MicroMsg.AppBrandDesktopView", "alvinluo updateSearchWording last: %s, new: %s", str, appBrandDesktopView2.f197265V1);
                    return;
                }
                int i3 = AppBrandDesktopView.f197244o0;
                appBrandDesktopView2.getClass();
                return;
            }
            if (i2 == 1 || i2 == 2) {
                C68687c cVar = (C68687c) zVar;
                C68691e.C68692a aVar2 = (i >= AppBrandDesktopView.this.f197248E1.size() || i < 0) ? null : AppBrandDesktopView.this.f197248E1.get(i);
                if (aVar2 != null) {
                    cVar.f197328z = aVar2;
                    cVar.mo94473y(new C68677a(cVar, aVar2, i2), (View.OnLongClickListener) null);
                    if (AppBrandDesktopView.this.f197262S1 == 0) {
                        View view3 = zVar.f44854d;
                        view3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        Log.m105925i("MicroMsg.AppBrandDesktopView", "alvinluo onBindViewHolder itemHeight: %d, itemWidth: %d", Integer.valueOf(view3.getMeasuredHeight()), Integer.valueOf(view3.getMeasuredWidth()));
                        AppBrandDesktopView.this.f197262S1 = view3.getMeasuredHeight();
                    }
                    AppBrandDesktopView appBrandDesktopView3 = AppBrandDesktopView.this;
                    boolean z = i2 == 2;
                    if (i <= appBrandDesktopView3.f197261R1 || i > appBrandDesktopView3.f197260Q1) {
                        appBrandDesktopView3.f197246C1.mo94381T(aVar2.f197340a, z, true, false);
                    } else {
                        appBrandDesktopView3.f197246C1.mo94381T(aVar2.f197340a, z, true, true);
                    }
                    appBrandDesktopView3.f197261R1 = Math.max(appBrandDesktopView3.f197261R1, i);
                } else {
                    return;
                }
            }
            if (AppBrandDesktopView.this.getDragRubbishView() != null && AppBrandDesktopView.this.getDragRubbishView().getRecyclerView() == (appBrandDesktopView = AppBrandDesktopView.this)) {
                appBrandDesktopView.getDragRubbishView().mo94433c(zVar, i);
            }
        }
    }

    public AppBrandDesktopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80911A1(context);
    }
}
