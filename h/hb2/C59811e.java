package hb2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d03.C58010a;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import gc0.C20828a;
import gy3.C8480h;
import gy3.C87412m;
import hc0.C20937c;
import ic0.C21070h;
import java.util.LinkedList;
import java.util.List;
import jc0.C21210b;
import jq3.C9493c;
import ma2.C61453s;
import ma2.C61454t;
import ma2.C99819r;
import p143ds.C58433i;
import p232rw.C63679m;
import p501dz.C58464f;
import p851es.C58800a;
import sx3.C110818d0;
import te3.C64550mb1;

/* renamed from: hb2.e */
public final class C59811e implements C9493c {

    /* renamed from: p */
    public static final C59813b f170722p = new C59813b();

    /* renamed from: q */
    public static final Object f170723q = new Object();

    /* renamed from: d */
    public C61453s f170724d;

    /* renamed from: e */
    public int f170725e;

    /* renamed from: f */
    public int f170726f;

    /* renamed from: g */
    public int f170727g;

    /* renamed from: h */
    public boolean f170728h;

    /* renamed from: i */
    public boolean f170729i;

    /* renamed from: j */
    public C59819g f170730j;

    /* renamed from: n */
    public C59820h f170731n;

    /* renamed from: o */
    public C59811e f170732o;

    /* renamed from: hb2.e$a */
    public static final class C59812a implements C59819g {

        /* renamed from: a */
        public final String f170733a;

        /* renamed from: b */
        public final String f170734b;

        public C59812a(String str, String str2) {
            C87412m.m108594g(str, "thumbPath");
            C87412m.m108594g(str2, "videoPath");
            this.f170733a = str;
            this.f170734b = str2;
        }

        /* renamed from: a */
        public void mo84764a(ImageView imageView, C58800a aVar) {
            C87412m.m108594g(imageView, "thumbView");
            String str = this.f170733a;
            String str2 = this.f170734b;
            ((C58433i) C86312j.m106911c(C58433i.class)).mo83380o5(imageView, 2, str, str2, (long) str2.hashCode(), -1, aVar, 0);
        }
    }

    /* renamed from: hb2.e$b */
    public static final class C59813b {
        /* renamed from: a */
        public final void mo84765a(MusicMvTabFragment.C57119e eVar, C59811e eVar2) {
            C87412m.m108594g(eVar, "data");
            C87412m.m108594g(eVar2, "item");
            eVar2.f170727g = 2;
            FinderObject finderObject = eVar.f163649b;
            C87412m.m108591d(finderObject);
            eVar2.f170730j = new C59815d(finderObject);
            FinderObject finderObject2 = eVar.f163649b;
            C87412m.m108591d(finderObject2);
            eVar2.f170731n = new C59817e(finderObject2);
        }

        /* renamed from: b */
        public final C59811e mo84766b(C64550mb1 mb12, C61453s sVar, List<? extends FinderObject> list) {
            FinderObjectDesc finderObjectDesc;
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            C64550mb1 mb13 = mb12;
            C61453s sVar2 = sVar;
            C59811e eVar = new C59811e();
            if (sVar2 != null && sVar.mo86427b() > 1) {
                eVar.f170724d = sVar2;
            }
            long j = mb13.f184258d;
            eVar.f170725e = (int) j;
            eVar.f170726f = (int) (j + ((long) mb13.f184259e));
            for (FinderObject finderObject : list) {
                if (!(!C87412m.m108589b(finderObject.objectNonceId, mb13.f184261g) || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150917O(linkedList, 0)) == null)) {
                    if (mb13.f184260f != 0) {
                        eVar.f170730j = new C59815d(finderObject);
                        eVar.f170731n = new C59817e(finderObject);
                        eVar.f170727g = 2;
                    } else {
                        String str = finderMedia.url;
                        if (str == null) {
                            str = "";
                        }
                        eVar.f170730j = new C59812a("", str);
                        String str2 = finderObject.objectNonceId;
                        C87412m.m108591d(str2);
                        String str3 = finderMedia.url;
                        eVar.f170731n = new C59821i(str2, str3 == null ? "" : str3, (long) (finderMedia.videoDuration * 1000), (int) finderMedia.width, (int) finderMedia.height);
                        eVar.f170727g = 1;
                    }
                    C59820h hVar = eVar.f170731n;
                    if (hVar != null) {
                        hVar.mo84768a(mb13.f184262h);
                    }
                }
            }
            return eVar;
        }

