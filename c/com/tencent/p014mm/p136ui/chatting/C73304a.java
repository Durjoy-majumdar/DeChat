package com.tencent.p014mm.p136ui.chatting;

import ad0.C0033t;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import hd0.C98408n0;
import jr2.C99016j;
import p682rz.C101491u;
import p740wo.C53193b;
import te3.tc4;

/* renamed from: com.tencent.mm.ui.chatting.a */
public class C73304a {

    /* renamed from: com.tencent.mm.ui.chatting.a$a */
    public enum C73305a {
        EnterFullScreen(2),
        EnterCompleteVideo(3);
        

        /* renamed from: d */
        public int f215401d;

        /* access modifiers changed from: public */
        C73305a(int i) {
            this.f215401d = i;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.a$b */
    public enum C73306b {
        Fav(1),
        Chat(2),
        Chatroom(3);
        

        /* renamed from: d */
        public int f215406d;

        /* access modifiers changed from: public */
        C73306b(int i) {
            this.f215406d = i;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.a$c */
    public enum C73307c {
        Samll(1),
        Full(2);
        

        /* renamed from: d */
        public int f215410d;

        /* access modifiers changed from: public */
        C73307c(int i) {
            this.f215410d = i;
        }
    }

    /* renamed from: a */
    public static void m86445a(C73305a aVar, C72963f4 f4Var, String str, String str2) {
        String t = f4Var.mo108768t();
        boolean U5 = C72996z1.m85820U5(t);
        String s = f4Var.mo108769t2() == 1 ? C75592q0.m90789s() : U5 ? C75604z3.m90847s(f4Var.getContent()) : t;
        C0033t tVar = new C0033t();
        tVar.mo32a("20source_publishid", str + ",");
        tVar.mo32a("21uxinfo", str2 + ",");
        tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
        tVar.mo32a("23video_statu", ",");
        StringBuilder sb = new StringBuilder();
        sb.append(f4Var.getType() == 62 ? 1 : 2);
        sb.append(",");
        tVar.mo32a("24source_type", sb.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(U5 ? 4 : 3);
        sb4.append(",");
        tVar.mo32a("25scene", sb4.toString());
        tVar.mo32a("26action_type", aVar.f215401d + ",");
        tVar.mo32a("27scene_chatname", t + ",");
        tVar.mo32a("28scene_username", s + ",");
        tVar.mo32a("29curr_publishid", ",");
        tVar.mo32a("30curr_msgid", f4Var.mo108774y2() + ",");
        tVar.mo32a("31curr_favid", "0,");
        tVar.mo32a("32elapsed_time", "0,");
        tVar.mo32a("33load_time", "0,");
        tVar.mo32a("34is_load_complete", "0,");
        tVar.mo32a("35destination", "0,");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(U5 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(t) : 0);
        sb5.append(",");
        tVar.mo32a("36chatroom_membercount", sb5.toString());
        Log.m105924i("MicroMsg.AdVideoStatistic", "report snsad_video_action: " + tVar.mo34c());
        ((C99016j) C86312j.m106911c(C99016j.class)).mo55731h(12990, tVar);
    }

    /* renamed from: b */
    public static boolean m86446b(C72963f4 f4Var, PString pString, PString pString2) {
        tc4 tc4;
        if (f4Var.getType() == 62) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
            if (Zd == null || (tc4 = Zd.f288535C) == null || Util.isNullOrNil(tc4.f299543j)) {
                return false;
            }
            pString.value = tc4.f299544n;
            pString2.value = tc4.f299543j;
            return true;
        }
        if (f4Var.getType() == 49) {
            boolean U5 = C72996z1.m85820U5(f4Var.mo108768t());
            String content = f4Var.getContent();
            if (U5 && f4Var.getContent() != null && f4Var.mo108769t2() == 0) {
                content = C75604z3.m90849u(f4Var.getContent());
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
            if (u != null && u.f195582i == 4 && !Util.isNullOrNil(u.f195541W1)) {
                pString.value = u.f195565d2;
                pString2.value = u.f195561c2;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m86447c(C73306b bVar, C73307c cVar, C72963f4 f4Var, int i) {
        PString pString = new PString();
        PString pString2 = new PString();
        if (m86446b(f4Var, pString, pString2)) {
            String str = pString.value;
            String str2 = pString2.value;
            String t = f4Var.mo108768t();
            boolean U5 = C72996z1.m85820U5(t);
            String s = f4Var.mo108769t2() == 1 ? C75592q0.m90789s() : U5 ? C75604z3.m90847s(f4Var.getContent()) : t;
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", str + ",");
            tVar.mo32a("21uxinfo", str2 + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            tVar.mo32a("23video_statu", cVar.f215410d + ",");
            StringBuilder sb = new StringBuilder();
            sb.append(f4Var.getType() == 62 ? 1 : 2);
            sb.append(",");
            tVar.mo32a("24source_type", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(U5 ? 4 : 3);
            sb4.append(",");
            tVar.mo32a("25scene", sb4.toString());
            tVar.mo32a("26action_type", bVar.f215406d + ",");
            tVar.mo32a("27scene_chatname", t + ",");
            tVar.mo32a("28scene_username", s + ",");
            tVar.mo32a("29curr_publishid", ",");
            tVar.mo32a("30curr_msgid", f4Var.mo108774y2() + ",");
            tVar.mo32a("31curr_favid", "0,");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(U5 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(t) : 0);
            sb5.append(",");
            tVar.mo32a("32chatroom_membercount", sb5.toString());
            tVar.mo32a("33chatroom_toMemberCount", i + ",");
            Log.m105924i("MicroMsg.AdVideoStatistic", "report snsad_video_spread: " + tVar.mo34c());
            C115669n.INSTANCE.mo160131h(12991, tVar);
        }
    }
}
