package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.account.p024ui.C1489u0;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import hg0.C76173n0;
import hg0.C76174o;
import j20.C117292a;
import java.util.ArrayList;
import jg0.C117355j;
import jg0.C9399k;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C10579k;
import p196ln.C76706g;
import p214om.C11502f;
import p910lj.C76701a;

@Deprecated
/* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI */
public class MMFBFriendUI extends MMActivity implements C11385n, C10579k.C10580a {

    /* renamed from: o */
    public static final /* synthetic */ int f10713o = 0;

    /* renamed from: d */
    public ListView f10714d;

    /* renamed from: e */
    public C1489u0 f10715e;

    /* renamed from: f */
    public View f10716f;

    /* renamed from: g */
    public ProgressDialog f10717g = null;

    /* renamed from: h */
    public TextView f10718h = null;

    /* renamed from: i */
    public boolean f10719i = false;

    /* renamed from: j */
    public String f10720j;

    /* renamed from: n */
    public C116102h f10721n;

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$a */
    public class C1439a implements MenuItem.OnMenuItemClickListener {
        public C1439a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MMFBFriendUI.this.hideVKB();
            MMFBFriendUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$b */
    public class C1440b implements View.OnClickListener {
        public C1440b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MMFBFriendUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = MMFBFriendUI.this.f10714d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI$11", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$11", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$c */
    public class C1441c implements C106742j1.C106756o {
        public C1441c() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            MMFBFriendUI.this.f10720j = Util.escapeSqlValue(str);
            MMFBFriendUI mMFBFriendUI = MMFBFriendUI.this;
            C1489u0 u0Var = mMFBFriendUI.f10715e;
            if (u0Var != null) {
                u0Var.f10837p = Util.escapeSqlValue(mMFBFriendUI.f10720j.trim());
                u0Var.mo5580b();
                u0Var.mo1333o();
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$d */
    public class C1442d implements C6975i1.C6977b {

        /* renamed from: a */
        public final /* synthetic */ TextView f10725a;

        public C1442d(TextView textView) {
            this.f10725a = textView;
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            if (C75592q0.m90792v()) {
                MMFBFriendUI mMFBFriendUI = MMFBFriendUI.this;
                if (mMFBFriendUI.f10719i) {
                    if (mMFBFriendUI.f10715e.getCount() == 0) {
                        this.f10725a.setVisibility(0);
                    } else {
                        this.f10725a.setVisibility(8);
                    }
                }
            }
            MMFBFriendUI.this.f10719i = false;
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$e */
    public class C1443e implements C1489u0.C1490a {
        public C1443e() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$f */
    public class C1444f implements AdapterView.OnItemClickListener {
        public C1444f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MMFBFriendUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            MMFBFriendUI mMFBFriendUI = MMFBFriendUI.this;
            C76174o oVar = (C76174o) mMFBFriendUI.f10715e.getItem(i - mMFBFriendUI.f10714d.getHeaderViewsCount());
            int i2 = oVar.f223173d;
            if (i2 == 100 || i2 == 101) {
                Intent intent = new Intent();
                String str = oVar.f223174e;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                intent.putExtra("Contact_User", str);
                String str3 = oVar.f223175f;
                if (str3 == null) {
                    str3 = str2;
                }
                intent.putExtra("Contact_Nick", str3);
                intent.putExtra("Contact_KFacebookId", oVar.f223170a);
                String str4 = oVar.f223171b;
                if (str4 != null) {
                    str2 = str4;
                }
                intent.putExtra("Contact_KFacebookName", str2);
                intent.putExtra("Contact_Scene", 31);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, MMFBFriendUI.this);
            }
            if (oVar.f223173d == 102) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else {
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$g */
    public class C1445g extends C9399k {
        public C1445g() {
        }

        /* renamed from: a */
        public void mo779a(int i, String str) {
            super.mo779a(i, str);
            if (i == 3) {
                MMFBFriendUI mMFBFriendUI = MMFBFriendUI.this;
                int i2 = MMFBFriendUI.f10713o;
                mMFBFriendUI.getClass();
                Log.m105920e("MicroMsg.FacebookFriendUI", "dealWithRefreshTokenFail");
                C76879j.m92750u(mMFBFriendUI, mMFBFriendUI.getString(C0966R.string.cle), mMFBFriendUI.getString(C0966R.string.a3h), new C1492v0(mMFBFriendUI), (DialogInterface.OnClickListener) null);
            }
        }

        /* renamed from: b */
        public void mo780b(Bundle bundle) {
            super.mo780b(bundle);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$h */
    public class C1446h implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C76173n0 f10730d;

        public C1446h(MMFBFriendUI mMFBFriendUI, C76173n0 n0Var) {
            this.f10730d = n0Var;
        }

        public boolean onTimerExpired() {
            C86709a0.m107535s().mo121142i().mo119676J(65829, 1);
            C86709a0.m107524d().mo123460f(this.f10730d);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$i */
    public class C1447i implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ MTimerHandler f10731d;

        /* renamed from: e */
        public final /* synthetic */ C76173n0 f10732e;

        public C1447i(MMFBFriendUI mMFBFriendUI, MTimerHandler mTimerHandler, C76173n0 n0Var) {
            this.f10731d = mTimerHandler;
            this.f10732e = n0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f10731d.stopTimer();
            C86709a0.m107524d().mo123458d(this.f10732e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$j */
    public class C1448j implements MenuItem.OnMenuItemClickListener {
        public C1448j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MMFBFriendUI mMFBFriendUI = MMFBFriendUI.this;
            Intent intent = new Intent(MMFBFriendUI.this, InviteMMFBFriendsUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(mMFBFriendUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI$8", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMFBFriendUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMFBFriendUI, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$8", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI$k */
    public class C1449k implements View.OnClickListener {
        public C1449k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMFBFriendUI mMFBFriendUI = MMFBFriendUI.this;
            Intent intent = new Intent(MMFBFriendUI.this, MMFBAuthUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MMFBFriendUI mMFBFriendUI2 = mMFBFriendUI;
            C117292a.m165358d(mMFBFriendUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMFBFriendUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMFBFriendUI2, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        this.f10715e.notifyDataSetChanged();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7p;
    }

    public void initView() {
        this.f10714d = (ListView) findViewById(C0966R.C0970id.gvz);
        TextView textView = (TextView) findViewById(C0966R.C0970id.cis);
        this.f10718h = textView;
        textView.setText(C0966R.string.clf);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.f357933cj2);
        textView2.setText(C0966R.string.cld);
        C106742j1 j1Var = new C106742j1(true, true);
        j1Var.f319122j = new C1441c();
        addSearchMenu(true, j1Var);
        C1489u0 u0Var = new C1489u0(this, new C1442d(textView2));
        this.f10715e = u0Var;
        u0Var.f10838q = new C1443e();
        this.f10714d.setAdapter(u0Var);
        this.f10716f = findViewById(C0966R.C0970id.f358755gw0);
        this.f10714d.setOnItemClickListener(new C1444f());
        Log.m105918d("MicroMsg.FacebookFriendUI", "isBindForFacebookApp:" + C75592q0.m90792v());
        if (C75592q0.m90792v()) {
            this.f10714d.setVisibility(0);
            View view = this.f10716f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long nullAsNil = Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119684e(65831, (Object) null));
            String nullAsNil2 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(65830, (Object) null));
            if (Util.milliSecondsToNow(nullAsNil) > 86400000 && nullAsNil2.length() > 0) {
                C116102h hVar = new C116102h();
                this.f10721n = hVar;
                hVar.mo177424h(nullAsNil2);
                new C117355j(this.f10721n, new C1445g()).mo182018c();
            }
            C76173n0 n0Var = new C76173n0();
            n0Var.mo106411l1();
            MTimerHandler mTimerHandler = new MTimerHandler(new C1446h(this, n0Var), false);
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(65829, (Object) null)) > 0) {
                C86709a0.m107535s().mo121142i().mo119676J(65829, 1);
                C86709a0.m107524d().mo123460f(n0Var);
            } else {
                mTimerHandler.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
            this.f10717g = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.hos), true, true, new C1447i(this, mTimerHandler, n0Var));
            addTextOptionMenu(0, getString(C0966R.string.cvs), new C1448j());
        } else {
            this.f10714d.setVisibility(8);
            View view3 = this.f10716f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) findViewById(C0966R.C0970id.f358756gw1)).setText(C0966R.string.csh);
            this.f10716f.setOnClickListener(new C1449k());
        }
        setBackBtn(new C1439a());
        setToTop(new C1440b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cvr);
        C86709a0.m107524d().mo123455a(32, this);
        initView();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(32, this);
        this.f10715e.mo5580b();
        super.onDestroy();
        C116102h hVar = this.f10721n;
        if (hVar != null) {
            hVar.mo177420c(this);
        }
    }

    public void onPause() {
        super.onPause();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).f195667a.remove(this);
    }

    public void onResume() {
        super.onResume();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93556a(this);
        this.f10715e.notifyDataSetChanged();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.FacebookFriendUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar.getType() == 32) {
            ProgressDialog progressDialog = this.f10717g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f10717g = null;
            }
            if (i == 4 && i2 == -68) {
                if (Util.isNullOrNil(str)) {
                    str = "error";
                }
                C76879j.m92750u(this, str, getString(C0966R.string.a3h), new C1492v0(this), (DialogInterface.OnClickListener) null);
            } else if (i == 0 && i2 == 0) {
                this.f10715e.mo7991f();
            } else {
                C76701a.makeText((Context) this, (int) C0966R.string.gth, 0).show();
            }
        }
    }
}
