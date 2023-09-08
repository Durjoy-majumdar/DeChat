package p189kx;

import android.content.Context;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.scanner.C42902i;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.C42914t;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import p200lx.C10661v;
import p200lx.C34410y;
import p200lx.C46896e0;
import p200lx.C46897s;
import p200lx.C46899t;
import p200lx.C46900z;
import vc0.C52809a;

@C86522b
/* renamed from: kx.h0 */
public class C46751h0 extends C86301e implements C34410y, C46899t, C46896e0 {
    /* renamed from: EY */
    public C10661v mo71985EY() {
        return new C52809a();
    }

    /* renamed from: Hu */
    public C46900z mo71986Hu(Context context, C46900z.C46901a aVar) {
        return new ScanCodeSheetItemLogic(context, aVar);
    }

    public C46900z Mp0(Context context, C46900z.C46902b bVar) {
        return new ScanCodeSheetItemLogic(context, bVar);
    }

    /* renamed from: dU */
    public C10661v mo71988dU(String str, int i, int i2) {
        return new C52809a(str, i, i2);
    }

    /* renamed from: dd */
    public C46900z mo71989dd(Context context, C46900z.C46902b bVar, C0125s sVar) {
        return new ScanCodeSheetItemLogic(context, bVar, sVar);
    }

    public C10661v et0(String str, int i, int i2, String str2) {
        return new C52809a(str, i, i2, str2);
    }

    /* renamed from: h3 */
    public boolean mo59579h3(int i, String str) {
        return C42914t.m46594o(i, str);
    }

    /* renamed from: ls */
    public void mo71991ls(long j, int i, ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, long j2, boolean z) {
        C42912n.f116194a.mo67104b(j, i, arrayList, imageQBarDataBean, j2, z, 0);
    }

    /* renamed from: oj */
    public C46900z mo71992oj(Context context) {
        return new ScanCodeSheetItemLogic(context);
    }

    public C46897s xp0() {
        return new C42902i();
    }
}
