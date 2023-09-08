package ry1;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import nd3.C47223a;
import nj3.C76879j;
import p159gw.C45962f;
import p237sp.C13749o;
import p237sp.C13754y;
import p237sp.C48456t;
import p237sp.C48457w;
import p680ru.C77570i;
import p749xh.C53352w2;
import p763ym.C79138l;
import p910lj.C76701a;
import uy1.C52642c;
import y41.C53493b;

/* renamed from: ry1.q */
public class C48148q extends C48111d {

    /* renamed from: ry1.q$a */
    public class C48149a implements DialogInterface.OnClickListener {
        public C48149a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C48148q.this.mo72896d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: ry1.q$b */
    public class C48150b implements DialogInterface.OnClickListener {
        public C48150b(C48148q qVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Log.m105924i("MicroMsg.GameClickListener", "resumeDownloadTask not wifi, user cancel");
        }
    }

    public C48148q(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final boolean mo72895c(long j) {
        Class cls = C48456t.class;
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j);
        if (nh != null && nh.field_downloadInWifi) {
            nh.field_downloadInWifi = false;
            ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
        }
        return ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63965m(j);
    }

    /* renamed from: d */
    public final void mo72896d() {
        Class cls = C13754y.class;
        C42039b bVar = this.f128976f;
        ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(10, new C53493b(bVar.field_appId, bVar.f113255H1, this.f128979i.field_downloadId, "", (String) null, 0));
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "GameClickListener_resumeDownloadTask", hashCode());
        if (((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63972t(this.f128979i.field_downloadId)) {
            C42046d.m45755n(this.f128975e, this.f128976f.field_appId);
            Context context = this.f128975e;
            C42039b bVar2 = this.f128976f;
            C40314g.m43488g(context, bVar2.f113254G1, bVar2.f113255H1, bVar2.f113256I1, 4, bVar2.field_appId, this.f128980j, bVar2.f113252E1, this.f128981n);
            return;
        }
        Log.m105920e("MicroMsg.GameClickListener", "resumeDownloadTask false");
        ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63970r(this.f128979i.field_downloadId);
        mo72856b(false);
    }

    /* renamed from: e */
    public final void mo72897e() {
        if (!NetStatusUtil.isNetworkConnected(this.f128975e)) {
            Context context = this.f128975e;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8t), 0).show();
        } else if (NetStatusUtil.isWifi(this.f128975e)) {
            mo72896d();
        } else {
            Context context2 = this.f128975e;
            C76879j.m92710D(context2, context2.getString(C0966R.string.lfa), this.f128975e.getString(C0966R.string.lfb), this.f128975e.getString(C0966R.string.lf6), this.f128975e.getString(C0966R.string.f7926wf), false, new C48149a(), new C48150b(this), C0966R.color.akw);
        }
    }

