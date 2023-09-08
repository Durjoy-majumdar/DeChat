package yt2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C43098a8;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import da0.C58247e;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import h81.C32735h;
import hi2.C46075u;
import i21.C60242i;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import kg3.C76577a;
import kotlin.ResultKt;
import lc3.C10485b;
import nj3.C76875f0;
import nj3.C76912y0;
import p214om.C11502f;
import p914oj.C89231c;
import rx3.C13598b0;
import sf0.C90188n0;
import vr2.C102236a0;
import wx3.C15601d;
import wx3.C66212f;
import xb0.C102609h;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: yt2.a */
public final class C102905a implements C39160b {

    /* renamed from: a */
    public final Context f303730a;

    /* renamed from: b */
    public boolean f303731b;

    /* renamed from: yt2.a$a */
    public static final class C53570a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C102905a f150558d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f150559e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1", mo125469f = "AlbumEntrance.kt", mo125470l = {91}, mo125471m = "invokeSuspend")
        /* renamed from: yt2.a$a$a */
        public static final class C53571a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f150560d;

            /* renamed from: e */
            public final /* synthetic */ C102905a f150561e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f150562f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C53571a(C102905a aVar, C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C53571a> dVar) {
                super(2, dVar);
                this.f150561e = aVar;
                this.f150562f = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                C53571a aVar = new C53571a(this.f150561e, this.f150562f, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                Object invokeSuspend = ((C53571a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f150560d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C102905a aVar2 = this.f150561e;
                    C32226l<Boolean, C13598b0> lVar = this.f150562f;
                    this.f150560d = 1;
                    if (aVar2.mo61965b(lVar, this) == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                    throw illegalStateException;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2$1");
                return b0Var;
            }
        }

        public C53570a(C102905a aVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f150558d = aVar;
            this.f150559e = lVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2");
            C86709a0.m107535s().mo121142i().mo119676J(68386, Integer.valueOf(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68386, (Object) null), 0) + 1));
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C53571a(this.f150558d, this.f150559e, (C15601d<? super C53571a>) null), 3, (Object) null);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$handleSelect$2");
        }
    }

    /* renamed from: yt2.a$b */
    public static final class C66699b implements Runnable {

        /* renamed from: d */
        public static final C66699b f191741d = new C66699b();

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$onActivityResult$1");
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Rv0();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance$onActivityResult$1");
        }
    }

    public C102905a(Context context) {
        C87412m.m108594g(context, "context");
        this.f303730a = context;
    }

    /* renamed from: a */
    public C76875f0 mo61964a() {
        SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        C76875f0 f0Var = new C76875f0(this.f303730a, type(), 0);
        f0Var.f224717i = C76577a.m92166q(this.f303730a, C0966R.string.f7989yh);
        SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return f0Var;
    }

    /* renamed from: b */
    public Object mo61965b(C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C13598b0> dVar) {
        int i;
        C32226l<? super Boolean, C13598b0> lVar2 = lVar;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92771j(this.f303730a, (View) null);
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
            return b0Var;
        }
        boolean z = false;
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68385, (Object) null), 0);
        int nullAs2 = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68386, (Object) null), 0);
        if (this.f303731b || nullAs >= 3 || nullAs2 != 0) {
            lVar2.invoke(Boolean.TRUE);
            if (C112551y.m153809i(this.f303730a.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("gallery", "1"), "0", true)) {
                Context context = this.f303730a;
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                C96892t1.m124464d((Activity) context, 2, 1, 0, (Intent) null, true);
            } else {
                int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SnsCanPickVideoFromAlbum", 1);
                Log.m105925i("MicroMsg.AlbumEntrance", "takeVideo %d", new Integer(b));
                boolean z2 = C90188n0.f258933a;
                int i2 = b != 0 ? 3 : 1;
                Intent intent = new Intent();
                boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_enable_vlog, false);
                boolean a = ((C58247e) C86312j.m106911c(C58247e.class)).ni0().mo72159a();
                Log.m105925i("MicroMsg.AlbumEntrance", "enableSnsTemplate:%b", Boolean.valueOf(a));
                if (a) {
                    int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_num, 20);
                    Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Qe);
                    i = Qe;
                } else {
                    i = 9;
                }
                if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || wf || a) {
                    z = true;
                }
                intent.putExtra("key_can_select_video_and_pic", !z);
                intent.putExtra("key_edit_video_max_time_length", C102609h.Fx0().Gx0().f267170h);
                intent.putExtra("key_sns_publish_template", a);
                intent.putExtra("key_filter_hdr_video", a);
                intent.putExtra("gallery_report_tag", 4);
                intent.putExtra("key_check_third_party_video", true);
                intent.putExtra("KSnsFrom", 1);
                intent.putExtra("record_video_is_sight_capture", true);
                Context context2 = this.f303730a;
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                C96892t1.m124463c((Activity) context2, 14, i, 4, i2, SnsTimeLineUI.m122313w8(), intent);
                if (SnsTimeLineUI.m122313w8()) {
                    ((Activity) this.f303730a).overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
            return b0Var2;
        }
        this.f303731b = true;
        C43098a8.m46711a(this.f303730a, new C53570a(this, lVar2));
        C13598b0 b0Var3 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return b0Var3;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        int i3;
        String str2;
        String str3;
        Bundle bundleExtra;
        int i4 = i2;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        C57354l.C57355a aVar = C57354l.f164333a;
        aVar.mo80965b(14);
        if (i4 != -1) {
            C60960c.f173618a.mo85927k("SnsPublishProcess", "opresult_", 4, C60242i.DEFAULT);
            str = "onActivityResult";
            i3 = 14;
            aVar.mo80976m(0, false, true, false, false, false, false, false, false);
            aVar.mo80966c((String) null);
        } else {
            str = "onActivityResult";
            i3 = 14;
        }
        if (i4 != -1 || intent2 == null) {
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
            return;
        }
        if (i == i3) {
            Context context = this.f303730a;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            aVar.mo80969f((Activity) context);
            Intent intent3 = new Intent(this.f303730a, SnsUploadUI.class);
            intent3.putExtra("KSnsFrom", i3);
            new MMHandler(Looper.getMainLooper()).post(C66699b.f191741d);
            ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
            C102236a0.m134781y0(intent2.getStringExtra("KSEGMENTMEDIAEDITID"));
            if ((stringArrayListExtra == null || stringArrayListExtra.size() <= 0) && Util.isNullOrNil(intent2.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                str2 = str;
                ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("CropImage_OutputPath_List");
                if (stringArrayListExtra2 == null || stringArrayListExtra2.size() == 0) {
                    Log.m105924i("MicroMsg.AlbumEntrance", "no image selected");
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                    return;
                }
                aVar.mo80967d(stringArrayListExtra2);
                ArrayList arrayList = new ArrayList();
                intent3.putExtra("KSnsPostManu", true);
                intent3.putExtra("KTouchCameraTime", Util.nowSecond());
                int intExtra = intent2.getIntExtra("CropImage_filterId", 0);
                intent3.putExtra("sns_kemdia_path_list", stringArrayListExtra2);
                intent3.putExtra("KFilterId", intExtra);
                intent3.putStringArrayListExtra("sns_media_latlong_list", arrayList);
                Log.m105919d("MicroMsg.AlbumEntrance", "shared type %d", Integer.valueOf(intent3.getIntExtra("Ksnsupload_type", -1)));
                Context context2 = this.f303730a;
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(6);
                aVar2.mo10233c(intent3);
                C117292a.m165364j((Activity) context2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else {
                String stringExtra = (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) ? intent2.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra.get(0);
                String stringExtra2 = intent2.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                if (Util.isNullOrNil(stringExtra2) || !C86013q1.m106450k(stringExtra2)) {
                    String str4 = C94866e1.m120263iU() + C86013q1.m106456q(stringExtra);
                    C89231c cVar = new C89231c();
                    try {
                        cVar.setDataSource(stringExtra);
                        Bitmap frameAtTime = cVar.getFrameAtTime(0);
                        if (frameAtTime == null) {
                            Log.m105920e("MicroMsg.AlbumEntrance", "get bitmap error");
                            try {
                                cVar.release();
                            } catch (Exception unused) {
                            }
                            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                            return;
                        }
                        str3 = str;
                        try {
                            Log.m105925i("MicroMsg.AlbumEntrance", "getBitmap1 %d %d", Integer.valueOf(frameAtTime.getWidth()), Integer.valueOf(frameAtTime.getHeight()));
                            BitmapUtil.saveBitmapToImage(frameAtTime, 80, Bitmap.CompressFormat.JPEG, str4, true);
                            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str4);
                            Log.m105925i("MicroMsg.AlbumEntrance", "getBitmap2 %d %d", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
                        } catch (Exception e) {
                            e = e;
                            try {
                                Log.m105921e("MicroMsg.AlbumEntrance", "savebitmap error %s", e.getMessage());
                                cVar.release();
                                stringExtra2 = str4;
                                Log.m105925i("MicroMsg.AlbumEntrance", "video path %s thumb path %s and %s %s ", stringExtra, stringExtra2, Long.valueOf(C86013q1.m106451l(stringExtra)), Long.valueOf(C86013q1.m106451l(stringExtra2)));
                                intent3.putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                                intent3.putExtra("KSightPath", stringExtra);
                                intent3.putExtra("KSightThumbPath", stringExtra2);
                                intent3.putExtra("sight_md5", C86013q1.m106456q(stringExtra));
                                intent3.putExtra("KSnsPostManu", true);
                                intent3.putExtra("KTouchCameraTime", Util.nowSecond());
                                intent3.putExtra("Ksnsupload_type", 14);
                                intent3.putExtra("KSnsVideoTempalteInfo", intent2.getByteArrayExtra("key_video_template_info"));
                                intent3.putExtra("key_composition_info", bundleExtra.getByteArray("key_composition_info"));
                                intent3.putExtra("Kis_take_photo", false);
                                C46075u.f124225a.mo71513a(intent3, intent2);
                                Context context3 = this.f303730a;
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(intent3);
                                Context context4 = context3;
                                C117292a.m165358d(context4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context3.startActivity((Intent) aVar3.mo10231a(0));
                                C117292a.m165359e(context4, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                                return;
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        try {
                            cVar.release();
                        } catch (Exception unused2) {
                        }
                        stringExtra2 = str4;
                    } catch (Exception e2) {
                        e = e2;
                        str3 = str;
                        Log.m105921e("MicroMsg.AlbumEntrance", "savebitmap error %s", e.getMessage());
                        cVar.release();
                        stringExtra2 = str4;
                        Log.m105925i("MicroMsg.AlbumEntrance", "video path %s thumb path %s and %s %s ", stringExtra, stringExtra2, Long.valueOf(C86013q1.m106451l(stringExtra)), Long.valueOf(C86013q1.m106451l(stringExtra2)));
                        intent3.putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                        intent3.putExtra("KSightPath", stringExtra);
                        intent3.putExtra("KSightThumbPath", stringExtra2);
                        intent3.putExtra("sight_md5", C86013q1.m106456q(stringExtra));
                        intent3.putExtra("KSnsPostManu", true);
                        intent3.putExtra("KTouchCameraTime", Util.nowSecond());
                        intent3.putExtra("Ksnsupload_type", 14);
                        intent3.putExtra("KSnsVideoTempalteInfo", intent2.getByteArrayExtra("key_video_template_info"));
                        intent3.putExtra("key_composition_info", bundleExtra.getByteArray("key_composition_info"));
                        intent3.putExtra("Kis_take_photo", false);
                        C46075u.f124225a.mo71513a(intent3, intent2);
                        Context context32 = this.f303730a;
                        C9556a aVar32 = new C9556a();
                        aVar32.mo10233c(intent3);
                        Context context42 = context32;
                        C117292a.m165358d(context42, aVar32.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context32.startActivity((Intent) aVar32.mo10231a(0));
                        C117292a.m165359e(context42, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        str3 = str;
                        try {
                            cVar.release();
                        } catch (Exception unused3) {
                        }
                        SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                        throw th;
                    }
                } else {
                    str3 = str;
                }
                Log.m105925i("MicroMsg.AlbumEntrance", "video path %s thumb path %s and %s %s ", stringExtra, stringExtra2, Long.valueOf(C86013q1.m106451l(stringExtra)), Long.valueOf(C86013q1.m106451l(stringExtra2)));
                intent3.putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                intent3.putExtra("KSightPath", stringExtra);
                intent3.putExtra("KSightThumbPath", stringExtra2);
                intent3.putExtra("sight_md5", C86013q1.m106456q(stringExtra));
                intent3.putExtra("KSnsPostManu", true);
                intent3.putExtra("KTouchCameraTime", Util.nowSecond());
                intent3.putExtra("Ksnsupload_type", 14);
                intent3.putExtra("KSnsVideoTempalteInfo", intent2.getByteArrayExtra("key_video_template_info"));
                if (intent2.hasExtra("key_extra_data") && (bundleExtra = intent2.getBundleExtra("key_extra_data")) != null && bundleExtra.containsKey("key_composition_info")) {
                    intent3.putExtra("key_composition_info", bundleExtra.getByteArray("key_composition_info"));
                }
                intent3.putExtra("Kis_take_photo", false);
                C46075u.f124225a.mo71513a(intent3, intent2);
                Context context322 = this.f303730a;
                C9556a aVar322 = new C9556a();
                aVar322.mo10233c(intent3);
                Context context422 = context322;
                C117292a.m165358d(context422, aVar322.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context322.startActivity((Intent) aVar322.mo10231a(0));
                C117292a.m165359e(context422, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                return;
            }
        } else {
            str2 = str;
        }
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
    }

    public boolean show() {
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return true;
    }

    public int type() {
        SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        int a = C53572c.ALBUM.mo74217a();
        SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return a;
    }
}
