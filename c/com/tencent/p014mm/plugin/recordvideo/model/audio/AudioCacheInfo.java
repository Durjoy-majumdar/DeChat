package com.tencent.p014mm.plugin.recordvideo.model.audio;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import hi2.C98453h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jh2.C9434j;
import kotlin.Metadata;
import te3.C64839xt2;
import te3.C64866yt2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "Landroid/os/Parcelable;", "Ljh2/j;", "<init>", "()V", "b", "c", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo */
public final class AudioCacheInfo implements Parcelable, C9434j {

    /* renamed from: A */
    public static final C57169b f163811A = new C57169b((C8480h) null);
    public static final Parcelable.Creator<AudioCacheInfo> CREATOR = new C57168a();

    /* renamed from: d */
    public C64839xt2 f163812d = new C64839xt2();

    /* renamed from: e */
    public int f163813e;

    /* renamed from: f */
    public String f163814f;

    /* renamed from: g */
    public ArrayList<C57170c> f163815g;

    /* renamed from: h */
    public ArrayList<String> f163816h = new ArrayList<>();

    /* renamed from: i */
    public String f163817i;

    /* renamed from: j */
    public boolean f163818j;

    /* renamed from: n */
    public boolean f163819n;

    /* renamed from: o */
    public int f163820o;

    /* renamed from: p */
    public int f163821p;

    /* renamed from: q */
    public int f163822q;

    /* renamed from: r */
    public boolean f163823r = true;

    /* renamed from: s */
    public boolean f163824s;

    /* renamed from: t */
    public String f163825t = "";

    /* renamed from: u */
    public String f163826u = "";

    /* renamed from: v */
    public String f163827v = "";

    /* renamed from: w */
    public int f163828w = -1;

    /* renamed from: x */
    public long f163829x = -1;

    /* renamed from: y */
    public FinderObject f163830y;

