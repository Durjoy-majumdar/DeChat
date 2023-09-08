package com.tencent.p014mm.plugin.sns.cover.preview;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import pr2.C100844c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsInvalidView;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lpr2/c;", "info", "Lrx3/b0;", "loadCover", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "", "getLayoutId", "onResume", "onPause", "onDestroy", "getType", "", "folded", "Z", "getFolded", "()Z", "setFolded", "(Z)V", "", "TAG", "Ljava/lang/String;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView */
public final class SnsInvalidView extends AbsSnsBackPreview {
    private final String TAG = "MicroMsg.SnsCoverInvalidView";
    private boolean folded = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsInvalidView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public final boolean getFolded() {
        SnsMethodCalculate.markStartTimeMs("getFolded", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        boolean z = this.folded;
        SnsMethodCalculate.markEndTimeMs("getFolded", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        return z;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        return C0966R.C0971layout.c2u;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        return 5;
    }

    public void loadCover(C100844c cVar) {
        SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public void onPostClose() {
        SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        Log.m105924i(this.TAG, "[onPreClose]");
        this.folded = true;
        SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public void onPostOpen() {
        SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public void onPreClose() {
        SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public void onPreOpen() {
        SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        Log.m105924i(this.TAG, "[onPreOpen]");
        this.folded = false;
        SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }

    public final void setFolded(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFolded", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
        this.folded = z;
        SnsMethodCalculate.markEndTimeMs("setFolded", "com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView");
    }
}
