package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import p682rz.C101488s;
import p682rz.C101491u;

/* renamed from: com.tencent.mm.ui.chatting.component.z5$$a */
public final /* synthetic */ class z5$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C73669z5 f216301d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f216302e;

    public /* synthetic */ z5$$a(C73669z5 z5Var, C72963f4 f4Var) {
        this.f216301d = z5Var;
        this.f216302e = f4Var;
    }

    public final void run() {
        C73669z5 z5Var = this.f216301d;
        C72963f4 f4Var = this.f216302e;
        z5Var.getClass();
        Class<MsgRetransmitUI> cls = MsgRetransmitUI.class;
        Class cls2 = C101491u.class;
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(z5Var.f215752d.mo91565f(), z5Var.f215752d.f193286j.getContentView());
        } else if (f4Var.mo100983V3()) {
            Intent intent = new Intent(z5Var.f215752d.mo91565f(), cls);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_content", f4Var.getContent());
            intent.putExtra("Retr_From", "chattingui");
            Log.m105918d("MicroMsg.ChattingUI.VideoComponent", "dkvideo msg.getType():" + f4Var.getType());
            intent.putExtra("Retr_Msg_Type", 1);
            BaseChattingUIFragment baseChattingUIFragment = z5Var.f215752d.f193286j;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(baseChattingUIFragment, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(baseChattingUIFragment, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(cls2)).mo140806Zd(f4Var.mo108765s2());
            if (Zd != null) {
                String f = Zd.mo137702f();
                if (!C86013q1.m106450k(f)) {
                    f = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(f4Var.mo108765s2());
                }
                if (f4Var.mo100972K3()) {
                    Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "video is clean!!!");
                    C76879j.m92749t(z5Var.f215752d.mo91565f(), z5Var.f215752d.mo91565f().getString(C0966R.string.k_i), z5Var.f215752d.mo91565f().getString(C0966R.string.a3h), new C73455c6(z5Var));
                } else if (C73521l0.m86925b(f4Var, f)) {
                    Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "video is expired");
                    C86709a0.m107525e().postToWorker(new C73418a6(z5Var, Zd.mo137700d(), 3));
                    Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] enter");
                    Intent intent2 = new Intent(z5Var.f215752d.mo91565f(), ImageGalleryUI.class);
                    intent2.putExtra("img_gallery_msg_id", f4Var.getMsgId());
                    intent2.putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2());
                    intent2.putExtra("img_gallery_talker", f4Var.mo108768t());
                    intent2.putExtra("img_gallery_chatroom_name", f4Var.mo108768t());
                    intent2.putExtra("img_gallery_enter_video_opcode", C98429r0.m127814e(f4Var.getMsgId(), 1));
                    C73521l0.m86924a(z5Var.f215752d, f4Var, intent2);
                    BaseChattingUIFragment baseChattingUIFragment2 = z5Var.f215752d.f193286j;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    BaseChattingUIFragment baseChattingUIFragment3 = baseChattingUIFragment2;
                    C117292a.m165358d(baseChattingUIFragment3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    baseChattingUIFragment2.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(baseChattingUIFragment3, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    z5Var.f215752d.f193286j.overridePendingTransition(0, 0);
                    if (Zd.mo137711o()) {
                        Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "start complete online video");
                        ((C101491u) C86312j.m106911c(cls2)).mo140797FT(f4Var.mo108765s2());
                        return;
                    }
                    Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "start complete offline video");
                    ((C101491u) C86312j.m106911c(cls2)).M00(f4Var.mo108765s2());
                } else if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
                    Intent intent3 = new Intent(z5Var.f215752d.mo91565f(), cls);
                    intent3.putExtra("Retr_length", Zd.f288566m);
                    intent3.putExtra("Retr_File_Name", f4Var.mo108765s2());
                    intent3.putExtra("Retr_video_isexport", Zd.f288572s);
                    intent3.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                    intent3.putExtra("Retr_From", "chattingui");
                    Log.m105918d("MicroMsg.ChattingUI.VideoComponent", "dkvideo msg.getType():" + f4Var.getType());
                    if (f4Var.mo100989b4()) {
                        intent3.putExtra("Retr_Msg_Type", 11);
                    } else {
                        intent3.putExtra("Retr_Msg_Type", 1);
                    }
                    BaseChattingUIFragment baseChattingUIFragment4 = z5Var.f215752d.f193286j;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent3);
                    C117292a.m165358d(baseChattingUIFragment4, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    baseChattingUIFragment4.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(baseChattingUIFragment4, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    Log.m105928w("MicroMsg.ChattingUI.VideoComponent", "retranmist video unknow status.");
                }
            } else {
                Log.m105920e("MicroMsg.ChattingUI.VideoComponent", "retransmit video but videoInfo is null!");
            }
        }
    }
}
