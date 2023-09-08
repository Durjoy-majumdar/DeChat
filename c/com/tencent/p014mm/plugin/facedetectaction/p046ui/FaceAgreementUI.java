package com.tencent.p014mm.plugin.facedetectaction.p046ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import au1.C0222b;
import bu1.C0381a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.facedetect.model.C2271r;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.C2292b;
import com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import ie3.C76328d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import lb1.C10482d;
import mb1.C109603j;
import nb1.C11144k;
import nb1.C11145m;
import nb1.C11146n;
import nb1.C76849l;
import nb1.j$$a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76978g;
import qo3.C101218e0;
import xt1.C15895a;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI */
public class FaceAgreementUI extends MMActivity implements C11385n {

    /* renamed from: t */
    public static final /* synthetic */ int f12413t = 0;

    /* renamed from: d */
    public Dialog f12414d = null;

    /* renamed from: e */
    public Button f12415e;

    /* renamed from: f */
    public LinearLayout f12416f;

    /* renamed from: g */
    public TextView f12417g;

    /* renamed from: h */
    public TextView f12418h;

    /* renamed from: i */
    public String f12419i = "";

    /* renamed from: j */
    public String f12420j = "";

    /* renamed from: n */
    public String f12421n = "";

    /* renamed from: o */
    public String f12422o = "";

    /* renamed from: p */
    public TextView f12423p;

    /* renamed from: q */
    public C101218e0 f12424q;

    /* renamed from: r */
    public boolean f12425r = false;

