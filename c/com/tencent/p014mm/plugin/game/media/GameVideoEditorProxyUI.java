package com.tencent.p014mm.plugin.game.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.game.api.GameShareOption;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.C6048m1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ji3.C9457a;
import ly1.C99768q0;
import my1.C100022a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import nj3.C88989a;
import p500dy.C97560f;
import p682rz.C36594q;
import py1.C47654q1;
import qo3.C77407n;
import te3.C101783gu2;
import v10.C52735e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI */
public class GameVideoEditorProxyUI extends MMBaseActivity {

    /* renamed from: w */
    public static final String f271773w = (C41872f.m45392b(C41872f.C41873a.ONE_MONTH) + "haowan/");

    /* renamed from: e */
    public Context f271774e;

    /* renamed from: f */
    public int f271775f;

    /* renamed from: g */
    public String f271776g;

    /* renamed from: h */
    public String f271777h;

    /* renamed from: i */
    public String f271778i;

    /* renamed from: j */
    public SparseArray<GameShareOption> f271779j;

    /* renamed from: n */
    public GameShareOption f271780n = null;

    /* renamed from: o */
    public C77407n f271781o;

    /* renamed from: p */
    public C94554a f271782p;

    /* renamed from: q */
    public String f271783q = "";

    /* renamed from: r */
    public String f271784r = "";

    /* renamed from: s */
    public boolean f271785s = true;

    /* renamed from: t */
    public boolean f271786t = false;

    /* renamed from: u */
    public int f271787u = 0;

    /* renamed from: v */
    public CaptureDataManager.C94403b f271788v = new C94108a();

    /* renamed from: com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI$a */
    public class C94108a extends CaptureDataManager.C94404c {

        /* renamed from: com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI$a$a */
        public class C94109a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f271790d;

            /* renamed from: e */
            public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f271791e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f271792f;

            public C94109a(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
                this.f271790d = context;
                this.f271791e = captureVideoNormalModel;
                this.f271792f = bundle;
            }

