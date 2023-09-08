package pb1;

import ad0.C0033t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.LinkedList;
import jr2.C76442r;
import jr2.C99016j;
import te3.C101834rc0;
import te3.C101849uc0;

/* renamed from: pb1.h0 */
public class C100710h0 {

    /* renamed from: pb1.h0$a */
    public enum C100711a {
        PlayIcon(1),
        EnterFullScreen(2),
        EnterCompleteVideo(3),
        LeavelFullScreen(5);
        

        /* renamed from: d */
        public int f295068d;

        /* access modifiers changed from: public */
        C100711a(int i) {
            this.f295068d = i;
        }
    }

    /* renamed from: pb1.h0$b */
    public enum C100712b {
        Chat(2),
        Chatroom(3);
        

        /* renamed from: d */
        public int f295072d;

        /* access modifiers changed from: public */
        C100712b(int i) {
            this.f295072d = i;
        }
    }

    /* renamed from: pb1.h0$c */
    public enum C100713c {
        Samll(1),
        Full(2);
        

        /* renamed from: d */
        public int f295076d;

        /* access modifiers changed from: public */
        C100713c(int i) {
            this.f295076d = i;
        }
    }

    /* renamed from: a */
    public static void m131764a(C100755z zVar) {
        C101834rc0 first;
        C101849uc0 uc02;
        LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
        if (linkedList != null && !linkedList.isEmpty() && (uc02 = first.f299306h1) != null) {
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", uc02.f299617n + ",");
            tVar.mo32a("21uxinfo", uc02.f299616j + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            StringBuilder sb = new StringBuilder();
            sb.append(zVar.field_type == 16 ? 1 : 2);
            sb.append(",");
            tVar.mo32a("23source_type", sb.toString());
            tVar.mo32a("24scene", "5,");
            tVar.mo32a("25scene_chatname", ",");
            tVar.mo32a("26scene_username", zVar.field_fromUser + ",");
            tVar.mo32a("27curr_publishid", ",");
            tVar.mo32a("28curr_msgid", "0,");
            tVar.mo32a("29curr_favid", zVar.field_id + ",");
            tVar.mo32a("30isdownload", "0,");
            tVar.mo32a("31chatroom_membercount", "0,");
            ((C76442r) C86312j.m106911c(C76442r.class)).mo106655nS((first = zVar.field_favProto.f298618f.getFirst()).f299311k1, tVar);
            Log.m105924i("MicroMsg.FavVideoStatistic", "report snsad_video_exposure: " + tVar.mo34c());
            C115669n.INSTANCE.mo160131h(12989, tVar);
        }
    }

    /* renamed from: b */
    public static void m131765b(C100711a aVar, C100755z zVar) {
        C101849uc0 uc02;
        LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
        if (linkedList != null && !linkedList.isEmpty() && (uc02 = zVar.field_favProto.f298618f.getFirst().f299306h1) != null) {
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", uc02.f299617n + ",");
            tVar.mo32a("21uxinfo", uc02.f299616j + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            tVar.mo32a("23video_statu", ",");
            StringBuilder sb = new StringBuilder();
            sb.append(zVar.field_type == 16 ? 1 : 2);
            sb.append(",");
            tVar.mo32a("24source_type", sb.toString());
            tVar.mo32a("25scene", "5,");
            tVar.mo32a("26action_type", aVar.f295068d + ",");
            tVar.mo32a("27scene_chatname", ",");
            tVar.mo32a("28scene_username", zVar.field_fromUser + ",");
            tVar.mo32a("29curr_publishid", ",");
            tVar.mo32a("30curr_msgid", "0,");
            tVar.mo32a("31curr_favid", zVar.field_id + ",");
            tVar.mo32a("32elapsed_time", "0,");
            tVar.mo32a("33load_time", "0,");
            tVar.mo32a("34is_load_complete", "0,");
            tVar.mo32a("35destination", "0,");
            tVar.mo32a("36chatroom_membercount", "0,");
            Log.m105924i("MicroMsg.FavVideoStatistic", "report snsad_video_action: " + tVar.mo34c());
            ((C99016j) C86312j.m106911c(C99016j.class)).mo55731h(12990, tVar);
        }
    }

    /* renamed from: c */
    public static void m131766c(C100712b bVar, C100755z zVar, C100713c cVar, int i) {
        C101849uc0 uc02;
        LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
        if (linkedList != null && !linkedList.isEmpty() && (uc02 = zVar.field_favProto.f298618f.getFirst().f299306h1) != null) {
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", uc02.f299617n + ",");
            tVar.mo32a("21uxinfo", uc02.f299616j + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            tVar.mo32a("23video_statu", cVar.f295076d + ",");
            StringBuilder sb = new StringBuilder();
            sb.append(zVar.field_type == 16 ? 1 : 2);
            sb.append(",");
            tVar.mo32a("24source_type", sb.toString());
            tVar.mo32a("25scene", "5,");
            tVar.mo32a("26action_type", bVar.f295072d + ",");
            tVar.mo32a("27scene_chatname", ",");
            tVar.mo32a("28scene_username", zVar.field_fromUser + ",");
            tVar.mo32a("29curr_publishid", ",");
            tVar.mo32a("30curr_msgid", "0,");
            tVar.mo32a("31curr_favid", zVar.field_id + ",");
            tVar.mo32a("32chatroom_membercount", "0,");
            tVar.mo32a("33chatroom_toMemberCount", i + ",");
            Log.m105924i("MicroMsg.FavVideoStatistic", "report snsad_video_spread: " + tVar.mo34c());
            C115669n.INSTANCE.mo160131h(12991, tVar);
        }
    }
}
