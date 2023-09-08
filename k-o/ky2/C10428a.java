package ky2;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import eb0.C75592q0;
import my2.C34686a;

/* renamed from: ky2.a */
public abstract class C10428a {

    /* renamed from: ky2.a$a */
    public static class C10429a {

        /* renamed from: a */
        public C68070l.C68072b f31647a;

        /* renamed from: b */
        public String f31648b;

        /* renamed from: c */
        public long f31649c;

        /* renamed from: d */
        public C34686a f31650d;

        /* renamed from: e */
        public String f31651e;

        /* renamed from: f */
        public String f31652f;

        /* renamed from: g */
        public TextView f31653g;

        /* renamed from: h */
        public TextView f31654h;

        /* renamed from: i */
        public LinearLayout f31655i;

        /* renamed from: j */
        public ImageView f31656j;

        /* renamed from: k */
        public ImageView f31657k;

        /* renamed from: l */
        public TextView f31658l;

        /* renamed from: m */
        public WeImageView f31659m;

        /* renamed from: a */
        public boolean mo10733a() {
            return C75592q0.m90789s().equals(this.f31651e);
        }
    }

    /* renamed from: ky2.a$b */
    public enum C10430b {
        BEFORE_AGREE,
        REQUEST_INVALID,
        AUTHORIZED,
        AUTH_EXPIRED
    }

    /* renamed from: d */
    public abstract String mo10175d(Context context);

    /* renamed from: q */
    public abstract void mo10176q(Context context, C10430b bVar, C10429a aVar);
}
