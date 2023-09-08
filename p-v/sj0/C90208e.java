package sj0;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.game.api.GameShareOption;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.g$$f;
import p625nu.C100196e;
import sj0.C90203b;
import sw1.C101703s;
import xj0.C91215b;
import xj0.C91220f;
import xj0.C91237o;

/* renamed from: sj0.e */
public class C90208e extends C90207d {
    public static final int CTRL_INDEX = 669;
    public static final String NAME = "editGameRecorderVideo";

    /* renamed from: sj0.e$a */
    public class C90209a implements g$$f {

        /* renamed from: a */
        public final /* synthetic */ int f258976a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f258977b;

        /* renamed from: c */
        public final /* synthetic */ int f258978c;

        public C90209a(int i, C88267e eVar, int i2) {
            this.f258976a = i;
            this.f258977b = eVar;
            this.f258978c = i2;
        }

        /* renamed from: b */
        public boolean mo1596b(int i, int i2, Intent intent) {
            int i3 = i2;
            Intent intent2 = intent;
            if (i != this.f258976a) {
                return false;
            }
            Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: on result callback, result code: %d", Integer.valueOf(i2));
            if (i3 == 0 || i3 == 3001) {
                Log.m105924i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: user cancelled share!");
                HashMap hashMap = new HashMap(1);
                hashMap.put("errCode", 803);
                this.f258977b.mo109647a(this.f258978c, C90208e.this.mo115112m("fail: user cancelled", hashMap));
            } else if (i3 != -1 || intent2 == null || !intent2.hasExtra("key_req_result")) {
                C90208e.this.mo124448z(this.f258977b, this.f258978c, 1, 804, "edit file failed!");
            } else {
                SightCaptureResult sightCaptureResult = (SightCaptureResult) intent2.getParcelableExtra("key_req_result");
                int intExtra = intent2.getIntExtra("key_selected_item", 0);
                String stringExtra = intent2.getStringExtra("key_ext_url");
                Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: is video: %b, video path %s, thumb path: %s, md5: %s, selectedItem: %d, extUrl: %s", Boolean.valueOf(sightCaptureResult.f201514d), sightCaptureResult.f201517g, sightCaptureResult.f201518h, sightCaptureResult.f201520j, Integer.valueOf(intExtra), stringExtra);
                if (!sightCaptureResult.f201514d) {
                    C90208e.this.mo124448z(this.f258977b, this.f258978c, 3, 804, "not a video");
                } else if (Util.isNullOrNil(sightCaptureResult.f201519i) || Util.isNullOrNil(sightCaptureResult.f201520j)) {
                    C90208e.this.mo124448z(this.f258977b, this.f258978c, 1, 804, "edit failed!");
                } else {
                    String str = sightCaptureResult.f201517g;
                    String str2 = sightCaptureResult.f201518h;
                    Bitmap rk = ((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(str);
                    if (rk != null) {
                        try {
                            BitmapUtil.saveBitmapToImage(rk, 100, Bitmap.CompressFormat.JPEG, str2, true);
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderEditWC", e, "hy: exception when convert bitmap", new Object[0]);
                        }
                    } else {
                        Log.m105924i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: generated thumb path is null!");
                    }
                    C90203b.C90205b y = C90208e.this.mo124446y(this.f258977b, str, "edited_video.mp4", true, Util.isNullOrNil(stringExtra));
                    C90203b.C90205b y2 = C90208e.this.mo124446y(this.f258977b, str2, "edited_video_thumb.jpg", true, Util.isNullOrNil(stringExtra));
                    if (y == null) {
                        Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: save video temp file failed!");
                        C90208e.this.mo124448z(this.f258977b, this.f258978c, 1, 804, "video file save to file system failed!");
                        return true;
                    } else if (y2 == null) {
                        Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: save thumb temp file failed!");
                        C90208e.this.mo124448z(this.f258977b, this.f258978c, 1, 804, "video thumb file save to file system failed!");
                        return true;
                    } else {
                        HashMap hashMap2 = new HashMap(3);
                        hashMap2.put("errCode", 0);
                        hashMap2.put("videoPath", y.f258968b);
                        hashMap2.put("thumbPath", y2.f258968b);
                        hashMap2.put("videoMD5", sightCaptureResult.f201520j);
                        hashMap2.put("chosenId", Integer.valueOf(intExtra));
                        hashMap2.put("extUrl", stringExtra);
                        this.f258977b.mo109647a(this.f258978c, C90208e.this.mo115112m("ok", hashMap2));
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: A */
    public void mo124447A(C88267e eVar, int i, C90203b.C90205b bVar, String str, JSONArray jSONArray, C91237o.C91242e eVar2, JSONObject jSONObject) {
        C88267e eVar3 = eVar;
        int i2 = i;
        JSONArray jSONArray2 = jSONArray;
        C91237o.C91242e eVar4 = eVar2;
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: wc start edit screen recorder, with result is %s", eVar4);
        int a = C87687a.m109085a(this);
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar3.mo109647a(i2, mo115109j("fail:internal error invalid android context"));
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        if (jSONArray2 == null || jSONArray.length() <= 0) {
            arrayList.add(new GameShareOption(0, eVar.getContext().getString(C0966R.string.a6b), false));
        } else {
            int i3 = 0;
            while (i3 < jSONArray.length()) {
                try {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                    arrayList.add(new GameShareOption(jSONObject2.getInt("id"), jSONObject2.getString("name"), jSONObject2.optBoolean("needExtUrl", false)));
                    i3++;
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderEditWC", e, "hy: json exception!", new Object[0]);
                    arrayList.clear();
                    arrayList.add(new GameShareOption(0, eVar.getContext().getString(C0966R.string.a6b), false));
                }
            }
        }
        C89916g.m112446a(o0).mo124232f(new C90209a(a, eVar3, i2));
        Bundle bundle = new Bundle();
        bundle.putString("k_ext_wording", str);
        bundle.putParcelableArrayList("k_ext_share_options", arrayList);
        C91215b bVar2 = C91237o.m114472b(eVar.getAppId(), eVar3).f261807b;
        VideoTransPara videoTransPara = bVar2 != null ? ((C91220f) bVar2).f261770e : null;
        videoTransPara.f267173n = 64000;
        videoTransPara.f267174o = eVar4.f261820b;
        videoTransPara.f267175p = 1;
        bundle.putParcelable("k_preferred_trans_param", videoTransPara);
        ((C101703s) C86312j.m106911c(C101703s.class)).mo10940uc(o0, eVar.getAppId(), (eVar.getRuntime() == null || eVar.getRuntime().mo113213o1() == null) ? "" : eVar.getRuntime().mo113213o1().f261061d, bVar.f258967a, a, bundle);
    }
}
