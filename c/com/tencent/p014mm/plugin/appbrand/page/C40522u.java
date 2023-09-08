package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.page.C83897r;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.protocal.protobuf.AppCommentModule;
import com.tencent.p014mm.protocal.protobuf.GetProfileInfoResponse;
import com.tencent.p014mm.protocal.protobuf.WxaEvaluateBasicInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import ob0.C47350c;
import pe3.C47465a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.page.u */
public class C40522u implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ String f108847a;

    /* renamed from: b */
    public final /* synthetic */ C83897r.C40516e f108848b;

    /* renamed from: c */
    public final /* synthetic */ C83897r f108849c;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.u$a */
    public class C40523a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppCommentModule f108850d;

        /* renamed from: e */
        public final /* synthetic */ String f108851e;

        public C40523a(AppCommentModule appCommentModule, String str) {
            this.f108850d = appCommentModule;
            this.f108851e = str;
        }

        public void run() {
            if (this.f108850d != null) {
                Log.m105924i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetTradeComment");
                C40522u uVar = C40522u.this;
                C83897r rVar = uVar.f108849c;
                AppCommentModule appCommentModule = this.f108850d;
                rVar.f244958c = appCommentModule;
                C83860o oVar = (C83860o) uVar.f108848b;
                AppBrandMenuHeader.m102779a(oVar.f244844b, oVar.f244843a.f244956a.f238147j, appCommentModule);
                C84240s.m103845k(oVar.f244843a.f244956a.f238147j, 1, 1);
                return;
            }
            Log.m105924i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetScore");
            C40522u uVar2 = C40522u.this;
            C83897r rVar2 = uVar2.f108849c;
            String str = this.f108851e;
            rVar2.f244957b = str;
            ((C83860o) uVar2.f108848b).mo116419a(str);
        }
    }

    public C40522u(C83897r rVar, String str, C83897r.C40516e eVar) {
        this.f108849c = rVar;
        this.f108847a = str;
        this.f108848b = eVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        String str2;
        C47465a aVar;
        AppCommentModule appCommentModule = null;
        if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof GetProfileInfoResponse)) {
            str2 = MMApplicationContext.getContext().getString(C0966R.string.a7h);
            Log.m105920e("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, request fail");
        } else {
            Log.m105924i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, request success");
            GetProfileInfoResponse getProfileInfoResponse = (GetProfileInfoResponse) cVar.f127056b.f127083a;
            try {
                MultiProcessMMKV.getMMKV("appbrand_profile_info_mmkv_name" + this.f108847a).encode("appbrand_profile_info_key", getProfileInfoResponse.toByteArray());
            } catch (IOException unused) {
                Log.m105924i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, encode error");
            }
            AppCommentModule appCommentModule2 = getProfileInfoResponse.comment_info;
            if (appCommentModule2 != null && appCommentModule2.show_menu == 1) {
                str2 = null;
                appCommentModule = appCommentModule2;
            } else if (!Util.isNullOrNil(this.f108849c.f244957b)) {
                str2 = this.f108849c.f244957b;
            } else {
                WxaEvaluateBasicInfo wxaEvaluateBasicInfo = getProfileInfoResponse.evaluate_basic_info;
                if (wxaEvaluateBasicInfo != null) {
                    double d = wxaEvaluateBasicInfo.average_score;
                    if (d != -1.0d) {
                        if (d == 0.0d) {
                            str2 = MMApplicationContext.getContext().getString(C0966R.string.f7832sz);
                        } else {
                            str2 = MMApplicationContext.getContext().getString(C0966R.string.a8j, new Object[]{String.valueOf(getProfileInfoResponse.evaluate_basic_info.average_score)});
                        }
                    }
                }
                str2 = null;
            }
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C40523a(appCommentModule, str2));
    }
}
