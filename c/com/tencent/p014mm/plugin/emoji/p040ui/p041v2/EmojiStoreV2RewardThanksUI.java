package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.widget.MMCopiableTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gc0.C20828a;
import i61.C98601f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p441aq.C92054g;
import te3.C50228l80;
import te3.C51759vz1;
import u61.C101964h;
import wh3.C38142q;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardThanksUI */
public class EmojiStoreV2RewardThanksUI extends MMActivity {

    /* renamed from: d */
    public String f268833d;

    /* renamed from: e */
    public EmojiStoreV2RewardBannerView f268834e;

    /* renamed from: f */
    public View f268835f;

    /* renamed from: g */
    public MMCopiableTextView f268836g;

    /* renamed from: h */
    public TextView f268837h;

    /* renamed from: i */
    public TextView f268838i;

    /* renamed from: j */
    public AnimationDrawable f268839j;

    /* renamed from: n */
    public C51759vz1 f268840n;

    /* renamed from: o */
    public MMHandler f268841o = new C93228a();

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardThanksUI$a */
    public class C93228a extends MMHandler {
        public C93228a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1001) {
                String str = (String) message.obj;
                if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
                    Log.m105924i("MicroMsg.emoji.EmojiStoreV2RewardThanksUI", "path is null or file no exists");
                    return;
                }
                EmojiStoreV2RewardThanksUI.this.f268834e.setImageFilePath(str);
                EmojiStoreV2RewardThanksUI.this.f268834e.setScaleType(ImageView.ScaleType.FIT_XY);
                AnimationDrawable animationDrawable = EmojiStoreV2RewardThanksUI.this.f268839j;
                if (animationDrawable != null && animationDrawable.isRunning()) {
                    EmojiStoreV2RewardThanksUI.this.f268839j.stop();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardThanksUI$b */
    public class C93229b implements MenuItem.OnMenuItemClickListener {
        public C93229b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EmojiStoreV2RewardThanksUI.this.finish();
            return false;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359655a32;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.c9t);
        setBackBtn(new C93229b());
        EmojiStoreV2RewardBannerView emojiStoreV2RewardBannerView = (EmojiStoreV2RewardBannerView) findViewById(C0966R.C0970id.kj5);
        this.f268834e = emojiStoreV2RewardBannerView;
        emojiStoreV2RewardBannerView.setScale(1.0f);
        this.f268835f = findViewById(C0966R.C0970id.gk9);
        this.f268836g = (MMCopiableTextView) findViewById(C0966R.C0970id.gka);
        this.f268837h = (TextView) findViewById(C0966R.C0970id.gk8);
        this.f268838i = (TextView) findViewById(C0966R.C0970id.gk_);
        this.f268839j = (AnimationDrawable) getResources().getDrawable(C0966R.C0969drawable.emoji_doge_loading);
    }

    public void onCreate(Bundle bundle) {
        C38142q qVar;
        super.onCreate(bundle);
        this.f268833d = getIntent().getStringExtra("extra_id");
        initView();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            qVar = h.f82777i;
        }
        C51759vz1 jo = qVar.mo61539jo(this.f268833d);
        this.f268840n = jo;
        if (jo != null) {
            C50228l80 l802 = jo.f143785g;
            if (l802 == null || Util.isNullOrNil(l802.f137245e)) {
                this.f268834e.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.f4937rs));
                this.f268834e.setImageDrawable(this.f268839j);
                this.f268834e.setScaleType(ImageView.ScaleType.CENTER);
                this.f268839j.start();
            } else {
                String str = this.f268840n.f143785g.f137246f;
                String p = EmojiLogic.m117485p(C101964h.m134224f(), this.f268833d, str);
                if (C86013q1.m106450k(p)) {
                    this.f268834e.setImageFilePath(p);
                    this.f268834e.setScaleType(ImageView.ScaleType.FIT_XY);
                    AnimationDrawable animationDrawable = this.f268839j;
                    if (animationDrawable != null && animationDrawable.isRunning()) {
                        this.f268839j.stop();
                    }
                } else {
                    C20828a.m22825b().mo32521j(str, this.f268834e, C98601f.m128141f(this.f268833d, str, new Object[0]), new C93251r(this, str, p));
                    this.f268834e.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.f4937rs));
                    this.f268834e.setImageDrawable(this.f268839j);
                    this.f268834e.setScaleType(ImageView.ScaleType.CENTER);
                    this.f268839j.start();
                }
            }
        } else {
            this.f268834e.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.f4937rs));
            this.f268834e.setImageDrawable(this.f268839j);
            this.f268834e.setScaleType(ImageView.ScaleType.CENTER);
            this.f268839j.start();
        }
        C51759vz1 vz12 = this.f268840n;
        if (vz12 == null || vz12.f143785g == null) {
            View view = this.f268835f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardThanksUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardThanksUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view2 = this.f268835f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardThanksUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardThanksUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!Util.isNullOrNil(this.f268840n.f143785g.f137248h)) {
            this.f268836g.setVisibility(0);
            this.f268836g.setText(C0966R.string.c9u);
        } else {
            this.f268836g.setVisibility(0);
            this.f268836g.setText(C0966R.string.c9u);
        }
        this.f268837h.setVisibility(8);
        this.f268838i.setVisibility(8);
    }

    public void onDestroy() {
        AnimationDrawable animationDrawable = this.f268839j;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f268839j.stop();
        }
        super.onDestroy();
    }
}
