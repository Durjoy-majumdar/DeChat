package com.tencent.p014mm.view.loader;

import android.graphics.Bitmap;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ic0.C21074o;
import java.lang.ref.WeakReference;
import java.util.Map;
import jc0.C98931a;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: com.tencent.mm.view.loader.EmojiLoaderMemoryCache */
public class EmojiLoaderMemoryCache implements C21074o {

    /* renamed from: a */
    public C98931a<String, Bitmap> f285693a = new C98931a<>(150);

    /* renamed from: com.tencent.mm.view.loader.EmojiLoaderMemoryCache$MMTrimMemoryEventListener */
    public static class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public final WeakReference<EmojiLoaderMemoryCache> f285694d;

        public MMTrimMemoryEventListener(EmojiLoaderMemoryCache emojiLoaderMemoryCache) {
            super(C40008f.f107254d);
            this.f285694d = new WeakReference<>(emojiLoaderMemoryCache);
            this.__eventId = 708811463;
        }

        public boolean callback(IEvent iEvent) {
            int size;
            MMTrimMemoryEvent mMTrimMemoryEvent = (MMTrimMemoryEvent) iEvent;
            EmojiLoaderMemoryCache emojiLoaderMemoryCache = this.f285694d.get();
            if (emojiLoaderMemoryCache != null) {
                Log.m105920e("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: EmojiLoaderMemoryCache");
                C98931a<String, Bitmap> aVar = emojiLoaderMemoryCache.f285693a;
                if (aVar != null) {
                    Object[] objArr = new Object[1];
                    synchronized (aVar) {
                        C101611g<K, V> gVar = aVar.f290003a;
                        if (gVar != null) {
                            size = ((C101062d) gVar).size();
                        } else {
                            throw new NullPointerException("mData == null");
                        }
                    }
                    objArr[0] = Integer.valueOf(size);
                    Log.m105921e("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", objArr);
                    C101611g<K, V> gVar2 = emojiLoaderMemoryCache.f285693a.f290003a;
                    if (gVar2 != null) {
                        ((C101062d) gVar2).trimToSize(-1);
                    } else {
                        throw new NullPointerException("mData == null");
                    }
                }
            } else {
                Log.m105924i("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: EmojiLoaderMemoryCache was gone");
                dead();
            }
            return false;
        }
    }

    public EmojiLoaderMemoryCache() {
        new MMTrimMemoryEventListener(this).alive();
    }

    /* renamed from: a */
    public void mo32795a(String str, Bitmap bitmap) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed. key is null.");
        } else if (bitmap == null) {
            Log.m105928w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed.value is null.");
        } else {
            this.f285693a.mo138273a(str, bitmap);
        }
    }

    public void clear() {
        Map snapshot;
        synchronized (this) {
            C98931a<String, Bitmap> aVar = this.f285693a;
            if (aVar != null) {
                synchronized (aVar) {
                    C101611g<K, V> gVar = aVar.f290003a;
                    if (gVar != null) {
                        snapshot = ((C100308d) gVar).snapshot();
                    } else {
                        throw new NullPointerException("mData == null");
                    }
                }
                if (!snapshot.isEmpty() && snapshot.size() > 0) {
                    for (Map.Entry value : snapshot.entrySet()) {
                        Bitmap bitmap = (Bitmap) value.getValue();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Log.m105925i("MicroMsg.emoji.EmojiLoaderMemoryCache", "recycle bitmap:%s, not need", bitmap.toString());
                        }
                    }
                }
                C101611g<K, V> gVar2 = this.f285693a.f290003a;
                if (gVar2 != null) {
                    ((C101062d) gVar2).trimToSize(-1);
                } else {
                    throw new NullPointerException("mData == null");
                }
            }
        }
    }

    public Bitmap get(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C101611g<K, V> gVar = this.f285693a.f290003a;
        if (gVar != null) {
            return (Bitmap) ((C101062d) gVar).get(str);
        }
        throw new NullPointerException("mData == null");
    }

    public void remove(String str) {
        C101611g<K, V> gVar = this.f285693a.f290003a;
        if (gVar != null) {
            ((C101062d) gVar).remove(str);
            return;
        }
        throw new NullPointerException("mData == null");
    }
}
