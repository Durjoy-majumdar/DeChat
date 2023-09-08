package com.tencent.p014mm.sensitive.p135ui;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bh3.C113177k;
import bh3.C113185t;
import ch3.C113346a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sensitive.business.BusinessStackRecorder;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hh3.C117098f;
import ih3.C108462a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj3.C76912y0;
import o40.C61926c;
import p385u2.C111105a;
import p447aw.C103918d;
import qo3.C12925w;
import qo3.w$$d;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil */
public final class PermissionSwitchCheckUtil {

    /* renamed from: a */
    public static final PermissionSwitchCheckUtil f347926a = new PermissionSwitchCheckUtil();

    /* renamed from: b */
    public static final String f347927b = "PermissionSwitchCheckUtil";

    /* renamed from: c */
    public static final HashMap<String, Boolean> f347928c = new HashMap<>();

    /* renamed from: d */
    public static final String[] f347929d = {"LauncherUI", "ComposeUI", "AlbumPreviewUI", "MultiStageCitySelectUI", "FinderPostUI"};

    /* renamed from: e */
    public static final String f347930e = "MMKV_KEY_EXPT_PERMISSION_DIALOG";

    /* renamed from: f */
    public static final MultiProcessMMKV f347931f = MultiProcessMMKV.getMMKV("MMKV_KEY_EXPT_VALUE");

    /* renamed from: g */
    public static final IListener<ExptChangeEvent> f347932g = new PermissionSwitchCheckUtil$listener$1(C40008f.f107254d);

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$a */
    public static final class C116001a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f347933d;

        /* renamed from: e */
        public final /* synthetic */ C12925w f347934e;

        /* renamed from: f */
        public final /* synthetic */ Activity f347935f;

        /* renamed from: g */
        public final /* synthetic */ C113177k.C113179b f347936g;

        /* renamed from: h */
        public final /* synthetic */ C113177k.C113178a f347937h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f347938i;

        /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$a$a */
        public static final class C116002a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Activity f347939d;

            /* renamed from: e */
            public final /* synthetic */ C113177k.C113179b f347940e;

            /* renamed from: f */
            public final /* synthetic */ C113177k.C113178a f347941f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f347942g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C116002a(Activity activity, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
                super(0);
                this.f347939d = activity;
                this.f347940e = bVar;
                this.f347941f = aVar;
                this.f347942g = lVar;
            }

