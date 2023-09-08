package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C30670w;
import com.tencent.p014mm.pluginsdk.model.app.C57535x;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import e30.C75539a;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C97625j3;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import p182kk.C61104a;
import p680ru.C77569h;
import p682rz.C101488s;
import p682rz.C101491u;
import t30.C77845k;
import t30.C77846l;
import uj3.C78208e;
import zj3.C79348e;
import zj3.C79384u0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l7 */
public class C74100l7 extends C73684f2 {

    /* renamed from: h */
    public static boolean f217490h;

    /* renamed from: f */
    public int f217491f;

    /* renamed from: g */
    public boolean f217492g;

    public C74100l7(C67391b bVar, boolean z) {
        super(bVar);
        this.f217491f = 0;
        this.f217492g = z;
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        ((C77569h) C86312j.m106911c(C77569h.class)).mo35247zz(t8Var.f212238a);
        mo103166b((C74159o7) t8Var, view);
        if (!C72996z1.m85807K5(f4Var.mo108768t())) {
            boolean z = this.f217492g;
            long y2 = f4Var.mo108774y2();
            String t = f4Var.mo108768t();
            C75539a.C75544e eVar = C75539a.f221938h;
            if (eVar != null) {
                ((C119157j) C119157j.f356862d).mo183885p(new C77845k((C77846l) eVar, y2, z, t), "KaraEvent");
            }
        }
    }

