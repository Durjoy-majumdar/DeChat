package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetSnsTagListEvent;
import com.tencent.p014mm.autogen.events.PostSnsTagMemberOptionEvent;
import com.tencent.p014mm.autogen.events.SnsFinishBlockUserEvent;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsPermissionReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
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
import g62.C75880o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

/* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 */
public class PermissionSettingUI2 extends MMActivity implements C11385n {

    /* renamed from: d */
    public MMSwitchBtn f115367d;

    /* renamed from: e */
    public MMSwitchBtn f115368e;

    /* renamed from: f */
    public WeImageView f115369f;

    /* renamed from: g */
    public WeImageView f115370g;

    /* renamed from: h */
    public TextView f115371h;

    /* renamed from: i */
    public boolean f115372i = false;

    /* renamed from: j */
    public boolean f115373j = false;

    /* renamed from: n */
    public C89779i0 f115374n = null;

    /* renamed from: o */
    public String f115375o = "";

    /* renamed from: p */
    public C72996z1 f115376p = null;

    /* renamed from: q */
    public boolean f115377q = false;

    /* renamed from: r */
    public boolean f115378r = false;

    /* renamed from: s */
    public long f115379s = 0;

    /* renamed from: t */
    public int f115380t = 0;

    /* renamed from: u */
    public int f115381u = 0;

