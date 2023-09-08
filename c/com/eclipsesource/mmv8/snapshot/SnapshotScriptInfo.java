package com.eclipsesource.mmv8.snapshot;

import java.util.Objects;

public final class SnapshotScriptInfo {
    public static final int INVALID_FD = -1;
    public final String content;

    /* renamed from: fd */
    public final int f234642fd;
    public long length;
    public final String name;
    public final long startOffset;

    public SnapshotScriptInfo(String str, int i, long j, long j2) {
        if (C80141Utils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("name is empty");
        } else if (!C80141Utils.isInvalidFd(i)) {
            this.name = str;
            this.f234642fd = i;
            this.startOffset = j;
            this.length = j2;
            this.content = null;
        } else {
            throw new IllegalArgumentException("fd is illegal");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SnapshotScriptInfo.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.name, ((SnapshotScriptInfo) obj).name);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SnapshotScriptInfo{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", fd=");
        sb.append(this.f234642fd);
        sb.append(", startOffset=");
        sb.append(this.startOffset);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", content='");
        String str = this.content;
        sb.append(str != null ? str.substring(0, Math.min(str.length(), 1024)) : null);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public SnapshotScriptInfo(String str, String str2) {
        if (C80141Utils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("name is empty");
        } else if (!C80141Utils.isNullOrEmpty(str2)) {
            this.name = str;
            this.f234642fd = -1;
            this.startOffset = 0;
            this.length = 0;
            this.content = str2;
        } else {
            throw new IllegalArgumentException("content is empty");
        }
    }
}
