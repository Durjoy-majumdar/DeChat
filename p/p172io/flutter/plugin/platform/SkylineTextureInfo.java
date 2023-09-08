package p172io.flutter.plugin.platform;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u001f"}, mo182094d2 = {"Lio/flutter/plugin/platform/SkylineTextureInfo;", "", "id", "", "type", "", "width", "height", "(ILjava/lang/String;II)V", "getHeight", "()I", "setHeight", "(I)V", "getId", "setId", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0}, mo182098xi = 48)
/* renamed from: io.flutter.plugin.platform.SkylineTextureInfo */
public final class SkylineTextureInfo {
    private int height;

    /* renamed from: id */
    private int f254131id;
    private String type;
    private int width;

    public SkylineTextureInfo(int i, String str, int i2, int i3) {
        this.f254131id = i;
        this.type = str;
        this.width = i2;
        this.height = i3;
    }

    public static /* synthetic */ SkylineTextureInfo copy$default(SkylineTextureInfo skylineTextureInfo, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = skylineTextureInfo.f254131id;
        }
        if ((i4 & 2) != 0) {
            str = skylineTextureInfo.type;
        }
        if ((i4 & 4) != 0) {
            i2 = skylineTextureInfo.width;
        }
        if ((i4 & 8) != 0) {
            i3 = skylineTextureInfo.height;
        }
        return skylineTextureInfo.copy(i, str, i2, i3);
    }

    public final int component1() {
        return this.f254131id;
    }

    public final String component2() {
        return this.type;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final SkylineTextureInfo copy(int i, String str, int i2, int i3) {
        return new SkylineTextureInfo(i, str, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylineTextureInfo)) {
            return false;
        }
        SkylineTextureInfo skylineTextureInfo = (SkylineTextureInfo) obj;
        return this.f254131id == skylineTextureInfo.f254131id && C87412m.m108589b(this.type, skylineTextureInfo.type) && this.width == skylineTextureInfo.width && this.height == skylineTextureInfo.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.f254131id;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = this.f254131id * 31;
        String str = this.type;
        return ((((i + (str == null ? 0 : str.hashCode())) * 31) + this.width) * 31) + this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setId(int i) {
        this.f254131id = i;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "SkylineTextureInfo(id=" + this.f254131id + ", type=" + this.type + ", width=" + this.width + ", height=" + this.height + ')';
    }
}
