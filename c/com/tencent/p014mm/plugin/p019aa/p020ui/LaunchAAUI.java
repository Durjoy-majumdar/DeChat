package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bg0.C67230f;
import bl3.C39818r;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LaunchAAEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.p019aa.model.cgi.NetSceneNewAAQueryPFInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.xweb.util.AccessibilityHelper;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f12.C7970a;
import f40.C86709a0;
import f62.C75709u0;
import hp3.C87581a;
import ie3.C76328d;
import j20.C117292a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C76879j;
import op3.C117878c;
import p823sg.C90193h;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;
import te3.C64541m;
import te3.C77903a;
import te3.C77910c0;
import wc3.C78541w;
import wd3.C65953v0;
import xz1.C79013a;
import yf0.C79090a;
import yf0.C79095d;
import yf0.C79098e;
import yf0.C79104i;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI */
public class LaunchAAUI extends BaseAAPresenterActivity implements C7020t0 {

    /* renamed from: l1 */
    public static final /* synthetic */ int f196093l1 = 0;

    /* renamed from: A */
    public TextView f196094A;

    /* renamed from: B */
    public ViewGroup f196095B;

    /* renamed from: C */
    public WalletFormView f196096C;

    /* renamed from: D */
    public TextView f196097D;

    /* renamed from: E */
    public ViewGroup f196098E;

    /* renamed from: F */
    public ViewGroup f196099F;

    /* renamed from: G */
    public List<String> f196100G = new ArrayList();

    /* renamed from: H */
    public ViewGroup f196101H;

    /* renamed from: I */
    public ViewGroup f196102I;

    /* renamed from: J */
    public ViewGroup f196103J;

    /* renamed from: K */
    public ViewGroup f196104K;

    /* renamed from: L */
    public ViewGroup f196105L;

    /* renamed from: M */
    public TextView f196106M;

    /* renamed from: N */
    public TextView f196107N;

    /* renamed from: P */
    public ViewGroup f196108P;

    /* renamed from: Q */
    public Map<String, Double> f196109Q = new HashMap();

    /* renamed from: Q0 */
    public String f196110Q0 = "";

    /* renamed from: R */
    public Map<String, LaunchAAByPersonNameAmountRow> f196111R = new HashMap();

    /* renamed from: R0 */
    public String f196112R0;

    /* renamed from: S */
    public Button f196113S;

    /* renamed from: S0 */
    public NetSceneNewAAQueryPFInfo.PfInfoParcel f196114S0 = null;

    /* renamed from: T */
    public Dialog f196115T;

    /* renamed from: T0 */
    public String f196116T0;

    /* renamed from: U */
    public TextView f196117U;

    /* renamed from: U0 */
    public Dialog f196118U0;

    /* renamed from: V */
    public C79098e f196119V = new C79098e();

    /* renamed from: V0 */
    public boolean f196120V0 = false;

    /* renamed from: W */
    public boolean f196121W = false;

    /* renamed from: W0 */
    public Dialog f196122W0 = null;

    /* renamed from: X */
    public long f196123X = 0;

    /* renamed from: X0 */
    public int f196124X0 = 0;

    /* renamed from: Y */
    public String f196125Y;

    /* renamed from: Y0 */
    public C79013a f196126Y0;

    /* renamed from: Z */
    public long f196127Z;

    /* renamed from: Z0 */
    public ArrayList<String> f196128Z0 = new ArrayList<>();

    /* renamed from: a1 */
    public ArrayList<String> f196129a1 = new ArrayList<>();

    /* renamed from: b1 */
    public List<String> f196130b1 = new ArrayList();

    /* renamed from: c1 */
    public ViewGroup f196131c1;

    /* renamed from: d1 */
    public TextView f196132d1;

