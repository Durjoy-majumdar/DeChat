package wq3;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: wq3.c */
public final class C111841c {

    /* renamed from: a */
    public static final C111842a f334881a = new C111842a((C8480h) null);

    /* renamed from: wq3.c$a */
    public static final class C111842a {
        public C111842a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo163582a(Context context, View view, String str, int i) {
            C87412m.m108594g(context, "ctx");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(str, "name");
            if (view instanceof WeImageView) {
                ((WeImageView) view).setIconColor(i);
            } else if (view instanceof WeImageButton) {
                ((WeImageButton) view).setIconColor(i);
            }
        }
    }
}
