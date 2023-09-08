package qe0;

import a11.C39478b;
import a11.C39479c;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NetSceneGetChatroomMemberDetailEvent;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import p788aj.C39607a;
import sf0.C48374j0;
import te3.C49324es;
import te3.C51500u63;
import te3.C51654v63;
import te3.C51792w63;

/* renamed from: qe0.c */
public class C47802c {
    /* renamed from: a */
    public static CharSequence m53111a(C72996z1 z1Var, CharSequence charSequence) {
        String a = C47806g.m53116a(z1Var);
        if (a == null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(a);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7s)), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static void m53112b(C51500u63 u632, int i, int i2) {
        Class cls = C39479c.class;
        Class cls2 = C75700k0.class;
        if (!u632.f142620d.toLowerCase().endsWith("@im.chatroom")) {
            Log.m105920e("OpenIMChatRoomContactLogic", "updateChatroom: bad room:[" + u632.f142620d + "]");
            return;
        }
        String str = u632.f142620d;
        C39607a aVar = new C39607a();
        aVar.f106339h = u632.f142622f.f143359q;
        int i3 = u632.f142623g;
        aVar.f106342n = i3;
        if (i3 != 0) {
            aVar.f106341j = i3;
        }
        NetSceneGetChatroomMemberDetailEvent netSceneGetChatroomMemberDetailEvent = new NetSceneGetChatroomMemberDetailEvent();
        NetSceneGetChatroomMemberDetailEvent.C40141a aVar2 = netSceneGetChatroomMemberDetailEvent.f107649d;
        aVar2.f107650a = str;
        aVar2.f107651b = aVar.f106341j;
        C49324es esVar = new C49324es();
        C51792w63 w632 = u632.f142624h;
        esVar.f133093d = w632 == null ? 0 : w632.f143893d.size();
        esVar.f133096g = C48374j0.m53720i(u632.f142620d);
        C51792w63 w633 = u632.f142624h;
        esVar.f133095f = w633.f143894e;
        esVar.f133094e = C47805f.m53115a(w633.f143893d);
        ((C39478b) C86312j.m106911c(C39478b.class)).X50(str, u632.f142622f.f143349d, esVar, C75592q0.m90789s(), aVar, netSceneGetChatroomMemberDetailEvent);
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(u632.f142620d);
        if (Lo == null) {
            Lo = new C44661m1();
            Lo.field_chatroomname = u632.f142620d;
        }
        if (i != -1) {
            Lo.field_oldChatroomVersion = i;
        }
        if (i2 != -1) {
            Lo.field_chatroomVersion = i2;
        }
        Lo.mo69792t2().f106337f = u632.f142622f.f143360r;
        try {
            Lo.field_roomdata = Lo.mo69792t2().toByteArray();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ChatRoomMember", "exception:%s", Util.stackTraceToString(e));
        }
        String str2 = u632.f142620d;
        C51654v63 v632 = u632.f142622f;
        C68098o zx02 = C68102u.zx0();
        if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(v632.f143351f)) {
            C68097n Lo2 = zx02.mo93607Lo(str2);
            if (Lo2 == null) {
                Lo2 = new C68097n();
                Lo2.f195728a = str2;
            }
            String str3 = v632.f143350e;
            Lo2.f195732e = str3;
            Lo2.f195731d = v632.f143351f;
            Lo2.f195729b = 3;
            Lo2.f195733f = Util.isNullOrNil(str3) ^ true ? 1 : 0;
            zx02.mo93608Yt(Lo2);
            if (v632.f143352g == 2 && !C75592q0.m90789s().equals(str2)) {
                C68102u.wx0().mo93566o(str2, false);
                C68102u.wx0().mo93566o(str2, true);
                C68102u.vx0().mo93582i(str2);
            }
        }
        Lo.field_roomowner = v632.f143349d;
        if (Lo.field_chatroomnoticePublishTime <= ((long) v632.f143358p)) {
            if (Util.isNullOrNil(v632.f143356n)) {
                Lo.field_chatroomNoticeNew = 0;
            }
            Lo.field_chatroomnotice = v632.f143356n;
            Lo.field_chatroomnoticeEditor = v632.f143357o;
            Lo.field_chatroomnoticePublishTime = (long) v632.f143358p;
        }
        ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).replace(Lo);
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(u632.f142620d);
        int type = z1Var.getType();
        z1Var.mo62880V2(u632.f142629p);
        C51654v63 v633 = u632.f142622f;
        if ((!Util.isNullOrNil(v633.f143353h)) && (v633 != null)) {
            z1Var.mo62878U2(u632.f142622f.f143353h);
        }
        z1Var.setUsername(u632.f142620d);
        z1Var.mo62866N3(u632.f142630q);
        z1Var.setType(u632.f142628o & u632.f142627n);
        z1Var.mo62866N3(u632.f142630q);
        z1Var.mo62861K3(u632.f142626j);
        z1Var.mo62856H3(u632.f142622f.f143361s);
        Log.m105925i("OpenIMChatRoomContactLogic", "updateChatroom done %s, chatroom_business_type:%s ", z1Var.getUsername(), Long.valueOf(u632.f142622f.f143361s));
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69668Q3(z1Var);
        if ((z1Var.getType() & 2048) != 0) {
            if ((type & 2048) != (z1Var.getType() & 2048)) {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69766g0(z1Var.getUsername());
            }
        } else if ((type & 2048) != (z1Var.getType() & 2048)) {
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69772j0(z1Var.getUsername());
        }
        if (!Util.isNullOrNil(u632.f142629p)) {
            ((C76158j) C86312j.m106911c(C76158j.class)).mo106371tU(u632.f142629p, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), "");
        }
    }
}