        /* renamed from: c */
        public final void mo84767c(C59811e eVar, C59811e eVar2) {
            C87412m.m108594g(eVar, "item");
            C87412m.m108594g(eVar2, "newItem");
            eVar2.f170724d = eVar.f170724d;
            eVar2.f170725e = eVar.f170725e;
            eVar2.f170726f = eVar.f170726f;
            eVar2.f170728h = eVar.f170728h;
            eVar2.f170729i = eVar.f170729i;
        }
    }

    /* renamed from: hb2.e$c */
    public static final class C59814c implements C59819g {

        /* renamed from: a */
        public final C59809b f170735a;

        public C59814c(C59809b bVar) {
            C87412m.m108594g(bVar, "videoInfo");
            this.f170735a = bVar;
        }

        /* renamed from: a */
        public void mo84764a(ImageView imageView, C58800a aVar) {
            C87412m.m108594g(imageView, "thumbView");
            C59809b bVar = this.f170735a;
            ((C58433i) C86312j.m106911c(C58433i.class)).mo83380o5(imageView, 2, bVar.f170721e, bVar.mo84758a(), (long) this.f170735a.hashCode(), -1, aVar, 0);
        }
    }

    /* renamed from: hb2.e$d */
    public static final class C59815d implements C59819g {

        /* renamed from: a */
        public final FinderObject f170736a;

        /* renamed from: hb2.e$d$a */
        public static final class C59816a implements C21070h {

            /* renamed from: a */
            public final /* synthetic */ C58800a f170737a;

            public C59816a(C58800a aVar) {
                this.f170737a = aVar;
            }

            /* renamed from: a */
            public void mo6676a(String str, View view) {
            }

            /* renamed from: b */
            public void mo6677b(String str, View view, C21210b bVar) {
                C58800a aVar = this.f170737a;
                if (aVar != null) {
                    aVar.mo80484a();
                }
            }

            /* renamed from: c */
            public Bitmap mo6678c(String str, View view, C21210b bVar) {
                C87412m.m108591d(bVar);
                Bitmap bitmap = bVar.f59988d;
                C87412m.m108593f(bitmap, "imageData!!.bitmap");
                return bitmap;
            }
        }

        public C59815d(FinderObject finderObject) {
            C87412m.m108594g(finderObject, "finderObj");
            this.f170736a = finderObject;
        }

        /* renamed from: a */
        public void mo84764a(ImageView imageView, C58800a aVar) {
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            C87412m.m108594g(imageView, "thumbView");
            FinderObjectDesc finderObjectDesc = this.f170736a.objectDesc;
            if (finderObjectDesc != null && (linkedList = finderObjectDesc.media) != null && (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) != null) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                C61454t tVar = C61454t.f174766a;
                bVar.f59350f = tVar.mo86430b("thumb_" + this.f170736a.f164794id);
                bVar.f59346b = true;
                bVar.f59345a = true;
                C20828a.m22825b().mo32520i(finderMedia.thumbUrl + finderMedia.thumb_url_token, imageView, bVar.mo32666a(), new C59816a(aVar));
            }
        }
    }

    /* renamed from: hb2.e$e */
    public static final class C59817e implements C59820h {

        /* renamed from: a */
        public final FinderObject f170738a;

        /* renamed from: b */
        public long f170739b;

        /* renamed from: c */
        public long f170740c;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) sx3.C110818d0.m150916N((r5 = r5.media));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C59817e(com.tencent.p014mm.protocal.protobuf.FinderObject r5) {
            /*
                r4 = this;
                java.lang.String r0 = "finderObj"
                gy3.C87412m.m108594g(r5, r0)
                r4.<init>()
                r4.f170738a = r5
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
                if (r5 == 0) goto L_0x001d
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r5.media
                if (r5 == 0) goto L_0x001d
                java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
                com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
                if (r5 == 0) goto L_0x001d
                int r5 = r5.videoDuration
                goto L_0x001e
            L_0x001d:
                r5 = 0
            L_0x001e:
                long r0 = (long) r5
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 * r2
                r4.f170739b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hb2.C59811e.C59817e.<init>(com.tencent.mm.protocal.protobuf.FinderObject):void");
        }

        /* renamed from: a */
        public void mo84768a(long j) {
            this.f170740c = j;
        }

        /* renamed from: b */
        public FinderObject mo84769b() {
            return this.f170738a;
        }

        /* renamed from: c */
        public boolean mo84770c() {
            return false;
        }

        /* renamed from: d */
        public void mo84771d(long j) {
            this.f170739b = j;
        }

        /* renamed from: e */
        public long mo84772e() {
            return this.f170740c;
        }

        /* renamed from: f */
        public C58010a mo84773f() {
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            FinderObjectDesc finderObjectDesc = this.f170738a.objectDesc;
            if (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
                return null;
            }
            String str = "video_" + this.f170738a.f164794id;
            C61454t tVar = C61454t.f174766a;
            String c = tVar.mo86431c(str);
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            Bundle wv = ((C58464f) C86312j.m106911c(C58464f.class)).mo82804wv(context, (int) finderMedia.width, (int) finderMedia.height);
            wv.getInt("width", 0);
            wv.getInt("height", 0);
            String str2 = finderMedia.url;
            String str3 = "";
            C58010a aVar = new C58010a(str, c, str2 == null ? str3 : str2, (int) finderMedia.width, (int) finderMedia.height);
            aVar.f165929a = 2;
            aVar.f165930b = "xV2";
            String str4 = finderMedia.url_token;
            if (str4 != null) {
                str3 = str4;
            }
            aVar.f165931c = str3;
            aVar.f165932d = finderMedia.decodeKey;
            aVar.f165935g = ((long) finderMedia.videoDuration) * ((long) 1000);
            aVar.f165936h = finderMedia.thumbUrl + finderMedia.thumb_url_token;
            aVar.f165938j = tVar.mo86430b("thumb_" + this.f170738a.f164794id);
            return aVar;
        }

        public long getDurationMs() {
            return this.f170739b;
        }
    }

    /* renamed from: hb2.e$f */
    public static final class C59818f implements C59819g {

        /* renamed from: a */
        public final GalleryItem$MediaItem f170741a;

        public C59818f(GalleryItem$MediaItem galleryItem$MediaItem) {
            C87412m.m108594g(galleryItem$MediaItem, "mediaItem");
            this.f170741a = galleryItem$MediaItem;
        }

        /* renamed from: a */
        public void mo84764a(ImageView imageView, C58800a aVar) {
            C87412m.m108594g(imageView, "thumbView");
            int type = this.f170741a.getType();
            String e = this.f170741a.mo80159e();
            C87412m.m108593f(e, "mediaItem.thumbPath");
            String str = this.f170741a.f162747d;
            C87412m.m108593f(str, "mediaItem.originalPath");
            GalleryItem$MediaItem galleryItem$MediaItem = this.f170741a;
            ((C58433i) C86312j.m106911c(C58433i.class)).mo83380o5(imageView, type, e, str, galleryItem$MediaItem.f162751h, -1, aVar, galleryItem$MediaItem.f162752i);
        }
    }

    /* renamed from: hb2.e$g */
    public interface C59819g {
        /* renamed from: a */
        void mo84764a(ImageView imageView, C58800a aVar);
    }

    /* renamed from: hb2.e$h */
    public interface C59820h {
        /* renamed from: a */
        void mo84768a(long j);

        /* renamed from: b */
        FinderObject mo84769b();

        /* renamed from: c */
        boolean mo84770c();

        /* renamed from: d */
        void mo84771d(long j);

        /* renamed from: e */
        long mo84772e();

        /* renamed from: f */
        C58010a mo84773f();

        long getDurationMs();
    }

    public C59811e() {
        C59809b a = C59809b.f170715f.mo84759a();
        this.f170730j = new C59814c(a);
        C59821i iVar = new C59821i(a.mo84758a(), a.mo84758a(), a.f170720d, 0, 0, 24, (C8480h) null);
        iVar.f170746d = a.f170718b;
        iVar.f170747e = a.f170719c;
        iVar.f170748f = true;
        this.f170731n = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo84769b();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo84760a() {
        /*
            r2 = this;
            hb2.e$h r0 = r2.f170731n
            if (r0 == 0) goto L_0x000d
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.mo84769b()
            if (r0 == 0) goto L_0x000d
            long r0 = r0.f164794id
            goto L_0x000f
        L_0x000d:
            r0 = 0
        L_0x000f:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getUnsignedLongString(r0)
            java.lang.String r1 = "getUnsignedLongString(vi…getFinderObj()?.id ?: 0L)"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hb2.C59811e.mo84760a():java.lang.String");
    }

    /* renamed from: b */
    public final String mo84761b() {
        String str;
        FinderObject b;
        C59820h hVar = this.f170731n;
        if (hVar == null || (b = hVar.mo84769b()) == null || (str = b.username) == null) {
            str = C75592q0.m90789s();
        }
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public int mo75c() {
        return 4;
    }

    /* renamed from: d */
    public final String mo84762d(int i) {
        C99819r.C61452a a;
        C61453s sVar = this.f170724d;
        if (sVar == null || (a = sVar.mo86426a(sVar.mo86428c((long) i))) == null) {
            return null;
        }
        return a.f174761c;
    }

    /* renamed from: f */
    public final long mo84763f() {
        C59811e eVar = this.f170732o;
        boolean z = false;
        if (eVar != null && eVar.f170727g == 0) {
            z = true;
        }
        return z ? 1 : 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }

    /* renamed from: hb2.e$i */
    public static final class C59821i implements C59820h {

        /* renamed from: j */
        public static long f170742j;

        /* renamed from: a */
        public final String f170743a;

        /* renamed from: b */
        public final String f170744b;

        /* renamed from: c */
        public long f170745c;

        /* renamed from: d */
        public int f170746d;

        /* renamed from: e */
        public int f170747e;

        /* renamed from: f */
        public boolean f170748f;

        /* renamed from: g */
        public final boolean f170749g;

        /* renamed from: h */
        public long f170750h;

        /* renamed from: i */
        public final FinderObject f170751i;

        public C59821i(String str, String str2, long j, int i, int i2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "videoPath");
            this.f170743a = str;
            this.f170744b = str2;
            this.f170745c = j;
            this.f170746d = i;
            this.f170747e = i2;
            this.f170749g = true;
            FinderObject finderObject = new FinderObject();
            this.f170751i = finderObject;
            long a = C31543z5.m39451a();
            long j2 = f170742j;
            if (j2 == a) {
                f170742j = j2 + 1;
            } else {
                f170742j = a;
            }
            FinderMedia finderMedia = new FinderMedia();
            finderMedia.url = str2;
            finderObject.objectNonceId = "local_" + f170742j;
            FinderObjectDesc finderObjectDesc = new FinderObjectDesc();
            finderObjectDesc.media.add(finderMedia);
            finderObject.objectDesc = finderObjectDesc;
        }

        /* renamed from: a */
        public void mo84768a(long j) {
            this.f170750h = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            r0 = r0.media;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.protocal.protobuf.FinderObject mo84769b() {
            /*
                r4 = this;
                boolean r0 = r4.f170748f
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r4.f170751i
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                r2 = 0
                if (r0 == 0) goto L_0x0018
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
                if (r0 == 0) goto L_0x0018
                java.lang.Object r0 = r0.get(r2)
                com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
                goto L_0x0019
            L_0x0018:
                r0 = r1
            L_0x0019:
                if (r0 != 0) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                int r3 = r4.f170746d
                float r3 = (float) r3
                r0.width = r3
            L_0x0021:
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r4.f170751i
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                if (r0 == 0) goto L_0x0032
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
                if (r0 == 0) goto L_0x0032
                java.lang.Object r0 = r0.get(r2)
                com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
                goto L_0x0033
            L_0x0032:
                r0 = r1
            L_0x0033:
                if (r0 != 0) goto L_0x0036
                goto L_0x003b
            L_0x0036:
                int r3 = r4.f170747e
                float r3 = (float) r3
                r0.height = r3
            L_0x003b:
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r4.f170751i
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                if (r0 == 0) goto L_0x004c
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
            L_0x004c:
                if (r1 != 0) goto L_0x004f
                goto L_0x005b
            L_0x004f:
                long r2 = r4.f170745c
                float r0 = (float) r2
                r2 = 1148846080(0x447a0000, float:1000.0)
                float r0 = r0 / r2
                int r0 = iy3.C60641c.m70921b(r0)
                r1.videoDuration = r0
            L_0x005b:
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r4.f170751i
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hb2.C59811e.C59821i.mo84769b():com.tencent.mm.protocal.protobuf.FinderObject");
        }

        /* renamed from: c */
        public boolean mo84770c() {
            return this.f170749g;
        }

        /* renamed from: d */
        public void mo84771d(long j) {
            this.f170745c = j;
        }

        /* renamed from: e */
        public long mo84772e() {
            return this.f170750h;
        }

        /* renamed from: f */
        public C58010a mo84773f() {
            C58010a aVar = new C58010a(this.f170743a, this.f170744b, "", this.f170746d, this.f170747e);
            aVar.f165929a = 2;
            aVar.f165930b = "xV2";
            aVar.f165933e = true;
            C63679m.C63680a UU = ((C63679m) C86312j.m106911c(C63679m.class)).mo88484UU(this.f170744b, true);
            aVar.f165935g = UU != null ? UU.f180528d : 0;
            aVar.f165939k = UU != null ? UU.f180530f : 0;
            return aVar;
        }

        public long getDurationMs() {
            return this.f170745c;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C59821i(String str, String str2, long j, int i, int i2, int i3, C8480h hVar) {
            this(str, str2, j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
        }
    }
}
