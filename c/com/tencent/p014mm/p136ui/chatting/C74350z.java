package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.z */
public class C74350z extends C74023i.C74035f {

    /* renamed from: g */
    public final /* synthetic */ AppBrandServiceChattingUI.AppBrandServiceChattingFmUI f218400g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74350z(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI, C67391b bVar, C74023i iVar) {
        super(bVar, iVar);
        this.f218400g = appBrandServiceChattingFmUI;
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        C68070l.C68072b u;
        Log.m105918d("MicroMsg.AppBrandServiceChattingUI", "clickListener ChattingListClickListener onClick");
        C74243t8 t8Var = (C74243t8) view.getTag();
        if (f4Var.mo100979R3()) {
            super.mo57756a(view, bVar, f4Var);
        } else if (f4Var.mo101020w3()) {
            String content = f4Var.getContent();
            if (content != null && (u = C68070l.C68072b.m80422u(content, (String) null)) != null) {
                AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f218400g;
                if (appBrandServiceChattingFmUI.f215155R == 2 && u.f195582i == 33 && appBrandServiceChattingFmUI.f215157S.f239539d.equals(u.f195577g2)) {
                    AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.m86300w0(this.f218400g, u.f195569e2);
                } else {
                    super.mo57756a(view, bVar, f4Var);
                }
            }
        } else {
            super.mo57756a(view, bVar, f4Var);
        }
    }
}
