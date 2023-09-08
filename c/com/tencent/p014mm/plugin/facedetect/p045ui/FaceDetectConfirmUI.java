package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import au1.C0222b;
import bu1.C0382b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.facedetect.model.C2271r;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.p014mm.plugin.flash.FaceFlashUI;
import com.tencent.p014mm.plugin.flash.view.FaceFlashReflectMask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import eb1.C7630m;
import f40.C86709a0;
import gc0.C20828a;
import ib1.C8872b;
import ib1.C8873c;
import ib1.C8874d;
import ib1.C8875e;
import ib1.C8876f;
import ib1.a$$a;
import ib1.a$$b;
import ib1.a$$c;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p447aw.C103918d;
import qo3.C89779i0;
import te3.C49996ji3;
import vo3.C90852c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI */
public class FaceDetectConfirmUI extends MMActivity implements C11385n {

    /* renamed from: N */
    public static final /* synthetic */ int f12354N = 0;

    /* renamed from: A */
    public String f12355A;

    /* renamed from: B */
    public String f12356B;

    /* renamed from: C */
    public String f12357C = "";

    /* renamed from: D */
    public float f12358D = 0.0f;

    /* renamed from: E */
    public long f12359E = 0;

    /* renamed from: F */
    public ViewGroup f12360F;

    /* renamed from: G */
    public C49996ji3 f12361G;

    /* renamed from: H */
    public String f12362H;

    /* renamed from: I */
    public TextView f12363I;

    /* renamed from: J */
    public ViewGroup f12364J;

    /* renamed from: K */
    public CheckBox f12365K;

    /* renamed from: L */
    public TextView f12366L;

    /* renamed from: M */
    public boolean f12367M = false;

    /* renamed from: d */
    public TextView f12368d;

    /* renamed from: e */
    public Button f12369e;

    /* renamed from: f */
    public CheckBox f12370f;

    /* renamed from: g */
    public TextView f12371g;

    /* renamed from: h */
    public C89779i0 f12372h;

    /* renamed from: i */
    public TextView f12373i;

    /* renamed from: j */
    public C49996ji3 f12374j = null;

    /* renamed from: n */
    public String f12375n = null;

    /* renamed from: o */
    public String f12376o = null;

    /* renamed from: p */
    public String f12377p = null;

    /* renamed from: q */
    public float f12378q;

    /* renamed from: r */
    public String f12379r;

    /* renamed from: s */
    public String f12380s;

    /* renamed from: t */
    public String f12381t;

    /* renamed from: u */
    public int f12382u;

    /* renamed from: v */
    public int f12383v;

    /* renamed from: w */
    public int f12384w;

    /* renamed from: x */
    public String f12385x;

    /* renamed from: y */
    public ImageView f12386y;

