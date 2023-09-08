package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.halfscreen.MMHalfScreenDialogFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import do3.C75441a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.Serializable;
import kotlin.Metadata;
import nj3.C88989a;
import qo3.C77426q;
import qy2.C77459z;
import rx3.C13601g;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import vo3.C90852c;
import vz2.C78501d;
import yz2.C79280w2;
import yz2.C79283x2;
import yz2.C79295y2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity */
public final class TextStatusTransparentActivity extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f207282g = 0;

    /* renamed from: d */
    public final C13601g f207283d = C36568h.m40985a(new C71534b(this));

    /* renamed from: e */
    public final C13601g f207284e = C36568h.m40985a(new C71535c(this));

    /* renamed from: f */
    public String f207285f = "ACTION_SHOW_DISABLE_TIPS_DIALOG";

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity$a */
    public static final class C71533a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextStatusTransparentActivity f207286d;

        public C71533a(TextStatusTransparentActivity textStatusTransparentActivity) {
            this.f207286d = textStatusTransparentActivity;
        }

        public final void run() {
            TextStatusTransparentActivity textStatusTransparentActivity = this.f207286d;
            int i = TextStatusTransparentActivity.f207282g;
            textStatusTransparentActivity.getClass();
            try {
                Bundle bundleExtra = textStatusTransparentActivity.getIntent().getBundleExtra("INTENT_KEY_HALFSCREEN_BUNDLE");
                if (bundleExtra != null) {
                    String string = bundleExtra.getString("KEY_BUNDLE_ACTIVITY_CLS_NAME", "");
                    Bundle bundle = bundleExtra.getBundle("KEY_BUNDLE_BUNDLE");
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Serializable serializable = bundleExtra.getSerializable("KEY_BUNDLE_DIALOG_FRAGMENT_CLS");
                    C87412m.m108592e(serializable, "null cannot be cast to non-null type java.lang.Class<out com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment?>");
                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    MMHalfScreenDialogFragment mMHalfScreenDialogFragment = (MMHalfScreenDialogFragment) ((Class) serializable).getDeclaredConstructor(new Class[]{Context.class, Intent.class, String.class, RecyclerViewDrawerSquares.C45117c.class}).newInstance(new Object[]{textStatusTransparentActivity.getContext(), intent, string, null});
                    if (mMHalfScreenDialogFragment != null) {
                        mMHalfScreenDialogFragment.show(textStatusTransparentActivity.getSupportFragmentManager(), "halfScreenDialog");
                    }
                    if (mMHalfScreenDialogFragment != null) {
                        mMHalfScreenDialogFragment.f219876u = new C79295y2(textStatusTransparentActivity);
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.TextStatus.TextStatusTransparentActivity", "showHalfScreen: %s", e.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity$b */
    public static final class C71534b extends C87413o implements C32224a<ResultReceiver> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusTransparentActivity f207287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71534b(TextStatusTransparentActivity textStatusTransparentActivity) {
            super(0);
            this.f207287d = textStatusTransparentActivity;
        }

        public Object invoke() {
            return (ResultReceiver) this.f207287d.getIntent().getParcelableExtra("CALLBACK");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity$c */
    public static final class C71535c extends C87413o implements C32224a<C77459z> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusTransparentActivity f207288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71535c(TextStatusTransparentActivity textStatusTransparentActivity) {
            super(0);
            this.f207288d = textStatusTransparentActivity;
        }

        public Object invoke() {
            C77459z zVar = new C77459z();
            byte[] byteArrayExtra = this.f207288d.getIntent().getByteArrayExtra("SET_TEXT_PARAMS");
            if (byteArrayExtra != null) {
                zVar.parseFrom(byteArrayExtra);
            }
            return zVar;
        }
    }

    public void finish() {
        C13605o oVar;
        if (C87412m.m108589b(this.f207285f, "ACTION_SHOW_HALF_SCREEN")) {
            if (!C75441a.f221748d) {
                oVar = null;
            } else {
                oVar = new C13605o(Integer.valueOf(C75441a.f221745a), C75441a.f221746b, Integer.valueOf(C75441a.f221747c));
                C75441a.f221745a = 0;
                C75441a.f221746b = null;
                C75441a.f221747c = -1;
                C75441a.f221748d = false;
            }
            if (oVar != null) {
                setResult(((Number) oVar.f38557d).intValue(), (Intent) oVar.f38558e);
            }
        }
        super.finish();
        ResultReceiver resultReceiver = (ResultReceiver) ((C36570n) this.f207283d).getValue();
        if (resultReceiver != null) {
            resultReceiver.send(0, (Bundle) null);
        }
        if (C87412m.m108589b(this.f207285f, "ACTION_SHOW_DISABLE_TIPS_DIALOG")) {
            C78501d dVar = C78501d.f229945a;
            Object value = ((C36570n) this.f207284e).getValue();
            C87412m.m108593f(value, "<get-setStatusParam>(...)");
            dVar.mo108458d((C77459z) value, 7);
        }
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        setActionbarColor(0);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        String stringExtra = getIntent().getStringExtra("INTENT_KEY_ACTION");
        if (stringExtra == null) {
            stringExtra = "ACTION_SHOW_DISABLE_TIPS_DIALOG";
        }
        this.f207285f = stringExtra;
        if (C87412m.m108589b(stringExtra, "ACTION_SHOW_DISABLE_TIPS_DIALOG")) {
            C77426q qVar = new C77426q(this);
            qVar.mo107595g(getString(C0966R.string.jzp));
            qVar.mo107589a(true);
            qVar.mo107600l(new C79280w2(this));
            qVar.mo107593e(new C79283x2(this));
            qVar.mo107603o();
        } else if (C87412m.m108589b(stringExtra, "ACTION_SHOW_HALF_SCREEN")) {
            getContentView().post(new C71533a(this));
        } else {
            Log.m105929w("MicroMsg.TextStatus.TextStatusTransparentActivity", "onCreate: action error :%s", this.f207285f);
        }
    }
}
