package com.tencent.p014mm.p136ui.chatting;

import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$u */
public class AppAttachNewDownloadUI$$u {

    /* renamed from: a */
    public Button f56063a;

    /* renamed from: b */
    public TextView f56064b;

    /* renamed from: c */
    public boolean f56065c;

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56066d;

    public AppAttachNewDownloadUI$$u(AppAttachNewDownloadUI appAttachNewDownloadUI, Button button, TextView textView) {
        this.f56066d = appAttachNewDownloadUI;
        this.f56063a = button;
        this.f56064b = textView;
        if (textView != null) {
            if (((int) Math.floor((((double) (((long) ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MsgFileExpiredInterval", 432000)) - ((C31543z5.m39453c() / 1000) - (appAttachNewDownloadUI.f56038t.getCreateTime() / 1000)))) * 1.0d) / 86400.0d)) >= 1) {
                textView.setText("");
            } else {
                textView.setText("");
            }
        }
    }

    /* renamed from: a */
    public void mo26155a(int i) {
        Button button = this.f56063a;
        if (button != null) {
            button.setVisibility(i);
        }
        TextView textView = this.f56064b;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: b */
    public void mo26156b(boolean z) {
        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "showErrorTip overtime %s", Long.valueOf(this.f56066d.f56038t.getMsgId()));
        Button button = this.f56063a;
        if (button != null) {
            button.setVisibility(4);
        }
        TextView textView = this.f56064b;
        if (textView != null) {
            textView.setVisibility(0);
            if (z) {
                this.f56064b.setText(C0966R.string.cuy);
                this.f56066d.mo26136d8(17, -1);
            } else {
                this.f56064b.setText(C0966R.string.cuz);
            }
            this.f56064b.setTextColor(this.f56066d.getResources().getColor(C0966R.color.Red_120));
            if (!this.f56065c) {
                this.f56065c = true;
                this.f56066d.mo26136d8(8, 6);
            }
        }
    }
}