    /* renamed from: b */
    public final void mo103166b(C74159o7 o7Var, View view) {
        int i;
        int i2;
        C74159o7 o7Var2 = o7Var;
        View view2 = view;
        Class cls = C101491u.class;
        C68144a.m80547c(o7Var2.f212238a, C68144a.C68145a.Click);
        if (2 != o7Var2.f217686T) {
            C72963f4 f4Var = o7Var2.f212238a;
            if (f4Var.mo108769t2() == 0) {
                C72963f4 f4Var2 = o7Var2.f212238a;
                C98408n0 Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(f4Var2.mo108765s2());
                Log.m105924i("MicroMsg.DesignerClickListener", "videoReceiverEvent video status:" + Zd.f288562i + " is sender:" + f4Var2.mo108769t2());
                int i3 = o7Var2.f217686T;
                if (i3 == 3) {
                    mo103167c(Zd);
                } else if (i3 == 4) {
                    if (!C97625j3.m125812b().mo105883I()) {
                        C76912y0.m92771j(this.f216339d.mo91565f(), this.f216339d.f193286j.getContentView());
                    } else {
                        C98429r0.m127834y(f4Var2.mo108765s2());
                    }
                }
            }
            if (f4Var.mo108769t2() == 1) {
                C72963f4 f4Var3 = o7Var2.f212238a;
                if (f4Var3 == null) {
                    Log.m105928w("MicroMsg.DesignerClickListener", "videoSendEvent but msg is null ");
                    return;
                }
                C98408n0 f = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137720f(f4Var3.mo108765s2());
                if (f == null) {
                    Log.m105929w("MicroMsg.DesignerClickListener", "videoSendEvent but video info is null [%s]", f4Var3.mo108765s2());
                    return;
                }
                int i4 = f.f288562i;
                Log.m105924i("MicroMsg.DesignerClickListener", " videoSendEvent status : " + i4);
                int i5 = o7Var2.f217686T;
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (i5 != 6) {
                                return;
                            }
                        }
                    }
                    if (!C97625j3.m125812b().mo105883I()) {
                        C76912y0.m92771j(this.f216339d.mo91565f(), this.f216339d.f193286j.getContentView());
                        return;
                    } else if (i4 == 112) {
                        Log.m105924i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user pause recv now.");
                        C98429r0.m127834y(f4Var3.mo108765s2());
                        return;
                    } else {
                        C98429r0.m127835z(f4Var3.mo108765s2());
                        Log.m105918d("MicroMsg.DesignerClickListener", "pause video, publish SendMsgFailEvent");
                        SendMsgFailEvent sendMsgFailEvent = new SendMsgFailEvent();
                        sendMsgFailEvent.f193928d.f193929a = f4Var3;
                        sendMsgFailEvent.publish();
                        return;
                    }
                }
                if (!C97625j3.m125812b().mo105883I()) {
                    C76912y0.m92771j(this.f216339d.mo91565f(), this.f216339d.f193286j.getContentView());
                } else if (i4 == 113) {
                    Log.m105924i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user restart now.");
                    mo103167c(f);
                } else if (f.mo137712p()) {
                    Log.m105920e("MicroMsg.DesignerClickListener", "this video come from gallery, but it is illegal.");
                    String string = this.f216339d.mo91565f().getString(C0966R.string.ka9);
                    if (i4 == 142) {
                        string = this.f216339d.mo91565f().getString(C0966R.string.ka9);
                    } else if (i4 == 141) {
                        string = this.f216339d.mo91565f().getString(C0966R.string.ka_);
                    } else if (i4 == 140) {
                        string = this.f216339d.mo91565f().getString(C0966R.string.ka8);
                    }
                    C76879j.m92748s(this.f216339d.mo91565f(), string, this.f216339d.mo91565f().getString(C0966R.string.f361465k34));
                } else {
                    f4Var3.unsetOmittedFailResend();
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var3.getMsgId(), f4Var3);
                    if (C31543z5.m39451a() - f4Var3.getCreateTime() >= 432000000) {
                        C67391b bVar = this.f216339d;
                        C76879j.m92707A(bVar.mo91565f(), bVar.mo91572m().getString(f.f288562i == 198 ? C0966R.string.bhx : C0966R.string.bhy), "", bVar.mo91572m().getString(C0966R.string.a0l), bVar.mo91572m().getString(C0966R.string.f7926wf), new C30670w(f4Var3), new C57535x());
                        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(f4Var3.getMsgId());
                        b002.mo100991d(5);
                        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var3.getMsgId(), b002);
                    } else if (f.f288562i == 198) {
                        C98429r0.m127797C(f4Var3.mo108765s2());
                    } else {
                        String s2 = f4Var3.mo108765s2();
                        ((C101491u) C86312j.m106911c(cls)).mo140800Ic(s2);
                        ((C119157j) C119157j.f356862d).mo183875f(new l7$$a(s2));
                    }
                }
            }
        } else if (C61104a.m71669y(this.f216339d.mo91565f()) || C61104a.m71665u(this.f216339d.mo91565f()) || C61104a.m71649e(this.f216339d.mo91565f())) {
            Log.m105924i("MicroMsg.DesignerClickListener", "Voip or multitalk is running, can't do this");
        } else {
            C72963f4 f4Var4 = o7Var2.f212238a;
            int[] iArr = new int[2];
            if (view2 != null) {
                view2.getLocationOnScreen(iArr);
                i = view.getWidth();
                i2 = view.getHeight();
            } else {
                i2 = 0;
                i = 0;
            }
            long msgId = f4Var4.getMsgId();
            long y2 = f4Var4.mo108774y2();
            String str = o7Var2.f217968b;
            String str2 = o7Var2.f217971e;
            int i6 = this.f217491f;
            Class cls2 = C79348e.class;
            Log.m105924i("MicroMsg.DesignerClickListener", "[ImageGalleryUI] showImgGallery");
            Intent intent = new Intent(this.f216339d.mo91565f(), ImageGalleryUI.class);
            intent.putExtra("show_search_chat_content_result", ((C79384u0) this.f216339d.f193278b.mo102812a(C79384u0.class)).mo102513x2());
            intent.putExtra("img_gallery_msg_id", msgId);
            intent.putExtra("key_is_biz_chat", ((C79348e) this.f216339d.f193278b.mo102812a(cls2)).mo70071q1());
            intent.putExtra("key_biz_chat_id", ((C79348e) this.f216339d.f193278b.mo102812a(cls2)).mo70068i4());
            intent.putExtra("img_gallery_msg_svr_id", y2);
            intent.putExtra("img_gallery_talker", str);
            intent.putExtra("img_gallery_chatroom_name", str2);
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", i);
            intent.putExtra("img_gallery_height", i2);
            intent.putExtra("KOpenArticleSceneFromScene", 1);
            intent.putExtra("img_gallery_enter_from_chatting_ui", true);
            intent.putExtra("msg_type", i6);
            if (i6 == 1) {
                intent.putExtra("show_enter_grid", false);
            }
            String r = this.f216339d.mo91577r();
            if (f4Var4.mo108769t2() == 1) {
                str = this.f216339d.mo91573n();
            }
            Bundle bundle = new Bundle();
            if (this.f216339d.mo91583x()) {
                bundle.putInt("stat_scene", 2);
            } else {
                bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
            }
            bundle.putString("stat_msg_id", "msg_" + Long.toString(y2));
            bundle.putString("stat_chat_talker_username", r);
            bundle.putString("stat_send_msg_user", str);
            intent.putExtra("_stat_obj", bundle);
            if (f4Var4.mo100983V3()) {
                intent.putExtra("img_gallery_mp_video_click_from", 2);
            }
            C67391b bVar2 = this.f216339d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C67391b bVar3 = bVar2;
            C117292a.m165358d(bVar3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoClickListener", "showImgGallery", "(Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;[IIII)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar2.mo91556Q((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bVar3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoClickListener", "showImgGallery", "(Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;[IIII)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f216339d.f193286j.overridePendingTransition(0, 0);
            if (f4Var4.mo100989b4()) {
                C74159o7 o7Var3 = o7Var;
                if (o7Var3.f217968b != null) {
                    C73304a.C73305a aVar2 = C73304a.C73305a.EnterFullScreen;
                    PString pString = new PString();
                    PString pString2 = new PString();
                    if (C73304a.m86446b(f4Var4, pString, pString2)) {
                        C73304a.m86445a(aVar2, f4Var4, pString.value, pString2.value);
                    }
                    if (o7Var3.f217968b.toLowerCase().endsWith("@chatroom")) {
                        C115669n.INSTANCE.mo160131h(11444, 2);
                    } else {
                        C115669n.INSTANCE.mo160131h(11444, 1);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo103167c(C98408n0 n0Var) {
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this.f216339d.mo91565f(), this.f216339d.f193286j.getContentView());
        } else if (n0Var.f288562i == 198) {
            C98429r0.m127796B(n0Var.mo137700d());
        } else if (C114786m0.m161568a(this.f216339d.mo91565f()) || f217490h) {
            ((C101491u) C86312j.m106911c(C101491u.class)).M00(n0Var.mo137700d());
        } else {
            f217490h = true;
            C76879j.m92743n(this.f216339d.mo91565f(), C0966R.string.kaa, C0966R.string.a3h, new l7$$b(this, n0Var), new l7$$c(this));
        }
    }

    public C74100l7(C67391b bVar, int i, C72963f4 f4Var, View view) {
        super(bVar);
        this.f217491f = i;
        if (i == 1) {
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35247zz(f4Var);
            boolean x = this.f216339d.mo91583x();
            int i2 = C78208e.f229158a;
            C74159o7 o7Var = new C74159o7(f4Var, x, C78208e.C78209a.f229159a, f4Var.mo108768t());
            o7Var.f217686T = 2;
            mo103166b(o7Var, view);
        }
    }
}
