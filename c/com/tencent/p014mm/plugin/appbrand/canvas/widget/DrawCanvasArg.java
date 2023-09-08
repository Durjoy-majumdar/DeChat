package com.tencent.p014mm.plugin.appbrand.canvas.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg */
public class DrawCanvasArg implements Parcelable {
    public static final Parcelable.Creator<DrawCanvasArg> CREATOR = new C81601a();

    /* renamed from: d */
    public boolean f239266d;

    /* renamed from: e */
    public String f239267e;

    /* renamed from: f */
    public List<DrawActionWrapper> f239268f = new ArrayList();

    /* renamed from: g */
    public long f239269g;

    /* renamed from: h */
    public boolean f239270h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg$a */
    public class C81601a implements Parcelable.Creator<DrawCanvasArg> {
        public Object createFromParcel(Parcel parcel) {
            return new DrawCanvasArg(parcel);
        }

        public Object[] newArray(int i) {
            return new DrawCanvasArg[i];
        }
    }

    public DrawCanvasArg() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239266d ? 1 : 0);
        parcel.writeString(this.f239267e);
        parcel.writeList(this.f239268f);
        parcel.writeLong(this.f239269g);
        parcel.writeInt(this.f239270h ? 1 : 0);
    }

    public DrawCanvasArg(Parcel parcel) {
        boolean z = false;
        this.f239266d = parcel.readInt() == 1;
        this.f239267e = parcel.readString();
        this.f239268f = parcel.readArrayList(DrawCanvasArg.class.getClassLoader());
        this.f239269g = parcel.readLong();
        this.f239270h = parcel.readInt() == 1 ? true : z;
    }
}
