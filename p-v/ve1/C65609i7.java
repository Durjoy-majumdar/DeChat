package ve1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import cm1.C55032t1;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ht1.C60205t5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import mo1.C11057v;
import o40.C61926c;
import qc0.C101093a;
import qc0.C101106m;
import te3.C64417hb1;
import te3.C64488kb1;
import te3.C64719t23;
import up1.C65415e0;

/* renamed from: ve1.i7 */
public final class C65609i7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64417hb1 f188791d;

    /* renamed from: e */
    public final /* synthetic */ C55032t1 f188792e;

    /* renamed from: f */
    public final /* synthetic */ String f188793f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f188794g;

    /* renamed from: h */
    public final /* synthetic */ String f188795h;

    public C65609i7(C64417hb1 hb12, C55032t1 t1Var, String str, C60905o oVar, String str2) {
        this.f188791d = hb12;
        this.f188792e = t1Var;
        this.f188793f = str;
        this.f188794g = oVar;
        this.f188795h = str2;
    }

    public final void onClick(View view) {
        C64488kb1 kb12;
        C64488kb1 kb13;
        C64488kb1 kb14;
        C64488kb1 kb15;
        C64488kb1 kb16;
        C64488kb1 kb17;
        C64488kb1 kb18;
        C64488kb1 kb19;
        C64488kb1 kb110;
        C64488kb1 kb111;
        C64488kb1 kb112;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64719t23 t232 = new C64719t23();
        C55032t1 t1Var = this.f188792e;
        String str = this.f188793f;
        C64417hb1 hb12 = this.f188791d;
        t232.f185459d = C61926c.m72691p(t1Var.mo3513o().getFinderObject().f164794id);
        t232.f185460e = t1Var.mo3513o().getFinderObject().objectNonceId;
        t232.f185461f = str;
        FinderContact finderContact = t1Var.mo3513o().getFinderObject().contact;
        String str2 = null;
        t232.f185462g = finderContact != null ? finderContact.nickname : null;
        t232.f185463h = (hb12 == null || (kb112 = hb12.f183456e) == null) ? null : kb112.f183905e;
        t232.f185464i = (hb12 == null || (kb111 = hb12.f183456e) == null) ? null : kb111.f183911n;
        t232.f185465j = (hb12 == null || (kb110 = hb12.f183456e) == null) ? null : kb110.f183916s;
        t232.f185466n = (hb12 == null || (kb19 = hb12.f183456e) == null) ? null : kb19.f183913p;
        t232.f185467o = (hb12 == null || (kb18 = hb12.f183456e) == null) ? 0 : kb18.f183915r;
        t232.f185468p = (hb12 == null || (kb17 = hb12.f183456e) == null) ? null : kb17.f183905e;
        t232.f185469q = (hb12 == null || (kb16 = hb12.f183456e) == null) ? 0 : kb16.f183918u;
        t232.f185473u = (hb12 == null || (kb15 = hb12.f183456e) == null) ? null : kb15.f183904d;
        t232.f185474v = (hb12 == null || (kb14 = hb12.f183456e) == null) ? null : kb14.f183910j;
        t232.f185475w = (hb12 == null || (kb13 = hb12.f183456e) == null) ? null : kb13.f183912o;
        t232.f185472t = str;
        C64417hb1 hb13 = this.f188791d;
        if (!(hb13 == null || (kb12 = hb13.f183456e) == null)) {
            C60905o oVar = this.f188794g;
            String str3 = this.f188795h;
            Log.m105924i("Finder.ProfileMusicConvert", "playOrPauseMusic");
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C11057v) rVar.mo62443b(context).mo75002a(C11057v.class)).mo11197c3();
            C65415e0 e0Var = C65415e0.f188260a;
            C87412m.m108594g(str3, "musicId");
            C101106m b = C101093a.m132480b();
            if (b != null) {
                str2 = b.f295960e;
            }
            if (str2 == null || !Util.isEqual(b.f295960e, str3)) {
                Log.m105924i("FinderMvLogic", "playMusic");
                e0Var.mo89504b(kb12, str3, 0, t232);
            } else if (C101093a.m132481c()) {
                MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
                mvCardActionReportStruct.f156518j = 2;
                mvCardActionReportStruct.f156519k = 8;
                C60205t5.m70388b(mvCardActionReportStruct);
                C101093a.m132490l();
            } else {
                e0Var.mo89504b(kb12, str3, 0, t232);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
