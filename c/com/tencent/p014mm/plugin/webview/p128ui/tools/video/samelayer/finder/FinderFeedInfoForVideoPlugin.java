package com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/FinderFeedInfoForVideoPlugin;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin */
public final class FinderFeedInfoForVideoPlugin implements Parcelable {
    public static final C57518a CREATOR = new C57518a((C8480h) null);

    /* renamed from: d */
    public String f164761d = "";

    /* renamed from: e */
    public boolean f164762e;

    /* renamed from: f */
    public boolean f164763f;

    /* renamed from: g */
    public int f164764g;

    /* renamed from: h */
    public int f164765h;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin$a */
    public static final class C57518a implements Parcelable.Creator<FinderFeedInfoForVideoPlugin> {
        public C57518a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin = new FinderFeedInfoForVideoPlugin();
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            finderFeedInfoForVideoPlugin.f164761d = readString;
            boolean z = true;
            finderFeedInfoForVideoPlugin.f164762e = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            finderFeedInfoForVideoPlugin.f164763f = z;
            finderFeedInfoForVideoPlugin.f164764g = parcel.readInt();
            finderFeedInfoForVideoPlugin.f164765h = parcel.readInt();
            return finderFeedInfoForVideoPlugin;
        }

        public Object[] newArray(int i) {
            return new FinderFeedInfoForVideoPlugin[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String format = String.format("FinderFeedInfoForVideoPlugin{id: " + this.f164761d + ", isLike: " + this.f164762e + ", isFav: " + this.f164763f + ", likeCount: " + this.f164764g + ", favCount: " + this.f164765h + '}', Arrays.copyOf(new Object[0], 0));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f164761d);
        parcel.writeByte(this.f164762e ? (byte) 1 : 0);
        parcel.writeByte(this.f164763f ? (byte) 1 : 0);
        parcel.writeInt(this.f164764g);
        parcel.writeInt(this.f164765h);
    }
}