            public void run() {
                int i;
                GameVideoEditorProxyUI gameVideoEditorProxyUI = GameVideoEditorProxyUI.this;
                Context context = this.f271790d;
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = this.f271791e;
                Bundle bundle = this.f271792f;
                bundle.putInt("game_haowan_source_scene_id", gameVideoEditorProxyUI.f271787u);
                C100022a.m130692f(captureVideoNormalModel, bundle);
                if (!captureVideoNormalModel.f272893d.booleanValue()) {
                    C76912y0.makeText(gameVideoEditorProxyUI.f271774e, (int) C0966R.string.fcl, 1).show();
                    Log.m105920e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video remux error");
                    return;
                }
                C100022a.m130694h(gameVideoEditorProxyUI.f271783q, captureVideoNormalModel);
                C100022a.m130693g(gameVideoEditorProxyUI.f271784r, captureVideoNormalModel);
                if (gameVideoEditorProxyUI.f271775f == 2) {
                    C101783gu2 gu22 = new C101783gu2();
                    gu22.f298309e = false;
                    gu22.f298308d = false;
                    String r = C86013q1.m106457r(captureVideoNormalModel.f272894e);
                    String str = captureVideoNormalModel.f272894e;
                    SightCaptureResult sightCaptureResult = r10;
                    SightCaptureResult sightCaptureResult2 = new SightCaptureResult(true, str, captureVideoNormalModel.f272895f, r, C86013q1.m106456q(str), (int) (captureVideoNormalModel.f272896g.longValue() / 1000), gu22);
                    if (captureVideoNormalModel.f272897h.booleanValue()) {
                        sightCaptureResult.f201515e = true;
                        i = 0;
                        sightCaptureResult.f201514d = false;
                        sightCaptureResult.f201523p = captureVideoNormalModel.f272895f;
                    } else {
                        i = 0;
                    }
                    int i2 = bundle.getInt("key_selected_item", i);
                    Object[] objArr = new Object[1];
                    objArr[i] = Integer.valueOf(i2);
                    Log.m105925i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: generated video, selected item is %d", objArr);
                    SparseArray<GameShareOption> sparseArray = gameVideoEditorProxyUI.f271779j;
                    GameShareOption gameShareOption = sparseArray == null ? null : sparseArray.get(i2);
                    Intent intent = new Intent();
                    if (gameShareOption != null && gameShareOption.f271647f) {
                        intent.putExtra("key_ext_url", gameVideoEditorProxyUI.mo129168E7((String) null, C100022a.m130687a(captureVideoNormalModel)));
                    }
                    intent.putExtra("key_req_result", sightCaptureResult);
                    intent.putExtra("key_selected_item", i2);
                    Activity activity = (Activity) context;
                    activity.setResult(-1, intent);
                    activity.finish();
                    return;
                }
                boolean booleanValue = ((Boolean) captureVideoNormalModel.mo129798a().mo129811b("KEY_VIDEO_IS_EDITED_BOOLEAN", Boolean.TRUE)).booleanValue();
                if (gameVideoEditorProxyUI.f271785s && booleanValue) {
                    C100022a.m130690d(captureVideoNormalModel.f272894e);
                }
                String a = C100022a.m130687a(captureVideoNormalModel);
                if (a == null) {
                    gameVideoEditorProxyUI.finish();
                    return;
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_video_info", a);
                Activity activity2 = (Activity) context;
                activity2.setResult(-1, intent2);
                activity2.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI$a$b */
        public class C94110b implements C11182m0 {
            public C94110b() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                for (int i = 0; i < GameVideoEditorProxyUI.this.f271779j.size(); i++) {
                    GameShareOption valueAt = GameVideoEditorProxyUI.this.f271779j.valueAt(i);
                    e0Var.mo107142f(valueAt.f271645d, valueAt.f271646e);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI$a$c */
        public class C94111c implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ Bundle f271795d;

            /* renamed from: e */
            public final /* synthetic */ CaptureDataManager.C94402a f271796e;

            public C94111c(Bundle bundle, CaptureDataManager.C94402a aVar) {
                this.f271795d = bundle;
                this.f271796e = aVar;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Log.m105925i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: user selected: %d", Integer.valueOf(menuItem.getItemId()));
                GameShareOption gameShareOption = GameVideoEditorProxyUI.this.f271779j.get(menuItem.getItemId());
                if (gameShareOption != null) {
                    this.f271795d.putInt("key_selected_item", gameShareOption.f271645d);
                    this.f271796e.mo129803a();
                    return;
                }
                Log.m105920e("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: non option!!");
            }
        }

        public C94108a() {
        }

        /* renamed from: i2 */
        public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            C9457a.m9137a(new C94109a(context, captureVideoNormalModel, bundle2));
        }

        /* renamed from: l1 */
        public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
            SparseArray<GameShareOption> sparseArray;
            bundle.putInt("key_video_from", GameVideoEditorProxyUI.this.f271775f);
            bundle.putString("key_raw_video_path", GameVideoEditorProxyUI.this.f271778i);
            bundle.putInt("key_raw_video_duration", GameVideoEditorProxyUI.this.f271782p.mo130041a());
            bundle.putInt("key_raw_video_size", (int) C86013q1.m106451l(GameVideoEditorProxyUI.this.f271778i));
            bundle.putInt("key_game_haowan_flag", 10);
            bundle.putInt("game_haowan_source_scene_id", GameVideoEditorProxyUI.this.f271787u);
            GameVideoEditorProxyUI gameVideoEditorProxyUI = GameVideoEditorProxyUI.this;
            if (gameVideoEditorProxyUI.f271775f == 2 && (sparseArray = gameVideoEditorProxyUI.f271779j) != null) {
                if (sparseArray.size() > 1) {
                    Log.m105924i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: more than 1 share options and need to show actionsheet");
                    C77407n nVar = GameVideoEditorProxyUI.this.f271781o;
                    if (nVar != null) {
                        nVar.mo107572p();
                    }
                    GameVideoEditorProxyUI.this.f271781o = new C77407n(context, 1, false);
                    C77407n nVar2 = GameVideoEditorProxyUI.this.f271781o;
                    nVar2.f225771i = new C94110b();
                    nVar2.f225782p = new C94111c(bundle, aVar);
                    nVar2.mo107573q();
                    return true;
                }
                GameShareOption gameShareOption = GameVideoEditorProxyUI.this.f271780n;
                if (gameShareOption != null) {
                    Log.m105925i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: only 1 option. use default, dafault id is %d", Integer.valueOf(gameShareOption.f271645d));
                    bundle.putInt("key_selected_item", GameVideoEditorProxyUI.this.f271780n.f271645d);
                } else {
                    Log.m105928w("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: no default option!");
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[SYNTHETIC, Splitter:B:23:0x0071] */
    /* renamed from: E7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo129168E7(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45371e()
            if (r0 == 0) goto L_0x000b
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
            py1.s1 r0 = r0.GeneralJumpInfo
            goto L_0x000f
        L_0x000b:
            com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()
            r0 = 0
        L_0x000f:
            if (r0 == 0) goto L_0x003b
            java.util.LinkedList<py1.k3> r1 = r0.f127993d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x003b
            java.util.LinkedList<py1.k3> r0 = r0.f127993d
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r0.next()
            py1.k3 r1 = (py1.C47614k3) r1
            int r2 = r1.f127835d
            r3 = 2
            if (r2 != r3) goto L_0x001f
            java.lang.String r2 = r1.f127837f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x001f
            java.lang.String r0 = r1.f127837f
            goto L_0x003d
        L_0x003b:
            java.lang.String r0 = "https://game.weixin.qq.com/cgi-bin/h5/static/appcenter/publish.html?ssid=5&scene=5"
        L_0x003d:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "?video_info="
            r1.append(r0)
            r0 = 1
            java.lang.String r2 = "MicroMsg.Haowan.GameVideoEditorProxyUI"
            r3 = 0
            if (r8 != 0) goto L_0x0071
            c30.g r8 = new c30.g
            r8.<init>()
            java.lang.String r4 = "videoUrl"
            r8.put(r4, r7)     // Catch:{ f -> 0x006c }
            java.lang.String r7 = "thumbUrl"
            android.content.Intent r4 = r6.getIntent()     // Catch:{ f -> 0x006c }
            java.lang.String r5 = "thumb_url"
            java.lang.String r4 = r4.getStringExtra(r5)     // Catch:{ f -> 0x006c }
            r8.put(r7, r4)     // Catch:{ f -> 0x006c }
        L_0x006c:
            java.lang.String r7 = r8.toString()
            goto L_0x0090
        L_0x0071:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007f }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x007f }
            org.json.JSONObject r7 = r7.getJSONObject(r3)     // Catch:{ JSONException -> 0x007f }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x007f }
            goto L_0x0090
        L_0x007f:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r7 = r7.getMessage()
            r8[r3] = r7
            java.lang.String r7 = "json_err:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r7, r8)
            java.lang.String r7 = ""
        L_0x0090:
            java.lang.String r7 = java.net.URLEncoder.encode(r7)
            r1.append(r7)
            java.lang.String r7 = "&from="
            r1.append(r7)
            int r7 = r6.f271775f
            r1.append(r7)
            java.lang.String r7 = "&appid="
            r1.append(r7)
            java.lang.String r7 = r6.f271777h
            r1.append(r7)
            java.lang.String r7 = "&game_info="
            r1.append(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r8 = "game_info"
            java.lang.String r7 = r7.getStringExtra(r8)
            r1.append(r7)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = r1.toString()
            r7[r3] = r8
            java.lang.String r8 = "publish url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r7)
            java.lang.String r7 = r1.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.media.GameVideoEditorProxyUI.mo129168E7(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: F7 */
    public final VideoTransPara mo129169F7() {
        C47654q1 q1Var;
        Class cls = C36594q.class;
        int i = this.f271775f;
        VideoTransPara id = (i == 3 || i == 5) ? ((C36594q) C86312j.m106911c(cls)).mo60739id(1) : ((C36594q) C86312j.m106911c(cls)).mo60739id(0);
        C47654q1 q1Var2 = null;
        if (C41853c.m45371e() != null) {
            q1Var = C41853c.f112797a.GameSight;
        } else {
            C41853c.m45381o();
            q1Var = null;
        }
        if (q1Var != null) {
            if (C41853c.m45371e() != null) {
                q1Var2 = C41853c.f112797a.GameSight;
            } else {
                C41853c.m45381o();
            }
            id.f267166d = (int) q1Var2.f127942e;
            id.f267167e = (int) q1Var2.f127943f;
            id.f267169g = (int) q1Var2.f127941d;
            id.f267173n = (int) q1Var2.f127944g;
            id.f267170h = (int) q1Var2.f127945h;
        }
        return id;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0099, code lost:
        if (r3.f273445c >= r3.f273446d) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0090, code lost:
        if (r3.f273446d >= r3.f273445c) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: G7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo129170G7() {
        /*
            r18 = this;
            r7 = r18
            android.view.Window r0 = r18.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = -3
            r0.setSystemUiVisibility(r1)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = f271773w
            r2.append(r3)
            java.lang.String r4 = "vsg_output_"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ".mp4"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.f271783q = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "vsg_thumb_"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ".jpg"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.f271784r = r0
            java.lang.String r1 = r7.f271778i
            java.lang.String r2 = r7.f271783q
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r0 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119433c(r1, r2, r0)
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r18.mo129169F7()
            r0.f272926n = r1
            r1 = 5
            r0.f272905F = r1
            com.tencent.mm.component.api.jumper.UICustomParam$b r1 = new com.tencent.mm.component.api.jumper.UICustomParam$b
            r1.<init>()
            r2 = 1
            r1.mo126651e(r2)
            r1.mo126653g(r2)
            r1.mo126649c(r2)
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r3 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3
            java.lang.String r4 = r7.f271778i
            int r3 = r3.getMp4RotateVFS(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0093
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 != r5) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            r5 = 270(0x10e, float:3.78E-43)
            if (r3 == r5) goto L_0x008a
            r5 = 90
            if (r3 != r5) goto L_0x009d
        L_0x008a:
            com.tencent.mm.plugin.sight.base.a r3 = r7.f271782p
            int r5 = r3.f273446d
            int r3 = r3.f273445c
            if (r5 < r3) goto L_0x009d
            goto L_0x009b
        L_0x0093:
            com.tencent.mm.plugin.sight.base.a r3 = r7.f271782p
            int r5 = r3.f273445c
            int r3 = r3.f273446d
            if (r5 < r3) goto L_0x009d
        L_0x009b:
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            if (r3 == 0) goto L_0x00af
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r1.f266587a
            r5 = 1058642330(0x3f19999a, float:0.6)
            r3.f266571d = r5
            r3.f266572e = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r3.f266573f = r5
            r3.f266574g = r5
        L_0x00af:
            r3 = 32
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r7, r3)
            int r5 = r7.f271775f
            r6 = 2131101833(0x7f060889, float:1.7816087E38)
            r8 = -1
            r9 = 2
            if (r5 == r9) goto L_0x00eb
            boolean r5 = r7.f271785s
            if (r5 == 0) goto L_0x00ce
            r0.f272938z = r4
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0.f272933u = r5
            r10 = 604800000(0x240c8400, double:2.988109026E-315)
            r0.f272909J = r10
            goto L_0x00d4
        L_0x00ce:
            r0.f272938z = r2
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r0.f272933u = r5
        L_0x00d4:
            com.tencent.mm.modelcontrol.VideoTransPara r5 = r0.f272926n
            int r5 = r5.f267170h
            int r5 = r5 * 1000
            r0.f272935w = r5
            r5 = 2131233241(0x7f0809d9, float:1.8082614E38)
            r10 = 2131830955(0x7f1128ab, float:1.9294922E38)
            java.lang.String r10 = r7.getString(r10)
            r1.mo126655i(r5, r6, r10, r3)
            goto L_0x0239
        L_0x00eb:
            r0.f272938z = r2
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r0.f272933u = r5
            r5 = 7200000(0x6ddd00, float:1.0089349E-38)
            r0.f272935w = r5
            r0.f272919d = r9
            android.content.Intent r5 = r18.getIntent()
            java.lang.String r10 = "ext_data"
            android.os.Bundle r5 = r5.getBundleExtra(r10)
            r10 = 2131821687(0x7f110477, float:1.9276124E38)
            if (r5 == 0) goto L_0x01c7
            java.lang.String r11 = "k_ext_wording"
            java.lang.String r11 = r5.getString(r11)
            java.lang.String r12 = "k_preferred_trans_param"
            android.os.Parcelable r12 = r5.getParcelable(r12)
            com.tencent.mm.modelcontrol.VideoTransPara r12 = (com.tencent.p014mm.modelcontrol.VideoTransPara) r12
            java.lang.String r13 = "MicroMsg.Haowan.GameVideoEditorProxyUI"
            if (r12 == 0) goto L_0x012a
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r15 = r12.toString()
            r14[r4] = r15
            java.lang.String r15 = "hy: has given trasn params: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r14)
            r0.f272926n = r12
        L_0x012a:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 != 0) goto L_0x0142
            android.content.res.Resources r12 = r18.getResources()
            int r6 = r12.getColor(r6)
            r12 = 1099431936(0x41880000, float:17.0)
            com.tencent.mm.component.api.jumper.UICustomParam r14 = r1.f266587a
            r14.f266580p = r11
            r14.f266581q = r6
            r14.f266582r = r12
        L_0x0142:
            java.lang.String r6 = "k_ext_share_options"
            java.util.ArrayList r6 = r5.getParcelableArrayList(r6)
            if (r6 == 0) goto L_0x018d
            int r11 = r6.size()
            if (r11 <= 0) goto L_0x018d
            java.lang.Object r11 = r6.get(r4)
            com.tencent.mm.plugin.game.api.GameShareOption r11 = (com.tencent.p014mm.plugin.game.api.GameShareOption) r11
            r7.f271780n = r11
            int r11 = r6.size()
            if (r11 != r2) goto L_0x0167
            com.tencent.mm.plugin.game.api.GameShareOption r10 = r7.f271780n
            java.lang.String r10 = r10.f271646e
            r1.mo126655i(r4, r4, r10, r3)
            goto L_0x016e
        L_0x0167:
            java.lang.String r10 = r7.getString(r10)
            r1.mo126655i(r4, r4, r10, r3)
        L_0x016e:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r7.f271779j = r3
            java.util.Iterator r3 = r6.iterator()
        L_0x0179:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0194
            java.lang.Object r6 = r3.next()
            com.tencent.mm.plugin.game.api.GameShareOption r6 = (com.tencent.p014mm.plugin.game.api.GameShareOption) r6
            android.util.SparseArray<com.tencent.mm.plugin.game.api.GameShareOption> r10 = r7.f271779j
            int r11 = r6.f271645d
            r10.put(r11, r6)
            goto L_0x0179
        L_0x018d:
            java.lang.String r6 = r7.getString(r10)
            r1.mo126655i(r4, r4, r6, r3)
        L_0x0194:
            java.lang.String r3 = "minDuration"
            int r3 = r5.getInt(r3, r8)
            if (r3 <= 0) goto L_0x01a1
            int r3 = r3 * 1000
            r0.f272936x = r3
        L_0x01a1:
            java.lang.String r3 = "maxDuration"
            int r3 = r5.getInt(r3, r8)
            if (r3 <= 0) goto L_0x01ae
            int r3 = r3 * 1000
            r0.f272935w = r3
        L_0x01ae:
            java.lang.Object[] r3 = new java.lang.Object[r9]
            int r6 = r0.f272936x
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r4] = r6
            int r6 = r0.f272935w
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r2] = r6
            java.lang.String r6 = "zbq:minRecordTimeMs:%d,maxRecordTimeMs:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r6, r3)
            goto L_0x01ce
        L_0x01c7:
            java.lang.String r6 = r7.getString(r10)
            r1.mo126655i(r4, r4, r6, r3)
        L_0x01ce:
            r1.mo126654h(r2)
            java.lang.String r3 = "k_ext_editor_from"
            int r3 = r5.getInt(r3, r4)
            if (r3 == r2) goto L_0x01db
            goto L_0x0239
        L_0x01db:
            java.lang.String r3 = "k_ext_tool_bars"
            java.util.ArrayList r3 = r5.getStringArrayList(r3)
            if (r3 == 0) goto L_0x0239
            int r5 = r3.size()
            if (r5 != 0) goto L_0x01eb
            goto L_0x0239
        L_0x01eb:
            r1.mo126647a(r2)
            r1.mo126650d(r2)
            r1.mo126654h(r2)
            r1.mo126652f(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x01fb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0239
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "emoji"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0213
            r1.mo126647a(r4)
            goto L_0x01fb
        L_0x0213:
            java.lang.String r6 = "music"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0220
            r1.mo126650d(r4)
            goto L_0x01fb
        L_0x0220:
            java.lang.String r6 = "text"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x022d
            r1.mo126652f(r4)
            goto L_0x01fb
        L_0x022d:
            java.lang.String r6 = "crop"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01fb
            r1.mo126654h(r4)
            goto L_0x01fb
        L_0x0239:
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r1.f266587a
            r0.f272927o = r1
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$b r3 = r7.f271788v
            r1.f272891a = r3
            hh2.a r1 = hh2.C8532a.f27585a
            android.content.Context r3 = r7.f271774e
            r5 = 121(0x79, float:1.7E-43)
            r6 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r10 = r3
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.String r11 = "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI"
            android.content.Intent r11 = r1.mo9442a(r10, r11, r9)
            if (r11 != 0) goto L_0x0259
            r2 = 0
            goto L_0x029c
        L_0x0259:
            java.lang.String r12 = "KEY_PARAMS_CONFIG"
            r11.putExtra(r12, r0)
            java.lang.String r12 = "KEY_PARAMS_TO_WHERE"
            r11.putExtra(r12, r9)
            java.lang.String r9 = "KEY_PARAMS_EXIT_ANIM"
            r11.putExtra(r9, r8)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r4] = r0
            java.lang.String r0 = "MicroMsg.VideoCaptureJumper"
            java.lang.String r4 = "configProvider: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r9)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.mo10233c(r4)
            r0.mo10233c(r11)
            java.lang.Object[] r11 = r0.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper"
            java.lang.String r13 = "jumpToEditViewForResult"
            java.lang.String r14 = "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;I)Z"
            java.lang.String r15 = "android/app/Activity"
            java.lang.String r16 = "startActivityForResult"
            java.lang.String r17 = "(Landroid/content/Intent;I)V"
            j20.C117292a.m165364j(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.mo9443b(r3, r6, r8)
        L_0x029c:
            if (r2 == 0) goto L_0x02b2
            r1 = 87
            r2 = 8763(0x223b, float:1.228E-41)
            r3 = 0
            r4 = 1
            int r5 = r7.f271787u
            int r0 = r7.f271775f
            r6 = 0
            java.lang.String r6 = w10.C15032a.m14200a(r0, r6)
            r0 = r18
            com.tencent.p014mm.game.report.C40314g.m43484c(r0, r1, r2, r3, r4, r5, r6)
        L_0x02b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.media.GameVideoEditorProxyUI.mo129170G7():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r21, int r22, android.content.Intent r23) {
        /*
            r20 = this;
            r7 = r20
            r8 = r22
            r9 = r23
            java.lang.Class<ym.t> r10 = p763ym.C39072t.class
            super.onActivityResult(r21, r22, r23)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.Haowan.GameVideoEditorProxyUI"
            java.lang.String r4 = "requestCode:%d, resultCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            r0 = -1
            r11 = 3
            r4 = 121(0x79, float:1.7E-43)
            r5 = r21
            if (r5 != r4) goto L_0x0148
            java.lang.String r4 = "key_video_info"
            r5 = 0
            r12 = 0
            if (r8 != r0) goto L_0x004b
            if (r9 == 0) goto L_0x0148
            int r0 = r7.f271775f
            if (r0 == r11) goto L_0x003e
            boolean r0 = r7.f271786t
            if (r0 == 0) goto L_0x0148
        L_0x003e:
            java.lang.String r0 = r9.getStringExtra(r4)
            ly1.q0 r1 = new ly1.q0
            r1.<init>(r7, r5, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r12)
            return
        L_0x004b:
            if (r8 == 0) goto L_0x0133
            r6 = 3000(0xbb8, float:4.204E-42)
            if (r8 == r6) goto L_0x0133
            r6 = 3001(0xbb9, float:4.205E-42)
            if (r8 != r6) goto L_0x0057
            goto L_0x0133
        L_0x0057:
            r6 = 888(0x378, float:1.244E-42)
            if (r8 != r6) goto L_0x00d7
            java.lang.String r6 = "video edit in background"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            java.lang.String r6 = "key_thumb_path"
            java.lang.String r6 = r9.getStringExtra(r6)
            java.lang.String r8 = r7.f271778i
            java.lang.String r15 = my1.C100022a.m130688b(r6, r8)
            java.lang.String r6 = "key_bg_mix_task_id"
            java.lang.String r6 = r9.getStringExtra(r6)
            java.lang.String r8 = "key_video_duration"
            int r8 = r9.getIntExtra(r8, r2)
            long r12 = (long) r8
            int r16 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r12)
            com.tencent.mm.plugin.sight.base.a r8 = r7.f271782p
            int r12 = r8.f273445c
            int r13 = r8.f273446d
            int r8 = r8.f273456n
            r14 = 90
            if (r8 == r14) goto L_0x0097
            r14 = 270(0x10e, float:3.78E-43)
            if (r8 != r14) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            r18 = r12
            r17 = r13
            goto L_0x009b
        L_0x0097:
            r17 = r12
            r18 = r13
        L_0x009b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "weixin://bgmixid/"
            r8.append(r12)
            r8.append(r6)
            java.lang.String r14 = r8.toString()
            r19 = 0
            java.lang.String r6 = com.tencent.p014mm.plugin.webview.model.C43702g2.m47536i(r14, r15, r16, r17, r18, r19)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            java.lang.String r2 = "videoInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
            r9.putExtra(r4, r6)
            int r1 = r7.f271775f
            if (r1 == r11) goto L_0x00c8
            boolean r1 = r7.f271786t
            if (r1 == 0) goto L_0x0149
        L_0x00c8:
            java.lang.String r0 = r9.getStringExtra(r4)
            ly1.q0 r1 = new ly1.q0
            r1.<init>(r7, r5, r0)
            r2 = 0
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r2)
            return
        L_0x00d7:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r0[r2] = r4
            java.lang.String r2 = "video check error: [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            java.lang.String r2 = "failid"
            r0.put(r2, r1)
            android.content.Context r12 = r7.f271774e
            r13 = 87
            r14 = 8763(0x223b, float:1.228E-41)
            r15 = 2
            r16 = 56
            int r1 = r7.f271787u
            int r2 = r7.f271775f
            java.lang.String r18 = w10.C15032a.m14200a(r2, r0)
            r17 = r1
            com.tencent.p014mm.game.report.C40314g.m43484c(r12, r13, r14, r15, r16, r17, r18)
            android.content.Context r0 = r7.f271774e
            r1 = 2131830961(0x7f1128b1, float:1.9294934E38)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (int) r1, (int) r3)
            r0.show()
            int r0 = r7.f271775f
            if (r0 != r11) goto L_0x0148
            r7.setResult(r8, r9)
            r20.finish()
            di3.d r0 = di3.C86312j.m106911c(r10)
            r1 = r0
            ym.t r1 = (p763ym.C39072t) r1
            java.lang.String r2 = r7.f271776g
            java.lang.String r4 = r7.f271777h
            r5 = -3
            java.lang.String r3 = "Invalid video format"
            java.lang.String r6 = "Invalid video format"
            r1.r10(r2, r3, r4, r5, r6)
            return
        L_0x0133:
            r1 = 87
            r2 = 8763(0x223b, float:1.228E-41)
            r3 = 1
            r4 = 2
            int r6 = r7.f271787u
            int r0 = r7.f271775f
            java.lang.String r12 = w10.C15032a.m14200a(r0, r5)
            r0 = r20
            r5 = r6
            r6 = r12
            com.tencent.p014mm.game.report.C40314g.m43484c(r0, r1, r2, r3, r4, r5, r6)
        L_0x0148:
            r0 = r8
        L_0x0149:
            r7.setResult(r0, r9)
            r20.finish()
            int r0 = r7.f271775f
            if (r0 != r11) goto L_0x0166
            di3.d r0 = di3.C86312j.m106911c(r10)
            r1 = r0
            ym.t r1 = (p763ym.C39072t) r1
            java.lang.String r2 = r7.f271776g
            java.lang.String r4 = r7.f271777h
            r5 = 0
            java.lang.String r3 = ""
            java.lang.String r6 = ""
            r1.r10(r2, r3, r4, r5, r6)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.media.GameVideoEditorProxyUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.f271774e = this;
        this.f271775f = getIntent().getIntExtra("from", -1);
        this.f271776g = getIntent().getStringExtra("business_type");
        this.f271777h = getIntent().getStringExtra("appid");
        this.f271778i = getIntent().getStringExtra("video_path");
        Bundle bundleExtra = getIntent().getBundleExtra("ext_data");
        if (bundleExtra != null) {
            this.f271786t = bundleExtra.getBoolean("game_straight_to_publish", false);
        }
        this.f271787u = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        boolean equals = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_VIDEO_IS_BG_MIX_STRING, "1").equals("1");
        boolean z = ((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_video_open_bg_mix, 1) == 1;
        Log.m105925i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video bg mix, debugOpen:%b, xLabOpen:%b", Boolean.valueOf(equals), Boolean.valueOf(z));
        if (!equals || !z) {
            this.f271785s = false;
        } else {
            this.f271785s = true;
        }
        Log.m105925i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video_path:%s", this.f271778i);
        this.f271782p = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(this.f271778i);
        if (getIntent().getBooleanExtra("need_edit", false)) {
            if (this.f271782p == null) {
                Log.m105920e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video is error");
                finish();
            } else {
                mo129170G7();
            }
        } else if (Util.isNullOrNil(this.f271778i)) {
            MMHandlerThread.postToMainThreadDelayed(new C99768q0(this, getIntent().getStringExtra("video_url"), (String) null), 0);
        } else if (this.f271782p == null) {
            Log.m105920e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video is error");
            finish();
        } else {
            VideoTransPara F7 = mo129169F7();
            if (C86013q1.m106451l(this.f271778i) > DownloadHelper.SAVE_LENGTH || (F7 != null && F7.f267170h < this.f271782p.mo130041a())) {
                Log.m105925i("MicroMsg.Haowan.GameVideoEditorProxyUI", "videoLength(%d) > %d or videoDuration(%d) > paramDuration(%d), needEdit is invalid", Long.valueOf(C86013q1.m106451l(this.f271778i)), 104857600, Integer.valueOf(this.f271782p.mo130041a()), Integer.valueOf(F7.f267170h));
                mo129170G7();
            } else {
                String str2 = f271773w + "vsg_output_" + System.currentTimeMillis() + ".mp4";
                String str3 = this.f271778i;
                if (!str3.equals(str2)) {
                    C86013q1.m106461v(C86013q1.m106458s(str2));
                    C86013q1.m106442c(str3, str2);
                }
                this.f271778i = str2;
                WebViewJSSDKVideoItem c = C100022a.m130689c(str2);
                if (c == null) {
                    str = null;
                } else {
                    String b = C100022a.m130688b((String) null, str2);
                    WebViewJSSDKFileItem b2 = C6048m1.f22342b.mo7010b(b);
                    if (b2 != null) {
                        c.f283023f = b2.f283024g;
                    }
                    c.f283036v.putInt("mark_edit_flag", 0);
                    str = C43702g2.m47536i(c.f283022e, b, c.f22269w, c.f283031q, c.f283030p, c.f283029o);
                }
                if (str == null) {
                    finish();
                } else {
                    MMHandlerThread.postToMainThreadDelayed(new C99768q0(this, (String) null, str), 0);
                }
            }
        }
        Log.m105924i("MicroMsg.Haowan.GameVideoEditorProxyUI", "onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
