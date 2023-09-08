package je3;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.KBInvokeWechatStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kj2.C61103a;
import z04.C112551y;

/* renamed from: je3.d */
public final class C21232d {

    /* renamed from: a */
    public static final C21232d f60029a = new C21232d();

    /* renamed from: a */
    public static void m23722a(C21232d dVar, long j, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        if ((i2 & 64) != 0) {
            str5 = "";
        }
        if ((i2 & 128) != 0) {
            str6 = "";
        }
        if ((i2 & 256) != 0) {
            str7 = "";
        }
        dVar.getClass();
        KBInvokeWechatStruct kBInvokeWechatStruct = new KBInvokeWechatStruct();
        kBInvokeWechatStruct.f48521d = j;
        kBInvokeWechatStruct.f48522e = (long) i;
        kBInvokeWechatStruct.f48523f = kBInvokeWechatStruct.mo86045b("ContentTitle", str, true);
        kBInvokeWechatStruct.f48524g = kBInvokeWechatStruct.mo86045b("AppID", str2, true);
        kBInvokeWechatStruct.f48525h = kBInvokeWechatStruct.mo86045b("SongID", str3, true);
        kBInvokeWechatStruct.f48526i = kBInvokeWechatStruct.mo86045b("EmojiMd5", str4, true);
        kBInvokeWechatStruct.f48527j = kBInvokeWechatStruct.mo86045b("EmojiProductID", str5, true);
        kBInvokeWechatStruct.f48528k = kBInvokeWechatStruct.mo86045b("SongName", str6, true);
        kBInvokeWechatStruct.f48529l = kBInvokeWechatStruct.mo86045b("ToUsername", str7, true);
        kBInvokeWechatStruct.mo86054n();
        f60029a.mo33222b(kBInvokeWechatStruct);
    }

    /* renamed from: b */
    public final void mo33222b(C61103a aVar) {
        String q = aVar.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("MicroMsg.WxImeReport", "report%s %s", Integer.valueOf(aVar.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
