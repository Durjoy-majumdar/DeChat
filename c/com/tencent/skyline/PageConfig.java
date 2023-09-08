package com.tencent.skyline;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/skyline/PageConfig;", "", "backgroundColorContent", "", "(I)V", "getBackgroundColorContent", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0}, mo182098xi = 48)
public final class PageConfig {
    private final int backgroundColorContent;

    public PageConfig(int i) {
        this.backgroundColorContent = i;
    }

    public static /* synthetic */ PageConfig copy$default(PageConfig pageConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pageConfig.backgroundColorContent;
        }
        return pageConfig.copy(i);
    }

    public final int component1() {
        return this.backgroundColorContent;
    }

    public final PageConfig copy(int i) {
        return new PageConfig(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageConfig) && this.backgroundColorContent == ((PageConfig) obj).backgroundColorContent;
    }

    public final int getBackgroundColorContent() {
        return this.backgroundColorContent;
    }

    public int hashCode() {
        return this.backgroundColorContent;
    }

    public String toString() {
        return "PageConfig(backgroundColorContent=" + this.backgroundColorContent + ')';
    }
}
