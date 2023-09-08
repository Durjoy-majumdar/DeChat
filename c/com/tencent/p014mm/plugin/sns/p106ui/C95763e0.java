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
import com.tencent.p014mm.sdk.platformtools.Log;
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

/* renamed from: com.tencent.mm.plugin.sns.ui.e0 */
public class C95763e0 extends C96157q {

    /* renamed from: c */
    public MMActivity f279364c;

    /* renamed from: d */
    public String f279365d = "";

    /* renamed from: e */
    public String f279366e = "";

    /* renamed from: f */
    public String f279367f = "";

    /* renamed from: g */
    public Bitmap f279368g = null;

    /* renamed from: h */
    public String f279369h;

    /* renamed from: i */
    public String f279370i;

    /* renamed from: j */
    public int f279371j;

    /* renamed from: k */
    public View f279372k = null;

    /* renamed from: l */
    public CdnImageView f279373l = null;

    /* renamed from: m */
    public TextView f279374m = null;

    /* renamed from: n */
    public boolean f279375n = false;

    /* renamed from: o */
    public int f279376o;

    /* renamed from: p */
    public final int f279377p;

    /* renamed from: q */
    public String f279378q = "";

    /* renamed from: r */
    public String f279379r = "";

    /* renamed from: s */
    public String f279380s = "";

    /* renamed from: t */
    public String f279381t = "";

    /* renamed from: u */
    public String f279382u = "";

    /* renamed from: v */
    public C91998s f279383v = null;

    /* renamed from: w */
    public int f279384w = 1;

    /* renamed from: x */
    public String f279385x = "";

    public C95763e0(MMActivity mMActivity, int i) {
        this.f279364c = mMActivity;
        if (i == 33) {
            this.f279377p = 49;
        } else {
            this.f279377p = 22;
        }
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        View inflate = C85868k2.m106137b(this.f279364c).inflate(C0966R.C0971layout.f360041cb2, (ViewGroup) null);
        this.f279372k = inflate;
        this.f279373l = (CdnImageView) inflate.findViewById(C0966R.C0970id.f4p);
        this.f279374m = (TextView) this.f279372k.findViewById(C0966R.C0970id.kpq);
        TextView textView = (TextView) this.f279372k.findViewById(C0966R.C0970id.iub);
        if (this.f279375n) {
            View findViewById = this.f279372k.findViewById(C0966R.C0970id.k0s);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/EmotionListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/EmotionListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = this.f279372k.findViewById(C0966R.C0970id.k0s);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/EmotionListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/EmotionListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f279374m.setText(this.f279366e);
        if (!Util.isNullOrNil(this.f279367f)) {
            this.f279373l.setVisibility(0);
            this.f279373l.setUrl(this.f279367f);
        } else if (!Util.isNullOrNil((byte[]) null)) {
            this.f279373l.setVisibility(0);
            Bitmap decodeByteArray = BitmapUtil.decodeByteArray((byte[]) null);
            this.f279368g = decodeByteArray;
            this.f279373l.setImageBitmap(decodeByteArray);
        } else {
            this.f279373l.setVisibility(8);
        }
        C102236a0.m134779x0(this.f279373l, this.f279364c);
        View view3 = this.f279372k;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        return view3;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        this.f279383v = C91998s.m115551f(this.f279364c.getIntent());
        this.f279364c.getIntent().getIntExtra("Ksnsupload_width", -1);
        this.f279364c.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f279371j = this.f279364c.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f279365d = Util.nullAs(this.f279364c.getIntent().getStringExtra("Ksnsupload_link"), "");
        this.f279366e = Util.nullAs(this.f279364c.getIntent().getStringExtra("Ksnsupload_title"), "");
        this.f279367f = Util.nullAs(this.f279364c.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
        this.f279382u = this.f279364c.getIntent().getStringExtra("KsnsUpload_imgPath");
        this.f279375n = this.f279364c.getIntent().getBooleanExtra("ksnsis_video", false);
        this.f279369h = Util.nullAs(this.f279364c.getIntent().getStringExtra("src_username"), "");
        this.f279370i = Util.nullAs(this.f279364c.getIntent().getStringExtra("src_displayname"), "");
        this.f279379r = Util.nullAs(this.f279364c.getIntent().getStringExtra("KContentObjDesc"), "");
        this.f279378q = Util.nullAs(this.f279364c.getIntent().getStringExtra("KUploadProduct_UserData"), "");
        this.f279380s = Util.nullAs(this.f279364c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f279381t = Util.nullAs(this.f279364c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f279376o = this.f279364c.getIntent().getIntExtra("KUploadProduct_subType", 0);
        if (this.f279364c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f279384w = 1;
        } else {
            this.f279384w = 0;
        }
        this.f279385x = Util.nullAs(this.f279364c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        boolean z2;
        C8451i iVar2;
        Bitmap bitmap;
        C116918i iVar3 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        C94945s2 s2Var = new C94945s2(this.f279377p, this.f279364c);
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 2);
        }
        if (iVar3 != null) {
            s2Var.mo131241O(iVar3.f350347d, iVar3.f350348e);
        }
        s2Var.mo131267x(this.f279366e);
        s2Var.mo131266w(this.f279379r);
        s2Var.mo131268y(this.f279365d);
        s2Var.mo131260q(str);
        if (!Util.isNullOrNil(this.f279382u)) {
            z2 = s2Var.mo131248e(C86013q1.m106433O(this.f279382u, 0, -1), this.f279379r, this.f279366e, this.f279376o, this.f279378q);
        } else if (Util.isNullOrNil(this.f279367f) || (iVar2 = (C8451i) C86312j.m106911c(C8451i.class)) == null || (bitmap = iVar2.get(this.f279367f)) == null) {
            z2 = false;
        } else {
            z2 = s2Var.mo131248e(BitmapUtil.Bitmap2PngBytes(bitmap), this.f279379r, this.f279366e, this.f279376o, this.f279378q);
        }
        if (!z2) {
            Log.m105924i("MicroMsg.EmotionListShareWidget", "set userData user imgurl ");
            String str3 = this.f279367f;
            s2Var.mo131246c(str3, str3, this.f279379r, this.f279376o, this.f279378q);
            z2 = true;
        }
        if (!z2) {
            Log.m105920e("MicroMsg.EmotionListShareWidget", "set userData faild");
        }
        s2Var.mo131269z(this.f279384w, this.f279385x);
        s2Var.mo131234H(this.f279371j);
        s2Var.mo131237K(this.f279369h);
        s2Var.mo131236J(this.f279370i);
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
        if (!Util.isNullOrNil(this.f279381t)) {
            s2Var.mo131231E(this.f279381t);
            s2Var.mo131230D(this.f279380s);
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
        mo133779j(s2Var);
        s2Var.mo131265v(kr22);
        int i7 = s2Var.mo131252i();
        C91998s sVar = this.f279383v;
        if (sVar != null) {
            sVar.mo125840a(i7);
            C95006y.f275639b.mo131398c(this.f279383v);
        }
        C94866e1.gy0().mo131192c();
        this.f279364c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        Bitmap bitmap = this.f279368g;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f279368g.recycle();
        }
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmotionListShareWidget");
        return false;
    }
}
