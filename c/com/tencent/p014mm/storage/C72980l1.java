package com.tencent.p014mm.storage;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32224a;
import gw0.C76073b;
import gy3.C87413o;
import java.util.Map;
import kr0.C76630x0;
import p248ug.C52558c;
import rb0.C47984k;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.storage.l1 */
public final class C72980l1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Map<String, String> f212793d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f212794e;

    /* renamed from: f */
    public final /* synthetic */ Context f212795f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72980l1(Map<String, String> map, C19623o0 o0Var, Context context) {
        super(0);
        this.f212793d = map;
        this.f212794e = o0Var;
        this.f212795f = context;
    }

    public Object invoke() {
        Class cls = C76630x0.class;
        String str = this.f212793d.get(".msg.fromusername");
        String str2 = this.f212793d.get(".msg.appmsg.mmreader.notify_msg.weapp_username");
        String str3 = this.f212793d.get(".msg.appmsg.mmreader.notify_msg.weapp_path");
        int i = Util.getInt(this.f212793d.get(".msg.appmsg.mmreader.notify_msg.weapp_version"), 0);
        int i2 = Util.getInt(this.f212793d.get(".msg.appmsg.mmreader.notify_msg.weapp_state"), 0);
        String nullAsNil = Util.nullAsNil(this.f212793d.get(".msg.appmsg.template_id"));
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245534g = this.f212794e.field_msgSvrId + XVFSFile.PATH_SEPARATOR_CHAR + str + XVFSFile.PATH_SEPARATOR_CHAR + this.f212794e.field_talker + XVFSFile.PATH_SEPARATOR_CHAR + nullAsNil;
        if (((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(str)) {
            appBrandStatObject.f245533f = 1174;
            ((C76630x0) C86312j.m106911c(cls)).Ko0(this.f212795f, str2, (String) null, i2, i, str3, appBrandStatObject);
        } else {
            appBrandStatObject.f245533f = 1174;
            C52558c b = C47984k.m53328b(str);
            ((C76630x0) C86312j.m106911c(cls)).Rg0(this.f212795f, str2, (String) null, i2, i, str3, appBrandStatObject, b == null ? null : b.field_appId);
        }
        return C13598b0.f38549a;
    }
}
