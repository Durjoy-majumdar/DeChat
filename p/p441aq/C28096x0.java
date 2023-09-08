package p441aq;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p008bq.C0362f1;
import qo3.C77407n;
import te3.C101800k70;
import u61.C101964h;
import z51.C39315g;

@C86522b
/* renamed from: aq.x0 */
public final class C28096x0 extends C86301e implements C0362f1 {

    /* renamed from: d */
    public final String f77478d = "MicroMsg.EmoticonAPICollectionJsApiService";

    /* renamed from: aq.x0$a */
    public static final class C28097a implements C11182m0 {

        /* renamed from: d */
        public static final C28097a f77479d = new C28097a();

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107125a(0, C0966R.string.i4e);
            e0Var.mo107125a(1, C0966R.string.f7401f_);
        }
    }

    /* renamed from: aq.x0$b */
    public static final class C28098b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C28096x0 f77480d;

        /* renamed from: e */
        public final /* synthetic */ String f77481e;

        /* renamed from: f */
        public final /* synthetic */ Context f77482f;

        public C28098b(C28096x0 x0Var, String str, Context context) {
            this.f77480d = x0Var;
            this.f77481e = str;
            this.f77482f = context;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                EmojiInfo vx02 = C28096x0.vx0(this.f77480d, this.f77481e);
                C115669n.INSTANCE.mo160131h(12789, 1, vx02.getMd5(), 2, vx02.field_designerID, vx02.field_groupId, "", 43, "", "", vx02.field_activityid);
                Intent intent = new Intent();
                intent.putExtra("Retr_File_Name", this.f77481e);
                intent.putExtra("Retr_Msg_Type", 5);
                int i2 = MsgRetransmitUI.f285342V0;
                intent.setClass(this.f77482f, MsgRetransmitUI.class);
                Context context = this.f77482f;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/feature/emoji/EmoticonAPICollectionJsApiService$showBottomSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/feature/emoji/EmoticonAPICollectionJsApiService$showBottomSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (itemId == 1) {
                EmojiInfo vx03 = C28096x0.vx0(this.f77480d, this.f77481e);
                C115669n.INSTANCE.mo160131h(12789, 3, vx03.getMd5(), 2, vx03.field_designerID, vx03.field_groupId, "", 43, "", "", vx03.field_activityid);
                ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138021h(this.f77482f, vx03, 1000043, -1, true, false, (String) null, (ArrayList<String>) null, (String) null);
            }
        }
    }

    public static final EmojiInfo vx0(C28096x0 x0Var, String str) {
        x0Var.getClass();
        Class cls = C39315g.class;
        EmojiInfo H2 = ((C39315g) C86312j.m106911c(cls)).getProvider().mo138001H2(str);
        if (H2 != null) {
            return H2;
        }
        EmojiInfo emojiInfo = new EmojiInfo();
        emojiInfo.field_md5 = str;
        ((C39315g) C86312j.m106911c(cls)).getProvider().mo138033r(str, 65, 0, 0);
        return emojiInfo;
    }

    /* renamed from: Kk */
    public void mo398Kk(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "md5");
        String str3 = this.f77478d;
        Log.m105924i(str3, "goToEmoticonPreview: " + str);
        Intent intent = new Intent(context, Class.forName("com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI"));
        EmojiInfo H2 = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138001H2(str);
        if (H2 == null) {
            H2 = new EmojiInfo();
            H2.field_md5 = str;
            if (str2 != null) {
                C101800k70 k702 = new C101800k70();
                byte[] decode = Base64.decode(str2, 2);
                if (decode != null) {
                    try {
                        k702.parseFrom(decode);
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                    }
                }
                C101964h.m134219a(k702, H2);
            }
        }
        intent.putExtra("custom_smiley_preview_md5", str);
        intent.putExtra("emoji_info", H2);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 44);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/feature/emoji/EmoticonAPICollectionJsApiService", "goToEmoticonPreview", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/feature/emoji/EmoticonAPICollectionJsApiService", "goToEmoticonPreview", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: Zx */
    public void mo399Zx(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "md5");
        String str3 = this.f77478d;
        Log.m105924i(str3, "showBottomSheet: " + str);
        C77407n nVar = new C77407n(context, 1, false);
        nVar.f225771i = C28097a.f77479d;
        nVar.f225782p = new C28098b(this, str, context);
        nVar.mo107573q();
    }

    /* renamed from: uO */
    public boolean mo400uO(String str, String str2) {
        C87412m.m108594g(str, "md5");
        C87412m.m108594g(str2, "base64Buffer");
        EmojiInfo H2 = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138001H2(str);
        if (H2 == null) {
            H2 = new EmojiInfo();
            H2.field_md5 = str;
        }
        String K1 = H2.mo62640K1();
        if (C86013q1.m106450k(K1)) {
            return true;
        }
        byte[] decode = Base64.decode(str2, 2);
        String mD5String = MD5Util.getMD5String(decode);
        if (C87412m.m108589b(str, mD5String)) {
            C86013q1.m106437S(K1, decode);
            return true;
        }
        String str3 = this.f77478d;
        Log.m105924i(str3, "saveToFile: md5 mismatch, " + str + ", " + mD5String);
        return false;
    }
}
