package com.tencent.p014mm.plugin.recordvideo.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.RecordPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d62.C7250m;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import eh2.C97642b;
import fh2.C97884j;
import gy3.C87412m;
import h81.C32735h;
import hi2.C98453h;
import hi2.C98466p;
import ih2.C60287a;
import java.util.HashSet;
import kg3.C76577a;
import kotlin.Metadata;
import nc3.C34767b;
import nj3.C76879j;
import nj3.C88989a;
import p158gt.C98204q;
import p232rw.C77573p;
import p511ew.C58849b;
import p80.C110193b;
import pc0.C100760a0;
import qo3.C89779i0;
import sp3.C110803f;
import th2.C101891f;
import th2.C110992d;
import vg2.C52907a;
import vg2.C65744b;
import vo3.C90852c;
import xg2.C102634a;
import xg2.C102635b;
import xg2.C102639c;
import xg2.C102640d;
import zg2.C103021n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/activity/MMRecordUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI */
public class MMRecordUI extends MMActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f272841o = 0;

    /* renamed from: d */
    public C97642b f272842d;

    /* renamed from: e */
    public RecordConfigProvider f272843e;

    /* renamed from: f */
    public C102634a f272844f = new C102634a();

    /* renamed from: g */
    public C102635b f272845g;

    /* renamed from: h */
    public ViewGroup f272846h;

    /* renamed from: i */
    public C34767b.C34768c f272847i;

    /* renamed from: j */
    public boolean f272848j;

    /* renamed from: n */
    public int f272849n = -1;

    /* renamed from: H7 */
    public final void mo129782H7() {
        ViewGroup.LayoutParams layoutParams;
        if (C85875k4.m106207v()) {
            RecordConfigProvider recordConfigProvider = this.f272843e;
            boolean z = true;
            if (recordConfigProvider == null || !recordConfigProvider.f272913N) {
                z = false;
            }
            if (z) {
                getContext().getWindow().getDecorView().setBackgroundColor(C76577a.m92153d(getContext(), C0966R.color.f3131gg));
                int i = C75044y4.m89990b(getContext()).y;
                int i2 = (int) (((float) i) * 0.5625f);
                ViewGroup viewGroup = this.f272846h;
                if (!(viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null)) {
                    layoutParams.width = i2;
                    layoutParams.height = i;
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
                    } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
                    } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
                    }
                }
                int i3 = C60287a.f171906a;
                C60287a.f171906a = i2;
                C60287a.f171907b = i;
                return;
            }
        }
        ViewGroup viewGroup2 = this.f272846h;
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.LayoutParams layoutParams3 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = -1;
        }
        ViewGroup viewGroup3 = this.f272846h;
        if (viewGroup3 != null) {
            layoutParams2 = viewGroup3.getLayoutParams();
        }
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
        }
        int i4 = C60287a.f171906a;
        C60287a.f171906a = C75044y4.m89990b(getContext()).x;
        C60287a.f171907b = C75044y4.m89990b(getContext()).y;
    }

    /* renamed from: I7 */
    public final void mo129783I7() {
        Intent intent = new Intent();
        intent.putExtra("report", C110992d.f332425a.mo162676j());
        setResult(0, intent);
        C101891f.f300035a.mo141375i(2, 3);
        finish();
    }

    public void finish() {
        Log.m105924i("MicroMsg.MMRecordUI", "finish  " + hashCode());
        super.finish();
        C98466p.f288808a.mo137836a();
        CaptureDataManager.f272890c.f272891a = null;
        Log.m105924i("MicroMsg.SightRecordConfig", "unInit");
        C97884j.f287168e = false;
        C103021n nVar = C103021n.f303991a;
        nVar.getClass();
        Log.m105924i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler resumeBgMix!");
        C103021n.f303993c = false;
        C103021n.f303996f = null;
        nVar.mo142741b();
        C102635b bVar = this.f272845g;
        if (bVar != null) {
            Log.m105924i("MicroMsg.RecordUIRouter", "finish " + bVar.f302234f);
            bVar.f302236h = true;
            MMHandlerThread.postToMainThread(new C102639c(bVar));
        }
        if (getIntent() != null && getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1) != -1) {
            overridePendingTransition(-1, getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1));
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bqs;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.MMRecordUI", "requestCode : " + i + " resultCode:" + i2 + "  " + hashCode());
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            C97642b bVar = this.f272842d;
            if (bVar != null) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                Log.m105919d("MicroMsg.MMRecordUI", "select %s for sending imagePath:%s", stringExtra, bVar.f286423d);
                C89779i0 Q = C76879j.m92723Q(this, "", getResources().getString(C0966R.string.hit), true, false, (DialogInterface.OnCancelListener) null);
                String stringExtra2 = intent.getStringExtra("custom_send_text");
                C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
                b.f295195i = 4;
                b.f295188b = C75592q0.m90789s();
                b.f295187a = stringExtra;
                b.f295196j = bVar.f286423d;
                b.f295197k = 0;
                b.f295198l = null;
                b.f295200n = 0;
                b.f295204r = "";
                b.f295205s = "";
                b.f295202p = true;
                b.f295201o = C0966R.C0969drawable.by8;
                b.f295194h = 11;
                C100760a0.C89338b a = b.mo140195a();
                C98204q qVar = (C98204q) a.f257313a;
                a.mo123694a();
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_clear_c2c_tmp_file, true)) {
                    C98453h.f288774a.mo137819q(String.valueOf(qVar.getMsg().getMsgId()), bVar.f286423d);
                }
                C7250m.m7431a().mo136252Ar(stringExtra2, stringExtra);
                if (Q != null) {
                    Q.dismiss();
                }
                finish();
                return;
            }
            return;
        }
        C102635b bVar2 = this.f272845g;
        if (bVar2 != null) {
            Log.m105924i("MicroMsg.RecordUIRouter", "onActivityResult " + i + ' ' + i2 + ' ' + intent);
            BasePluginLayout basePluginLayout = bVar2.f302234f;
            if (basePluginLayout != null) {
                basePluginLayout.onActivityResult(i, i2, intent);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r0 == true) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onBackPressed  "
            r0.append(r1)
            int r1 = r6.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MMRecordUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            xg2.b r0 = r6.f272845g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0059
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r6.f272843e
            if (r3 == 0) goto L_0x0028
            int r3 = r3.f272905F
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onBackPressed "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.RecordUIRouter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r0 = r0.f302234f
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.mo78564e()
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0056
            th2.d r4 = th2.C110992d.f332425a
            r5 = 14
            r4.mo162670d(r5)
            r4.mo162673g(r3)
        L_0x0056:
            if (r0 != r1) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r1 != 0) goto L_0x005f
            r6.mo129783I7()
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI.onBackPressed():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = configuration.screenLayout;
        boolean z = ((i & 3) == 0 || (i & 16) == 0) ? false : true;
        if (z != this.f272848j) {
            this.f272848j = z;
            mo129782H7();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0208, code lost:
        if (r0 != 999) goto L_0x0212;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r43) {
        /*
            r42 = this;
            r1 = r42
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "MMRecordUI onCreate  "
            r0.append(r3)
            int r3 = r42.hashCode()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.MMRecordUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r4 = 1
            r1.supportRequestWindowFeature(r4)
            super.onCreate(r43)
            r0 = 8
            r1.setSelfNavigationBarVisible(r0)
            android.view.Window r0 = r42.getWindow()
            r5 = 2097280(0x200080, float:2.938915E-39)
            r0.addFlags(r5)
            android.view.Window r0 = r42.getWindow()
            r5 = 201327616(0xc000400, float:9.861965E-32)
            r0.setFlags(r5, r5)
            f72.C97842b.f286991a = r4
            android.view.Window r0 = r42.getWindow()
            r5 = -3
            r0.setFormat(r5)
            r42.setLightNavigationbarIcon()
            r0 = 2131312007(0x7f093d87, float:1.824237E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.f272846h = r0
            hi2.p r0 = hi2.C98466p.f288808a
            r0.mo137836a()
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r5 = o31.C11345b.MMRecordUI
            r0.mo86178qr(r1, r5)
            android.content.Intent r0 = r42.getIntent()
            java.lang.String r5 = "KEY_PARAMS_CONFIG"
            android.os.Parcelable r0 = r0.getParcelableExtra(r5)
            r5 = r0
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = (com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider) r5
            android.content.Intent r0 = r42.getIntent()
            java.lang.String r6 = "KEY_PARAMS_TO_WHERE"
            r7 = -1
            int r0 = r0.getIntExtra(r6, r7)
            android.content.Intent r6 = r42.getIntent()
            java.lang.String r8 = "KEY_PARAMS_SELECTED_BIZ_INT"
            int r6 = r6.getIntExtra(r8, r7)
            if (r5 == 0) goto L_0x0093
            int r9 = r5.f272905F
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0094
        L_0x0093:
            r9 = 0
        L_0x0094:
            r10 = 2
            if (r6 == 0) goto L_0x00a8
            if (r6 == r4) goto L_0x00a8
            if (r6 == r10) goto L_0x009c
            goto L_0x00bc
        L_0x009c:
            eh2.b r6 = new eh2.b
            r6.<init>(r1)
            r1.f272842d = r6
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r9 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            r9.f272891a = r6
            goto L_0x00bc
        L_0x00a8:
            r6 = 11
            if (r9 != 0) goto L_0x00ad
            goto L_0x00b3
        L_0x00ad:
            int r9 = r9.intValue()
            if (r9 == r6) goto L_0x00bc
        L_0x00b3:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r6 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            eh2.a r9 = new eh2.a
            r9.<init>()
            r6.f272891a = r9
        L_0x00bc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "onCreate configProvider : "
            r6.append(r9)
            r6.append(r5)
            java.lang.String r9 = "    toWhere:"
            r6.append(r9)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = r0.intValue()
            r1.f272849n = r6
            xg2.a r0 = r1.f272844f
            r0.getClass()
            java.lang.String r9 = ""
            java.lang.String r11 = "configProvider.inputVideoPath"
            r12 = 999(0x3e7, float:1.4E-42)
            if (r5 != 0) goto L_0x00f3
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L_0x012a
        L_0x00f3:
            if (r6 != r10) goto L_0x020f
            java.lang.String r0 = r5.f272900A
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 == 0) goto L_0x0105
            java.lang.String r0 = "fileCheck path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0128
        L_0x0105:
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r16 = 1
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x0126
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "fileCheck file size is 0. path: "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r0 = 1001(0x3e9, float:1.403E-42)
            goto L_0x0128
        L_0x0126:
            r0 = 999(0x3e7, float:1.4E-42)
        L_0x0128:
            if (r0 == r12) goto L_0x012d
        L_0x012a:
            r7 = r11
            goto L_0x0212
        L_0x012d:
            java.lang.String r14 = r5.f272900A
            gy3.C87412m.m108593f(r14, r11)
            java.lang.String r15 = "MicroMsg.RecordUIController"
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            oj.b r8 = new oj.b
            r8.<init>()
            r8.mo161392k(r14)     // Catch:{ Exception -> 0x01ed }
            int r0 = r8.mo161385d()     // Catch:{ Exception -> 0x01ed }
            r7 = 0
            r19 = 0
            r20 = 0
        L_0x0149:
            java.lang.String r12 = "mime"
            if (r7 >= r0) goto L_0x01a1
            android.media.MediaFormat r10 = r8.mo161386e(r7)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r13 = "extractor.getTrackFormat(i)"
            gy3.C87412m.m108593f(r10, r13)     // Catch:{ Exception -> 0x01ed }
            boolean r13 = r10.containsKey(r12)     // Catch:{ Exception -> 0x01ed }
            if (r13 != 0) goto L_0x0166
            java.lang.String r10 = "find video mime : not found."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r10)     // Catch:{ Exception -> 0x01ed }
            r21 = r0
            r4 = 0
            goto L_0x019a
        L_0x0166:
            java.lang.String r13 = r10.getString(r12)     // Catch:{ Exception -> 0x01ed }
            r21 = r0
            java.lang.String r0 = "find video mime : %s"
            r22 = r10
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01ed }
            r4 = 0
            r10[r4] = r13     // Catch:{ Exception -> 0x01ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r0, r10)     // Catch:{ Exception -> 0x01ed }
            if (r13 != 0) goto L_0x017b
            goto L_0x019a
        L_0x017b:
            java.lang.String r0 = "video/"
            boolean r0 = z04.C112551y.m153819s(r13, r0, r4)     // Catch:{ Exception -> 0x01ed }
            if (r0 == 0) goto L_0x0189
            if (r19 != 0) goto L_0x0195
            r19 = r22
            goto L_0x0195
        L_0x0189:
            java.lang.String r0 = "audio/"
            boolean r0 = z04.C112551y.m153819s(r13, r0, r4)     // Catch:{ Exception -> 0x01ed }
            if (r0 == 0) goto L_0x0195
            if (r20 != 0) goto L_0x0195
            r20 = r22
        L_0x0195:
            if (r20 == 0) goto L_0x019a
            if (r19 == 0) goto L_0x019a
            goto L_0x01a1
        L_0x019a:
            int r7 = r7 + 1
            r0 = r21
            r4 = 1
            r10 = 2
            goto L_0x0149
        L_0x01a1:
            r0 = r20
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ed }
            r4.<init>()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = "cost time: "
            r4.append(r7)     // Catch:{ Exception -> 0x01ed }
            r7 = r11
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r16)     // Catch:{ Exception -> 0x01e9 }
            r4.append(r10)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x01e3
            boolean r4 = r0.containsKey(r12)     // Catch:{ Exception -> 0x01e9 }
            if (r4 != 0) goto L_0x01c6
            r0 = r9
            goto L_0x01ca
        L_0x01c6:
            java.lang.String r0 = r0.getString(r12)     // Catch:{ Exception -> 0x01e9 }
        L_0x01ca:
            java.lang.String r4 = "audio/mp4a-latm"
            r10 = 1
            boolean r0 = z04.C112551y.m153809i(r4, r0, r10)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x01d4
            goto L_0x01e3
        L_0x01d4:
            java.lang.String r0 = "mediaItem format:%s, videoPath:%s"
            r4 = 2
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01e9 }
            r4 = 0
            r11[r4] = r19     // Catch:{ Exception -> 0x01e9 }
            r11[r10] = r14     // Catch:{ Exception -> 0x01e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r0, r11)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0201
        L_0x01e3:
            r8.mo161388g()
            r0 = 999(0x3e7, float:1.4E-42)
            goto L_0x0206
        L_0x01e9:
            r0 = move-exception
            goto L_0x01ef
        L_0x01eb:
            r0 = move-exception
            goto L_0x020b
        L_0x01ed:
            r0 = move-exception
            r7 = r11
        L_0x01ef:
            java.lang.String r4 = "Video extractor init failed. video path = [%s] e = [%s]"
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x01eb }
            r10 = 0
            r11[r10] = r14     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01eb }
            r10 = 1
            r11[r10] = r0     // Catch:{ all -> 0x01eb }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r4, r11)     // Catch:{ all -> 0x01eb }
        L_0x0201:
            r8.mo161388g()
            r0 = 1004(0x3ec, float:1.407E-42)
        L_0x0206:
            r4 = 999(0x3e7, float:1.4E-42)
            if (r0 == r4) goto L_0x0210
            goto L_0x0212
        L_0x020b:
            r8.mo161388g()
            throw r0
        L_0x020f:
            r7 = r11
        L_0x0210:
            r0 = 999(0x3e7, float:1.4E-42)
        L_0x0212:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = " checkConfigProvider:  "
            r4.append(r8)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r4 = 999(0x3e7, float:1.4E-42)
            if (r0 == r4) goto L_0x0231
            r1.setResult(r0)
            r42.finish()
            return
        L_0x0231:
            xg2.b r0 = new xg2.b
            android.view.ViewGroup r4 = r1.f272846h
            java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r4, r8)
            gy3.C87412m.m108591d(r5)
            r0.<init>(r1, r4, r5, r6)
            r1.f272845g = r0
            r1.f272843e = r5
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r5.f272926n
            java.lang.String r4 = "MicroMsg.MediaRecordParamUtil"
            if (r0 != 0) goto L_0x0270
            int r0 = r5.f272905F
            r8 = 2
            if (r0 != r8) goto L_0x025a
            xb0.h r0 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.Gx0()
            r5.f272926n = r0
        L_0x025a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "checkConfigProviderParam "
            r0.append(r8)
            com.tencent.mm.modelcontrol.VideoTransPara r8 = r5.f272926n
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0270:
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r5.f272926n
            if (r0 != 0) goto L_0x0277
        L_0x0274:
            r8 = -1
            goto L_0x033d
        L_0x0277:
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_sns_video_use_origin_audio_bitrate_enable
            r10 = 1
            boolean r0 = r0.mo58784wf(r8, r10)
            if (r0 == 0) goto L_0x02a5
            int r0 = r5.f272905F
            r8 = 2
            if (r0 != r8) goto L_0x02a5
            java.lang.String r0 = r5.f272900A
            com.tencent.mm.plugin.sight.base.a r0 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r0, r10)
            if (r0 == 0) goto L_0x02a5
            int r8 = r0.f273449g
            com.tencent.mm.modelcontrol.VideoTransPara r10 = r5.f272926n
            int r11 = r10.f267173n
            if (r8 <= r11) goto L_0x029d
            r10.f267173n = r8
        L_0x029d:
            int r0 = r0.f273450h
            int r8 = r10.f267174o
            if (r0 <= r8) goto L_0x02a5
            r10.f267174o = r0
        L_0x02a5:
            int r0 = r5.f272905F
            java.lang.String r8 = "scene"
            di3.d r10 = di3.C86312j.m106911c(r2)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_video_generate_restriction
            java.lang.String r9 = r10.Y60(r11, r9)
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x02da }
            r10.<init>(r9)     // Catch:{ Exception -> 0x02da }
            int r9 = r10.length()     // Catch:{ Exception -> 0x02da }
            r11 = 0
            r12 = 0
        L_0x02c1:
            if (r11 >= r9) goto L_0x02dc
            org.json.JSONObject r13 = r10.getJSONObject(r11)     // Catch:{ Exception -> 0x02da }
            int r14 = r13.optInt(r8)     // Catch:{ Exception -> 0x02da }
            if (r14 != r0) goto L_0x02cf
            r12 = r13
            goto L_0x02dc
        L_0x02cf:
            int r14 = r13.optInt(r8)     // Catch:{ Exception -> 0x02da }
            r15 = -1
            if (r14 != r15) goto L_0x02d7
            r12 = r13
        L_0x02d7:
            int r11 = r11 + 1
            goto L_0x02c1
        L_0x02da:
            r12 = 0
        L_0x02dc:
            if (r12 == 0) goto L_0x0274
            java.lang.String r0 = "video-width"
            r8 = -1
            int r0 = r12.optInt(r0, r8)
            java.lang.String r9 = "video-height"
            int r9 = r12.optInt(r9, r8)
            if (r0 > 0) goto L_0x02f1
            if (r9 <= 0) goto L_0x033d
        L_0x02f1:
            com.tencent.mm.modelcontrol.VideoTransPara r10 = r5.f272926n
            int r11 = r10.f267166d
            int r12 = r10.f267167e
            r10.f267166d = r0
            r10.f267167e = r9
            if (r0 > 0) goto L_0x0302
            int r13 = r11 * r9
            int r13 = r13 / r12
            r10.f267166d = r13
        L_0x0302:
            if (r9 > 0) goto L_0x0309
            int r12 = r12 * r0
            int r12 = r12 / r11
            r10.f267167e = r12
        L_0x0309:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "force change video width:"
            r10.append(r11)
            com.tencent.mm.modelcontrol.VideoTransPara r11 = r5.f272926n
            int r11 = r11.f267166d
            r10.append(r11)
            java.lang.String r11 = "  height:"
            r10.append(r11)
            com.tencent.mm.modelcontrol.VideoTransPara r11 = r5.f272926n
            int r11 = r11.f267167e
            r10.append(r11)
            java.lang.String r11 = " ; config width:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = " height:"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x033d:
            android.content.res.Resources r0 = r42.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x0365
            android.content.res.Resources r0 = r42.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 3
            if (r0 == 0) goto L_0x0365
            android.content.res.Resources r0 = r42.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0365
            r0 = 1
            goto L_0x0366
        L_0x0365:
            r0 = 0
        L_0x0366:
            r1.f272848j = r0
            r42.mo129782H7()
            xg2.b r0 = r1.f272845g
            if (r0 == 0) goto L_0x0435
            xg2.a r4 = r1.f272844f
            r4.getClass()
            h90.b r4 = new h90.b
            r23 = r4
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 65535(0xffff, float:9.1834E-41)
            r41 = 0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.util.ArrayList<java.lang.String> r9 = r5.f272907H
            if (r9 == 0) goto L_0x03a6
            r4.f288191l = r9
        L_0x03a6:
            java.util.ArrayList<java.lang.String> r9 = r5.f272906G
            if (r9 == 0) goto L_0x03ac
            r4.f288190k = r9
        L_0x03ac:
            if (r9 == 0) goto L_0x03b7
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x03b5
            goto L_0x03b7
        L_0x03b5:
            r9 = 0
            goto L_0x03b8
        L_0x03b7:
            r9 = 1
        L_0x03b8:
            java.lang.String r10 = "configProvider.thumbPath"
            if (r9 == 0) goto L_0x03f4
            java.util.ArrayList<java.lang.String> r9 = r5.f272907H
            if (r9 == 0) goto L_0x03c9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x03c7
            goto L_0x03c9
        L_0x03c7:
            r9 = 0
            goto L_0x03ca
        L_0x03c9:
            r9 = 1
        L_0x03ca:
            if (r9 != 0) goto L_0x03f4
            java.util.ArrayList<java.lang.String> r9 = r5.f272907H
            int r9 = r9.size()
            r11 = 1
            if (r9 != r11) goto L_0x03f4
            java.util.ArrayList<java.lang.String> r9 = r5.f272907H
            r12 = 0
            java.lang.Object r9 = r9.get(r12)
            java.lang.String r12 = "configProvider.videos[0]"
            gy3.C87412m.m108593f(r9, r12)
            java.lang.String r9 = (java.lang.String) r9
            r4.f288180a = r9
            com.tencent.mm.plugin.sight.base.a r9 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r9, r11)
            int r9 = r9.f273443a
            r4.f288184e = r9
            java.lang.String r9 = r5.f272902C
            gy3.C87412m.m108593f(r9, r10)
            r4.f288181b = r9
        L_0x03f4:
            java.lang.String r9 = r5.f272903D
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0405
            java.lang.String r9 = r5.f272903D
            java.lang.String r11 = "configProvider.inputPhotoPath"
            gy3.C87412m.m108593f(r9, r11)
            r4.f288189j = r9
        L_0x0405:
            android.os.Bundle r9 = r5.f272912M
            r4.f288193n = r9
            java.lang.String r9 = r5.f272900A
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0432
            java.lang.String r9 = r5.f272900A
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r9 == 0) goto L_0x0432
            java.lang.String r9 = r5.f272900A
            gy3.C87412m.m108593f(r9, r7)
            r4.f288180a = r9
            java.lang.String r7 = r5.f272900A
            r9 = 1
            com.tencent.mm.plugin.sight.base.a r7 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r7, r9)
            int r7 = r7.f273443a
            r4.f288184e = r7
            java.lang.String r7 = r5.f272902C
            gy3.C87412m.m108593f(r7, r10)
            r4.f288181b = r7
        L_0x0432:
            r0.mo142012b(r6, r4)
        L_0x0435:
            java.lang.String r0 = "MMRecordUI onCreate finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            r0.clear()
            th2.d r0 = th2.C110992d.f332425a
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r3 = r5.f272908I
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r4 = new com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo
            r4.<init>()
            th2.C110992d.f332426b = r4
            th2.a r4 = new th2.a
            r4.<init>()
            th2.C110992d.f332427c = r4
            if (r3 == 0) goto L_0x0458
            int r7 = r3.f272940d
            goto L_0x0459
        L_0x0458:
            r7 = -1
        L_0x0459:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.String r4 = "KEY_FROM_SCENE_INT"
            r0.mo162677k(r4, r3)
            k21.c$a r3 = k21.C60960c.f173618a
            java.lang.String r4 = "RecordMediaReporter"
            java.lang.String r6 = "moment_sessionid_"
            k21.b r7 = r3.mo85922f(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r7 = r7.f173614c
            java.lang.Object r7 = r7.get(r6)
            if (r7 == 0) goto L_0x0478
            r0.mo162677k(r6, r7)
        L_0x0478:
            r3.mo85918a(r4)
            com.tencent.mm.sdk.systemservicecache.NetworkCache r0 = com.tencent.p014mm.sdk.systemservicecache.NetworkCache.INSTANCE
            androidx.appcompat.app.AppCompatActivity r3 = r42.getContext()
            int r0 = r0.getIOSNetTypeFromCache(r3)
            long r3 = (long) r0
            long r6 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = hi2.C98453h.f288777d
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.lang.String r9 = "media_timing_delete_set"
            java.util.Set r0 = r0.decodeStringSet(r9, r8)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.lang.String r10 = "set"
            gy3.C87412m.m108593f(r0, r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x04a7:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x04c5
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.HashSet<java.lang.String> r12 = hi2.C98453h.f288778e
            boolean r12 = r12.contains(r11)
            if (r12 != 0) goto L_0x04c1
            hi2.h r12 = hi2.C98453h.f288774a
            r12.mo137810h(r11)
            goto L_0x04a7
        L_0x04c1:
            r8.add(r11)
            goto L_0x04a7
        L_0x04c5:
            r0.clear()
            r0.addAll(r8)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = hi2.C98453h.f288777d
            r8.encode((java.lang.String) r9, (java.util.Set<java.lang.String>) r0)
            hi2.h r0 = hi2.C98453h.f288774a
            java.lang.String r0 = "clean_file_timestamp_long"
            r9 = 0
            long r11 = r8.decodeLong(r0, r9)
            bp3.p r13 = bp3.C79758p.f233760a
            bp3.f r14 = bp3.C104160f.RepairerConfig_Media_CleanFile_Int
            r15 = 0
            int r13 = r13.mo109882e(r14, r15)
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r11
            java.lang.String r11 = "MicroMsg.MediaFileUtil"
            r16 = 1209600000(0x48190800, double:5.97621805E-315)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L_0x04fa
            if (r13 != 0) goto L_0x04fa
            java.lang.String r0 = "interval not reached"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x0588
        L_0x04fa:
            long r12 = java.lang.System.currentTimeMillis()
            r8.encode((java.lang.String) r0, (long) r12)
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_media_file_expired_day
            r8 = 14
            int r0 = r0.mo58779Qe(r2, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "deleteExpiredFile "
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = " days"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            if (r0 >= 0) goto L_0x052b
            goto L_0x0588
        L_0x052b:
            java.lang.Long r2 = ha2.C32749b.f89132b
            long r11 = r2.longValue()
            long r13 = (long) r0
            long r11 = r11 * r13
            hd0.h0 r0 = hd0.C98398h0.wx0()
            java.lang.String r0 = r0.ca0()
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106458s(r0)
            gy3.C87412m.m108591d(r0)
            zt3.t r2 = zt3.C119157j.f356862d
            hi2.i r8 = new hi2.i
            java.lang.String r13 = "videovsg"
            r8.<init>(r0, r13, r11)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183870a(r8)
            hd0.h0 r0 = hd0.C98398h0.wx0()
            java.lang.String r0 = r0.ca0()
            java.lang.String r2 = "getCore().accVideoPath"
            gy3.C87412m.m108593f(r0, r2)
            zt3.t r8 = zt3.C119157j.f356862d
            hi2.i r13 = new hi2.i
            java.lang.String r14 = "vsg"
            r13.<init>(r0, r14, r11)
            zt3.j r8 = (zt3.C119157j) r8
            r8.mo183870a(r13)
            hd0.h0 r0 = hd0.C98398h0.wx0()
            java.lang.String r0 = r0.ca0()
            gy3.C87412m.m108593f(r0, r2)
            zt3.t r2 = zt3.C119157j.f356862d
            hi2.i r8 = new hi2.i
            java.lang.String r13 = "send"
            r8.<init>(r0, r13, r11)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183870a(r8)
        L_0x0588:
            th2.d r0 = th2.C110992d.f332425a
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r8 = "KEY_NET_TYPE_INT"
            r0.mo162677k(r8, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = "KEY_ENTER_TIME_MS_LONG"
            r0.mo162677k(r8, r2)
            th2.f r0 = th2.C101891f.f300035a
            int r0 = r5.f272905F
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "setEnterScene >> "
            r2.append(r8)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r8 = "MicroMsg.VideoWidgetReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r2 = th2.C101891f.f300036b
            r2.f265891e = r0
            int r0 = (int) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "setNetType >> "
            r2.append(r11)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r2 = th2.C101891f.f300036b
            r2.f265890d = r0
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct r0 = th2.C110992d.f332428d
            r0.f310291d = r3
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "PublishObjectId"
            r11 = 1
            java.lang.String r2 = r0.mo86045b(r8, r2, r11)
            r0.f310292e = r2
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct r0 = th2.C110992d.f332428d
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r2 = r5.f272908I
            if (r2 == 0) goto L_0x05f0
            int r11 = r2.f272941e
            long r11 = (long) r11
            goto L_0x05f1
        L_0x05f0:
            r11 = r9
        L_0x05f1:
            r0.f310293f = r11
            r0.f310294g = r6
            if (r2 == 0) goto L_0x05fa
            long r11 = r2.f272942f
            goto L_0x05fb
        L_0x05fa:
            r11 = r9
        L_0x05fb:
            r0.f310308u = r11
            com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct r0 = th2.C110992d.f332431g
            r0.f310314d = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r4 = 2
            r11 = 0
            java.lang.Object r3 = r3.mo119684e(r4, r11)
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.String r2 = r0.mo86045b(r8, r2, r3)
            r0.f310315e = r2
            com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct r0 = th2.C110992d.f332431g
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r2 = r5.f272908I
            if (r2 == 0) goto L_0x062f
            int r3 = r2.f272941e
            long r3 = (long) r3
            goto L_0x0630
        L_0x062f:
            r3 = r9
        L_0x0630:
            r0.f310316f = r3
            r0.f310317g = r6
            if (r2 == 0) goto L_0x0638
            long r9 = r2.f272942f
        L_0x0638:
            r0.f310326p = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.MMRecordUI", "MMRecordUI onDestroy " + hashCode());
        super.onDestroy();
        C102635b bVar = this.f272845g;
        if (bVar != null) {
            Log.m105924i("MicroMsg.RecordUIRouter", "onDestroy " + bVar.f302234f);
            MMHandlerThread.postToMainThread(new C102640d(bVar));
            if (bVar.f302234f instanceof RecordPluginLayout) {
                C110992d.f332425a.mo162677k("KEY_EXIT_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
            }
        }
        C98466p.f288808a.mo137836a();
        if (getIntent().getIntExtra("KEY_PARAMS_SELECTED_BIZ_INT", -1) == 2) {
            ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD().mo162892a();
        }
        C101891f.f300035a.mo141367a();
        C110193b.f329648a.mo161593c();
        C110803f.f331490g.mo162371a();
    }

    public void onPause() {
        C102635b bVar;
        Log.m105924i("MicroMsg.MMRecordUI", "MMRecordUI onPause  isFinishing  : " + isFinishing() + "  " + hashCode() + "  ");
        super.onPause();
        C103928o.m138642b();
        if (this.f272849n != 1) {
            C34767b.C34768c cVar = this.f272847i;
            if (cVar != null) {
                C7335d c = C86312j.m106911c(C34767b.class);
                C87412m.m108593f(c, "getService(IAudioFocusService::class.java)");
                ((C34767b) c).b20(cVar);
            }
            this.f272847i = null;
        }
        if (!isFinishing() && (bVar = this.f272845g) != null) {
            Log.m105924i("MicroMsg.RecordUIRouter", "onPause " + bVar.f302234f);
            BasePluginLayout basePluginLayout = bVar.f302234f;
            if (basePluginLayout != null) {
                basePluginLayout.onPause();
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        Log.m105924i("MicroMsg.MMRecordUI", "onRequestPermissionsResult, requestCode:" + i);
        super.onRequestPermissionsResult(i, strArr, iArr);
        C102635b bVar = this.f272845g;
        if (bVar != null) {
            Log.m105924i("MicroMsg.RecordUIRouter", "onRequestPermissionsResult " + i);
            BasePluginLayout basePluginLayout = bVar.f302234f;
            if (basePluginLayout != null) {
                basePluginLayout.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    public void onResume() {
        Class cls = C34767b.class;
        try {
            super.onResume();
            C103928o.m138641a(true, true, true);
            C102635b bVar = this.f272845g;
            if (bVar != null) {
                Log.m105924i("MicroMsg.RecordUIRouter", "onResume " + bVar.f302234f);
                BasePluginLayout basePluginLayout = bVar.f302234f;
                if (basePluginLayout != null) {
                    basePluginLayout.onResume();
                }
            }
            if (this.f272849n != 1) {
                C34767b.C34768c cVar = this.f272847i;
                if (cVar != null) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(IAudioFocusService::class.java)");
                    ((C34767b) c).b20(cVar);
                }
                this.f272847i = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34784n.f93467c, (C34767b.C21622a) null);
            }
            Log.m105924i("MicroMsg.MMRecordUI", "MMRecordUI onResume " + hashCode() + "  ");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMRecordUI", "MMRecordUI onResume " + hashCode());
            Log.printErrStackTrace("MicroMsg.MMRecordUI", e, "", new Object[0]);
            finish();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C65744b.class);
        hashSet.add(C52907a.class);
        hashSet.addAll(((C77573p) C86312j.m106911c(C77573p.class)).Z00());
    }
}
