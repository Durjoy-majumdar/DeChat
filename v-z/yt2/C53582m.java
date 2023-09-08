package yt2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import h81.C32735h;
import hi2.C46072b;
import hi2.C46075u;
import kg3.C76577a;
import nj3.C76875f0;
import nj3.C76879j;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: yt2.m */
public final class C53582m implements C39160b {

    /* renamed from: a */
    public final Context f150584a;

    /* renamed from: yt2.m$a */
    public static final class C53583a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f150585d;

        /* renamed from: e */
        public final /* synthetic */ boolean f150586e;

        /* renamed from: f */
        public final /* synthetic */ Activity f150587f;

        public C53583a(C32226l<? super Boolean, C13598b0> lVar, boolean z, Activity activity) {
            this.f150585d = lVar;
            this.f150586e = z;
            this.f150587f = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C32735h.class;
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance$handleSelect$2");
            this.f150585d.invoke(Boolean.TRUE);
            if (this.f150586e) {
                C46075u uVar = C46075u.f124225a;
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_phoneix_video_duration, 30);
                Log.m105924i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Qe);
                uVar.mo71515c(this.f150587f, uVar.mo71514b("moments", Qe, ""));
            } else {
                C46072b bVar = C46072b.f124220a;
                Activity activity = this.f150587f;
                StringBuilder sb = new StringBuilder();
                String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=");
                Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Y60);
                C87412m.m108593f(Y60, "url");
                sb.append(Y60);
                sb.append("1101");
                bVar.mo71509c(activity, sb.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance$handleSelect$2");
        }
    }

    /* renamed from: yt2.m$b */
    public static final class C53584b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f150588d;

        public C53584b(C32226l<? super Boolean, C13598b0> lVar) {
            this.f150588d = lVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance$handleSelect$3");
            this.f150588d.invoke(Boolean.FALSE);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance$handleSelect$3");
        }
    }

    public C53582m(Context context) {
        C87412m.m108594g(context, "context");
        this.f150584a = context;
    }

    /* renamed from: a */
    public C76875f0 mo61964a() {
        SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        C76875f0 f0Var = new C76875f0(this.f150584a, 7, 0);
        f0Var.f224717i = C76577a.m92166q(this.f150584a, C0966R.string.c3j);
        SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return f0Var;
    }

    /* renamed from: b */
    public Object mo61965b(C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        Context context = this.f150584a;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        boolean b = C46072b.f124220a.mo71508b(activity, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        C76879j.m92739j(activity, b ? C0966R.string.f7988yg : C0966R.string.f7987yf, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new C53583a(lVar, b, activity), new C53584b(lVar));
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return b0Var;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
    }

    public boolean show() {
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_home_to_ponenix_enable, false);
        Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutEntrance: " + wf);
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return wf;
    }

    public int type() {
        SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        int a = C53572c.SECOND_CUT.mo74217a();
        SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return a;
    }
}
