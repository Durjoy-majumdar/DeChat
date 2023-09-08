package p33;

import android.content.Intent;
import android.os.Looper;
import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l31.C61212e;
import p270xi.C78841m;
import p270xi.C91212b;
import p924yi.C79121a;
import z04.C112551y;

@C91212b(exportInterface = C79121a.class)
/* renamed from: p33.a */
public final class C77056a extends C78841m implements C79121a {

    /* renamed from: e */
    public C75875l.C75877b f225100e = new C77057a(this);

    /* renamed from: p33.a$a */
    public static final class C77057a implements C75875l.C75877b {

        /* renamed from: d */
        public final /* synthetic */ C77056a f225101d;

        public C77057a(C77056a aVar) {
            this.f225101d = aVar;
        }

        /* renamed from: w5 */
        public final void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            if (lVar != null && eVar != null) {
                String r = ((C67391b) this.f225101d.f231661d).mo91577r();
                if (eVar.f123844a != null) {
                    if (!(r == null || C112551y.m153811k(r)) && C87412m.m108589b(eVar.f123844a, r) && C87412m.m108589b(eVar.f123845b, "insert")) {
                        ArrayList<C72963f4> arrayList = eVar.f123846c;
                        C87412m.m108593f(arrayList, "notifyInfo.msgList");
                        C77056a aVar = this.f225101d;
                        Iterator<C72963f4> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().mo108769t2() == 1) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("view_id", "send_msg_half_screen");
                                ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", hashMap, 26804);
                                aVar.getClass();
                                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(aVar.f225100e);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Intent intent = ((C67391b) this.f231661d).f193286j.getIntent();
        intent.getLongExtra("roomKey", 0);
        intent.getIntExtra("roomId", 0);
        Log.m105918d("VoipFloatChattingComponent", "onChattingEnterAnimStart() called");
        if (((C67391b) this.f231661d).f193286j.getIntExtra("chat_from_scene", 0) == 9) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this.f225100e, (Looper) null);
            HashMap hashMap = new HashMap();
            hashMap.put("page_id", 30063);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_exp", hashMap, 26804);
        }
    }

    /* renamed from: O5 */
    public void mo102427O5() {
        Log.m105918d("VoipFloatChattingComponent", "onClickBackBtn() called");
        HashMap hashMap = new HashMap();
        hashMap.put("view_id", "msg_push_close");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", hashMap, 26804);
    }

    /* renamed from: P5 */
    public void mo102428P5() {
        Log.m105918d("VoipFloatChattingComponent", "onClickResetUnread() called");
        HashMap hashMap = new HashMap();
        hashMap.put("view_id", "set_msg_push_unread");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", hashMap, 26804);
    }

    /* renamed from: Q5 */
    public void mo102429Q5() {
        Log.m105918d("VoipFloatChattingComponent", "onClickSpaceAreaFinish() called");
        HashMap hashMap = new HashMap();
        hashMap.put("view_id", "msg_blank_half_screen");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", hashMap, 26804);
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105918d("VoipFloatChattingComponent", "onChattingExitAnimStart() called");
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this.f225100e);
    }
}
