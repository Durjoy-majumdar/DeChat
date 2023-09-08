package com.tencent.p014mm.plugin.wear.model;

import a70.C112760b;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import i61.C98602h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kd0.C76552z;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;
import p492dn.C75415t;
import pe3.C89349b;
import te3.a15;
import te3.j05;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.wear.model.i */
public class C43465i {
    /* renamed from: a */
    public static byte[] m46971a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public static String m46972b(String str) {
        Class cls = C75339i.class;
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
        if (!C72996z1.m85820U5(str)) {
            return ((C75339i) C86312j.m106911c(cls)).pv0(z1Var, str);
        }
        String string = MMApplicationContext.getContext().getString(C0966R.string.bba);
        String pv02 = ((C75339i) C86312j.m106911c(cls)).pv0(z1Var, str);
        return (z1Var.getUsername().equals(pv02) || Util.isNullOrNil(pv02)) ? string : pv02;
    }

    /* renamed from: c */
    public static final Bitmap m46973c(String str) {
        Bitmap loadBitmap = ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().loadBitmap(str);
        if (loadBitmap == null) {
            String g = ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93558g(str, false, false);
            Log.m105919d("MicroMsg.Wear.WearUtil", "avatar fullpath: %s", g);
            return ((C76708i) C86312j.m106911c(C76708i.class)).Wd0(g, str);
        }
        Log.m105919d("MicroMsg.Wear.WearUtil", "get wear avatar from cache: %s", str);
        return loadBitmap;
    }

    /* renamed from: d */
    public static byte[] m46974d(String str) {
        return C86013q1.m106433O(new C86009m1(new C86009m1(C112760b.m154216X(), "lib"), "lib" + str + ".so").mo119971i(), 0, -1);
    }

