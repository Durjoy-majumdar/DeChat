package v61;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiCaptureUI;
import com.tencent.p014mm.plugin.emojicapture.p841ui.StickerPreviewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import p682rz.C36594q;
import v61.C37680b;

/* renamed from: v61.c */
public class C37682c {

    /* renamed from: v61.c$a */
    public class C37683a implements C37680b.C37681a {

        /* renamed from: a */
        public final /* synthetic */ Context f99865a;

        /* renamed from: b */
        public final /* synthetic */ Intent f99866b;

        /* renamed from: c */
        public final /* synthetic */ int f99867c;

        public C37683a(Context context, Intent intent, int i) {
            this.f99865a = context;
            this.f99866b = intent;
            this.f99867c = i;
        }

        /* renamed from: a */
        public void mo61289a(boolean z) {
            if (z) {
                Context context = this.f99865a;
                if (context instanceof Activity) {
                    Intent intent = this.f99866b;
                    int i = this.f99867c;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    aVar.mo10233c(intent);
                    C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                } else if (context instanceof ContextThemeWrapper) {
                    Context baseContext = ((ContextThemeWrapper) context).getBaseContext();
                    if (baseContext instanceof Activity) {
                        Intent intent2 = this.f99866b;
                        int i2 = this.f99867c;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Integer.valueOf(i2));
                        aVar2.mo10233c(intent2);
                        C117292a.m165364j((Activity) baseContext, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                        return;
                    }
                    Context context2 = this.f99865a;
                    Intent intent3 = this.f99866b;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent3);
                    C117292a.m165358d(context2, aVar3.mo10232b(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    Intent intent4 = this.f99866b;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(intent4);
                    C117292a.m165358d(context, aVar4.mo10232b(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar4.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture$1", "onCheckResult", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m41478a(Context context) {
        Class<StickerPreviewUI> cls = StickerPreviewUI.class;
        try {
            int i = StickerPreviewUI.f269212g;
            Intent intent = new Intent(context, cls);
            intent.putExtra("sticker_url", (String) null);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture", "startStickerPreview", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/emojicapture/api/TakeEmojiCapture", "startStickerPreview", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.TakeEmojiCapture", e, "start sticker preview failed", new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m41479b(Context context, int i, String str, String str2) {
        m41480c(context, str, 1111, Util.isNullOrNil(str) ? 2 : 1, (String) null, str2);
    }

    /* renamed from: c */
    public static void m41480c(Context context, String str, int i, int i2, String str2, String str3) {
        Context context2 = context;
        int i3 = i2;
        String str4 = str2;
        Class cls = C37680b.class;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = !Util.isNullOrNil(str);
        boolean tI = ((C37680b) C86312j.m106911c(cls)).mo61288tI();
        int ru = ((C37680b) C86312j.m106911c(cls)).mo61287ru();
        if (i3 == 1 || i3 == 6) {
            C115669n.INSTANCE.mo160131h(15982, 2, Long.valueOf(currentTimeMillis), 0, 0, 0, 0, 0, 0, 0, Integer.valueOf(i2), "", 0, 0, 0, "", 0, Integer.valueOf(ru));
        } else if (i3 == 2) {
            long currentTimeMillis2 = System.currentTimeMillis();
            C115669n.INSTANCE.mo160131h(15982, 1, Long.valueOf(currentTimeMillis), 0, 0, 0, 0, 0, 0, 0, Integer.valueOf(i2), "", 0, Long.valueOf(currentTimeMillis2 - C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_PANEL_FROM_TIPS_TIME_LONG, currentTimeMillis2)), 0, "", 0, Integer.valueOf(ru));
        }
        try {
            int i4 = EmojiCaptureUI.f269161u;
            Intent intent = new Intent(context2, EmojiCaptureUI.class);
            intent.putExtra("key_video_params", ((C36594q) C86312j.m106911c(C36594q.class)).mo60734Xa());
            intent.putExtra("key_enter_time", currentTimeMillis);
            intent.putExtra("enter_scene", i3);
            intent.putExtra("key_capture_max_duration", ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EmoticonCameraCaptureMaxDuration", 5));
            if (z) {
                intent.putExtra("key_imitated_md5", str);
            }
            intent.putExtra("sticker_enable", tI);
            if (str4 != null) {
                intent.putExtra("lens_id", str4);
            }
            intent.putExtra("username", str3);
            ((C37680b) C86312j.m106911c(cls)).jn0(context2, i3, new C37683a(context2, intent, i));
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.TakeEmojiCapture", e, "takeEmojiCapture failed", new Object[0]);
        }
    }
}
