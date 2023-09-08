package p873bx;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.revoke.RevokeChattingLandingPageUIC;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import nj3.C76879j;
import oa1.C117731d;
import pf3.C35479g;
import yb2.C15946a;
import yb2.C79062b;

/* renamed from: bx.a */
public final class C67323a extends C15946a {

    /* renamed from: bx.a$a */
    public static final class C67324a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C67324a f193159d = new C67324a();

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67323a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("KEY_START_FROM_LANDING_UIC", false);
        }
        if (z) {
            C76879j.m92754y(getActivity(), getActivity().getResources().getString(C0966R.string.ncm), "", getActivity().getResources().getString(C0966R.string.bb5), C67324a.f193159d);
            if ((getActivity() instanceof LauncherUI) && intent != null) {
                intent.setFlags(intent.getFlags() & -67108865);
            }
        }
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
        super.onStartActivityForResult(intent, i, bundle);
        boolean z = true;
        if (C117731d.m166007c().mo182440a(new C35479g()) != 1) {
            z = false;
        }
        if (z) {
            C72963f4 f4Var = C73684f2.f216338e.get();
            Object obj = null;
            if (Log.isDebug()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onStartActivityForResult() called with: extras = ");
                sb.append(intent != null ? intent.getExtras() : null);
                sb.append(", requestCode = ");
                sb.append(i);
                sb.append(", options = ");
                sb.append(bundle);
                sb.append(" click MsgId:");
                sb.append(f4Var != null ? Long.valueOf(f4Var.getMsgId()) : null);
                sb.append(" msgSrvId:");
                sb.append(f4Var != null ? Long.valueOf(f4Var.mo108774y2()) : null);
                sb.append(" target:");
                if (intent != null) {
                    obj = intent.getComponent();
                }
                sb.append(obj);
                Log.m105918d("MRevokeChat.HomePageUIC", sb.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onStartActivityForResult() click MsgId:");
                sb4.append(f4Var != null ? Long.valueOf(f4Var.getMsgId()) : null);
                sb4.append(" msgSrvId:");
                if (f4Var != null) {
                    obj = Long.valueOf(f4Var.mo108774y2());
                }
                sb4.append(obj);
                Log.m105924i("MRevokeChat.HomePageUIC", sb4.toString());
            }
            if (f4Var != null) {
                if (intent != null) {
                    intent.putExtra("KEY_CLICK_MSG_ID", f4Var.getMsgId());
                }
                if (intent != null) {
                    intent.putExtra("KEY_CLICK_MSG_SRV_ID", f4Var.mo108774y2());
                }
            }
            if (intent != null) {
                C79062b.m95631b(intent, RevokeChattingLandingPageUIC.class);
            }
            if (intent != null) {
                intent.putExtra("KEY_HOME_PAGE_CLS", getActivity().getClass().getName());
            }
        }
    }
}
