package com.tencent.p014mm.plugin.profile.p088ui.tab.data;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import gy3.C87412m;
import hf2.C46051m;
import kotlin.Metadata;
import mf2.C47019a;
import ob0.C47350c;
import ob0.C89144l0;
import pe3.C89349b;
import te3.C48855bh;
import te3.C49001ch;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/data/BizProfileDataFetcher;", "Landroidx/lifecycle/r;", "", "addContactScene", "", "bizUsername", "Lcom/tencent/mm/ui/MMActivity;", "context", "searchClickId", "<init>", "(ILjava/lang/String;Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher */
public final class BizProfileDataFetcher implements C0124r {

    /* renamed from: d */
    public int f115649d;

    /* renamed from: e */
    public final String f115650e;

    /* renamed from: f */
    public final MMActivity f115651f;

    /* renamed from: g */
    public final String f115652g;

    /* renamed from: h */
    public final C54219z<C49001ch> f115653h = new C54219z<>();

    /* renamed from: i */
    public final C54219z<C49001ch> f115654i;

    /* renamed from: j */
    public final C54219z<C49001ch> f115655j;

    /* renamed from: n */
    public boolean f115656n;

    /* renamed from: o */
    public boolean f115657o;

    /* renamed from: p */
    public boolean f115658p;

    /* renamed from: q */
    public int f115659q;

    public BizProfileDataFetcher(int i, String str, MMActivity mMActivity, String str2) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(mMActivity, "context");
        this.f115649d = i;
        this.f115650e = str;
        this.f115651f = mMActivity;
        this.f115652g = str2;
        C46051m.m51353b(str);
        this.f115654i = new C54219z<>();
        this.f115655j = new C54219z<>();
    }

    /* renamed from: a */
    public static C47350c m46402a(BizProfileDataFetcher bizProfileDataFetcher, int i, int i2, C89349b bVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 20;
        }
        if ((i3 & 4) != 0) {
            bVar = null;
        }
        bizProfileDataFetcher.getClass();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 2656;
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/bizattr/bizprofilev2";
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C48855bh bhVar = new C48855bh();
        bhVar.f131109d = bizProfileDataFetcher.f115650e;
        bhVar.f131110e = i;
        bhVar.f131111f = bVar;
        bhVar.f131112g = i2;
        bhVar.f131115j = bizProfileDataFetcher.f115649d;
        bhVar.f131114i = C19636w0.f55626c;
        bhVar.f131116n = bizProfileDataFetcher.f115652g;
        bVar2.f127066a = bhVar;
        bVar2.f127067b = new C49001ch();
        return bVar2.mo72403a();
    }

    /* renamed from: b */
    public final void mo66863b() {
        if (this.f115656n) {
            Log.m105924i("MicroMsg.BizProfileDataFetcher", "not obtailBizInfoFromCgi, use cache");
            return;
        }
        this.f115656n = true;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2656;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/bizattr/bizprofilev2";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C48855bh bhVar = new C48855bh();
        bhVar.f131109d = this.f115650e;
        bhVar.f131117o = this.f115659q;
        bhVar.f131110e = 0;
        bhVar.f131112g = 5;
        bhVar.f131115j = this.f115649d;
        bhVar.f131114i = C19636w0.f55626c;
        bhVar.f131116n = this.f115652g;
        bVar.f127066a = bhVar;
        bVar.f127067b = new C49001ch();
        C89144l0.m111430f(bVar.mo72403a(), new C47019a(true, this), false, this.f115651f);
    }

    /* renamed from: c */
    public final C54219z<C49001ch> mo66864c() {
        return this.f115653h;
    }
}
