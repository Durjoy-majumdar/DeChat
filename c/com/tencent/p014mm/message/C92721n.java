package com.tencent.p014mm.message;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import gw0.C76073b;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import nj3.C76912y0;
import p1081gi.C98121d;
import p196ln.C76706g;
import p823sg.C101611g;
import p823sg.C101614i;
import s90.C48300n;
import s90.C77627f;
import s90.C77629i;
import s90.C77630j;
import te3.C101755ad0;
import te3.C101756ae0;

/* renamed from: com.tencent.mm.message.n */
public class C92721n {

    /* renamed from: a */
    public static final C101611g<Long, C77629i> f266840a = new C101614i(50);

    /* renamed from: b */
    public static final ConcurrentHashMap<Long, Integer> f266841b = new ConcurrentHashMap<>(50);

    /* renamed from: a */
    public static String m116873a(String str, int i, int i2, int i3) {
        return m116875c(str, i, i2, i3, (C19623o0) null, "", -1);
    }

    /* renamed from: b */
    public static String m116874b(String str, int i, int i2, int i3, C19623o0 o0Var) {
        return m116875c(str, i, i2, i3, o0Var, "", -1);
    }

    /* renamed from: c */
    public static String m116875c(String str, int i, int i2, int i3, C19623o0 o0Var, String str2, int i4) {
        String str3;
        String str4;
        boolean z;
        boolean z2;
        String str5 = str;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (!((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(str5)) {
            return str5;
        }
        int i9 = C19636w0.f55626c;
        if (i9 <= 0 && i6 < 0 && i5 < 0 && i7 <= 0) {
            return str5;
        }
        int indexOf = str5.indexOf("#");
        boolean z3 = false;
        if (indexOf > 0) {
            str3 = str5.substring(0, indexOf);
            str4 = str5.substring(indexOf);
        } else {
            str3 = str5;
            str4 = "";
        }
        boolean z4 = true;
        if (!str5.contains("?")) {
            str3 = str3 + "?";
            z = true;
        } else {
            z = false;
        }
        if (o0Var != null && (o0Var.mo25758F2() || o0Var.mo25759G2())) {
            z3 = true;
        }
        if (z3) {
            z4 = !str3.contains("&scene=");
            z2 = true ^ str3.contains("&subscene=");
        } else {
            z2 = true;
        }
        if (i5 >= 0 && z4) {
            str3 = str3.replaceAll("(&scene=[\\d]*)", "").replaceAll("(\\?scene=[\\d]*)", "?") + "&scene=" + i5;
        }
        if (i6 >= 0 && z2) {
            str3 = str3.replaceAll("(&subscene=[\\d]*)", "").replaceAll("(\\?subscene=[\\d]*)", "?") + "&subscene=" + i6;
        }
        if (i9 > 0) {
            str3 = str3 + "&sessionid=" + i9;
        }
        if (i8 >= 0) {
            str3 = str3 + "&flutter_pos=" + i8;
        }
        if (i7 > 0) {
            str3 = (str3 + "&clicktime=" + i7) + "&enterid=" + i7;
        }
        if (!Util.isNullOrNil(str2)) {
            str3 = str3 + "&search_click_id=" + str2;
        }
        if (z) {
            str3 = str3.replace("?&", "?");
        }
        return str3 + str4;
    }

    /* renamed from: d */
    public static String m116876d(int i) {
        if (i <= 0) {
            return null;
        }
        long j = (long) i;
        if (j >= 86400) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(j < 3600 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(Long.valueOf(j * 1000));
    }

    /* renamed from: e */
    public static C101755ad0 m116877e(C72963f4 f4Var, C101756ae0 ae02) {
        C68070l.C68072b u;
        C68065f fVar;
        if (f4Var == null || !f4Var.mo101020w3() || f4Var.mo100967F3() || (u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2())) == null || (fVar = (C68065f) u.mo93555w(C68065f.class)) == null) {
            return null;
        }
        if (fVar.f195417b == -1 && fVar.f195428m != 1) {
            return null;
        }
        C101755ad0 ad02 = new C101755ad0();
        ad02.f297849e = fVar.f195422g;
        ad02.f297848d = fVar.f195417b;
        ad02.f297862u = fVar.f195423h;
        ad02.f297854j = fVar.f195425j;
        ad02.f297850f = fVar.f195420e;
        ad02.f297851g = fVar.f195421f;
        ad02.f297853i = fVar.f195419d;
        ad02.f297852h = fVar.f195418c;
        ad02.f297859r = u.f195646y;
        ad02.f297855n = u.f195634v;
        ad02.f297856o = u.f195638w;
        ae02.mo141198r(u.f195570f);
        ae02.mo141194n(u.f195574g);
        return ad02;
    }

    /* renamed from: f */
    public static C101755ad0 m116878f(C77630j jVar, C101756ae0 ae02, String str, String str2) {
        if (jVar == null || jVar.f226333o == -1) {
            return null;
        }
        C101755ad0 ad02 = new C101755ad0();
        int i = jVar.f226333o;
        ad02.f297849e = i == 5 ? 1 : 0;
        ad02.f297848d = i;
        ad02.f297862u = jVar.f226317I;
        ad02.f297854j = jVar.f226315G;
        ad02.f297850f = jVar.f226313E;
        ad02.f297851g = jVar.f226314F;
        ad02.f297853i = jVar.f226335q;
        ad02.f297852h = (int) jVar.f226329h;
        ad02.f297855n = str;
        ad02.f297856o = str2;
        ad02.f297859r = jVar.f226330i;
        ae02.mo141198r(jVar.f226325d);
        ae02.mo141194n(jVar.f226332n);
        return ad02;
    }

    /* renamed from: g */
    public static C101755ad0 m116879g(C72963f4 f4Var) {
        C68070l.C68072b u;
        C68065f fVar;
        if (f4Var == null || !f4Var.mo100983V3() || (u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2())) == null || (fVar = (C68065f) u.mo93555w(C68065f.class)) == null || fVar.f195427l == null) {
            return null;
        }
        C101755ad0 ad02 = new C101755ad0();
        ad02.f297855n = u.f195634v;
        ad02.f297856o = u.f195638w;
        C48300n nVar = fVar.f195427l;
        ad02.f297860s = nVar.f133366d;
        ad02.f297861t = nVar.f133367e;
        ad02.f297854j = nVar.f133368f;
        ad02.f297859r = nVar.f133370h;
        ad02.f297850f = nVar.f133372j;
        ad02.f297851g = nVar.f133373n;
        ad02.f297853i = nVar.f133371i;
        return ad02;
    }

    /* renamed from: h */
    public static int m116880h() {
        Context context = MMApplicationContext.getContext();
        if (!NetStatusUtil.isNetworkConnected(context)) {
            return 100;
        }
        if (NetStatusUtil.is2G(context)) {
            return 2;
        }
        if (NetStatusUtil.is3G(context)) {
            return 3;
        }
        if (NetStatusUtil.is4G(context)) {
            return 4;
        }
        if (NetStatusUtil.is5G(context)) {
            return 5;
        }
        return NetStatusUtil.isWifi(context) ? 1 : 0;
    }

    /* renamed from: i */
    public static String m116881i(Context context, int i, String str, String str2, long j) {
        C68097n Lo;
        if (context == null) {
            Log.m105928w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: context is null");
            return null;
        } else if (str == null || str2 == null) {
            Log.m105928w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: msg is null");
            return null;
        } else {
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92771j(context, (View) null);
                return null;
            }
            try {
                C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(j, str);
                LinkedList<C77630j> linkedList = JZ.f226295i;
                if (linkedList != null && linkedList.size() > 0 && i < linkedList.size()) {
                    C77630j jVar = linkedList.get(i);
                    C68070l.C68072b bVar = new C68070l.C68072b();
                    bVar.f195570f = jVar.f226325d;
                    bVar.f195574g = jVar.f226332n;
                    bVar.f195578h = "view";
                    bVar.f195582i = 5;
                    bVar.f195586j = jVar.f226326e;
                    bVar.f195634v = JZ.f226292f;
                    bVar.f195638w = JZ.f226293g;
                    bVar.f195642x = JZ.f226294h;
                    bVar.f195646y = m116882j(jVar);
                    C68065f fVar = new C68065f();
                    int i2 = jVar.f226333o;
                    fVar.f195417b = i2;
                    fVar.f195423h = jVar.f226317I;
                    if (i2 == 5 || i2 == 16) {
                        fVar.f195425j = jVar.f226315G;
                        fVar.f195418c = (int) jVar.f226329h;
                        fVar.f195419d = jVar.f226335q;
                        fVar.f195420e = jVar.f226313E;
                        fVar.f195421f = jVar.f226314F;
                    }
                    bVar.mo93545f(fVar);
                    if (Util.isNullOrNil(bVar.f195646y) && (Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str2)) != null) {
                        bVar.f195646y = Lo.mo93594c();
                    }
                    return C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppMsgBizHelper", e, "", new Object[0]);
                Log.m105921e("MicroMsg.AppMsgBizHelper", "retransmit app msg error : %s", e.getLocalizedMessage());
            }
            return null;
        }
    }

    /* renamed from: j */
    public static String m116882j(C77630j jVar) {
        int i = jVar.f226333o;
        return (i == 5 || i == 16) ? Util.isNullOrNil(jVar.f226330i) ? jVar.f226312D : jVar.f226330i : Util.isNullOrNil(jVar.f226312D) ? jVar.f226330i : jVar.f226312D;
    }

    /* renamed from: k */
    public static String m116883k(String str) {
        Map<String, String> decode = SemiXml.decode(str);
        if (decode == null) {
            decode = XmlParser.parseXml(str, "msg", (String) null);
        }
        if (decode == null) {
            C77629i iVar = new C77629i();
            StringBuilder sb = new StringBuilder("");
            Iterator<C77630j> it = iVar.f226295i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C77630j next = it.next();
                if (!Util.isNullOrNil(next.f226325d)) {
                    sb.append(next.f226325d);
                    break;
                }
            }
            return sb.toString();
        }
        String str2 = decode.get(".msg.appmsg.mmreader.category.item.title");
        return str2 == null ? "" : str2;
    }
}
