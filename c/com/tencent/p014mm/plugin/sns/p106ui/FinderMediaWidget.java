package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C54022l;
import ad0.C91999u;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderPostStatusEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShareMomentReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import g34.C116918i;
import ht1.C60167f1;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kr2.C76634a;
import n60.C100075f;
import p159gw.C8462g;
import pl1.C11978e0;
import te3.C101802kr2;
import te3.C64628pk1;
import te3.C64682rk1;
import te3.f94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.FinderMediaWidget */
public class FinderMediaWidget extends C96157q {

    /* renamed from: q */
    public static final /* synthetic */ int f276757q = 0;

    /* renamed from: c */
    public MMActivity f276758c = null;

    /* renamed from: d */
    public String f276759d = "";

    /* renamed from: e */
    public String f276760e;

    /* renamed from: f */
    public String f276761f;

    /* renamed from: g */
    public String f276762g;

    /* renamed from: h */
    public String f276763h;

    /* renamed from: i */
    public boolean f276764i;

    /* renamed from: j */
    public View f276765j = null;

    /* renamed from: k */
    public ImageView f276766k = null;

    /* renamed from: l */
    public ImageView f276767l = null;

    /* renamed from: m */
    public ImageIndicatorView f276768m = null;

    /* renamed from: n */
    public C54022l f276769n = null;

    /* renamed from: o */
    public int f276770o = -1;

