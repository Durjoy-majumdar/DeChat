package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactAddUI;
import com.tencent.p014mm.plugin.account.p024ui.MobileInputUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import gg0.C116957u;
import gg0.C116958v;
import hg0.C46062s0;
import hg0.C76186t;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p214om.C11502f;
import p286zl.C79396l;
import p447aw.C103918d;
import p910lj.C76701a;
import qo3.C77398g;
import te3.C49174do2;
import wc3.C15131b;
import wc3.C15141z;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI */
public class FindMContactAlertUI extends MMWizardActivity {

    /* renamed from: B */
    public static final /* synthetic */ int f344325B = 0;

    /* renamed from: A */
    public int f344326A = 0;

    /* renamed from: e */
    public String f344327e = null;

    /* renamed from: f */
    public String f344328f = "";

    /* renamed from: g */
    public int f344329g = 2;

    /* renamed from: h */
    public String f344330h = null;

    /* renamed from: i */
    public String f344331i = null;

    /* renamed from: j */
    public boolean f344332j = false;

    /* renamed from: n */
    public List<String[]> f344333n = null;

    /* renamed from: o */
    public C11385n f344334o = null;

    /* renamed from: p */
    public ProgressDialog f344335p = null;

    /* renamed from: q */
    public C46062s0 f344336q;

    /* renamed from: r */
    public String f344337r;

    /* renamed from: s */
    public String f344338s;

    /* renamed from: t */
    public String f344339t;

    /* renamed from: u */
    public int f344340u = 0;

    /* renamed from: v */
    public int f344341v = 0;

    /* renamed from: w */
    public int f344342w = 0;

    /* renamed from: x */
    public int f344343x = 0;

    /* renamed from: y */
    public int f344344y = 0;

