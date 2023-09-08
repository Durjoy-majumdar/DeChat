package d51;

import android.widget.ImageView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/* renamed from: d51.c */
public class C7171c {
    /* renamed from: a */
    public static void m7371a(ImageView imageView, String str) {
        if (imageView != null && !Util.isNullOrNil(str)) {
            if (C85875k4.m106211z()) {
                str = str + "_dark";
            }
            imageView.setImageResource(imageView.getResources().getIdentifier(str, ShareConstants.DEXMODE_RAW, imageView.getContext().getPackageName()));
        }
    }
}
