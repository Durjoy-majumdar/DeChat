package com.tencent.p014mm.p136ui.conversation;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import ob0.C11385n;
import ob0.C117747y;
import rb0.C47971i;
import rb0.C48009v0;
import te3.C51801w9;

/* renamed from: com.tencent.mm.ui.conversation.b0 */
public class C44953b0 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f121945d;

    public C44953b0(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f121945d = enterpriseConversationFmUI;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f121945d;
        if (enterpriseConversationFmUI.f121788f != null) {
            C48009v0.Ex0().mo72749jo(enterpriseConversationFmUI.f121793n);
            TextView textView = (TextView) enterpriseConversationFmUI.f121788f.findViewById(C0966R.C0970id.kpm);
            C47971i Ex0 = C48009v0.Ex0();
            C48009v0.Ex0();
            String Lo = Ex0.mo72743Lo(0);
            if (textView != null && Lo != null && Lo.length() > 0 && !textView.getText().equals(Lo)) {
                textView.setText(Lo);
            }
            int qq = C48009v0.Ex0().mo72751qq();
            if (!(textView == null || qq == 0)) {
                textView.setTextColor(qq);
            }
            CdnImageView cdnImageView = (CdnImageView) enterpriseConversationFmUI.f121788f.findViewById(C0966R.C0970id.f2a);
            C48009v0.Ex0().getClass();
            if (C47971i.f128677g == null) {
                C47971i.f128677g = new C51801w9();
            }
            String str2 = C47971i.f128677g.f143930g;
            if (cdnImageView != null && str2 != null && str2.length() > 0) {
                cdnImageView.setUrl(str2);
            }
        }
    }
}
