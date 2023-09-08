package com.tencent.p014mm.p136ui.chatting;

import android.widget.Button;
import android.widget.TextView;
import eb0.C31543z5;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i */
public class AppAttachDownloadUI$$i {

    /* renamed from: a */
    public Button f55960a;

    /* renamed from: b */
    public TextView f55961b;

    /* renamed from: c */
    public boolean f55962c;

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f55963d;

    public AppAttachDownloadUI$$i(AppAttachDownloadUI appAttachDownloadUI, Button button, TextView textView) {
        this.f55963d = appAttachDownloadUI;
        this.f55960a = button;
        this.f55961b = textView;
        if (textView != null) {
            if (((int) Math.floor((((double) (((long) ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MsgFileExpiredInterval", 432000)) - ((C31543z5.m39453c() / 1000) - (appAttachDownloadUI.f55946u.getCreateTime() / 1000)))) * 1.0d) / 86400.0d)) >= 1) {
                textView.setText("");
            } else {
                textView.setText("");
            }
        }
    }

    /* renamed from: a */
    public void mo26104a(int i) {
        Button button = this.f55960a;
        if (button != null) {
            button.setVisibility(i);
        }
        TextView textView = this.f55961b;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }
}
