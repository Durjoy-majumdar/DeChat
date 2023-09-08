package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.s5 */
public class C74214s5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f217859d;

    /* renamed from: e */
    public final /* synthetic */ String f217860e;

    /* renamed from: f */
    public final /* synthetic */ int f217861f;

    /* renamed from: g */
    public final /* synthetic */ Map f217862g;

    /* renamed from: h */
    public final /* synthetic */ String f217863h;

    /* renamed from: i */
    public final /* synthetic */ String f217864i;

    /* renamed from: j */
    public final /* synthetic */ int f217865j;

    /* renamed from: n */
    public final /* synthetic */ C72963f4 f217866n;

    /* renamed from: o */
    public final /* synthetic */ int f217867o;

    /* renamed from: p */
    public final /* synthetic */ ChattingItemDyeingTemplate f217868p;

    public C74214s5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str, String str2, int i, Map map, String str3, String str4, int i2, C72963f4 f4Var, int i3) {
        this.f217868p = chattingItemDyeingTemplate;
        this.f217859d = str;
        this.f217860e = str2;
        this.f217861f = i;
        this.f217862g = map;
        this.f217863h = str3;
        this.f217864i = str4;
        this.f217865j = i2;
        this.f217866n = f4Var;
        this.f217867o = i3;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$47", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f217859d)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f217859d);
            intent.putExtra("key_enable_teen_mode_check", true);
            C74023i.m87881c(intent, this.f217868p.f216867v.mo91577r());
            C88144b.m109791i(this.f217868p.f216867v.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(11608, this.f217868p.f216849I, this.f217860e, Integer.valueOf(this.f217861f));
            this.f217868p.mo102967U0(5, this.f217862g, this.f217863h, "", this.f217864i);
            if (this.f217865j == 1) {
                ChattingItemDyeingTemplate.m87579r0(this.f217868p, this.f217866n, this.f217867o);
            }
            ChattingItemDyeingTemplate.m87587z0(this.f217868p, (C74243t8) view.getTag(), this.f217862g);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$47", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
