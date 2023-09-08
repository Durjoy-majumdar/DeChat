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
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
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
import i61.C98602h;
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
import z51.C39315g;
import zc3.C39343a;

/* renamed from: com.tencent.mm.plugin.sns.ui.b0 */
public class C95737b0 extends C96157q {

    /* renamed from: c */
    public MMActivity f279230c;

    /* renamed from: d */
    public String f279231d = "";

    /* renamed from: e */
    public String f279232e = "";

    /* renamed from: f */
    public String f279233f = "";

    /* renamed from: g */
    public Bitmap f279234g = null;

    /* renamed from: h */
    public String f279235h;

    /* renamed from: i */
    public String f279236i;

    /* renamed from: j */
    public int f279237j;

    /* renamed from: k */
    public View f279238k = null;

    /* renamed from: l */
    public CdnImageView f279239l = null;

    /* renamed from: m */
    public TextView f279240m = null;

    /* renamed from: n */
    public boolean f279241n = false;

    /* renamed from: o */
    public int f279242o;

    /* renamed from: p */
    public String f279243p = "";

    /* renamed from: q */
    public String f279244q = "";

    /* renamed from: r */
    public String f279245r = "";

    /* renamed from: s */
    public String f279246s = "";

    /* renamed from: t */
    public String f279247t = "";

    /* renamed from: u */
    public C91998s f279248u = null;

    /* renamed from: v */
    public int f279249v = 1;

    /* renamed from: w */
    public String f279250w = "";

    public C95737b0(MMActivity mMActivity) {
        this.f279230c = mMActivity;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        View inflate = C85868k2.m106137b(this.f279230c).inflate(C0966R.C0971layout.f360041cb2, (ViewGroup) null);
        this.f279238k = inflate;
        this.f279239l = (CdnImageView) inflate.findViewById(C0966R.C0970id.f4p);
        this.f279240m = (TextView) this.f279238k.findViewById(C0966R.C0970id.kpq);
        TextView textView = (TextView) this.f279238k.findViewById(C0966R.C0970id.iub);
        if (this.f279241n) {
            View findViewById = this.f279238k.findViewById(C0966R.C0970id.k0s);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = this.f279238k.findViewById(C0966R.C0970id.k0s);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f279240m.setText(this.f279232e);
        if (!Util.isNullOrNil(this.f279233f)) {
            this.f279239l.setVisibility(0);
            this.f279239l.setUrl(this.f279233f);
        } else if (!Util.isNullOrNil((byte[]) null)) {
            this.f279239l.setVisibility(0);
            Bitmap decodeByteArray = BitmapUtil.decodeByteArray((byte[]) null);
            this.f279234g = decodeByteArray;
            this.f279239l.setImageBitmap(decodeByteArray);
        } else {
            this.f279239l.setVisibility(8);
        }
        C102236a0.m134779x0(this.f279239l, this.f279230c);
        View view3 = this.f279238k;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return view3;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        this.f279248u = C91998s.m115551f(this.f279230c.getIntent());
        this.f279230c.getIntent().getIntExtra("Ksnsupload_width", -1);
        this.f279230c.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f279237j = this.f279230c.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f279231d = Util.nullAs(this.f279230c.getIntent().getStringExtra("Ksnsupload_link"), "");
        this.f279232e = Util.nullAs(this.f279230c.getIntent().getStringExtra("Ksnsupload_title"), "");
        this.f279233f = Util.nullAs(this.f279230c.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
        this.f279247t = this.f279230c.getIntent().getStringExtra("KsnsUpload_imgPath");
        this.f279241n = this.f279230c.getIntent().getBooleanExtra("ksnsis_video", false);
        this.f279235h = Util.nullAs(this.f279230c.getIntent().getStringExtra("src_username"), "");
        this.f279236i = Util.nullAs(this.f279230c.getIntent().getStringExtra("src_displayname"), "");
        this.f279244q = Util.nullAs(this.f279230c.getIntent().getStringExtra("KContentObjDesc"), "");
        this.f279243p = Util.nullAs(this.f279230c.getIntent().getStringExtra("KUploadProduct_UserData"), "");
        this.f279245r = Util.nullAs(this.f279230c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f279246s = Util.nullAs(this.f279230c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f279242o = this.f279230c.getIntent().getIntExtra("KUploadProduct_subType", 0);
        if (this.f279230c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f279249v = 1;
        } else {
            this.f279249v = 0;
        }
        this.f279250w = Util.nullAs(this.f279230c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        boolean z2;
        C8451i iVar2;
        Bitmap bitmap;
        C116918i iVar3 = iVar;
        Class cls = C39315g.class;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        C94945s2 s2Var = new C94945s2(17, this.f279230c);
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 2);
        }
        if (iVar3 != null) {
            s2Var.mo131241O(iVar3.f350347d, iVar3.f350348e);
        }
        s2Var.mo131267x(this.f279232e);
        s2Var.mo131266w(this.f279244q);
        s2Var.mo131268y(this.f279231d);
        s2Var.mo131260q(str);
        if (!Util.isNullOrNil(this.f279247t)) {
            z2 = s2Var.mo131248e(C86013q1.m106433O(this.f279247t, 0, -1), this.f279244q, this.f279232e, this.f279242o, this.f279243p);
        } else if (Util.isNullOrNil(this.f279233f) || (iVar2 = (C8451i) C86312j.m106911c(C8451i.class)) == null || (bitmap = iVar2.get(this.f279233f)) == null) {
            z2 = false;
        } else {
            z2 = s2Var.mo131248e(BitmapUtil.Bitmap2PngBytes(bitmap), this.f279244q, this.f279232e, this.f279242o, this.f279243p);
        }
        if (!z2) {
            Log.m105924i("MicroMsg.EmojiDesignerShareWidget", "set userData user imgurl ");
            String str3 = this.f279233f;
            s2Var.mo131246c(str3, str3, this.f279244q, this.f279242o, this.f279243p);
            z2 = true;
        }
        if (!z2) {
            Log.m105920e("MicroMsg.EmojiDesignerShareWidget", "set userData faild");
        }
        s2Var.mo131269z(this.f279249v, this.f279250w);
        s2Var.mo131234H(this.f279237j);
        s2Var.mo131237K(this.f279235h);
        s2Var.mo131236J(this.f279236i);
        s2Var.mo131235I((String) null, (String) null, (String) null, i4, i5);
        s2Var.mo131262s(linkedList);
        s2Var.mo131228B(i);
        if (z) {
            s2Var.mo131264u(1);
        } else {
            s2Var.mo131264u(0);
        }
        s2Var.mo131263t(list2);
        if (!Util.isNullOrNil(this.f279246s)) {
            s2Var.mo131231E(this.f279246s);
            s2Var.mo131230D(this.f279245r);
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
        int i6 = s2Var.mo131252i();
        C91998s sVar = this.f279248u;
        if (sVar != null) {
            sVar.mo125840a(i6);
            C95006y.f275639b.mo131398c(this.f279248u);
        }
        C94866e1.gy0().mo131192c();
        this.f279230c.finish();
        C39343a cm = ((C39315g) C86312j.m106911c(cls)).mo58035cm();
        String str4 = this.f279243p;
        ((C98602h) cm).getClass();
        EmojiLogic.m117474e(str4);
        C39343a cm4 = ((C39315g) C86312j.m106911c(cls)).mo58035cm();
        String str5 = this.f279243p;
        ((C98602h) cm4).getClass();
        EmojiLogic.m117472c(str5);
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        Bitmap bitmap = this.f279234g;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f279234g.recycle();
        }
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return false;
    }
}
