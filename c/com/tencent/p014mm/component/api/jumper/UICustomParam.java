package com.tencent.p014mm.component.api.jumper;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.component.api.jumper.UICustomParam */
public class UICustomParam implements Parcelable {
    public static final Parcelable.Creator<UICustomParam> CREATOR = new C92616a();

    /* renamed from: d */
    public float f266571d;

    /* renamed from: e */
    public float f266572e;

    /* renamed from: f */
    public float f266573f;

    /* renamed from: g */
    public float f266574g;

    /* renamed from: h */
    public Map<String, Boolean> f266575h;

    /* renamed from: i */
    public int f266576i;

    /* renamed from: j */
    public int f266577j;

    /* renamed from: n */
    public int f266578n;

    /* renamed from: o */
    public String f266579o;

    /* renamed from: p */
    public String f266580p;

    /* renamed from: q */
    public int f266581q;

    /* renamed from: r */
    public float f266582r;

    /* renamed from: s */
    public int f266583s;

    /* renamed from: t */
    public int f266584t;

    /* renamed from: u */
    public int f266585u;

    /* renamed from: v */
    public float f266586v;

    /* renamed from: com.tencent.mm.component.api.jumper.UICustomParam$a */
    public class C92616a implements Parcelable.Creator<UICustomParam> {
        public Object createFromParcel(Parcel parcel) {
            return new UICustomParam(parcel);
        }

        public Object[] newArray(int i) {
            return new UICustomParam[i];
        }
    }

    /* renamed from: com.tencent.mm.component.api.jumper.UICustomParam$b */
    public static class C92617b {

        /* renamed from: a */
        public UICustomParam f266587a;

        public C92617b() {
            UICustomParam uICustomParam = new UICustomParam();
            this.f266587a = uICustomParam;
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
        }

        /* renamed from: a */
        public C92617b mo126647a(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_emoji", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: b */
        public C92617b mo126648b(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_filter", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: c */
        public C92617b mo126649c(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_menu", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: d */
        public C92617b mo126650d(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_music", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: e */
        public C92617b mo126651e(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_poi", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: f */
        public C92617b mo126652f(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_text", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: g */
        public C92617b mo126653g(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_tip", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: h */
        public C92617b mo126654h(boolean z) {
            ((HashMap) this.f266587a.f266575h).put("plugin_video_crop", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: i */
        public C92617b mo126655i(int i, int i2, String str, int i3) {
            UICustomParam uICustomParam = this.f266587a;
            uICustomParam.f266576i = i;
            uICustomParam.f266577j = i2;
            uICustomParam.f266579o = str;
            uICustomParam.f266578n = i3;
            return this;
        }
    }

    public UICustomParam() {
        this.f266571d = 0.0f;
        this.f266572e = 0.0f;
        this.f266573f = 0.0f;
        this.f266574g = 0.0f;
        this.f266576i = 0;
        this.f266577j = 0;
        this.f266578n = 0;
        this.f266579o = "";
        this.f266580p = "";
        this.f266581q = 0;
        this.f266582r = 0.0f;
        this.f266583s = 0;
        this.f266584t = -1;
        this.f266585u = -1;
        this.f266586v = -1.0f;
        this.f266575h = new HashMap();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f266571d);
        parcel.writeFloat(this.f266572e);
        parcel.writeFloat(this.f266573f);
        parcel.writeFloat(this.f266574g);
        parcel.writeInt(this.f266575h.size());
        for (Map.Entry next : this.f266575h.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeValue(next.getValue());
        }
        parcel.writeInt(this.f266576i);
        parcel.writeInt(this.f266577j);
        parcel.writeInt(this.f266578n);
        parcel.writeString(this.f266579o);
        parcel.writeString(this.f266580p);
        parcel.writeInt(this.f266581q);
        parcel.writeFloat(this.f266582r);
        parcel.writeInt(this.f266583s);
        parcel.writeInt(this.f266584t);
        parcel.writeInt(this.f266585u);
        parcel.writeFloat(this.f266586v);
    }

    public UICustomParam(Parcel parcel) {
        this.f266571d = 0.0f;
        this.f266572e = 0.0f;
        this.f266573f = 0.0f;
        this.f266574g = 0.0f;
        this.f266576i = 0;
        this.f266577j = 0;
        this.f266578n = 0;
        this.f266579o = "";
        this.f266580p = "";
        this.f266581q = 0;
        this.f266582r = 0.0f;
        this.f266583s = 0;
        this.f266584t = -1;
        this.f266585u = -1;
        this.f266586v = -1.0f;
        this.f266571d = parcel.readFloat();
        this.f266572e = parcel.readFloat();
        this.f266573f = parcel.readFloat();
        this.f266574g = parcel.readFloat();
        int readInt = parcel.readInt();
        this.f266575h = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f266575h.put(parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        }
        this.f266576i = parcel.readInt();
        this.f266577j = parcel.readInt();
        this.f266578n = parcel.readInt();
        this.f266579o = parcel.readString();
        this.f266580p = parcel.readString();
        this.f266581q = parcel.readInt();
        this.f266582r = parcel.readFloat();
        this.f266583s = parcel.readInt();
        this.f266584t = parcel.readInt();
        this.f266585u = parcel.readInt();
        this.f266586v = parcel.readFloat();
    }
}
