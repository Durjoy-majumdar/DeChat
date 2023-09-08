package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.component.C73524l3;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C86493v0;
import hd0.C98408n0;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import jr2.C76442r;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C98201k;
import p663qo.C101213l;
import p680ru.C77569h;
import p682rz.C101491u;
import qg2.C101147j0;
import te3.C101834rc0;
import ub1.C78142a;

/* renamed from: com.tencent.mm.ui.chatting.n3 */
public class C73764n3<T> {

    /* renamed from: a */
    public String f216523a = "";

    /* renamed from: com.tencent.mm.ui.chatting.n3$a */
    public class C73765a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f216524d;

        /* renamed from: e */
        public final /* synthetic */ String f216525e;

        /* renamed from: f */
        public final /* synthetic */ HashSet f216526f;

        /* renamed from: g */
        public final /* synthetic */ Object f216527g;

        /* renamed from: h */
        public final /* synthetic */ C78142a f216528h;

        /* renamed from: com.tencent.mm.ui.chatting.n3$a$a */
        public class C73766a implements Runnable {
            public C73766a() {
            }

            public void run() {
                C73765a aVar = C73765a.this;
                C73764n3.this.mo102816d(aVar.f216527g, aVar.f216528h);
            }
        }

        public C73765a(C72963f4 f4Var, String str, HashSet hashSet, Object obj, C78142a aVar) {
            this.f216524d = f4Var;
            this.f216525e = str;
            this.f216526f = hashSet;
            this.f216527g = obj;
            this.f216528h = aVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            boolean z2;
            boolean z3 = true;
            if (i == 0 && dVar != null && dVar.field_retCode == 0) {
                Log.m105925i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl done msgId:%d, mediaId:%s, path:%s", Long.valueOf(this.f216524d.getMsgId()), str, this.f216525e);
                z2 = true;
            } else {
                z2 = false;
            }
            if (i == 0 && (dVar == null || dVar.field_retCode == 0)) {
                z3 = z2;
            } else {
                Object[] objArr = new Object[5];
                objArr[0] = Long.valueOf(this.f216524d.getMsgId());
                objArr[1] = str;
                objArr[2] = this.f216525e;
                objArr[3] = Integer.valueOf(i);
                objArr[4] = Integer.valueOf(dVar == null ? 0 : dVar.field_retCode);
                Log.m105921e("MicroMsg.FavMsgHandle", "oreh downloadTpUrl error msgId:%d, mediaId:%s, path:%s, err:(%d,%d)", objArr);
            }
            if (!z3) {
                return 0;
            }
            this.f216526f.remove(str);
            if (this.f216526f.isEmpty()) {
                new MMHandler(Looper.getMainLooper()).post(new C73766a());
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1.getContent(), (java.lang.String) null);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m87369a(com.tencent.p014mm.storage.C72963f4 r1) {
        /*
            if (r1 == 0) goto L_0x001b
            boolean r0 = r1.mo101020w3()
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r1.getContent()
            r0 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r0)
            if (r1 == 0) goto L_0x001b
            int r1 = r1.f195582i
            r0 = 40
            if (r1 != r0) goto L_0x001b
            r1 = 0
            return r1
        L_0x001b:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73764n3.m87369a(com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: b */
    public static boolean m87370b(C72963f4 f4Var) {
        C80995a aVar;
        if (f4Var == null) {
            return true;
        }
        if (!C72996z1.m85843n5(f4Var.mo108768t()) && !C72996z1.m85843n5(C75604z3.m90847s(f4Var.getContent()))) {
            return true;
        }
        if (f4Var.mo101020w3() || f4Var.mo101023z3()) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null) {
                return true;
            }
            int i = u.f195582i;
            if (i == 74) {
                return false;
            }
            if (i != 6 || Util.isNullOrNil(u.f195650z)) {
                int i2 = u.f195582i;
                if (i2 == 19) {
                    Iterator<C101834rc0> it = C101147j0.m132643x(u.f195571f0).f227155f.iterator();
                    while (it.hasNext()) {
                        C101834rc0 next = it.next();
                        String q = C101147j0.m132636q(next, f4Var.getMsgId(), 1);
                        if (!Util.isNullOrNil(next.f299342z1) && !C86013q1.m106450k(q)) {
                            return false;
                        }
                        String D = C101147j0.m132611D(next, f4Var.getMsgId(), 1);
                        if (!Util.isNullOrNil(next.f299334w1) && !C86013q1.m106450k(D)) {
                            return false;
                        }
                    }
                } else if (i2 == 48 && ((aVar = (C80995a) u.mo93555w(C80995a.class)) == null || Util.isNullOrNil(aVar.f237888E) || Util.isNullOrNil(aVar.f237890G))) {
                    Log.m105928w("MicroMsg.FavMsgHandle", "hy: can not fav or retransmit because of not having remote url");
                    return false;
                }
            } else {
                C72683d k = C72695v.m85069k(f4Var, u.f195606o);
                if (k != null && (!C86013q1.m106450k(k.field_fileFullPath) || C86013q1.m106451l(k.field_fileFullPath) != k.field_totalLen)) {
                    return false;
                }
            }
        }
        if (f4Var.mo100979R3()) {
            C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
            int i3 = NQ.f267376c;
            int i4 = NQ.f267377d;
            if (!(i3 >= i4 && i4 != 0)) {
                return false;
            }
        }
        if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
            if (!(Zd == null || Zd.f288562i == 199)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void mo102815c(T t, C78142a aVar, String str, String str2, String str3, String str4, String str5, C72963f4 f4Var, HashSet<String> hashSet) {
        String str6 = str4;
        String str7 = str5;
        Log.m105925i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl msgId:%d, mediaId:%s, path:%s", Long.valueOf(f4Var.getMsgId()), str7, str6);
        hashSet.add(str7);
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_FavMsgHandle_1";
        gVar.field_fileType = 19;
        gVar.field_authKey = str3;
        gVar.field_aesKey = str2;
        gVar.f287672s = str;
        gVar.field_fullpath = C86013q1.m106448i(str6, false);
        gVar.field_mediaId = str7;
        gVar.f287662f = new C73765a(f4Var, str6, hashSet, t, aVar);
        if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar)) {
            Log.m105920e("MicroMsg.FavMsgHandle", "recv openim record, add task failed");
        }
    }

