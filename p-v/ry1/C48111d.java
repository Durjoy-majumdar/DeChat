package ry1;

import android.content.Context;
import android.content.DialogInterface;
import android.provider.Settings;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import nj3.C76879j;
import p159gw.C45962f;
import p237sp.C13753x;
import p237sp.C13754y;
import p237sp.C48457w;
import p680ru.C77570i;
import p749xh.C53352w2;
import p763ym.C79138l;
import p910lj.C76701a;
import qe3.C89625d;
import y41.C53493b;

/* renamed from: ry1.d */
public abstract class C48111d implements View.OnClickListener {

    /* renamed from: d */
    public int f128974d = -1;

    /* renamed from: e */
    public Context f128975e;

    /* renamed from: f */
    public C42039b f128976f = null;

    /* renamed from: g */
    public String f128977g;

    /* renamed from: h */
    public FileDownloadTaskInfo f128978h;

    /* renamed from: i */
    public C53352w2 f128979i;

    /* renamed from: j */
    public int f128980j;

    /* renamed from: n */
    public String f128981n;

    /* renamed from: o */
    public String f128982o;

    /* renamed from: ry1.d$a */
    public class C48112a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f128983d;

        public C48112a(boolean z) {
            this.f128983d = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14217, C48111d.this.f128976f.field_appId, 5, "", C48111d.this.f128976f.f149241I, 2);
            C48111d.this.mo72855a(this.f128983d);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: ry1.d$b */
    public class C48113b implements DialogInterface.OnClickListener {
        public C48113b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14217, C48111d.this.f128976f.field_appId, 6, "", C48111d.this.f128976f.f149241I, 2);
            dialogInterface.dismiss();
            Log.m105924i("MicroMsg.CommonGameClickLinstener", "addDownloadTask not wifi, user cancel");
        }
    }

    public C48111d(Context context) {
        this.f128975e = context;
    }

    /* renamed from: a */
    public final void mo72855a(boolean z) {
        Class cls = C13754y.class;
        if (z) {
            C42039b bVar = this.f128976f;
            C42091s.m45786i(bVar.f149241I, bVar.f149246N, bVar.f113255H1, bVar.field_appId, (String) null, "app_update");
        } else {
            C42039b bVar2 = this.f128976f;
            C42091s.m45786i(bVar2.f149241I, bVar2.f149246N, bVar2.f113255H1, bVar2.field_appId, (String) null, this.f128982o);
        }
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        C42039b bVar3 = this.f128976f;
        nVar.f110176a = bVar3.f149241I;
        nVar.f110177b = bVar3.f113265R1;
        nVar.f110178c = bVar3.f113266S1;
        nVar.f110179d = ((C79138l) C86312j.m106911c(C79138l.class)).mo74011hv(this.f128975e, this.f128976f);
        C42039b bVar4 = this.f128976f;
        nVar.f110182g = bVar4.field_appId;
        nVar.f110180e = bVar4.f149246N;
        nVar.f110184i = true;
        nVar.f110181f = 1;
        nVar.f110183h = bVar4.field_packageName;
        nVar.f110187l = bVar4.f113255H1;
        long c = bVar4.f113267T1 == 1 ? ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63957c(nVar) : ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63956b(nVar);
        C42039b bVar5 = this.f128976f;
        Log.m105925i("MicroMsg.CommonGameClickLinstener", " add download task result:[%d], appid[%s]，downloaerType[%d]", Long.valueOf(c), bVar5.field_appId, Integer.valueOf(bVar5.f113267T1));
        C42046d.m45755n(this.f128975e, this.f128976f.field_appId);
        C42039b bVar6 = this.f128976f;
        ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(9, new C53493b(bVar6.field_appId, bVar6.f113255H1, c, "", (String) null, 0));
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "CommonGameClickListener_addDownloadTask", hashCode());
    }

    /* renamed from: b */
    public void mo72856b(boolean z) {
        Class cls = C13753x.class;
        if (!NetStatusUtil.isNetworkConnected(this.f128975e)) {
            Context context = this.f128975e;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8t), 0).show();
            C42091s.m45784c().mo66050g(this.f128976f.field_appId, 803, false, (String) null);
            return;
        }
        C86709a0.m107528h();
        if (!C86709a0.m107535s().mo121147n()) {
            Context context2 = this.f128975e;
            C76701a.makeText(context2, (CharSequence) context2.getString(C0966R.string.f8x), 0).show();
            C42091s.m45784c().mo66050g(this.f128976f.field_appId, 804, false, (String) null);
        } else if (((C13753x) C86312j.m106911c(cls)).Ci0(this.f128976f.f113266S1) || ((C13753x) C86312j.m106911c(cls)).mo13122Um(this.f128976f.f113266S1)) {
            if (C89625d.f257836b.toLowerCase().contains("xiaomi")) {
                try {
                    if (Settings.Secure.getInt(this.f128975e.getContentResolver(), "install_non_market_apps") == 0 && !this.f128975e.getSharedPreferences("game_center_pref", 0).getBoolean("show_open_download_authority_tips", false)) {
                        C76879j.m92740k(this.f128975e, C0966R.string.fc4, C0966R.string.fc5, C0966R.string.f9f, C0966R.string.f7926wf, false, new C48115e(this), new C48116f(this));
                        this.f128975e.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_open_download_authority_tips", true).commit();
                    }
                } catch (Settings.SettingNotFoundException e) {
                    Log.m105921e("MicroMsg.CommonGameClickLinstener", "SettingNotFoundException ; %S", e.getMessage());
                }
            }
            if (Util.isNullOrNil(this.f128976f.f149241I) || Util.isNullOrNil(this.f128976f.f149246N)) {
                Log.m105918d("MicroMsg.CommonGameClickLinstener", "downloadApk: appdownloadurl is null or appmd5 is null, try gpDownload");
                if (Util.isNullOrNil(this.f128976f.f149247P)) {
                    Log.m105920e("MicroMsg.CommonGameClickLinstener", "downloadApk fail, gpDownloadUrl is null");
                } else {
                    Log.m105919d("MicroMsg.CommonGameClickLinstener", "downloadApk with gp, ret = %b", Boolean.valueOf(((C45962f) C86312j.m106911c(C45962f.class)).Qt0(this.f128975e, this.f128976f.f149247P)));
                }
                if (Util.isNullOrNil(this.f128976f.f149241I)) {
                    C42091s.m45784c().mo66050g(this.f128976f.field_appId, 700, false, (String) null);
                }
                if (Util.isNullOrNil(this.f128976f.f149246N)) {
                    C42091s.m45784c().mo66050g(this.f128976f.field_appId, C1862l.CTRL_INDEX, false, (String) null);
                    return;
                }
                return;
            }
            Context context3 = this.f128975e;
            C42039b bVar = this.f128976f;
            C40314g.m43488g(context3, bVar.f113254G1, bVar.f113255H1, bVar.f113256I1, 4, bVar.field_appId, this.f128980j, bVar.f113252E1, this.f128981n);
            if (NetStatusUtil.isWifi(this.f128975e)) {
                mo72855a(z);
                return;
            }
            C115669n.INSTANCE.mo160131h(14217, this.f128976f.field_appId, 4, "", this.f128976f.f149241I, 2);
            Context context4 = this.f128975e;
            C76879j.m92710D(context4, context4.getString(C0966R.string.lfa), this.f128975e.getString(C0966R.string.lfb), this.f128975e.getString(C0966R.string.lf6), this.f128975e.getString(C0966R.string.f7926wf), false, new C48112a(z), new C48113b(), C0966R.color.akw);
        } else {
            Context context5 = this.f128975e;
            C76701a.makeText(context5, (CharSequence) context5.getString(C0966R.string.f8u), 0).show();
            C42091s.m45784c().mo66050g(this.f128976f.field_appId, 804, false, (String) null);
        }
    }
}
