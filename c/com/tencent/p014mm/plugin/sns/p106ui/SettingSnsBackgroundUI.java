package com.tencent.p014mm.plugin.sns.p106ui;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import b62.C92177a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverReportStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.mediabasic.data.MediaDurationInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaResultInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout;
import com.tencent.p014mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import hh2.C8532a;
import hi2.C32925e;
import ht1.C60200t1;
import iv2.C46289a;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import os2.C100422y;
import os2.C100423z;
import p214om.C11502f;
import p447aw.C103918d;
import p823sg.C90193h;
import p910lj.C76701a;
import pj3.C47511g;
import qr2.C36069a;
import ur2.C102075b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI */
public class SettingSnsBackgroundUI extends MMPreference {

    /* renamed from: g */
    public static final /* synthetic */ int f277381g = 0;

    /* renamed from: d */
    public String f277382d;

    /* renamed from: e */
    public C47511g f277383e;

    /* renamed from: f */
    public SharedPreferences f277384f;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$a */
    public class C57373a implements Runnable {
        public C57373a(SettingSnsBackgroundUI settingSnsBackgroundUI) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$1");
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Rv0();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$b */
    public class C57374b implements Runnable {
        public C57374b(SettingSnsBackgroundUI settingSnsBackgroundUI) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$2");
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Rv0();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$c */
    public class C57375c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f164371d;

        /* renamed from: e */
        public final /* synthetic */ int f164372e;

        /* renamed from: f */
        public final /* synthetic */ Intent f164373f;

