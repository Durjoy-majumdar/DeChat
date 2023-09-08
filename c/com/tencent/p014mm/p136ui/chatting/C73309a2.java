package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelimage.C1300x;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C86493v0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gw0.C76073b;
import ht1.C60205t5;
import i61.C98602h;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import mk3.C21506a;
import nj3.C76879j;
import nj3.C76912y0;
import p1081gi.C98121d;
import p158gt.C76053l;
import p158gt.C98201k;
import p652pu.C100910b;
import p680ru.C77569h;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import s90.C77627f;
import s90.C77630j;
import z51.C39315g;
import zj3.C79394z0;

/* renamed from: com.tencent.mm.ui.chatting.a2 */
public class C73309a2 {

    /* renamed from: com.tencent.mm.ui.chatting.a2$a */
    public class C73310a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.a2$b */
    public class C73311b implements C88144b.C76564c {

        /* renamed from: a */
        public final /* synthetic */ C67391b f215413a;

        public C73311b(C67391b bVar) {
            this.f215413a = bVar;
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            if (i == 3001) {
                Log.m105925i("MicroMsg.ChattingItemHelper", "gotoEditUI() REQUEST_CODE_VIEW_GROUP_SOLITATIRE resultCode:%s", Integer.valueOf(i2));
                if (-1 == i2 && intent != null) {
                    ((C79394z0) this.f215413a.f193278b.mo102812a(C79394z0.class)).mo102661s(intent.getStringExtra("key_group_solitatire_content"));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m86448a(long j, int i, Context context, Fragment fragment, Activity activity, C72963f4 f4Var) {
        C72963f4 f4Var2 = f4Var;
        Class cls = C77569h.class;
        String t = f4Var.mo108768t();
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(f4Var.mo108774y2());
        String a = C86493v0.m107223a(sb.toString());
        C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
        c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
        c.mo120962i("preUsername", t);
        c.mo120962i("preChatName", t);
        c.mo120962i("preMsgIndex", Integer.valueOf(i));
        c.mo120962i("sendAppMsgScene", 1);
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264682g = i;
        aVar.f264683h = a;
        aVar.f264685j = fragment;
        aVar.f264684i = activity;
        aVar.f264688m = 40;
        C96787m0.m124256j(doFavoriteEvent, f4Var2);
        doFavoriteEvent.publish();
        if (doFavoriteEvent.f264675e.f9046a == 0) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(C92721n.m116881i(context, i, f4Var.getContent(), f4Var.mo108768t(), f4Var.getMsgId()), (String) null);
            if (f4Var.mo101020w3()) {
                ((C77569h) C86312j.m106911c(cls)).mo35238ci(f4Var2, u != null ? u.f195582i : 0);
            } else {
                ((C77569h) C86312j.m106911c(cls)).mo35241nt(f4Var2);
            }
            if (u != null && u.f195582i == 5 && u.f195586j != null) {
                Log.m105919d("MicroMsg.ChattingItemHelper", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, u.f195586j, Long.valueOf(j), 1, 2, 1);
                try {
                    str = URLEncoder.encode(u.f195586j, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicroMsg.ChattingItemHelper", e, str, new Object[0]);
                }
                C115669n.INSTANCE.mo160131h(13378, str, Long.valueOf(j), 1, 2, 1);
            }
        }
    }

    /* renamed from: b */
    public static void m86449b(C67391b bVar, long j, int i) {
        Log.m105925i("MicroMsg.ChattingItemHelper", "gotoEditUI() msgId:%s scene:%s", Long.valueOf(j), Integer.valueOf(i));
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        Intent intent = new Intent();
        intent.putExtra("Chat_Msg_Id", j);
        intent.putExtra("key_group_solitatire_create", false);
        intent.putExtra("key_group_solitatire_key", b002.f230737U);
        intent.putExtra("key_group_solitatire_chatroom_username", b002.mo108768t());
        intent.putExtra("key_group_solitatire_scene", i);
        C88144b.m109798p(bVar.f193279c, "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, 3001, new C73311b(bVar));
    }

    /* renamed from: c */
    public static boolean m86450c(String str) {
        C101106m b = C101093a.m132480b();
        if (b != null && b.f295960e != null && b.f295959d == 0 && C101093a.m132481c()) {
            try {
                if (Util.isEqual(b.f295960e, str)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m86451d(View view, Context context, String str) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        String str2 = t8Var.f217975i;
        if (TextUtils.isEmpty(str2)) {
            str2 = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138003J(t8Var.f217988v);
        }
        if (TextUtils.isEmpty(str2)) {
            Intent intent = new Intent();
            intent.putExtra("geta8key_username", str);
            intent.putExtra("rawUrl", t8Var.f217988v);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("extra_id", str2);
        intent2.putExtra("extra_name", t8Var.f217982p);
        if (t8Var.f217976j) {
            intent2.putExtra("download_entrance_scene", 20);
            intent2.putExtra("preceding_scence", 3);
            intent2.putExtra("reward_tip", true);
            C115669n.INSTANCE.mo160131h(12953, 1, str2);
        } else if (t8Var.f217977k) {
            intent2.putExtra("download_entrance_scene", 25);
            intent2.putExtra("preceding_scence", 9);
            intent2.putExtra("reward_tip", true);
        } else {
            intent2.putExtra("download_entrance_scene", 22);
            intent2.putExtra("preceding_scence", 122);
            C115669n.INSTANCE.mo160131h(10993, 2, str2);
        }
        C88144b.m109791i(context, "emoji", ".ui.EmojiStoreDetailUI", intent2, (Bundle) null);
    }

    /* renamed from: e */
    public static void m86452e(View view) {
        LinkedList<C77630j> linkedList;
        LinkedList<C77630j> linkedList2;
        int i;
        String str;
        Class cls = C100910b.class;
        Class cls2 = C77569h.class;
        if ((view.getTag() instanceof C74244u.C74254i) && WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view.getContext())) {
            C74244u.C74254i iVar = (C74244u.C74254i) view.getTag();
            long j = iVar.f218013b;
            C74244u.C44867j jVar = iVar.f218012a;
            int i2 = 0;
            if (jVar != null) {
                String format = String.format("%s_msg", new Object[]{jVar.f121722a});
                if (m86450c(format)) {
                    C101093a.m132490l();
                    return;
                }
                String str2 = jVar.f121727f;
                String str3 = jVar.f121724c;
                String str4 = jVar.f121725d;
                String str5 = jVar.f121723b;
                String str6 = jVar.f121726e;
                C101093a.m132488j(((C100910b) C86312j.m106911c(cls)).mo139948sL(0, str2, str3, str4, str5, str6, str6, jVar.f121722a, C97625j3.m125812b().mo105891f(), jVar.f121727f, "", "", C62602o.m73561a(format, iVar.f218017f)));
            } else if (iVar.f218016e == -1) {
                C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(iVar.f218013b);
                String format2 = String.format("%d_msg", new Object[]{Long.valueOf(j)});
                if (m86450c(format2)) {
                    if (iVar.f218018g != 0) {
                        MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
                        mvCardActionReportStruct.f156520l = mvCardActionReportStruct.mo86045b("FromSourceId", iVar.f218019h, true);
                        mvCardActionReportStruct.f156518j = 2;
                        mvCardActionReportStruct.f156519k = 2;
                        C60205t5.m70388b(mvCardActionReportStruct);
                    }
                    C115669n.INSTANCE.kvStat(10231, String.valueOf(1));
                    C101093a.m132490l();
                    if (b002.getMsgId() == j) {
                        ((C77569h) C86312j.m106911c(cls2)).mo35232L7(b002, false, C40339m.m43520a(b002));
                        return;
                    }
                    return;
                }
                C68070l.C68072b u = C68070l.C68072b.m80422u(iVar.f218015d, (String) null);
                if (u != null) {
                    C115669n.INSTANCE.kvStat(10090, "0,1");
                    str = "FromSourceId";
                    C101093a.m132488j(((C100910b) C86312j.m106911c(cls)).mo139945If(u, 0, format2, iVar.f218014c, C97625j3.m125812b().mo105891f(), iVar.f218014c, C62602o.m73561a(format2, iVar.f218017f)));
                } else {
                    str = "FromSourceId";
                }
                if (iVar.f218018g != 0) {
                    MvCardActionReportStruct mvCardActionReportStruct2 = new MvCardActionReportStruct();
                    mvCardActionReportStruct2.f156520l = mvCardActionReportStruct2.mo86045b(str, iVar.f218019h, true);
                    mvCardActionReportStruct2.f156518j = 1;
                    mvCardActionReportStruct2.f156519k = 2;
                    C60205t5.m70388b(mvCardActionReportStruct2);
                }
                if (b002.getMsgId() == j) {
                    C77569h hVar = (C77569h) C86312j.m106911c(cls2);
                    if (u != null) {
                        i2 = u.f195582i;
                    }
                    hVar.mo35232L7(b002, true, i2);
                }
            } else {
                String str7 = iVar.f218013b + "_" + iVar.f218016e + "_msg";
                C72963f4 b003 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(iVar.f218013b);
                C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(iVar.f218013b, iVar.f218015d);
                if (m86450c(str7)) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.kvStat(10231, String.valueOf(1));
                    C101093a.m132490l();
                    if (b003.getMsgId() == j) {
                        ((C77569h) C86312j.m106911c(cls2)).mo35232L7(b003, false, C40339m.m43520a(b003));
                    }
                    if (JZ != null && (linkedList2 = JZ.f226295i) != null && linkedList2.size() > (i = iVar.f218016e)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(JZ.f226295i.get(i).f226333o == 6 ? 1 : 0);
                        objArr[1] = 1;
                        nVar.mo160131h(14972, objArr);
                        return;
                    }
                    return;
                }
                if (!(JZ == null || (linkedList = JZ.f226295i) == null || linkedList.size() <= iVar.f218016e)) {
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.kvStat(10090, "0,1");
                    C77630j jVar2 = JZ.f226295i.get(iVar.f218016e);
                    String str8 = iVar.f218014c;
                    String str9 = jVar2.f226325d;
                    String str10 = jVar2.f226309A;
                    String str11 = jVar2.f226326e;
                    String str12 = jVar2.f226344z;
                    C101093a.m132488j(((C100910b) C86312j.m106911c(cls)).mo139948sL(0, str8, str9, str10, str11, str12, str12, str7, C97625j3.m125812b().mo105891f(), iVar.f218014c, "", "", C62602o.m73561a(str7, iVar.f218017f)));
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Integer.valueOf(jVar2.f226333o == 6 ? 1 : 0);
                    objArr2[1] = 0;
                    nVar2.mo160131h(14972, objArr2);
                }
                if (b003.getMsgId() == j) {
                    ((C77569h) C86312j.m106911c(cls2)).mo35232L7(b003, true, C40339m.m43520a(b003));
                }
            }
        }
    }

    /* renamed from: f */
    public static void m86453f(C72963f4 f4Var, Context context, C67391b bVar) {
        boolean z;
        C72963f4 f4Var2 = f4Var;
        Context context2 = context;
        C67391b bVar2 = bVar;
        Class<MsgRetransmitUI> cls = MsgRetransmitUI.class;
        Class cls2 = C76053l.class;
        Class cls3 = C98201k.class;
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(context2, bVar2.f193286j.getContentView());
            return;
        }
        C92836k kVar = null;
        if (f4Var.getMsgId() > 0) {
            kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls3)).mo137277xi()).mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
        }
        if ((kVar == null || kVar.f267374a <= 0) && f4Var.mo108774y2() > 0) {
            kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls3)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
        }
        if (kVar != null) {
            int i = 1;
            if (f4Var.mo108769t2() == 1) {
                z = kVar.mo127145p();
            } else {
                if (kVar.mo127145p()) {
                    C92836k jD = ((C76053l) C86312j.m106911c(cls2)).mo106261jD(kVar);
                    String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls3)).mo137277xi()).mo127174TY(jD.f267378e, "", "", true);
                    Log.m105925i("MicroMsg.ChattingItemHelper", "retransmitImg hdImgInfo hdFullPath:%s completed:%s", Boolean.valueOf(C86013q1.m106450k(TY)), Boolean.valueOf(jD.mo127146q()));
                    if (C86013q1.m106450k(TY) && jD.mo127146q()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (f4Var.mo100972K3()) {
                Log.m105924i("MicroMsg.ChattingItemHelper", "image is clean!!!");
                C76879j.m92749t(context2, context2.getString(C0966R.string.fqo), context2.getString(C0966R.string.a3h), new C73310a());
                return;
            }
            if (C73521l0.m86925b(f4Var2, ((C92839m) ((C98201k) C86312j.m106911c(cls3)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(cls2)).mo106262y8(kVar), "", "", true))) {
                Log.m105924i("MicroMsg.ChattingItemHelper", "img is expired or clean!!!");
                Log.m105924i("MicroMsg.ChattingItemHelper", "[ImageGalleryUI] enter");
                Intent intent = new Intent(context2, ImageGalleryUI.class);
                intent.putExtra("img_gallery_msg_id", f4Var.getMsgId());
                intent.putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2());
                intent.putExtra("img_gallery_talker", f4Var.mo108768t());
                intent.putExtra("img_gallery_chatroom_name", f4Var.mo108768t());
                intent.putExtra("img_gallery_is_restransmit_after_download", true);
                intent.putExtra("Retr_show_success_tips", true);
                if (bVar2 != null) {
                    C73521l0.m86924a(bVar2, f4Var2, intent);
                } else {
                    String t = f4Var.mo108768t();
                    String t2 = f4Var.mo108768t();
                    Bundle bundle = new Bundle();
                    if (C45628s0.m50738C(t)) {
                        i = 7;
                    }
                    bundle.putInt("stat_scene", i);
                    bundle.putString("stat_msg_id", "msg_" + Long.toString(f4Var.mo108774y2()));
                    bundle.putString("stat_chat_talker_username", t);
                    bundle.putString("stat_send_msg_user", t2);
                    intent.putExtra("_stat_obj", bundle);
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            String b = C1300x.m1391b(f4Var);
            if (!Util.isNullOrNil(b)) {
                C21506a.m24351Y5(6, bVar.mo91582w(), b);
            }
            int i2 = kVar.f267376c;
            int i3 = kVar.f267377d;
            if (i2 < i3 || i3 == 0) {
                Intent intent2 = new Intent(context2, cls);
                intent2.putExtra("Retr_File_Name", ((C92839m) ((C98201k) C86312j.m106911c(cls3)).mo137277xi()).v10(f4Var.mo108765s2(), true));
                intent2.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                intent2.putExtra("Retr_Msg_Type", 0);
                intent2.putExtra("Retr_show_success_tips", true);
                intent2.putExtra("Retr_Compress_Type", z ? 1 : 0);
                intent2.putExtra("img_source_url", b);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            Intent intent3 = new Intent(context2, cls);
            intent3.putExtra("Retr_File_Name", ((C92839m) ((C98201k) C86312j.m106911c(cls3)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(cls2)).mo106262y8(kVar), "", "", true));
            intent3.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent3.putExtra("Retr_Msg_Type", 0);
            intent3.putExtra("Retr_show_success_tips", true);
            intent3.putExtra("Retr_Compress_Type", z);
            intent3.putExtra("img_source_url", b);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: g */
    public static void m86454g(int i, Context context, String str, String str2, long j, long j2) {
        C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(j, str);
        if (JZ == null) {
            Log.m105928w("MicroMsg.ChattingItemHelper", "transmitAppBrandMsg reader is null");
        } else if (i >= 0 && i < JZ.f226295i.size()) {
            C77630j jVar = JZ.f226295i.get(i);
            String s = C68070l.C68072b.m80420s(C73687g1.m87263a(str2, jVar), (String) null, (C98121d) null);
            if (!Util.isNullOrNil(s)) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", jVar.f226332n);
                hashMap.put("type", 2);
                hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, jVar.f226325d);
                hashMap.put("app_id", jVar.f226340v);
                hashMap.put("pkg_type", Integer.valueOf(jVar.f226339u));
                hashMap.put("pkg_version", Integer.valueOf(jVar.f226338t));
                hashMap.put("img_url", jVar.f226341w);
                hashMap.put("is_dynamic", Boolean.FALSE);
                hashMap.put("cache_key", "");
                hashMap.put("path", jVar.f226337s);
                Intent intent = new Intent(context, MsgRetransmitUI.class);
                intent.putExtra("appbrand_params", hashMap);
                intent.putExtra("Retr_Msg_content", s);
                intent.putExtra("Retr_Msg_Type", 2);
                intent.putExtra("Retr_Biz_Msg_Selected_Msg_Index", i);
                intent.putExtra("Retr_Msg_Id", j);
                intent.putExtra("Retr_MsgFromScene", 3);
                String a = C86493v0.m107223a("" + j2);
                intent.putExtra("reportSessionId", a);
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                c.mo120962i("prePublishId", "msg_" + j2);
                c.mo120962i("preUsername", str2);
                c.mo120962i("preChatName", str2);
                c.mo120962i("preMsgIndex", Integer.valueOf(i));
                c.mo120962i("sendAppMsgScene", 1);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "transmitAppBrandMsg", "(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/ui/chatting/ChattingItemHelper", "transmitAppBrandMsg", "(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
