package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.sns.p106ui.SnsEditText;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import pl3.C100823c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsUploadV2EditText;", "Lcom/tencent/mm/plugin/sns/ui/SnsEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText */
public final class SnsUploadV2EditText extends SnsEditText {
    public SnsUploadV2EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.m105924i("MicroMsg.SnsUploadV2EditText", "init: manual add emoji watcher");
        C100823c.f295336a.mo140273b(this, 1);
    }

    /* renamed from: o */
    public void mo98046o(String str) {
        SnsMethodCalculate.markStartTimeMs("insetText", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText");
        getEditableText().insert(getSelectionStart(), str);
        SnsMethodCalculate.markEndTimeMs("insetText", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText");
    }
}
