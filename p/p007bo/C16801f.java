package p007bo;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19615i1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.pigeon.BizPigeon;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gw0.C76073b;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import jw0.C9533e;
import jx0.C33702b;
import p227rn.C22240c0;
import rb0.C48009v0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s90.C77627f;
import s90.C77629i;
import s90.C77630j;
import z04.C112551y;

/* renamed from: bo.f */
public final class C16801f {

    /* renamed from: a */
    public static final C16801f f45399a = new C16801f();

    /* renamed from: b */
    public static final C13601g f45400b;

    /* renamed from: c */
    public static final C13601g f45401c = C36568h.m40985a(C16803b.f45406d);

    /* renamed from: d */
    public static final int f45402d;

    /* renamed from: e */
    public static final int f45403e;

    /* renamed from: f */
    public static Integer f45404f;

    /* renamed from: bo.f$a */
    public static final class C16802a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C16802a f45405d = new C16802a();

        public C16802a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: bo.f$b */
    public static final class C16803b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C16803b f45406d = new C16803b();

        public C16803b() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C33702b.f91166a.mo59262a());
        }
    }

    static {
        C13601g a = C36568h.m40985a(C16802a.f45405d);
        f45400b = a;
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) ((C36570n) a).getValue();
        C9533e eVar = C9533e.f29713a;
        int i = 1;
        f45402d = multiProcessMMKV.decodeInt("BizTimeLineOpenFlutter", !eVar.mo10211d() ? -1 : 1);
        MultiProcessMMKV multiProcessMMKV2 = (MultiProcessMMKV) ((C36570n) a).getValue();
        if (!eVar.mo10211d()) {
            i = -1;
        }
        f45403e = multiProcessMMKV2.decodeInt("BizTimeLineUserAff", i);
    }

    /* renamed from: a */
    public final BizPigeon.MassSendCardMsg mo17841a(C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
        BizPigeon.MassSendCardMsg massSendCardMsg = new BizPigeon.MassSendCardMsg();
        if (o0Var.mo25754B2()) {
            massSendCardMsg.setOrderId(Long.valueOf(o0Var.field_orderFlag));
            massSendCardMsg.setMsgId(Long.valueOf(o0Var.field_msgId));
            massSendCardMsg.setSvrId(Long.valueOf(o0Var.field_msgSvrId));
            String str = o0Var.field_talker;
            massSendCardMsg.setUserName(str);
            massSendCardMsg.setIsExpand(Boolean.valueOf(o0Var.field_isExpand));
            massSendCardMsg.setCreateTime(Long.valueOf(o0Var.field_createTime));
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            if (z1Var != null) {
                massSendCardMsg.setNickName(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str));
                massSendCardMsg.setIsPlaceTop(Boolean.valueOf(z1Var.mo62940x3()));
            }
            massSendCardMsg.setIsExposed(Boolean.valueOf(o0Var.field_isRead == 1));
            massSendCardMsg.setIsExpand(Boolean.valueOf(o0Var.field_isExpand));
            massSendCardMsg.setIsValidExposed(Boolean.valueOf(o0Var.field_isValidExposed));
            C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
            C87412m.m108592e(JZ, "null cannot be cast to non-null type com.tencent.mm.message.BizMMReader");
            massSendCardMsg.setItems(new LinkedList());
            massSendCardMsg.setIsBigPic(Boolean.valueOf(o0Var.mo25763m2(1)));
            LinkedList<C77630j> linkedList = ((C77629i) JZ).f226295i;
            if (linkedList != null) {
                for (C77630j jVar : linkedList) {
                    List<BizPigeon.MassSendCardMsgItem> items = massSendCardMsg.getItems();
                    if (items != null) {
                        BizPigeon.MassSendCardMsgItem massSendCardMsgItem = new BizPigeon.MassSendCardMsgItem();
                        massSendCardMsgItem.setTitle(jVar.f226325d);
                        massSendCardMsgItem.setUrl(jVar.f226326e);
                        massSendCardMsgItem.setUrlId(((C45696d) C86709a0.m107533q(C45696d.class)).mo70950A9(jVar.f226326e));
                        massSendCardMsgItem.setCover(jVar.f226330i);
                        massSendCardMsgItem.setCover_1_1(jVar.f226312D);
                        massSendCardMsgItem.setDigest(jVar.f226332n);
                        massSendCardMsgItem.setItemShowType(Long.valueOf((long) jVar.f226333o));
                        massSendCardMsgItem.setIsPaySubscribe(Boolean.valueOf(jVar.f226317I == 1));
                        massSendCardMsgItem.setPicNum(Long.valueOf((long) jVar.f226311C));
                        massSendCardMsgItem.setPlay_length(Long.valueOf((long) jVar.f226335q));
                        massSendCardMsgItem.setPlay_url(jVar.f226344z);
                        massSendCardMsgItem.setPlayer(jVar.f226309A);
                        massSendCardMsgItem.setTime(Long.valueOf(jVar.f226329h));
                        massSendCardMsgItem.setVid(jVar.f226315G);
                        massSendCardMsgItem.setVideoWidth(Long.valueOf((long) jVar.f226313E));
                        massSendCardMsgItem.setVideoHeight(Long.valueOf((long) jVar.f226314F));
                        items.add(massSendCardMsgItem);
                    }
                }
            }
        }
        return massSendCardMsg;
    }

    /* renamed from: b */
    public final BizPigeon.BizNotifyTipsInfo mo17842b() {
        C19623o0 kD;
        int SE = C48009v0.Kx0().mo25734SE();
        BizPigeon.BizNotifyTipsInfo bizNotifyTipsInfo = new BizPigeon.BizNotifyTipsInfo();
        if (SE > 0 && (kD = C48009v0.Kx0().mo25740kD()) != null) {
            bizNotifyTipsInfo.setMsgId(Long.valueOf(kD.field_msgId));
            if (kD.mo25757E2()) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(kD.field_talker);
                if (z1Var != null && z1Var.mo62927s3()) {
                    bizNotifyTipsInfo.setMsgCount(Long.valueOf((long) SE));
                    bizNotifyTipsInfo.setIsBizContact(Boolean.FALSE);
                    bizNotifyTipsInfo.setUserName(kD.field_talker);
                } else if (kD.mo25771u2() != null) {
                    bizNotifyTipsInfo.setMsgCount(Long.valueOf((long) SE));
                    bizNotifyTipsInfo.setIsBizContact(Boolean.FALSE);
                    bizNotifyTipsInfo.setCoverUrl(kD.mo25771u2().f55494d);
                }
            } else {
                boolean z = false;
                if (kD.mo25755C2()) {
                    String j = C19615i1.m21063j(kD);
                    String c = C19615i1.m21056c(kD);
                    if (!C112551y.m153811k(c)) {
                        bizNotifyTipsInfo.setMsgCount(Long.valueOf((long) SE));
                        bizNotifyTipsInfo.setCoverUrl(c);
                        bizNotifyTipsInfo.setIsBizContact(Boolean.FALSE);
                    } else if (!C112551y.m153811k(j)) {
                        boolean C = C45628s0.m50738C(j);
                        bizNotifyTipsInfo.setMsgCount(Long.valueOf((long) SE));
                        bizNotifyTipsInfo.setUserName(j);
                        bizNotifyTipsInfo.setIsBizContact(Boolean.valueOf(C));
                    }
                } else {
                    String str = kD.field_talker;
                    boolean C2 = C45628s0.m50738C(str);
                    if (str == null || C112551y.m153811k(str)) {
                        z = true;
                    }
                    if (!z) {
                        bizNotifyTipsInfo.setMsgCount(Long.valueOf((long) SE));
                        bizNotifyTipsInfo.setUserName(str);
                        bizNotifyTipsInfo.setIsBizContact(Boolean.valueOf(C2));
                    }
                }
            }
            long j2 = kD.field_msgId;
            C19636w0.f55625b = j2;
            MMApplicationContext.getDefaultPreference().edit().putLong("biz_time_line_last_notify_msg_id", j2).apply();
        }
        bizNotifyTipsInfo.setUserName(Util.nullAsNil(bizNotifyTipsInfo.getUserName()));
        return bizNotifyTipsInfo;
    }

    /* renamed from: c */
    public final BizPigeon.ContactInfo mo17843c(String str) {
        C87412m.m108594g(str, "userName");
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        BizPigeon.ContactInfo contactInfo = new BizPigeon.ContactInfo();
        contactInfo.setUserName(str);
        if (z1Var != null) {
            contactInfo.setIsContact(Boolean.valueOf(z1Var.mo62927s3()));
            contactInfo.setIsPlaceTop(Boolean.valueOf(z1Var.mo62940x3()));
            contactInfo.setNickName(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str));
        } else {
            Boolean bool = Boolean.FALSE;
            contactInfo.setIsContact(bool);
            contactInfo.setIsPlaceTop(bool);
        }
        return contactInfo;
    }

    /* renamed from: d */
    public final int mo17844d() {
        if (f45404f == null) {
            f45404f = Integer.valueOf(((MultiProcessMMKV) ((C36570n) f45400b).getValue()).decodeInt("BizResortV2ControlFlag", 0));
        }
        Integer num = f45404f;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo17845e() {
        return ((C22240c0) C86312j.m106911c(C22240c0.class)).mo35407eG();
    }
}