    public void onClick(View view) {
        boolean z;
        int i;
        int i2;
        if (view.getTag() instanceof C42039b) {
            this.f128976f = (C42039b) view.getTag();
            Log.m105924i("MicroMsg.GameClickListener", "Clicked appid = " + this.f128976f.field_appId);
            this.f128979i = ((C48456t) C86312j.m106911c(C48456t.class)).mo72822IX(this.f128976f.field_appId);
            FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(this.f128976f.field_appId);
            this.f128978h = o;
            long j = o.f12194d;
            this.f128974d = o.f12196f;
            this.f128977g = o.f12197g;
            if (((C79138l) C86312j.m106911c(C79138l.class)).Tb0(this.f128975e, this.f128976f.field_appId)) {
                C42039b bVar = this.f128976f;
                if (bVar instanceof C42039b) {
                    i2 = C52642c.m58992j(bVar.field_packageName);
                    i = this.f128976f.f113257J1;
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (i > i2) {
                    Log.m105925i("MicroMsg.GameClickListener", "AppId: %s installed, local: %d, server: %d", this.f128976f.field_appId, Integer.valueOf(i2), Integer.valueOf(i));
                    C42039b bVar2 = this.f128976f;
                    C42091s.m45786i(bVar2.f149241I, bVar2.f149246N, bVar2.f113255H1, bVar2.field_appId, (String) null, "app_update");
                    FileDownloadTaskInfo fileDownloadTaskInfo = this.f128978h;
                    int i3 = fileDownloadTaskInfo.f12196f;
                    if (i3 == 1) {
                        boolean c = mo72895c(fileDownloadTaskInfo.f12194d);
                        Log.m105924i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + c);
                    } else if (i3 == 2) {
                        mo72897e();
                    } else if (i3 != 3) {
                        mo72856b(true);
                    } else if (!C86013q1.m106450k(fileDownloadTaskInfo.f12197g) || C52642c.m58991i(this.f128978h.f12197g) <= i2) {
                        mo72856b(true);
                    } else {
                        ((C45962f) C86312j.m106911c(C45962f.class)).mo71272UC(this.f128975e, this.f128978h.f12197g, (C47223a) null);
                        Context context = this.f128975e;
                        C42039b bVar3 = this.f128976f;
                        C40314g.m43488g(context, bVar3.f113254G1, bVar3.f113255H1, bVar3.f113256I1, 8, bVar3.field_appId, this.f128980j, bVar3.f113252E1, this.f128981n);
                    }
                } else {
                    C42039b bVar4 = this.f128976f;
                    Log.m105925i("MicroMsg.GameClickListener", "launchFromWX, appId = %s, pkg = %s, openId = %s", bVar4.field_appId, bVar4.field_packageName, bVar4.field_openId);
                    Context context2 = this.f128975e;
                    C42039b bVar5 = this.f128976f;
                    C40314g.m43488g(context2, bVar5.f113254G1, bVar5.f113255H1, bVar5.f113256I1, 3, bVar5.field_appId, this.f128980j, bVar5.f113252E1, this.f128981n);
                    C42046d.m45751j(this.f128975e, this.f128976f.field_appId);
                }
            } else if (this.f128976f.mo65996u2()) {
                C52642c.m59002t(this.f128975e, this.f128976f.f113269V1.f128162e, "game_center_hv_game");
                Context context3 = this.f128975e;
                C42039b bVar6 = this.f128976f;
                C40314g.m43488g(context3, bVar6.f113254G1, bVar6.f113255H1, bVar6.f113256I1, 29, bVar6.field_appId, this.f128980j, bVar6.f113252E1, this.f128981n);
            } else {
                C42039b bVar7 = this.f128976f;
                C42091s.m45786i(bVar7.f149241I, bVar7.f149246N, bVar7.f113255H1, bVar7.field_appId, (String) null, this.f128982o);
                int i4 = this.f128974d;
                if (i4 == 1) {
                    boolean c2 = mo72895c(this.f128978h.f12194d);
                    Log.m105924i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + c2);
                } else if (i4 == 2) {
                    mo72897e();
                } else if (i4 != 3) {
                    mo72856b(false);
                } else {
                    if (!Util.isNullOrNil(this.f128977g) && C86013q1.m106450k(this.f128977g)) {
                        String str = this.f128977g;
                        String str2 = this.f128979i.field_md5;
                        MMHandler mMHandler = C52642c.f146980a;
                        Uri n = C116299g2.m163858n(str);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        String q = C86013q1.m106456q(C116299g2.m163865u(n));
                        if (Util.isNullOrNil(str2) || Util.isNullOrNil(q)) {
                            Log.m105924i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 is null");
                            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                            z = !l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b);
                        } else {
                            Log.m105925i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 = %s, calculateMD5 = %s", str2, q);
                            z = str2.equalsIgnoreCase(q);
                        }
                        if (z) {
                            C42039b bVar8 = this.f128976f;
                            String str3 = bVar8.field_appId;
                            int i5 = bVar8.f113255H1;
                            C53352w2 w2Var = this.f128979i;
                            long j2 = w2Var.field_downloadId;
                            String str4 = w2Var.field_channelId;
                            ((C13749o) C86312j.m106911c(C13749o.class)).gt0(j2, false, (C47223a) null);
                            Context context4 = this.f128975e;
                            C42039b bVar9 = this.f128976f;
                            C40314g.m43488g(context4, bVar9.f113254G1, bVar9.f113255H1, bVar9.f113256I1, 8, bVar9.field_appId, this.f128980j, bVar9.f113252E1, this.f128981n);
                            return;
                        }
                    }
                    mo72856b(false);
                }
            }
        } else {
            Log.m105920e("MicroMsg.GameClickListener", "No AppInfo");
        }
    }
}
