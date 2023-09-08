package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXTextObject;
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

/* renamed from: com.tencent.mm.plugin.sns.ui.l8 */
public class C96008l8 extends C96157q {

    /* renamed from: c */
    public MMActivity f280335c;

    /* renamed from: d */
    public String f280336d = "";

    /* renamed from: e */
    public String f280337e = "";

    /* renamed from: f */
    public boolean f280338f = false;

    /* renamed from: g */
    public boolean f280339g = false;

    /* renamed from: h */
    public WXMediaMessage f280340h = null;

    /* renamed from: i */
    public C91998s f280341i = null;

    /* renamed from: j */
    public int f280342j;

    /* renamed from: k */
    public int f280343k = 1;

    /* renamed from: l */
    public String f280344l = "";

    public C96008l8(MMActivity mMActivity) {
        this.f280335c = mMActivity;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.TextWidget");
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return null;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TextWidget");
        this.f280341i = C91998s.m115551f(this.f280335c.getIntent());
        this.f280335c.getIntent().getStringExtra("Kdescription");
        this.f280336d = Util.nullAs(this.f280335c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f280337e = Util.nullAs(this.f280335c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f280338f = this.f280335c.getIntent().getBooleanExtra("KThrid_app", false);
        this.f280339g = this.f280335c.getIntent().getBooleanExtra("KSnsAction", false);
        this.f280342j = this.f280335c.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f280340h = new SendMessageToWX.Req(this.f280335c.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
        if (this.f280335c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f280343k = 1;
        } else {
            this.f280343k = 0;
        }
        this.f280344l = Util.nullAs(this.f280335c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TextWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        WXMediaMessage wXMediaMessage;
        C116918i iVar2 = iVar;
        String str3 = str;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        WXMediaMessage wXMediaMessage2 = this.f280340h;
        if (wXMediaMessage2 != null) {
            wXMediaMessage2.description = str3;
            WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
            if (iMediaObject != null && (iMediaObject instanceof WXTextObject)) {
                ((WXTextObject) iMediaObject).text = str3;
            }
        }
        C94945s2 r = C94866e1.gy0().mo131207r(this.f280340h, str3, this.f280336d, this.f280337e);
        if (r == null) {
            Log.m105921e("MicroMsg.TextWidget", "packHelper == null, %s, %s", this.f280336d, this.f280337e);
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
            return false;
        }
        pInt.value = r.mo131253j();
        if (i3 > C76634a.f224255a) {
            r.mo131261r(1, 4);
        }
        r.mo131234H(this.f280342j);
        if (this.f280338f) {
            r.mo131234H(5);
        }
        r.mo131262s(linkedList);
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
        r.mo131243Q(linkedList2);
        if (iVar2 != null) {
            r.mo131241O(iVar2.f350347d, iVar2.f350348e);
        }
        r.mo131265v(kr22);
        if (z) {
            r.mo131264u(1);
        } else {
            r.mo131264u(0);
        }
        r.mo131263t(list2);
        int i6 = i;
        r.mo131228B(i);
        r.mo131235I((String) null, (String) null, (String) null, i4, i5);
        r.mo131269z(this.f280343k, this.f280344l);
        if (this.f280339g && (wXMediaMessage = this.f280340h) != null) {
            r.mo131238L(wXMediaMessage.mediaTagName);
            String str4 = this.f280336d;
            WXMediaMessage wXMediaMessage3 = this.f280340h;
            r.mo131240N(str4, wXMediaMessage3.messageExt, wXMediaMessage3.messageAction);
        }
        mo133779j(r);
        int i7 = r.mo131252i();
        C91998s sVar = this.f280341i;
        if (sVar != null) {
            sVar.mo125840a(i7);
            C95006y.f275639b.mo131398c(this.f280341i);
        }
        C94866e1.gy0().mo131192c();
        this.f280335c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TextWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TextWidget");
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.TextWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TextWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TextWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.TextWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }
}
