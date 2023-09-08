package ve1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
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

/* renamed from: ve1.z4 */
public final class C14709z4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14362s f40660d;

    /* renamed from: e */
    public final /* synthetic */ int f40661e;

    /* renamed from: f */
    public final /* synthetic */ View f40662f;

    /* renamed from: g */
    public final /* synthetic */ BaseFinderFeed f40663g;

    /* renamed from: h */
    public final /* synthetic */ C60905o f40664h;

    /* renamed from: i */
    public final /* synthetic */ C14470b5 f40665i;

    public C14709z4(C14362s sVar, int i, View view, BaseFinderFeed baseFinderFeed, C60905o oVar, C14470b5 b5Var) {
        this.f40660d = sVar;
        this.f40661e = i;
        this.f40662f = view;
        this.f40663g = baseFinderFeed;
        this.f40664h = oVar;
        this.f40665i = b5Var;
    }

    public final void onClick(View view) {
        String str;
        Class cls = C58684b.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        int a = this.f40660d.mo13666a();
        if (a == 1 || a == 2) {
            intent.putExtra("UI_TITLE", this.f40660d.mo13669d());
            C50294lp0 lp02 = this.f40660d.mo13668c().f136857r;
            if (lp02 == null) {
                lp02 = new C50294lp0();
            }
            C50159kp0 kp02 = new C50159kp0();
            C14362s sVar = this.f40660d;
            kp02.f136936e = lp02.f137561e;
            kp02.f136938g = 2;
            C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
            kp02.f136939h = ((Number) X0.f38555d).floatValue();
            kp02.f136940i = ((Number) X0.f38556e).floatValue();
            kp02.f136945q = sVar.mo13668c();
            C58784w3.m68427B1(C58784w3.f168295a, this.f40661e, this.f40660d.f39920b, lp02.f137561e, intent, (C2780c) null, 16, (Object) null);
            intent.putExtra("KEY_TITLE", this.f40660d.mo13669d());
            intent.putExtra("KEY_REQUEST_PB", kp02.toByteArray());
            intent.putExtra("KEY_MORE_ACTION_TYPE", this.f40660d.mo13666a());
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f40662f.getContext();
            C87412m.m108593f(context, "feedView.context");
            C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            Context context2 = this.f40662f.getContext();
            C87412m.m108593f(context2, "feedView.context");
            ((C58684b) C86312j.m106911c(cls)).ry0(context2, intent, 501);
        } else if (a == 3 || a == 4) {
            C52002xp0 xp02 = this.f40660d.mo13668c().f136855p;
            if (xp02 == null) {
                xp02 = new C52002xp0();
            }
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) C110818d0.m150916N(this.f40660d.f39920b);
            if (baseFinderFeed != null) {
                Intent intent2 = new Intent();
                if (this.f40660d.mo13666a() == 4) {
                    intent2.putExtra("key_topic_type", 2);
                    intent2.putExtra("KEY_FINDER_LOCATION", baseFinderFeed.mo3513o().getLocation().toByteArray());
                } else {
                    intent2.putExtra("key_topic_type", 1);
                }
                C51270sn1 sn12 = xp02.f144789h;
                if (sn12 == null || (str = sn12.f141617d) == null) {
                    str = "";
                }
                intent2.putExtra("key_topic_title", str);
                intent2.putExtra("key_ref_object_id", 0);
                intent2.putExtra("KEY_CLICK_FEED_ID", this.f40663g.mo3513o().getId());
                intent2.putExtra("KEY_CLICK_FEED_POSITION", this.f40661e);
                C58784w3 w3Var = C58784w3.f168295a;
                int i = this.f40661e;
                LinkedList<BaseFinderFeed> linkedList = this.f40660d.f39920b;
                C89349b bVar = xp02.f144786e;
                w3Var.mo83856A1(i, linkedList, bVar, intent2, new C9629ac((C50862pq3) null, bVar));
                intent2.putExtra("KEY_SECTION_INFO", this.f40660d.mo13668c().toByteArray());
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context3 = this.f40664h.f173499A;
                C87412m.m108593f(context3, "holder.context");
                C13442s8.C13443a.m12791e(aVar2, context3, intent2, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                Context context4 = this.f40664h.f173499A;
                C87412m.m108593f(context4, "holder.context");
                ((C58684b) C86312j.m106911c(cls)).ty0(context4, intent2);
            }
        }
        C14470b5 b5Var = this.f40665i;
        C14362s sVar2 = this.f40660d;
        int i2 = this.f40661e;
        b5Var.getClass();
        FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = new FinderLbsCardActionReportStruct();
        finderLbsCardActionReportStruct.f9821h = 2;
        finderLbsCardActionReportStruct.f9822i = C31543z5.m39453c();
        b5Var.f40110e.mo10320k1(finderLbsCardActionReportStruct, sVar2, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
