package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49670h80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.g */
public class C41064g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ long f110584d;

    /* renamed from: e */
    public final /* synthetic */ C49670h80 f110585e;

    /* renamed from: f */
    public final /* synthetic */ CustomSmileyPreviewUI f110586f;

    public C41064g(CustomSmileyPreviewUI customSmileyPreviewUI, long j, C49670h80 h802) {
        this.f110586f = customSmileyPreviewUI;
        this.f110584d = j;
        this.f110585e = h802;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C49670h80 h802 = this.f110585e;
        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "onClick: %s, %s, %s", Long.valueOf(this.f110584d), h802.f134491e, Integer.valueOf(h802.f134492f));
        this.f110586f.f268314H = true;
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", this.f110584d);
        intent.putExtra("feed_object_nonceId", this.f110585e.f134491e);
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", ((long) this.f110585e.f134492f) * 1000);
        intent.putExtra("KEY_VIDEO_SEEK_MODE", 2);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76864nr(this.f110586f, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