    /* renamed from: v */
    public long f115382v = System.currentTimeMillis();

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2$a */
    public class C4948a implements MenuItem.OnMenuItemClickListener {
        public C4948a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            PermissionSettingUI2.this.hideVKB();
            PermissionSettingUI2.this.setResult(-1, new Intent());
            PermissionSettingUI2.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2$f */
    public class C4949f implements View.OnClickListener {
        public C4949f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View findViewById = PermissionSettingUI2.this.findViewById(C0966R.C0970id.hhu);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = PermissionSettingUI2.this.findViewById(C0966R.C0970id.jrr);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = PermissionSettingUI2.this.findViewById(C0966R.C0970id.c9c);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view4 = findViewById3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C42599h.xx0(PermissionSettingUI2.this.getIntent(), 23, 1, PermissionSettingUI2.this.f115375o);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2$g */
    public class C4950g implements C47883u {
        public C4950g() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            PermissionSettingUI2.this.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(PermissionSettingUI2.this));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(PermissionSettingUI2.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2$b */
    public class C42617b implements View.OnClickListener {
        public C42617b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!PermissionSettingUI2.this.f115376p.mo62846A3()) {
                PermissionSettingUI2.this.f115376p.mo62910j4();
                C45628s0.m50767c0(PermissionSettingUI2.this.f115376p);
                PermissionSettingUI2.this.mo66750I7();
                C42599h.xx0(PermissionSettingUI2.this.getIntent(), 20, 3, PermissionSettingUI2.this.f115375o);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2$c */
    public class C42618c implements View.OnClickListener {
        public C42618c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (PermissionSettingUI2.this.f115376p.mo62846A3()) {
                C72996z1 z1Var = PermissionSettingUI2.this.f115376p;
                z1Var.setType(z1Var.getType() & -8388609);
                C45628s0.m50767c0(PermissionSettingUI2.this.f115376p);
                PermissionSettingUI2.this.mo66750I7();
                C42599h.xx0(PermissionSettingUI2.this.getIntent(), 20, 2, PermissionSettingUI2.this.f115375o);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2$d */
    public class C42619d implements MMSwitchBtn.C7041b {
        public C42619d() {
        }

        public void onStatusChange(boolean z) {
            SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
            SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
            aVar.f107768b = true;
            aVar.f107767a = false;
            aVar.f107769c = PermissionSettingUI2.this.f115375o;
            snsPermissionNotifyEvent.publish();
            if (PermissionSettingUI2.this.f115376p.mo62943y3()) {
                C45628s0.m50799s0(PermissionSettingUI2.this.f115376p);
                C42599h.xx0(PermissionSettingUI2.this.getIntent(), 21, 2, PermissionSettingUI2.this.f115375o);
            } else {
                C42599h.xx0(PermissionSettingUI2.this.getIntent(), 21, 3, PermissionSettingUI2.this.f115375o);
                C45628s0.m50783k0(PermissionSettingUI2.this.f115376p);
            }
            PermissionSettingUI2.this.mo66750I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2$e */
    public class C42620e implements MMSwitchBtn.C7041b {
        public C42620e() {
        }

        public void onStatusChange(boolean z) {
            SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
            SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
            aVar.f107768b = false;
            aVar.f107767a = true;
            String str = PermissionSettingUI2.this.f115375o;
            aVar.f107769c = str;
            boolean bD = ((C11766m0) C99019x.m128974f()).mo11654bD(str, 5);
            snsPermissionNotifyEvent.f107766d.f107770d = bD;
            PermissionSettingUI2 permissionSettingUI2 = PermissionSettingUI2.this;
            String str2 = permissionSettingUI2.f115375o;
            int i = 2;
            int i2 = bD ? 2 : 1;
            if (i2 == 1) {
                permissionSettingUI2.f115377q = true;
                permissionSettingUI2.f115378r = false;
            } else {
                permissionSettingUI2.f115377q = false;
                permissionSettingUI2.f115378r = false;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(str2);
            PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new PostSnsTagMemberOptionEvent();
            PostSnsTagMemberOptionEvent.C40153a aVar2 = postSnsTagMemberOptionEvent.f107691d;
            aVar2.f107696e = linkedList;
            aVar2.f107692a = i2;
            aVar2.f107693b = 5;
            aVar2.f107694c = permissionSettingUI2.f115380t;
            postSnsTagMemberOptionEvent.publish();
            permissionSettingUI2.f115374n = C76879j.m92723Q(permissionSettingUI2, permissionSettingUI2.getString(C0966R.string.a3h), permissionSettingUI2.getString(C0966R.string.blp), true, true, (DialogInterface.OnCancelListener) null);
            snsPermissionNotifyEvent.publish();
            Intent intent = PermissionSettingUI2.this.getIntent();
            if (!bD) {
                i = 3;
            }
            C42599h.xx0(intent, 22, i, PermissionSettingUI2.this.f115375o);
        }
    }

    /* renamed from: H7 */
    public final int mo66749H7() {
        C72996z1 z1Var = this.f115376p;
        if (z1Var != null && !z1Var.mo62846A3()) {
            boolean y3 = this.f115376p.mo62943y3();
            if (((C11766m0) C99019x.m128974f()).mo11654bD(this.f115375o, 5)) {
                y3 |= true;
            }
            boolean z = y3;
            if (!z) {
                return 4;
            }
            return z ? 1 : 0;
        } else if (this.f115376p != null) {
            return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1 ? 6 : 5;
        } else {
            return 0;
        }
    }

    /* renamed from: I7 */
    public final void mo66750I7() {
        int i;
        Resources resources;
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f115375o);
        this.f115376p = z1Var;
        z1Var.setUsername(this.f115375o);
        int i2 = 8;
        this.f115369f.setVisibility(this.f115376p.mo62846A3() ? 0 : 8);
        this.f115370g.setVisibility(this.f115376p.mo62846A3() ? 8 : 0);
        View findViewById = findViewById(C0966R.C0970id.hhw);
        int i3 = (!this.f115372i || !this.f115376p.mo62846A3()) ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = this.f115371h;
        if (this.f115376p.mo62846A3()) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        boolean y3 = this.f115376p.mo62943y3();
        boolean bD = ((C11766m0) C99019x.m128974f()).mo11654bD(this.f115375o, 5);
        this.f115367d.setCheck(y3);
        int i4 = this.f115376p.f149500H;
        Log.m105919d("MicroMsg.SnsPermissionUI2", "sex:%d", Integer.valueOf(i4));
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.hhz);
        if (i4 == 1) {
            textView2.setText(C0966R.string.jfp);
        } else if (i4 == 2) {
            textView2.setText(C0966R.string.jfo);
        }
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.hi8);
        if (i4 == 1) {
            textView3.setText(C0966R.string.jb6);
        } else if (i4 == 2) {
            textView3.setText(C0966R.string.jb5);
        }
        this.f115368e.setCheck(bD);
        ((View) ((View) this.f115370g.getParent()).getParent()).setClickable(!this.f115373j);
        TextView textView4 = (TextView) findViewById(C0966R.C0970id.jv7);
        if (this.f115373j) {
            resources = getResources();
            i = C0966R.color.f3563xt;
        } else {
            resources = getResources();
            i = C0966R.color.a7f;
        }
        textView4.setTextColor(resources.getColor(i));
        if (!C72996z1.m85843n5(this.f115375o) || !"3552365301".equals(this.f115376p.mo73980x2())) {
            View findViewById2 = findViewById(C0966R.C0970id.hhv);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View findViewById3 = findViewById(C0966R.C0970id.kf4);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view2 = findViewById3;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = findViewById(C0966R.C0970id.hhu);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view3 = findViewById4;
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById5 = findViewById(C0966R.C0970id.hhv);
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        View view4 = findViewById5;
        C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Log.m105918d("MicroMsg.SnsPermissionUI2", "dispatchKeyEvent");
        setResult(-1, new Intent());
        finish();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmp;
    }

    public void initView() {
        if (this.f115376p == null || !C72996z1.m85843n5(this.f115375o) || !"3552365301".equals(this.f115376p.mo73980x2())) {
            setMMTitle((int) C0966R.string.hi_);
        } else {
            setMMTitle((int) C0966R.string.jft);
        }
        setBackBtn(new C4948a());
        this.f115369f = (WeImageView) findViewById(C0966R.C0970id.f359348kf1);
        this.f115370g = (WeImageView) findViewById(C0966R.C0970id.jv5);
        this.f115367d = (MMSwitchBtn) findViewById(C0966R.C0970id.hhu).findViewById(C0966R.C0970id.hhy);
        this.f115368e = (MMSwitchBtn) findViewById(C0966R.C0970id.jrr).findViewById(C0966R.C0970id.hi7);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359349kf2);
        this.f115371h = textView;
        if (textView instanceof TextView) {
            textView.setText(C77448f0.m93394f() ? C0966R.string.hnx : C0966R.string.hnw);
        }
        ((View) this.f115369f.getParent()).setOnClickListener(new C42617b());
        ((View) ((View) this.f115370g.getParent()).getParent()).setOnClickListener(new C42618c());
        this.f115367d.setSwitchListener(new C42619d());
        this.f115368e.setSwitchListener(new C42620e());
        findViewById(C0966R.C0970id.f358773h02).setOnClickListener(new C4949f());
        boolean z = true;
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMSocialBlackListFlag", 1) != 1) {
            z = false;
        }
        this.f115372i = z;
        if (!z) {
            View findViewById = findViewById(C0966R.C0970id.kf4);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo66750I7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1805j.CTRL_INDEX, this);
        this.f115375o = getIntent().getStringExtra("sns_permission_userName");
        this.f115379s = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0);
        int intExtra = getIntent().getIntExtra("sns_permission_block_scene", 0);
        this.f115380t = intExtra;
        Log.m105919d("MicroMsg.SnsPermissionUI2", "PermissionSettingUI, scene:%d", Integer.valueOf(intExtra));
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f115375o);
        this.f115376p = z1Var;
        if (z1Var == null) {
            Log.m105921e("MicroMsg.SnsPermissionUI2", "the error cause by get contact by %s", this.f115375o);
            finish();
        }
        this.f115376p.setUsername(this.f115375o);
        initView();
        GetSnsTagListEvent getSnsTagListEvent = new GetSnsTagListEvent();
        getSnsTagListEvent.f9308d.f9309a = 1;
        getSnsTagListEvent.publish();
        this.f115381u = mo66749H7();
        C42599h.xx0(getIntent(), 19, 1, this.f115375o);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1805j.CTRL_INDEX, this);
        long j = this.f115379s;
        if (!(j == 0 || j == -1)) {
            SnsFinishBlockUserEvent snsFinishBlockUserEvent = new SnsFinishBlockUserEvent();
            SnsFinishBlockUserEvent.C40167a aVar = snsFinishBlockUserEvent.f107763d;
            aVar.f107764a = this.f115378r;
            aVar.f107765b = this.f115379s;
            snsFinishBlockUserEvent.publish();
        }
        long currentTicks = Util.currentTicks();
        int H7 = mo66749H7();
        SnsPermissionReportStruct snsPermissionReportStruct = new SnsPermissionReportStruct();
        snsPermissionReportStruct.f108003d = snsPermissionReportStruct.mo86045b("Username", this.f115375o, true);
        snsPermissionReportStruct.f108004e = snsPermissionReportStruct.mo86045b("PublishId", C102236a0.m134765q0(this.f115379s), true);
        snsPermissionReportStruct.f108005f = this.f115381u;
        snsPermissionReportStruct.f108006g = H7;
        snsPermissionReportStruct.f108007h = this.f115380t;
        snsPermissionReportStruct.f108008i = (int) (System.currentTimeMillis() - this.f115382v);
        snsPermissionReportStruct.mo86054n();
        Log.m105919d("MicroMsg.SnsPermissionUI2", "report PerMission action [%d %d] cost [%d]", Integer.valueOf(this.f115381u), Integer.valueOf(H7), Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC;
        Log.m105924i("MicroMsg.SnsPermissionUI2", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
        if (yVar.getType() == 291) {
            StringBuilder sb = new StringBuilder();
            sb.append("tipDialog ");
            sb.append(this.f115374n == null);
            Log.m105918d("MicroMsg.SnsPermissionUI2", sb.toString());
            C89779i0 i0Var = this.f115374n;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f115374n = null;
            }
            mo66750I7();
            if (this.f115377q) {
                this.f115378r = true;
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
                            if (b933 != null && b933.f131020e.get(i3).intValue() == 0 && !this.f115376p.mo62846A3()) {
                                C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                            }
                        } else {
                            this.f115373j = true;
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                            this.f115376p.mo62910j4();
                            C45628s0.m50767c0(this.f115376p);
                            String str2 = a932.f130391e.f131021f.get(i3).f145175d;
                            if (!Util.isNullOrNil(str2)) {
                                this.f115371h.setText(str2);
                            } else {
                                ((TextView) findViewById(C0966R.C0970id.f359349kf2)).getText().toString();
                            }
                            mo66750I7();
                            C77426q qVar = new C77426q(this);
                            qVar.mo107595g(a932.f130391e.f131021f.get(i3).f145175d);
                            qVar.mo107589a(true);
                            qVar.mo107598j(getString(C0966R.string.hn8));
                            qVar.mo107601m(C0966R.string.hn9);
                            qVar.mo107590b(new C4950g());
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