            public Object invoke() {
                PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
                permissionSwitchCheckUtil.getClass();
                HashMap<String, Boolean> hashMap = PermissionSwitchCheckUtil.f347928c;
                hashMap.remove(this.f347939d + '_' + this.f347940e.f338672d);
                permissionSwitchCheckUtil.mo176851h(this.f347939d, this.f347940e, this.f347941f, this.f347942g);
                return C13598b0.f38549a;
            }
        }

        public C116001a(C8477a0 a0Var, C12925w wVar, Activity activity, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f347933d = a0Var;
            this.f347934e = wVar;
            this.f347935f = activity;
            this.f347936g = bVar;
            this.f347937h = aVar;
            this.f347938i = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f347933d.f27482d = true;
            this.f347934e.mo5085n();
            PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
            Activity activity = this.f347935f;
            C113177k.C113179b bVar = this.f347936g;
            C113177k.C113178a aVar = this.f347937h;
            PermissionSwitchCheckUtil.m163123a(permissionSwitchCheckUtil, activity, bVar, aVar, new C116002a(activity, bVar, aVar, this.f347938i));
            C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$b */
    public static final class C116003b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f347943d;

        /* renamed from: e */
        public final /* synthetic */ C113177k.C113179b f347944e;

        /* renamed from: f */
        public final /* synthetic */ C12925w f347945f;

        public C116003b(Activity activity, C113177k.C113179b bVar, C12925w wVar) {
            this.f347943d = activity;
            this.f347944e = bVar;
            this.f347945f = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PermissionSwitchCheckUtil.f347926a.getClass();
            HashMap<String, Boolean> hashMap = PermissionSwitchCheckUtil.f347928c;
            hashMap.remove(this.f347943d + '_' + this.f347944e.f338672d);
            this.f347945f.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$c */
    public static final class C116004c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f347946d;

        /* renamed from: e */
        public final /* synthetic */ C113177k.C113179b f347947e;

        /* renamed from: f */
        public final /* synthetic */ C12925w f347948f;

        public C116004c(Activity activity, C113177k.C113179b bVar, C12925w wVar) {
            this.f347946d = activity;
            this.f347947e = bVar;
            this.f347948f = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PermissionSwitchCheckUtil.f347926a.getClass();
            HashMap<String, Boolean> hashMap = PermissionSwitchCheckUtil.f347928c;
            hashMap.remove(this.f347946d + '_' + this.f347947e.f338672d);
            this.f347948f.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$d */
    public static final class C116005d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f347949d;

        /* renamed from: e */
        public final /* synthetic */ Activity f347950e;

        /* renamed from: f */
        public final /* synthetic */ C113177k.C113179b f347951f;

        /* renamed from: g */
        public final /* synthetic */ C12925w f347952g;

        public C116005d(C8477a0 a0Var, Activity activity, C113177k.C113179b bVar, C12925w wVar) {
            this.f347949d = a0Var;
            this.f347950e = activity;
            this.f347951f = bVar;
            this.f347952g = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f347949d.f27482d = true;
            PermissionSwitchCheckUtil.f347926a.getClass();
            HashMap<String, Boolean> hashMap = PermissionSwitchCheckUtil.f347928c;
            hashMap.remove(this.f347950e + '_' + this.f347951f.f338672d);
            this.f347952g.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$e */
    public static final class C116006e implements w$$d {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f347953a;

        /* renamed from: b */
        public final /* synthetic */ Activity f347954b;

        /* renamed from: c */
        public final /* synthetic */ C113177k.C113179b f347955c;

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f347956d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f347957e;

        public C116006e(C8477a0 a0Var, Activity activity, C113177k.C113179b bVar, C32226l<? super Boolean, C13598b0> lVar, C8477a0 a0Var2) {
            this.f347953a = a0Var;
            this.f347954b = activity;
            this.f347955c = bVar;
            this.f347956d = lVar;
            this.f347957e = a0Var2;
        }

        public final void onDismiss() {
            if (!this.f347953a.f27482d) {
                PermissionSwitchCheckUtil.f347926a.getClass();
                HashMap<String, Boolean> hashMap = PermissionSwitchCheckUtil.f347928c;
                hashMap.remove(this.f347954b + '_' + this.f347955c.f338672d);
                this.f347956d.invoke(Boolean.valueOf(this.f347957e.f27482d));
            }
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$f */
    public static final class C116007f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Activity f347958d;

        /* renamed from: e */
        public final /* synthetic */ C113177k.C113179b f347959e;

        /* renamed from: f */
        public final /* synthetic */ C113177k.C113178a f347960f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f347961g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116007f(Activity activity, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
            super(0);
            this.f347958d = activity;
            this.f347959e = bVar;
            this.f347960f = aVar;
            this.f347961g = lVar;
        }

        public Object invoke() {
            PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
            Activity activity = this.f347958d;
            C113177k.C113179b bVar = this.f347959e;
            C113177k.C113178a aVar = this.f347960f;
            if (permissionSwitchCheckUtil.mo176851h(activity, bVar, aVar, new C116016c(bVar, aVar, this.f347961g, activity))) {
                C117098f.m165127b(C117098f.f350877a, 201, Long.valueOf((long) this.f347959e.f338673e), Long.valueOf((long) this.f347960f.f338662e), (Boolean) null, 8, (Object) null);
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                    Activity activity2 = this.f347958d;
                    C76912y0.makeText((Context) activity2, (CharSequence) "Permission:" + this.f347959e + " , Business:" + this.f347960f, 1).show();
                }
            } else {
                C32226l<Boolean, C13598b0> lVar = this.f347961g;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$g */
    public static final class C116008g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f347962d;

        /* renamed from: e */
        public final /* synthetic */ C12925w f347963e;

        /* renamed from: f */
        public final /* synthetic */ Activity f347964f;

        /* renamed from: g */
        public final /* synthetic */ C113177k.C113179b f347965g;

        /* renamed from: h */
        public final /* synthetic */ C113177k.C113178a f347966h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f347967i;

        /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$g$a */
        public static final class C116009a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Activity f347968d;

            /* renamed from: e */
            public final /* synthetic */ C113177k.C113179b f347969e;

            /* renamed from: f */
            public final /* synthetic */ C113177k.C113178a f347970f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f347971g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C116009a(Activity activity, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
                super(0);
                this.f347968d = activity;
                this.f347969e = bVar;
                this.f347970f = aVar;
                this.f347971g = lVar;
            }

            public Object invoke() {
                PermissionSwitchCheckUtil.f347926a.mo176854k(this.f347968d, this.f347969e, this.f347970f, this.f347971g);
                return C13598b0.f38549a;
            }
        }

        public C116008g(C8477a0 a0Var, C12925w wVar, Activity activity, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f347962d = a0Var;
            this.f347963e = wVar;
            this.f347964f = activity;
            this.f347965g = bVar;
            this.f347966h = aVar;
            this.f347967i = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f347962d.f27482d = true;
            this.f347963e.mo5085n();
            PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
            Activity activity = this.f347964f;
            C113177k.C113179b bVar = this.f347965g;
            PermissionSwitchCheckUtil.m163123a(permissionSwitchCheckUtil, activity, bVar, (C113177k.C113178a) null, new C116009a(activity, bVar, this.f347966h, this.f347967i));
            C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$h */
    public static final class C116010h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12925w f347972d;

        public C116010h(C12925w wVar) {
            this.f347972d = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f347972d.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$i */
    public static final class C116011i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f347973d;

        /* renamed from: e */
        public final /* synthetic */ C12925w f347974e;

        public C116011i(C8477a0 a0Var, C12925w wVar) {
            this.f347973d = a0Var;
            this.f347974e = wVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f347973d.f27482d = true;
            this.f347974e.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$j */
    public static final class C116012j implements w$$d {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f347975a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f347976b;

        /* renamed from: c */
        public final /* synthetic */ C8477a0 f347977c;

        public C116012j(C8477a0 a0Var, C32226l<? super Boolean, C13598b0> lVar, C8477a0 a0Var2) {
            this.f347975a = a0Var;
            this.f347976b = lVar;
            this.f347977c = a0Var2;
        }

        public final void onDismiss() {
            if (!this.f347975a.f27482d) {
                this.f347976b.invoke(Boolean.valueOf(this.f347977c.f27482d));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006c, code lost:
        if (r2 == null) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m163123a(com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil r8, android.app.Activity r9, bh3.C113177k.C113179b r10, bh3.C113177k.C113178a r11, fy3.C32224a r12) {
        /*
            r8.getClass()
            qo3.w r8 = new qo3.w
            r8.<init>(r9)
            r0 = 0
            r8.mo12469i(r0)
            r1 = 2131496959(0x7f0c0fff, float:1.8617498E38)
            r2 = 0
            android.view.View r1 = android.view.View.inflate(r9, r1, r2)
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout"
            gy3.C87412m.m108592e(r1, r3)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r1
            r3 = 2131297506(0x7f0904e2, float:1.8212959E38)
            android.view.View r3 = r1.findViewById(r3)
            r4 = 2131300828(0x7f0911dc, float:1.8219697E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.text.TextPaint r5 = r5.getPaint()
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r5, r6)
            r5 = 1
            if (r11 == 0) goto L_0x006e
            java.util.HashMap<java.lang.String, java.lang.String> r6 = ch3.C113346a.f339123c
            java.lang.String r7 = r10.f338672d
            java.lang.Object r6 = r6.get(r7)
            java.util.HashMap<java.lang.String, java.lang.String> r7 = ch3.C113346a.f339124d
            java.lang.String r11 = r11.f338661d
            java.lang.Object r11 = r7.get(r11)
            if (r6 == 0) goto L_0x006c
            if (r11 == 0) goto L_0x006c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r6 = (java.lang.String) r6
            r2 = 2131836217(0x7f113d39, float:1.9305595E38)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            r7[r5] = r11
            java.lang.String r11 = r9.getString(r2, r7)
            r4.setText(r11)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x006c:
            if (r2 != 0) goto L_0x008a
        L_0x006e:
            java.util.HashMap<java.lang.String, java.lang.String> r11 = ch3.C113346a.f339123c
            java.lang.String r10 = r10.f338672d
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x008a
            r11 = 2131836218(0x7f113d3a, float:1.9305597E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r0] = r10
            java.lang.String r9 = r9.getString(r11, r2)
            r4.setText(r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x008a:
            ih3.b r9 = new ih3.b
            r9.<init>(r8)
            r3.setOnClickListener(r9)
            ih3.c r9 = new ih3.c
            r9.<init>(r12)
            r8.f36937s = r9
            r8.mo12471k(r1)
            r8.mo12464d(r5)
            r8.mo5086o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.m163123a(com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil, android.app.Activity, bh3.k$b, bh3.k$a, fy3.a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ IllegalArgumentException -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0060 A[EDGE_INSN: B:43:0x0060->B:27:0x0060 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m163124b(com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil r8, java.lang.String r9, fy3.C32226l r10, int r11, java.lang.Object r12) {
        /*
            r11 = r11 & 2
            r12 = 0
            if (r11 == 0) goto L_0x0006
            r10 = r12
        L_0x0006:
            r8.getClass()
            java.lang.String r11 = "methodName"
            gy3.C87412m.m108594g(r9, r11)
            boolean r8 = r8.mo176849f()
            r11 = 0
            if (r8 == 0) goto L_0x0017
            goto L_0x00b4
        L_0x0017:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r8 == 0) goto L_0x001f
            goto L_0x00b4
        L_0x001f:
            java.util.HashMap<java.lang.String, java.lang.String> r8 = bh3.C0279m.f840a
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00b4
            com.tencent.mm.sensitive.business.BusinessStackRecorder$b r0 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347906f
            java.lang.String r0 = r0.mo176841c()
            if (r0 == 0) goto L_0x00b4
            r1 = 1
            bh3.k$b[] r2 = bh3.C113177k.C113179b.values()     // Catch:{ IllegalArgumentException -> 0x0048 }
            int r3 = r2.length     // Catch:{ IllegalArgumentException -> 0x0048 }
            r4 = 0
        L_0x0038:
            if (r4 >= r3) goto L_0x0048
            r5 = r2[r4]     // Catch:{ IllegalArgumentException -> 0x0048 }
            java.lang.String r6 = r5.f338672d     // Catch:{ IllegalArgumentException -> 0x0048 }
            boolean r6 = z04.C112551y.m153809i(r6, r8, r1)     // Catch:{ IllegalArgumentException -> 0x0048 }
            if (r6 == 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            int r4 = r4 + 1
            goto L_0x0038
        L_0x0048:
            r5 = r12
        L_0x0049:
            bh3.k$a[] r2 = bh3.C113177k.C113178a.values()     // Catch:{ IllegalArgumentException -> 0x005f }
            int r3 = r2.length     // Catch:{ IllegalArgumentException -> 0x005f }
            r4 = 0
        L_0x004f:
            if (r4 >= r3) goto L_0x0060
            r6 = r2[r4]     // Catch:{ IllegalArgumentException -> 0x005f }
            java.lang.String r7 = r6.f338661d     // Catch:{ IllegalArgumentException -> 0x005f }
            boolean r7 = z04.C112551y.m153809i(r7, r0, r1)     // Catch:{ IllegalArgumentException -> 0x005f }
            if (r7 == 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            int r4 = r4 + 1
            goto L_0x004f
        L_0x005f:
        L_0x0060:
            r6 = r12
        L_0x0061:
            if (r5 == 0) goto L_0x0080
            if (r6 == 0) goto L_0x0080
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil r2 = f347926a
            java.lang.Boolean r3 = r2.mo176847d(r5)
            if (r3 == 0) goto L_0x007b
            boolean r4 = r3.booleanValue()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0075
            r12 = r3
        L_0x0075:
            if (r12 == 0) goto L_0x007b
            r12.booleanValue()
            goto L_0x00b4
        L_0x007b:
            boolean r10 = r2.mo176846c(r5, r6, r10)
            r11 = r10
        L_0x0080:
            if (r11 != 0) goto L_0x00b4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "method:"
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = " return default value， asking permission:"
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = " in business:"
            r10.append(r8)
            r10.append(r0)
            java.lang.String r8 = ",process:"
            r10.append(r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "Kenneth-methodCall"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
        L_0x00b4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.m163124b(com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil, java.lang.String, fy3.l, int, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final boolean mo176846c(C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
        C113346a.C113347b bVar2;
        HashMap<C113177k.C113178a, C113346a.C54729a> hashMap;
        C113346a.C54729a aVar2;
        List<String> list;
        C87412m.m108594g(bVar, "permission");
        C87412m.m108594g(aVar, "business");
        if (mo176849f() || !mo176848e(bVar, aVar)) {
            return false;
        }
        Boolean d = mo176847d(bVar);
        C13598b0 b0Var = null;
        if (d != null) {
            if (!(!d.booleanValue())) {
                d = null;
            }
            if (d != null) {
                d.booleanValue();
                return false;
            }
        }
        MultiProcessMMKV vM = ((C113177k) C86312j.m106911c(C113177k.class)).mo165717vM(bVar.f338672d);
        if (vM != null) {
            Boolean valueOf = Boolean.valueOf(vM.getBoolean(aVar.f338661d, !aVar.f338663f.booleanValue()));
            if (!(!valueOf.booleanValue())) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                BusinessStackRecorder.C115996b bVar3 = BusinessStackRecorder.f347906f;
                BusinessStackRecorder.C115997c cVar = (BusinessStackRecorder.C115997c) C110818d0.m150925W(BusinessStackRecorder.f347909i);
                String str = cVar != null ? cVar.f347917b : null;
                Boolean valueOf2 = (str == null || (bVar2 = C113346a.f339121a.get(bVar)) == null || (hashMap = bVar2.f339127c) == null || (aVar2 = hashMap.get(aVar)) == null || (list = aVar2.f153377d) == null) ? null : Boolean.valueOf(list.contains(str));
                if (valueOf2 != null && !C87412m.m108589b(valueOf2, Boolean.FALSE)) {
                    return true;
                }
                WeakReference<Activity> e = AppForegroundDelegate.INSTANCE.mo174211e();
                Activity activity = e != null ? e.get() : null;
                if (activity != null) {
                    f347926a.mo176852i(activity, bVar, aVar, lVar);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    f347926a.mo176853j(bVar, aVar, lVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Boolean mo176847d(C113177k.C113179b bVar) {
        if (bVar == C113177k.C113179b.OVERLAY) {
            return Boolean.valueOf(((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext()));
        }
        Map<C113177k.C113179b, String[]> map = C113185t.f338680d;
        String[] strArr = (String[]) ((LinkedHashMap) C113185t.f338680d).get(bVar);
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            boolean z = true;
            try {
                if (C111105a.m151499a(MMApplicationContext.getContext(), strArr[i]) != 0) {
                    z = false;
                }
                if (z) {
                    return Boolean.TRUE;
                }
                i++;
            } catch (Exception e) {
                Log.m105921e(f347927b, "check mpermission exception:%s.", e);
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: e */
    public final boolean mo176848e(C113177k.C113179b bVar, C113177k.C113178a aVar) {
        HashMap<C113177k.C113178a, C113346a.C54729a> hashMap;
        C113346a.C54729a aVar2;
        HashMap<C113177k.C113179b, C113346a.C113347b> hashMap2 = C113346a.f339121a;
        C113346a.C113347b bVar2 = C113346a.f339121a.get(bVar);
        if (bVar2 == null || (hashMap = bVar2.f339127c) == null || (aVar2 = hashMap.get(aVar)) == null) {
            return false;
        }
        return aVar2.f153376c;
    }

    /* renamed from: f */
    public final boolean mo176849f() {
        return f347931f.getBoolean(f347930e, true);
    }

    /* renamed from: g */
    public final void mo176850g() {
        MultiProcessMMKV multiProcessMMKV = f347931f;
        String str = f347930e;
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_use_new_permission_dialog, multiProcessMMKV.getBoolean(str, true) ^ true ? 1 : 0) != 0) {
            z = false;
        }
        multiProcessMMKV.putBoolean(str, z);
    }

    /* renamed from: h */
    public final boolean mo176851h(Activity activity, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
        String str;
        Activity activity2 = activity;
        C113177k.C113179b bVar2 = bVar;
        C113177k.C113178a aVar2 = aVar;
        C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar2, "permission");
        C87412m.m108594g(aVar2, "business");
        C87412m.m108594g(lVar, "callBack");
        boolean z = false;
        if (mo176849f()) {
            Log.m105924i(f347927b, "[showBusinessPermissionDialogUI] false case old dialog");
            return false;
        }
        HashMap<String, Boolean> hashMap = f347928c;
        Boolean bool = hashMap.get(activity2 + '_' + bVar2.f338672d);
        Boolean bool2 = Boolean.TRUE;
        if (C87412m.m108589b(bool, bool2)) {
            Log.m105924i(f347927b, "[showBusinessPermissionDialogUI] false case showing");
            return false;
        }
        hashMap.put(activity2 + '_' + bVar2.f338672d, bool2);
        C12925w wVar = new C12925w(activity2);
        wVar.mo12469i(false);
        Integer num = null;
        View inflate = View.inflate(activity2, C0966R.C0971layout.f359921cm1, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
        roundedCornerFrameLayout.mo153905b((float) C74942w4.m89784a(activity2, 12), (float) C74942w4.m89784a(activity2, 12), 0.0f, 0.0f);
        C113177k kVar = (C113177k) C86312j.m106911c(C113177k.class);
        TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f357850ly2);
        TextView textView2 = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.knx);
        View findViewById = roundedCornerFrameLayout.findViewById(C0966R.C0970id.be4);
        View findViewById2 = roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358406m22);
        Integer bp02 = kVar.bp0(bVar2.f338672d);
        C87412m.m108593f(bp02, "plugin.getPermissionIcon(permission.value)");
        ((WeImageView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.m5x)).setImageResource(bp02.intValue());
        textView2.setText(kVar.mo165701Jp(bVar2.f338672d, aVar2.f338661d));
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        Pair<Integer, Integer> Oz = kVar.mo165702Oz(bVar2.f338672d, aVar2.f338661d);
        if (Oz != null) {
            Object obj = Oz.first;
            Integer num2 = (Integer) obj;
            if (num2 == null || num2.intValue() != -1) {
                z = true;
            }
            if (z) {
                num = obj;
            }
            Integer num3 = num;
            if (num3 == null || (str = activity2.getString(num3.intValue())) == null) {
                str = "";
            }
            textView.setText(str);
        }
        View findViewById3 = roundedCornerFrameLayout.findViewById(C0966R.C0970id.apy);
        View findViewById4 = roundedCornerFrameLayout.findViewById(C0966R.C0970id.hll);
        C8477a0 a0Var = new C8477a0();
        C116001a aVar3 = r0;
        C116001a aVar4 = new C116001a(a0Var, wVar, activity, bVar, aVar, lVar);
        findViewById2.setOnClickListener(aVar3);
        findViewById.setOnClickListener(new C116003b(activity2, bVar2, wVar));
        findViewById3.setOnClickListener(new C116004c(activity2, bVar2, wVar));
        C8477a0 a0Var2 = new C8477a0();
        findViewById4.setOnClickListener(new C116005d(a0Var2, activity2, bVar2, wVar));
        wVar.mo12471k(roundedCornerFrameLayout);
        wVar.f36937s = new C116006e(a0Var, activity, bVar, lVar, a0Var2);
        wVar.mo12464d(true);
        wVar.mo5086o();
        return true;
    }

    /* renamed from: i */
    public final void mo176852i(Activity activity, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(activity, "topActivity");
        C87412m.m108594g(bVar, "permission");
        C87412m.m108594g(aVar, "business");
        C61926c.m72668M(new C116007f(activity, bVar, aVar, lVar));
    }

    /* renamed from: j */
    public final void mo176853j(C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(bVar, "permission");
        C87412m.m108594g(aVar, "business");
        C61926c.m72666K(0, new C108462a(lVar, bVar, aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0122, code lost:
        if (r2 == null) goto L_0x0124;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo176854k(android.app.Activity r21, bh3.C113177k.C113179b r22, bh3.C113177k.C113178a r23, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r24) {
        /*
            r20 = this;
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r24
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "permission"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "callBack"
            gy3.C87412m.m108594g(r7, r0)
            qo3.w r8 = new qo3.w
            r8.<init>(r3)
            r0 = 0
            r8.mo12469i(r0)
            r1 = 2131496956(0x7f0c0ffc, float:1.8617492E38)
            r2 = 0
            android.view.View r1 = android.view.View.inflate(r3, r1, r2)
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout"
            gy3.C87412m.m108592e(r1, r6)
            r9 = r1
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r9 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r9
            r1 = 2131298617(0x7f090939, float:1.8215212E38)
            android.view.View r10 = r9.findViewById(r1)
            r1 = 2131310504(0x7f0937a8, float:1.8239322E38)
            android.view.View r11 = r9.findViewById(r1)
            r1 = 2131297724(0x7f0905bc, float:1.82134E38)
            r9.findViewById(r1)
            r1 = 2131310895(0x7f09392f, float:1.8240115E38)
            android.view.View r1 = r9.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r6 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r6 = r9.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r12 = 2131300828(0x7f0911dc, float:1.8219697E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131306024(0x7f092628, float:1.8230235E38)
            android.view.View r13 = r9.findViewById(r13)
            java.lang.Class<bh3.k> r14 = bh3.C113177k.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            bh3.k r14 = (bh3.C113177k) r14
            if (r5 == 0) goto L_0x0074
            java.lang.String r15 = r5.f338661d
            if (r15 != 0) goto L_0x007a
        L_0x0074:
            com.tencent.mm.sensitive.business.BusinessStackRecorder$b r15 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347906f
            java.lang.String r15 = r15.mo176841c()
        L_0x007a:
            java.lang.String r0 = r4.f338672d
            java.lang.Integer r0 = r14.bp0(r0)
            java.lang.String r2 = "plugin.getPermissionIcon(permission.value)"
            gy3.C87412m.m108593f(r0, r2)
            int r0 = r0.intValue()
            r1.setImageResource(r0)
            java.lang.String r0 = r4.f338672d
            java.lang.String r0 = r14.mo165710eh(r0)
            r6.setText(r0)
            android.text.TextPaint r0 = r6.getPaint()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r1)
            r0 = 2131835759(0x7f113b6f, float:1.9304666E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = "activity.getString(com.t…sion_first_dialog_prefix)"
            gy3.C87412m.m108593f(r0, r1)
            if (r15 == 0) goto L_0x0124
            java.lang.String r1 = r4.f338672d
            android.util.Pair r1 = r14.mo165702Oz(r1, r15)
            if (r1 == 0) goto L_0x0121
            java.lang.Object r2 = r1.first
            r15 = r2
            java.lang.Integer r15 = (java.lang.Integer) r15
            r6 = -1
            if (r15 != 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            int r15 = r15.intValue()
            if (r15 == r6) goto L_0x00c6
        L_0x00c4:
            r15 = 1
            goto L_0x00c7
        L_0x00c6:
            r15 = 0
        L_0x00c7:
            if (r15 == 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r15 = ""
            if (r2 == 0) goto L_0x00db
            int r2 = r2.intValue()
            java.lang.String r2 = r3.getString(r2)
            if (r2 != 0) goto L_0x00dc
        L_0x00db:
            r2 = r15
        L_0x00dc:
            java.lang.Object r1 = r1.second
            r18 = r1
            java.lang.Integer r18 = (java.lang.Integer) r18
            r19 = r1
            if (r18 != 0) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            int r1 = r18.intValue()
            if (r1 == r6) goto L_0x00f0
        L_0x00ed:
            r16 = 1
            goto L_0x00f2
        L_0x00f0:
            r16 = 0
        L_0x00f2:
            if (r16 == 0) goto L_0x00f7
            r17 = r19
            goto L_0x00f9
        L_0x00f7:
            r17 = 0
        L_0x00f9:
            java.lang.Integer r17 = (java.lang.Integer) r17
            if (r17 == 0) goto L_0x0109
            int r1 = r17.intValue()
            java.lang.String r1 = r3.getString(r1)
            if (r1 != 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r15 = r1
        L_0x0109:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r12.setText(r1)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0122
        L_0x0121:
            r2 = 0
        L_0x0122:
            if (r2 != 0) goto L_0x0148
        L_0x0124:
            java.lang.String r1 = r4.f338672d
            java.lang.Integer r1 = r14.mo165705Yr(r1)
            if (r1 == 0) goto L_0x0148
            int r1 = r1.intValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r3.getString(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r12.setText(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0148:
            gy3.a0 r12 = new gy3.a0
            r12.<init>()
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$g r14 = new com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$g
            r0 = r14
            r1 = r12
            r2 = r8
            r3 = r21
            r4 = r22
            r5 = r23
            r15 = 1
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.setOnClickListener(r14)
            gy3.a0 r0 = new gy3.a0
            r0.<init>()
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$h r1 = new com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$h
            r1.<init>(r8)
            r10.setOnClickListener(r1)
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$i r1 = new com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$i
            r1.<init>(r0, r8)
            r11.setOnClickListener(r1)
            com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$j r1 = new com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$j
            r1.<init>(r12, r7, r0)
            r8.f36937s = r1
            r8.mo12471k(r9)
            r8.mo12464d(r15)
            r8.mo5086o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil.mo176854k(android.app.Activity, bh3.k$b, bh3.k$a, fy3.l):void");
    }
}
