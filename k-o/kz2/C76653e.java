package kz2;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p158gt.C76057w;
import p158gt.C8451i;
import rz2.C48201c;

/* renamed from: kz2.e */
public final class C76653e implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ String f224325a;

    /* renamed from: b */
    public final /* synthetic */ C48201c f224326b;

    /* renamed from: c */
    public final /* synthetic */ String f224327c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f224328d;

    /* renamed from: e */
    public final /* synthetic */ int f224329e;

    /* renamed from: f */
    public final /* synthetic */ Context f224330f;

    /* renamed from: kz2.e$a */
    public static final class C76654a extends C87413o implements C32224a<Object> {

        /* renamed from: d */
        public final /* synthetic */ String f224331d;

        /* renamed from: e */
        public final /* synthetic */ C48201c f224332e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f224333f;

        /* renamed from: g */
        public final /* synthetic */ String f224334g;

        /* renamed from: h */
        public final /* synthetic */ ImageView f224335h;

        /* renamed from: i */
        public final /* synthetic */ int f224336i;

        /* renamed from: j */
        public final /* synthetic */ Context f224337j;

        /* renamed from: kz2.e$a$a */
        public static final class C76655a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f224338d;

            /* renamed from: e */
            public final /* synthetic */ int f224339e;

            /* renamed from: f */
            public final /* synthetic */ Bitmap f224340f;

            /* renamed from: g */
            public final /* synthetic */ C48201c f224341g;

            /* renamed from: h */
            public final /* synthetic */ Context f224342h;

            public C76655a(ImageView imageView, int i, Bitmap bitmap, C48201c cVar, Context context) {
                this.f224338d = imageView;
                this.f224339e = i;
                this.f224340f = bitmap;
                this.f224341g = cVar;
                this.f224342h = context;
            }

            public final void run() {
                if (C87412m.m108589b(this.f224338d.getTag(C0966R.C0970id.c_i), Integer.valueOf(this.f224339e))) {
                    ImageView imageView = this.f224338d;
                    Bitmap bitmap = this.f224340f;
                    boolean B0 = this.f224341g.mo72933B0();
                    if (bitmap != null) {
                        imageView.post(new C76656f(B0, bitmap, imageView));
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76654a(String str, C48201c cVar, Bitmap bitmap, String str2, ImageView imageView, int i, Context context) {
            super(0);
            this.f224331d = str;
            this.f224332e = cVar;
            this.f224333f = bitmap;
            this.f224334g = str2;
            this.f224335h = imageView;
            this.f224336i = i;
            this.f224337j = context;
        }

        public final Object invoke() {
            Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "handleImgOnlyByUrl update " + this.f224331d + ' ' + this.f224332e.field_StatusID);
            C76658g.m92309c(this.f224333f, this.f224331d);
            ((C8451i) C86312j.m106911c(C8451i.class)).mo9376xq(this.f224334g, C76658g.m92308b(this.f224331d));
            ImageView imageView = this.f224335h;
            return Boolean.valueOf(imageView.post(new C76655a(imageView, this.f224336i, this.f224333f, this.f224332e, this.f224337j)));
        }
    }

    public C76653e(String str, C48201c cVar, String str2, ImageView imageView, int i, Context context) {
        this.f224325a = str;
        this.f224326b = cVar;
        this.f224327c = str2;
        this.f224328d = imageView;
        this.f224329e = i;
        this.f224330f = context;
    }

    /* renamed from: a */
    public final void mo25933a(String str, Bitmap bitmap, String str2) {
        if (bitmap != null) {
            C76658g.m92307a(new C76654a(this.f224325a, this.f224326b, bitmap, this.f224327c, this.f224328d, this.f224329e, this.f224330f));
        }
    }
}
