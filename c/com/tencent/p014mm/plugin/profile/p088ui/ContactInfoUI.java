package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import ad3.C67028b;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.profile.NewContactWidgetNormal;
import com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30765p3;
import com.tencent.p014mm.storage.C30771q3;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import de3.C45335p;
import di3.C86312j;
import dw2.C7521g;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import g62.C32327i;
import g62.C45888s;
import h81.C32735h;
import in3.C87771d;
import in3.C87773e;
import java.util.HashSet;
import java.util.Set;
import jr2.C99019x;
import jw2.C99069d;
import kf2.C46723f;
import l31.C61212e;
import nf3.C34826a;
import nj3.C76879j;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C11171e;
import p227rn.C48053v;
import p626nv.C109759g;
import p629ny.C76978g;
import p680ru.C77570i;
import p773yy.C79168k;
import pj3.C47511g;
import qo3.C89779i0;
import qy2.C47904x;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77451h;
import qy2.C77453j;
import qy2.C77454m;
import rb0.C47984k;
import rb0.C48009v0;
import vl0.C90830d;
import vn3.C78456a;
import wq3.C91097v;
import xv2.C102778f;

@C86737h0
/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI */
public class ContactInfoUI extends MMPreference implements MStorage.IOnStorageChange, C45888s.C45889a, C11385n, C102778f, C77454m, C32327i.C32328a, MStorageEx.IOnStorageChange, C78456a {

    /* renamed from: P */
    public static final /* synthetic */ int f202514P = 0;

    /* renamed from: A */
    public C89779i0 f202515A = null;

    /* renamed from: B */
    public boolean f202516B = false;

    /* renamed from: C */
    public C77451h f202517C = null;

    /* renamed from: D */
    public PullDownListView.IPullDownCallback f202518D = new ContactInfoUI$$h(this);

    /* renamed from: E */
    public C45335p f202519E = new ContactInfoUI$$i(this);

    /* renamed from: F */
    public View f202520F;

    /* renamed from: G */
    public View f202521G;

    /* renamed from: H */
    public ContactWidgetTabBizInfo f202522H = null;

    /* renamed from: I */
    public int f202523I = 1;

    /* renamed from: J */
    public String f202524J = "";

    /* renamed from: K */
    public long f202525K = 0;

    /* renamed from: L */
    public View f202526L;

    /* renamed from: M */
    public View.OnLayoutChangeListener f202527M = new ContactInfoUI$$d(this);

    /* renamed from: N */
    public Runnable f202528N = null;

    /* renamed from: d */
    public C47511g f202529d;

    /* renamed from: e */
    public C67027a f202530e;

    /* renamed from: f */
    public NormalProfileHeaderPreference f202531f;

    /* renamed from: g */
    public boolean f202532g;

    /* renamed from: h */
    public boolean f202533h;

    /* renamed from: i */
    public int f202534i;

    /* renamed from: j */
    public String f202535j;
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: n */
    public C72996z1 f202536n;

    /* renamed from: o */
    public byte[] f202537o;

    /* renamed from: p */
    public String f202538p = null;

    /* renamed from: q */
    public String f202539q = "";

    /* renamed from: r */
    public String f202540r = "";

    /* renamed from: s */
    public PullDownListView f202541s = null;

    /* renamed from: t */
    public boolean f202542t = false;

    /* renamed from: u */
    public boolean f202543u = false;

    /* renamed from: v */
    public boolean f202544v = false;

    /* renamed from: w */
    public boolean f202545w = false;

    /* renamed from: x */
    public boolean f202546x = false;

    /* renamed from: y */
    public long f202547y = 0;

    /* renamed from: z */
    public int f202548z = 0;

    /* renamed from: A3 */
    public void mo58567A3(C30765p3 p3Var) {
        MMHandlerThread.postToMainThread(new ContactInfoUI$$q(this, p3Var));
    }

    /* renamed from: B1 */
    public void mo96576B1() {
        Log.m105924i("MicroMsg.ContactInfoUI", "story_cat storyUINoStory");
        this.f202543u = false;
        PullDownListView pullDownListView = this.f202541s;
        if (pullDownListView != null && !pullDownListView.f220631I) {
            showTitleView();
            mo96584N7();
            this.f202541s.mo104538n();
        }
        mo96585O7();
    }