    /* renamed from: s */
    public boolean f12426s = false;

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI$a */
    public class C2287a implements View.OnClickListener {
        public C2287a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.FaceAgreementUI", "needShowProtocal : %s", Boolean.valueOf(FaceAgreementUI.this.f12425r));
            FaceAgreementUI faceAgreementUI = FaceAgreementUI.this;
            if (faceAgreementUI.f12425r) {
                faceAgreementUI.f12426s = true;
                C101218e0 e0Var = new C101218e0(faceAgreementUI.getContext(), 1, 3);
                faceAgreementUI.f12424q = e0Var;
                e0Var.mo140667n(faceAgreementUI.getString(C0966R.string.chx), faceAgreementUI.getString(C0966R.string.chu));
                C101218e0 e0Var2 = faceAgreementUI.f12424q;
                C11145m mVar = new C11145m(faceAgreementUI);
                C11146n nVar = new C11146n(faceAgreementUI);
                e0Var2.f296373D = mVar;
                e0Var2.f296374E = nVar;
                View inflate = View.inflate(faceAgreementUI.getContext(), C0966R.C0971layout.a5f, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.coz);
                if (!Util.isNullOrNil(faceAgreementUI.f12420j)) {
                    textView.setText(faceAgreementUI.f12420j);
                } else {
                    textView.setText(faceAgreementUI.getString(C0966R.string.chw));
                }
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                faceAgreementUI.f12424q.mo140672r(inflate);
                View inflate2 = View.inflate(faceAgreementUI.getContext(), C0966R.C0971layout.a5e, (ViewGroup) null);
                TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.coy);
                faceAgreementUI.f12418h = textView2;
                C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                String str = faceAgreementUI.f12419i;
                TextView textView3 = faceAgreementUI.f12418h;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(String.format(str, new Object[]{LocaleUtil.getCurrentLanguage(faceAgreementUI)}));
                ArrayList arrayList3 = new ArrayList();
                String string = !Util.isNullOrNil(faceAgreementUI.f12421n) ? faceAgreementUI.f12421n : faceAgreementUI.getString(C0966R.string.chz);
                arrayList3.add(string);
                SpannableString spannableString = new SpannableString(string);
                for (int i = 0; i < arrayList3.size(); i++) {
                    String str2 = (String) arrayList3.get(i);
                    int indexOf = string.indexOf(str2);
                    int length = str2.length() + indexOf;
                    if (indexOf >= 0 && length <= string.length()) {
                        spannableString.setSpan(new C2292b((String) arrayList2.get(i), MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d), MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2), true, new C2291a(faceAgreementUI, faceAgreementUI)), indexOf, length, 17);
                    }
                }
                if (textView3 != null) {
                    textView3.setText(spannableString);
                    textView3.setOnTouchListener(new C76849l(faceAgreementUI, spannableString, textView3));
                }
                faceAgreementUI.f12424q.mo140663j(inflate2);
                faceAgreementUI.f12424q.mo140655A();
            } else {
                Intent intent = new Intent(FaceAgreementUI.this, FaceFlashPermissionUI.class);
                Bundle extras = FaceAgreementUI.this.getIntent().getExtras();
                if (extras != null) {
                    intent.putExtras(extras);
                }
                intent.putExtra("needContract", FaceAgreementUI.this.f12425r);
                FaceAgreementUI.this.startActivityForResult(intent, 1);
                C115669n.INSTANCE.idkeyStat(917, 67, 1, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI$b */
    public class C2288b implements C2292b.C2293a {
        public C2288b() {
        }

        /* renamed from: a */
        public void mo2185a(String str) {
            Log.m105924i("MicroMsg.FaceAgreementUI", "click faceAgreementOtherVerifyTitle");
            Intent intent = new Intent();
            intent.putExtra("err_msg", "fail");
            intent.putExtra("err_code", 90114);
            intent.putExtra("click_other_verify_btn_front", "yes");
            C0222b.m169h(90114);
            FaceAgreementUI.this.setResult(1, intent);
            FaceAgreementUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI$c */
    public class C2289c implements View.OnClickListener {
        public C2289c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FaceAgreementUI faceAgreementUI = FaceAgreementUI.this;
            int i = FaceAgreementUI.f12413t;
            faceAgreementUI.getClass();
            Log.m105924i("MicroMsg.FaceAgreementUI", "onUserCancel()");
            faceAgreementUI.mo2183I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI$d */
    public class C2290d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f12430d;

        /* renamed from: e */
        public final /* synthetic */ int f12431e;

        /* renamed from: f */
        public final /* synthetic */ C117747y f12432f;

        /* renamed from: g */
        public final /* synthetic */ String f12433g;

        public C2290d(int i, int i2, C117747y yVar, String str) {
            this.f12430d = i;
            this.f12431e = i2;
            this.f12432f = yVar;
            this.f12433g = str;
        }

        public void run() {
            if (this.f12430d == 0 && this.f12431e == 0) {
                FaceAgreementUI.m2068H7(FaceAgreementUI.this);
                C117747y yVar = this.f12432f;
                int i = ((C10482d) yVar).f31723e.f138886f;
                String str = ((C10482d) yVar).f31723e.f138887g;
                FaceAgreementUI faceAgreementUI = FaceAgreementUI.this;
                faceAgreementUI.f12419i = ((C10482d) yVar).f31723e.f138888h;
                faceAgreementUI.f12420j = ((C10482d) yVar).f31723e.f138889i;
                faceAgreementUI.f12421n = ((C10482d) yVar).f31723e.f138890j;
                FaceAgreementUI faceAgreementUI2 = FaceAgreementUI.this;
                Log.m105925i("MicroMsg.FaceAgreementUI", "[cgi-ret]contractRet:%s  tip:%s url:%s contractTitle:%s contractDesc:%s", Integer.valueOf(i), str, faceAgreementUI2.f12419i, faceAgreementUI2.f12420j, faceAgreementUI2.f12421n);
                if (i == 1) {
                    FaceAgreementUI faceAgreementUI3 = FaceAgreementUI.this;
                    faceAgreementUI3.f12425r = false;
                    faceAgreementUI3.f12415e.setEnabled(true);
                } else if (TextUtils.isEmpty(FaceAgreementUI.this.f12419i)) {
                    FaceAgreementUI faceAgreementUI4 = FaceAgreementUI.this;
                    faceAgreementUI4.f12425r = false;
                    faceAgreementUI4.f12416f.setVisibility(4);
                    FaceAgreementUI.this.f12415e.setEnabled(true);
                } else {
                    FaceAgreementUI.this.f12425r = true;
                    C109603j.f328125A.f328145z = true;
                }
                if (FaceAgreementUI.this.f12425r) {
                    C115669n.INSTANCE.idkeyStat(917, 62, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(917, 61, 1, false);
                }
                FaceAgreementUI.this.f12417g.setText(str);
                return;
            }
            C115669n.INSTANCE.idkeyStat(917, 72, 1, false);
            FaceAgreementUI.this.f12425r = false;
            Log.m105921e("MicroMsg.FaceAgreementUIError", "[cgi-ret]net ret error, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(this.f12430d), Integer.valueOf(this.f12431e), this.f12433g);
            FaceAgreementUI.m2068H7(FaceAgreementUI.this);
            Intent intent = new Intent();
            intent.putExtra("err_msg", "fail");
            intent.putExtra("err_code", 90110);
            C0222b.m169h(90110);
            FaceAgreementUI.this.setResult(1, intent);
            FaceAgreementUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public static void m2068H7(FaceAgreementUI faceAgreementUI) {
        Dialog dialog;
        if (!faceAgreementUI.isDestroyed() && !faceAgreementUI.isFinishing() && (dialog = faceAgreementUI.f12414d) != null && dialog.isShowing()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C11144k(faceAgreementUI));
        }
    }

    /* renamed from: I7 */
    public final void mo2183I7() {
        C0222b.m169h(C2271r.m2060a(90024));
        Intent intent = new Intent();
        intent.putExtra("err_msg", "cancel");
        intent.putExtra("err_code", C2271r.m2060a(90024));
        setResult(0, intent);
        finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        if (C0381a.m328e()) {
            return -1;
        }
        return C0966R.C0971layout.a5g;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.FaceAgreementUI", "onActivityResult() ");
        setResult(i2, intent);
        finish();
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.FaceAgreementUI", "onBackPressed()");
        Intent intent = new Intent();
        C0222b.m169h(C2271r.m2060a(90024));
        intent.putExtra("err_code", C2271r.m2060a(90024));
        intent.putExtra("err_msg", "cancel");
        setResult(0, intent);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        if (C0381a.m328e()) {
            setTheme(C0966R.style.f8648pu);
        }
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.FaceAgreementUI", "onCreate()");
        ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(this, 11, 6);
        if (C0381a.m328e()) {
            overridePendingTransition(0, 0);
            int intExtra = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            String stringExtra = getIntent().getStringExtra("package");
            String stringExtra2 = getIntent().getStringExtra("packageSign");
            String stringExtra3 = getIntent().getStringExtra("otherVerifyTitleFront");
            Intent intent = new Intent();
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, intExtra);
            intent.putExtra("package", stringExtra);
            intent.putExtra("package_sign", stringExtra2);
            intent.putExtra("other_verify_title_front", stringExtra3);
            ((C76324c) C86312j.m106911c(C76324c.class)).startFaceCheckUseCase("faceCheckFrontUseCase", intent, new j$$a(this));
            return;
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.cox);
        this.f12415e = (Button) findViewById(C0966R.C0970id.cp4);
        this.f12416f = (LinearLayout) findViewById(C0966R.C0970id.f357957cp1);
        this.f12417g = (TextView) findViewById(C0966R.C0970id.f357958cp2);
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.f357959cp3)).getPaint(), 0.8f);
        this.f12415e.setEnabled(true);
        this.f12415e.setOnClickListener(new C2287a());
        this.f12423p = (TextView) findViewById(C0966R.C0970id.lys);
        String stringExtra4 = getIntent().getStringExtra("otherVerifyTitleFront");
        this.f12422o = stringExtra4;
        if (!Util.isNullOrNil(stringExtra4)) {
            this.f12423p.setVisibility(0);
            this.f12423p.setClickable(true);
            this.f12423p.setOnTouchListener(((C76978g) C86312j.m106911c(C76978g.class)).y40(getContext()));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12422o);
            spannableStringBuilder.setSpan(new C2292b(this.f12422o, getContext().getResources().getColor(C0966R.color.a1d), getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2), true, new C2288b()), 0, spannableStringBuilder.length(), 17);
            this.f12423p.setText(spannableStringBuilder);
            TextView textView2 = this.f12423p;
            textView2.setOnTouchListener(new C76849l(this, spannableStringBuilder, textView2));
        } else {
            this.f12423p.setVisibility(8);
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        getSupportActionBar().mo91104o();
        ((ImageView) findViewById(C0966R.C0970id.cow)).setOnClickListener(new C2289c());
        this.f12414d = C76879j.m92723Q(getContext(), "", getContext().getString(C0966R.string.gat), false, false, (DialogInterface.OnCancelListener) null);
        C86709a0.m107524d().mo123455a(1108, this);
        C86709a0.m107524d().mo123460f(new C10482d(getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0), getIntent().getStringExtra("package"), getIntent().getStringExtra("packageSign")));
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.FaceAgreementUI", "onDestroy() ");
        super.onDestroy();
        if (this.f12426s) {
            C115669n.INSTANCE.idkeyStat(917, 63, 1, false);
        }
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_use_flash_action, false);
        Log.m105925i("MicroMsg.FaceAgreementUI", "use new face action  %s", Boolean.valueOf(wf));
        if (wf) {
            C0222b.m164c().f9712e = 2;
        } else {
            C0222b.m164c().f9712e = 1;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.FaceAgreementUI", "onResume()");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.FaceAgreementUI", "onSceneEnd()");
        C86709a0.m107524d().mo123470p(1108, this);
        C0222b.m164c().f9714g = i2;
        ((C119157j) C119157j.f356862d).mo183895z(new C2290d(i, i2, yVar, str));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C15895a.class);
    }
}
