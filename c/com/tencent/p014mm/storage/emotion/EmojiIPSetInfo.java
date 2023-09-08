package com.tencent.p014mm.storage.emotion;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p749xh.C38695x1;
import te3.C50367m80;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/storage/emotion/EmojiIPSetInfo;", "Lxh/x1;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.storage.emotion.EmojiIPSetInfo */
public final class EmojiIPSetInfo extends C38695x1 implements Parcelable {
    public static final Parcelable.Creator<EmojiIPSetInfo> CREATOR = new C30734a();

    /* renamed from: v */
    public static final C30735b f82658v = new C30735b((C8480h) null);

    /* renamed from: w */
    public static final IAutoDBItem.MAutoDBInfo f82659w = C38695x1.initAutoDBInfo(EmojiIPSetInfo.class);

    /* renamed from: com.tencent.mm.storage.emotion.EmojiIPSetInfo$a */
    public static final class C30734a implements Parcelable.Creator<EmojiIPSetInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            EmojiIPSetInfo emojiIPSetInfo = new EmojiIPSetInfo();
            emojiIPSetInfo.field_key = parcel.readString();
            emojiIPSetInfo.field_title = parcel.readString();
            emojiIPSetInfo.field_desc = parcel.readString();
            emojiIPSetInfo.field_iconUrl = parcel.readString();
            emojiIPSetInfo.field_panelUrl = parcel.readString();
            return emojiIPSetInfo;
        }

        public Object[] newArray(int i) {
            return new EmojiIPSetInfo[i];
        }
    }

    /* renamed from: com.tencent.mm.storage.emotion.EmojiIPSetInfo$b */
    public static final class C30735b {
        public C30735b(C8480h hVar) {
        }

        /* renamed from: a */
        public final EmojiIPSetInfo mo57636a(C50367m80 m802) {
            C87412m.m108594g(m802, "pb");
            EmojiIPSetInfo emojiIPSetInfo = new EmojiIPSetInfo();
            emojiIPSetInfo.field_key = m802.f137902g;
            emojiIPSetInfo.field_title = m802.f137899d;
            emojiIPSetInfo.field_desc = m802.f137900e;
            emojiIPSetInfo.field_iconUrl = m802.f137901f;
            emojiIPSetInfo.field_panelUrl = m802.f137903h;
            return emojiIPSetInfo;
        }
    }

    public int describeContents() {
        return 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f82659w;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.field_key);
        parcel.writeString(this.field_title);
        parcel.writeString(this.field_desc);
        parcel.writeString(this.field_iconUrl);
        parcel.writeString(this.field_panelUrl);
    }
}
