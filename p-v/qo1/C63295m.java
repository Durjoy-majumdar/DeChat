package qo1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPostPreviewUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderCropAvatarUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderPostRouterUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI;
import com.tencent.p014mm.plugin.finder.publish.PublishPostApi;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.ViewAnimHelper;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import da0.C58247e;
import di3.C86312j;
import dp1.C58408t0;
import er1.C58684b;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60204t3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C64636pq2;
import up1.C37521f;

/* renamed from: qo1.m */
public final class C63295m implements C63293i {

    /* renamed from: a */
    public static final C63295m f179622a = new C63295m();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r15 == false) goto L_0x008f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo88189a(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r8 = r17
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r8, r0)
            if (r18 != 0) goto L_0x000f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            goto L_0x0011
        L_0x000f:
            r0 = r18
        L_0x0011:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            if (r1 != 0) goto L_0x0018
            r3 = r0
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            if (r3 == 0) goto L_0x0020
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r4)
        L_0x0020:
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r3)
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderPostUI> r3 = com.tencent.p014mm.plugin.finder.p056ui.FinderPostUI.class
            r0.setClass(r8, r3)
            java.lang.String r3 = "key_udf_kv"
            java.lang.String r4 = "post_entry_type"
            java.lang.String r5 = "vst_id"
            r6 = 1
            r9 = 0
            long r10 = eb0.C31543z5.m39453c()     // Catch:{ f -> 0x00b1 }
            java.lang.String r7 = r0.getStringExtra(r3)     // Catch:{ f -> 0x00b1 }
            if (r7 == 0) goto L_0x0043
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ f -> 0x00b1 }
            r12.<init>(r7)     // Catch:{ f -> 0x00b1 }
            goto L_0x0048
        L_0x0043:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ f -> 0x00b1 }
            r12.<init>()     // Catch:{ f -> 0x00b1 }
        L_0x0048:
            java.lang.String r7 = r0.getStringExtra(r5)     // Catch:{ f -> 0x00b1 }
            r13 = 3
            int r14 = r0.getIntExtra(r4, r13)     // Catch:{ f -> 0x00b1 }
            boolean r15 = r12.has(r5)     // Catch:{ f -> 0x00b1 }
            if (r15 == 0) goto L_0x0069
            java.lang.String r15 = r12.getString(r5)     // Catch:{ f -> 0x00b1 }
            if (r15 == 0) goto L_0x0066
            int r15 = r15.length()     // Catch:{ f -> 0x00b1 }
            if (r15 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r15 = 0
            goto L_0x0067
        L_0x0066:
            r15 = 1
        L_0x0067:
            if (r15 == 0) goto L_0x008f
        L_0x0069:
            if (r7 == 0) goto L_0x006f
            r12.put(r5, r7)     // Catch:{ f -> 0x00b1 }
            goto L_0x008f
        L_0x006f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ f -> 0x00b1 }
            r7.<init>()     // Catch:{ f -> 0x00b1 }
            zc1.b r15 = zc1.C66785b.f191882e     // Catch:{ f -> 0x00b1 }
            java.lang.String r15 = r15.mo90662O5()     // Catch:{ f -> 0x00b1 }
            r7.append(r15)     // Catch:{ f -> 0x00b1 }
            r15 = 45
            r7.append(r15)     // Catch:{ f -> 0x00b1 }
            r7.append(r10)     // Catch:{ f -> 0x00b1 }
            java.lang.String r7 = r7.toString()     // Catch:{ f -> 0x00b1 }
            r0.putExtra(r5, r7)     // Catch:{ f -> 0x00b1 }
            r12.put(r5, r7)     // Catch:{ f -> 0x00b1 }
        L_0x008f:
            boolean r5 = r12.has(r4)     // Catch:{ f -> 0x00b1 }
            if (r5 == 0) goto L_0x009b
            int r5 = r12.getInt(r4)     // Catch:{ f -> 0x00b1 }
            if (r5 != r13) goto L_0x00a4
        L_0x009b:
            if (r14 == r13) goto L_0x00a1
            r12.put(r4, r14)     // Catch:{ f -> 0x00b1 }
            goto L_0x00a4
        L_0x00a1:
            r12.put(r4, r13)     // Catch:{ f -> 0x00b1 }
        L_0x00a4:
            java.lang.String r4 = "start_time"
            r0.putExtra(r4, r10)     // Catch:{ f -> 0x00b1 }
            java.lang.String r4 = r12.toString()     // Catch:{ f -> 0x00b1 }
            r0.putExtra(r3, r4)     // Catch:{ f -> 0x00b1 }
        L_0x00b1:
            java.lang.String r3 = "activity"
            java.lang.Object r3 = r8.getSystemService(r3)
            boolean r4 = r3 instanceof android.app.ActivityManager
            if (r4 == 0) goto L_0x00be
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            goto L_0x00bf
        L_0x00be:
            r3 = r2
        L_0x00bf:
            if (r3 == 0) goto L_0x00ec
            java.util.List r3 = r3.getRunningTasks(r6)
            if (r3 == 0) goto L_0x00ec
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            android.app.ActivityManager$RunningTaskInfo r3 = (android.app.ActivityManager.RunningTaskInfo) r3
            if (r3 == 0) goto L_0x00ec
            android.content.ComponentName r3 = r3.baseActivity
            if (r3 == 0) goto L_0x00ec
            android.content.pm.PackageManager r4 = r17.getPackageManager()
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r3 = r4.getActivityInfo(r3, r5)
            java.lang.String r3 = r3.taskAffinity
            java.lang.String r4 = "com.tencent.mm.wxcustomentry"
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x00ec
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderPostTransitUI> r3 = com.tencent.p014mm.plugin.finder.p056ui.FinderPostTransitUI.class
            r0.setClass(r8, r3)
        L_0x00ec:
            if (r1 == 0) goto L_0x00f1
            r2 = r8
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x00f1:
            if (r2 == 0) goto L_0x0115
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r3 = "key_ref_feed_id"
            r4 = 0
            long r6 = r1.getLongExtra(r3, r4)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r2 = "key_ref_comment_scene"
            int r1 = r1.getIntExtra(r2, r9)
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0110
            r0.putExtra(r3, r6)
        L_0x0110:
            if (r1 <= 0) goto L_0x0115
            r0.putExtra(r2, r1)
        L_0x0115:
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r1 = r10.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/publish/PublishRouterApi"
            java.lang.String r3 = "enterFinderPostUI"
            java.lang.String r4 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/publish/PublishRouterApi"
            java.lang.String r2 = "enterFinderPostUI"
            java.lang.String r3 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo1.C63295m.mo88189a(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: b */
    public void mo88190b(Context context, Intent intent, Integer num) {
        Class cls = C13442s8.class;
        C87412m.m108594g(context, "context");
        if (!PublishPostApi.INSTANCE.cameraCheck(context)) {
            Log.m105924i("Finder.ActivityRouter", "enterFinderPostRouterUINoClearTop cameraCheck false!");
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        C13598b0 b0Var = null;
        if ((context instanceof AppCompatActivity ? (AppCompatActivity) context : null) != null) {
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity appCompatActivity = (AppCompatActivity) context;
            String str = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38098n;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38099o;
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra("key_finder_context_id", str);
            intent.putExtra("key_finder_session_id", str2);
        }
        intent.setClass(context, FinderPostRouterUI.class);
        if (num != null) {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                int intValue = num.intValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(intValue));
                aVar.mo10233c(intent);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: c */
    public void mo88191c(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderSharePostUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderSharePostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderSharePostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: c0 */
    public void mo88192c0(Context context, Intent intent) {
        Class cls = C13442s8.class;
        C87412m.m108594g(context, "context");
        if (!PublishPostApi.INSTANCE.cameraCheck(context)) {
            Log.m105924i("Finder.ActivityRouter", "enterFinderPostRouterUI cameraCheck false!");
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = null;
        if ((context instanceof AppCompatActivity ? (AppCompatActivity) context : null) != null) {
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity appCompatActivity = (AppCompatActivity) context;
            String str = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38098n;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38099o;
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra("key_finder_context_id", str);
            intent.putExtra("key_finder_session_id", str2);
        }
        boolean z = context instanceof Activity;
        if (!z) {
            intent2 = intent;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderPostRouterUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z) {
            ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: d */
    public boolean mo88193d(Context context, Intent intent, String str, int i, int i2, String str2, boolean z, int i3) {
        C87412m.m108594g(context, "context");
        return FinderPostRouterUI.f161071B.mo79097a(context, intent, str, i, i2, str2, z, i3);
    }

    /* renamed from: e */
    public void mo88194e(Context context, Intent intent, int i, int i2, Boolean bool, Integer num) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        Intent intent2 = intent == null ? new Intent() : intent;
        boolean z = context2 instanceof Activity;
        Intent intent3 = !z ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.setClassName(context2, "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
        C37521f fVar = C37521f.f99374d;
        if (!fVar.mo61200z()) {
            intent2.putExtra("key_can_select_video_and_pic", true);
        }
        intent2.putExtra("is_hide_album_footer", true);
        intent2.putExtra("show_header_view", false);
        intent2.putExtra("max_select_count", i2);
        intent2.putExtra("query_source_type", 25);
        intent2.putExtra("query_media_type", i);
        intent2.putExtra("album_video_max_duration", fVar.mo61160N());
        intent2.putExtra("album_video_min_duration", fVar.mo61161O().f267171i);
        intent2.putExtra("key_max_video_duration", ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83778Y5() - 1);
        String stringExtra = intent2.getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID");
        if (!(!(stringExtra == null || stringExtra.length() == 0)) && ((C58247e) C86312j.m106911c(C58247e.class)).yf0().mo8427b()) {
            intent2.putExtra("key_filter_hdr_video", true);
        }
        if (!C87412m.m108589b(bool, Boolean.TRUE) || !z) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Boolean;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Boolean;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Activity activity = (Activity) context2;
        int intValue = num != null ? num.intValue() : -1;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(intValue));
        aVar2.mo10233c(intent2);
        C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostAlbumUI", "(Landroid/content/Context;Landroid/content/Intent;IILjava/lang/Boolean;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0262 A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0296 A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ba A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x032a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo88195f(android.content.Context r21, java.lang.String r22, int r23, ht1.C60213x3 r24) {
        /*
            r20 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "schemaInfo"
            java.lang.String r5 = "nativeInfo"
            java.lang.String r6 = "html5Info"
            java.lang.String r7 = ""
            java.lang.String r8 = "extParamsJsonString"
            java.lang.String r9 = "context"
            gy3.C87412m.m108594g(r1, r9)
            java.lang.String r9 = "json"
            gy3.C87412m.m108594g(r0, r9)
            java.lang.String r9 = "callback"
            gy3.C87412m.m108594g(r3, r9)
            ao1.C54264e.f152304b = r3
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "enterPostUI, fromType:"
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = ", json:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "Finder.PublishRouterApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>(r0)
            java.lang.String r0 = "jumpInfo"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            java.lang.String r12 = "postInfo"
            org.json.JSONObject r12 = r10.optJSONObject(r12)
            java.lang.String r13 = "optionalInfo"
            org.json.JSONObject r13 = r10.optJSONObject(r13)
            if (r13 != 0) goto L_0x0064
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
        L_0x0064:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r14 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r14.<init>()
            java.lang.String r15 = "path"
            java.lang.String r3 = "businessType"
            java.lang.String r1 = "jumpType"
            r16 = r10
            java.lang.String r10 = "miniAppInfo"
            r17 = r8
            java.lang.String r8 = "enterPostUI"
            r18 = r13
            r13 = 1
            if (r0 == 0) goto L_0x0183
            if (r2 == r13) goto L_0x0082
            r19 = r10
            goto L_0x0192
        L_0x0082:
            int r13 = r0.getInt(r1)     // Catch:{ all -> 0x017f }
            r14.jumpinfo_type = r13     // Catch:{ all -> 0x017f }
            int r13 = r0.optInt(r3)     // Catch:{ all -> 0x017f }
            r14.business_type = r13     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "wording"
            java.lang.String r13 = r0.optString(r13)     // Catch:{ all -> 0x017f }
            r14.wording = r13     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "iconUrl"
            java.lang.String r13 = r0.optString(r13)     // Catch:{ all -> 0x017f }
            r14.icon_url = r13     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "recommendReason"
            java.lang.String r13 = r0.optString(r13)     // Catch:{ all -> 0x017f }
            r14.recommend_reason = r13     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "reportInfo"
            java.lang.String r13 = r0.optString(r13)     // Catch:{ all -> 0x017f }
            r14.report_info = r13     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "extInfo"
            java.lang.String r13 = r0.optString(r13)     // Catch:{ all -> 0x017f }
            r14.ext_info = r13     // Catch:{ all -> 0x017f }
            boolean r13 = r0.has(r10)     // Catch:{ all -> 0x017f }
            if (r13 == 0) goto L_0x00e1
            org.json.JSONObject r13 = r0.getJSONObject(r10)     // Catch:{ all -> 0x017f }
            com.tencent.mm.protocal.protobuf.MiniAppInfo r2 = new com.tencent.mm.protocal.protobuf.MiniAppInfo     // Catch:{ all -> 0x017f }
            r2.<init>()     // Catch:{ all -> 0x017f }
            r19 = r10
            java.lang.String r10 = "fetchInfoId"
            java.lang.String r10 = r13.optString(r10)     // Catch:{ all -> 0x018b }
            r2.fetch_info_id = r10     // Catch:{ all -> 0x018b }
            java.lang.String r10 = "appid"
            java.lang.String r10 = r13.optString(r10)     // Catch:{ all -> 0x018b }
            r2.app_id = r10     // Catch:{ all -> 0x018b }
            java.lang.String r10 = r13.optString(r15)     // Catch:{ all -> 0x018b }
            r2.path = r10     // Catch:{ all -> 0x018b }
            r14.mini_app_info = r2     // Catch:{ all -> 0x018b }
            goto L_0x00e3
        L_0x00e1:
            r19 = r10
        L_0x00e3:
            boolean r2 = r0.has(r6)     // Catch:{ all -> 0x018b }
            if (r2 == 0) goto L_0x0106
            org.json.JSONObject r2 = r0.getJSONObject(r6)     // Catch:{ all -> 0x018b }
            com.tencent.mm.protocal.protobuf.Html5Info r6 = new com.tencent.mm.protocal.protobuf.Html5Info     // Catch:{ all -> 0x018b }
            r6.<init>()     // Catch:{ all -> 0x018b }
            java.lang.String r10 = "url"
            java.lang.String r10 = r2.optString(r10)     // Catch:{ all -> 0x018b }
            r6.url = r10     // Catch:{ all -> 0x018b }
            java.lang.String r10 = "style"
            int r2 = r2.optInt(r10)     // Catch:{ all -> 0x018b }
            r6.style = r2     // Catch:{ all -> 0x018b }
            r14.html5_info = r6     // Catch:{ all -> 0x018b }
        L_0x0106:
            boolean r2 = r0.has(r5)     // Catch:{ all -> 0x018b }
            if (r2 == 0) goto L_0x0128
            org.json.JSONObject r2 = r0.getJSONObject(r5)     // Catch:{ all -> 0x018b }
            com.tencent.mm.protocal.protobuf.NativeInfo r5 = new com.tencent.mm.protocal.protobuf.NativeInfo     // Catch:{ all -> 0x018b }
            r5.<init>()     // Catch:{ all -> 0x018b }
            java.lang.String r6 = "type"
            int r6 = r2.optInt(r6)     // Catch:{ all -> 0x018b }
            r5.native_type = r6     // Catch:{ all -> 0x018b }
            java.lang.String r6 = "necessaryParams"
            java.lang.String r2 = r2.optString(r6)     // Catch:{ all -> 0x018b }
            r5.necessary_params = r2     // Catch:{ all -> 0x018b }
            r14.native_info = r5     // Catch:{ all -> 0x018b }
        L_0x0128:
            boolean r2 = r0.has(r4)     // Catch:{ all -> 0x018b }
            if (r2 == 0) goto L_0x0172
            org.json.JSONObject r0 = r0.getJSONObject(r4)     // Catch:{ all -> 0x018b }
            com.tencent.mm.protocal.protobuf.SchemaInfo r2 = new com.tencent.mm.protocal.protobuf.SchemaInfo     // Catch:{ all -> 0x018b }
            r2.<init>()     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "universalLink"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ all -> 0x018b }
            r2.universal_link = r4     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "scheme"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ all -> 0x018b }
            r2.scheme = r4     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "appstoreLink"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ all -> 0x018b }
            r2.appstore_link = r4     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "androidAppstoreScheme"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ all -> 0x018b }
            r2.android_appstore_scheme = r4     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "androidAppPublicKey"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ all -> 0x018b }
            r2.android_app_public_key = r4     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "androidUniversalLink"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ all -> 0x018b }
            r2.android_universal_link = r4     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "androidPackage"
            java.lang.String r0 = r0.optString(r4)     // Catch:{ all -> 0x018b }
            r2.android_package = r0     // Catch:{ all -> 0x018b }
            r14.schema_info = r2     // Catch:{ all -> 0x018b }
        L_0x0172:
            r2 = 4
            r14.source = r2     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "JUMP_INFO"
            byte[] r2 = r14.toByteArray()     // Catch:{ all -> 0x018b }
            r9.putExtra(r0, r2)     // Catch:{ all -> 0x018b }
            goto L_0x0192
        L_0x017f:
            r0 = move-exception
            r19 = r10
            goto L_0x018c
        L_0x0183:
            r19 = r10
            java.lang.String r0 = "jumpInfoJson is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ all -> 0x018b }
            goto L_0x0192
        L_0x018b:
            r0 = move-exception
        L_0x018c:
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r8, r4)
        L_0x0192:
            if (r12 == 0) goto L_0x0234
            java.lang.String r0 = "fromAppSource"
            int r0 = r12.optInt(r0)     // Catch:{ all -> 0x022f }
            r2 = 9
            if (r0 != r2) goto L_0x01a1
            r2 = 22
            goto L_0x01a3
        L_0x01a1:
            r2 = 18
        L_0x01a3:
            java.lang.String r4 = "KEY_POST_FROM_APP_SOURCE"
            r9.putExtra(r4, r0)     // Catch:{ all -> 0x022d }
            te3.dj1 r4 = new te3.dj1     // Catch:{ all -> 0x022d }
            r4.<init>()     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "clientId"
            java.lang.String r5 = r12.getString(r5)     // Catch:{ all -> 0x022d }
            r4.f182742d = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "mediaUrl"
            java.lang.String r5 = r12.getString(r5)     // Catch:{ all -> 0x022d }
            r4.f182743e = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "thumbUrl"
            java.lang.String r5 = r12.getString(r5)     // Catch:{ all -> 0x022d }
            r4.f182744f = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "coverUrl"
            java.lang.String r5 = r12.optString(r5, r7)     // Catch:{ all -> 0x022d }
            r4.f182745g = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "fileSize"
            int r5 = r12.getInt(r5)     // Catch:{ all -> 0x022d }
            r4.f182746h = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "bitrate"
            int r5 = r12.getInt(r5)     // Catch:{ all -> 0x022d }
            r4.f182747i = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "mediaWidth"
            int r5 = r12.getInt(r5)     // Catch:{ all -> 0x022d }
            r4.f182748j = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "mediaHeight"
            int r5 = r12.getInt(r5)     // Catch:{ all -> 0x022d }
            r4.f182749n = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "duration"
            int r5 = r12.getInt(r5)     // Catch:{ all -> 0x022d }
            r4.f182750o = r5     // Catch:{ all -> 0x022d }
            java.lang.String r5 = "fromAppId"
            java.lang.String r5 = r12.getString(r5)     // Catch:{ all -> 0x022d }
            r4.f182751p = r5     // Catch:{ all -> 0x022d }
            r4.f182752q = r0     // Catch:{ all -> 0x022d }
            java.lang.String r0 = "fromAppExtInfo"
            java.lang.String r0 = r12.optString(r0, r7)     // Catch:{ all -> 0x022d }
            r4.f182753r = r0     // Catch:{ all -> 0x022d }
            java.lang.String r0 = "waitType"
            int r0 = r12.getInt(r0)     // Catch:{ all -> 0x022d }
            r4.f182754s = r0     // Catch:{ all -> 0x022d }
            int r0 = r4.f182750o     // Catch:{ all -> 0x022d }
            r5 = 60
            if (r0 <= r5) goto L_0x021d
            java.lang.String r0 = "isLongVideoPost"
            r5 = 1
            r9.putExtra(r0, r5)     // Catch:{ all -> 0x022d }
        L_0x021d:
            java.lang.String r0 = "postType"
            r5 = 4
            r9.putExtra(r0, r5)     // Catch:{ all -> 0x022d }
            java.lang.String r0 = "KEY_REMOTE_MEDIA_POST_INFO"
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x022d }
            r9.putExtra(r0, r4)     // Catch:{ all -> 0x022d }
            goto L_0x0241
        L_0x022d:
            r0 = move-exception
            goto L_0x0232
        L_0x022f:
            r0 = move-exception
            r2 = 18
        L_0x0232:
            r4 = 0
            goto L_0x023c
        L_0x0234:
            java.lang.String r0 = "postInfoJson is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ all -> 0x022f }
            r2 = 18
            goto L_0x0241
        L_0x023c:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r8, r5)
        L_0x0241:
            r4 = 0
            java.lang.String r0 = "generalReportInfo"
            r13 = r18
            java.lang.String r0 = r13.optString(r0)     // Catch:{ all -> 0x02f2 }
            java.lang.String r5 = "REPORT_INFO"
            r9.putExtra(r5, r0)     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "clientKVReportInfo"
            java.lang.String r0 = r13.optString(r0)     // Catch:{ all -> 0x02f2 }
            java.lang.String r5 = "CLIENT_KV_REPORTINFO"
            r9.putExtra(r5, r0)     // Catch:{ all -> 0x02f2 }
            r5 = r17
            boolean r0 = r13.has(r5)     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x028a
            org.json.JSONObject r0 = r13.getJSONObject(r5)     // Catch:{ all -> 0x02f2 }
            te3.fg1 r5 = new te3.fg1     // Catch:{ all -> 0x02f2 }
            r5.<init>()     // Catch:{ all -> 0x02f2 }
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x02f2 }
            r5.f183130d = r3     // Catch:{ all -> 0x02f2 }
            java.lang.String r3 = "cid"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x02f2 }
            r5.f183131e = r3     // Catch:{ all -> 0x02f2 }
            java.lang.String r3 = "lid"
            java.lang.String r0 = r0.getString(r3)     // Catch:{ all -> 0x02f2 }
            r5.f183132f = r0     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "OPTIONAL_INFO"
            byte[] r3 = r5.toByteArray()     // Catch:{ all -> 0x02f2 }
            r9.putExtra(r0, r3)     // Catch:{ all -> 0x02f2 }
        L_0x028a:
            java.lang.String r0 = "mediaDescription"
            java.lang.String r0 = r13.optString(r0)     // Catch:{ all -> 0x02f2 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x02f2 }
            if (r3 != 0) goto L_0x029b
            java.lang.String r3 = "saveDesc"
            r9.putExtra(r3, r0)     // Catch:{ all -> 0x02f2 }
        L_0x029b:
            java.lang.String r0 = "KEY_POST_BTN_TITLE"
            java.lang.String r3 = "postBtnTitle"
            java.lang.String r3 = r13.optString(r3)     // Catch:{ all -> 0x02f2 }
            r9.putExtra(r0, r3)     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "KEY_SYNC_POST_LOADING"
            java.lang.String r3 = "syncPostLoading"
            boolean r3 = r13.optBoolean(r3)     // Catch:{ all -> 0x02f2 }
            r9.putExtra(r0, r3)     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "postJumpInfo"
            org.json.JSONObject r0 = r13.optJSONObject(r0)     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02ff
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo     // Catch:{ all -> 0x02f2 }
            r3.<init>()     // Catch:{ all -> 0x02f2 }
            int r1 = r0.optInt(r1)     // Catch:{ all -> 0x02f2 }
            r3.jumpinfo_type = r1     // Catch:{ all -> 0x02f2 }
            r1 = r19
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch:{ all -> 0x02f2 }
            com.tencent.mm.protocal.protobuf.MiniAppInfo r1 = new com.tencent.mm.protocal.protobuf.MiniAppInfo     // Catch:{ all -> 0x02f2 }
            r1.<init>()     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02d9
            java.lang.String r5 = "appId"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ all -> 0x02f2 }
            goto L_0x02da
        L_0x02d9:
            r5 = r4
        L_0x02da:
            r1.app_id = r5     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02e3
            java.lang.String r0 = r0.optString(r15)     // Catch:{ all -> 0x02f2 }
            goto L_0x02e4
        L_0x02e3:
            r0 = r4
        L_0x02e4:
            r1.path = r0     // Catch:{ all -> 0x02f2 }
            r3.mini_app_info = r1     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "KEY_POST_JUMPINFO"
            byte[] r1 = r3.toByteArray()     // Catch:{ all -> 0x02f2 }
            r9.putExtra(r0, r1)     // Catch:{ all -> 0x02f2 }
            goto L_0x02ff
        L_0x02f2:
            r0 = move-exception
            goto L_0x02f7
        L_0x02f4:
            r0 = move-exception
            r13 = r18
        L_0x02f7:
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r1 = "enterPostUI optionalInfoJson"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r1, r3)
        L_0x02ff:
            java.lang.String r0 = "finderEventInfo"
            boolean r1 = r13.has(r0)
            java.lang.String r3 = "callBackKey"
            r5 = r16
            java.lang.String r3 = r5.optString(r3)
            if (r3 == 0) goto L_0x0318
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0316
            goto L_0x0318
        L_0x0316:
            r3 = 0
            goto L_0x0319
        L_0x0318:
            r3 = 1
        L_0x0319:
            if (r3 != 0) goto L_0x032a
            com.tencent.mm.autogen.events.PostJumpInfoEvent r0 = new com.tencent.mm.autogen.events.PostJumpInfoEvent
            r0.<init>()
            com.tencent.mm.autogen.events.PostJumpInfoEvent$a r1 = r0.f9401d
            r1.f9402a = r14
            r0.publish()
            ao1.C54264e.f152304b = r4
            return
        L_0x032a:
            r3 = r23
            r4 = 1
            if (r3 != r4) goto L_0x033c
            r3 = 19
            java.lang.String r4 = "key_finder_post_from"
            r9.putExtra(r4, r3)
            r3 = 2
            java.lang.String r4 = "post_entry_type"
            r9.putExtra(r4, r3)
        L_0x033c:
            if (r1 != 0) goto L_0x0346
            r1 = r20
            r3 = r21
            r1.mo88204o(r9, r3, r2)
            goto L_0x037c
        L_0x0346:
            r1 = r20
            r3 = r21
            java.lang.String r4 = "eventName"
            org.json.JSONObject r0 = r13.getJSONObject(r0)     // Catch:{ Exception -> 0x036d }
            java.lang.String r5 = "finderNickname"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ Exception -> 0x036d }
            java.lang.String r0 = r0.optString(r4)     // Catch:{ Exception -> 0x036d }
            uq1.m r6 = uq1.C65449m.f188332a     // Catch:{ Exception -> 0x036d }
            java.lang.String r7 = "nickName"
            gy3.C87412m.m108593f(r5, r7)     // Catch:{ Exception -> 0x036d }
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ Exception -> 0x036d }
            qo1.l r4 = new qo1.l     // Catch:{ Exception -> 0x036d }
            r4.<init>(r9, r3, r2)     // Catch:{ Exception -> 0x036d }
            r6.mo89572l(r5, r0, r4)     // Catch:{ Exception -> 0x036d }
            goto L_0x037c
        L_0x036d:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r8, r2)
            java.lang.String r0 = "event exception"
            r2 = r24
            r3 = 1
            r2.mo5408a(r3, r0)
        L_0x037c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo1.C63295m.mo88195f(android.content.Context, java.lang.String, int, ht1.x3):void");
    }

    /* renamed from: g */
    public void mo88196g(Intent intent, Intent intent2) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(intent2, "curIntent");
        ((C58684b) C86312j.m106911c(C58684b.class)).wy0(intent, intent2);
    }

    /* renamed from: h */
    public void mo88197h(Activity activity, Intent intent, ViewAnimHelper.ViewInfo viewInfo, C64636pq2 pq22, int i, boolean z) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(viewInfo, "viewInfo");
        C87412m.m108594g(pq22, "localContent");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, FinderSelectCoverUI.class);
        intent.putExtra("media_list_", pq22.toByteArray());
        intent.putExtra("crop_info", viewInfo);
        intent.putExtra("media_list_count", pq22.f184875d.size());
        intent.putExtra("isLongVideoPost", z);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterSelectCoverUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/view/ViewAnimHelper$ViewInfo;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;IZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: i */
    public void mo88198i(Activity activity, Intent intent, int i, boolean z, int i2) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClassName(activity, "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
        C37521f fVar = C37521f.f99374d;
        if (!fVar.mo61200z()) {
            intent.putExtra("key_can_select_video_and_pic", true);
        }
        intent.putExtra("show_header_view", z);
        intent.putExtra("query_source_type", 32);
        intent.putExtra("query_media_type", i);
        intent.putExtra("album_video_max_duration", fVar.mo61160N());
        intent.putExtra("album_video_min_duration", fVar.mo61161O().f267171i);
        intent.putExtra("key_filter_hdr_video", true);
        intent.putExtra("key_max_video_duration", 300);
        C13442s8.f38060Q0.mo12871c(activity, intent);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderTemplateAlbumUI", "(Landroid/app/Activity;Landroid/content/Intent;IZI)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: j */
    public void mo88199j(Activity activity, Intent intent) {
        C87412m.m108594g(activity, "context");
        if (intent != null) {
            intent.putExtra("key_finder_post_router", 17);
            intent.putExtra("key_finder_post_from", 7);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo83582c0(activity, intent);
        }
    }

    /* renamed from: k */
    public void mo88200k(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, FinderCropAvatarUI.class);
        intent.putExtra("key_result_file_name", "finder_avatar.tmp");
        intent.putExtra("key_crop_source", 1);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterCropAvatarUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: l */
    public void mo88201l(Activity activity, Intent intent, String str, String str2, int i) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "resultFileName");
        intent.setClass(activity, FinderCropAvatarUI.class);
        intent.putExtra("key_crop_style", 1);
        intent.putExtra("key_crop_source", 2);
        intent.putExtra("key_source_img_path", str);
        intent.putExtra("key_result_file_name", str2);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterCropAvatarUIFromProfile", "(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: m */
    public void mo88202m(Activity activity, Intent intent, String str, String str2, int i) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "resultFileName");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, FinderCropAvatarUI.class);
        intent.putExtra("key_crop_style", 2);
        intent.putExtra("key_crop_source", 3);
        intent.putExtra("key_source_img_path", str);
        intent.putExtra("key_result_file_name", str2);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterCropProfileBgUI", "(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: n */
    public void mo88203n(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderPostPreviewUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterPreviewAtTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterPreviewAtTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: o */
    public final void mo88204o(Intent intent, Context context, int i) {
        Activity ub02;
        intent.putExtra("post_id", C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond());
        C58408t0.f167336a.mo83266l(i, false);
        if (!(context instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
            context = ub02;
        }
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C87412m.m108593f(context, "targetContext ?: MMApplicationContext.getContext()");
        mo88189a(context, intent);
    }
}
