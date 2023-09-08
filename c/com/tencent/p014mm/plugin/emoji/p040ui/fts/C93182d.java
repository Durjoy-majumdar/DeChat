package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import android.view.View;
import c00.C92330r;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import p441aq.C92054g;
import u61.C101964h;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.d */
public class C93182d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSEmojiDetailPageUI f268738d;

    public C93182d(FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f268738d = fTSEmojiDetailPageUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f268738d;
        String md5 = fTSEmojiDetailPageUI.f268719q.getMd5();
        EmojiInfo emojiInfo = this.f268738d.f268719q;
        String str = emojiInfo.field_designerID;
        String str2 = emojiInfo.field_thumbUrl;
        String str3 = emojiInfo.field_activityid;
        fTSEmojiDetailPageUI.getClass();
        Class cls = C92054g.class;
        ((C92330r) C86312j.m106911c(C92330r.class)).mo126126PR(fTSEmojiDetailPageUI.f268723u, fTSEmojiDetailPageUI.f268724v, fTSEmojiDetailPageUI.f268726x, 1, 0, 0, fTSEmojiDetailPageUI.f268725w);
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(md5);
        String q = EmojiLogic.m117486q(C101964h.m134224f(), "", md5);
        if (TO == null) {
            int i = ImgUtil.isGif(q) ? 2 : 1;
            EmojiInfo emojiInfo2 = new EmojiInfo();
            emojiInfo2.field_md5 = md5;
            emojiInfo2.field_catalog = 65;
            emojiInfo2.field_type = i;
            emojiInfo2.field_size = (int) C86013q1.m106451l(q);
            emojiInfo2.field_temp = 1;
            emojiInfo2.field_designerID = str;
            emojiInfo2.field_thumbUrl = str2;
            emojiInfo2.field_activityid = str3;
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().mo142040Ow(emojiInfo2);
            TO = emojiInfo2;
        }
        Log.m105925i("MicroMsg.FTS.FTSEmojiDetailPageUI", "doAddAction %b", Boolean.valueOf(((C92054g) C86312j.m106911c(cls)).xx0().mo138008O(fTSEmojiDetailPageUI, TO, 18, C75592q0.m90789s())));
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
