package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetSnsTagListEvent;
import com.tencent.p014mm.autogen.events.PostSnsTagMemberOptionEvent;
import com.tencent.p014mm.autogen.events.SnsFinishBlockUserEvent;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsPermissionReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import ff2.C8020c;
import g62.C75880o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import jr2.C99019x;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11766m0;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import qy2.C77448f0;
import tc0.C48623d;
import te3.C48684a93;
import te3.C48825b93;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI */
public class PermissionSettingUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public MMSwitchBtn f115345d;

    /* renamed from: e */
    public MMSwitchBtn f115346e;

    /* renamed from: f */
    public WeImageView f115347f;

    /* renamed from: g */
    public WeImageView f115348g;

    /* renamed from: h */
    public boolean f115349h = false;

    /* renamed from: i */
    public boolean f115350i = false;

    /* renamed from: j */
    public C89779i0 f115351j = null;

    /* renamed from: n */
    public String f115352n = "";

    /* renamed from: o */
    public C72996z1 f115353o = null;

    /* renamed from: p */
    public boolean f115354p = false;

    /* renamed from: q */
    public boolean f115355q = false;

    /* renamed from: r */
    public long f115356r = 0;

    /* renamed from: s */
    public int f115357s = 0;

    /* renamed from: t */
    public int f115358t = 0;

    /* renamed from: u */
    public long f115359u = System.currentTimeMillis();

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI$f */
    public class C4947f implements C47883u {
        public C4947f() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            PermissionSettingUI.this.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(PermissionSettingUI.this));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(PermissionSettingUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI$a */
    public class C42612a implements MenuItem.OnMenuItemClickListener {
        public C42612a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            PermissionSettingUI.this.hideVKB();
            PermissionSettingUI.this.setResult(-1, new Intent());
            PermissionSettingUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI$b */
    public class C42613b implements View.OnClickListener {
        public C42613b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!PermissionSettingUI.this.f115353o.mo62846A3()) {
                PermissionSettingUI.this.f115353o.mo62910j4();
                C45628s0.m50767c0(PermissionSettingUI.this.f115353o);
                PermissionSettingUI.this.mo66745I7();
                C42599h.xx0(PermissionSettingUI.this.getIntent(), 20, 3, PermissionSettingUI.this.f115352n);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI$c */
    public class C42614c implements View.OnClickListener {
        public C42614c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (PermissionSettingUI.this.f115353o.mo62846A3()) {
                C72996z1 z1Var = PermissionSettingUI.this.f115353o;
                z1Var.setType(z1Var.getType() & -8388609);
                C45628s0.m50767c0(PermissionSettingUI.this.f115353o);
                PermissionSettingUI.this.mo66745I7();
                C42599h.xx0(PermissionSettingUI.this.getIntent(), 20, 2, PermissionSettingUI.this.f115352n);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI$d */
    public class C42615d implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ boolean f115363a;

        public C42615d(boolean z) {
            this.f115363a = z;
        }

        public void onStatusChange(boolean z) {
            Resources resources;
            int i;
            SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
            SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
            aVar.f107768b = true;
            aVar.f107767a = false;
            aVar.f107769c = PermissionSettingUI.this.f115352n;
            snsPermissionNotifyEvent.publish();
            int i2 = 12;
            if (PermissionSettingUI.this.f115353o.mo62943y3()) {
                C45628s0.m50799s0(PermissionSettingUI.this.f115353o);
                Intent intent = PermissionSettingUI.this.getIntent();
                if (!this.f115363a) {
                    i2 = 21;
                }
                C42599h.xx0(intent, i2, 2, PermissionSettingUI.this.f115352n);
            } else {
                Intent intent2 = PermissionSettingUI.this.getIntent();
                if (!this.f115363a) {
                    i2 = 21;
                }
                C42599h.xx0(intent2, i2, 3, PermissionSettingUI.this.f115352n);
                C45628s0.m50783k0(PermissionSettingUI.this.f115353o);
            }
            PermissionSettingUI.this.mo66745I7();
            C8020c cVar = (C8020c) C39818r.f106831a.mo62444c(PermissionSettingUI.this).mo75002a(C8020c.class);
            if (!z) {
                resources = PermissionSettingUI.this.getResources();
                i = C0966R.string.f361227ib1;
            } else {
                resources = PermissionSettingUI.this.getResources();
                i = C0966R.string.f361226ib0;
            }
            cVar.setValue("not_allow_see_sns_permission_cb_key", resources.getString(i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI$e */
    public class C42616e implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ boolean f115365a;

        public C42616e(boolean z) {
            this.f115365a = z;
        }

        public void onStatusChange(boolean z) {
            SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
            SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
            aVar.f107768b = false;
            aVar.f107767a = true;
            String str = PermissionSettingUI.this.f115352n;
            aVar.f107769c = str;
            boolean bD = ((C11766m0) C99019x.m128974f()).mo11654bD(str, 5);
            snsPermissionNotifyEvent.f107766d.f107770d = bD;
            PermissionSettingUI permissionSettingUI = PermissionSettingUI.this;
            String str2 = permissionSettingUI.f115352n;
            int i = 2;
            int i2 = bD ? 2 : 1;
            if (i2 == 1) {
                permissionSettingUI.f115354p = true;
                permissionSettingUI.f115355q = false;
            } else {
                permissionSettingUI.f115354p = false;
                permissionSettingUI.f115355q = false;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(str2);
            PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new PostSnsTagMemberOptionEvent();
            PostSnsTagMemberOptionEvent.C40153a aVar2 = postSnsTagMemberOptionEvent.f107691d;
            aVar2.f107696e = linkedList;
            aVar2.f107692a = i2;
            aVar2.f107693b = 5;
            aVar2.f107694c = permissionSettingUI.f115357s;
            postSnsTagMemberOptionEvent.publish();
            C89779i0 i0Var = permissionSettingUI.f115351j;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            permissionSettingUI.f115351j = C76879j.m92723Q(permissionSettingUI, permissionSettingUI.getString(C0966R.string.a3h), permissionSettingUI.getString(C0966R.string.blp), true, true, (DialogInterface.OnCancelListener) null);
            snsPermissionNotifyEvent.publish();
            Intent intent = PermissionSettingUI.this.getIntent();
            int i3 = this.f115365a ? 13 : 22;
            if (!bD) {
                i = 3;
            }
            C42599h.xx0(intent, i3, i, PermissionSettingUI.this.f115352n);
            ((C8020c) C39818r.f106831a.mo62444c(PermissionSettingUI.this).mo75002a(C8020c.class)).setValue("not_see_sns_permission_tv_key", PermissionSettingUI.this.getResources().getString(!z ? C0966R.string.f361227ib1 : C0966R.string.f361226ib0));
        }
    }

    /* renamed from: H7 */
    public final int mo66744H7() {
        C72996z1 z1Var = this.f115353o;
        if (z1Var != null && !z1Var.mo62846A3()) {
            boolean y3 = this.f115353o.mo62943y3();
            if (((C11766m0) C99019x.m128974f()).mo11654bD(this.f115352n, 5)) {
                y3 |= true;
            }
            boolean z = y3;
            if (!z) {
                return 4;
            }
            return z ? 1 : 0;
        } else if (this.f115353o != null) {
            return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1 ? 6 : 5;
        } else {
            return 0;
        }
    }

    /* renamed from: I7 */
    public final void mo66745I7() {
        int i;
        Resources resources;
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f115352n);
        this.f115353o = z1Var;
        z1Var.setUsername(this.f115352n);
        int i2 = 8;
        this.f115347f.setVisibility(this.f115353o.mo62846A3() ? 0 : 8);
        WeImageView weImageView = this.f115348g;
        if (weImageView != null) {
            weImageView.setVisibility(this.f115353o.mo62846A3() ? 8 : 0);
        }
        View findViewById = findViewById(C0966R.C0970id.hhw);
        int i3 = (!this.f115349h || !this.f115353o.mo62846A3()) ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.hhx);
        if (findViewById2 instanceof TextView) {
            ((TextView) findViewById2).setText(C77448f0.m93394f() ? C0966R.string.hnu : C0966R.string.hns);
        }
        boolean y3 = this.f115353o.mo62943y3();
        boolean bD = ((C11766m0) C99019x.m128974f()).mo11654bD(this.f115352n, 5);
        this.f115345d.setCheck(y3);
        int i4 = this.f115353o.f149500H;
        Log.m105919d("MicroMsg.SnsPermissionUI", "sex:%d", Integer.valueOf(i4));
        TextView textView = (TextView) findViewById(C0966R.C0970id.hhz);
        if (i4 == 1) {
            textView.setText(C0966R.string.jfp);
        } else if (i4 == 2) {
            textView.setText(C0966R.string.jfo);
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.hi8);
        if (i4 == 1) {
            textView2.setText(C0966R.string.jb6);
        } else if (i4 == 2) {
            textView2.setText(C0966R.string.jb5);
        }
        this.f115346e.setCheck(bD);
        ((View) ((View) this.f115348g.getParent()).getParent()).setClickable(!this.f115350i);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.jv7);
        if (this.f115350i) {
            resources = getResources();
            i = C0966R.color.f3563xt;
        } else {
            resources = getResources();
            i = C0966R.color.a7f;
        }
        textView3.setTextColor(resources.getColor(i));
        View findViewById3 = findViewById(C0966R.C0970id.f359349kf2);
        if (this.f115353o.mo62846A3()) {
            i2 = 0;
        }
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i2));
        View view2 = findViewById3;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (findViewById3 instanceof TextView) {
            ((TextView) findViewById3).setText(C77448f0.m93394f() ? C0966R.string.hnx : C0966R.string.hnw);
        }
        if (!C72996z1.m85843n5(this.f115352n) || !"3552365301".equals(this.f115353o.mo73980x2())) {
            View findViewById4 = findViewById(C0966R.C0970id.hhv);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(findViewById4, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View findViewById5 = findViewById(C0966R.C0970id.kf4);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view3 = findViewById5;
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById6 = findViewById(C0966R.C0970id.hhu);
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view4 = findViewById6;
        C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById7 = findViewById(C0966R.C0970id.hhv);
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(0);
        View view5 = findViewById7;
        C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Log.m105918d("MicroMsg.SnsPermissionUI", "dispatchKeyEvent");
        setResult(-1, new Intent());
        finish();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmo;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C8020c.class);
        return hashSet;
    }

    public void initView() {
        if (this.f115353o == null || !C72996z1.m85843n5(this.f115352n) || !"3552365301".equals(this.f115353o.mo73980x2())) {
            setMMTitle((int) C0966R.string.hi_);
        } else {
            setMMTitle((int) C0966R.string.jft);
        }
        setBackBtn(new C42612a());
        this.f115347f = (WeImageView) findViewById(C0966R.C0970id.f359348kf1);
        this.f115348g = (WeImageView) findViewById(C0966R.C0970id.jv5);
        this.f115345d = (MMSwitchBtn) findViewById(C0966R.C0970id.hhu).findViewById(C0966R.C0970id.hhy);
        this.f115346e = (MMSwitchBtn) findViewById(C0966R.C0970id.jrr).findViewById(C0966R.C0970id.hi7);
        ((View) this.f115347f.getParent()).setOnClickListener(new C42613b());
        ((View) ((View) this.f115348g.getParent()).getParent()).setOnClickListener(new C42614c());
        boolean booleanExtra = getIntent().getBooleanExtra("INTENT_SOURCE_FROM_PROFILE_MENU", false);
        this.f115345d.setSwitchListener(new C42615d(booleanExtra));
        this.f115346e.setSwitchListener(new C42616e(booleanExtra));
        boolean z = true;
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMSocialBlackListFlag", 1) != 1) {
            z = false;
        }
        this.f115349h = z;
        if (!z) {
            View findViewById = findViewById(C0966R.C0970id.kf4);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo66745I7();
        C39818r rVar = C39818r.f106831a;
        ((C8020c) rVar.mo62444c(this).mo75002a(C8020c.class)).setValue("not_allow_see_sns_permission_cb_key", !this.f115345d.f220433y ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
        ((C8020c) rVar.mo62444c(this).mo75002a(C8020c.class)).setValue("not_see_sns_permission_tv_key", !this.f115346e.f220433y ? getResources().getString(C0966R.string.f361227ib1) : getResources().getString(C0966R.string.f361226ib0));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1805j.CTRL_INDEX, this);
        this.f115352n = getIntent().getStringExtra("sns_permission_userName");
        this.f115356r = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0);
        int intExtra = getIntent().getIntExtra("sns_permission_block_scene", 0);
        this.f115357s = intExtra;
        Log.m105919d("MicroMsg.SnsPermissionUI", "PermissionSettingUI, scene:%d", Integer.valueOf(intExtra));
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f115352n);
        this.f115353o = z1Var;
        if (z1Var == null) {
            Log.m105921e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", this.f115352n);
            finish();
        }
        this.f115353o.setUsername(this.f115352n);
        initView();
        GetSnsTagListEvent getSnsTagListEvent = new GetSnsTagListEvent();
        getSnsTagListEvent.f9308d.f9309a = 1;
        getSnsTagListEvent.publish();
        this.f115358t = mo66744H7();
        C42599h.xx0(getIntent(), 19, 1, this.f115352n);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1805j.CTRL_INDEX, this);
        long j = this.f115356r;
        if (!(j == 0 || j == -1)) {
            SnsFinishBlockUserEvent snsFinishBlockUserEvent = new SnsFinishBlockUserEvent();
            SnsFinishBlockUserEvent.C40167a aVar = snsFinishBlockUserEvent.f107763d;
            aVar.f107764a = this.f115355q;
            aVar.f107765b = this.f115356r;
            snsFinishBlockUserEvent.publish();
        }
        long currentTicks = Util.currentTicks();
        int H7 = mo66744H7();
        SnsPermissionReportStruct snsPermissionReportStruct = new SnsPermissionReportStruct();
        snsPermissionReportStruct.f108003d = snsPermissionReportStruct.mo86045b("Username", this.f115352n, true);
        snsPermissionReportStruct.f108004e = snsPermissionReportStruct.mo86045b("PublishId", C102236a0.m134765q0(this.f115356r), true);
        snsPermissionReportStruct.f108005f = this.f115358t;
        snsPermissionReportStruct.f108006g = H7;
        snsPermissionReportStruct.f108007h = this.f115357s;
        snsPermissionReportStruct.f108008i = (int) (System.currentTimeMillis() - this.f115359u);
        snsPermissionReportStruct.mo86054n();
        Log.m105919d("MicroMsg.SnsPermissionUI", "report PerMission action [%d %d] cost [%d]", Integer.valueOf(this.f115358t), Integer.valueOf(H7), Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC;
        Log.m105924i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
        if (yVar.getType() == 291) {
            StringBuilder sb = new StringBuilder();
            sb.append("tipDialog ");
            sb.append(this.f115351j == null);
            Log.m105918d("MicroMsg.SnsPermissionUI", sb.toString());
            C89779i0 i0Var = this.f115351j;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f115351j = null;
            }
            mo66745I7();
            if (this.f115354p) {
                this.f115355q = true;
            }
        }
        if (yVar.getType() == 681) {
            C48623d dVar = (C48623d) yVar;
            List<C75880o> list = dVar.f130155f;
            C48684a93 a932 = dVar.f130154e.f130157b.f130159a;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) list;
                if (i3 < arrayList.size()) {
                    if (((C75880o) arrayList.get(i3)).mo58568b() == 72) {
                        C48825b93 b932 = a932.f130391e;
                        if (b932 == null || b932.f131020e.get(i3).intValue() != -3400) {
                            C48825b93 b933 = a932.f130391e;
                            if (b933 != null && b933.f131020e.get(i3).intValue() == 0 && !this.f115353o.mo62846A3()) {
                                C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                            }
                        } else {
                            this.f115350i = true;
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                            this.f115353o.mo62910j4();
                            C45628s0.m50767c0(this.f115353o);
                            String str2 = a932.f130391e.f131021f.get(i3).f145175d;
                            if (!Util.isNullOrNil(str2)) {
                                ((TextView) findViewById(C0966R.C0970id.f359349kf2)).setText(str2);
                            } else {
                                ((TextView) findViewById(C0966R.C0970id.f359349kf2)).getText().toString();
                            }
                            mo66745I7();
                            C77426q qVar = new C77426q(this);
                            qVar.mo107595g(a932.f130391e.f131021f.get(i3).f145175d);
                            qVar.mo107589a(true);
                            qVar.mo107598j(getString(C0966R.string.hn8));
                            qVar.mo107601m(C0966R.string.hn9);
                            qVar.mo107590b(new C4947f());
                            qVar.mo107603o();
                            return;
                        }
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }
}
