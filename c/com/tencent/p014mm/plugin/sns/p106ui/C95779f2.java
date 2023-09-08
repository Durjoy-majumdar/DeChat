package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import g34.C116918i;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kr2.C76634a;
import p158gt.C8451i;
import p159gw.C8462g;
import te3.C101802kr2;
import te3.f94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.f2 */
public class C95779f2 extends C96157q {

    /* renamed from: c */
    public MMActivity f279418c;

    /* renamed from: d */
    public String f279419d = "";

    /* renamed from: e */
    public String f279420e = "";

    /* renamed from: f */
    public String f279421f = "";

    /* renamed from: g */
    public Bitmap f279422g = null;

    /* renamed from: h */
    public String f279423h;

    /* renamed from: i */
    public String f279424i;

    /* renamed from: j */
    public int f279425j;

    /* renamed from: k */
    public View f279426k = null;

    /* renamed from: l */
    public CdnImageView f279427l = null;

    /* renamed from: m */
    public TextView f279428m = null;

    /* renamed from: n */
    public boolean f279429n = false;

    /* renamed from: o */
    public int f279430o;

    /* renamed from: p */
    public String f279431p = "";

    /* renamed from: q */
    public String f279432q = "";

    /* renamed from: r */
    public String f279433r = "";

    /* renamed from: s */
    public String f279434s = "";

    /* renamed from: t */
    public String f279435t = "";

    /* renamed from: u */
    public C91998s f279436u = null;

    /* renamed from: v */
    public int f279437v;

    /* renamed from: w */
    public int f279438w = 1;

    /* renamed from: x */
    public String f279439x = "";

    public C95779f2(MMActivity mMActivity, int i) {
        this.f279418c = mMActivity;
        this.f279437v = i;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        View inflate = C85868k2.m106137b(this.f279418c).inflate(C0966R.C0971layout.f360041cb2, (ViewGroup) null);
        this.f279426k = inflate;
        this.f279427l = (CdnImageView) inflate.findViewById(C0966R.C0970id.f4p);
        this.f279428m = (TextView) this.f279426k.findViewById(C0966R.C0970id.kpq);
        TextView textView = (TextView) this.f279426k.findViewById(C0966R.C0970id.iub);
        if (this.f279429n) {
            View findViewById = this.f279426k.findViewById(C0966R.C0970id.k0s);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = this.f279426k.findViewById(C0966R.C0970id.k0s);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f279428m.setText(this.f279420e);
        if (this.f279437v == 13) {
            TextView textView2 = this.f279428m;
            textView2.setText(this.f279420e + "\n" + this.f279432q);
        }
        if (!Util.isNullOrNil(this.f279421f)) {
            this.f279427l.setVisibility(0);
            this.f279427l.setUrl(this.f279421f);
        } else if (!Util.isNullOrNil((byte[]) null)) {
            this.f279427l.setVisibility(0);
            Bitmap decodeByteArray = BitmapUtil.decodeByteArray((byte[]) null);
            this.f279422g = decodeByteArray;
            this.f279427l.setImageBitmap(decodeByteArray);
        } else {
            this.f279427l.setVisibility(8);
        }
        C102236a0.m134779x0(this.f279427l, this.f279418c);
        View view3 = this.f279426k;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return view3;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        this.f279436u = C91998s.m115551f(this.f279418c.getIntent());
        this.f279418c.getIntent().getIntExtra("Ksnsupload_width", -1);
        this.f279418c.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f279425j = this.f279418c.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f279419d = Util.nullAs(this.f279418c.getIntent().getStringExtra("Ksnsupload_link"), "");
        this.f279420e = Util.nullAs(this.f279418c.getIntent().getStringExtra("Ksnsupload_title"), "");
        this.f279421f = Util.nullAs(this.f279418c.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
        this.f279435t = this.f279418c.getIntent().getStringExtra("KsnsUpload_imgPath");
        this.f279429n = this.f279418c.getIntent().getBooleanExtra("ksnsis_video", false);
        this.f279423h = Util.nullAs(this.f279418c.getIntent().getStringExtra("src_username"), "");
        this.f279424i = Util.nullAs(this.f279418c.getIntent().getStringExtra("src_displayname"), "");
        this.f279432q = Util.nullAs(this.f279418c.getIntent().getStringExtra("KContentObjDesc"), "");
        this.f279431p = Util.nullAs(this.f279418c.getIntent().getStringExtra("KUploadProduct_UserData"), "");
        this.f279433r = Util.nullAs(this.f279418c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f279434s = Util.nullAs(this.f279418c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f279430o = this.f279418c.getIntent().getIntExtra("KUploadProduct_subType", 0);
        if (this.f279418c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f279438w = 1;
        } else {
            this.f279438w = 0;
        }
        this.f279439x = Util.nullAs(this.f279418c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ProductWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        C8451i iVar2;
        Bitmap bitmap;
        C116918i iVar3 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        C94945s2 s2Var = new C94945s2(this.f279437v, this.f279418c);
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 2);
        }
        s2Var.mo131267x(this.f279420e);
        s2Var.mo131266w(this.f279432q);
        s2Var.mo131268y(this.f279419d);
        s2Var.mo131260q(str);
        if (!Util.isNullOrNil(this.f279435t)) {
            s2Var.mo131248e(C86013q1.m106433O(this.f279435t, 0, -1), this.f279432q, this.f279420e, this.f279430o, this.f279431p);
        } else if (!(Util.isNullOrNil(this.f279421f) || (iVar2 = (C8451i) C86312j.m106911c(C8451i.class)) == null || (bitmap = iVar2.get(this.f279421f)) == null)) {
            s2Var.mo131247d(BitmapUtil.Bitmap2Bytes(bitmap), "", "");
        }
        if (iVar3 != null) {
            s2Var.mo131241O(iVar3.f350347d, iVar3.f350348e);
        }
        s2Var.mo131269z(this.f279438w, this.f279439x);
        s2Var.mo131234H(this.f279425j);
        s2Var.mo131237K(this.f279423h);
        s2Var.mo131236J(this.f279424i);
        s2Var.mo131262s(linkedList);
        int i6 = i;
        s2Var.mo131228B(i);
        s2Var.mo131235I((String) null, (String) null, (String) null, i4, i5);
        if (z) {
            s2Var.mo131264u(1);
        } else {
            s2Var.mo131264u(0);
        }
        s2Var.mo131263t(list2);
        if (!Util.isNullOrNil(this.f279434s)) {
            s2Var.mo131231E(this.f279434s);
            s2Var.mo131230D(this.f279433r);
        }
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
        s2Var.mo131243Q(linkedList2);
        s2Var.mo131265v(kr22);
        mo133779j(s2Var);
        int i7 = s2Var.mo131252i();
        C91998s sVar = this.f279436u;
        if (sVar != null) {
            sVar.mo125840a(i7);
            C95006y.f275639b.mo131398c(this.f279436u);
        }
        C94866e1.gy0().mo131192c();
        this.f279418c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        Bitmap bitmap = this.f279422g;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f279422g.recycle();
        }
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ProductWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return false;
    }
}
