package com.tencent.p014mm.plugin.clean.p036ui.fileindexui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpURLConnectionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatLocaleUtil;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116271c0;
import com.tencent.p014mm.vfs.C116274d0;
import com.tencent.p014mm.vfs.C116300h1;
import com.tencent.wcdb.support.CancellationSignal;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86737h0;
import gy3.C87412m;
import h11.C98311d;
import i11.C98579b;
import i11.C98581d;
import i11.C98583e;
import j11.C98896e;
import j20.C117292a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import k11.C88067b0;
import k11.C99087z;
import k11.x$$a;
import k11.x$$b;
import k11.x$$c;
import k11.x$$d;
import k11.x$$e;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import wy0.C102506a;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI */
public class CleanNewUI extends MMActivity {

    /* renamed from: I */
    public static final String f267927I = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/readtemplate?t=w_safe&qqpimenter=shoushen");

    /* renamed from: A */
    public long f267928A = 0;

    /* renamed from: B */
    public long f267929B = 0;

    /* renamed from: C */
    public long f267930C = 0;

    /* renamed from: D */
    public C98579b f267931D;

    /* renamed from: E */
    public String f267932E = "com.tencent.qqpimsecure";

    /* renamed from: F */
    public String f267933F = "00B1208638DE0FCD3E920886D658DAF6";

    /* renamed from: G */
    public String f267934G = "11206657";

    /* renamed from: H */
    public JSONObject f267935H;

    /* renamed from: d */
    public boolean f267936d;

    /* renamed from: e */
    public boolean f267937e;

    /* renamed from: f */
    public View f267938f;

    /* renamed from: g */
    public View f267939g;

    /* renamed from: h */
    public View f267940h;

    /* renamed from: i */
    public View f267941i;

    /* renamed from: j */
    public View f267942j;

    /* renamed from: n */
    public View f267943n;

    /* renamed from: o */
    public View f267944o;

    /* renamed from: p */
    public TextView f267945p;

    /* renamed from: q */
    public TextView f267946q;

    /* renamed from: r */
    public TextView f267947r;

    /* renamed from: s */
    public TextView f267948s;

    /* renamed from: t */
    public TextView f267949t;

    /* renamed from: u */
    public TextView f267950u;

    /* renamed from: v */
    public Button f267951v;

    /* renamed from: w */
    public Button f267952w;

    /* renamed from: x */
    public Button f267953x;

    /* renamed from: y */
    public CancellationSignal f267954y;

    /* renamed from: z */
    public long f267955z = 0;

    /* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI$a */
    public class C2184a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f12167d;

        public C2184a(CleanNewUI cleanNewUI, long j) {
            this.f12167d = j;
        }

