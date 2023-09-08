package wg3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: wg3.c */
public final class C102444c implements C11385n, C102442a {

    /* renamed from: d */
    public C11385n f301694d;

    /* renamed from: e */
    public long f301695e;

    /* renamed from: a */
    public void mo142013a() {
        C86709a0.m107529k().f251779b.mo123455a(3793, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (System.currentTimeMillis() - this.f301695e <= 10000) {
            int iOSNetType = NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
            if (iOSNetType == 1) {
                C115669n.INSTANCE.mo175912v(1257, 109);
            } else if (iOSNetType == 2) {
                C115669n.INSTANCE.mo175912v(1257, 100);
            } else if (iOSNetType == 3) {
                C115669n.INSTANCE.mo175912v(1257, 103);
            } else if (iOSNetType == 4) {
                C115669n.INSTANCE.mo175912v(1257, 106);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f301695e;
            int iOSNetType2 = NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
            if (iOSNetType2 == 1) {
                C115669n.INSTANCE.mo175913w(1257, 110, currentTimeMillis);
            } else if (iOSNetType2 == 2) {
                C115669n.INSTANCE.mo175913w(1257, 101, currentTimeMillis);
            } else if (iOSNetType2 == 3) {
                C115669n.INSTANCE.mo175913w(1257, 104, currentTimeMillis);
            } else if (iOSNetType2 == 4) {
                C115669n.INSTANCE.mo175913w(1257, 107, currentTimeMillis);
            }
        }
        C11385n nVar = this.f301694d;
        if (nVar != null) {
            nVar.onSceneEnd(i, i2, str, yVar);
        }
    }
}
