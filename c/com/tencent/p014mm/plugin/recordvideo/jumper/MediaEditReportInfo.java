package com.tencent.p014mm.plugin.recordvideo.jumper;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo */
public class MediaEditReportInfo implements Parcelable {
    public static final Parcelable.Creator<MediaEditReportInfo> CREATOR = new C105940a();
    public int cropSizeCnt;
    public ArrayList<EditItem> editList = new ArrayList<>();
    public int seekBarDragCnt;

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem */
    public static class EditItem implements Parcelable {
        public static final Parcelable.Creator<EditItem> CREATOR = new C105939a();
        public int clickEditCount;
        public int dragCount;
        public int durationCutCount;
        public int durationScrollCount;
        public boolean isBeauty;
        public long originDuration;
        public int scaleCount;
        public long targetDuration;
        public int type;

        /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem$a */
        public class C105939a implements Parcelable.Creator<EditItem> {
            public Object createFromParcel(Parcel parcel) {
                return new EditItem(parcel);
            }

            public Object[] newArray(int i) {
                return new EditItem[i];
            }
        }

        public EditItem() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeInt(this.isBeauty ? 1 : 0);
            parcel.writeLong(this.originDuration);
            parcel.writeLong(this.targetDuration);
            parcel.writeInt(this.clickEditCount);
            parcel.writeInt(this.durationCutCount);
            parcel.writeInt(this.durationScrollCount);
            parcel.writeInt(this.dragCount);
            parcel.writeInt(this.scaleCount);
        }

        public EditItem(Parcel parcel) {
            this.type = parcel.readInt();
            this.isBeauty = parcel.readInt() != 0;
            this.originDuration = parcel.readLong();
            this.targetDuration = parcel.readLong();
            this.clickEditCount = parcel.readInt();
            this.durationCutCount = parcel.readInt();
            this.durationScrollCount = parcel.readInt();
            this.dragCount = parcel.readInt();
            this.scaleCount = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$a */
    public class C105940a implements Parcelable.Creator<MediaEditReportInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaEditReportInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new MediaEditReportInfo[i];
        }
    }

    public MediaEditReportInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.seekBarDragCnt);
        parcel.writeInt(this.cropSizeCnt);
        parcel.writeList(this.editList);
    }

    public MediaEditReportInfo(Parcel parcel) {
        this.seekBarDragCnt = parcel.readInt();
        this.cropSizeCnt = parcel.readInt();
        parcel.readList(this.editList, EditItem.class.getClassLoader());
    }
}
