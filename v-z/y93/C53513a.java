package y93;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d92.C107028a;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import g92.C59398d;
import gy3.C87412m;
import h81.C32735h;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import k92.C108976d;
import p248ug.C52572q0;
import te3.C110964i13;
import te3.i25;

/* renamed from: y93.a */
public class C53513a extends C108976d {

    /* renamed from: A */
    public static final Set<String> f150462A;

    /* renamed from: u */
    public WebViewUI f150463u;

    /* renamed from: v */
    public boolean f150464v = true;

    /* renamed from: w */
    public boolean f150465w = false;

    /* renamed from: x */
    public boolean f150466x = false;

    /* renamed from: y */
    public boolean f150467y;

    /* renamed from: z */
    public i25 f150468z;

    static {
        HashSet hashSet = new HashSet();
        f150462A = hashSet;
        hashSet.add(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        hashSet.add(C74928u.C45093i.f122315g);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        hashSet.add(C74928u.C45093i.f122318j);
        hashSet.add("geta8key_scene");
        hashSet.add(C74928u.C45093i.f122325q);
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
    }

    public C53513a(C107028a aVar, WebViewUI webViewUI) {
        super(aVar);
        this.f150463u = webViewUI;
        this.f150468z = new i25();
        if (this.f326423e.getIntent() != null) {
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151034IA(this.f326423e.getIntent().getExtras(), this.f150468z);
        }
        Log.m105925i("MicroMsg.WebMultiTaskHelper", "createWebMultiTaskHelper, WebViewUI:%s", Integer.valueOf(webViewUI.hashCode()));
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return this.f150463u.mo68243L8();
    }

    /* renamed from: B */
    public boolean mo67894B() {
        return true;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return this.f150463u.mo68243L8() && this.f326423e.mo67907g();
    }

    /* renamed from: D */
    public void mo35809D(int i, String str) {
        this.f150467y = true;
        super.mo35809D(i, str);
        if (!mo160082g() && ((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(this.f150463u.mo6901n0())) {
            MultiTaskInfo multiTaskInfo = this.f326418a;
            String format = String.format("%s#%s", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis()), this.f150463u.mo6901n0()}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            String mD5String = MD5Util.getMD5String(format);
            C87412m.m108593f(mD5String, "getMD5String(String.form…entTimeMillis(), rawUrl))");
            multiTaskInfo.field_id = mD5String;
            Log.m105925i("MicroMsg.WebMultiTaskHelper", "isMpArticle, url: %s", this.f150463u.mo6901n0());
        }
    }

    /* renamed from: E */
    public void mo74188E() {
        super.mo74188E();
        if (!this.f150466x) {
            this.f150466x = true;
        }
    }

    /* renamed from: F */
    public void mo74189F() {
        super.mo74189F();
        this.f150466x = false;
    }

    /* renamed from: G */
    public void mo67895G(boolean z) {
        mo67897d();
        mo124068H(z, 1);
    }

    /* renamed from: J */
    public boolean mo74190J() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitask_taskbar_disable_webview_capture_on_close, 0) != 0;
        Log.m105925i("MicroMsg.WebMultiTaskHelper", "shouldCaptureOnClose:%b", Boolean.valueOf(!z));
        return !z;
    }

    /* renamed from: U */
    public boolean mo67896U(int i, boolean z) {
        mo67897d();
        if (!this.f150465w) {
            this.f150464v = false;
        }
        return super.mo67896U(i, this.f150464v);
    }

    /* renamed from: V */
    public void mo74191V() {
    }

    /* renamed from: Z */
    public void mo74192Z() {
        C59398d dVar = this.f326427i;
        if (dVar != null) {
            dVar.stop();
        }
    }

    /* renamed from: c */
    public void mo74193c(Bitmap bitmap) {
        if (this.f150467y) {
            super.mo74193c(bitmap);
        }
    }

    /* renamed from: d */
    public void mo67897d() {
        try {
            C110964i13 i132 = this.f326420c;
            if (i132 != null) {
                i132.f332061h = this.f150463u.mo6901n0();
            }
            this.f150468z.f135051e = this.f150463u.mo6901n0();
            WebViewUIStyleHelper.C43828c a8 = this.f150463u.mo68270a8();
            if (a8 != null) {
                this.f326418a.mo80305m2().f183752e = a8.f118694d;
                this.f326418a.mo80305m2().f183756i = a8.f118693c;
                String str = this.f326418a.mo80305m2().f183751d;
                if (TextUtils.isEmpty(str)) {
                    str = a8.f118692b;
                }
                this.f326418a.mo80305m2().f183751d = str;
                i25 i25 = this.f150468z;
                i25.f135049I = a8.f118695e;
                int i = a8.f118697g;
                if (i == 16) {
                    i25.f135069z = i;
                    Uri parse = Uri.parse(i25.f135051e);
                    Uri.Builder buildUpon = parse.buildUpon();
                    if (Util.isNullOrNil(parse.getQueryParameter("item_show_type"))) {
                        buildUpon.appendQueryParameter("item_show_type", "16");
                    }
                    if (Util.isNullOrNil(parse.getQueryParameter(TPReportKeys.Common.COMMON_VID))) {
                        buildUpon.appendQueryParameter(TPReportKeys.Common.COMMON_VID, a8.f118699i);
                    }
                    Log.m105929w("MicroMsg.WebMultiTaskHelper", "fillMultiTaskInfo  rawUrl:%s,  vid:%s", this.f150463u.mo6901n0(), a8.f118699i);
                    this.f150468z.f135051e = buildUpon.build().toString();
                }
                Log.m105924i("MicroMsg.WebMultiTaskHelper", "fillMultiTaskInfo  webMultiTaskData.rawUrl:" + this.f150468z.f135051e + "   itemShowType:" + a8.f118697g);
            }
            String str2 = this.f326418a.mo80305m2().f183752e;
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f150463u.getIntent().getStringExtra("webpageTitle");
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f150463u.f118523f.getTitle();
            }
            this.f326418a.mo80305m2().f183752e = str2;
            this.f326418a.field_data = this.f150468z.toByteArray();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebMultiTaskHelper", e, "onMenuMultiTaskSelected", new Object[0]);
        }
    }

    /* renamed from: p */
    public Boolean mo74194p() {
        return Boolean.FALSE;
    }

    /* renamed from: s */
    public void mo74195s(Bitmap bitmap) {
        if (this.f150467y) {
            super.mo74195s(bitmap);
        }
    }

    /* renamed from: u */
    public MultiTaskInfo mo74196u() {
        MultiTaskInfo multiTaskInfo = this.f326418a;
        if (multiTaskInfo == null || multiTaskInfo.field_data == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        this.f326418a.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MultiTaskInfo createFromParcel = MultiTaskInfo.CREATOR.createFromParcel(obtain);
        createFromParcel.field_id = C56887p.m65610d(((C52572q0) C86312j.m106911c(C52572q0.class)).mo71610HS(this.f150463u.mo6901n0()));
        return createFromParcel;
    }

    /* renamed from: w */
    public void mo74197w(Bitmap bitmap, boolean z) {
        if (this.f150463u.mo68270a8() == null) {
            Log.m105924i("MicroMsg.WebMultiTaskHelper", "not MP page");
        } else if (z) {
            Log.m105924i("MicroMsg.WebMultiTaskHelper", "ended, remove historyTaskInfo");
            mo160072I();
        } else {
            Log.m105924i("MicroMsg.WebMultiTaskHelper", "not ended update historyTaskInfo");
            mo160073K(bitmap, true);
        }
    }
}
