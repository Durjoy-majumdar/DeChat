package fk3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.autogen.events.CancelScanTranslationEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.ScanTranslationEvent;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.chatting.gallery.C97100o;
import com.tencent.p014mm.p136ui.chatting.gallery.MediaHistoryGalleryUI;
import com.tencent.p014mm.p136ui.chatting.gallery.query.ScanTransImage;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.scanner.C94466j;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import gy3.C87412m;
import hh2.C8532a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import p248ug.C102029k0;
import p680ru.C77569h;
import p749xh.C38543c8;
import rk3.C63462a;
import u73.C101980n;
import u73.C101983r;

/* renamed from: fk3.b */
public final class C97886b implements C102029k0 {

    /* renamed from: a */
    public static final C97886b f287172a = new C97886b();

    /* renamed from: b */
    public static String f287173b = "";

    /* renamed from: c */
    public static String f287174c = "";

    /* renamed from: d */
    public static int f287175d;

    /* renamed from: e */
    public static ScanTransImage f287176e;

    static {
        new ArrayList();
    }

    /* renamed from: a */
    public long mo137213a(long j) {
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getMsgCreateTime >> " + j);
        return ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j).getCreateTime();
    }

    /* renamed from: b */
    public void mo137214b(Activity activity, long j) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "dealImageTranslate: " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        ScanTransImage scanTransImage = f287176e;
        if (scanTransImage == null) {
            Log.m105920e("MicroMsg.ImageQueryComposeOp", "dealImageTranslate scanTransImag is null");
        } else if (scanTransImage != null) {
            scanTransImage.f284955a = C75592q0.m90789s().hashCode() + ((int) System.currentTimeMillis());
            scanTransImage.f284956b = activity;
            scanTransImage.f284957c = b002;
            scanTransImage.f284959e = C97100o.m125011p(b002);
            if (C97056h.m124953H(b002)) {
                String r = C97100o.m125012r(b002, scanTransImage.f284959e, false);
                C87412m.m108593f(r, "getImgPath(msgInfo, imageInfo)");
                scanTransImage.f284958d = r;
            } else if (C97056h.m124952F(b002)) {
                String s = C97056h.m124960s(b002);
                C87412m.m108593f(s, "getAppImgPath(msgInfo)");
                scanTransImage.f284958d = s;
            }
            C38543c8 Gb0 = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(scanTransImage.f284958d);
            if (Gb0 == null || !C86013q1.m106450k(Gb0.field_resultFile)) {
                Log.m105925i("MicroMsg.ScanTransImageUtil", "try to translate img %s, sessionId %d", scanTransImage.f284958d, Integer.valueOf(scanTransImage.f284955a));
                ScanTranslationEvent scanTranslationEvent = new ScanTranslationEvent();
                ScanTranslationEvent.C92559a aVar = scanTranslationEvent.f265085d;
                aVar.f265086a = 1;
                aVar.f265088c = scanTransImage.f284958d;
                aVar.f265087b = scanTransImage.f284955a;
                scanTranslationEvent.publish();
                return;
            }
            Intent className = new Intent().setClassName(activity, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
            C87412m.m108593f(className, "Intent().setClassName(co….ui.TranslationResultUI\")");
            className.putExtra("original_file_path", scanTransImage.f284958d);
            className.putExtra("msg_id", b002.getMsgId());
            className.putExtra("translate_source", 4);
            C92836k kVar = scanTransImage.f284959e;
            if (kVar != null) {
                className.putExtra("fileid", kVar.mo127136g());
                C92836k kVar2 = scanTransImage.f284959e;
                C87412m.m108591d(kVar2);
                className.putExtra("aeskey", kVar2.mo127133d());
            }
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(className);
            C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage", "startImageTrans", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage", "startImageTrans", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.finish();
            activity.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: c */
    public void mo137215c(Activity activity, long j) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "dealImageToEdit: " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        C92836k p = C97100o.m125011p(b002);
        C87412m.m108593f(p, "getImgInfo(msgInfo)");
        String r = C97100o.m125012r(b002, p, false);
        Log.m105925i("MicroMsg.ImageQueryComposeOp", "edit image path:%s msgId:%s", r, Long.valueOf(b002.getMsgId()));
        RecordConfigProvider b = RecordConfigProvider.m119432b(r, "");
        b.f272905F = 0;
        UICustomParam uICustomParam = new UICustomParam();
        ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
        ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
        b.f272927o = uICustomParam;
        C8532a.f27585a.mo9446e(activity, 17, C0966R.C0968anim.f2492eg, -1, b, 1, 2);
    }

    /* renamed from: d */
    public void mo137216d(Activity activity, long j) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "dealImageLocateToChat: " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        Intent intent = new Intent(activity, ChattingUI.class);
        intent.putExtra("Chat_User", b002.mo108768t());
        intent.putExtra("finish_direct", true);
        intent.putExtra("show_search_chat_content_result", true);
        intent.putExtra("show_footer", true);
        intent.putExtra("key_is_biz_chat", false);
        intent.putExtra("key_biz_chat_id", 0);
        intent.putExtra("need_hight_item", true);
        intent.putExtra("msg_local_id", j);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("SELECTION_TOP_OFFSET", C76577a.m92151b(activity, 120));
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageLocateToChat", "(Landroid/app/Activity;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageLocateToChat", "(Landroid/app/Activity;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: e */
    public String mo137217e() {
        return f287174c;
    }

    /* renamed from: f */
    public String mo137218f() {
        return f287173b;
    }

    /* renamed from: g */
    public void mo137219g() {
        ScanTransImage scanTransImage = new ScanTransImage();
        f287176e = scanTransImage;
        scanTransImage.f284960f.alive();
    }

    public int getNavigationBarHeight() {
        return f287175d;
    }

    /* renamed from: h */
    public boolean mo137221h() {
        boolean z = ((C101980n) C86312j.m106911c(C101980n.class)).mo134693tB() && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e();
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getWebSearchIsToShow: " + z);
        return z;
    }

    /* renamed from: i */
    public String mo137222i(long j, boolean z) {
        String str;
        String str2;
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getMsgUsername: " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        if (b002.mo108769t2() == 1) {
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            return s;
        }
        if (z) {
            str2 = C75604z3.m90847s(b002.getContent());
            str = "getGroupChatMsgTalker(msgInfo.getContent())";
        } else {
            str2 = b002.mo108768t();
            str = "msgInfo.getTalker()";
        }
        C87412m.m108593f(str2, str);
        return str2;
    }

    /* renamed from: j */
    public boolean mo137223j(long j) {
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getMsgIsFromChatRoom: " + j);
        return C72996z1.m85820U5(((C72972g4) C97625j3.m125812b().mo105911z()).b00(j).mo108768t());
    }

    /* renamed from: k */
    public void mo137224k(long j, int i, Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "dealImageSearch: " + j + ", fromSource: " + i);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        C101983r rVar = new C101983r();
        rVar.f300282a = System.currentTimeMillis();
        rVar.f300283b = context;
        rVar.f300284c = b002;
        rVar.f300285d = i == 0 ? 3 : 2;
        ((C101980n) C86312j.m106911c(C101980n.class)).mo134683D6(rVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0105, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(((com.tencent.p014mm.modelimage.C92839m) ((p158gt.C98201k) di3.C86312j.m106911c(r4)).mo137277xi()).mo127174TY(r3.f267378e, "", "", true)) != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0144, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(((com.tencent.p014mm.modelimage.C92839m) ((p158gt.C98201k) di3.C86312j.m106911c(r4)).mo137277xi()).mo127174TY(r3.f267378e, "", "", true)) != false) goto L_0x0107;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137225l(android.app.Activity r18, long r19) {
        /*
            r17 = this;
            r8 = r18
            r0 = r19
            java.lang.Class<com.tencent.mm.ui.transmit.MsgRetransmitUI> r2 = com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.class
            java.lang.String r3 = "activity"
            gy3.C87412m.m108594g(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "dealImageToRetransmit: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.ImageQueryComposeOp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r3 = r3.b00(r0)
            com.tencent.mm.ui.chatting.gallery.h$g r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124949B(r3)
            com.tencent.mm.ui.chatting.gallery.h$g r6 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.C97067g.appimage
            java.lang.String r7 = "Retr_Compress_Type"
            java.lang.String r9 = "Retr_Msg_Type"
            java.lang.String r10 = "Retr_Msg_Id"
            java.lang.String r11 = "Retr_File_Name"
            r12 = 0
            if (r5 != r6) goto L_0x009f
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124960s(r3)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r2)
            r1.putExtra(r11, r0)
            long r4 = r3.getMsgId()
            r1.putExtra(r10, r4)
            r0 = 16
            r1.putExtra(r9, r0)
            java.lang.String r0 = r3.getContent()
            java.lang.String r2 = "Retr_Msg_content"
            r1.putExtra(r2, r0)
            r1.putExtra(r7, r12)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r1)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp"
            java.lang.String r3 = "dealImageToRetransmit"
            java.lang.String r4 = "(Landroid/app/Activity;J)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r18
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r9.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp"
            java.lang.String r2 = "dealImageToRetransmit"
            java.lang.String r3 = "(Landroid/app/Activity;J)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r18
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x019a
        L_0x009f:
            com.tencent.mm.ui.chatting.gallery.h$g r6 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.C97067g.image
            if (r5 != r6) goto L_0x019a
            com.tencent.mm.modelimage.k r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125011p(r3)
            if (r5 == 0) goto L_0x0195
            long r13 = r5.f267374a
            r15 = 0
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x00b3
            goto L_0x0195
        L_0x00b3:
            java.lang.String r6 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125012r(r3, r5, r12)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r13 == 0) goto L_0x00c3
            java.lang.String r0 = "doRestransmitMsg fail, bigImgPath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return
        L_0x00c3:
            java.lang.Class<gt.k> r4 = p158gt.C98201k.class
            java.lang.Class<gt.l> r13 = p158gt.C76053l.class
            int r3 = r3.mo108769t2()
            java.lang.String r14 = ""
            r12 = 1
            if (r3 != r12) goto L_0x0109
            boolean r3 = r5.mo127145p()
            if (r3 == 0) goto L_0x0147
            di3.d r3 = di3.C86312j.m106911c(r13)
            gt.l r3 = (p158gt.C76053l) r3
            com.tencent.mm.modelimage.k r3 = r3.mo106261jD(r5)
            if (r3 == 0) goto L_0x0147
            long r12 = r3.f267374a
            int r5 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0147
            boolean r5 = r3.mo127146q()
            if (r5 == 0) goto L_0x0147
            di3.d r4 = di3.C86312j.m106911c(r4)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r3 = r3.f267378e
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            r5 = 1
            java.lang.String r3 = r4.mo127174TY(r3, r14, r14, r5)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 == 0) goto L_0x0147
        L_0x0107:
            r12 = 1
            goto L_0x0148
        L_0x0109:
            boolean r3 = r5.mo127146q()
            if (r3 == 0) goto L_0x0147
            boolean r3 = r5.mo127145p()
            if (r3 == 0) goto L_0x0147
            di3.d r3 = di3.C86312j.m106911c(r13)
            gt.l r3 = (p158gt.C76053l) r3
            com.tencent.mm.modelimage.k r3 = r3.mo106261jD(r5)
            if (r3 == 0) goto L_0x0147
            long r12 = r3.f267374a
            int r5 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0147
            boolean r5 = r3.mo127146q()
            if (r5 == 0) goto L_0x0147
            di3.d r4 = di3.C86312j.m106911c(r4)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r3 = r3.f267378e
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            r5 = 1
            java.lang.String r3 = r4.mo127174TY(r3, r14, r14, r5)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 == 0) goto L_0x0147
            goto L_0x0107
        L_0x0147:
            r12 = 0
        L_0x0148:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r8, r2)
            r3.putExtra(r11, r6)
            r3.putExtra(r10, r0)
            r0 = 0
            r3.putExtra(r9, r0)
            r3.putExtra(r7, r12)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r3)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp"
            java.lang.String r3 = "dealImageToRetransmit"
            java.lang.String r4 = "(Landroid/app/Activity;J)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r18
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r9.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp"
            java.lang.String r2 = "dealImageToRetransmit"
            java.lang.String r3 = "(Landroid/app/Activity;J)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r18
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x019a
        L_0x0195:
            java.lang.String r0 = "doRestransmitMsg fail, msgLocalId = "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fk3.C97886b.mo137225l(android.app.Activity, long):void");
    }

    /* renamed from: m */
    public void mo137226m(int i) {
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "ftsSubTabClickReport >> " + i);
        C63462a aVar = C63462a.f180011a;
        Log.m105924i("MicroMsg.FTSMultiReporter", "setCurrentSubType >> " + i);
        C63462a.f180017g = i;
        aVar.mo88330e(6);
    }

    /* renamed from: n */
    public void mo137227n(Activity activity, long j) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "dealImageToJumpGalley >> " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        Intent intent = new Intent();
        intent.setClass(activity, MediaHistoryGalleryUI.class);
        intent.addFlags(67108864);
        intent.putExtra("key_media_type", 1);
        intent.putExtra("kintent_talker", b002.mo108768t());
        intent.putExtra("key_gallery_enter_scene", 3);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageToJumpGalley", "(Landroid/app/Activity;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageToJumpGalley", "(Landroid/app/Activity;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: o */
    public boolean mo137228o(long j) {
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getGoToChatToShow: " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        boolean z = b002.mo108759l2() == -1 && !C72996z1.m85812O4(b002.mo108768t());
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getGoToChatToShow: " + z);
        return z;
    }

    /* renamed from: p */
    public Pair<ArrayList<QueryImageData>, ArrayList<QueryImageData>> mo137229p(String str) {
        C87412m.m108594g(str, "roomId");
        return C59136a.f169139a.mo84352g(str, true);
    }

    /* renamed from: q */
    public void mo137230q(Activity activity, long j) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "dealImageToFav: " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        C88144b.m109788f("favorite");
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C96787m0.m124256j(doFavoriteEvent, b002);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = activity;
        aVar.f264688m = 44;
        doFavoriteEvent.publish();
        if (doFavoriteEvent.f264675e.f9046a == 0) {
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35241nt(b002);
        }
    }

    /* renamed from: r */
    public void mo137231r() {
        ScanTransImage scanTransImage = f287176e;
        if (scanTransImage != null) {
            CancelScanTranslationEvent cancelScanTranslationEvent = new CancelScanTranslationEvent();
            CancelScanTranslationEvent.C92467a aVar = cancelScanTranslationEvent.f264645d;
            aVar.f264646a = 1;
            aVar.f264647b = scanTransImage.f284955a;
            cancelScanTranslationEvent.publish();
            scanTransImage.f284955a = 0;
        }
    }

    /* renamed from: s */
    public void mo137232s(Activity activity, long j) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "dealImageDownload: " + j);
        C97056h.m124958l(activity, ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j), true);
    }

    /* renamed from: t */
    public boolean mo137233t(long j) {
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getShareAndSaveIsToShow: " + j);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        boolean z = !C75569c4.m90688u(b002) && !C75569c4.m90692y(b002);
        Log.m105924i("MicroMsg.ImageQueryComposeOp", "getShareAndSaveIsToShow: " + z);
        return z;
    }

    /* renamed from: u */
    public void mo137234u() {
        ScanTransImage scanTransImage = f287176e;
        if (scanTransImage != null) {
            scanTransImage.f284960f.dead();
        }
        f287176e = null;
    }

    /* renamed from: v */
    public final void mo137235v(String str) {
        C87412m.m108594g(str, "<set-?>");
        f287173b = str;
    }
}
