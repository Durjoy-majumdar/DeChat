package g11;

import a11.C39479c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import c30.C26827e;
import c30.C79923f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92979c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f11.C97792a;
import f11.C97793b;
import f11.C97798g;
import f11.C97799h;
import f11.C97800i;
import f40.C86709a0;
import f62.C75700k0;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76912y0;
import p775zi.C79332c;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: g11.c */
public class C98068c {

    /* renamed from: a */
    public static LruCache<Integer, C20937c> f287519a = new LruCache<>(3);

    /* renamed from: g11.c$a */
    public class C98069a implements C47883u {
        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: a */
    public static C97792a m126676a(C92979c cVar, C72963f4 f4Var, String str, String str2, String str3) {
        C97792a aVar = null;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.MsgFileUtils", "getImagePath() msg is null !");
            return null;
        }
        if (Util.isNullOrNil(str2)) {
            str2 = "all";
        }
        List<String> e = m126680e(str3);
        String lowerCase = str2.toLowerCase();
        lowerCase.getClass();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case 96673:
                if (lowerCase.equals("all")) {
                    c = 0;
                    break;
                }
                break;
            case 3143036:
                if (lowerCase.equals("file")) {
                    c = 1;
                    break;
                }
                break;
            case 100313435:
                if (lowerCase.equals("image")) {
                    c = 2;
                    break;
                }
                break;
            case 112202875:
                if (lowerCase.equals("video")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C97792a g = m126682g(cVar, f4Var, str, e);
                if (g != null) {
                    return g;
                }
                C97800i iVar = (f4Var.mo100994f4() || f4Var.mo100989b4()) ? new C97800i(cVar, f4Var) : null;
                if (iVar != null) {
                    return iVar;
                }
                if (f4Var.mo100961A3()) {
                    aVar = new C97793b(cVar, f4Var);
                } else if (f4Var.mo100979R3()) {
                    aVar = new C97799h(cVar, f4Var);
                }
                return aVar;
            case 1:
                return m126682g(cVar, f4Var, str, e);
            case 2:
                if (f4Var.mo100961A3()) {
                    return new C97793b(cVar, f4Var);
                }
                if (f4Var.mo100979R3()) {
                    return new C97799h(cVar, f4Var);
                }
                return null;
            case 3:
                if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
                    return new C97800i(cVar, f4Var);
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static void m126677b(int i, int i2, Intent intent, C79332c.C79333a aVar) {
        if (i != C98067b.f287518a) {
            return;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 == 1) {
                    if (intent == null) {
                        Log.m105920e("MicroMsg.MsgFileUtils", "data is null");
                        if (aVar != null) {
                            aVar.mo104148a(1, "data is null", (ArrayList<MsgFile>) null);
                            return;
                        }
                        return;
                    }
                    String stringExtra = intent.getStringExtra("ERRMSG");
                    if (aVar != null) {
                        aVar.mo104148a(1, stringExtra, (ArrayList<MsgFile>) null);
                    }
                }
            } else if (aVar != null) {
                aVar.mo104148a(0, "", (ArrayList<MsgFile>) null);
            }
        } else if (intent == null) {
            Log.m105920e("MicroMsg.MsgFileUtils", "data is null");
            if (aVar != null) {
                aVar.mo104148a(1, "data is null", (ArrayList<MsgFile>) null);
            }
        } else {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("FILEPATHS");
            if (parcelableArrayListExtra == null) {
                Log.m105920e("MicroMsg.MsgFileUtils", "msgFiles is null");
                if (aVar != null) {
                    aVar.mo104148a(1, "msgFiles is null", (ArrayList<MsgFile>) null);
                }
            } else if (aVar != null) {
                aVar.mo104148a(-1, "", parcelableArrayListExtra);
            }
        }
    }

    /* renamed from: c */
    public static void m126678c(Context context, long j) {
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92771j(context, (View) null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        intent.putExtra("app_msg_id", j);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/logic/util/MsgFileUtils", "enterFileProfile", "(Landroid/content/Context;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/choosemsgfile/logic/util/MsgFileUtils", "enterFileProfile", "(Landroid/content/Context;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: d */
    public static void m126679d(Context context, View view, C97792a aVar) {
        int i;
        int i2;
        Intent intent = new Intent();
        if (aVar == null) {
            Log.m105920e("MicroMsg.MsgFileUtils", "[enterGallery] item == null");
            return;
        }
        C72963f4 f4Var = aVar.f286878b;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.MsgFileUtils", "[enterGallery] msg == null");
            return;
        }
        int i3 = context.getResources().getConfiguration().orientation;
        int[] iArr = new int[2];
        if (view != null) {
            i2 = view.getWidth();
            i = view.getHeight();
            view.getLocationInWindow(iArr);
        } else {
            i2 = 0;
            i = 0;
        }
        intent.addFlags(536870912);
        intent.putExtra("img_gallery_msg_id", f4Var.getMsgId()).putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2()).putExtra("img_gallery_talker", f4Var.mo108768t()).putExtra("img_gallery_chatroom_name", f4Var.mo108768t()).putExtra("img_gallery_orientation", i3).putExtra("show_enter_grid", false).putExtra("img_gallery_enter_from_scene", 1);
        if (view != null) {
            intent.putExtra("img_gallery_width", i2).putExtra("img_gallery_height", i).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
        } else {
            intent.putExtra("img_gallery_back_from_grid", true);
        }
        C88144b.m109801s(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, (Bundle) null);
        ((Activity) context).overridePendingTransition(0, 0);
    }

    /* renamed from: e */
    public static List<String> m126680e(String str) {
        ArrayList arrayList = new ArrayList();
        if (Util.isNullOrNil(str)) {
            return arrayList;
        }
        try {
            C26827e eVar = new C26827e(str);
            for (int i = 0; i < eVar.length(); i++) {
                String optString = eVar.optString(i, "");
                if (!Util.isNullOrNil(optString)) {
                    arrayList.add(optString);
                }
            }
        } catch (C79923f e) {
            Log.printErrStackTrace("MicroMsg.MsgFileUtils", e, "", new Object[0]);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static String m126681f(String str) {
        Class cls = C75700k0.class;
        if (C72996z1.m85820U5(str)) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
            if (z1Var != null && !Util.isNullOrNil(z1Var.getNickname())) {
                return z1Var.getNickname();
            }
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
            if (Lo != null) {
                return Lo.field_displayname;
            }
            Log.m105921e("MicroMsg.MsgFileUtils", "%s chatRoomMember is null", str);
            return "";
        }
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var2 != null) {
            return z1Var2.getNickname();
        }
        Log.m105921e("MicroMsg.MsgFileUtils", "%s, contact is null", str);
        return "";
    }

    /* renamed from: g */
    public static C97792a m126682g(C92979c cVar, C72963f4 f4Var, String str, List<String> list) {
        String content;
        C68070l.C68072b u;
        if (f4Var.mo101020w3() && (content = f4Var.getContent()) != null && (u = C68070l.C68072b.m80422u(content, (String) null)) != null && u.f195582i == 6) {
            C97798g gVar = new C97798g(cVar, f4Var, str);
            if (list == null || list.size() == 0) {
                return gVar;
            }
            for (String endsWith : list) {
                if (gVar.mo137119d().endsWith(endsWith)) {
                    return gVar;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public static void m126683h(Context context, int i) {
        String format = String.format(context.getString(C0966R.string.bd_), new Object[]{Integer.valueOf(i)});
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(format);
        qVar.mo107589a(false);
        qVar.mo107600l(new C98069a());
        qVar.mo107603o();
    }
}
