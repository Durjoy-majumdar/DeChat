package com.tencent.p014mm.emoji.sync;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import kotlin.Metadata;
import o40.C61926c;
import p595ll.C99511t;
import p595ll.C99512u;
import p595ll.C99513v;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC */
public final class EmojiSyncLoaderIPC implements C99511t {

    /* renamed from: a */
    public final int f266681a;

    /* renamed from: b */
    public String f266682b = "MicroMsg.EmojiSyncLoaderIPC";

    /* renamed from: c */
    public int f266683c;

    /* renamed from: d */
    public int f266684d;

    /* renamed from: e */
    public boolean f266685e;

    /* renamed from: f */
    public final LinkedList<C92668a.C92678k> f266686f = new LinkedList<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/emoji/sync/EmojiSyncLoaderIPC$EmojiSyncData;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData */
    public static final class EmojiSyncData implements Parcelable {
        public static final C92663a CREATOR = new C92663a((C8480h) null);

        /* renamed from: d */
        public int f266687d;

        /* renamed from: e */
        public int f266688e;

        /* renamed from: f */
        public int f266689f;

        /* renamed from: g */
        public int f266690g;

        /* renamed from: h */
        public boolean f266691h;

        /* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData$a */
        public static final class C92663a implements Parcelable.Creator<EmojiSyncData> {
            public C92663a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                EmojiSyncData emojiSyncData = new EmojiSyncData();
                emojiSyncData.f266687d = parcel.readInt();
                emojiSyncData.f266688e = parcel.readInt();
                emojiSyncData.f266689f = parcel.readInt();
                emojiSyncData.f266690g = parcel.readInt();
                emojiSyncData.f266691h = parcel.readByte() != 0;
                return emojiSyncData;
            }

            public Object[] newArray(int i) {
                return new EmojiSyncData[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeInt(this.f266687d);
            parcel.writeInt(this.f266688e);
            parcel.writeInt(this.f266689f);
            parcel.writeInt(this.f266690g);
            parcel.writeByte(this.f266691h ? (byte) 1 : 0);
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$a */
    public static final class C92664a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ EmojiSyncLoaderIPC f266692d;

        public C92664a(EmojiSyncLoaderIPC emojiSyncLoaderIPC) {
            this.f266692d = emojiSyncLoaderIPC;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String str = this.f266692d.f266682b;
            Log.m105924i(str, "init data callback: " + bundle);
            this.f266692d.mo126706g(bundle != null ? (EmojiSyncData) bundle.getParcelable("data") : null);
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$b */
    public static final class C92665b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiSyncLoaderIPC f266693d;

        /* renamed from: e */
        public final /* synthetic */ C92668a.C92678k f266694e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92665b(EmojiSyncLoaderIPC emojiSyncLoaderIPC, C92668a.C92678k kVar) {
            super(0);
            this.f266693d = emojiSyncLoaderIPC;
            this.f266694e = kVar;
        }

        public Object invoke() {
            if (!this.f266693d.f266686f.contains(this.f266694e)) {
                this.f266693d.f266686f.add(this.f266694e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$c */
    public static final class C92666c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiSyncLoaderIPC f266695d;

        /* renamed from: e */
        public final /* synthetic */ C92668a.C92678k f266696e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92666c(EmojiSyncLoaderIPC emojiSyncLoaderIPC, C92668a.C92678k kVar) {
            super(0);
            this.f266695d = emojiSyncLoaderIPC;
            this.f266696e = kVar;
        }

        public Object invoke() {
            this.f266695d.f266686f.remove(this.f266696e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$d */
    public static final class C92667d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiSyncLoaderIPC f266697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92667d(EmojiSyncLoaderIPC emojiSyncLoaderIPC) {
            super(0);
            this.f266697d = emojiSyncLoaderIPC;
        }

        public Object invoke() {
            for (C92668a.C92678k a : this.f266697d.f266686f) {
                a.mo126716a(0);
            }
            return C13598b0.f38549a;
        }
    }

    public EmojiSyncLoaderIPC(int i) {
        this.f266681a = i;
        if (i == 1) {
            this.f266682b += "_capture";
        } else {
            this.f266682b += "_custom";
        }
        Bundle bundle = new Bundle();
        bundle.putInt("custom_type", i);
        C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C99512u.class, new C92664a(this));
    }

    /* renamed from: a */
    public void mo126699a() {
        Log.m105924i(this.f266682b, "loadMore: ");
        Bundle bundle = new Bundle();
        bundle.putInt("custom_type", this.f266681a);
        C80907o.m98783f(MMApplicationContext.getPackageName(), bundle, C99513v.class);
    }

    /* renamed from: b */
    public int mo126700b() {
        return this.f266684d;
    }

    /* renamed from: c */
    public int mo126701c() {
        return this.f266683c;
    }

    /* renamed from: d */
    public void mo126702d(boolean z) {
    }

    public void destroy() {
    }

    /* renamed from: e */
    public void mo126704e(C92668a.C92678k kVar) {
        C87412m.m108594g(kVar, "callback");
        C61926c.m72668M(new C92666c(this, kVar));
    }

    /* renamed from: f */
    public void mo126705f(C92668a.C92678k kVar) {
        C87412m.m108594g(kVar, "callback");
        C61926c.m72668M(new C92665b(this, kVar));
    }

    /* renamed from: g */
    public final void mo126706g(EmojiSyncData emojiSyncData) {
        String str = this.f266682b;
        StringBuilder sb = new StringBuilder();
        sb.append("updateData: ");
        sb.append(emojiSyncData != null ? Integer.valueOf(emojiSyncData.f266689f) : null);
        Log.m105924i(str, sb.toString());
        if (emojiSyncData != null) {
            this.f266683c = emojiSyncData.f266689f;
            this.f266684d = emojiSyncData.f266690g;
            this.f266685e = emojiSyncData.f266691h;
            C61926c.m72668M(new C92667d(this));
        }
    }

    public boolean hasMore() {
        return !this.f266685e;
    }

    public void init() {
    }
}
