package com.tencent.p014mm.plugin.finder.search;

import ak1.C54067f0;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import cm1.C0712b0;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58775t;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;
import te3.C48868bk1;
import te3.C64589nq2;

/* renamed from: com.tencent.mm.plugin.finder.search.b */
public final class C3579b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSearchUI f16631d;

    /* renamed from: e */
    public final /* synthetic */ int f16632e;

    public C3579b(FinderContactSearchUI finderContactSearchUI, int i) {
        this.f16631d = finderContactSearchUI;
        this.f16632e = i;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderContactSearchUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
        C48868bk1 bk12 = (C48868bk1) tag;
        FinderContactSearchUI finderContactSearchUI = this.f16631d;
        int i = this.f16632e;
        finderContactSearchUI.getClass();
        Class cls = C58417y0.class;
        if (finderContactSearchUI.f16451z) {
            Log.m105924i(finderContactSearchUI.f16440o, "onContactItemClick select atContact");
            C58775t tVar = C58775t.f168276a;
            FinderContact finderContact = bk12.f131162d;
            if (finderContact == null) {
                finderContact = new FinderContact();
            }
            C64589nq2 i2 = tVar.mo83828i(finderContact);
            finderContactSearchUI.getIntent().putExtra("at_select_contact", i2 != null ? i2.toByteArray() : null);
            finderContactSearchUI.setResult(-1, finderContactSearchUI.getIntent());
            finderContactSearchUI.finish();
        } else {
            FinderContact finderContact2 = bk12.f131162d;
            boolean z = false;
            if (finderContact2 != null && finderContact2.liveStatus == 1) {
                C8777j5 j5Var = (C8777j5) C86312j.m106911c(C8777j5.class);
                FinderContact finderContact3 = bk12.f131162d;
                j5Var.mo9604Pw((C0712b0) null, (finderContact3 == null || (str4 = finderContact3.username) == null) ? "" : str4, (long) i, C54067f0.C54078q.LIVE_AUDIENCE_CLICK_SINGLE_AVATAR, "temp_3");
            }
            Intent intent = new Intent();
            FinderContact finderContact4 = bk12.f131162d;
            if (finderContact4 == null || (str = finderContact4.username) == null) {
                str = "";
            }
            intent.putExtra("finder_username", str);
            FinderContact finderContact5 = bk12.f131162d;
            if (finderContact5 != null) {
                if (!((finderContact5.one_time_flag & 4) > 0)) {
                    z = true;
                }
            }
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", z);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = finderContactSearchUI.getContext();
            C87412m.m108593f(context, "context");
            C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 7, false, 0, 192, (Object) null);
            AppCompatActivity context2 = finderContactSearchUI.getContext();
            C87412m.m108593f(context2, "context");
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
            int i3 = finderContactSearchUI.f16433G;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            String str5 = finderContactSearchUI.f16448w;
            String str6 = finderContactSearchUI.f16442q;
            FinderContact finderContact6 = bk12.f131162d;
            if (finderContact6 == null || (str2 = finderContact6.username) == null) {
                str2 = "";
            }
            String str7 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
            AppCompatActivity context3 = finderContactSearchUI.getContext();
            C87412m.m108593f(context3, "context");
            C13442s8 f = aVar.mo12873f(context3);
            String str8 = "context";
            C13442s8.C13443a aVar2 = aVar;
            y0Var.by0(str5, str6, 1, 1, str2, i, 2, 1, str7, 2, i3, f != null ? f.mo12861q3() : null);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var2 = (C58417y0) c;
            String str9 = finderContactSearchUI.f16448w;
            String str10 = finderContactSearchUI.f16442q;
            FinderContact finderContact7 = bk12.f131162d;
            String str11 = (finderContact7 == null || (str3 = finderContact7.username) == null) ? "" : str3;
            String str12 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
            AppCompatActivity context4 = finderContactSearchUI.getContext();
            String str13 = str8;
            C87412m.m108593f(context4, str13);
            C13442s8.C13443a aVar3 = aVar2;
            C13442s8 f2 = aVar3.mo12873f(context4);
            C58417y0.cy0(y0Var2, str9, str10, 1, 1, str11, i, 2, 1, str12, 2, i3, f2 != null ? f2.mo12861q3() : null, (String) null, 0, 12288, (Object) null);
            AppCompatActivity context5 = finderContactSearchUI.getContext();
            C87412m.m108593f(context5, str13);
            C13442s8 f3 = aVar3.mo12873f(context5);
            if (f3 != null) {
                C58417y0 y0Var3 = (C58417y0) C86312j.m106911c(cls);
                int i4 = f3.f38096i;
                FinderContact finderContact8 = bk12.f131162d;
                y0Var3.yx0(6, 0, i4, 1, finderContact8 != null ? finderContact8.username : null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