    /* renamed from: p */
    public IListener f276771p = new IListener<FinderPostStatusEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1254966226;
        }

        public boolean callback(IEvent iEvent) {
            FinderPostStatusEvent.C28746a aVar;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
            FinderPostStatusEvent finderPostStatusEvent = (FinderPostStatusEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
            if (!(finderPostStatusEvent == null || (aVar = finderPostStatusEvent.f78800d) == null || aVar.f78801a <= 0 || FinderMediaWidget.m121463k(FinderMediaWidget.this) == null || FinderMediaWidget.m121463k(FinderMediaWidget.this).f151291a == null)) {
                long j = FinderMediaWidget.m121463k(FinderMediaWidget.this).f151291a.f185192p;
                FinderPostStatusEvent.C28746a aVar2 = finderPostStatusEvent.f78800d;
                if (j == aVar2.f78801a) {
                    if (!aVar2.f78802b || aVar2.f78803c == null) {
                        FinderMediaWidget finderMediaWidget = FinderMediaWidget.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        finderMediaWidget.f276770o = 1;
                        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                    } else {
                        FinderMediaWidget.m121463k(FinderMediaWidget.this).f151291a = finderPostStatusEvent.f78800d.f78803c;
                        FinderShareMomentReportStruct x = SnsReportHelper.f275506m0.mo131391x();
                        x.f265596e = x.mo86045b("Feedid", FinderMediaWidget.m121463k(FinderMediaWidget.this).f151291a.f185183d, true);
                        FinderMediaWidget finderMediaWidget2 = FinderMediaWidget.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        finderMediaWidget2.f276770o = 0;
                        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.sns.ui.FinderMediaWidget$a */
    public class C57371a implements View.OnClickListener {
        public C57371a() {
        }

        public void onClick(View view) {
            C64682rk1 rk12;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/FinderMediaWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$2");
            FinderMediaWidget finderMediaWidget = FinderMediaWidget.this;
            int i = FinderMediaWidget.f276757q;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
            finderMediaWidget.getClass();
            Class cls = C60200t1.class;
            SnsMethodCalculate.markStartTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
            C54022l lVar = finderMediaWidget.f276769n;
            if (!(lVar == null || (rk12 = lVar.f151291a) == null)) {
                long B0 = C102236a0.m134706B0(rk12.f185183d);
                long j = finderMediaWidget.f276769n.f151291a.f185192p;
                int i2 = (B0 > 0 ? 1 : (B0 == 0 ? 0 : -1));
                if (!(i2 == 0 && j == 0)) {
                    Intent intent = new Intent();
                    intent.putExtra("report_scene", 3);
                    intent.putExtra("from_user", finderMediaWidget.f276769n.f151291a.f185184e);
                    intent.putExtra("feed_object_id", B0);
                    intent.putExtra("business_type", 0);
                    intent.putExtra("finder_user_name", finderMediaWidget.f276769n.f151291a.f185184e);
                    intent.putExtra("feed_object_nonceId", finderMediaWidget.f276769n.f151291a.f185191o);
                    intent.putExtra("key_from_user_name", finderMediaWidget.f276769n.f151291a.f185184e);
                    intent.putExtra("tab_type", 5);
                    intent.putExtra("feed_local_id", j);
                    intent.putExtra("key_need_related_list", false);
                    if (i2 == 0 && j != 0) {
                        intent.putExtra("key_posting_scene", true);
                    }
                    ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 25, intent);
                    ((C60200t1) C86312j.m106911c(cls)).mo76864nr(finderMediaWidget.f276758c, intent);
                }
            }
            SnsMethodCalculate.markEndTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/FinderMediaWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        aVar.mo139398a();
    }

    public FinderMediaWidget(MMActivity mMActivity) {
        this.f276758c = mMActivity;
    }

    /* renamed from: k */
    public static /* synthetic */ C54022l m121463k(FinderMediaWidget finderMediaWidget) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        C54022l lVar = finderMediaWidget.f276769n;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return lVar;
    }

    /* renamed from: a */
    public View mo132124a() {
        C64682rk1 rk12;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        View inflate = C85868k2.m106137b(this.f276758c).inflate(C0966R.C0971layout.f360003c32, (ViewGroup) null);
        this.f276765j = inflate;
        this.f276766k = (ImageView) inflate.findViewById(C0966R.C0970id.jtg);
        this.f276767l = (ImageView) this.f276765j.findViewById(C0966R.C0970id.jtf);
        this.f276768m = (ImageIndicatorView) this.f276765j.findViewById(C0966R.C0970id.jtd);
        C54022l lVar = this.f276769n;
        if (!(lVar == null || (rk12 = lVar.f151291a) == null)) {
            if (!Util.isNullOrNil((List) rk12.f185190n)) {
                C64628pk1 pk12 = rk12.f185190n.get(0);
                if (rk12.f185188i == 4) {
                    Pair<Integer, Integer> k = C91999u.m115565k((int) pk12.f184829g, (int) pk12.f184830h, this.f276758c, false);
                    this.f276765j.setLayoutParams(new ViewGroup.LayoutParams(((Integer) k.first).intValue(), ((Integer) k.second).intValue()));
                    this.f276765j.requestLayout();
                } else {
                    Pair<Integer, Integer> m = C91999u.m115567m((int) pk12.f184829g, (int) pk12.f184830h, this.f276758c);
                    this.f276765j.setLayoutParams(new ViewGroup.LayoutParams(((Integer) m.first).intValue(), ((Integer) m.second).intValue()));
                    this.f276765j.requestLayout();
                }
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76741Cm(pk12.f184828f, this.f276766k, C11978e0.C11979a.COMMON);
            }
            int i = rk12.f185188i;
            if (i == 4) {
                this.f276767l.setVisibility(0);
                this.f276768m.setVisibility(8);
            } else if (i == 2) {
                this.f276767l.setVisibility(0);
                this.f276768m.setVisibility(8);
                this.f276768m.f21258e = rk12.f185189j;
            } else {
                this.f276767l.setVisibility(8);
                this.f276768m.setVisibility(8);
                this.f276768m.f21258e = rk12.f185189j;
            }
            this.f276765j.setOnClickListener(new C57371a());
        }
        View view = this.f276765j;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return view;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        Map<String, String> parseXml;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        this.f276759d = Util.nullAs(this.f276758c.getIntent().getStringExtra("Ksnsupload_title"), "");
        this.f276762g = Util.nullAs(this.f276758c.getIntent().getStringExtra("KPublisherId"), "");
        this.f276763h = Util.nullAs(this.f276758c.getIntent().getStringExtra("reportSessionId"), "");
        this.f276760e = Util.nullAs(this.f276758c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f276761f = Util.nullAs(this.f276758c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f276764i = this.f276758c.getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        int intExtra = this.f276758c.getIntent().getIntExtra("finder_post_from_sns_type", 3);
        SnsReportHelper.f275506m0.f275525S = this.f276758c.getIntent().getLongExtra("finder_feed_id", 0);
        String stringExtra = this.f276758c.getIntent().getStringExtra("ksnsupload_finder_object_xml");
        if (!Util.isNullOrNil(stringExtra) && (parseXml = XmlParser.parseXml(stringExtra, "finderFeed", (String) null)) != null) {
            C54022l lVar = new C54022l();
            this.f276769n = lVar;
            lVar.f151291a = C60167f1.m70151i("", parseXml);
        }
        String l = C102236a0.m134754l();
        SnsReportHelper.f275506m0.mo131391x().f265595d = (long) intExtra;
        FinderShareMomentReportStruct x = SnsReportHelper.f275506m0.mo131391x();
        x.f265599h = x.mo86045b("MonmentSessionId", l, true);
        C54022l lVar2 = this.f276769n;
        if (!(lVar2 == null || lVar2.f151291a == null)) {
            FinderShareMomentReportStruct x2 = SnsReportHelper.f275506m0.mo131391x();
            x2.f265596e = x2.mo86045b("Feedid", this.f276769n.f151291a.f185183d, true);
        }
        this.f276771p.alive();
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        C116918i iVar2 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        C94945s2 s2Var = new C94945s2(28, this.f276758c);
        C54022l lVar = this.f276769n;
        if (lVar != null) {
            SnsMethodCalculate.markStartTimeMs("setShareFinderObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.ContentObj.f298431o = lVar.f151291a;
            SnsMethodCalculate.markEndTimeMs("setShareFinderObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 4);
        }
        s2Var.mo131267x(this.f276759d);
        s2Var.mo131260q(str);
        s2Var.mo131266w(Util.nullAs(this.f276758c.getIntent().getStringExtra("ksnsupload_link_desc"), ""));
        s2Var.mo131262s(linkedList);
        int i6 = i;
        s2Var.mo131228B(i);
        if (z) {
            s2Var.mo131264u(1);
        } else {
            s2Var.mo131264u(0);
        }
        s2Var.mo131263t(list2);
        LinkedList linkedList2 = new LinkedList();
        if (list != null) {
            new LinkedList();
            List<String> gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt();
            for (String next : list) {
                if (gt != null && !gt.contains(next)) {
                    f94 f94 = new f94();
                    f94.f298255d = next;
                    linkedList2.add(f94);
                }
            }
        }
        if (iVar2 != null) {
            s2Var.mo131241O(iVar2.f350347d, iVar2.f350348e);
        }
        s2Var.mo131243Q(linkedList2);
        if (!Util.isNullOrNil(this.f276760e)) {
            s2Var.mo131231E(this.f276760e);
        }
        if (!Util.isNullOrNil(this.f276761f)) {
            s2Var.mo131230D(Util.nullAs(this.f276761f, ""));
        }
        s2Var.mo131265v(kr22);
        s2Var.mo131259p(str2);
        s2Var.mo131229C(this.f276762g);
        s2Var.mo131232F(this.f276763h);
        if (mo132132l()) {
            int i7 = this.f276770o;
            if (i7 == -1) {
                SnsMethodCalculate.markStartTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                SnsInfo snsInfo = s2Var.f275201h;
                if (snsInfo != null) {
                    snsInfo.setPostHolding();
                }
                SnsMethodCalculate.markEndTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else if (i7 == 1) {
                SnsMethodCalculate.markStartTimeMs("setPostDie", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                SnsInfo snsInfo2 = s2Var.f275201h;
                if (snsInfo2 != null) {
                    snsInfo2.setItemDie();
                }
                SnsMethodCalculate.markEndTimeMs("setPostDie", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            }
        }
        mo133779j(s2Var);
        int i8 = s2Var.mo131252i();
        if (this.f276770o == 1) {
            SnsReportHelper.f275506m0.mo131391x().f265598g = 1;
            SnsReportHelper.f275506m0.mo131372e();
            SnsReportHelper.f275506m0.f275526T = 0;
        } else {
            SnsReportHelper.f275506m0.f275526T = i8;
        }
        if (this.f276764i) {
            SnsReportHelper.f275506m0.f275524R = i8;
        }
        C94866e1.gy0().mo131192c();
        this.f276758c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        boolean l = mo132132l();
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return l;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        this.f276771p.dead();
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        boolean z = this.f276769n != null;
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return z;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.f151291a;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132132l() {
        /*
            r8 = this;
            java.lang.String r0 = "isLocalFinderFeed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.FinderMediaWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            ad0.l r2 = r8.f276769n
            if (r2 == 0) goto L_0x0030
            te3.rk1 r2 = r2.f151291a
            if (r2 == 0) goto L_0x0030
            long r3 = r2.f185192p
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0030
            java.lang.String r2 = r2.f185183d
            long r2 = vr2.C102236a0.m134706B0(r2)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0030
            ad0.l r2 = r8.f276769n
            te3.rk1 r2 = r2.f151291a
            java.lang.String r2 = r2.f185191o
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.FinderMediaWidget.mo132132l():boolean");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return false;
    }
}
