package p763ym;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import di3.C7335d;
import p749xh.C53334e0;

/* renamed from: ym.l */
public interface C79138l extends C7335d {

    /* renamed from: ym.l$a */
    public interface C53540a {
        /* renamed from: a */
        void mo74207a(C44561j jVar);
    }

    /* renamed from: Ae */
    boolean mo73985Ae(String str);

    boolean Bl0(Context context, long j);

    /* renamed from: D8 */
    boolean mo73987D8(C44561j jVar);

    boolean Dm0(Context context, Intent intent, String str, C44580q1 q1Var, Bundle bundle);

    boolean E10(C44561j jVar);

    /* renamed from: GW */
    C44561j mo73990GW(String str, boolean z);

    /* renamed from: JL */
    boolean mo73991JL(C44561j jVar);

    /* renamed from: KS */
    String mo73992KS(Context context, String str, int i);

    /* renamed from: L1 */
    boolean mo73993L1(String str);

    /* renamed from: Lc */
    boolean mo73994Lc(String str);

    /* renamed from: Lw */
    ShowMessageFromWX.Req mo73995Lw(Context context, WXMediaMessage wXMediaMessage, String str);

    boolean Lw0(String str);

    /* renamed from: OL */
    boolean mo73997OL(WXMediaMessage wXMediaMessage);

    C44561j Pw0(String str, boolean z, boolean z2);

    /* renamed from: QH */
    boolean mo73999QH(Context context, Intent intent, String str, int i, C44580q1 q1Var, Bundle bundle);

    /* renamed from: Sy */
    boolean mo74000Sy(Context context, Intent intent, String str);

    /* renamed from: TT */
    C44561j mo74001TT(String str, boolean z);

    boolean Tb0(Context context, String str);

    /* renamed from: UV */
    C44561j mo74003UV(String str, int i);

    /* renamed from: WW */
    void mo74004WW(String str, String str2, C53540a aVar);

    boolean Wo0(Context context, String str, String str2, ShowMessageFromWX.Req req, C44580q1 q1Var, Bundle bundle);

    /* renamed from: a3 */
    boolean mo74006a3(String str);

    boolean cg0(String str);

    boolean df0(WXMediaMessage wXMediaMessage);

    C44561j getAppInfo(String str);

    /* renamed from: gu */
    boolean mo74010gu(Context context, String str, WXMediaMessage wXMediaMessage, int i, C44580q1 q1Var, Bundle bundle);

    /* renamed from: hv */
    String mo74011hv(Context context, C53334e0 e0Var);

    /* renamed from: l5 */
    String mo74012l5(Context context, String str);

    boolean px0(Context context, Intent intent, String str, C44580q1 q1Var);

    void q70(Bundle bundle);

    int ta0(int i);

    /* renamed from: tz */
    boolean mo74016tz(Context context, C44561j jVar);

    /* renamed from: uF */
    String mo74017uF(ResolveInfo resolveInfo);

    /* renamed from: ub */
    Bitmap mo74018ub(String str, int i, float f);

    /* renamed from: xG */
    String mo74019xG(Context context, C53334e0 e0Var, String str);

    boolean xw0(Context context, Uri uri, C44580q1 q1Var);

    boolean yw0(Context context, String str, WXMediaMessage wXMediaMessage, String str2, String str3, int i, C44580q1 q1Var, Bundle bundle);
}