    /* renamed from: z */
    public int f344345z = 0;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$a */
    public class C114868a implements DialogInterface.OnClickListener {
        public C114868a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FindMContactAlertUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$b */
    public class C114869b implements DialogInterface.OnClickListener {
        public C114869b(FindMContactAlertUI findMContactAlertUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$c */
    public class C114870c implements DialogInterface.OnClickListener {
        public C114870c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76186t.m91542j(true);
            C78595a.m94985e("R200_100");
            Intent intent = new Intent();
            intent.putExtra("mobile_input_purpose", 4);
            intent.putExtra("regsetinfo_ticket", FindMContactAlertUI.this.f344327e);
            intent.putExtra("regsetinfo_NextStep", FindMContactAlertUI.this.f344328f);
            intent.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.this.f344329g);
            C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
            FindMContactAlertUI findMContactAlertUI = FindMContactAlertUI.this;
            ((C67654r1) yM).getClass();
            if (findMContactAlertUI != null) {
                intent.setClass(findMContactAlertUI, MobileInputUI.class);
                MMWizardActivity.m7017L7(findMContactAlertUI, intent);
            }
            C78595a.m94985e("R300_300_phone");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(FindMContactAlertUI.this.getClass().getName());
            sb.append(",");
            sb.append("R300_200_phone");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_200_phone"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$d */
    public class C114871d implements DialogInterface.OnClickListener {
        public C114871d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76186t.m91542j(false);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(FindMContactAlertUI.this.getClass().getName());
            sb.append(",");
            sb.append("R300_200_phone");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_200_phone"));
            sb.append(",");
            sb.append(2);
            C78595a.m94982b(10645, sb.toString());
            FindMContactAlertUI.this.mo174551Q7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$e */
    public class C114872e implements DialogInterface.OnClickListener {
        public C114872e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76186t.m91542j(true);
            FindMContactAlertUI findMContactAlertUI = FindMContactAlertUI.this;
            int i2 = FindMContactAlertUI.f344325B;
            findMContactAlertUI.mo174550P7();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$f */
    public class C114873f implements DialogInterface.OnClickListener {
        public C114873f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(FindMContactAlertUI.this, FindMContactLearmMoreUI.class);
            intent.putExtra("regsetinfo_ticket", FindMContactAlertUI.this.f344327e);
            intent.putExtra("regsetinfo_NextStep", FindMContactAlertUI.this.f344328f);
            intent.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.this.f344329g);
            MMWizardActivity.m7017L7(FindMContactAlertUI.this, intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$g */
    public class C114874g implements C11385n {
        public C114874g() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3;
            boolean z;
            ProgressDialog progressDialog = FindMContactAlertUI.this.f344335p;
            if (progressDialog != null) {
                progressDialog.dismiss();
                FindMContactAlertUI.this.f344335p = null;
            }
            if (FindMContactAlertUI.this.f344334o != null) {
                C86709a0.m107524d().mo123470p(431, FindMContactAlertUI.this.f344334o);
                FindMContactAlertUI.this.f344334o = null;
            }
            if (i == 0 && i2 == 0) {
                LinkedList<C49174do2> j1 = ((C46062s0) yVar).mo71476j1();
                ((C76754b) C86312j.m106911c(C76754b.class)).Sw0(j1);
                if (j1 == null || j1.size() <= 0) {
                    z = false;
                    i3 = 0;
                } else {
                    Iterator<C49174do2> it = j1.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        C49174do2 next = it.next();
                        if (next != null && next.f132452f == 1) {
                            i3++;
                        }
                    }
                    z = i3 > 0;
                }
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(j1 == null ? 0 : j1.size());
                objArr[1] = Integer.valueOf(i3);
                Log.m105919d("MicroMsg.FindMContactAlertUI", "tigerreg data size=%d, addcount=%s", objArr);
                String str2 = FindMContactAlertUI.this.f344328f;
                if (str2 == null || !str2.contains("1") || !z) {
                    FindMContactAlertUI.this.mo174551Q7();
                    return;
                }
                C78595a.m94985e("R300_300_phone");
                Intent intent = new Intent(FindMContactAlertUI.this, FindMContactAddUI.class);
                intent.putExtra("regsetinfo_ticket", FindMContactAlertUI.this.f344327e);
                intent.putExtra("regsetinfo_NextStep", FindMContactAlertUI.this.f344328f);
                intent.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.this.f344329g);
                intent.putExtra("login_type", 0);
                MMWizardActivity.m7017L7(FindMContactAlertUI.this, intent);
                return;
            }
            FindMContactAlertUI findMContactAlertUI = FindMContactAlertUI.this;
            C76701a.makeText((Context) findMContactAlertUI, (CharSequence) findMContactAlertUI.getString(C0966R.string.f7966xq, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            FindMContactAlertUI.this.mo174551Q7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$h */
    public class C114875h implements DialogInterface.OnCancelListener {
        public C114875h() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (FindMContactAlertUI.this.f344334o != null) {
                C86709a0.m107524d().mo123470p(431, FindMContactAlertUI.this.f344334o);
                FindMContactAlertUI findMContactAlertUI = FindMContactAlertUI.this;
                findMContactAlertUI.f344334o = null;
                findMContactAlertUI.mo174548N7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI$i */
    public class C114876i implements MMHandlerThread.IWaitWorkThread {
        public C114876i() {
        }

        public boolean doInBackground() {
            try {
                FindMContactAlertUI findMContactAlertUI = FindMContactAlertUI.this;
                findMContactAlertUI.f344333n = C15131b.m14241e(findMContactAlertUI);
                StringBuilder sb = new StringBuilder();
                sb.append("tigerreg mobileList size ");
                List<String[]> list = FindMContactAlertUI.this.f344333n;
                sb.append(list == null ? 0 : list.size());
                Log.m105918d("MicroMsg.FindMContactAlertUI", sb.toString());
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FindMContactAlertUI", e, "", new Object[0]);
                return true;
            }
        }

        public boolean onPostExecute() {
            List<String[]> list = FindMContactAlertUI.this.f344333n;
            if (list == null || list.size() == 0) {
                ProgressDialog progressDialog = FindMContactAlertUI.this.f344335p;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    FindMContactAlertUI.this.f344335p = null;
                }
                FindMContactAlertUI.this.mo174551Q7();
                return false;
            }
            FindMContactAlertUI findMContactAlertUI = FindMContactAlertUI.this;
            findMContactAlertUI.f344336q = new C46062s0(findMContactAlertUI.f344327e, (List<String>) null, findMContactAlertUI.f344333n);
            C86709a0.m107524d().mo123460f(FindMContactAlertUI.this.f344336q);
            return false;
        }

        public String toString() {
            return super.toString() + "|doUpload";
        }
    }

    /* renamed from: N7 */
    public final void mo174548N7() {
        if (this.f344332j) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_200_phone");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_200_phone"));
            sb.append(",");
            sb.append(1);
            C78595a.m94982b(10645, sb.toString());
            C76879j.m92717K(this, false, getString(C0966R.string.cwq), getString(C0966R.string.a3h), getString(C0966R.string.a18), getString(C0966R.string.f7926wf), new C114870c(), new C114871d());
        } else if (C76186t.m91539g()) {
            String str = this.f344339t;
            String str2 = this.f344338s;
            C114872e eVar = new C114872e();
            C114873f fVar = new C114873f();
            C77398g gVar = new C77398g(this, C0966R.style.f8472js);
            gVar.setTitle((CharSequence) str2);
            gVar.mo107533r(str);
            gVar.mo107541v(C0966R.string.cxd, eVar);
            gVar.mo107534s(C0966R.string.cx9, fVar);
            gVar.mo107529i(-1, true);
            gVar.setCancelable(false);
            gVar.show();
            gVar.getWindow().clearFlags(2);
            addDialog(gVar);
            gVar.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new C116957u(this, gVar));
            View findViewById = findViewById(C0966R.C0970id.a3a);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C116958v(this, findViewById));
        } else {
            mo174550P7();
        }
    }

    /* renamed from: O7 */
    public final void mo174549O7() {
        int height = getWindowManager().getDefaultDisplay().getHeight();
        int dimensionPixelSize = this.f344343x - (getResources().getDimensionPixelSize(C0966R.dimen.f3931jc) + C76577a.m92151b(this, 48));
        int b = (((height / 2) + (this.f344342w / 2)) - (height - this.f344344y)) + C76577a.m92151b(this, 20);
        if (dimensionPixelSize != this.f344345z || b != this.f344326A) {
            this.f344345z = dimensionPixelSize;
            this.f344326A = b;
            View findViewById = findViewById(C0966R.C0970id.e94);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/FindMContactAlertUI", "attachArrow", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/account/bind/ui/FindMContactAlertUI", "attachArrow", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.setMargins(dimensionPixelSize - (findViewById.getMeasuredWidth() / 2), b, 0, 0);
            Log.m105919d("MicroMsg.FindMContactAlertUI", "attachArrow x: %s y: %s view.width: %s", Integer.valueOf(dimensionPixelSize), Integer.valueOf(b), Integer.valueOf(findViewById.getMeasuredWidth()));
            findViewById.setLayoutParams(layoutParams);
            findViewById.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2356ak));
        }
    }

