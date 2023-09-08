package p403yo;

import android.content.BroadcastReceiver;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.XFileOtherAppActionStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.QbCallBackBroadcast;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.pluginsdk.model.C19441d1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19568o0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.QBFileMenuBottomSheetHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import d92.C107028a;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ek3.C97668a;
import ek3.C97669b;
import gy3.C87412m;
import ik3.C21105d;
import ik3.C98700c;
import java.util.Set;
import jk3.C98945a;
import p407zo.C112644i;
import p407zo.C23546f;
import p407zo.C23547h;
import uv0.C111237j;
import z04.C112551y;

@C86522b
/* renamed from: yo.e */
public class C23314e extends C86301e implements C23546f, C23547h, C112644i {
    /* renamed from: KF */
    public C97669b mo36793KF(C111237j jVar) {
        return new C97668a(jVar);
    }

    /* renamed from: Mf */
    public void mo36794Mf(int i, int i2, String str, String str2) {
        C87412m.m108594g(str, "otherInfo");
        C87412m.m108594g(str2, "fileExt");
        XFileOtherAppActionStruct xFileOtherAppActionStruct = new XFileOtherAppActionStruct();
        xFileOtherAppActionStruct.f48680d = (long) i;
        xFileOtherAppActionStruct.f48683g = xFileOtherAppActionStruct.mo86045b("FileFormat", str2, true);
        xFileOtherAppActionStruct.f48681e = (long) i2;
        xFileOtherAppActionStruct.f48682f = xFileOtherAppActionStruct.mo86045b("OtherInfo", str, true);
        xFileOtherAppActionStruct.mo86054n();
        String q = xFileOtherAppActionStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("QQBrowseEntranceReporterReporter", "report%s %s", 27653, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }

    public C21105d U40(C107028a aVar) {
        return new C98700c(aVar);
    }

    public void init() {
        Set<String> set = C98700c.f289434x;
        ((C105923s) C86312j.m106911c(C105923s.class)).xx0(4, C98945a.class);
    }

    /* renamed from: oP */
    public C19569p0 mo36797oP(MMActivity mMActivity, C19569p0.C19570a aVar, C19568o0 o0Var) {
        return new QBFileMenuBottomSheetHelper(mMActivity, aVar, o0Var);
    }

    /* renamed from: rT */
    public BroadcastReceiver mo36798rT() {
        return new QbCallBackBroadcast();
    }

    /* renamed from: xH */
    public void mo36799xH(String str, String str2, String str3, long j, String str4, C23547h.C23548a aVar) {
        C19441d1.m20769a(str, str2, str3, j, aVar == null ? 0 : aVar.mo37002a());
    }
}
