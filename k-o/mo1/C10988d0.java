package mo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: mo1.d0 */
public final class C10988d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderAuthInfo f32692d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileHeaderUIC f32693e;

    public C10988d0(FinderAuthInfo finderAuthInfo, FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32692d = finderAuthInfo;
        this.f32693e = finderProfileHeaderUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleAuthGenerator$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f32692d.appName) && !Util.isNullOrNil(this.f32692d.detailLink)) {
            C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
            AppCompatActivity activity = this.f32693e.getActivity();
            FinderAuthInfo finderAuthInfo = this.f32692d;
            String str = finderAuthInfo.appName;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = finderAuthInfo.detailLink;
            if (str3 != null) {
                str2 = str3;
            }
            bVar.xx0(activity, str, str2);
        } else if (!Util.isNullOrNil(this.f32692d.detailLink)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f32692d.detailLink);
            C88144b.m109791i(this.f32693e.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleAuthGenerator$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
