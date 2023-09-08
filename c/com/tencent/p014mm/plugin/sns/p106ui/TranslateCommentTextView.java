package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ui.TranslateCommentTextView */
public class TranslateCommentTextView extends LinearLayout {

    /* renamed from: d */
    public MaskTextView f279064d;

    /* renamed from: e */
    public SnsTranslateResultView f279065e;

    public TranslateCommentTextView(Context context) {
        super(context);
        mo133137b();
    }

    /* renamed from: a */
    public void mo133136a(C94965w1.C94967b bVar, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        String charSequence = this.f279064d.getText().toString();
        if (!Util.isNullOrNil(charSequence)) {
            String[] split = charSequence.split(XVFSFile.PATH_SEPARATOR);
            if (split.length > 2) {
                String str3 = split[0];
                split = new String[]{str3, charSequence.substring(str3.length() + 1)};
            }
            if (split.length == 2) {
                if (!Util.isNullOrNil(str)) {
                    SnsTranslateResultView snsTranslateResultView = this.f279065e;
                    snsTranslateResultView.mo133013a(bVar, 2, split[0] + ": " + str, str2, bVar.f275309g);
                } else {
                    this.f279065e.mo133013a(bVar, 2, (String) null, str2, bVar.f275309g);
                }
                this.f279065e.setVisibility(0);
            }
            this.f279064d.setTextSize(1, C76577a.m92165p(getContext()) * 15.0f);
        }
        SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
    }

    /* renamed from: b */
    public final void mo133137b() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c_c, this);
        this.f279064d = (MaskTextView) findViewById(C0966R.C0970id.bk6);
        SnsTranslateResultView snsTranslateResultView = (SnsTranslateResultView) findViewById(C0966R.C0970id.jwu);
        this.f279065e = snsTranslateResultView;
        snsTranslateResultView.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
    }

    /* renamed from: c */
    public void mo133138c() {
        SnsMethodCalculate.markStartTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        this.f279064d.setTextSize(1, C76577a.m92165p(getContext()) * 15.0f);
        this.f279065e.mo133019j(2);
        this.f279065e.setVisibility(0);
        SnsMethodCalculate.markEndTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
    }

    public TextView getOriginCommentTextView() {
        SnsMethodCalculate.markStartTimeMs("getOriginCommentTextView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        MaskTextView maskTextView = this.f279064d;
        SnsMethodCalculate.markEndTimeMs("getOriginCommentTextView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        return maskTextView;
    }

    public SnsTranslateResultView getTranslateResultView() {
        SnsMethodCalculate.markStartTimeMs("getTranslateResultView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        SnsTranslateResultView snsTranslateResultView = this.f279065e;
        SnsMethodCalculate.markEndTimeMs("getTranslateResultView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        return snsTranslateResultView;
    }

    public TranslateCommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo133137b();
    }
}
