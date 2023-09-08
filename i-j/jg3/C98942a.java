package jg3;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiAddCustomDialogUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import di3.C86312j;
import f40.C86709a0;
import i61.C98602h;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p248ug.C90660g;
import p384tk.C101897a;
import p490dl.C97496s;
import wh3.C102452z;
import z51.C39315g;
import zc3.C103010b;

/* renamed from: jg3.a */
public class C98942a implements C103010b {

    /* renamed from: b */
    public static C87962b f290038b = new C87962b();

    /* renamed from: a */
    public String f290039a;

    /* renamed from: jg3.a$b */
    public static class C87962b {
        /* renamed from: a */
        public void mo122420a(int i, String str) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("value", str);
            try {
                MMApplicationContext.getContext().getContentResolver().update(Uri.parse("content://" + C90660g.f260478a + "/" + "userinfo" + "/"), contentValues, (String) null, (String[]) null);
            } catch (IllegalArgumentException e) {
                Log.printErrStackTrace("MicroMsg.EmotionStorageResolver", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: jg3.a$a */
    public static class C98943a {
    }

    static {
        new C98943a();
    }

    /* renamed from: w */
    public static Bundle m128786w(Uri uri, String str, String str2, Bundle bundle) {
        Bundle bundle2;
        try {
            bundle2 = MMApplicationContext.getContext().getContentResolver().call(uri, str, str2, bundle);
        } catch (IllegalArgumentException | NullPointerException | SecurityException e) {
            Log.printErrStackTrace("MicroMsg.EmotionStorageResolver", e, "", new Object[0]);
            bundle2 = null;
        }
        return bundle2 != null ? bundle2 : new Bundle();
    }

    /* renamed from: x */
    public static Uri m128787x() {
        return Uri.parse("content://" + C90660g.f260478a + "/");
    }

    /* renamed from: H2 */
    public EmojiInfo mo138001H2(String str) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(str);
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_md5", str);
        Bundle w = m128786w(m128787x(), "getEmojiByMd5", (String) null, bundle);
        w.setClassLoader(EmojiInfo.class.getClassLoader());
        return (EmojiInfo) w.getParcelable("key_emoji_info");
    }

    /* renamed from: N1 */
    public boolean mo138007N1(String str) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138007N1(str);
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_path", str);
        return m128786w(m128787x(), "checkGifFile", (String) null, bundle).getBoolean("key_data");
    }

    /* renamed from: T */
    public String mo138012T(String str) {
        return C86709a0.m107531m().mo58407a().mo71804b() ? ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str) : m128786w(m128787x(), "getCurLangDesc", str, (Bundle) null).getString("data", "");
    }

