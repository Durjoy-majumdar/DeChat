package i61;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.events.AppEmojiMsgProgressEvent;
import com.tencent.p014mm.autogen.events.EmojiUpdatePanelEvent;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiAddCustomDialogUI;
import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96985s2;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.storage.p2$$e;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jg3.C98942a;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import org.json.JSONArray;
import p384tk.C101897a;
import p441aq.C92054g;
import p490dl.C97496s;
import p495dq.C97518c;
import p645pj.C77092c;
import p663qo.C101211h;
import p823sg.C90193h;
import p911ml.C99928o;
import qz1.C101331f;
import te3.a64;
import te3.z54;
import u61.C101964h;
import uc0.C111153e;
import uc0.C90638g;
import wh3.C102449a0;
import wh3.C102451g;
import wh3.C102452z;
import z51.C39315g;
import zc3.C39343a;

/* renamed from: i61.h */
public class C98602h implements C39343a {
    /* renamed from: N */
    public static void m128142N(String str, int i, int i2) {
        AppEmojiMsgProgressEvent appEmojiMsgProgressEvent = new AppEmojiMsgProgressEvent();
        AppEmojiMsgProgressEvent.C67658a aVar = appEmojiMsgProgressEvent.f193475d;
        aVar.f193476a = str;
        aVar.f193478c = i2;
        aVar.f193477b = i;
        appEmojiMsgProgressEvent.publish();
        Log.m105919d("MicroMsg.emoji.EmojiMgrImpl", "attachid:%s percentage:%d status:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: R */
    public static void m128143R(Context context, String str, String str2, String str3, long j, String str4, String str5, String str6) {
        String str7;
        Context context2 = context;
        String str8 = str;
        String str9 = str2;
        if (str.equals("-1")) {
            Log.m105920e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
            return;
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(str);
        if (TO == null) {
            Log.m105920e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
            return;
        }
        Intent intent = new Intent(context, CustomSmileyPreviewUI.class);
        intent.putExtra("custom_smiley_preview_md5", str);
        if (str9 != null) {
            intent.putExtra("custom_smiley_preview_appid", str2);
        } else {
            intent.putExtra("custom_smiley_preview_appid", TO.field_app_id);
        }
        String str10 = str3;
        intent.putExtra("custom_smiley_preview_appname", str3);
        long j2 = j;
        intent.putExtra("msg_id", j);
        intent.putExtra("msg_content", str5);
        if (C72996z1.m85820U5(str4)) {
            str7 = C75604z3.m90847s(str5);
            intent.putExtra("room_id", str6);
        } else {
            str7 = str4;
        }
        intent.putExtra("msg_sender", str7);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "showEmoji", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "showEmoji", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: A */
    public void mo137993A(String str) {
        Class cls = C92054g.class;
        if (!Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.emoji.EmojiMgrImpl", "deleteCaptureEmoji md: " + str);
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().mo142043TE(str);
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().doNotify("delete_emoji_info_notify");
        }
    }

    /* renamed from: B */
    public boolean mo137994B(EmojiInfo emojiInfo) {
        if (WeChatEnvironment.hasDebugger()) {
            return true;
        }
        return (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ShowEmoticonCameraEntrance", 3) & 2) > 0;
    }

    /* renamed from: C */
    public String mo137995C(Context context, String str) {
        int l;
        int i = EmojiLogic.f268226a;
        if (Util.isNullOrNil(str) || (l = (int) C86013q1.m106451l(str)) <= 0) {
            return null;
        }
        byte[] O = C86013q1.m106433O(str, 0, l);
        String f = C90193h.m112878f(O);
        Class cls = C39315g.class;
        if (!(f == null && O == null)) {
            String f2 = C101964h.m134224f();
            C86013q1.m106438T(f2 + f, O, 0, O.length);
            if (ImgUtil.isGif(O)) {
                C102451g d = ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d();
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
                d.mo142050bD(f, "", 65, 2, O.length, (String) null, "", "");
            } else {
                C102451g d2 = ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d();
                IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = EmojiInfo.f284123W1;
                d2.mo142050bD(f, "", 65, 1, O.length, (String) null, "", "");
            }
        }
        return f;
    }

    /* renamed from: D */
    public String mo137996D(Context context, WXMediaMessage wXMediaMessage, String str) {
        int l;
        int i = EmojiLogic.f268226a;
        if (wXMediaMessage.getType() != 8) {
            return null;
        }
        WXEmojiObject wXEmojiObject = (WXEmojiObject) wXMediaMessage.mediaObject;
        if (!Util.isNullOrNil(wXEmojiObject.emojiData)) {
            Log.m105918d("MicroMsg.emoji.EmojiLogic", " fileData:" + wXEmojiObject.emojiData.length);
            String f = C90193h.m112878f(wXEmojiObject.emojiData);
            EmojiLogic.m117489t(context, wXMediaMessage.thumbData, f, wXEmojiObject.emojiData, str);
            return f;
        } else if (Util.isNullOrNil(wXEmojiObject.emojiPath) || (l = (int) C86013q1.m106451l(wXEmojiObject.emojiPath)) <= 0) {
            return null;
        } else {
            byte[] O = C86013q1.m106433O(wXEmojiObject.emojiPath, 0, l);
            String f2 = C90193h.m112878f(O);
            EmojiLogic.m117489t(context, wXMediaMessage.thumbData, f2, O, str);
            return f2;
        }
    }

    /* renamed from: E */
    public C90638g mo137997E() {
        C98603i d = C98603i.m128193d();
        if (d.f289105b == null) {
            C86009m1 m1Var = new C86009m1(new C86009m1(C98603i.m128192c(), "egg"), "egg.xml");
            if (m1Var.mo119967g()) {
                d.mo138045f(m1Var);
            }
            Log.m105924i("MicroMsg.emoji.EmojiResUpdateMgr", "getEggList: from xml");
        }
        try {
            if (d.f289105b == null) {
                byte[] O = C86013q1.m106433O(C86709a0.m107535s().f251807e + "eggingfo.ini", 0, -1);
                if (O == null) {
                    Log.m105918d("MicroMsg.emoji.EmojiResUpdateMgr", "data is null, parse EggList from config file fail");
                } else {
                    C90638g gVar = (C90638g) new C90638g().parseFrom(O);
                    C90638g gVar2 = new C90638g();
                    d.f289105b = gVar2;
                    gVar2.f260402e = gVar.f260402e;
                    Iterator<C111153e> it = gVar.f260401d.iterator();
                    while (it.hasNext()) {
                        C111153e next = it.next();
                        int i = next.f332884n;
                        if (i <= 11) {
                            d.f289105b.f260401d.add(next);
                        } else {
                            Log.m105925i("MicroMsg.emoji.EmojiResUpdateMgr", "getEggList: unsupport version %s", Integer.valueOf(i));
                        }
                    }
                    Log.m105924i("MicroMsg.emoji.EmojiResUpdateMgr", "getEggList: from proto");
                }
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.emoji.EmojiResUpdateMgr", "init crash : %s, try delete egg file", e.getLocalizedMessage());
            Log.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", e, "", new Object[0]);
        }
        return d.f289105b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.field_activityid;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo137998F(com.tencent.p014mm.storage.emotion.EmojiInfo r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L_0x0013
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = r1.field_activityid
            if (r1 == 0) goto L_0x0011
            java.lang.String r2 = "Selfie:"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 == 0) goto L_0x001b
            int r1 = p645pj.C77092c.m93039a()
            goto L_0x001f
        L_0x001b:
            int r1 = p645pj.C77092c.m93040b()
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i61.C98602h.mo137998F(com.tencent.mm.storage.emotion.EmojiInfo, boolean):int");
    }

    /* renamed from: G */
    public EmojiInfo mo137999G(String str) {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        return C30790w2.m39221h().mo57717d().mo142044TO(str);
    }

    /* renamed from: H */
    public List<EmojiInfo> mo138000H(String str) {
        if (!C86709a0.m107535s().mo121147n()) {
            return new ArrayList();
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        return (ArrayList) C30790w2.m39221h().mo57717d().mo142039NQ(str);
    }

    /* renamed from: H2 */
    public EmojiInfo mo138001H2(String str) {
        return mo137999G(str);
    }

    /* renamed from: I */
    public C96985s2 mo138002I(String str, String str2) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (parseXml == null) {
            Log.m105928w("MicroMsg.emoji.EmojiMgrImpl", "get from xml, but attrs is null");
            return null;
        }
        C96985s2 b = C96985s2.m124655b(parseXml, str2, str, "");
        if (b != null) {
            return b;
        }
        Log.m105928w("MicroMsg.emoji.EmojiMgrImpl", "parserEmojiXml error " + str);
        return null;
    }

    /* renamed from: J */
    public String mo138003J(String str) {
        int i = EmojiLogic.f268226a;
        Log.m105919d("MicroMsg.emoji.EmojiLogic", "url:%s", str);
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmp) + "/emoticonstore/")) {
                return str.substring(str.lastIndexOf("/") + 1);
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r11 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r11 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        return r1;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.tencent.p014mm.storage.emotion.SmileyInfo> mo138004K() {
        /*
            r12 = this;
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            boolean[] r1 = r0.f82769a
            monitor-enter(r1)
            wh3.x r0 = r0.f82780l     // Catch:{ all -> 0x006b }
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r5 = "flag=?"
            java.lang.String r2 = "0"
            java.lang.String[] r6 = new java.lang.String[]{r2}
            r11 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r0.f100802d     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = "SmileyInfo"
            java.lang.String[] r4 = wh3.C38149x.f100801f     // Catch:{ Exception -> 0x0055 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0055 }
            if (r11 == 0) goto L_0x0050
            boolean r0 = r11.moveToFirst()     // Catch:{ Exception -> 0x0055 }
            if (r0 == 0) goto L_0x0050
        L_0x003c:
            com.tencent.mm.storage.emotion.SmileyInfo r0 = new com.tencent.mm.storage.emotion.SmileyInfo     // Catch:{ Exception -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0055 }
            r0.convertFrom(r11)     // Catch:{ Exception -> 0x0055 }
            r2 = -1
            r0.field_position = r2     // Catch:{ Exception -> 0x0055 }
            r1.add(r0)     // Catch:{ Exception -> 0x0055 }
            boolean r0 = r11.moveToNext()     // Catch:{ Exception -> 0x0055 }
            if (r0 != 0) goto L_0x003c
        L_0x0050:
            if (r11 == 0) goto L_0x0064
            goto L_0x0061
        L_0x0053:
            r0 = move-exception
            goto L_0x0065
        L_0x0055:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.emoji.NewSmileyInfoStorage"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0053 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x0053 }
            if (r11 == 0) goto L_0x0064
        L_0x0061:
            r11.close()
        L_0x0064:
            return r1
        L_0x0065:
            if (r11 == 0) goto L_0x006a
            r11.close()
        L_0x006a:
            throw r0
        L_0x006b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i61.C98602h.mo138004K():java.util.ArrayList");
    }

    /* renamed from: L */
    public String mo138005L() {
        return HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0";
    }

    /* renamed from: M */
    public boolean mo138006M(String str) {
        if (str != null && str.equals("capture")) {
            return true;
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        return C30790w2.m39221h().mo57715b().mo142032qq(str);
    }

    /* renamed from: N1 */
    public boolean mo138007N1(String str) {
        try {
            C101331f fVar = new C101331f(str);
            int l = (int) C86013q1.m106451l(str);
            return (l == 0 || l <= C77092c.m93042d()) && fVar.f296869a[0] <= C77092c.m93041c() && fVar.f296869a[1] <= C77092c.m93041c();
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.emoji.EmojiMgrImpl", Util.stackTraceToString(th));
            return false;
        }
    }

    /* renamed from: O */
    public boolean mo138008O(Context context, IEmojiInfo iEmojiInfo, int i, String str) {
        return mo138009P(context, iEmojiInfo, i, str, -1, true, false, false, (String) null, (ArrayList<String>) null, (String) null);
    }

    /* renamed from: P */
    public boolean mo138009P(Context context, IEmojiInfo iEmojiInfo, int i, String str, int i2, boolean z, boolean z2, boolean z3, String str2, ArrayList<String> arrayList, String str3) {
        if (context == null) {
            Log.m105920e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. context is null");
            return false;
        } else if (iEmojiInfo == null) {
            Log.m105920e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. emoji is null");
            return false;
        } else {
            Intent intent = new Intent();
            intent.setClass(context, EmojiAddCustomDialogUI.class);
            intent.putExtra("extra_id", iEmojiInfo.getMd5());
            intent.putExtra("extra_scence", i);
            intent.putExtra("extra_move_to_top", z);
            intent.putExtra("extra_username", str);
            intent.putExtra("extra_current", z2);
            intent.putExtra("key_is_selfie", z3);
            intent.putExtra("key_attached_text", str2);
            intent.putExtra("key_attached_emoji_md5", arrayList);
            intent.putExtra("key_imitate_md5", str3);
            intent.addFlags(65536);
            if (i2 <= 0 || !(context instanceof Activity)) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/api/IEmojiInfo;ILjava/lang/String;IZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/api/IEmojiInfo;ILjava/lang/String;IZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i2));
            aVar2.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/api/IEmojiInfo;ILjava/lang/String;IZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return true;
        }
    }

    /* renamed from: Q */
    public boolean mo138010Q(Context context, String str, String str2) {
        Cursor cursor;
        Class cls = C92054g.class;
        if (context == null) {
            Log.m105928w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: context is null");
            return false;
        } else if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105928w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: userName or imgPath is null");
            return false;
        } else {
            ((C92054g) C86312j.m106911c(cls)).getClass();
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(str2);
            if (TO == null) {
                Log.m105929w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: emoji not found, imgPath %s", str2);
                return false;
            }
            int i = TO.field_type;
            if (i == 10 || i == 11) {
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                String K1 = TO.mo62640K1();
                if (C86013q1.m106450k(TO.getCoverPath())) {
                    wXMediaMessage.thumbData = C86013q1.m106433O(TO.getCoverPath(), 0, -1);
                } else {
                    wXMediaMessage.setThumbImage(TO.mo62698y(context));
                }
                wXMediaMessage.mediaObject = new WXEmojiObject(K1);
                SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                aVar.f9478a = wXMediaMessage;
                aVar.f9479b = TO.field_app_id;
                aVar.f9480c = null;
                aVar.f9481d = str;
                aVar.f9482e = 0;
                aVar.f9485h = TO.getMd5();
                sendAppMsgEvent.publish();
            } else {
                if (i == 1) {
                    if (EmojiInfo.m124590n2(TO.field_catalog)) {
                        ((C92054g) C86312j.m106911c(cls)).getClass();
                        cursor = C30790w2.m39221h().mo57717d().mo142054fY(TO.field_catalog);
                    } else if (TO.field_catalog != 17 || TO.getContent().length() <= 0 || !EmojiInfo.m124590n2(Util.getInt(TO.getContent(), 0))) {
                        cursor = null;
                    } else {
                        ((C92054g) C86312j.m106911c(cls)).getClass();
                        cursor = C30790w2.m39221h().mo57717d().mo142054fY(Util.getInt(TO.getContent(), 0));
                    }
                    if (cursor != null) {
                        int intRandom = Util.getIntRandom(cursor.getCount() - 1, 0);
                        TO = new EmojiInfo();
                        cursor.moveToPosition(intRandom);
                        TO.convertFrom(cursor);
                        cursor.close();
                    }
                }
                if (C72996z1.m85812O4(str)) {
                    ((C97518c) C86312j.m106911c(C97518c.class)).wx0(str, TO, (C72963f4) null);
                } else {
                    ((C92054g) C86312j.m106911c(cls)).Cx0(str, TO, (C72963f4) null);
                }
            }
            return true;
        }
    }

    /* renamed from: S */
    public void mo138011S(String str, EmojiInfo emojiInfo, C72963f4 f4Var) {
        Class cls = C92054g.class;
        if (emojiInfo != null || f4Var != null) {
            if (emojiInfo == null) {
                ((C92054g) C86312j.m106911c(cls)).getClass();
                emojiInfo = C30790w2.m39221h().mo57717d().mo142044TO(f4Var.mo108765s2());
            }
            if (C72996z1.m85812O4(str)) {
                ((C97518c) C86312j.m106911c(C97518c.class)).wx0(str, emojiInfo, f4Var);
            } else {
                ((C92054g) C86312j.m106911c(cls)).Cx0(str, emojiInfo, f4Var);
            }
        }
    }

    /* renamed from: T */
    public String mo138012T(String str) {
        return ((C92054g) C86312j.m106911c(C92054g.class)).mo126027Cd().mo57676c(str);
    }

    /* renamed from: Y0 */
    public boolean mo138013Y0() {
        return C97496s.m125614b();
    }

    /* renamed from: a */
    public void mo138014a() {
        C102449a0 a0Var;
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            a0Var = h.f82783o;
        }
        List<C102452z> jo = a0Var.mo142017jo();
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) jo).iterator();
        while (it.hasNext()) {
            C102452z zVar = (C102452z) it.next();
            if (zVar.mo142068a() != null) {
                jSONArray.put(zVar.mo142068a());
                if (jSONArray.length() >= 9) {
                    break;
                }
            }
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_RECENT_SMILEY_STRING, jSONArray.toString());
    }

    /* renamed from: b */
    public String mo138015b() {
        return C86709a0.m107535s().f251806d;
    }

    /* renamed from: c */
    public void mo138016c(MStorage.IOnStorageChange iOnStorageChange) {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57717d().remove(iOnStorageChange);
    }

    /* renamed from: d */
    public boolean mo138017d() {
        if (!C97496s.f286152c) {
            if ((((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableEmoticonExternUrl", 0) & 4) == 4) {
                C97496s.f286155f = true;
            } else {
                C97496s.f286155f = false;
            }
            C97496s.f286152c = true;
        }
        Log.m105925i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcUpload:%b", Boolean.valueOf(C97496s.f286155f));
        return C97496s.f286155f && ((C101211h) C86312j.m106911c(C101211h.class)).mo140276It();
    }

    /* renamed from: e */
    public List<C102452z> mo138018e() {
        C102449a0 a0Var;
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            a0Var = h.f82783o;
        }
        return a0Var.mo142017jo();
    }

    /* renamed from: f */
    public void mo138019f(EmojiInfo emojiInfo) {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57717d().r50(emojiInfo);
    }

    /* renamed from: g */
    public boolean mo138020g() {
        if (!WeChatEnvironment.hasDebugger()) {
            return (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ShowEmoticonCameraEntrance", 3) & 1) > 0;
        }
    }

    /* renamed from: h */
    public boolean mo138021h(Context context, EmojiInfo emojiInfo, int i, int i2, boolean z, boolean z2, String str, ArrayList<String> arrayList, String str2) {
        return mo138009P(context, emojiInfo, i, (String) null, i2, z, true, z2, str, arrayList, str2);
    }

    /* renamed from: i */
    public void mo138022i(MStorage.IOnStorageChange iOnStorageChange) {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57717d().add(iOnStorageChange);
    }

    /* renamed from: j */
    public void mo138023j(String str) {
        EmojiInfo G = mo137999G(str);
        if (G != null) {
            C99928o.f292790a.mo139268a(G);
            return;
        }
        Log.m105929w("MicroMsg.emoji.EmojiMgrImpl", "addCaptureEmojiUploadTask: emojiInfo null by md5 %s", str);
    }

    /* renamed from: k */
    public void mo138024k(MStorage.IOnStorageChange iOnStorageChange) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C30790w2.m39221h().mo57715b().add(iOnStorageChange);
        }
    }

    /* renamed from: l */
    public void mo138025l(MStorage.IOnStorageChange iOnStorageChange) {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().remove(iOnStorageChange);
    }

    /* renamed from: l1 */
    public boolean mo138026l1(String str) {
        try {
            C101331f fVar = new C101331f(str);
            int l = (int) C86013q1.m106451l(str);
            return (l == 0 || l <= C77092c.m93039a()) && fVar.f296869a[0] <= C77092c.m93041c() && fVar.f296869a[1] <= C77092c.m93041c();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.emoji.EmojiMgrImpl", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: m */
    public EmojiInfo mo138027m(EmojiInfo emojiInfo) {
        if (C101964h.m134228j(emojiInfo)) {
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            Cursor fY = C30790w2.m39221h().mo57717d().mo142054fY(Util.getInt(emojiInfo.getContent(), 0));
            if (fY != null && fY.getCount() > 1) {
                int intRandom = Util.getIntRandom(fY.getCount() - 1, 0);
                EmojiInfo emojiInfo2 = new EmojiInfo();
                fY.moveToPosition(intRandom);
                emojiInfo2.convertFrom(fY);
                emojiInfo = emojiInfo2;
            }
            if (fY != null) {
                fY.close();
            }
        }
        return emojiInfo;
    }

    /* renamed from: n */
    public void mo138028n(String str) {
        C102449a0 a0Var;
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            a0Var = h.f82783o;
        }
        a0Var.getClass();
        if (!Util.isNullOrNil(str)) {
            synchronized (a0Var.f301700d) {
                C102452z zVar = null;
                int i = 0;
                while (true) {
                    if (i >= a0Var.f301700d.size()) {
                        i = -1;
                        break;
                    } else if (Util.isEqual(a0Var.f301700d.get(i).f301705a, str)) {
                        zVar = a0Var.f301700d.get(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (zVar == null) {
                    zVar = new C102452z();
                    zVar.f301705a = str;
                } else {
                    a0Var.f301700d.remove(i);
                }
                zVar.f301706b++;
                zVar.f301707c = System.currentTimeMillis();
                a0Var.f301700d.add(0, zVar);
                if (a0Var.f301700d.size() > 9) {
                    LinkedList<C102452z> linkedList = a0Var.f301700d;
                    linkedList.remove(linkedList.size() - 1);
                }
            }
            a0Var.doNotify("event_update_recent", 0, Integer.valueOf(a0Var.f301700d.size()));
        }
    }

    /* renamed from: o */
    public void mo138029o(EmojiInfo emojiInfo) {
        Class cls = C39315g.class;
        emojiInfo.field_groupId = "capture";
        ArrayList arrayList = new ArrayList();
        arrayList.add(emojiInfo.getMd5());
        ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().c40(1, arrayList);
        ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().r50(emojiInfo);
        EmojiUpdatePanelEvent emojiUpdatePanelEvent = new EmojiUpdatePanelEvent();
        emojiUpdatePanelEvent.f193547d.f193549a = 2;
        emojiUpdatePanelEvent.publish();
        if (!emojiUpdatePanelEvent.f193548e.f193550a) {
            z54 qq = ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57720g().mo61547qq();
            if (qq != null) {
                Iterator<a64> it = qq.f145713d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a64 next = it.next();
                    if (next.f130331d.equals("capture")) {
                        next.f130332e = 0;
                        break;
                    }
                }
            }
            ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57720g().mo61544Ow(qq);
            C98942a.f290038b.mo122420a(-29414086, "capture");
        }
    }

    public void onDestroy() {
    }

    /* renamed from: p */
    public EmojiIPSetInfo mo138031p(String str) {
        return C30790w2.m39221h().f82786r.mo61530jo(str);
    }

    /* renamed from: q */
    public <T> T mo138032q(C72994y1.C72995a aVar, T t) {
        return C86709a0.m107535s().mo121142i().mo119685f(aVar, t);
    }

    /* renamed from: r */
    public EmojiInfo mo138033r(String str, int i, int i2, int i3) {
        return mo138040y(str, "", i, i2, i3, (String) null, (String) null, (String) null, "");
    }

    /* renamed from: s */
    public void mo138034s(C72994y1.C72995a aVar, Object obj) {
        C86709a0.m107535s().mo121142i().mo119677K(aVar, obj);
    }

    /* renamed from: t */
    public boolean mo138035t() {
        boolean z = !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_TAB_RED_DOT_BOOLEAN, true);
        C97496s.m125615c();
        return z;
    }

    /* renamed from: u */
    public byte[] mo138036u(EmojiInfo emojiInfo) {
        EmojiInfo G;
        int i;
        if (!(emojiInfo == null || (G = mo137999G(emojiInfo.field_md5)) == null || (i = G.field_reserved4) == emojiInfo.field_reserved4)) {
            emojiInfo.field_reserved4 = i;
        }
        return C101897a.m134075e().mo126270A2(emojiInfo);
    }

    /* renamed from: v */
    public String mo138037v() {
        C98603i.m128193d().getClass();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("EmotionPanelConfigName");
        return Util.isNullOrNil(c) ? (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_NEW_PANEL_NAME_STRING, "emojipanel-config.xml") : c;
    }

    /* renamed from: w */
    public ArrayList<String> mo138038w(String str) {
        C30764p2 Cd = ((C92054g) C86312j.m106911c(C92054g.class)).mo126027Cd();
        if (!Cd.f82719a) {
            Cd.mo57680g();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        if (!Cd.f82719a) {
            Cd.mo57680g();
        }
        if (C45078p0.m49927f(str) > 32) {
            Log.m105924i("MicroMsg.emoji.EmojiDescNewMgr", "input text over checkout limit.");
        } else if (!Util.isNullOrNil(str) && Cd.f82724f != null) {
            String i = Cd.mo57682i(str);
            if (Cd.f82723e.containsKey(i)) {
                List list = Cd.f82722d.get(Cd.f82723e.get(i));
                if (list != null) {
                    arrayList3.addAll(list);
                }
            } else {
                arrayList3.add(i);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ArrayList arrayList4 = Cd.f82724f.get((String) it.next());
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList.addAll(arrayList4);
            }
        }
        String i2 = Cd.mo57682i(str);
        if (Cd.mo57679f(i2)) {
            for (Map.Entry next : Cd.f82725g.entrySet()) {
                if (((String) next.getKey()).contains(i2)) {
                    arrayList.addAll((Collection) next.getValue());
                }
            }
        }
        Log.m105925i("MicroMsg.emoji.EmojiDescNewMgr", "changeText: %s, %s", Integer.valueOf(arrayList3.size()), Integer.valueOf(arrayList.size()));
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, Cd.f82727i);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(((p2$$e) arrayList.get(i3)).f82729a);
            }
        }
        Log.m105919d("MicroMsg.emoji.EmojiDescNewMgr", "cpan[check desc]User time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01b5, code lost:
        if (r11 != null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01d7, code lost:
        if (r11 != null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01d9, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01e0, code lost:
        if (r5.size() <= 0) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01e2, code lost:
        r0 = r5.size();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01e7, code lost:
        if (r11 >= r0) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiCommandMgr", "i:%d group info:%s", java.lang.Integer.valueOf(r11), ((com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r5.get(r11)).toString());
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        ((p441aq.C92054g) di3.C86312j.m106911c(r4)).getClass();
        r5 = com.tencent.p014mm.storage.C30790w2.m39221h().mo57717d().getAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x021a, code lost:
        if (r5 == null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0220, code lost:
        if (r5.moveToFirst() == false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0222, code lost:
        r0 = new com.tencent.p014mm.storage.emotion.EmojiInfo();
        r0.convertFrom(r5);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiCommandMgr", "emoji info:%s", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x023b, code lost:
        if (r5.moveToNext() != false) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x023e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x023f, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0243, code lost:
        if (r5 == null) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0246, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0247, code lost:
        if (r8 != null) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0249, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x024c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x024d, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x024f, code lost:
        if (r5 != null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0251, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0254, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.emoji.EmojiCommandMgr", "end dump emoji db info:");
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x025f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138039x(java.lang.String r26) {
        /*
            r25 = this;
            r1 = r26
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            java.lang.Class<ct.c> r3 = p327ct.C30914c.class
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN
            java.lang.Class<aq.g> r4 = p441aq.C92054g.class
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)
            java.lang.String r6 = "MicroMsg.emoji.EmojiCommandMgr"
            if (r5 == 0) goto L_0x0017
            java.lang.String r5 = "emoji command is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x0017:
            java.lang.String r5 = "sync"
            boolean r5 = r5.equalsIgnoreCase(r1)
            r7 = 2
            r8 = 0
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x00c0
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_RECOVER_CUSTOM_EMOJI_BOOLEAN
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r5.mo119677K(r11, r12)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            r5.mo119677K(r0, r12)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN
            r0.mo119677K(r5, r12)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.mo119677K(r5, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.mo119677K(r5, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG
            r11 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.mo119677K(r5, r11)
            ll.l r0 = new ll.l
            r0.<init>(r9, r8)
            r0.mo138911a()
            ll.l r0 = new ll.l
            r0.<init>(r10, r8)
            r0.mo138911a()
            java.lang.String r0 = "MicroMsg.EmojiSyncMd5List"
            java.lang.String r5 = "clear reqBuff"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_LAST_DOWNLOAD_REQ_BUFF_STRING
            r0.mo119677K(r5, r8)
            j61.q r0 = new j61.q
            r5 = 8
            r11 = 15
            r0.<init>(r5, r8, r11, r10)
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            r5.mo123460f(r0)
            goto L_0x02f4
        L_0x00c0:
            java.lang.String r5 = "rcheart"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x00df
            di3.d r0 = di3.C86312j.m106911c(r4)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r0 = r0.mo57715b()
            r0.mo142026bO()
            goto L_0x02f4
        L_0x00df:
            java.lang.String r5 = "recover"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x0126
            java.lang.String r0 = "recover   begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            di3.d r0 = di3.C86312j.m106911c(r4)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.mo142045TY(r5)
            di3.d r0 = di3.C86312j.m106911c(r4)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r0 = r0.mo57715b()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.mo142030mL(r5)
            java.lang.String r0 = "recover   end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x02f4
        L_0x0126:
            java.lang.String r5 = "clean"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x0152
            java.lang.String r5 = "begin clean"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            i61.e r5 = i61.C33212e.m39992b()
            java.lang.String r11 = u61.C101964h.m134224f()
            r5.mo59025a(r11)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r5.mo119677K(r0, r11)
            java.lang.String r0 = "end clean"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x02f4
        L_0x0152:
            java.lang.String r0 = "dump"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0263
            java.lang.String r0 = "begin dump emoji db info:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            di3.d r0 = di3.C86312j.m106911c(r4)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r0 = r0.mo57715b()
            r0.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "select * from EmojiGroupInfo where "
            r11.append(r12)
            java.lang.String r12 = r0.mo142027jo()
            r11.append(r12)
            java.lang.String r12 = " order by sort ASC,lastUseTime DESC"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f301702d     // Catch:{ Exception -> 0x01bb, all -> 0x01b8 }
            android.database.Cursor r11 = r0.rawQuery(r11, r8, r7)     // Catch:{ Exception -> 0x01bb, all -> 0x01b8 }
            if (r11 == 0) goto L_0x01b5
            boolean r0 = r11.moveToFirst()     // Catch:{ Exception -> 0x01b3 }
            if (r0 == 0) goto L_0x01b5
        L_0x01a1:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ Exception -> 0x01b3 }
            r0.<init>()     // Catch:{ Exception -> 0x01b3 }
            r0.convertFrom(r11)     // Catch:{ Exception -> 0x01b3 }
            r5.add(r0)     // Catch:{ Exception -> 0x01b3 }
            boolean r0 = r11.moveToNext()     // Catch:{ Exception -> 0x01b3 }
            if (r0 != 0) goto L_0x01a1
            goto L_0x01b5
        L_0x01b3:
            r0 = move-exception
            goto L_0x01bd
        L_0x01b5:
            if (r11 == 0) goto L_0x01dc
            goto L_0x01d9
        L_0x01b8:
            r0 = move-exception
            goto L_0x025d
        L_0x01bb:
            r0 = move-exception
            r11 = r8
        L_0x01bd:
            java.lang.String r12 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
            r13.<init>()     // Catch:{ all -> 0x025b }
            java.lang.String r14 = "get all group fail."
            r13.append(r14)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x025b }
            r13.append(r0)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x025b }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ all -> 0x025b }
            if (r11 == 0) goto L_0x01dc
        L_0x01d9:
            r11.close()
        L_0x01dc:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0205
            int r0 = r5.size()
            r11 = 0
        L_0x01e7:
            if (r11 >= r0) goto L_0x0205
            java.lang.Object r12 = r5.get(r11)
            com.tencent.mm.storage.emotion.EmojiGroupInfo r12 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r12
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r13[r9] = r14
            java.lang.String r12 = r12.toString()
            r13[r10] = r12
            java.lang.String r12 = "i:%d group info:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r13)
            int r11 = r11 + 1
            goto L_0x01e7
        L_0x0205:
            di3.d r0 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x024d, all -> 0x0246 }
            aq.g r0 = (p441aq.C92054g) r0     // Catch:{ Exception -> 0x024d, all -> 0x0246 }
            r0.getClass()     // Catch:{ Exception -> 0x024d, all -> 0x0246 }
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ Exception -> 0x024d, all -> 0x0246 }
            wh3.g r0 = r0.mo57717d()     // Catch:{ Exception -> 0x024d, all -> 0x0246 }
            android.database.Cursor r5 = r0.getAll()     // Catch:{ Exception -> 0x024d, all -> 0x0246 }
            if (r5 == 0) goto L_0x0243
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            if (r0 == 0) goto L_0x0243
        L_0x0222:
            com.tencent.mm.storage.emotion.EmojiInfo r0 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            r0.<init>()     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            r0.convertFrom(r5)     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            java.lang.String r11 = "emoji info:%s"
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            r12[r9] = r0     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r12)     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            boolean r0 = r5.moveToNext()     // Catch:{ Exception -> 0x0241, all -> 0x023e }
            if (r0 != 0) goto L_0x0222
            goto L_0x0243
        L_0x023e:
            r0 = move-exception
            r8 = r5
            goto L_0x0247
        L_0x0241:
            goto L_0x024f
        L_0x0243:
            if (r5 == 0) goto L_0x0254
            goto L_0x0251
        L_0x0246:
            r0 = move-exception
        L_0x0247:
            if (r8 == 0) goto L_0x024c
            r8.close()
        L_0x024c:
            throw r0
        L_0x024d:
            r5 = r8
        L_0x024f:
            if (r5 == 0) goto L_0x0254
        L_0x0251:
            r5.close()
        L_0x0254:
            java.lang.String r0 = "end dump emoji db info:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x02f4
        L_0x025b:
            r0 = move-exception
            r8 = r11
        L_0x025d:
            if (r8 == 0) goto L_0x0262
            r8.close()
        L_0x0262:
            throw r0
        L_0x0263:
            java.lang.String r0 = "tuzki"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0275
            j61.c r0 = j61.C98905c.m128727a()
            r0.mo138241c()
            goto L_0x02f4
        L_0x0275:
            java.lang.String r0 = "reset-first"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02b5
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_OPENED_BOOLEAN
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r0.mo119677K(r5, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_IMITATE_SAVED_BOOLEAN
            r0.mo119677K(r5, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_OUTER_EMOJI_BUTTON_RED_DOT_BOOLEAN
            r0.mo119677K(r5, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_TAB_RED_DOT_BOOLEAN
            r0.mo119677K(r5, r11)
            goto L_0x02f4
        L_0x02b5:
            java.lang.String r0 = "cleanThumb"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02f4
            nl.j r0 = p207nl.C89008j.f256613a
            dl.o r0 = p490dl.C97489o.m125592g()
            java.util.ArrayList r0 = r0.mo136760a()
            java.util.Iterator r0 = r0.iterator()
        L_0x02cb:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x02e7
            java.lang.Object r5 = r0.next()
            com.tencent.mm.storage.emotion.EmojiInfo r5 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r5
            java.lang.String r11 = r5.field_thumbUrl
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x02cb
            java.lang.String r5 = r5.getCoverPath()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
            goto L_0x02cb
        L_0x02e7:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "clean thumb done"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r5, (int) r9)
            r0.show()
        L_0x02f4:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x07a3
            java.lang.String r0 = "new"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r5 = 229634(0x38102, float:3.21786E-40)
            java.lang.String r11 = "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM5eOptD4jIj72I8icMVEKwzSYkC30IgjMvSibGfqsEdy0ibXayiaZtbibSXV5EPZEWILOvbrjjLtQ9P4QQ/0"
            r12 = 229633(0x38101, float:3.21784E-40)
            java.lang.String r13 = ""
            if (r0 == 0) goto L_0x035a
            di3.d r0 = di3.C86312j.m106911c(r3)
            ct.c r0 = (p327ct.C30914c) r0
            ct.d r0 = r0.mo17862sM()
            l20.a r0 = (l20.C21388a) r0
            r1 = 262147(0x40003, float:3.67346E-40)
            r0.mo33509r(r1, r10)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = 208899(0x33003, float:2.9273E-40)
            r0.mo119676J(r2, r1)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119676J(r12, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.mo119676J(r5, r1)
            goto L_0x07a3
        L_0x035a:
            java.lang.String r0 = "free"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x03af
            di3.d r0 = di3.C86312j.m106911c(r3)
            ct.c r0 = (p327ct.C30914c) r0
            ct.d r0 = r0.mo17862sM()
            l20.a r0 = (l20.C21388a) r0
            r1 = 262149(0x40005, float:3.67349E-40)
            r0.mo33509r(r1, r10)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = 208913(0x33011, float:2.9275E-40)
            r0.mo119676J(r2, r1)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119676J(r12, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.mo119676J(r5, r1)
            goto L_0x07a3
        L_0x03af:
            java.lang.String r0 = "newp"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x03c9
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r1, r2)
            goto L_0x07a3
        L_0x03c9:
            java.lang.String r0 = "newpe"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x03e3
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r1, r2)
            goto L_0x07a3
        L_0x03e3:
            java.lang.String r0 = "add"
            boolean r3 = r1.startsWith(r0)
            java.lang.String r5 = ","
            if (r3 == 0) goto L_0x03fa
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            r0.split(r5)
            goto L_0x07a3
        L_0x03fa:
            java.lang.String r0 = "backup"
            boolean r3 = r1.startsWith(r0)
            if (r3 == 0) goto L_0x0422
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            java.lang.String[] r0 = r0.split(r5)
            j61.e r1 = new j61.e
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r9, r10, r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123460f(r1)
            goto L_0x07a3
        L_0x0422:
            java.lang.String r0 = "h5"
            boolean r3 = r1.startsWith(r0)
            if (r3 == 0) goto L_0x0447
            java.lang.String r1 = r1.replace(r0, r13)
            java.lang.String r1 = r1.trim()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)
            r0.commit()
            goto L_0x07a3
        L_0x0447:
            java.lang.String r0 = "md5"
            boolean r3 = r1.startsWith(r0)
            if (r3 == 0) goto L_0x0470
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0460
            java.lang.String r0 = "/sdcard/test.png"
        L_0x0460:
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x07a3
        L_0x0470:
            java.lang.String r0 = "recommend"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x04c4
            java.lang.String r0 = "<NewRecommendEmotion><Emotion><ProductID>com.tencent.xin.emoticon.person.stiker_144984189945aa5830d33cd7dc</ProductID><RecType>3</RecType><Name>野萌君</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/duc2TvpEgSTWy4k8MnuicFjyiazriaGWDX52HzNWeLVTjtJcjZeZEicTn5kJFPYdicWZTuUZJgiaADK9I/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/DhduwiaBa7lchicgAfwibeykm81eGWXkMDgGJ8DWcOcIc28C7oTic4Y09Pick8Fw69KiaZVxrHl8S2lPY/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.person.stiker_14389422638f6ca818af405e21</ProductID><RecType>3</RecType><Name>猪仔和羊妹</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/iaUiazNVkRp7iaZjrMuYgfH8kB5xkyYv20CYzY3W9HCLBr2XybJibGKKtXibMnAfZnRTH/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/PiajxSqBRaEJR9canNKZ7RYI3hx5BPCSwQmuhhlNWD1jzUSOx3CWqEtibd65zOjySd/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.person.stiker_1444199720f5ea147582ff0512</ProductID><RecType>3</RecType><Name>让红包飞</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/nMl9ssowtibXLY57PdK8Nsh827vlsw4TGHPgLUehd2R455xnwe3xpoVDIKpAuXU1Aic3XbH1LfMr7fp4DgO7o8IQ/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/duc2TvpEgST18reErFRzNFR8EiahI4Iibp4ZnW1ibJYt4MMLvQvjx3sHGTMuTOgnREq5f2GXLhuzalOOz3icw9NGbA/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.xiaobendan</ProductID><RecType>3</RecType><Name>小笨蛋与大坏蛋</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLC8ILTt0pqcaCVkldLMydoNJcupoR7qUojia3vKlgd74uQ/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLC8ILTt0pqcaAAEUI4a7z5ECqpUXbQw95PY1mpc4p0FxA/0</Panel><ButtonType>1</ButtonType></Emotion><Emotion><ProductID>com.tencent.xin.emoticon.shin2</ProductID><RecType>3</RecType><Name>野原新之助2</Name><Icon>http://mmbiz.qpic.cn/mmemoticon/iciaySdkria4apGIW1wvSbPC9oxWQPHZyicaccx5JDIp2uE/0</Icon><Panel>http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLASEAAX7xw76beia5j4HyA0rq9WgtgscicJo7935UCpCpog/0</Panel><ButtonType>1</ButtonType></Emotion></NewRecommendEmotion>"
            java.util.ArrayList r0 = k61.C99106f.m129077a(r0)
            di3.d r1 = di3.C86312j.m106911c(r4)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r1 = r1.mo57715b()
            java.lang.String r2 = "1"
            java.lang.String r3 = "2"
            java.lang.String r5 = "7"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r5}
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f301702d
            java.lang.String r3 = "EmojiGroupInfo"
            java.lang.String r5 = "recommand=? and type!=? and status!=?"
            r1.delete(r3, r5, r2)
            di3.d r1 = di3.C86312j.m106911c(r4)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r1 = r1.mo57715b()
            r1.getClass()
            java.lang.String r2 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.String r3 = "[insertRecommendEmojiGroupInfo]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r1.mo142033uP(r0)
            goto L_0x07a3
        L_0x04c4:
            java.lang.String r0 = "count"
            boolean r3 = r1.startsWith(r0)
            if (r3 == 0) goto L_0x04e5
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            k40.a r1 = f40.C86709a0.m107533q(r2)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "CustomEmojiMaxSize"
            r1.mo107408f(r2, r0)
            goto L_0x07a3
        L_0x04e5:
            java.lang.String r0 = "auto"
            boolean r3 = r1.startsWith(r0)
            if (r3 == 0) goto L_0x0506
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            k40.a r1 = f40.C86709a0.m107533q(r2)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "C2CEmojiNotAutoDownloadTimeRange"
            r1.mo107408f(r2, r0)
            goto L_0x07a3
        L_0x0506:
            java.lang.String r0 = "bo"
            boolean r2 = r1.startsWith(r0)
            if (r2 == 0) goto L_0x054a
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "1"
            boolean r0 = r0.equalsIgnoreCase(r1)
            java.lang.String r1 = "broken"
            if (r0 == 0) goto L_0x0535
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r10)
            r0.commit()
            goto L_0x07a3
        L_0x0535:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r9)
            r0.commit()
            goto L_0x07a3
        L_0x054a:
            java.lang.String r0 = "newsmiley"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x060a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mm.storage.emotion.SmileyInfo r1 = new com.tencent.mm.storage.emotion.SmileyInfo
            r13 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r6 = "/::AAA"
            java.lang.String r7 = "[机智]"
            java.lang.String r8 = "[机智]"
            java.lang.String r9 = "[机智]"
            java.lang.String r10 = "[机智]"
            java.lang.String r11 = "[机智]"
            java.lang.String r12 = "emoji2.png"
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.storage.emotion.SmileyInfo r2 = new com.tencent.mm.storage.emotion.SmileyInfo
            r22 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r15 = "/::BBB"
            java.lang.String r16 = "[滑稽]"
            java.lang.String r17 = "[滑稽]"
            java.lang.String r18 = "[滑稽]"
            java.lang.String r19 = "[滑稽]"
            java.lang.String r20 = "[滑稽]"
            java.lang.String r21 = "emoji3.png"
            r14 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.storage.emotion.SmileyInfo r3 = new com.tencent.mm.storage.emotion.SmileyInfo
            r13 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r6 = "[Pose]"
            java.lang.String r7 = "[摆姿势]"
            java.lang.String r8 = "[摆姿势]"
            java.lang.String r9 = "[摆姿势]"
            java.lang.String r10 = "[摆姿势]"
            java.lang.String r11 = "[摆姿势]"
            java.lang.String r12 = "emoji4.png"
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.storage.emotion.SmileyInfo r5 = new com.tencent.mm.storage.emotion.SmileyInfo
            r22 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r15 = "/::DDD"
            java.lang.String r16 = "[瞪]"
            java.lang.String r17 = "[瞪]"
            java.lang.String r18 = "[瞪]"
            java.lang.String r19 = "[瞪]"
            java.lang.String r20 = "[瞪]"
            java.lang.String r21 = "emoji5.png"
            r14 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.storage.emotion.SmileyInfo r15 = new com.tencent.mm.storage.emotion.SmileyInfo
            r14 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r7 = "/::FFF"
            java.lang.String r8 = "[捂脸]"
            java.lang.String r9 = "[捂脸]"
            java.lang.String r10 = "[捂脸]"
            java.lang.String r11 = "[捂脸]"
            java.lang.String r12 = "[捂脸]"
            java.lang.String r13 = "emoji6.png"
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.storage.emotion.SmileyInfo r6 = new com.tencent.mm.storage.emotion.SmileyInfo
            r24 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r17 = "/::Doge"
            java.lang.String r18 = "[Doge]"
            java.lang.String r19 = "[Doge]"
            java.lang.String r20 = "[Doge]"
            java.lang.String r21 = "[Doge]"
            java.lang.String r22 = "[Doge]"
            java.lang.String r23 = "emoji7.png"
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r5)
            r0.add(r15)
            r0.add(r6)
            di3.d r1 = di3.C86312j.m106911c(r4)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            boolean[] r2 = r1.f82769a
            monitor-enter(r2)
            wh3.x r1 = r1.f82780l     // Catch:{ all -> 0x0607 }
            monitor-exit(r2)     // Catch:{ all -> 0x0607 }
            r1.mo61549jo(r0)
            goto L_0x07a3
        L_0x0607:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0607 }
            throw r0
        L_0x060a:
            java.lang.String r0 = "panel"
            boolean r2 = r1.startsWith(r0)
            if (r2 == 0) goto L_0x067b
            java.lang.String r0 = r1.replace(r0, r13)
            r0.getClass()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r0 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent
            r0.<init>()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r0.f78743d
            r1.f78745b = r10
            r2 = 37
            r1.f78744a = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = a70.C112760b.m154195C()
            r3.append(r4)
            java.lang.String r4 = "CheckResUpdate/37.1.data"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.f78746c = r3
            r0.publish()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r0 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent
            r0.<init>()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r0.f78743d
            r1.f78745b = r7
            r1.f78744a = r2
            java.lang.String r3 = "/sdcard/tencent/MicroMsg/CheckResUpdate/37.2.data"
            r1.f78746c = r3
            r0.publish()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r0 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent
            r0.<init>()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r0.f78743d
            r3 = 3
            r1.f78745b = r3
            r1.f78744a = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154195C()
            r2.append(r3)
            java.lang.String r3 = "CheckResUpdate/37.3.data"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.f78746c = r2
            r0.publish()
            goto L_0x07a3
        L_0x067b:
            java.lang.String r0 = "key"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x06e1
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "create key :%s"
            r1.append(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            di3.d r1 = di3.C86312j.m106911c(r4)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r1 = r1.mo57717d()
            r2 = 153(0x99, float:2.14E-43)
            r1.mo142042SE(r2)
            com.tencent.mm.storage.emotion.EmojiInfo r1 = new com.tencent.mm.storage.emotion.EmojiInfo
            r1.<init>()
            r1.field_md5 = r0
            r1.field_catalog = r2
            di3.d r0 = di3.C86312j.m106911c(r4)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            r0.insert(r1)
            goto L_0x07a3
        L_0x06e1:
            java.lang.String r0 = "delete-db"
            boolean r2 = r1.startsWith(r0)
            if (r2 == 0) goto L_0x0707
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            di3.d r1 = di3.C86312j.m106911c(r4)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r1 = r1.mo57717d()
            r1.mo142043TE(r0)
            goto L_0x07a3
        L_0x0707:
            java.lang.String r0 = "delete-file"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x073a
            java.lang.String r0 = "delete"
            java.lang.String r0 = r1.replace(r0, r13)
            java.lang.String r0 = r0.trim()
            java.lang.String[] r0 = r0.split(r5)
            int r1 = r0.length
        L_0x071e:
            if (r9 >= r1) goto L_0x07a3
            r2 = r0[r9]
            java.lang.Class<z51.g> r3 = z51.C39315g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            i61.h r3 = (i61.C98602h) r3
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r3.mo137999G(r2)
            r2.mo62645S0()
            int r9 = r9 + 1
            goto L_0x071e
        L_0x073a:
            java.lang.String r0 = "batchDownload"
            boolean r0 = r1.startsWith(r0)
            java.lang.String r2 = " "
            if (r0 == 0) goto L_0x075b
            java.lang.String[] r0 = r1.split(r2)
            int r1 = r0.length
            if (r1 > r10) goto L_0x074c
            goto L_0x07a3
        L_0x074c:
            r0 = r0[r10]
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            ll.l r1 = new ll.l
            r1.<init>(r0, r8)
            r1.mo138911a()
            goto L_0x07a3
        L_0x075b:
            java.lang.String r0 = "getInfo"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0784
            java.lang.String[] r0 = r1.split(r2)
            int r1 = r0.length
            if (r1 > r10) goto L_0x076b
            goto L_0x07a3
        L_0x076b:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0 = r0[r10]
            r1.add(r0)
            j61.g r0 = new j61.g
            r0.<init>(r1, r9)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123460f(r0)
            goto L_0x07a3
        L_0x0784:
            java.lang.String r0 = "test"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x07a3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r1
            java.lang.String r1 = "theTest: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            i61.a r1 = new i61.a
            r1.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r1)
        L_0x07a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i61.C98602h.mo138039x(java.lang.String):void");
    }

    /* renamed from: y */
    public EmojiInfo mo138040y(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6) {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        return C30790w2.m39221h().mo57717d().mo142059kD(str, str2, i, i2, i3, str3, str4, str5, str6, 1);
    }

    /* renamed from: z */
    public byte[] mo138041z(EmojiInfo emojiInfo) {
        EmojiInfo G;
        int i;
        if (!(emojiInfo == null || (G = mo137999G(emojiInfo.field_md5)) == null || (i = G.field_reserved4) == emojiInfo.field_reserved4)) {
            emojiInfo.field_reserved4 = i;
        }
        byte[] A2 = C101897a.m134075e().mo126270A2(emojiInfo);
        if (!ImgUtil.isWXGF(A2)) {
            return A2;
        }
        byte[] nativeWxamToGif = MMWXGFJNI.nativeWxamToGif(A2);
        if (Util.isNullOrNil(nativeWxamToGif)) {
            Log.m105928w("MicroMsg.emoji.EmojiMgrImpl", "decodeAsGif: wxam to gif error");
        } else {
            Log.m105925i("MicroMsg.emoji.EmojiMgrImpl", "decodeAsGif: %s, %s", Integer.valueOf(A2.length), Integer.valueOf(nativeWxamToGif.length));
        }
        return nativeWxamToGif;
    }
}
