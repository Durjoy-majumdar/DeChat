package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import fy3.C32226l;
import ht1.C60186m4;
import ht1.C60193p4;
import java.util.List;
import java.util.Map;
import nj3.C76912y0;
import rx3.C13598b0;
import s90.C63724h;
import sj3.C63941p;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b4$$a */
public final /* synthetic */ class b4$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19762b4 f165271d;

    /* renamed from: e */
    public final /* synthetic */ int f165272e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f165273f;

    /* renamed from: g */
    public final /* synthetic */ C67391b f165274g;

    /* renamed from: h */
    public final /* synthetic */ C74243t8 f165275h;

    public /* synthetic */ b4$$a(C19762b4 b4Var, int i, C72963f4 f4Var, C67391b bVar, C74243t8 t8Var) {
        this.f165271d = b4Var;
        this.f165272e = i;
        this.f165273f = f4Var;
        this.f165274g = bVar;
        this.f165275h = t8Var;
    }

    public final void run() {
        C19762b4 b4Var = this.f165271d;
        int i = this.f165272e;
        C72963f4 f4Var = this.f165273f;
        C67391b bVar = this.f165274g;
        C74243t8 t8Var = this.f165275h;
        b4Var.getClass();
        if (i == 5) {
            Map<String, String> decode = SemiXml.decode(f4Var.getContent());
            if (decode != null) {
                String str = "";
                if (b4Var.f56194x != 0) {
                    str = b4Var.f56194x + str;
                }
                if (!((C60193p4) C86312j.m106911c(C60193p4.class)).Vu0((AppCompatActivity) bVar.mo91565f(), ".msg.appmsg.mmreader.category.item" + str, decode)) {
                    Log.m105924i("MicroMsg.ChattingItemBizFrom", "biz enter origin logic");
                    b4Var.mo26241p0(bVar, f4Var);
                    return;
                }
                return;
            }
            b4Var.mo26241p0(bVar, f4Var);
        } else if (t8Var.f217955G == 19) {
            C63941p pVar = C63941p.f181254a;
            C63724h d = pVar.mo88706d(f4Var.getContent(), b4Var.f56194x);
            FinderObject c = pVar.mo88705c(d.f180629g, d.f180628f);
            if (c == null) {
                C76912y0.m92767f(bVar.mo91565f(), bVar.mo91565f().getResources().getString(C0966R.string.jsr));
            } else if (bVar.mo91565f() instanceof AppCompatActivity) {
                ((C60186m4) C86312j.m106911c(C60186m4.class)).mo85188lR((AppCompatActivity) bVar.mo91565f(), c, (Bundle) null, 1, (C32226l<? super List<String>, C13598b0>) null);
            } else {
                C76912y0.m92767f(bVar.mo91565f(), bVar.mo91565f().getResources().getString(C0966R.string.jsr));
            }
        } else {
            b4Var.mo26241p0(bVar, f4Var);
        }
    }
}
