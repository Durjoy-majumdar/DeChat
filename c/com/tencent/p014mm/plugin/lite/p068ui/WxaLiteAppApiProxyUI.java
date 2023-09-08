package com.tencent.p014mm.plugin.lite.p068ui;

import com.tencent.p014mm.p136ui.C85927s;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import nj3.C88989a;
import p244tt.C14088e;

@C88989a(7)
@C85927s.C85929b
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI */
public class WxaLiteAppApiProxyUI extends MMActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f19844d = 0;

    public int getLayoutId() {
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r7 = r23
            java.lang.Class<ht1.e5> r0 = ht1.C8764e5.class
            java.lang.Class<tt.e> r1 = p244tt.C14088e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tt.e r1 = (p244tt.C14088e) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo13514aF(r2)
            super.onCreate(r24)
            r1 = 21
            boolean r1 = p206nj.C11171e.m11046c(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0024
            android.view.Window r1 = r23.getWindow()
            r1.setStatusBarColor(r2)
        L_0x0024:
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r3 = "proxyui_action_code_key"
            int r3 = r1.getIntExtra(r3, r2)
            java.lang.String r4 = "title"
            r5 = 1000(0x3e8, float:1.401E-42)
            r6 = 2
            java.lang.String r8 = "extInfo"
            java.lang.String r9 = "scene"
            java.lang.String r10 = "url"
            java.lang.String r11 = ""
            r12 = -1
            java.lang.String r13 = "MicroMsg.WxaLiteAppApiProxyUI"
            java.lang.String r14 = "callback_id"
            r15 = 1
            switch(r3) {
                case 0: goto L_0x0453;
                case 1: goto L_0x03d5;
                case 2: goto L_0x0331;
                case 3: goto L_0x02e5;
                case 4: goto L_0x02ae;
                case 5: goto L_0x0277;
                case 6: goto L_0x0257;
                case 7: goto L_0x020e;
                case 8: goto L_0x0165;
                case 9: goto L_0x0098;
                case 10: goto L_0x005f;
                case 11: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x04f4
        L_0x0049:
            int r0 = r1.getIntExtra(r14, r2)
            com.tencent.mm.plugin.lite.ui.d r1 = new com.tencent.mm.plugin.lite.ui.d
            r1.<init>(r7, r0)
            r7.mmSetOnActivityResultCallback(r1)
            java.lang.String r0 = "wallet_core"
            java.lang.String r1 = ".ui.WalletBankCardSelectUI"
            ke3.C88144b.m109794l(r7, r0, r1, r5)
            goto L_0x04f4
        L_0x005f:
            int r0 = r1.getIntExtra(r14, r2)
            java.lang.String r3 = "get_msg_proof_items_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r3 = "chat_username"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "Chat_User"
            r3.putExtra(r4, r1)
            java.lang.String r1 = "finish_direct"
            r3.putExtra(r1, r15)
            java.lang.String r1 = "expose_edit_mode"
            r3.putExtra(r1, r15)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r3.setFlags(r1)
            com.tencent.mm.plugin.lite.ui.c r1 = new com.tencent.mm.plugin.lite.ui.c
            r1.<init>(r7, r0)
            java.lang.String r0 = ".ui.chatting.ChattingUI"
            ke3.C88144b.m109803u(r7, r0, r3, r2, r1)
            goto L_0x04f4
        L_0x0098:
            int r0 = r1.getIntExtra(r14, r2)
            java.lang.String r3 = "choose_chat_room_member_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r3 = r1.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "chatRoomUserName"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "selectedUserNameList"
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r6 = r5.length()
            r8 = 93
            if (r6 <= 0) goto L_0x00da
            int r6 = r5.length()
            int r6 = r6 + r12
            char r6 = r5.charAt(r6)
            if (r6 != r8) goto L_0x00da
            int r6 = r5.length()
            int r6 = r6 + r12
            java.lang.String r5 = r5.substring(r2, r6)
        L_0x00da:
            java.lang.String r6 = "["
            boolean r9 = r5.equals(r6)
            if (r9 == 0) goto L_0x00e3
            r5 = r11
        L_0x00e3:
            java.lang.String r9 = "allUserNameList"
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r9 = r1.length()
            if (r9 <= 0) goto L_0x0108
            int r9 = r1.length()
            int r9 = r9 + r12
            char r9 = r1.charAt(r9)
            if (r9 != r8) goto L_0x0108
            int r8 = r1.length()
            int r8 = r8 + r12
            java.lang.String r1 = r1.substring(r2, r8)
        L_0x0108:
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r11 = r1
        L_0x0110:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r1 = ","
            java.lang.String[] r5 = r5.split(r1)
            int r9 = r5.length
            r10 = 0
        L_0x0122:
            if (r10 >= r9) goto L_0x0132
            r12 = r5[r10]
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x012f
            r6.add(r12)
        L_0x012f:
            int r10 = r10 + 1
            goto L_0x0122
        L_0x0132:
            java.lang.String[] r1 = r11.split(r1)
            int r5 = r1.length
        L_0x0137:
            if (r2 >= r5) goto L_0x0147
            r9 = r1[r2]
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x0144
            r8.add(r9)
        L_0x0144:
            int r2 = r2 + 1
            goto L_0x0137
        L_0x0147:
            java.lang.Class<sx.o> r1 = p240sx.C13796o.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sx.o r1 = (p240sx.C13796o) r1
            r2 = r23
            r5 = r6
            r6 = r8
            android.content.Intent r1 = r1.mo13156ZP(r2, r3, r4, r5, r6)
            com.tencent.mm.ui.MMFragmentActivity$$d r1 = r7.startActivityForResult(r1)
            com.tencent.mm.plugin.lite.ui.b r2 = new com.tencent.mm.plugin.lite.ui.b
            r2.<init>(r7, r0)
            r1.mo7677b(r2)
            goto L_0x04f4
        L_0x0165:
            int r0 = r1.getIntExtra(r14, r2)
            java.lang.String r2 = "open_game_life_chatroom_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "chatroom_name"
            java.lang.Object r2 = r1.get(r2)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r2 = "chatroom_icon"
            java.lang.Object r2 = r1.get(r2)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r2 = "is_auto_join"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r16 = java.lang.Boolean.parseBoolean(r2)
            java.lang.String r2 = "sourceid"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r14 = java.lang.Long.parseLong(r2)
            java.lang.String r2 = "ssid"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r12 = java.lang.Long.parseLong(r2)
            java.lang.String r2 = "backToRoomList"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            java.lang.String r3 = "targetChannelId"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r4 = "targetSeq"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.String r6 = "is_real_time"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            java.lang.Object r1 = r1.get(r8)
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.mm.plugin.lite.ui.a r8 = new com.tencent.mm.plugin.lite.ui.a
            r9 = 3345(0xd11, float:4.687E-42)
            r8.<init>(r7, r9, r0)
            r7.mmSetOnActivityResultCallback(r8)
            zw1.b$a r0 = new zw1.b$a
            r17 = 0
            r8 = 3345(0xd11, float:4.687E-42)
            r9 = r0
            r9.<init>(r10, r11, r12, r14, r16, r17)
            r0.f43826j = r8
            r0.f43822f = r2
            r0.f43825i = r4
            r0.f43824h = r3
            r0.f43827k = r6
            r0.f43828l = r1
            java.lang.Class<zw1.b> r1 = zw1.C16408b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            zw1.b r1 = (zw1.C16408b) r1
            r1.mo14872aD(r7, r0)
            goto L_0x04f4
        L_0x020e:
            int r0 = r1.getIntExtra(r14, r2)
            java.lang.String r2 = "download_game_video_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "videoUrl"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "thumbUrl"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r4 = 11
            java.lang.String r5 = "game_from"
            r3.putExtra(r5, r4)
            java.lang.String r4 = "video_url"
            r3.putExtra(r4, r2)
            java.lang.String r2 = "thumb_url"
            r3.putExtra(r2, r1)
            com.tencent.mm.plugin.lite.ui.j r1 = new com.tencent.mm.plugin.lite.ui.j
            r1.<init>(r7, r0)
            r7.mmSetOnActivityResultCallback(r1)
            r0 = 1137(0x471, float:1.593E-42)
            java.lang.String r1 = "game"
            java.lang.String r2 = ".media.GameVideoDownloadUI"
            ke3.C88144b.m109795m(r7, r1, r2, r3, r0)
            goto L_0x04f4
        L_0x0257:
            int r0 = r1.getIntExtra(r14, r2)
            com.tencent.mm.plugin.lite.ui.i r1 = new com.tencent.mm.plugin.lite.ui.i
            r1.<init>(r7, r0)
            r7.mmSetOnActivityResultCallback(r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.account.ui.VerifyPwdUI"
            r0.setClassName(r7, r1)
            java.lang.String r1 = "key_scenen"
            r0.putExtra(r1, r2)
            r7.startActivityForResult((android.content.Intent) r0, (int) r5)
            goto L_0x04f4
        L_0x0277:
            int r3 = r1.getIntExtra(r14, r2)
            java.lang.String r4 = "open_finder_timeline_view_param"
            java.io.Serializable r1 = r1.getSerializableExtra(r4)
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02a0 }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x02a0 }
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ JSONException -> 0x02a0 }
            ht1.e5 r0 = (ht1.C8764e5) r0     // Catch:{ JSONException -> 0x02a0 }
            boolean r0 = r0.mo243MD(r7, r4)     // Catch:{ JSONException -> 0x02a0 }
            if (r0 == 0) goto L_0x0298
            i22.C8846b.m8675b(r3, r15)     // Catch:{ JSONException -> 0x02a0 }
            goto L_0x029b
        L_0x0298:
            i22.C8846b.m8675b(r3, r2)     // Catch:{ JSONException -> 0x02a0 }
        L_0x029b:
            r23.finish()     // Catch:{ JSONException -> 0x02a0 }
            goto L_0x04f4
        L_0x02a0:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r11, r1)
            i22.C8846b.m8675b(r3, r2)
            r23.finish()
            goto L_0x04f4
        L_0x02ae:
            int r3 = r1.getIntExtra(r14, r2)
            java.lang.String r4 = "open_finder_search_view_param"
            java.io.Serializable r1 = r1.getSerializableExtra(r4)
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02d7 }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x02d7 }
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ JSONException -> 0x02d7 }
            ht1.e5 r0 = (ht1.C8764e5) r0     // Catch:{ JSONException -> 0x02d7 }
            boolean r0 = r0.mo244Rt(r7, r4)     // Catch:{ JSONException -> 0x02d7 }
            if (r0 == 0) goto L_0x02cf
            i22.C8846b.m8674a(r3, r15)     // Catch:{ JSONException -> 0x02d7 }
            goto L_0x02d2
        L_0x02cf:
            i22.C8846b.m8674a(r3, r2)     // Catch:{ JSONException -> 0x02d7 }
        L_0x02d2:
            r23.finish()     // Catch:{ JSONException -> 0x02d7 }
            goto L_0x04f4
        L_0x02d7:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r11, r1)
            i22.C8846b.m8674a(r3, r2)
            r23.finish()
            goto L_0x04f4
        L_0x02e5:
            int r0 = r1.getIntExtra(r14, r2)
            java.lang.String r2 = "jump_to_biz_profile_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "tousername"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "extmsg"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "toUserName"
            r4.putExtra(r5, r2)
            r4.putExtra(r8, r3)
            java.lang.String r2 = "fromURL"
            r4.putExtra(r2, r1)
            java.lang.String r1 = "source"
            r4.putExtra(r1, r6)
            com.tencent.mm.plugin.lite.ui.h r1 = new com.tencent.mm.plugin.lite.ui.h
            r1.<init>(r7, r0)
            java.lang.String r0 = "com.tencent.mm.ui.CheckCanSubscribeBizUI"
            r4.setClassName(r7, r0)
            r0 = 3
            r7.mmStartActivityForResult(r1, r4, r0)
            goto L_0x04f4
        L_0x0331:
            int r0 = r1.getIntExtra(r14, r2)
            java.lang.String r2 = "add_contact_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "webtype"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = "username"
            java.lang.Object r2 = r1.get(r2)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r1.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = "addscene"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "scenenote"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "profileReportInfo"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r12)
            if (r5 == r15) goto L_0x03aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "unknown addScene = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.lite.api.c> r1 = i22.C8846b.f28078f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.plugin.lite.api.c r1 = (com.tencent.p014mm.plugin.lite.api.C4770c) r1
            if (r1 != 0) goto L_0x0399
            goto L_0x03a5
        L_0x0399:
            r1.mo5677e(r12)
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.lite.api.c> r1 = i22.C8846b.f28078f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
        L_0x03a5:
            r23.finish()
            goto L_0x04f4
        L_0x03aa:
            java.lang.String r2 = "start addContact"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            wc3.a r6 = new wc3.a
            r6.<init>()
            r6.f41256a = r1
            r6.f41258c = r4
            java.lang.Class<wc3.v> r1 = wc3.C15140v.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            wc3.v r1 = (wc3.C15140v) r1
            r4 = 33
            com.tencent.mm.plugin.lite.ui.g r5 = new com.tencent.mm.plugin.lite.ui.g
            r5.<init>(r7, r0)
            r2 = r23
            wd3.t0 r0 = r1.mo14098jU(r2, r3, r4, r5, r6)
            wd3.b r0 = (wd3.C78545b) r0
            r0.mo108519f()
            goto L_0x04f4
        L_0x03d5:
            int r0 = r1.getIntExtra(r14, r2)
            java.lang.String r2 = "batch_add_card_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "card_list"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "srcUsername"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "consumedCardId"
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "template_id"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "key_in_card_list"
            r8.putExtra(r9, r2)
            java.lang.String r2 = "key_from_scene"
            r8.putExtra(r2, r1)
            java.lang.String r1 = "src_username"
            r8.putExtra(r1, r3)
            java.lang.String r1 = "js_url"
            r8.putExtra(r1, r4)
            java.lang.String r1 = "key_consumed_card_id"
            r8.putExtra(r1, r5)
            java.lang.String r1 = "key_template_id"
            r8.putExtra(r1, r6)
            java.lang.String r1 = "start batchAddCard"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            com.tencent.mm.plugin.lite.ui.f r1 = new com.tencent.mm.plugin.lite.ui.f
            r1.<init>(r7, r0)
            r7.mmSetOnActivityResultCallback(r1)
            r5 = 1
            r6 = 0
            java.lang.String r2 = "card"
            java.lang.String r3 = ".ui.CardAddEntranceUI"
            r1 = r23
            r4 = r8
            ke3.C88144b.m109796n(r1, r2, r3, r4, r5, r6)
            goto L_0x04f4
        L_0x0453:
            java.lang.String r0 = "Select_Conv_User"
            java.lang.String r18 = r1.getStringExtra(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            java.lang.String r3 = "webview_params"
            if (r0 == 0) goto L_0x049b
            int r0 = r1.getIntExtra(r14, r2)
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = "Select_Conv_Type"
            r5 = 3
            r2.putExtra(r4, r5)
            java.lang.String r4 = "scene_from"
            r2.putExtra(r4, r6)
            java.lang.String r4 = "mutil_select_is_ret"
            r2.putExtra(r4, r15)
            r2.putExtra(r3, r1)
            java.lang.String r1 = "Retr_Msg_Type"
            r2.putExtra(r1, r6)
            java.lang.String r1 = "start SelectConversationUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            com.tencent.mm.plugin.lite.ui.e r1 = new com.tencent.mm.plugin.lite.ui.e
            r1.<init>(r7, r0)
            java.lang.String r0 = ".ui.transmit.SelectConversationUI"
            ke3.C88144b.m109804v(r7, r0, r2, r15, r1)
            goto L_0x04f4
        L_0x049b:
            int r0 = r1.getIntExtra(r14, r2)
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r2 = r1.get(r4)
            if (r2 != 0) goto L_0x04ac
            goto L_0x04b3
        L_0x04ac:
            java.lang.Object r1 = r1.get(r4)
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
        L_0x04b3:
            androidx.appcompat.app.AppCompatActivity r1 = r23.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r1)
            r2.append(r11)
            java.lang.String r19 = r2.toString()
            java.lang.Class<wc3.w> r1 = wc3.C78541w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r16 = r1
            wc3.w r16 = (wc3.C78541w) r16
            androidx.appcompat.app.AppCompatActivity r17 = r23.getContext()
            com.tencent.mm.plugin.lite.ui.k r1 = new com.tencent.mm.plugin.lite.ui.k
            r1.<init>(r7, r0)
            com.tencent.mm.plugin.lite.ui.l r2 = new com.tencent.mm.plugin.lite.ui.l
            r2.<init>(r7)
            com.tencent.mm.plugin.lite.ui.m r3 = new com.tencent.mm.plugin.lite.ui.m
            r3.<init>(r7, r0)
            r20 = r1
            r21 = r2
            r22 = r3
            r16.ph0(r17, r18, r19, r20, r21, r22)
        L_0x04f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.FALSE);
    }
}
