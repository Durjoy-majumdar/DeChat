package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C45286l;
import di3.C86312j;
import ke3.C88144b;
import nj3.C76879j;
import p148ei.C7660a;
import p248ug.C52574z;
import qb0.C77306a;
import qb0.C77307c;
import sf0.C48374j0;
import te3.C77967mx3;

/* renamed from: com.tencent.mm.plugin.fts.ui.o */
public class C68989o implements C77306a {

    /* renamed from: d */
    public final /* synthetic */ String f198235d;

    /* renamed from: e */
    public final /* synthetic */ FTSBaseMainUI f198236e;

    public C68989o(FTSBaseMainUI fTSBaseMainUI, String str) {
        this.f198236e = fTSBaseMainUI;
        this.f198235d = str;
    }

    public void onChanged(Object obj) {
        C77307c cVar = (C77307c) obj;
        Class cls = C52574z.class;
        int i = cVar.f225434b;
        int i2 = cVar.f225435c;
        String str = cVar.f225436d;
        C45286l lVar = (C45286l) cVar.f225437e;
        if (i == 4 && i2 == -4) {
            FTSBaseMainUI fTSBaseMainUI = this.f198236e;
            int i3 = FTSBaseMainUI.f52727D;
            fTSBaseMainUI.getClass();
            MMHandlerThread.postToMainThread(new C68988n(fTSBaseMainUI));
            C76879j.m92744o(this.f198236e, C0966R.string.igp, 0, true, (DialogInterface.OnClickListener) null);
            return;
        }
        FTSBaseMainUI fTSBaseMainUI2 = this.f198236e;
        int i4 = FTSBaseMainUI.f52727D;
        fTSBaseMainUI2.getClass();
        MMHandlerThread.postToMainThread(new C68988n(fTSBaseMainUI2));
        if (i == 0 && i2 == 0) {
            C77967mx3 l0 = lVar.mo70811l0();
            if (l0.f227845D > 0) {
                if (l0.f227846E.isEmpty()) {
                    C76879j.m92744o(this.f198236e, C0966R.string.igp, 0, true, (DialogInterface.OnClickListener) null);
                    return;
                }
                Intent intent = new Intent();
                ((C52574z) C86312j.m106911c(cls)).mo73535ek(intent, l0.f227846E.getFirst(), this.f198236e.f52728A);
                C88144b.m109791i(this.f198236e, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            } else if (Util.nullAsNil(C48374j0.m53718g(l0.f227857d)).length() > 0) {
                int i5 = l0.f227852K;
                if (2 == i5) {
                    this.f198236e.f52728A = 15;
                } else if (1 == i5) {
                    this.f198236e.f52728A = 1;
                }
                Intent intent2 = new Intent();
                ((C52574z) C86312j.m106911c(cls)).mo73528B0(intent2, l0, this.f198236e.f52728A);
                if (this.f198236e.f52728A == 15) {
                    intent2.putExtra("Contact_Search_Mobile", this.f198235d.trim());
                }
                intent2.putExtra("Contact_Scene", this.f198236e.f52728A);
                intent2.putExtra("add_more_friend_search_scene", 2);
                C88144b.m109791i(this.f198236e, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
            }
        } else {
            if (i2 == -24) {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    C76879j.m92713G(this.f198236e, a.f26001b, a.f26003d, true, (DialogInterface.OnClickListener) null);
                }
            } else if (i2 == -4) {
                FTSBaseMainUI fTSBaseMainUI3 = this.f198236e;
                Toast.makeText(fTSBaseMainUI3, fTSBaseMainUI3.getString(C0966R.string.igk), 0).show();
            }
            Log.m105928w("MicroMsg.FTS.FTSMainUI", String.format("Search contact failed: %d, %d.", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }
}
