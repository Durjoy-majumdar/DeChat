package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C41053r;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gc0.C20828a;
import i61.C76300m;
import i61.C98601f;
import ic0.C98661k;
import kg3.C76577a;
import ob0.C117747y;
import qo3.C77407n;
import w51.C102336f;
import x51.C102554b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI */
public class EmojiStoreTopicUI extends BaseEmojiStoreUI {

    /* renamed from: I */
    public int f268654I;

    /* renamed from: J */
    public String f268655J;

    /* renamed from: K */
    public String f268656K;

    /* renamed from: L */
    public String f268657L;

    /* renamed from: M */
    public String f268658M;

    /* renamed from: N */
    public String f268659N;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI$a */
    public class C93154a implements MenuItem.OnMenuItemClickListener {
        public C93154a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105918d("MicroMsg.emoji.EmojiStoreTopicUI", "on shard click.");
            if (Util.isNullOrNil(EmojiStoreTopicUI.this.f268655J) || Util.isNullOrNil(EmojiStoreTopicUI.this.f268656K)) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreTopicUI", "name or url is null.");
            } else {
                EmojiStoreTopicUI emojiStoreTopicUI = EmojiStoreTopicUI.this;
                C77407n nVar = new C77407n((Context) emojiStoreTopicUI.getContext(), 1, false);
                nVar.f225771i = new C93275y0(emojiStoreTopicUI);
                nVar.f225782p = new C93276z0(emojiStoreTopicUI);
                nVar.mo107573q();
                C115669n.INSTANCE.mo160131h(13224, 1, 0, "", Integer.valueOf(emojiStoreTopicUI.f268654I));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI$b */
    public class C93155b implements C98661k {
        public C93155b() {
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            EmojiBaseActivity.C93130b bVar = EmojiStoreTopicUI.this.f268408e;
            if (bVar != null) {
                bVar.sendEmptyMessage(1009);
            }
        }
    }

    /* renamed from: I7 */
    public void mo127640I7(Message message) {
        super.mo127640I7(message);
        if (message.what == 1009) {
            mo127762j8(this.f268658M);
        }
    }

    /* renamed from: M7 */
    public void mo127644M7(boolean z, C41053r rVar, boolean z2, boolean z3) {
        C41053r rVar2 = this.f268300y;
        super.mo127644M7(z, rVar, z2, z3);
    }

    /* renamed from: N7 */
    public int mo127645N7() {
        return 11;
    }

    /* renamed from: R7 */
    public int mo127649R7() {
        return 7;
    }

    /* renamed from: S7 */
    public int mo127650S7() {
        return 14;
    }

    /* renamed from: T7 */
    public int mo127651T7() {
        return this.f268654I;
    }

    /* renamed from: V7 */
    public void mo127653V7() {
        super.mo127653V7();
    }

    /* renamed from: W7 */
    public void mo127654W7(C41053r rVar, boolean z, boolean z2) {
        super.mo127654W7(rVar, z, z2);
    }

    /* renamed from: Y7 */
    public boolean mo127656Y7() {
        return false;
    }

    /* renamed from: Z7 */
    public boolean mo127657Z7() {
        return !Util.isNullOrNil(this.f268658M);
    }

    /* renamed from: a8 */
    public C102554b mo127658a8() {
        return new C102336f(getContext());
    }

    public int getForceOrientation() {
        return 1;
    }

    public void initView() {
        this.f268654I = getIntent().getIntExtra("topic_id", -1);
        this.f268655J = getIntent().getStringExtra("topic_name");
        this.f268658M = getIntent().getStringExtra("topic_ad_url");
        this.f268656K = getIntent().getStringExtra("topic_icon_url");
        this.f268657L = getIntent().getStringExtra("topic_desc");
        this.f268659N = getIntent().getStringExtra("sns_object_data");
        getIntent().getIntExtra("extra_scence", 0);
        if (!Util.isNullOrNil(this.f268659N)) {
            this.f268654I = EmojiLogic.m117479j(this.f268659N);
            this.f268655J = EmojiLogic.m117480k(this.f268659N);
            this.f268656K = EmojiLogic.m117477h(this.f268659N);
            this.f268657L = EmojiLogic.m117476g(this.f268659N);
            this.f268658M = EmojiLogic.m117478i(this.f268659N);
        }
        setMMTitle(this.f268655J);
        super.initView();
        addIconOptionMenu(0, C0966R.raw.icons_outlined_share, new C93154a());
        showOptionMenu(0, false);
        mo127762j8(this.f268658M);
    }

    /* renamed from: j8 */
    public void mo127762j8(String str) {
        if (this.f268285g != null && this.f268286h != null && !Util.isNullOrNil(str)) {
            EmojiInfo f = EmojiLogic.m117475f("Toptic", 8, str, C76577a.m92156g(this), true);
            if (f == null) {
                C20828a.m22825b().mo32521j(str, (ImageView) null, C98601f.m128140e("Toptic", str, false, "Toptic", "BANNER"), new C93155b());
                return;
            }
            this.f268286h.setImageFilePath(f.mo62640K1());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        mo127643L7();
        if (i == 2002 && i2 == -1) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                Log.m105918d("MicroMsg.emoji.EmojiStoreTopicUI", ".." + stringExtra);
                C76300m.m91727c(this, stringExtra, 26, this.f268654I, this.f268655J, this.f268657L, this.f268656K, this.f268658M, 0);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115669n.INSTANCE.mo160131h(12740, 3, "", "", Integer.valueOf(this.f268654I), 11, 11);
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        if (this.f268292q) {
            showOptionMenu(0, false);
        } else {
            showOptionMenu(0, true);
        }
    }
}
