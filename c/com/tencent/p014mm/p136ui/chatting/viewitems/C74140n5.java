package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C97625j3;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import rd0.C22222c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n5 */
public class C74140n5 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f217641d;

    /* renamed from: e */
    public final /* synthetic */ C74307x8 f217642e;

    /* renamed from: f */
    public final /* synthetic */ boolean f217643f;

    /* renamed from: g */
    public final /* synthetic */ String f217644g;

    /* renamed from: h */
    public final /* synthetic */ ChattingItemDyeingTemplate f217645h;

    public C74140n5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C72963f4 f4Var, C74307x8 x8Var, boolean z, String str) {
        this.f217645h = chattingItemDyeingTemplate;
        this.f217641d = f4Var;
        this.f217642e = x8Var;
        this.f217643f = z;
        this.f217644g = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C97625j3.m125815e().mo123470p(1176, this);
        int i3 = 2;
        Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.TRUE);
        if (this.f217641d != this.f217642e.f218248L.getTag(C0966R.C0970id.hbt)) {
            Log.m105929w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", Long.valueOf(this.f217641d.getMsgId()));
        } else if (i == 0 && i2 == 0) {
            C22222c cVar = this.f217645h.f216853M;
            if (cVar != null) {
                cVar.mo35374o(this.f217644g, !this.f217643f);
            }
        } else {
            this.f217645h.mo102970X0(this.f217642e, this.f217643f ? 8 : 0);
            C76912y0.makeText((Context) this.f217645h.f216867v.mo91565f(), (int) C0966R.string.hd9, 0).show();
            UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
            UpdateWxaOptionsEvent.C67810a aVar = updateWxaOptionsEvent.f193994d;
            aVar.f193996a = this.f217644g;
            if (!this.f217643f) {
                i3 = 1;
            }
            aVar.f193997b = i3;
            aVar.f193998c = 1;
            updateWxaOptionsEvent.publish();
            C67391b bVar = this.f217645h.f216867v;
            if (bVar != null) {
                bVar.mo91540A();
            }
        }
    }
}
