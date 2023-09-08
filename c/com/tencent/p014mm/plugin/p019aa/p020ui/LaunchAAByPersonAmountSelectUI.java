package com.tencent.p014mm.plugin.p019aa.p020ui;

import al3.C0086a;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bg0.C67226d;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import ep3.C97683a;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import p196ln.C76705f;
import p629ny.C76979h;
import qe0.C47806g;
import qo3.C77389a;
import qo3.C77398g;
import yf0.C79090a;
import yf0.C79104i;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI */
public class LaunchAAByPersonAmountSelectUI extends BaseAAPresenterActivity {

    /* renamed from: C */
    public static final /* synthetic */ int f196037C = 0;

    /* renamed from: A */
    public int f196038A;

    /* renamed from: B */
    public Runnable f196039B = new C68194a();

    /* renamed from: g */
    public C67226d f196040g = ((C67226d) this.f196016e.mo136941c(this, C67226d.class));

    /* renamed from: h */
    public ListView f196041h;

    /* renamed from: i */
    public TextView f196042i;

    /* renamed from: j */
    public TextView f196043j;

    /* renamed from: n */
    public View f196044n;

    /* renamed from: o */
    public TextView f196045o;

    /* renamed from: p */
    public boolean f196046p = false;

    /* renamed from: q */
    public Map<String, String> f196047q = new HashMap();

    /* renamed from: r */
    public HashMap<String, Double> f196048r;

    /* renamed from: s */
    public C68206i f196049s = null;

    /* renamed from: t */
    public double f196050t;

    /* renamed from: u */
    public long f196051u = -1;

    /* renamed from: v */
    public int f196052v = -1;

    /* renamed from: w */
    public boolean f196053w;

    /* renamed from: x */
    public MMHandler f196054x = new MMHandler(Looper.getMainLooper());

    /* renamed from: y */
    public int f196055y;

    /* renamed from: z */
    public String f196056z;

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$a */
    public class C68194a implements Runnable {
        public C68194a() {
        }

