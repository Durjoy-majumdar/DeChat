package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAccountManagent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiAddGuideUI;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import er1.C58684b;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8794p5;
import it1.C9247b;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import org.json.JSONObject;
import pj3.C47511g;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48718ai1;
import te3.C50119ke1;
import te3.C50542nh0;
import te3.C51275so1;
import te3.C51627v10;
import te3.C51901x0;
import te3.C52261zg3;
import te3.C64553md1;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI */
public final class FinderSettingInfoUI extends MMPreference {

    /* renamed from: o */
    public static final /* synthetic */ int f17080o = 0;

    /* renamed from: d */
    public final String f17081d = "Finder.FinderSettingInfoUI";

    /* renamed from: e */
    public String f17082e;

    /* renamed from: f */
    public C58969q f17083f;

    /* renamed from: g */
    public C50119ke1 f17084g;

    /* renamed from: h */
    public C51901x0 f17085h;

    /* renamed from: i */
    public C9247b f17086i;

    /* renamed from: j */
    public final C13601g f17087j;

    /* renamed from: n */
    public final C3729d f17088n;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI$a */
    public static final class C3726a extends C87413o implements C32224a<C3863m3> {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingInfoUI f17089d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3726a(FinderSettingInfoUI finderSettingInfoUI) {
            super(0);
            this.f17089d = finderSettingInfoUI;
        }