    /* renamed from: z */
    public boolean f163831z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo$a */
    public static final class C57168a implements Parcelable.Creator<AudioCacheInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            AudioCacheInfo audioCacheInfo = new AudioCacheInfo();
            audioCacheInfo.f163813e = parcel.readInt();
            audioCacheInfo.f163814f = parcel.readString();
            audioCacheInfo.f163817i = parcel.readString();
            audioCacheInfo.f163818j = parcel.readByte() != 0;
            audioCacheInfo.f163819n = parcel.readByte() != 0;
            audioCacheInfo.f163828w = parcel.readInt();
            audioCacheInfo.f163829x = parcel.readLong();
            audioCacheInfo.f163820o = parcel.readInt();
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            audioCacheInfo.f163825t = readString;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                readString2 = "";
            }
            audioCacheInfo.f163826u = readString2;
            String readString3 = parcel.readString();
            if (readString3 == null) {
                readString3 = "";
            }
            audioCacheInfo.f163827v = readString3;
            C64839xt2 xt22 = audioCacheInfo.f163812d;
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray != null) {
                try {
                    xt22.parseFrom(createByteArray);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            return audioCacheInfo;
        }

        public Object[] newArray(int i) {
            return new AudioCacheInfo[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo$b */
    public static final class C57169b {
        public C57169b(C8480h hVar) {
        }

        /* renamed from: a */
        public final AudioCacheInfo mo80747a(C64839xt2 xt22, int i) {
            boolean z;
            String str;
            C87412m.m108594g(xt22, "info");
            AudioCacheInfo audioCacheInfo = new AudioCacheInfo();
            audioCacheInfo.f163812d = xt22;
            audioCacheInfo.f163813e = xt22.f186384d;
            audioCacheInfo.f163814f = xt22.f186387g;
            ArrayList<C57170c> arrayList = new ArrayList<>();
            LinkedList<C64866yt2> linkedList = xt22.f186391n;
            C87412m.m108593f(linkedList, "info.lyrics");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                C64866yt2 yt22 = (C64866yt2) it.next();
                if (!Util.isNullOrNil(yt22.f186603e)) {
                    String str2 = yt22.f186603e;
                    C87412m.m108593f(str2, "it.lyrics_content");
                    int i2 = yt22.f186602d;
                    C57170c cVar = new C57170c(str2, i2, i2);
                    if (!Util.isNullOrNil((List) arrayList)) {
                        arrayList.get(arrayList.size() - 1).f163834c = yt22.f186602d;
                    }
                    arrayList.add(cVar);
                }
            }
            if (Util.isNullOrNil((List) arrayList)) {
                String string = MMApplicationContext.getResources().getString(C0966R.string.h37);
                C87412m.m108593f(string, "getResources().getString…ring.music_no_lyrics_tip)");
                arrayList.add(new C57170c(string, 0, 0));
            }
            audioCacheInfo.f163816h.addAll(xt22.f186390j);
            audioCacheInfo.f163815g = arrayList;
            C98453h hVar = C98453h.f288774a;
            StringBuilder sb = new StringBuilder();
            sb.append(xt22.f186384d);
            sb.append('_');
            sb.append(C31543z5.m39453c());
            String sb4 = sb.toString();
            if (sb4 == null) {
                str = "";
            } else {
                StringBuilder sb5 = new StringBuilder();
                String str3 = C98453h.f288776c;
                sb5.append(str3 + sb4 + ".p");
                sb5.append(".mixa");
                str = sb5.toString();
            }
            audioCacheInfo.f163817i = str;
            audioCacheInfo.f163818j = C86013q1.m106451l(str) > 0;
            audioCacheInfo.f163819n = false;
            String str4 = xt22.f186389i;
            C87412m.m108593f(str4, "info.song_name");
            audioCacheInfo.f163825t = str4;
            audioCacheInfo.f163820o = i;
            audioCacheInfo.f163822q = xt22.f186396s;
            if (xt22.f186397t != 1) {
                z = false;
            }
            audioCacheInfo.f163823r = z;
            Log.m105924i("MicroMsg.AudioCacheInfo", "LogStory: " + audioCacheInfo.f163813e + ' ' + audioCacheInfo.f163815g);
            return audioCacheInfo;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo$c */
    public static final class C57170c {

        /* renamed from: a */
        public String f163832a;

        /* renamed from: b */
        public int f163833b;

        /* renamed from: c */
        public int f163834c;

        public C57170c(String str, int i, int i2) {
            C87412m.m108594g(str, "lrc");
            this.f163832a = str;
            this.f163833b = i;
            this.f163834c = i2;
        }
    }

    /* renamed from: a */
    public void mo10146a(String str) {
        this.f163817i = str;
    }

    /* renamed from: b */
    public void mo10147b(int i) {
        this.f163813e = i;
    }

    /* renamed from: c */
    public void mo10148c(String str) {
        this.f163814f = str;
    }

    /* renamed from: d */
    public final int mo80741d() {
        return this.f163822q;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g0 */
    public String mo10149g0() {
        return this.f163817i;
    }

    public String toString() {
        return "AudioCacheInfo(musicId=" + this.f163813e + ", musicUrl=" + this.f163814f + ", lyricsList=" + this.f163815g + ", cachePath=" + this.f163817i + ", cached=" + this.f163818j + ", failed=" + this.f163819n + ", type=" + this.f163820o + ", songName='" + this.f163825t + "', position=" + this.f163828w + ", request_id=" + this.f163829x + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f163813e);
        parcel.writeString(this.f163814f);
        parcel.writeString(this.f163817i);
        parcel.writeByte(this.f163818j ? (byte) 1 : 0);
        parcel.writeByte(this.f163819n ? (byte) 1 : 0);
        parcel.writeInt(this.f163828w);
        parcel.writeLong(this.f163829x);
        parcel.writeInt(this.f163820o);
        parcel.writeString(this.f163825t);
        parcel.writeString(this.f163826u);
        parcel.writeString(this.f163827v);
        parcel.writeByteArray(this.f163812d.toByteArray());
    }
}
