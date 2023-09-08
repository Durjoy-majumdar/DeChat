package va3;

import android.os.Bundle;
import android.util.Base64;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C101801kd0;
import te3.C101811md0;
import wa3.C102364c;
import wa3.C102370j;
import wa3.C102375n;
import xa3.C102602r;

/* renamed from: va3.c */
public class C102166c extends C105052s {
    public C102166c(NoteEditorUI noteEditorUI, C102165b bVar) {
        super(bVar);
    }

    /* renamed from: C0 */
    public static String m134608C0(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String next : bundle.keySet()) {
                jSONObject.put(next, JSONObject.wrap(bundle.get(next)));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e, "bundleToJson", new Object[0]);
            return null;
        }
    }

    /* renamed from: D0 */
    public static String m134609D0(NotifyWNNoteOperationEvent.C92535a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", aVar.f264944a);
            String str = aVar.f264945b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("editorId", str);
            jSONObject.put("field_localId", aVar.field_localId);
            String str3 = aVar.f264948e;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject.put("insertJsonData", str3);
            String str4 = aVar.f264949f;
            if (str4 == null) {
                str4 = str2;
            }
            jSONObject.put("exportJsonData", str4);
            jSONObject.put("isInsert", aVar.f264950g);
            Bundle bundle = aVar.f264951h;
            jSONObject.put("bundleData", bundle == null ? str2 : m134608C0(bundle));
            jSONObject.put("itemType", aVar.f264952i);
            String str5 = aVar.f264953j;
            if (str5 == null) {
                str5 = str2;
            }
            jSONObject.put("path", str5);
            jSONObject.put("intdata", aVar.f264954k);
            jSONObject.put("showShare", aVar.f264955l);
            C101801kd0 kd02 = aVar.field_favProto;
            jSONObject.put("field_favProto", kd02 == null ? str2 : Base64.encodeToString(kd02.toByteArray(), 0));
            C101811md0 md02 = aVar.f264956m;
            if (md02 != null) {
                str2 = Base64.encodeToString(md02.toByteArray(), 0);
            }
            jSONObject.put("reportInfo", str2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e, "eventToJson NotifyWNNoteOperationEvent", new Object[0]);
        }
        return jSONObject.toString();
    }

    /* renamed from: E0 */
    public static void m134610E0(C102602r rVar) {
        int i = 3;
        if (rVar.f302105d) {
            Log.m105924i("MicroMsg.Fav.NoteFloatBallHelper", "isOpenFromSession: true");
            C102375n nVar = new C102375n();
            nVar.f301476p = m134611F0(rVar);
            nVar.f301477q = 3;
            C102364c.vx0().X00(nVar);
            C101811md0 md02 = new C101811md0();
            md02.f298813d = 8;
            nVar.mo141964q(rVar.f302110i, Long.valueOf(rVar.f302107f), true, MMApplicationContext.getContext(), rVar.f302111j, rVar.f302112n, md02, (Bundle) null);
            if (!rVar.f302108g) {
                i = 2;
            }
            nVar.f301472i.f301480b = i;
            return;
        }
        Log.m105924i("MicroMsg.Fav.NoteFloatBallHelper", "isOpenFromSession: false");
        C102370j jVar = new C102370j();
        jVar.f301476p = m134611F0(rVar);
        jVar.f301477q = 3;
        C102364c.vx0().X00(jVar);
        C101811md0 md03 = new C101811md0();
        md03.f298813d = 8;
        jVar.mo141959s(rVar.f302106e, MMApplicationContext.getContext(), rVar.f302110i, Boolean.TRUE, rVar.f302111j, rVar.f302112n, md03, (C101801kd0) null, (byte[]) null);
        jVar.f301472i.f301480b = 1;
    }

    /* renamed from: F0 */
    public static String m134611F0(C102602r rVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("topIsOpenFromSession", rVar.f302105d);
            jSONObject.put("topLocalId", rVar.f302106e);
            jSONObject.put("topMsgId", rVar.f302107f);
            jSONObject.put("isChatRoom", rVar.f302108g);
            String str = rVar.f302109h;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("topTitle", str);
            String str3 = rVar.f302110i;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("topNoteXml", str2);
            jSONObject.put("topLastPosition", rVar.f302111j);
            jSONObject.put("topLastOffset", rVar.f302112n);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e, "topItemToJson", new Object[0]);
        }
        return jSONObject.toString();
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        super.mo35648A(i, str);
        getReportInfo().f311717f = 5;
        getReportInfo().f311716e = 6;
        getReportInfo().f311720i = "";
        mo68414O();
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        super.mo67996A0();
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return true;
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return this.f311808n.mo23516g();
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        mo149200z0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        this.f311808n.mo23513d(false);
    }
}
