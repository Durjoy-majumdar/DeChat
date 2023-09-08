package wu1;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.C106885k;
import com.tencent.pigeon.VoIPFlutterPluginApi;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l33.C109246a;
import l33.C109247e;
import nj2.C61759g;
import nj2.C61767o;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import wj2.C66132f;

/* renamed from: wu1.a */
public final class C111863a implements FlutterPlugin, VoIPFlutterPluginApi.RouterPluginApi, ActivityAware {

    /* renamed from: d */
    public Activity f334907d;

    public void launchDoubleLinkSettings() {
        Log.m105924i("MicroMsg.FlutterRouterPlugin", "launchDoubleLinkSettings()");
        Intent intent = new Intent();
        Activity activity = this.f334907d;
        if (activity != null) {
            intent.setClassName(activity, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
            intent.putExtra("activity_caller_params", 1);
            intent.setFlags(268435456);
            Activity activity2 = this.f334907d;
            if (activity2 != null) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity3 = activity2;
                C117292a.m165358d(activity3, aVar.mo10232b(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity3, "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public void launchFinderFeed(VoIPFlutterPluginApi.FinderFeedLaunchRequest finderFeedLaunchRequest) {
        Class cls = C60200t1.class;
        C87412m.m108594g(finderFeedLaunchRequest, "request");
        Log.m105924i("MicroMsg.FlutterRouterPlugin", "launchFinderFeed(" + finderFeedLaunchRequest.getFeedId().longValue() + ", " + finderFeedLaunchRequest.getNonceId() + ')');
        Activity activity = this.f334907d;
        if (activity != null) {
            Boolean fromRingtone = finderFeedLaunchRequest.getFromRingtone();
            C87412m.m108593f(fromRingtone, "request.fromRingtone");
            if (fromRingtone.booleanValue()) {
                C109246a aVar = C109247e.xx0().f317333b;
                String S = aVar != null ? aVar.mo152445S() : null;
                C61767o oVar = C61767o.f175575a;
                C66132f value = C61767o.f175578d.getValue();
                if (S != null && value != null) {
                    C61759g.C61760a.m72462b(C61759g.f175551f, activity, 2, S, 9, false, value, 16, (Object) null);
                    return;
                }
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("from_user", C75592q0.m90789s());
            Long feedId = finderFeedLaunchRequest.getFeedId();
            C87412m.m108593f(feedId, "request.feedId");
            intent.putExtra("feed_object_id", feedId.longValue());
            intent.putExtra("feed_object_nonceId", finderFeedLaunchRequest.getNonceId());
            intent.putExtra("key_session_id", C31543z5.m39451a());
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(33, 2, 25, intent);
            intent.putExtra("key_comment_scene", 25);
            intent.putExtra("key_extra_info", "");
            ((C60200t1) C86312j.m106911c(cls)).mo76864nr(activity, intent);
        }
    }

    public void launchSnsPost(VoIPFlutterPluginApi.SnsPostLaunchRequest snsPostLaunchRequest) {
        C87412m.m108594g(snsPostLaunchRequest, "request");
        Log.m105924i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + snsPostLaunchRequest.getUsername() + ", " + snsPostLaunchRequest.getLocalId() + ')');
        Activity activity = this.f334907d;
        if (activity != null) {
            Intent intent = new Intent();
            intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            intent.putExtra("INTENT_TALKER", snsPostLaunchRequest.getUsername());
            intent.putExtra("INTENT_SNS_LOCAL_ID", snsPostLaunchRequest.getLocalId());
            intent.putExtra("INTENT_FROMGALLERY", true);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(1);
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchSnsPost", "(Lcom/tencent/pigeon/VoIPFlutterPluginApi$SnsPostLaunchRequest;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    public void launchUserProfile(VoIPFlutterPluginApi.UserProfileLaunchRequest userProfileLaunchRequest) {
        C87412m.m108594g(userProfileLaunchRequest, "request");
        Log.m105924i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + userProfileLaunchRequest.getUsername() + ')');
        Activity activity = this.f334907d;
        if (activity != null) {
            Intent intent = new Intent();
            int i = ContactInfoUI.f202514P;
            intent.setClass(activity, ContactInfoUI.class);
            intent.putExtra("Contact_User", userProfileLaunchRequest.getUsername());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/VoIPFlutterPluginApi$UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/VoIPFlutterPluginApi$UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f334907d = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C106885k.m144628f(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromActivity() {
        this.f334907d = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f334907d = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f334907d = activityPluginBinding.getActivity();
    }
}