        public C57375c(int i, int i2, Intent intent) {
            this.f164371d = i;
            this.f164372e = i2;
            this.f164373f = intent;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$3");
            SettingSnsBackgroundUI settingSnsBackgroundUI = SettingSnsBackgroundUI.this;
            int i = this.f164371d;
            int i2 = this.f164372e;
            Intent intent = this.f164373f;
            int i3 = SettingSnsBackgroundUI.f277381g;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            settingSnsBackgroundUI.mo132445I7(i, i2, intent);
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$e */
    public class C57376e implements DialogInterface.OnClickListener {
        public C57376e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$5");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(SettingSnsBackgroundUI.this.getContext());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$d */
    public class C95403d implements MenuItem.OnMenuItemClickListener {
        public C95403d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$4");
            SettingSnsBackgroundUI.this.finish();
            SnsMethodCalculate.markStartTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsCoverReportStruct snsCoverReportStruct = C102075b.f300587a;
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f265987d = 3;
            }
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.mo86054n();
            }
            C102075b.f300587a = null;
            SnsMethodCalculate.markEndTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$4");
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo132444H7(String str) {
        int i;
        RecordConfigProvider recordConfigProvider;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        C36069a aVar = C36069a.f96150a;
        if (aVar.mo60517b()) {
            String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(str);
            Log.m105925i("MicroMsg.SettingSnsBackgroundUI", "mediaEdit mimeType:%s", mimeTypeByFilePath);
            if (TextUtils.isEmpty(mimeTypeByFilePath)) {
                SnsMethodCalculate.markEndTimeMs("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                return;
            }
            if (mimeTypeByFilePath.contains("image")) {
                recordConfigProvider = RecordConfigProvider.m119432b(str2, C32925e.f89499a.mo58863c("sns_cover", (String) null));
                recordConfigProvider.mo129804a(1, SnsCoverImageEditPluginLayout.class.getName());
                SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                SnsCoverReportStruct snsCoverReportStruct = C102075b.f300587a;
                if (snsCoverReportStruct != null) {
                    snsCoverReportStruct.f265991h = 1;
                }
                if (snsCoverReportStruct != null) {
                    snsCoverReportStruct.f265987d = 4;
                }
                SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                i = 1;
            } else {
                String[] e = C32925e.f89499a.mo58864e("sns_cover", "video", "thumb");
                recordConfigProvider = RecordConfigProvider.m119433c(str2, e[0], e[1]);
                recordConfigProvider.mo129804a(2, SnsCoverVideoEditPluginLayout.class.getName());
                SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                SnsCoverReportStruct snsCoverReportStruct2 = C102075b.f300587a;
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.f265991h = 2;
                }
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.f265987d = 4;
                }
                SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                i = 2;
            }
            VideoTransPara a = aVar.mo60516a();
            recordConfigProvider.f272926n = a;
            recordConfigProvider.f272935w = a.f267170h * 1000;
            recordConfigProvider.f272938z = false;
            C8532a.f27585a.mo9446e(getContext(), 8, C0966R.C0968anim.f2492eg, -1, recordConfigProvider, i, 0);
        } else {
            SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsCoverReportStruct snsCoverReportStruct3 = C102075b.f300587a;
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f265991h = 1;
            }
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f265987d = 4;
            }
            SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            Intent intent = new Intent();
            intent.putExtra("CropImageMode", 1);
            intent.putExtra("CropImage_ImgPath", str2);
            String f = C90193h.m112878f((str2 + System.currentTimeMillis()).getBytes());
            intent.putExtra("CropImage_OutputPath", C94866e1.m120263iU() + f);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93178k(this, intent, 6);
        }
        SnsMethodCalculate.markEndTimeMs("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    /* renamed from: I7 */
    public final void mo132445I7(int i, int i2, Intent intent) {
        String str;
        T t;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        Iterator<MediaSingleInfo> it;
        char c;
        boolean z2;
        int i3 = i;
        Intent intent2 = intent;
        C92177a aVar = C92177a.VIDEO;
        C92177a aVar2 = C92177a.IMAGE;
        String str8 = "onActivityResultImp";
        SnsMethodCalculate.markStartTimeMs(str8, "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        if (i3 == 2) {
            str = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
            Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_TAKE_PICTURE");
            String b = C96892t1.m124462b(getApplicationContext(), intent2, C94866e1.m120263iU());
            this.f277382d = b;
            if (b == null) {
                SnsMethodCalculate.markEndTimeMs(str8, str);
                return;
            }
            mo132444H7(b);
        } else if (i3 == 5) {
            str = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
            Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_IMAGE_BROUND");
            if (intent2 == null) {
                SnsMethodCalculate.markEndTimeMs(str8, str);
                return;
            }
            String b2 = C7013o.m7260b(getApplicationContext(), intent2, C94866e1.m120263iU());
            this.f277382d = b2;
            if (b2 == null) {
                SnsMethodCalculate.markEndTimeMs(str8, str);
                return;
            }
            mo132444H7(b2);
        } else if (i3 != 6) {
            switch (i3) {
                case 8:
                    ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Rv0();
                    MediaResultInfo mediaResultInfo = (MediaResultInfo) intent2.getParcelableExtra("media_basic_out_model");
                    if (mediaResultInfo != null && mediaResultInfo.f272120d) {
                        Iterator<T> it4 = mediaResultInfo.f272121e.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                t = it4.next();
                                if (((MediaSingleInfo) t).f272123d == aVar) {
                                    z2 = true;
                                    continue;
                                } else {
                                    z2 = false;
                                    continue;
                                }
                                if (z2) {
                                }
                            } else {
                                t = null;
                            }
                        }
                        if (t != null) {
                            C94928p2 gy02 = C94866e1.gy0();
                            ArrayList<MediaSingleInfo> arrayList = mediaResultInfo.f272121e;
                            gy02.getClass();
                            SnsMethodCalculate.markStartTimeMs("setSnsCoverByVideo", "com.tencent.mm.plugin.sns.model.UploadManager");
                            Iterator<MediaSingleInfo> it5 = arrayList.iterator();
                            String str9 = "";
                            String str10 = str9;
                            String str11 = str10;
                            while (it5.hasNext()) {
                                MediaSingleInfo next = it5.next();
                                if (next.f272123d == aVar) {
                                    str9 = next.f272124e;
                                    it = it5;
                                    c = 0;
                                    Log.m105925i("MicroMsg.UploadManager", "videoPath:%s", str9);
                                } else {
                                    it = it5;
                                    c = 0;
                                }
                                if (next.f272123d == C92177a.THUMB) {
                                    str10 = next.f272124e;
                                    Object[] objArr = new Object[1];
                                    objArr[c] = str10;
                                    Log.m105925i("MicroMsg.UploadManager", "thumbPath:%s", objArr);
                                }
                                if (next.f272123d == aVar2) {
                                    String str12 = next.f272124e;
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c] = str12;
                                    Log.m105925i("MicroMsg.UploadManager", "coverPath:%s", objArr2);
                                    str11 = str12;
                                    it5 = it;
                                } else {
                                    it5 = it;
                                }
                            }
                            Log.m105925i("MicroMsg.UploadManager", "videoPath:%s thumbPath:%s", str9, str10);
                            if (gy02.mo131197h() == null || gy02.mo131197h().equals("")) {
                                str5 = "setSnsCoverByVideo";
                                str4 = "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter";
                                str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                str7 = str11;
                                str3 = str8;
                            } else {
                                String e = C94938q1.m120518e(C94866e1.m120262YO(), gy02.mo131197h());
                                C86013q1.m106461v(e);
                                String str13 = e + gy02.mo131197h() + "thumb_bg_";
                                String str14 = e + gy02.mo131197h() + "vdieo_bg_";
                                String str15 = e + gy02.mo131197h() + "image_bg_";
                                C86013q1.m106447h(e + gy02.mo131197h() + "bg_");
                                gy02.mo131203n(str9, str14);
                                gy02.mo131203n(str10, str13);
                                str7 = str11;
                                gy02.mo131203n(str7, str15);
                                C100423z Ux0 = C94866e1.Ux0();
                                String h = gy02.mo131197h();
                                Ux0.getClass();
                                str3 = str8;
                                str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                SnsMethodCalculate.markStartTimeMs("updateCoverVideoInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                                C87412m.m108594g(h, "userName");
                                C87412m.m108594g(str14, "videoPath");
                                C87412m.m108594g(str13, "thumbPath");
                                C87412m.m108594g(str15, "imagePath");
                                StringBuilder sb = new StringBuilder();
                                str5 = "setSnsCoverByVideo";
                                sb.append("updateCoverVideoInfoLocal :");
                                sb.append(h);
                                Log.m105924i("MicroMsg.SnsCoverStorage", sb.toString());
                                C100422y Yt = Ux0.mo139909Yt(h);
                                Yt.field_userName = h;
                                Ux0.mo139911jo(Yt);
                                Yt.field_type = 2;
                                if (!C87412m.m108589b(str14, Yt.field_localVideo)) {
                                    str4 = "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter";
                                    str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                    ((C119157j) C119157j.f356862d).mo183870a(new C100423z.C100425b(Yt.field_localVideo));
                                    Yt.field_localVideo = str14;
                                } else {
                                    str4 = "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter";
                                    str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                }
                                if (!C87412m.m108589b(str13, Yt.field_localThumb)) {
                                    ((C119157j) C119157j.f356862d).mo183870a(new C100423z.C100425b(Yt.field_localThumb));
                                    Yt.field_localThumb = str13;
                                }
                                if (!C87412m.m108589b(str15, Yt.field_localImage)) {
                                    z = false;
                                    ((C119157j) C119157j.f356862d).mo183870a(new C100423z.C100425b(Yt.field_localImage));
                                    Yt.field_localImage = str15;
                                } else {
                                    z = false;
                                }
                                Ux0.mo139910bD(Yt, z);
                                SnsMethodCalculate.markEndTimeMs("updateCoverVideoInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                            }
                            gy02.mo131198i();
                            SnsMethodCalculate.markStartTimeMs("uploadSnsVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
                            C94945s2 s2Var = new C94945s2(7, (Context) null);
                            if (C86013q1.m106450k(str7)) {
                                s2Var.mo131244a(str7, "");
                            }
                            if (C86013q1.m106450k(str9)) {
                                s2Var.mo131250g(str9, str10, "", C86013q1.m106456q(str9));
                            }
                            s2Var.mo131227A(1);
                            int i4 = s2Var.mo131252i();
                            SnsReportHelper.f275506m0.f275531Y = i4;
                            String str16 = str4;
                            SnsMethodCalculate.markStartTimeMs("setLocalId", str16);
                            C102075b.f300589c = i4;
                            C102075b.f300588b = System.currentTimeMillis();
                            SnsMethodCalculate.markEndTimeMs("setLocalId", str16);
                            SnsMethodCalculate.markEndTimeMs("uploadSnsVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
                            SnsMethodCalculate.markEndTimeMs(str5, str6);
                        } else {
                            str3 = str8;
                            str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                            C94866e1.gy0().mo131206q(mediaResultInfo.f272121e);
                        }
                        setResult(-1);
                        finish();
                        str8 = str3;
                        str = str2;
                        break;
                    } else {
                        Log.m105920e("MicroMsg.SettingSnsBackgroundUI", "CaptureVideoNormalModel is null");
                        SnsMethodCalculate.markEndTimeMs(str8, "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                        return;
                    }
                case 9:
                    if (intent2 != null) {
                        C46289a.f124738a.mo71702a(this, 10, intent2.getByteArrayExtra("SELECT_OBJECT"), intent2.getIntExtra("SELECT_TAB_TYPE", 0));
                        break;
                    } else {
                        SnsMethodCalculate.markEndTimeMs(str8, "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                        return;
                    }
                case 10:
                    FinderObject finderObject = new FinderObject();
                    try {
                        finderObject.parseFrom(intent2.getByteArrayExtra("SELECT_OBJECT"));
                    } catch (IOException e2) {
                        Log.printErrStackTrace("MicroMsg.SettingSnsBackgroundUI", e2, "FinderObject error", new Object[0]);
                    }
                    FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                    if (finderObjectDesc != null) {
                        int i5 = finderObjectDesc.mediaType;
                        if (i5 == 2) {
                            SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                            SnsCoverReportStruct snsCoverReportStruct = C102075b.f300587a;
                            if (snsCoverReportStruct != null) {
                                snsCoverReportStruct.f265991h = 4;
                            }
                            if (snsCoverReportStruct != null) {
                                snsCoverReportStruct.f265987d = 4;
                            }
                            SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                        } else if (i5 == 4) {
                            SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                            SnsCoverReportStruct snsCoverReportStruct2 = C102075b.f300587a;
                            if (snsCoverReportStruct2 != null) {
                                snsCoverReportStruct2.f265991h = 3;
                            }
                            if (snsCoverReportStruct2 != null) {
                                snsCoverReportStruct2.f265987d = 4;
                            }
                            SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                        }
                    }
                    C94866e1.gy0().mo131205p(finderObject);
                    setResult(-1);
                    finish();
                    break;
                default:
                    Log.m105920e("MicroMsg.SettingSnsBackgroundUI", "onActivityResult: not found this requestCode");
                    SnsMethodCalculate.markEndTimeMs(str8, "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                    return;
            }
            str = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
        } else {
            str = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
            Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM");
            new MMHandler(Looper.getMainLooper()).post(new C57373a(this));
            if (intent2 == null) {
                SnsMethodCalculate.markEndTimeMs(str8, str);
                return;
            }
            String stringExtra = intent2.getStringExtra("CropImage_OutputPath");
            this.f277382d = stringExtra;
            if (stringExtra == null) {
                SnsMethodCalculate.markEndTimeMs(str8, str);
                return;
            }
            Log.m105924i("MicroMsg.SettingSnsBackgroundUI", "REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM   " + this.f277382d);
            ArrayList arrayList2 = new ArrayList();
            String str17 = this.f277382d;
            C87412m.m108594g(str17, "path");
            arrayList2.add(new MediaSingleInfo(aVar2, str17, (MediaDurationInfo) null, 4, (C8480h) null));
            C94866e1.gy0().mo131206q(arrayList2);
            setResult(-1);
            finish();
        }
        SnsMethodCalculate.markEndTimeMs(str8, str);
    }

    /* renamed from: J7 */
    public final void mo132446J7() {
        SnsMethodCalculate.markStartTimeMs("takePhotoAfterPermissionGranted", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        C36069a aVar = C36069a.f96150a;
        if (aVar.mo60517b()) {
            String[] e = C32925e.f89499a.mo58864e("sns_cover", "video", "thumb");
            RecordConfigProvider d = RecordConfigProvider.m119434d(e[0], e[1]);
            d.mo129804a(1, SnsCoverImageEditPluginLayout.class.getName());
            d.mo129804a(2, SnsCoverVideoEditPluginLayout.class.getName());
            VideoTransPara a = aVar.mo60516a();
            d.f272926n = a;
            d.f272935w = a.f267170h * 1000;
            d.f272938z = true;
            d.f272934v = Boolean.FALSE;
            C8532a.f27585a.mo9445d(getContext(), 8, C0966R.C0968anim.f2492eg, -1, d, 0);
        } else {
            String l = C112760b.m154240l();
            if (!C96892t1.m124468h(this, l, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ik5), 1).show();
            }
        }
        SnsReportHelper.f275506m0.mo131343D().f265983d = 2;
        SnsMethodCalculate.markEndTimeMs("takePhotoAfterPermissionGranted", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public int getResourceId() {
        SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        return C0966R.xml.f8969cq;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        setMMTitle((int) C0966R.string.iz5);
        SnsArtistPreference snsArtistPreference = (SnsArtistPreference) this.f277383e.mo72519a("settings_sns_bg_select_bg");
        if (snsArtistPreference != null) {
            String string = this.f277384f.getString("artist_name", "");
            Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "artistName" + string);
            SnsMethodCalculate.markStartTimeMs("setArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
            snsArtistPreference.f21189P = string;
            snsArtistPreference.mo6442I();
            SnsMethodCalculate.markEndTimeMs("setArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
            this.f277383e.notifyDataSetChanged();
        }
        setBackBtn(new C95403d());
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        Log.m105924i("MicroMsg.SettingSnsBackgroundUI", "onAcvityResult requestCode:" + i + " " + i2);
        if (i2 != -1) {
            if (i == 2 || i == 5 || i == 6) {
                new MMHandler(Looper.getMainLooper()).post(new C57374b(this));
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("result ok ");
        C86709a0.m107528h();
        sb.append(C86709a0.m107523b().mo121114l());
        Log.m105918d("MicroMsg.SettingSnsBackgroundUI", sb.toString());
        if (C94866e1.qy0()) {
            new MMHandler(Looper.myLooper()).postDelayed(new C57375c(i, i2, intent), 2000);
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return;
        }
        Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "isInValid ok");
        mo132445I7(i, i2, intent);
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onBackPressed();
        SnsMethodCalculate.markStartTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        SnsCoverReportStruct snsCoverReportStruct = C102075b.f300587a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f265987d = 3;
        }
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.mo86054n();
        }
        C102075b.f300587a = null;
        SnsMethodCalculate.markEndTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "onCreate");
        super.onCreate(bundle);
        this.f277383e = getPreferenceScreen();
        this.f277384f = getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        if (!C36069a.f96150a.mo60517b()) {
            this.f277383e.mo72531o("settings_sns_bg_select_from_finder");
        }
        initView();
        SnsMethodCalculate.markStartTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        C102075b.f300587a = new SnsCoverReportStruct();
        SnsMethodCalculate.markEndTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onDestroy();
        Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "onDestroy");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public void onNewIntent(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        Log.m105918d("MicroMsg.SettingSnsBackgroundUI", "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        setResult(-1);
        finish();
        SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingSnsBackgroundUI", str + " item has been clicked!");
        boolean z = false;
        if (str.equals("settings_sns_bg_select_from_album")) {
            SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsCoverReportStruct snsCoverReportStruct = C102075b.f300587a;
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f265991h = 10;
            }
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f265987d = 4;
            }
            SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsMethodCalculate.markStartTimeMs("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92771j(this, (View) null);
                SnsMethodCalculate.markEndTimeMs("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            } else {
                if (C36069a.f96150a.mo60517b()) {
                    C96892t1.m124463c(this, 5, 1, 31, 3, true, (Intent) null);
                } else {
                    C96892t1.m124464d(this, 5, 1, 0, (Intent) null, true);
                }
                SnsReportHelper.f275506m0.mo131343D().f265983d = 1;
                SnsMethodCalculate.markEndTimeMs("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return z;
        } else if (str.equals("settings_sns_bg_select_from_finder")) {
            SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsCoverReportStruct snsCoverReportStruct2 = C102075b.f300587a;
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.f265991h = 11;
            }
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.f265987d = 4;
            }
            SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsMethodCalculate.markStartTimeMs("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92771j(this, (View) null);
                SnsMethodCalculate.markEndTimeMs("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            } else {
                Intent intent = new Intent();
                intent.putExtra("BIZ_SCENE", 3);
                ArrayList arrayList = new ArrayList();
                arrayList.add(2);
                arrayList.add(4);
                arrayList.add(5);
                arrayList.add(3);
                arrayList.add(1);
                intent.putIntegerArrayListExtra("TAB_LIST", arrayList);
                overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76880tQ(this, intent, 9);
                SnsMethodCalculate.markEndTimeMs("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return z;
        } else if (str.equals("settings_sns_bg_take_photo")) {
            SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsCoverReportStruct snsCoverReportStruct3 = C102075b.f300587a;
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f265991h = 12;
            }
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f265987d = 4;
            }
            SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsMethodCalculate.markStartTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92771j(this, (View) null);
                SnsMethodCalculate.markEndTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            } else {
                boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(getContext(), "android.permission.CAMERA", 16, "", "");
                Log.m105925i("MicroMsg.SettingSnsBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), getContext());
                if (!z1) {
                    SnsMethodCalculate.markEndTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                } else {
                    mo132446J7();
                    SnsMethodCalculate.markEndTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                    z = true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return z;
        } else if (str.equals("settings_sns_bg_select_bg")) {
            SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsCoverReportStruct snsCoverReportStruct4 = C102075b.f300587a;
            if (snsCoverReportStruct4 != null) {
                snsCoverReportStruct4.f265991h = 13;
            }
            if (snsCoverReportStruct4 != null) {
                snsCoverReportStruct4.f265987d = 4;
            }
            SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsMethodCalculate.markStartTimeMs("setSelectBg", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            Intent intent2 = new Intent(this, ArtistUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SettingSnsBackgroundUI", "setSelectBg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/sns/ui/SettingSnsBackgroundUI", "setSelectBg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            SnsReportHelper.f275506m0.mo131343D().f265983d = 8;
            SnsReportHelper.f275506m0.mo131343D().f265984e = 1;
            SnsMethodCalculate.markEndTimeMs("setSelectBg", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return false;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return;
        }
        Log.m105925i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (iArr[0] == 0) {
                mo132446J7();
            } else {
                C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C57376e(), (DialogInterface.OnClickListener) null);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onResume();
        C47511g gVar = this.f277383e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }
}
