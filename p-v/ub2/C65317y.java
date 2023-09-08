package ub2;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentFooter;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import qn3.C77382c;

/* renamed from: ub2.y */
public final class C65317y implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ MusicMvCommentFooter f187990a;

    public C65317y(MusicMvCommentFooter musicMvCommentFooter) {
        this.f187990a = musicMvCommentFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
        MMEditText mMEditText = this.f187990a.f163528d;
        Editable text = mMEditText != null ? mMEditText.getText() : null;
        if (!(text == null || text.length() == 0)) {
            MusicMvCommentFooter musicMvCommentFooter = this.f187990a;
            C77382c b = C77382c.m93286b(musicMvCommentFooter.f163528d);
            b.f225611e = 0;
            b.f225610d = 80;
            b.f225607a = true;
            b.mo107499d(new C65318z(musicMvCommentFooter));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f187990a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64627b(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 != 0) goto L_0x0017
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter r0 = r2.f187990a
            com.tencent.mm.ui.widget.MMEditText r1 = r0.f163528d
            if (r1 == 0) goto L_0x0017
            android.content.Context r0 = r0.getContext()
            java.lang.CharSequence r3 = vl3.C102226d.m134696a(r0, r3)
            r1.append(r3)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ub2.C65317y.mo64627b(java.lang.String):void");
    }

    /* renamed from: c */
    public void mo64628c() {
        InputConnection inputConnection;
        MMEditText mMEditText = this.f187990a.f163528d;
        if (mMEditText != null && (inputConnection = mMEditText.getInputConnection()) != null) {
            inputConnection.sendKeyEvent(new KeyEvent(0, 67));
            inputConnection.sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
