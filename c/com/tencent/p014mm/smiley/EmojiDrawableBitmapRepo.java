package com.tencent.p014mm.smiley;

import a70.C112760b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import p490dl.C97487n;

/* renamed from: com.tencent.mm.smiley.EmojiDrawableBitmapRepo */
public final class EmojiDrawableBitmapRepo {

    /* renamed from: b */
    public static final /* synthetic */ int f283926b = 0;

    /* renamed from: a */
    public MMTrimMemoryEventListener f283927a;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/smiley/EmojiDrawableBitmapRepo$MMTrimMemoryEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "Lcom/tencent/mm/smiley/EmojiDrawableBitmapRepo;", "target", "<init>", "(Lcom/tencent/mm/smiley/EmojiDrawableBitmapRepo;)V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.smiley.EmojiDrawableBitmapRepo$MMTrimMemoryEventListener */
    public static final class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public final WeakReference<EmojiDrawableBitmapRepo> f283928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MMTrimMemoryEventListener(EmojiDrawableBitmapRepo emojiDrawableBitmapRepo) {
            super(C40008f.f107254d);
            C87412m.m108594g(emojiDrawableBitmapRepo, "target");
            this.f283928d = new WeakReference<>(emojiDrawableBitmapRepo);
        }

        public boolean callback(IEvent iEvent) {
            C87412m.m108594g((MMTrimMemoryEvent) iEvent, "event");
            if (this.f283928d.get() != null) {
                Log.m105920e("MicroMsg.EmojiDrawableBitmapRepo", "received MMTrimMemoryEvent: EmojiDrawableBitmapRepo");
                StringBuilder sb = new StringBuilder();
                sb.append("received MMTrimMemoryEvent: clear cache size:");
                C97487n nVar = C97487n.C97488a.f286127a;
                sb.append(nVar.mo136757b(false));
                Log.m105920e("MicroMsg.EmojiDrawableBitmapRepo", sb.toString());
                nVar.mo136756a(false);
            } else {
                Log.m105924i("MicroMsg.EmojiDrawableBitmapRepo", "received MMTrimMemoryEvent: EmojiDrawableBitmapRepo was gone");
                dead();
                int i = EmojiDrawableBitmapRepo.f283926b;
                C96922a.f283929a.f283927a = null;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.smiley.EmojiDrawableBitmapRepo$a */
    public static final class C96922a {

        /* renamed from: a */
        public static final EmojiDrawableBitmapRepo f283929a = new EmojiDrawableBitmapRepo();
    }

    static {
        C112760b.m154246r();
    }

    public EmojiDrawableBitmapRepo() {
        MMTrimMemoryEventListener mMTrimMemoryEventListener = this.f283927a;
        if (mMTrimMemoryEventListener != null) {
            mMTrimMemoryEventListener.dead();
        }
        MMTrimMemoryEventListener mMTrimMemoryEventListener2 = new MMTrimMemoryEventListener(this);
        this.f283927a = mMTrimMemoryEventListener2;
        mMTrimMemoryEventListener2.alive();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo135511a(com.tencent.p014mm.smiley.C96973t0 r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.EmojiDrawableBitmapRepo"
            r1 = 0
            if (r10 != 0) goto L_0x000b
            java.lang.String r10 = "Emoji Item is null , can not get drawable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            return r1
        L_0x000b:
            dl.n r2 = p490dl.C97487n.C97488a.f286127a
            com.tencent.mm.smiley.d0 r3 = r10.f284095a
            int r3 = r3.f283953d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.getClass()
            if (r3 == 0) goto L_0x002e
            java.lang.String r4 = ""
            boolean r4 = gy3.C87412m.m108589b(r3, r4)
            if (r4 == 0) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            sg.g<java.lang.String, android.graphics.Bitmap> r4 = r2.f286125b
            o90.b r4 = (o90.C100301b) r4
            java.lang.Object r3 = r4.get(r3)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            goto L_0x0036
        L_0x002e:
            java.lang.String r3 = "MicroMsg.EmojiRgbaCacheManager"
            java.lang.String r4 = "getSystemEmojiCacheBitmap failed, cacheKey error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r3 = r1
        L_0x0036:
            if (r3 == 0) goto L_0x004c
            boolean r4 = r3.isRecycled()
            if (r4 != 0) goto L_0x004c
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r10.<init>(r11, r3)
            return r10
        L_0x004c:
            boolean r3 = com.tencent.p014mm.smiley.C96965r.f284067d
            com.tencent.mm.smiley.r r3 = com.tencent.p014mm.smiley.C96965r.C44649c.f121057a
            boolean r4 = r3.f284073c
            if (r4 == 0) goto L_0x0057
            java.lang.String r4 = com.tencent.p014mm.smiley.C96965r.f284070g
            goto L_0x0059
        L_0x0057:
            java.lang.String r4 = com.tencent.p014mm.smiley.C96965r.f284069f
        L_0x0059:
            com.tencent.mm.smiley.d0 r5 = r10.f284095a
            int r6 = r5.f283953d
            com.tencent.mm.smiley.r$b r7 = r3.f284072b
            r8 = 0
            if (r7 == 0) goto L_0x0065
            int r7 = r7.f284078d
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            int r6 = r6 + r7
            int r5 = r5.f283954e
            byte[] r4 = com.tencent.p014mm.vfs.C86013q1.m106433O(r4, r6, r5)
            r5 = 1
            if (r4 == 0) goto L_0x007b
            int r6 = r4.length
            if (r6 != 0) goto L_0x0075
            r6 = 1
            goto L_0x0076
        L_0x0075:
            r6 = 0
        L_0x0076:
            r6 = r6 ^ r5
            if (r6 != r5) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x0085
            com.tencent.mm.emoji.decode.MMGIFJNIFactory$Companion r6 = com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.Companion
            android.graphics.Bitmap r6 = r6.decodeThumb((byte[]) r4)
            goto L_0x008b
        L_0x0085:
            java.lang.String r6 = "getDrawableByDecode: emojiFileData empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            r6 = r1
        L_0x008b:
            if (r6 == 0) goto L_0x00ac
            r11 = 240(0xf0, float:3.36E-43)
            r6.setDensity(r11)
            com.tencent.mm.smiley.d0 r10 = r10.f284095a
            int r10 = r10.f283953d
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.mo136759d(r10, r8, r6)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r1.<init>(r10, r6)
            goto L_0x017a
        L_0x00ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "bitmap is null. decode byte array failed. size:"
            r2.append(r6)
            com.tencent.mm.smiley.d0 r6 = r10.f284095a
            if (r6 == 0) goto L_0x00c1
            int r6 = r6.f283954e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x00c2
        L_0x00c1:
            r6 = r1
        L_0x00c2:
            r2.append(r6)
            java.lang.String r6 = " data length:"
            r2.append(r6)
            if (r4 == 0) goto L_0x00ce
            int r4 = r4.length
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            if (r11 == 0) goto L_0x017a
            long r0 = r3.mo135554f()
            boolean r11 = r3.f284073c
            if (r11 == 0) goto L_0x00e6
            java.lang.String r11 = com.tencent.p014mm.smiley.C96965r.f284070g
            goto L_0x00e8
        L_0x00e6:
            java.lang.String r11 = com.tencent.p014mm.smiley.C96965r.f284069f
        L_0x00e8:
            com.tencent.mm.smiley.r$b r11 = r3.mo135552d(r11)
            int r2 = r11.f284075a
            long r6 = r11.f284076b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "asyncEmojiResCheck,emoji error currentSupportVersion:"
            r11.append(r4)
            r11.append(r5)
            java.lang.String r4 = " ,currentVersion:"
            r11.append(r4)
            r11.append(r0)
            java.lang.String r4 = " ,supportVersion:"
            r11.append(r4)
            r11.append(r2)
            java.lang.String r4 = ", Version:"
            r11.append(r4)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            java.lang.String r4 = "MicroMsg.EmojiResProcessor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            if (r2 != r5) goto L_0x0128
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0128
            r3.mo135557i()
            goto L_0x0174
        L_0x0128:
            java.lang.Class<fp.e> r11 = p523fp.C32147e.class
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0174
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 == 0) goto L_0x0174
            boolean r0 = r3.f284073c
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = com.tencent.p014mm.smiley.C96965r.f284070g
            goto L_0x013f
        L_0x013d:
            java.lang.String r0 = com.tencent.p014mm.smiley.C96965r.f284069f
        L_0x013f:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            di3.d r0 = di3.C86312j.m106911c(r11)
            fp.e r0 = (p523fp.C32147e) r0
            r1 = 37
            r2 = 8
            java.lang.String r0 = r0.mo58507AD(r1, r2)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r6 == 0) goto L_0x015f
            java.lang.String r11 = "fixResError , cachePath exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            r3.mo135549a(r0, r5)
            goto L_0x0171
        L_0x015f:
            java.lang.String r0 = "fixResError , cachePath not exist , use old asset res"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r3.mo135550b()
            di3.d r11 = di3.C86312j.m106911c(r11)
            fp.e r11 = (p523fp.C32147e) r11
            r0 = -1
            r11.b70(r1, r2, r0, r8)
        L_0x0171:
            r3.mo135557i()
        L_0x0174:
            com.tencent.mm.smiley.EmojiDrawableBitmapRepo r11 = com.tencent.p014mm.smiley.EmojiDrawableBitmapRepo.C96922a.f283929a
            android.graphics.drawable.Drawable r1 = r11.mo135511a(r10, r8)
        L_0x017a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.EmojiDrawableBitmapRepo.mo135511a(com.tencent.mm.smiley.t0, boolean):android.graphics.drawable.Drawable");
    }
}
