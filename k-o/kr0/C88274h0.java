package kr0;

import android.content.Context;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81427p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import di3.C7335d;
import java.util.List;

/* renamed from: kr0.h0 */
public interface C88274h0 extends C7335d {
    /* renamed from: AC */
    void mo113299AC(C88273g1 g1Var);

    /* renamed from: BB */
    Pair<Integer, String> mo113300BB(Context context, WXLaunchWxaRedirectingPage.Req req, String str, String str2, String str3);

    /* renamed from: Gt */
    List<C81427p> mo113301Gt();

    <T extends Parcelable> void O30(String str, T t);

    /* renamed from: QK */
    void mo113303QK(C88273g1 g1Var);

    /* renamed from: Ss */
    void mo113304Ss(List<String> list);

    /* renamed from: TH */
    void mo113305TH(C88273g1 g1Var);

    C82870p Xg0(int i);

    void a90();

    /* renamed from: b0 */
    Pair<String, Integer> mo113308b0(int i);

    /* renamed from: fx */
    List<String> mo113309fx();

    void j30(Context context, String str, String str2, String str3, boolean z, String str4);

    /* renamed from: k8 */
    String mo113311k8(String str);

    /* renamed from: xm */
    void mo113312xm();
}
