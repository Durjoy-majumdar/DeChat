package xk1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLiveAuthUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nr3.C89059e;
import qg1.C62614l;
import te3.cg4;
import te3.m44;

/* renamed from: xk1.g */
public final class C66309g extends UIComponent {

    /* renamed from: d */
    public final String f190890d = "Finder.FinderGameLiveAccountUIC";

    /* renamed from: e */
    public View f190891e;

    /* renamed from: f */
    public String f190892f = "";

    /* renamed from: g */
    public String f190893g = "";

    /* renamed from: h */
    public boolean f190894h;

    /* renamed from: i */
    public m44 f190895i;

    /* renamed from: j */
    public cg4 f190896j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66309g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m78227c3(C66309g gVar, boolean z) {
        String str;
        String str2 = gVar.f190890d;
        StringBuilder sb = new StringBuilder();
        sb.append("doAuth ");
        cg4 cg4 = gVar.f190896j;
        String str3 = null;
        sb.append(cg4 != null ? Integer.valueOf(cg4.f182478f) : null);
        sb.append(", ");
        cg4 cg42 = gVar.f190896j;
        if (cg42 != null) {
            str3 = cg42.f182479g;
        }
        sb.append(str3);
        Log.m105924i(str2, sb.toString());
        String str4 = gVar.f190892f;
        int i = gVar.f190894h ? 2 : 1;
        String str5 = gVar.f190893g;
        boolean z2 = !z;
        cg4 cg43 = gVar.f190896j;
        int i2 = cg43 != null ? cg43.f182478f : 0;
        if (cg43 == null || (str = cg43.f182479g) == null) {
            str = "";
        }
        C62614l lVar = new C62614l(str4, i, str5, z2 ? 1 : 0, i2, str);
        lVar.mo85582k(gVar.getActivity(), gVar.getResources().getString(C0966R.string.ett), 500);
        C89059e i3 = lVar.mo9225i();
        AppCompatActivity activity = gVar.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI");
        i3.mo11397F((FinderGameLiveAuthUI) activity);
        i3.mo123420E(new C66295d(z, gVar));
    }

    /* renamed from: d3 */
    public final void mo90427d3() {
        View view = this.f190891e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d A[SYNTHETIC, Splitter:B:10:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 2131305515(0x7f09242b, float:1.8229203E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "findViewById(R.id.game_live_account_area)"
            gy3.C87412m.m108593f(r8, r0)
            r7.f190891e = r8
            te3.m44 r8 = new te3.m44
            r8.<init>()
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "KEY_POST_FROM_SHARE"
            byte[] r0 = r0.getByteArrayExtra(r1)
            r1 = 1
            java.lang.String r2 = "safeParser"
            r3 = 0
            java.lang.String r4 = ""
            r5 = 0
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            r8 = r5
            goto L_0x0038
        L_0x002b:
            r8.parseFrom(r0)     // Catch:{ Exception -> 0x002f }
            goto L_0x0038
        L_0x002f:
            r8 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r4, r0)
            goto L_0x0029
        L_0x0038:
            r7.f190895i = r8
            te3.cg4 r8 = new te3.cg4
            r8.<init>()
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r6 = "KEY_FROM_THIRD_PARTY_SHARE"
            byte[] r0 = r0.getByteArrayExtra(r6)
            if (r0 != 0) goto L_0x004d
        L_0x004b:
            r8 = r5
            goto L_0x005a
        L_0x004d:
            r8.parseFrom(r0)     // Catch:{ Exception -> 0x0051 }
            goto L_0x005a
        L_0x0051:
            r8 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r4, r0)
            goto L_0x004b
        L_0x005a:
            r7.f190896j = r8
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "KEY_APPID"
            java.lang.String r8 = r8.getStringExtra(r0)
            if (r8 != 0) goto L_0x0069
            r8 = r4
        L_0x0069:
            r7.f190892f = r8
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "KEY_TICKET"
            java.lang.String r8 = r8.getStringExtra(r0)
            if (r8 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r4 = r8
        L_0x0079:
            r7.f190893g = r4
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "KEY_FROM_SCAN"
            boolean r8 = r8.getBooleanExtra(r0, r3)
            r7.f190894h = r8
            java.lang.String r8 = r7.f190890d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCreate, "
            r0.append(r1)
            te3.cg4 r1 = r7.f190896j
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = r1.f182476d
            goto L_0x009b
        L_0x009a:
            r1 = r5
        L_0x009b:
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            te3.cg4 r2 = r7.f190896j
            if (r2 == 0) goto L_0x00ae
            int r2 = r2.f182478f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00af
        L_0x00ae:
            r2 = r5
        L_0x00af:
            r0.append(r2)
            r0.append(r1)
            te3.cg4 r2 = r7.f190896j
            if (r2 == 0) goto L_0x00bb
            java.lang.String r5 = r2.f182479g
        L_0x00bb:
            r0.append(r5)
            r0.append(r1)
            java.lang.String r1 = r7.f190893g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66309g.onCreate(android.os.Bundle):void");
    }
}
