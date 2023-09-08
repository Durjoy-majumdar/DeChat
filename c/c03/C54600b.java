package c03;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p1081gi.C98127h;

/* renamed from: c03.b */
public final class C54600b {

    /* renamed from: a */
    public static final C54600b f153106a = new C54600b();

    /* renamed from: a */
    public final Bundle mo75506a(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        if (context instanceof Activity) {
            context = ((Activity) context).getBaseContext();
        }
        int min = Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        float f = (((float) i2) * 1.0f) / ((float) i);
        Bundle bundle = new Bundle();
        bundle.putInt("scaleType", ImageView.ScaleType.CENTER_CROP.ordinal());
        if (Math.abs(i - i2) <= 10) {
            bundle.putInt("width", min);
            bundle.putInt("height", min);
        } else {
            if (f < 0.5625f) {
                f = 0.5625f;
            } else if (f >= 1.0f && f >= 1.3166667f) {
                f = 1.3166667f;
            }
            bundle.putInt("width", min);
            bundle.putInt("height", (int) (((float) min) * f));
        }
        return bundle;
    }

    /* renamed from: b */
    public final C98127h mo75507b(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, C98127h.C98128a aVar, String str8) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(str3, "path");
        C87412m.m108594g(str4, "fileFormat");
        C87412m.m108594g(str5, "urlToken");
        C87412m.m108594g(str8, "tag");
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_TPPlayUtil";
        hVar.field_mediaId = str;
        hVar.f287705p0 = str2 + str5;
        hVar.f287673t = 60;
        hVar.f287674u = 60;
        hVar.f287689V = 1;
        hVar.f287655L = 8;
        hVar.f287698Z0 = 0;
        hVar.field_requestVideoFormat = i;
        hVar.field_fullpath = str3;
        hVar.f287696Y0 = 4;
        hVar.f287657N = 4;
        hVar.f287700b1 = str6;
        hVar.f287704f1 = aVar;
        hVar.f287701c1 = true;
        hVar.f287702d1 = true;
        if (str7 != null) {
            hVar.f287699a1 = str7;
        }
        Log.m105924i(str8, "[createVideoPlayCDNTask] finder video, reqFormat=" + i + " fileFormat=" + str4 + ", decodeKey=" + str6 + ' ' + str5 + " mediaId=" + str + " url=" + hVar.f287705p0 + ' ');
        return hVar;
    }
}