        public void run() {
            LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = LaunchAAByPersonAmountSelectUI.this;
            int i = LaunchAAByPersonAmountSelectUI.f196037C;
            launchAAByPersonAmountSelectUI.mo93765P7();
            LaunchAAByPersonAmountSelectUI.this.mo93764O7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$b */
    public class C68195b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$b$a */
        public class C68196a implements DialogInterface.OnClickListener {
            public C68196a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LaunchAAByPersonAmountSelectUI.m80617J7(LaunchAAByPersonAmountSelectUI.this);
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$b$b */
        public class C68197b implements DialogInterface.OnClickListener {
            public C68197b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LaunchAAByPersonAmountSelectUI.this.finish();
            }
        }

        public C68195b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
            r3 = (java.lang.String) r11.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
            if (r2 == ((java.util.HashMap) r10.f196058d.f196047q).size()) goto L_0x0079;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r11) {
            /*
                r10 = this;
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.Map<java.lang.String, java.lang.String> r11 = r11.f196047q
                r0 = 1
                if (r11 == 0) goto L_0x00ac
                java.util.HashMap r11 = (java.util.HashMap) r11
                int r11 = r11.size()
                if (r11 <= 0) goto L_0x00ac
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.HashMap<java.lang.String, java.lang.Double> r11 = r11.f196048r
                r1 = 0
                if (r11 == 0) goto L_0x0078
                int r11 = r11.size()
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f196047q
                java.util.HashMap r2 = (java.util.HashMap) r2
                int r2 = r2.size()
                if (r11 != r2) goto L_0x0078
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.Map<java.lang.String, java.lang.String> r11 = r11.f196047q
                java.util.HashMap r11 = (java.util.HashMap) r11
                java.util.Set r11 = r11.keySet()
                java.util.Iterator r11 = r11.iterator()
                r2 = 0
            L_0x0035:
                boolean r3 = r11.hasNext()
                if (r3 == 0) goto L_0x006b
                java.lang.Object r3 = r11.next()
                java.lang.String r3 = (java.lang.String) r3
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r4 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.HashMap<java.lang.String, java.lang.Double> r4 = r4.f196048r
                java.lang.Object r4 = r4.get(r3)
                java.lang.Double r4 = (java.lang.Double) r4
                if (r4 != 0) goto L_0x004e
                goto L_0x006b
            L_0x004e:
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r5 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f196047q
                java.util.HashMap r5 = (java.util.HashMap) r5
                java.lang.Object r3 = r5.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                r5 = 0
                double r5 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r3, r5)
                double r3 = r4.doubleValue()
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 != 0) goto L_0x006b
                int r2 = r2 + 1
                goto L_0x0035
            L_0x006b:
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.Map<java.lang.String, java.lang.String> r11 = r11.f196047q
                java.util.HashMap r11 = (java.util.HashMap) r11
                int r11 = r11.size()
                if (r2 != r11) goto L_0x0078
                goto L_0x0079
            L_0x0078:
                r1 = 1
            L_0x0079:
                if (r1 == 0) goto L_0x00a6
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                r11 = 2131820622(0x7f11004e, float:1.9273964E38)
                java.lang.String r3 = r2.getString(r11)
                r4 = 0
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                r1 = 2131820626(0x7f110052, float:1.9273972E38)
                java.lang.String r5 = r11.getString(r1)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                r1 = 2131820625(0x7f110051, float:1.927397E38)
                java.lang.String r6 = r11.getString(r1)
                r7 = 0
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$b$a r8 = new com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$b$a
                r8.<init>()
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$b$b r9 = new com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$b$b
                r9.<init>()
                nj3.C76879j.m92709C(r2, r3, r4, r5, r6, r7, r8, r9)
                goto L_0x00b1
            L_0x00a6:
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                r11.finish()
                goto L_0x00b1
            L_0x00ac:
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                r11.finish()
            L_0x00b1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.C68195b.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$c */
    public class C68198c implements MenuItem.OnMenuItemClickListener {
        public C68198c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Map<String, String> map;
            LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = LaunchAAByPersonAmountSelectUI.this;
            if (launchAAByPersonAmountSelectUI.f196052v > 0 && (map = launchAAByPersonAmountSelectUI.f196047q) != null) {
                int size = ((HashMap) map).size();
                LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI2 = LaunchAAByPersonAmountSelectUI.this;
                if (size > launchAAByPersonAmountSelectUI2.f196052v) {
                    AppCompatActivity context = launchAAByPersonAmountSelectUI2.getContext();
                    LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI3 = LaunchAAByPersonAmountSelectUI.this;
                    C76879j.m92748s(context, launchAAByPersonAmountSelectUI3.getString(C0966R.string.g3r, new Object[]{Integer.valueOf(launchAAByPersonAmountSelectUI3.f196052v)}), "");
                    C115669n.INSTANCE.mo160131h(13722, 8);
                    return true;
                }
            }
            LaunchAAByPersonAmountSelectUI.m80617J7(LaunchAAByPersonAmountSelectUI.this);
            C115669n.INSTANCE.mo160131h(13721, 3, 4);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$d */
    public class C68199d implements C97683a.C75650e<C67226d.C67228b> {
        public C68199d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
            r5 = r1.f193048a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x013a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo93771a(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                bg0.d$b r1 = (bg0.C67226d.C67228b) r1
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r2[r3] = r1
                if (r1 == 0) goto L_0x001f
                java.util.List<java.lang.String> r5 = r1.f193048a
                if (r5 == 0) goto L_0x001f
                int r5 = r5.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0021
            L_0x001f:
                java.lang.String r5 = "0"
            L_0x0021:
                r6 = 1
                r2[r6] = r5
                java.lang.String r5 = "MicroMsg.LaunchAAByPersonAmountSelectUI"
                java.lang.String r7 = "get selectMembers: %s, list.size: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r2)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r2)
                r5 = 2131492895(0x7f0c001f, float:1.8609255E38)
                r7 = 0
                android.view.View r2 = r2.inflate(r5, r7)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r5 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                android.widget.ListView r5 = r5.f196041h
                r5.addFooterView(r2, r7, r3)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r2)
                r5 = 2131492905(0x7f0c0029, float:1.8609275E38)
                android.view.View r2 = r2.inflate(r5, r7)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r5 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                r5.getClass()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                if (r1 == 0) goto L_0x009f
                java.util.List<java.lang.String> r9 = r1.f193048a
                if (r9 == 0) goto L_0x009f
                int r9 = r9.size()
                if (r9 <= 0) goto L_0x009f
                java.util.List<java.lang.String> r9 = r1.f193048a
                java.util.Iterator r9 = r9.iterator()
            L_0x006e:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0088
                java.lang.Object r10 = r9.next()
                java.lang.String r10 = (java.lang.String) r10
                boolean r11 = com.tencent.p014mm.storage.C72996z1.m85843n5(r10)
                if (r11 == 0) goto L_0x0084
                r5.add(r10)
                goto L_0x006e
            L_0x0084:
                r8.add(r10)
                goto L_0x006e
            L_0x0088:
                int r9 = r5.size()
                if (r9 <= 0) goto L_0x009f
                java.util.List<java.lang.String> r9 = r1.f193048a
                r9.clear()
                java.util.List<java.lang.String> r9 = r1.f193048a
                r9.addAll(r8)
                java.util.List<java.lang.String> r8 = r1.f193048a
                r8.addAll(r5)
                r5 = 1
                goto L_0x00a0
            L_0x009f:
                r5 = 0
            L_0x00a0:
                if (r5 == 0) goto L_0x0131
                r5 = 2131296324(0x7f090044, float:1.8210561E38)
                android.view.View r5 = r2.findViewById(r5)
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
                android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
                r9 = -2
                r8.height = r9
                r5.setLayoutParams(r8)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r8 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
                r9 = 44
                int r8 = kg3.C76577a.m92151b(r8, r9)
                r5.setMinimumHeight(r8)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r8 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
                r9 = 16
                int r8 = kg3.C76577a.m92151b(r8, r9)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r9 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                androidx.appcompat.app.AppCompatActivity r9 = r9.getContext()
                r10 = 15
                int r9 = kg3.C76577a.m92151b(r9, r10)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r10 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                androidx.appcompat.app.AppCompatActivity r10 = r10.getContext()
                r11 = 8
                int r10 = kg3.C76577a.m92151b(r10, r11)
                r5.setPadding(r8, r9, r3, r10)
                r5 = 2131296325(0x7f090045, float:1.8210563E38)
                android.view.View r5 = r2.findViewById(r5)
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r15.mo10233c(r4)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$4"
                java.lang.String r11 = "resolved"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/aa/model/interactor/LaunchAAByPersonAmountSelectInteractor$SelectMembers;)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r8 = r5
                r6 = r15
                r15 = r16
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r6 = r6.mo10231a(r3)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r5.setVisibility(r6)
                java.lang.String r9 = "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$4"
                java.lang.String r10 = "resolved"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/aa/model/interactor/LaunchAAByPersonAmountSelectInteractor$SelectMembers;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x0131:
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r5 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                android.widget.ListView r5 = r5.f196041h
                r5.addHeaderView(r2, r7, r3)
                if (r1 == 0) goto L_0x0198
                java.util.HashMap<java.lang.String, java.lang.Double> r2 = r1.f193049b
                if (r2 == 0) goto L_0x0174
                java.util.Set r2 = r2.keySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x0146:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x016e
                java.lang.Object r5 = r2.next()
                java.lang.String r5 = (java.lang.String) r5
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r6 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.Map<java.lang.String, java.lang.String> r7 = r6.f196047q
                r8 = 2131820565(0x7f110015, float:1.9273849E38)
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r9]
                java.util.HashMap<java.lang.String, java.lang.Double> r11 = r1.f193049b
                java.lang.Object r11 = r11.get(r5)
                r10[r3] = r11
                java.lang.String r6 = r6.getString(r8, r10)
                java.util.HashMap r7 = (java.util.HashMap) r7
                r7.put(r5, r6)
                goto L_0x0146
            L_0x016e:
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.HashMap<java.lang.String, java.lang.Double> r5 = r1.f193049b
                r2.f196048r = r5
            L_0x0174:
                java.util.List<java.lang.String> r2 = r1.f193048a
                if (r2 == 0) goto L_0x0198
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0198
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i r5 = new com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r6 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                java.util.List<java.lang.String> r7 = r1.f193048a
                java.util.HashMap<java.lang.String, java.lang.Double> r8 = r1.f193049b
                java.util.List<java.lang.String> r1 = r1.f193050c
                r5.<init>(r7, r8, r1)
                r2.f196049s = r5
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r1 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                android.widget.ListView r2 = r1.f196041h
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i r1 = r1.f196049s
                r2.setAdapter(r1)
            L_0x0198:
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r1 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                android.view.View r1 = r1.f196044n
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                r2.mo10233c(r4)
                java.lang.Object[] r6 = r2.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$4"
                java.lang.String r8 = "resolved"
                java.lang.String r9 = "(Lcom/tencent/mm/plugin/aa/model/interactor/LaunchAAByPersonAmountSelectInteractor$SelectMembers;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r1
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r6 = "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$4"
                java.lang.String r7 = "resolved"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/aa/model/interactor/LaunchAAByPersonAmountSelectInteractor$SelectMembers;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI r1 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.this
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r1.f196054x
                java.lang.Runnable r1 = r1.f196039B
                r2.post(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAByPersonAmountSelectUI.C68199d.mo93771a(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$e */
    public class C68200e implements View.OnTouchListener {
        public C68200e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = LaunchAAByPersonAmountSelectUI.this;
            boolean z = launchAAByPersonAmountSelectUI.f196046p;
            if (!z) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            if (z) {
                launchAAByPersonAmountSelectUI.f196042i.setTextColor(launchAAByPersonAmountSelectUI.getResources().getColor(C0966R.color.a1d));
            } else {
                launchAAByPersonAmountSelectUI.mo93762M7();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$f */
    public class C68201f extends C7089c0 {

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$f$a */
        public class C68202a implements DialogInterface.OnClickListener {
            public C68202a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = LaunchAAByPersonAmountSelectUI.this;
                int i2 = LaunchAAByPersonAmountSelectUI.f196037C;
                launchAAByPersonAmountSelectUI.getClass();
                try {
                    launchAAByPersonAmountSelectUI.mo93762M7();
                    launchAAByPersonAmountSelectUI.f196046p = false;
                    launchAAByPersonAmountSelectUI.f196050t = 0.0d;
                    launchAAByPersonAmountSelectUI.f196043j.setText(launchAAByPersonAmountSelectUI.getString(C0966R.string.g3i, new Object[]{Double.valueOf(0.0d)}));
                    ((HashMap) launchAAByPersonAmountSelectUI.f196047q).clear();
                    launchAAByPersonAmountSelectUI.mo93765P7();
                    launchAAByPersonAmountSelectUI.mo93764O7();
                    C68206i iVar = launchAAByPersonAmountSelectUI.f196049s;
                    if (iVar != null) {
                        Iterator it = ((ArrayList) iVar.f196068d).iterator();
                        while (it.hasNext()) {
                            ((C68211j) it.next()).f196088b = "";
                        }
                        iVar.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    Log.m105925i("MicroMsg.LaunchAAByPersonAmountSelectUI", "clearAmount error: %s", e.getMessage());
                }
                C115669n.INSTANCE.mo160131h(13721, 3, 9);
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$f$b */
        public class C68203b implements DialogInterface.OnClickListener {
            public C68203b(C68201f fVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n.INSTANCE.mo160131h(13721, 3, 10);
            }
        }

        public C68201f() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Map<String, String> map = LaunchAAByPersonAmountSelectUI.this.f196047q;
            if (map != null && ((HashMap) map).size() > 0) {
                try {
                    LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = LaunchAAByPersonAmountSelectUI.this;
                    C77389a aVar = new C77389a();
                    aVar.f225660q = C0086a.m38a(launchAAByPersonAmountSelectUI).getString(C0966R.string.f7273b6);
                    aVar.f225663t = C0086a.m38a(launchAAByPersonAmountSelectUI).getString(C0966R.string.f7274b7);
                    aVar.f225620C = new C68202a();
                    aVar.f225664u = C0086a.m38a(launchAAByPersonAmountSelectUI).getString(C0966R.string.f7275b8);
                    aVar.f225621D = new C68203b(this);
                    C77398g gVar = new C77398g(launchAAByPersonAmountSelectUI, C0966R.style.a66);
                    gVar.mo107525e(aVar);
                    gVar.show();
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.LaunchAAByPersonAmountSelectUI", "clear amount error");
                }
            }
            C115669n.INSTANCE.mo160131h(13721, 3, 8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$g */
    public class C68204g implements AbsListView.OnScrollListener {
        public C68204g() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 1) {
                LaunchAAByPersonAmountSelectUI.this.hideTenpayKB();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$h */
    public class C68205h implements Animation.AnimationListener {
        public C68205h() {
        }

        public void onAnimationEnd(Animation animation) {
            LaunchAAByPersonAmountSelectUI.this.f196045o.sendAccessibilityEvent(128);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i */
    public class C68206i extends BaseAdapter {

        /* renamed from: d */
        public List<C68211j> f196068d;

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i$a */
        public class C68207a extends C79145c {

            /* renamed from: a */
            public final /* synthetic */ C68210d f196070a;

            public C68207a(C68210d dVar) {
                this.f196070a = dVar;
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(EditText.class.getName());
                String obj = this.f196070a.f196085i.getContentEt().getText().toString();
                if (obj.length() == 0) {
                    obj = "0";
                }
                accessibilityNodeInfo.setContentDescription(obj + LaunchAAByPersonAmountSelectUI.this.getString(C0966R.string.g3o));
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i$b */
        public class C68208b implements View.OnTouchListener {

            /* renamed from: d */
            public final /* synthetic */ C68211j f196072d;

            /* renamed from: e */
            public final /* synthetic */ C68210d f196073e;

            public C68208b(C68211j jVar, C68210d dVar) {
                this.f196072d = jVar;
                this.f196073e = dVar;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (LaunchAAByPersonAmountSelectUI.m80616I7(LaunchAAByPersonAmountSelectUI.this, this.f196072d)) {
                    if (LaunchAAByPersonAmountSelectUI.this.mo93761L7() && C75592q0.m90789s().equals(this.f196072d.f196087a)) {
                        C76912y0.m92767f(LaunchAAByPersonAmountSelectUI.this.getContext(), LaunchAAByPersonAmountSelectUI.this.getContext().getString(C0966R.string.myb));
                    }
                    if (LaunchAAByPersonAmountSelectUI.this.mo93761L7() && !C79104i.m95670o(LaunchAAByPersonAmountSelectUI.this.f196056z, this.f196072d.f196087a)) {
                        C76912y0.m92767f(LaunchAAByPersonAmountSelectUI.this.getContext(), LaunchAAByPersonAmountSelectUI.this.getContext().getString(C0966R.string.myd));
                    }
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                this.f196073e.f196085i.mo105096n(LaunchAAByPersonAmountSelectUI.this);
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i$c */
        public class C68209c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C68210d f196075d;

            public C68209c(C68210d dVar) {
                this.f196075d = dVar;
            }

            public void run() {
                int top = (this.f196075d.f196083g.getTop() - this.f196075d.f196081e.getBottom()) - C76577a.m92151b(LaunchAAByPersonAmountSelectUI.this.getContext(), 8);
                if (top < 0) {
                    top = 0;
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f196075d.f196083g.getLayoutParams();
                layoutParams.topMargin = -top;
                this.f196075d.f196083g.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$i$d */
        public class C68210d {

            /* renamed from: a */
            public LinearLayout f196077a;

            /* renamed from: b */
            public LinearLayout f196078b;

            /* renamed from: c */
            public LinearLayout f196079c;

            /* renamed from: d */
            public ImageView f196080d;

            /* renamed from: e */
            public TextView f196081e;

            /* renamed from: f */
            public TextView f196082f;

            /* renamed from: g */
            public TextView f196083g;

            /* renamed from: h */
            public TextView f196084h;

            /* renamed from: i */
            public WalletFormView f196085i;

            /* renamed from: j */
            public C68212k f196086j;

            public C68210d(C68206i iVar, C68194a aVar) {
            }
        }

        public C68206i(List<String> list, Map<String, Double> map, List<String> list2) {
            this.f196068d = null;
            this.f196068d = new ArrayList();
            int i = LaunchAAByPersonAmountSelectUI.f196037C;
            if (!LaunchAAByPersonAmountSelectUI.this.mo93761L7() || list2 == null || list2.size() <= 0 || list.size() != list2.size()) {
                for (String next : list) {
                    C68211j jVar = new C68211j(LaunchAAByPersonAmountSelectUI.this, (C68194a) null);
                    jVar.f196087a = next;
                    if (map == null || !map.containsKey(next)) {
                        jVar.f196088b = "";
                    } else {
                        jVar.f196088b = LaunchAAByPersonAmountSelectUI.this.getString(C0966R.string.f7271b4, new Object[]{map.get(next)});
                    }
                    this.f196068d.add(jVar);
                }
                return;
            }
            for (int i2 = 0; i2 <= list.size() - 1; i2++) {
                String str = list.get(i2);
                C68211j jVar2 = new C68211j(LaunchAAByPersonAmountSelectUI.this, (C68194a) null);
                jVar2.f196087a = str;
                jVar2.f196089c = list2.get(i2);
                if (map == null || !map.containsKey(str)) {
                    jVar2.f196088b = "";
                } else {
                    jVar2.f196088b = LaunchAAByPersonAmountSelectUI.this.getString(C0966R.string.f7271b4, new Object[]{map.get(str)});
                }
                this.f196068d.add(jVar2);
            }
        }

        /* renamed from: a */
        public void mo93780a(Map<String, String> map) {
            Iterator it = ((ArrayList) this.f196068d).iterator();
            while (it.hasNext()) {
                ((C68211j) it.next()).f196088b = "";
            }
            if (map != null && map.size() > 0) {
                Iterator it4 = ((ArrayList) this.f196068d).iterator();
                while (it4.hasNext()) {
                    C68211j jVar = (C68211j) it4.next();
                    if (map.containsKey(jVar.f196087a)) {
                        jVar.f196088b = map.get(jVar.f196087a);
                    }
                }
            }
        }

        public int getCount() {
            return ((ArrayList) this.f196068d).size();
        }

        public Object getItem(int i) {
            return (C68211j) ((ArrayList) this.f196068d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Class cls = C75339i.class;
            Class cls2 = C76979h.class;
            C68211j jVar = (C68211j) ((ArrayList) this.f196068d).get(i);
            if (jVar != null && !Util.isNullOrNil(jVar.f196087a)) {
                if (view == null) {
                    view = C85868k2.m106137b(LaunchAAByPersonAmountSelectUI.this).inflate(C0966R.C0971layout.b3r, viewGroup, false);
                    C68210d dVar = new C68210d(this, (C68194a) null);
                    dVar.f196077a = (LinearLayout) view.findViewById(C0966R.C0970id.iwc);
                    dVar.f196078b = (LinearLayout) view.findViewById(C0966R.C0970id.br5);
                    dVar.f196080d = (ImageView) view.findViewById(C0966R.C0970id.a1p);
                    dVar.f196081e = (TextView) view.findViewById(C0966R.C0970id.l2o);
                    dVar.f196082f = (TextView) view.findViewById(C0966R.C0970id.k9w);
                    dVar.f196083g = (TextView) view.findViewById(C0966R.C0970id.nqt);
                    dVar.f196079c = (LinearLayout) view.findViewById(C0966R.C0970id.noc);
                    dVar.f196085i = (WalletFormView) view.findViewById(C0966R.C0970id.gyk);
                    dVar.f196084h = (TextView) view.findViewById(C0966R.C0970id.fi4);
                    LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = LaunchAAByPersonAmountSelectUI.this;
                    String str = jVar.f196087a;
                    WalletFormView walletFormView = dVar.f196085i;
                    C68212k kVar = new C68212k(str, walletFormView);
                    dVar.f196086j = kVar;
                    walletFormView.mo105069a(kVar);
                    dVar.f196085i.setAccessibilityDelegate(new C68207a(dVar));
                    dVar.f196085i.getContentEt().setImportantForAccessibility(2);
                    view.setTag(dVar);
                    LaunchAAByPersonAmountSelectUI.this.setEditFocusListener(dVar.f196085i, 2, false, true);
                }
                C68210d dVar2 = (C68210d) view.getTag();
                C68208b bVar = new C68208b(jVar, dVar2);
                dVar2.f196077a.setOnTouchListener(bVar);
                dVar2.f196080d.setOnTouchListener(bVar);
                if (!Util.isNullOrNil(jVar.f196087a)) {
                    dVar2.f196086j.f196090d = jVar.f196087a;
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(dVar2.f196080d, jVar.f196087a);
                    dVar2.f196081e.setText(((C76979h) C86312j.m106911c(cls2)).yp0(LaunchAAByPersonAmountSelectUI.this.getContext(), ((C75339i) C86312j.m106911c(cls)).mo62519pb(jVar.f196087a, LaunchAAByPersonAmountSelectUI.this.f196056z), dVar2.f196081e.getTextSize()));
                    if (C75592q0.m90789s().equals(jVar.f196087a)) {
                        TextView textView = dVar2.f196081e;
                        textView.setText(dVar2.f196081e.getText() + LaunchAAByPersonAmountSelectUI.this.getString(C0966R.string.f7306c9));
                    }
                }
                if (!(jVar.f196088b == null || dVar2.f196085i.getText() == null || jVar.f196088b.equals(dVar2.f196085i.getText().toLowerCase()))) {
                    WalletFormView walletFormView2 = dVar2.f196085i;
                    C68212k kVar2 = dVar2.f196086j;
                    TenpaySecureEditText tenpaySecureEditText = walletFormView2.f221285g;
                    if (tenpaySecureEditText != null) {
                        tenpaySecureEditText.removeTextChangedListener(kVar2);
                    }
                    dVar2.f196085i.setText(jVar.f196088b);
                    dVar2.f196085i.mo105069a(dVar2.f196086j);
                }
                if (!Util.isNullOrNil(jVar.f196089c)) {
                    dVar2.f196083g.setText(C79104i.m95665j(60, jVar.f196089c));
                    dVar2.f196083g.setVisibility(0);
                    dVar2.f196083g.post(new C68209c(dVar2));
                    dVar2.f196078b.setGravity(48);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar2.f196079c.getLayoutParams();
                    layoutParams.gravity = 53;
                    dVar2.f196079c.setLayoutParams(layoutParams);
                } else {
                    dVar2.f196083g.setVisibility(8);
                    dVar2.f196078b.setGravity(16);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) dVar2.f196079c.getLayoutParams();
                    layoutParams2.gravity = 21;
                    dVar2.f196079c.setLayoutParams(layoutParams2);
                }
                WalletFormView walletFormView3 = dVar2.f196085i;
                if (walletFormView3 == null || walletFormView3.getText() == null || C75228t.m90230W(dVar2.f196085i.getText(), "100", 2, RoundingMode.HALF_UP).doubleValue() <= ((double) LaunchAAByPersonAmountSelectUI.this.f196051u)) {
                    dVar2.f196085i.setContentTextColorRes(C0966R.color.a7f);
                } else {
                    dVar2.f196085i.setContentTextColorRes(C0966R.color.f2966ao);
                }
                if (i == 0) {
                    dVar2.f196077a.setBackgroundResource(C0966R.C0969drawable.f357233ab1);
                } else if (i == ((ArrayList) this.f196068d).size() - 1) {
                    dVar2.f196077a.setBackgroundResource(C0966R.C0969drawable.f357234ab2);
                } else {
                    dVar2.f196077a.setBackgroundResource(C0966R.C0969drawable.f357232ab0);
                }
                if (LaunchAAByPersonAmountSelectUI.m80616I7(LaunchAAByPersonAmountSelectUI.this, jVar)) {
                    dVar2.f196080d.setAlpha(0.3f);
                    dVar2.f196081e.setAlpha(0.3f);
                    dVar2.f196084h.setAlpha(0.3f);
                    dVar2.f196085i.setAlpha(0.15f);
                    dVar2.f196080d.setAlpha(0.3f);
                    dVar2.f196081e.setAlpha(0.3f);
                    dVar2.f196083g.setAlpha(0.3f);
                    dVar2.f196084h.setAlpha(0.3f);
                    dVar2.f196084h.setVisibility(8);
                    dVar2.f196085i.setAlpha(0.15f);
                    dVar2.f196085i.setVisibility(8);
                    dVar2.f196085i.findViewById(C0966R.C0970id.lg_).setFocusable(false);
                    dVar2.f196085i.findViewById(C0966R.C0970id.lg_).setFocusableInTouchMode(false);
                    dVar2.f196085i.findViewById(C0966R.C0970id.lg_).setClickable(false);
                    String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(jVar.f196087a));
                    dVar2.f196082f.setVisibility(0);
                    dVar2.f196082f.setText(a);
                    dVar2.f196082f.setAlpha(0.3f);
                    Log.m105925i("MicroMsg.LaunchAAByPersonAmountSelectUI", "username：%s，data.username：%s,subName:%s", ((C76979h) C86312j.m106911c(cls2)).yp0(LaunchAAByPersonAmountSelectUI.this.getContext(), ((C75339i) C86312j.m106911c(cls)).mo62519pb(jVar.f196087a, LaunchAAByPersonAmountSelectUI.this.f196056z), dVar2.f196081e.getTextSize()).toString(), jVar.f196087a, a);
                } else {
                    dVar2.f196080d.setAlpha(1.0f);
                    dVar2.f196081e.setAlpha(1.0f);
                    dVar2.f196084h.setAlpha(1.0f);
                    dVar2.f196084h.setVisibility(0);
                    dVar2.f196085i.setAlpha(1.0f);
                    dVar2.f196085i.setVisibility(0);
                    dVar2.f196083g.setAlpha(1.0f);
                    dVar2.f196080d.setAlpha(1.0f);
                    dVar2.f196081e.setAlpha(1.0f);
                    dVar2.f196084h.setAlpha(1.0f);
                    dVar2.f196085i.setAlpha(1.0f);
                    dVar2.f196085i.findViewById(C0966R.C0970id.lg_).setFocusable(true);
                    dVar2.f196085i.findViewById(C0966R.C0970id.lg_).setFocusableInTouchMode(true);
                    dVar2.f196085i.findViewById(C0966R.C0970id.lg_).setClickable(true);
                    dVar2.f196082f.setVisibility(4);
                    Log.m105925i("MicroMsg.LaunchAAByPersonAmountSelectUI", "username：%s，data.username：%s", ((C76979h) C86312j.m106911c(cls2)).yp0(LaunchAAByPersonAmountSelectUI.this.getContext(), ((C75339i) C86312j.m106911c(cls)).mo62519pb(jVar.f196087a, LaunchAAByPersonAmountSelectUI.this.f196056z), dVar2.f196081e.getTextSize()).toString(), jVar.f196087a);
                }
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$j */
    public class C68211j {

        /* renamed from: a */
        public String f196087a = null;

        /* renamed from: b */
        public String f196088b = null;

        /* renamed from: c */
        public String f196089c = null;

        public C68211j(LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI, C68194a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI$k */
    public class C68212k implements TextWatcher {

        /* renamed from: d */
        public String f196090d;

        /* renamed from: e */
        public WalletFormView f196091e;

        public C68212k(String str, WalletFormView walletFormView) {
            this.f196090d = str;
            this.f196091e = walletFormView;
        }

        public void afterTextChanged(Editable editable) {
            boolean z = true;
            try {
                String obj = editable.toString();
                if (!(!obj.startsWith("0") || obj.charAt(1) == '0' || obj.charAt(1) == '.')) {
                    editable.delete(0, 1);
                }
                if (obj.startsWith(".")) {
                    editable.insert(0, "0");
                }
                if (obj.startsWith("0") && obj.charAt(1) == '0') {
                    editable.delete(1, obj.length());
                }
                String obj2 = editable.toString();
                int indexOf = obj2.indexOf(".");
                int length = obj2.length();
                if (indexOf >= 0 && length - indexOf > 2) {
                    editable.delete(indexOf + 3, length);
                }
                int lastIndexOf = obj2.lastIndexOf(".");
                if (lastIndexOf != indexOf && lastIndexOf > 0 && length > lastIndexOf) {
                    editable.delete(lastIndexOf, length);
                }
            } catch (Exception unused) {
            }
            if (Util.isNullOrNil((CharSequence) editable) || Util.getDouble(editable.toString(), 0.0d) <= 0.0d) {
                ((HashMap) LaunchAAByPersonAmountSelectUI.this.f196047q).remove(this.f196090d);
            } else {
                ((HashMap) LaunchAAByPersonAmountSelectUI.this.f196047q).put(this.f196090d, editable.toString());
            }
            WalletFormView walletFormView = this.f196091e;
            if (walletFormView == null || C75228t.m90230W(walletFormView.getText(), "100", 2, RoundingMode.HALF_UP).doubleValue() <= ((double) LaunchAAByPersonAmountSelectUI.this.f196051u)) {
                this.f196091e.setContentTextColorRes(C0966R.color.a7f);
            } else {
                this.f196091e.setContentTextColorRes(C0966R.color.f2966ao);
            }
            LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = LaunchAAByPersonAmountSelectUI.this;
            launchAAByPersonAmountSelectUI.f196054x.removeCallbacks(launchAAByPersonAmountSelectUI.f196039B);
            LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI2 = LaunchAAByPersonAmountSelectUI.this;
            launchAAByPersonAmountSelectUI2.f196054x.postDelayed(launchAAByPersonAmountSelectUI2.f196039B, 50);
            if (LaunchAAByPersonAmountSelectUI.this.f196055y != 6) {
                z = false;
            }
            if (z) {
                GroupPayPfClickReportStruct groupPayPfClickReportStruct = new GroupPayPfClickReportStruct();
                groupPayPfClickReportStruct.f156281d = (long) 3;
                groupPayPfClickReportStruct.mo86054n();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: I7 */
    public static boolean m80616I7(LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI, C68211j jVar) {
        launchAAByPersonAmountSelectUI.getClass();
        if (C72996z1.m85843n5(jVar.f196087a)) {
            return true;
        }
        if (!launchAAByPersonAmountSelectUI.mo93761L7() || !C75592q0.m90789s().equals(jVar.f196087a)) {
            return launchAAByPersonAmountSelectUI.mo93761L7() && !C79104i.m95670o(launchAAByPersonAmountSelectUI.f196056z, jVar.f196087a);
        }
        return true;
    }

    /* renamed from: J7 */
    public static void m80617J7(LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        launchAAByPersonAmountSelectUI.mo93765P7();
        launchAAByPersonAmountSelectUI.mo93764O7();
        ArrayList arrayList = new ArrayList();
        for (String str : ((HashMap) launchAAByPersonAmountSelectUI.f196047q).keySet()) {
            if (C75228t.m90230W((String) ((HashMap) launchAAByPersonAmountSelectUI.f196047q).get(str), "100", 2, RoundingMode.HALF_UP).doubleValue() <= ((double) launchAAByPersonAmountSelectUI.f196051u)) {
                arrayList.add(str + "," + ((String) ((HashMap) launchAAByPersonAmountSelectUI.f196047q).get(str)));
            }
        }
        Intent intent = new Intent();
        intent.putStringArrayListExtra("selectUI", arrayList);
        launchAAByPersonAmountSelectUI.setResult(-1, intent);
        launchAAByPersonAmountSelectUI.finish();
    }

    /* renamed from: K7 */
    public void mo93760K7() {
        if (this.f196045o.isShown()) {
            this.f196045o.setText("");
            this.f196045o.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2447d_));
            this.f196045o.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f196041h.getLayoutParams();
            layoutParams.topMargin = C76577a.m92151b(getContext(), 0);
            this.f196041h.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: L7 */
    public final boolean mo93761L7() {
        return this.f196038A == 1;
    }

    /* renamed from: M7 */
    public final void mo93762M7() {
        if (!C85875k4.m106211z()) {
            this.f196042i.setTextColor(Color.parseColor("#4c576B95"));
        } else {
            this.f196042i.setTextColor(Color.parseColor("#4c7D90A9"));
        }
    }

    /* renamed from: N7 */
    public void mo93763N7(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f196045o.setText(str);
            if (!this.f196045o.isShown()) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2425cq);
                loadAnimation.setAnimationListener(new C68205h());
                this.f196045o.startAnimation(loadAnimation);
                this.f196045o.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f196041h.getLayoutParams();
                layoutParams.topMargin = C76577a.m92151b(getContext(), 55);
                this.f196041h.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: O7 */
    public final void mo93764O7() {
        if (this.f196050t > 0.0d) {
            this.f196046p = true;
            this.f196042i.setTextColor(getResources().getColor(C0966R.color.a1d));
            return;
        }
        this.f196046p = false;
        mo93762M7();
    }

    /* renamed from: P7 */
    public final void mo93765P7() {
        try {
            this.f196050t = 0.0d;
            this.f196053w = false;
            Map<String, String> map = this.f196047q;
            if (map != null) {
                for (String str : ((HashMap) map).values()) {
                    double d = Util.getDouble(str, 0.0d);
                    this.f196050t += d;
                    long j = this.f196051u;
                    if (j > 0 && d * 100.0d > ((double) j)) {
                        this.f196053w = true;
                    }
                }
                C68206i iVar = this.f196049s;
                if (iVar != null) {
                    iVar.mo93780a(this.f196047q);
                }
            }
            this.f196043j.setText(getString(C0966R.string.g3i, new Object[]{Double.valueOf(this.f196050t)}));
            Map<String, String> map2 = this.f196047q;
            if (map2 == null || ((HashMap) map2).size() <= 0) {
                updateOptionMenuText(233, getString(C0966R.string.a18));
            } else {
                updateOptionMenuText(233, getString(C0966R.string.f7281bf, new Object[]{Integer.valueOf(((HashMap) this.f196047q).size())}));
            }
            if (this.f196053w) {
                C115669n.INSTANCE.mo160131h(13722, 7);
                enableOptionMenu(233, false);
                mo93763N7(getString(C0966R.string.g4b, new Object[]{Float.valueOf(((float) this.f196051u) / 100.0f)}));
            } else {
                Map<String, String> map3 = this.f196047q;
                if (map3 == null || ((HashMap) map3).size() <= 0) {
                    enableOptionMenu(233, false);
                } else {
                    enableOptionMenu(233, true);
                }
                mo93760K7();
            }
            if (this.f196042i.getRight() > this.f196043j.getLeft()) {
                TextView textView = this.f196043j;
                textView.setMaxEms(textView.length() / 2);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.LaunchAAByPersonAmountSelectUI", "updateTotalAmount error: %s", e.getMessage());
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b3s;
    }

    public final void init() {
        this.f196041h = (ListView) findViewById(C0966R.C0970id.f5808pa);
        this.f196042i = (TextView) findViewById(C0966R.C0970id.bdd);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5809pb);
        this.f196043j = textView;
        textView.setText(getString(C0966R.string.g3i, new Object[]{Float.valueOf(0.0f)}));
        this.f196044n = findViewById(C0966R.C0970id.ka5);
        this.f196045o = (TextView) findViewById(C0966R.C0970id.f5781og);
        this.f196015d = this.f196041h;
        View view = this.f196044n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C85875k4.m106189j0(this.f196042i.getPaint(), 0.8f);
        this.f196042i.setOnTouchListener(new C68200e());
        this.f196042i.setOnClickListener(new C68201f());
        this.f196046p = true;
        this.f196041h.setOnScrollListener(new C68204g());
    }

    public void onCreate(Bundle bundle) {
        Class<C67226d.C67228b> cls = C67226d.C67228b.class;
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.g3j);
        setBackBtn(new C68195b());
        addTextOptionMenu(233, getString(C0966R.string.a18), new C68198c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        init();
        this.f196055y = getIntent().getIntExtra("enter_scene", 1);
        this.f196056z = getIntent().getStringExtra("chatroom");
        this.f196051u = getIntent().getLongExtra("maxPerAmount", -1);
        this.f196052v = getIntent().getIntExtra("maxUserNumber", -1);
        this.f196038A = getIntent().getIntExtra("group_solitatire_flag", 0);
        Log.m105925i("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate, chatroom: %s, maxPerAmount: %s, ", this.f196056z, Long.valueOf(this.f196051u));
        this.f196040g.mo136934f(cls);
        this.f196040g.mo136931a(cls, new C68199d());
    }

    public void onDestroy() {
        super.onDestroy();
        Map<String, String> map = this.f196047q;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }
}
