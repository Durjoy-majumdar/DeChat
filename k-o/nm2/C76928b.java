package nm2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C7628p0;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import og2.C77006j;
import p823sg.C90193h;
import te3.C49042cs;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C77949j3;
import z04.C119027c;

/* renamed from: nm2.b */
public final class C76928b {

    /* renamed from: a */
    public static final C76928b f224816a = new C76928b();

    /* renamed from: a */
    public final C77949j3 mo107263a(Context context, C72963f4 f4Var, String str) {
        String str2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(f4Var, "msg");
        C77949j3 j3Var = new C77949j3();
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = f4Var.mo108768t();
        rv32.f141176e = true;
        j3Var.f227628e = rv32;
        if (f4Var.mo108769t2() == 1) {
            C51163rv3 rv33 = new C51163rv3();
            rv33.f141175d = str;
            rv33.f141176e = true;
            j3Var.f227629f = rv33;
        } else {
            int t = C75604z3.m90848t(f4Var.getContent());
            if (t != -1) {
                String content = f4Var.getContent();
                C87412m.m108593f(content, "msg.content");
                String substring = content.substring(0, t);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int length = substring.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = C87412m.m108596i(substring.charAt(!z ? i : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                String obj = substring.subSequence(i, length + 1).toString();
                if (obj.length() > 0) {
                    str = obj;
                }
            }
            C51163rv3 rv34 = new C51163rv3();
            rv34.f141175d = str;
            rv34.f141176e = true;
            j3Var.f227629f = rv34;
        }
        j3Var.f227632i = 4;
        j3Var.f227633j = f4Var.getStatus();
        j3Var.f227634n = new C51018qv3();
        j3Var.f227635o = (int) (f4Var.getCreateTime() / 1000);
        j3Var.f227638r = f4Var.mo108774y2();
        j3Var.f227630g = f4Var.mo101020w3() ? 49 : f4Var.getType();
        C51163rv3 rv35 = new C51163rv3();
        rv35.f141175d = Util.nullAs(f4Var.getContent(), "");
        rv35.f141176e = true;
        j3Var.f227631h = rv35;
        ((C77006j) C86312j.m106911c(C77006j.class)).Mb0(context, f4Var, j3Var);
        C51163rv3 rv36 = j3Var.f227631h;
        if (!(rv36 == null || (str2 = rv36.f141175d) == null)) {
            int t2 = C75604z3.m90848t(str2);
            if (t2 != -1) {
                String substring2 = str2.substring(t2 + 1);
                C87412m.m108593f(substring2, "this as java.lang.String).substring(startIndex)");
                int length2 = substring2.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = C87412m.m108596i(substring2.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (!z3) {
                        if (!z4) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z4) {
                        break;
                    } else {
                        length2--;
                    }
                }
                str2 = substring2.subSequence(i2, length2 + 1).toString();
            }
            C51163rv3 rv37 = new C51163rv3();
            rv37.f141175d = str + ":\n" + str2;
            rv37.f141176e = true;
            j3Var.f227631h = rv37;
        }
        return j3Var;
    }

    /* renamed from: b */
    public final long mo107264b(C77949j3 j3Var) {
        C87412m.m108594g(j3Var, "addMsg");
        Charset charset = C119027c.f356488a;
        byte[] bytes = ("msg_" + j3Var.f227628e + '_' + j3Var.f227629f + '_' + j3Var.f227638r + '_' + C7628p0.m7761a(C75592q0.m90789s(), C31543z5.m39451a()).hashCode()).getBytes(charset);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        C87412m.m108593f(f, "content");
        byte[] bytes2 = f.getBytes(charset);
        C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
        ByteBuffer wrap = ByteBuffer.wrap(bytes2);
        C87412m.m108593f(wrap, "wrap(content.toByteArray())");
        long j = wrap.getLong();
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.selectRecord.HistoryRecordPackMsgLogic", "getNewSvrId newSvrId:%s content:%s", Long.valueOf(j), j3Var.f227631h);
        }
        return j;
    }

    /* renamed from: c */
    public final C49042cs mo107265c(List<? extends C72963f4> list) {
        if (list == null) {
            return null;
        }
        C49042cs csVar = new C49042cs();
        String s = C75592q0.m90789s();
        ArrayList<C72963f4> arrayList = new ArrayList<>();
        for (C72963f4 l3 : list) {
            arrayList.add(C72963f4.m85593l3(l3));
        }
        Context context = MMApplicationContext.getContext();
        for (C72963f4 f4Var : arrayList) {
            C76928b bVar = f224816a;
            C87412m.m108593f(context, "context");
            C77949j3 a = bVar.mo107263a(context, f4Var, s);
            long b = bVar.mo107264b(a);
            a.f227636p = C75569c4.m90667M(f4Var.f230724G, f4Var.getCreateTime(), a.f227638r, b);
            csVar.f131925d.add(a);
            Log.m105918d("MicroMsg.selectRecord.HistoryRecordPackMsgLogic", "packMsg oriMsgId:" + a.f227638r + ", newMsgId:" + b);
        }
        return csVar;
    }
}
