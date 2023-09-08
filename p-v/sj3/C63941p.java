package sj3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import hp3.C87581a;
import ic0.C21070h;
import java.util.Map;
import jc0.C21210b;
import jp3.C9487b;
import kg3.C76577a;
import kw0.C46746a;
import o40.C61926c;
import ob0.C89132b;
import p151er.C58677l;
import p243tn.C14050a;
import p565ir.C60606n;
import p749xh.C66279z2;
import p823sg.C101611g;
import p823sg.C101614i;
import p823sg.C90193h;
import pe3.C89349b;
import rr3.C110622b;
import rr3.C110625c0;
import rr3.C110632i;
import rx3.C13598b0;
import s90.C63724h;
import te3.C49712hj1;
import te3.C50429mo2;
import te3.C51713vn0;
import te3.C64273c21;
import vp3.C65849b;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: sj3.p */
public final class C63941p {

    /* renamed from: a */
    public static final C63941p f181254a = new C63941p();

    /* renamed from: b */
    public static final C101611g<String, C63724h> f181255b = new C101614i(50);

    /* renamed from: c */
    public static final C101611g<String, FinderObject> f181256c = new C101614i(50);

    /* renamed from: d */
    public static final int f181257d = 1;

    /* renamed from: e */
    public static final int f181258e = 2;

    /* renamed from: f */
    public static final int f181259f = 3;

    /* renamed from: sj3.p$a */
    public static final class C63942a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f181260a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<FinderObject, C13598b0> f181261b;

        public C63942a(String str, C32226l<? super FinderObject, C13598b0> lVar) {
            this.f181260a = str;
            this.f181261b = lVar;
        }