    /* renamed from: P7 */
    public final void mo174550P7() {
        Class cls = C76754b.class;
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
        Log.m105925i("MicroMsg.FindMContactAlertUI", "summerper checkPermission checkContacts[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
        if (z1) {
            View findViewById = findViewById(C0966R.C0970id.e94);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/FindMContactAlertUI", "doUpload", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/account/bind/ui/FindMContactAlertUI", "doUpload", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C89137b0 d = C86709a0.m107524d();
            C114874g gVar = new C114874g();
            this.f344334o = gVar;
            d.mo123455a(431, gVar);
            this.f344335p = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f360085a04), true, true, new C114875h());
            C86709a0.m107525e().postAtFrontOfWorker(new C114876i());
            ((C76754b) C86312j.m106911c(cls)).mo105744cx(true, false);
            ((C76754b) C86312j.m106911c(cls)).mo105747jG();
            C115669n.INSTANCE.mo160131h(11438, 1);
            Log.m105925i("MicroMsg.FindMContactAlertUI", "[cpan] kv report logid:%d scene:%d", 11438, 1);
        }
    }

    /* renamed from: Q7 */
    public final void mo174551Q7() {
        C78595a.m94985e(this.f344337r);
        hideVKB();
        mo7681K7(1);
    }

    /* renamed from: R7 */
    public final View mo174552R7(ViewGroup viewGroup) {
        View R7;
        int i = this.f344340u;
        if (i >= 200) {
            return null;
        }
        this.f344340u = i + 1;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof Button) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (R7 = mo174552R7((ViewGroup) childAt)) != null) {
                return R7;
            }
        }
        return null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.arf;
    }

    public void initView() {
        this.f344338s = getString(C0966R.string.cwr);
        this.f344339t = getString(C0966R.string.cwq);
        if (!Util.isNullOrNil(this.f344330h)) {
            this.f344338s = this.f344330h;
        }
        if (!Util.isNullOrNil(this.f344331i)) {
            this.f344339t = this.f344331i;
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (str == null || str.equals("")) {
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cx7);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        this.f344327e = getIntent().getStringExtra("regsetinfo_ticket");
        this.f344328f = getIntent().getStringExtra("regsetinfo_NextStep");
        this.f344329g = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f344330h = getIntent().getStringExtra("alert_title");
        this.f344331i = getIntent().getStringExtra("alert_message");
        this.f344332j = C76186t.m91534b() != C79396l.SUCC;
        this.f344337r = C78595a.m94981a();
        Log.m105919d("MicroMsg.FindMContactAlertUI", "tigerreg mNextStep %s  mNextStyle %s ", this.f344328f, Integer.valueOf(this.f344329g));
        if (!isFinishing()) {
            initView();
            mo174548N7();
        }
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.FindMContactAlertUI", "ondestroy");
        if (this.f344334o != null) {
            C86709a0.m107524d().mo123470p(431, this.f344334o);
            this.f344334o = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174551Q7();
        return true;
    }

    public void onPause() {
        super.onPause();
        if (this.f344332j) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_100_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_100_QQ"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        C86709a0.m107523b();
        sb4.append(C86718e.m107547e());
        sb4.append(",");
        sb4.append(getClass().getName());
        sb4.append(",");
        sb4.append("RE300_100");
        sb4.append(",");
        C86709a0.m107523b();
        sb4.append(C86718e.m107548f("RE300_100"));
        sb4.append(",");
        sb4.append(2);
        C78595a.m94983c(10645, false, sb4.toString());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.FindMContactAlertUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.FindMContactAlertUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48) {
            if (iArr[0] == 0) {
                mo174550P7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C114868a(), new C114869b(this));
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f344332j) {
            C78595a.m94984d("R300_100_QQ");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R300_100_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_100_QQ"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            return;
        }
        C78595a.m94984d("R300_100_phone");
        StringBuilder sb4 = new StringBuilder();
        C86709a0.m107523b();
        sb4.append(C86718e.m107547e());
        sb4.append(",");
        sb4.append(getClass().getName());
        sb4.append(",");
        sb4.append("RE300_100");
        sb4.append(",");
        C86709a0.m107523b();
        sb4.append(C86718e.m107548f("RE300_100"));
        sb4.append(",");
        sb4.append(1);
        C78595a.m94983c(10645, true, sb4.toString());
    }
}
