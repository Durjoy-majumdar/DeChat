package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76879j;
import p207nl.C100128a;
import p214om.C11502f;
import p244tt.C14088e;
import p441aq.C92054g;
import qo3.C89779i0;
import u61.C101964h;

/* renamed from: com.tencent.mm.plugin.emoji.ui.i */
public class C93190i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268745d;

    public C93190i(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268745d = customSmileyPreviewUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int i2;
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            CustomSmileyPreviewUI customSmileyPreviewUI = this.f268745d;
            customSmileyPreviewUI.getIntent().getStringExtra("custom_smiley_preview_md5");
            EmojiInfo I7 = customSmileyPreviewUI.mo127672I7();
            if (I7 == null) {
                Log.m105928w("MicroMsg.emoji.CustomSmileyPreviewUI", "[cpan] save custom emoji failed. emoji is null.");
                return;
            }
            int i3 = I7.field_catalog;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            if (i3 != 17) {
                if (i3 == 81) {
                    C76879j.m92726T(customSmileyPreviewUI, customSmileyPreviewUI.getString(C0966R.string.f7568jx));
                    return;
                }
                C115669n.INSTANCE.mo160131h(12789, 3, I7.getMd5(), 1, I7.field_designerID, I7.field_groupId, "", "", "", "", "", I7.field_activityid, Long.valueOf(customSmileyPreviewUI.f268360x));
                ((C92054g) C86312j.m106911c(C92054g.class)).xx0().mo138008O(customSmileyPreviewUI.getContext(), I7, 4, customSmileyPreviewUI.f268338Y);
            }
        } else if (itemId == 1) {
            CustomSmileyPreviewUI customSmileyPreviewUI2 = this.f268745d;
            int i4 = CustomSmileyPreviewUI.f268306a1;
            String stringExtra = customSmileyPreviewUI2.getIntent().getStringExtra("custom_smiley_preview_md5");
            if (customSmileyPreviewUI2.mo127672I7() == null) {
                Log.m105928w("MicroMsg.emoji.CustomSmileyPreviewUI", "[cpan] retransmit failed. emoji is null.");
                return;
            }
            int intExtra = customSmileyPreviewUI2.getIntent().getIntExtra("CropImage_CompressType", 0);
            int intExtra2 = customSmileyPreviewUI2.getIntent().getIntExtra("CropImage_Msg_Id", -1);
            Intent intent = new Intent();
            intent.putExtra("Retr_File_Name", stringExtra);
            intent.putExtra("Retr_Msg_Id", intExtra2);
            intent.putExtra("Retr_Msg_Type", 5);
            intent.putExtra("Retr_Compress_Type", intExtra);
            EmojiInfo emojiInfo = customSmileyPreviewUI2.f268364z;
            if (emojiInfo == null) {
                ArrayList<String> arrayList = C101964h.f300169a;
                i2 = -1;
            } else {
                i2 = (C101964h.m134231m(emojiInfo) || !Util.isNullOrNil(emojiInfo.mo62685o0())) ? 17 : 14;
            }
            intent.putExtra("content_type_forward_to_wework", i2);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93184q(intent, customSmileyPreviewUI2);
            C115669n nVar = C115669n.INSTANCE;
            EmojiInfo emojiInfo2 = customSmileyPreviewUI2.f268364z;
            nVar.mo160131h(12789, 1, customSmileyPreviewUI2.f268364z.getMd5(), 1, emojiInfo2.field_designerID, emojiInfo2.field_groupId, customSmileyPreviewUI2.f268338Y, "", "", "", emojiInfo2.field_activityid, Long.valueOf(customSmileyPreviewUI2.f268360x));
        } else if (itemId == 2) {
            CustomSmileyPreviewUI customSmileyPreviewUI3 = this.f268745d;
            int i5 = CustomSmileyPreviewUI.f268306a1;
            if (customSmileyPreviewUI3.mo127672I7() == null) {
                Log.m105928w("MicroMsg.emoji.CustomSmileyPreviewUI", "[cpan] captureFollow failed. emoji is null.");
            } else {
                new C100128a(customSmileyPreviewUI3, customSmileyPreviewUI3.f268364z, (String) null, new C93192j(customSmileyPreviewUI3, C89779i0.m112248e(customSmileyPreviewUI3, customSmileyPreviewUI3.getString(C0966R.string.gas), false, 0, (DialogInterface.OnCancelListener) null)));
            }
        } else if (itemId == 3) {
            CustomSmileyPreviewUI customSmileyPreviewUI4 = this.f268745d;
            int i6 = CustomSmileyPreviewUI.f268306a1;
            customSmileyPreviewUI4.getClass();
            Class cls = C14088e.class;
            if (((C14088e) C86312j.m106911c(cls)).mo13530uu("wxalited4df4810a40b1d9ddc0cbea44d263fd9")) {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                bundle.putString(SearchIntents.EXTRA_QUERY, "{\"scene\":51}");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(customSmileyPreviewUI4.f268340Z);
                bundle2.putStringArrayList("k_outside_expose_proof_item_list", arrayList2);
                if (Util.isNullOrNil(customSmileyPreviewUI4.f268352p0)) {
                    bundle2.putString("k_username", customSmileyPreviewUI4.f268338Y);
                } else {
                    bundle2.putString("k_username", customSmileyPreviewUI4.f268352p0);
                }
                bundle2.putLong("k_expose_msg_id", customSmileyPreviewUI4.f268336X);
                bundle2.putInt("k_expose_msg_type", 47);
                bundle.putBundle("extraData", bundle2);
                Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                ((C14088e) C86312j.m106911c(cls)).mo13510OP(customSmileyPreviewUI4, bundle, true, true, new C93195k(customSmileyPreviewUI4));
            } else {
                customSmileyPreviewUI4.mo127673J7();
            }
            C115669n nVar2 = C115669n.INSTANCE;
            EmojiInfo emojiInfo3 = customSmileyPreviewUI4.f268364z;
            nVar2.mo160131h(12789, 6, customSmileyPreviewUI4.f268364z.getMd5(), 1, emojiInfo3.field_designerID, emojiInfo3.field_groupId, customSmileyPreviewUI4.f268338Y, "", "", "", emojiInfo3.field_activityid, Long.valueOf(customSmileyPreviewUI4.f268360x));
        }
    }
}
