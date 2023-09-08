package dp1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cm1.C55033u;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60169f4;
import ht1.C60172g4;
import java.util.HashMap;
import java.util.List;
import jq3.C60905o;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C64772vh0;
import up1.C65426w0;
import z04.C112550d0;

/* renamed from: dp1.j */
public final class C58375j extends UIComponent {

    /* renamed from: d */
    public HashMap<String, C58376a> f167201d = new HashMap<>();

    /* renamed from: e */
    public int f167202e;

    /* renamed from: f */
    public final List<String> f167203f = C64197v.m75537f(".ui.AppBrandPluginUI", ".launching.AppBrandLaunchProxyUI", ".ui.SnsAdNativeLandingPagesPreviewUI");

    /* renamed from: g */
    public boolean f167204g;

    /* renamed from: h */
    public boolean f167205h;

    /* renamed from: dp1.j$a */
    public static final class C58376a {

        /* renamed from: a */
        public long f167206a;

        /* renamed from: b */
        public long f167207b;

        /* renamed from: c */
        public int f167208c;

        /* renamed from: d */
        public long f167209d;

        public C58376a() {
            this(0, 0, 0, 0, 15, (C8480h) null);
        }

        public C58376a(long j, long j2, int i, long j3, int i2, C8480h hVar) {
            j = (i2 & 1) != 0 ? 0 : j;
            j2 = (i2 & 2) != 0 ? 0 : j2;
            i = (i2 & 4) != 0 ? 0 : i;
            j3 = (i2 & 8) != 0 ? 0 : j3;
            this.f167206a = j;
            this.f167207b = j2;
            this.f167208c = i;
            this.f167209d = j3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58375j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo83140c3(C60905o oVar, C49712hj1 hj12, C55033u uVar, int i) {
        String str;
        C49712hj1 hj13 = hj12;
        C55033u uVar2 = uVar;
        C60905o oVar2 = oVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(uVar2, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        C64772vh0 vh02 = uVar2.f154492d.mo89532o2().advertisement_info;
        if (vh02 == null || (str = vh02.f185889g) == null) {
            str = "";
        }
        String str2 = str;
        C60169f4 f4Var = (C60169f4) C86312j.m106911c(C60169f4.class);
        String str3 = null;
        String str4 = hj13 != null ? hj13.f134670d : null;
        String str5 = hj13 != null ? hj13.f134671e : null;
        if (hj13 != null) {
            str3 = hj13.f134672f;
        }
        f4Var.mo83323Z6(str4, str5, str3, hj13 != null ? hj13.f134675i : 0, uVar2.f154492d.field_feedId, uVar, this.f167202e, oVar.mo17363j(), i, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.f185886d;
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c30.C104289g mo83141d3(cm1.C55033u r2) {
        /*
            r1 = this;
            up1.w0 r2 = r2.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r2.mo89532o2()
            te3.vh0 r2 = r2.advertisement_info
            if (r2 == 0) goto L_0x0011
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.f185886d
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = r2.ext_info
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "{}"
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x002b
        L_0x0022:
            c30.g r0 = new c30.g
            gy3.C87412m.m108591d(r2)
            r0.<init>((java.lang.String) r2)
            goto L_0x0030
        L_0x002b:
            c30.g r0 = new c30.g
            r0.<init>()
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58375j.mo83141d3(cm1.u):c30.g");
    }

    /* renamed from: e3 */
    public final void mo83142e3(C60905o oVar, C55033u uVar) {
        String str;
        C60905o oVar2 = oVar;
        C55033u uVar2 = uVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(uVar2, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        if (uVar2.f154492d.mo89544z2()) {
            C65426w0 w0Var = uVar2.f154492d;
            long j = w0Var.field_feedId;
            long n2 = w0Var.mo89531n2();
            C39818r rVar = C39818r.f106831a;
            Context context = oVar2.f173499A;
            C87412m.m108593f(context, "holder.context");
            C49712hj1 q3 = ((C60172g4) rVar.mo62443b(context).mo62447c(C60172g4.class)).mo12861q3();
            int i = q3 != null ? q3.f134675i : 0;
            C64772vh0 vh02 = uVar2.f154492d.mo89532o2().advertisement_info;
            if (vh02 == null || (str = vh02.f185890h) == null) {
                str = "";
            }
            String str2 = str;
            Log.m105924i("Finder.CommentAdReportMgr", "onClick commentId=" + n2);
            C7335d c = C86312j.m106911c(C60169f4.class);
            C87412m.m108593f(c, "getService(IFinderReportLogic::class.java)");
            C60169f4.C60170a.m70169a((C60169f4) c, j, i, n2, false, true, 138, mo83141d3(uVar2), str2, 0, 0, 0, 0, 3840, (Object) null);
            mo83140c3(oVar2, q3, uVar2, 3);
        }
    }

    /* renamed from: f3 */
    public final C58376a mo83143f3(long j, long j2) {
        HashMap<String, C58376a> hashMap = this.f167201d;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('#');
        sb.append(j2);
        String sb4 = sb.toString();
        C58376a aVar = hashMap.get(sb4);
        if (aVar == null) {
            aVar = new C58376a(0, 0, 0, 0, 15, (C8480h) null);
            hashMap.put(sb4, aVar);
        }
        return aVar;
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
        String str;
        ComponentName component;
        super.onStartActivityForResult(intent, i, bundle);
        if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
            str = "";
        }
        for (String u : this.f167203f) {
            if (C112550d0.m153801u(str, u, false)) {
                Log.m105924i("Finder.CommentAdReportMgr", "onStartActivityForResult starting half screen activity, name=" + str);
                this.f167204g = true;
            }
        }
    }
}
