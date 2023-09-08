package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import androidx.fragment.app.C112911a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.p136ui.MMTabView;
import com.tencent.p014mm.p136ui.mogic.WxViewPager;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2TabView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI$$d */
public class EmojiStoreV2UI$$d extends C112911a0 implements ViewPager.OnPageChangeListener, EmojiStoreV2TabView.C41070b {

    /* renamed from: d */
    public WxViewPager f110642d;

    /* renamed from: e */
    public boolean f110643e;

    /* renamed from: f */
    public final /* synthetic */ EmojiStoreV2UI f110644f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiStoreV2UI$$d(EmojiStoreV2UI emojiStoreV2UI, FragmentActivity fragmentActivity, WxViewPager wxViewPager, boolean z) {
        super(fragmentActivity.getSupportFragmentManager());
        this.f110644f = emojiStoreV2UI;
        this.f110643e = z;
        this.f110642d = wxViewPager;
        wxViewPager.setAdapter(this);
        this.f110642d.setOnPageChangeListener(this);
        this.f110642d.setCurrentItem(emojiStoreV2UI.f110634h);
        EmojiStoreV2TabView emojiStoreV2TabView = emojiStoreV2UI.f110631e;
        if (emojiStoreV2TabView != null) {
            emojiStoreV2TabView.setOnTabClickListener(this);
        }
    }

    public int getCount() {
        return this.f110643e ? 2 : 1;
    }

    public Fragment getItem(int i) {
        return this.f110644f.mo64129H7(i);
    }

    public void onPageScrollStateChanged(int i) {
        Log.m105919d("MicroMsg.emoji.EmojiStoreV2UI", "onPageScrollStateChanged state:%d", Integer.valueOf(i));
        if (i == 0) {
            EmojiStoreV2UI emojiStoreV2UI = this.f110644f;
            if (emojiStoreV2UI.mo64129H7(emojiStoreV2UI.f110634h) != null) {
                EmojiStoreV2UI emojiStoreV2UI2 = this.f110644f;
                EmojiStoreV2BaseFragment H7 = emojiStoreV2UI2.mo64129H7(emojiStoreV2UI2.f110634h);
                if (H7.f268802q != null && H7.f268806u != null && H7.mo127821P()) {
                    H7.f268806u.mo142175k();
                }
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        EmojiStoreV2TabView emojiStoreV2TabView = this.f110644f.f110631e;
        if (emojiStoreV2TabView != null) {
            emojiStoreV2TabView.f110621i.setTranslate(((float) emojiStoreV2TabView.f110616d) * (((float) i) + f), 0.0f);
            emojiStoreV2TabView.f110620h.setImageMatrix(emojiStoreV2TabView.f110621i);
        }
    }

    public void onPageSelected(int i) {
        MMTabView mMTabView;
        Log.m105919d("MicroMsg.emoji.EmojiStoreV2UI", "onPageSelected :%d", Integer.valueOf(i));
        EmojiStoreV2UI emojiStoreV2UI = this.f110644f;
        emojiStoreV2UI.f110634h = i;
        EmojiStoreV2TabView emojiStoreV2TabView = emojiStoreV2UI.f110631e;
        if (emojiStoreV2TabView != null) {
            emojiStoreV2TabView.setTo(i);
        }
        EmojiStoreV2UI emojiStoreV2UI2 = this.f110644f;
        if (emojiStoreV2UI2.f110634h == 1 && !emojiStoreV2UI2.f110636j) {
            C115669n.INSTANCE.mo160131h(12090, new Object[0]);
            EmojiStoreV2UI emojiStoreV2UI3 = this.f110644f;
            emojiStoreV2UI3.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, Boolean.FALSE);
            EmojiStoreV2TabView emojiStoreV2TabView2 = emojiStoreV2UI3.f110631e;
            if (!(emojiStoreV2TabView2 == null || (mMTabView = emojiStoreV2TabView2.f110623n) == null)) {
                mMTabView.f121184e.setVisibility(4);
            }
            this.f110644f.f110636j = true;
        }
    }
}