        public void run() {
            long j;
            int i;
            String o = C86709a0.m107535s().mo121148o();
            if (o == null) {
                o = "null";
            }
            String str = o;
            try {
                MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
                j = multiProcessMMKV.decodeLong("other_storage_other_account_" + C86709a0.m107523b().mo121111i(), -1);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.CleanNewUI", "get other_storage_other_account failed : " + th.getMessage());
                j = 0;
            }
            long j2 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
            long j3 = this.f12167d;
            long j4 = j >= 0 ? j3 - j : j3;
            int i2 = -1;
            if (j2 != -1) {
                float f = (float) j2;
                i2 = (int) ((((float) j3) / f) * 100.0f);
                i = (int) ((((float) j4) / f) * 100.0f);
            } else {
                i = -1;
            }
            C115669n.INSTANCE.mo160131h(25984, 50, "updateOtherRoot", "", "", Long.valueOf(j4), Long.valueOf(this.f12167d), str, 0, 0, 0, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    /* renamed from: H7 */
    public final boolean mo127437H7() {
        String str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CLEANUI_QQMGRINFO_STRING, "");
        if (Util.isNullOrNil(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f267935H = jSONObject;
            this.f267932E = jSONObject.getString("packageName");
            this.f267935H.get("md5");
            this.f267934G = this.f267935H.getString("launcherID");
            this.f267933F = this.f267935H.getString("signature");
            this.f267935H.get("url");
            this.f267935H.getLong("size");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CleanNewUI", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: I7 */
    public final void mo127438I7(long j) {
        View view = this.f267939g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f267947r.setText(C98311d.m127053b(j));
        this.f267952w.setEnabled(j > 0);
        this.f267952w.setVisibility(0);
    }

    /* renamed from: J7 */
    public void mo127439J7(int i, int i2) {
        C102506a aVar = C102506a.f301832a;
        if (!(WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_BLUE || BuildInfo.IS_FLAVOR_PURPLE)) {
            i = Math.min(i, i2);
        }
        MMHandlerThread.postToMainThread(new x$$b(this, i, i2));
    }

    /* renamed from: K7 */
    public final void mo127440K7(long j) {
        View view = this.f267940h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateMsgRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateMsgRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f267946q.setText(C98311d.m127053b(j));
        this.f267951v.setVisibility(0);
    }

    /* renamed from: L7 */
    public final void mo127441L7(long j) {
        View view = this.f267941i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f267948s.setText(C98311d.m127053b(j));
        if (j > 4294967296L) {
            ((C119157j) C119157j.f356862d).mo183875f(new C2184a(this, j));
        }
    }

    /* renamed from: M7 */
    public final void mo127442M7(long j) {
        long[] vx02 = C98896e.wx0().vx0();
        View view = this.f267938f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f267945p.setText(C98311d.m127053b(j));
        View view2 = this.f267943n;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f267944o;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i = (int) (getResources().getDisplayMetrics().density * 4.0f);
        int measuredWidth = this.f267942j.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.f267943n.getLayoutParams();
        long j2 = (long) measuredWidth;
        layoutParams.width = Math.max(i, (int) ((j2 * j) / vx02[1]));
        this.f267943n.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f267944o.getLayoutParams();
        layoutParams2.width = Math.max(i, (int) ((j2 * ((vx02[1] - vx02[0]) - j)) / vx02[1]));
        this.f267944o.setLayoutParams(layoutParams2);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b0h;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        long[] longArrayExtra;
        if (i == 1 && i2 == -1 && intent != null && this.f267931D != null && (longArrayExtra = intent.getLongArrayExtra("tagsResult")) != null && longArrayExtra.length == 16) {
            System.arraycopy(longArrayExtra, 0, this.f267936d ? this.f267931D.f289045g : this.f267931D.f289044f, 0, longArrayExtra.length);
            long j = 0;
            for (long j2 : longArrayExtra) {
                j += j2;
            }
            long j3 = (this.f267936d ? this.f267931D.f289041c : this.f267931D.f289040b) - j;
            long max = Math.max(0, this.f267931D.f289039a - j3);
            long max2 = Math.max(0, this.f267931D.f289040b - j3);
            long max3 = Math.max(0, this.f267931D.f289041c - j3);
            long j4 = this.f267936d ? max3 : max2;
            C98579b bVar = this.f267931D;
            bVar.f289039a = max;
            bVar.f289040b = max2;
            bVar.f289041c = max3;
            C98896e wx02 = C98896e.wx0();
            synchronized (C98896e.class) {
                wx02.f289906d = max;
                wx02.f289908f = j4;
            }
            mo127442M7(max);
            mo127438I7(j4);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f267936d = true;
        this.f267937e = getIntent().getBooleanExtra("verbose", false);
        setMMTitle((int) C0966R.string.f360278be3);
        setBackBtn(new x$$a(this));
        this.f267938f = (View) mo176895$(C0966R.C0970id.kbo);
        this.f267942j = (View) mo176895$(C0966R.C0970id.lnx);
        this.f267943n = (View) mo176895$(C0966R.C0970id.lnv);
        this.f267944o = (View) mo176895$(C0966R.C0970id.hpu);
        this.f267945p = (TextView) mo176895$(C0966R.C0970id.lnu);
        this.f267950u = (TextView) mo176895$(C0966R.C0970id.lnz);
        this.f267950u.setText(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FIRST_TIME_LOADING_DONE_BOOLEAN, false) ^ true ? C0966R.string.ct9 : C0966R.string.ct8);
        this.f267940h = (View) mo176895$(C0966R.C0970id.kbm);
        this.f267946q = (TextView) mo176895$(C0966R.C0970id.h2h);
        Button button = (Button) mo176895$(C0966R.C0970id.lnp);
        this.f267951v = button;
        button.setOnClickListener(new x$$c(this));
        this.f267939g = (View) mo176895$(C0966R.C0970id.kbl);
        this.f267947r = (TextView) mo176895$(C0966R.C0970id.apg);
        Button button2 = (Button) mo176895$(C0966R.C0970id.lno);
        this.f267952w = button2;
        button2.setOnClickListener(new x$$d(this));
        this.f267941i = (View) mo176895$(C0966R.C0970id.kbn);
        this.f267948s = (TextView) mo176895$(C0966R.C0970id.mgh);
        ((TextView) findViewById(C0966R.C0970id.i9c)).setText(C98311d.m127053b(C98896e.wx0().vx0()[0]));
        Button button3 = (Button) mo176895$(C0966R.C0970id.i9b);
        this.f267953x = button3;
        button3.setOnClickListener(new x$$e(this));
        if (WeChatLocaleUtil.isOverseasUserByWechatLanguage() || ChannelUtil.channelId == 1) {
            View findViewById = findViewById(C0966R.C0970id.i9e);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "initRoot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "initRoot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        try {
            HttpWrapperBase.Request request = new HttpWrapperBase.Request(0, (Map<String, String>) null, (Map<String, String>) null, (HttpWrapperBase.Attachment) null);
            request.protocal = HttpWrapperBase.PROTOCAL_HTTPS;
            request.host = "jtool.qq.com";
            request.uri = "/channel?productId=31&channelId=102133";
            new HttpURLConnectionWrapper((HttpURLConnection) new URL(request.getUrl()).openConnection()).asyncSend(request, new C88067b0(this, 0, (Map) null, ""), new MMHandler());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CleanNewUI", e, e.getMessage(), new Object[0]);
        }
        mo127439J7(0, 100);
        this.f267929B = System.currentTimeMillis();
        this.f267949t = this.f267945p;
        C99087z zVar = new C99087z(this);
        CancellationSignal cancellationSignal = this.f267954y;
        boolean z = this.f267937e;
        C116271c0 c0Var = C116271c0.f348905a;
        String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(System.currentTimeMillis()));
        C116274d0.f348937q = format;
        C87412m.m108593f(format, FFmpegMetadataRetriever.METADATA_KEY_DATE);
        ThreadPool.postAtFront(new C98581d(new C98583e(z, zVar), true, (C116300h1) null, cancellationSignal, (Runnable) null), "CleanScanFiles");
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(714, 52, 1, false);
        nVar.idkeyStat(714, 1, 1, false);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f267954y != null && this.f267955z > 0 && this.f267930C == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f267928A;
            if (j <= 0) {
                j = currentTimeMillis;
            }
            long j2 = j - this.f267955z;
            long j3 = this.f267929B;
            if (j3 > 0) {
                long j4 = this.f267930C;
                if (j4 > 0) {
                    currentTimeMillis = j4;
                }
                j2 += currentTimeMillis - j3;
            }
            Log.m105924i("MicroMsg.CleanNewUI", "Canceled scanning, time: " + j2);
            C102506a.m135309i(10, j2, new Long[0]);
        }
        CancellationSignal cancellationSignal = this.f267954y;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.f267954y = null;
        }
    }

    public void onResume() {
        long j;
        long j2;
        long j3;
        super.onResume();
        long j4 = 0;
        if (this.f267930C > 0 && this.f267928A > 0 && C98896e.wx0().f289906d != 0) {
            C98896e wx02 = C98896e.wx0();
            synchronized (C98896e.class) {
                j = wx02.f289906d;
                j2 = wx02.f289907e;
                j3 = wx02.f289908f;
            }
            mo127442M7(j);
            mo127440K7(j2);
            mo127438I7(j3);
            long j5 = (j - j2) - j3;
            if (j5 > 0) {
                j4 = j5;
            }
            mo127441L7(j4);
            this.f267953x.setEnabled(true);
        }
    }
}