        public Object call(Object obj) {
            C61926c.m72668M(new C63940o((C89132b.C89134c) obj, this.f181260a, this.f181261b));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sj3.p$b */
    public static final class C63943b extends C87413o implements C32226l<FinderObject, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60606n.C60609c f181262d;

        /* renamed from: e */
        public final /* synthetic */ String f181263e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63943b(C60606n.C60609c cVar, String str) {
            super(1);
            this.f181262d = cVar;
            this.f181263e = str;
        }

        public Object invoke(Object obj) {
            FinderObject finderObject = (FinderObject) obj;
            if ((finderObject != null ? finderObject.liveInfo : null) != null) {
                C64273c21 c212 = finderObject.liveInfo;
                C87412m.m108591d(c212);
                if (c212.f182392d != 0) {
                    C7335d c = C86312j.m106911c(C60606n.class);
                    C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
                    C64273c21 c213 = finderObject.liveInfo;
                    C87412m.m108591d(c213);
                    long j = c213.f182392d;
                    C60606n.C60609c cVar = this.f181262d;
                    String str = this.f181263e;
                    C87412m.m108591d(str);
                    C60606n.C60607a.m70857a((C60606n) c, j, false, (C9487b) null, cVar, 3, str, (C50429mo2) null, 64, (Object) null);
                    return C13598b0.f38549a;
                }
            }
            C63941p pVar = C63941p.f181254a;
            Log.m105924i("BizChatUtil", "cgi get finderObject fail!");
            this.f181262d.onLiveStatusCallback(0, 1, new C51713vn0());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sj3.p$c */
    public static final class C63944c implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ ImageView f181264a;

        /* renamed from: b */
        public final /* synthetic */ String f181265b;

        /* renamed from: c */
        public final /* synthetic */ int f181266c;

        /* renamed from: d */
        public final /* synthetic */ int f181267d;

        /* renamed from: sj3.p$c$a */
        public static final class C63945a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f181268d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f181269e;

            /* renamed from: f */
            public final /* synthetic */ String f181270f;

            /* renamed from: g */
            public final /* synthetic */ int f181271g;

            /* renamed from: h */
            public final /* synthetic */ int f181272h;

            public C63945a(ImageView imageView, Bitmap bitmap, String str, int i, int i2) {
                this.f181268d = imageView;
                this.f181269e = bitmap;
                this.f181270f = str;
                this.f181271g = i;
                this.f181272h = i2;
            }

            public final void run() {
                C63941p pVar = C63941p.f181254a;
                ImageView imageView = this.f181268d;
                Bitmap bitmap = this.f181269e;
                String str = this.f181270f;
                int i = this.f181271g;
                int i2 = this.f181272h;
                C87412m.m108594g(imageView, "bgIv");
                if (bitmap == null || Util.isNullOrNil(str)) {
                    Log.m105924i("BizChatUtil", "imageData.bitmap == null || coverUrl == null");
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                Matrix matrix = new Matrix();
                float width = ((float) i) / ((float) bitmap.getWidth());
                float height = ((float) i2) / ((float) bitmap.getHeight());
                if (width <= height) {
                    width = height;
                }
                matrix.setScale(width, width, 0.0f, 0.0f);
                imageView.setImageMatrix(matrix);
                StringBuilder sb = new StringBuilder();
                C87412m.m108591d(str);
                byte[] bytes = str.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                sb.append(C90193h.m112878f(bytes));
                sb.append("_biz_chat_blur");
                String sb4 = sb.toString();
                Bitmap e = C20828a.m22825b().mo32516e(sb4);
                if (e != null) {
                    imageView.setImageBitmap(e);
                    return;
                }
                C110625c0 g = new EffectManager().mo154927g(C110632i.BlurEffect);
                C87412m.m108592e(g, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
                C110622b bVar = (C110622b) g;
                bVar.mo162186d(20.0f);
                bVar.mo162187e(1.0f);
                C65849b bVar2 = new C65849b();
                bVar2.mo89891b(bitmap);
                bVar2.f189363b = (int) (((double) bitmap.getWidth()) * 1.2d);
                bVar2.f189364c = (int) (((double) bitmap.getHeight()) * 1.2d);
                bVar2.f189366e.f334033b.mo154923c(bVar);
                bVar2.mo89890a(new C48407n(str, imageView, sb4));
            }
        }

        public C63944c(ImageView imageView, String str, int i, int i2) {
            this.f181264a = imageView;
            this.f181265b = str;
            this.f181266c = i;
            this.f181267d = i2;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(view, "view");
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(bVar, "imageData");
            C63941p pVar = C63941p.f181254a;
            Log.m105924i("BizChatUtil", "onImageLoadFinish");
            if (bVar.f59988d == null) {
                Log.m105924i("BizChatUtil", "imageData.bitmap == null");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 5;
            byte[] Bitmap2Bytes = BitmapUtil.Bitmap2Bytes(bVar.f59988d);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(Bitmap2Bytes, 0, Bitmap2Bytes.length, options);
            this.f181264a.setTag(C0966R.C0970id.mxm, this.f181265b);
            ((C119157j) C119157j.f356862d).mo183895z(new C63945a(this.f181264a, decodeByteArray, this.f181265b, this.f181266c, this.f181267d));
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(bVar, "imageData");
            Bitmap bitmap = bVar.f59988d;
            C87412m.m108593f(bitmap, "imageData.bitmap");
            return bitmap;
        }
    }

    /* renamed from: a */
    public final boolean mo88703a(String str, int i) {
        C87412m.m108594g(str, "msgContent");
        C63724h d = mo88706d(str, i);
        boolean z = !Util.isNullOrNil(d.f180628f);
        boolean z2 = !Util.isNullOrNil(d.f180629g);
        boolean z3 = !Util.isNullOrNil(d.f180638s);
        Log.m105924i("BizChatUtil", "nonceIdOk = " + z + ", exportIdOk = " + z2 + ", coverOk = " + z3);
        return z && z2 && z3;
    }

    /* renamed from: b */
    public final void mo88704b(String str, String str2, C32226l<? super FinderObject, C13598b0> lVar) {
        String str3 = str;
        String str4 = str2;
        C32226l<? super FinderObject, C13598b0> lVar2 = lVar;
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            C32226l<? super FinderObject, C13598b0> lVar3 = lVar2;
            Log.m105924i("BizChatUtil", "exportId = " + str4 + ", nonceId = " + str3);
            if (lVar3 != null) {
                lVar3.invoke(null);
            }
        } else if (f181256c.check(str4)) {
            Log.m105924i("BizChatUtil", "get finderObject in cache");
            if (lVar2 != null) {
                lVar2.invoke(mo88705c(str4, str3));
            }
        } else {
            C58677l lVar4 = (C58677l) C86312j.m106911c(C58677l.class);
            C87412m.m108591d(str2);
            C87412m.m108593f(lVar4, "getService(IFinderCommon…ernalService::class.java)");
            lVar4.mo75410KW(0, str, 26, 2, "", false, (C89349b) null, (C66279z2) null, 0, "", true, false, str2, (C49712hj1) null, 6).mo9225i().mo123420E(new C63942a(str2, lVar));
        }
    }

    /* renamed from: c */
    public final FinderObject mo88705c(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105924i("BizChatUtil", "exportId = " + str + ", nonceId = " + str2);
            return null;
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("test_biz_finder_live");
        if (mmkv.decodeBool("clear", false)) {
            ((C101614i) f181255b).clear();
            ((C101614i) f181256c).clear();
            mmkv.encode("clear", false);
            Log.m105924i("BizChatUtil", "clear bizFinderObjectCache");
        }
        FinderObject finderObject = f181256c.get(str);
        if (finderObject == null) {
            Log.m105924i("BizChatUtil", "finder object get from cgi");
            mo88704b(str2, str, (C32226l<? super FinderObject, C13598b0>) null);
        }
        return finderObject;
    }

    /* renamed from: d */
    public final C63724h mo88706d(String str, int i) {
        C87412m.m108594g(str, "msgContent");
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        C101611g<String, C63724h> gVar = f181255b;
        if (gVar.check(f)) {
            Log.m105924i("BizChatUtil", "get liveXmlObject from cache");
            C63724h hVar = gVar.get(f);
            C87412m.m108593f(hVar, "bizLiveXmlObjectCache.get(md5Key)");
            return hVar;
        }
        String str2 = ".msg.appmsg.mmreader.category.item" + (i == 0 ? "" : String.valueOf(i)) + ".finder_live";
        Log.m105924i("BizChatUtil", "get liveXmlObject from parse, prefix = " + str2);
        C87412m.m108594g(str2, "tagPrefix");
        Map<String, String> decode = SemiXml.decode(str);
        C63724h hVar2 = new C63724h();
        try {
            C87412m.m108593f(decode, "values");
            if (!decode.isEmpty()) {
                hVar2.f180626d = Util.nullAsNil(decode.get(str2 + ".category"));
                hVar2.f180627e = Util.nullAsNil(decode.get(str2 + ".finder_username"));
                hVar2.f180628f = Util.nullAsNil(decode.get(str2 + ".finder_nonce_id"));
                hVar2.f180629g = Util.nullAsNil(decode.get(str2 + ".export_id"));
                hVar2.f180630h = Util.nullAsNil(decode.get(str2 + ".nickname"));
                hVar2.f180631i = Util.nullAsNil(decode.get(str2 + ".head_url"));
                hVar2.f180632j = Util.nullAsNil(decode.get(str2 + ".desc"));
                hVar2.f180633n = Util.safeParseInt(decode.get(str2 + ".live_status"));
                hVar2.f180634o = Util.nullAsNil(decode.get(str2 + ".live_source_type_str"));
                hVar2.f180635p = Util.safeParseInt(decode.get(str2 + ".ext_flag"));
                hVar2.f180636q = Util.nullAsNil(decode.get(str2 + ".auth_icon_url"));
                hVar2.f180637r = Util.nullAsNil(decode.get(str2 + ".auth_icon_type_str"));
                hVar2.f180638s = Util.nullAsNil(decode.get(str2 + ".media.cover_url"));
                hVar2.f180639t = Util.safeParseInt(decode.get(str2 + ".media.height"));
                hVar2.f180640u = Util.safeParseInt(decode.get(str2 + ".media.width"));
            }
        } catch (Exception e) {
            Log.m105921e("BizChatUtil", "parse error! %s", e.getMessage());
        }
        Log.m105924i("BizChatUtil", "parse ok, desc = " + hVar2.f180632j);
        f181255b.put(f, hVar2);
        return hVar2;
    }

    /* renamed from: e */
    public final void mo88707e(String str, String str2, C60606n.C60609c cVar) {
        C87412m.m108594g(cVar, "statusCallback");
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            Log.m105924i("BizChatUtil", "exportId = " + str2 + ", nonceId = " + str);
            return;
        }
        mo88704b(str, str2, new C63943b(cVar, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r1 = r6.liveInfo;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88708f(int r4, java.lang.String r5, com.tencent.p014mm.protocal.protobuf.FinderObject r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            c30.g r0 = new c30.g
            r0.<init>()
            java.lang.String r1 = "exportId"
            r0.put(r1, r5)     // Catch:{ f -> 0x0039 }
            java.lang.String r5 = "liveid"
            if (r6 == 0) goto L_0x0019
            te3.c21 r1 = r6.liveInfo     // Catch:{ f -> 0x0039 }
            if (r1 == 0) goto L_0x0019
            long r1 = r1.f182392d     // Catch:{ f -> 0x0039 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ f -> 0x0039 }
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r0.put(r5, r1)     // Catch:{ f -> 0x0039 }
            java.lang.String r5 = "feedid"
            if (r6 == 0) goto L_0x0024
            long r1 = r6.f164794id     // Catch:{ f -> 0x0039 }
            goto L_0x0026
        L_0x0024:
            r1 = 0
        L_0x0026:
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getUnsignedLongString(r1)     // Catch:{ f -> 0x0039 }
            r0.put(r5, r6)     // Catch:{ f -> 0x0039 }
            java.lang.String r5 = "finder_username"
            r0.put(r5, r7)     // Catch:{ f -> 0x0039 }
            java.lang.String r5 = "wx_username"
            r0.put(r5, r8)     // Catch:{ f -> 0x0039 }
            goto L_0x0043
        L_0x0039:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "BizChatUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
        L_0x0043:
            switch(r4) {
                case 11: goto L_0x0055;
                case 12: goto L_0x0051;
                case 13: goto L_0x004d;
                case 14: goto L_0x0049;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r4 = ""
            goto L_0x0058
        L_0x0049:
            java.lang.String r4 = "service_card_his_message"
            goto L_0x0058
        L_0x004d:
            java.lang.String r4 = "service_card_second"
            goto L_0x0058
        L_0x0051:
            java.lang.String r4 = "service_card_first"
            goto L_0x0058
        L_0x0055:
            java.lang.String r4 = "service_card_one_big"
        L_0x0058:
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct
            r5.<init>()
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r5.f9725d = r6
            r5.mo1015v(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r6 = "eldUdfKvJson.toString()"
            gy3.C87412m.m108593f(r4, r6)
            r6 = 0
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            java.lang.String r4 = z04.C112551y.m153814n(r4, r7, r8, r6)
            r5.mo1016w(r4)
            r5.mo86054n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.C63941p.mo88708f(int, java.lang.String, com.tencent.mm.protocal.protobuf.FinderObject, java.lang.String, java.lang.String):void");
    }

    /* renamed from: g */
    public final void mo88709g(ImageView imageView, ImageView imageView2, String str) {
        C87412m.m108594g(imageView, "rightCoverIv");
        C87412m.m108594g(imageView2, "blurCoverIv");
        if (Util.isNullOrNil(str)) {
            Log.m105924i("BizChatUtil", "coverUrl == null");
            return;
        }
        Context context = imageView.getContext();
        C46746a.m52038k(C46746a.f125826a, imageView, (float) C76577a.m92151b(MMApplicationContext.getContext(), 4), false, false, 12, (Object) null);
        int b = C76577a.m92151b(context, 220);
        int A = C76577a.m92145A(context) - C76577a.m92151b(context, 16);
        Log.m105924i("BizChatUtil", "setCover, coverUrl = " + str + ", cardHeight = " + b + ", cardWidth = " + A);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59345a = true;
        bVar.f59347c = true;
        bVar.f59359o = C0966R.color.f3237k_;
        bVar.f59350f = C14050a.m13405b(str);
        bVar.f59354j = A;
        bVar.f59355k = b;
        C20828a.m22825b().mo32520i(str, imageView, bVar.mo32666a(), new C63944c(imageView2, str, A, b));
    }

    /* renamed from: h */
    public final void mo88710h(boolean z, String str, FinderLiveOnliveWidget finderLiveOnliveWidget, FinderLiveOnliveWidget finderLiveOnliveWidget2) {
        if (z) {
            finderLiveOnliveWidget.setVisibility(0);
            finderLiveOnliveWidget2.setVisibility(8);
            finderLiveOnliveWidget.setText(str);
            return;
        }
        finderLiveOnliveWidget.setVisibility(8);
        finderLiveOnliveWidget2.setVisibility(0);
        finderLiveOnliveWidget2.setText(str);
    }

    /* renamed from: i */
    public final void mo88711i(C64273c21 c212, FinderLiveOnliveWidget finderLiveOnliveWidget, FinderLiveOnliveWidget finderLiveOnliveWidget2) {
        C87412m.m108594g(finderLiveOnliveWidget, "liveOnIcon");
        C87412m.m108594g(finderLiveOnliveWidget2, "liveEndIcon");
        Integer num = null;
        Integer valueOf = c212 != null ? Integer.valueOf(c212.f182394f) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("setLiveStatusIcon: live status = ");
        sb.append(valueOf);
        sb.append(", replay = ");
        if (c212 != null) {
            num = Integer.valueOf(c212.f182366L);
        }
        sb.append(num);
        Log.m105924i("BizChatUtil", sb.toString());
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360183n01);
        C87412m.m108593f(string, "getContext().resources.g…biz_finder_relay_playing)");
        String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360182n00);
        C87412m.m108593f(string2, "getContext().resources.g…iz_finder_relay_creating)");
        String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mzz);
        C87412m.m108593f(string3, "getContext().resources.g…biz_finder_onlive_status)");
        String string4 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mzy);
        C87412m.m108593f(string4, "getContext().resources.g…ring.biz_finder_live_end)");
        if (c212 == null) {
            mo88710h(false, string4, finderLiveOnliveWidget, finderLiveOnliveWidget2);
            return;
        }
        boolean z = true;
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            mo88710h(true, string3, finderLiveOnliveWidget, finderLiveOnliveWidget2);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int i = c212.f182366L;
            if (i == 1 || i == 4 || i == 2 || i == 6 || i == 5) {
                mo88710h(true, string, finderLiveOnliveWidget, finderLiveOnliveWidget2);
                return;
            }
            if (i != 3) {
                z = false;
            }
            if (z) {
                mo88710h(false, string2, finderLiveOnliveWidget, finderLiveOnliveWidget2);
            } else {
                mo88710h(false, string4, finderLiveOnliveWidget, finderLiveOnliveWidget2);
            }
        } else {
            mo88710h(false, string4, finderLiveOnliveWidget, finderLiveOnliveWidget2);
        }
    }

    /* renamed from: j */
    public final void mo88712j(C64273c21 c212, MMNeat7extView mMNeat7extView, String str) {
        int i;
        C87412m.m108594g(mMNeat7extView, "neatTextView");
        if (str == null) {
            Log.m105924i("BizChatUtil", "text == null");
            return;
        }
        Integer num = null;
        Integer valueOf = c212 != null ? Integer.valueOf(c212.f182394f) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("setLiveStatusIcon: live status = ");
        sb.append(valueOf);
        sb.append(", replay = ");
        if (c212 != null) {
            num = Integer.valueOf(c212.f182366L);
        }
        sb.append(num);
        Log.m105924i("BizChatUtil", sb.toString());
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        int i2 = 0;
        boolean z = Util.isEqual(applicationLanguage, "zh_CN") || Util.isEqual(applicationLanguage, "zh_HK") || Util.isEqual(applicationLanguage, "zh_TW");
        if (valueOf != null && valueOf.intValue() == 2) {
            if (c212 != null && ((i = c212.f182366L) == 1 || i == 4 || i == 2 || i == 6 || i == 5)) {
                i2 = f181258e;
            } else {
                if (c212 != null && c212.f182366L == 3) {
                    i2 = f181259f;
                }
            }
        }
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            i2 = f181257d;
        }
        int i3 = i2 == f181257d ? z ? C0966R.C0969drawable.bvn : C0966R.C0969drawable.bvo : i2 == f181258e ? z ? C0966R.C0969drawable.co4 : C0966R.C0969drawable.co5 : i2 == f181259f ? !C85875k4.m106211z() ? z ? C0966R.C0969drawable.f357106co0 : C0966R.C0969drawable.f357108co2 : z ? C0966R.C0969drawable.f357107co1 : C0966R.C0969drawable.f357109co3 : !C85875k4.m106211z() ? z ? C0966R.C0969drawable.cgq : C0966R.C0969drawable.cgs : z ? C0966R.C0969drawable.cgr : C0966R.C0969drawable.cgt;
        Log.m105924i("BizChatUtil", "setLiveStatusSpan resId = " + i3);
        C46746a aVar = C46746a.f125826a;
        Context context = mMNeat7extView.getContext();
        C87412m.m108593f(context, "neatTextView.context");
        aVar.mo71978l(context, mMNeat7extView, i3, str, 0);
    }

    /* renamed from: k */
    public final void mo88713k(ImageView imageView, String str) {
        C87412m.m108594g(imageView, "coverIv");
        if (Util.isNullOrNil(str)) {
            Log.m105924i("BizChatUtil", "coverUrl == null");
            return;
        }
        imageView.getContext();
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59345a = true;
        bVar.f59347c = true;
        bVar.f59359o = C0966R.color.f3237k_;
        bVar.f59350f = C14050a.m13405b(str);
        C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
    }
}
