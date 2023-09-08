package mh2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsChoosePostBussinessReportStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.segment.C105476b;
import com.tencent.p014mm.plugin.mmsight.segment.SliderSeekBar;
import com.tencent.p014mm.plugin.recordvideo.background.provider.WeSeeProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import gy3.C8477a0;
import gy3.C87412m;
import h81.C32735h;
import h90.C98324b;
import hi2.C46072b;
import hi2.C46075u;
import hi2.C46076x;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kg3.C76577a;
import lh2.C109344g0;
import nj3.C76879j;
import p599lr.C61381b;
import qh2.C101198e;
import qo3.C77398g;
import qo3.C77407n;
import rx3.C13598b0;
import th2.C101891f;
import th2.C110992d;
import z04.C119027c;

/* renamed from: mh2.a */
public final class C99896a implements View.OnClickListener, C105476b, C109344g0 {

    /* renamed from: d */
    public ViewGroup f292719d;

    /* renamed from: e */
    public C101198e f292720e;

    /* renamed from: f */
    public final ImageView f292721f;

    /* renamed from: g */
    public final EditVideoSeekBarView f292722g;

    /* renamed from: h */
    public final ViewGroup f292723h = ((ViewGroup) this.f292719d.findViewById(C0966R.C0970id.ltu));

    /* renamed from: i */
    public final ImageView f292724i = ((ImageView) this.f292719d.findViewById(C0966R.C0970id.fcq));

    /* renamed from: j */
    public final ImageView f292725j = ((ImageView) this.f292719d.findViewById(C0966R.C0970id.fds));

    /* renamed from: n */
    public final TextView f292726n = ((TextView) this.f292719d.findViewById(C0966R.C0970id.kw9));

    /* renamed from: o */
    public C98324b f292727o;

    /* renamed from: p */
    public RecordConfigProvider f292728p;

    /* renamed from: q */
    public C77398g f292729q;

    /* renamed from: r */
    public C77398g f292730r;

    /* renamed from: s */
    public boolean f292731s;

    /* renamed from: t */
    public float f292732t;

    /* renamed from: u */
    public float f292733u = 1.0f;

    /* renamed from: v */
    public String f292734v = "";

    /* renamed from: w */
    public boolean f292735w;

    /* renamed from: x */
    public boolean f292736x;

    /* renamed from: y */
    public boolean f292737y;

    /* renamed from: z */
    public int f292738z;

    /* renamed from: mh2.a$a */
    public static final class C99897a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C99896a f292739d;

