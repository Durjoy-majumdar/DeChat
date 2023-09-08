package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMTabView;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeUI;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86737h0;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import ky2.C10432i;
import l31.C61212e;
import lc3.C10485b;
import o31.C11345b;
import o31.C76986a;
import p626nv.C109759g;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI */
public class EmojiStoreV2UI extends MMActivity {

    /* renamed from: q */
    public static final /* synthetic */ int f110629q = 0;

    /* renamed from: d */
    public HashMap<Integer, EmojiStoreV2BaseFragment> f110630d = new HashMap<>();

    /* renamed from: e */
    public EmojiStoreV2TabView f110631e;

    /* renamed from: f */
    public EmojiStoreV2ViewPager f110632f;

    /* renamed from: g */
    public EmojiStoreV2UI$$d f110633g;

    /* renamed from: h */
    public int f110634h = 0;

    /* renamed from: i */
    public boolean f110635i = true;

    /* renamed from: j */
    public boolean f110636j = false;

    /* renamed from: n */
    public int f110637n = -1;

    /* renamed from: o */
    public int f110638o = -1;

    /* renamed from: p */
    public EmojiStoreV2UI$$e f110639p;

    /* renamed from: H7 */
    public EmojiStoreV2BaseFragment mo64129H7(int i) {
        EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = null;
        if (i < 0) {
            return null;
        }
        if (this.f110630d.containsKey(Integer.valueOf(i))) {
            return this.f110630d.get(Integer.valueOf(i));
        }
        if (i == 0) {
            emojiStoreV2BaseFragment = (EmojiStoreV2BaseFragment) Fragment.instantiate(this, EmojiStoreV2MainFragment.class.getName(), (Bundle) null);
        } else if (i != 1) {
            Log.m105928w("MicroMsg.emoji.EmojiStoreV2UI", "create fragment failed.");
        } else {
            emojiStoreV2BaseFragment = (EmojiStoreV2BaseFragment) Fragment.instantiate(this, EmojiStoreV2PersonFragment.class.getName(), (Bundle) null);
        }
        Log.m105919d("MicroMsg.emoji.EmojiStoreV2UI", "create fragment index:%d", Integer.valueOf(i));
        if (emojiStoreV2BaseFragment != null) {
            emojiStoreV2BaseFragment.setParent(this);
        }
        this.f110630d.put(Integer.valueOf(i), emojiStoreV2BaseFragment);
        return emojiStoreV2BaseFragment;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a39;
    }

    public void initView() {
        addIconOptionMenu(0, (int) C0966R.string.a2p, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new EmojiStoreV2UI$$b(this));
        addIconOptionMenu(1, (int) C0966R.string.a08, (int) C0966R.raw.actionbar_setting_icon, (MenuItem.OnMenuItemClickListener) new EmojiStoreV2UI$$c(this));
        this.f110639p = new EmojiStoreV2UI$$e(this, 1, "stickernavright");
        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f110639p);
        this.f110631e = (EmojiStoreV2TabView) findViewById(C0966R.C0970id.ci4);
        EmojiStoreV2ViewPager emojiStoreV2ViewPager = (EmojiStoreV2ViewPager) findViewById(C0966R.C0970id.f357930ci3);
        this.f110632f = emojiStoreV2ViewPager;
        emojiStoreV2ViewPager.setOffscreenPageLimit(0);
        this.f110633g = new EmojiStoreV2UI$$d(this, this, this.f110632f, this.f110635i);
        if (!this.f110635i) {
            this.f110631e.setVisibility(8);
            return;
        }
        this.f110631e.setVisibility(0);
        this.f110631e.f110626q.alive();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2UI", "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        EmojiStoreV2UI$$d emojiStoreV2UI$$d = this.f110633g;
        if (emojiStoreV2UI$$d != null) {
            if (emojiStoreV2UI$$d.f110644f.mo64129H7(this.f110634h) != null) {
                EmojiStoreV2UI$$d emojiStoreV2UI$$d2 = this.f110633g;
                emojiStoreV2UI$$d2.f110644f.mo64129H7(this.f110634h).onActivityResult(i, i2, intent);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        MMTabView mMTabView;
        Class cls = C10432i.class;
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2UI", "exit in teen mode");
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(this);
            finish();
            return;
        }
        this.f110637n = getIntent().getIntExtra("download_entrance_scene", -1);
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowPersonalEmotion");
        int i = 0;
        Log.m105925i("MicroMsg.emoji.EmojiStoreV2UI", "get dynamic config value:%s", c);
        if (Util.isNullOrNil(c) || Util.safeParseInt(c) != 1) {
            this.f110635i = false;
        } else {
            this.f110635i = true;
        }
        if (this.f110635i) {
            this.f110634h = getIntent().getIntExtra("emoji_tab", 0);
        }
        this.f110638o = getIntent().getIntExtra("report_entrance_scence", 24);
        if (EmojiLogic.m117470a()) {
            Intent intent = new Intent(this, EmojiStoreV3HomeUI.class);
            intent.putExtra("emoji_tab", this.f110634h);
            intent.putExtra("download_entrance_scene", this.f110637n);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C119157j) C119157j.f356862d).mo183895z(new EmojiStoreV2UI$$a(this));
        }
        initView();
        C86709a0.m107525e().postToWorker(new EmojiStoreV2UI$$f((EmojiStoreV2UI$$b) null));
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, Boolean.FALSE)).booleanValue();
        EmojiStoreV2TabView emojiStoreV2TabView = this.f110631e;
        if (!(emojiStoreV2TabView == null || (mMTabView = emojiStoreV2TabView.f110623n) == null)) {
            ImageView imageView = mMTabView.f121184e;
            if (!booleanValue) {
                i = 4;
            }
            imageView.setVisibility(i);
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(406, 0, 1, false);
        nVar.idkeyStat(406, 2, System.currentTimeMillis() - currentTimeMillis, false);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.EmojiStoreV2UI).mo86179qs(this, C76986a.StickerGallery);
    }

    public void onDestroy() {
        super.onDestroy();
        HashMap<Integer, EmojiStoreV2BaseFragment> hashMap = this.f110630d;
        if (hashMap != null) {
            hashMap.clear();
        }
        EmojiStoreV2TabView emojiStoreV2TabView = this.f110631e;
        if (emojiStoreV2TabView != null) {
            emojiStoreV2TabView.f110626q.dead();
        }
        if (this.f110639p != null) {
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175776r(this.f110639p);
            this.f110639p = null;
        }
    }

    public void onResume() {
        super.onResume();
        Looper.myQueue().addIdleHandler(new C29872b0(this));
    }
}
