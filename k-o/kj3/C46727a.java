package kj3;

import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
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
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;
import java.util.Map;
import kr0.C33993f0;
import p875ci.C67379u;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: kj3.a */
public class C46727a extends C86301e implements C33993f0 {
    public void am0(C72976h2 h2Var) {
        Class cls = C75700k0.class;
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("appbrandcustomerservicemsg");
        if (j == null) {
            Log.m105924i("MicroMsg.AppBrandConversationService", "create parentConv");
            C72976h2 h2Var2 = new C72976h2("appbrandcustomerservicemsg");
            h2Var2.mo101162m3();
            vx0(h2Var, h2Var2);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var2);
            return;
        }
        Log.m105924i("MicroMsg.AppBrandConversationService", "appBrandSuperConv is created");
        j.mo108807c3((String) null);
        vx0(h2Var, j);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "appbrandcustomerservicemsg");
    }

    /* renamed from: s */
    public boolean mo59397s() {
        return ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j("appbrandcustomerservicemsg") != null;
    }

    public void vx0(C72976h2 h2Var, C72976h2 h2Var2) {
        C72976h2 h2Var3;
        C72963f4 f4Var;
        String str;
        Map<String, String> parseXml;
        Class cls = C75700k0.class;
        String str2 = null;
        Cursor I = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69738I(4, (List<String>) null, "appbrandcustomerservicemsg", -1);
        if (I != null) {
            if (I.getCount() <= 0 || !I.moveToFirst()) {
                h2Var3 = null;
            } else {
                h2Var3 = new C72976h2();
                h2Var3.convertFrom(I);
            }
            I.close();
        } else {
            h2Var3 = null;
        }
        if (h2Var3 != null) {
            Log.m105921e("MicroMsg.AppBrandConversationService", "The lastest app brand conversation username is %s", h2Var3.getUsername());
            f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(h2Var3.getUsername());
        } else if (h2Var != null) {
            Log.m105920e("MicroMsg.AppBrandConversationService", "The lastest app brand conversation is null");
            f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(h2Var.getUsername());
        } else {
            f4Var = null;
        }
        if (f4Var == null || f4Var.getMsgId() <= 0) {
            Log.m105920e("MicroMsg.AppBrandConversationService", "the last of msg is null'");
            h2Var2.mo101162m3();
            return;
        }
        h2Var2.mo101164o3(f4Var);
        h2Var2.mo108792M2(f4Var.mo108768t() + XVFSFile.PATH_SEPARATOR + f4Var.getContent());
        h2Var2.mo108806b3(Integer.toString(f4Var.getType()));
        if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69741L() != null) {
            PString pString = new PString();
            PString pString2 = new PString();
            PInt pInt = new PInt();
            if (h2Var3 != null) {
                f4Var.mo108749c3(h2Var3.mo108782C2());
            } else if (h2Var != null) {
                f4Var.mo108749c3(h2Var.mo108782C2());
            }
            f4Var.mo108732L2(h2Var2.getContent());
            C67379u.m79740d(f4Var, pString, pString2, pInt, true);
            int type = f4Var.getType();
            String content = f4Var.getContent();
            if (!Util.isNullOrNil(content) && type == 49 && (parseXml = XmlParser.parseXml(content, "msg", (String) null)) != null) {
                str2 = parseXml.get(".msg.appmsg.title");
                Log.m105919d("MicroMsg.AppBrandConversationService", "[oneliang][parseConversationMsgContentTitle] title:%s", str2);
            }
            String nullAsNil = Util.nullAsNil(pString.value);
            if (Util.isNullOrNil(str2)) {
                str = "";
            } else {
                str = " " + Util.nullAsNil(str2);
            }
            h2Var2.mo108794O2(nullAsNil.concat(str));
            h2Var2.mo108795P2(pString2.value);
            h2Var2.mo108801W2(pInt.value);
        }
    }
}
