package jq2;

import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.lang.ref.WeakReference;
import jp2.C98974v;
import ps2.C100880k;
import ps2.C100891r;
import rq2.C101432s;

/* renamed from: jq2.x */
public class C99009x {

    /* renamed from: jq2.x$a */
    public class C99010a extends C99011b {

        /* renamed from: b */
        public final /* synthetic */ int f290277b;

        /* renamed from: c */
        public final /* synthetic */ String f290278c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99010a(ImageView imageView, int i, String str) {
            super(imageView);
            this.f290277b = i;
            this.f290278c = str;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
            Log.m105928w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: download has something error");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
            super.mo76115c(str);
            Log.m105924i("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: download is success, it is going to set image view");
            WeakReference<ImageView> weakReference = this.f290279a;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (imageView != null) {
                    C98974v.f290191c.mo138337d(imageView, str, this.f290277b);
                } else {
                    Log.m105928w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn, imageViewRef released, url=" + this.f290278c);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$1");
        }
    }

    /* renamed from: jq2.x$b */
    public static class C99011b implements C100880k.C100881a {

        /* renamed from: a */
        public WeakReference<ImageView> f290279a;

        public C99011b(ImageView imageView) {
            if (imageView != null) {
                this.f290279a = new WeakReference<>(imageView);
            }
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
            Log.m105924i("AdUserAvatarHelper", "the downloaded path is " + str);
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper$SimpleDownloadCallback");
        }
    }

    /* renamed from: a */
    public static void m128940a(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("fillUserAvatarAsyncWithCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            m128941b(imageView, str, i);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
    }

    /* renamed from: b */
    public static void m128941b(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        if (imageView == null || TextUtils.isEmpty(str)) {
            Log.m105928w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: the avatar url is empty or image view is empty");
            SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return;
        }
        Log.m105918d("AdUserAvatarHelper", "use fillUserAvatarAsyncWithCdn: url is " + str + ", image view is " + imageView + ", imgDisplayType: " + i);
        if (!str.equalsIgnoreCase((String) C101432s.m133122d(imageView, C0966R.C0970id.jve))) {
            Log.m105928w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: the input avatarUrl is not same as the tag url in the ImageView");
            SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return;
        }
        C100891r.m132209d("adId", str, new C99010a(imageView, i, str));
        SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
    }

    /* renamed from: c */
    public static void m128942c(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("fillUserAvatarWhenFileExisted", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            Log.m105918d("AdUserAvatarHelper", "use fillUserAvatarWhenFileExisted: " + str + ", imgDisplayType: " + i);
            C98974v.f290191c.mo138337d(imageView, str, i);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillUserAvatarWhenFileExisted", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
    }

    /* renamed from: d */
    public static boolean m128943d() {
        SnsMethodCalculate.markStartTimeMs("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_timeline_use_cdn_download_user_avatar, 1);
            Log.m105924i("AdUserAvatarHelper", "useCdnDownloadUserAvatar value is " + Qe);
            if (Qe > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return z;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return false;
        }
    }
}
