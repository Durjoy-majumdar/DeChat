package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gw0.C76073b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import kr0.C76630x0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p5 */
public class C74167p5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f217700d;

    /* renamed from: e */
    public final /* synthetic */ String f217701e;

    /* renamed from: f */
    public final /* synthetic */ int f217702f;

    /* renamed from: g */
    public final /* synthetic */ int f217703g;

    /* renamed from: h */
    public final /* synthetic */ String f217704h;

    /* renamed from: i */
    public final /* synthetic */ int f217705i;

    /* renamed from: j */
    public final /* synthetic */ C72963f4 f217706j;

    /* renamed from: n */
    public final /* synthetic */ int f217707n;

    /* renamed from: o */
    public final /* synthetic */ String f217708o;

    /* renamed from: p */
    public final /* synthetic */ int f217709p;

    /* renamed from: q */
    public final /* synthetic */ Map f217710q;

    /* renamed from: r */
    public final /* synthetic */ String f217711r;

    /* renamed from: s */
    public final /* synthetic */ String f217712s;

    /* renamed from: t */
    public final /* synthetic */ ChattingItemDyeingTemplate f217713t;

    public C74167p5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str, String str2, int i, int i2, String str3, int i3, C72963f4 f4Var, int i4, String str4, int i5, Map map, String str5, String str6) {
        this.f217713t = chattingItemDyeingTemplate;
        this.f217700d = str;
        this.f217701e = str2;
        this.f217702f = i;
        this.f217703g = i2;
        this.f217704h = str3;
        this.f217705i = i3;
        this.f217706j = f4Var;
        this.f217707n = i4;
        this.f217708o = str4;
        this.f217709p = i5;
        this.f217710q = map;
        this.f217711r = str5;
        this.f217712s = str6;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C74243t8 t8Var = (C74243t8) view.getTag();
        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) button1 click", this.f217700d);
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245534g = t8Var.f212238a.mo108774y2() + XVFSFile.PATH_SEPARATOR + t8Var.f217968b + XVFSFile.PATH_SEPARATOR + this.f217713t.f216867v.mo91577r() + XVFSFile.PATH_SEPARATOR + this.f217701e;
        if (((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(t8Var.f217968b)) {
            appBrandStatObject.f245533f = ChattingItemDyeingTemplate.m87584w0(this.f217701e);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(this.f217713t.f216867v.mo91565f(), this.f217700d, (String) null, this.f217702f, this.f217703g, this.f217704h, appBrandStatObject);
        } else {
            appBrandStatObject.f245533f = XWebFeature.INTERFACE_CONFIGURE_V8_LITE;
            ChattingItemDyeingTemplate.m87577p0(this.f217713t, t8Var.f217968b, this.f217700d, this.f217702f, this.f217703g, this.f217704h, appBrandStatObject);
        }
        if (this.f217705i == 1) {
            ChattingItemDyeingTemplate.m87579r0(this.f217713t, this.f217706j, this.f217707n);
        }
        ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f217713t;
        chattingItemDyeingTemplate.mo102950C0(9, chattingItemDyeingTemplate.f216850J, chattingItemDyeingTemplate.f216849I);
        C115669n.INSTANCE.mo160131h(11608, this.f217713t.f216849I, this.f217708o, Integer.valueOf(this.f217709p));
        this.f217713t.mo102967U0(5, this.f217710q, this.f217711r, "", this.f217712s);
        ChattingItemDyeingTemplate.m87587z0(this.f217713t, t8Var, this.f217710q);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
