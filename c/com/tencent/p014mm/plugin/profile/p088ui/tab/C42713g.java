package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.ProfileLiveNotifyTextLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import fy0.C8219i;
import gy3.C8477a0;
import gy3.C87412m;
import ht1.C76243a5;
import ht1.C8797q5;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kf2.C46723f;
import kg3.C76577a;
import l31.C61212e;
import p565ir.C60606n;
import qo3.C89779i0;
import rx3.C13604l;
import sf0.C48374j0;
import sx3.C90364q0;
import te3.C49001ch;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C51098rf;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.g */
public final class C42713g {

    /* renamed from: a */
    public final MMActivity f115667a;

    /* renamed from: b */
    public C49001ch f115668b;

    /* renamed from: c */
    public final View f115669c;

    /* renamed from: d */
    public final long f115670d;

    /* renamed from: e */
    public View f115671e;

    /* renamed from: f */
    public TextView f115672f;

    /* renamed from: g */
    public View f115673g;

    /* renamed from: h */
    public ProfileLiveNotifyTextLayout f115674h;

    /* renamed from: i */
    public View f115675i;

    /* renamed from: j */
    public TextView f115676j;

    /* renamed from: k */
    public View f115677k;

    /* renamed from: l */
    public View f115678l;

    /* renamed from: m */
    public final Context f115679m;

    /* renamed from: n */
    public C51098rf f115680n;

    /* renamed from: o */
    public C89779i0 f115681o;

    /* renamed from: p */
    public C8797q5 f115682p;

