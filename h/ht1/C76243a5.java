package ht1;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.plugin.appbrand.widget.C84943i;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.C18747a;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import di3.C7335d;
import fy3.C32226l;
import ht1.C60162e2;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64258bf0;
import te3.C64284cg;
import te3.C64350ew2;
import te3.C64689rq2;
import up1.C14364t0;

/* renamed from: ht1.a5 */
public interface C76243a5 extends C7335d {
    String C90();

    /* renamed from: Gc */
    void mo13207Gc(C0125s sVar, C0120a0<C2458a> a0Var);

    C18747a Hc0(Context context);

    /* renamed from: Hv */
    C14364t0 mo13209Hv();

    /* renamed from: IJ */
    String mo13210IJ();

    /* renamed from: J */
    int mo13211J();

    void Js0();

    /* renamed from: Jy */
    boolean mo13213Jy();

    /* renamed from: Lv */
    void mo13214Lv(C0125s sVar, C0120a0<C2458a> a0Var);

    void M10(String str);

    /* renamed from: Na */
    C8797q5 mo13216Na(String str, Context context, boolean z, C49712hj1 hj12, int i);

    /* renamed from: RA */
    void mo13217RA(C0120a0<C2458a> a0Var);

    /* renamed from: RK */
    void mo13218RK(C0120a0<C2458a> a0Var);

    /* renamed from: S3 */
    void mo13219S3(TextView textView, Spannable spannable);

    /* renamed from: SB */
    void mo13220SB(C0125s sVar, C0120a0<C2458a> a0Var);

    void Sb0(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener);

    float Sl0(List<? extends C64350ew2> list);

    /* renamed from: Tq */
    String mo13223Tq(long j, Boolean bool, boolean z);

    String Tq0();

    boolean U80();

    boolean Vh0();

    String Vo0(C64258bf0 bf02);

    /* renamed from: X */
    void mo13228X(ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar);

    /* renamed from: Xd */
    void mo13229Xd(Exception exc, String str);

    Map<String, Object> Yo0();

    /* renamed from: Zj */
    void mo13231Zj(C0125s sVar, C0120a0<C2458a> a0Var);

    void b80(String str, String str2);

    void br0(Context context, MMBaseAccessibilityConfig mMBaseAccessibilityConfig);

    /* renamed from: cB */
    String mo13234cB(int i);

    /* renamed from: dN */
    void mo13235dN(String str);

    View da0(Context context);

    /* renamed from: eU */
    void mo13237eU(C0125s sVar, C0120a0<C2458a> a0Var);

    /* renamed from: gc */
    C60162e2.C60163a<C60162e2.C60164b> mo13238gc(List<? extends C64689rq2> list, boolean z);

    /* renamed from: iX */
    C76244c4 mo13239iX();

    /* renamed from: jb */
    C0120a0<C2458a> mo13240jb(C32226l<? super C2458a, C13598b0> lVar);

    /* renamed from: je */
    void mo13241je();

    /* renamed from: lh */
    boolean mo13242lh();

    /* renamed from: oc */
    void mo13243oc(C0120a0<C2458a> a0Var);

    void tc0(C0120a0<C2458a> a0Var);

    Class<? extends C84943i> uj0();

    C20999i5 v00();

    /* renamed from: y9 */
    void mo13247y9(TextView textView, boolean z);

    /* renamed from: yq */
    C14364t0 mo13248yq();

    /* renamed from: zm */
    int mo13249zm(Context context, int i);
}
