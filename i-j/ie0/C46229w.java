package ie0;

import android.database.Cursor;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import p875ci.C67379u;

/* renamed from: ie0.w */
public final class C46229w {

    /* renamed from: a */
    public static final C46229w f124612a = new C46229w();

    /* renamed from: a */
    public static final boolean m51531a(String str) {
        C87412m.m108594g(str, "username");
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j(str);
        if (j != null) {
            String username = j.getUsername();
            if (!(username == null || username.length() == 0) && j.getUsername().equals(str)) {
                return true;
            }
        }
        Log.m105921e("MicroMsg.OpenIMKefuConversationLogic", "isKefuConversationExist conv invalid username: %s", str);
        return false;
    }

    /* renamed from: b */
    public final void mo71639b(String str, C72963f4 f4Var, C72976h2 h2Var) {
        Map<String, String> parseXml;
        if (h2Var != null) {
            h2Var.mo101164o3(f4Var);
            h2Var.mo108806b3(String.valueOf(f4Var.getType()));
            h2Var.mo108792M2(f4Var.mo108768t() + XVFSFile.PATH_SEPARATOR_CHAR + f4Var.getContent());
            Log.m105927v("MicroMsg.OpenIMKefuConversationLogic", "alvinluo doFillParentConversationInfo msg.content: %s", f4Var.getContent());
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69741L() != null) {
                PString pString = new PString();
                PString pString2 = new PString();
                PInt pInt = new PInt();
                String t = f4Var.mo108768t();
                f4Var.mo108749c3(str);
                f4Var.mo108732L2(h2Var.getContent());
                C67379u.m79740d(f4Var, pString, pString2, pInt, true);
                String str2 = pString2.value;
                if (str2 == null || str2.length() == 0) {
                    pString2.value = t;
                }
                int type = f4Var.getType();
                String content = f4Var.getContent();
                C87412m.m108593f(content, "lastOfMsg.content");
                String str3 = null;
                if (!Util.isNullOrNil(content) && type == 49 && (parseXml = XmlParser.parseXml(content, "msg", (String) null)) != null) {
                    str3 = parseXml.get(".msg.appmsg.title");
                    Log.m105919d("MicroMsg.OpenIMKefuConversationLogic", "parseConversationMsgContentTitle title:%s", str3);
                }
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Util.nullAsNil(pString.value));
                if (!(str3.length() == 0)) {
                    str4 = ' ' + str3;
                }
                sb.append(str4);
                h2Var.mo108794O2(sb.toString());
                h2Var.mo108795P2(pString2.value);
                h2Var.mo108801W2(pInt.value);
                Log.m105925i("MicroMsg.OpenIMKefuConversationLogic", "alvinluo doFillParentConversationInfo talker: %s, msgType: %s, digest: %s, digestUser: %s, parenConv: %s, lastOfMsgTalker: %s", str, Integer.valueOf(f4Var.getType()), h2Var.mo108822p2(), h2Var.mo108823q2(), h2Var.getUsername(), t);
            }
        }
    }

    /* renamed from: c */
    public final void mo71640c(C72976h2 h2Var, C72976h2 h2Var2) {
        C72963f4 f4Var;
        String str;
        Class cls = C75700k0.class;
        C72976h2 d = mo71641d();
        boolean z = false;
        if (d != null) {
            Log.m105921e("MicroMsg.OpenIMKefuConversationLogic", "fillParentConversationInfo the lastest openim kefu conversation username is %s", d.getUsername());
            f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(d.getUsername());
            str = d.mo108782C2();
            C87412m.m108593f(str, "lastConv.parentRef");
        } else if (h2Var != null) {
            Log.m105920e("MicroMsg.OpenIMKefuConversationLogic", "fillParentConversationInfo the lastest openim kefu conversation is null");
            C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(h2Var.getUsername());
            String C2 = h2Var.mo108782C2();
            C87412m.m108593f(C2, "cvs.parentRef");
            C72963f4 f4Var2 = Ex0;
            str = C2;
            f4Var = f4Var2;
        } else {
            f4Var = null;
            str = "";
        }
        if (f4Var != null) {
            if (f4Var.getMsgId() > 0) {
                z = true;
            }
        }
        if (z) {
            mo71639b(str, f4Var, h2Var2);
            return;
        }
        Log.m105920e("MicroMsg.OpenIMKefuConversationLogic", "the last of msg is invalid");
        h2Var2.mo101162m3();
    }

    /* renamed from: d */
    public final C72976h2 mo71641d() {
        C72976h2 h2Var = null;
        Cursor I = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69738I(6, (List<String>) null, "opencustomerservicemsg", -1);
        if (I != null) {
            if (I.getCount() > 0 && I.moveToFirst()) {
                C72976h2 h2Var2 = new C72976h2();
                h2Var2.convertFrom(I);
                h2Var = h2Var2;
            }
            I.close();
        }
        return h2Var;
    }
}
