package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C44858d2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57739b2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57749f3;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57767j1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57772k1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57787r1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57791s1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57801x1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73940c2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73958e0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73984f6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73995g6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74015h2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74038i2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74071j2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74126n0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74134n3;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74162p0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74310y2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74316y6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C85824q3;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderFeed;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderProduct;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u8 */
public class C74272u8 {

    /* renamed from: a */
    public static final List<C74023i> f218154a;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u8$a */
    public class C74273a extends C74059i7.C74061b {
        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if ((65535 & i) == 49) {
                return false;
            }
            Log.m105929w("MicroMsg.Chatting.ItemFactory", "unfound msgType:%d, isSender:%b", Integer.valueOf(i), Boolean.valueOf(z));
            return z;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u8$b */
    public class C74274b extends C74059i7.C74060a {
        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if ((65535 & i) == 49) {
                return false;
            }
            Log.m105929w("MicroMsg.Chatting.ItemFactory", "unfound msgType:%d, isSender:%b", Integer.valueOf(i), Boolean.valueOf(z));
            return !z;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f218154a = arrayList;
        arrayList.add(new C74059i7.C74061b());
        arrayList.add(new C74059i7.C74060a());
        arrayList.add(new C74001h1.C74010c());
        arrayList.add(new C74001h1.C74008b());
        arrayList.add(new C74244u.C74261g());
        arrayList.add(new C74244u.C74260f());
        arrayList.add(new C74071j2.C74074c());
        arrayList.add(new C74071j2.C74073b());
        arrayList.add(new C74114m3());
        arrayList.add(new C74098l3());
        arrayList.add(new C74038i2.C74049d());
        arrayList.add(new C74038i2.C74041c());
        arrayList.add(new C74220t2());
        arrayList.add(new C74202s2());
        arrayList.add(new C73990g1());
        arrayList.add(new C73982f1());
        arrayList.add(new C74310y2.C74312c());
        arrayList.add(new C74310y2.C74311b());
        arrayList.add(new C73953d7());
        arrayList.add(new C74152o6.C74155b());
        arrayList.add(new C74327z5());
        arrayList.add(new C74315y5());
        arrayList.add(new C74177q7.C74180c());
        arrayList.add(new C74177q7.C74186d());
        arrayList.add(new C74234t6());
        arrayList.add(new C74115m4.C74118c());
        arrayList.add(new C74115m4.C74117b());
        arrayList.add(new C73952d6());
        arrayList.add(new C74087k7());
        arrayList.add(new C74077j7());
        arrayList.add(new C74176q6());
        arrayList.add(new C74168p6());
        arrayList.add(new C73937b8());
        arrayList.add(new C74322y7());
        arrayList.add(new C73947c8());
        arrayList.add(new C19762b4());
        arrayList.add(new C74329z7());
        arrayList.add(new C73928a8());
        arrayList.add(new C74281v7());
        arrayList.add(new C74235t7());
        arrayList.add(new C74269u7());
        arrayList.add(new C74328z6());
        arrayList.add(new C73927a7());
        arrayList.add(new C74079j8());
        arrayList.add(new C74069i8());
        arrayList.add(new ChattingItemDyeingTemplate());
        arrayList.add(new C57761h6());
        arrayList.add(new C74103m());
        arrayList.add(new C74166p2());
        arrayList.add(new C74173q2());
        arrayList.add(new C74085k6());
        arrayList.add(new C74121m6());
        arrayList.add(new C74141n6());
        arrayList.add(new C57749f3.C57753c());
        arrayList.add(new C57749f3.C57752b());
        arrayList.add(new C74090l0.C74093c());
        arrayList.add(new C74090l0.C74092b());
        arrayList.add(new C74325z0());
        arrayList.add(new C74309y0());
        arrayList.add(new C74201s0());
        arrayList.add(new C74192r0());
        arrayList.add(new C74276v0());
        arrayList.add(new C74262u0());
        arrayList.add(new C85824q3.C85828b());
        arrayList.add(new C85824q3.C85825a());
        arrayList.add(new C74134n3.C74136b());
        arrayList.add(new C74134n3.C74135a());
        arrayList.add(new C74133n2());
        arrayList.add(new C74113m2());
        arrayList.add(new C74152o6.C74153a());
        arrayList.add(new C74126n0.C74129c());
        arrayList.add(new C74126n0.C74128b());
        arrayList.add(new C74162p0.C74165c());
        arrayList.add(new C74162p0.C74164b());
        arrayList.add(new C73939c1());
        arrayList.add(new C85839z2());
        arrayList.add(new ChattingItemAppMsgFinderFeed.C57721b());
        arrayList.add(new ChattingItemAppMsgFinderFeed.C57723c());
        arrayList.add(new ChattingItemAppMsgMegaVideo$$c());
        arrayList.add(new ChattingItemAppMsgMegaVideo$$d());
        arrayList.add(new C57739b2.C57741b());
        arrayList.add(new C57739b2.C57742c());
        arrayList.add(new C57767j1.C57769b());
        arrayList.add(new C57767j1.C57770c());
        arrayList.add(new C57787r1.C57789b());
        arrayList.add(new C57787r1.C57790c());
        arrayList.add(new C57772k1.C57774b());
        arrayList.add(new C57772k1.C57776c());
        arrayList.add(new C74112m1());
        arrayList.add(new C74132n1());
        arrayList.add(new C57791s1.C57793b());
        arrayList.add(new C57791s1.C57794c());
        arrayList.add(new ChatingItemAppMsgFinderLiveFeed.C57709b());
        arrayList.add(new ChatingItemAppMsgFinderLiveFeed.C57711c());
        arrayList.add(new ChattingItemAppMsgFinderProduct.C57725a());
        arrayList.add(new ChattingItemAppMsgFinderProduct.C57726b());
        arrayList.add(new C57795t1());
        arrayList.add(new C57797u1());
        arrayList.add(new ChattingItemAppMsgFinderShopWindow.C57731a());
        arrayList.add(new ChattingItemAppMsgFinderShopWindow.C57732b());
        arrayList.add(new C57758h3());
        arrayList.add(new C57764i3());
        arrayList.add(new C44858d2.C44860b());
        arrayList.add(new C44858d2.C44861c());
        arrayList.add(new C73921a3());
        arrayList.add(new C73992g3());
        arrayList.add(new C74285w0());
        arrayList.add(new C57784o1());
        arrayList.add(new C57785p1());
        arrayList.add(new C57801x1.C57803b());
        arrayList.add(new C57801x1.C57804c());
        arrayList.add(new C74316y6.C74319c());
        arrayList.add(new C74316y6.C74320d());
        arrayList.add(new C73984f6.C73985a());
        arrayList.add(new C73984f6.C73986b());
        arrayList.add(new C73995g6.C73996a());
        arrayList.add(new C73995g6.C73997b());
        arrayList.add(new C73940c2.C73942b());
        arrayList.add(new C73940c2.C73943c());
        arrayList.add(new C73958e0.C73965d());
        arrayList.add(new C73958e0.C73966e());
        arrayList.add(new C74015h2.C74017b());
        arrayList.add(new C74015h2.C74018c());
        arrayList.add(new C74273a());
        arrayList.add(new C74274b());
    }

