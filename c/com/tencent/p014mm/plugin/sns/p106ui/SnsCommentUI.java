package com.tencent.p014mm.plugin.sns.p106ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import jo3.C76431c;
import kr2.C76634a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p645pj.C77092c;
import qn3.C77382c;
import qo3.C89779i0;
import ro3.C110588j;
import u73.C101980n;

@C88989a(17)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentUI */
public class SnsCommentUI extends MMActivity implements C11385n {

    /* renamed from: o */
    public static final /* synthetic */ int f206118o = 0;

    /* renamed from: d */
    public C74974a f206119d;

    /* renamed from: e */
    public C89779i0 f206120e = null;

    /* renamed from: f */
    public int f206121f;

    /* renamed from: g */
    public int f206122g = 0;

    /* renamed from: h */
    public int f206123h;

    /* renamed from: i */
    public boolean f206124i = false;

    /* renamed from: j */
    public boolean f206125j = false;

    /* renamed from: n */
    public SnsInfo f206126n;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentUI$a */
    public class C71208a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentUI$a$a */
        public class C71209a implements C77382c.C77383a {
            public C71209a() {
            }

            /* renamed from: L0 */
            public void mo4083L0(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
                C76879j.m92738i(SnsCommentUI.this, C0966R.string.jjy, C0966R.string.jjz);
                SnsMethodCalculate.markEndTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
            }

            /* renamed from: L3 */
            public void mo4084L3(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
                SnsMethodCalculate.markEndTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
            }

