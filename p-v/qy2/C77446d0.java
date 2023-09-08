package qy2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import b03.C39718p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditDialogFragment;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusTransparentActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import eb0.C31543z5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p564iq.C87790d;
import tz2.C78122h;
import uz2.C52718u;
import uz2.C65492p;
import uz2.C78317u1;
import zl3.C79397a;
import zt3.C119157j;

/* renamed from: qy2.d0 */
public final class C77446d0 {

    /* renamed from: a */
    public static final C77446d0 f225875a = new C77446d0();

    /* renamed from: a */
    public final boolean mo107614a(Context context, C77459z zVar, ResultReceiver resultReceiver) {
        if (!zVar.f229418z) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("SET_TEXT_PARAMS", zVar.toByteArray());
        bundle.putParcelable("CALLBACK", resultReceiver);
        C79397a.C79398a aVar = new C79397a.C79398a();
        C79397a aVar2 = aVar.f232918a;
        aVar2.f232909a = context;
        aVar2.f232910b = bundle;
        aVar.mo109371a("com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity");
        aVar.mo109372b(TextStatusEditDialogFragment.class);
        aVar.mo109374d();
        return true;
    }

    /* renamed from: b */
    public final boolean mo107615b(Context context, C77459z zVar, ResultReceiver resultReceiver) {
        Context context2 = context;
        ResultReceiver resultReceiver2 = resultReceiver;
        if (context2 == null) {
            Log.m105920e("MicroMsg.TextStatusSetter", "setTextStatus context == null");
            return false;
        }
        C77459z zVar2 = zVar == null ? new C77459z() : zVar;
        C77447e0.m93387a(zVar2);
        Activity activity = null;
        if (!C77448f0.m93394f() || !((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("xlab")) {
            int i = TextStatusTransparentActivity.f207282g;
            Intent intent = new Intent(context, TextStatusTransparentActivity.class);
            boolean z = context2 instanceof Activity;
            if (!z) {
                intent.addFlags(268435456);
            }
            intent.putExtra("SET_TEXT_PARAMS", zVar2.toByteArray());
            intent.putExtra("CALLBACK", resultReceiver2);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (z) {
                activity = (Activity) context2;
            }
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
            return false;
        }
        IStatusIconHelperKt.m39109a().mo62284N(1);
        if (zVar2.f229413u) {
            C78317u1 u1Var = new C78317u1();
            u1Var.f229450f = true;
            C52718u uVar = zVar2.f229399d;
            if (uVar.f147245q == 0) {
                uVar.f147245q = C31543z5.m39455e();
            }
            uVar.f147246r = uVar.f147245q + 86400;
            if (u1Var.f229450f) {
                C39718p pVar = C39718p.f106569a;
                uVar.f147252x = pVar.mo62350a(pVar.mo62352c());
            }
            uVar.f147237f = 0;
            u1Var.f229448d = uVar;
            String str = u1Var.f229459r;
            if (str == null) {
                str = "";
            }
            u1Var.f229459r = str;
            ((C119157j) C119157j.f356862d).mo183876g(new C78122h(u1Var), "MicroMsg.TextStatus.UploadPackHelper");
            if (resultReceiver2 != null) {
                C65492p pVar2 = new C65492p();
                C52718u uVar2 = u1Var.f229448d;
                pVar2.f188456e = uVar2.f147238g.f147088e;
                pVar2.f188455d = uVar2.f147231J;
                Bundle bundle = new Bundle();
                bundle.putByteArray("select_status_info", pVar2.toByteArray());
                resultReceiver2.send(-1, bundle);
            }
            return true;
        }
        if (mo107614a(context, zVar2, resultReceiver2)) {
            return true;
        }
        if (C77447e0.m93388b(zVar2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putByteArray("SET_TEXT_PARAMS", zVar2.toByteArray());
            bundle2.putParcelable("CALLBACK", resultReceiver2);
            if (IStatusIconHelperKt.m39109a().mo62271A()) {
                TextStatusDoWhatActivityV2.f206792X0.mo6664a(context, bundle2, (Integer) null);
            } else {
                TextStatusDoWhatActivity.f206763C.mo6661a(context, bundle2, (Integer) null);
            }
            return true;
        }
        TextStatusEditActivity.C71390b.m83965c(TextStatusEditActivity.f206867L1, context, zVar2, false, false, resultReceiver, false, 44, (Object) null);
        return true;
    }

    /* renamed from: c */
    public final boolean mo107616c(Activity activity, C77459z zVar, int i) {
        if (activity == null) {
            return false;
        }
        if (zVar == null) {
            zVar = new C77459z();
        }
        C77447e0.m93387a(zVar);
        if (!C77448f0.m93394f() || !((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("xlab")) {
            int i2 = TextStatusTransparentActivity.f207282g;
            Intent intent = new Intent(activity, TextStatusTransparentActivity.class);
            intent.putExtra("SET_TEXT_PARAMS", zVar.toByteArray());
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity$Companion", "startForResult", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            activity.overridePendingTransition(0, 0);
            return false;
        }
        IStatusIconHelperKt.m39109a().mo62284N(1);
        if (mo107614a(activity, zVar, (ResultReceiver) null)) {
            return true;
        }
        if (C77447e0.m93388b(zVar)) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("SET_TEXT_PARAMS", zVar.toByteArray());
            if (IStatusIconHelperKt.m39109a().mo62271A()) {
                TextStatusDoWhatActivityV2.f206792X0.mo6664a(activity, bundle, Integer.valueOf(i));
            } else {
                TextStatusDoWhatActivity.f206763C.mo6661a(activity, bundle, Integer.valueOf(i));
            }
            return true;
        }
        TextStatusEditActivity.C71390b bVar = TextStatusEditActivity.f206867L1;
        Intent intent2 = new Intent(activity, TextStatusEditActivity.class);
        intent2.putExtra("SET_TEXT_PARAMS", zVar.toByteArray());
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        aVar2.mo10233c(intent2);
        C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", "startForResult", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        return true;
    }
}
