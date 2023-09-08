package com.tencent.p014mm.plugin.finder.search;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58775t;
import fe1.C58961d;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kj2.C117407d;
import rs1.C13442s8;
import te3.C48868bk1;
import te3.C64589nq2;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.search.a */
public final class C3578a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSearchIncludeFollowUI f16629d;

    /* renamed from: e */
    public final /* synthetic */ int f16630e;

    public C3578a(FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI, int i) {
        this.f16629d = finderContactSearchIncludeFollowUI;
        this.f16630e = i;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
        C48868bk1 bk12 = (C48868bk1) tag;
        FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = this.f16629d;
        int i = this.f16630e;
        finderContactSearchIncludeFollowUI.getClass();
        if (finderContactSearchIncludeFollowUI.f16413r) {
            Log.m105924i("Finder.FinderContactSearchIncludeFollowUI", "onContactItemClick select atContact");
            C58775t tVar = C58775t.f168276a;
            FinderContact finderContact = bk12.f131162d;
            if (finderContact == null) {
                finderContact = new FinderContact();
            }
            C64589nq2 i2 = tVar.mo83828i(finderContact);
            finderContactSearchIncludeFollowUI.getIntent().putExtra("at_select_contact", i2 != null ? i2.toByteArray() : null);
            Intent intent = finderContactSearchIncludeFollowUI.getIntent();
            C58961d.C58963b bVar = C58961d.f168673a;
            FinderContact finderContact2 = bk12.f131162d;
            intent.putExtra("is_follow", C58961d.C58963b.m68836h(bVar, finderContact2 != null ? finderContact2.username : null, (String) null, false, false, 14, (Object) null));
            finderContactSearchIncludeFollowUI.setResult(-1, finderContactSearchIncludeFollowUI.getIntent());
            finderContactSearchIncludeFollowUI.finish();
        } else {
            Intent intent2 = new Intent();
            FinderContact finderContact3 = bk12.f131162d;
            if (finderContact3 == null || (str = finderContact3.username) == null) {
                str = "";
            }
            intent2.putExtra("finder_username", str);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = finderContactSearchIncludeFollowUI.getContext();
            C87412m.m108593f(context, "context");
            String str2 = "context";
            String str3 = "";
            C13442s8.C13443a.m12791e(aVar, context, intent2, 0, (String) null, 0, 7, false, 0, 192, (Object) null);
            AppCompatActivity context2 = finderContactSearchIncludeFollowUI.getContext();
            C87412m.m108593f(context2, str2);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent2);
            String str4 = finderContactSearchIncludeFollowUI.f16410o;
            String str5 = finderContactSearchIncludeFollowUI.f16403e;
            FinderContact finderContact4 = bk12.f131162d;
            String str6 = finderContact4 != null ? finderContact4.username : null;
            C87412m.m108594g(str4, "requestId");
            String str7 = str3;
            String nullAs = Util.nullAs(str5, str7);
            C87412m.m108593f(nullAs, "nullAs(query, \"\")");
            String n = C112551y.m153814n(nullAs, ",", " ", false);
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(',');
            sb.append(n);
            sb.append(',');
            sb.append(0);
            sb.append(',');
            sb.append(1);
            sb.append(',');
            if (str6 == null) {
                str6 = str7;
            }
            sb.append(str6);
            sb.append(',');
            sb.append(i);
            sb.append(',');
            sb.append(2);
            String sb4 = sb.toString();
            Log.m105925i("Finder.FinderSearchReportLogic", "report18690 %s", sb4);
            C117407d.INSTANCE.kvStat(18690, sb4);
            AppCompatActivity context3 = finderContactSearchIncludeFollowUI.getContext();
            C87412m.m108593f(context3, str2);
            C13442s8 f = aVar.mo12873f(context3);
            if (f != null) {
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                int i3 = f.f38096i;
                FinderContact finderContact5 = bk12.f131162d;
                y0Var.yx0(6, 0, i3, 1, finderContact5 != null ? finderContact5.username : null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
