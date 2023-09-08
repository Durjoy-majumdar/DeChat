package com.tencent.p014mm.plugin.webview.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.model.C85541t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gt0.C87330d0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import ke3.C88144b;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.webview.model.s0 */
public final class C85539s0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C85541t0.C85542a f249284d;

    /* renamed from: com.tencent.mm.plugin.webview.model.s0$a */
    public static final class C85540a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ Activity f249285d;

        public C85540a(Activity activity) {
            this.f249285d = activity;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            Intent intent2 = intent;
            Activity activity = this.f249285d;
            C85541t0 t0Var = C85541t0.f249286a;
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C85541t0.C85544b bVar = C85541t0.f249288c;
            if (bVar != null && intent2 != null && i == 204) {
                if (!(intent2.getIntExtra("id", -1) == -1)) {
                    C85541t0.f249286a.getClass();
                    Log.m105924i(C85541t0.f249287b, "[OauthQueue.onActivityResult] START_CREATE_AVATAR_UI_REQUEST_CODE");
                    C85541t0.C85542a aVar = bVar.f249308f;
                    if (aVar != null) {
                        int intExtra = intent2.getIntExtra("id", -1);
                        String stringExtra = intent2.getStringExtra("nickname");
                        String stringExtra2 = intent2.getStringExtra("avatarurl");
                        Iterator<C87330d0.C87331a> it = aVar.f249296f.iterator();
                        while (it.hasNext()) {
                            it.next().f253107f = false;
                        }
                        ArrayList<C87330d0.C87331a> arrayList = aVar.f249296f;
                        C90437rw3 rw32 = aVar.f249295e;
                        String str = rw32 != null ? rw32.f259822d : null;
                        C87412m.m108591d(stringExtra2);
                        arrayList.add(new C87330d0.C87331a(0, stringExtra, "", str, (Bitmap) null, true, stringExtra2, intExtra));
                        C90437rw3 rw33 = aVar.f249295e;
                        C87412m.m108591d(rw33);
                        aVar.mo118931a(rw33, aVar.f249293c, aVar.f249296f, aVar.f249297g, aVar.f249298h);
                    }
                }
            }
        }
    }

    public C85539s0(C85541t0.C85542a aVar) {
        this.f249284d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/model/OauthMultiAccountMgr$OauthDialog$enableAddNewAvatarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("0", this.f249284d.f249300j);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f249284d.f249301k);
        Context context = this.f249284d.f249291a;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.mmSetOnActivityResultCallback(new C85540a(activity));
        }
        C88144b.m109802t(activity, ".plugin.webview.ui.tools.CreateAvatarUI", intent, 204);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/model/OauthMultiAccountMgr$OauthDialog$enableAddNewAvatarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
