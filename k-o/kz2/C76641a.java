package kz2;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import az2.C39674e;
import b03.C39696f;
import b03.C39718p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import p158gt.C76057w;
import p158gt.C8451i;
import qy2.C77448f0;
import rx3.C13598b0;
import rx3.C13603j;
import rz2.C48201c;

/* renamed from: kz2.a */
public final class C76641a {

    /* renamed from: a */
    public static final C76641a f224261a = new C76641a();

    /* renamed from: kz2.a$a */
    public interface C76642a {
        /* renamed from: a */
        void mo106921a();
    }

    /* renamed from: kz2.a$b */
    public static final class C76643b extends C87413o implements C32224a<Object> {

        /* renamed from: d */
        public final /* synthetic */ String f224262d;

        /* renamed from: e */
        public final /* synthetic */ String f224263e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f224264f;

        /* renamed from: g */
        public final /* synthetic */ C48201c f224265g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference<Context> f224266h;

        /* renamed from: i */
        public final /* synthetic */ C76642a f224267i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76643b(String str, String str2, ImageView imageView, C48201c cVar, WeakReference<Context> weakReference, C76642a aVar) {
            super(0);
            this.f224262d = str;
            this.f224263e = str2;
            this.f224264f = imageView;
            this.f224265g = cVar;
            this.f224266h = weakReference;
            this.f224267i = aVar;
        }