        public Object invoke() {
            return new C3863m3(this.f17089d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI$b */
    public static final class C3727b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingInfoUI f17090d;

        public C3727b(FinderSettingInfoUI finderSettingInfoUI) {
            this.f17090d = finderSettingInfoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17090d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI$c */
    public static final class C3728c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingInfoUI f17091d;

        public C3728c(FinderSettingInfoUI finderSettingInfoUI) {
            this.f17091d = finderSettingInfoUI;
        }

        public final void run() {
            FinderSettingInfoUI finderSettingInfoUI = this.f17091d;
            int i = FinderSettingInfoUI.f17080o;
            finderSettingInfoUI.mo4116I7(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI$d */
    public static final class C3729d implements C8794p5<C64553md1> {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingInfoUI f17092d;

        public C3729d(FinderSettingInfoUI finderSettingInfoUI) {
            this.f17092d = finderSettingInfoUI;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C64553md1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            String str = this.f17092d.f17081d;
            Log.m105924i(str, "profileSettingCallback, " + nh02.f138603e);
            if (nh02.f138603e != 0) {
                Preference a = this.f17092d.getPreferenceScreen().mo72519a("settings_show_my_finder");
                C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                ((CheckBoxPreference) a).mo6805K(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8929h());
                FinderSettingInfoUI finderSettingInfoUI = this.f17092d;
                C76912y0.makeText((Context) finderSettingInfoUI, (CharSequence) finderSettingInfoUI.getString(C0966R.string.et6), 0).show();
            }
            C9247b bVar = this.f17092d.f17086i;
            if (bVar != null) {
                bVar.mo8913b();
            }
        }
    }

    public FinderSettingInfoUI() {
        new FinderSettingInfoUI$coverSetEvent$1(this, C40008f.f107254d);
        this.f17087j = C36568h.m40985a(new C3726a(this));
        this.f17088n = new C3729d(this);
    }

    /* renamed from: H7 */
    public final void mo4115H7() {
        C9247b bVar = this.f17086i;
        if (bVar != null) {
            bVar.mo8913b();
        }
        C9247b.C9248a aVar = C9247b.f28989d;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C9247b a = C9247b.C9248a.m8889a(aVar, context, getContext().getString(C0966R.string.a4d), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        this.f17086i = a;
        a.begin();
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [com.tencent.mm.ui.base.preference.Preference] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0235  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4116I7(boolean r18) {
        /*
            r17 = this;
            r12 = r17
            java.lang.Class<dp1.y0> r13 = dp1.C58417y0.class
            fe1.d$b r0 = fe1.C58961d.f168673a
            java.lang.String r1 = r12.f17082e
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            fe1.q r0 = r0.mo84155b(r1)
            r12.f17083f = r0
            if (r0 != 0) goto L_0x0018
            r17.finish()
            return
        L_0x0018:
            te3.ke1 r0 = r12.f17084g
            r1 = 0
            if (r0 == 0) goto L_0x0047
            java.util.LinkedList<te3.zg3> r0 = r0.f136709z
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            r3 = r2
            te3.zg3 r3 = (te3.C52261zg3) r3
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f145918e
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.username
            goto L_0x003a
        L_0x0039:
            r3 = r1
        L_0x003a:
            java.lang.String r4 = r12.f17082e
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x0025
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            te3.zg3 r2 = (te3.C52261zg3) r2
            goto L_0x0048
        L_0x0047:
            r2 = r1
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            te3.v10 r0 = r2.f145920g
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            java.lang.String r3 = "settings_data"
            r14 = 1
            if (r0 != 0) goto L_0x005c
            pj3.g r0 = r17.getPreferenceScreen()
            r0.mo72529n(r3, r14)
            goto L_0x0066
        L_0x005c:
            pj3.g r4 = r17.getPreferenceScreen()
            boolean r0 = r0.f143237d
            r0 = r0 ^ r14
            r4.mo72529n(r3, r0)
        L_0x0066:
            if (r2 == 0) goto L_0x006b
            te3.so1 r0 = r2.f145932v
            goto L_0x006c
        L_0x006b:
            r0 = r1
        L_0x006c:
            java.lang.String r2 = "settings_poi"
            r15 = 0
            if (r0 != 0) goto L_0x007a
            pj3.g r0 = r17.getPreferenceScreen()
            r0.mo72529n(r2, r14)
            goto L_0x0088
        L_0x007a:
            pj3.g r3 = r17.getPreferenceScreen()
            int r0 = r0.f141646d
            if (r0 != 0) goto L_0x0084
            r0 = 1
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            r3.mo72529n(r2, r0)
        L_0x0088:
            er1.w3 r0 = er1.C58784w3.f168295a
            r0.getClass()
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r3 = r2.mo90662O5()
            r4 = 2
            bd1.b r3 = zc1.C66783a.C66784a.m78798a(r2, r3, r15, r4, r1)
            if (r3 == 0) goto L_0x009d
            int r3 = r3.field_extFlag
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 & r5
            if (r3 == 0) goto L_0x00a5
            r3 = 1
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            java.lang.String r5 = "settings_mp_identity_switch"
            if (r3 == 0) goto L_0x0193
            bd1.b r3 = zc1.C66783a.C66784a.m78800c(r2, r15, r14, r1)
            if (r3 == 0) goto L_0x00b6
            boolean r3 = r3.mo75252n2()
            goto L_0x00b7
        L_0x00b6:
            r3 = 0
        L_0x00b7:
            if (r3 != 0) goto L_0x0193
            pj3.g r3 = r17.getPreferenceScreen()
            r3.mo72529n(r5, r15)
            pj3.g r3 = r17.getPreferenceScreen()
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r5)
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference"
            gy3.C87412m.m108592e(r3, r5)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r3 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r3
            r3.f121290w = r15
            r0.getClass()
            java.lang.String r5 = r2.mo90662O5()
            bd1.b r2 = zc1.C66783a.C66784a.m78798a(r2, r5, r15, r4, r1)
            if (r2 == 0) goto L_0x00e1
            int r2 = r2.field_extFlag
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r4
            if (r2 == 0) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            java.lang.String r4 = "switch_identity_to_bizuin_close"
            java.lang.String r5 = "context"
            if (r2 == 0) goto L_0x0155
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r6 = "FinderDisableMpIdentityTip"
            java.lang.String r2 = r2.mo107405c(r6)
            boolean r6 = r2 instanceof java.lang.String
            if (r6 == 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r2 = r1
        L_0x010e:
            if (r2 == 0) goto L_0x0119
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r6 = 0
            goto L_0x011a
        L_0x0119:
            r6 = 1
        L_0x011a:
            if (r6 == 0) goto L_0x012b
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131829196(0x7f1121cc, float:1.9291354E38)
            java.lang.String r2 = r2.getString(r6)
        L_0x012b:
            if (r2 != 0) goto L_0x012f
            java.lang.String r2 = ""
        L_0x012f:
            r3.mo7741E(r2)
            r3.mo6805K(r15)
            r3.mo69932y(r15)
            if (r18 == 0) goto L_0x019a
            dp1.f2 r2 = dp1.C7435f2.f25626a
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r6 = r17.getContext()
            gy3.C87412m.m108593f(r6, r5)
            rs1.s8 r3 = r3.mo12873f(r6)
            if (r3 == 0) goto L_0x0150
            te3.hj1 r3 = r3.mo12861q3()
            goto L_0x0151
        L_0x0150:
            r3 = r1
        L_0x0151:
            r2.mo8577a(r3, r4, r15, r1)
            goto L_0x019a
        L_0x0155:
            boolean r2 = r0.mo83902T0()
            androidx.appcompat.app.AppCompatActivity r6 = r17.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131829195(0x7f1121cb, float:1.9291352E38)
            java.lang.String r6 = r6.getString(r7)
            r3.mo7741E(r6)
            r3.mo6805K(r2)
            r3.mo69932y(r14)
            if (r18 == 0) goto L_0x019a
            dp1.f2 r3 = dp1.C7435f2.f25626a
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r7 = r17.getContext()
            gy3.C87412m.m108593f(r7, r5)
            rs1.s8 r5 = r6.mo12873f(r7)
            if (r5 == 0) goto L_0x0189
            te3.hj1 r5 = r5.mo12861q3()
            goto L_0x018a
        L_0x0189:
            r5 = r1
        L_0x018a:
            if (r2 == 0) goto L_0x018f
            java.lang.String r4 = "switch_identity_to_bizuin_open"
        L_0x018f:
            r3.mo8577a(r5, r4, r15, r1)
            goto L_0x019a
        L_0x0193:
            pj3.g r2 = r17.getPreferenceScreen()
            r2.mo72529n(r5, r14)
        L_0x019a:
            pj3.g r2 = r17.getPreferenceScreen()
            java.lang.String r3 = "preferenceScreen"
            gy3.C87412m.m108593f(r2, r3)
            er1.l3 r3 = er1.C7827l3.f26365a
            boolean r3 = r3.mo8930i()
            java.lang.String r4 = "settings_show_my_finder"
            if (r3 == 0) goto L_0x0235
            java.lang.String r3 = "Finder.FinderUIUtil"
            java.lang.String r5 = "initWxProfileSettingPref"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            r2.mo72529n(r4, r15)
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r4)
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference
            if (r3 == 0) goto L_0x01c3
            r1 = r2
            com.tencent.mm.ui.base.preference.CheckBoxPreference r1 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r1
        L_0x01c3:
            if (r1 == 0) goto L_0x0238
            r1.f121290w = r15
            boolean r0 = r0.mo83904U0()
            r1.mo6805K(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r2 = 2131829912(0x7f112498, float:1.9292807E38)
            java.lang.String r2 = r12.getString(r2)
            r0.append(r2)
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            r3 = 2131829913(0x7f112499, float:1.9292809E38)
            java.lang.String r3 = r12.getString(r3)
            r4 = 0
            android.text.SpannableString r2 = r2.Te0(r12, r3, r4)
            er1.u3 r9 = new er1.u3
            r9.<init>(r12, r14)
            com.tencent.mm.plugin.finder.view.g5 r10 = new com.tencent.mm.plugin.finder.view.g5
            java.lang.String r4 = r2.toString()
            java.lang.String r3 = "forwardStr.toString()"
            gy3.C87412m.m108593f(r4, r3)
            android.content.res.Resources r3 = r17.getResources()
            r5 = 2131099850(0x7f0600ca, float:1.7812065E38)
            int r5 = r3.getColor(r5)
            android.content.res.Resources r3 = r17.getResources()
            r6 = 2131099862(0x7f0600d6, float:1.781209E38)
            int r6 = r3.getColor(r6)
            r7 = 0
            r8 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r2.length()
            r4 = 17
            r2.setSpan(r10, r15, r3, r4)
            r0.append(r2)
            r1.mo7741E(r0)
            er1.t3 r2 = new er1.t3
            r2.<init>(r1, r0)
            r1.f24223X = r2
            r0 = 1
            goto L_0x0239
        L_0x0235:
            r2.mo72529n(r4, r14)
        L_0x0238:
            r0 = 0
        L_0x0239:
            java.lang.String r11 = "getService(FinderReportLogic::class.java)"
            if (r0 == 0) goto L_0x025d
            if (r18 == 0) goto L_0x025d
            di3.d r0 = di3.C86312j.m106911c(r13)
            gy3.C87412m.m108593f(r0, r11)
            dp1.y0 r0 = (dp1.C58417y0) r0
            r2 = 12
            r4 = 2
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 120(0x78, float:1.68E-43)
            r16 = 0
            r1 = r17
            r14 = r11
            r11 = r16
            dp1.C58417y0.fy0(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11)
            goto L_0x025e
        L_0x025d:
            r14 = r11
        L_0x025e:
            te3.x0 r0 = r12.f17085h
            if (r0 == 0) goto L_0x0263
            r15 = 1
        L_0x0263:
            pj3.g r0 = r17.getPreferenceScreen()
            r1 = r15 ^ 1
            java.lang.String r2 = "account_management"
            r0.mo72529n(r2, r1)
            if (r15 == 0) goto L_0x0289
            di3.d r0 = di3.C86312j.m106911c(r13)
            gy3.C87412m.m108593f(r0, r14)
            dp1.y0 r0 = (dp1.C58417y0) r0
            r2 = 10
            r4 = 2
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 120(0x78, float:1.68E-43)
            r11 = 0
            r1 = r17
            dp1.C58417y0.fy0(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11)
        L_0x0289:
            pj3.g r0 = r17.getPreferenceScreen()
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderSettingInfoUI.mo4116I7(boolean):void");
    }

    public int getResourceId() {
        return C0966R.xml.f8900av;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this);
        if (f != null) {
            f.mo12842I3(130, 0);
        }
        this.f17082e = C66785b.f191882e.mo90662O5();
        String str = this.f17081d;
        Log.m105924i(str, "myFinderUser " + this.f17082e);
        setMMTitle((int) C0966R.string.eor);
        setBackBtn(new C3727b(this));
        getPreferenceScreen().mo72529n("settings_show_my_finder", true);
        getPreferenceScreen().notifyDataSetChanged();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderSettingInfoUI).mo86179qs(this, C76986a.Finder);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C48718ai1 ai12;
        C52261zg3 zg32;
        C51627v10 v102;
        LinkedList<C52261zg3> linkedList;
        T t;
        C52261zg3 zg33;
        C51275so1 so12;
        LinkedList<C52261zg3> linkedList2;
        T t2;
        Class cls = C3605p1.class;
        Class cls2 = C58684b.class;
        Class cls3 = C58417y0.class;
        C87412m.m108591d(preference);
        String str = preference.f121285r;
        Log.m105924i(this.f17081d, "click " + str);
        if (str == null) {
            return true;
        }
        C13598b0 b0Var = null;
        switch (str.hashCode()) {
            case -1298291467:
                if (!str.equals("settings_avatar")) {
                    return true;
                }
                Intent intent = new Intent();
                intent.setClass(this, FinderSettingDetailInfoUI.class);
                AppCompatActivity context = getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSettingInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/ui/FinderSettingInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C7335d c = C86312j.m106911c(cls3);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0.fy0((C58417y0) c, this, 1, 1, false, 0, 0, (String) null, 120, (Object) null);
                return true;
            case -1271745684:
                if (!str.equals("settings_privacy")) {
                    return true;
                }
                Intent intent2 = new Intent();
                intent2.setClass(this, FinderSettingPrivacyUI.class);
                C50119ke1 ke12 = this.f17084g;
                if (!(ke12 == null || (ai12 = ke12.f136703t) == null)) {
                    intent2.putExtra("privacy_settings", ai12.toByteArray());
                }
                AppCompatActivity context2 = getContext();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                AppCompatActivity appCompatActivity2 = context2;
                C117292a.m165358d(appCompatActivity2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSettingInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(appCompatActivity2, "com/tencent/mm/plugin/finder/ui/FinderSettingInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C7335d c2 = C86312j.m106911c(cls3);
                C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                C58417y0.fy0((C58417y0) c2, this, 5, 1, false, 0, 0, (String) null, 120, (Object) null);
                return true;
            case -874862379:
                String str2 = "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference";
                if (!str.equals("settings_mp_identity_switch")) {
                    return true;
                }
                Preference a = getPreferenceScreen().mo72519a("settings_mp_identity_switch");
                C87412m.m108592e(a, str2);
                boolean J = ((CheckBoxPreference) a).mo6804J();
                if (J == C58784w3.f168295a.mo83902T0()) {
                    return true;
                }
                Log.m105924i(this.f17081d, "change isShowSettingMpIdentitySwitch, now:" + J);
                mo4115H7();
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                AppCompatActivity context3 = getContext();
                C87412m.m108593f(context3, "context");
                C13442s8 f = aVar3.mo12873f(context3);
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, J ? "switch_identity_to_bizuin_open" : "switch_identity_to_bizuin_close", 1, (JSONObject) null);
                ((C3605p1) C86312j.m106911c(cls)).Y20(J, (C3863m3) ((C36570n) this.f17087j).getValue());
                return true;
            case -843864278:
                if (!str.equals("settings_qrcode")) {
                    return true;
                }
                ((C58684b) C86312j.m106911c(cls2)).getClass();
                Intent intent3 = new Intent();
                intent3.setClass(this, FinderSelfQRCodeUI.class);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent3);
                C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterSelfQRCodeUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterSelfQRCodeUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C7335d c3 = C86312j.m106911c(cls3);
                C87412m.m108593f(c3, "getService(FinderReportLogic::class.java)");
                C58417y0.fy0((C58417y0) c3, this, 2, 1, false, 0, 0, (String) null, 120, (Object) null);
                return true;
            case -604632506:
                if (!str.equals("settings_data")) {
                    return true;
                }
                C50119ke1 ke13 = this.f17084g;
                if (ke13 == null || (linkedList = ke13.f136709z) == null) {
                    zg32 = null;
                } else {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            t = it.next();
                            FinderContact finderContact = ((C52261zg3) t).f145918e;
                            if (C87412m.m108589b(finderContact != null ? finderContact.username : null, this.f17082e)) {
                            }
                        } else {
                            t = null;
                        }
                    }
                    zg32 = (C52261zg3) t;
                }
                if (zg32 == null || (v102 = zg32.f145920g) == null) {
                    return true;
                }
                int i = v102.f143238e;
                if (i == 1) {
                    if (Util.isNullOrNil(v102.f143239f)) {
                        return true;
                    }
                    Intent intent4 = new Intent();
                    intent4.putExtra("rawUrl", v102.f143239f);
                    C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent4, (Bundle) null);
                    return true;
                } else if (i != 2) {
                    return true;
                } else {
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar5 = startAppBrandUIFromOuterEvent.f9522d;
                    aVar5.f9526a = v102.f143240g;
                    aVar5.f9527b = v102.f143241h;
                    aVar5.f9529d = 1201;
                    startAppBrandUIFromOuterEvent.publish();
                    return true;
                }
            case -415165035:
                if (!str.equals("account_management")) {
                    return true;
                }
                Intent intent5 = new Intent();
                C7335d c4 = C86312j.m106911c(cls3);
                C87412m.m108593f(c4, "getService(FinderReportLogic::class.java)");
                C58417y0.fy0((C58417y0) c4, this, 10, 1, false, 0, 0, (String) null, 120, (Object) null);
                C51901x0 x0Var = this.f17085h;
                if (x0Var == null) {
                    return true;
                }
                intent5.putExtra("ACCOUNT_EXTRA_CONFIG", x0Var.toByteArray());
                intent5.putExtra("ACCOUNT_USERNAME", this.f17082e);
                ((C58684b) C86312j.m106911c(cls2)).getClass();
                intent5.setClass(this, FinderAccountManagent.class);
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(intent5);
                C117292a.m165358d(this, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterAccountManagementUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar6.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterAccountManagementUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 534697006:
                if (!str.equals("settings_poi")) {
                    return true;
                }
                C50119ke1 ke14 = this.f17084g;
                if (ke14 == null || (linkedList2 = ke14.f136709z) == null) {
                    zg33 = null;
                } else {
                    Iterator<T> it4 = linkedList2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            t2 = it4.next();
                            FinderContact finderContact2 = ((C52261zg3) t2).f145918e;
                            if (C87412m.m108589b(finderContact2 != null ? finderContact2.username : null, this.f17082e)) {
                            }
                        } else {
                            t2 = null;
                        }
                    }
                    zg33 = (C52261zg3) t2;
                }
                if (!(zg33 == null || (so12 = zg33.f145932v) == null)) {
                    if (so12.f141648f == 1) {
                        getIntent().putExtra("rawUrl", so12.f141650h);
                        C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", getIntent(), (Bundle) null);
                    } else if (so12.f141646d == 1 && so12.f141649g == 1) {
                        C7335d c5 = C86312j.m106911c(cls2);
                        C87412m.m108593f(c5, "getService(ActivityRouter::class.java)");
                        C58684b bVar = (C58684b) c5;
                        Intent intent6 = new Intent();
                        intent6.setClass(this, FinderPoiAddGuideUI.class);
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(intent6);
                        C117292a.m165358d(this, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterPoiAddGuide", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar7.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterPoiAddGuide", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        ((C58684b) C86312j.m106911c(cls2)).my0(this, (Intent) null);
                    }
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var != null) {
                    return true;
                }
                Log.m105924i(this.f17081d, "poi info error");
                return true;
            case 604599027:
                if (!str.equals("settings_show_my_finder")) {
                    return true;
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU2_INT_SYNC, 1);
                C7335d c6 = C86312j.m106911c(cls3);
                C87412m.m108593f(c6, "getService(FinderReportLogic::class.java)");
                C58417y0.fy0((C58417y0) c6, this, 12, 1, false, 0, 0, (String) null, 120, (Object) null);
                Preference a2 = getPreferenceScreen().mo72519a("settings_show_my_finder");
                C87412m.m108592e(a2, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                boolean J2 = ((CheckBoxPreference) a2).mo6804J();
                if (J2 == C58784w3.f168295a.mo83904U0()) {
                    return true;
                }
                Log.m105924i(this.f17081d, "change isShowAtWxProfile, now:" + J2);
                mo4115H7();
                ((C3605p1) C86312j.m106911c(cls)).mo3985kH(J2, this.f17088n);
                return true;
            default:
                return true;
        }
    }

    public void onResume() {
        Class cls = C58417y0.class;
        super.onResume();
        getContentView().post(new C3728c(this));
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this, 1, 2, false, 0, 0, (String) null, 120, (Object) null);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c2, this, 2, 2, false, 0, 0, (String) null, 120, (Object) null);
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c3, this, 5, 2, false, 0, 0, (String) null, 120, (Object) null);
        C53895h.m60466d(getLifecycleAsyncScope(), (C66212f) null, (C53934p0) null, new C3857l3(this, (C15601d<? super C3857l3>) null), 3, (Object) null);
    }
}
