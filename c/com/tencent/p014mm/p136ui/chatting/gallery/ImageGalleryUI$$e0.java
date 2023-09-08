package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44063a;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C96674u;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75569c4;
import ex0.C45696d;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98429r0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76879j;
import p1083jg.C98939a;
import p434ig.C98672d;
import p606mm.C99933h;
import p680ru.C77569h;
import p682rz.C101491u;
import qh0.C62619a;
import qo3.C77407n;
import s90.C48300n;
import sk2.C101643c;
import sk2.C101644d;
import sk2.C101645e;
import tk2.C101903a;
import tk2.C101904b;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$e0 */
public class ImageGalleryUI$$e0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284504d;

    public ImageGalleryUI$$e0(ImageGalleryUI imageGalleryUI) {
        this.f284504d = imageGalleryUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int i2;
        C72963f4 w;
        Class<C62619a> cls = C62619a.class;
        Class cls2 = C99933h.class;
        Class cls3 = C77569h.class;
        ImageGalleryUI imageGalleryUI = this.f284504d;
        if (imageGalleryUI == null || imageGalleryUI.isDestroyed() || this.f284504d.isFinishing()) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "receive onMMMenuItemSelected but activity is invalid");
            return;
        }
        this.f284504d.f284422c2.reset();
        Log.m105925i("MicroMsg.ImageGalleryUI", "curTransState %d", Integer.valueOf(this.f284504d.f284363I1));
        int i3 = 2;
        switch (menuItem.getItemId()) {
            case 0:
                C72963f4 w2 = this.f284504d.f284432g.mo135935w();
                C6789c.m7088a(w2, this.f284504d.getContext(), new ImageGalleryUI$$e0$$a(this, w2));
                return;
            case 1:
                C72963f4 w3 = this.f284504d.f284432g.mo135935w();
                if (w3 == null || !w3.mo100994f4()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f284504d.f284432g.mo135935w());
                    ((C77569h) C86312j.m106911c(cls3)).af0((C72963f4) arrayList.get(0));
                    C97056h.m124956j(this.f284504d.getContext(), arrayList);
                } else {
                    C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(w3.mo108765s2());
                    if (Zd == null || (i2 = Zd.f288562i) == 199 || i2 == 199) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.f284504d.f284432g.mo135935w());
                        C97056h.m124956j(this.f284504d.getContext(), arrayList2);
                    } else {
                        this.f284504d.f284372L1 = C98429r0.m127814e(w3.getMsgId(), 2);
                        ImageGalleryUI imageGalleryUI2 = this.f284504d;
                        C97056h hVar = imageGalleryUI2.f284432g;
                        int currentItem = imageGalleryUI2.f284450n.getCurrentItem();
                        hVar.f284720p.mo135825B(hVar.mo135937y(currentItem), currentItem);
                    }
                }
                if (C75569c4.m90663I(w3)) {
                    SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
                    spamMediaToEmojiOPStruct.f194459d = w3.mo108774y2();
                    spamMediaToEmojiOPStruct.f194460e = (long) w3.getType();
                    spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(w3);
                    spamMediaToEmojiOPStruct.f194462g = 7;
                    spamMediaToEmojiOPStruct.mo86054n();
                }
                this.f284504d.mo135736P7(7);
                return;
            case 2:
                C88144b.m109788f("favorite");
                ImageGalleryUI imageGalleryUI3 = this.f284504d;
                C97056h hVar2 = imageGalleryUI3.f284432g;
                C72963f4 y = hVar2.mo135937y(imageGalleryUI3.f284450n.getCurrentItem());
                if (hVar2.f284723s) {
                    C48300n n = C97052g.m124926n(y);
                    if (n == null) {
                        Log.m105920e("MicroMsg.ImageGalleryAdapter", "doFavoriteImage mpShareVideoInfo should not be null");
                    } else {
                        C96674u.f283144a.mo134851a(n);
                        ImageGalleryUI imageGalleryUI4 = hVar2.f284714g;
                        C76879j.m92726T(imageGalleryUI4, imageGalleryUI4.getString(C0966R.string.cph));
                    }
                } else {
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124256j(doFavoriteEvent, y);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = hVar2.f284714g;
                    aVar.f264688m = 44;
                    doFavoriteEvent.publish();
                    if (doFavoriteEvent.f264675e.f9046a == 0) {
                        if (y.mo100989b4()) {
                            C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Full, y, 0);
                        }
                        ((C77569h) C86312j.m106911c(cls3)).mo35241nt(y);
                    }
                }
                C72963f4 w4 = this.f284504d.f284432g.mo135935w();
                if (w4 != null && w4.mo100983V3()) {
                    C44063a.f119401a.mo68697a(2, this.f284504d.mo135787t8(), this.f284504d.mo135786s8());
                }
                this.f284504d.mo135736P7(9);
                if (w4 != null && w4.mo101016t3()) {
                    ((C99933h) C86312j.m106911c(cls2)).mo84406lr(18, "album_enter_from_scene", cls, new C98939a(55, w4, 0, 0, (C98672d) null, 0));
                    return;
                }
                return;
            case 3:
                Log.m105924i("MicroMsg.ImageGalleryUI", "request deal QBAR string");
                C77407n nVar = this.f284504d.f284448m1;
                if (nVar != null && nVar.mo107563h()) {
                    this.f284504d.f284448m1.mo107572p();
                }
                String safeFormatString = Util.safeFormatString("%d,%d", 1, Long.valueOf(System.currentTimeMillis()));
                Log.m105924i("MicroMsg.ImageGalleryUI", "18684 report:" + safeFormatString);
                C115669n.INSTANCE.kvStat(18684, safeFormatString);
                this.f284504d.mo135742S7(false);
                return;
            case 4:
                ImageGalleryUI imageGalleryUI5 = this.f284504d;
                C97056h hVar3 = imageGalleryUI5.f284432g;
                C72963f4 y2 = hVar3.mo135937y(imageGalleryUI5.f284450n.getCurrentItem());
                int ordinal = C97056h.m124949B(y2).ordinal();
                if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    Intent intent = new Intent();
                    intent.setClassName(hVar3.f284714g, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
                    intent.putExtra("Retr_Msg_Id", y2.getMsgId());
                    ImageGalleryUI imageGalleryUI6 = hVar3.f284714g;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    ImageGalleryUI imageGalleryUI7 = imageGalleryUI6;
                    C117292a.m165358d(imageGalleryUI7, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doSendMsgToDevice", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    imageGalleryUI6.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(imageGalleryUI7, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doSendMsgToDevice", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                return;
            case 5:
                ImageGalleryUI imageGalleryUI8 = this.f284504d;
                C97056h hVar4 = imageGalleryUI8.f284432g;
                if (hVar4 == null) {
                    return;
                }
                if (hVar4.mo135937y(imageGalleryUI8.f284488y2) != null || imageGalleryUI8.f284432g.mo135935w() != null) {
                    C72963f4 y3 = imageGalleryUI8.f284432g.mo135937y(imageGalleryUI8.f284488y2);
                    if (y3 == null) {
                        y3 = imageGalleryUI8.f284432g.mo135935w();
                    }
                    long msgId = y3.getMsgId();
                    Log.m105925i("MicroMsg.ImageGalleryUI", "enterPositionAtChatRecords-->talker:%s,magId:%d", imageGalleryUI8.f284423d, Long.valueOf(msgId));
                    Intent intent2 = new Intent(imageGalleryUI8.getContext(), ChattingUI.class);
                    intent2.putExtra("Chat_User", imageGalleryUI8.mo135764d8());
                    intent2.putExtra("finish_direct", true);
                    intent2.putExtra("show_search_chat_content_result", true);
                    intent2.putExtra("show_footer", true);
                    intent2.putExtra("key_is_biz_chat", imageGalleryUI8.f284446l1);
                    intent2.putExtra("key_biz_chat_id", imageGalleryUI8.f284435h);
                    intent2.putExtra("need_hight_item", true);
                    intent2.putExtra("msg_local_id", msgId);
                    intent2.putExtra("img_gallery_enter_from_chatting_ui", true);
                    intent2.putExtra("SELECTION_TOP_OFFSET", C76577a.m92151b(imageGalleryUI8.getContext(), 120));
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent2);
                    C117292a.m165358d(imageGalleryUI8, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterPositionAtChatRecords", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    imageGalleryUI8.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(imageGalleryUI8, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterPositionAtChatRecords", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    if (imageGalleryUI8.f284476v1) {
                        C115669n.INSTANCE.idkeyStat(219, 16, 1, true);
                        return;
                    } else {
                        C115669n.INSTANCE.idkeyStat(219, 17, 1, true);
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                C97056h hVar5 = this.f284504d.f284432g;
                if (hVar5 != null && C97056h.m124953H(hVar5.mo135935w())) {
                    this.f284504d.mo135791w8();
                    return;
                }
                return;
            case 7:
                if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(this.f284504d.getContext())) {
                    this.f284504d.mo135752X7(false);
                    return;
                }
                return;
            case 10:
                C72963f4 w5 = this.f284504d.f284432g.mo135935w();
                if (w5 != null && w5.mo100983V3()) {
                    C44063a.f119401a.mo68697a(4, this.f284504d.mo135787t8(), this.f284504d.mo135786s8());
                    C48300n n2 = C97052g.m124926n(w5);
                    if (n2 != null) {
                        ImageGalleryUI imageGalleryUI9 = this.f284504d;
                        ((C45696d) C86709a0.m107533q(C45696d.class)).mo70997i5(n2, imageGalleryUI9, imageGalleryUI9.f284478w.f284965m);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                this.f284504d.mo135744T7(System.currentTimeMillis(), 2);
                return;
            case 12:
                ImageGalleryUI imageGalleryUI10 = this.f284504d;
                if (imageGalleryUI10.f284420b2 == null) {
                    C101903a z802 = ((C101643c) C86312j.m106911c(C101643c.class)).z80(imageGalleryUI10, C72996z1.m85820U5(imageGalleryUI10.f284423d) ? 2 : 1);
                    imageGalleryUI10.f284420b2 = z802;
                    z802.mo33386c(imageGalleryUI10.f284450n);
                }
                C72963f4 y4 = imageGalleryUI10.f284432g.mo135937y(imageGalleryUI10.f284488y2);
                if (y4 == null) {
                    Log.m105920e("MicroMsg.ImageGalleryUI", "alvinluo dealWithImageOcr msgInfo is null");
                    return;
                }
                boolean U5 = C72996z1.m85820U5(y4.mo108768t());
                C101645e eVar = new C101645e();
                eVar.f297534c = imageGalleryUI10.f284341B;
                eVar.f297536e = U5 ? 4 : 3;
                eVar.f297532a = System.currentTimeMillis();
                eVar.f297533b = 3;
                eVar.f297541j = false;
                eVar.f297542k = true;
                eVar.f297543l = 201;
                eVar.f297544m.f297546a = imageGalleryUI10.mo135789u8(y4, U5);
                Log.m105925i("MicroMsg.ImageGalleryUI", "alvinluo dealWithImageOcr msgId: %s, isChatRoom: %b, sourceUsername: %s, requestType: %s", Long.valueOf(imageGalleryUI10.f284341B), Boolean.valueOf(U5), eVar.f297544m.f297546a, Integer.valueOf(eVar.f297536e));
                imageGalleryUI10.mo135765d9();
                imageGalleryUI10.f284420b2.mo33390g(imageGalleryUI10.mo135770g8(imageGalleryUI10.f284432g, imageGalleryUI10.f284450n));
                C101904b bVar = imageGalleryUI10.f284422c2;
                if (!U5) {
                    i3 = 1;
                }
                bVar.mo10651a(1, i3, imageGalleryUI10.f284360H1);
                C101644d dVar = new C101644d();
                dVar.f297531b = true;
                imageGalleryUI10.f284418a2 = imageGalleryUI10.f284420b2.mo33385b(eVar, dVar, imageGalleryUI10.f284425d2);
                return;
            case 13:
                C97056h hVar6 = this.f284504d.f284432g;
                if (hVar6 != null && (w = hVar6.mo135935w()) != null && w.mo101016t3()) {
                    C97087m1 v = this.f284504d.f284432g.mo135934v();
                    if (v != null) {
                        v.mo135965a(false);
                    }
                    ((C99933h) C86312j.m106911c(cls2)).mo84406lr(18, "album_enter_from_scene", cls, new C98939a(56, w, 0, 0, (C98672d) null, 0));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