    public C42713g(MMActivity mMActivity, C49001ch chVar, View view, long j) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(chVar, "profileInfo");
        C87412m.m108594g(view, "rootView");
        this.f115667a = mMActivity;
        this.f115668b = chVar;
        this.f115669c = view;
        this.f115670d = j;
        View findViewById = view.findViewById(C0966R.C0970id.nkc);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…_live_notify_card_new_id)");
        this.f115671e = findViewById;
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.bmd);
        C87412m.m108593f(findViewById2, "liveNotifyContainer.find…_header_live_desc_timing)");
        this.f115672f = (TextView) findViewById2;
        View findViewById3 = this.f115671e.findViewById(C0966R.C0970id.bmb);
        C87412m.m108593f(findViewById3, "liveNotifyContainer.find…ader_live_desc_container)");
        this.f115673g = findViewById3;
        View findViewById4 = this.f115671e.findViewById(C0966R.C0970id.bmc);
        C87412m.m108593f(findViewById4, "liveNotifyContainer.find…_header_live_desc_detail)");
        this.f115674h = (ProfileLiveNotifyTextLayout) findViewById4;
        View findViewById5 = this.f115671e.findViewById(C0966R.C0970id.bmi);
        C87412m.m108593f(findViewById5, "liveNotifyContainer.find…live_subscribe_container)");
        this.f115675i = findViewById5;
        View findViewById6 = this.f115671e.findViewById(C0966R.C0970id.bmh);
        C87412m.m108593f(findViewById6, "liveNotifyContainer.find…iz_header_live_subscribe)");
        this.f115676j = (TextView) findViewById6;
        View findViewById7 = this.f115671e.findViewById(C0966R.C0970id.bmg);
        C87412m.m108593f(findViewById7, "liveNotifyContainer.find…z_header_live_right_icon)");
        this.f115677k = findViewById7;
        View findViewById8 = this.f115671e.findViewById(C0966R.C0970id.mok);
        C87412m.m108593f(findViewById8, "liveNotifyContainer.find…ader_live_more_container)");
        this.f115678l = findViewById8;
        AppCompatActivity context = mMActivity.getContext();
        C87412m.m108593f(context, "activity.context");
        this.f115679m = context;
        if (this.f115668b.f131721u.size() > 0) {
            this.f115680n = this.f115668b.f131721u.getFirst();
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "init liveNoticeInfo ok!");
        }
    }

    /* renamed from: a */
    public static final void m46405a(C42713g gVar, boolean z) {
        if (gVar.mo66866b()) {
            String b = C48374j0.m53713b(gVar.f115668b.f131719s.f138039d);
            Context context = gVar.f115679m;
            gVar.f115681o = C89779i0.m112248e(context, context.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            int i = z ? 1 : 2;
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "try to send cgi, sendCgiType = " + i);
            C87412m.m108593f(b, "finderUserName");
            C51098rf rfVar = gVar.f115680n;
            C87412m.m108591d(rfVar);
            String str = rfVar.f140874g;
            C87412m.m108593f(str, "liveNoticeInfoFirst!!.notice_id");
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85074n5(b, str, i, (C49712hj1) null, 1).mo9225i().mo123420E(new C42702b(gVar, z, b));
        }
    }

    /* renamed from: b */
    public final boolean mo66866b() {
        C51098rf rfVar = this.f115680n;
        if (rfVar == null) {
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "liveInfo == null");
            return false;
        }
        C87412m.m108591d(rfVar);
        if (!Util.isNullOrNil(rfVar.f140874g)) {
            C51098rf rfVar2 = this.f115680n;
            C87412m.m108591d(rfVar2);
            if (rfVar2.f140871d != 0) {
                if (this.f115668b.f131719s.f138039d.f257327a.length != 0) {
                    return true;
                }
                Log.m105924i("ContactBizHeaderLiveNoticeLogic", "finder username is empty");
                return false;
            }
        }
        Object[] objArr = new Object[2];
        C51098rf rfVar3 = this.f115680n;
        C87412m.m108591d(rfVar3);
        objArr[0] = Boolean.valueOf(Util.isNullOrNil(rfVar3.f140874g));
        C51098rf rfVar4 = this.f115680n;
        C87412m.m108591d(rfVar4);
        objArr[1] = Boolean.valueOf(rfVar4.f140871d == 0);
        Log.m105925i("ContactBizHeaderLiveNoticeLogic", "notice_id is empty? %s, start_time == 0? %s", objArr);
        return false;
    }

    /* renamed from: c */
    public final void mo66867c(boolean z) {
        String str;
        if (z) {
            str = this.f115679m.getResources().getString(C0966R.string.d5t);
            C87412m.m108593f(str, "{ //已预约\n            mCon…tn_book_cancel)\n        }");
        } else {
            str = this.f115679m.getResources().getString(C0966R.string.d5s);
            C87412m.m108593f(str, "{ //未预约\n            mCon…otice_btn_book)\n        }");
        }
        this.f115676j.setText(str);
        View view = this.f115677k;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "refreshNoticeBtnStatue", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "refreshNoticeBtnStatue", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public final void mo66868d() {
        Class cls = C76243a5.class;
        if (!mo66866b()) {
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "check fail!");
            View view = this.f115671e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f115671e;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f115669c.getTag(C0966R.C0970id.a_v) == null) {
            this.f115669c.setTag(C0966R.C0970id.a_v, Boolean.TRUE);
            C46723f.m52020b(this.f115668b.f131707d.f140834d, 1701, this.f115670d, this.f115667a.getIntent());
        }
        C51098rf rfVar = this.f115680n;
        if (rfVar != null) {
            String b = C48374j0.m53713b(this.f115668b.f131719s.f138039d);
            View view5 = this.f115675i;
            C87412m.m108593f(b, "finderUserName");
            boolean z = this.f115677k.getVisibility() == 0;
            Class cls2 = C61212e.class;
            ((C61212e) C86312j.m106911c(cls2)).o30(view5, "live_reserve_gzh_profile");
            ((C61212e) C86312j.m106911c(cls2)).mo86175pO(view5, 8, 25653);
            ((C61212e) C86312j.m106911c(cls2)).mo86175pO(view5, 32, 25652);
            ((C61212e) C86312j.m106911c(cls2)).mo86149PM(view5, C90364q0.m113149h(C90364q0.m113147f(new C13604l("finder_username", b), new C13604l("live_notice_id", rfVar.f140874g), new C13604l("show_type", 0)), ((C76243a5) C86312j.m106911c(cls)).Yo0()));
            ((C61212e) C86312j.m106911c(cls2)).E60(view5, new C5017f(z));
        }
        View view6 = this.f115671e;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view7 = view6;
        C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initDisplayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initDisplayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C8219i iVar = C8219i.f27144a;
        iVar.mo9271b(this.f115672f);
        iVar.mo9271b(this.f115676j);
        C51098rf rfVar2 = this.f115680n;
        C87412m.m108591d(rfVar2);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderUtilService::class.java)");
        String Tq = ((C76243a5) c).mo13223Tq(((long) rfVar2.f140871d) * 1000, Boolean.FALSE, true);
        Log.m105924i("ContactBizHeaderLiveNoticeLogic", "noticeTimeStr = " + Tq);
        this.f115672f.setText(this.f115679m.getResources().getString(C0966R.string.d5x, new Object[]{Tq}));
        C51098rf rfVar3 = this.f115680n;
        C87412m.m108591d(rfVar3);
        String str = null;
        if (Util.isNullOrNil(rfVar3.f140873f)) {
            this.f115674h.setVisibility(8);
            C16569a aVar4 = new C16569a();
            View view8 = this.f115673g;
            C87412m.m108592e(view8, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            aVar4.mo16716c((ConstraintLayout) view8);
            aVar4.mo16717d(C0966R.C0970id.bmc, 4, 0, 4);
            View view9 = this.f115673g;
            C87412m.m108592e(view9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) view9;
            aVar4.mo16714a(constraintLayout);
            constraintLayout.setConstraintSet((C16569a) null);
        } else {
            ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout = this.f115674h;
            C51098rf rfVar4 = this.f115680n;
            C87412m.m108591d(rfVar4);
            String str2 = rfVar4.f140873f;
            C87412m.m108593f(str2, "liveNoticeInfoFirst!!.introduction");
            profileLiveNotifyTextLayout.getClass();
            profileLiveNotifyTextLayout.f115812f.mo104279b(str2);
            profileLiveNotifyTextLayout.f115813g.mo104279b(str2);
            if (((NeatLayout) profileLiveNotifyTextLayout.f115812f.mo154990i(C76577a.m92145A(profileLiveNotifyTextLayout.getContext()) - C76577a.m92151b(profileLiveNotifyTextLayout.getContext(), 153), Integer.MAX_VALUE)).f319992L <= 1) {
                profileLiveNotifyTextLayout.mo66925b(profileLiveNotifyTextLayout.f115810d, profileLiveNotifyTextLayout.f115812f);
            } else {
                profileLiveNotifyTextLayout.mo66925b(profileLiveNotifyTextLayout.f115810d, profileLiveNotifyTextLayout.f115812f, profileLiveNotifyTextLayout.f115814h);
            }
        }
        C7007c1.m7257b(this.f115675i, 0.5f);
        String b2 = C48374j0.m53713b(this.f115668b.f131719s.f138039d);
        C8477a0 a0Var = new C8477a0();
        C2816v vVar = C2816v.f14072a;
        C87412m.m108593f(b2, "finderUserName");
        C51098rf rfVar5 = this.f115680n;
        if (rfVar5 != null) {
            str = rfVar5.f140874g;
        }
        if (str == null) {
            str = "";
        }
        C49098d51 d = vVar.mo2915d(b2, str);
        a0Var.f27482d = d != null && d.f132119e == 0;
        Log.m105924i("ContactBizHeaderLiveNoticeLogic", "init btn, status = " + a0Var.f27482d);
        mo66867c(a0Var.f27482d);
        this.f115675i.setOnClickListener(new C42708e(a0Var, this));
        LinkedList<C51098rf> linkedList = this.f115668b.f131721u;
        if (linkedList == null || linkedList.size() <= 1) {
            View view10 = this.f115678l;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "no more notice!");
            return;
        }
        View view11 = this.f115678l;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(0);
        View view12 = view11;
        C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view12, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String b3 = C48374j0.m53713b(this.f115668b.f131719s.f138039d);
        MMActivity mMActivity = this.f115667a;
        C49712hj1 hj12 = new C49712hj1();
        C87412m.m108593f(b3, "finderUserName");
        this.f115682p = ((C76243a5) C86312j.m106911c(cls)).mo13216Na(b3, mMActivity, false, hj12, 102);
        this.f115678l.setOnClickListener(new C42704c(this, b3));
        C8797q5 q5Var = this.f115682p;
        C87412m.m108591d(q5Var);
        q5Var.mo9629b(new C42706d(this, b3));
    }

    /* renamed from: e */
    public final void mo66869e(C49001ch chVar) {
        if (chVar == null) {
            this.f115680n = null;
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "update: profileInfo empty!");
            return;
        }
        this.f115668b = chVar;
        if (chVar.f131721u.size() > 0) {
            this.f115680n = chVar.f131721u.getFirst();
            String b = C48374j0.m53713b(chVar.f131719s.f138039d);
            LinkedList<C51098rf> linkedList = chVar.f131721u;
            C87412m.m108593f(linkedList, "profileInfo.LiveInfo");
            for (C51098rf rfVar : linkedList) {
                C87412m.m108593f(b, "finderUserName");
                String str = rfVar.f140874g;
                C87412m.m108593f(str, "it.notice_id");
                C49098d51 h4 = ((C60606n) C86312j.m106911c(C60606n.class)).mo85059h4(b, str);
                if (h4 == null) {
                    h4 = new C49098d51();
                }
                h4.f132118d = rfVar.f140871d;
                h4.f132119e = rfVar.f140872e;
                h4.f132121g = rfVar.f140873f;
                h4.f132122h = rfVar.f140874g;
                Log.m105924i("ContactBizHeaderLiveNoticeLogic", "local cache status has been set " + h4.f132119e + '!');
                C2816v vVar = C2816v.f14072a;
                String str2 = rfVar.f140874g;
                C87412m.m108593f(str2, "it.notice_id");
                vVar.mo2912a(b, str2, h4);
            }
            return;
        }
        this.f115680n = null;
        Log.m105924i("ContactBizHeaderLiveNoticeLogic", "update: liveNoticeInfo empty!");
    }
}
