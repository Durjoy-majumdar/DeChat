package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C54025o;
import ad0.C91999u;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.pointers.PInt;
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
import te3.C64350ew2;
import te3.C64378fw2;
import te3.f94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.p1 */
public class C96109p1 extends C96157q {

    /* renamed from: o */
    public static final /* synthetic */ int f280701o = 0;

    /* renamed from: c */
    public MMActivity f280702c;

    /* renamed from: d */
    public String f280703d = "";

    /* renamed from: e */
    public String f280704e;

    /* renamed from: f */
    public String f280705f;

    /* renamed from: g */
    public String f280706g;

    /* renamed from: h */
    public String f280707h;

    /* renamed from: i */
    public boolean f280708i;

    /* renamed from: j */
    public View f280709j = null;

    /* renamed from: k */
    public ImageView f280710k = null;

    /* renamed from: l */
    public ImageView f280711l = null;

    /* renamed from: m */
    public ImageIndicatorView f280712m = null;

    /* renamed from: n */
    public C54025o f280713n = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.p1$a */
    public class C57419a implements View.OnClickListener {
        public C57419a() {
        }

        public void onClick(View view) {
            C64378fw2 fw22;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/MegaVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget$1");
            C96109p1 p1Var = C96109p1.this;
            int i = C96109p1.f280701o;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
            p1Var.getClass();
            Class cls = C60200t1.class;
            SnsMethodCalculate.markStartTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
            C54025o oVar = p1Var.f280713n;
            if (!(oVar == null || (fw22 = oVar.f151294a) == null)) {
                long B0 = C102236a0.m134706B0(fw22.f183241d);
                if (B0 != 0) {
                    Intent intent = new Intent();
                    intent.putExtra("report_scene", 3);
                    intent.putExtra("from_user", p1Var.f280713n.f151294a.f183242e);
                    intent.putExtra("feed_object_id", B0);
                    intent.putExtra("business_type", 1);
                    intent.putExtra("finder_user_name", p1Var.f280713n.f151294a.f183242e);
                    intent.putExtra("feed_object_nonceId", p1Var.f280713n.f151294a.f183248n);
                    intent.putExtra("key_from_user_name", p1Var.f280713n.f151294a.f183242e);
                    intent.putExtra("tab_type", 5);
                    ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 25, intent);
                    ((C60200t1) C86312j.m106911c(cls)).mo76864nr(p1Var.f280702c, intent);
                }
            }
            SnsMethodCalculate.markEndTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/MegaVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        aVar.mo139398a();
    }

    public C96109p1(MMActivity mMActivity) {
        this.f280702c = mMActivity;
    }

    /* renamed from: a */
    public View mo132124a() {
        C64378fw2 fw22;
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        View inflate = C85868k2.m106137b(this.f280702c).inflate(C0966R.C0971layout.f360003c32, (ViewGroup) null);
        this.f280709j = inflate;
        this.f280710k = (ImageView) inflate.findViewById(C0966R.C0970id.jtg);
        this.f280711l = (ImageView) this.f280709j.findViewById(C0966R.C0970id.jtf);
        this.f280712m = (ImageIndicatorView) this.f280709j.findViewById(C0966R.C0970id.jtd);
        C54025o oVar = this.f280713n;
        if (!(oVar == null || (fw22 = oVar.f151294a) == null)) {
            if (!Util.isNullOrNil((List) fw22.f183247j)) {
                C64350ew2 ew22 = fw22.f183247j.get(0);
                Pair<Integer, Integer> k = C91999u.m115565k((int) ew22.f183041f, (int) ew22.f183042g, this.f280702c, false);
                this.f280709j.setLayoutParams(new ViewGroup.LayoutParams(((Integer) k.first).intValue(), ((Integer) k.second).intValue()));
                this.f280709j.requestLayout();
                if (!TextUtils.isEmpty(ew22.f183043h)) {
                    ((C60200t1) C86312j.m106911c(cls)).mo76741Cm(ew22.f183043h, this.f280710k, aVar);
                } else {
                    ((C60200t1) C86312j.m106911c(cls)).mo76741Cm(ew22.f183040e, this.f280710k, aVar);
                }
            }
            this.f280711l.setVisibility(0);
            this.f280712m.setVisibility(8);
            this.f280709j.setOnClickListener(new C57419a());
        }
        View view = this.f280709j;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return view;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        Map<String, String> parseXml;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        this.f280703d = Util.nullAs(this.f280702c.getIntent().getStringExtra("Ksnsupload_title"), "");
        this.f280706g = Util.nullAs(this.f280702c.getIntent().getStringExtra("KPublisherId"), "");
        this.f280707h = Util.nullAs(this.f280702c.getIntent().getStringExtra("reportSessionId"), "");
        this.f280704e = Util.nullAs(this.f280702c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f280705f = Util.nullAs(this.f280702c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f280708i = this.f280702c.getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        SnsReportHelper.f275506m0.f275525S = this.f280702c.getIntent().getLongExtra("finder_feed_id", 0);
        String stringExtra = this.f280702c.getIntent().getStringExtra("ksnsupload_mega_video_object_xml");
        if (!Util.isNullOrNil(stringExtra) && (parseXml = XmlParser.parseXml(stringExtra, "finderMegaVideo", (String) null)) != null) {
            C54025o oVar = new C54025o();
            this.f280713n = oVar;
            oVar.f151294a = C60167f1.m70158p("", parseXml);
        }
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        C116918i iVar2 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        C94945s2 s2Var = new C94945s2(36, this.f280702c);
        C54025o oVar = this.f280713n;
        if (oVar != null) {
            SnsMethodCalculate.markStartTimeMs("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.ContentObj.f298436t = oVar.f151294a;
            SnsMethodCalculate.markEndTimeMs("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 4);
        }
        s2Var.mo131267x(this.f280703d);
        s2Var.mo131260q(str);
        s2Var.mo131266w(Util.nullAs(this.f280702c.getIntent().getStringExtra("ksnsupload_link_desc"), ""));
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
        if (!Util.isNullOrNil(this.f280704e)) {
            s2Var.mo131231E(this.f280704e);
        }
        if (!Util.isNullOrNil(this.f280705f)) {
            s2Var.mo131230D(Util.nullAs(this.f280705f, ""));
        }
        s2Var.mo131265v(kr22);
        s2Var.mo131259p(str2);
        s2Var.mo131229C(this.f280706g);
        s2Var.mo131232F(this.f280707h);
        mo133779j(s2Var);
        int i7 = s2Var.mo131252i();
        if (this.f280708i) {
            SnsReportHelper.f275506m0.f275524R = i7;
        }
        C94866e1.gy0().mo131192c();
        this.f280702c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        boolean z = this.f280713n != null;
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return z;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }
}
