package p833zk;

import android.graphics.Bitmap;
import b61.C79671a;
import com.tencent.p014mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.io.IOException;
import jc0.C21210b;
import p1072al.C92042f;
import p1089xk.C102688b;
import p260wk.C102457e;
import p384tk.C101900d;
import p384tk.C101902h;
import rx3.C13598b0;
import z51.C102975i;
import z51.C39315g;

/* renamed from: zk.c */
public final class C103041c {

    /* renamed from: a */
    public static final C103042a f304024a = new C103042a((C8480h) null);

    /* renamed from: zk.c$b */
    public static final class C53794b implements C92042f {

        /* renamed from: a */
        public final /* synthetic */ EmojiInfo f150963a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f150964b;

        public C53794b(EmojiInfo emojiInfo, C32226l<? super Boolean, C13598b0> lVar) {
            this.f150963a = emojiInfo;
            this.f150964b = lVar;
        }

        /* renamed from: a */
        public void mo55799a(boolean z) {
            Log.m105924i("MicroMsg.EmojiCoverFetcher", "onResult: " + this.f150963a.getMd5() + ", " + z);
            if (!z) {
                C32226l<Boolean, C13598b0> lVar = this.f150964b;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
            } else if (C103041c.f304024a.mo142750a(this.f150963a)) {
                C32226l<Boolean, C13598b0> lVar2 = this.f150964b;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.TRUE);
                }
            } else {
                C32226l<Boolean, C13598b0> lVar3 = this.f150964b;
                if (lVar3 != null) {
                    lVar3.invoke(Boolean.FALSE);
                }
            }
        }
    }

    /* renamed from: zk.c$a */
    public static final class C103042a {
        public C103042a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo142750a(EmojiInfo emojiInfo) {
            byte[] Gj;
            C87412m.m108594g(emojiInfo, "emojiInfo");
            Log.m105924i("MicroMsg.EmojiCoverFetcher", "createThumb: " + emojiInfo.getMd5());
            MMGIFJNIFactory.Companion companion = MMGIFJNIFactory.Companion;
            C101900d decoder = companion.getDecoder(emojiInfo);
            if (!companion.isValid(decoder)) {
                Log.m105928w("MicroMsg.EmojiCoverFetcher", "createThumb: invalid decoder");
                decoder.destroy();
                return false;
            }
            Bitmap bitmap = null;
            if (!(decoder instanceof C101902h) || decoder.mo35635e() != 1) {
                decoder.mo35631b();
                bitmap = decoder.getFrame();
                decoder.destroy();
            } else {
                decoder.destroy();
                byte[] u = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138036u(emojiInfo);
                if (!(u == null || (Gj = ((C102975i) C86312j.m106911c(C102975i.class)).mo141695Gj(u)) == null)) {
                    bitmap = BitmapUtil.decodeByteArray(Gj);
                }
            }
            if (bitmap == null) {
                Log.m105920e("MicroMsg.EmojiCoverFetcher", "bitmap is null");
                return false;
            }
            try {
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, emojiInfo.getCoverPath(), false);
                if ((bitmap.getWidth() > 120 || bitmap.getHeight() > 120) && (bitmap = BitmapUtil.extractThumbNail(bitmap, 120, 120, false, true)) == null) {
                    return false;
                }
                C102688b.f303300a.mo142499b(emojiInfo.getMd5(), bitmap);
                return true;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.EmojiCoverFetcher", e, "saveBitmapToImage failed", new Object[0]);
                return false;
            }
        }
    }

    /* renamed from: a */
    public final void mo142749a(EmojiInfo emojiInfo, C32226l<? super Boolean, C13598b0> lVar) {
        if (!Util.isNullOrNil(emojiInfo.field_thumbUrl)) {
            Log.m105924i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by url " + emojiInfo.getMd5());
            C21210b a = new C79671a().mo32789a(emojiInfo.field_thumbUrl);
            if ((a != null ? a.f59987c : null) != null) {
                C102688b.f303300a.mo142499b(emojiInfo.getMd5(), BitmapUtil.decodeByteArray(a.f59987c));
                C86013q1.m106437S(emojiInfo.getCoverPath(), a.f59987c);
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                }
            } else if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        } else {
            Log.m105924i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by gif " + emojiInfo.getMd5());
            C102457e.f301712a.mo142074f(emojiInfo, false, new C53794b(emojiInfo, lVar));
        }
    }
}
