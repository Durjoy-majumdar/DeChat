package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WechatWorkSnsStruct;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.tools.MaskImageButton;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C11184p0;
import p244tt.C14088e;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.d */
public class C96019d implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280420d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.d$a */
    public class C96020a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ SnsInfo f280421d;

        public C96020a(SnsInfo snsInfo) {
            this.f280421d = snsInfo;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            SnsInfo snsInfo;
            SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$1");
            C86709a0.m107528h();
            C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(this.f280421d.getUserName());
            boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMSocialBlackListFlag", 1) == 1;
            if (H3 == null || (snsInfo = this.f280421d) == null || !C72996z1.m85843n5(snsInfo.getUserName()) || !"3552365301".equals(H3.mo73980x2())) {
                Activity j = TimelineClickListener.m122988j(C96019d.this.f280420d);
                contextMenu.add(0, 0, 0, z ? j.getString(C0966R.string.bos) : j.getString(C0966R.string.bot));
            } else {
                Activity j2 = TimelineClickListener.m122988j(C96019d.this.f280420d);
                contextMenu.add(0, 0, 0, z ? j2.getString(C0966R.string.bos) : j2.getString(C0966R.string.bou));
            }
            contextMenu.add(1, 1, 0, TimelineClickListener.m122988j(C96019d.this.f280420d).getString(C0966R.string.jip));
            SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.d$b */
    public class C96021b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ SnsInfo f280423d;

        /* renamed from: e */
        public final /* synthetic */ String f280424e;

        /* renamed from: f */
        public final /* synthetic */ String f280425f;

        /* renamed from: com.tencent.mm.plugin.sns.ui.listener.d$b$a */
        public class C96022a implements C14088e.C14090b {

            /* renamed from: a */
            public final /* synthetic */ SnsInfo f280427a;

            public C96022a(SnsInfo snsInfo) {
                this.f280427a = snsInfo;
            }

            /* renamed from: a */
            public void mo1717a() {
                SnsMethodCalculate.markStartTimeMs("success", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
                Log.m105924i("MicroMsg.TimelineClickListener", "OpenLiteApp success");
                SnsMethodCalculate.markEndTimeMs("success", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
            }

            /* renamed from: b */
            public void mo1718b() {
                SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
                Intent intent = new Intent();
                SnsInfo snsInfo = this.f280427a;
                intent.putExtra("k_expose_msg_id", snsInfo == null ? 0 : snsInfo.field_snsId);
                SnsInfo snsInfo2 = this.f280427a;
                intent.putExtra("k_username", snsInfo2 == null ? "" : snsInfo2.field_userName);
                intent.putExtra("showShare", false);
                intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{33}));
                C88144b.m109791i(TimelineClickListener.m122988j(C96019d.this.f280420d), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
            }
        }

        public C96021b(SnsInfo snsInfo, String str, String str2) {
            this.f280423d = snsInfo;
            this.f280424e = str;
            this.f280425f = str2;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsInfo snsInfo;
            Class cls = C14088e.class;
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                Intent intent = new Intent();
                SnsInfo snsInfo2 = this.f280423d;
                intent.putExtra("sns_permission_snsinfo_svr_id", snsInfo2 == null ? 0 : snsInfo2.field_snsId);
                intent.putExtra("sns_permission_userName", this.f280424e);
                intent.putExtra("sns_permission_anim", true);
                intent.putExtra("sns_permission_block_scene", 5);
                C88144b.m109795m(TimelineClickListener.m122988j(C96019d.this.f280420d), Scopes.PROFILE, ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 0) == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
            } else if (itemId == 1) {
                SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f280425f);
                if (DN == null) {
                    Log.m105924i("MicroMsg.TimelineClickListener", "error get snsinfo by id " + this.f280425f);
                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
                    return;
                }
                Log.m105924i("MicroMsg.TimelineClickListener", "expose id " + DN.getSnsId() + " " + DN.field_userName);
                if (((C14088e) C86312j.m106911c(cls)).mo13530uu("wxalited4df4810a40b1d9ddc0cbea44d263fd9")) {
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = new Bundle();
                    bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                    bundle.putString(SearchIntents.EXTRA_QUERY, "{\"scene\":33}");
                    bundle2.putString("k_username", DN.field_userName);
                    bundle2.putLong("k_expose_msg_id", DN.field_snsId);
                    bundle.putBundle("extraData", bundle2);
                    Log.m105924i("MicroMsg.TimelineClickListener", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                    ((C14088e) C86312j.m106911c(cls)).mo13510OP(TimelineClickListener.m122988j(C96019d.this.f280420d), bundle, true, true, new C96022a(DN));
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("k_expose_msg_id", DN.field_snsId);
                    intent2.putExtra("k_username", DN.field_userName);
                    intent2.putExtra("showShare", false);
                    intent2.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{33}));
                    C88144b.m109791i(TimelineClickListener.m122988j(C96019d.this.f280420d), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                }
                C86709a0.m107528h();
                C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(this.f280423d.getUserName());
                if (H3 != null && (snsInfo = this.f280423d) != null && C72996z1.m85843n5(snsInfo.getUserName()) && "3552365301".equals(H3.mo73980x2())) {
                    SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                    String userName = DN.getUserName();
                    snsReportHelper.getClass();
                    SnsMethodCalculate.markStartTimeMs("reportWechatWorkExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    WechatWorkSnsStruct wechatWorkSnsStruct = new WechatWorkSnsStruct();
                    wechatWorkSnsStruct.f266564f = wechatWorkSnsStruct.mo86045b("OpenimUsername", userName, true);
                    wechatWorkSnsStruct.f266562d = 3;
                    wechatWorkSnsStruct.f266563e = 1;
                    wechatWorkSnsStruct.mo86054n();
                    SnsMethodCalculate.markEndTimeMs("reportWechatWorkExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
        }
    }

    public C96019d(TimelineClickListener timelineClickListener) {
        this.f280420d = timelineClickListener;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
        String str = (String) view.getTag();
        Log.m105918d("MicroMsg.TimelineClickListener", "onCommentLongClick:" + str);
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        } else if (str.equals(C94866e1.Mx0())) {
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        } else {
            Object obj = ((MaskImageButton) view).f285320i;
            String str2 = (obj == null || !(obj instanceof String)) ? "" : (String) obj;
            new Intent();
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str2);
            if (DN != null && DN.isAd()) {
                SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            int[] iArr = new int[2];
            if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
            }
            new C78253a(TimelineClickListener.m122988j(this.f280420d)).mo108273h(view, new C96020a(DN), new C96021b(DN, str, str2), iArr[0], iArr[1]);
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }
}