    /* renamed from: z */
    public TextView f12387z;

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$a */
    public class C2275a implements DialogInterface.OnClickListener {
        public C2275a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FaceDetectConfirmUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$b */
    public class C2276b implements DialogInterface.OnClickListener {
        public C2276b(FaceDetectConfirmUI faceDetectConfirmUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$c */
    public class C2277c implements DialogInterface.OnClickListener {
        public C2277c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FaceDetectConfirmUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$d */
    public class C2278d implements DialogInterface.OnClickListener {
        public C2278d(FaceDetectConfirmUI faceDetectConfirmUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$e */
    public class C2279e implements MenuItem.OnMenuItemClickListener {
        public C2279e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.FaceDetectConfirmUI", "alvinluo cancel with back button");
            FaceDetectConfirmUI faceDetectConfirmUI = FaceDetectConfirmUI.this;
            int i = FaceDetectConfirmUI.f12354N;
            faceDetectConfirmUI.mo2164J7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$f */
    public class C2280f implements View.OnClickListener {
        public C2280f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = FaceDetectConfirmUI.this.f12370f;
            checkBox.setChecked(!checkBox.isChecked());
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$g */
    public class C2281g implements View.OnClickListener {
        public C2281g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = FaceDetectConfirmUI.this.f12370f;
            checkBox.setChecked(!checkBox.isChecked());
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI$h */
    public class C2282h implements View.OnClickListener {
        public C2282h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.FaceDetectConfirmUI", "check_alive_type is %s", Integer.valueOf(FaceDetectConfirmUI.this.f12384w));
            if (!C85191v.m105062a(FaceDetectConfirmUI.this)) {
                Log.m105920e("MicroMsg.FaceDetectConfirmUI", "no camera permission. request permission");
                C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            FaceDetectConfirmUI faceDetectConfirmUI = FaceDetectConfirmUI.this;
            int i = faceDetectConfirmUI.f12384w;
            if (i == 0 || i == 2) {
                boolean fa02 = ((C103918d) C86312j.m106911c(C103918d.class)).fa0(faceDetectConfirmUI, "android.permission.RECORD_AUDIO", 80, "", "", faceDetectConfirmUI.getString(C0966R.string.f8059n));
                Log.m105925i("MicroMsg.FaceUtils", "summerper checkPermission checkAudio[%b], stack[%s], activity[%s]", Boolean.valueOf(fa02), Util.getStack(), faceDetectConfirmUI);
                if (!fa02) {
                    Log.m105920e("MicroMsg.FaceDetectConfirmUI", "no audio permission. request permission");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            Bundle extras = FaceDetectConfirmUI.this.getIntent().getExtras();
            if (extras != null) {
                extras.putInt("check_alive_type", FaceDetectConfirmUI.this.f12384w);
                extras.putString("appId", FaceDetectConfirmUI.this.f12379r);
                extras.putString("feedbackUrl", FaceDetectConfirmUI.this.f12376o);
                extras.putString("business_tips", FaceDetectConfirmUI.this.f12385x);
                extras.putFloat("mLight_threshold", FaceDetectConfirmUI.this.f12378q);
                extras.putLong("confirm_page_timestamp", FaceDetectConfirmUI.this.f12359E);
                float f = FaceDetectConfirmUI.this.f12358D;
                if (((double) f) >= 0.2d && ((double) f) <= 0.9d) {
                    FaceFlashReflectMask.f19057q = f / 2.0f;
                }
                Log.m105924i("MicroMsg.FaceDetectConfirmUI", "carson check_alive_type_response is " + FaceDetectConfirmUI.this.f12384w);
                FaceFlashUI.m4535L7(FaceDetectConfirmUI.this, extras, 1);
            } else {
                Log.m105920e("MicroMsg.FaceDetectConfirmUI", "alvinluo extras is null when start FaceDetectPrepareUI");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m2062H7(FaceDetectConfirmUI faceDetectConfirmUI, String str) {
        faceDetectConfirmUI.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FaceDetectConfirmUI", "alvinluo jumpToWebView url is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        C88144b.m109791i(faceDetectConfirmUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public final void mo2163I7() {
        Intent intent = new Intent();
        intent.putExtra("err_code", C2271r.m2060a(90022));
        intent.putExtra("err_msg", "get confirm info error");
        intent.putExtra("verify_result", this.f12357C);
        FaceDetectReporter.m162242a().mo175299c(this.f12382u, false, 3, 2, 90022);
        C0222b.m167f(90022);
        FaceDetectReporter.m162242a().f345969p = System.currentTimeMillis();
        FaceDetectReporter.m162242a().mo175298b(this.f12381t, this.f12382u);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: J7 */
    public final void mo2164J7() {
        Intent intent = new Intent();
        intent.putExtra("err_code", C2271r.m2060a(90024));
        intent.putExtra("err_msg", "user cancel in confirm ui");
        FaceDetectReporter.m162242a().mo175299c(this.f12382u, false, 3, 1, 90024);
        C0222b.m173l("msgVerify", "user cancel in confirm ui");
        C0222b.m167f(90024);
        FaceDetectReporter.m162242a().f345969p = System.currentTimeMillis();
        FaceDetectReporter.m162242a().mo175298b(this.f12381t, this.f12382u);
        setResult(0, intent);
        finish();
    }

    public void finish() {
        C89779i0 i0Var = this.f12372h;
        if (i0Var != null && i0Var.isShowing()) {
            this.f12372h.dismiss();
        }
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a5i;
    }

    public final void init() {
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.cpd);
        this.f12360F = (ViewGroup) findViewById(C0966R.C0970id.cp9);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C2279e());
        this.f12368d = (TextView) findViewById(C0966R.C0970id.cp_);
        this.f12369e = (Button) findViewById(C0966R.C0970id.k0f);
        this.f12386y = (ImageView) findViewById(C0966R.C0970id.f6112xm);
        this.f12387z = (TextView) findViewById(C0966R.C0970id.f6113xn);
        ((ViewGroup) findViewById(C0966R.C0970id.cpb)).setOnClickListener(new C2280f());
        CheckBox checkBox = (CheckBox) findViewById(C0966R.C0970id.cpa);
        this.f12370f = checkBox;
        checkBox.setOnCheckedChangeListener(new a$$a(this));
        this.f12370f.setVisibility(8);
        TextView textView = (TextView) findViewById(C0966R.C0970id.cpc);
        this.f12371g = textView;
        textView.setOnClickListener(new C2281g());
        this.f12373i = (TextView) findViewById(C0966R.C0970id.cp8);
        this.f12363I = (TextView) findViewById(C0966R.C0970id.lnq);
        this.f12364J = (ViewGroup) findViewById(C0966R.C0970id.cpf);
        this.f12366L = (TextView) findViewById(C0966R.C0970id.cpg);
        this.f12365K = (CheckBox) findViewById(C0966R.C0970id.cpe);
        this.f12364J.setVisibility(8);
        this.f12365K.setOnCheckedChangeListener(new a$$b(this));
        this.f12364J.setOnClickListener(new a$$c(this));
        this.f12369e.setOnClickListener(new C2282h());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.FaceDetectConfirmUI", "onActiviyResult reqeustCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        FaceDetectReporter.m162242a().f345969p = System.currentTimeMillis();
        if (intent != null && intent.hasExtra("err_code")) {
            intent.putExtra("err_code", C2271r.m2060a(intent.getIntExtra("err_code", -1)));
        }
        setResult(i2, intent);
        finish();
    }

    public void onBackPressed() {
        if (this.f12367M) {
            mo2163I7();
        } else {
            mo2164J7();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0222b.m163b().f9700p = System.currentTimeMillis();
        hideActionbarLine();
        this.f12379r = getIntent().getStringExtra("appId");
        this.f12380s = getIntent().getStringExtra("request_verify_pre_info");
        this.f12381t = getIntent().getStringExtra("key_function_name");
        this.f12382u = getIntent().getIntExtra("key_business_type", -1);
        this.f12383v = getIntent().getIntExtra("check_alive_type", 0);
        this.f12359E = System.currentTimeMillis();
        Log.m105925i("MicroMsg.FaceDetectConfirmUI", "appId:%s jsonData:%s functionName:%s businessType:%s check_alive_type_request:%s", this.f12379r, this.f12380s, this.f12381t, Integer.valueOf(this.f12382u), Integer.valueOf(this.f12383v));
        init();
        Log.m105924i("MicroMsg.FaceDetectConfirmUI", "alvinluo start get confirm info");
        this.f12372h = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), false, false, new C8872b(this));
        C7630m mVar = new C7630m(this.f12379r, this.f12380s, this.f12383v);
        C86709a0.m107524d().mo123455a(1147, this);
        C86709a0.m107524d().mo123460f(mVar);
        C0382b.C0385c.f988a.mo416a(this);
        C0222b.m175n(1);
    }

    public void onDestroy() {
        SensorManager sensorManager;
        super.onDestroy();
        C0382b bVar = C0382b.C0385c.f988a;
        if (bVar.f986c && (sensorManager = bVar.f984a) != null) {
            bVar.f986c = false;
            sensorManager.unregisterListener(bVar.f985b);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105924i("MicroMsg.FaceDetectConfirmUI", "alvinluo onRequestPermissionsResult");
        if (iArr != null && iArr.length > 0) {
            if (i != 16) {
                if (i != 18 && i != 80) {
                    return;
                }
                if (iArr[0] == 0) {
                    this.f12369e.performClick();
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.ck7), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C2277c(), new C2278d(this));
            } else if (iArr[0] == 0) {
                this.f12369e.performClick();
            } else {
                C76879j.m92709C(this, getString(C0966R.string.ck6), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C2275a(), new C2276b(this));
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        int i3 = 4;
        Log.m105925i("MicroMsg.FaceDetectConfirmUI", "alvinluo scene: %d, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), str);
        C0222b.m173l("confirmCode", Integer.valueOf(i));
        C0222b.m173l("confirmMsg", str);
        C7630m mVar = (C7630m) yVar;
        String str3 = mVar.f25923n;
        this.f12376o = str3;
        this.f12357C = mVar.f25930u;
        this.f12358D = mVar.f25928s;
        Log.m105925i("MicroMsg.FaceDetectConfirmUI", "mFeedbackUrl:%s", str3);
        if (i == 0 && i2 == 0) {
            this.f12374j = mVar.f25919g;
            this.f12375n = mVar.f25922j;
            this.f12377p = mVar.f25924o;
            this.f12378q = mVar.f25925p;
            this.f12384w = mVar.f25926q;
            this.f12385x = mVar.f25927r;
            this.f12355A = mVar.f25920h;
            this.f12356B = mVar.f25921i;
            this.f12362H = mVar.f25932w;
            this.f12361G = mVar.f25931v;
            Log.m105918d("MicroMsg.FaceDetectConfirmUI", yVar.toString());
            if (Util.isNullOrNil(this.f12375n)) {
                this.f12375n = getString(C0966R.string.cif);
            }
            C89779i0 i0Var = this.f12372h;
            if (i0Var != null && i0Var.isShowing()) {
                this.f12372h.dismiss();
            }
            this.f12369e.setEnabled(true);
            this.f12368d.setText(this.f12375n);
            this.f12387z.setText(String.format(getString(C0966R.string.cig), new Object[]{this.f12356B}));
            C20828a.m22825b().mo32518g(this.f12355A, this.f12386y);
            C49996ji3 ji32 = this.f12374j;
            if (ji32 != null) {
                Log.m105927v("MicroMsg.FaceDetectConfirmUI", "alvinluo provider wording: %s, url_wording: %s, url: %s", ji32.f136140d, ji32.f136142f, ji32.f136141e);
                C49996ji3 ji33 = this.f12374j;
                Log.m105925i("MicroMsg.FaceDetectConfirmUI", "alvinluo protocol info: %s", ji33.f136140d);
                String string = Util.isNullOrNil(ji33.f136140d) ? getString(C0966R.string.cid) : ji33.f136140d;
                String string2 = Util.isNullOrNil(ji33.f136142f) ? getString(C0966R.string.cic) : ji33.f136142f;
                Spannable.Factory instance = Spannable.Factory.getInstance();
                Spannable newSpannable = instance.newSpannable(string + string2);
                newSpannable.setSpan(new C8875e(this, ji33), string.length(), string.length() + string2.length(), 33);
                this.f12370f.setVisibility(0);
                this.f12371g.setVisibility(0);
                this.f12371g.setText(newSpannable);
                this.f12371g.setMovementMethod(LinkMovementMethod.getInstance());
                int i4 = ji33.f136143g;
                if (i4 == 0) {
                    this.f12370f.setChecked(false);
                    this.f12369e.setEnabled(false);
                } else if (i4 == 1) {
                    this.f12370f.setChecked(true);
                    this.f12369e.setEnabled(true);
                }
                this.f12373i.setText(getString(C0966R.string.cia));
                this.f12373i.setOnClickListener(new C8876f(this));
                this.f12373i.setVisibility(0);
            }
            Log.m105925i("MicroMsg.FaceDetectConfirmUI", "wechat header text: %s", this.f12362H);
            if (!Util.isNullOrNil(this.f12362H)) {
                this.f12363I.setVisibility(0);
                this.f12363I.setText(this.f12362H);
            }
            C49996ji3 ji34 = this.f12361G;
            if (!(ji34 == null || (str2 = ji34.f136140d) == null)) {
                Log.m105925i("MicroMsg.FaceDetectConfirmUI", "wechat promptInfo wording: %s, check status: %d", str2, Integer.valueOf(ji34.f136143g));
                this.f12364J.setVisibility(0);
                int i5 = this.f12361G.f136143g;
                if (i5 == 0) {
                    this.f12365K.setChecked(false);
                    this.f12369e.setEnabled(false);
                } else if (i5 == 1) {
                    this.f12365K.setChecked(true);
                    this.f12369e.setEnabled(true);
                }
                this.f12366L.setText(this.f12361G.f136140d);
            }
        } else {
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.cju);
            }
            String str4 = mVar.f25929t;
            C89779i0 i0Var2 = this.f12372h;
            if (i0Var2 != null && i0Var2.isShowing()) {
                this.f12372h.dismiss();
            }
            this.f12367M = true;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2379bg);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2380bh);
            TextView textView = (TextView) this.f12360F.findViewById(C0966R.C0970id.f357961cq1);
            ImageView imageView = (ImageView) this.f12360F.findViewById(C0966R.C0970id.f357962cq2);
            Button button = (Button) this.f12360F.findViewById(C0966R.C0970id.cpx);
            TextView textView2 = (TextView) this.f12360F.findViewById(C0966R.C0970id.cpw);
            ImageView imageView2 = (ImageView) this.f12360F.findViewById(C0966R.C0970id.f357960cq0);
            this.f12360F.setVisibility(0);
            button.setText(C0966R.string.a18);
            button.setOnClickListener(new C8873c(this));
            imageView2.setImageResource(C0966R.C0969drawable.f4962sj);
            imageView2.startAnimation(loadAnimation);
            imageView.setImageDrawable(C76577a.m92158i(getContext(), C0966R.raw.icons_filled_error3));
            imageView.startAnimation(loadAnimation2);
            ((TextView) this.f12360F.findViewById(C0966R.C0970id.cq4)).setText(str);
            if (!TextUtils.isEmpty(str4)) {
                textView.setText(str4);
            }
            if (!TextUtils.isEmpty(this.f12376o)) {
                i3 = 0;
            }
            textView2.setVisibility(i3);
            textView2.setOnClickListener(new C8874d(this, i2));
        }
        C86709a0.m107524d().mo123470p(1147, this);
    }
}
