package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import g34.C116918i;
import java.util.LinkedList;
import java.util.List;
import kr2.C76634a;
import p159gw.C8462g;
import te3.C101802kr2;
import te3.f94;

/* renamed from: com.tencent.mm.plugin.sns.ui.x1 */
public class C96310x1 extends C96157q {

    /* renamed from: c */
    public MMActivity f281620c;

    /* renamed from: d */
    public String f281621d = "";

    /* renamed from: e */
    public boolean f281622e = false;

    /* renamed from: f */
    public boolean f281623f = false;

    /* renamed from: g */
    public WXMediaMessage f281624g = null;

    /* renamed from: h */
    public boolean f281625h;

    /* renamed from: i */
    public C91998s f281626i = null;

    /* renamed from: j */
    public int f281627j;

    /* renamed from: k */
    public int f281628k = 1;

    /* renamed from: l */
    public String f281629l = "";

    public C96310x1(MMActivity mMActivity, String str) {
        boolean k = m123513k(str);
        this.f281620c = mMActivity;
        this.f281625h = k;
    }

    /* renamed from: k */
    public static boolean m123513k(String str) {
        boolean z;
        int length;
        SnsMethodCalculate.markStartTimeMs("checkCanPostOnTextWidget", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("checkCanPostOnTextWidget", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
            return false;
        }
        String replaceAll = str.replaceAll("[\\p{Cf}]", "");
        if (replaceAll != null && (length = replaceAll.length()) != 0) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (!Character.isWhitespace(replaceAll.charAt(i))) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            boolean z2 = !z;
            Log.m105919d("MicroMsg.NewTextWidget", "checkCanPostOnTextWidget, canPost=%b, length=%d", Boolean.valueOf(z2), Integer.valueOf(replaceAll.length()));
            SnsMethodCalculate.markEndTimeMs("checkCanPostOnTextWidget", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
            return z2;
        }
        z = true;
        boolean z25 = !z;
        Log.m105919d("MicroMsg.NewTextWidget", "checkCanPostOnTextWidget, canPost=%b, length=%d", Boolean.valueOf(z25), Integer.valueOf(replaceAll.length()));
        SnsMethodCalculate.markEndTimeMs("checkCanPostOnTextWidget", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return z25;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return null;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        this.f281626i = C91998s.m115551f(this.f281620c.getIntent());
        this.f281620c.getIntent().getStringExtra("Kdescription");
        this.f281621d = Util.nullAs(this.f281620c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        Util.nullAs(this.f281620c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f281622e = this.f281620c.getIntent().getBooleanExtra("KThrid_app", false);
        this.f281623f = this.f281620c.getIntent().getBooleanExtra("KSnsAction", false);
        this.f281627j = this.f281620c.getIntent().getIntExtra("Ksnsupload_source", 0);
        Bundle bundleExtra = this.f281620c.getIntent().getBundleExtra("Ksnsupload_timeline");
        if (bundleExtra != null) {
            this.f281624g = new SendMessageToWX.Req(bundleExtra).message;
        }
        if (this.f281620c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f281628k = 1;
        } else {
            this.f281628k = 0;
        }
        this.f281629l = Util.nullAs(this.f281620c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        WXMediaMessage wXMediaMessage;
        C116918i iVar2 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        if (this.f281620c.isFinishing()) {
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
            return false;
        }
        C94945s2 s2Var = new C94945s2(2, this.f281620c);
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 2);
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
        if (z) {
            s2Var.mo131264u(1);
        } else {
            s2Var.mo131264u(0);
        }
        if (iVar2 != null) {
            s2Var.mo131241O(iVar2.f350347d, iVar2.f350348e);
        }
        s2Var.mo131234H(this.f281627j);
        if (this.f281622e) {
            s2Var.mo131234H(5);
        }
        if (this.f281623f && (wXMediaMessage = this.f281624g) != null) {
            s2Var.mo131238L(wXMediaMessage.mediaTagName);
            String str3 = this.f281621d;
            WXMediaMessage wXMediaMessage2 = this.f281624g;
            s2Var.mo131240N(str3, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
        }
        s2Var.mo131269z(this.f281628k, this.f281629l);
        s2Var.mo131235I((String) null, (String) null, (String) null, i4, i5);
        s2Var.mo131260q(str);
        s2Var.mo131262s(linkedList);
        s2Var.mo131265v(kr22);
        s2Var.mo131243Q(linkedList2);
        int i6 = i;
        s2Var.mo131228B(i);
        s2Var.mo131239M(i2);
        s2Var.mo131263t(list2);
        mo133779j(s2Var);
        int i7 = s2Var.mo131252i();
        C91998s sVar = this.f281626i;
        if (sVar != null) {
            sVar.mo125840a(i7);
            C95006y.f275639b.mo131398c(this.f281626i);
        }
        this.f281620c.setResult(-1, new Intent());
        C94866e1.gy0().mo131192c();
        this.f281620c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return true;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        boolean z = this.f281625h;
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return z;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return false;
    }
}
