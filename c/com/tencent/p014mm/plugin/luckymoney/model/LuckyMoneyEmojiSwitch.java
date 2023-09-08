package com.tencent.p014mm.plugin.luckymoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch */
public class LuckyMoneyEmojiSwitch implements Parcelable {
    public static final Parcelable.Creator<LuckyMoneyEmojiSwitch> CREATOR = new C69156a();

    /* renamed from: d */
    public int f198929d = 0;

    /* renamed from: e */
    public int f198930e = 0;

    /* renamed from: f */
    public int f198931f = 0;

    /* renamed from: g */
    public int f198932g = 0;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch$a */
    public class C69156a implements Parcelable.Creator<LuckyMoneyEmojiSwitch> {
        public Object createFromParcel(Parcel parcel) {
            return new LuckyMoneyEmojiSwitch(parcel);
        }

        public Object[] newArray(int i) {
            return new LuckyMoneyEmojiSwitch[i];
        }
    }

    public LuckyMoneyEmojiSwitch() {
    }

    /* renamed from: a */
    public static LuckyMoneyEmojiSwitch m81491a(JSONObject jSONObject) {
        LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new LuckyMoneyEmojiSwitch();
        luckyMoneyEmojiSwitch.f198929d = jSONObject.optInt("showOpenNormalExpression", 0);
        luckyMoneyEmojiSwitch.f198930e = jSONObject.optInt("showDetailNormalExpression", 0);
        luckyMoneyEmojiSwitch.f198931f = jSONObject.optInt("enableAnswerByExpression", 0);
        luckyMoneyEmojiSwitch.f198932g = jSONObject.optInt("enableAnswerBySelfie", 0);
        return luckyMoneyEmojiSwitch;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "LuckyMoneyEmojiSwitch{showOpenNormalExpression=" + this.f198929d + ", showDetailNormalExpression=" + this.f198930e + ", enalbeAnswerByExpression=" + this.f198931f + ", enableAnswerBySelfie=" + this.f198932g + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f198929d);
        parcel.writeInt(this.f198930e);
        parcel.writeInt(this.f198931f);
        parcel.writeInt(this.f198932g);
    }

    public LuckyMoneyEmojiSwitch(Parcel parcel) {
        this.f198929d = parcel.readInt();
        this.f198930e = parcel.readInt();
        this.f198931f = parcel.readInt();
        this.f198932g = parcel.readInt();
    }
}