    /* renamed from: e */
    public static a15 m46975e(C72963f4 f4Var) {
        String str;
        String str2;
        String trim;
        Class cls = C39315g.class;
        a15 a15 = new a15();
        a15.f130221d = f4Var.getMsgId();
        a15.f130226i = f4Var.getCreateTime();
        boolean z = true;
        a15.f130224g = 1;
        a15.f130227j = true;
        if (f4Var.mo108769t2() == 1) {
            a15.f130222e = m46972b(C75592q0.m90789s());
            a15.f130225h = C75592q0.m90789s();
        } else if (C72996z1.m85820U5(f4Var.mo108768t())) {
            String t = f4Var.mo108768t();
            int t2 = C75604z3.m90848t(f4Var.getContent());
            if (!(t2 == -1 || (trim = f4Var.getContent().substring(0, t2).trim()) == null || trim.length() <= 0)) {
                t = trim;
            }
            a15.f130222e = m46972b(t);
            a15.f130225h = t;
        } else {
            a15.f130222e = m46972b(f4Var.mo108768t());
            a15.f130225h = f4Var.mo108768t();
        }
        String str3 = null;
        if (f4Var.mo100990c4()) {
            str3 = MMApplicationContext.getContext().getString(C0966R.string.hc7);
            a15.f130224g = 3;
        } else if (f4Var.mo100979R3()) {
            str3 = MMApplicationContext.getContext().getString(C0966R.string.hb8);
            a15.f130224g = 4;
        } else {
            if (f4Var.mo100993e4()) {
                if (!C72996z1.m85820U5(f4Var.mo108768t()) || f4Var.mo108769t2() == 1) {
                    str3 = f4Var.getContent();
                } else {
                    int t3 = C75604z3.m90848t(f4Var.getContent());
                    str2 = t3 != -1 ? f4Var.getContent().substring(t3 + 1).trim() : f4Var.getContent();
                }
            } else if (f4Var.mo100995g4()) {
                str3 = MMApplicationContext.getContext().getString(C0966R.string.hc9);
                a15.f130224g = 6;
                a15.f130227j = C76552z.m92079q(f4Var);
                String content = f4Var.getContent();
                long j = 0;
                try {
                    if (content.endsWith("\n")) {
                        content = content.substring(0, content.length() - 1);
                    }
                    String[] split = content.split(XVFSFile.PATH_SEPARATOR);
                    int i = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                    if (split.length > i) {
                        String str4 = split[i];
                    }
                    int i2 = i + 1;
                    long j2 = split.length > i2 ? Util.getLong(split[i2], 0) : 0;
                    int i3 = i + 2;
                    if (split.length > i3) {
                        split[i3].equals("1");
                    }
                    j = j2;
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                }
                a15.f130228n = new C89349b(MMApplicationContext.getContext().getString(C0966R.string.f0i, new Object[]{Integer.valueOf((int) ((C75415t) C86312j.m106911c(C75415t.class)).F30(j))}).getBytes());
            } else if (f4Var.mo100994f4()) {
                str3 = MMApplicationContext.getContext().getString(C0966R.string.hc8);
            } else if (f4Var.mo100989b4()) {
                str3 = MMApplicationContext.getContext().getString(C0966R.string.hbz);
            } else if (f4Var.mo100969H3()) {
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                if (u != null) {
                    if (u.f195608o1.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao")) {
                        a15.f130224g = 5;
                        str2 = f4Var.mo108769t2() == 1 ? u.f195584i1 : u.f195580h1;
                    } else {
                        str3 = MMApplicationContext.getContext().getString(C0966R.string.han, new Object[]{f4Var.mo108769t2() == 1 ? u.f195584i1 : u.f195580h1});
                    }
                }
            } else if (f4Var.mo100970I3()) {
                str3 = MMApplicationContext.getContext().getString(C0966R.string.ham);
                a15.f130224g = 5;
            } else if (f4Var.mo101020w3()) {
                C68070l.C68072b u2 = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                if (u2 != null) {
                    int i4 = u2.f195582i;
                    if (i4 == 2) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hb8), new Object[0]);
                    } else if (i4 == 3) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hag), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 4) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hak), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 5) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.had), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 6) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hac), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 8) {
                        str3 = MMApplicationContext.getContext().getString(C0966R.string.hap, new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 10) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hah), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 13) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.haf), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 15) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hab), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 16) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hao), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 19) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hai), new Object[]{Util.nullAs(u2.f195570f, "")});
                    } else if (i4 == 20) {
                        str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.haj), new Object[]{Util.nullAs(u2.f195570f, "")});
                    }
                }
            } else if (f4Var.mo100973L3()) {
                str3 = MMApplicationContext.getContext().getString(C0966R.string.hax);
                if (((C39315g) C86312j.m106911c(cls)).mo58035cm() != null) {
                    EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(f4Var.mo108765s2());
                    if (Util.isNullOrNil(((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138012T(G.getMd5()))) {
                        str = MMApplicationContext.getContext().getString(C0966R.string.hax);
                    } else {
                        str = "[" + ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138012T(G.getMd5()) + "]";
                    }
                    str3 = str;
                    j05 j05 = new j05();
                    j05.f135800e = G.getMd5();
                    if (G.mo135617o2()) {
                        j05.f135799d = 1;
                    } else {
                        j05.f135799d = 2;
                    }
                    try {
                        a15.f130228n = new C89349b(j05.toByteArray());
                    } catch (IOException unused2) {
                    }
                    a15.f130224g = 2;
                }
            } else if (f4Var.mo100982U3()) {
                str3 = MMApplicationContext.getContext().getString(C0966R.string.hb9);
            } else if (f4Var.mo101002k4() || f4Var.mo101003l4() || f4Var.mo100984W3()) {
                String content2 = f4Var.getContent();
                int i5 = C72963f4.f212661I1;
                if (!content2.equals("voip_content_voice")) {
                    String content3 = f4Var.getContent();
                    VoipEvent voipEvent = new VoipEvent();
                    VoipEvent.C67818a aVar = voipEvent.f194019d;
                    aVar.f194022b = 1;
                    aVar.f194021a = content3;
                    voipEvent.publish();
                    if (voipEvent.f194020e.f194027a != 3) {
                        z = false;
                    }
                    if (!z) {
                        str3 = MMApplicationContext.getContext().getString(C0966R.string.hcb);
                    }
                }
                str3 = MMApplicationContext.getContext().getString(C0966R.string.hcg);
            } else if (f4Var.mo100975N3()) {
                str3 = String.format(MMApplicationContext.getContext().getString(C0966R.string.hao), new Object[]{((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent()).mo101025b()});
            } else if (f4Var.getType() == -1879048186) {
                str3 = MMApplicationContext.getContext().getString(C0966R.string.hae);
            }
            str3 = str2;
        }
        if (str3 == null) {
            str3 = MMApplicationContext.getContext().getString(C0966R.string.f361101hc0);
        }
        a15.f130223f = str3;
        return a15;
    }
}