    /* renamed from: H7 */
    public final void mo96577H7(int i) {
        try {
            View view = this.f202526L;
            if (view != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams.topMargin != i) {
                    layoutParams.topMargin = i;
                    this.f202526L.setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ContactInfoUI", th, "adjustStatusBgPosition", new Object[0]);
        }
    }

    /* renamed from: I4 */
    public void mo96578I4() {
        Log.m105924i("MicroMsg.ContactInfoUI", "story_cat storyUIBackPressed");
        this.f202541s.mo104538n();
    }

    /* renamed from: I7 */
    public final View mo96579I7(View view, ContactInfoUI$$o<View> contactInfoUI$$o) {
        if (contactInfoUI$$o.apply(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View I7 = mo96579I7(viewGroup.getChildAt(i), contactInfoUI$$o);
            if (I7 != null) {
                return I7;
            }
        }
        return null;
    }

    /* renamed from: J7 */
    public final void mo96580J7() {
        if (this.f202520F != null && C87771d.f254121g) {
            C87771d b = C87771d.m109203b(this);
            b.mo122182f(this.mStatusBarHeightCallback);
            ContactInfoUI$$k contactInfoUI$$k = new ContactInfoUI$$k(this);
            this.mStatusBarHeightCallback = contactInfoUI$$k;
            b.mo122180d(contactInfoUI$$k);
            getWindow().getDecorView().requestApplyInsets();
            C87773e.m109211d(getWindow());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0301, code lost:
        if (r2.mo73506x2() != false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x033b, code lost:
        if (r7.f202536n.mo62916m3() == false) goto L_0x033f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0385  */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96581K7(java.lang.String r17) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            java.lang.Class<nw.b> r0 = p627nw.C35034b.class
            java.lang.Class<zb3.d> r1 = zb3.C66782d.class
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85822V5(r2)
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 2
            java.lang.String r13 = "MicroMsg.ContactInfoUI"
            java.lang.String r14 = ""
            if (r2 == 0) goto L_0x0036
            di3.d r0 = di3.C86312j.m106911c(r1)
            zb3.d r0 = (zb3.C66782d) r0
            ad3.a r0 = r0.vg0(r7)
            r7.f202530e = r0
            com.tencent.mm.autogen.mmdata.rpt.WeChatPayPluginReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WeChatPayPluginReportStruct
            r0.<init>()
            r1 = 2
            r0.f108024d = r1
            r0.mo86054n()
            goto L_0x03c6
        L_0x0036:
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            java.lang.String r3 = "gh_b4af18eac3d5"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0052
            di3.d r0 = di3.C86312j.m106911c(r1)
            zb3.d r0 = (zb3.C66782d) r0
            ad3.a r0 = r0.mo72981Av(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0052:
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85824W5(r2)
            if (r2 == 0) goto L_0x006c
            di3.d r0 = di3.C86312j.m106911c(r1)
            zb3.d r0 = (zb3.C66782d) r0
            ad3.a r0 = r0.mo72983KL(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x006c:
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            java.lang.String r3 = "gh_e087bb5b95e6"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0088
            di3.d r0 = di3.C86312j.m106911c(r1)
            zb3.d r0 = (zb3.C66782d) r0
            ad3.a r0 = r0.T40(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0088:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_minishop_plugin_enabled
            int r1 = r1.mo58779Qe(r2, r10)
            if (r10 != r1) goto L_0x00ad
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = eb0.C45628s0.m50744I(r1)
            if (r1 == 0) goto L_0x00ad
            com.tencent.mm.plugin.profile.ui.m1 r0 = new com.tencent.mm.plugin.profile.ui.m1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x00ad:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85795C5(r1)
            if (r1 == 0) goto L_0x00c2
            vv2.a r0 = new vv2.a
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x00c2:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85849t5(r1)
            if (r1 == 0) goto L_0x00e2
            java.lang.Class<xf2.g> r0 = xf2.C38511g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xf2.g r0 = (xf2.C38511g) r0
            r0.getClass()
            dg2.a r0 = new dg2.a
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x00e2:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85830a5(r1)
            if (r1 == 0) goto L_0x00f7
            com.tencent.mm.plugin.profile.ui.x0 r0 = new com.tencent.mm.plugin.profile.ui.x0
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x00f7:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85800G5(r1)
            if (r1 == 0) goto L_0x010c
            a13.a r0 = new a13.a
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x010c:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = eb0.C45628s0.m50743H(r1)
            if (r1 == 0) goto L_0x0121
            com.tencent.mm.plugin.profile.ui.e1 r0 = new com.tencent.mm.plugin.profile.ui.e1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0121:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85851v5(r1)
            if (r1 == 0) goto L_0x0136
            com.tencent.mm.plugin.profile.ui.q1 r0 = new com.tencent.mm.plugin.profile.ui.q1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0136:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85811N4(r1)
            if (r1 == 0) goto L_0x014b
            com.tencent.mm.plugin.profile.ui.w0 r0 = new com.tencent.mm.plugin.profile.ui.w0
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x014b:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85834e5(r1)
            if (r1 == 0) goto L_0x016b
            java.lang.Class<kv.b> r0 = p590kv.C76635b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kv.b r0 = (p590kv.C76635b) r0
            r0.getClass()
            com.tencent.mm.plugin.nearby.ui.a r0 = new com.tencent.mm.plugin.nearby.ui.a
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x016b:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85794B5(r1)
            if (r1 == 0) goto L_0x0187
            java.lang.Class<ln2.b> r0 = ln2.C34315b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln2.b r0 = (ln2.C34315b) r0
            ad3.a r0 = r0.mo59555r(r7, r11)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0187:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85837h5(r1)
            if (r1 == 0) goto L_0x019c
            com.tencent.mm.plugin.profile.ui.g1 r0 = new com.tencent.mm.plugin.profile.ui.g1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x019c:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85853x5(r1)
            if (r1 == 0) goto L_0x01b9
            di3.d r0 = di3.C86312j.m106911c(r0)
            nw.b r0 = (p627nw.C35034b) r0
            java.lang.String r1 = "widget_type_news"
            ad3.a r0 = r0.mo59680r(r7, r1)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x01b9:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85854y5(r1)
            if (r1 == 0) goto L_0x01d6
            di3.d r0 = di3.C86312j.m106911c(r0)
            nw.b r0 = (p627nw.C35034b) r0
            java.lang.String r1 = "widget_type_weibo"
            ad3.a r0 = r0.mo59680r(r7, r1)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x01d6:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85815R4(r0)
            if (r0 == 0) goto L_0x01eb
            com.tencent.mm.plugin.profile.ui.a1 r0 = new com.tencent.mm.plugin.profile.ui.a1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x01eb:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85836g5(r0)
            if (r0 == 0) goto L_0x0207
            java.lang.Class<cu.b> r0 = p482cu.C30916b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            cu.b r0 = (p482cu.C30916b) r0
            ad3.a r0 = r0.mo57886r(r7, r11)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0207:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            java.lang.String r0 = r0.getUsername()
            if (r0 == 0) goto L_0x0219
            java.lang.String r1 = "feedsapp"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0219
            r0 = 1
            goto L_0x021a
        L_0x0219:
            r0 = 0
        L_0x021a:
            if (r0 == 0) goto L_0x0225
            com.tencent.mm.plugin.profile.ui.c1 r0 = new com.tencent.mm.plugin.profile.ui.c1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0225:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            boolean r0 = r0.mo62916m3()
            java.lang.String r1 = "key_use_new_contact_profile"
            if (r0 != 0) goto L_0x028c
            android.content.Intent r0 = r16.getIntent()
            boolean r0 = r0.getBooleanExtra(r1, r9)
            if (r0 == 0) goto L_0x023a
            goto L_0x028c
        L_0x023a:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85801H5(r0)
            if (r0 == 0) goto L_0x024f
            com.tencent.mm.plugin.profile.ui.s1 r0 = new com.tencent.mm.plugin.profile.ui.s1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x024f:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85835f5(r0)
            if (r0 == 0) goto L_0x0264
            com.tencent.mm.plugin.profile.ui.f1 r0 = new com.tencent.mm.plugin.profile.ui.f1
            r0.<init>(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0264:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            java.lang.String r0 = r0.getUsername()
            boolean r0 = eb0.C45628s0.m50741F(r0)
            if (r0 == 0) goto L_0x0280
            java.lang.Class<vp.b> r0 = p726vp.C37798b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            vp.b r0 = (p726vp.C37798b) r0
            ad3.a r0 = r0.kd0(r7)
            r7.f202530e = r0
            goto L_0x03c6
        L_0x0280:
            com.tencent.mm.plugin.profile.NewContactWidgetNormal r0 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal
            r0.<init>(r7)
            r7.f202530e = r0
            r16.mo96583M7()
            goto L_0x03c6
        L_0x028c:
            byte[] r0 = r7.f202537o     // Catch:{ IOException -> 0x029f }
            if (r0 != 0) goto L_0x0291
            goto L_0x02a5
        L_0x0291:
            te3.r10 r0 = new te3.r10     // Catch:{ IOException -> 0x029f }
            r0.<init>()     // Catch:{ IOException -> 0x029f }
            byte[] r2 = r7.f202537o     // Catch:{ IOException -> 0x029f }
            pe3.a r0 = r0.parseFrom(r2)     // Catch:{ IOException -> 0x029f }
            te3.r10 r0 = (te3.C51043r10) r0     // Catch:{ IOException -> 0x029f }
            goto L_0x02a6
        L_0x029f:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r14, r2)
        L_0x02a5:
            r0 = r11
        L_0x02a6:
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            android.content.SharedPreferences r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r4 = "use_new_profile"
            boolean r3 = r3.getBoolean(r4, r10)
            if (r3 != 0) goto L_0x02bb
            goto L_0x033f
        L_0x02bb:
            boolean r3 = eb0.C45628s0.m50757V(r2)
            if (r3 == 0) goto L_0x02c3
            goto L_0x033f
        L_0x02c3:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85793A5(r2)
            if (r3 == 0) goto L_0x02cb
            goto L_0x033f
        L_0x02cb:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85803I5(r2)
            if (r3 == 0) goto L_0x02d3
            goto L_0x033f
        L_0x02d3:
            boolean r3 = rb0.C47984k.m53340n(r2)
            if (r3 == 0) goto L_0x02da
            goto L_0x033d
        L_0x02da:
            boolean r2 = rb0.C47984k.m53341o(r2)
            if (r2 == 0) goto L_0x02e1
            goto L_0x033d
        L_0x02e1:
            if (r0 == 0) goto L_0x0304
            ug.c r2 = new ug.c
            r2.<init>()
            java.lang.String r3 = r0.f140657e
            r2.field_extInfo = r3
            ug.c$b r3 = r2.mo73500r2(r9)
            int r3 = r3.mo73517j()
            r2.field_type = r3
            boolean r3 = r2.mo73507y2()
            if (r3 == 0) goto L_0x02fd
            goto L_0x033d
        L_0x02fd:
            boolean r2 = r2.mo73506x2()
            if (r2 == 0) goto L_0x0304
            goto L_0x033d
        L_0x0304:
            android.content.Intent r2 = r16.getIntent()
            boolean r1 = r2.getBooleanExtra(r1, r9)
            if (r1 == 0) goto L_0x030f
            goto L_0x033d
        L_0x030f:
            java.lang.Class<rn.v> r1 = p227rn.C48053v.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.v r1 = (p227rn.C48053v) r1
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            boolean r1 = r1.mo72617gl(r2)
            if (r1 == 0) goto L_0x0324
            goto L_0x033f
        L_0x0324:
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = rb0.C47984k.m53335i(r1)
            if (r1 == 0) goto L_0x0331
            goto L_0x033f
        L_0x0331:
            int r1 = r7.f202523I
            if (r1 == r10) goto L_0x033f
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            boolean r1 = r1.mo62916m3()
            if (r1 == 0) goto L_0x033f
        L_0x033d:
            r1 = 1
            goto L_0x0340
        L_0x033f:
            r1 = 0
        L_0x0340:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            com.tencent.mm.storage.z1 r3 = r7.f202536n
            java.lang.String r3 = r3.getUsername()
            r2[r9] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r10] = r3
            java.lang.String r3 = "username:%s, isUseNewProfileUI:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r2)
            qo3.i0 r2 = r7.f202515A
            if (r2 == 0) goto L_0x035f
            r2.dismiss()
            r7.f202515A = r11
        L_0x035f:
            if (r1 == 0) goto L_0x0385
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo r1 = r7.f202522H
            if (r1 != 0) goto L_0x0374
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo r15 = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo
            long r5 = r7.f202547y
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r0
            r1.<init>(r2, r3, r4, r5)
            r7.f202522H = r15
        L_0x0374:
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo r1 = r7.f202522H
            r1.f115606e = r8
            r1.f115607f = r0
            long r2 = r7.f202547y
            r1.f115608g = r2
            java.lang.String r0 = r7.f202535j
            r1.f115591J = r0
            r7.f202530e = r1
            goto L_0x03c6
        L_0x0385:
            int r1 = r7.f202523I
            if (r1 != r10) goto L_0x03b3
            boolean r1 = r7.f202516B
            if (r1 == 0) goto L_0x03b3
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            long r1 = r1.f108320R1
            int r2 = (int) r1
            if (r2 > 0) goto L_0x03b3
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r3 = r7.getString(r0)
            r4 = 1
            r5 = 1
            r6 = 0
            r1 = r16
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r7.f202515A = r0
            java.lang.String r0 = "fromCardGettingContact now not show bodyWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return
        L_0x03b3:
            com.tencent.mm.plugin.profile.ui.o0 r1 = new com.tencent.mm.plugin.profile.ui.o0
            r1.<init>(r7, r8, r0)
            java.lang.String r0 = r7.f202535j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x03c4
            java.lang.String r0 = r7.f202535j
            r1.f115479A = r0
        L_0x03c4:
            r7.f202530e = r1
        L_0x03c6:
            ad3.a r0 = r7.f202530e
            if (r0 == 0) goto L_0x046f
            pj3.g r1 = r7.f202529d
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            boolean r3 = r7.f202532g
            int r4 = r7.f202534i
            r0.mo5961x(r1, r2, r3, r4)
            hg0.b r0 = dg0.C75398e.vx0()
            com.tencent.mm.storage.z1 r1 = r7.f202536n
            java.lang.String r1 = r1.getUsername()
            hg0.a r0 = r0.mo106401a(r1)
            if (r0 == 0) goto L_0x03f2
            java.lang.String r0 = r0.mo106386f()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r1 = " "
            r0.replace(r1, r14)
        L_0x03f2:
            com.tencent.mm.storage.z1 r0 = r7.f202536n
            r0.getClass()
            ad3.a r0 = r7.f202530e
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.profile.p088ui.C42660o0
            if (r1 != 0) goto L_0x046f
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizInfo
            if (r0 != 0) goto L_0x046f
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SWITCH_NAMES_STRING
            java.lang.Object r0 = r0.mo119685f(r1, r14)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x046f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.mm.storage.z1 r3 = r7.f202536n
            java.lang.String r3 = r3.getUsername()
            r2.append(r3)
            java.lang.String r3 = ",*"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = r0.replaceAll(r2, r14)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r2.mo119677K(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.tencent.mm.storage.z1 r2 = r7.f202536n
            java.lang.String r2 = r2.getUsername()
            r1[r9] = r2
            r1[r10] = r0
            java.lang.String r2 = "mark plugin read, userName:%s, newVal:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x046f
            java.lang.Class<ct.c> r0 = p327ct.C30914c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ct.c r0 = (p327ct.C30914c) r0
            ct.d r0 = r0.mo17862sM()
            r1 = 262158(0x4000e, float:3.67362E-40)
            l20.a r0 = (l20.C21388a) r0
            r0.mo33507p(r1, r9)
        L_0x046f:
            pj3.g r0 = r7.f202529d
            if (r0 == 0) goto L_0x04ca
            java.lang.String r1 = "contact_profile_header_normal"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference) r0
            r7.f202531f = r0
            if (r0 == 0) goto L_0x04ca
            android.view.View r0 = r7.f202521G
            if (r0 == 0) goto L_0x0487
            int r9 = r0.getHeight()
        L_0x0487:
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r0 = r7.f202531f
            boolean r1 = r7.f202543u
            boolean r2 = r7.f202544v
            r0.mo96616P(r1, r9, r2)
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r0 = r7.f202531f
            android.view.View r0 = r0.f202576Q
            if (r0 == 0) goto L_0x049f
            java.lang.Object r0 = r0.getTag()
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r0 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.C70150c) r0
            android.view.View r0 = r0.f202594E
            goto L_0x04a0
        L_0x049f:
            r0 = r11
        L_0x04a0:
            if (r0 == 0) goto L_0x04af
            int r1 = r0.getMeasuredHeight()
            if (r1 == 0) goto L_0x04af
            int r0 = r0.getMeasuredHeight()
            r7.mo96577H7(r0)
        L_0x04af:
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r0 = r7.f202531f
            android.view.View$OnLayoutChangeListener r1 = r7.f202527M
            r0.f202584Y = r1
            android.view.View r1 = r0.f202576Q
            if (r1 == 0) goto L_0x04c1
            java.lang.Object r1 = r1.getTag()
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r1 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.C70150c) r1
            android.view.View r11 = r1.f202594E
        L_0x04c1:
            if (r11 == 0) goto L_0x04ca
            android.view.View$OnLayoutChangeListener r0 = r0.f202584Y
            if (r0 == 0) goto L_0x04ca
            r11.addOnLayoutChangeListener(r0)
        L_0x04ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI.mo96581K7(java.lang.String):void");
    }

    /* renamed from: L7 */
    public final void mo96582L7() {
        PullDownListView pullDownListView;
        if (this.f202546x) {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) getResources().getString(C0966R.string.f361421jr3), 0).show();
        } else if (this.f202543u && (pullDownListView = this.f202541s) != null) {
            pullDownListView.mo104547p();
        }
    }

    /* renamed from: M7 */
    public final void mo96583M7() {
        RelativeLayout relativeLayout;
        Class cls = C79168k.class;
        if (!this.f202542t && this.f202545w && !(this.f202530e instanceof ContactWidgetTabBizInfo)) {
            C72996z1 z1Var = this.f202536n;
            if (z1Var == null || !C72996z1.m85846q5(z1Var.getUsername())) {
                C72996z1 z1Var2 = this.f202536n;
                if ((z1Var2 == null || !C72996z1.m85843n5(z1Var2.getUsername())) && (relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.gv5)) != null) {
                    Log.m105925i("MicroMsg.ContactInfoUI", "setupStory %s stack %s", this, Util.getStack().toString());
                    this.f202542t = true;
                    this.f202541s = (PullDownListView) getListView();
                    ((C79168k) C86312j.m106911c(cls)).mo74122Xo(getContext(), this.f202541s);
                    this.f202541s.setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2895ws));
                    if (this.f202545w) {
                        this.f202541s.setBackground((Drawable) null);
                        this.f202541s.f220667y = this.f202518D;
                        View view = new View(this);
                        this.f202526L = view;
                        relativeLayout.addView(view, 0);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.topMargin = C75044y4.m89990b(getContext()).x;
                        view.setBackgroundColor(getResources().getColor(C0966R.color.f2927a));
                        C74783i3.m89537a(getContext());
                        C77451h z6 = ((C79168k) C86312j.m106911c(cls)).mo74140z6(this, new ContactInfoUI$$e(this), true);
                        this.f202517C = z6;
                        String stringExtra = getIntent().getStringExtra("Contact_User");
                        if (!(TextUtils.isEmpty(stringExtra) || z6 == null || z6.getView() == null)) {
                            relativeLayout.addView(z6.getView(), 0);
                            z6.mo107620b(this);
                            z6.mo72650h(stringExtra);
                        }
                    }
                    this.f202541s.setNavigationBarHeight(C75044y4.m89991c(getContext()));
                    C99069d dVar = C99069d.f290418a;
                    C99069d.f290421d.f266265e = 3;
                }
            }
        }
    }

    /* renamed from: N7 */
    public final void mo96584N7() {
        if (C11171e.m11046c(19)) {
            getWindow().clearFlags(201327616);
        } else {
            getWindow().clearFlags(1024);
        }
    }

    /* renamed from: O3 */
    public void mo71318O3(C44673z4 z4Var) {
        MMHandlerThread.postToMainThread(new ContactInfoUI$$r(this, z4Var));
    }

    /* renamed from: O7 */
    public final void mo96585O7() {
        NormalProfileHeaderPreference normalProfileHeaderPreference;
        boolean z = false;
        Log.m105925i("MicroMsg.ContactInfoUI", "updateUIByStory: %s %s %s %s", Boolean.valueOf(this.f202542t), Boolean.valueOf(this.f202543u), Boolean.valueOf(this.f202545w), Boolean.valueOf(this.f202544v));
        if (this.f202543u && !this.f202546x) {
            mo96580J7();
            setActionbarColor(getContext().getResources().getColor(C0966R.color.ahf));
            setMMTitle("");
            PullDownListView pullDownListView = this.f202541s;
            if (pullDownListView != null) {
                pullDownListView.setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2895ws));
                this.f202541s.setSupportOverscroll(true);
            }
            View view = this.f202521G;
            if (view != null) {
                view.setOnClickListener(new ContactInfoUI$$f(this));
            }
        } else if (!this.f202544v || this.f202546x) {
            setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
            setMMTitle("");
            PullDownListView pullDownListView2 = this.f202541s;
            if (pullDownListView2 != null) {
                pullDownListView2.setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2896wt));
                this.f202541s.setSupportOverscroll(false);
            }
            View view2 = this.f202520F;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, 0);
            }
            if (getBounceView() != null) {
                getBounceView().setBounceEnabled(true);
            }
        } else {
            mo96580J7();
            setActionbarColor(getContext().getResources().getColor(C0966R.color.ahf));
            setMMTitle("");
            PullDownListView pullDownListView3 = this.f202541s;
            if (pullDownListView3 != null) {
                pullDownListView3.setBackground((Drawable) null);
                C72996z1 z1Var = this.f202536n;
                if (z1Var != null) {
                    z1Var.getClass();
                }
                C77451h hVar = this.f202517C;
                this.f202541s.setSupportOverscroll(hVar != null && hVar.mo107625r());
            }
            View view3 = this.f202521G;
            if (view3 != null) {
                view3.setOnClickListener(new ContactInfoUI$$g(this));
            }
            if (getBounceView() != null) {
                getBounceView().setBounceEnabled(false);
            }
        }
        PullDownListView pullDownListView4 = this.f202541s;
        if (pullDownListView4 != null) {
            if (this.f202544v) {
                pullDownListView4.setSelector(C0966R.color.f2927a);
            } else {
                pullDownListView4.setSelector(C0966R.color.ahf);
            }
        }
        View view4 = this.f202521G;
        int height = view4 != null ? view4.getHeight() : 0;
        C47511g gVar = this.f202529d;
        if (!(gVar == null || (normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal")) == null)) {
            boolean z2 = this.f202543u && !this.f202546x;
            if (this.f202544v && !this.f202546x) {
                z = true;
            }
            normalProfileHeaderPreference.mo96616P(z2, height, z);
        }
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
    }

    /* renamed from: V1 */
    public void mo96586V1() {
        Log.m105924i("MicroMsg.ContactInfoUI", "story_cat storyUIHasStory");
        this.f202543u = true;
        PullDownListView pullDownListView = this.f202541s;
        if (pullDownListView != null && pullDownListView.f220631I) {
            mo96585O7();
        }
    }

    /* renamed from: Y1 */
    public void mo96587Y1() {
        Log.m105924i("MicroMsg.ContactInfoUI", "statusUIHasStatus");
        this.f202544v = true;
        PullDownListView pullDownListView = this.f202541s;
        if (pullDownListView != null && pullDownListView.f220631I) {
            mo96585O7();
        }
    }

    /* renamed from: e1 */
    public void mo96588e1() {
        Log.m105924i("MicroMsg.ContactInfoUI", "statusUINoStatus");
        this.f202544v = false;
        PullDownListView pullDownListView = this.f202541s;
        if (pullDownListView != null && !pullDownListView.f220631I) {
            showTitleView();
            mo96584N7();
            this.f202541s.mo104538n();
        }
        mo96585O7();
    }

    public void finish() {
        Runnable runnable = this.f202528N;
        if (runnable != null) {
            runnable.run();
            return;
        }
        C99069d dVar = C99069d.f290418a;
        C99069d.f290421d.f266265e = 0;
        super.finish();
    }

    public View getBottomView() {
        return super.getBottomView();
    }

    public int getForceOrientation() {
        C67027a aVar = this.f202530e;
        if (aVar == null || (!(aVar instanceof C42660o0) && !(aVar instanceof ContactWidgetTabBizInfo))) {
            return super.getForceOrientation();
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C34826a()) == 1) {
            return super.getForceOrientation();
        }
        return 1;
    }

    public String getIdentString() {
        Class cls = C48053v.class;
        C72996z1 z1Var = this.f202536n;
        if (!(z1Var == null || ((int) z1Var.f108320R1) == 0 || Util.isNullOrNil(z1Var.getUsername()))) {
            Log.m105925i("MicroMsg.ContactInfoUI", "getIdentityString %s", this.f202536n.getUsername());
            if (((C48053v) C86312j.m106911c(cls)).mo72614OE(this.f202536n.getUsername())) {
                return "_EnterpriseChat";
            }
            if (((C48053v) C86312j.m106911c(cls)).mo72617gl(this.f202536n.getUsername())) {
                return "_EnterpriseFatherBiz";
            }
            if (C47984k.m53335i(this.f202536n.getUsername())) {
                return "_EnterpriseChildBiz";
            }
            if (this.f202536n.mo62916m3()) {
                return "_bizContact";
            }
            if (C72996z1.m85820U5(this.f202536n.getUsername())) {
                return "_chatroom";
            }
            if (C72996z1.m85811N4(this.f202536n.getUsername())) {
                return "_bottle";
            }
            if (C72996z1.m85848s5(this.f202536n.getUsername())) {
                return "_QQ";
            }
            if (C45628s0.m50812z(this.f202536n.getUsername())) {
                return "_" + this.f202536n.getUsername();
            }
        }
        return "";
    }

    public int getResourceId() {
        return C0966R.xml.f8886ae;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C5023y.class);
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x075f  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x07af  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x07bd  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x07d0  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x07e0  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x08e2  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x08ed  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x08fa  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0930  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0940  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r37 = this;
            r0 = r37
            java.lang.Class<he0.h> r1 = he0.C46021h.class
            java.lang.Class<ln.i> r2 = p196ln.C76708i.class
            pj3.g r3 = r37.getPreferenceScreen()
            r0.f202529d = r3
            r3.removeAll()
            android.content.Intent r3 = r37.getIntent()
            java.lang.String r4 = "Verify_ticket"
            java.lang.String r3 = r3.getStringExtra(r4)
            r0.f202535j = r3
            android.content.Intent r3 = r37.getIntent()
            java.lang.String r4 = "Chat_Readonly"
            r5 = 0
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r0.f202532g = r3
            android.content.Intent r3 = r37.getIntent()
            java.lang.String r4 = "User_Verify"
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r0.f202533h = r3
            android.content.Intent r3 = r37.getIntent()
            java.lang.String r4 = "Contact_ChatRoomId"
            java.lang.String r3 = r3.getStringExtra(r4)
            r0.f202540r = r3
            android.content.Intent r3 = r37.getIntent()
            java.lang.String r4 = "Contact_RoomNickname"
            r3.getStringExtra(r4)
            android.content.Intent r3 = r37.getIntent()
            java.lang.String r4 = "Contact_User"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            android.content.Intent r6 = r37.getIntent()
            java.lang.String r7 = "Contact_Alias"
            java.lang.String r6 = r6.getStringExtra(r7)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            android.content.Intent r7 = r37.getIntent()
            java.lang.String r8 = "Contact_Encryptusername"
            java.lang.String r7 = r7.getStringExtra(r8)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            java.lang.String r8 = "@stranger"
            boolean r8 = r3.endsWith(r8)
            if (r8 == 0) goto L_0x007c
            r7 = r3
        L_0x007c:
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            com.tencent.mm.storage.z1 r8 = r8.get(r3)
            r0.f202536n = r8
            android.content.Intent r8 = r37.getIntent()
            java.lang.String r9 = "Contact_Scene"
            r10 = 9
            int r8 = r8.getIntExtra(r9, r10)
            r0.f202534i = r8
            com.tencent.mm.storage.z1 r8 = r0.f202536n
            if (r8 == 0) goto L_0x009e
            r8.f214115W1 = r3
        L_0x009e:
            java.lang.Class<om.f> r8 = p214om.C11502f.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            om.f r8 = (p214om.C11502f) r8
            wc3.y r8 = r8.mo11461Sr()
            com.tencent.mm.storage.z1 r9 = r0.f202536n
            r8.mo93160mL(r9)
            android.content.Intent r8 = r37.getIntent()
            java.lang.String r9 = "Contact_Nick"
            java.lang.String r8 = r8.getStringExtra(r9)
            android.content.Intent r9 = r37.getIntent()
            java.lang.String r11 = "Contact_Sex"
            int r9 = r9.getIntExtra(r11, r5)
            android.content.Intent r11 = r37.getIntent()
            java.lang.String r12 = "Contact_Province"
            java.lang.String r11 = r11.getStringExtra(r12)
            android.content.Intent r12 = r37.getIntent()
            java.lang.String r13 = "Contact_City"
            java.lang.String r12 = r12.getStringExtra(r13)
            android.content.Intent r13 = r37.getIntent()
            java.lang.String r14 = "Contact_Signature"
            java.lang.String r13 = r13.getStringExtra(r14)
            android.content.Intent r14 = r37.getIntent()
            java.lang.String r15 = "Contact_VUser_Info_Flag"
            int r14 = r14.getIntExtra(r15, r5)
            android.content.Intent r15 = r37.getIntent()
            java.lang.String r10 = "Contact_VUser_Info"
            java.lang.String r10 = r15.getStringExtra(r10)
            android.content.Intent r15 = r37.getIntent()
            java.lang.String r5 = "Contact_Distance"
            java.lang.String r5 = r15.getStringExtra(r5)
            android.content.Intent r15 = r37.getIntent()
            r17 = r4
            java.lang.String r4 = "Contact_KWeibo_flag"
            r18 = r7
            r7 = 0
            int r4 = r15.getIntExtra(r4, r7)
            android.content.Intent r7 = r37.getIntent()
            java.lang.String r15 = "Contact_KWeibo"
            java.lang.String r7 = r7.getStringExtra(r15)
            android.content.Intent r15 = r37.getIntent()
            r19 = r4
            java.lang.String r4 = "Contact_KWeiboNick"
            java.lang.String r4 = r15.getStringExtra(r4)
            android.content.Intent r15 = r37.getIntent()
            r20 = r4
            java.lang.String r4 = "Contact_KFacebookName"
            java.lang.String r4 = r15.getStringExtra(r4)
            android.content.Intent r15 = r37.getIntent()
            r21 = r7
            java.lang.String r7 = "Contact_KFacebookId"
            r23 = r4
            r22 = r5
            r4 = 0
            r24 = r6
            long r6 = r15.getLongExtra(r7, r4)
            android.content.Intent r15 = r37.getIntent()
            java.lang.String r4 = "Contact_BrandIconURL"
            java.lang.String r4 = r15.getStringExtra(r4)
            r0.f202539q = r4
            android.content.Intent r4 = r37.getIntent()
            java.lang.String r5 = "Contact_RegionCode"
            java.lang.String r4 = r4.getStringExtra(r5)
            android.content.Intent r5 = r37.getIntent()
            java.lang.String r15 = "Contact_customInfo"
            byte[] r5 = r5.getByteArrayExtra(r15)
            r0.f202537o = r5
            android.content.Intent r5 = r37.getIntent()
            java.lang.String r15 = "Contact_Ext_Flag"
            r25 = r6
            r6 = 0
            int r5 = r5.getIntExtra(r15, r6)
            android.content.Intent r7 = r37.getIntent()
            java.lang.String r15 = "force_get_contact"
            boolean r7 = r7.getBooleanExtra(r15, r6)
            r15 = 4
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r7)
            r15[r6] = r16
            r6 = 1
            r15[r6] = r3
            java.lang.String r6 = r0.f202540r
            r27 = r5
            r5 = 2
            r15[r5] = r6
            int r6 = r0.f202534i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5 = 3
            r15[r5] = r6
            java.lang.String r6 = "MicroMsg.ContactInfoUI"
            java.lang.String r5 = "dkverify forceGetContact:%s  user:%s  roomid:%s, addContactScene: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r15)
            java.lang.String r5 = ""
            if (r7 == 0) goto L_0x01d9
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r28 = r7
            java.lang.String r7 = "initView, forceGetContact, user = "
            r15.append(r7)
            r15.append(r3)
            java.lang.String r7 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            if (r7 == 0) goto L_0x01ce
            boolean r7 = r7.mo62927s3()
            if (r7 == 0) goto L_0x01ce
            eb0.w2 r7 = eb0.C31519v2.m39436a()
            java.lang.String r15 = r0.f202540r
            r7.mo55987c(r3, r15)
            goto L_0x01d5
        L_0x01ce:
            eb0.w2 r7 = eb0.C31519v2.m39436a()
            r7.mo55987c(r3, r5)
        L_0x01d5:
            r7 = 1
            r0.f202516B = r7
            goto L_0x01db
        L_0x01d9:
            r28 = r7
        L_0x01db:
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r15 = "AntispamTicket"
            r29 = r8
            r30 = r9
            if (r7 == 0) goto L_0x01ea
            long r8 = r7.f108320R1
            int r7 = (int) r8
            if (r7 != 0) goto L_0x0221
        L_0x01ea:
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r7 == 0) goto L_0x0221
            int r7 = r0.f202534i
            r8 = 15
            if (r7 == r8) goto L_0x0221
            android.content.Intent r7 = r37.getIntent()
            java.lang.String r7 = r7.getStringExtra(r15)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x020a
            java.lang.String r7 = r0.f202535j
        L_0x020a:
            f40.g r8 = f40.C86709a0.m107529k()
            ob0.b0 r8 = r8.f251779b
            je0.n r9 = new je0.n
            r31 = r10
            java.lang.String r10 = r0.f202540r
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            r9.<init>(r3, r10, r7)
            r8.mo123460f(r9)
            goto L_0x0223
        L_0x0221:
            r31 = r10
        L_0x0223:
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            r8 = 0
            if (r7 == 0) goto L_0x0384
            long r9 = r7.f108320R1
            int r10 = (int) r9
            if (r10 <= 0) goto L_0x0384
            java.lang.String r7 = r7.getUsername()
            boolean r7 = eb0.C45628s0.m50751P(r7)
            if (r7 == 0) goto L_0x024f
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85848s5(r7)
            if (r7 == 0) goto L_0x0384
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85796D5(r7)
            if (r7 != 0) goto L_0x0384
        L_0x024f:
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            boolean r7 = r7.mo101231Y5()
            if (r7 == 0) goto L_0x029d
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85843n5(r7)
            if (r7 == 0) goto L_0x029d
            android.content.Intent r1 = r37.getIntent()
            java.lang.String r1 = r1.getStringExtra(r15)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r7 == 0) goto L_0x0277
            java.lang.String r1 = r0.f202535j
        L_0x0277:
            f40.g r7 = f40.C86709a0.m107529k()
            ob0.b0 r7 = r7.f251779b
            je0.n r9 = new je0.n
            com.tencent.mm.storage.z1 r10 = r0.f202536n
            java.lang.String r10 = r10.getUsername()
            com.tencent.mm.storage.z1 r15 = r0.f202536n
            boolean r15 = r15.mo62927s3()
            if (r15 == 0) goto L_0x028f
            r15 = r5
            goto L_0x0295
        L_0x028f:
            java.lang.String r15 = r0.f202540r
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
        L_0x0295:
            r9.<init>(r10, r15, r1)
            r7.mo123460f(r9)
            goto L_0x0384
        L_0x029d:
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85846q5(r7)
            if (r7 == 0) goto L_0x02df
            di3.d r7 = di3.C86312j.m106911c(r1)
            he0.h r7 = (he0.C46021h) r7
            com.tencent.mm.storage.z1 r9 = r0.f202536n
            boolean r7 = r7.C20(r9)
            if (r7 == 0) goto L_0x0384
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            r10 = 0
            r9[r10] = r7
            java.lang.String r7 = "alvinluo updateOpenImKefuContact username: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r9)
            he0.p r7 = new he0.p
            r9 = 7
            com.tencent.mm.storage.z1 r10 = r0.f202536n
            java.lang.String r10 = r10.getUsername()
            r7.<init>(r9, r10, r8)
            di3.d r1 = di3.C86312j.m106911c(r1)
            he0.h r1 = (he0.C46021h) r1
            r1.R40(r7, r8)
            goto L_0x0384
        L_0x02df:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            ug.c r1 = rb0.C47984k.m53328b(r1)
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            boolean r7 = r7.mo62916m3()
            if (r7 == 0) goto L_0x02f9
            boolean r7 = rb0.C47961a.m53282a()
            if (r7 == 0) goto L_0x02f9
            r7 = 1
            goto L_0x02fa
        L_0x02f9:
            r7 = 0
        L_0x02fa:
            if (r1 == 0) goto L_0x034c
            boolean r1 = r1.mo72809G1()
            if (r1 == 0) goto L_0x0305
            if (r7 != 0) goto L_0x0305
            goto L_0x034c
        L_0x0305:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            boolean r1 = r1.mo101231Y5()
            if (r1 == 0) goto L_0x0384
            if (r7 != 0) goto L_0x0384
            r1 = 1
            java.lang.Object[] r7 = new java.lang.Object[r1]
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            int r1 = r1.f149509Q0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9 = 0
            r7[r9] = r1
            java.lang.String r1 = "update contact, last check time=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r7)
            eb0.w2 r1 = eb0.C31519v2.m39436a()
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            com.tencent.mm.storage.z1 r9 = r0.f202536n
            boolean r9 = r9.mo62927s3()
            if (r9 == 0) goto L_0x0337
            r9 = r5
            goto L_0x0339
        L_0x0337:
            java.lang.String r9 = r0.f202540r
        L_0x0339:
            r1.mo55987c(r7, r9)
            di3.d r1 = di3.C86312j.m106911c(r2)
            ln.i r1 = (p196ln.C76708i) r1
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            r1.mo106823Jc(r7)
            goto L_0x0384
        L_0x034c:
            r1 = 1
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 0
            r7[r9] = r1
            java.lang.String r1 = "update contact, verifyFlag %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r7)
            eb0.w2 r1 = eb0.C31519v2.m39436a()
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            com.tencent.mm.storage.z1 r9 = r0.f202536n
            boolean r9 = r9.mo62927s3()
            if (r9 == 0) goto L_0x0370
            r9 = r5
            goto L_0x0372
        L_0x0370:
            java.lang.String r9 = r0.f202540r
        L_0x0372:
            r1.mo55987c(r7, r9)
            di3.d r1 = di3.C86312j.m106911c(r2)
            ln.i r1 = (p196ln.C76708i) r1
            com.tencent.mm.storage.z1 r7 = r0.f202536n
            java.lang.String r7 = r7.getUsername()
            r1.mo106823Jc(r7)
        L_0x0384:
            android.content.Intent r1 = r37.getIntent()
            java.lang.String r7 = "Contact_verify_Scene"
            r9 = 9
            r1.getIntExtra(r7, r9)
            android.content.Intent r1 = r37.getIntent()
            java.lang.String r7 = "key_add_contact_match_type"
            r9 = 0
            r1.getIntExtra(r7, r9)
            android.content.Intent r1 = r37.getIntent()
            java.lang.String r7 = "key_add_contact_openim_appid"
            java.lang.String r1 = r1.getStringExtra(r7)
            android.content.Intent r7 = r37.getIntent()
            java.lang.String r10 = "key_add_contact_custom_detail_visible"
            int r7 = r7.getIntExtra(r10, r9)
            android.content.Intent r9 = r37.getIntent()
            java.lang.String r10 = "key_add_contact_custom_detail"
            java.lang.String r9 = r9.getStringExtra(r10)
            android.content.Intent r10 = r37.getIntent()
            java.lang.String r15 = "key_add_contact_desc_wording_id"
            r10.getStringExtra(r15)
            android.content.Intent r10 = r37.getIntent()
            java.lang.String r15 = "key_add_contact_desc_icon"
            r10.getStringExtra(r15)
            com.tencent.mm.storage.z1 r10 = r0.f202536n
            java.lang.String r15 = "Contact_QuanPin"
            java.lang.String r8 = "Contact_PyInitial"
            r32 = r2
            r33 = r3
            if (r10 == 0) goto L_0x05a8
            long r2 = r10.f108320R1
            int r3 = (int) r2
            if (r3 == 0) goto L_0x05a8
            java.lang.String r2 = r10.getUsername()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            int r2 = r2.length()
            if (r2 > 0) goto L_0x0408
            r10 = r29
            r3 = r30
            r2 = r31
            r29 = r9
            r34 = r23
            r23 = r1
            r1 = r22
            r22 = r6
            r6 = r24
            r24 = r7
            r7 = r34
            r35 = r25
            r26 = r4
            r25 = r5
            r4 = r35
            goto L_0x05c6
        L_0x0408:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            int r3 = r2.f149500H
            if (r3 != 0) goto L_0x0413
            r3 = r30
            r2.mo62900f4(r3)
        L_0x0413:
            if (r11 == 0) goto L_0x0420
            boolean r2 = r11.equals(r5)
            if (r2 != 0) goto L_0x0420
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62892b4(r11)
        L_0x0420:
            if (r12 == 0) goto L_0x042d
            boolean r2 = r12.equals(r5)
            if (r2 != 0) goto L_0x042d
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62865M3(r12)
        L_0x042d:
            if (r4 == 0) goto L_0x043a
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x043a
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62893c4(r4)
        L_0x043a:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r2 = r2.f149516U
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0451
            if (r13 == 0) goto L_0x0451
            boolean r2 = r13.equals(r5)
            if (r2 != 0) goto L_0x0451
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62902g4(r13)
        L_0x0451:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            int r2 = r2.mo73953E2()
            if (r2 != 0) goto L_0x0460
            if (r14 == 0) goto L_0x0460
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62894d3(r14)
        L_0x0460:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r2 = r2.f149554x0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0479
            if (r31 == 0) goto L_0x0479
            r2 = r31
            boolean r3 = r2.equals(r5)
            if (r3 != 0) goto L_0x0479
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62925q4(r2)
        L_0x0479:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r2 = r2.getNickname()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0495
            if (r29 == 0) goto L_0x0495
            r10 = r29
            boolean r2 = r10.equals(r5)
            if (r2 != 0) goto L_0x0497
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62878U2(r10)
            goto L_0x0497
        L_0x0495:
            r10 = r29
        L_0x0497:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = r0.f202538p
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "searchMobilePhone:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)
            java.lang.String r2 = r0.f202538p
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0515
            int r2 = r0.f202534i
            r3 = 15
            if (r2 != r3) goto L_0x0515
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r3 = r2.f149525Y0
            if (r3 == 0) goto L_0x04d6
            java.lang.String[] r2 = com.tencent.p014mm.contact.C1233a.m1356c(r2)
            if (r2 == 0) goto L_0x04d6
            int r4 = r2.length
            r11 = 0
        L_0x04c5:
            if (r11 >= r4) goto L_0x04d6
            r12 = r2[r11]
            java.lang.String r13 = r0.f202538p
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x04d3
            r2 = 0
            goto L_0x04d7
        L_0x04d3:
            int r11 = r11 + 1
            goto L_0x04c5
        L_0x04d6:
            r2 = 1
        L_0x04d7:
            if (r2 == 0) goto L_0x04fb
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = r0.f202538p
            r4.append(r3)
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            java.lang.String r3 = com.tencent.p014mm.contact.C1233a.m1355b(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.mo62891a4(r3)
            r2 = 0
            r0.f202538p = r2
        L_0x04fb:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r2 = r2.f149525Y0
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "contact PhoneList:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r3 = 15
            r2.mo62912k4(r3)
        L_0x0515:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r3 = r22
            r2.mo62870P3(r3)
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r3 = r25
            r2.mo62873R3(r3)
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r3 = r23
            r2.mo62875S3(r3)
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            boolean r2 = r2.mo62927s3()
            if (r2 != 0) goto L_0x0570
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r24)
            if (r2 != 0) goto L_0x053f
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r3 = r24
            r2.mo62857I2(r3)
        L_0x053f:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r2 != 0) goto L_0x054a
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62878U2(r10)
        L_0x054a:
            android.content.Intent r2 = r37.getIntent()
            java.lang.String r2 = r2.getStringExtra(r8)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x055d
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62882W2(r2)
        L_0x055d:
            android.content.Intent r2 = r37.getIntent()
            java.lang.String r2 = r2.getStringExtra(r15)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0570
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62884X2(r2)
        L_0x0570:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            boolean r2 = r2.mo62927s3()
            if (r2 != 0) goto L_0x0585
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 != 0) goto L_0x0585
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.f149532d1 = r9
            r3 = 1
            r2.f149550u = r3
        L_0x0585:
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            boolean r2 = r2.mo62927s3()
            if (r2 != 0) goto L_0x0596
            if (r7 == 0) goto L_0x0596
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.f149530c1 = r7
            r3 = 1
            r2.f149550u = r3
        L_0x0596:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x05a1
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62880V2(r1)
        L_0x05a1:
            r3 = r5
            r22 = r6
            r7 = r33
            goto L_0x06aa
        L_0x05a8:
            r10 = r29
            r3 = r30
            r2 = r31
            r34 = r23
            r23 = r1
            r1 = r22
            r22 = r6
            r6 = r24
            r24 = r7
            r7 = r34
            r35 = r25
            r26 = r4
            r25 = r5
            r4 = r35
            r29 = r9
        L_0x05c6:
            com.tencent.mm.storage.z1 r9 = new com.tencent.mm.storage.z1
            r9.<init>()
            r0.f202536n = r9
            r30 = r7
            r7 = r33
            r9.setUsername(r7)
            com.tencent.mm.storage.z1 r9 = r0.f202536n
            r9.mo62857I2(r6)
            com.tencent.mm.storage.z1 r6 = r0.f202536n
            r6.mo62878U2(r10)
            com.tencent.mm.storage.z1 r6 = r0.f202536n
            android.content.Intent r9 = r37.getIntent()
            java.lang.String r8 = r9.getStringExtra(r8)
            r6.mo62882W2(r8)
            com.tencent.mm.storage.z1 r6 = r0.f202536n
            android.content.Intent r8 = r37.getIntent()
            java.lang.String r8 = r8.getStringExtra(r15)
            r6.mo62884X2(r8)
            com.tencent.mm.storage.z1 r6 = r0.f202536n
            r6.mo62900f4(r3)
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62892b4(r11)
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62865M3(r12)
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62902g4(r13)
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62894d3(r14)
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            r3.mo62925q4(r2)
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62870P3(r1)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r2 = r21
            r1.mo62928s4(r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r2 = r19
            r1.mo62896e3(r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r2 = r20
            r1.mo62899f3(r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r1.mo62873R3(r4)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r2 = r30
            r1.mo62875S3(r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r2 = r26
            r1.mo62893c4(r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r2 = r27
            r1.f149528a1 = r2
            r2 = 1
            r1.f149550u = r2
            java.lang.String r1 = r0.f202538p
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0694
            int r1 = r0.f202534i
            r2 = 15
            if (r1 != r2) goto L_0x0694
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.s r1 = r1.mo105880F()
            com.tencent.mm.storage.a5 r1 = (com.tencent.p014mm.storage.C44651a5) r1
            com.tencent.mm.storage.z4 r1 = r1.mo69630Lo(r7)
            com.tencent.mm.storage.z4 r2 = new com.tencent.mm.storage.z4
            r2.<init>()
            r3 = r25
            r2.field_conRemark = r3
            r2.field_encryptUsername = r7
            java.lang.String r4 = r1.field_conRemark
            r2.field_conRemark = r4
            java.lang.String r4 = r1.field_conDescription
            r2.field_conDescription = r4
            java.lang.String r1 = r1.field_contactLabels
            r2.field_contactLabels = r1
            java.lang.String r1 = r0.f202538p
            r2.field_conPhone = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.s r1 = r1.mo105880F()
            com.tencent.mm.storage.a5 r1 = (com.tencent.p014mm.storage.C44651a5) r1
            r1.replace(r2)
            r1 = 0
            r0.f202538p = r1
            goto L_0x0696
        L_0x0694:
            r3 = r25
        L_0x0696:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r2 = r29
            r1.f149532d1 = r2
            r2 = 1
            r1.f149550u = r2
            r4 = r24
            r1.f149530c1 = r4
            r1.f149550u = r2
            r2 = r23
            r1.mo62880V2(r2)
        L_0x06aa:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85843n5(r1)
            r2 = 17
            if (r1 == 0) goto L_0x06e5
            int r1 = r0.f202534i
            r4 = 30
            if (r1 == r4) goto L_0x06c4
            r4 = 45
            if (r1 == r4) goto L_0x06c4
            if (r1 != r2) goto L_0x06e5
        L_0x06c4:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 15320(0x3bd8, float:2.1468E-41)
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.mm.storage.z1 r5 = r0.f202536n
            java.lang.String r5 = r5.mo73980x2()
            r8 = 0
            r6[r8] = r5
            int r5 = r0.f202534i
            if (r5 != r2) goto L_0x06da
            r5 = 2
            goto L_0x06db
        L_0x06da:
            r5 = 1
        L_0x06db:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 1
            r6[r8] = r5
            r1.mo160131h(r4, r6)
        L_0x06e5:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r1 != 0) goto L_0x06f3
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            r4 = r18
            r1.mo62874S2(r4)
            goto L_0x06f5
        L_0x06f3:
            r4 = r18
        L_0x06f5:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            if (r1 != 0) goto L_0x0701
            java.lang.String r1 = "contact = null"
            r5 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x074e
        L_0x0701:
            r5 = r22
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r1 != 0) goto L_0x0729
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.s r1 = r1.mo105880F()
            com.tencent.mm.storage.a5 r1 = (com.tencent.p014mm.storage.C44651a5) r1
            com.tencent.mm.storage.z4 r1 = r1.mo69630Lo(r4)
            if (r1 == 0) goto L_0x0729
            java.lang.String r4 = r1.field_encryptUsername
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0729
            com.tencent.mm.storage.z1 r4 = r0.f202536n
            java.lang.String r1 = r1.field_conRemark
            r4.mo62860K2(r1)
            goto L_0x074e
        L_0x0729:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r1 != 0) goto L_0x074e
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.s r1 = r1.mo105880F()
            com.tencent.mm.storage.a5 r1 = (com.tencent.p014mm.storage.C44651a5) r1
            com.tencent.mm.storage.z4 r1 = r1.mo69630Lo(r7)
            if (r1 == 0) goto L_0x074e
            java.lang.String r4 = r1.field_encryptUsername
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x074e
            com.tencent.mm.storage.z1 r4 = r0.f202536n
            java.lang.String r1 = r1.field_conRemark
            r4.mo62860K2(r1)
        L_0x074e:
            android.content.Intent r1 = r37.getIntent()
            com.tencent.mm.storage.z1 r4 = r0.f202536n
            java.lang.String r4 = r4.getUsername()
            r6 = r17
            r1.putExtra(r6, r4)
            if (r28 != 0) goto L_0x07a4
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            long r8 = r1.f108320R1
            int r4 = (int) r8
            if (r4 > 0) goto L_0x07a4
            boolean r1 = r1.mo62916m3()
            if (r1 == 0) goto L_0x07a4
            int r1 = r0.f202534i
            if (r1 == r2) goto L_0x0774
            r2 = 41
            if (r1 != r2) goto L_0x07a4
        L_0x0774:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            r4 = 0
            r2[r4] = r1
            java.lang.String r1 = "come from card, getContact %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r1, r2)
            eb0.w2 r1 = eb0.C31519v2.m39436a()
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r2 = r2.getUsername()
            r1.mo55987c(r2, r3)
            di3.d r1 = di3.C86312j.m106911c(r32)
            ln.i r1 = (p196ln.C76708i) r1
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r2 = r2.getUsername()
            r1.mo106823Jc(r2)
            r1 = 1
            r0.f202516B = r1
        L_0x07a4:
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.f149513S0
            if (r1 != 0) goto L_0x07af
            r1 = 1
            goto L_0x07b0
        L_0x07af:
            r1 = 0
        L_0x07b0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = 0
            r2[r4] = r1
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.f149513S0
            if (r1 != 0) goto L_0x07bf
            r1 = 0
            goto L_0x07c3
        L_0x07bf:
            int r1 = r1.length()
        L_0x07c3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r2[r4] = r1
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.f149513S0
            if (r1 != 0) goto L_0x07d2
            r1 = r3
            goto L_0x07d6
        L_0x07d2:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1)
        L_0x07d6:
            r4 = 2
            r2[r4] = r1
            java.lang.String r1 = "contact.getRemarkDesc() (%s, %s, %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r2)
            if (r28 != 0) goto L_0x0823
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            long r8 = r1.f108320R1
            int r2 = (int) r8
            if (r2 > 0) goto L_0x0823
            int r2 = r0.f202534i
            r4 = 96
            if (r2 != r4) goto L_0x0823
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getUsername()
            r6 = 0
            r4[r6] = r1
            java.lang.String r1 = "come from chatroom accessverify, getContact %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r4)
            eb0.w2 r1 = eb0.C31519v2.m39436a()
            com.tencent.mm.storage.z1 r4 = r0.f202536n
            java.lang.String r4 = r4.getUsername()
            android.content.Intent r6 = r37.getIntent()
            java.lang.String r8 = "key_add_contact_verify_ticket"
            java.lang.String r6 = r6.getStringExtra(r8)
            r1.mo55990g(r4, r2, r6)
            di3.d r1 = di3.C86312j.m106911c(r32)
            ln.i r1 = (p196ln.C76708i) r1
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r2 = r2.getUsername()
            r4 = 3
            r1.mo106848yE(r2, r4)
        L_0x0823:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x08ac
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 65825(0x10121, float:9.224E-41)
            r4 = 0
            java.lang.Object r1 = r1.mo119684e(r2, r4)
            java.lang.String r1 = (java.lang.String) r1
            r8 = 0
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r8)
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x086a
            com.tencent.mm.storage.z1 r6 = r0.f202536n
            r6.mo62873R3(r1)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r6 = 65826(0x10122, float:9.2242E-41)
            java.lang.Object r2 = r2.mo119684e(r6, r4)
            java.lang.String r2 = (java.lang.String) r2
            r1.mo62875S3(r2)
        L_0x086a:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r6 = 286721(0x46001, float:4.01782E-40)
            java.lang.Object r2 = r2.mo119684e(r6, r4)
            java.lang.String r2 = (java.lang.String) r2
            r1.mo62881V3(r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r6 = 286722(0x46002, float:4.01783E-40)
            java.lang.Object r2 = r2.mo119684e(r6, r4)
            java.lang.String r2 = (java.lang.String) r2
            r1.mo62883W3(r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r6 = 286723(0x46003, float:4.01784E-40)
            java.lang.Object r2 = r2.mo119684e(r6, r4)
            java.lang.String r2 = (java.lang.String) r2
            r1.mo62885X3(r2)
        L_0x08ac:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            if (r1 == 0) goto L_0x0924
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r2 = com.tencent.p014mm.storage.C72996z1.m85829Z5(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0924
            eb0.o4 r1 = eb0.C75590o4.m90740a()
            java.lang.String r2 = r1.mo105937d()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r4 = r1.mo105936c()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 != 0) goto L_0x08e7
            com.tencent.mm.storage.z1 r6 = r0.f202536n
            r6.mo62892b4(r2)
        L_0x08e7:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x08f2
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62865M3(r4)
        L_0x08f2:
            java.lang.String r2 = r1.f222070g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0909
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            java.lang.String r4 = r1.f222070g
            java.lang.String r6 = r1.f222072i
            java.lang.String r8 = r1.f222071h
            java.lang.String r4 = com.tencent.p014mm.storage.RegionCodeDecoder.m124564q(r4, r6, r8)
            r2.mo62893c4(r4)
        L_0x0909:
            int r2 = r1.f222065b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r2, (int) r4)
            java.lang.String r1 = r1.f222068e
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            com.tencent.mm.storage.z1 r4 = r0.f202536n
            r4.mo62900f4(r2)
            com.tencent.mm.storage.z1 r2 = r0.f202536n
            r2.mo62902g4(r1)
        L_0x0924:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0940
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            java.lang.String r2 = "username is null %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r1)
            r37.finish()
            return
        L_0x0940:
            r2 = 0
            r0.setMMTitle((java.lang.String) r3)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            com.tencent.mm.storage.z1 r3 = com.tencent.p014mm.plugin.profile.C42599h.f115274e
            if (r3 == 0) goto L_0x095a
            if (r1 == 0) goto L_0x095a
            java.lang.String r3 = r3.getUsername()
            java.lang.String r4 = r1.getUsername()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x095f
        L_0x095a:
            r3 = 0
            com.tencent.p014mm.plugin.profile.C42599h.f115275f = r3
            com.tencent.p014mm.plugin.profile.C42599h.f115276g = r3
        L_0x095f:
            com.tencent.p014mm.plugin.profile.C42599h.f115274e = r1
            android.content.Intent r1 = r37.getIntent()
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            java.lang.String r3 = r3.getUsername()
            r4 = 1
            com.tencent.p014mm.plugin.profile.C42599h.xx0(r1, r4, r4, r3)
            java.lang.String r1 = r0.f202539q
            r0.mo96581K7(r1)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI$$m r1 = new com.tencent.mm.plugin.profile.ui.ContactInfoUI$$m
            r1.<init>(r0)
            r0.setBackBtn(r1)
            java.lang.Class<ln.g> r1 = p196ln.C76706g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.g r1 = (p196ln.C76706g) r1
            ln.j r1 = r1.mo106847uz()
            com.tencent.mm.storage.z1 r3 = r0.f202536n
            java.lang.String r3 = r3.getUsername()
            com.tencent.mm.modelavatar.g r1 = (com.tencent.p014mm.modelavatar.C68082g) r1
            r1.mo93575b(r3)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85837h5(r1)
            if (r1 == 0) goto L_0x09ac
            int r1 = eb0.C75592q0.m90785o()
            r1 = r1 & 16
            if (r1 != 0) goto L_0x09a9
            r7 = 1
            goto L_0x09aa
        L_0x09a9:
            r7 = 0
        L_0x09aa:
            if (r7 != 0) goto L_0x09e6
        L_0x09ac:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85850u5(r1)
            if (r1 == 0) goto L_0x09c5
            int r1 = eb0.C75592q0.m90785o()
            r1 = r1 & 32
            if (r1 != 0) goto L_0x09c2
            r5 = 1
            goto L_0x09c3
        L_0x09c2:
            r5 = 0
        L_0x09c3:
            if (r5 != 0) goto L_0x09e6
        L_0x09c5:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85836g5(r1)
            if (r1 == 0) goto L_0x09d7
            boolean r1 = eb0.C75592q0.m90756D()
            if (r1 != 0) goto L_0x09e6
        L_0x09d7:
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85849t5(r1)
            if (r1 == 0) goto L_0x09e6
            eb0.C75592q0.m90785o()
        L_0x09e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI.initView():void");
    }

    /* renamed from: j4 */
    public void mo96589j4(Runnable runnable) {
        Log.m105918d("MicroMsg.ContactInfoUI", "setFinishCallback() called with: callback = [" + runnable + "]");
        this.f202528N = runnable;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            getIntent().putExtra("CONTACT_INFO_UI_SOURCE", intent.getIntExtra("CONTACT_INFO_UI_SOURCE", -1));
        }
        if (i2 != -1 || intent == null || !intent.getBooleanExtra("_delete_ok_", false)) {
            C67027a aVar = this.f202530e;
            if (aVar != null) {
                aVar.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        setResult(-1, getIntent().putExtra("_delete_ok_", true));
        finish();
    }

    public void onBackPressed() {
        if (!getSupportFragmentManager().isDestroyed()) {
            super.onBackPressed();
        }
        C46723f.m52019a(this.f202536n.getUsername(), 1501, this.f202534i, this.f202547y, getIntent());
    }

    public void onConfigurationChanged(Configuration configuration) {
        NormalProfileHeaderPreference normalProfileHeaderPreference;
        C72996z1 z1Var;
        RelativeLayout relativeLayout;
        super.onConfigurationChanged(configuration);
        this.f202546x = !C63347a.m74685c(this);
        PullDownListView pullDownListView = this.f202541s;
        if (pullDownListView != null && !pullDownListView.f220631I) {
            pullDownListView.mo104538n();
        }
        C77453j jVar = null;
        if (!(this.f202530e instanceof ContactWidgetTabBizInfo) && (((z1Var = this.f202536n) == null || !C72996z1.m85846q5(z1Var.getUsername())) && this.f202544v && (relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.gv5)) != null)) {
            if (this.f202517C != null) {
                relativeLayout.removeView(this.f202526L);
                relativeLayout.removeView(this.f202517C.getView());
                this.f202517C.mo72647c();
                this.f202517C = null;
            }
            this.f202542t = false;
            mo96583M7();
        }
        mo96585O7();
        C47511g gVar = this.f202529d;
        if (!(gVar == null || (normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal")) == null)) {
            jVar = normalProfileHeaderPreference.mo96613L();
        }
        if (jVar != null) {
            jVar.mo72650h(getIntent().getStringExtra("Contact_User"));
        }
        C67027a aVar = this.f202530e;
        if ((aVar instanceof C42660o0) || (aVar instanceof ContactWidgetTabBizInfo)) {
            setRequestedOrientation(1);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean f = C77448f0.m93394f();
        this.f202545w = f;
        this.f202544v = f && ((C79168k) C86312j.m106911c(C79168k.class)).mo74105BS(getIntent().getStringExtra("Contact_User"));
        C97625j3.m125812b().mo105907v().get(Util.nullAsNil(getIntent().getStringExtra("Contact_User")));
        this.f202543u = false;
        if (this.f202545w) {
            this.f202543u = false;
        }
        if (this.f202543u || this.f202544v) {
            customfixStatusbar(true);
        }
        super.onCreate(bundle);
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", true);
        this.f202523I = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_biz_show_profile_with_contact, 1);
        this.f202546x = !C63347a.m74685c(this);
        this.f202547y = System.currentTimeMillis();
        View findViewById = findViewById(C0966R.C0970id.f5383do);
        this.f202520F = findViewById;
        if (findViewById != null) {
            this.f202521G = findViewById.findViewById(C0966R.C0970id.f5386dr);
        }
        mo96585O7();
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        Log.m105925i("MicroMsg.ContactInfoUI", "onCreate MMCore.accHasReady[%b]", Boolean.valueOf(C97625j3.m125811a()));
        this.f202538p = getIntent().getStringExtra("Contact_Search_Mobile");
        if (!C86709a0.m107523b().mo121114l()) {
            finish();
            return;
        }
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        ((C44651a5) C97625j3.m125812b().mo105880F()).f121061e.add(this, (Looper) null);
        ((C30771q3) C97625j3.m125812b().mo105910y()).f82747e.add(this, (Looper) null);
        initView();
        hideActionbarLine();
        C67027a aVar = this.f202530e;
        if (aVar instanceof C67028b) {
            ((C67028b) aVar).onCreate();
        }
        C99069d dVar = C99069d.f290418a;
        C99069d.f290421d.f266266f = (long) C42599h.vx0(getIntent());
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C90830d.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(291, this);
        C67027a aVar2 = this.f202530e;
        if ((aVar2 instanceof C42660o0) || (aVar2 instanceof ContactWidgetTabBizInfo)) {
            setRequestedOrientation(1);
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.ContactInfoUI).mo86179qs(this, C76986a.Profile).E60(this, new ContactInfoUI$$j(this));
    }

    public void onDestroy() {
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", false);
        C99069d.f290421d.f266266f = 0;
        if (C86709a0.m107523b().mo121114l()) {
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
            ((C44651a5) C97625j3.m125812b().mo105880F()).f121061e.remove(this);
            ((C30771q3) C97625j3.m125812b().mo105910y()).f82747e.remove(this);
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f202530e == null);
        Log.m105925i("MicroMsg.ContactInfoUI", "onDestroy bodyWidget is null?%s", objArr);
        C67027a aVar = this.f202530e;
        if (aVar != null) {
            aVar.onDetach();
        }
        C67027a aVar2 = this.f202530e;
        if (aVar2 instanceof C67028b) {
            ((C67028b) aVar2).onDestroy();
        }
        if (C99019x.m128972d() != null) {
            ((C94901o) C99019x.m128972d()).mo131089I(this);
        }
        super.onDestroy();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C90830d.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(291, this);
        C42599h.xx0(getIntent(), 18, 1, this.f202536n.getUsername());
        C115669n.INSTANCE.mo160131h(17283, Integer.valueOf(C42599h.vx0(getIntent())), this.f202536n.getUsername(), Boolean.valueOf(this.f202543u), Boolean.FALSE, Integer.valueOf(this.f202536n.f149503K), 0);
        C77451h hVar = this.f202517C;
        if (hVar != null) {
            hVar.mo72647c();
        }
        C89779i0 i0Var = this.f202515A;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f202515A = null;
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105925i("MicroMsg.ContactInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        onNotifyChange((String) obj, (MStorageEventData) null);
    }

    public void onPause() {
        Class cls = C109759g.class;
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(4, "ContactInfoUI" + getIdentString(), hashCode());
        C48009v0.Fx0().remove(this);
        super.onPause();
        C86709a0.m107525e().postAtFrontOfQueueToWorker(new ContactInfoUI$$l(this));
        if (getIntent().getBooleanExtra("key_from_wesport_right_newtips", false)) {
            ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175771m(3, getActivityBrowseTimeMs());
        } else if (getIntent().getBooleanExtra("key_from_wesport_plugin_newtips", false)) {
            ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175771m(1, getActivityBrowseTimeMs());
        }
        mo96584N7();
        PullDownListView pullDownListView = this.f202541s;
        if (pullDownListView != null) {
            pullDownListView.mo104538n();
        }
        C67027a aVar = this.f202530e;
        if ((aVar instanceof C42660o0) || (aVar instanceof ContactWidgetTabBizInfo)) {
            aVar.onDetach();
        }
        C67027a aVar2 = this.f202530e;
        if (aVar2 instanceof C67028b) {
            ((C67028b) aVar2).onPause();
        }
        ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f202519E);
        C77451h hVar = this.f202517C;
        if (hVar != null) {
            hVar.mo72649m();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.ContactInfoUI", str + " item has been clicked!");
        C67027a aVar = this.f202530e;
        if (aVar != null) {
            aVar.mo5962y(str);
        }
        if (preference.f121285r.equals("contact_info_sns")) {
            C42599h.xx0(getIntent(), 3, 1, this.f202536n.getUsername());
        } else if (preference.f121285r.equals("contact_info_more")) {
            C42599h.xx0(getIntent(), 6, 1, this.f202536n.getUsername());
        }
        if (!(preference instanceof NormalProfileHeaderPreference)) {
            return false;
        }
        mo96582L7();
        return false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        int i2 = C0966R.string.f361130hi2;
        if (i != 19) {
            if (i == 82) {
                if (iArr[0] == 0) {
                    NormalUserFooterPreference normalUserFooterPreference = (NormalUserFooterPreference) this.f202529d.mo72519a("contact_info_footer_normal");
                    if (normalUserFooterPreference != null) {
                        normalUserFooterPreference.mo96623W();
                        return;
                    }
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new ContactInfoUI$$c(this), (DialogInterface.OnClickListener) null);
            }
        } else if (iArr[0] == 0) {
            NormalUserFooterPreference normalUserFooterPreference2 = (NormalUserFooterPreference) this.f202529d.mo72519a("contact_info_footer_normal");
            if (normalUserFooterPreference2 != null) {
                normalUserFooterPreference2.mo96624Y();
            }
        } else {
            if ("android.permission.CAMERA".equals(strArr[0])) {
                i2 = C0966R.string.hhq;
            }
            if (iArr[0] != 0) {
                C76879j.m92709C(this, getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new ContactInfoUI$$n(this), new ContactInfoUI$$b(this));
            }
        }
    }

    public void onRestart() {
        super.onRestart();
    }

    public void onResume() {
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(3, "ContactInfoUI" + getIdentString(), hashCode());
        C48009v0.Fx0().add(this);
        super.onResume();
        View focusedChild = ((ViewGroup) getContentView()).getFocusedChild();
        int i = 0;
        if (focusedChild != null) {
            focusedChild.clearFocus();
            Log.m105925i("MicroMsg.ContactInfoUI", "try to clear focus. id:%s", Integer.valueOf(focusedChild.getId()));
        }
        C47511g gVar = this.f202529d;
        if (gVar != null) {
            NormalProfileHeaderPreference normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal");
            this.f202531f = normalProfileHeaderPreference;
            if (normalProfileHeaderPreference != null) {
                View view = this.f202521G;
                if (view != null) {
                    i = view.getHeight();
                }
                this.f202531f.mo96616P(this.f202543u, i, this.f202544v);
            }
        }
        C67027a aVar = this.f202530e;
        if ((aVar instanceof C42660o0) || (aVar instanceof ContactWidgetTabBizInfo)) {
            aVar.mo5961x(this.f202529d, this.f202536n, this.f202532g, this.f202534i);
        }
        C67027a aVar2 = this.f202530e;
        if (aVar2 instanceof C67028b) {
            ((C67028b) aVar2).onResume();
        }
        ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f202519E);
        C77451h hVar = this.f202517C;
        if (hVar != null) {
            hVar.mo72648k();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C72996z1 z1Var;
        Log.m105919d("MicroMsg.ContactInfoUI", "onSceneEnd errType[%s] errCode[%s] errMsg[%s] sceneType[%s]", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        if (273 == yVar.getType() && (z1Var = this.f202536n) != null && (this.f202530e instanceof NewContactWidgetNormal)) {
            C7521g gVar = (C7521g) yVar;
            if (Util.isEqual(z1Var.getUsername(), (String) null)) {
                return;
            }
        }
        if (291 == yVar.getType() && this.f202536n != null) {
            new MMHandler().post(new ContactInfoUI$$p(this, this.f202536n.getUsername()));
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        Class cls = C47904x.class;
        super.superImportUIComponents(hashSet);
        hashSet.add(((C47904x) C86312j.m106911c(cls)).mo72662OC());
        hashSet.add(((C47904x) C86312j.m106911c(cls)).nf0());
        hashSet.add(((C79168k) C86312j.m106911c(C79168k.class)).mo74123Ye());
        hashSet.add(C91097v.class);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        new MMHandler().post(new ContactInfoUI$$p(this, str));
    }
}