    /* renamed from: a */
    public static C74023i m88589a(C72963f4 f4Var) {
        C74023i iVar;
        int c = m88591c(f4Var);
        Iterator it = ((ArrayList) f218154a).iterator();
        while (true) {
            int i = 0;
            boolean z = true;
            if (it.hasNext()) {
                iVar = (C74023i) it.next();
                if (f4Var.mo108769t2() != 1) {
                    z = false;
                }
                if (iVar.mo26238k0(c, z)) {
                    try {
                        if (f4Var.mo101020w3()) {
                            if (!(iVar instanceof C74059i7.C74060a)) {
                                if (!(iVar instanceof C74059i7.C74061b)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Chatting.ItemFactory", e, "", new Object[0]);
                    }
                }
            } else {
                if (f4Var.mo101020w3()) {
                    while (true) {
                        List<C74023i> list = f218154a;
                        if (i >= ((ArrayList) list).size()) {
                            break;
                        } else if (f4Var.mo108769t2() == 1 && (((ArrayList) list).get(i) instanceof C74244u.C74261g)) {
                            return new C74244u.C74261g();
                        } else {
                            if (f4Var.mo108769t2() == 0 && (((ArrayList) list).get(i) instanceof C74244u.C74260f)) {
                                return new C74244u.C74260f();
                            }
                            i++;
                        }
                    }
                }
                return new C74059i7.C74060a();
            }
        }
        return (C74023i) iVar.getClass().newInstance();
    }

    /* renamed from: b */
    public static int m88590b(C72963f4 f4Var) {
        if (f4Var.getType() == 49) {
            int l = C72695v.m85070l(C68070l.C68072b.m80422u(f4Var.getContent(), (String) null));
            Log.m105919d("MicroMsg.Chatting.ItemFactory", "maybe honeypay need change type: %s", Integer.valueOf(l));
            if (!(l == 49 || l == 1090519089)) {
                f4Var.setType(l);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            }
        }
        int c = m88591c(f4Var);
        int i = 0;
        while (true) {
            List<C74023i> list = f218154a;
            if (i < ((ArrayList) list).size()) {
                if (((C74023i) ((ArrayList) list).get(i)).mo26238k0(c, f4Var.mo108769t2() == 1)) {
                    return i;
                }
                i++;
            } else {
                if (f4Var.mo101020w3()) {
                    int i2 = 0;
                    while (true) {
                        List<C74023i> list2 = f218154a;
                        if (i2 >= ((ArrayList) list2).size()) {
                            break;
                        } else if (f4Var.mo108769t2() == 1 && (((ArrayList) list2).get(i2) instanceof C74244u.C74261g)) {
                            return i2;
                        } else {
                            if (f4Var.mo108769t2() == 0 && (((ArrayList) list2).get(i2) instanceof C74244u.C74260f)) {
                                return i2;
                            }
                            i2++;
                        }
                    }
                }
                return 0;
            }
        }
    }

    /* renamed from: c */
    public static int m88591c(C72963f4 f4Var) {
        C68070l.C68072b u;
        int type = f4Var.getType();
        if (f4Var.getType() != 49 || (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) == null) {
            return type;
        }
        int i = u.f195582i;
        if (i == 74) {
            Log.m105925i("MicroMsg.Chatting.ItemFactory", "createItem %s %s %s", Long.valueOf(f4Var.getMsgId()), Integer.valueOf(type), Integer.valueOf(u.f195582i));
            return 1090519089;
        } else if (i != 91) {
            return type;
        } else {
            Log.m105925i("MicroMsg.Chatting.ItemFactory", "createItem %s %s %s", Long.valueOf(f4Var.getMsgId()), Integer.valueOf(type), Integer.valueOf(u.f195582i));
            return 91;
        }
    }

    /* renamed from: d */
    public static C74023i m88592d(int i) {
        List<C74023i> list = f218154a;
        if (i >= ((ArrayList) list).size()) {
            return null;
        }
        try {
            return (C74023i) ((ArrayList) list).get(i);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.Chatting.ItemFactory", th, "", new Object[0]);
            return null;
        }
    }
}
