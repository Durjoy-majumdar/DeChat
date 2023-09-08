package cz1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C28686o1;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C27049a1;
import f62.C75700k0;
import fy3.C32224a;
import g62.C75875l;
import gy3.C87412m;
import gy3.C87413o;
import iz1.C33478b;
import iz1.C33484f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kr0.C88274h0;
import p008bq.C67309t0;
import p875ci.C67379u;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import ty0.C52389b;
import wy1.C53224d;
import xy1.C15913g;

/* renamed from: cz1.k */
public final class C45232k extends C52389b<C33478b, C7143c> implements C27049a1 {

    /* renamed from: d */
    public final C13601g f122571d = C36568h.m40985a(C30979b.f83133d);

    /* renamed from: e */
    public final C13601g f122572e = C36568h.m40985a(C45233a.f122574d);

    /* renamed from: f */
    public long f122573f;

    /* renamed from: cz1.k$b */
    public static final class C30979b extends C87413o implements C32224a<C33484f> {

        /* renamed from: d */
        public static final C30979b f83133d = new C30979b();

        public C30979b() {
            super(0);
        }

        public Object invoke() {
            return ((C53224d) C86312j.m106911c(C53224d.class)).Bx0();
        }
    }

    /* renamed from: cz1.k$a */
    public static final class C45233a extends C87413o implements C32224a<C45230i> {

        /* renamed from: d */
        public static final C45233a f122574d = new C45233a();

        public C45233a() {
            super(0);
        }

        public Object invoke() {
            return ((C53224d) C86312j.m106911c(C53224d.class)).zx0();
        }
    }

    /* renamed from: B */
    public Object mo70736B(String str) {
        C87412m.m108594g(str, "sessionId");
        return mo70744j0().mo70735jo(str);
    }

