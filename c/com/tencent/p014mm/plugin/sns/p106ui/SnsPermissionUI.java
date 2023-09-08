package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsFinishBlockUserEvent;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsPermissionReportStruct;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceFooterCategory;
import com.tencent.p014mm.plugin.sns.model.C43040m0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11765l0;
import p214om.C11502f;
import pj3.C47511g;
import qo3.C89779i0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsPermissionUI */
public class SnsPermissionUI extends MMPreference implements C11385n {

    /* renamed from: r */
    public static final /* synthetic */ int f116617r = 0;

    /* renamed from: d */
    public C89779i0 f116618d = null;

    /* renamed from: e */
    public String f116619e = "";

    /* renamed from: f */
    public C47511g f116620f;

    /* renamed from: g */
    public C72996z1 f116621g = null;

    /* renamed from: h */
    public boolean f116622h = false;

    /* renamed from: i */
    public boolean f116623i = false;

    /* renamed from: j */
    public long f116624j = 0;

    /* renamed from: n */
    public int f116625n = 0;

    /* renamed from: o */
    public boolean f116626o = false;

    /* renamed from: p */
    public boolean f116627p = false;

    /* renamed from: q */
    public int f116628q = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsPermissionUI$a */
    public class C43090a implements MenuItem.OnMenuItemClickListener {
        public C43090a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$1");
            SnsPermissionUI.this.hideVKB();
            SnsPermissionUI.this.setResult(-1, new Intent());
            SnsPermissionUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$1");
            return true;
        }
    }

    /* renamed from: H7 */
    public final int mo67293H7() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("checkActionCode", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        C72996z1 z1Var = this.f116621g;
        if (z1Var != null) {
            z = z1Var.mo62943y3();
            if (mo67294I7(this.f116619e, 5)) {
                z |= true;
            }
        } else {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("checkActionCode", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return z ? 1 : 0;
    }

    /* renamed from: I7 */
    public final boolean mo67294I7(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        C11765l0 qq = C94866e1.ey0().mo11657qq(j);
        if (Util.isNullOrNil(qq.field_memberList)) {
            SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return false;
        }
        boolean contains = Util.stringsToList(qq.field_memberList.split(",")).contains(str);
        SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return contains;
    }

    /* renamed from: J7 */
    public final void mo67295J7() {
        SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f116619e);
        this.f116621g = z1Var;
        z1Var.setUsername(this.f116619e);
        boolean y3 = this.f116621g.mo62943y3();
        boolean I7 = mo67294I7(this.f116619e, 5);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f116620f.mo72519a("sns_outside_permiss");
        checkBoxPreference.mo6805K(y3);
        int i = this.f116621g.f149500H;
        boolean z = false;
        Log.m105919d("MicroMsg.SnsPermissionUI", "sex:%d", Integer.valueOf(i));
        if (i == 1) {
            checkBoxPreference.mo69923G(C0966R.string.jfp);
        } else if (i == 2) {
            checkBoxPreference.mo69923G(C0966R.string.jfo);
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f116620f.mo72519a("sns_black_permiss");
        if (i == 1) {
            checkBoxPreference2.mo69923G(C0966R.string.jb6);
        } else if (i == 2) {
            checkBoxPreference2.mo69923G(C0966R.string.jb5);
        }
        checkBoxPreference2.mo6805K(I7);
        if (!this.f116621g.mo62927s3()) {
            this.f116620f.mo72531o("sns_black_permiss");
        }
        PreferenceFooterCategory preferenceFooterCategory = (PreferenceFooterCategory) this.f116620f.mo72519a("sns_openim_desc_footer");
        if (C72996z1.m85843n5(this.f116619e) && "3552365301".equals(this.f116621g.mo73980x2())) {
            z = true;
        }
        this.f116627p = z;
        if (z) {
            this.f116620f.mo72529n("sns_outside_permiss", true);
            preferenceFooterCategory.mo7740D(C0966R.string.jfq);
        } else {
            this.f116620f.mo72529n("sns_openim_desc_footer", true);
        }
        this.f116620f.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.SnsPermissionUI", "dispatchKeyEvent");
            setResult(-1, new Intent());
            finish();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return dispatchKeyEvent;
    }

    public int getResourceId() {
        SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return C0966R.xml.f8976cw;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        this.f116620f = getPreferenceScreen();
        if (this.f116621g == null || !C72996z1.m85843n5(this.f116619e) || !"3552365301".equals(this.f116621g.mo73980x2())) {
            setMMTitle((int) C0966R.string.jfs);
        } else {
            setMMTitle((int) C0966R.string.jft);
        }
        setBackBtn(new C43090a());
        this.f116626o = mo67294I7(this.f116619e, 5);
        mo67295J7();
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(291, this);
        this.f116619e = getIntent().getStringExtra("sns_permission_userName");
        getIntent().getBooleanExtra("sns_permission_anim", false);
        this.f116624j = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0);
        int intExtra = getIntent().getIntExtra("sns_permission_block_scene", 0);
        this.f116625n = intExtra;
        Log.m105919d("MicroMsg.SnsPermissionUI", "SnsPermissionUI, scene:%d", Integer.valueOf(intExtra));
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f116619e);
        this.f116621g = z1Var;
        if (z1Var == null) {
            Log.m105921e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", this.f116619e);
            finish();
        }
        this.f116621g.setUsername(this.f116619e);
        initView();
        this.f116628q = mo67293H7();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        super.onDestroy();
        SnsMethodCalculate.markStartTimeMs("doSync", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        SnsMethodCalculate.markEndTimeMs("doSync", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(291, this);
        long j = this.f116624j;
        if (!(j == 0 || j == -1)) {
            SnsFinishBlockUserEvent snsFinishBlockUserEvent = new SnsFinishBlockUserEvent();
            SnsFinishBlockUserEvent.C40167a aVar = snsFinishBlockUserEvent.f107763d;
            aVar.f107764a = this.f116623i;
            aVar.f107765b = this.f116624j;
            snsFinishBlockUserEvent.publish();
        }
        SnsMethodCalculate.markStartTimeMs("reportPerMission", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        long currentTicks = Util.currentTicks();
        int H7 = mo67293H7();
        SnsPermissionReportStruct snsPermissionReportStruct = new SnsPermissionReportStruct();
        snsPermissionReportStruct.f108003d = snsPermissionReportStruct.mo86045b("Username", this.f116619e, true);
        snsPermissionReportStruct.f108004e = snsPermissionReportStruct.mo86045b("PublishId", C102236a0.m134765q0(this.f116624j), true);
        snsPermissionReportStruct.f108005f = this.f116628q;
        snsPermissionReportStruct.f108006g = H7;
        snsPermissionReportStruct.f108007h = 5;
        snsPermissionReportStruct.mo86054n();
        Log.m105919d("MicroMsg.SnsPermissionUI", "report PerMission action [%d %d] cost [%d]", Integer.valueOf(this.f116628q), Integer.valueOf(H7), Long.valueOf(Util.ticksToNow(currentTicks)));
        SnsMethodCalculate.markEndTimeMs("reportPerMission", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (this.f116627p) {
            boolean I7 = mo67294I7(this.f116619e, 5);
            boolean z = this.f116626o;
            if (z && !I7) {
                SnsReportHelper.f275506m0.mo131357R(this.f116619e, 2, 2);
            } else if (z || !I7) {
                SnsReportHelper.f275506m0.mo131357R(this.f116619e, 2, 1);
            } else {
                SnsReportHelper.f275506m0.mo131357R(this.f116619e, 2, 3);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        String str = preference.f121285r;
        if (str.equals("sns_outside_permiss")) {
            SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
            SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
            aVar.f107768b = true;
            aVar.f107767a = false;
            aVar.f107769c = this.f116619e;
            snsPermissionNotifyEvent.publish();
            if (this.f116621g.mo62943y3()) {
                C45628s0.m50799s0(this.f116621g);
            } else {
                C45628s0.m50783k0(this.f116621g);
            }
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return true;
        } else if (str.equals("sns_black_permiss")) {
            SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new SnsPermissionNotifyEvent();
            SnsPermissionNotifyEvent.C40168a aVar2 = snsPermissionNotifyEvent2.f107766d;
            aVar2.f107768b = false;
            aVar2.f107767a = true;
            aVar2.f107769c = this.f116619e;
            snsPermissionNotifyEvent2.publish();
            boolean I7 = mo67294I7(this.f116619e, 5);
            String str2 = this.f116619e;
            int i = I7 ? 2 : 1;
            SnsMethodCalculate.markStartTimeMs("updateTagIdList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            if (i == 1) {
                this.f116622h = true;
                this.f116623i = false;
            } else {
                this.f116622h = false;
                this.f116623i = false;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(str2);
            C43040m0 m0Var = new C43040m0(i, 5, "", linkedList.size(), linkedList, this.f116625n);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(m0Var);
            this.f116618d = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.jig), true, true, new C43132o5(this, m0Var));
            SnsMethodCalculate.markEndTimeMs("updateTagIdList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return false;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        Log.m105924i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
        if (yVar.getType() == 291) {
            StringBuilder sb = new StringBuilder();
            sb.append("tipDialog ");
            sb.append(this.f116618d == null);
            Log.m105918d("MicroMsg.SnsPermissionUI", sb.toString());
            C89779i0 i0Var = this.f116618d;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f116618d = null;
            }
            mo67295J7();
            if (this.f116622h) {
                this.f116623i = true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }
}