            /* renamed from: P4 */
            public void mo4086P4(String str) {
                String str2;
                SnsMethodCalculate.markStartTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
                String trim = SnsCommentUI.m83635H7(SnsCommentUI.this).getText().toString().trim();
                SnsCommentUI.m83635H7(SnsCommentUI.this).setText("");
                if (trim.length() > 0) {
                    SnsCommentUI snsCommentUI = SnsCommentUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                    int i = snsCommentUI.f206122g;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                    if (i == 0) {
                        SnsCommentUI.this.hideVKB();
                        SnsCommentUI snsCommentUI2 = SnsCommentUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                        snsCommentUI2.getClass();
                        SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                        SnsInfo LL = C94866e1.Yx0().mo139800LL(snsCommentUI2.f206121f);
                        if (LL == null) {
                            SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                            str2 = "access$200";
                        } else {
                            snsCommentUI2.f206124i = true;
                            if (LL.isExtFlag()) {
                                C5431p1.C5432a.m5341l(LL, 2, trim, 0, "", false, snsCommentUI2.f206123h);
                            } else {
                                C5431p1.C5432a.m5343n(LL.field_userName, 3, trim, LL, snsCommentUI2.f206123h);
                            }
                            snsCommentUI2.hideVKB();
                            String string = snsCommentUI2.getString(C0966R.string.a3h);
                            String str3 = string;
                            str2 = "access$200";
                            snsCommentUI2.f206120e = C76879j.m92723Q(snsCommentUI2, str3, snsCommentUI2.getString(C0966R.string.a2w), true, true, new C71248j4(snsCommentUI2));
                            SnsReportHelper.f275506m0.mo131361V().f265947r = 2;
                            SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                        }
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                    } else if (i == 1) {
                        SnsCommentUI.this.hideVKB();
                        SnsCommentUI snsCommentUI3 = SnsCommentUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                        snsCommentUI3.getClass();
                        SnsMethodCalculate.markStartTimeMs("sendSayHi", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                        if (snsCommentUI3.isFinishing()) {
                            SnsMethodCalculate.markEndTimeMs("sendSayHi", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                        } else {
                            C75592q0.m90789s();
                            C94945s2 s2Var = new C94945s2(2, snsCommentUI3.getContext());
                            s2Var.mo131260q(trim);
                            if (snsCommentUI3.f206119d.getPasterLen() > C76634a.f224255a) {
                                s2Var.mo131261r(1, 2);
                            }
                            s2Var.mo131252i();
                            snsCommentUI3.setResult(-1);
                            snsCommentUI3.finish();
                            SnsMethodCalculate.markEndTimeMs("sendSayHi", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                        }
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                    } else if (i == 2) {
                        SnsCommentUI.this.hideVKB();
                        SnsCommentUI.this.getIntent().getLongExtra("sns_id", 0);
                        SnsCommentUI.this.getIntent().getLongExtra("action_st_time", 0);
                        Util.nullAs(SnsCommentUI.this.getIntent().getStringExtra("sns_uxinfo"), "");
                        Util.nullAs(SnsCommentUI.this.getIntent().getStringExtra("sns_actionresult"), "");
                        System.currentTimeMillis();
                        C94866e1.Qx0().getClass();
                        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
                        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
                        SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
                        return;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
            }
        }

        public C71208a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2");
            SnsCommentUI snsCommentUI = SnsCommentUI.this;
            int i = SnsCommentUI.f206118o;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            int i2 = snsCommentUI.f206122g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            if (i2 == 0) {
                C77092c.m93049k();
            }
            SnsCommentUI snsCommentUI2 = SnsCommentUI.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            int i3 = snsCommentUI2.f206122g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            int l = i3 == 2 ? 200 : C77092c.m93050l();
            C76431c g = C76431c.m91853g(SnsCommentUI.m83635H7(SnsCommentUI.this));
            g.f225611e = 0;
            g.f225610d = l;
            g.f225607a = true;
            g.mo107499d(new C71209a());
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentUI$b */
    public class C71210b implements MenuItem.OnMenuItemClickListener {
        public C71210b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$3");
            SnsCommentUI.this.hideVKB();
            SnsCommentUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$3");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentUI$c */
    public class C71211c implements TextWatcher {
        public C71211c() {
        }

        public void afterTextChanged(Editable editable) {
            SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
            SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
            SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
            if (SnsCommentUI.m83635H7(SnsCommentUI.this).getText().toString().trim().length() > 0) {
                SnsCommentUI.this.enableOptionMenu(true);
            } else {
                SnsCommentUI.this.enableOptionMenu(false);
            }
            SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ C74974a m83635H7(SnsCommentUI snsCommentUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        C74974a aVar = snsCommentUI.f206119d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return aVar;
    }

    public void finish() {
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.finish();
        if (this.f206125j || this.f206122g != 2) {
            SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            return;
        }
        getIntent().getLongExtra("sns_id", 0);
        getIntent().getLongExtra("action_st_time", 0);
        Util.nullAs(getIntent().getStringExtra("sns_uxinfo"), "");
        Util.nullAs(getIntent().getStringExtra("sns_actionresult"), "");
        System.currentTimeMillis();
        C94866e1.Qx0().getClass();
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return C0966R.C0971layout.c2l;
    }

    public void initView() {
        Class cls = C101980n.class;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        C74974a aVar = (C74974a) findViewById(C0966R.C0970id.br8);
        this.f206119d = aVar;
        aVar.mo104239a(((C101980n) C86312j.m106911c(cls)).Kr0());
        this.f206119d.mo104256m();
        SnsMethodCalculate.markStartTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        this.f206119d.mo104244e(((C101980n) C86312j.m106911c(cls)).mo134685Hw(), LocaleUtil.getCurrentLanguage(getContext()), new C71251k4(this), (C110588j.C77559a.C77560a) null);
        this.f206119d.addTextChangedListener(new C71254l4(this));
        SnsMethodCalculate.markEndTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        addTextOptionMenu(0, getString(C0966R.string.a2s), new C71208a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        int i = this.f206122g;
        if (i == 0) {
            setMMTitle((int) C0966R.string.jbi);
        } else if (i == 1) {
            setMMTitle((int) C0966R.string.jk9);
            C86709a0.m107528h();
            String nullAs = Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(68408, ""), "");
            C86709a0.m107528h();
            this.f206119d.setPasterLen(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(7489, 0), 0));
            this.f206119d.append(Util.nullAs(nullAs, ""));
            if (nullAs == null || nullAs.length() <= 0) {
                enableOptionMenu(false);
            } else {
                enableOptionMenu(true);
            }
        } else if (i == 2) {
            setMMTitle((int) C0966R.string.j9b);
            enableOptionMenu(false);
        }
        setBackBtn(new C71210b());
        this.f206119d.addTextChangedListener(new C71211c());
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        C85875k4.m106195m0(this);
        super.onCreate(bundle);
        this.f206121f = getIntent().getIntExtra("sns_comment_localId", 0);
        this.f206122g = getIntent().getIntExtra("sns_comment_type", 0);
        this.f206123h = getIntent().getIntExtra("sns_source", 0);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(213, this);
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onDestroy();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(213, this);
        this.f206119d.destroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        if (i == 4) {
            hideVKB();
            finish();
            SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            return true;
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return onKeyDown;
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onPause();
        C74974a aVar = this.f206119d;
        if (aVar != null) {
            String trim = aVar.getText().toString().trim();
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(68408, trim);
            if (!Util.isNullOrNil(trim)) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(7489, Integer.valueOf(this.f206119d.getPasterLen()));
            } else {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(7489, 0);
            }
        }
        this.f206119d.onPause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onResume();
        showVKB();
        this.f206119d.mo104239a(((C101980n) C86312j.m106911c(C101980n.class)).Kr0());
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        Log.m105924i("MicroMsg.SnsCommentUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " type = " + yVar.getType() + " @" + hashCode());
        C89779i0 i0Var = this.f206120e;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (yVar.getType() == 213 && this.f206124i) {
            finish();
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }
}
