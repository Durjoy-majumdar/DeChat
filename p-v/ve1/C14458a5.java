package ve1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRelatedFeedUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58684b;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import jq3.C60905o;
import k20.C9556a;
import kf1.C9629ac;
import os1.C62153d;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C50159kp0;
import te3.C50294lp0;
import te3.C50862pq3;
import te3.C51270sn1;
import te3.C52002xp0;
import up1.C14362s;

/* renamed from: ve1.a5 */
public final class C14458a5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14362s f40089d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40090e;

    /* renamed from: f */
    public final /* synthetic */ C14470b5 f40091f;

    public C14458a5(C14362s sVar, C60905o oVar, C14470b5 b5Var) {
        this.f40089d = sVar;
        this.f40090e = oVar;
        this.f40091f = b5Var;
    }

    public final void onClick(View view) {
        String str;
        Class cls = C58684b.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        int a = this.f40089d.mo13666a();
        if (a == 1 || a == 2) {
            intent.putExtra("UI_TITLE", this.f40089d.mo13669d());
            C50294lp0 lp02 = this.f40089d.mo13668c().f136857r;
            if (lp02 == null) {
                lp02 = new C50294lp0();
            }
            C50159kp0 kp02 = new C50159kp0();
            C14362s sVar = this.f40089d;
            kp02.f136936e = lp02.f137561e;
            kp02.f136938g = 2;
            C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
            kp02.f136939h = ((Number) X0.f38555d).floatValue();
            kp02.f136940i = ((Number) X0.f38556e).floatValue();
            kp02.f136945q = sVar.mo13668c();
            String str2 = "holder.context";
            C58784w3.m68427B1(C58784w3.f168295a, 0, this.f40089d.f39920b, lp02.f137561e, intent, (C2780c) null, 16, (Object) null);
            intent.putExtra("SECTION_REQ", kp02.toByteArray());
            intent.putExtra("SECTION_FIRST_RSP", lp02.toByteArray());
            intent.putExtra("KEY_MORE_ACTION_TYPE", this.f40089d.mo13666a());
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f40090e.f173499A;
            C87412m.m108593f(context, str2);
            C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            Context context2 = this.f40090e.f173499A;
            C87412m.m108593f(context2, str2);
            ((C58684b) C86312j.m106911c(cls)).getClass();
            Intent intent2 = !(context2 instanceof Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClass(context2, FinderRelatedFeedUI.class);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterRelatedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterRelatedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (a == 3 || a == 4) {
            C52002xp0 xp02 = this.f40089d.mo13668c().f136855p;
            if (xp02 == null) {
                xp02 = new C52002xp0();
            }
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) C110818d0.m150916N(this.f40089d.f39920b);
            if (baseFinderFeed != null) {
                Intent intent3 = new Intent();
                if (this.f40089d.mo13666a() == 4) {
                    intent3.putExtra("key_topic_type", 2);
                    intent3.putExtra("key_topic_poi_location", baseFinderFeed.mo3513o().getLocation().toByteArray());
                } else {
                    intent3.putExtra("key_topic_type", 1);
                }
                C51270sn1 sn12 = xp02.f144789h;
                if (sn12 == null || (str = sn12.f141617d) == null) {
                    str = "";
                }
                intent3.putExtra("key_topic_title", str);
                intent3.putExtra("key_ref_object_id", 0);
                C58784w3 w3Var = C58784w3.f168295a;
                LinkedList<BaseFinderFeed> linkedList = this.f40089d.f39920b;
                C89349b bVar = xp02.f144786e;
                Intent intent4 = intent3;
                w3Var.mo83856A1(0, linkedList, bVar, intent3, new C9629ac((C50862pq3) null, bVar));
                intent4.putExtra("KEY_SECTION_INFO", this.f40089d.mo13668c().toByteArray());
                intent4.putExtra("KEY_TOPIC_RSP", xp02.toByteArray());
                C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                Context context4 = this.f40090e.f173499A;
                C87412m.m108593f(context4, "holder.context");
                C13442s8.C13443a.m12791e(aVar3, context4, intent4, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                Context context5 = this.f40090e.f173499A;
                C87412m.m108593f(context5, "holder.context");
                ((C58684b) C86312j.m106911c(cls)).F50(context5, intent4);
            }
        }
        C14470b5 b5Var = this.f40091f;
        C14362s sVar2 = this.f40089d;
        b5Var.getClass();
        FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = new FinderLbsCardActionReportStruct();
        finderLbsCardActionReportStruct.f9821h = 1;
        finderLbsCardActionReportStruct.f9822i = C31543z5.m39453c();
        b5Var.f40110e.mo10320k1(finderLbsCardActionReportStruct, sVar2, -1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
