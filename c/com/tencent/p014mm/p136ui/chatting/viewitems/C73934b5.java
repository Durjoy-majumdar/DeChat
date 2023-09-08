package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C76630x0;
import lp3.C88631d;
import p248ug.C52558c;
import rb0.C47984k;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b5 */
public class C73934b5 implements C88631d.C88632b<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ String f217015a;

    /* renamed from: b */
    public final /* synthetic */ String f217016b;

    /* renamed from: c */
    public final /* synthetic */ int f217017c;

    /* renamed from: d */
    public final /* synthetic */ int f217018d;

    /* renamed from: e */
    public final /* synthetic */ String f217019e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandStatObject f217020f;

    /* renamed from: g */
    public final /* synthetic */ ChattingItemDyeingTemplate f217021g;

    public C73934b5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str, String str2, int i, int i2, String str3, AppBrandStatObject appBrandStatObject) {
        this.f217021g = chattingItemDyeingTemplate;
        this.f217015a = str;
        this.f217016b = str2;
        this.f217017c = i;
        this.f217018d = i2;
        this.f217019e = str3;
        this.f217020f = appBrandStatObject;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C52558c b = C47984k.m53328b(this.f217015a);
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(b == null);
            objArr[1] = b == null ? "null" : b.field_appId;
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "try to launchWxa, bizInfo == null?: %b, appId: %s", objArr);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).Rg0(this.f217021g.f216867v.mo91565f(), this.f217016b, (String) null, this.f217017c, this.f217018d, this.f217019e, this.f217020f, b == null ? null : b.field_appId);
            C73938c.m87675a(1);
            return;
        }
        Log.m105928w("MicroMsg.ChattingItemDyeingTemplate", "update bizInfo fail, skip launch wxa");
    }
}
