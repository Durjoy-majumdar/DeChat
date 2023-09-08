package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import i72.C108375b;
import i72.C108388k;
import i72.C108392r;
import j20.C117292a;
import j72.C108607f;
import java.util.ArrayList;
import l72.C109273a;
import lu3.C34379c;
import org.json.JSONObject;
import p156gj.C107835h0;
import te3.C101783gu2;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.e0 */
public class C105525e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f313920d;

    public C105525e0(SightCaptureUI sightCaptureUI) {
        this.f313920d = sightCaptureUI;
    }

    public void onClick(View view) {
        C105525e0 e0Var;
        int i;
        C108607f fVar;
        String str;
        String str2;
        C94554a c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SightCaptureUI sightCaptureUI = this.f313920d;
        int i2 = sightCaptureUI.f313866g;
        if (i2 == 4) {
            int i3 = sightCaptureUI.f313847V.f248458o;
            if (i3 == 1 || i3 == 2 || i3 == 7) {
                C115669n.INSTANCE.mo160131h(13820, Integer.valueOf(sightCaptureUI.f313853Y ? sightCaptureUI.f313855Z ? 2 : 1 : 0), Integer.valueOf(sightCaptureUI.f313847V.f248458o), sightCaptureUI.f313847V.f248460q, Long.valueOf(Util.nowSecond()));
            }
            SightParams sightParams = sightCaptureUI.f313847V;
            if (sightParams != null && sightCaptureUI.f313848V0) {
                C109273a.m148388a(new C109273a.C109274a(sightParams.f248458o));
            }
            Intent intent = new Intent();
            String filePath = sightCaptureUI.f313871j.getFilePath();
            String str3 = Util.nullAs(filePath, "") + ".thumb";
            if (sightCaptureUI.f313847V.f248459p) {
                sightCaptureUI.mo150342K7(filePath, false);
            }
            if (C108375b.m146794b() != null) {
                C101783gu2 gu22 = sightCaptureUI.f313834M;
                C108375b b = C108375b.m146794b();
                if (b.f324450I == null) {
                    try {
                        b.f324450I = new JSONObject();
                        JSONObject jSONObject = new JSONObject();
                        b.f324450I.put("wxcamera", jSONObject);
                        jSONObject.put("model", b.f324451a);
                        jSONObject.put("apiLevel", b.f324452b);
                        jSONObject.put("screen", String.format("%dx%d", new Object[]{Integer.valueOf(b.f324456f), Integer.valueOf(b.f324457g)}));
                        jSONObject.put("crop", String.format("%dx%d", new Object[]{Integer.valueOf(b.f324462l), Integer.valueOf(b.f324463m)}));
                        jSONObject.put("preview", String.format("%dx%d", new Object[]{Integer.valueOf(b.f324464n), Integer.valueOf(b.f324465o)}));
                        jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_ENCODER, String.format("%dx%d", new Object[]{Integer.valueOf(b.f324466p), Integer.valueOf(b.f324467q)}));
                        jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, b.f324468r);
                        jSONObject.put("deviceoutfps", b.f324469s);
                        jSONObject.put("recordfps", b.f324470t);
                        jSONObject.put("recordertype", b.f324471u);
                        jSONObject.put("needRotateEachFrame", b.f324473w);
                        jSONObject.put("isNeedRealtimeScale", b.f324474x);
                        jSONObject.put("resolutionLimit", b.f324475y);
                        jSONObject.put("videoBitrate", b.f324472v);
                        str2 = "longitude";
                        str = "album_business_bubble_media_by_coordinate_longitude";
                        try {
                            jSONObject.put("wait2playtime", b.f324448G);
                            jSONObject.put("useback", b.f324449H);
                            C108392r rVar = C108388k.f324540d;
                            jSONObject.put("presetIndex", rVar != null ? rVar.f324553c : -1);
                            jSONObject.put("recorderOption", C107835h0.f322852i.f322659h);
                        } catch (Exception e) {
                            e = e;
                            Log.printErrStackTrace("MicroMsg.CaptureStatistics", e, "buildJson error", new Object[0]);
                            gu22.f298312h = b.f324450I.toString();
                            int k = sightCaptureUI.f313871j.mo159614k();
                            k = Math.round(((float) c.f273443a) / 1000.0f);
                            intent.putExtra("key_req_result", new SightCaptureResult(sightCaptureUI.f313870i.f324498Q, filePath, str3, sightCaptureUI.f313871j.mo159600a(), sightCaptureUI.f313852X0, k, sightCaptureUI.f313834M));
                            intent.putExtra("KSessionID", sightCaptureUI.f313847V.f248460q);
                            intent.putExtra("latitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
                            intent.putExtra(str2, sightCaptureUI.getIntent().getDoubleExtra(str, 181.0d));
                            sightCaptureUI.setResult(-1, intent);
                            sightCaptureUI.finish();
                            e0Var = this;
                            C117292a.m165361g(e0Var, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "longitude";
                        str = "album_business_bubble_media_by_coordinate_longitude";
                        Log.printErrStackTrace("MicroMsg.CaptureStatistics", e, "buildJson error", new Object[0]);
                        gu22.f298312h = b.f324450I.toString();
                        int k2 = sightCaptureUI.f313871j.mo159614k();
                        k2 = Math.round(((float) c.f273443a) / 1000.0f);
                        intent.putExtra("key_req_result", new SightCaptureResult(sightCaptureUI.f313870i.f324498Q, filePath, str3, sightCaptureUI.f313871j.mo159600a(), sightCaptureUI.f313852X0, k2, sightCaptureUI.f313834M));
                        intent.putExtra("KSessionID", sightCaptureUI.f313847V.f248460q);
                        intent.putExtra("latitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
                        intent.putExtra(str2, sightCaptureUI.getIntent().getDoubleExtra(str, 181.0d));
                        sightCaptureUI.setResult(-1, intent);
                        sightCaptureUI.finish();
                        e0Var = this;
                        C117292a.m165361g(e0Var, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                } else {
                    str2 = "longitude";
                    str = "album_business_bubble_media_by_coordinate_longitude";
                }
                gu22.f298312h = b.f324450I.toString();
            } else {
                str2 = "longitude";
                str = "album_business_bubble_media_by_coordinate_longitude";
            }
            int k25 = sightCaptureUI.f313871j.mo159614k();
            if (sightCaptureUI.f313848V0 && (c = C94555d.m119567c(sightCaptureUI.f313871j.getFilePath(), true)) != null) {
                k25 = Math.round(((float) c.f273443a) / 1000.0f);
            }
            intent.putExtra("key_req_result", new SightCaptureResult(sightCaptureUI.f313870i.f324498Q, filePath, str3, sightCaptureUI.f313871j.mo159600a(), sightCaptureUI.f313852X0, k25, sightCaptureUI.f313834M));
            intent.putExtra("KSessionID", sightCaptureUI.f313847V.f248460q);
            intent.putExtra("latitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
            intent.putExtra(str2, sightCaptureUI.getIntent().getDoubleExtra(str, 181.0d));
            sightCaptureUI.setResult(-1, intent);
            sightCaptureUI.finish();
        } else {
            String str4 = "longitude";
            String str5 = "album_business_bubble_media_by_coordinate_longitude";
            if (i2 == 3) {
                C34379c cVar = sightCaptureUI.f313842S0;
                if (cVar != null && !cVar.isDone()) {
                    try {
                        sightCaptureUI.f313842S0.get();
                    } catch (Exception e3) {
                        i = 1;
                        Log.printErrStackTrace("MicroMsg.SightCaptureUI", e3, "wait saveCaptureImageThread error: %s", e3.getMessage());
                    }
                }
                i = 1;
                int i4 = sightCaptureUI.f313847V.f248458o;
                if (i4 == i || i4 == 2 || i4 == 7) {
                    C115669n.INSTANCE.mo160131h(13820, Integer.valueOf(sightCaptureUI.f313853Y ? 1 : 0), Integer.valueOf(sightCaptureUI.f313847V.f248458o), sightCaptureUI.f313847V.f248460q, Long.valueOf(Util.nowSecond()));
                }
                int i5 = sightCaptureUI.f313847V.f248458o;
                if (i5 == 1) {
                    C115669n.INSTANCE.mo160131h(13858, 1, 1, 1, 0);
                } else if (i5 == 2) {
                    C115669n.INSTANCE.mo160131h(13858, 2, 1, 1, 0);
                }
                Intent intent2 = new Intent();
                if (!(!Util.isNullOrNil(sightCaptureUI.f313861d1) && (fVar = sightCaptureUI.f313871j) != null && sightCaptureUI.f313861d1.equals(fVar.mo159627u())) && sightCaptureUI.f313847V.f248459p) {
                    Log.m105924i("MicroMsg.SightCaptureUI", "is not Photo editted!");
                    sightCaptureUI.mo150342K7(sightCaptureUI.f313871j.mo159627u(), true);
                }
                intent2.putExtra("key_req_result", new SightCaptureResult(sightCaptureUI.f313870i.f324498Q, sightCaptureUI.f313871j.mo159627u()));
                intent2.putExtra("KSessionID", sightCaptureUI.f313847V.f248460q);
                intent2.putExtra("latitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
                intent2.putExtra(str4, sightCaptureUI.getIntent().getDoubleExtra(str5, 181.0d));
                sightCaptureUI.setResult(-1, intent2);
                Bundle bundle = sightCaptureUI.f313865f1;
                if (bundle == null) {
                    Log.m105920e("MicroMsg.SightCaptureUI", "[reportPhotoEdit] date == null");
                } else if (!sightCaptureUI.f313863e1) {
                    Log.m105924i("MicroMsg.SightCaptureUI", "[reportPhotoEdit] reportPhotoEdit == false");
                } else {
                    int i6 = bundle.getInt("report_info_emotion_count");
                    int i7 = bundle.getInt("report_info_text_count");
                    int i8 = bundle.getInt("report_info_mosaic_count");
                    int i9 = bundle.getInt("report_info_doodle_count");
                    boolean z = bundle.getBoolean("report_info_iscrop");
                    int i15 = bundle.getInt("report_info_undo_count");
                    boolean z2 = bundle.getBoolean("report_info_is_rotation");
                    Log.m105925i("MicroMsg.SightCaptureUI", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(z ? 1 : 0), Integer.valueOf(i15), Boolean.valueOf(z2));
                    C115669n.INSTANCE.mo160131h(13857, 1, 1, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(z), Integer.valueOf(i15), 3, Integer.valueOf(z2 ? 1 : 0), sightCaptureUI.f313847V.f248460q, Long.valueOf(Util.nowSecond()));
                }
                sightCaptureUI.finish();
                e0Var = this;
                e0Var.f313920d.mo150344M7(false);
                C117292a.m165361g(e0Var, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        e0Var = this;
        C117292a.m165361g(e0Var, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
