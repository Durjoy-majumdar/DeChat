package com.tencent.map.lib.models;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class IndoorCellInfo {
    private List<String> areaIds = new ArrayList();
    private Style style;

    public static class Style {
        private int color;

        public Style(int i) {
            this.color = i;
        }

        public int getColor() {
            return this.color;
        }

        public void setColor(int i) {
            this.color = i;
        }

        public String toString() {
            return "Style{color=" + Integer.toHexString(this.color) + '}';
        }
    }

    public IndoorCellInfo(Style style2) {
        this.style = style2;
    }

    public final void addAreaId(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.areaIds.add(str);
        }
    }

    public final List<String> getAreaIds() {
        return this.areaIds;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final void setStyle(Style style2) {
        this.style = style2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndoorCellInfo{areaIds=");
        sb.append(this.areaIds);
        sb.append(", style=");
        Style style2 = this.style;
        sb.append(style2 != null ? style2.toString() : "null");
        sb.append('}');
        return sb.toString();
    }
}
