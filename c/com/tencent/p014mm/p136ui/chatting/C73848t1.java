package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72681a;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.chatting.t1 */
public class C73848t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f216716d;

    /* renamed from: e */
    public final /* synthetic */ String f216717e;

    /* renamed from: f */
    public final /* synthetic */ String f216718f;

    /* renamed from: g */
    public final /* synthetic */ Map f216719g;

    /* renamed from: h */
    public final /* synthetic */ boolean f216720h;

    /* renamed from: i */
    public final /* synthetic */ int f216721i;

    /* renamed from: j */
    public final /* synthetic */ C73852u1 f216722j;

    public C73848t1(C73852u1 u1Var, String str, String str2, String str3, Map map, boolean z, int i) {
        this.f216722j = u1Var;
        this.f216716d = str;
        this.f216717e = str2;
        this.f216718f = str3;
        this.f216719g = map;
        this.f216720h = z;
        this.f216721i = i;
    }

    public void run() {
        String e = C72695v.m85063e(C72695v.m85067i(), this.f216716d, C86013q1.m106454o(this.f216717e));
        C86013q1.m106442c(this.f216717e, e);
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.setFilePath(e);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        C86009m1 m1Var = new C86009m1(e);
        wXMediaMessage.title = !Util.isNullOrNil(this.f216718f) ? this.f216718f : m1Var.getName();
        wXMediaMessage.description = Util.getSizeKB(m1Var.mo119980r());
        C72695v.m85051D(wXMediaMessage, "", "", this.f216722j.f216734c, 4, (String) null, (String) null, 0, (C72681a) null, this.f216719g, (String) null, (String) null, (String) null, (String) null);
        int lastIndexOf = m1Var.getName().lastIndexOf(".");
        C115669n.INSTANCE.mo160131h(14986, Long.valueOf(m1Var.mo119980r()), 0, Integer.valueOf(this.f216720h ? 1 : 0), Integer.valueOf(this.f216721i), (lastIndexOf < 0 || lastIndexOf >= m1Var.getName().length() - 1) ? "" : m1Var.getName().substring(lastIndexOf + 1));
    }
}
