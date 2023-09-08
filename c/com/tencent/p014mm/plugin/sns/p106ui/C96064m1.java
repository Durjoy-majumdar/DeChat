package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91997p;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import g34.C116918i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kr2.C76634a;
import p159gw.C8462g;
import te3.C101802kr2;
import te3.C49399fa;
import te3.f94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.m1 */
public class C96064m1 extends C96157q {

    /* renamed from: c */
    public final MMActivity f280481c;

    /* renamed from: d */
    public String f280482d = "";

    /* renamed from: e */
    public String f280483e;

    /* renamed from: f */
    public String f280484f;

    /* renamed from: g */
    public int f280485g;

    /* renamed from: h */
    public String f280486h;

    /* renamed from: i */
    public String f280487i;

    /* renamed from: j */
    public String f280488j;

    /* renamed from: k */
    public String f280489k;

    /* renamed from: l */
    public String f280490l;

    /* renamed from: m */
    public View f280491m = null;

    /* renamed from: n */
    public CdnImageView f280492n = null;

    /* renamed from: o */
    public TextView f280493o = null;

    /* renamed from: p */
    public C49399fa f280494p = null;

    /* renamed from: q */
    public int f280495q = 1;

    /* renamed from: r */
    public String f280496r = "";

    /* renamed from: com.tencent.mm.plugin.sns.ui.m1$a */
    public class C96065a implements View.OnClickListener {
        public C96065a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/MPVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MPVideoWidget$1");
            C96064m1 m1Var = C96064m1.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            C49399fa faVar = m1Var.f280494p;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            if (faVar != null) {
                Rect rect = new Rect();
                int[] iArr = new int[2];
                C96064m1 m1Var2 = C96064m1.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                CdnImageView cdnImageView = m1Var2.f280492n;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                cdnImageView.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                C96064m1 m1Var3 = C96064m1.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                CdnImageView cdnImageView2 = m1Var3.f280492n;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                int i3 = iArr[1];
                C96064m1 m1Var4 = C96064m1.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                CdnImageView cdnImageView3 = m1Var4.f280492n;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                rect.set(i, i2, cdnImageView2.getMeasuredWidth() + i, i3 + cdnImageView3.getMeasuredHeight());
                Context context = view.getContext();
                C96064m1 m1Var5 = C96064m1.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                C49399fa faVar2 = m1Var5.f280494p;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
                C91997p.m115545c(context, faVar2, rect);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MPVideoWidget$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/MPVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C96064m1(MMActivity mMActivity) {
        this.f280481c = mMActivity;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        View inflate = C85868k2.m106137b(this.f280481c).inflate(C0966R.C0971layout.f360041cb2, (ViewGroup) null);
        this.f280491m = inflate;
        inflate.setOnClickListener(new C96065a());
        this.f280492n = (CdnImageView) this.f280491m.findViewById(C0966R.C0970id.f4p);
        this.f280493o = (TextView) this.f280491m.findViewById(C0966R.C0970id.kpq);
        TextView textView = (TextView) this.f280491m.findViewById(C0966R.C0970id.iub);
        ImageView imageView = (ImageView) this.f280491m.findViewById(C0966R.C0970id.k0s);
        imageView.setImageDrawable(C74933u4.m89768e(this.f280481c, C0966R.raw.icons_outlined_video_call, -1));
        imageView.setVisibility(0);
        this.f280492n.setVisibility(0);
        C49399fa faVar = this.f280494p;
        if (faVar != null) {
            this.f280492n.setUrl(faVar.f133370h);
            this.f280493o.setText(this.f280494p.f133369g);
        }
        C102236a0.m134779x0(this.f280492n, this.f280481c);
        View view = this.f280491m;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return view;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        Map<String, String> parseXml;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        this.f280488j = Util.nullAs(this.f280481c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f280489k = Util.nullAs(this.f280481c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f280485g = this.f280481c.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f280483e = Util.nullAs(this.f280481c.getIntent().getStringExtra("src_username"), "");
        this.f280484f = Util.nullAs(this.f280481c.getIntent().getStringExtra("src_displayname"), "");
        this.f280486h = Util.nullAs(this.f280481c.getIntent().getStringExtra("KPublisherId"), "");
        this.f280487i = Util.nullAs(this.f280481c.getIntent().getStringExtra("reportSessionId"), "");
        String nullAs = Util.nullAs(this.f280481c.getIntent().getStringExtra("ksnsupload_mp_video_xml"), "");
        this.f280490l = nullAs;
        if (!Util.isNullOrNil(nullAs) && (parseXml = XmlParser.parseXml(this.f280490l, "mmbrandmpvideo", (String) null)) != null) {
            this.f280494p = C91997p.m115546d("", parseXml);
        }
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        C116918i iVar2 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        C94945s2 s2Var = new C94945s2(33, this.f280481c);
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 4);
        }
        s2Var.mo131267x(this.f280482d);
        s2Var.mo131260q(str);
        s2Var.mo131266w(Util.nullAs(this.f280481c.getIntent().getStringExtra("ksnsupload_link_desc"), ""));
        C49399fa faVar = this.f280494p;
        if (faVar != null) {
            SnsMethodCalculate.markStartTimeMs("setShareMPVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.ContentObj.f298433q = faVar;
            SnsMethodCalculate.markEndTimeMs("setShareMPVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        s2Var.mo131269z(this.f280495q, this.f280496r);
        s2Var.mo131234H(this.f280485g);
        s2Var.mo131237K(this.f280483e);
        s2Var.mo131236J(this.f280484f);
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
        if (!Util.isNullOrNil(this.f280488j)) {
            s2Var.mo131231E(this.f280488j);
        }
        if (!Util.isNullOrNil(this.f280489k)) {
            s2Var.mo131230D(Util.nullAs(this.f280489k, ""));
        }
        s2Var.mo131265v(kr22);
        s2Var.mo131259p(str2);
        s2Var.mo131229C(this.f280486h);
        s2Var.mo131232F(this.f280487i);
        SnsMethodCalculate.markStartTimeMs("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        s2Var.f275199f.contentattr = 0;
        SnsMethodCalculate.markEndTimeMs("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        mo133779j(s2Var);
        s2Var.mo131252i();
        C94866e1.gy0().mo131192c();
        this.f280481c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }
}
