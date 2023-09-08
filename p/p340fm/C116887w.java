package p340fm;

import android.app.Activity;
import android.os.Bundle;
import ca1.C113263a;
import com.tencent.p014mm.app.C114657b1;
import com.tencent.p014mm.plugin.p316ai.data.business.tools_mp.PreloadManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import ih0.C117196i;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C118427eg2;

/* renamed from: fm.w */
public class C116887w implements C114657b1 {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        String[] split;
        C117196i.m165279a().getClass();
        LinkedList<C118427eg2> linkedList = C113263a.m155052a().f353948d;
        if (linkedList != null && linkedList.size() != 0) {
            if (activity.getClass().getName().endsWith(linkedList.get(linkedList.size() - 1).f353969d)) {
                linkedList.remove(linkedList.size() - 1);
            }
            if (linkedList.size() != 0) {
                Iterator<C118427eg2> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C118427eg2 next = it.next();
                    if (next != null) {
                        if ("CropImageNewUI;MiniQbCallBackUI;MiniQBReaderUI;NfcWebViewUI;WNNoteFavWebViewUI;WNNoteMsgWebViewUI;SnsAdNativeLandingPagesUI;VideoFullScreenActivity;EmojiCaptureUI;StickerPreviewUI;AppBrandNearbyWebViewUI;AppBrandSOSUI;ShortCutPermissionDetailUI;GameWebViewUI;GameTabWebUI;GameTabWebUI1;GameTabWebUI2;LuggageGameWebViewUI;TmplWebViewToolUI;DownloadDetailUI;WebViewUI;CustomSchemeEntryWebViewUI;WebViewTestUI;TransparentWebViewUI;ContactQZoneWebView;QRCodeIntroductionWebViewUI;GameChattingRoomWebViewUI;H5GameWebViewUI;EmojiStoreSearchWebViewUI;ToolsRecordUI;SightCaptureUITest;FaceDetectUI;ReadMailUI;MailWebViewUI;SightCaptureUI;SightSettingsUI;MMSightEditUI;MMNewPhotoEditUI;VideoSegmentUI;VideoCompressUI;AppBrandSearchUI;LuggageGameUI;LuggageGameHalfWebViewUI;GameWebTabUI;FTSWebViewUI;FTSSearchTabWebViewUI;FTSSOSHomeWebViewUI;FTSSOSMoreWebViewUI;SosWebViewUI;".contains(next.f353969d + ";")) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z && (split = activity.getClass().getName().split("\\.")) != null && split.length != 0) {
                    String str = split[split.length - 1] + ";";
                    if (!PreloadManager.f79630f.contains(str) && !str.contains("LauncherUI") && !str.contains("SnsTimeLineUI")) {
                        PreloadManager.f79630f += str;
                        MultiProcessMMKV.getDefault().putString("ai_is_tools_or_mp_entry", PreloadManager.f79630f).commit();
                    }
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C117196i.m165279a().getClass();
    }

    public void onActivityPaused(Activity activity) {
        C117196i.m165279a().getClass();
    }

    public /* synthetic */ void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    public /* synthetic */ void onActivityPostDestroyed(Activity activity) {
    }

    public /* synthetic */ void onActivityPostPaused(Activity activity) {
    }

    public /* synthetic */ void onActivityPostResumed(Activity activity) {
    }

    public /* synthetic */ void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public /* synthetic */ void onActivityPostStarted(Activity activity) {
    }

    public /* synthetic */ void onActivityPostStopped(Activity activity) {
    }

    public /* synthetic */ void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    public /* synthetic */ void onActivityPreDestroyed(Activity activity) {
    }

    public /* synthetic */ void onActivityPrePaused(Activity activity) {
    }

    public /* synthetic */ void onActivityPreResumed(Activity activity) {
    }

    public /* synthetic */ void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public /* synthetic */ void onActivityPreStarted(Activity activity) {
    }

    public /* synthetic */ void onActivityPreStopped(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        C117196i.m165279a().getClass();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C117196i.m165279a().getClass();
    }

    public void onActivityStarted(Activity activity) {
        C117196i.m165279a().getClass();
    }

    public void onActivityStopped(Activity activity) {
        C117196i.m165279a().getClass();
    }
}
