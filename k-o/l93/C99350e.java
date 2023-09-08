package l93;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96657c;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;

/* renamed from: l93.e */
public class C99350e implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ String f291339a;

    /* renamed from: b */
    public final /* synthetic */ int f291340b;

    /* renamed from: c */
    public final /* synthetic */ String f291341c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f291342d;

    /* renamed from: e */
    public final /* synthetic */ boolean f291343e;

    /* renamed from: f */
    public final /* synthetic */ C96657c f291344f;

    public C99350e(C96657c cVar, String str, int i, String str2, Bundle bundle, boolean z) {
        this.f291344f = cVar;
        this.f291339a = str;
        this.f291340b = i;
        this.f291341c = str2;
        this.f291342d = bundle;
        this.f291343e = z;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f291344f.mo134832f(this.f291339a, this.f291340b, this.f291341c, this.f291342d, this.f291343e);
        this.f291344f.mo134835i(false);
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
