package com.tencent.p014mm.legacy.app;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.splash.C85778c;
import f40.C86709a0;
import f40.C86737h0;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.tencent.mm.legacy.app.k */
public class C80965k {

    /* renamed from: a */
    public static final C85778c f237822a = new C80966a();

    /* renamed from: b */
    public static final HashSet f237823b;

    /* renamed from: com.tencent.mm.legacy.app.k$a */
    public class C80966a implements C85778c {
        /* renamed from: a */
        public Activity mo112744a(Activity activity) {
            if (C80965k.m98851a(false) || activity == null) {
                return activity;
            }
            Class<?> cls = activity.getClass();
            C86737h0 h0Var = (C86737h0) cls.getAnnotation(C86737h0.class);
            if (!(h0Var != null || cls.getSuperclass() == null ? h0Var != null : ((C86737h0) cls.getSuperclass().getAnnotation(C86737h0.class)) != null)) {
                return activity;
            }
            Log.m105929w("MicroMsg.PreventAccountNotReady", "this activity %s need account but account not initiated, so we need replace it with a suicide activity.", activity);
            return new SuicideHackActivity();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f237823b = hashSet;
        hashSet.addAll(Arrays.asList(new String[]{"com.tencent.mm.plugin.card.ui.CardHomePageUI", "com.tencent.mm.plugin.card.ui.CardHomePageNewUI", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI", "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI", "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", "com.tencent.mm.ui.chatting.ChattingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsUI", "com.tencent.mm.plugin.scanner.ui.BaseScanUI", "com.tencent.mm.plugin.readerapp.ui.ReaderAppUI", "com.tencent.mm.ui.SingleChatInfoUI", "com.tencent.mm.plugin.sns.ui.SnsUploadUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI", "com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI", "com.tencent.mm.chatroom.ui.ChatroomInfoUI"}));
    }

    /* renamed from: a */
    public static boolean m98851a(boolean z) {
        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
            if (z) {
                Log.m105924i("MicroMsg.PreventAccountNotReady", "not main process");
            }
            return true;
        } else if (!C86709a0.m107528h().f251735l || !C86709a0.m107523b().mo121114l()) {
            return false;
        } else {
            if (z) {
                Log.m105924i("MicroMsg.PreventAccountNotReady", "account hasInitialized");
            }
            return true;
        }
    }
}
