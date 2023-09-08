package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Looper;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C68139d0;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.RevokeMsgListener;
import com.tencent.p014mm.plugin.account.p024ui.C1468a;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C45612m0;
import eb0.C75592q0;
import eb0.C7628p0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hp3.C87581a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import p270xi.C91212b;
import p873bx.C67325b;
import p873bx.C67327c;
import p873bx.C67328d;
import pc0.C77068x;
import qo3.C77398g;
import qo3.C89779i0;
import te3.C50453mu3;
import te3.C50596nu3;
import te3.C51159ru3;
import zj3.C53793s0;
import zt3.C119157j;
import zt3.C119179t;

@C91212b(exportInterface = C53793s0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.k4 */
public class C73515k4 extends C73412a implements C53793s0, C11385n {

    /* renamed from: e */
    public final IListener f215959e = new RevokeMsgListener(RevokeMsgListener.C73288a.CHATTING_ITEM_VIDEO, (Activity) null);

    /* renamed from: f */
    public C77398g f215960f = null;

    /* renamed from: com.tencent.mm.ui.chatting.component.k4$a */
    public class C30823a implements C87581a<Object, C89132b.C89134c<C50596nu3>> {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f82832a;

        /* renamed from: b */
        public final /* synthetic */ String f82833b;

        public C30823a(C72963f4 f4Var, String str) {
            this.f82832a = f4Var;
            this.f82833b = str;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.ChattingUI.RevokeMsgComponent", "errCode:%d, retType:%d, errMsg:%s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), cVar.f256795c);
            C73515k4.this.f215752d.mo91561b();
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C72963f4 f4Var = this.f82832a;
                f4Var.mo108743W2(f4Var.f230723F | 4);
                C72963f4 f4Var2 = this.f82832a;
                C68139d0.m80543k1(C73515k4.this.f215752d.mo91572m().getString(C0966R.string.bzc), "  " + MMApplicationContext.getContext().getString(C0966R.string.ftg), f4Var2, f4Var2.mo108775z2());
                this.f82832a.mo108746Z2("");
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f82832a.getMsgId(), this.f82832a);
                C45612m0.m50677D(C73515k4.this.f215752d.mo91577r(), this.f82833b);
                C119179t tVar = C119157j.f356862d;
                C30822j4 j4Var = new C30822j4(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(j4Var, 300000, (String) null);
            } else {
                C76879j.m92754y(C73515k4.this.f215752d.mo91565f(), cVar.f256795c, "", C73515k4.this.f215752d.mo91572m().getString(C0966R.string.bb5), new C30821i4(this));
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.k4$b */
    public class C30824b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f82835d;

        /* renamed from: e */
        public final /* synthetic */ C89132b f82836e;

        public C30824b(C73515k4 k4Var, C72963f4 f4Var, C89132b bVar) {
            this.f82835d = f4Var;
            this.f82836e = bVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105925i("MicroMsg.ChattingUI.RevokeMsgComponent", "cancel revoke msg:%s", Long.valueOf(this.f82835d.mo108774y2()));
            this.f82836e.mo85581g();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.k4$c */
    public class C73516c implements DialogInterface.OnClickListener {
        public C73516c(C73515k4 k4Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.k4$d */
    public class C73517d implements DialogInterface.OnClickListener {
        public C73517d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77398g gVar = C73515k4.this.f215960f;
            if (gVar != null) {
                gVar.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.k4$e */
    public class C73518e implements DialogInterface.OnClickListener {
        public C73518e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77398g gVar = C73515k4.this.f215960f;
            if (gVar != null) {
                gVar.dismiss();
            }
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        if (!EventCenter.instance.hadListened(this.f215959e)) {
            this.f215959e.alive();
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        this.f215959e.dead();
    }

    /* renamed from: R4 */
    public void mo74367R4(C72963f4 f4Var, String str) {
        C77068x.C77069a aVar;
        C89779i0 i0Var;
        Map<String, String> parseXml;
        C72963f4 f4Var2 = f4Var;
        String str2 = str;
        boolean z = false;
        int i = 2;
        if (f4Var.getType() != 1107296305 || (parseXml = XmlParser.parseXml(f4Var.mo108775z2(), "msg", (String) null)) == null) {
            C67325b bVar = C67325b.f193160a;
            C67391b bVar2 = this.f215752d;
            C87412m.m108594g(bVar2, "chattingContext");
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(f4Var.getMsgId());
            Log.m105924i("MicroMsg.ChattingContext", "[isShowDialog]");
            C89779i0 i0Var2 = ((ChattingUIFragment) bVar2.f193287k).f215305w;
            if (!(i0Var2 != null && i0Var2.isShowing())) {
                String string = bVar2.mo91572m().getString(C0966R.string.bb8);
                C87412m.m108593f(string, "chattingContext.resource…chatting_revoke_msg_tips)");
                C67325b.f193161b = new WeakReference<>(C76879j.m92723Q(bVar2.mo91565f(), (String) null, bVar2.mo91572m().getString(C0966R.string.bb7), true, false, (DialogInterface.OnCancelListener) null));
                Log.m105924i("MMRevoke.RevokeMsgHandler", "reqRevoke() called with: msgId:" + b002.getMsgId() + " msgSvrId:" + b002.mo108774y2() + " type:" + b002.getType() + " status:" + b002.getStatus() + ", revokeTicket = " + str2 + ", synchFlag:" + b002.f230728K);
                if (b002.getStatus() == 2 || b002.f230728K == 1) {
                    bVar.mo91457a(b002, string, str2);
                } else if (b002.getStatus() == 5) {
                    WeakReference<C89779i0> weakReference = C67325b.f193161b;
                    if (!(weakReference == null || (i0Var = weakReference.get()) == null)) {
                        i0Var.dismiss();
                    }
                    Log.m105924i("MMRevoke.RevokeMsgHandler", "reqRevoke() realtime STATE_FAILED msgId=" + b002.getMsgId());
                    C76912y0.m92769h(bVar2.mo91565f(), bVar2.mo91572m().getString(C0966R.string.ct7), C0966R.raw.icons_filled_error);
                    C72963f4 b003 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(b002.getMsgId());
                    HashMap<Long, C77068x.C77069a> hashMap = C77068x.f225121b;
                    synchronized (hashMap) {
                        aVar = hashMap.get(Long.valueOf(b003.getMsgId()));
                    }
                    if (aVar != null && aVar.f225125d) {
                        z = true;
                    }
                    if (z) {
                        i = 3;
                    }
                    C67328d.m79664b(i, b003, 3);
                } else {
                    ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(new C67327c(b002, string, str2, bVar2), Looper.getMainLooper());
                }
            }
        } else {
            String str3 = parseXml.get(".msg.appmsg.announcement_id");
            String str4 = "" + C7628p0.m7761a(C75592q0.m90789s(), f4Var.getCreateTime()).hashCode();
            Log.m105925i("MicroMsg.ChattingUI.RevokeMsgComponent", "revoke announcement, msgID:%s, clientId:%s, announcementID:%s, chatroomName:%s", Long.valueOf(f4Var.mo108774y2()), str4, str3, f4Var.mo108768t());
            C50453mu3 mu32 = new C50453mu3();
            mu32.f138215d = f4Var.mo108774y2();
            mu32.f138218g = str4;
            mu32.f138216e = f4Var.mo108768t();
            mu32.f138217f = str3;
            C47350c.C47352b bVar3 = new C47350c.C47352b();
            bVar3.f127069d = 8006;
            bVar3.f127068c = "/cgi-bin/micromsg-bin/revokechatroomannouncement";
            bVar3.f127066a = mu32;
            bVar3.f127067b = new C50596nu3();
            C47350c a = bVar3.mo72403a();
            C89132b bVar4 = new C89132b();
            bVar4.mo123453j(a);
            bVar4.mo9225i().mo123062e(new C30823a(f4Var2, str3));
            C67391b bVar5 = this.f215752d;
            bVar5.getClass();
            Log.m105924i("MicroMsg.ChattingContext", "[isShowDialog]");
            C89779i0 i0Var3 = ((ChattingUIFragment) bVar5.f193287k).f215305w;
            if (i0Var3 != null && i0Var3.isShowing()) {
                z = true;
            }
            if (!z) {
                C67391b bVar6 = this.f215752d;
                bVar6.mo91552M(bVar6.mo91565f(), (String) null, this.f215752d.mo91572m().getString(C0966R.string.bb7), true, true, new C30824b(this, f4Var2, bVar4));
            }
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C97625j3.m125815e().mo123455a(594, this);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        this.f215959e.dead();
        C97625j3.m125815e().mo123470p(594, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ChattingUI.RevokeMsgComponent", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " sceneType:" + yVar.getType());
        this.f215752d.mo91561b();
        C77398g gVar = this.f215960f;
        if (gVar != null) {
            gVar.dismiss();
            this.f215960f = null;
        }
        C67391b bVar = this.f215752d;
        if (!bVar.f193283g) {
            Log.m105924i("MicroMsg.ChattingUI.RevokeMsgComponent", "onSceneEnd fragment not foreground, return");
        } else if (Util.isTopActivity(bVar.mo91565f())) {
            Activity f = this.f215752d.mo91565f();
            if (!(C74785j2.C6981a.m7247a(f, i, i2, str, 7) || C1468a.m1500a(f, i, i2, new Intent().setClass(f, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str))) {
                if (i == 0 && i2 == 0) {
                    if (yVar.getType() == 594 && (yVar instanceof C68139d0)) {
                        C51159ru3 ru32 = (C51159ru3) ((C68139d0) yVar).f195816g.f127056b.f127083a;
                        if (!Util.isNullOrNil(ru32.f141155d)) {
                            C76879j.m92754y(this.f215752d.mo91565f(), ru32.f141155d, "", this.f215752d.mo91572m().getString(C0966R.string.bb5), new C73516c(this));
                        }
                    }
                } else if (yVar.getType() == 594 && (yVar instanceof C68139d0)) {
                    C51159ru3 ru33 = (C51159ru3) ((C68139d0) yVar).f195816g.f127056b.f127083a;
                    Log.m105919d("MicroMsg.ChattingUI.RevokeMsgComponent", "[oneliang][revokeMsgTimeout] sysWording:%s", ru33.f141156e);
                    if (!(i2 == 0 || Util.isNullOrNil(ru33.f141156e))) {
                        Log.m105919d("MicroMsg.ChattingUI.RevokeMsgComponent", "[oneliang][revokeMsg] sysWording:%s", ru33.f141156e);
                        this.f215960f = C76879j.m92754y(this.f215752d.mo91565f(), ru33.f141156e, "", this.f215752d.mo91572m().getString(C0966R.string.bb5), new C73517d());
                        return;
                    }
                    Log.m105919d("MicroMsg.ChattingUI.RevokeMsgComponent", "[oneliang][revokeMsg] errorCode:%s,sysWording:%s", Integer.valueOf(i2), ru33.f141156e);
                    this.f215960f = C76879j.m92754y(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.bb6), "", this.f215752d.mo91572m().getString(C0966R.string.bb5), new C73518e());
                }
            }
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        C97625j3.m125815e().mo123470p(594, this);
    }
}