        public final Object invoke() {
            Bitmap b = C76658g.m92308b(this.f224262d);
            ((C8451i) C86312j.m106911c(C8451i.class)).mo9376xq(this.f224263e, b);
            ImageView imageView = this.f224264f;
            boolean B0 = this.f224265g.mo72933B0();
            Context context = this.f224266h.get();
            if (b != null) {
                imageView.post(new C76656f(B0, b, imageView));
            }
            C76642a aVar = this.f224267i;
            if (aVar == null) {
                return null;
            }
            aVar.mo106921a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kz2.a$c */
    public static final class C76644c implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ long f224268a;

        /* renamed from: b */
        public final /* synthetic */ String f224269b;

        /* renamed from: c */
        public final /* synthetic */ String f224270c;

        /* renamed from: d */
        public final /* synthetic */ String f224271d;

        /* renamed from: e */
        public final /* synthetic */ String f224272e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f224273f;

        /* renamed from: g */
        public final /* synthetic */ int f224274g;

        /* renamed from: h */
        public final /* synthetic */ C48201c f224275h;

        /* renamed from: i */
        public final /* synthetic */ WeakReference<Context> f224276i;

        /* renamed from: j */
        public final /* synthetic */ C76642a f224277j;

        /* renamed from: kz2.a$c$a */
        public static final class C76645a extends C87413o implements C32224a<Object> {

            /* renamed from: d */
            public final /* synthetic */ long f224278d;

            /* renamed from: e */
            public final /* synthetic */ String f224279e;

            /* renamed from: f */
            public final /* synthetic */ String f224280f;

            /* renamed from: g */
            public final /* synthetic */ String f224281g;

            /* renamed from: h */
            public final /* synthetic */ Bitmap f224282h;

            /* renamed from: i */
            public final /* synthetic */ String f224283i;

            /* renamed from: j */
            public final /* synthetic */ ImageView f224284j;

            /* renamed from: n */
            public final /* synthetic */ int f224285n;

            /* renamed from: o */
            public final /* synthetic */ C48201c f224286o;

            /* renamed from: p */
            public final /* synthetic */ WeakReference<Context> f224287p;

            /* renamed from: q */
            public final /* synthetic */ C76642a f224288q;

            /* renamed from: kz2.a$c$a$a */
            public static final class C76646a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ImageView f224289d;

                /* renamed from: e */
                public final /* synthetic */ int f224290e;

                /* renamed from: f */
                public final /* synthetic */ Bitmap f224291f;

                /* renamed from: g */
                public final /* synthetic */ C48201c f224292g;

                /* renamed from: h */
                public final /* synthetic */ WeakReference<Context> f224293h;

                /* renamed from: i */
                public final /* synthetic */ C76642a f224294i;

                public C76646a(ImageView imageView, int i, Bitmap bitmap, C48201c cVar, WeakReference<Context> weakReference, C76642a aVar) {
                    this.f224289d = imageView;
                    this.f224290e = i;
                    this.f224291f = bitmap;
                    this.f224292g = cVar;
                    this.f224293h = weakReference;
                    this.f224294i = aVar;
                }

                public final void run() {
                    if (C87412m.m108589b(this.f224289d.getTag(C0966R.C0970id.c_i), Integer.valueOf(this.f224290e))) {
                        ImageView imageView = this.f224289d;
                        Bitmap bitmap = this.f224291f;
                        boolean B0 = this.f224292g.mo72933B0();
                        Context context = this.f224293h.get();
                        if (bitmap != null) {
                            imageView.post(new C76656f(B0, bitmap, imageView));
                        }
                        C76642a aVar = this.f224294i;
                        if (aVar != null) {
                            aVar.mo106921a();
                        }
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C76645a(long j, String str, String str2, String str3, Bitmap bitmap, String str4, ImageView imageView, int i, C48201c cVar, WeakReference<Context> weakReference, C76642a aVar) {
                super(0);
                this.f224278d = j;
                this.f224279e = str;
                this.f224280f = str2;
                this.f224281g = str3;
                this.f224282h = bitmap;
                this.f224283i = str4;
                this.f224284j = imageView;
                this.f224285n = i;
                this.f224286o = cVar;
                this.f224287p = weakReference;
                this.f224288q = aVar;
            }

            public final Object invoke() {
                Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "handleImgUrl update " + (System.currentTimeMillis() - this.f224278d) + ' ' + this.f224279e + ' ' + this.f224280f);
                C48201c kD = C39674e.f106452d.mo62255t0().mo72970kD(this.f224281g);
                if (kD != null) {
                    String str = this.f224279e;
                    Bitmap bitmap = this.f224282h;
                    String str2 = this.f224280f;
                    String str3 = this.f224283i;
                    ImageView imageView = this.f224284j;
                    int i = this.f224285n;
                    C48201c cVar = this.f224286o;
                    WeakReference<Context> weakReference = this.f224287p;
                    C76642a aVar = this.f224288q;
                    if (Util.isEqual(str, kD.field_StatusID)) {
                        C76658g.m92309c(bitmap, str2);
                        Bitmap b = C76658g.m92308b(str2);
                        ((C8451i) C86312j.m106911c(C8451i.class)).mo9376xq(str3, b);
                        return Boolean.valueOf(imageView.post(new C76646a(imageView, i, b, cVar, weakReference, aVar)));
                    }
                    Log.m105920e("MicroMsg.TextStatus.StatusImgHandler", "handleImgUrl getLatest:" + kD.field_StatusID);
                    return C13598b0.f38549a;
                }
                Log.m105920e("MicroMsg.TextStatus.StatusImgHandler", "handleImgUrl TextStatus is null");
                return C13598b0.f38549a;
            }
        }

        public C76644c(long j, String str, String str2, String str3, String str4, ImageView imageView, int i, C48201c cVar, WeakReference<Context> weakReference, C76642a aVar) {
            this.f224268a = j;
            this.f224269b = str;
            this.f224270c = str2;
            this.f224271d = str3;
            this.f224272e = str4;
            this.f224273f = imageView;
            this.f224274g = i;
            this.f224275h = cVar;
            this.f224276i = weakReference;
            this.f224277j = aVar;
        }

        /* renamed from: a */
        public final void mo25933a(String str, Bitmap bitmap, String str2) {
            if (bitmap != null) {
                C76658g.m92307a(new C76645a(this.f224268a, this.f224269b, this.f224270c, this.f224271d, bitmap, this.f224272e, this.f224273f, this.f224274g, this.f224275h, this.f224276i, this.f224277j));
            }
        }
    }

    /* renamed from: kz2.a$d */
    public static final class C76647d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f224295d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f224296e;

        /* renamed from: f */
        public final /* synthetic */ C48201c f224297f;

        /* renamed from: g */
        public final /* synthetic */ WeakReference<Context> f224298g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76647d(String str, ImageView imageView, C48201c cVar, WeakReference<Context> weakReference) {
            super(0);
            this.f224295d = str;
            this.f224296e = imageView;
            this.f224297f = cVar;
            this.f224298g = weakReference;
        }

        public Object invoke() {
            Bitmap b = C76658g.m92308b(this.f224295d);
            ImageView imageView = this.f224296e;
            boolean B0 = this.f224297f.mo72933B0();
            Context context = this.f224298g.get();
            if (b != null) {
                imageView.post(new C76656f(B0, b, imageView));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kz2.a$e */
    public static final class C76648e implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ String f224299a;

        /* renamed from: b */
        public final /* synthetic */ String f224300b;

        /* renamed from: c */
        public final /* synthetic */ String f224301c;

        /* renamed from: d */
        public final /* synthetic */ String f224302d;

        /* renamed from: kz2.a$e$a */
        public static final class C76649a extends C87413o implements C32224a<Object> {

            /* renamed from: d */
            public final /* synthetic */ String f224303d;

            /* renamed from: e */
            public final /* synthetic */ String f224304e;

            /* renamed from: f */
            public final /* synthetic */ String f224305f;

            /* renamed from: g */
            public final /* synthetic */ Bitmap f224306g;

            /* renamed from: h */
            public final /* synthetic */ String f224307h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C76649a(String str, String str2, String str3, Bitmap bitmap, String str4) {
                super(0);
                this.f224303d = str;
                this.f224304e = str2;
                this.f224305f = str3;
                this.f224306g = bitmap;
                this.f224307h = str4;
            }

            public final Object invoke() {
                Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb update " + this.f224303d + ' ' + this.f224304e);
                C48201c kD = C39674e.f106452d.mo62255t0().mo72970kD(this.f224305f);
                if (kD != null) {
                    String str = this.f224303d;
                    String str2 = this.f224304e;
                    Bitmap bitmap = this.f224306g;
                    String str3 = this.f224307h;
                    if (Util.isEqual(str, kD.field_StatusID)) {
                        Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb update " + str2 + ' ' + str);
                        C76658g.m92309c(bitmap, str2);
                        ((C8451i) C86312j.m106911c(C8451i.class)).mo9376xq(str3, C76658g.m92308b(str2));
                    } else {
                        Log.m105920e("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb getLatest:" + kD.field_StatusID);
                    }
                    return C13598b0.f38549a;
                }
                Log.m105920e("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb TextStatus is null");
                return C13598b0.f38549a;
            }
        }

        public C76648e(String str, String str2, String str3, String str4) {
            this.f224299a = str;
            this.f224300b = str2;
            this.f224301c = str3;
            this.f224302d = str4;
        }

        /* renamed from: a */
        public final void mo25933a(String str, Bitmap bitmap, String str2) {
            if (bitmap != null) {
                C76658g.m92307a(new C76649a(this.f224299a, this.f224300b, this.f224301c, bitmap, this.f224302d));
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m92297b(C76641a aVar, Context context, ImageView imageView, String str, C48201c cVar, String str2, String str3, C76642a aVar2, int i, boolean z, int i2, Object obj) {
        int i3 = i2;
        aVar.mo106917a(context, imageView, str, cVar, str2, str3, (i3 & 64) != 0 ? null : aVar2, i, (i3 & 256) != 0 ? true : z);
    }

    /* renamed from: a */
    public final void mo106917a(Context context, ImageView imageView, String str, C48201c cVar, String str2, String str3, C76642a aVar, int i, boolean z) {
        Context context2 = context;
        ImageView imageView2 = imageView;
        C48201c cVar2 = cVar;
        String str4 = str2;
        String str5 = str3;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(imageView2, "iv");
        C87412m.m108594g(str, "username");
        C87412m.m108594g(cVar2, "info");
        C87412m.m108594g(str5, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        WeakReference weakReference = new WeakReference(context2);
        if (!Util.isNullOrNil(str2)) {
            Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(str4);
            if (bitmap != null) {
                boolean B0 = cVar.mo72933B0();
                Context context3 = (Context) weakReference.get();
                imageView2.post(new C76656f(B0, bitmap, imageView2));
                if (aVar != null) {
                    aVar.mo106921a();
                }
            } else if (C86013q1.m106450k(str3)) {
                C76658g.m92307a(new C76643b(str3, str2, imageView, cVar, weakReference, aVar));
            } else {
                if (z) {
                    mo106918c(imageView2, cVar2);
                }
                String str6 = cVar2.field_StatusID;
                ((C76057w) C86312j.m106911c(C76057w.class)).h60(str4, new C76644c(System.currentTimeMillis(), str6, str3, str, str2, imageView, i, cVar, weakReference, aVar));
            }
        } else {
            if (!Util.isNullOrNil(cVar2.field_backgroundId)) {
                mo106918c(imageView2, cVar2);
            } else if (C86013q1.m106450k(str3)) {
                C76658g.m92307a(new C76647d(str5, imageView2, cVar2, weakReference));
            } else {
                mo106918c(imageView2, cVar2);
            }
            if (aVar != null) {
                aVar.mo106921a();
            }
        }
    }

    /* renamed from: c */
    public final void mo106918c(ImageView imageView, C48201c cVar) {
        if (!Util.isNullOrNil(cVar.field_backgroundId)) {
            imageView.setImageResource(C39718p.f106569a.mo62351b(cVar.field_backgroundId));
        } else if (imageView.getDrawable() == null) {
            imageView.setImageResource(C39718p.f106569a.mo62351b(cVar.field_backgroundId));
        }
    }

    /* renamed from: d */
    public final void mo106919d(Context context, String str, ImageView imageView, boolean z) {
        String str2 = str;
        ImageView imageView2 = imageView;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str2, "username");
        C87412m.m108594g(imageView2, "iv");
        C48201c n0 = C39674e.f106452d.mo62253n0(str2);
        if (n0 != null) {
            int hashCode = n0.hashCode();
            imageView2.setTag(C0966R.C0970id.c_i, Integer.valueOf(hashCode));
            if (z) {
                m92297b(this, context, imageView, str, n0, n0.field_MediaThumbUrl, C39696f.f106501a.mo62321d("thumb", str2), (C76642a) null, hashCode, false, 256, (Object) null);
                return;
            }
            String str3 = n0.field_MediaType == 2 ? "" : n0.field_MediaUrl;
            C39696f fVar = C39696f.f106501a;
            String d = fVar.mo62321d("image", str2);
            if (!TextUtils.isEmpty(str3)) {
                Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(str3);
                if (bitmap != null) {
                    imageView2.post(new C76656f(n0.mo72933B0(), bitmap, imageView2));
                    return;
                } else if (C86013q1.m106450k(d)) {
                    C76658g.m92307a(new C76650b(d, str3, imageView, n0, context));
                    return;
                }
            }
            C76651c cVar = TextUtils.isEmpty(str3) ? null : new C76651c(context, imageView, str, n0, str3, d, hashCode);
            String str4 = n0.field_MediaThumbUrl;
            String d2 = fVar.mo62321d("thumb", str2);
            Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "begin download thumb");
            m92297b(this, context, imageView, str, n0, str4, d2, cVar, hashCode, false, 256, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo106920e(String str, C48201c cVar) {
        String str2;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(cVar, "info");
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_text_status_pic_preload_strategy_and, 1);
        if (Qe == 2) {
            Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "do not triggerDownloadThumb");
            return;
        }
        boolean z = (Qe == 0 && cVar.field_MediaType == 1) ? false : true;
        if (z) {
            str2 = cVar.field_MediaThumbUrl;
        } else if (!z) {
            str2 = cVar.field_MediaUrl;
        } else {
            throw new C13603j();
        }
        Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "trigger info: " + Qe + ", " + z);
        if (!Util.isNullOrNil(str2) && ((C8451i) C86312j.m106911c(C8451i.class)).get(str2) == null) {
            String d = C39696f.f106501a.mo62321d(z ? "thumb" : "image", str);
            if (!C86013q1.m106450k(d)) {
                String str3 = cVar.field_StatusID;
                Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb start " + d + ' ' + str3);
                ((C76057w) C86312j.m106911c(C76057w.class)).h60(str2, new C76648e(str3, d, str, str2));
            }
        }
    }
}
