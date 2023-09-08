package ow1;

import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: ow1.z */
public class C100590z implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ SmartGalleryUI f294728d;

    public C100590z(SmartGalleryUI smartGalleryUI) {
        this.f294728d = smartGalleryUI;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (3 != i) {
            return false;
        }
        String charSequence = textView.getText().toString();
        if (Util.isNullOrNil(charSequence)) {
            return false;
        }
        SmartGalleryUI.m118867H7(this.f294728d, charSequence, true);
        return true;
    }
}