        public C99897a(C99896a aVar) {
            this.f292739d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            this.f292739d.f292722g.setVisibility(8);
            this.f292739d.f292722g.setAlpha(1.0f);
        }
    }

    /* renamed from: mh2.a$b */
    public static final class C99898b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C99896a f292740d;

        public C99898b(C99896a aVar) {
            this.f292740d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            this.f292740d.f292722g.setVisibility(8);
            this.f292740d.f292722g.setAlpha(1.0f);
        }
    }

    /* renamed from: mh2.a$c */
    public static final class C99899c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C99896a f292741d;

        public C99899c(C99896a aVar) {
            this.f292741d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            this.f292741d.f292722g.setVisibility(8);
            this.f292741d.f292722g.setAlpha(1.0f);
        }
    }

    /* renamed from: mh2.a$d */
    public static final class C99900d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99896a f292742d;

        /* renamed from: e */
        public final /* synthetic */ boolean f292743e;

        public C99900d(C99896a aVar, boolean z) {
            this.f292742d = aVar;
            this.f292743e = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C32735h.class;
            C77398g gVar = this.f292742d.f292730r;
            if (gVar != null) {
                C87412m.m108592e(gVar, "null cannot be cast to non-null type android.app.Dialog");
                if (gVar.isShowing()) {
                    C77398g gVar2 = this.f292742d.f292730r;
                    if (gVar2 != null) {
                        gVar2.dismiss();
                    }
                    Log.m105924i("MicroMsg.EditCropVideoPlugin", "click ok dismiss dialog");
                }
            }
            Log.m105924i("MicroMsg.EditCropVideoPlugin", "dialog ok isInstall:" + this.f292743e);
            C99896a aVar = this.f292742d;
            C98324b bVar = aVar.f292727o;
            String str = null;
            if ((bVar != null ? bVar.f288180a : null) != null) {
                if (bVar != null) {
                    str = bVar.f288180a;
                }
            } else if (bVar != null) {
                str = bVar.f288185f;
            }
            if (this.f292743e) {
                C46075u uVar = C46075u.f124225a;
                C87412m.m108591d(str);
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_phoneix_video_duration, 30);
                Log.m105924i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Qe);
                RecordConfigProvider recordConfigProvider = this.f292742d.f292728p;
                C87412m.m108591d(recordConfigProvider);
                VideoTransPara videoTransPara = recordConfigProvider.f272926n;
                int i2 = 0;
                int i3 = videoTransPara != null ? videoTransPara.f267169g : 0;
                RecordConfigProvider recordConfigProvider2 = this.f292742d.f292728p;
                C87412m.m108591d(recordConfigProvider2);
                VideoTransPara videoTransPara2 = recordConfigProvider2.f272926n;
                int i4 = videoTransPara2 != null ? videoTransPara2.f267166d : 0;
                RecordConfigProvider recordConfigProvider3 = this.f292742d.f292728p;
                C87412m.m108591d(recordConfigProvider3);
                VideoTransPara videoTransPara3 = recordConfigProvider3.f272926n;
                if (videoTransPara3 != null) {
                    i2 = videoTransPara3.f267167e;
                }
                Log.m105924i("MicroMsg.SecondCutUtil", "getSecondCutEditIntent >>>videoPath: " + str + " >>>width: " + i4 + " >>>height: " + i2 + " >>>duration: " + Qe + " >>> videoBitrate: " + i3);
                byte[] bytes = str.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 10);
                Intent intent = new Intent();
                intent.setData(Uri.parse("miaojian://createvideo?scene=" + "moments" + "&assetPaths=" + encodeToString + "&maxDuration=" + Qe + "&bitrate=" + i3 + "&resolution=" + i4 + ',' + i2 + "&from=2"));
                intent.setPackage("com.tencent.phoenix");
                intent.setAction("android.intent.action.VIEW");
                intent.setFlags(268435456);
                Context context = this.f292742d.f292719d.getContext();
                C87412m.m108593f(context, "parent.context");
                uVar.mo71515c(context, intent);
                Intent intent2 = new Intent();
                Context context2 = this.f292742d.f292719d.getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context2).setResult(-2, intent2);
                Context context3 = this.f292742d.f292719d.getContext();
                C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context3).finish();
                Log.m105918d("MicroMsg.EditCropVideoPlugin", "set RESULT_VIDEO_FINISH");
                return;
            }
            C46072b bVar2 = C46072b.f124220a;
            Context context4 = aVar.f292719d.getContext();
            C87412m.m108593f(context4, "parent.context");
            StringBuilder sb = new StringBuilder();
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=");
            Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Y60);
            C87412m.m108593f(Y60, "url");
            sb.append(Y60);
            sb.append("1102");
            bVar2.mo71509c(context4, sb.toString());
        }
    }

    /* renamed from: mh2.a$e */
    public static final class C99901e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99896a f292744d;

        public C99901e(C99896a aVar) {
            this.f292744d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.EditCropVideoPlugin", "dialog cancel");
            C77398g gVar = this.f292744d.f292730r;
            if (gVar != null) {
                C87412m.m108592e(gVar, "null cannot be cast to non-null type android.app.Dialog");
                if (gVar.isShowing()) {
                    C77398g gVar2 = this.f292744d.f292730r;
                    if (gVar2 != null) {
                        gVar2.dismiss();
                    }
                    Log.m105924i("MicroMsg.EditCropVideoPlugin", "click no dismiss dialog");
                }
            }
        }
    }

    /* renamed from: mh2.a$f */
    public static final class C99902f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99896a f292745d;

        /* renamed from: e */
        public final /* synthetic */ boolean f292746e;

        public C99902f(C99896a aVar, boolean z) {
            this.f292745d = aVar;
            this.f292746e = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0207  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r20, int r21) {
            /*
                r19 = this;
                r1 = r19
                mh2.a r0 = r1.f292745d
                qo3.g r0 = r0.f292729q
                java.lang.String r2 = "MicroMsg.EditCropVideoPlugin"
                if (r0 == 0) goto L_0x001e
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x001e
                mh2.a r0 = r1.f292745d
                qo3.g r0 = r0.f292729q
                if (r0 == 0) goto L_0x0019
                r0.dismiss()
            L_0x0019:
                java.lang.String r0 = "click ok dismiss dialog"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            L_0x001e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "dialog ok isInstallWeSee:"
                r0.append(r3)
                boolean r3 = r1.f292746e
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                mh2.a r0 = r1.f292745d
                h90.b r0 = r0.f292727o
                r3 = 0
                if (r0 == 0) goto L_0x003e
                java.lang.String r4 = r0.f288180a
                goto L_0x003f
            L_0x003e:
                r4 = r3
            L_0x003f:
                if (r4 == 0) goto L_0x0046
                if (r0 == 0) goto L_0x004b
                java.lang.String r0 = r0.f288180a
                goto L_0x004c
            L_0x0046:
                if (r0 == 0) goto L_0x004b
                java.lang.String r0 = r0.f288185f
                goto L_0x004c
            L_0x004b:
                r0 = r3
            L_0x004c:
                boolean r4 = r1.f292746e
                r5 = 3
                java.lang.String r6 = "KEY_WESEE_DIALOG_OPERATION"
                java.lang.String r7 = "parent.context"
                java.lang.String r8 = "&activity_id=WxPublisherAct&update=1"
                java.lang.String r9 = "weishi://videoEdit?videoPath="
                if (r4 == 0) goto L_0x0207
                th2.f r4 = th2.C101891f.f300035a
                r10 = 2
                java.lang.String r11 = "MicroMsg.VideoWidgetReporter"
                java.lang.String r12 = "setJumpToThirdApp >> 2"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
                com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r11 = th2.C101891f.f300036b
                r11.f265907u = r10
                r11 = 1
                r4.mo141375i(r5, r11)
                mh2.a r4 = r1.f292745d
                android.view.ViewGroup r4 = r4.f292719d
                android.content.Context r4 = r4.getContext()
                gy3.C87412m.m108593f(r4, r7)
                gy3.C87412m.m108591d(r0)
                long r11 = eb0.C31543z5.m39453c()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                f40.e r7 = f40.C86709a0.m107523b()
                java.lang.String r7 = r7.mo121111i()
                r5.append(r7)
                java.lang.String r7 = "_"
                r5.append(r7)
                r5.append(r11)
                java.lang.String r5 = r5.toString()
                java.lang.String r11 = "sb.append(MMKernel.accou…end(timestamp).toString()"
                gy3.C87412m.m108593f(r5, r11)
                android.content.Intent r11 = new android.content.Intent
                r11.<init>()
                java.lang.String r12 = "KEY_SIGHT_PARAMS"
                android.os.Parcelable r12 = r11.getParcelableExtra(r12)
                com.tencent.mm.plugin.mmsight.SightParams r12 = (com.tencent.p014mm.plugin.mmsight.SightParams) r12
                r15 = 0
                if (r12 != 0) goto L_0x00b8
                com.tencent.mm.plugin.mmsight.SightParams r12 = new com.tencent.mm.plugin.mmsight.SightParams
                r12.<init>(r10, r15)
            L_0x00b8:
                r12.f248460q = r5
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r10 == 0) goto L_0x00db
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r5.append(r12)
                r5.append(r7)
                r7 = 5
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.getRandomString(r7)
                r5.append(r7)
                java.lang.String r5 = r5.toString()
            L_0x00db:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                java.lang.String r10 = "MicroMsg.TakePhotoUtil"
                if (r7 == 0) goto L_0x00e9
                java.lang.String r7 = "path is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r7)
            L_0x00e9:
                android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
                java.lang.String r12 = r7.getPath()
                if (r12 == 0) goto L_0x010d
                java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r15, r15)
                java.lang.String r13 = r7.getPath()
                boolean r13 = r13.equals(r12)
                if (r13 != 0) goto L_0x010d
                android.net.Uri$Builder r7 = r7.buildUpon()
                android.net.Uri$Builder r7 = r7.path(r12)
                android.net.Uri r7 = r7.build()
            L_0x010d:
                com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r3 = r12.mo177799l(r7, r3)
                boolean r7 = r3.mo177810a()
                if (r7 != 0) goto L_0x011b
                r3 = 0
                goto L_0x0123
            L_0x011b:
                com.tencent.mm.vfs.FileSystem$c r7 = r3.f348991a
                java.lang.String r3 = r3.f348992b
                boolean r3 = r7.mo119948x(r3)
            L_0x0123:
                if (r3 != 0) goto L_0x012a
                java.lang.String r3 = "file is not exists"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            L_0x012a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r9)
                r3.append(r0)
                r3.append(r8)
                java.lang.String r0 = r3.toString()
                r3 = 1
                java.lang.Object[] r7 = new java.lang.Object[r3]
                r7[r15] = r0
                java.lang.String r8 = "weishi_uri = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r8, r7)
                java.lang.String r7 = "android.intent.action.VIEW"
                r11.setAction(r7)
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r11.setData(r0)
                java.lang.String r0 = "com.tencent.weishi"
                r11.setPackage(r0)
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                r11.setFlags(r0)
                java.lang.String r0 = r11.getPackage()
                java.lang.String r7 = "opensdk_shareTicket"
                android.content.SharedPreferences r7 = r4.getSharedPreferences(r7, r15)
                android.content.SharedPreferences$Editor r7 = r7.edit()
                android.content.SharedPreferences$Editor r0 = r7.putString(r0, r5)
                r0.apply()
                k20.a r0 = new k20.a     // Catch:{ Exception -> 0x01be }
                r0.<init>()     // Catch:{ Exception -> 0x01be }
                r0.mo10233c(r11)     // Catch:{ Exception -> 0x01be }
                java.lang.Object[] r12 = r0.mo10232b()     // Catch:{ Exception -> 0x01be }
                java.lang.String r13 = "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil"
                java.lang.String r14 = "takeWeiShiSightToEdit"
                java.lang.String r5 = "(Landroid/content/Context;ILandroid/content/Intent;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z"
                java.lang.String r16 = "Undefined"
                java.lang.String r17 = "startActivity"
                java.lang.String r18 = "(Landroid/content/Intent;)V"
                r11 = r4
                r7 = 0
                r15 = r5
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x01bc }
                java.lang.Object r0 = r0.mo10231a(r7)     // Catch:{ Exception -> 0x01bc }
                android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x01bc }
                r4.startActivity(r0)     // Catch:{ Exception -> 0x01bc }
                java.lang.String r12 = "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil"
                java.lang.String r13 = "takeWeiShiSightToEdit"
                java.lang.String r14 = "(Landroid/content/Context;ILandroid/content/Intent;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z"
                java.lang.String r15 = "Undefined"
                java.lang.String r16 = "startActivity"
                java.lang.String r17 = "(Landroid/content/Intent;)V"
                r11 = r4
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01bc }
                boolean r0 = r4 instanceof android.app.Activity     // Catch:{ Exception -> 0x01bc }
                if (r0 == 0) goto L_0x01ce
                android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ Exception -> 0x01bc }
                r0 = 2130772171(0x7f0100cb, float:1.7147453E38)
                r5 = -1
                r4.overridePendingTransition(r0, r5)     // Catch:{ Exception -> 0x01bc }
                goto L_0x01ce
            L_0x01bc:
                r0 = move-exception
                goto L_0x01c0
            L_0x01be:
                r0 = move-exception
                r7 = 0
            L_0x01c0:
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r0 = r0.getMessage()
                r4[r7] = r0
                java.lang.String r0 = "takeWeishiSight Exception: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r0, r4)
            L_0x01ce:
                th2.d r0 = th2.C110992d.f332425a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.mo162677k(r6, r3)
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                mh2.a r3 = r1.f292745d
                android.view.ViewGroup r3 = r3.f292719d
                android.content.Context r3 = r3.getContext()
                java.lang.String r4 = "null cannot be cast to non-null type android.app.Activity"
                gy3.C87412m.m108592e(r3, r4)
                android.app.Activity r3 = (android.app.Activity) r3
                r5 = -2
                r3.setResult(r5, r0)
                mh2.a r0 = r1.f292745d
                android.view.ViewGroup r0 = r0.f292719d
                android.content.Context r0 = r0.getContext()
                gy3.C87412m.m108592e(r0, r4)
                android.app.Activity r0 = (android.app.Activity) r0
                r0.finish()
                java.lang.String r0 = "set RESULT_VIDEO_FINISH"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
                goto L_0x0251
            L_0x0207:
                com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider$a r2 = com.tencent.p014mm.plugin.recordvideo.background.provider.WeSeeProvider.f115880g
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r9)
                r4.append(r0)
                r4.append(r8)
                java.lang.String r0 = r4.toString()
                java.lang.String r4 = "parseWeSeeUri(videoPath)"
                gy3.C87412m.m108593f(r0, r4)
                long r8 = java.lang.System.currentTimeMillis()
                r2.mo57309b(r0, r8)
                mh2.a r0 = r1.f292745d
                android.view.ViewGroup r0 = r0.f292719d
                android.content.Context r0 = r0.getContext()
                gy3.C87412m.m108593f(r0, r7)
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r4 = "rawUrl"
                java.lang.String r7 = "https://isee.weishi.qq.com/static/release/group_10/528a4494-9ce7-4ac8-a763-247d84d07dae.html?_wwv=4096&chid=205000000&attach=cp_reserves3_2230000000"
                r2.putExtra(r4, r7)
                java.lang.String r4 = "webview"
                java.lang.String r7 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r0, r4, r7, r2, r3)
                th2.d r0 = th2.C110992d.f332425a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                r0.mo162677k(r6, r2)
            L_0x0251:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mh2.C99896a.C99902f.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* renamed from: mh2.a$g */
    public static final class C99903g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f292747d;

        /* renamed from: e */
        public final /* synthetic */ C99896a f292748e;

        public C99903g(boolean z, C99896a aVar) {
            this.f292747d = z;
            this.f292748e = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f292747d) {
                C110992d.f332425a.mo162677k("KEY_WESEE_DIALOG_OPERATION", 2);
            } else {
                C110992d.f332425a.mo162677k("KEY_WESEE_DIALOG_OPERATION", 4);
            }
            Log.m105924i("MicroMsg.EditCropVideoPlugin", "dialog cancel");
            C77398g gVar = this.f292748e.f292729q;
            if (gVar != null) {
                C87412m.m108592e(gVar, "null cannot be cast to non-null type android.app.Dialog");
                if (gVar.isShowing()) {
                    C77398g gVar2 = this.f292748e.f292729q;
                    if (gVar2 != null) {
                        gVar2.dismiss();
                    }
                    Log.m105924i("MicroMsg.EditCropVideoPlugin", "click no dismiss dialog");
                }
            }
        }
    }

    public C99896a(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f292719d = viewGroup;
        this.f292720e = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ccb);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.editor_crop_video)");
        ImageView imageView = (ImageView) findViewById;
        this.f292721f = imageView;
        View findViewById2 = this.f292719d.findViewById(C0966R.C0970id.cca);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.editor_crop_bar)");
        EditVideoSeekBarView editVideoSeekBarView = (EditVideoSeekBarView) findViewById2;
        this.f292722g = editVideoSeekBarView;
        imageView.setImageDrawable(C74933u4.m89768e(this.f292719d.getContext(), C0966R.raw.icons_filled_crop, -1));
        imageView.setOnClickListener(this);
        editVideoSeekBarView.setCancelButtonClickListener(this);
        editVideoSeekBarView.setFinishButtonClickListener(this);
        ViewGroup.LayoutParams layoutParams = editVideoSeekBarView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += C75044y4.m89991c(this.f292719d.getContext());
        editVideoSeekBarView.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public final void mo139240a(boolean z) {
        String str;
        int i;
        int i2;
        boolean z2 = z;
        Class cls = C32735h.class;
        C110992d dVar = C110992d.f332425a;
        dVar.mo162669b(13);
        C98324b bVar = this.f292727o;
        if (bVar != null && !C87412m.m108589b(this.f292734v, bVar.f288180a)) {
            this.f292734v = bVar.f288180a;
            RecordConfigProvider recordConfigProvider = this.f292728p;
            if (recordConfigProvider != null) {
                if ((i = recordConfigProvider.f272936x) < 0 ? (i = recordConfigProvider.f272926n.f267171i * 1000) > (i2 = bVar.f288184e) : i > (i2 = bVar.f288184e)) {
                    i = i2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("duration:");
                int i3 = recordConfigProvider.f272935w;
                int i4 = bVar.f288184e;
                if (i3 > i4) {
                    i3 = i4;
                }
                sb.append(i3);
                sb.append(" minDuration:");
                sb.append(i);
                Log.m105924i("MicroMsg.EditCropVideoPlugin", sb.toString());
                EditVideoSeekBarView editVideoSeekBarView = this.f292722g;
                String str2 = bVar.f288180a;
                int i5 = recordConfigProvider.f272935w;
                int i6 = bVar.f288184e;
                if (i5 > i6) {
                    i5 = i6;
                }
                editVideoSeekBarView.mo129821a(str2, i5, (int) Math.ceil((((double) i) * 1.0d) / ((double) 1000)));
                this.f292722g.setThumbBarSeekListener(this);
                int i7 = recordConfigProvider.f272935w;
                int i8 = bVar.f288184e;
                if (i7 > i8) {
                    i7 = i8;
                }
                this.f292733u = (((float) i7) * 1.0f) / ((float) i8);
            }
        }
        this.f292722g.setVisibility(0);
        Log.m105918d("MicroMsg.EditCropVideoPlugin", "forceCropVideo isForce: " + z2);
        Bundle bundle = new Bundle();
        if (z2) {
            RecordConfigProvider recordConfigProvider2 = this.f292728p;
            if (recordConfigProvider2 != null && recordConfigProvider2.f272905F == 2) {
                boolean z3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_to_finder_enable, 1) == 1;
                boolean tO = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76879tO();
                boolean equals = TextUtils.equals(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_clip_page_weishi_promotion_entrance, "0"), "1");
                boolean z4 = MMApplicationContext.getDefaultPreference().getBoolean("wesee_switch", false);
                boolean Zl0 = ((C61381b) C86312j.m106911c(C61381b.class)).Zl0();
                boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_edit_to_phoenix_enable, false);
                Log.m105924i("MicroMsg.SecondCutConfig", "EditVideoToSecondCutEntrance: " + wf);
                this.f292737y = wf;
                this.f292735w = z3 && tO && Zl0;
                this.f292736x = equals || z4;
                Log.m105924i("MicroMsg.EditCropVideoPlugin", "sns2FinderEnable:" + z3 + ", showPostEntry:" + tO + ", finderServerOpen=" + Zl0 + "showWeseeEntry:" + equals + ", weseeCommandSwitch:" + z4);
                if (this.f292735w) {
                    this.f292738z++;
                }
                if (this.f292736x) {
                    this.f292738z++;
                }
                if (this.f292737y) {
                    this.f292738z++;
                }
                TextView textView = this.f292726n;
                if (textView != null) {
                    textView.setTextSize(0, (float) C76577a.m92155f(this.f292719d.getContext(), C0966R.dimen.f3957lf));
                }
                if (this.f292738z >= 2) {
                    RecordConfigProvider recordConfigProvider3 = this.f292728p;
                    int i9 = (recordConfigProvider3 != null ? recordConfigProvider3.f272935w : 10000) / 1000;
                    TextView textView2 = this.f292726n;
                    if (textView2 != null) {
                        String string = this.f292719d.getContext().getResources().getString(C0966R.string.c3f);
                        C87412m.m108593f(string, "parent.context.resources…g.edit_post_long_content)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i9)}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        textView2.setText(format);
                    }
                    ImageView imageView = this.f292724i;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    mo139246h();
                    if (this.f292736x) {
                        bundle.putBoolean("EDIT_CROP_VIDEO_SHOW_WESEE_SWITCH_BOOLEAN", true);
                        WeSeeProvider.f115880g.mo57308a();
                        dVar.mo162677k("KEY_IS_SHOW_WESEE_BTN", 1);
                    }
                    dVar.mo162675i(3);
                } else {
                    boolean z5 = this.f292735w;
                    if (z5 || this.f292737y) {
                        TextView textView3 = this.f292726n;
                        if (textView3 != null) {
                            if (z5) {
                                str = this.f292719d.getContext().getResources().getString(C0966R.string.c3g);
                            } else {
                                String string2 = this.f292719d.getContext().getResources().getString(C0966R.string.c3k);
                                C87412m.m108593f(string2, "parent.context.resources…t_secondcut_post_content)");
                                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_wording_second_cut_time, 30);
                                Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutWordingTime: " + Qe);
                                str = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(Qe)}, 1));
                                C87412m.m108593f(str, "format(format, *args)");
                            }
                            textView3.setText(str);
                        }
                        ImageView imageView2 = this.f292724i;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                        mo139246h();
                        dVar.mo162677k("KEY_IS_SHOW_WESEE_BTN", 2);
                        dVar.mo162675i(3);
                    } else if (this.f292736x) {
                        TextView textView4 = this.f292726n;
                        if (textView4 != null) {
                            String string3 = this.f292719d.getContext().getResources().getString(C0966R.string.c3n);
                            C87412m.m108593f(string3, "parent.context.resources…tring.edit_wesee_content)");
                            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_wording_wesee_time, 30);
                            Log.m105924i("MicroMsg.SecondCutConfig", "WeSeeWordingTime: " + Qe2);
                            String format2 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(Qe2)}, 1));
                            C87412m.m108593f(format2, "format(format, *args)");
                            textView4.setText(format2);
                        }
                        ImageView imageView3 = this.f292724i;
                        if (imageView3 != null) {
                            imageView3.setVisibility(0);
                        }
                        bundle.putBoolean("EDIT_CROP_VIDEO_SHOW_WESEE_SWITCH_BOOLEAN", true);
                        mo139246h();
                        WeSeeProvider.f115880g.mo57308a();
                        dVar.mo162677k("KEY_IS_SHOW_WESEE_BTN", 1);
                        dVar.mo162675i(2);
                    } else {
                        dVar.mo162675i(1);
                    }
                }
                C46076x xVar = C46076x.f124226a;
                Context context = this.f292719d.getContext();
                C87412m.m108593f(context, "parent.context");
                if (xVar.mo71517b(context)) {
                    dVar.mo162677k("KEY_IS_INSTALL_WESEE", 1);
                } else {
                    dVar.mo162677k("KEY_IS_INSTALL_WESEE", 2);
                }
                dVar.mo162677k("KEY_IS_CLICK_WESEE_BTN", 2);
            }
        }
        this.f292720e.mo14585p(C101198e.C101199b.EDIT_CROP_VIDEO, bundle);
    }

    /* renamed from: b */
    public final String mo139241b(int i) {
        if (this.f292719d.getContext() == null) {
            return "";
        }
        String string = this.f292719d.getContext().getString(i);
        C87412m.m108593f(string, "parent.context.getString(resId)");
        return string;
    }

    /* renamed from: c */
    public final void mo139242c() {
        Class cls = C60200t1.class;
        C101891f fVar = C101891f.f300035a;
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setJumpToThirdApp >> 3");
        C101891f.f300036b.f265907u = 3;
        fVar.mo141375i(3, 1);
        Intent intent = new Intent();
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 5, 44, intent);
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
        Context context = this.f292719d.getContext();
        C87412m.m108593f(context, "parent.context");
        intent.putExtra("key_finder_sns_post_type", 3);
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 6);
        intent.putExtra("key_form_sns", true);
        intent.putExtra("KEY_POST_DIRECTLY_FROM_SNS", true);
        C98324b bVar = this.f292727o;
        String str = null;
        if ((bVar != null ? bVar.f288180a : null) != null) {
            if (bVar != null) {
                str = bVar.f288180a;
            }
        } else if (bVar != null) {
            str = bVar.f288185f;
        }
        intent.putExtra("key_finder_post_sns_video_path", str);
        C98324b bVar2 = this.f292727o;
        intent.putExtra("key_finder_post_sns_video_duration_ms", bVar2 != null ? bVar2.f288184e : 0);
        C13598b0 b0Var = C13598b0.f38549a;
        t1Var.mo76837c0(context, intent);
    }

    /* renamed from: d */
    public final void mo139243d() {
        C46072b bVar = C46072b.f124220a;
        Context context = this.f292719d.getContext();
        C87412m.m108593f(context, "parent.context");
        boolean b = bVar.mo71508b(context, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        this.f292730r = C76879j.m92707A(this.f292719d.getContext(), mo139241b(b ? C0966R.string.f7988yg : C0966R.string.f7987yf), "", mo139241b(C0966R.string.a18), mo139241b(C0966R.string.f7926wf), new C99900d(this, b), new C99901e(this));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        ViewGroup viewGroup = this.f292723h;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (this.f292722g.getVisibility() != 0) {
            return false;
        }
        C101198e.C62622a.m73576a(this.f292720e, C101198e.C101199b.EDIT_CROP_CANCEL, (Bundle) null, 2, (Object) null);
        this.f292722g.animate().alpha(0.0f).setDuration(100).setListener(new C99897a(this));
        return true;
    }

    /* renamed from: f */
    public final void mo139244f() {
        C46076x xVar = C46076x.f124226a;
        Context context = this.f292719d.getContext();
        C87412m.m108593f(context, "parent.context");
        boolean b = xVar.mo71517b(context);
        C110992d.f332425a.mo162677k("KEY_IS_CLICK_WESEE_BTN", 1);
        this.f292729q = C76879j.m92707A(this.f292719d.getContext(), mo139241b(b ? C0966R.string.f8004yz : C0966R.string.f8002yx), "", mo139241b(C0966R.string.a18), mo139241b(C0966R.string.f7926wf), new C99902f(this, b), new C99903g(b, this));
    }

    /* renamed from: g */
    public void mo139245g(boolean z, float f, float f2) {
        Log.m105918d("MicroMsg.EditCropVideoPlugin", "onMove : " + f + ' ' + f2);
    }

    /* renamed from: h */
    public final void mo139246h() {
        ViewGroup viewGroup = this.f292723h;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.f292723h;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(this);
        }
        ImageView imageView = this.f292724i;
        if (imageView != null) {
            imageView.setImageDrawable(C74933u4.m89768e(this.f292719d.getContext(), C0966R.raw.icons_filled_wesee, -1));
        }
        ImageView imageView2 = this.f292725j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C74933u4.m89768e(this.f292719d.getContext(), C0966R.raw.icons_filled_arrow, -1));
        }
        ViewGroup viewGroup3 = this.f292723h;
        Context context = null;
        if (C85875k4.m106205t(viewGroup3 != null ? viewGroup3.getContext() : null, false)) {
            ViewGroup viewGroup4 = this.f292723h;
            ViewGroup.LayoutParams layoutParams = viewGroup4 != null ? viewGroup4.getLayoutParams() : null;
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.topMargin;
            ViewGroup viewGroup5 = this.f292723h;
            if (viewGroup5 != null) {
                context = viewGroup5.getContext();
            }
            marginLayoutParams.topMargin = i + C85875k4.m106198o(context);
            ViewGroup viewGroup6 = this.f292723h;
            if (viewGroup6 != null) {
                viewGroup6.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: i */
    public final void mo139247i(float f, float f2) {
        C98324b bVar = this.f292727o;
        if (bVar != null) {
            float f3 = (float) (bVar.f288184e - bVar.f288183d);
            float f4 = (f2 - f) * f3;
            RecordConfigProvider recordConfigProvider = this.f292728p;
            C87412m.m108591d(recordConfigProvider);
            int i = recordConfigProvider.f272935w + 250;
            C98324b bVar2 = this.f292727o;
            C87412m.m108591d(bVar2);
            int i2 = bVar2.f288184e;
            if (i > i2) {
                i = i2;
            }
            float f5 = f4 - ((float) i);
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            int i3 = ((int) f5) / 2;
            int round = Math.round(f * f3) + i3;
            int round2 = Math.round(f3 * f2) - i3;
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT", round);
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT", round2);
            this.f292720e.mo14585p(C101198e.C101199b.EDIT_CROP_VIDEO_LENGTH, bundle);
        }
    }

    /* renamed from: l */
    public void mo139248l(boolean z, float f, float f2) {
        Log.m105918d("MicroMsg.EditCropVideoPlugin", "onDown : " + f + ' ' + f2);
        this.f292722g.announceForAccessibility(C76577a.m92166q(this.f292719d.getContext(), z ? C0966R.string.f7531iv : C0966R.string.f7532iw));
        C101198e.C62622a.m73576a(this.f292720e, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: m */
    public void mo139249m(boolean z, float f, float f2) {
        Log.m105918d("MicroMsg.EditCropVideoPlugin", "onUp : " + f + ' ' + f2);
        this.f292732t = f;
        this.f292733u = f2;
        mo139247i(f, f2);
        C98324b bVar = this.f292727o;
        if (bVar != null) {
            int i = bVar.f288184e - bVar.f288183d;
            Object[] objArr = new Object[1];
            objArr[0] = Float.valueOf(z ? (f * ((float) i)) / ((float) 1000) : (f2 * ((float) i)) / ((float) 1000));
            String format = String.format("%.2f", Arrays.copyOf(objArr, 1));
            C87412m.m108593f(format, "format(format, *args)");
            String q = C76577a.m92166q(this.f292719d.getContext(), C0966R.string.f7539j3);
            C87412m.m108593f(q, "getString(parent.context…aging_time_in_crop_video)");
            String format2 = String.format(q, Arrays.copyOf(new Object[]{format}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            this.f292722g.announceForAccessibility(format2);
        }
    }

    public String name() {
        return C99896a.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.cb9) {
            SliderSeekBar sliderSeekBar = this.f292722g.f272945d.f313592p;
            if (sliderSeekBar != null) {
                sliderSeekBar.mo150253d();
            }
            C101198e.C62622a.m73576a(this.f292720e, C101198e.C101199b.EDIT_CROP_CANCEL, (Bundle) null, 2, (Object) null);
            this.f292722g.animate().alpha(0.0f).setDuration(100).setListener(new C99898b(this));
            ViewGroup viewGroup = this.f292723h;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.cbc) {
            mo139247i(this.f292732t, this.f292733u);
            C101198e.C62622a.m73576a(this.f292720e, C101198e.C101199b.EDIT_CROP_FINISH, (Bundle) null, 2, (Object) null);
            if (!this.f292731s) {
                this.f292722g.animate().alpha(0.0f).setDuration(100).setListener(new C99899c(this));
            }
            ViewGroup viewGroup2 = this.f292723h;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            C98324b bVar = this.f292727o;
            if (bVar != null) {
                float f = (float) (bVar.f288184e - bVar.f288183d);
                C110992d.f332425a.mo162677k("KEY_VIDEO_CROP_DURATION_MS_INT", Integer.valueOf((int) ((this.f292733u - this.f292732t) * f)));
                C101891f fVar = C101891f.f300035a;
                long j = (long) (this.f292732t * f);
                Log.m105924i("MicroMsg.VideoWidgetReporter", "setCropVideoStartTime >> " + j);
                C101891f.f300036b.f265880N = j;
                long j2 = (long) (f * this.f292733u);
                Log.m105924i("MicroMsg.VideoWidgetReporter", "setCropVideoEndTime >> " + j2);
                C101891f.f300036b.f265881O = j2;
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ccb) {
            mo139240a(false);
            C110992d.m151314c(C110992d.f332425a, "KEY_CLICK_VIDEO_CROP_COUNT_INT", 0, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ltu) {
            if (!WeChatBrands.Business.Entries.MomentChannels.checkAvailable(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (this.f292738z >= 2) {
                C110992d dVar = C110992d.f332425a;
                SnsChoosePostBussinessReportStruct snsChoosePostBussinessReportStruct = new SnsChoosePostBussinessReportStruct();
                snsChoosePostBussinessReportStruct.f265953e = 1;
                snsChoosePostBussinessReportStruct.f265952d = snsChoosePostBussinessReportStruct.mo86045b("sessionid", C110992d.f332434j, true);
                snsChoosePostBussinessReportStruct.mo86054n();
                C8477a0 a0Var = new C8477a0();
                a0Var.f27482d = true;
                C77407n nVar = new C77407n(this.f292719d.getContext(), 1, true);
                nVar.f225771i = new C88730b(nVar, this);
                nVar.f225782p = new C99904c(a0Var, this, nVar);
                nVar.f225761d = new C99905d(a0Var);
                nVar.mo107573q();
            } else if (this.f292735w) {
                mo139242c();
            } else if (this.f292736x) {
                mo139244f();
            } else if (this.f292737y) {
                mo139243d();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    /* renamed from: q */
    public void mo139251q(float f, float f2) {
        Log.m105918d("MicroMsg.EditCropVideoPlugin", "onRecyclerChanged : " + f + ' ' + f2);
        this.f292732t = f;
        this.f292733u = f2;
        mo139247i(f, f2);
    }

    public void release() {
        this.f292722g.mo129822b();
        C77398g gVar = this.f292729q;
        if (gVar != null) {
            C87412m.m108592e(gVar, "null cannot be cast to non-null type android.app.Dialog");
            if (gVar.isShowing()) {
                C77398g gVar2 = this.f292729q;
                if (gVar2 != null) {
                    gVar2.dismiss();
                }
                Log.m105924i("MicroMsg.EditCropVideoPlugin", "release dismiss dialog");
            }
        }
    }

    public void reset() {
        this.f292734v = "";
        this.f292722g.mo129822b();
    }

    public void setVisibility(int i) {
        this.f292721f.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
