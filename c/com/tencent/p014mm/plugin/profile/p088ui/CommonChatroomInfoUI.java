package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.profile.p088ui.C70306z;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import gl3.C75946n;
import ke3.C88144b;
import kv1.C99260q;
import lv1.C76728k;

/* renamed from: com.tencent.mm.plugin.profile.ui.CommonChatroomInfoUI */
public class CommonChatroomInfoUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public C72996z1 f202511C;

    /* renamed from: D */
    public C70306z f202512D;

    /* renamed from: E */
    public C70243a0 f202513E;

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        if (this.f202512D == null) {
            this.f202512D = new C70306z(this, this.f218604A, this.f202511C);
        }
        return this.f202512D;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        if (this.f202513E == null) {
            this.f202513E = new C70243a0(this, this.f218604A, this.f202511C);
        }
        return this.f202513E;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        int i = this.f202511C.f149500H;
        return i == 1 ? getString(C0966R.string.blj) : i == 2 ? getString(C0966R.string.bli) : getString(C0966R.string.bln);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        C75946n nVar = (C75946n) this.f218605d.getAdapter().getItem(i);
        if (nVar == null) {
            return;
        }
        if ((!C72996z1.m85843n5(nVar.f222600A.getUsername()) && !C72996z1.m85844o5(nVar.f222600A.getUsername())) || WeChatBrands.Business.Entries.GlobalWeCom.checkAvailable(view.getContext())) {
            C88144b.m109801s(this, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", nVar.f222600A.getUsername()).putExtra("finish_direct", true), (Bundle) null);
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f202511C = C97625j3.m125812b().mo105907v().get(getIntent().getStringExtra("Select_Talker_Name"));
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return true;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    public void initView() {
        super.initView();
        C70306z zVar = this.f202512D;
        zVar.getClass();
        C76728k kVar = new C76728k();
        kVar.f224468c = zVar.f203085n.getUsername();
        kVar.f224478m = zVar;
        kVar.f224479n = zVar.f203086o;
        kVar.f224467b = 6;
        kVar.f224477l = new C70306z.C70308b((C70306z.C70307a) null);
        ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
    }
}
