package com.tencent.p014mm.plugin.game.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.game.api.GameInputConfig */
public class GameInputConfig implements Parcelable {
    public static final Parcelable.Creator<GameInputConfig> CREATOR = new C41678a();
    public String atContentId;
    public String atContext;
    public int atLimit;
    public boolean canSendWithoutText = false;
    public boolean canShowAtSomeoneView = false;
    public String contentText;
    public String emoticonBoardViewType;
    public boolean forceClearContent = false;
    public int forceUserInterfaceStyle;
    public boolean hideImgBtn;
    public String identifier;
    public boolean isToolsProcess = true;
    public int maxInputCharsCo = 1000;
    public int maxInputCharsCount = 1000;
    public String quickEmojiList;
    public String returnKeyType = "send";
    public boolean showEmojiQuickInputView;
    public boolean stickBtmIfNonEmpty = false;
    public String textPlaceHolder;

    /* renamed from: com.tencent.mm.plugin.game.api.GameInputConfig$a */
    public class C41678a implements Parcelable.Creator<GameInputConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new GameInputConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new GameInputConfig[i];
        }
    }

    public GameInputConfig() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textPlaceHolder);
        parcel.writeString(this.emoticonBoardViewType);
        parcel.writeString(this.contentText);
        parcel.writeInt(this.stickBtmIfNonEmpty ? 1 : 0);
        parcel.writeInt(this.forceClearContent ? 1 : 0);
        parcel.writeInt(this.maxInputCharsCo);
        parcel.writeInt(this.canSendWithoutText ? 1 : 0);
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isToolsProcess ? 1 : 0);
        parcel.writeInt(this.hideImgBtn ? 1 : 0);
        parcel.writeInt(this.forceUserInterfaceStyle);
        parcel.writeInt(this.showEmojiQuickInputView ? 1 : 0);
        parcel.writeString(this.quickEmojiList);
        parcel.writeInt(this.maxInputCharsCount);
        parcel.writeString(this.returnKeyType);
        parcel.writeInt(this.canShowAtSomeoneView ? 1 : 0);
        parcel.writeString(this.atContentId);
        parcel.writeString(this.atContext);
        parcel.writeInt(this.atLimit);
    }

    public GameInputConfig(Parcel parcel) {
        boolean z = false;
        this.textPlaceHolder = parcel.readString();
        this.emoticonBoardViewType = parcel.readString();
        this.contentText = parcel.readString();
        this.stickBtmIfNonEmpty = parcel.readInt() == 1;
        this.forceClearContent = parcel.readInt() == 1;
        this.maxInputCharsCo = parcel.readInt();
        this.canSendWithoutText = parcel.readInt() == 1;
        this.identifier = parcel.readString();
        this.isToolsProcess = parcel.readInt() == 1;
        this.hideImgBtn = parcel.readInt() == 1;
        this.forceUserInterfaceStyle = parcel.readInt();
        this.showEmojiQuickInputView = parcel.readInt() == 1;
        this.quickEmojiList = parcel.readString();
        this.maxInputCharsCount = parcel.readInt();
        this.returnKeyType = parcel.readString();
        this.canShowAtSomeoneView = parcel.readInt() == 1 ? true : z;
        this.atContentId = parcel.readString();
        this.atContext = parcel.readString();
        this.atLimit = parcel.readInt();
    }
}
