package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import p207nl.C100135l;
import p441aq.C92054g;
import u61.C101964h;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSendDialogUI */
public class EmojiSendDialogUI extends MMBaseActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f268534i = 0;

    /* renamed from: e */
    public EmojiInfo f268535e;

    /* renamed from: f */
    public boolean f268536f = false;

    /* renamed from: g */
    public String f268537g;

    /* renamed from: h */
    public String f268538h;

    public void finish() {
        overridePendingTransition(-1, -1);
        super.finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class cls = C92054g.class;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (i2 == -1) {
                Log.m105924i("MicroMsg.EmojiSendDialogUI", "select contact result");
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                String stringExtra2 = intent.getStringExtra("custom_send_text");
                ((C92054g) C86312j.m106911c(cls)).getClass();
                EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f268535e.getMd5());
                if (TO == null) {
                    String f = C101964h.m134224f();
                    EmojiInfo emojiInfo = this.f268535e;
                    String q = EmojiLogic.m117486q(f, emojiInfo.field_groupId, emojiInfo.getMd5());
                    if (C86013q1.m106450k(q)) {
                        int i3 = ImgUtil.isGif(q) ? 2 : 1;
                        EmojiInfo emojiInfo2 = this.f268535e;
                        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
                        emojiInfo2.field_catalog = 65;
                        emojiInfo2.field_type = i3;
                        emojiInfo2.field_size = (int) C86013q1.m106451l(q);
                        emojiInfo2.field_temp = 1;
                        ((C92054g) C86312j.m106911c(cls)).getClass();
                        TO = C30790w2.m39221h().mo57717d().mo142040Ow(emojiInfo2);
                    }
                }
                for (String next : Util.stringsToList(Util.nullAs(stringExtra, "").split(","))) {
                    if (TO != null) {
                        ((C92054g) C86312j.m106911c(cls)).xx0().mo138011S(next, TO, (C72963f4) null);
                        if (!Util.isNullOrNil(stringExtra2)) {
                            C7250m.m7431a().mo136252Ar(stringExtra2, next);
                        }
                    }
                }
                setResult(-1);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(-1, -1);
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setStatusBarColor(0);
        this.f268535e = (EmojiInfo) getIntent().getParcelableExtra("emoji_info");
        this.f268538h = getIntent().getStringExtra("ad_uxInfo");
        EmojiInfo H2 = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138001H2(this.f268535e.field_md5);
        if (H2 != null) {
            this.f268535e = H2;
            this.f268536f = true;
        }
        String f = C101964h.m134224f();
        EmojiInfo emojiInfo = this.f268535e;
        this.f268537g = EmojiLogic.m117486q(f, emojiInfo.field_groupId, emojiInfo.getMd5());
        new C100135l(this, this.f268535e, this.f268538h, new C93194j0(this));
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
