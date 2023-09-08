package fx0;

import android.content.Context;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import java.util.List;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99670g;
import p196ln.C76705f;

/* renamed from: fx0.j */
public class C45829j {

    /* renamed from: a */
    public static final /* synthetic */ int f123738a = 0;

    /* renamed from: fx0.j$a */
    public static class C45830a {

        /* renamed from: a */
        public ImageView f123739a;
    }

    static {
        new MMHandler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static void m51128a(ImageView imageView, C72996z1 z1Var, String str, boolean z) {
        if (z || !z1Var.mo62927s3()) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.C0969drawable.be5;
            bVar.f59347c = true;
            bVar.f59364t = true;
            C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
            return;
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(imageView, z1Var.getUsername());
    }

    /* renamed from: b */
    public static boolean m51129b(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return false;
        }
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
        return true;
    }

    /* renamed from: c */
    public static Spanned m51130c(Context context, String str, List<String> list, int i) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (context == null || list == null) {
            return new SpannableString(str);
        }
        C99670g e = C99254i.m129308e(C99667f.m130088a(str, Util.listToString(list, " "), false, false));
        CharSequence charSequence = e.f292107a;
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(e.f292107a);
    }
}