    /* renamed from: D */
    public C52389b.C52390a mo70737D(C72963f4 f4Var) {
        C68070l.C68072b u;
        C87412m.m108594g(f4Var, "latestMsg");
        PString pString = new PString();
        String str = null;
        if (f4Var.mo100973L3() && f4Var.mo108765s2() != null) {
            String s2 = f4Var.mo108765s2();
            if (s2 != null && s2.length() == 32) {
                str = ((C67309t0) C86312j.m106911c(C67309t0.class)).mo91188T(s2);
            }
            if (!Util.isNullOrNil(str)) {
                str = '[' + str + ']';
            } else {
                str = MMApplicationContext.getContext().getString(C0966R.string.f7957xf);
            }
        } else if (f4Var.mo101020w3() && (u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2())) != null && u.f195582i == 66) {
            str = u.f195570f;
        }
        if (str == null) {
            PString pString2 = new PString();
            PString pString3 = new PString();
            PInt pInt = new PInt();
            ((C28686o1) ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69741L()).getClass();
            C67379u.m79740d(f4Var, pString2, pString3, pInt, false);
            str = pString2.value;
        }
        pString.value = str;
        return new C52389b.C52390a(pString, new PString());
    }

    /* renamed from: O */
    public Object mo70738O(String str) {
        C87412m.m108594g(str, "sessionId");
        return ((C33484f) ((C36570n) this.f122571d).getValue()).mo59165jo(str);
    }

    /* renamed from: Q */
    public void mo70739Q(String str) {
        C87412m.m108594g(str, "sessionId");
        C7143c jo = mo70744j0().mo70735jo(str);
        Log.m105924i("GameLife.ConversationUpdateCallback", "[onConversationMsgEmpty] " + jo.systemRowid);
        if (jo.systemRowid > 0) {
            jo.field_digest = "";
            mo70744j0().update(jo.systemRowid, jo, false);
            mo70744j0().doNotify(jo.field_talker, 8, jo);
        }
    }

    /* renamed from: S */
    public void mo70740S(Object obj) {
        C7143c cVar = (C7143c) obj;
        C87412m.m108594g(cVar, "conversation");
        boolean z = cVar.systemRowid <= 0;
        if (z) {
            mo70744j0().insertNotify(cVar, false);
            mo70744j0().doNotify(MStorageEventData.EventType.SINGLE, 2, cVar);
        } else {
            mo70744j0().update(cVar.systemRowid, cVar, false);
            mo70744j0().doNotify(MStorageEventData.EventType.SINGLE, 1, cVar);
        }
        Log.m105924i("GameLife.ConversationUpdateCallback", "[updateGameLifeConversation] isNew=" + z + " conLastMsgId:" + this.f122573f + " sessionId=" + cVar.field_sessionId + " talker=" + cVar.field_talker + ' ' + C45231j.m50035a(cVar));
    }

    /* renamed from: a2 */
    public void mo54205a2(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        Log.m105924i("GameLife.ConversationUpdateCallback", "msgInfo = " + f4Var + ", conversation = " + h2Var + ", newCon = " + z + ", notifyInfo = " + eVar);
    }

    /* renamed from: d */
    public void mo70741d(Object obj, int i, C72963f4 f4Var) {
        C87412m.m108594g((C7143c) obj, "conversation");
        C87412m.m108594g(f4Var, "latestMsg");
    }

    /* renamed from: f0 */
    public boolean mo70742f0(String str) {
        C87412m.m108594g(str, "sessionId");
        return C72996z1.m85832c5(str);
    }

    /* renamed from: g0 */
    public Object mo70743g0(Object obj, Object obj2, C72963f4 f4Var, C52389b.C52390a aVar, int i, C75875l.C45886e eVar) {
        C7143c cVar = (C7143c) obj;
        C33478b bVar = (C33478b) obj2;
        C87412m.m108594g(cVar, "conv");
        C87412m.m108594g(bVar, "sessionInfo");
        C87412m.m108594g(f4Var, "lastMsgInfo");
        C87412m.m108594g(aVar, "digestData");
        C87412m.m108594g(eVar, "notifyInfo");
        String str = bVar.field_selfUserName;
        if (!(str == null || str.length() == 0)) {
            String str2 = bVar.field_talker;
            if (!(str2 == null || str2.length() == 0)) {
                this.f122573f = cVar.field_lastMsgID;
                cVar.field_digest = aVar.f146445a.value;
                cVar.field_updateTime = f4Var.getCreateTime();
                cVar.field_unReadCount += i;
                cVar.field_lastMsgID = f4Var.getMsgId();
                cVar.field_talker = bVar.field_talker;
                cVar.field_selfUserName = bVar.field_selfUserName;
                if (cVar.systemRowid <= 0) {
                    ((C15913g) C86312j.m106911c(C15913g.class)).C40(C64197v.m75537f(cVar.field_talker, cVar.field_selfUserName), C7149l.f25124a);
                } else if (C87412m.m108589b(eVar.f123845b, "delete")) {
                    Log.m105924i("GameLife.ConversationUpdateCallback", "[updateGameLifeConversation] delete msg");
                    if (eVar.f123850g == this.f122573f) {
                        mo70744j0().update(cVar.systemRowid, cVar, false);
                        mo70744j0().doNotify(MStorageEventData.EventType.SINGLE, 8, cVar);
                    }
                    return null;
                }
                ((C88274h0) C86312j.m106911c(C88274h0.class)).O30("Common_IPC_appid", new GameLifeOutputDataWrapper(bVar.getSessionId(), bVar.mo59157t(), bVar.mo59158t1()));
                return cVar;
            }
        }
        Log.m105920e("GameLife.ConversationUpdateCallback", "getSessionInfo invalid: " + bVar);
        return null;
    }

    /* renamed from: j0 */
    public final C45230i mo70744j0() {
        return (C45230i) ((C36570n) this.f122572e).getValue();
    }

    /* renamed from: k3 */
    public void mo54206k3(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
    }

    /* renamed from: q */
    public void mo70745q(Object obj, C72963f4 f4Var, C75875l.C45886e eVar) {
        C68070l.C68072b u;
        Map<String, String> map;
        C7143c cVar = (C7143c) obj;
        C87412m.m108594g(cVar, "conversation");
        C87412m.m108594g(eVar, "notifyInfo");
        ArrayList<C72963f4> arrayList = eVar.f123846c;
        if (arrayList != null) {
            Iterator<C72963f4> it = arrayList.iterator();
            while (it.hasNext()) {
                C72963f4 next = it.next();
                if (!(next == null || next.mo108769t2() == 1 || !next.mo101020w3() || (u = C68070l.C68072b.m80422u(next.getContent(), (String) null)) == null || (map = u.f195538V1) == null)) {
                    cVar.field_digestPrefix = map.get(LocaleUtil.getApplicationLanguage());
                }
            }
        }
        Log.m105924i("GameLife.ConversationUpdateCallback", "[beforeConvUpdate] notifyFunc:" + eVar.f123845b + " delId:" + eVar.f123850g);
    }
}
