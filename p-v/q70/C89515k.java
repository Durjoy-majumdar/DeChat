package q70;

import bl0.C67288e;
import com.tencent.matrix.util.JavaMemInfo;
import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.NativeMemInfo;
import com.tencent.matrix.util.ProcessInfo;
import com.tencent.matrix.util.PssInfo;
import com.tencent.matrix.util.StatusInfo;
import com.tencent.matrix.util.SystemInfo;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p723vf.C90776b;

/* renamed from: q70.k */
public final class C89515k extends C87413o implements C32224a<MemInfo[]> {

    /* renamed from: d */
    public static final C89515k f257607d = new C89515k();

    public C89515k() {
        super(0);
    }

    public Object invoke() {
        MemInfo memInfo = new MemInfo(new ProcessInfo(-1, "IsolatedXWeb", "none", false, false, 24, (C8480h) null), (StatusInfo) null, (JavaMemInfo) null, (NativeMemInfo) null, (SystemInfo) null, new PssInfo(XWebSdk.getRenderSandboxProcessMemory(), 0, 0, 0, 0, 0, 0, 0, 0, C67288e.CTRL_INDEX, (C8480h) null), (PssInfo) null, (C90776b) null, WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, (C8480h) null);
        C89496f fVar = C89496f.f257573a;
        PssInfo pssInfo = memInfo.f235676j;
        C87412m.m108591d(pssInfo);
        C89496f.f257579g = pssInfo.f235688d != 0;
        if (!C89496f.f257579g) {
            return new MemInfo[0];
        }
        return new MemInfo[]{memInfo};
    }
}
