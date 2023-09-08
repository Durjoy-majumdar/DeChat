package e71;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiCaptureUI;
import di3.C86312j;
import gy3.C87412m;
import nd3.C88930e;
import nj3.C76879j;
import p447aw.C103918d;
import sx3.C110823p;

/* renamed from: e71.c */
public final class C97604c implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ EmojiCaptureUI f286334a;

    /* renamed from: e71.c$a */
    public static final class C97605a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiCaptureUI f286335d;

        public C97605a(EmojiCaptureUI emojiCaptureUI) {
            this.f286335d = emojiCaptureUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C87412m.m108594g(dialogInterface, "dialog");
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f286335d.getContext());
        }
    }

    /* renamed from: e71.c$b */
    public static final class C97606b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiCaptureUI f286336d;

        public C97606b(EmojiCaptureUI emojiCaptureUI) {
            this.f286336d = emojiCaptureUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C87412m.m108594g(dialogInterface, "dialog");
            dialogInterface.dismiss();
            this.f286336d.finish();
        }
    }

    public C97604c(EmojiCaptureUI emojiCaptureUI) {
        this.f286334a = emojiCaptureUI;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        C87412m.m108593f(iArr, "grantResults");
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                z = false;
                break;
            }
            if (iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (z) {
            Integer G = C110823p.m150981G(iArr, 0);
            int i3 = (G != null && G.intValue() == 0) ? C0966R.string.f361130hi2 : C0966R.string.hhq;
            AppCompatActivity context = this.f286334a.getContext();
            EmojiCaptureUI emojiCaptureUI = this.f286334a;
            C76879j.m92740k(context, i3, C0966R.string.hif, C0966R.string.fyd, C0966R.string.f7926wf, false, new C97605a(emojiCaptureUI), new C97606b(emojiCaptureUI));
        }
    }
}
