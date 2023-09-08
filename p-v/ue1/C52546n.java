package ue1;

import bd1.C54446b;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2469j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58784w3;
import f40.C86709a0;
import f62.C27049a1;
import f62.C75700k0;
import fy3.C32224a;
import g62.C75875l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46111l4;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ty0.C52389b;
import up1.C52593j;
import up1.C52598k;
import up1.C52599l0;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: ue1.n */
public final class C52546n extends C52389b<C37429f0, C52528f> implements C27049a1 {

    /* renamed from: d */
    public final C13601g f146759d = C36568h.m40985a(C37433a.f98940d);

    /* renamed from: e */
    public final C13601g f146760e = C36568h.m40985a(C52547b.f146761d);

    /* renamed from: ue1.n$a */
    public static final class C37433a extends C87413o implements C32224a<C52599l0> {

        /* renamed from: d */
        public static final C37433a f98940d = new C37433a();

        public C37433a() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au();
        }
    }

    /* renamed from: ue1.n$b */
    public static final class C52547b extends C87413o implements C32224a<C52593j> {

        /* renamed from: d */
        public static final C52547b f146761d = new C52547b();

        public C52547b() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4();
        }
    }

    public C52546n() {
        C61926c.m72656A((String) null, new C52545m(this, C66785b.f191882e.mo90662O5()));
    }

    /* renamed from: B */
    public Object mo70736B(String str) {
        C87412m.m108594g(str, "sessionId");
        return mo73493t0().get(str);
    }

    /* renamed from: O */
    public Object mo70738O(String str) {
        C87412m.m108594g(str, "sessionId");
        return ((C52599l0) ((C36570n) this.f146759d).getValue()).mo71553G2(str);
    }

    /* renamed from: Q */
    public void mo70739Q(String str) {
        C87412m.m108594g(str, "sessionId");
        C52528f fVar = mo73493t0().get(str);
        Log.m105924i("Finder.ConversationUpdater", "[onConversationMsgEmpty] " + fVar.systemRowid);
        if (fVar.systemRowid > 0) {
            fVar.field_digest = "";
            mo73493t0().update(fVar.systemRowid, fVar, false);
            mo73493t0().doNotify(fVar.field_sessionId, 1, fVar);
        }
    }

    /* renamed from: S */
    public void mo70740S(Object obj) {
        C52528f fVar = (C52528f) obj;
        C87412m.m108594g(fVar, "conversation");
        if (fVar.systemRowid <= 0) {
            mo73493t0().insertNotify(fVar, false);
            mo73493t0().doNotify(fVar.field_sessionId, 2, fVar);
            return;
        }
        mo73493t0().update(fVar.systemRowid, fVar, false);
        mo73493t0().doNotify(fVar.field_sessionId, 1, fVar);
    }

    /* renamed from: d */
    public void mo70741d(Object obj, int i, C72963f4 f4Var) {
        C52528f fVar = (C52528f) obj;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(fVar, "conv");
        C87412m.m108594g(f4Var, "latestMsg");
        int i2 = fVar.field_scene;
        if (i2 == 1) {
            int i3 = fVar.field_type;
            if (i3 != 2) {
                if (i3 == 3) {
                    mo73491j0();
                    C52528f fVar2 = mo73493t0().get("finderaliassessionholder");
                    fVar2.field_digest = fVar.field_digest;
                    fVar2.field_readStatus = 0;
                    fVar2.field_unReadCount += i;
                    fVar2.field_updateTime = fVar.field_updateTime;
                    mo73493t0().update(fVar2.systemRowid, fVar2, false);
                    if (i > 0) {
                        C2469j jVar = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c;
                        jVar.f12931c.removeMessages(3);
                        jVar.f12931c.sendEmptyMessage(3);
                    }
                }
            } else if (i > 0) {
                if (f4Var.mo108769t2() == 0) {
                    C2469j jVar2 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c;
                    String str = fVar.field_sessionId;
                    C87412m.m108593f(str, "conv.field_sessionId");
                    jVar2.getClass();
                    jVar2.f12930b = str;
                }
                C2469j jVar3 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c;
                jVar3.f12931c.removeMessages(3);
                jVar3.f12931c.sendEmptyMessage(3);
            }
        } else if (i2 == 2) {
            int i4 = fVar.field_type;
            if (i4 == 1) {
                if (i > 0 && C72996z1.m85817T4(fVar.field_senderUserName)) {
                    C58784w3 w3Var = C58784w3.f168295a;
                    String str2 = fVar.field_senderUserName;
                    C87412m.m108593f(str2, "conv.field_senderUserName");
                    if (w3Var.mo83912Y0(str2)) {
                        C2469j jVar4 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c;
                        jVar4.f12931c.removeMessages(2);
                        jVar4.f12931c.sendEmptyMessage(2);
                    }
                }
                String str3 = fVar.field_senderUserName;
                C87412m.m108593f(str3, "conv.field_senderUserName");
                mo73492n0(str3);
                C52528f fVar3 = mo73493t0().get("findersayhisessionholder");
                fVar3.field_digest = fVar.field_digest;
                fVar3.field_readStatus = 0;
                fVar3.field_unReadCount += i;
                fVar3.field_updateTime = fVar.field_updateTime;
                mo73493t0().update(fVar3.systemRowid, fVar3, false);
            } else if (i4 == 2 && i > 0 && C72996z1.m85817T4(fVar.field_senderUserName)) {
                C58784w3 w3Var2 = C58784w3.f168295a;
                String str4 = fVar.field_senderUserName;
                C87412m.m108593f(str4, "conv.field_senderUserName");
                if (w3Var2.mo83912Y0(str4)) {
                    C2469j jVar5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c;
                    String str5 = fVar.field_senderUserName;
                    C87412m.m108593f(str5, "conv.field_senderUserName");
                    jVar5.mo2443e(str5);
                }
            }
        }
    }

    /* renamed from: f0 */
    public boolean mo70742f0(String str) {
        C87412m.m108594g(str, "sessionId");
        return C72996z1.m85825X4(str);
    }

    /* renamed from: g0 */
    public Object mo70743g0(Object obj, Object obj2, C72963f4 f4Var, C52389b.C52390a aVar, int i, C75875l.C45886e eVar) {
        String str;
        String str2;
        int i2;
        String str3;
        C52389b.C52390a aVar2 = aVar;
        int i3 = i;
        C52528f fVar = (C52528f) obj;
        C37429f0 f0Var = (C37429f0) obj2;
        C87412m.m108594g(fVar, "conv");
        C87412m.m108594g(f0Var, "sessionInfo");
        C87412m.m108594g(f4Var, "lastMsgInfo");
        C87412m.m108594g(aVar2, "digestData");
        C87412m.m108594g(eVar, "notifyInfo");
        String str4 = f0Var.field_sessionId;
        String str5 = f0Var.field_talker;
        int i4 = f0Var.field_type;
        int i5 = f0Var.field_actionPermission;
        int i6 = f0Var.field_rejectMsg;
        int i7 = f0Var.field_disableSendMsg;
        String str6 = f0Var.field_senderUserName;
        int i8 = f0Var.field_senderRoleType;
        int i9 = f0Var.field_followFlag;
        if (i4 != 1 || (f4Var.mo108769t2() != 1 && !C87412m.m108589b(str6, C75592q0.m90789s()))) {
            str3 = "Finder.ConversationUpdater";
            i2 = i8;
            str = str6;
            str2 = str5;
        } else {
            C87412m.m108593f(str4, "sessionId");
            C87412m.m108593f(str5, "talker");
            C46111l4.C33059a aVar3 = C46111l4.C33059a.SELF_REPLY;
            C87412m.m108593f(str6, "senderUserName");
            str3 = "Finder.ConversationUpdater";
            i2 = i8;
            str = str6;
            str2 = str5;
            ((C52599l0) ((C36570n) this.f146759d).getValue()).mo73558Yt(str4, str5, 2, 1, aVar3, i6, i7, str6, i9);
            Log.m105924i(str3, "[updateFinderConversation] change type to normal. sessionId=" + str4);
            i4 = 2;
            i5 = 1;
        }
        int i15 = 0;
        boolean z = fVar.systemRowid <= 0;
        int i16 = fVar.field_unReadCount;
        fVar.field_digest = aVar2.f146445a.value;
        fVar.field_digestUser = aVar2.f146446b.value;
        fVar.field_updateTime = f4Var.getCreateTime();
        fVar.field_digestType = String.valueOf(f4Var.getType());
        fVar.field_unReadCount += i3;
        fVar.field_lastMsgID = f4Var.getMsgId();
        fVar.field_isSend = f4Var.mo108769t2();
        fVar.field_status = f4Var.getStatus();
        String str7 = str2;
        fVar.field_talker = str7;
        fVar.field_type = i4;
        fVar.field_actionPermission = i5;
        String str8 = str;
        fVar.field_senderUserName = str8;
        fVar.field_senderRoleType = i2;
        fVar.field_scene = (!C72996z1.m85817T4(str7) || (!C87412m.m108589b(str8, C75592q0.m90789s()) && !C87412m.m108589b(str8, C75592q0.m90782l()))) ? 2 : 1;
        fVar.field_readStatus = 0;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        if (c != null) {
            i15 = c.field_username_history_version;
        }
        fVar.field_senderUserNameVersion = i15;
        fVar.field_followFlag = i9;
        Log.m105924i(str3, "[updateFinderConversation] isNew=" + z + " beforeUnreadCount=" + i16 + " insertCount=" + i3 + ' ' + C52598k.m58934a(fVar));
        return fVar;
    }

    /* renamed from: j0 */
    public final void mo73491j0() {
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        LinkedList linkedList = new LinkedList();
        linkedList.add("finderaliassessionholder");
        ((C44660i2) Ku).mo69767h(linkedList);
        C52528f fVar = mo73493t0().get("finderaliassessionholder");
        if (fVar.systemRowid < 0) {
            C52528f a = C52593j.f146894e.mo73554a();
            a.field_sessionId = "finderaliassessionholder";
            a.field_talker = "finderaliassessionholder";
            a.field_type = 200;
            a.field_scene = 1;
            a.field_unReadCount = mo73493t0().mo73553qq(1, 3, "");
            mo73493t0().insert(a);
        }
        Log.m105924i("Finder.ConversationUpdater", "[checkInsertHolder] " + C52598k.m58934a(fVar));
    }

    /* renamed from: n0 */
    public final void mo73492n0(String str) {
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        LinkedList linkedList = new LinkedList();
        linkedList.add("findersessionholder");
        ((C44660i2) Ku).mo69767h(linkedList);
        C52528f fVar = mo73493t0().get("findersayhisessionholder");
        if (fVar.systemRowid < 0) {
            C52528f a = C52593j.f146894e.mo73554a();
            a.field_sessionId = "findersayhisessionholder";
            a.field_talker = "findersayhisessionholder";
            a.field_placedFlag = 1000;
            a.field_type = 100;
            a.field_scene = 2;
            a.field_senderUserName = str;
            a.field_unReadCount = mo73493t0().mo73553qq(2, 1, str);
            mo73493t0().insert(a);
        }
        Log.m105924i("Finder.ConversationUpdater", "[checkInsertHolder] " + C52598k.m58934a(fVar));
    }

    /* renamed from: q */
    public void mo70745q(Object obj, C72963f4 f4Var, C75875l.C45886e eVar) {
        C87412m.m108594g((C52528f) obj, "conversation");
        C87412m.m108594g(eVar, "notifyInfo");
    }

    /* renamed from: t0 */
    public final C52593j mo73493t0() {
        return (C52593j) this.f146760e.getValue();
    }
}
