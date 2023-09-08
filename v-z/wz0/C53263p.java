package wz0;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C76251l;
import ic0.C21070h;
import jc0.C21210b;

/* renamed from: wz0.p */
public class C53263p {

    /* renamed from: wz0.p$a */
    public class C53264a implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ ImageView f148596a;

        /* renamed from: b */
        public final /* synthetic */ int f148597b;

        /* renamed from: c */
        public final /* synthetic */ Context f148598c;

        /* renamed from: d */
        public final /* synthetic */ int f148599d;

        /* renamed from: wz0.p$a$a */
        public class C53265a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f148600d;

            public C53265a(Bitmap bitmap) {
                this.f148600d = bitmap;
            }

            public void run() {
                C53264a.this.f148596a.setImageBitmap(this.f148600d);
                C53264a aVar = C53264a.this;
                aVar.f148596a.setColorFilter(aVar.f148597b, PorterDuff.Mode.SRC_IN);
            }
        }

        public C53264a(ImageView imageView, int i, Context context, int i2) {
            this.f148596a = imageView;
            this.f148597b = i;
            this.f148598c = context;
            this.f148599d = i2;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Bitmap bitmap = bVar.f59988d;
            if (bitmap != null) {
                MMHandlerThread.postToMainThread(new C53265a(bitmap));
            } else {
                C53263p.m59703d(this.f148598c, this.f148596a, this.f148599d, this.f148597b);
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: wz0.p$b */
    public class C53266b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImageView f148602d;

        /* renamed from: e */
        public final /* synthetic */ int f148603e;

        /* renamed from: f */
        public final /* synthetic */ int f148604f;

        public C53266b(ImageView imageView, int i, int i2) {
            this.f148602d = imageView;
            this.f148603e = i;
            this.f148604f = i2;
        }

        public void run() {
            this.f148602d.setImageResource(this.f148603e);
            this.f148602d.setColorFilter(this.f148604f, PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: a */
    public static String m59700a(int i, String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CardViewUtil", "toApply is null");
            return "";
        } else if (i <= 0) {
            Log.m105920e("MicroMsg.CardViewUtil", "unitSpace is 0");
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < str.length()) {
                sb.append(str.charAt(i2));
                i2++;
                if (i2 % i == 0) {
                    if (z) {
                        sb.append(" ");
                    } else if (i2 != str.length()) {
                        sb.append("-");
                    }
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: b */
    public static void m59701b(ImageView imageView, String str, int i, int i2, boolean z) {
        if (imageView != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C112760b.m154195C();
                bVar.f59350f = C76251l.m91644m(str);
                bVar.f59346b = true;
                bVar.f59364t = z;
                bVar.f59345a = true;
                bVar.f59355k = i;
                bVar.f59354j = i;
                bVar.f59359o = i2;
                C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
                return;
            }
            imageView.setImageResource(i2);
        }
    }

    /* renamed from: c */
    public static void m59702c(Context context, ImageView imageView, String str, int i, int i2, boolean z, int i3) {
        if (imageView != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C112760b.m154195C();
                bVar.f59350f = C76251l.m91644m(str);
                bVar.f59346b = true;
                bVar.f59364t = z;
                bVar.f59345a = true;
                bVar.f59355k = i;
                bVar.f59354j = i;
                bVar.f59359o = i2;
                C20828a.m22825b().mo32520i(str, imageView, bVar.mo32666a(), new C53264a(imageView, i3, context, i2));
                return;
            }
            m59703d(context, imageView, i2, i3);
        }
    }

    /* renamed from: d */
    public static void m59703d(Context context, ImageView imageView, int i, int i2) {
        MMHandlerThread.postToMainThread(new C53266b(imageView, i, i2));
    }

    /* renamed from: e */
    public static void m59704e(TextView textView, int i) {
        switch (i) {
            case 0:
                textView.setText(C0966R.string.b1r);
                return;
            case 1:
                textView.setText(C0966R.string.b1m);
                return;
            case 2:
                textView.setText(C0966R.string.b1p);
                return;
            case 3:
                textView.setText(C0966R.string.b1o);
                return;
            case 4:
                textView.setText(C0966R.string.b1s);
                return;
            case 5:
                textView.setText(C0966R.string.b1t);
                return;
            case 6:
                textView.setText(C0966R.string.b1n);
                return;
            case 7:
                textView.setText(C0966R.string.b1q);
                return;
            default:
                return;
        }
    }
}
