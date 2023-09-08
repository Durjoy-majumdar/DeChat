package ry1;

import com.tencent.p014mm.plugin.game.p061ui.CreateOrJoinChatroomUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import py1.C47598i1;

/* renamed from: ry1.h */
public class C48120h implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ CreateOrJoinChatroomUI f128993d;

    public C48120h(CreateOrJoinChatroomUI createOrJoinChatroomUI) {
        this.f128993d = createOrJoinChatroomUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C47598i1 i1Var = (C47598i1) cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0) {
            String str2 = i1Var.f127777d;
            Log.m105925i("MicroMsg.CreateOrJoinChatroomUI", "Join Url: %s", str2);
            CreateOrJoinChatroomUI createOrJoinChatroomUI = this.f128993d;
            int i3 = CreateOrJoinChatroomUI.f113614q;
            createOrJoinChatroomUI.mo66110F7();
            CreateOrJoinChatroomUI.m45844E7(this.f128993d, str2);
            return 0;
        }
        Log.m105921e("MicroMsg.CreateOrJoinChatroomUI", "CGI return is not OK. (%d, %d)(%s)", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 4) {
            CreateOrJoinChatroomUI createOrJoinChatroomUI2 = this.f128993d;
            int i4 = i1Var.f127778e;
            int i5 = CreateOrJoinChatroomUI.f113614q;
            createOrJoinChatroomUI2.mo66111G7(i4);
        } else {
            CreateOrJoinChatroomUI createOrJoinChatroomUI3 = this.f128993d;
            int i6 = CreateOrJoinChatroomUI.f113614q;
            createOrJoinChatroomUI3.mo66111G7(-1);
        }
        this.f128993d.mo66110F7();
        this.f128993d.finish();
        return 0;
    }
}
