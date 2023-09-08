package nf2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nf2.C47244d;
import rx3.C13598b0;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: nf2.e */
public final class C47250e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C47244d.C47247c f126842d;

    /* renamed from: e */
    public final /* synthetic */ C50249le f126843e;

    public C47250e(C47244d.C47247c cVar, C50249le leVar, C50117ke keVar) {
        this.f126842d = cVar;
        this.f126843e = leVar;
    }

    public final void onClick(View view) {
        Intent intent;
        Bundle bundleExtra;
        Intent intent2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$onBindVideoItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f126842d.f44854d.getContext();
        C87412m.m108593f(context, "holder.itemView.context");
        C50249le leVar = this.f126843e;
        ImageView imageView = this.f126842d.f126839z;
        C13598b0 b0Var = C13598b0.f38549a;
        Class cls = C45696d.class;
        if (leVar != null) {
            Log.m105925i("BizProfileJumpLogic", "onClick jump to url:%s", leVar.f137340h);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            int intExtra = (activity == null || (intent2 = activity.getIntent()) == null) ? 10000 : intent2.getIntExtra("KOpenArticleSceneFromScene", 10000);
            Intent intent3 = new Intent();
            ContactInfoUI contactInfoUI = context instanceof ContactInfoUI ? (ContactInfoUI) context : null;
            String c = C92721n.m116875c(leVar.f137340h, 126, intExtra, ((int) System.currentTimeMillis()) / 1000, (C19623o0) null, (contactInfoUI == null || (intent = contactInfoUI.getIntent()) == null || (bundleExtra = intent.getBundleExtra("Contact_Ext_Args")) == null) ? null : bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", ""), -1);
            intent3.putExtra("rawUrl", c);
            intent3.putExtra("useJs", true);
            intent3.putExtra("vertical_scroll", true);
            intent3.putExtra("geta8key_scene", 3);
            intent3.putExtra("geta8key_username", "");
            String stringExtra = intent3.getStringExtra("prePublishId");
            if (!Util.isNullOrNil(stringExtra)) {
                intent3.putExtra("KPublisherId", stringExtra);
                intent3.putExtra("prePublishId", stringExtra);
                intent3.putExtra("preUsername", intent3.getStringExtra("preUsername"));
                intent3.putExtra("preChatName", intent3.getStringExtra("preChatName"));
            } else {
                intent3.putExtra("prePublishId", "brand_profile");
                intent3.putExtra("KPublisherId", "brand_profile");
            }
            intent3.putExtra("preChatTYPE", intent3.getIntExtra("preChatTYPE", 0));
            int intExtra2 = intent3.getIntExtra("KOpenArticleSceneFromScene", 10000);
            if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(6) || !((C45696d) C86709a0.m107533q(cls)).Ms0(context, c, leVar.f137345p, false, 126, intExtra2, intent3)) {
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            } else {
                Log.m105924i("BizProfileJumpLogic", "jump to TmplWebview");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$onBindVideoItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