    /* renamed from: Y0 */
    public boolean mo138013Y0() {
        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
            return m128786w(m128787x(), "isEnableHEVCDecode", (String) null, (Bundle) null).getBoolean("key_data");
        }
        ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
        return C97496s.m125614b();
    }

    /* renamed from: a */
    public void mo138014a() {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138014a();
        }
    }

    /* renamed from: b */
    public String mo138015b() {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            this.f290039a = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138015b();
        } else if (Util.isNullOrNil(this.f290039a)) {
            this.f290039a = m128786w(m128787x(), "getAccPath", (String) null, (Bundle) null).getString("path");
        }
        return this.f290039a;
    }

    /* renamed from: c */
    public void mo138016c(MStorage.IOnStorageChange iOnStorageChange) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138016c(iOnStorageChange);
        }
    }

    /* renamed from: d */
    public boolean mo138017d() {
        return C86709a0.m107531m().mo58407a().mo71804b() ? ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138017d() : m128786w(m128787x(), "isEnableHevcUpload", (String) null, (Bundle) null).getBoolean("key_data");
    }

    /* renamed from: e */
    public List<C102452z> mo138018e() {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138018e();
        }
        return null;
    }

    /* renamed from: f */
    public void mo138019f(EmojiInfo emojiInfo) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138019f(emojiInfo);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.setClassLoader(EmojiInfo.class.getClassLoader());
        bundle.putParcelable("key_emoji_info", emojiInfo);
        m128786w(m128787x(), "updateEmojiInfo", (String) null, bundle);
    }

    /* renamed from: g */
    public boolean mo138020g() {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138020g();
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo138021h(Context context, EmojiInfo emojiInfo, int i, int i2, boolean z, boolean z2, String str, ArrayList<String> arrayList, String str2) {
        Context context2 = context;
        if (context2 == null) {
            Log.m105920e("MicroMsg.EmotionStorageResolver", "[cpan] save emoji failed. context is null");
            return false;
        } else if (emojiInfo == null) {
            Log.m105920e("MicroMsg.EmotionStorageResolver", "[cpan] save emoji failed. emoji is null");
            return false;
        } else {
            try {
                Intent intent = new Intent();
                int i3 = EmojiAddCustomDialogUI.f268385t;
                intent.setClass(context, EmojiAddCustomDialogUI.class);
                intent.putExtra("extra_id", emojiInfo.getMd5());
                int i4 = i;
                intent.putExtra("extra_scence", i);
                intent.putExtra("extra_move_to_top", z);
                intent.putExtra("extra_current", true);
                intent.putExtra("key_is_selfie", z2);
                intent.putExtra("key_attached_text", str);
                intent.putExtra("key_attached_emoji_md5", arrayList);
                intent.putExtra("key_imitate_md5", str2);
                intent.addFlags(65536);
                if (i2 <= 0 || !(context2 instanceof Activity)) {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/resolver/EmotionStorageResolver", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/storage/emotion/EmojiInfo;IIZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/resolver/EmotionStorageResolver", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/storage/emotion/EmojiInfo;IIZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i2));
                    aVar2.mo10233c(intent);
                    C117292a.m165364j((Activity) context2, aVar2.mo10232b(), "com/tencent/mm/resolver/EmotionStorageResolver", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/storage/emotion/EmojiInfo;IIZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            } catch (ClassNotFoundException e) {
                Log.printErrStackTrace("MicroMsg.EmotionStorageResolver", e, "start EmojiAddCustomDialogUI failed", new Object[0]);
            }
            return true;
        }
    }

    /* renamed from: i */
    public void mo138022i(MStorage.IOnStorageChange iOnStorageChange) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138022i(iOnStorageChange);
        }
    }

    /* renamed from: j */
    public void mo138023j(String str) {
        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
            Bundle bundle = new Bundle();
            bundle.putString("key_md5", str);
            MMApplicationContext.getContext().getContentResolver().call(m128787x(), "addCaptureEmojiUploadTask", (String) null, bundle);
        } else if (C86709a0.m107523b().mo121114l()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138023j(str);
        }
    }

    /* renamed from: k */
    public void mo138024k(MStorage.IOnStorageChange iOnStorageChange) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138024k(iOnStorageChange);
        }
    }

    /* renamed from: l */
    public void mo138025l(MStorage.IOnStorageChange iOnStorageChange) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138025l(iOnStorageChange);
        }
    }

    /* renamed from: l1 */
    public boolean mo138026l1(String str) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138026l1(str);
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_path", str);
        return m128786w(m128787x(), "checkGifFile", (String) null, bundle).getBoolean("key_data");
    }

    /* renamed from: m */
    public EmojiInfo mo138027m(EmojiInfo emojiInfo) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138027m(emojiInfo);
        }
        Bundle bundle = new Bundle(EmojiInfo.class.getClassLoader());
        bundle.putParcelable("emoji", emojiInfo);
        Bundle call = MMApplicationContext.getContext().getContentResolver().call(m128787x(), "getRandomEmoji", (String) null, bundle);
        if (call == null) {
            Log.m105920e("MicroMsg.EmotionStorageResolver", "[getRandomEmoji] bunndle is null! ");
            return null;
        }
        call.setClassLoader(EmojiInfo.class.getClassLoader());
        if (call.containsKey("data")) {
            return (EmojiInfo) call.getParcelable("data");
        }
        Log.m105921e("MicroMsg.EmotionStorageResolver", "[getRandomEmoji] bundle is null?", false);
        return null;
    }

    /* renamed from: n */
    public void mo138028n(String str) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138028n(str);
        }
    }

    /* renamed from: o */
    public void mo138029o(EmojiInfo emojiInfo) {
        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("emojiInfo", emojiInfo);
            MMApplicationContext.getContext().getContentResolver().call(m128787x(), "showCaptureEmojiInPanel", (String) null, bundle);
        } else if (C86709a0.m107523b().mo121114l()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138029o(emojiInfo);
        }
    }

    public void onDestroy() {
    }

    /* renamed from: p */
    public EmojiIPSetInfo mo138031p(String str) {
        if (MMApplicationContext.isMainProcess()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138031p(str);
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_ip_key", str);
        Bundle w = m128786w(m128787x(), "getIpSetInfo", (String) null, bundle);
        w.setClassLoader(EmojiIPSetInfo.class.getClassLoader());
        return (EmojiIPSetInfo) w.getParcelable("key_data");
    }

    /* renamed from: q */
    public <T> T mo138032q(C72994y1.C72995a aVar, T t) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138032q(aVar, t);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_config_key", aVar);
        T t2 = m128786w(m128787x(), "getConfig", (String) null, bundle).get("key_config_value");
        return t2 != null ? t2 : t;
    }

    /* renamed from: r */
    public EmojiInfo mo138033r(String str, int i, int i2, int i3) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138040y(str, "", i, i2, i3, (String) null, (String) null, (String) null, "");
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_md5", str);
        bundle.putInt("key_group", i);
        bundle.putInt("key_type", i2);
        bundle.putInt("key_size", i3);
        Bundle w = m128786w(m128787x(), "createEmojiInfo", (String) null, bundle);
        w.setClassLoader(EmojiInfo.class.getClassLoader());
        return (EmojiInfo) w.getParcelable("key_emoji_info");
    }

    /* renamed from: s */
    public void mo138034s(C72994y1.C72995a aVar, Object obj) {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138034s(aVar, obj);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_config_key", aVar);
        bundle.putSerializable("key_config_value", (Serializable) obj);
        m128786w(m128787x(), "setConfig", (String) null, bundle);
    }

    /* renamed from: t */
    public boolean mo138035t() {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138035t();
        }
        return false;
    }

    /* renamed from: u */
    public byte[] mo138036u(EmojiInfo emojiInfo) {
        return C86709a0.m107531m().mo58407a().mo71804b() ? ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138036u(emojiInfo) : C101897a.m134075e().mo126270A2(emojiInfo);
    }

    /* renamed from: v */
    public String mo138037v() {
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138037v();
        }
        Bundle w = m128786w(m128787x(), "getPanelConfigName", (String) null, (Bundle) null);
        w.setClassLoader(SmileyPanelConfigInfo.class.getClassLoader());
        return w.getString("key_data");
    }
}