    /* renamed from: d */
    public final void mo102816d(T t, C78142a aVar) {
        Class cls = C77569h.class;
        String str = "";
        this.f216523a = str;
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C96787m0.m124256j(doFavoriteEvent, aVar.f228992d);
        if (t instanceof MMFragment) {
            doFavoriteEvent.f264674d.f264685j = (MMFragment) t;
        } else if (t instanceof Activity) {
            doFavoriteEvent.f264674d.f264684i = (Activity) t;
        }
        doFavoriteEvent.f264674d.f264688m = 43;
        doFavoriteEvent.publish();
        if (doFavoriteEvent.f264675e.f9046a == 0) {
            if (aVar.f228992d.mo101020w3()) {
                C72963f4 f4Var = aVar.f228992d;
                ((C77569h) C86312j.m106911c(cls)).mo35238ci(f4Var, C40339m.m43520a(f4Var));
            } else {
                ((C77569h) C86312j.m106911c(cls)).mo35241nt(aVar.f228992d);
            }
            if (aVar.f228992d.mo101020w3() || aVar.f228992d.mo100967F3()) {
                String a = C86493v0.m107223a(str + aVar.f228992d.mo108774y2());
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                c.mo120962i("prePublishId", "msg_" + aVar.f228992d.mo108774y2());
                c.mo120962i("preUsername", C74023i.m87890t(aVar.f228992d, aVar.f228990b, aVar.f228989a));
                c.mo120962i("preChatName", aVar.f228991c);
                c.mo120962i("preMsgIndex", 0);
                c.mo120962i("sendAppMsgScene", 1);
                ((C76442r) C86312j.m106911c(C76442r.class)).mo106656pL("adExtStr", c, aVar.f228992d);
                doFavoriteEvent.f264674d.f264683h = a;
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(aVar.f228992d.getContent()), (String) null);
            if (!(u == null || u.f195582i != 5 || u.f195586j == null)) {
                long nowSecond = Util.nowSecond();
                Log.m105919d("MicroMsg.FavMsgHandle", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, u.f195586j, Long.valueOf(nowSecond), 2, 2, 1);
                try {
                    str = URLEncoder.encode(u.f195586j, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicroMsg.FavMsgHandle", e, str, new Object[0]);
                }
                C115669n.INSTANCE.mo160131h(13378, str, Long.valueOf(nowSecond), 2, 2, 1);
            }
            C78142a.C78143a aVar2 = aVar.f228993e;
            if (aVar2 != null) {
                ((C73524l3) aVar2).f215974a.f215752d.mo91578s();
            }
            C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Samll, aVar.f228992d, 0);
        }
    }
}
