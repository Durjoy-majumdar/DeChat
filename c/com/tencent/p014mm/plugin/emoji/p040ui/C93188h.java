package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import i61.C98602h;
import nj3.C11182m0;
import nj3.C76874e0;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.h */
public class C93188h implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268744d;

    public C93188h(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268744d = customSmileyPreviewUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        boolean z;
        boolean z2;
        if (!Util.isNullOrNil(this.f268744d.f268338Y)) {
            C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
            CustomSmileyPreviewUI customSmileyPreviewUI = this.f268744d;
            C72963f4 h302 = ((C72972g4) LE).h30(customSmileyPreviewUI.f268338Y, customSmileyPreviewUI.f268336X);
            z = C75569c4.m90692y(h302);
            z2 = C75569c4.m90671d(h302);
        } else {
            Log.m105929w("MicroMsg.emoji.CustomSmileyPreviewUI", "mMsgSender is null, mRoomId:%s", Util.nullAs(this.f268744d.f268352p0, ""));
            z2 = false;
            z = false;
        }
        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "isShareSaveForbidden:%s, forbiddenAllOp: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!z2) {
            EmojiInfo emojiInfo = this.f268744d.f268364z;
            int i = emojiInfo.field_catalog;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            if (i != 81 && !emojiInfo.mo62637I0()) {
                e0Var.mo107125a(0, C0966R.string.f7401f_);
            }
            if (!z) {
                e0Var.mo107125a(1, C0966R.string.i4e);
            }
            if (((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137994B(this.f268744d.f268364z) && (Util.isNullOrNil(this.f268744d.f268361x0) || !C72996z1.m85812O4(this.f268744d.f268361x0))) {
                e0Var.mo107125a(2, C0966R.string.c7_);
            }
        }
        e0Var.mo107125a(3, C0966R.string.c66);
    }
}