    /* renamed from: e1 */
    public IListener<LaunchAAEvent> f196133e1 = new IListener<LaunchAAEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1137642263;
        }

        public boolean callback(IEvent iEvent) {
            LaunchAAEvent launchAAEvent = (LaunchAAEvent) iEvent;
            if (launchAAEvent != null) {
                Log.m105925i("MicroMsg.Aa.LaunchAAUI", "launchAAEventIListener %s", launchAAEvent.f193713d.f193717c);
                LaunchAAUI launchAAUI = LaunchAAUI.this;
                LaunchAAEvent.C67723a aVar = launchAAEvent.f193713d;
                Context context = aVar.f193715a;
                String str = aVar.f193717c;
                ArrayList arrayList = aVar.f193716b;
                int i = LaunchAAUI.f196093l1;
                launchAAUI.mo93800W7(context, str, true, arrayList);
            }
            return true;
        }
    };

    /* renamed from: f1 */
    public KeyboardHeightProvider f196134f1;

    /* renamed from: g */
    public C67230f f196135g = ((C67230f) this.f196016e.mo136940b(this, C67230f.class));

    /* renamed from: g1 */
    public int f196136g1 = 0;

    /* renamed from: h */
    public int f196137h = 2;

    /* renamed from: h1 */
    public int f196138h1 = 0;

    /* renamed from: i */
    public int f196139i = 4;

    /* renamed from: i1 */
    public ScrollView f196140i1;

    /* renamed from: j */
    public String f196141j = null;

    /* renamed from: j1 */
    public View f196142j1;

    /* renamed from: k1 */
    public WcPayBannerView f196143k1;

    /* renamed from: n */
    public boolean f196144n = false;

    /* renamed from: o */
    public boolean f196145o = false;

    /* renamed from: p */
    public MMEditText f196146p;

    /* renamed from: p0 */
    public String f196147p0;

    /* renamed from: q */
    public TextView f196148q;

    /* renamed from: r */
    public TextView f196149r;

    /* renamed from: s */
    public TextView f196150s;

    /* renamed from: t */
    public TextView f196151t;

    /* renamed from: u */
    public LinearLayout f196152u;

    /* renamed from: v */
    public RelativeLayout f196153v;

    /* renamed from: w */
    public LinearLayout f196154w;

    /* renamed from: x */
    public ImageView f196155x;

    /* renamed from: x0 */
    public int f196156x0;

    /* renamed from: y */
    public TextView f196157y;

    /* renamed from: y0 */
    public int f196158y0;

    /* renamed from: z */
    public ImageView f196159z;

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$a */
    public class C68214a implements View.OnTouchListener {
        public C68214a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            LaunchAAUI.this.f196146p.setCursorVisible(true);
            MMEditText mMEditText = (MMEditText) view;
            LaunchAAUI.this.getClass();
            if (mMEditText.getLineCount() > mMEditText.getMaxLines()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$a0 */
    public class C68215a0 extends C79145c {
        public C68215a0() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            String charSequence = LaunchAAUI.this.f196148q.getText().toString();
            String charSequence2 = LaunchAAUI.this.f196149r.getText().toString();
            String charSequence3 = LaunchAAUI.this.f196150s.getText().toString();
            accessibilityNodeInfo.setClassName(TextView.class.getName());
            accessibilityNodeInfo.setContentDescription(charSequence + "," + charSequence3 + charSequence2);
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            int i = 1;
            if (!(launchAAUI.f196137h == 2 || launchAAUI.f196139i != 4)) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$b */
    public class C68216b implements View.OnFocusChangeListener {
        public C68216b() {
        }

        public void onFocusChange(View view, boolean z) {
            if (view.isFocused()) {
                LaunchAAUI launchAAUI = LaunchAAUI.this;
                launchAAUI.f196146p.setPadding(0, C76577a.m92151b(launchAAUI.getContext(), 12), 0, C76577a.m92151b(LaunchAAUI.this.getContext(), 16));
                LaunchAAUI.this.f196146p.setHint("");
                ((InputMethodManager) LaunchAAUI.this.getContext().getSystemService("input_method")).showSoftInput(LaunchAAUI.this.f196146p, 0);
            } else if (LaunchAAUI.this.f196146p.getText().length() > 0) {
                LaunchAAUI launchAAUI2 = LaunchAAUI.this;
                launchAAUI2.f196146p.setPadding(0, C76577a.m92151b(launchAAUI2.getContext(), 12), 0, C76577a.m92151b(LaunchAAUI.this.getContext(), 16));
            } else {
                LaunchAAUI launchAAUI3 = LaunchAAUI.this;
                launchAAUI3.f196146p.setPadding(0, C76577a.m92151b(launchAAUI3.getContext(), 28), 0, C76577a.m92151b(LaunchAAUI.this.getContext(), 16));
                LaunchAAUI launchAAUI4 = LaunchAAUI.this;
                launchAAUI4.f196146p.setHint(launchAAUI4.getString(C0966R.string.f360938g41));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$b0 */
    public class C68217b0 implements View.OnClickListener {
        public C68217b0() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LaunchAAUI.this.f196096C.requestFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$c */
    public class C68218c extends C7089c0 {
        public C68218c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            int i = LaunchAAUI.f196093l1;
            launchAAUI.getClass();
            Intent intent = new Intent(launchAAUI, LaunchAAByPersonAmountSelectUI.class);
            intent.putExtra("chatroom", launchAAUI.f196141j);
            intent.putExtra("maxPerAmount", launchAAUI.f196119V.mo109032b());
            intent.putExtra("enter_scene", launchAAUI.f196156x0);
            Map<String, Double> map = launchAAUI.f196109Q;
            if (map != null && ((HashMap) map).size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : ((HashMap) launchAAUI.f196109Q).keySet()) {
                    double doubleValue = ((Double) ((HashMap) launchAAUI.f196109Q).get(str)).doubleValue();
                    arrayList.add(str + "," + doubleValue);
                }
                intent.putStringArrayListExtra("oldAmountData", arrayList);
            }
            if (launchAAUI.mo93791M7() && launchAAUI.f196114S0.f195925f != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<NetSceneNewAAQueryPFInfo.AALaunchItemParcel> it = launchAAUI.f196114S0.f195925f.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().f195914d);
                }
                intent.putStringArrayListExtra("third_party_usernamelist", arrayList2);
            }
            intent.putExtra("group_solitatire_flag", launchAAUI.f196124X0);
            if (launchAAUI.mo93799V7()) {
                intent.putStringArrayListExtra("group_solitatire_username_list", launchAAUI.f196128Z0);
                intent.putStringArrayListExtra("group_solitatire_desc_list", launchAAUI.f196129a1);
            }
            intent.putExtra("maxUserNumber", launchAAUI.f196119V.mo109031a());
            launchAAUI.startActivityForResult(intent, 236);
            C115669n.INSTANCE.mo160131h(13721, 3, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$c0 */
    public class C68219c0 implements View.OnClickListener {
        public C68219c0() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LaunchAAUI.this.f196146p.requestFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$d */
    public class C68220d extends C7089c0 {
        public C68220d() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            int i;
            ImageView imageView;
            boolean z;
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "click switch button");
            LaunchAAUI.this.hideTenpayKB();
            LaunchAAUI.this.hideVKB();
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            int i2 = LaunchAAUI.f196093l1;
            C77407n nVar = new C77407n((Context) launchAAUI.getContext(), 1, false);
            View inflate = launchAAUI.getLayoutInflater().inflate(C0966R.C0971layout.b3w, (ViewGroup) null);
            C85875k4.m106189j0(((TextView) inflate.findViewById(C0966R.C0970id.fi9)).getPaint(), 0.8f);
            inflate.findViewById(C0966R.C0970id.kpb).setImportantForAccessibility(2);
            ((ImageView) inflate.findViewById(C0966R.C0970id.f357486a34)).setOnClickListener(new C68336t0(launchAAUI, nVar));
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.fi_);
            ImageView imageView2 = (ImageView) inflate.findViewById(C0966R.C0970id.fia);
            viewGroup.setAccessibilityDelegate(new C68344u0(launchAAUI));
            viewGroup.setOnClickListener(new C68346v0(launchAAUI, imageView2, nVar));
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0966R.C0970id.fib);
            ImageView imageView3 = (ImageView) inflate.findViewById(C0966R.C0970id.fic);
            viewGroup2.setOnClickListener(new C68349w0(launchAAUI, imageView3, nVar));
            viewGroup2.setAccessibilityDelegate(new C68351x0(launchAAUI));
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(C0966R.C0970id.fid);
            View findViewById = inflate.findViewById(C0966R.C0970id.fie);
            ImageView imageView4 = (ImageView) inflate.findViewById(C0966R.C0970id.fif);
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "aaPayCustomizeOpen switch is ：%s", Boolean.TRUE);
            if (launchAAUI.mo93791M7()) {
                Log.m105924i("MicroMsg.Aa.LaunchAAUI", "!isOpenAAPayCustomize() || fromThirdParty()，dont show cumstomize");
                viewGroup3.setVisibility(8);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = findViewById;
                i = 8;
                imageView = imageView4;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "showAAPaySelectDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "showAAPaySelectDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                imageView = imageView4;
                i = 8;
            }
            viewGroup3.setOnClickListener(new C68353y0(launchAAUI, imageView, nVar));
            viewGroup3.setAccessibilityDelegate(new C68358z0(launchAAUI));
            nVar.f225771i = new C68273a1(launchAAUI, nVar, inflate);
            if (launchAAUI.f196137h == 2) {
                C115669n.INSTANCE.mo160131h(13721, 2, 1);
                imageView2.setVisibility(0);
                imageView3.setVisibility(4);
                imageView.setVisibility(4);
                z = true;
            } else if (launchAAUI.f196139i == 4) {
                z = true;
                C115669n.INSTANCE.mo160131h(13721, Integer.valueOf(i), 1);
                imageView2.setVisibility(4);
                imageView3.setVisibility(4);
                imageView.setVisibility(0);
            } else {
                z = true;
                C115669n.INSTANCE.mo160131h(13721, 3, 1);
                imageView2.setVisibility(4);
                imageView3.setVisibility(0);
                imageView.setVisibility(4);
            }
            nVar.f225763e = new C68274b1(launchAAUI, inflate);
            nVar.mo107559d(z);
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$d0 */
    public class C68221d0 extends C7089c0 {
        public C68221d0() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0109  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2066a(android.view.View r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]
                com.tencent.mm.plugin.aa.ui.LaunchAAUI r3 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAUI.this
                int r3 = r3.f196137h
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r2[r4] = r3
                com.tencent.mm.plugin.aa.ui.LaunchAAUI r3 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAUI.this
                int r3 = r3.f196139i
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 1
                r2[r5] = r3
                java.lang.String r3 = "MicroMsg.Aa.LaunchAAUI"
                java.lang.String r6 = "click launchButton，mode：%s，submode：%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
                com.tencent.mm.plugin.aa.ui.LaunchAAUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAUI.this
                java.lang.Class<vr.g> r6 = p255vr.C14972g.class
                java.lang.Class<f62.k0> r7 = f62.C75700k0.class
                boolean r8 = r2.mo93791M7()
                if (r8 == 0) goto L_0x029b
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r8 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r8 = r8.f195928i
                if (r8 == 0) goto L_0x0297
                java.util.ArrayList<java.lang.String> r8 = r8.f195932d
                int r8 = r8.size()
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r9 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r9 = r9.f195928i
                java.util.ArrayList<java.lang.String> r9 = r9.f195933e
                int r9 = r9.size()
                int r8 = r8 + r9
                r9 = 3
                if (r8 != r5) goto L_0x0124
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r6 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r6 = r6.f195928i
                java.util.ArrayList<java.lang.String> r6 = r6.f195932d
                int r6 = r6.size()
                if (r6 != r5) goto L_0x0094
                f40.C86709a0.m107528h()
                k40.a r1 = f40.C86709a0.m107533q(r7)
                f62.k0 r1 = (f62.C75700k0) r1
                com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r3 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r3 = r3.f195928i
                java.util.ArrayList<java.lang.String> r3 = r3.f195932d
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                com.tencent.mm.storage.z1 r1 = r1.get(r3)
                if (r1 == 0) goto L_0x008f
                boolean r1 = r1.mo62927s3()
                if (r1 == 0) goto L_0x008f
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r1 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r1 = r1.f195928i
                java.util.ArrayList<java.lang.String> r1 = r1.f195932d
                java.lang.Object r1 = r1.get(r4)
                java.lang.String r1 = (java.lang.String) r1
                r2.mo93812j8(r1)
                goto L_0x02a0
            L_0x008f:
                r2.mo93795Q7(r15)
                goto L_0x02a0
            L_0x0094:
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r6 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r6 = r6.f195928i
                java.util.ArrayList<java.lang.String> r6 = r6.f195933e
                int r6 = r6.size()
                if (r6 != r5) goto L_0x011d
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r3 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r3 = r3.f195928i
                java.util.ArrayList<java.lang.String> r3 = r3.f195933e
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                java.util.List r3 = yf0.C79104i.m95664i(r3)
                int r6 = r2.f196137h
                if (r6 != r1) goto L_0x00cd
                java.util.List<java.lang.String> r1 = r2.f196100G
                java.util.Iterator r1 = r1.iterator()
            L_0x00ba:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x00ee
                java.lang.Object r6 = r1.next()
                java.lang.String r6 = (java.lang.String) r6
                boolean r6 = r3.contains(r6)
                if (r6 != 0) goto L_0x00ba
                goto L_0x00ed
            L_0x00cd:
                if (r6 != r9) goto L_0x00ee
                java.util.Map<java.lang.String, java.lang.Double> r1 = r2.f196109Q
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x00db:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x00ee
                java.lang.Object r6 = r1.next()
                java.lang.String r6 = (java.lang.String) r6
                boolean r6 = r3.contains(r6)
                if (r6 != 0) goto L_0x00db
            L_0x00ed:
                r5 = 0
            L_0x00ee:
                boolean r1 = com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAUI.m80630S7(r3)
                if (r5 == 0) goto L_0x0107
                if (r1 == 0) goto L_0x0107
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r1 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r1 = r1.f195928i
                java.util.ArrayList<java.lang.String> r1 = r1.f195933e
                java.lang.Object r1 = r1.get(r4)
                java.lang.String r1 = (java.lang.String) r1
                r2.mo93812j8(r1)
                goto L_0x02a0
            L_0x0107:
                if (r1 == 0) goto L_0x0118
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r1 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r1 = r1.f195928i
                java.util.ArrayList<java.lang.String> r1 = r1.f195933e
                java.lang.Object r1 = r1.get(r4)
                java.lang.String r1 = (java.lang.String) r1
                r15.add(r1)
            L_0x0118:
                r2.mo93795Q7(r15)
                goto L_0x02a0
            L_0x011d:
                java.lang.String r1 = "num == 1 ?????"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
                goto L_0x02a0
            L_0x0124:
                if (r8 <= r5) goto L_0x013d
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r1 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r1 = r1.f195928i
                java.util.ArrayList<java.lang.String> r1 = r1.f195933e
                r15.addAll(r1)
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r1 = r2.f196114S0
                com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel r1 = r1.f195928i
                java.util.ArrayList<java.lang.String> r1 = r1.f195932d
                r15.addAll(r1)
                r2.mo93795Q7(r15)
                goto L_0x02a0
            L_0x013d:
                int r3 = r2.f196137h
                if (r3 != r1) goto L_0x0148
                java.util.List<java.lang.String> r3 = r2.f196100G
                int r3 = r3.size()
                goto L_0x0150
            L_0x0148:
                java.util.Map<java.lang.String, java.lang.Double> r3 = r2.f196109Q
                java.util.HashMap r3 = (java.util.HashMap) r3
                int r3 = r3.size()
            L_0x0150:
                if (r3 != r5) goto L_0x01a1
                java.util.Map<java.lang.String, java.lang.Double> r1 = r2.f196109Q
                java.util.HashMap r1 = (java.util.HashMap) r1
                int r1 = r1.size()
                if (r1 != r5) goto L_0x0177
                java.util.Map<java.lang.String, java.lang.Double> r1 = r2.f196109Q
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
                java.lang.String r3 = ""
            L_0x016a:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0180
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x016a
            L_0x0177:
                java.util.List<java.lang.String> r1 = r2.f196100G
                java.lang.Object r1 = r1.get(r4)
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3
            L_0x0180:
                f40.C86709a0.m107528h()
                k40.a r1 = f40.C86709a0.m107533q(r7)
                f62.k0 r1 = (f62.C75700k0) r1
                com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
                com.tencent.mm.storage.z1 r1 = r1.get(r3)
                if (r1 == 0) goto L_0x019c
                boolean r1 = r1.mo62927s3()
                if (r1 == 0) goto L_0x019c
                r15.add(r3)
            L_0x019c:
                r2.mo93795Q7(r15)
                goto L_0x02a0
            L_0x01a1:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int r8 = r2.f196137h
                java.lang.String r10 = " "
                if (r8 != r1) goto L_0x01dc
                java.util.List<java.lang.String> r8 = r2.f196100G
                java.util.Iterator r8 = r8.iterator()
            L_0x01b2:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0214
                java.lang.Object r9 = r8.next()
                java.lang.String r9 = (java.lang.String) r9
                f40.C86709a0.m107528h()
                k40.a r11 = f40.C86709a0.m107533q(r7)
                f62.k0 r11 = (f62.C75700k0) r11
                com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()
                com.tencent.mm.storage.z1 r9 = r11.get(r9)
                if (r9 == 0) goto L_0x01b2
                java.lang.String r9 = r9.getNickname()
                r3.append(r9)
                r3.append(r10)
                goto L_0x01b2
            L_0x01dc:
                if (r8 != r9) goto L_0x0214
                java.util.Map<java.lang.String, java.lang.Double> r8 = r2.f196109Q
                java.util.HashMap r8 = (java.util.HashMap) r8
                java.util.Set r8 = r8.keySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x01ea:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0214
                java.lang.Object r9 = r8.next()
                java.lang.String r9 = (java.lang.String) r9
                f40.C86709a0.m107528h()
                k40.a r11 = f40.C86709a0.m107533q(r7)
                f62.k0 r11 = (f62.C75700k0) r11
                com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()
                com.tencent.mm.storage.z1 r9 = r11.get(r9)
                if (r9 == 0) goto L_0x01ea
                java.lang.String r9 = r9.getNickname()
                r3.append(r9)
                r3.append(r10)
                goto L_0x01ea
            L_0x0214:
                java.lang.String r3 = r3.toString()
                int[] r7 = new int[r5]
                r8 = 131075(0x20003, float:1.83675E-40)
                r7[r4] = r8
                r18 = 0
                r19 = 5
                java.util.HashSet r20 = new java.util.HashSet
                r20.<init>()
                di3.d r4 = di3.C86312j.m106911c(r6)
                vr.g r4 = (p255vr.C14972g) r4
                java.util.Comparator r21 = r4.mo14022MG()
                com.tencent.mm.plugin.aa.ui.f0 r4 = new com.tencent.mm.plugin.aa.ui.f0
                r4.<init>(r2, r15, r3)
                com.tencent.mm.sdk.platformtools.MMHandler r8 = new com.tencent.mm.sdk.platformtools.MMHandler
                android.os.Looper r9 = android.os.Looper.getMainLooper()
                r8.<init>((android.os.Looper) r9)
                r16 = r3
                r17 = r7
                r22 = r4
                r23 = r8
                lv1.k r3 = lv1.C76728k.m92447a(r16, r17, r18, r19, r20, r21, r22, r23)
                r4 = 96
                r3.f224467b = r4
                di3.d r4 = di3.C86312j.m106911c(r6)
                vr.g r4 = (p255vr.C14972g) r4
                java.util.Comparator r4 = r4.mo14023Tu()
                r3.f224477l = r4
                java.lang.Class<kv1.q> r4 = kv1.C99260q.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                kv1.q r4 = (kv1.C99260q) r4
                lv1.b r1 = r4.Xn0(r1, r3)
                r2.f196120V0 = r5
                android.app.Dialog r3 = r2.f196118U0
                if (r3 != 0) goto L_0x0289
                r8 = 0
                r9 = 3
                r10 = 2131886550(0x7f1201d6, float:1.9407682E38)
                r3 = 2131832197(0x7f112d85, float:1.9297441E38)
                java.lang.String r11 = r2.getString(r3)
                r12 = 1
                r13 = 1
                com.tencent.mm.plugin.aa.ui.g0 r14 = new com.tencent.mm.plugin.aa.ui.g0
                r14.<init>(r2, r1)
                r7 = r2
                qo3.i0 r3 = nj3.C76879j.m92721O(r7, r8, r9, r10, r11, r12, r13, r14)
                r2.f196118U0 = r3
                goto L_0x028c
            L_0x0289:
                r3.show()
            L_0x028c:
                com.tencent.mm.plugin.aa.ui.h0 r3 = new com.tencent.mm.plugin.aa.ui.h0
                r3.<init>(r2, r1, r15)
                r1 = 3000(0xbb8, double:1.482E-320)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r1)
                goto L_0x02a0
            L_0x0297:
                r2.mo93795Q7(r15)
                goto L_0x02a0
            L_0x029b:
                java.lang.String r1 = r2.f196141j
                r2.mo93812j8(r1)
            L_0x02a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAUI.C68221d0.mo2066a(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$e */
    public class C68222e implements Runnable {
        public C68222e() {
        }

        public void run() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) LaunchAAUI.this.f196152u.getLayoutParams();
            View findViewById = LaunchAAUI.this.findViewById(C0966R.C0970id.fij);
            layoutParams.leftMargin = findViewById.getLeft() - 12;
            layoutParams.width = findViewById.getWidth() + 24;
            layoutParams.topMargin = findViewById.getTop() - 12;
            layoutParams.height = findViewById.getHeight() + 24;
            LaunchAAUI.this.f196152u.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$e0 */
    public class C68223e0 implements TextWatcher {
        public C68223e0() {
        }

        public void afterTextChanged(Editable editable) {
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            int i = LaunchAAUI.f196093l1;
            launchAAUI.mo93816n8();
            LaunchAAUI launchAAUI2 = LaunchAAUI.this;
            launchAAUI2.mo93807d8(launchAAUI2.f196104K, launchAAUI2.f196105L);
            LaunchAAUI.this.mo93790I7(6);
            LaunchAAUI.this.mo93809f8();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$f */
    public class C68224f extends C7089c0 {
        public C68224f() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LaunchAAUI.this.hideTenpayKB();
            LaunchAAUI.this.hideVKB();
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            LaunchAAUI.m80627J7(launchAAUI, 330, launchAAUI.f196130b1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$g */
    public class C68225g implements MenuItem.OnMenuItemClickListener {
        public C68225g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LaunchAAUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$h */
    public class C68226h implements TextWatcher {

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$h$a */
        public class C68227a implements Runnable {
            public C68227a() {
            }

            public void run() {
                ((C79090a) C39818r.f106831a.mo62444c(LaunchAAUI.this.getContext()).mo75002a(C79090a.class)).setValue("LAUNCH_AA_TOTAL_MONEY_EDIT_FORM_VALUE_KEY", LaunchAAUI.this.f196096C.getContentEt().getText().toString());
            }
        }

        public C68226h() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(".")) {
                editable.insert(0, "0");
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 3) {
                WalletFormView.m90177f(LaunchAAUI.this.f196096C.getContentEt(), obj, indexOf + 3, length);
            } else if (indexOf > 6) {
                WalletFormView.m90177f(LaunchAAUI.this.f196096C.getContentEt(), obj, 6, indexOf);
            } else if (indexOf == -1 && length > 6) {
                WalletFormView.m90177f(LaunchAAUI.this.f196096C.getContentEt(), obj, 6, length);
            }
            double d = Util.getDouble(editable.toString(), 0.0d);
            List<String> list = LaunchAAUI.this.f196100G;
            if (list == null || list.size() <= 0 || (d * 100.0d) / ((double) LaunchAAUI.this.f196100G.size()) <= ((double) LaunchAAUI.this.f196119V.mo109032b())) {
                LaunchAAUI.this.f196145o = false;
            } else {
                LaunchAAUI.this.f196145o = true;
                C115669n.INSTANCE.mo160131h(13722, 2);
            }
            if (AccessibilityHelper.getInstance(LaunchAAUI.this.getContext()).isAccessibilityEnable()) {
                if (obj.length() == 0) {
                    LaunchAAUI.this.f196096C.getContentEt().setHint(LaunchAAUI.this.getString(C0966R.string.g3q));
                } else {
                    LaunchAAUI.this.f196096C.getContentEt().setHint((CharSequence) null);
                }
            }
            LaunchAAUI.this.f196096C.post(new C68227a());
            LaunchAAUI.this.mo93816n8();
            LaunchAAUI.this.mo93815m8();
            LaunchAAUI.this.mo93814l8();
            LaunchAAUI.this.mo93790I7(3);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$i */
    public class C68228i extends C7089c0 {
        public C68228i() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LaunchAAUI.this.hideTenpayKB();
            LaunchAAUI.this.hideVKB();
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            LaunchAAUI.m80627J7(launchAAUI, 233, launchAAUI.f196100G);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$j */
    public class C68229j implements Animation.AnimationListener {
        public C68229j() {
        }

        public void onAnimationEnd(Animation animation) {
            LaunchAAUI.this.f196117U.sendAccessibilityEvent(128);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$k */
    public class C68230k implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f196177a;

        public C68230k(String str) {
            this.f196177a = str;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                Log.m105925i("MicroMsg.Aa.LaunchAAUI", "click launchDialog confirm，mode：%s，submode：%s", Integer.valueOf(LaunchAAUI.this.f196137h), Integer.valueOf(LaunchAAUI.this.f196139i));
                LaunchAAUI launchAAUI = LaunchAAUI.this;
                String str2 = this.f196177a;
                launchAAUI.getClass();
                launchAAUI.mo93800W7(launchAAUI, str2, false, new ArrayList());
                LaunchAAUI.this.mo93790I7(12);
                C115669n.INSTANCE.mo160131h(13721, 8, 4);
                return;
            }
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "click launchDialog cancel，mode：%s，submode：%s", Integer.valueOf(LaunchAAUI.this.f196137h), Integer.valueOf(LaunchAAUI.this.f196139i));
            LaunchAAUI.this.mo93790I7(13);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$l */
    public class C68231l implements C79095d.C79097b {

        /* renamed from: a */
        public final /* synthetic */ boolean f196179a;

        /* renamed from: b */
        public final /* synthetic */ Context f196180b;

        /* renamed from: c */
        public final /* synthetic */ String f196181c;

        /* renamed from: d */
        public final /* synthetic */ int f196182d;

        /* renamed from: e */
        public final /* synthetic */ String f196183e;

        /* renamed from: f */
        public final /* synthetic */ double f196184f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f196185g;

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$l$a */
        public class C68232a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f196187d;

            /* renamed from: e */
            public final /* synthetic */ String f196188e;

            public C68232a(String str, String str2) {
                this.f196187d = str;
                this.f196188e = str2;
            }

            public void run() {
                C68231l lVar = C68231l.this;
                if (lVar.f196179a) {
                    LaunchAAUI launchAAUI = LaunchAAUI.this;
                    Context context = lVar.f196180b;
                    String str = lVar.f196181c;
                    int i = lVar.f196182d;
                    String str2 = lVar.f196183e;
                    double d = lVar.f196184f;
                    ArrayList arrayList = lVar.f196185g;
                    String str3 = this.f196187d;
                    String str4 = this.f196188e;
                    int i2 = LaunchAAUI.f196093l1;
                    launchAAUI.mo93801X7(context, str, i, str2, d, arrayList, str3, str4);
                    return;
                }
                LaunchAAUI launchAAUI2 = LaunchAAUI.this;
                launchAAUI2.mo93801X7(lVar.f196180b, lVar.f196181c, lVar.f196182d, lVar.f196183e, lVar.f196184f, launchAAUI2.f196100G, this.f196187d, this.f196188e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$l$b */
        public class C68233b implements Runnable {
            public C68233b() {
            }

            public void run() {
                Dialog dialog = LaunchAAUI.this.f196115T;
                if (dialog != null) {
                    dialog.dismiss();
                }
                C76701a.makeText(C68231l.this.f196180b, (int) C0966R.string.g45, 1).show();
            }
        }

        public C68231l(boolean z, Context context, String str, int i, String str2, double d, ArrayList arrayList) {
            this.f196179a = z;
            this.f196180b = context;
            this.f196181c = str;
            this.f196182d = i;
            this.f196183e = str2;
            this.f196184f = d;
            this.f196185g = arrayList;
        }

        /* renamed from: a */
        public void mo93834a(String str, int i, String str2, int i2, String str3, String str4) {
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onSuccess");
            MMHandlerThread.postToMainThread(new C68232a(str, str2));
        }

        /* renamed from: e */
        public void mo93835e(int i, int i2, String str) {
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onError");
            MMHandlerThread.postToMainThread(new C68233b());
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$m */
    public class C68234m implements C79095d.C79097b {

        /* renamed from: a */
        public final /* synthetic */ Context f196191a;

        /* renamed from: b */
        public final /* synthetic */ String f196192b;

        /* renamed from: c */
        public final /* synthetic */ boolean f196193c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f196194d;

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$m$a */
        public class C68235a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f196196d;

            /* renamed from: e */
            public final /* synthetic */ String f196197e;

            public C68235a(String str, String str2) {
                this.f196196d = str;
                this.f196197e = str2;
            }

            public void run() {
                if (C86013q1.m106450k(LaunchAAUI.this.mo93792N7())) {
                    Log.m105924i("MicroMsg.Aa.LaunchAAUI", " upload success , delete file");
                    C86013q1.m106447h(LaunchAAUI.this.mo93792N7());
                }
                C68234m mVar = C68234m.this;
                LaunchAAUI launchAAUI = LaunchAAUI.this;
                if (launchAAUI.f196139i != 4) {
                    launchAAUI.mo93802Y7(mVar.f196191a, mVar.f196192b, this.f196196d, this.f196197e, mVar.f196193c, mVar.f196194d);
                } else if (launchAAUI.mo93799V7()) {
                    C68234m mVar2 = C68234m.this;
                    LaunchAAUI launchAAUI2 = LaunchAAUI.this;
                    launchAAUI2.mo93803Z7(mVar2.f196191a, mVar2.f196192b, this.f196196d, this.f196197e, mVar2.f196193c, launchAAUI2.f196130b1);
                } else {
                    C68234m mVar3 = C68234m.this;
                    LaunchAAUI.this.mo93803Z7(mVar3.f196191a, mVar3.f196192b, this.f196196d, this.f196197e, mVar3.f196193c, mVar3.f196194d);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$m$b */
        public class C68236b implements Runnable {
            public C68236b() {
            }

            public void run() {
                Dialog dialog = LaunchAAUI.this.f196115T;
                if (dialog != null) {
                    dialog.dismiss();
                }
                C76701a.makeText(C68234m.this.f196191a, (int) C0966R.string.g45, 1).show();
            }
        }

        public C68234m(Context context, String str, boolean z, ArrayList arrayList) {
            this.f196191a = context;
            this.f196192b = str;
            this.f196193c = z;
            this.f196194d = arrayList;
        }

        /* renamed from: a */
        public void mo93834a(String str, int i, String str2, int i2, String str3, String str4) {
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onSuccess");
            MMHandlerThread.postToMainThread(new C68235a(str, str2));
        }

        /* renamed from: e */
        public void mo93835e(int i, int i2, String str) {
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onError");
            MMHandlerThread.postToMainThread(new C68236b());
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$n */
    public class C68237n implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ Context f196200a;

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$n$a */
        public class C68238a implements DialogInterface.OnClickListener {
            public C68238a(C68237n nVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.Aa.LaunchAAUI", "onDialogClick()");
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$n$b */
        public class C68239b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C77903a f196202d;

            public C68239b(C77903a aVar) {
                this.f196202d = aVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C75228t.m90219L(LaunchAAUI.this.getContext(), this.f196202d.f226968h, false);
            }
        }

        public C68237n(Context context) {
            this.f196200a = context;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "onInterrupt: %s", obj);
            Dialog dialog = LaunchAAUI.this.f196115T;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (obj != null && (obj instanceof String) && !obj.toString().equalsIgnoreCase("ok")) {
                C76879j.m92711E(this.f196200a, obj.toString(), "", LaunchAAUI.this.getString(C0966R.string.g47), false, new C68238a(this));
            } else if (obj != null && (obj instanceof C77910c0)) {
                C79104i.m95660e(LaunchAAUI.this.getContext(), (C77910c0) obj);
            } else if (obj == null || !(obj instanceof C77903a)) {
                C76701a.makeText(this.f196200a, (int) C0966R.string.g45, 1).show();
            } else {
                C77903a aVar = (C77903a) obj;
                String str = aVar.f226965e;
                String str2 = aVar.f226966f;
                String str3 = aVar.f226967g;
                Context context = this.f196200a;
                C77389a aVar2 = new C77389a();
                aVar2.f225660q = str;
                aVar2.f225663t = str3;
                aVar2.f225620C = new C68239b(aVar);
                aVar2.f225664u = str2;
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar2);
                gVar.show();
            }
            C115669n.INSTANCE.mo160131h(13722, 5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$o */
    public class C68240o implements C87581a<Void, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ String f196204a;

        /* renamed from: b */
        public final /* synthetic */ Context f196205b;

        public C68240o(String str, Context context) {
            this.f196204a = str;
            this.f196205b = context;
        }

        public Object call(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105919d("MicroMsg.Aa.LaunchAAUI", "finish launch aa, result: %s", bool);
            Dialog dialog = LaunchAAUI.this.f196115T;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (bool.booleanValue()) {
                LaunchAAUI.m80628K7(LaunchAAUI.this, this.f196204a);
                C76701a.makeText(this.f196205b, (int) C0966R.string.g4q, 1).show();
                C115669n.INSTANCE.mo160131h(13722, 4);
                ((C75709u0) C86312j.m106911c(C75709u0.class)).mo59209yn(this.f196204a);
                return null;
            }
            C76701a.makeText(this.f196205b, (int) C0966R.string.g45, 1).show();
            C115669n.INSTANCE.mo160131h(13722, 5);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$p */
    public class C68241p implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ Context f196207a;

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$p$a */
        public class C68242a implements DialogInterface.OnClickListener {
            public C68242a(C68241p pVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.Aa.LaunchAAUI", "onDialogClick()");
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$p$b */
        public class C68243b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C77903a f196209d;

            public C68243b(C77903a aVar) {
                this.f196209d = aVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C75228t.m90219L(LaunchAAUI.this.getContext(), this.f196209d.f226968h, false);
            }
        }

        public C68241p(Context context) {
            this.f196207a = context;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "onInterrupt: %s", obj);
            Dialog dialog = LaunchAAUI.this.f196115T;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (obj != null && (obj instanceof String) && !obj.toString().equalsIgnoreCase("ok")) {
                C76879j.m92711E(this.f196207a, obj.toString(), "", LaunchAAUI.this.getString(C0966R.string.g47), false, new C68242a(this));
            } else if (obj != null && (obj instanceof C77910c0)) {
                C79104i.m95660e(LaunchAAUI.this.getContext(), (C77910c0) obj);
            } else if (obj == null || !(obj instanceof C77903a)) {
                C76701a.makeText(this.f196207a, (int) C0966R.string.g45, 1).show();
            } else {
                C77903a aVar = (C77903a) obj;
                String str = aVar.f226965e;
                String str2 = aVar.f226966f;
                String str3 = aVar.f226967g;
                Context context = this.f196207a;
                C77389a aVar2 = new C77389a();
                aVar2.f225660q = str;
                aVar2.f225663t = str3;
                aVar2.f225620C = new C68243b(aVar);
                aVar2.f225664u = str2;
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar2);
                gVar.show();
            }
            C115669n.INSTANCE.mo160131h(13722, 10);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$q */
    public class C68244q implements C87581a<Void, C117878c<Boolean, String, Long>> {

        /* renamed from: a */
        public final /* synthetic */ String f196211a;

        /* renamed from: b */
        public final /* synthetic */ Context f196212b;

        public C68244q(String str, Context context) {
            this.f196211a = str;
            this.f196212b = context;
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            Log.m105919d("MicroMsg.Aa.LaunchAAUI", "finish launch aa, result: %s", cVar.mo182596a(0));
            Dialog dialog = LaunchAAUI.this.f196115T;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (((Boolean) cVar.mo182596a(0)).booleanValue()) {
                LaunchAAUI.m80628K7(LaunchAAUI.this, this.f196211a);
                C76701a.makeText(this.f196212b, (int) C0966R.string.g4q, 1).show();
                C115669n.INSTANCE.mo160131h(13722, 9);
                ((C75709u0) C86312j.m106911c(C75709u0.class)).mo59209yn(this.f196211a);
                return null;
            }
            C76701a.makeText(this.f196212b, (int) C0966R.string.g45, 1).show();
            C115669n.INSTANCE.mo160131h(13722, 10);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$r */
    public class C68245r implements View.OnTouchListener {
        public C68245r() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            LaunchAAUI.this.hideTenpayKB();
            LaunchAAUI.this.hideVKB();
            if (LaunchAAUI.this.f196146p.findFocus() != null) {
                LaunchAAUI.this.f196146p.setCursorVisible(false);
                LaunchAAUI.this.f196146p.clearFocus();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$s */
    public class C68246s implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ Context f196215a;

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$s$a */
        public class C68247a implements DialogInterface.OnClickListener {
            public C68247a(C68246s sVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.Aa.LaunchAAUI", "onDialogClick()");
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$s$b */
        public class C68248b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C77903a f196217d;

            public C68248b(C77903a aVar) {
                this.f196217d = aVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C75228t.m90219L(LaunchAAUI.this.getContext(), this.f196217d.f226968h, false);
            }
        }

        public C68246s(Context context) {
            this.f196215a = context;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "onInterrupt: %s", obj);
            Dialog dialog = LaunchAAUI.this.f196115T;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (obj != null && (obj instanceof String) && !obj.toString().equalsIgnoreCase("ok")) {
                C76879j.m92711E(this.f196215a, obj.toString(), "", LaunchAAUI.this.getString(C0966R.string.g47), false, new C68247a(this));
            } else if (obj != null && (obj instanceof C77910c0)) {
                C79104i.m95660e(LaunchAAUI.this.getContext(), (C77910c0) obj);
            } else if (obj == null || !(obj instanceof C77903a)) {
                C76701a.makeText(this.f196215a, (int) C0966R.string.g45, 1).show();
            } else {
                C77903a aVar = (C77903a) obj;
                String str = aVar.f226965e;
                String str2 = aVar.f226966f;
                String str3 = aVar.f226967g;
                Context context = this.f196215a;
                C77389a aVar2 = new C77389a();
                aVar2.f225660q = str;
                aVar2.f225663t = str3;
                aVar2.f225620C = new C68248b(aVar);
                aVar2.f225664u = str2;
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar2);
                gVar.show();
            }
            C115669n.INSTANCE.mo160131h(13722, 10);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$t */
    public class C68249t implements C87581a<Void, C117878c<Boolean, String, Long>> {

        /* renamed from: a */
        public final /* synthetic */ String f196219a;

        /* renamed from: b */
        public final /* synthetic */ Context f196220b;

        public C68249t(String str, Context context) {
            this.f196219a = str;
            this.f196220b = context;
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            Log.m105919d("MicroMsg.Aa.LaunchAAUI", "finish launch aa, result: %s", cVar.mo182596a(0));
            Dialog dialog = LaunchAAUI.this.f196115T;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (((Boolean) cVar.mo182596a(0)).booleanValue()) {
                LaunchAAUI.m80628K7(LaunchAAUI.this, this.f196219a);
                C76701a.makeText(this.f196220b, (int) C0966R.string.g4q, 1).show();
                C115669n.INSTANCE.mo160131h(13722, 9);
                ((C75709u0) C86312j.m106911c(C75709u0.class)).mo59209yn(this.f196219a);
                return null;
            }
            C76701a.makeText(this.f196220b, (int) C0966R.string.g45, 1).show();
            C115669n.INSTANCE.mo160131h(13722, 10);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$u */
    public class C68250u implements Runnable {
        public C68250u() {
        }

        public void run() {
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(launchAAUI.f196112R0, launchAAUI.f196159z.getWidth(), LaunchAAUI.this.f196159z.getHeight());
            int orientationInDegree = Exif.fromFile(LaunchAAUI.this.f196112R0).getOrientationInDegree();
            Bitmap rotate = BitmapUtil.rotate(decodeFileWithSample, (float) orientationInDegree);
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "exifPath : %s degree : %d", LaunchAAUI.this.f196112R0, Integer.valueOf(orientationInDegree));
            LaunchAAUI.this.f196159z.setImageBitmap(rotate);
            LaunchAAUI.this.f196159z.sendAccessibilityEvent(128);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$v */
    public class C68251v extends C79145c {
        public C68251v() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setContentDescription(LaunchAAUI.this.getString(C0966R.string.g36));
            if (!view.isClickable()) {
                view.setImportantForAccessibility(2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$w */
    public class C68252w implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f196224d;

        /* renamed from: e */
        public final /* synthetic */ View f196225e;

        public C68252w(View view, View view2) {
            this.f196224d = view;
            this.f196225e = view2;
        }

        public void run() {
            int b = C76577a.m92151b(LaunchAAUI.this.getContext(), 48);
            int b2 = C76577a.m92151b(LaunchAAUI.this.getContext(), 64);
            int b3 = C76577a.m92151b(LaunchAAUI.this.getContext(), 96);
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            View view = this.f196224d;
            int i = LaunchAAUI.f196093l1;
            int i2 = C75044y4.m89990b(launchAAUI.getContext()).y;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            boolean z = true;
            int height = iArr[1] + view.getHeight();
            Log.m105919d("MicroMsg.Aa.LaunchAAUI", "viewY is ：%s ；ScreenHeight is ：%s", Integer.valueOf(height), Integer.valueOf(i2));
            if (height <= (i2 * 2) / 3) {
                z = false;
            }
            if (z) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f196225e.getLayoutParams();
                layoutParams.removeRule(12);
                layoutParams.addRule(3, C0966R.C0970id.krn);
                layoutParams.topMargin = b;
                this.f196225e.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f196225e.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = b3;
            this.f196225e.setLayoutParams(layoutParams2);
            if (LaunchAAUI.m80629L7(LaunchAAUI.this, this.f196225e, this.f196224d) < b) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f196225e.getLayoutParams();
                layoutParams2.removeRule(3);
                layoutParams3.addRule(12);
                layoutParams3.bottomMargin = b2;
                this.f196225e.setLayoutParams(layoutParams3);
                if (LaunchAAUI.m80629L7(LaunchAAUI.this, this.f196225e, this.f196224d) < b) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f196225e.getLayoutParams();
                    layoutParams4.removeRule(12);
                    layoutParams4.addRule(3, C0966R.C0970id.krn);
                    layoutParams4.topMargin = b;
                    this.f196225e.setLayoutParams(layoutParams4);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$x */
    public class C68253x implements Runnable {
        public C68253x() {
        }

        public void run() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) LaunchAAUI.this.f196142j1.getLayoutParams();
            layoutParams.height = 0;
            LaunchAAUI.this.f196142j1.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$y */
    public class C68254y implements Runnable {
        public C68254y() {
        }

        public void run() {
            LaunchAAUI launchAAUI = LaunchAAUI.this;
            launchAAUI.mo93807d8(launchAAUI.f196104K, launchAAUI.f196105L);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI$z */
    public class C68255z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f196229d;

        public C68255z(int i) {
            this.f196229d = i;
        }

        public void run() {
            LaunchAAUI.this.f196140i1.smoothScrollBy(0, this.f196229d);
        }
    }

    /* renamed from: J7 */
    public static void m80627J7(LaunchAAUI launchAAUI, int i, List list) {
        int i2;
        launchAAUI.getClass();
        Intent intent = new Intent(launchAAUI, AASelectContactUI.class);
        intent.putExtra("titile", launchAAUI.getString(C0966R.string.g4o));
        intent.putExtra("list_type", 12);
        intent.putExtra("chatroomName", launchAAUI.f196141j);
        intent.putExtra("enter_scene", launchAAUI.f196156x0);
        intent.putExtra("enter_mode", launchAAUI.f196137h);
        intent.putExtra("enter_sub_mode", launchAAUI.f196139i);
        intent.putExtra("group_solitatire_flag", launchAAUI.f196124X0);
        if (launchAAUI.mo93799V7()) {
            intent.putStringArrayListExtra("group_solitatire_username_list", launchAAUI.f196128Z0);
            intent.putStringArrayListExtra("group_solitatire_desc_list", launchAAUI.f196129a1);
        }
        if (list != null) {
            intent.putExtra("already_select_contact", Util.listToString(list, ","));
        }
        if (launchAAUI.mo93791M7() && launchAAUI.f196114S0.f195925f != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NetSceneNewAAQueryPFInfo.AALaunchItemParcel> it = launchAAUI.f196114S0.f195925f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f195914d);
            }
            intent.putStringArrayListExtra("third_party_usernamelist", arrayList);
        }
        if (launchAAUI.mo93791M7()) {
            i2 = launchAAUI.f196114S0.f195925f.size();
        } else if (C72996z1.m85820U5(launchAAUI.f196141j)) {
            i2 = Math.min(launchAAUI.f196119V.mo109033c(), launchAAUI.mo93793O7(launchAAUI.f196137h == 3 && launchAAUI.f196139i == 4).size());
        } else {
            i2 = Math.min(launchAAUI.f196119V.mo109033c(), 2);
        }
        intent.putExtra("max_select_num", (long) i2);
        intent.putExtra("select_type", 1);
        launchAAUI.startActivityForResult(intent, i);
        C115669n.INSTANCE.mo160131h(13721, 2, 2);
    }

    /* renamed from: K7 */
    public static void m80628K7(LaunchAAUI launchAAUI, String str) {
        if (!launchAAUI.mo93791M7()) {
            str = launchAAUI.getIntent().getStringExtra("chatroom_name");
        }
        Log.m105925i("MicroMsg.Aa.LaunchAAUI", "[goToChattingUI] username:%s", str);
        Intent putExtra = new Intent().putExtra("Main_User", str);
        putExtra.putExtra("From_fail_notify", true);
        putExtra.addFlags(67108864);
        putExtra.addFlags(536870912);
        C88144b.m109801s(launchAAUI, "com.tencent.mm.ui.LauncherUI", putExtra, (Bundle) null);
    }

    /* renamed from: L7 */
    public static int m80629L7(LaunchAAUI launchAAUI, View view, View view2) {
        launchAAUI.getClass();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        int height = iArr2[1] + view2.getHeight();
        int i2 = i - height;
        Log.m105919d("MicroMsg.Aa.LaunchAAUI", "bottomViewY is ：%s ； aboveViewY is ：%s", Integer.valueOf(i), Integer.valueOf(height));
        Log.m105919d("MicroMsg.Aa.LaunchAAUI", "marginTop is ：%s", Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: S7 */
    public static boolean m80630S7(List<String> list) {
        if (list == null) {
            return false;
        }
        for (String isEqual : list) {
            if (Util.isEqual(isEqual, C75592q0.m90789s())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I7 */
    public void mo93790I7(int i) {
        if (mo93791M7()) {
            GroupPayPfClickReportStruct groupPayPfClickReportStruct = new GroupPayPfClickReportStruct();
            groupPayPfClickReportStruct.f156281d = (long) i;
            groupPayPfClickReportStruct.mo86054n();
        }
    }

    /* renamed from: M7 */
    public final boolean mo93791M7() {
        return this.f196156x0 == 6;
    }

    /* renamed from: N7 */
    public String mo93792N7() {
        return new C86009m1(getContext().getCacheDir() + "/aaTempPho", "aa_share_bitmap.jpg").mo119971i();
    }

    /* renamed from: O7 */
    public ArrayList<String> mo93793O7(boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (mo93799V7()) {
            arrayList.addAll(C79104i.m95666k(mo93794P7(), this.f196141j, z, true));
        } else {
            arrayList.addAll(mo93794P7());
        }
        return arrayList;
    }

    /* renamed from: P7 */
    public final List<String> mo93794P7() {
        ArrayList arrayList = new ArrayList();
        if (mo93799V7()) {
            arrayList.addAll(this.f196128Z0);
        } else {
            arrayList.addAll(C79104i.m95664i(this.f196141j));
        }
        return arrayList;
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        if (i > 0 && this.f196136g1 <= 0) {
            this.f196138h1 = i;
            this.f196136g1 = i;
            mo93809f8();
        }
        if (i <= 0 && this.f196136g1 > 0) {
            this.f196136g1 = i;
            this.f196142j1.postDelayed(new C68253x(), 50);
            this.f196142j1.postDelayed(new C68254y(), 100);
        }
    }

    /* renamed from: Q7 */
    public final void mo93795Q7(ArrayList<String> arrayList) {
        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "go to contact");
        Intent intent = new Intent();
        intent.putExtra("key_from_scene", 3);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", false);
        intent.putExtra("mutil_select_is_ret", false);
        intent.putExtra("Select_block_List", C75592q0.m90789s());
        if (arrayList != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            if (sb.length() - 1 >= 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "gotoSelectContactUI %s", sb.toString());
            intent.putExtra("recent_remittance_contact_list", sb.toString());
        }
        if (this.f196137h == 2) {
            StringBuilder sb4 = new StringBuilder();
            for (String append : this.f196100G) {
                sb4.append(append);
                sb4.append(",");
            }
            if (sb4.length() - 1 >= 0) {
                sb4.deleteCharAt(sb4.length() - 1);
            }
            intent.putExtra("key_include_username_list", sb4.toString());
        } else {
            StringBuilder sb5 = new StringBuilder();
            for (String append2 : ((HashMap) this.f196109Q).keySet()) {
                sb5.append(append2);
                sb5.append(",");
            }
            if (sb5.length() - 1 >= 0) {
                sb5.deleteCharAt(sb5.length() - 1);
            }
            intent.putExtra("key_include_username_list", sb5.toString());
        }
        if (mo93791M7()) {
            intent.putExtra("key_title", this.f196146p.getText().toString());
        }
        C88144b.m109795m(getContext(), "remittance", ".ui.SelectRemittanceContactUI", intent, C0947jz.f2205e);
        mo93790I7(10);
    }

    /* renamed from: R7 */
    public final void mo93796R7() {
        this.f196121W = false;
        if (this.f196117U.getVisibility() != 8) {
            this.f196117U.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2447d_));
            this.f196117U.setVisibility(8);
        }
    }

    /* renamed from: T7 */
    public final void mo93797T7(ArrayList<String> arrayList) {
        ((HashMap) this.f196109Q).clear();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String[] split = it.next().split(",");
                double d = Util.getDouble(split[1], 0.0d);
                ((HashMap) this.f196109Q).put(split[0], Double.valueOf(d));
            }
        }
    }

    /* renamed from: U7 */
    public final void mo93798U7() {
        String string = this.f196137h == 3 ? this.f196139i == 4 ? getString(C0966R.string.g4j) : getString(C0966R.string.g4i) : getString(C0966R.string.g4h);
        C85875k4.m106189j0(this.f196094A.getPaint(), 0.8f);
        this.f196094A.setText(string);
        this.f196152u.setContentDescription(getString(C0966R.string.g4k) + this.f196094A.getText());
        this.f196152u.setClickable(true);
        this.f196152u.setOnClickListener(new C68220d());
        this.f196152u.post(new C68222e());
    }

    /* renamed from: V7 */
    public final boolean mo93799V7() {
        return this.f196124X0 == 1;
    }

    /* renamed from: W7 */
    public final void mo93800W7(Context context, String str, boolean z, ArrayList<String> arrayList) {
        List<String> list;
        String str2;
        double d;
        int i;
        C115669n nVar;
        Context context2 = context;
        mo93790I7(9);
        if (this.f196137h != 2) {
            String str3 = "MicroMsg.Aa.LaunchAAUI";
            mo93796R7();
            Dialog dialog = this.f196115T;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f196115T = C75197d0.m90163d(context2, false, false, (DialogInterface.OnCancelListener) null);
            if (!Util.isNullOrNil(this.f196112R0)) {
                if (this.f196158y0 == 2 && mo93804a8(this.f196112R0) && C86013q1.m106450k(mo93792N7())) {
                    Log.m105925i(str3, "set local imagePath :%s", mo93792N7());
                    this.f196112R0 = mo93792N7();
                }
                new C79095d(this.f196112R0, new C68234m(context, str, z, arrayList)).mo109030a();
            } else if (this.f196139i != 4) {
                mo93802Y7(context, str, "", "", z, arrayList);
            } else if (mo93799V7()) {
                mo93803Z7(context, str, "", "", z, this.f196130b1);
            } else {
                mo93803Z7(context, str, "", "", z, arrayList);
            }
        } else if (!Util.isNullOrNil(this.f196096C.getText()) && (list = this.f196100G) != null && list.size() != 0) {
            mo93796R7();
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160131h(13721, 2, 3);
            if (z) {
                if (arrayList != null) {
                    try {
                        i = arrayList.size();
                    } catch (Exception e) {
                        e = e;
                        str2 = "MicroMsg.Aa.LaunchAAUI";
                        Log.m105921e(str2, "launchAAByMoney mode: %s error: %s", Integer.valueOf(this.f196137h), e.getMessage());
                        return;
                    }
                } else {
                    i = 0;
                }
                d = Util.getDouble(this.f196149r.getText().toString(), 0.0d) * ((double) i);
            } else {
                try {
                    List<String> list2 = this.f196100G;
                    i = list2 != null ? list2.size() : 0;
                    d = Util.getDouble(this.f196096C.getText(), 0.0d);
                } catch (Exception e2) {
                    e = e2;
                    str2 = "MicroMsg.Aa.LaunchAAUI";
                    Log.m105921e(str2, "launchAAByMoney mode: %s error: %s", Integer.valueOf(this.f196137h), e.getMessage());
                    return;
                }
            }
            int i2 = i;
            double d2 = d;
            String obj = this.f196146p.getText().toString();
            if (Util.isNullOrNil(obj)) {
                obj = getString(C0966R.string.f360938g41);
            }
            String str4 = obj;
            if (i2 > 0) {
                Dialog dialog2 = this.f196115T;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                this.f196115T = C75197d0.m90163d(context2, false, false, (DialogInterface.OnCancelListener) null);
                if (!Util.isNullOrNil(this.f196112R0)) {
                    if (this.f196158y0 == 2 && mo93804a8(this.f196112R0) && C86013q1.m106450k(mo93792N7())) {
                        Log.m105925i("MicroMsg.Aa.LaunchAAUI", "set local imagePath :%s", mo93792N7());
                        this.f196112R0 = mo93792N7();
                    }
                    boolean z2 = z;
                    Context context3 = context;
                    String str5 = str;
                    C68231l lVar = r1;
                    int i3 = i2;
                    String str6 = this.f196112R0;
                    nVar = nVar2;
                    str2 = "MicroMsg.Aa.LaunchAAUI";
                    try {
                        C68231l lVar2 = new C68231l(z2, context3, str5, i3, str4, d2, arrayList);
                        C79095d dVar = new C79095d(str6, lVar);
                        dVar.mo109030a();
                    } catch (Exception e3) {
                        e = e3;
                        Log.m105921e(str2, "launchAAByMoney mode: %s error: %s", Integer.valueOf(this.f196137h), e.getMessage());
                        return;
                    }
                } else {
                    nVar = nVar2;
                    Object obj2 = "MicroMsg.Aa.LaunchAAUI";
                    if (z) {
                        mo93801X7(context, str, i2, str4, d2, arrayList, "", "");
                    } else {
                        mo93801X7(context, str, i2, str4, d2, this.f196100G, "", "");
                    }
                }
            } else {
                nVar = nVar2;
                Object obj3 = "MicroMsg.Aa.LaunchAAUI";
            }
            nVar.mo160131h(13723, 1, mo93794P7(), Integer.valueOf(i2), Double.valueOf(d2 * 100.0d), str4);
        }
    }

    /* renamed from: X7 */
    public final void mo93801X7(Context context, String str, int i, String str2, double d, List<String> list, String str3, String str4) {
        long j;
        Context context2 = context;
        String str5 = str;
        double d2 = d;
        List<String> list2 = list;
        HashMap hashMap = new HashMap();
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        hashMap.put("totalPayAmount", Double.valueOf(100.0d * d2));
        hashMap.put("chatRoomName", str5);
        hashMap.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.f196123X));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        String str6 = "" + d2;
        String str7 = "100";
        try {
            double d3 = Util.getDouble(str6, 0.0d);
            double d4 = Util.getDouble(str7, 0.0d);
            if (d3 == 0.0d) {
                str6 = "0";
            }
            BigDecimal bigDecimal = new BigDecimal(str6);
            if (d4 == 0.0d) {
                str7 = "0";
            }
            j = bigDecimal.multiply(new BigDecimal(str7)).longValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AAUtil", e, "", new Object[0]);
            j = 0;
        }
        sb.append(j);
        long longValue = C75228t.m90248h(sb.toString(), "" + i, 0, RoundingMode.CEILING).longValue();
        Log.m105919d("MicroMsg.Aa.LaunchAAUI", "perAmount: %s", Long.valueOf(longValue));
        if (longValue <= 0 || longValue > this.f196119V.mo109032b()) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "illegal avgAmount: %s", Long.valueOf(longValue));
            return;
        }
        hashMap.put("perAmount", Long.valueOf(longValue));
        hashMap.put("pic_cdn_url", str3);
        hashMap.put("pic_cdn_thumb_url", str4);
        if (!Util.isNullOrNil(this.f196112R0)) {
            hashMap.put("pic_cdn_md5", C90193h.m112876d(this.f196112R0));
        }
        if (mo93791M7()) {
            hashMap.put("pf_order_no", this.f196116T0);
        }
        hashMap.put("payerlist", list2);
        if (mo93799V7()) {
            hashMap.put("isGroupSolitatire", Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C79104i.m95666k(list2, this.f196141j, false, true));
            hashMap.put("payerlistGroupSolitatire", C79104i.m95662g(this.f196126Y0, arrayList));
        } else {
            hashMap.put("isGroupSolitatire", Boolean.FALSE);
            hashMap.put("payerlistGroupSolitatire", new ArrayList());
        }
        C67230f.C67232b bVar = this.f196135g.f193054b;
        int i2 = this.f196137h;
        bVar.getClass();
        ((C88633e) C88643g.m110548f(Integer.valueOf(i2), hashMap)).mo123061d(bVar).mo123062e(new C68240o(str5, context2)).mo123065b(new C68237n(context2));
    }

    /* renamed from: Y7 */
    public final void mo93802Y7(Context context, String str, String str2, String str3, boolean z, List<String> list) {
        Iterator it;
        Context context2 = context;
        String str4 = str;
        ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(this, 7, 5);
        C115669n.INSTANCE.mo160131h(13721, 3, 3);
        HashMap hashMap = new HashMap();
        try {
            String obj = this.f196146p.getText().toString();
            if (Util.isNullOrNil(obj)) {
                obj = getString(C0966R.string.f360938g41);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap2 = new HashMap();
            long j = 0;
            for (String str5 : ((HashMap) this.f196109Q).keySet()) {
                if (!z) {
                    List<String> list2 = list;
                } else if (!list.contains(str5)) {
                }
                double doubleValue = ((Double) ((HashMap) this.f196109Q).get(str5)).doubleValue();
                C64541m mVar = new C64541m();
                mVar.f184189e = C75228t.m90232Y(String.valueOf(doubleValue), "100");
                mVar.f184188d = str5;
                arrayList.add(mVar);
                long j2 = j + mVar.f184189e;
                arrayList2.add("" + mVar.f184189e);
                hashMap2.put(mVar.f184188d, mVar);
                j = j2;
            }
            C64541m mVar2 = new C64541m();
            mVar2.f184188d = C75592q0.m90789s();
            mVar2.f184189e = j;
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, obj);
            hashMap.put("totalPayAmount", Long.valueOf(j));
            hashMap.put("payerlist", arrayList);
            if (mo93799V7()) {
                hashMap.put("isGroupSolitatire", Boolean.TRUE);
                List<String> P7 = mo93794P7();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = ((ArrayList) P7).iterator();
                while (it4.hasNext()) {
                    String str6 = (String) it4.next();
                    if (hashMap2.containsKey(str6)) {
                        it = it4;
                        arrayList3.add((C64541m) hashMap2.get(str6));
                        arrayList4.add(str6);
                    } else {
                        it = it4;
                    }
                    it4 = it;
                }
                hashMap.put("payerlist", arrayList3);
                hashMap.put("payerlistGroupSolitatire", C79104i.m95662g(this.f196126Y0, arrayList4));
            } else {
                hashMap.put("isGroupSolitatire", Boolean.FALSE);
                hashMap.put("payerlistGroupSolitatire", new ArrayList());
            }
            hashMap.put("chatRoomName", str4);
            hashMap.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.f196123X));
            hashMap.put("pic_cdn_url", str2);
            hashMap.put("pic_cdn_thumb_url", str3);
            if (!Util.isNullOrNil(this.f196112R0)) {
                hashMap.put("pic_cdn_md5", C90193h.m112876d(this.f196112R0));
            }
            if (mo93791M7()) {
                hashMap.put("pf_order_no", this.f196116T0);
            }
            C67230f.C67234d dVar = this.f196135g.f193055c;
            dVar.getClass();
            ((C88633e) C88643g.m110547e(hashMap)).mo123061d(dVar).mo123062e(new C68244q(str4, context2)).mo123065b(new C68241p(context2));
            C115669n.INSTANCE.mo160131h(13723, 2, Integer.valueOf(((ArrayList) mo93794P7()).size()), Integer.valueOf(arrayList.size() + 1), Long.valueOf(j), obj, Util.listToString(arrayList2, ","));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Aa.LaunchAAUI", "launchAAByPerson error: %s", e.getMessage());
        }
    }

    /* renamed from: Z7 */
    public final void mo93803Z7(Context context, String str, String str2, String str3, boolean z, List<String> list) {
        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "launchAAByPersonCustomize");
        ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(this, 7, 5);
        C115669n.INSTANCE.mo160131h(13721, 8, 2);
        HashMap hashMap = new HashMap();
        try {
            String obj = this.f196146p.getText().toString();
            if (Util.isNullOrNil(obj)) {
                obj = getString(C0966R.string.f360938g41);
            }
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, obj);
            hashMap.put("chatRoomName", str);
            hashMap.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.f196123X));
            hashMap.put("pic_cdn_url", str2);
            hashMap.put("pic_cdn_thumb_url", str3);
            if (!Util.isNullOrNil(this.f196112R0)) {
                hashMap.put("pic_cdn_md5", C90193h.m112876d(this.f196112R0));
            }
            if (mo93791M7()) {
                hashMap.put("pf_order_no", this.f196116T0);
            }
            if (mo93799V7()) {
                hashMap.put("isGroupSolitatire", Boolean.TRUE);
                hashMap.put("payerlistGroupSolitatire", C79104i.m95662g(this.f196126Y0, list));
            } else {
                hashMap.put("isGroupSolitatire", Boolean.FALSE);
                hashMap.put("payerlistGroupSolitatire", new ArrayList());
            }
            C67230f.C67233c cVar = this.f196135g.f193056d;
            cVar.getClass();
            ((C88633e) C88643g.m110547e(hashMap)).mo123061d(cVar).mo123062e(new C68249t(str, context)).mo123065b(new C68246s(context));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Aa.LaunchAAUI", "launchAAByPersonCustomize error: %s", e.getMessage());
        }
    }

    /* renamed from: a8 */
    public final boolean mo93804a8(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapUtil.decodeFile(str, options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "bitmap width： %s , height： %s", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            int i = options.outWidth;
            if (i > 4) {
                int i2 = options.outHeight;
                if (i2 > 4) {
                    if (i * i2 < 5242880) {
                        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "dont handle：sizeOption.outWidth * sizeOption.outHeight * 2 < MAX_BITMAP_SIZE");
                        return false;
                    }
                    int ceil = (int) Math.ceil((double) ((i * i2) / 5242880));
                    options2.inSampleSize = ceil;
                    Log.m105925i("MicroMsg.Aa.LaunchAAUI", "need handle：bitmap too large sample:%s", Integer.valueOf(ceil));
                    Bitmap rotate = BitmapUtil.rotate(BitmapUtil.decodeFile(str, options2), (float) Exif.fromFile(str).getOrientationInDegree());
                    if (C86013q1.m106450k(mo93792N7())) {
                        C86013q1.m106447h(mo93792N7());
                    }
                    BitmapUtil.saveBitmapToImage(rotate, 80, Bitmap.CompressFormat.JPEG, mo93792N7(), true);
                    return true;
                }
            }
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "dont handle：sizeOption.outWidth <= MIN_IMAGE_SIZE || sizeOption.outHeight <= MIN_IMAGE_SIZE");
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Aa.LaunchAAUI", "decode file to bitmap error! " + e.getMessage());
        }
    }

    /* renamed from: b8 */
    public final void mo93805b8() {
        ArrayList arrayList;
        if (!Util.isNullOrNil(this.f196125Y)) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "default amount: %s", this.f196125Y);
        } else {
            this.f196096C.setText("");
        }
        this.f196096C.mo105069a(new C68226h());
        setEditFocusListener(this.f196096C, 2, false, true);
        this.f196096C.setmContentAbnormalMoneyCheck(true);
        if (mo93791M7()) {
            ArrayList arrayList2 = new ArrayList();
            for (String add : ((HashMap) this.f196109Q).keySet()) {
                arrayList2.add(add);
            }
            this.f196097D.setText(getString(C0966R.string.g3f, new Object[]{Integer.valueOf(arrayList2.size())}));
            this.f196100G = arrayList2;
        } else {
            if (!C72996z1.m85820U5(this.f196141j)) {
                Log.m105925i("MicroMsg.Aa.LaunchAAUI", "is single chat: %s", this.f196141j);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(C75592q0.m90789s());
                arrayList3.add(this.f196141j);
                arrayList = arrayList3;
            } else if (!C45628s0.m50748M(this.f196141j)) {
                arrayList = mo93794P7();
            } else {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = (ArrayList) mo93794P7();
                arrayList = arrayList4;
                if (arrayList5.size() > 0) {
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!C72996z1.m85843n5(str)) {
                            arrayList4.add(str);
                        }
                    }
                    arrayList = arrayList4;
                }
            }
            this.f196100G = arrayList;
            if (arrayList.size() > this.f196119V.mo109033c()) {
                this.f196100G.clear();
                this.f196097D.setText(getString(C0966R.string.hgx));
                mo93816n8();
            } else if (!C72996z1.m85820U5(this.f196141j)) {
                this.f196097D.setText(getString(C0966R.string.g3f, new Object[]{Integer.valueOf(arrayList.size())}));
            } else if (C45628s0.m50748M(this.f196141j)) {
                this.f196097D.setText(getString(C0966R.string.g3f, new Object[]{Integer.valueOf(arrayList.size())}));
            } else if (mo93799V7()) {
                int size = mo93793O7(false).size();
                if (size == arrayList.size()) {
                    this.f196097D.setText(getString(C0966R.string.mxb, new Object[]{Integer.valueOf(arrayList.size())}));
                } else {
                    this.f196097D.setText(getString(C0966R.string.g3f, new Object[]{Integer.valueOf(size)}));
                }
            } else {
                this.f196097D.setText(getString(C0966R.string.g3_, new Object[]{Integer.valueOf(arrayList.size())}));
            }
        }
        this.f196098E.setOnClickListener(new C68228i());
        this.f196144n = false;
    }

    /* renamed from: c8 */
    public final void mo93806c8() {
        if (mo93791M7()) {
            try {
                ArrayList<NetSceneNewAAQueryPFInfo.AALaunchItemParcel> arrayList = this.f196114S0.f195925f;
                ((HashMap) this.f196109Q).clear();
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator<NetSceneNewAAQueryPFInfo.AALaunchItemParcel> it = arrayList.iterator();
                    while (it.hasNext()) {
                        NetSceneNewAAQueryPFInfo.AALaunchItemParcel next = it.next();
                        ((HashMap) this.f196109Q).put(next.f195914d, Double.valueOf(((double) next.f195915e) / 100.0d));
                    }
                }
                mo93817o8();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.Aa.LaunchAAUI", "initPersonLaunchView error:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        } else if (mo93799V7()) {
            ((HashMap) this.f196109Q).clear();
            mo93817o8();
        }
    }

    /* renamed from: d8 */
    public final void mo93807d8(View view, View view2) {
        this.f196102I.postDelayed(new C68252w(view2, view), 100);
    }

    /* renamed from: e8 */
    public final void mo93808e8() {
        if (mo93791M7()) {
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "fromThirdParty(),user launch by person mode");
            this.f196137h = 3;
            this.f196139i = 5;
            return;
        }
        if (this.f196156x0 == 5) {
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "fromOrderDetail(),user launch by money mode");
            this.f196137h = 2;
            return;
        }
        this.f196119V.getClass();
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_AA_DEFAULT_INT, 2)).intValue();
        Log.m105925i("MicroMsg.Aa.LaunchAAUI", "defaultMode is ：%s", Integer.valueOf(intValue));
        if (intValue == 1) {
            this.f196137h = 3;
            this.f196139i = 4;
        } else if (intValue != 3) {
            this.f196137h = 2;
        } else {
            this.f196137h = 3;
            this.f196139i = 5;
        }
        Log.m105925i("MicroMsg.Aa.LaunchAAUI", "aaPayCustomizeOpen switch is ：%s", Boolean.TRUE);
        if (this.f196137h == 3 && mo93791M7()) {
            Log.m105924i("MicroMsg.Aa.LaunchAAUI", "mode == AAConstants.MODE_LAUNCH_BY_PERSON && fromThirdParty()");
            this.f196139i = 5;
        }
    }

    /* renamed from: f8 */
    public final void mo93809f8() {
        int i = C75044y4.m89990b(getContext()).y;
        int[] iArr = new int[2];
        this.f196095B.getLocationOnScreen(iArr);
        int height = i - (iArr[1] + this.f196095B.getHeight());
        int b = C76577a.m92151b(getContext(), 48);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f196142j1.getLayoutParams();
        int b2 = C76577a.m92151b(getContext(), 5) + height;
        int i2 = this.f196138h1;
        if (b2 < i2 + b) {
            int b3 = ((i2 + b) - height) + C76577a.m92151b(getContext(), 10);
            layoutParams.height = C76577a.m92151b(getContext(), 500);
            this.f196142j1.setLayoutParams(layoutParams);
            this.f196142j1.postDelayed(new C68255z(b3), 100);
            return;
        }
        mo93807d8(this.f196104K, this.f196105L);
    }

    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Aa.LaunchAAUI", "%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: g8 */
    public final void mo93810g8(boolean z) {
        this.f196113S.setEnabled(z);
        if (!z) {
            this.f196148q.setTextColor(getResources().getColor(C0966R.color.FG_1));
            this.f196149r.setTextColor(getResources().getColor(C0966R.color.f2979b_));
            this.f196150s.setTextColor(getResources().getColor(C0966R.color.f2979b_));
            return;
        }
        this.f196148q.setTextColor(getResources().getColor(C0966R.color.FG_1));
        this.f196149r.setTextColor(getResources().getColor(C0966R.color.a7f));
        this.f196150s.setTextColor(getResources().getColor(C0966R.color.a7f));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b3x;
    }

    /* renamed from: i8 */
    public final void mo93811i8(String str) {
        this.f196121W = true;
        this.f196117U.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2425cq);
        loadAnimation.setAnimationListener(new C68229j());
        this.f196117U.startAnimation(loadAnimation);
        this.f196117U.setText(str);
    }

    /* renamed from: j8 */
    public final void mo93812j8(String str) {
        Log.m105925i("MicroMsg.Aa.LaunchAAUI", "showLaunchComfirmDialog() from scene:%s", Integer.valueOf(this.f196156x0));
        String obj = this.f196146p.getText().toString();
        if (Util.isNullOrNil(obj)) {
            obj = getString(C0966R.string.f360938g41);
        }
        if (mo93799V7()) {
            obj = obj.replaceAll("\n", "");
        }
        MMActivityController controller = getController();
        ((C78541w) C86312j.m106911c(C78541w.class)).or0(controller, str, getString(C0966R.string.f7283bh) + obj, getString(C0966R.string.f7282bg), new C68230k(str));
        mo93790I7(11);
        C115669n.INSTANCE.mo160131h(13721, 8, 3);
    }

    /* renamed from: k8 */
    public final void mo93813k8() {
        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "switchMode");
        this.f196144n = false;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f196095B.getLayoutParams();
        layoutParams.addRule(3, C0966R.C0970id.fiu);
        this.f196095B.setLayoutParams(layoutParams);
        if (this.f196137h == 3) {
            if (this.f196139i == 4) {
                this.f196101H.setVisibility(8);
                this.f196108P.setVisibility(8);
                this.f196103J.setVisibility(0);
                List<String> P7 = mo93794P7();
                if (mo93799V7()) {
                    if (this.f196130b1.size() == 0) {
                        this.f196130b1 = mo93793O7(true);
                    }
                    this.f196131c1.setVisibility(0);
                    this.f196132d1.setText(getString(C0966R.string.mxa, new Object[]{Integer.valueOf(((ArrayList) P7).size()), Integer.valueOf(this.f196130b1.size())}));
                    this.f196107N.setVisibility(8);
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f196095B.getLayoutParams();
                    layoutParams2.addRule(3, C0966R.C0970id.f358504no0);
                    this.f196095B.setLayoutParams(layoutParams2);
                    this.f196131c1.setOnClickListener(new C68224f());
                } else {
                    this.f196131c1.setVisibility(8);
                    this.f196107N.setVisibility(0);
                    this.f196107N.setText(getString(C0966R.string.g3s, new Object[]{Integer.valueOf(((ArrayList) P7).size())}));
                }
            } else {
                this.f196101H.setVisibility(0);
                this.f196107N.setVisibility(8);
                this.f196108P.setVisibility(0);
                this.f196103J.setVisibility(8);
                this.f196131c1.setVisibility(8);
            }
            this.f196151t.setText(C0966R.string.g3l);
            this.f196098E.setVisibility(8);
            this.f196099F.setVisibility(8);
            this.f196148q.setText(getString(C0966R.string.g3w, new Object[]{0}));
            Map<String, Double> map = this.f196109Q;
            if (map != null && ((HashMap) map).size() > this.f196119V.mo109031a()) {
                C115669n.INSTANCE.mo160131h(13722, 8);
                this.f196144n = true;
            }
            if (this.f196144n) {
                mo93811i8(getString(C0966R.string.g3r, new Object[]{Integer.valueOf(this.f196119V.mo109031a())}));
            } else {
                mo93796R7();
            }
            mo93790I7(5);
        } else {
            this.f196137h = 2;
            this.f196098E.setVisibility(0);
            this.f196099F.setVisibility(0);
            this.f196101H.setVisibility(8);
            this.f196103J.setVisibility(8);
            this.f196107N.setVisibility(8);
            this.f196131c1.setVisibility(8);
            this.f196148q.setText(C0966R.string.g3e);
            mo93807d8(this.f196104K, this.f196105L);
            this.f196144n = false;
            if (this.f196100G.size() > this.f196119V.mo109033c()) {
                C115669n.INSTANCE.mo160131h(13722, 8);
                this.f196144n = true;
            }
            mo93814l8();
            mo93790I7(4);
        }
        hideTenpayKB();
        hideVKB();
        mo93798U7();
        mo93815m8();
        mo93816n8();
        mo93807d8(this.f196104K, this.f196105L);
    }

    /* renamed from: l8 */
    public final void mo93814l8() {
        boolean z = this.f196144n;
        if (!z || this.f196121W) {
            boolean z2 = this.f196145o;
            if (z2 && !this.f196121W) {
                mo93811i8(getString(C0966R.string.g4b, new Object[]{Float.valueOf(((float) this.f196119V.mo109032b()) / 100.0f)}));
            } else if (!z && !z2) {
                mo93796R7();
            }
        } else if (this.f196137h == 2) {
            mo93811i8(getString(C0966R.string.g3r, new Object[]{Integer.valueOf(this.f196119V.mo109033c())}));
        } else {
            mo93811i8(getString(C0966R.string.g3r, new Object[]{Integer.valueOf(this.f196119V.mo109031a())}));
        }
    }

    /* renamed from: m8 */
    public final void mo93815m8() {
        if (this.f196137h == 2) {
            List<String> list = this.f196100G;
            if (list == null || list.size() <= 0) {
                this.f196149r.setText(getString(C0966R.string.f7276b9));
            } else {
                String text = this.f196096C.getText();
                double d = C79104i.m95659d(text, "" + this.f196100G.size(), 2, 2);
                this.f196149r.setText(getString(C0966R.string.f7271b4, new Object[]{Double.valueOf(d)}));
            }
            this.f196148q.setText(C0966R.string.g3e);
            this.f196149r.setVisibility(0);
            this.f196150s.setVisibility(0);
            this.f196148q.setVisibility(0);
        } else if (this.f196139i == 4) {
            this.f196149r.setVisibility(4);
            this.f196150s.setVisibility(4);
            this.f196148q.setVisibility(4);
        } else {
            Map<String, Double> map = this.f196109Q;
            if (map == null || ((HashMap) map).size() == 0) {
                this.f196148q.setText(getString(C0966R.string.g3w, new Object[]{0}));
                this.f196149r.setText(getString(C0966R.string.f7276b9));
                this.f196149r.setVisibility(0);
                this.f196150s.setVisibility(0);
                this.f196148q.setVisibility(0);
                return;
            }
            double d2 = 0.0d;
            for (Double doubleValue : ((HashMap) this.f196109Q).values()) {
                d2 += doubleValue.doubleValue();
            }
            this.f196149r.setText(getString(C0966R.string.f7271b4, new Object[]{Double.valueOf(d2)}));
            this.f196148q.setText(getString(C0966R.string.g3w, new Object[]{Integer.valueOf(((HashMap) this.f196109Q).size())}));
            this.f196104K.setVisibility(0);
            this.f196149r.setVisibility(0);
            this.f196150s.setVisibility(0);
            this.f196148q.setVisibility(0);
        }
    }

    /* renamed from: n8 */
    public final void mo93816n8() {
        if (this.f196137h == 2) {
            if (Util.isNullOrNil(this.f196096C.getText())) {
                mo93810g8(false);
                return;
            } else if (this.f196145o) {
                mo93810g8(false);
                return;
            } else {
                List<String> list = this.f196100G;
                if (list == null || list.size() == 0) {
                    mo93810g8(false);
                    return;
                } else if (this.f196100G.size() > this.f196119V.mo109033c() || this.f196144n) {
                    mo93810g8(false);
                    return;
                } else {
                    if (mo93799V7()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(C79104i.m95666k(this.f196100G, this.f196141j, false, true));
                        if (arrayList.size() == 1 && ((String) arrayList.get(0)).equals(C75592q0.m90789s())) {
                            mo93810g8(false);
                            return;
                        }
                    }
                    String text = this.f196096C.getText();
                    double d = C79104i.m95659d(text, "" + this.f196100G.size(), 5, 4);
                    Log.m105919d("MicroMsg.Aa.LaunchAAUI", "b1: %s, b2: %s, avg: %s", this.f196096C.getText(), Integer.valueOf(this.f196100G.size()), Double.valueOf(d));
                    if (d < 0.01d) {
                        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "less than 0.01");
                        mo93810g8(false);
                        return;
                    }
                }
            }
        } else if (this.f196139i != 4) {
            Map<String, Double> map = this.f196109Q;
            if (map == null || ((HashMap) map).size() == 0) {
                mo93810g8(false);
                return;
            } else if (((HashMap) this.f196109Q).size() > this.f196119V.mo109033c() || this.f196144n) {
                mo93810g8(false);
                return;
            }
        } else if (mo93799V7()) {
            List<String> list2 = this.f196130b1;
            if (list2 == null || list2.size() == 0) {
                mo93810g8(false);
                return;
            } else if (this.f196130b1.size() > this.f196119V.mo109033c() || this.f196144n) {
                mo93810g8(false);
                return;
            } else {
                mo93810g8(true);
                return;
            }
        } else {
            mo93810g8(true);
            return;
        }
        mo93810g8(true);
    }

    public boolean needExecuteBackListener() {
        return false;
    }

    /* renamed from: o8 */
    public final void mo93817o8() {
        Map<String, Double> map = this.f196109Q;
        if (map == null || ((HashMap) map).size() <= 0) {
            this.f196106M.setText(C0966R.string.g3x);
            this.f196106M.setTextColor(getResources().getColor(C0966R.color.f2978b9));
            int dimension = (int) getResources().getDimension(C0966R.dimen.f3989mk);
            this.f196108P.setPadding(dimension, dimension, dimension, dimension);
            this.f196108P.setBackgroundResource(C0966R.C0969drawable.ab6);
            this.f196102I.setVisibility(8);
        } else {
            this.f196106M.setText(getString(C0966R.string.g3y, new Object[]{Integer.valueOf(((HashMap) this.f196109Q).size())}));
            this.f196106M.setTextColor(getResources().getColor(C0966R.color.a7f));
            int dimension2 = (int) getResources().getDimension(C0966R.dimen.f3989mk);
            getResources().getDimension(C0966R.dimen.f3986mh);
            getResources().getDimension(C0966R.dimen.f3987mi);
            this.f196108P.setPadding(dimension2, dimension2, dimension2, dimension2);
            this.f196108P.setBackgroundResource(C0966R.C0969drawable.f357235ab3);
            this.f196102I.setVisibility(0);
        }
        this.f196102I.removeAllViews();
        ((HashMap) this.f196111R).clear();
        Map<String, Double> map2 = this.f196109Q;
        if (map2 != null && ((HashMap) map2).size() > 0) {
            if (mo93799V7()) {
                Iterator it = ((ArrayList) mo93794P7()).iterator();
                int i = 0;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((HashMap) this.f196109Q).containsKey(str)) {
                        double doubleValue = ((Double) ((HashMap) this.f196109Q).get(str)).doubleValue();
                        LaunchAAByPersonNameAmountRow launchAAByPersonNameAmountRow = new LaunchAAByPersonNameAmountRow(this);
                        if (i >= ((HashMap) this.f196109Q).size() - 1) {
                            launchAAByPersonNameAmountRow.setDividerVisible(false);
                        }
                        launchAAByPersonNameAmountRow.mo1268b(str, this.f196141j, doubleValue);
                        this.f196102I.addView(launchAAByPersonNameAmountRow);
                        ((HashMap) this.f196111R).put(str, launchAAByPersonNameAmountRow);
                        i++;
                    }
                }
            } else {
                int i2 = 0;
                for (String str2 : ((HashMap) this.f196109Q).keySet()) {
                    double doubleValue2 = ((Double) ((HashMap) this.f196109Q).get(str2)).doubleValue();
                    LaunchAAByPersonNameAmountRow launchAAByPersonNameAmountRow2 = new LaunchAAByPersonNameAmountRow(this);
                    if (i2 >= ((HashMap) this.f196109Q).size() - 1) {
                        launchAAByPersonNameAmountRow2.setDividerVisible(false);
                    }
                    launchAAByPersonNameAmountRow2.mo1268b(str2, this.f196141j, doubleValue2);
                    this.f196102I.addView(launchAAByPersonNameAmountRow2);
                    ((HashMap) this.f196111R).put(str2, launchAAByPersonNameAmountRow2);
                    i2++;
                }
            }
        }
        View view = this.f196015d;
        if (view != null) {
            view.requestLayout();
            mo93807d8(this.f196104K, this.f196105L);
        }
        mo93815m8();
        mo93816n8();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.Aa.LaunchAAUI", "onActivityResult requestCode:%s", Integer.valueOf(i));
        if (i3 == 233) {
            if (i4 == -1) {
                String stringExtra = intent2.getStringExtra("Select_Contact");
                if (this.f196137h == 2) {
                    if (!Util.isNullOrNil(stringExtra)) {
                        String[] split = stringExtra.split(",");
                        this.f196100G.clear();
                        this.f196100G.addAll(Arrays.asList(split));
                    }
                    List<String> P7 = mo93794P7();
                    List<String> list = this.f196100G;
                    if (list == null || list.size() != ((ArrayList) P7).size() || !C72996z1.m85820U5(this.f196141j)) {
                        TextView textView = this.f196097D;
                        Object[] objArr = new Object[1];
                        List<String> list2 = this.f196100G;
                        objArr[0] = Integer.valueOf(list2 != null ? list2.size() : 0);
                        textView.setText(getString(C0966R.string.g3f, objArr));
                    } else if (mo93799V7()) {
                        TextView textView2 = this.f196097D;
                        Object[] objArr2 = new Object[1];
                        List<String> list3 = this.f196100G;
                        objArr2[0] = Integer.valueOf(list3 != null ? list3.size() : 0);
                        textView2.setText(getString(C0966R.string.mxb, objArr2));
                    } else {
                        TextView textView3 = this.f196097D;
                        Object[] objArr3 = new Object[1];
                        List<String> list4 = this.f196100G;
                        objArr3[0] = Integer.valueOf(list4 != null ? list4.size() : 0);
                        textView3.setText(getString(C0966R.string.g3_, objArr3));
                    }
                }
                mo93796R7();
                List<String> list5 = this.f196100G;
                if (list5 == null || list5.size() <= this.f196119V.mo109033c()) {
                    this.f196144n = false;
                } else {
                    this.f196144n = true;
                }
                double d = Util.getDouble(this.f196096C.getText(), 0.0d);
                List<String> list6 = this.f196100G;
                if (list6 == null || (d * 100.0d) / ((double) list6.size()) <= ((double) this.f196119V.mo109032b())) {
                    this.f196145o = false;
                } else {
                    this.f196145o = true;
                    C115669n.INSTANCE.mo160131h(13722, 2);
                }
                mo93816n8();
                mo93815m8();
                mo93814l8();
            }
        } else if (i3 == 330) {
            if (i4 == -1 && mo93799V7() && this.f196137h == 3 && this.f196139i == 4) {
                String stringExtra2 = intent2.getStringExtra("Select_Contact");
                if (!Util.isNullOrNil(stringExtra2)) {
                    String[] split2 = stringExtra2.split(",");
                    ((ArrayList) this.f196130b1).clear();
                    ((ArrayList) this.f196130b1).addAll(Arrays.asList(split2));
                }
                List<String> P72 = mo93794P7();
                List<String> list7 = this.f196130b1;
                if (list7 == null || ((ArrayList) list7).size() != ((ArrayList) P72).size() || !C72996z1.m85820U5(this.f196141j)) {
                    TextView textView4 = this.f196132d1;
                    Object[] objArr4 = new Object[1];
                    List<String> list8 = this.f196130b1;
                    objArr4[0] = Integer.valueOf(list8 != null ? ((ArrayList) list8).size() : 0);
                    textView4.setText(getString(C0966R.string.g3f, objArr4));
                } else {
                    TextView textView5 = this.f196132d1;
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = Integer.valueOf(((ArrayList) mo93794P7()).size());
                    List<String> list9 = this.f196130b1;
                    objArr5[1] = Integer.valueOf(list9 != null ? ((ArrayList) list9).size() : 0);
                    textView5.setText(getString(C0966R.string.mxa, objArr5));
                }
                mo93796R7();
                List<String> list10 = this.f196130b1;
                if (list10 == null || ((ArrayList) list10).size() <= this.f196119V.mo109033c()) {
                    this.f196144n = false;
                } else {
                    this.f196144n = true;
                }
                double d2 = Util.getDouble(this.f196096C.getText(), 0.0d);
                List<String> list11 = this.f196130b1;
                if (list11 == null || (d2 * 100.0d) / ((double) ((ArrayList) list11).size()) <= ((double) this.f196119V.mo109032b())) {
                    this.f196145o = false;
                } else {
                    this.f196145o = true;
                    C115669n.INSTANCE.mo160131h(13722, 2);
                }
                mo93816n8();
                mo93815m8();
                mo93814l8();
            }
        } else if (i3 == 236) {
            if (i4 == -1) {
                try {
                    mo93797T7(intent2.getStringArrayListExtra("selectUI"));
                    mo93817o8();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.Aa.LaunchAAUI", "onActivityResult, SELECT_AMOUNT_SELECT_REQUEST_CODE error: %s", e.getMessage());
                }
            }
        } else if (i3 == 300) {
            if (i4 == -1 && intent2 != null) {
                ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_image_list");
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    String b = C7013o.m7260b(this, intent2, C7970a.m8127a());
                    if (!Util.isNullOrNil(b)) {
                        this.f196112R0 = b;
                    }
                } else {
                    this.f196112R0 = stringArrayListExtra.get(0);
                }
                if (!Util.isNullOrNil(this.f196112R0)) {
                    this.f196158y0 = 2;
                    this.f196159z.setVisibility(0);
                    this.f196155x.setVisibility(8);
                    this.f196157y.setVisibility(8);
                    MMBitmapFactory.m98734c(this.f196112R0);
                    this.f196159z.post(new C68250u());
                    mo93790I7(8);
                }
                Log.m105925i("MicroMsg.Aa.LaunchAAUI", "SELECT_IMAGE_REQUEST_CODE imagePath:%s", this.f196112R0);
            }
            if (this.f196159z.getVisibility() == 0) {
                this.f196154w.setClickable(false);
            } else {
                this.f196154w.setClickable(true);
            }
        } else if (i3 == 310) {
            if (i4 == -1) {
                this.f196158y0 = 2;
                this.f196112R0 = "";
                this.f196159z.setVisibility(8);
                this.f196155x.setVisibility(0);
                this.f196157y.setVisibility(0);
                mo93790I7(7);
            }
            if (this.f196159z.getVisibility() == 0) {
                this.f196154w.setClickable(false);
            } else {
                this.f196154w.setClickable(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0552  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            java.lang.String r13 = "MicroMsg.Aa.LaunchAAUI"
            java.lang.String r0 = "LaunchAAUI onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$g r0 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$g
            r0.<init>()
            r12.setBackBtn(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r12.f196123X = r0
            r0 = 2131831924(0x7f112c74, float:1.9296887E38)
            r12.setMMTitle((int) r0)
            android.content.Intent r0 = r12.getIntent()
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "enter_scene"
            int r0 = r0.getIntExtra(r3, r1)
            r12.f196156x0 = r0
            boolean r0 = r12.mo93791M7()
            if (r0 == 0) goto L_0x0071
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "pfInfo"
            android.os.Parcelable r0 = r0.getParcelableExtra(r3)
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r0 = (com.tencent.p014mm.plugin.p019aa.model.cgi.NetSceneNewAAQueryPFInfo.PfInfoParcel) r0
            r12.f196114S0 = r0
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "pfOrderNo"
            java.lang.String r0 = r0.getStringExtra(r3)
            r12.f196116T0 = r0
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r0 = r12.f196114S0
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "pfInfoParcel is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r12.finish()
            return
        L_0x005f:
            r3 = 3
            r12.f196137h = r3
            r3 = 5
            r12.f196139i = r3
            long r3 = r0.f195923d
            r12.f196127Z = r3
            java.lang.String r0 = r0.f195927h
            r12.f196147p0 = r0
            r12.mo93790I7(r1)
            goto L_0x008d
        L_0x0071:
            r12.mo93808e8()
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "amount"
            java.lang.String r0 = r0.getStringExtra(r3)
            r12.f196125Y = r0
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "title"
            java.lang.String r0 = r0.getStringExtra(r3)
            r12.f196147p0 = r0
        L_0x008d:
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "chatroom_name"
            java.lang.String r0 = r0.getStringExtra(r3)
            r12.f196141j = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "chatroomName is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r12.f196141j = r3
        L_0x00a8:
            java.lang.String r0 = r12.f196141j
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r5 = 0
            if (r4 == 0) goto L_0x00b2
            goto L_0x00d9
        L_0x00b2:
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r4 == 0) goto L_0x00b9
            goto L_0x00da
        L_0x00b9:
            java.lang.String r4 = ","
            java.lang.String[] r0 = r0.split(r4)
            java.util.ArrayList r0 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r0)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r0.remove(r4)
            int r4 = r0.size()
            if (r4 <= 0) goto L_0x00d9
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00da
        L_0x00d9:
            r0 = r3
        L_0x00da:
            r12.f196141j = r0
            r0 = 2131312635(0x7f093ffb, float:1.8243644E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.f196015d = r0
            r0 = 2131307010(0x7f092a02, float:1.8232235E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196094A = r0
            r0 = 2131307009(0x7f092a01, float:1.8232233E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r12.f196152u = r0
            r0 = 2131307011(0x7f092a03, float:1.8232237E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 2131306990(0x7f0929ee, float:1.8232195E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r12.f196113S = r0
            r0 = 2131306986(0x7f0929ea, float:1.8232187E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196117U = r0
            r0 = 2131316881(0x7f095091, float:1.8252256E38)
            android.view.View r0 = r12.findViewById(r0)
            com.tencent.mm.wallet_core.ui.WcPayBannerView r0 = (com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView) r0
            r12.f196143k1 = r0
            r0 = 2131307013(0x7f092a05, float:1.8232241E38)
            android.view.View r0 = r12.findViewById(r0)
            com.tencent.mm.ui.widget.MMEditText r0 = (com.tencent.p014mm.p136ui.widget.MMEditText) r0
            r12.f196146p = r0
            r0 = 2131307018(0x7f092a0a, float:1.8232251E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196148q = r0
            r0 = 2131306987(0x7f0929eb, float:1.8232189E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196149r = r0
            r0 = 2131306989(0x7f0929ed, float:1.8232193E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196150s = r0
            r0 = 2131310954(0x7f09396a, float:1.8240235E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r12.f196153v = r0
            r0 = 2131310964(0x7f093974, float:1.8240255E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r12.f196154w = r0
            r0 = 2131311060(0x7f0939d4, float:1.824045E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f196155x = r0
            r0 = 2131311061(0x7f0939d5, float:1.8240452E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196157y = r0
            r0 = 2131300397(0x7f09102d, float:1.8218822E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f196159z = r0
            r0 = 2131307025(0x7f092a11, float:1.8232266E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196151t = r0
            r0 = 2131307017(0x7f092a09, float:1.823225E38)
            android.view.View r0 = r12.findViewById(r0)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = (com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView) r0
            r12.f196096C = r0
            r0 = 2131306993(0x7f0929f1, float:1.82322E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196097D = r0
            r0 = 2131306994(0x7f0929f2, float:1.8232203E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131307024(0x7f092a10, float:1.8232264E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196098E = r0
            r0 = 2131307023(0x7f092a0f, float:1.8232262E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196099F = r0
            r0 = 2131306999(0x7f0929f7, float:1.8232213E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196106M = r0
            r4 = 2131831886(0x7f112c4e, float:1.929681E38)
            r0.setText(r4)
            android.widget.TextView r0 = r12.f196106M
            android.content.res.Resources r4 = r12.getResources()
            r6 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r4 = r4.getColor(r6)
            r0.setTextColor(r4)
            r0 = 2131307029(0x7f092a15, float:1.8232274E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196101H = r0
            r0 = 2131307030(0x7f092a16, float:1.8232276E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196102I = r0
            r0 = 2131306997(0x7f0929f5, float:1.8232209E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196108P = r0
            r0 = 2131307027(0x7f092a13, float:1.823227E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196103J = r0
            r0 = 2131307019(0x7f092a0b, float:1.8232253E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196104K = r0
            r0 = 2131315516(0x7f094b3c, float:1.8249487E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196105L = r0
            r0 = 2131307028(0x7f092a14, float:1.8232272E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196107N = r0
            r0 = 2131307022(0x7f092a0e, float:1.823226E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196131c1 = r0
            r0 = 2131306991(0x7f0929ef, float:1.8232197E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f196132d1 = r0
            r0 = 2131307014(0x7f092a06, float:1.8232243E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.f196095B = r0
            r0 = 2131312643(0x7f094003, float:1.824366E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r12.f196140i1 = r0
            r0 = 2131312841(0x7f0940c9, float:1.8244062E38)
            android.view.View r0 = r12.findViewById(r0)
            r12.f196142j1 = r0
            androidx.appcompat.app.AppCompatActivity r0 = r12.getContext()
            com.tencent.xweb.util.AccessibilityHelper r0 = com.tencent.xweb.util.AccessibilityHelper.getInstance(r0)
            boolean r0 = r0.isAccessibilityEnable()
            if (r0 != 0) goto L_0x0284
            android.view.View r0 = r12.f196015d
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$r r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$r
            r4.<init>()
            r0.setOnTouchListener(r4)
            goto L_0x028e
        L_0x0284:
            android.view.View r0 = r12.f196015d
            r0.setFocusable(r5)
            android.view.View r0 = r12.f196015d
            r0.setFocusableInTouchMode(r5)
        L_0x028e:
            android.widget.LinearLayout r0 = r12.f196154w
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$v r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$v
            r4.<init>()
            r0.setAccessibilityDelegate(r4)
            r0 = 2131306988(0x7f0929ec, float:1.823219E38)
            android.view.View r0 = r12.findViewById(r0)
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$a0 r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$a0
            r4.<init>()
            r0.setAccessibilityDelegate(r4)
            android.view.ViewGroup r0 = r12.f196099F
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$b0 r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$b0
            r4.<init>()
            r0.setOnClickListener(r4)
            r0 = 2131307015(0x7f092a07, float:1.8232245E38)
            android.view.View r0 = r12.findViewById(r0)
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$c0 r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$c0
            r4.<init>()
            r0.setOnClickListener(r4)
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
            bl3.r$a r0 = r0.mo62444c(r4)
            java.lang.Class<yf0.a> r4 = yf0.C79090a.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            yf0.a r0 = (yf0.C79090a) r0
            java.lang.String r4 = "LAUNCH_AA_TOTAL_MONEY_EDIT_FORM_VALUE_KEY"
            java.lang.String r6 = "0"
            r0.setValue(r4, r6)
            android.widget.TextView r0 = r12.f196150s
            r4 = 1111490560(0x42400000, float:48.0)
            r0.setTextSize(r4)
            android.widget.TextView r0 = r12.f196149r
            r0.setTextSize(r4)
            r12.mo93813k8()
            r12.mo93798U7()
            r12.mo93806c8()
            android.widget.Button r0 = r12.f196113S
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$d0 r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$d0
            r4.<init>()
            r0.setOnClickListener(r4)
            com.tencent.mm.ui.widget.MMEditText r0 = r12.f196146p
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$e0 r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$e0
            r4.<init>()
            r0.addTextChangedListener(r4)
            com.tencent.mm.ui.widget.MMEditText r0 = r12.f196146p
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$a r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$a
            r4.<init>()
            r0.setOnTouchListener(r4)
            com.tencent.mm.ui.widget.MMEditText r0 = r12.f196146p
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$b r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$b
            r4.<init>()
            r0.setOnFocusChangeListener(r4)
            r12.mo93805b8()
            android.view.ViewGroup r0 = r12.f196108P
            com.tencent.mm.plugin.aa.ui.LaunchAAUI$c r4 = new com.tencent.mm.plugin.aa.ui.LaunchAAUI$c
            r4.<init>()
            r0.setOnClickListener(r4)
            java.lang.String r0 = r12.f196147p0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0353
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r4 = r12.f196147p0
            r0[r5] = r4
            java.lang.String r4 = "default title: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r0)
            com.tencent.mm.ui.widget.MMEditText r0 = r12.f196146p
            java.lang.String r4 = r12.f196147p0
            r0.setText(r4)
            java.lang.String r0 = r12.f196147p0
            int r0 = r0.length()
            r4 = 20
            if (r0 <= r4) goto L_0x0348
            goto L_0x034e
        L_0x0348:
            java.lang.String r0 = r12.f196147p0
            int r4 = r0.length()
        L_0x034e:
            com.tencent.mm.ui.widget.MMEditText r0 = r12.f196146p
            r0.setSelection(r4)
        L_0x0353:
            boolean r0 = r12.mo93791M7()
            r4 = 2
            if (r0 == 0) goto L_0x037d
            java.lang.Object[] r13 = new java.lang.Object[r1]
            long r6 = r12.f196127Z
            double r6 = (double) r6
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r8
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            r13[r5] = r0
            java.lang.String r0 = "%.2f"
            java.lang.String r13 = java.lang.String.format(r0, r13)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r12.f196096C
            r0.setText(r13)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r12.f196096C
            int r13 = r13.length()
            r0.setSelection(r13)
            goto L_0x03c6
        L_0x037d:
            java.lang.String r0 = r12.f196125Y
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x03c6
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r6 = r12.f196125Y
            r0[r5] = r6
            java.lang.String r6 = "default amount: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r6, r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r6 = r12.f196125Y
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            java.lang.String r7 = "100"
            double r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90250i(r0, r7, r4, r6)
            r13.append(r6)
            java.lang.String r13 = r13.toString()
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r12.f196096C
            r0.setText(r13)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r12.f196096C
            int r13 = r13.length()
            r0.setSelection(r13)
        L_0x03c6:
            r12.mo93816n8()
            boolean r13 = r12.mo93791M7()
            r0 = 2131306156(0x7f0926ac, float:1.8230503E38)
            r6 = 0
            r7 = 2131492896(0x7f0c0020, float:1.8609257E38)
            java.lang.String r8 = "aa_pay"
            if (r13 == 0) goto L_0x040e
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r8)
            java.lang.String r9 = "new_user_guide_show"
            boolean r13 = r13.getBoolean(r9, r1)
            if (r13 == 0) goto L_0x040e
            qo3.n r13 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r9 = r12.getContext()
            r13.<init>((android.content.Context) r9, (int) r1, (boolean) r5)
            android.view.LayoutInflater r9 = r12.getLayoutInflater()
            android.view.View r9 = r9.inflate(r7, r6)
            android.view.View r10 = r9.findViewById(r0)
            com.tencent.mm.plugin.aa.ui.i0 r11 = new com.tencent.mm.plugin.aa.ui.i0
            r11.<init>(r12, r13)
            r10.setOnClickListener(r11)
            com.tencent.mm.plugin.aa.ui.j0 r10 = new com.tencent.mm.plugin.aa.ui.j0
            r10.<init>(r12, r13, r9)
            r13.f225771i = r10
            r13.mo107559d(r1)
            r13.mo107573q()
        L_0x040e:
            java.lang.String r13 = r12.f196141j
            boolean r13 = eb0.C45628s0.m50748M(r13)
            if (r13 == 0) goto L_0x0472
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r8)
            java.lang.String r8 = "new_open_IM_user_guide_show"
            boolean r13 = r13.getBoolean(r8, r1)
            if (r13 == 0) goto L_0x0472
            qo3.n r13 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r8 = r12.getContext()
            r13.<init>((android.content.Context) r8, (int) r1, (boolean) r5)
            android.view.LayoutInflater r8 = r12.getLayoutInflater()
            android.view.View r6 = r8.inflate(r7, r6)
            r7 = 2131296303(0x7f09002f, float:1.8210519E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131831910(0x7f112c66, float:1.9296859E38)
            java.lang.String r8 = r12.getString(r8)
            r7.setText(r8)
            r7 = 2131296302(0x7f09002e, float:1.8210517E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131831909(0x7f112c65, float:1.9296857E38)
            java.lang.String r8 = r12.getString(r8)
            r7.setText(r8)
            android.view.View r0 = r6.findViewById(r0)
            com.tencent.mm.plugin.aa.ui.k0 r7 = new com.tencent.mm.plugin.aa.ui.k0
            r7.<init>(r12, r13)
            r0.setOnClickListener(r7)
            com.tencent.mm.plugin.aa.ui.l0 r0 = new com.tencent.mm.plugin.aa.ui.l0
            r0.<init>(r12, r13, r6)
            r13.f225771i = r0
            r13.mo107559d(r1)
            r13.mo107573q()
        L_0x0472:
            boolean r13 = r12.mo93791M7()
            r0 = 8
            if (r13 == 0) goto L_0x04e1
            android.widget.RelativeLayout r13 = r12.f196153v
            r13.setVisibility(r5)
            android.widget.RelativeLayout r13 = r12.f196153v
            com.tencent.mm.plugin.aa.ui.m0 r6 = new com.tencent.mm.plugin.aa.ui.m0
            r6.<init>(r12)
            r13.setOnClickListener(r6)
            android.widget.ImageView r13 = r12.f196159z
            com.tencent.mm.plugin.aa.ui.n0 r6 = new com.tencent.mm.plugin.aa.ui.n0
            r6.<init>(r12)
            r13.setOnClickListener(r6)
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r13 = r12.f196114S0
            if (r13 == 0) goto L_0x04cd
            java.lang.String r13 = r13.f195926g
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x04cd
            r12.f196158y0 = r1
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r13 = r12.f196114S0
            java.lang.String r13 = r13.f195926g
            r12.f196110Q0 = r13
            android.widget.ImageView r13 = r12.f196159z
            r13.setVisibility(r5)
            android.widget.ImageView r13 = r12.f196155x
            r13.setVisibility(r0)
            android.widget.TextView r13 = r12.f196157y
            r13.setVisibility(r0)
            java.lang.Class<gt.w> r13 = p158gt.C76057w.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            gt.w r13 = (p158gt.C76057w) r13
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r0 = r12.f196114S0
            java.lang.String r3 = r0.f195926g
            java.lang.String r0 = r0.f195929j
            com.tencent.mm.plugin.aa.ui.o0 r6 = new com.tencent.mm.plugin.aa.ui.o0
            r6.<init>(r12)
            r13.mo106265Hm(r3, r0, r6)
            goto L_0x0509
        L_0x04cd:
            r12.f196158y0 = r4
            r12.f196112R0 = r3
            android.widget.ImageView r13 = r12.f196159z
            r13.setVisibility(r0)
            android.widget.ImageView r13 = r12.f196155x
            r13.setVisibility(r5)
            android.widget.TextView r13 = r12.f196157y
            r13.setVisibility(r5)
            goto L_0x0509
        L_0x04e1:
            android.widget.RelativeLayout r13 = r12.f196153v
            r13.setVisibility(r5)
            android.widget.ImageView r13 = r12.f196159z
            r13.setVisibility(r0)
            android.widget.ImageView r13 = r12.f196155x
            r13.setVisibility(r5)
            android.widget.TextView r13 = r12.f196157y
            r13.setVisibility(r5)
            android.widget.LinearLayout r13 = r12.f196154w
            com.tencent.mm.plugin.aa.ui.p0 r0 = new com.tencent.mm.plugin.aa.ui.p0
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            android.widget.ImageView r13 = r12.f196159z
            com.tencent.mm.plugin.aa.ui.q0 r0 = new com.tencent.mm.plugin.aa.ui.q0
            r0.<init>(r12)
            r13.setOnClickListener(r0)
        L_0x0509:
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 13721(0x3599, float:1.9227E-41)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r2
            r3[r1] = r2
            r13.mo160131h(r0, r3)
            boolean r13 = r12.mo93791M7()
            if (r13 == 0) goto L_0x0523
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LaunchAAEvent> r13 = r12.f196133e1
            if (r13 == 0) goto L_0x0523
            r13.alive()
        L_0x0523:
            com.tencent.mm.ui.tools.KeyboardHeightProvider r13 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            androidx.appcompat.app.AppCompatActivity r0 = r12.getContext()
            r13.<init>(r0)
            r12.f196134f1 = r13
            r13.f220015b = r12
            boolean r13 = r12.mo93791M7()
            if (r13 == 0) goto L_0x0552
            yf0.e r13 = new yf0.e
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel r0 = r12.f196114S0
            com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel r1 = r0.f195930n
            java.lang.String r2 = r1.f195922j
            java.lang.String r1 = r1.f195921i
            r13.<init>(r2, r1)
            r12.f196119V = r13
            te3.g43 r13 = r0.f195931o
            com.tencent.mm.wallet_core.ui.WcPayBannerView r0 = r12.f196143k1
            r0.mo105020a()
            com.tencent.mm.wallet_core.ui.WcPayBannerView r0 = r12.f196143k1
            r0.setBannerData(r13)
            goto L_0x0574
        L_0x0552:
            bg0.f r13 = r12.f196135g
            bg0.f$a r13 = r13.f193057e
            r13.getClass()
            lp3.c r0 = lp3.C88643g.m110546d()
            lp3.e r0 = (lp3.C88633e) r0
            lp3.c r13 = r0.mo123061d(r13)
            com.tencent.mm.plugin.aa.ui.s0 r0 = new com.tencent.mm.plugin.aa.ui.s0
            r0.<init>(r12)
            lp3.c r13 = r13.mo123062e(r0)
            com.tencent.mm.plugin.aa.ui.r0 r0 = new com.tencent.mm.plugin.aa.ui.r0
            r0.<init>(r12)
            r13.mo123065b(r0)
        L_0x0574:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        IListener<LaunchAAEvent> iListener;
        super.onDestroy();
        if (mo93791M7() && (iListener = this.f196133e1) != null) {
            iListener.dead();
        }
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f196134f1;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        super.onResume();
        KeyboardHeightProvider keyboardHeightProvider = this.f196134f1;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void onStop() {
        super.onStop();
        Map<String, LaunchAAByPersonNameAmountRow> map = this.f196111R;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f196134f1;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }
}
