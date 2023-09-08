package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.newtips.model.C115624i;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.smiley.C96954m;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gc2.C116945b;
import jc2.C117342b;
import kotlin.Metadata;
import p626nv.C109759g;
import qo3.C47883u;
import qo3.C77426q;
import vl0.C90830d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiRecommendPrivacySettingsUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI */
public class EmojiRecommendPrivacySettingsUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$a */
    public static final class C93142a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiRecommendPrivacySettingsUI f268524d;

        public C93142a(EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI) {
            this.f268524d = emojiRecommendPrivacySettingsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f268524d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$b */
    public static final class C93143b implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ EmojiRecommendPrivacySettingsUI f268525a;

        /* renamed from: b */
        public final /* synthetic */ MMSwitchBtn f268526b;

        /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$b$a */
        public static final class C93144a implements C47883u {

            /* renamed from: a */
            public static final C93144a f268527a = new C93144a();

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                C30777t2.f82756d.zx0(false);
                C96954m.f284033a.mo135540d();
            }
        }

        /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$b$b */
        public static final class C93145b implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ MMSwitchBtn f268528d;

            public C93145b(MMSwitchBtn mMSwitchBtn) {
                this.f268528d = mMSwitchBtn;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f268528d.setCheck(true);
            }
        }

        public C93143b(EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI, MMSwitchBtn mMSwitchBtn) {
            this.f268525a = emojiRecommendPrivacySettingsUI;
            this.f268526b = mMSwitchBtn;
        }

        public final void onStatusChange(boolean z) {
            if (!z) {
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(this.f268525a.getString(C0966R.string.ctl));
                qVar.mo107601m(C0966R.string.f7935ws);
                qVar.mo107589a(false);
                qVar.mo107590b(C93144a.f268527a);
                qVar.f225837a.f225714b.f225622E = new C93145b(this.f268526b);
                qVar.mo107603o();
                return;
            }
            C30777t2.f82756d.zx0(true);
            C96954m.f284033a.mo135539c(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$c */
    public static final class C93146c implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ EmojiRecommendPrivacySettingsUI f268529a;

        /* renamed from: b */
        public final /* synthetic */ MMSwitchBtn f268530b;

        /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$c$a */
        public static final class C93147a implements C47883u {

            /* renamed from: a */
            public static final C93147a f268531a = new C93147a();

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                C30777t2.f82756d.yx0(false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$c$b */
        public static final class C93148b implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ MMSwitchBtn f268532d;

            public C93148b(MMSwitchBtn mMSwitchBtn) {
                this.f268532d = mMSwitchBtn;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f268532d.setCheck(true);
            }
        }

        public C93146c(EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI, MMSwitchBtn mMSwitchBtn) {
            this.f268529a = emojiRecommendPrivacySettingsUI;
            this.f268530b = mMSwitchBtn;
        }

        public final void onStatusChange(boolean z) {
            if (!z) {
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(this.f268529a.getString(C0966R.string.ctk));
                qVar.mo107601m(C0966R.string.f7935ws);
                qVar.mo107589a(false);
                qVar.mo107590b(C93147a.f268531a);
                qVar.f225837a.f225714b.f225622E = new C93148b(this.f268530b);
                qVar.mo107603o();
                return;
            }
            C30777t2.f82756d.yx0(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI$d */
    public static final class C93149d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiRecommendPrivacySettingsUI f268533d;

        public C93149d(EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI) {
            this.f268533d = emojiRecommendPrivacySettingsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            int i;
            C30777t2.f82756d.getClass();
            C75592q0.m90769Q(Long.valueOf(C75592q0.m90781k() & -15728641));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_PRIVACY_DIALOG_BOOLEAN_SYNC, Boolean.FALSE);
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).getClass();
            C115624i.m162575k("140001001_1", false);
            C117342b xx02 = C116945b.xx0();
            xx02.getClass();
            try {
                i = xx02.f351291d.delete("NewTipsInfo2", "uniqueId=?", new String[]{"140001001_1"});
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NewTips.NewTipsInfoStorage", "deleteNewTipsByUniqueId NewTipsInfo by uniqueId(%s) [%s]", "140001001_1", e.toString());
                i = 0;
            }
            Log.m105925i("MicroMsg.NewTips.NewTipsManager", "delete %s: %s", "140001001_1", String.valueOf(i > 0));
            this.f268533d.recreate();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d7l;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ctt);
        setBackBtn(new C93142a(this));
        MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById(C0966R.C0970id.f357819o61);
        C30777t2 t2Var = C30777t2.f82756d;
        mMSwitchBtn.setCheck(t2Var.wx0());
        mMSwitchBtn.setSwitchListener(new C93143b(this, mMSwitchBtn));
        MMSwitchBtn mMSwitchBtn2 = (MMSwitchBtn) findViewById(C0966R.C0970id.f357820o62);
        mMSwitchBtn2.setCheck(t2Var.mo55937Xe());
        mMSwitchBtn2.setSwitchListener(new C93146c(this, mMSwitchBtn2));
        if (WeChatEnvironment.isCoolassistEnv()) {
            addIconOptionMenu((int) C90830d.CTRL_INDEX, "Reset", 0, (MenuItem.OnMenuItemClickListener) new C93149d(this));
        }
    }
}
