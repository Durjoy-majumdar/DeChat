package k60;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import fy3.C32227p;
import gy3.C87412m;
import l60.C99342a;
import l60.C99344b;
import n60.C100074e;
import n60.C100075f;
import r60.C101350i;
import rx3.C13598b0;
import s60.C101535a;
import s60.C101536b;
import s60.C101539c;
import x60.C102564a;
import x60.C102565b;

/* renamed from: k60.a */
public class C99099a extends C60979d<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99099a(C100074e<String, Bitmap> eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "configuration");
    }

    /* renamed from: b */
    public C99344b mo85956b(Object obj, C100075f fVar) {
        String str = (String) obj;
        C87412m.m108594g(str, "url");
        C87412m.m108594g(fVar, "options");
        C99342a aVar = new C99342a(new C102564a(str), this.f173682a);
        if (fVar.f293174l) {
            C101539c cVar = new C101539c(true, 0.5f);
            cVar.f297267c = C101536b.C101538b.DECODED;
            aVar.mo138759g(new C101535a(cVar));
        }
        aVar.f291319c = fVar;
        return aVar;
    }

    /* renamed from: d */
    public C99342a mo85958d(Object obj, C100075f fVar) {
        String str = (String) obj;
        C87412m.m108594g(str, "url");
        C87412m.m108594g(fVar, "options");
        C99342a aVar = new C99342a(new C102564a(str), this.f173682a);
        if (fVar.f293174l) {
            C101539c cVar = new C101539c(true, 0.5f);
            cVar.f297267c = C101536b.C101538b.DECODED;
            aVar.mo138759g(new C101535a(cVar));
        }
        aVar.f291319c = fVar;
        return aVar;
    }

    /* renamed from: e */
    public C99344b<String, Bitmap> mo85955a(String str) {
        C87412m.m108594g(str, "url");
        return new C99342a(new C102564a(str), this.f173682a);
    }

    /* renamed from: f */
    public void mo85957c(String str, ImageView imageView, C100075f fVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(fVar, "options");
        C99342a aVar = new C99342a(new C102564a(str), this.f173682a);
        if (fVar.f293174l) {
            C101539c cVar = new C101539c(true, 0.5f);
            cVar.f297267c = C101536b.C101538b.DECODED;
            aVar.mo138759g(new C101535a(cVar));
        }
        aVar.f291319c = fVar;
        aVar.mo85954d(imageView);
    }

    /* renamed from: g */
    public final C99344b<String, Bitmap> mo138472g(String str) {
        C87412m.m108594g(str, "assertPath");
        return new C99342a(new C102564a(str, C102565b.ASSET_DATA), this.f173682a);
    }

    /* renamed from: h */
    public final void mo138473h(String str, ImageView imageView, C100075f fVar, C32227p<? super C101350i<?>, ? super Bitmap, C13598b0> pVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(fVar, "options");
        C99342a aVar = new C99342a(new C102564a(str), this.f173682a);
        if (fVar.f293174l) {
            C101539c cVar = new C101539c(true, 0.5f);
            cVar.f297267c = C101536b.C101538b.DECODED;
            aVar.mo138759g(new C101535a(cVar));
        }
        aVar.f291319c = fVar;
        aVar.mo138753h(imageView, pVar);
    }

    /* renamed from: i */
    public C99344b<String, Bitmap> mo138474i(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        return new C99342a(new C102564a(str, C102565b.LOCAL_PATH), this.f173682a);
    }
}
