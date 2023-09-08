package com.tencent.p014mm.plugin.p081mv.p082ui;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import hh2.C8532a;
import j20.C117292a;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import lb2.C61273e;
import ma2.C99823x;
import nj3.C76879j;
import nj3.C88989a;
import o40.C61926c;
import p447aw.C103918d;
import p682rz.C36594q;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvRouterUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lcom/tencent/mm/plugin/recordvideo/jumper/CaptureDataManager$b;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvRouterUI */
public final class MusicMvRouterUI extends BaseMusicMvUI implements CaptureDataManager.C94403b {

    /* renamed from: g */
    public static final /* synthetic */ int f272340g = 0;

    /* renamed from: e */
    public int f272341e = -1;

    /* renamed from: f */
    public final C0000n0 f272342f = C53930o0.m60561h(C53930o0.m60555b(), C53959v2.m60598a((C53973z1) null, 1, (Object) null));

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvRouterUI$a */
    public static final class C94262a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvRouterUI f272343d;

        public C94262a(MusicMvRouterUI musicMvRouterUI) {
            this.f272343d = musicMvRouterUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f272343d.finish();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f272343d.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvRouterUI$b */
    public static final class C94263b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvRouterUI f272344d;

        public C94263b(MusicMvRouterUI musicMvRouterUI) {
            this.f272344d = musicMvRouterUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f272344d.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo129597H7(Intent intent) {
        Intent intent2 = new Intent(this, MusicMvMainUI.class);
        intent2.addFlags(67108864);
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null) {
            intent2.putExtra("key_track_data", byteArrayExtra);
        }
        intent2.putExtra("key_seek_to_start", intent.getBooleanExtra("key_seek_to_start", false));
        overridePendingTransition(C0966R.C0968anim.f2503er, -1);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMainUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMainUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: I7 */
    public final void mo129598I7() {
        Class cls = C36594q.class;
        int i = this.f272341e;
        if (i == 1) {
            Class cls2 = C32735h.class;
            VideoTransPara Gu0 = ((C36594q) C86312j.m106911c(cls)).Gu0();
            Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "videoParams " + Gu0);
            C99823x xVar = C99823x.f292522a;
            RecordConfigProvider f = RecordConfigProvider.m119436f(xVar.mo139180a(), xVar.mo139181b(), Gu0, Gu0.f267170h * 1000, 14);
            Boolean bool = Boolean.FALSE;
            f.f272934v = bool;
            f.f272931s = bool;
            Boolean bool2 = Boolean.TRUE;
            f.f272933u = bool2;
            int intExtra = getIntent().getIntExtra("KEY_MIN_RECORD_DURATION", 1000);
            int intExtra2 = getIntent().getIntExtra("KEY_MAX_RECORD_DURATION", 1000);
            boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_FIX_CLIP_MODE", true);
            Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "record require duration:" + intExtra + ", maxVideoDuration:" + intExtra2);
            f.f272936x = intExtra;
            f.f272935w = intExtra2;
            if (intExtra > 0 && booleanExtra) {
                f.f272916R = getContext().getString(C0966R.string.hu5, new Object[]{String.valueOf((int) (((float) intExtra) / 1000.0f))});
            }
            f.f272915Q.f318441e = ((C32735h) C86312j.m106911c(cls2)).mo58784wf(C32735h.C32737c.clicfg_effect_finder_enable_beautify, true);
            f.f272915Q.f318443g = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_skin_smooth, -1);
            f.f272915Q.f318444h = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_eye_morph, -1);
            f.f272915Q.f318445i = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_face_morph, -1);
            f.f272915Q.f318446j = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_skin_bright, -1);
            f.f272915Q.f318447n = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_eye_bright, -1);
            UICustomParam.C92617b bVar = new UICustomParam.C92617b();
            bVar.mo126651e(true);
            bVar.mo126653g(true);
            ((HashMap) bVar.f266587a.f266575h).put("plugin_photo_crop", bool2);
            bVar.mo126649c(false);
            bVar.mo126648b(true);
            bVar.mo126650d(true);
            bVar.mo126654h(true);
            bVar.mo126647a(true);
            bVar.mo126652f(true);
            f.f272927o = bVar.f266587a;
            f.f272928p = C96814a.C96817e.CONTAIN;
            f.mo129804a(2, "com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditVideoPluginLayout");
            CaptureDataManager.f272890c.f272891a = this;
            C8532a.f27585a.mo9444c(this, 233, C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh, f);
        } else if (i == 2) {
            VideoTransPara Gu02 = ((C36594q) C86312j.m106911c(cls)).Gu0();
            Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "videoParams " + Gu02);
            C99823x xVar2 = C99823x.f292522a;
            RecordConfigProvider f2 = RecordConfigProvider.m119436f(xVar2.mo139180a(), xVar2.mo139181b(), Gu02, 0, 14);
            Boolean bool3 = Boolean.FALSE;
            f2.f272934v = bool3;
            Boolean bool4 = Boolean.TRUE;
            f2.f272931s = bool4;
            f2.f272932t = bool3;
            f2.f272937y = true;
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool4);
            ((HashMap) uICustomParam.f266575h).put("plugin_video_crop", bool4);
            ((HashMap) uICustomParam.f266575h).put("plugin_photo_crop", bool4);
            f2.f272927o = uICustomParam;
            f2.mo129804a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditPhotoPluginLayout");
            CaptureDataManager.f272890c.f272891a = this;
            C8532a.f27585a.mo9444c(this, 233, C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh, f2);
        } else if (i == 3) {
            Intent intent = new Intent(this, MusicMvMakerUI.class);
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_track_data");
            if (byteArrayExtra != null) {
                intent.putExtra("key_track_data", byteArrayExtra);
            }
            Intent intent2 = intent;
            C61926c.m72680e(intent2, getIntent(), "key_mv_music_duration", 0, 4, (Object) null);
            C61926c.m72680e(intent2, getIntent(), "key_mv_from_scene", 0, 4, (Object) null);
            C61926c.m72680e(intent2, getIntent(), "key_mv_enter_maker_ui_from_scene", 0, 4, (Object) null);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i == 5) {
            mo129597H7(getIntent());
            finish();
        } else if (i == 6) {
            C53895h.m60466d(this.f272342f, (C66212f) null, (C53934p0) null, new C61273e(this, this, (C15601d<? super C61273e>) null), 3, (Object) null);
        } else if (i != 7) {
            Log.m105920e("MicroMsg.Mv.MusicMvRouterUI", "unknown router: " + this.f272341e);
            finish();
        } else {
            Intent intent3 = new Intent(this, MusicMvPostUI.class);
            byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("key_track_data");
            if (byteArrayExtra2 != null) {
                intent3.putExtra("key_track_data", byteArrayExtra2);
            }
            Intent intent4 = intent3;
            C61926c.m72680e(intent4, getIntent(), "key_mv_music_duration", 0, 4, (Object) null);
            C61926c.m72680e(intent4, getIntent(), "key_mv_from_scene", 0, 4, (Object) null);
            C61926c.m72680e(intent4, getIntent(), "key_mv_enter_maker_ui_from_scene", 0, 4, (Object) null);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent3);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createPostMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createPostMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: U5 */
    public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
    }

    public int getLayoutId() {
        return -1;
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "onMediaGenerated");
        if (captureVideoNormalModel != null) {
            Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "record video path:" + captureVideoNormalModel.f272894e + ' ' + captureVideoNormalModel.f272895f);
            boolean z = true;
            if (this.f272341e == 1) {
                String str = captureVideoNormalModel.f272894e;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    Intent intent = new Intent();
                    intent.putExtra("KEY_RECORD_VIDEO_PATH", captureVideoNormalModel.f272894e);
                    intent.putExtra("KEY_RECORD_VIDEO_THUMB_PATH", captureVideoNormalModel.f272895f);
                    setResult(-1, intent);
                    C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context).finish();
                    finish();
                }
            }
            if (this.f272341e == 2) {
                Boolean bool = captureVideoNormalModel.f272897h;
                C87412m.m108593f(bool, "model.photo");
                if (bool.booleanValue()) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("KEY_RECORD_PHOTO_PATH", captureVideoNormalModel.f272895f);
                    setResult(-1, intent2);
                    C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context).finish();
                    finish();
                }
            }
            setResult(0);
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
            finish();
        }
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 233 && i2 == 0) {
            Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "cancel take photo");
            setResult(0);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f272341e = getIntent().getIntExtra("KEY_MUSIC_ROUTER", -1);
        mo129598I7();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "onDestroy");
        super.onDestroy();
        C53930o0.m60558e(this.f272342f, (CancellationException) null, 1, (Object) null);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra("KEY_MUSIC_ROUTER", -1);
            if (intExtra == 4) {
                overridePendingTransition(C0966R.C0968anim.f2503er, -1);
                finish();
            } else if (intExtra == 5) {
                mo129597H7(intent);
                finish();
            }
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "onPause");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (iArr.length == 0) {
            Log.m105925i("MicroMsg.Mv.MusicMvRouterUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.Mv.MusicMvRouterUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                C76879j.m92709C(getContext(), C76577a.m92166q(getContext(), C0966R.string.hhq), C76577a.m92166q(getContext(), C0966R.string.hif), C76577a.m92166q(getContext(), C0966R.string.fyd), C76577a.m92166q(getContext(), C0966R.string.hhr), false, new C94262a(this), new C94263b(this));
            } else {
                mo129598I7();
            }
        } else if (i == 80) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                mo129598I7();
            }
        }
    }

    public void onResume() {
        Log.m105924i("MicroMsg.Mv.MusicMvRouterUI", "onResume");
        super.onResume();
    }
}
