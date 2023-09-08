package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import cy0.C75308c;
import di3.C86312j;
import ht1.C60193p4;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import s90.C77630j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f4 */
public class C73983f4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77630j f217109d;

    /* renamed from: e */
    public final /* synthetic */ int f217110e;

    /* renamed from: f */
    public final /* synthetic */ long f217111f;

    /* renamed from: g */
    public final /* synthetic */ long f217112g;

    /* renamed from: h */
    public final /* synthetic */ C19762b4 f217113h;

    public C73983f4(C19762b4 b4Var, C77630j jVar, int i, long j, long j2) {
        this.f217113h = b4Var;
        this.f217109d = jVar;
        this.f217110e = i;
        this.f217111f = j;
        this.f217112g = j2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Map<String, String> decode = SemiXml.decode(this.f217109d.f226321M);
        if (decode != null) {
            String str = "";
            if (this.f217110e != 0) {
                str = this.f217110e + str;
            }
            if (((C60193p4) C86312j.m106911c(C60193p4.class)).mo78731f7(this.f217113h.f56192v.mo91565f(), ".msg.appmsg.mmreader.category.item" + str, decode, ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(27, 2, 25, (Intent) null))) {
                Log.m105924i("MicroMsg.ChattingItemBizFrom", "biz enter finder logic");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int intExtra = this.f217113h.f56192v.f193286j.getIntExtra("KOpenArticleSceneFromScene", 10000);
        Bundle bundle = new Bundle();
        bundle.putInt("biz_video_scene", 0);
        bundle.putInt(C74928u.C74929b.f220309a, intExtra);
        bundle.putInt("geta8key_scene", 7);
        bundle.putString("geta8key_username", this.f217113h.f56192v.mo91577r());
        C75308c.m90328a(this.f217113h.f56192v.mo91565f(), this.f217111f, this.f217112g, this.f217110e, bundle);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
