package wu1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import nj3.C76879j;
import p172io.flutter.plugin.common.PluginRegistry;
import p447aw.C103918d;

/* renamed from: wu1.g */
public final class C111877g implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f334960d;

    /* renamed from: e */
    public final /* synthetic */ C111869f f334961e;

    /* renamed from: wu1.g$a */
    public static final class C111878a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f334962d;

        public C111878a(Activity activity) {
            this.f334962d = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f334962d);
        }
    }

    /* renamed from: wu1.g$b */
    public static final class C111879b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C111869f f334963d;

        public C111879b(C111869f fVar) {
            this.f334963d = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            FlutterVoipMgr flutterVoipMgr = this.f334963d.f334935j;
            if (flutterVoipMgr == null) {
                return;
            }
            if (flutterVoipMgr.f317102s) {
                flutterVoipMgr.mo152430J();
            } else {
                flutterVoipMgr.mo152482o();
            }
        }
    }

    public C111877g(Activity activity, C111869f fVar) {
        this.f334960d = activity;
        this.f334961e = fVar;
    }

    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        int i2 = 0;
        if (i != 19) {
            return false;
        }
        Resources resources = MMApplicationContext.getResources();
        Activity activity = this.f334960d;
        C111869f fVar = this.f334961e;
        int length = strArr.length;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            int i4 = i3 + 1;
            if (iArr[i3] != 0) {
                C76879j.m92709C(activity, resources.getString(C87412m.m108589b(str, "android.permission.CAMERA") ? C0966R.string.hhq : C0966R.string.f361130hi2), resources.getString(C87412m.m108589b(str, "android.permission.CAMERA") ? C0966R.string.muq : C0966R.string.mxj), resources.getString(C0966R.string.mzi), resources.getString(C0966R.string.f8028zq), false, new C111878a(activity), new C111879b(fVar));
                return true;
            }
            i2++;
            i3 = i4;
        }
        return true;
    }
}
